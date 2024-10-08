package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.BFi  reason: case insensitive filesystem */
public final class C42055BFi extends AnonymousClass0T0 implements C46255DSk {
    public final String A00;
    public final List A01;

    public final C42055BFi F7N() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42055BFi) {
                C42055BFi bFi = (C42055BFi) obj;
                if (!0qQ.A0K(this.A00, bFi.A00) || !0qQ.A0K(this.A01, bFi.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final List Ba5() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (getMediaId() != null) {
            C41845B3m.A13(getMediaId(), A1H);
        }
        if (Ba5() != null) {
            A1H.put("pac_ad_media_ids", Ba5());
        }
        return C41845B3m.A0T("XDTPACAdSocialFeedbackAggregationInfo", 0Yt.A0B(A1H));
    }

    public final String getMediaId() {
        return this.A00;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0O(this.A00));
    }

    public C42055BFi(String str, List list) {
        AnonymousClass7TG.A1O(str, list);
        this.A00 = str;
        this.A01 = list;
    }
}
