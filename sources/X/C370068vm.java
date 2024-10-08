package X;

import android.util.SparseArray;
import java.io.IOException;

/* renamed from: X.8vm  reason: invalid class name and case insensitive filesystem */
public abstract class C370068vm {
    public static final C370078vn A00(16F r3) {
        SparseArray sparseArray = new SparseArray();
        if (r3.A11() != 16L.A0D) {
            throw new IOException("failed to parse region tracking edits");
        }
        while (r3.A1J() != 16L.A09) {
            String A1P = r3.A1P();
            r3.A1J();
            0qQ.A0A(A1P);
            sparseArray.put(Integer.parseInt(A1P), C273904nN.parseFromJson(r3));
        }
        C370078vn r0 = new C370078vn();
        r0.A00 = sparseArray;
        return r0;
    }

    public static final void A01(SparseArray sparseArray, 17Z r4) {
        r4.A0c();
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            r4.A0q(String.valueOf(sparseArray.keyAt(i)));
            C273904nN.A00(r4, (C273914nO) sparseArray.valueAt(i));
        }
        r4.A0Z();
    }
}
