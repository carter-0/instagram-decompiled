package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class EAS extends C231632rz {
    public final Context A00;
    public final C46430Der A01;
    public final boolean A02;

    public final int getViewTypeCount() {
        return 1;
    }

    public EAS(Context context, C46430Der der, boolean z) {
        this.A00 = context;
        this.A02 = z;
        this.A01 = der;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A04 = DbX.A04(view, 667563362);
        0qQ.A0B(obj, 2);
        C48235EbG ebG = (C48235EbG) view.getTag();
        String str = (String) obj;
        Context context = this.A00;
        boolean z = this.A02;
        C46430Der der = this.A01;
        0qQ.A0B(str, 1);
        AnonymousClass7TF.A1D(context, 2, der);
        if (ebG != null) {
            ebG.A01.setText(str);
            TextView textView = ebG.A00;
            DbT.A18(context, textView, 2131962572);
            FP4.A01(textView, 37, der);
            if (z) {
                textView.getLayoutParams().width = DbS.A03(context.getResources(), R.dimen.avatar_size_ridiculously_xxlarge);
            }
        }
        AnonymousClass0fD.A0A(991319, A04);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.EbG] */
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(898148220);
        0qQ.A0B(viewGroup, 1);
        View A0A = DbU.A0A(DbT.A0B(this.A00), viewGroup, R.layout.batch_action_header, false);
        0qQ.A0B(A0A, 1);
        ? obj = new Object();
        obj.A01 = AnonymousClass7TG.A0R(A0A, R.id.text);
        obj.A00 = AnonymousClass7TG.A0R(A0A, R.id.button);
        A0A.setTag(obj);
        0nA.A0c(A0A, 12);
        0nA.A0X(A0A, 12);
        AnonymousClass0fD.A0A(391204203, A03);
        return A0A;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
