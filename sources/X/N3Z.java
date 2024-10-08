package X;

import com.instagram.model.rtc.RtcCallSource;
import com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments;
import java.util.List;

public final class N3Z extends AnonymousClass0T0 {
    public final C69277Nid A00;
    public final RtcCallSource A01;
    public final RtcStartCoWatchPlaybackArguments A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final List A07;
    public final boolean A08;
    public final boolean A09;
    public final Integer A0A;
    public final String A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N3Z) {
                N3Z n3z = (N3Z) obj;
                if (!0qQ.A0K(this.A04, n3z.A04) || !0qQ.A0K(this.A05, n3z.A05) || this.A00 != n3z.A00 || !0qQ.A0K(this.A07, n3z.A07) || !0qQ.A0K(this.A06, n3z.A06) || !0qQ.A0K(this.A03, n3z.A03) || !0qQ.A0K(this.A02, n3z.A02) || this.A09 != n3z.A09 || this.A08 != n3z.A08 || !0qQ.A0K(this.A01, n3z.A01) || this.A0A != n3z.A0A || !0qQ.A0K(this.A0B, n3z.A0B)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A06, AnonymousClass7TF.A07(this.A07, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A08(this.A05, AnonymousClass7TE.A0O(this.A04)))));
        int A092 = AnonymousClass7TF.A09(this.A08, G9w.A01(AnonymousClass7TF.A09(this.A09, (AnonymousClass7TF.A08(this.A03, A072) + AnonymousClass7TG.A0C(this.A02)) * 31)));
        return C41845B3m.A01(this.A0B, (AnonymousClass7TF.A07(this.A01, A092) + OR0.A00(this.A0A)) * 31);
    }

    public N3Z(C69277Nid nid, RtcCallSource rtcCallSource, RtcStartCoWatchPlaybackArguments rtcStartCoWatchPlaybackArguments, Integer num, String str, String str2, String str3, String str4, List list, List list2, boolean z, boolean z2) {
        this.A04 = str;
        this.A05 = str2;
        this.A00 = nid;
        this.A07 = list;
        this.A06 = list2;
        this.A03 = str3;
        this.A02 = rtcStartCoWatchPlaybackArguments;
        this.A09 = z;
        this.A08 = z2;
        this.A01 = rtcCallSource;
        this.A0A = num;
        this.A0B = str4;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RtcCallCreateParams(threadId=");
        A1A.append(this.A04);
        A1A.append(", threadIdV2=");
        A1A.append(this.A05);
        A1A.append(", e2eeCallType=");
        A1A.append(this.A00);
        A1A.append(", calleeUserIds=");
        A1A.append(this.A07);
        A1A.append(", avatarUrls=");
        A1A.append(this.A06);
        A1A.append(", callTarget=");
        A1A.append(this.A03);
        A1A.append(", coWatchArguments=");
        A1A.append(this.A02);
        A1A.append(", startedInShhMode=");
        A1A.append(this.A09);
        C51975G9x.A1G(A1A, ", isDropIn=");
        A1A.append(", isAudioCall=");
        A1A.append(this.A08);
        A1A.append(", source=");
        A1A.append(this.A01);
        A1A.append(", callType=");
        A1A.append(OR0.A01(this.A0A));
        A1A.append(", callerAvatarUrl=");
        return C51975G9x.A0i(this.A0B, A1A);
    }
}
