package X;

import com.instagram.model.shopping.clips.ClipsShoppingCTABarIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cn5  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44914Cn5 {
    public static Map A00(ClipsShoppingCTABarIntf clipsShoppingCTABarIntf) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (clipsShoppingCTABarIntf.Abn() != null) {
            A1H.put("animation_time_sec", AnonymousClass7TH.A0D(clipsShoppingCTABarIntf.Abn()));
        }
        if (clipsShoppingCTABarIntf.getCtaBarType() != null) {
            A1H.put("cta_bar_type", clipsShoppingCTABarIntf.getCtaBarType());
        }
        if (clipsShoppingCTABarIntf.getDestination() != null) {
            A1H.put("destination", clipsShoppingCTABarIntf.getDestination());
        }
        if (clipsShoppingCTABarIntf.getDominantColor() != null) {
            A1H.put("dominant_color", clipsShoppingCTABarIntf.getDominantColor());
        }
        if (clipsShoppingCTABarIntf.AzW() != null) {
            A1H.put("dwell_time_sec", clipsShoppingCTABarIntf.AzW());
        }
        if (clipsShoppingCTABarIntf.BgO() != null) {
            A1H.put("product_names", clipsShoppingCTABarIntf.BgO());
        }
        if (clipsShoppingCTABarIntf.getSubtitle() != null) {
            A1H.put("subtitle", clipsShoppingCTABarIntf.getSubtitle());
        }
        if (clipsShoppingCTABarIntf.getTitle() != null) {
            C41845B3m.A12(clipsShoppingCTABarIntf.getTitle(), A1H);
        }
        if (clipsShoppingCTABarIntf.getToggledDestination() != null) {
            A1H.put("toggled_destination", clipsShoppingCTABarIntf.getToggledDestination());
        }
        if (clipsShoppingCTABarIntf.getToggledTitle() != null) {
            A1H.put("toggled_title", clipsShoppingCTABarIntf.getToggledTitle());
        }
        return 0Yt.A0B(A1H);
    }
}
