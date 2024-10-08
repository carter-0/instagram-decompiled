package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.creation.base.ui.ConstrainedTextureView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;
import java.lang.ref.WeakReference;
import java.util.Set;

/* renamed from: X.L7j  reason: case insensitive filesystem */
public final class C63803L7j {
    public ConstrainedTextureView A00;
    public C378369Pn A01;
    public final C39888ADk A02;
    public final MediaFrameLayout A03;

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.ADk] */
    public C63803L7j(View view) {
        WeakReference weakReference;
        ? obj = new Object();
        obj.A01(view.findViewById(R.id.play_button));
        obj.A01 = view.findViewById(R.id.seek_frame_indicator);
        SlideInAndOutIconView slideInAndOutIconView = (SlideInAndOutIconView) view.findViewById(R.id.media_indicator);
        obj.A05 = slideInAndOutIconView;
        AnonymousClass4UR r0 = new AnonymousClass4UR();
        obj.A04 = r0;
        if (slideInAndOutIconView != null) {
            weakReference = C51965G9l.A0v(slideInAndOutIconView);
        } else {
            weakReference = null;
        }
        Set set = r0.A07;
        set.clear();
        if (weakReference != null) {
            set.add(weakReference);
        }
        this.A02 = obj;
        this.A03 = (MediaFrameLayout) view.requireViewById(R.id.creation_image_container);
    }
}
