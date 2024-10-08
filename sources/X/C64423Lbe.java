package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Gainmap;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: X.Lbe  reason: case insensitive filesystem */
public final class C64423Lbe implements C365328mu {
    public final UserSession A00;
    public final LDP A01;
    public final MV7 A02;
    public final LO5 A03;
    public final Context A04;
    public final Handler A05 = AnonymousClass7TF.A0D();
    public final L6Q A06;
    public final L4D A07;
    public final C364958mI A08;
    public final FilterGroupModel A09;
    public final C364808m2 A0A;
    public final C62461KgB[] A0B;

    public C64423Lbe(Context context, UserSession userSession, C364958mI r6, MV7 mv7, FilterGroupModel filterGroupModel, C364808m2 r9, C62461KgB[] kgBArr) {
        C51972G9s.A1D(r9, r6);
        this.A04 = context;
        this.A00 = userSession;
        this.A0A = r9;
        this.A08 = r6;
        this.A09 = filterGroupModel;
        this.A0B = kgBArr;
        this.A02 = mv7;
        LDP ldp = new LDP(userSession, r9, AnonymousClass05K.A01);
        this.A01 = ldp;
        boolean z = ldp.A02;
        this.A06 = new L6Q(userSession, true, z);
        this.A07 = new L4D(userSession, z);
        this.A03 = new LO5(context, userSession, mv7, (Integer) null);
    }

