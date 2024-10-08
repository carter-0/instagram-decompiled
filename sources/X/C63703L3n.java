package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.listview.CustomFadingEdgeListView;

/* renamed from: X.L3n  reason: case insensitive filesystem */
public final class C63703L3n {
    public final K98 A00;
    public final CustomFadingEdgeListView A01;

    public C63703L3n(View view, AnonymousClass0iw r8, UserSession userSession, C357638Yz r10, C314236hs r11) {
        0qQ.A0B(view, 3);
        this.A00 = new K98(AnonymousClass7TE.A0S(view), r8, userSession, r10, r11);
        View requireViewById = view.requireViewById(R.id.list);
        CustomFadingEdgeListView customFadingEdgeListView = (CustomFadingEdgeListView) requireViewById;
        customFadingEdgeListView.A00 = false;
        customFadingEdgeListView.setAdapter(customFadingEdgeListView.getAdapter());
        0qQ.A07(requireViewById);
        this.A01 = customFadingEdgeListView;
    }
}
