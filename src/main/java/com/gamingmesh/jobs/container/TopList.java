package com.gamingmesh.jobs.container;

import org.jetbrains.annotations.NotNull;

public final class TopList implements Comparable{

    private int level;
    private int exp;
    private PlayerInfo info;

    public TopList(PlayerInfo info, int level, int exp) {
	this.info = info;
	this.level = level;
	this.exp = exp;
    }

    @Deprecated
    public String getPlayerName() {
	return info.getName();
    }

    public PlayerInfo getPlayerInfo() {
	return info;
    }

    public int getLevel() {
	return level;
    }

    public int getExp() {
	return exp;
    }
    
	
	@Override
	public int compareTo(@NotNull Object o) {
		assert o instanceof TopList;
    	
    	if(((TopList) o).getLevel() < this.level)
			return -1;
		if(((TopList) o).getLevel() == this.level)
			if (((TopList) o).getExp() < this.exp)
				return -1;
			else if (((TopList) o).getExp() == this.exp)
				return 0;
		return 1;
	}
}