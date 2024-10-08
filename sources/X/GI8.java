package X;

import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class GI8 {
    public final UserSession A00;
    public final String A01;
    public final List A02;

    public static final boolean A02(List list) {
        if (list != null && (!(list instanceof Collection) || !list.isEmpty())) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
                0qQ.A07(lowerCase);
                if (new 11S("av01\\.0\\.[0-9]+m\\.10\\..*").A08(lowerCase)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A03(List list) {
        if (list != null && (!(list instanceof Collection) || !list.isEmpty())) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
                0qQ.A07(lowerCase);
                if (00p.A0k(lowerCase, "vp09.02", false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A00(GI8 gi8) {
        List<C233192vD> A1P = 0sr.A1P(new C233192vD[]{C233192vD.REEL_PROFILE, C233192vD.REELS_PROFILE, C233192vD.REELS_SELF_PROFILE, C233192vD.REELS_FEED_CONTEXTUAL_PROFILE, C233192vD.REELS_FEED_CONTEXTUAL_SELF_PROFILE});
        if (!(A1P instanceof Collection) || !A1P.isEmpty()) {
            for (C233192vD r0 : A1P) {
                if (0qQ.A0K(r0.A00, gi8.A01)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A01(GI8 gi8) {
        List<C233192vD> A1P = 0sr.A1P(new C233192vD[]{C233192vD.REELS_SAVE_COLLECTION, C233192vD.REELS_CLIPS_SAVED_TAB});
        if (!(A1P instanceof Collection) || !A1P.isEmpty()) {
            for (C233192vD r0 : A1P) {
                if (0qQ.A0K(r0.A00, gi8.A01)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A04() {
        /*
            r10 = this;
            java.util.List r6 = r10.A02
            r9 = 1
            r5 = 0
            if (r6 == 0) goto L_0x0010
            boolean r0 = r6 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0115
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0115
        L_0x0010:
            com.instagram.common.session.UserSession r4 = r10.A00
            X.0Tu r3 = X.0Tu.A05
            r0 = 36324638661292227(0x810d11000030c3, double:3.035185984756285E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 != 0) goto L_0x0098
            if (r5 == 0) goto L_0x009f
            boolean r5 = A02(r6)
            java.lang.String r1 = r10.A01
            java.lang.String r0 = "clips_viewer_clips_tab"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x009d
            r0 = 36320124650659880(0x8108f600002028, double:3.032331306255927E-306)
            boolean r2 = X.182.A06(r3, r4, r0)
            r0 = 36320124650725417(0x8108f600012029, double:3.032331306297373E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r2 != 0) goto L_0x0047
            if (r0 == 0) goto L_0x009d
            if (r5 == 0) goto L_0x009d
        L_0x0047:
            r8 = 1
        L_0x0048:
            boolean r0 = A00(r10)
            if (r0 == 0) goto L_0x009b
            r0 = 36320124650790954(0x8108f60002202a, double:3.032331306338819E-306)
            boolean r2 = X.182.A06(r3, r4, r0)
            r0 = 36320124650856491(0x8108f60003202b, double:3.0323313063802646E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r2 != 0) goto L_0x0066
            if (r0 == 0) goto L_0x009b
            if (r5 == 0) goto L_0x009b
        L_0x0066:
            r7 = 1
        L_0x0067:
            boolean r0 = A01(r10)
            if (r0 == 0) goto L_0x0099
            r0 = 36320124650922028(0x8108f60004202c, double:3.0323313064217104E-306)
            boolean r2 = X.182.A06(r3, r4, r0)
            r0 = 36320124650987565(0x8108f60005202d, double:3.032331306463156E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r2 != 0) goto L_0x0085
            if (r0 == 0) goto L_0x0099
            if (r5 == 0) goto L_0x0099
        L_0x0085:
            r2 = 1
        L_0x0086:
            r0 = 36320124651053102(0x8108f60006202e, double:3.032331306504602E-306)
            boolean r5 = X.182.A06(r3, r4, r0)
        L_0x008f:
            if (r8 != 0) goto L_0x0098
            if (r7 != 0) goto L_0x0098
            if (r2 != 0) goto L_0x0098
            if (r5 != 0) goto L_0x0098
            r9 = 0
        L_0x0098:
            return r9
        L_0x0099:
            r2 = 0
            goto L_0x0086
        L_0x009b:
            r7 = 0
            goto L_0x0067
        L_0x009d:
            r8 = 0
            goto L_0x0048
        L_0x009f:
            boolean r6 = A03(r6)
            r0 = 36316246295908527(0x81056f000b10af, double:3.02987861909429E-306)
            boolean r5 = X.182.A06(r3, r4, r0)
            java.lang.String r1 = r10.A01
            java.lang.String r0 = "clips_viewer_clips_tab"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0110
            r0 = 36316246295187623(0x81056f000010a7, double:3.0298786186383877E-306)
            boolean r2 = X.182.A06(r3, r4, r0)
            r0 = 36316246295515306(0x81056f000510aa, double:3.029878618845616E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r2 == 0) goto L_0x0110
            if (r0 == 0) goto L_0x00ce
            if (r6 == 0) goto L_0x0110
        L_0x00ce:
            r8 = 1
        L_0x00cf:
            boolean r0 = A00(r10)
            if (r0 == 0) goto L_0x010e
            r0 = 36316246296039601(0x81056f000d10b1, double:3.029878619177182E-306)
            boolean r2 = X.182.A06(r3, r4, r0)
            r0 = 36316246295515306(0x81056f000510aa, double:3.029878618845616E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r2 == 0) goto L_0x010e
            if (r0 == 0) goto L_0x00ed
            if (r6 == 0) goto L_0x010e
        L_0x00ed:
            r7 = 1
        L_0x00ee:
            boolean r0 = A01(r10)
            if (r0 == 0) goto L_0x0112
            r0 = 36316246295974064(0x81056f000c10b0, double:3.029878619135736E-306)
            boolean r2 = X.182.A06(r3, r4, r0)
            r0 = 36316246295515306(0x81056f000510aa, double:3.029878618845616E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r2 == 0) goto L_0x0112
            if (r0 == 0) goto L_0x010c
            if (r6 == 0) goto L_0x0112
        L_0x010c:
            r2 = 1
            goto L_0x008f
        L_0x010e:
            r7 = 0
            goto L_0x00ee
        L_0x0110:
            r8 = 0
            goto L_0x00cf
        L_0x0112:
            r2 = 0
            goto L_0x008f
        L_0x0115:
            java.util.Iterator r2 = r6.iterator()
        L_0x0119:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0010
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r0)
            X.0qQ.A07(r1)
            java.lang.String r0 = "av01"
            boolean r0 = X.00p.A0k(r1, r0, r5)
            if (r0 == 0) goto L_0x0119
            r5 = 1
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GI8.A04():boolean");
    }

    public GI8(UserSession userSession, String str, List list) {
        this.A00 = userSession;
        this.A02 = list;
        this.A01 = str;
    }
}
