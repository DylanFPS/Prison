/*
 *  Prison is a Minecraft plugin for the prison game mode.
 *  Copyright (C) 2017 The Prison Team
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package tech.mcprison.prison.block;

import tech.mcprison.prison.Prison;
import tech.mcprison.prison.util.Block;
import tech.mcprison.prison.util.Location;

/**
 * Represents the state of a lever.
 * @author Faizaan A. Datoo
 * @since API 30
 */
public class Lever extends BlockState {

    public Lever(Location location, boolean on) {
        super(location, Block.LEVER);
    }

    /**
     * Returns whether a lever is on (i.e. emitting redstone signal) or off.
     *
     * @return true if the lever is on, false if it's off
     */
    public boolean isOn() {
        return getLocation().getWorld()
    }

}