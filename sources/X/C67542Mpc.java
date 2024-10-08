package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.Mpc  reason: case insensitive filesystem */
public final class C67542Mpc implements AnonymousClass0lh {
    public final 1NH A00 = new 1NH(C60960kU.A00, new C41928B7f(0), 1427466249);
    public final ArrayList A01 = AnonymousClass7TE.A1C();
    public final HashSet A02 = AnonymousClass7TE.A1F();

    /* JADX WARNING: type inference failed for: r0v4, types: [X.CsM, java.lang.Object] */
    public final synchronized void A00(C68137N2b n2b) {
        HashSet hashSet = this.A02;
        String str = n2b.A01.A05;
        hashSet.add(str);
        ArrayList arrayList = this.A01;
        Iterator A1G = AnonymousClass7TE.A1G(arrayList);
        while (true) {
            if (!A1G.hasNext()) {
                break;
            }
            C68137N2b n2b2 = (C68137N2b) AnonymousClass7TF.A0a(A1G);
            if (0qQ.A0K(str, n2b2.A01.A05)) {
                arrayList.remove(n2b2);
                break;
            }
        }
        arrayList.add(0, n2b);
        if (arrayList.size() > 100) {
            arrayList.remove(100);
        }
        1NH r2 = this.A00;
        ? obj = new Object();
        obj.A00 = arrayList;
        r2.A05("direct_recent_stickers_file_key", obj);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.CsM, java.lang.Object] */
    public final synchronized void A01(C68137N2b n2b) {
        HashSet hashSet = this.A02;
        String str = n2b.A01.A05;
        hashSet.add(str);
        ArrayList arrayList = this.A01;
        Iterator A1G = AnonymousClass7TE.A1G(arrayList);
        while (true) {
            if (!A1G.hasNext()) {
                break;
            }
            C68137N2b n2b2 = (C68137N2b) AnonymousClass7TF.A0a(A1G);
            if (0qQ.A0K(str, n2b2.A01.A05)) {
                arrayList.remove(n2b2);
                break;
            }
        }
        1NH r2 = this.A00;
        ? obj = new Object();
        obj.A00 = arrayList;
        r2.A05("direct_recent_stickers_file_key", obj);
    }

    public final synchronized boolean A02(String str) {
        0qQ.A0B(str, 0);
        Iterator A1G = AnonymousClass7TE.A1G(this.A01);
        while (A1G.hasNext()) {
            if (str.equals(((C68137N2b) AnonymousClass7TF.A0a(A1G)).A01.A05)) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void onSessionWillEnd() {
        this.A01.clear();
        this.A02.clear();
    }

    public C67542Mpc(C61480nO r5) {
        r5.ATE(new C67544Mpe(this));
    }
}
