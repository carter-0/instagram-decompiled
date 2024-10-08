package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Emu  reason: case insensitive filesystem */
public abstract class C48956Emu {
    public static final void A00(Context context, UserSession userSession, 2el r13, AnonymousClass70R r14, C46992Dok dok, C47235DtM dtM, Integer num) {
        AnonymousClass7TG.A1N(context, userSession);
        AnonymousClass70R r8 = r14;
        Integer num2 = num;
        AnonymousClass7TG.A1R(num2, r14);
        C47235DtM dtM2 = dtM;
        C61082JwK jwK = dtM2.A00;
        C46992Dok dok2 = dok;
        TextView textView = dok.A01;
        textView.setTextAppearance(R.style.igds_emphasized_body_1);
        boolean z = jwK.A01;
        int i = R.color.igds_bio_pill_text;
        if (z) {
            i = R.color.igds_bio_pill_active_text;
        }
        DbT.A17(context, textView, i);
        C51954G8x g8x = (C51954G8x) jwK.A00;
        String name = g8x.getName();
        if (name == null) {
            name = "";
        }
        A0Q.A00(context, textView, name, g8x.getEmoji());
        dok.A02.setVisibility(8);
        View view = dok.A00;
        FPF.A00(view, 49, r14, jwK);
        view.setSelected(z);
        if (r13 != null) {
            r13.A05(view, DbU.A0a(new H8X(userSession, r14), AnonymousClass30Y.A00(g8x, C60340gF.A00, String.valueOf(g8x.B6N()))));
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new C50118FPi(view, jwK, r8, dok2, dtM2));
        if (num2 == AnonymousClass05K.A0C) {
            0nA.A0U(view, DbS.A02(context, 8));
        }
    }
}
