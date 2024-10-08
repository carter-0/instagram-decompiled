package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Hwn  reason: case insensitive filesystem */
public abstract class C56336Hwn {
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003a, code lost:
        r1 = r7.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass0iw r6, com.instagram.common.session.UserSession r7, X.C255773uh r8, int r9, boolean r10) {
        /*
            r2 = 1
            X.0wc r1 = X.AnonymousClass0kN.A01(r6, r7)
            java.lang.String r0 = "ig_threads_in_stories_unit_post_vpvd_imp"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            X.4gD r7 = r8.A0D
            r0 = 21
            java.lang.String r6 = X.C273654mx.A00(r0)
            X.17k.A07(r7, r6)
            r8 = 0
            if (r7 == 0) goto L_0x00ad
            X.3IS r0 = r7.A00
            java.util.List r0 = r0.BPz()
            if (r0 == 0) goto L_0x00ad
            int r0 = r0.size()
            if (r0 <= r2) goto L_0x00ad
            java.lang.String r4 = "three_media"
        L_0x0029:
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x00ac
            java.lang.String r0 = "ig_threads_in_stories_unit"
            X.DbS.A1O(r3, r0)
            X.17k.A07(r7, r6)
            r5 = 0
            if (r7 == 0) goto L_0x00b1
            X.3IS r1 = r7.A00
            java.util.List r0 = r1.BPz()
            if (r0 == 0) goto L_0x00b1
            X.1Xj r0 = X.DbZ.A0T(r0, r9)
            if (r0 == 0) goto L_0x00b1
            java.lang.String r0 = r0.A2n()
            if (r0 == 0) goto L_0x00b1
            r2 = 10
            java.lang.Long r0 = X.00y.A0n(r2, r0)
            if (r0 == 0) goto L_0x00b1
            X.C51965G9l.A1E(r3, r0)
            X.17k.A07(r7, r6)
            java.util.List r0 = r1.BPz()
            if (r0 == 0) goto L_0x0066
            int r8 = r0.size()
        L_0x0066:
            X.C51969G9p.A17(r3, r8)
            X.C51969G9p.A16(r3, r9)
            X.DbY.A1C(r3)
            X.17k.A07(r7, r6)
            java.lang.String r0 = r1.Bir()
            if (r0 != 0) goto L_0x007a
            java.lang.String r0 = ""
        L_0x007a:
            java.lang.Long r1 = X.00y.A0n(r2, r0)
            java.lang.String r0 = "quick_promotion_id"
            r3.A9F(r0, r1)
            X.17k.A07(r7, r6)
            java.lang.String r0 = r7.getId()
            java.lang.Long r1 = X.00y.A0n(r2, r0)
            java.lang.String r0 = "netego_id"
            r3.A9F(r0, r1)
            java.lang.String r0 = "sum_duration_ms"
            r3.A8D(r0, r5)
            X.C51965G9l.A1Q(r3, r5)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)
            java.lang.String r0 = "is_sub_impression"
            r3.A7p(r0, r1)
            java.lang.String r0 = "displayed_card_type"
            r3.AAJ(r0, r4)
            r3.Cgf()
        L_0x00ac:
            return
        L_0x00ad:
            java.lang.String r4 = "one_media"
            goto L_0x0029
        L_0x00b1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56336Hwn.A00(X.0iw, com.instagram.common.session.UserSession, X.3uh, int, boolean):void");
    }

    public static final void A01(AnonymousClass0iw r4, UserSession userSession, C255773uh r6, boolean z) {
        String str;
        Long l;
        Long l2;
        List BPz;
        List BPz2;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r4, userSession), "ig_threads_in_stories_unit_tray_vpvd_imp");
        C270114gD r62 = r6.A0D;
        String A00 = C273654mx.A00(21);
        17k.A07(r62, A00);
        int i = 0;
        if (r62 == null || (BPz2 = r62.A00.BPz()) == null || BPz2.size() <= 1) {
            str = "one_media";
        } else {
            str = "three_media";
        }
        if (A0e.isSampled()) {
            DbS.A1O(A0e, "ig_threads_in_stories_unit");
            17k.A07(r62, A00);
            if (!(r62 == null || (BPz = r62.A00.BPz()) == null)) {
                i = BPz.size();
            }
            C51969G9p.A17(A0e, i);
            A0e.A8k("media_index", (Integer) null);
            DbY.A1C(A0e);
            17k.A07(r62, A00);
            if (r62 != null) {
                String Bir = r62.A00.Bir();
                if (Bir == null) {
                    Bir = "";
                }
                l = AnonymousClass7TE.A10(Bir);
            } else {
                l = null;
            }
            A0e.A9F("quick_promotion_id", l);
            17k.A07(r62, A00);
            if (r62 != null) {
                l2 = AnonymousClass7TE.A10(r62.getId());
            } else {
                l2 = null;
            }
            A0e.A9F("netego_id", l2);
            A0e.A8D("sum_duration_ms", (Double) null);
            C51965G9l.A1Q(A0e, (String) null);
            A0e.A7p("is_sub_impression", Boolean.valueOf(z));
            A0e.AAJ("displayed_card_type", str);
            A0e.Cgf();
        }
    }
}
