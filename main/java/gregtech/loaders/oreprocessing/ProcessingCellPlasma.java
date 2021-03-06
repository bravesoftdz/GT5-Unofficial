/*    */ package gregtech.loaders.oreprocessing;
/*    */ 
/*    */ import gregtech.api.enums.GT_Values;
/*    */ import gregtech.api.enums.Materials;
/*    */ import gregtech.api.enums.OrePrefixes;
/*    */ import gregtech.api.interfaces.internal.IGT_RecipeAdder;
/*    */ import gregtech.api.util.GT_ModHandler;
/*    */ import gregtech.api.util.GT_Utility;
/*    */ import net.minecraft.item.ItemStack;
/*    */ 
/*    */ public class ProcessingCellPlasma implements gregtech.api.interfaces.IOreRecipeRegistrator
/*    */ {
/*    */   public ProcessingCellPlasma()
/*    */   {
/* 15 */     OrePrefixes.cellPlasma.add(this);
/*    */   }
/*    */   
/*    */   public void registerOre(OrePrefixes aPrefix, Materials aMaterial, String aOreDictName, String aModName, ItemStack aStack)
/*    */   {
/* 20 */     if (aMaterial == Materials.Empty) {
/* 21 */       GT_ModHandler.removeRecipeByOutput(aStack);
/*    */     } else {
/* 23 */       GT_Values.RA.addFuel(GT_Utility.copyAmount(1L, new Object[] { aStack }), GT_Utility.getFluidForFilledItem(aStack, true) == null ? GT_Utility.getContainerItem(aStack, true) : null, (int)Math.max(1024L, 1024L * aMaterial.getMass()), 4);
/* 24 */       GT_Values.RA.addVacuumFreezerRecipe(GT_Utility.copyAmount(1L, new Object[] { aStack }), gregtech.api.util.GT_OreDictUnificator.get(OrePrefixes.cell, aMaterial, 1L), (int)Math.max(aMaterial.getMass() * 2L, 1L));
/*    */     }
/*    */   }
/*    */ }


/* Location:              F:\Torrent\minecraft\jdgui test\gregtech_1.7.10-5.07.07-dev.jar!\gregtech\loaders\oreprocessing\ProcessingCellPlasma.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1-SNAPSHOT-20140817
 */