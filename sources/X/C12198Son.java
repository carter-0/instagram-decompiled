package X;

import com.facebook.proxygen.HTTPResponseHandler;
import com.facebook.proxygen.ReadBuffer;
import com.facebook.proxygen.RequestStatsObserver;
import java.util.Map;
import org.apache.http.Header;

@Deprecated
/* renamed from: X.Son  reason: case insensitive filesystem */
public final class C12198Son implements HTTPResponseHandler {
    public 2ZL A00;
    public C8838RCa A01;
    public C8849RCp A02;
    public Map A03;
    public final AnonymousClass1C6 A04;
    public final 1C5 A05;
    public final RequestStatsObserver A06;
    public final 1QS A07;
    public final S28 A08;
    public final Object A09 = Pxe.A0p();
    public final ReadBuffer A0A;
    public volatile Integer A0B = AnonymousClass05K.A00;

    public final void onResponse(int i, String str, Header[] headerArr) {
        String str2 = str;
        Pxe.A1G();
        Object obj = this.A09;
        synchronized (obj) {
            try {
                A00(AnonymousClass05K.A00);
                C8849RCp rCp = this.A02;
                17k.A07(rCp, "mBufferInputStream can not be null!");
                if (str == null) {
                    str2 = "empty";
                }
                this.A00 = C11410SSi.A00(this.A07, rCp, str2, this.A03, headerArr, i);
                this.A0B = AnonymousClass05K.A01;
            } catch (Throwable th) {
                obj.notifyAll();
                throw th;
            }
            obj.notifyAll();
        }
    }

    private void A00(Integer... numArr) {
        17k.A0H(C51969G9p.A1a(this.A0B, AnonymousClass05K.A0Y), "LigerIGResponseHandler.verifyState: read state shouldn't be ERROR");
        boolean z = false;
        for (Integer A1W : numArr) {
            z |= AnonymousClass7TF.A1W(this.A0B, A1W);
        }
        17k.A0H(z, 002.A0R("LigerIGResponseHandler.verifyState: invalid state. Curr read = ", RhW.A00(this.A0B)));
    }

