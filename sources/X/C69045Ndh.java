package X;

import com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments;

/* renamed from: X.Ndh  reason: case insensitive filesystem */
public final class C69045Ndh extends C71885OsT {
    public final RtcStartCoWatchPlaybackArguments A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C69045Ndh) {
                C69045Ndh ndh = (C69045Ndh) obj;
                if (!0qQ.A0K(this.A00, ndh.A00) || !0qQ.A0K(this.A01, ndh.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A00) + AnonymousClass7TG.A0E(this.A01);
    }

    public C69045Ndh(RtcStartCoWatchPlaybackArguments rtcStartCoWatchPlaybackArguments, String str) {
        this.A00 = rtcStartCoWatchPlaybackArguments;
        this.A01 = str;
    }
}
