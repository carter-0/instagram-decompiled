package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ImmutablePandoMusicInfo;
import com.instagram.api.schemas.ImmutablePandoOriginalSoundData;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.MusicInfoImpl;
import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import java.util.List;

public final class CMW extends 17P implements AnonymousClass1dn {
    public MusicInfo A00;
    public OriginalSoundDataIntf A01;

    public final MusicInfo BUr() {
        MusicInfo musicInfo = this.A00;
        if (musicInfo == null) {
            return (MusicInfo) A05(-780321144, ImmutablePandoMusicInfo.class);
        }
        return musicInfo;
    }

    public final OriginalSoundDataIntf BZB() {
        OriginalSoundDataIntf originalSoundDataIntf = this.A01;
        if (originalSoundDataIntf == null) {
            return (OriginalSoundDataIntf) A05(1082512652, ImmutablePandoOriginalSoundData.class);
        }
        return originalSoundDataIntf;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.1dn, X.CMW] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, B4H.A00(this));
    }

    public final List BcV() {
        return A0n(1840235574);
    }

    public final AnonymousClass1dn E7k(1E9 r3) {
        MusicInfo BUr = BUr();
        OriginalSoundDataIntf originalSoundDataIntf = null;
        if (BUr != null) {
            BUr.E7j(r3);
        } else {
            BUr = null;
        }
        this.A00 = BUr;
        OriginalSoundDataIntf BZB = BZB();
        if (BZB != null) {
            BZB.E7q(r3);
            originalSoundDataIntf = BZB;
        }
        this.A01 = originalSoundDataIntf;
        return this;
    }

    public final 1dl F6X(1E9 r5) {
        MusicInfoImpl musicInfoImpl;
        MusicInfo BUr = BUr();
        OriginalSoundData originalSoundData = null;
        if (BUr != null) {
            musicInfoImpl = BUr.F6V(r5);
        } else {
            musicInfoImpl = null;
        }
        OriginalSoundDataIntf BZB = BZB();
        if (BZB != null) {
            originalSoundData = BZB.F7E(r5);
        }
        return new 1dl(musicInfoImpl, originalSoundData, A0n(1840235574));
    }

    public final 1dl F6Y(1E6 r2) {
        return F6X(C41846B3n.A0S(r2));
    }
}
