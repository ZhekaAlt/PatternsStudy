/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aspect.Aspects_Duck;

import Aspect.Aspects_Duck.Fly.FlyWithWings;
import Aspect.Aspects_Duck.Quack.Quack;

/**
 *
 * @author yevgeniy_skakun
 */
public class MallardDuck extends Duck{
    
    public MallardDuck(){
        quackBehavior=new Quack();
        flyBehavior=new FlyWithWings();
    }
    
    @Override
    public void display(){
        System.out.println("I'm a real Mallard duck");
    }
    
}
