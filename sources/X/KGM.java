package X;

import android.net.Uri;
import com.instagram.common.typedurl.ImageUrl;

public final class KGM extends AnonymousClass4AA {
    public final Uri A00;
    public final AnonymousClass0iw A01;
    public final ImageUrl A02;
    public final Integer A03;
    public final String A04;
    public final boolean A05 = true;

    public KGM(Uri uri, AnonymousClass0iw r3, ImageUrl imageUrl, Integer num, String str) {
        0qQ.A0B(str, 1);
        this.A04 = str;
        this.A03 = num;
        this.A01 = r3;
        this.A00 = uri;
        this.A02 = imageUrl;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        KGM kgm = (KGM) obj;
        0qQ.A0B(kgm, 0);
        if (!0qQ.A0K(this.A04, kgm.A04) || !0qQ.A0K(this.A00, kgm.A00) || !0qQ.A0K(this.A02, kgm.A02) || this.A03 != kgm.A03 || this.A05 != kgm.A05) {
            return false;
        }
        return true;
    }
}
