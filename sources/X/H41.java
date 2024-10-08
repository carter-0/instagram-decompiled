package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.instagram.adshistory.fragment.RecentAdActivityFragment;

public final class H41 extends C231632rz {
    public final RecentAdActivityFragment A00;
    public final C229382nI A01;

    public final int getViewTypeCount() {
        return 1;
    }

    public H41(RecentAdActivityFragment recentAdActivityFragment, C229382nI r2) {
        this.A01 = r2;
        this.A00 = recentAdActivityFragment;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        AnonymousClass0fD.A0A(-1498268834, AnonymousClass0fD.A03(-58471063));
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, -456021166);
        Context context = viewGroup.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        0qQ.A07(context);
        C273694n2 r2 = new C273694n2(context);
        C51968G9o.A1D(r2, -2);
        frameLayout.addView(r2);
        C3034368u r1 = this.A00.A02;
        if (r1 != null) {
            AnonymousClass6NS.A00(context, r1, this.A01).A00().A07(r2);
        }
        AnonymousClass0fD.A0A(-908164157, A04);
        return frameLayout;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
