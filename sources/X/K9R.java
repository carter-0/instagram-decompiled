package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

public final class K9R extends C231632rz {
    public final Context A00;

    public final int getViewTypeCount() {
        return 1;
    }

    public K9R(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-295627365);
        AnonymousClass7TG.A1O(view, obj);
        if (view.getTag() != null) {
            Object tag = view.getTag();
            0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.settings.common.audiencepicker.AudiencePickerSeeMoreViewBinder.Holder");
            L74 l74 = (L74) tag;
            C61076JwE jwE = (C61076JwE) obj;
            AnonymousClass7TG.A1N(l74, jwE);
            IgTextView igTextView = l74.A01;
            igTextView.setText(jwE.A01);
            C64273LXz.A00(igTextView, 39, jwE);
            C64273LXz.A00(l74.A00, 40, jwE);
        }
        AnonymousClass0fD.A0A(1247319461, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(729738655);
        View A0D = DbT.A0D(LayoutInflater.from(this.A00), viewGroup, R.layout.layout_audience_picker_see_more, false);
        A0D.setTag(new L74(A0D));
        AnonymousClass0fD.A0A(469593625, A03);
        return A0D;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
