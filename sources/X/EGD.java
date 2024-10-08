package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class EGD extends C232222tE {
    public final Activity A00;
    public final UserSession A01;
    public final AnonymousClass70R A02;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new C46992Dok(DbU.A09(layoutInflater, viewGroup, R.layout.subinterest_round_pill, false), (C355568Qm) null);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r9, C249703kE r10) {
        String str;
        C47252Dtd dtd = (C47252Dtd) r9;
        C46992Dok dok = (C46992Dok) r10;
        AnonymousClass7TG.A1N(dtd, dok);
        AnonymousClass70R r7 = this.A02;
        UserSession userSession = this.A01;
        Activity activity = this.A00;
        AnonymousClass7TG.A0w(2, r7, userSession, activity);
        TextView textView = dok.A01;
        if (dtd.A00) {
            str = DbU.A05(textView).getString(2131969997);
        } else {
            str = "";
        }
        textView.setText(str);
        textView.setTextAppearance(R.style.igds_button_label_destination);
        DbY.A11(textView, textView.getContext());
        C252063oV r3 = dok.A02;
        r3.setVisibility(0);
        ((ImageView) r3.getView()).setImageResource(R.drawable.instagram_add_pano_outline_24);
        DbU.A14(r3.getView().getContext(), (ImageView) r3.getView(), 2Yu.A09(r3.getView().getContext()));
        View view = dok.A00;
        FP1.A01(view, 62, r7);
        if (182.A06(0Tu.A05, userSession, 36316345079632107L)) {
            1Av A002 = 1Au.A00(userSession);
            if (AnonymousClass7TG.A1a(A002, A002.A7q, 1Av.A8a, 213)) {
                view.postDelayed(new C51510FvI(activity, view, userSession, r7), 100);
            }
        }
    }

    public final Class modelClass() {
        return C47252Dtd.class;
    }

    public EGD(Activity activity, UserSession userSession, AnonymousClass70R r3) {
        this.A01 = userSession;
        this.A00 = activity;
        this.A02 = r3;
    }
}
