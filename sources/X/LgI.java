package X;

public abstract class LgI implements 1wn {
    public final String A00;

    public LgI(String str) {
        this.A00 = str;
        if (str == null || str.length() == 0) {
            throw DbT.A0m();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0119, code lost:
        X.LR7.A01(r2, r0, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onEvent(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 1849254559(0x6e39629f, float:1.4343488E28)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.Lfo r10 = (X.C64662Lfo) r10
            r0 = -983374954(0xffffffffc562e396, float:-3630.224)
            int r4 = X.AnonymousClass7TG.A0D(r10, r0)
            java.lang.String r1 = r9.A00
            java.lang.String r0 = r10.A00
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x002d
            r8 = r9
            boolean r0 = r9 instanceof X.C62161KbJ
            if (r0 == 0) goto L_0x003a
            X.KbJ r8 = (X.C62161KbJ) r8
            com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository r2 = r8.A00
            X.05G r1 = r2.A05
            X.Kbb r0 = X.C62179Kbb.A00
            r1.Epw(r0)
            r2.A04()
        L_0x002d:
            r0 = 36246512(0x22913f0, float:1.2421881E-37)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -1805429480(0xffffffff94635518, float:-1.1477353E-26)
            X.AnonymousClass0fD.A0A(r0, r5)
            return
        L_0x003a:
            boolean r0 = r9 instanceof X.C62166KbO
            if (r0 == 0) goto L_0x0063
            X.KbO r8 = (X.C62166KbO) r8
            X.KbU r10 = (X.C62172KbU) r10
            r0 = 0
            X.0qQ.A0B(r10, r0)
            com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository r0 = r8.A00
            X.05G r7 = r0.A05
            java.lang.String r6 = r8.A01
            java.lang.String r3 = r10.A01
            java.lang.String r2 = r10.A00
            X.05G r0 = r0.A04
            boolean r0 = X.DbX.A1b(r0)
            java.lang.Integer r1 = X.JTP.A0j(r0)
            X.Kba r0 = new X.Kba
            r0.<init>(r1, r6, r3, r2)
            r7.Epw(r0)
            goto L_0x002d
        L_0x0063:
            X.KbN r8 = (X.C62165KbN) r8
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x00a7;
                case 1: goto L_0x00b6;
                case 2: goto L_0x00eb;
                default: goto L_0x006a;
            }
        L_0x006a:
            X.KbT r10 = (X.C62171KbT) r10
            r0 = 0
            X.0qQ.A0B(r10, r0)
            X.KbM r7 = r10.A00
            int r6 = r7.A00
            java.lang.Object r3 = r8.A01
            X.LAz r3 = (X.C63896LAz) r3
            int r0 = r3.A00
            if (r6 < r0) goto L_0x002d
            X.LR7 r2 = r3.A03
            java.lang.String r1 = r10.A01
            java.lang.Integer r0 = r7.A01
            X.LFs r1 = X.LR7.A00(r2, r1)
            int r0 = r0.intValue()
            switch(r0) {
                case 1: goto L_0x009b;
                case 2: goto L_0x0095;
                case 3: goto L_0x0098;
                case 4: goto L_0x0095;
                case 5: goto L_0x009b;
                case 6: goto L_0x009e;
                case 7: goto L_0x009e;
                case 8: goto L_0x00a1;
                case 9: goto L_0x00a4;
                case 10: goto L_0x0095;
                case 11: goto L_0x0095;
                case 12: goto L_0x0095;
                default: goto L_0x008d;
            }
        L_0x008d:
            X.KhM r0 = X.C62530KhM.UNKNOWN
        L_0x008f:
            X.LR7.A01(r2, r1, r0)
            r3.A00 = r6
            goto L_0x002d
        L_0x0095:
            X.KhM r0 = X.C62530KhM.UNREACHABLE
            goto L_0x008f
        L_0x0098:
            X.KhM r0 = X.C62530KhM.REJECTED
            goto L_0x008f
        L_0x009b:
            X.KhM r0 = X.C62530KhM.DISCONNECTED
            goto L_0x008f
        L_0x009e:
            X.KhM r0 = X.C62530KhM.INVITED
            goto L_0x008f
        L_0x00a1:
            X.KhM r0 = X.C62530KhM.CONNECTING
            goto L_0x008f
        L_0x00a4:
            X.KhM r0 = X.C62530KhM.CONNECTED
            goto L_0x008f
        L_0x00a7:
            java.lang.Object r0 = r8.A01
            X.LAz r0 = (X.C63896LAz) r0
            X.LR7 r2 = r0.A03
            X.LFs r1 = r2.A01
            X.KhM r0 = X.C62530KhM.DISMISSED
            X.LR7.A01(r2, r1, r0)
            goto L_0x002d
        L_0x00b6:
            X.KbR r10 = (X.C62169KbR) r10
            r2 = 0
            X.0qQ.A0B(r10, r2)
            java.lang.String r3 = r10.A01
            java.lang.Integer r0 = r10.A00
            if (r0 == 0) goto L_0x00c5
            r0.intValue()
        L_0x00c5:
            int r1 = r0.intValue()
            if (r1 == r2) goto L_0x00e2
            r0 = 1
            if (r1 != r0) goto L_0x0173
            java.lang.Object r0 = r8.A01
            X.LAz r0 = (X.C63896LAz) r0
            X.LR7 r2 = r0.A03
            X.KhM r1 = X.C62530KhM.STALLED
        L_0x00d6:
            if (r3 == 0) goto L_0x002d
            java.util.Map r0 = r2.A02
            r0.get(r3)
            X.LFs r0 = X.LR7.A00(r2, r3)
            goto L_0x0119
        L_0x00e2:
            java.lang.Object r0 = r8.A01
            X.LAz r0 = (X.C63896LAz) r0
            X.LR7 r2 = r0.A03
            X.KhM r1 = X.C62530KhM.ACTIVE
            goto L_0x00d6
        L_0x00eb:
            X.KbS r10 = (X.C62170KbS) r10
            r7 = 0
            X.0qQ.A0B(r10, r7)
            java.lang.String r6 = r10.A01
            java.lang.Integer r0 = r10.A00
            if (r0 == 0) goto L_0x00fa
            r0.intValue()
        L_0x00fa:
            int r1 = r0.intValue()
            if (r1 == r7) goto L_0x0127
            r0 = 1
            if (r1 == r0) goto L_0x011e
            r0 = 2
            if (r1 != r0) goto L_0x0178
            java.lang.Object r0 = r8.A01
            X.LAz r0 = (X.C63896LAz) r0
            X.LR7 r2 = r0.A03
            X.KhM r1 = X.C62530KhM.ACTIVE
        L_0x010e:
            if (r6 == 0) goto L_0x002d
            java.util.Map r0 = r2.A02
            r0.get(r6)
            X.LFs r0 = X.LR7.A00(r2, r6)
        L_0x0119:
            X.LR7.A01(r2, r0, r1)
            goto L_0x002d
        L_0x011e:
            java.lang.Object r0 = r8.A01
            X.LAz r0 = (X.C63896LAz) r0
            X.LR7 r2 = r0.A03
            X.KhM r1 = X.C62530KhM.DISCONNECTED
            goto L_0x010e
        L_0x0127:
            java.lang.Object r0 = r8.A01
            X.LAz r0 = (X.C63896LAz) r0
            X.LR7 r2 = r0.A03
            java.lang.String r3 = "ConferenceState"
            if (r6 == 0) goto L_0x0136
            X.LFs r1 = X.LR7.A00(r2, r6)     // Catch:{ NoSuchElementException -> 0x015e }
            goto L_0x0155
        L_0x0136:
            X.KhM r1 = X.C62530KhM.CONNECTING     // Catch:{ NoSuchElementException -> 0x015e }
            X.KhM r0 = X.C62530KhM.INVITED     // Catch:{ NoSuchElementException -> 0x015e }
            X.KhM[] r0 = new X.C62530KhM[]{r1, r0}     // Catch:{ NoSuchElementException -> 0x015e }
            java.util.List r1 = java.util.Arrays.asList(r0)     // Catch:{ NoSuchElementException -> 0x015e }
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ NoSuchElementException -> 0x015e }
            r0.<init>(r1)     // Catch:{ NoSuchElementException -> 0x015e }
            java.util.HashSet r0 = r2.A02(r0, r7)     // Catch:{ NoSuchElementException -> 0x015e }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ NoSuchElementException -> 0x015e }
            java.lang.Object r1 = r0.next()     // Catch:{ NoSuchElementException -> 0x015e }
            X.LFs r1 = (X.C63966LFs) r1     // Catch:{ NoSuchElementException -> 0x015e }
        L_0x0155:
            if (r1 == 0) goto L_0x002d
            X.KhM r0 = X.C62530KhM.CONNECTED     // Catch:{ NoSuchElementException -> 0x015e }
            X.LR7.A01(r2, r1, r0)     // Catch:{ NoSuchElementException -> 0x015e }
            goto L_0x002d
        L_0x015e:
            r2 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[]{r6, r2}
            java.lang.String r0 = "onMediaStreamAdded:  Unknown participant %s"
            X.0KC.A0P(r3, r0, r1)
            java.lang.String r0 = "Media stream added for missing participant: "
            java.lang.String r0 = X.002.A0R(r0, r6)
            X.0wb.A06(r3, r0, r2)
            goto L_0x002d
        L_0x0173:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0178:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LgI.onEvent(java.lang.Object):void");
    }
}
