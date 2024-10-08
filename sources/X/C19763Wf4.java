package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.instagram.android.R;
import com.instagram.ui.widget.refresh.IgSwipeRefreshLayout;

/* renamed from: X.Wf4  reason: case insensitive filesystem */
public final class C19763Wf4 implements AnonymousClass3AD {
    public final IgSwipeRefreshLayout A00;

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View, com.instagram.ui.widget.refresh.IgSwipeRefreshLayout] */
    public final void APL() {
        this.A00.setEnabled(false);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View, com.instagram.ui.widget.refresh.IgSwipeRefreshLayout] */
    public final void ARa() {
        this.A00.setEnabled(true);
    }

    public final void EaL(boolean z, boolean z2) {
        if (z2) {
            this.A00.setRefreshing(z);
        }
    }

    public final void Eou(int i) {
        if (i > 0) {
            int i2 = i / 3;
            this.A00.A08(i2, i + i2);
        }
    }

    public final boolean isLoading() {
        return this.A00.A0G;
    }

    public final void setIsLoading(boolean z) {
        this.A00.setRefreshing(z);
    }

    public C19763Wf4(View view, AnonymousClass3AB r5) {
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.swiperefreshlayout_stub);
        if (viewStub != null) {
            viewStub.inflate();
        }
        SwipeRefreshLayout findViewById = view.findViewById(R.id.swipe_refresh);
        if (findViewById != null) {
            SwipeRefreshLayout swipeRefreshLayout = (IgSwipeRefreshLayout) findViewById;
            this.A00 = swipeRefreshLayout;
            swipeRefreshLayout.setVisibility(0);
            swipeRefreshLayout.A0E = new C18949WEc(r5);
            Context context = view.getContext();
            swipeRefreshLayout.setColorSchemeColors(new int[]{2Yu.A01(context)});
            swipeRefreshLayout.setProgressBackgroundColorSchemeColor(2Yu.A0F(context, R.attr.igds_color_elevated_background));
            return;
        }
        throw DbW.A0c("SwipeRefreshLayout not found in view: ", C51968G9o.A16(view));
    }
}
