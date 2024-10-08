package X;

import android.util.SparseArray;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;

/* renamed from: X.9Rg  reason: invalid class name and case insensitive filesystem */
public abstract class C378799Rg {
    public static final SparseArray A00(SparseArray sparseArray) {
        0qQ.A0B(sparseArray, 0);
        SparseArray sparseArray2 = new SparseArray(sparseArray.size());
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray2.put(sparseArray.keyAt(i), ((FilterModel) sparseArray.valueAt(i)).deepCopy());
        }
        return sparseArray2;
    }
}
