package X;

import com.facebook.memorytimeline.MemoryTimeline;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1JB  reason: invalid class name */
public abstract class AnonymousClass1JB {
    public static final List A00 = new ArrayList();
    public static volatile MemoryTimeline A01;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1JB.A00(X.1JA):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static final void A00(X.1JA r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1JB.A00(X.1JA):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1JB.A00(X.1JA):void");
    }
}
