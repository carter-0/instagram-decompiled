package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.FFu  reason: case insensitive filesystem */
public final class C49941FFu {
    public ENP A00;
    public List A01 = AnonymousClass7TE.A1C();
    public List A02 = AnonymousClass7TE.A1C();
    public CopyOnWriteArrayList A03 = null;
    public CopyOnWriteArrayList A04 = null;
    public List A05;
    public List A06;
    public final Object A07 = new Object();

    public static void A00(0lg r3, C49941FFu fFu, String str) {
        if (str != null) {
            1NY A0N = DbU.A0N(r3);
            A0N.A0A("fb/ig_user/");
            A0N.A9m("big_blue_token", str);
            1OC A0N2 = DbY.A0N(A0N, Dv7.class, F67.class);
            EDV.A00(A0N2, fFu, r3, 22);
            1ES.A03(A0N2);
            return;
        }
        A01(fFu);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.1xE, java.lang.Object, X.FVf] */
    public static void A01(C49941FFu fFu) {
        Iterator it;
        synchronized (fFu.A07) {
            CopyOnWriteArrayList copyOnWriteArrayList = fFu.A03;
            copyOnWriteArrayList.getClass();
            it = copyOnWriteArrayList.iterator();
            fFu.A03.clear();
        }
        while (it.hasNext()) {
            it.next();
        }
        1xC r2 = 1xC.A01;
        ? obj = new Object();
        obj.A00 = null;
        r2.A00(obj);
    }

    public static void A02(C49941FFu fFu) {
        Iterator it;
        synchronized (fFu.A07) {
            fFu.A01 = AnonymousClass7TE.A1C();
            CopyOnWriteArrayList copyOnWriteArrayList = fFu.A04;
            copyOnWriteArrayList.getClass();
            it = copyOnWriteArrayList.iterator();
            fFu.A04.clear();
        }
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void A03(List list, CopyOnWriteArrayList copyOnWriteArrayList) {
        Iterator it;
        CopyOnWriteArrayList copyOnWriteArrayList2;
        String str;
        C376159Gt r0;
        synchronized (this.A07) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            List list2 = this.A02;
            A1C.addAll(list2);
            A1C2.addAll(list2);
            ENP enp = this.A00;
            if (enp != null) {
                C376149Gs r02 = FV8.A00().A01;
                if (r02 == null || (r0 = r02.A00) == null) {
                    str = null;
                } else {
                    str = r0.A01;
                }
                if (TextUtils.equals(str, enp.A02)) {
                    int indexOf = A1C.indexOf(enp);
                    if (indexOf >= 0) {
                        A1C.set(indexOf, enp);
                    } else {
                        A1C.add(enp);
                    }
                    A1C2.add(enp);
                }
            }
            for (ENO eno : this.A01) {
                if (A1C.indexOf(eno) < 0) {
                    A1C.add(eno);
                }
                A1C2.add(eno);
            }
            this.A06 = A1C;
            this.A05 = A1C2;
            it = copyOnWriteArrayList.iterator();
            copyOnWriteArrayList.clear();
            CopyOnWriteArrayList copyOnWriteArrayList3 = this.A04;
            if (!(copyOnWriteArrayList3 == null || !copyOnWriteArrayList3.isEmpty() || (copyOnWriteArrayList2 = this.A03) == null)) {
                copyOnWriteArrayList2.isEmpty();
            }
        }
        while (it.hasNext()) {
            it.next();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }
}
