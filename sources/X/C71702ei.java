package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2ei  reason: invalid class name and case insensitive filesystem */
public final class C71702ei implements 2ej {
    public final List A00 = new ArrayList();

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.2ei.A7c(X.2eo):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void A7c(X.AnonymousClass2eo r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.2ei.A7c(X.2eo):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71702ei.A7c(X.2eo):void");
    }

    public final AnonymousClass2eo AX9(int i) {
        return (AnonymousClass2eo) this.A00.get(i);
    }

    public final void clear() {
        this.A00.clear();
    }

    public final Iterator iterator() {
        return this.A00.iterator();
    }

    public final int size() {
        return this.A00.size();
    }
}
