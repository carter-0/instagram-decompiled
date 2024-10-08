package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

public final class K9P extends C231632rz {
    public final Context A00;

    public final int getViewTypeCount() {
        return 1;
    }

    public K9P(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A04 = DbX.A04(view, -714765441);
        0qQ.A0B(obj, 2);
        Context context = this.A00;
        Object tag = view.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.mentionconversion.MentionConversionViewBinder.Holder");
        L6O l6o = (L6O) tag;
        L95 l95 = (L95) obj;
        AnonymousClass7TF.A1H(context, l6o);
        0qQ.A0B(l95, 2);
        l6o.A02.setText(l95.A04);
        IgTextView igTextView = l6o.A01;
        igTextView.setVisibility(8);
        String str = l95.A03;
        if (str != null) {
            igTextView.setText(str);
            igTextView.setVisibility(0);
        }
        DbU.A13(context, l6o.A00, l95.A00);
        AnonymousClass0fD.A0A(926311670, A04);
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        C51965G9l.A1U(obj2);
        DbW.A1I(r1);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(1929535425);
        View A09 = DbW.A09(DbT.A0B(this.A00), viewGroup, R.layout.mention_conversion_row, false);
        A09.setTag(new L6O(A09));
        AnonymousClass0fD.A0A(-878231717, A03);
        return A09;
    }
}
