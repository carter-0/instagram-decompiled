package X;

import android.util.Pair;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.ACRType;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation;
import com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo;
import com.instagram.creation.capture.quickcapture.aspectratioutil.intf.CreationLayoutConfig;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.suggestions.model.GallerySuggestionsInfo;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.user.model.ProductCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: X.JbK  reason: case insensitive filesystem */
public abstract class C59895JbK {
    public static boolean A00;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        if (r2.equals(com.instagram.pendingmedia.model.UserStoryTarget.A09) != false) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A02(X.LD4 r4) {
        /*
            r0 = 0
            X.0qQ.A0B(r4, r0)
            boolean r0 = r4.A00()
            r3 = 1
            if (r0 != 0) goto L_0x0015
            com.instagram.model.direct.DirectShareTarget r0 = r4.A00
            if (r0 == 0) goto L_0x0017
            com.instagram.pendingmedia.model.constants.ShareType r1 = r4.A02
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.DIRECT_SHARE
            if (r1 != r0) goto L_0x0017
        L_0x0015:
            r3 = 3
        L_0x0016:
            return r3
        L_0x0017:
            com.instagram.pendingmedia.model.UserStoryTarget r2 = r4.A01
            if (r2 == 0) goto L_0x0045
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A02
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0038
            java.lang.String r1 = r2.CAh()
            java.lang.String r0 = "CLOSE_FRIENDS_WITH_BLACKLIST"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0038
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A09
            boolean r1 = r2.equals(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0039
        L_0x0038:
            r0 = 1
        L_0x0039:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x003d:
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r3)
            if (r0 == 0) goto L_0x0016
            r3 = 2
            return r3
        L_0x0045:
            r0 = 0
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59895JbK.A02(X.LD4):int");
    }

    public static final int A03(Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 1) {
                return 1;
            }
            if (intValue != 0) {
                return -1;
            }
            return 2;
        }
        return -1;
    }

    public static final 28t A05(int i) {
        if (i == 1) {
            return 28t.A05;
        }
        if (i != 2) {
            return 28t.A04;
        }
        return 28t.A06;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.instagram.feed.media.ReelCTA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.instagram.feed.media.ReelCTA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.instagram.feed.media.ReelCTA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.instagram.feed.media.ReelCTA} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.LMJ A09(java.util.List r4) {
        /*
            r3 = 0
            if (r4 == 0) goto L_0x004d
            java.lang.Object r1 = X.00k.A0J(r4)
            com.instagram.feed.media.ReelCTA r1 = (com.instagram.feed.media.ReelCTA) r1
            if (r1 == 0) goto L_0x004d
            java.lang.String r0 = X.AnonymousClass6MS.A02(r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r2 = X.AnonymousClass6MS.A02(r1)
            java.lang.String r1 = "web_link"
        L_0x0017:
            X.LMJ r0 = new X.LMJ
            r0.<init>(r1, r2)
            return r0
        L_0x001d:
            java.lang.String r0 = X.AnonymousClass6MS.A01(r1)
            if (r0 == 0) goto L_0x002a
            java.lang.String r2 = X.AnonymousClass6MS.A01(r1)
            java.lang.String r1 = "igtv"
            goto L_0x0017
        L_0x002a:
            java.util.Iterator r2 = r4.iterator()
        L_0x002e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0042
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.instagram.feed.media.ReelCTA r0 = (com.instagram.feed.media.ReelCTA) r0
            java.lang.String r0 = X.AnonymousClass6MS.A00(r0)
            if (r0 == 0) goto L_0x002e
            r3 = r1
        L_0x0042:
            com.instagram.feed.media.ReelCTA r3 = (com.instagram.feed.media.ReelCTA) r3
            if (r3 == 0) goto L_0x004d
            java.lang.String r2 = X.AnonymousClass6MS.A00(r3)
            java.lang.String r1 = "effect"
            goto L_0x0017
        L_0x004d:
            X.LMJ r0 = X.LMJ.A02
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59895JbK.A09(java.util.List):X.LMJ");
    }

    public static final String A0B(C3499582p r1) {
        AnonymousClass87I r0;
        0qQ.A0B(r1, 0);
        AnonymousClass802 A02 = r1.A02.A01.A02();
        if (A02 == null || (r0 = A02.A06) == null) {
            return null;
        }
        return r0.A00;
    }

    public static final HashMap A0D(UserSession userSession, List list) {
        MusicOverlayStickerModel musicOverlayStickerModel;
        String str;
        0qQ.A0B(userSession, 0);
        C255783ui A002 = AnonymousClass497.A00(AnonymousClass3WT.MUSIC_OVERLAY, list);
        if (A002 == null || (musicOverlayStickerModel = A002.A0u) == null) {
            return null;
        }
        HashMap A1E = AnonymousClass7TE.A1E();
        String str2 = musicOverlayStickerModel.A0S;
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        A1E.put("audio_asset_id", str2);
        String str4 = musicOverlayStickerModel.A0m;
        if (str4 == null) {
            str4 = str3;
        }
        A1E.put("song_name", str4);
        String str5 = musicOverlayStickerModel.A0Y;
        if (str5 == null) {
            str5 = str3;
        }
        A1E.put("artist_name", str5);
        A1E.put(TraceFieldType.StartTime, String.valueOf(musicOverlayStickerModel.A0K));
        Integer num = musicOverlayStickerModel.A0O;
        if (num == null) {
            0kD.A07("MusicLoggerHelper", "musicStickerModel.getOverlapDurationMs() is null", (Throwable) null);
            num = C51967G9n.A0j();
        }
        A1E.put("length", num.toString());
        MusicProduct musicProduct = musicOverlayStickerModel.A02;
        if (musicProduct == null || (str = C14245TsS.A00(musicProduct)) == null) {
            str = str3;
        }
        A1E.put("product", str);
        String str6 = musicOverlayStickerModel.A0U;
        if (str6 == null) {
            str6 = str3;
        }
        A1E.put("browse_session_id", str6);
        String str7 = musicOverlayStickerModel.A0Q;
        if (str7 != null) {
            str3 = str7;
        }
        A1E.put("alacorn_session_id", str3);
        return A1E;
    }

    public static final void A0G(UserSession userSession, C279284yO r4, boolean z) {
        C360948fP r2;
        0qQ.A0B(r4, 1);
        29f A0c = JTO.A0c(userSession);
        if (r4 == AnonymousClass80L.A00) {
            r2 = C360948fP.LIVE;
        } else if (r4 instanceof AnonymousClass80O) {
            r2 = C360948fP.CLIPS;
        } else if (r4 == C363138jC.A00) {
            r2 = C360948fP.FEED;
        } else if (r4 == C3493980f.A00) {
            r2 = C360948fP.IGTV_CAMERA;
        } else {
            r2 = C360948fP.NORMAL;
        }
        A0c.A0Y(r2, r4.A00, (C279294yP) null, z);
    }

    public static final void A0H(UserSession userSession, Integer num) {
        0qQ.A0B(userSession, 0);
        27r A01 = 27p.A01(userSession);
        int A03 = A03(num);
        29Z r4 = A01.A0F;
        AnonymousClass283 r3 = r4.A04;
        r3.A01 = A03;
        0Aj A0d = JTR.A0d(r4);
        JTO.A1O(AnonymousClass80P.CAMERA_SWITCH, A0d);
        JTO.A1T(A0d, "IG_CAMERA_SWITCH_TAP_BUTTON");
        JTO.A1S(A0d, JTP.A0p(r3));
        AnonymousClass7TH.A0W(A0d, r4);
        int i = 1;
        if (A03 != 1) {
            i = 2;
        }
        AnonymousClass7TE.A1W(A0d, "camera_position", i);
        AnonymousClass7TH.A0X(A0d, r4);
        JTS.A14(r3.A09, A0d);
        JTP.A1J(A0d, r3);
        AnonymousClass7TH.A0U(A0d);
        C51965G9l.A1A(C59725JVj.PRE_CAPTURE, A0d);
        AnonymousClass7TH.A0V(A0d);
    }

    public static final int A00(C354948Nz r1) {
        String A002;
        if (r1 == null || (A002 = r1.A00()) == null) {
            return 0;
        }
        Pattern pattern = 0mp.A00;
        return A002.length();
    }

    public static final 28t A06(C365758nd r1) {
        if (r1 != null) {
            int ordinal = r1.ordinal();
            if (ordinal == 0) {
                return 28t.A05;
            }
            if (ordinal == 1) {
                return 28t.A06;
            }
        }
        return 28t.A04;
    }

    public static final C62668KkU A07(int i) {
        if (i == 10) {
            return C62668KkU.CLIPS;
        }
        switch (i) {
            case 1:
                return C62668KkU.STORY;
            case 2:
                return C62668KkU.CLOSE_FRIENDS;
            case 3:
                return C62668KkU.DIRECT;
            case 4:
                return C62668KkU.BLAST_LIST;
            case 5:
                return C62668KkU.FACEBOOK;
            case 6:
                return C62668KkU.FRIENDS_LIST;
            case 7:
                return C62668KkU.FEED;
            default:
                0kD.A07("CameraLoggerHelper", "No conversion between CameraAnalyticsConstants.ShareDestination and InstagramCameraShareDestinationTypes", (Throwable) null);
                return C62668KkU.STORY;
        }
    }

    public static final C59725JVj A08(Integer num, boolean z) {
        if (!z) {
            return C59725JVj.POST_CAPTURE;
        }
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 0) {
                return C59725JVj.LIVE;
            }
            if (intValue == 1) {
                return C59725JVj.CREATE;
            }
        }
        return C59725JVj.PRE_CAPTURE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r10.length() == 0) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0F(X.AnonymousClass84B r16, com.instagram.common.session.UserSession r17, X.C279284yO r18, X.AnonymousClass8DO r19, X.C3504784u r20, java.lang.Integer r21, java.lang.Integer r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, int r28, boolean r29, boolean r30, boolean r31) {
        /*
            r10 = r23
            if (r23 == 0) goto L_0x000b
            int r1 = r10.length()
            r0 = 0
            if (r1 != 0) goto L_0x000c
        L_0x000b:
            r0 = 1
        L_0x000c:
            java.lang.String r6 = "CameraLoggerHelper"
            r1 = 0
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = "Unable to log effect applied with missing effect id"
        L_0x0013:
            X.0kD.A07(r6, r0, r1)
            return
        L_0x0017:
            r0 = r19
            java.lang.Integer r5 = r0.B09(r10)
            if (r5 != 0) goto L_0x0030
            java.lang.StringBuilder r4 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Could not find effect position for effect id: "
            r4.append(r0)
            r4.append(r10)
        L_0x002b:
            java.lang.String r0 = r4.toString()
            goto L_0x0013
        L_0x0030:
            r3 = r16
            if (r16 != 0) goto L_0x0041
            java.lang.StringBuilder r4 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Source is invalid value: "
            r4.append(r0)
            r4.append(r3)
            goto L_0x002b
        L_0x0041:
            r2 = r18
            if (r18 != 0) goto L_0x0052
            java.lang.StringBuilder r4 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Camera Destination is invalid value : "
            r4.append(r0)
            r4.append(r2)
            goto L_0x002b
        L_0x0052:
            r0 = r29
            r4 = r22
            X.JVj r8 = A08(r4, r0)
            r7 = r20
            if (r20 == 0) goto L_0x00b9
            com.instagram.user.model.Product r4 = r7.A04()
            if (r4 == 0) goto L_0x00bd
            com.instagram.user.model.User r0 = r4.A0B
            if (r0 == 0) goto L_0x00b7
            java.lang.String r14 = X.AnonymousClass3ZA.A00(r0)
        L_0x006c:
            java.lang.String r15 = r4.A0H
            com.instagram.user.model.Product r0 = r7.A04()
            if (r0 == 0) goto L_0x00b5
            java.lang.String r4 = r0.A0H
        L_0x0076:
            com.instagram.model.shopping.ProductItemWithAR r0 = r7.A01
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r0.A01
            java.lang.String r0 = r0.A0h
            boolean r0 = X.0qQ.A0K(r0, r4)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
        L_0x0084:
            X.8xY r0 = X.AnonymousClass8YC.A00(r3)
            int r18 = A03(r21)
            X.27r r7 = X.27p.A01(r17)
            int r19 = r5.intValue()
            X.C359198cG.A00(r2)
            int r21 = X.C371078xX.A00(r3)
            if (r0 == 0) goto L_0x00a1
            java.util.List r1 = X.AnonymousClass7TE.A1I(r0)
        L_0x00a1:
            r22 = r30
            r23 = r31
            r11 = r24
            r12 = r25
            r13 = r26
            r16 = r27
            r20 = r28
            r17 = r1
            r7.A1P(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return
        L_0x00b5:
            r4 = 0
            goto L_0x0076
        L_0x00b7:
            r14 = r1
            goto L_0x006c
        L_0x00b9:
            r14 = r1
            r15 = r1
            r9 = r1
            goto L_0x0084
        L_0x00bd:
            r0 = 998(0x3e6, float:1.398E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59895JbK.A0F(X.84B, com.instagram.common.session.UserSession, X.4yO, X.8DO, X.84u, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, boolean, boolean):void");
    }

    public static final int A01(C365758nd r5) {
        int ordinal = r5.ordinal();
        if (ordinal == 0) {
            return 1;
        }
        if (ordinal == 1) {
            return 2;
        }
        if (ordinal == 2) {
            return 1;
        }
        0kD.A07("CameraLoggerHelper", AnonymousClass7TG.A0m(r5, "Unsupported MediaType: ", AnonymousClass7TE.A1A()), (Throwable) null);
        return 3;
    }

    public static final Pair A04(List list, List list2) {
        String str;
        String str2;
        String A0D;
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C255783ui A0o = JTO.A0o(it);
                if (0qQ.A0K(A0o.A1k, C273654mx.A00(92))) {
                    String str3 = A0o.A1k;
                    C42131BIk bIk = A0o.A0o;
                    if (bIk == null) {
                        A0D = "";
                    } else {
                        ProductCollection productCollection = bIk.A02;
                        if (productCollection != null) {
                            str2 = productCollection.Aoi();
                        } else {
                            str2 = null;
                        }
                        A0D = 002.A0D(str2, '_');
                    }
                    str = 002.A0R(str3, A0D);
                } else {
                    str = A0o.A1k;
                    0qQ.A0A(str);
                }
                A1C.add(str);
                A1C2.add(A0o.A11.A00);
            }
        }
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                C255783ui A0o2 = JTO.A0o(it2);
                String str4 = A0o2.A1i;
                if (str4 != null) {
                    A1C.add(str4);
                    String str5 = A0o2.A1h;
                    if (str5 == null) {
                        str5 = "";
                    }
                    A1C2.add(str5);
                }
            }
        }
        return new Pair(A1C, A1C2);
    }

    public static final ArrayList A0C(CameraAREffect cameraAREffect, CameraAREffect cameraAREffect2) {
        String str;
        String str2;
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (!(cameraAREffect == null || !cameraAREffect.A0D() || (str2 = cameraAREffect.A0B) == null)) {
            A1C.add(str2);
        }
        if (!(cameraAREffect2 == null || !cameraAREffect2.A0D() || (str = cameraAREffect2.A0B) == null)) {
            A1C.add(str);
        }
        return A1C;
    }

    /* JADX WARNING: type inference failed for: r12v1, types: [com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x022a, code lost:
        if (r55 != null) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x027e, code lost:
        if (r10.A0L() != false) goto L_0x0280;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0124, code lost:
        if (r63 != null) goto L_0x00cf;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0219 A[LOOP:7: B:123:0x0213->B:125:0x0219, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x034a  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0352  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x03ae  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0105 A[LOOP:2: B:50:0x00ff->B:52:0x0105, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo A0A(android.util.Pair r50, X.C48143EZl r51, X.293 r52, X.AnonymousClass9I6 r53, com.instagram.api.schemas.ACRType r54, com.instagram.camera.effect.models.CameraAREffect r55, com.instagram.common.session.UserSession r56, X.LMJ r57, com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation r58, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r59, X.AnonymousClass8DO r60, X.C365758nd r61, com.instagram.music.common.model.MusicBrowseCategory r62, com.instagram.reels.prompt.model.PromptStickerModel r63, java.lang.Integer r64, java.lang.Integer r65, java.lang.String r66, java.lang.String r67, java.lang.String r68, java.lang.String r69, java.lang.String r70, java.lang.String r71, java.lang.String r72, java.lang.String r73, java.lang.String r74, java.lang.String r75, java.util.HashMap r76, java.util.List r77, java.util.List r78, java.util.List r79, java.util.List r80, java.util.List r81, java.util.List r82, int r83, int r84, int r85, long r86, boolean r88, boolean r89, boolean r90, boolean r91, boolean r92, boolean r93, boolean r94, boolean r95) {
        /*
            r30 = r89
            r32 = r76
            r9 = 0
            r8 = 0
            r3 = r60
            r13 = r56
            X.AnonymousClass7TF.A1E(r13, r8, r3)
            r1 = 35
            r49 = r59
            r0 = r49
            java.util.ArrayList r29 = X.AnonymousClass7TF.A0q(r0, r1)
            java.util.LinkedHashMap r0 = X.AnonymousClass7TE.A1H()
            java.util.ArrayList r28 = X.AnonymousClass7TE.A1C()
            if (r79 == 0) goto L_0x009a
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r5 = r79.iterator()
        L_0x0029:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0042
            java.lang.Object r4 = r5.next()
            r1 = r4
            com.instagram.model.effect.AREffect r1 = (com.instagram.model.effect.AREffect) r1
            if (r1 == 0) goto L_0x0029
            boolean r1 = r1.A0D()
            if (r1 == 0) goto L_0x0029
            r2.add(r4)
            goto L_0x0029
        L_0x0042:
            java.util.Iterator r6 = r2.iterator()
        L_0x0046:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x009b
            java.lang.Object r5 = r6.next()
            com.instagram.camera.effect.models.CameraAREffect r5 = (com.instagram.camera.effect.models.CameraAREffect) r5
            if (r5 == 0) goto L_0x0046
            java.lang.String r4 = r5.A0M
            X.0qQ.A07(r4)
            r1 = r29
            r1.add(r4)
            java.lang.String r1 = r5.A0K
            X.0qQ.A07(r1)
            java.lang.Integer r1 = r3.B09(r1)
            if (r1 != 0) goto L_0x0090
            r1 = 1044(0x414, float:1.463E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r1)
            java.lang.String r1 = r5.A0K
            java.lang.String r4 = X.002.A0R(r4, r1)
            java.lang.String r1 = "CameraLoggerHelper"
            X.0kD.A07(r1, r4, r9)
        L_0x007a:
            java.lang.String r4 = r5.A0K
            java.lang.String r1 = r5.A0Q
            X.8xY r1 = X.2AL.A04(r4, r1)
            if (r1 == 0) goto L_0x0046
            java.lang.String r4 = r1.toString()
            if (r4 == 0) goto L_0x0046
            r1 = r28
            r1.add(r4)
            goto L_0x0046
        L_0x0090:
            java.lang.String r4 = r5.A0K
            java.lang.String r1 = r1.toString()
            r0.put(r4, r1)
            goto L_0x007a
        L_0x009a:
            r2 = 0
        L_0x009b:
            r4 = 0
            r3 = r55
            if (r2 != 0) goto L_0x0176
            if (r55 != 0) goto L_0x0176
            X.0sn r7 = X.0sn.A00
        L_0x00a4:
            r31 = r84
            if (r2 != 0) goto L_0x012a
            if (r84 > 0) goto L_0x012a
            X.0sn r6 = X.0sn.A00
        L_0x00ac:
            r2 = r64
            r48 = r83
            r1 = r48
            int r27 = X.2AL.A00(r13, r2, r1)
            r10 = r63
            if (r63 == 0) goto L_0x00bc
            java.lang.String r4 = r10.A04
        L_0x00bc:
            java.lang.String r26 = X.C358188aV.A01(r4)
            r5 = 1
            if (r63 == 0) goto L_0x0122
            boolean r1 = r10.A0F()
            if (r1 != r5) goto L_0x0122
            com.instagram.api.schemas.StoryPromptTappableDataIntf r1 = r10.A00
            java.lang.String r25 = r1.getText()
        L_0x00cf:
            boolean r1 = r10.A0F()
            if (r1 != r5) goto L_0x0127
            java.lang.String r1 = r10.A03
            if (r1 == 0) goto L_0x0127
            java.lang.Long r24 = X.AnonymousClass7TE.A10(r1)
        L_0x00dd:
            r23 = 0
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.util.HashMap r22 = X.AnonymousClass7TE.A1E()
            int r21 = A01(r61)
            java.lang.String r1 = "front"
            r2 = r66
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x0117
            r4 = 1
        L_0x00f7:
            android.os.Bundle r20 = X.AnonymousClass7TE.A0a()
            java.util.Iterator r11 = X.AnonymousClass7TF.A0s(r0)
        L_0x00ff:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x01c9
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r11)
            java.lang.String r2 = X.DbT.A13(r0)
            java.lang.String r1 = X.DbS.A0s(r0)
            r0 = r20
            r0.putString(r2, r1)
            goto L_0x00ff
        L_0x0117:
            java.lang.String r1 = "back"
            boolean r1 = X.0qQ.A0K(r2, r1)
            r4 = -1
            if (r1 == 0) goto L_0x00f7
            r4 = 2
            goto L_0x00f7
        L_0x0122:
            r25 = 0
            if (r63 == 0) goto L_0x0127
            goto L_0x00cf
        L_0x0127:
            r24 = 0
            goto L_0x00dd
        L_0x012a:
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            if (r2 == 0) goto L_0x016b
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r10 = r2.iterator()
        L_0x0138:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0151
            java.lang.Object r2 = r10.next()
            r1 = r2
            com.instagram.model.effect.AREffect r1 = (com.instagram.model.effect.AREffect) r1
            if (r1 == 0) goto L_0x0138
            boolean r1 = r1.A0D()
            if (r1 == 0) goto L_0x0138
            r5.add(r2)
            goto L_0x0138
        L_0x0151:
            java.util.Iterator r2 = r5.iterator()
        L_0x0155:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x016b
            java.lang.Object r1 = r2.next()
            com.instagram.camera.effect.models.CameraAREffect r1 = (com.instagram.camera.effect.models.CameraAREffect) r1
            if (r1 == 0) goto L_0x0155
            java.lang.String r1 = r1.A0K
            if (r1 == 0) goto L_0x0155
            r6.add(r1)
            goto L_0x0155
        L_0x016b:
            if (r84 <= 0) goto L_0x00ac
            java.lang.String r1 = java.lang.String.valueOf(r31)
            r6.add(r1)
            goto L_0x00ac
        L_0x0176:
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            if (r2 == 0) goto L_0x01b7
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r10 = r2.iterator()
        L_0x0184:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x019d
            java.lang.Object r5 = r10.next()
            r1 = r5
            com.instagram.model.effect.AREffect r1 = (com.instagram.model.effect.AREffect) r1
            if (r1 == 0) goto L_0x0184
            boolean r1 = r1.A0D()
            if (r1 == 0) goto L_0x0184
            r6.add(r5)
            goto L_0x0184
        L_0x019d:
            java.util.Iterator r5 = r6.iterator()
        L_0x01a1:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x01b7
            java.lang.Object r1 = r5.next()
            com.instagram.camera.effect.models.CameraAREffect r1 = (com.instagram.camera.effect.models.CameraAREffect) r1
            if (r1 == 0) goto L_0x01a1
            java.lang.String r1 = r1.A0B
            if (r1 == 0) goto L_0x01a1
            r7.add(r1)
            goto L_0x01a1
        L_0x01b7:
            r5 = 1
            if (r55 == 0) goto L_0x00a4
            boolean r1 = r3.A0D()
            if (r1 != r5) goto L_0x00a4
            java.lang.String r1 = r3.A0B
            if (r1 == 0) goto L_0x00a4
            r7.add(r1)
            goto L_0x00a4
        L_0x01c9:
            if (r76 != 0) goto L_0x01cf
            java.util.HashMap r32 = X.AnonymousClass7TE.A1E()
        L_0x01cf:
            if (r55 == 0) goto L_0x0228
            java.lang.String r0 = r3.A0K
            if (r0 == 0) goto L_0x0228
            java.util.List r19 = X.AnonymousClass7TE.A1I(r0)
        L_0x01d9:
            java.lang.String r0 = r3.A0M
            if (r0 == 0) goto L_0x022d
            java.util.List r15 = X.AnonymousClass7TE.A1I(r0)
        L_0x01e1:
            r0 = r50
            if (r50 == 0) goto L_0x0225
            java.lang.Object r3 = r0.first
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = r0.second
            java.util.List r2 = (java.util.List) r2
        L_0x01ed:
            r1 = r57
            java.lang.String r0 = r1.A01
            r47 = r0
            java.lang.String r0 = r1.A00
            r46 = r0
            r1 = r53
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0223
            int r11 = r1.A00
        L_0x01ff:
            java.lang.Integer r18 = java.lang.Integer.valueOf(r11)
            if (r0 == 0) goto L_0x0221
            int r0 = r1.A01
        L_0x0207:
            java.lang.Integer r17 = java.lang.Integer.valueOf(r0)
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r11 = r77.iterator()
        L_0x0213:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x022f
            java.lang.Object r0 = r11.next()
            X.DbU.A1X(r0, r1)
            goto L_0x0213
        L_0x0221:
            r0 = 0
            goto L_0x0207
        L_0x0223:
            r11 = 0
            goto L_0x01ff
        L_0x0225:
            r3 = 0
            r2 = 0
            goto L_0x01ed
        L_0x0228:
            r19 = 0
            if (r55 == 0) goto L_0x022d
            goto L_0x01d9
        L_0x022d:
            r15 = 0
            goto L_0x01e1
        L_0x022f:
            boolean r0 = A00
            if (r0 == 0) goto L_0x0235
            r30 = 1
        L_0x0235:
            r0 = -1
            if (r52 == 0) goto L_0x0244
            int r11 = r52.ordinal()
            r12 = 2
            if (r11 == r5) goto L_0x0255
            if (r11 == r8) goto L_0x0253
            if (r11 != r12) goto L_0x0244
            r0 = 3
        L_0x0244:
            r11 = -1
            if (r51 == 0) goto L_0x0265
            int r12 = r51.ordinal()
            switch(r12) {
                case -1: goto L_0x0265;
                case 0: goto L_0x0257;
                case 1: goto L_0x0259;
                case 2: goto L_0x025b;
                case 3: goto L_0x025d;
                case 4: goto L_0x0261;
                case 5: goto L_0x025f;
                case 6: goto L_0x0263;
                case 7: goto L_0x0267;
                case 8: goto L_0x0269;
                default: goto L_0x024e;
            }
        L_0x024e:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0253:
            r0 = 2
            goto L_0x0244
        L_0x0255:
            r0 = 1
            goto L_0x0244
        L_0x0257:
            r11 = 1
            goto L_0x0269
        L_0x0259:
            r11 = 2
            goto L_0x0269
        L_0x025b:
            r11 = 3
            goto L_0x0269
        L_0x025d:
            r11 = 4
            goto L_0x0269
        L_0x025f:
            r11 = 5
            goto L_0x0269
        L_0x0261:
            r11 = 6
            goto L_0x0269
        L_0x0263:
            r11 = 7
            goto L_0x0269
        L_0x0265:
            r11 = -2
            goto L_0x0269
        L_0x0267:
            r11 = 8
        L_0x0269:
            X.0xa r13 = X.AnonymousClass7TE.A0q(r13)
            java.lang.String r12 = "translate_stickers"
            boolean r16 = r13.getBoolean(r12, r8)
            if (r78 == 0) goto L_0x0277
            r23 = r78
        L_0x0277:
            if (r63 == 0) goto L_0x0280
            boolean r10 = r10.A0L()
            r13 = 1
            if (r10 == 0) goto L_0x0281
        L_0x0280:
            r13 = 0
        L_0x0281:
            A00 = r8
            com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo r12 = new com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo
            r12.<init>()
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            r12.A0e = r10
            java.util.HashMap r10 = X.AnonymousClass7TE.A1E()
            r12.A0c = r10
            java.lang.String r14 = ""
            r12.A0O = r14
            com.instagram.common.gallery.metadata.MediaUploadMetadata r10 = new com.instagram.common.gallery.metadata.MediaUploadMetadata
            r33 = r10
            r34 = r9
            r35 = r9
            r36 = r9
            r37 = r9
            r38 = r9
            r39 = r9
            r40 = r9
            r41 = r9
            r42 = r9
            r43 = r9
            r44 = r9
            r45 = r8
            r33.<init>(r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            r12.A0B = r10
            r10 = r21
            r12.A05 = r10
            r12.A01 = r4
            r4 = r27
            r12.A02 = r4
            r12.A0e = r1
            r1 = r48
            r12.A04 = r1
            r1 = r31
            r12.A03 = r1
            r12.A0g = r6
            r1 = r29
            r12.A0h = r1
            r12.A0f = r7
            java.util.LinkedHashMap r1 = X.C63998LHy.A01(r20)
            r12.A0a = r1
            r1 = r28
            r12.A0j = r1
            r1 = r67
            r12.A0V = r1
            r1 = r32
            r12.A0b = r1
            r1 = r88
            r12.A0v = r1
            r1 = r85
            r12.A06 = r1
            r1 = r19
            r12.A0l = r1
            r12.A0m = r15
            r12.A0n = r3
            r12.A0o = r2
            r1 = r22
            r12.A0c = r1
            r1 = r69
            r12.A0L = r1
            r1 = r70
            r12.A0M = r1
            r1 = r47
            r12.A0S = r1
            r1 = r46
            r12.A0R = r1
            r12.A0G = r9
            r1 = r68
            r12.A0Z = r1
            r1 = r18
            r12.A0H = r1
            r1 = r17
            r12.A0I = r1
            r12.A0N = r9
            r1 = r30
            r12.A0w = r1
            r1 = r62
            r12.A0E = r1
            r1 = r90
            r12.A0x = r1
            r1 = r86
            r12.A09 = r1
            r1 = r58
            r12.A0C = r1
            r1 = r91
            r12.A0z = r1
            r1 = r65
            r12.A0F = r1
            r1 = r92
            r12.A0y = r1
            r12.A0D = r9
            r1 = r23
            r12.A0d = r1
            r1 = r93
            r12.A13 = r1
            r1 = 0
            if (r80 == 0) goto L_0x03ae
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1D(r80)
        L_0x034e:
            r12.A0k = r2
            if (r81 == 0) goto L_0x0356
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r81)
        L_0x0356:
            r12.A0p = r1
            r12.A08 = r0
            r12.A00 = r11
            r0 = r54
            r12.A0A = r0
            X.8aU r0 = X.C358168aT.A00(r49)
            if (r0 == 0) goto L_0x036c
            java.lang.String r0 = r0.name()
            if (r0 != 0) goto L_0x036d
        L_0x036c:
            r0 = r14
        L_0x036d:
            r12.A0O = r0
            r12.A0Y = r9
            r12.A0r = r8
            r12.A0s = r8
            r12.A0t = r8
            r12.A0u = r8
            r0 = r95
            r12.A12 = r0
            r0 = r26
            r12.A0X = r0
            r0 = r25
            r12.A0W = r0
            r0 = r24
            r12.A0J = r0
            r12.A07 = r5
            r12.A10 = r13
            r0 = r75
            r12.A0K = r0
            r0 = r82
            r12.A0i = r0
            r0 = r71
            r12.A0U = r0
            r0 = r72
            r12.A0T = r0
            r0 = r73
            r12.A0Q = r0
            r0 = r74
            r12.A0P = r0
            r0 = r94
            r12.A11 = r0
            r0 = r16
            r12.A0q = r0
            return r12
        L_0x03ae:
            r2 = r9
            goto L_0x034e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59895JbK.A0A(android.util.Pair, X.EZl, X.293, X.9I6, com.instagram.api.schemas.ACRType, com.instagram.camera.effect.models.CameraAREffect, com.instagram.common.session.UserSession, X.LMJ, com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, X.8DO, X.8nd, com.instagram.music.common.model.MusicBrowseCategory, com.instagram.reels.prompt.model.PromptStickerModel, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.HashMap, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, int, int, int, long, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo");
    }

    public static final void A0E(C62668KkU kkU, UserSession userSession, C279284yO r147, ShareMediaLoggingInfo shareMediaLoggingInfo, CreationLayoutConfig creationLayoutConfig, Boolean bool, Integer num, Long l, String str, String str2, String str3, String str4, List list, List list2, List list3) {
        C358178aU r86;
        List list4;
        List list5;
        List list6;
        C62668KkU kkU2 = kkU;
        UserSession userSession2 = userSession;
        AnonymousClass7TF.A1B(userSession2, 0, kkU2);
        ShareMediaLoggingInfo shareMediaLoggingInfo2 = shareMediaLoggingInfo;
        String str5 = str;
        C51973G9u.A0t(5, r147, str5, shareMediaLoggingInfo2);
        Integer num2 = shareMediaLoggingInfo2.A0H;
        Integer num3 = shareMediaLoggingInfo2.A0I;
        List list7 = null;
        new AnonymousClass9I6(0, 0, 7, 0, false);
        if (!(num2 == null || num3 == null)) {
            int intValue = num2.intValue();
            int intValue2 = num3.intValue();
            new AnonymousClass9I6(C51970G9q.A1W(intValue, intValue2), intValue, intValue2, 0);
        }
        int A002 = 2AL.A00(userSession2, num, shareMediaLoggingInfo2.A04);
        HashMap A1E = AnonymousClass7TE.A1E();
        HashMap hashMap = shareMediaLoggingInfo2.A0b;
        if (hashMap != null) {
            Iterator A0s = AnonymousClass7TF.A0s(hashMap);
            while (A0s.hasNext()) {
                JTR.A1U(A1E, (Map.Entry) AnonymousClass7TF.A0a(A0s));
            }
        }
        29f A0c = JTO.A0c(userSession2);
        C59793JYm A03 = 2AL.A03(shareMediaLoggingInfo2.A04);
        28t A05 = A05(shareMediaLoggingInfo2.A05);
        int A032 = A03(Integer.valueOf(shareMediaLoggingInfo2.A01));
        int i = shareMediaLoggingInfo2.A03;
        List list8 = shareMediaLoggingInfo2.A0g;
        List list9 = shareMediaLoggingInfo2.A0h;
        List list10 = shareMediaLoggingInfo2.A0f;
        HashMap hashMap2 = shareMediaLoggingInfo2.A0a;
        List list11 = shareMediaLoggingInfo2.A0j;
        boolean z = shareMediaLoggingInfo2.A0v;
        int i2 = shareMediaLoggingInfo2.A06;
        List list12 = shareMediaLoggingInfo2.A0l;
        List list13 = shareMediaLoggingInfo2.A0m;
        Pair A003 = shareMediaLoggingInfo2.A00();
        String str6 = shareMediaLoggingInfo2.A0L;
        String str7 = shareMediaLoggingInfo2.A0M;
        String str8 = shareMediaLoggingInfo2.A0N;
        C59725JVj jVj = C59725JVj.POST_CAPTURE;
        boolean z2 = shareMediaLoggingInfo2.A0x;
        MediaTransformation mediaTransformation = shareMediaLoggingInfo2.A0C;
        Integer num4 = shareMediaLoggingInfo2.A0F;
        boolean z3 = shareMediaLoggingInfo2.A0y;
        String str9 = shareMediaLoggingInfo2.A0O;
        if (str9 == null || str9.length() == 0) {
            r86 = null;
        } else {
            r86 = C358178aU.valueOf(str9);
        }
        List list14 = shareMediaLoggingInfo2.A0d;
        GallerySuggestionsInfo gallerySuggestionsInfo = shareMediaLoggingInfo2.A0D;
        Long A0j = C51972G9s.A0j(str4);
        boolean z4 = shareMediaLoggingInfo2.A12;
        String str10 = shareMediaLoggingInfo2.A0X;
        int i3 = shareMediaLoggingInfo2.A07;
        boolean z5 = shareMediaLoggingInfo2.A10;
        String str11 = shareMediaLoggingInfo2.A0K;
        List list15 = shareMediaLoggingInfo2.A0i;
        String str12 = shareMediaLoggingInfo2.A0U;
        String str13 = shareMediaLoggingInfo2.A0T;
        String str14 = shareMediaLoggingInfo2.A0Q;
        String str15 = shareMediaLoggingInfo2.A0W;
        Long l2 = shareMediaLoggingInfo2.A0J;
        if (l != null) {
            list4 = AnonymousClass7TE.A1I(C51968G9o.A0v(l));
        } else {
            list4 = null;
        }
        if (str3 != null) {
            list5 = AnonymousClass7TE.A1I(str3);
        } else {
            list5 = null;
        }
        List list16 = list2;
        List list17 = list3;
        Boolean bool2 = bool;
        List list18 = list;
        A0c.A0S(A003, (C62643Kk5) null, (C279294yP) null, A03, A05, r86, kkU2, jVj, (293) null, (C62649KkB) null, r147, mediaTransformation, gallerySuggestionsInfo, bool2, (Boolean) null, (Boolean) null, num4, (Integer) null, A0j, l2, str6, str7, str8, (String) null, str6, str5, (String) null, (String) null, str10, str11, str12, str13, str14, str2, str15, (String) null, list18, list8, list9, list10, list11, list12, list13, list14, (List) null, list16, list17, list15, (List) null, list4, list5, hashMap2, A032, A002, i, i2, i3, z, z2, z3, false, false, z4, z5, false, false);
        29f A0c2 = JTO.A0c(userSession2);
        int i4 = shareMediaLoggingInfo2.A04;
        C59793JYm A033 = 2AL.A03(i4);
        28t A052 = A05(shareMediaLoggingInfo2.A05);
        int A034 = A03(Integer.valueOf(shareMediaLoggingInfo2.A01));
        int i5 = shareMediaLoggingInfo2.A03;
        List list19 = shareMediaLoggingInfo2.A0g;
        List list20 = shareMediaLoggingInfo2.A0h;
        List list21 = shareMediaLoggingInfo2.A0f;
        HashMap hashMap3 = shareMediaLoggingInfo2.A0a;
        List list22 = shareMediaLoggingInfo2.A0j;
        boolean z6 = shareMediaLoggingInfo2.A0v;
        int i6 = shareMediaLoggingInfo2.A06;
        List list23 = shareMediaLoggingInfo2.A0l;
        List list24 = shareMediaLoggingInfo2.A0m;
        Pair A004 = shareMediaLoggingInfo2.A00();
        String str16 = shareMediaLoggingInfo2.A0L;
        String str17 = shareMediaLoggingInfo2.A0M;
        String str18 = shareMediaLoggingInfo2.A0N;
        boolean z7 = shareMediaLoggingInfo2.A0x;
        MediaTransformation mediaTransformation2 = shareMediaLoggingInfo2.A0C;
        Integer num5 = shareMediaLoggingInfo2.A0F;
        boolean z8 = shareMediaLoggingInfo2.A0y;
        List list25 = shareMediaLoggingInfo2.A0d;
        GallerySuggestionsInfo gallerySuggestionsInfo2 = shareMediaLoggingInfo2.A0D;
        List A1I = AnonymousClass7TE.A1I(kkU2);
        C48143EZl A02 = 2AL.A02(shareMediaLoggingInfo2.A00);
        ACRType aCRType = shareMediaLoggingInfo2.A0A;
        boolean z9 = shareMediaLoggingInfo2.A12;
        String str19 = shareMediaLoggingInfo2.A0X;
        int i7 = shareMediaLoggingInfo2.A07;
        boolean z10 = shareMediaLoggingInfo2.A10;
        MediaUploadMetadata mediaUploadMetadata = shareMediaLoggingInfo2.A0B;
        List list26 = shareMediaLoggingInfo2.A0i;
        String str20 = shareMediaLoggingInfo2.A0U;
        String str21 = shareMediaLoggingInfo2.A0T;
        String str22 = shareMediaLoggingInfo2.A0Q;
        String str23 = shareMediaLoggingInfo2.A0P;
        boolean z11 = shareMediaLoggingInfo2.A11;
        String str24 = shareMediaLoggingInfo2.A0W;
        Long l3 = shareMediaLoggingInfo2.A0J;
        if (l != null) {
            list6 = AnonymousClass7TE.A1I(C51968G9o.A0v(l));
        } else {
            list6 = null;
        }
        if (str3 != null) {
            list7 = AnonymousClass7TE.A1I(str3);
        }
        A0c2.A0T(A004, A02, (C279294yP) null, A033, A052, jVj, (293) null, (XSI) null, (C62649KkB) null, aCRType, mediaUploadMetadata, r147, mediaTransformation2, creationLayoutConfig, gallerySuggestionsInfo2, (C254743sy) null, bool2, (Boolean) null, (Boolean) null, (Boolean) null, num5, (Integer) null, (Long) null, l3, str16, str17, str18, (String) null, str16, (String) null, str5, (String) null, (String) null, str19, str20, str21, str22, str23, str24, (String) null, list18, list19, list20, list21, list22, list23, list24, (List) null, list25, (List) null, list16, list17, A1I, list26, (List) null, list6, list7, hashMap3, (Map) null, i4, A034, A002, i5, i6, i7, z6, z7, z8, false, false, z9, z10, z11, false, false);
    }
}
