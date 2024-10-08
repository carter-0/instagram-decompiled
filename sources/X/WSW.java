package X;

import com.instagram.common.typedurl.ImageUrl;

public final class WSW implements C232262tL {
    public final long A00;
    public final ImageUrl A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public WSW(ImageUrl imageUrl, String str, String str2, long j, boolean z) {
        0qQ.A0B(str2, 5);
        this.A00 = j;
        this.A03 = str;
        this.A01 = imageUrl;
        this.A04 = z;
        this.A02 = str2;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return Long.valueOf(this.A00);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        WSW wsw = (WSW) obj;
        0qQ.A0B(wsw, 0);
        if (!0qQ.A0K(this.A03, wsw.A03) || !0qQ.A0K(this.A01, wsw.A01) || this.A04 != wsw.A04 || !0qQ.A0K(this.A02, wsw.A02)) {
            return false;
        }
        return true;
    }
}
