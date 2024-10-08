package X;

import com.facebook.proxygen.TraceFieldType;

public final class PIB implements C358108aN {
    public final /* synthetic */ 02m A00;
    public final /* synthetic */ AnonymousClass14Y A01;

    public final void onFailure(String str, boolean z) {
        0qQ.A0B(str, 0);
        0KC.A0O("proxy_service", "Unable to download ProxyService module, errorMessage=%s.", new Object[]{str});
        02m r3 = this.A00;
        r3.markerAnnotate(79499422, TraceFieldType.FailureReason, "download_failed");
        r3.markerAnnotate(79499422, "voltron_failure_reason", str);
        r3.markerEnd(79499422, 3);
    }

    public PIB(02m r1, AnonymousClass14Y r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0059, code lost:
        r5 = r11.A01;
        r3.markerPoint(79499422, "loaded_library");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        X.0KC.A0D("proxy_service", "Start proxying.");
        r1.A04.startTunneling("");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006e, code lost:
        X.0KC.A0G("proxy_service", "Error while starting Psiphon Tunnel.", r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSuccess() {
        /*
            r11 = this;
            java.lang.String r4 = "proxy_service"
            java.lang.String r0 = "Successfully downloaded ProxyService module."
            X.0KC.A0D(r4, r0)
            X.02m r3 = r11.A00
            r2 = 79499422(0x4bd109e, float:4.4448947E-36)
            java.lang.String r0 = "downloaded_service"
            r3.markerPoint(r2, r0)
            X.0nE r1 = X.C61410nE.A00
            X.0nO r0 = X.0nY.A00()
            X.0qQ.A07(r0)
            r10 = 1
            X.0qQ.A0B(r1, r10)
            X.0vD r6 = new X.0vD
            r6.<init>(r1, r0)
            r7 = 201569894(0xc03b666, float:1.0146761E-31)
            r8 = 3
            r9 = 0
            X.0nQ r5 = new X.0nQ
            r5.<init>(r6, r7, r8, r9, r10)
            X.TSb r6 = new X.TSb
            r6.<init>(r5)
            X.O1b r5 = X.NC3.A05
            monitor-enter(r5)
            java.lang.String r0 = "Building proxy service."
            X.0KC.A0D(r4, r0)     // Catch:{ all -> 0x009f }
            boolean r0 = X.NC3.A04     // Catch:{ all -> 0x009f }
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = "Cancel due to user already has external connectivity."
            X.0KC.A0D(r4, r0)     // Catch:{ all -> 0x009f }
            java.lang.String r1 = "cancel_reason"
            java.lang.String r0 = "connection_race"
            r3.markerAnnotate(r2, r1, r0)     // Catch:{ all -> 0x009f }
            java.lang.String r0 = "connection_probe_won_race"
            r3.markerAnnotate(r2, r0, r10)     // Catch:{ all -> 0x009f }
            r0 = 4
            goto L_0x009a
        L_0x0051:
            X.NC3 r1 = new X.NC3     // Catch:{ UnsatisfiedLinkError -> 0x008c, Exception -> 0x007e }
            r1.<init>(r6, r3)     // Catch:{ UnsatisfiedLinkError -> 0x008c, Exception -> 0x007e }
            X.NC3.A03 = r1     // Catch:{ UnsatisfiedLinkError -> 0x008c, Exception -> 0x007e }
            monitor-exit(r5)
            X.14Y r5 = r11.A01
            java.lang.String r0 = "loaded_library"
            r3.markerPoint(r2, r0)
            java.lang.String r0 = "Start proxying."
            X.0KC.A0D(r4, r0)     // Catch:{ Exception -> 0x006d }
            ca.psiphon.PsiphonTunnel r1 = r1.A04     // Catch:{ Exception -> 0x006d }
            java.lang.String r0 = ""
            r1.startTunneling(r0)     // Catch:{ Exception -> 0x006d }
            goto L_0x0073
        L_0x006d:
            r1 = move-exception
            java.lang.String r0 = "Error while starting Psiphon Tunnel."
            X.0KC.A0G(r4, r0, r1)
        L_0x0073:
            X.0t9 r1 = r5.A01
            X.PPz r0 = new X.PPz
            r0.<init>()
            r1.A01(r0)
            return
        L_0x007e:
            r1 = move-exception
            java.lang.String r0 = "Error while building Psiphon Tunnel."
            X.0KC.A0G(r4, r0, r1)     // Catch:{ all -> 0x009f }
            java.lang.String r1 = "failure_reason"
            java.lang.String r0 = "build_tunnel"
            r3.markerAnnotate(r2, r1, r0)     // Catch:{ all -> 0x009f }
            goto L_0x0099
        L_0x008c:
            r1 = move-exception
            java.lang.String r0 = "Error loading libraries."
            X.0KC.A0G(r4, r0, r1)     // Catch:{ all -> 0x009f }
            java.lang.String r1 = "failure_reason"
            java.lang.String r0 = "load_library"
            r3.markerAnnotate(r2, r1, r0)     // Catch:{ all -> 0x009f }
        L_0x0099:
            r0 = 3
        L_0x009a:
            r3.markerEnd(r2, r0)     // Catch:{ all -> 0x009f }
            monitor-exit(r5)
            return
        L_0x009f:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PIB.onSuccess():void");
    }
}
