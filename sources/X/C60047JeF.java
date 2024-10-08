package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.instagram.android.R;

/* renamed from: X.JeF  reason: case insensitive filesystem */
public final class C60047JeF extends BaseAdapter {
    public final C63591Kze A00;

    public final int getCount() {
        return 1;
    }

    public final Object getItem(int i) {
        return this;
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view != null) {
            return view;
        }
        View A0C = DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.cover_image_camera_roll_icon);
        AnonymousClass3NG A0m = AnonymousClass7TE.A0m(A0C);
        A0m.A07 = true;
        C61685KHt.A00(A0m, this, 2);
        return A0C;
    }

    public C60047JeF(C63591Kze kze) {
        this.A00 = kze;
    }
}
