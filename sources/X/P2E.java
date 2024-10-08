package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.music.common.model.MusicOverlayStickerModel;

public final class P2E implements C74392Pu8 {
    public final Object AWj(OU2 ou2) {
        float f;
        1iA r10;
        OU2 ou22 = ou2;
        0qQ.A0B(ou22, 0);
        Object value = ou22.A04.getValue();
        Number A0r = C66580MXl.A0r(ou22.A05);
        if (value == null || A0r == null) {
            return null;
        }
        Number A0r2 = C66580MXl.A0r(ou22.A0C);
        Number A0r3 = C66580MXl.A0r(ou22.A0B);
        int intValue = A0r.intValue();
        int i = 1;
        boolean A1S = AnonymousClass7TF.A1S(4, intValue);
        int A06 = C66582MXn.A06(A0r2);
        if (A0r3 == null || (i = A0r3.intValue()) != 0) {
            f = ((float) A06) / ((float) i);
        } else {
            f = 1.0f;
        }
        Integer num = AnonymousClass05K.A01;
        AnonymousClass3WR A00 = new C271394im(num, "").A00();
        boolean z = !A1S;
        if (A1S) {
            r10 = 1iA.A0a;
        } else {
            r10 = 1iA.A0Q;
        }
        C271434iq r4 = new C271434iq(C71816OrJ.A00, (ImageUrl) null, (C271424ip) null, (CreativeConfigIntf) null, (ImageInfo) null, r10, (MusicOverlayStickerModel) null, A00, num, (Long) null, (Long) null, (Long) null, (String) null, "organic", (String) null, (String) null, (String) null, (String) null, 0sn.A00, f, 1640937600000L, false, A1S, false, false, false, false, z, A1S);
        C271374ik r0 = new C271374ik();
        r0.A04 = r4;
        return r0;
    }

    public final 2FW BZu(OU2 ou2) {
        return 2FW.A0q;
    }
}
