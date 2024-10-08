package X;

import android.content.Context;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.ui.listview.CustomFadingEdgeListView;
import java.util.List;

/* renamed from: X.L3l  reason: case insensitive filesystem */
public final class C63701L3l {
    public CustomFadingEdgeListView A00;
    public final K9D A01;

    public C63701L3l(Context context, ViewGroup viewGroup, AnonymousClass0iw r18, UserSession userSession, CustomFadingEdgeListView customFadingEdgeListView, AnonymousClass7Q6 r21, int i, int i2) {
        CustomFadingEdgeListView customFadingEdgeListView2 = customFadingEdgeListView;
        0qQ.A0B(customFadingEdgeListView2, 5);
        this.A00 = customFadingEdgeListView2;
        AnonymousClass0iw r6 = r18;
        UserSession userSession2 = userSession;
        K9D k9d = new K9D(AnonymousClass7TE.A0S(customFadingEdgeListView2), r6, userSession2, r21, i, i2);
        this.A01 = k9d;
        List A0J = 03t.A0J(C317486nL.A04.A07(userSession2));
        List list = k9d.A00;
        list.clear();
        list.addAll(A0J);
        K9D.A00(k9d);
        CustomFadingEdgeListView customFadingEdgeListView3 = this.A00;
        customFadingEdgeListView3.A00 = false;
        customFadingEdgeListView3.setAdapter(k9d);
        int i3 = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        this.A00.setOnScrollListener(new C389359pJ(context, viewGroup, r6, userSession2, k9d, new C14160Tqw(this.A00)));
    }
}
