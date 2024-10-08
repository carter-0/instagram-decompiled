package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.ECe  reason: case insensitive filesystem */
public final class C47670ECe extends 1P0 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ 1P0 A01;
    public final /* synthetic */ 1Ng A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ User A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public C47670ECe(Context context, 1P0 r2, 1Ng r3, UserSession userSession, User user, boolean z, boolean z2, boolean z3) {
        this.A06 = z;
        this.A04 = user;
        this.A07 = z2;
        this.A03 = userSession;
        this.A02 = r3;
        this.A05 = z3;
        this.A01 = r2;
        this.A00 = context;
    }

    public final void onFail(C268654dm r4) {
        int A032 = AnonymousClass0fD.A03(1220296083);
        this.A01.onFail(r4);
        Object A002 = r4.A00();
        if (A002 != null) {
            C59689JTv.A09(this.A00, ((DwR) A002).A02);
        }
        AnonymousClass0fD.A0A(1090669395, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(695706840);
        int A033 = AnonymousClass0fD.A03(-1522834943);
        this.A01.onSuccess(obj);
        AnonymousClass0fD.A0A(-1824488556, A033);
        AnonymousClass0fD.A0A(153591867, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A032 = AnonymousClass0fD.A03(1229140944);
        int A033 = AnonymousClass0fD.A03(5302338);
        boolean z = this.A06;
        if (z) {
            this.A04.A17(true);
        }
        boolean z2 = this.A07;
        if (z2) {
            User user = this.A04;
            user.A18(true);
            1OP.A05(this.A03).A0b(user, true);
        }
        this.A02.A00(new C2370736f(this.A04, z, z2, false, this.A05));
        AnonymousClass0fD.A0A(-2110622232, A033);
        AnonymousClass0fD.A0A(30042813, A032);
    }
}
