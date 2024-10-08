package X;

import com.facebookpay.logging.LoggingContext;
import com.facebookpay.otc.models.OtcInput;
import com.instagram.common.session.UserSession;

/* renamed from: X.Pzd  reason: case insensitive filesystem */
public final class C7211Pzd extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7211Pzd(C284945Oz r2, UserSession userSession, String str, 0sP r5, int i, boolean z) {
        super(1);
        this.A00 = i;
        if (9 - i != 0) {
            this.A02 = userSession;
            this.A04 = str;
            this.A05 = z;
            this.A01 = r5;
            this.A03 = r2;
        } else {
            this.A03 = userSession;
            this.A04 = str;
            this.A05 = z;
            this.A02 = r5;
            this.A01 = r2;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0316, code lost:
        return X.C303646Ae.A01(new X.C7277Q2c(0, new X.C58751Iwy(r0, r1, r4, r3)), r5, r4.A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x007e, code lost:
        if (X.182.A06(X.0Tu.A05, r4, 2342166170407152569L) != false) goto L_0x0434;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0330, code lost:
        r0 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0332, code lost:
        ((X.0sP) r0).invoke(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0436, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a2, code lost:
        r1.A00(java.lang.Float.valueOf(r0));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            r8 = r21
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x0339;
                case 1: goto L_0x031e;
                case 2: goto L_0x02c0;
                case 3: goto L_0x0247;
                case 4: goto L_0x01ff;
                case 5: goto L_0x01b7;
                case 6: goto L_0x013d;
                case 7: goto L_0x0009;
                case 8: goto L_0x0009;
                case 9: goto L_0x010b;
                case 10: goto L_0x00d7;
                case 11: goto L_0x00b4;
                case 12: goto L_0x0088;
                case 13: goto L_0x0057;
                case 14: goto L_0x003a;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.1Ln r8 = (X.1Ln) r8
            X.GkM r4 = new X.GkM
            r4.<init>()
            java.lang.Object r3 = r0.A03
            com.facebookpay.logging.LoggingContext r3 = (com.facebookpay.logging.LoggingContext) r3
            X.C51971G9r.A1B(r4, r3)
            boolean r1 = r0.A05
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            java.lang.String r1 = "perform_validation"
            r4.A03(r1, r2)
            java.lang.Object r2 = r0.A01
            java.util.List r2 = (java.util.List) r2
            java.lang.String r1 = "account_mutation_data_list"
            r4.A07(r1, r2)
            X.C66582MXn.A1B(r4, r3)
            java.lang.String r1 = r0.A04
            X.Pxg.A1J(r8, r4, r1)
            java.lang.Object r0 = r0.A02
            X.C51969G9p.A1G(r8, r0)
            return r8
        L_0x003a:
            X.NAZ r8 = (X.NAZ) r8
            r1 = 0
            X.0qQ.A0B(r8, r1)
            java.lang.String r11 = r0.A04
            java.lang.Object r12 = r0.A01
            java.util.List r12 = (java.util.List) r12
            boolean r1 = r0.A05
            java.lang.Object r13 = r0.A03
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r10 = r0.A02
            com.instagram.direct.msys.reverb.InstamadilloLoggingContext r10 = (com.instagram.direct.msys.reverb.InstamadilloLoggingContext) r10
            r9 = 0
            r14 = r1
            com.facebook.msys.mca.MailboxFutureImpl r8 = r8.A00(r9, r10, r11, r12, r13, r14)
            return r8
        L_0x0057:
            boolean r1 = r0.A05
            if (r1 == 0) goto L_0x0434
            java.lang.Object r1 = r0.A01
            X.9Ib r1 = (X.C376459Ib) r1
            java.lang.Object r2 = r1.A00
            X.0sP r2 = (X.0sP) r2
            java.lang.String r1 = r0.A04
            boolean r1 = X.C51971G9r.A1a(r1, r2)
            if (r1 == 0) goto L_0x0082
            java.lang.Object r4 = r0.A03
            X.0lg r4 = (X.0lg) r4
            r1 = 0
            X.0qQ.A0B(r4, r1)
            X.0Tu r3 = X.0Tu.A05
            r1 = 2342166170407152569(0x20810bb9000e2bb9, double:4.068266304133773E-152)
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 == 0) goto L_0x0082
            goto L_0x0434
        L_0x0082:
            java.lang.Object r1 = r0.A02
            X.2V5 r1 = (X.2V5) r1
            r0 = 0
            goto L_0x00a2
        L_0x0088:
            boolean r1 = r0.A05
            if (r1 == 0) goto L_0x0434
            java.lang.Object r1 = r0.A01
            X.9Ib r1 = (X.C376459Ib) r1
            java.lang.Object r2 = r1.A00
            X.0sP r2 = (X.0sP) r2
            java.lang.String r1 = r0.A04
            boolean r1 = X.C51971G9r.A1a(r1, r2)
            if (r1 == 0) goto L_0x00ab
            java.lang.Object r1 = r0.A02
            X.2V5 r1 = (X.2V5) r1
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x00a2:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1.A00(r0)
            goto L_0x0434
        L_0x00ab:
            java.lang.Object r0 = r0.A03
            android.animation.Animator r0 = (android.animation.Animator) r0
            r0.start()
            goto L_0x0434
        L_0x00b4:
            int r2 = X.AnonymousClass7TE.A0M(r8)
            boolean r1 = r0.A05
            if (r1 == 0) goto L_0x00c7
            java.lang.Object r1 = r0.A02
            X.0sP r1 = (X.0sP) r1
            java.lang.String r0 = r0.A04
            r1.invoke(r0)
            goto L_0x0434
        L_0x00c7:
            java.lang.Object r1 = r0.A01
            X.5Tq r1 = (X.C286025Tq) r1
            java.lang.String r0 = "see_all_span"
            java.util.List r0 = r1.A06(r0, r2, r2)
            X.00k.A0J(r0)
            goto L_0x0434
        L_0x00d7:
            java.lang.String r4 = X.C41847B3o.A1E(r8)
            java.lang.Object r3 = r0.A03
            X.5Oz r3 = (X.C284945Oz) r3
            int r2 = r4.length()
            java.lang.Object r1 = r0.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            int r1 = X.LST.A02(r1)
            if (r2 <= r1) goto L_0x00fb
            java.lang.String r2 = r0.A04
            X.Gpg r1 = new X.Gpg
            r1.<init>(r2)
        L_0x00f4:
            r3.Epw(r1)
            java.lang.Object r0 = r0.A01
            goto L_0x0332
        L_0x00fb:
            boolean r1 = X.C51966G9m.A1X(r4)
            if (r1 == 0) goto L_0x0108
            boolean r1 = r0.A05
            if (r1 == 0) goto L_0x0108
            X.IPW r1 = X.IPW.A00
            goto L_0x00f4
        L_0x0108:
            X.IPY r1 = X.IPY.A00
            goto L_0x00f4
        L_0x010b:
            java.lang.String r4 = X.C41847B3o.A1E(r8)
            java.lang.Object r3 = r0.A01
            X.5Oz r3 = (X.C284945Oz) r3
            int r2 = r4.length()
            java.lang.Object r1 = r0.A03
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            int r1 = X.LST.A01(r1)
            if (r2 <= r1) goto L_0x012d
            java.lang.String r2 = r0.A04
            X.Gpg r1 = new X.Gpg
            r1.<init>(r2)
        L_0x0128:
            r3.Epw(r1)
            goto L_0x0330
        L_0x012d:
            boolean r1 = X.C51966G9m.A1X(r4)
            if (r1 == 0) goto L_0x013a
            boolean r1 = r0.A05
            if (r1 == 0) goto L_0x013a
            X.IPW r1 = X.IPW.A00
            goto L_0x0128
        L_0x013a:
            X.IPY r1 = X.IPY.A00
            goto L_0x0128
        L_0x013d:
            X.1Ln r8 = (X.1Ln) r8
            X.QHw r7 = new X.QHw
            r7.<init>()
            java.lang.Object r1 = r0.A02
            com.facebookpay.logging.LoggingContext r1 = (com.facebookpay.logging.LoggingContext) r1
            X.C51971G9r.A1B(r7, r1)
            java.lang.String r2 = r0.A04
            if (r2 != 0) goto L_0x0151
            java.lang.String r2 = ""
        L_0x0151:
            java.lang.String r1 = "receiver_id"
            r7.A06(r1, r2)
            boolean r1 = r0.A05
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            java.lang.String r1 = "create_order"
            r7.A03(r1, r2)
            java.lang.String r1 = "checkout_setup_mutation"
            X.Pxe.A1S(r7, r1)
            java.lang.Object r1 = r0.A03
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x019d
            java.util.ArrayList r6 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r5 = r1.iterator()
        L_0x0175:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x01a2
            java.lang.Object r4 = r5.next()
            com.facebookpay.expresscheckout.models.CheckoutSetupKeyValue r4 = (com.facebookpay.expresscheckout.models.CheckoutSetupKeyValue) r4
            X.QHY r3 = new X.QHY
            r3.<init>()
            java.lang.String r1 = r4.A00
            X.RIx r2 = X.C8958RIx.valueOf(r1)
            java.lang.String r1 = "key"
            r3.A01(r2, r1)
            java.lang.String r2 = r4.A01
            java.lang.String r1 = "value"
            r3.A06(r1, r2)
            r6.add(r3)
            goto L_0x0175
        L_0x019d:
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            goto L_0x01a6
        L_0x01a2:
            java.util.List r2 = X.00k.A0a(r6)
        L_0x01a6:
            java.lang.String r1 = "product_data"
            r7.A07(r1, r2)
            java.lang.String r1 = "event_payload"
            r8.A0N(r7, r1)
            java.lang.Object r0 = r0.A01
            X.C51969G9p.A1G(r8, r0)
            return r8
        L_0x01b7:
            X.SUj r6 = X.Pxf.A0P(r8)
            X.SUU r2 = X.C9962RkH.A00
            java.lang.Object r4 = r0.A01
            com.facebookpay.logging.LoggingContext r4 = (com.facebookpay.logging.LoggingContext) r4
            java.lang.String r7 = r0.A04
            boolean r1 = r0.A05
            r10 = r1 ^ 1
            java.lang.Object r1 = r0.A03
            java.util.List r9 = X.AnonymousClass7TE.A1I(r1)
            java.lang.Object r1 = r6.A01
            X.QXI r1 = (X.QXI) r1
            r8 = 0
            if (r1 == 0) goto L_0x01fd
            X.QXk r1 = r1.A0E()
            if (r1 == 0) goto L_0x01fd
            X.QXH r1 = r1.A0H()
            if (r1 == 0) goto L_0x01fd
            X.QXb r1 = r1.A0E()
            if (r1 == 0) goto L_0x01fd
            java.lang.Enum r3 = X.Pxj.A0f(r1)
            X.HNF r3 = (X.HNF) r3
        L_0x01ec:
            java.lang.Object r0 = r0.A02
            com.facebookpay.otc.models.OtcInput r0 = (com.facebookpay.otc.models.OtcInput) r0
            if (r0 == 0) goto L_0x01fb
            X.SEB r5 = X.C11300SKk.A01(r0)
        L_0x01f6:
            r2.A0F(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0434
        L_0x01fb:
            r5 = r8
            goto L_0x01f6
        L_0x01fd:
            r3 = r8
            goto L_0x01ec
        L_0x01ff:
            X.SUj r6 = X.Pxf.A0P(r8)
            X.SUU r2 = X.C9962RkH.A00
            java.lang.Object r4 = r0.A02
            com.facebookpay.logging.LoggingContext r4 = (com.facebookpay.logging.LoggingContext) r4
            java.lang.String r7 = r0.A04
            boolean r1 = r0.A05
            r10 = r1 ^ 1
            java.lang.Object r1 = r0.A01
            java.util.List r9 = X.AnonymousClass7TE.A1I(r1)
            java.lang.Object r1 = r6.A01
            X.QXI r1 = (X.QXI) r1
            r8 = 0
            if (r1 == 0) goto L_0x0245
            X.QXk r1 = r1.A0E()
            if (r1 == 0) goto L_0x0245
            X.QXF r1 = r1.A0F()
            if (r1 == 0) goto L_0x0245
            X.QXN r1 = r1.A0E()
            if (r1 == 0) goto L_0x0245
            java.lang.Enum r3 = X.Pxj.A0f(r1)
            X.HNF r3 = (X.HNF) r3
        L_0x0234:
            java.lang.Object r0 = r0.A03
            com.facebookpay.otc.models.OtcInput r0 = (com.facebookpay.otc.models.OtcInput) r0
            if (r0 == 0) goto L_0x0243
            X.SEB r5 = X.C11300SKk.A01(r0)
        L_0x023e:
            r2.A0F(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0434
        L_0x0243:
            r5 = r8
            goto L_0x023e
        L_0x0245:
            r3 = r8
            goto L_0x0234
        L_0x0247:
            java.util.List r8 = (java.util.List) r8
            X.0rm r1 = X.C51965G9l.A11()
            java.lang.String r5 = "Required value was null."
            if (r8 == 0) goto L_0x02bb
            java.util.Iterator r4 = r8.iterator()
            r10 = 0
        L_0x0256:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x0270
            java.lang.Object r3 = r4.next()
            boolean r2 = r3 instanceof X.C52594GYt
            if (r2 == 0) goto L_0x0267
            r1.A00 = r3
            goto L_0x0256
        L_0x0267:
            boolean r2 = r3 instanceof X.C67605Mqd
            if (r2 == 0) goto L_0x0256
            X.Mqd r3 = (X.C67605Mqd) r3
            java.util.Map r10 = r3.A03
            goto L_0x0256
        L_0x0270:
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.lang.Object r2 = r1.A00
            if (r2 == 0) goto L_0x02b6
            X.GYt r2 = (X.C52594GYt) r2
            com.google.common.collect.ImmutableList r2 = r2.A01
            X.3kO r3 = X.C66580MXl.A0J(r2)
        L_0x0280:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x02a9
            java.lang.Object r2 = r3.next()
            java.lang.Object r7 = r0.A03
            X.Q1v r7 = (X.C7271Q1v) r7
            java.lang.String r9 = r0.A04
            java.lang.Object r6 = r0.A01
            X.Q1l r6 = (X.Q1l) r6
            com.google.common.util.concurrent.ListenableFuture r8 = X.C255183ti.A03(r2)
            X.0qQ.A07(r8)
            boolean r11 = r0.A05
            java.lang.Object r5 = r0.A02
            X.Q2X r5 = (X.Q2X) r5
            X.6Af r2 = X.C7271Q1v.A00(r5, r6, r7, r8, r9, r10, r11)
            r4.add(r2)
            goto L_0x0280
        L_0x02a9:
            X.MmO r5 = X.C255183ti.A00(r4)
            java.lang.Object r4 = r0.A03
            X.Q1v r4 = (X.C7271Q1v) r4
            java.lang.Object r3 = r0.A01
            r0 = 32
            goto L_0x0305
        L_0x02b6:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r5)
            throw r0
        L_0x02bb:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r5)
            throw r0
        L_0x02c0:
            r1 = r8
            X.GYt r1 = (X.C52594GYt) r1
            if (r1 == 0) goto L_0x0317
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            com.google.common.collect.ImmutableList r2 = r1.A01
            X.3kO r3 = X.C66580MXl.A0J(r2)
        L_0x02cf:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x02f9
            java.lang.Object r2 = r3.next()
            java.lang.Object r7 = r0.A03
            X.Q1v r7 = (X.C7271Q1v) r7
            java.lang.String r9 = r0.A04
            java.lang.Object r6 = r0.A01
            X.Q1l r6 = (X.Q1l) r6
            com.google.common.util.concurrent.ListenableFuture r8 = X.C255183ti.A03(r2)
            X.0qQ.A07(r8)
            boolean r11 = r0.A05
            java.lang.Object r5 = r0.A02
            X.Q2X r5 = (X.Q2X) r5
            r10 = 0
            X.6Af r2 = X.C7271Q1v.A00(r5, r6, r7, r8, r9, r10, r11)
            r4.add(r2)
            goto L_0x02cf
        L_0x02f9:
            X.MmO r5 = X.C255183ti.A00(r4)
            java.lang.Object r4 = r0.A03
            X.Q1v r4 = (X.C7271Q1v) r4
            java.lang.Object r3 = r0.A01
            r0 = 31
        L_0x0305:
            X.Iwy r2 = new X.Iwy
            r2.<init>(r0, r1, r4, r3)
            r0 = 0
            X.Q2c r1 = new X.Q2c
            r1.<init>(r0, r2)
            java.util.concurrent.Executor r0 = r4.A04
            X.6Af r8 = X.C303646Ae.A01(r1, r5, r0)
            return r8
        L_0x0317:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x031e:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r4 = r0.A03
            com.facebook.caa.shared.passkey.PasskeyService r4 = (com.facebook.caa.shared.passkey.PasskeyService) r4
            java.lang.Object r3 = r0.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r2 = r0.A04
            boolean r1 = r0.A05
            java.lang.String r4 = r4.A05(r3, r2, r8, r1)
        L_0x0330:
            java.lang.Object r0 = r0.A02
        L_0x0332:
            X.0sP r0 = (X.0sP) r0
            r0.invoke(r4)
            goto L_0x0434
        L_0x0339:
            r1 = 0
            X.0qQ.A0B(r8, r1)
            java.lang.Object r15 = r0.A02
            java.lang.Object r3 = r0.A03
            X.JwI r3 = (X.C61080JwI) r3
            java.lang.Object r1 = r3.A00
            X.QOu r1 = (X.QOu) r1
            byte[] r1 = r1.A00
            java.lang.String r5 = X.Pxg.A0z(r1)
            java.lang.Object r1 = r0.A01
            X.4tV r1 = (X.C276544tV) r1
            java.lang.String r2 = r0.A04
            java.lang.String r10 = r1.A0I()
            java.lang.String r9 = r1.A0G()
            java.lang.String r7 = r1.A0G()
            org.json.JSONObject r4 = X.DbS.A11()
            java.lang.String r1 = "challenge"
            r4.put(r1, r8)
            org.json.JSONObject r1 = X.DbS.A11()
            if (r2 != 0) goto L_0x0371
            java.lang.String r2 = "meta.com"
        L_0x0371:
            java.lang.String r11 = "id"
            org.json.JSONObject r2 = r1.put(r11, r2)
            java.lang.String r8 = "name"
            java.lang.String r1 = "Meta"
            org.json.JSONObject r2 = r2.put(r8, r1)
            java.lang.String r1 = "rp"
            r4.put(r1, r2)
            org.json.JSONArray r2 = X.Pxe.A1E()
            java.lang.String r1 = "excludeCredentials"
            r4.put(r1, r2)
            r2 = 60000(0xea60, float:8.4078E-41)
            java.lang.String r1 = "timeout"
            r4.put(r1, r2)
            java.lang.String r2 = "attestation"
            java.lang.String r1 = "direct"
            r4.put(r2, r1)
            org.json.JSONArray r6 = X.Pxe.A1E()
            org.json.JSONObject r1 = X.DbS.A11()
            java.lang.String r13 = "type"
            java.lang.String r2 = "public-key"
            org.json.JSONObject r14 = r1.put(r13, r2)
            r1 = -7
            java.lang.String r12 = "alg"
            org.json.JSONObject r1 = r14.put(r12, r1)
            org.json.JSONArray r6 = r6.put(r1)
            org.json.JSONObject r1 = X.DbS.A11()
            org.json.JSONObject r2 = r1.put(r13, r2)
            r1 = -257(0xfffffffffffffeff, float:NaN)
            org.json.JSONObject r1 = r2.put(r12, r1)
            org.json.JSONArray r2 = r6.put(r1)
            java.lang.String r1 = "pubKeyCredParams"
            r4.put(r1, r2)
            org.json.JSONObject r6 = X.DbS.A11()
            java.lang.String r2 = "residentKey"
            java.lang.String r1 = "preferred"
            org.json.JSONObject r2 = r6.put(r2, r1)
            java.lang.String r1 = "authenticatorSelection"
            r4.put(r1, r2)
            org.json.JSONObject r1 = X.DbS.A11()
            if (r10 != 0) goto L_0x03ef
            java.lang.String r10 = "100000000000"
        L_0x03ef:
            org.json.JSONObject r1 = r1.put(r11, r10)
            if (r9 != 0) goto L_0x03f7
            java.lang.String r9 = "Username"
        L_0x03f7:
            org.json.JSONObject r2 = r1.put(r8, r9)
            if (r7 != 0) goto L_0x03ff
            java.lang.String r7 = "Passkey Demo"
        L_0x03ff:
            java.lang.String r1 = "displayName"
            org.json.JSONObject r2 = r2.put(r1, r7)
            java.lang.String r1 = "user"
            r4.put(r1, r2)
            X.C9231RUi.A00(r5, r4)
            java.lang.String r1 = X.DbT.A10(r4)
            boolean r0 = r0.A05
            r18 = 0
            X.QAf r2 = new X.QAf
            r2.<init>(r1, r0)
            r1 = 1627928636(0x6108383c, float:1.5705058E20)
            r0 = 3
            X.19S r0 = X.AnonymousClass1HX.A01(r1, r0)
            X.0qQ.A07(r0)
            r19 = 39
            X.MHP r14 = new X.MHP
            r17 = r3
            r16 = r2
            r14.<init>((java.lang.Object) r15, (java.lang.Object) r16, (java.lang.Object) r17, (X.AnonymousClass4D7) r18, (int) r19)
            X.AnonymousClass7TE.A1Z(r14, r0)
        L_0x0434:
            X.0gF r8 = X.C60340gF.A00
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7211Pzd.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7211Pzd(C7551QIu qIu, LoggingContext loggingContext, OtcInput otcInput, int i) {
        super(1);
        this.A00 = i;
        if (4 - i != 0) {
            this.A01 = loggingContext;
            this.A04 = "DELETE";
            this.A05 = true;
            this.A03 = qIu;
            this.A02 = otcInput;
        } else {
            this.A02 = loggingContext;
            this.A04 = "DELETE";
            this.A05 = true;
            this.A01 = qIu;
            this.A03 = otcInput;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7211Pzd(Object obj, Object obj2, Object obj3, String str, int i, boolean z) {
        super(1);
        this.A00 = i;
        this.A03 = obj;
        this.A01 = obj2;
        this.A04 = str;
        this.A05 = z;
        this.A02 = obj3;
    }
}
