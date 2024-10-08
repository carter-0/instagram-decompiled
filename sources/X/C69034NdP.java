package X;

/* renamed from: X.NdP  reason: case insensitive filesystem */
public final class C69034NdP extends AnonymousClass2xK {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C69034NdP(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void DsC(AnonymousClass5Gv r60) {
        switch (this.A00) {
            case 0:
                ((OL6) this.A02).A00 = true;
                return;
            case 3:
                OYY A08 = ((PMU) this.A02).A08();
                Object obj = this.A01;
                C69108Nen nen = A08.A00;
                C68293N9g n9g = (C68293N9g) nen.A01;
                if (n9g != null && n9g.A03 == obj) {
                    boolean z = n9g.A0C;
                    boolean z2 = n9g.A0I;
                    boolean z3 = n9g.A0J;
                    Integer num = n9g.A02;
                    boolean z4 = n9g.A0L;
                    boolean z5 = n9g.A08;
                    boolean z6 = n9g.A06;
                    boolean z7 = n9g.A07;
                    boolean z8 = n9g.A0U;
                    boolean z9 = n9g.A0P;
                    boolean z10 = n9g.A0V;
                    boolean z11 = n9g.A0W;
                    boolean z12 = n9g.A0H;
                    boolean z13 = n9g.A0Y;
                    boolean z14 = n9g.A0O;
                    boolean z15 = n9g.A0S;
                    boolean z16 = n9g.A0M;
                    boolean z17 = n9g.A0N;
                    boolean z18 = n9g.A0K;
                    boolean z19 = n9g.A0T;
                    boolean z20 = n9g.A0B;
                    boolean z21 = n9g.A0Z;
                    int i = n9g.A01;
                    int i2 = n9g.A00;
                    boolean z22 = n9g.A0G;
                    String str = n9g.A04;
                    String str2 = n9g.A05;
                    boolean z23 = n9g.A0F;
                    boolean z24 = n9g.A0D;
                    boolean z25 = n9g.A0R;
                    boolean z26 = n9g.A0A;
                    boolean z27 = n9g.A0E;
                    boolean z28 = n9g.A0X;
                    Integer num2 = num;
                    String str3 = str;
                    String str4 = str2;
                    int i3 = i;
                    int i4 = i2;
                    boolean z29 = z;
                    boolean z30 = z2;
                    boolean z31 = z3;
                    boolean z32 = z4;
                    boolean z33 = z5;
                    boolean z34 = z6;
                    boolean z35 = z7;
                    nen.A0J(new C68293N9g(num2, (Integer) null, str3, str4, i3, i4, z29, z30, z31, z32, z33, z34, z35, z8, z9, z10, z11, z12, z13, z14, z15, z16, z17, z18, z19, z20, z21, z22, z23, z24, z25, z26, z27, z28, n9g.A0Q, C68293N9g.A00(n9g, num)));
                    return;
                }
                return;
            default:
                super.DsC(r60);
                return;
        }
    }

    public final void DsH(AnonymousClass5Gv r7) {
        1Av r4;
        boolean z;
        0s0 r2;
        AnonymousClass0YZ[] r1;
        int i;
        String str;
        0xa r12;
        String str2;
        switch (this.A00) {
            case 0:
                DbS.A1U(this.A01);
                return;
            case 1:
                r4 = (1Av) this.A02;
                z = true;
                r2 = r4.A3P;
                r1 = 1Av.A8a;
                i = 105;
                break;
            case 2:
                r4 = (1Av) this.A02;
                z = true;
                r2 = r4.A3Q;
                r1 = 1Av.A8a;
                i = 106;
                break;
            default:
                C69108Nen nen = ((PMU) this.A02).A08().A00;
                OKY oky = nen.A0K;
                int intValue = ((Number) this.A01).intValue();
                switch (intValue) {
                    case 1:
                        str = "cowatch_watch_more";
                        break;
                    case 2:
                        str = "minimize";
                        break;
                    case 3:
                        str = "photobooth";
                        break;
                    case 4:
                        str = "avatar";
                        break;
                    case 5:
                        str = "screenshare";
                        break;
                    case 6:
                        str = "dual_camera_on_call_start";
                        break;
                    case 7:
                        str = "dual_camera_on_flip";
                        break;
                    default:
                        str = "cowatch";
                        break;
                }
                oky.A00(new PK9(str));
                switch (intValue) {
                    case 0:
                        nen.A06 = true;
                        r12 = nen.A0J.A01;
                        str2 = "video_call_cowatch_look_at_posts_tooltip_display_count";
                        break;
                    case 1:
                        nen.A05 = true;
                        JTS.A1S(nen.A0J.A01, "video_call_cowatch_change_content_tooltip_display_count_v2", 0);
                        C69830Nsr.A00(nen.A0H).A03(C69502Nmk.A06, (String) null, AnonymousClass7TF.A0w("nux_type", "cowatch_watch_more"));
                        return;
                    case 2:
                        nen.A0A = true;
                        r12 = nen.A0J.A01;
                        str2 = "video_call_minimize_tooltip_display_count";
                        break;
                    case 3:
                        nen.A0B = true;
                        r12 = nen.A0J.A01;
                        str2 = "video_call_photobooth_tooltip_on_halo_display_count";
                        break;
                    case 4:
                        nen.A03 = true;
                        return;
                    case 5:
                        nen.A0C = true;
                        oky.A00(C72799PKn.A00);
                        r12 = nen.A0J.A01;
                        str2 = "video_call_screenshare_tooltip_display_count";
                        break;
                    case 6:
                        nen.A07 = true;
                        r12 = nen.A0J.A01;
                        str2 = "video_call_dual_camera_tooltip_on_call_start_display_count";
                        break;
                    case 7:
                        nen.A07 = true;
                        r12 = nen.A0J.A01;
                        str2 = "video_call_dual_camera_tooltip_on_flip_display_count";
                        break;
                    default:
                        throw AnonymousClass7TE.A1K();
                }
                JTS.A1S(r12, str2, 0);
                return;
        }
        AnonymousClass7TF.A1J(r4, r2, r1, i, z);
    }
}
