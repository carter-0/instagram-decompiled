package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.OYj  reason: case insensitive filesystem */
public final class C71011OYj {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C333597Zo A03;

    public static void A00(C74485Pvf pvf, C74421Pub pub, C71011OYj oYj, C358248ab r18, C254743sy r19, Map map, int i, int i2, int i3, int i4, boolean z) {
        int i5;
        C358248ab r2 = r18;
        r2.A0s(false);
        r2.A0r(true);
        C71011OYj oYj2 = oYj;
        Context context = oYj2.A00;
        C74485Pvf pvf2 = pvf;
        C74421Pub pub2 = pub;
        C254743sy r10 = r19;
        Map map2 = map;
        int i6 = i3;
        int i7 = i4;
        if (z) {
            int i8 = i2;
            boolean A002 = AnonymousClass7LY.A00(i8);
            int i9 = 2131960375;
            if (A002) {
                i9 = 2131960374;
            }
            r2.A0Y(new C71197OfJ(pvf2, pub2, oYj2, r10, map2, i6, i7, 0), C358278ae.BLUE_BOLD, context.getString(i9), true);
            int i10 = i;
            if (A002) {
                i5 = 2131959619;
            } else {
                i5 = 2131960496;
                if (i == 0) {
                    i5 = 2131959628;
                }
            }
            r2.A0W(new C71192OfD(i10, i8, 0, pvf2, oYj2, r10), C358278ae.RED_BOLD, context.getString(i5), true);
            r2.A0C(new C71188Of7(pvf2, pub2, oYj2, i6));
            r2.A0B(new C71174Oeo(pvf2, pub2, oYj2, i6));
        } else {
            r2.A0d(new C71197OfJ(pvf2, pub2, oYj2, r10, map2, i6, i7, 1), context.getString(2131968772));
        }
        DbT.A1V(r2);
        if (i7 == 1) {
            A01(oYj2, r10, map2, i6);
        }
        pvf2.Dka();
    }

    public C71011OYj(Context context, AnonymousClass0iw r2, UserSession userSession, C333597Zo r4) {
        this.A00 = context;
        this.A02 = userSession;
        this.A03 = r4;
        this.A01 = r2;
    }

    public static void A01(C71011OYj oYj, C254743sy r9, Map map, int i) {
        ArrayList A1D = AnonymousClass7TE.A1D(map.keySet());
        if (i != 0) {
            UserSession userSession = oYj.A02;
            Oy2 oy2 = (Oy2) userSession.A01(Oy2.class, new C73914Plp(userSession, 16));
            0qQ.A0B(oy2, 0);
            String A0B = C66647MaG.A0B(r9);
            if (A0B != null) {
                Iterator it = A1D.iterator();
                while (it.hasNext()) {
                    String A18 = AnonymousClass7TE.A18(it);
                    synchronized (oy2) {
                        0qQ.A0B(A18, 1);
                        Set set = oy2.A01;
                        set.add(002.A0T(A0B, A18, '.'));
                        if (oy2.A02) {
                            oy2.A00.A00(set);
                        }
                    }
                }
                return;
            }
            return;
        }
        UserSession userSession2 = oYj.A02;
        C72190Oxz oxz = (C72190Oxz) userSession2.A01(C72190Oxz.class, new C73914Plp(userSession2, 15));
        0qQ.A0B(oxz, 0);
        String A0B2 = C66647MaG.A0B(r9);
        if (A0B2 != null) {
            Iterator it2 = A1D.iterator();
            while (it2.hasNext()) {
                String A182 = AnonymousClass7TE.A18(it2);
                synchronized (oxz) {
                    0qQ.A0B(A182, 1);
                    Set set2 = oxz.A01;
                    if (set2.add(002.A0T(A0B2, A182, '.'))) {
                        oxz.A00.A00(set2);
                    }
                }
            }
        }
    }
}
