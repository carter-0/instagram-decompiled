package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import com.facebook.common.math.matrix.Matrix4;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* renamed from: X.8Ks  reason: invalid class name and case insensitive filesystem */
public final class C354118Ks implements C354078Ko {
    public FilterGroupModel A00;
    public Matrix4 A01 = new Matrix4();
    public final UserSession A02;
    public final AnonymousClass8KM A03;

    public final void DYe() {
        TransformMatrixConfig C9T = this.A03.C9T();
        if (C9T != null) {
            Matrix4 matrix4 = this.A01;
            synchronized (C9T) {
                0qQ.A0B(matrix4, 0);
                matrix4.A04(C9T.A00().A08);
            }
            FilterGroupModel filterGroupModel = this.A00;
            if (filterGroupModel != null) {
                C366708pX.A02(((FilterGroupModelImpl) filterGroupModel).A02, matrix4.A01);
                if (C366738pa.A00(this.A02)) {
                    FilterGroupModel filterGroupModel2 = this.A00;
                    if (filterGroupModel2 != null) {
                        FilterChain filterChain = ((FilterGroupModelImpl) filterGroupModel2).A02;
                        TransformMatrixParams transformMatrixParams = C9T.A08;
                        0qQ.A0B(transformMatrixParams, 1);
                        filterChain.A03.A00(transformMatrixParams);
                        return;
                    }
                } else {
                    return;
                }
            }
            0qQ.A0F("filterGroupModel");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public C354118Ks(UserSession userSession, AnonymousClass8KM r3) {
        this.A02 = userSession;
        this.A03 = r3;
    }
}
