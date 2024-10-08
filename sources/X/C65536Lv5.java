package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Lv5  reason: case insensitive filesystem */
public final class C65536Lv5 implements MU6 {
    public final UserSession A00;

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00af, code lost:
        if (java.lang.Boolean.valueOf(r0).booleanValue() != false) goto L_0x00b1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object FIH(X.LP8 r8, X.AnonymousClass4D7 r9) {
        /*
            r7 = this;
            java.lang.String r2 = "xmp_data"
            X.3Q2 r6 = r8.A0D
            java.lang.String r0 = r6.A3y
            if (r0 == 0) goto L_0x000b
            X.KVl r0 = X.C62012KVl.A00
            return r0
        L_0x000b:
            X.1iA r0 = r6.A1G     // Catch:{ Exception -> 0x014e }
            int r1 = r0.ordinal()     // Catch:{ Exception -> 0x014e }
            r0 = 1
            java.lang.String r5 = ""
            if (r1 == r0) goto L_0x00bf
            r0 = 0
            if (r1 == r0) goto L_0x001c
            X.KVl r0 = X.C62012KVl.A00     // Catch:{ Exception -> 0x014e }
            return r0
        L_0x001c:
            com.instagram.common.session.UserSession r4 = r7.A00     // Catch:{ Exception -> 0x014e }
            X.0Tu r3 = X.0Tu.A05     // Catch:{ Exception -> 0x014e }
            r0 = 36315954237476676(0x81052b00010f44, double:3.029693920165963E-306)
            boolean r0 = X.182.A06(r3, r4, r0)     // Catch:{ Exception -> 0x014e }
            if (r0 != 0) goto L_0x002e
            X.KVl r0 = X.C62012KVl.A00     // Catch:{ Exception -> 0x014e }
            return r0
        L_0x002e:
            java.util.HashMap r1 = r6.A44     // Catch:{ Exception -> 0x014e }
            if (r1 == 0) goto L_0x00bc
            boolean r0 = r1.containsKey(r2)     // Catch:{ Exception -> 0x014e }
            if (r0 == 0) goto L_0x00b7
            java.lang.String r2 = X.DbS.A0r(r2, r1)     // Catch:{ Exception -> 0x014e }
            r0 = 36315954237607750(0x81052b00030f46, double:3.0296939202488545E-306)
            boolean r0 = X.182.A06(r3, r4, r0)     // Catch:{ Exception -> 0x014e }
            if (r0 == 0) goto L_0x008e
            boolean r0 = X.0mp.A0B(r2)     // Catch:{ Exception -> 0x014e }
            if (r0 != 0) goto L_0x00b2
            java.lang.String r0 = "<Attrib:Ads>"
            int r1 = r2.indexOf(r0)     // Catch:{ Exception -> 0x014e }
            r3 = -1
            if (r1 <= r3) goto L_0x0065
            java.lang.String r0 = "</Attrib:Ads>"
            int r0 = r2.indexOf(r0)     // Catch:{ Exception -> 0x014e }
            if (r0 <= r1) goto L_0x0065
            int r0 = r0 + 13
            java.lang.String r2 = r2.substring(r1, r0)     // Catch:{ Exception -> 0x014e }
            goto L_0x008b
        L_0x0065:
            java.lang.String r0 = "<dc:creator>"
            int r1 = r2.indexOf(r0)     // Catch:{ Exception -> 0x014e }
            if (r1 <= r3) goto L_0x00b2
            java.lang.String r0 = "</dc:creator>"
            int r0 = r2.indexOf(r0)     // Catch:{ Exception -> 0x014e }
            if (r0 <= r1) goto L_0x00b2
            int r0 = r0 + 13
            java.lang.String r1 = r2.substring(r1, r0)     // Catch:{ Exception -> 0x014e }
            java.util.regex.Pattern r0 = X.SCK.A00     // Catch:{ Exception -> 0x014e }
            java.util.regex.Matcher r1 = r0.matcher(r1)     // Catch:{ Exception -> 0x014e }
            boolean r0 = r1.find()     // Catch:{ Exception -> 0x014e }
            if (r0 == 0) goto L_0x00b2
            java.lang.String r2 = r1.group()     // Catch:{ Exception -> 0x014e }
        L_0x008b:
            if (r2 != 0) goto L_0x00b1
            goto L_0x00b2
        L_0x008e:
            boolean r0 = X.0mp.A0B(r2)     // Catch:{ Exception -> 0x014e }
            if (r0 != 0) goto L_0x00a6
            java.lang.String r0 = "Attrib:FbId"
            boolean r0 = r2.contains(r0)     // Catch:{ Exception -> 0x014e }
            if (r0 != 0) goto L_0x00a4
            java.lang.String r0 = "dc:creator"
            boolean r0 = r2.contains(r0)     // Catch:{ Exception -> 0x014e }
            if (r0 == 0) goto L_0x00a6
        L_0x00a4:
            r0 = 1
            goto L_0x00a7
        L_0x00a6:
            r0 = 0
        L_0x00a7:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x014e }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x014e }
            if (r0 == 0) goto L_0x00b2
        L_0x00b1:
            r5 = r2
        L_0x00b2:
            r6.A3y = r5     // Catch:{ Exception -> 0x014e }
            X.KVm r0 = X.C62013KVm.A00     // Catch:{ Exception -> 0x014e }
            return r0
        L_0x00b7:
            r6.A3y = r5     // Catch:{ Exception -> 0x014e }
            X.KVm r0 = X.C62013KVm.A00     // Catch:{ Exception -> 0x014e }
            return r0
        L_0x00bc:
            X.KVl r0 = X.C62012KVl.A00     // Catch:{ Exception -> 0x014e }
            return r0
        L_0x00bf:
            com.instagram.common.session.UserSession r4 = r7.A00     // Catch:{ Exception -> 0x014e }
            X.0Tu r3 = X.0Tu.A05     // Catch:{ Exception -> 0x014e }
            r0 = 36315954237542213(0x81052b00020f45, double:3.0296939202074086E-306)
            boolean r0 = X.182.A06(r3, r4, r0)     // Catch:{ Exception -> 0x014e }
            if (r0 != 0) goto L_0x00d1
            X.KVl r0 = X.C62012KVl.A00     // Catch:{ Exception -> 0x014e }
            return r0
        L_0x00d1:
            com.instagram.pendingmedia.model.constants.ShareType r1 = r6.A0E()     // Catch:{ Exception -> 0x014e }
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.REEL_SHARE_AND_DIRECT_STORY_SHARE     // Catch:{ Exception -> 0x014e }
            if (r1 == r0) goto L_0x0116
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.IGTV     // Catch:{ Exception -> 0x014e }
            if (r1 == r0) goto L_0x0116
            java.lang.String r0 = r6.A3O     // Catch:{ Exception -> 0x014e }
            if (r0 != 0) goto L_0x0116
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.CLIPS     // Catch:{ Exception -> 0x014e }
            if (r1 != r0) goto L_0x014b
            java.util.List r1 = r6.A4J     // Catch:{ Exception -> 0x014e }
            if (r1 == 0) goto L_0x0113
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x014e }
            if (r0 != 0) goto L_0x0113
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x014e }
        L_0x00f3:
            boolean r0 = r1.hasNext()     // Catch:{ Exception -> 0x014e }
            if (r0 == 0) goto L_0x014b
            java.lang.Object r0 = r1.next()     // Catch:{ Exception -> 0x014e }
            X.4aA r0 = (X.C266684aA) r0     // Catch:{ Exception -> 0x014e }
            java.lang.String r2 = r0.A0C     // Catch:{ Exception -> 0x014e }
            if (r2 == 0) goto L_0x00f3
            r0 = 36315954237607750(0x81052b00030f46, double:3.0296939202488545E-306)
            X.182.A06(r3, r4, r0)     // Catch:{ Exception -> 0x014e }
            X.SCK.A00(r2)     // Catch:{ Exception -> 0x014e }
            r6.A3y = r5     // Catch:{ Exception -> 0x014e }
            X.KVm r0 = X.C62013KVm.A00     // Catch:{ Exception -> 0x014e }
            return r0
        L_0x0113:
            X.KVl r0 = X.C62012KVl.A00     // Catch:{ Exception -> 0x014e }
            return r0
        L_0x0116:
            java.util.List r0 = r6.A4G     // Catch:{ Exception -> 0x014e }
            boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x014e }
            if (r0 == 0) goto L_0x0121
            X.KVl r0 = X.C62012KVl.A00     // Catch:{ Exception -> 0x014e }
            return r0
        L_0x0121:
            java.util.List r0 = r6.A4G     // Catch:{ Exception -> 0x014e }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ Exception -> 0x014e }
        L_0x0127:
            boolean r0 = r1.hasNext()     // Catch:{ Exception -> 0x014e }
            if (r0 == 0) goto L_0x014b
            java.lang.Object r0 = r1.next()     // Catch:{ Exception -> 0x014e }
            com.instagram.pendingmedia.model.ClipInfo r0 = (com.instagram.pendingmedia.model.ClipInfo) r0     // Catch:{ Exception -> 0x014e }
            java.lang.String r2 = r0.A0F     // Catch:{ Exception -> 0x014e }
            boolean r0 = r0.A0O     // Catch:{ Exception -> 0x014e }
            if (r0 != 0) goto L_0x0127
            if (r2 == 0) goto L_0x0127
            r0 = 36315954237607750(0x81052b00030f46, double:3.0296939202488545E-306)
            X.182.A06(r3, r4, r0)     // Catch:{ Exception -> 0x014e }
            X.SCK.A00(r2)     // Catch:{ Exception -> 0x014e }
            r6.A3y = r5     // Catch:{ Exception -> 0x014e }
            X.KVm r0 = X.C62013KVm.A00     // Catch:{ Exception -> 0x014e }
            return r0
        L_0x014b:
            X.KVl r0 = X.C62012KVl.A00     // Catch:{ Exception -> 0x014e }
            return r0
        L_0x014e:
            r2 = move-exception
            java.lang.String r1 = "PendingMediaCreativeAttributionStepException"
            java.lang.String r0 = "exception occurred when extracting metadata"
            X.0KC.A0F(r1, r0, r2)
            X.KVl r0 = X.C62012KVl.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65536Lv5.FIH(X.LP8, X.4D7):java.lang.Object");
    }

    public final String getName() {
        return "PendingMediaCreativeAttribution";
    }

    public C65536Lv5(UserSession userSession) {
        this.A00 = userSession;
    }
}
