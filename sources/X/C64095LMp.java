package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.LMp  reason: case insensitive filesystem */
public final class C64095LMp {
    public final Context A00;
    public final UserSession A01;
    public final C282555Dn A02;
    public final AnonymousClass2xS A03;
    public final boolean A04;

    public static final void A00(L8D l8d, C64095LMp lMp, 1Xj r7, AnonymousClass3W1 r8) {
        Object obj;
        View view = l8d.A02.A0F;
        if (view != null) {
            obj = view.getTag();
        } else {
            obj = null;
        }
        if (obj instanceof AnonymousClass3V3) {
            1Xj r2 = r7;
            lMp.A03.A09(r2, (AnonymousClass3V3) obj, r8, new C263414Lx(false, false, false, false), r8.A31);
        }
    }

    public C64095LMp(Context context, UserSession userSession, C282555Dn r3, AnonymousClass2xS r4, boolean z) {
        C51972G9s.A1D(r3, userSession);
        this.A00 = context;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = userSession;
        this.A04 = z;
    }
}
