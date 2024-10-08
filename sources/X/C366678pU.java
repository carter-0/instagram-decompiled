package X;

/* renamed from: X.8pU  reason: invalid class name and case insensitive filesystem */
public final class C366678pU extends AnonymousClass0T0 {
    public boolean A00;
    public final C366648pR A01;
    public final C364758lx A02;
    public final C366688pV A03;
    public final C366588pL A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C366678pU) {
                C366678pU r5 = (C366678pU) obj;
                if (!0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || this.A05 != r5.A05) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004a, code lost:
        if (r0.size() <= 0) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0053, code lost:
        if (r0 == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0090, code lost:
        if (r0.size() <= 0) goto L_0x0092;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00() {
        /*
            r5 = this;
            X.8pV r4 = r5.A03
            r3 = 1
            if (r4 == 0) goto L_0x005f
            X.8pT r1 = r4.A04
            if (r1 == 0) goto L_0x001d
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x001d
            java.lang.Object r0 = r1.A00()
            X.8vx r0 = (X.C370178vx) r0
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r0 = r0.A00
            boolean r0 = r0.A01()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0055
        L_0x001d:
            X.3QG r1 = X.C366688pV.A0D
            X.3QG r0 = r4.A08
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0055
            java.lang.String r0 = r4.A09
            if (r0 != 0) goto L_0x0055
            com.instagram.camera.effect.models.CameraAREffect r0 = r4.A00
            if (r0 != 0) goto L_0x0055
            X.8vv r0 = r4.A03
            if (r0 == 0) goto L_0x003d
            java.util.List r0 = r0.A05
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0055
        L_0x003d:
            X.8PW r2 = r4.A05
            if (r2 == 0) goto L_0x0056
            java.util.Map r0 = r2.A0K
            if (r0 == 0) goto L_0x004c
            int r0 = r0.size()
            r1 = 1
            if (r0 > 0) goto L_0x004d
        L_0x004c:
            r1 = 0
        L_0x004d:
            boolean r0 = r2.A00()
            if (r1 != 0) goto L_0x0055
            if (r0 == 0) goto L_0x0056
        L_0x0055:
            return r3
        L_0x0056:
            X.8vz r0 = r4.A02
            if (r0 == 0) goto L_0x005f
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x005f
            return r3
        L_0x005f:
            X.8lx r2 = r5.A02
            if (r2 == 0) goto L_0x009c
            X.8pT r1 = r2.A04
            if (r1 == 0) goto L_0x007b
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x007b
            java.lang.Object r0 = r1.A00()
            X.8vx r0 = (X.C370178vx) r0
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r0 = r0.A00
            boolean r0 = r0.A01()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0055
        L_0x007b:
            com.instagram.camera.effect.models.CameraAREffect r0 = r2.A01
            if (r0 != 0) goto L_0x0055
            int r0 = r2.A00
            if (r0 != 0) goto L_0x0055
            X.8PW r2 = r2.A05
            if (r2 == 0) goto L_0x009c
            java.util.Map r0 = r2.A0K
            if (r0 == 0) goto L_0x0092
            int r0 = r0.size()
            r1 = 1
            if (r0 > 0) goto L_0x0093
        L_0x0092:
            r1 = 0
        L_0x0093:
            boolean r0 = r2.A00()
            if (r1 != 0) goto L_0x0055
            if (r0 == 0) goto L_0x009c
            return r3
        L_0x009c:
            X.8pR r0 = r5.A01
            X.9IE r0 = r0.A00
            if (r0 == 0) goto L_0x00af
            java.lang.Object r0 = r0.A00
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r0 = (com.instagram.reels.fragment.model.ReelMoreOptionsModel) r0
            if (r0 == 0) goto L_0x00af
            boolean r0 = r0.A01()
            if (r0 != r3) goto L_0x00af
            return r3
        L_0x00af:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C366678pU.A00():boolean");
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        C366588pL r0 = this.A04;
        int i = 0;
        if (r0 == null) {
            hashCode = 0;
        } else {
            hashCode = r0.hashCode();
        }
        int hashCode3 = ((hashCode * 31) + this.A01.hashCode()) * 31;
        C364758lx r02 = this.A02;
        if (r02 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = r02.hashCode();
        }
        int i2 = (hashCode3 + hashCode2) * 31;
        C366688pV r03 = this.A03;
        if (r03 != null) {
            i = r03.hashCode();
        }
        int i3 = (i2 + i) * 31;
        int i4 = 1237;
        if (this.A05) {
            i4 = 1231;
        }
        return i3 + i4;
    }

    public C366678pU(C366648pR r1, C364758lx r2, C366688pV r3, C366588pL r4, boolean z) {
        this.A04 = r4;
        this.A01 = r1;
        this.A02 = r2;
        this.A03 = r3;
        this.A05 = z;
    }
}
