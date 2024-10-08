package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.model.mediasize.ImageInfo;
import java.util.List;

/* renamed from: X.771  reason: invalid class name */
public final class AnonymousClass771 implements C3264476u {
    public static final AnonymousClass771 A00 = new Object();

    public static final AnonymousClass74T A00(Context context, UserSession userSession, AnonymousClass7LQ r11, AnonymousClass55L r12, long j, boolean z) {
        boolean A002 = r12.A00(Boolean.valueOf(z));
        boolean z2 = r11.A0G.A0r;
        C66857Mdq mdq = new C66857Mdq(context, true, 182.A06(0Tu.A05, userSession, 36317216957797228L), true);
        boolean z3 = r12.A07;
        Integer num = r12.A02;
        0qQ.A07(num);
        String str = r12.A03;
        0qQ.A07(str);
        return new AnonymousClass74T((ImageUrl) null, (ImageUrl) null, (C254893tE) null, mdq.A02(num, str, z3, A002, false, z2), (CharSequence) null, mdq.A01(j, false, A002), (CharSequence) null, (CharSequence) null, (CharSequence) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, 3);
    }

    public final C328667Fr AM8(Context context, UserSession userSession, AnonymousClass7FE r14, AnonymousClass9HC r15, AnonymousClass7LQ r16) {
        Context context2 = context;
        0qQ.A0B(context, 0);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r14, 2);
        0qQ.A0B(r15, 3);
        AnonymousClass7LQ r6 = r16;
        0qQ.A0B(r6, 4);
        C254703su r3 = r6.A0e;
        0qQ.A07(r3);
        AnonymousClass55L r7 = r3.A0c;
        if (r7 != null) {
            boolean A1j = r3.A1j(0eE.A00(userSession).A00());
            DirectMessageIdentifier A0V = r3.A0V();
            return A01(AnonymousClass7FG.A00(context, userSession, r15, r6, r3.A10), r14, A00(context2, userSession2, r6, r7, r3.C7c(), A1j), A0V);
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final C328667Fr A01(AnonymousClass7FT r49, AnonymousClass7FE r50, AnonymousClass74T r51, DirectMessageIdentifier directMessageIdentifier) {
        return new C328667Fr((C376649Iu) null, (C376649Iu) null, (AnonymousClass9J0) null, new AnonymousClass9J6("", "", 5), (AnonymousClass9J6) null, (AnonymousClass9J6) null, (C61062Jw0) null, (C3259574v) null, r49, r50, r51, (AnonymousClass774) null, (AnonymousClass777) null, (AnonymousClass778) null, (AnonymousClass77A) null, (AnonymousClass5FY) null, C254883tD.SINGLE, (AnonymousClass779) null, directMessageIdentifier, (C254793t3) null, (GifUrlImpl) null, (ImageInfo) null, (CharSequence) null, (Long) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, 0, 0, 0, false, false, false, false, false, false, false, false, false, false);
    }
}
