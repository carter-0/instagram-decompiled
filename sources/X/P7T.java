package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.stickerstore.DirectStoreSticker;

public final class P7T implements C328347El {
    public final /* bridge */ /* synthetic */ C232262tL AWb(Context context, UserSession userSession, AnonymousClass9HC r15, C331837So r16, AnonymousClass7L2 r17, 17i r18, boolean z) {
        AnonymousClass7LQ r9 = (AnonymousClass7LQ) r16;
        Context context2 = context;
        0qQ.A0B(context, 0);
        UserSession userSession2 = userSession;
        AnonymousClass7L2 r10 = r17;
        17i r11 = r18;
        C51974G9v.A1P(userSession, r11, r10, r9);
        AnonymousClass9HC r8 = r15;
        0qQ.A0B(r15, 5);
        C254703su r1 = r9.A0e;
        0qQ.A07(r1);
        Object obj = r1.A1T;
        if (!(obj instanceof DirectStoreSticker)) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("message.content required to be DirectStoreSticker but is ");
            throw C66582MXn.A0j(JTR.A0v(obj), A1A);
        }
        String A0s = C66582MXn.A0s(userSession, r1, z);
        0qQ.A0A(A0s);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        Object obj2 = r1.A1T;
        0qQ.A0C(obj2, "null cannot be cast to non-null type com.instagram.model.direct.stickerstore.DirectStoreSticker");
        DirectStoreSticker directStoreSticker = (DirectStoreSticker) obj2;
        0qQ.A0B(directStoreSticker, 3);
        return new N6O(AnonymousClass7FX.A03(context2, userSession2, r8, r9, r10, r11), new NYT(C66580MXl.A0Y(context, userSession, r15, r9, r1), directStoreSticker.A00, directStoreSticker.A02, false), A0s);
    }
}
