package kr.inhatc.spring.engine;

import java.util.*;

public class test {
    public static void main(String[] args) {
        InfoCollector infoCollector = new InfoCollector(System.getProperty("user.home"), "\\testCode.java");
        ArrayList<String> classCollection = InfoCollector.classCollector(InfoCollector.preconvFileContents);
        ArrayList<String> functionCollection = InfoCollector.functionCollector(InfoCollector.preconvFileContents);
        ArrayList<String> enumCollection = InfoCollector.enumCollector(InfoCollector.preconvFileContents);
        ArrayList<String> variableCollection = InfoCollector.variableCollector(InfoCollector.preconvFileContents);
        ArrayList<HashMap<String,Object>> classInfo = new ArrayList<>();
        for(String className : classCollection){
            String classBody = SeparatorCalc.calc(InfoCollector.preconvFileContents, className);
            HashMap<String, Object> _classInfo = new HashMap<>();
            _classInfo.put(className,classBody);
            classInfo.add(_classInfo);
        }
        /**
         * [
         *      { ClassName1 : [functionName1, functionName2, ...] },
         *      { ClassName2 : [functionName1, functionName2, ...] },
         *      ...
         * ]
          */
        ArrayList<HashMap<String,ArrayList<String>>> classFuntionList = new ArrayList<>();
        for(HashMap<String,Object> hashMap : classInfo){
            HashMap<String, ArrayList<String>> classFunctionMap = new HashMap<>();
            for(String className : hashMap.keySet()){
                String classBody = (String)hashMap.get(className);
                classFunctionMap.put(className, InfoCollector.functionCollector(classBody));
            }
            classFuntionList.add(classFunctionMap);
        }
        for(HashMap<String, ArrayList<String>> hashMap : classFuntionList){
            for (ArrayList<String> arrayList : hashMap.values()){
                
            }
        }
    }
}
