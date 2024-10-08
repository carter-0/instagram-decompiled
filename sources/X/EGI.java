package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.flowlayout.HorizontalFlowLayout;
import java.util.List;

public final class EGI extends C232222tE {
    public final Context A00;
    public final UserSession A01;
    public final 2el A02;
    public final E53 A03;
    public final Integer A04;

    public EGI(Context context, UserSession userSession, 2el r4, E53 e53, Integer num) {
        0qQ.A0B(userSession, 2);
        this.A00 = context;
        this.A01 = userSession;
        this.A04 = num;
        this.A03 = e53;
        this.A02 = r4;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new C46943Dnx(DbU.A09(layoutInflater, viewGroup, R.layout.interest_title_and_sub_interests_pill_item, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r17, C249703kE r18) {
        String str;
        C47238DtP dtP = (C47238DtP) r17;
        C46943Dnx dnx = (C46943Dnx) r18;
        boolean A1Z = AnonymousClass7TG.A1Z(dtP, dnx);
        UserSession userSession = this.A01;
        Context context = this.A00;
        Integer num = this.A04;
        E53 e53 = this.A03;
        2el r11 = this.A02;
        boolean A1S = DbW.A1S(A1Z ? 1 : 0, userSession, context);
        AnonymousClass7TG.A1R(num, e53);
        0qQ.A0B(r11, 6);
        C266444Yx r1 = dtP.A00;
        if (r1 != null) {
            str = r1.A00(AnonymousClass7TF.A0A(context)).toString();
        } else {
            str = null;
        }
        TextView textView = dnx.A00;
        Resources A0A = AnonymousClass7TF.A0A(context);
        C266444Yx r12 = dtP.A01;
        0qQ.A0B(r12, 1);
        A0Q.A00(context, textView, r12.A00(A0A).toString(), str);
        HorizontalFlowLayout horizontalFlowLayout = dnx.A01;
        horizontalFlowLayout.removeAllViews();
        List list = dtP.A02;
        if (list != null) {
            int i = 0;
            for (Object next : list) {
                int i2 = i + 1;
                if (i < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                C61082JwK jwK = (C61082JwK) next;
                boolean z = false;
                C46992Dok dok = new C46992Dok(DbT.A0D(LayoutInflater.from(context), horizontalFlowLayout, R.layout.subinterest_round_pill, A1S), (C355568Qm) null);
                if (i == 0) {
                    z = true;
                }
                C48956Emu.A00(context, userSession, r11, e53, dok, new C47235DtM(jwK, z), num);
                View view = dok.A00;
                0nA.A0T(view, DbS.A02(context, 8));
                horizontalFlowLayout.addView(view);
                i = i2;
            }
        }
    }

    public final Class modelClass() {
        return C47238DtP.class;
    }
}
