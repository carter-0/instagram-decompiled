package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.JhY  reason: case insensitive filesystem */
public final class C60215JhY extends 2YL {
    public final int A00;
    public final long A01;
    public final UserSession A02;
    public final ImageUrl A03;
    public final C18059Vki A04;
    public final WYY A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final C249513ju A09;
    public final AnonymousClass0r6 A0A;

    public C60215JhY(C319836rJ r10, AnonymousClass0iw r11, UserSession userSession) {
        AnonymousClass0iw r4 = r11;
        UserSession userSession2 = userSession;
        AnonymousClass7TG.A1O(userSession, r11);
        this.A02 = userSession;
        this.A04 = new C18059Vki(userSession);
        Object A002 = r10.A00("args_entry_point");
        if (A002 != null) {
            String str = (String) A002;
            this.A08 = str;
            Object A003 = r10.A00(AnonymousClass000.A00(2636));
            if (A003 != null) {
                String str2 = (String) A003;
                this.A06 = str2;
                long A042 = DbY.A04((Number) r10.A00(AnonymousClass000.A00(2634)));
                this.A01 = A042;
                Object A004 = r10.A00(AnonymousClass000.A00(2638));
                if (A004 != null) {
                    this.A07 = (String) A004;
                    Object A005 = r10.A00(AnonymousClass000.A00(2637));
                    if (A005 != null) {
                        this.A03 = (ImageUrl) A005;
                        Object A006 = r10.A00(AnonymousClass000.A00(2635));
                        if (A006 != null) {
                            this.A00 = AnonymousClass7TE.A0M(A006);
                            this.A05 = new WYY(r4, userSession2, Long.valueOf(A042), str2, str);
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = 1HR.A05;
                            AnonymousClass3FN r0 = C249513ju.A00;
                            1HR A1G = JTO.A1G(AnonymousClass3FN.A00);
                            this.A09 = A1G;
                            this.A0A = 0u9.A04(A1G);
                            return;
                        }
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
