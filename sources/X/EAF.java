package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class EAF extends C231632rz {
    public final Context A00;
    public final C46430Der A01;

    public final int getViewTypeCount() {
        return 1;
    }

    public EAF(Context context, C46430Der der) {
        this.A00 = context;
        this.A01 = der;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A04 = DbX.A04(view, 910661818);
        0qQ.A0B(obj, 2);
        Object tag = view.getTag();
        if (tag != null) {
            C49528Ex8 ex8 = (C49528Ex8) tag;
            EyX eyX = (EyX) obj;
            C46430Der der = this.A01;
            AnonymousClass7TG.A1N(ex8, eyX);
            0qQ.A0B(der, 2);
            ex8.A01.setText(eyX.A02);
            String str = eyX.A01;
            if (str.length() > 0) {
                TextView textView = ex8.A00;
                textView.setText(str);
                FP7.A00(textView, 24, der, eyX);
            }
            AnonymousClass0fD.A0A(1773298089, A04);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0A(-347397007, A04);
        throw A0y;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, 883733818);
        View A0A = DbU.A0A(DbT.A0B(this.A00), viewGroup, R.layout.user_group_header_text, false);
        A0A.setTag(new C49528Ex8(A0A));
        AnonymousClass0fD.A0A(-1047130465, A04);
        return A0A;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
