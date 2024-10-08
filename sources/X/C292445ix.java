package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.5ix  reason: invalid class name and case insensitive filesystem */
public final class C292445ix extends 1P0 {
    public long A00 = System.currentTimeMillis();
    public final /* synthetic */ AnonymousClass2l3 A01;
    public final /* synthetic */ 1OE A02;
    public final /* synthetic */ C228102kn A03;
    public final /* synthetic */ Integer A04;

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(-1842843755);
        AnonymousClass3HO r6 = (AnonymousClass3HO) obj;
        int A033 = AnonymousClass0fD.A03(601978231);
        0qQ.A0B(r6, 0);
        C228102kn r7 = this.A03;
        r7.A0I = false;
        C228102kn.A08(this.A02, r6, r7, -1, this.A00, false);
        AnonymousClass2l3 r2 = this.A01;
        if (r2 != null) {
            r2.A05(true, (String) null);
        }
        AnonymousClass0fD.A0A(1991308490, A033);
        AnonymousClass0fD.A0A(-687393935, A032);
    }

    public C292445ix(AnonymousClass2l3 r3, 1OE r4, C228102kn r5, Integer num) {
        this.A03 = r5;
        this.A02 = r4;
        this.A04 = num;
        this.A01 = r3;
    }

    public final void onFail(C268654dm r10) {
        int A032 = AnonymousClass0fD.A03(-1334275613);
        0qQ.A0B(r10, 0);
        C228102kn.A03(r10, this.A02, this.A03, this.A00, false);
        AnonymousClass2l3 r1 = this.A01;
        if (r1 != null) {
            r1.A05(false, String.valueOf(r10.A01()));
        }
        AnonymousClass0fD.A0A(1540947388, A032);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(-797297901);
        C228102kn r2 = this.A03;
        1OH.A00(r2.A07).A07(this.A02);
        r2.A0G = false;
        r2.A0C = false;
        AnonymousClass0fD.A0A(1326784893, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(-104720433);
        C292445ix.super.onStart();
        C228102kn r4 = this.A03;
        UserSession userSession = r4.A07;
        1OI A002 = 1OH.A00(userSession);
        1OE r2 = this.A02;
        A002.A0C(r2, (String) null);
        if (r2.A03 != AnonymousClass05K.A0C) {
            r4.A0Q.clear();
        }
        if (AnonymousClass05K.A01 == r2.A04 || r2.A00()) {
            C2372236u.A00(userSession).A05(r2);
        }
        AnonymousClass0fD.A0A(1134719138, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A032 = AnonymousClass0fD.A03(290445736);
        AnonymousClass3HO r6 = (AnonymousClass3HO) obj;
        int A033 = AnonymousClass0fD.A03(-492908003);
        0qQ.A0B(r6, 0);
        C228102kn r2 = this.A03;
        C239753Ia A002 = r6.FH3();
        1E4.A00(r2.A07);
        C228102kn.A0A(A002, r2);
        AnonymousClass0fD.A0A(1215907454, A033);
        AnonymousClass0fD.A0A(-819878434, A032);
    }
}
