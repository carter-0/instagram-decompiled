package X;

import com.instagram.zero.main.IgZeroMain;

/* renamed from: X.Nrz  reason: case insensitive filesystem */
public abstract class C69776Nrz {
    public static final Object A00(AnonymousClass6Tm r8) {
        IgZeroMain igZeroMain;
        String A0g = DbY.A0g(r8);
        0qQ.A0B(A0g, 2);
        int A03 = 2SP.A01.A03();
        02m A0l = C51965G9l.A0l();
        A0l.A0U(238953550, A03, A0g);
        A0l.markerPoint(238953550, A03, "post_optin_start");
        if (!(AnonymousClass3OC.A00 == null || (igZeroMain = IgZeroMain.A08) == null)) {
            AnonymousClass7TE.A1Z(new C58106ImS((Object) igZeroMain, (AnonymousClass4D7) null, 25), AnonymousClass1HX.A02(273884380, 3));
        }
        A0l.markerPoint(238953550, A03, "post_optin_campaign_api_triggered");
        A0l.markerPoint(238953550, A03, "post_optin_end");
        A0l.markerEndAtPoint(238953550, A03, 2, "post_optin_end");
        return null;
    }
}
