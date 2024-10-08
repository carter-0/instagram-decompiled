package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Mgn  reason: case insensitive filesystem */
public final class C67014Mgn implements C74504Pvz {
    public final AnonymousClass1aS A00;
    public final AnonymousClass1aS A01;
    public final AnonymousClass68Z A02 = new C72120Owf((Object) this, 28);
    public final AnonymousClass68Z A03 = new C72120Owf((Object) this, 29);
    public final C269794fh A04;
    public final UserSession A05;
    public final 2B9 A06;
    public final C66687Mau A07;
    public final C74565PxE A08;
    public final C74566PxF A09;
    public final 2EM A0A;
    public final 2Dm A0B;
    public final C251033mS A0C;
    public final AnonymousClass0eM A0D = AnonymousClass0eN.A01(C73924Pm4.A01(this, 46));
    public final Context A0E;

    public final void EfW(int i) {
    }

    public final void EoV(C2611948q r2) {
        0qQ.A0B(r2, 0);
        this.A00.accept(r2);
    }

    public C67014Mgn(Context context, C269794fh r14, UserSession userSession, C66687Mau mau, 2EM r17, 2Dm r18, C2611948q r19, C251033mS r20, boolean z, boolean z2, boolean z3) {
        2Dm r2 = r18;
        0qQ.A0B(r2, 3);
        this.A0E = context;
        this.A05 = userSession;
        this.A0B = r2;
        this.A0C = r20;
        this.A04 = r14;
        2EM r5 = r17;
        this.A0A = r5;
        C66687Mau mau2 = mau;
        this.A07 = mau2;
        this.A00 = 1aF.A01(r19);
        this.A01 = 1aF.A01(new N4R(r5, AnonymousClass7TE.A0u()));
        this.A08 = new C67102MiM(context, (1aU) ((2Dr) r2).A0C.A0I.getValue(), r14, userSession, r5);
        this.A09 = new C66719MbQ(((1aU) this.A0D.getValue()).A0L(C66727MbY.A00), userSession, mau2, r5, z, z2, z3);
        this.A06 = 2B8.A00(userSession);
    }

    public final 1aU AE3() {
        return C72120Owf.A00(this.A0B.A0C.A09(2EN.A04), this, 27);
    }

    public final 1aU AV8() {
        return this.A00.A0D();
    }

    public final 1aU AW9() {
        return this.A01.A0D();
    }

    public final C74565PxE B6g() {
        return this.A08;
    }

    public final C74566PxF C6W() {
        return this.A09;
    }

    public final 1aU E2O() {
        2ED r0 = this.A0B.A0C;
        return r0.A08.A0P((C269794fh) r0.A0H.getValue());
    }

    public final void EWx(N4R n4r) {
        this.A01.accept(n4r);
    }

    public final 1aU Ezk() {
        return ((1aU) this.A0D.getValue()).A0L(C66730Mbb.A00);
    }
}
