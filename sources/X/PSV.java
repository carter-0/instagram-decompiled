package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.widget.IgProgressImageView;

public final class PSV implements 1aV {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    public PSV(int i, Object obj, Object obj2, boolean z) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = z;
        this.A01 = obj2;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.A00) {
            case 0:
                C331527Ri r6 = (C331527Ri) obj;
                0qQ.A0B(r6, 0);
                C66633Ma2 ma2 = (C66633Ma2) this.A02;
                UserSession A0p = ma2.A0p();
                C69966Nv6.A00(ma2.A1J, A0p, r6, (C331537Rj) this.A01, !this.A03);
                return;
            case 1:
                ImageUrl imageUrl = (ImageUrl) obj;
                0qQ.A0B(imageUrl, 0);
                PBS pbs = (PBS) this.A01;
                boolean z = this.A03;
                IgProgressImageView igProgressImageView = pbs.A03;
                igProgressImageView.setUrl(imageUrl, ((C72546PAd) this.A02).A00);
                pbs.A01.setVisibility(0);
                igProgressImageView.setVisibility(0);
                float f = 1.0f;
                if (z) {
                    f = 0.5f;
                }
                igProgressImageView.setAlpha(f);
                return;
            default:
                return;
        }
    }
}
