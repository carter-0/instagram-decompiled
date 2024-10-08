package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;

public final /* synthetic */ class P5D implements AnonymousClass7B5 {
    public final /* synthetic */ C327367Am A00;

    public /* synthetic */ P5D(C327367Am r1) {
        this.A00 = r1;
    }

    public final AnonymousClass7FW AXV(Context context, UserSession userSession, AnonymousClass9HC r18, AnonymousClass7LQ r19, AnonymousClass7L2 r20, 17i r21) {
        C254873tC r7;
        AnonymousClass7LQ r6 = r19;
        C254703su r1 = r6.A0e;
        C254933tI A0P = r1.A0P();
        Context context2 = context;
        UserSession userSession2 = userSession;
        AnonymousClass9HC r5 = r18;
        AnonymousClass7L2 r12 = r20;
        if (A0P == null) {
            UserSession userSession3 = userSession2;
            AnonymousClass9HC r10 = r5;
            AnonymousClass7LQ r11 = r6;
            AnonymousClass7FE A03 = AnonymousClass7FD.A03(userSession3, r10, r11, r12, r1.A10, AnonymousClass0eN.A01(new C73472PdF(r12)));
            new C3264276s();
            0qQ.A0B(context2, 0);
            C51972G9s.A1C(userSession2, r5);
            ImmutableList A0H = r1.A0H();
            if (A0H == null || (r7 = (C254873tC) 00k.A0O(A0H, 0)) == null) {
                return null;
            }
            return AnonymousClass773.A02(context2, userSession2, A03, r5, r6, r7, false);
        }
        return new C3264276s().A02(context2, userSession2, AnonymousClass7FD.A01(userSession2, r5, r6, r12, A0P, 2FW.A0q), r5, r6, A0P);
    }
}
