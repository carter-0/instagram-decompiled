package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.ui.widget.search.SearchController;

/* renamed from: X.Mr0  reason: case insensitive filesystem */
public final class C67627Mr0 extends AnimatorListenerAdapter {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C226462gr A01;
    public final /* synthetic */ SearchController A02;

    public C67627Mr0(C226462gr r1, SearchController searchController, long j) {
        this.A02 = searchController;
        this.A01 = r1;
        this.A00 = j;
    }

    public final void onAnimationEnd(Animator animator) {
        IgSimpleImageView igSimpleImageView;
        SearchController searchController = this.A02;
        C226462gr r5 = this.A01;
        long j = this.A00;
        OIK oik = searchController.mViewHolder;
        if (oik != null && (igSimpleImageView = oik.A0B) != null) {
            igSimpleImageView.setImageDrawable(r5);
            if (j > 0) {
                r5.EFJ((int) j);
            } else {
                r5.EFK();
            }
            r5.E2p();
        }
    }
}
