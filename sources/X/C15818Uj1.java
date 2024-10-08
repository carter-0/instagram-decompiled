package X;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Uj1  reason: case insensitive filesystem */
public final class C15818Uj1 extends C232232tF {
    public final String A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C14870UCy(DbT.A0D(DbX.A0E(viewGroup), viewGroup, R.layout.layout_ads_consent_growth_bottomsheet_header, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r8, C249703kE r9) {
        C15077UNu uNu = (C15077UNu) r8;
        C14870UCy uCy = (C14870UCy) r9;
        boolean A1U = AnonymousClass7TF.A1U(0, uNu, uCy);
        String str = this.A00;
        C61084JwM jwM = uNu.A00;
        Number number = (Number) jwM.A00;
        ImageView imageView = uCy.A00;
        if (number == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            imageView.setImageResource(number.intValue());
        }
        TextView textView = uCy.A02;
        CharSequence A002 = C66909Mes.A00(AnonymousClass7TE.A0S(textView), (C266444Yx) jwM.A02);
        if (A002.length() == 0) {
            textView.setVisibility(8);
        } else {
            textView.setText(A002);
        }
        TextView textView2 = uCy.A01;
        Context A0S = AnonymousClass7TE.A0S(textView2);
        CharSequence A003 = C66909Mes.A00(A0S, (C266444Yx) jwM.A01);
        if (A003.length() == 0) {
            textView2.setVisibility(8);
            return;
        }
        textView2.setVisibility(0);
        if (0qQ.A0K(str, "activity_feed_notification_3PD_content")) {
            AnonymousClass7AV.A07(new UsT(uNu, C13988Tno.A08(A0S), A1U ? 1 : 0), textView2, AnonymousClass7TE.A16(A0S, 2131952200), A003.toString());
            return;
        }
        Html.escapeHtml(new String[]{""}[0]);
        String obj = A003.toString();
        if (obj == null) {
            obj = "";
        }
        textView2.setText(Html.fromHtml(obj));
    }

    public final Class modelClass() {
        return C15077UNu.class;
    }

    public C15818Uj1(String str) {
        this.A00 = str;
    }
}
