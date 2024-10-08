package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Ekr  reason: case insensitive filesystem */
public abstract class C48829Ekr {
    public static final void A00(Context context, UserSession userSession, IgTextView igTextView, C51862G4v g4v) {
        DbZ.A0t(0, userSession, igTextView, g4v);
        if (g4v instanceof C47257Dtl) {
            C47257Dtl dtl = (C47257Dtl) g4v;
            String A16 = AnonymousClass7TE.A16(context, dtl.A01);
            DbT.A1H(igTextView);
            SpannableStringBuilder A0D = DbY.A0D(context, A16, dtl.A00);
            AnonymousClass7AV.A04(A0D, new C48050ESt(context, userSession, g4v, DbV.A02(context)), A16);
            igTextView.setText(A0D);
            if (2eO.A00(igTextView.getContext())) {
                FPH.A00(igTextView, context, userSession, g4v, 23);
            }
        } else if (g4v instanceof C47256Dtk) {
            igTextView.setText(C66909Mes.A00(context, ((C47256Dtk) g4v).A00));
        } else {
            throw AnonymousClass7TE.A1K();
        }
    }
}
