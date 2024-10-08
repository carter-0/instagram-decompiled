package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.6pq  reason: invalid class name and case insensitive filesystem */
public final class C318976pq implements C267624bv {
    public final /* synthetic */ C318956po A00;

    public final /* synthetic */ void CxG() {
    }

    public C318976pq(C318956po r1) {
        this.A00 = r1;
    }

    public final void CxD() {
        Fragment fragment;
        C318956po r8 = this.A00;
        AnonymousClass0eM r3 = r8.A0E;
        C314326i1 r0 = (C314326i1) r3.getValue();
        if (r0 == null || !r0.A02()) {
            r8.A0G.invoke(true);
            r8.A02();
            r8.A03 = true;
            return;
        }
        C50974Fm1 fm1 = new C50974Fm1(r8);
        Object obj = r8.A0D.get();
        if ((obj instanceof AnonymousClass4DH) && (fragment = (Fragment) obj) != null) {
            07U r6 = 07U.A05;
            AnonymousClass07Z viewLifecycleOwner = fragment.getViewLifecycleOwner();
            AnonymousClass0xx A002 = AnonymousClass07a.A00(viewLifecycleOwner);
            1Eo.A05(19B.A00, new MHL(viewLifecycleOwner, r6, fm1, r8, (AnonymousClass4D7) null, 16), A002);
        }
        C314326i1 r02 = (C314326i1) r3.getValue();
        if (r02 != null) {
            r02.A00();
        }
    }

    public final void CxF() {
        C318956po r1 = this.A00;
        r1.A0F.invoke();
        r1.A02();
    }

    public final void CxR() {
        this.A00.A0G.invoke(false);
    }
}
