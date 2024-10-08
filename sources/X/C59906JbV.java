package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.react.modules.base.IgReactQEModule;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.webrtc.EglBase14Impl;

/* renamed from: X.JbV  reason: case insensitive filesystem */
public final class C59906JbV {
    public static final C59906JbV A00 = new Object();

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Integer A00(X.AnonymousClass3Q2 r4) {
        /*
            r3 = 0
            boolean r0 = r4.A0u()
            if (r0 != 0) goto L_0x004a
            boolean r0 = r4.A11()
            if (r0 == 0) goto L_0x003b
            X.JbV r0 = A00
            java.util.List r2 = r4.A4m
        L_0x0011:
            java.util.HashSet r0 = r0.A07(r2)
            int r1 = r0.size()
            r0 = 1
            if (r1 != r0) goto L_0x0051
            java.lang.Object r1 = r2.get(r3)
            X.3Q2 r1 = (X.AnonymousClass3Q2) r1
            boolean r0 = r1.A0u()
            if (r0 == 0) goto L_0x0032
            java.util.List r0 = r1.A0L()
            java.lang.Object r1 = r0.get(r3)
            X.3Q2 r1 = (X.AnonymousClass3Q2) r1
        L_0x0032:
            X.1iA r0 = r1.A07()
        L_0x0036:
            java.lang.Integer r0 = X.C59910JbZ.A00(r0)
            return r0
        L_0x003b:
            boolean r0 = r4.A5w
            if (r0 != 0) goto L_0x004a
            X.1iA r1 = r4.A1G
            X.1iA r0 = X.1iA.A0A
            if (r1 == r0) goto L_0x004a
            X.1iA r0 = r4.A07()
            goto L_0x0036
        L_0x004a:
            X.JbV r0 = A00
            java.util.List r2 = r4.A0L()
            goto L_0x0011
        L_0x0051:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59906JbV.A00(X.3Q2):java.lang.Integer");
    }

    public static final String A01(UserSession userSession, AnonymousClass3Q2 r4) {
        Integer num;
        if (!0oI.A09(C60960kU.A00)) {
            28D r1 = r4.A0i;
            if (r1 == 28D.A2c || r1 == 28D.A2d || r1 == 28D.A5D || r1 == 28D.A5E || r1 == 28D.A5H) {
                return "third_party_app";
            }
            ShareType A0E = r4.A0E();
            C59914Jbd jbd = C59914Jbd.$redex_init_class;
            switch (A0E.ordinal()) {
                case 0:
                case 8:
                case 30:
                    if (182.A06(0Tu.A05, userSession, 36320614277587622L)) {
                        return "feed";
                    }
                    return "unified_video";
                case 1:
                case 26:
                    if (r4.A5D) {
                        return AnonymousClass000.A00(588);
                    }
                    return "direct_permanent";
                case 2:
                case 4:
                case 16:
                case 25:
                    return "story_or_direct_ephemeral";
                case 3:
                case 15:
                    if (r4.A5D) {
                        return "direct_ephemeral_instamadillo";
                    }
                    return "direct_ephemeral";
                case 5:
                case 6:
                    return "nametag_selfie";
                case 7:
                case 17:
                case 31:
                case 32:
                    return "invalid";
                case 9:
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                case 21:
                case 28:
                    return "clips";
                case 10:
                    return "post_live_igtv";
                case 11:
                    return "igtv_post_live_to_cover_photo";
                case 13:
                    return "media_kit";
                case 14:
                    return "story_interaction_response";
                case EglBase14Impl.EGLExt_SDK_VERSION:
                case 19:
                    return "story_template_asset";
                case 20:
                    return "reusable_template_assets";
                case 22:
                case 23:
                case 24:
                    return "notes";
                case 27:
                    return "wonder_wall";
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                    return "quick_snap";
                default:
                    throw AnonymousClass7TE.A1K();
            }
        } else if (r4.A0u() && r4.A0L().size() > 1) {
            return "multimedia";
        } else {
            if (r4.A3X != null) {
                num = AnonymousClass05K.A01;
            } else {
                num = AnonymousClass05K.A00;
            }
            C59914Jbd jbd2 = C59914Jbd.$redex_init_class;
            if (num.intValue() != 0) {
                return "reply_post";
            }
            return "feed_post";
        }
    }

    public static final String A05(Throwable th) {
        String message;
        C291265gs A06;
        String str = null;
        if (!((!(th instanceof FileNotFoundException) && !(th instanceof C62689Kkp)) || (message = th.getMessage()) == null || (A06 = new 11S("(/\\S+)+").A06(message, 0)) == null)) {
            String group = A06.A01.group();
            0qQ.A07(group);
            str = new 11S("[0-9]+|_|-").A00(group, "");
            int A05 = 00l.A05(str, '/', str.length() - 1);
            if (A05 > 0 && 00l.A08(str, ".", A05, false) > 0) {
                return C51967G9n.A0q(str, 0, A05);
            }
        }
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0096  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList A06(com.instagram.common.session.UserSession r9, X.AnonymousClass3Q2 r10, boolean r11) {
        /*
            r8 = 1
            X.0Tu r2 = X.0Tu.A05
            r0 = 36329345945452608(0x81115900004040, double:3.038162890214022E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            r7 = 0
            if (r0 == 0) goto L_0x0105
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            boolean r0 = X.C59911Jba.A02(r10)
            if (r0 == 0) goto L_0x001e
            X.KkT r0 = X.C62667KkT.MUSIC_STICKER
            r2.add(r0)
        L_0x001e:
            if (r11 == 0) goto L_0x0064
            java.util.Set r0 = r10.A4t
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0064
            X.AIn r1 = X.C39905AIn.A00
            boolean r0 = r1.A03(r9, r10)
            if (r0 == 0) goto L_0x003c
            X.KkT r0 = X.C62667KkT.IMMERSIVE_STORY_RESHARE_VIDEO_STICKER
        L_0x0032:
            r2.add(r0)
        L_0x0035:
            boolean r0 = X.DbT.A1b(r2)
            if (r0 == 0) goto L_0x0105
            return r2
        L_0x003c:
            boolean r0 = r1.A04(r9, r10)
            if (r0 == 0) goto L_0x0045
            X.KkT r0 = X.C62667KkT.STORY_RESHARE_VIDEO_STICKER
            goto L_0x0032
        L_0x0045:
            X.1iA r1 = r10.A1G
            X.1iA r0 = X.1iA.A0Q
            if (r1 != r0) goto L_0x0035
            java.util.Set r0 = r10.A4t
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0035
            boolean r0 = X.C59911Jba.A02(r10)
            if (r0 == 0) goto L_0x0035
            com.instagram.camera.effect.models.CameraAREffect r0 = r10.A10
            if (r0 != 0) goto L_0x0035
            boolean r0 = r10.A57
            if (r0 != 0) goto L_0x0035
            X.KkT r0 = X.C62667KkT.PTV
            goto L_0x0032
        L_0x0064:
            X.1iA r0 = r10.A1G
            X.1iA r5 = X.1iA.A0Q
            if (r0 != r5) goto L_0x0035
            java.util.Set r0 = r10.A4t
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x007a
            boolean r0 = X.C59911Jba.A02(r10)
            if (r0 == 0) goto L_0x0035
        L_0x007a:
            boolean r0 = X.C379909Vu.A05(r10)
            if (r0 == 0) goto L_0x0099
            X.KkT r0 = X.C62667KkT.IMMERSIVE_STORY_RESHARE_VIDEO_STICKER
        L_0x0082:
            r2.add(r0)
        L_0x0085:
            boolean r0 = X.C379909Vu.A03(r10)
            if (r0 == 0) goto L_0x0090
            X.KkT r0 = X.C62667KkT.ALBUM_ART_SOUNDWAVE_GIPHY_STICKER
            r2.add(r0)
        L_0x0090:
            boolean r0 = X.C379909Vu.A02(r10)
            if (r0 == 0) goto L_0x0035
            X.KkT r0 = X.C62667KkT.GIPHY_STICKER
            goto L_0x0032
        L_0x0099:
            boolean r0 = X.C379909Vu.A06(r10)
            if (r0 == 0) goto L_0x00a2
            X.KkT r0 = X.C62667KkT.STORY_RESHARE_VIDEO_STICKER
            goto L_0x0082
        L_0x00a2:
            java.util.Set r0 = r10.A4t
            java.util.Iterator r6 = r0.iterator()
        L_0x00a8:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00d2
            java.lang.Object r4 = r6.next()
            r3 = r4
            X.ADJ r3 = (X.ADJ) r3
            java.lang.String r1 = r3.A0J
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.CLIPS
            java.lang.String r0 = r0.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00a8
            java.lang.Boolean r1 = r3.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00a8
            if (r4 == 0) goto L_0x00d2
            X.KkT r0 = X.C62667KkT.IMMERSIVE_REEL_RESHARE_VIDEO_STICKER
            goto L_0x0082
        L_0x00d2:
            boolean r0 = X.C379909Vu.A04(r10)
            if (r0 == 0) goto L_0x00db
            X.KkT r0 = X.C62667KkT.REEL_RESHARE_VIDEO_STICKER
            goto L_0x0082
        L_0x00db:
            boolean r0 = X.C379909Vu.A02(r10)
            if (r0 != 0) goto L_0x0101
            boolean r0 = X.C379909Vu.A03(r10)
            if (r0 != 0) goto L_0x0101
            X.1iA r0 = r10.A1G
            if (r0 != r5) goto L_0x0085
            java.util.Set r0 = r10.A4t
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0085
            boolean r0 = X.C59911Jba.A02(r10)
            if (r0 == 0) goto L_0x0085
            com.instagram.camera.effect.models.CameraAREffect r0 = r10.A10
            if (r0 != 0) goto L_0x0085
            boolean r0 = r10.A57
            if (r0 != 0) goto L_0x0085
        L_0x0101:
            X.KkT r0 = X.C62667KkT.PTV
            goto L_0x0082
        L_0x0105:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59906JbV.A06(com.instagram.common.session.UserSession, X.3Q2, boolean):java.util.ArrayList");
    }

    public final synchronized boolean A09(UserSession userSession, AnonymousClass3Q2 r5, int i) {
        boolean z;
        String A01 = A01(userSession, r5);
        String A02 = A02(userSession, r5, i);
        if (0qQ.A0K(A01, "story_or_direct_ephemeral")) {
            if (!0qQ.A0K(A02, "direct_ephemeral_instamadillo") && !0qQ.A0K(A02, "direct_ephemeral")) {
                if (0qQ.A0K(A02, "story")) {
                }
            }
            z = true;
        }
        z = false;
        return z;
    }

    public static final String A02(UserSession userSession, AnonymousClass3Q2 r4, int i) {
        ShareType shareType;
        AnonymousClass3QF r2 = r4.A1T;
        synchronized (r2) {
            shareType = (ShareType) r2.A0B.get(String.valueOf(i));
        }
        String A03 = A03(userSession, r4, shareType, true);
        if (A03 == null) {
            return "invalid";
        }
        return A03;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004d, code lost:
        if (r5.A5D != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004f, code lost:
        return "direct_ephemeral";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a2, code lost:
        return "story";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return "direct_ephemeral_instamadillo";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A03(com.instagram.common.session.UserSession r4, X.AnonymousClass3Q2 r5, com.instagram.pendingmedia.model.constants.ShareType r6, boolean r7) {
        /*
            android.content.Context r0 = X.C60960kU.A00
            boolean r0 = X.0oI.A09(r0)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r5.A3X
            if (r0 == 0) goto L_0x001a
            java.lang.Integer r1 = X.AnonymousClass05K.A01
        L_0x000e:
            X.Jbd r0 = X.C59914Jbd.$redex_init_class
            int r1 = r1.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x0050
            java.lang.String r3 = "reply_post"
        L_0x0019:
            return r3
        L_0x001a:
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            goto L_0x000e
        L_0x001d:
            if (r6 != 0) goto L_0x0023
            com.instagram.pendingmedia.model.constants.ShareType r6 = r5.A0E()
        L_0x0023:
            X.Jbd r0 = X.C59914Jbd.$redex_init_class
            int r0 = r6.ordinal()
            java.lang.String r3 = "direct_ephemeral_instamadillo"
            java.lang.String r2 = "direct_ephemeral"
            java.lang.String r1 = "story"
            switch(r0) {
                case 0: goto L_0x0056;
                case 1: goto L_0x0076;
                case 2: goto L_0x00a2;
                case 3: goto L_0x004b;
                case 4: goto L_0x0037;
                case 5: goto L_0x0084;
                case 6: goto L_0x0084;
                case 7: goto L_0x0053;
                case 8: goto L_0x0056;
                case 9: goto L_0x008d;
                case 10: goto L_0x0056;
                case 11: goto L_0x0087;
                case 12: goto L_0x008d;
                case 13: goto L_0x009c;
                case 14: goto L_0x0090;
                case 15: goto L_0x004b;
                case 16: goto L_0x00a2;
                case 17: goto L_0x0053;
                case 18: goto L_0x0096;
                case 19: goto L_0x0096;
                case 20: goto L_0x008a;
                case 21: goto L_0x008d;
                case 22: goto L_0x0093;
                case 23: goto L_0x0093;
                case 24: goto L_0x0093;
                case 25: goto L_0x00a2;
                case 26: goto L_0x0076;
                case 27: goto L_0x0099;
                case 28: goto L_0x008d;
                case 29: goto L_0x009f;
                case 30: goto L_0x0056;
                case 31: goto L_0x0053;
                case 32: goto L_0x0053;
                default: goto L_0x0032;
            }
        L_0x0032:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0037:
            if (r7 == 0) goto L_0x00a3
            java.util.EnumSet r0 = com.instagram.pendingmedia.model.constants.ShareType.A02
            boolean r0 = r5.A15(r0)
            if (r0 != 0) goto L_0x00a2
            java.util.List r0 = r5.A4c
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 != 0) goto L_0x004b
            r3 = 0
            return r3
        L_0x004b:
            boolean r0 = r5.A5D
            if (r0 != 0) goto L_0x0019
            return r2
        L_0x0050:
            java.lang.String r3 = "feed_post"
            return r3
        L_0x0053:
            java.lang.String r3 = "invalid"
            return r3
        L_0x0056:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320614277587622(0x810968000a22a6, double:3.0326409482966004E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0073
            boolean r0 = r5.A0u()
            if (r0 != 0) goto L_0x0070
            java.lang.String r0 = r5.A3O
            if (r0 != 0) goto L_0x0070
            java.lang.String r3 = "feed"
            return r3
        L_0x0070:
            java.lang.String r3 = "multipost"
            return r3
        L_0x0073:
            java.lang.String r3 = "unified_video"
            return r3
        L_0x0076:
            boolean r0 = r5.A5D
            if (r0 == 0) goto L_0x0081
            r0 = 588(0x24c, float:8.24E-43)
            java.lang.String r3 = X.AnonymousClass000.A00(r0)
            return r3
        L_0x0081:
            java.lang.String r3 = "direct_permanent"
            return r3
        L_0x0084:
            java.lang.String r3 = "nametag_selfie"
            return r3
        L_0x0087:
            java.lang.String r3 = "igtv_post_live_to_cover_photo"
            return r3
        L_0x008a:
            java.lang.String r3 = "reusable_template_assets"
            return r3
        L_0x008d:
            java.lang.String r3 = "clips"
            return r3
        L_0x0090:
            java.lang.String r3 = "story_interaction_response"
            return r3
        L_0x0093:
            java.lang.String r3 = "notes"
            return r3
        L_0x0096:
            java.lang.String r3 = "story_template_asset"
            return r3
        L_0x0099:
            java.lang.String r3 = "wonder_wall"
            return r3
        L_0x009c:
            java.lang.String r3 = "media_kit"
            return r3
        L_0x009f:
            java.lang.String r3 = "quick_snap"
            return r3
        L_0x00a2:
            return r1
        L_0x00a3:
            java.lang.String r3 = "story_or_direct_ephemeral"
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59906JbV.A03(com.instagram.common.session.UserSession, X.3Q2, com.instagram.pendingmedia.model.constants.ShareType, boolean):java.lang.String");
    }

    public static final boolean A08(MusicOverlayStickerModel musicOverlayStickerModel) {
        if (musicOverlayStickerModel == null) {
            return false;
        }
        if (musicOverlayStickerModel.A0S == null && musicOverlayStickerModel.A0T == null && musicOverlayStickerModel.A0m == null) {
            return false;
        }
        return true;
    }

    public static final String A04(AnonymousClass3Q2 r2) {
        C273864nJ A0A = r2.A0A();
        if (A0A instanceof RBC) {
            return "segmented";
        }
        if (A0A instanceof C273854nI) {
            return "sequential";
        }
        0wb.A03("unknown_ingestion_strategy_configuration", AnonymousClass7TG.A0m(A0A, "configuration: ", AnonymousClass7TE.A1A()));
        return "unknown";
    }

    private final HashSet A07(List list) {
        HashSet A1F = AnonymousClass7TE.A1F();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass3Q2 A0m = JTO.A0m(it);
            if (A0m.A0u()) {
                A1F.addAll(A07(A0m.A0L()));
            } else {
                A1F.add(A0m.A1G);
            }
        }
        return A1F;
    }
}
