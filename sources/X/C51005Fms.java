package X;

import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.Fms  reason: case insensitive filesystem */
public final class C51005Fms implements AnonymousClass8Z4 {
    public final /* synthetic */ C47714EDx A00;
    public final /* synthetic */ C48238EbJ A01;
    public final /* synthetic */ C307786Rm A02;
    public final /* synthetic */ C276544tV A03;

    public C51005Fms(C47714EDx eDx, C48238EbJ ebJ, C307786Rm r3, C276544tV r4) {
        this.A00 = eDx;
        this.A03 = r4;
        this.A01 = ebJ;
        this.A02 = r3;
    }

    public final void onSearchSubmitted(SearchEditText searchEditText, String str) {
        C276544tV r4 = this.A03;
        C277014uI A0A = r4.A0A(45);
        C277014uI A0A2 = r4.A0A(43);
        if (A0A != null) {
            C308276Tl A0P = DbS.A0P();
            A0P.A01(this.A01.A02);
            C307886Rw.A03(this.A02, r4, A0P.A00(), A0A);
        } else if (A0A2 != null) {
            C307886Rw.A03(this.A02, r4, DbS.A0P().A00(), A0A2);
        }
    }

    public final void onSearchTextChanged(SearchEditText searchEditText, CharSequence charSequence, int i, int i2, int i3) {
        String charSequence2;
        C276544tV r4 = this.A03;
        C277014uI A0A = r4.A0A(38);
        C48238EbJ ebJ = this.A01;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        ebJ.A02 = charSequence2;
        if (A0A != null) {
            C308276Tl A0T = DbU.A0T(r4);
            A0T.A02(ebJ.A02);
            C307786Rm r0 = this.A02;
            A0T.A03(r0, 2);
            DbT.A1R(r0, r4, A0T, A0A);
        }
    }
}
