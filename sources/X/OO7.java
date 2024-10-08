package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public final class OO7 {
    public C262204Co A00;
    public final LinearLayout A01;
    public final TextView A02;
    public final C250603lj A03;
    public final 2el A04;
    public final LDS A05;
    public final Integer A06;
    public final Set A07 = DbS.A0y();
    public final RecyclerView A08;
    public final UserSession A09;
    public final SpinnerImageView A0A;

    public final void A02(List list) {
        View view;
        if (!list.isEmpty()) {
            this.A05.A00(list);
            this.A01.setVisibility(0);
            this.A08.setVisibility(0);
            view = this.A0A;
        } else {
            view = this.A01;
        }
        view.setVisibility(8);
        this.A08.A0o(0);
    }

    public final void A03(List list) {
        View view;
        if (!list.isEmpty()) {
            LDS lds = this.A05;
            ViewModelListUpdate A0R = DbS.A0R();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0R.A00(new C71957Oti((C68137N2b) it.next()));
            }
            lds.A00.A05(A0R);
            this.A01.setVisibility(0);
            this.A08.setVisibility(0);
            view = this.A0A;
        } else {
            view = this.A01;
        }
        view.setVisibility(8);
        this.A08.A0o(0);
    }

    public final void A04(List list, AnonymousClass0r6 r6) {
        0qQ.A0B(list, 0);
        if (AnonymousClass7TE.A1b(list)) {
            this.A05.A00(list);
        }
        A01();
        this.A08.A0o(0);
        AnonymousClass4D7 A0t = C51975G9x.A0t(this.A00);
        if (r6 != null) {
            this.A00 = C51966G9m.A1L(new C73568Pfp(r6, this, A0t, 15), 19E.A02(AnonymousClass12T.A00.A04));
        }
    }

    public final void A00() {
        this.A08.setVisibility(4);
        SpinnerImageView spinnerImageView = this.A0A;
        spinnerImageView.setVisibility(0);
        DbS.A1T(spinnerImageView);
    }

    public final void A01() {
        boolean A1Q = AnonymousClass7TF.A1Q(this.A05.A00.getItemCount());
        View view = this.A01;
        if (!A1Q) {
            view.setVisibility(0);
            this.A08.setVisibility(0);
            view = this.A0A;
        }
        view.setVisibility(8);
    }

    public final boolean A05() {
        return AnonymousClass7TF.A1Q(this.A05.A00.getItemCount());
    }

    public OO7(LinearLayout linearLayout, AnonymousClass4DH r7, UserSession userSession, C329207Hz r9, Integer num, Consumer consumer) {
        int i;
        int i2;
        this.A09 = userSession;
        2el A002 = 2el.A00();
        this.A04 = A002;
        Context context = linearLayout.getContext();
        this.A01 = linearLayout;
        TextView A0G = DbU.A0G(linearLayout, R.id.direct_star_tab_horizontal_section_header);
        this.A02 = A0G;
        RecyclerView A0I = DbT.A0I(linearLayout, R.id.direct_star_tab_horizontal_section_recyclerview);
        this.A08 = A0I;
        this.A0A = (SpinnerImageView) linearLayout.requireViewById(R.id.direct_star_tab_horizontal_section_loading_spinner);
        this.A06 = num;
        if (num == AnonymousClass05K.A0N) {
            Dba.A0z(A0I, A002, r7);
        }
        this.A03 = new C59926Jbp(2, this, consumer);
        int intValue = num.intValue();
        switch (intValue) {
            case 0:
                i = 2131960356;
                break;
            case 1:
                i = 2131960358;
                break;
            case 2:
                i = 2131960366;
                break;
            default:
                i = 2131960364;
                break;
        }
        A0G.setText(i);
        switch (intValue) {
            case 0:
                i2 = 2131960357;
                break;
            case 1:
                i2 = 2131960359;
                break;
            case 2:
                i2 = 2131960367;
                break;
            default:
                i2 = 2131960365;
                break;
        }
        DbU.A12(context, A0G, i2);
        DbV.A1A(context, A0I);
        LDS lds = new LDS(context, userSession, this, r9);
        this.A05 = lds;
        A0I.setAdapter(lds.A00);
        int A012 = DbY.A01(context);
        JTP.A1D(A0I, A012 * 2, A012);
        A0I.setItemAnimator((AnonymousClass3AS) null);
    }
}
