package X;

import com.instagram.common.gallery.Medium;
import java.util.LinkedHashMap;
import java.util.List;

public final class M8G implements Runnable {
    public final /* synthetic */ C60297Jiv A00;
    public final /* synthetic */ 0sP A01;

    public M8G(C60297Jiv jiv, 0sP r2) {
        this.A00 = jiv;
        this.A01 = r2;
    }

    public final void run() {
        LinkedHashMap linkedHashMap;
        List A05;
        C60297Jiv jiv = this.A00;
        C3500883e r2 = jiv.A01;
        Medium medium = (Medium) 00k.A0J(jiv.A02);
        if (medium == null || (A05 = r2.A05(medium.A0X, medium.A03)) == null) {
            linkedHashMap = null;
        } else {
            linkedHashMap = C60297Jiv.A01(A05);
        }
        this.A01.invoke(linkedHashMap);
    }
}
