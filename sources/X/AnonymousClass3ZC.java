package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import com.instagram.android.R;
import com.instagram.api.schemas.AdFormatType;
import com.instagram.api.schemas.AttributionUser;
import com.instagram.api.schemas.ClipsTrialDict;
import com.instagram.api.schemas.ContextualHighlightType;
import com.instagram.api.schemas.MediaTrialStatus;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.model.metadata.ClipsContextualHighlightInfoIntf;
import com.instagram.clips.model.metadata.InteractionUpsellCTAType;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.model.mediatype.ProductType;
import com.instagram.music.common.model.MusicConsumptionModel;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;

/* renamed from: X.3ZC  reason: invalid class name */
public final class AnonymousClass3ZC {
    public static final AnonymousClass3ZC A00 = new Object();

    public static final boolean A04(Context context, UserSession userSession, 1Xj r6, Boolean bool, int i) {
        boolean A03;
        0qQ.A0B(userSession, 4);
        if (0qQ.A0K(bool, true)) {
            if (!AnonymousClass6L4.A01(context, userSession, r6, i)) {
                return false;
            }
            A03 = 182.A06(0Tu.A05, userSession, 36318849045961218L);
        } else if (!C2803051e.A01(r6.A0C.Aq4(), userSession)) {
            return false;
        } else {
            A03 = C2803051e.A03(userSession);
        }
        if (!A03) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        if (r6.A0F == false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A05(X.GEG r6, X.C267324bN r7, com.instagram.common.session.UserSession r8) {
        /*
            r3 = 0
            X.4bO r1 = r7.A0G
            boolean r0 = r1.CcK()
            r5 = 0
            if (r0 == 0) goto L_0x002f
            boolean r0 = r6.A0E
            if (r0 == 0) goto L_0x002e
            boolean r0 = r1.CcK()
            if (r0 == 0) goto L_0x002e
            boolean r0 = X.GEK.A00(r7)
            if (r0 != 0) goto L_0x002e
            boolean r0 = X.GEK.A01(r7)
            if (r0 != 0) goto L_0x002e
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326137605338665(0x810e6e00073629, double:3.036133923007016E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
        L_0x002b:
            if (r0 == 0) goto L_0x002e
            r5 = 1
        L_0x002e:
            return r5
        L_0x002f:
            X.0Tu r4 = X.0Tu.A05
            r0 = 36328860614278795(0x8110e800023e8b, double:3.037855964825431E-306)
            boolean r0 = X.182.A06(r4, r8, r0)
            if (r0 != 0) goto L_0x0041
            boolean r0 = r6.A0F
            r2 = 0
            if (r0 != 0) goto L_0x0042
        L_0x0041:
            r2 = 1
        L_0x0042:
            X.5o2 r1 = r7.A01
            X.5o2 r0 = X.C295365o2.ORGANIC
            if (r1 == r0) goto L_0x004c
            X.5o2 r0 = X.C295365o2.QP
            if (r1 != r0) goto L_0x002e
        L_0x004c:
            boolean r0 = r6.A0E
            if (r0 == 0) goto L_0x002e
            if (r2 == 0) goto L_0x002e
            boolean r0 = X.C52114GFi.A04(r8)
            if (r0 != 0) goto L_0x0063
            r0 = 36328804779703902(0x8110db00023e5e, double:3.037820654815441E-306)
            boolean r0 = X.182.A06(r4, r8, r0)
            if (r0 == 0) goto L_0x002e
        L_0x0063:
            boolean r0 = A0O(r7, r8, r3)
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3ZC.A05(X.GEG, X.4bN, com.instagram.common.session.UserSession):boolean");
    }

    public static final boolean A06(ClipsViewerConfig clipsViewerConfig, C267324bN r5) {
        C270584gy r0;
        1Xj r02;
        C67231sQ clipsMetadata;
        0qQ.A0B(clipsViewerConfig, 0);
        0qQ.A0B(r5, 1);
        if (clipsViewerConfig.A1q || clipsViewerConfig.A1R || (((r0 = r5.A0H) != null && r0.AxO()) || ((r02 = r5.A02) != null && (clipsMetadata = r02.A0C.getClipsMetadata()) != null && 0qQ.A0K(clipsMetadata.Ca8(), true)))) {
            return false;
        }
        return true;
    }

    public static final boolean A07(ClipsViewerConfig clipsViewerConfig, C267324bN r4) {
        C270584gy r0;
        0qQ.A0B(clipsViewerConfig, 0);
        0qQ.A0B(r4, 1);
        if (clipsViewerConfig.A1V || ((r0 = r4.A0H) != null && r0.AxM())) {
            return false;
        }
        return true;
    }

    public static final boolean A08(ClipsViewerConfig clipsViewerConfig, C267324bN r4, UserSession userSession) {
        if (clipsViewerConfig.A1q || clipsViewerConfig.A1b) {
            return false;
        }
        1Xj r0 = r4.A02;
        if (r0 != null && r0.A4c()) {
            return false;
        }
        C270584gy r02 = r4.A0H;
        if ((r02 == null || !r02.AxQ()) && !A0B(r4) && !A0J(r4, userSession)) {
            return true;
        }
        return false;
    }

    public static final boolean A09(ClipsViewerConfig clipsViewerConfig, C267324bN r5, UserSession userSession) {
        1Xj r0;
        C250513lZ injected;
        C67231sQ clipsMetadata;
        1Xj r02;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(clipsViewerConfig, 1);
        0qQ.A0B(r5, 2);
        if (clipsViewerConfig.A1q || clipsViewerConfig.A1d) {
            return false;
        }
        C270584gy r03 = r5.A0H;
        if (r03 != null && r03.AxY()) {
            return false;
        }
        1Xj r04 = r5.A02;
        if (r04 != null && r04.A5P() && (r02 = r5.A02) != null && r02.A5Z()) {
            return false;
        }
        1Xj r05 = r5.A02;
        if (r05 != null && (clipsMetadata = r05.A0C.getClipsMetadata()) != null && 0qQ.A0K(clipsMetadata.Ca8(), true)) {
            return false;
        }
        1Xj r06 = r5.A02;
        if (r06 != null && r06.A5Z()) {
            return false;
        }
        if ((!r5.A0G.CcK() || (r0 = r5.A02) == null || (injected = r0.A0C.getInjected()) == null || !0qQ.A0K(injected.AxE(), false)) && !A0J(r5, userSession)) {
            return true;
        }
        return false;
    }

    public static final boolean A0A(C267324bN r4) {
        boolean z;
        1Xj r0;
        AnonymousClass3QO r1;
        C2605946h A1O;
        MusicConsumptionModel BUp;
        1Xj r02 = r4.A02;
        if (r02 == null || (A1O = r02.A1O()) == null || (BUp = A1O.A00.BUp()) == null) {
            z = false;
        } else {
            z = 0qQ.A0K(BUp.Ab6(), false);
        }
        if (!z && ((r0 = r4.A02) == null || !r0.A5M())) {
            1Xj r03 = r4.A02;
            AnonymousClass3QO r2 = null;
            if (r03 != null) {
                r1 = r03.A1t();
            } else {
                r1 = null;
            }
            if (r1 != AnonymousClass3QO.CLOSE_FRIENDS) {
                1Xj r04 = r4.A02;
                if (r04 != null) {
                    r2 = r04.A1t();
                }
                if (r2 == AnonymousClass3QO.FOLLOWERS_ONLY || r4.A0G.CcK()) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        r2 = r5.getProductType();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A0F(X.C267324bN r4, X.C267284bJ r5) {
        /*
            r3 = 0
            if (r5 == 0) goto L_0x0026
            java.lang.Boolean r0 = r5.BP3()
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0026
            java.lang.String r2 = r5.getProductType()
            if (r2 == 0) goto L_0x0027
            com.instagram.model.mediatype.ProductType r1 = com.instagram.model.mediatype.ProductType.IGTV
            java.util.Map r0 = com.instagram.model.mediatype.ProductType.A01
            java.lang.Object r0 = r0.get(r2)
            if (r1 != r0) goto L_0x0027
        L_0x001f:
            boolean r0 = A0A(r4)
            if (r0 == 0) goto L_0x0026
            r3 = 1
        L_0x0026:
            return r3
        L_0x0027:
            java.lang.String r2 = r5.getProductType()
            if (r2 == 0) goto L_0x0026
            com.instagram.model.mediatype.ProductType r1 = com.instagram.model.mediatype.ProductType.CLIPS
            java.util.Map r0 = com.instagram.model.mediatype.ProductType.A01
            java.lang.Object r0 = r0.get(r2)
            if (r1 != r0) goto L_0x0026
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3ZC.A0F(X.4bN, X.4bJ):boolean");
    }

    public static final boolean A0I(C267324bN r4, UserSession userSession) {
        1Xj r0;
        C67161s9 A1N;
        if (!A0A(r4)) {
            return false;
        }
        if ((!0qQ.A0K(AnonymousClass0t1.A01.A01(userSession), r4.A08(userSession)) || C52345GOp.A00.A0J(userSession)) && (r0 = r4.A02) != null && (A1N = r0.A1N()) != null && A1N.getMashupsAllowed()) {
            return true;
        }
        return false;
    }

    public static final boolean A0L(C267324bN r4, UserSession userSession) {
        C67231sQ clipsMetadata;
        String str;
        0qQ.A0B(userSession, 1);
        C270584gy r0 = r4.A0H;
        if (r0 == null || !r0.AxV()) {
            1Xj r02 = r4.A02;
            if (r02 == null || (clipsMetadata = r02.A0C.getClipsMetadata()) == null || !0qQ.A0K(clipsMetadata.Ca8(), true)) {
                return true;
            }
            User A08 = r4.A08(userSession);
            if (A08 != null) {
                str = A08.getId();
            } else {
                str = null;
            }
            if (0qQ.A0K(str, userSession.A06)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean A0O(C267324bN r4, UserSession userSession, boolean z) {
        1Xj r0;
        boolean z2;
        OriginalAudioSubtype originalAudioSubtype;
        OriginalSoundDataIntf A1J;
        1Xj r02 = r4.A02;
        if ((r02 == null || !r02.A5l()) && ((r0 = r4.A02) == null || !r0.A4z())) {
            z2 = false;
        } else {
            z2 = true;
        }
        1Xj r03 = r4.A02;
        if (r03 == null || (A1J = r03.A1J()) == null) {
            originalAudioSubtype = null;
        } else {
            originalAudioSubtype = A1J.BYy();
        }
        if (!z2 && originalAudioSubtype != null && (originalAudioSubtype == OriginalAudioSubtype.A05 || originalAudioSubtype == OriginalAudioSubtype.A04)) {
            if (!z && C262624Fg.A00(userSession)) {
                return false;
            }
            0Tu r2 = 0Tu.A05;
            if (182.A06(r2, userSession, 36328860614147721L) || 182.A06(r2, userSession, 36326137605928498L)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean A0P(UserSession userSession, 1Xj r4) {
        if ((r4 == null || !r4.CcK()) && !A0W(r4) && 182.A06(0Tu.A05, userSession, 36322834776009202L)) {
            return true;
        }
        return false;
    }

    public static final boolean A0R(UserSession userSession, 1Xj r3) {
        List list;
        AnonymousClass3WR r1 = null;
        if (r3 != null) {
            list = r3.A0C.C9Z();
            r1 = r3.CEL();
        } else {
            list = null;
        }
        if ((AnonymousClass3WP.A0A(userSession, r1, list) || ((AnonymousClass3WS.A08(userSession, r3) || AnonymousClass3WS.A0A(userSession, r3)) && AnonymousClass3WS.A07(userSession))) && !AnonymousClass3WP.A08(userSession, r3)) {
            return true;
        }
        return false;
    }

    public static final boolean A0S(UserSession userSession, 1Xj r6) {
        CreativeConfigIntf AsO;
        List<EffectPreviewIntf> B02;
        AttributionUser AdD;
        0qQ.A0B(r6, 0);
        if (C305796Jo.A05(userSession, r6) && r6.A1v() == ProductType.CLIPS && !1Au.A00(userSession).A01.getBoolean("reel_boost_with_instagram_effect_seen_tooltip_on_more_button", false) && DdM.A00(userSession) && (AsO = r6.A0C.AsO()) != null && (B02 = AsO.B02()) != null) {
            boolean z = false;
            for (EffectPreviewIntf effectPreviewIntf : B02) {
                if (!(effectPreviewIntf == null || (AdD = effectPreviewIntf.AdD()) == null)) {
                    if (0qQ.A0K(AdD.getInstagramUserId(), "25025320") && 0qQ.A0K(AdD.getUsername(), "instagram")) {
                        z = true;
                    }
                }
            }
            return z;
        }
        return false;
    }

    public static final boolean A0T(UserSession userSession, 1Xj r5, boolean z, boolean z2) {
        Integer num;
        0qQ.A0B(userSession, 0);
        if (z) {
            return false;
        }
        if (r5 != null) {
            num = r5.A2K();
        } else {
            num = null;
        }
        if (num == AnonymousClass05K.A0C || z2 || r5 == null || !0qQ.A0K(r5.A0C.CcI(), true) || !182.A06(0Tu.A05, userSession, 36326996598339695L)) {
            return false;
        }
        return true;
    }

    public static final boolean A0X(1Xj r2) {
        return C14064TpC.A00(r2) != null && !r2.A5j() && r2.A0C.CBy() == null;
    }

    public static final boolean A0Y(1Xj r3) {
        String str;
        String str2 = null;
        if (r3 != null) {
            str = r3.A2g();
            C245923dh B2s = r3.A0C.B2s();
            if (B2s != null) {
                str2 = B2s.B2q();
            } else {
                str2 = null;
            }
        } else {
            str = null;
        }
        if (str2 == null || 00l.A0W(str2) || str == null || 00l.A0W(str)) {
            return false;
        }
        return true;
    }

    public final boolean A0a(MotionEvent motionEvent, ClipsViewerConfig clipsViewerConfig, C267324bN r5) {
        0qQ.A0B(motionEvent, 0);
        0qQ.A0B(clipsViewerConfig, 1);
        0qQ.A0B(r5, 2);
        if (motionEvent.getAction() != 0 || !A07(clipsViewerConfig, r5)) {
            return false;
        }
        return true;
    }

    public static final int A00(Resources resources) {
        return C52183GHz.A00(resources, resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), resources.getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size));
    }

    public static final HLF A01(C267324bN r1) {
        1Xj r0;
        if (!r1.A0G.CcK() || (r0 = r1.A02) == null || r0.A29() == null) {
            return HLF.BRAND;
        }
        return HLF.INFLUENCER;
    }

    public static final void A03(GJI gji, Map map) {
        map.put(Integer.valueOf(gji.A00), gji);
    }

    public static final boolean A0B(C267324bN r1) {
        1Xj r0;
        C67231sQ clipsMetadata;
        if (r1 == null || (r0 = r1.A02) == null || (clipsMetadata = r0.A0C.getClipsMetadata()) == null) {
            return false;
        }
        return 0qQ.A0K(clipsMetadata.Ca8(), true);
    }

    public static final boolean A0C(C267324bN r2) {
        InteractionUpsellCTAType interactionUpsellCTAType;
        User user = r2.A0K;
        if (user == null || !AnonymousClass3ZQ.A03(user)) {
            C270584gy r0 = r2.A0H;
            if (r0 != null) {
                interactionUpsellCTAType = r0.BII();
            } else {
                interactionUpsellCTAType = null;
            }
            if (interactionUpsellCTAType != InteractionUpsellCTAType.FOLLOWU_UPSELL) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean A0D(C267324bN r2) {
        1Xj r0;
        C67161s9 A1N;
        1Xj r02 = r2.A02;
        Integer num = null;
        if (r02 != null) {
            num = r02.A2K();
        }
        if (num == AnonymousClass05K.A0C || (r0 = r2.A02) == null || (A1N = r0.A1N()) == null || A1N.BZ6() == null) {
            return false;
        }
        return true;
    }

    public static final boolean A0E(C267324bN r4, C67231sQ r5) {
        ContextualHighlightType contextualHighlightType;
        C67161s9 BP1;
        C267284bJ BZ6;
        if (!(r5 == null || r5.Ar8() == null)) {
            Integer num = null;
            ClipsContextualHighlightInfoIntf Ar8 = r5.Ar8();
            if (Ar8 != null) {
                contextualHighlightType = Ar8.Ar9();
            } else {
                contextualHighlightType = null;
            }
            if (contextualHighlightType == ContextualHighlightType.MASHUP) {
                1Xj r0 = r4.A02;
                if (r0 != null) {
                    num = r0.A2K();
                }
                if (num == AnonymousClass05K.A0C || (BP1 = r5.BP1()) == null || (BZ6 = BP1.BZ6()) == null || !0qQ.A0K(BZ6.BP3(), true)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static final boolean A0H(C267324bN r4, UserSession userSession) {
        AnonymousClass3QO r1;
        1Xj r0;
        if (0qQ.A0K(AnonymousClass0t1.A01.A01(userSession), r4.A08(userSession))) {
            1Xj r02 = r4.A02;
            AnonymousClass3QO r2 = null;
            if (r02 != null) {
                r1 = r02.A1t();
            } else {
                r1 = null;
            }
            if (r1 != AnonymousClass3QO.CLOSE_FRIENDS) {
                1Xj r03 = r4.A02;
                if (r03 != null) {
                    r2 = r03.A1t();
                }
                if (r2 == AnonymousClass3QO.FOLLOWERS_ONLY || ((r0 = r4.A02) != null && r0.A5M())) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static final boolean A0J(C267324bN r2, UserSession userSession) {
        if (AdFormatType.GRID != r2.A0E || 182.A06(0Tu.A05, userSession, 36321761034184393L)) {
            return false;
        }
        return true;
    }

    public static final boolean A0K(C267324bN r3, UserSession userSession) {
        if (!r3.A0G.CcK()) {
            return 182.A06(0Tu.A05, userSession, 36322358033983592L);
        }
        if (r3.A06().A0K.A5n() || C228342lQ.A07(userSession, 1Au.A00(userSession)) || !182.A06(0Tu.A05, userSession, 36322358033721446L) || A0J(r3, userSession)) {
            return false;
        }
        return true;
    }

    public static final boolean A0M(C267324bN r3, UserSession userSession) {
        AnonymousClass3QO r1;
        1Xj r0 = r3.A02;
        String str = null;
        if (r0 != null) {
            r1 = r0.A1t();
        } else {
            r1 = null;
        }
        if (r1 == AnonymousClass3QO.FOLLOWERS_ONLY) {
            User A08 = r3.A08(userSession);
            if (A08 != null) {
                str = A08.getId();
            }
            if (!0qQ.A0K(str, userSession.A06)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean A0N(C267324bN r4, UserSession userSession, 1Xj r6) {
        AnonymousClass3WR A09;
        if (182.A06(0Tu.A05, userSession, 36323156897967015L) && (A09 = r4.A09(userSession, (Integer) null)) != null && A09.A07()) {
            return true;
        }
        if ((r6 == null || !AnonymousClass3WS.A09(userSession, r6)) && !AnonymousClass3WS.A0B(userSession, r4.A09(userSession, (Integer) null))) {
            return false;
        }
        return true;
    }

    public static final boolean A0Q(UserSession userSession, 1Xj r2) {
        User user;
        OriginalSoundDataIntf BZB;
        MusicInfo BUr;
        if (r2 == null || !GKS.A04(userSession, r2)) {
            return false;
        }
        C67231sQ clipsMetadata = r2.A0C.getClipsMetadata();
        if (clipsMetadata == null || (BUr = clipsMetadata.BUr()) == null) {
            C67231sQ clipsMetadata2 = r2.A0C.getClipsMetadata();
            if (clipsMetadata2 == null || (BZB = clipsMetadata2.BZB()) == null || (user = BZB.BEv()) == null) {
                return false;
            }
        } else {
            user = BUr.BUp().BEv();
            if (user == null) {
                BUr.BUk().getDisplayArtist();
                return true;
            }
        }
        user.getUsername();
        return true;
    }

    public static final boolean A0U(UserSession userSession, boolean z) {
        if (!z) {
            0Tu r2 = 0Tu.A06;
            if (182.A06(r2, userSession, 36322370918623342L) || 182.A06(r2, userSession, 36322370918557805L) || 182.A06(r2, userSession, 36322370918819953L) || 182.A06(r2, userSession, 36322370918885490L)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean A0V(1Xj r2) {
        DTW CFo;
        DTW CFo2;
        if (r2 == null || (CFo = r2.A0C.CFo()) == null || Long.valueOf(Long.parseLong(CFo.BZ5().getPk())) == null || (CFo2 = r2.A0C.CFo()) == null || Long.valueOf(Long.parseLong(CFo2.ApG().getCommentId())) == null) {
            return false;
        }
        return true;
    }

    public static final boolean A0W(1Xj r1) {
        if (r1 == null) {
            return false;
        }
        if (r1.A4z() || r1.A5l()) {
            return true;
        }
        return false;
    }

    public static final boolean A0Z(GJI gji, Map map) {
        return !map.containsKey(Integer.valueOf(gji.A00));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        if (r7.A0J == com.instagram.clips.intf.ClipsViewerSource.A0H) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(android.content.Context r5, X.GEG r6, com.instagram.clips.intf.ClipsViewerConfig r7, X.C267324bN r8, X.C52058GDe r9, com.instagram.common.session.UserSession r10, X.1Xj r11) {
        /*
            com.instagram.user.model.User r3 = r8.A08(r10)
            if (r3 == 0) goto L_0x0068
            X.4Cl r0 = r3.A03
            java.lang.String r2 = r0.C9f()
            if (r2 == 0) goto L_0x0017
            java.lang.String r1 = r3.getId()
            X.RIv r0 = X.C8956RIv.REELS
            X.AnonymousClass3ZQ.A02(r5, r0, r10, r1, r2)
        L_0x0017:
            boolean r5 = r11.A4b()
            com.instagram.user.model.FollowStatus r1 = r9.A0G
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A06
            r4 = 0
            if (r1 != r0) goto L_0x0023
            r4 = 1
        L_0x0023:
            boolean r0 = r7.A1q
            if (r0 != 0) goto L_0x0032
            boolean r0 = r6.A09
            if (r0 == 0) goto L_0x0032
            com.instagram.clips.intf.ClipsViewerSource r2 = r7.A0J
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.CAMERA_INSPIRATION_HUB
            r1 = 1
            if (r2 != r0) goto L_0x0033
        L_0x0032:
            r1 = 0
        L_0x0033:
            X.0t1 r0 = X.0eE.A00(r10)
            com.instagram.user.model.User r0 = r0.A00()
            boolean r0 = X.0qQ.A0K(r0, r3)
            if (r0 != 0) goto L_0x0047
            if (r1 == 0) goto L_0x0047
            if (r4 == 0) goto L_0x0047
            if (r5 == 0) goto L_0x004b
        L_0x0047:
            boolean r0 = r6.A0I
            if (r0 == 0) goto L_0x0068
        L_0x004b:
            X.70U r2 = new X.70U
            r2.<init>(r10)
            java.lang.String r4 = r3.getId()
            X.4Cl r0 = r3.A03
            java.lang.String r5 = r0.C9f()
            X.RIv r3 = X.C8956RIv.REELS
            r7 = 0
            X.1Xj r0 = r8.A02
            if (r0 == 0) goto L_0x0069
            java.lang.String r6 = r0.A2n()
        L_0x0065:
            r2.A00(r3, r4, r5, r6, r7)
        L_0x0068:
            return
        L_0x0069:
            r6 = 0
            goto L_0x0065
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3ZC.A02(android.content.Context, X.GEG, com.instagram.clips.intf.ClipsViewerConfig, X.4bN, X.GDe, com.instagram.common.session.UserSession, X.1Xj):void");
    }

    public static final boolean A0G(C267324bN r3, UserSession userSession) {
        String str;
        ClipsTrialDict AoL;
        User A08 = r3.A08(userSession);
        MediaTrialStatus mediaTrialStatus = null;
        if (A08 != null) {
            str = A08.getId();
        } else {
            str = null;
        }
        if (0qQ.A0K(str, userSession.A06) && r3.A0Z && !r3.A0a) {
            1Xj r0 = r3.A02;
            if (!(r0 == null || (AoL = r0.A0C.AoL()) == null)) {
                mediaTrialStatus = AoL.BzK();
            }
            if (mediaTrialStatus == MediaTrialStatus.ACTIVE) {
                return false;
            }
            return true;
        }
        return false;
    }
}
