package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import java.util.List;

public final class EH4 extends C232232tF {
    public final Context A00;
    public final UserSession A01;

    public EH4(UserSession userSession, Context context) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = context;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View inflate = DbX.A0F(viewGroup, 0).inflate(R.layout.channel_education_dropdown_headline, viewGroup, false);
        List list = C47038DpV.A0A;
        UserSession userSession = this.A01;
        Context context = this.A00;
        0qQ.A0A(inflate);
        return new C47038DpV(context, inflate, userSession);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r18, C249703kE r19) {
        FY2 fy2 = (FY2) r18;
        C47038DpV dpV = (C47038DpV) r19;
        AnonymousClass7TF.A1H(fy2, dpV);
        dpV.A09.setImageResource(R.drawable.instagram_illustrations_product_illustration_pi_plus_what_are_channels);
        IgTextView igTextView = dpV.A07;
        Context context = dpV.A00;
        DbT.A18(context, igTextView, 2131955029);
        DbT.A18(context, dpV.A05, 2131955006);
        DbT.A18(context, dpV.A06, 2131955007);
        List list = fy2.A00;
        int i = 0;
        for (Object next : 00k.A0d(C47038DpV.A0A, list.size())) {
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            int A0M = AnonymousClass7TE.A0M(next);
            N4H n4h = (N4H) list.get(i);
            C252063oV A0Y = DbU.A0Y(dpV.A03, A0M);
            DbU.A13(context, DbU.A0F(A0Y.getView(), R.id.icon), n4h.A01);
            DbT.A18(02K.A01(context), Dba.A06(A0Y.getView()), n4h.A02);
            TextView A0R = AnonymousClass7TG.A0R(A0Y.getView(), R.id.description);
            A0R.setVisibility(8);
            Number number = (Number) n4h.A03;
            if (number != null) {
                int intValue = number.intValue();
                if (n4h.A04 != null) {
                    Number number2 = (Number) n4h.A04;
                    if (number2 != null) {
                        String A16 = AnonymousClass7TE.A16(context, number2.intValue());
                        String A0c = DbY.A0c(context, A16, intValue);
                        DbT.A1H(A0R);
                        int A02 = DbV.A02(context);
                        AnonymousClass7AV.A07(new C47566E8e(new 04x(16, A16), n4h, dpV, AnonymousClass05K.A01, A16, A02), A0R, A16, A0c);
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                } else {
                    DbT.A18(02K.A01(context), A0R, intValue);
                }
                A0R.setVisibility(0);
            }
            i = i2;
        }
        dpV.A02.setVisibility(8);
        FPI.A01(dpV.A01, 31, dpV);
    }

    public final Class modelClass() {
        return FY2.class;
    }
}
