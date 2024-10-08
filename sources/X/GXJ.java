package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Iterator;

public final class GXJ extends C252233om {
    public boolean A00;
    public final H33 A01;
    public final UserSession A02;
    public final C14074TpO A03;
    public final X9Q A04;
    public final C52280GLw A05;
    public final GX4 A06;

    /* JADX WARNING: type inference failed for: r4v0, types: [X.4hF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.6sL, X.H33] */
    public GXJ(Context context, AnonymousClass07i r9, AnonymousClass0iw r10, UserSession userSession, C14074TpO tpO, GX4 gx4, X9Q x9q) {
        C51972G9s.A1C(userSession, gx4);
        this.A02 = userSession;
        this.A06 = gx4;
        this.A03 = tpO;
        this.A04 = x9q;
        C52280GLw gLw = new C52280GLw(0, r10, this);
        this.A05 = gLw;
        ? obj = new Object();
        Context context2 = context;
        AnonymousClass07i r3 = r9;
        ? r1 = new C320416sL(context2, r3, obj, r10, userSession);
        this.A01 = r1;
        r1.A03(gLw);
    }

    public final void onPause() {
        this.A00 = false;
    }

    public final void onResume() {
        this.A00 = true;
    }

    public static final C296925qs A00(GXJ gxj) {
        Iterator A032 = gxj.A06.A03();
        0qQ.A07(A032);
        while (A032.hasNext()) {
            C232262tL r2 = (C232262tL) A032.next();
            if (r2 instanceof C296925qs) {
                C296925qs r22 = (C296925qs) r2;
                if (r22.A01.A01() == C292535j7.MAJOR) {
                    return r22;
                }
            }
        }
        return null;
    }
}
