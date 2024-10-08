package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.user.model.User;

/* renamed from: X.EDh  reason: case insensitive filesystem */
public abstract class C47698EDh extends 1P0 {
    public static final C51915G7j A0D = new C50909Fko();
    public FragmentActivity A00;
    public C51915G7j A01 = A0D;
    public G6L A02;
    public RegFlowExtras A03;
    public C48260Ebf A04;
    public boolean A05;
    public boolean A06;
    public final Context A07;
    public final AnonymousClass0aP A08;
    public final EXD A09;
    public final Integer A0A;
    public final String A0B;
    public final G69 A0C;

    public void A03(User user) {
        user.A03.Ecx(0);
        DbY.A1P(user);
    }

    public static void A00(UserSession userSession, C47698EDh eDh, User user, boolean z) {
        C48260Ebf ebf = eDh.A04;
        if (ebf != null && ebf.A02) {
            ebf.A00();
        }
        if (!z) {
            eDh.A03(user);
            UserSession userSession2 = userSession;
            AnonymousClass35B.A00().A02(eDh.A07, userSession2, eDh.A09, AnonymousClass7TG.A1X(user.A03.Ab4()), false, true, false, eDh.A06);
        }
    }

    public final void A01(AnonymousClass0aP r12, User user, 1Q0 r14, boolean z, boolean z2) {
        String str;
        AnonymousClass0aP r1 = r12;
        User user2 = user;
        if (r14 == 1Q0.A0u) {
            String id = user.getId();
            String str2 = this.A09.A00;
            Integer num = this.A0A;
            if (num != null) {
                str = C49109EpY.A00(num);
            } else {
                str = null;
            }
            String str3 = this.A0B;
            0qQ.A0B(r12, 0);
            C49216ErL.A00(r1, (C49922FEx) null, "done", id, str2, str, str3);
        } else {
            String id2 = user.getId();
            1Ln A002 = C49222ErR.A00(r1, this.A0A, this.A09.A00, "consumer", id2, this.A0B);
            this.A01.AOE(A002, 1Q0.A1I, (C49886FBm) null);
            A002.Cgf();
        }
        AnonymousClass0aP r7 = this.A08;
        Context context = this.A07;
        UserSession A022 = C46413Dea.A02(context, (AnonymousClass0iw) null, r7, user2, (String) null, false);
        if (!z) {
            C16857V8m.A00(context, A022).A00(EVX.REGISTRATION);
        }
        if (z2) {
            1ES.A03(new FZA(A022, this, user, z));
        } else {
            A00(A022, this, user, z);
        }
    }

    public final void A04(String str, Integer num) {
        G69 g69 = this.A0C;
        if (g69 != null) {
            g69.EuV(str, num);
        } else {
            1xC.A01.A00(new C50260FVr(str, num));
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.ERP, X.R8F] */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.Ebf] */
    public C47698EDh(Fragment fragment, AnonymousClass0aP r4, G69 g69, RegFlowExtras regFlowExtras, EXD exd, Integer num, String str, boolean z, boolean z2, boolean z3) {
        this.A08 = r4;
        this.A0C = g69;
        this.A07 = fragment.getContext();
        this.A09 = exd;
        this.A0A = num;
        this.A02 = new C50911Fkq(this);
        this.A0B = str;
        ? r8f = new R8F();
        r8f.A00 = z;
        ? obj = new Object();
        obj.A00 = fragment;
        obj.A01 = r8f;
        this.A04 = obj;
        this.A03 = regFlowExtras;
        this.A00 = fragment.getActivity();
        this.A05 = z2;
        this.A06 = z3;
    }

    public void A02(DwQ dwQ) {
        1Q0 r6;
        int A032 = AnonymousClass0fD.A03(1589469580);
        User user = dwQ.A01;
        user.A03.Ek2(dwQ.A02);
        boolean z = dwQ.A06;
        boolean z2 = dwQ.A05;
        if (z2) {
            r6 = 1Q0.A0u;
        } else {
            r6 = 1Q0.A1I;
        }
        A01(this.A08, user, r6, z2, z);
        AnonymousClass0fD.A0A(1740980549, A032);
    }

    public final void onFail(C268654dm r4) {
        int A032 = AnonymousClass0fD.A03(132518277);
        this.A02.ADD(r4, new C49679F1m(this));
        AnonymousClass0fD.A0A(-1501313004, A032);
    }

    public void onStart() {
        int i;
        int A032 = AnonymousClass0fD.A03(-463206009);
        C48260Ebf ebf = this.A04;
        if (ebf == null || !ebf.A02) {
            ebf.A01();
            i = 259848533;
        } else {
            i = 1851793246;
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(-1189645139);
        A02((DwQ) obj);
        AnonymousClass0fD.A0A(2055009702, A032);
    }
}
