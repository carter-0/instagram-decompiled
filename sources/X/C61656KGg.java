package X;

import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.KGg  reason: case insensitive filesystem */
public final class C61656KGg extends C232232tF {
    public final AnonymousClass0iw A00;
    public final 0sP A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new C60653Jp0(DbU.A09(layoutInflater, viewGroup, R.layout.layout_ai_agent_picker_item, false), this.A00, this.A01);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r6, C249703kE r7) {
        C61163JyF jyF = (C61163JyF) r6;
        C60653Jp0 jp0 = (C60653Jp0) r7;
        boolean A1U = AnonymousClass7TF.A1U(0, jyF, jp0);
        jp0.A03.setUrl(jyF.A00, jp0.A02);
        TextView textView = jp0.A00;
        SpannableStringBuilder A0C = DbS.A0C(jyF.A02);
        C244273av.A08(JTQ.A06(jp0), A0C, A1U);
        textView.setText(A0C);
        String str = jyF.A03;
        if (str == null || str.length() == 0) {
            jp0.A01.setVisibility(8);
        } else {
            TextView textView2 = jp0.A01;
            textView2.setVisibility(0);
            textView2.setText(str);
        }
        LYG.A02(jp0.itemView, 66, jp0, jyF);
    }

    public final Class modelClass() {
        return C61163JyF.class;
    }

    public C61656KGg(AnonymousClass0iw r1, 0sP r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
