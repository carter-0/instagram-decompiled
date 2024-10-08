package X;

import com.instagram.api.schemas.InstagramMidcardType;
import com.instagram.api.schemas.MidCardLayoutType;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public final class GEE {
    public final 0eP A01(C267324bN r6) {
        int i;
        boolean z;
        int A0t;
        boolean z2;
        boolean z3;
        int i2;
        List list;
        MidCardLayoutType midCardLayoutType;
        C53449Goh goh;
        MidCardLayoutType midCardLayoutType2;
        C53452Gok gok = r6.A01().A06;
        C53332GmI A01 = r6.A01();
        if (gok != null) {
            InstagramMidcardType instagramMidcardType = A01.A05;
            InstagramMidcardType instagramMidcardType2 = InstagramMidcardType.A0C;
            MidCardLayoutType midCardLayoutType3 = null;
            C53452Gok gok2 = r6.A01().A06;
            if (instagramMidcardType == instagramMidcardType2) {
                if (gok2 != null) {
                    midCardLayoutType2 = gok2.A07;
                } else {
                    midCardLayoutType2 = null;
                }
                z3 = true;
                if (midCardLayoutType2 != MidCardLayoutType.MEGA_CARD) {
                    C53452Gok gok3 = r6.A01().A06;
                    if (gok3 != null) {
                        midCardLayoutType3 = gok3.A07;
                    }
                    if (midCardLayoutType3 != MidCardLayoutType.GRID) {
                        A0t = 1;
                    }
                }
                list = r6.A01().A0F;
                if (list == null) {
                    i2 = 4;
                    A0t = Integer.valueOf(i2);
                }
                i2 = list.size();
                A0t = Integer.valueOf(i2);
            } else {
                if (gok2 != null) {
                    midCardLayoutType = gok2.A07;
                } else {
                    midCardLayoutType = null;
                }
                z3 = false;
                if (midCardLayoutType != MidCardLayoutType.MEGA_CARD) {
                    C53452Gok gok4 = r6.A01().A06;
                    if (gok4 != null) {
                        midCardLayoutType3 = gok4.A07;
                    }
                    if (midCardLayoutType3 != MidCardLayoutType.GRID) {
                        list = r6.A01().A0H;
                        i2 = list.size();
                        A0t = Integer.valueOf(i2);
                    }
                }
                C53452Gok gok5 = r6.A01().A06;
                if (gok5 == null || (goh = gok5.A06) == null || (list = goh.A08) == null) {
                    i2 = 3;
                    A0t = Integer.valueOf(i2);
                }
                i2 = list.size();
                A0t = Integer.valueOf(i2);
            }
            z2 = Boolean.valueOf(z3);
        } else {
            int ordinal = A01.A05.ordinal();
            if (ordinal == 33 || ordinal == 12) {
                i = 1;
                z = true;
            } else if (ordinal == 6 || ordinal == 28 || ordinal == 37) {
                A0t = C51968G9o.A0t(r6.A01().A0H);
                z2 = false;
            } else {
                i = 3;
                z = false;
            }
            return AnonymousClass7TE.A1L(i, z);
        }
        return AnonymousClass7TE.A1L(A0t, z2);
    }

    public static final boolean A00(ClipsViewerSource clipsViewerSource, UserSession userSession, String str, boolean z) {
        DbY.A1S(str, userSession);
        List<ClipsViewerSource> list = C52213GJe.A03;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (ClipsViewerSource clipsViewerSource2 : list) {
            A0r.add(002.A0R("clips_viewer_", clipsViewerSource2.A00));
        }
        if (A0r.contains(str) && z) {
            return true;
        }
        if (clipsViewerSource == null || clipsViewerSource != ClipsViewerSource.REEL_FEED_TIMELINE || !182.A06(0Tu.A05, userSession, 36319540535238104L)) {
            return false;
        }
        return true;
    }
}
