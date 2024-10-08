package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.List;

/* renamed from: X.9mF  reason: invalid class name and case insensitive filesystem */
public final class C387459mF extends AA8 {
    public int A00;
    public int A01;
    public List A02 = AnonymousClass7TE.A1C();
    public boolean A03;
    public boolean A04;
    public final Context A05;
    public final View A06;
    public final AnonymousClass4DH A07;
    public final UserSession A08;
    public final AnonymousClass87H A09;
    public final C61407K6d A0A;
    public final AnonymousClass80U A0B;
    public final C369618v3 A0C;
    public final C19475WaN A0D;

    public final void A09(Drawable drawable) {
        0qQ.A0B(drawable, 0);
        if ((drawable instanceof C369618v3) && ((C369618v3) drawable).A09.A00.A02 == null) {
            UserSession userSession = this.A08;
            LTM.A02(this.A07, userSession, AnonymousClass000.A00(207));
            C394379xz.A00(this.A06, userSession).A00().A03(this.A05, this.A0A);
        }
    }

    public final void A0A(AnonymousClass87G r3) {
        0qQ.A0B(r3, 0);
        List list = r3.A0H;
        list.getClass();
        ImmutableList copyOf = ImmutableList.copyOf((Collection) list);
        if (copyOf != null) {
            this.A02 = copyOf;
            this.A01 = copyOf.size() + 1;
            this.A04 = false;
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final boolean A0K(AnonymousClass80W r4) {
        0qQ.A0B(r4, 0);
        Object obj = r4.A00.first;
        if (obj != AnonymousClass80V.FUNDRAISER_STICKER_COMPOSE && obj != AnonymousClass80V.SMB_SUPPORT_STICKER_COMPOSE) {
            return false;
        }
        r4.A04(new Object());
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [X.K6d, X.4DH] */
    public C387459mF(Context context, View view, AnonymousClass4DH r28, UserSession userSession, AnonymousClass87H r30, AnonymousClass80U r31, C19475WaN waN) {
        View view2 = view;
        UserSession userSession2 = userSession;
        C51972G9s.A1D(userSession2, view2);
        AnonymousClass4DH r5 = r28;
        AnonymousClass80U r1 = r31;
        C51972G9s.A1E(r5, r1);
        this.A09 = r30;
        Context context2 = context;
        this.A05 = context2;
        this.A08 = userSession2;
        this.A06 = view2;
        this.A07 = r5;
        this.A0B = r1;
        int[] iArr = C19475WaN.A03;
        String str = "";
        String str2 = "";
        String str3 = "";
        AnonymousClass8YF r6 = new AnonymousClass8YF(C18710Vyf.A00(), (User) null, (String) null, "", "", (String) null, (String) null, str, str2, "", "", str3, "", 0);
        AnonymousClass4Hy r11 = r6.A01;
        User user = r6.A02;
        String A002 = AnonymousClass000.A00(207);
        String string = context2.getString(2131962844);
        0qQ.A0B(string, 0);
        this.A0C = new C369618v3(context2, userSession2, new C19475WaN(C39574A0q.A00(r11, user, (String) null, str, str2, "DEFAULT", (String) null, str3, A002, "", "", string, "", 0)));
        ? r12 = new AnonymousClass4DH();
        this.A0A = r12;
        this.A0D = waN;
        r12.A00 = new C39643A3j(this);
    }

    public final void A06() {
        if (!this.A04) {
            LTM.A02(this.A07, this.A08, "CREATE_MODE_SUGGESTED");
            this.A04 = true;
        }
        int i = (this.A00 + 1) % this.A01;
        this.A00 = i;
        if (i == 0) {
            AnonymousClass87H r3 = this.A09;
            0qQ.A0A(r3);
            r3.A0A(this.A0C, AnonymousClass57C.CREATE_MODE_DIAL_SELECTION, C317876nz.A0p);
            return;
        }
        List list = this.A02;
        0qQ.A0A(list);
        User A0g = DbS.A0g(list, i - 1);
        Context context = this.A05;
        C369618v3 r32 = new C369618v3(context, this.A08, C14628Tza.A01(context, A0g, "CREATE_MODE_SUGGESTED"));
        AnonymousClass87H r2 = this.A09;
        0qQ.A0A(r2);
        r2.A0A(r32, AnonymousClass57C.CREATE_MODE_RANDOM_SELECTION, C317876nz.A0p);
    }

    public final void A07() {
        C19475WaN waN = this.A0D;
        if (waN != null) {
            Context context = this.A05;
            UserSession userSession = this.A08;
            C369618v3 r3 = new C369618v3(context, userSession, waN);
            AnonymousClass87H r2 = this.A09;
            0qQ.A0A(r2);
            r2.A0A(r3, AnonymousClass57C.CREATE_MODE_RANDOM_SELECTION, C317876nz.A0p);
            if (!this.A03) {
                LTM.A02(this.A07, userSession, waN.A00.A09);
            }
        } else {
            AnonymousClass87H r32 = this.A09;
            0qQ.A0A(r32);
            r32.A0A(this.A0C, AnonymousClass57C.CREATE_MODE_DIAL_SELECTION, C317876nz.A0p);
        }
        this.A03 = true;
    }

    public final boolean A0F() {
        AnonymousClass87H r1 = this.A09;
        0qQ.A0A(r1);
        if (r1.A02() == null) {
            return false;
        }
        if (!(r1.A02() instanceof C369618v3)) {
            return true;
        }
        C369618v3 r0 = (C369618v3) r1.A02();
        0qQ.A0A(r0);
        if (r0.A09.A00.A02 == null) {
            return false;
        }
        return true;
    }

    public final boolean A0H() {
        if (this.A01 <= 1) {
            return false;
        }
        return true;
    }

    public final boolean A0J(Drawable drawable, AnonymousClass80W r5) {
        UserSession userSession = this.A08;
        LTM.A02(this.A07, userSession, AnonymousClass000.A00(207));
        C394379xz.A00(this.A06, userSession).A00().A03(this.A05, this.A0A);
        return false;
    }
}
