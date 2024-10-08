package X;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* renamed from: X.JjN  reason: case insensitive filesystem */
public final class C60319JjN extends 2YL {
    public boolean A00;
    public final UserSession A01;
    public final C63846L9b A02;
    public final 1Av A03;
    public final HashMap A04 = AnonymousClass7TE.A1E();
    public final C249513ju A05;
    public final AnonymousClass0r6 A06;
    public final 05G A07;
    public final AnonymousClass0Ud A08;

    public final void A07() {
        Object value;
        C61051Jvp jvp;
        Spannable spannable;
        this.A00 = false;
        A02(C61745KKk.A00, this);
        05G r5 = this.A07;
        do {
            value = r5.getValue();
            jvp = (C61051Jvp) value;
            spannable = jvp.A01;
            if (00l.A0W(spannable)) {
                spannable = new SpannableString("");
            }
        } while (!r5.AIY(value, C61051Jvp.A01(spannable, jvp, (List) null, (List) null, (Set) null, 0, 16284, false, false, false, false)));
        C61051Jvp.A03(this, r5);
    }

    public final void A09(Spannable spannable, Hashtag hashtag, int i) {
        Object value;
        0qQ.A0B(spannable, 2);
        0eP A002 = C18190Vn4.A00(spannable, hashtag, '#', i);
        if (A002 != null) {
            05G r3 = this.A07;
            do {
                value = r3.getValue();
            } while (!r3.AIY(value, C61051Jvp.A01((Spannable) A002.A00, (C61051Jvp) value, (List) null, (List) null, (Set) null, 0, 16319, false, false, false, false)));
            A03(this, C51969G9p.A0A(A002) + 1);
        }
    }

    public /* synthetic */ C60319JjN(UserSession userSession, C63846L9b l9b) {
        UserSession userSession2 = userSession;
        1Av A002 = 1Au.A00(userSession2);
        AnonymousClass7TG.A1Q(userSession2, A002);
        C63846L9b l9b2 = l9b;
        this.A02 = l9b2;
        this.A01 = userSession2;
        this.A03 = A002;
        SpannableStringBuilder A0C = DbS.A0C("");
        List list = 0sn.A00;
        02z A10 = DbS.A10(new C61051Jvp(A0C, "", list, list, 0sl.A00, 0, false, false, false, false, false, false, false, false));
        this.A07 = A10;
        this.A08 = A10;
        1HR A1G = JTO.A1G(0);
        this.A05 = A1G;
        this.A06 = 0u9.A04(A1G);
        ((C337257fy) l9b2.A05.getValue()).EcJ(new C65613Lwo(this, 1));
        ((AfB) l9b2.A04.getValue()).A00 = new C66309MMs(this, 6);
    }

    public static final String A00(CharSequence charSequence, char c, int i) {
        int i2 = i - 1;
        int i3 = i2;
        while (-1 < i3 && charSequence.charAt(i3) != ' ' && charSequence.charAt(i3) != 10) {
            if (charSequence.charAt(i3) == c) {
                return charSequence.subSequence(i3 + 1, i2 + 1).toString();
            }
            i3--;
        }
        return null;
    }

    public static final void A03(C60319JjN jjN, int i) {
        A02(new C61740KKf(((C61051Jvp) jjN.A07.getValue()).A01, i), jjN);
    }

    public static final void A04(C60319JjN jjN, C2802550x r17) {
        Spannable spannableString;
        Object value;
        List list;
        C2802550x r2 = r17;
        String str = r2.A00;
        if (str == null || 00l.A0W(str)) {
            spannableString = new SpannableString("");
        } else {
            spannableString = C18790W1s.A00((Context) null, r2, false);
        }
        C18190Vn4.A01(spannableString);
        C60319JjN jjN2 = jjN;
        05G r1 = jjN2.A07;
        do {
            value = r1.getValue();
            list = 0sn.A00;
        } while (!r1.AIY(value, new C61051Jvp(spannableString, "", list, list, 0sl.A00, 0, false, false, false, false, false, false, false, false)));
        A02(new C61740KKf(spannableString, spannableString.length()), jjN2);
    }

    public static final boolean A05(C60319JjN jjN) {
        return AnonymousClass7TF.A1T(((C61051Jvp) jjN.A07.getValue()).A05.size(), 20);
    }

    public final void A06() {
        Object value;
        int i = this.A03.A01.getInt("story_quick_caption_dogfooding_nux_shown_count", 0);
        UserSession userSession = this.A01;
        if (182.A06(0Tu.A05, userSession, 36320214845104239L) && 1CI.A00(userSession) && i < 2) {
            A02(C61748KKn.A00, this);
            AnonymousClass7TG.A1M(1Au.A00(userSession).A01, "story_quick_caption_dogfooding_nux_shown_count", i + 1);
        }
        05G r2 = this.A07;
        if (!((C61051Jvp) r2.getValue()).A0B) {
            A02(C61746KKl.A00, this);
        }
        do {
            value = r2.getValue();
        } while (!r2.AIY(value, C61051Jvp.A01((Spannable) null, (C61051Jvp) value, (List) null, (List) null, (Set) null, 0, 16382, true, false, false, false)));
        C61051Jvp.A03(this, r2);
    }

    public final void A08() {
        Object value;
        boolean z;
        SpannableStringBuilder A0C;
        List list;
        05G r2 = this.A07;
        do {
            value = r2.getValue();
            z = ((C61051Jvp) value).A0A;
            A0C = DbS.A0C("");
            list = 0sn.A00;
        } while (!r2.AIY(value, new C61051Jvp(A0C, "", list, list, 0sl.A00, 0, z, false, false, false, false, false, false, false)));
        C61051Jvp.A03(this, r2);
    }

    public static final void A01(Spannable spannable, C60319JjN jjN, User user, int i) {
        0eP A002;
        Object value;
        C61051Jvp jvp;
        Set A0j;
        if (A05(jjN) && (A002 = C18190Vn4.A00(spannable, user, '@', i)) != null) {
            05G r5 = jjN.A07;
            do {
                value = r5.getValue();
                jvp = (C61051Jvp) value;
                A0j = 00k.A0j(jvp.A05);
                A0j.add(user.getId());
            } while (!r5.AIY(value, C61051Jvp.A01((Spannable) A002.A00, jvp, (List) null, (List) null, A0j, 0, 8127, false, false, false, false)));
            A03(jjN, C51969G9p.A0A(A002) + 1);
            C63414Kwa.A00(jjN.A02.A01).A01(user);
        }
    }

    public static final void A02(C62750Klo klo, C60319JjN jjN) {
        1Eo.A05(JTO.A1F(), new MH1(klo, jjN, (AnonymousClass4D7) null, 6), C318116oQ.A00(jjN));
    }
}
