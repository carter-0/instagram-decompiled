package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.9mZ  reason: invalid class name and case insensitive filesystem */
public final class C387659mZ extends C353308Hc implements AnonymousClass8DG {
    public final C360778f8 A00;
    public final C387629mW A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C387659mZ(Context context, UserSession userSession, AnonymousClass8AL r4, C360778f8 r5) {
        super(r4);
        AnonymousClass7TF.A1D(context, 1, userSession);
        this.A00 = r5;
        C387629mW r0 = new C387629mW(context, userSession, this, this);
        this.A01 = r0;
        this.A00 = r0;
    }

    public final /* bridge */ /* synthetic */ void DBj(AnonymousClass518 r3, String str, int i, boolean z) {
        0qQ.A0B(r3, 0);
        C360778f8.A04(this.A00, i, false);
    }

    public final void A02(List list) {
        super.A02(list);
        C387629mW r1 = this.A01;
        int i = r1.A00;
        if (r1.A06(i) && r1.A01(i) != null) {
            C360778f8.A04(this.A00, i, true);
        }
    }

    public final /* bridge */ /* synthetic */ void DMF(AnonymousClass518 r2, int i) {
        throw AnonymousClass00P.createAndThrow();
    }
}
