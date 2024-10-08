package X;

import com.instagram.common.session.UserSession;
import java.util.EnumSet;

/* renamed from: X.5jO  reason: invalid class name and case insensitive filesystem */
public final class C292705jO extends 0ng {
    public final /* synthetic */ AnonymousClass4M1 A00;
    public final /* synthetic */ String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C292705jO(AnonymousClass4M1 r2, String str) {
        super(698);
        this.A00 = r2;
        this.A01 = str;
    }

    public final void run() {
        AnonymousClass4M1 r1 = this.A00;
        EnumSet enumSet = AnonymousClass4M1.A1M;
        UserSession userSession = r1.A0m;
        if (182.A06(0Tu.A05, userSession, 36320790370591584L)) {
            C241923Rx.A00(userSession).A00(this.A01);
        } else {
            Ky0.A00(userSession).A00(this.A01);
        }
    }
}
