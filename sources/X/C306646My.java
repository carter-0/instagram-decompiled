package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.6My  reason: invalid class name and case insensitive filesystem */
public final class C306646My implements C2365734g {
    public final /* synthetic */ C306636Mx A00;

    public C306646My(C306636Mx r1) {
        this.A00 = r1;
    }

    public final void DKS(View view) {
        0qQ.A0B(view, 0);
        C306636Mx r1 = this.A00;
        r1.A02 = view.requireViewById(R.id.title_text);
        r1.A01 = view.requireViewById(R.id.subtitle_text);
        r1.A00 = view.requireViewById(R.id.create_story_button);
        r1.A03 = (CircularImageView) view.requireViewById(R.id.avatar_image_view);
    }
}
