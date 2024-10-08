package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.WWz  reason: case insensitive filesystem */
public final class C19382WWz implements C231292rN, XAZ, C20897X3o {
    public AnonymousClass2t9 A00;
    public final Fragment A01;
    public final UserSession A02;
    public final C14338TuL A03 = new C14338TuL();
    public final X41 A04;
    public final X9Q A05;
    public final AnonymousClass4DU A06;
    public final C17264VOr A07;

    /* JADX WARNING: type inference failed for: r0v2, types: [X.2tF, java.lang.Object] */
    public C19382WWz(Fragment fragment, UserSession userSession, X41 x41, X9Q x9q, AnonymousClass4DU r14, C17264VOr vOr) {
        0qQ.A0B(userSession, 2);
        this.A01 = fragment;
        this.A02 = userSession;
        this.A06 = r14;
        this.A05 = x9q;
        this.A07 = vOr;
        this.A04 = x41;
        AnonymousClass2tC A0S = DbV.A0S(fragment);
        A0S.A01(new Object());
        A0S.A01(new C46560Dh2(false, 0));
        this.A00 = DbU.A0U(A0S, new C68579NOb(r14, userSession, x41, x9q, vOr));
    }

    public final AnonymousClass3W1 BQr(1Xj r2) {
        0qQ.A0B(r2, 0);
        return this.A03.BQr(r2);
    }

    public final int AVI(Object obj) {
        AnonymousClass2t9 r1 = this.A00;
        String id = ((C69011Ncn) obj).A03.getId();
        if (id != null) {
            return r1.A02(id);
        }
        throw AnonymousClass7TE.A0y();
    }

    public final C14315Ttp CE9(int i) {
        C296955qv r5;
        Object A042 = this.A00.A04(i);
        if (!(A042 instanceof C296955qv) || (r5 = (C296955qv) A042) == null || !r5.BPf().CeS()) {
            return null;
        }
        1Xj BPf = r5.BPf();
        0qQ.A0B(BPf, 0);
        if (BPf.getId() != null) {
            String id = r5.getId();
            if (id != null) {
                return new C14315Ttp((C14314Tto) null, BPf, id, r5.CP9());
            }
            throw AnonymousClass7TE.A0y();
        }
        throw AnonymousClass7TE.A0y();
    }

    public final int CEA(C14315Ttp ttp) {
        return this.A00.A02(ttp.A02);
    }

    public final void Cs9(1Xj r3) {
        C14338TuL tuL = this.A03;
        tuL.A00.clear();
        tuL.A01.clear();
    }

    public final int getCount() {
        return this.A00.getItemCount();
    }

    public final Object getItem(int i) {
        Object A042 = this.A00.A04(i);
        0qQ.A07(A042);
        return A042;
    }
}
