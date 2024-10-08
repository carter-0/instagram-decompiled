package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.K9b  reason: case insensitive filesystem */
public final class C61470K9b extends C231632rz {
    public final Context A00;
    public final K6S A01;

    public final int getViewTypeCount() {
        return 1;
    }

    public C61470K9b(Context context, K6S k6s) {
        this.A00 = context;
        this.A01 = k6s;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A04 = DbX.A04(view, -601135064);
        if (view.getTag() != null) {
            Object tag = view.getTag();
            0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.settings.common.audiencepicker.FBAudiencePickerViewBinder.Holder");
            L8P l8p = (L8P) tag;
            0qQ.A0B(l8p, 0);
            l8p.A00.getView();
            throw AnonymousClass7TE.A11("getShouldShareToFB");
        }
        AnonymousClass0fD.A0A(-758574285, A04);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-2141428319);
        View A0D = DbT.A0D(LayoutInflater.from(this.A00), viewGroup, R.layout.fb_audience_row, false);
        A0D.setTag(new L8P(A0D));
        AnonymousClass0fD.A0A(-1064796067, A03);
        return A0D;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
