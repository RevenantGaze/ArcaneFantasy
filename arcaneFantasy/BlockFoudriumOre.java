package arcaneFantasy;

import net.minecraft.src.Block;
import net.minecraft.src.Material;

public class BlockFoudriumOre extends Block
	{
public BlockFoudriumOre(int blockID)
    {
                super(blockID, Material.rock);
               
                blockIndexInTexture = 1;
        setHardness(2.0f);
        setResistance(5.0f);
        setStepSound(soundStoneFootstep);
       
        setBlockName("Foudrium Ore");
    }
       
        @Override
        public int getBlockTextureFromSide(int side)
        {
                switch(side)
                {
                case 0:
                        return 26;
                case 1:
                        return 45;
                }
                return blockIndexInTexture;
        }
       
        @Override
        public String getTextureFile()
        {
                return "ArcaneFantasy/texture.png";
        }
}