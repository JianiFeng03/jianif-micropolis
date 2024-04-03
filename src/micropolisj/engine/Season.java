// This file is part of MicropolisJ.
// Copyright (C) 2013 Jason Long
// Portions Copyright (C) 1989-2007 Electronic Arts Inc.
//
// MicropolisJ is free software; you can redistribute it and/or modify
// it under the terms of the GNU GPLv3, with additional terms.
// See the README file, included in this distribution, for details.

package micropolisj.engine;

/**
 * Lists the 4 seasons and which months are corresponding to which
 */
public enum Season {
    SPRING(3,4,5),
    SUMMER(6,7,8),
    FALL(9,10,11),
    WINTER(12,1,2);

    public final int firstMonth;
    public final int secondMonth;
    public final int thirdMonth;
    

    Season(int fMonth, int sMonth, int tMonth) {
        this.firstMonth = fMonth;
        this.secondMonth = sMonth;
        this.thirdMonth = tMonth;
    }
}
