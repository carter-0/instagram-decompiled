package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.text.CustomTypefaceSpan;

public final class EAD extends C231632rz {
    public final Context A00;
    public final C46430Der A01;

    public final int getViewTypeCount() {
        return 1;
    }

    public EAD(Context context, C46430Der der) {
        this.A00 = context;
        this.A01 = der;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(1108019498);
        0qQ.A0B(view, 1);
        DbS.A1Y(obj);
        String str = (String) obj;
        C46430Der der = this.A01;
        AnonymousClass7TF.A1B(str, 1, der);
        FP4.A01(view, 39, der);
        C49526Ex6 ex6 = (C49526Ex6) view.getTag();
        Context context = view.getContext();
        if (!(ex6 == null || context == null)) {
            String A0d = AnonymousClass7TF.A0d(view.getResources(), 2131962565);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(A0d);
            spannableStringBuilder.append(" ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(str);
            Typeface A02 = AnonymousClass0qo.A00(context).A02(0qm.A13);
            if (A02 != null) {
                spannableStringBuilder.setSpan(new CustomTypefaceSpan(A02), length, spannableStringBuilder.length(), 33);
                TextView textView = ex6.A01;
                textView.setText(spannableStringBuilder);
                textView.setContentDescription(DbW.A0h(context, spannableStringBuilder, 2131963306));
                2eS.A01(ex6.A00);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        AnonymousClass0fD.A0A(-2069395098, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, -409124397);
        View A0A = DbU.A0A(DbT.A0B(this.A00), viewGroup, R.layout.follow_list_sorting_entry_row, false);
        A0A.setTag(new C49526Ex6(A0A));
        AnonymousClass0fD.A0A(1403025550, A04);
        return A0A;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
