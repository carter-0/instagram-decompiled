package X;

import org.webrtc.CameraCapturer;

/* renamed from: X.AVq  reason: case insensitive filesystem */
public final class C40200AVq implements B3U {
    public int A00;
    public int A01;
    public C344567s4 A02;
    public C345087su A03;
    public C344697sH A04;
    public C344697sH A05;
    public boolean A06 = true;
    public final C344407ro A07;
    public final C344737sL A08;
    public final B3U A09;
    public final boolean A0A;
    public final C344737sL[] A0B;

    public C40200AVq(C344407ro r3, C344737sL r4, B3U b3u, boolean z) {
        0qQ.A0B(b3u, 1);
        this.A09 = b3u;
        this.A08 = r4;
        this.A07 = r3;
        this.A0A = z;
        this.A0B = new C344737sL[]{b3u, r4};
    }

    public final void ACn(C345897uG r5) {
        0qQ.A0B(r5, 0);
        this.A06 = true;
        C344737sL[] r3 = this.A0B;
        int i = 0;
        do {
            r3[i].ACn(r5);
            i++;
        } while (i < 2);
    }

    public final void CMa(C344567s4 r5) {
        0qQ.A0B(r5, 0);
        this.A02 = r5;
        C344737sL[] r3 = this.A0B;
        int i = 0;
        do {
            r3[i].CMa(r5);
            i++;
        } while (i < 2);
    }

    public final /* synthetic */ C345137sz EEw(C345137sz r1, C345097sv r2, C344697sH r3, Long l) {
        return r1;
    }

    public final void EEx(C344697sH r7, Long l) {
        String str;
        0qQ.A0B(r7, 0);
        if (this.A06) {
            C344407ro r4 = this.A07;
            C345087su r1 = new C345087su(r4, new C345047sq(), new C345077st(), true);
            this.A03 = r1;
            C344687sG BDu = r7.BDu();
            this.A04 = BDu;
            BDu.A8c(r1, 0);
            C345087su r0 = this.A03;
            if (r0 != null) {
                C346277uu r12 = new C346277uu(r4, r0);
                C344687sG BDv = r7.BDv();
                this.A05 = BDv;
                BDv.EZt(r12, 0);
                this.A06 = false;
            }
            str = "intermediateFramebuffer";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        C345087su r2 = this.A03;
        if (r2 != null) {
            r2.A03(this.A01, this.A00, 0);
            B3U b3u = this.A09;
            C344697sH r02 = this.A04;
            if (r02 != null) {
                b3u.EEx(r02, l);
                C344697sH r13 = this.A05;
                if (r13 != null) {
                    C367478qo.A00(r7, r13, CameraCapturer.OPEN_CAMERA_DELAY_MS);
                    if (r7 != r13) {
                        C367478qo.A00(r7, r13, 1011);
                        C367478qo.A00(r7, r13, 1012);
                    }
                    C344737sL r14 = this.A08;
                    C344697sH r03 = this.A05;
                    if (r03 != null) {
                        r14.EEx(r03, l);
                        return;
                    }
                }
                str = "storiesGraphIo";
            } else {
                str = "intermediateIo";
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        str = "intermediateFramebuffer";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ void EeS(B19 b19) {
    }

    public final void FMh(int i, Object obj) {
        0qQ.A0B(obj, 1);
        C344737sL[] r3 = this.A0B;
        int i2 = 0;
        do {
            r3[i2].FMh(i, obj);
            i2++;
        } while (i2 < 2);
    }

    public final void A8F(C40191AVf aVf) {
        this.A09.A8F(aVf);
    }

    public final int AlC() {
        C344737sL[] r4 = this.A0B;
        int i = 0;
        int i2 = 0;
        do {
            i2 |= r4[i].AlC();
            i++;
        } while (i < 2);
        return i2;
    }

    public final /* synthetic */ int Avq() {
        return 0;
    }

    public final boolean CKm() {
        C344737sL[] r4 = this.A0B;
        int i = 0;
        while (!r4[i].CKm()) {
            i++;
            if (i >= 2) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ boolean Cag() {
        return false;
    }

    public final void EDX(C40191AVf aVf) {
        this.A09.EDX(aVf);
    }

    public final void FLA(int i, int i2, int i3, boolean z, int i4, int i5) {
        int[] iArr;
        int i6 = i4;
        this.A01 = i6;
        int i7 = i5;
        this.A00 = i7;
        int i8 = i;
        int i9 = i2;
        int i10 = i3;
        boolean z2 = z;
        if (!this.A0A) {
            this.A09.FLA(i8, i9, i10, z2, i6, i7);
            this.A08.FLA(i8, i6, i7, z2, i6, i7);
            return;
        }
        if (i9 >= i6 || i10 >= i7) {
            iArr = new int[]{i6, i7};
        } else {
            iArr = new int[]{i9, (int) (((float) i9) / (((float) i6) / ((float) i7)))};
        }
        this.A09.FLA(i8, i9, i10, z2, iArr[0], iArr[1]);
        this.A08.FLA(i8, iArr[0], iArr[1], z2, i6, i7);
    }

    public final void detach() {
        C344737sL[] r3 = this.A0B;
        int i = 0;
        do {
            r3[i].detach();
            i++;
        } while (i < 2);
    }

    public final void release() {
        C344737sL[] r3 = this.A0B;
        int i = 0;
        do {
            r3[i].release();
            i++;
        } while (i < 2);
    }
}
