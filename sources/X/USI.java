package X;

import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager;

public final class USI extends C19068WIz {
    public final void EhN(View view, Object obj, String str) {
        float A04;
        switch (str.hashCode()) {
            case -1609594047:
                if (str.equals("enabled")) {
                    view.setEnabled(Pxi.A1Y(obj, true));
                    return;
                }
                break;
            case -1354842768:
                if (str.equals("colors")) {
                    ((SwipeRefreshLayoutManager) this.A00).setColors(view, (ReadableArray) obj);
                    return;
                }
                break;
            case -885150488:
                if (str.equals("progressBackgroundColor")) {
                    ((SwipeRefreshLayoutManager) this.A00).setProgressBackgroundColor(view, SPt.A00(view.getContext(), obj));
                    return;
                }
                break;
            case -416037467:
                if (str.equals("progressViewOffset")) {
                    if (obj == null) {
                        A04 = 0.0f;
                    } else {
                        A04 = AnonymousClass7TE.A04(obj);
                    }
                    ((C14913UEw) view).setProgressViewOffset(A04);
                    return;
                }
                break;
            case -321826009:
                if (str.equals("refreshing")) {
                    ((SwipeRefreshLayout) view).setRefreshing(Pxi.A1Y(obj, false));
                    return;
                }
                break;
            case 3530753:
                if (str.equals("size")) {
                    ((SwipeRefreshLayoutManager) this.A00).setSize(view, (String) obj);
                    return;
                }
                break;
        }
        super.EhN(view, obj, str);
    }
}
