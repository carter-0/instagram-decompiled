package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.8Kz  reason: invalid class name and case insensitive filesystem */
public final class C354188Kz implements AnonymousClass8KL, AnonymousClass8KM {
    public float A00;
    public float A01;
    public FilterModel A02;
    public C392119uE A03;
    public C366398or A04;
    public TransformMatrixConfig A05;
    public C351958Bc A06;
    public C62320sa A07;
    public 0sJ A08;
    public boolean A09;
    public long A0A;
    public final ViewGroup A0B;
    public final UserSession A0C;
    public final TargetViewSizeProvider A0D;
    public final C3499582p A0E;
    public final AnonymousClass8L0 A0F = new AnonymousClass8L0();
    public final Set A0G = new LinkedHashSet();
    public final C363188jJ A0H;

    public C354188Kz(ViewGroup viewGroup, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, C3499582p r6) {
        0qQ.A0B(userSession, 2);
        0qQ.A0B(viewGroup, 3);
        0qQ.A0B(targetViewSizeProvider, 4);
        this.A0E = r6;
        this.A0C = userSession;
        this.A0B = viewGroup;
        this.A0D = targetViewSizeProvider;
        Context context = viewGroup.getContext();
        0qQ.A07(context);
        this.A0H = new C363188jJ(context);
        this.A00 = 1.0f;
        this.A01 = 1.0f;
    }

    public static final float A01(C354188Kz r11, int i, int i2, int i3) {
        C339977kU r6;
        C279284yO r4;
        int i4 = i2;
        C3499482o r5 = r11.A0E.A02;
        AnonymousClass82Y r2 = r5.A01;
        AnonymousClass804 r1 = r2.A06;
        if (r1 instanceof AnonymousClass803) {
            r6 = ((AnonymousClass803) r1).A00;
        } else {
            r6 = null;
        }
        if (r6 != null) {
            boolean z = false;
            if (i3 % 180 != 0) {
                z = true;
            }
            C357638Yz r0 = r2.A0X;
            if (r0 != null) {
                r4 = (C279284yO) r0.A08.A00;
            } else {
                r4 = null;
            }
            C3498982i r52 = r2.A0h;
            AnonymousClass81W r02 = ((NineSixteenLayoutConfigImpl) r11.A0D).A0K;
            int width = r02.getWidth();
            int height = r02.getHeight();
            int i5 = i;
            if (z) {
                i5 = i2;
                i4 = i;
            }
            return C394849yn.A00(r4, r52, r6, width, height, i5, i4, true);
        }
        1Xj r03 = r2.A08;
        if (r03 != null && r03.A5v()) {
            if (!182.A06(0Tu.A05, r11.A0C, 36327748217813667L)) {
                return 0.7f;
            }
        }
        if (r5.A0F()) {
            UserSession userSession = r11.A0C;
            if (!1NM.A03(userSession)) {
                if (!1Au.A00(userSession).A20()) {
                    return 0.7f;
                }
                return 1.0f;
            }
        }
        if (r2.A0A != null) {
            return 0.5f;
        }
        C3498682d r04 = r2.A0Y;
        if (r04 != null) {
            float f = 0.67f;
            if (r04.A08) {
                f = 1.0f;
            }
            return f * 0.8f;
        } else if (r5.A0B()) {
            return 0.67f;
        } else {
            if (!r2.A0r) {
                return 1.0f;
            }
            AnonymousClass81W r05 = ((NineSixteenLayoutConfigImpl) r11.A0D).A0K;
            int width2 = r05.getWidth();
            int height2 = r05.getHeight();
            int i6 = i2;
            if (i3 % 180 != 0) {
                i6 = i;
                i = i2;
            }
            float f2 = ((float) i) / ((float) i6);
            if (f2 > ((float) width2) / ((float) height2)) {
                return Math.max(f2, 1.0f);
            }
            return 1.0f;
        }
    }

