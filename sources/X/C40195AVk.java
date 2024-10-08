package X;

import android.content.Context;
import android.view.View;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.AVk  reason: case insensitive filesystem */
public final class C40195AVk implements B2V {
    public AnonymousClass9W5 A00;
    public C344207rU A01;
    public C40140ATg A02;
    public AnonymousClass9W6 A03;
    public final boolean A04;
    public final Context A05;
    public final UserSession A06;
    public final boolean A07;

    public final boolean AJ5(C11354SOn sOn, MediaComposition mediaComposition, C41828B2j b2j, C7334Q4k q4k, Map map, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        String str;
        MediaEffect mediaEffect;
        FilterModel A002;
        C41828B2j b2j2 = b2j;
        boolean A1U = AnonymousClass7TF.A1U(0, b2j2, sOn);
        MediaComposition mediaComposition2 = mediaComposition;
        C7334Q4k q4k2 = q4k;
        AnonymousClass7TG.A0w(2, q4k2, mediaComposition2, map);
        C344477rv BQ7 = b2j2.BQ7();
        0qQ.A07(BQ7);
        C344697sH BQ8 = BQ7.BQ8();
        C266714aE r5 = C266714aE.VIDEO;
        HashMap A072 = mediaComposition2.A07(r5);
        if (A072 != null) {
            Iterator it = A072.keySet().iterator();
            while (true) {
                i5 = i3;
                i6 = i4;
                if (!it.hasNext()) {
                    break;
                }
                Number number = (Number) it.next();
                0qQ.A0A(number);
                C346277uu r3 = (C346277uu) BQ8.BHM(number.intValue());
                r3.A07 = false;
                r3.A00(new AnonymousClass800(A1U), i5, i6);
            }
            List list = (List) mediaComposition2.A00.get(r5);
            if (list != null) {
                C40140ATg aTg = this.A02;
                if (aTg != null) {
                    Context context = this.A05;
                    boolean z = true;
                    C393199w3.A00(context, BQ7, new C368708tC(), aTg, q4k2, list, false);
                    C40140ATg aTg2 = this.A02;
                    if (aTg2 != null) {
                        C344567s4 r52 = aTg2.A02;
                        if (r52 != null) {
                            r52.A00.post(new C40976AmM(r52, aTg2));
                        }
                        BQ7.FLA(0, i, i2, false, i5, i6);
                        ArrayList A1C = AnonymousClass7TE.A1C();
                        for (Object next : list) {
                            if (((SIO) next).A01 instanceof C64445Lc0) {
                                A1C.add(next);
                            }
                        }
                        SIO sio = (SIO) 00k.A0J(A1C);
                        if (sio != null) {
                            mediaEffect = sio.A01;
                        } else {
                            mediaEffect = null;
                        }
                        0qQ.A0C(mediaEffect, "null cannot be cast to non-null type com.facebook.videolite.instagram.onecamera.PendingMediaEffect");
                        C64445Lc0 lc0 = (C64445Lc0) mediaEffect;
                        if (lc0 != null) {
                            AnonymousClass3Q2 r6 = lc0.A00;
                            UserSession userSession = this.A06;
                            C266864aT r0 = r6.A1K;
                            if (r0 != null) {
                                A002 = AEQ.A01(userSession, r0);
                            } else {
                                A002 = ADO.A00.A00(context, userSession, r6);
                            }
                            List A003 = C367508qr.A00(r6, i5, i6);
                            AnonymousClass9W6 r02 = this.A03;
                            if (r02 != null) {
                                AnonymousClass9W6.A01(BQ7, r6, r02, A003);
                                C344207rU r03 = this.A01;
                                if (r03 != null) {
                                    C344207rU.A00(A002, r03);
                                    CameraAREffect cameraAREffect = r6.A10;
                                    1X6 r12 = 1X6.A00;
                                    if (r12 != null) {
                                        C344207rU r04 = this.A01;
                                        if (r04 != null) {
                                            C368528sn A004 = r12.A00(context, (View) null, r04, userSession, A1U, false);
                                            A004.A0C((C365408n3) null, (C344557s3) null);
                                            A004.A0B();
                                            A004.A0D(cameraAREffect);
                                            C344207rU r1 = this.A01;
                                            if (r1 != null) {
                                                C366438ov r05 = (C366438ov) r1.A02(C366438ov.A00);
                                                if (cameraAREffect == null) {
                                                    z = false;
                                                }
                                                ((C366428ou) r05).A00.A00 = Boolean.valueOf(z);
                                            }
                                        }
                                    } else {
                                        str = "instance";
                                    }
                                }
                                str = "cameraService";
                            } else {
                                str = "regionTrackingOverlayMediaGraph";
                            }
                            0qQ.A0F(str);
                            throw AnonymousClass00P.createAndThrow();
                        }
                        return A1U;
                    }
                }
                str = "stitchGraph";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: type inference failed for: r16v3, types: [X.8oy] */
    /* JADX WARNING: type inference failed for: r16v4, types: [X.ATs] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C41828B2j AMn(android.opengl.EGLContext r32, android.os.Handler r33, X.C344497rx r34, X.C344557s3 r35, X.C11354SOn r36, X.C7334Q4k r37, java.lang.Object r38) {
        /*
            r31 = this;
            r7 = 1
            r30 = r32
            r2 = r34
            r9 = r38
            r0 = r30
            X.AnonymousClass7TG.A0w(r7, r0, r9, r2)
            r1 = r36
            r0 = r37
            X.AnonymousClass7TG.A1S(r0, r1)
            r11 = 0
            X.AR5 r8 = new X.AR5
            r8.<init>(r2, r11)
            r4 = r31
            android.content.Context r5 = r4.A05
            com.instagram.common.session.UserSession r3 = r4.A06
            boolean r14 = r4.A07
            X.7ro r2 = new X.7ro
            r2.<init>()
            X.7qz r21 = new X.7qz
            r21.<init>()
            X.8tC r20 = new X.8tC
            r20.<init>()
            r18 = 0
            r17 = 0
            r12 = 3
            r15 = r33
            if (r33 == 0) goto L_0x003b
            r17 = r15
        L_0x003b:
            r23 = r7
            r24 = r11
            r25 = r11
            r26 = r11
            r27 = r7
            r28 = r11
            r29 = r11
            r19 = r2
            r22 = r7
            r16 = r5
            X.7sO r10 = X.C344787sQ.A00(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            X.0Tu r6 = X.0Tu.A05
            r0 = 36319476111252916(0x81085f000a1db4, double:3.0319211673235044E-306)
            boolean r23 = X.182.A06(r6, r3, r0)
            if (r23 == 0) goto L_0x0067
            X.0wj r1 = X.0wj.A01
            java.lang.String r0 = "ClipsArFrameLiteRendererCallback"
            X.AnonymousClass7TG.A1H(r1, r0)
        L_0x0067:
            boolean r0 = r4.A04
            r26 = r0
            java.lang.String r21 = "ClipsArFrameLiteRendererCallback"
            r19 = r5
            r20 = r3
            r22 = r0
            X.8o6 r1 = X.C365968ny.A01(r19, r20, r21, r22, r23, r24, r25)
            r22 = r7
            r23 = r11
            X.8o6 r13 = X.C365968ny.A01(r19, r20, r21, r22, r23, r24, r25)
            X.9W6 r0 = new X.9W6
            r0.<init>(r5, r2, r13, r3)
            r4.A03 = r0
            X.7sL[] r0 = new X.C344737sL[]{r1, r0}
            java.util.ArrayList r1 = X.0sr.A1L(r0)
            X.9W5 r0 = new X.9W5
            r0.<init>(r1)
            r4.A00 = r0
            r0 = 36319587779812871(0x81087900011e07, double:3.031991786970473E-306)
            boolean r0 = X.182.A06(r6, r3, r0)
            if (r0 == 0) goto L_0x014d
            r0 = 36319587779878408(0x81087900021e08, double:3.031991787011919E-306)
            boolean r0 = X.182.A06(r6, r3, r0)
            if (r0 == 0) goto L_0x014d
            r13 = 1
            r0 = 36319587779943945(0x81087900031e09, double:3.031991787053365E-306)
            boolean r0 = X.182.A06(r6, r3, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0149
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
        L_0x00bb:
            X.9da r20 = X.C365968ny.A02(r5, r3, r0)
            X.9W5 r1 = r4.A00
            if (r1 == 0) goto L_0x0167
            X.ATs r0 = new X.ATs
            r17 = r18
            r18 = r10
            r19 = r2
            r21 = r1
            r22 = r26
            r23 = r7
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
        L_0x00d6:
            X.7sL r0 = (X.C344737sL) r0
            X.ATg r6 = new X.ATg
            r6.<init>(r2)
            r4.A02 = r6
            X.AVq r1 = new X.AVq
            r1.<init>(r2, r0, r6, r13)
            X.7s6 r6 = new X.7s6
            r6.<init>(r9, r12)
            r11 = r35
            if (r35 == 0) goto L_0x0143
            int r13 = r11.Apq()
            r0 = r13 & 32
            if (r0 == 0) goto L_0x0141
            r0 = 33
            int r2 = X.C392929vc.A00(r11, r0)
            r0 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0101
            r2 = r2 | 8192(0x2000, float:1.14794E-41)
        L_0x0101:
            r6.A0A(r11, r2)
        L_0x0104:
            java.lang.String r0 = "instagram_post_capture_transcoder"
            X.7qZ r2 = new X.7qZ
            r2.<init>((java.lang.String) r0)
            X.7qb r0 = X.C343767ql.A00
            r2.A02(r0, r10)
            X.7qb r0 = X.C343737qi.A0E
            r2.A02(r0, r1)
            X.7qb r0 = X.C343737qi.A08
            X.C343647qZ.A00(r2, r0, r14)
            X.7qb r0 = X.C343677qc.A00
            r2.A02(r0, r3)
            X.7qb r0 = X.C366138oF.A00
            X.C343647qZ.A00(r2, r0, r7)
            X.7qb r0 = X.C343737qi.A0I
            r2.A02(r0, r15)
            X.C343647qZ.A01(r2, r8, r6, r9)
            X.7qb r1 = X.C343737qi.A0G
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r2.A02(r1, r0)
            X.7rU r1 = X.AAI.A00(r5, r2)
            r4.A01 = r1
            X.AVo r0 = new X.AVo
            r0.<init>(r1)
            return r0
        L_0x0141:
            r2 = 1
            goto L_0x0101
        L_0x0143:
            r0 = r30
            r6.A09(r0, r7)
            goto L_0x0104
        L_0x0149:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            goto L_0x00bb
        L_0x014d:
            r13 = 0
            X.9W5 r1 = r4.A00
            if (r1 == 0) goto L_0x0167
            X.8oy r0 = new X.8oy
            r16 = r0
            r17 = r18
            r18 = r10
            r19 = r2
            r20 = r1
            r21 = r26
            r22 = r11
            r16.<init>(r17, r18, r19, r20, r21, r22)
            goto L_0x00d6
        L_0x0167:
            java.lang.String r0 = "commonIoMultiMediaGraph"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40195AVk.AMn(android.opengl.EGLContext, android.os.Handler, X.7rx, X.7s3, X.SOn, X.Q4k, java.lang.Object):X.B2j");
    }

    public final C344777sP Blt() {
        return null;
    }

    public C40195AVk(Context context, UserSession userSession, boolean z, boolean z2) {
        this.A05 = context;
        this.A06 = userSession;
        this.A04 = z;
        this.A07 = z2;
    }
}
