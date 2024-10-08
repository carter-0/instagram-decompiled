package X;

import java.util.ArrayList;
import java.util.Map;

public final class WIB implements X2Q {
    public String A00;

    public final void AT9(C17850Vh3 vh3, Map map) {
        C17406VUl vUl = (C17406VUl) vh3.A03.get(this.A00);
        if (vUl != null && vUl.A00) {
            vUl.A00 = false;
            ArrayList arrayList = vUl.A01.A02.A01;
            int indexOf = arrayList.indexOf(vUl);
            if (indexOf != -1) {
                arrayList.remove(indexOf);
            }
        }
    }
}
