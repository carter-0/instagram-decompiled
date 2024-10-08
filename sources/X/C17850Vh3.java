package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Vh3  reason: case insensitive filesystem */
public final class C17850Vh3 {
    public final C226492gu A00;
    public final C17310VQp A01;
    public final C17963Vix A02;
    public final Map A03 = new HashMap();

    public final void A00(String str) {
        C17406VUl vUl = (C17406VUl) this.A03.get(str);
        if (vUl != null && !vUl.A00) {
            vUl.A00 = true;
            vUl.A01.A02.A01.add(vUl);
        }
    }

    public C17850Vh3(C226492gu r3) {
        this.A00 = r3;
        C17310VQp vQp = new C17310VQp();
        this.A01 = vQp;
        C17963Vix vix = new C17963Vix();
        this.A02 = vix;
        vQp.A00.add(vix);
    }
}
