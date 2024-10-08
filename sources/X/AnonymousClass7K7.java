package X;

/* renamed from: X.7K7  reason: invalid class name */
public final class AnonymousClass7K7 {
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7K7) {
                AnonymousClass7K7 r5 = (AnonymousClass7K7) obj;
                if (!(0qQ.A0K(this.A01, r5.A01) && this.A03 == r5.A03 && this.A02 == r5.A02 && 0qQ.A0K(this.A00, r5.A00) && this.A04 == r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PromptParams(inputPrompt=");
        sb.append(this.A01);
        sb.append(", isTextInputDisabled=");
        sb.append(this.A03);
        sb.append(", alwaysShowAddOn=");
        sb.append(this.A02);
        sb.append(", displayPrompt=");
        sb.append(this.A00);
        sb.append(", shouldAutoFocusTextInput=");
        sb.append(this.A04);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode;
        String str = this.A01;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        int i3 = 1237;
        if (this.A03) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A02) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        String str2 = this.A00;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i7 = (i6 + i) * 31;
        int i8 = 1237;
        if (this.A04) {
            i8 = 1231;
        }
        return i7 + i8;
    }

    public AnonymousClass7K7(String str, String str2, boolean z, boolean z2, boolean z3) {
        this.A01 = str;
        this.A03 = z;
        this.A02 = z2;
        this.A00 = str2;
        this.A04 = z3;
    }

    public AnonymousClass7K7() {
        this((String) null, (String) null, false, false, true);
    }
}