    public final void Dgm(float f) {
        String str;
        A02();
        TransformMatrixConfig transformMatrixConfig = this.A05;
        if (A04() && transformMatrixConfig != null) {
            float A002 = A00(f);
            if (A05(transformMatrixConfig, Float.valueOf(A002), (Float) null, (Float) null, (Float) null)) {
                if (this.A09) {
                    27r A012 = 27p.A01(this.A0C);
                    boolean z = false;
                    if (transformMatrixConfig.A08.A01 > A002) {
                        z = true;
                    }
                    29R r4 = A012.A09;
                    1Ln A082 = 1Ln.A08(r4.A01);
                    if (r4.A0P() && A082.A00.isSampled()) {
                        if (z) {
                            str = "ZOOM_IN";
                        } else {
                            str = "ZOOM_OUT";
                        }
                        A082.A0t("IG_CAMERA_ENTITY_TAP");
                        A082.A0r(str);
                        29R.A00(A082, r4);
                        A082.A0a(r4.A0J());
                        AnonymousClass283 r1 = r4.A04;
                        A082.A0b(r1.A09);
                        A082.A0T();
                        A082.A0U();
                        A082.A0n(27x.A08.getModuleName());
                        A082.A0c(r1.A0A);
                        A082.A0u(AnonymousClass1QI.A00.A02.A00);
                        A082.A0O("is_timeline", true);
                        A082.Cgf();
                    }
                }
                27p.A01(this.A0C).A26(this.A09);
                transformMatrixConfig.A08.A01 = A002;
                A03(this);
            }
        }
    }

