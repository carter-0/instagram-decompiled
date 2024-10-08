package X;

import com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Lwr  reason: case insensitive filesystem */
public final class C65616Lwr implements C337257fy, C337237fw {
    public C337237fw A00;
    public Object A01 = AnonymousClass7TE.A1C();
    public boolean A02;
    public String A03 = "";
    public final C63856L9l A04;
    public final OAG A05;
    public final HashMap A06 = AnonymousClass7TE.A1E();
    public final String A07;
    public final List A08;
    public final boolean A09;
    public final boolean A0A;

    public final void DDU() {
    }

    public final void EJE() {
    }

    public final void ERO(List list) {
    }

    public final String Amq() {
        return null;
    }

    public final /* bridge */ /* synthetic */ Object B3J() {
        return this.A06;
    }

    public final boolean BBY() {
        return false;
    }

    public final String BiY() {
        return this.A03;
    }

    public final String BjE() {
        return "";
    }

    public final String BnF() {
        return this.A07;
    }

    public final Object Bo1() {
        return this.A01;
    }

    public final List Bqo() {
        return this.A08;
    }

    public final boolean CT5() {
        return this.A09;
    }

    public final boolean CWX() {
        return this.A0A;
    }

    public final boolean CYL() {
        return false;
    }

    public final void Dam(C337257fy r2) {
        C337237fw r0 = this.A00;
        if (r0 != null) {
            r0.Dam(this);
        }
    }

    public final void EcJ(C337237fw r2) {
        if (this.A00 != r2) {
            this.A00 = r2;
            if (r2 != null) {
                r2.Dam(this);
            }
        }
    }

    public final void EhX(String str) {
        this.A03 = str;
        C63856L9l l9l = this.A04;
        this.A01 = AnonymousClass7TE.A1C();
        this.A02 = true;
        OAG oag = this.A05;
        DirectShareSheetFragmentViewModel directShareSheetFragmentViewModel = l9l.A04;
        Dba.A15(l9l.A03, directShareSheetFragmentViewModel.A0J, new C73933PmD(oag, 5), 53);
        0rm A11 = C51965G9l.A11();
        AnonymousClass7TE.A1Z(new MHF(l9l, oag, A11, (AnonymousClass4D7) null, 37), C318116oQ.A00(directShareSheetFragmentViewModel));
        this.A02 = false;
        C337237fw r0 = this.A00;
        if (r0 != null) {
            r0.Dam(this);
        }
    }

    public final boolean isLoading() {
        return this.A02;
    }

    public C65616Lwr(C63856L9l l9l, OAG oag) {
        this.A04 = l9l;
        this.A05 = oag;
        this.A07 = l9l.A00;
        this.A08 = 0sn.A00;
        this.A09 = l9l.A01;
        this.A0A = l9l.A02;
    }
}
