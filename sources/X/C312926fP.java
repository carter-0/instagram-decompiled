package X;

import com.facebook.cameracore.ardelivery.modelmanager.metadataloader.ARModelMetadataDownloader;
import com.facebook.cameracore.ardelivery.util.hardwarebackend.chipset.ChipsetInfoUtil;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.6fP  reason: invalid class name and case insensitive filesystem */
public final class C312926fP implements ARModelMetadataDownloader {
    public final C312516eY A00;
    public final ChipsetInfoUtil A01;
    public final 0lg A02;
    public final Map A03 = Collections.synchronizedMap(new HashMap());
    public final Map A04 = Collections.synchronizedMap(new HashMap());
    public final C312846fG A05;
    public final C312876fJ A06;

    public C312926fP(C312846fG r2, C312876fJ r3, ChipsetInfoUtil chipsetInfoUtil, 0lg r5) {
        this.A02 = r5;
        this.A06 = r3;
        this.A00 = C312506eX.A00(r5);
        this.A05 = r2;
        this.A01 = chipsetInfoUtil;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    /* JADX WARNING: type inference failed for: r1v22, types: [java.lang.Object, X.S1g] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x018d A[Catch:{ NumberFormatException -> 0x0177 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void downloadModelMetadata(java.util.List r13, X.C352728Ep r14, X.DQV r15) {
        /*
            r12 = this;
            int r0 = r13.size()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>(r0)
            java.util.Iterator r11 = r13.iterator()
        L_0x000d:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00b1
            java.lang.Object r5 = r11.next()
            com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest r5 = (com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest) r5
            com.facebook.cameracore.ardelivery.model.VersionedCapability r0 = r5.mCapability
            r4.put(r0, r5)
            X.6fJ r0 = r12.A06
            r1 = 1
            X.6fL r10 = r0.A00
            java.lang.String r6 = r14.A01
            boolean r9 = r14.A02
            com.facebook.cameracore.ardelivery.model.VersionedCapability r0 = r5.mCapability
            java.lang.String r0 = r0.name()
            r8 = 22413317(0x1560005, float:3.9305606E-38)
            if (r9 == 0) goto L_0x0035
            r8 = 22413318(0x1560006, float:3.930561E-38)
        L_0x0035:
            java.lang.Object[] r0 = new java.lang.Object[]{r6, r0}
            int r7 = java.util.Arrays.hashCode(r0)
            com.facebook.quicklog.QuickPerformanceLogger r2 = r10.A02
            boolean r0 = r2.isMarkerOn(r8, r7)
            if (r0 == 0) goto L_0x000d
            java.lang.String r3 = "model_cache_metadata_download_start"
            r2.markerPoint(r8, r7, r3)
            java.lang.String r1 = java.lang.Boolean.toString(r1)
            java.lang.String r0 = "is_model_metadata_downloader_nmlml"
            r2.markerAnnotate(r8, r7, r0, r1)
            X.6fN r1 = r10.A00
            if (r9 != 0) goto L_0x000d
            java.lang.Object r2 = r1.A02
            monitor-enter(r2)
            java.lang.String r0 = r1.A00     // Catch:{ all -> 0x00ae }
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x00ae }
            if (r0 != 0) goto L_0x008b
            java.lang.String r0 = ""
            r1.A00 = r0     // Catch:{ all -> 0x00ae }
            java.util.List r0 = r1.A01     // Catch:{ all -> 0x00ae }
            r0.clear()     // Catch:{ all -> 0x00ae }
            java.util.Map r0 = r1.A08     // Catch:{ all -> 0x00ae }
            r0.clear()     // Catch:{ all -> 0x00ae }
            java.util.Map r0 = r1.A06     // Catch:{ all -> 0x00ae }
            r0.clear()     // Catch:{ all -> 0x00ae }
            java.util.Map r0 = r1.A07     // Catch:{ all -> 0x00ae }
            r0.clear()     // Catch:{ all -> 0x00ae }
            java.util.Map r0 = r1.A05     // Catch:{ all -> 0x00ae }
            r0.clear()     // Catch:{ all -> 0x00ae }
            java.util.Map r0 = r1.A03     // Catch:{ all -> 0x00ae }
            r0.clear()     // Catch:{ all -> 0x00ae }
            java.util.Map r0 = r1.A04     // Catch:{ all -> 0x00ae }
            r0.clear()     // Catch:{ all -> 0x00ae }
            r1.A00 = r6     // Catch:{ all -> 0x00ae }
        L_0x008b:
            java.util.Map r1 = r1.A08     // Catch:{ all -> 0x00ae }
            boolean r0 = r1.containsKey(r5)     // Catch:{ all -> 0x00ae }
            if (r0 != 0) goto L_0x009f
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ all -> 0x00ae }
            r0.<init>()     // Catch:{ all -> 0x00ae }
            java.util.List r0 = java.util.Collections.synchronizedList(r0)     // Catch:{ all -> 0x00ae }
            r1.put(r5, r0)     // Catch:{ all -> 0x00ae }
        L_0x009f:
            java.lang.Object r0 = r1.get(r5)     // Catch:{ all -> 0x00ae }
            r0.getClass()     // Catch:{ all -> 0x00ae }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x00ae }
            r0.add(r3)     // Catch:{ all -> 0x00ae }
            monitor-exit(r2)     // Catch:{ all -> 0x00ae }
            goto L_0x000d
        L_0x00ae:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00ae }
            throw r0
        L_0x00b1:
            X.6eY r2 = r12.A00
            X.6fG r0 = r12.A05
            X.6fF r0 = (X.C312836fF) r0
            android.content.Context r0 = r0.A00
            boolean r0 = X.C61970qY.A0E(r0)
            if (r0 != 0) goto L_0x00d1
            X.S1g r1 = new X.S1g
            r1.<init>()
            java.lang.Integer r0 = X.AnonymousClass05K.A0D
            r1.A00 = r0
            X.RKl r1 = r1.A00()
            r0 = 0
            r15.D5B(r1, r13, r0)
            return
        L_0x00d1:
            java.util.Set r5 = r4.keySet()
            com.google.common.util.concurrent.SettableFuture r3 = new com.google.common.util.concurrent.SettableFuture
            r3.<init>()
            java.util.Map r1 = r12.A04
            monitor-enter(r1)
            boolean r0 = r1.containsKey(r5)     // Catch:{ all -> 0x024f }
            if (r0 == 0) goto L_0x00ec
            java.lang.Object r3 = r1.get(r5)     // Catch:{ all -> 0x024f }
            com.google.common.util.concurrent.ListenableFuture r3 = (com.google.common.util.concurrent.ListenableFuture) r3     // Catch:{ all -> 0x024f }
            monitor-exit(r1)     // Catch:{ all -> 0x024f }
            goto L_0x0218
        L_0x00ec:
            r1.put(r5, r3)     // Catch:{ all -> 0x024f }
            monitor-exit(r1)     // Catch:{ all -> 0x024f }
            r10 = 1
            X.2IV r7 = new X.2IV
            r7.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r0 = "bytecodeVersion"
            r7.A05(r0, r1)
            com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod r0 = com.facebook.cameracore.ardelivery.model.ARRequestAsset.CompressionMethod.TAR_BROTLI
            java.lang.String r1 = r0.getCompressionMethod()
            com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod r0 = com.facebook.cameracore.ardelivery.model.ARRequestAsset.CompressionMethod.NONE
            java.lang.String r0 = r0.getCompressionMethod()
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of(r1, r0)
            java.lang.String r0 = "supportedCompressions"
            r7.A05(r0, r1)
            X.6eX r2 = (X.C312506eX) r2
            X.0lg r6 = r2.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316765986230909(0x8105e80000127d, double:3.0302072733467896E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x01a6
            com.facebook.cameracore.ardelivery.util.hardwarebackend.chipset.ChipsetInfoUtil r1 = r12.A01
            if (r1 == 0) goto L_0x01a6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Map r9 = r12.A03
            monitor-enter(r9)
            java.lang.String r8 = "VULKAN"
            java.lang.Object r0 = r9.get(r8)     // Catch:{ all -> 0x0198 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0198 }
            if (r0 == 0) goto L_0x0151
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0198 }
            if (r0 == 0) goto L_0x014f
            X.2IV r1 = new X.2IV     // Catch:{ all -> 0x0198 }
            r1.<init>()     // Catch:{ all -> 0x0198 }
            java.lang.String r0 = "hardwareBackend"
            r1.A09(r8, r0)     // Catch:{ all -> 0x0198 }
        L_0x014c:
            r6.add(r1)     // Catch:{ all -> 0x0198 }
        L_0x014f:
            monitor-exit(r9)     // Catch:{ all -> 0x0198 }
            goto L_0x019b
        L_0x0151:
            java.util.Map r11 = r1.getVulkanInfo()     // Catch:{ all -> 0x0198 }
            java.lang.String r0 = "vk_platform_dlopen"
            java.lang.Object r1 = r11.get(r0)     // Catch:{ all -> 0x0198 }
            java.lang.String r0 = "vk_device_count"
            java.lang.Object r0 = r11.get(r0)     // Catch:{ all -> 0x0198 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0198 }
            if (r1 == 0) goto L_0x017f
            if (r0 == 0) goto L_0x017f
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0177 }
            if (r0 < r10) goto L_0x017f
            java.lang.String r0 = "success"
            boolean r1 = r1.equals(r0)     // Catch:{ NumberFormatException -> 0x0177 }
            r0 = 1
            if (r1 != 0) goto L_0x0180
            goto L_0x017f
        L_0x0177:
            r10 = move-exception
            java.lang.String r1 = "HardwareBackendUtil"
            java.lang.String r0 = "Vulkan device count failed to be parsed"
            X.0KC.A0G(r1, r0, r10)     // Catch:{ all -> 0x0198 }
        L_0x017f:
            r0 = 0
        L_0x0180:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0198 }
            r9.put(r8, r0)     // Catch:{ all -> 0x0198 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0198 }
            if (r0 == 0) goto L_0x014f
            X.2IV r1 = new X.2IV     // Catch:{ all -> 0x0198 }
            r1.<init>()     // Catch:{ all -> 0x0198 }
            java.lang.String r0 = "hardwareBackend"
            r1.A09(r8, r0)     // Catch:{ all -> 0x0198 }
            goto L_0x014c
        L_0x0198:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0198 }
            throw r0
        L_0x019b:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x01a6
            java.lang.String r0 = "supportedHardwareBackends"
            r7.A05(r0, r6)
        L_0x01a6:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Set r0 = r4.entrySet()
            java.util.Iterator r8 = r0.iterator()
        L_0x01b3:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x01da
            java.lang.Object r1 = r8.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r0 = r1.getKey()
            com.facebook.cameracore.ardelivery.model.VersionedCapability r0 = (com.facebook.cameracore.ardelivery.model.VersionedCapability) r0
            r1.getValue()
            X.2IV r6 = new X.2IV
            r6.<init>()
            java.lang.String r1 = r0.name()
            java.lang.String r0 = "name"
            r6.A09(r1, r0)
            r9.add(r6)
            goto L_0x01b3
        L_0x01da:
            X.0lg r6 = r12.A02
            com.instagram.common.session.UserSession r8 = X.0Gl.A01(r6)
            if (r8 != 0) goto L_0x0223
            r0 = 36314485362592366(0x8103d5003d0a6e, double:3.028764997774441E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 != 0) goto L_0x0223
            X.DGD r2 = X.CU6.A00()
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r9)
            r2.A00(r0)
            X.2IS r1 = r2.A00
            java.lang.String r0 = "client_capability_metadata"
            r1.A00(r7, r0)
            X.1Ef r1 = r2.build()
            X.3Fb r0 = X.C46479Dfi.A01(r6)
            r0.A08(r1)
            X.1OC r1 = r0.A06()
            X.9j1 r0 = new X.9j1
            r0.<init>(r12, r3, r4, r5)
            r1.A00 = r0
            X.1ES.A03(r1)
        L_0x0218:
            X.DGb r1 = new X.DGb
            r1.<init>(r15, r12, r13)
            X.1Lf r0 = X.1Lf.A01
            X.C255183ti.A04(r1, r3, r0)
            return
        L_0x0223:
            X.DGD r2 = X.CU6.A00()
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r9)
            r2.A00(r0)
            X.2IS r1 = r2.A00
            java.lang.String r0 = "client_capability_metadata"
            r1.A00(r7, r0)
            X.1Ef r2 = r2.build()
            if (r8 == 0) goto L_0x0248
            X.1vn r1 = X.1vm.A01(r8)
        L_0x023f:
            X.9j1 r0 = new X.9j1
            r0.<init>(r12, r3, r4, r5)
            r1.A06(r2, r0)
            goto L_0x0218
        L_0x0248:
            X.0aP r6 = (X.AnonymousClass0aP) r6
            X.1vn r1 = X.1vm.A00(r6)
            goto L_0x023f
        L_0x024f:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x024f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C312926fP.downloadModelMetadata(java.util.List, X.8Ep, X.DQV):void");
    }
}
