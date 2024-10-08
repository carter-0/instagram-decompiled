package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lpu  reason: case insensitive filesystem */
public final class C65250Lpu implements C3034168s {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass4DH A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C61149Jy0 A03;
    public final /* synthetic */ L75 A04;
    public final /* synthetic */ LB7 A05;
    public final /* synthetic */ C47522E6i A06;

    public C65250Lpu(Context context, AnonymousClass4DH r2, UserSession userSession, C61149Jy0 jy0, L75 l75, LB7 lb7, C47522E6i e6i) {
        this.A03 = jy0;
        this.A05 = lb7;
        this.A04 = l75;
        this.A00 = context;
        this.A01 = r2;
        this.A02 = userSession;
        this.A06 = e6i;
    }

    public final void DED() {
        C61149Jy0 jy0 = this.A03;
        LB7 lb7 = this.A05;
        C64374Laq.A02(this.A00, this.A01, this.A02, jy0, this.A04, lb7, this.A06);
    }

    public final void onSuccess() {
        C61149Jy0 jy0 = this.A03;
        LB7 lb7 = this.A05;
        C64374Laq.A02(this.A00, this.A01, this.A02, jy0, this.A04, lb7, this.A06);
    }
}
