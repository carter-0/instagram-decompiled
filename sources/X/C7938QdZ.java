package X;

import com.facebook.tigon.tigonmns.TigonMNSTokenBindingCallbacks;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.QdZ  reason: case insensitive filesystem */
public final class C7938QdZ extends TigonMNSTokenBindingCallbacks {
    public final 0lg A00;
    public final F33 A01;
    public final S1U A02;

    public C7938QdZ(0lg r4) {
        0qQ.A0B(r4, 1);
        this.A00 = r4;
        this.A02 = (S1U) r4.getDeviceSession().A01(S1U.class, C13333TVg.A00);
        C62880wX deviceSession = r4.getDeviceSession();
        this.A01 = (F33) deviceSession.A01(F33.class, new C13998To0(deviceSession, 22));
    }

    /* JADX WARNING: type inference failed for: r1v32, types: [java.lang.Object, X.S58] */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03cf, code lost:
        if (r1 >= 65536) goto L_0x03d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x042e, code lost:
        if (r7 >= 65536) goto L_0x0430;
     */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x04b9 A[Catch:{ RJV -> 0x04f7, RJV -> 0x0486, Exception -> 0x037b, RJW -> 0x0500 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0213 A[Catch:{ RJV -> 0x04f7, RJV -> 0x0486, Exception -> 0x037b, RJW -> 0x0500 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getHeaderValue(java.lang.String r27, byte[] r28) {
        /*
            r26 = this;
            r5 = r27
            r4 = 0
            r25 = r28
            r0 = r25
            boolean r6 = X.AnonymousClass7TF.A1U(r4, r5, r0)
            r0 = 18310360411156840(0x410d2d00043168, double:1.897038773282074E-307)
            X.0tN r0 = X.C63130yM.A00(r0)
            boolean r0 = X.0yU.A07(r0)
            if (r0 != 0) goto L_0x001c
            java.lang.String r5 = "#ALL_META#"
        L_0x001c:
            r0 = 18873310364369672(0x430d2d00010308, double:2.119546159050392E-307)
            X.0tN r0 = X.C63130yM.A00(r0)
            java.lang.String r3 = X.0yU.A03(r0)
            X.0qQ.A0B(r3, r4)
            int r1 = r3.hashCode()
            r0 = -1057248161(0xffffffffc0fbac5f, float:-7.8647914)
            if (r1 == r0) goto L_0x006a
            r0 = -907583341(0xffffffffc9e76093, float:-1895442.4)
            if (r1 == r0) goto L_0x005e
            r0 = 516632119(0x1ecb2e37, float:2.1512575E-20)
            if (r1 != r0) goto L_0x0076
            java.lang.String r0 = "ecdsap256"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0076
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
        L_0x0049:
            java.lang.Integer r23 = X.AnonymousClass05K.A0N
            r2 = 0
            java.lang.String r21 = "IGTigonMNSTokenBindingCallbacks"
            r0 = r23
            if (r1 != r0) goto L_0x0079
            java.lang.String r0 = "Got unsupported key parameters value: "
            java.lang.String r1 = X.002.A0R(r0, r3)
            r0 = r21
            X.0KC.A0C(r0, r1)
            return r2
        L_0x005e:
            java.lang.String r0 = "rsa2048_pss"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0076
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            goto L_0x0049
        L_0x006a:
            java.lang.String r0 = "rsa2048_pkcs1_5"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0076
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            goto L_0x0049
        L_0x0076:
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            goto L_0x0049
        L_0x0079:
            r0 = r26
            X.S1U r7 = r0.A02     // Catch:{ RJW -> 0x0500 }
            X.F33 r8 = r0.A01     // Catch:{ RJW -> 0x0500 }
            X.0qQ.A0B(r1, r6)     // Catch:{ RJW -> 0x0500 }
            r3 = 2
            X.AnonymousClass7TF.A1C(r7, r3, r8)     // Catch:{ RJW -> 0x0500 }
            java.lang.String r0 = "_TOKEN_BINDING_ID"
            java.lang.String r9 = X.002.A0R(r5, r0)     // Catch:{ RJW -> 0x0500 }
            X.0qQ.A0B(r9, r6)     // Catch:{ RJW -> 0x0500 }
            X.0xa r0 = r8.A00     // Catch:{ RJW -> 0x0500 }
            r24 = r0
            java.lang.String r0 = r0.getString(r9, r2)     // Catch:{ RJW -> 0x0500 }
            if (r0 != 0) goto L_0x009b
            r15 = 0
            goto L_0x009f
        L_0x009b:
            byte[] r15 = X.Pxg.A1X(r0)     // Catch:{ RJW -> 0x0500 }
        L_0x009f:
            java.lang.String r22 = "_TOKEN_BINDING_KEY_PARAMETERS"
            r0 = r22
            java.lang.String r20 = X.002.A0R(r5, r0)     // Catch:{ RJW -> 0x0500 }
            r0 = r20
            java.lang.Integer r0 = r8.A00(r0)     // Catch:{ RJW -> 0x0500 }
            if (r0 == 0) goto L_0x00bd
            int r0 = r0.intValue()     // Catch:{ RJW -> 0x0500 }
            byte r14 = (byte) r0     // Catch:{ RJW -> 0x0500 }
        L_0x00b4:
            r19 = 4
            java.lang.Integer[] r13 = X.AnonymousClass05K.A00(r19)     // Catch:{ RJW -> 0x0500 }
            int r12 = r13.length     // Catch:{ RJW -> 0x0500 }
            r10 = 0
            goto L_0x00bf
        L_0x00bd:
            r14 = -1
            goto L_0x00b4
        L_0x00bf:
            if (r10 >= r12) goto L_0x00cc
            r11 = r13[r10]     // Catch:{ RJW -> 0x0500 }
            byte r0 = X.S9N.A00(r11)     // Catch:{ RJW -> 0x0500 }
            if (r0 == r14) goto L_0x00ce
            int r10 = r10 + 1
            goto L_0x00bf
        L_0x00cc:
            r11 = r23
        L_0x00ce:
            java.lang.String r18 = "_KEY_ID"
            r0 = r18
            java.lang.String r17 = X.002.A0R(r5, r0)     // Catch:{ RJW -> 0x0500 }
            r0 = r17
            java.lang.Integer r10 = r8.A00(r0)     // Catch:{ RJW -> 0x0500 }
            java.lang.String r14 = ", keyParameters="
            java.lang.String r12 = "TokenBindingCore"
            if (r10 == 0) goto L_0x00f6
            if (r15 == 0) goto L_0x0142
            if (r11 == r1) goto L_0x0205
            java.lang.StringBuilder r13 = X.AnonymousClass7TE.A1A()     // Catch:{ RJW -> 0x0500 }
            java.lang.String r0 = "Existing token binding keypair (keyID="
            X.Pxf.A1K(r10, r0, r14, r13)     // Catch:{ RJW -> 0x0500 }
            if (r11 == 0) goto L_0x00f2
            goto L_0x00f8
        L_0x00f2:
            java.lang.String r0 = "null"
            goto L_0x00fc
        L_0x00f6:
            r0 = 0
            goto L_0x0146
        L_0x00f8:
            java.lang.String r0 = X.S9N.A01(r11)     // Catch:{ RJW -> 0x0500 }
        L_0x00fc:
            r13.append(r0)     // Catch:{ RJW -> 0x0500 }
            java.lang.String r0 = ") does not match current negotiated key parameters ("
            r13.append(r0)     // Catch:{ RJW -> 0x0500 }
            java.lang.String r0 = X.S9N.A01(r1)     // Catch:{ RJW -> 0x0500 }
            r13.append(r0)     // Catch:{ RJW -> 0x0500 }
            java.lang.String r0 = "). Creating a new keypair."
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r13)     // Catch:{ RJW -> 0x0500 }
            X.0KC.A0D(r12, r0)     // Catch:{ RJW -> 0x0500 }
            java.lang.String r12 = "PREVIOUS_"
            java.lang.String r14 = X.002.A0R(r12, r9)     // Catch:{ RJW -> 0x0500 }
            X.0qQ.A0B(r14, r6)     // Catch:{ RJW -> 0x0500 }
            java.lang.String r13 = X.Pxg.A0z(r15)     // Catch:{ RJW -> 0x0500 }
            r0 = r24
            X.DbX.A1U(r0, r14, r13)     // Catch:{ RJW -> 0x0500 }
            r0 = r17
            java.lang.String r13 = X.002.A0R(r12, r0)     // Catch:{ RJW -> 0x0500 }
            int r0 = r10.intValue()     // Catch:{ RJW -> 0x0500 }
            r8.A01(r13, r0)     // Catch:{ RJW -> 0x0500 }
            r0 = r20
            java.lang.String r12 = X.002.A0R(r12, r0)     // Catch:{ RJW -> 0x0500 }
            byte r0 = X.S9N.A00(r11)     // Catch:{ RJW -> 0x0500 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            r8.A01(r12, r0)     // Catch:{ RJW -> 0x0500 }
        L_0x0142:
            int r0 = r10.intValue()     // Catch:{ RJW -> 0x0500 }
        L_0x0146:
            int r16 = r0 + 1
            java.lang.String r11 = "TOKEN-BINDING-KEY-"
            r10 = 95
            r0 = r16
            java.lang.String r12 = X.002.A0W(r11, r5, r10, r0)     // Catch:{ RJW -> 0x0500 }
            X.0qQ.A0B(r12, r4)     // Catch:{ RJW -> 0x0500 }
            int r0 = r1.intValue()     // Catch:{ RJW -> 0x0500 }
            if (r0 == r4) goto L_0x017a
            if (r0 == r6) goto L_0x0177
            if (r0 == r3) goto L_0x0174
            java.lang.String r3 = "Invalid algorithm: {"
            java.lang.String r1 = X.S9N.A01(r1)     // Catch:{ RJW -> 0x0500 }
            r0 = 125(0x7d, float:1.75E-43)
            java.lang.String r1 = X.002.A0S(r3, r1, r0)     // Catch:{ RJW -> 0x0500 }
            X.0qQ.A0B(r1, r6)     // Catch:{ RJW -> 0x0500 }
            X.QcQ r0 = new X.QcQ     // Catch:{ RJW -> 0x0500 }
            r0.<init>(r1, r2)     // Catch:{ RJW -> 0x0500 }
            throw r0     // Catch:{ RJW -> 0x0500 }
        L_0x0174:
            X.RDV r11 = X.RDV.EC     // Catch:{ RJW -> 0x0500 }
            goto L_0x017c
        L_0x0177:
            X.RDV r11 = X.RDV.RSA     // Catch:{ RJW -> 0x0500 }
            goto L_0x017c
        L_0x017a:
            X.RDV r11 = X.RDV.RSA_PKCS_1_5     // Catch:{ RJW -> 0x0500 }
        L_0x017c:
            X.0eM r0 = r7.A00     // Catch:{ RJV -> 0x04f7 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ RJV -> 0x04f7 }
            X.S4R r0 = (X.S4R) r0     // Catch:{ RJV -> 0x04f7 }
            X.SID r10 = r0.A00     // Catch:{ RJV -> 0x04f7 }
            boolean r0 = r0.A01     // Catch:{ RJV -> 0x04f7 }
            X.SID.A00(r10, r11, r12, r2, r0)     // Catch:{ RJV -> 0x04f7 }
            java.security.PublicKey r13 = r7.A00(r12)     // Catch:{ RJW -> 0x0500 }
            r11 = 0
            r10 = 0
            r15 = 0
            r14 = 0
            boolean r0 = r13 instanceof java.security.interfaces.RSAPublicKey     // Catch:{ RJW -> 0x0500 }
            if (r0 == 0) goto L_0x01b1
            java.security.interfaces.RSAPublicKey r13 = (java.security.interfaces.RSAPublicKey) r13     // Catch:{ RJW -> 0x0500 }
            java.math.BigInteger r15 = r13.getModulus()     // Catch:{ RJW -> 0x0500 }
            X.0qQ.A07(r15)     // Catch:{ RJW -> 0x0500 }
            java.math.BigInteger r14 = r13.getPublicExponent()     // Catch:{ RJW -> 0x0500 }
            X.0qQ.A07(r14)     // Catch:{ RJW -> 0x0500 }
        L_0x01a7:
            byte[] r13 = X.C9570RdA.A00(r1, r11, r10, r15, r14)     // Catch:{ RJW -> 0x0500 }
            int r10 = r13.length     // Catch:{ RJW -> 0x0500 }
            r0 = 64
            if (r0 > r10) goto L_0x04c8
            goto L_0x01cd
        L_0x01b1:
            boolean r0 = r13 instanceof java.security.interfaces.ECPublicKey     // Catch:{ RJW -> 0x0500 }
            if (r0 == 0) goto L_0x04d4
            java.security.interfaces.ECPublicKey r13 = (java.security.interfaces.ECPublicKey) r13     // Catch:{ RJW -> 0x0500 }
            java.security.spec.ECPoint r0 = r13.getW()     // Catch:{ RJW -> 0x0500 }
            X.0qQ.A07(r0)     // Catch:{ RJW -> 0x0500 }
            java.math.BigInteger r11 = r0.getAffineX()     // Catch:{ RJW -> 0x0500 }
            X.0qQ.A07(r11)     // Catch:{ RJW -> 0x0500 }
            java.math.BigInteger r10 = r0.getAffineY()     // Catch:{ RJW -> 0x0500 }
            X.0qQ.A07(r10)     // Catch:{ RJW -> 0x0500 }
            goto L_0x01a7
        L_0x01cd:
            r0 = 65536(0x10000, float:9.18355E-41)
            if (r10 >= r0) goto L_0x04c8
            byte r11 = X.S9N.A00(r1)     // Catch:{ RJW -> 0x0500 }
            byte[] r12 = new byte[r6]     // Catch:{ RJW -> 0x0500 }
            r12[r4] = r11     // Catch:{ RJW -> 0x0500 }
            short r10 = (short) r10     // Catch:{ RJW -> 0x0500 }
            byte[] r1 = new byte[r3]     // Catch:{ RJW -> 0x0500 }
            r0 = 65535(0xffff, float:9.1834E-41)
            r10 = r10 & r0
            X.Pxg.A1B(r10, r1, r4, r6)     // Catch:{ RJW -> 0x0500 }
            byte[] r0 = X.0Yw.A0X(r12, r1)     // Catch:{ RJW -> 0x0500 }
            byte[] r10 = X.0Yw.A0X(r0, r13)     // Catch:{ RJW -> 0x0500 }
            r1 = r17
            r0 = r16
            r8.A01(r1, r0)     // Catch:{ RJW -> 0x0500 }
            r1 = r11 & 255(0xff, float:3.57E-43)
            r0 = r20
            r8.A01(r0, r1)     // Catch:{ RJW -> 0x0500 }
            X.0qQ.A0B(r10, r3)     // Catch:{ RJW -> 0x0500 }
            java.lang.String r1 = X.Pxg.A0z(r10)     // Catch:{ RJW -> 0x0500 }
            r0 = r24
            X.DbX.A1U(r0, r9, r1)     // Catch:{ RJW -> 0x0500 }
        L_0x0205:
            byte[][] r1 = new byte[r4][]     // Catch:{ RJW -> 0x0500 }
            r0 = r18
            java.lang.String r0 = X.002.A0R(r5, r0)     // Catch:{ RJW -> 0x0500 }
            java.lang.Integer r0 = r8.A00(r0)     // Catch:{ RJW -> 0x0500 }
            if (r0 == 0) goto L_0x04b9
            int r10 = r0.intValue()     // Catch:{ RJW -> 0x0500 }
            java.lang.String r9 = "TOKEN-BINDING-KEY-"
            r0 = 95
            java.lang.String r10 = X.002.A0W(r9, r5, r0, r10)     // Catch:{ RJW -> 0x0500 }
            r0 = r22
            java.lang.String r0 = X.002.A0R(r5, r0)     // Catch:{ RJW -> 0x0500 }
            java.lang.Integer r0 = r8.A00(r0)     // Catch:{ RJW -> 0x0500 }
            if (r0 == 0) goto L_0x0237
            int r0 = r0.intValue()     // Catch:{ RJW -> 0x0500 }
            byte r13 = (byte) r0     // Catch:{ RJW -> 0x0500 }
        L_0x0230:
            java.lang.Integer[] r12 = X.AnonymousClass05K.A00(r19)     // Catch:{ RJW -> 0x0500 }
            int r11 = r12.length     // Catch:{ RJW -> 0x0500 }
            r9 = 0
            goto L_0x0239
        L_0x0237:
            r13 = -1
            goto L_0x0230
        L_0x0239:
            if (r9 >= r11) goto L_0x0246
            r8 = r12[r9]     // Catch:{ RJW -> 0x0500 }
            byte r0 = X.S9N.A00(r8)     // Catch:{ RJW -> 0x0500 }
            if (r0 == r13) goto L_0x0248
            int r9 = r9 + 1
            goto L_0x0239
        L_0x0246:
            r8 = r23
        L_0x0248:
            r0 = r23
            if (r8 == r0) goto L_0x04a4
            java.security.PublicKey r9 = r7.A00(r10)     // Catch:{ RJW -> 0x0500 }
            byte[] r11 = new byte[r3]     // Catch:{ RJW -> 0x0500 }
            r11[r4] = r4     // Catch:{ RJW -> 0x0500 }
            byte r20 = X.S9N.A00(r8)     // Catch:{ RJW -> 0x0500 }
            r11[r6] = r20     // Catch:{ RJW -> 0x0500 }
            r0 = r25
            byte[] r12 = X.0Yw.A0X(r11, r0)     // Catch:{ RJW -> 0x0500 }
            X.0qQ.A0B(r10, r4)     // Catch:{ RJW -> 0x0500 }
            X.0qQ.A0B(r8, r6)     // Catch:{ RJW -> 0x0500 }
            X.0qQ.A0B(r12, r3)     // Catch:{ RJW -> 0x0500 }
            int r13 = r8.intValue()     // Catch:{ RJW -> 0x0500 }
            if (r13 == r4) goto L_0x0270
            goto L_0x0273
        L_0x0270:
            X.RDV r11 = X.RDV.RSA_PKCS_1_5     // Catch:{ RJW -> 0x0500 }
            goto L_0x0278
        L_0x0273:
            if (r13 == r6) goto L_0x027e
            if (r13 == r3) goto L_0x027b
            r11 = 0
        L_0x0278:
            if (r11 == 0) goto L_0x048f
            goto L_0x0281
        L_0x027b:
            X.RDV r11 = X.RDV.EC     // Catch:{ RJW -> 0x0500 }
            goto L_0x0278
        L_0x027e:
            X.RDV r11 = X.RDV.RSA     // Catch:{ RJW -> 0x0500 }
            goto L_0x0278
        L_0x0281:
            X.0eM r0 = r7.A00     // Catch:{ RJV -> 0x0486 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ RJV -> 0x0486 }
            X.S4R r0 = (X.S4R) r0     // Catch:{ RJV -> 0x0486 }
            byte[] r7 = r0.A01(r11, r10, r12)     // Catch:{ RJV -> 0x0486 }
            X.0qQ.A07(r7)     // Catch:{ RJV -> 0x0486 }
            r12 = 0
            r11 = 0
            r19 = 0
            r18 = 0
            byte[][] r10 = new byte[r4][]     // Catch:{ RJW -> 0x0500 }
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r4)     // Catch:{ RJW -> 0x0500 }
            X.0qQ.A0B(r0, r4)     // Catch:{ RJW -> 0x0500 }
            java.lang.Object[] r10 = X.0Yw.A0a(r10, r0)     // Catch:{ RJW -> 0x0500 }
            byte[][] r10 = (byte[][]) r10     // Catch:{ RJW -> 0x0500 }
            boolean r0 = r9 instanceof java.security.interfaces.RSAPublicKey     // Catch:{ RJW -> 0x0500 }
            if (r0 == 0) goto L_0x02ba
            java.security.interfaces.RSAPublicKey r9 = (java.security.interfaces.RSAPublicKey) r9     // Catch:{ RJW -> 0x0500 }
            java.math.BigInteger r19 = r9.getModulus()     // Catch:{ RJW -> 0x0500 }
            X.0qQ.A07(r19)     // Catch:{ RJW -> 0x0500 }
            java.math.BigInteger r18 = r9.getPublicExponent()     // Catch:{ RJW -> 0x0500 }
            X.0qQ.A07(r18)     // Catch:{ RJW -> 0x0500 }
            goto L_0x02d5
        L_0x02ba:
            boolean r0 = r9 instanceof java.security.interfaces.ECPublicKey     // Catch:{ RJW -> 0x0500 }
            if (r0 == 0) goto L_0x0470
            java.security.interfaces.ECPublicKey r9 = (java.security.interfaces.ECPublicKey) r9     // Catch:{ RJW -> 0x0500 }
            java.security.spec.ECPoint r0 = r9.getW()     // Catch:{ RJW -> 0x0500 }
            X.0qQ.A07(r0)     // Catch:{ RJW -> 0x0500 }
            java.math.BigInteger r12 = r0.getAffineX()     // Catch:{ RJW -> 0x0500 }
            X.0qQ.A07(r12)     // Catch:{ RJW -> 0x0500 }
            java.math.BigInteger r11 = r0.getAffineY()     // Catch:{ RJW -> 0x0500 }
            X.0qQ.A07(r11)     // Catch:{ RJW -> 0x0500 }
        L_0x02d5:
            r9 = 0
            if (r13 == r4) goto L_0x03a4
            if (r13 == r6) goto L_0x03a4
            if (r13 != r3) goto L_0x0391
            X.R7Q r1 = new X.R7Q     // Catch:{ Exception -> 0x037b }
            r1.<init>()     // Catch:{ Exception -> 0x037b }
            X.RCA r0 = new X.RCA     // Catch:{ Exception -> 0x037b }
            r0.<init>(r1, r7)     // Catch:{ Exception -> 0x037b }
            X.RRQ r0 = r0.A00()     // Catch:{ Exception -> 0x037b }
            com.hierynomus.asn1.types.constructed.ASN1Sequence r0 = (com.hierynomus.asn1.types.constructed.ASN1Sequence) r0     // Catch:{ Exception -> 0x037b }
            java.util.List r7 = r0.A01     // Catch:{ Exception -> 0x037b }
            java.lang.Object r1 = r7.get(r4)     // Catch:{ Exception -> 0x037b }
            X.RRQ r1 = (X.RRQ) r1     // Catch:{ Exception -> 0x037b }
            boolean r0 = r1 instanceof com.hierynomus.asn1.types.primitive.ASN1Integer     // Catch:{ Exception -> 0x037b }
            if (r0 == 0) goto L_0x0307
            com.hierynomus.asn1.types.primitive.ASN1Integer r1 = (com.hierynomus.asn1.types.primitive.ASN1Integer) r1     // Catch:{ Exception -> 0x037b }
        L_0x02fa:
            java.lang.Object r15 = r7.get(r6)     // Catch:{ Exception -> 0x037b }
            X.RRQ r15 = (X.RRQ) r15     // Catch:{ Exception -> 0x037b }
            boolean r0 = r15 instanceof com.hierynomus.asn1.types.primitive.ASN1Integer     // Catch:{ Exception -> 0x037b }
            if (r0 == 0) goto L_0x0309
            com.hierynomus.asn1.types.primitive.ASN1Integer r15 = (com.hierynomus.asn1.types.primitive.ASN1Integer) r15     // Catch:{ Exception -> 0x037b }
            goto L_0x030a
        L_0x0307:
            r1 = r2
            goto L_0x02fa
        L_0x0309:
            r15 = r2
        L_0x030a:
            if (r1 == 0) goto L_0x0366
            if (r15 == 0) goto L_0x0366
            java.math.BigInteger r1 = r1.A00     // Catch:{ Exception -> 0x037b }
            X.0qQ.A07(r1)     // Catch:{ Exception -> 0x037b }
            int r0 = r1.signum()     // Catch:{ Exception -> 0x037b }
            java.lang.String r17 = "The BigInteger value must be positive"
            if (r0 != r6) goto L_0x035c
            byte[] r14 = X.Pxg.A1Y(r1, r6)     // Catch:{ Exception -> 0x037b }
            int r1 = r14.length     // Catch:{ Exception -> 0x037b }
            r13 = 32
            boolean r0 = X.JTQ.A1P(r13, r1)
            java.lang.String r16 = "Length must be greater than or equal to the size of the array"
            if (r0 == 0) goto L_0x0357
            byte[] r7 = new byte[r13]     // Catch:{ Exception -> 0x037b }
            int r0 = 32 - r1
            java.lang.System.arraycopy(r14, r4, r7, r0, r1)     // Catch:{ Exception -> 0x037b }
            java.math.BigInteger r1 = r15.A00     // Catch:{ Exception -> 0x037b }
            X.0qQ.A07(r1)     // Catch:{ Exception -> 0x037b }
            int r0 = r1.signum()     // Catch:{ Exception -> 0x037b }
            if (r0 != r6) goto L_0x0352
            byte[] r14 = X.Pxg.A1Y(r1, r6)     // Catch:{ Exception -> 0x037b }
            int r1 = r14.length     // Catch:{ Exception -> 0x037b }
            boolean r0 = X.JTQ.A1P(r13, r1)
            if (r0 == 0) goto L_0x0361
            byte[] r0 = new byte[r13]     // Catch:{ Exception -> 0x037b }
            int r13 = r13 - r1
            java.lang.System.arraycopy(r14, r4, r0, r13, r1)     // Catch:{ Exception -> 0x037b }
            byte[] r7 = X.0Yw.A0X(r7, r0)     // Catch:{ Exception -> 0x037b }
            goto L_0x03a4
        L_0x0352:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r17)     // Catch:{ Exception -> 0x037b }
            goto L_0x0365
        L_0x0357:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r16)     // Catch:{ Exception -> 0x037b }
            goto L_0x0365
        L_0x035c:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r17)     // Catch:{ Exception -> 0x037b }
            goto L_0x0365
        L_0x0361:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r16)     // Catch:{ Exception -> 0x037b }
        L_0x0365:
            throw r0     // Catch:{ Exception -> 0x037b }
        L_0x0366:
            java.lang.String r3 = "Failed to parse DER encoded signature (keyParameters="
            java.lang.String r1 = X.S9N.A01(r8)     // Catch:{ RJW -> 0x0500 }
            r0 = 41
            java.lang.String r1 = X.002.A0S(r3, r1, r0)     // Catch:{ RJW -> 0x0500 }
            X.0qQ.A0B(r1, r6)     // Catch:{ RJW -> 0x0500 }
            X.RJW r0 = new X.RJW     // Catch:{ RJW -> 0x0500 }
            r0.<init>(r1, r2)     // Catch:{ RJW -> 0x0500 }
            throw r0     // Catch:{ RJW -> 0x0500 }
        L_0x037b:
            r4 = move-exception
            java.lang.String r3 = "Unexpected error when converting DER signature (keyParameters="
            java.lang.String r1 = X.S9N.A01(r8)     // Catch:{ RJW -> 0x0500 }
            java.lang.String r0 = ") to raw signature"
            java.lang.String r1 = X.002.A0g(r3, r1, r0)     // Catch:{ RJW -> 0x0500 }
            X.0qQ.A0B(r1, r6)     // Catch:{ RJW -> 0x0500 }
            X.RJW r0 = new X.RJW     // Catch:{ RJW -> 0x0500 }
            r0.<init>(r1, r4)     // Catch:{ RJW -> 0x0500 }
            throw r0     // Catch:{ RJW -> 0x0500 }
        L_0x0391:
            java.lang.String r1 = "Unsupporetd key parameters: "
            java.lang.String r0 = X.S9N.A01(r8)     // Catch:{ RJW -> 0x0500 }
            java.lang.String r1 = X.002.A0R(r1, r0)     // Catch:{ RJW -> 0x0500 }
            X.0qQ.A0B(r1, r6)     // Catch:{ RJW -> 0x0500 }
            X.RJW r0 = new X.RJW     // Catch:{ RJW -> 0x0500 }
            r0.<init>(r1, r2)     // Catch:{ RJW -> 0x0500 }
            throw r0     // Catch:{ RJW -> 0x0500 }
        L_0x03a4:
            r1 = r19
            r0 = r18
            byte[] r14 = X.C9570RdA.A00(r8, r12, r11, r1, r0)     // Catch:{ RJW -> 0x0500 }
            int r1 = r14.length     // Catch:{ RJW -> 0x0500 }
            r11 = 64
            if (r11 > r1) goto L_0x0464
            r12 = 65536(0x10000, float:9.18355E-41)
            if (r1 >= r12) goto L_0x0464
            byte[] r13 = new byte[r6]     // Catch:{ RJW -> 0x0500 }
            r13[r4] = r20     // Catch:{ RJW -> 0x0500 }
            short r8 = (short) r1     // Catch:{ RJW -> 0x0500 }
            byte[] r1 = new byte[r3]     // Catch:{ RJW -> 0x0500 }
            r0 = 65535(0xffff, float:9.1834E-41)
            r8 = r8 & r0
            X.Pxg.A1B(r8, r1, r4, r6)     // Catch:{ RJW -> 0x0500 }
            byte[] r0 = X.0Yw.A0X(r13, r1)     // Catch:{ RJW -> 0x0500 }
            byte[] r8 = X.0Yw.A0X(r0, r14)     // Catch:{ RJW -> 0x0500 }
            int r1 = r7.length     // Catch:{ RJW -> 0x0500 }
            if (r11 > r1) goto L_0x03d1
            r0 = 1
            if (r1 < r12) goto L_0x03d2
        L_0x03d1:
            r0 = 0
        L_0x03d2:
            if (r0 == 0) goto L_0x0458
            byte[] r0 = new byte[r6]     // Catch:{ RJW -> 0x0500 }
            r0[r4] = r4     // Catch:{ RJW -> 0x0500 }
            byte[] r8 = X.0Yw.A0X(r0, r8)     // Catch:{ RJW -> 0x0500 }
            short r1 = (short) r1     // Catch:{ RJW -> 0x0500 }
            byte[] r0 = new byte[r3]     // Catch:{ RJW -> 0x0500 }
            r14 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r14
            X.Pxg.A1B(r1, r0, r4, r6)     // Catch:{ RJW -> 0x0500 }
            byte[] r0 = X.0Yw.A0X(r8, r0)     // Catch:{ RJW -> 0x0500 }
            byte[] r7 = X.0Yw.A0X(r0, r7)     // Catch:{ RJW -> 0x0500 }
            int r8 = r10.length     // Catch:{ RJW -> 0x0500 }
            short r1 = (short) r8     // Catch:{ RJW -> 0x0500 }
            byte[] r0 = new byte[r3]     // Catch:{ RJW -> 0x0500 }
            r1 = r1 & r14
            X.Pxg.A1B(r1, r0, r4, r6)     // Catch:{ RJW -> 0x0500 }
            byte[] r7 = X.0Yw.A0X(r7, r0)     // Catch:{ RJW -> 0x0500 }
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()     // Catch:{ RJW -> 0x0500 }
        L_0x03fe:
            if (r9 >= r8) goto L_0x040c
            r0 = r10[r9]     // Catch:{ RJW -> 0x0500 }
            java.util.List r0 = X.03t.A0E(r0)     // Catch:{ RJW -> 0x0500 }
            X.018.A16(r0, r1)     // Catch:{ RJW -> 0x0500 }
            int r9 = r9 + 1
            goto L_0x03fe
        L_0x040c:
            byte[] r0 = X.00k.A0v(r1)     // Catch:{ RJW -> 0x0500 }
            byte[] r0 = X.0Yw.A0X(r7, r0)     // Catch:{ RJW -> 0x0500 }
            byte[][] r1 = new byte[r4][]     // Catch:{ RJW -> 0x0500 }
            byte[][] r0 = new byte[][]{r0}     // Catch:{ RJW -> 0x0500 }
            java.lang.Object[] r11 = X.0Yw.A0a(r1, r0)     // Catch:{ RJW -> 0x0500 }
            byte[][] r11 = (byte[][]) r11     // Catch:{ RJW -> 0x0500 }
            byte[] r13 = new byte[r4]     // Catch:{ RJW -> 0x0500 }
            int r10 = r11.length     // Catch:{ RJW -> 0x0500 }
            r9 = 0
        L_0x0424:
            if (r9 >= r10) goto L_0x0453
            r8 = r11[r9]     // Catch:{ RJW -> 0x0500 }
            int r7 = r8.length     // Catch:{ RJW -> 0x0500 }
            r0 = 132(0x84, float:1.85E-43)
            if (r0 > r7) goto L_0x0430
            r0 = 1
            if (r7 < r12) goto L_0x0431
        L_0x0430:
            r0 = 0
        L_0x0431:
            if (r0 == 0) goto L_0x0445
            short r1 = (short) r7     // Catch:{ RJW -> 0x0500 }
            byte[] r0 = new byte[r3]     // Catch:{ RJW -> 0x0500 }
            r1 = r1 & r14
            X.Pxg.A1B(r1, r0, r4, r6)     // Catch:{ RJW -> 0x0500 }
            byte[] r0 = X.0Yw.A0X(r13, r0)     // Catch:{ RJW -> 0x0500 }
            byte[] r13 = X.0Yw.A0X(r0, r8)     // Catch:{ RJW -> 0x0500 }
            int r9 = r9 + 1
            goto L_0x0424
        L_0x0445:
            java.lang.String r1 = "Length of each token binding must be between 132 and 65535, at index "
            java.lang.String r0 = " got size of: "
            java.lang.String r1 = X.002.A02(r9, r7, r1, r0)     // Catch:{ RJW -> 0x0500 }
            X.QcR r0 = new X.QcR     // Catch:{ RJW -> 0x0500 }
            r0.<init>(r1)     // Catch:{ RJW -> 0x0500 }
            throw r0     // Catch:{ RJW -> 0x0500 }
        L_0x0453:
            java.lang.String r2 = X.Pxg.A0z(r13)     // Catch:{ RJW -> 0x0500 }
            return r2
        L_0x0458:
            java.lang.String r0 = "Signature size must be between 64 and 65535 bytes, got "
            java.lang.String r1 = X.002.A0O(r0, r1)     // Catch:{ RJW -> 0x0500 }
            X.QcR r0 = new X.QcR     // Catch:{ RJW -> 0x0500 }
            r0.<init>(r1)     // Catch:{ RJW -> 0x0500 }
            throw r0     // Catch:{ RJW -> 0x0500 }
        L_0x0464:
            java.lang.String r0 = "Public key length must be between 64 and 65535 bytes, got: "
            java.lang.String r1 = X.002.A0O(r0, r1)     // Catch:{ RJW -> 0x0500 }
            X.QcR r0 = new X.QcR     // Catch:{ RJW -> 0x0500 }
            r0.<init>(r1)     // Catch:{ RJW -> 0x0500 }
            throw r0     // Catch:{ RJW -> 0x0500 }
        L_0x0470:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ RJW -> 0x0500 }
            java.lang.String r0 = "Keystore returned invalid public key type, must be RSAPublicKey or ECPublicKey but got: {"
            r1.append(r0)     // Catch:{ RJW -> 0x0500 }
            java.lang.String r1 = X.Pxg.A0p(r9, r1)     // Catch:{ RJW -> 0x0500 }
            X.0qQ.A0B(r1, r6)     // Catch:{ RJW -> 0x0500 }
            X.RJW r0 = new X.RJW     // Catch:{ RJW -> 0x0500 }
            r0.<init>(r1, r2)     // Catch:{ RJW -> 0x0500 }
            throw r0     // Catch:{ RJW -> 0x0500 }
        L_0x0486:
            r3 = move-exception
            java.lang.String r1 = "Failed to sign message"
            X.QcQ r0 = new X.QcQ     // Catch:{ RJW -> 0x0500 }
            r0.<init>(r1, r3)     // Catch:{ RJW -> 0x0500 }
            throw r0     // Catch:{ RJW -> 0x0500 }
        L_0x048f:
            java.lang.String r3 = "Invalid algorithm: {"
            java.lang.String r1 = X.S9N.A01(r8)     // Catch:{ RJW -> 0x0500 }
            r0 = 125(0x7d, float:1.75E-43)
            java.lang.String r1 = X.002.A0S(r3, r1, r0)     // Catch:{ RJW -> 0x0500 }
            X.0qQ.A0B(r1, r6)     // Catch:{ RJW -> 0x0500 }
            X.QcQ r0 = new X.QcQ     // Catch:{ RJW -> 0x0500 }
            r0.<init>(r1, r2)     // Catch:{ RJW -> 0x0500 }
            throw r0     // Catch:{ RJW -> 0x0500 }
        L_0x04a4:
            java.lang.String r4 = "Existing token binding ID data for host: "
            java.lang.String r3 = " is invalid (got keyParmeters="
            java.lang.String r1 = "UNKNOWN"
            r0 = 41
            java.lang.String r1 = X.002.A0v(r4, r5, r3, r1, r0)     // Catch:{ RJW -> 0x0500 }
            X.0qQ.A0B(r1, r6)     // Catch:{ RJW -> 0x0500 }
            X.RJW r0 = new X.RJW     // Catch:{ RJW -> 0x0500 }
            r0.<init>(r1, r2)     // Catch:{ RJW -> 0x0500 }
            throw r0     // Catch:{ RJW -> 0x0500 }
        L_0x04b9:
            java.lang.String r0 = "No token binding key ID exists for host: "
            java.lang.String r1 = X.002.A0R(r0, r5)     // Catch:{ RJW -> 0x0500 }
            X.0qQ.A0B(r1, r6)     // Catch:{ RJW -> 0x0500 }
            X.RJW r0 = new X.RJW     // Catch:{ RJW -> 0x0500 }
            r0.<init>(r1, r2)     // Catch:{ RJW -> 0x0500 }
            throw r0     // Catch:{ RJW -> 0x0500 }
        L_0x04c8:
            java.lang.String r0 = "Public key length must be between 64 and 65535 bytes, got: "
            java.lang.String r1 = X.002.A0O(r0, r10)     // Catch:{ RJW -> 0x0500 }
            X.QcR r0 = new X.QcR     // Catch:{ RJW -> 0x0500 }
            r0.<init>(r1)     // Catch:{ RJW -> 0x0500 }
            throw r0     // Catch:{ RJW -> 0x0500 }
        L_0x04d4:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ RJW -> 0x0500 }
            java.lang.String r0 = "Got invalid public key ("
            r1.append(r0)     // Catch:{ RJW -> 0x0500 }
            r1.append(r13)     // Catch:{ RJW -> 0x0500 }
            java.lang.String r0 = ") from Keystore for keyName="
            r1.append(r0)     // Catch:{ RJW -> 0x0500 }
            r1.append(r12)     // Catch:{ RJW -> 0x0500 }
            java.lang.String r0 = ", must be RSAPublicKey or ECPublicKey"
            java.lang.String r1 = X.AnonymousClass7TF.A0l(r0, r1)     // Catch:{ RJW -> 0x0500 }
            X.0qQ.A0B(r1, r6)     // Catch:{ RJW -> 0x0500 }
            X.RJW r0 = new X.RJW     // Catch:{ RJW -> 0x0500 }
            r0.<init>(r1, r2)     // Catch:{ RJW -> 0x0500 }
            throw r0     // Catch:{ RJW -> 0x0500 }
        L_0x04f7:
            r3 = move-exception
            java.lang.String r1 = "Failed to generate key"
            X.QcQ r0 = new X.QcQ     // Catch:{ RJW -> 0x0500 }
            r0.<init>(r1, r3)     // Catch:{ RJW -> 0x0500 }
            throw r0     // Catch:{ RJW -> 0x0500 }
        L_0x0500:
            r3 = move-exception
            java.lang.String r0 = "Failed to create token binding header for host "
            java.lang.String r1 = X.002.A0R(r0, r5)
            r0 = r21
            X.0KC.A0F(r0, r1, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7938QdZ.getHeaderValue(java.lang.String, byte[]):java.lang.String");
    }

    public final ScheduledExecutorService getScheduledExecutorService() {
        return Pxf.A0z();
    }

    public final String getAllowedHosts() {
        return 0yU.A03(C63130yM.A00(18873310364500745L));
    }
}
