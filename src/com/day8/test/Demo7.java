package com.day8.test;

import javax.security.auth.login.LoginException;

public class Demo7 {
        // 模拟数据库中已存在账号
        private static String[] names = {"bill","hill","jill"};

        public static void main(String[] args) {
            //调用方法
            try{
                // 可能出现异常的代码
                checkUsername("hill");
                System.out.println("注册成功");//如果没有异常就是注册成功
            }catch(RegisterException e){
                //处理异常
                e.printStackTrace();
            }
        }

        //判断当前注册账号是否存在
        //因为是编译期异常，又想调用者去处理 所以声明该异常
        public static boolean checkUsername(String uname) throws RegisterException {
            for (String name : names) {
                if(name.equals(uname)){//如果名字在这里面 就抛出登陆异常
                    throw new RegisterException("亲"+name+"已经被注册了！");
                }
            }
            return true;
        }

}

