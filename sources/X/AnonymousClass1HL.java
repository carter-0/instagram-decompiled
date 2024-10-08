package X;

import android.os.MessageQueue;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.1HL  reason: invalid class name */
public final class AnonymousClass1HL implements AnonymousClass1HM {
    public final 1HJ A00;
    public final Queue A01 = new ConcurrentLinkedQueue();
    public final MessageQueue A02;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1HL.Eyl(X.0ng):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void Eyl(X.0ng r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1HL.Eyl(X.0ng):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1HL.Eyl(X.0ng):void");
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

    /* JADX WARNING: type inference failed for: r0v0, types: [X.3jV, android.os.MessageQueue$IdleHandler] */
    public final void EJa() {
        this.A02.addIdleHandler(new C249313jV(this));
    }

    public AnonymousClass1HL(MessageQueue messageQueue, 1HJ r3) {
        this.A00 = r3;
        this.A02 = messageQueue;
    }
}
