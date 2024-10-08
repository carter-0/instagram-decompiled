package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.MusicMuteAudioReason;
import com.instagram.api.schemas.OriginalAudioPartMetadataIntf;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.api.schemas.OriginalSoundConsumptionInfoIntf;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.model.MusicConsumptionModel;
import com.instagram.music.common.model.OriginalPartsAttributionModel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3ZJ  reason: invalid class name */
public abstract class AnonymousClass3ZJ {
    public static final Dc2 A01(Context context, UserSession userSession, ImageUrl imageUrl, C62320sa r7, boolean z) {
        0qQ.A0B(userSession, 0);
        C310336ap r3 = new C310336ap();
        Resources resources = context.getResources();
        int i = 2131972507;
        if (z) {
            i = 2131975987;
        }
        r3.A0D = resources.getString(i);
        if (imageUrl != null) {
            r3.A09 = imageUrl;
        } else {
            r3.A04 = new ColorDrawable(0);
        }
        r3.A03();
        if (!z && !182.A06(0Tu.A05, userSession, 36325806892528886L)) {
            String string = context.getString(2131972508);
            0qQ.A07(string);
            r3.A0G = string;
            r3.A0A(new WYD(r7));
            r3.A01();
        }
        return r3.A00();
    }

    public static final String A05(UserSession userSession, 1Xj r2) {
        C2606146j A02;
        0qQ.A0B(userSession, 1);
        if (r2 == null || (A02 = A02(userSession, r2)) == null) {
            return null;
        }
        return A02.getShouldMuteAudioReason();
    }

    public static final boolean A08(OriginalAudioSubtype originalAudioSubtype, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        if (originalAudioSubtype != OriginalAudioSubtype.A06 || !182.A06(0Tu.A05, userSession, 36321395961177412L)) {
            return false;
        }
        return true;
    }

    public static final boolean A09(C267324bN r3, UserSession userSession) {
        XB5 BUi;
        0qQ.A0B(userSession, 1);
        if (r3 == null) {
            return false;
        }
        if (GDZ.A01(r3.A01)) {
            C257853y4 r0 = r3.A06().A0I;
            if (r0 == null || (BUi = r0.BUi()) == null || BUi.getProgressiveDownloadUrl() == null) {
                1Xj r02 = r3.A02;
                if (r02 == null || !r02.CeS()) {
                    return false;
                }
            }
            return true;
        }
        if (!r3.A0V || A0D(userSession, r3.A02)) {
            return false;
        }
        return true;
    }

    public static final boolean A0D(UserSession userSession, 1Xj r4) {
        0qQ.A0B(userSession, 1);
        if (r4 == null) {
            return false;
        }
        if (r4.A5h() && r4.A0C.Aho() != null) {
            return true;
        }
        C2606146j A02 = A02(userSession, r4);
        if (A02 != null) {
            return A02.Esc();
        }
        return false;
    }

    public static final boolean A0E(UserSession userSession, 1Xj r6) {
        if (!r6.A4r()) {
            return false;
        }
        if (r6.A1J() != null) {
            0Tu r3 = 0Tu.A05;
            if (!182.A06(r3, userSession, 36325042388349509L) && !182.A06(r3, userSession, 36325042388546120L)) {
                return false;
            }
        }
        if (r6.A5D() && !r6.A4a()) {
            User A2A = r6.A2A(userSession);
            boolean A4a = r6.A4a();
            if (A4a) {
                return false;
            }
            if (AnonymousClass30D.A0H(userSession, A2A)) {
                return true;
            }
            182.A06(0Tu.A05, userSession, 36313987143436642L);
            return AnonymousClass30D.A0J(userSession, A2A, A4a);
        } else if (r6.A5D()) {
            return AnonymousClass30D.A07(userSession);
        } else {
            if (!AnonymousClass30D.A0H(userSession, r6.A2A(userSession))) {
                return 182.A06(0Tu.A05, userSession, 36313987142519129L);
            }
            return true;
        }
    }

    public static final boolean A0F(UserSession userSession, 1Xj r6, AnonymousClass3QO r7) {
        C67231sQ clipsMetadata;
        OriginalSoundDataIntf BZB;
        0qQ.A0B(r7, 0);
        AnonymousClass3QO r1 = AnonymousClass3QO.CLOSE_FRIENDS;
        if ((r7 != r1 && r7 != AnonymousClass3QO.FOLLOWERS_ONLY) || !r6.A5G() || (clipsMetadata = r6.A0C.getClipsMetadata()) == null || (BZB = clipsMetadata.BZB()) == null) {
            return true;
        }
        if (r7 != r1 || 182.A06(0Tu.A05, userSession, 36326545626773317L)) {
            return !BZB.getOriginalMediaId().equals(r6.A2n());
        }
        return false;
    }

    public static final C376489Ie A00(OriginalSoundDataIntf originalSoundDataIntf) {
        if (originalSoundDataIntf != null) {
            return new C376489Ie(originalSoundDataIntf.BYy(), A07(originalSoundDataIntf.Adj()), A07(originalSoundDataIntf.Adk()), originalSoundDataIntf.isAudioAutomaticallyAttributed());
        }
        return null;
    }

    public static final String A03(MusicInfo musicInfo, OriginalSoundDataIntf originalSoundDataIntf) {
        if (musicInfo == null) {
            return originalSoundDataIntf != null ? originalSoundDataIntf.getOriginalAudioTitle() : "";
        }
        String title = musicInfo.BUk().getTitle();
        if (title != null && title.length() != 0) {
            return title;
        }
        0wb.A01.Ew0("ClipsAudioUtil", 002.A0R("title is empty. audio_asset_id = ", musicInfo.BUk().getId()));
        return "";
    }

