package X;

import java.util.List;

/* renamed from: X.7sT  reason: invalid class name and case insensitive filesystem */
public final class C344817sT implements C344747sM, C344827sU {
    public float A00 = 1.0f;
    public C344567s4 A01;
    public boolean A02;
    public C345087su A03;
    public C345087su A04;
    public final C344407ro A05;
    public final C3496981j A06 = new C3496981j();

    public final synchronized void A01(int i) {
        AnonymousClass8KV r0;
        List list = this.A06.A00;
        0qQ.A07(list);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C368928tY r1 = (C368928tY) list.get(i2);
            if (r1 instanceof C344827sU) {
                C368798tL r12 = r1.A07;
                if (i == 1) {
                    r0 = AnonymousClass8KV.CAPTURE;
                } else if (i == 2) {
                    r0 = AnonymousClass8KV.CAPTURE_IMAGE;
                } else if (i == 3) {
                    r0 = AnonymousClass8KV.OVERLAY;
                } else if (i != 4) {
                    r0 = AnonymousClass8KV.PREVIEW;
                } else {
                    r0 = AnonymousClass8KV.PEER;
                }
                r12.A00 = r0;
                r12.A01 = AAJ.A01(r0);
            }
        }
    }

    public final synchronized boolean A02() {
        List list = this.A06.A00;
        0qQ.A07(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C368928tY r1 = (C368928tY) list.get(i);
            if (r1 instanceof C344827sU) {
                C361868gx r12 = r1.A03;
                if (r12 instanceof C361878gy) {
                    0qQ.A0C(r12, "null cannot be cast to non-null type com.facebook.videocodec.effects.common.OutputAwareGLRenderer");
                    if (((C361878gy) r12).CXr()) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    public final void ACn(C345897uG r1) {
    }

    public final void CMa(C344567s4 r2) {
        0qQ.A0B(r2, 0);
        this.A01 = r2;
    }

    public final void detach() {
    }

    public final synchronized void release() {
        this.A03 = null;
        this.A04 = null;
    }

    public static final C345087su A00(C344817sT r6) {
        C344567s4 r5 = r6.A01;
        if (r5 == null) {
            throw new IllegalStateException("GlRenderChain.init() must be called before getFrameBuffer()");
        } else if (r6.A02) {
            C345087su r3 = r6.A03;
            if (r3 != null) {
                return r3;
            }
            C345087su r32 = new C345087su(r6.A05, new C345047sq(), new C345077st(), true);
            r5.A03(r32);
            r6.A03 = r32;
            return r32;
        } else {
            C345087su r33 = r6.A04;
            if (r33 != null) {
                return r33;
            }
            C345087su r34 = new C345087su(r6.A05, new C345047sq(), new C345077st(), true);
            r5.A03(r34);
            r6.A04 = r34;
            return r34;
        }
    }

    public C344817sT(C344407ro r2) {
        this.A05 = r2;
    }
}
