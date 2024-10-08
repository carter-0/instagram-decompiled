package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.EnN  reason: case insensitive filesystem */
public abstract class C48985EnN {
    public static View A00(Context context, int i, ViewGroup viewGroup) {
        View A0C = DbT.A0C(LayoutInflater.from(context), viewGroup, R.layout.family_bridges_basic_netego_content_view);
        A0C.setTag(new F0Z(context, A0C, i));
        return A0C;
    }
}
