package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.api.schemas.IGMusicArtistPinningErrorType;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.common.session.UserSession;

public abstract class GKS {
    public static final void A01(Context context, UserSession userSession, 1Xj r7) {
        boolean A1b = C51973G9u.A1b(context, userSession, r7);
        C310336ap A0a = DbS.A0a();
        A0a.A0C(C310346aq.SUCCESS);
        DbS.A19(context, A0a, 2131953202);
        A0a.A02 = context.getResources().getDimensionPixelOffset(R.dimen.abc_alert_dialog_button_dimen);
        DbY.A1N(A0a);
        r7.A0C.EOv(false);
        1E7.A00(userSession).A01(r7, A1b, false);
        AnonymousClass1Nd.A00(userSession).A00(new C57069INj(r7));
    }

    public static final boolean A02(UserSession userSession, 1Xj r9) {
        OriginalSoundDataIntf originalSoundDataIntf;
        C2606046i r3;
        MusicInfo BUr;
        OriginalSoundDataIntf BZB;
        C67231sQ A0n = C51966G9m.A0n(r9);
        if (A0n != null) {
            originalSoundDataIntf = A0n.BZB();
        } else {
            originalSoundDataIntf = null;
        }
        boolean A1V = AnonymousClass7TF.A1V(originalSoundDataIntf);
        String str = null;
        C67231sQ A0n2 = C51966G9m.A0n(r9);
        if (A1V) {
            if (!(A0n2 == null || (BZB = A0n2.BZB()) == null)) {
                r3 = new C282025Bc(BZB);
            }
            r3 = null;
        } else {
            if (!(A0n2 == null || (BUr = A0n2.BUr()) == null)) {
                r3 = new C2605946h(BUr);
            }
            r3 = null;
        }
        boolean A1Y = AnonymousClass7TF.A1Y(r9.A0C.COt(), true);
        String str2 = userSession.A06;
        if (r3 != null) {
            str = r3.getArtistId();
        }
        boolean A0K = 0qQ.A0K(str2, str);
        boolean A0K2 = 0qQ.A0K(str2, C51972G9s.A0q(userSession, r9));
        boolean A1V2 = AnonymousClass7TF.A1V(r9.A0C.BQf());
        if (A1Y || !A0K || A0K2 || A1V2) {
            return false;
        }
        if (A1V) {
            return 182.A06(0Tu.A05, userSession, 36316027252248431L);
        }
        return true;
    }

    public static final boolean A03(UserSession userSession, 1Xj r9) {
        OriginalSoundDataIntf originalSoundDataIntf;
        boolean z;
        C2606046i r1;
        MusicInfo BUr;
        OriginalSoundDataIntf BZB;
        C67231sQ A0n = C51966G9m.A0n(r9);
        String str = null;
        if (A0n != null) {
            originalSoundDataIntf = A0n.BZB();
        } else {
            originalSoundDataIntf = null;
        }
        if (originalSoundDataIntf != null) {
            z = true;
            C67231sQ A0n2 = C51966G9m.A0n(r9);
            if (A0n2 == null || (BZB = A0n2.BZB()) == null) {
                r1 = null;
            } else {
                r1 = new C282025Bc(BZB);
            }
        } else {
            z = false;
            C67231sQ A0n3 = C51966G9m.A0n(r9);
            if (A0n3 == null || (BUr = A0n3.BUr()) == null) {
                r1 = null;
            } else {
                r1 = new C2605946h(BUr);
            }
        }
        boolean A1Y = AnonymousClass7TF.A1Y(r9.A0C.COt(), true);
        String str2 = userSession.A06;
        if (r1 != null) {
            str = r1.getArtistId();
        }
        boolean A0K = 0qQ.A0K(str2, str);
        boolean A0K2 = 0qQ.A0K(str2, C51972G9s.A0q(userSession, r9));
        if (!A1Y) {
            return false;
        }
        if (z) {
            if (A0K && 182.A06(0Tu.A05, userSession, 36316027252248431L)) {
                return true;
            }
        } else if (A0K) {
            return true;
        }
        if (!A0K2) {
            return false;
        }
        return true;
    }

    public static final boolean A04(UserSession userSession, 1Xj r8) {
        OriginalSoundDataIntf originalSoundDataIntf;
        0qQ.A0B(userSession, 1);
        C67231sQ clipsMetadata = r8.A0C.getClipsMetadata();
        String str = null;
        if (clipsMetadata != null) {
            originalSoundDataIntf = clipsMetadata.BZB();
        } else {
            originalSoundDataIntf = null;
        }
        boolean z = false;
        if (originalSoundDataIntf != null) {
            z = true;
        }
        String str2 = userSession.A06;
        C2605946h A1O = r8.A1O();
        if (A1O != null) {
            str = A1O.getArtistId();
        }
        boolean A0K = 0qQ.A0K(str2, str);
        if (!0qQ.A0K(r8.A0C.COt(), true)) {
            return false;
        }
        if (!z || 182.A06(0Tu.A05, userSession, 36316027252182894L) || (182.A06(0Tu.A06, userSession, 36316027252248431L) && A0K)) {
            return true;
        }
        return false;
    }

    public static final int A00(String str) {
        if (str.equals(IGMusicArtistPinningErrorType.INVALID_AUDIO.A00)) {
            return 2131953192;
        }
        if (str.equals(IGMusicArtistPinningErrorType.MEDIA_ALREADY_PINNED.A00)) {
            return 2131953194;
        }
        if (str.equals(IGMusicArtistPinningErrorType.HAS_MAX_PINNED.A00)) {
            return 2131953193;
        }
        if (str.equals(IGMusicArtistPinningErrorType.MEDIA_NOT_PINNED.A00)) {
            return 2131953195;
        }
        if (str.equals(IGMusicArtistPinningErrorType.VIEWER_NOT_OWNER.A00)) {
            return 2131953199;
        }
        if (str.equals(IGMusicArtistPinningErrorType.VIEWER_OWNS_REEL.A00)) {
            return 2131953196;
        }
        return 2131953203;
    }
}
