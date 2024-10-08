package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.NOo  reason: case insensitive filesystem */
public final class C68592NOo extends C232222tE {
    public final C332957Xc A00;
    public final AnonymousClass9HC A01;
    public final Context A02;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new C67908Mwq(DbU.A09(layoutInflater, viewGroup, R.layout.thread_message_action_log, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r17, C249703kE r18) {
        Object obj;
        AnonymousClass7OD r4 = (AnonymousClass7OD) r17;
        C67908Mwq mwq = (C67908Mwq) r18;
        boolean A1U = AnonymousClass7TF.A1U(0, r4, mwq);
        TextView textView = mwq.A00;
        SpannableString spannableString = r4.A03;
        boolean z = false;
        Object[] spans = spannableString.getSpans(0, spannableString.length(), C255733ud.class);
        0qQ.A07(spans);
        if (spans.length == 0) {
            obj = null;
        } else {
            obj = spans[0];
        }
        C255733ud r1 = (C255733ud) obj;
        if (r1 != null) {
            r1.A00 = new PGD(this, r4);
        }
        String str = r4.A05;
        int i = r4.A01;
        SpannableStringBuilder A0E = C51965G9l.A0E();
        A0E.append(spannableString).append(002.A0D(str, ' '));
        C255733ud r10 = new C255733ud(AnonymousClass05K.A0u, str, "", i, A1U);
        r10.A01 = AnonymousClass05K.A01;
        C51971G9r.A0y(A0E, r10, A0E.length() - DbX.A05(str));
        SpannableString A0D = C66580MXl.A0D(A0E);
        textView.setText(A0D);
        textView.setTextColor(r4.A00);
        textView.setTypeface(textView.getTypeface(), 0);
        if (r4.A06) {
            Context context = textView.getContext();
            Drawable drawable = context.getDrawable(R.drawable.rounded_background_secondary);
            if (drawable != null) {
                int A06 = 2eL.A06(context.getColor(2Yu.A04(context)), 199);
                Drawable mutate = drawable.mutate();
                0qQ.A07(mutate);
                mutate.setTint(A06);
                textView.setBackground(drawable);
            }
            ViewGroup.MarginLayoutParams A0G = DbX.A0G(textView);
            Resources A0B = C66580MXl.A0B(textView);
            A0G.setMarginStart(A00(A0B, R.dimen.abc_button_padding_horizontal_material));
            A0G.setMarginEnd(A00(A0B, R.dimen.abc_button_padding_horizontal_material));
            textView.setLayoutParams(A0G);
            int A002 = A00(A0B, R.dimen.account_discovery_bottom_gap);
            int A003 = A00(A0B, R.dimen.account_discovery_bottom_gap);
            textView.setPadding(A003, A002, A003, A002);
        }
        if (spannableString.length() == 0) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        if (r4.A04 != null) {
            z = true;
        }
        textView.setText(A0D);
        if (z) {
            DbT.A1H(textView);
            textView.setHighlightColor(0);
        }
    }

    public final Class modelClass() {
        return AnonymousClass7OD.class;
    }

    public C68592NOo(Context context, C332957Xc r2, AnonymousClass9HC r3) {
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = context;
    }

    public static final int A00(Resources resources, int i) {
        try {
            return resources.getDimensionPixelSize(i);
        } catch (Resources.NotFoundException unused) {
            0wb.A03("IgdBackground", 002.A0c("Cannot find resource dimension ", " in NullStateActionLogMessageItemDefinition", i));
            return 0;
        }
    }
}
