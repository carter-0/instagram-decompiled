package X;

import android.content.Context;
import android.view.View;
import android.widget.AbsListView;

/* renamed from: X.HpV  reason: case insensitive filesystem */
public final class C55908HpV {
    public final void A00(View view, C248203ha r6) {
        String string;
        int A04 = DbX.A04(r6, -1523832935);
        if (r6.A04) {
            view.setLayoutParams(new AbsListView.LayoutParams(-1, 48));
            0nA.A0V(view, 48);
        }
        2eS.A01(view);
        String str = r6.A03;
        Context context = view.getContext();
        if (str != null) {
            string = DbW.A0h(context, str, 2131952047);
        } else {
            string = context.getString(2131952046);
        }
        view.setContentDescription(string);
        AnonymousClass0fU.A00(new ID2(21, (Object) r6, (Object) view), view);
        AnonymousClass0fD.A0A(-361854726, A04);
    }
}
