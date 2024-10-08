package X;

import com.instagram.model.rtc.RtcCallKey;
import java.util.List;

/* renamed from: X.N3c  reason: case insensitive filesystem */
public final class C68162N3c extends AnonymousClass0T0 {
    public final C69277Nid A00;
    public final C69278Nie A01;
    public final RtcCallKey A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final boolean A08;
    public final Integer A09;
    public final String A0A;
    public final boolean A0B;
    public final boolean A0C;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68162N3c) {
                C68162N3c n3c = (C68162N3c) obj;
                if (!0qQ.A0K(this.A02, n3c.A02) || !0qQ.A0K(this.A05, n3c.A05) || this.A00 != n3c.A00 || this.A01 != n3c.A01 || !0qQ.A0K(this.A03, n3c.A03) || this.A0C != n3c.A0C || this.A0B != n3c.A0B || !0qQ.A0K(this.A07, n3c.A07) || this.A08 != n3c.A08 || !0qQ.A0K(this.A04, n3c.A04) || !0qQ.A0K(this.A06, n3c.A06) || this.A09 != n3c.A09 || !0qQ.A0K(this.A0A, n3c.A0A)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C68162N3c(C69277Nid nid, C69278Nie nie, RtcCallKey rtcCallKey, Integer num, String str, String str2, String str3, String str4, String str5, List list, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(str4, 11);
        this.A02 = rtcCallKey;
        this.A05 = str;
        this.A00 = nid;
        this.A01 = nie;
        this.A03 = str2;
        this.A0C = z;
        this.A0B = z2;
        this.A07 = list;
        this.A08 = z3;
        this.A04 = str3;
        this.A06 = str4;
        this.A09 = num;
        this.A0A = str5;
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A08(this.A05, AnonymousClass7TE.A0K(this.A02)));
        int A082 = AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A07(this.A07, AnonymousClass7TF.A09(this.A0B, AnonymousClass7TF.A09(this.A0C, (AnonymousClass7TF.A07(this.A01, A072) + AnonymousClass7TG.A0E(this.A03)) * 31)))));
        return C41845B3m.A01(this.A0A, (AnonymousClass7TF.A08(this.A06, A082) + OR0.A00(this.A09)) * 31);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RtcCallJoinParams(callKey=");
        A1A.append(this.A02);
        A1A.append(", threadId=");
        A1A.append(this.A05);
        A1A.append(", e2eeCallType=");
        A1A.append(this.A00);
        A1A.append(", e2eeInfraOnlyExpGroup=");
        A1A.append(this.A01);
        A1A.append(", callTarget=");
        A1A.append(this.A03);
        A1A.append(", isGroupCall=");
        A1A.append(this.A0C);
        A1A.append(", isFromIncomingCall=");
        A1A.append(this.A0B);
        A1A.append(", avatarUrls=");
        A1A.append(this.A07);
        A1A.append(", startWithVideo=");
        A1A.append(this.A08);
        A1A.append(", source=");
        A1A.append(this.A04);
        A1A.append(", waterfallId=");
        A1A.append(this.A06);
        A1A.append(", callType=");
        A1A.append(OR0.A01(this.A09));
        A1A.append(", callerAvatarUrl=");
        return C51975G9x.A0i(this.A0A, A1A);
    }
}
