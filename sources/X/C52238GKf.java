package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* renamed from: X.GKf  reason: case insensitive filesystem */
public final class C52238GKf extends C324596za {
    public int A00;
    public final C320446sO A01;
    public final String A02;
    public final List A03;
    public final Set A04;
    public final C62320sa A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08 = true;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final UserSession A0D;
    public final C61410nE A0E;
    public final Integer A0F;

    public C52238GKf(C320446sO r2, UserSession userSession, Integer num, String str, List list, Set set, C62320sa r8, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        AnonymousClass7TG.A1Q(set, list);
        this.A0D = userSession;
        this.A04 = set;
        this.A03 = list;
        this.A07 = z;
        this.A0A = z2;
        this.A09 = z3;
        this.A0F = num;
        this.A0C = z4;
        this.A0B = z5;
        this.A06 = z6;
        this.A01 = r2;
        this.A02 = str;
        this.A05 = r8;
        this.A0E = C61410nE.A00;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C54192H2m h2m;
        N49 n49;
        String str;
        String str2;
        String str3;
        String str4;
        int A032 = AnonymousClass0fD.A03(-653937981);
        C298835u7 r7 = (C298835u7) obj;
        int A0D2 = AnonymousClass7TG.A0D(r7, 1243677822);
        List<C267324bN> A0m = C51973G9u.A0m(r7);
        for (C320456sP A002 : this.A03) {
            A0m = A002.A00(A0m);
        }
        boolean z = this.A09;
        if (z) {
            for (C267324bN A0D3 : A0m) {
                A0D3.A0D(AnonymousClass05K.A0C);
            }
        } else if (r7.CPt()) {
            for (C267324bN A0D4 : A0m) {
                A0D4.A0D(AnonymousClass05K.A0Y);
            }
        }
        boolean z2 = this.A0C;
        if (z2) {
            for (C267324bN r1 : A0m) {
                r1.A09 = true;
            }
        }
        if (!r7.CPt()) {
            for (C267324bN r11 : A0m) {
                r11.A06 = Long.valueOf(System.currentTimeMillis() / 1000);
            }
        }
        if (!(!(r7 instanceof C54192H2m) || (n49 = h2m.A00) == null || (str = n49.A01) == null || str.length() == 0 || (str2 = n49.A00) == null)) {
            for (C267324bN r12 : A0m) {
                1Xj r0 = r12.A02;
                if (r0 != null) {
                    str3 = r0.A2n();
                } else {
                    str3 = null;
                }
                if (0qQ.A0K(str3, str2)) {
                    N49 n492 = (h2m = (C54192H2m) r7).A00;
                    if (n492 != null) {
                        str4 = n492.A01;
                    } else {
                        str4 = null;
                    }
                    r12.A07 = str4;
                }
            }
        }
        int i = this.A00;
        boolean z3 = this.A07;
        boolean z4 = this.A0A;
        boolean z5 = this.A08;
        boolean z6 = this.A0B;
        boolean z7 = this.A06;
        String BaG = r7.BaG();
        String Bnn = r7.Bnn();
        HashMap Ahj = r7.Ahj();
        List Ahh = r7.Ahh();
        long AjP = r7.AjP();
        long responseTimestamp = r7.getResponseTimestamp();
        C298835u7 r16 = r7;
        C58188Ins ins = new C58188Ins(4, new C52263GLe(r16, Long.valueOf(AjP), Long.valueOf(responseTimestamp), BaG, Bnn, this.A02, Ahj, A0m, Ahh, i, z3, z4, z, z2, z5, z6, z7, r7.CPt()), this);
        if (z) {
            C320446sO r02 = this.A01;
            if (r02 != null) {
                r02.A03();
            }
            if (!C51971G9r.A1b(this.A05)) {
                11Z.A03(new GMG(ins));
                this.A00++;
                AnonymousClass0fD.A0A(-1136407544, A0D2);
                AnonymousClass0fD.A0A(1939025633, A032);
            }
        }
        ins.invoke();
        this.A00++;
        AnonymousClass0fD.A0A(-1136407544, A0D2);
        AnonymousClass0fD.A0A(1939025633, A032);
    }

    public final void onFail(C268654dm r12) {
        int A0D2 = AnonymousClass7TG.A0D(r12, 328851863);
        H3D h3d = new H3D(r12, this.A00, this.A07, this.A0A, this.A09, this.A0C, this.A0B);
        for (C270674h7 D3r : this.A04) {
            D3r.D3r(h3d);
        }
        AnonymousClass0fD.A0A(1961192260, A0D2);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(-907211457);
        C58710IwJ iwJ = new C58710IwJ(this, 21);
        if (!this.A0C || !this.A09 || C51971G9r.A1b(this.A05)) {
            iwJ.invoke();
        } else {
            11Z.A03(new GMG(iwJ));
        }
        AnonymousClass0fD.A0A(1959882887, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(162018734);
        11Z.A03(new C52239GKg(this, new C52228GJt(this.A0F, this.A07, this.A0A, this.A0C, this.A06)));
        AnonymousClass0fD.A0A(769516931, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A032 = AnonymousClass0fD.A03(-1245146008);
        AnonymousClass0fD.A0A(2019579661, AnonymousClass0fD.A03(321307447));
        AnonymousClass0fD.A0A(912687385, A032);
    }
}
