package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lak  reason: case insensitive filesystem */
public final class C64368Lak implements CallerContextable {
    public static final CallerContext A03 = CallerContext.A00(C64368Lak.class);
    public static final String __redex_internal_original_name = "FacebookCrossPostManager";
    public 0sP A00 = MOQ.A00;
    public final AnonymousClass4DH A01;
    public final UserSession A02;

    public C64368Lak(AnonymousClass4DH r2, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = r2;
    }
}
