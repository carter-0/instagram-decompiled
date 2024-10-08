package X;

import java.util.LinkedList;
import java.util.List;

/* renamed from: X.1Mk  reason: invalid class name and case insensitive filesystem */
public final class C64411Mk implements C64421Ml {
    public final List A00 = new LinkedList();

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1Mk.A7b(X.2iL):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void A7b(X.AnonymousClass2iL r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1Mk.A7b(X.2iL):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64411Mk.A7b(X.2iL):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1Mk.AHN(X.HiC):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void AHN(X.C55468HiC r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1Mk.AHN(X.HiC):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64411Mk.AHN(X.HiC):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1Mk.ED5(X.2iL):boolean, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final boolean ED5(X.AnonymousClass2iL r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1Mk.ED5(X.2iL):boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64411Mk.ED5(X.2iL):boolean");
    }

    public final AnonymousClass2iL BDS() {
        AnonymousClass2iL r3 = null;
        for (AnonymousClass2iL r2 : this.A00) {
            if (r3 == null || r2.A0C() > r3.A0C()) {
                r3 = r2;
            }
        }
        return r3;
    }

    public final void FHb(C64421Ml r3) {
        List<AnonymousClass2iL> list = this.A00;
        if (!list.isEmpty()) {
            for (AnonymousClass2iL A7b : list) {
                r3.A7b(A7b);
            }
        }
    }

    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }
}
