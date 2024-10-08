package X;

import java.util.ConcurrentModificationException;

/* renamed from: X.0mT  reason: invalid class name */
public abstract class AnonymousClass0mT {
    public int A00;
    public int A01 = -1;
    public int A02;
    public final 0Ym A03;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0mT.remove():void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void remove() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0mT.remove():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0mT.remove():void");
    }

    public final void A00() {
        0Ym r1 = this.A03;
        0Ym r0 = 0Ym.A0D;
        if (r1.A03 != this.A02) {
            throw new ConcurrentModificationException();
        }
    }

    public final void A01() {
        while (true) {
            int i = this.A00;
            0Ym r1 = this.A03;
            0Ym r0 = 0Ym.A0D;
            if (i < r1.A01 && r1.A0A[i] < 0) {
                this.A00 = i + 1;
            } else {
                return;
            }
        }
    }

    public final boolean hasNext() {
        int i = this.A00;
        0Ym r1 = this.A03;
        0Ym r0 = 0Ym.A0D;
        if (i < r1.A01) {
            return true;
        }
        return false;
    }

    public AnonymousClass0mT(0Ym r2) {
        this.A03 = r2;
        0Ym r0 = 0Ym.A0D;
        this.A02 = r2.A03;
        A01();
    }
}
