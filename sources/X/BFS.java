package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.MediaNoticeIcon;

public final class BFS extends AnonymousClass0T0 implements DUN {
    public final MediaNoticeIcon A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final BFS F5v() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BFS) {
                BFS bfs = (BFS) obj;
                if (!0qQ.A0K(this.A01, bfs.A01) || this.A00 != bfs.A00 || !0qQ.A0K(this.A02, bfs.A02) || !0qQ.A0K(this.A03, bfs.A03) || !0qQ.A0K(this.A04, bfs.A04) || !0qQ.A0K(this.A05, bfs.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final MediaNoticeIcon BWb() {
        return this.A00;
    }

    public final String BoS() {
        return this.A05;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTMediaNoticeDict", CaF.A00(this));
    }

    public final String getMediaId() {
        return this.A01;
    }

    public final String getNoticeSubText() {
        return this.A02;
    }

    public final String getNoticeText() {
        return this.A03;
    }

    public final String getNoticeUrl() {
        return this.A04;
    }

    public final int hashCode() {
        return (((((((((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + C41845B3m.A00(this.A05);
    }

    public BFS(MediaNoticeIcon mediaNoticeIcon, String str, String str2, String str3, String str4, String str5) {
        this.A01 = str;
        this.A00 = mediaNoticeIcon;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = str5;
    }
}
