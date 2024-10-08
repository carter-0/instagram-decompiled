package X;

import android.net.Uri;
import com.instagram.android.R;
import com.instagram.igds.components.banner.IgdsBanner;
import com.instagram.igds.components.headline.IgdsHeadline;

public final class FTY implements AnonymousClass57Y {
    public final int A00;
    public final Object A01;

    public FTY(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void FJw(Uri uri) {
        switch (this.A00) {
            case 0:
                C47429E1y.A00((C47429E1y) this.A01);
                return;
            case 1:
                return;
            default:
                C46656Dib dib = (C46656Dib) this.A01;
                C46354Dcy.A02(dib.A0V).A00 = true;
                if (dib.A11) {
                    IgdsHeadline igdsHeadline = (IgdsHeadline) dib.A03.findViewById(R.id.complete_your_profile_headline_title);
                    if (igdsHeadline != null) {
                        igdsHeadline.setCircularImageUrl(DbX.A0X(dib.A0V), (String) null);
                    }
                    C46656Dib.A06(dib);
                    return;
                }
                if (DbY.A1Y(0Tu.A05, dib.A0V, 36322680156203357L)) {
                    dib.A00 = uri;
                    C71662eb r0 = dib.A0Z;
                    if (r0 != null) {
                        r0.A02();
                    }
                    if (dib.A0Z == null) {
                        C71662eb A0S = DbY.A0S(dib.A03, R.id.broadcast_profile_photo_update_stub);
                        dib.A0Z = A0S;
                        IgdsBanner igdsBanner = (IgdsBanner) A0S.A01();
                        igdsBanner.setBody(2131954273);
                        igdsBanner.setAction(2131954272);
                        igdsBanner.A00 = new C50468FcG(dib, 9);
                    }
                    C71662eb r1 = dib.A0Z;
                    if (r1 != null) {
                        r1.A03(0);
                    }
                    C46656Dib.A0C(dib);
                    return;
                }
                DbT.A1J(dib);
                return;
        }
    }
}
