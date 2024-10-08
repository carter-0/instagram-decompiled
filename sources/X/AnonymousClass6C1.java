package X;

/* renamed from: X.6C1  reason: invalid class name */
public abstract class AnonymousClass6C1 {
    public static final C267314bM A00 = new C267304bL(AnonymousClass6C2.A00);

    public static final void A00(C286575Wy r15, C304056Bz r16, Boolean bool, 0sL r18, int i, int i2) {
        int i3;
        boolean AGw;
        Boolean bool2 = bool;
        C304056Bz r13 = r16;
        0sL r12 = r18;
        0qQ.A0B(r12, 2);
        r15.ExV(1924469990);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                AGw = r15.AGu(r13);
            } else {
                AGw = r15.AGw(r13);
            }
            int i7 = 2;
            if (AGw) {
                i7 = 4;
            }
            i3 = i7 | i;
        } else {
            i3 = i6;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            int i9 = 16;
            if (r15.AGu(bool2)) {
                i9 = 32;
            }
            i3 |= i9;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i6 & 384) == 0) {
            int i10 = 128;
            if (r15.AGw(r12)) {
                i10 = 256;
            }
            i3 |= i10;
        }
        if ((i3 & 147) != 146 || !r15.Bwn()) {
            if (i5 != 0) {
                r13 = C57013ILf.A00;
            }
            if (i8 != 0) {
                bool2 = null;
            }
            if (0fL.A02()) {
                0fL.A01(1304139812, "com.instagram.barcelona.feed.video.ProvideMediaPlaybackManager (ProvideMediaPlaybackManager.kt:26)");
            }
            r15.ExS(2012858922);
            Object ECw = r15.ECw();
            Object obj = AnonymousClass5XT.A00;
            if (ECw == obj) {
                ECw = new AnonymousClass6C3(r13);
                ((C286565Wx) r15).A0Q(ECw);
            }
            AnonymousClass6C3 r6 = (AnonymousClass6C3) ECw;
            C286565Wx r5 = (C286565Wx) r15;
            C286565Wx.A0L(r5, false);
            if (bool2 != null) {
                r6.A09.Epw(Boolean.valueOf(bool2.booleanValue()));
            }
            C60340gF r3 = C60340gF.A00;
            r15.ExS(2012863717);
            Object ECw2 = r15.ECw();
            if (ECw2 == obj) {
                ECw2 = new C376889Js(r6, (AnonymousClass4D7) null, 7);
                r15.FLL(ECw2);
            }
            C286565Wx.A0L(r5, false);
            C286645Xf.A04(r15, r3, (0sL) ECw2);
            C286715Xm.A00(r15, A00.A02(r6), r12, ((i3 >> 3) & 112) | 8);
            if (0fL.A02()) {
                0fL.A00(-138061205);
            }
        } else {
            r15.Evl();
        }
        C286625Xd ASQ = r15.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG6(i6, i4, 16, r12, r13, bool2);
        }
    }
}
