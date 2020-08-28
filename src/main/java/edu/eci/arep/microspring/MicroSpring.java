package edu.eci.arep.microspring;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MicroSpring {
    private Map<String,Method> beans = new HashMap<>();
    public void start(String[] args) throws Exception {
        int mapped=0;
        for (Method m : Class.forName(args[0]).getMethods()) {
            if (m.isAnnotationPresent(RequestMapping.class)) {
                try{
                    beans.put(m.getAnnotation(RequestMapping.class).value(),m);
                    mapped ++;
                }catch (Throwable ex){
                    ex.printStackTrace();
                }
            }
        }
    }
    public String invoke(String path){
        try {
            return beans.get(path).invoke(null).toString();
        } catch (Exception e) {
            Logger.getLogger(MicroSpringBoot.class.getName()).log(Level.SEVERE, null, e);
        }
        return "Error";
    }



}
