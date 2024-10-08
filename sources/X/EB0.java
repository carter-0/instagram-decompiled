package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class EB0 extends C336937fQ {
    public final CharSequence A00;
    public final Context A01;

    public final int getViewTypeCount() {
        return 1;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        if (this.A00.length() != 0) {
            r2.A7U(0);
        }
    }

    public EB0(Context context, CharSequence charSequence) {
        this.A01 = context;
        this.A00 = charSequence;
    }

    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        boolean A1a;
        int A03 = AnonymousClass0fD.A03(458202053);
        if (view == null) {
            if (obj2 == null) {
                A1a = false;
            } else {
                A1a = AnonymousClass7TE.A1a(obj2);
            }
            Context context = this.A01;
            CharSequence charSequence = this.A00;
            view = DbT.A0C(LayoutInflater.from(context), viewGroup, R.layout.row_page_footer);
            DbX.A1G(AnonymousClass7TG.A0R(view, R.id.row_page_footer_text), charSequence);
            if (A1a) {
                DbX.A1B(view, R.id.footer_divider);
            }
        }
        AnonymousClass0fD.A0A(-612211272, A03);
        return view;
    }
}
