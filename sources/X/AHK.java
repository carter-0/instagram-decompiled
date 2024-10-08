package X;

import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import com.instagram.common.clips.model.ClipSegment;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public abstract class AHK {
    public static final boolean A03(ClipSegment clipSegment, 0sP r11) {
        int i;
        StringBuilder A1A;
        String str;
        0qQ.A0B(clipSegment, 0);
        if (clipSegment instanceof ClipSegment.VideoSegment) {
            ClipSegment.VideoSegment videoSegment = (ClipSegment.VideoSegment) clipSegment;
            int i2 = videoSegment.A06;
            int i3 = videoSegment.A07;
            i = i2 - i3;
            if (i <= 0) {
                A1A = AnonymousClass7TE.A1A();
                str = "VideoSegment has invalid duration: ";
            } else {
                float f = videoSegment.A00;
                float abs = Math.abs(f);
                i = videoSegment.A04;
                if (((long) Math.min(((float) i2) * abs, (float) i)) > ((long) Math.max(((float) i3) * abs, 0.0f))) {
                    return true;
                }
                A1A = AnonymousClass7TE.A1A();
                A1A.append("VideoSegment has invalid source time range. trimmedStartTimeMs: ");
                A1A.append(i3);
                A1A.append(", trimmedEndTimeMs: ");
                A1A.append(i2);
                A1A.append(", recordingSpeed: ");
                A1A.append(f);
                str = ", originalDurationInMs: ";
            }
        } else if (clipSegment instanceof ClipSegment.PhotoSegment) {
            i = ((ClipSegment.PhotoSegment) clipSegment).A00;
            if (i > 0) {
                return true;
            }
            A1A = AnonymousClass7TE.A1A();
            str = "PhotoSegment has invalid duration: ";
        } else {
            throw AnonymousClass7TE.A1K();
        }
        A1A.append(str);
        A1A.append(i);
        r11.invoke(A1A.toString());
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: X.9db} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v103, resolved type: X.8o6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v104, resolved type: X.8o6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v3, resolved type: X.8o6} */
    /* JADX WARNING: type inference failed for: r1v6, types: [com.facebook.videolite.transcoder.base.composition.MediaEffect, java.lang.Object, X.Srf] */
    /* JADX WARNING: type inference failed for: r1v7, types: [com.facebook.videolite.transcoder.base.composition.MediaEffect, java.lang.Object, X.Sre] */
    /* JADX WARNING: type inference failed for: r1v29, types: [X.9uQ, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v30 */
    /* JADX WARNING: type inference failed for: r11v6, types: [com.facebook.videolite.transcoder.base.composition.MediaEffect, java.lang.Object, X.Srf] */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0250, code lost:
        r6 = new X.A6X();
        r6.A01.set(r10);
        r6.A02.set(r9);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C266824aP A00(X.C365998o1 r70, X.C366518pA r71, com.google.common.collect.ImmutableList r72, com.google.common.collect.ImmutableList r73, com.google.common.collect.ImmutableList r74, X.C357608Yw r75, java.util.List r76, java.util.List r77, X.0sP r78, float r79, float r80, int r81, boolean r82, boolean r83) {
        /*
            r31 = 0
            r30 = 2
            X.4aP r25 = new X.4aP
            r25.<init>()
            java.util.ArrayList r29 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r73.iterator()
        L_0x0011:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002f
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.instagram.common.clips.model.ClipSegment r0 = (com.instagram.common.clips.model.ClipSegment) r0
            X.0qQ.A0A(r0)
            r3 = r78
            boolean r0 = A03(r0, r3)
            if (r0 == 0) goto L_0x0011
            r0 = r29
            r0.add(r1)
            goto L_0x0011
        L_0x002f:
            java.util.Iterator r28 = r29.iterator()
            r12 = 0
            r26 = 0
        L_0x0036:
            boolean r0 = r28.hasNext()
            if (r0 == 0) goto L_0x0516
            java.lang.Object r0 = r28.next()
            int r27 = r12 + 1
            if (r12 < 0) goto L_0x0608
            com.instagram.common.clips.model.ClipSegment r0 = (com.instagram.common.clips.model.ClipSegment) r0
            X.0qQ.A0A(r0)
            X.4aE r32 = X.C266714aE.VIDEO
            r1 = 4197(0x1065, float:5.881E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            java.lang.String r5 = X.002.A0O(r1, r12)
            java.util.concurrent.TimeUnit r33 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1 = r26
            long r1 = (long) r1
            r3 = r33
            long r1 = r3.toMicros(r1)
            X.4aJ r4 = new X.4aJ
            r3 = r32
            r4.<init>(r3, r5, r1)
            r1 = r81
            X.4aI r1 = A02(r0, r1)
            r4.A02(r1)
            boolean r3 = r0 instanceof com.instagram.common.clips.model.ClipSegment.VideoSegment
            if (r3 == 0) goto L_0x007c
            r1 = r0
            com.instagram.common.clips.model.ClipSegment$VideoSegment r1 = (com.instagram.common.clips.model.ClipSegment.VideoSegment) r1
            float r1 = r1.A00
            r4.A00(r1)
        L_0x007c:
            X.4aM r2 = new X.4aM
            r2.<init>(r4)
            r1 = r25
            r1.A04(r2)
            if (r3 == 0) goto L_0x00a6
            if (r82 == 0) goto L_0x00a6
            r34 = r75
            r56 = r76
            r57 = r79
            if (r75 != 0) goto L_0x031b
            r1 = r0
            com.instagram.common.clips.model.ClipSegment$VideoSegment r1 = (com.instagram.common.clips.model.ClipSegment.VideoSegment) r1
            r55 = 0
            r54 = r1
            r58 = r12
            r59 = r26
            X.4aM r2 = A01(r54, r55, r56, r57, r58, r59)
            r1 = r25
            r1.A04(r2)
        L_0x00a6:
            if (r3 == 0) goto L_0x0314
            r1 = r0
            com.instagram.common.clips.model.ClipSegment$VideoSegment r1 = (com.instagram.common.clips.model.ClipSegment.VideoSegment) r1
            com.instagram.common.clips.model.LayoutTransform r6 = r1.A0B
        L_0x00ad:
            if (r6 == 0) goto L_0x0311
            java.lang.Integer r1 = r6.A06
            int r4 = r1.intValue()
        L_0x00b5:
            r1 = 1065353216(0x3f800000, float:1.0)
            r11 = 1
            r7 = r80
            if (r4 == r11) goto L_0x02ee
            r2 = r30
            if (r4 == r2) goto L_0x02cb
            if (r3 == 0) goto L_0x02c4
            r2 = r0
            com.instagram.common.clips.model.ClipSegment$VideoSegment r2 = (com.instagram.common.clips.model.ClipSegment.VideoSegment) r2
            int r2 = r2.A05
        L_0x00c7:
            int r4 = r2 % 180
            if (r4 != 0) goto L_0x02b4
            if (r3 == 0) goto L_0x02ad
            r2 = r0
            com.instagram.common.clips.model.ClipSegment$VideoSegment r2 = (com.instagram.common.clips.model.ClipSegment.VideoSegment) r2
            int r2 = r2.A08
        L_0x00d2:
            float r10 = (float) r2
            if (r4 != 0) goto L_0x029d
            if (r3 == 0) goto L_0x0296
            r2 = r0
            com.instagram.common.clips.model.ClipSegment$VideoSegment r2 = (com.instagram.common.clips.model.ClipSegment.VideoSegment) r2
            int r2 = r2.A03
        L_0x00dc:
            float r9 = (float) r2
            float r8 = r10 / r9
            float r2 = X.AnonymousClass7TE.A00(r8, r7)
            double r4 = (double) r2
            r14 = 4547007122018943789(0x3f1a36e2eb1c432d, double:1.0E-4)
            r2 = 0
            int r13 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r13 > 0) goto L_0x027f
            android.graphics.RectF r10 = new android.graphics.RectF
            r10.<init>(r2, r2, r1, r1)
        L_0x00f3:
            if (r6 == 0) goto L_0x0277
            java.lang.Integer r2 = r6.A06
            int r4 = r2.intValue()
            r2 = r30
            if (r4 != r2) goto L_0x0277
            android.graphics.RectF r9 = X.C393909xE.A00(r7, r1)
        L_0x0103:
            r2 = r26
            long r7 = (long) r2
            int r2 = r29.size()
            int r2 = r2 + -1
            if (r12 != r2) goto L_0x0262
            r4 = -1
        L_0x0110:
            X.4aF r14 = new X.4aF
            r15 = r33
            r16 = r7
            r18 = r4
            r14.<init>(r15, r16, r18)
            if (r83 == 0) goto L_0x01d9
            r35 = r70
            if (r70 == 0) goto L_0x01d9
            r5 = r71
            if (r71 == 0) goto L_0x01d9
            X.9dY r4 = new X.9dY
            r4.<init>()
            if (r6 == 0) goto L_0x01d6
            java.lang.Integer r7 = r6.A06
        L_0x012e:
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            if (r7 != r2) goto L_0x01d0
            float r8 = r6.A00
            float r7 = r6.A03
            float r2 = r6.A02
            float r6 = r6.A01
            r4.A0B(r8, r7, r2, r6)
        L_0x013d:
            r34 = 0
            X.8o6 r2 = new X.8o6
            r33 = r2
            r36 = r4
            r37 = r34
            r38 = r12
            r39 = r11
            r40 = r31
            r41 = r11
            r42 = r11
            r43 = r11
            r33.<init>(r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterGroup r4 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterGroup
            r4.<init>()
            r6 = 8
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            float[] r15 = X.C369398uX.A00(r7)
            float[] r16 = X.C369398uX.A00(r7)
            r37 = 0
            r17 = r37
            r18 = r37
            r19 = r37
            r20 = r11
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel r7 = X.C369408uY.A02(r15, r16, r17, r18, r19, r20)
            r4.A00(r7, r6)
            r6 = 17
            java.lang.String r17 = "normal"
            float[] r18 = X.C366498p3.A00()
            float[] r19 = X.C366498p3.A00()
            java.lang.Integer r34 = X.AnonymousClass05K.A00
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r16 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams
            r33 = r16
            r35 = r34
            r36 = r1
            r38 = r37
            r39 = r37
            r33.<init>(r34, r35, r36, r37, r38, r39, r40)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter r7 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter
            r22 = r11
            r23 = r11
            r15 = r7
            r20 = r1
            r21 = r11
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            r4.A00(r7, r6)
            X.8pF r1 = r5.A00(r4)
            r2.A03 = r1
        L_0x01ac:
            X.8o7 r2 = (X.C366058o7) r2
            X.9sO r1 = X.C391129sO.LAYOUT
            X.AVf r4 = new X.AVf
            r4.<init>(r1, r2)
            r2 = r25
            r1 = r32
            r2.A01(r14, r1, r4)
            if (r3 == 0) goto L_0x01cb
            com.instagram.common.clips.model.ClipSegment$VideoSegment r0 = (com.instagram.common.clips.model.ClipSegment.VideoSegment) r0
            int r1 = r0.A06
            int r0 = r0.A07
            int r1 = r1 - r0
        L_0x01c5:
            int r26 = r26 + r1
            r12 = r27
            goto L_0x0036
        L_0x01cb:
            com.instagram.common.clips.model.ClipSegment$PhotoSegment r0 = (com.instagram.common.clips.model.ClipSegment.PhotoSegment) r0
            int r1 = r0.A00
            goto L_0x01c5
        L_0x01d0:
            r2 = 0
            r4.A0B(r2, r2, r1, r2)
            goto L_0x013d
        L_0x01d6:
            r7 = 0
            goto L_0x012e
        L_0x01d9:
            X.9db r2 = new X.9db
            r2.<init>()
            if (r6 == 0) goto L_0x0260
            java.lang.Integer r5 = r6.A06
        L_0x01e2:
            java.lang.Integer r4 = X.AnonymousClass05K.A0N
            if (r5 != r4) goto L_0x0250
            if (r6 == 0) goto L_0x01ac
            float r13 = r6.A00
            float r11 = r6.A03
            float r7 = r6.A02
            float r8 = r6.A01
            X.A6X r6 = r2.A03
            android.graphics.RectF r4 = r6.A01
            r4.set(r10)
            android.graphics.RectF r4 = r6.A02
            r4.set(r9)
            float r1 = X.AnonymousClass7TE.A00(r7, r1)
            double r4 = (double) r1
            r9 = 4532020583610935537(0x3ee4f8b588e368f1, double:1.0E-5)
            int r1 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r1 >= 0) goto L_0x0234
            float r1 = java.lang.Math.abs(r13)
            double r4 = (double) r1
            int r1 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r1 >= 0) goto L_0x0234
            float r1 = java.lang.Math.abs(r11)
            double r4 = (double) r1
            int r1 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r1 >= 0) goto L_0x0234
            float r1 = java.lang.Math.abs(r8)
            double r4 = (double) r1
            int r1 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r1 >= 0) goto L_0x0234
        L_0x0225:
            r1 = 0
            r6.A00 = r1
        L_0x0228:
            android.util.SparseArray r1 = r2.A02
            r1.put(r12, r6)
            java.util.ArrayList r1 = r2.A05
            X.AnonymousClass7TF.A1M(r1, r12)
            goto L_0x01ac
        L_0x0234:
            X.9uQ r1 = r6.A00
            if (r1 != 0) goto L_0x0247
            X.9uQ r1 = new X.9uQ
            r1.<init>()
            r1.A00 = r13
            r1.A03 = r11
            r1.A02 = r7
            r1.A01 = r8
            r6.A00 = r1
        L_0x0247:
            r1.A00 = r13
            r1.A03 = r11
            r1.A02 = r7
            r1.A01 = r8
            goto L_0x0228
        L_0x0250:
            X.A6X r6 = new X.A6X
            r6.<init>()
            android.graphics.RectF r1 = r6.A01
            r1.set(r10)
            android.graphics.RectF r1 = r6.A02
            r1.set(r9)
            goto L_0x0225
        L_0x0260:
            r5 = 0
            goto L_0x01e2
        L_0x0262:
            if (r3 == 0) goto L_0x0271
            r2 = r0
            com.instagram.common.clips.model.ClipSegment$VideoSegment r2 = (com.instagram.common.clips.model.ClipSegment.VideoSegment) r2
            int r4 = r2.A06
            int r2 = r2.A07
            int r4 = r4 - r2
        L_0x026c:
            int r4 = r4 + r26
            long r4 = (long) r4
            goto L_0x0110
        L_0x0271:
            r2 = r0
            com.instagram.common.clips.model.ClipSegment$PhotoSegment r2 = (com.instagram.common.clips.model.ClipSegment.PhotoSegment) r2
            int r4 = r2.A00
            goto L_0x026c
        L_0x0277:
            r2 = 0
            android.graphics.RectF r9 = new android.graphics.RectF
            r9.<init>(r2, r2, r1, r1)
            goto L_0x0103
        L_0x027f:
            float r10 = r10 / r80
            int r4 = (r8 > r80 ? 1 : (r8 == r80 ? 0 : -1))
            if (r4 >= 0) goto L_0x0294
            float r4 = r9 - r10
            float r4 = r4 / r9
            r5 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r5
        L_0x028b:
            float r5 = r1 - r4
            android.graphics.RectF r10 = new android.graphics.RectF
            r10.<init>(r2, r4, r1, r5)
            goto L_0x00f3
        L_0x0294:
            r4 = 0
            goto L_0x028b
        L_0x0296:
            r2 = r0
            com.instagram.common.clips.model.ClipSegment$PhotoSegment r2 = (com.instagram.common.clips.model.ClipSegment.PhotoSegment) r2
            int r2 = r2.A01
            goto L_0x00dc
        L_0x029d:
            if (r3 == 0) goto L_0x02a6
            r2 = r0
            com.instagram.common.clips.model.ClipSegment$VideoSegment r2 = (com.instagram.common.clips.model.ClipSegment.VideoSegment) r2
            int r2 = r2.A08
            goto L_0x00dc
        L_0x02a6:
            r2 = r0
            com.instagram.common.clips.model.ClipSegment$PhotoSegment r2 = (com.instagram.common.clips.model.ClipSegment.PhotoSegment) r2
            int r2 = r2.A03
            goto L_0x00dc
        L_0x02ad:
            r2 = r0
            com.instagram.common.clips.model.ClipSegment$PhotoSegment r2 = (com.instagram.common.clips.model.ClipSegment.PhotoSegment) r2
            int r2 = r2.A03
            goto L_0x00d2
        L_0x02b4:
            if (r3 == 0) goto L_0x02bd
            r2 = r0
            com.instagram.common.clips.model.ClipSegment$VideoSegment r2 = (com.instagram.common.clips.model.ClipSegment.VideoSegment) r2
            int r2 = r2.A03
            goto L_0x00d2
        L_0x02bd:
            r2 = r0
            com.instagram.common.clips.model.ClipSegment$PhotoSegment r2 = (com.instagram.common.clips.model.ClipSegment.PhotoSegment) r2
            int r2 = r2.A01
            goto L_0x00d2
        L_0x02c4:
            r2 = r0
            com.instagram.common.clips.model.ClipSegment$PhotoSegment r2 = (com.instagram.common.clips.model.ClipSegment.PhotoSegment) r2
            int r2 = r2.A02
            goto L_0x00c7
        L_0x02cb:
            if (r3 == 0) goto L_0x02e8
            r2 = r0
            com.instagram.common.clips.model.ClipSegment$VideoSegment r2 = (com.instagram.common.clips.model.ClipSegment.VideoSegment) r2
            int r2 = r2.A08
        L_0x02d2:
            float r4 = (float) r2
            if (r3 == 0) goto L_0x02e2
            r2 = r0
            com.instagram.common.clips.model.ClipSegment$VideoSegment r2 = (com.instagram.common.clips.model.ClipSegment.VideoSegment) r2
            int r2 = r2.A03
        L_0x02da:
            float r2 = (float) r2
            float r4 = r4 / r2
            android.graphics.RectF r10 = X.C393909xE.A00(r4, r1)
            goto L_0x00f3
        L_0x02e2:
            r2 = r0
            com.instagram.common.clips.model.ClipSegment$PhotoSegment r2 = (com.instagram.common.clips.model.ClipSegment.PhotoSegment) r2
            int r2 = r2.A01
            goto L_0x02da
        L_0x02e8:
            r2 = r0
            com.instagram.common.clips.model.ClipSegment$PhotoSegment r2 = (com.instagram.common.clips.model.ClipSegment.PhotoSegment) r2
            int r2 = r2.A03
            goto L_0x02d2
        L_0x02ee:
            if (r3 == 0) goto L_0x030b
            r2 = r0
            com.instagram.common.clips.model.ClipSegment$VideoSegment r2 = (com.instagram.common.clips.model.ClipSegment.VideoSegment) r2
            int r2 = r2.A08
        L_0x02f5:
            float r4 = (float) r2
            if (r3 == 0) goto L_0x0305
            r2 = r0
            com.instagram.common.clips.model.ClipSegment$VideoSegment r2 = (com.instagram.common.clips.model.ClipSegment.VideoSegment) r2
            int r2 = r2.A03
        L_0x02fd:
            float r2 = (float) r2
            float r4 = r4 / r2
            android.graphics.RectF r10 = X.C393909xE.A00(r4, r7)
            goto L_0x00f3
        L_0x0305:
            r2 = r0
            com.instagram.common.clips.model.ClipSegment$PhotoSegment r2 = (com.instagram.common.clips.model.ClipSegment.PhotoSegment) r2
            int r2 = r2.A01
            goto L_0x02fd
        L_0x030b:
            r2 = r0
            com.instagram.common.clips.model.ClipSegment$PhotoSegment r2 = (com.instagram.common.clips.model.ClipSegment.PhotoSegment) r2
            int r2 = r2.A03
            goto L_0x02f5
        L_0x0311:
            r4 = -1
            goto L_0x00b5
        L_0x0314:
            r1 = r0
            com.instagram.common.clips.model.ClipSegment$PhotoSegment r1 = (com.instagram.common.clips.model.ClipSegment.PhotoSegment) r1
            com.instagram.common.clips.model.LayoutTransform r6 = r1.A04
            goto L_0x00ad
        L_0x031b:
            r5 = r0
            com.instagram.common.clips.model.ClipSegment$VideoSegment r5 = (com.instagram.common.clips.model.ClipSegment.VideoSegment) r5
            r1 = r34
            java.util.Map r1 = r1.A01
            java.lang.Object r1 = r1.get(r5)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x034f
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r8 = r1.iterator()
        L_0x0332:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0351
            java.lang.Object r7 = r8.next()
            r4 = r7
            X.A9e r4 = (X.C39784A9e) r4
            int r2 = r4.A01
            int r1 = r5.A07
            if (r2 <= r1) goto L_0x0332
            int r2 = r4.A02
            int r1 = r5.A06
            if (r2 >= r1) goto L_0x0332
            r6.add(r7)
            goto L_0x0332
        L_0x034f:
            X.0sn r6 = X.0sn.A00
        L_0x0351:
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L_0x0382
            r6 = 0
            r7 = r56
            r8 = r57
            r9 = r12
            r10 = r26
            X.4aM r1 = A01(r5, r6, r7, r8, r9, r10)
            com.google.common.collect.ImmutableList r4 = com.google.common.collect.ImmutableList.of(r1)
            X.0qQ.A0A(r4)
        L_0x036a:
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x0370:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x00a6
            java.lang.Object r2 = r4.next()
            X.4aM r2 = (X.C266794aM) r2
            r1 = r25
            r1.A04(r2)
            goto L_0x0370
        L_0x0382:
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            r14 = 0
            r7 = 0
            java.lang.Object r1 = r6.get(r7)
            X.A9e r1 = (X.C39784A9e) r1
            int r8 = r1.A02
            java.lang.String r1 = r5.A0E
            r69 = r1
            int r1 = r5.A08
            r45 = r1
            int r1 = r5.A03
            r46 = r1
            int r1 = r5.A05
            r47 = r1
            com.instagram.common.clips.model.LayoutTransform r1 = r5.A0B
            r68 = r1
            com.google.common.collect.ImmutableList r1 = r5.A0A
            r67 = r1
            long r1 = r5.A09
            r65 = r1
            int r1 = r5.A04
            r48 = r1
            int r1 = r5.A07
            r24 = r1
            float r1 = r5.A00
            r43 = r1
            float r1 = r5.A01
            r44 = r1
            boolean r1 = r5.A0H
            r64 = r1
            java.lang.String r1 = r5.A0F
            r63 = r1
            java.lang.String r1 = r5.A0G
            r42 = r1
            java.lang.Integer r1 = r5.A0C
            r62 = r1
            java.lang.Integer r1 = r5.A0D
            r61 = r1
            boolean r1 = r5.A0I
            r60 = r1
            int r1 = r5.A02
            r51 = r1
            r2 = r69
            X.0qQ.A0B(r2, r7)
            r2 = 5
            r1 = r67
            X.0qQ.A0B(r1, r2)
            com.instagram.common.clips.model.ClipSegment$VideoSegment r9 = new com.instagram.common.clips.model.ClipSegment$VideoSegment
            r35 = r9
            r36 = r1
            r37 = r68
            r38 = r62
            r39 = r61
            r40 = r69
            r41 = r63
            r49 = r24
            r50 = r8
            r52 = r65
            r54 = r64
            r55 = r60
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r54, r55)
            int r2 = r9.A06
            int r1 = r9.A07
            int r2 = r2 - r1
            if (r2 <= 0) goto L_0x0417
            r13 = r9
            r15 = r56
            r16 = r57
            r17 = r12
            r18 = r26
            X.4aM r1 = A01(r13, r14, r15, r16, r17, r18)
            r4.add(r1)
        L_0x0417:
            java.util.Iterator r23 = r6.iterator()
        L_0x041b:
            boolean r1 = r23.hasNext()
            if (r1 == 0) goto L_0x036a
            java.lang.Object r9 = r23.next()
            int r22 = r7 + 1
            if (r7 < 0) goto L_0x0608
            X.A9e r9 = (X.C39784A9e) r9
            r1 = r34
            java.lang.String r1 = r1.A00
            r41 = r1
            r21 = 1000(0x3e8, float:1.401E-42)
            int r59 = r26 - r24
            int r1 = r9.A02
            int r20 = r59 + r1
            java.util.ArrayList r19 = X.AnonymousClass7TE.A1C()
            int r8 = r9.A00
            r2 = 0
        L_0x0440:
            if (r8 <= 0) goto L_0x04be
            r1 = r21
            int r18 = java.lang.Math.min(r8, r1)
            r37 = 0
            r1 = r18
            long r10 = (long) r1
            X.4aF r15 = new X.4aF
            r35 = r15
            r36 = r33
            r39 = r10
            r35.<init>(r36, r37, r39)
            X.4aE r17 = X.C266714aE.AUDIO
            java.lang.StringBuilder r10 = X.AnonymousClass7TE.A1A()
            java.lang.String r1 = "bleep_audio_"
            r10.append(r1)
            r10.append(r12)
            r1 = 95
            r10.append(r1)
            r10.append(r7)
            r10.append(r1)
            r10.append(r2)
            java.lang.String r16 = r10.toString()
            int r1 = r2 * r21
            int r1 = r20 + r1
            long r10 = (long) r1
            r1 = r33
            long r13 = r1.toMicros(r10)
            X.4aJ r10 = new X.4aJ
            r11 = r17
            r1 = r16
            r10.<init>(r11, r1, r13)
            java.io.File r11 = X.AnonymousClass7TE.A0t(r41)
            X.4aH r1 = new X.4aH
            r1.<init>(r11)
            r1.A03 = r15
            X.4aI r1 = r1.A00()
            r10.A02(r1)
            X.Srf r11 = new X.Srf
            r11.<init>()
            r1 = r57
            r11.A00 = r1
            X.SIO r1 = new X.SIO
            r1.<init>(r15, r11)
            r10.A03(r1)
            X.4aM r1 = new X.4aM
            r1.<init>(r10)
            r10 = r19
            r10.add(r1)
            int r8 = r8 - r18
            int r2 = r2 + 1
            goto L_0x0440
        L_0x04be:
            r1 = r19
            r4.addAll(r1)
            int r2 = r9.A01
            int r8 = r5.A06
            if (r2 >= r8) goto L_0x0512
            int r1 = r6.size()
            int r1 = r1 + -2
            if (r7 > r1) goto L_0x04df
            r1 = r22
            java.lang.Object r1 = r6.get(r1)
            X.A9e r1 = (X.C39784A9e) r1
            int r1 = r1.A02
            int r8 = java.lang.Math.min(r1, r8)
        L_0x04df:
            com.instagram.common.clips.model.ClipSegment$VideoSegment r9 = new com.instagram.common.clips.model.ClipSegment$VideoSegment
            r35 = r9
            r36 = r67
            r37 = r68
            r38 = r62
            r39 = r61
            r40 = r69
            r41 = r63
            r49 = r2
            r50 = r8
            r54 = r64
            r55 = r60
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r54, r55)
            int r8 = r9.A06
            int r1 = r9.A07
            int r8 = r8 - r1
            if (r8 <= 0) goto L_0x0512
            int r59 = r59 + r2
            java.lang.Integer r55 = java.lang.Integer.valueOf(r7)
            r54 = r9
            r58 = r12
            X.4aM r1 = A01(r54, r55, r56, r57, r58, r59)
            r4.add(r1)
        L_0x0512:
            r7 = r22
            goto L_0x041b
        L_0x0516:
            java.util.LinkedHashMap r14 = X.AnonymousClass7TE.A1H()
            if (r77 == 0) goto L_0x052a
            java.util.Iterator r1 = r77.iterator()
        L_0x0520:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x052a
            r1.next()
            goto L_0x0520
        L_0x052a:
            java.util.Iterator r19 = r72.iterator()
            r3 = 0
        L_0x052f:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x0610
            java.lang.Object r1 = r19.next()
            int r18 = r3 + 1
            if (r3 < 0) goto L_0x0608
            X.A9u r1 = (X.C39799A9u) r1
            int r0 = r1.A02
            r13 = -1
            if (r0 != r13) goto L_0x0548
            int r0 = r1.A04
            int r0 = r26 - r0
        L_0x0548:
            r12 = -1
            if (r0 <= 0) goto L_0x054c
            r12 = r0
        L_0x054c:
            java.lang.String r0 = r1.A07
            r20 = r0
            int r11 = r1.A03
            float r10 = r1.A01
            int r0 = r1.A04
            java.lang.String r2 = r1.A08
            com.facebook.videolite.transcoder.base.composition.MediaEffect r9 = r1.A05
            float r8 = r1.A00
            java.lang.Float r7 = r1.A06
            java.lang.Object r17 = r14.get(r2)
            int r4 = r0 + r12
            if (r12 != r13) goto L_0x0567
            r4 = -1
        L_0x0567:
            long r0 = (long) r0
            long r15 = (long) r4
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            X.4aF r5 = new X.4aF
            r27 = r5
            r28 = r6
            r29 = r0
            r31 = r15
            r27.<init>(r28, r29, r31)
            X.4aE r4 = X.C266714aE.AUDIO
            java.lang.String r15 = "audio_overlay_"
            java.lang.StringBuilder r15 = X.AnonymousClass7TF.A0n(r15)
            if (r2 != 0) goto L_0x05fb
            r15.append(r3)
        L_0x0585:
            java.lang.String r3 = r15.toString()
            long r0 = r6.toMicros(r0)
            X.4aJ r2 = new X.4aJ
            r2.<init>(r4, r3, r0)
            java.io.File r0 = X.AnonymousClass7TE.A0t(r20)
            X.4aH r15 = new X.4aH
            r15.<init>(r0)
            long r3 = (long) r11
            if (r12 != r13) goto L_0x05f5
            r0 = -1
        L_0x05a0:
            X.4aF r11 = new X.4aF
            r27 = r11
            r29 = r3
            r31 = r0
            r27.<init>(r28, r29, r31)
            r15.A03 = r11
            X.4aI r0 = r15.A00()
            r2.A02(r0)
            r2.A00(r8)
            if (r9 == 0) goto L_0x05c1
            X.SIO r0 = new X.SIO
            r0.<init>(r5, r9)
            r2.A03(r0)
        L_0x05c1:
            if (r7 == 0) goto L_0x05d6
            float r0 = r7.floatValue()
            X.Sre r1 = new X.Sre
            r1.<init>()
            r1.A00 = r0
            X.SIO r0 = new X.SIO
            r0.<init>(r5, r1)
            r2.A03(r0)
        L_0x05d6:
            if (r17 != 0) goto L_0x05e7
            X.Srf r1 = new X.Srf
            r1.<init>()
            r1.A00 = r10
            X.SIO r0 = new X.SIO
            r0.<init>(r5, r1)
            r2.A03(r0)
        L_0x05e7:
            X.4aM r1 = new X.4aM
            r1.<init>(r2)
            r0 = r25
            r0.A04(r1)
            r3 = r18
            goto L_0x052f
        L_0x05f5:
            float r1 = (float) r11
            float r0 = (float) r12
            float r0 = r0 * r8
            float r1 = r1 + r0
            long r0 = (long) r1
            goto L_0x05a0
        L_0x05fb:
            r15.append(r3)
            r3 = 95
            r15.append(r3)
            r15.append(r2)
            goto L_0x0585
        L_0x0608:
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0610:
            java.util.Iterator r5 = r74.iterator()
        L_0x0614:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0633
            java.lang.Object r0 = r5.next()
            X.A9f r0 = (X.C39785A9f) r0
            X.4aE r4 = X.C266714aE.VIDEO
            X.4aF r3 = r0.A02
            X.7sL r2 = r0.A01
            X.9sO r0 = X.C391129sO.TRANSITION
            X.AVf r1 = new X.AVf
            r1.<init>(r0, r2)
            r0 = r25
            r0.A01(r3, r4, r1)
            goto L_0x0614
        L_0x0633:
            return r25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AHK.A00(X.8o1, X.8pA, com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableList, X.8Yw, java.util.List, java.util.List, X.0sP, float, float, int, boolean, boolean):X.4aP");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [com.facebook.videolite.transcoder.base.composition.MediaEffect, java.lang.Object, X.Srf] */
    public static final C266794aM A01(ClipSegment.VideoSegment videoSegment, Integer num, List list, float f, int i, int i2) {
        String str;
        C266714aE r4 = C266714aE.AUDIO;
        String A00 = Pxd.A00(106);
        if (num != null) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append('_');
            str = AnonymousClass7TF.A0i(num, A1A);
        } else {
            str = "";
        }
        String A0c = 002.A0c(A00, str, i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j = (long) i2;
        C266764aJ r2 = new C266764aJ(r4, A0c, timeUnit.toMicros(j));
        r2.A02(A02(videoSegment, 0));
        r2.A00(Math.abs(videoSegment.A00));
        C266724aF r42 = new C266724aF(timeUnit, (long) videoSegment.A07, (long) videoSegment.A06);
        C266724aF r8 = new C266724aF(timeUnit, j, (r42.A02(timeUnit) - r42.A03(timeUnit)) + j);
        ? obj = new Object();
        obj.A00 = videoSegment.A01 * f;
        r2.A03(new SIO(r8, obj));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r2.A03(new SIO(new C266724aF(timeUnit, 0, -1), (MediaEffect) it.next()));
        }
        return new C266794aM(r2);
    }

    public static final C266754aI A02(ClipSegment clipSegment, int i) {
        C266744aH r3;
        if (clipSegment instanceof ClipSegment.VideoSegment) {
            ClipSegment.VideoSegment videoSegment = (ClipSegment.VideoSegment) clipSegment;
            r3 = new C266744aH(AnonymousClass7TE.A0t(videoSegment.A0E));
            float f = (float) videoSegment.A07;
            float abs = Math.abs(videoSegment.A00);
            r3.A03 = new C266724aF(TimeUnit.MILLISECONDS, (long) Math.max(f * abs, 0.0f), (long) Math.min(((float) videoSegment.A06) * abs, (float) videoSegment.A04));
        } else if (clipSegment instanceof ClipSegment.PhotoSegment) {
            ClipSegment.PhotoSegment photoSegment = (ClipSegment.PhotoSegment) clipSegment;
            r3 = new C266744aH(AnonymousClass7TE.A0t(photoSegment.A05));
            r3.A02 = TimeUnit.MILLISECONDS.toMicros((long) photoSegment.A00);
            if (i > 0) {
                r3.A00 = i;
            }
        } else {
            throw AnonymousClass7TE.A1K();
        }
        C266754aI A00 = r3.A00();
        0qQ.A0A(A00);
        return A00;
    }
}
