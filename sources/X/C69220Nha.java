package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

/* renamed from: X.Nha  reason: case insensitive filesystem */
public final class C69220Nha extends C252323ov {
    public final UserSession A00;
    public final OW6 A01;
    public final AnonymousClass7GS A02;
    public final AnonymousClass7GR A03;
    public final boolean A04;

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.4OC] */
    public final void A0A(0xI r5, C263934Nx r6) {
        0qQ.A0B(r5, 0);
        ? obj = new Object();
        OW6 ow6 = this.A01;
        Integer valueOf = Integer.valueOf(ow6.A00);
        obj.A0K = valueOf;
        if (valueOf != null) {
            r5.A08(valueOf, C273654mx.A00(379));
        }
        Integer A0t = C51968G9o.A0t(ow6.A03);
        obj.A0L = A0t;
        if (A0t != null) {
            r5.A08(A0t, "reel_size");
        }
        Boolean valueOf2 = Boolean.valueOf(this.A04);
        obj.A03 = valueOf2;
        if (valueOf2 != null) {
            r5.A09("is_replay", valueOf2);
        }
        if (r6 != null) {
            r6.A07 = obj;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69220Nha(UserSession userSession, OW6 ow6, AnonymousClass7GR r4, AnonymousClass4DU r5, String str, boolean z) {
        super(r5, str);
        AnonymousClass7GS r0 = new AnonymousClass7GS(userSession);
        this.A01 = ow6;
        this.A04 = z;
        this.A00 = userSession;
        this.A02 = r0;
        this.A03 = r4;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass4OR A05(Object obj) {
        AnonymousClass4OQ r4 = AnonymousClass4OQ.ORGANIC;
        String A002 = this.A03.A00();
        0bb r2 = new 0bb();
        r2.A05("media_id", -1L);
        C66582MXn.A18(r4, r2, this);
        r2.A06("tracking_token", "-1");
        r2.A06("encrypted_logging_policy", "encrypted_only");
        r2.A06("persistent_id", A002);
        return r2;
    }

    public final /* bridge */ /* synthetic */ C263974Ob A06(C263974Ob r6, Object obj) {
        AnonymousClass3WR r1;
        String str;
        P0N p0n = (P0N) obj;
        AnonymousClass7TF.A1H(p0n, r6);
        super.A06(r6, p0n);
        C68167N3h n3h = p0n.A00;
        if (AnonymousClass7TF.A1W(n3h.A0B, 1iA.A0a)) {
            r1 = n3h.A00();
        } else {
            r1 = null;
        }
        boolean A1X = AnonymousClass7TG.A1X(p0n.A04);
        r6.A06("video_format", C263984Oc.A01(r1, false, n3h.A0R));
        Boolean valueOf = Boolean.valueOf(A1X);
        r6.A03("is_instamadillo", valueOf);
        C254923tH r2 = p0n.A01;
        boolean A1a = DbX.A1a(valueOf);
        String str2 = "ig_advanced_crypto_transport";
        if (!A1a) {
            if (r2 == C254923tH.DJANGO) {
                str2 = "ig_django";
            } else if (r2 != C254923tH.ACT) {
                str2 = r2 == C254923tH.DJANGO_ACT_MIXED ? "ig_django_msys_mixed" : "ig_messenger_infra";
            }
        }
        r6.A06(TraceFieldType.TransportType, str2);
        r6.A03("is_vm", Boolean.valueOf(p0n.A09));
        r6.A05("ephemeral_lifetime_ms", p0n.A07);
        1iA r0 = p0n.A03;
        if (r0 != null) {
            str = OX6.A00(r0);
        } else {
            str = "unknown";
        }
        r6.A06("media_type", str);
        r6.A06("media_product_type", OX6.A02(p0n.A06));
        r6.A06("interface_identifier", OX6.A01(p0n.A05));
        r6.A06("open_thread_id", p0n.A08);
        return r6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ X.C263844No A07(java.lang.Object r42) {
        /*
            r41 = this;
            r9 = r42
            X.P0N r9 = (X.P0N) r9
            r6 = 0
            X.0qQ.A0B(r9, r6)
            r3 = r41
            X.7GS r0 = r3.A02
            com.instagram.common.session.UserSession r4 = r0.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320322219286824(0x81092400022128, double:3.0324562494511514E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 != 0) goto L_0x00b8
            r0 = 36322070270846902(0x810abb000027b6, double:3.0335617242965834E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 != 0) goto L_0x00b8
            X.N3h r8 = r9.A00
            X.4iq r2 = r8.A07
            r15 = 0
            if (r2 == 0) goto L_0x00b5
            X.4ip r4 = r2.A05
        L_0x002f:
            r1 = 1
            r37 = 0
            if (r4 == 0) goto L_0x00a6
            X.4DU r3 = r3.A00
            boolean r0 = X.AnonymousClass3WX.A02(r4, r3)
            if (r0 == 0) goto L_0x0099
            java.lang.String r5 = r2.A0F
            r38 = 1
        L_0x0040:
            com.instagram.user.model.User r0 = r8.A0C
            if (r0 == 0) goto L_0x0048
            com.instagram.user.model.FollowStatus r15 = r0.B6o()
        L_0x0048:
            java.lang.String r4 = r8.A01()
            X.3QO r13 = X.AnonymousClass3QO.DEFAULT
            r17 = 0
            X.0qQ.A0B(r4, r1)
            boolean r0 = X.AnonymousClass7TF.A1V(r2)
            r36 = r0 ^ 1
            java.lang.String r10 = r8.A0L
            java.lang.String r7 = r8.A0I
            java.lang.String r3 = r8.A0M
            boolean r2 = r8.A0Q
            long r0 = r8.A03
            r11 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 / r11
            X.1iA r14 = r9.A03
            X.3WR r16 = r8.A00()
            X.4No r12 = new X.4No
            r23 = r17
            r24 = r17
            r25 = r17
            r26 = r17
            r27 = r17
            r28 = r17
            r29 = r17
            r30 = r17
            r31 = r17
            r32 = r17
            r33 = r17
            r34 = r0
            r39 = r2
            r40 = r6
            r21 = r5
            r22 = r3
            r19 = r10
            r20 = r7
            r18 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r36, r37, r38, r39, r40)
            return r12
        L_0x0099:
            boolean r0 = X.AnonymousClass3WX.A01(r4, r3)
            if (r0 == 0) goto L_0x00a8
            java.lang.String r5 = r2.A0L
            r38 = 0
            r37 = 1
            goto L_0x0040
        L_0x00a6:
            r5 = r15
            goto L_0x00b2
        L_0x00a8:
            java.lang.Boolean r0 = r2.A0A
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r1)
            if (r0 == 0) goto L_0x00a6
            java.lang.String r5 = r2.A0I
        L_0x00b2:
            r38 = 0
            goto L_0x0040
        L_0x00b5:
            r4 = r15
            goto L_0x002f
        L_0x00b8:
            r12 = 0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69220Nha.A07(java.lang.Object):X.4No");
    }

    public final Integer A08() {
        return AnonymousClass05K.A04;
    }
}
