package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class IDG implements View.OnLongClickListener {
    public final int A00;
    public final Object A01;

    public IDG(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean onLongClick(View view) {
        1Xl A002;
        switch (this.A00) {
            case 0:
                C53948Gws gws = (C53948Gws) this.A01;
                C52971GgO ggO = gws.A02;
                if (ggO == null) {
                    return true;
                }
                ggO.A0N(gws.A01);
                return true;
            case 1:
            case 2:
                C55648Hl7 hl7 = ((C55876Hox) this.A01).A05;
                H1L h1l = hl7.A01;
                AnonymousClass0eM r5 = h1l.A0B;
                UserSession A0l = AnonymousClass7TE.A0l(r5);
                String str = h1l.A02;
                String str2 = h1l.A03;
                0qQ.A0B(A0l, 0);
                if (str2 == null || (A002 = C324666zh.A00(A0l, str, str2)) == null) {
                    return false;
                }
                Context context = hl7.A00;
                0qQ.A0C(context, "null cannot be cast to non-null type android.app.Activity");
                Activity activity = (Activity) context;
                H1L h1l2 = h1l;
                new C52031GCd(activity, AnonymousClass7TE.A0l(r5), h1l2, (C228232l0) null, new IZE(1), C52212GJd.A0A, (String) null).A0L(new C271794jb(AnonymousClass7TE.A0l(r5), A002.BPf()), A002, new C55894HpF((String) null, (String) null, (String) null, false, true, true, false, false, true, false, false, false, false, false, false, false, false));
                return true;
            default:
                return false;
        }
    }
}
