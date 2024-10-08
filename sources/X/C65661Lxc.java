package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lxc  reason: case insensitive filesystem */
public final class C65661Lxc implements C66462MSq {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass4DH A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ 1Xj A03;
    public final /* synthetic */ C363548ju A04;
    public final /* synthetic */ LB7 A05;
    public final /* synthetic */ C47522E6i A06;
    public final /* synthetic */ String A07;

    public C65661Lxc(Context context, AnonymousClass4DH r2, UserSession userSession, 1Xj r4, C363548ju r5, LB7 lb7, C47522E6i e6i, String str) {
        this.A05 = lb7;
        this.A06 = e6i;
        this.A03 = r4;
        this.A00 = context;
        this.A07 = str;
        this.A02 = userSession;
        this.A01 = r2;
        this.A04 = r5;
    }

    public final void E1P(Integer num) {
        int A032 = C51967G9n.A03(num, 0);
        if (A032 == 0) {
            LB7 lb7 = this.A05;
            C64374Laq.A04(lb7.A08, true);
            C47522E6i e6i = this.A06;
            e6i.A03();
            1Xj r4 = this.A03;
            Context context = this.A00;
            String str = this.A07;
            UserSession userSession = this.A02;
            C64374Laq.A00(context, this.A01, userSession, r4, lb7, e6i, str, true);
            this.A04.A01(userSession, "likes_sheet", true);
        } else if (A032 == 1) {
            LB7 lb72 = this.A05;
            C64374Laq.A04(lb72.A08, true);
            C47522E6i e6i2 = this.A06;
            e6i2.A03();
            1Xj r3 = this.A03;
            Context context2 = this.A00;
            String str2 = this.A07;
            C64374Laq.A00(context2, this.A01, this.A02, r3, lb72, e6i2, str2, false);
        }
    }
}
