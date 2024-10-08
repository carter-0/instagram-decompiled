package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.58A  reason: invalid class name */
public final class AnonymousClass58A implements AnonymousClass582 {
    public final int A00;
    public final int A01;
    public final UserSession A02;
    public final AnonymousClass58C A03;
    public final AnonymousClass588 A04;
    public final Map A05 = new LinkedHashMap();
    public final Set A06;
    public final AnonymousClass0eM A07 = AnonymousClass0eN.A01(new C377209Ky(this, 32));

    /* JADX WARNING: type inference failed for: r0v6, types: [X.58C, java.lang.Object] */
    public AnonymousClass58A(UserSession userSession, AnonymousClass589 r7, AnonymousClass588 r8, int i, int i2) {
        this.A06 = 0sc.A07(new 0eP[]{new 0eP(r7, AnonymousClass58B.USER_SEE_TAIL_LOAD_SPINNER), new 0eP(r7, AnonymousClass58B.USER_SEE_MEDIA), new 0eP(r7, AnonymousClass58B.TAIL_LOAD_RESPONSE_RECEIVED), new 0eP(r7, AnonymousClass58B.USER_DID_NAVIGATE)});
        this.A02 = userSession;
        this.A04 = r8;
        this.A01 = i;
        this.A00 = i2;
        int A022 = r8.A02();
        ? obj = new Object();
        obj.A00 = A022;
        this.A03 = obj;
    }

    public final int BNY(boolean z) {
        if (z) {
            return this.A03.A00;
        }
        return ((Number) this.A07.getValue()).intValue();
    }
}
