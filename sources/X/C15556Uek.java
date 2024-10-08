package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.Uek  reason: case insensitive filesystem */
public final class C15556Uek extends C231632rz {
    public final Context A00;
    public final ReelDashboardFragment A01;

    public final int getIdentifier(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, 1);
        return obj.hashCode();
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, 1);
        return obj.hashCode();
    }

    public final int getViewTypeCount() {
        return 3;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r4, Object obj, Object obj2) {
        VWC vwc = (VWC) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, r4, vwc);
        switch (vwc.A01.intValue()) {
            case 0:
            case 2:
            case 3:
            case 4:
            case 5:
                r4.A7U(0);
                return;
            case 1:
            case 6:
                r4.A7U(A1U ? 1 : 0);
                return;
            default:
                throw new UnsupportedOperationException("Unknown CTA type");
        }
    }

    public C15556Uek(Context context, ReelDashboardFragment reelDashboardFragment) {
        AnonymousClass7TG.A1O(context, reelDashboardFragment);
        this.A00 = context;
        this.A01 = reelDashboardFragment;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        VWC vwc;
        TextView textView;
        int i2;
        int A03 = AnonymousClass0fD.A03(-1277899759);
        int A02 = DbW.A02(1, view, obj);
        if (i != 0) {
            if (i == 1) {
                Object tag = view.getTag();
                0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.reels.dashboard.ReelDashboardCTAButtonViewBinder.Holder");
                VTA vta = (VTA) tag;
                vwc = (VWC) obj;
                ReelDashboardFragment reelDashboardFragment = this.A01;
                View view2 = vta.A00;
                Resources resources = view2.getResources();
                if (vwc.A01 == AnonymousClass05K.A01) {
                    i2 = AnonymousClass7TE.A0F(resources);
                } else {
                    i2 = 0;
                }
                0nA.A0X(view2, i2);
                textView = vta.A01;
                AnonymousClass0fU.A00(new WBD(vwc, reelDashboardFragment, 7), textView);
                textView.setText(vwc.A02);
                AnonymousClass0fD.A0A(1545414038, A03);
            } else if (i != A02) {
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Unhandled view type");
                AnonymousClass0fD.A0A(1961685787, A03);
                throw unsupportedOperationException;
            }
        }
        Object tag2 = view.getTag();
        0qQ.A0C(tag2, "null cannot be cast to non-null type com.instagram.reels.dashboard.ReelDashboardCTATextViewBinder.Holder");
        VTB vtb = (VTB) tag2;
        vwc = (VWC) obj;
        ReelDashboardFragment reelDashboardFragment2 = this.A01;
        AnonymousClass0fU.A00(new WBD(vwc, reelDashboardFragment2, 8), vtb.A00);
        textView = vtb.A01;
        textView.setText(vwc.A02);
        AnonymousClass0fD.A0A(1545414038, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        Context context;
        int i2;
        View view;
        Object obj;
        int A03 = AnonymousClass0fD.A03(1655205193);
        0qQ.A0B(viewGroup, 1);
        if (i == 0) {
            context = this.A00;
            i2 = R.layout.row_reel_dashboard_cta_text_with_arrow;
        } else if (i == 1) {
            view = DbT.A0C(LayoutInflater.from(this.A00), viewGroup, R.layout.row_reel_dashboard_cta_button);
            obj = new VTA(view);
            view.setTag(obj);
            AnonymousClass0fD.A0A(1954227164, A03);
            return view;
        } else if (i == 2) {
            context = this.A00;
            i2 = R.layout.row_reel_dashboard_cta_primary_text;
        } else {
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Unhandled view type");
            AnonymousClass0fD.A0A(758822358, A03);
            throw unsupportedOperationException;
        }
        view = DbT.A0C(LayoutInflater.from(context), viewGroup, i2);
        obj = new VTB(view);
        view.setTag(obj);
        AnonymousClass0fD.A0A(1954227164, A03);
        return view;
    }
}
