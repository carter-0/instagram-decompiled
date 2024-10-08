package X;

import java.util.Arrays;

/* renamed from: X.5DP  reason: invalid class name */
public class AnonymousClass5DP {
    public final C254743sy A00;
    public final Long A01;
    public final Long A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public AnonymousClass5DP(C254743sy r2, Long l, Long l2, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
        this.A05 = z;
        this.A07 = z2;
        this.A06 = z3;
        this.A09 = z4;
        this.A0A = z5;
        this.A08 = z6;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = l;
        this.A01 = l2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !0qQ.A0K(getClass(), obj.getClass())) {
                return false;
            }
            AnonymousClass5DP r5 = (AnonymousClass5DP) obj;
            if (!(this.A05 == r5.A05 && this.A07 == r5.A07 && this.A06 == r5.A06 && this.A09 == r5.A09 && this.A0A == r5.A0A && this.A08 == r5.A08 && 0qQ.A0K(this.A00, r5.A00) && 0qQ.A0K(this.A03, r5.A03) && 0qQ.A0K(this.A04, r5.A04) && 0qQ.A0K(this.A02, r5.A02) && 0qQ.A0K(this.A01, r5.A01))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, Boolean.valueOf(this.A05), Boolean.valueOf(this.A07), Boolean.valueOf(this.A06), Boolean.valueOf(this.A09), Boolean.valueOf(this.A0A), Boolean.valueOf(this.A08), this.A03, this.A04, this.A02, this.A01});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DirectThreadBadgeInfo{threadKey=");
        sb.append(this.A00);
        sb.append(", hasUnseenPermanentMessages=");
        sb.append(this.A05);
        sb.append(", hasUnseenVisualMessages=");
        sb.append(this.A07);
        sb.append(", hasUnseenShhModeMessages=");
        sb.append(this.A06);
        sb.append(", isMarkedAsUnread=");
        sb.append(this.A09);
        sb.append(", isMuted=");
        sb.append(this.A0A);
        sb.append(", isE2ee=");
        sb.append(this.A08);
        sb.append(", lastReceivedPermanentMessageId='");
        sb.append(this.A03);
        sb.append("', lastReceivedPermanentMessageType='");
        sb.append(this.A04);
        sb.append("', lastReceivedPermanentMessageTimestampUs=");
        sb.append(this.A02);
        sb.append(", lastActivityTimestampUs=");
        sb.append(this.A01);
        sb.append('}');
        return sb.toString();
    }
}
