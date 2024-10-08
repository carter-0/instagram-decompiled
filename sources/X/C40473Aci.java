package X;

import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.Aci  reason: case insensitive filesystem */
public final class C40473Aci implements C74328Pt4 {
    public final /* synthetic */ C329817Ki A00;
    public final /* synthetic */ IgProgressImageView A01;

    public C40473Aci(C329817Ki r1, IgProgressImageView igProgressImageView) {
        this.A00 = r1;
        this.A01 = igProgressImageView;
    }

    public final void D53(Object obj) {
        0qQ.A0B(obj, 0);
        C329817Ki r3 = this.A00;
        r3.A00 = null;
        this.A01.setUrl(new SimpleImageUrl((String) obj), r3.A03);
    }
}
