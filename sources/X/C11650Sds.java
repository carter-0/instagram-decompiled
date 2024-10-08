package X;

import com.facebookpay.logging.LoggingContext;

/* renamed from: X.Sds  reason: case insensitive filesystem */
public final class C11650Sds implements AnonymousClass2gO {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C11650Sds(C307896Rx r1, C277014uI r2, C277014uI r3, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
            case 15:
            case 16:
                this.A03 = r2;
                this.A01 = r1;
                break;
            case 14:
                this.A01 = r1;
                this.A03 = r2;
                break;
            default:
                this.A01 = r1;
                this.A02 = r2;
                this.A03 = r3;
                break;
        }
        this.A02 = r3;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0503, code lost:
        r0 = new X.SR4(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0508, code lost:
        r2.A0B(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x050b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0535, code lost:
        r0 = (X.SJK) r13.A01;
        r6 = r0.A09;
        r0 = r0.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x053d, code lost:
        if (r0 == null) goto L_0x055c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x053f, code lost:
        r4 = X.C11300SKk.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0543, code lost:
        X.0qQ.A0B(r5, 0);
        X.SUU.A0B(r1, new X.C58210IoE(r3, r4, r5, r6, 1), new X.C74189PqV((java.lang.Object) r3, (java.lang.Object) r4, (java.lang.Object) r5, r6, 20));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x055b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x055c, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x056e, code lost:
        r6 = (X.QKI) r13.A01;
        r5 = (com.instagram.ui.widget.radiogroup.IgRadioGroup) r13.A02;
        r1 = (android.view.View) r13.A03;
        r8 = X.C11413SSl.A03(r14, r6.requireArguments().getBoolean("disable_unbound_cards_usage"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x058c, code lost:
        if (r8.isEmpty() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x058e, code lost:
        r5.removeAllViews();
        r4 = r8.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0599, code lost:
        if (r4.hasNext() == false) goto L_0x05b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x059b, code lost:
        r0 = new X.QA1(r6.requireContext());
        r0.A00((com.fbpay.w3c.CardDetails) r4.next());
        X.JTS.A0x(r0);
        r5.addView(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x05b7, code lost:
        r2 = r5.getChildAt(0);
        r5.A02(r2.getId());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x05c8, code lost:
        if (r5.getChildCount() != 1) goto L_0x05d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x05ca, code lost:
        X.DbX.A1B(r2, com.instagram.android.R.id.radio_icon);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x05d0, code lost:
        r5.invalidate();
        r0 = r6.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x05d5, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x05dd, code lost:
        if (r0.A04.A00() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x05df, code lost:
        r0 = r6.A00;
        X.0qQ.A0B(r0, 0);
        r0 = X.AnonymousClass7TF.A0N(r0.A03.A00);
        r0.E5T("is_passkey_content_visible", false);
        r0.apply();
        r5 = r1.requireViewById(com.instagram.android.R.id.autofill_payment_save_passkey_view);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0601, code lost:
        if (r8.isEmpty() != false) goto L_0x061d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0603, code lost:
        r1 = r8.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x060b, code lost:
        if (r1.hasNext() == false) goto L_0x0629;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x060d, code lost:
        r0 = ((com.fbpay.w3c.CardDetails) r1.next()).A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0615, code lost:
        if (r0 == null) goto L_0x0607;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x061b, code lost:
        if (r0.size() <= 0) goto L_0x0607;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x061d, code lost:
        r6.A00.A00.A0A.A01 = false;
        r5.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0628, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0629, code lost:
        r6.A00.A00.A0A.A01 = true;
        r5.setVisibility(0);
        r0 = r6.A00;
        X.0qQ.A0B(r0, 0);
        r0 = X.AnonymousClass7TF.A0N(r0.A03.A00);
        r0.E5T("is_passkey_content_visible", true);
        r0.apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0647, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0663, code lost:
        r1 = r2.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0667, code lost:
        X.C299275ur.A00((X.C307896Rx) r13.A01, r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x066e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0675, code lost:
        r3 = (X.C277014uI) r13.A02;
        r1 = X.AnonymousClass6Tm.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0699, code lost:
        X.C308206Td.A0E(r2, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x06b9, code lost:
        r1 = (X.C277014uI) r1;
        r0 = new java.lang.Object[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onChanged(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 0: goto L_0x0648;
                case 1: goto L_0x055e;
                case 2: goto L_0x05b4;
                case 3: goto L_0x050c;
                case 4: goto L_0x04e5;
                case 5: goto L_0x03ab;
                case 6: goto L_0x02db;
                case 7: goto L_0x02b0;
                case 8: goto L_0x0279;
                case 9: goto L_0x024e;
                case 10: goto L_0x0239;
                case 11: goto L_0x020a;
                case 12: goto L_0x01e5;
                case 13: goto L_0x01bd;
                case 14: goto L_0x06aa;
                case 15: goto L_0x017f;
                case 16: goto L_0x0169;
                case 17: goto L_0x067c;
                case 18: goto L_0x00ff;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.SUj r14 = (X.SUj) r14
            boolean r0 = X.SUj.A0V(r14)
            if (r0 == 0) goto L_0x00c6
            java.lang.Object r9 = r14.A01
            if (r9 == 0) goto L_0x00c6
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r0 = r13.A01
            java.util.Map r0 = (java.util.Map) r0
            java.util.Collection r0 = r0.values()
            r6 = 10
            java.util.ArrayList r8 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0025:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0037
            java.lang.Object r0 = r1.next()
            X.0eP r0 = (X.0eP) r0
            java.lang.Object r0 = r0.A00
            r8.add(r0)
            goto L_0x0025
        L_0x0037:
            java.lang.Object r1 = r13.A03
            X.2Ld r1 = (X.2Ld) r1
            android.content.Context r0 = r1.A04
            r4 = 1
            X.0qQ.A0B(r0, r4)
            com.instagram.common.session.UserSession r0 = r1.A05
            java.lang.String r7 = r0.A06
            java.lang.String r2 = r1.A03
            if (r2 != 0) goto L_0x0053
            java.lang.String r0 = "deviceKeyPEM"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0053:
            X.2Lu r0 = r1.A00()
            java.lang.String r1 = r0.A02
            r0 = 3
            X.0qQ.A0B(r9, r0)
            X.59w r5 = new X.59w
            r5.<init>()
            X.QNI r3 = new X.QNI
            r3.<init>()
            java.lang.String r0 = "platform_trust_token"
            r3.A07(r9, r0)
            java.lang.String r0 = "bindable_keys"
            r3.A05(r0, r8)
            java.lang.String r0 = "trustable_key"
            r3.A07(r2, r0)
            java.lang.String r0 = "logging_id"
            r3.A07(r1, r0)
            java.lang.String r0 = "actor_id"
            r3.A07(r7, r0)
            java.lang.String r1 = X.AnonymousClass7TF.A0c()
            java.lang.String r0 = "client_mutation_id"
            r3.A07(r1, r0)
            java.lang.Class<X.S8x> r0 = X.C11077S8x.class
            java.lang.Object r2 = X.C41847B3o.A16(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0094 }
            X.SnK r2 = (X.C12121SnK) r2     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0094 }
            goto L_0x009a
        L_0x0094:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        L_0x009a:
            X.2IS r1 = r2.A00
            java.lang.String r0 = "input"
            r1.A00(r3, r0)
            r2.A01 = r4
            com.facebook.pando.PandoGraphQLRequest r4 = r2.build()
            X.5A3 r0 = X.AnonymousClass2E0.A06()
            X.0qQ.A07(r0)
            X.2E5 r0 = r0.A00
            X.1vo r3 = r0.A00
            X.Smn r2 = new X.Smn
            r2.<init>(r5, r6)
            r1 = 15
            X.Smk r0 = new X.Smk
            r0.<init>((X.C2818659w) r5, (int) r1)
            r3.ATL(r0, r2, r4)
            X.5A6 r0 = new X.5A6
            r0.<init>(r5)
        L_0x00c6:
            java.lang.Object r5 = r13.A02
            X.RtG r5 = (X.C10501RtG) r5
            java.util.Map r4 = r5.A01
            java.util.Iterator r3 = X.AnonymousClass7TF.A0u(r4)
        L_0x00d0:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00fb
            java.util.Map$Entry r2 = X.AnonymousClass7TE.A1J(r3)
            java.lang.Object r0 = r2.getValue()
            X.S2p r0 = (X.C10957S2p) r0
            android.content.ServiceConnection r1 = r0.A00
            if (r1 == 0) goto L_0x00e9
            android.content.Context r0 = r5.A00
            r0.unbindService(r1)
        L_0x00e9:
            java.lang.Object r0 = r2.getValue()
            X.S2p r0 = (X.C10957S2p) r0
            r1 = 0
            r0.A01 = r1
            java.lang.Object r0 = r2.getValue()
            X.S2p r0 = (X.C10957S2p) r0
            r0.A00 = r1
            goto L_0x00d0
        L_0x00fb:
            r4.clear()
            return
        L_0x00ff:
            java.util.List r14 = (java.util.List) r14
            X.0qQ.A0A(r14)
            java.lang.Object r6 = r13.A02
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r5 = r13.A03
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r4 = r13.A01
            X.2gB r4 = (X.AnonymousClass2gB) r4
            java.util.Iterator r9 = r14.iterator()
        L_0x0114:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x069c
            java.lang.Object r8 = r9.next()
            X.S2p r8 = (X.C10957S2p) r8
            java.lang.String r7 = r8.A03
            java.lang.Object r2 = r6.get(r7)
            byte[] r2 = (byte[]) r2
            if (r2 == 0) goto L_0x0114
            X.2Fj r0 = r8.A02
            java.lang.Object r1 = r0.A02()
            if (r1 != 0) goto L_0x0134
            X.REb r1 = X.C8884REb.UNKNOWN
        L_0x0134:
            X.REb r0 = X.C8884REb.CONNECTED
            if (r1 != r0) goto L_0x0114
            boolean r0 = r6.containsKey(r7)
            if (r0 == 0) goto L_0x0114
            X.RtF r3 = new X.RtF
            r3.<init>(r7)
            com.meta.trusteddevice.base.TrustedDeviceServiceClient$CrossAppServiceConnection$signPayload$crossAppSignatureCallback$1 r1 = new com.meta.trusteddevice.base.TrustedDeviceServiceClient$CrossAppServiceConnection$signPayload$crossAppSignatureCallback$1
            r1.<init>(r8, r3)
            android.os.IBinder r0 = r8.A01     // Catch:{ Exception -> 0x0152 }
            com.trusteddevice.TrustedDeviceFoundationService r0 = com.meta.trusteddevice.service.TrustedDeviceFoundationServiceImpl$binder$1.A00(r0)     // Catch:{ Exception -> 0x0152 }
            r0.Evb(r1, r2)     // Catch:{ Exception -> 0x0152 }
            goto L_0x0159
        L_0x0152:
            r2 = move-exception
            X.2Fj r1 = r3.A00
            r0 = 0
            X.SUj.A0M(r1, r0, r2)
        L_0x0159:
            r5.add(r3)
            X.2Fj r2 = r3.A00
            r1 = 35
            X.Sdq r0 = new X.Sdq
            r0.<init>((int) r1, (java.lang.Object) r5, (java.lang.Object) r4)
            r4.A0E(r2, r0)
            goto L_0x0114
        L_0x0169:
            X.SUj r14 = (X.SUj) r14
            boolean r0 = X.SUj.A0V(r14)
            if (r0 == 0) goto L_0x0675
            java.lang.Object r0 = X.SUj.A0D(r14)
            java.lang.Object r3 = r13.A03
            X.4uI r3 = (X.C277014uI) r3
            X.6Tl r2 = X.DbU.A0T(r0)
            goto L_0x0663
        L_0x017f:
            X.SUj r14 = (X.SUj) r14
            boolean r0 = X.SUj.A0V(r14)
            if (r0 == 0) goto L_0x0196
            java.lang.Object r3 = r13.A03
            X.4uI r3 = (X.C277014uI) r3
            X.6Tl r2 = X.DbS.A0P()
            java.lang.Object r0 = r14.A01
        L_0x0191:
            r2.A01(r0)
            goto L_0x0663
        L_0x0196:
            boolean r0 = X.SUj.A0S(r14)
            if (r0 == 0) goto L_0x069c
            r1 = -1
            java.lang.Throwable r2 = r14.A02
            boolean r0 = r2 instanceof X.C13224TQp
            if (r0 == 0) goto L_0x01b7
            r2.getClass()
            X.TQp r2 = (X.C13224TQp) r2
            int r1 = r2.A00
        L_0x01aa:
            java.lang.Object r3 = r13.A02
            X.4uI r3 = (X.C277014uI) r3
            X.6Tl r2 = X.DbS.A0P()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x0191
        L_0x01b7:
            boolean r0 = r2 instanceof X.TQY
            if (r0 == 0) goto L_0x01aa
            r1 = -2
            goto L_0x01aa
        L_0x01bd:
            X.SUj r0 = X.Pxf.A0P(r14)
            boolean r0 = X.SUj.A0T(r0)
            if (r0 != 0) goto L_0x069c
            java.lang.Object r2 = r13.A01
            X.0rk r2 = (X.0rk) r2
            int r0 = r2.A00
            int r1 = r0 + 1
            r2.A00 = r1
            java.lang.Object r0 = r13.A02
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r2 = r13.A03
            X.2Fk r2 = (X.2Fk) r2
            int r0 = r0.size()
            if (r1 != r0) goto L_0x069c
            java.lang.Boolean r1 = X.AnonymousClass7TE.A0v()
            goto L_0x0503
        L_0x01e5:
            X.SUj r14 = (X.SUj) r14
            boolean r0 = X.SUj.A0T(r14)
            if (r0 != 0) goto L_0x069c
            java.lang.Object r2 = r13.A02
            android.widget.CompoundButton r2 = (android.widget.CompoundButton) r2
            r0 = 0
            r2.setOnCheckedChangeListener(r0)
            java.lang.Object r1 = r14.A01
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0v()
            boolean r0 = r0.equals(r1)
            r2.setChecked(r0)
            java.lang.Object r0 = r13.A03
            android.widget.CompoundButton$OnCheckedChangeListener r0 = (android.widget.CompoundButton.OnCheckedChangeListener) r0
            r2.setOnCheckedChangeListener(r0)
            return
        L_0x020a:
            java.lang.Object r1 = r13.A01
            X.SSY r1 = (X.SSY) r1
            java.lang.Object r4 = r13.A02
            X.Tg7 r4 = (X.C13735Tg7) r4
            java.lang.Object r3 = r13.A03
            X.RsH r3 = (X.C10440RsH) r3
            X.SUj r14 = (X.SUj) r14
            boolean r0 = X.SUj.A0V(r14)
            if (r0 == 0) goto L_0x0230
            X.QDE r2 = r1.A03
            java.lang.Object r1 = X.SUj.A0D(r14)
            X.SNj r1 = (X.C11330SNj) r1
            java.security.Signature r0 = X.QDE.A00(r2, r1)     // Catch:{ GeneralSecurityException -> 0x022b }
            goto L_0x022c
        L_0x022b:
            r0 = 0
        L_0x022c:
            r2.A03(r4, r3, r1, r0)
            return
        L_0x0230:
            java.lang.Throwable r0 = r14.A02
            r0.getClass()
            r4.Cwz(r0)
            return
        L_0x0239:
            java.lang.Object r2 = r13.A03
            X.2Fk r2 = (X.2Fk) r2
            java.lang.Object r0 = r13.A02
            X.2Fk r0 = (X.2Fk) r0
            java.lang.Object r1 = r0.A02()
            X.34S r0 = new X.34S
            r0.<init>(r1, r14)
            r2.A0A(r0)
            return
        L_0x024e:
            X.SUj r1 = X.Pxf.A0P(r14)
            boolean r0 = X.SUj.A0T(r1)
            if (r0 != 0) goto L_0x0271
            boolean r0 = X.SUj.A0S(r1)
            if (r0 == 0) goto L_0x026a
            java.lang.Object r0 = r13.A01
            X.SJK r0 = (X.SJK) r0
            java.lang.String r0 = r0.A09
            boolean r0 = X.Re2.A00(r0)
            if (r0 != 0) goto L_0x0271
        L_0x026a:
            java.lang.Object r0 = r13.A03
            X.2Fk r0 = (X.2Fk) r0
            r0.A0B(r1)
        L_0x0271:
            java.lang.Object r5 = r13.A02
            com.facebookpay.logging.LoggingContext r5 = (com.facebookpay.logging.LoggingContext) r5
            X.5tb r3 = X.C298525tb.SHIPPING_ADDRESS
            goto L_0x0535
        L_0x0279:
            X.SUj r14 = (X.SUj) r14
            boolean r0 = X.SUj.A0S(r14)
            if (r0 == 0) goto L_0x029e
            java.lang.Object r0 = r13.A03
            X.QDJ r0 = (X.QDJ) r0
            X.2gB r2 = r0.A03
            java.lang.Throwable r1 = r14.A02
            java.lang.Object r0 = r13.A01
            X.SUj.A0M(r2, r0, r1)
            java.lang.Object r2 = r13.A02
            X.2Fk r2 = (X.2Fk) r2
            java.lang.String r0 = "Nothing to reprocess"
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            X.SUj r0 = X.SUj.A0B(r0)
            goto L_0x0508
        L_0x029e:
            boolean r0 = X.SUj.A0V(r14)
            if (r0 == 0) goto L_0x069c
            java.lang.Object r2 = r13.A02
            X.2Fk r2 = (X.2Fk) r2
            java.lang.String r0 = "REPROCESS"
            X.SUj r0 = X.SUj.A09(r0)
            goto L_0x0508
        L_0x02b0:
            X.SUj r1 = X.Pxf.A0P(r14)
            boolean r0 = X.SUj.A0T(r1)
            if (r0 != 0) goto L_0x02d3
            boolean r0 = X.SUj.A0S(r1)
            if (r0 == 0) goto L_0x02cc
            java.lang.Object r0 = r13.A01
            X.SJK r0 = (X.SJK) r0
            java.lang.String r0 = r0.A09
            boolean r0 = X.Re2.A00(r0)
            if (r0 != 0) goto L_0x02d3
        L_0x02cc:
            java.lang.Object r0 = r13.A03
            X.2Fk r0 = (X.2Fk) r0
            r0.A0B(r1)
        L_0x02d3:
            java.lang.Object r5 = r13.A02
            com.facebookpay.logging.LoggingContext r5 = (com.facebookpay.logging.LoggingContext) r5
            X.5tb r3 = X.C298525tb.PAYMENT_METHOD
            goto L_0x0535
        L_0x02db:
            X.SUj r14 = (X.SUj) r14
            java.lang.Object r3 = r14.A01
            X.3lr r3 = (X.C250663lr) r3
            if (r3 == 0) goto L_0x037d
            java.lang.Class<X.QVU> r2 = X.QVU.class
            java.lang.String r1 = "submit_payment_container(input:$input)"
            r0 = 1293316173(0x4d16704d, float:1.57746384E8)
            X.3lr r3 = r3.A03(r2, r1, r0)
            if (r3 == 0) goto L_0x037d
            java.lang.Class<X.QVT> r2 = X.QVT.class
            java.lang.String r1 = "submit_payment_container_response_list"
            r0 = 243717521(0xe86d591, float:3.3239207E-30)
            com.google.common.collect.ImmutableList r0 = r3.A06(r2, r1, r0)
            if (r0 == 0) goto L_0x037d
            java.lang.Object r7 = X.AnonymousClass7TE.A13(r0)
            X.QVT r7 = (X.QVT) r7
        L_0x0305:
            boolean r0 = X.SUj.A0V(r14)
            if (r0 == 0) goto L_0x0386
            java.lang.Object r3 = r13.A03
            X.QDN r3 = (X.QDN) r3
            if (r7 == 0) goto L_0x037f
            java.lang.Object r6 = r13.A01
            com.facebookpay.expresscheckout.models.ECPPaymentResponseParams r6 = (com.facebookpay.expresscheckout.models.ECPPaymentResponseParams) r6
            java.lang.Object r5 = r13.A02
            X.0sP r5 = (X.0sP) r5
            X.RFy r1 = X.C8930RFy.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r2 = 2
            java.lang.String r0 = "payment_status"
            java.lang.Enum r0 = r7.getOptionalEnumField(r2, r0, r1)
            X.RFy r0 = (X.C8930RFy) r0
            if (r0 == 0) goto L_0x0376
            int r1 = r0.ordinal()
            if (r1 == r2) goto L_0x0357
            r0 = 3
            if (r1 == r0) goto L_0x0357
            r0 = 1
            if (r1 != r0) goto L_0x0376
            java.lang.Class<X.QVS> r2 = X.QVS.class
            java.lang.String r1 = "payment_error"
            r0 = -1463067235(0xffffffffa8cb5d9d, float:-2.2578126E-14)
            X.3lr r0 = r7.A02(r2, r1, r0)
            if (r0 == 0) goto L_0x0355
            X.QVG r0 = X.Pxj.A0S(r0)
            if (r0 == 0) goto L_0x0355
            X.QnS r0 = X.SPz.A03(r0)
        L_0x034b:
            X.0gF r1 = X.C60340gF.A00
            X.SUj r0 = X.SUj.A0A(r1, r0)
        L_0x0351:
            X.QDN.A0H(r6, r3, r0, r5)
            return
        L_0x0355:
            r0 = 0
            goto L_0x034b
        L_0x0357:
            java.lang.Class<X.QVR> r4 = X.QVR.class
            r2 = 3
            java.lang.String r1 = "confirmation_component"
            r0 = 1549132435(0x5c55e293, float:2.40813164E17)
            X.3lr r1 = r7.getOptionalTreeField(r2, r1, r4, r0)
            if (r1 == 0) goto L_0x036f
            java.lang.String r0 = "external_confirmation_url"
            java.lang.String r0 = r1.A0B(r0)
            if (r0 == 0) goto L_0x036f
            r6.A00 = r0
        L_0x036f:
            X.0gF r0 = X.C60340gF.A00
            X.SUj r0 = X.SUj.A09(r0)
            goto L_0x0351
        L_0x0376:
            java.lang.String r0 = "Unrecognized payment status from SubmitPayContainerMutationResponse"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            goto L_0x034b
        L_0x037d:
            r7 = 0
            goto L_0x0305
        L_0x037f:
            java.lang.String r0 = "Wrong response data"
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r0)
            goto L_0x0392
        L_0x0386:
            boolean r0 = X.SUj.A0S(r14)
            java.lang.Object r3 = r13.A03
            X.QDN r3 = (X.QDN) r3
            if (r0 == 0) goto L_0x03a4
            java.lang.Throwable r1 = r14.A02
        L_0x0392:
            X.0gF r0 = X.C60340gF.A00
            X.SUj r2 = X.SUj.A0A(r0, r1)
        L_0x0398:
            java.lang.Object r1 = r13.A01
            com.facebookpay.expresscheckout.models.ECPPaymentResponseParams r1 = (com.facebookpay.expresscheckout.models.ECPPaymentResponseParams) r1
            java.lang.Object r0 = r13.A02
            X.0sP r0 = (X.0sP) r0
            X.QDN.A0H(r1, r3, r2, r0)
            return
        L_0x03a4:
            X.0gF r0 = X.C60340gF.A00
            X.SUj r2 = X.SUj.A08(r0)
            goto L_0x0398
        L_0x03ab:
            X.SUj r14 = (X.SUj) r14
            r7 = 0
            X.0qQ.A0B(r14, r7)
            boolean r0 = X.SUj.A0V(r14)
            if (r0 == 0) goto L_0x04c2
            java.lang.Object r3 = X.SUj.A0D(r14)
            X.3lr r3 = (X.C250663lr) r3
            java.lang.Class<X.QSw> r2 = X.C7681QSw.class
            java.lang.String r1 = "handle_checkout_event(input:$input)"
            r0 = 891167727(0x351e23ef, float:5.8911877E-7)
            X.3lr r3 = r3.A03(r2, r1, r0)
            if (r3 == 0) goto L_0x048a
            java.lang.Class<X.QSv> r2 = X.C7680QSv.class
            java.lang.String r1 = "payment_details_updates"
            r0 = 1472614057(0x57c64ea9, float:4.3608229E14)
            com.google.common.collect.ImmutableList r10 = r3.A06(r2, r1, r0)
            if (r10 == 0) goto L_0x048a
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x048a
            java.lang.Object r2 = r10.get(r7)
            X.3lr r2 = (X.C250663lr) r2
            if (r2 == 0) goto L_0x048a
            java.lang.Class<X.QSr> r9 = X.C7676QSr.class
            r1 = 3
            java.lang.String r8 = "error"
            r0 = -1166680740(0xffffffffba75dd5c, float:-9.3789934E-4)
            X.3lr r1 = r2.getOptionalTreeField(r1, r8, r9, r0)
            if (r1 == 0) goto L_0x048a
            java.lang.Class<X.QSq> r6 = X.C7675QSq.class
            java.lang.String r5 = "user_facing_error"
            r0 = 1873846051(0x6fb09f23, float:1.0932349E29)
            X.3lr r0 = r1.getOptionalTreeField(r7, r5, r6, r0)
            if (r0 == 0) goto L_0x048a
            java.lang.Class<X.QVG> r4 = X.QVG.class
            r3 = 736683160(0x2be8e498, float:1.6548039E-12)
            X.3lr r0 = r0.reinterpretRequired(r7, r4, r3)
            if (r0 == 0) goto L_0x048a
            java.lang.Object r2 = r10.get(r7)
            X.3lr r2 = (X.C250663lr) r2
            if (r2 == 0) goto L_0x04e0
            r1 = 3
            r0 = -1166680740(0xffffffffba75dd5c, float:-9.3789934E-4)
            X.3lr r1 = r2.getOptionalTreeField(r1, r8, r9, r0)
            if (r1 == 0) goto L_0x04e0
            r0 = 1873846051(0x6fb09f23, float:1.0932349E29)
            X.3lr r0 = r1.getOptionalTreeField(r7, r5, r6, r0)
            if (r0 == 0) goto L_0x04e0
            X.3lr r2 = r0.reinterpretRequired(r7, r4, r3)
            if (r2 == 0) goto L_0x04e0
            java.lang.Object r6 = r13.A02
            com.facebookpay.logging.LoggingContext r6 = (com.facebookpay.logging.LoggingContext) r6
            if (r6 == 0) goto L_0x069c
            java.lang.Object r4 = r13.A01
            X.RxT r4 = (X.C10749RxT) r4
            java.lang.String r1 = "error_title"
            java.lang.String r0 = r2.A0B(r1)
            if (r0 == 0) goto L_0x0487
            boolean r0 = X.00l.A0W(r0)
            if (r0 != 0) goto L_0x0487
            java.lang.String r3 = r2.A0B(r1)
        L_0x044a:
            X.Sto r2 = X.C51965G9l.A0g()
            java.lang.String r0 = r4.A01
            r1 = 0
            if (r0 == 0) goto L_0x0485
            java.lang.Long r5 = X.DbV.A0q(r0)
        L_0x0457:
            com.facebookpay.otc.models.OtcInput r0 = r4.A00
            if (r0 == 0) goto L_0x045f
            X.SEB r1 = X.C11300SKk.A01(r0)
        L_0x045f:
            r4 = 0
            java.util.LinkedHashMap r7 = X.Pxj.A0x(r1)
            java.lang.String r0 = "error_message"
            if (r3 == 0) goto L_0x046b
            r7.put(r0, r3)
        L_0x046b:
            java.lang.String r8 = "cancel_checkout"
            X.0Ae r1 = r2.A00
            java.lang.String r0 = "client_submit_ecpeventhandling_fail"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 118(0x76, float:1.65E-43)
            X.1Ln r0 = X.C51965G9l.A0U(r1, r0)
            r9 = 4
        L_0x047c:
            X.Pmh r3 = new X.Pmh
            r3.<init>(r4, r5, r6, r7, r8, r9)
            X.C12411Sto.A03(r0, r6, r3)
            return
        L_0x0485:
            r5 = r1
            goto L_0x0457
        L_0x0487:
            java.lang.String r3 = "Unknown Server Error For Cancel Checkout Event Handling"
            goto L_0x044a
        L_0x048a:
            java.lang.Object r6 = r13.A02
            com.facebookpay.logging.LoggingContext r6 = (com.facebookpay.logging.LoggingContext) r6
            if (r6 == 0) goto L_0x069c
            java.lang.Object r3 = r13.A01
            X.RxT r3 = (X.C10749RxT) r3
            X.Sto r2 = X.C51965G9l.A0g()
            java.lang.String r0 = r3.A01
            r1 = 0
            if (r0 == 0) goto L_0x04c0
            java.lang.Long r5 = X.DbV.A0q(r0)
        L_0x04a1:
            com.facebookpay.otc.models.OtcInput r0 = r3.A00
            if (r0 == 0) goto L_0x04a9
            X.SEB r1 = X.C11300SKk.A01(r0)
        L_0x04a9:
            r4 = 0
            java.util.LinkedHashMap r7 = X.Pxj.A0x(r1)
            java.lang.String r8 = "cancel_checkout"
            X.0Ae r1 = r2.A00
            java.lang.String r0 = "client_submit_ecpeventhandling_success"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 120(0x78, float:1.68E-43)
            X.1Ln r0 = X.C51965G9l.A0U(r1, r0)
            r9 = 6
            goto L_0x047c
        L_0x04c0:
            r5 = r1
            goto L_0x04a1
        L_0x04c2:
            boolean r0 = X.SUj.A0S(r14)
            if (r0 == 0) goto L_0x069c
            java.lang.Object r6 = r13.A02
            com.facebookpay.logging.LoggingContext r6 = (com.facebookpay.logging.LoggingContext) r6
            if (r6 == 0) goto L_0x069c
            java.lang.Object r4 = r13.A01
            X.RxT r4 = (X.C10749RxT) r4
            java.lang.Throwable r0 = r14.A02
            if (r0 == 0) goto L_0x04dc
            java.lang.String r3 = X.C11302SKm.A01(r0)
            goto L_0x044a
        L_0x04dc:
            java.lang.String r3 = ""
            goto L_0x044a
        L_0x04e0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x04e5:
            X.SR4 r14 = (X.SR4) r14
            r0 = 0
            X.0qQ.A0B(r14, r0)
            java.lang.Object r0 = r14.A03()
            boolean r0 = X.DbX.A1a(r0)
            if (r0 == 0) goto L_0x069c
            java.lang.Object r0 = r13.A03
            X.QD6 r0 = (X.QD6) r0
            X.2Fj r2 = r0.A06
            java.lang.Object r1 = r13.A01
            java.lang.Object r0 = r13.A02
            X.0eP r1 = X.AnonymousClass7TE.A1L(r1, r0)
        L_0x0503:
            X.SR4 r0 = new X.SR4
            r0.<init>(r1)
        L_0x0508:
            r2.A0B(r0)
            return
        L_0x050c:
            X.SUj r1 = X.Pxf.A0P(r14)
            boolean r0 = X.SUj.A0T(r1)
            if (r0 != 0) goto L_0x052f
            boolean r0 = X.SUj.A0S(r1)
            if (r0 == 0) goto L_0x0528
            java.lang.Object r0 = r13.A01
            X.SJK r0 = (X.SJK) r0
            java.lang.String r0 = r0.A09
            boolean r0 = X.Re2.A00(r0)
            if (r0 != 0) goto L_0x052f
        L_0x0528:
            java.lang.Object r0 = r13.A02
            X.2Fk r0 = (X.2Fk) r0
            r0.A0B(r1)
        L_0x052f:
            java.lang.Object r5 = r13.A03
            com.facebookpay.logging.LoggingContext r5 = (com.facebookpay.logging.LoggingContext) r5
            X.5tb r3 = X.C298525tb.CONTACT_INFORMATION
        L_0x0535:
            java.lang.Object r0 = r13.A01
            X.SJK r0 = (X.SJK) r0
            java.lang.String r6 = r0.A09
            com.facebookpay.otc.models.OtcInput r0 = r0.A04
            if (r0 == 0) goto L_0x055c
            X.SEB r4 = X.C11300SKk.A01(r0)
        L_0x0543:
            r0 = 0
            X.0qQ.A0B(r5, r0)
            r7 = 1
            X.IoE r2 = new X.IoE
            r2.<init>(r3, r4, r5, r6, r7)
            r12 = 20
            X.PqV r7 = new X.PqV
            r8 = r3
            r9 = r4
            r10 = r5
            r11 = r6
            r7.<init>((java.lang.Object) r8, (java.lang.Object) r9, (java.lang.Object) r10, (java.lang.String) r11, (int) r12)
            X.SUU.A0B(r1, r2, r7)
            return
        L_0x055c:
            r4 = 0
            goto L_0x0543
        L_0x055e:
            X.SUj r14 = (X.SUj) r14
            boolean r0 = X.SUj.A0V(r14)
            if (r0 == 0) goto L_0x069c
            java.lang.Object r14 = r14.A01
            if (r14 != 0) goto L_0x05b4
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1C()
        L_0x056e:
            java.lang.Object r6 = r13.A01
            X.QKI r6 = (X.QKI) r6
            java.lang.Object r5 = r13.A02
            com.instagram.ui.widget.radiogroup.IgRadioGroup r5 = (com.instagram.ui.widget.radiogroup.IgRadioGroup) r5
            java.lang.Object r1 = r13.A03
            android.view.View r1 = (android.view.View) r1
            android.os.Bundle r2 = r6.requireArguments()
            java.lang.String r0 = "disable_unbound_cards_usage"
            boolean r0 = r2.getBoolean(r0)
            java.util.List r8 = X.C11413SSl.A03(r14, r0)
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x069c
            r5.removeAllViews()
            java.util.Iterator r4 = r8.iterator()
        L_0x0595:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x05b7
            java.lang.Object r3 = r4.next()
            com.fbpay.w3c.CardDetails r3 = (com.fbpay.w3c.CardDetails) r3
            android.content.Context r2 = r6.requireContext()
            X.QA1 r0 = new X.QA1
            r0.<init>(r2)
            r0.A00(r3)
            X.JTS.A0x(r0)
            r5.addView(r0)
            goto L_0x0595
        L_0x05b4:
            java.util.List r14 = (java.util.List) r14
            goto L_0x056e
        L_0x05b7:
            r4 = 0
            android.view.View r2 = r5.getChildAt(r4)
            int r0 = r2.getId()
            r5.A02(r0)
            int r0 = r5.getChildCount()
            r3 = 1
            if (r0 != r3) goto L_0x05d0
            r0 = 2131439198(0x7f0b2e5e, float:1.8500344E38)
            X.DbX.A1B(r2, r0)
        L_0x05d0:
            r5.invalidate()
            X.4gR r0 = r6.A00
            if (r0 == 0) goto L_0x069c
            X.1yd r0 = r0.A04
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x069c
            X.4gR r0 = r6.A00
            X.0qQ.A0B(r0, r4)
            X.Ro4 r0 = r0.A03
            com.instagram.common.session.UserSession r0 = r0.A00
            X.0xY r0 = X.AnonymousClass7TF.A0N(r0)
            java.lang.String r2 = "is_passkey_content_visible"
            r0.E5T(r2, r4)
            r0.apply()
            r0 = 2131428369(0x7f0b0411, float:1.847838E38)
            android.view.View r5 = r1.requireViewById(r0)
            r7 = 8
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x061d
            java.util.Iterator r1 = r8.iterator()
        L_0x0607:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0629
            java.lang.Object r0 = r1.next()
            com.fbpay.w3c.CardDetails r0 = (com.fbpay.w3c.CardDetails) r0
            com.google.common.collect.ImmutableList r0 = r0.A01
            if (r0 == 0) goto L_0x0607
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0607
        L_0x061d:
            X.4gR r0 = r6.A00
            X.RzL r0 = r0.A00
            X.Tnz r0 = r0.A0A
            r0.A01 = r4
            r5.setVisibility(r7)
            return
        L_0x0629:
            X.4gR r0 = r6.A00
            X.RzL r0 = r0.A00
            X.Tnz r0 = r0.A0A
            r0.A01 = r3
            r5.setVisibility(r4)
            X.4gR r0 = r6.A00
            X.0qQ.A0B(r0, r4)
            X.Ro4 r0 = r0.A03
            com.instagram.common.session.UserSession r0 = r0.A00
            X.0xY r0 = X.AnonymousClass7TF.A0N(r0)
            r0.E5T(r2, r3)
            r0.apply()
            return
        L_0x0648:
            X.SUj r14 = (X.SUj) r14
            r1 = 0
            X.0qQ.A0B(r14, r1)
            boolean r0 = X.SUj.A0V(r14)
            if (r0 == 0) goto L_0x066f
            java.lang.Object r0 = X.SUj.A0D(r14)
            java.lang.Object r3 = r13.A03
            X.4uI r3 = (X.C277014uI) r3
            X.6Tl r2 = X.DbS.A0P()
            r2.A03(r0, r1)
        L_0x0663:
            X.6Tm r1 = r2.A00()
        L_0x0667:
            java.lang.Object r0 = r13.A01
            X.6Rx r0 = (X.C307896Rx) r0
            X.C299275ur.A00(r0, r1, r3)
            return
        L_0x066f:
            boolean r0 = X.SUj.A0S(r14)
            if (r0 == 0) goto L_0x069c
        L_0x0675:
            java.lang.Object r3 = r13.A02
            X.4uI r3 = (X.C277014uI) r3
            X.6Tm r1 = X.AnonymousClass6Tm.A01
            goto L_0x0667
        L_0x067c:
            X.SUj r14 = (X.SUj) r14
            boolean r0 = X.SUj.A0S(r14)
            r3 = 0
            if (r0 != 0) goto L_0x06a3
            boolean r0 = X.SUj.A0V(r14)
            if (r0 == 0) goto L_0x069c
            java.lang.Object r2 = r13.A01
            X.6Rx r2 = (X.C307896Rx) r2
            java.lang.Object r1 = r13.A03
            X.4uI r1 = (X.C277014uI) r1
            java.lang.Object r0 = r14.A01
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
        L_0x0699:
            X.C308206Td.A0E(r2, r1, r0)
        L_0x069c:
            return
        L_0x069d:
            boolean r0 = X.SUj.A0S(r14)
            if (r0 == 0) goto L_0x069c
        L_0x06a3:
            java.lang.Object r2 = r13.A01
            X.6Rx r2 = (X.C307896Rx) r2
            java.lang.Object r1 = r13.A02
            goto L_0x06b9
        L_0x06aa:
            X.SUj r14 = (X.SUj) r14
            boolean r0 = X.SUj.A0V(r14)
            r3 = 0
            if (r0 == 0) goto L_0x069d
            java.lang.Object r2 = r13.A01
            X.6Rx r2 = (X.C307896Rx) r2
            java.lang.Object r1 = r13.A03
        L_0x06b9:
            X.4uI r1 = (X.C277014uI) r1
            java.lang.Object[] r0 = new java.lang.Object[r3]
            goto L_0x0699
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11650Sds.onChanged(java.lang.Object):void");
    }

    public C11650Sds(AnonymousClass2gB r1, SJK sjk, LoggingContext loggingContext, int i) {
        this.A00 = i;
        this.A01 = sjk;
        if (3 - i != 0) {
            this.A03 = r1;
            this.A02 = loggingContext;
        } else {
            this.A02 = r1;
            this.A03 = loggingContext;
        }
    }

    public C11650Sds(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj;
    }
}
