package net.Elerion.Framework;

import net.Elerion.Handlers.RenderHandler;
import net.Elerion.Handlers.EntityHandler;


public class Program {

    public enum STATES {RUNNING, STOPPED}
    private static STATES _state;


    public static void init() {
        _state = STATES.STOPPED;


    }



    public static void start() {

        _state = STATES.RUNNING;

        mainUpdate();

    }



    public static void quit() {

        _state = STATES.STOPPED;

    }



    private static void _mainUpdate() {


        while (_state != STATES.STOPPED) {

            EntityHandler.update();
            RenderHandler.update();

        }

    }



    public static void render() {



    }

}
