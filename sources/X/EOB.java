package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.hashtag.HashtagImpl;
import com.instagram.model.hashtag.ImmutablePandoHashtag;

public final class EOB extends 17P implements C255253tp {
    public final Hashtag BCW() {
        return (Hashtag) A05(697547724, ImmutablePandoHashtag.class);
    }

    public final C255233tn CCb() {
        return (C255233tn) A07(EOC.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.3tp, X.EOB] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C46337Dcf.A00(this));
    }

    public final C255243to F5Q() {
        HashtagImpl hashtagImpl;
        Hashtag BCW = BCW();
        C255223tm r2 = null;
        if (BCW != null) {
            hashtagImpl = BCW.FEY();
        } else {
            hashtagImpl = null;
        }
        C255233tn CCb = CCb();
        if (CCb != null) {
            r2 = CCb.F5R();
        }
        return new C255243to(r2, hashtagImpl);
    }
}
