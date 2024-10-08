package X;

import androidx.compose.ui.text.input.ImeAction;

public final class I23 {
    public static final I23 A04 = new I23((Boolean) null, -1, 0, -1);
    public final int A00;
    public final int A01;
    public final int A02;
    public final Boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof I23) {
                I23 i23 = (I23) obj;
                if (!(this.A00 == i23.A00 && 0qQ.A0K(this.A03, i23.A03) && this.A02 == i23.A02 && this.A01 == i23.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C286145Uc A00(boolean z) {
        boolean z2;
        C286145Uc r0 = C286145Uc.A06;
        int i = this.A00;
        if (i == -1) {
            i = 0;
        }
        Boolean bool = this.A03;
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            z2 = true;
        }
        int i2 = this.A02;
        if (i2 == 0) {
            i2 = 1;
        }
        int i3 = this.A01;
        if (i3 == -1) {
            i3 = 1;
        }
        return new C286145Uc(C286155Ud.A02, i, i2, i3, z, z2);
    }

    public final int hashCode() {
        return G9w.A02(((((this.A00 * 31) + C51971G9r.A0E(this.A03)) * 31) + this.A02) * 31, this.A01);
    }

    public I23(Boolean bool, int i, int i2, int i3) {
        this.A00 = i;
        this.A03 = bool;
        this.A02 = i2;
        this.A01 = i3;
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("KeyboardOptions(capitalization=");
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
        A1A.append(str);
        A1A.append(", autoCorrectEnabled=");
        A1A.append(this.A03);
        A1A.append(C273654mx.A00(1092));
        A1A.append(C54755HRn.A00(this.A02));
        A1A.append(C273654mx.A00(1074));
        A1A.append(ImeAction.A00(this.A01));
        A1A.append(C273654mx.A00(1118));
        A1A.append((Object) null);
        A1A.append("showKeyboardOnFocus=");
        A1A.append((Object) null);
        A1A.append(C273654mx.A00(1073));
        return AnonymousClass7TG.A0n((Object) null, A1A);
    }
}
