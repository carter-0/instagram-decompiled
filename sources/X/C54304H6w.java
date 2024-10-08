package X;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.H6w  reason: case insensitive filesystem */
public final class C54304H6w extends C266444Yx {
    public final int A00;
    public final int A01;
    public final Object[] A02;

    public final CharSequence A01(Resources resources) {
        String quantityString;
        Object[] objArr = this.A02;
        int length = objArr.length;
        if (length == 0) {
            quantityString = resources.getQuantityString(this.A01, this.A00);
        } else {
            int i = 0;
            while (objArr[i] instanceof C266444Yx) {
                i++;
                if (i >= length) {
                    ArrayList A0v = DbS.A0v(length);
                    int i2 = 0;
                    do {
                        Object obj = objArr[i2];
                        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.common.mvvm.StringWrapper");
                        C266444Yx r1 = (C266444Yx) obj;
                        AnonymousClass7TF.A1H(resources, r1);
                        A0v.add(r1.A00(resources));
                        i2++;
                    } while (i2 < length);
                    CharSequence[] charSequenceArr = (CharSequence[]) A0v.toArray(new CharSequence[0]);
                    String quantityString2 = resources.getQuantityString(this.A01, this.A00, Arrays.copyOf(charSequenceArr, charSequenceArr.length));
                    0qQ.A0A(quantityString2);
                    return quantityString2;
                }
            }
            quantityString = resources.getQuantityString(this.A01, this.A00, Arrays.copyOf(objArr, length));
        }
        0qQ.A07(quantityString);
        return quantityString;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && 0qQ.A0K(getClass(), obj.getClass())) {
                C54304H6w h6w = (C54304H6w) obj;
                if (!(this.A01 == h6w.A01 && this.A00 == h6w.A00 && Arrays.equals(this.A02, h6w.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A01 * 31) + this.A00) * 31) + Arrays.hashCode(this.A02);
    }

    public C54304H6w(Object[] objArr, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = objArr;
    }
}
