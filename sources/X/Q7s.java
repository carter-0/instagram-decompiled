package X;

import android.os.Handler;
import android.os.Looper;

public final class Q7s extends Handler {
    public boolean A00;
    public final /* synthetic */ WM9 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Q7s(Looper looper, WM9 wm9) {
        super(looper);
        this.A01 = wm9;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.lang.Exception} */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void handleMessage(android.os.Message r14) {
        /*
            r13 = this;
            java.lang.Object r3 = r14.obj
            X.Rum r3 = (X.C10592Rum) r3
            int r0 = r14.what     // Catch:{ RCK -> 0x0180, Exception -> 0x01a6 }
            if (r0 == 0) goto L_0x00f4
            r8 = 1
            if (r0 != r8) goto L_0x00ed
            X.WM9 r0 = r13.A01     // Catch:{ RCK -> 0x0180, Exception -> 0x01a6 }
            X.Tan r2 = r0.A0D     // Catch:{ RCK -> 0x0180, Exception -> 0x01a6 }
            java.lang.Object r0 = r3.A01     // Catch:{ RCK -> 0x0180, Exception -> 0x01a6 }
            X.VLt r0 = (X.C17189VLt) r0     // Catch:{ RCK -> 0x0180, Exception -> 0x01a6 }
            X.SwH r2 = (X.SwH) r2     // Catch:{ RCK -> 0x0180, Exception -> 0x01a6 }
            byte[] r0 = r0.A00     // Catch:{ RCK -> 0x0180, Exception -> 0x01a6 }
            r6 = 0
            java.lang.String r1 = android.util.Base64.encodeToString(r0, r6)     // Catch:{ RCK -> 0x0180, Exception -> 0x01a6 }
            java.lang.String r5 = r2.A01     // Catch:{ RCK -> 0x0180, Exception -> 0x01a6 }
            X.28S r0 = r2.A00     // Catch:{ RCK -> 0x0180, Exception -> 0x01a6 }
            java.util.concurrent.atomic.AtomicReference r0 = r0.A00     // Catch:{ RCK -> 0x0180, Exception -> 0x01a6 }
            java.lang.Object r0 = r0.get()     // Catch:{ RCK -> 0x0180, Exception -> 0x01a6 }
            X.2CG r0 = (X.2CG) r0     // Catch:{ RCK -> 0x0180, Exception -> 0x01a6 }
            if (r0 == 0) goto L_0x0174
            java.lang.ref.WeakReference r0 = r0.A00     // Catch:{ RemoteException -> 0x0164 }
            java.lang.Object r7 = r0.get()     // Catch:{ RemoteException -> 0x0164 }
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7     // Catch:{ RemoteException -> 0x0164 }
            java.lang.String r4 = ""
            if (r7 == 0) goto L_0x00d5
            X.0qQ.A0B(r5, r6)     // Catch:{ RemoteException -> 0x0164 }
            X.0qQ.A0B(r1, r8)     // Catch:{ RemoteException -> 0x0164 }
            java.lang.String r0 = "\n"
            java.lang.String r2 = X.Pxf.A0d(r1, r0, r4)     // Catch:{ RemoteException -> 0x0164 }
            X.2IS r8 = X.C41845B3m.A04()     // Catch:{ RemoteException -> 0x0164 }
            java.lang.String r1 = "WIDEVINE"
            java.lang.String r0 = "license_type"
            r8.A04(r0, r1)     // Catch:{ RemoteException -> 0x0164 }
            java.lang.String r0 = "video_id"
            r8.A04(r0, r5)     // Catch:{ RemoteException -> 0x0164 }
            java.lang.String r0 = "request"
            r8.A04(r0, r2)     // Catch:{ RemoteException -> 0x0164 }
            java.lang.Class<X.QNt> r2 = X.C7603QNt.class
            java.lang.String r1 = "VideoLicenseQuery"
            X.3Fa r0 = new X.3Fa     // Catch:{ RemoteException -> 0x0164 }
            r0.<init>(r8, r2, r1, r6)     // Catch:{ RemoteException -> 0x0164 }
            r1 = 0
            X.Pxe.A1G()     // Catch:{ Exception -> 0x00d1 }
            X.3Fb r9 = new X.3Fb     // Catch:{ Exception -> 0x00d1 }
            r9.<init>(r7)     // Catch:{ Exception -> 0x00d1 }
            r9.A08(r0)     // Catch:{ Exception -> 0x00d1 }
            X.3Fc r2 = r9.A01     // Catch:{ Exception -> 0x00d1 }
            if (r2 == 0) goto L_0x00c3
            X.0lg r8 = r9.A00     // Catch:{ Exception -> 0x00d1 }
            if (r8 == 0) goto L_0x00ca
            X.3Fe r10 = r9.A02     // Catch:{ Exception -> 0x00d1 }
            if (r10 == 0) goto L_0x00be
            java.net.URI r0 = X.1Ma.A06()     // Catch:{ Exception -> 0x00d1 }
            java.lang.String r12 = r0.toASCIIString()     // Catch:{ Exception -> 0x00d1 }
            X.3Fh r0 = X.C239173Fg.A00()     // Catch:{ Exception -> 0x00d1 }
            java.lang.String r11 = r2.A01     // Catch:{ Exception -> 0x00d1 }
            java.lang.String r0 = r0.clientDocIdForQuery(r11)     // Catch:{ Exception -> 0x00d1 }
            X.1Fc r7 = X.C239123Fb.A01(r9, r0)     // Catch:{ Exception -> 0x00d1 }
            java.lang.String r2 = r2.A02     // Catch:{ Exception -> 0x00d1 }
            if (r2 == 0) goto L_0x009a
            java.lang.String r0 = "variables"
            r7.A05(r0, r2)     // Catch:{ Exception -> 0x00d1 }
        L_0x009a:
            X.0qQ.A0A(r12)     // Catch:{ Exception -> 0x00d1 }
            X.1XR r0 = X.C239123Fb.A02(r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x00d1 }
            if (r0 == 0) goto L_0x00dc
            X.3JC r0 = (X.AnonymousClass3JC) r0     // Catch:{ RemoteException -> 0x0164 }
            java.lang.Object r2 = r0.A01     // Catch:{ RemoteException -> 0x0164 }
            X.QNt r2 = (X.C7603QNt) r2     // Catch:{ RemoteException -> 0x0164 }
            if (r2 == 0) goto L_0x00dc
            java.lang.Class<X.QNs> r1 = X.C7602QNs.class
            java.lang.String r0 = "fb_video_license"
            X.3FZ r1 = r2.A00(r1, r0)     // Catch:{ RemoteException -> 0x0164 }
            X.QNs r1 = (X.C7602QNs) r1     // Catch:{ RemoteException -> 0x0164 }
            if (r1 == 0) goto L_0x00dc
            java.lang.String r0 = "license"
            java.lang.String r1 = r1.A05(r0)     // Catch:{ RemoteException -> 0x0164 }
            goto L_0x00d1
        L_0x00be:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ Exception -> 0x00d1 }
            goto L_0x00d0
        L_0x00c3:
            java.lang.String r0 = "GraphQLQuery required for GraphQL call"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ Exception -> 0x00d1 }
            goto L_0x00d0
        L_0x00ca:
            java.lang.String r0 = "Session required for IG GraphQL call"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ Exception -> 0x00d1 }
        L_0x00d0:
            throw r0     // Catch:{ Exception -> 0x00d1 }
        L_0x00d1:
            if (r1 == 0) goto L_0x00dc
            r4 = r1
            goto L_0x00dc
        L_0x00d5:
            java.lang.String r1 = "IgHeroServiceController"
            java.lang.String r0 = "getVideoLicense has a null UserSession"
            X.0wb.A03(r1, r0)     // Catch:{ RemoteException -> 0x0164 }
        L_0x00dc:
            java.lang.Object[] r2 = new java.lang.Object[]{r5, r4}     // Catch:{ RCK -> 0x0180, Exception -> 0x01a6 }
            java.lang.String r1 = "DrmSessionManagerHelper"
            java.lang.String r0 = "License for video %s is %s"
            X.27B.A01(r1, r0, r2)     // Catch:{ RCK -> 0x0180, Exception -> 0x01a6 }
            byte[] r4 = android.util.Base64.decode(r4, r6)     // Catch:{ RCK -> 0x0180, Exception -> 0x01a6 }
            goto L_0x01ae
        L_0x00ed:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ RCK -> 0x0180, Exception -> 0x01a6 }
            r1.<init>()     // Catch:{ RCK -> 0x0180, Exception -> 0x01a6 }
            goto L_0x017f
        L_0x00f4:
            java.lang.Object r0 = r3.A01     // Catch:{ RCK -> 0x0180, Exception -> 0x01a6 }
            X.RsY r0 = (X.C10457RsY) r0     // Catch:{ RCK -> 0x0180, Exception -> 0x01a6 }
            r5 = 1
            r8 = 0
            java.lang.String r6 = "DrmSessionManagerHelper"
            java.lang.String r4 = r0.A00     // Catch:{ RCK -> 0x0180, Exception -> 0x01a6 }
            java.lang.String r2 = "&signedRequest="
            byte[] r1 = r0.A01     // Catch:{ RCK -> 0x0180, Exception -> 0x01a6 }
            java.lang.String r0 = new java.lang.String     // Catch:{ RCK -> 0x0180, Exception -> 0x01a6 }
            r0.<init>(r1)     // Catch:{ RCK -> 0x0180, Exception -> 0x01a6 }
            java.lang.String r1 = X.002.A0g(r4, r2, r0)     // Catch:{ RCK -> 0x0180, Exception -> 0x01a6 }
            java.util.Set r0 = X.C256813wO.A00     // Catch:{ RCK -> 0x0180, Exception -> 0x01a6 }
            java.net.URL r0 = new java.net.URL     // Catch:{ all -> 0x0162 }
            r0.<init>(r1)     // Catch:{ all -> 0x0162 }
            java.net.URLConnection r7 = r0.openConnection()     // Catch:{ all -> 0x0162 }
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = "POST"
            r7.setRequestMethod(r0)     // Catch:{ all -> 0x015b }
            r7.setDoOutput(r8)     // Catch:{ all -> 0x015b }
            r7.setDoInput(r5)     // Catch:{ all -> 0x015b }
            r0 = -522635980(0xffffffffe0d93534, float:-1.2521179E20)
            X.0fV r5 = X.0fi.A00(r7, r0)     // Catch:{ all -> 0x015b }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r4 = new byte[r0]     // Catch:{ all -> 0x0156 }
            java.io.ByteArrayOutputStream r2 = X.Pxe.A0b()     // Catch:{ all -> 0x0156 }
        L_0x0132:
            int r1 = r5.read(r4)     // Catch:{ all -> 0x0156 }
            r0 = -1
            if (r1 == r0) goto L_0x013d
            r2.write(r4, r8, r1)     // Catch:{ all -> 0x0156 }
            goto L_0x0132
        L_0x013d:
            byte[] r4 = r2.toByteArray()     // Catch:{ all -> 0x0156 }
            r5.close()     // Catch:{ all -> 0x015b }
            r7.disconnect()     // Catch:{ RCK -> 0x0180, Exception -> 0x01a6 }
            java.lang.String r0 = new java.lang.String     // Catch:{ RCK -> 0x0180, Exception -> 0x01a6 }
            r0.<init>(r4)     // Catch:{ RCK -> 0x0180, Exception -> 0x01a6 }
            java.lang.Object[] r1 = new java.lang.Object[]{r0}     // Catch:{ RCK -> 0x0180, Exception -> 0x01a6 }
            java.lang.String r0 = "Provisioning data from http is %s"
            X.27B.A01(r6, r0, r1)     // Catch:{ RCK -> 0x0180, Exception -> 0x01a6 }
            goto L_0x01ae
        L_0x0156:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x015b }
            throw r0     // Catch:{ all -> 0x015b }
        L_0x015b:
            r1 = move-exception
            if (r7 == 0) goto L_0x017f
            r7.disconnect()     // Catch:{ RCK -> 0x0180, Exception -> 0x01a6 }
            goto L_0x017f
        L_0x0162:
            r1 = move-exception
            goto L_0x017f
        L_0x0164:
            r4 = move-exception
            java.lang.String r2 = "DrmKeyRequestCallback"
            java.lang.Object[] r1 = new java.lang.Object[]{r5}     // Catch:{ RCK -> 0x0180, Exception -> 0x01a6 }
            java.lang.String r0 = "Failed to get video license for %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ RCK -> 0x0180, Exception -> 0x01a6 }
            android.util.Log.e(r2, r0, r4)     // Catch:{ RCK -> 0x0180, Exception -> 0x01a6 }
        L_0x0174:
            java.lang.String r0 = "Failed to get license for video "
            java.lang.String r0 = X.002.A0R(r0, r5)     // Catch:{ RCK -> 0x0180, Exception -> 0x01a6 }
            java.lang.Exception r1 = new java.lang.Exception     // Catch:{ RCK -> 0x0180, Exception -> 0x01a6 }
            r1.<init>(r0)     // Catch:{ RCK -> 0x0180, Exception -> 0x01a6 }
        L_0x017f:
            throw r1     // Catch:{ RCK -> 0x0180, Exception -> 0x01a6 }
        L_0x0180:
            r4 = move-exception
            java.lang.Object r1 = r14.obj
            X.Rum r1 = (X.C10592Rum) r1
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x01ae
            int r0 = r1.A00
            int r2 = r0 + 1
            r1.A00 = r2
            X.WM9 r0 = r13.A01
            X.4Sm r0 = r0.A0E
            X.4Sl r0 = (X.C265074Sl) r0
            int r1 = r0.A00
            r0 = -1
            if (r1 != r0) goto L_0x019b
            r1 = 3
        L_0x019b:
            if (r2 > r1) goto L_0x01ae
            java.util.concurrent.atomic.AtomicLong r0 = X.AnonymousClass4Y0.A03
            java.lang.String r0 = "dataSpec"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x01a6:
            r4 = move-exception
            java.lang.String r1 = "DefaultDrmSession"
            java.lang.String r0 = "Key/provisioning request produced an unexpected exception. Not retrying."
            X.2AG.A06(r1, r0, r4)
        L_0x01ae:
            X.WM9 r1 = r13.A01
            monitor-enter(r13)
            boolean r0 = r13.A00     // Catch:{ all -> 0x01c4 }
            if (r0 != 0) goto L_0x01c2
            X.U1o r2 = r1.A0B     // Catch:{ all -> 0x01c4 }
            int r1 = r14.what     // Catch:{ all -> 0x01c4 }
            java.lang.Object r0 = r3.A01     // Catch:{ all -> 0x01c4 }
            android.util.Pair r0 = android.util.Pair.create(r0, r4)     // Catch:{ all -> 0x01c4 }
            X.Pxe.A1N(r2, r0, r1)     // Catch:{ all -> 0x01c4 }
        L_0x01c2:
            monitor-exit(r13)     // Catch:{ all -> 0x01c4 }
            return
        L_0x01c4:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x01c4 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q7s.handleMessage(android.os.Message):void");
    }
}
