package X;

import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicBrowseCategory;
import com.instagram.music.common.model.MusicSearchPlaylist;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.Lud  reason: case insensitive filesystem */
public final class C65515Lud implements C66542MVw {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C3499682q A01;
    public final /* synthetic */ MusicBrowseCategory A02;
    public final /* synthetic */ Map A03;
    public final /* synthetic */ C62320sa A04;
    public final /* synthetic */ 0sP A05;

    public final 1OC ANA(1NU r13, Integer num, Long l, Object obj, String str) {
        0qQ.A0B(num, 1);
        LSH lsh = LSH.A02;
        UserSession userSession = this.A00;
        MusicBrowseCategory musicBrowseCategory = this.A02;
        return lsh.A02(MusicProduct.MUSIC_IN_FEED, userSession, r13, musicBrowseCategory, num, l, str, String.valueOf(((JWE) this.A01).A01.A07), (String) null, this.A03);
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

    public C65515Lud(UserSession userSession, C3499682q r2, MusicBrowseCategory musicBrowseCategory, Map map, C62320sa r5, 0sP r6) {
        this.A00 = userSession;
        this.A02 = musicBrowseCategory;
        this.A01 = r2;
        this.A03 = map;
        this.A05 = r6;
        this.A04 = r5;
    }

    public final void DeK(C268654dm r2, int i) {
        this.A04.invoke();
    }

    public final void Dew(C66446MSa mSa, Object obj, int i, boolean z, boolean z2) {
        List list;
        MusicSearchPlaylist musicSearchPlaylist;
        List<JZC> A15;
        String str;
        List list2 = mSa.F04().A05;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list2) {
            MusicSearchPlaylist musicSearchPlaylist2 = ((JZC) next).A0E;
            if (musicSearchPlaylist2 != null) {
                str = JTP.A0s(musicSearchPlaylist2);
            } else {
                str = null;
            }
            JTR.A1P(str, "2282005535164995", next, A1C);
        }
        JZC jzc = (JZC) 00k.A0J(A1C);
        if (jzc == null || (musicSearchPlaylist = jzc.A0E) == null || (A15 = JTO.A15(musicSearchPlaylist.A01)) == null) {
            list = 0sn.A00;
        } else {
            ArrayList A0r = AnonymousClass7TG.A0r(A15);
            for (JZC A002 : A15) {
                C66569MWx A003 = A002.A00();
                0qQ.A0C(A003, "null cannot be cast to non-null type com.instagram.music.common.model.MusicSearchTrack");
                A0r.add(A003);
            }
            list = 00k.A0X(A0r);
        }
        this.A05.invoke(list);
    }
}
