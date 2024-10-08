package X;

import android.content.Context;
import android.graphics.Point;
import android.location.Location;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.JYq  reason: case insensitive filesystem */
public abstract class C59797JYq {
    public static C254933tI A00(UserSession userSession, C381779cJ r5) {
        String str;
        if (!(r5 == null || (str = r5.A02) == null)) {
            try {
                return C254933tI.A00(0c9.A04.A01(userSession, str));
            } catch (IOException e) {
                0kD.A07("StoryPendingMediaUtil", AnonymousClass000.A00(2271), e);
            }
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.KH4, X.11X] */
    public static void A05(Context context, UserSession userSession, AnonymousClass4D6 r19, 1GK r20, L83 l83, FilterGroupModel filterGroupModel, AnonymousClass3Q2 r23, C352218Cl r24, Runnable runnable, boolean z) {
        Context context2 = context;
        UserSession userSession2 = userSession;
        C65045LmP lmP = new C65045LmP(1, context2, userSession2, r23, runnable);
        C62461KgB[] kgBArr = {C62461KgB.UPLOAD};
        L83 l832 = l83;
        C352218Cl r9 = r24;
        1GK r4 = r20;
        ? kh4 = new KH4(context2, userSession2, r4, new C65042LmL(context2, userSession2, l832, r9, kgBArr, z), lmP, l832, filterGroupModel, r9, kgBArr, false, false, false);
        AnonymousClass4D6 r0 = r19;
        if (r19 == null) {
            1ES.A03(kh4);
        } else {
            r0.schedule(kh4);
        }
    }

    public static void A07(Context context, UserSession userSession, AnonymousClass3Q2 r4, String str) {
        r4.A5g = false;
        28K.A00(userSession).A04(r4.A35, str);
        JTP.A1M(userSession);
        11Z.A02(new C65987M6y(context, str));
    }

    public static void A08(Location location, CameraAREffect cameraAREffect, UserSession userSession, TransformMatrixConfig transformMatrixConfig, AnonymousClass802 r13, AnonymousClass8PW r14, FilterGroupModel filterGroupModel, AnonymousClass3QS r16, AnonymousClass8VT r17, AnonymousClass3Q2 r18, AnonymousClass3QG r19, Integer num, Integer num2, boolean z, boolean z2, boolean z3, boolean z4) {
        List list;
        List list2;
        List list3;
        List list4;
        FilterGroupModel filterGroupModel2 = filterGroupModel;
        AnonymousClass3Q2 r6 = r18;
        C59794JYn jYn = new C59794JYn(r6);
        AnonymousClass3QG r4 = r19;
        AnonymousClass3QG r1 = r4;
        if (r19 == null) {
            r1 = new AnonymousClass3QG();
        }
        AnonymousClass3Q2 r0 = jYn.A01;
        r0.A1i = r1;
        r0.A5F = z2;
        r6.A69 = z;
        r6.A16 = transformMatrixConfig;
        AnonymousClass3QS r12 = r16;
        0qQ.A0B(r12, 0);
        r6.A1V = r12;
        if (!(r19 == null || (list = r4.A03) == null || Collections.unmodifiableList(list) == null || (list2 = r4.A02) == null || Collections.unmodifiableList(list2) == null)) {
            List list5 = r4.A03;
            if (list5 != null) {
                list3 = Collections.unmodifiableList(list5);
            } else {
                list3 = null;
            }
            List list6 = r4.A02;
            if (list6 != null) {
                list4 = Collections.unmodifiableList(list6);
            } else {
                list4 = null;
            }
            AnonymousClass3QG r02 = r6.A1i;
            r02.A03 = list3;
            r02.A02 = list4;
        }
        boolean z5 = z3;
        r6.A60 = z5;
        r6.A61 = z4;
        if (filterGroupModel != null) {
            AJ8.A03(((FilterGroupModelImpl) filterGroupModel2).A02, r6, z5);
        } else if (!z4) {
            0kD.A01("StoryPendingMediaUtil", Pxd.A00(126));
        }
        UserSession userSession2 = userSession;
        CameraAREffect cameraAREffect2 = cameraAREffect;
        Location location2 = location;
        AnonymousClass802 r3 = r13;
        AnonymousClass8PW r42 = r14;
        AnonymousClass8VT r5 = r17;
        A09(location2, cameraAREffect2, userSession2, r3, r42, r5, r6, num, num2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r1v26, types: [X.L4w, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v103, types: [X.L27, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x021d, code lost:
        if (X.1Au.A00(r5).A1h() == false) goto L_0x021f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0263 A[EDGE_INSN: B:205:0x0263->B:152:0x0263 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A09(android.location.Location r21, com.instagram.camera.effect.models.CameraAREffect r22, com.instagram.common.session.UserSession r23, X.AnonymousClass802 r24, X.AnonymousClass8PW r25, X.AnonymousClass8VT r26, X.AnonymousClass3Q2 r27, java.lang.Integer r28, java.lang.Integer r29) {
        /*
            r9 = 0
            r7 = 0
            com.instagram.common.gallery.metadata.MediaUploadMetadata r8 = new com.instagram.common.gallery.metadata.MediaUploadMetadata
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            r15 = r9
            r16 = r9
            r17 = r9
            r18 = r9
            r19 = r9
            r20 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r3 = r25
            X.8Nz r0 = r3.A06
            java.lang.String r0 = r0.A00()
            r4 = r27
            r4.A2Z = r0
            java.util.List r1 = r3.A0A
            if (r1 == 0) goto L_0x0039
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0039
            r4.A4C = r1
            java.lang.Object r0 = r1.get(r7)
            com.instagram.pendingmedia.model.BrandedContentTag r0 = (com.instagram.pendingmedia.model.BrandedContentTag) r0
            boolean r0 = r0.A04
            r4.A65 = r0
        L_0x0039:
            com.instagram.api.schemas.BrandedContentProjectMetadata r0 = r3.A03
            if (r0 == 0) goto L_0x003f
            r4.A0t = r0
        L_0x003f:
            boolean r0 = r3.A0Q
            r4.A5i = r0
            boolean r0 = r3.A0N
            r4.A51 = r0
            com.instagram.api.schemas.BrandedContentGatingInfo r0 = r3.A02
            if (r0 == 0) goto L_0x004d
            r4.A0s = r0
        L_0x004d:
            com.instagram.api.schemas.MediaGenAIDetectionMethod r0 = r3.A04
            if (r0 == 0) goto L_0x0053
            r4.A0w = r0
        L_0x0053:
            X.3WT r1 = X.AnonymousClass3WT.LOCATION
            java.util.List r0 = r3.A0E
            X.3ui r0 = X.AnonymousClass497.A00(r1, r0)
            if (r0 == 0) goto L_0x006b
            if (r21 == 0) goto L_0x006b
            double r0 = r21.getLatitude()
            r4.A00 = r0
            double r0 = r21.getLongitude()
            r4.A01 = r0
        L_0x006b:
            X.JYe r1 = new X.JYe
            r1.<init>(r4)
            X.28D r5 = r4.A0i
            r6 = r29
            java.lang.String r0 = X.C363828kP.A00(r6)
            X.3Q2 r2 = r1.A00
            r2.A2V = r0
            r2.A2D = r9
            int r1 = r6.intValue()
            r0 = 9
            if (r1 == r0) goto L_0x0203
            if (r1 == r7) goto L_0x01ff
            r0 = 1
            if (r1 != r0) goto L_0x01fb
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r1 = r28
            if (r1 != r0) goto L_0x01fb
            java.lang.String r0 = "create_mode"
        L_0x0093:
            r2.A2h = r0
            X.28D r0 = X.28D.A5G
            if (r5 == r0) goto L_0x00b3
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x00b3
            r1 = r24
            if (r24 == 0) goto L_0x00b3
            X.87I r0 = r1.A06
            if (r0 == 0) goto L_0x00ad
            java.lang.String r0 = r0.A00
            r2.A2Y = r0
        L_0x00ad:
            java.lang.String r0 = r1.A09
            if (r0 == 0) goto L_0x00b3
            r2.A3T = r0
        L_0x00b3:
            if (r21 == 0) goto L_0x00cf
            double r5 = r21.getLatitude()
            double r7 = r21.getLongitude()
            X.L4w r1 = new X.L4w
            r1.<init>()
            r1.A00 = r5
            r1.A01 = r7
            X.L27 r0 = new X.L27
            r0.<init>()
            r0.A00 = r1
            r2.A1Z = r0
        L_0x00cf:
            java.util.List r1 = r3.A0D
            if (r1 == 0) goto L_0x00db
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00db
            r2.A4Z = r1
        L_0x00db:
            java.util.List r0 = r3.A0C
            if (r0 == 0) goto L_0x00e1
            r2.A4Y = r0
        L_0x00e1:
            java.util.List r0 = r3.A0I
            if (r0 == 0) goto L_0x00e7
            r2.A4l = r0
        L_0x00e7:
            java.util.List r1 = r3.A0H
            if (r1 == 0) goto L_0x00f3
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00f3
            r2.A4k = r1
        L_0x00f3:
            java.util.List r1 = r3.A0G
            if (r1 == 0) goto L_0x00ff
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00ff
            r2.A4h = r1
        L_0x00ff:
            java.util.List r1 = r3.A0J
            boolean r0 = X.AnonymousClass3S1.A04(r1)
            if (r0 != 0) goto L_0x0109
            r2.A4o = r1
        L_0x0109:
            java.util.List r1 = r3.A0F
            r2.A4g = r1
            java.util.List r0 = r3.A0B
            r2.A4P = r0
            X.6Ma r0 = X.C306406Ma.A00
            r7 = 0
            if (r1 == 0) goto L_0x013f
            java.util.Iterator r6 = r1.iterator()
        L_0x011a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x01f8
            java.lang.Object r5 = r6.next()
            r0 = r5
            X.3ui r0 = (X.C255783ui) r0
            java.lang.String r1 = r0.A1h
            X.6oG r0 = X.C318046oG.REELS_VISUAL_REPLIES
            boolean r0 = X.Dba.A1X(r0, r1)
            if (r0 == 0) goto L_0x011a
        L_0x0131:
            X.3ui r5 = (X.C255783ui) r5
            if (r5 == 0) goto L_0x013f
            com.instagram.api.schemas.MediaVCRTappableData r0 = r5.A0K
            if (r0 == 0) goto L_0x013f
            java.lang.String r0 = r0.A04
            if (r0 == 0) goto L_0x013f
            r2.A3U = r0
        L_0x013f:
            java.util.List r7 = r3.A0E
            r8 = 0
            r5 = 24
            if (r7 == 0) goto L_0x0207
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0207
            java.util.List r1 = r2.A4b
            X.3WT r0 = X.AnonymousClass3WT.MUSIC_OVERLAY
            X.3ui r6 = X.AnonymousClass497.A00(r0, r1)
            r1 = r7
            if (r6 == 0) goto L_0x0165
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r7)
            X.3ui r0 = X.AnonymousClass497.A00(r0, r1)
            if (r0 != 0) goto L_0x0165
            r1.add(r6)
        L_0x0165:
            r2.A4b = r1
            java.util.Iterator r9 = r7.iterator()
            r7 = 0
        L_0x016c:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0208
            X.3ui r6 = X.JTO.A0o(r9)
            if (r6 == 0) goto L_0x01ef
            X.3WT r0 = r6.A11
            int r1 = r0.ordinal()
            if (r1 == r5) goto L_0x01ec
            r0 = 4
            if (r1 == r0) goto L_0x01d3
            r0 = 21
            if (r1 == r0) goto L_0x01e7
            r0 = 28
            if (r1 == r0) goto L_0x01c5
            r0 = 31
            if (r1 != r0) goto L_0x016c
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r6.A0F()
            if (r0 == 0) goto L_0x016c
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r6.A0F()
            boolean r0 = r0.A0M()
            if (r0 == 0) goto L_0x016c
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r6.A0F()
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r0.A00
            com.instagram.api.schemas.StoryTemplateDictIntf r0 = r0.C1M()
            if (r0 == 0) goto L_0x016c
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r6.A0F()
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r0.A00
            com.instagram.api.schemas.StoryTemplateDictIntf r0 = r0.C1M()
            java.lang.Boolean r0 = r0.CU1()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x016c
            r0 = 1
            r2.A5X = r0
            goto L_0x016c
        L_0x01c5:
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = r6.A0u
            if (r0 == 0) goto L_0x016c
            com.instagram.api.schemas.MusicProduct r1 = r0.A02
            com.instagram.api.schemas.MusicProduct r0 = com.instagram.api.schemas.MusicProduct.MUSIC_FIRST
            if (r1 != r0) goto L_0x016c
            r0 = 1
            r2.A5d = r0
            goto L_0x016c
        L_0x01d3:
            X.DDv r1 = r6.A1F
            r1.getClass()
            com.instagram.api.schemas.RingSpecImpl r0 = r1.A01
            if (r0 == 0) goto L_0x01e5
            com.instagram.api.schemas.RingSpecImpl r0 = r0.F8l()
        L_0x01e0:
            r2.A0y = r0
            X.3ID r0 = r1.A04
            goto L_0x01e9
        L_0x01e5:
            r0 = 0
            goto L_0x01e0
        L_0x01e7:
            X.3ID r0 = r6.A17
        L_0x01e9:
            r2.A1m = r0
            goto L_0x016c
        L_0x01ec:
            r7 = 1
            goto L_0x016c
        L_0x01ef:
            java.lang.String r1 = "ShareParamsUtil"
            java.lang.String r0 = "we are trying to log a null reel interactive."
            X.0kD.A01(r1, r0)
            goto L_0x016c
        L_0x01f8:
            r5 = r7
            goto L_0x0131
        L_0x01fb:
            java.lang.String r0 = "camera"
            goto L_0x0093
        L_0x01ff:
            java.lang.String r0 = "live"
            goto L_0x0093
        L_0x0203:
            java.lang.String r0 = "clips"
            goto L_0x0093
        L_0x0207:
            r7 = 0
        L_0x0208:
            r5 = r23
            java.lang.Integer r1 = X.JTR.A0w(r5)
            if (r7 != 0) goto L_0x021f
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x021f
            X.1Av r0 = X.1Au.A00(r5)
            boolean r1 = r0.A1h()
            r0 = 1
            if (r1 != 0) goto L_0x0220
        L_0x021f:
            r0 = 0
        L_0x0220:
            r2.A5m = r0
            if (r7 != 0) goto L_0x0235
            X.1Av r7 = X.1Au.A00(r5)
            X.0s0 r6 = r7.A0B
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 234(0xea, float:3.28E-43)
            boolean r0 = X.AnonymousClass7TG.A1a(r7, r6, r1, r0)
            if (r0 == 0) goto L_0x0235
            r8 = 1
        L_0x0235:
            r2.A68 = r8
            java.util.LinkedHashMap r0 = r3.A09
            r7 = 0
            if (r0 == 0) goto L_0x0263
            java.util.Iterator r6 = X.AnonymousClass7TF.A0s(r0)
        L_0x0240:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0263
            java.util.Map$Entry r1 = X.AnonymousClass7TE.A1J(r6)
            java.lang.Object r0 = r1.getKey()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            boolean r0 = X.AnonymousClass9SF.A04(r0)
            if (r0 != 0) goto L_0x0262
            java.lang.Object r0 = r1.getKey()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            X.9X8 r0 = X.AnonymousClass9SF.A01(r0)
            if (r0 == 0) goto L_0x0240
        L_0x0262:
            r7 = 1
        L_0x0263:
            r2.A57 = r7
            X.0eM r0 = r3.A0M
            java.lang.Object r0 = r0.getValue()
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L_0x028c
            java.util.ArrayList r6 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0277:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x028c
            java.lang.Object r0 = r1.next()
            X.9sz r0 = (X.C391429sz) r0
            r2.A0f(r0)
            X.0gF r0 = X.C60340gF.A00
            r6.add(r0)
            goto L_0x0277
        L_0x028c:
            X.0eM r0 = r3.A0L
            java.lang.Object r0 = r0.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            if (r0 == 0) goto L_0x02f1
            java.util.Set r0 = X.00k.A0j(r0)
        L_0x029a:
            r2.A4t = r0
            r1 = r22
            if (r22 == 0) goto L_0x02aa
            r2.A10 = r1
            java.lang.String r0 = r2.A2o
            if (r0 != 0) goto L_0x02aa
            java.lang.String r0 = r1.A0K
            r2.A2o = r0
        L_0x02aa:
            r0 = r26
            if (r26 == 0) goto L_0x02b0
            r4.A1Y = r0
        L_0x02b0:
            java.util.List r0 = r3.A0E
            if (r0 == 0) goto L_0x02f6
            java.util.Iterator r6 = r0.iterator()
        L_0x02b8:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x02f6
            X.3ui r3 = X.JTO.A0o(r6)
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r3.A0F()
            if (r0 == 0) goto L_0x02e2
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r3.A0F()
            boolean r0 = r0.A0A
            if (r0 == 0) goto L_0x02e2
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327258593900847(0x810f730027392f, double:3.036842840687598E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x02e2
            X.9sz r0 = X.C391429sz.A0V
            r4.A0f(r0)
        L_0x02e2:
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = r3.A0u
            if (r0 == 0) goto L_0x02b8
            com.instagram.api.schemas.MusicProduct r1 = r0.A02
            com.instagram.api.schemas.MusicProduct r0 = com.instagram.api.schemas.MusicProduct.MUSIC_FIRST
            if (r1 != r0) goto L_0x02b8
            r0 = 63
            r4.A0K = r0
            goto L_0x02b8
        L_0x02f1:
            java.util.LinkedHashSet r0 = X.DbS.A0y()
            goto L_0x029a
        L_0x02f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59797JYq.A09(android.location.Location, com.instagram.camera.effect.models.CameraAREffect, com.instagram.common.session.UserSession, X.802, X.8PW, X.8VT, X.3Q2, java.lang.Integer, java.lang.Integer):void");
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [X.4a8, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (r1.equals("boomerang") == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0169, code lost:
        if (r13.A1D != false) goto L_0x016b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x02c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass3Q2 A01(X.28D r8, com.instagram.camera.effect.models.CameraAREffect r9, com.instagram.common.session.UserSession r10, com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r11, com.instagram.pendingmedia.model.ClipInfo r12, X.C349307zv r13, java.lang.String r14, java.lang.String r15, boolean r16) {
        /*
            boolean r0 = r13.A18
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0148
            r0 = 0
            X.3Q2 r2 = X.JZ1.A00(r0, r4)
            X.0qQ.A0B(r2, r4)
            X.JYn r6 = new X.JYn
            r6.<init>(r2)
            X.JYe r5 = new X.JYe
            r5.<init>(r2)
            java.lang.String r1 = r12.A0E
            if (r1 == 0) goto L_0x0025
            java.lang.String r0 = "boomerang"
            boolean r1 = r1.equals(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            java.lang.String r1 = r13.A06()
            boolean r7 = r13.A18
            if (r7 == 0) goto L_0x0034
            if (r1 == 0) goto L_0x0034
            X.3Q2 r7 = r6.A01
            r7.A3J = r1
        L_0x0034:
            int r1 = r13.A0F
            X.3Q2 r6 = r6.A01
            r6.A0K = r1
            java.lang.String r1 = r13.A0k
            boolean r1 = X.Q0Y.A03(r1)
            if (r1 != 0) goto L_0x004e
            int r1 = r13.A00
            if (r1 != r3) goto L_0x004e
            java.lang.String r1 = r13.A0k
            java.util.HashMap r1 = X.Q0Y.A02(r1)
            r6.A44 = r1
        L_0x004e:
            java.util.List r1 = java.util.Collections.singletonList(r12)
            X.0qQ.A0B(r1, r4)
            r6.A4G = r1
            X.0qQ.A0B(r12, r4)
            r6.A1N = r12
            int r7 = r12.A09
            int r1 = r12.A06
            r6.A0H = r7
            r6.A0G = r1
            r6.A5F = r0
            boolean r0 = r13.A18
            if (r0 == 0) goto L_0x0130
            long r0 = r13.A0L
            X.3Q2 r6 = r5.A00
            long r0 = X.AnonymousClass7TE.A0P(r0)
            r6.A0X = r0
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r13.A02()
            r6.A13 = r0
            java.lang.String r0 = r13.A0e
            r6.A2O = r0
        L_0x007e:
            java.lang.String r1 = r13.A05()
            if (r1 == 0) goto L_0x0088
            X.3Q2 r0 = r5.A00
            r0.A2o = r1
        L_0x0088:
            java.lang.String r1 = r13.A0g
            if (r1 == 0) goto L_0x0090
            X.3Q2 r0 = r5.A00
            r0.A2V = r1
        L_0x0090:
            java.lang.String r1 = r13.A0j
            if (r1 == 0) goto L_0x0098
            X.3Q2 r0 = r5.A00
            r0.A2n = r1
        L_0x0098:
            X.8GK r1 = r13.A0W
            if (r1 == 0) goto L_0x00a0
            X.3Q2 r0 = r5.A00
            r0.A1b = r1
        L_0x00a0:
            java.lang.String r1 = r13.A0o
            if (r1 == 0) goto L_0x00a8
            X.3Q2 r0 = r5.A00
            r0.A3Y = r1
        L_0x00a8:
            java.lang.String r1 = r13.A0d
            if (r1 == 0) goto L_0x00b0
            X.3Q2 r0 = r5.A00
            r0.A2K = r1
        L_0x00b0:
            java.lang.String r1 = r13.A0l
            if (r1 == 0) goto L_0x00b8
            X.3Q2 r0 = r5.A00
            r0.A2v = r1
        L_0x00b8:
            java.lang.String r7 = r13.A0p
            int r1 = r13.A0D
            int r0 = r13.A0C
            X.3Q2 r6 = r5.A00
            X.4a8 r5 = new X.4a8
            r5.<init>()
            r5.A02 = r7
            r5.A01 = r1
            r5.A00 = r0
            r6.A1g = r5
            boolean r0 = r13.A1F
            r6.A5o = r0
            com.instagram.music.common.model.MusicOverlayStickerModel r5 = r13.A0V
            if (r5 == 0) goto L_0x0106
            java.lang.Boolean r1 = r5.A0J
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            if (r1 == r0) goto L_0x0106
            X.6Ma r0 = X.C306406Ma.A00
            X.0qQ.A0B(r10, r3)
            r7 = 0
            X.3ui r1 = new X.3ui
            r1.<init>()
            X.6KJ r0 = X.AnonymousClass6KJ.HIDDEN
            java.lang.String r0 = r0.toString()
            X.C306406Ma.A05(r10, r5, r1, r0, r7)
            java.util.List r0 = r6.A4b
            if (r0 != 0) goto L_0x00f5
            X.0sn r0 = X.0sn.A00
        L_0x00f5:
            java.util.ArrayList r5 = X.00k.A0U(r0)
            X.3WT r0 = X.AnonymousClass3WT.MUSIC_OVERLAY
            X.3ui r0 = X.AnonymousClass497.A00(r0, r5)
            if (r0 != 0) goto L_0x0104
            r5.add(r1)
        L_0x0104:
            r6.A4b = r5
        L_0x0106:
            java.util.List r0 = r13.A0v
            if (r0 == 0) goto L_0x010c
            r6.A4J = r0
        L_0x010c:
            java.util.List r0 = r13.A0w
            if (r0 == 0) goto L_0x0112
            r6.A4R = r0
        L_0x0112:
            java.util.List r0 = r13.A0u
            if (r0 == 0) goto L_0x0170
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r5 = r0.iterator()
        L_0x011e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x016e
            java.lang.Object r0 = r5.next()
            com.instagram.camera.effect.models.CameraAREffect r0 = (com.instagram.camera.effect.models.CameraAREffect) r0
            java.lang.String r0 = r0.A0K
            r1.add(r0)
            goto L_0x011e
        L_0x0130:
            java.util.HashSet r0 = r13.A08()
            java.util.Iterator r1 = r0.iterator()
        L_0x0138:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x007e
            java.lang.Object r0 = r1.next()
            X.9sz r0 = (X.C391429sz) r0
            r5.A00(r0)
            goto L_0x0138
        L_0x0148:
            java.lang.String r0 = X.JTQ.A0Z()
            X.3Q2 r2 = X.AnonymousClass9T3.A02(r0)
            X.0qQ.A0B(r2, r4)
            X.JYn r6 = new X.JYn
            r6.<init>(r2)
            X.JYe r5 = new X.JYe
            r5.<init>(r2)
            java.lang.String r0 = r13.A0k
            X.JTS.A1R(r2, r0)
            boolean r0 = r13.A1H
            if (r0 == 0) goto L_0x016b
            boolean r1 = r13.A1D
            r0 = 0
            if (r1 == 0) goto L_0x0026
        L_0x016b:
            r0 = 1
            goto L_0x0026
        L_0x016e:
            r6.A4H = r1
        L_0x0170:
            X.8J0 r0 = r13.A0Q
            if (r0 == 0) goto L_0x0176
            r6.A12 = r0
        L_0x0176:
            java.lang.String r0 = r13.A0n
            if (r0 == 0) goto L_0x017c
            r6.A3I = r0
        L_0x017c:
            boolean r0 = r13.A14
            if (r0 == 0) goto L_0x0182
            r6.A5v = r3
        L_0x0182:
            boolean r0 = r13.A13
            r6.A5G = r0
            boolean r0 = r13.A1E
            r6.A5n = r0
            boolean r0 = r13.A1A
            r6.A5k = r0
            java.lang.Integer r0 = r13.A0c
            if (r0 == 0) goto L_0x0194
            r6.A2E = r0
        L_0x0194:
            boolean r0 = r13.A1H
            if (r0 == 0) goto L_0x01ac
            boolean r0 = r13.A1D
            if (r0 != 0) goto L_0x01ac
            X.1Av r5 = X.1Au.A00(r10)
            X.0s0 r7 = r5.A7n
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 29
            boolean r0 = X.AnonymousClass7TG.A1a(r5, r7, r1, r0)
            r6.A62 = r0
        L_0x01ac:
            boolean r0 = r13.A17
            if (r0 == 0) goto L_0x01b2
            r6.A5W = r3
        L_0x01b2:
            boolean r0 = r13.A1B
            if (r0 == 0) goto L_0x01bc
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r6.A1x = r0
        L_0x01bc:
            java.lang.String r0 = X.AnonymousClass7TF.A0g(r10)
            if (r0 == 0) goto L_0x01c4
            r6.A2X = r0
        L_0x01c4:
            float r0 = r12.A00
            r2.A02 = r0
            r2.A5V = r3
            java.lang.String r5 = r13.A0f
            java.lang.String r1 = "unknown"
            java.util.regex.Pattern r0 = X.0mp.A00
            if (r5 != 0) goto L_0x01d3
            r5 = r1
        L_0x01d3:
            r2.A2W = r5
            java.lang.Integer r0 = r13.A0Z
            r2.A29 = r0
            java.lang.Integer r0 = r13.A0a
            r2.A2A = r0
            java.lang.Integer r0 = r13.A0b
            if (r0 == 0) goto L_0x02ed
            int r0 = r0.intValue()
        L_0x01e5:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A2B = r0
            r2.A2Q = r14
            X.0v6 r0 = r13.A0U
            com.instagram.common.util.gradient.BackgroundGradientColors r0 = X.0oY.A00(r0)
            r2.A14 = r0
            r2.A5z = r3
            if (r11 == 0) goto L_0x0209
            r2.A16 = r11
            float[] r0 = r11.C5o()
            boolean r0 = X.C366718pY.A00(r0, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A1t = r0
        L_0x0209:
            if (r15 == 0) goto L_0x020d
            r2.A2z = r15
        L_0x020d:
            java.lang.String r0 = r13.A0g
            if (r0 == 0) goto L_0x0213
            r2.A2V = r0
        L_0x0213:
            java.util.Set r0 = r13.A11
            if (r0 == 0) goto L_0x021f
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            if (r0 == 0) goto L_0x021f
            r2.A4E = r0
        L_0x021f:
            java.util.List r0 = r13.A0y
            if (r0 == 0) goto L_0x022b
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            if (r0 == 0) goto L_0x022b
            r2.A4D = r0
        L_0x022b:
            java.util.List r0 = r13.A0x
            if (r0 == 0) goto L_0x0231
            r2.A4S = r0
        L_0x0231:
            if (r8 == 0) goto L_0x02d4
            r2.A0i = r8
        L_0x0235:
            boolean r0 = r13.A16
            r2.A5N = r0
            java.lang.String r0 = r13.A0s
            r2.A3n = r0
            com.facebook.videolite.transcoder.base.composition.MediaComposition r0 = r13.A0O
            r2.A0r = r0
            java.util.List r0 = r13.A0z
            r2.A4W = r0
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r13.A02()
            java.lang.String r1 = r0.A03
            boolean r0 = X.0mp.A0B(r1)
            if (r0 != 0) goto L_0x0255
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r2.A13
            r0.A03 = r1
        L_0x0255:
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r13.A02()
            r2.A13 = r0
            boolean r0 = r13.A1E
            if (r0 == 0) goto L_0x0266
            X.9sz r0 = X.C391429sz.A0f
            r2.A0f(r0)
            r2.A5n = r3
        L_0x0266:
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r13.A02()
            java.lang.String r1 = r0.A03
            if (r1 == 0) goto L_0x027b
            java.lang.String r0 = "com.instagram.barcelona"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x027b
            X.9sz r0 = X.C391429sz.A08
            r2.A0f(r0)
        L_0x027b:
            java.lang.String r0 = "com.facebook.hammerhead.story_camera"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x02c6
            X.9sz r0 = X.C391429sz.A0o
        L_0x0285:
            r2.A0f(r0)
        L_0x0288:
            r2.A10 = r9
            java.util.List r1 = r13.A0t
            if (r1 == 0) goto L_0x0296
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0296
            r2.A47 = r1
        L_0x0296:
            java.lang.String r0 = r13.A0q
            r2.A3g = r0
            int r0 = r13.A0F
            r2.A0K = r0
            boolean r0 = r13.A1L
            r2.A5j = r0
            int r1 = r13.A09
            r0 = 90
            if (r1 == r0) goto L_0x02c1
            r0 = 270(0x10e, float:3.78E-43)
            if (r1 == r0) goto L_0x02c1
            int r1 = r13.A0K
            int r0 = r13.A08
        L_0x02b0:
            if (r1 <= r0) goto L_0x02b3
            r4 = 1
        L_0x02b3:
            r2.A5x = r4
            if (r16 == 0) goto L_0x02c0
            com.instagram.pendingmedia.store.PendingMediaStore r1 = X.28K.A00(r10)
            java.lang.String r0 = r2.A35
            r1.A0D(r2, r0)
        L_0x02c0:
            return r2
        L_0x02c1:
            int r1 = r13.A08
            int r0 = r13.A0K
            goto L_0x02b0
        L_0x02c6:
            java.lang.String r1 = r13.A0k
            r0 = 0
            X.Kp0 r0 = X.C59737JVv.A00(r0, r10, r1, r4)
            boolean r0 = r0 instanceof X.C59788JYh
            if (r0 == 0) goto L_0x0288
            X.9sz r0 = X.C391429sz.A0L
            goto L_0x0285
        L_0x02d4:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Can't find mCameraEntryPoint enum "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " in InstagramCameraEntryPointTypes when calling createPendingMediaForVideo"
            java.lang.String r1 = X.AnonymousClass7TF.A0l(r0, r1)
            java.lang.String r0 = "StoryPendingMediaUtil"
            X.0kD.A01(r0, r1)
            goto L_0x0235
        L_0x02ed:
            r0 = 3
            goto L_0x01e5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59797JYq.A01(X.28D, com.instagram.camera.effect.models.CameraAREffect, com.instagram.common.session.UserSession, com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig, com.instagram.pendingmedia.model.ClipInfo, X.7zv, java.lang.String, java.lang.String, boolean):X.3Q2");
    }

    /* JADX WARNING: type inference failed for: r19v1, types: [X.MS5] */
    /* JADX WARNING: type inference failed for: r15v2, types: [X.KH4, X.11X] */
    /* JADX WARNING: type inference failed for: r10v3, types: [X.LmN] */
    /* JADX WARNING: type inference failed for: r10v4, types: [X.LmM] */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0040, code lost:
        if (r12.A57 != false) goto L_0x0042;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(android.content.Context r25, X.C53401GnY r26, com.instagram.common.session.UserSession r27, X.AnonymousClass4D6 r28, X.1GK r29, X.LD4 r30, X.L83 r31, com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r32, com.instagram.model.direct.DirectShareTarget r33, X.C381779cJ r34, X.A6R r35, X.AnonymousClass3Q2 r36, X.1ua r37, X.C352218Cl r38, java.lang.String r39, java.lang.String r40, boolean r41, boolean r42) {
        /*
            r3 = r29
            X.LmQ r4 = new X.LmQ
            r13 = r37
            r12 = r36
            r11 = r35
            r10 = r34
            r9 = r33
            r17 = r42
            r16 = r40
            r7 = r27
            r15 = r39
            r6 = r26
            r14 = r38
            r5 = r25
            r8 = r30
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r29 == 0) goto L_0x002d
            r1 = 4
            X.Oyp r0 = new X.Oyp
            r0.<init>((X.AnonymousClass3Q2) r12, (int) r1)
            X.1GK r3 = r3.A03(r0)
        L_0x002d:
            java.util.EnumSet r0 = com.instagram.pendingmedia.model.constants.ShareType.A02
            boolean r1 = r12.A15(r0)
            boolean r0 = X.C59911Jba.A00(r12)
            boolean r0 = X.C63470KxZ.A00(r7, r1, r0)
            if (r0 == 0) goto L_0x0042
            boolean r0 = r12.A57
            r1 = 1
            if (r0 == 0) goto L_0x0043
        L_0x0042:
            r1 = 0
        L_0x0043:
            boolean r2 = r12.A57
            com.instagram.camera.effect.models.CameraAREffect r0 = r12.A10
            boolean r25 = X.AnonymousClass7TF.A1V(r0)
            boolean r27 = X.AJ8.A07(r7, r12)
            boolean r18 = A0H(r7, r12)
            r17 = r41
            r21 = r31
            if (r1 == 0) goto L_0x008d
            X.KgB r1 = X.C62461KgB.GALLERY
            X.KgB r0 = X.C62461KgB.UPLOAD
            X.KgB[] r24 = new X.C62461KgB[]{r1, r0}
            X.LmM r19 = new X.LmM
            r10 = r19
            r11 = r5
            r12 = r7
            r13 = r21
            r15 = r24
            r16 = r17
            r17 = r18
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
        L_0x0072:
            X.KH4 r15 = new X.KH4
            r22 = r32
            r16 = r5
            r17 = r7
            r18 = r3
            r20 = r4
            r23 = r14
            r26 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r0 = r28
            if (r28 != 0) goto L_0x00a2
            X.1ES.A03(r15)
            return
        L_0x008d:
            r15 = 0
            X.KgB r0 = X.C62461KgB.UPLOAD
            X.KgB[] r24 = new X.C62461KgB[]{r0}
            X.LmN r19 = new X.LmN
            r10 = r19
            r11 = r5
            r12 = r7
            r13 = r21
            r16 = r24
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0072
        L_0x00a2:
            r0.schedule(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59797JYq.A04(android.content.Context, X.GnY, com.instagram.common.session.UserSession, X.4D6, X.1GK, X.LD4, X.L83, com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel, com.instagram.model.direct.DirectShareTarget, X.9cJ, X.A6R, X.3Q2, X.1ua, X.8Cl, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.KH4, X.11X] */
    public static void A06(Context context, UserSession userSession, AnonymousClass4D6 r24, 1GK r25, L83 l83, FilterGroupModel filterGroupModel, AnonymousClass3Q2 r28, C352218Cl r29, String str, LinkedHashMap linkedHashMap) {
        1GK r5 = r25;
        AnonymousClass3Q2 r1 = r28;
        r1.A0e(ShareType.REEL_SHARE_AND_DIRECT_STORY_SHARE);
        r1.A4w = true;
        String str2 = str;
        if (str != null) {
            r1.A3e = str2;
        }
        Context context2 = context;
        UserSession userSession2 = userSession;
        LmO lmO = new LmO(context2, userSession2, r1);
        if (r25 != null) {
            r5 = r5.A03(new C72221Oyp(r1, 3));
        }
        boolean A1V = AnonymousClass7TF.A1V(r1.A10);
        boolean z = r1.A57;
        boolean A07 = AJ8.A07(userSession2, r1);
        boolean A0H = A0H(userSession2, r1);
        C62461KgB[] kgBArr = {C62461KgB.UPLOAD};
        L83 l832 = l83;
        C352218Cl r10 = r29;
        ? kh4 = new KH4(context2, userSession2, r5, new C65044LmN(context2, userSession2, l832, r10, linkedHashMap, kgBArr, false, A0H), lmO, l832, filterGroupModel, r10, kgBArr, A1V, z, A07);
        AnonymousClass4D6 r0 = r24;
        if (r24 == null) {
            1ES.A03(kh4);
        } else {
            r0.schedule(kh4);
        }
        1ua.A00(context2, userSession2).A0E(r1);
        PendingMediaStore A00 = 28K.A00(userSession2);
        A00.A07.add(r1.A35);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0026, code lost:
        if ("story_remix_reply".equals(r1) != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0A(X.C53401GnY r19, com.instagram.common.session.UserSession r20, X.LD4 r21, X.C381779cJ r22, X.AnonymousClass3Q2 r23, java.lang.String r24, java.lang.String r25) {
        /*
            r5 = r21
            boolean r0 = r5.A00()
            r4 = r20
            r3 = r23
            if (r0 == 0) goto L_0x009f
            r2 = r22
            r2.getClass()
            java.lang.String r1 = r2.A03
            r0 = 1850(0x73a, float:2.592E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0028
            java.lang.String r0 = "story_remix_reply"
            boolean r1 = r0.equals(r1)
            r0 = 1
            if (r1 == 0) goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            r3.A4w = r0
            com.instagram.model.direct.DirectShareTarget r1 = r5.A00
            r1.getClass()
            r0 = 3016(0xbc8, float:4.226E-42)
            java.lang.String r10 = X.AnonymousClass000.A00(r0)
            X.7Zi r7 = X.C333527Zh.A00(r4)
            com.instagram.common.session.UserSession r0 = r7.A03
            X.2Dm r0 = X.1bJ.A00(r0)
            X.3U9 r0 = r0.BYf(r1)
            com.instagram.model.direct.DirectThreadKey r9 = X.AnonymousClass48N.A03(r0)
            boolean r14 = r2.A07
            java.lang.String r11 = r2.A00
            r23 = 0
            X.IoX r13 = new X.IoX
            r5 = r19
            r22 = r24
            r12 = r25
            r15 = r13
            r18 = r5
            r19 = r9
            r20 = r7
            r21 = r12
            r17 = r3
            r16 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            r6 = 0
            r8 = r6
            java.lang.Object r0 = X.C333537Zi.A01(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r6 = r0.first
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r2 = r0.second
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r0 = 1
            r3.A5Q = r0
            X.3t2 r0 = r1.A01()
            X.3t1 r1 = X.AnonymousClass6W3.A01(r0)
            boolean r5 = r2.booleanValue()
            r0 = 3
            X.0qQ.A0B(r6, r0)
            X.3t1 r0 = X.AnonymousClass6W3.A01(r1)
            com.instagram.model.direct.DirectThreadKey r2 = X.AnonymousClass6W4.A01(r0)
            com.instagram.pendingmedia.model.constants.ShareType r1 = r3.A0E()
            X.1iA r0 = r3.A1G
            java.lang.String r0 = X.C63226KtX.A00(r0, r1)
            X.C3265677h.A0i(r4, r2, r0, r6, r5)
        L_0x009e:
            return
        L_0x009f:
            com.instagram.pendingmedia.model.constants.ShareType r1 = r5.A02
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.PROMPTS
            if (r1 != r0) goto L_0x009e
            com.instagram.model.direct.DirectShareTarget r2 = r5.A00
            r2.getClass()
            r0 = 1
            X.0qQ.A0B(r3, r0)
            X.7Zi r1 = X.C333527Zh.A00(r4)
            r0 = 0
            r1.A0H(r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59797JYq.A0A(X.GnY, com.instagram.common.session.UserSession, X.LD4, X.9cJ, X.3Q2, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.KH2, X.11X] */
    public static void A0B(UserSession userSession, AnonymousClass4D6 r2, 1GK r3, MTZ mtz) {
        ? kh2 = new KH2(userSession, r3, mtz);
        if (r2 == null) {
            1ES.A03(kh2);
        } else {
            r2.schedule(kh2);
        }
    }

    /* JADX WARNING: type inference failed for: r0v40, types: [X.1us, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006b, code lost:
        if (r8.A01 == null) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0C(com.instagram.common.session.UserSession r6, X.LD4 r7, X.L8M r8, X.AnonymousClass3Q2 r9) {
        /*
            com.instagram.pendingmedia.model.constants.ShareType r1 = r7.A02
            r9.A0e(r1)
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.EXPRESSIVE_QUESTION_STICKER
            if (r1 == r0) goto L_0x000d
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.PROMPTS
            if (r1 != r0) goto L_0x0015
        L_0x000d:
            X.1vG r0 = new X.1vG
            r0.<init>()
            r9.A0a(r0)
        L_0x0015:
            com.instagram.pendingmedia.model.UserStoryTarget r2 = r7.A01
            boolean r0 = X.AnonymousClass7TF.A1V(r2)
            r4 = 0
            if (r0 == 0) goto L_0x004e
            r2.getClass()
            java.lang.String r1 = r2.CAh()
            java.lang.String r0 = "ALL_WITH_BLACKLIST"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x004d
            java.lang.String r0 = "CLOSE_FRIENDS_WITH_BLACKLIST"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x004d
            java.lang.String r0 = "GROUP_PROFILE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x004d
            java.lang.String r0 = "SHARE_TO_FRIENDS_STORY"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x004d
            java.lang.String r0 = "HIGHLIGHTS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004e
        L_0x004d:
            r4 = 1
        L_0x004e:
            r3 = 1
            if (r4 == 0) goto L_0x0060
            r9.A4w = r3
            r2.getClass()
            X.5IC r0 = new X.5IC
            r0.<init>(r2)
            r9.A0a(r0)
            r9.A5Q = r3
        L_0x0060:
            if (r8 == 0) goto L_0x00a5
            boolean r4 = r8.A03
            boolean r0 = r8.A02
            if (r0 == 0) goto L_0x006d
            java.lang.String r1 = r8.A01
            r0 = 1
            if (r1 != 0) goto L_0x006e
        L_0x006d:
            r0 = 0
        L_0x006e:
            java.lang.String r5 = r8.A00
            if (r0 == 0) goto L_0x0078
            r9.A55 = r3
            if (r5 == 0) goto L_0x0078
            r9.A2i = r5
        L_0x0078:
            if (r4 == 0) goto L_0x00a5
            X.0Tu r4 = X.0Tu.A05
            r0 = 36325841252201755(0x810e290001351b, double:3.0359465080899155E-306)
            boolean r0 = X.182.A06(r4, r6, r0)
            if (r0 == 0) goto L_0x00e8
            boolean r0 = r9.A4w
            if (r0 != 0) goto L_0x009b
            r9.A4w = r3
            r0 = 0
            r9.A5T = r0
            r2.getClass()
            X.5IC r0 = new X.5IC
            r0.<init>(r2)
            r9.A0a(r0)
        L_0x009b:
            com.instagram.pendingmedia.model.UserStoryTarget r1 = com.instagram.pendingmedia.model.UserStoryTarget.A04
            X.5IC r0 = new X.5IC
            r0.<init>(r1)
            r9.A0a(r0)
        L_0x00a5:
            if (r2 == 0) goto L_0x00bf
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A02
            if (r2 == r0) goto L_0x00e5
            java.lang.String r1 = r2.CAh()
            java.lang.String r0 = "CLOSE_FRIENDS_WITH_BLACKLIST"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00e5
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A03
            if (r2 != r0) goto L_0x00c2
            X.3QO r0 = X.AnonymousClass3QO.FAN_CLUB
        L_0x00bd:
            r9.A1F = r0
        L_0x00bf:
            r9.A5g = r3
            return
        L_0x00c2:
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A09
            if (r2 != r0) goto L_0x00c9
            X.3QO r0 = X.AnonymousClass3QO.CUSTOM
            goto L_0x00bd
        L_0x00c9:
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A0A
            if (r2 != r0) goto L_0x00d0
            X.3QO r0 = X.AnonymousClass3QO.ROLL_CALL_FOLLOWERS
            goto L_0x00bd
        L_0x00d0:
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A0B
            if (r2 != r0) goto L_0x00d7
            X.3QO r0 = X.AnonymousClass3QO.ROLL_CALL_MUTUALS
            goto L_0x00bd
        L_0x00d7:
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A06
            if (r2 != r0) goto L_0x00de
            X.3QO r0 = X.AnonymousClass3QO.HALLPASS
            goto L_0x00bd
        L_0x00de:
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A08
            if (r2 != r0) goto L_0x00bf
            X.3QO r0 = X.AnonymousClass3QO.OPAL
            goto L_0x00bd
        L_0x00e5:
            X.3QO r0 = X.AnonymousClass3QO.CLOSE_FRIENDS
            goto L_0x00bd
        L_0x00e8:
            r9.A5T = r3
            if (r5 == 0) goto L_0x00a5
            r9.A2i = r5
            goto L_0x00a5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59797JYq.A0C(com.instagram.common.session.UserSession, X.LD4, X.L8M, X.3Q2):void");
    }

    public static void A0D(UserSession userSession, LEA lea, AnonymousClass3Q2 r6) {
        r6.A24 = lea.A04;
        r6.A25 = lea.A05;
        r6.A0A = lea.A00;
        Point point = lea.A01;
        point.getClass();
        int i = point.x;
        int i2 = point.y;
        r6.A0C = i;
        r6.A0B = i2;
        Point point2 = lea.A02;
        point2.getClass();
        int i3 = point2.x;
        int i4 = point2.y;
        r6.A0S = i3;
        r6.A0R = i4;
        r6.A33 = lea.A08;
        r6.A5g = false;
        r6.A5l = true;
        L6G l6g = r6.A19;
        if (l6g != null) {
            l6g.A02.A19 = null;
            UserSession userSession2 = l6g.A00;
            1ua.A0G.A01(C51966G9m.A0P(userSession2), userSession2).A0I(r6, false, false);
        }
        28K.A00(userSession).A0A();
    }

    public static void A0E(UserSession userSession, AnonymousClass3Q2 r6) {
        User user;
        if (r6 != null) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it = r6.A4b.iterator();
            while (it.hasNext()) {
                C255783ui A0o = JTO.A0o(it);
                AnonymousClass3WT r1 = A0o.A11;
                if (r1 != AnonymousClass3WT.MENTION || (user = A0o.A1B) == null) {
                    if (r1 == AnonymousClass3WT.GROUP_MENTION) {
                        C387339m3 A0C = A0o.A0C();
                        if (A0C != null) {
                            Iterator it2 = A0C.A05.iterator();
                            while (it2.hasNext()) {
                                DbY.A1W(A1C, it2);
                            }
                        }
                    } else if (r1 == AnonymousClass3WT.MENTION_RESHARE) {
                        user = A0o.A1B;
                        if (user == null) {
                        }
                    }
                }
                DbU.A1V(user, A1C);
            }
            if (!A1C.isEmpty()) {
                AnonymousClass8OY.A00(userSession).A01(r6.A3t, A1C);
            }
        }
    }

    public static void A0F(UserSession userSession, AnonymousClass3Q2 r4, int i, int i2) {
        if (i > 0 && i2 > 0 && !r4.A4t.isEmpty()) {
            0Tu r2 = 0Tu.A05;
            if (182.A06(r2, userSession, 36323229912345618L) || 182.A06(r2, userSession, 36320992234447877L)) {
                for (ADJ adj : r4.A4t) {
                    AD7 ad7 = adj.A01;
                    if (ad7 != null) {
                        ad7.A01 = Float.valueOf((float) i);
                        ad7.A00 = Float.valueOf((float) i2);
                    }
                }
            }
        }
    }

    public static boolean A0G(UserSession userSession, DirectShareTarget directShareTarget) {
        if (directShareTarget == null || !182.A06(0Tu.A05, userSession, 2342164482484348324L)) {
            return false;
        }
        return true;
    }

    public static boolean A0I(UserSession userSession, String str) {
        if (!28D.A2T.toString().equals(str) || !182.A06(0Tu.A05, userSession, 36323625049861449L)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.1us, java.lang.Object] */
    public static AnonymousClass3Q2 A03(UserSession userSession, ShareType shareType) {
        PendingMediaStore A00 = 28K.A00(userSession);
        String A0Z = JTQ.A0Z();
        0qQ.A0B(A0Z, 0);
        AnonymousClass3Q2 A01 = AnonymousClass9T3.A01(A0Z);
        A01.A0a(new Object());
        A01.A1k = shareType;
        A01.A0N = 12;
        A01.A0c(AnonymousClass3QD.CONFIGURED);
        A00.A0D(A01, A01.A35);
        return A01;
    }

    public static boolean A0H(UserSession userSession, AnonymousClass3Q2 r4) {
        0Tu r2;
        long j;
        String str;
        if (r4.A0E() != ShareType.REEL_SHARE && r4.A0E() != ShareType.REEL_SHARE_AND_DIRECT_STORY_SHARE) {
            return false;
        }
        if (AJ8.A07(userSession, r4)) {
            r2 = 0Tu.A05;
            j = 36324707380900116L;
        } else {
            if (r4.A1G == 1iA.A0Q && r4.A10 == null && !r4.A57 && r4.A15(ShareType.A02)) {
                C255783ui A00 = AnonymousClass497.A00(AnonymousClass3WT.MUSIC_OVERLAY, r4.A4b);
                if (A00 != null) {
                    str = A00.A1g;
                } else {
                    str = null;
                }
                if (0qQ.A0K(str, AnonymousClass6KJ.MUSIC_ONLY.A02)) {
                    r2 = 0Tu.A05;
                    if (182.A06(r2, userSession, 36323229912083471L)) {
                        j = 36324707380834579L;
                    }
                }
            }
            boolean A10 = r4.A10();
            r2 = 0Tu.A05;
            if (!A10) {
                j = 36324707380965653L;
            } else {
                j = 36324707380769042L;
            }
        }
        return 182.A06(r2, userSession, j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:128:0x025e, code lost:
        if (X.182.A06(r8, r6, 36327258593114404L) == false) goto L_0x0260;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass3Q2 A02(X.28D r21, com.instagram.common.session.UserSession r22, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r23, X.B1O r24, com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r25, X.C352218Cl r26, java.lang.String r27, java.util.Set r28) {
        /*
            r2 = r23
            java.lang.String r0 = X.JTQ.A0Z()
            r4 = 0
            X.0qQ.A0B(r0, r4)
            X.3Q2 r3 = X.AnonymousClass9T3.A01(r0)
            r0 = r24
            if (r24 == 0) goto L_0x0015
            r0.FHp(r3)
        L_0x0015:
            X.0qQ.A0B(r3, r4)
            r9 = 0
            com.instagram.common.gallery.metadata.MediaUploadMetadata r8 = new com.instagram.common.gallery.metadata.MediaUploadMetadata
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            r15 = r9
            r16 = r9
            r17 = r9
            r18 = r9
            r19 = r9
            r20 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r5 = r26
            com.instagram.common.gallery.Medium r0 = r5.A0F
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = r0.A0O
            if (r0 == 0) goto L_0x003a
            r3.A3J = r0
        L_0x003a:
            int r0 = r5.A08
            r3.A0K = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            com.instagram.common.gallery.metadata.MediaUploadMetadata r8 = new com.instagram.common.gallery.metadata.MediaUploadMetadata
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            boolean r0 = r5.A12
            if (r0 == 0) goto L_0x0059
            long r0 = r5.A0A
            long r0 = X.AnonymousClass7TE.A0P(r0)
            r3.A0X = r0
        L_0x0059:
            java.util.List r1 = r5.A0s
            if (r1 == 0) goto L_0x0069
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0069
            r3.A4j = r1
            java.lang.String r0 = r5.A0d
            r3.A2v = r0
        L_0x0069:
            java.util.List r1 = r5.A0o
            if (r1 == 0) goto L_0x0075
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0075
            r3.A4H = r1
        L_0x0075:
            boolean r0 = r5.A0x
            r8 = 1
            if (r0 == 0) goto L_0x007c
            r3.A5v = r8
        L_0x007c:
            boolean r0 = r5.A11
            if (r0 == 0) goto L_0x0082
            r3.A5W = r8
        L_0x0082:
            boolean r0 = r5.A17
            r3.A5o = r0
            java.util.Set r0 = r5.A0B()
            java.util.Iterator r1 = r0.iterator()
        L_0x008e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00a1
            java.lang.Object r0 = r1.next()
            X.9sz r0 = (X.C391429sz) r0
            X.0qQ.A0B(r0, r4)
            r3.A0f(r0)
            goto L_0x008e
        L_0x00a1:
            java.lang.String r0 = r5.A05()
            if (r0 == 0) goto L_0x00a9
            r3.A2o = r0
        L_0x00a9:
            java.lang.String r0 = r5.A0c
            if (r0 == 0) goto L_0x00af
            r3.A2n = r0
        L_0x00af:
            X.8GK r0 = r5.A0K
            if (r0 == 0) goto L_0x00b5
            r3.A1b = r0
        L_0x00b5:
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r5.A01()
            r3.A13 = r0
            java.lang.String r0 = r5.A0Z
            if (r0 != 0) goto L_0x00c7
            com.instagram.common.gallery.Medium r0 = r5.A0F
            if (r0 == 0) goto L_0x00c9
            java.lang.String r0 = r0.A0N
            if (r0 == 0) goto L_0x00c9
        L_0x00c7:
            r3.A2O = r0
        L_0x00c9:
            java.lang.String r0 = r5.A0n
            if (r0 == 0) goto L_0x00cf
            r3.A3Y = r0
        L_0x00cf:
            java.lang.String r0 = r5.A0Y
            if (r0 == 0) goto L_0x00d5
            r3.A2K = r0
        L_0x00d5:
            com.instagram.music.common.model.MusicOverlayStickerModel r1 = r5.A0J
            r6 = r22
            if (r1 == 0) goto L_0x0102
            X.6Ma r0 = X.C306406Ma.A00
            X.3ui r7 = new X.3ui
            r7.<init>()
            X.6KJ r0 = X.AnonymousClass6KJ.HIDDEN
            java.lang.String r0 = r0.toString()
            X.C306406Ma.A05(r6, r1, r7, r0, r9)
            java.util.List r0 = r3.A4b
            if (r0 != 0) goto L_0x00f1
            X.0sn r0 = X.0sn.A00
        L_0x00f1:
            java.util.ArrayList r1 = X.00k.A0U(r0)
            X.3WT r0 = X.AnonymousClass3WT.MUSIC_OVERLAY
            X.3ui r0 = X.AnonymousClass497.A00(r0, r1)
            if (r0 != 0) goto L_0x0100
            r1.add(r7)
        L_0x0100:
            r3.A4b = r1
        L_0x0102:
            boolean r0 = r5.A0w
            r3.A5H = r0
            boolean r0 = r5.A16
            r3.A5n = r0
            java.lang.String r0 = X.AnonymousClass7TF.A0g(r6)
            if (r0 == 0) goto L_0x0112
            r3.A2X = r0
        L_0x0112:
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r2 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r2
            X.81W r2 = r2.A0K
            int r0 = r2.getWidth()
            float r1 = (float) r0
            int r0 = r2.getHeight()
            float r0 = (float) r0
            float r1 = r1 / r0
            r3.A02 = r1
            r10 = 1
            r3.A5V = r8
            java.lang.String r0 = r5.A06()
            r3.A3K = r0
            java.lang.String r0 = r5.A07()
            r3.A3L = r0
            java.lang.String r0 = r5.A07()
            if (r0 == 0) goto L_0x0142
            java.lang.String r0 = r5.A07()
            java.util.HashMap r0 = X.C379839Vn.A00(r0)
            r3.A44 = r0
        L_0x0142:
            java.lang.String r2 = r5.A0a
            java.lang.String r1 = "unknown"
            java.util.regex.Pattern r0 = X.0mp.A00
            if (r2 != 0) goto L_0x014b
            r2 = r1
        L_0x014b:
            r3.A2W = r2
            r2 = r21
            if (r21 == 0) goto L_0x020a
            r3.A0i = r2
        L_0x0153:
            r1 = r28
            if (r28 == 0) goto L_0x0176
            X.8aL r0 = X.C358088aL.A07
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0176
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.util.List r0 = r3.A4D
            r1.addAll(r0)
            com.instagram.api.schemas.CameraTool r12 = com.instagram.api.schemas.CameraTool.AI_REWRITE_TEXT
            X.55X r11 = new X.55X
            r16 = r4
            r11.<init>(r12, r13, r14, r15, r16)
            r1.add(r11)
            r3.A4D = r1
        L_0x0176:
            r0 = r25
            if (r25 == 0) goto L_0x018a
            r3.A16 = r0
            float[] r0 = r0.C5o()
            boolean r0 = X.C366718pY.A00(r0, r8)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A1t = r0
        L_0x018a:
            r0 = r27
            if (r27 == 0) goto L_0x0190
            r3.A2z = r0
        L_0x0190:
            java.lang.String r0 = r5.A0b
            if (r0 == 0) goto L_0x0196
            r3.A2V = r0
        L_0x0196:
            boolean r0 = r5.A16
            if (r0 == 0) goto L_0x01a1
            X.9sz r0 = X.C391429sz.A0f
            r3.A0f(r0)
            r3.A5n = r8
        L_0x01a1:
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r5.A01()
            r3.A13 = r0
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r5.A01()
            java.lang.String r2 = r0.A03
            r5.A01()
            if (r2 == 0) goto L_0x01bf
            java.lang.String r0 = "com.instagram.barcelona"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x01bf
            X.9sz r0 = X.C391429sz.A08
            r3.A0f(r0)
        L_0x01bf:
            java.lang.String r0 = r5.A06()
            X.Kp0 r1 = X.C59737JVv.A00(r9, r6, r0, r8)
            java.lang.String r0 = "com.facebook.hammerhead.story_camera"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x01fa
            X.9sz r0 = X.C391429sz.A0o
        L_0x01d1:
            r3.A0f(r0)
        L_0x01d4:
            java.util.List r7 = r5.A0p
            if (r7 == 0) goto L_0x027b
            r3.A4S = r7
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r7.iterator()
        L_0x01e2:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0223
            java.lang.Object r0 = r1.next()
            X.LMH r0 = (X.LMH) r0
            com.instagram.api.schemas.CameraTool r0 = r0.A00
            X.8hK r0 = X.AnonymousClass6XS.A00(r0)
            if (r0 == 0) goto L_0x01e2
            r2.add(r0)
            goto L_0x01e2
        L_0x01fa:
            if (r1 == 0) goto L_0x01d4
            boolean r0 = r1 instanceof X.C59789JYi
            if (r0 == 0) goto L_0x0203
            X.9sz r0 = X.C59789JYi.A00
            goto L_0x01d1
        L_0x0203:
            boolean r0 = r1 instanceof X.C59788JYh
            if (r0 == 0) goto L_0x01d4
            X.9sz r0 = X.C59788JYh.A01
            goto L_0x01d1
        L_0x020a:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Can't find mCameraEntryPoint enum "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " in InstagramCameraEntryPointTypes when calling createPendingMediaForPhoto"
            java.lang.String r1 = X.AnonymousClass7TF.A0l(r0, r1)
            java.lang.String r0 = "StoryPendingMediaUtil"
            X.0kD.A01(r0, r1)
            goto L_0x0153
        L_0x0223:
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0282
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0282
        L_0x022d:
            X.0Tu r8 = X.0Tu.A05
            r0 = 36324861999853997(0x810d45000431ad, double:3.0353272249620606E-306)
            boolean r0 = X.182.A06(r8, r6, r0)
            if (r0 == 0) goto L_0x024e
            java.util.stream.Stream r1 = r7.stream()
            X.MBB r0 = new X.MBB
            r0.<init>(r4)
            boolean r0 = r1.anyMatch(r0)
            if (r0 == 0) goto L_0x024e
            X.9sz r0 = X.C391429sz.A0S
            r3.A0f(r0)
        L_0x024e:
            boolean r0 = X.LIW.A00(r7)
            if (r0 == 0) goto L_0x0260
            r0 = 36327258593114404(0x810f73001b3924, double:3.0368428401902485E-306)
            boolean r0 = X.182.A06(r8, r6, r0)
            r2 = 1
            if (r0 != 0) goto L_0x0261
        L_0x0260:
            r2 = 0
        L_0x0261:
            boolean r0 = X.LIW.A01(r7)
            if (r0 == 0) goto L_0x0280
            r0 = 36327258593179941(0x810f73001c3925, double:3.0368428402316944E-306)
            boolean r0 = X.182.A06(r8, r6, r0)
            if (r0 == 0) goto L_0x0280
        L_0x0272:
            if (r2 != 0) goto L_0x0276
            if (r10 == 0) goto L_0x027b
        L_0x0276:
            X.9sz r0 = X.C391429sz.A0V
            r3.A0f(r0)
        L_0x027b:
            int r0 = r5.A08
            r3.A0K = r0
            return r3
        L_0x0280:
            r10 = 0
            goto L_0x0272
        L_0x0282:
            java.util.Iterator r9 = r2.iterator()
        L_0x0286:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x022d
            java.lang.Object r0 = r9.next()
            X.8hK r0 = (X.C362088hK) r0
            int r1 = r0.ordinal()
            if (r1 == r4) goto L_0x02b9
            if (r1 == r8) goto L_0x02b1
            r0 = 2
            if (r1 != r0) goto L_0x02c1
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342162927711231764(0x208108c600511f14, double:4.065516773063106E-152)
        L_0x02a4:
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x0286
            X.9sz r0 = X.C391429sz.A0S
            r3.A0f(r0)
            goto L_0x022d
        L_0x02b1:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319918494785273(0x8108c600271ef9, double:3.0322009324507024E-306)
            goto L_0x02a4
        L_0x02b9:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319918494850810(0x8108c600281efa, double:3.032200932492148E-306)
            goto L_0x02a4
        L_0x02c1:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59797JYq.A02(X.28D, com.instagram.common.session.UserSession, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, X.B1O, com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig, X.8Cl, java.lang.String, java.util.Set):X.3Q2");
    }
}
