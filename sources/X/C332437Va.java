package X;

import com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments;

/* renamed from: X.7Va  reason: invalid class name and case insensitive filesystem */
public final class C332437Va implements C332447Vb {
    public C331537Rj A00;
    public RtcStartCoWatchPlaybackArguments A01;
    public Boolean A02;
    public boolean A03 = true;
    public final 0sJ A04;

    public C332437Va(0sJ r2) {
        this.A04 = r2;
    }

    public final void Ewl(String str) {
        if (this.A03) {
            0KC.A0Q(AnonymousClass000.A00(441), "DirectStartCallDelegate.startCall called while in cleared state. Entry point: %s", new Object[]{this.A00});
            return;
        }
        0sJ r4 = this.A04;
        C331537Rj r3 = this.A00;
        if (r3 != null) {
            Boolean bool = this.A02;
            if (bool != null) {
                r4.invoke(r3, bool, this.A01, (Object) null);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
