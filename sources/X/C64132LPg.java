package X;

import android.content.Context;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.VideoSession;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LPg  reason: case insensitive filesystem */
public abstract class C64132LPg {
    public static final void A00(Context context, UserSession userSession, MediaCaptureConfig mediaCaptureConfig, AudioOverlayTrack audioOverlayTrack, AnonymousClass3Q2 r14, C267834cI r15, String str, List list, boolean z, boolean z2) {
        AnonymousClass3Q2 BbQ;
        MusicAssetModel musicAssetModel;
        AnonymousClass3Q2 BbQ2;
        UserSession userSession2 = userSession;
        String str2 = str;
        AnonymousClass7TF.A1E(userSession, 3, str2);
        if (mediaCaptureConfig != null) {
            mediaCaptureConfig.A00 = null;
        }
        Context context2 = context;
        AnonymousClass3Q2 r5 = r14;
        C267834cI r6 = r15;
        List<VideoSession> list2 = list;
        boolean z3 = z;
        boolean z4 = z2;
        if (audioOverlayTrack == null || (musicAssetModel = audioOverlayTrack.A08) == null) {
            A01(context2, userSession2, r5, r6, list2, z3, false, z4);
            if (r14 != null) {
                r14.A1J = null;
            }
            for (VideoSession videoSession : list2) {
                if (!(r15 == null || (BbQ = r15.BbQ(videoSession.A0G)) == null)) {
                    BbQ.A5C = false;
                }
            }
            return;
        }
        MusicOverlayStickerModel A01 = C59670JTa.A01(MusicProduct.MUSIC_IN_FEED, audioOverlayTrack, musicAssetModel, str2);
        A01(context2, userSession2, r5, r6, list2, z3, true, z4);
        if (r14 != null) {
            r14.A1J = A01;
        }
        for (VideoSession videoSession2 : list2) {
            if (!(r15 == null || (BbQ2 = r15.BbQ(videoSession2.A0G)) == null)) {
                BbQ2.A5C = true;
            }
        }
    }

    public static final boolean A02(UserSession userSession, AnonymousClass36W r3, boolean z, boolean z2) {
        0qQ.A0B(userSession, 1);
        if ((z || AnonymousClass30D.A0K(userSession, z2, true)) && r3 == AnonymousClass36W.FOLLOWERS_SHARE && AnonymousClass30D.A04(userSession)) {
            return true;
        }
        return false;
    }

    public static final void A01(Context context, UserSession userSession, AnonymousClass3Q2 r6, C267834cI r7, List list, boolean z, boolean z2, boolean z3) {
        MusicOverlayStickerModel musicOverlayStickerModel;
        if (r7 != null) {
            1iA r3 = null;
            if (r6 != null) {
                musicOverlayStickerModel = r6.A1J;
            } else {
                musicOverlayStickerModel = null;
            }
            boolean z4 = true;
            boolean A1V = AnonymousClass7TF.A1V(musicOverlayStickerModel);
            if (A1V != z2 || z3) {
                if (r6 != null) {
                    r3 = r6.A1G;
                }
                if (r3 != 1iA.A09) {
                    z4 = false;
                }
                if (AnonymousClass30D.A0K(userSession, z4, z)) {
                    if (A1V != z2) {
                        int i = 2131976468;
                        if (z2) {
                            i = 2131976467;
                        }
                        if (z3) {
                            C59689JTv.A07(context, i);
                        } else {
                            C310336ap A0a = DbS.A0a();
                            DbS.A19(context, A0a, i);
                            Dbb.A1Q(A0a);
                        }
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        AnonymousClass3Q2 BbQ = r7.BbQ(((VideoSession) it.next()).A0G);
                        if (BbQ != null) {
                            BbQ.A5F = z2;
                        }
                    }
                }
            }
        }
    }
}
