package X;

/* renamed from: X.Iwa  reason: case insensitive filesystem */
public final class C58727Iwa extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58727Iwa(Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0330, code lost:
        r2.invoke(r1, X.C51965G9l.A0M(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x068b, code lost:
        X.04a.A01(r1, (X.04T) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0746, code lost:
        r4.AAJ(r0, r7);
        X.C51969G9p.A1D(r4, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x07db, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00bc, code lost:
        if (X.AnonymousClass7TF.A0R(X.0Tu.A05, r5.A0E, 36316662907540027L).booleanValue() != false) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0115, code lost:
        if (r1.A07 != false) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x06dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r31) {
        /*
            r30 = this;
            r5 = r30
            r12 = r31
            int r0 = r5.A00
            switch(r0) {
                case 1: goto L_0x0771;
                case 2: goto L_0x07c7;
                case 3: goto L_0x074e;
                case 4: goto L_0x0691;
                case 5: goto L_0x0683;
                case 6: goto L_0x0677;
                case 7: goto L_0x0667;
                case 8: goto L_0x064d;
                case 9: goto L_0x0643;
                case 10: goto L_0x063a;
                case 11: goto L_0x0677;
                case 12: goto L_0x0667;
                case 13: goto L_0x07b6;
                case 14: goto L_0x05c7;
                case 15: goto L_0x05be;
                case 16: goto L_0x056a;
                case 17: goto L_0x0547;
                case 18: goto L_0x0537;
                case 19: goto L_0x0009;
                case 20: goto L_0x0434;
                case 21: goto L_0x042a;
                case 22: goto L_0x0009;
                case 23: goto L_0x041e;
                case 24: goto L_0x0408;
                case 25: goto L_0x0408;
                case 26: goto L_0x078f;
                case 27: goto L_0x03d4;
                case 28: goto L_0x077e;
                case 29: goto L_0x0339;
                case 30: goto L_0x0326;
                case 31: goto L_0x031b;
                case 32: goto L_0x0310;
                case 33: goto L_0x0305;
                case 34: goto L_0x02fa;
                case 35: goto L_0x0297;
                case 36: goto L_0x0253;
                case 37: goto L_0x023b;
                case 38: goto L_0x0226;
                case 39: goto L_0x0211;
                case 40: goto L_0x0202;
                case 41: goto L_0x01c7;
                case 42: goto L_0x011d;
                case 43: goto L_0x0106;
                case 44: goto L_0x0095;
                case 45: goto L_0x008c;
                case 46: goto L_0x0071;
                case 47: goto L_0x0062;
                case 48: goto L_0x0062;
                case 49: goto L_0x0013;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r5.A01
            X.2Wa r0 = (X.2Wa) r0
            r0.A01(r12)
        L_0x0010:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x0013:
            java.lang.String r6 = X.C41847B3o.A1E(r12)
            java.lang.Object r4 = r5.A01
            X.JW8 r4 = (X.JW8) r4
            X.JWM r0 = r4.A0F
            X.2Fk r0 = r0.A0K
            java.lang.Object r2 = r0.A02()
            X.Lzo r2 = (X.C65796Lzo) r2
            X.8gT r3 = r4.A0J
            X.0Ud r0 = r3.A05
            java.lang.Object r1 = r0.getValue()
            java.util.Map r1 = (java.util.Map) r1
            if (r2 == 0) goto L_0x0010
            java.lang.String r2 = r2.A01
            r0 = 1
            X.0qQ.A0B(r1, r0)
            java.lang.Object r0 = r1.get(r2)
            X.8gX r0 = (X.C361628gX) r0
            if (r0 == 0) goto L_0x0060
            java.lang.String r0 = r0.A01
        L_0x0041:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0010
            java.lang.Object r0 = r1.get(r2)
            X.8gX r0 = (X.C361628gX) r0
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x0010
            r0 = 48
            X.Iwa r1 = new X.Iwa
            r1.<init>(r4, r0)
            java.lang.String r0 = "posts"
            r3.A05(r2, r0, r1)
            goto L_0x0010
        L_0x0060:
            r0 = 0
            goto L_0x0041
        L_0x0062:
            java.lang.Object r0 = r5.A01
            X.JW8 r0 = (X.JW8) r0
            android.content.Context r2 = r0.A09
            r1 = 2131962945(0x7f132c41, float:1.956263E38)
            java.lang.String r0 = "gallery_meta_gallery_failed_to_fetch_media"
            X.C59689JTv.A0F(r2, r0, r1)
            goto L_0x0010
        L_0x0071:
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r5 = r5.A01
            X.JW8 r5 = (X.JW8) r5
            if (r12 == 0) goto L_0x00be
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x00be
            android.content.Context r4 = r5.A09
            com.instagram.common.session.UserSession r3 = r5.A0E
            X.4DH r2 = r5.A0D
            r1 = 0
            java.lang.String r0 = "posts"
            X.C48788EkB.A00(r4, r2, r3, r0, r1)
            goto L_0x00be
        L_0x008c:
            java.lang.Object r0 = r5.A01
            X.JW8 r0 = (X.JW8) r0
            r0.A0E()
            goto L_0x0010
        L_0x0095:
            X.Lzo r12 = (X.C65796Lzo) r12
            java.lang.Object r5 = r5.A01
            X.JW8 r5 = (X.JW8) r5
            X.JWM r4 = r5.A0F
            if (r12 != 0) goto L_0x00d0
            r0 = 0
            r4.A09 = r0
            r4.A07()
            boolean r0 = X.JW8.A07(r5)
            if (r0 == 0) goto L_0x00c3
            com.instagram.common.session.UserSession r3 = r5.A0E
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316662907540027(0x8105d00008123b, double:3.030142085967611E-306)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r2, r3, r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00c3
        L_0x00be:
            X.JW8.A03(r5)
            goto L_0x0010
        L_0x00c3:
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.lang.String r1 = ""
            X.JXO r0 = X.JXO.A00
            r4.A09(r1, r2, r0)
            goto L_0x0010
        L_0x00d0:
            X.2Fk r0 = r4.A0M
            java.lang.Object r0 = r0.A02()
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x00e0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00f0
        L_0x00e0:
            X.8gT r3 = r5.A0J
            java.lang.String r2 = r12.A01
            r0 = 47
            X.Iwa r1 = new X.Iwa
            r1.<init>(r5, r0)
            java.lang.String r0 = "posts"
            r3.A05(r2, r0, r1)
        L_0x00f0:
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            r1 = 0
            java.lang.String r0 = ""
            r4.Ecr(r1, r0, r2)
            boolean r0 = r4.A07
            r0 = r0 ^ 1
            X.JW8.A04(r5, r0)
            r5.A0J(r12)
            goto L_0x0010
        L_0x0106:
            java.lang.Object r2 = r5.A01
            X.JW8 r2 = (X.JW8) r2
            X.JWM r1 = r2.A0F
            com.instagram.common.gallery.model.GalleryItem r0 = r1.A06()
            if (r0 != 0) goto L_0x0117
            boolean r1 = r1.A07
            r0 = 1
            if (r1 == 0) goto L_0x0118
        L_0x0117:
            r0 = 0
        L_0x0118:
            X.JW8.A04(r2, r0)
            goto L_0x0010
        L_0x011d:
            X.JwH r12 = (X.C61079JwH) r12
            java.lang.Object r1 = r12.A00
            X.Klm r1 = (X.C62748Klm) r1
            boolean r0 = r1 instanceof X.KKJ
            if (r0 == 0) goto L_0x0179
            java.lang.Object r5 = r5.A01
            X.KKN r5 = (X.KKN) r5
            X.KKN.A00(r5)
        L_0x012e:
            X.HmD r3 = r5.A00
            if (r3 == 0) goto L_0x0010
            X.7Pu r2 = r3.A02
            java.lang.String r0 = r12.A02
            r2.A0M(r0)
            java.lang.Object r0 = r12.A01
            int r1 = X.AnonymousClass7TE.A0M(r0)
            r8 = 0
            if (r1 == r8) goto L_0x016a
            r0 = 1
            if (r1 != r0) goto L_0x07dc
            r5 = 0
            android.content.Context r1 = r3.A00
            r0 = 2131954407(0x7f130ae7, float:1.9545312E38)
            java.lang.CharSequence r6 = r1.getText(r0)
            java.lang.String r7 = ""
            X.7Ps r4 = new X.7Ps
            r9 = r8
            r4.<init>(r5, r6, r7, r8, r9)
        L_0x0157:
            r1 = 23
            X.ICx r0 = new X.ICx
            r0.<init>(r3, r1)
            r4.A05 = r0
            X.7Pt r1 = r4.A00()
            r0 = 1
            r2.A0J(r1, r0)
            goto L_0x0010
        L_0x016a:
            r10 = 0
            r13 = 2131238082(0x7f081cc2, float:1.8092433E38)
            java.lang.String r12 = ""
            X.7Ps r4 = new X.7Ps
            r9 = r4
            r11 = r10
            r14 = r8
            r9.<init>(r10, r11, r12, r13, r14)
            goto L_0x0157
        L_0x0179:
            boolean r0 = r1 instanceof X.KKI
            if (r0 == 0) goto L_0x07e1
            java.lang.Object r5 = r5.A01
            X.KKN r5 = (X.KKN) r5
            X.KKI r1 = (X.KKI) r1
            int r3 = r1.A00
            X.KKO r0 = r5.A03
            if (r0 != 0) goto L_0x012e
            X.0eM r0 = r5.A01
            X.0lg r2 = X.DbT.A0X(r0)
            r4 = 0
            android.os.Bundle r1 = X.DbV.A0B(r2, r4)
            r0 = 2631(0xa47, float:3.687E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.putInt(r0, r3)
            X.AnonymousClass0Dg.A00(r1, r2)
            X.KKO r3 = new X.KKO
            r3.<init>()
            r3.setArguments(r1)
            X.2k4 r0 = r5.dayNightMode
            r3.setDayNightMode(r0)
            X.0s1 r2 = X.DbW.A0C(r5)
            r1 = 2130772102(0x7f010086, float:1.7147313E38)
            r0 = 2130772103(0x7f010087, float:1.7147315E38)
            r2.A07(r1, r0, r4, r4)
            r0 = 2131427968(0x7f0b0280, float:1.8477567E38)
            r2.A09(r3, r0)
            r2.A00()
            r5.A03 = r3
            goto L_0x012e
        L_0x01c7:
            java.util.List r12 = (java.util.List) r12
            X.0qQ.A0A(r12)
            boolean r0 = X.AnonymousClass7TE.A1b(r12)
            if (r0 == 0) goto L_0x0010
            java.lang.Object r0 = r5.A01
            X.KKM r0 = (X.KKM) r0
            X.JlC r4 = r0.A01
            if (r4 != 0) goto L_0x01e4
            java.lang.String r0 = "rowsAdapter"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01e4:
            java.util.ArrayList r3 = r4.A04
            X.JF4 r2 = X.JF4.A00
            X.JF5 r1 = X.JF5.A00
            r0 = 0
            X.DbZ.A0t(r0, r3, r2, r1)
            X.0mN r0 = new X.0mN
            r0.<init>(r3, r12, r2, r1)
            X.2ta r0 = X.C232332tX.A00(r0)
            r3.clear()
            r3.addAll(r12)
            r0.A03(r4)
            goto L_0x0010
        L_0x0202:
            java.lang.Object r0 = r5.A01
            X.LeU r0 = (X.C64586LeU) r0
            X.2gB r1 = r0.A02
            java.util.ArrayList r0 = r0.A02()
            r1.A0B(r0)
            goto L_0x0010
        L_0x0211:
            java.lang.Object r1 = r5.A01
            X.JWc r1 = (X.JWc) r1
            X.2Fj r0 = r1.A01
            java.lang.Object r0 = r0.A02()
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x0221
            X.0sn r0 = X.0sn.A00
        L_0x0221:
            r1.A0B(r0)
            goto L_0x0010
        L_0x0226:
            X.OID r12 = (X.OID) r12
            r0 = 0
            X.0qQ.A0B(r12, r0)
            java.lang.Object r0 = r5.A01
            android.content.Context r1 = X.DbT.A08(r0)
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
            r0.<init>(r1)
            r12.A01 = r0
            goto L_0x0010
        L_0x023b:
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r0 = r5.A01
            X.Lkz r0 = (X.C64960Lkz) r0
            X.Jkg r1 = r0.A02
            if (r1 == 0) goto L_0x0010
            X.0qQ.A0A(r12)
            r0 = 0
            X.0qQ.A0B(r12, r0)
            r1.A00 = r12
            r1.notifyDataSetChanged()
            goto L_0x0010
        L_0x0253:
            java.lang.String r3 = X.C41847B3o.A1E(r12)
            java.lang.Object r0 = r5.A01
            X.8N2 r0 = (X.AnonymousClass8N2) r0
            X.05G r4 = r0.A0H
        L_0x025d:
            java.lang.Object r5 = r4.getValue()
            r7 = r5
            X.8N5 r7 = (X.AnonymousClass8N5) r7
            X.JvT r0 = r7.A03
            if (r0 == 0) goto L_0x0295
            java.lang.String r6 = r0.A04
            int r2 = r0.A02
            int r1 = r0.A01
            java.lang.Object r0 = r0.A03
            java.util.List r0 = (java.util.List) r0
            X.JvT r11 = X.C61029JvT.A00(r3, r6, r0, r2, r1)
        L_0x0276:
            android.graphics.Bitmap r8 = r7.A02
            android.graphics.Bitmap r9 = r7.A00
            float[] r14 = r7.A08
            android.graphics.Bitmap r10 = r7.A01
            java.lang.Integer r13 = r7.A05
            boolean r15 = r7.A07
            boolean r0 = r7.A06
            X.8N6 r12 = r7.A04
            X.8N5 r7 = new X.8N5
            r16 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = r4.AIY(r5, r7)
            if (r0 == 0) goto L_0x025d
            goto L_0x0010
        L_0x0295:
            r11 = 0
            goto L_0x0276
        L_0x0297:
            X.5dM r12 = (X.C289295dM) r12
            long r1 = r12.A00
            java.lang.Object r7 = r5.A01
            X.GhT r7 = (X.C53037GhT) r7
            X.05G r6 = r7.A00
        L_0x02a1:
            java.lang.Object r8 = r6.getValue()
            r5 = r8
            X.5VN r5 = (X.AnonymousClass5VN) r5
            float r0 = r5.A01
            float r9 = -r0
            X.0Ud r11 = r7.A05
            java.lang.Object r0 = r11.getValue()
            X.5bF r0 = (X.C288025bF) r0
            long r3 = r0.A00
            float r12 = X.C288025bF.A02(r3)
            float r0 = r5.A02
            float r12 = r12 - r0
            float r0 = r5.A03
            float r10 = -r0
            java.lang.Object r0 = r11.getValue()
            X.5bF r0 = (X.C288025bF) r0
            long r3 = r0.A00
            float r11 = X.C288025bF.A00(r3)
            float r0 = r5.A00
            float r11 = r11 - r0
            float r4 = X.C289295dM.A01(r1)
            float r3 = X.C289295dM.A02(r1)
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x02e0
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            r9 = r4
            if (r0 <= 0) goto L_0x02e0
            r9 = r12
        L_0x02e0:
            int r0 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x02ea
            int r0 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            r10 = r3
            if (r0 <= 0) goto L_0x02ea
            r10 = r11
        L_0x02ea:
            long r3 = X.C289325dP.A00(r9, r10)
            X.5VN r0 = r5.A03(r3)
            boolean r0 = r6.AIY(r8, r0)
            if (r0 == 0) goto L_0x02a1
            goto L_0x0010
        L_0x02fa:
            X.5dM r12 = (X.C289295dM) r12
            long r1 = r12.A00
            java.lang.Object r0 = r5.A01
            X.C51971G9r.A1N(r0, r1)
            goto L_0x0010
        L_0x0305:
            X.5dM r12 = (X.C289295dM) r12
            long r3 = r12.A00
            java.lang.Object r2 = r5.A01
            X.0sL r2 = (X.0sL) r2
            X.HLo r1 = X.C54631HLo.RIGHT
            goto L_0x0330
        L_0x0310:
            X.5dM r12 = (X.C289295dM) r12
            long r3 = r12.A00
            java.lang.Object r2 = r5.A01
            X.0sL r2 = (X.0sL) r2
            X.HLo r1 = X.C54631HLo.LEFT
            goto L_0x0330
        L_0x031b:
            X.5dM r12 = (X.C289295dM) r12
            long r3 = r12.A00
            java.lang.Object r2 = r5.A01
            X.0sL r2 = (X.0sL) r2
            X.HLo r1 = X.C54631HLo.BOTTOM
            goto L_0x0330
        L_0x0326:
            X.5dM r12 = (X.C289295dM) r12
            long r3 = r12.A00
            java.lang.Object r2 = r5.A01
            X.0sL r2 = (X.0sL) r2
            X.HLo r1 = X.C54631HLo.TOP
        L_0x0330:
            X.5dM r0 = X.C51965G9l.A0M(r3)
            r2.invoke(r1, r0)
            goto L_0x0010
        L_0x0339:
            X.5Q4 r12 = (X.AnonymousClass5Q4) r12
            X.C51970G9q.A15(r12)
            r0 = 0
            r2 = 1048576000(0x3e800000, float:0.25)
            X.5Rb r1 = X.AnonymousClass5RX.A0G
            long r17 = X.C285595Rx.A02(r1, r0, r0, r0, r2)
            java.lang.Object r1 = r5.A01
            X.5VN r1 = (X.AnonymousClass5VN) r1
            long r19 = X.C289325dP.A00(r0, r0)
            float r5 = X.C51969G9p.A00(r12)
            float r2 = r1.A01
            float r7 = r1.A03
            long r3 = X.C289325dP.A00(r2, r7)
            float r3 = X.C289295dM.A02(r3)
            long r21 = X.C288015bE.A00(r5, r3)
            r13 = 0
            r15 = 1065353216(0x3f800000, float:1.0)
            X.5dw r14 = X.C289635dw.A00
            r16 = 3
            r23 = 3
            r12.AQs(r13, r14, r15, r16, r17, r19, r21)
            float r4 = r1.A00
            long r10 = X.C289325dP.A00(r2, r4)
            float r2 = X.C289295dM.A02(r10)
            long r26 = X.C289325dP.A00(r0, r2)
            long r8 = r12.Bwg()
            float r6 = X.C288025bF.A02(r8)
            float r5 = X.C288025bF.A00(r8)
            float r5 = r5 - r2
            long r28 = X.C288015bE.A00(r6, r5)
            r19 = r12
            r20 = r13
            r21 = r14
            r22 = r15
            r24 = r17
            r19.AQs(r20, r21, r22, r23, r24, r26, r28)
            long r26 = X.C289325dP.A00(r0, r3)
            float r0 = X.C289295dM.A01(r10)
            float r2 = r2 - r3
            long r28 = X.C288015bE.A00(r0, r2)
            r19.AQs(r20, r21, r22, r23, r24, r26, r28)
            float r1 = r1.A02
            long r2 = X.C289325dP.A00(r1, r7)
            float r0 = X.C289295dM.A01(r2)
            float r3 = X.C289295dM.A02(r2)
            long r26 = X.C289325dP.A00(r0, r3)
            float r2 = X.C51969G9p.A00(r12)
            float r2 = r2 - r0
            long r0 = X.C289325dP.A00(r1, r4)
            float r0 = X.C289295dM.A02(r0)
            float r0 = r0 - r3
            long r28 = X.C288015bE.A00(r2, r0)
            r19.AQs(r20, r21, r22, r23, r24, r26, r28)
            goto L_0x0010
        L_0x03d4:
            r0 = 0
            X.0qQ.A0B(r12, r0)
            java.lang.Object r0 = r5.A01
            X.Ll4 r0 = (X.C64965Ll4) r0
            X.8N2 r13 = r0.A0S
            X.0Ud r0 = r13.A0I
            java.lang.Object r0 = r0.getValue()
            X.8N5 r0 = (X.AnonymousClass8N5) r0
            java.lang.Integer r1 = r0.A05
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 == r0) goto L_0x03f0
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            if (r1 != r0) goto L_0x0010
        L_0x03f0:
            X.LGc r14 = r13.A00
            if (r14 == 0) goto L_0x0010
            X.6oS r0 = X.C318116oQ.A00(r13)
            r15 = 0
            r16 = 45
            X.MH4 r11 = new X.MH4
            r11.<init>(r12, r13, r14, r15, r16)
            X.1Er r0 = X.C51966G9m.A1L(r11, r0)
            r13.A01 = r0
            goto L_0x0010
        L_0x0408:
            android.graphics.Bitmap r12 = (android.graphics.Bitmap) r12
            java.lang.Object r0 = r5.A01
            X.3kE r0 = (X.C249703kE) r0
            android.view.View r2 = r0.itemView
            android.content.res.Resources r1 = r2.getResources()
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            r0.<init>(r1, r12)
            r2.setBackground(r0)
            goto L_0x0010
        L_0x041e:
            int r1 = X.AnonymousClass7TE.A0M(r12)
            java.lang.Object r0 = r5.A01
            X.Lk8 r0 = (X.C64908Lk8) r0
            r0.A00 = r1
            goto L_0x0010
        L_0x042a:
            java.lang.Object r1 = r5.A01
            android.os.Handler r1 = (android.os.Handler) r1
            r0 = 0
            r1.removeCallbacksAndMessages(r0)
            goto L_0x0010
        L_0x0434:
            java.lang.Object r0 = r5.A01
            X.GOK r0 = (X.GOK) r0
            com.instagram.common.session.UserSession r12 = r0.A04
            com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState r13 = r0.A07
            X.4GS r2 = r0.A05
            r3 = 0
            boolean r6 = X.AnonymousClass7TF.A1U(r3, r12, r13)
            java.lang.Integer r4 = r13.A0A
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r4 == r0) goto L_0x0010
            java.lang.Integer r1 = r13.A08
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 != r0) goto L_0x049b
            java.lang.String r9 = r13.A0C
            java.lang.String r8 = r13.A0D
            java.lang.String r7 = r13.A0I
            java.lang.String r5 = r13.A0F
            r4 = 0
            if (r2 == 0) goto L_0x0499
            java.lang.String r4 = r2.All()
            java.lang.Integer r3 = r2.Als()
        L_0x0462:
            int r2 = r13.A01
            X.AnonymousClass7TF.A1D(r9, r6, r5)
            X.0wc r1 = X.AnonymousClass0kN.A02(r12)
            java.lang.String r0 = "instagram_media_note_recs_nux_impression_client"
            X.0Aj r6 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r6.isSampled()
            if (r0 == 0) goto L_0x0010
            X.C51965G9l.A1J(r6, r5)
            X.C51971G9r.A1A(r6, r9, r8)
            java.lang.Long r0 = X.DbZ.A0c(r3)
            X.C51965G9l.A1G(r6, r0)
            java.lang.String r0 = "carousel_media_id"
            X.C51973G9u.A14(r6, r0, r4)
            java.lang.String r0 = "ranking_info_token"
            java.lang.Long r1 = X.DbV.A0p(r6, r0, r7, r2)
            java.lang.String r0 = "media_client_position"
            r6.A9F(r0, r1)
        L_0x0494:
            r6.Cgf()
            goto L_0x0010
        L_0x0499:
            r3 = r4
            goto L_0x0462
        L_0x049b:
            r0 = 6
            X.MMC r1 = new X.MMC
            r1.<init>(r12, r0)
            java.lang.Class<X.GPc> r0 = X.C52357GPc.class
            java.lang.Object r0 = r12.A01(r0, r1)
            X.GPc r0 = (X.C52357GPc) r0
            java.lang.String r11 = r13.A0H
            X.0qQ.A0B(r11, r3)
            java.util.Set r1 = r0.A00
            boolean r0 = r1.contains(r11)
            if (r0 == 0) goto L_0x04ca
            r10 = 1
        L_0x04b7:
            int r1 = r4.intValue()
            if (r1 == r3) goto L_0x04d2
            if (r1 == r6) goto L_0x04cf
            r0 = 2
            if (r1 == r0) goto L_0x0010
            r0 = 3
            if (r1 == r0) goto L_0x0010
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x04ca:
            r1.add(r11)
            r10 = 0
            goto L_0x04b7
        L_0x04cf:
            X.GPK r9 = X.GPK.OVERFLOW_SHEET
            goto L_0x04d4
        L_0x04d2:
            X.GPK r9 = X.GPK.MEDIA_OVERLAY
        L_0x04d4:
            java.lang.String r8 = r13.A0C
            java.lang.String r7 = r13.A0D
            java.lang.String r5 = r13.A0I
            r4 = 0
            if (r2 == 0) goto L_0x0535
            java.lang.String r3 = r2.All()
            java.lang.Integer r4 = r2.Als()
        L_0x04e5:
            int r2 = r13.A01
            X.0qQ.A0B(r8, r6)
            boolean r0 = X.00l.A0W(r11)
            if (r0 != 0) goto L_0x0010
            X.0wc r1 = X.AnonymousClass0kN.A02(r12)
            java.lang.String r0 = "instagram_media_note_impression_client"
            X.0Aj r6 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.Long r1 = X.GPJ.A00(r12, r11)
            boolean r0 = r6.isSampled()
            if (r0 == 0) goto L_0x0010
            if (r1 == 0) goto L_0x0010
            java.lang.String r0 = "note_id"
            r6.A9F(r0, r1)
            java.lang.String r0 = "event_source"
            r6.A8M(r9, r0)
            X.C51971G9r.A1A(r6, r8, r7)
            java.lang.Long r0 = X.DbZ.A0c(r4)
            X.C51965G9l.A1G(r6, r0)
            java.lang.String r0 = "carousel_media_id"
            X.C51973G9u.A14(r6, r0, r3)
            java.lang.String r0 = "ranking_info_token"
            java.lang.Long r1 = X.DbV.A0p(r6, r0, r5, r2)
            java.lang.String r0 = "media_client_position"
            r6.A9F(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)
            java.lang.String r0 = "is_subimpression"
            r6.A7p(r0, r1)
            goto L_0x0494
        L_0x0535:
            r3 = r4
            goto L_0x04e5
        L_0x0537:
            float r2 = X.AnonymousClass7TE.A04(r12)
            java.lang.Object r1 = r5.A01
            X.2V5 r1 = (X.2V5) r1
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r2
            X.C51967G9n.A19(r1, r0)
            goto L_0x0010
        L_0x0547:
            X.JQD r12 = (X.JQD) r12
            r0 = 0
            X.0qQ.A0B(r12, r0)
            boolean r0 = r12 instanceof X.C54692HOx
            if (r0 == 0) goto L_0x0010
            java.lang.Object r0 = r5.A01
            X.GOK r0 = (X.GOK) r0
            X.33B r9 = r0.A0A
            X.4DU r10 = r0.A0C
            X.HOx r12 = (X.C54692HOx) r12
            com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState r13 = r0.A07
            X.4GS r11 = r0.A05
            X.GgT r0 = r0.A06
            boolean r14 = X.AnonymousClass7TF.A1V(r0)
            r9.DPF(r10, r11, r12, r13, r14)
            goto L_0x0010
        L_0x056a:
            java.lang.Object r2 = r5.A01
            X.GwL r2 = (X.C53915GwL) r2
            com.instagram.common.session.UserSession r1 = r2.A01
            X.4DU r0 = r2.A05
            java.lang.String r7 = r0.getModuleName()
            X.Gmw r0 = r2.A00
            java.lang.String r6 = r0.A05
            java.lang.String r8 = r0.A07
            java.lang.String r5 = r0.A06
            X.4GS r0 = r2.A02
            r3 = 0
            if (r0 == 0) goto L_0x05bc
            java.lang.String r3 = r0.All()
            java.lang.Integer r2 = r0.Als()
        L_0x058b:
            X.AnonymousClass7TG.A1N(r1, r7)
            r0 = 4
            X.0qQ.A0B(r5, r0)
            X.0wc r1 = X.AnonymousClass0kN.A02(r1)
            java.lang.String r0 = "instagram_media_note_overflow_pog_impression_client"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x0010
            X.C51965G9l.A1J(r4, r5)
            X.C51971G9r.A1A(r4, r7, r6)
            java.lang.Long r0 = X.DbZ.A0c(r2)
            X.C51965G9l.A1G(r4, r0)
            java.lang.String r0 = "carousel_media_id"
            r4.AAJ(r0, r3)
            java.lang.String r7 = X.DbS.A0k()
            java.lang.String r0 = "nav_chain"
            goto L_0x0746
        L_0x05bc:
            r2 = r3
            goto L_0x058b
        L_0x05be:
            java.lang.Object r1 = r5.A01
            X.E68 r1 = (X.E68) r1
            r0 = 0
            r1.A00 = r0
            goto L_0x0010
        L_0x05c7:
            X.2WA r4 = X.G9w.A0R(r12)
            java.lang.Object r1 = r5.A01
            X.Gx1 r1 = (X.C53957Gx1) r1
            com.instagram.common.session.UserSession r6 = r1.A00
            X.0Tu r0 = X.0Tu.A05
            r2 = 36326129015993887(0x810e6c0010361f, double:3.0361284910707916E-306)
            boolean r0 = X.182.A06(r0, r6, r2)
            if (r0 == 0) goto L_0x05f2
            X.33C r2 = r1.A02
            java.lang.ref.WeakReference r6 = r1.A05
            X.3gI r0 = r1.A03
            r5 = 0
            X.1Xj r4 = r0.A01
            X.3fc r3 = r0.A00
            X.0sa r7 = r1.A06
            X.0sP r8 = r1.A07
            r2.DUq(r3, r4, r5, r6, r7, r8)
            goto L_0x0010
        L_0x05f2:
            android.view.View r0 = r4.A00
            X.0qQ.A06(r0)
            X.3gI r2 = r1.A03
            X.IPz r7 = new X.IPz
            r7.<init>(r1)
            java.lang.ref.WeakReference r0 = r1.A05
            java.lang.Object r4 = r0.get()
            boolean r0 = r4 instanceof androidx.fragment.app.FragmentActivity
            if (r0 == 0) goto L_0x0010
            androidx.fragment.app.FragmentActivity r4 = (androidx.fragment.app.FragmentActivity) r4
            if (r4 == 0) goto L_0x0010
            X.3gF r0 = X.C247323g9.A00(r6)
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x061b
            r7.DZJ()
            goto L_0x0010
        L_0x061b:
            X.F1J r3 = X.E68.A08
            X.1Xj r0 = r2.A01
            java.lang.String r8 = X.C51970G9q.A0j(r0)
            X.4DU r0 = r1.A04
            java.lang.String r9 = r0.getModuleName()
            X.GPK r5 = X.GPK.NEW_TOOLTIP
            X.3fc r1 = r2.A00
            X.3fc r0 = X.C247003fc.COMMENT_BUTTON
            boolean r11 = X.AnonymousClass7TF.A1W(r1, r0)
            r10 = 0
            r12 = 1
            r3.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0010
        L_0x063a:
            java.lang.Object r0 = r5.A01
            X.L7i r0 = (X.C63802L7i) r0
            X.LAt r0 = r0.A02
            android.view.View r1 = r0.A02
            goto L_0x068b
        L_0x0643:
            java.lang.Object r1 = r5.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 0
            X.AnonymousClass03j.A00(r1, r0)
            goto L_0x0010
        L_0x064d:
            int r1 = X.AnonymousClass7TE.A0M(r12)
            java.lang.Object r0 = r5.A01
            X.K4d r0 = (X.C61361K4d) r0
            X.Jix r0 = X.C61361K4d.A00(r0)
            X.0eM r0 = r0.A07
            java.lang.Object r0 = r0.getValue()
            X.Kzx r0 = (X.C63609Kzx) r0
            X.LAb r0 = r0.A00
            r0.A00 = r1
            goto L_0x0010
        L_0x0667:
            java.lang.Object r1 = r5.A01
            X.1IX r1 = (X.1IX) r1
            boolean r0 = r1.isActive()
            if (r0 == 0) goto L_0x0010
            r0 = 0
            r1.resumeWith(r0)
            goto L_0x0010
        L_0x0677:
            java.lang.Object r0 = r5.A01
            android.animation.ValueAnimator r0 = (android.animation.ValueAnimator) r0
            r0.removeAllUpdateListeners()
            r0.removeAllListeners()
            goto L_0x0010
        L_0x0683:
            java.lang.Object r0 = r5.A01
            X.L64 r0 = (X.L64) r0
            X.OI6 r0 = r0.A01
            android.view.View r1 = r0.A03
        L_0x068b:
            r0 = 0
            X.04a.A01(r1, r0)
            goto L_0x0010
        L_0x0691:
            java.lang.Object r7 = r5.A01
            X.Gsb r7 = (X.C53684Gsb) r7
            com.instagram.common.session.UserSession r5 = r7.A00
            java.lang.Integer r1 = r7.A02
            r6 = 0
            boolean r0 = X.AnonymousClass7TF.A1U(r6, r5, r1)
            X.3gC r8 = X.C247333gA.A00(r5)
            int r4 = r1.intValue()
            if (r4 == r0) goto L_0x06f7
            r0 = 2
            if (r4 != r0) goto L_0x06d7
            X.0eM r3 = r8.A07
            X.0xa r2 = X.C51968G9o.A0o(r3)
            java.lang.String r1 = "content_note_tap_to_reply_nux_shown_count"
            int r0 = r2.getInt(r1, r6)
            int r0 = r0 + 1
            X.AnonymousClass7TG.A1M(r2, r1, r0)
            java.lang.Object r1 = r3.getValue()
            X.1Av r1 = (X.1Av) r1
            X.0eM r0 = r8.A06
            r0.getValue()
            long r2 = java.lang.System.currentTimeMillis()
            X.0xY r1 = X.AnonymousClass7TE.A0p(r1)
            java.lang.String r0 = "content_note_tap_to_reply_nux_last_shown_timestamp"
        L_0x06d1:
            r1.E5c(r0, r2)
            r1.apply()
        L_0x06d7:
            com.instagram.contentnotes.data.metadata.ContentNoteMetadata r0 = r7.A01
            java.lang.String r9 = r0.A09
            if (r9 == 0) goto L_0x0010
            java.lang.String r3 = r0.A04
            java.lang.String r7 = r0.A06
            java.lang.String r8 = r0.A0A
            r2 = 1
            X.0qQ.A0B(r3, r2)
            X.0wc r1 = X.AnonymousClass0kN.A02(r5)
            r0 = 2
            if (r4 == r0) goto L_0x071e
            if (r4 == r2) goto L_0x0721
            if (r4 == r6) goto L_0x0010
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x06f7:
            X.0eM r3 = r8.A07
            X.0xa r2 = X.C51968G9o.A0o(r3)
            java.lang.String r1 = "content_note_double_tap_to_like_nux_shown_count"
            int r0 = r2.getInt(r1, r6)
            int r0 = r0 + 1
            X.AnonymousClass7TG.A1M(r2, r1, r0)
            java.lang.Object r1 = r3.getValue()
            X.1Av r1 = (X.1Av) r1
            X.0eM r0 = r8.A06
            r0.getValue()
            long r2 = java.lang.System.currentTimeMillis()
            X.0xY r1 = X.AnonymousClass7TE.A0p(r1)
            java.lang.String r0 = "content_note_double_tap_to_like_nux_last_shown_timestamp"
            goto L_0x06d1
        L_0x071e:
            java.lang.String r2 = "single_tap"
            goto L_0x0723
        L_0x0721:
            java.lang.String r2 = "double_tap"
        L_0x0723:
            java.lang.String r0 = "instagram_media_note_gesture_nux_impression_client"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.Long r1 = X.GPJ.A00(r5, r9)
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x0010
            if (r1 == 0) goto L_0x0010
            java.lang.String r0 = "note_id"
            r4.A9F(r0, r1)
            java.lang.String r0 = "gesture_type"
            r4.AAJ(r0, r2)
            java.lang.String r0 = "container_module"
            X.C51973G9u.A14(r4, r0, r3)
            java.lang.String r0 = "inventory_source"
        L_0x0746:
            r4.AAJ(r0, r7)
            X.C51969G9p.A1D(r4, r8)
            goto L_0x0010
        L_0x074e:
            r0 = 0
            X.0qQ.A0B(r12, r0)
            java.lang.Object r2 = r5.A01
            X.3Zt r2 = (X.C243673Zt) r2
            X.01I r1 = new X.01I
            r1.<init>()
            X.AnonymousClass2VL.A00()
            java.lang.Object r0 = r2.A00
            java.util.Collection r0 = (java.util.Collection) r0
            r1.addAll(r0)
            r1.add(r12)
            X.01I r0 = X.0kH.A04(r1)
            r2.A00(r0)
            goto L_0x0010
        L_0x0771:
            int r1 = X.AnonymousClass7TE.A0M(r12)
            java.lang.Object r0 = r5.A01
            X.2Wa r0 = (X.2Wa) r0
            X.C51967G9n.A1H(r0, r1)
            goto L_0x0010
        L_0x077e:
            java.lang.Object r0 = r5.A01
            X.5VN r0 = (X.AnonymousClass5VN) r0
            float r1 = r0.A01
            float r0 = r0.A03
            long r0 = X.C289325dP.A00(r1, r0)
            X.5d8 r1 = X.C51974G9v.A04(r0)
            return r1
        L_0x078f:
            java.lang.String r3 = X.C41847B3o.A1E(r12)
            java.lang.Object r2 = r5.A01
            X.Ll3 r2 = (X.C64964Ll3) r2
            com.instagram.igds.components.search.IgdsInlineSearchBox r0 = r2.A0C
            if (r0 == 0) goto L_0x07a0
            com.instagram.ui.text.backinterceptedittext.BackInterceptEditText r0 = r0.A0E
            r0.setText(r3)
        L_0x07a0:
            com.instagram.igds.components.search.IgdsInlineSearchBox r1 = r2.A0C
            if (r1 == 0) goto L_0x07ab
            int r0 = r3.length()
            r1.setSelection(r0)
        L_0x07ab:
            android.view.View r0 = r2.A06
            if (r0 == 0) goto L_0x07b4
            boolean r0 = r0.performClick()
            goto L_0x07d7
        L_0x07b4:
            r1 = 0
            return r1
        L_0x07b6:
            java.lang.Object r0 = r5.A01
            X.GvG r0 = (X.C53849GvG) r0
            X.GgU r0 = r0.A00
            r1 = 1
            X.05G r0 = r0.A00
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.Epw(r1)
            return r1
        L_0x07c7:
            r0 = 0
            X.0qQ.A0B(r12, r0)
            java.lang.Object r0 = r5.A01
            java.lang.Object r0 = X.C51968G9o.A0y(r0)
            java.util.Set r0 = (java.util.Set) r0
            boolean r0 = r0.contains(r12)
        L_0x07d7:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            return r1
        L_0x07dc:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x07e1:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58727Iwa.invoke(java.lang.Object):java.lang.Object");
    }
}
