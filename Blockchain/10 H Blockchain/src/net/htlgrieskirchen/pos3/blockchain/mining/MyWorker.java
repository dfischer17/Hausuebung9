/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgrieskirchen.pos3.blockchain.mining;

import java.util.concurrent.Callable;
import net.htlgrieskirchen.pos3.blockchain.chain.Block;
import net.htlgrieskirchen.pos3.blockchain.chain.MiningBlock;

/**
 *
 * @author Daniel Fischer
 */
public class MyWorker implements Callable<Block>{
    private MiningBlock block;
    private final int start;
    private final int end;
    
    public MyWorker(int start, int end) {        
        this.start = start;
        this.end = end;
    }
                
    public void setBlock(MiningBlock block) {
        this.block = block;
    }

    @Override
    public Block call() throws Exception {
        for (int i = start; i < end; ++i) {
            if (block.mine(i)) {
                return block;
            }            
        }
        return null;
    }
}
