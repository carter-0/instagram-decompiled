package X;

import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.GOy  reason: case insensitive filesystem */
public final class C52354GOy extends C51983GAg {
    public final ReentrantReadWriteLock A00 = new ReentrantReadWriteLock();

    public static ReentrantReadWriteLock A01(C52354GOy gOy, Object obj) {
        0qQ.A0B(obj, 0);
        return gOy.A00;
    }

    public final int A0B(C267324bN r3) {
        0qQ.A0B(r3, 0);
        ReentrantReadWriteLock.ReadLock readLock = this.A00.readLock();
        readLock.lock();
        try {
            return super.A0B(r3);
        } finally {
            readLock.unlock();
        }
    }

    public final C296995qz A0G(C267324bN r3) {
        0qQ.A0B(r3, 0);
        ReentrantReadWriteLock.ReadLock readLock = this.A00.readLock();
        readLock.lock();
        try {
            return super.B9o(r3);
        } finally {
            readLock.unlock();
        }
    }

    public final List A0K(C295365o2 r3) {
        0qQ.A0B(r3, 0);
        ReentrantReadWriteLock.ReadLock A08 = C52009GBg.A08(this);
        try {
            return super.A0K(r3);
        } finally {
            A08.unlock();
        }
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void A0T(X.C267324bN r7, boolean r8) {
        /*
            r6 = this;
            r5 = 1
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = A01(r6, r7)
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001d
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0015:
            if (r0 >= r2) goto L_0x001e
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0015
        L_0x001d:
            r2 = 0
        L_0x001e:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            super.A0T(r7, r5)     // Catch:{ all -> 0x0031 }
        L_0x0025:
            if (r3 >= r2) goto L_0x002d
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0025
        L_0x002d:
            r1.unlock()
            return
        L_0x0031:
            r0 = move-exception
        L_0x0032:
            if (r3 >= r2) goto L_0x003a
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0032
        L_0x003a:
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.A0T(X.4bN, boolean):void");
    }

    public final boolean A0a(C267324bN r3) {
        0qQ.A0B(r3, 0);
        ReentrantReadWriteLock.ReadLock A08 = C52009GBg.A08(this);
        try {
            return super.A0a(r3);
        } finally {
            A08.unlock();
        }
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void A0f(X.C267324bN r7, boolean r8) {
        /*
            r6 = this;
            r5 = 1
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r6.A00
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001b
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0013:
            if (r0 >= r2) goto L_0x001c
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0013
        L_0x001b:
            r2 = 0
        L_0x001c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            super.A0f(r7, r5)     // Catch:{ all -> 0x002f }
        L_0x0023:
            if (r3 >= r2) goto L_0x002b
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0023
        L_0x002b:
            r1.unlock()
            return
        L_0x002f:
            r0 = move-exception
        L_0x0030:
            if (r3 >= r2) goto L_0x0038
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0030
        L_0x0038:
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.A0f(X.4bN, boolean):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void A0g(X.C267324bN r7, boolean r8) {
        /*
            r6 = this;
            r5 = 1
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r6.A00
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001b
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0013:
            if (r0 >= r2) goto L_0x001c
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0013
        L_0x001b:
            r2 = 0
        L_0x001c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            super.A0g(r7, r5)     // Catch:{ all -> 0x002f }
        L_0x0023:
            if (r3 >= r2) goto L_0x002b
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0023
        L_0x002b:
            r1.unlock()
            return
        L_0x002f:
            r0 = move-exception
        L_0x0030:
            if (r3 >= r2) goto L_0x0038
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0030
        L_0x0038:
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.A0g(X.4bN, boolean):void");
    }

    public final AnonymousClass3W1 BQr(1Xj r3) {
        0qQ.A0B(r3, 0);
        ReentrantReadWriteLock.ReadLock A08 = C52009GBg.A08(this);
        try {
            return super.BQr(r3);
        } finally {
            A08.unlock();
        }
    }

    public final C52058GDe BzC(C267324bN r3) {
        0qQ.A0B(r3, 0);
        ReentrantReadWriteLock.ReadLock readLock = this.A00.readLock();
        readLock.lock();
        try {
            return super.BzC(r3);
        } finally {
            readLock.unlock();
        }
    }

    public final List BzD(C267324bN r3) {
        0qQ.A0B(r3, 0);
        ReentrantReadWriteLock.ReadLock A08 = C52009GBg.A08(this);
        try {
            return super.BzD(r3);
        } finally {
            A08.unlock();
        }
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void EXx(X.C267324bN r7, boolean r8) {
        /*
            r6 = this;
            r5 = 1
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r6.A00
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001b
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0013:
            if (r0 >= r2) goto L_0x001c
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0013
        L_0x001b:
            r2 = 0
        L_0x001c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            super.EXx(r7, r5)     // Catch:{ all -> 0x002f }
        L_0x0023:
            if (r3 >= r2) goto L_0x002b
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0023
        L_0x002b:
            r1.unlock()
            return
        L_0x002f:
            r0 = move-exception
        L_0x0030:
            if (r3 >= r2) goto L_0x0038
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0030
        L_0x0038:
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.EXx(X.4bN, boolean):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void Ea9(X.C267324bN r7, boolean r8) {
        /*
            r6 = this;
            r5 = 1
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r6.A00
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001b
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0013:
            if (r0 >= r2) goto L_0x001c
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0013
        L_0x001b:
            r2 = 0
        L_0x001c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            super.Ea9(r7, r5)     // Catch:{ all -> 0x002f }
        L_0x0023:
            if (r3 >= r2) goto L_0x002b
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0023
        L_0x002b:
            r1.unlock()
            return
        L_0x002f:
            r0 = move-exception
        L_0x0030:
            if (r3 >= r2) goto L_0x0038
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0030
        L_0x0038:
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.Ea9(X.4bN, boolean):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void Eec(X.C267324bN r7, boolean r8) {
        /*
            r6 = this;
            r5 = 1
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r6.A00
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001b
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0013:
            if (r0 >= r2) goto L_0x001c
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0013
        L_0x001b:
            r2 = 0
        L_0x001c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            super.Eec(r7, r5)     // Catch:{ all -> 0x002f }
        L_0x0023:
            if (r3 >= r2) goto L_0x002b
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0023
        L_0x002b:
            r1.unlock()
            return
        L_0x002f:
            r0 = move-exception
        L_0x0030:
            if (r3 >= r2) goto L_0x0038
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0030
        L_0x0038:
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.Eec(X.4bN, boolean):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void Eie(X.C267324bN r6, X.AnonymousClass3WA r7) {
        /*
            r5 = this;
            r0 = 1
            X.0qQ.A0B(r7, r0)
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A00
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001e
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0016:
            if (r0 >= r2) goto L_0x001f
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0016
        L_0x001e:
            r2 = 0
        L_0x001f:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            super.Eie(r6, r7)     // Catch:{ all -> 0x0032 }
        L_0x0026:
            if (r3 >= r2) goto L_0x002e
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0026
        L_0x002e:
            r1.unlock()
            return
        L_0x0032:
            r0 = move-exception
        L_0x0033:
            if (r3 >= r2) goto L_0x003b
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0033
        L_0x003b:
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.Eie(X.4bN, X.3WA):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void Ek5(X.C267324bN r6, X.HLU r7) {
        /*
            r5 = this;
            r0 = 1
            X.0qQ.A0B(r7, r0)
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A00
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001e
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0016:
            if (r0 >= r2) goto L_0x001f
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0016
        L_0x001e:
            r2 = 0
        L_0x001f:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            super.Ek5(r6, r7)     // Catch:{ all -> 0x0032 }
        L_0x0026:
            if (r3 >= r2) goto L_0x002e
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0026
        L_0x002e:
            r1.unlock()
            return
        L_0x0032:
            r0 = move-exception
        L_0x0033:
            if (r3 >= r2) goto L_0x003b
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0033
        L_0x003b:
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.Ek5(X.4bN, X.HLU):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void Ekk(X.C267324bN r7, boolean r8) {
        /*
            r6 = this;
            r5 = 0
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r6.A00
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001b
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0013:
            if (r0 >= r2) goto L_0x001c
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0013
        L_0x001b:
            r2 = 0
        L_0x001c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            super.Ekk(r7, r5)     // Catch:{ all -> 0x002f }
        L_0x0023:
            if (r3 >= r2) goto L_0x002b
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0023
        L_0x002b:
            r1.unlock()
            return
        L_0x002f:
            r0 = move-exception
        L_0x0030:
            if (r3 >= r2) goto L_0x0038
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0030
        L_0x0038:
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.Ekk(X.4bN, boolean):void");
    }

    public final int A0A() {
        ReentrantReadWriteLock.ReadLock readLock = this.A00.readLock();
        readLock.lock();
        try {
            return super.A0A();
        } finally {
            readLock.unlock();
        }
    }

    public final C267324bN A0E(int i) {
        ReentrantReadWriteLock.ReadLock readLock = this.A00.readLock();
        readLock.lock();
        try {
            return super.A0E(i);
        } finally {
            readLock.unlock();
        }
    }

    public final C267324bN A0F(int i) {
        ReentrantReadWriteLock.ReadLock readLock = this.A00.readLock();
        readLock.lock();
        try {
            return super.A0F(i);
        } finally {
            readLock.unlock();
        }
    }

    public final List A0I() {
        ReentrantReadWriteLock.ReadLock readLock = this.A00.readLock();
        readLock.lock();
        try {
            return super.A0I();
        } finally {
            readLock.unlock();
        }
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final java.util.List A0J(int r6, int r7) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A00
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001a
            int r2 = r1.getReadHoldCount()
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 >= r2) goto L_0x001c
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0012
        L_0x001a:
            r2 = 0
            goto L_0x0011
        L_0x001c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            java.util.List r0 = super.A0J(r6, r7)     // Catch:{ all -> 0x0030 }
        L_0x0024:
            if (r3 >= r2) goto L_0x002c
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0024
        L_0x002c:
            r1.unlock()
            return r0
        L_0x0030:
            r0 = move-exception
        L_0x0031:
            if (r3 >= r2) goto L_0x0039
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0031
        L_0x0039:
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.A0J(int, int):java.util.List");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void A0L() {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A00
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001a
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0012:
            if (r0 >= r2) goto L_0x001b
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0012
        L_0x001a:
            r2 = 0
        L_0x001b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            super.A0L()     // Catch:{ all -> 0x0023 }
            goto L_0x0030
        L_0x0023:
            r0 = move-exception
        L_0x0024:
            if (r3 >= r2) goto L_0x002c
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0024
        L_0x002c:
            r1.unlock()
            throw r0
        L_0x0030:
            if (r3 >= r2) goto L_0x0038
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0030
        L_0x0038:
            r1.unlock()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.A0L():void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void A0N() {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A00
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001a
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0012:
            if (r0 >= r2) goto L_0x001b
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0012
        L_0x001a:
            r2 = 0
        L_0x001b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            super.A0N()     // Catch:{ all -> 0x0023 }
            goto L_0x0030
        L_0x0023:
            r0 = move-exception
        L_0x0024:
            if (r3 >= r2) goto L_0x002c
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0024
        L_0x002c:
            r1.unlock()
            throw r0
        L_0x0030:
            if (r3 >= r2) goto L_0x0038
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0030
        L_0x0038:
            r1.unlock()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.A0N():void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void A0O(int r6, java.util.List r7) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A00
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001a
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0012:
            if (r0 >= r2) goto L_0x001b
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0012
        L_0x001a:
            r2 = 0
        L_0x001b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            super.A0O(r6, r7)     // Catch:{ all -> 0x002e }
        L_0x0022:
            if (r3 >= r2) goto L_0x002a
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0022
        L_0x002a:
            r1.unlock()
            return
        L_0x002e:
            r0 = move-exception
        L_0x002f:
            if (r3 >= r2) goto L_0x0037
            r4.lock()
            int r3 = r3 + 1
            goto L_0x002f
        L_0x0037:
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.A0O(int, java.util.List):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void A0Q(X.C267324bN r6, int r7) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A00
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001a
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0012:
            if (r0 >= r2) goto L_0x001b
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0012
        L_0x001a:
            r2 = 0
        L_0x001b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            super.A0Q(r6, r7)     // Catch:{ all -> 0x002e }
        L_0x0022:
            if (r3 >= r2) goto L_0x002a
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0022
        L_0x002a:
            r1.unlock()
            return
        L_0x002e:
            r0 = move-exception
        L_0x002f:
            if (r3 >= r2) goto L_0x0037
            r4.lock()
            int r3 = r3 + 1
            goto L_0x002f
        L_0x0037:
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.A0Q(X.4bN, int):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void A0S(X.C267324bN r6, com.instagram.model.people.PeopleTag r7) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A00
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001a
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0012:
            if (r0 >= r2) goto L_0x001b
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0012
        L_0x001a:
            r2 = 0
        L_0x001b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            super.A0S(r6, r7)     // Catch:{ all -> 0x002e }
        L_0x0022:
            if (r3 >= r2) goto L_0x002a
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0022
        L_0x002a:
            r1.unlock()
            return
        L_0x002e:
            r0 = move-exception
        L_0x002f:
            if (r3 >= r2) goto L_0x0037
            r4.lock()
            int r3 = r3 + 1
            goto L_0x002f
        L_0x0037:
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.A0S(X.4bN, com.instagram.model.people.PeopleTag):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void A0U(java.lang.String r6, int r7) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A00
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001a
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0012:
            if (r0 >= r2) goto L_0x001b
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0012
        L_0x001a:
            r2 = 0
        L_0x001b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            super.A0U(r6, r7)     // Catch:{ all -> 0x002e }
        L_0x0022:
            if (r3 >= r2) goto L_0x002a
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0022
        L_0x002a:
            r1.unlock()
            return
        L_0x002e:
            r0 = move-exception
        L_0x002f:
            if (r3 >= r2) goto L_0x0037
            r4.lock()
            int r3 = r3 + 1
            goto L_0x002f
        L_0x0037:
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.A0U(java.lang.String, int):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void A0V(java.util.List r6) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A00
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001a
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0012:
            if (r0 >= r2) goto L_0x001b
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0012
        L_0x001a:
            r2 = 0
        L_0x001b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            super.A0V(r6)     // Catch:{ all -> 0x002e }
        L_0x0022:
            if (r3 >= r2) goto L_0x002a
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0022
        L_0x002a:
            r1.unlock()
            return
        L_0x002e:
            r0 = move-exception
        L_0x002f:
            if (r3 >= r2) goto L_0x0037
            r4.lock()
            int r3 = r3 + 1
            goto L_0x002f
        L_0x0037:
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.A0V(java.util.List):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void A0W(java.util.List r6) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A00
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001a
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0012:
            if (r0 >= r2) goto L_0x001b
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0012
        L_0x001a:
            r2 = 0
        L_0x001b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            super.A0W(r6)     // Catch:{ all -> 0x002e }
        L_0x0022:
            if (r3 >= r2) goto L_0x002a
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0022
        L_0x002a:
            r1.unlock()
            return
        L_0x002e:
            r0 = move-exception
        L_0x002f:
            if (r3 >= r2) goto L_0x0037
            r4.lock()
            int r3 = r3 + 1
            goto L_0x002f
        L_0x0037:
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.A0W(java.util.List):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void A0X(boolean r6) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A00
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001a
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0012:
            if (r0 >= r2) goto L_0x001b
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0012
        L_0x001a:
            r2 = 0
        L_0x001b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            super.A0X(r6)     // Catch:{ all -> 0x0023 }
            goto L_0x0030
        L_0x0023:
            r0 = move-exception
        L_0x0024:
            if (r3 >= r2) goto L_0x002c
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0024
        L_0x002c:
            r1.unlock()
            throw r0
        L_0x0030:
            if (r3 >= r2) goto L_0x0038
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0030
        L_0x0038:
            r1.unlock()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.A0X(boolean):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final boolean A0b(X.C267324bN r6, int r7) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A00
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001a
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0012:
            if (r0 >= r2) goto L_0x001b
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0012
        L_0x001a:
            r2 = 0
        L_0x001b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            boolean r0 = super.A0b(r6, r7)     // Catch:{ all -> 0x002f }
        L_0x0023:
            if (r3 >= r2) goto L_0x002b
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0023
        L_0x002b:
            r1.unlock()
            return r0
        L_0x002f:
            r0 = move-exception
        L_0x0030:
            if (r3 >= r2) goto L_0x0038
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0030
        L_0x0038:
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.A0b(X.4bN, int):boolean");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void CM6(X.C267324bN r6) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A00
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001a
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0012:
            if (r0 >= r2) goto L_0x001b
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0012
        L_0x001a:
            r2 = 0
        L_0x001b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            super.CM6(r6)     // Catch:{ all -> 0x002e }
        L_0x0022:
            if (r3 >= r2) goto L_0x002a
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0022
        L_0x002a:
            r1.unlock()
            return
        L_0x002e:
            r0 = move-exception
        L_0x002f:
            if (r3 >= r2) goto L_0x0037
            r4.lock()
            int r3 = r3 + 1
            goto L_0x002f
        L_0x0037:
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.CM6(X.4bN):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void ER9(X.C267324bN r6, java.lang.Integer r7) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A00
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001a
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0012:
            if (r0 >= r2) goto L_0x001b
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0012
        L_0x001a:
            r2 = 0
        L_0x001b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            super.ER9(r6, r7)     // Catch:{ all -> 0x002e }
        L_0x0022:
            if (r3 >= r2) goto L_0x002a
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0022
        L_0x002a:
            r1.unlock()
            return
        L_0x002e:
            r0 = move-exception
        L_0x002f:
            if (r3 >= r2) goto L_0x0037
            r4.lock()
            int r3 = r3 + 1
            goto L_0x002f
        L_0x0037:
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.ER9(X.4bN, java.lang.Integer):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void ESM(X.C61081JwJ r6, X.C267324bN r7) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A00
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001a
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0012:
            if (r0 >= r2) goto L_0x001b
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0012
        L_0x001a:
            r2 = 0
        L_0x001b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            super.ESM(r6, r7)     // Catch:{ all -> 0x002e }
        L_0x0022:
            if (r3 >= r2) goto L_0x002a
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0022
        L_0x002a:
            r1.unlock()
            return
        L_0x002e:
            r0 = move-exception
        L_0x002f:
            if (r3 >= r2) goto L_0x0037
            r4.lock()
            int r3 = r3 + 1
            goto L_0x002f
        L_0x0037:
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.ESM(X.JwJ, X.4bN):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void EUB(X.C267324bN r6, java.lang.String r7) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A00
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001a
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0012:
            if (r0 >= r2) goto L_0x001b
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0012
        L_0x001a:
            r2 = 0
        L_0x001b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            super.EUB(r6, r7)     // Catch:{ all -> 0x0023 }
            goto L_0x0030
        L_0x0023:
            r0 = move-exception
        L_0x0024:
            if (r3 >= r2) goto L_0x002c
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0024
        L_0x002c:
            r1.unlock()
            throw r0
        L_0x0030:
            if (r3 >= r2) goto L_0x0038
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0030
        L_0x0038:
            r1.unlock()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.EUB(X.4bN, java.lang.String):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void EW2(X.C267324bN r6, X.0eP r7) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A00
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001a
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0012:
            if (r0 >= r2) goto L_0x001b
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0012
        L_0x001a:
            r2 = 0
        L_0x001b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            super.EW2(r6, r7)     // Catch:{ all -> 0x0023 }
            goto L_0x0030
        L_0x0023:
            r0 = move-exception
        L_0x0024:
            if (r3 >= r2) goto L_0x002c
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0024
        L_0x002c:
            r1.unlock()
            throw r0
        L_0x0030:
            if (r3 >= r2) goto L_0x0038
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0030
        L_0x0038:
            r1.unlock()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.EW2(X.4bN, X.0eP):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void EXM(X.C267324bN r6, int r7) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A00
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001a
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0012:
            if (r0 >= r2) goto L_0x001b
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0012
        L_0x001a:
            r2 = 0
        L_0x001b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            super.EXM(r6, r7)     // Catch:{ all -> 0x002e }
        L_0x0022:
            if (r3 >= r2) goto L_0x002a
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0022
        L_0x002a:
            r1.unlock()
            return
        L_0x002e:
            r0 = move-exception
        L_0x002f:
            if (r3 >= r2) goto L_0x0037
            r4.lock()
            int r3 = r3 + 1
            goto L_0x002f
        L_0x0037:
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.EXM(X.4bN, int):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void EXN(X.C267324bN r6, int r7) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A00
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001a
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0012:
            if (r0 >= r2) goto L_0x001b
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0012
        L_0x001a:
            r2 = 0
        L_0x001b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            super.EXN(r6, r7)     // Catch:{ all -> 0x002e }
        L_0x0022:
            if (r3 >= r2) goto L_0x002a
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0022
        L_0x002a:
            r1.unlock()
            return
        L_0x002e:
            r0 = move-exception
        L_0x002f:
            if (r3 >= r2) goto L_0x0037
            r4.lock()
            int r3 = r3 + 1
            goto L_0x002f
        L_0x0037:
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.EXN(X.4bN, int):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void EXP(X.C267324bN r6, int r7) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A00
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001a
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0012:
            if (r0 >= r2) goto L_0x001b
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0012
        L_0x001a:
            r2 = 0
        L_0x001b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            super.EXP(r6, r7)     // Catch:{ all -> 0x002e }
        L_0x0022:
            if (r3 >= r2) goto L_0x002a
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0022
        L_0x002a:
            r1.unlock()
            return
        L_0x002e:
            r0 = move-exception
        L_0x002f:
            if (r3 >= r2) goto L_0x0037
            r4.lock()
            int r3 = r3 + 1
            goto L_0x002f
        L_0x0037:
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.EXP(X.4bN, int):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void EXQ(X.C267324bN r6, int r7) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A00
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001a
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0012:
            if (r0 >= r2) goto L_0x001b
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0012
        L_0x001a:
            r2 = 0
        L_0x001b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            super.EXQ(r6, r7)     // Catch:{ all -> 0x002e }
        L_0x0022:
            if (r3 >= r2) goto L_0x002a
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0022
        L_0x002a:
            r1.unlock()
            return
        L_0x002e:
            r0 = move-exception
        L_0x002f:
            if (r3 >= r2) goto L_0x0037
            r4.lock()
            int r3 = r3 + 1
            goto L_0x002f
        L_0x0037:
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.EXQ(X.4bN, int):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void EXR(X.C267324bN r6, int r7) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A00
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001a
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0012:
            if (r0 >= r2) goto L_0x001b
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0012
        L_0x001a:
            r2 = 0
        L_0x001b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            super.EXR(r6, r7)     // Catch:{ all -> 0x002e }
        L_0x0022:
            if (r3 >= r2) goto L_0x002a
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0022
        L_0x002a:
            r1.unlock()
            return
        L_0x002e:
            r0 = move-exception
        L_0x002f:
            if (r3 >= r2) goto L_0x0037
            r4.lock()
            int r3 = r3 + 1
            goto L_0x002f
        L_0x0037:
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.EXR(X.4bN, int):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void EaD(X.C267324bN r6, boolean r7) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A00
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001a
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0012:
            if (r0 >= r2) goto L_0x001b
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0012
        L_0x001a:
            r2 = 0
        L_0x001b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            super.EaD(r6, r7)     // Catch:{ all -> 0x0023 }
            goto L_0x0030
        L_0x0023:
            r0 = move-exception
        L_0x0024:
            if (r3 >= r2) goto L_0x002c
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0024
        L_0x002c:
            r1.unlock()
            throw r0
        L_0x0030:
            if (r3 >= r2) goto L_0x0038
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0030
        L_0x0038:
            r1.unlock()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.EaD(X.4bN, boolean):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void EaO(X.C267324bN r6, boolean r7) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A00
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001a
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0012:
            if (r0 >= r2) goto L_0x001b
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0012
        L_0x001a:
            r2 = 0
        L_0x001b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            super.EaO(r6, r7)     // Catch:{ all -> 0x002e }
        L_0x0022:
            if (r3 >= r2) goto L_0x002a
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0022
        L_0x002a:
            r1.unlock()
            return
        L_0x002e:
            r0 = move-exception
        L_0x002f:
            if (r3 >= r2) goto L_0x0037
            r4.lock()
            int r3 = r3 + 1
            goto L_0x002f
        L_0x0037:
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.EaO(X.4bN, boolean):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void EaR(X.C267324bN r6, boolean r7) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A00
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001a
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0012:
            if (r0 >= r2) goto L_0x001b
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0012
        L_0x001a:
            r2 = 0
        L_0x001b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            super.EaR(r6, r7)     // Catch:{ all -> 0x0023 }
            goto L_0x0030
        L_0x0023:
            r0 = move-exception
        L_0x0024:
            if (r3 >= r2) goto L_0x002c
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0024
        L_0x002c:
            r1.unlock()
            throw r0
        L_0x0030:
            if (r3 >= r2) goto L_0x0038
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0030
        L_0x0038:
            r1.unlock()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.EaR(X.4bN, boolean):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void EaS(X.C267324bN r6, boolean r7) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A00
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001a
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0012:
            if (r0 >= r2) goto L_0x001b
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0012
        L_0x001a:
            r2 = 0
        L_0x001b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            super.EaS(r6, r7)     // Catch:{ all -> 0x002e }
        L_0x0022:
            if (r3 >= r2) goto L_0x002a
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0022
        L_0x002a:
            r1.unlock()
            return
        L_0x002e:
            r0 = move-exception
        L_0x002f:
            if (r3 >= r2) goto L_0x0037
            r4.lock()
            int r3 = r3 + 1
            goto L_0x002f
        L_0x0037:
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.EaS(X.4bN, boolean):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void EaW(X.C267324bN r6, boolean r7) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A00
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001a
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0012:
            if (r0 >= r2) goto L_0x001b
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0012
        L_0x001a:
            r2 = 0
        L_0x001b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            super.EaW(r6, r7)     // Catch:{ all -> 0x002e }
        L_0x0022:
            if (r3 >= r2) goto L_0x002a
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0022
        L_0x002a:
            r1.unlock()
            return
        L_0x002e:
            r0 = move-exception
        L_0x002f:
            if (r3 >= r2) goto L_0x0037
            r4.lock()
            int r3 = r3 + 1
            goto L_0x002f
        L_0x0037:
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.EaW(X.4bN, boolean):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void Eap(X.C267324bN r6, java.lang.Integer r7) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A00
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001a
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0012:
            if (r0 >= r2) goto L_0x001b
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0012
        L_0x001a:
            r2 = 0
        L_0x001b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            super.Eap(r6, r7)     // Catch:{ all -> 0x002e }
        L_0x0022:
            if (r3 >= r2) goto L_0x002a
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0022
        L_0x002a:
            r1.unlock()
            return
        L_0x002e:
            r0 = move-exception
        L_0x002f:
            if (r3 >= r2) goto L_0x0037
            r4.lock()
            int r3 = r3 + 1
            goto L_0x002f
        L_0x0037:
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.Eap(X.4bN, java.lang.Integer):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void Ekh(X.C267324bN r6, boolean r7) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A00
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001a
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0012:
            if (r0 >= r2) goto L_0x001b
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0012
        L_0x001a:
            r2 = 0
        L_0x001b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            super.Ekh(r6, r7)     // Catch:{ all -> 0x002e }
        L_0x0022:
            if (r3 >= r2) goto L_0x002a
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0022
        L_0x002a:
            r1.unlock()
            return
        L_0x002e:
            r0 = move-exception
        L_0x002f:
            if (r3 >= r2) goto L_0x0037
            r4.lock()
            int r3 = r3 + 1
            goto L_0x002f
        L_0x0037:
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.Ekh(X.4bN, boolean):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void Eki(X.C267324bN r6, boolean r7) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A00
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001a
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0012:
            if (r0 >= r2) goto L_0x001b
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0012
        L_0x001a:
            r2 = 0
        L_0x001b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            super.Eki(r6, r7)     // Catch:{ all -> 0x002e }
        L_0x0022:
            if (r3 >= r2) goto L_0x002a
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0022
        L_0x002a:
            r1.unlock()
            return
        L_0x002e:
            r0 = move-exception
        L_0x002f:
            if (r3 >= r2) goto L_0x0037
            r4.lock()
            int r3 = r3 + 1
            goto L_0x002f
        L_0x0037:
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.Eki(X.4bN, boolean):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void Ekj(X.C267324bN r6, boolean r7) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A00
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001a
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0012:
            if (r0 >= r2) goto L_0x001b
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0012
        L_0x001a:
            r2 = 0
        L_0x001b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            super.Ekj(r6, r7)     // Catch:{ all -> 0x002e }
        L_0x0022:
            if (r3 >= r2) goto L_0x002a
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0022
        L_0x002a:
            r1.unlock()
            return
        L_0x002e:
            r0 = move-exception
        L_0x002f:
            if (r3 >= r2) goto L_0x0037
            r4.lock()
            int r3 = r3 + 1
            goto L_0x002f
        L_0x0037:
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.Ekj(X.4bN, boolean):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void Ekl(X.C267324bN r6, boolean r7) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A00
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001a
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0012:
            if (r0 >= r2) goto L_0x001b
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0012
        L_0x001a:
            r2 = 0
        L_0x001b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            super.Ekl(r6, r7)     // Catch:{ all -> 0x002e }
        L_0x0022:
            if (r3 >= r2) goto L_0x002a
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0022
        L_0x002a:
            r1.unlock()
            return
        L_0x002e:
            r0 = move-exception
        L_0x002f:
            if (r3 >= r2) goto L_0x0037
            r4.lock()
            int r3 = r3 + 1
            goto L_0x002f
        L_0x0037:
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.Ekl(X.4bN, boolean):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void Ekn(X.C267324bN r6, boolean r7) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A00
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001a
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0012:
            if (r0 >= r2) goto L_0x001b
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0012
        L_0x001a:
            r2 = 0
        L_0x001b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            super.Ekn(r6, r7)     // Catch:{ all -> 0x002e }
        L_0x0022:
            if (r3 >= r2) goto L_0x002a
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0022
        L_0x002a:
            r1.unlock()
            return
        L_0x002e:
            r0 = move-exception
        L_0x002f:
            if (r3 >= r2) goto L_0x0037
            r4.lock()
            int r3 = r3 + 1
            goto L_0x002f
        L_0x0037:
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.Ekn(X.4bN, boolean):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final java.lang.String toString() {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A00
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001a
            int r2 = r1.getReadHoldCount()
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 >= r2) goto L_0x001c
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0012
        L_0x001a:
            r2 = 0
            goto L_0x0011
        L_0x001c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            java.lang.String r0 = super.toString()     // Catch:{ all -> 0x0030 }
        L_0x0024:
            if (r3 >= r2) goto L_0x002c
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0024
        L_0x002c:
            r1.unlock()
            return r0
        L_0x0030:
            r0 = move-exception
        L_0x0031:
            if (r3 >= r2) goto L_0x0039
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0031
        L_0x0039:
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.toString():java.lang.String");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52354GOy(ClipsViewerSource clipsViewerSource, UserSession userSession, boolean z) {
        super(clipsViewerSource, userSession, z);
        AnonymousClass7TG.A1O(userSession, clipsViewerSource);
    }

    public final int A0C(1Xj r3) {
        ReentrantReadWriteLock.ReadLock A08 = C52009GBg.A08(this);
        try {
            return super.A0C(r3);
        } finally {
            A08.unlock();
        }
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void A0R(X.C267324bN r6, X.C267324bN r7) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = A01(r5, r6)
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001c
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0014:
            if (r0 >= r2) goto L_0x001d
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0014
        L_0x001c:
            r2 = 0
        L_0x001d:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            super.A0R(r6, r7)     // Catch:{ all -> 0x0030 }
        L_0x0024:
            if (r3 >= r2) goto L_0x002c
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0024
        L_0x002c:
            r1.unlock()
            return
        L_0x0030:
            r0 = move-exception
        L_0x0031:
            if (r3 >= r2) goto L_0x0039
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0031
        L_0x0039:
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.A0R(X.4bN, X.4bN):void");
    }

    public final boolean A0Z() {
        ReentrantReadWriteLock.ReadLock A08 = C52009GBg.A08(this);
        try {
            return super.A0Z();
        } finally {
            A08.unlock();
        }
    }

    public final List A0d(Set set) {
        ReentrantReadWriteLock.ReadLock A08 = C52009GBg.A08(this);
        try {
            return super.A0d(set);
        } finally {
            A08.unlock();
        }
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void ESN(X.C267324bN r6, boolean r7) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = A01(r5, r6)
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001c
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0014:
            if (r0 >= r2) goto L_0x001d
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0014
        L_0x001c:
            r2 = 0
        L_0x001d:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            super.ESN(r6, r7)     // Catch:{ all -> 0x0030 }
        L_0x0024:
            if (r3 >= r2) goto L_0x002c
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0024
        L_0x002c:
            r1.unlock()
            return
        L_0x0030:
            r0 = move-exception
        L_0x0031:
            if (r3 >= r2) goto L_0x0039
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0031
        L_0x0039:
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.ESN(X.4bN, boolean):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void EaB(X.C267324bN r6, boolean r7) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = A01(r5, r6)
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001c
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0014:
            if (r0 >= r2) goto L_0x001d
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0014
        L_0x001c:
            r2 = 0
        L_0x001d:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            super.EaB(r6, r7)     // Catch:{ all -> 0x0030 }
        L_0x0024:
            if (r3 >= r2) goto L_0x002c
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0024
        L_0x002c:
            r1.unlock()
            return
        L_0x0030:
            r0 = move-exception
        L_0x0031:
            if (r3 >= r2) goto L_0x0039
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0031
        L_0x0039:
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.EaB(X.4bN, boolean):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void EaG(X.C267324bN r6, boolean r7) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = A01(r5, r6)
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001c
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0014:
            if (r0 >= r2) goto L_0x001d
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0014
        L_0x001c:
            r2 = 0
        L_0x001d:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            super.EaG(r6, r7)     // Catch:{ all -> 0x0025 }
            goto L_0x0032
        L_0x0025:
            r0 = move-exception
        L_0x0026:
            if (r3 >= r2) goto L_0x002e
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0026
        L_0x002e:
            r1.unlock()
            throw r0
        L_0x0032:
            if (r3 >= r2) goto L_0x003a
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0032
        L_0x003a:
            r1.unlock()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.EaG(X.4bN, boolean):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void EaH(X.C267324bN r6, boolean r7) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = A01(r5, r6)
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001c
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0014:
            if (r0 >= r2) goto L_0x001d
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0014
        L_0x001c:
            r2 = 0
        L_0x001d:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            super.EaH(r6, r7)     // Catch:{ all -> 0x0025 }
            goto L_0x0032
        L_0x0025:
            r0 = move-exception
        L_0x0026:
            if (r3 >= r2) goto L_0x002e
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0026
        L_0x002e:
            r1.unlock()
            throw r0
        L_0x0032:
            if (r3 >= r2) goto L_0x003a
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0032
        L_0x003a:
            r1.unlock()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.EaH(X.4bN, boolean):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void Eab(X.AnonymousClass07Z r6, X.C66626MZn r7) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = A01(r5, r7)
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001c
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0014:
            if (r0 >= r2) goto L_0x001d
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0014
        L_0x001c:
            r2 = 0
        L_0x001d:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            super.Eab(r6, r7)     // Catch:{ all -> 0x0025 }
            goto L_0x0032
        L_0x0025:
            r0 = move-exception
        L_0x0026:
            if (r3 >= r2) goto L_0x002e
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0026
        L_0x002e:
            r1.unlock()
            throw r0
        L_0x0032:
            if (r3 >= r2) goto L_0x003a
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0032
        L_0x003a:
            r1.unlock()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.Eab(X.07Z, X.MZn):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void Ear(X.C267324bN r6, java.lang.Integer r7) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = A01(r5, r6)
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001c
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0014:
            if (r0 >= r2) goto L_0x001d
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0014
        L_0x001c:
            r2 = 0
        L_0x001d:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            super.Ear(r6, r7)     // Catch:{ all -> 0x0030 }
        L_0x0024:
            if (r3 >= r2) goto L_0x002c
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0024
        L_0x002c:
            r1.unlock()
            return
        L_0x0030:
            r0 = move-exception
        L_0x0031:
            if (r3 >= r2) goto L_0x0039
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0031
        L_0x0039:
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.Ear(X.4bN, java.lang.Integer):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void EiN(X.C267324bN r6, X.HMA r7) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = A01(r5, r6)
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001c
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0014:
            if (r0 >= r2) goto L_0x001d
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0014
        L_0x001c:
            r2 = 0
        L_0x001d:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.C52009GBg.A09(r1)
            super.EiN(r6, r7)     // Catch:{ all -> 0x0030 }
        L_0x0024:
            if (r3 >= r2) goto L_0x002c
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0024
        L_0x002c:
            r1.unlock()
            return
        L_0x0030:
            r0 = move-exception
        L_0x0031:
            if (r3 >= r2) goto L_0x0039
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0031
        L_0x0039:
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52354GOy.EiN(X.4bN, X.HMA):void");
    }

    public final boolean equals(Object obj) {
        ReentrantReadWriteLock.ReadLock A08 = C52009GBg.A08(this);
        try {
            return super.equals(obj);
        } finally {
            A08.unlock();
        }
    }

    public final int hashCode() {
        ReentrantReadWriteLock.ReadLock A08 = C52009GBg.A08(this);
        try {
            return super.hashCode();
        } finally {
            A08.unlock();
        }
    }
}
