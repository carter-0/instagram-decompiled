package X;

import android.content.Context;
import android.content.Intent;
import com.instagram.acp.igacpsecuritykey.IGACPSecurityKeySignInActivity;
import com.instagram.base.activity.IgFragmentActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Rgb  reason: case insensitive filesystem */
public abstract class C9779Rgb {
    /* JADX WARNING: type inference failed for: r3v0, types: [X.RgE, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v2, types: [com.instagram.base.activity.IgFragmentActivity, android.app.Activity] */
    public static final Object A00(C307896Rx r11, AnonymousClass6Tm r12) {
        Context context;
        ? r6;
        C307786Rm r0 = r11.A03;
        if (r0 != null) {
            context = r0.A00;
        } else {
            context = null;
        }
        Object A00 = r12.A00();
        0qQ.A0C(A00, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A00;
        String A0n = Pxg.A0n(r12, 3);
        Object A03 = r12.A03(4);
        0qQ.A0C(A03, AnonymousClass000.A00(12));
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : (List) A03) {
            if ((next instanceof String) && next != null) {
                A1C.add(next);
            }
        }
        C277014uI A0P = DbW.A0P(r12, 5);
        C277014uI A0P2 = DbW.A0P(r12, 6);
        if (context == null) {
            return null;
        }
        ? obj = new Object();
        AnonymousClass7TG.A1Q(str, A0n);
        Intent A0A = C66580MXl.A0A(context, IGACPSecurityKeySignInActivity.class);
        A0A.putExtra("extra_challenge", str);
        A0A.putExtra("extra_rpid", A0n);
        A0A.putStringArrayListExtra("extra_allow_credentials", AnonymousClass7TE.A1D(A1C));
        if ((context instanceof IgFragmentActivity) && (r6 = (IgFragmentActivity) context) != 0) {
            r6.registerOnActivityResultListener(new T74(obj, r11, A0P, A0P2));
            0kR.A07(r6, A0A, 42625);
        }
        return null;
    }
}
