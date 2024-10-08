package X;

import android.app.Activity;
import android.content.res.Resources;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.FTb  reason: case insensitive filesystem */
public final class C50195FTb implements C267624bv {
    public final int A00;
    public final Object A01;

    public C50195FTb(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void CxD() {
        switch (this.A00) {
            case 0:
                EtF etF = ((DxE) this.A01).A04;
                if (etF != null) {
                    C47467E3p e3p = etF.A00;
                    AnonymousClass0eM r1 = e3p.A0K;
                    if (((C314326i1) r1.getValue()).A02()) {
                        07U r3 = 07U.A05;
                        AnonymousClass07Z viewLifecycleOwner = e3p.getViewLifecycleOwner();
                        AnonymousClass7TE.A1Z(new MHH(r3, e3p, viewLifecycleOwner, (AnonymousClass4D7) null, 29), AnonymousClass07a.A00(viewLifecycleOwner));
                        ((C314326i1) r1.getValue()).A00();
                        return;
                    }
                    C47467E3p.A03(e3p, true);
                    return;
                }
                return;
            case 5:
                K7D k7d = (K7D) this.A01;
                IgTextView igTextView = k7d.A02;
                if (igTextView != null) {
                    Resources A05 = DbV.A05(k7d);
                    boolean z = k7d.A0B;
                    int i = 2131953469;
                    if (z) {
                        i = 2131953468;
                    }
                    DbU.A1A(A05, igTextView, i);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final /* synthetic */ void CxF() {
        switch (this.A00) {
            case 1:
                C47468E3r e3r = (C47468E3r) this.A01;
                e3r.A0E.putExtra(C273654mx.A00(1506), true);
                C47468E3r.A04(e3r);
                return;
            case 4:
                ((UserDetailFragment) this.A01).A0p();
                return;
            case 5:
                K7D k7d = (K7D) this.A01;
                IgTextView igTextView = k7d.A02;
                if (igTextView != null) {
                    DbU.A1A(DbV.A05(k7d), igTextView, 2131953467);
                }
                IgTextView igTextView2 = k7d.A02;
                if (igTextView2 != null) {
                    FPG.A00(igTextView2, 42, k7d, this);
                    return;
                }
                return;
            case 7:
                Dba.A1Q(this.A01);
                return;
            default:
                return;
        }
    }

    public final void CxG() {
        C331157Pu r0;
        switch (this.A00) {
            case 0:
                r0 = ((DxE) this.A01).A06;
                break;
            case 3:
                DbX.A10(DbT.A0E(this.A01), AnonymousClass37D.A00);
                return;
            case 6:
                r0 = ((DxD) this.A01).A02;
                break;
            case 8:
                ((Activity) this.A01).finish();
                return;
            default:
                return;
        }
        DbW.A1K(r0);
    }

    public final /* synthetic */ void CxR() {
        switch (this.A00) {
            case 1:
                C47468E3r e3r = (C47468E3r) this.A01;
                ((DdZ) e3r.A0K.getValue()).A02((String) null, false);
                ((C46368Ddk) e3r.A0I.getValue()).A05(false, false);
                e3r.A0E.putExtra("avatar_updated", true);
                return;
            case 4:
                ((UserDetailFragment) this.A01).A12(false);
                return;
            case 7:
                2YL A0H = DbS.A0H(((ES9) this.A01).A07);
                AnonymousClass7TE.A1Z(new C66168MGf(A0H, (AnonymousClass4D7) null, 18), C318116oQ.A00(A0H));
                return;
            default:
                return;
        }
    }
}
