package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;

/* renamed from: X.N5h  reason: case insensitive filesystem */
public final class C68192N5h extends AnonymousClass0T0 implements C232262tL {
    public final ImageUrl A00;
    public final PrivacyMediaOverlayViewModel A01;
    public final String A02;

    public C68192N5h(ImageUrl imageUrl, PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel, String str) {
        0qQ.A0B(imageUrl, 1);
        this.A00 = imageUrl;
        this.A02 = str;
        this.A01 = privacyMediaOverlayViewModel;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68192N5h) {
                C68192N5h n5h = (C68192N5h) obj;
                if (!0qQ.A0K(this.A00, n5h.A00) || !0qQ.A0K(this.A02, n5h.A02) || !0qQ.A0K(this.A01, n5h.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.toString();
    }

    public final int hashCode() {
        return ((AnonymousClass7TE.A0K(this.A00) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C68192N5h n5h = (C68192N5h) obj;
        0qQ.A0B(n5h, 0);
        if (!0qQ.A0K(this.A00, n5h.A00) || !0qQ.A0K(this.A02, n5h.A02) || !0qQ.A0K(this.A01, n5h.A01)) {
            return false;
        }
        return true;
    }
}
