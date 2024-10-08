package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.LxN  reason: case insensitive filesystem */
public final class C65646LxN implements C66461MSp {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass4DH A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ 1Xj A03;
    public final /* synthetic */ LB7 A04;
    public final /* synthetic */ C47522E6i A05;
    public final /* synthetic */ String A06;

    public C65646LxN(Context context, AnonymousClass4DH r2, UserSession userSession, 1Xj r4, LB7 lb7, C47522E6i e6i, String str) {
        this.A03 = r4;
        this.A00 = context;
        this.A04 = lb7;
        this.A05 = e6i;
        this.A06 = str;
        this.A02 = userSession;
        this.A01 = r2;
    }

    public final void afterSelection(boolean z) {
        1Xj r3 = this.A03;
        Context context = this.A00;
        LB7 lb7 = this.A04;
        C47522E6i e6i = this.A05;
        String str = this.A06;
        C64374Laq.A01(context, this.A01, this.A02, r3, lb7, e6i, str, false);
    }
}
