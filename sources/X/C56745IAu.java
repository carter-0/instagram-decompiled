package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.IAu  reason: case insensitive filesystem */
public final class C56745IAu implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass3O8 A00;
    public final /* synthetic */ C2357130x A01;

    public C56745IAu(AnonymousClass3O8 r1, C2357130x r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1561322555);
        C2357130x r3 = this.A01;
        AnonymousClass3O8 r1 = this.A00;
        Context requireContext = r3.A0O.requireContext();
        UserSession userSession = r3.A0J;
        AnonymousClass4DU r5 = r3.A0K;
        String obj = r1.B5J().toString();
        C53441GoZ goZ = (C53441GoZ) r1.A00;
        FFi.A02(requireContext, r5, userSession, obj, goZ.A0B, goZ.A08, r1.getId(), r1.C9L(), true);
        AnonymousClass0fD.A0C(263120300, A05);
    }
}
