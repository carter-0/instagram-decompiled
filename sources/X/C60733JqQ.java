package X;

import java.util.Arrays;

/* renamed from: X.JqQ  reason: case insensitive filesystem */
public final class C60733JqQ extends C21289XSu {
    public final float[] A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60733JqQ) {
                C60733JqQ jqQ = (C60733JqQ) obj;
                if (!0qQ.A0K(this.A01, jqQ.A01) || !0qQ.A0K(this.A00, jqQ.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return 002.A0v("AiOutputFloatArray(type=", this.A01, ", floatArray=", Arrays.toString(this.A00), ')');
    }

    public final int hashCode() {
        int hashCode;
        int A0O = AnonymousClass7TE.A0O(this.A01);
        float[] fArr = this.A00;
        if (fArr == null) {
            hashCode = 0;
        } else {
            hashCode = Arrays.hashCode(fArr);
        }
        return A0O + hashCode;
    }

    public C60733JqQ(String str, float[] fArr) {
        this.A01 = str;
        this.A00 = fArr;
    }
}
