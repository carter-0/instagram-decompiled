package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class E9T extends C231632rz {
    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A04 = DbX.A04(view, -1265008369);
        Object tag = view.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.StickerDropNewSectionViewBinder.Holder");
        C49320Etb etb = (C49320Etb) tag;
        0qQ.A0B(etb, 0);
        TextView textView = etb.A00;
        DbT.A18(textView.getContext(), textView, 2131974210);
        AnonymousClass0fD.A0A(-1712404330, A04);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, 90513408);
        View A0A = DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.layout_sticker_drop_new_section, false);
        A0A.setTag(new C49320Etb(A0A));
        AnonymousClass0fD.A0A(1471176569, A04);
        return A0A;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
