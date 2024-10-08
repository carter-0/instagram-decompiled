package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.FTv  reason: case insensitive filesystem */
public final class C50215FTv implements C51895G6l {
    public final int A00;
    public final Object A01;

    public final void onError(Throwable th) {
    }

    public C50215FTv(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Dp1(EV6 ev6) {
        switch (this.A00) {
            case 0:
                0qQ.A0B(ev6, 0);
                if (ev6 == EV6.STATUS_SUCCESS) {
                    ((BusinessConversionActivity) this.A01).A06 = true;
                    return;
                } else if (ev6 == EV6.STATUS_USER_SKIPPED_OR_ALREADY_LINKED) {
                    ((BusinessConversionActivity) this.A01).A05 = true;
                    return;
                } else {
                    return;
                }
            case 1:
                C15387Ubm.A03((C15387Ubm) ((FP1) this.A01).A01);
                return;
            case 2:
                if (ev6 == EV6.STATUS_SUCCESS) {
                    C46656Dib.A0C((C46656Dib) this.A01);
                    return;
                }
                return;
            default:
                E28 e28 = (E28) this.A01;
                if (ev6 == EV6.STATUS_SUCCESS) {
                    UserSession userSession = e28.A00;
                    AnonymousClass9JK r5 = new AnonymousClass9JK(CallerContext.A00(E28.class), "ig_android_ig_business_asset_ig_to_fb_crossposting", "ig_to_fb_crossposting", "crossposting", "loading");
                    C50205FTl fTl = new C50205FTl(e28, 2);
                    0qQ.A0B(userSession, 0);
                    DbV.A0O(userSession).AUs(r5, AnonymousClass9F1.A00, fTl);
                    return;
                }
                return;
        }
    }
}
