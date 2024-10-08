package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.fxcropapp.ig.IgCropActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Rgk  reason: case insensitive filesystem */
public abstract class C9788Rgk {
    public static final Object A00(C307896Rx r7, AnonymousClass6Tm r8) {
        Object A01 = r8.A01();
        0qQ.A0C(A01, C66579MXk.A00(0));
        UserSession A0B = C308206Td.A0B(r7);
        Context context = ((C307786Rm) A01).A00;
        0qQ.A0B(A0B, 3);
        String A0t = DbU.A0t(r8.A00, 2);
        SCZ.A00 = r7;
        0R3 A07 = 0kR.A00.A07();
        AnonymousClass6QE r0 = AnonymousClass6QE.A02;
        Uri A012 = AnonymousClass6QJ.A01(DbT.A09(A0t), true);
        String str = A0B.A05;
        float f = IgCropActivity.A02;
        Intent A0A = C66580MXl.A0A(context, IgCropActivity.class);
        A0A.putExtra("", A012);
        A0A.putExtra("IgSessionManager.SESSION_TOKEN_KEY", str);
        A07.A0G(context, A0A);
        return null;
    }
}
