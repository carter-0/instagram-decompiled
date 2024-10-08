package X;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.15i  reason: invalid class name and case insensitive filesystem */
public final class C638515i {
    public 15k A00;
    public 15k A01;
    public 15k A02;
    public final C61110lV A03 = new C638615j(this);
    public final List A04 = new CopyOnWriteArrayList();
    public final 14i A05;
    public final C61410nE A06;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.15i.A00(X.2Hg, X.15i):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static void A00(X.AnonymousClass2Hg r1, X.C638515i r2) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.15i.A00(X.2Hg, X.15i):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C638515i.A00(X.2Hg, X.15i):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.15i.A01(X.15i):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static void A01(X.C638515i r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.15i.A01(X.15i):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C638515i.A01(X.15i):void");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.15k] */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.15k] */
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.15k] */
    public C638515i(14i r6, C61410nE r7) {
        this.A06 = r7;
        this.A05 = r6;
        ? obj = new Object();
        obj.A04 = true;
        obj.A03 = false;
        obj.A01 = -1;
        obj.A02 = -1;
        obj.A00 = 0;
        this.A00 = obj;
        ? obj2 = new Object();
        15k.A00(obj2, obj);
        this.A02 = obj2;
        ? obj3 = new Object();
        15k.A00(obj3, obj);
        this.A01 = obj3;
    }
}
