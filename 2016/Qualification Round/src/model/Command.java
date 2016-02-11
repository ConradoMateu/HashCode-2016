package model;

import java.util.HashMap;

/**
 * Created by toni on 11/02/16.
 */
public class Command {

    private final String LOAD_COMMAND = "load";
    private final String DELIVER_COMMAND = "deliver";
    private final String UNLOAD_COMMAND = "unload";
    private final String WAIT_COMMAND = "wait";

    private String command;
    private HashMap<Type, Integer> numberOfProductsDependsType;
    private int maximumLoad;
}
