package org.tukaani.xz.lz;

import X.0nG;
import X.C63230zK;

public final class HC4 extends LZEncoder {
    public int A00 = -1;
    public int A01;
    public final int A02;
    public final int A03;
    public final 0nG A04;
    public final C63230zK A05;
    public final int[] A06;

    public HC4(int i, int i2, int i3, int i4, int i5) {
        super(i, i2, i3, i4);
        this.A04 = new 0nG(i);
        int i6 = i + 1;
        this.A02 = i6;
        this.A06 = new int[i6];
        this.A01 = i6;
        this.A05 = new C63230zK(i4 - 1);
        this.A03 = i5 <= 0 ? (i4 / 4) + 4 : i5;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: org.tukaani.xz.lz.HC4.A00():int, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    private int A00() {
        /*
        // Can't load method instructions: Load method exception: null in method: org.tukaani.xz.lz.HC4.A00():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: org.tukaani.xz.lz.HC4.A00():int");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: org.tukaani.xz.lz.HC4.A05():X.0zK, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final X.C63230zK A05() {
        /*
        // Can't load method instructions: Load method exception: null in method: org.tukaani.xz.lz.HC4.A05():X.0zK, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: org.tukaani.xz.lz.HC4.A05():X.0zK");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: org.tukaani.xz.lz.HC4.A06(int):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void A06(int r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: org.tukaani.xz.lz.HC4.A06(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: org.tukaani.xz.lz.HC4.A06(int):void");
    }
}
