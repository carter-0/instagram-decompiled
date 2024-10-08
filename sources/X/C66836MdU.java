package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.MdU  reason: case insensitive filesystem */
public final class C66836MdU implements C327387Ao {
    public final int A00;
    public final Object A01;

    public C66836MdU(C327367Am r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public final AnonymousClass7FW AXU(Context context, UserSession userSession, AnonymousClass9HC r17, AnonymousClass7LQ r18, AnonymousClass7L2 r19) {
        Context context2 = context;
        UserSession userSession2 = userSession;
        AnonymousClass9HC r4 = r17;
        AnonymousClass7LQ r5 = r18;
        AnonymousClass7L2 r6 = r19;
        switch (this.A00) {
            case 0:
                return AnonymousClass79S.A03(context2, userSession2, ((C327367Am) this.A01).A0C, r4, r5, r6);
            case 1:
                return C327367Am.A05(context, userSession2, r4, r5, r6, AnonymousClass7TE.A0v(), Boolean.valueOf(r5.A0V));
            case 3:
                return AnonymousClass79S.A02(context2, userSession2, ((C327367Am) this.A01).A0C, r4, r5, r6);
            default:
                return AnonymousClass79S.A05(context2, userSession2, ((C327367Am) this.A01).A0C, r4, r5, r6, r5.A0V);
        }
    }
}
