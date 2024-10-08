package X;

import android.net.Uri;
import com.google.android.exoplayer2.Timeline;

/* renamed from: X.5pA  reason: invalid class name and case insensitive filesystem */
public final class C295945pA extends C265154St {
    public C250823m7 A00;
    public final long A01;
    public final C256683wB A02;
    public final Timeline A03;
    public final AnonymousClass4SX A04;
    public final C257263x7 A05;
    public final C265084Sm A06;

    public final void A0D() {
    }

    public final void Cnl() {
    }

    public final void A0E(C250823m7 r2) {
        this.A00 = r2;
        A0C(this.A03);
    }

    public final AnonymousClass4TH AMb(C264874Rq r10, AnonymousClass4QW r11, long j) {
        C257263x7 r4 = this.A05;
        AnonymousClass4SX r3 = this.A04;
        C250823m7 r6 = this.A00;
        C256683wB r1 = this.A02;
        long j2 = this.A01;
        return new C284835Ol(r1, A09(r10), r3, r4, this.A06, r6, j2);
    }

    public final AnonymousClass4RL BQS() {
        return null;
    }

    public final void ECj(AnonymousClass4TH r3) {
        ((C284835Ol) r3).A08.A03((AnonymousClass4TR) null);
    }

    public C295945pA(Uri uri, C256683wB r5, AnonymousClass4SX r6, C265084Sm r7, long j) {
        this.A04 = r6;
        this.A02 = r5;
        this.A01 = j;
        this.A06 = r7;
        this.A05 = new C257263x7(uri, 0, -1);
        this.A03 = new C295955pB(j);
    }
}
