package X;

import android.view.View;
import com.instagram.android.R;

/* renamed from: X.VVz  reason: case insensitive filesystem */
public final class C17446VVz {
    public final View A00;
    public final C71662eb A01;
    public final C71662eb A02;

    public C17446VVz(View view) {
        this.A00 = view;
        view.setOnClickListener((View.OnClickListener) null);
        this.A01 = DbY.A0S(view, R.id.follow_header_banner_stub);
        this.A02 = DbY.A0S(view, R.id.related_items);
    }
}
