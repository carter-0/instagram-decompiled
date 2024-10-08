package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.UeA  reason: case insensitive filesystem */
public final class C15521UeA extends C231632rz {
    public final G77 A00;
    public final ReelDashboardFragment A01;

    public C15521UeA(G77 g77, ReelDashboardFragment reelDashboardFragment) {
        0qQ.A0B(reelDashboardFragment, 2);
        this.A00 = g77;
        this.A01 = reelDashboardFragment;
    }

    public final int getViewTypeCount() {
        return 2;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A04 = DbX.A04(view, 380324918);
        Object tag = view.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.reels.dashboard.ReelDashboardSearchBarBinderGroup.Holder");
        VYI vyi = (VYI) tag;
        if (vyi.A01) {
            vyi.A03.A0E.requestFocus();
        }
        C255773uh r1 = vyi.A00;
        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.reels.dashboard.ReelDashboardSearchBarBinderGroup.SearchBarModel");
        C255773uh r3 = ((C17253VOg) obj).A00;
        if (!0qQ.A0K(r1, r3)) {
            IgdsInlineSearchBox igdsInlineSearchBox = vyi.A03;
            igdsInlineSearchBox.A02 = null;
            igdsInlineSearchBox.clearFocus();
            igdsInlineSearchBox.A0E.setText((CharSequence) null);
            igdsInlineSearchBox.A02 = this.A00;
        }
        vyi.A00 = r3;
        Context context = vyi.A02;
        int A02 = AnonymousClass7TG.A02(context);
        C363208jL r12 = new C363208jL(context, 1.0f, 2Yu.A0H(context, R.attr.dividerColor), 48);
        r12.A00(A02, 0, A02, 0);
        vyi.A03.setBackground(r12);
        AnonymousClass0fD.A0A(1137486596, A04);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(289494558);
        View A0D = DbT.A0D(DbX.A0F(viewGroup, 1), viewGroup, R.layout.search_bar_with_blur_text, false);
        IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) A0D.findViewById(R.id.search_box_with_blur);
        0qQ.A0A(igdsInlineSearchBox);
        A0D.setTag(new VYI(A0D, viewGroup, this.A00, igdsInlineSearchBox, this.A01));
        AnonymousClass0fD.A0A(-210746014, A03);
        return A0D;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
