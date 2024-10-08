package X;

import android.graphics.Point;
import android.util.SparseArray;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;

/* renamed from: X.8pE  reason: invalid class name and case insensitive filesystem */
public final class C366538pE implements C366548pF {
    public final SparseArray A00 = new SparseArray();
    public final C366518pA A01;
    public final FilterChain A02;
    public final boolean A03;

    public final void ABv(FilterManagerImpl filterManagerImpl, C346337v0 r7, String str) {
        SparseArray sparseArray = this.A00;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            C366548pF r1 = (C366548pF) sparseArray.valueAt(i);
            if (r1 != null) {
                r1.ABv(filterManagerImpl.getSubFilterManager(keyAt), r7, str);
            }
        }
    }

    public final void AC0(FilterManagerImpl filterManagerImpl) {
        FilterChain filterChain = this.A02;
        if (filterManagerImpl.mCachedModel != filterChain) {
            filterManagerImpl.mCachedModel = filterChain;
            filterManagerImpl.createFilterChain();
        }
        SparseArray sparseArray = this.A00;
        SparseArray sparseArray2 = filterChain.A01;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray2.keyAt(i);
            if (sparseArray2.get(keyAt) == null) {
                filterManagerImpl.unsetFilterChainPosition(keyAt);
            }
            sparseArray.put(keyAt, (Object) null);
        }
        int size2 = sparseArray2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            int keyAt2 = sparseArray2.keyAt(i2);
            FilterModel filterModel = (FilterModel) sparseArray2.get(keyAt2);
            if (filterModel != null) {
                C366548pF r1 = (C366548pF) sparseArray.get(keyAt2);
                if (r1 == null || r1.B5t() != filterModel) {
                    r1 = this.A01.A00(filterModel);
                    sparseArray.put(keyAt2, r1);
                }
                r1.AC0(filterManagerImpl.getSubFilterManager(keyAt2));
                filterManagerImpl.syncFilterChainPosition(keyAt2);
                Object obj = sparseArray2.get(keyAt2);
                obj.getClass();
                filterManagerImpl.setFilterChainPositionEnabled(keyAt2, ((FilterModel) obj).isEnabled());
                Point point = (Point) filterChain.A02.get(keyAt2);
                if (point != null) {
                    filterManagerImpl.setFilterChainOutputSize(keyAt2, point.x, point.y);
                }
            }
        }
    }

    public final void ACB(FilterManagerImpl filterManagerImpl, float[] fArr, float[] fArr2) {
        if (this.A03) {
            SparseArray sparseArray = this.A00;
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int keyAt = sparseArray.keyAt(i);
                C366548pF r2 = (C366548pF) sparseArray.get(keyAt);
                if (r2 != null) {
                    FilterManagerImpl subFilterManager = filterManagerImpl.getSubFilterManager(keyAt);
                    float[] fArr3 = C366498p3.A01;
                    r2.ACB(subFilterManager, fArr3, fArr3);
                }
            }
            return;
        }
        SparseArray sparseArray2 = this.A00;
        int size2 = sparseArray2.size();
        boolean z = false;
        for (int i2 = 0; i2 < size2; i2++) {
            int keyAt2 = sparseArray2.keyAt(i2);
            C366548pF r22 = (C366548pF) sparseArray2.get(keyAt2);
            if (r22 != null) {
                if (z || !r22.B5t().isEnabled()) {
                    FilterManagerImpl subFilterManager2 = filterManagerImpl.getSubFilterManager(keyAt2);
                    float[] fArr4 = C366498p3.A01;
                    r22.ACB(subFilterManager2, fArr4, fArr4);
                } else {
                    r22.ACB(filterManagerImpl.getSubFilterManager(keyAt2), fArr, fArr2);
                    z = true;
                }
            }
        }
    }

    public final void ACC(FilterManagerImpl filterManagerImpl) {
        SparseArray sparseArray = this.A00;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            C366548pF r1 = (C366548pF) sparseArray.valueAt(i);
            if (r1 != null) {
                r1.ACC(filterManagerImpl.getSubFilterManager(keyAt));
            }
        }
    }

    public final FilterModel B5t() {
        return this.A02;
    }

    public C366538pE(C366518pA r2, FilterChain filterChain, boolean z) {
        this.A02 = filterChain;
        this.A01 = r2;
        this.A03 = z;
    }
}
