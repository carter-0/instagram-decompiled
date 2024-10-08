package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

public final class IQI implements C66476MTe {
    public final /* synthetic */ C52780GcX A00;
    public final /* synthetic */ C293505kq A01;
    public final /* synthetic */ AnonymousClass3Q2 A02;
    public final /* synthetic */ C53081GiF A03;

    public final void DWa() {
    }

    public IQI(C52780GcX gcX, C293505kq r2, AnonymousClass3Q2 r3, C53081GiF giF) {
        this.A03 = giF;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = gcX;
    }

    public final void DWb() {
        Long l;
        C53081GiF giF = this.A03;
        UserSession userSession = giF.A07;
        Activity activity = giF.A03;
        AnonymousClass3Q2 r6 = this.A02;
        C293505kq r3 = this.A01;
        boolean z = r3.A17;
        String str = r6.A2Z;
        C279584ys r0 = r3.A08;
        if (r0 != null) {
            l = Long.valueOf(r0.A00);
        } else {
            l = null;
        }
        C63103KrW.A00(activity, userSession, r6, str, String.valueOf(l), C58699Iw8.A00(r3, this.A00, giF, r6, 40), z);
        giF.A00++;
        C250563lf.A0N(activity, giF.A05, userSession, (AnonymousClass4DU) null, r6);
    }
}
