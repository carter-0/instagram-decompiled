package X;

import android.graphics.SurfaceTexture;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.textureview.MultiListenerTextureView;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* renamed from: X.Lk9  reason: case insensitive filesystem */
public final class C64909Lk9 implements MVM {
    public SurfaceTexture A00;
    public MultiListenerTextureView A01;
    public AnonymousClass8KS A02;
    public final UserSession A03;
    public final C364848m7 A04;

    public final void AOu() {
    }

    public final /* synthetic */ void APr(PhotoFilter photoFilter, FilterGroupModel filterGroupModel, 0sP r3, int i, int i2) {
    }

    public final void APy(PhotoFilter photoFilter, FilterGroupModel filterGroupModel) {
        FilterChain A002;
        String str;
        SurfaceCropFilterModel.FitTransformParams fitTransformParams;
        MultiListenerTextureView multiListenerTextureView = this.A01;
        AnonymousClass8KS r3 = this.A02;
        C364848m7 r2 = this.A04;
        if (filterGroupModel != null && r2 != null && r3 != null && multiListenerTextureView != null) {
            FilterChain filterChain = ((FilterGroupModelImpl) filterGroupModel).A02;
            C63122Krq.A00(filterChain, photoFilter.A08, (int) (photoFilter.A03.A00 * 100.0f));
            if (182.A06(0Tu.A05, this.A03, 36328564261404079L)) {
                str = "VideoCoverFrameRendererImpl_doOnScreenRender()";
                SurfaceCropFilter A003 = C395019z4.A00(filterGroupModel, str);
                if (A003 != null) {
                    fitTransformParams = new SurfaceCropFilterModel.FitTransformParams();
                    A003.A0L(fitTransformParams);
                } else {
                    fitTransformParams = null;
                }
                A002 = filterChain.deepCopy();
                SurfaceCropFilter surfaceCropFilter = new SurfaceCropFilter(false);
                surfaceCropFilter.A0P(false);
                if (fitTransformParams != null) {
                    surfaceCropFilter.A0M(fitTransformParams);
                }
                A002.A01(surfaceCropFilter.A00, 3);
            } else {
                A002 = filterChain.deepCopy();
                SurfaceCropFilter surfaceCropFilter2 = new SurfaceCropFilter(false);
                surfaceCropFilter2.A0P(false);
                A002.A01(surfaceCropFilter2.A00, 3);
                str = "VideoCoverFrameRendererImpl_doOnScreenRender()";
            }
            r2.EoR(multiListenerTextureView, r3, C395019z4.A00(filterGroupModel, str));
            r2.EWo(A002);
            r2.EEp();
        }
    }

    public final void CMr(MultiListenerTextureView multiListenerTextureView, int i, int i2) {
        SurfaceTexture surfaceTexture = this.A00;
        surfaceTexture.getClass();
        surfaceTexture.setDefaultBufferSize(i, i2);
        multiListenerTextureView.setSurfaceTexture(this.A00);
        this.A02 = new AnonymousClass8KS(new AnonymousClass80G(multiListenerTextureView));
        this.A01 = multiListenerTextureView;
    }

    public final void Ddq() {
        SurfaceTexture surfaceTexture = this.A00;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.A00 = null;
        }
    }

    public C64909Lk9(UserSession userSession, C364848m7 r4) {
        this.A03 = userSession;
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        this.A00 = surfaceTexture;
        surfaceTexture.detachFromGLContext();
        this.A04 = r4;
    }
}
