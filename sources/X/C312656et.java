package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.6et  reason: invalid class name and case insensitive filesystem */
public final class C312656et {
    public static final int FACE_TRACKING_PYTORCH_NMLML_MIN_VERSION = 15000;
    public static final String PYTORCH_VOLTRON_MODULE_NAME = "pytorch";
    public C312576ei A00;
    public List A01;
    public final Map A02;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0068, code lost:
        if (r1 == null) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006a, code lost:
        r8.add(r1);
        r6 = r6 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Collection getVoltronModulesForManifest(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            if (r11 == 0) goto L_0x0098
            int r0 = r11.length()
            if (r0 <= 0) goto L_0x0098
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.List r9 = r10.A01
            X.6ei r2 = r10.A00
            boolean r0 = com.facebook.cameracore.mediapipeline.arengineservices.utils.ManifestUtils.forceSOLoad
            r1 = 1
            X.0qQ.A0B(r12, r1)
            r0 = 2
            X.0qQ.A0B(r9, r0)
            r0 = 3
            X.0qQ.A0B(r2, r0)
            boolean r0 = com.facebook.cameracore.mediapipeline.arengineservices.utils.ManifestUtils.forceSOLoad
            if (r0 != 0) goto L_0x0025
            com.facebook.cameracore.mediapipeline.arengineservices.utils.ManifestUtils.forceSOLoad = r1
        L_0x0025:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            com.facebook.cameracore.mediapipeline.services.experimentconfig.implementation.common.ARExperimentConfigImpl r5 = new com.facebook.cameracore.mediapipeline.services.experimentconfig.implementation.common.ARExperimentConfigImpl
            r5.<init>(r2)
            int r0 = r9.size()
            int[] r3 = new int[r0]
            int r2 = r9.size()
            r1 = 0
        L_0x003a:
            if (r1 >= r2) goto L_0x0049
            java.lang.Object r0 = r9.get(r1)
            X.6eR r0 = (X.C312446eR) r0
            int r0 = r0.A00
            r3[r1] = r0
            int r1 = r1 + 1
            goto L_0x003a
        L_0x0049:
            int[] r7 = com.facebook.cameracore.mediapipeline.arengineservices.utils.ManifestUtils.filterNeededServicesNative(r11, r12, r3, r5)
            r6 = 0
            int r5 = r7.length
        L_0x004f:
            if (r6 >= r5) goto L_0x0078
            r3 = r7[r6]
            java.util.Iterator r2 = r9.iterator()
        L_0x0057:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0070
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.6eR r0 = (X.C312446eR) r0
            int r0 = r0.A00
            if (r0 != r3) goto L_0x0057
            if (r1 == 0) goto L_0x0070
            r8.add(r1)
            int r6 = r6 + 1
            goto L_0x004f
        L_0x0070:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0078:
            java.util.Iterator r3 = r8.iterator()
        L_0x007c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00b7
            java.lang.Object r2 = r3.next()
            java.util.Map r1 = r10.A02
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L_0x007c
            java.lang.Object r0 = r1.get(r2)
            java.util.Collection r0 = (java.util.Collection) r0
            r4.addAll(r0)
            goto L_0x007c
        L_0x0098:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.Map r0 = r10.A02
            java.util.Collection r0 = r0.values()
            java.util.Iterator r1 = r0.iterator()
        L_0x00a7:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00b7
            java.lang.Object r0 = r1.next()
            java.util.Collection r0 = (java.util.Collection) r0
            r4.addAll(r0)
            goto L_0x00a7
        L_0x00b7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C312656et.getVoltronModulesForManifest(java.lang.String, java.lang.String):java.util.Collection");
    }

    public C312656et(C312576ei r3, Map map) {
        this.A02 = map;
        this.A01 = new ArrayList(map.keySet());
        this.A00 = r3;
    }
}
