package io.swagger.api.impl;

import io.swagger.api.impl.*;

import java.util.ArrayList;
import java.util.List;

public class server{
    
    private List<Estancia> estancias;
    private List<pairUserTempIdeal> userTempList;
    private static server instance;
    
    private server(){
        //Adding some entries to the server
        userTempList = new ArrayList<>();
        estancias = new ArrayList<>();

        userTempList.add(new pairUserTempIdeal("user_001", 25));
        userTempList.add(new pairUserTempIdeal("user_002", 26));
        userTempList.add(new pairUserTempIdeal("user_003", 24));
        userTempList.add(new pairUserTempIdeal("user_004", 24));
        userTempList.add(new pairUserTempIdeal("user_005", 24));
        userTempList.add(new pairUserTempIdeal("user_006", 26));
        userTempList.add(new pairUserTempIdeal("user_007", 25));

        List<String> users1 = new ArrayList<>();
        users1.add("user_001");
        users1.add("user_003");
        users1.add("user_006");
        estancias.add(new Estancia("e_001", "no", 23, false, users1, 0));

        List<String> users2 = new ArrayList<>();
        users2.add("user_002");
        users2.add("user_004");
        users2.add("user_005");
        estancias.add(new Estancia("e_002", "no", 24, false, users2, 0));

        List<String> users3 = new ArrayList<>();
        users3.add("user_007");
        estancias.add(new Estancia("e_003", "no", 23, false, users3, 0));

        List<String> users4 = new ArrayList<>();
        estancias.add(new Estancia("e_004", "no", 24, false, users4, 0));
    }
    
    public static server getInstance(){
        if(instance == null){
            instance = new server();
        }
        return instance;
    }

    public void uploadEstancia (Estancia e){
        boolean flag = false;

        for (int i = 0; i < estancias.size() && !flag; i++) {
            if(estancias.get(i).getId().equals(e.getId())){
                estancias.remove(i);
                estancias.add(e);
                flag=true;
            }
        }
    }

    public Estancia devolverEstancia(String id){
        Estancia e =  null;
        boolean flag = false;

        for (int i = 0; i < estancias.size() && !flag; i++) {
            if(estancias.get(i).getId().equals(id)){
                e = estancias.get(i);
                flag=true;
            }
        }

        return e;

    }

    public String changeTemp (String id){
        Estancia e = devolverEstancia(id);
        String res = "";

        if(e != null){

            if (e.getUsers().size() != 0){
                res = "yes";
            }else{
                res = "no";
            }

            e.setChange(res);
            uploadEstancia(e);

        }else{
            System.out.println("algo salió mal");
        }

        return res;
    }

    public float calcularTemp(String id){
        Estancia e = devolverEstancia(id);
        float newTemp=0;

        if(e == null){
            System.out.println("algo salió mal");
        }

        if(e.getUsers().size() == 1){
            newTemp = calcularTempByOne(e);

        }else if(e.getUsers().size() > 1){
            newTemp = calcularTempByGroup(e);
        }else{
            System.out.println("No hay usuarios en la estancia");
        }

        return newTemp;
    }


    private float calcularTempByOne(Estancia e){

        boolean flag = false;
        float newTemp=0;


        
        for (int i = 0; i < userTempList.size()&&!flag;i++) {
            if(userTempList.get(i).getUser().equals(e.getUsers().get(0))){
                    newTemp = userTempList.get(i).getTempIdeal();
                    flag = true;
            }
        }

        if(newTemp!=0){
            e.setNewTemp(newTemp);
            uploadEstancia(e);
            System.out.println("Nueva temperatura");
        }else{
            System.out.println("no se ha encontrado la estancia en el servidor");
        }

        return newTemp;
        
    }


    private float calcularTempByGroup(Estancia e){

        boolean flag = false;
        float newTemp=0;
        int cont=0;
        float res=0;

        
        for (int i = 0; i < userTempList.size()&&!flag;i++) {

            boolean flag2=false;
            for(int j =0; j<e.getUsers().size()&&!flag2;j++){
                if(userTempList.get(i).getUser().equals(e.getUsers().get(j))){
                    res = res + userTempList.get(i).getTempIdeal();
                    cont++;
                    flag2 = true;
                }
            }

            if(cont==e.getUsers().size()){
                newTemp=res/cont;
                flag=true;
            }
            
        }

        if(newTemp!=0){
            e.setNewTemp(newTemp);
            uploadEstancia(e);
            System.out.println("Nueva temperatura");
        }else{
            System.out.println("no se ha encontrado la estancia en el servidor");
        }

        return newTemp;
        
    }

}