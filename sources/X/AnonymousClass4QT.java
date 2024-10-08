package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.4QT  reason: invalid class name */
public final class AnonymousClass4QT {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final 1xZ A05;
    public final AtomicBoolean A06;
    public final AtomicBoolean A07;
    public final boolean A08;
    public final boolean A09;
    public final 27k A0A;
    public final boolean A0B;
    public final boolean A0C;

    public final long A00(long j, boolean z) {
        int i;
        int i2;
        float f;
        int i3;
        27k r1;
        27k r12;
        1xZ r2 = this.A05;
        if (r2 == null || this.A08) {
            return 0;
        }
        try {
            27d.A01("getIntentBasedLowWatermarkUs");
            if (z) {
                i2 = r2.A07;
                if (!this.A0C || (r12 = this.A0A) == null) {
                    i = r2.A06;
                } else {
                    i = 27k.A00(r12, 10);
                }
                f = r2.A01;
            } else {
                i2 = r2.A04;
                if (!this.A0B || (r1 = this.A0A) == null) {
                    i3 = r2.A03;
                } else {
                    i3 = 27k.A00(r1, 11);
                }
                f = r2.A00;
            }
            return (long) (1.0f * Math.min(((float) (((long) i2) * 1000)) + (f * ((float) j)), (float) (((long) i) * 1000)));
        } finally {
            27d.A00();
        }
    }

    public AnonymousClass4QT(27k r5, 1xZ r6, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A08 = z;
        this.A05 = r6;
        this.A07 = atomicBoolean;
        this.A06 = atomicBoolean2;
        this.A09 = z2;
        this.A03 = ((long) i) * 1000;
        this.A02 = ((long) i2) * 1000;
        this.A04 = ((long) i3) * 1000;
        this.A01 = ((long) i4) * 1000;
        this.A00 = ((long) i5) * 1000;
        this.A0A = r5;
        this.A0C = z3;
        this.A0B = z4;
    }

    public AnonymousClass4QT() {
        this((27k) null, (1xZ) null, new AtomicBoolean(false), new AtomicBoolean(false), IgNetworkConsentStorage.MAX_ENTRIES, IgNetworkConsentStorage.MAX_ENTRIES, -1, 15000, 30000, false, false, false, false);
    }
}
