package X;

import java.lang.ref.WeakReference;

/* renamed from: X.413  reason: invalid class name */
public final class AnonymousClass413 implements Runnable {
    public final /* synthetic */ C228352lS A00;
    public final /* synthetic */ AnonymousClass2lP A01;
    public final /* synthetic */ C233632w4 A02;
    public final /* synthetic */ C238523Ce A03;
    public final /* synthetic */ Double A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public AnonymousClass413(C228352lS r1, AnonymousClass2lP r2, C233632w4 r3, C238523Ce r4, Double d, String str, String str2, boolean z) {
        this.A00 = r1;
        this.A07 = z;
        this.A05 = str;
        this.A06 = str2;
        this.A04 = d;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void run() {
        AnonymousClass2lP r0;
        C228352lS r1 = this.A00;
        Object value = r1.A0A.getValue();
        0qQ.A07(value);
        if (((Boolean) value).booleanValue()) {
            WeakReference weakReference = r1.A00;
            if (weakReference != null) {
                r0 = (AnonymousClass2lP) weakReference.get();
            } else {
                return;
            }
        } else {
            r0 = this.A01;
        }
        if (r0 != null) {
            boolean z = this.A07;
            String str = this.A05;
            String str2 = this.A06;
            Double d = this.A04;
            r0.AJj(this.A02, this.A03, d, str, str2, z);
        }
    }
}
