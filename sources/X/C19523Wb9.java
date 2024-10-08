package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Wb9  reason: case insensitive filesystem */
public final class C19523Wb9 implements G7K {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ DialogInterface.OnDismissListener A01;
    public final /* synthetic */ 0hq A02;
    public final /* synthetic */ AnonymousClass07i A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ C255773uh A05;

    public final void Dje(List list) {
        List list2 = list;
        0qQ.A0B(list2, 0);
        C255773uh r8 = this.A05;
        Context context = this.A00;
        UserSession userSession = this.A04;
        AnonymousClass07i r1 = this.A03;
        DialogInterface.OnDismissListener onDismissListener = this.A01;
        0hq r6 = this.A02;
        C290815g0 A022 = C59730JVo.A02(context, userSession, r8, C19201WPh.__redex_internal_original_name, true, AnonymousClass7TE.A1a(list2.get(0)));
        A022.A00 = new EHQ(1, context, onDismissListener, r6, userSession, r8);
        SQH.A02(r6);
        1ES.A00(context, r1, A022);
    }

    public final void onCancel() {
    }

    public C19523Wb9(Context context, DialogInterface.OnDismissListener onDismissListener, 0hq r3, AnonymousClass07i r4, UserSession userSession, C255773uh r6) {
        this.A05 = r6;
        this.A00 = context;
        this.A04 = userSession;
        this.A03 = r4;
        this.A01 = onDismissListener;
        this.A02 = r3;
    }
}
