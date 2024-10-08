package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class NLW extends C231632rz {
    public final Context A00;
    public final NKT A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public NLW(Context context, NKT nkt) {
        this.A00 = context;
        this.A01 = nkt;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-1741072502);
        view.getTag().getClass();
        Context context = this.A00;
        C69657Npf npf = (C69657Npf) view.getTag();
        C70972OTt oTt = (C70972OTt) obj;
        NKT nkt = this.A01;
        TextView textView = npf.A02;
        String str = oTt.A07;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        TextView textView2 = npf.A01;
        0qQ.A0B(context, 0);
        SpannableStringBuilder append = DbS.A0C(O3F.A00(context, oTt)).append(" • ");
        String str2 = oTt.A05;
        if (str2 == null) {
            str2 = "";
        }
        SpannableStringBuilder append2 = append.append(str2);
        0qQ.A07(append2);
        textView2.setText(append2);
        AnonymousClass0fU.A00(new C71409Ok8(oTt, nkt, 41), npf.A00);
        AnonymousClass0fD.A0A(-1350003676, A03);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.Npf, java.lang.Object] */
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(210649063);
        View A0C = DbT.A0C(LayoutInflater.from(this.A00), viewGroup, R.layout.login_history_row_item);
        ? obj = new Object();
        obj.A02 = DbU.A0G(A0C, R.id.login_history_item_title);
        obj.A01 = DbU.A0G(A0C, R.id.login_history_item_content);
        obj.A00 = DbU.A0F(A0C, R.id.more_icon);
        A0C.setTag(obj);
        AnonymousClass0fD.A0A(507243911, A03);
        return A0C;
    }
}
