package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

public final class I8O implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ 1Xj A02;
    public final /* synthetic */ AnonymousClass4DU A03;
    public final /* synthetic */ Long A04;

    public I8O(Context context, UserSession userSession, 1Xj r3, AnonymousClass4DU r4, Long l) {
        this.A04 = l;
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = r3;
        this.A03 = r4;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Long l = this.A04;
        if (l != null) {
            C51974G9v.A1E(AnonymousClass0kN.A01(this.A03, this.A01), l, "ig_coauthor_invite_decline_tap");
        }
        Context context = this.A00;
        UserSession userSession = this.A01;
        1Xj r3 = this.A02;
        String A16 = AnonymousClass7TE.A16(context, 2131957493);
        AnonymousClass6ST A0h = DbV.A0h(context);
        Activity activity = (Activity) C334957c9.A00(context, Activity.class);
        if (activity != null) {
            A0h.setOwnerActivity(activity);
        }
        AnonymousClass3YV.A04(userSession, r3, A0h, CD2.class, C45538CyC.class, "decline_coauthor_invite/", A16, (C62320sa) null);
    }
}
