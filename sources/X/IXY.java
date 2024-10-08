package X;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;

public final class IXY implements C59612JQg {
    public final int A00;
    public final Object A01;

    public IXY(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final C358248ab ALt(C358248ab r3) {
        UserSession userSession;
        AnonymousClass4DH r0;
        switch (this.A00) {
            case 0:
                AnonymousClass4DH r02 = (AnonymousClass4DH) this.A01;
                C358248ab A0U = DbW.A0U(r02);
                A0U.A0m(r02);
                return A0U;
            case 1:
                IXF ixf = (IXF) this.A01;
                userSession = ixf.A01;
                r0 = ixf.A00;
                break;
            default:
                GCW gcw = (GCW) this.A01;
                userSession = gcw.A03;
                r0 = gcw.A01;
                break;
        }
        r3.A0l(r0, userSession);
        return r3;
    }

    public final boolean CM2() {
        if (1 - this.A00 != 0) {
            return false;
        }
        return AnonymousClass7TF.A1V(((IXF) this.A01).A04);
    }

    public final void EDh(1Xj r9, AnonymousClass3W1 r10, int i, int i2) {
        if (1 - this.A00 == 0) {
            IXF ixf = (IXF) this.A01;
            C56561I1p i1p = ixf.A02;
            SavedCollection savedCollection = ixf.A04;
            savedCollection.getClass();
            i1p.A02((Fragment) null, r9, savedCollection, savedCollection.A0F, i, i2);
        }
    }

    public final void FJA(1Xj r13, AnonymousClass3W1 r14, int i, int i2) {
        1Xj r7 = r13;
        int i3 = i;
        int i4 = i2;
        switch (this.A00) {
            case 0:
                0qQ.A0B(r13, 0);
                H1P h1p = (H1P) this.A01;
                H1P.A01(h1p.requireContext(), h1p, r13, i, i4);
                H1P.A04(h1p);
                if (r13.A4u()) {
                    AnonymousClass0eM r1 = h1p.A0M;
                    if (I7Q.A08(AnonymousClass7TE.A0l(r1))) {
                        I7Q.A02(h1p.requireContext(), new C54245H4o(i, 0, h1p, r13), AnonymousClass7TE.A0l(r1), r7, h1p, C243373Ym.NOT_SAVED, DbS.A0t(h1p.A0N), i3);
                    }
                }
                for (SavedCollection savedCollection : h1p.A08) {
                    savedCollection.A09 = false;
                }
                r13.EjB(C243373Ym.NOT_SAVED);
                ((1E8) h1p.A0J.getValue()).A03(r13);
                RecyclerView recyclerView = h1p.A00;
                if (recyclerView == null) {
                    0qQ.A0F("recyclerView");
                    throw AnonymousClass00P.createAndThrow();
                }
                2Rw r0 = recyclerView.A0A;
                if (r0 != null) {
                    r0.notifyDataSetChanged();
                }
                H1P.A03(h1p);
                return;
            case 1:
                return;
            default:
                0qQ.A0B(r13, 0);
                GCW.A01(r13, (GCW) this.A01, i, i4);
                return;
        }
    }
}
