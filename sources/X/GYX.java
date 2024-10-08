package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;

public final class GYX extends C310586bI {
    public final /* synthetic */ C52576GYb A00;

    public final boolean hasStableIds() {
        return true;
    }

    public GYX(C52576GYb gYb) {
        this.A00 = gYb;
    }

    public final int getCount() {
        return this.A00.A05.size();
    }

    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        return ((GYZ) this.A00.A05.get(i)).A00;
    }

    public final long getItemId(int i) {
        return (long) ((GYZ) this.A00.A05.get(i)).A03;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        LithoView lithoView;
        if (view != null) {
            lithoView = (LithoView) view;
        } else {
            lithoView = new LithoView(viewGroup.getContext());
        }
        lithoView.A0k(((GYZ) this.A00.A05.get(i)).A00(), true);
        return lithoView;
    }
}
