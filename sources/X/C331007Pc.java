package X;

import java.util.Set;

/* renamed from: X.7Pc  reason: invalid class name and case insensitive filesystem */
public final class C331007Pc extends AnonymousClass0T0 implements C232262tL, C331837So {
    public final int A00;
    public final int A01;
    public final long A02;
    public final String A03;
    public final String A04;
    public final Set A05;
    public final Set A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final int A0F = 32;

    public C331007Pc(String str, Set set, Set set2, int i, int i2, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        0qQ.A0B(str, 7);
        this.A05 = set;
        this.A06 = set2;
        this.A0E = z;
        this.A0A = z2;
        this.A0B = z3;
        this.A07 = z4;
        this.A03 = str;
        this.A02 = j;
        this.A0D = z5;
        this.A0C = z6;
        this.A01 = i;
        this.A00 = i2;
        this.A08 = z7;
        this.A04 = String.valueOf(j);
        boolean z8 = true;
        if (set.size() <= 2 && set2.size() <= 1 && (!(!set.isEmpty()) || !(!set2.isEmpty()))) {
            z8 = false;
        }
        this.A09 = z8;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C331007Pc) {
                C331007Pc r8 = (C331007Pc) obj;
                if (!(0qQ.A0K(this.A05, r8.A05) && 0qQ.A0K(this.A06, r8.A06) && this.A0E == r8.A0E && this.A0A == r8.A0A && this.A0B == r8.A0B && this.A07 == r8.A07 && 0qQ.A0K(this.A03, r8.A03) && this.A02 == r8.A02 && this.A0D == r8.A0D && this.A0C == r8.A0C && this.A01 == r8.A01 && this.A00 == r8.A00 && this.A08 == r8.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SeenIndicatorViewModel(seenItems=");
        sb.append(this.A05);
        sb.append(", watchedItems=");
        sb.append(this.A06);
        sb.append(", watchedByAll=");
        sb.append(this.A0E);
        sb.append(", isExpanded=");
        sb.append(this.A0A);
        sb.append(", isGroup=");
        sb.append(this.A0B);
        sb.append(", isBroadcastChat=");
        sb.append(this.A07);
        sb.append(", messageId=");
        sb.append(this.A03);
        sb.append(", timestampMicro=");
        sb.append(this.A02);
        sb.append(", isMessageLevelSeenStateEnabled=");
        sb.append(this.A0D);
        sb.append(", isLastItemInList=");
        sb.append(this.A0C);
        sb.append(", seenIndicatorTextColor=");
        sb.append(this.A01);
        sb.append(", seenCount=");
        sb.append(this.A00);
        sb.append(", isCustomTheme=");
        sb.append(this.A08);
        sb.append(')');
        return sb.toString();
    }

    public final long C7Z() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A04;
    }

    public final int getType() {
        return this.A0F;
    }

    public final int hashCode() {
        int hashCode = ((this.A05.hashCode() * 31) + this.A06.hashCode()) * 31;
        int i = 1237;
        if (this.A0E) {
            i = 1231;
        }
        int i2 = (hashCode + i) * 31;
        int i3 = 1237;
        if (this.A0A) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A0B) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A07) {
            i7 = 1231;
        }
        long j = this.A02;
        int hashCode2 = (((((i6 + i7) * 31) + this.A03.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        int i8 = 1237;
        if (this.A0D) {
            i8 = 1231;
        }
        int i9 = (hashCode2 + i8) * 31;
        int i10 = 1237;
        if (this.A0C) {
            i10 = 1231;
        }
        int i11 = (((((i9 + i10) * 31) + this.A01) * 31) + this.A00) * 31;
        int i12 = 1237;
        if (this.A08) {
            i12 = 1231;
        }
        return i11 + i12;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
