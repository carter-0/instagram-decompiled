package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.6cd  reason: invalid class name and case insensitive filesystem */
public final class C311406cd {
    public final Activity A00;
    public final Context A01;
    public final UserSession A02;
    public final C273384mU A03;

    public C311406cd(Activity activity, Context context, UserSession userSession, C273384mU r5) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = context;
        this.A00 = activity;
        this.A03 = r5;
    }

    public static final void A00(C255773uh r7, C311406cd r8, boolean z) {
        r8.A03.EHY("share");
        AnonymousClass19S A022 = AnonymousClass1HX.A02(108, 3);
        1Eo.A05(19B.A00, new C59674JTf((Object) r7, (Object) r8, (AnonymousClass4D7) null, 25, z), A022);
    }
}
