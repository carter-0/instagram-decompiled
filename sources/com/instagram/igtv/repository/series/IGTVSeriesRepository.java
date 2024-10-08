package com.instagram.igtv.repository.series;

import X.1Ng;
import com.instagram.repository.common.MemoryCache;
import java.util.concurrent.TimeUnit;

public final class IGTVSeriesRepository {
    public static final long A03 = TimeUnit.MINUTES.toMillis(15);
    public final IGTVSeriesNetworkDataSource A00;
    public final MemoryCache A01;
    public final 1Ng A02;

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDz, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(java.lang.String r6, java.lang.String r7, X.AnonymousClass4D7 r8) {
        /*
            r5 = this;
            r4 = 1
            boolean r0 = X.C66147MDz.A02(r4, r8)
            if (r0 == 0) goto L_0x0059
            r3 = r8
            X.MDz r3 = (X.C66147MDz) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0059
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0015:
            java.lang.Object r2 = r3.A04
            X.1Hj r1 = X.1Hj.A02
            int r0 = r3.A00
            if (r0 == 0) goto L_0x0048
            if (r0 != r4) goto L_0x0064
            java.lang.Object r7 = r3.A03
            java.lang.Object r6 = r3.A02
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r1 = r3.A01
            com.instagram.igtv.repository.series.IGTVSeriesRepository r1 = (com.instagram.igtv.repository.series.IGTVSeriesRepository) r1
            X.0eS.A00(r2)
        L_0x002c:
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x005f
            com.instagram.repository.common.MemoryCache r0 = r1.A01
            X.3lq r0 = (X.C250653lq) r0
            android.util.LruCache r0 = r0.A00
            r0.remove(r7)
            X.1Ng r2 = r1.A02
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            X.Lfy r0 = new X.Lfy
            r0.<init>(r6, r1)
            r2.A00(r0)
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0048:
            X.0eS.A00(r2)
            com.instagram.igtv.repository.series.IGTVSeriesNetworkDataSource r0 = r5.A00
            X.C66147MDz.A00(r5, r6, r7, r3, r4)
            java.lang.Object r2 = r0.A04(r6, r3)
            if (r2 != r1) goto L_0x0057
            return r1
        L_0x0057:
            r1 = r5
            goto L_0x002c
        L_0x0059:
            X.MDz r3 = new X.MDz
            r3.<init>(r5, r8, r4)
            goto L_0x0015
        L_0x005f:
            java.lang.Exception r0 = X.JTU.A0T(r2)
            throw r0
        L_0x0064:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igtv.repository.series.IGTVSeriesRepository.A04(java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [X.ME3, X.4D7] */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C63640L1c r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, X.AnonymousClass4D7 r16) {
        /*
            r10 = this;
            r3 = 13
            r4 = r16
            boolean r0 = X.ME3.A03(r3, r4)
            if (r0 == 0) goto L_0x0044
            r9 = r4
            X.ME3 r9 = (X.ME3) r9
            int r2 = r9.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0044
            int r2 = r2 - r1
            r9.A00 = r2
        L_0x0018:
            java.lang.Object r3 = r9.A01
            X.1Hj r2 = X.1Hj.A02
            int r1 = r9.A00
            r0 = 1
            if (r1 == 0) goto L_0x0031
            if (r1 != r0) goto L_0x004e
            X.0eS.A00(r3)
        L_0x0026:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0049
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r2 = r3.A00
            return r2
        L_0x0031:
            X.0eS.A00(r3)
            com.instagram.igtv.repository.series.IGTVSeriesNetworkDataSource r3 = r10.A00
            r9.A00 = r0
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            java.lang.Object r3 = r3.A00(r4, r5, r6, r7, r8, r9)
            if (r3 != r2) goto L_0x0026
            return r2
        L_0x0044:
            X.ME3 r9 = X.ME3.A01(r10, r4, r3)
            goto L_0x0018
        L_0x0049:
            java.lang.Exception r0 = X.JTU.A0T(r3)
            throw r0
        L_0x004e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igtv.repository.series.IGTVSeriesRepository.A00(X.L1c, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME3, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C63640L1c r6, java.lang.String r7, java.lang.String r8, X.AnonymousClass4D7 r9) {
        /*
            r5 = this;
            r3 = 14
            boolean r0 = X.ME3.A03(r3, r9)
            if (r0 == 0) goto L_0x003d
            r4 = r9
            X.ME3 r4 = (X.ME3) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x003d
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 != r1) goto L_0x0047
            X.0eS.A00(r3)
        L_0x0024:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0042
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r2 = r3.A00
            return r2
        L_0x002f:
            X.0eS.A00(r3)
            com.instagram.igtv.repository.series.IGTVSeriesNetworkDataSource r0 = r5.A00
            r4.A00 = r1
            java.lang.Object r3 = r0.A01(r6, r7, r8, r4)
            if (r3 != r2) goto L_0x0024
            return r2
        L_0x003d:
            X.ME3 r4 = X.ME3.A01(r5, r9, r3)
            goto L_0x0016
        L_0x0042:
            java.lang.Exception r0 = X.JTU.A0T(r3)
            throw r0
        L_0x0047:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igtv.repository.series.IGTVSeriesRepository.A01(X.L1c, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDx, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, X.AnonymousClass4D7 r10) {
        /*
            r5 = this;
            r3 = 41
            boolean r0 = X.C66145MDx.A02(r3, r10)
            if (r0 == 0) goto L_0x0069
            r4 = r10
            X.MDx r4 = (X.C66145MDx) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0069
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A03
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x0058
            if (r0 != r1) goto L_0x0088
            java.lang.Object r6 = r4.A02
            java.lang.Object r2 = r4.A01
            com.instagram.igtv.repository.series.IGTVSeriesRepository r2 = (com.instagram.igtv.repository.series.IGTVSeriesRepository) r2
            X.0eS.A00(r3)
        L_0x002a:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0077
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r1 = r3.A00
            X.K1O r1 = (X.K1O) r1
            com.instagram.repository.common.MemoryCache r0 = r2.A01
            X.3lq r0 = (X.C250653lq) r0
            android.util.LruCache r0 = r0.A00
            r0.remove(r6)
            java.lang.String r4 = r1.A00
            java.lang.String r3 = r1.A01
            if (r4 == 0) goto L_0x006f
            if (r3 == 0) goto L_0x006f
            X.1Ng r2 = r2.A02
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.Lfy r0 = new X.Lfy
            r0.<init>(r4, r1)
            r2.A00(r0)
            X.0eP r0 = X.AnonymousClass7TE.A1L(r4, r3)
            return r0
        L_0x0058:
            X.0eS.A00(r3)
            com.instagram.igtv.repository.series.IGTVSeriesNetworkDataSource r0 = r5.A00
            X.C66145MDx.A00(r5, r6, r4, r1)
            java.lang.Object r3 = r0.A02(r7, r8, r9, r4)
            if (r3 != r2) goto L_0x0067
            return r2
        L_0x0067:
            r2 = r5
            goto L_0x002a
        L_0x0069:
            X.MDx r4 = new X.MDx
            r4.<init>(r5, r10, r3)
            goto L_0x0016
        L_0x006f:
            java.lang.String r1 = "IGTVSeriesRepository network response is invalid"
            X.3g0 r0 = new X.3g0
            r0.<init>(r1)
            throw r0
        L_0x0077:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0083
            java.lang.String r1 = "IGTVSeriesRepository network request failed"
            X.3g0 r0 = new X.3g0
            r0.<init>(r1)
            throw r0
        L_0x0083:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0088:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igtv.repository.series.IGTVSeriesRepository.A02(java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDx, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, X.AnonymousClass4D7 r10) {
        /*
            r5 = this;
            r3 = 42
            boolean r0 = X.C66145MDx.A02(r3, r10)
            if (r0 == 0) goto L_0x0061
            r4 = r10
            X.MDx r4 = (X.C66145MDx) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0061
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A03
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x0050
            if (r0 != r1) goto L_0x0080
            java.lang.Object r7 = r4.A02
            java.lang.Object r2 = r4.A01
            com.instagram.igtv.repository.series.IGTVSeriesRepository r2 = (com.instagram.igtv.repository.series.IGTVSeriesRepository) r2
            X.0eS.A00(r3)
        L_0x002a:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x006f
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r1 = r3.A00
            X.K1O r1 = (X.K1O) r1
            com.instagram.repository.common.MemoryCache r0 = r2.A01
            X.3lq r0 = (X.C250653lq) r0
            android.util.LruCache r0 = r0.A00
            r0.remove(r7)
            java.lang.String r3 = r1.A00
            if (r3 == 0) goto L_0x0067
            X.1Ng r2 = r2.A02
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            X.Lfy r0 = new X.Lfy
            r0.<init>(r3, r1)
            r2.A00(r0)
            return r3
        L_0x0050:
            X.0eS.A00(r3)
            com.instagram.igtv.repository.series.IGTVSeriesNetworkDataSource r0 = r5.A00
            X.C66145MDx.A00(r5, r7, r4, r1)
            java.lang.Object r3 = r0.A03(r6, r8, r9, r4)
            if (r3 != r2) goto L_0x005f
            return r2
        L_0x005f:
            r2 = r5
            goto L_0x002a
        L_0x0061:
            X.MDx r4 = new X.MDx
            r4.<init>(r5, r10, r3)
            goto L_0x0016
        L_0x0067:
            java.lang.String r1 = "IGTVSeriesRepository network response is invalid"
            X.3g0 r0 = new X.3g0
            r0.<init>(r1)
            throw r0
        L_0x006f:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x007b
            java.lang.String r1 = "IGTVSeriesRepository network request failed"
            X.3g0 r0 = new X.3g0
            r0.<init>(r1)
            throw r0
        L_0x007b:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0080:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igtv.repository.series.IGTVSeriesRepository.A03(java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    public IGTVSeriesRepository(1Ng r1, IGTVSeriesNetworkDataSource iGTVSeriesNetworkDataSource, MemoryCache memoryCache) {
        this.A01 = memoryCache;
        this.A00 = iGTVSeriesNetworkDataSource;
        this.A02 = r1;
    }
}