    public C12198Son(AnonymousClass1C6 r2, 1C5 r3, ReadBuffer readBuffer, RequestStatsObserver requestStatsObserver, 1QS r6, S28 s28) {
        this.A07 = r6;
        this.A0A = readBuffer;
        this.A06 = requestStatsObserver;
        this.A08 = s28;
        this.A02 = new C8849RCp(readBuffer);
        this.A03 = AnonymousClass7TE.A1E();
        this.A05 = r3;
        this.A04 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        X.0wb.A07("error_on_body", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBody() {
        /*
            r3 = this;
            X.Pxe.A1G()
            X.RCp r2 = r3.A02     // Catch:{ all -> 0x0020 }
            java.lang.String r0 = "LigerIGResponseHandler.handleBody: mBufferInputStream is null"
            X.17k.A07(r2, r0)     // Catch:{ all -> 0x0020 }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0020 }
            java.lang.Integer r1 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0020 }
            java.lang.Integer[] r0 = new java.lang.Integer[]{r0, r1}     // Catch:{ all -> 0x0020 }
            r3.A00(r0)     // Catch:{ all -> 0x0020 }
            monitor-enter(r2)     // Catch:{ all -> 0x0020 }
            r2.notifyAll()     // Catch:{ all -> 0x001d }
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            r3.A0B = r1     // Catch:{ all -> 0x0020 }
            return
        L_0x001d:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            throw r0     // Catch:{ all -> 0x0020 }
        L_0x0020:
            r1 = move-exception
            java.lang.String r0 = "error_on_body"
            X.0wb.A07(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12198Son.onBody():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0044, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        X.0wb.A07("error_on_eom", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onEOM() {
        /*
            r4 = this;
            X.Pxe.A1G()
            X.S28 r3 = r4.A08     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = "done"
            r3.A00 = r0     // Catch:{ all -> 0x0044 }
            X.RCp r2 = r4.A02     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = "LigerIGResponseHandler.handleEOM: mBufferInputStream is null"
            X.17k.A07(r2, r0)     // Catch:{ all -> 0x0044 }
            java.lang.Integer r1 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0044 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0044 }
            java.lang.Integer[] r0 = new java.lang.Integer[]{r1, r0}     // Catch:{ all -> 0x0044 }
            r4.A00(r0)     // Catch:{ all -> 0x0044 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x0044 }
            r4.A0B = r0     // Catch:{ all -> 0x0044 }
            monitor-enter(r2)     // Catch:{ all -> 0x0044 }
            r2.notifyAll()     // Catch:{ all -> 0x0041 }
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            com.facebook.proxygen.RequestStatsObserver r2 = r4.A06     // Catch:{ all -> 0x0044 }
            com.facebook.proxygen.RequestStats r0 = r2.getRequestStats()     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x002f
            r3.A00(r0)     // Catch:{ all -> 0x0044 }
        L_0x002f:
            r1 = 0
            X.1QS r0 = r4.A07     // Catch:{ all -> 0x0044 }
            X.C11410SSi.A03(r1, r2, r0)     // Catch:{ all -> 0x0044 }
            X.1C6 r1 = r4.A04     // Catch:{ all -> 0x0044 }
            X.1C5 r0 = r4.A05     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x004a
            if (r1 == 0) goto L_0x004a
            r0.A00(r1)     // Catch:{ all -> 0x0044 }
            return
        L_0x0041:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            throw r0     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r1 = move-exception
            java.lang.String r0 = "error_on_eom"
            X.0wb.A07(r0, r1)
        L_0x004a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12198Son.onEOM():void");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void onError(com.facebook.proxygen.HTTPRequestError r5) {
        /*
            r4 = this;
            X.Pxe.A1G()
            java.lang.Object r3 = r4.A09
            monitor-enter(r3)
            if (r5 != 0) goto L_0x0013
            com.facebook.proxygen.HTTPRequestError$HTTPRequestStage r2 = com.facebook.proxygen.HTTPRequestError.HTTPRequestStage.Unknown     // Catch:{ all -> 0x004b }
            com.facebook.proxygen.HTTPRequestError$ProxygenError r1 = com.facebook.proxygen.HTTPRequestError.ProxygenError.Unknown     // Catch:{ all -> 0x004b }
            java.lang.String r0 = "Error is null"
            com.facebook.proxygen.HTTPRequestError r5 = new com.facebook.proxygen.HTTPRequestError     // Catch:{ all -> 0x004b }
            r5.<init>(r0, r2, r1)     // Catch:{ all -> 0x004b }
        L_0x0013:
            com.facebook.proxygen.HTTPRequestError$ProxygenError r2 = r5.mErrCode     // Catch:{ all -> 0x004b }
            com.facebook.proxygen.HTTPRequestError$ProxygenError r0 = com.facebook.proxygen.HTTPRequestError.ProxygenError.Canceled     // Catch:{ all -> 0x004b }
            X.S28 r1 = r4.A08     // Catch:{ all -> 0x004b }
            if (r2 != r0) goto L_0x0039
            java.lang.String r0 = "cancelled"
        L_0x001d:
            r1.A00 = r0     // Catch:{ all -> 0x004b }
            com.facebook.proxygen.RequestStatsObserver r2 = r4.A06     // Catch:{ all -> 0x004b }
            com.facebook.proxygen.RequestStats r0 = r2.getRequestStats()     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x002a
            r1.A00(r0)     // Catch:{ all -> 0x004b }
        L_0x002a:
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y     // Catch:{ all -> 0x004b }
            r4.A0B = r0     // Catch:{ all -> 0x004b }
            X.RCa r0 = new X.RCa     // Catch:{ all -> 0x004b }
            r0.<init>(r5)     // Catch:{ all -> 0x004b }
            r4.A01 = r0     // Catch:{ all -> 0x004b }
            X.RCp r1 = r4.A02     // Catch:{ all -> 0x004b }
            monitor-enter(r1)     // Catch:{ all -> 0x004b }
            goto L_0x003c
        L_0x0039:
            java.lang.String r0 = "error"
            goto L_0x001d
        L_0x003c:
            r1.A00 = r0     // Catch:{ all -> 0x0048 }
            r1.notifyAll()     // Catch:{ all -> 0x0048 }
            monitor-exit(r1)     // Catch:{ all -> 0x004b }
            X.1QS r0 = r4.A07     // Catch:{ all -> 0x004b }
            X.C11410SSi.A03(r5, r2, r0)     // Catch:{ all -> 0x004b }
            goto L_0x0051
        L_0x0048:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x004b }
            throw r0     // Catch:{ all -> 0x004b }
        L_0x004b:
            r1 = move-exception
            java.lang.String r0 = "error_on_error"
            X.0wb.A07(r0, r1)     // Catch:{ all -> 0x0056 }
        L_0x0051:
            r3.notifyAll()     // Catch:{ all -> 0x005b }
            monitor-exit(r3)     // Catch:{ all -> 0x005b }
            return
        L_0x0056:
            r0 = move-exception
            r3.notifyAll()     // Catch:{ all -> 0x005b }
            throw r0     // Catch:{ all -> 0x005b }
        L_0x005b:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x005b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12198Son.onError(com.facebook.proxygen.HTTPRequestError):void");
    }
}
