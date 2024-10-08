package X;

/* renamed from: X.4OO  reason: invalid class name */
public final class AnonymousClass4OO implements AnonymousClass4OP {
    public long A00;
    public long A01;
    public boolean A02;

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00be A[LOOP:2: B:34:0x00b8->B:36:0x00be, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E6s(X.AnonymousClass4OR r19, java.util.List r20) {
        /*
            r18 = this;
            X.0xi r0 = X.0tS.A4E
            X.0tS r3 = r0.A00()
            X.0s0 r2 = r3.A18
            X.0YZ[] r1 = X.0tS.A4G
            r0 = 4
            r0 = r1[r0]
            java.lang.Object r0 = r2.CDM(r3, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0159
            r10 = r20
            int r0 = r10.size()
            r9 = 2
            r6 = r18
            if (r0 < r9) goto L_0x0155
            java.util.Iterator r11 = r10.iterator()
            r4 = 0
            r2 = 0
        L_0x002c:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0155
            java.lang.Object r1 = r11.next()
            X.4Os r1 = (X.C264134Os) r1
            java.lang.String r8 = r1.A0A
            int r7 = r8.hashCode()
            r0 = -1402931637(0xffffffffac60f64b, float:-3.1969035E-12)
            if (r7 == r0) goto L_0x0143
            r0 = -1253333392(0xffffffffb54ba670, float:-7.586559E-7)
            if (r7 == r0) goto L_0x0137
            r0 = -995321554(0xffffffffc4ac992e, float:-1380.7869)
            if (r7 != r0) goto L_0x002c
            java.lang.String r0 = "paused"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x002c
            long r12 = r6.A00
            long r0 = r1.A02
            long r0 = r0 - r2
            long r12 = r12 + r0
            r6.A00 = r4
        L_0x005d:
            int r0 = r10.size()
            int r0 = r0 + -1
            java.lang.Object r0 = r10.get(r0)
            X.4Os r0 = (X.C264134Os) r0
            long r14 = r0.A02
            int r0 = r10.size()
            if (r0 < r9) goto L_0x0133
            java.util.Iterator r11 = r10.iterator()
            r7 = 0
            r4 = 0
        L_0x0079:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0133
            java.lang.Object r0 = r11.next()
            X.4Os r0 = (X.C264134Os) r0
            java.lang.String r2 = r0.A0A
            int r3 = r2.hashCode()
            r1 = -2079583090(0xffffffff840c148e, float:-1.646636E-36)
            if (r3 == r1) goto L_0x00df
            r1 = -1402931637(0xffffffffac60f64b, float:-3.1969035E-12)
            if (r3 == r1) goto L_0x00ca
            r1 = -995321554(0xffffffffc4ac992e, float:-1380.7869)
            if (r3 != r1) goto L_0x0079
            java.lang.String r1 = "paused"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0079
            boolean r1 = r6.A02
            if (r1 == 0) goto L_0x00ae
            long r2 = r6.A01
            long r0 = r0.A02
            long r0 = r0 - r4
            long r2 = r2 + r0
            r6.A01 = r2
        L_0x00ae:
            long r0 = r6.A01
            r6.A01 = r7
        L_0x00b2:
            java.util.Set r2 = X.C17130VJf.A00
            java.util.Iterator r3 = r2.iterator()
        L_0x00b8:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x0159
            java.lang.Object r11 = r3.next()
            com.instagram.debug.devoptions.section.videodebug.VideoUtilityFragment r11 = (com.instagram.debug.devoptions.section.videodebug.VideoUtilityFragment) r11
            r16 = r0
            r11.onSnaplTimeChanged(r12, r14, r16)
            goto L_0x00b8
        L_0x00ca:
            java.lang.String r1 = "completed"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0079
            boolean r1 = r6.A02
            if (r1 == 0) goto L_0x0079
            long r2 = r6.A01
            long r0 = r0.A02
            long r0 = r0 - r4
            long r2 = r2 + r0
            r6.A01 = r2
            goto L_0x0079
        L_0x00df:
            java.lang.String r1 = "tags_changed"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0079
            X.4Ob r1 = r0.A04
            if (r1 == 0) goto L_0x0079
            java.util.Map r10 = r1.A00
            X.0qQ.A07(r10)
            java.lang.String r3 = "player_sound_on"
            java.lang.Object r2 = r10.get(r3)
            r9 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x0114
            boolean r1 = r6.A02
            if (r1 == 0) goto L_0x0111
            long r2 = r6.A01
            long r0 = r0.A02
            long r9 = r0 - r4
            long r2 = r2 + r9
            r6.A01 = r2
            r4 = r0
            goto L_0x0079
        L_0x0111:
            long r4 = r0.A02
            goto L_0x012f
        L_0x0114:
            java.lang.Object r2 = r10.get(r3)
            r9 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x0079
            boolean r1 = r6.A02
            if (r1 == 0) goto L_0x0079
            long r2 = r6.A01
            long r0 = r0.A02
            long r0 = r0 - r4
            long r2 = r2 + r0
            r6.A01 = r2
        L_0x012f:
            r6.A02 = r9
            goto L_0x0079
        L_0x0133:
            long r0 = r6.A01
            goto L_0x00b2
        L_0x0137:
            java.lang.String r0 = "started_playing"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x002c
            long r2 = r1.A02
            goto L_0x002c
        L_0x0143:
            java.lang.String r0 = "completed"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x002c
            long r7 = r6.A00
            long r0 = r1.A02
            long r0 = r0 - r2
            long r7 = r7 + r0
            r6.A00 = r7
            goto L_0x002c
        L_0x0155:
            long r12 = r6.A00
            goto L_0x005d
        L_0x0159:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4OO.E6s(X.4OR, java.util.List):void");
    }
}
