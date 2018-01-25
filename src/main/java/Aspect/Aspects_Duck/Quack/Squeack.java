/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aspect.Aspects_Duck.Quack;

/**
 *
 * @author yevgeniy_skakun
 */
public class Squeack implements QuackBehavior{
    @Override
    public void quack(){
        System.out.println("Squeack");
    }
}
