package X;

import com.google.gson.Gson;
import com.instagram.common.session.UserSession;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class GP6 {
    public double A00;
    public String A01;
    public final Gson A02;
    public final UserSession A03;
    public final 0xa A04;

    public GP6(UserSession userSession) {
        ArrayList A0v;
        ArrayList A0v2;
        this.A03 = userSession;
        0xa A032 = 1Al.A01(userSession).A03(1An.A0n);
        this.A04 = A032;
        C7210Pzc pzc = new C7210Pzc();
        pzc.A02(new Object(), C53271GlJ.class);
        this.A02 = pzc.A00();
        int A042 = DbS.A04(0Tu.A06, userSession, 36599018357394803L);
        if (A042 > DbT.A00(A032, "KEY_SWIPE_HISTORY_VERSION")) {
            0xY AR4 = A032.AR4();
            AR4.ED3("KEY_SWIPE_HISTORY_V2");
            AR4.ED3("KEY_PROFILE_SWIPE_HISTORY");
            AR4.E5Z("KEY_SWIPE_HISTORY_VERSION", A042);
            AR4.apply();
        }
        synchronized (this) {
            long A0l = G9t.A0l(90, System.currentTimeMillis());
            Type type = new C7212Pze().A00;
            0xa r8 = this.A04;
            String string = r8.getString("KEY_SWIPE_HISTORY_V2", (String) null);
            if (string != null) {
                Object A09 = this.A02.A09(string, type);
                0qQ.A07(A09);
                A0v = (ArrayList) A09;
            } else {
                A0v = DbS.A0v(20);
            }
            C58010Ik3.A00(A0v, new GQ2(A0l, 21), 1);
            0xY AR42 = r8.AR4();
            Gson gson = this.A02;
            AR42.E5g("KEY_SWIPE_HISTORY_V2", gson.A0B(A0v));
            AR42.apply();
            if (GP5.A02(this.A03)) {
                String string2 = r8.getString("KEY_PROFILE_SWIPE_HISTORY", (String) null);
                if (string2 != null) {
                    Object A092 = gson.A09(string2, type);
                    0qQ.A07(A092);
                    A0v2 = (ArrayList) A092;
                } else {
                    A0v2 = DbS.A0v(20);
                }
                C58010Ik3.A00(A0v2, new GQ2(A0l, 22), 1);
                0xY AR43 = r8.AR4();
                AR43.E5g("KEY_PROFILE_SWIPE_HISTORY", gson.A0B(A0v2));
                AR43.apply();
            }
        }
    }

    public static final boolean A00(GP6 gp6, ArrayList arrayList, double d, int i, int i2) {
        String str;
        int i3;
        double d2;
        double d3;
        int i4;
        long A0l = G9t.A0l(i, System.currentTimeMillis());
        UserSession userSession = gp6.A03;
        long A002 = GP5.A00(userSession);
        boolean A022 = GP5.A02(userSession);
        C58010Ik3.A00(arrayList, new GQ2(A0l, 19), 1);
        boolean z = false;
        int i5 = i2;
        if (arrayList.size() >= i5) {
            List<C53271GlJ> A0h = 00k.A0h(arrayList, i5);
            boolean z2 = A0h instanceof Collection;
            if (!z2 || !A0h.isEmpty()) {
                Iterator it = A0h.iterator();
                i3 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Boolean bool = ((C53271GlJ) it.next()).A01;
                    if (bool != null && bool.equals(true) && (i3 = i3 + 1) < 0) {
                        break;
                    }
                }
            } else {
                i3 = 0;
            }
            double d4 = (double) i3;
            if (arrayList.size() > 0) {
                d2 = d4 / ((double) i5);
            } else {
                d2 = gp6.A00;
            }
            gp6.A00 = d3;
            if (A022) {
                if (!z2 || !A0h.isEmpty()) {
                    i4 = 0;
                    for (C53271GlJ glJ : A0h) {
                        Long l = glJ.A02;
                        if (l != null && l.longValue() >= A002 && (i4 = i4 + 1) < 0) {
                            0sr.A1S();
                            throw AnonymousClass00P.createAndThrow();
                        }
                    }
                } else {
                    i4 = 0;
                }
                double d5 = (double) i4;
                if (arrayList.size() > 0) {
                    d3 = (d4 + d5) / ((double) i5);
                } else {
                    d3 = gp6.A00;
                }
                gp6.A00 = d3;
            }
            if (d3 >= d) {
                z = true;
                str = "good_swiper";
            } else {
                str = "bad_swiper";
            }
        } else {
            str = "not_swiper";
        }
        gp6.A01 = str;
        return z;
    }

    public static final boolean A01(GP6 gp6, ArrayList arrayList, double d, int i, int i2) {
        String str;
        int i3;
        int i4;
        long A0l = G9t.A0l(i, System.currentTimeMillis());
        UserSession userSession = gp6.A03;
        long A002 = GP5.A00(userSession);
        boolean A022 = GP5.A02(userSession);
        C58010Ik3.A00(arrayList, new GQ2(A0l, 20), 1);
        boolean z = false;
        if (arrayList.size() >= i2) {
            boolean z2 = arrayList instanceof Collection;
            if (!z2 || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                i3 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Boolean bool = ((C53271GlJ) it.next()).A01;
                    if (bool != null && bool.equals(true) && (i3 = i3 + 1) < 0) {
                        break;
                    }
                }
            } else {
                i3 = 0;
            }
            double d2 = (double) i3;
            double size = d2 / ((double) arrayList.size());
            gp6.A00 = size;
            if (A022) {
                if (!z2 || !arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    i4 = 0;
                    while (it2.hasNext()) {
                        Long l = ((C53271GlJ) it2.next()).A02;
                        if (l != null && l.longValue() >= A002 && (i4 = i4 + 1) < 0) {
                            0sr.A1S();
                            throw AnonymousClass00P.createAndThrow();
                        }
                    }
                } else {
                    i4 = 0;
                }
                size = (d2 + ((double) i4)) / ((double) arrayList.size());
                gp6.A00 = size;
            }
            if (size >= d) {
                z = true;
                str = "good_swiper";
            } else {
                str = "bad_swiper";
            }
        } else {
            str = "not_swiper";
        }
        gp6.A01 = str;
        return z;
    }
}
