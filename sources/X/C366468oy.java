package X;

import org.webrtc.CameraCapturer;

/* renamed from: X.8oy  reason: invalid class name and case insensitive filesystem */
public final class C366468oy implements C344737sL {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C344567s4 A04;
    public C345087su A05;
    public C345087su A06;
    public C344697sH A07;
    public C344697sH A08;
    public boolean A09;
    public final C344407ro A0A;
    public final C366478oz A0B;
    public final C344737sL A0C;
    public final C344737sL A0D;
    public final boolean A0E;
    public final C368028rx A0F;
    public final C344737sL[] A0G;

    public final void ACn(C345897uG r5) {
        0qQ.A0B(r5, 0);
        this.A09 = true;
        for (C344737sL ACn : this.A0G) {
            ACn.ACn(r5);
        }
    }

    public final void CMa(C344567s4 r5) {
        0qQ.A0B(r5, 0);
        this.A04 = r5;
        for (C344737sL CMa : this.A0G) {
            CMa.CMa(r5);
        }
    }

    public final /* synthetic */ C345137sz EEw(C345137sz r1, C345097sv r2, C344697sH r3, Long l) {
        return r1;
    }

    public final void EEx(C344697sH r8, Long l) {
        String str;
        0qQ.A0B(r8, 0);
        if (r8.CVW(0) && !r8.B9R(0).isEmpty()) {
            if (this.A09) {
                C344407ro r6 = this.A0A;
                C345087su r1 = new C345087su(r6, new C345047sq(), new C345077st(), true);
                this.A06 = r1;
                C344687sG BDu = r8.BDu();
                this.A08 = BDu;
                BDu.A8c(r1, 0);
                C345087su r0 = this.A06;
                if (r0 != null) {
                    C346277uu r3 = new C346277uu(r6, r0);
                    if (this.A0E) {
                        C344687sG BDv = r8.BDv();
                        this.A07 = BDv;
                        BDv.EZt(r3, 0);
                    } else {
                        C344567s4 r2 = this.A04;
                        if (r2 != null) {
                            C344687sG r02 = new C344687sG(r6, (C344037rD) null, r2);
                            this.A07 = r02;
                            r02.EZt(r3, 0);
                            C345087su r12 = new C345087su(r6, new C345047sq(), new C345077st(), true);
                            this.A05 = r12;
                            C344697sH r03 = this.A07;
                            if (r03 != null) {
                                r03.A8c(r12, 0);
                            }
                            str = "igluIo";
                            0qQ.A0F(str);
                            throw AnonymousClass00P.createAndThrow();
                        }
                        str = "glHost";
                        0qQ.A0F(str);
                        throw AnonymousClass00P.createAndThrow();
                    }
                    this.A09 = false;
                }
                str = "intermediateFramebuffer";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            C368028rx r13 = this.A0F;
            if (r13 != null) {
                Object BHP = r8.BHP(0);
                0qQ.A07(BHP);
                C346337v0 texture = ((C345137sz) BHP).getTexture();
                if (texture != null) {
                    r13.A00(texture);
                }
            }
            boolean z = false;
            int BZY = ((C345097sv) r8.B9R(0).get(0)).BZY();
            C345087su r04 = this.A06;
            if (r04 != null) {
                r04.A02(BZY);
                C345087su r22 = this.A06;
                if (r22 != null) {
                    r22.A03(this.A01, this.A00, 0);
                    if (r8.CVW(CameraCapturer.OPEN_CAMERA_DELAY_MS)) {
                        Object BHP2 = r8.BHP(CameraCapturer.OPEN_CAMERA_DELAY_MS);
                        0qQ.A07(BHP2);
                        z = ((Boolean) BHP2).booleanValue();
                    }
                    C344737sL r14 = this.A0C;
                    if (r14 == null || !z) {
                        r14 = this.A0B;
                    }
                    C344697sH r05 = this.A08;
                    if (r05 != null) {
                        r14.EEx(r05, l);
                        C344737sL r32 = this.A0D;
                        if (r32 != null) {
                            C345087su r23 = this.A05;
                            if (r23 != null) {
                                r23.A03(this.A03, this.A02, 0);
                            }
                            C344697sH r15 = this.A07;
                            if (r15 != null) {
                                if (r8 != r15) {
                                    C367478qo.A00(r8, r15, 1011);
                                    C367478qo.A00(r8, r15, 1012);
                                }
                                C344697sH r06 = this.A07;
                                if (r06 != null) {
                                    r32.EEx(r06, l);
                                    C345087su r07 = this.A05;
                                    if (r07 != null) {
                                        ((C344687sG) r8).A07.A01(r07.A0A, (C345097sv) null);
                                        return;
                                    }
                                    return;
                                }
                            }
                            str = "igluIo";
                            0qQ.A0F(str);
                            throw AnonymousClass00P.createAndThrow();
                        }
                        return;
                    }
                    str = "intermediateIo";
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
            }
            str = "intermediateFramebuffer";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void FLA(int i, int i2, int i3, boolean z, int i4, int i5) {
        int i6 = i2;
        this.A01 = i2;
        int i7 = i3;
        this.A00 = i3;
        int i8 = i4;
        this.A03 = i8;
        int i9 = i5;
        this.A02 = i9;
        C344737sL r0 = this.A0C;
        int i10 = i;
        boolean z2 = z;
        if (r0 != null) {
            r0.FLA(i10, i6, i7, z2, i2, i3);
        }
        C344737sL r5 = this.A0D;
        if (r5 != null) {
            r5.FLA(i, i2, i3, z2, i8, i9);
        }
    }

    public final void FMh(int i, Object obj) {
        0qQ.A0B(obj, 1);
        for (C344737sL FMh : this.A0G) {
            FMh.FMh(i, obj);
        }
    }

    public final int AlC() {
        int i = 0;
        for (C344737sL AlC : this.A0G) {
            i |= AlC.AlC();
        }
        return i;
    }

    public final /* synthetic */ int Avq() {
        return 0;
    }

    public final boolean CKm() {
        for (C344737sL CKm : this.A0G) {
            if (CKm.CKm()) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ boolean Cag() {
        return false;
    }

    public final void detach() {
        for (C344737sL detach : this.A0G) {
            detach.detach();
        }
    }

    public final void release() {
        for (C344737sL release : this.A0G) {
            release.release();
        }
    }

    public C366468oy(C368028rx r5, C344767sO r6, C344407ro r7, C344737sL r8, boolean z, boolean z2) {
        C344737sL r1;
        this.A0D = r8;
        this.A0A = r7;
        this.A0E = z;
        this.A0F = r5;
        if (!z2 || r6 == null) {
            r1 = r6;
        } else {
            r1 = new AnonymousClass9S8(r6);
        }
        C344737sL r12 = r1;
        this.A0C = r12;
        C366478oz r0 = new C366478oz(r7);
        this.A0B = r0;
        this.A0G = (C344737sL[]) 03t.A0I(new C344737sL[]{r12, r8, r0}).toArray(new C344737sL[0]);
        this.A09 = true;
    }
}
