package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lx7  reason: case insensitive filesystem */
public final class C65630Lx7 implements G7M {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass4DH A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ 1Xj A03;
    public final /* synthetic */ L75 A04;
    public final /* synthetic */ LB7 A05;
    public final /* synthetic */ C47522E6i A06;
    public final /* synthetic */ String A07;

    public final void onAuthorizeFail() {
    }

    public C65630Lx7(Context context, AnonymousClass4DH r2, UserSession userSession, 1Xj r4, L75 l75, LB7 lb7, C47522E6i e6i, String str) {
        this.A05 = lb7;
        this.A04 = l75;
        this.A06 = e6i;
        this.A00 = context;
        this.A01 = r2;
        this.A02 = userSession;
        this.A03 = r4;
        this.A07 = str;
    }

    public final void onAuthorizeSuccess(String str) {
        LB7 lb7 = this.A05;
        L75 l75 = this.A04;
        C47522E6i e6i = this.A06;
        Context context = this.A00;
        AnonymousClass4DH r5 = this.A01;
        UserSession userSession = this.A02;
        C363388je.A00(userSession).A01(C64374Laq.A01, new C65247Lpr(context, r5, userSession, this.A03, l75, lb7, e6i, this.A07, false), "likes_sheet");
    }
}
