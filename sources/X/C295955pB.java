package X;

import android.net.Uri;
import com.google.android.exoplayer2.Timeline;

/* renamed from: X.5pB  reason: invalid class name and case insensitive filesystem */
public final class C295955pB extends Timeline {
    public static final AnonymousClass4RL A07;
    public static final Object A08 = new Object();
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final AnonymousClass4RO A04;
    public final AnonymousClass4RL A05;
    public final boolean A06;

    @Deprecated
    public C295955pB(long j) {
        AnonymousClass4RF r0 = new AnonymousClass4RF(A07);
        r0.A05 = null;
        AnonymousClass4RL A002 = r0.A00();
        this.A01 = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
        this.A00 = j;
        this.A02 = j;
        this.A06 = true;
        this.A05 = A002;
        this.A04 = null;
    }

    public final int A01() {
        return 1;
    }

    public final int A02() {
        return 1;
    }

    public final Object A0C(int i) {
        C256703wD.A00(i, 1);
        return A08;
    }

    public final C264744Rc A0D(C264744Rc r8, int i, boolean z) {
        Object obj;
        C256703wD.A00(i, 1);
        if (z) {
            obj = A08;
        } else {
            obj = null;
        }
        r8.A02(this.A00, (Object) null, 0, obj);
        return r8;
    }

    public final AnonymousClass4RE A0E(AnonymousClass4RE r22, int i, long j) {
        C256703wD.A00(i, 1);
        Object obj = AnonymousClass4RE.A0H;
        AnonymousClass4RL r3 = this.A05;
        long j2 = this.A01;
        long j3 = this.A03;
        boolean z = this.A06;
        r22.A00((AnonymousClass4RO) null, r3, obj, (Object) null, 0, j2, j3, -9223372036854775807L, 0, this.A02, 0, z, false);
        return r22;
    }

    static {
        AnonymousClass4RF r1 = new AnonymousClass4RF();
        r1.A07 = "SinglePeriodTimeline";
        r1.A00 = Uri.EMPTY;
        A07 = r1.A00();
    }

    public final int A06(Object obj) {
        if (A08.equals(obj)) {
            return 0;
        }
        return -1;
    }

    public C295955pB(AnonymousClass4RL r4, long j, boolean z, boolean z2) {
        AnonymousClass4RO r2;
        if (z2) {
            r2 = r4.A02;
        } else {
            r2 = null;
        }
        this.A01 = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
        this.A00 = j;
        this.A02 = j;
        this.A06 = z;
        this.A05 = r4;
        this.A04 = r2;
    }
}
