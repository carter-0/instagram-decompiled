package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.widget.TextView;

/* renamed from: X.Ntp  reason: case insensitive filesystem */
public abstract class C69887Ntp {
    public static final void A00(C68182N3x n3x, C67888MwW mwW) {
        boolean A1U = AnonymousClass7TF.A1U(0, mwW, n3x);
        TextView textView = mwW.A00;
        Context context = textView.getContext();
        Drawable drawable = context.getDrawable(n3x.A01);
        if (drawable != null) {
            int A05 = AnonymousClass7TG.A05(context);
            int A01 = DbV.A01(context);
            drawable.setBounds(0, 0, A05, A05);
            AnonymousClass7TE.A1R(drawable.mutate(), A01);
            SpannableStringBuilder A0E = C51965G9l.A0E();
            A0E.append("  ");
            A0E.setSpan(new C2606346l(drawable), 0, A1U ? 1 : 0, 33);
            String A16 = AnonymousClass7TE.A16(context, n3x.A02);
            A0E.append(AnonymousClass7AV.A00(DbT.A09(n3x.A04), A16, DbW.A0h(context, A16, n3x.A03)));
            textView.setText(A0E);
            textView.setContentDescription(A0E);
            DbT.A1H(textView);
            textView.setHighlightColor(0);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
