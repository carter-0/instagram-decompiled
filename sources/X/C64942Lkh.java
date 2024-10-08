package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel;
import com.facebook.common.math.matrix.Matrix4;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.base.PhotoSession;
import com.instagram.creation.base.ui.degreelabel.PillDegreeLabelManager;
import com.instagram.creation.base.ui.grid.GridLinesView;
import com.instagram.creation.base.ui.sliderview.RulerView;
import com.instagram.creation.base.ui.sliderview.SliderView;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* renamed from: X.Lkh  reason: case insensitive filesystem */
public final class C64942Lkh implements C66534MVo, X96, C66438MRs {
    public View A00;
    public View A01;
    public ImageView A02;
    public MV1 A03;
    public MV1 A04;
    public MV1 A05;
    public SliderView A06;
    public LCk A07;
    public SurfaceCropFilter A08;
    public C353998Kg A09;
    public FilterGroupModel A0A;
    public AnonymousClass3Q2 A0B;
    public Integer A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public View A0N;
    public GridLinesView A0O;
    public GridLinesView A0P;
    public C62455Kg5 A0Q = C62455Kg5.THREE;
    public C63955LFb A0R;
    public final SurfaceCropFilterModel.FitTransformParams A0S = new SurfaceCropFilterModel.FitTransformParams();
    public final SurfaceCropFilterModel.FitTransformParams A0T = new SurfaceCropFilterModel.FitTransformParams();
    public final SurfaceCropFilterModel.FullTransform A0U = new SurfaceCropFilterModel.FullTransform();
    public final 2cs A0V;
    public final 2cs A0W;
    public final 2cs A0X;
    public final C71392co A0Y;
    public final C71392co A0Z;
    public final 2cp A0a;
    public final UserSession A0b;
    public final C3499682q A0c;
    public final float A0d;
    public final SurfaceCropFilterModel.FullTransform A0e = new SurfaceCropFilterModel.FullTransform();
    public final U02 A0f;
    public final String A0g;
    public final boolean A0h;

    public final void CuZ(boolean z) {
        boolean z2 = false;
        A04(false);
        SurfaceCropFilter surfaceCropFilter = this.A08;
        if (surfaceCropFilter != null) {
            if (!z) {
                surfaceCropFilter.A0O(this.A0e);
            } else {
                SurfaceCropFilterModel.FitTransformParams fitTransformParams = this.A0S;
                if (surfaceCropFilter.A0Q(fitTransformParams)) {
                    this.A08.A0M(fitTransformParams);
                }
                try {
                    this.A08.A0C(true);
                } catch (IllegalStateException e) {
                    0kD.A0H("Adjust tool exception", e);
                    this.A08.A0O(this.A0e);
                }
            }
        }
        FilterGroupModel filterGroupModel = this.A0A;
        filterGroupModel.getClass();
        filterGroupModel.EWl(5, this.A0L);
        FilterGroupModel filterGroupModel2 = this.A0A;
        filterGroupModel2.EWl(10, this.A0J);
        filterGroupModel2.EWl(9, this.A0K);
        filterGroupModel2.EWl(13, this.A0E);
        filterGroupModel2.EWl(17, this.A0G);
        boolean z3 = this.A0M;
        filterGroupModel2.EWl(19, z3);
        filterGroupModel2.EWl(21, z3);
        filterGroupModel2.EWl(22, this.A0F);
        A03(this);
        SurfaceCropFilter surfaceCropFilter2 = this.A08;
        if (surfaceCropFilter2 != null) {
            SurfaceCropFilterModel.FullTransform fullTransform = surfaceCropFilter2.A00.A06;
            if (!(fullTransform.A03 == 0.0f && fullTransform.A04 == 0.0f && fullTransform.A05 == 0.0f)) {
                z2 = true;
            }
        }
        View view = this.A0N;
        if (view instanceof C60060Jeb) {
            ((C60060Jeb) view).setChecked(z2);
        } else {
            view.getClass();
            view.setSelected(z2);
        }
        GridLinesView gridLinesView = this.A0P;
        if (gridLinesView != null) {
            gridLinesView.setVisibility(8);
            this.A0P.A01 = null;
            this.A0P = null;
        }
        GridLinesView gridLinesView2 = this.A0O;
        if (gridLinesView2 != null) {
            gridLinesView2.setVisibility(8);
            this.A0O.A01 = null;
            this.A0O = null;
        }
        ImageView imageView = this.A02;
        imageView.getClass();
        imageView.setVisibility(8);
        this.A02 = null;
        MV1 mv1 = this.A03;
        if (mv1 != null) {
            mv1.hide();
            this.A03 = null;
        }
        MV1 mv12 = this.A04;
        if (mv12 != null) {
            mv12.hide();
            this.A04 = null;
        }
        MV1 mv13 = this.A05;
        mv13.getClass();
        mv13.hide();
        this.A05 = null;
        this.A0f.A02();
        this.A0a.A04.clear();
        this.A0N = null;
        this.A06 = null;
        if (!this.A0I) {
            this.A01 = null;
            this.A09 = null;
            this.A08 = null;
            this.A0A = null;
        }
    }