    public final void DhG(float f, float f2) {
        A02();
        if (A04()) {
            TransformMatrixConfig transformMatrixConfig = this.A05;
            if (transformMatrixConfig != null) {
                TransformMatrixParams transformMatrixParams = transformMatrixConfig.A08;
                float f3 = this.A00;
                if (A05(transformMatrixConfig, (Float) null, (Float) null, Float.valueOf((transformMatrixParams.A02 * ((float) transformMatrixConfig.A07)) + (f3 * f)), Float.valueOf((transformMatrixParams.A03 * ((float) transformMatrixConfig.A06)) + (f3 * f2)))) {
                    TransformMatrixParams transformMatrixParams2 = transformMatrixConfig.A08;
                    float f4 = this.A00;
                    transformMatrixConfig.A04((transformMatrixParams2.A02 * ((float) transformMatrixConfig.A07)) + (f * f4));
                    transformMatrixConfig.A05((transformMatrixParams2.A03 * ((float) transformMatrixConfig.A06)) + (f2 * f4));
                    27p.A01(this.A0C).A26(this.A09);
                    A03(this);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    private final float A00(float f) {
        float f2 = this.A01;
        float f3 = 5.0f / f2;
        float f4 = 0.3f / f2;
        TransformMatrixConfig transformMatrixConfig = this.A05;
        if (transformMatrixConfig != null) {
            return Math.min(f3, Math.max(f4, f * transformMatrixConfig.A08.A01));
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final void A02() {
        C351958Bc r2 = this.A06;
        if (r2 == null) {
            return;
        }
        if (A08() == C351968Bd.SMART_TRACKING_FILL || A08() == C351968Bd.SMART_TRACKING_FIT) {
            r2.A02.Epw(C351968Bd.SMART_TRACKING_FREE_TRANSFORM);
        }
    }

    public static final void A03(C354188Kz r8) {
        TransformMatrixConfig transformMatrixConfig = r8.A05;
        if (transformMatrixConfig != null) {
            transformMatrixConfig.A03();
            FilterModel filterModel = r8.A02;
            if (filterModel != null) {
                C366728pZ.A01(filterModel, transformMatrixConfig.C5o());
            }
            for (AnonymousClass88P Dti : r8.A0G) {
                TransformMatrixParams transformMatrixParams = transformMatrixConfig.A08;
                Dti.Dti(transformMatrixParams.A01, transformMatrixParams.A00, transformMatrixParams.A02 * ((float) transformMatrixConfig.A07), transformMatrixParams.A03 * ((float) transformMatrixConfig.A06));
            }
        }
    }

    private final boolean A04() {
        C366398or r0 = this.A04;
        boolean z = true;
        if (r0 == null || !r0.A00) {
            z = false;
        }
        if (z && this.A0E.A02.A01.A04() != null) {
            if (this.A05 != null) {
                return true;
            }
            String A0R = 002.A0R("FreeTransformVideoController", "_transform_matrix_is_null");
            String obj = this.A0F.A01.toString();
            0qQ.A07(obj);
            0kD.A07(A0R, obj, (Throwable) null);
        }
        return false;
    }

    private final boolean A05(TransformMatrixConfig transformMatrixConfig, Float f, Float f2, Float f3, Float f4) {
        float f5;
        float f6;
        float f7;
        float f8;
        if (f != null) {
            f5 = f.floatValue();
        } else {
            f5 = transformMatrixConfig.A08.A01;
        }
        if (f2 != null) {
            f6 = f2.floatValue();
        } else {
            f6 = transformMatrixConfig.A08.A00;
        }
        if (f3 != null) {
            f7 = f3.floatValue() / ((float) transformMatrixConfig.A07);
        } else {
            f7 = transformMatrixConfig.A08.A02;
        }
        if (f4 != null) {
            f8 = f4.floatValue() / ((float) transformMatrixConfig.A06);
        } else {
            f8 = transformMatrixConfig.A08.A03;
        }
        0sJ r4 = this.A08;
        if (r4 != null) {
            return ((Boolean) r4.invoke(Float.valueOf(f5), Float.valueOf(f6), Float.valueOf(f7), Float.valueOf(f8))).booleanValue();
        }
        return true;
    }

    public final TransformMatrixConfig A06(AD8 ad8, boolean z, boolean z2, boolean z3) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z4;
        float f;
        TransformMatrixConfig transformMatrixConfig = this.A05;
        AD8 ad82 = ad8;
        if (!z) {
            return C364738lv.A01(transformMatrixConfig, ad82, !z2, z3, false);
        }
        if (transformMatrixConfig == null) {
            return null;
        }
        Integer num = ad82.A03;
        if (num != null) {
            i = num.intValue();
        } else {
            i = transformMatrixConfig.A05;
        }
        Integer num2 = ad82.A02;
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = transformMatrixConfig.A03;
        }
        int i5 = transformMatrixConfig.A04;
        Integer num3 = ad82.A05;
        if (num3 != null) {
            i3 = num3.intValue();
        } else {
            i3 = transformMatrixConfig.A07;
        }
        Integer num4 = ad82.A04;
        if (num4 != null) {
            i4 = num4.intValue();
        } else {
            i4 = transformMatrixConfig.A06;
        }
        Boolean bool = ad82.A00;
        if (bool != null) {
            z4 = bool.booleanValue();
        } else {
            z4 = transformMatrixConfig.A08.A04;
        }
        Integer num5 = AnonymousClass05K.A00;
        TransformMatrixParams transformMatrixParams = new TransformMatrixParams(num5, num5, 1.0f, 0.0f, 0.0f, 0.0f, z4);
        boolean z5 = transformMatrixConfig.A0A;
        boolean z6 = transformMatrixConfig.A0F;
        boolean z7 = transformMatrixConfig.A0C;
        boolean z8 = transformMatrixConfig.A0G;
        boolean z9 = transformMatrixConfig.A0D;
        boolean z10 = z9;
        TransformMatrixConfig transformMatrixConfig2 = new TransformMatrixConfig(transformMatrixParams, transformMatrixConfig.A09, i, i2, i5, i3, i4, z5, z6, z7, z8, z10, transformMatrixConfig.A0E);
        transformMatrixConfig2.A08.A00(transformMatrixConfig.A08);
        Float f2 = ad82.A01;
        if (f2 != null) {
            f = f2.floatValue();
        } else {
            f = transformMatrixConfig.A08.A01;
        }
        transformMatrixConfig2.A08.A01 = f;
        transformMatrixConfig2.A03();
        return transformMatrixConfig2;
    }

    public final C366668pT A07() {
        TransformMatrixParams transformMatrixParams;
        TransformMatrixConfig transformMatrixConfig = this.A05;
        if (transformMatrixConfig != null) {
            transformMatrixParams = transformMatrixConfig.A08;
        } else {
            Integer num = AnonymousClass05K.A00;
            transformMatrixParams = new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false);
        }
        C366668pT r1 = new C366668pT(true, new C370178vx(transformMatrixParams));
        0qQ.A0A(r1);
        return r1;
    }

    public final C351968Bd A08() {
        C351958Bc r0 = this.A06;
        if (r0 != null) {
            return (C351968Bd) r0.A00.A02();
        }
        return null;
    }

    public final void A09(float f, float f2, float f3, float f4) {
        TransformMatrixConfig transformMatrixConfig = this.A05;
        if (transformMatrixConfig != null) {
            A02();
            transformMatrixConfig.A04(f3 * ((float) transformMatrixConfig.A07));
            transformMatrixConfig.A05(f4 * ((float) transformMatrixConfig.A06));
            TransformMatrixParams transformMatrixParams = transformMatrixConfig.A08;
            transformMatrixParams.A01 = f;
            transformMatrixParams.A00 = f2;
            A03(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r1.A0R != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(int r26, int r27, int r28, boolean r29) {
        /*
            r25 = this;
            r2 = r25
            X.82p r0 = r2.A0E
            X.82o r0 = r0.A02
            X.82Y r1 = r0.A01
            boolean r0 = r1.A0S
            if (r0 != 0) goto L_0x0015
            boolean r0 = r1.A0T
            if (r0 != 0) goto L_0x0015
            boolean r0 = r1.A0R
            r5 = 0
            if (r0 == 0) goto L_0x0016
        L_0x0015:
            r5 = 1
        L_0x0016:
            android.view.ViewGroup r0 = r2.A0B
            android.content.Context r4 = r0.getContext()
            X.0qQ.A07(r4)
            com.instagram.common.session.UserSession r3 = r2.A0C
            r9 = r26
            r10 = r27
            if (r5 == 0) goto L_0x00a9
            r12 = r9
            r13 = r10
        L_0x0029:
            r11 = r28
            float r0 = A01(r2, r9, r10, r11)
            X.C305756Jk.A01(r3)
            r15 = 0
            r16 = 1
            r20 = 1065353216(0x3f800000, float:1.0)
            r21 = 0
            java.lang.Integer r18 = X.AnonymousClass05K.A00
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r7 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams
            r17 = r7
            r19 = r18
            r22 = r21
            r23 = r21
            r24 = r15
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            java.lang.String r8 = "video"
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r6 = new com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig
            r14 = r29
            r17 = r15
            r18 = r16
            r19 = r15
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r3 = r6.A08
            r3.A01 = r0
            X.8L0 r3 = r2.A0F
            java.lang.String r0 = "setupInitialTransformScale initialized"
            r3.A00(r0)
            boolean r0 = r1.A0K
            if (r0 == 0) goto L_0x0077
            android.content.res.Resources r3 = r4.getResources()
            r0 = 2131165219(0x7f070023, float:1.7944649E38)
            int r0 = r3.getDimensionPixelSize(r0)
            float r0 = (float) r0
            r6.A05(r0)
        L_0x0077:
            X.804 r1 = r1.A06
            boolean r0 = r1 instanceof X.AnonymousClass803
            if (r0 == 0) goto L_0x009c
            X.803 r1 = (X.AnonymousClass803) r1
            X.7kU r5 = r1.A00
            if (r5 == 0) goto L_0x009c
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r0 = r2.A0D
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r0 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r0
            X.81W r0 = r0.A0K
            int r4 = r0.getWidth()
            int r3 = r0.getHeight()
            X.7kU r0 = X.C339977kU.HORIZONTAL
            r1 = 1082130432(0x40800000, float:4.0)
            if (r0 != r5) goto L_0x009f
            float r0 = (float) r4
            float r0 = r0 / r1
            r6.A04(r0)
        L_0x009c:
            r2.A05 = r6
            return
        L_0x009f:
            X.7kU r0 = X.C339977kU.VERTICAL
            if (r0 != r5) goto L_0x009c
            float r0 = (float) r3
            float r0 = r0 / r1
            r6.A05(r0)
            goto L_0x009c
        L_0x00a9:
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r0 = r2.A0D
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r0 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r0
            X.81W r0 = r0.A0K
            int r12 = r0.getWidth()
            int r13 = r0.getHeight()
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C354188Kz.A0A(int, int, int, boolean):void");
    }

    public final void A0B(C351958Bc r7) {
        int i;
        int i2;
        Object obj;
        TransformMatrixConfig transformMatrixConfig = this.A05;
        if (transformMatrixConfig != null) {
            this.A06 = r7;
            if (transformMatrixConfig.A04 % 180 == 0) {
                i = transformMatrixConfig.A05;
                i2 = transformMatrixConfig.A03;
            } else {
                i = transformMatrixConfig.A03;
                i2 = transformMatrixConfig.A05;
            }
            float f = 1.0f;
            float f2 = (((float) i) * 1.0f) / ((float) i2);
            AnonymousClass81W r1 = ((NineSixteenLayoutConfigImpl) this.A0D).A0K;
            float width = (((float) r1.getWidth()) * 1.0f) / ((float) r1.getHeight());
            if (f2 >= 0.01f + width) {
                C351958Bc r0 = this.A06;
                if (r0 != null) {
                    obj = r0.A00.A02();
                } else {
                    obj = null;
                }
                if (obj == C351968Bd.FILL) {
                    f = f2 / width;
                }
                TransformMatrixParams transformMatrixParams = transformMatrixConfig.A08;
                if (transformMatrixParams.A01 != f) {
                    transformMatrixParams.A01 = Math.min(5.0f, Math.max(0.3f, f));
                    A03(this);
                }
            }
        }
    }

    public final TransformMatrixConfig C9T() {
        return this.A05;
    }

    public final void Dfx(float f) {
        A02();
        if (A04()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float f2 = -f;
            float f3 = f2 / ((float) (elapsedRealtime - this.A0A));
            C363188jJ r7 = this.A0H;
            if (!r7.A0I) {
                ViewGroup viewGroup = this.A0B;
                Rect rect = new Rect();
                rect.set(viewGroup.getLeft(), viewGroup.getTop(), viewGroup.getRight(), viewGroup.getBottom());
                r7.A07(rect);
            }
            TransformMatrixConfig transformMatrixConfig = this.A05;
            if (transformMatrixConfig == null) {
                throw new IllegalStateException("Required value was null.");
            } else if (r7.A0I) {
                Rect rect2 = r7.A0P;
                float centerX = (transformMatrixConfig.A08.A02 * ((float) transformMatrixConfig.A07)) + ((float) rect2.centerX());
                if (r7.A0I) {
                    float centerY = (float) rect2.centerY();
                    TransformMatrixParams transformMatrixParams = transformMatrixConfig.A08;
                    float A052 = r7.A05(centerX, (transformMatrixParams.A03 * ((float) transformMatrixConfig.A06)) + centerY, f3, transformMatrixParams.A00, f2);
                    if (A05(transformMatrixConfig, (Float) null, Float.valueOf(A052), (Float) null, (Float) null)) {
                        transformMatrixConfig.A08.A00 = A052;
                        if (this.A09) {
                            29R r3 = 27p.A01(this.A0C).A09;
                            1Ln A082 = 1Ln.A08(r3.A01);
                            if (r3.A0P() && A082.A00.isSampled()) {
                                A082.A0t("IG_CAMERA_ENTITY_TAP");
                                A082.A0r("ROTATE");
                                29R.A00(A082, r3);
                                A082.A0a(r3.A0J());
                                AnonymousClass283 r32 = r3.A04;
                                A082.A0b(r32.A09);
                                A082.A0T();
                                A082.A0U();
                                A082.A0n(27x.A08.getModuleName());
                                A082.A0c(r32.A0A);
                                A082.A0u(AnonymousClass1QI.A00.A02.A00);
                                A082.A0O("is_timeline", true);
                                A082.Cgf();
                            }
                        }
                        27p.A01(this.A0C).A26(this.A09);
                        this.A0A = elapsedRealtime;
                        A03(this);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Cannot get bounds which have not been set yet");
            } else {
                throw new IllegalStateException("Cannot get bounds which have not been set yet");
            }
        }
    }

    public final void Dgs(float f) {
        if (A04()) {
            float A002 = A00(f);
            C3498482b r4 = this.A0E.A02.A01.A04;
            if (r4 != null) {
                if (182.A06(0Tu.A05, this.A0C, 36322989393849045L)) {
                    if (A002 >= 0.8f) {
                        r4.A00();
                    } else if (0qQ.A0K(r4.A05.A02(), true)) {
                        r4.A01();
                    }
                }
            }
            C62320sa r0 = this.A07;
            if (r0 != null) {
                r0.invoke();
            }
        }
    }
}
