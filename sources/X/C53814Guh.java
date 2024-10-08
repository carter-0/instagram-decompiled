package X;

import com.meta.foa.session.FoaUserSession;

/* renamed from: X.Guh  reason: case insensitive filesystem */
public final class C53814Guh extends C251343mx {
    public final FoaUserSession A00;
    public final 0sP A01;
    public final C262224Cq A02;
    public final 2WX A03;
    public final HMQ A04;
    public final C56124HtC A05;
    public final C62320sa A06;

    /* JADX WARNING: Removed duplicated region for block: B:14:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0176  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r24) {
        /*
            r23 = this;
            r12 = 0
            r7 = r24
            X.0qQ.A0B(r7, r12)
            X.Itv r0 = X.C58562Itv.A00
            X.2Wa r16 = X.C243643Zq.A00(r7, r0)
            r21 = 1
            r8 = r23
            com.meta.foa.session.FoaUserSession r2 = r8.A00
            java.lang.Object[] r1 = new java.lang.Object[]{r2}
            r0 = 18
            X.Ivx r0 = X.C58688Ivx.A00(r7, r8, r0)
            java.lang.Object r6 = X.AnonymousClass3Zw.A00(r7, r0, r1)
            X.0qQ.A07(r6)
            X.AUb r6 = (X.C40161AUb) r6
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r1 = 38
            r0 = r16
            X.Iw8 r0 = X.C58699Iw8.A00(r6, r7, r8, r0, r1)
            java.lang.Object r2 = X.AnonymousClass3Zw.A00(r7, r0, r2)
            java.lang.Object[] r1 = X.C51966G9m.A1b()
            r0 = 30
            X.IwN r0 = X.C58714IwN.A01(r8, r0)
            X.C243773a4.A00(r7, r0, r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r6}
            r0 = 24
            X.Iw6 r0 = X.C58697Iw6.A00(r6, r2, r7, r0)
            X.C243773a4.A00(r7, r0, r1)
            X.HtC r0 = r8.A05
            r22 = r0
            X.HMi r9 = r0.A02
            X.HMQ r5 = r8.A04
            X.HMQ r0 = X.HMQ.DETECTOR_READY
            if (r5 == r0) goto L_0x0063
            X.HMQ r0 = X.HMQ.POSE_FIND_FACE
            if (r5 == r0) goto L_0x0063
            X.HMQ r0 = X.HMQ.POSE_TOO_MANY_FACES
            if (r5 != r0) goto L_0x0086
        L_0x0063:
            if (r9 == 0) goto L_0x0086
            org.json.JSONObject r2 = X.DbS.A11()
            java.lang.String r1 = "type"
            java.lang.String r0 = "memu_stop_detector"
            r2.put(r1, r0)
            X.C250563lf.A0i(r2)
            org.json.JSONObject r2 = X.DbS.A11()
            java.lang.String r0 = "memu_start_detector"
            r2.put(r1, r0)
            java.lang.String r1 = r9.A00
            java.lang.String r0 = "data"
            r2.put(r0, r1)
            X.C250563lf.A0i(r2)
        L_0x0086:
            X.HMQ r4 = X.HMQ.POSE_DETECTED
            boolean r3 = X.AnonymousClass7TF.A1W(r5, r4)
            java.lang.Object[] r2 = X.C51968G9o.A1b(r3)
            r1 = 49
            X.GA1 r0 = new X.GA1
            r0.<init>(r1, r7, r3)
            X.C243773a4.A00(r7, r0, r2)
            boolean r0 = X.C55224HeF.A00(r5)
            if (r0 == 0) goto L_0x018a
            X.HMi r0 = X.C54651HMi.LEFT
            if (r9 != r0) goto L_0x017a
            X.HMK r20 = X.HMK.LEFT
        L_0x00a6:
            if (r5 != r4) goto L_0x0176
            X.HLP r19 = X.HLP.GRADIENT
        L_0x00aa:
            X.3XV r0 = X.2WX.A02
            r1 = 1065353216(0x3f800000, float:1.0)
            java.lang.Integer r11 = X.AnonymousClass05K.A01
            r0 = r21
            X.9JQ r0 = X.C51965G9l.A0b(r11, r1, r0)
            r10 = 0
            X.2WX r1 = X.C51965G9l.A0X(r10, r0)
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            r15 = 1120403456(0x42c80000, float:100.0)
            X.2WX r2 = X.C51971G9r.A0X(r1, r9, r15, r12)
            java.lang.Integer r1 = X.AnonymousClass05K.A0D
            java.lang.String r0 = "memu_camera_component"
            X.2WX r1 = X.G9t.A10(r2, r1, r0)
            X.2WX r0 = r8.A03
            X.2WX r18 = r1.A00(r0)
            X.2Wb r4 = X.C51972G9s.A0Q(r7)
            X.2WX r1 = X.C51974G9v.A0O(r10, r9, r11, r15, r12)
            X.3b9 r17 = X.C244413b9.ABSOLUTE
            java.lang.Integer r3 = X.AnonymousClass05K.A0Y
            r2 = 3
            r0 = r17
            X.2WX r13 = X.C51971G9r.A0Y(r1, r3, r0, r2)
            r1 = -1046478848(0xffffffffc1a00000, float:-20.0)
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            r14 = r13
            r13 = r1
            r1 = r0
            r0 = r21
            X.2WX r0 = X.C51971G9r.A0X(r14, r1, r13, r0)
            X.Gwg r1 = new X.Gwg
            r1.<init>(r6, r0)
            r4.A00(r1)
            X.2WX r1 = X.C51974G9v.A0O(r10, r9, r11, r15, r12)
            r0 = r17
            X.2WX r14 = X.C51971G9r.A0Y(r1, r3, r0, r2)
            r1 = 28
            r0 = r16
            X.J6n r13 = X.C59105J6n.A02(r0, r1)
            X.Gwp r1 = new X.Gwp
            r1.<init>(r14, r13)
            r4.A00(r1)
            r0 = 1120010240(0x42c20000, float:97.0)
            X.2WX r13 = X.C51971G9r.A0X(r10, r9, r0, r12)
            r0 = 1114636288(0x42700000, float:60.0)
            X.9JQ r1 = X.C51965G9l.A0b(r11, r0, r12)
            r0 = r17
            X.2WX r16 = X.C51973G9u.A0T(r13, r1, r3, r0, r2)
            long r14 = X.C51970G9q.A0E()
            java.lang.Integer r13 = X.AnonymousClass05K.A0N
            r0 = r14
            r15 = r16
            r14 = r21
            X.2WX r14 = X.AnonymousClass9JR.A00(r15, r13, r14, r0)
            X.GxH r13 = new X.GxH
            r1 = r19
            r0 = r20
            r13.<init>(r14, r1, r0)
            r4.A00(r13)
            X.2WX r9 = X.G9t.A0y(r10, r9, r12)
            r0 = 1108606976(0x42140000, float:37.0)
            X.9JQ r1 = X.C51965G9l.A0b(r11, r0, r12)
            r0 = r17
            X.2WX r9 = X.C51973G9u.A0T(r9, r1, r3, r0, r2)
            long r0 = X.C51969G9p.A0E()
            java.lang.Integer r3 = X.AnonymousClass05K.A0j
            r2 = r21
            X.2WX r10 = X.AnonymousClass9JR.A00(r9, r3, r2, r0)
            X.0sP r2 = r8.A01
            X.0sa r1 = r8.A06
            X.GuS r0 = new X.GuS
            r9 = r6
            r11 = r5
            r12 = r22
            r13 = r1
            r14 = r2
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r4.A00(r0)
            r0 = r18
            X.2Tl r0 = X.C243563Zg.A01(r4, r7, r0)
            return r0
        L_0x0176:
            X.HLP r19 = X.HLP.GRAY
            goto L_0x00aa
        L_0x017a:
            X.HMi r0 = X.C54651HMi.RIGHT
            if (r9 != r0) goto L_0x0182
            X.HMK r20 = X.HMK.RIGHT
            goto L_0x00a6
        L_0x0182:
            X.HMi r0 = X.C54651HMi.CENTER
            if (r9 != r0) goto L_0x018a
            X.HMK r20 = X.HMK.CENTER
            goto L_0x00a6
        L_0x018a:
            X.HMK r20 = X.HMK.A06
            goto L_0x00a6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53814Guh.A0X(X.3Y5):X.3mp");
    }

    public C53814Guh(2WX r1, FoaUserSession foaUserSession, HMQ hmq, C56124HtC htC, C62320sa r5, 0sP r6, C262224Cq r7) {
        AnonymousClass7TG.A1O(foaUserSession, hmq);
        this.A00 = foaUserSession;
        this.A04 = hmq;
        this.A05 = htC;
        this.A02 = r7;
        this.A01 = r6;
        this.A06 = r5;
        this.A03 = r1;
    }
}
