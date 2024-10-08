package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public abstract class VGF {
    /* JADX WARNING: type inference failed for: r1v1, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public static final View A00(Context context, ViewGroup viewGroup) {
        View A0A = DbU.A0A(DbT.A0B(context), viewGroup, R.layout.row_search_map_query, false);
        C17532VZl vZl = new C17532VZl(A0A);
        ? r1 = vZl.A04;
        C14497TxJ.A00(context, r1, AnonymousClass05K.A00);
        DbT.A16(context, r1, 2Yu.A0C(context));
        r1.setStrokeAlpha(r1.A00);
        A0A.setTag(vZl);
        return A0A;
    }
}
