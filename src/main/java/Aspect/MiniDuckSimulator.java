/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aspect;

import Aspect.Aspects_Duck.Duck;
import Aspect.Aspects_Duck.Fly.FlyRocketPowered;
import Aspect.Aspects_Duck.MallardDuck;
import Aspect.Aspects_Duck.ModelDuck;

/**
 *
 * @author yevgeniy_skakun
 */
public class MiniDuckSimulator {
    
    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        mallard.performQuak();
        mallard.performFly();
        
        Duck model= new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
    
}
