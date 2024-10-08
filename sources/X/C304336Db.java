package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.6Db  reason: invalid class name and case insensitive filesystem */
public abstract class C304336Db {
    public static final void A00(C286575Wy r14, Modifier modifier, AnonymousClass62P r16, int i, int i2) {
        int i3;
        C286565Wx r5;
        Modifier modifier2 = modifier;
        AnonymousClass62P<ImageUrl> r12 = r16;
        0qQ.A0B(r12, 0);
        r14.ExV(-344039711);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            int i6 = 2;
            if (r14.AGu(r12)) {
                i6 = 4;
            }
            i3 = i6 | i;
        } else {
            i3 = i5;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            int i8 = 16;
            if (r14.AGu(modifier)) {
                i8 = 32;
            }
            i3 |= i8;
        }
        if ((i3 & 19) != 18 || !r14.Bwn()) {
            if (i7 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(1099938932, "com.instagram.barcelona.feed.post.ui.PostReplyFacepile (PostReplyFacepile.kt:33)");
            }
            int size = r12.size();
            if (size == 0) {
                r14.ExS(169092958);
                C287675aa.A02(r14, modifier2, (i3 >> 3) & 14);
            } else if (size != 1) {
                if (size != 2) {
                    r14.ExS(169902244);
                    AnonymousClass5RD A00 = C287675aa.A00(C287215Zl.A0E, false);
                    int A002 = C287425a7.A00(r14);
                    r5 = (C286565Wx) r14;
                    AnonymousClass5RM A04 = C286565Wx.A04(r5);
                    Modifier A01 = C287435a8.A01(r14, modifier2);
                    C62320sa r1 = C287485aD.A00;
                    r14.ExX();
                    if (r5.A0K) {
                        r14.AMT(r1);
                    } else {
                        r14.FMk();
                    }
                    C287595aO.A00(r14, A00, C287485aD.A03);
                    C287595aO.A00(r14, A04, C287485aD.A05);
                    0sL r6 = C287485aD.A02;
                    if (r5.A0K || !0qQ.A0K(r14.ECw(), Integer.valueOf(A002))) {
                        Integer valueOf = Integer.valueOf(A002);
                        r14.FLL(valueOf);
                        r14.ABr(valueOf, r6);
                    }
                    C287595aO.A00(r14, A01, C287485aD.A04);
                    C285245Qk r9 = Modifier.A00;
                    Modifier A0C = C287205Zk.A0C(C287195Zj.A0B(r9, 16.0f, 2.0f, 0.0f, 0.0f), 18.0f);
                    AnonymousClass5ZQ r62 = AnonymousClass5ZN.A00;
                    C304096Cd.A02(r14, AnonymousClass6FZ.A01(A0C, r62), (ImageUrl) r12.get(0));
                    C304096Cd.A02(r14, AnonymousClass6FZ.A01(C287205Zk.A0C(C287195Zj.A0B(r9, 0.0f, 11.0f, 0.0f, 0.0f), 12.0f), r62), (ImageUrl) r12.get(1));
                    C304096Cd.A02(r14, AnonymousClass6FZ.A01(C287205Zk.A0C(C287195Zj.A0B(r9, 13.0f, 23.0f, 0.0f, 0.0f), 9.0f), r62), (ImageUrl) r12.get(2));
                } else {
                    r14.ExS(169319134);
                    int i9 = (((i3 >> 3) & 14) | 48) >> 3;
                    AnonymousClass5RD A02 = C287395a4.A02(C287275Zs.A01(-10.0f), r14, C287215Zl.A05, (i9 & 112) | (i9 & 14));
                    int A003 = C287425a7.A00(r14);
                    r5 = (C286565Wx) r14;
                    AnonymousClass5RM A042 = C286565Wx.A04(r5);
                    Modifier A012 = C287435a8.A01(r14, modifier2);
                    C62320sa r13 = C287485aD.A00;
                    r14.ExX();
                    if (r5.A0K) {
                        r14.AMT(r13);
                    } else {
                        r14.FMk();
                    }
                    C287595aO.A00(r14, A02, C287485aD.A03);
                    C287595aO.A00(r14, A042, C287485aD.A05);
                    0sL r2 = C287485aD.A02;
                    if (r5.A0K || !0qQ.A0K(r14.ECw(), Integer.valueOf(A003))) {
                        Integer valueOf2 = Integer.valueOf(A003);
                        r14.FLL(valueOf2);
                        r14.ABr(valueOf2, r2);
                    }
                    C287595aO.A00(r14, A012, C287485aD.A04);
                    Modifier A0C2 = C287205Zk.A0C(Modifier.A00, 20.0f);
                    C304806Fh A004 = AnonymousClass6C9.A00(2.0f, ((AnonymousClass5RW) C286615Xc.A01(C52601GZa.A00, C286565Wx.A04(r5))).A00);
                    AnonymousClass5ZQ r15 = AnonymousClass5ZN.A00;
                    Modifier A013 = AnonymousClass6FZ.A01(C287195Zj.A07(C304816Fi.A01(A004, A0C2, r15), 2.0f), r15);
                    r14.ExS(867986796);
                    for (ImageUrl A022 : r12) {
                        C304096Cd.A02(r14, A013, A022);
                    }
                    C286565Wx.A0L(r5, false);
                }
                C286565Wx.A0L(r5, true);
            } else {
                r14.ExS(169133909);
                C304096Cd.A02(r14, AnonymousClass6FZ.A01(C287205Zk.A0C(modifier2, 18.0f), AnonymousClass5ZN.A00), (ImageUrl) r12.get(0));
            }
            C286565Wx.A0L((C286565Wx) r14, false);
            if (0fL.A02()) {
                0fL.A00(299840175);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r14.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new GSJ(modifier2, i4, r12, i5, 16);
        }
    }

