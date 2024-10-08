package X;

import com.instagram.mediakit.model.MediaKitInsightType;

/* renamed from: X.JzA  reason: case insensitive filesystem */
public final class C61217JzA extends AnonymousClass0T0 implements C66551MWf {
    public final MediaKitInsightType A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61217JzA) {
                C61217JzA jzA = (C61217JzA) obj;
                if (this.A00 != jzA.A00 || !0qQ.A0K(this.A01, jzA.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public C61217JzA(MediaKitInsightType mediaKitInsightType, String str) {
        AnonymousClass7TG.A1O(mediaKitInsightType, str);
        this.A00 = mediaKitInsightType;
        this.A01 = str;
    }
}
