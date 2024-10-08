package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CdN  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44341CdN {
    public static Map A00(AnonymousClass3II r3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (r3.ApN() != null) {
            DU7 ApN = r3.ApN();
            if (ApN != null) {
                treeUpdaterJNI = ApN.FHC();
            }
            A1H.put(AnonymousClass000.A00(1208), treeUpdaterJNI);
        }
        if (r3.getCtaText() != null) {
            A1H.put("cta_text", r3.getCtaText());
        }
        if (r3.BEY() != null) {
            C41845B3m.A0x(r3.BEY(), A1H);
        }
        1Xj BPf = r3.BPf();
        if (BPf != null) {
            A1H.put("media", BPf.A1C());
        }
        if (r3.BVq() != null) {
            A1H.put("netego_title", r3.BVq());
        }
        if (r3.getSubtitle() != null) {
            A1H.put("subtitle", r3.getSubtitle());
        }
        if (r3.getTitle() != null) {
            C41845B3m.A12(r3.getTitle(), A1H);
        }
        if (r3.C9L() != null) {
            A1H.put("tracking_token", r3.C9L());
        }
        return 0Yt.A0B(A1H);
    }
}
