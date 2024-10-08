package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Nhc  reason: case insensitive filesystem */
public final class C69222Nhc extends C252323ov {
    public String A00;
    public final UserSession A01;
    public final UserSession A02;
    public final AnonymousClass7GS A03;
    public final AnonymousClass7GR A04;

    public final /* bridge */ /* synthetic */ AnonymousClass4OR A05(Object obj) {
        AnonymousClass4OQ r3 = AnonymousClass4OQ.ORGANIC;
        0bb r2 = new 0bb();
        r2.A05("media_id", -1L);
        C66582MXn.A18(r3, r2, this);
        r2.A06("tracking_token", "-1");
        r2.A06("persistent_id", this.A04.A00());
        r2.A06("encrypted_logging_policy", "encrypted_only");
        return r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x016c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ X.C263974Ob A06(X.C263974Ob r11, java.lang.Object r12) {
        /*
            r10 = this;
            X.Pw0 r12 = (X.C74505Pw0) r12
            r5 = 0
            X.AnonymousClass7TF.A1H(r12, r11)
            super.A06(r11, r12)
            X.1Xj r2 = r12.BPf()
            r3 = 0
            if (r2 == 0) goto L_0x0037
            boolean r0 = r2.CeS()
            if (r0 != 0) goto L_0x0137
            boolean r0 = r2.A5A()
            if (r0 != 0) goto L_0x0137
            r1 = 0
        L_0x001d:
            boolean r0 = r2.A4p()
            java.lang.String r1 = X.C263984Oc.A01(r1, r5, r0)
            java.lang.String r0 = "video_format"
            r11.A06(r0, r1)
            X.1Xy r0 = r2.A0C
            java.lang.String r1 = r0.BIl()
            if (r1 == 0) goto L_0x0037
            java.lang.String r0 = "inventory_source"
            r11.A06(r0, r1)
        L_0x0037:
            java.lang.Boolean r0 = r12.CVY()
            if (r0 == 0) goto L_0x0041
            boolean r3 = r0.booleanValue()
        L_0x0041:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            java.lang.String r0 = "is_instamadillo"
            r11.A03(r0, r7)
            boolean r0 = r12.CeJ()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_vm"
            r11.A03(r0, r1)
            java.lang.Long r1 = r12.B24()
            java.lang.String r0 = "ephemeral_lifetime_ms"
            r11.A05(r0, r1)
            X.1iA r9 = r12.BR7()
            if (r9 == 0) goto L_0x0133
            java.lang.String r0 = X.OX6.A00(r9)
        L_0x006a:
            java.lang.String r4 = "media_type"
            r11.A06(r4, r0)
            java.lang.Integer r8 = r12.BQh()
            java.lang.String r0 = X.OX6.A02(r8)
            java.lang.String r3 = "media_product_type"
            r11.A06(r3, r0)
            java.lang.Integer r0 = r12.BIS()
            java.lang.String r1 = X.OX6.A01(r0)
            java.lang.String r0 = "interface_identifier"
            r11.A06(r0, r1)
            java.lang.String r1 = r12.BYR()
            java.lang.String r0 = "open_thread_id"
            r11.A06(r0, r1)
            X.3tH r6 = r12.C9i()
            if (r6 == 0) goto L_0x00ab
            boolean r0 = X.DbX.A1a(r7)
            java.lang.String r1 = "ig_advanced_crypto_transport"
            if (r0 != 0) goto L_0x00a6
            X.3tH r0 = X.C254923tH.DJANGO
            if (r6 != r0) goto L_0x0123
            java.lang.String r1 = "ig_django"
        L_0x00a6:
            java.lang.String r0 = "transport_type"
            r11.A06(r0, r1)
        L_0x00ab:
            if (r2 == 0) goto L_0x00dd
            boolean r0 = r2.CeS()
            if (r0 != 0) goto L_0x011e
            boolean r0 = r2.A5A()
            if (r0 != 0) goto L_0x011e
            r1 = 0
        L_0x00ba:
            boolean r0 = r2.A4p()
            java.lang.String r1 = X.C263984Oc.A01(r1, r5, r0)
            java.lang.String r0 = "video_format"
            r11.A06(r0, r1)
            X.1Xy r0 = r2.A0C
            java.lang.Float r0 = r0.Ani()
            if (r0 == 0) goto L_0x00dd
            float r0 = r0.floatValue()
            double r0 = (double) r0
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "unified_upload_mos_client_side"
            r11.A04(r0, r1)
        L_0x00dd:
            X.2FW r7 = r12.Ax7()
            if (r7 == 0) goto L_0x00fd
            X.EkU r0 = X.C48806EkU.$redex_init_class
            int r1 = r7.ordinal()
            r0 = 22
            if (r1 == r0) goto L_0x011b
            r0 = 23
            if (r1 == r0) goto L_0x011b
            r0 = 29
            if (r1 == r0) goto L_0x011b
            r0 = 46
            if (r1 == r0) goto L_0x0118
            r0 = 49
            if (r1 == r0) goto L_0x0118
        L_0x00fd:
            java.lang.String r5 = "unknown"
        L_0x00ff:
            java.lang.String r0 = X.OX6.A00(r9)
            java.lang.String r6 = "unknown"
            boolean r0 = X.0qQ.A0K(r0, r6)
            if (r0 == 0) goto L_0x015e
            java.lang.String r1 = r12.Bk2()
            boolean r0 = r5.equals(r6)
            if (r0 == 0) goto L_0x0159
            if (r1 == 0) goto L_0x0159
            goto L_0x013d
        L_0x0118:
            java.lang.String r5 = "reel"
            goto L_0x00ff
        L_0x011b:
            java.lang.String r5 = "story"
            goto L_0x00ff
        L_0x011e:
            X.3WR r1 = r2.CEL()
            goto L_0x00ba
        L_0x0123:
            X.3tH r0 = X.C254923tH.ACT
            if (r6 == r0) goto L_0x00a6
            X.3tH r0 = X.C254923tH.DJANGO_ACT_MIXED
            if (r6 != r0) goto L_0x012f
            java.lang.String r1 = "ig_django_msys_mixed"
            goto L_0x00a6
        L_0x012f:
            java.lang.String r1 = "ig_messenger_infra"
            goto L_0x00a6
        L_0x0133:
            java.lang.String r0 = "unknown"
            goto L_0x006a
        L_0x0137:
            X.3WR r1 = r2.CEL()
            goto L_0x001d
        L_0x013d:
            org.json.JSONObject r2 = X.C66580MXl.A17(r1)     // Catch:{ JSONException -> 0x0159 }
            int r1 = X.C66581MXm.A05(r2)     // Catch:{ JSONException -> 0x0159 }
            r0 = 1959039784(0x74c49328, float:1.245941E32)
            if (r1 == r0) goto L_0x0156
            int r1 = X.C66581MXm.A05(r2)     // Catch:{ JSONException -> 0x0159 }
            r0 = 221584371(0xd351bf3, float:5.5808574E-31)
            if (r1 != r0) goto L_0x0158
            java.lang.String r6 = "story"
            goto L_0x0158
        L_0x0156:
            java.lang.String r6 = "reel"
        L_0x0158:
            r5 = r6
        L_0x0159:
            if (r7 == 0) goto L_0x015e
            r11.A06(r4, r5)
        L_0x015e:
            java.lang.String r0 = "story"
            if (r5 != r0) goto L_0x016c
            java.lang.Integer r8 = X.AnonymousClass05K.A1I
        L_0x0164:
            java.lang.String r0 = X.OX6.A02(r8)
            r11.A06(r3, r0)
            return r11
        L_0x016c:
            java.lang.String r0 = "reel"
            if (r5 != r0) goto L_0x0164
            java.lang.Integer r8 = X.AnonymousClass05K.A15
            goto L_0x0164
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69222Nhc.A06(X.4Ob, java.lang.Object):X.4Ob");
    }

    public final /* bridge */ /* synthetic */ C263844No A07(Object obj) {
        String str;
        String str2;
        AnonymousClass3WR CEL;
        C74505Pw0 pw0 = (C74505Pw0) obj;
        0qQ.A0B(pw0, 0);
        1Xj BPf = pw0.BPf();
        FollowStatus followStatus = null;
        if (BPf == null || !A00(pw0)) {
            UserSession userSession = this.A03.A00;
            0Tu r2 = 0Tu.A05;
            if (182.A06(r2, userSession, 36320322219286824L) || 182.A06(r2, userSession, 36322070270846902L)) {
                return null;
            }
            return new C263844No(AnonymousClass3QO.DEFAULT, (1iA) null, (FollowStatus) null, (AnonymousClass3WR) null, (Boolean) null, "placeholder", (String) null, "placeholder", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 0, false, false, false, false, false);
        }
        AnonymousClass4DU r22 = this.A00;
        boolean z = true;
        boolean z2 = false;
        if (AnonymousClass3WX.A02(BPf, r22)) {
            str = C231122qu.A0F(this.A01, BPf);
            z = false;
            z2 = true;
        } else if (AnonymousClass3WX.A01(BPf, r22)) {
            str = BPf.A0C.getOrganicTrackingToken();
        } else {
            if (BPf.CUz()) {
                str = BPf.A0C.BGe();
            } else {
                str = null;
            }
            z = false;
        }
        UserSession userSession2 = this.A01;
        User A2A = BPf.A2A(userSession2);
        String id = BPf.getId();
        if (id != null) {
            AnonymousClass3QO A1t = BPf.A1t();
            0qQ.A0B(A1t, 2);
            String id2 = BPf.getId();
            if (A2A != null) {
                str2 = A2A.getId();
                followStatus = A2A.B6o();
            } else {
                str2 = null;
            }
            boolean A4Y = BPf.A4Y();
            long A1A = BPf.A1A();
            1iA BR7 = BPf.BR7();
            if (BPf.CeS() || BPf.A5A()) {
                CEL = BPf.CEL();
            } else {
                CEL = null;
            }
            return new C263844No(A1t, BR7, followStatus, CEL, (Boolean) null, id, (String) null, id2, str, str2, BPf.A2b(), (String) null, (String) null, (String) null, BPf.A0C.BIl(), (String) null, (String) null, (String) null, C231122qu.A0H(userSession2, BPf.getId()), (String) null, (List) null, A1A, false, z, z2, A4Y, BPf.A4p());
        }
        throw AnonymousClass7TE.A0y();
    }

    public final Integer A08() {
        return AnonymousClass05K.A04;
    }

    public final String A09() {
        String str = this.A00;
        if (str == null) {
            return this.A01;
        }
        return str;
    }

    public final /* bridge */ /* synthetic */ boolean A0B(Object obj) {
        C74505Pw0 pw0 = (C74505Pw0) obj;
        0qQ.A0B(pw0, 0);
        if (!A00(pw0)) {
            return false;
        }
        if (!182.A06(0Tu.A05, this.A03.A00, 36319579191254523L)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69222Nhc(UserSession userSession, AnonymousClass7GR r3, AnonymousClass4DU r4, String str) {
        super(r4, str);
        C51972G9s.A1C(r4, r3);
        AnonymousClass7GS r0 = new AnonymousClass7GS(userSession);
        this.A01 = userSession;
        this.A03 = r0;
        this.A02 = userSession;
        this.A04 = r3;
    }

    public static final boolean A00(C74505Pw0 pw0) {
        int intValue = pw0.BQh().intValue();
        if (!(intValue == 7 || intValue == 8 || intValue == 9 || intValue == 4)) {
            1Xj BPf = pw0.BPf();
            if (BPf == null) {
                return false;
            }
            if (BPf.A5G() || BPf.A5v() || BPf.A0C.C5R() != null) {
                return true;
            }
            return false;
        }
        return true;
    }
}
