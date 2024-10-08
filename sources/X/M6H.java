package X;

import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public final class M6H implements Runnable {
    public final /* synthetic */ C59811JZf A00;
    public final /* synthetic */ Map A01;

    public M6H(C59811JZf jZf, Map map) {
        this.A00 = jZf;
        this.A01 = map;
    }

    public final void run() {
        C62476KgR kgR;
        C59811JZf jZf = this.A00;
        SpinnerImageView spinnerImageView = jZf.A04;
        if (spinnerImageView != null) {
            JTO.A1X(spinnerImageView);
        }
        C59810JZe jZe = jZf.A0G;
        Map map = this.A01;
        Collection<C376649Iu> values = map.values();
        ArrayList A0r = AnonymousClass7TG.A0r(values);
        for (C376649Iu r0 : values) {
            C317876nz r9 = (C317876nz) r0.A00;
            if (r0.A01 == null) {
                kgR = C62476KgR.A03;
            } else if (0qQ.A0K(jZf.A05, r9.A0Z)) {
                kgR = C62476KgR.PLAYING;
            } else {
                kgR = C62476KgR.LOADED;
            }
            A0r.add(new KKA(kgR, r9, jZf.A0N, jZf.A0O, jZf.A06));
        }
        jZe.A05.clear();
        jZe.A01(A0r);
        if (jZf.A0F == C62496Kgm.GALLERY_SAVED && (!map.values().isEmpty())) {
            AnonymousClass7TH.A0R(jZf.A01);
        }
    }
}
