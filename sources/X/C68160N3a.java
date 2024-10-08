package X;

import com.instagram.rtc.signaling.models.RtcConnectionEntity;

/* renamed from: X.N3a  reason: case insensitive filesystem */
public final class C68160N3a extends AnonymousClass0T0 {
    public final int A00 = 1910377639;
    public final C74562PxB A01;
    public final C69277Nid A02;
    public final RtcConnectionEntity.RtcCallConnectionEntity A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final Integer A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68160N3a) {
                C68160N3a n3a = (C68160N3a) obj;
                if (!0qQ.A0K(this.A08, n3a.A08) || this.A02 != n3a.A02 || !0qQ.A0K(this.A06, n3a.A06) || !0qQ.A0K(this.A04, n3a.A04) || this.A09 != n3a.A09 || this.A0A != n3a.A0A || !0qQ.A0K(this.A05, n3a.A05) || !0qQ.A0K(this.A07, n3a.A07) || !0qQ.A0K(this.A03, n3a.A03) || this.A00 != n3a.A00 || this.A0B != n3a.A0B || !0qQ.A0K(this.A01, n3a.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0O(this.A08));
        int A092 = AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A09(this.A09, (AnonymousClass7TF.A08(this.A06, A072) + AnonymousClass7TG.A0E(this.A04)) * 31));
        return ((((AnonymousClass7TF.A07(this.A03, (AnonymousClass7TF.A08(this.A05, A092) + AnonymousClass7TG.A0E(this.A07)) * 31) + this.A00) * 31) + OR0.A00(this.A0B)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public C68160N3a(C74562PxB pxB, C69277Nid nid, RtcConnectionEntity.RtcCallConnectionEntity rtcCallConnectionEntity, Integer num, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        this.A08 = str;
        this.A02 = nid;
        this.A06 = str2;
        this.A04 = str3;
        this.A09 = z;
        this.A0A = z2;
        this.A05 = str4;
        this.A07 = str5;
        this.A03 = rtcCallConnectionEntity;
        this.A0B = num;
        this.A01 = pxB;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RtcCallIncomingParams(threadId=");
        A1A.append(this.A08);
        A1A.append(", e2eeCallType=");
        A1A.append(this.A02);
        A1A.append(", callerName=");
        A1A.append(this.A06);
        A1A.append(", callTarget=");
        A1A.append(this.A04);
        A1A.append(", isAudioCall=");
        A1A.append(this.A09);
        A1A.append(", isGroupCall=");
        A1A.append(this.A0A);
        A1A.append(", callerAvatarUrl=");
        A1A.append(this.A05);
        A1A.append(", notificationTag=");
        A1A.append(this.A07);
        A1A.append(", connectionEntity=");
        A1A.append(this.A03);
        A1A.append(", notificationId=");
        A1A.append(this.A00);
        A1A.append(", callType=");
        A1A.append(OR0.A01(this.A0B));
        A1A.append(", trace=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
