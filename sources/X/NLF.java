package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class NLF extends C231632rz {
    public final Context A00;

    public final int getViewTypeCount() {
        return 1;
    }

    public NLF(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(1053591665);
        AnonymousClass7TG.A1O(view, obj);
        if (JV5.A01(13, obj)) {
            JV5 jv5 = (JV5) obj;
            Object tag = view.getTag();
            0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.direct.ui.GroupSupportMessageLearnMoreViewBinderGroup.ViewHolder");
            C70477O8c o8c = (C70477O8c) tag;
            SpannableStringBuilder A0E = C51965G9l.A0E();
            Context context = view.getContext();
            String A16 = AnonymousClass7TE.A16(context, 2131964886);
            String A162 = AnonymousClass7TE.A16(context, 2131964892);
            int i2 = 2131958988;
            if (jv5.A01) {
                i2 = 2131958989;
            }
            String A0u = DbV.A0u(context, A16, A162, i2);
            0qQ.A07(A0u);
            A0E.append(A0u);
            int A08 = 00l.A08(A0u, A16, 0, false);
            A0E.setSpan(jv5.A03, A08, C51966G9m.A05(A16, A08), 17);
            int A082 = 00l.A08(A0u, A162, 0, false);
            A0E.setSpan(jv5.A00, A082, C51966G9m.A05(A162, A082), 17);
            TextView textView = o8c.A00;
            textView.setText(A0E);
            textView.setContentDescription(A0E);
            DbT.A1H(textView);
        }
        AnonymousClass0fD.A0A(-498142857, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, -2034897296);
        View A0C = DbT.A0C(LayoutInflater.from(this.A00), viewGroup, R.layout.layout_thread_detail_group_support_message_learn_more);
        0qQ.A0A(A0C);
        A0C.setTag(new C70477O8c(A0C));
        AnonymousClass0fD.A0A(1103474530, A04);
        return A0C;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
