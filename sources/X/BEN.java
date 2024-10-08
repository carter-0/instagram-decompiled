package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class BEN extends AnonymousClass0T0 implements C269834fl {
    public final String A00;

    public final BEN F1y() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof BEN) && 0qQ.A0K(this.A00, ((BEN) obj).A00));
    }

    public final String BGT() {
        return this.A00;
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0E(this.A00);
    }

    public BEN(String str) {
        this.A00 = str;
    }

    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        String str = this.A00;
        if (str != null) {
            A0t.put("imagine_create_media_url", str);
        }
        return C41845B3m.A0T("XDTCommentImagineCreateMediaInfo", 0Yt.A0B(A0t));
    }
}
