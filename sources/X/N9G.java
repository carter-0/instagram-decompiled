package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

public final class N9G extends AnonymousClass0T0 implements C74269Prx {
    public final long A00;
    public final ImageUrl A01;
    public final Integer A02;
    public final String A03;
    public final List A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N9G) {
                N9G n9g = (N9G) obj;
                if (!(this.A06 == n9g.A06 && this.A02 == n9g.A02 && 0qQ.A0K(this.A04, n9g.A04) && this.A05 == n9g.A05 && this.A07 == n9g.A07 && this.A0B == n9g.A0B && this.A0A == n9g.A0A && this.A00 == n9g.A00 && 0qQ.A0K(this.A03, n9g.A03) && this.A08 == n9g.A08 && 0qQ.A0K(this.A01, n9g.A01) && this.A09 == n9g.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0D;
        int A052 = C51965G9l.A05(this.A06);
        Integer num = this.A02;
        if (num == null) {
            A0D = 0;
        } else {
            A0D = C51971G9r.A0D(num, O2M.A00(num));
        }
        return DbS.A06(this.A09, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A08(this.A03, C51972G9s.A07(this.A00, AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A09(this.A0B, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A07(this.A04, (A052 + A0D) * 31))))))))));
    }

    public N9G(ImageUrl imageUrl, Integer num, String str, List list, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A06 = z;
        this.A02 = num;
        this.A04 = list;
        this.A05 = z2;
        this.A07 = z3;
        this.A0B = z4;
        this.A0A = z5;
        this.A00 = j;
        this.A03 = str;
        this.A08 = z6;
        this.A01 = imageUrl;
        this.A09 = z7;
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RtcCallEndStateModel(isCallEnded=");
        A1A.append(this.A06);
        A1A.append(", endReason=");
        Integer num = this.A02;
        if (num != null) {
            str = O2M.A00(num);
        } else {
            str = "null";
        }
        A1A.append(str);
        A1A.append(", endScreenAvatarUrls=");
        A1A.append(this.A04);
        A1A.append(", isAudioCall=");
        A1A.append(this.A05);
        A1A.append(", isGroupCall=");
        A1A.append(this.A07);
        A1A.append(", wasConnected=");
        A1A.append(this.A0B);
        A1A.append(", wasReconnecting=");
        A1A.append(this.A0A);
        A1A.append(", inCallDurationMs=");
        A1A.append(this.A00);
        A1A.append(", callTargetName=");
        A1A.append(this.A03);
        A1A.append(", requestUserFeedback=");
        A1A.append(this.A08);
        A1A.append(", ownAvatarUrl=");
        A1A.append(this.A01);
        A1A.append(", videoParticipantWasEverPresent=");
        return G9t.A1C(A1A, this.A09);
    }
}
