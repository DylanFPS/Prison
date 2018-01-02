/*
 * Prison is a Minecraft plugin for the prison game mode.
 * Copyright (C) 2018 MC-Prison Team
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package tech.mcprison.prison.spigot.economies;

import com.earth2me.essentials.api.Economy;
import com.earth2me.essentials.api.NoLoanPermittedException;
import com.earth2me.essentials.api.UserDoesNotExistException;
import tech.mcprison.prison.internal.Player;

import java.math.BigDecimal;

/**
 * A non-static wrapper of Essentials' annoyingly static {@link net.ess3.api.Economy} API.
 *
 * @author Faizaan A. Datoo
 */
class EssEconomyWrapper {

    double getBalance(Player player) {
        try {
            return Economy.getMoneyExact(player.getName()).doubleValue();
        } catch (UserDoesNotExistException e) {
            player.sendMessage("You don't exist in the economy plugin.");
            return 0.0;
        }
    }

    void setBalance(Player player, double amount) {
        try {
            Economy.setMoney(player.getName(), new BigDecimal(amount));
        } catch (UserDoesNotExistException | NoLoanPermittedException e) {
            player.sendMessage("You don't exist in the economy plugin.");
        }
    }

}
