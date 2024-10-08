package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.CompoundButton;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.P2u  reason: case insensitive filesystem */
public final class C72355P2u implements C74394PuA {
    public final Context A00;
    public final CompoundButton.OnCheckedChangeListener A01;
    public final FragmentActivity A02;
    public final UserSession A03;
    public final N4P A04;
    public final C358618bC A05;
    public final AnonymousClass4kA A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public C72355P2u(Context context, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, FragmentActivity fragmentActivity, UserSession userSession, N4P n4p, C358618bC r7, AnonymousClass4kA r8, boolean z, boolean z2, boolean z3) {
        AnonymousClass7TF.A1G(userSession, 3, r7);
        this.A02 = fragmentActivity;
        this.A00 = context;
        this.A03 = userSession;
        this.A04 = n4p;
        this.A06 = r8;
        this.A09 = z;
        this.A08 = z2;
        this.A07 = z3;
        this.A05 = r7;
        this.A01 = onCheckedChangeListener;
    }

    public final List getItems() {
        PR9 pr9;
        FragmentActivity fragmentActivity = this.A02;
        Context context = this.A00;
        UserSession userSession = this.A03;
        N4P n4p = this.A04;
        AnonymousClass4kA r4 = this.A06;
        boolean z = this.A09;
        boolean z2 = this.A08;
        boolean z3 = this.A07;
        C358618bC r11 = this.A05;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.A01;
        if (z) {
            int i = 2131959033;
            if (z2) {
                i = 2131959032;
            }
            0xa r2 = r4.A00;
            AnonymousClass7TG.A1L(r2.AR4(), r2, "thread_translation_tooltip_impression", 0);
            boolean z4 = n4p.A0y;
            AnonymousClass5Gt A0e = AnonymousClass7TG.A0e(fragmentActivity, i);
            A0e.A02();
            A0e.A0B = false;
            A0e.A0A = false;
            A0e.A04 = new C47898ELs(r4, 7);
            pr9 = new C69188Ngm(onCheckedChangeListener, userSession, A0e, z4);
        } else {
            pr9 = new PR9(onCheckedChangeListener, 2131960610, n4p.A0y);
        }
        pr9.A09 = r11;
        String A082 = AnonymousClass48N.A08(context, userSession, n4p.A0P, JTO.A15(n4p.A0c), false);
        0qQ.A07(A082);
        int i2 = 2131960611;
        if (z3) {
            i2 = 2131960612;
        }
        SpannableStringBuilder A0C = DbS.A0C(DbY.A0c(context, A082, i2));
        String A042 = 182.A04(0Tu.A05, userSession, 36876868376854649L);
        if (A042.length() > 0) {
            pr9.A0C = true;
            String A16 = AnonymousClass7TE.A16(context, 2131960590);
            A0C.append(" ");
            A0C.append(A16).setSpan(new C48051ESu(fragmentActivity, userSession, A042, context.getColor(2Yu.A06(fragmentActivity)), 2), A0C.length(), A0C.length(), 33);
        }
        pr9.A0A = A0C;
        return AnonymousClass7TE.A1I(pr9);
    }

    public final boolean isEnabled() {
        return C69947Nun.A00(this.A03, this.A04);
    }
}
