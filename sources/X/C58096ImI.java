package X;

import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.ImI  reason: case insensitive filesystem */
public final class C58096ImI extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public Object A04;
    public final int A05;
    public final Object A06;
    public final Object A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58096ImI(AudioOverlayTrack audioOverlayTrack, C52974GgR ggR, AnonymousClass4D7 r4, int i, int i2) {
        super(2, r4);
        this.A05 = 2;
        this.A07 = ggR;
        this.A06 = audioOverlayTrack;
        this.A01 = i;
        this.A00 = i2;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.ImI, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.ImI, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r11) {
        Object obj2;
        Object obj3;
        int i;
        AnonymousClass4D7 r6 = r11;
        switch (this.A05) {
            case 0:
                obj2 = this.A06;
                obj3 = this.A07;
                i = 0;
                break;
            case 1:
                obj2 = this.A06;
                obj3 = this.A07;
                i = 1;
                break;
            default:
                ? imI = new C58096ImI((AudioOverlayTrack) this.A06, (C52974GgR) this.A07, r6, this.A01, this.A00);
                imI.A03 = obj;
                return imI;
        }
        return new C58096ImI(obj2, obj3, r11, i);
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [X.ImI, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0168, code lost:
        if (r2 != false) goto L_0x016a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0125 A[Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0128 A[Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0270  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            r25 = this;
            r14 = r25
            r8 = r26
            int r0 = r14.A05
            X.1Hj r7 = X.1Hj.A02
            switch(r0) {
                case 0: goto L_0x0214;
                case 1: goto L_0x0256;
                default: goto L_0x000b;
            }
        L_0x000b:
            int r0 = r14.A02
            r4 = 2
            r9 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0023
            if (r0 == r2) goto L_0x001e
            java.lang.Object r12 = r14.A04
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r3 = r14.A03
            X.4Cq r3 = (X.C262224Cq) r3
            goto L_0x011a
        L_0x001e:
            java.lang.Object r3 = r14.A03
            X.4Cq r3 = (X.C262224Cq) r3
            goto L_0x0066
        L_0x0023:
            X.0eS.A00(r8)
            java.lang.Object r3 = r14.A03
            X.4Cq r3 = (X.C262224Cq) r3
            java.lang.Object r12 = r14.A07     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            X.GgR r12 = (X.C52974GgR) r12     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            X.05G r0 = r12.A0R     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            X.AnonymousClass7TF.A1O(r0, r2)     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            X.05G r6 = r12.A0U     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            r0 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            java.lang.Double r5 = new java.lang.Double     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            r5.<init>(r0)     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            r6.Epw(r5)     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            java.lang.Object r0 = r14.A06     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            com.instagram.music.common.model.AudioOverlayTrack r0 = (com.instagram.music.common.model.AudioOverlayTrack) r0     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            java.lang.String r13 = r0.A0B     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            java.lang.String r0 = r0.A0E     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            if (r0 == 0) goto L_0x0053
            com.instagram.api.schemas.MusicCanonicalType r11 = com.instagram.api.schemas.MusicCanonicalType.A05     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            goto L_0x0055
        L_0x0053:
            com.instagram.api.schemas.MusicCanonicalType r11 = com.instagram.api.schemas.MusicCanonicalType.A04     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
        L_0x0055:
            int r15 = r14.A01     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            int r0 = r14.A00     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            r14.A03 = r3     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            r14.A02 = r2     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            r16 = r0
            java.lang.Object r8 = X.C52974GgR.A00(r11, r12, r13, r14, r15, r16)     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            if (r8 != r7) goto L_0x0069
            return r7
        L_0x0066:
            X.0eS.A00(r8)     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
        L_0x0069:
            r12 = r8
            java.util.List r12 = (java.util.List) r12     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            if (r12 != 0) goto L_0x0071
            X.0gF r7 = X.C60340gF.A00     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            return r7
        L_0x0071:
            java.lang.Object r10 = r14.A07     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            X.GgR r10 = (X.C52974GgR) r10     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            X.I1z r6 = r10.A0H     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            boolean r0 = r6.A01     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            if (r0 == 0) goto L_0x00e7
            int r1 = r12.size()     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            com.instagram.clips.audio.soundsync.repository.ClipsSoundSyncMediaImportRepository r11 = r6.A07     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            java.util.List r0 = r11.A01     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            int r0 = r0.size()     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            if (r1 != r0) goto L_0x00e7
            int r1 = r12.size()     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            java.util.List r0 = r6.A03()     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            int r0 = r0.size()     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            if (r1 != r0) goto L_0x00e7
            int r8 = r12.size()     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            r5 = 0
        L_0x009c:
            if (r5 >= r8) goto L_0x00e7
            java.lang.Object r0 = r12.get(r5)     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            X.HsQ r0 = (X.C56077HsQ) r0     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            int r1 = r0.A01     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            java.util.List r0 = r11.A01     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            int r0 = X.C51971G9r.A0I(r0, r5)     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            int r1 = r1 + r0
            int r13 = java.lang.Math.max(r9, r1)     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            java.lang.Object r0 = r12.get(r5)     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            X.HsQ r0 = (X.C56077HsQ) r0     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            int r1 = r0.A00     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            java.util.List r0 = r11.A01     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            int r0 = X.C51971G9r.A0I(r0, r5)     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            int r1 = r1 + r0
            java.util.List r0 = r6.A03()     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            com.instagram.common.gallery.Medium r0 = (com.instagram.common.gallery.Medium) r0     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            int r0 = r0.A03     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            int r1 = java.lang.Math.min(r1, r0)     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            if (r5 == 0) goto L_0x00e4
            if (r13 >= r1) goto L_0x00e4
            java.lang.Object r0 = r12.get(r5)     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            X.HsQ r0 = (X.C56077HsQ) r0     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            r0.A01 = r13     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            java.lang.Object r0 = r12.get(r5)     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            X.HsQ r0 = (X.C56077HsQ) r0     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            r0.A00 = r1     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
        L_0x00e4:
            int r5 = r5 + 1
            goto L_0x009c
        L_0x00e7:
            boolean r0 = X.19E.A07(r3)     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            if (r0 != 0) goto L_0x00f0
            X.0gF r7 = X.C60340gF.A00     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            return r7
        L_0x00f0:
            X.05G r8 = r10.A0U     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double r5 = new java.lang.Double     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            r5.<init>(r0)     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            r8.Epw(r5)     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            r14.A03 = r3     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            r14.A04 = r12     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            r14.A02 = r4     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            X.12T r1 = X.AnonymousClass12T.A00     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            r0 = 422445809(0x192e02f1, float:8.996183E-24)
            X.0nV r5 = r1.AOJ(r0, r2)     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            r4 = 0
            r1 = 35
            X.ImP r0 = new X.ImP     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            r0.<init>(r6, r12, r4, r1)     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            java.lang.Object r8 = X.1Eo.A00(r14, r5, r0)     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            if (r8 != r7) goto L_0x011d
            return r7
        L_0x011a:
            X.0eS.A00(r8)     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
        L_0x011d:
            java.util.List r8 = (java.util.List) r8     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            boolean r0 = X.19E.A07(r3)     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            if (r0 != 0) goto L_0x0128
            X.0gF r7 = X.C60340gF.A00     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            return r7
        L_0x0128:
            java.lang.Object r13 = r14.A07     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            X.GgR r13 = (X.C52974GgR) r13     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            java.lang.Object r1 = r14.A06     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            X.8Y4 r0 = new X.8Y4     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            r0.<init>(r1)     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            X.C52974GgR.A01(r0, r13, r8, r12, r2)     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            X.05G r0 = r13.A0R     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            r0.Epw(r1)     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            X.05G r0 = r13.A0S     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            r0.Epw(r1)     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            int r11 = r8.size()     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            r10 = 0
        L_0x0149:
            if (r10 >= r11) goto L_0x0211
            java.lang.Object r0 = r8.get(r10)     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            boolean r0 = r0 instanceof X.AnonymousClass51M     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            if (r0 == 0) goto L_0x01c5
            X.I1z r0 = r13.A0H     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            boolean r2 = r0.A01     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            r0 = 3654(0xe46, float:5.12E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            if (r2 == 0) goto L_0x0183
            java.util.List r0 = r13.A0J     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            if (r0 == 0) goto L_0x016a
            boolean r2 = r0.isEmpty()     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            r0 = 0
            if (r2 == 0) goto L_0x016b
        L_0x016a:
            r0 = 1
        L_0x016b:
            if (r0 == 0) goto L_0x0183
            com.instagram.common.session.UserSession r0 = r13.A06     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            X.27p.A01(r0)     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            r8.get(r10)     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            java.lang.Object r0 = r8.get(r10)     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            X.0qQ.A0C(r0, r1)     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            r12.get(r10)     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            r12.get(r10)     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            goto L_0x01c5
        L_0x0183:
            com.instagram.common.session.UserSession r0 = r13.A06     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            X.27r r15 = X.27p.A01(r0)     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            java.lang.Object r0 = r8.get(r10)     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            X.51N r0 = (X.AnonymousClass51N) r0     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            java.lang.String r0 = r0.A08()     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            int r0 = r0.hashCode()     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            long r6 = (long) r0     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            java.lang.Object r0 = r8.get(r10)     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            X.0qQ.A0C(r0, r1)     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            X.51M r0 = (X.AnonymousClass51M) r0     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            X.51R r0 = r0.A0F     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            int r0 = r0.A04     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            double r4 = (double) r0     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            java.lang.Object r0 = r12.get(r10)     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            X.HsQ r0 = (X.C56077HsQ) r0     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            int r0 = r0.A01     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            double r2 = (double) r0     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            java.lang.Object r0 = r12.get(r10)     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            X.HsQ r0 = (X.C56077HsQ) r0     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            int r0 = r0.A00     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            double r0 = (double) r0     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
            r18 = r2
            r20 = r0
            r22 = r6
            r24 = r9
            r16 = r4
            r15.A0n(r16, r18, r20, r22, r24)     // Catch:{ CancellationException -> 0x0211, IllegalStateException -> 0x01c8, HP1 -> 0x0209 }
        L_0x01c5:
            int r10 = r10 + 1
            goto L_0x0149
        L_0x01c8:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "get trim for audio failed for ID "
            r1.append(r0)
            java.lang.Object r0 = r14.A06
            com.instagram.music.common.model.AudioOverlayTrack r0 = (com.instagram.music.common.model.AudioOverlayTrack) r0
            java.lang.String r0 = r0.A0B
            r1.append(r0)
            java.lang.String r0 = ": ["
            r1.append(r0)
            int r0 = r14.A01
            r1.append(r0)
            java.lang.String r0 = ", "
            r1.append(r0)
            int r0 = r14.A00
            r1.append(r0)
            java.lang.String r0 = "], "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            java.lang.String r2 = X.AnonymousClass7TF.A0l(r0, r1)
            java.lang.Object r1 = r14.A07
            X.GgR r1 = (X.C52974GgR) r1
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r2)
            X.C52974GgR.A06(r1, r0)
            goto L_0x0211
        L_0x0209:
            r1 = move-exception
            java.lang.Object r0 = r14.A07
            X.GgR r0 = (X.C52974GgR) r0
            X.C52974GgR.A06(r0, r1)
        L_0x0211:
            X.0gF r7 = X.C60340gF.A00
            return r7
        L_0x0214:
            int r0 = r14.A02
            r6 = 1
            if (r0 == 0) goto L_0x0243
            if (r0 != r6) goto L_0x0251
            int r0 = r14.A01
            int r5 = r14.A00
            java.lang.Object r1 = r14.A04
            X.JjM r1 = (X.C60318JjM) r1
            java.lang.Object r2 = r14.A03
            X.MPw[] r2 = (X.C66390MPw[]) r2
            X.0eS.A00(r8)
        L_0x022a:
            int r5 = r5 + 1
        L_0x022c:
            if (r5 >= r0) goto L_0x0293
            r4 = r2[r5]
            X.3ju r3 = r1.A0B
            r14.A03 = r2
            r14.A04 = r1
            r14.A00 = r5
            r14.A01 = r0
            r14.A02 = r6
            java.lang.Object r3 = r3.ELH(r4, r14)
            if (r3 != r7) goto L_0x022a
            return r7
        L_0x0243:
            X.0eS.A00(r8)
            java.lang.Object r2 = r14.A06
            X.MPw[] r2 = (X.C66390MPw[]) r2
            java.lang.Object r1 = r14.A07
            X.JjM r1 = (X.C60318JjM) r1
            r5 = 0
            int r0 = r2.length
            goto L_0x022c
        L_0x0251:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0256:
            int r0 = r14.A02
            r6 = 1
            if (r0 == 0) goto L_0x0285
            if (r0 != r6) goto L_0x0296
            int r0 = r14.A01
            int r5 = r14.A00
            java.lang.Object r1 = r14.A04
            X.JjW r1 = (X.C60327JjW) r1
            java.lang.Object r2 = r14.A03
            X.MQn[] r2 = (X.C66407MQn[]) r2
            X.0eS.A00(r8)
        L_0x026c:
            int r5 = r5 + 1
        L_0x026e:
            if (r5 >= r0) goto L_0x0293
            r4 = r2[r5]
            X.3ju r3 = r1.A0C
            r14.A03 = r2
            r14.A04 = r1
            r14.A00 = r5
            r14.A01 = r0
            r14.A02 = r6
            java.lang.Object r3 = r3.ELH(r4, r14)
            if (r3 != r7) goto L_0x026c
            return r7
        L_0x0285:
            X.0eS.A00(r8)
            java.lang.Object r2 = r14.A06
            X.MQn[] r2 = (X.C66407MQn[]) r2
            java.lang.Object r1 = r14.A07
            X.JjW r1 = (X.C60327JjW) r1
            r5 = 0
            int r0 = r2.length
            goto L_0x026e
        L_0x0293:
            X.0gF r7 = X.C60340gF.A00
            return r7
        L_0x0296:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58096ImI.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C58096ImI) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58096ImI(Object obj, Object obj2, AnonymousClass4D7 r4, int i) {
        super(2, r4);
        this.A05 = i;
        this.A06 = obj;
        this.A07 = obj2;
    }
}
