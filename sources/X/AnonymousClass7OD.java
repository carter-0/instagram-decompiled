package X;

import android.text.SpannableString;

/* renamed from: X.7OD  reason: invalid class name */
public final class AnonymousClass7OD extends AnonymousClass4AA implements C331837So {
    public final int A00;
    public final int A01;
    public final long A02;
    public final SpannableString A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final int A07 = 159;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7OD) {
                AnonymousClass7OD r8 = (AnonymousClass7OD) obj;
                if (!(0qQ.A0K(this.A03, r8.A03) && 0qQ.A0K(this.A04, r8.A04) && this.A00 == r8.A00 && 0qQ.A0K(this.A05, r8.A05) && this.A01 == r8.A01 && this.A06 == r8.A06 && this.A02 == r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NullStateActionLogMessageViewModel(description=");
        sb.append(this.A03);
        sb.append(", actionUri=");
        sb.append(this.A04);
        sb.append(", actionLogTextColor=");
        sb.append(this.A00);
        sb.append(", ctaText=");
        sb.append(this.A05);
        sb.append(", ctaTextColor=");
        sb.append(this.A01);
        sb.append(", backgroundEnabled=");
        sb.append(this.A06);
        sb.append(", timestampMicro=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    public final long C7Z() {
        return this.A02;
    }

    public final int getType() {
        return this.A07;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.A03.hashCode() * 31;
        String str = this.A04;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((((((hashCode2 + hashCode) * 31) + this.A00) * 31) + this.A05.hashCode()) * 31) + this.A01) * 31;
        int i = 1237;
        if (this.A06) {
            i = 1231;
        }
        int i2 = (hashCode3 + i) * 31;
        long j = this.A02;
        return i2 + ((int) (j ^ (j >>> 32)));
    }

    public AnonymousClass7OD(SpannableString spannableString, String str, String str2, int i, int i2, long j, boolean z) {
        this.A03 = spannableString;
        this.A04 = str;
        this.A00 = i;
        this.A05 = str2;
        this.A01 = i2;
        this.A06 = z;
        this.A02 = j;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
