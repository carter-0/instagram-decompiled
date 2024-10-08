package X;

import android.content.Context;
import android.util.SparseArray;
import android.view.TextureView;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.gpuimageloader.impl.instagram.IgGPUImageLoader;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* renamed from: X.Ac8  reason: case insensitive filesystem */
public final class C40437Ac8 implements C364848m7 {
    public float A00 = 1.0f;
    public float A01 = 1.0f;
    public int A02 = -1;
    public int A03 = -1;
    public GainmapFilter A04;
    public IgGPUImageLoader A05;
    public C365398n2 A06;
    public C365398n2 A07;
    public C343927r2 A08;
    public C364988mL A09;
    public CropInfo A0A;
    public AnonymousClass8KS A0B = null;
    public C365358my A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F;
    public SOP A0G;
    public C64444Lbz A0H = null;
    public C63928LDl A0I;
    public boolean A0J;
    public final C344207rU A0K;
    public final C3499582p A0L;
    public final C364868m9 A0M;
    public final C364958mI A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final int A0Q;
    public final Context A0R;
    public final UserSession A0S;
    public final AR4 A0T;
    public final C364808m2 A0U;

    public final void AOu() {
    }

    public final /* synthetic */ void APs(FilterGroupModel filterGroupModel, 0sP r2, int i, int i2) {
    }

    public final /* synthetic */ void APz(FilterGroupModel filterGroupModel) {
    }

    public final /* synthetic */ void CMs(AnonymousClass80G r1, int i, int i2) {
    }

    public final /* synthetic */ void CMt(TextureView textureView, LNz lNz, int i, int i2) {
    }

    public final /* synthetic */ void Eij(C63694L3e l3e) {
    }

