package X;

import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.TrackData;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.GPn  reason: case insensitive filesystem */
public abstract class C52366GPn {
    public static final ImageUrl A00(AnonymousClass1dn r1) {
        User BEv;
        TrackData BUk;
        ImageUrl Arr;
        MusicInfo BUr = r1.BUr();
        if (BUr != null && (BUk = BUr.BUk()) != null && (Arr = BUk.Arr()) != null) {
            return Arr;
        }
        OriginalSoundDataIntf BZB = r1.BZB();
        if (BZB == null || (BEv = BZB.BEv()) == null) {
            return null;
        }
        return BEv.A0D();
    }
}
