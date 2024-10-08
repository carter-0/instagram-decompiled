package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.TextureView;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.gpuimageloader.impl.instagram.IgGPUImageLoader;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.8m6  reason: invalid class name and case insensitive filesystem */
public final class C364838m6 implements C364848m7 {
    public int A00 = -1;
    public int A01 = -1;
    public IgGPUImageLoader A02;
    public C365398n2 A03;
    public C368528sn A04;
    public C3503284f A05;
    public AnonymousClass8KS A06;
    public C365358my A07;
    public C367398qg A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public C63928LDl A0C;
    public final int A0D;
    public final Context A0E;
    public final C344207rU A0F;
    public final UserSession A0G;
    public final TargetViewSizeProvider A0H;
    public final C364868m9 A0I;
    public final C364958mI A0J;
    public final C364898mC A0K;
    public final AtomicBoolean A0L = new AtomicBoolean(false);
    public final boolean A0M;
    public final int A0N;
    public final CropInfo A0O;
    public final C364808m2 A0P;

    public C364838m6(Context context, Bitmap bitmap, C344207rU r12, UserSession userSession, CropInfo cropInfo, TargetViewSizeProvider targetViewSizeProvider, C364868m9 r16, C364888mB r17, C364808m2 r18, int i, int i2, boolean z) {
        this.A0E = context;
        C364808m2 r6 = r18;
        this.A0P = r6;
        this.A0O = cropInfo;
        this.A0G = userSession;
        this.A0F = r12;
        this.A0I = r16;
        int i3 = i;
        this.A0N = i3;
        this.A0D = i2;
        this.A0M = z;
        this.A0H = targetViewSizeProvider;
        long j = C364898mC.A05;
        this.A0K = new C364898mC(new C364908mD(this));
        Bitmap bitmap2 = bitmap;
        this.A0J = new C364958mI(bitmap2, userSession, cropInfo, (C3499782r) null, r17, r6, i3, true);
    }

    public final void A00() {
        this.A09 = true;
        C364898mC r2 = this.A0K;
        r2.A03 = true;
        r2.A04 = false;
        if (r2.A03) {
            r2.A02.A00(r2.A01);
        }
    }

    public final /* synthetic */ void AOu() {
    }

    public final /* synthetic */ void APs(FilterGroupModel filterGroupModel, 0sP r2, int i, int i2) {
    }

    public final /* synthetic */ void APz(FilterGroupModel filterGroupModel) {
    }

    public final /* synthetic */ void CMs(AnonymousClass80G r1, int i, int i2) {
    }

    public final /* synthetic */ void CMt(TextureView textureView, LNz lNz, int i, int i2) {
    }

