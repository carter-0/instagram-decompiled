package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class EGP extends C232222tE {
    public final C49386Euo A00;

    /* renamed from: A00 */
    public final void bind(C47007Doz doz, IOS ios) {
        int i;
        String string;
        boolean A1U = AnonymousClass7TF.A1U(0, ios, doz);
        View view = doz.itemView;
        Context context = view.getContext();
        C319156q8 r3 = ios.A00;
        view.setEnabled(A1U);
        2eS.A01(doz.itemView);
        C49386Euo euo = this.A00;
        if (euo != null) {
            FPG.A00(doz.itemView, 36, euo, r3);
            doz.itemView.setOnLongClickListener(new FPV(A1U ? 1 : 0, euo, r3));
        }
        doz.A00.setImageResource(r3.A00);
        TextView textView = doz.A01;
        C319176qA r2 = r3.A02;
        textView.setText(r2.A01(context));
        doz.itemView.setContentDescription(r2.A01(context));
        G5B A01 = r3.A01();
        if (A01 instanceof C50692Fgr) {
            int i2 = ((C50692Fgr) A01).A00;
            C252063oV r32 = doz.A03;
            View view2 = r32.getView();
            if (i2 > 0) {
                TextView textView2 = (TextView) view2;
                if (i2 < 10) {
                    string = String.valueOf(i2);
                } else {
                    string = context.getString(2131973981);
                    0qQ.A0A(string);
                }
                textView2.setText(string);
                view2 = r32.getView();
                i = R.drawable.list_badge_small;
            } else {
                i = R.drawable.list_badge_donut;
            }
            view2.setBackgroundResource(i);
            r32.setVisibility(0);
        } else if (0qQ.A0K(A01, C50690Fgp.A00)) {
            doz.A03.setVisibility(8);
            doz.A04.setVisibility(0);
            doz.A02.setVisibility(8);
        } else if (0qQ.A0K(A01, C50691Fgq.A00)) {
            doz.A03.setVisibility(8);
        } else {
            throw AnonymousClass7TE.A1K();
        }
        doz.A04.setVisibility(8);
        doz.A02.setVisibility(8);
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C47007Doz(DbT.A0D(layoutInflater, viewGroup, R.layout.profile_menu_options_row, false));
    }

    public final Class modelClass() {
        return IOS.class;
    }

    public EGP(C49386Euo euo) {
        this.A00 = euo;
    }

    public EGP() {
        this((C49386Euo) null);
    }
}