    public final /* synthetic */ void CMb(C364988mL r1) {
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [java.lang.Object, com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter] */
    public final void EEr(C364988mL r31) {
        Object obj;
        String A0m;
        String str;
        IllegalStateException illegalStateException;
        int i;
        LAM lam;
        LEA lea;
        Point A012;
        Throwable th;
        UserSession userSession;
        int A042;
        C364988mL r2 = r31;
        ArrayList A0q = AnonymousClass7TF.A0q(r2, 0);
        try {
            Context context = this.A04;
            UserSession userSession2 = this.A00;
            L6Q l6q = this.A06;
            L4D l4d = this.A07;
            boolean z = this.A01.A02;
            Object[] objArr = this.A0B;
            int length = objArr.length;
            ArrayList A002 = C63202Kt9.A00(context, userSession2, l6q, l4d, (C62461KgB[]) Arrays.copyOf(objArr, length), 1, false, z, false);
            if (length == 0) {
                obj = "empty";
            } else {
                obj = objArr[0];
            }
            if (A002.isEmpty()) {
                A0m = AnonymousClass7TG.A0m(obj, "Empty RenderConfigs ", AnonymousClass7TE.A1A());
                str = "ImageFinalRenderer";
                illegalStateException = new IllegalStateException();
            } else {
                FilterGroupModel filterGroupModel = this.A09;
                if (filterGroupModel == null) {
                    A0m = AnonymousClass7TG.A0m(obj, "FilterGroupModel is null  ", AnonymousClass7TE.A1A());
                    str = "ImageFinalRenderer";
                    illegalStateException = new IllegalStateException();
                } else {
                    FilterChain filterChain = ((FilterGroupModelImpl) filterGroupModel).A02;
                    r2.A07(filterChain);
                    FilterModel filterModel = (FilterModel) filterChain.A01.get(3);
                    if (filterModel instanceof SurfaceCropFilterModel) {
                        ? obj2 = new Object();
                        obj2.A00 = (SurfaceCropFilterModel) filterModel;
                        AnonymousClass9WF r6 = new AnonymousClass9WF(this.A08, obj2, this.A0A, z);
                        r2.A0B(r6);
                        r2.A0A(r6.A02);
                        0rm A11 = C51965G9l.A11();
                        r6.A00 = new C64349LaR(filterChain, this, A11);
                        AnonymousClass9WF.A00(r6);
                        SurfaceCropFilterModel surfaceCropFilterModel = obj2.A00;
                        Point point = new Point(surfaceCropFilterModel.A05, surfaceCropFilterModel.A04);
                        Point A0C = obj2.A0C(false);
                        int i2 = point.x;
                        if (i2 <= 0 || (i = point.y) <= 0 || A0C.x <= 0 || A0C.y <= 0) {
                            r2.A0D(AnonymousClass7TG.A0m(obj, "Invalid Sizes ", AnonymousClass7TE.A1A()), "ImageFinalRenderer", AnonymousClass7TE.A0z(002.A10("Invalid Sizes input: ", " x ", ", output: ", " x ", point.x, point.y, A0C.x, A0C.y)));
                            Iterator it = A002.iterator();
                            while (it.hasNext()) {
                                C63203KtA.A00((LAM) it.next(), AnonymousClass05K.A0C, A0q);
                            }
                            this.A05.post(new M6L(this, A0q));
                            r2.A03();
                        }
                        r2.A06(i2, i, 0, false, false);
                        Iterator it2 = A002.iterator();
                        while (it2.hasNext()) {
                            lam = (LAM) it2.next();
                            C367428qj r10 = (C367428qj) A11.A00;
                            int i3 = point.x;
                            C62461KgB kgB = lam.A02;
                            if (kgB == C62461KgB.UPLOAD) {
                                A012 = LS5.A00(A0C, userSession2, i3, true, lam.A05, true, true);
                            } else {
                                A012 = LS5.A01(A0C, userSession2, true);
                            }
                            r2.A05(A012.x, A012.y);
                            r2.A09((C346267ut) null, A012.x, A012.y);
                            C344727sK r12 = r2.A0C;
                            C344727sK.A00(r12, (Long) null);
                            Bitmap A003 = r2.A00();
                            if (Build.VERSION.SDK_INT < 34 || !z || r10 == null || !r10.A04.A00) {
                                if (A003 == null) {
                                    th = AnonymousClass7TE.A0z("Output Bitmap is null.");
                                    throw th;
                                }
                            } else if (A003 != null) {
                                float A004 = 2Ht.A00(userSession2);
                                int A062 = AnonymousClass7TE.A06((float) A012.x, A004);
                                int A063 = AnonymousClass7TE.A06((float) A012.y, A004);
                                r2.A05(A062, A063);
                                r2.A09((C346267ut) null, A062, A063);
                                C344727sK.A00(r12, (Long) null);
                                Bitmap A005 = r2.A00();
                                if (A005 != null) {
                                    Gainmap gainmap = new Gainmap(A005.copy(Bitmap.Config.ALPHA_8, false));
                                    A005.recycle();
                                    gainmap.setDisplayRatioForFullHdr(r10.A05.A00);
                                    float[] fArr = (float[]) r10.A07.A00;
                                    gainmap.setEpsilonHdr(fArr[0], fArr[1], fArr[2]);
                                    float[] fArr2 = (float[]) r10.A08.A00;
                                    gainmap.setEpsilonSdr(fArr2[0], fArr2[1], fArr2[2]);
                                    float[] fArr3 = (float[]) r10.A09.A00;
                                    gainmap.setGamma(fArr3[0], fArr3[1], fArr3[2]);
                                    gainmap.setMinDisplayRatioForHdrTransition(r10.A06.A00);
                                    float[] fArr4 = (float[]) r10.A0A.A00;
                                    gainmap.setRatioMax(fArr4[0], fArr4[1], fArr4[2]);
                                    float[] fArr5 = (float[]) r10.A0B.A00;
                                    gainmap.setRatioMin(fArr5[0], fArr5[1], fArr5[2]);
                                    A003.setGainmap(gainmap);
                                }
                            } else {
                                th = AnonymousClass7TE.A0z("Output Bitmap is null.");
                                throw th;
                            }
                            LO5 lo5 = this.A03;
                            int i4 = point.x;
                            int i5 = point.y;
                            int i6 = A012.x;
                            int i7 = A012.y;
                            AnonymousClass4MS r16 = new AnonymousClass4MS();
                            if (kgB == C62461KgB.GALLERY) {
                                userSession = lo5.A01;
                                A042 = AnonymousClass7TF.A0Y(0Tu.A05, userSession, 36592447052120568L).intValue();
                                lo5.A04.add(C64001LId.A01(A003, lam, i6, i7, A042));
                            } else {
                                userSession = lo5.A01;
                                A042 = DbS.A04(0Tu.A05, userSession, 36609382109091690L);
                                if (A042 == 0) {
                                    A042 = LTE.A02(userSession, i6);
                                }
                                r16.A02();
                                boolean A022 = C64001LId.A01(A003, lam, i6, i7, A042).A02(userSession);
                                r16.A03();
                                if (A022) {
                                    0mb.A03(lam.A04);
                                } else {
                                    StringBuilder A1A = AnonymousClass7TE.A1A();
                                    A1A.append("Failure writing ");
                                    A1A.append(kgB);
                                    th = JTO.A0u(AnonymousClass7TF.A0l(" image to file", A1A));
                                    throw th;
                                }
                            }
                            0KC.A0P("ImageRendererSaveHelper", "Rendered %s quality %s %dx%d to %dx%d, %s", new Object[]{kgB, Integer.valueOf(A042), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), LTE.A03(userSession)});
                            lea = new LEA(A0C, A012, lam, (Double) null, (Double) null, (Exception) null, AnonymousClass05K.A00, A042);
                            A0q.add(lea);
                        }
                        this.A05.post(new M6L(this, A0q));
                        r2.A03();
                    }
                    A0m = AnonymousClass7TG.A0m(obj, "SurfaceCropFilter not found  ", AnonymousClass7TE.A1A());
                    str = "ImageFinalRenderer";
                    illegalStateException = new IllegalStateException();
                }
            }
            r2.A0D(A0m, str, illegalStateException);
            this.A05.post(new M6L(this, A0q));
            r2.A03();
        } catch (Throwable th2) {
            this.A05.post(new M6L(this, A0q));
            r2.A03();
            throw th2;
        }
    }

    public final void cancel() {
        this.A05.post(new M2P(this));
    }
}
