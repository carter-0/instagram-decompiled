package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

/* renamed from: X.MjE  reason: case insensitive filesystem */
public final class C67156MjE implements C74398PuE {
    public final /* synthetic */ C66633Ma2 A00;

    public final boolean CbV(C254743sy r3) {
        0qQ.A0B(r3, 0);
        C67263Mkx mkx = this.A00.A0d;
        if (mkx == null || !mkx.A0D.containsKey(r3)) {
            return false;
        }
        return true;
    }

    public final void Drt(C66754Mbz mbz) {
        HashSet hashSet;
        HashSet hashSet2;
        C69298Niy niy;
        C67263Mkx mkx = this.A00.A0d;
        if (mkx != null) {
            C67496Moq moq = mkx.A01;
            if (moq != null) {
                C254743sy r3 = mbz.A04;
                0qQ.A0B(r3, 0);
                if (mkx.A0D.containsKey(r3)) {
                    moq.A0D.remove(r3);
                } else {
                    if (mbz.A08) {
                        niy = C69298Niy.GROUP_INCLUDED;
                    } else if (mbz.A0C) {
                        niy = C69298Niy.MESSAGE_REQUEST_INCLUDED;
                    } else {
                        Long l = mbz.A05;
                        if (l != null) {
                            if (System.currentTimeMillis() - TimeUnit.MILLISECONDS.convert(l.longValue(), TimeUnit.MICROSECONDS) > TimeUnit.DAYS.toMillis(30)) {
                                niy = C69298Niy.THREAD_TOO_OLD;
                            }
                        }
                        niy = C69298Niy.A05;
                    }
                    if (niy != C69298Niy.A05) {
                        moq.A0D.put(r3, niy);
                    }
                }
            }
            C254743sy r2 = mbz.A04;
            0qQ.A0B(r2, 0);
            HashMap hashMap = mkx.A0D;
            if (hashMap.containsKey(r2)) {
                hashMap.remove(r2);
                if (mbz.A0C) {
                    hashSet2 = mkx.A0E;
                } else {
                    hashSet2 = mkx.A0F;
                }
                hashSet2.remove(r2);
            } else {
                hashMap.put(r2, mbz);
                if (mbz.A0C) {
                    hashSet = mkx.A0E;
                } else {
                    hashSet = mkx.A0F;
                }
                hashSet.add(r2);
            }
            C67263Mkx.A05(mkx);
            mkx.A0C.A01();
        }
    }

    public C67156MjE(C66633Ma2 ma2) {
        this.A00 = ma2;
    }
}
