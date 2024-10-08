package com.instagram.mediakit.api;

import X.002;
import X.0qQ;
import X.15p;
import X.1Fa;
import X.1NY;
import X.1XP;
import X.1XY;
import X.AnonymousClass1XT;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C20592WvV;
import X.C268654dm;
import X.C268664dn;
import X.C268674do;
import X.C61279K0q;
import X.C61281K0s;
import X.C62661KkN;
import X.C64127LPb;
import X.DbS;
import X.DbT;
import X.DbV;
import X.Dbf;
import X.JUM;
import X.LDW;
import X.LJD;
import X.LJE;
import X.MCA;
import X.MGG;
import X.MGW;
import X.MXF;
import com.instagram.common.session.UserSession;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

public final class MediaKitApi implements MXF {
    public final UserSession A00;
    public final LDW A01;
    public final LDW A02;

    public static void A01(1Fa r2, Object obj) {
        String format = String.format("media_kit/%s/", Arrays.copyOf(new Object[]{obj}, 1));
        0qQ.A07(format);
        r2.A0E = format;
    }

    public final MCA A04(String str) {
        0qQ.A0B(str, 0);
        1NY A0a = AnonymousClass7TG.A0a(this.A00);
        A00(A0a);
        A01(A0a, 002.A0R(str, "/delete"));
        return JUM.A01(new C20592WvV(this, (AnonymousClass4D7) null, 49), DbT.A0R((15p) null, A0a, 1XP.class, 1XY.class, false).A03(240273335));
    }

    public final MCA A05(String str) {
        0qQ.A0B(str, 0);
        1NY A0b = AnonymousClass7TG.A0b(this.A00);
        A00(A0b);
        A01(A0b, str);
        return JUM.A01(MGW.A01(this, (AnonymousClass4D7) null, 1), JUM.A00(MGW.A01(this, (AnonymousClass4D7) null, 0), DbT.A0R((15p) null, A0b, C61281K0s.class, LJD.class, false).A03(763626105)));
    }