    public final void Ekd() {
        this.A0F = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003d, code lost:
        if (r4 == false) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EoR(android.view.View r11, X.AnonymousClass8KS r12, com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter r13) {
        /*
            r10 = this;
            r6 = r10
            X.7rU r1 = r10.A0K
            boolean r0 = r1.A08()
            if (r0 != 0) goto L_0x000c
            r1.A03()
        L_0x000c:
            X.7rc r0 = X.C344267ra.A01
            X.7rb r2 = r1.A02(r0)
            X.7ra r2 = (X.C344267ra) r2
            r2.EIH()
            X.8m9 r1 = r10.A0M
            r1.getClass()
            X.8mT r0 = new X.8mT
            r0.<init>(r1)
            X.7te r2 = (X.C345517te) r2
            r2.A00 = r0
            X.8mL r5 = A00(r10)
            boolean r4 = android.os.Process.is64Bit()
            com.instagram.common.session.UserSession r3 = r10.A0S
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321975781631867(0x810aa50001277b, double:3.033501968936518E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x003f
            r9 = 1
            if (r4 != 0) goto L_0x0040
        L_0x003f:
            r9 = 0
        L_0x0040:
            X.AqW r4 = new X.AqW
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r5.A0C(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40437Ac8.EoR(android.view.View, X.8KS, com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter):void");
    }

    public static C364988mL A00(C40437Ac8 ac8) {
        C364988mL r0 = ac8.A09;
        if (r0 != null) {
            return r0;
        }
        C364988mL AMq = ((C345807u7) ac8.A0K.A02(C345807u7.A00)).AMq((C365328mu) null);
        ac8.A09 = AMq;
        return AMq;
    }

    public final void AOv() {
        String str;
        this.A0K.A04();
        this.A0N.A06();
        IgGPUImageLoader igGPUImageLoader = this.A05;
        if (igGPUImageLoader != null) {
            igGPUImageLoader.releaseImage();
            this.A05 = null;
        }
        C343927r2 r1 = this.A08;
        if (r1 != null && (str = this.A0D) != null) {
            r1.E63(str);
            this.A08 = null;
            this.A0D = null;
        }
    }

    public final CropInfo Asr() {
        return this.A0A;
    }

    public final boolean CQu() {
        return this.A0J;
    }

    public final boolean CUZ() {
        return this.A0P;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006e, code lost:
        if (X.182.A06(X.0Tu.A05, r3, 36321670839019129L) == false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00cc, code lost:
        if (X.182.A06(X.0Tu.A05, r4, 36323148307639199L) == false) goto L_0x00ce;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Cmo(X.MV7 r40, com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r41, X.C62461KgB[] r42, boolean r43) {
        /*
            r39 = this;
            r5 = r39
            X.SOP r4 = r5.A0G
            if (r4 == 0) goto L_0x003d
            X.8KS r0 = r5.A0B
            if (r0 == 0) goto L_0x003d
            X.80G r0 = r0.A04
            com.instagram.common.ui.widget.textureview.MultiListenerTextureView r0 = r0.A0D
            if (r0 == 0) goto L_0x003d
            android.graphics.Bitmap r0 = r0.getBitmap()
            if (r0 == 0) goto L_0x003d
            X.Lbz r0 = r5.A0H
            if (r0 == 0) goto L_0x003d
            r1 = 0
            X.8KS r0 = r5.A0B
            X.80G r0 = r0.A04
            com.instagram.common.ui.widget.textureview.MultiListenerTextureView r0 = r0.A0D
            if (r0 == 0) goto L_0x0137
            android.graphics.Bitmap r0 = r0.getBitmap()
        L_0x0028:
            X.GnR r3 = new X.GnR
            r3.<init>(r0, r1)
            X.Lbz r2 = r5.A0H
            r0 = 1
            X.0qQ.A0B(r2, r0)
            java.util.concurrent.ExecutorService r1 = r4.A09
            X.TIo r0 = new X.TIo
            r0.<init>(r3, r2, r4)
            r1.submit(r0)
        L_0x003d:
            X.8mL r0 = r5.A09
            if (r0 == 0) goto L_0x0047
            r0.A03()
            r0 = 0
            r5.A09 = r0
        L_0x0047:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            if (r1 < r0) goto L_0x0070
            X.8m2 r0 = r5.A0U
            boolean r0 = r0.Cdi()
            if (r0 == 0) goto L_0x0070
            com.instagram.common.session.UserSession r3 = r5.A0S
            r0 = 0
            X.0qQ.A0B(r3, r0)
            boolean r0 = X.2Ht.A06(r3)
            if (r0 == 0) goto L_0x0070
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321670839019129(0x810a5e00022679, double:3.033309122000317E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r35 = 1
            if (r0 != 0) goto L_0x0072
        L_0x0070:
            r35 = 0
        L_0x0072:
            android.content.Context r15 = r5.A0R
            com.instagram.common.session.UserSession r4 = r5.A0S
            X.AR4 r14 = r5.A0T
            r14.getClass()
            X.7rU r13 = r5.A0K
            r23 = r41
            r23.getClass()
            java.lang.Integer r25 = X.AnonymousClass05K.A00
            X.8m2 r12 = r5.A0U
            com.instagram.creation.base.CropInfo r11 = r5.A0A
            int r9 = r5.A0Q
            r6 = 0
            boolean r8 = r5.A0O
            X.82p r7 = r5.A0L
            r7.getClass()
            X.82q r0 = r7.A00()
            X.L83 r20 = r0.E0c()
            r32 = 1
            X.82q r0 = r7.A00()
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r0 = r0.A01
            java.util.List r0 = r0.A05()
            X.0qQ.A07(r0)
            int r0 = r0.size()
            long r2 = (long) r0
            X.0Tu r10 = X.0Tu.A06
            r0 = 36604623284474949(0x820bb600021445, double:3.212249387864624E-306)
            long r16 = X.182.A01(r10, r4, r0)
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x00ce
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323148307639199(0x810bb600002b9f, double:3.034243479104938E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            r33 = 1
            if (r0 != 0) goto L_0x00d0
        L_0x00ce:
            r33 = 0
        L_0x00d0:
            X.82q r0 = r7.A00()
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r0 = r0.A01
            java.util.List r0 = r0.A05()
            X.0qQ.A07(r0)
            int r29 = r0.size()
            X.82q r19 = r7.A00()
            X.LER r0 = new X.LER
            r21 = r40
            r26 = r42
            r24 = r12
            r27 = r9
            r28 = r6
            r30 = r6
            r31 = r8
            r34 = r6
            r36 = r32
            r37 = r6
            r38 = r6
            r17 = r4
            r18 = r11
            r22 = r14
            r14 = r0
            r16 = r13
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            X.82q r1 = r7.A00()
            X.JWE r1 = (X.JWE) r1
            com.instagram.creation.base.CreationSession r1 = r1.A01
            com.instagram.model.creation.MediaCaptureConfig r1 = r1.A09
            if (r1 == 0) goto L_0x0128
            boolean r1 = r1.A08
            if (r1 == 0) goto L_0x0128
            boolean r1 = X.2Ht.A00
            if (r1 == 0) goto L_0x0128
            X.AtJ r2 = new X.AtJ
            r1 = r23
            r2.<init>(r6, r5, r1)
            r0.A00 = r2
        L_0x0128:
            if (r43 == 0) goto L_0x013a
            X.0nO r2 = X.0nY.A00()
            X.9l1 r1 = new X.9l1
            r1.<init>(r5, r0)
            r2.ATE(r1)
            return r32
        L_0x0137:
            r0 = 0
            goto L_0x0028
        L_0x013a:
            boolean r32 = r0.A00()
            return r32
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40437Ac8.Cmo(X.MV7, com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel, X.KgB[], boolean):boolean");
    }

    public final void ECc() {
        C364988mL r0 = this.A09;
        if (r0 != null) {
            r0.A03();
            this.A09 = null;
        }
        this.A0K.A04();
        this.A0F = true;
    }

    public final void ETK(CropInfo cropInfo) {
        this.A0N.A01 = cropInfo;
        this.A0A = cropInfo;
        this.A0J = true;
    }

    public final void EWo(FilterModel filterModel) {
        String str;
        if (filterModel != null) {
            if (filterModel instanceof FilterChain) {
                SparseArray sparseArray = ((FilterChain) filterModel).A01;
                SurfaceCropFilterModel surfaceCropFilterModel = (SurfaceCropFilterModel) ((FilterModel) sparseArray.get(3));
                if (surfaceCropFilterModel != null) {
                    if (this.A0P) {
                        str = "gainmap_alpha";
                    } else {
                        str = "surface_crop";
                    }
                    surfaceCropFilterModel.A08 = str;
                }
                GainmapFilter gainmapFilter = (GainmapFilter) ((FilterModel) sparseArray.get(28));
                this.A04 = gainmapFilter;
                if (gainmapFilter != null) {
                    gainmapFilter.A0A = this.A0P;
                }
            }
            A00(this).A07(filterModel);
        }
    }

    public final void Ef6(int i, int i2) {
        this.A03 = i;
        this.A02 = i2;
        C63928LDl lDl = this.A0I;
        if (lDl != null) {
            lDl.A00(i, i2);
        }
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.Q1d, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v1, types: [java.lang.Object, X.Q4k] */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0047, code lost:
        if (X.2Ht.A05(r15) == false) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C40437Ac8(android.content.Context r12, X.C344207rU r13, X.C10954S2m r14, com.instagram.common.session.UserSession r15, com.instagram.creation.base.CropInfo r16, X.C3499582p r17, X.C364868m9 r18, X.C364888mB r19, X.AR4 r20, X.C364808m2 r21, int r22, boolean r23) {
        /*
            r11 = this;
            r11.<init>()
            r0 = -1
            r11.A03 = r0
            r11.A02 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r11.A01 = r0
            r11.A00 = r0
            r3 = 0
            r11.A0H = r3
            r11.A0B = r3
            r11.A0R = r12
            r8 = r21
            r11.A0U = r8
            r5 = r16
            r11.A0A = r5
            r4 = r15
            r11.A0S = r15
            r0 = r20
            r11.A0T = r0
            r11.A0K = r13
            r0 = r18
            r11.A0M = r0
            r2 = r17
            r11.A0L = r2
            r9 = r22
            r11.A0Q = r9
            r0 = r23
            r11.A0O = r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            if (r1 < r0) goto L_0x0049
            boolean r0 = r8.Cdi()
            if (r0 == 0) goto L_0x0049
            boolean r1 = X.2Ht.A05(r15)
            r0 = 1
            if (r1 != 0) goto L_0x004a
        L_0x0049:
            r0 = 0
        L_0x004a:
            r11.A0P = r0
            r10 = 0
            r2.getClass()
            X.82q r6 = r2.A00()
            X.8mI r2 = new X.8mI
            r7 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r11.A0N = r2
            r2.A04 = r0
            r0 = 1
            r2.A03 = r0
            r4 = r14
            if (r14 == 0) goto L_0x007d
            X.S5Y r6 = new X.S5Y
            r6.<init>(r3, r3)
            X.Q1d r5 = new X.Q1d
            r5.<init>()
            X.Q4k r7 = new X.Q4k
            r7.<init>()
            java.lang.String r9 = "0"
            r8 = r3
            X.SOP r0 = r4.A00(r5, r6, r7, r8, r9)
            r11.A0G = r0
        L_0x007d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40437Ac8.<init>(android.content.Context, X.7rU, X.S2m, com.instagram.common.session.UserSession, com.instagram.creation.base.CropInfo, X.82p, X.8m9, X.8mB, X.AR4, X.8m2, int, boolean):void");
    }

    public final void EEp() {
        A00(this).A0C(new C40822Ajs(this));
    }

    public final void EZ3(float f) {
        this.A01 = f;
    }

    public final void Eee(C63928LDl lDl) {
        this.A0I = lDl;
    }

    public final void EjJ(C64444Lbz lbz) {
        this.A0H = lbz;
    }
}