    public static final String A04(MusicInfo musicInfo, OriginalSoundDataIntf originalSoundDataIntf) {
        if (musicInfo != null) {
            String displayArtist = musicInfo.BUk().getDisplayArtist();
            if (displayArtist != null) {
                return displayArtist;
            }
        } else if (originalSoundDataIntf != null) {
            return originalSoundDataIntf.BEv().getUsername();
        }
        return "";
    }

    public static final String A06(1Xj r1) {
        String audioAssetId;
        if (r1 == null) {
            return null;
        }
        C2605946h A1O = r1.A1O();
        if (A1O != null && (audioAssetId = A1O.getAudioAssetId()) != null) {
            return audioAssetId;
        }
        OriginalSoundDataIntf A1J = r1.A1J();
        if (A1J != null) {
            return A1J.getAudioAssetId();
        }
        return null;
    }

    public static final List A07(List list) {
        if (list == null) {
            return 0sn.A00;
        }
        ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            OriginalAudioPartMetadataIntf originalAudioPartMetadataIntf = (OriginalAudioPartMetadataIntf) it.next();
            arrayList.add(new OriginalPartsAttributionModel(originalAudioPartMetadataIntf.C72(), originalAudioPartMetadataIntf.getDisplayArtist(), originalAudioPartMetadataIntf.getDisplayTitle(), originalAudioPartMetadataIntf.isExplicit()));
        }
        return arrayList;
    }

    public static final boolean A0B(C67231sQ r3) {
        int i;
        MusicInfo BUr;
        MusicConsumptionModel BUp;
        Boolean Cde;
        OriginalSoundDataIntf BZB;
        OriginalSoundConsumptionInfoIntf AqB;
        C2606046i A01;
        if (r3 == null || (A01 = C291335gz.A01(r3)) == null) {
            i = -1;
        } else {
            i = A01.Adv().ordinal();
        }
        if (i != 0) {
            if (i != 1 || r3 == null || (BZB = r3.BZB()) == null || (AqB = BZB.AqB()) == null) {
                return false;
            }
            return AqB.isTrendingInClips();
        } else if (r3 == null || (BUr = r3.BUr()) == null || (BUp = BUr.BUp()) == null || (Cde = BUp.Cde()) == null) {
            return false;
        } else {
            return Cde.booleanValue();
        }
    }

    public static final C2606146j A02(UserSession userSession, 1Xj r7) {
        boolean A0I;
        OriginalSoundDataIntf BZB;
        MusicConsumptionModel BUp;
        if (r7.A5G()) {
            C67231sQ clipsMetadata = r7.A0C.getClipsMetadata();
            if (clipsMetadata == null) {
                return null;
            }
            if (clipsMetadata.BUr() != null) {
                MusicInfo BUr = clipsMetadata.BUr();
                if (BUr == null || (BUp = BUr.BUp()) == null) {
                    return null;
                }
                return new C263294Kc(BUp);
            } else if (clipsMetadata.BZB() == null || (BZB = clipsMetadata.BZB()) == null) {
                return null;
            } else {
                return new C282025Bc(BZB);
            }
        } else {
            User CCd = r7.A0C.CCd();
            C2605946h A1O = r7.A1O();
            OriginalSoundDataIntf A1J = r7.A1J();
            boolean A5D = r7.A5D();
            boolean A4a = r7.A4a();
            boolean z = false;
            if (!A5D) {
                A0I = AnonymousClass30D.A0I(userSession, CCd);
            } else if (!A4a) {
                A0I = AnonymousClass30D.A0J(userSession, CCd, false);
            } else {
                A0I = AnonymousClass30D.A07(userSession);
            }
            if (A0I && AnonymousClass30D.A0G(userSession)) {
                z = true;
            }
            if (A1O != null && A0I) {
                MusicConsumptionModel BUp2 = A1O.A00.BUp();
                0qQ.A0B(BUp2, 0);
                return new C263294Kc(BUp2);
            } else if (A1J == null || !z) {
                return null;
            } else {
                return new C282025Bc(A1J);
            }
        }
    }

    public static final boolean A0A(C67231sQ r2) {
        MusicInfo BUr = r2.BUr();
        OriginalSoundDataIntf BZB = r2.BZB();
        if (BUr != null) {
            return BUr.BUk().isExplicit();
        }
        if (BZB != null) {
            return BZB.isExplicit();
        }
        return false;
    }

    public static final boolean A0C(UserSession userSession, 1Xj r3) {
        C2605946h A1O;
        if (A0D(userSession, r3)) {
            MusicMuteAudioReason musicMuteAudioReason = null;
            if (!(r3 == null || (A1O = r3.A1O()) == null)) {
                musicMuteAudioReason = A1O.BuG();
            }
            if (musicMuteAudioReason != MusicMuteAudioReason.A05) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean A0G(1Xj r2) {
        OriginalAudioSubtype originalAudioSubtype;
        OriginalSoundDataIntf A1J = r2.A1J();
        if (A1J != null) {
            originalAudioSubtype = A1J.BYy();
        } else {
            originalAudioSubtype = null;
        }
        if (originalAudioSubtype == OriginalAudioSubtype.A06) {
            return true;
        }
        return false;
    }
}
