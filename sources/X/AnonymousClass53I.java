package X;

import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.direct.gifs.DirectAnimatedMediaUser;
import com.instagram.model.mediasize.GifUrlImpl;

/* renamed from: X.53I  reason: invalid class name */
public abstract class AnonymousClass53I {
    public static final DirectAnimatedMedia A00(DirectAnimatedMedia directAnimatedMedia) {
        0qQ.A0B(directAnimatedMedia, 0);
        String str = directAnimatedMedia.A05;
        GifUrlImpl gifUrlImpl = directAnimatedMedia.A02;
        boolean z = directAnimatedMedia.A06;
        DirectAnimatedMediaUser directAnimatedMediaUser = directAnimatedMedia.A01;
        Boolean bool = directAnimatedMedia.A03;
        0qQ.A0B(str, 0);
        0qQ.A0B(gifUrlImpl, 1);
        return new DirectAnimatedMedia(directAnimatedMediaUser, gifUrlImpl, true, bool, str, z);
    }

    public static final DirectAnimatedMedia A01(AnonymousClass53G r8) {
        AnonymousClass9IE r0;
        GifUrlImpl gifUrlImpl;
        if (r8 == null || (r0 = r8.A00) == null || (gifUrlImpl = (GifUrlImpl) r0.A00) == null) {
            return null;
        }
        String str = r8.A04;
        return new DirectAnimatedMedia(r8.A01, gifUrlImpl, r8.A03, r8.A02, str, r8.A05);
    }
}
