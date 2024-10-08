package X;

import android.os.SystemClock;
import com.instagram.direct.visual.DirectVisualMessageViewerController;

/* renamed from: X.Ous  reason: case insensitive filesystem */
public final class C72018Ous implements AnonymousClass68Z {
    public final int A00;
    public final Object A01;

    public C72018Ous(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        switch (this.A00) {
            case 0:
                C70711OHg oHg = (C70711OHg) obj;
                0qQ.A0B(oHg, 0);
                NBH nbh = oHg.A01;
                if (nbh == null) {
                    return null;
                }
                return new PCK(nbh, C300325ww.A00(((DirectVisualMessageViewerController) this.A01).A0m), AnonymousClass7TE.A1E());
            case 6:
                C2597743a r2 = ((C68644NRa) this.A01).A00;
                r2.A00 = SystemClock.elapsedRealtime();
                OTU otu = C70111NxR.A00(r2.A03).A00;
                otu.getClass();
                return C72120Owf.A02(otu.A01, C74178PqK.A00(otu, 17), 63);
            case 7:
                OVP ovp = (OVP) this.A01;
                C257443xP r5 = (C257443xP) obj;
                if (!r5.A06() || !((1XQ) r5.A03()).isOk()) {
                    return new C72176Oxl("error");
                }
                ovp.A02 = Integer.valueOf(AnonymousClass7TG.A0A(((CFU) r5.A03()).A00));
                return new C66990MgO(OVP.A00(ovp));
            default:
                return ((0sP) this.A01).invoke(obj);
        }
    }
}
