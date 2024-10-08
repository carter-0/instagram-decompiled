package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.mainactivity.InstagramMainActivity;
import java.util.ArrayList;

/* renamed from: X.37g  reason: invalid class name and case insensitive filesystem */
public final class C2373437g implements View.OnLayoutChangeListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ InstagramMainActivity A01;

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        0qQ.A0B(view, 0);
        ViewGroup viewGroup = (ViewGroup) view;
        ArrayList arrayList = new ArrayList();
        int childCount = viewGroup.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            Object tag = viewGroup.getChildAt(i9).getTag();
            if (tag instanceof 1QK) {
                arrayList.add(((1QK) tag).A06);
            }
        }
        0wc A012 = AnonymousClass0kN.A01(this.A01.A0n(), this.A00);
        0Aj A002 = A012.A00(A012.A00, "ig_navigation_tab_impression");
        if (A002.isSampled()) {
            A002.AAJ("app_device_id", 0qv.A02.A05(viewGroup.getContext()));
            A002.AAe("tabs", arrayList);
            A002.Cgf();
        }
        viewGroup.removeOnLayoutChangeListener(this);
    }

    public C2373437g(UserSession userSession, InstagramMainActivity instagramMainActivity) {
        this.A00 = userSession;
        this.A01 = instagramMainActivity;
    }
}
