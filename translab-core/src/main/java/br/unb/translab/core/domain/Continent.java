/**
 *     Copyright (C) 2015  the original author or authors.
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License,
 *     any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>
 */
package br.unb.translab.core.domain;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

public class Continent
{
    /**
     * 
     */
    private Integer id;

    /**
     * acronym
     */
    private String acronym;

    /**
     * 
     */
    private String name;

    /**
     * @return the id
     */
    public Integer getId()
    {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public Continent setId(Integer id)
    {
        this.id = id;
        return this;
    }

    /**
     * @return the acronym
     */
    public String getAcronym()
    {
        return acronym;
    }

    /**
     * @param acronym
     *            the acronym to set
     */
    public Continent setAcronym(String acronym)
    {
        this.acronym = acronym;
        return this;
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public Continent setName(String name)
    {
        this.name = name;
        return this;
    }

    @Override
    public int hashCode()
    {
        return Objects.hashCode(this.getName(), this.getId(), this.getAcronym()) * 31;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        
        if (obj == null || this.getClass() != obj.getClass())
        {
            return false;
        }
        
        Continent other = (Continent) obj;
        return (Objects.equal(this.getName(), other.getName()) && Objects.equal(this.getAcronym(), other.getAcronym())) ||
               (this.getId() != null && Objects.equal(this.getId(), other.getId()));
    }
    
    @Override
    public String toString()
    {
        return MoreObjects.toStringHelper(this)
                          .add("acronym", this.getAcronym())
                          .add("id", this.getId())
                          .add("name", this.getName())
                          .omitNullValues()
                          .toString();
    }
    
}
