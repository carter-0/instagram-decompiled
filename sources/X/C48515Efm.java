package X;

import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* renamed from: X.Efm  reason: case insensitive filesystem */
public abstract class C48515Efm {
    public static final Object A00(C307896Rx r3, AnonymousClass6Tm r4) {
        C46718Djp djp;
        C276544tV r2 = (C276544tV) DbW.A0e(r4);
        if (r2 == null) {
            return null;
        }
        int i = r2.A04;
        if (i == 13616) {
            IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) r2.A05(r3.A03);
            if (igdsInlineSearchBox == null) {
                return null;
            }
            igdsInlineSearchBox.clearFocus();
            igdsInlineSearchBox.A03();
            return null;
        } else if (i != 13697 || (djp = (C46718Djp) r2.A05(r3.A03)) == null) {
            return null;
        } else {
            djp.getEditText().clearFocus();
            djp.getEditText().A04();
            return null;
        }
    }
}
