package X;

import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1HN  reason: invalid class name */
public final class AnonymousClass1HN implements AnonymousClass1HM {
    public final 1HJ A00;
    public final Queue A01 = new ConcurrentLinkedQueue();
    public final AtomicBoolean A02 = new AtomicBoolean();
    public final C61480nO A03;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1HN.Eyl(X.0ng):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void Eyl(X.0ng r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1HN.Eyl(X.0ng):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1HN.Eyl(X.0ng):void");
    }

    public final 1KT Bas() {
        return 1KT.A01;
    }

    public final void E1T(0ng r4) {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            if (((0ng) it.next()).runnableId == r4.runnableId) {
                it.remove();
            }
        }
        Eyl(r4);
    }

    public final void EJa() {
        if (!this.A01.isEmpty() && !this.A02.get()) {
            this.A03.ATE(new C249333jX(this));
        }
    }

    public AnonymousClass1HN(C61480nO r2, 1HJ r3) {
        this.A00 = r3;
        this.A03 = r2;
    }
}
