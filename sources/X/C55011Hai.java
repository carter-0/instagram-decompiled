package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.Hai  reason: case insensitive filesystem */
public abstract class C55011Hai {
    public static final View A00(Context context, ViewGroup viewGroup) {
        View A0A = DbU.A0A(DbT.A0B(context), viewGroup, R.layout.row_feed_media_notice, false);
        A0A.setTag(new C55807Hnn(A0A));
        return A0A;
    }
}
