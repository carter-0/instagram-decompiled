package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.ViewGroupManager;
import java.util.Set;

/* renamed from: X.Vhj  reason: case insensitive filesystem */
public final class C17892Vhj {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ViewGroup A02;
    public final /* synthetic */ W0R A03;
    public final /* synthetic */ ViewGroupManager A04;
    public final /* synthetic */ Set A05;

    public C17892Vhj(View view, ViewGroup viewGroup, W0R w0r, ViewGroupManager viewGroupManager, Set set, int i) {
        this.A03 = w0r;
        this.A04 = viewGroupManager;
        this.A02 = viewGroup;
        this.A01 = view;
        this.A05 = set;
        this.A00 = i;
    }

    public final void A00() {
        ViewGroupManager viewGroupManager = this.A04;
        ViewGroup viewGroup = this.A02;
        View view = this.A01;
        viewGroupManager.removeView(viewGroup, view);
        W0R w0r = this.A03;
        w0r.A07(view);
        Set set = this.A05;
        set.remove(Integer.valueOf(view.getId()));
        if (set.isEmpty()) {
            w0r.A00.remove(Integer.valueOf(this.A00));
        }
    }
}
