package X;

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.WOx  reason: case insensitive filesystem */
public final class C19191WOx implements C21051XBs, X3U, X3V {
    public final C17201VMf A00;
    public final C17487VXq A01;
    public final String A02;
    public final List A03;
    public final Bundle A04 = new Bundle();
    public final C16606Uy2 A05 = C16606Uy2.SWIPE_TO_OPEN;
    public final String A06;
    public final List A07;

    public final C15433Ucj A00(int i) {
        Object obj;
        Object obj2;
        List AYc;
        List list = this.A07;
        if (list.isEmpty()) {
            return null;
        }
        Object obj3 = list.get(i);
        0qQ.A0C(obj3, "null cannot be cast to non-null type com.instagram.canvas.framework.model.data.HasLinkAction");
        List AYc2 = ((X3U) obj3).AYc();
        if (AYc2 == null || AYc2.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                C21051XBs xBs = (C21051XBs) obj;
                if ((xBs instanceof C15433Ucj) && (AYc = ((X3U) xBs).AYc()) != null && !AYc.isEmpty()) {
                    break;
                }
            }
            obj2 = (C21051XBs) obj;
            if (obj2 == null) {
                return null;
            }
        } else {
            obj2 = list.get(i);
            0qQ.A0C(obj2, AnonymousClass000.A00(332));
        }
        return (C15433Ucj) obj2;
    }

    public final List AYc() {
        return this.A03;
    }

    public final int B9r() {
        return 100;
    }

    public final C17201VMf BOJ() {
        return this.A00;
    }

    public final C17487VXq C25() {
        return this.A01;
    }

    public final C16606Uy2 CAU() {
        return this.A05;
    }

    public final String getId() {
        return this.A06;
    }

    public C19191WOx(C17332VRl vRl, C17201VMf vMf, C17487VXq vXq, String str, String str2, List list) {
        List list2;
        this.A06 = str;
        this.A01 = vXq;
        this.A03 = list;
        this.A00 = vMf;
        this.A02 = str2;
        if (vRl != null) {
            list2 = C51966G9m.A1J(vRl.A00);
        } else {
            list2 = 0sn.A00;
        }
        this.A07 = list2;
    }
}
