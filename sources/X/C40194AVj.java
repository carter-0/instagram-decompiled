package X;

import android.content.Context;
import android.view.View;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.AVj  reason: case insensitive filesystem */
public final class C40194AVj implements B2V {
    public C366048o6 A00;
    public AnonymousClass9W5 A01;
    public C344207rU A02;
    public AnonymousClass9W6 A03;
    public final Context A04;
    public final UserSession A05;

    public final boolean AJ5(C11354SOn sOn, MediaComposition mediaComposition, C41828B2j b2j, C7334Q4k q4k, Map map, int i, int i2, int i3, int i4) {
        MediaEffect mediaEffect;
        FilterModel A002;
        String str;
        List unmodifiableList;
        List list;
        List<A4L> unmodifiableList2;
        FilterModel filterModel;
        SIO sio;
        C41828B2j b2j2 = b2j;
        boolean A1U = AnonymousClass7TF.A1U(0, b2j2, sOn);
        MediaComposition mediaComposition2 = mediaComposition;
        AnonymousClass7TG.A0w(2, q4k, mediaComposition2, map);
        C344477rv BQ7 = b2j2.BQ7();
        0qQ.A07(BQ7);
        int i5 = i3;
        int i6 = i4;
        BQ7.FLA(0, i, i2, false, i5, i6);
        List list2 = (List) mediaComposition2.A00.get(C266714aE.VIDEO);
        boolean z = false;
        if (list2 == null || (sio = (SIO) list2.get(0)) == null) {
            mediaEffect = null;
        } else {
            mediaEffect = sio.A01;
        }
        if (mediaEffect instanceof C64445Lc0) {
            AnonymousClass3Q2 r9 = ((C64445Lc0) mediaEffect).A00;
            Context context = this.A04;
            UserSession userSession = this.A05;
            C266864aT r0 = r9.A1K;
            if (r0 != null) {
                A002 = AEQ.A01(userSession, r0);
            } else {
                A002 = ADO.A00.A00(context, userSession, r9);
            }
            List list3 = r9.A1i.A03;
            if (!(list3 == null || (unmodifiableList = Collections.unmodifiableList(list3)) == null || (list = r9.A1i.A02) == null || (unmodifiableList2 = Collections.unmodifiableList(list)) == null)) {
                ArrayList A0r = AnonymousClass7TG.A0r(unmodifiableList);
                Iterator it = unmodifiableList.iterator();
                while (it.hasNext()) {
                    AnonymousClass7TE.A1Y(A0r, TimeUnit.MILLISECONDS.toMicros((long) AnonymousClass7TG.A0F(it)));
                }
                ArrayList A1C = AnonymousClass7TE.A1C();
                for (A4L a4l : unmodifiableList2) {
                    A1C.add(00k.A0w(a4l.A00));
                }
                if ((A002 instanceof FilterChain) && (filterModel = (FilterModel) ((FilterChain) A002).A01.get(17)) != null) {
                    C366048o6 r02 = this.A00;
                    if (r02 != null) {
                        r02.A05.A00.add(new C39704A5u(filterModel, A0r, A1C));
                    } else {
                        str = "igluMediaGraph";
                        0qQ.A0F(str);
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
            }
            List A003 = C367508qr.A00(r9, i5, i6);
            AnonymousClass9W6 r03 = this.A03;
            if (r03 != null) {
                AnonymousClass9W6.A01(BQ7, r9, r03, A003);
                C344207rU r04 = this.A02;
                if (r04 != null) {
                    C344207rU.A00(A002, r04);
                    CameraAREffect cameraAREffect = r9.A10;
                    1X6 r17 = 1X6.A00;
                    if (r17 != null) {
                        C344207rU r05 = this.A02;
                        if (r05 != null) {
                            C368528sn A004 = r17.A00(context, (View) null, r05, userSession, A1U, false);
                            A004.A0C((C365408n3) null, (C344557s3) null);
                            A004.A0B();
                            A004.A0D(cameraAREffect);
                            C344207rU r1 = this.A02;
                            if (r1 != null) {
                                C366438ov r06 = (C366438ov) r1.A02(C366438ov.A00);
                                if (cameraAREffect != null) {
                                    z = true;
                                }
                                ((C366428ou) r06).A00.A00 = Boolean.valueOf(z);
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

    public final C344777sP Blt() {
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r15v3, types: [X.8oy] */
    /* JADX WARNING: type inference failed for: r16v2, types: [X.ATs] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C41828B2j AMn(android.opengl.EGLContext r32, android.os.Handler r33, X.C344497rx r34, X.C344557s3 r35, X.C11354SOn r36, X.C7334Q4k r37, java.lang.Object r38) {
        /*
            r31 = this;
            r14 = r32
            r8 = r38
            X.AnonymousClass7TG.A1P(r14, r8)
            r0 = 4
            r1 = r34
            X.0qQ.A0B(r1, r0)
            X.AR5 r7 = new X.AR5
            r7.<init>(r1, r0)
            r4 = r31
            android.content.Context r3 = r4.A04
            com.instagram.common.session.UserSession r2 = r4.A05
            X.7ro r12 = new X.7ro
            r12.<init>()
            X.7qz r22 = new X.7qz
            r22.<init>()
            X.8tC r21 = new X.8tC
            r21.<init>()
            r19 = 0
            r18 = 0
            r6 = 1
            r11 = 3
            r13 = r33
            if (r33 == 0) goto L_0x0033
            r18 = r13
        L_0x0033:
            r9 = 0
            r24 = r6
            r25 = r9
            r26 = r9
            r27 = r9
            r28 = r6
            r29 = r9
            r30 = r9
            r17 = r3
            r20 = r12
            r23 = r6
            X.7sO r10 = X.C344787sQ.A00(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            X.0Tu r5 = X.0Tu.A05
            r0 = 36319476111121842(0x81085f00081db2, double:3.0319211672406126E-306)
            boolean r24 = X.182.A06(r5, r2, r0)
            if (r24 == 0) goto L_0x0060
            X.0wj r1 = X.0wj.A01
            java.lang.String r0 = "StoriesArFrameLiteRendererCallback"
            X.AnonymousClass7TG.A1H(r1, r0)
        L_0x0060:
            java.lang.String r22 = "StoriesArFrameLiteRendererCallback"
            r20 = r3
            r21 = r2
            X.8o6 r0 = X.C365968ny.A01(r20, r21, r22, r23, r24, r25, r26)
            r4.A00 = r0
            r24 = r9
            X.8o6 r0 = X.C365968ny.A01(r20, r21, r22, r23, r24, r25, r26)
            X.9W6 r1 = new X.9W6
            r1.<init>(r3, r12, r0, r2)
            r4.A03 = r1
            X.8o6 r0 = r4.A00
            if (r0 == 0) goto L_0x012e
            X.7sL[] r0 = new X.C344737sL[]{r0, r1}
            java.util.ArrayList r1 = X.0sr.A1L(r0)
            X.9W5 r0 = new X.9W5
            r0.<init>(r1)
            r4.A01 = r0
            X.0qg.A01()
            long r17 = X.0qg.A00(r3, r9)
            r0 = 36601646872400146(0x82090100061112, double:3.210367092883469E-306)
            long r15 = X.182.A01(r5, r2, r0)
            r0 = 1048576(0x100000, double:5.180654E-318)
            long r15 = r15 * r0
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 < 0) goto L_0x0114
            r0 = 36320171895431246(0x8109010002204e, double:3.032361184039578E-306)
            boolean r0 = X.182.A06(r5, r2, r0)
            if (r0 == 0) goto L_0x0114
            java.lang.Integer r0 = X.AnonymousClass9TI.A01(r5, r2)
            X.9da r20 = X.C365968ny.A02(r3, r2, r0)
            X.9W5 r9 = r4.A01
            if (r9 == 0) goto L_0x012b
            r0 = 36320171895824466(0x81090100082052, double:3.032361184288252E-306)
            boolean r23 = X.182.A06(r5, r2, r0)
            X.ATs r0 = new X.ATs
            r16 = r0
            r17 = r19
            r18 = r10
            r19 = r12
            r21 = r9
            r22 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
        L_0x00d5:
            X.7s6 r5 = new X.7s6
            r5.<init>(r8, r11)
            r1 = r35
            if (r35 == 0) goto L_0x0110
            r5.A0A(r1, r6)
        L_0x00e1:
            java.lang.String r1 = "instagram_post_capture"
            X.7qZ r9 = new X.7qZ
            r9.<init>((java.lang.String) r1)
            X.7qb r1 = X.C343767ql.A00
            r9.A02(r1, r10)
            X.7qb r1 = X.C343737qi.A0E
            r9.A02(r1, r0)
            X.7qb r0 = X.C343677qc.A00
            r9.A02(r0, r2)
            X.7qb r0 = X.C366138oF.A00
            X.C343647qZ.A00(r9, r0, r6)
            X.7qb r0 = X.C343737qi.A0I
            r9.A02(r0, r13)
            X.C343647qZ.A01(r9, r7, r5, r8)
            X.7rU r1 = X.AAI.A00(r3, r9)
            r4.A02 = r1
            X.AVo r0 = new X.AVo
            r0.<init>(r1)
            return r0
        L_0x0110:
            r5.A09(r14, r6)
            goto L_0x00e1
        L_0x0114:
            X.9W5 r1 = r4.A01
            if (r1 == 0) goto L_0x012b
            X.8oy r0 = new X.8oy
            r15 = r0
            r16 = r19
            r17 = r10
            r18 = r12
            r19 = r1
            r20 = r6
            r21 = r9
            r15.<init>(r16, r17, r18, r19, r20, r21)
            goto L_0x00d5
        L_0x012b:
            java.lang.String r0 = "commonIoMultiMediaGraph"
            goto L_0x0130
        L_0x012e:
            java.lang.String r0 = "igluMediaGraph"
        L_0x0130:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40194AVj.AMn(android.opengl.EGLContext, android.os.Handler, X.7rx, X.7s3, X.SOn, X.Q4k, java.lang.Object):X.B2j");
    }

    public C40194AVj(Context context, UserSession userSession) {
        this.A04 = context;
        this.A05 = userSession;
    }
}
