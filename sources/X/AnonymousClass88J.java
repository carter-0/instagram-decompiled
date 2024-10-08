package X;

import android.graphics.Bitmap;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.ui.widget.textureview.MultiListenerTextureView;

/* renamed from: X.88J  reason: invalid class name */
public final /* synthetic */ class AnonymousClass88J implements 1MD {
    public final /* synthetic */ View A00;
    public final /* synthetic */ MultiListenerTextureView A01;
    public final /* synthetic */ MultiListenerTextureView A02;
    public final /* synthetic */ AnonymousClass80R A03;

    public /* synthetic */ AnonymousClass88J(View view, MultiListenerTextureView multiListenerTextureView, MultiListenerTextureView multiListenerTextureView2, AnonymousClass80R r4) {
        this.A03 = r4;
        this.A00 = view;
        this.A01 = multiListenerTextureView;
        this.A02 = multiListenerTextureView2;
    }

    public final Object apply(Object obj) {
        AnonymousClass80G r1;
        ViewStub viewStub;
        AnonymousClass80R r0 = this.A03;
        View view = this.A00;
        MultiListenerTextureView multiListenerTextureView = this.A01;
        MultiListenerTextureView multiListenerTextureView2 = this.A02;
        Bitmap bitmap = (Bitmap) obj;
        if (182.A06(0Tu.A05, r0.A0R, 2342174154750444458L)) {
            SurfaceView surfaceView = (SurfaceView) view.findViewById(R.id.camera_video_preview_surface_view);
            if (surfaceView == null && ((viewStub = (ViewStub) view.findViewById(R.id.camera_video_preview_surface_view_stub)) == null || (surfaceView = (SurfaceView) viewStub.inflate().requireViewById(R.id.camera_video_preview_surface_view)) == null)) {
                MultiListenerTextureView multiListenerTextureView3 = (MultiListenerTextureView) view.findViewById(R.id.camera_video_preview_texture_view);
                if (multiListenerTextureView3 == null) {
                    multiListenerTextureView3 = (MultiListenerTextureView) ((ViewStub) view.requireViewById(R.id.camera_video_preview_texture_view_stub)).inflate().requireViewById(R.id.camera_video_preview_texture_view);
                }
                r1 = new AnonymousClass80G(multiListenerTextureView3);
            } else {
                r1 = new AnonymousClass80G(surfaceView);
            }
            if (r1.A05().getVisibility() == 0) {
                r1.A03(bitmap);
                return bitmap;
            }
        } else if (multiListenerTextureView2.getVisibility() == 0) {
            multiListenerTextureView = multiListenerTextureView2;
        }
        multiListenerTextureView.getBitmap(bitmap);
        return bitmap;
    }
}
