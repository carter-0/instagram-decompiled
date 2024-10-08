package X;

import android.content.Context;
import android.graphics.Point;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.8L3  reason: invalid class name */
public final class AnonymousClass8L3 {
    public final Context A00;
    public final UserSession A01;
    public final C3499582p A02;
    public final String A03;
    public final 28D A04;
    public final AnonymousClass4D6 A05;
    public final TargetViewSizeProvider A06;

    private final AnonymousClass3Q2 A00(C366688pV r14, A6R a6r, C273814nE r16, AnonymousClass8VT r17, C349307zv r18, String str, String str2, boolean z, boolean z2) {
        String str3;
        AnonymousClass3Q2 A032 = A03((Point) null, r14, r17, r18, str2);
        A032.A6C = z2;
        if (z2) {
            if (182.A06(0Tu.A05, this.A01, 36325733878084777L)) {
                A032.A53 = true;
            } else {
                A032.A4x = true;
            }
        }
        A032.A1R = r16;
        C59785JYe jYe = new C59785JYe(A032);
        if (a6r != null) {
            jYe.A01(a6r.A02);
            A032.A0e = (System.currentTimeMillis() / 1000) - ((long) a6r.A01);
        }
        if (z) {
            jYe.A00(C391429sz.A0P);
        }
        AnonymousClass3Q2 r1 = new C59785JYe(A032).A00;
        r1.A3z = str;
        C3499582p r0 = this.A02;
        if (r0 != null) {
            str3 = r0.A02.A01.A05();
        } else {
            str3 = null;
        }
        r1.A2e = str3;
        return A032;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        if (r1.A02.A01.A0N != true) goto L_0x0092;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass3Q2 A03(android.graphics.Point r28, X.C366688pV r29, X.AnonymousClass8VT r30, X.C349307zv r31, java.lang.String r32) {
        /*
            r27 = this;
            r21 = 0
            r6 = r27
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r0 = r6.A06
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r0 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r0
            X.81W r0 = r0.A0K
            int r3 = r0.getWidth()
            int r2 = r0.getHeight()
            r0 = r28
            if (r28 == 0) goto L_0x001a
            int r3 = r0.x
            int r2 = r0.y
        L_0x001a:
            r4 = r31
            java.lang.String r0 = r4.A0k
            boolean r0 = X.Q0Y.A03(r0)
            com.instagram.common.session.UserSession r12 = r6.A01
            r10 = 0
            if (r0 == 0) goto L_0x015e
            java.lang.String r1 = r4.A0k
            r16 = -3
            r18 = 1
            X.JYp r0 = new X.JYp
            r13 = r0
            r14 = r1
            r15 = r21
            r13.<init>(r14, r15, r16, r18)
        L_0x0036:
            com.instagram.pendingmedia.model.ClipInfo r17 = X.AnonymousClass9T4.A00(r12, r4, r0, r3, r2)
            r3 = r29
            if (r29 == 0) goto L_0x015b
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r5 = r3.A01
        L_0x0040:
            X.82p r1 = r6.A02
            if (r1 == 0) goto L_0x0158
            X.82o r0 = r1.A02
            X.82Y r0 = r0.A01
            com.instagram.creation.capture.quickcapture.gallery.gallerygrid.formats.viewmodel.GalleryGridFormat r0 = r0.A03
            if (r0 == 0) goto L_0x0155
            java.lang.String r2 = r0.A03
        L_0x004e:
            X.28D r0 = r6.A04
            r19 = r32
            r13 = r0
            r14 = r10
            r15 = r12
            r16 = r5
            r18 = r4
            r20 = r2
            X.3Q2 r2 = X.C59797JYq.A01(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.0qQ.A07(r2)
            com.instagram.common.gallery.metadata.MediaUploadMetadata r5 = r2.A13
            java.lang.String r0 = r5.A03
            r7 = 0
            r6 = 1
            if (r0 == 0) goto L_0x0070
            int r0 = r0.length()
            if (r0 != 0) goto L_0x007e
        L_0x0070:
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r4.A02()
            java.lang.String r4 = r0.A03
            X.0sn r0 = X.0sn.A00
            java.lang.String r0 = X.C59737JVv.A02(r12, r4, r0)
            r5.A03 = r0
        L_0x007e:
            long r4 = java.lang.System.currentTimeMillis()
            r8 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r8
            r2.A0e = r4
            if (r1 == 0) goto L_0x0092
            X.82o r0 = r1.A02
            X.82Y r0 = r0.A01
            boolean r4 = r0.A0N
            r0 = 1
            if (r4 == r6) goto L_0x0093
        L_0x0092:
            r0 = 0
        L_0x0093:
            r2.A5I = r0
            if (r29 == 0) goto L_0x00fd
            X.8PW r15 = r3.A05
            if (r15 == 0) goto L_0x0111
            X.3QG r0 = r3.A08
            if (r0 == 0) goto L_0x0111
            java.lang.String r0 = r2.A2V
            if (r0 == 0) goto L_0x0105
            java.lang.Integer r22 = X.C393989xM.A00(r0)
        L_0x00a7:
            if (r1 == 0) goto L_0x00b2
            X.82o r0 = r1.A02
            X.82Y r0 = r0.A01
            boolean r0 = r0.A0I
            if (r0 != r6) goto L_0x00b2
            r7 = 1
        L_0x00b2:
            r2.A4v = r7
            boolean r7 = r3.A0C
            X.3QG r6 = r3.A08
            boolean r5 = r3.A0B
            com.instagram.camera.effect.models.CameraAREffect r11 = r3.A00
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r13 = r3.A01
            X.3QS r4 = r3.A07
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r3 = r3.A06
            if (r1 == 0) goto L_0x0103
            X.82o r0 = r1.A02
            X.82Y r0 = r0.A01
            X.8Yz r0 = r0.A0X
        L_0x00ca:
            boolean r25 = X.C379509Ue.A00(r0)
            if (r1 == 0) goto L_0x00fe
            X.82o r0 = r1.A02
            X.82Y r0 = r0.A01
            X.8Yz r0 = r0.A0X
            if (r0 == 0) goto L_0x00fe
            X.80m r0 = r0.A08
            java.lang.Object r0 = r0.A00
            boolean r0 = r0 instanceof X.AnonymousClass80O
        L_0x00de:
            X.82o r1 = r1.A02
            X.82Y r8 = r1.A01
            java.lang.Integer r1 = r8.A0D
            X.802 r14 = r8.A02()
        L_0x00e8:
            r18 = r30
            r19 = r2
            r20 = r6
            r21 = r1
            r23 = r7
            r24 = r5
            r26 = r0
            r16 = r3
            r17 = r4
            X.C59797JYq.A08(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
        L_0x00fd:
            return r2
        L_0x00fe:
            r0 = 0
            if (r1 != 0) goto L_0x00de
            r1 = r10
            goto L_0x00e8
        L_0x0103:
            r0 = 0
            goto L_0x00ca
        L_0x0105:
            if (r1 == 0) goto L_0x010e
            X.82o r0 = r1.A02
            java.lang.Integer r22 = r0.A03()
            goto L_0x00a7
        L_0x010e:
            java.lang.Integer r22 = X.AnonymousClass05K.A05
            goto L_0x00a7
        L_0x0111:
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r0 = r3.A01
            if (r0 == 0) goto L_0x0117
            r2.A16 = r0
        L_0x0117:
            if (r1 == 0) goto L_0x0145
            X.82o r0 = r1.A02
            X.82Y r0 = r0.A01
            X.8Yz r0 = r0.A0X
        L_0x011f:
            boolean r4 = X.C379509Ue.A00(r0)
            if (r1 == 0) goto L_0x0143
            X.82o r0 = r1.A02
            X.82Y r0 = r0.A01
            X.8Yz r0 = r0.A0X
            if (r0 == 0) goto L_0x0143
            X.80m r0 = r0.A08
            java.lang.Object r0 = r0.A00
            boolean r1 = r0 instanceof X.AnonymousClass80O
        L_0x0133:
            r2.A60 = r4
            r2.A61 = r1
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r0 = r3.A06
            if (r0 == 0) goto L_0x0147
            com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl r0 = (com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl) r0
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain r0 = r0.A02
            X.AJ8.A03(r0, r2, r4)
            return r2
        L_0x0143:
            r1 = 0
            goto L_0x0133
        L_0x0145:
            r0 = 0
            goto L_0x011f
        L_0x0147:
            if (r1 != 0) goto L_0x00fd
            java.lang.String r1 = "VideoSender"
            r0 = 126(0x7e, float:1.77E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            X.0kD.A07(r1, r0, r10)
            return r2
        L_0x0155:
            r2 = 0
            goto L_0x004e
        L_0x0158:
            r2 = r10
            goto L_0x004e
        L_0x015b:
            r5 = r10
            goto L_0x0040
        L_0x015e:
            r0 = r10
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8L3.A03(android.graphics.Point, X.8pV, X.8VT, X.7zv, java.lang.String):X.3Q2");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r1 == com.instagram.pendingmedia.model.constants.ShareType.NOTE_MEDIA_REPLY) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass3Q2 A04(X.C366688pV r18, X.LD4 r19, X.C381539bv r20, X.C381779cJ r21, X.A6R r22, X.AnonymousClass8VT r23, X.C349307zv r24, java.lang.Boolean r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.util.List r32, java.util.List r33, boolean r34) {
        /*
            r17 = this;
            r6 = r27
            r3 = 0
            r5 = r21
            r2 = r19
            if (r21 != 0) goto L_0x0015
            com.instagram.pendingmedia.model.constants.ShareType r1 = r2.A02
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.PROMPTS
            if (r1 == r0) goto L_0x0015
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.NOTE_MEDIA_REPLY
            r16 = 0
            if (r1 != r0) goto L_0x0017
        L_0x0015:
            r16 = 1
        L_0x0017:
            r1 = 0
            if (r21 == 0) goto L_0x00d4
            java.lang.String r4 = r5.A06
            java.lang.String r0 = r5.A03
            X.4nE r10 = new X.4nE
            r10.<init>(r4, r0, r3)
        L_0x0023:
            r5 = 1
            r14 = r29
            r13 = r26
            r12 = r24
            r15 = r34
            r8 = r18
            r7 = r17
            r9 = r22
            r11 = r23
            X.3Q2 r9 = r7.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            if (r27 != 0) goto L_0x003c
            java.lang.String r6 = ""
        L_0x003c:
            r9.A3x = r6
            r0 = r28
            r9.A3k = r0
            X.82p r0 = r7.A02
            if (r0 == 0) goto L_0x0052
            X.82o r0 = r0.A02
            X.82Y r0 = r0.A01
            X.8Yz r0 = r0.A0X
            if (r0 == 0) goto L_0x0052
            X.80m r0 = r0.A08
            java.lang.Object r1 = r0.A00
        L_0x0052:
            X.9QA r0 = X.AnonymousClass9QA.A00
            if (r1 != r0) goto L_0x0071
            com.instagram.common.session.UserSession r6 = r7.A01
            X.0Tu r4 = X.0Tu.A05
            r0 = 36320751716148030(0x8109880004233e, double:3.032727864995623E-306)
            boolean r0 = X.182.A06(r4, r6, r0)
            if (r0 == 0) goto L_0x0071
            X.27r r0 = X.27p.A01(r6)
            X.283 r0 = r0.A04
            java.lang.String r0 = r0.A0L
            if (r0 == 0) goto L_0x0071
            r9.A2g = r0
        L_0x0071:
            r0 = r32
            if (r32 == 0) goto L_0x0077
            r9.A49 = r0
        L_0x0077:
            r0 = r33
            if (r33 == 0) goto L_0x007d
            r9.A4e = r0
        L_0x007d:
            r0 = r30
            if (r30 == 0) goto L_0x0091
            r9.A31 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r1 = r25
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0091
            r9.A56 = r5
        L_0x0091:
            r0 = r31
            if (r31 == 0) goto L_0x00a5
            r9.A3D = r0
            r0 = 8
            r9.A0N = r0
            r9.A5e = r3
            X.CTE r0 = new X.CTE
            r0.<init>()
            r9.A0a(r0)
        L_0x00a5:
            com.instagram.pendingmedia.model.constants.ShareType r1 = r2.A02
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.NOTE_MEDIA_REPLY
            if (r1 != r0) goto L_0x00d3
            java.lang.String r1 = "Required value was null."
            r0 = r20
            if (r20 == 0) goto L_0x00e3
            long r14 = r0.A00
            java.lang.String r10 = r0.A05
            java.lang.String r11 = r0.A03
            java.lang.String r12 = r0.A04
            com.instagram.common.typedurl.ImageUrl r8 = r0.A01
            java.lang.String r13 = r0.A02
            com.instagram.common.session.UserSession r0 = r7.A01
            X.7Zi r7 = X.C333527Zh.A00(r0)
            if (r11 == 0) goto L_0x00dd
            if (r12 == 0) goto L_0x00d7
            if (r8 != 0) goto L_0x00d0
            java.lang.String r0 = ""
            com.instagram.common.typedurl.SimpleImageUrl r8 = new com.instagram.common.typedurl.SimpleImageUrl
            r8.<init>(r0)
        L_0x00d0:
            r7.A0F(r8, r9, r10, r11, r12, r13, r14)
        L_0x00d3:
            return r9
        L_0x00d4:
            r10 = r1
            goto L_0x0023
        L_0x00d7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00dd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00e3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8L3.A04(X.8pV, X.LD4, X.9bv, X.9cJ, X.A6R, X.8VT, X.7zv, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, boolean):X.3Q2");
    }

    public AnonymousClass8L3(Context context, 28D r2, UserSession userSession, AnonymousClass4D6 r4, TargetViewSizeProvider targetViewSizeProvider, C3499582p r6, String str) {
        this.A00 = context;
        this.A01 = userSession;
        this.A06 = targetViewSizeProvider;
        this.A02 = r6;
        this.A03 = str;
        this.A05 = r4;
        this.A04 = r2;
    }

    public final C39650A3q A01(1GK r20, 1GK r21, C366688pV r22, A6R a6r, C349307zv r24, String str, String str2, boolean z, boolean z2) {
        C273814nE r9;
        String obj = AnonymousClass0HM.A00().toString();
        0qQ.A07(obj);
        LinkedHashMap linkedHashMap = null;
        String str3 = str2;
        if (str2 != null) {
            r9 = new C273814nE(str3, (String) null, false);
        } else {
            r9 = null;
        }
        C366688pV r7 = r22;
        C349307zv r11 = r24;
        AnonymousClass3Q2 A002 = A00(r7, a6r, r9, (AnonymousClass8VT) null, r11, "share_sheet", str, z, z2);
        A002.A3x = obj;
        A002.A13 = r11.A02();
        1GK r4 = r21;
        if (r21 != null) {
            A002.A5w = true;
            AnonymousClass3Q2 A032 = C59797JYq.A03(this.A01, ShareType.STORY_TEMPLATE_ASSET);
            0qQ.A07(A032);
            A002.A0X(A032);
        }
        Context context = this.A00;
        UserSession userSession = this.A01;
        1GK A012 = LI4.A01(context, r11);
        AnonymousClass8PW r0 = r7.A05;
        if (r0 != null) {
            linkedHashMap = r0.A09;
        }
        A98 a98 = new A98(context, userSession, r20, A012, A002, this.A03, linkedHashMap);
        if (r21 != null) {
            C59797JYq.A0B(userSession, (AnonymousClass4D6) null, r4, new C40378AbB(context, userSession, a98, A002));
        } else {
            a98.A00((Object) null);
        }
        String str4 = A002.A35;
        0qQ.A0B(str4, 0);
        return new C39650A3q(str4);
    }

    public final C39651A3r A02(C53401GnY gnY, 1GK r47, 1GK r48, C366688pV r49, LD4 ld4, C381539bv r51, C381779cJ r52, A6R a6r, L8M l8m, AnonymousClass8VT r55, C349307zv r56, Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, List list2, boolean z, boolean z2) {
        String str9;
        LinkedHashMap linkedHashMap;
        AnonymousClass3U9 B33;
        Integer num;
        boolean z3;
        AnonymousClass8PW r3;
        LD4 ld42 = ld4;
        0qQ.A0B(ld42, 6);
        C349307zv r13 = r56;
        A6R a6r2 = a6r;
        C381779cJ r10 = r52;
        C381539bv r9 = r51;
        C366688pV r7 = r49;
        List list3 = list;
        String str10 = str6;
        String str11 = str5;
        String str12 = str4;
        String str13 = str3;
        String str14 = str2;
        String str15 = str;
        AnonymousClass3Q2 A042 = A04(r7, ld42, r9, r10, a6r2, r55, r13, bool, str15, str14, str13, str12, str11, str10, list3, list2, z);
        C3499582p r0 = this.A02;
        if (r0 == null || (str9 = r0.A01.toString()) == null) {
            str9 = this.A04.toString();
        }
        Context context = this.A00;
        UserSession userSession = this.A01;
        1GK A012 = LI4.A01(context, r13);
        if (r49 == null || (r3 = r7.A05) == null) {
            linkedHashMap = null;
        } else {
            linkedHashMap = r3.A09;
        }
        AnonymousClass4D6 r4 = this.A05;
        C59797JYq.A0C(userSession, ld42, l8m, A042);
        DirectShareTarget directShareTarget = ld42.A00;
        boolean z4 = z2;
        if (!(directShareTarget == null || (B33 = 1bJ.A00(userSession).B33(directShareTarget.A00())) == null)) {
            if (z2) {
                num = AnonymousClass05K.A0Y;
            } else {
                num = AnonymousClass05K.A03;
            }
            C70621ODs B25 = B33.B25();
            if (B25 != null) {
                z3 = C70054NwW.A00(B25);
            } else {
                z3 = false;
            }
            if (AnonymousClass796.A02(userSession, directShareTarget.A00(), Boolean.valueOf(z3), num, B33.CVE(), false, false) != AnonymousClass797.OPEN_ONLY) {
                A042.A5D = true;
                A042.A53 = true;
            }
        }
        C53401GnY gnY2 = gnY;
        String str16 = str8;
        String str17 = str7;
        if (!z2 && !C59797JYq.A0G(userSession, directShareTarget)) {
            1ua.A00(context, userSession).A0F(A042);
            C59797JYq.A0A(gnY2, userSession, ld42, r10, A042, str17, str16);
        }
        1GK r72 = r48;
        1GK r18 = r47;
        if (r48 != null) {
            A042.A5w = true;
            C59797JYq.A0B(userSession, r4, r72, new C40382AbF(context, userSession, r4, r18, A012, ld42, directShareTarget, r10, a6r2, A042, r13, str9, str17, linkedHashMap, z4));
        } else {
            KH3 kh3 = new KH3(context, userSession, r18, A012, new C65047LmR(context, gnY2, userSession, ld42, directShareTarget, r10, a6r2, A042, r13, bool2, str9, str17, str16, z4), A042, linkedHashMap);
            if (r4 == null) {
                1ES.A03(kh3);
            } else {
                r4.schedule(kh3);
            }
        }
        return new C39651A3r(A042.A35);
    }
}
