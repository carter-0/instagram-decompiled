package X;

import android.graphics.Matrix;
import java.util.List;

/* renamed from: X.GoI  reason: case insensitive filesystem */
public final class C53426GoI extends AnonymousClass0T0 implements C59540JNm {
    public static final C53426GoI A07 = new C53426GoI(0sn.A00, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final List A06;

    public C53426GoI(List list, float f, float f2, float f3, float f4, float f5, float f6) {
        0qQ.A0B(list, 7);
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = f4;
        this.A04 = f5;
        this.A05 = f6;
        this.A06 = list;
    }

    public final void AC6(Matrix matrix) {
        Matrix matrix2 = new Matrix();
        float[] fArr = new float[9];
        matrix2.getValues(fArr);
        fArr[0] = this.A00;
        fArr[1] = this.A02;
        fArr[2] = this.A04;
        fArr[3] = this.A01;
        fArr[4] = this.A03;
        fArr[5] = this.A05;
        matrix2.setValues(fArr);
        List list = this.A06;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C59540JNm) list.get(i)).AC6(matrix2);
        }
        matrix.postConcat(matrix2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53426GoI) {
                C53426GoI goI = (C53426GoI) obj;
                if (!(Float.compare(this.A00, goI.A00) == 0 && Float.compare(this.A01, goI.A01) == 0 && Float.compare(this.A02, goI.A02) == 0 && Float.compare(this.A03, goI.A03) == 0 && Float.compare(this.A04, goI.A04) == 0 && Float.compare(this.A05, goI.A05) == 0 && 0qQ.A0K(this.A06, goI.A06))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A06, AnonymousClass7TF.A00(AnonymousClass7TF.A00(AnonymousClass7TF.A00(AnonymousClass7TF.A00(AnonymousClass7TF.A00(G9w.A00(this.A00), this.A01), this.A02), this.A03), this.A04), this.A05));
    }
}
