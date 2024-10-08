package X;

import android.opengl.Matrix;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SplitScreenFilter;

/* renamed from: X.8r9  reason: invalid class name */
public final class AnonymousClass8r9 implements C366548pF {
    public C366548pF A00;
    public C366548pF A01;
    public final C366518pA A02;
    public final SplitScreenFilter A03;
    public final float[] A04 = new float[16];

    public AnonymousClass8r9(C366518pA r2, SplitScreenFilter splitScreenFilter) {
        0qQ.A0B(splitScreenFilter, 1);
        this.A03 = splitScreenFilter;
        this.A02 = r2;
    }

    public final void ABv(FilterManagerImpl filterManagerImpl, C346337v0 r2, String str) {
    }

    public final void AC0(FilterManagerImpl filterManagerImpl) {
        0qQ.A0B(filterManagerImpl, 0);
        SplitScreenFilter splitScreenFilter = this.A03;
        if (filterManagerImpl.mCachedModel != splitScreenFilter) {
            filterManagerImpl.mCachedModel = splitScreenFilter;
            filterManagerImpl.createSplitScreenFilter();
        }
        FilterModel filterModel = splitScreenFilter.A01;
        FilterModel filterModel2 = splitScreenFilter.A03;
        if (filterModel == null && filterModel2 == null) {
            throw new RuntimeException("SplitScreenFilter requires at least one filter.");
        }
        if (filterModel == null) {
            this.A00 = null;
            filterManagerImpl.unsetSplitScreenFilterPosition(0);
        } else {
            C366548pF r0 = this.A00;
            if (r0 == null || r0.B5t() != filterModel) {
                this.A00 = this.A02.A00(filterModel);
            }
        }
        if (filterModel2 == null) {
            this.A01 = null;
            filterManagerImpl.unsetSplitScreenFilterPosition(1);
        } else {
            C366548pF r02 = this.A01;
            if (r02 == null || r02.B5t() != filterModel2) {
                this.A01 = this.A02.A00(filterModel2);
            }
        }
        C366548pF r1 = this.A00;
        if (r1 != null) {
            r1.AC0(filterManagerImpl.getSubFilterManager(0));
            filterManagerImpl.syncSplitScreenFilterPosition(0);
        }
        C366548pF r12 = this.A01;
        if (r12 != null) {
            r12.AC0(filterManagerImpl.getSubFilterManager(1));
            filterManagerImpl.syncSplitScreenFilterPosition(1);
        }
    }

    public final void ACB(FilterManagerImpl filterManagerImpl, float[] fArr, float[] fArr2) {
        0qQ.A0B(filterManagerImpl, 0);
        0qQ.A0B(fArr, 1);
        float[] fArr3 = this.A04;
        SplitScreenFilter splitScreenFilter = this.A03;
        Matrix.multiplyMM(fArr3, 0, fArr, 0, splitScreenFilter.A09, 0);
        filterManagerImpl.setFloatArrayParameter("texture_transform", fArr3);
        filterManagerImpl.setFloatArrayParameter("content_transform", splitScreenFilter.A08);
    }

    public final void ACC(FilterManagerImpl filterManagerImpl) {
        0qQ.A0B(filterManagerImpl, 0);
        filterManagerImpl.setSplitScreenValue(this.A03.A00);
        C366548pF r1 = this.A00;
        if (r1 != null) {
            r1.ACC(filterManagerImpl.getSubFilterManager(0));
        }
        C366548pF r12 = this.A01;
        if (r12 != null) {
            r12.ACC(filterManagerImpl.getSubFilterManager(1));
        }
    }

    public final FilterModel B5t() {
        return this.A03;
    }
}
