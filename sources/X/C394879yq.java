package X;

import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.9yq  reason: invalid class name and case insensitive filesystem */
public abstract class C394879yq {
    public static final C2802350v A00(Drawable drawable) {
        String str;
        C389669q0 r1;
        AnonymousClass91c r0;
        AnonymousClass6MU r6 = null;
        if (drawable instanceof C306386Ly) {
            C306386Ly r11 = (C306386Ly) drawable;
            boolean z = r11 instanceof AnonymousClass91c;
            boolean z2 = r11 instanceof AnonymousClass9UM;
            C360728f3 r12 = null;
            if (z && (r0 = (AnonymousClass91c) r11) != null) {
                r12 = r0.A0X();
            }
            return C394809yj.A00(r12, r11, z, z2);
        } else if (drawable instanceof C268714ds) {
            return ((C268714ds) drawable).BzV();
        } else {
            if (drawable instanceof C347017w8) {
                C347017w8 r2 = (C347017w8) drawable;
                if (r2.A04() instanceof C389669q0) {
                    Drawable A04 = r2.A04();
                    if ((A04 instanceof C389669q0) && (r1 = (C389669q0) A04) != null) {
                        r6 = r1.A04;
                    }
                } else {
                    Object obj = r2.A03;
                    if (obj instanceof AnonymousClass6MU) {
                        AnonymousClass6MU r62 = (AnonymousClass6MU) obj;
                        if (r62 != null) {
                            r62.A00 = r2.A00;
                        }
                        Iterator it = r2.A06(C369768vI.class).iterator();
                        while (it.hasNext()) {
                            C369768vI r9 = (C369768vI) it.next();
                            C317966o8 r8 = r9.A0L;
                            if (r8.A03() == null || r8.A03().isEmpty()) {
                                ArrayList A1C = AnonymousClass7TE.A1C();
                                Iterator A0v = AnonymousClass7TF.A0v(r9.A0P);
                                while (A0v.hasNext()) {
                                    Object next = A0v.next();
                                    UserSession userSession = r9.A0J;
                                    File A00 = AnonymousClass45F.A00();
                                    try {
                                        str = A00.getCanonicalPath();
                                    } catch (IOException unused) {
                                        str = A00.getAbsolutePath();
                                    }
                                    A1C.add(new AnonymousClass34S(str, OX4.A00(0nY.A00(), new C41357Ase(2, next, userSession, A00), 637)).A00);
                                }
                                r8.A05(A1C);
                            }
                        }
                        r6 = r62;
                    }
                }
                return r6;
            }
            if (drawable instanceof C321016tR) {
                r6 = ((C321016tR) drawable).A0c;
            } else if (!(drawable instanceof U1R)) {
                return null;
            } else {
                r6 = ((U1R) drawable).A01;
            }
            return r6;
        }
    }
}
