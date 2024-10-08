package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.Phq  reason: case insensitive filesystem */
public final class C73677Phq extends 0Yg implements C62320sa {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ N4G A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ 2Dm A04;
    public final /* synthetic */ DirectThreadKey A05;
    public final /* synthetic */ C62320sa A06;
    public final /* synthetic */ boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73677Phq(Context context, N4G n4g, UserSession userSession, 2Dm r5, DirectThreadKey directThreadKey, C62320sa r7, int i, boolean z) {
        super(0);
        this.A03 = userSession;
        this.A05 = directThreadKey;
        this.A00 = i;
        this.A04 = r5;
        this.A01 = context;
        this.A02 = n4g;
        this.A07 = z;
        this.A06 = r7;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        UserSession userSession = this.A03;
        DirectThreadKey directThreadKey = this.A05;
        String str = directThreadKey.A00;
        if (str != null) {
            int i = this.A00;
            C66671Mae.A0I(userSession, str, i, true);
            2Dm r1 = this.A04;
            AnonymousClass3U9 B33 = r1.B33(directThreadKey);
            if (B33 != null) {
                r1.Efk(B33, false);
                r1.FLo(directThreadKey);
                C71118OdC.A01(this.A01, this.A02, userSession, directThreadKey, this.A06, i, false, this.A07);
                return C60340gF.A00;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
