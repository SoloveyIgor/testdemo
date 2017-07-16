package webproject.app;

import javax.annotation.PostConstruct;

public class Account {

    private int id = 1;

    public Account()
    {

        initAccount();
    }



    public void initAccount(){
        System.out.println(id);

    }


}
