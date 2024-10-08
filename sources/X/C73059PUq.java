package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.instagram.android.R;

/* renamed from: X.PUq  reason: case insensitive filesystem */
public final class C73059PUq implements Runnable {
    public final /* synthetic */ View A00;

    public C73059PUq(View view) {
        this.A00 = view;
    }

    public final void run() {
        View view = this.A00;
        float width = (float) view.getWidth();
        float height = (float) view.getHeight();
        float f = width / height;
        float f2 = width / 0.5625f;
        if (f < 0.5625f) {
            View A0G = AnonymousClass7TF.A0G(view, R.id.direct_visual_message_viewer_composer_container);
            View A0G2 = AnonymousClass7TF.A0G(view, R.id.direct_visual_message_viewer_self_view_footer_container);
            Context context = view.getContext();
            0qQ.A0C(context, Pxd.A00(0));
            View findViewById = ((Activity) context).findViewById(R.id.visual_timeline_container);
            int i = (int) (height - f2);
            if (findViewById != null && findViewById.getHeight() > 0) {
                AnonymousClass81Y.A00(view, i, findViewById);
            } else if (A0G2.getHeight() != 0) {
                AnonymousClass81Y.A00(view, i, A0G2);
            } else {
                AnonymousClass81Y.A00(view, i, A0G);
            }
        }
    }
}
