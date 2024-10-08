package X;

/* renamed from: X.TGv  reason: case insensitive filesystem */
public final class C12988TGv implements Runnable {
    public final /* synthetic */ S21 A00;
    public final /* synthetic */ C7422QCn A01;

    public C12988TGv(S21 s21, C7422QCn qCn) {
        this.A01 = qCn;
        this.A00 = s21;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:152:0x02d3, code lost:
        if (r9.getCoercedBooleanField(5, "should_order_new_options_first") == false) goto L_0x02d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x02e7, code lost:
        if (r9.getCoercedBooleanField(6, "should_de_prioritize_credit_cards") == false) goto L_0x02e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0508, code lost:
        if (r7 != false) goto L_0x050a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x0968, code lost:
        if (r8 != null) goto L_0x096a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:519:0x0a0f, code lost:
        if (r8 != null) goto L_0x096a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0334 A[Catch:{ Exception -> 0x0339 }] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03a4 A[Catch:{ Exception -> 0x044c }] */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x03ed A[Catch:{ Exception -> 0x044c }, LOOP:5: B:212:0x03e7->B:214:0x03ed, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x041e A[Catch:{ Exception -> 0x044c }] */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0447 A[Catch:{ Exception -> 0x044c }] */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x0675  */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x06e6 A[Catch:{ Exception -> 0x06eb }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r24 = this;
            r1 = r24
            X.QCn r12 = r1.A01
            X.SSC r0 = r12.A02
            X.S21 r5 = r1.A00
            boolean r1 = r0 instanceof X.C8283QnP
            if (r1 == 0) goto L_0x0067
            r7 = r0
            X.QnP r7 = (X.C8283QnP) r7
            java.lang.Throwable r1 = r5.A02
            boolean r2 = X.DbW.A1a(r1)
            r6 = 0
            if (r2 == 0) goto L_0x0062
            java.lang.Object r4 = r5.A01
            r4.getClass()
            java.util.List r4 = (java.util.List) r4
            boolean r2 = r4.isEmpty()
            if (r2 != 0) goto L_0x0062
            monitor-enter(r7)
            java.lang.String r3 = ""
            boolean r1 = r7.A04     // Catch:{ all -> 0x005a }
            if (r1 != 0) goto L_0x0032
            com.fbpay.ptt.impl.javacpp.ServerCertsVerifierImpl r1 = r7.A02     // Catch:{ all -> 0x005a }
            java.lang.String r3 = r1.verifyCerts((java.util.List) r4)     // Catch:{ all -> 0x005a }
        L_0x0032:
            monitor-exit(r7)
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 == 0) goto L_0x0043
            X.RsQ r1 = new X.RsQ
            r1.<init>(r4)
            X.SUj r8 = X.SUj.A09(r1)
            goto L_0x00b4
        L_0x0043:
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch:{ JSONException -> 0x005d }
            if (r1 != 0) goto L_0x005d
            org.json.JSONObject r2 = X.C66580MXl.A17(r3)     // Catch:{ JSONException -> 0x005d }
            java.lang.String r1 = "code"
            r2.getInt(r1)     // Catch:{ JSONException -> 0x005d }
            java.lang.String r1 = "message"
            java.lang.String r3 = r2.getString(r1)     // Catch:{ JSONException -> 0x005d }
            goto L_0x005d
        L_0x005a:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x005d:
            X.TQE r1 = new X.TQE
            r1.<init>(r3)
        L_0x0062:
            X.SUj r8 = X.SUj.A0A(r6, r1)
            goto L_0x00b4
        L_0x0067:
            boolean r1 = r0 instanceof X.C8296Qnc
            if (r1 == 0) goto L_0x00d2
            r8 = r0
            X.Qnc r8 = (X.C8296Qnc) r8
            r1 = 0
            X.0qQ.A0B(r5, r1)
            java.lang.Throwable r2 = r5.A02
            boolean r1 = X.DbW.A1a(r2)
            java.lang.String r3 = "Required value was null."
            r6 = 0
            if (r1 == 0) goto L_0x00cb
            java.lang.Object r1 = r5.A01
            X.RsR r1 = (X.C10450RsR) r1
            if (r1 == 0) goto L_0x0a2f
            java.lang.Object r7 = r1.A00
            X.S6b r7 = (X.C11024S6b) r7
            if (r7 == 0) goto L_0x0a2f
            X.SFo r1 = r8.A01
            java.util.Set r1 = r1.A09
            java.util.Iterator r5 = r1.iterator()
        L_0x0091:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x00c3
            java.lang.Object r4 = r5.next()
            X.SNj r4 = (X.C11330SNj) r4
            java.lang.String r3 = r7.A04
            java.lang.String r2 = r4.A05
            r1 = 1
            boolean r1 = X.00p.A0j(r3, r2, r1)
            if (r1 == 0) goto L_0x0091
            X.SOC r1 = r8.A00
            X.SSZ r1 = r1.A01
            X.SNj r1 = r1.A05(r7, r4)
            X.SUj r8 = X.SUj.A09(r1)
        L_0x00b4:
            X.5A3 r0 = r0.A02
            X.2E5 r0 = r0.A00
            java.util.concurrent.Executor r1 = r0.A03
            X.TGw r0 = new X.TGw
            r0.<init>(r12, r8)
            r1.execute(r0)
            return
        L_0x00c3:
            java.lang.String r1 = "Auth ticket not found in local"
            java.lang.RuntimeException r2 = X.AnonymousClass7TE.A15(r1)
            goto L_0x096c
        L_0x00cb:
            if (r2 != 0) goto L_0x096c
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x00d2:
            boolean r1 = r0 instanceof X.C8295Qnb
            if (r1 == 0) goto L_0x0111
            r1 = r0
            X.Qnb r1 = (X.C8295Qnb) r1
            int r2 = r1.A00
            r1 = 0
            X.0qQ.A0B(r5, r1)
            if (r2 == 0) goto L_0x00f7
            java.lang.Throwable r4 = r5.A02
            boolean r3 = X.DbW.A1a(r4)
            java.lang.String r2 = "Required value was null."
            r1 = 0
            if (r3 == 0) goto L_0x013c
            java.lang.Object r1 = r5.A01
            X.RsR r1 = (X.C10450RsR) r1
            if (r1 != 0) goto L_0x012e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x00f7:
            java.lang.Throwable r3 = r5.A02
            boolean r1 = X.DbW.A1a(r3)
            java.lang.String r2 = "Required value was null."
            if (r1 == 0) goto L_0x010a
            java.lang.Object r1 = r5.A01
            if (r1 != 0) goto L_0x012c
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x010a:
            if (r3 == 0) goto L_0x0a34
            X.SUj r8 = X.SUj.A0B(r3)
            goto L_0x0142
        L_0x0111:
            boolean r1 = r0 instanceof X.C8280QnM
            if (r1 == 0) goto L_0x0147
            r1 = 0
            X.0qQ.A0B(r5, r1)
            java.lang.Throwable r3 = r5.A02
            boolean r1 = X.DbW.A1a(r3)
            java.lang.String r2 = "Required value was null."
            if (r1 == 0) goto L_0x0135
            java.lang.Object r1 = r5.A01
            if (r1 != 0) goto L_0x012c
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x012c:
            X.RsR r1 = (X.C10450RsR) r1
        L_0x012e:
            java.lang.Object r1 = r1.A00
            X.SUj r8 = X.SUj.A09(r1)
            goto L_0x0142
        L_0x0135:
            if (r3 == 0) goto L_0x0a3e
            X.SUj r8 = X.SUj.A0B(r3)
            goto L_0x0142
        L_0x013c:
            if (r4 == 0) goto L_0x0a39
            X.SUj r8 = X.SUj.A0A(r1, r4)
        L_0x0142:
            X.0qQ.A0A(r8)
            goto L_0x00b4
        L_0x0147:
            boolean r1 = r0 instanceof X.C8282QnO
            if (r1 == 0) goto L_0x015d
            java.lang.Throwable r1 = r5.A02
            if (r1 != 0) goto L_0x0157
            java.lang.Object r1 = r5.A01
            X.SUj r8 = X.SUj.A09(r1)
            goto L_0x00b4
        L_0x0157:
            X.SUj r8 = X.SUj.A0B(r1)
            goto L_0x00b4
        L_0x015d:
            boolean r1 = r0 instanceof X.C8278QnK
            if (r1 == 0) goto L_0x034d
            r7 = r0
            X.QnK r7 = (X.C8278QnK) r7
            int r1 = r7.A00
            if (r1 == 0) goto L_0x017a
            java.lang.Throwable r1 = r5.A02
            if (r1 != 0) goto L_0x0174
            java.lang.String r1 = r7.A03
            X.SUj r8 = X.SUj.A09(r1)
            goto L_0x00b4
        L_0x0174:
            X.SUj r8 = X.SUj.A0B(r1)
            goto L_0x00b4
        L_0x017a:
            r10 = 0
            X.0qQ.A0B(r5, r10)
            java.lang.Object r6 = r7.A02
            X.Stc r6 = (X.Stc) r6
            java.lang.Object r1 = r7.A01
            X.SJK r1 = (X.SJK) r1
            java.lang.String r4 = r1.A0C
            com.facebookpay.otc.models.OtcInput r3 = r1.A04
            X.SJ1 r2 = new X.SJ1
            r2.<init>(r3, r4)
            X.2gB r2 = r6.A05(r2)
            X.SUj r8 = X.Pxe.A0W(r2)
            r15 = 0
            if (r8 == 0) goto L_0x01b6
            java.lang.Object r2 = r8.A01
            X.SJH r2 = (X.SJH) r2
            if (r2 == 0) goto L_0x01b6
            java.lang.String r2 = r2.A06
            if (r2 == 0) goto L_0x01b6
            boolean r2 = X.00l.A0W(r2)
            if (r2 != 0) goto L_0x01b6
            java.lang.String r2 = r1.A0A
            if (r2 == 0) goto L_0x00b4
            boolean r2 = X.00l.A0W(r2)
            if (r2 == 0) goto L_0x01b6
            goto L_0x00b4
        L_0x01b6:
            java.lang.Object r3 = r5.A01
            X.QXQ r3 = (X.QXQ) r3
            X.QnS r2 = X.SPz.A01(r3)
            if (r2 != 0) goto L_0x06f2
            java.lang.Throwable r2 = r5.A02
            if (r2 != 0) goto L_0x06f2
            if (r3 == 0) goto L_0x01e9
            X.QXP r2 = r3.A0E()     // Catch:{ Exception -> 0x0339 }
            if (r2 == 0) goto L_0x01e9
            com.google.common.collect.ImmutableList r2 = r2.A0E()     // Catch:{ Exception -> 0x0339 }
            if (r2 == 0) goto L_0x01e9
            java.lang.Object r8 = r2.get(r10)     // Catch:{ Exception -> 0x0339 }
            X.QSf r8 = (X.C7664QSf) r8     // Catch:{ Exception -> 0x0339 }
            if (r8 == 0) goto L_0x01e9
            java.lang.Class<X.QUn> r6 = X.C7724QUn.class
            r4 = 5
            java.lang.String r3 = "PAYFBPayComponentPaymentMethod"
            r2 = 1658776164(0x62deea64, float:2.0560334E21)
            X.3lr r9 = r8.reinterpretIfFulfillsType(r4, r3, r6, r2)     // Catch:{ Exception -> 0x0339 }
            X.QUn r9 = (X.C7724QUn) r9     // Catch:{ Exception -> 0x0339 }
            goto L_0x01ea
        L_0x01e9:
            r9 = r15
        L_0x01ea:
            java.lang.String r13 = "Required value was null."
            if (r9 == 0) goto L_0x0334
            java.lang.Class<X.QUl> r6 = X.C7722QUl.class
            r4 = 1
            java.lang.String r3 = "available_payment_credentials"
            r2 = 1032112082(0x3d84c7d2, float:0.06483425)
            com.google.common.collect.ImmutableList r2 = r9.getRequiredCompactedTreeListField(r4, r3, r6, r2)     // Catch:{ Exception -> 0x0339 }
            java.util.ArrayList r8 = X.DbV.A15(r2)     // Catch:{ Exception -> 0x0339 }
            java.util.Iterator r6 = r2.iterator()     // Catch:{ Exception -> 0x0339 }
        L_0x0202:
            boolean r2 = r6.hasNext()     // Catch:{ Exception -> 0x0339 }
            if (r2 == 0) goto L_0x021f
            java.lang.Object r4 = r6.next()     // Catch:{ Exception -> 0x0339 }
            X.QUl r4 = (X.C7722QUl) r4     // Catch:{ Exception -> 0x0339 }
            java.lang.Class<X.QUj> r3 = X.C7720QUj.class
            r2 = -587304647(0xffffffffdcfe7139, float:-5.7295307E17)
            X.3lr r2 = r4.reinterpretRequired(r10, r3, r2)     // Catch:{ Exception -> 0x0339 }
            X.QUj r2 = (X.C7720QUj) r2     // Catch:{ Exception -> 0x0339 }
            if (r2 == 0) goto L_0x0202
            r8.add(r2)     // Catch:{ Exception -> 0x0339 }
            goto L_0x0202
        L_0x021f:
            java.util.ArrayList r17 = X.Stc.A04(r8)     // Catch:{ Exception -> 0x0339 }
            java.lang.Class<X.QUm> r4 = X.C7723QUm.class
            java.lang.String r3 = "unsupported_payment_credentials"
            r2 = -750314758(0xffffffffd3471afa, float:-8.5515108E11)
            com.google.common.collect.ImmutableList r2 = r9.getRequiredCompactedTreeListField(r10, r3, r4, r2)     // Catch:{ Exception -> 0x0339 }
            java.util.ArrayList r8 = X.DbV.A15(r2)     // Catch:{ Exception -> 0x0339 }
            java.util.Iterator r6 = r2.iterator()     // Catch:{ Exception -> 0x0339 }
        L_0x0237:
            boolean r2 = r6.hasNext()     // Catch:{ Exception -> 0x0339 }
            if (r2 == 0) goto L_0x0254
            java.lang.Object r4 = r6.next()     // Catch:{ Exception -> 0x0339 }
            X.QUm r4 = (X.C7723QUm) r4     // Catch:{ Exception -> 0x0339 }
            java.lang.Class<X.QUj> r3 = X.C7720QUj.class
            r2 = -587304647(0xffffffffdcfe7139, float:-5.7295307E17)
            X.3lr r2 = r4.reinterpretRequired(r10, r3, r2)     // Catch:{ Exception -> 0x0339 }
            X.QUj r2 = (X.C7720QUj) r2     // Catch:{ Exception -> 0x0339 }
            if (r2 == 0) goto L_0x0237
            r8.add(r2)     // Catch:{ Exception -> 0x0339 }
            goto L_0x0237
        L_0x0254:
            java.util.ArrayList r18 = X.Stc.A04(r8)     // Catch:{ Exception -> 0x0339 }
            java.lang.Class<X.QXj> r6 = X.C7798QXj.class
            r4 = 2
            java.lang.String r3 = "new_payment_credential_options"
            r2 = 1887269542(0x707d72a6, float:3.1375324E29)
            com.google.common.collect.ImmutableList r2 = r9.getRequiredCompactedTreeListField(r4, r3, r6, r2)     // Catch:{ Exception -> 0x0339 }
            java.util.ArrayList r6 = X.DbV.A15(r2)     // Catch:{ Exception -> 0x0339 }
            java.util.Iterator r3 = r2.iterator()     // Catch:{ Exception -> 0x0339 }
        L_0x026d:
            boolean r2 = r3.hasNext()     // Catch:{ Exception -> 0x0339 }
            if (r2 == 0) goto L_0x027f
            java.lang.Object r2 = r3.next()     // Catch:{ Exception -> 0x0339 }
            X.QXj r2 = (X.C7798QXj) r2     // Catch:{ Exception -> 0x0339 }
            if (r2 == 0) goto L_0x026d
            r6.add(r2)     // Catch:{ Exception -> 0x0339 }
            goto L_0x026d
        L_0x027f:
            java.lang.Class<X.QUk> r8 = X.C7721QUk.class
            r4 = 4
            java.lang.String r3 = "apm_options"
            r2 = 742627186(0x2c439772, float:2.7795236E-12)
            com.google.common.collect.ImmutableList r2 = r9.getRequiredCompactedTreeListField(r4, r3, r8, r2)     // Catch:{ Exception -> 0x0339 }
            java.util.ArrayList r4 = X.DbV.A15(r2)     // Catch:{ Exception -> 0x0339 }
            java.util.Iterator r3 = r2.iterator()     // Catch:{ Exception -> 0x0339 }
        L_0x0293:
            boolean r2 = r3.hasNext()     // Catch:{ Exception -> 0x0339 }
            if (r2 == 0) goto L_0x02a5
            java.lang.Object r2 = r3.next()     // Catch:{ Exception -> 0x0339 }
            X.QUk r2 = (X.C7721QUk) r2     // Catch:{ Exception -> 0x0339 }
            if (r2 == 0) goto L_0x0293
            r4.add(r2)     // Catch:{ Exception -> 0x0339 }
            goto L_0x0293
        L_0x02a5:
            java.lang.Class<X.BXJ> r11 = X.BXJ.class
            r8 = 3
            java.lang.String r3 = "address_form_fields_config"
            r2 = -195045265(0xfffffffff45fd86f, float:-7.0939453E31)
            X.3lr r8 = r9.getOptionalTreeField(r8, r3, r11, r2)     // Catch:{ Exception -> 0x0339 }
            X.BXJ r8 = (X.BXJ) r8     // Catch:{ Exception -> 0x0339 }
            if (r8 == 0) goto L_0x032f
            java.lang.Class<X.QSO> r3 = X.QSO.class
            r2 = -1659328637(0xffffffff9d18a783, float:-2.0203634E-21)
            X.3lr r14 = r8.reinterpretRequired(r10, r3, r2)     // Catch:{ Exception -> 0x0339 }
            X.QSO r14 = (X.QSO) r14     // Catch:{ Exception -> 0x0339 }
            X.0qQ.A07(r14)     // Catch:{ Exception -> 0x0339 }
            java.lang.String r3 = "should_order_new_options_first"
            boolean r2 = r9.hasFieldValue(r3)     // Catch:{ Exception -> 0x0339 }
            if (r2 == 0) goto L_0x02d5
            r2 = 5
            boolean r2 = r9.getCoercedBooleanField(r2, r3)     // Catch:{ Exception -> 0x0339 }
            r22 = 1
            if (r2 != 0) goto L_0x02d7
        L_0x02d5:
            r22 = 0
        L_0x02d7:
            java.lang.String r3 = "should_de_prioritize_credit_cards"
            boolean r2 = r9.hasFieldValue(r3)     // Catch:{ Exception -> 0x0339 }
            if (r2 == 0) goto L_0x02e9
            r2 = 6
            boolean r2 = r9.getCoercedBooleanField(r2, r3)     // Catch:{ Exception -> 0x0339 }
            r23 = 1
            if (r2 != 0) goto L_0x02eb
        L_0x02e9:
            r23 = 0
        L_0x02eb:
            java.lang.String r10 = r1.A0A     // Catch:{ Exception -> 0x0339 }
            java.lang.Class<X.BXK> r8 = X.BXK.class
            r3 = 7
            java.lang.String r2 = "card_form_field_config"
            r1 = -1925173025(0xffffffff8d4030df, float:-5.9223394E-31)
            com.google.common.collect.ImmutableList r21 = X.C41845B3m.A0X(r9, r8, r2, r3, r1)     // Catch:{ Exception -> 0x0339 }
            X.SJH r13 = new X.SJH     // Catch:{ Exception -> 0x0339 }
            r16 = r10
            r19 = r6
            r20 = r4
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x0339 }
            java.lang.String r3 = r7.A03     // Catch:{ Exception -> 0x0339 }
            java.lang.Integer r2 = r5.A00     // Catch:{ Exception -> 0x0339 }
            java.lang.String r1 = "NETWORK_ONLY"
            boolean r1 = r3.equals(r1)     // Catch:{ Exception -> 0x0339 }
            if (r1 == 0) goto L_0x0313
            java.lang.Integer r1 = X.AnonymousClass05K.A00     // Catch:{ Exception -> 0x0339 }
            goto L_0x0321
        L_0x0313:
            java.lang.String r1 = "PERSISTENT_UP_TO_DATE"
            boolean r1 = r3.equals(r1)     // Catch:{ Exception -> 0x0339 }
            if (r1 == 0) goto L_0x0329
            java.lang.Integer r1 = X.AnonymousClass05K.A00     // Catch:{ Exception -> 0x0339 }
            if (r2 == r1) goto L_0x0329
            java.lang.Integer r1 = X.AnonymousClass05K.A01     // Catch:{ Exception -> 0x0339 }
        L_0x0321:
            if (r2 == r1) goto L_0x0329
            X.SUj r8 = X.SUj.A08(r13)     // Catch:{ Exception -> 0x0339 }
            goto L_0x00b4
        L_0x0329:
            X.SUj r8 = X.SUj.A09(r13)     // Catch:{ Exception -> 0x0339 }
            goto L_0x00b4
        L_0x032f:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r13)     // Catch:{ Exception -> 0x0339 }
            throw r1     // Catch:{ Exception -> 0x0339 }
        L_0x0334:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r13)     // Catch:{ Exception -> 0x0339 }
            throw r1     // Catch:{ Exception -> 0x0339 }
        L_0x0339:
            r1 = move-exception
            java.lang.String r2 = r1.getMessage()
            if (r2 != 0) goto L_0x0342
            java.lang.String r2 = ""
        L_0x0342:
            X.RKx r1 = new X.RKx
            r1.<init>(r2)
            X.SUj r8 = X.SUj.A0A(r15, r1)
            goto L_0x00b4
        L_0x034d:
            boolean r1 = r0 instanceof X.C8277QnJ
            if (r1 == 0) goto L_0x0614
            r7 = r0
            X.QnJ r7 = (X.C8277QnJ) r7
            int r1 = r7.A00
            if (r1 == 0) goto L_0x045e
            java.lang.String r11 = "Required value was null."
            r6 = 0
            X.0qQ.A0B(r5, r6)
            java.lang.Object r1 = r5.A01
            X.QXQ r1 = (X.QXQ) r1
            X.QnS r2 = X.SPz.A01(r1)
            r15 = 0
            if (r2 != 0) goto L_0x06f2
            java.lang.Throwable r2 = r5.A02
            if (r2 != 0) goto L_0x06f2
            if (r1 == 0) goto L_0x0370
            goto L_0x0372
        L_0x0370:
            r8 = r15
            goto L_0x0394
        L_0x0372:
            X.QXP r1 = r1.A0E()     // Catch:{ Exception -> 0x044c }
            if (r1 == 0) goto L_0x0370
            com.google.common.collect.ImmutableList r1 = r1.A0E()     // Catch:{ Exception -> 0x044c }
            if (r1 == 0) goto L_0x0370
            java.lang.Object r8 = X.00k.A0J(r1)     // Catch:{ Exception -> 0x044c }
            X.QSf r8 = (X.C7664QSf) r8     // Catch:{ Exception -> 0x044c }
            if (r8 == 0) goto L_0x0370
            java.lang.Class<X.QVJ> r4 = X.QVJ.class
            r3 = 1
            java.lang.String r2 = "PAYFBPayComponentShippingAddress"
            r1 = 23078303(0x160259f, float:4.1169294E-38)
            X.3lr r8 = r8.reinterpretIfFulfillsType(r3, r2, r4, r1)     // Catch:{ Exception -> 0x044c }
            X.QVJ r8 = (X.QVJ) r8     // Catch:{ Exception -> 0x044c }
        L_0x0394:
            java.lang.Object r1 = r7.A01     // Catch:{ Exception -> 0x044c }
            X.SJK r1 = (X.SJK) r1     // Catch:{ Exception -> 0x044c }
            boolean r4 = r7.A03     // Catch:{ Exception -> 0x044c }
            X.01N r10 = X.0jo.A1H()     // Catch:{ Exception -> 0x044c }
            com.facebookpay.otc.models.OtcInput r1 = r1.A04     // Catch:{ Exception -> 0x044c }
            r7 = 1
            r9 = 0
            if (r1 == 0) goto L_0x03cb
            r9 = 1
            if (r8 == 0) goto L_0x03cb
            java.lang.Class<X.QVH> r3 = X.QVH.class
            java.lang.String r2 = "one_time_shipping_address_v2"
            r1 = 2095270863(0x7ce34bcf, float:9.441512E36)
            X.3lr r3 = r8.A04(r3, r2, r1)     // Catch:{ Exception -> 0x044c }
            X.QVH r3 = (X.QVH) r3     // Catch:{ Exception -> 0x044c }
            if (r3 == 0) goto L_0x03cb
            java.lang.Class<X.QVN> r2 = X.QVN.class
            r1 = -1235561061(0xffffffffb65ad59b, float:-3.2608866E-6)
            X.3lr r1 = r3.reinterpretRequired(r6, r2, r1)     // Catch:{ Exception -> 0x044c }
            X.QVN r1 = (X.QVN) r1     // Catch:{ Exception -> 0x044c }
            if (r1 == 0) goto L_0x03cb
            com.facebookpay.shippingaddress.model.ShippingAddress r1 = X.SQ0.A02(r1, r7)     // Catch:{ Exception -> 0x044c }
            r10.add(r1)     // Catch:{ Exception -> 0x044c }
        L_0x03cb:
            if (r4 != 0) goto L_0x03cf
            if (r9 != 0) goto L_0x0409
        L_0x03cf:
            if (r8 == 0) goto L_0x0409
            java.lang.Class<X.QVI> r3 = X.QVI.class
            java.lang.String r2 = "shipping_addresses"
            r1 = 1301690946(0x4d963a42, float:3.15050048E8)
            com.google.common.collect.ImmutableList r1 = r8.getRequiredCompactedTreeListField(r6, r2, r3, r1)     // Catch:{ Exception -> 0x044c }
            if (r1 == 0) goto L_0x0409
            java.util.ArrayList r9 = X.AnonymousClass7TG.A0r(r1)     // Catch:{ Exception -> 0x044c }
            java.util.Iterator r4 = r1.iterator()     // Catch:{ Exception -> 0x044c }
        L_0x03e7:
            boolean r1 = r4.hasNext()     // Catch:{ Exception -> 0x044c }
            if (r1 == 0) goto L_0x0406
            java.lang.Object r3 = r4.next()     // Catch:{ Exception -> 0x044c }
            X.QVI r3 = (X.QVI) r3     // Catch:{ Exception -> 0x044c }
            java.lang.Class<X.QVN> r2 = X.QVN.class
            r1 = -1235561061(0xffffffffb65ad59b, float:-3.2608866E-6)
            X.3lr r1 = r3.reinterpretRequired(r6, r2, r1)     // Catch:{ Exception -> 0x044c }
            X.QVN r1 = (X.QVN) r1     // Catch:{ Exception -> 0x044c }
            com.facebookpay.shippingaddress.model.ShippingAddress r1 = X.SQ0.A02(r1, r6)     // Catch:{ Exception -> 0x044c }
            r9.add(r1)     // Catch:{ Exception -> 0x044c }
            goto L_0x03e7
        L_0x0406:
            r10.addAll(r9)     // Catch:{ Exception -> 0x044c }
        L_0x0409:
            X.01N r4 = X.0jo.A1I(r10)     // Catch:{ Exception -> 0x044c }
            if (r8 == 0) goto L_0x0447
            java.lang.Class<X.BXa> r3 = X.C42257BXa.class
            java.lang.String r2 = "address_form_fields_config"
            r1 = -1620744204(0xffffffff9f6567f4, float:-4.8578624E-20)
            X.3lr r3 = r8.getOptionalTreeField(r7, r2, r3, r1)     // Catch:{ Exception -> 0x044c }
            X.BXa r3 = (X.C42257BXa) r3     // Catch:{ Exception -> 0x044c }
            if (r3 == 0) goto L_0x0447
            java.lang.Class<X.QSO> r2 = X.QSO.class
            r1 = -1659328637(0xffffffff9d18a783, float:-2.0203634E-21)
            X.3lr r1 = r3.reinterpretRequired(r6, r2, r1)     // Catch:{ Exception -> 0x044c }
            X.QSO r1 = (X.QSO) r1     // Catch:{ Exception -> 0x044c }
            X.0qQ.A07(r1)     // Catch:{ Exception -> 0x044c }
            X.Rua r3 = new X.Rua     // Catch:{ Exception -> 0x044c }
            r3.<init>(r1, r15, r4)     // Catch:{ Exception -> 0x044c }
            java.lang.Integer r2 = r5.A00     // Catch:{ Exception -> 0x044c }
            java.lang.Integer r1 = X.AnonymousClass05K.A00     // Catch:{ Exception -> 0x044c }
            if (r2 == r1) goto L_0x0441
            java.lang.Integer r1 = X.AnonymousClass05K.A01     // Catch:{ Exception -> 0x044c }
            if (r2 == r1) goto L_0x0441
            X.SUj r8 = X.SUj.A08(r3)     // Catch:{ Exception -> 0x044c }
            goto L_0x00b4
        L_0x0441:
            X.SUj r8 = X.SUj.A09(r3)     // Catch:{ Exception -> 0x044c }
            goto L_0x00b4
        L_0x0447:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r11)     // Catch:{ Exception -> 0x044c }
            throw r1     // Catch:{ Exception -> 0x044c }
        L_0x044c:
            r1 = move-exception
            java.lang.String r2 = r1.getMessage()
            if (r2 == 0) goto L_0x0a43
            X.RKx r1 = new X.RKx
            r1.<init>(r2)
            X.SUj r8 = X.SUj.A0A(r15, r1)
            goto L_0x00b4
        L_0x045e:
            r10 = 0
            X.0qQ.A0B(r5, r10)
            java.lang.Object r1 = r5.A01
            X.QXQ r1 = (X.QXQ) r1
            X.QnS r2 = X.SPz.A01(r1)
            r15 = 0
            if (r2 != 0) goto L_0x06f2
            java.lang.Throwable r2 = r5.A02
            if (r2 != 0) goto L_0x06f2
            if (r1 == 0) goto L_0x0608
            X.QXP r1 = r1.A0E()     // Catch:{ Exception -> 0x060d }
            if (r1 == 0) goto L_0x0608
            com.google.common.collect.ImmutableList r1 = r1.A0E()     // Catch:{ Exception -> 0x060d }
            if (r1 == 0) goto L_0x0608
            r8 = 0
            java.lang.Object r6 = r1.get(r10)     // Catch:{ Exception -> 0x060d }
            X.QSf r6 = (X.C7664QSf) r6     // Catch:{ Exception -> 0x060d }
            if (r6 == 0) goto L_0x0608
            java.lang.Class<X.QRa> r4 = X.C7633QRa.class
            r3 = 2
            java.lang.String r2 = "PAYFBPayComponentContactInformation"
            r1 = -1055014915(0xffffffffc11dbffd, float:-9.859372)
            X.3lr r13 = r6.reinterpretIfFulfillsType(r3, r2, r4, r1)     // Catch:{ Exception -> 0x060d }
            X.QRa r13 = (X.C7633QRa) r13     // Catch:{ Exception -> 0x060d }
            if (r13 == 0) goto L_0x0608
            java.lang.Object r1 = r7.A01     // Catch:{ Exception -> 0x060d }
            X.SJK r1 = (X.SJK) r1     // Catch:{ Exception -> 0x060d }
            com.facebookpay.otc.models.OtcInput r1 = r1.A04     // Catch:{ Exception -> 0x060d }
            if (r1 == 0) goto L_0x04a1
            r8 = 1
        L_0x04a1:
            boolean r7 = r7.A03     // Catch:{ Exception -> 0x060d }
            if (r8 == 0) goto L_0x04b7
            r2 = 8
            java.lang.String r1 = "one_time_payer_name"
        L_0x04aa:
            java.lang.String r2 = r13.getOptionalStringField(r2, r1)     // Catch:{ Exception -> 0x060d }
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()     // Catch:{ Exception -> 0x060d }
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()     // Catch:{ Exception -> 0x060d }
            goto L_0x04bc
        L_0x04b7:
            r2 = 2
            java.lang.String r1 = "payer_name"
            goto L_0x04aa
        L_0x04bc:
            if (r8 == 0) goto L_0x050a
            java.lang.Class<X.QRX> r8 = X.QRX.class
            r6 = 6
            java.lang.String r4 = "one_time_email"
            r1 = -1507985347(0xffffffffa61df83d, float:-5.4806743E-16)
            X.3lr r6 = r13.getOptionalTreeField(r6, r4, r8, r1)     // Catch:{ Exception -> 0x060d }
            X.QRX r6 = (X.QRX) r6     // Catch:{ Exception -> 0x060d }
            if (r6 == 0) goto L_0x04e3
            java.lang.Class<X.QT5> r4 = X.QT5.class
            r1 = 693675366(0x2958a566, float:4.8105095E-14)
            X.3lr r1 = r6.reinterpretRequired(r10, r4, r1)     // Catch:{ Exception -> 0x060d }
            X.QT5 r1 = (X.QT5) r1     // Catch:{ Exception -> 0x060d }
            if (r1 == 0) goto L_0x04e3
            X.S6Z r1 = X.C11080S9a.A00(r1)     // Catch:{ Exception -> 0x060d }
            r3.add(r1)     // Catch:{ Exception -> 0x060d }
        L_0x04e3:
            java.lang.Class<X.QRY> r8 = X.QRY.class
            r6 = 7
            java.lang.String r4 = "one_time_phone"
            r1 = -106062234(0xfffffffff9ad9e66, float:-1.1268501E35)
            X.3lr r6 = r13.getOptionalTreeField(r6, r4, r8, r1)     // Catch:{ Exception -> 0x060d }
            X.QRY r6 = (X.QRY) r6     // Catch:{ Exception -> 0x060d }
            if (r6 == 0) goto L_0x0508
            java.lang.Class<X.QTI> r4 = X.QTI.class
            r1 = 1741235608(0x67c92598, float:1.8997783E24)
            X.3lr r1 = r6.reinterpretRequired(r10, r4, r1)     // Catch:{ Exception -> 0x060d }
            X.QTI r1 = (X.QTI) r1     // Catch:{ Exception -> 0x060d }
            if (r1 == 0) goto L_0x0508
            X.S6V r1 = X.C11080S9a.A01(r1)     // Catch:{ Exception -> 0x060d }
            r9.add(r1)     // Catch:{ Exception -> 0x060d }
        L_0x0508:
            if (r7 == 0) goto L_0x057c
        L_0x050a:
            java.lang.Class<X.QRW> r6 = X.QRW.class
            java.lang.String r4 = "emails"
            r1 = -224773282(0xfffffffff29a3b5e, float:-6.109755E30)
            com.google.common.collect.ImmutableList r1 = X.C41845B3m.A0X(r13, r6, r4, r10, r1)     // Catch:{ Exception -> 0x060d }
            java.util.ArrayList r7 = X.AnonymousClass7TF.A0p(r1)     // Catch:{ Exception -> 0x060d }
            java.util.Iterator r8 = r1.iterator()     // Catch:{ Exception -> 0x060d }
        L_0x051d:
            boolean r1 = r8.hasNext()     // Catch:{ Exception -> 0x060d }
            if (r1 == 0) goto L_0x053f
            java.lang.Object r6 = r8.next()     // Catch:{ Exception -> 0x060d }
            X.QRW r6 = (X.QRW) r6     // Catch:{ Exception -> 0x060d }
            java.lang.Class<X.QT5> r4 = X.QT5.class
            r1 = 693675366(0x2958a566, float:4.8105095E-14)
            X.3lr r1 = r6.reinterpretRequired(r10, r4, r1)     // Catch:{ Exception -> 0x060d }
            X.QT5 r1 = (X.QT5) r1     // Catch:{ Exception -> 0x060d }
            X.0qQ.A07(r1)     // Catch:{ Exception -> 0x060d }
            X.S6Z r1 = X.C11080S9a.A00(r1)     // Catch:{ Exception -> 0x060d }
            r7.add(r1)     // Catch:{ Exception -> 0x060d }
            goto L_0x051d
        L_0x053f:
            r3.addAll(r7)     // Catch:{ Exception -> 0x060d }
            java.lang.Class<X.QRZ> r7 = X.QRZ.class
            r6 = 1
            java.lang.String r4 = "phone_numbers"
            r1 = 1827125585(0x6ce7b951, float:2.241096E27)
            com.google.common.collect.ImmutableList r1 = X.C41845B3m.A0X(r13, r7, r4, r6, r1)     // Catch:{ Exception -> 0x060d }
            java.util.ArrayList r7 = X.AnonymousClass7TF.A0p(r1)     // Catch:{ Exception -> 0x060d }
            java.util.Iterator r8 = r1.iterator()     // Catch:{ Exception -> 0x060d }
        L_0x0557:
            boolean r1 = r8.hasNext()     // Catch:{ Exception -> 0x060d }
            if (r1 == 0) goto L_0x0579
            java.lang.Object r6 = r8.next()     // Catch:{ Exception -> 0x060d }
            X.QRZ r6 = (X.QRZ) r6     // Catch:{ Exception -> 0x060d }
            java.lang.Class<X.QTI> r4 = X.QTI.class
            r1 = 1741235608(0x67c92598, float:1.8997783E24)
            X.3lr r1 = r6.reinterpretRequired(r10, r4, r1)     // Catch:{ Exception -> 0x060d }
            X.QTI r1 = (X.QTI) r1     // Catch:{ Exception -> 0x060d }
            X.0qQ.A07(r1)     // Catch:{ Exception -> 0x060d }
            X.S6V r1 = X.C11080S9a.A01(r1)     // Catch:{ Exception -> 0x060d }
            r7.add(r1)     // Catch:{ Exception -> 0x060d }
            goto L_0x0557
        L_0x0579:
            r9.addAll(r7)     // Catch:{ Exception -> 0x060d }
        L_0x057c:
            java.lang.Class<X.BSz> r7 = X.C42152BSz.class
            r6 = 5
            java.lang.String r4 = "full_name_field_config"
            r1 = -1933403923(0xffffffff8cc298ed, float:-2.9982472E-31)
            X.3lr r1 = r13.getOptionalTreeField(r6, r4, r7, r1)     // Catch:{ Exception -> 0x060d }
            X.BSz r1 = (X.C42152BSz) r1     // Catch:{ Exception -> 0x060d }
            java.lang.String r14 = "Required value was null."
            if (r1 == 0) goto L_0x0603
            java.lang.Class<X.QXR> r11 = X.QXR.class
            r8 = 2121596196(0x7e74fd24, float:8.1411503E37)
            X.3lr r1 = r1.reinterpretRequired(r10, r11, r8)     // Catch:{ Exception -> 0x060d }
            X.QXR r1 = (X.QXR) r1     // Catch:{ Exception -> 0x060d }
            X.0qQ.A07(r1)     // Catch:{ Exception -> 0x060d }
            X.S5a r7 = new X.S5a     // Catch:{ Exception -> 0x060d }
            r7.<init>(r1, r2)     // Catch:{ Exception -> 0x060d }
            java.lang.Class<X.BSy> r6 = X.C42151BSy.class
            r4 = 3
            java.lang.String r2 = "email_form_field_config"
            r1 = 331328254(0x13bfaafe, float:4.838379E-27)
            X.3lr r1 = r13.getOptionalTreeField(r4, r2, r6, r1)     // Catch:{ Exception -> 0x060d }
            X.BSy r1 = (X.C42151BSy) r1     // Catch:{ Exception -> 0x060d }
            if (r1 == 0) goto L_0x05fe
            X.3lr r1 = r1.reinterpretRequired(r10, r11, r8)     // Catch:{ Exception -> 0x060d }
            X.QXR r1 = (X.QXR) r1     // Catch:{ Exception -> 0x060d }
            X.0qQ.A07(r1)     // Catch:{ Exception -> 0x060d }
            X.S6I r6 = new X.S6I     // Catch:{ Exception -> 0x060d }
            r6.<init>(r1, r15, r15, r3)     // Catch:{ Exception -> 0x060d }
            java.lang.Class<X.BT0> r4 = X.BT0.class
            r3 = 4
            java.lang.String r2 = "phone_form_field_config"
            r1 = 305312347(0x1232b25b, float:5.6386737E-28)
            X.3lr r1 = r13.getOptionalTreeField(r3, r2, r4, r1)     // Catch:{ Exception -> 0x060d }
            X.BT0 r1 = (X.BT0) r1     // Catch:{ Exception -> 0x060d }
            if (r1 == 0) goto L_0x05f9
            X.3lr r2 = r1.reinterpretRequired(r10, r11, r8)     // Catch:{ Exception -> 0x060d }
            X.QXR r2 = (X.QXR) r2     // Catch:{ Exception -> 0x060d }
            X.0qQ.A07(r2)     // Catch:{ Exception -> 0x060d }
            X.S6J r1 = new X.S6J     // Catch:{ Exception -> 0x060d }
            r1.<init>(r2, r15, r15, r9)     // Catch:{ Exception -> 0x060d }
            X.S60 r3 = new X.S60     // Catch:{ Exception -> 0x060d }
            r3.<init>(r6, r7, r1)     // Catch:{ Exception -> 0x060d }
            java.lang.Integer r2 = r5.A00     // Catch:{ Exception -> 0x060d }
            java.lang.Integer r1 = X.AnonymousClass05K.A00     // Catch:{ Exception -> 0x060d }
            if (r2 == r1) goto L_0x05f3
            java.lang.Integer r1 = X.AnonymousClass05K.A01     // Catch:{ Exception -> 0x060d }
            if (r2 == r1) goto L_0x05f3
            X.SUj r8 = X.SUj.A08(r3)     // Catch:{ Exception -> 0x060d }
            goto L_0x00b4
        L_0x05f3:
            X.SUj r8 = X.SUj.A09(r3)     // Catch:{ Exception -> 0x060d }
            goto L_0x00b4
        L_0x05f9:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r14)     // Catch:{ Exception -> 0x060d }
            throw r1     // Catch:{ Exception -> 0x060d }
        L_0x05fe:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r14)     // Catch:{ Exception -> 0x060d }
            throw r1     // Catch:{ Exception -> 0x060d }
        L_0x0603:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r14)     // Catch:{ Exception -> 0x060d }
            throw r1     // Catch:{ Exception -> 0x060d }
        L_0x0608:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()     // Catch:{ Exception -> 0x060d }
            throw r1     // Catch:{ Exception -> 0x060d }
        L_0x060d:
            r1 = move-exception
            X.SUj r8 = X.SUj.A0A(r15, r1)
            goto L_0x00b4
        L_0x0614:
            boolean r1 = r0 instanceof X.C8275QnH
            if (r1 == 0) goto L_0x06f8
            r2 = r0
            X.QnH r2 = (X.C8275QnH) r2
            int r1 = r2.A00
            if (r1 == 0) goto L_0x0638
            java.lang.Object r2 = r2.A02
            X.1MD r2 = (X.1MD) r2
            java.lang.Object r1 = r5.A01
            java.lang.Object r2 = r2.apply(r1)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r15 = 0
            if (r2 != 0) goto L_0x06f2
            java.lang.Throwable r2 = r5.A02
            if (r2 != 0) goto L_0x06f2
            X.SUj r8 = X.SUj.A09(r1)
            goto L_0x00b4
        L_0x0638:
            r7 = 0
            X.0qQ.A0B(r5, r7)
            java.lang.Object r1 = r5.A01
            X.QXQ r1 = (X.QXQ) r1
            X.QnS r2 = X.SPz.A01(r1)
            r15 = 0
            if (r2 != 0) goto L_0x06f2
            java.lang.Throwable r2 = r5.A02
            if (r2 != 0) goto L_0x06f2
            if (r1 == 0) goto L_0x0670
            X.QXP r1 = r1.A0E()     // Catch:{ Exception -> 0x06eb }
            if (r1 == 0) goto L_0x0670
            com.google.common.collect.ImmutableList r1 = r1.A0E()     // Catch:{ Exception -> 0x06eb }
            if (r1 == 0) goto L_0x0670
            java.lang.Object r5 = r1.get(r7)     // Catch:{ Exception -> 0x06eb }
            X.QSf r5 = (X.C7664QSf) r5     // Catch:{ Exception -> 0x06eb }
            if (r5 == 0) goto L_0x0670
            java.lang.Class<X.QVd> r4 = X.C7740QVd.class
            r3 = 3
            java.lang.String r2 = "PAYFBPayComponentDisclaimerWithSheet"
            r1 = -1573102255(0xffffffffa23c5d51, float:-2.5528152E-18)
            X.3lr r5 = r5.reinterpretIfFulfillsType(r3, r2, r4, r1)     // Catch:{ Exception -> 0x06eb }
            X.QVd r5 = (X.C7740QVd) r5     // Catch:{ Exception -> 0x06eb }
            goto L_0x0671
        L_0x0670:
            r5 = r15
        L_0x0671:
            java.lang.String r6 = "Required value was null."
            if (r5 == 0) goto L_0x06e6
            java.lang.String r1 = "body_text"
            java.lang.String r1 = r5.getOptionalStringField(r7, r1)     // Catch:{ Exception -> 0x06eb }
            if (r1 == 0) goto L_0x06e1
            java.lang.Class<X.BXe> r4 = X.C42261BXe.class
            r3 = 5
            java.lang.String r2 = "cta_text"
            r1 = -2098970173(0xffffffff82e441c3, float:-3.3539334E-37)
            X.3lr r1 = r5.getOptionalTreeField(r3, r2, r4, r1)     // Catch:{ Exception -> 0x06eb }
            X.BXe r1 = (X.C42261BXe) r1     // Catch:{ Exception -> 0x06eb }
            if (r1 == 0) goto L_0x06dc
            java.lang.Class<X.BXf> r4 = X.C42262BXf.class
            r3 = 3
            java.lang.String r2 = "payments_terms"
            r1 = 281542544(0x10c7ff90, float:7.8885416E-29)
            X.3lr r1 = r5.getOptionalTreeField(r3, r2, r4, r1)     // Catch:{ Exception -> 0x06eb }
            X.BXf r1 = (X.C42262BXf) r1     // Catch:{ Exception -> 0x06eb }
            if (r1 == 0) goto L_0x06d7
            java.lang.Class<X.BXg> r4 = X.C42263BXg.class
            r3 = 4
            java.lang.String r2 = "privacy_policy_terms"
            r1 = 1178531916(0x463ef84c, float:12222.074)
            X.3lr r1 = r5.getOptionalTreeField(r3, r2, r4, r1)     // Catch:{ Exception -> 0x06eb }
            X.BXg r1 = (X.C42263BXg) r1     // Catch:{ Exception -> 0x06eb }
            if (r1 == 0) goto L_0x06d2
            r2 = 2
            java.lang.String r1 = "sheet_body_text"
            com.google.common.collect.ImmutableList r1 = r5.getRequiredCompactedStringListField(r2, r1)     // Catch:{ Exception -> 0x06eb }
            if (r1 == 0) goto L_0x06cd
            java.lang.String r1 = "sheet_header"
            java.lang.String r1 = r5.A08(r1)     // Catch:{ Exception -> 0x06eb }
            if (r1 == 0) goto L_0x06c8
            X.SUj r8 = X.SUj.A09(r5)     // Catch:{ Exception -> 0x06eb }
            goto L_0x00b4
        L_0x06c8:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r6)     // Catch:{ Exception -> 0x06eb }
            throw r1     // Catch:{ Exception -> 0x06eb }
        L_0x06cd:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r6)     // Catch:{ Exception -> 0x06eb }
            throw r1     // Catch:{ Exception -> 0x06eb }
        L_0x06d2:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r6)     // Catch:{ Exception -> 0x06eb }
            throw r1     // Catch:{ Exception -> 0x06eb }
        L_0x06d7:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r6)     // Catch:{ Exception -> 0x06eb }
            throw r1     // Catch:{ Exception -> 0x06eb }
        L_0x06dc:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r6)     // Catch:{ Exception -> 0x06eb }
            throw r1     // Catch:{ Exception -> 0x06eb }
        L_0x06e1:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r6)     // Catch:{ Exception -> 0x06eb }
            throw r1     // Catch:{ Exception -> 0x06eb }
        L_0x06e6:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r6)     // Catch:{ Exception -> 0x06eb }
            throw r1     // Catch:{ Exception -> 0x06eb }
        L_0x06eb:
            r1 = move-exception
            X.SUj r8 = X.SUj.A0A(r15, r1)
            goto L_0x00b4
        L_0x06f2:
            X.SUj r8 = X.SUj.A0A(r15, r2)
            goto L_0x00b4
        L_0x06f8:
            boolean r1 = r0 instanceof X.C8274QnG
            if (r1 == 0) goto L_0x0820
            r2 = r0
            X.QnG r2 = (X.C8274QnG) r2
            java.lang.Throwable r1 = r5.A02
            if (r1 != 0) goto L_0x081a
            java.lang.Object r6 = r5.A01
            X.RuZ r6 = (X.C10579RuZ) r6
            java.util.HashMap r7 = X.AnonymousClass7TE.A1E()
            X.SSZ r5 = r2.A01
            java.util.HashMap r1 = X.SSZ.A03(r5)
            java.util.Iterator r3 = X.AnonymousClass7TF.A0s(r1)
        L_0x0715:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x072b
            java.util.Map$Entry r1 = X.AnonymousClass7TE.A1J(r3)
            java.lang.Object r2 = r1.getValue()
            java.lang.Object r1 = r1.getKey()
            r7.put(r2, r1)
            goto L_0x0715
        L_0x072b:
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            r6.getClass()
            java.util.List r1 = r6.A02
            java.util.Iterator r11 = r1.iterator()
        L_0x0738:
            boolean r1 = r11.hasNext()
            r9 = 2
            if (r1 == 0) goto L_0x07d6
            java.lang.Object r13 = r11.next()
            X.S6b r13 = (X.C11024S6b) r13
            java.lang.String r10 = r13.A05
            boolean r1 = r7.containsKey(r10)
            if (r1 == 0) goto L_0x0738
            java.lang.Object r15 = r7.remove(r10)
            r15.getClass()
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r2 = r13.A03
            java.lang.String r1 = "VALID"
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x07c3
            X.SSZ.A02(r5, r15)     // Catch:{ GeneralSecurityException -> 0x07bb }
            monitor-enter(r5)     // Catch:{ KeyStoreException -> 0x07b1 }
            java.security.PublicKey r8 = X.SSZ.A01(r5, r15)     // Catch:{ all -> 0x07ae }
            r3 = 0
            if (r8 == 0) goto L_0x0797
            java.lang.String r2 = r8.getAlgorithm()     // Catch:{ all -> 0x07ae }
            if (r2 == 0) goto L_0x077a
            java.lang.String r1 = "RSA"
            boolean r1 = r2.contains(r1)     // Catch:{ all -> 0x07ae }
            if (r1 == 0) goto L_0x077a
            r3 = 1
        L_0x077a:
            byte[] r1 = r8.getEncoded()     // Catch:{ all -> 0x07ae }
            java.lang.String r16 = android.util.Base64.encodeToString(r1, r9)     // Catch:{ all -> 0x07ae }
            monitor-exit(r5)     // Catch:{ KeyStoreException -> 0x07b1 }
            if (r3 == 0) goto L_0x0786
            goto L_0x0789
        L_0x0786:
            java.lang.Integer r14 = X.AnonymousClass05K.A00     // Catch:{ KeyStoreException -> 0x07b1 }
            goto L_0x078b
        L_0x0789:
            java.lang.Integer r14 = X.AnonymousClass05K.A0C     // Catch:{ KeyStoreException -> 0x07b1 }
        L_0x078b:
            long r1 = r6.A00     // Catch:{ KeyStoreException -> 0x07b1 }
            r17 = r1
            X.SNj r1 = X.C11330SNj.A00(r13, r14, r15, r16, r17)     // Catch:{ KeyStoreException -> 0x07b1 }
            r4.add(r1)     // Catch:{ KeyStoreException -> 0x07b1 }
            goto L_0x0738
        L_0x0797:
            java.lang.String r3 = "DefaultAuthTicketManager"
            java.lang.String r2 = "No public key found for alias %s"
            java.lang.Object[] r1 = new java.lang.Object[]{r15}     // Catch:{ all -> 0x07ae }
            X.0KC.A0O(r3, r2, r1)     // Catch:{ all -> 0x07ae }
            java.lang.String r1 = "No public key found for alias "
            java.lang.String r2 = X.002.A0R(r1, r15)     // Catch:{ all -> 0x07ae }
            java.security.KeyStoreException r1 = new java.security.KeyStoreException     // Catch:{ all -> 0x07ae }
            r1.<init>(r2)     // Catch:{ all -> 0x07ae }
            throw r1     // Catch:{ all -> 0x07ae }
        L_0x07ae:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ KeyStoreException -> 0x07b1 }
            throw r1     // Catch:{ KeyStoreException -> 0x07b1 }
        L_0x07b1:
            r3 = move-exception
            java.lang.String r2 = "DefaultAuthTicketManager"
            java.lang.String r1 = "Processing result"
            X.0KC.A0F(r2, r1, r3)
            goto L_0x0738
        L_0x07bb:
            r3 = move-exception
            java.lang.String r2 = "DefaultAuthTicketManager"
            java.lang.String r1 = "Get Signature safe"
            X.0KC.A0F(r2, r1, r3)
        L_0x07c3:
            java.lang.Exception r8 = r5.A07(r15)
            if (r8 == 0) goto L_0x0738
            java.lang.Class<X.SSZ> r3 = X.SSZ.class
            java.lang.Object[] r2 = new java.lang.Object[]{r10, r15}
            java.lang.String r1 = "When Deleting AT Server ID %s local alias"
            X.0KC.A07(r3, r1, r8, r2)
            goto L_0x0738
        L_0x07d6:
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto L_0x080d
            java.util.Iterator r9 = X.AnonymousClass7TF.A0s(r7)
        L_0x07e0:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x080d
            java.util.Map$Entry r8 = X.AnonymousClass7TE.A1J(r9)
            java.lang.Object r1 = r8.getValue()
            r1.getClass()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Exception r7 = r5.A07(r1)
            if (r7 == 0) goto L_0x07e0
            java.lang.Class<X.SSZ> r3 = X.SSZ.class
            java.lang.Object r2 = r8.getKey()
            java.lang.Object r1 = r8.getValue()
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r1}
            java.lang.String r1 = "When Deleting AT* Server ID %s local alias"
            X.0KC.A07(r3, r1, r7, r2)
            goto L_0x07e0
        L_0x080d:
            java.lang.String r2 = r6.A01
            X.34S r1 = new X.34S
            r1.<init>(r2, r4)
            X.SUj r8 = X.SUj.A09(r1)
            goto L_0x00b4
        L_0x081a:
            X.SUj r8 = X.SUj.A0B(r1)
            goto L_0x00b4
        L_0x0820:
            boolean r1 = r0 instanceof X.C8276QnI
            if (r1 == 0) goto L_0x0842
            java.lang.Throwable r1 = r5.A02
            if (r1 != 0) goto L_0x0839
            java.lang.Object r6 = r5.A01
            if (r6 == 0) goto L_0x0839
            r1 = r6
            X.RsK r1 = (X.C10443RsK) r1
            X.TQk r2 = r1.A00
            if (r2 != 0) goto L_0x096c
            X.SUj r8 = X.SUj.A09(r6)
            goto L_0x00b4
        L_0x0839:
            r1.getClass()
            X.SUj r8 = X.SUj.A0B(r1)
            goto L_0x00b4
        L_0x0842:
            boolean r1 = r0 instanceof X.C8281QnN
            if (r1 == 0) goto L_0x094e
            r7 = r0
            X.QnN r7 = (X.C8281QnN) r7
            r4 = 0
            X.0qQ.A0B(r5, r4)
            java.lang.Object r11 = r5.A01
            X.QXI r11 = (X.QXI) r11
            r3 = 0
            if (r11 == 0) goto L_0x0944
            X.QXk r1 = r11.A0E()
            if (r1 == 0) goto L_0x0944
            X.QRV r1 = r1.A0I()
            if (r1 == 0) goto L_0x0944
            java.lang.Class<X.QXc> r10 = X.C7791QXc.class
            r9 = -507874568(0xffffffffe1ba72f8, float:-4.2992235E20)
            X.3lr r6 = r1.A01(r10, r9)
            X.QXc r6 = (X.C7791QXc) r6
            if (r6 == 0) goto L_0x0945
            X.HNF r8 = X.HNF.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r2 = 2
            java.lang.String r1 = "error_step"
            java.lang.Enum r1 = r6.getOptionalEnumField(r2, r1, r8)
            if (r1 == 0) goto L_0x0945
            if (r1 == r8) goto L_0x0945
            X.QXk r1 = r11.A0E()
            if (r1 == 0) goto L_0x08f3
            X.QRV r1 = r1.A0I()
            if (r1 == 0) goto L_0x08f3
            X.3lr r1 = r1.A01(r10, r9)
            X.QXc r1 = (X.C7791QXc) r1
            if (r1 == 0) goto L_0x08f3
            X.QVK r1 = r1.A0E()
            if (r1 == 0) goto L_0x08f3
            X.QVG r1 = X.Pxj.A0S(r1)
            if (r1 == 0) goto L_0x08f3
            X.QnS r1 = X.SPz.A03(r1)
        L_0x089e:
            X.SUj r8 = X.SUj.A0A(r3, r1)
            X.0qQ.A0A(r8)
        L_0x08a5:
            com.facebookpay.logging.LoggingContext r15 = r7.A01
            java.lang.String r10 = r7.A05
            java.lang.String r9 = r7.A04
            com.facebookpay.otc.models.OtcInput r1 = r7.A02
            if (r1 == 0) goto L_0x08b3
            X.SEB r3 = X.C11300SKk.A01(r1)
        L_0x08b3:
            X.SUU r13 = X.C9962RkH.A00
            X.QIu r5 = new X.QIu
            r5.<init>()
            java.lang.String r2 = "shipping_address"
            java.lang.String r1 = "mutation_data"
            r5.A06(r1, r2)
            java.lang.String r1 = X.DbY.A0k(r10)
            X.NlW r2 = X.C69426NlW.valueOf(r1)
            java.lang.String r1 = "mutation_type"
            r5.A01(r2, r1)
            java.util.List r20 = X.AnonymousClass7TE.A1I(r5)
            if (r6 == 0) goto L_0x08f1
            X.HNF r5 = X.HNF.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r2 = 2
            java.lang.String r1 = "error_step"
            java.lang.Enum r14 = r6.getOptionalEnumField(r2, r1, r5)
            X.HNF r14 = (X.HNF) r14
        L_0x08e2:
            r16 = r3
            r17 = r8
            r18 = r10
            r19 = r9
            r21 = r4
            r13.A0F(r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x00b4
        L_0x08f1:
            r14 = 0
            goto L_0x08e2
        L_0x08f3:
            java.lang.Throwable r1 = r5.A02
            if (r1 != 0) goto L_0x089e
            X.QVK r1 = r6.A0E()
            if (r1 == 0) goto L_0x0942
            X.QVG r2 = X.Pxj.A0S(r1)
            if (r2 == 0) goto L_0x0942
            java.lang.String r1 = "error_code"
            int r8 = r2.getCoercedIntField(r4, r1)
        L_0x0909:
            java.lang.String r5 = "Unknown Server Error For Shipping Address Mutation"
            X.QVK r1 = r6.A0E()
            if (r1 == 0) goto L_0x0926
            X.QVG r2 = X.Pxj.A0S(r1)
            if (r2 == 0) goto L_0x0926
            java.lang.String r1 = "error_title"
            java.lang.String r2 = r2.A0B(r1)
            if (r2 == 0) goto L_0x0926
            boolean r1 = X.C51966G9m.A1X(r2)
            if (r1 == 0) goto L_0x0926
            r5 = r2
        L_0x0926:
            X.QVK r1 = r6.A0E()
            if (r1 == 0) goto L_0x093a
            X.QVG r2 = X.Pxj.A0S(r1)
            if (r2 == 0) goto L_0x093a
            java.lang.String r1 = "error_description"
            java.lang.String r1 = r2.A0C(r1)
            if (r1 != 0) goto L_0x093c
        L_0x093a:
            java.lang.String r1 = ""
        L_0x093c:
            X.TQk r1 = X.C9677Rev.A00(r5, r1, r8)
            goto L_0x089e
        L_0x0942:
            r8 = 0
            goto L_0x0909
        L_0x0944:
            r6 = r3
        L_0x0945:
            X.SUj r8 = X.SUj.A09(r6)
            X.0qQ.A0A(r8)
            goto L_0x08a5
        L_0x094e:
            r4 = r0
            X.Qnd r4 = (X.C8297Qnd) r4
            r9 = 0
            X.0qQ.A0B(r5, r9)
            X.0sP r2 = r4.A03
            java.lang.Object r8 = r5.A01
            X.RsR r8 = (X.C10450RsR) r8
            r6 = 0
            if (r8 == 0) goto L_0x0a13
            java.lang.Object r1 = r8.A00
        L_0x0960:
            java.lang.Object r2 = r2.invoke(r1)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            if (r2 == 0) goto L_0x0972
            if (r8 == 0) goto L_0x096c
        L_0x096a:
            java.lang.Object r6 = r8.A00
        L_0x096c:
            X.SUj r8 = X.SUj.A0A(r6, r2)
            goto L_0x00b4
        L_0x0972:
            java.lang.Throwable r2 = r5.A02
            boolean r1 = X.DbW.A1a(r2)
            java.lang.String r3 = "Required value was null."
            if (r1 == 0) goto L_0x0a0d
            X.S5Z r1 = r4.A01
            X.SNj r7 = r1.A00
            if (r7 == 0) goto L_0x0a16
            X.0sP r2 = r4.A02
            if (r8 == 0) goto L_0x0a6c
            java.lang.Object r1 = r8.A00
            java.lang.Object r6 = r2.invoke(r1)
            boolean r1 = r6 instanceof X.QSW
            if (r1 == 0) goto L_0x0a27
            X.SSZ r11 = X.SOC.A00()
            X.3lr r6 = (X.C250663lr) r6
            X.0qQ.A0B(r6, r9)
            java.lang.String r1 = "strong_id__"
            java.lang.String r14 = r6.getOptionalStringField(r9, r1)
            if (r14 == 0) goto L_0x0a65
            X.EWW r3 = X.EWW.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r2 = 2
            java.lang.String r1 = "auth_ticket_status"
            java.lang.Enum r1 = r6.getOptionalEnumField(r2, r1, r3)
            if (r1 == 0) goto L_0x0a5d
            java.lang.String r15 = r1.toString()
            if (r15 == 0) goto L_0x0a5d
            X.RFt r2 = X.C8925RFt.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r5 = 1
            java.lang.String r1 = "auth_ticket_type"
            java.lang.Enum r1 = r6.getOptionalEnumField(r5, r1, r2)
            if (r1 == 0) goto L_0x0a56
            java.lang.String r16 = r1.toString()
            if (r16 == 0) goto L_0x0a56
            java.lang.String r1 = "fingerprint"
            java.lang.String r17 = r6.A0A(r1)
            if (r17 == 0) goto L_0x0a4f
            r1 = 4
            java.lang.String r4 = "ttl"
            int r20 = r6.getCoercedIntField(r1, r4)
            java.lang.String r1 = "associated_credential_id"
            java.lang.String r18 = r6.A0C(r1)
            java.lang.Class<X.QSV> r10 = X.QSV.class
            r3 = 6
            java.lang.String r2 = "auth_ticket_capabilities"
            r1 = -1213122889(0xffffffffb7b136b7, float:-2.1125523E-5)
            com.google.common.collect.ImmutableList r1 = X.C41845B3m.A0X(r6, r10, r2, r3, r1)
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r10 = r1.iterator()
        L_0x09ee:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0a1d
            X.3lr r1 = X.C41845B3m.A0V(r10)
            java.lang.String r2 = "cap_name"
            java.lang.String r6 = r1.getOptionalStringField(r9, r2)
            if (r6 == 0) goto L_0x0a48
            int r2 = r1.getCoercedIntField(r5, r4)
            X.S5f r1 = new X.S5f
            r1.<init>(r6, r2)
            r3.add(r1)
            goto L_0x09ee
        L_0x0a0d:
            if (r2 == 0) goto L_0x0a71
            if (r8 == 0) goto L_0x096c
            goto L_0x096a
        L_0x0a13:
            r1 = r6
            goto L_0x0960
        L_0x0a16:
            if (r8 != 0) goto L_0x0a27
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x0a1d:
            X.S6b r13 = new X.S6b
            r19 = r3
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            r11.A05(r13, r7)
        L_0x0a27:
            java.lang.Object r1 = r8.A00
            X.SUj r8 = X.SUj.A09(r1)
            goto L_0x00b4
        L_0x0a2f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x0a34:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x0a39:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x0a3e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x0a43:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r11)
            throw r0
        L_0x0a48:
            java.lang.String r0 = "capability null , expected nonnull"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0a4f:
            java.lang.String r0 = "finger print is null expected non null"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0a56:
            java.lang.String r0 = "authTicketType is null expected non null"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0a5d:
            java.lang.String r0 = "status is null expected not null"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0a65:
            java.lang.String r0 = "id is null"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0a6c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x0a71:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12988TGv.run():void");
    }
}
