package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class EA0 extends C231632rz {
    public final Context A00;
    public final C51909G7d A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public EA0(Context context, C51909G7d g7d) {
        this.A00 = context;
        this.A01 = g7d;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        String A16;
        int A03 = AnonymousClass0fD.A03(-1062104488);
        Context context = this.A00;
        C49354EuI euI = (C49354EuI) DbT.A0o(view);
        C49489EwU ewU = (C49489EwU) obj;
        C51909G7d g7d = this.A01;
        AnonymousClass7TG.A1O(euI, ewU);
        TextView textView = euI.A00;
        if (textView == null) {
            throw AnonymousClass7TE.A0z("Required value was null.");
        } else if (context == null) {
            throw AnonymousClass7TE.A0z("Required value was null.");
        } else if (g7d != null) {
            if (ewU.A01.intValue() != 0) {
                Integer num = ewU.A00;
                if (num == null || (A16 = DbW.A0h(context, num, 2131972980)) == null) {
                    A16 = AnonymousClass7TE.A16(context, 2131972971);
                }
                textView.setText(A16);
            } else {
                DbT.A18(context, textView, 2131972979);
                0nA.A0T(textView, context.getResources().getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width));
            }
            FPF.A00(textView, 62, g7d, ewU);
            AnonymousClass0fD.A0A(-1671602748, A03);
        } else {
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.EuI] */
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-2077552562);
        View A08 = DbU.A08(LayoutInflater.from(this.A00), R.layout.row_newsfeed_view_all);
        0qQ.A07(A08);
        ? obj = new Object();
        obj.A00 = DbU.A0G(A08, R.id.see_all_button);
        A08.setTag(obj);
        AnonymousClass0fD.A0A(434896144, A03);
        return A08;
    }
}
