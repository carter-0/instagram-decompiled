package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeConstants;

public final class GWZ extends C324596za {
    public boolean A00;
    public final /* synthetic */ GT0 A01;
    public final /* synthetic */ C3723390k A02;
    public final /* synthetic */ AnonymousClass2mA A03;
    public final /* synthetic */ boolean A04;

    public GWZ(GT0 gt0, C3723390k r2, AnonymousClass2mA r3, boolean z) {
        this.A01 = gt0;
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = z;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x041e  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0442  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0453  */
    /* JADX WARNING: Removed duplicated region for block: B:450:0x095e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01d3  */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r46) {
        /*
            r45 = this;
            r8 = r46
            r0 = 696456634(0x298315ba, float:5.8213376E-14)
            int r16 = X.AnonymousClass0fD.A03(r0)
            X.90q r8 = (X.C3723890q) r8
            r0 = -745975237(0xffffffffd389523b, float:-1.17958024E12)
            int r17 = X.AnonymousClass0fD.A03(r0)
            r9 = 0
            X.0qQ.A0B(r8, r9)
            r44 = r45
            r0 = r44
            X.GT0 r7 = r0.A01
            com.instagram.common.session.UserSession r6 = r7.A0C
            X.0Tu r10 = X.0Tu.A05
            r0 = 36320111765757921(0x8108f300001fe1, double:3.032323157792045E-306)
            boolean r0 = X.182.A06(r10, r6, r0)
            if (r0 == 0) goto L_0x003c
            r0 = r44
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x003c
            X.GWv r0 = r7.A0E
            if (r0 == 0) goto L_0x003c
            X.2ur r0 = r0.A00
            if (r0 == 0) goto L_0x003c
            r0.Dpi()
        L_0x003c:
            r0 = r44
            X.90k r5 = r0.A02
            boolean r4 = r5.A0E
            if (r4 == 0) goto L_0x004a
            java.lang.Long r0 = X.C51968G9o.A0u()
            r7.A04 = r0
        L_0x004a:
            X.GWb r1 = X.C46550Dgs.A00(r6)
            r18 = 1
            r0 = r18
            r1.A02(r8, r5, r0)
            r0 = r44
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0a10
            r1 = r18
            r0 = r44
            r0.A00 = r1
            X.90i r0 = r5.A02
            boolean r0 = r0.A03
            r30 = r0
            boolean r0 = r5.A0F
            r22 = r0
            if (r0 == 0) goto L_0x007a
            boolean r0 = r8.CPt()
            if (r0 == 0) goto L_0x007a
            java.lang.String r1 = "ExploreDataStore"
            java.lang.String r0 = "DSA Non-profiled Grid is pulled from Explore Cache"
            X.0wb.A03(r1, r0)
        L_0x007a:
            if (r4 == 0) goto L_0x008e
            X.GWW r0 = r7.A0F
            r0.A05()
            X.GXR r0 = r7.A0B
            if (r0 == 0) goto L_0x0087
            r0.A00 = r9
        L_0x0087:
            X.GXc r0 = X.C52550GXb.A00(r6)
            r0.A00()
        L_0x008e:
            java.util.ArrayList r25 = X.AnonymousClass7TE.A1C()
            X.GWv r3 = r7.A0E
            if (r3 == 0) goto L_0x009c
            boolean r0 = r7.A0U
            r20 = 1
            if (r0 != 0) goto L_0x009e
        L_0x009c:
            r20 = 0
        L_0x009e:
            r19 = 0
            if (r20 == 0) goto L_0x0273
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            X.GWW r1 = r7.A0F
            if (r3 == 0) goto L_0x026f
            X.2uu r0 = r3.A01
            if (r0 == 0) goto L_0x026b
            java.util.Map r29 = r0.Bk0()
        L_0x00b2:
            X.GWV r0 = r1.A01
            r31 = r0
            java.lang.Integer r0 = r0.A01
            if (r0 == 0) goto L_0x0267
            int r14 = r0.intValue()
        L_0x00be:
            r0 = r31
            java.util.List r0 = r0.A03
            int r28 = r0.size()
            boolean r27 = r8.CPt()
            java.util.List r0 = r8.A03
            r26 = r0
            if (r0 == 0) goto L_0x027a
            int r24 = r26.size()
            if (r24 < 0) goto L_0x027a
            r11 = 0
            r13 = 0
        L_0x00d8:
            r0 = r26
            java.lang.Object r12 = X.00k.A0O(r0, r13)
            X.5oq r12 = (X.C295745oq) r12
            X.GX3 r21 = X.GX3.A00
            r0 = r21
            boolean r0 = X.GX2.A00(r0, r12)
            if (r0 != 0) goto L_0x00f0
            int r0 = r26.size()
            if (r13 != r0) goto L_0x01cb
        L_0x00f0:
            r0 = 36315902698786470(0x81051f000f0ea6, double:3.029661326890747E-306)
            boolean r0 = X.182.A06(r10, r6, r0)
            if (r0 == 0) goto L_0x0263
            if (r27 == 0) goto L_0x025f
            X.3PG r15 = X.AnonymousClass3PG.CACHED
        L_0x00ff:
            if (r12 == 0) goto L_0x01a0
            X.1Xj r1 = r12.A00()
            if (r1 == 0) goto L_0x010f
            java.util.List r0 = r1.A0e
            r0.clear()
            r1.A48(r15)
        L_0x010f:
            r0 = r21
            boolean r0 = X.GX2.A00(r0, r12)
            if (r0 == 0) goto L_0x01a0
            int r23 = r28 + r13
            if (r27 == 0) goto L_0x01ef
            r0 = 36322439638034621(0x810b11000028bd, double:3.033795313593419E-306)
            boolean r0 = X.182.A06(r10, r6, r0)
            if (r0 == 0) goto L_0x0152
            X.3VK r21 = X.AnonymousClass3VI.A00(r6)
            X.3VL r15 = X.AnonymousClass3VL.EXPLORE_GRID
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            X.Hqz r1 = new X.Hqz
            r1.<init>(r15, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r23)
            r1.A02 = r0
            X.1Xj r0 = r12.A00()
            if (r0 == 0) goto L_0x0145
            java.lang.String r0 = r0.getId()
            if (r0 != 0) goto L_0x0147
        L_0x0145:
            java.lang.String r0 = ""
        L_0x0147:
            r1.A04 = r0
        L_0x0149:
            X.GXs r1 = r1.A00()
            r0 = r21
            r0.A07(r1)
        L_0x0152:
            int r23 = r28 + r13
            int r21 = r23 - r14
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r14 == r0) goto L_0x019e
            r1 = 7
            r0 = r21
            if (r0 >= r1) goto L_0x019e
            r0 = 36322439638034621(0x810b11000028bd, double:3.033795313593419E-306)
            boolean r0 = X.182.A06(r10, r6, r0)
            if (r0 == 0) goto L_0x019e
            r0 = r28
            if (r14 >= r0) goto L_0x01d3
            X.3VK r14 = X.AnonymousClass3VI.A00(r6)
            X.3VL r15 = X.AnonymousClass3VL.EXPLORE_GRID
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.Hqz r1 = new X.Hqz
            r1.<init>(r15, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r23)
            r1.A02 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)
            r1.A01 = r0
        L_0x0187:
            X.1Xj r0 = r12.A00()
            if (r0 == 0) goto L_0x0193
            java.lang.String r0 = r0.getId()
            if (r0 != 0) goto L_0x0195
        L_0x0193:
            java.lang.String r0 = ""
        L_0x0195:
            r1.A04 = r0
            X.GXs r0 = r1.A00()
            r14.A07(r0)
        L_0x019e:
            r14 = r23
        L_0x01a0:
            if (r13 <= r11) goto L_0x01b0
            r0 = r26
            java.util.List r1 = r0.subList(r11, r13)
            r0 = 0
            java.util.ArrayList r0 = X.C296885qo.A06(r6, r0, r1)
            r2.addAll(r0)
        L_0x01b0:
            if (r12 == 0) goto L_0x01cb
            int r1 = r2.size()
            int r0 = r25.size()
            int r1 = r1 + r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            X.0eP r1 = new X.0eP
            r1.<init>(r0, r12)
            r0 = r25
            r0.add(r1)
            int r11 = r13 + 1
        L_0x01cb:
            r0 = r24
            if (r13 == r0) goto L_0x027a
            int r13 = r13 + 1
            goto L_0x00d8
        L_0x01d3:
            if (r27 != 0) goto L_0x019e
            X.3VK r14 = X.AnonymousClass3VI.A00(r6)
            X.3VL r15 = X.AnonymousClass3VL.EXPLORE_GRID
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            X.Hqz r1 = new X.Hqz
            r1.<init>(r15, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)
            r1.A03 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r23)
            r1.A02 = r0
            goto L_0x0187
        L_0x01ef:
            X.1Xj r0 = r12.A00()
            if (r0 == 0) goto L_0x01fb
            java.lang.String r1 = r0.A2R()
            if (r1 != 0) goto L_0x01fd
        L_0x01fb:
            java.lang.String r1 = ""
        L_0x01fd:
            if (r29 == 0) goto L_0x0152
            r0 = r29
            boolean r1 = r0.containsKey(r1)
            r0 = r18
            if (r1 != r0) goto L_0x0152
            r0 = 36322439638034621(0x810b11000028bd, double:3.033795313593419E-306)
            boolean r0 = X.182.A06(r10, r6, r0)
            if (r0 == 0) goto L_0x0152
            X.3VK r21 = X.AnonymousClass3VI.A00(r6)
            X.3VL r15 = X.AnonymousClass3VL.EXPLORE_GRID
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            X.Hqz r1 = new X.Hqz
            r1.<init>(r15, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r23)
            r1.A02 = r0
            X.1Xj r0 = r12.A00()
            if (r0 == 0) goto L_0x0233
            java.lang.String r0 = r0.getId()
            if (r0 != 0) goto L_0x0235
        L_0x0233:
            java.lang.String r0 = ""
        L_0x0235:
            r1.A04 = r0
            X.1Xj r0 = r12.A00()
            if (r0 == 0) goto L_0x0243
            java.lang.String r15 = r0.getId()
            if (r15 != 0) goto L_0x0245
        L_0x0243:
            java.lang.String r15 = ""
        L_0x0245:
            r0 = r31
            java.util.Map r0 = r0.A04
            java.lang.Object r0 = r0.get(r15)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x025d
            int r0 = r0.intValue()
        L_0x0255:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            goto L_0x0149
        L_0x025d:
            r0 = -1
            goto L_0x0255
        L_0x025f:
            X.3PG r15 = X.AnonymousClass3PG.NETWORK
            goto L_0x00ff
        L_0x0263:
            if (r12 == 0) goto L_0x01a0
            goto L_0x010f
        L_0x0267:
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x00be
        L_0x026b:
            r29 = 0
            goto L_0x00b2
        L_0x026f:
            r29 = r19
            goto L_0x00b2
        L_0x0273:
            java.util.List r1 = r8.A03
            r0 = 0
            java.util.ArrayList r2 = X.C296885qo.A06(r6, r0, r1)
        L_0x027a:
            if (r4 == 0) goto L_0x036b
            r0 = 36602982607164258(0x820a3800051362, double:3.2112118169268655E-306)
            int r1 = X.DbS.A04(r10, r6, r0)
            int r0 = r2.size()
            int r14 = java.lang.Math.min(r1, r0)
            r13 = 0
        L_0x028e:
            if (r13 >= r14) goto L_0x02ea
            java.lang.Object r1 = r2.get(r13)
            boolean r0 = r1 instanceof X.C297005r0
            if (r0 == 0) goto L_0x02e7
            X.5r0 r1 = (X.C297005r0) r1
            if (r1 == 0) goto L_0x02e7
            java.util.List r0 = r1.A02
            java.util.Iterator r12 = r0.iterator()
        L_0x02a2:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x02e4
            java.lang.Object r11 = r12.next()
            r1 = r11
            X.5qt r1 = (X.C296935qt) r1
            boolean r0 = r1 instanceof X.C296925qs
            if (r0 == 0) goto L_0x02a2
            X.5qs r1 = (X.C296925qs) r1
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x02a2
        L_0x02b9:
            X.5qt r11 = (X.C296935qt) r11
        L_0x02bb:
            boolean r0 = r11 instanceof X.C296925qs
            if (r0 == 0) goto L_0x02e1
            X.5qs r11 = (X.C296925qs) r11
            if (r11 == 0) goto L_0x02e1
            X.5oy r0 = r11.A01
            X.4bN r0 = r0.A00()
            X.1Xj r0 = r0.A02
            if (r0 == 0) goto L_0x02e1
            X.3WR r12 = r0.CEL()
            android.content.Context r11 = r7.A09
            java.lang.String r1 = r7.A0R
            X.4U8 r0 = new X.4U8
            r0.<init>(r11, r6, r12, r1)
            X.4U9 r0 = r0.A00()
            X.AnonymousClass4UA.A00(r0)
        L_0x02e1:
            int r13 = r13 + 1
            goto L_0x028e
        L_0x02e4:
            r11 = r19
            goto L_0x02b9
        L_0x02e7:
            r11 = r19
            goto L_0x02bb
        L_0x02ea:
            X.90i r0 = r7.A0H
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x036b
            X.Jfs r14 = r7.A0J
            if (r14 == 0) goto L_0x036b
            java.util.List r0 = r8.A04
            if (r0 == 0) goto L_0x0317
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r13 = r0.iterator()
        L_0x0300:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0319
            java.lang.Object r12 = r13.next()
            r0 = r12
            com.instagram.explore.topiccluster.ExploreTopicCluster r0 = (com.instagram.explore.topiccluster.ExploreTopicCluster) r0
            java.lang.Integer r1 = r0.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A1F
            if (r1 != r0) goto L_0x0300
            r11.add(r12)
            goto L_0x0300
        L_0x0317:
            r11 = r19
        L_0x0319:
            com.instagram.nido.impl.explore.NidoExploreViewModel r14 = (com.instagram.nido.impl.explore.NidoExploreViewModel) r14
            if (r11 == 0) goto L_0x036b
            java.util.ArrayList r13 = X.AnonymousClass7TG.A0r(r11)
            java.util.Iterator r21 = r11.iterator()
        L_0x0325:
            boolean r0 = r21.hasNext()
            if (r0 == 0) goto L_0x034c
            java.lang.Object r15 = r21.next()
            com.instagram.explore.topiccluster.ExploreTopicCluster r15 = (com.instagram.explore.topiccluster.ExploreTopicCluster) r15
            X.0qQ.A0B(r15, r9)
            java.lang.String r12 = r15.A06
            java.lang.String r11 = r15.A09
            X.5qm r1 = r15.A01
            X.5qm r0 = X.C296865qm.SUGGESTED
            if (r1 != r0) goto L_0x0349
            java.lang.Integer r1 = X.AnonymousClass05K.A01
        L_0x0340:
            X.Dh0 r0 = new X.Dh0
            r0.<init>(r15, r1, r12, r11)
            r13.add(r0)
            goto L_0x0325
        L_0x0349:
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            goto L_0x0340
        L_0x034c:
            java.lang.Integer r12 = X.AnonymousClass05K.A0C
            r11 = 0
            java.lang.String r1 = ""
            X.Dh0 r0 = new X.Dh0
            r0.<init>(r11, r12, r11, r1)
            java.util.ArrayList r0 = X.00k.A0T(r0, r13)
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r0)
            X.0eM r0 = r14.A03
            java.lang.Object r11 = r0.getValue()
            X.Dgy r11 = (X.C46556Dgy) r11
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.C46556Dgy.A01(r11, r0, r1)
        L_0x036b:
            if (r22 == 0) goto L_0x03c6
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r12 = r2.iterator()
        L_0x0375:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0397
            java.lang.Object r1 = r12.next()
            boolean r0 = r1 instanceof X.C297005r0
            if (r0 == 0) goto L_0x0375
            X.5r0 r1 = (X.C297005r0) r1
            if (r1 == 0) goto L_0x0375
            java.util.List r0 = r1.A02
            int r0 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x0375
            r11.add(r0)
            goto L_0x0375
        L_0x0397:
            java.lang.Integer[] r0 = new java.lang.Integer[r9]
            java.lang.Object[] r11 = r11.toArray(r0)
            java.lang.Integer[] r11 = (java.lang.Integer[]) r11
            X.0qQ.A0B(r11, r9)
            int r1 = r11.length
            r0 = 0
            r12 = 0
        L_0x03a5:
            if (r0 >= r1) goto L_0x03b1
            r13 = r11[r0]
            int r13 = r13.intValue()
            int r12 = r12 + r13
            int r0 = r0 + 1
            goto L_0x03a5
        L_0x03b1:
            X.GXN r0 = r7.A0G
            X.02m r11 = r0.A00
            r1 = 480321640(0x1ca12068, float:1.0662463E-21)
            java.lang.String r0 = "MEDIA_COUNT"
            r11.markerAnnotate(r1, r0, r12)
            java.lang.String r0 = "RESPONSE_RECEIVED"
            r11.markerPoint(r1, r0)
            r0 = 2
            r11.markerEnd(r1, r0)
        L_0x03c6:
            r0 = 36317509015573704(0x810695000014c8, double:3.030677168095112E-306)
            boolean r0 = X.182.A06(r10, r6, r0)
            if (r0 == 0) goto L_0x0469
            if (r22 != 0) goto L_0x0469
            if (r4 == 0) goto L_0x0469
            boolean r0 = r5.A0G
            if (r0 != 0) goto L_0x0469
            java.util.List r0 = r8.A03
            if (r0 == 0) goto L_0x0469
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0469
            java.util.List r0 = r8.A03
            if (r0 == 0) goto L_0x043f
            java.util.Iterator r12 = r0.iterator()
        L_0x03eb:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x043c
            java.lang.Object r11 = r12.next()
            r0 = r11
            X.5oq r0 = (X.C295745oq) r0
            X.5or r1 = r0.A02
            X.5or r0 = X.C295755or.MEDIA_GRID
            if (r1 != r0) goto L_0x03eb
        L_0x03fe:
            X.5oq r11 = (X.C295745oq) r11
            if (r11 == 0) goto L_0x043f
            X.5ot r0 = r11.A01
            X.0qQ.A0A(r0)
            if (r0 == 0) goto L_0x043f
            java.util.List r0 = r0.A0E
            if (r0 == 0) goto L_0x043f
            java.lang.Integer r14 = X.C51968G9o.A0t(r0)
        L_0x0411:
            X.1Av r13 = X.1Au.A00(r6)
            com.google.gson.Gson r11 = new com.google.gson.Gson
            r11.<init>()
            java.util.List r0 = r8.A03
            if (r0 == 0) goto L_0x0442
            java.util.ArrayList r1 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r12 = r0.iterator()
        L_0x0426:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0444
            java.lang.Object r0 = r12.next()
            X.5oq r0 = (X.C295745oq) r0
            X.5or r0 = r0.A02
            java.lang.String r0 = r0.toString()
            r1.add(r0)
            goto L_0x0426
        L_0x043c:
            r11 = r19
            goto L_0x03fe
        L_0x043f:
            r14 = r19
            goto L_0x0411
        L_0x0442:
            r1 = r19
        L_0x0444:
            java.lang.String r12 = r11.A0B(r1)
            X.0s0 r11 = r13.A18
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 245(0xf5, float:3.43E-43)
            X.DbS.A1a(r13, r12, r11, r1, r0)
            if (r14 == 0) goto L_0x0469
            int r1 = r14.intValue()
            X.1Av r0 = X.1Au.A00(r6)
            int r11 = r1 / 3
            X.0xY r1 = X.AnonymousClass7TE.A0p(r0)
            java.lang.String r0 = "explore_shimmer_media_grid_rows"
            r1.E5Z(r0, r11)
            r1.apply()
        L_0x0469:
            if (r30 == 0) goto L_0x057a
            if (r4 != 0) goto L_0x04ca
            java.lang.String r13 = r8.A01
            if (r13 == 0) goto L_0x04ca
            X.585 r12 = r7.A0L
            X.589 r11 = X.AnonymousClass589.EXPLORE
            java.lang.Class<X.5r0> r0 = X.C297005r0.class
            java.util.List r0 = X.00v.A0z(r0, r2)
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r14 = r0.iterator()
        L_0x0483:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0495
            java.lang.Object r0 = r14.next()
            X.5r0 r0 = (X.C297005r0) r0
            java.util.List r0 = r0.A02
            X.018.A16(r0, r1)
            goto L_0x0483
        L_0x0495:
            java.lang.Class<X.5qw> r0 = X.C296965qw.class
            java.util.List r0 = X.00v.A0z(r0, r1)
            java.util.ArrayList r1 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r14 = r0.iterator()
        L_0x04a3:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x04c2
            java.lang.Object r0 = r14.next()
            X.5qw r0 = (X.C296965qw) r0
            X.1Xj r0 = r0.BPf()
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto L_0x04bd
            r1.add(r0)
            goto L_0x04a3
        L_0x04bd:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x04c2:
            X.9Uw r0 = new X.9Uw
            r0.<init>(r11, r13, r1)
            r12.A01(r0)
        L_0x04ca:
            X.GXi r0 = X.C52531GWi.A00(r6)
            com.instagram.common.session.UserSession r11 = r0.A02
            r0 = 36313068019386060(0x81028b000006cc, double:3.02786866422359E-306)
            boolean r0 = X.182.A06(r10, r11, r0)
            if (r0 == 0) goto L_0x057a
            X.GXi r13 = r7.A0I
            java.lang.Class<X.5r0> r0 = X.C297005r0.class
            java.util.List r0 = X.00v.A0z(r0, r2)
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r11 = r0.iterator()
        L_0x04eb:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x04fd
            java.lang.Object r0 = r11.next()
            X.5r0 r0 = (X.C297005r0) r0
            java.util.List r0 = r0.A02
            X.018.A16(r0, r1)
            goto L_0x04eb
        L_0x04fd:
            java.lang.Class<X.5qy> r0 = X.C296985qy.class
            java.util.List r0 = X.00v.A0z(r0, r1)
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r14 = r0.iterator()
        L_0x050b:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0537
            java.lang.Object r12 = r14.next()
            r1 = r12
            X.5qy r1 = (X.C296985qy) r1
            X.GWW r0 = r7.A0F
            X.1Xj r1 = r1.A01
            java.lang.String r1 = r1.getId()
            if (r1 == 0) goto L_0x0532
            X.GWV r0 = r0.A01
            java.util.Set r0 = r0.A05
            boolean r0 = r0.contains(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x050b
            r11.add(r12)
            goto L_0x050b
        L_0x0532:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0537:
            java.util.ArrayList r12 = X.AnonymousClass7TG.A0r(r11)
            java.util.Iterator r1 = r11.iterator()
        L_0x053f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0551
            java.lang.Object r0 = r1.next()
            X.5qy r0 = (X.C296985qy) r0
            X.1Xj r0 = r0.A01
            r12.add(r0)
            goto L_0x053f
        L_0x0551:
            if (r4 == 0) goto L_0x055b
            X.GXj r1 = r13.A03
            java.lang.String r0 = X.AnonymousClass7TF.A0b()
            r1.A00 = r0
        L_0x055b:
            X.GXj r0 = r13.A03
            java.util.Map r11 = r0.A01
            java.lang.String r1 = r0.A00
            java.lang.Object r0 = r11.get(r1)
            if (r0 != 0) goto L_0x056e
            java.util.LinkedHashSet r0 = X.DbS.A0y()
            r11.put(r1, r0)
        L_0x056e:
            java.util.Set r0 = (java.util.Set) r0
            r0.addAll(r12)
            X.93F r1 = r13.A04
            X.93C r0 = X.AnonymousClass93C.A05
            r1.A9J(r0, r12, r9)
        L_0x057a:
            java.lang.String r0 = r8.A02
            r7.A06 = r0
            java.lang.String r0 = r8.A01
            r7.A05 = r0
            X.GWW r1 = r7.A0F
            X.GWV r0 = r1.A01
            r43 = r0
            java.util.List r0 = r0.A03
            int r32 = r0.size()
            boolean r0 = X.DbT.A1b(r2)
            if (r0 == 0) goto L_0x05b2
            java.lang.Object r11 = X.00k.A0J(r2)
            boolean r0 = r11 instanceof X.C297005r0
            if (r0 == 0) goto L_0x05b2
            X.5r0 r11 = (X.C297005r0) r11
            if (r11 == 0) goto L_0x05b2
            java.util.List r0 = r11.A02
            java.lang.Object r11 = X.00k.A0J(r0)
            X.5qt r11 = (X.C296935qt) r11
            if (r11 == 0) goto L_0x05b2
            int r0 = r5.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11.A01 = r0
        L_0x05b2:
            java.lang.String r0 = r7.A05
            r7.A01(r2, r0)
            r0 = r43
            java.util.List r0 = r0.A03
            int r14 = r0.size()
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r13 = r2.iterator()
        L_0x05c7:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x05d9
            java.lang.Object r11 = r13.next()
            boolean r0 = r11 instanceof X.C297005r0
            if (r0 == 0) goto L_0x05c7
            r12.add(r11)
            goto L_0x05c7
        L_0x05d9:
            int r12 = r12.size()
            int r12 = r12 + r32
            int r12 = r12 - r14
            java.lang.String r0 = r7.A05
            if (r0 == 0) goto L_0x05f3
            java.lang.Long r11 = X.AnonymousClass7TE.A10(r0)
            if (r11 == 0) goto L_0x05f3
            java.util.Map r1 = r1.A05
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r1.put(r11, r0)
        L_0x05f3:
            if (r20 == 0) goto L_0x06cf
            if (r3 == 0) goto L_0x06cf
            java.util.List r0 = r8.A03
            if (r0 == 0) goto L_0x061f
            int r24 = r0.size()
        L_0x05ff:
            boolean r23 = r8.CPt()
            r0 = r43
            java.util.List r13 = r0.A03
            r0 = r25
            java.lang.Object r0 = X.00k.A0O(r0, r9)
            X.0eP r0 = (X.0eP) r0
            if (r0 == 0) goto L_0x061b
            int r0 = X.C51970G9q.A0B(r0)
            int r0 = r0 + r32
            java.lang.Integer r19 = java.lang.Integer.valueOf(r0)
        L_0x061b:
            X.0qQ.A0B(r13, r9)
            goto L_0x0622
        L_0x061f:
            r24 = 0
            goto L_0x05ff
        L_0x0622:
            java.io.StringWriter r20 = new java.io.StringWriter     // Catch:{ IOException -> 0x069b }
            r20.<init>()     // Catch:{ IOException -> 0x069b }
            X.17W r12 = X.C51970G9q.A0e(r20)     // Catch:{ IOException -> 0x069b }
            if (r19 == 0) goto L_0x0632
            int r11 = r19.intValue()     // Catch:{ IOException -> 0x069b }
            goto L_0x0636
        L_0x0632:
            int r11 = r13.size()     // Catch:{ IOException -> 0x069b }
        L_0x0636:
            r1 = 0
            if (r11 < 0) goto L_0x0690
        L_0x0639:
            java.lang.Object r14 = X.00k.A0O(r13, r1)     // Catch:{ IOException -> 0x069b }
            X.5r0 r14 = (X.C297005r0) r14     // Catch:{ IOException -> 0x069b }
            r12.A0c()     // Catch:{ IOException -> 0x069b }
            java.lang.String r0 = "section_index"
            r12.A0P(r0, r1)     // Catch:{ IOException -> 0x069b }
            java.lang.String r0 = "section_content"
            r12.A0q(r0)     // Catch:{ IOException -> 0x069b }
            r12.A0b()     // Catch:{ IOException -> 0x069b }
            if (r14 == 0) goto L_0x0685
            java.util.List r0 = r14.A02     // Catch:{ IOException -> 0x069b }
            java.util.Iterator r19 = r0.iterator()     // Catch:{ IOException -> 0x069b }
        L_0x0657:
            boolean r0 = r19.hasNext()     // Catch:{ IOException -> 0x069b }
            if (r0 == 0) goto L_0x0685
            java.lang.Object r14 = r19.next()     // Catch:{ IOException -> 0x069b }
            X.5qt r14 = (X.C296935qt) r14     // Catch:{ IOException -> 0x069b }
            r12.A0c()     // Catch:{ IOException -> 0x067c }
            java.lang.String r0 = "id"
            java.lang.String r15 = r14.getKey()     // Catch:{ IOException -> 0x067c }
            r12.A0R(r0, r15)     // Catch:{ IOException -> 0x067c }
            java.lang.String r0 = "type"
            long r14 = r14.A00()     // Catch:{ IOException -> 0x067c }
            r12.A0Q(r0, r14)     // Catch:{ IOException -> 0x067c }
            r12.A0Z()     // Catch:{ IOException -> 0x067c }
            goto L_0x0657
        L_0x067c:
            r0 = move-exception
            java.lang.String r15 = "GridViewStateUtil"
            java.lang.String r14 = "Failed building JSON: "
            X.0KC.A0F(r15, r14, r0)     // Catch:{ IOException -> 0x069b }
            goto L_0x0657
        L_0x0685:
            r12.A0Y()     // Catch:{ IOException -> 0x069b }
            r12.A0Z()     // Catch:{ IOException -> 0x069b }
            if (r1 == r11) goto L_0x0690
            int r1 = r1 + 1
            goto L_0x0639
        L_0x0690:
            r12.A0Y()     // Catch:{ IOException -> 0x069b }
            r12.close()     // Catch:{ IOException -> 0x069b }
            java.lang.String r21 = r20.toString()     // Catch:{ IOException -> 0x069b }
            goto L_0x06a5
        L_0x069b:
            r11 = move-exception
            java.lang.String r1 = "GridViewStateUtil"
            java.lang.String r0 = "Failed building JSON: "
            X.0KC.A0F(r1, r0, r11)
            r21 = 0
        L_0x06a5:
            java.lang.Integer r15 = r5.A00
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            com.instagram.common.session.UserSession r13 = r3.A02
            X.1Av r1 = X.1Au.A00(r13)
            X.0qQ.A0B(r1, r9)
            X.1Az r1 = X.C228342lQ.A01(r1)
            X.1Az r11 = X.1Az.A07
            if (r1 != r11) goto L_0x06c2
            X.1Az r1 = X.C228342lQ.A00(r13)
            if (r1 == r11) goto L_0x070e
        L_0x06c2:
            r11 = 36312879042659696(0x81025f001c0570, double:3.027749154580889E-306)
            boolean r1 = X.182.A06(r10, r13, r11)
            if (r1 == 0) goto L_0x070e
            if (r23 == 0) goto L_0x070e
        L_0x06cf:
            X.90i r10 = r7.A0H
            boolean r0 = r10.A05
            if (r0 != 0) goto L_0x06dc
            java.util.List r1 = r8.A04
            r0 = r18
            r7.A02(r1, r0)
        L_0x06dc:
            if (r22 != 0) goto L_0x07f2
            X.GXl r3 = r7.A0D
            java.lang.String r10 = X.C3723090h.A01(r10)
            java.lang.String r12 = r8.A01
            boolean r1 = r8.A06
            java.lang.String r11 = r8.A02
            if (r12 == 0) goto L_0x06f3
            X.GXm r0 = r3.A01
            java.util.concurrent.ConcurrentMap r0 = r0.A00
            r0.put(r10, r12)
        L_0x06f3:
            if (r11 == 0) goto L_0x06fc
            X.GXm r0 = r3.A02
            java.util.concurrent.ConcurrentMap r0 = r0.A00
            r0.put(r10, r11)
        L_0x06fc:
            X.GXm r0 = r3.A00
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.util.concurrent.ConcurrentMap r0 = r0.A00
            r0.put(r10, r1)
            X.GXm r3 = r3.A03
            monitor-enter(r3)
            if (r4 != 0) goto L_0x07d0
            goto L_0x07d6
        L_0x070e:
            java.util.Iterator r20 = r25.iterator()
            r19 = -1
            r36 = 0
        L_0x0716:
            boolean r1 = r20.hasNext()
            if (r1 == 0) goto L_0x07c5
            java.lang.Object r1 = r20.next()
            X.0eP r1 = (X.0eP) r1
            if (r36 != 0) goto L_0x073a
            java.lang.Object r12 = r1.A00
            java.lang.Number r12 = (java.lang.Number) r12
            int r11 = r12.intValue()
            int r11 = r11 - r19
            r36 = 0
            r10 = r18
            if (r11 <= r10) goto L_0x0736
            r36 = 1
        L_0x0736:
            int r19 = r12.intValue()
        L_0x073a:
            java.lang.String r14 = ""
            r28 = r21
            if (r21 != 0) goto L_0x0742
            r28 = r14
        L_0x0742:
            r26 = 0
            r12 = 0
            r34 = 15201(0x3b61, float:2.1301E-41)
            X.2vl r10 = new X.2vl
            r25 = r10
            r27 = r12
            r29 = r9
            r30 = r9
            r31 = r9
            r33 = r9
            r35 = r4
            r37 = r9
            r38 = r9
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            java.lang.Object r11 = r1.A00
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            int r11 = r11 + r32
            r10.A0B(r11)
            r10.A0A(r9)
            java.lang.Object r11 = r1.A01
            X.5oq r11 = (X.C295745oq) r11
            r42 = 8
            X.9Ig r1 = new X.9Ig
            r37 = r1
            r38 = r11
            r39 = r10
            r40 = r15
            r41 = r12
            r37.<init>((X.C295745oq) r38, (X.C233462vl) r39, (java.lang.Integer) r40, (java.lang.Integer) r41, (int) r42)
            r0.add(r1)
            X.1Xj r1 = r11.A00()
            if (r1 == 0) goto L_0x0798
            X.1Xy r10 = r1.A0C
            X.3lZ r10 = r10.getInjected()
            if (r10 == 0) goto L_0x0798
            java.lang.String r26 = r10.AZ4()
        L_0x0798:
            java.lang.String r13 = java.lang.String.valueOf(r26)
            if (r1 == 0) goto L_0x07a0
            java.util.List r12 = r1.A0e
        L_0x07a0:
            java.lang.String r12 = X.C243413Yr.A00(r12)
            if (r12 != 0) goto L_0x07a7
            r12 = r14
        L_0x07a7:
            java.lang.String r14 = "{ \"delivery_flags\" = "
            java.lang.String r11 = "; \"num_of_sections\" = "
            java.lang.String r10 = "; }"
            r1 = r24
            java.lang.String r11 = X.002.A09(r1, r14, r12, r11, r10)
            if (r23 == 0) goto L_0x07bc
            X.2vG r10 = r3.A03
            java.lang.String r1 = "instagram_ad_explore_grid_load_from_cache"
            r10.Cgs(r13, r11, r1)
        L_0x07bc:
            X.2vG r10 = r3.A03
            java.lang.String r1 = "instagram_ad_explore_grid_ad_received"
            r10.Cgs(r13, r11, r1)
            goto L_0x0716
        L_0x07c5:
            X.2uu r3 = r3.A01
            if (r3 == 0) goto L_0x06cf
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r3.Dlz(r1, r0)
            goto L_0x06cf
        L_0x07d0:
            java.util.concurrent.ConcurrentMap r0 = r3.A00     // Catch:{ all -> 0x07ef }
            r0.put(r10, r2)     // Catch:{ all -> 0x07ef }
            goto L_0x07ed
        L_0x07d6:
            java.util.concurrent.ConcurrentMap r1 = r3.A00     // Catch:{ all -> 0x07ef }
            boolean r0 = r1.containsKey(r10)     // Catch:{ all -> 0x07ef }
            if (r0 == 0) goto L_0x07d0
            java.lang.Object r0 = r1.get(r10)     // Catch:{ all -> 0x07ef }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x07ef }
            r0.getClass()     // Catch:{ all -> 0x07ef }
            r0.addAll(r2)     // Catch:{ all -> 0x07ef }
            r1.put(r10, r0)     // Catch:{ all -> 0x07ef }
        L_0x07ed:
            monitor-exit(r3)     // Catch:{ all -> 0x07ef }
            goto L_0x07f2
        L_0x07ef:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x07ef }
            throw r0
        L_0x07f2:
            com.instagram.explore.topiccluster.ExploreTopicCluster r10 = r7.A02
            if (r10 == 0) goto L_0x083a
            java.lang.Integer r1 = r10.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 == r0) goto L_0x083a
            boolean r0 = r8.A05
            if (r0 != 0) goto L_0x083a
            X.GXO r0 = r7.A03
            if (r0 == 0) goto L_0x083a
            X.GWY r0 = r0.A00
            com.instagram.common.session.UserSession r3 = r0.A06
            X.4DU r2 = r0.A0D
            java.lang.String r1 = r0.A0E
            java.lang.String r0 = "explore_topic_content_exhausted"
            X.0xI r2 = X.0xI.A00(r2, r0)
            X.0j9 r0 = X.C271774jZ.A7x
            r2.A07(r0, r1)
            X.0j9 r1 = X.C271774jZ.A9D
            java.lang.String r0 = r10.A06
            r2.A07(r1, r0)
            X.0j9 r1 = X.C271774jZ.A9F
            java.lang.String r0 = r10.A0A
            r2.A07(r1, r0)
            X.0j9 r1 = X.C271774jZ.A9G
            java.lang.Integer r0 = r10.A03
            java.lang.String r0 = X.C296875qn.A00(r0)
            r2.A07(r1, r0)
            X.0j9 r1 = X.C271774jZ.A9C
            java.lang.String r0 = r10.A05
            r2.A07(r1, r0)
            X.DbU.A1R(r2, r3)
        L_0x083a:
            X.GXO r0 = r7.A03
            if (r0 == 0) goto L_0x08a8
            java.lang.System.currentTimeMillis()
            X.GWY r3 = r0.A00
            boolean r0 = r3.A03
            if (r0 != 0) goto L_0x084b
            r0 = r18
            r3.A03 = r0
        L_0x084b:
            X.GWd r7 = r3.A0A
            boolean r11 = r5.A0I
            if (r4 == 0) goto L_0x0a0c
            if (r11 != 0) goto L_0x0a08
            java.lang.Integer r12 = X.AnonymousClass05K.A00
        L_0x0855:
            X.2lW r10 = r7.A08
            java.lang.String r2 = r7.A09
            java.lang.Integer r0 = X.AnonymousClass05K.A1F
            r1 = 0
            r10.A01(r1, r12, r0, r2)
            if (r4 != 0) goto L_0x09ce
            java.util.HashSet r4 = X.AnonymousClass7TE.A1F()
            r10 = 0
            java.util.List r0 = r8.A03
            if (r0 == 0) goto L_0x09cb
            java.lang.Object r0 = X.00k.A0O(r0, r9)
            X.5oq r0 = (X.C295745oq) r0
            if (r0 == 0) goto L_0x09cb
            X.5ot r2 = r0.A01
            X.0qQ.A0A(r2)
        L_0x0877:
            java.util.List r0 = r8.A03
            if (r0 == 0) goto L_0x089f
            java.lang.Object r0 = X.00k.A0O(r0, r9)
            X.5oq r0 = (X.C295745oq) r0
            if (r0 == 0) goto L_0x089f
            X.5or r0 = r0.A02
            if (r0 == 0) goto L_0x089f
            int r13 = r0.ordinal()
            r0 = 14
            if (r13 == r0) goto L_0x099d
            r12 = 2
            r0 = 15
            if (r13 == r0) goto L_0x099d
            r11 = 3
            r0 = r18
            if (r13 == r0) goto L_0x0976
            r0 = 4
            if (r13 == r0) goto L_0x093b
            r0 = 5
            if (r13 == r0) goto L_0x093b
        L_0x089f:
            r7.A04 = r4
        L_0x08a1:
            X.Dbx r0 = r3.A05
            X.34p r0 = r0.A00
            r0.A05()
        L_0x08a8:
            X.GWb r1 = X.C46550Dgs.A00(r6)
            r0 = r43
            java.util.List r0 = r0.A03
            int r12 = r0.size()
            boolean r0 = r8.CPt()
            java.lang.String r10 = "Unable to update content"
            java.lang.String r7 = "Stale Grid"
            java.lang.String r6 = "FAILURE_NAME"
            java.lang.String r11 = "FINAL_GRID_ITEM_COUNT"
            java.lang.String r4 = "FAILURE_REASON"
            if (r0 == 0) goto L_0x08f7
            boolean r0 = r5.A0I
            if (r0 == 0) goto L_0x08f7
            com.instagram.common.session.UserSession r0 = r1.A00
            X.1Zn r2 = X.1Zm.A00(r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A0u
            java.lang.Integer r0 = X.AnonymousClass05K.A06
            X.1Zp r9 = r2.A01(r1, r0, r9)
            r9.A01(r11, r12)
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r8.mResponseTimestamp
            long r2 = r2 - r0
            java.lang.String r0 = "CACHE_AGE_MS"
            r9.A02(r0, r2)
            r9.A03(r6, r7)
            r9.A03(r4, r10)
            r0 = 1562(0x61a, float:2.189E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A03(r0, r4)
            r9.A00()
        L_0x08f7:
            int r3 = r5.A01
            java.util.HashMap r0 = X.C52524GWb.A01
            java.lang.Object r0 = X.C51968G9o.A0z(r0, r3)
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            if (r0 == 0) goto L_0x0a3e
            X.02m r2 = X.02m.A0p
            r9 = 1011615852(0x3c4c086c, float:0.01245318)
            java.lang.String r0 = "GRID_RENDERED"
            r2.markerPoint(r9, r3, r0)
            r2.markerAnnotate(r9, r3, r11, r12)
            boolean r0 = r8.CPt()
            if (r0 == 0) goto L_0x0a3e
            long r22 = java.lang.System.currentTimeMillis()
            long r0 = r8.mResponseTimestamp
            long r22 = r22 - r0
            java.lang.String r21 = "CACHE_AGE_MS"
            r18 = r2
            r19 = r9
            r20 = r3
            r18.markerAnnotate(r19, r20, r21, r22)
            boolean r0 = r5.A0I
            if (r0 == 0) goto L_0x0a3e
            r2.markerAnnotate(r9, r3, r6, r7)
            r2.markerAnnotate(r9, r3, r4, r10)
            r0 = 3
            X.C52524GWb.A00(r2, r3, r0)
            goto L_0x0a3e
        L_0x093b:
            if (r2 == 0) goto L_0x0973
            java.util.List r11 = r2.A0D
        L_0x093f:
            if (r11 == 0) goto L_0x0974
            java.lang.Object r0 = X.00k.A0O(r11, r10)
            X.5ov r0 = (X.C295795ov) r0
            if (r0 == 0) goto L_0x0974
            X.1Xj r0 = r0.A0A
        L_0x094b:
            X.1Xj r0 = X.C52526GWd.A00(r0)
            if (r0 == 0) goto L_0x095a
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto L_0x095a
            r4.add(r0)
        L_0x095a:
            int r10 = r10 + 1
            if (r10 < r12) goto L_0x093f
            if (r2 == 0) goto L_0x089f
            X.5ov r0 = r2.A04
            if (r0 == 0) goto L_0x089f
            java.lang.String r2 = r0.A00()
            if (r2 == 0) goto L_0x089f
            java.lang.String r1 = "clips-"
            java.lang.String r0 = ""
            java.lang.String r0 = X.00p.A0g(r2, r1, r0, r9)
            goto L_0x09c4
        L_0x0973:
            r11 = r1
        L_0x0974:
            r0 = r1
            goto L_0x094b
        L_0x0976:
            if (r2 == 0) goto L_0x099a
            java.util.List r2 = r2.A0E
        L_0x097a:
            if (r2 == 0) goto L_0x099b
            java.lang.Object r0 = X.00k.A0O(r2, r10)
            X.5ov r0 = (X.C295795ov) r0
            if (r0 == 0) goto L_0x099b
            X.1Xj r0 = r0.A0A
        L_0x0986:
            X.1Xj r0 = X.C52526GWd.A00(r0)
            if (r0 == 0) goto L_0x0995
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto L_0x0995
            r4.add(r0)
        L_0x0995:
            int r10 = r10 + 1
            if (r10 >= r11) goto L_0x089f
            goto L_0x097a
        L_0x099a:
            r2 = r1
        L_0x099b:
            r0 = r1
            goto L_0x0986
        L_0x099d:
            if (r2 == 0) goto L_0x09ad
            java.util.List r0 = r2.A0D
            if (r0 == 0) goto L_0x09ad
            java.lang.Object r0 = X.00k.A0O(r0, r9)
            X.5ov r0 = (X.C295795ov) r0
            if (r0 == 0) goto L_0x09ad
            X.1Xj r1 = r0.A0A
        L_0x09ad:
            X.1Xj r0 = X.C52526GWd.A00(r1)
            if (r0 == 0) goto L_0x09b6
            X.C51971G9r.A1M(r0, r4)
        L_0x09b6:
            if (r2 == 0) goto L_0x089f
            X.5ov r0 = r2.A08
            if (r0 == 0) goto L_0x089f
            X.1Xj r0 = r0.A0B
            if (r0 == 0) goto L_0x089f
            java.lang.String r0 = r0.getId()
        L_0x09c4:
            if (r0 == 0) goto L_0x089f
            r4.add(r0)
            goto L_0x089f
        L_0x09cb:
            r2 = r1
            goto L_0x0877
        L_0x09ce:
            X.Hpg r4 = r3.A00
            if (r4 == 0) goto L_0x08a1
            boolean r0 = r8.CPt()
            if (r0 == 0) goto L_0x09e7
            if (r11 == 0) goto L_0x09e7
            long r0 = r8.A00
            X.32L r2 = r4.A00
            android.content.Context r2 = r2.getContext()
            if (r2 == 0) goto L_0x09e7
            X.FEJ.A01(r2, r0)
        L_0x09e7:
            X.32L r1 = r4.A00
            android.view.View r0 = r1.mView
            if (r0 == 0) goto L_0x09fe
            X.TpO r0 = r1.A06
            if (r0 != 0) goto L_0x09fb
            java.lang.String r0 = "grid"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x09fb:
            r0.A02()
        L_0x09fe:
            X.GXd r0 = new X.GXd
            r0.<init>(r1)
            X.11Z.A02(r0)
            goto L_0x08a1
        L_0x0a08:
            java.lang.Integer r12 = X.AnonymousClass05K.A0N
            goto L_0x0855
        L_0x0a0c:
            java.lang.Integer r12 = X.AnonymousClass05K.A0C
            goto L_0x0855
        L_0x0a10:
            X.C46550Dgs.A00(r6)
            int r3 = r5.A01
            java.util.HashMap r0 = X.C52524GWb.A01
            java.lang.Object r0 = X.C51968G9o.A0z(r0, r3)
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            if (r0 == 0) goto L_0x0a2f
            X.02m r2 = X.02m.A0p
            r1 = 1011615852(0x3c4c086c, float:0.01245318)
            java.lang.String r0 = "GRID_UPDATE_DROPPED"
            r2.markerPoint(r1, r3, r0)
            r0 = 4
            X.C52524GWb.A00(r2, r3, r0)
        L_0x0a2f:
            boolean r0 = r5.A0F
            if (r0 == 0) goto L_0x0a3e
            X.GXN r0 = r7.A0G
            X.02m r2 = r0.A00
            r1 = 480321640(0x1ca12068, float:1.0662463E-21)
            r0 = 3
            r2.markerEnd(r1, r0)
        L_0x0a3e:
            r0 = r44
            X.2mA r0 = r0.A03
            if (r0 == 0) goto L_0x0a47
            r0.A02()
        L_0x0a47:
            r1 = 111229498(0x6a13a3a, float:6.0647025E-35)
            r0 = r17
            X.AnonymousClass0fD.A0A(r1, r0)
            r1 = 1927743701(0x72e708d5, float:9.1522195E30)
            r0 = r16
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GWZ.onSuccess(java.lang.Object):void");
    }

    public final void onFail(C268654dm r11) {
        Integer num;
        String localizedMessage;
        int A032 = AnonymousClass0fD.A03(1136989116);
        0qQ.A0B(r11, 0);
        GT0 gt0 = this.A01;
        GXO gxo = gt0.A03;
        if (gxo != null) {
            C3723390k r4 = this.A02;
            System.currentTimeMillis();
            GWY gwy = gxo.A00;
            UserSession userSession = gwy.A06;
            GM7.A01(gwy.A0D, userSession, gwy.A09.A02, gwy.A0E, "failure");
            Throwable A012 = r11.A01();
            if (A012 == null || (localizedMessage = A012.getLocalizedMessage()) == null) {
                gwy.A05.A00.A01();
            } else {
                gwy.A05.A00.A07(localizedMessage);
            }
            if (!gwy.A03) {
                gwy.A03 = true;
            }
            C52526GWd gWd = gwy.A0A;
            boolean z = r4.A0E;
            boolean z2 = r4.A0I;
            if (!z) {
                num = AnonymousClass05K.A0C;
            } else if (!z2) {
                num = AnonymousClass05K.A00;
            } else {
                num = AnonymousClass05K.A0N;
            }
            C228362lW r42 = gWd.A08;
            String str = gWd.A09;
            r42.A01((1Xj) null, num, AnonymousClass05K.A1I, str);
            r42.A03((1Xj) null, num, str);
            C55919Hpg hpg = gwy.A00;
            if (hpg != null) {
                AnonymousClass32L r1 = hpg.A00;
                if (r1.isResumed()) {
                    C59689JTv.A01(r1.getActivity(), AnonymousClass000.A00(275), 2131956760, 0);
                }
                C14074TpO tpO = hpg.A00.A06;
                if (tpO == null) {
                    0qQ.A0F("grid");
                    throw AnonymousClass00P.createAndThrow();
                }
                tpO.A0E.update();
            }
        }
        AnonymousClass2mA r0 = this.A03;
        if (r0 != null) {
            r0.A00();
        }
        C52524GWb A002 = C46550Dgs.A00(gt0.A0C);
        C3723390k r02 = this.A02;
        A002.A01(r11, r02);
        if (r02.A0F) {
            gt0.A0G.A00.markerEnd(480321640, 3);
        }
        AnonymousClass0fD.A0A(-1178259421, A032);
    }

    public final void onFinish() {
        boolean z;
        int A002;
        int A032 = AnonymousClass0fD.A03(2062616783);
        GT0 gt0 = this.A01;
        GXO gxo = gt0.A03;
        if (gxo != null) {
            GWY gwy = gxo.A00;
            UserSession userSession = gwy.A06;
            GM7.A01(gwy.A0D, userSession, gwy.A09.A02, gwy.A0E, RealtimeConstants.SEND_SUCCESS);
            C55919Hpg hpg = gwy.A00;
            if (hpg != null) {
                C14074TpO tpO = hpg.A00.A06;
                if (tpO == null) {
                    0qQ.A0F("grid");
                    throw AnonymousClass00P.createAndThrow();
                }
                C14074TpO.A00(tpO, false, true);
            }
        }
        UserSession userSession2 = gt0.A0C;
        C52524GWb A003 = C46550Dgs.A00(userSession2);
        C3723390k r0 = this.A02;
        A003.A03(r0);
        if (r0.A0F) {
            z = true;
            if (!gt0.A08 && (A002 = DbT.A00(AnonymousClass7TE.A0q(userSession2), "explore_nonpersonalized_toast_shown_count")) < 3) {
                C310336ap A0a = DbS.A0a();
                Context context = gt0.A09;
                DbS.A19(context, A0a, 2131961870);
                A0a.A0I = context.getString(2131961871);
                A0a.A06();
                DbY.A1N(A0a);
                AnonymousClass7TG.A1M(1Au.A00(userSession2).A01, "explore_nonpersonalized_toast_shown_count", A002 + 1);
            }
        } else {
            z = false;
        }
        gt0.A08 = z;
        AnonymousClass0fD.A0A(-1921352393, A032);
    }

    public final void onStart() {
        C55919Hpg hpg;
        String str;
        int A032 = AnonymousClass0fD.A03(1523443744);
        GT0 gt0 = this.A01;
        C52524GWb A002 = C46550Dgs.A00(gt0.A0C);
        C3723390k r1 = this.A02;
        A002.A04(r1, C51968G9o.A0t(gt0.A0F.A01.A03));
        if (r1.A0F) {
            Integer num = r1.A03;
            if (num == AnonymousClass05K.A0C) {
                str = gt0.A0P;
            } else if (num == AnonymousClass05K.A0N) {
                str = gt0.A0O;
            } else {
                str = gt0.A0N;
            }
            GXN gxn = gt0.A0G;
            0qQ.A0B(str, 0);
            02m r3 = gxn.A00;
            r3.markerStart(480321640);
            r3.markerPoint(480321640, "RESPONSE_SENT");
            r3.markerAnnotate(480321640, "FETCH_REASON", str);
        }
        System.currentTimeMillis();
        GXO gxo = gt0.A03;
        if (gxo != null) {
            GWY gwy = gxo.A00;
            gwy.A05.A00.A04();
            if (AnonymousClass7TF.A1Z(gwy.A0H) && (hpg = gwy.A00) != null) {
                C14074TpO tpO = hpg.A00.A06;
                if (tpO == null) {
                    0qQ.A0F("grid");
                    throw AnonymousClass00P.createAndThrow();
                }
                tpO.A0E.update();
            }
        }
        AnonymousClass2mA r0 = this.A03;
        if (r0 != null) {
            r0.A01();
        }
        AnonymousClass0fD.A0A(-1967879209, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A032 = AnonymousClass0fD.A03(-701001945);
        AnonymousClass0fD.A0A(-1993835369, AnonymousClass0fD.A03(-223822841));
        AnonymousClass0fD.A0A(342919278, A032);
    }
}
