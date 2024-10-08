package X;

import android.content.Context;
import android.net.Uri;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.VideoSession;
import com.instagram.pendingmedia.model.ClipInfo;
import java.lang.ref.WeakReference;

public abstract class JZ1 {
    public static final void A02(UserSession userSession, C3499682q r12, AnonymousClass3Q2 r13, C59796JYp jYp, float f, long j) {
        DbW.A1N(jYp, 0, userSession);
        long j2 = jYp.A03;
        String str = jYp.A07;
        0qQ.A07(str);
        A04(r12, Q0X.A03(userSession, str, jYp.A03, j), r13, f, j2);
    }

    public static void A03(UserSession userSession, AnonymousClass3Q2 r7, C59796JYp jYp, float f) {
        long j = jYp.A03;
        0qQ.A0B(r7, 1);
        String str = jYp.A07;
        0qQ.A07(str);
        A06(Q0X.A03(userSession, str, jYp.A03, j), r7, f);
    }

    public static final void A04(C3499682q r3, ClipInfo clipInfo, AnonymousClass3Q2 r5, float f, long j) {
        0qQ.A0B(clipInfo, 0);
        A06(clipInfo, r5, f);
        boolean A1R = AnonymousClass7TF.A1R((j > ((long) JTO.A09(clipInfo)) ? 1 : (j == ((long) JTO.A09(clipInfo)) ? 0 : -1)));
        CreationSession creationSession = ((JWE) r3).A01;
        VideoSession A04 = creationSession.A04();
        A04.getClass();
        A04.A0K = A1R;
        VideoSession A042 = creationSession.A04();
        A042.getClass();
        A042.A0I = true;
        r3.EOx(f);
    }

    public static final void A05(C3499682q r3, AnonymousClass3Q2 r4, String str, String str2, int i) {
        r4.A3O = str;
        if (str2 != null) {
            ((JWE) r3).A01.A07(str2, (String) null, true);
            r3.EfU(r4.A35);
            r4.A3w = AnonymousClass457.A0C((String) null, -1, true);
            r4.A0K = i;
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final AnonymousClass3Q2 A00(String str, int i) {
        if (str == null) {
            str = JTQ.A0Z();
        }
        AnonymousClass3Q2 A02 = AnonymousClass9T3.A02(str);
        A02.A3w = AnonymousClass457.A0C((String) null, -1, true);
        A02.A0K = i;
        return A02;
    }

    public static final void A01(Context context, Uri uri, WeakReference weakReference) {
        0nY.A00().ATE(new C61708KIy(context.getApplicationContext(), uri, weakReference));
    }

    public static final void A06(ClipInfo clipInfo, AnonymousClass3Q2 r1, float f) {
        Q0X.A04(clipInfo, r1);
        clipInfo.A00 = f;
        r1.A02 = f;
        String str = clipInfo.A0F;
        if (str != null) {
            r1.A44 = Q0Y.A02(str);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
