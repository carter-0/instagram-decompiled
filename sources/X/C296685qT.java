package X;

import com.instagram.common.session.UserSession;
import fxcache.model.FxCalAccountLinkageInfo;

/* renamed from: X.5qT  reason: invalid class name and case insensitive filesystem */
public final class C296685qT extends 0ng {
    public final /* synthetic */ 1wM A00;
    public final /* synthetic */ FxCalAccountLinkageInfo A01;
    public final /* synthetic */ FxCalAccountLinkageInfo A02;

    /* JADX WARNING: type inference failed for: r0v4, types: [X.1qK, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v6, types: [X.1qK, java.lang.Object] */
    public final void run() {
        1wM r2 = this.A00;
        if (!0qQ.A0K(1wM.A00(this.A02), 1wM.A00(this.A01))) {
            UserSession userSession = r2.A06;
            AnonymousClass1Nd.A00(userSession).A00(new Object());
            if (1CI.A00(userSession)) {
                AnonymousClass1Nd.A00(userSession).A00(new Object());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C296685qT(1wM r4, FxCalAccountLinkageInfo fxCalAccountLinkageInfo, FxCalAccountLinkageInfo fxCalAccountLinkageInfo2) {
        super(1479687326, 3, false, false);
        this.A00 = r4;
        this.A02 = fxCalAccountLinkageInfo;
        this.A01 = fxCalAccountLinkageInfo2;
    }
}
