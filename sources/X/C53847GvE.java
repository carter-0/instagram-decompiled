package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.util.LruCache;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.GvE  reason: case insensitive filesystem */
public final class C53847GvE extends C251343mx {
    public final JPE A00;
    public final C267324bN A01;
    public final C52058GDe A02;
    public final JTB A03;
    public final C234072ww A04;
    public final UserSession A05;
    public final 1Xj A06;
    public final AnonymousClass4DU A07;
    public final AnonymousClass3W1 A08;

    public C53847GvE(JPE jpe, C267324bN r4, C52058GDe gDe, UserSession userSession, 1Xj r7, AnonymousClass4DU r8, AnonymousClass3W1 r9, JTB jtb) {
        AnonymousClass7TF.A1E(gDe, 2, jtb);
        this.A01 = r4;
        this.A02 = gDe;
        this.A05 = userSession;
        this.A06 = r7;
        this.A07 = r8;
        this.A08 = r9;
        this.A03 = jtb;
        this.A00 = jpe;
        this.A04 = new C234072ww(userSession, r8, (C249763kK) null);
    }

    public final C251263mp A0X(AnonymousClass3Y5 r39) {
        C247733gp r4;
        C253033q6 r0;
        AnonymousClass3Y5 r7 = r39;
        0qQ.A0B(r7, 0);
        1Xj r9 = this.A06;
        List A3f = r9.A3f();
        if (!(A3f == null || (r4 = (C247733gp) 00k.A0J(A3f)) == null)) {
            User user = r4.A08;
            User user2 = user;
            if (user != null) {
                0Pk r1 = 0Pl.A0n;
                Context A002 = C243803a8.A00(r7);
                UserSession userSession = this.A05;
                0Pl A003 = r1.A00(A002, userSession);
                boolean A062 = 182.A06(C51965G9l.A0Z(userSession, 0), userSession, 36329298700943341L);
                r4.A02(r9);
                this.A08.A2N = true;
                2V1 r12 = r7.A05;
                ArrayList A1C = AnonymousClass7TE.A1C();
                0qQ.A0B(r12, 1);
                C267324bN r37 = this.A01;
                C52058GDe gDe = this.A02;
                J6Q A004 = J6Q.A00(r4, this, 33);
                LruCache lruCache = A003.A0B;
                CharSequence charSequence = (CharSequence) lruCache.get(r9);
                if (charSequence == null) {
                    UserSession userSession2 = A003.A0K;
                    0qQ.A0B(userSession2, 0);
                    SpannableStringBuilder A0E = C51965G9l.A0E();
                    User user3 = r4.A08;
                    if (user3 != null) {
                        A0E.append(002.A0E(user3.getUsername(), '@', ' '));
                    }
                    A0E.append(r4.A0d);
                    C253003q3 r72 = new C253003q3(A0E, userSession2);
                    r72.A0L = true;
                    r72.A01 = -1;
                    r72.A0Q = true;
                    if (A062) {
                        r0 = new C253033q6(userSession2, r9, false);
                    } else {
                        r0 = null;
                    }
                    r72.A02(r0);
                    r72.A03(new C57257IUs(r9, A004, A062));
                    charSequence = r72.A00();
                    0qQ.A07(charSequence);
                    lruCache.put(r9, charSequence);
                }
                0sP gn2 = new GN2(35, this, r4, A062);
                Context A0B = C51965G9l.A0B(r12);
                List A1I = AnonymousClass7TE.A1I(AnonymousClass50Q.A00(user2));
                String moduleName = this.A07.getModuleName();
                ArrayList A0q = AnonymousClass7TF.A0q(moduleName, 3);
                A0q.addAll(A1I);
                String BpP = r9.BpP();
                LruCache lruCache2 = A003.A0A;
                Drawable drawable = (Drawable) lruCache2.get(BpP);
                if (drawable == null) {
                    drawable = C244283aw.A01(A0B, (Float) null, AnonymousClass05K.A00, moduleName, A0q, A0B.getResources().getDimensionPixelSize(R.dimen.asset_picker_cell_margin), true, false, true);
                    lruCache2.put(BpP, drawable);
                }
                C267324bN r22 = r37;
                C52058GDe gDe2 = gDe;
                Drawable drawable2 = drawable;
                ArrayList arrayList = A1C;
                arrayList.add(new C52235GKc(drawable2, (2WX) null, r22, gDe2, userSession, charSequence, (Integer) null, "inline_comment_text", "inline_comment_profile_pictures", "clips_inline_comment_text_component", r9.BpP(), gn2, 1, false, true, false));
                JPE jpe = this.A00;
                if (jpe != null) {
                    AnonymousClass3XV r02 = 2WX.A02;
                    arrayList = A1C;
                    arrayList.add(new C52580GYf(C51971G9r.A0Y(C51974G9v.A0D((2WX) null, C51965G9l.A0b(AnonymousClass05K.A00, 100.0f, 0), 100.0f, 0), AnonymousClass05K.A0Y, C244413b9.ABSOLUTE, 3), jpe, r37, gDe));
                }
                return new 2Tp((C243573Zh) null, (C243573Zh) null, (C243583Zi) null, (C244343b2) null, arrayList, false);
            }
        }
        return null;
    }
}
