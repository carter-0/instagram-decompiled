package X;

import androidx.compose.ui.text.input.ImeAction;

/* renamed from: X.5Uc  reason: invalid class name and case insensitive filesystem */
public final class C286145Uc {
    public static final C286145Uc A06 = new C286145Uc(C286155Ud.A02, 0, 1, 1, false, true);
    public final int A00;
    public final int A01;
    public final int A02;
    public final C286155Ud A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C286145Uc) {
                C286145Uc r5 = (C286145Uc) obj;
                if (!(this.A05 == r5.A05 && this.A00 == r5.A00 && this.A04 == r5.A04 && this.A02 == r5.A02 && this.A01 == r5.A01 && 0qQ.A0K(this.A03, r5.A03))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A05) {
            i = 1231;
        }
        int i2 = ((i * 31) + this.A00) * 31;
        int i3 = 1237;
        if (this.A04) {
            i3 = 1231;
        }
        return ((((((i2 + i3) * 31) + this.A02) * 31) + this.A01) * 31 * 31) + this.A03.hashCode();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("ImeOptions(singleLine=");
        sb.append(this.A05);
        sb.append(", capitalization=");
        int i = this.A00;
        if (i == -1) {
            str = "Unspecified";
        } else if (i == 0) {
            str = "None";
        } else if (i == 1) {
            str = "Characters";
        } else if (i == 2) {
            str = "Words";
        } else {
            str = "Sentences";
        }
        sb.append(str);
        sb.append(", autoCorrect=");
        sb.append(this.A04);
        sb.append(", keyboardType=");
        sb.append(C54755HRn.A00(this.A02));
        sb.append(", imeAction=");
        sb.append(ImeAction.A00(this.A01));
        sb.append(", platformImeOptions=");
        sb.append((Object) null);
        sb.append(", hintLocales=");
        sb.append(this.A03);
        sb.append(')');
        return sb.toString();
    }

    public C286145Uc(C286155Ud r1, int i, int i2, int i3, boolean z, boolean z2) {
        this.A05 = z;
        this.A00 = i;
        this.A04 = z2;
        this.A02 = i2;
        this.A01 = i3;
        this.A03 = r1;
    }
}
