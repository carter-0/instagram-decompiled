package X;

import com.instagram.api.schemas.HighlightReelTypeStr;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;

/* renamed from: X.WSc  reason: case insensitive filesystem */
public final class C19269WSc implements C232262tL {
    public ImageUrl A00;
    public Reel A01;
    public String A02;
    public boolean A03 = false;
    public final String A04;
    public final boolean A05;
    public final boolean A06;

    public C19269WSc(ImageUrl imageUrl, Reel reel, String str) {
        this.A02 = str;
        this.A00 = imageUrl;
        this.A01 = reel;
        this.A04 = JTP.A0r(reel);
        Reel reel2 = this.A01;
        this.A06 = AnonymousClass7TF.A1W(reel2.A09, HighlightReelTypeStr.FAN_CLUB);
        this.A05 = reel2.A1D;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C19269WSc wSc = (C19269WSc) obj;
        0qQ.A0B(wSc, 0);
        return 0qQ.A0K(this.A04, wSc.A04);
    }
}
