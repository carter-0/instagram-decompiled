package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.MediaSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LSy  reason: case insensitive filesystem */
public final class C64191LSy {
    public static final C64191LSy A00 = new Object();

    public static final SpannableStringBuilder A01(AnonymousClass4DH r4, UserSession userSession, String str, String str2, String str3) {
        0qQ.A0B(str, 2);
        String A0m = DbU.A0m(r4, 2131964896);
        SpannableStringBuilder A0B = DbZ.A0B(str2, A0m);
        0qQ.A07(A0B);
        AnonymousClass7AV.A03(A0B, new C62144Kax(r4, userSession, str3, str, DbZ.A01(r4)), A0m);
        return A0B;
    }

    public static final MediaComposition A03(Context context, UserSession userSession, AnonymousClass3Q2 r11, boolean z) {
        boolean z2 = true;
        if (!r11.A61) {
            z2 = false;
        }
        if (!z2 && !z) {
            return r11.A0r;
        }
        AnonymousClass51W r6 = r11.A1P;
        if (r6 == null) {
            return null;
        }
        C266824aP A002 = AHJ.A00(context, userSession, r6, 2Nm.A00(context, userSession), true, true, 182.A06(0Tu.A05, userSession, 36327559239252483L));
        if (z) {
            A002.A03(C266714aE.VIDEO, new C64445Lc0(r11, false));
        }
        return new MediaComposition(A002);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r2 != null) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C59793JYm A02(X.AnonymousClass3Q2 r3) {
        /*
            if (r3 == 0) goto L_0x0023
            java.util.List r0 = r3.A4J
            if (r0 == 0) goto L_0x0023
            java.util.Iterator r3 = r0.iterator()
        L_0x000a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0026
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.4aA r0 = (X.C266684aA) r0
            java.lang.String r1 = r0.A0H
            java.lang.String r0 = "camera"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x000a
            if (r2 == 0) goto L_0x0026
        L_0x0023:
            X.JYm r0 = X.C59793JYm.CAPTURE
            return r0
        L_0x0026:
            X.JYm r0 = X.C59793JYm.GALLERY
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64191LSy.A02(X.3Q2):X.JYm");
    }

    public static final int A00(C3499682q r3, boolean z) {
        int i = 0;
        if (!r3.COf()) {
            return 1;
        }
        List Co4 = r3.Co4();
        if ((Co4 instanceof Collection) && Co4.isEmpty()) {
            return 0;
        }
        Iterator it = Co4.iterator();
        while (it.hasNext()) {
            MediaSession A0Z = JTO.A0Z(it);
            if ((!z || A0Z.Bsu() == AnonymousClass05K.A00) && (i = i + 1) < 0) {
                0sr.A1S();
                throw AnonymousClass00P.createAndThrow();
            }
        }
        return i;
    }
}
