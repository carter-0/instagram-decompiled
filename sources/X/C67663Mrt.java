package X;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* renamed from: X.Mrt  reason: case insensitive filesystem */
public final class C67663Mrt extends Handler {
    public C68171N3m A00 = new C68171N3m(31, false, false, false);
    public final AudioManager A01;
    public final C71125OdK A02;
    public final C70779OKz A03;

    public final void A00(int i) {
        sendMessage(obtainMessage(0, i, -1, (Object) null));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x014e, code lost:
        r1 = r1.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0152, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0154, code lost:
        r2.A05(r1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        r7.A02.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00fa, code lost:
        r5 = r1.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00fe, code lost:
        if (r5 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0100, code lost:
        r4 = r7.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0102, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        r0 = X.C71125OdK.A00(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0108, code lost:
        if (r0 == null) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x010a, code lost:
        r4.A07.A00("Request play RtcTone %s if different", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x011b, code lost:
        if (r5.equals(r4.A00) == false) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        r4.A07.A00("RtcTone is not different", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0127, code lost:
        r4.A05(r5, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x012a, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x012b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r8) {
        /*
            r7 = this;
            r6 = 0
            X.0qQ.A0B(r8, r6)
            int r1 = r8.what
            if (r1 != 0) goto L_0x0159
            int r1 = r8.arg1
            java.lang.Object r5 = r8.obj
            switch(r1) {
                case 1: goto L_0x0027;
                case 2: goto L_0x0158;
                case 3: goto L_0x0033;
                case 4: goto L_0x0016;
                case 5: goto L_0x013f;
                case 6: goto L_0x0039;
                case 7: goto L_0x00f0;
                case 8: goto L_0x0131;
                default: goto L_0x000f;
            }
        L_0x000f:
            java.lang.String r0 = "Unknown eventType="
            java.lang.IllegalArgumentException r0 = X.DbW.A0a(r0, r1)
            throw r0
        L_0x0016:
            X.OdK r2 = r7.A02
            r2.A04()
            X.N3m r0 = r7.A00
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x0158
            X.OKz r1 = r7.A03
            X.Nk8 r0 = X.C69368Nk8.A07
            goto L_0x014e
        L_0x0027:
            X.N3m r0 = r7.A00
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x0033
            X.OKz r1 = r7.A03
            X.Nk8 r0 = X.C69368Nk8.A09
            goto L_0x00fa
        L_0x0033:
            X.OdK r0 = r7.A02
            r0.A04()
            return
        L_0x0039:
            X.N3m r0 = r7.A00
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0158
            if (r5 == 0) goto L_0x0158
            boolean r0 = r5 instanceof X.C69264NiQ
            if (r0 == 0) goto L_0x0158
            android.media.AudioManager r4 = r7.A01
            r0 = 2
            android.media.AudioDeviceInfo[] r0 = r4.getDevices(r0)
            X.0sC r3 = X.0pe.A00(r0)
        L_0x0050:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x007c
            java.lang.Object r2 = r3.next()
            android.media.AudioDeviceInfo r2 = (android.media.AudioDeviceInfo) r2
            int r1 = r2.getType()
            r0 = 7
            if (r1 == r0) goto L_0x0079
            int r1 = r2.getType()
            r0 = 8
            if (r1 == r0) goto L_0x0079
            int r1 = r2.getType()
            r0 = 4
            if (r1 == r0) goto L_0x0079
            int r1 = r2.getType()
            r0 = 3
            if (r1 != r0) goto L_0x0050
        L_0x0079:
            X.NiQ r5 = X.C69264NiQ.DEFAULT
            goto L_0x0050
        L_0x007c:
            X.NiQ r0 = X.C69264NiQ.SPEAKER
            if (r5 != r0) goto L_0x0084
            r0 = 1
            r4.setSpeakerphoneOn(r0)
        L_0x0084:
            X.OdK r3 = r7.A02
            monitor-enter(r3)
            X.OW7 r0 = r3.A08     // Catch:{ all -> 0x00ed }
            r0.A02()     // Catch:{ all -> 0x00ed }
            r0.A01()     // Catch:{ all -> 0x00ed }
            monitor-exit(r3)
            X.OKz r1 = r7.A03
            X.Nk8 r0 = X.C69368Nk8.A06
            X.ONa r5 = r1.A00(r0)
            if (r5 == 0) goto L_0x0158
            r0 = 29
            X.Pm5 r4 = X.C73925Pm5.A01(r7, r0)
            monitor-enter(r3)
            boolean r0 = r5.A04     // Catch:{ all -> 0x00ed }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00df
            java.lang.String r0 = X.C71125OdK.A00(r5, r3)     // Catch:{ all -> 0x00ed }
            if (r0 == 0) goto L_0x00b8
            X.OUV r2 = r3.A07     // Catch:{ all -> 0x00ed }
            java.lang.String r1 = "Request play %s RtcTone with callback"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x00ed }
            r2.A00(r1, r0)     // Catch:{ all -> 0x00ed }
        L_0x00b8:
            android.os.Looper r1 = android.os.Looper.myLooper()     // Catch:{ all -> 0x00ed }
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x00ed }
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ all -> 0x00ed }
            if (r0 == 0) goto L_0x00e6
            X.OUV r2 = r3.A07     // Catch:{ all -> 0x00ed }
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch:{ all -> 0x00ed }
            java.lang.String r0 = "Start Tone on Main Thread"
            r2.A00(r0, r1)     // Catch:{ all -> 0x00ed }
            X.C71125OdK.A02(r3)     // Catch:{ all -> 0x00ed }
            X.Pw4 r0 = r3.A06     // Catch:{ all -> 0x00ed }
            r0.ASd()     // Catch:{ all -> 0x00ed }
            r0.EeL(r4)     // Catch:{ all -> 0x00ed }
            X.C71125OdK.A01(r5, r3)     // Catch:{ all -> 0x00ed }
            monitor-exit(r3)
            return
        L_0x00df:
            java.lang.String r0 = "Only supports non-looping tones"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ all -> 0x00ed }
            goto L_0x00ec
        L_0x00e6:
            java.lang.String r0 = "Must be ran on the UI thread!"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ all -> 0x00ed }
        L_0x00ec:
            throw r0     // Catch:{ all -> 0x00ed }
        L_0x00ed:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x00f0:
            X.N3m r0 = r7.A00
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0158
            X.OKz r1 = r7.A03
            X.Nk8 r0 = X.C69368Nk8.A05
        L_0x00fa:
            X.ONa r5 = r1.A00(r0)
            if (r5 == 0) goto L_0x0158
            X.OdK r4 = r7.A02
            monitor-enter(r4)
            java.lang.String r0 = X.C71125OdK.A00(r5, r4)     // Catch:{ all -> 0x012e }
            r3 = 1
            if (r0 == 0) goto L_0x0115
            X.OUV r2 = r4.A07     // Catch:{ all -> 0x012e }
            java.lang.String r1 = "Request play RtcTone %s if different"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x012e }
            r2.A00(r1, r0)     // Catch:{ all -> 0x012e }
        L_0x0115:
            X.ONa r0 = r4.A00     // Catch:{ all -> 0x012c }
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x012c }
            if (r0 == 0) goto L_0x0127
            X.OUV r2 = r4.A07     // Catch:{ all -> 0x012e }
            java.lang.String r1 = "RtcTone is not different"
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ all -> 0x012e }
            r2.A00(r1, r0)     // Catch:{ all -> 0x012e }
            goto L_0x012a
        L_0x0127:
            r4.A05(r5, r3)     // Catch:{ all -> 0x012e }
        L_0x012a:
            monitor-exit(r4)
            return
        L_0x012c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x012e }
        L_0x012e:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0131:
            X.OdK r1 = r7.A02
            r1.A04()
            monitor-enter(r1)
            r0 = 0
            r1.A00 = r0     // Catch:{ all -> 0x013c }
            monitor-exit(r1)
            return
        L_0x013c:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x013f:
            X.OdK r2 = r7.A02
            r2.A04()
            X.N3m r0 = r7.A00
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x0158
            X.OKz r1 = r7.A03
            X.Nk8 r0 = X.C69368Nk8.A08
        L_0x014e:
            X.ONa r1 = r1.A00(r0)
            if (r1 == 0) goto L_0x0158
            r0 = 1
            r2.A05(r1, r0)
        L_0x0158:
            return
        L_0x0159:
            java.lang.String r0 = "Message.what="
            java.lang.IllegalArgumentException r0 = X.DbW.A0a(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67663Mrt.handleMessage(android.os.Message):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67663Mrt(AudioManager audioManager, Looper looper, C71125OdK odK, C70779OKz oKz) {
        super(looper);
        C51972G9s.A1D(oKz, audioManager);
        this.A02 = odK;
        this.A03 = oKz;
        this.A01 = audioManager;
    }
}
