package X;

import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.WfC  reason: case insensitive filesystem */
public final class C19771WfC implements AnonymousClass8Z4 {
    public final /* synthetic */ C15363UbF A00;

    public final void onSearchSubmitted(SearchEditText searchEditText, String str) {
    }

    public final void onSearchTextChanged(SearchEditText searchEditText, CharSequence charSequence, int i, int i2, int i3) {
        String str;
        0qQ.A0B(searchEditText, 0);
        String A01 = 0mp.A01(searchEditText.getTextForSearch());
        if (A01 != null) {
            C15363UbF ubF = this.A00;
            if (!A01.equals(ubF.A07)) {
                ubF.A07 = A01;
                ubF.A0B = true;
                ubF.A0C = true;
                C14200Trf trf = ubF.A03;
                if (trf == null) {
                    str = "dataSource";
                } else {
                    trf.A04();
                    if (ubF.A0J.CYJ()) {
                        C15475UdQ udQ = ubF.A02;
                        str = "searchAdapter";
                        if (udQ != null) {
                            udQ.A01 = false;
                            udQ.A01();
                            udQ.updateListView();
                            C15363UbF.A01(ubF);
                        }
                    } else {
                        C14221Ts1 ts1 = ubF.A04;
                        if (ts1 == null) {
                            str = "queuedTypeAheadManager";
                        } else {
                            ts1.A06(A01);
                            C15363UbF.A03(ubF, A01, true);
                        }
                    }
                    C15363UbF.A02(ubF);
                    return;
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    public C19771WfC(C15363UbF ubF) {
        this.A00 = ubF;
    }
}
