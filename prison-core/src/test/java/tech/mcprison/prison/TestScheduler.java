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

package tech.mcprison.prison;

import tech.mcprison.prison.internal.Scheduler;

/**
 * @author Faizaan A. Datoo
 */
public class TestScheduler implements Scheduler {
    @Override public int runTaskLater(Runnable run, long delay) {
        return 0;
    }

    @Override public int runTaskLaterAsync(Runnable run, long delay) {
        return 0;
    }

    @Override public int runTaskTimer(Runnable run, long delay, long interval) {
        return 0;
    }

    @Override public int runTaskTimerAsync(Runnable run, long delay, long interval) {
        return 0;
    }

    @Override public void cancelTask(int taskId) {

    }

    @Override public void cancelAll() {

    }
}
