package com.instagram.igtv.persistence;

import X.AnonymousClass1VF;
import X.C68086Mzy;
import X.JXE;
import X.XH3;
import com.instagram.roomdb.IgRoomDatabase;

public abstract class IGTVDatabase extends IgRoomDatabase {
    public static final AnonymousClass1VF A00 = new C68086Mzy(7);
    public static final AnonymousClass1VF A01 = new C68086Mzy(8);
    public static final AnonymousClass1VF A02 = new C68086Mzy(9);
    public static final AnonymousClass1VF A03 = new XH3(3);
    public static final AnonymousClass1VF A04 = new C68086Mzy(10);
    public static final AnonymousClass1VF A05 = new C68086Mzy(11);
    public static final AnonymousClass1VF A06 = new XH3(4);
    public static final AnonymousClass1VF A07 = new C68086Mzy(12);
    public static final JXE A08 = new Object();
    public static final int[] A09;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.JXE] */
    static {
        int i;
        int[] iArr = new int[6];
        int i2 = 0;
        do {
            i = i2 + 1;
            iArr[i2] = i;
            i2 = i;
        } while (i < 6);
        A09 = iArr;
    }
}
