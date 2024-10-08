package X;

import com.facebook.rsys.mediasync.gen.MediaSyncContent;
import com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments;

/* renamed from: X.Par  reason: case insensitive filesystem */
public final class C73332Par implements Runnable {
    public final /* synthetic */ RtcStartCoWatchPlaybackArguments A00;
    public final /* synthetic */ OH8 A01;
    public final /* synthetic */ 0sP A02;

    public C73332Par(RtcStartCoWatchPlaybackArguments rtcStartCoWatchPlaybackArguments, OH8 oh8, 0sP r3) {
        this.A02 = r3;
        this.A01 = oh8;
        this.A00 = rtcStartCoWatchPlaybackArguments;
    }

    public final void run() {
        0sP r3 = this.A02;
        RtcStartCoWatchPlaybackArguments rtcStartCoWatchPlaybackArguments = this.A00;
        String str = rtcStartCoWatchPlaybackArguments.A04;
        int intValue = rtcStartCoWatchPlaybackArguments.A01.intValue();
        int i = 2;
        if (intValue == 0) {
            i = 1;
        } else if (intValue != 1) {
            if (intValue == 2) {
                i = 4;
            } else {
                throw AnonymousClass7TE.A1K();
            }
        }
        r3.invoke(new N32((MediaSyncContent) null, (Integer) null, C51971G9r.A0m(), str, C70897OQp.A00(rtcStartCoWatchPlaybackArguments.A03), 0, i, 0));
    }
}
