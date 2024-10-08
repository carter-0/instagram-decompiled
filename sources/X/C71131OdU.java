package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OdU  reason: case insensitive filesystem */
public final class C71131OdU {
    public static final C71131OdU A00 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        if (X.OPS.A00(r4, r7) == 0) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.content.Context r17, X.N4G r18, X.AnonymousClass0iw r19, com.instagram.common.session.UserSession r20, X.C69620Np2 r21, java.util.Collection r22, java.util.List r23, boolean r24, boolean r25) {
        /*
            r6 = 0
            r9 = 0
            r7 = r22
            boolean r15 = X.DbW.A1Y(r7)
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0016
            java.lang.String r1 = "DirectPermissionControls"
            java.lang.String r0 = "No implementation exists to accept all threads."
            X.0wb.A03(r1, r0)
            return
        L_0x0016:
            r4 = r20
            if (r24 != 0) goto L_0x0022
            int r0 = X.OPS.A00(r4, r7)
            r16 = 1
            if (r0 != 0) goto L_0x0024
        L_0x0022:
            r16 = 0
        L_0x0024:
            r3 = r18
            int r14 = r3.A00
            r0 = -1
            r10 = r19
            r13 = r23
            if (r14 == r0) goto L_0x0040
            r11 = r4
            r12 = r6
            X.A06.A00(r10, r11, r12, r13, r14, r15, r16)
        L_0x0034:
            if (r24 != 0) goto L_0x006f
            X.0sn r8 = X.0sn.A00
            r2 = r17
            r5 = r21
            A01(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x0040:
            X.0wc r1 = X.AnonymousClass0kN.A01(r10, r4)
            java.lang.String r0 = "direct_requests_allow_swipe"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r16)
            java.lang.String r0 = "is_interop"
            r2.A7p(r0, r1)
            boolean r0 = X.AnonymousClass7TE.A1b(r13)
            if (r0 == 0) goto L_0x0062
            java.lang.String r1 = r13.toString()
            java.lang.String r0 = "labels"
            r2.AAJ(r0, r1)
        L_0x0062:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
            java.lang.String r0 = "is_unread"
            r2.A7p(r0, r1)
            r2.Cgf()
            goto L_0x0034
        L_0x006f:
            java.lang.Object r0 = X.00k.A09(r7)
            java.lang.String r0 = (java.lang.String) r0
            long r0 = java.lang.Long.parseLong(r0)
            r2 = r25
            A04(r3, r4, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71131OdU.A00(android.content.Context, X.N4G, X.0iw, com.instagram.common.session.UserSession, X.Np2, java.util.Collection, java.util.List, boolean, boolean):void");
    }

    public static final void A01(Context context, N4G n4g, UserSession userSession, C69620Np2 np2, String str, Collection collection, Collection collection2, int i) {
        Long A10;
        Collection collection3 = collection;
        N4G n4g2 = n4g;
        UserSession userSession2 = userSession;
        if (!collection.isEmpty()) {
            N4G n4g3 = n4g;
            NHx nHx = new NHx(context, n4g2, userSession2, np2, AnonymousClass05K.A00, collection3, i);
            A03(n4g3, nHx, userSession, str, collection3, collection.size());
        }
        if (!collection2.isEmpty()) {
            Iterator it = collection2.iterator();
            while (it.hasNext()) {
                C74516PwB pwB = (C74516PwB) it.next();
                String A0B = C66647MaG.A0B(pwB.CBV());
                if (!(A0B == null || (A10 = AnonymousClass7TE.A10(A0B)) == null)) {
                    A04(n4g2, userSession, A10.longValue(), pwB.CUG());
                }
            }
        }
    }

    public static final void A02(Context context, UserSession userSession, Integer num, Collection collection, List list, boolean z) {
        0qQ.A0B(context, 0);
        AnonymousClass7TG.A1P(userSession, list);
        if (!collection.isEmpty()) {
            2Dm A002 = 1bJ.A00(userSession);
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                AnonymousClass3U9 A0a = C66581MXm.A0a(A002, AnonymousClass7TE.A18(it));
                if (A0a != null) {
                    new C67100MiK(context, userSession).A04(A0a.BJz(), num, z);
                }
            }
        }
        if (AnonymousClass7TE.A1b(list)) {
            C68966Nbt nbt = new C68966Nbt(context, userSession);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                nbt.A05((C254743sy) it2.next(), false);
            }
        }
    }

    public static final void A03(N4G n4g, C272124k8 r5, UserSession userSession, String str, Collection collection, int i) {
        1NY A0a;
        if (i == 1) {
            Object next = collection.iterator().next();
            0qQ.A0B(next, 1);
            A0a = AnonymousClass7TG.A0a(userSession);
            A0a.A0K("direct_v2/threads/%s/%s/", new Object[]{next, C273654mx.A00(543)});
        } else {
            A0a = AnonymousClass7TG.A0a(userSession);
            A0a.A0A("direct_v2/threads/approve_multiple/");
            A0a.A9m("thread_ids", C51970G9q.A0k(collection));
        }
        A0a.A0Q(1XP.class, 1XY.class);
        int i2 = n4g.A00;
        if (i2 != -1) {
            A0a.A9m("folder", String.valueOf(i2));
            if (i2 == 7) {
                String str2 = n4g.A01;
                if (str2 != null) {
                    A0a.A9m("custom_folder_id", str2);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
        }
        if (str != null) {
            A0a.A9m("filter", str);
        }
        1OC A0M = A0a.A0M();
        A0M.A00 = r5;
        1ES.A03(A0M);
    }

    public static final void A04(N4G n4g, UserSession userSession, long j, boolean z) {
        1aU r1;
        AnonymousClass68Z oug;
        1a8 A0O = C66580MXl.A0O();
        MYb mYb = MYc.A01(userSession, "DirectPermissionControls").A01;
        if (!z) {
            boolean A06 = 182.A06(0Tu.A05, userSession, 36313166804354869L);
            Long valueOf = Long.valueOf(j);
            if (A06) {
                int i = n4g.A00;
                r1 = mYb.A0A;
                oug = new C72020Ouu(valueOf, i);
            } else {
                r1 = mYb.A0B;
                oug = new C72006Oug(valueOf);
            }
            1aU A0M = r1.A0M(oug);
            0qQ.A0A(A0M);
            A0O.A02(A0M, PU6.A00);
        }
    }
}
