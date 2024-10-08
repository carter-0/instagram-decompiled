package X;

import com.instagram.appreciation.mediasettings.AppreciationMediaSettingsApi;
import com.instagram.common.session.UserSession;
import com.instagram.monetization.repository.MonetizationRepository;

/* renamed from: X.JXr  reason: case insensitive filesystem */
public final class C59774JXr {
    public final AppreciationMediaSettingsApi A00;
    public final UserSession A01;
    public final MonetizationRepository A02;

    public /* synthetic */ C59774JXr(UserSession userSession) {
        AppreciationMediaSettingsApi appreciationMediaSettingsApi = new AppreciationMediaSettingsApi(userSession);
        MonetizationRepository A002 = AnonymousClass2o3.A00(userSession);
        0qQ.A0B(A002, 3);
        this.A01 = userSession;
        this.A00 = appreciationMediaSettingsApi;
        this.A02 = A002;
    }
}
