package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.LimitedInteractionsVersions;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class H4P extends 1P0 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    public H4P(Object obj, Object obj2, String str, String str2, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
        this.A03 = str;
        this.A04 = str2;
    }

    public final void onFail(C268654dm r6) {
        if (1 - this.A00 != 0) {
            H4P.super.onFail(r6);
            return;
        }
        int A032 = AnonymousClass0fD.A03(-511542677);
        0wc A022 = AnonymousClass0kN.A02((0lg) this.A02);
        String str = this.A04;
        HashMap A1E = AnonymousClass7TE.A1E();
        C51975G9x.A1K(A1E);
        0Aj A0e = AnonymousClass7TE.A0e(A022, "instagram_wellbeing_limited_interactions_action");
        G9w.A1C(A0e, str);
        C51969G9p.A1F(A0e, "step", "settings_fetch_error", A1E);
        A0e.Cgf();
        AnonymousClass0fD.A0A(924016412, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        int i3;
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                i2 = AnonymousClass0fD.A03(-1715619252);
                C43822CEo cEo = (C43822CEo) obj2;
                int A0D = AnonymousClass7TG.A0D(cEo, 2109960052);
                List list = cEo.FH3().A01;
                if (list == null) {
                    i3 = -1469585131;
                } else {
                    ArrayList A0r = AnonymousClass7TG.A0r(list);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        String A0k = C51975G9x.A0k(it);
                        if (A0k != null) {
                            A0r.add(A0k);
                        } else {
                            IllegalStateException A0y = AnonymousClass7TE.A0y();
                            AnonymousClass0fD.A0A(1050108331, A0D);
                            throw A0y;
                        }
                    }
                    ArrayList A1D = AnonymousClass7TE.A1D(A0r);
                    I5X.A02((Activity) this.A01, (I5X) this.A02, this.A03, this.A04, cEo.FH3().A00, A1D, true);
                    i3 = 1968651149;
                }
                AnonymousClass0fD.A0A(i3, A0D);
                i = 585038518;
                break;
            case 1:
                i2 = AnonymousClass0fD.A03(2109361067);
                C54051Gya gya = (C54051Gya) obj2;
                int A0D2 = AnonymousClass7TG.A0D(gya, 924356900);
                C59633JRb jRb = gya.A02;
                if (jRb != null) {
                    UserSession userSession = (UserSession) this.A02;
                    0wc A022 = AnonymousClass0kN.A02(userSession);
                    String str = this.A04;
                    C53447Gof gof = (C53447Gof) jRb;
                    LimitedInteractionsVersions limitedInteractionsVersions = gof.A02;
                    Boolean bool = gof.A03;
                    boolean A1X = AnonymousClass7TG.A1X(bool);
                    Long l = gof.A04;
                    String valueOf = String.valueOf(l);
                    C294475mW r2 = gof.A00;
                    C53446Goe goe = gof.A01;
                    0qQ.A0B(valueOf, 4);
                    HashMap A1E = AnonymousClass7TE.A1E();
                    String bool2 = Boolean.toString(A1X);
                    0qQ.A07(bool2);
                    A1E.put("is_enabled", bool2);
                    A1E.put("reminder_date", valueOf);
                    C51975G9x.A1K(A1E);
                    C51975G9x.A1B(limitedInteractionsVersions, A1E);
                    boolean z10 = false;
                    if (goe != null) {
                        z = goe.A01;
                    } else {
                        z = false;
                    }
                    String bool3 = Boolean.toString(z);
                    0qQ.A07(bool3);
                    A1E.put("some_interactions", bool3);
                    if (goe != null) {
                        z2 = goe.A00;
                    } else {
                        z2 = false;
                    }
                    String bool4 = Boolean.toString(z2);
                    0qQ.A07(bool4);
                    A1E.put("most_interactions", bool4);
                    if (r2 != null) {
                        z3 = r2.A00;
                    } else {
                        z3 = false;
                    }
                    String bool5 = Boolean.toString(z3);
                    0qQ.A07(bool5);
                    A1E.put("new_followers", bool5);
                    if (r2 != null) {
                        z4 = r2.A02;
                    } else {
                        z4 = false;
                    }
                    String bool6 = Boolean.toString(z4);
                    0qQ.A07(bool6);
                    A1E.put("non_followers", bool6);
                    if (r2 != null) {
                        z10 = r2.A01;
                    }
                    String bool7 = Boolean.toString(z10);
                    0qQ.A07(bool7);
                    A1E.put("non_close_friends", bool7);
                    0Aj A0e = AnonymousClass7TE.A0e(A022, "instagram_wellbeing_limited_interactions_action");
                    C51969G9p.A1F(A0e, MYP.A00(), str, A1E);
                    A0e.AAJ("step", "settings_fetch");
                    A0e.Cgf();
                    if (limitedInteractionsVersions == LimitedInteractionsVersions.V1) {
                        Context context = (Context) this.A01;
                        String str2 = this.A03;
                        HashMap A1E2 = AnonymousClass7TE.A1E();
                        A1E2.put("step", "0");
                        A1E2.put("entrypoint", str2);
                        1Av A002 = 1Au.A00(userSession);
                        A1E2.put(AnonymousClass000.A00(3229), String.valueOf(!AnonymousClass7TG.A1a(A002, A002.A6I, 1Av.A8a, 261)));
                        C46649DiU A042 = C46649DiU.A04(AnonymousClass000.A00(557), A1E2);
                        IgBloksScreenConfig A0N = DbS.A0N(userSession);
                        DbS.A18(context, A0N, 2131965056);
                        C46649DiU.A07(context, A0N, A042);
                    } else {
                        String str3 = this.A03;
                        boolean A1Z = C51972G9s.A1Z(bool);
                        if (r2 != null) {
                            z5 = r2.A02;
                            z6 = r2.A00;
                            z7 = r2.A01;
                        } else {
                            z5 = false;
                            z6 = false;
                            z7 = false;
                        }
                        long A043 = DbY.A04(l);
                        long A08 = C51967G9n.A08(gof.A05, 0);
                        if (goe != null) {
                            z8 = goe.A01;
                            z9 = goe.A00;
                        } else {
                            z8 = false;
                            z9 = false;
                        }
                        String str4 = str3;
                        Dbb.A11(C56352Hx3.A00(str, str4, A043, A08, A1Z, z5, z6, z7, z8, z9, AnonymousClass7TF.A1W(limitedInteractionsVersions, LimitedInteractionsVersions.V2_CUSTOMIZABLE)), (FragmentActivity) this.A01, userSession);
                    }
                    AnonymousClass0fD.A0A(1625552851, A0D2);
                    i = -1482865426;
                    break;
                } else {
                    C41845B3m.A0v();
                    throw AnonymousClass00P.createAndThrow();
                }
            default:
                H4P.super.onSuccess(obj2);
                return;
        }
        AnonymousClass0fD.A0A(i, i2);
    }
}
