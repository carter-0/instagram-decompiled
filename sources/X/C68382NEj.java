package X;

import android.text.Editable;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/* renamed from: X.NEj  reason: case insensitive filesystem */
public final class C68382NEj extends C68383NEk {
    public final float A00;
    public final int A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68382NEj(Editable editable, DisplayMetrics displayMetrics, int i, int i2, int i3) {
        super(displayMetrics, 1);
        String obj = editable.subSequence(i, i2).toString();
        int length = obj.length();
        String str = "";
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = obj.charAt(i4);
            if (!Character.isDigit(charAt)) {
                break;
            }
            str = 002.A0C(str, charAt);
        }
        int i5 = 1;
        if (str.length() != 0 && !str.equals("0")) {
            i5 = Integer.parseInt(str);
        }
        this.A02 = 4;
        this.A01 = i5;
        this.A01 = i3;
        this.A00 = TypedValue.applyDimension(2, 23.0f, displayMetrics);
    }

    public final String A01() {
        int i = this.A02;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        int i2 = this.A01;
        if (i == 4) {
            A1A.append(i2);
        } else {
            StringBuilder A1A2 = AnonymousClass7TE.A1A();
            while (i2 > 0) {
                int i3 = i2 - 1;
                A1A2.append((char) ((i3 % 26) + 97));
                i2 = i3 / 26;
            }
            A1A2.reverse();
            A1A.append(A1A2.toString());
        }
        return AnonymousClass7TF.A0l(".", A1A);
    }
}
