package X;

import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicBrowseCategory;
import com.instagram.music.common.model.MusicSearchPlaylist;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Luc  reason: case insensitive filesystem */
public final class C65514Luc implements C66542MVw {
    public final /* synthetic */ MusicProduct A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C353548Ib A02;
    public final /* synthetic */ MusicBrowseCategory A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public final 1OC ANA(1NU r12, Integer num, Long l, Object obj, String str) {
        0qQ.A0B(num, 1);
        LSH lsh = LSH.A02;
        UserSession userSession = this.A01;
        MusicBrowseCategory musicBrowseCategory = this.A03;
        return lsh.A02(this.A00, userSession, r12, musicBrowseCategory, num, l, str, this.A04, (String) null, this.A05);
    }

    public final Object BnI() {
        return null;
    }

    public final boolean CKd() {
        return false;
    }

    public final /* synthetic */ void DTq(String str, Object obj, int i) {
    }

    public final /* synthetic */ void DTr(int i, Object obj, boolean z) {
    }

    public final void DeK(C268654dm r1, int i) {
    }

    public final void DeV(Object obj, int i) {
    }

    public final void Del(Object obj, int i) {
    }

    public final boolean Et6() {
        return false;
    }

    public final boolean EtB() {
        return false;
    }

    public C65514Luc(MusicProduct musicProduct, UserSession userSession, C353548Ib r3, MusicBrowseCategory musicBrowseCategory, String str, Map map) {
        this.A01 = userSession;
        this.A03 = musicBrowseCategory;
        this.A00 = musicProduct;
        this.A04 = str;
        this.A05 = map;
        this.A02 = r3;
    }

    public final void Dew(C66446MSa mSa, Object obj, int i, boolean z, boolean z2) {
        Object obj2;
        Object obj3;
        MusicSearchPlaylist musicSearchPlaylist;
        List A15;
        List A152;
        if (z) {
            C353548Ib r4 = this.A02;
            Iterator it = mSa.F04().A05.iterator();
            while (true) {
                obj2 = null;
                if (!it.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it.next();
                MusicSearchPlaylist musicSearchPlaylist2 = ((JZC) obj3).A0E;
                if (musicSearchPlaylist2 != null && (A152 = JTO.A15(musicSearchPlaylist2.A01)) != null && AnonymousClass7TE.A1b(A152)) {
                    break;
                }
            }
            JZC jzc = (JZC) obj3;
            if (!(jzc == null || (musicSearchPlaylist = jzc.A0E) == null || (A15 = JTO.A15(musicSearchPlaylist.A01)) == null)) {
                obj2 = 00k.A0J(A15);
            }
            r4.A01.Epw(obj2);
        }
    }
}
