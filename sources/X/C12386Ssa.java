package X;

/* renamed from: X.Ssa  reason: case insensitive filesystem */
public final class C12386Ssa implements C13728Tfy {
    public final /* synthetic */ STN A00;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v37, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r17v4, types: [X.SsT] */
    /* JADX WARNING: type inference failed for: r17v5, types: [X.SsU] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D56(java.util.List r43) {
        /*
            r42 = this;
            r8 = 0
            r0 = r42
            X.STN r7 = r0.A00
            monitor-enter(r7)
            r41 = r43
            java.util.List r9 = X.0u4.A01(r41)     // Catch:{ all -> 0x01b1 }
            r15 = 1
            if (r9 == 0) goto L_0x0015
            boolean r0 = r9.isEmpty()     // Catch:{ all -> 0x01b1 }
            if (r0 == 0) goto L_0x0034
        L_0x0015:
            X.RzP r3 = r7.A0H     // Catch:{ all -> 0x01b1 }
            X.Rzi r0 = r3.A01     // Catch:{ all -> 0x01b1 }
            boolean r0 = r0 instanceof X.C7969QeH     // Catch:{ all -> 0x01b1 }
            if (r0 == 0) goto L_0x0020
            if (r9 != 0) goto L_0x0027
            goto L_0x0023
        L_0x0020:
            if (r9 == 0) goto L_0x019e
            goto L_0x0034
        L_0x0023:
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x01b1 }
        L_0x0027:
            X.TdR r2 = r3.A00     // Catch:{ all -> 0x01b1 }
            X.Q0d r1 = r7.A02     // Catch:{ all -> 0x01b1 }
            com.facebook.videolite.transcoder.base.composition.MediaComposition r0 = r7.A03     // Catch:{ all -> 0x01b1 }
            java.util.List r0 = r2.Avn(r1, r0, r3)     // Catch:{ all -> 0x01b1 }
            r9.addAll(r0)     // Catch:{ all -> 0x01b1 }
        L_0x0034:
            boolean r0 = r9.isEmpty()     // Catch:{ all -> 0x01b1 }
            if (r0 != 0) goto L_0x019e
            X.RzP r6 = r7.A0H     // Catch:{ all -> 0x01b1 }
            java.util.List r5 = r7.A0O     // Catch:{ all -> 0x01b1 }
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x01b1 }
            java.util.Iterator r16 = r9.iterator()     // Catch:{ all -> 0x01b1 }
        L_0x0046:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x01b1 }
            if (r0 == 0) goto L_0x0173
            java.lang.Object r10 = r16.next()     // Catch:{ all -> 0x01b1 }
            X.SJC r10 = (X.SJC) r10     // Catch:{ all -> 0x01b1 }
            X.REA r9 = r10.A03     // Catch:{ all -> 0x01b1 }
            X.S31 r0 = r7.A0G     // Catch:{ all -> 0x01b1 }
            r17 = r0
            java.util.HashMap r2 = r17.A00()     // Catch:{ all -> 0x01b1 }
            X.Q0d r1 = r7.A02     // Catch:{ all -> 0x01b1 }
            X.SOn r14 = r10.A02     // Catch:{ all -> 0x01b1 }
            boolean r0 = r10.A05     // Catch:{ all -> 0x01b1 }
            r40 = r0
            X.0qQ.A0B(r9, r8)     // Catch:{ all -> 0x01b1 }
            java.util.HashMap r12 = X.Pxe.A19(r2)     // Catch:{ all -> 0x01b1 }
            X.REA r0 = X.REA.RAW     // Catch:{ all -> 0x01b1 }
            java.lang.String r13 = "target_upload_settings_mode"
            if (r9 != r0) goto L_0x011f
            java.lang.String r0 = "raw"
            r12.put(r13, r0)     // Catch:{ all -> 0x01b1 }
        L_0x0078:
            X.Tj9 r11 = r7.A0D     // Catch:{ all -> 0x01b1 }
            X.Rs1 r1 = r7.A0E     // Catch:{ all -> 0x01b1 }
            X.SIY r0 = new X.SIY     // Catch:{ all -> 0x01b1 }
            r0.<init>(r11, r1, r12)     // Catch:{ all -> 0x01b1 }
            X.Q4o r3 = new X.Q4o     // Catch:{ all -> 0x01b1 }
            r3.<init>(r0, r7)     // Catch:{ all -> 0x01b1 }
            com.facebook.videolite.transcoder.base.composition.MediaComposition r0 = r7.A04     // Catch:{ all -> 0x01b1 }
            r22 = r0
            X.Rp9 r0 = r6.A0J     // Catch:{ all -> 0x01b1 }
            if (r0 == 0) goto L_0x009b
            com.facebook.videolite.transcoder.base.composition.MediaComposition r1 = r0.A00     // Catch:{ all -> 0x01b1 }
            X.4aE r0 = X.C266714aE.VIDEO     // Catch:{ all -> 0x01b1 }
            X.4aI r0 = X.STq.A00(r0, r1)     // Catch:{ all -> 0x01b1 }
            if (r0 == 0) goto L_0x009b
            r0.A01(r8)     // Catch:{ all -> 0x01b1 }
        L_0x009b:
            X.RR8 r2 = r7.A07     // Catch:{ all -> 0x01b1 }
            java.lang.String r13 = "Required value was null."
            if (r2 == 0) goto L_0x0169
            int r0 = r9.ordinal()     // Catch:{ all -> 0x01b1 }
            if (r0 == r8) goto L_0x00fc
            boolean r0 = r10.A04     // Catch:{ all -> 0x01b1 }
            r39 = r0
            long r0 = r10.A01     // Catch:{ all -> 0x01b1 }
            r35 = r0
            long r0 = r10.A00     // Catch:{ all -> 0x01b1 }
            r37 = r0
            java.util.concurrent.ExecutorService r12 = r7.A0P     // Catch:{ all -> 0x01b1 }
            if (r12 == 0) goto L_0x015f
            java.io.File r0 = r7.A08     // Catch:{ all -> 0x01b1 }
            if (r0 == 0) goto L_0x0199
            java.lang.String r29 = X.JTP.A0t(r0)     // Catch:{ all -> 0x01b1 }
            X.Q0d r0 = r7.A02     // Catch:{ all -> 0x01b1 }
            r19 = r0
            java.util.HashMap r30 = r17.A00()     // Catch:{ all -> 0x01b1 }
            X.Rs3 r0 = r7.A0F     // Catch:{ all -> 0x01b1 }
            r17 = r0
            X.SNK r0 = r7.A06     // Catch:{ all -> 0x01b1 }
            r13 = r0
            int r10 = r7.A00     // Catch:{ all -> 0x01b1 }
            java.lang.Integer r1 = r6.A0O     // Catch:{ all -> 0x01b1 }
            X.SsU r0 = new X.SsU     // Catch:{ all -> 0x01b1 }
            r18 = r11
            r20 = r14
            r21 = r17
            r23 = r6
            r24 = r13
            r25 = r9
            r26 = r2
            r27 = r3
            r28 = r1
            r31 = r12
            r32 = r10
            r33 = r35
            r35 = r37
            r37 = r40
            r38 = r39
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r35, r37, r38)     // Catch:{ all -> 0x01b1 }
        L_0x00f7:
            r4.add(r0)     // Catch:{ all -> 0x01b1 }
            goto L_0x0046
        L_0x00fc:
            java.io.File r0 = r7.A08     // Catch:{ all -> 0x01b1 }
            if (r0 == 0) goto L_0x0164
            java.lang.String r23 = r0.getPath()     // Catch:{ all -> 0x01b1 }
            X.0qQ.A0A(r23)     // Catch:{ all -> 0x01b1 }
            java.util.HashMap r24 = r17.A00()     // Catch:{ all -> 0x01b1 }
            X.Q0d r1 = r7.A02     // Catch:{ all -> 0x01b1 }
            X.SsT r0 = new X.SsT     // Catch:{ all -> 0x01b1 }
            r18 = r11
            r19 = r1
            r20 = r6
            r21 = r2
            r22 = r3
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x01b1 }
            goto L_0x00f7
        L_0x011f:
            java.lang.String r11 = "estimated_resized_file_size"
            if (r1 == 0) goto L_0x016e
            if (r14 == 0) goto L_0x0135
            int r0 = r14.A01()     // Catch:{ all -> 0x01b1 }
            long r2 = (long) r0     // Catch:{ all -> 0x01b1 }
            long r0 = r1.A07     // Catch:{ all -> 0x01b1 }
            long r0 = X.AnonymousClass7TE.A0P(r0)     // Catch:{ all -> 0x01b1 }
            long r0 = r0 * r2
            r2 = 8
            long r0 = r0 / r2
            goto L_0x0137
        L_0x0135:
            long r0 = r1.A08     // Catch:{ all -> 0x01b1 }
        L_0x0137:
            java.lang.String r2 = "transcode"
            r12.put(r13, r2)     // Catch:{ all -> 0x01b1 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x01b1 }
            r12.put(r11, r0)     // Catch:{ all -> 0x01b1 }
            java.lang.String r1 = java.lang.String.valueOf(r40)     // Catch:{ all -> 0x01b1 }
            java.lang.String r0 = "is_streaming_transcode"
            r12.put(r0, r1)     // Catch:{ all -> 0x01b1 }
            X.REA r0 = X.REA.SEGMENTED_TRANSCODE     // Catch:{ all -> 0x01b1 }
            boolean r0 = X.AnonymousClass7TF.A1W(r9, r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x01b1 }
            java.lang.String r0 = "video_transcode_is_segmented"
            r12.put(r0, r1)     // Catch:{ all -> 0x01b1 }
            goto L_0x0078
        L_0x015f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r13)     // Catch:{ all -> 0x01b1 }
            goto L_0x019d
        L_0x0164:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r13)     // Catch:{ all -> 0x01b1 }
            goto L_0x019d
        L_0x0169:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r13)     // Catch:{ all -> 0x01b1 }
            goto L_0x019d
        L_0x016e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ all -> 0x01b1 }
            goto L_0x019d
        L_0x0173:
            r5.addAll(r4)     // Catch:{ all -> 0x01b1 }
            X.Rzi r0 = r7.A0K     // Catch:{ all -> 0x01b1 }
            boolean r0 = r0 instanceof X.C7969QeH     // Catch:{ all -> 0x01b1 }
            if (r0 == 0) goto L_0x0182
            X.STN.A02(r7)     // Catch:{ all -> 0x01b1 }
            X.STN.A03(r7)     // Catch:{ all -> 0x01b1 }
        L_0x0182:
            int r0 = r7.A00     // Catch:{ all -> 0x01b1 }
            java.lang.Object r0 = r5.get(r0)     // Catch:{ all -> 0x01b1 }
            X.Thz r0 = (X.C13828Thz) r0     // Catch:{ all -> 0x01b1 }
            r7.A05 = r0     // Catch:{ all -> 0x01b1 }
            r7.A0A = r15     // Catch:{ all -> 0x01b1 }
            if (r0 == 0) goto L_0x0194
            r0.FMV()     // Catch:{ all -> 0x01b1 }
            goto L_0x01a8
        L_0x0194:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ all -> 0x01b1 }
            goto L_0x019d
        L_0x0199:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r13)     // Catch:{ all -> 0x01b1 }
        L_0x019d:
            throw r0     // Catch:{ all -> 0x01b1 }
        L_0x019e:
            java.lang.String r1 = "Strategy config list is empty"
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ all -> 0x01b1 }
            r0.<init>(r1)     // Catch:{ all -> 0x01b1 }
            X.STN.A05(r7, r0)     // Catch:{ all -> 0x01b1 }
        L_0x01a8:
            monitor-exit(r7)
            X.Tij r1 = r7.A0L
            r0 = r41
            r1.Dvk(r0)
            return
        L_0x01b1:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12386Ssa.D56(java.util.List):void");
    }

    public C12386Ssa(STN stn) {
        this.A00 = stn;
    }

    public final void onFailure(Exception exc) {
        STN.A05(this.A00, exc);
    }
}
