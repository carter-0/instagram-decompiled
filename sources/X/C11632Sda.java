package X;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.Sda  reason: case insensitive filesystem */
public final class C11632Sda implements AnonymousClass2gO {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C11632Sda(C12472Sv4 sv4, String str, int i) {
        this.A00 = i;
        this.A01 = sv4;
        this.A02 = str;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        List A1B;
        Throwable th;
        List A1B2;
        if (this.A00 != 0) {
            SUj sUj = (SUj) obj;
            if (SUj.A0V(sUj)) {
                C10258RpI rpI = C9125RPx.A00;
                if (rpI == null) {
                    rpI = new C10258RpI();
                    C9125RPx.A00 = rpI;
                }
                C12472Sv4 sv4 = (C12472Sv4) this.A01;
                String str = sv4.A05;
                C11330SNj sNj = (C11330SNj) SUj.A0D(sUj);
                ConcurrentHashMap concurrentHashMap = rpI.A00;
                if (!concurrentHashMap.contains(str) || (A1B2 = Pxe.A1B(str, concurrentHashMap)) == null) {
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    copyOnWriteArrayList.add(sNj);
                    concurrentHashMap.put(str, copyOnWriteArrayList);
                } else {
                    A1B2.add(sNj);
                }
                ((C13736Tg8) sv4.A02).Das(this.A02);
                return;
            }
            if (SUj.A0S(sUj) && (th = sUj.A02) != null) {
                if (th instanceof C13224TQp) {
                    C13224TQp tQp = (C13224TQp) th;
                    ((C13736Tg8) ((C12472Sv4) this.A01).A02).Dap(Boolean.valueOf(tQp.A01), Integer.valueOf(tQp.A00), tQp);
                    return;
                }
                ((C13736Tg8) ((C12472Sv4) this.A01).A02).Dap((Boolean) null, (Integer) null, th);
            }
            ((C13736Tg8) ((C12472Sv4) this.A01).A02).Dap((Boolean) null, (Integer) null, new Exception("An unknown error was thrown during the authorization process"));
            return;
        }
        SUj sUj2 = (SUj) obj;
        boolean A0V = SUj.A0V(sUj2);
        C12472Sv4 sv42 = (C12472Sv4) this.A01;
        if (A0V) {
            ((C13736Tg8) sv42.A02).Das(this.A02);
            C10258RpI rpI2 = C9125RPx.A00;
            if (rpI2 == null) {
                rpI2 = new C10258RpI();
                C9125RPx.A00 = rpI2;
            }
            String str2 = sv42.A05;
            C11330SNj sNj2 = (C11330SNj) SUj.A0D(sUj2);
            ConcurrentHashMap concurrentHashMap2 = rpI2.A00;
            if (!concurrentHashMap2.contains(str2) || (A1B = Pxe.A1B(str2, concurrentHashMap2)) == null) {
                CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
                copyOnWriteArrayList2.add(sNj2);
                concurrentHashMap2.put(str2, copyOnWriteArrayList2);
                return;
            }
            A1B.add(sNj2);
            return;
        }
        ((C13736Tg8) sv42.A02).Dap((Boolean) null, (Integer) null, new Exception("An unknown error was thrown during the authorization process"));
    }
}
