package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.8Qs  reason: invalid class name and case insensitive filesystem */
public final class C355628Qs implements AnonymousClass1MK {
    public final int A00;
    public final int A01;
    public final Context A02;
    public final UserSession A03;
    public final Map A04 = new HashMap();
    public final Set A05;
    public final ConcurrentMap A06;

    public final void DK4(C226952iF r1, int i) {
    }

    public final void CyF(C226952iF r2, AnonymousClass3LX r3) {
        11Z.A02(new C41187Apl(r2, r3, this));
    }

    public final void DJx(C226952iF r2, C254673sr r3) {
        11Z.A02(new C41095AoH(r2, this));
    }

    public C355628Qs(Context context, UserSession userSession, int i, int i2) {
        17j r1 = new 17j();
        r1.A03(20);
        r1.A01();
        this.A06 = r1.A00();
        this.A05 = new HashSet();
        this.A03 = userSession;
        this.A02 = context;
        this.A01 = i;
        this.A00 = i2;
    }
}
