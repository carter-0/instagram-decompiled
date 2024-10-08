package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.TextureView;
import android.view.View;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter;
import com.instagram.filterkit.filter.FilterGroup;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import java.util.ArrayList;

/* renamed from: X.LoS  reason: case insensitive filesystem */
public final class C65163LoS implements C364848m7 {
    public MV7 A00;
    public C63928LDl A01;
    public LNz A02;
    public C365358my A03;
    public XBw A04;
    public boolean A05;
    public boolean A06;
    public TextureView A07 = null;
    public SOP A08;
    public C64444Lbz A09 = null;
    public LNz A0A;
    public C65333LrY A0B;
    public final int A0C;
    public final Handler A0D = AnonymousClass7TF.A0D();
    public final UserSession A0E;
    public final C59804JYx A0F;
    public final C59804JYx A0G;
    public final C364958mI A0H;
    public final C364898mC A0I;
    public final Context A0J;
    public final L6Q A0K;
    public final L4D A0L;
    public final C364888mB A0M;
    public final C63627L0p A0N;
    public final C66488MTr A0O;
    public volatile FilterGroupModel A0P;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0018, code lost:
        if (r1 != false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean A01() {
        /*
            r3 = this;
            monitor-enter(r3)
            X.JYx r1 = r3.A0G     // Catch:{ all -> 0x001d }
            X.LSA r0 = r1.A00()     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x001a
            X.LSA r0 = r1.A00()     // Catch:{ all -> 0x001d }
            java.lang.Object r2 = r0.A04     // Catch:{ all -> 0x001d }
            monitor-enter(r2)     // Catch:{ all -> 0x001d }
            boolean r1 = r0.A00     // Catch:{ all -> 0x0014 }
            monitor-exit(r2)     // Catch:{ all -> 0x0014 }
            goto L_0x0017
        L_0x0014:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0014 }
            throw r0     // Catch:{ all -> 0x001d }
        L_0x0017:
            r0 = 1
            if (r1 == 0) goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            monitor-exit(r3)
            return r0
        L_0x001d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65163LoS.A01():boolean");
    }

    public final synchronized void AOv() {
        C365358my r0 = this.A03;
        if (r0 != null) {
            r0.cleanup();
            this.A03 = null;
        }
        this.A05 = false;
        this.A00 = null;
    }

    public final /* synthetic */ void APs(FilterGroupModel filterGroupModel, 0sP r2, int i, int i2) {
    }

    public final /* synthetic */ void CMs(AnonymousClass80G r1, int i, int i2) {
    }

    public final synchronized boolean Cmo(MV7 mv7, FilterGroupModel filterGroupModel, C62461KgB[] kgBArr, boolean z) {
        boolean z2;
        TextureView textureView = this.A07;
        SOP sop = this.A08;
        if (!(sop == null || textureView == null || textureView.getBitmap() == null || this.A09 == null)) {
            C53394GnR gnR = new C53394GnR(textureView.getBitmap(), 0);
            C64444Lbz lbz = this.A09;
            0qQ.A0B(lbz, 1);
            sop.A09.submit(new C13032TIo(gnR, lbz, sop));
        }
        if (z) {
            if (182.A06(0Tu.A05, this.A0E, 36322693041105248L)) {
                0nY.A00().ATE(new KJ6(mv7, this, filterGroupModel, kgBArr));
                z2 = true;
            }
        }
        z2 = A00(mv7, this, filterGroupModel, kgBArr);
        return z2;
    }

    public final /* synthetic */ void ECc() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0011, code lost:
        if (r0 != false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void EEp() {
        /*
            r5 = this;
            monitor-enter(r5)
            X.LrY r4 = r5.A0B     // Catch:{ all -> 0x004d }
            boolean r0 = com.instagram.util.creation.ShaderBridge.sLoaded     // Catch:{ all -> 0x004d }
            if (r0 != 0) goto L_0x0013
            java.lang.Object r1 = com.instagram.util.creation.ShaderBridge.sLock     // Catch:{ all -> 0x004d }
            monitor-enter(r1)     // Catch:{ all -> 0x004d }
            boolean r0 = com.instagram.util.creation.ShaderBridge.sLoaded     // Catch:{ all -> 0x000e }
            monitor-exit(r1)     // Catch:{ all -> 0x000e }
            goto L_0x0011
        L_0x000e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x000e }
            goto L_0x004a
        L_0x0011:
            if (r0 == 0) goto L_0x004b
        L_0x0013:
            if (r4 == 0) goto L_0x004b
            boolean r0 = r5.A01()     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x004b
            X.JYx r0 = r5.A0G     // Catch:{ all -> 0x004d }
            X.LSA r3 = r0.A00()     // Catch:{ all -> 0x004d }
            r3.getClass()     // Catch:{ all -> 0x004d }
            java.lang.Object r2 = r3.A04     // Catch:{ all -> 0x004d }
            monitor-enter(r2)     // Catch:{ all -> 0x004d }
            boolean r0 = r3.A00     // Catch:{ all -> 0x0048 }
            if (r0 != 0) goto L_0x003b
            monitor-exit(r2)     // Catch:{ all -> 0x0048 }
            java.util.Queue r1 = r3.A07     // Catch:{ all -> 0x004d }
            boolean r0 = r1.contains(r4)     // Catch:{ all -> 0x004d }
            if (r0 != 0) goto L_0x0037
            r1.offer(r4)     // Catch:{ all -> 0x004d }
        L_0x0037:
            X.LSA.A01(r3)     // Catch:{ all -> 0x004d }
            goto L_0x004b
        L_0x003b:
            java.lang.String r1 = "requestRender called after requestDestroy "
            java.lang.String r0 = r3.A05     // Catch:{ all -> 0x0048 }
            java.lang.String r0 = X.002.A0R(r1, r0)     // Catch:{ all -> 0x0048 }
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ all -> 0x0048 }
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0048 }
        L_0x004a:
            throw r0     // Catch:{ all -> 0x004d }
        L_0x004b:
            monitor-exit(r5)
            return
        L_0x004d:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65163LoS.EEp():void");
    }

    public final /* synthetic */ void EWo(FilterModel filterModel) {
    }

    public final /* synthetic */ void EZ3(float f) {
    }

    public final /* synthetic */ void Eij(C63694L3e l3e) {
    }

    public final /* synthetic */ void Ekd() {
    }

    public final /* synthetic */ void EoR(View view, AnonymousClass8KS r2, SurfaceCropFilter surfaceCropFilter) {
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [java.lang.Object, com.instagram.filterkit.filter.FilterGroup$UnifiedFilterParamCallback] */
    public static boolean A00(MV7 mv7, C65163LoS loS, FilterGroupModel filterGroupModel, C62461KgB... kgBArr) {
        C65163LoS loS2 = loS;
        loS2.A0P = filterGroupModel;
        MV7 mv72 = loS2.A00;
        if (mv72 != null) {
            mv72.Ddi();
        }
        loS2.A00 = mv7;
        Context context = loS2.A0J;
        UserSession userSession = loS2.A0E;
        ArrayList A002 = C63202Kt9.A00(context, userSession, loS2.A0K, loS2.A0L, kgBArr, 1, false, false, false);
        if (A002.size() == 0) {
            11Z.A02(new M3Z(loS2));
            return false;
        } else if (loS2.A01()) {
            loS2.A00.Ddn();
            if (loS2.A0A == null) {
                loS2.A0A = new LNz();
            }
            MV7 mv73 = loS2.A00;
            C59804JYx jYx = loS2.A0G;
            LSA A003 = jYx.A00();
            A003.getClass();
            C66525MVd mVd = A003.A02;
            FilterGroupModel filterGroupModel2 = loS2.A0P;
            filterGroupModel2.getClass();
            FilterGroup filterGroup = new FilterGroup(((FilterGroupModelImpl) filterGroupModel2).A02, new Object());
            SurfaceCropFilter A004 = C395019z4.A00(loS2.A0P, "ImageRenderController");
            FilterGroupModel filterGroupModel3 = loS2.A0P;
            filterGroupModel3.getClass();
            Integer num = ((FilterGroupModelImpl) filterGroupModel3).A03;
            int i = loS2.A0C;
            C65334LrZ lrZ = new C65334LrZ(context, userSession, mv73, A004, mVd, loS2.A0A, filterGroup, num, A002, new MBH(loS2, 6), new MBH(loS2, 7), i);
            LSA A005 = jYx.A00();
            A005.getClass();
            synchronized (A005.A04) {
                if (A005.A00) {
                    throw AnonymousClass7TE.A0z(002.A0R("requestRender called after requestDestroy ", A005.A05));
                }
            }
            A005.A07.offer(lrZ);
            LSA.A01(A005);
            return true;
        } else {
            0KC.A0C("ImageRenderController", "maybeDoFinalRender(): failed render request, return false.");
            return false;
        }
    }

    public final void AOu() {
        C65333LrY lrY = this.A0B;
        if (lrY != null) {
            synchronized (lrY.A00) {
            }
            this.A0B = null;
            this.A04 = null;
            this.A02 = null;
        }
        this.A0F.A01.A05.A08(AnonymousClass05K.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, com.instagram.filterkit.filter.FilterGroup$UnifiedFilterParamCallback] */
    public final void APz(FilterGroupModel filterGroupModel) {
        this.A0P = filterGroupModel;
        C65333LrY lrY = this.A0B;
        if (lrY != null) {
            FilterGroupModel filterGroupModel2 = this.A0P;
            filterGroupModel2.getClass();
            lrY.A05 = new FilterGroup(((FilterGroupModelImpl) filterGroupModel2).A02, new Object());
            EEp();
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

    public final void ETK(CropInfo cropInfo) {
        this.A0H.A01 = cropInfo;
    }

    public final void Ef6(int i, int i2) {
        C65333LrY lrY = this.A0B;
        lrY.getClass();
        lrY.A09 = Integer.valueOf(i);
        lrY.A08 = Integer.valueOf(i2);
        C63928LDl lDl = this.A01;
        if (lDl != null) {
            lDl.A00(i, i2);
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.Q1d, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v2, types: [java.lang.Object, X.Q4k] */
    public C65163LoS(Context context, C10954S2m s2m, UserSession userSession, CropInfo cropInfo, C59804JYx jYx, C59804JYx jYx2, C364808m2 r22, int i) {
        C65157LoM loM = new C65157LoM(this);
        this.A0M = loM;
        this.A0N = new C63627L0p(this);
        this.A0O = new C65332LrX(this);
        this.A0J = context;
        UserSession userSession2 = userSession;
        this.A0E = userSession2;
        this.A0F = jYx;
        int i2 = i;
        this.A0C = i2;
        this.A0K = new L6Q(userSession2, true, false);
        this.A0L = new L4D(userSession2, false);
        this.A0H = new C364958mI((Bitmap) null, userSession2, cropInfo, (C3499782r) null, loM, r22, i2, false);
        C59804JYx jYx3 = jYx2;
        this.A0G = jYx3;
        synchronized (jYx3) {
            if (jYx3.A00 == null) {
                JWH jwh = jYx3.A01;
                Activity activity = jwh.A02;
                UserSession userSession3 = jwh.A03;
                LSA lsa = new LSA(activity, userSession3, jYx3);
                jYx3.A00 = lsa;
                lsa.A01 = 182.A06(0Tu.A05, userSession3, 36312629932721355L);
            }
        }
        long j = C364898mC.A05;
        this.A0I = new C364898mC(new C65162LoR(this));
        C10954S2m s2m2 = s2m;
        if (s2m != null) {
            this.A08 = s2m2.A00(new Object(), new S5Y((C13886Tj9) null, (String) null), new Object(), (Q1G) null, "0");
        }
    }

    public final void CMt(TextureView textureView, LNz lNz, int i, int i2) {
        if (A01()) {
            this.A05 = false;
            SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
            surfaceTexture.getClass();
            LNz lNz2 = this.A02;
            if (lNz2 == null || !2PP.A00(lNz2.A00(), surfaceTexture)) {
                this.A02 = new LNz(surfaceTexture);
                surfaceTexture.setDefaultBufferSize(i, i2);
                LSA A002 = this.A0G.A00();
                A002.getClass();
                C65333LrY lrY = new C65333LrY(this.A0N, A002.A02, this.A02);
                this.A0B = lrY;
                C65336Lrb lrb = new C65336Lrb(i, i2, true);
                this.A04 = lrb;
                lrY.A01.add(new M90(lrY, lrb, new MBH(this, 8)));
                this.A07 = textureView;
            }
        }
    }

    public final void Eee(C63928LDl lDl) {
        this.A01 = lDl;
    }

    public final void EjJ(C64444Lbz lbz) {
        this.A09 = lbz;
    }
}
