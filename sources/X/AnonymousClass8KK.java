package X;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8KK  reason: invalid class name */
public final class AnonymousClass8KK implements AnonymousClass8KL, AnonymousClass8KM {
    public C366398or A00;
    public TransformMatrixConfig A01;
    public TransformMatrixConfig A02;
    public C353998Kg A03;
    public long A04;
    public C351958Bc A05;
    public final int A06;
    public final int A07;
    public final UserSession A08;
    public final C3499582p A09;
    public final List A0A = new ArrayList();
    public final ViewGroup A0B;
    public final TargetViewSizeProvider A0C;
    public final C363188jJ A0D;

    private float A00(float f) {
        TransformMatrixConfig transformMatrixConfig = this.A01;
        if (transformMatrixConfig != null) {
            return Math.min(5.0f, Math.max(0.3f, f * Float.valueOf(transformMatrixConfig.A08.A01).floatValue()));
        }
        return 1.0f;
    }

    public static void A02(AnonymousClass8KK r2) {
        C366398or r0 = r2.A00;
        if (r0 != null && r0.A00) {
            AnonymousClass82Y r1 = r2.A09.A02.A01;
            if (r1.A03() == null) {
                return;
            }
            if (r1.A02() == null || r1.A02().A0D) {
                r2.A06();
                C353998Kg r02 = r2.A03;
                r02.getClass();
                r02.EEp();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r1 == false) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A03() {
        /*
            r3 = this;
            X.8or r0 = r3.A00
            if (r0 == 0) goto L_0x0009
            boolean r1 = r0.A00
            r0 = 1
            if (r1 != 0) goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            r2 = 0
            if (r0 == 0) goto L_0x0024
            X.82p r0 = r3.A09
            X.82o r0 = r0.A02
            X.82Y r0 = r0.A01
            X.8Cl r0 = r0.A03()
            if (r0 == 0) goto L_0x0024
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r0 = r3.A01
            if (r0 != 0) goto L_0x0025
            java.lang.String r1 = "FreeTransformPhotoController"
            java.lang.String r0 = "mTransformMatrixConfig is null"
            X.0kD.A01(r1, r0)
        L_0x0024:
            return r2
        L_0x0025:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8KK.A03():boolean");
    }

    public final Rect A04() {
        int i;
        int i2;
        TransformMatrixConfig transformMatrixConfig = this.A01;
        if (transformMatrixConfig == null || Math.abs(transformMatrixConfig.A08.A00) >= 0.1f) {
            return null;
        }
        if (transformMatrixConfig.A04 % 180 == 0) {
            i = transformMatrixConfig.A05;
            i2 = transformMatrixConfig.A03;
        } else {
            i = transformMatrixConfig.A03;
            i2 = transformMatrixConfig.A05;
        }
        Rect rect = new Rect();
        float f = (float) i;
        float f2 = (((float) this.A07) * 1.0f) / f;
        TransformMatrixParams transformMatrixParams = transformMatrixConfig.A08;
        float f3 = transformMatrixParams.A01;
        float f4 = (0.5f - (0.5f / f3)) * f;
        float f5 = ((transformMatrixParams.A02 * ((float) transformMatrixConfig.A07)) / f2) / f3;
        rect.left = Math.round(Math.min(f, Math.max(0.0f, f4 - f5)));
        rect.right = Math.round(Math.max(0.0f, Math.min(f, (f - f4) - f5)));
        float f6 = (float) i2;
        float f7 = (0.5f - (0.5f / (((f6 * f2) / ((float) this.A06)) * f3))) * f6;
        float f8 = ((transformMatrixParams.A03 * ((float) transformMatrixConfig.A06)) / f2) / f3;
        rect.top = Math.round(Math.min(f6, Math.max(0.0f, f7 - f8)));
        rect.bottom = Math.round(Math.max(0.0f, Math.min(f6, (f6 - f7) - f8)));
        return rect;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007c, code lost:
        if (X.182.A06(X.0Tu.A05, r4, 36327748217813667L) == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0095, code lost:
        if (X.1Au.A00(r1).A20() == false) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig A05(X.C352218Cl r14) {
        /*
            r13 = this;
            int r8 = r13.A07
            int r9 = r13.A06
            boolean r0 = r14.A0y
            if (r0 == 0) goto L_0x000c
            boolean r0 = r14.A19
            if (r0 != 0) goto L_0x0013
        L_0x000c:
            X.82p r0 = r13.A09
            X.82o r0 = r0.A02
            r0.A0I()
        L_0x0013:
            X.82p r0 = r13.A09
            X.82o r5 = r0.A02
            X.82Y r4 = r5.A01
            X.804 r1 = r4.A06
            boolean r0 = r1 instanceof X.AnonymousClass803
            if (r0 == 0) goto L_0x009b
            X.803 r1 = (X.AnonymousClass803) r1
            X.7kU r7 = r1.A00
        L_0x0023:
            r3 = 1060320051(0x3f333333, float:0.7)
            if (r7 == 0) goto L_0x0061
            int r0 = r14.A07
            int r0 = r0 % 180
            r3 = 0
            if (r0 == 0) goto L_0x0030
            r3 = 1
        L_0x0030:
            android.graphics.Rect r1 = r14.A00()
            int r0 = r14.A06
            int r2 = X.C364748lw.A00(r0, r1)
            android.graphics.Rect r1 = r14.A00()
            int r0 = r14.A09
            int r11 = X.C364748lw.A01(r0, r1)
            X.8Yz r0 = r4.A0X
            if (r0 == 0) goto L_0x005f
            X.80m r0 = r0.A08
            java.lang.Object r5 = r0.A00
            X.4yO r5 = (X.C279284yO) r5
        L_0x004e:
            X.82i r6 = r4.A0h
            r10 = r2
            if (r3 != 0) goto L_0x0055
            r10 = r11
            r11 = r2
        L_0x0055:
            r12 = 0
            float r3 = X.C394849yn.A00(r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x005a:
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r0 = X.C364738lv.A02(r14, r3, r8, r9)
            return r0
        L_0x005f:
            r5 = 0
            goto L_0x004e
        L_0x0061:
            X.1Xj r0 = r4.A08
            if (r0 == 0) goto L_0x007f
            boolean r0 = r0.A5v()
            if (r0 == 0) goto L_0x007f
            com.instagram.common.session.UserSession r4 = r13.A08
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327748217813667(0x810fe500033aa3, double:3.037152480821623E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 != 0) goto L_0x007f
            goto L_0x005a
        L_0x007f:
            boolean r0 = r5.A0F()
            if (r0 == 0) goto L_0x0098
            com.instagram.common.session.UserSession r1 = r13.A08
            boolean r0 = X.1NM.A03(r1)
            if (r0 != 0) goto L_0x0098
            X.1Av r0 = X.1Au.A00(r1)
            boolean r0 = r0.A20()
            if (r0 != 0) goto L_0x0098
            goto L_0x005a
        L_0x0098:
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L_0x005a
        L_0x009b:
            r7 = 0
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8KK.A05(X.8Cl):com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig");
    }

    public final void A06() {
        TransformMatrixConfig transformMatrixConfig = this.A01;
        if (transformMatrixConfig != null) {
            transformMatrixConfig.A03();
            for (AnonymousClass88P Dti : this.A0A) {
                TransformMatrixParams transformMatrixParams = transformMatrixConfig.A08;
                Dti.Dti(transformMatrixParams.A01, transformMatrixParams.A00, transformMatrixParams.A02 * ((float) transformMatrixConfig.A07), transformMatrixParams.A03 * ((float) transformMatrixConfig.A06));
            }
        }
    }

    public final void A07(Rect rect) {
        C351958Bc r0;
        Object A022;
        int i;
        int i2;
        float f;
        if (this.A01 != null && this.A02 != null && (r0 = this.A05) != null && (A022 = r0.A00.A02()) != null) {
            if (A022 == C351968Bd.SMART_CROP_FILL_FROM_FIT || A022 == C351968Bd.SMART_CROP_FILL_FROM_FREE_TRANSFORM || A022 == C351968Bd.FILL) {
                Rect rect2 = rect;
                if (rect != null) {
                    TransformMatrixConfig transformMatrixConfig = this.A02;
                    transformMatrixConfig.A08.A00(this.A01.A08);
                    TransformMatrixConfig transformMatrixConfig2 = this.A01;
                    if (transformMatrixConfig2.A04 % 180 == 0) {
                        i = transformMatrixConfig2.A05;
                        i2 = transformMatrixConfig2.A03;
                    } else {
                        i = transformMatrixConfig2.A03;
                        i2 = transformMatrixConfig2.A05;
                    }
                    float f2 = (float) i;
                    float f3 = (float) i2;
                    float f4 = (f2 * 1.0f) / f3;
                    float f5 = (float) this.A07;
                    float f6 = f5 * 1.0f;
                    float f7 = (float) this.A06;
                    float f8 = f6 / f7;
                    float f9 = f6 / f2;
                    TransformMatrixParams transformMatrixParams = transformMatrixConfig2.A08;
                    transformMatrixParams.A00 = 0.0f;
                    if (f4 >= f8) {
                        f = f4 / f8;
                    } else {
                        f = 1.0f;
                    }
                    if (f4 >= f8) {
                        float f10 = (f5 * (f - 1.0f)) / 2.0f;
                        transformMatrixConfig2.A04(Math.max(Math.min((((float) ((i - rect2.left) - rect2.right)) / 2.0f) * f9 * f, f10), -f10));
                        transformMatrixConfig2.A05(0.0f);
                    } else {
                        float f11 = ((f3 * f9) - f7) / 2.0f;
                        float max = Math.max(Math.min((((float) ((i2 - rect2.top) - rect2.bottom)) / 2.0f) * f9, f11), -f11);
                        transformMatrixConfig2.A04(0.0f);
                        transformMatrixConfig2.A05(max);
                    }
                    if (transformMatrixParams.A01 != f) {
                        transformMatrixParams.A01 = Math.min(5.0f, Math.max(0.3f, f));
                        A06();
                    }
                    A02(this);
                }
            }
            if (A022 == C351968Bd.SMART_CROP_FREE_TRANSFORM_CACHED || A022 == C351968Bd.SMART_CROP_FIT) {
                TransformMatrixConfig transformMatrixConfig3 = this.A01;
                transformMatrixConfig3.A08.A00(this.A02.A08);
                A06();
            }
            A02(this);
        }
    }

    public final void A08(C366668pT r3) {
        C366398or r0;
        if (r3.A00 && (r0 = this.A00) != null && r0.A00) {
            TransformMatrixConfig transformMatrixConfig = this.A01;
            transformMatrixConfig.getClass();
            transformMatrixConfig.A08.A00(((C370178vx) r3.A00()).A00);
            A02(this);
        }
    }

    public final TransformMatrixConfig C9T() {
        return this.A01;
    }

    public AnonymousClass8KK(ViewGroup viewGroup, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, C3499582p r6, C351958Bc r7) {
        this.A09 = r6;
        this.A08 = userSession;
        this.A0B = viewGroup;
        this.A0C = targetViewSizeProvider;
        this.A0D = new C363188jJ(viewGroup.getContext());
        this.A05 = r7;
        AnonymousClass81W r1 = ((NineSixteenLayoutConfigImpl) targetViewSizeProvider).A0K;
        this.A07 = r1.getWidth();
        this.A06 = r1.getHeight();
    }

    public static TransformMatrixConfig A01(AnonymousClass8KK r6, C352218Cl r7) {
        C339977kU r4;
        TransformMatrixConfig A052 = r6.A05(r7);
        AnonymousClass82Y r2 = r6.A09.A02.A01;
        if (r2.A0K) {
            A052.A05((float) r6.A0B.getContext().getResources().getDimensionPixelSize(R.dimen.account_group_management_clickable_width));
        }
        AnonymousClass804 r1 = r2.A06;
        if ((r1 instanceof AnonymousClass803) && (r4 = ((AnonymousClass803) r1).A00) != null) {
            int i = r6.A07;
            int i2 = r6.A06;
            if (C339977kU.HORIZONTAL == r4) {
                A052.A04(((float) i) / 4.0f);
            } else if (C339977kU.VERTICAL == r4) {
                A052.A05(((float) i2) / 4.0f);
                return A052;
            }
        }
        return A052;
    }

    public final void Dfx(float f) {
        C351968Bd r1;
        if (A03()) {
            C351958Bc r2 = this.A05;
            if (!(r2 == null || r2.A00.A02() == (r1 = C351968Bd.SMART_CROP_FREE_TRANSFORM))) {
                r2.A02.Epw(r1);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float f2 = -f;
            float f3 = f2 / ((float) (elapsedRealtime - this.A04));
            C363188jJ r7 = this.A0D;
            if (!r7.A0I) {
                ViewGroup viewGroup = this.A0B;
                Rect rect = new Rect();
                rect.set(viewGroup.getLeft(), viewGroup.getTop(), viewGroup.getRight(), viewGroup.getBottom());
                r7.A07(rect);
            }
            if (r7.A0I) {
                Rect rect2 = r7.A0P;
                TransformMatrixConfig transformMatrixConfig = this.A01;
                transformMatrixConfig.getClass();
                float centerX = ((float) rect2.centerX()) + (transformMatrixConfig.A08.A02 * ((float) transformMatrixConfig.A07));
                if (r7.A0I) {
                    float centerY = (float) rect2.centerY();
                    TransformMatrixConfig transformMatrixConfig2 = this.A01;
                    TransformMatrixParams transformMatrixParams = transformMatrixConfig2.A08;
                    this.A01.A08.A00 = r7.A05(centerX, centerY + (transformMatrixParams.A03 * ((float) transformMatrixConfig2.A06)), f3, transformMatrixParams.A00, f2);
                    this.A04 = elapsedRealtime;
                    A02(this);
                    return;
                }
                throw new IllegalStateException("Cannot get bounds which have not been set yet");
            }
            throw new IllegalStateException("Cannot get bounds which have not been set yet");
        }
    }

    public final void Dgm(float f) {
        C351968Bd r1;
        if (A03()) {
            C351958Bc r2 = this.A05;
            if (!(r2 == null || r2.A00.A02() == (r1 = C351968Bd.SMART_CROP_FREE_TRANSFORM))) {
                r2.A02.Epw(r1);
            }
            float A002 = A00(f);
            TransformMatrixConfig transformMatrixConfig = this.A01;
            if (transformMatrixConfig != null) {
                transformMatrixConfig.A08.A01 = A002;
            }
            A02(this);
        }
    }

    public final void Dgs(float f) {
        if (A03()) {
            float A002 = A00(f);
            AnonymousClass82Y r4 = this.A09.A02.A01;
            if (r4.A04 != null) {
                if (182.A06(0Tu.A05, this.A08, 36322989393849045L)) {
                    C3498482b r1 = r4.A04;
                    if (A002 >= 0.8f) {
                        r1.A00();
                        return;
                    }
                    Object A022 = r1.A05.A02();
                    A022.getClass();
                    if (((Boolean) A022).booleanValue()) {
                        r1.A01();
                    }
                }
            }
        }
    }

    public final void DhG(float f, float f2) {
        C351968Bd r1;
        if (A03()) {
            C351958Bc r2 = this.A05;
            if (!(r2 == null || r2.A00.A02() == (r1 = C351968Bd.SMART_CROP_FREE_TRANSFORM))) {
                r2.A02.Epw(r1);
            }
            TransformMatrixConfig transformMatrixConfig = this.A01;
            transformMatrixConfig.getClass();
            TransformMatrixConfig transformMatrixConfig2 = this.A01;
            TransformMatrixParams transformMatrixParams = transformMatrixConfig2.A08;
            transformMatrixConfig.A04((transformMatrixParams.A02 * ((float) transformMatrixConfig2.A07)) + f);
            transformMatrixConfig2.A05((transformMatrixParams.A03 * ((float) transformMatrixConfig2.A06)) + f2);
            A02(this);
        }
    }
}
