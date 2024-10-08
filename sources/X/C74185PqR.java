package X;

import java.util.List;

/* renamed from: X.PqR  reason: case insensitive filesystem */
public final class C74185PqR extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74185PqR(int i, List list, 0sP r4) {
        super(1);
        this.A00 = i;
        switch (i) {
            case 0:
            case 9:
            case 11:
                this.A02 = r4;
                this.A01 = list;
                break;
            default:
                this.A01 = r4;
                this.A02 = list;
                break;
        }
    }

    /* JADX WARNING: type inference failed for: r1v54, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r5v27, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r12v3, types: [com.facebook.msys.mca.MailboxFeature, X.67N] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x04ca, code lost:
        if (X.JTT.A1Z(r11.A05, r13.A04, 2131965733) == false) goto L_0x04cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0513, code lost:
        if (r4 >= 3) goto L_0x04dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x053d, code lost:
        if (r4 >= 1) goto L_0x052d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x06b3, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x06ba, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x07ba, code lost:
        if (r1 != 0) goto L_0x07bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:?, code lost:
        return r1.invoke(((java.util.List) r0).get(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0187, code lost:
        if (((X.C72939PPx) r2.A02).A0O.get() == false) goto L_0x02c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01a2, code lost:
        return X.C72168Oxd.A00(r0, r3, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0234, code lost:
        if (r6.EJd(r7) != false) goto L_0x023f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0236, code lost:
        r8.cancel(r3);
        X.C3030067a.A02(r10);
        X.C3030067a.A03(r2, r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x023f, code lost:
        com.facebook.msys.mci.PlatformLogger.platformEventLog(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x02c0, code lost:
        X.DbS.A1U(r2.A01);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x04d7  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x04ff  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0512  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0566  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x057c  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x08e8  */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x0484 A[LOOP:2: B:118:0x0484->B:323:0x0484, LOOP_END, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r20) {
        /*
            r19 = this;
            r2 = r19
            r0 = r20
            int r1 = r2.A00
            switch(r1) {
                case 0: goto L_0x0079;
                case 1: goto L_0x0009;
                case 2: goto L_0x093c;
                case 3: goto L_0x08c7;
                case 4: goto L_0x08aa;
                case 5: goto L_0x0894;
                case 6: goto L_0x0873;
                case 7: goto L_0x084c;
                case 8: goto L_0x0816;
                case 9: goto L_0x0079;
                case 10: goto L_0x0009;
                case 11: goto L_0x0079;
                case 12: goto L_0x0009;
                case 13: goto L_0x07e6;
                case 14: goto L_0x076b;
                case 15: goto L_0x076b;
                case 16: goto L_0x076b;
                case 17: goto L_0x074f;
                case 18: goto L_0x0697;
                case 19: goto L_0x0666;
                case 20: goto L_0x0648;
                case 21: goto L_0x05fe;
                case 22: goto L_0x05d8;
                case 23: goto L_0x042f;
                case 24: goto L_0x040f;
                case 25: goto L_0x02f8;
                case 26: goto L_0x02e5;
                case 27: goto L_0x02c7;
                case 28: goto L_0x02af;
                case 29: goto L_0x0295;
                case 30: goto L_0x026d;
                case 31: goto L_0x0245;
                case 32: goto L_0x01ee;
                case 33: goto L_0x01d6;
                case 34: goto L_0x01b1;
                case 35: goto L_0x01a3;
                case 36: goto L_0x0195;
                case 37: goto L_0x018b;
                case 38: goto L_0x017d;
                case 39: goto L_0x0170;
                case 40: goto L_0x0170;
                case 41: goto L_0x0170;
                case 42: goto L_0x0009;
                case 43: goto L_0x0157;
                case 44: goto L_0x0127;
                case 45: goto L_0x00e1;
                case 46: goto L_0x00cb;
                case 47: goto L_0x001e;
                case 48: goto L_0x00b3;
                case 49: goto L_0x0084;
                default: goto L_0x0009;
            }
        L_0x0009:
            int r3 = X.AnonymousClass7TE.A0M(r0)
            java.lang.Object r1 = r2.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r2.A02
        L_0x0013:
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r3)
            java.lang.Object r1 = r1.invoke(r0)
        L_0x001d:
            return r1
        L_0x001e:
            java.lang.String r0 = (java.lang.String) r0
            r3 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            X.0eP r1 = X.AnonymousClass7TF.A0x(r1, r3)
            java.lang.Object r11 = r2.A01
            X.ONU r11 = (X.ONU) r11
            org.json.JSONObject r3 = X.C66580MXl.A17(r0)     // Catch:{ JSONException -> 0x006c }
            java.lang.String r0 = "pending_imports"
            org.json.JSONArray r10 = r3.optJSONArray(r0)     // Catch:{ JSONException -> 0x006c }
            java.lang.String r9 = "is_device_ready"
            java.lang.String r8 = "pending_captures_count"
            r7 = 0
            if (r10 == 0) goto L_0x005c
            int r6 = r10.length()     // Catch:{ JSONException -> 0x006c }
            r5 = 0
            r4 = 0
        L_0x0044:
            if (r7 >= r6) goto L_0x005a
            org.json.JSONObject r3 = r10.optJSONObject(r7)     // Catch:{ JSONException -> 0x006c }
            if (r3 == 0) goto L_0x0057
            int r0 = r3.getInt(r8)     // Catch:{ JSONException -> 0x006c }
            int r5 = r5 + r0
            if (r4 != 0) goto L_0x0057
            boolean r4 = r3.getBoolean(r9)     // Catch:{ JSONException -> 0x006c }
        L_0x0057:
            int r7 = r7 + 1
            goto L_0x0044
        L_0x005a:
            r7 = r5
            goto L_0x005d
        L_0x005c:
            r4 = 0
        L_0x005d:
            org.json.JSONObject r0 = X.DbS.A11()     // Catch:{ JSONException -> 0x006c }
            r0.put(r8, r7)     // Catch:{ JSONException -> 0x006c }
            r0.put(r9, r4)     // Catch:{ JSONException -> 0x006c }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x006c }
            goto L_0x0075
        L_0x006c:
            r4 = move-exception
            com.instagram.common.session.UserSession r3 = r11.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            X.C66583MXo.A1I(r3, r0, r4)
            r0 = 0
        L_0x0075:
            if (r0 == 0) goto L_0x001d
            goto L_0x098a
        L_0x0079:
            int r3 = X.AnonymousClass7TE.A0M(r0)
            java.lang.Object r1 = r2.A02
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r2.A01
            goto L_0x0013
        L_0x0084:
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r7 = r0.length
            r6 = 0
        L_0x0088:
            if (r6 >= r7) goto L_0x00b0
            java.lang.Object r5 = r2.A02
            X.OW6 r5 = (X.OW6) r5
            java.lang.Object r1 = r2.A01
            java.util.AbstractList r1 = (java.util.AbstractList) r1
            java.lang.Object r1 = r1.get(r6)
            X.0qQ.A07(r1)
            int r4 = X.AnonymousClass7TE.A0M(r1)
            r3 = r0[r6]
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.direct.model.DirectVisualMessageViewerItem"
            X.0qQ.A0C(r3, r1)
            r1 = 1
            X.0qQ.A0B(r3, r1)
            java.util.List r1 = r5.A03
            r1.set(r4, r3)
            int r6 = r6 + 1
            goto L_0x0088
        L_0x00b0:
            java.lang.Object r1 = r2.A02
            return r1
        L_0x00b3:
            X.N4G r0 = (X.N4G) r0
            r1 = 0
            X.0qQ.A0B(r0, r1)
            X.37E r3 = X.AnonymousClass37D.A00
            java.lang.Object r1 = r2.A01
            android.app.Activity r1 = (android.app.Activity) r1
            X.DbX.A10(r1, r3)
            java.lang.Object r1 = r2.A02
            X.PuZ r1 = (X.C74419PuZ) r1
            r1.DVU(r0)
            goto L_0x0987
        L_0x00cb:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r3 = r2.A02
            X.OTD r3 = (X.OTD) r3
            java.lang.Object r1 = r2.A01
            X.2Ep r1 = (X.AnonymousClass2Ep) r1
            if (r0 == 0) goto L_0x00dc
            X.1aU r1 = X.OTD.A00(r1, r3, r0)
            return r1
        L_0x00dc:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x00e1:
            X.PrM r0 = (X.C74233PrM) r0
            boolean r1 = r0 instanceof X.C72176Oxl
            if (r1 == 0) goto L_0x00ef
            X.1aU r1 = X.C72176Oxl.A00(r0)
            X.0qQ.A0A(r1)
            return r1
        L_0x00ef:
            java.lang.Object r1 = r2.A02
            X.OTD r1 = (X.OTD) r1
            X.7Zi r3 = r1.A01
            java.lang.Object r2 = r2.A01
            X.2Ep r2 = (X.AnonymousClass2Ep) r2
            com.instagram.model.direct.DirectThreadKey r1 = r2.BJy()
            java.lang.Object r5 = X.C66996MgU.A02(r0)
            X.0qQ.A07(r5)
            X.8Cl r5 = (X.C352218Cl) r5
            boolean r8 = r2.CVE()
            java.lang.String r7 = "external_share_send_attribution_image"
            r0 = 2
            X.0qQ.A0B(r5, r0)
            com.instagram.model.direct.DirectThreadKey r4 = X.C66647MaG.A03(r1)
            java.lang.String r2 = r4.A00
            X.2FW r1 = X.2FW.A1A
            r0 = 0
            java.lang.Boolean r6 = X.C333537Zi.A00(r3, r1, r2, r0)
            X.OxM r2 = new X.OxM
            r2.<init>(r3, r4, r5, r6, r7, r8)
            X.1aU r1 = X.1aU.A06(r2)
            return r1
        L_0x0127:
            java.lang.Object r0 = r2.A02
            X.PCP r0 = (X.PCP) r0
            com.instagram.common.session.UserSession r1 = r0.A01
            java.lang.Object r0 = r2.A01
            X.3t3 r0 = (X.C254793t3) r0
            long r12 = X.C66580MXl.A07(r0)
            r3 = 0
            X.NAb r9 = X.C71031OZi.A01(r1)
            X.68L r6 = X.C66580MXl.A0F(r9, r3)
            com.facebook.msys.mca.MailboxFutureImpl r8 = X.C66580MXl.A0G(r6)
            java.lang.String r5 = "MailboxTam"
            java.lang.String r4 = "runTamClientThreadMarkRead"
            int r10 = X.C3030067a.A00(r8)
            com.facebook.msys.mci.TraceInfo r2 = X.C3030067a.A01(r8, r5, r4)
            r11 = 8
            X.Opi r7 = new X.Opi
            r7.<init>((com.facebook.msys.mca.MailboxFutureImpl) r8, (X.C68314NAb) r9, (int) r10, (int) r11, (long) r12)
            goto L_0x0230
        L_0x0157:
            X.NAY r0 = (X.NAY) r0
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Object r1 = r2.A01
            X.0rl r1 = (X.0rl) r1
            long r1 = r1.A00
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            X.OpZ r2 = X.C71715OpZ.A00
            java.lang.String r1 = "ephemeral_deletion"
            r0.A00(r2, r3, r1, r1)
            goto L_0x0987
        L_0x0170:
            java.lang.Object r1 = r2.A02
            X.H0f r1 = (X.C54136H0f) r1
            java.lang.Object r0 = r2.A01
            X.GnV r0 = (X.C53398GnV) r0
            X.C54136H0f.A04(r0, r1)
            goto L_0x0987
        L_0x017d:
            java.lang.Object r0 = r2.A02
            X.PPx r0 = (X.C72939PPx) r0
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0O
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0987
            goto L_0x02c0
        L_0x018b:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Object r3 = r2.A01
            java.lang.Object r2 = r2.A02
            r1 = 7
            goto L_0x019e
        L_0x0195:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Object r3 = r2.A01
            java.lang.Object r2 = r2.A02
            r1 = 6
        L_0x019e:
            X.1aU r1 = X.C72168Oxd.A00(r0, r3, r2, r1)
            return r1
        L_0x01a3:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Object r3 = r2.A01
            java.lang.Object r2 = r2.A02
            r1 = 5
            X.1aU r1 = X.C72168Oxd.A00(r3, r0, r2, r1)
            return r1
        L_0x01b1:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Object r1 = r2.A02     // Catch:{ RuntimeException -> 0x01cc }
            X.0sP r1 = (X.0sP) r1     // Catch:{ RuntimeException -> 0x01cc }
            java.lang.Object r0 = r1.invoke(r0)     // Catch:{ RuntimeException -> 0x01cc }
            X.685 r0 = (X.AnonymousClass685) r0     // Catch:{ RuntimeException -> 0x01cc }
            java.lang.Object r1 = r2.A01     // Catch:{ RuntimeException -> 0x01cc }
            com.google.common.util.concurrent.SettableFuture r1 = (com.google.common.util.concurrent.SettableFuture) r1     // Catch:{ RuntimeException -> 0x01cc }
            com.google.common.util.concurrent.ListenableFuture r0 = X.C303606Aa.A00(r0)     // Catch:{ RuntimeException -> 0x01cc }
            r1.A0A(r0)     // Catch:{ RuntimeException -> 0x01cc }
            goto L_0x0987
        L_0x01cc:
            r1 = move-exception
            java.lang.Object r0 = r2.A01
            X.1K2 r0 = (X.1K2) r0
            r0.setException(r1)
            goto L_0x0987
        L_0x01d6:
            X.Mdd r1 = X.C66845Mdd.A00
            java.lang.Object r0 = r2.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.62u r3 = r1.A00(r0)
            java.lang.Object r1 = r2.A01
            X.0sP r1 = (X.0sP) r1
            X.NAN r0 = new X.NAN
            r0.<init>(r3)
            r1.invoke(r0)
            goto L_0x0987
        L_0x01ee:
            com.facebook.msys.mca.Mailbox r0 = (com.facebook.msys.mca.Mailbox) r0
            r3 = 0
            X.0qQ.A0B(r0, r3)
            X.681 r1 = X.AnonymousClass67N.A00
            X.Mcg r1 = new X.Mcg
            r1.<init>(r0)
            X.67N r12 = new X.67N
            r12.<init>(r1)
            java.lang.Object r0 = r2.A02
            com.instagram.model.direct.threadkey.impl.MsysThreadId r0 = (com.instagram.model.direct.threadkey.impl.MsysThreadId) r0
            long r0 = r0.A00
            java.lang.Object r5 = r2.A01
            X.0sP r5 = (X.0sP) r5
            r4 = 18
            X.Opf r2 = new X.Opf
            r2.<init>((int) r4, (X.0sP) r5)
            X.68L r6 = X.C66580MXl.A0F(r12, r3)
            com.facebook.msys.mca.MailboxFutureImpl r8 = X.C66580MXl.A0G(r6)
            java.lang.String r5 = "MailboxInstagramSecureMessage"
            java.lang.String r4 = "loadInstagramIgThreadIdFromSecureThreadKey"
            int r10 = X.C3030067a.A00(r8)
            com.facebook.msys.mci.TraceInfo r2 = X.C66580MXl.A0I(r2, r8, r5, r4)
            r15 = 2
            X.Opi r7 = new X.Opi
            r11 = r7
            r13 = r8
            r14 = r10
            r16 = r0
            r11.<init>((X.AnonymousClass67N) r12, (com.facebook.msys.mca.MailboxFutureImpl) r13, (int) r14, (int) r15, (long) r16)
        L_0x0230:
            boolean r0 = r6.EJd(r7)
            if (r0 != 0) goto L_0x023f
            r8.cancel(r3)
            X.C3030067a.A02(r10)
            X.C3030067a.A03(r2, r5, r4)
        L_0x023f:
            r0 = 5
            com.facebook.msys.mci.PlatformLogger.platformEventLog(r0)
            goto L_0x0987
        L_0x0245:
            X.3Q2 r0 = (X.AnonymousClass3Q2) r0
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Object r4 = r2.A02
            X.9HP r4 = (X.AnonymousClass9HP) r4
            java.lang.Object r3 = r2.A01
            com.instagram.model.direct.DirectThreadKey r3 = (com.instagram.model.direct.DirectThreadKey) r3
            X.1iA r2 = r0.A1G
            X.1iA r1 = X.1iA.A0Q
            if (r2 != r1) goto L_0x0987
            com.instagram.common.session.UserSession r1 = r4.A00
            boolean r1 = X.C70083Nwz.A00(r1, r3)
            if (r1 == 0) goto L_0x0987
            X.7Hf r2 = r4.A01
            X.Nbu r1 = new X.Nbu
            r1.<init>(r0)
            r2.FMa(r1, r3)
            goto L_0x0987
        L_0x026d:
            X.3Q2 r0 = (X.AnonymousClass3Q2) r0
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Object r4 = r2.A02
            X.9HP r4 = (X.AnonymousClass9HP) r4
            java.lang.Object r3 = r2.A01
            com.instagram.model.direct.DirectThreadKey r3 = (com.instagram.model.direct.DirectThreadKey) r3
            X.1iA r2 = r0.A1G
            X.1iA r1 = X.1iA.A0Q
            if (r2 != r1) goto L_0x0987
            com.instagram.common.session.UserSession r1 = r4.A00
            boolean r1 = X.C70083Nwz.A00(r1, r3)
            if (r1 == 0) goto L_0x0987
            X.7Hf r2 = r4.A01
            X.Nbu r1 = new X.Nbu
            r1.<init>(r0)
            r2.AGW(r1)
            goto L_0x0987
        L_0x0295:
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto L_0x02a6
            java.lang.Object r3 = r2.A02
            X.2s5 r3 = (X.C231672s5) r3
            java.lang.Object r1 = r2.A01
            com.instagram.common.ui.widget.imageview.IgImageView r1 = (com.instagram.common.ui.widget.imageview.IgImageView) r1
            r3.EF5(r0, r1)
            goto L_0x0987
        L_0x02a6:
            java.lang.Object r0 = r2.A01
            com.instagram.common.ui.widget.imageview.IgImageView r0 = (com.instagram.common.ui.widget.imageview.IgImageView) r0
            r0.A09()
            goto L_0x0987
        L_0x02af:
            java.lang.Object r3 = r2.A02
            X.P8q r3 = (X.C72507P8q) r3
            X.4DH r0 = r3.A00
            android.content.Context r1 = r0.requireContext()
            r0 = 0
            X.C49954FGj.A03(r1, r0, r0, r0)
            X.C72507P8q.A01(r3)
        L_0x02c0:
            java.lang.Object r0 = r2.A01
            X.DbS.A1U(r0)
            goto L_0x0987
        L_0x02c7:
            X.4cl r0 = (X.C268104cl) r0
            r5 = 0
            X.0qQ.A0B(r0, r5)
            java.lang.Object r4 = r2.A01
            X.4cY r4 = (X.C267974cY) r4
            java.lang.Object r3 = r2.A02
            r2 = 38
            X.PqN r1 = new X.PqN
            r1.<init>(r3, r2)
            r9 = 0
            r6 = r0
            r7 = r4
            r8 = r1
            r10 = r5
            r11 = r5
            r6.A09(r7, r8, r9, r10, r11)
            goto L_0x0987
        L_0x02e5:
            java.lang.Object r3 = r2.A01
            X.7Wl r3 = (X.C332807Wl) r3
            java.lang.Object r0 = r2.A02
            X.7AE r0 = (X.AnonymousClass7AE) r0
            com.instagram.model.direct.messageid.MessageIdentifier r1 = r0.A01
            boolean r0 = r0.A02
            r0 = r0 ^ 1
            r3.EdN(r1, r0)
            goto L_0x0987
        L_0x02f8:
            boolean r6 = X.AnonymousClass7TE.A1a(r0)
            java.lang.Object r4 = r2.A02
            X.H1O r4 = (X.H1O) r4
            java.lang.Object r0 = r2.A01
            X.7Pu r0 = (X.C331157Pu) r0
            r0.A07()
            r4.A0D = r6
            android.view.View r1 = r4.requireView()
            r0 = 2131428247(0x7f0b0397, float:1.8478133E38)
            android.widget.TextView r3 = X.AnonymousClass7TG.A0R(r1, r0)
            android.view.View r1 = r4.requireView()
            r0 = 2131438215(0x7f0b2a87, float:1.849835E38)
            android.widget.ImageView r5 = X.DbX.A0J(r1, r0)
            com.instagram.igds.components.switchbutton.IgdsSwitch r1 = r4.A07
            if (r6 == 0) goto L_0x03b7
            if (r1 == 0) goto L_0x0332
            r0 = 0
            r1.setEnabled(r0)
            boolean r0 = r1.isChecked()
            if (r0 == 0) goto L_0x0332
            r1.toggle()
        L_0x0332:
            X.0eM r0 = r4.A0T
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x0342
            android.view.View r1 = r4.A01
            if (r1 == 0) goto L_0x0342
            r0 = 1
            r1.setClickable(r0)
        L_0x0342:
            android.view.View r1 = r4.requireView()
            r0 = 2131430397(0x7f0b0bfd, float:1.8482494E38)
            android.widget.TextView r7 = X.AnonymousClass7TG.A0R(r1, r0)
            android.view.View r1 = r4.requireView()
            r0 = 2131430400(0x7f0b0c00, float:1.84825E38)
            android.widget.TextView r6 = X.AnonymousClass7TG.A0R(r1, r0)
            android.content.Context r1 = r4.requireContext()
            android.content.Context r0 = r4.getContext()
            r2 = 2130970278(0x7f0406a6, float:1.7549262E38)
            int r0 = X.2Yu.A0H(r0, r2)
            X.DbT.A17(r1, r7, r0)
            android.content.Context r1 = r4.requireContext()
            android.content.Context r0 = r4.getContext()
            int r0 = X.2Yu.A0H(r0, r2)
            X.DbT.A17(r1, r6, r0)
            X.0eE r1 = X.AnonymousClass0t1.A01
            X.0eM r0 = r4.A0V
            com.instagram.user.model.User r0 = X.DbX.A0l(r1, r0)
            java.lang.Integer r0 = r0.A0N()
            int r1 = r0.intValue()
            r0 = 2
            if (r1 == r0) goto L_0x03a5
            r0 = 0
            if (r1 == r0) goto L_0x03a5
            android.content.Context r1 = r4.requireContext()
            r0 = 2131968266(0x7f13410a, float:1.9573422E38)
            X.DbT.A18(r1, r3, r0)
            android.content.Context r1 = r4.requireContext()
            r0 = 2131238333(0x7f081dbd, float:1.8092942E38)
        L_0x03a0:
            X.DbU.A13(r1, r5, r0)
            goto L_0x0987
        L_0x03a5:
            android.content.Context r1 = r4.requireContext()
            r0 = 2131968270(0x7f13410e, float:1.957343E38)
            X.DbT.A18(r1, r3, r0)
            android.content.Context r1 = r4.requireContext()
            r0 = 2131238965(0x7f082035, float:1.8094224E38)
            goto L_0x03a0
        L_0x03b7:
            if (r1 == 0) goto L_0x03bd
            r0 = 1
            r1.setEnabled(r0)
        L_0x03bd:
            android.view.View r1 = r4.requireView()
            r0 = 2131430397(0x7f0b0bfd, float:1.8482494E38)
            android.widget.TextView r6 = X.AnonymousClass7TG.A0R(r1, r0)
            android.view.View r1 = r4.requireView()
            r0 = 2131430400(0x7f0b0c00, float:1.84825E38)
            android.widget.TextView r2 = X.AnonymousClass7TG.A0R(r1, r0)
            android.content.Context r1 = r4.requireContext()
            android.content.Context r0 = r4.getContext()
            int r0 = X.2Yu.A07(r0)
            X.DbT.A17(r1, r6, r0)
            int r0 = X.Dbb.A05(r4)
            r2.setTextColor(r0)
            X.0eM r0 = r4.A0T
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x03f9
            android.view.View r1 = r4.A01
            if (r1 == 0) goto L_0x03f9
            r0 = 0
            r1.setClickable(r0)
        L_0x03f9:
            android.content.Context r1 = r4.requireContext()
            r0 = 2131238514(0x7f081e72, float:1.8093309E38)
            X.DbU.A13(r1, r5, r0)
            android.content.Context r1 = r4.requireContext()
            r0 = 2131968267(0x7f13410b, float:1.9573424E38)
            X.DbT.A18(r1, r3, r0)
            goto L_0x0987
        L_0x040f:
            X.3lr r0 = (X.C250663lr) r0
            r6 = 0
            X.0qQ.A0B(r0, r6)
            java.lang.Object r1 = r2.A02
            X.A7x r1 = (X.C39757A7x) r1
            java.util.ArrayList r5 = r1.A02
            java.lang.Class<com.instagram.direct.request.graphql.IGDirectMediaRemixLayoutsResponseImpl$IgdMagicRemixLayout$Response> r4 = com.instagram.direct.request.graphql.IGDirectMediaRemixLayoutsResponseImpl.IgdMagicRemixLayout.Response.class
            X.3sh r1 = X.C250663lr.Companion
            r3 = 668897747(0x27de91d3, float:6.177548E-15)
            java.lang.String r1 = "response"
            com.google.common.collect.ImmutableList r0 = r0.getRequiredCompactedTreeListField(r6, r1, r4, r3)
            r5.addAll(r0)
            java.lang.Object r0 = r2.A01
            goto L_0x08c2
        L_0x042f:
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Object r11 = r2.A02
            X.LBR r11 = (X.LBR) r11
            java.lang.Object r6 = r2.A01
            java.util.List r6 = (java.util.List) r6
            X.4DH r3 = r11.A07
            android.content.Context r4 = r3.getContext()
            if (r4 == 0) goto L_0x0987
            com.instagram.common.session.UserSession r2 = r11.A08
            com.instagram.direct.magicmediaremix.MagicMediaRemixContentCompositor r1 = new com.instagram.direct.magicmediaremix.MagicMediaRemixContentCompositor
            r1.<init>(r4, r2)
            r11.A02 = r1
            java.util.ArrayList r16 = X.AnonymousClass7TE.A1C()
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L_0x05c8
            X.0tS r5 = X.DbT.A0h()
            X.0s0 r4 = r5.A2l
            X.0YZ[] r2 = X.0tS.A4G
            r1 = 256(0x100, float:3.59E-43)
            boolean r1 = X.AnonymousClass7TG.A1a(r5, r4, r2, r1)
            java.lang.String r4 = "Suggestions are empty, not generating any content."
            if (r1 == 0) goto L_0x0480
            java.lang.String r2 = "Suggestions are empty"
            android.content.Context r1 = r11.A05
            X.8ab r4 = X.DbX.A0g(r1, r4, r2)
            r4.A06()
            r2 = 2131956164(0x7f1311c4, float:1.9548876E38)
            X.LUp r1 = X.C64225LUp.A00
            r4.A0G(r1, r2)
            X.DbT.A1V(r4)
        L_0x0480:
            java.util.Iterator r9 = r6.iterator()
        L_0x0484:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0987
            java.lang.Object r13 = r9.next()
            X.9bx r13 = (X.C381559bx) r13
            java.util.List r1 = r13.A05
            java.util.ArrayList r15 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r4 = r1.iterator()
        L_0x049a:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x04b1
            java.lang.Object r2 = r4.next()
            r1 = r2
            com.instagram.common.gallery.Medium r1 = (com.instagram.common.gallery.Medium) r1
            boolean r1 = r1.A05()
            if (r1 == 0) goto L_0x049a
            r15.add(r2)
            goto L_0x049a
        L_0x04b1:
            int r4 = r15.size()
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            X.Kh1 r5 = r13.A00
            X.Kh1 r1 = X.C62511Kh1.WEEKDAY
            if (r5 == r1) goto L_0x0516
            java.lang.String r6 = r13.A04
            android.content.Context r5 = r11.A05
            r1 = 2131965733(0x7f133725, float:1.9568284E38)
            boolean r1 = X.JTT.A1Z(r5, r6, r1)
            if (r1 != 0) goto L_0x0516
        L_0x04cc:
            java.util.List r5 = X.0jo.A1G(r2)
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            r1 = 4
            if (r4 < r1) goto L_0x0512
            X.Nkp r1 = X.C69410Nkp.POLAROID_3X
            r2.add(r1)
        L_0x04dc:
            X.Nkp r1 = X.C69410Nkp.POLAROID_2X
            r2.add(r1)
        L_0x04e1:
            java.util.List r2 = X.0jo.A1G(r2)
            int r1 = r5.size()
            int r6 = X.DbT.A01(r2, r1)
            java.util.Iterator r4 = r5.iterator()
            java.util.Iterator r2 = r2.iterator()
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
        L_0x04f9:
            int r1 = r8.size()
            if (r1 >= r6) goto L_0x0540
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0508
            X.JTT.A1U(r8, r4)
        L_0x0508:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x04f9
            X.JTT.A1U(r8, r2)
            goto L_0x04f9
        L_0x0512:
            r1 = 3
            if (r4 < r1) goto L_0x04e1
            goto L_0x04dc
        L_0x0516:
            r1 = 6
            if (r4 < r1) goto L_0x0533
            X.Nkp r1 = X.C69410Nkp.DAY_OF_THE_WEEK_6_X
            r2.add(r1)
        L_0x051e:
            X.Nkp r1 = X.C69410Nkp.DAY_OF_THE_WEEK_4_X
            r2.add(r1)
        L_0x0523:
            X.Nkp r1 = X.C69410Nkp.DAY_OF_THE_WEEK_3_X_ASYMETRICAL
            r2.add(r1)
        L_0x0528:
            X.Nkp r1 = X.C69410Nkp.DAY_OF_THE_WEEK_2_X
            r2.add(r1)
        L_0x052d:
            X.Nkp r1 = X.C69410Nkp.DAY_OF_THE_WEEK_SINGLE
            r2.add(r1)
            goto L_0x04cc
        L_0x0533:
            r1 = 4
            if (r4 >= r1) goto L_0x051e
            r1 = 3
            if (r4 >= r1) goto L_0x0523
            r1 = 2
            if (r4 >= r1) goto L_0x0528
            r1 = 1
            if (r4 < r1) goto L_0x04cc
            goto L_0x052d
        L_0x0540:
            X.2jG r1 = r11.A0A
            com.instagram.common.session.UserSession r5 = r1.A00
            X.0Tu r4 = X.0Tu.A05
            r1 = 36609128706086693(0x820fcf00101725, double:3.2150986346337673E-306)
            int r1 = X.DbS.A04(r4, r5, r1)
            r2 = 1
            int r1 = java.lang.Math.max(r1, r2)
            int r7 = java.lang.Math.min(r1, r6)
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r5 = r8.iterator()
        L_0x0560:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0572
            java.lang.Object r4 = r5.next()
            X.Nkp r1 = X.C69410Nkp.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            if (r4 == r1) goto L_0x0560
            r6.add(r4)
            goto L_0x0560
        L_0x0572:
            java.util.Iterator r7 = X.C66581MXm.A10(r6, r7)
        L_0x0576:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0484
            java.lang.Object r5 = r7.next()
            java.util.Iterator r4 = r0.iterator()
        L_0x0584:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x05cd
            java.lang.Object r12 = r4.next()
            com.instagram.direct.request.graphql.IGDirectMediaRemixLayoutsResponseImpl$IgdMagicRemixLayout$Response r12 = (com.instagram.direct.request.graphql.IGDirectMediaRemixLayoutsResponseImpl.IgdMagicRemixLayout.Response) r12
            X.Nkp r1 = r12.A0E()
            if (r1 != r5) goto L_0x0584
            java.lang.String r14 = r13.A02
            java.lang.Class<com.instagram.direct.request.graphql.IGDirectMediaRemixLayoutsResponseImpl$IgdMagicRemixLayout$Response$BackgroundImages> r5 = com.instagram.direct.request.graphql.IGDirectMediaRemixLayoutsResponseImpl.IgdMagicRemixLayout.Response.BackgroundImages.class
            r4 = -617995249(0xffffffffdb2a240f, float:-4.7890393E16)
            java.lang.String r1 = "background_images"
            com.google.common.collect.ImmutableList r1 = r12.getRequiredCompactedTreeListField(r2, r1, r5, r4)
            int r18 = r1.size()
            java.lang.Class<com.instagram.direct.request.graphql.IGDirectMediaRemixLayoutsResponseImpl$IgdMagicRemixLayout$Response$ForegroundImages> r6 = com.instagram.direct.request.graphql.IGDirectMediaRemixLayoutsResponseImpl.IgdMagicRemixLayout.Response.ForegroundImages.class
            r5 = -1318871329(0xffffffffb1639edf, float:-3.3123155E-9)
            r4 = 2
            java.lang.String r1 = "foreground_images"
            com.google.common.collect.ImmutableList r1 = r12.getRequiredCompactedTreeListField(r4, r1, r6, r5)
            int r1 = r1.size()
            int r18 = r18 + r1
            X.0xx r1 = X.DbW.A0E(r3)
            r17 = 0
            X.Pfi r10 = new X.Pfi
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            X.AnonymousClass7TE.A1Z(r10, r1)
            goto L_0x0576
        L_0x05c8:
            r6.size()
            goto L_0x0480
        L_0x05cd:
            r0 = 3
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
        L_0x05d8:
            java.lang.Object r5 = r2.A01
            java.lang.Object r4 = r2.A02
            com.instagram.direct.locationsharing.service.DirectLiveLocationService r4 = (com.instagram.direct.locationsharing.service.DirectLiveLocationService) r4
            com.instagram.common.session.UserSession r3 = r4.A01
            if (r3 != 0) goto L_0x05e6
            java.lang.String r0 = "userSession"
            goto L_0x06b3
        L_0x05e6:
            r0 = 0
            X.0qQ.A0B(r5, r0)
            java.lang.Class<X.SFs> r2 = X.C11218SFs.class
            r1 = 44
            X.Wvt r0 = new X.Wvt
            r0.<init>(r1, r5, r3)
            java.lang.Object r1 = r3.A01(r2, r0)
            X.SFs r1 = (X.C11218SFs) r1
            X.Rps r0 = r4.A05
            r1.A00 = r0
            return r1
        L_0x05fe:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Object r3 = r2.A02
            X.OdL r3 = (X.C71126OdL) r3
            java.lang.Object r2 = r2.A01
            X.NWf r2 = (X.C68770NWf) r2
            X.0qQ.A0B(r2, r1)
            com.instagram.contentnotes.data.metadata.ContentNoteMetadata r1 = r2.A05
            com.instagram.common.session.UserSession r3 = r3.A0Q
            if (r1 == 0) goto L_0x063e
            java.lang.String r6 = r2.A08
            java.lang.String r7 = r1.A04
            java.lang.String r8 = r1.A06
            java.lang.Integer r4 = r1.A03
            java.lang.String r9 = r1.A05
            java.lang.Integer r5 = r1.A02
            X.KkD r2 = X.C62651KkD.TEXT
            X.GPJ.A01(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0624:
            X.60k r1 = X.C3018660j.A01(r3)
            X.Nmo r2 = X.C69506Nmo.A0V
            r3 = 0
            boolean r0 = r0 instanceof X.AnonymousClass9HR
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r6 = X.AnonymousClass7TE.A0v()
            r4 = r3
            r7 = r3
            r8 = r3
            r9 = r3
            r1.A0E(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0987
        L_0x063e:
            X.60k r2 = X.C3018660j.A01(r3)
            X.NmI r1 = X.C69474NmI.SEND
            r2.A0F(r1)
            goto L_0x0624
        L_0x0648:
            java.lang.Object r0 = r2.A02
            X.Mly r0 = (X.C67322Mly) r0
            java.lang.ref.WeakReference r0 = r0.A01
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L_0x0987
            java.lang.Object r2 = r2.A01
            com.instagram.direct.inbox.notes.ui.NoteAvatarView r2 = (com.instagram.direct.inbox.notes.ui.NoteAvatarView) r2
            com.instagram.common.ui.base.IgFrameLayout r1 = r2.A05
            r0 = 0
            r1.setVisibility(r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r2.A0B
            r0 = 4
            r1.setVisibility(r0)
            goto L_0x0987
        L_0x0666:
            X.3xP r0 = (X.C257443xP) r0
            r1 = 0
            X.0qQ.A0B(r0, r1)
            boolean r1 = r0.A06()
            if (r1 == 0) goto L_0x0688
            java.lang.Object r1 = r2.A02
            X.Mko r1 = (X.C67254Mko) r1
            X.MiI r1 = r1.A01
            java.lang.Object r0 = r0.A03()
            X.0qQ.A07(r0)
            X.3t0 r0 = (X.C254763t0) r0
            com.instagram.model.direct.DirectThreadKey r0 = X.C327647Bq.A00(r0)
            r1.AOc(r0)
        L_0x0688:
            java.lang.Object r0 = r2.A02
            X.Mko r0 = (X.C67254Mko) r0
            X.PwA r1 = r0.A02
            java.lang.Object r0 = r2.A01
            X.3sy r0 = (X.C254743sy) r0
            r1.AOc(r0)
            goto L_0x0987
        L_0x0697:
            int r6 = X.AnonymousClass7TE.A0M(r0)
            java.lang.Object r3 = r2.A02
            X.NIk r3 = (X.C68447NIk) r3
            com.instagram.direct.fragment.writewithai.PromptPills r0 = r3.A09
            if (r0 == 0) goto L_0x0987
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x0987
            X.C68447NIk.A02(r3)
            java.util.List r0 = r3.A0G
            r10 = 0
            if (r0 != 0) goto L_0x06bb
            java.lang.String r0 = "prompts"
        L_0x06b3:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x06bb:
            java.lang.String r11 = X.AnonymousClass7TE.A19(r0, r6)
            X.7I3 r5 = r3.A08
            if (r5 == 0) goto L_0x0701
            boolean r4 = r3.A0K
            boolean r9 = r3.A0J
            java.lang.String r8 = r3.A0E
            java.lang.String r7 = r3.A0L
            boolean r1 = r3.A0H
            r0 = 5
            X.0qQ.A0B(r11, r0)
            X.0wc r0 = r5.A01
            X.1Ln r5 = X.1Ln.A0J(r0)
            X.XSV r4 = X.AnonymousClass7I3.A00(r9, r4)
            if (r1 == 0) goto L_0x074c
            X.Nml r1 = X.C69503Nml.A0K
        L_0x06df:
            boolean r0 = X.DbT.A1Y(r5)
            if (r0 == 0) goto L_0x0701
            r0 = 27
            r5.A0Z(r0)
            r0 = 0
            r5.A0X(r0)
            X.C66580MXl.A1L(r5, r11)
            java.lang.String r0 = "entry_point"
            r5.A0M(r1, r0)
            X.C66584MXp.A0o(r4, r5, r8, r9)
            java.lang.String r0 = "creation_session_id"
            r5.A0R(r0, r7)
            r5.Cgf()
        L_0x0701:
            com.instagram.common.ui.base.IgEditText r1 = r3.A03
            if (r1 == 0) goto L_0x070c
            android.text.SpannableStringBuilder r0 = X.DbS.A0C(r11)
            r1.setText(r0)
        L_0x070c:
            java.lang.Object r0 = r2.A01
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r3.A05(r0)
            r3.A01 = r6
            com.instagram.direct.fragment.writewithai.RewriteTextBubbleViewPager r0 = r3.A0A
            if (r0 == 0) goto L_0x074a
            java.lang.String r0 = r0.getAppliedPromptOfCurrentPage()
        L_0x071d:
            boolean r1 = X.0qQ.A0K(r0, r11)
            com.instagram.direct.fragment.writewithai.RewriteTextBubbleViewPager r0 = r3.A0A
            if (r1 == 0) goto L_0x0743
            if (r0 == 0) goto L_0x072b
            java.lang.String r10 = r0.getTextToRewriteFromOriginalPage()
        L_0x072b:
            X.ONg r9 = r3.A0B
            if (r9 == 0) goto L_0x0987
            r14 = 0
            r0 = 25
            X.Pla r12 = new X.Pla
            r12.<init>(r3, r0)
            r0 = 30
            X.PmE r13 = new X.PmE
            r13.<init>(r3, r0)
            r9.A02(r10, r11, r12, r13, r14)
            goto L_0x0987
        L_0x0743:
            if (r0 == 0) goto L_0x072b
            java.lang.String r10 = r0.getTextToRewriteFromCurrentPage()
            goto L_0x072b
        L_0x074a:
            r0 = r10
            goto L_0x071d
        L_0x074c:
            X.Nml r1 = X.C69503Nml.A0L
            goto L_0x06df
        L_0x074f:
            X.N39 r0 = (X.N39) r0
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Object r1 = r2.A02
            X.MvK r1 = (X.C67816MvK) r1
            X.Psw r4 = r1.A06
            java.util.List r3 = r1.A01
            java.lang.Object r1 = r2.A01
            android.view.View r1 = (android.view.View) r1
            X.0qQ.A0A(r1)
            int r0 = r0.A00
            r4.DPu(r1, r3, r0)
            goto L_0x0987
        L_0x076b:
            java.lang.Object r6 = r2.A02
            X.P2y r6 = (X.C72359P2y) r6
            java.lang.Object r9 = r2.A01
            X.2Es r9 = (X.AnonymousClass2Es) r9
            X.0eM r0 = r6.A09
            java.lang.Object r1 = r0.getValue()
            X.PR9 r1 = (X.PR9) r1
            if (r9 == 0) goto L_0x07e4
            X.3Tu r0 = r9.AiM()
        L_0x0781:
            boolean r0 = X.C331057Pi.A02(r0)
            r1.A0D = r0
            X.0eM r0 = r6.A0B
            java.lang.Object r7 = r0.getValue()
            X.PR9 r7 = (X.PR9) r7
            r5 = 1
            if (r9 == 0) goto L_0x07e2
            X.3Tu r0 = r9.AiM()
            if (r0 == 0) goto L_0x07e2
            long r3 = r0.A02
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x07e2
        L_0x07a0:
            r7.A0D = r5
            X.0eM r0 = r6.A0C
            java.lang.Object r8 = r0.getValue()
            X.PR9 r8 = (X.PR9) r8
            r7 = 1
            if (r9 == 0) goto L_0x07bc
            X.3Tu r0 = r9.AiM()
            if (r0 == 0) goto L_0x07bc
            long r4 = r0.A03
            long r2 = X.C242373Tu.A07
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 1
            if (r1 == 0) goto L_0x07bd
        L_0x07bc:
            r0 = 0
        L_0x07bd:
            r8.A0D = r0
            X.0eM r0 = r6.A0D
            java.lang.Object r5 = r0.getValue()
            X.PR9 r5 = (X.PR9) r5
            if (r9 == 0) goto L_0x07e0
            X.3Tu r0 = r9.AiM()
            if (r0 == 0) goto L_0x07e0
            long r3 = r0.A03
            r1 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x07e0
        L_0x07d7:
            r5.A0D = r7
            X.OJg r0 = r6.A04
            r0.A00()
            goto L_0x0987
        L_0x07e0:
            r7 = 0
            goto L_0x07d7
        L_0x07e2:
            r5 = 0
            goto L_0x07a0
        L_0x07e4:
            r0 = 0
            goto L_0x0781
        L_0x07e6:
            X.6nL r0 = (X.C317486nL) r0
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Object r1 = r2.A02
            X.Ggt r1 = (X.C53002Ggt) r1
            X.05G r5 = r1.A03
        L_0x07f2:
            java.lang.Object r4 = r5.getValue()
            r1 = r4
            X.JVH r1 = (X.JVH) r1
            r3 = 0
            r11 = 23
            r6 = r1
            r7 = r0
            r8 = r3
            r9 = r3
            r10 = r3
            X.JVH r1 = X.JVH.A00(r6, r7, r8, r9, r10, r11)
            boolean r1 = r5.AIY(r4, r1)
            if (r1 == 0) goto L_0x07f2
            java.lang.Object r1 = r2.A01
            X.HqG r1 = (X.C55952HqG) r1
            X.HOn r0 = X.C54682HOn.TAP_EMOJI
            r1.A00(r0, r3)
            goto L_0x0987
        L_0x0816:
            X.5dM r0 = (X.C289295dM) r0
            long r3 = r0.A00
            X.2S0 r0 = X.AnonymousClass2S0.A01
            r0.A03()
            java.lang.Object r0 = r2.A02
            X.Mu4 r0 = (X.C67751Mu4) r0
            long r6 = X.AnonymousClass5TW.A01(r3)
            java.lang.Object r3 = r2.A01
            X.N46 r3 = (X.N46) r3
            r8 = 1
            X.0qQ.A0B(r3, r8)
            X.05G r1 = r0.A02
            java.lang.Object r0 = r1.getValue()
            X.Jv5 r0 = (X.C61006Jv5) r0
            java.lang.Object r4 = r0.A02
            X.4Yx r4 = (X.C266444Yx) r4
            java.lang.Object r5 = r0.A03
            java.util.List r5 = (java.util.List) r5
            X.0qQ.A0B(r5, r8)
            X.Jv5 r2 = new X.Jv5
            r2.<init>((X.N46) r3, (X.C266444Yx) r4, (java.util.List) r5, (long) r6, (boolean) r8)
            r1.Epw(r2)
            goto L_0x0987
        L_0x084c:
            java.lang.Object r3 = r2.A02
            X.NJ7 r3 = (X.NJ7) r3
            X.0eM r0 = r3.A0G
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            java.lang.Object r2 = r2.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r6 = r3.A00
            X.3t3 r5 = X.NJ7.A00(r3)
            java.lang.String r7 = X.NJ7.A02(r3)
            boolean r9 = X.NJ7.A08(r3)
            boolean r10 = r3.A02
            int r8 = X.C66583MXo.A03(r3)
            X.C69934Nua.A00(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0987
        L_0x0873:
            X.3xP r0 = (X.C257443xP) r0
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Object r1 = r2.A02
            X.7VS r1 = (X.AnonymousClass7VS) r1
            boolean r0 = r0.A06()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A00 = r0
            java.lang.Object r0 = r2.A01
            X.A45 r0 = (X.A45) r0
            if (r0 == 0) goto L_0x0987
            X.OLf r0 = r0.A00
            r0.A00()
            goto L_0x0987
        L_0x0894:
            java.lang.String r0 = (java.lang.String) r0
            r3 = 0
            X.0qQ.A0B(r0, r3)
            java.lang.Object r1 = r2.A01
            X.0eM r1 = (X.AnonymousClass0eM) r1
            java.lang.Object r2 = r1.getValue()
            X.OT9 r2 = (X.OT9) r2
            r1 = 0
            X.3su r1 = X.OT9.A00(r2, r0, r1, r3)
            return r1
        L_0x08aa:
            X.5Tl r0 = (X.C285975Tl) r0
            r1 = 0
            X.0qQ.A0B(r0, r1)
            X.5Tq r0 = r0.A01
            java.lang.String r5 = r0.A00
            java.lang.Object r0 = r2.A01
            X.N3q r0 = (X.C68175N3q) r0
            java.lang.String r0 = r0.A03
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 != 0) goto L_0x0987
            java.lang.Object r0 = r2.A02
        L_0x08c2:
            X.C51965G9l.A1W(r0, r5)
            goto L_0x0987
        L_0x08c7:
            boolean r3 = X.AnonymousClass7TE.A1a(r0)
            java.lang.Object r6 = r2.A02
            X.NJZ r6 = (X.NJZ) r6
            java.lang.Object r1 = r2.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131427931(0x7f0b025b, float:1.8477492E38)
            androidx.recyclerview.widget.RecyclerView r1 = X.DbT.A0I(r1, r0)
            r6.A03 = r1
            if (r3 == 0) goto L_0x0930
            if (r1 == 0) goto L_0x08e4
            r0 = 0
        L_0x08e1:
            r1.setVisibility(r0)
        L_0x08e4:
            androidx.recyclerview.widget.RecyclerView r5 = r6.A03
            if (r5 == 0) goto L_0x0987
            android.view.ViewGroup$LayoutParams r4 = r5.getLayoutParams()
            if (r4 == 0) goto L_0x0935
            X.2dQ r4 = (X.C71492dQ) r4
            r0 = -1
            r4.height = r0
            r0 = 0
            r4.A0u = r0
            r4.A0F = r0
            r4.A0s = r0
            r4.A0M = r0
            android.content.Context r0 = r6.requireContext()
            int r0 = X.AnonymousClass0nB.A00(r0)
            double r2 = (double) r0
            r0 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            double r2 = r2 * r0
            int r1 = (int) r2
            r0 = 150(0x96, float:2.1E-43)
            int r0 = java.lang.Math.max(r1, r0)
            r4.bottomMargin = r0
            android.content.Context r0 = r6.requireContext()
            int r0 = X.AnonymousClass0nB.A00(r0)
            double r2 = (double) r0
            r0 = 4586646004499207946(0x3fa70a3d70a3d70a, double:0.045)
            double r2 = r2 * r0
            int r1 = (int) r2
            r0 = 88
            int r0 = java.lang.Math.max(r1, r0)
            r4.topMargin = r0
            r5.setLayoutParams(r4)
            goto L_0x0987
        L_0x0930:
            if (r1 == 0) goto L_0x08e4
            r0 = 8
            goto L_0x08e1
        L_0x0935:
            java.lang.String r0 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x093c:
            java.util.List r0 = (java.util.List) r0
            r5 = 0
            X.0qQ.A0B(r0, r5)
            java.lang.Object r6 = r2.A02
            X.NJz r6 = (X.C68482NJz) r6
            X.OVb r1 = r6.A0F
            if (r1 == 0) goto L_0x0965
            X.JV5 r1 = r6.A07
            java.lang.Object r3 = r1.A00
            java.util.Set r3 = (java.util.Set) r3
            boolean r1 = r1.A01
            X.0qQ.A0B(r3, r5)
            X.JV5 r4 = new X.JV5
            r4.<init>((java.util.List) r0, (java.util.Set) r3, (boolean) r1)
            X.OVb r3 = r6.A0F
            if (r3 == 0) goto L_0x0963
            X.JV5 r1 = r6.A07
            r3.A01(r1, r4)
        L_0x0963:
            r6.A07 = r4
        L_0x0965:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0987
            java.lang.Object r4 = r2.A01
            X.LD6 r4 = (X.LD6) r4
            int r3 = r0.size()
            boolean r0 = r4.A00
            if (r0 == 0) goto L_0x0987
            X.02m r2 = r4.A01
            r1 = 1064965959(0x3f7a1747, float:0.9769177)
            java.lang.String r0 = "avatar_power_ups_count"
            r2.markerAnnotate(r1, r0, r3)
            r0 = 2
            r2.markerEnd(r1, r0)
            r4.A00 = r5
        L_0x0987:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x098a:
            org.json.JSONObject r4 = X.C66580MXl.A17(r0)     // Catch:{ JSONException -> 0x09a3 }
            java.lang.String r0 = "is_device_ready"
            boolean r0 = r4.getBoolean(r0)     // Catch:{ JSONException -> 0x09a3 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)     // Catch:{ JSONException -> 0x09a3 }
            java.lang.String r0 = "pending_captures_count"
            int r0 = r4.getInt(r0)     // Catch:{ JSONException -> 0x09a3 }
            X.0eP r1 = X.AnonymousClass7TF.A0x(r3, r0)     // Catch:{ JSONException -> 0x09a3 }
            return r1
        L_0x09a3:
            r3 = move-exception
            java.lang.Object r2 = r2.A02
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            X.C66583MXo.A1I(r2, r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74185PqR.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74185PqR(int i, Object obj, Object obj2) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }
}
