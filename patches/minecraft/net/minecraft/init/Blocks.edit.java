
# Eagler Context Redacted Diff
# Copyright (c) 2024 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> INSERT  2 : 4  @  2

+ import net.eaglerforge.api.BaseData;
+ import net.eaglerforge.api.ModData;

> DELETE  32  @  32 : 33

> CHANGE  2 : 3  @  2 : 201

~ import java.util.Map;

> INSERT  1 : 201  @  1

+ public class Blocks extends ModData {
+ 	public static Block air;
+ 	public static Block stone;
+ 	public static BlockGrass grass;
+ 	public static Block dirt;
+ 	public static Block cobblestone;
+ 	public static Block planks;
+ 	public static Block sapling;
+ 	public static Block bedrock;
+ 	public static BlockDynamicLiquid flowing_water;
+ 	public static BlockStaticLiquid water;
+ 	public static BlockDynamicLiquid flowing_lava;
+ 	public static BlockStaticLiquid lava;
+ 	public static BlockSand sand;
+ 	public static Block gravel;
+ 	public static Block gold_ore;
+ 	public static Block iron_ore;
+ 	public static Block coal_ore;
+ 	public static Block log;
+ 	public static Block log2;
+ 	public static BlockLeaves leaves;
+ 	public static BlockLeaves leaves2;
+ 	public static Block sponge;
+ 	public static Block glass;
+ 	public static Block lapis_ore;
+ 	public static Block lapis_block;
+ 	public static Block dispenser;
+ 	public static Block sandstone;
+ 	public static Block noteblock;
+ 	public static Block bed;
+ 	public static Block golden_rail;
+ 	public static Block detector_rail;
+ 	public static BlockPistonBase sticky_piston;
+ 	public static Block web;
+ 	public static BlockTallGrass tallgrass;
+ 	public static BlockDeadBush deadbush;
+ 	public static BlockPistonBase piston;
+ 	public static BlockPistonExtension piston_head;
+ 	public static Block wool;
+ 	public static BlockPistonMoving piston_extension;
+ 	public static BlockFlower yellow_flower;
+ 	public static BlockFlower red_flower;
+ 	public static BlockBush brown_mushroom;
+ 	public static BlockBush red_mushroom;
+ 	public static Block gold_block;
+ 	public static Block iron_block;
+ 	public static BlockSlab double_stone_slab;
+ 	public static BlockSlab stone_slab;
+ 	public static Block brick_block;
+ 	public static Block tnt;
+ 	public static Block bookshelf;
+ 	public static Block mossy_cobblestone;
+ 	public static Block obsidian;
+ 	public static Block torch;
+ 	public static BlockFire fire;
+ 	public static Block mob_spawner;
+ 	public static Block oak_stairs;
+ 	public static BlockChest chest;
+ 	public static BlockRedstoneWire redstone_wire;
+ 	public static Block diamond_ore;
+ 	public static Block diamond_block;
+ 	public static Block crafting_table;
+ 	public static Block wheat;
+ 	public static Block farmland;
+ 	public static Block furnace;
+ 	public static Block lit_furnace;
+ 	public static Block standing_sign;
+ 	public static Block oak_door;
+ 	public static Block spruce_door;
+ 	public static Block birch_door;
+ 	public static Block jungle_door;
+ 	public static Block acacia_door;
+ 	public static Block dark_oak_door;
+ 	public static Block ladder;
+ 	public static Block rail;
+ 	public static Block stone_stairs;
+ 	public static Block wall_sign;
+ 	public static Block lever;
+ 	public static Block stone_pressure_plate;
+ 	public static Block iron_door;
+ 	public static Block wooden_pressure_plate;
+ 	public static Block redstone_ore;
+ 	public static Block lit_redstone_ore;
+ 	public static Block unlit_redstone_torch;
+ 	public static Block redstone_torch;
+ 	public static Block stone_button;
+ 	public static Block snow_layer;
+ 	public static Block ice;
+ 	public static Block snow;
+ 	public static BlockCactus cactus;
+ 	public static Block clay;
+ 	public static BlockReed reeds;
+ 	public static Block jukebox;
+ 	public static Block oak_fence;
+ 	public static Block spruce_fence;
+ 	public static Block birch_fence;
+ 	public static Block jungle_fence;
+ 	public static Block dark_oak_fence;
+ 	public static Block acacia_fence;
+ 	public static Block pumpkin;
+ 	public static Block netherrack;
+ 	public static Block soul_sand;
+ 	public static Block glowstone;
+ 	public static BlockPortal portal;
+ 	public static Block lit_pumpkin;
+ 	public static Block cake;
+ 	public static BlockRedstoneRepeater unpowered_repeater;
+ 	public static BlockRedstoneRepeater powered_repeater;
+ 	public static Block trapdoor;
+ 	public static Block monster_egg;
+ 	public static Block stonebrick;
+ 	public static Block brown_mushroom_block;
+ 	public static Block red_mushroom_block;
+ 	public static Block iron_bars;
+ 	public static Block glass_pane;
+ 	public static Block melon_block;
+ 	public static Block pumpkin_stem;
+ 	public static Block melon_stem;
+ 	public static Block vine;
+ 	public static Block oak_fence_gate;
+ 	public static Block spruce_fence_gate;
+ 	public static Block birch_fence_gate;
+ 	public static Block jungle_fence_gate;
+ 	public static Block dark_oak_fence_gate;
+ 	public static Block acacia_fence_gate;
+ 	public static Block brick_stairs;
+ 	public static Block stone_brick_stairs;
+ 	public static BlockMycelium mycelium;
+ 	public static Block waterlily;
+ 	public static Block nether_brick;
+ 	public static Block nether_brick_fence;
+ 	public static Block nether_brick_stairs;
+ 	public static Block nether_wart;
+ 	public static Block enchanting_table;
+ 	public static Block brewing_stand;
+ 	public static BlockCauldron cauldron;
+ 	public static Block end_portal;
+ 	public static Block end_portal_frame;
+ 	public static Block end_stone;
+ 	public static Block dragon_egg;
+ 	public static Block redstone_lamp;
+ 	public static Block lit_redstone_lamp;
+ 	public static BlockSlab double_wooden_slab;
+ 	public static BlockSlab wooden_slab;
+ 	public static Block cocoa;
+ 	public static Block sandstone_stairs;
+ 	public static Block emerald_ore;
+ 	public static Block ender_chest;
+ 	public static BlockTripWireHook tripwire_hook;
+ 	public static Block tripwire;
+ 	public static Block emerald_block;
+ 	public static Block spruce_stairs;
+ 	public static Block birch_stairs;
+ 	public static Block jungle_stairs;
+ 	public static Block command_block;
+ 	public static BlockBeacon beacon;
+ 	public static Block cobblestone_wall;
+ 	public static Block flower_pot;
+ 	public static Block carrots;
+ 	public static Block potatoes;
+ 	public static Block wooden_button;
+ 	public static BlockSkull skull;
+ 	public static Block anvil;
+ 	public static Block trapped_chest;
+ 	public static Block light_weighted_pressure_plate;
+ 	public static Block heavy_weighted_pressure_plate;
+ 	public static BlockRedstoneComparator unpowered_comparator;
+ 	public static BlockRedstoneComparator powered_comparator;
+ 	public static BlockDaylightDetector daylight_detector;
+ 	public static BlockDaylightDetector daylight_detector_inverted;
+ 	public static Block redstone_block;
+ 	public static Block quartz_ore;
+ 	public static BlockHopper hopper;
+ 	public static Block quartz_block;
+ 	public static Block quartz_stairs;
+ 	public static Block activator_rail;
+ 	public static Block dropper;
+ 	public static Block stained_hardened_clay;
+ 	public static Block barrier;
+ 	public static Block iron_trapdoor;
+ 	public static Block hay_block;
+ 	public static Block carpet;
+ 	public static Block hardened_clay;
+ 	public static Block coal_block;
+ 	public static Block packed_ice;
+ 	public static Block acacia_stairs;
+ 	public static Block dark_oak_stairs;
+ 	public static Block slime_block;
+ 	public static BlockDoublePlant double_plant;
+ 	public static BlockStainedGlass stained_glass;
+ 	public static BlockStainedGlassPane stained_glass_pane;
+ 	public static Block prismarine;
+ 	public static Block sea_lantern;
+ 	public static Block standing_banner;
+ 	public static Block wall_banner;
+ 	public static Block red_sandstone;
+ 	public static Block red_sandstone_stairs;
+ 	public static BlockSlab double_stone_slab2;
+ 	public static BlockSlab stone_slab2;
+ 

> CHANGE  4 : 16  @  4 : 5

~ 	public static ModData makeModData() {
~ 		ModData data = new ModData();
~ 		Map<ResourceLocation, Block> blockMap = Block.blockRegistry.registryObjects;
~ 		for (Map.Entry<ResourceLocation, Block> entry : blockMap.entrySet()) {
~ 			if (entry.getKey().resourceName != null && entry.getValue() != null) {
~ 				data.set(entry.getKey().resourceName, entry.getValue().makeModData());
~ 			}
~ 		}
~ 		return data;
~ 	}
~ 
~ 	static void doBootstrap() {

> INSERT  203 : 204  @  203

+ 

> EOF
