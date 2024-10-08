package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.venue.Venue;

/* renamed from: X.WSr  reason: case insensitive filesystem */
public final class C19283WSr implements C232262tL, X1R {
    public final ImageUrl A00;
    public final C15260UXv A01;
    public final Venue A02;
    public final boolean A03;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02.A05();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C19283WSr wSr = (C19283WSr) obj;
        0qQ.A0B(wSr, 0);
        if (!0qQ.A0K(this.A02, wSr.A02) || !2PP.A00(this.A00, wSr.A00) || !2PP.A00(this.A01, wSr.A01)) {
            return false;
        }
        return true;
    }

    public C19283WSr(ImageUrl imageUrl, C15260UXv uXv, Venue venue, boolean z) {
        this.A02 = venue;
        this.A03 = z;
        this.A00 = imageUrl;
        this.A01 = uXv;
    }
}
