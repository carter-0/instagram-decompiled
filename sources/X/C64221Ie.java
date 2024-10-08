package X;

import java.util.ArrayList;
import java.util.Iterator;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
/* renamed from: X.1Ie  reason: invalid class name and case insensitive filesystem */
public final class C64221Ie implements AnonymousClass1Cy {
    public 1Ig A00;
    public 1Ig A01;
    public final ArrayList A02;
    public final boolean A03;
    public final AnonymousClass1Cy A04;
    public final ArrayList A05;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1Ie.<init>(X.1CL, X.1Cy):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public C64221Ie(X.1CL r1, X.AnonymousClass1Cy r2) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1Ie.<init>(X.1CL, X.1Cy):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64221Ie.<init>(X.1CL, X.1Cy):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1Ie.A00(X.1Bi):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final synchronized void A00(X.C63991Bi r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1Ie.A00(X.1Bi):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64221Ie.A00(X.1Bi):void");
    }

    public final synchronized void A01(C252753pd r10, double d, long j, long j2) {
        int ordinal = r10.ordinal();
        double d2 = d;
        long j3 = j;
        long j4 = j2;
        if (ordinal == 1) {
            Iterator it = this.A05.iterator();
            while (it.hasNext()) {
                ((C63991Bi) it.next()).Cxm(d2, j3, j4);
            }
        } else if (ordinal != 2) {
            Iterator it2 = this.A05.iterator();
            while (it2.hasNext()) {
                ((C63991Bi) it2.next()).Cxl(d2, j3, j4);
            }
        } else {
            Iterator it3 = this.A05.iterator();
            while (it3.hasNext()) {
                ((C63991Bi) it3.next()).EFp(d);
            }
        }
    }

    public final AnonymousClass1T9 startRequest(1QS r3, 1QU r4, 1Qe r5) {
        1CE r1 = r4.A09;
        if (r1 == 1CE.A06 || r1 == 1CE.A0A || r1 == 1CE.A0C) {
            r5.A01(this.A00);
        }
        if (this.A03 && r1 == 1CE.A07 && r3.A07 == AnonymousClass05K.A01) {
            r5.A01(this.A01);
        }
        return this.A04.startRequest(r3, r4, r5);
    }
}
