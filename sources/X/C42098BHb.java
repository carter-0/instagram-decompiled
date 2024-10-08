package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.BHb  reason: case insensitive filesystem */
public final class C42098BHb extends AnonymousClass0T0 implements DSB {
    public final String A00;

    public final C42098BHb FBz() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C42098BHb) && 0qQ.A0K(this.A00, ((C42098BHb) obj).A00));
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0E(this.A00);
    }

    public C42098BHb(String str) {
        this.A00 = str;
    }

    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        String str = this.A00;
        if (str != null) {
            A0t.put("whatsapp_deeplink_url", str);
        }
        return C41845B3m.A0T("XDTStoryWhatsAppStickerTappableData", 0Yt.A0B(A0t));
    }
}
