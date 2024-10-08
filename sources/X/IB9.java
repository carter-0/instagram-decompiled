package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

public final /* synthetic */ class IB9 implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass5j1 A00;
    public final /* synthetic */ C57249IUk A01;
    public final /* synthetic */ C2357130x A02;

    public /* synthetic */ IB9(AnonymousClass5j1 r1, C57249IUk iUk, C2357130x r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = iUk;
    }

    public final void onClick(View view) {
        C2357130x r3 = this.A02;
        AnonymousClass5j1 r8 = this.A00;
        C57249IUk iUk = this.A01;
        iUk.getPosition();
        C57214ITb iTb = new C57214ITb(r8, iUk);
        Context requireContext = r3.A0O.requireContext();
        C49572Eyh eyh = new C49572Eyh(iTb, iUk, r3);
        AnonymousClass4DU r9 = r3.A0K;
        UserSession userSession = r3.A0J;
        C249763kK r6 = r3.A0N;
        0qQ.A0B(r9, 4);
        AnonymousClass7TG.A1S(userSession, r6);
        C50019FJe fJe = new C50019FJe(1, (Object) eyh, (Object) r6, (Object) userSession, (Object) r8, (Object) r9, (Object) iUk);
        C358248ab A0Y = DbS.A0Y(requireContext);
        A0Y.A0Y(fJe, C358278ae.RED, AnonymousClass7TF.A0d(requireContext.getResources(), 2131963394), true);
        AnonymousClass7TH.A0a(A0Y, true);
    }
}
