package X;

import com.instagram.ui.widget.typeahead.TypeaheadHeader;

public final class PRO implements MT6 {
    public final int A00;
    public final Object A01;

    public PRO(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onSearchCleared(String str) {
        C74374Pto pto;
        switch (this.A00) {
            case 0:
                0qQ.A0B(str, 0);
                C14138TqY tqY = (C14138TqY) this.A01;
                tqY.A0D().ChZ(tqY.A0i.E4z(), str);
                return;
            case 1:
                pto = ((C67877MwL) this.A01).A02;
                break;
            default:
                0qQ.A0B(str, 0);
                pto = ((TypeaheadHeader) this.A01).A02;
                break;
        }
        if (pto != null) {
            pto.onSearchCleared(str);
        }
    }
}
