/*
 * Copyright (c) 2013, Danilo Reinert <daniloreinert@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Lesser GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Lesser GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.github.reinert.jjschema.model;

import java.util.Collection;
import java.util.Iterator;

public class Users implements Iterable<User> {

    private Collection<User> mUsers;

    public Users(Collection<User> empresas) {
        mUsers = empresas;
    }

    public Iterator<User> iterator() {
        return mUsers.iterator();
    }

}
