package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.OTy  reason: case insensitive filesystem */
public final class C70977OTy {
    public C70524O9x A00;
    public Integer A01 = AnonymousClass05K.A00;
    public final Context A02;
    public final AnonymousClass0eM A03 = C73894PlV.A00(this, 22);
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07 = C73894PlV.A00(this, 25);
    public final AnonymousClass0eM A08 = C73894PlV.A00(this, 26);
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B = C73894PlV.A00(this, 28);
    public final AnonymousClass0eM A0C = C73894PlV.A00(this, 29);
    public final AnonymousClass0eM A0D = C73894PlV.A00(this, 30);

    public static final C70795OLq A00(C70977OTy oTy) {
        AnonymousClass0eM r1 = oTy.A05;
        if (r1.CVQ()) {
            return (C70795OLq) r1.getValue();
        }
        return null;
    }

    public C70977OTy(Context context, View view, AnonymousClass0iw r5, UserSession userSession, 2el r7) {
        this.A02 = context;
        this.A04 = C73894PlV.A00(view, 23);
        this.A05 = AnonymousClass1YB.A00(new C20704Wxb(10, this, r7, userSession));
        this.A06 = C73894PlV.A00(this, 24);
        this.A09 = AnonymousClass1YB.A00(new C58691Iw0(8, r5, this));
        this.A0A = C73894PlV.A00(this, 27);
    }
}
