/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aspect.Aspects_Duck;

import Aspect.Aspects_Duck.Fly.FlyNoWay;
import Aspect.Aspects_Duck.Quack.Quack;

/**
 *
 * @author yevgeniy_skakun
 */
public class ModelDuck extends Duck{
    
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm model duck");
    }
    
}
