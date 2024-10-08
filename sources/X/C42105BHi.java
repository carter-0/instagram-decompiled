package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.BHi  reason: case insensitive filesystem */
public final class C42105BHi extends AnonymousClass0T0 implements C46267DSw {
    public final String A00;
    public final String A01;

    public final C42105BHi FCE() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42105BHi) {
                C42105BHi bHi = (C42105BHi) obj;
                if (!0qQ.A0K(this.A00, bHi.A00) || !0qQ.A0K(this.A01, bHi.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (getTitle() != null) {
            C41845B3m.A12(getTitle(), A1H);
        }
        if (getUrl() != null) {
            C41845B3m.A0y(getUrl(), A1H);
        }
        return C41845B3m.A0T("XDTSurveyCallToAction", 0Yt.A0B(A1H));
    }

    public final String getTitle() {
        return this.A00;
    }

    public final String getUrl() {
        return this.A01;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TE.A0O(this.A00));
    }

    public C42105BHi(String str, String str2) {
        AnonymousClass7TG.A1O(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }
}
