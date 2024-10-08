package X;

import java.util.Comparator;

/* renamed from: X.WqD  reason: case insensitive filesystem */
public final class C20373WqD implements Comparator {
    public final int A00;

    public C20373WqD(int i) {
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0175, code lost:
        return r4 - r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001d, code lost:
        return X.29b.A00(r4, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ int compare(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x00bd;
                case 1: goto L_0x00f1;
                case 2: goto L_0x010f;
                case 3: goto L_0x0118;
                case 4: goto L_0x0137;
                case 5: goto L_0x001e;
                case 6: goto L_0x003d;
                case 7: goto L_0x0152;
                case 8: goto L_0x008b;
                case 9: goto L_0x0161;
                case 10: goto L_0x009d;
                case 11: goto L_0x00af;
                case 12: goto L_0x016c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r7 = (java.lang.String) r7
            int r0 = r7.length()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.String r8 = (java.lang.String) r8
            int r0 = r8.length()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0019:
            int r4 = X.29b.A00(r4, r0)
            return r4
        L_0x001e:
            X.JwM r7 = (X.C61084JwM) r7
            java.lang.Object r0 = r7.A00
            X.X8K r0 = (X.X8K) r0
            long r2 = r0.C7M()
            long r0 = -r2
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            X.JwM r8 = (X.C61084JwM) r8
            java.lang.Object r0 = r8.A00
            X.X8K r0 = (X.X8K) r0
            long r2 = r0.C7M()
            long r0 = -r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x0019
        L_0x003d:
            X.JwM r7 = (X.C61084JwM) r7
            r5 = 0
            X.0qQ.A0B(r7, r5)
            java.lang.Object r0 = r7.A00
            X.X8K r0 = (X.X8K) r0
            long r2 = r0.C7M()
            java.lang.Object r0 = r7.A02
            X.X8K r0 = (X.X8K) r0
            if (r0 == 0) goto L_0x0085
            long r0 = r0.C7M()
        L_0x0055:
            long r2 = java.lang.Math.min(r2, r0)
            long r0 = -r2
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            X.JwM r8 = (X.C61084JwM) r8
            X.0qQ.A0B(r8, r5)
            java.lang.Object r0 = r8.A00
            X.X8K r0 = (X.X8K) r0
            long r2 = r0.C7M()
            java.lang.Object r0 = r8.A02
            X.X8K r0 = (X.X8K) r0
            if (r0 == 0) goto L_0x007f
            long r0 = r0.C7M()
        L_0x0075:
            long r2 = java.lang.Math.min(r2, r0)
            long r0 = -r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x0019
        L_0x007f:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x0075
        L_0x0085:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x0055
        L_0x008b:
            com.instagram.autoplay.models.AutoplayPlaybackHistory r8 = (com.instagram.autoplay.models.AutoplayPlaybackHistory) r8
            long r0 = r8.currentStateStartTime
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            com.instagram.autoplay.models.AutoplayPlaybackHistory r7 = (com.instagram.autoplay.models.AutoplayPlaybackHistory) r7
            long r0 = r7.currentStateStartTime
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x0019
        L_0x009d:
            com.instagram.leadgen.core.model.LeadGenTrustSignal r7 = (com.instagram.leadgen.core.model.LeadGenTrustSignal) r7
            int r0 = r7.A00
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            com.instagram.leadgen.core.model.LeadGenTrustSignal r8 = (com.instagram.leadgen.core.model.LeadGenTrustSignal) r8
            int r0 = r8.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0019
        L_0x00af:
            X.N4R r7 = (X.N4R) r7
            java.lang.String r4 = r7.A04()
            X.N4R r8 = (X.N4R) r8
            java.lang.String r0 = r8.A04()
            goto L_0x0019
        L_0x00bd:
            X.TqJ r7 = (X.C14124TqJ) r7
            X.TqJ r8 = (X.C14124TqJ) r8
            int r1 = r8.A03
            int r0 = r8.A06
            int r1 = r1 - r0
            int r4 = r1 + 1
            int r1 = r8.A02
            int r0 = r8.A05
            int r1 = r1 - r0
            int r0 = r1 + 1
            int r4 = r4 * r0
            int r1 = r8.A01
            int r0 = r8.A04
            int r1 = r1 - r0
            int r0 = r1 + 1
            int r4 = r4 * r0
            int r1 = r7.A03
            int r0 = r7.A06
            int r1 = r1 - r0
            int r3 = r1 + 1
            int r1 = r7.A02
            int r0 = r7.A05
            int r1 = r1 - r0
            int r0 = r1 + 1
            int r3 = r3 * r0
            int r1 = r7.A01
            int r0 = r7.A04
            int r1 = r1 - r0
            int r0 = r1 + 1
            int r3 = r3 * r0
            goto L_0x0174
        L_0x00f1:
            X.Tzf r7 = (X.C14633Tzf) r7
            X.Tzf r8 = (X.C14633Tzf) r8
            int r4 = r7.A03
            int r3 = r8.A03
            float r2 = r7.A02
            float r1 = r8.A02
            if (r4 != r3) goto L_0x0174
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x010a
            float r2 = r2 - r1
            float r0 = java.lang.Math.signum(r2)
            int r4 = (int) r0
            return r4
        L_0x010a:
            int r4 = r7.A05
            int r3 = r8.A05
            goto L_0x0174
        L_0x010f:
            X.Vut r7 = (X.C18600Vut) r7
            X.Vut r8 = (X.C18600Vut) r8
            int r4 = r7.A00
            int r3 = r8.A00
            goto L_0x0174
        L_0x0118:
            X.W0S r7 = (X.W0S) r7
            X.W0S r8 = (X.W0S) r8
            if (r7 != 0) goto L_0x0122
            if (r8 != 0) goto L_0x0133
        L_0x0120:
            r4 = 0
            return r4
        L_0x0122:
            if (r8 == 0) goto L_0x0135
            long r3 = r7.A03
            long r0 = r8.A03
            long r3 = r3 - r0
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0120
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0135
        L_0x0133:
            r4 = -1
            return r4
        L_0x0135:
            r4 = 1
            return r4
        L_0x0137:
            X.VsG r7 = (X.C18466VsG) r7
            X.VsG r8 = (X.C18466VsG) r8
            X.2AC r0 = r7.A01
            X.VQz[] r1 = r0.A07
            int r0 = r7.A00
            r0 = r1[r0]
            long r2 = r0.A00
            X.2AC r0 = r8.A01
            X.VQz[] r1 = r0.A07
            int r0 = r8.A00
            r0 = r1[r0]
            long r0 = r0.A00
            long r2 = r2 - r0
            int r4 = (int) r2
            return r4
        L_0x0152:
            X.VVC r7 = (X.VVC) r7
            X.VVC r8 = (X.VVC) r8
            android.graphics.Typeface r0 = X.C15849UjZ.A0D
            java.util.Date r1 = r7.A02
            java.util.Date r0 = r8.A02
            int r4 = r1.compareTo(r0)
            return r4
        L_0x0161:
            com.instagram.discovery.mediamap.model.MediaMapPin r7 = (com.instagram.discovery.mediamap.model.MediaMapPin) r7
            com.instagram.discovery.mediamap.model.MediaMapPin r8 = (com.instagram.discovery.mediamap.model.MediaMapPin) r8
            long r2 = r7.A01
            long r0 = r8.A01
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            return r4
        L_0x016c:
            X.N3l r7 = (X.C68170N3l) r7
            X.N3l r8 = (X.C68170N3l) r8
            int r4 = r8.A00
            int r3 = r7.A00
        L_0x0174:
            int r4 = r4 - r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20373WqD.compare(java.lang.Object, java.lang.Object):int");
    }
}
