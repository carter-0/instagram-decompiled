package X;

import android.util.SparseArray;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterGroup;

public final class ARI implements C366548pF {
    public final SparseArray A00 = new SparseArray();
    public final C366518pA A01;
    public final FilterGroup A02;

    public final void ABv(FilterManagerImpl filterManagerImpl, C346337v0 r2, String str) {
    }

    public final void AC0(FilterManagerImpl filterManagerImpl) {
        FilterGroup filterGroup = this.A02;
        if (filterManagerImpl.mCachedModel != filterGroup) {
            filterManagerImpl.mCachedModel = filterGroup;
            filterManagerImpl.createFilterGroup();
        }
        SparseArray sparseArray = this.A00;
        SparseArray sparseArray2 = filterGroup.A01;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray2.keyAt(i);
            if (sparseArray2.get(keyAt) == null) {
                filterManagerImpl.unsetFilterGroupPosition(keyAt);
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
                filterManagerImpl.syncFilterGroupPosition(keyAt2);
                Object obj = sparseArray2.get(keyAt2);
                obj.getClass();
                filterManagerImpl.setFilterGroupPositionEnabled(keyAt2, ((FilterModel) obj).isEnabled());
                if (keyAt2 == 27 && filterModel.isEnabled()) {
                    filterManagerImpl.setFilterUseOutputFromGroup(keyAt2, false);
                }
            }
        }
    }

    public final void ACB(FilterManagerImpl filterManagerImpl, float[] fArr, float[] fArr2) {
        SparseArray sparseArray = this.A00;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            C366548pF r1 = (C366548pF) sparseArray.get(keyAt);
            if (r1 != null) {
                r1.ACB(filterManagerImpl.getSubFilterManager(keyAt), fArr, fArr2);
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

    public ARI(C366518pA r2, FilterGroup filterGroup) {
        this.A02 = filterGroup;
        this.A01 = r2;
    }
}
