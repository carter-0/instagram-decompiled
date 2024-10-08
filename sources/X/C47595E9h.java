package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.banner.IgdsBanner;

/* renamed from: X.E9h  reason: case insensitive filesystem */
public final class C47595E9h extends C231632rz {
    public final Context A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C47595E9h(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-233635277);
        C49408EvA evA = (C49408EvA) DbT.A0o(view);
        IgdsBanner igdsBanner = evA.A00;
        igdsBanner.setBody(2131956237);
        igdsBanner.setAction(2131956236);
        igdsBanner.setIcon((int) R.drawable.instagram_collaborate_pano_outline_24);
        igdsBanner.setDismissible(true);
        igdsBanner.A02.setVisibility(0);
        igdsBanner.A01.setVisibility(8);
        igdsBanner.setOnClickListener((View.OnClickListener) null);
        igdsBanner.A00 = new C50469FcH(3, obj, evA);
        AnonymousClass0fD.A0A(-1611154849, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-1571748927);
        IgdsBanner igdsBanner = (IgdsBanner) DbT.A0C(LayoutInflater.from(this.A00), viewGroup, R.layout.layout_tag_list_footer_banner);
        igdsBanner.setTag(new C49408EvA(igdsBanner));
        AnonymousClass0fD.A0A(-633027529, A03);
        return igdsBanner;
    }
}
