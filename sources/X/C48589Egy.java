package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.Egy  reason: case insensitive filesystem */
public abstract class C48589Egy {
    public static final Object A00(C307896Rx r8, AnonymousClass6Tm r9) {
        Object A0f = DbW.A0f(r9);
        C277014uI A0N = DbW.A0N(r9);
        C307786Rm r3 = (C307786Rm) Dba.A0V(r9, 3);
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("highlight:%s", A0f);
        UserSession A0A = C308206Td.A0A(r3);
        DbS.A1Z(A0A);
        UserSession userSession = A0A;
        Fragment A0H = DbU.A0H(r8);
        FragmentActivity A04 = C308206Td.A04(r8);
        C308206Td.A04(r8);
        Reel A0L = Dba.A0L(userSession, formatStrLocaleSafe);
        if (A0L == null) {
            return null;
        }
        C308206Td.A0K(r8, new T73(3, A0N, A0L, r8));
        AnonymousClass328 r82 = new AnonymousClass328(A0H, 1005);
        Context context = r82.getContext();
        if (context != null) {
            RectF rectF = new RectF((float) (0nA.A09(context) / 2), (float) (0nA.A08(context) / 2), (float) (0nA.A09(context) / 2), (float) (0nA.A08(context) / 2));
            AnonymousClass32A r32 = new AnonymousClass32A(C308206Td.A07(r3), userSession, r82);
            C16165Upq upq = new C16165Upq((Activity) A04, rectF, (C230222pE) null, AnonymousClass05K.A01);
            r32.A0C = AnonymousClass7TF.A0b();
            r32.A05 = upq;
            r32.A03(A0L, AnonymousClass3BQ.BLOKS, (AnonymousClass3N3) null);
            return null;
        }
        throw AnonymousClass7TE.A0y();
    }
}