    public final void DsP(boolean z) {
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    private void A01() {
        SurfaceCropFilter surfaceCropFilter = this.A08;
        if (surfaceCropFilter != null) {
            SurfaceCropFilterModel.FitTransformParams fitTransformParams = this.A0S;
            boolean A0Q2 = surfaceCropFilter.A0Q(fitTransformParams);
            this.A0H = A0Q2;
            if (A0Q2) {
                SurfaceCropFilter surfaceCropFilter2 = this.A08;
                SurfaceCropFilterModel.FitTransformParams fitTransformParams2 = this.A0T;
                surfaceCropFilter2.A0L(fitTransformParams2);
                float f = (fitTransformParams.A02 + fitTransformParams2.A02) / 2.0f;
                fitTransformParams.A02 = f;
                float f2 = fitTransformParams2.A00;
                float f3 = fitTransformParams.A00;
                double d = (double) (4.0f / f);
                fitTransformParams.A00 = f3 + C64138LPn.A00((double) (f2 - f3), d);
                float f4 = fitTransformParams2.A01;
                float f5 = fitTransformParams.A01;
                fitTransformParams.A01 = f5 + C64138LPn.A00((double) (f4 - f5), d);
                this.A08.A0M(fitTransformParams);
            }
        }
    }

    private void A02(C62455Kg5 kg5) {
        GridLinesView gridLinesView = this.A0P;
        int i = 0;
        if (gridLinesView != null) {
            int i2 = 8;
            if (kg5 == C62455Kg5.THREE) {
                i2 = 0;
            }
            gridLinesView.setVisibility(i2);
        }
        GridLinesView gridLinesView2 = this.A0O;
        if (gridLinesView2 != null) {
            if (kg5 != C62455Kg5.SIX) {
                i = 8;
            }
            gridLinesView2.setVisibility(i);
        }
    }

    public static void A03(C64942Lkh lkh) {
        C353998Kg r0 = lkh.A09;
        r0.getClass();
        r0.EEp();
    }

    private void A04(boolean z) {
        if (this.A00 != null) {
            if (z) {
                0xY A0p = AnonymousClass7TE.A0p(1Au.A00(this.A0b));
                A0p.E5T("show_adjust_crop_nux", true);
                A0p.apply();
            }
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(300);
            alphaAnimation.setAnimationListener(new C11520Sbh(1, this, this.A00));
            this.A00.startAnimation(alphaAnimation);
            this.A00 = null;
        }
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, X.MV1, X.LkX] */
    public final View AZq(Context context) {
        ViewGroup viewGroup;
        boolean z = this.A0h;
        LayoutInflater from = LayoutInflater.from(context);
        if (z) {
            viewGroup = (ViewGroup) from.inflate(R.layout.adjust_layout, (ViewGroup) null, false);
            RulerView rulerView = (RulerView) viewGroup.requireViewById(R.id.angle_ruler_view);
            rulerView.A01 = 0.3f;
            rulerView.A00 = 0.3f;
            rulerView.A07 = 1;
            ImageView imageView = (ImageView) ((Activity) 0mE.A01(context, Activity.class)).requireViewById(R.id.actionbar_rotate90_button);
            this.A02 = imageView;
            imageView.setImageResource(R.drawable.straighten_glyph_rotate);
            Integer num = AnonymousClass05K.A00;
            PillDegreeLabelManager pillDegreeLabelManager = (PillDegreeLabelManager) viewGroup.requireViewById(R.id.rotate_x_container);
            LYG.A02(pillDegreeLabelManager, 40, num, this);
            pillDegreeLabelManager.setDegreeLabelResource(R.drawable.perspectivey_icon);
            pillDegreeLabelManager.setDegree(A00(this, num));
            pillDegreeLabelManager.show();
            this.A03 = pillDegreeLabelManager;
            Integer num2 = AnonymousClass05K.A0C;
            PillDegreeLabelManager pillDegreeLabelManager2 = (PillDegreeLabelManager) viewGroup.requireViewById(R.id.rotate_z_container);
            LYG.A02(pillDegreeLabelManager2, 40, num2, this);
            pillDegreeLabelManager2.setDegreeLabelResource(R.drawable.rotation_icon);
            pillDegreeLabelManager2.setDegree(A00(this, num2));
            pillDegreeLabelManager2.show();
            this.A05 = pillDegreeLabelManager2;
            Integer num3 = AnonymousClass05K.A01;
            PillDegreeLabelManager pillDegreeLabelManager3 = (PillDegreeLabelManager) viewGroup.requireViewById(R.id.rotate_y_container);
            LYG.A02(pillDegreeLabelManager3, 40, num3, this);
            pillDegreeLabelManager3.setDegreeLabelResource(R.drawable.perspectivex_icon);
            pillDegreeLabelManager3.setDegree(A00(this, num3));
            pillDegreeLabelManager3.show();
            this.A04 = pillDegreeLabelManager3;
            this.A0C = num2;
            MV1 mv1 = this.A05;
            mv1.getClass();
            mv1.setSelected(true);
            MV1 mv12 = this.A03;
            mv12.getClass();
            mv12.setSelected(false);
            MV1 mv13 = this.A04;
            mv13.getClass();
            mv13.setSelected(false);
        } else {
            viewGroup = (ViewGroup) from.inflate(R.layout.sliderview_whiteout_layout, (ViewGroup) null, false);
            RulerView rulerView2 = (RulerView) viewGroup.requireViewById(R.id.angle_ruler_view);
            rulerView2.A01 = 0.3f;
            rulerView2.A00 = 0.3f;
            rulerView2.A07 = 1;
            View view = this.A01;
            view.getClass();
            this.A02 = DbU.A0F(view, R.id.filter_preview_rotate90_button);
            LinearLayout linearLayout = (LinearLayout) this.A01.requireViewById(R.id.degree_label_container);
            ? obj = new Object();
            obj.A01 = linearLayout;
            obj.A02 = (TextView) linearLayout.getChildAt(0);
            obj.A00 = obj.A01.getChildAt(1);
            obj.A03 = true;
            obj.setDegree(0.0f);
            this.A05 = obj;
            LYF lyf = new LYF((Object) this, 22);
            AnonymousClass0fU.A00(lyf, obj.A00);
            AnonymousClass0fU.A00(lyf, obj.A02);
            this.A05.show();
        }
        ImageView imageView2 = this.A02;
        imageView2.getClass();
        LYF.A01(imageView2, 21, this);
        this.A02.setVisibility(0);
        SliderView sliderView = (SliderView) viewGroup.requireViewById(R.id.photo_sliderview);
        this.A06 = sliderView;
        sliderView.A05 = new C64952Lkr(this);
        this.A0C = AnonymousClass05K.A0C;
        float f = this.A0e.A05;
        if (f != 0.0f) {
            sliderView.A02(false, f);
        } else {
            sliderView.A02(true, this.A0d);
        }
        viewGroup.post(new C65887M3c(viewGroup));
        return viewGroup;
    }

    public final boolean CIj(View view, MotionEvent motionEvent) {
        return this.A0f.onTouch(view, motionEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0031, code lost:
        if (r1 != 0) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean CNG(X.C60060Jeb r5, com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r6) {
        /*
            r4 = this;
            java.lang.String r0 = "AdjustController_initializeTile()"
            com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter r3 = X.C395019z4.A00(r6, r0)
            r2 = 0
            if (r3 == 0) goto L_0x0037
            monitor-enter(r3)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel r0 = r3.A00     // Catch:{ all -> 0x002a }
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FullTransform r0 = r0.A06     // Catch:{ all -> 0x002a }
            float r0 = r0.A03     // Catch:{ all -> 0x002a }
            monitor-exit(r3)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0033
            monitor-enter(r3)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel r0 = r3.A00     // Catch:{ all -> 0x002a }
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FullTransform r0 = r0.A06     // Catch:{ all -> 0x002a }
            float r0 = r0.A05     // Catch:{ all -> 0x002a }
            monitor-exit(r3)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0033
            monitor-enter(r3)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel r0 = r3.A00     // Catch:{ all -> 0x002a }
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FullTransform r0 = r0.A06     // Catch:{ all -> 0x002a }
            float r0 = r0.A04     // Catch:{ all -> 0x002a }
            goto L_0x002d
        L_0x002a:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x002d:
            monitor-exit(r3)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r0 = 0
            if (r1 == 0) goto L_0x0034
        L_0x0033:
            r0 = 1
        L_0x0034:
            r5.setChecked(r0)
        L_0x0037:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64942Lkh.CNG(X.Jeb, com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r0.A0Q(r15) == false) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002d, code lost:
        if (((double) java.lang.Math.abs(r18)) < 0.001d) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DHm(float r20, float r21) {
        /*
            r19 = this;
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FitTransformParams r15 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FitTransformParams
            r15.<init>()
            r4 = r19
            com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter r0 = r4.A08
            r7 = 1
            r17 = r20
            r18 = r21
            if (r0 == 0) goto L_0x0017
            boolean r0 = r0.A0Q(r15)
            r3 = 1
            if (r0 != 0) goto L_0x014f
        L_0x0017:
            r3 = 0
            float r0 = java.lang.Math.abs(r17)
            double r1 = (double) r0
            r5 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x014f
            float r0 = java.lang.Math.abs(r18)
            double r1 = (double) r0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x014f
        L_0x002f:
            A03(r4)
            X.LCk r10 = r4.A07
            if (r10 == 0) goto L_0x010c
            java.lang.String r9 = r4.A0D
            if (r9 == 0) goto L_0x010c
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r0 = r4.A0A
            if (r0 == 0) goto L_0x014c
            com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl r0 = (com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl) r0
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x014c
        L_0x0044:
            X.82q r1 = r4.A0c
            r0 = r1
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r0 = r0.A01
            int r8 = r0.A01()
            int r12 = r0.A00()
            if (r7 == 0) goto L_0x0146
            r0 = 0
        L_0x0056:
            X.514 r7 = r1.ANP()
            java.util.Map r11 = r10.A01
            boolean r1 = r11.containsKey(r9)
            if (r1 == 0) goto L_0x010c
            java.lang.Object r1 = r11.get(r9)
            java.util.Map r1 = (java.util.Map) r1
            boolean r1 = r1.containsKey(r7)
            if (r1 == 0) goto L_0x010c
            float r2 = r15.A02
            r1 = 0
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x010c
            int r1 = r8 / 2
            float r6 = (float) r1
            float r1 = r15.A00
            float r1 = r1 * r6
            float r6 = r6 + r1
            int r1 = r12 / 2
            float r2 = (float) r1
            float r1 = r15.A01
            float r1 = r1 * r2
            float r2 = r2 - r1
            int r1 = r0 % 180
            r5 = r2
            r3 = r12
            if (r1 == 0) goto L_0x008d
            r5 = r6
            r6 = r2
            r3 = r8
            r8 = r12
        L_0x008d:
            java.lang.Object r1 = r11.get(r9)
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r1 = r1.get(r7)
            float r14 = X.AnonymousClass7TE.A04(r1)
            float r2 = (float) r8
            float r12 = (float) r3
            float r13 = r2 / r12
            X.514 r1 = X.AnonymousClass514.ORIGINAL
            if (r7 != r1) goto L_0x0127
            float r2 = r2 * r14
            float r1 = r15.A02
            float r2 = r2 / r1
            float r12 = r12 * r14
            float r12 = r12 / r1
        L_0x00a9:
            r11 = 1073741824(0x40000000, float:2.0)
            float r1 = r2 / r11
            float r6 = r6 - r1
            int r6 = (int) r6
            r1 = 0
            int r6 = java.lang.Math.max(r6, r1)
            int r6 = java.lang.Math.min(r6, r8)
            float r11 = r12 / r11
            float r5 = r5 - r11
            int r5 = (int) r5
            int r5 = java.lang.Math.max(r5, r1)
            int r16 = java.lang.Math.min(r5, r3)
            int r13 = (int) r2
            int r5 = r6 + r13
            int r2 = java.lang.Math.max(r5, r1)
            int r2 = java.lang.Math.min(r2, r8)
            int r12 = (int) r12
            int r14 = r16 + r12
            int r1 = java.lang.Math.max(r14, r1)
            int r15 = java.lang.Math.min(r1, r3)
            r1 = 270(0x10e, float:3.78E-43)
            if (r0 != r1) goto L_0x010d
            int r8 = r8 - r2
            int r5 = r8 + r13
            r11 = r8
            r6 = r16
            r2 = r14
        L_0x00e5:
            java.util.Map r3 = r10.A00
            boolean r0 = r3.containsKey(r9)
            if (r0 != 0) goto L_0x00f4
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            r3.put(r9, r0)
        L_0x00f4:
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r6, r11, r2, r5)
            java.lang.Object r0 = r3.get(r9)
            r0.getClass()
            java.util.Map r0 = (java.util.Map) r0
            r0.put(r7, r1)
            X.3Q2 r0 = r4.A0B
            if (r0 == 0) goto L_0x010c
            r0.A0S(r1)
        L_0x010c:
            return
        L_0x010d:
            r1 = 90
            if (r0 != r1) goto L_0x0117
            int r3 = r3 - r15
            int r2 = r3 + r12
            r11 = r6
            r6 = r3
            goto L_0x00e5
        L_0x0117:
            r1 = 180(0xb4, float:2.52E-43)
            r11 = r16
            r5 = r15
            if (r0 != r1) goto L_0x00e5
            int r2 = r8 - r6
            int r5 = r3 - r16
            int r6 = r2 - r13
            int r11 = r5 - r12
            goto L_0x00e5
        L_0x0127:
            float r11 = r7.A00
            int r1 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r1 <= 0) goto L_0x013e
            float r14 = r14 * r12
            float r1 = r15.A02
            float r14 = r14 / r1
            boolean r1 = r7.A03
            if (r1 == 0) goto L_0x013b
            float r1 = r14 / r12
            float r2 = r2 * r1
        L_0x0138:
            r12 = r14
            goto L_0x00a9
        L_0x013b:
            float r2 = r11 * r14
            goto L_0x0138
        L_0x013e:
            float r2 = r2 * r14
            float r1 = r15.A02
            float r2 = r2 / r1
            float r12 = r2 / r11
            goto L_0x00a9
        L_0x0146:
            int r0 = r1.ATT()
            goto L_0x0056
        L_0x014c:
            r7 = 0
            goto L_0x0044
        L_0x014f:
            com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter r0 = r4.A08
            if (r0 == 0) goto L_0x002f
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FitTransformParams r14 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FitTransformParams
            r14.<init>()
            r0.A0L(r14)
            if (r3 != 0) goto L_0x0169
            float r0 = r14.A02
            r15.A02 = r0
            float r0 = r14.A00
            r15.A00 = r0
            float r0 = r14.A01
            r15.A01 = r0
        L_0x0169:
            X.Lbt r13 = new X.Lbt
            r16 = r4
            r13.<init>(r14, r15, r16, r17, r18)
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64942Lkh.DHm(float, float):void");
    }

    public final void DHq() {
        this.A0a.A04.clear();
        this.A0H = false;
    }

    public final void DSf(float f, float f2, float f3, float f4, float f5, float f6) {
        Pair pair;
        C63955LFb lFb;
        Integer num;
        SurfaceCropFilter surfaceCropFilter;
        View view = this.A01;
        if (!(view == null || view.getParent() == null)) {
            JTP.A15(this.A01, true);
        }
        if (this.A08 == null) {
            return;
        }
        if (f5 != 1.0f || f3 != 0.0f || f4 != 0.0f) {
            if (f5 != 1.0f) {
                A04(true);
            }
            if (this.A0H && (surfaceCropFilter = this.A08) != null) {
                surfaceCropFilter.A0N(this.A0T, false);
            }
            View view2 = this.A01;
            view2.getClass();
            float A022 = f / AnonymousClass7TE.A02(view2);
            float A002 = JTP.A00(f2, this.A01);
            SurfaceCropFilter surfaceCropFilter2 = this.A08;
            synchronized (surfaceCropFilter2) {
                SurfaceCropFilterModel surfaceCropFilterModel = surfaceCropFilter2.A00;
                Matrix4 matrix4 = surfaceCropFilterModel.A07;
                SurfaceCropFilterModel.FullTransform fullTransform = surfaceCropFilterModel.A06;
                PointF A012 = SurfaceCropFilter.A01(matrix4, fullTransform.A01, fullTransform.A02);
                float f7 = (A022 - 0.5f) * 2.0f;
                float f8 = (-(A002 - 0.5f)) * 2.0f;
                float f9 = A012.x;
                SurfaceCropFilterModel surfaceCropFilterModel2 = surfaceCropFilter2.A00;
                SurfaceCropFilterModel.FullTransform fullTransform2 = surfaceCropFilterModel2.A06;
                float f10 = fullTransform2.A06;
                float f11 = f9 + (f7 / f10);
                float f12 = f10 * f5;
                fullTransform2.A06 = f12;
                float f13 = f11 - (f7 / f12);
                A012.x = f13;
                float f14 = (A012.y + (f8 / f10)) - (f8 / f12);
                A012.y = f14;
                PointF A023 = SurfaceCropFilter.A02(surfaceCropFilter2, f13, f14);
                SurfaceCropFilter.A09(surfaceCropFilter2, A023.x, A023.y);
                SurfaceCropFilter.A08(surfaceCropFilter2);
                pair = new Pair(A023, Float.valueOf(surfaceCropFilterModel2.A06.A06));
            }
            String str = this.A0D;
            if (str != null) {
                this.A0c.AAC((PointF) pair.first, str, AnonymousClass7TE.A04(pair.second));
            }
            this.A08.A0D(f3 / AnonymousClass7TE.A02(this.A01), JTP.A00(f4, this.A01));
            A01();
            A03(this);
            if (f3 > 0.0f && f4 > 0.0f && (lFb = this.A0R) != null) {
                Integer num2 = lFb.A04;
                num = AnonymousClass05K.A01;
                if (num2 != num) {
                    27p.A01(lFb.A07).A25(false);
                } else {
                    return;
                }
            } else if (f3 < 0.0f && f4 < 0.0f && (lFb = this.A0R) != null && lFb.A04 != (num = AnonymousClass05K.A00)) {
                27p.A01(lFb.A07).A25(true);
            } else {
                return;
            }
            lFb.A04 = num;
        }
    }

    public final boolean Dij(View view, ViewGroup viewGroup, C353998Kg r11, FilterGroupModel filterGroupModel) {
        this.A0N = view;
        this.A0A = filterGroupModel;
        this.A09 = r11;
        SurfaceCropFilter A002 = C395019z4.A00(filterGroupModel, "AdjustControlleronSelect()");
        this.A08 = A002;
        if (A002 != null) {
            SurfaceCropFilterModel.FullTransform fullTransform = this.A0U;
            synchronized (A002) {
                fullTransform.A01(A002.A00.A06);
            }
        }
        this.A0e.A01(this.A0U);
        this.A01 = viewGroup;
        this.A0P = (GridLinesView) viewGroup.requireViewById(R.id.straighten_grid_overlay_3);
        this.A0O = (GridLinesView) viewGroup.requireViewById(R.id.straighten_grid_overlay_6);
        GridLinesView gridLinesView = this.A0P;
        if (gridLinesView.getWidth() == 0 && gridLinesView.getHeight() == 0) {
            gridLinesView.A01 = this;
        } else {
            DlK(gridLinesView, gridLinesView.getWidth(), gridLinesView.getHeight());
        }
        GridLinesView gridLinesView2 = this.A0O;
        if (gridLinesView2.getWidth() == 0 && gridLinesView2.getHeight() == 0) {
            gridLinesView2.A01 = this;
        } else {
            DlK(gridLinesView2, gridLinesView2.getWidth(), gridLinesView2.getHeight());
        }
        A02(this.A0Q);
        FilterGroupModel filterGroupModel2 = this.A0A;
        this.A0L = filterGroupModel2.CTc(5);
        this.A0J = filterGroupModel2.CTc(10);
        this.A0K = filterGroupModel2.CTc(9);
        this.A0E = filterGroupModel2.CTc(13);
        this.A0G = filterGroupModel2.CTc(17);
        this.A0M = filterGroupModel2.CTc(19);
        this.A0F = filterGroupModel2.CTc(22);
        if (!AnonymousClass7TE.A0q(this.A0b).getBoolean("show_adjust_crop_nux", false)) {
            View view2 = this.A01;
            ViewGroup viewGroup2 = (ViewGroup) view2;
            view2.getClass();
            this.A00 = DbV.A0D(view2).inflate(R.layout.adjust_crop_nux, viewGroup2, false);
            viewGroup2.getClass();
            viewGroup2.addView(this.A00);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300);
            this.A00.startAnimation(alphaAnimation);
        }
        FilterGroupModel filterGroupModel3 = this.A0A;
        filterGroupModel3.getClass();
        filterGroupModel3.EWl(5, false);
        FilterGroupModel filterGroupModel4 = this.A0A;
        filterGroupModel4.EWl(10, false);
        filterGroupModel4.EWl(9, false);
        filterGroupModel4.EWl(13, false);
        filterGroupModel4.EWl(17, false);
        filterGroupModel4.EWl(19, false);
        filterGroupModel4.EWl(21, false);
        filterGroupModel4.EWl(22, false);
        this.A09.EEp();
        return true;
    }

    public final void Dl2(float f, float f2) {
        C62455Kg5 kg5;
        C62455Kg5 kg52 = this.A0Q;
        if (kg52 instanceof C61720KJl) {
            kg5 = (C62455Kg5) 03t.A05(C62455Kg5.values());
        } else {
            kg5 = C62455Kg5.values()[kg52.ordinal() + 1];
        }
        this.A0Q = kg5;
        A02(kg5);
    }

    public final void DlH(float f, float f2, float f3, float f4) {
        C62927Kof kof;
        SurfaceCropFilter surfaceCropFilter = this.A08;
        if (surfaceCropFilter == null) {
            return;
        }
        if (f3 != 0.0f || f4 != 0.0f) {
            if (this.A0H) {
                surfaceCropFilter.A0N(this.A0T, false);
            }
            View view = this.A01;
            view.getClass();
            PointF A0D2 = this.A08.A0D(f3 / AnonymousClass7TE.A02(view), JTP.A00(f4, this.A01));
            String str = this.A0D;
            if (!(str == null || (kof = (C62927Kof) ((JWE) this.A0c).A01.A0R.get(str)) == null)) {
                kof.A01 = A0D2;
            }
            A01();
            A03(this);
        }
    }

    public final String getTitle() {
        return this.A0g;
    }

    public C64942Lkh(Resources resources, UserSession userSession, C3499682q r9, C63955LFb lFb, float f, boolean z) {
        this.A0b = userSession;
        this.A0c = r9;
        this.A0g = resources.getString(2131952471);
        this.A0d = f;
        this.A0h = z;
        this.A0R = lFb;
        U02 u02 = new U02();
        this.A0f = u02;
        u02.A02 = this;
        2cp A002 = C61340me.A00();
        this.A0a = A002;
        C71392co A042 = C71392co.A04(30.0d, 9.0d);
        this.A0Y = A042;
        this.A0Z = C71392co.A04(0.0d, 1.5d);
        2cs A022 = A002.A02();
        this.A0X = A022;
        A022.A09(A042);
        2cs A023 = A002.A02();
        A023.A00 = 0.001d;
        A023.A02 = 0.001d;
        this.A0V = A023;
        2cs A024 = A002.A02();
        A024.A00 = 0.001d;
        A024.A02 = 0.001d;
        this.A0W = A024;
    }

    public static float A00(C64942Lkh lkh, Integer num) {
        int intValue = num.intValue();
        if (intValue == 0) {
            return lkh.A0U.A03;
        }
        SurfaceCropFilterModel.FullTransform fullTransform = lkh.A0U;
        if (intValue != 1) {
            return fullTransform.A05;
        }
        return fullTransform.A04;
    }

    public final void DlK(GridLinesView gridLinesView, int i, int i2) {
        CropInfo cropInfo;
        float height;
        int width;
        Rect rect;
        C3499682q A0k = JTR.A0k(0mE.A01(gridLinesView.getContext(), C267844cJ.class));
        int ATT = A0k.ATT();
        PhotoSession A022 = JWE.A02(A0k);
        if (A022 != null && (cropInfo = A022.A05) != null) {
            int i3 = ATT % 180;
            Rect rect2 = cropInfo.A02;
            if (i3 == 0) {
                height = (float) rect2.width();
                width = rect2.height();
            } else {
                height = (float) rect2.height();
                width = rect2.width();
            }
            float f = height / ((float) width);
            float f2 = (float) i;
            float f3 = (float) i2;
            if (f2 / f3 <= f) {
                int i4 = (int) ((f2 / f) + 0.5f);
                int i5 = (int) (((float) (i2 - i4)) / 2.0f);
                rect = new Rect(0, i5, i, i4 + i5);
            } else {
                int i6 = (int) ((f3 * f) + 0.5f);
                int i7 = (int) (((float) (i - i6)) / 2.0f);
                rect = new Rect(i7, 0, i6 + i7, i2);
            }
            gridLinesView.setGridlinesRect(rect);
            gridLinesView.A01 = null;
        }
    }

    public final /* synthetic */ boolean CNF(C60060Jeb jeb, PhotoFilter photoFilter) {
        return false;
    }
}
