package X;

import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.Twe  reason: case insensitive filesystem */
public final class C14456Twe implements C20985X8b {
    public final /* synthetic */ C14138TqY A00;

    public final void DwY() {
    }

    public C14456Twe(C14138TqY tqY) {
        this.A00 = tqY;
    }

    public final void CLU() {
        SearchEditText searchEditText = ((C14137TqX) this.A00).A0b.A06;
        if (searchEditText != null) {
            searchEditText.A04();
        }
    }

    public final void CgR() {
        int i;
        C14138TqY tqY = this.A00;
        C14221Ts1 ts1 = tqY.A0A;
        String str = "queuedTypeaheadManager";
        if (ts1 != null) {
            if (ts1.A08 && ts1.A05.A00 && !tqY.A0H && !ts1.A04()) {
                X4Z x4z = tqY.A0h;
                if (!x4z.CYJ()) {
                    String str2 = tqY.A01.A01;
                    AnonymousClass0eM r0 = 0mp.A09;
                    if (str2 != null && str2.length() > 0) {
                        C14221Ts1 ts12 = tqY.A0A;
                        if (ts12 != null) {
                            ts12.A03(str2);
                            C14219Trz trz = tqY.A0F().A01;
                            trz.A04 = false;
                            trz.A00();
                            tqY.A0I(tqY.A01.A01, true);
                            C14216Trv trv = tqY.A0D;
                            if (trv == null) {
                                str = "searchQueryPerfLogger";
                            } else {
                                String str3 = tqY.A01.A01;
                                C14137TqX tqX = (C14137TqX) tqY;
                                String str4 = tqX.A09;
                                if (str4 != null) {
                                    String A002 = C67419Mna.A00(tqX.A0d);
                                    boolean CYJ = x4z.CYJ();
                                    C14221Ts1 ts13 = tqY.A0A;
                                    if (ts13 != null) {
                                        C15050ULg uLg = tqY.A01;
                                        if (ts13.A08) {
                                            C14222Ts2 ts2 = ts13.A05;
                                            if (uLg != null) {
                                                Number A14 = C51966G9m.A14(uLg, ts2.A01);
                                                if (A14 != null) {
                                                    i = A14.intValue();
                                                    0qQ.A0B(str3, 0);
                                                    C14216Trv.A01(trv, str3, "SEARCH_PAGINATION", str4, A002, i, CYJ);
                                                    return;
                                                }
                                            } else {
                                                throw AnonymousClass7TE.A0y();
                                            }
                                        }
                                        i = 0;
                                        0qQ.A0B(str3, 0);
                                        C14216Trv.A01(trv, str3, "SEARCH_PAGINATION", str4, A002, i, CYJ);
                                        return;
                                    }
                                } else {
                                    throw AnonymousClass7TE.A0y();
                                }
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Euf() {
        ((C14137TqX) this.A00).A0b.A0P = true;
    }
}
