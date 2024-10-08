package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lpr  reason: case insensitive filesystem */
public final class C65247Lpr implements C363658k8 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass4DH A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ 1Xj A03;
    public final /* synthetic */ L75 A04;
    public final /* synthetic */ LB7 A05;
    public final /* synthetic */ C47522E6i A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;

    public final /* synthetic */ void Dcq() {
    }

    public C65247Lpr(Context context, AnonymousClass4DH r2, UserSession userSession, 1Xj r4, L75 l75, LB7 lb7, C47522E6i e6i, String str, boolean z) {
        this.A05 = lb7;
        this.A04 = l75;
        this.A06 = e6i;
        this.A00 = context;
        this.A01 = r2;
        this.A02 = userSession;
        this.A03 = r4;
        this.A07 = str;
        this.A08 = z;
    }

    public final void Dcr() {
        LB7 lb7 = this.A05;
        L75 l75 = this.A04;
        C47522E6i e6i = this.A06;
        Context context = this.A00;
        AnonymousClass4DH r5 = this.A01;
        UserSession userSession = this.A02;
        1Xj r7 = this.A03;
        String str = this.A07;
        boolean z = this.A08;
        l75.A00 = true;
        e6i.A03();
        1Xj r2 = l75.A02;
        if (r2.A1k() != AnonymousClass3YP.SHARED && r2.A1k() != AnonymousClass3YP.SHARING) {
            C64374Laq.A04(lb7.A08, true);
            e6i.A03();
            if (!182.A06(0Tu.A05, userSession, 36326618641872775L)) {
                if (!C63427Kwn.A00(r5.requireActivity(), context, r5, AnonymousClass818.IG_SELF_FEED_LIKES_SHEET_POST_ACCOUNT_LINK, userSession, new C65646LxN(context, r5, userSession, r7, lb7, e6i, str))) {
                    z = false;
                } else {
                    return;
                }
            }
            C64374Laq.A01(context, r5, userSession, r7, lb7, e6i, str, z);
        }
    }
}
