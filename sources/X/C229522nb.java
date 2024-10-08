package X;

import com.facebook.systrace.Systrace;

/* renamed from: X.2nb  reason: invalid class name and case insensitive filesystem */
public final class C229522nb implements C229532nc {
    public final /* synthetic */ C229442nP A00;

    public C229522nb(C229442nP r1) {
        this.A00 = r1;
    }

    public final void DH2(long j, long j2) {
        C229442nP r6 = this.A00;
        if (r6.A02) {
            C229422nM r2 = r6.A0H;
            C229422nM.A00(r2, new C377289Lg(r2, j, 5));
            r6.A01 = j;
            AnonymousClass2nX r5 = r6.A0G;
            if (r5.A05 == -1) {
                r5.A05 = j;
                if (C229442nP.A01()) {
                    r6.A0B.markerStart(r6.A07, r6.A06);
                    return;
                }
                return;
            }
            r6.A0D.A00(r6.A0M);
            r5.A07 += j2;
            if (C229442nP.A01() && !C59470Vi.A00()) {
                if (Systrace.A0E(1)) {
                    0fS.A01("ScrollPerf.FrameStarted", 30471236);
                }
                if (Systrace.A0E(1)) {
                    0fS.A00(1687001523);
                }
            }
        }
    }

    public final void DMx(long j, int i) {
        C229442nP r2 = this.A00;
        if (r2.A02) {
            AnonymousClass2nX r6 = r2.A0G;
            if (r6.A05 != j || r2.A0W) {
                C229422nM r3 = r2.A0H;
                C229422nM.A00(r3, new C377289Lg(r3, j, 6));
                r2.A0F.onLargeFrameDrop(r2.A0A.getModuleName(), i);
                if (C229442nP.A01()) {
                    int i2 = r6.A02;
                    if (i2 < 8) {
                        02m r4 = r2.A0B;
                        int i3 = r2.A07;
                        int i4 = r2.A06;
                        r6.A02 = i2 + 1;
                        r4.markerPoint(i3, i4, 002.A0O("ScrollPerf.LargeFrameDrop", i2), String.valueOf(i));
                    }
                    if (!C59470Vi.A00()) {
                        if (Systrace.A0E(1)) {
                            0fS.A01("ScrollPerf.LargeFrameDropped", 2033569308);
                        }
                        if (Systrace.A0E(1)) {
                            0fS.A00(-361665890);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            r6.A0G = true;
        }
    }

    public final void DlZ(long j) {
        C229442nP r4 = this.A00;
        if (r4.A02) {
            AnonymousClass2nX r3 = r4.A0G;
            if (r3.A05 == j) {
                r3.A0H = true;
                return;
            }
            r4.A0F.onSmallFrameDrop(r4.A0A.getModuleName());
            if (C229442nP.A01() && !C59470Vi.A00()) {
                if (Systrace.A0E(1)) {
                    0fS.A01("ScrollPerf.FrameDropped", 921983882);
                }
                if (Systrace.A0E(1)) {
                    0fS.A00(832396222);
                }
            }
        }
    }
}
