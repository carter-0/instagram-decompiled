package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.Htf  reason: case insensitive filesystem */
public final class C56153Htf {
    public final C55728HmP A00;

    public final SpannableStringBuilder A01(Context context, C53281GlT glT, int i, int i2) {
        String A10;
        User A29;
        0qQ.A0B(glT, 1);
        C55728HmP hmP = this.A00;
        1Xj r7 = glT.A01;
        AnonymousClass3W1 r10 = glT.A02;
        User user = glT.A03;
        DbZ.A0t(1, r7, r10, user);
        boolean A2Q = user.A2Q();
        UserSession userSession = hmP.A00;
        if (A2Q) {
            A10 = C231122qu.A0J(C231122qu.A0G(userSession, r7));
        } else {
            A10 = DbT.A10(AnonymousClass3Z7.A00(userSession, r7));
        }
        1Xj A1c = r7.A1c(i2);
        String str = null;
        if (A1c == null || (A29 = A1c.A0C.AzZ()) == null || !C231122qu.A0Q(userSession, r7)) {
            A29 = r7.A29();
        }
        if (A29 != null) {
            if (A29.A2Q()) {
                String fullName = A29.getFullName();
                if (fullName != null) {
                    str = C231122qu.A0J(fullName);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            } else {
                str = A29.getUsername();
            }
        }
        int i3 = 2131953743;
        if (C231122qu.A0a(r7)) {
            i3 = 2131953753;
        }
        String A0p = C51967G9n.A0p(context, i3);
        C58787IxY ixY = new C58787IxY(r7, A29, hmP, r10, i, 6);
        boolean A1S = DbW.A1S(1, A0p, A10);
        if (str == null || str.length() == 0) {
            SpannableStringBuilder A0C = DbS.A0C(A10);
            C51971G9r.A0y(A0C, new CharacterStyle(), A1S ? 1 : 0);
            return A0C;
        }
        SpannableStringBuilder A02 = 1sx.A02(A10, str, A0p);
        AnonymousClass7AV.A03(A02, new C46679Dj8(ixY, 7), str);
        return A02;
    }

    public final View.OnTouchListener A02(AnonymousClass4DU r5, C53281GlT glT) {
        String str;
        0qQ.A0B(glT, 0);
        C55728HmP hmP = this.A00;
        1Xj r3 = glT.A01;
        User user = glT.A03;
        AnonymousClass7TF.A1H(r3, user);
        C242813Wa r2 = hmP.A01;
        String id = user.getId();
        if (r5 == null || (str = r5.getModuleName()) == null) {
            str = "";
        }
        return r2.Dsk(r3, id, str);
    }

    public C56153Htf(C55728HmP hmP) {
        this.A00 = hmP;
    }

    public final Drawable A00(Context context, C53281GlT glT, String str, int i) {
        User user;
        String str2;
        AnonymousClass7TG.A1P(glT, str);
        C55728HmP hmP = this.A00;
        1Xj r1 = glT.A01;
        0qQ.A0B(r1, 1);
        if (!C231122qu.A0Q(hmP.A00, r1)) {
            return hmP.A02.A06(context, r1, str);
        }
        0Pl r5 = hmP.A02;
        ArrayList A1C = AnonymousClass7TE.A1C();
        1Xj A1c = r1.A1c(i);
        String str3 = null;
        if (A1c != null) {
            user = A1c.A0C.AzZ();
        } else {
            user = null;
        }
        User A2A = r1.A2A(r5.A0K);
        if (user != null) {
            A1C.add(user);
        }
        if (A2A != null) {
            A1C.add(A2A);
            str2 = A2A.getId();
        } else {
            str2 = null;
        }
        if (user != null) {
            str3 = user.getId();
        }
        return 0Pl.A02(context, r5, 002.A0T(str2, str3, '_'), str, A1C);
    }

    public final void A03(View view, C53281GlT glT, int i) {
        boolean A1Z = AnonymousClass7TG.A1Z(view, glT);
        C55728HmP hmP = this.A00;
        1Xj r6 = glT.A01;
        AnonymousClass3W1 r7 = glT.A02;
        User user = glT.A03;
        C51974G9v.A1M(r6, r7, user);
        C238833Dp.A00(hmP.A00).A07(view, C238863Ds.TITLE, new String[0], A1Z ? 1 : 0);
        int i2 = i;
        if (user.A2Q()) {
            hmP.A01.D2O(r6, r7, i, false);
        } else {
            hmP.A01.D3K(r6, r7, user.getId(), i2, false);
        }
    }
}
