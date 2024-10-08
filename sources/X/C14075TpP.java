package X;

import android.view.View;
import com.instagram.common.ui.widget.imageview.TransitionCarouselImageView;
import java.lang.ref.Reference;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.TpP  reason: case insensitive filesystem */
public final class C14075TpP extends C252233om {
    public final Set A00 = new HashSet();

    public final void onDestroyView() {
        this.A00.clear();
    }

    public final void onPause() {
        for (Reference reference : this.A00) {
            View view = (View) reference.get();
            if (view != null) {
                TransitionCarouselImageView.A03((TransitionCarouselImageView) ((X1L) view));
            }
        }
    }

    public final void onResume() {
        for (Reference reference : this.A00) {
            View view = (View) reference.get();
            if (view != null) {
                TransitionCarouselImageView transitionCarouselImageView = (TransitionCarouselImageView) ((X1L) view);
                if (transitionCarouselImageView.getVisibility() == 0) {
                    TransitionCarouselImageView.A02(transitionCarouselImageView);
                }
            }
        }
    }
}