    public final MCA A06(Map map, boolean z) {
        1NY A0a = AnonymousClass7TG.A0a(this.A00);
        A00(A0a);
        A01(A0a, "create_or_update_media_kit");
        A0a.A0O((15p) null, C61281K0s.class, LJD.class, false);
        Map map2 = map;
        if (map != null) {
            Iterator A0u = AnonymousClass7TF.A0u(map);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                A0a.A9m(DbT.A13(A1J), DbS.A0s(A1J));
            }
        }
        return JUM.A01(new MGG(this, map2, (AnonymousClass4D7) null, 2, z), JUM.A00(new C20592WvV(this, (AnonymousClass4D7) null, 48), A0a.A0M().A03(627162090)));
    }

    public final String getModuleName() {
        return "MediaKitApi";
    }

    private final void A00(1NY r3) {
        LDW ldw = this.A02;
        if (DbV.A12(ldw.A02).length() == 0) {
            ldw.A02 = AnonymousClass7TF.A0b();
        }
        r3.A9m(Dbf.A00(), ldw.A02);
    }

    public static final void A02(C268654dm r5, MediaKitApi mediaKitApi, Integer num) {
        String message;
        String str;
        if (r5 instanceof C268674do) {
            message = ((AnonymousClass1XT) ((C268674do) r5).A00).getErrorMessage();
            str = "http";
        } else if (r5 instanceof C268664dn) {
            message = ((C268664dn) r5).A00.getMessage();
            str = "network";
        } else {
            throw AnonymousClass7TE.A1K();
        }
        C64127LPb.A00((C62661KkN) null, mediaKitApi, num, str, message, AnonymousClass7TE.A1E());
    }

    public final MCA A03() {
        UserSession userSession = this.A00;
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        A00(A0b);
        A01(A0b, 002.A0R("user/", userSession.A06));
        return JUM.A01(MGW.A01(this, (AnonymousClass4D7) null, 3), JUM.A00(MGW.A01(this, (AnonymousClass4D7) null, 2), DbT.A0R((15p) null, A0b, C61279K0q.class, LJE.class, false).A05(308571972, 3)));
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.4D7, X.MDp] */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c4, code lost:
        if (X.DbV.A12(r2).length() > 0) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d0, code lost:
        if (r3 == null) goto L_0x00c9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A07(com.instagram.api.schemas.MediaKitVisibility r7, java.lang.String r8, X.AnonymousClass4D7 r9) {
        /*
            r6 = this;
            r3 = 44
            boolean r0 = X.C66137MDp.A02(r3, r9)
            if (r0 == 0) goto L_0x0074
            r4 = r9
            X.MDp r4 = (X.C66137MDp) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0074
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r4.A02
            X.1Hj r3 = X.1Hj.A02
            int r1 = r4.A00
            r2 = 1
            if (r1 == 0) goto L_0x0041
            if (r1 != r2) goto L_0x0082
            java.lang.Object r4 = r4.A01
            com.instagram.mediakit.api.MediaKitApi r4 = (com.instagram.mediakit.api.MediaKitApi) r4
            X.0eS.A00(r0)
        L_0x0028:
            r3 = r0
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0079
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r0 = r3.A00
            X.K0p r0 = (X.C61278K0p) r0
            X.JxK r0 = r0.A00
            if (r0 != 0) goto L_0x0087
            X.C41845B3m.A0v()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0041:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r0 = r6.A00
            X.1NY r5 = X.AnonymousClass7TG.A0a(r0)
            r6.A00(r5)
            java.lang.String r0 = "/update_visibility"
            java.lang.String r0 = X.002.A0R(r8, r0)
            A01(r5, r0)
            java.lang.String r1 = r7.A00
            java.lang.String r0 = "visibility"
            r5.A9m(r0, r1)
            java.lang.Class<X.K0p> r1 = X.C61278K0p.class
            java.lang.Class<X.LH5> r0 = X.LH5.class
            X.1OC r1 = X.DbU.A0S(r5, r1, r0)
            r4.A01 = r6
            r4.A00 = r2
            r0 = 1879525183(0x7007473f, float:1.6746643E29)
            java.lang.Object r0 = r1.A00(r0, r4)
            if (r0 == r3) goto L_0x00cd
            r4 = r6
            goto L_0x0028
        L_0x0074:
            X.MDp r4 = X.C66137MDp.A00(r6, r9, r3)
            goto L_0x0016
        L_0x0079:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x008b
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0082:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0087:
            X.3Ih r3 = X.C41845B3m.A0d(r0)
        L_0x008b:
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x00cd
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00d3
            X.4dm r1 = X.JTP.A0N(r3)
            java.lang.Integer r0 = X.AnonymousClass05K.A0B
            A02(r1, r4, r0)
            X.0qQ.A0B(r1, r2)
            boolean r0 = r1 instanceof X.C268674do
            r4 = 0
            if (r0 == 0) goto L_0x00ce
            X.4do r1 = (X.C268674do) r1
            if (r1 == 0) goto L_0x00ce
            java.lang.Object r3 = r1.A00
            X.1XT r3 = (X.AnonymousClass1XT) r3
            if (r3 == 0) goto L_0x00cf
            java.lang.String r2 = r3.getErrorMessage()
            if (r2 == 0) goto L_0x00cf
            int r1 = r3.getStatusCode()
            r0 = 400(0x190, float:5.6E-43)
            if (r1 != r0) goto L_0x00cf
            java.lang.String r0 = X.DbV.A12(r2)
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x00cf
        L_0x00c6:
            r3.getErrorBody()
        L_0x00c9:
            X.5sO r3 = X.C41845B3m.A0c(r2)
        L_0x00cd:
            return r3
        L_0x00ce:
            r3 = r4
        L_0x00cf:
            r2 = r4
            if (r3 == 0) goto L_0x00c9
            goto L_0x00c6
        L_0x00d3:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.mediakit.api.MediaKitApi.A07(com.instagram.api.schemas.MediaKitVisibility, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.4D7, X.MDp] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0076, code lost:
        if (r4 != null) goto L_0x0078;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A08(X.AnonymousClass4D7 r7) {
        /*
            r6 = this;
            r3 = 43
            boolean r0 = X.C66137MDp.A02(r3, r7)
            if (r0 == 0) goto L_0x006a
            r5 = r7
            X.MDp r5 = (X.C66137MDp) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006a
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r5.A02
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x0042
            if (r0 != r3) goto L_0x006f
            java.lang.Object r1 = r5.A01
            com.instagram.mediakit.api.MediaKitApi r1 = (com.instagram.mediakit.api.MediaKitApi) r1
            X.0eS.A00(r2)
        L_0x0028:
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0079
            X.3Ih r2 = (X.C239793Ih) r2
            if (r2 == 0) goto L_0x0079
            java.lang.Object r0 = r2.A00
            X.K0j r0 = (X.C61274K0j) r0
            if (r0 == 0) goto L_0x0079
            X.JtM r0 = r0.A00
            if (r0 != 0) goto L_0x0074
            X.C41845B3m.A0v()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0042:
            X.0eS.A00(r2)
            com.instagram.common.session.UserSession r0 = r6.A00
            X.1NY r2 = X.AnonymousClass7TG.A0b(r0)
            java.lang.String r0 = "async_get_user_insights_dictionary"
            A01(r2, r0)
            r6.A00(r2)
            java.lang.Class<X.K0j> r1 = X.C61274K0j.class
            java.lang.Class<X.LH4> r0 = X.LH4.class
            X.1OC r1 = X.DbU.A0S(r2, r1, r0)
            r5.A01 = r6
            r5.A00 = r3
            r0 = 416990682(0x18dac5da, float:5.655146E-24)
            java.lang.Object r2 = r1.A00(r0, r5)
            if (r2 == r4) goto L_0x0078
            r1 = r6
            goto L_0x0028
        L_0x006a:
            X.MDp r5 = X.C66137MDp.A00(r6, r7, r3)
            goto L_0x0016
        L_0x006f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0074:
            java.util.List r4 = r0.A00
            if (r4 == 0) goto L_0x0079
        L_0x0078:
            return r4
        L_0x0079:
            java.lang.Integer r0 = X.AnonymousClass05K.A0G
            X.C64127LPb.A01(r1, r0)
            X.0sn r4 = X.0sn.A00
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.mediakit.api.MediaKitApi.A08(X.4D7):java.lang.Object");
    }

    public final LDW BO3() {
        return this.A01;
    }

    public MediaKitApi(UserSession userSession, LDW ldw) {
        AnonymousClass7TG.A1O(userSession, ldw);
        this.A00 = userSession;
        this.A02 = ldw;
        this.A01 = ldw;
    }
}
