package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class H43 extends C231632rz {
    public final Context A00;

    public final String getBinderGroupName() {
        return "Simple_Banner";
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public H43(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(1765681892);
        AnonymousClass7TG.A1O(view, obj);
        Object tag = view.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.mainfeed.unconnectedcontent.SimpleBannerViewBinder.Holder");
        C55733HmU hmU = (C55733HmU) tag;
        C57195ISi iSi = (C57195ISi) obj;
        AnonymousClass7TG.A1N(hmU, iSi);
        hmU.A02.setText(((C53464Gow) iSi.A00).A01);
        AnonymousClass0fD.A0A(-1873947700, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, -527792744);
        int A03 = AnonymousClass0fD.A03(1769806548);
        View inflate = DbT.A0B(this.A00).inflate(R.layout.layout_simple_banner, viewGroup, false);
        inflate.setTag(new C55733HmU(AnonymousClass7TE.A0b(inflate, R.id.top_divider), AnonymousClass7TE.A0b(inflate, R.id.bottom_divider), DbW.A0B(inflate, R.id.title)));
        AnonymousClass0fD.A0A(1577885613, A03);
        AnonymousClass0fD.A0A(617309008, A04);
        return inflate;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
