package X;

import com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments;

/* renamed from: X.AqG  reason: case insensitive filesystem */
public final class C41218AqG implements Runnable {
    public final /* synthetic */ C69465Nm9 A00;
    public final /* synthetic */ AnonymousClass7VX A01;
    public final /* synthetic */ C331537Rj A02;
    public final /* synthetic */ boolean A03;

    public C41218AqG(C69465Nm9 nm9, AnonymousClass7VX r2, C331537Rj r3, boolean z) {
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = z;
        this.A00 = nm9;
    }

    public final void run() {
        this.A01.A01(this.A00, this.A02, (RtcStartCoWatchPlaybackArguments) null, this.A03);
    }
}
