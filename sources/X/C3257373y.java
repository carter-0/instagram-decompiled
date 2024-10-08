package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.73y  reason: invalid class name and case insensitive filesystem */
public final class C3257373y implements C328347El {
    @Deprecated
    public final AnonymousClass0eM A00;

    /* renamed from: A00 */
    public final AnonymousClass741 AWb(Context context, UserSession userSession, AnonymousClass9HC r23, AnonymousClass7LQ r24, AnonymousClass7L2 r25, 17i r26, boolean z) {
        String A0i;
        AnonymousClass0eM r11 = this.A00;
        AnonymousClass7LQ r6 = r24;
        C254703su r1 = r6.A0e;
        UserSession userSession2 = userSession;
        AnonymousClass9HC r5 = r23;
        AnonymousClass7L2 r7 = r25;
        Context context2 = context;
        C328667Fr A01 = new C3264276s().A01(context2, userSession2, AnonymousClass7FD.A02(userSession2, r5, r6, r7, r1.A10, (Boolean) null, (Boolean) null, r11, false), r5, r6);
        if (!AnonymousClass760.A00(userSession2, z)) {
            A0i = r1.A0h();
        } else {
            A0i = r1.A0i();
        }
        return new AnonymousClass741(AnonymousClass7FX.A05(context2, userSession2, r5, r6, r7, r26, false), A01, A0i);
    }

    public C3257373y(AnonymousClass0eM r1) {
        this.A00 = r1;
    }
}
