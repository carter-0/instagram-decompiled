package X;

import android.opengl.Matrix;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Vhv  reason: case insensitive filesystem */
public final class C17904Vhv {
    public boolean A00;
    public final C368538so A01 = new C368538so();
    public final List A02;
    public final List A03;
    public final float[] A04 = new float[16];
    public final float[] A05;
    public final C344227rW A06;

    public final void A00() {
        for (X9O release : this.A02) {
            release.release();
        }
    }

    public C17904Vhv(C344227rW r6, List list) {
        float[] fArr = new float[16];
        this.A05 = fArr;
        this.A06 = r6;
        ArrayList arrayList = new ArrayList();
        this.A02 = arrayList;
        arrayList.clear();
        if (list != null) {
            for (Object next : list) {
                if (next != null) {
                    arrayList.add(next);
                }
            }
        }
        this.A03 = new ArrayList();
        this.A00 = false;
        Matrix.setIdentityM(fArr, 0);
        float[] fArr2 = this.A04;
        Matrix.setIdentityM(fArr2, 0);
        Matrix.scaleM(fArr2, 0, 1.0f, -1.0f, 1.0f);
    }
}
