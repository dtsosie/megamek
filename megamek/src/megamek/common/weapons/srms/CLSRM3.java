/**
 * MegaMek - Copyright (C) 2005 Ben Mazur (bmazur@sev.org)
 *
 *  This program is free software; you can redistribute it and/or modify it
 *  under the terms of the GNU General Public License as published by the Free
 *  Software Foundation; either version 2 of the License, or (at your option)
 *  any later version.
 *
 *  This program is distributed in the hope that it will be useful, but
 *  WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 *  or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 *  for more details.
 */
package megamek.common.weapons.srms;

/**
 * @author Sebastian Brocks
 */
public class CLSRM3 extends SRMWeapon {

    /**
     *
     */
    private static final long serialVersionUID = 1661723137877595056L;

    /**
     *
     */
    public CLSRM3() {
        super();

        name = "SRM 3";
        setInternalName("CLSRM3");
        addLookupName("Clan SRM-3");
        addLookupName("Clan SRM 3");
        rackSize = 3;
        shortRange = 3;
        mediumRange = 6;
        longRange = 9;
        extremeRange = 12;
        bv = 30;
        flags = flags.or(F_NO_FIRES);
        cost = 80000;
        // Per Herb all ProtoMech launcher use the ProtoMech Chassis progression. 
        //But LRM Tech Base and Avail Ratings.
        rulesRefs = "231,TM";
        techAdvancement.setTechBase(TECH_BASE_CLAN)
    	.setIntroLevel(false)
    	.setUnofficial(false)
        .setTechRating(RATING_F)
        .setAvailability(RATING_X, RATING_X, RATING_C, RATING_C)
        .setClanAdvancement(3055, 3060, 3061, DATE_NONE, DATE_NONE)
        .setClanApproximate(true, false, false,false, false)
        .setPrototypeFactions(F_CSJ)
        .setProductionFactions(F_CSJ);
    }
}