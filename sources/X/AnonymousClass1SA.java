package X;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.1SA  reason: invalid class name */
public final class AnonymousClass1SA {
    public IOException A00;
    public boolean A01;
    public final Queue A02 = new LinkedList();
    public final Condition A03;
    public final ReentrantLock A04;
    public final 0sP A05;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1SA.A00(X.0sP):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void A00(X.0sP r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1SA.A00(X.0sP):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1SA.A00(X.0sP):void");
    }

    public AnonymousClass1SA(0sP r2) {
        this.A05 = r2;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.A04 = reentrantLock;
        this.A03 = reentrantLock.newCondition();
    }
}
