package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fox  reason: case insensitive filesystem */
public final class C51125Fox implements C363768kJ {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ FH4 A01;
    public final /* synthetic */ 0rm A02;

    public C51125Fox(UserSession userSession, FH4 fh4, 0rm r3) {
        this.A00 = userSession;
        this.A02 = r3;
        this.A01 = fh4;
    }

    public final void onFailure() {
        this.A01.A0C((EVP) this.A02.A00);
    }

    public final void onSuccess() {
        UserSession userSession = this.A00;
        Number number = (Number) 1wB.A00(userSession).A06().get("INSTAGRAM");
        if (number != null && number.intValue() > 1) {
            27y A002 = 27u.A00(userSession);
            CallerContext.A01("NativeScreenNavigatorFactory");
            if (A002.A01()) {
                this.A02.A00 = EVP.LINKED_ACCOUNTS;
            }
        }
        this.A01.A0C((EVP) this.A02.A00);
    }
}
