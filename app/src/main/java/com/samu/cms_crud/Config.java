package com.samu.cms_crud;

public class Config {
    //Address of our scripts of the CRUD
   // public static final String URL_ADD="http://stamasoft.com/android/crudmysql/addEmp.php";
//    public static final String URL_GET_ALL = "http://stamasoft.com/android/crudmysql/getAllEmp.php";
  //  public static final String URL_GET_EMP = "http://stamasoft.com/android/crudmysql/getEmp.php?id=";
 //   public static final String URL_UPDATE_EMP = "http://stamasoft.com/android/crudmysql/updateEmp.php";
 //   public static final String URL_DELETE_EMP = "http://stamasoft//.com/android/crudmysql/deleteEmp.php?id=";
    //------------------

/*

    //Address of our scripts of the CRUD
    public static final String URL_ADD="http://127.0.0.1/android/crudmysql/addEmp.php";
    public static final String URL_GET_ALL = "http://127.0.0.1/android/crudmysql/getAllEmp.php";
    public static final String URL_GET_EMP = "http://127.0.0.1/android/crudmysql/getEmp.php?id=";
    public static final String URL_UPDATE_EMP = "http://127.0.0.1/android/crudmysql/updateEmp.php";
    public static final String URL_DELETE_EMP = "http://127.0.0.1/android/crudmysql/deleteEmp.php?id=";
*/

  //-----------------local host
   /* public static final String URL_ADD="http://192.168.56.1/android/crudmysql/addEmp.php";
    public static final String URL_GET_ALL = "http://192.168.56.1/android/crudmysql/getAllEmp.php";
    public static final String URL_GET_EMP = "http://192.168.56.1/android/crudmysql/getEmp.php?id=";
    public static final String URL_UPDATE_EMP = "http://192.168.56.1/android/crudmysql/updateEmp.php";
    public static final String URL_DELETE_EMP = "http://192.168.56.1/android/crudmysql/deleteEmp.php?id=";
*/

/*
    public static final String URL_ADD="http://10.0.2.2/android/android_professional/cms_crud/addEmp.php";
    public static final String URL_GET_ALL = "http://10.0.2.2/android/android_professional/cms_crud/getAllEmp.php";
    public static final String URL_GET_EMP = "http://10.0.2.2/android/android_professional/cms_crud/getEmp.php?id=";
    public static final String URL_UPDATE_EMP = "http://10.0.2.2/android/android_professional/cms_crud/updateEmp.php";
    public static final String URL_DELETE_EMP = "http://10.0.2.2/android/android_professional/cms_crud/deleteEmp.php?id=";

*/

    //-----------------local host


    // --- for nox--
  /*  public static final String URL_ADD="http://172.17.100.2/android/crudmysql/addEmp.php";
    public static final String URL_GET_ALL = "http://172.17.100.2/android/crudmysql/getAllEmp.php";
    public static final String URL_GET_EMP = "http://172.17.100.2/android/crudmysql/getEmp.php?id=";
    public static final String URL_UPDATE_EMP = "http://172.17.100.2/android/crudmysql/updateEmp.php";
    public static final String URL_DELETE_EMP = "http://172.17.100.2/android/crudmysql/deleteEmp.php?id=";
*/



    //-------------------------



    public static final String URL_ADD="http://10.0.2.2/LifePro/cms_crud/addEmp.php";
    public static final String URL_ADD_Desg = "http://10.0.2.2/LifePro/cms_crud/addDesignation.php";
    public static final String URL_GET_ALL = "http://10.0.2.2/LifePro/cms_crud/getAllEmp.php";
    public static final String URL_GET_EMP = "http://10.0.2.2/LifePro/cms_crud/getEmp.php?id=0";
    public static final String URL_UPDATE_EMP = "http://10.0.2.2/LifePro/cms_crud/updateEmp.php";
    public static final String URL_DELETE_EMP = "http://10.0.2.2/LifePro/cms_crud/deleteEmp.php?id=0";

    public static final String URL_GET_Desg = "http://10.0.2.2/LifePro/cms_crud/getdesignationfrom2db.php?id=0";




    //Keys that will be used to send the request to php scripts
    public static final String KEY_EMP_ID = "id";
    public static final String KEY_EMP_NAME = "name";
    public static final String KEY_EMP_DESG = "desg";
    public static final String KEY_EMP_SAL = "salary";

    //JSON Tags

  //----------according to server site erray name
    public static final String TAG_JSON_ARRAY="result";

  //----------according to server site key name not need field name
    public static final String TAG_ID = "id";
    public static final String TAG_NAME = "name";
    public static final String TAG_DESG = "designation";
    public static final String TAG_SAL = "salary";

    //employee id to pass with intent
    public static final String EMP_ID = "emp_id";


    public static final String Desig_desi_ID = "id";
    public static final String TAG_desig_ID = "id";
    public static final String TAG_desig_DESG = "designation";
    public static final String KEY_desi_DESG = "desg";



}