package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.view.TextureView;
import android.view.View;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* renamed from: X.LoT  reason: case insensitive filesystem */
public final class C65164LoT implements C364848m7, C364888mB, C66444MRy {
    public int A00;
    public int A01;
    public FilterChain A02;
    public C364988mL A03;
    public C63694L3e A04;
    public AnonymousClass80G A05;
    public boolean A06;
    public CropInfo A07;
    public C63928LDl A08;
    public boolean A09;
    public final Context A0A;
    public final Handler A0B = AnonymousClass7TF.A0D();
    public final UserSession A0C;
    public final JWI A0D;
    public final JWI A0E;
    public final JWJ A0F;
    public final LDP A0G;
    public final C364958mI A0H;
    public final C364808m2 A0I;
    public final Runnable A0J;
    public final AnonymousClass8KG A0K;
    public final B1J A0L;
    public volatile int A0M;
    public volatile int A0N;
    public volatile SurfaceCropFilter A0O;
    public volatile C365358my A0P;
    public volatile boolean A0Q;
    public volatile boolean A0R;

    public C65164LoT(Context context, UserSession userSession, CropInfo cropInfo, JWI jwi, JWI jwi2, JWJ jwj, C364808m2 r19, int i) {
        JWJ jwj2 = jwj;
        AnonymousClass7TG.A1Q(userSession, jwj2);
        this.A0A = context;
        this.A0C = userSession;
        this.A0F = jwj2;
        C364808m2 r9 = r19;
        this.A0I = r9;
        this.A07 = cropInfo;
        this.A0D = jwi;
        this.A0E = jwi2;
        this.A0G = new LDP(userSession, r9, AnonymousClass05K.A00);
        C364958mI r3 = new C364958mI((Bitmap) null, userSession, this.A07, (C3499782r) null, this, r9, i, false);
        this.A0H = r3;
        this.A0Q = true;
        this.A0J = new M2S(this);
        this.A0K = new C64929LkU(this);
        this.A0L = new C64930LkV(this);
        r3.A03 = true;
    }

    public final /* synthetic */ void AOv() {
    }

    public final void CMs(AnonymousClass80G r4, int i, int i2) {
        0qQ.A0B(r4, 0);
        if (!0qQ.A0K(this.A05, r4)) {
            AnonymousClass80G r0 = this.A05;
            if (r0 != null) {
                AnonymousClass8KG r1 = this.A0K;
                0qQ.A0B(r1, 0);
                r0.A0E.A00.remove(r1);
            }
            AnonymousClass80G r12 = this.A05;
            if (r12 != null) {
                r12.A09 = null;
            }
            r4.A08(this.A0K);
            boolean z = this.A0G.A02;
            r4.A0A = z;
            r4.A00 = 1.0f;
            if (z) {
                B1J b1j = this.A0L;
                r4.A09 = b1j;
                if (b1j != null) {
                    b1j.DIo(r4.A01);
                }
            }
        }
        this.A05 = r4;
        this.A01 = i;
        this.A00 = i2;
        this.A06 = false;
        this.A0R = false;
    }

    public final /* synthetic */ void CMt(TextureView textureView, LNz lNz, int i, int i2) {
    }

    public final boolean Cmo(MV7 mv7, FilterGroupModel filterGroupModel, C62461KgB[] kgBArr, boolean z) {
        0qQ.A0B(kgBArr, 3);
        this.A0F.A02.post(new M9P(this, mv7, filterGroupModel, kgBArr));
        return true;
    }

    public final /* synthetic */ void ECc() {
    }

    public final /* synthetic */ void EWo(FilterModel filterModel) {
    }

    public final /* synthetic */ void EZ3(float f) {
    }

    public final /* synthetic */ void EjJ(C64444Lbz lbz) {
    }

    public final /* synthetic */ void Ekd() {
    }

    public final /* synthetic */ void EoR(View view, AnonymousClass8KS r2, SurfaceCropFilter surfaceCropFilter) {
    }

    public static final void A00(C365328mu r2, C65164LoT loT) {
        JWJ jwj = loT.A0F;
        C344207rU r0 = jwj.A00;
        if (r0 != null) {
            r0.A06();
            loT.E25();
            C364988mL A002 = jwj.A00(r2);
            if (A002 != null) {
                A002.A04();
                JWI jwi = loT.A0E;
                JTR.A1A(jwi.A00.A02, jwi.A01);
                return;
            }
        }
        r2.cancel();
    }

    public final void AOu() {
        this.A0F.A02.post(new M2R(this));
    }

    public final void APs(FilterGroupModel filterGroupModel, 0sP r4, int i, int i2) {
        this.A0F.A02.post(new C66056M9p(this, filterGroupModel, r4, i, i2));
    }

    public final void APz(FilterGroupModel filterGroupModel) {
        if (filterGroupModel != null) {
            FilterChain filterChain = ((FilterGroupModelImpl) filterGroupModel).A02;
            if (!0qQ.A0K(filterChain, this.A02)) {
                this.A02 = filterChain;
                C365358my r0 = this.A0P;
                if (r0 != null) {
                    this.A0G.A00(filterChain, r0.B8o());
                }
            }
        }
        EEp();
    }

    public final CropInfo Asr() {
        return this.A07;
    }

    public final boolean CQu() {
        return this.A09;
    }

    public final boolean CUZ() {
        return this.A0G.A02;
    }

    public final void DTX(CropInfo cropInfo, String str, int i) {
        JWH.A01(cropInfo, this.A0D.A03, str, i);
    }

    public final void E25() {
        Handler handler = this.A0F.A02;
        Runnable runnable = this.A0J;
        handler.removeCallbacks(runnable);
        handler.postAtFrontOfQueue(runnable);
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter] */
    public final void EEp() {
        int i;
        int i2;
        int A052;
        FilterChain filterChain = this.A02;
        if (filterChain != null) {
            FilterModel filterModel = (FilterModel) filterChain.A01.get(3);
            if (filterModel instanceof SurfaceCropFilterModel) {
                SurfaceCropFilterModel surfaceCropFilterModel = (SurfaceCropFilterModel) filterModel;
                ? obj = new Object();
                obj.A00 = surfaceCropFilterModel;
                this.A0O = obj;
                float f = surfaceCropFilterModel.A01;
                if (f > 0.0f && (i = this.A01) > 0 && (i2 = this.A00) > 0) {
                    int max = Math.max(i, i2);
                    float f2 = (float) max;
                    if (f < 1.0f) {
                        A052 = max;
                        max = AnonymousClass7TE.A06(f2, f);
                    } else {
                        A052 = JTO.A05(f2, f);
                    }
                    if (!(this.A0N == max && this.A0M == A052)) {
                        this.A0N = max;
                        this.A0M = A052;
                        C63928LDl lDl = this.A08;
                        if (lDl != null) {
                            lDl.A00(max, A052);
                        }
                    }
                }
            }
        }
        this.A0F.A02.post(new M2T(this));
    }

    public final void ETK(CropInfo cropInfo) {
        this.A07 = cropInfo;
        this.A0H.A01 = cropInfo;
        this.A09 = true;
    }

    public final void Ef6(int i, int i2) {
        if (i > 0 && i2 > 0) {
            this.A01 = i;
            this.A00 = i2;
        }
    }

    public final void Eee(C63928LDl lDl) {
        this.A08 = lDl;
    }

    public final void Eij(C63694L3e l3e) {
        this.A04 = l3e;
    }
}
