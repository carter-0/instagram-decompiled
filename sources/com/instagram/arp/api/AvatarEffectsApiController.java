package com.instagram.arp.api;

import X.02m;
import X.0qQ;
import X.0sP;
import X.19B;
import X.19E;
import X.1Eo;
import X.1Ng;
import X.1wn;
import X.AnonymousClass12T;
import X.AnonymousClass199;
import X.AnonymousClass19G;
import X.AnonymousClass19S;
import X.AnonymousClass1Nd;
import X.AnonymousClass4D7;
import X.C19221WQb;
import X.C20639WwX;
import X.C262204Co;
import X.C262224Cq;
import X.C51972G9s;
import X.C62320sa;
import X.C70929OSc;
import X.C71932OtG;
import X.JV6;
import com.instagram.ar.core.effectcollection.EffectCollectionService;
import com.instagram.common.session.UserSession;
import java.util.concurrent.CancellationException;

public final class AvatarEffectsApiController {
    public C62320sa A00 = C20639WwX.A00;
    public 0sP A01;
    public 0sP A02;
    public C262204Co A03;
    public final EffectCollectionService A04;
    public final AvatarTaskHelper A05;
    public final C70929OSc A06 = new C70929OSc(02m.A0p);
    public final 1Ng A07;
    public final 1wn A08 = new C19221WQb(this, 6);
    public final 1wn A09 = new C19221WQb(this, 7);
    public final 1wn A0A = new C71932OtG((Object) this, 0);
    public final 1wn A0B = new C19221WQb(this, 8);
    public final UserSession A0C;
    public final C262224Cq A0D;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: X.Vc3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r7v1, types: [X.MDw, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r0v87, types: [X.7ui, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v26, types: [X.LMd, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r22v2, types: [com.instagram.camera.effect.models.CameraAREffect] */
    /* JADX WARNING: type inference failed for: r22v3, types: [com.instagram.camera.effect.models.CameraAREffect] */
    /* JADX WARNING: type inference failed for: r22v4, types: [com.instagram.camera.effect.models.CameraAREffect] */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x033b, code lost:
        if (r0.ordinal() != 3) goto L_0x033d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x03ea  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x03f7  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.arp.api.AvatarEffectsApiController r64, X.AnonymousClass4D7 r65, boolean r66) {
        /*
            r4 = r64
            r3 = 47
            r5 = r65
            boolean r0 = X.C66144MDw.A02(r3, r5)
            if (r0 == 0) goto L_0x042d
            r7 = r5
            X.MDw r7 = (X.C66144MDw) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x042d
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x001a:
            java.lang.Object r1 = r7.A02
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r5 = 1
            if (r0 == 0) goto L_0x03f7
            if (r0 != r5) goto L_0x0464
            java.lang.Object r4 = r7.A01
            com.instagram.arp.api.AvatarEffectsApiController r4 = (com.instagram.arp.api.AvatarEffectsApiController) r4
            X.0eS.A00(r1)
        L_0x002c:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            r10 = 0
            if (r0 == 0) goto L_0x03ea
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.UXs r0 = (X.C15258UXs) r0
            java.lang.String r1 = "AREffectsResponseParser"
            r2 = 0
            if (r0 != 0) goto L_0x006d
            java.lang.String r0 = "Received null Avatar Effects response"
        L_0x0040:
            X.0kD.A07(r1, r0, r10)
        L_0x0043:
            java.lang.String r1 = "AvatarEffectsApiController"
            java.lang.String r0 = "Received null Avatar Effects"
            X.0wb.A03(r1, r0)
        L_0x004a:
            X.0sP r0 = r4.A01
            if (r0 == 0) goto L_0x0051
            r0.invoke(r10)
        L_0x0051:
            X.OSc r0 = r4.A06
            java.lang.String r3 = "avatar effect metadata is null"
        L_0x0055:
            X.02m r2 = r0.A00
            r1 = 112593162(0x6b6090a, float:6.847407E-35)
            r0 = 0
            boolean r0 = r2.isMarkerOn(r1, r0)
            if (r0 == 0) goto L_0x006a
            java.lang.String r0 = "error_message"
            r2.markerAnnotate(r1, r0, r3)
            r0 = 3
        L_0x0067:
            r2.markerEnd(r1, r0)
        L_0x006a:
            X.0gF r6 = X.C60340gF.A00
            return r6
        L_0x006d:
            X.VMb r0 = r0.A00
            if (r0 != 0) goto L_0x0074
            java.lang.String r0 = "Received null Avatar Effects response data"
            goto L_0x0040
        L_0x0074:
            X.VMa r0 = r0.A00
            if (r0 != 0) goto L_0x007b
            java.lang.String r0 = "Received null Avatar Effects query"
            goto L_0x0040
        L_0x007b:
            X.VSE r6 = r0.A00
            if (r6 != 0) goto L_0x0082
            java.lang.String r0 = "Received null Instagram Effects"
            goto L_0x0040
        L_0x0082:
            java.util.List r0 = r6.A01
            if (r0 == 0) goto L_0x0043
            java.lang.Object r7 = X.00k.A0J(r0)
            X.Vd6 r7 = (X.C17737Vd6) r7
            if (r7 == 0) goto L_0x004a
            java.lang.Integer r27 = X.AnonymousClass05K.A0N
            java.lang.String r3 = "FbCameraAREffectsConverter"
            java.lang.String r9 = r7.A08
            if (r9 != 0) goto L_0x00c5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r0 = 1007(0x3ef, float:1.411E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5.append(r0)
            r5.append(r7)
        L_0x00a7:
            java.lang.String r0 = r5.toString()
            X.0wb.A03(r3, r0)
        L_0x00ae:
            X.0sP r0 = r4.A01
            if (r0 == 0) goto L_0x00b5
            r0.invoke(r2)
        L_0x00b5:
            X.OSc r0 = r4.A06
            X.02m r2 = r0.A00
            r1 = 112593162(0x6b6090a, float:6.847407E-35)
            r0 = 0
            boolean r0 = r2.isMarkerOn(r1, r0)
            if (r0 == 0) goto L_0x006a
            r0 = 2
            goto L_0x0067
        L_0x00c5:
            X.VNX r1 = r7.A05
            if (r1 == 0) goto L_0x03d7
            java.lang.String r0 = r1.A00
            if (r0 == 0) goto L_0x03d7
            java.lang.String r8 = r7.A09
            if (r8 != 0) goto L_0x00e3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r0 = 1008(0x3f0, float:1.413E-42)
        L_0x00d8:
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5.append(r0)
            r5.append(r9)
            goto L_0x00a7
        L_0x00e3:
            boolean r0 = r7.A0G
            if (r0 != 0) goto L_0x0105
            X.VVo r1 = r7.A01
            if (r1 == 0) goto L_0x00f3
            java.lang.String r0 = r1.A02
            if (r0 == 0) goto L_0x00f3
            java.lang.String r0 = r1.A01
            if (r0 != 0) goto L_0x0105
        L_0x00f3:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r0 = 1006(0x3ee, float:1.41E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5.append(r0)
        L_0x0101:
            r5.append(r8)
            goto L_0x00a7
        L_0x0105:
            X.VbO r1 = r7.A02
            if (r1 != 0) goto L_0x0111
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r0 = 1005(0x3ed, float:1.408E-42)
            goto L_0x00d8
        L_0x0111:
            X.Vc3 r8 = r1.A00
            if (r8 != 0) goto L_0x0126
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r0 = 2427(0x97b, float:3.401E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5.append(r0)
            java.lang.String r8 = r1.A01
            goto L_0x0101
        L_0x0126:
            java.lang.String r0 = r8.A03
            if (r0 != 0) goto L_0x0140
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r0 = 2425(0x979, float:3.398E-42)
        L_0x0131:
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5.append(r0)
            X.Vc3 r0 = r1.A00
            X.0qQ.A0A(r0)
            java.lang.String r8 = r0.A04
            goto L_0x0101
        L_0x0140:
            X.0qQ.A0A(r8)
            X.UyG r0 = r8.A02
            if (r0 != 0) goto L_0x014f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r0 = 2426(0x97a, float:3.4E-42)
            goto L_0x0131
        L_0x014f:
            X.Vc3 r0 = r1.A00
            X.0qQ.A0A(r0)
            int r0 = r0.A00
            if (r0 != 0) goto L_0x0160
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r0 = 2423(0x977, float:3.395E-42)
            goto L_0x0131
        L_0x0160:
            X.Vc3 r0 = r1.A00
            X.0qQ.A0A(r0)
            java.lang.String r0 = r0.A06
            if (r0 != 0) goto L_0x0171
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r0 = 2424(0x978, float:3.397E-42)
            goto L_0x0131
        L_0x0171:
            X.VbO r3 = r7.A02
            if (r3 == 0) goto L_0x0177
            X.Vc3 r2 = r3.A00
        L_0x0177:
            java.util.HashSet r26 = new java.util.HashSet
            r26.<init>()
            java.util.List r0 = r7.A0C
            java.util.Iterator r8 = r0.iterator()
        L_0x0182:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0196
            java.lang.Object r0 = r8.next()
            java.lang.String r1 = X.DbT.A10(r0)
            r0 = r26
            r0.add(r1)
            goto L_0x0182
        L_0x0196:
            X.VVo r8 = r7.A01
            java.util.ArrayList r25 = new java.util.ArrayList
            r25.<init>()
            java.util.ArrayList r24 = new java.util.ArrayList
            r24.<init>()
            X.OCT r11 = r7.A03
            if (r11 == 0) goto L_0x01da
            java.util.List r0 = r11.A00
            java.util.Iterator r9 = r0.iterator()
        L_0x01ac:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x01c0
            java.lang.Object r0 = r9.next()
            java.lang.String r1 = X.DbT.A10(r0)
            r0 = r25
            r0.add(r1)
            goto L_0x01ac
        L_0x01c0:
            java.util.List r0 = r11.A01
            java.util.Iterator r9 = r0.iterator()
        L_0x01c6:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x01da
            java.lang.Object r0 = r9.next()
            java.lang.String r1 = X.DbT.A10(r0)
            r0 = r24
            r0.add(r1)
            goto L_0x01c6
        L_0x01da:
            java.lang.String r0 = r7.A08
            r23 = r0
            java.lang.String r9 = "Required value was null."
            if (r0 == 0) goto L_0x045e
            if (r3 == 0) goto L_0x0458
            java.lang.String r0 = r3.A01
            r22 = r0
            if (r0 == 0) goto L_0x0458
            boolean r0 = r7.A0F
            r60 = r0
            r62 = 1
            boolean r0 = r3.A05
            boolean r61 = X.AnonymousClass7TF.A1P(r0)
            boolean r0 = r3.A06
            if (r0 != 0) goto L_0x01fc
            r62 = 0
        L_0x01fc:
            if (r2 == 0) goto L_0x0452
            java.lang.String r0 = r2.A04
            r21 = r0
            if (r0 == 0) goto L_0x0452
            java.lang.String r0 = r2.A03
            r20 = r0
            if (r0 == 0) goto L_0x044c
            java.lang.String r0 = r2.A05
            r32 = r0
            X.UyG r0 = r2.A02
            if (r0 == 0) goto L_0x0446
            java.lang.String r33 = r0.toString()
            if (r33 == 0) goto L_0x0446
            java.lang.String r0 = r7.A09
            r19 = r0
            if (r0 == 0) goto L_0x0440
            java.lang.String r0 = r2.A06
            r18 = r0
            if (r0 == 0) goto L_0x043a
            boolean r0 = r7.A0E
            r63 = r0
            int r0 = r2.A00
            long r0 = (long) r0
            r58 = r0
            int r0 = r2.A01
            long r0 = (long) r0
            r65 = r0
            java.util.List r0 = r2.A07
            if (r0 == 0) goto L_0x0272
            java.util.ArrayList r14 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r12 = r0.iterator()
        L_0x023e:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0277
            java.lang.Object r11 = r12.next()
            X.VY7 r11 = (X.VY7) r11
            X.0qQ.A0A(r11)
            X.0qQ.A0B(r11, r5)
            X.LMd r1 = new X.LMd
            r1.<init>()
            java.util.List r0 = java.util.Collections.emptyList()
            X.0qQ.A07(r0)
            r1.A03 = r0
            java.lang.String r0 = r11.A01
            r1.A01 = r0
            java.lang.String r0 = r11.A02
            r1.A02 = r0
            java.lang.String r0 = r11.A00
            r1.A00 = r0
            java.util.List r0 = r11.A03
            r1.A03 = r0
            r14.add(r1)
            goto L_0x023e
        L_0x0272:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L_0x0277:
            X.VNX r0 = r7.A05
            if (r0 == 0) goto L_0x0434
            java.lang.String r1 = r0.A00
            if (r1 == 0) goto L_0x0434
            com.instagram.common.typedurl.SimpleImageUrl r17 = new com.instagram.common.typedurl.SimpleImageUrl
            r0 = r17
            r0.<init>(r1)
            X.VNY r0 = r7.A06
            if (r0 == 0) goto L_0x02b6
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x02b6
            com.instagram.common.typedurl.SimpleImageUrl r12 = new com.instagram.common.typedurl.SimpleImageUrl
            r12.<init>(r0)
        L_0x0293:
            java.util.List r0 = r3.A04
            java.util.ArrayList r11 = X.DbV.A15(r0)
            java.util.Iterator r13 = r0.iterator()
        L_0x029d:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x02b8
            java.lang.Object r9 = r13.next()
            r1 = r9
            X.VVp r1 = (X.C17436VVp) r1
            java.lang.String r0 = r1.A02
            if (r0 == 0) goto L_0x029d
            java.lang.String r0 = r1.A01
            if (r0 == 0) goto L_0x029d
            r11.add(r9)
            goto L_0x029d
        L_0x02b6:
            r12 = 0
            goto L_0x0293
        L_0x02b8:
            java.util.ArrayList r15 = X.AnonymousClass7TG.A0r(r11)
            java.util.Iterator r13 = r11.iterator()
        L_0x02c0:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x02ed
            java.lang.Object r0 = r13.next()
            X.VVp r0 = (X.C17436VVp) r0
            java.lang.String r11 = r0.A02
            X.0qQ.A0A(r11)
            java.lang.String r9 = r0.A01
            X.0qQ.A0A(r9)
            X.VNW r0 = r0.A00
            if (r0 == 0) goto L_0x02eb
            java.lang.String r1 = r0.A00
        L_0x02dc:
            X.7ui r0 = new X.7ui
            r0.<init>()
            r0.A02 = r11
            r0.A01 = r9
            r0.A00 = r1
            r15.add(r0)
            goto L_0x02c0
        L_0x02eb:
            r1 = 0
            goto L_0x02dc
        L_0x02ed:
            boolean r0 = r7.A0D
            r64 = r0
            java.lang.String r0 = r3.A02
            r36 = r0
            java.util.List r0 = r3.A03
            if (r0 == 0) goto L_0x0316
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r9 = r0.iterator()
        L_0x0302:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0319
            java.lang.Object r0 = r9.next()
            X.VSF r0 = (X.VSF) r0
            java.lang.String r0 = r0.A01
            if (r0 == 0) goto L_0x0302
            r1.add(r0)
            goto L_0x0302
        L_0x0316:
            X.0sl r53 = X.0sl.A00
            goto L_0x031d
        L_0x0319:
            java.util.Set r53 = X.00k.A0k(r1)
        L_0x031d:
            if (r8 == 0) goto L_0x036a
            java.lang.String r13 = r8.A01
            java.lang.String r11 = r8.A02
            X.VNV r0 = r8.A00
            if (r0 == 0) goto L_0x036c
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x036c
            com.instagram.common.typedurl.SimpleImageUrl r1 = new com.instagram.common.typedurl.SimpleImageUrl
            r1.<init>(r0)
        L_0x0330:
            X.UyH r0 = r7.A07
            if (r0 == 0) goto L_0x033d
            int r8 = r0.ordinal()
            r54 = 1
            r0 = 3
            if (r8 == r0) goto L_0x033f
        L_0x033d:
            r54 = 0
        L_0x033f:
            java.util.List r0 = r3.A03
            java.util.ArrayList r9 = X.DbV.A15(r0)
            java.util.Iterator r16 = r0.iterator()
        L_0x0349:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x036e
            java.lang.Object r0 = r16.next()
            X.VSF r0 = (X.VSF) r0
            java.lang.String r3 = r0.A01
            if (r3 == 0) goto L_0x0349
            com.facebook.cameracore.ardelivery.model.VersionedCapability r8 = com.facebook.cameracore.ardelivery.model.VersionedCapability.fromServerValue(r3)
            if (r8 == 0) goto L_0x0349
            int r3 = r0.A00
            com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling r0 = new com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling
            r0.<init>((com.facebook.cameracore.ardelivery.model.VersionedCapability) r8, (int) r3)
            r9.add(r0)
            goto L_0x0349
        L_0x036a:
            r13 = 0
            r11 = 0
        L_0x036c:
            r1 = 0
            goto L_0x0330
        L_0x036e:
            java.lang.String r3 = ""
            com.instagram.common.typedurl.SimpleImageUrl r0 = new com.instagram.common.typedurl.SimpleImageUrl
            r0.<init>(r3)
            boolean r8 = r7.A0H
            int r7 = r7.A00
            boolean r3 = r2.A08
            java.util.List r51 = java.util.Collections.emptyList()
            com.instagram.camera.effect.models.CameraAREffect r2 = new com.instagram.camera.effect.models.CameraAREffect
            r28 = r23
            r29 = r22
            r30 = r21
            r31 = r20
            r34 = r19
            r35 = r18
            r37 = r13
            r38 = r11
            r39 = r10
            r40 = r10
            r41 = r10
            r42 = r10
            r43 = r10
            r44 = r10
            r45 = r10
            r46 = r14
            r47 = r15
            r48 = r9
            r49 = r25
            r50 = r24
            r52 = r26
            r55 = r7
            r56 = r58
            r58 = r65
            r65 = r8
            r66 = r3
            r22 = r2
            r23 = r17
            r24 = r12
            r25 = r1
            r26 = r0
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r58, r60, r61, r62, r63, r64, r65, r66)
            r2.A0h = r5
            X.VNU r0 = r6.A00
            if (r0 == 0) goto L_0x00ae
            java.lang.String r1 = r0.A00
            if (r1 == 0) goto L_0x00ae
            com.instagram.common.typedurl.SimpleImageUrl r0 = new com.instagram.common.typedurl.SimpleImageUrl
            r0.<init>(r1)
            r2.A07 = r0
            r2.A08 = r0
            goto L_0x00ae
        L_0x03d7:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r0 = 1009(0x3f1, float:1.414E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5.append(r0)
            r5.append(r1)
            goto L_0x00a7
        L_0x03ea:
            X.0sP r0 = r4.A01
            if (r0 == 0) goto L_0x03f1
            r0.invoke(r10)
        L_0x03f1:
            X.OSc r0 = r4.A06
            java.lang.String r3 = "metadata fetch request failed"
            goto L_0x0055
        L_0x03f7:
            X.0eS.A00(r1)
            X.OSc r0 = r4.A06
            if (r66 == 0) goto L_0x042a
            java.lang.String r1 = "AVATAR_UPDATE"
        L_0x0400:
            X.02m r3 = r0.A00
            r2 = 112593162(0x6b6090a, float:6.847407E-35)
            r0 = 238(0xee, float:3.34E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.markerStart(r2, r0, r1)
            java.lang.String r1 = "use_case"
            java.lang.String r0 = "INSTAGRAM_RTC"
            r3.markerAnnotate(r2, r1, r0)
            com.instagram.arp.api.AvatarTaskHelper r2 = r4.A05
            r7.A01 = r4
            r7.A00 = r5
            r0 = 0
            X.JTg r1 = new X.JTg
            r1.<init>(r2, r0, r5)
            java.lang.String r0 = "AvatarEffectsTask"
            java.lang.Object r1 = com.instagram.arp.api.AvatarTaskHelper.A00(r2, r0, r7, r1)
            if (r1 != r6) goto L_0x002c
            return r6
        L_0x042a:
            java.lang.String r1 = "RTC_PREFETCH"
            goto L_0x0400
        L_0x042d:
            X.MDw r7 = new X.MDw
            r7.<init>(r4, r5, r3)
            goto L_0x001a
        L_0x0434:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r9)
            throw r0
        L_0x043a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r9)
            throw r0
        L_0x0440:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r9)
            throw r0
        L_0x0446:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r9)
            throw r0
        L_0x044c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r9)
            throw r0
        L_0x0452:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r9)
            throw r0
        L_0x0458:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r9)
            throw r0
        L_0x045e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r9)
            throw r0
        L_0x0464:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.arp.api.AvatarEffectsApiController.A00(com.instagram.arp.api.AvatarEffectsApiController, X.4D7, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDw, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.AnonymousClass4D7 r8) {
        /*
            r7 = this;
            r3 = 48
            boolean r0 = X.C66144MDw.A02(r3, r8)
            if (r0 == 0) goto L_0x0088
            r6 = r8
            X.MDw r6 = (X.C66144MDw) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0088
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r6.A02
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r1 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0069
            if (r0 != r1) goto L_0x008e
            java.lang.Object r1 = r6.A01
            com.instagram.arp.api.AvatarEffectsApiController r1 = (com.instagram.arp.api.AvatarEffectsApiController) r1
            X.0eS.A00(r2)
        L_0x0029:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x005f
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r0 = r2.A00
            X.UXt r0 = (X.C15259UXt) r0
            X.VMc r0 = r0.A00
            if (r0 == 0) goto L_0x005d
            X.VNT r0 = r0.A00
            if (r0 == 0) goto L_0x005d
            X.VNS r0 = r0.A00
            if (r0 == 0) goto L_0x005d
            boolean r0 = r0.A00
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L_0x0047:
            X.0sP r1 = r1.A02
            if (r1 == 0) goto L_0x0052
            com.facebook.common.util.TriState r0 = com.facebook.common.util.TriState.valueOf(r2)
            r1.invoke(r0)
        L_0x0052:
            if (r2 == 0) goto L_0x0058
            boolean r4 = r2.booleanValue()
        L_0x0058:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L_0x005d:
            r2 = 0
            goto L_0x0047
        L_0x005f:
            X.0sP r1 = r1.A02
            if (r1 == 0) goto L_0x0058
            com.facebook.common.util.TriState r0 = com.facebook.common.util.TriState.UNSET
            r1.invoke(r0)
            goto L_0x0058
        L_0x0069:
            X.0eS.A00(r2)
            X.0sP r0 = r7.A02
            if (r0 == 0) goto L_0x0058
            com.instagram.arp.api.AvatarTaskHelper r3 = r7.A05
            r6.A01 = r7
            r6.A00 = r1
            r2 = 0
            r0 = 2
            X.JTg r1 = new X.JTg
            r1.<init>(r3, r2, r0)
            java.lang.String r0 = "AvatarStatusTask"
            java.lang.Object r2 = com.instagram.arp.api.AvatarTaskHelper.A00(r3, r0, r6, r1)
            if (r2 != r5) goto L_0x0086
            return r5
        L_0x0086:
            r1 = r7
            goto L_0x0029
        L_0x0088:
            X.MDw r6 = new X.MDw
            r6.<init>(r7, r8, r3)
            goto L_0x0016
        L_0x008e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.arp.api.AvatarEffectsApiController.A01(X.4D7):java.lang.Object");
    }

    public final void A02() {
        C262204Co r0 = this.A03;
        if (r0 != null && r0.isActive()) {
            C262204Co r1 = this.A03;
            if (r1 != null) {
                r1.AG7((CancellationException) null);
            }
            02m r2 = this.A06.A00;
            if (r2.isMarkerOn(112593162, 0)) {
                r2.markerEnd(112593162, 4);
            }
        }
    }

    public final void A03(boolean z) {
        C262224Cq r3 = this.A0D;
        this.A03 = 1Eo.A04(19B.A00, new JV6((Object) this, (AnonymousClass4D7) null, 7, z), r3);
    }

    public /* synthetic */ AvatarEffectsApiController(EffectCollectionService effectCollectionService, UserSession userSession) {
        1Ng A002 = AnonymousClass1Nd.A00(userSession);
        AnonymousClass19S A022 = 19E.A02(AnonymousClass199.A02(AnonymousClass12T.A00.A04, new AnonymousClass19G((C262204Co) null)));
        AvatarTaskHelper avatarTaskHelper = new AvatarTaskHelper(userSession);
        C51972G9s.A1C(A002, A022);
        0qQ.A0B(effectCollectionService, 6);
        this.A0C = userSession;
        this.A07 = A002;
        this.A0D = A022;
        this.A05 = avatarTaskHelper;
        this.A04 = effectCollectionService;
    }
}
