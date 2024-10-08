package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.WbA  reason: case insensitive filesystem */
public final class C19524WbA implements G7K {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ DialogInterface.OnDismissListener A01;
    public final /* synthetic */ 0hq A02;
    public final /* synthetic */ AnonymousClass07i A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ AnonymousClass36V A05;
    public final /* synthetic */ C255773uh A06;

    public final void Dje(List list) {
        List list2 = list;
        0qQ.A0B(list2, 0);
        C255773uh r9 = this.A06;
        UserSession userSession = this.A04;
        0hq r6 = this.A02;
        AnonymousClass07i r1 = this.A03;
        DialogInterface.OnDismissListener onDismissListener = this.A01;
        AnonymousClass36V r8 = this.A05;
        Activity activity = this.A00;
        C290815g0 A022 = C59730JVo.A02(activity, userSession, r9, C19201WPh.__redex_internal_original_name, false, AnonymousClass7TE.A1a(list2.get(0)));
        A022.A00 = new EHU(0, activity, onDismissListener, r6, userSession, r8, r9);
        SQH.A02(r6);
        1ES.A00(activity, r1, A022);
    }

    public final void onCancel() {
        throw AnonymousClass00P.createAndThrow();
    }

    public C19524WbA(Activity activity, DialogInterface.OnDismissListener onDismissListener, 0hq r3, AnonymousClass07i r4, UserSession userSession, AnonymousClass36V r6, C255773uh r7) {
        this.A06 = r7;
        this.A04 = userSession;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = onDismissListener;
        this.A05 = r6;
        this.A00 = activity;
    }
}