    public final boolean Cmo(MV7 mv7, FilterGroupModel filterGroupModel, C62461KgB[] kgBArr, boolean z) {
        Object obj = null;
        obj.getClass();
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ void ETK(CropInfo cropInfo) {
    }

    public final /* synthetic */ void EZ3(float f) {
    }

    public final /* synthetic */ void Eij(C63694L3e l3e) {
    }

    public final /* synthetic */ void EjJ(C64444Lbz lbz) {
    }

    public final void Ekd() {
        this.A0B = true;
    }

    public final void AOv() {
        this.A0F.A04();
        this.A0J.A06();
        IgGPUImageLoader igGPUImageLoader = this.A02;
        if (igGPUImageLoader != null) {
            igGPUImageLoader.releaseImage();
            this.A02 = null;
        }
    }

    public final /* synthetic */ CropInfo Asr() {
        return null;
    }

    public final /* synthetic */ boolean CQu() {
        return false;
    }

    public final /* synthetic */ boolean CUZ() {
        return false;
    }

    public final void ECc() {
        this.A0F.A04();
        this.A0B = true;
    }

    public final void EEp() {
        ((C345807u7) this.A0F.A02(C345807u7.A00)).Avx().A0C(new C365088mV(this));
    }

    public final void EWo(FilterModel filterModel) {
        if (filterModel != null) {
            ((C345807u7) this.A0F.A02(C345807u7.A00)).Avx().A07(filterModel);
        }
    }

    public final void Ef6(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        C63928LDl lDl = this.A0C;
        if (lDl != null) {
            lDl.A00(i, i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0091, code lost:
        if (r4 == false) goto L_0x0093;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EoR(android.view.View r16, X.AnonymousClass8KS r17, com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter r18) {
        /*
            r15 = this;
            r12 = r17
            int r6 = r12.getWidth()
            int r5 = r12.getHeight()
            float r1 = (float) r6
            float r0 = (float) r5
            float r1 = r1 / r0
            r0 = 1058013184(0x3f100000, float:0.5625)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r11 = r15
            if (r0 == 0) goto L_0x004c
            java.lang.String r2 = "Invalid aspect ratio in output view"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>(r2)
            X.0wj r1 = X.0wj.A01
            r0 = 817902771(0x30c034b3, float:1.3984817E-9)
            X.0f9 r3 = r1.AEf(r2, r0)
            java.lang.String r0 = "outputWidth"
            r3.ABO(r0, r6)
            java.lang.String r0 = "outputHeight"
            r3.ABO(r0, r5)
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r0 = r15.A0H
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r0 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r0
            X.81W r2 = r0.A0K
            int r1 = r2.getWidth()
            java.lang.String r0 = "expectedWidth"
            r3.ABO(r0, r1)
            int r1 = r2.getHeight()
            java.lang.String r0 = "expectedHeight"
            r3.ABO(r0, r1)
            r3.ERJ(r4)
            r3.report()
        L_0x004c:
            X.7rU r7 = r15.A0F
            boolean r0 = r7.A08()
            if (r0 != 0) goto L_0x0057
            r7.A03()
        L_0x0057:
            X.7rc r0 = X.C344267ra.A01
            X.7rb r2 = r7.A02(r0)
            X.7ra r2 = (X.C344267ra) r2
            r2.EIH()
            X.8m9 r1 = r15.A0I
            r1.getClass()
            X.8mT r0 = new X.8mT
            r0.<init>(r1)
            X.7te r2 = (X.C345517te) r2
            r2.A00 = r0
            X.7rc r0 = X.C345807u7.A00
            X.7rb r0 = r7.A02(r0)
            X.7u7 r0 = (X.C345807u7) r0
            X.8mL r10 = r0.Avx()
            boolean r4 = android.os.Process.is64Bit()
            com.instagram.common.session.UserSession r8 = r15.A0G
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321975781566330(0x810aa50000277a, double:3.033501968895072E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            r3 = 1
            if (r0 == 0) goto L_0x0093
            r14 = 1
            if (r4 != 0) goto L_0x0094
        L_0x0093:
            r14 = 0
        L_0x0094:
            X.8mU r9 = new X.8mU
            r13 = r18
            r9.<init>(r10, r11, r12, r13, r14)
            r10.A0C(r9)
            X.1X6 r4 = X.1X6.A00
            android.content.Context r5 = r15.A0E
            r9 = 0
            r6 = r16
            r10 = r9
            X.8sn r2 = r4.A00(r5, r6, r7, r8, r9, r10)
            X.8qg r0 = r15.A08
            if (r0 != 0) goto L_0x00ba
            X.8qe r1 = new X.8qe
            r1.<init>(r7)
            X.8qf r0 = new X.8qf
            r0.<init>(r2, r1)
            r15.A08 = r0
        L_0x00ba:
            r15.A04 = r2
            java.util.concurrent.atomic.AtomicBoolean r0 = r15.A0L
            r0.set(r3)
            X.84f r1 = r15.A05
            if (r1 == 0) goto L_0x00dd
            X.81C r0 = r1.A00
            X.81E r0 = r0.A00()
            X.84i r0 = (X.C3503584i) r0
            r0.ENP(r2)
            X.81C r0 = r1.A00
            X.81E r1 = r0.A00()
            X.84i r1 = (X.C3503584i) r1
            X.8qg r0 = r15.A08
            r1.ENQ(r0)
        L_0x00dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C364838m6.EoR(android.view.View, X.8KS, com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter):void");
    }

    public final void Eee(C63928LDl lDl) {
        this.A0C = lDl;
    }
}
