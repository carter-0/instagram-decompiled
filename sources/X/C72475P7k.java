package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.P7k  reason: case insensitive filesystem */
public final class C72475P7k implements C328347El {
    /* renamed from: A00 */
    public final N6Z AWb(Context context, UserSession userSession, AnonymousClass9HC r21, AnonymousClass7LQ r22, AnonymousClass7L2 r23, 17i r24, boolean z) {
        Context context2 = context;
        UserSession userSession2 = userSession;
        17i r4 = r24;
        C51973G9u.A1E(context2, userSession2, r4);
        AnonymousClass9HC r10 = r21;
        AnonymousClass7LQ r11 = r22;
        AnonymousClass7L2 r15 = r23;
        C51973G9u.A0r(3, r15, r11, r10);
        0t0 A01 = AnonymousClass0eN.A01(C73775Pja.A00);
        C254703su r1 = r11.A0e;
        2FW r0 = r1.A10;
        0qQ.A07(r0);
        AnonymousClass7FE A03 = AnonymousClass7FD.A03(userSession2, r10, r11, r15, r0, A01);
        C3264276s r6 = new C3264276s((AnonymousClass773) null, (Map) null, (DefaultConstructorMarker) null, 3);
        ImmutableList A0H = r1.A0H();
        if (A0H != null) {
            boolean z2 = true;
            if (!A0H.isEmpty()) {
                int i = ((C254873tC) A0H.get(0)).A02;
                if (i != 8) {
                    if (i != 10) {
                        if (i != 13) {
                            throw DbW.A0b("unsupported xma layout type ", ((C254873tC) A0H.get(0)).A02);
                        }
                    }
                    C328687Ft A032 = r6.A03(context2, userSession2, A03, r10, r11, z2);
                    String A0s = C66582MXn.A0s(userSession2, r1, z);
                    0qQ.A0A(A0s);
                    C68879NaG naG = new C68879NaG(AnonymousClass7FX.A03(context2, userSession2, r10, r11, r15, r4), A032, A0s);
                    String str = naG.A02;
                    return new N6Z(naG.A00, naG.A01, str);
                }
                z2 = false;
                C328687Ft A0322 = r6.A03(context2, userSession2, A03, r10, r11, z2);
                String A0s2 = C66582MXn.A0s(userSession2, r1, z);
                0qQ.A0A(A0s2);
                C68879NaG naG2 = new C68879NaG(AnonymousClass7FX.A03(context2, userSession2, r10, r11, r15, r4), A0322, A0s2);
                String str2 = naG2.A02;
                return new N6Z(naG2.A00, naG2.A01, str2);
            }
            throw DbT.A0m();
        }
        throw AnonymousClass7TE.A0y();
    }
}
