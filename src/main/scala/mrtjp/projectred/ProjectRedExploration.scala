package mrtjp.projectred

import cpw.mods.fml.common.Mod
import cpw.mods.fml.common.event.{
  FMLInitializationEvent,
  FMLPostInitializationEvent,
  FMLPreInitializationEvent
}
import mrtjp.projectred.core.Configurator
import mrtjp.projectred.exploration._
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.init.Blocks
import net.minecraft.item.Item.ToolMaterial
import net.minecraft.item.ItemArmor.ArmorMaterial
import net.minecraft.item.ItemStack

@Mod(
  modid = "ProjRed|Exploration",
  dependencies = "required-after:ProjRed|Core",
  modLanguage = "scala",
  acceptedMinecraftVersions = "[1.7.10]",
  name = "ProjectRed Exploration",
  version = ProjectRedCore.VERSION
)
object ProjectRedExploration {

  def isEnabled = Configurator.module_Exploration

  /** Blocks * */
  var blockOres: BlockOre = null
  var blockDecoratives: BlockDecoratives = null
  var blockDecorativeWalls: BlockDecorativeWalls = null
  var blockLily: BlockLily = null
  var blockBarrel: BlockBarrel = null

  /** Materials * */
  var toolMaterialRuby: ToolMaterial = null
  var toolMaterialSapphire: ToolMaterial = null
  var toolMaterialPeridot: ToolMaterial = null
  var armorMatrialRuby: ArmorMaterial = null
  var armorMatrialSapphire: ArmorMaterial = null
  var armorMatrialPeridot: ArmorMaterial = null

  /** Items * */
  var itemWoolGin: ItemWoolGin = null
  var itemBackpack: ItemBackpack = null
  var itemAthame: ItemAthame = null
  var itemRubyAxe: ItemGemAxe = null
  var itemSapphireAxe: ItemGemAxe = null
  var itemPeridotAxe: ItemGemAxe = null
  var itemRubyHoe: ItemGemHoe = null
  var itemSapphireHoe: ItemGemHoe = null
  var itemPeridotHoe: ItemGemHoe = null
  var itemRubyPickaxe: ItemGemPickaxe = null
  var itemSapphirePickaxe: ItemGemPickaxe = null
  var itemPeridotPickaxe: ItemGemPickaxe = null
  var itemRubyShovel: ItemGemShovel = null
  var itemSapphireShovel: ItemGemShovel = null
  var itemPeridotShovel: ItemGemShovel = null
  var itemRubySword: ItemGemSword = null
  var itemSapphireSword: ItemGemSword = null
  var itemPeridotSword: ItemGemSword = null
  var itemGoldSaw: ItemGemSaw = null
  var itemRubySaw: ItemGemSaw = null
  var itemSapphireSaw: ItemGemSaw = null
  var itemPeridotSaw: ItemGemSaw = null
  var itemWoodSickle: ItemGemSickle = null
  var itemStoneSickle: ItemGemSickle = null
  var itemIronSickle: ItemGemSickle = null
  var itemGoldSickle: ItemGemSickle = null
  var itemRubySickle: ItemGemSickle = null
  var itemSapphireSickle: ItemGemSickle = null
  var itemPeridotSickle: ItemGemSickle = null
  var itemDiamondSickle: ItemGemSickle = null
  var itemLilySeed: ItemLilySeeds = null
  var itemRubyHelmet: ItemGemArmor = null
  var itemRubyChestplate: ItemGemArmor = null
  var itemRubyLeggings: ItemGemArmor = null
  var itemRubyBoots: ItemGemArmor = null
  var itemSapphireHelmet: ItemGemArmor = null
  var itemSapphireChestplate: ItemGemArmor = null
  var itemSapphireLeggings: ItemGemArmor = null
  var itemSapphireBoots: ItemGemArmor = null
  var itemPeridotHelmet: ItemGemArmor = null
  var itemPeridotChestplate: ItemGemArmor = null
  var itemPeridotLeggings: ItemGemArmor = null
  var itemPeridotBoots: ItemGemArmor = null

  var tabExploration: CreativeTabs = new CreativeTabs("exploration") {
    override def getIconItemStack = new ItemStack(Blocks.grass)
    override def getTabIconItem = getIconItemStack.getItem
  }

  @Mod.EventHandler
  def preInit(event: FMLPreInitializationEvent) {
    ExplorationProxy.versionCheck()
    ExplorationProxy.preinit()
  }

  @Mod.EventHandler
  def init(event: FMLInitializationEvent) {
    if (isEnabled)
      ExplorationProxy.init()
  }

  @Mod.EventHandler
  def postInit(event: FMLPostInitializationEvent) {
    if (isEnabled)
      ExplorationProxy.postinit()
  }
}
