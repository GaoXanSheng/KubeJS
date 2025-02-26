package dev.latvian.mods.kubejs.server;

import dev.latvian.mods.kubejs.entity.EntityJS;
import dev.latvian.mods.kubejs.level.BlockContainerJS;
import dev.latvian.mods.kubejs.level.LevelJS;
import dev.latvian.mods.kubejs.player.PlayerEventJS;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

/**
 * @author LatvianModder
 */
public class CustomCommandEventJS extends PlayerEventJS {
	private final Level level;
	private final Entity entity;
	private final BlockPos blockPos;
	private final String id;

	public CustomCommandEventJS(Level l, @Nullable Entity e, BlockPos p, String i) {
		level = l;
		entity = e;
		blockPos = p;
		id = i;
	}

	@Override
	public boolean canCancel() {
		return true;
	}

	public String getId() {
		return id;
	}

	@Override
	public LevelJS getLevel() {
		return levelOf(level);
	}

	@Override
	public EntityJS getEntity() {
		return entityOf(entity);
	}

	public BlockContainerJS getBlock() {
		return this.getLevel().getBlock(blockPos);
	}
}