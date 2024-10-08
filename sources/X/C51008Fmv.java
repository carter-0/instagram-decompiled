package X;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.instagram.android.R;
import com.instagram.user.userlist.fragment.UnifiedFollowFragment;
import java.util.List;

/* renamed from: X.Fmv  reason: case insensitive filesystem */
public final class C51008Fmv implements C324796zu {
    public final int A00;
    public final Object A01;

    public C51008Fmv(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final View AN8(int i) {
        String str;
        if (this.A00 != 0) {
            UnifiedFollowFragment unifiedFollowFragment = (UnifiedFollowFragment) this.A01;
            List list = unifiedFollowFragment.A0L;
            if (list == null) {
                str = "tabs";
            } else {
                C46443Df5 df5 = (C46443Df5) list.get(i);
                0qQ.A0B(df5, 0);
                View inflate = unifiedFollowFragment.getLayoutInflater().inflate(R.layout.unified_follow_tab_bar_item_layout, unifiedFollowFragment.tabLayout, false);
                0qQ.A0C(inflate, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView = (TextView) inflate;
                textView.setText(UnifiedFollowFragment.A00(df5, unifiedFollowFragment));
                2eS.A01(textView);
                unifiedFollowFragment.A0T.put(df5, textView);
                AnonymousClass0fU.A00(new FNH(unifiedFollowFragment, i, 5), textView);
                return textView;
            }
        } else {
            NJY njy = (NJY) this.A01;
            TabLayout tabLayout = njy.A01;
            str = "tabLayout";
            if (tabLayout != null) {
                LayoutInflater A0D = DbV.A0D(tabLayout);
                TabLayout tabLayout2 = njy.A01;
                if (tabLayout2 != null) {
                    View A0C = DbT.A0C(A0D, tabLayout2, R.layout.direct_thread_details_tab_view);
                    0qQ.A0C(A0C, C273654mx.A00(87));
                    ImageView imageView = (ImageView) A0C;
                    TabLayout tabLayout3 = njy.A01;
                    if (tabLayout3 != null) {
                        DbU.A13(tabLayout3.getContext(), imageView, ((C69362Nk2) njy.A12.get(i)).A01);
                        return imageView;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
