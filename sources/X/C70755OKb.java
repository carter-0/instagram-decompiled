package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.OKb  reason: case insensitive filesystem */
public final class C70755OKb {
    public final LinkedHashMap A00;
    public final ReentrantReadWriteLock A01 = new ReentrantReadWriteLock();
    public final int A02;

    public final void A00(C69267NiT niT, String str) {
        0qQ.A0B(str, 0);
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A01;
            reentrantReadWriteLock.writeLock().lock();
            LinkedHashMap linkedHashMap = this.A00;
            if (linkedHashMap.containsKey(str)) {
                linkedHashMap.remove(str);
            }
            linkedHashMap.put(str, niT);
            Iterator A0s = AnonymousClass7TF.A0s(linkedHashMap);
            while (linkedHashMap.size() > this.A02 && A0s.hasNext()) {
                A0s.next();
                A0s.remove();
            }
            C66580MXl.A1W(reentrantReadWriteLock);
        } catch (Throwable th) {
            C66580MXl.A1W(this.A01);
            throw th;
        }
    }

    public C70755OKb(int i) {
        this.A02 = i;
        this.A00 = DbS.A0x(i);
    }
}
