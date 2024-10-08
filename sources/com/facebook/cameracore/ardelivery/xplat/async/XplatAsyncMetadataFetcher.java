package com.facebook.cameracore.ardelivery.xplat.async;

import X.0qQ;
import X.C10665Rvz;
import X.C313006fb;
import X.C313016fc;
import X.C371138xf;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;

public final class XplatAsyncMetadataFetcher {
    public C313016fc metadataDownloader;

    public XplatAsyncMetadataFetcher(C313016fc r2) {
        0qQ.A0B(r2, 1);
        this.metadataDownloader = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008e, code lost:
        if (r10.equals(r11.get(r8)) != false) goto L_0x0090;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void fetchAsyncAssetMetadata(java.lang.String r18, java.lang.String r19, com.facebook.cameracore.ardelivery.xplat.async.XplatAsyncMetadataCompletionCallback r20) {
        /*
            r17 = this;
            r0 = 0
            r7 = r18
            X.0qQ.A0B(r7, r0)
            r0 = 1
            r4 = r19
            X.0qQ.A0B(r4, r0)
            r0 = 2
            r1 = r20
            X.0qQ.A0B(r1, r0)
            r0 = r17
            X.6fc r5 = r0.metadataDownloader
            X.S0H r6 = new X.S0H
            r6.<init>(r1)
            X.6fb r5 = (X.C313006fb) r5
            monitor-enter(r5)
            java.util.Map r0 = r5.A03     // Catch:{ all -> 0x0223 }
            java.lang.Object r0 = r0.get(r7)     // Catch:{ all -> 0x0223 }
            X.Rvz r0 = (X.C10665Rvz) r0     // Catch:{ all -> 0x0223 }
            if (r0 == 0) goto L_0x002b
            r6.A00(r0)     // Catch:{ all -> 0x0223 }
        L_0x002b:
            java.lang.Class<X.CxI> r2 = X.C45482CxI.class
            java.lang.String r1 = "create"
            r3 = 0
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x021c }
            java.lang.reflect.Method r2 = r2.getMethod(r1, r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x021c }
            r1 = 0
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x021c }
            java.lang.Object r3 = r2.invoke(r1, r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x021c }
            X.DFp r3 = (X.C45935DFp) r3     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x021c }
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of(r7)     // Catch:{ all -> 0x0223 }
            X.2IS r2 = r3.A00     // Catch:{ all -> 0x0223 }
            java.lang.String r0 = "block_ids"
            r2.A05(r0, r1)     // Catch:{ all -> 0x0223 }
            r0 = 0
            if (r1 == 0) goto L_0x004e
            r0 = 1
        L_0x004e:
            r3.A02 = r0     // Catch:{ all -> 0x0223 }
            android.content.Context r8 = r5.A00     // Catch:{ all -> 0x0223 }
            X.4wz r1 = r5.A02     // Catch:{ all -> 0x0223 }
            java.lang.Class<X.XUP> r16 = X.XUP.class
            monitor-enter(r16)     // Catch:{ all -> 0x0223 }
            java.util.Map r0 = X.C278514x0.A01     // Catch:{ all -> 0x0219 }
            if (r0 != 0) goto L_0x00d6
            java.lang.Object r12 = X.C278514x0.A00     // Catch:{ all -> 0x0219 }
            monitor-enter(r12)     // Catch:{ all -> 0x0219 }
            java.util.Map r0 = X.C278514x0.A01     // Catch:{ all -> 0x00d3 }
            if (r0 != 0) goto L_0x00d1
            java.util.Map r11 = X.C278484wx.A00()     // Catch:{ all -> 0x00d3 }
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ all -> 0x00d3 }
            r9.<init>()     // Catch:{ all -> 0x00d3 }
            java.util.ArrayList r1 = X.C278514x0.A02(r8, r1)     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = "manifest_capabilities"
            r9.put(r0, r1)     // Catch:{ all -> 0x00d3 }
            java.lang.Boolean r10 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00d3 }
            java.lang.String r8 = "etc2_compression"
            java.lang.Object r0 = r11.get(r8)     // Catch:{ all -> 0x00d3 }
            boolean r0 = r10.equals(r0)     // Catch:{ all -> 0x00d3 }
            java.lang.String r1 = "texture_compression"
            if (r0 != 0) goto L_0x0090
            java.lang.String r8 = "pvr_compression"
            java.lang.Object r0 = r11.get(r8)     // Catch:{ all -> 0x00d3 }
            boolean r0 = r10.equals(r0)     // Catch:{ all -> 0x00d3 }
            if (r0 == 0) goto L_0x0093
        L_0x0090:
            r9.put(r1, r8)     // Catch:{ all -> 0x00d3 }
        L_0x0093:
            android.util.Pair r10 = X.C278514x0.A01()     // Catch:{ all -> 0x00d3 }
            android.util.Pair r11 = X.C278514x0.A00()     // Catch:{ all -> 0x00d3 }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ all -> 0x00d3 }
            r8.<init>()     // Catch:{ all -> 0x00d3 }
            java.lang.Object r1 = r11.first     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = "beta_min_version"
            r8.put(r0, r1)     // Catch:{ all -> 0x00d3 }
            java.lang.Object r1 = r11.second     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = "beta_max_version"
            r8.put(r0, r1)     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = "supported_beta_sdk_versions"
            r9.put(r0, r8)     // Catch:{ all -> 0x00d3 }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ all -> 0x00d3 }
            r8.<init>()     // Catch:{ all -> 0x00d3 }
            java.lang.Object r1 = r10.first     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = "min_version"
            r8.put(r0, r1)     // Catch:{ all -> 0x00d3 }
            java.lang.Object r1 = r10.second     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = "max_version"
            r8.put(r0, r1)     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = "supported_sdk_versions"
            r9.put(r0, r8)     // Catch:{ all -> 0x00d3 }
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r9)     // Catch:{ all -> 0x00d3 }
            X.C278514x0.A01 = r0     // Catch:{ all -> 0x00d3 }
        L_0x00d1:
            monitor-exit(r12)     // Catch:{ all -> 0x00d3 }
            goto L_0x00d6
        L_0x00d3:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x00d3 }
            throw r0     // Catch:{ all -> 0x0219 }
        L_0x00d6:
            java.util.Map r10 = X.C278514x0.A01     // Catch:{ all -> 0x0219 }
            X.2IV r9 = new X.2IV     // Catch:{ all -> 0x0219 }
            r9.<init>()     // Catch:{ all -> 0x0219 }
            java.lang.String r1 = "manifest_capabilities"
            java.lang.Object r0 = r10.get(r1)     // Catch:{ all -> 0x0219 }
            r0.getClass()     // Catch:{ all -> 0x0219 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0219 }
            r9.A05(r1, r0)     // Catch:{ all -> 0x0219 }
            X.0K0 r15 = com.facebook.graphql.calls.GraphQlCallInput.A02     // Catch:{ all -> 0x0219 }
            java.lang.String r11 = "supported_sdk_versions"
            java.lang.Object r13 = r10.get(r11)     // Catch:{ all -> 0x0219 }
            r13.getClass()     // Catch:{ all -> 0x0219 }
            java.util.Map r13 = (java.util.Map) r13     // Catch:{ all -> 0x0219 }
            java.lang.String r14 = "min_version"
            java.lang.Object r1 = r13.get(r14)     // Catch:{ all -> 0x0219 }
            java.lang.String r0 = "no minimum version found"
            X.17k.A07(r1, r0)     // Catch:{ all -> 0x0219 }
            java.lang.Double r1 = (java.lang.Double) r1     // Catch:{ all -> 0x0219 }
            X.0Df r8 = r15.A02()     // Catch:{ all -> 0x0219 }
            X.0Df.A00(r8, r1, r14)     // Catch:{ all -> 0x0219 }
            java.lang.String r12 = "max_version"
            java.lang.Object r1 = r13.get(r12)     // Catch:{ all -> 0x0219 }
            java.lang.String r0 = "no maximum version found"
            X.17k.A07(r1, r0)     // Catch:{ all -> 0x0219 }
            java.lang.Double r1 = (java.lang.Double) r1     // Catch:{ all -> 0x0219 }
            X.0Df.A00(r8, r1, r12)     // Catch:{ all -> 0x0219 }
            X.0Df r0 = r9.A02()     // Catch:{ all -> 0x0219 }
            r0.A0E(r8, r11)     // Catch:{ all -> 0x0219 }
            java.lang.String r11 = "supported_beta_sdk_versions"
            java.lang.Object r13 = r10.get(r11)     // Catch:{ all -> 0x0219 }
            r13.getClass()     // Catch:{ all -> 0x0219 }
            java.util.Map r13 = (java.util.Map) r13     // Catch:{ all -> 0x0219 }
            java.lang.String r0 = "beta_min_version"
            java.lang.Object r1 = r13.get(r0)     // Catch:{ all -> 0x0219 }
            java.lang.String r0 = "no minimum beta version found"
            X.17k.A07(r1, r0)     // Catch:{ all -> 0x0219 }
            java.lang.Double r1 = (java.lang.Double) r1     // Catch:{ all -> 0x0219 }
            X.0Df r8 = r15.A02()     // Catch:{ all -> 0x0219 }
            X.0Df.A00(r8, r1, r14)     // Catch:{ all -> 0x0219 }
            java.lang.String r0 = "beta_max_version"
            java.lang.Object r1 = r13.get(r0)     // Catch:{ all -> 0x0219 }
            java.lang.String r0 = "no maximum beta version found"
            X.17k.A07(r1, r0)     // Catch:{ all -> 0x0219 }
            java.lang.Double r1 = (java.lang.Double) r1     // Catch:{ all -> 0x0219 }
            X.0Df.A00(r8, r1, r12)     // Catch:{ all -> 0x0219 }
            X.0Df r0 = r9.A02()     // Catch:{ all -> 0x0219 }
            r0.A0E(r8, r11)     // Catch:{ all -> 0x0219 }
            java.lang.String r8 = "texture_compression"
            java.lang.Object r1 = r10.get(r8)     // Catch:{ all -> 0x0219 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0219 }
            java.lang.String r10 = "etc2_compression"
            boolean r0 = r10.equals(r1)     // Catch:{ all -> 0x0219 }
            if (r0 == 0) goto L_0x016f
            java.lang.String r0 = "ETC"
        L_0x016b:
            r9.A09(r0, r8)     // Catch:{ all -> 0x0219 }
            goto L_0x017d
        L_0x016f:
            java.lang.String r0 = "pvr_compression"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0219 }
            if (r0 == 0) goto L_0x017a
            java.lang.String r0 = "PVR"
            goto L_0x016b
        L_0x017a:
            java.lang.String r0 = "UNCOMPRESSED"
            goto L_0x016b
        L_0x017d:
            monitor-exit(r16)     // Catch:{ all -> 0x0223 }
            java.lang.String r0 = "device_capabilities"
            r2.A00(r9, r0)     // Catch:{ all -> 0x0223 }
            r0 = 1
            r3.A03 = r0     // Catch:{ all -> 0x0223 }
            java.lang.String r1 = "ZIP"
            java.lang.String r0 = "TAR_BROTLI"
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of(r1, r0)     // Catch:{ all -> 0x0223 }
            java.lang.String r0 = "supported_compression_types"
            r2.A05(r0, r1)     // Catch:{ all -> 0x0223 }
            r0 = 0
            if (r1 == 0) goto L_0x0197
            r0 = 1
        L_0x0197:
            r3.A04 = r0     // Catch:{ all -> 0x0223 }
            com.google.common.collect.ImmutableList$Builder r1 = new com.google.common.collect.ImmutableList$Builder     // Catch:{ all -> 0x0223 }
            r1.<init>()     // Catch:{ all -> 0x0223 }
            java.util.Map r9 = X.C278484wx.A00()     // Catch:{ all -> 0x0223 }
            java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0223 }
            java.lang.Object r0 = r9.get(r10)     // Catch:{ all -> 0x0223 }
            boolean r0 = r8.equals(r0)     // Catch:{ all -> 0x0223 }
            if (r0 == 0) goto L_0x01b3
            java.lang.String r0 = "ETC"
            r1.add(r0)     // Catch:{ all -> 0x0223 }
        L_0x01b3:
            java.lang.String r0 = "pvr_compression"
            java.lang.Object r0 = r9.get(r0)     // Catch:{ all -> 0x0223 }
            boolean r0 = r8.equals(r0)     // Catch:{ all -> 0x0223 }
            if (r0 == 0) goto L_0x01c4
            java.lang.String r0 = "PVR"
            r1.add(r0)     // Catch:{ all -> 0x0223 }
        L_0x01c4:
            java.lang.String r0 = "astc_compression"
            java.lang.Object r0 = r9.get(r0)     // Catch:{ all -> 0x0223 }
            boolean r0 = r8.equals(r0)     // Catch:{ all -> 0x0223 }
            if (r0 == 0) goto L_0x01d5
            java.lang.String r0 = "ASTC"
            r1.add(r0)     // Catch:{ all -> 0x0223 }
        L_0x01d5:
            java.lang.String r0 = "none"
            java.lang.Object r0 = r9.get(r0)     // Catch:{ all -> 0x0223 }
            boolean r0 = r8.equals(r0)     // Catch:{ all -> 0x0223 }
            if (r0 == 0) goto L_0x01e6
            java.lang.String r0 = "UNCOMPRESSED"
            r1.add(r0)     // Catch:{ all -> 0x0223 }
        L_0x01e6:
            com.google.common.collect.ImmutableList r1 = r1.build()     // Catch:{ all -> 0x0223 }
            java.lang.String r0 = "supported_texture_formats"
            r2.A05(r0, r1)     // Catch:{ all -> 0x0223 }
            r0 = 0
            if (r1 == 0) goto L_0x01f3
            r0 = 1
        L_0x01f3:
            r3.A05 = r0     // Catch:{ all -> 0x0223 }
            java.lang.String r0 = "effect_id"
            r2.A04(r0, r4)     // Catch:{ all -> 0x0223 }
            X.1Ef r4 = r3.build()     // Catch:{ all -> 0x0223 }
            X.0qQ.A0A(r4)     // Catch:{ all -> 0x0223 }
            r0 = 11
            X.TY5 r3 = new X.TY5     // Catch:{ all -> 0x0223 }
            r3.<init>(r6, r0)     // Catch:{ all -> 0x0223 }
            X.1vo r2 = r5.A01     // Catch:{ all -> 0x0223 }
            X.DFS r1 = new X.DFS     // Catch:{ all -> 0x0223 }
            r1.<init>(r5, r6, r7, r3)     // Catch:{ all -> 0x0223 }
            X.DEp r0 = new X.DEp     // Catch:{ all -> 0x0223 }
            r0.<init>(r3)     // Catch:{ all -> 0x0223 }
            r2.ATL(r0, r1, r4)     // Catch:{ all -> 0x0223 }
            monitor-exit(r5)
            return
        L_0x0219:
            r1 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x0223 }
            goto L_0x0222
        L_0x021c:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0223 }
            r1.<init>(r0)     // Catch:{ all -> 0x0223 }
        L_0x0222:
            throw r1     // Catch:{ all -> 0x0223 }
        L_0x0223:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.ardelivery.xplat.async.XplatAsyncMetadataFetcher.fetchAsyncAssetMetadata(java.lang.String, java.lang.String, com.facebook.cameracore.ardelivery.xplat.async.XplatAsyncMetadataCompletionCallback):void");
    }

    public final XplatAsyncMetadataResponse fetchMetadataFromCache(String str) {
        0qQ.A0B(str, 0);
        C10665Rvz rvz = (C10665Rvz) ((C313006fb) this.metadataDownloader).A03.get(str);
        if (rvz == null) {
            return null;
        }
        String str2 = rvz.A02;
        String str3 = rvz.A00;
        String str4 = rvz.A03;
        C371138xf xplatCompressionType = ARRequestAsset.CompressionMethod.toXplatCompressionType(ARRequestAsset.CompressionMethod.fromString(rvz.A01));
        0qQ.A07(xplatCompressionType);
        return new XplatAsyncMetadataResponse(str2, str3, str4, xplatCompressionType);
    }

    public final void setMetadataDownloader(C313016fc r2) {
        0qQ.A0B(r2, 0);
        this.metadataDownloader = r2;
    }

    public final void clearMetadataCache() {
        ((C313006fb) this.metadataDownloader).A03.clear();
    }

    public final C313016fc getMetadataDownloader() {
        return this.metadataDownloader;
    }
}
