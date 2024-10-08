package X;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.creation.capture.quickcapture.thirdpartymedia.GiphyClipsBrowserCategoriesViewController;

/* renamed from: X.LTo  reason: case insensitive filesystem */
public final class C64201LTo implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public C64201LTo(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Number number;
        Number number2;
        int i = this.A00;
        Object A0o = C51971G9r.A0o(valueAnimator);
        boolean z = A0o instanceof Float;
        if (i != 0) {
            if (z && (number2 = (Number) A0o) != null) {
                GiphyClipsBrowserCategoriesViewController giphyClipsBrowserCategoriesViewController = (GiphyClipsBrowserCategoriesViewController) this.A01;
                boolean z2 = this.A02;
                float floatValue = number2.floatValue();
                RecyclerView recyclerView = giphyClipsBrowserCategoriesViewController.categoryRecyclerView;
                if (recyclerView != null) {
                    recyclerView.setAlpha(floatValue);
                }
                float f = ((floatValue - 1.0f) * 0.2f) + 1.0f;
                RecyclerView recyclerView2 = giphyClipsBrowserCategoriesViewController.categoryRecyclerView;
                if (recyclerView2 != null) {
                    recyclerView2.setScaleY(f);
                }
                if (floatValue == 0.0f && !z2) {
                    AnonymousClass7TH.A0R(giphyClipsBrowserCategoriesViewController.categoryRecyclerView);
                }
            }
        } else if (z && (number = (Number) A0o) != null) {
            C380589Yt r6 = (C380589Yt) this.A01;
            boolean z3 = this.A02;
            float floatValue2 = number.floatValue();
            int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            ? r3 = r6.A06;
            r3.setAlpha(floatValue2);
            float f2 = ((floatValue2 - 1.0f) * 0.2f) + 1.0f;
            r3.setScaleX(f2);
            r3.setScaleY(f2);
            if (floatValue2 == 0.0f && !z3) {
                r6.itemView.setVisibility(8);
            }
        }
    }
}
