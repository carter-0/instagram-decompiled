package X;

import java.util.Map;

/* renamed from: X.Aoh  reason: case insensitive filesystem */
public final class C41121Aoh implements Runnable {
    public final /* synthetic */ AnonymousClass9Tu A00;
    public final /* synthetic */ Map A01;
    public final /* synthetic */ Map A02;

    public C41121Aoh(AnonymousClass9Tu r1, Map map, Map map2) {
        this.A00 = r1;
        this.A02 = map;
        this.A01 = map2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: X.7sL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: X.7sL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: X.7sL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: X.ATg} */
    /* JADX WARNING: type inference failed for: r2v8, types: [X.7sw] */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01c4  */
    public final void run() {
        /*
            r25 = this;
            r6 = r25
            java.util.Map r1 = r6.A02
            java.util.Iterator r7 = X.AnonymousClass7TF.A0u(r1)
        L_0x0008:
            boolean r0 = r7.hasNext()
            r5 = 1
            r3 = 0
            if (r0 == 0) goto L_0x00a0
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r7)
            java.lang.Object r2 = r0.getKey()
            java.lang.Number r2 = (java.lang.Number) r2
            int r4 = r2.intValue()
            java.lang.Object r11 = r1.get(r2)
            r11.getClass()
            X.8n5 r11 = (X.C365418n5) r11
            X.8n3 r0 = r11.A09
            X.8n2 r0 = (X.C365398n2) r0
            X.8mz r0 = r0.A01
            int r0 = r0.A05
            int r0 = -r0
            r11.A02 = r0
            r11.A06 = r3
            r11.A07 = r5
            r10 = 0
            r11.A05 = r10
            java.util.Map r0 = r6.A01
            if (r0 == 0) goto L_0x0051
            java.lang.Object r2 = r0.get(r2)
            r2.getClass()
            X.7sw r2 = (X.C345107sw) r2
            X.9Tu r0 = r6.A00
            X.7uG r0 = r0.A03
            r0.getClass()
            r11.ACn(r0)
            r11 = r2
        L_0x0051:
            X.9Tu r3 = r6.A00
            X.7ro r9 = r3.A0H
            boolean r0 = r3.A09
            X.7uu r8 = new X.7uu
            r12 = r5
            r13 = r0
            r8.<init>(r9, r10, r11, r12, r13)
            X.SOn r2 = r3.A0I
            int r0 = r2.A09
            r5 = 7
            if (r0 == r5) goto L_0x0096
            X.SJA r0 = r2.A0G
            if (r0 == 0) goto L_0x006d
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x0096
        L_0x006d:
            int r2 = r11.BHN()
            r0 = 6
            if (r2 != r0) goto L_0x0089
            X.Q4k r0 = r3.A0L
            boolean r0 = r0.A0B()
        L_0x007a:
            if (r0 == 0) goto L_0x007f
            r0 = 3
        L_0x007d:
            r8.A00 = r0
        L_0x007f:
            X.7rv r0 = r3.A0G
            X.7sH r0 = r0.BQ8()
            r0.EZt(r8, r4)
            goto L_0x0008
        L_0x0089:
            int r0 = r11.BHN()
            if (r0 != r5) goto L_0x007f
            X.Q4k r0 = r3.A0L
            boolean r0 = r0.A07()
            goto L_0x007a
        L_0x0096:
            X.Q4k r0 = r3.A0L
            boolean r0 = r0.A08()
            if (r0 == 0) goto L_0x006d
            r0 = 7
            goto L_0x007d
        L_0x00a0:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r1.get(r0)
            r0.getClass()
            X.8n5 r0 = (X.C365418n5) r0
            X.8n3 r0 = r0.A09
            X.8n2 r0 = (X.C365398n2) r0
            X.8mz r0 = r0.A01
            int r7 = r0.A01
            int r4 = r0.A02
            int r0 = r0.A05
            int r0 = r0 % 180
            boolean r2 = X.AnonymousClass7TF.A1P(r0)
            X.9Tu r6 = r6.A00
            X.SOn r12 = r6.A0I
            int r0 = r12.A0B
            int r0 = r0 % 180
            if (r0 != 0) goto L_0x00ca
            r5 = 0
        L_0x00ca:
            r17 = r4
            if (r2 == 0) goto L_0x00d1
            r17 = r7
            r7 = r4
        L_0x00d1:
            if (r5 == 0) goto L_0x0102
            int r5 = r12.A0A
            int r4 = r12.A0C
        L_0x00d7:
            X.B2V r11 = r6.A0J
            X.B2j r14 = r6.A0K
            X.Q4k r15 = r6.A0L
            com.facebook.videolite.transcoder.base.composition.MediaComposition r13 = r6.A0X
            r19 = r5
            r20 = r4
            r18 = r7
            r16 = r1
            boolean r0 = r11.AJ5(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            if (r0 == 0) goto L_0x0107
            X.7rv r0 = r6.A0G
            X.7sL r1 = r0.BQ9()
            boolean r0 = r1 instanceof X.B3U
            if (r0 == 0) goto L_0x0101
            X.B3U r1 = (X.B3U) r1
            X.AVs r0 = new X.AVs
            r0.<init>(r6)
            r1.EeS(r0)
        L_0x0101:
            return
        L_0x0102:
            int r5 = r12.A0C
            int r4 = r12.A0A
            goto L_0x00d7
        L_0x0107:
            X.7ro r2 = r6.A0H
            android.content.Context r10 = r6.A0E
            com.facebook.videolite.transcoder.base.composition.MediaComposition r0 = r6.A0X
            X.7rv r8 = r6.A0G
            X.8tC r20 = new X.8tC
            r20.<init>()
            r24 = 1
            X.4aE r11 = X.C266714aE.VIDEO
            java.util.HashMap r9 = r0.A00
            java.lang.Object r0 = r9.get(r11)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x01ca
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x01ca
            X.ATg r1 = new X.ATg
            r1.<init>(r2)
            java.lang.Object r0 = r9.get(r11)
            if (r0 == 0) goto L_0x01ca
            java.lang.Object r0 = r9.get(r11)
            java.util.List r0 = (java.util.List) r0
            r18 = r10
            r19 = r8
            r21 = r1
            r22 = r15
            r23 = r0
            X.C393199w3.A00(r18, r19, r20, r21, r22, r23, r24)
        L_0x0146:
            r8.Ed1(r1)
            X.7sL r1 = r8.BQ9()
            boolean r0 = r1 instanceof X.B3U
            if (r0 == 0) goto L_0x015b
            X.B3U r1 = (X.B3U) r1
            X.AVs r0 = new X.AVs
            r0.<init>(r6)
            r1.EeS(r0)
        L_0x015b:
            r15 = r17
            r16 = r7
            r17 = r3
            r18 = r5
            r19 = r4
            r13 = r8
            r14 = r3
            r13.FLA(r14, r15, r16, r17, r18, r19)
            X.7sH r0 = r8.BQ8()
            android.graphics.RectF r4 = r12.A0E
            X.7sG r0 = (X.C344687sG) r0
            X.7sJ r1 = r0.A07
            X.7s4 r0 = r0.A05
            X.7sp r3 = X.C344717sJ.A00(r0, r1, r3)
            float r0 = r4.top
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01c4
            float r0 = r4.left
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01c4
            float r0 = r4.right
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01c4
            float r0 = r4.bottom
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01c4
            r0 = 0
        L_0x0196:
            r3.A00 = r0
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            int r0 = r12.A0C
            r1.append(r0)
            java.lang.String r0 = "x"
            r1.append(r0)
            int r0 = r12.A0A
            r1.append(r0)
            java.lang.String r0 = ","
            r1.append(r0)
            java.lang.String r0 = "rotation:"
            r1.append(r0)
            int r0 = r12.A0B
            r1.append(r0)
            X.7rp r3 = r2.A00
            java.lang.String r2 = r1.toString()
            java.lang.String r1 = "ARFrameLiteRenderer.outputMetadata"
            monitor-enter(r3)
            goto L_0x01d1
        L_0x01c4:
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r4)
            goto L_0x0196
        L_0x01ca:
            X.8oz r1 = new X.8oz
            r1.<init>(r2)
            goto L_0x0146
        L_0x01d1:
            java.util.Map r0 = r3.A00     // Catch:{ all -> 0x01d8 }
            r0.put(r1, r2)     // Catch:{ all -> 0x01d8 }
            monitor-exit(r3)
            return
        L_0x01d8:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41121Aoh.run():void");
    }
}