    public static final void A01(C286575Wy r23, Modifier modifier, AnonymousClass62P r25, int i, int i2, boolean z) {
        int i3;
        Modifier modifier2 = modifier;
        0qQ.A0B(r25, 1);
        C286575Wy r8 = r23;
        r8.ExV(51753465);
        int i4 = i2;
        int i5 = i;
        boolean z2 = z;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            int i6 = 2;
            if (r8.AGv(z2)) {
                i6 = 4;
            }
            i3 = i6 | i;
        } else {
            i3 = i5;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            int i7 = 16;
            if (r8.AGu(r25)) {
                i7 = 32;
            }
            i3 |= i7;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            int i9 = 128;
            if (r8.AGu(modifier2)) {
                i9 = 256;
            }
            i3 |= i9;
        }
        if ((i3 & 147) != 146 || !r8.Bwn()) {
            if (i8 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(1688507349, "com.instagram.barcelona.feed.post.ui.PostInlineExpansionIndicator (PostReplyFacepile.kt:88)");
            }
            C285245Qk r18 = Modifier.A00;
            Modifier A0C = C287205Zk.A0C(r18, 20.0f);
            C286565Wx r6 = (C286565Wx) r8;
            C304776Fe r3 = new C304776Fe(((AnonymousClass5RW) C286615Xc.A01(C52601GZa.A00, C286565Wx.A04(r6))).A00);
            AnonymousClass5ZQ r10 = AnonymousClass5ZN.A00;
            Modifier A07 = C287195Zj.A07(C304816Fi.A02(A0C, r3, r10, 2.0f), 2.0f);
            int i10 = (((i3 >> 6) & 14) | 48) >> 3;
            AnonymousClass5RD A02 = C287395a4.A02(C287275Zs.A01(-10.0f), r8, C287215Zl.A05, (i10 & 112) | (i10 & 14));
            int A00 = C287425a7.A00(r8);
            AnonymousClass5RM A04 = C286565Wx.A04(r6);
            Modifier A01 = C287435a8.A01(r8, modifier2);
            C62320sa r16 = C287485aD.A00;
            r8.ExX();
            if (r6.A0K) {
                r8.AMT(r16);
            } else {
                r8.FMk();
            }
            0sL r12 = C287485aD.A03;
            C287595aO.A00(r8, A02, r12);
            0sL r11 = C287485aD.A05;
            C287595aO.A00(r8, A04, r11);
            0sL r4 = C287485aD.A02;
            if (r6.A0K || !0qQ.A0K(r8.ECw(), Integer.valueOf(A00))) {
                Integer valueOf = Integer.valueOf(A00);
                r8.FLL(valueOf);
                r8.ABr(valueOf, r4);
            }
            0sL r32 = C287485aD.A04;
            C287595aO.A00(r8, A01, r32);
            r8.ExS(-354787923);
            int size = r25.size();
            if (size > 2) {
                size = 2;
            }
            for (int i11 = 0; i11 < size; i11++) {
                C304096Cd.A02(r8, AnonymousClass6FZ.A01(A07, r10), (ImageUrl) r25.get(i11));
            }
            C286565Wx.A0L(r6, false);
            if (z) {
                r8.ExS(1886713799);
                HUY.A00(r8, C304766Fd.A01(A07, r10, AnonymousClass5aQ.A00(r8).A0k), (C52424GSc) null, 0, 2);
            } else {
                r8.ExS(1886858569);
                Modifier A012 = C304766Fd.A01(A07, r10, AnonymousClass5aQ.A00(r8).A0o);
                AnonymousClass5RD A002 = C287675aa.A00(C287215Zl.A09, false);
                int A003 = C287425a7.A00(r8);
                AnonymousClass5RM A042 = C286565Wx.A04(r6);
                Modifier A013 = C287435a8.A01(r8, A012);
                r8.ExX();
                if (r6.A0K) {
                    r8.AMT(r16);
                } else {
                    r8.FMk();
                }
                C287595aO.A00(r8, A002, r12);
                C287595aO.A00(r8, A042, r11);
                if (r6.A0K || !0qQ.A0K(r8.ECw(), Integer.valueOf(A003))) {
                    Integer valueOf2 = Integer.valueOf(A003);
                    r8.FLL(valueOf2);
                    r8.ABr(valueOf2, r4);
                }
                C287595aO.A00(r8, A013, r32);
                C288165bT.A03(r8, C287205Zk.A0C(r18, 8.0f), C287975bA.A00(r8, R.drawable.barcelona_arrow_down_outline_08, 0), AnonymousClass5aQ.A00(r8).A0k);
                C286565Wx.A0L(r6, true);
            }
            C286565Wx.A0L(r6, false);
            C286565Wx.A0L(r6, true);
            if (0fL.A02()) {
                0fL.A00(919793824);
            }
        } else {
            r8.Evl();
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J8R(i5, i4, 3, modifier2, r25, z2);
        }
    }
}
