package X;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TypedParameterMap;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.creation.photo.edit.tint.IgTintColorPicker;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.ui.igeditseekbar.IgEditSeekBar;
import java.util.Map;

/* renamed from: X.Lkf  reason: case insensitive filesystem */
public final class C64940Lkf implements C66534MVo {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public View A08;
    public View A09;
    public View A0A;
    public TextView A0B;
    public TextView A0C;
    public 2cs A0D;
    public IgTintColorPicker A0E;
    public C353998Kg A0F;
    public FilterGroupModel A0G;
    public IgEditSeekBar A0H;
    public Float A0I;
    public boolean A0J = true;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public View A0R;
    public View A0S;
    public View A0T;
    public ViewGroup A0U;
    public ValueMapFilterModel A0V;
    public 2cp A0W;
    public C60060Jeb A0X;
    public final UserSession A0Y;

    public C64940Lkf(UserSession userSession) {
        this.A0Y = userSession;
    }

    public final View AZq(Context context) {
        ViewGroup viewGroup = (ViewGroup) DbW.A09(DbT.A0B(context), (ViewGroup) null, R.layout.tint_adjust_layout, false);
        this.A0K = JWN.A05(context);
        View A0G2 = AnonymousClass7TF.A0G(viewGroup, R.id.tint_type_adjust);
        this.A0S = A0G2;
        A0G2.setVisibility(0);
        TextView A0R2 = AnonymousClass7TG.A0R(viewGroup, R.id.adjust_shadows_title);
        this.A0C = A0R2;
        LYF.A01(A0R2, 23, this);
        TextView A0R3 = AnonymousClass7TG.A0R(viewGroup, R.id.adjust_highlights_title);
        this.A0B = A0R3;
        LYF.A01(A0R3, 24, this);
        Class<Activity> cls = Activity.class;
        View findViewById = ((Activity) 0mE.A01(context, cls)).findViewById(R.id.primary_accept_buttons);
        this.A08 = findViewById;
        if (findViewById != null) {
            findViewById.bringToFront();
            View findViewById2 = ((Activity) 0mE.A01(context, cls)).findViewById(R.id.secondary_accept_buttons);
            if (findViewById2 != null) {
                this.A0A = findViewById2;
                if (!this.A0K) {
                    AnonymousClass7TG.A0R(findViewById2, R.id.adjust_title).setText(2131974575);
                }
                View A0G3 = AnonymousClass7TF.A0G(findViewById2, R.id.button_accept_adjust);
                this.A0R = A0G3;
                LYF.A01(A0G3, 25, this);
                View A0G4 = AnonymousClass7TF.A0G(findViewById2, R.id.button_cancel_adjust);
                this.A0T = A0G4;
                LYF.A01(A0G4, 26, this);
                View A0G5 = AnonymousClass7TF.A0G(viewGroup, R.id.primary_tint_adjustment_view);
                this.A09 = A0G5;
                A0G5.bringToFront();
                0qQ.A07(viewGroup.requireViewById(R.id.tint_picker_container));
                IgTintColorPicker igTintColorPicker = (IgTintColorPicker) AnonymousClass7TF.A0F(viewGroup, R.id.tint_picker);
                this.A0E = igTintColorPicker;
                igTintColorPicker.setCurrentColor(this.A06);
                igTintColorPicker.setOnTintColorChangeListener(new C65165LoU(this));
                TextView A0d = AnonymousClass7TE.A0d(viewGroup, R.id.nux_tap_again_to_adjust);
                if (A0d != null) {
                    igTintColorPicker.A02 = A0d;
                    0qQ.A07(viewGroup.requireViewById(R.id.tint_slider_container));
                    IgEditSeekBar igEditSeekBar = (IgEditSeekBar) AnonymousClass7TF.A0F(viewGroup, R.id.tint_slider);
                    this.A0H = igEditSeekBar;
                    igEditSeekBar.A01 = 0.0f;
                    igEditSeekBar.A02 = 100;
                    igEditSeekBar.setCurrentValue(this.A05);
                    C65761LzF.A01(igEditSeekBar, this, 8);
                    2cp A002 = C61340me.A00();
                    this.A0W = A002;
                    C71392co A042 = C71392co.A04(30.0d, 4.0d);
                    2cs A022 = A002.A02();
                    this.A0D = A022;
                    Float f = this.A0I;
                    if (f != null) {
                        JTP.A1K(A022, f.floatValue());
                    }
                    A022.A09(A042);
                    K0E.A00(A022, this, 8);
                    A022.A06 = true;
                    this.A07 = context.getColor(R.color.grey_5);
                    this.A04 = context.getColor(R.color.badge_color);
                    this.A0Q = this.A06;
                    this.A0O = this.A01;
                    int i = this.A05;
                    this.A0P = i;
                    int i2 = this.A00;
                    this.A0N = i2;
                    this.A03 = i;
                    this.A02 = i2;
                    viewGroup.post(new C65889M3e(viewGroup));
                    return viewGroup;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final boolean CIj(View view, MotionEvent motionEvent) {
        C353998Kg r0;
        0qQ.A0B(motionEvent, 1);
        if (motionEvent.getAction() == 0) {
            this.A0M = true;
            FilterGroupModel filterGroupModel = this.A0G;
            if (filterGroupModel != null) {
                ValueMapFilterModel valueMapFilterModel = (ValueMapFilterModel) filterGroupModel.B5u(13);
                if (valueMapFilterModel != null) {
                    valueMapFilterModel.A00("tint_shadows_intensity", 0.0f);
                    valueMapFilterModel.A00("tint_highlights_intensity", 0.0f);
                    float[] fArr = C62580KiD.A06.A01;
                    0qQ.A07(fArr);
                    valueMapFilterModel.A03("tint_shadows_color", fArr);
                    valueMapFilterModel.A03("tint_highlights_color", fArr);
                    r0 = this.A0F;
                    if (r0 == null) {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else {
            if (motionEvent.getAction() == 1) {
                this.A0M = false;
                A00(this);
                r0 = this.A0F;
                if (r0 == null) {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
            return true;
        }
        r0.EEp();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0031, code lost:
        if (X.LSj.A02(r1) != r2) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean CNG(X.C60060Jeb r5, com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r6) {
        /*
            r4 = this;
            r3 = 0
            X.AnonymousClass7TF.A1H(r5, r6)
            r0 = 13
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r0 = r6.B5u(r0)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel r0 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel) r0
            if (r0 == 0) goto L_0x0038
            r4.A0V = r0
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TypedParameterMap r0 = r0.A01
            java.util.Map r1 = r0.A01
            java.lang.String r0 = "tint_shadows_color"
            java.lang.Object r2 = r1.get(r0)
            float[] r2 = (float[]) r2
            java.lang.String r0 = "tint_highlights_color"
            java.lang.Object r1 = r1.get(r0)
            float[] r1 = (float[]) r1
            X.KiD r0 = X.LSj.A01(r2)
            X.KiD r2 = X.C62580KiD.A06
            if (r0 != r2) goto L_0x0033
            X.KiD r1 = X.LSj.A02(r1)
            r0 = 0
            if (r1 == r2) goto L_0x0034
        L_0x0033:
            r0 = 1
        L_0x0034:
            r5.setChecked(r0)
            return r3
        L_0x0038:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64940Lkf.CNG(X.Jeb, com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel):boolean");
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public static final void A00(C64940Lkf lkf) {
        FilterGroupModel filterGroupModel = lkf.A0G;
        if (filterGroupModel != null) {
            ValueMapFilterModel valueMapFilterModel = (ValueMapFilterModel) filterGroupModel.B5u(13);
            if (valueMapFilterModel != null) {
                valueMapFilterModel.A00("tint_shadows_intensity", ((float) lkf.A05) / 100.0f);
                valueMapFilterModel.A00("tint_highlights_intensity", ((float) lkf.A00) / 100.0f);
                int i = lkf.A06;
                float[] fArr = LSj.A00;
                float[] fArr2 = C62580KiD.values()[i].A01;
                0qQ.A07(fArr2);
                valueMapFilterModel.A03("tint_shadows_color", fArr2);
                float[] fArr3 = C62580KiD.values()[lkf.A01].A00;
                0qQ.A07(fArr3);
                valueMapFilterModel.A03("tint_highlights_color", fArr3);
                FilterGroupModel filterGroupModel2 = lkf.A0G;
                if (filterGroupModel2 != null) {
                    filterGroupModel2.EWl(13, LPU.A01(valueMapFilterModel));
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public static final void A01(C64940Lkf lkf, int i) {
        float[] fArr;
        ValueMapFilterModel valueMapFilterModel;
        String str;
        if (lkf.A0J) {
            lkf.A06 = i;
            float[] fArr2 = LSj.A00;
            fArr = C62580KiD.values()[i].A01;
            0qQ.A07(fArr);
            valueMapFilterModel = lkf.A0V;
            if (valueMapFilterModel != null) {
                str = "tint_shadows_color";
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else {
            lkf.A01 = i;
            float[] fArr3 = LSj.A00;
            fArr = C62580KiD.values()[i].A00;
            0qQ.A07(fArr);
            valueMapFilterModel = lkf.A0V;
            if (valueMapFilterModel != null) {
                str = "tint_highlights_color";
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        valueMapFilterModel.A03(str, fArr);
        C353998Kg r0 = lkf.A0F;
        if (r0 != null) {
            r0.EEp();
            return;
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (r4 > 0) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CuZ(boolean r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x0076
            int r1 = r5.A06
            float[] r0 = X.LSj.A00
            X.KiD[] r0 = X.C62580KiD.values()
            r1 = r0[r1]
            X.KiD r0 = X.C62580KiD.A06
            if (r1 != r0) goto L_0x0016
            r0 = 50
            r5.A05 = r0
            r5.A0P = r0
        L_0x0016:
            int r4 = r5.A06
            r5.A0Q = r4
            int r2 = r5.A01
            r5.A0O = r2
            int r0 = r5.A05
            r5.A0P = r0
            int r0 = r5.A00
            r5.A0N = r0
        L_0x0026:
            X.Jeb r1 = r5.A0X
            if (r1 == 0) goto L_0x0087
            r3 = 0
            if (r2 > 0) goto L_0x0030
            r0 = 0
            if (r4 <= 0) goto L_0x0031
        L_0x0030:
            r0 = 1
        L_0x0031:
            r1.setChecked(r0)
            A00(r5)
            X.2cs r0 = r5.A0D
            r2 = 0
            if (r0 == 0) goto L_0x0043
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A0D
            r0.clear()
            r5.A0D = r2
        L_0x0043:
            r5.A0W = r2
            r5.A0U = r2
            android.view.View r0 = r5.A09
            if (r0 == 0) goto L_0x0053
            r0.bringToFront()
            r0.setVisibility(r3)
            r5.A09 = r2
        L_0x0053:
            android.view.View r1 = r5.A0A
            if (r1 == 0) goto L_0x005e
            r0 = 8
            r1.setVisibility(r0)
            r5.A0A = r2
        L_0x005e:
            android.view.View r0 = r5.A08
            if (r0 == 0) goto L_0x0067
            r0.setVisibility(r3)
            r5.A08 = r2
        L_0x0067:
            r5.A0R = r2
            r5.A0T = r2
            r5.A0S = r2
            r5.A0F = r2
            r5.A0G = r2
            r5.A0X = r2
            r5.A0H = r2
            return
        L_0x0076:
            int r4 = r5.A0Q
            r5.A06 = r4
            int r2 = r5.A0O
            r5.A01 = r2
            int r0 = r5.A0P
            r5.A05 = r0
            int r0 = r5.A0N
            r5.A00 = r0
            goto L_0x0026
        L_0x0087:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64940Lkf.CuZ(boolean):void");
    }

    public final String getTitle() {
        C60060Jeb jeb = this.A0X;
        if (jeb != null) {
            C66568MWw mWw = jeb.A05.A01;
            0qQ.A07(mWw);
            String name = mWw.getName();
            0qQ.A07(name);
            return name;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final boolean Dij(View view, ViewGroup viewGroup, C353998Kg r9, FilterGroupModel filterGroupModel) {
        boolean A1b = C51973G9u.A1b(view, viewGroup, filterGroupModel);
        0qQ.A0B(r9, 3);
        this.A0X = (C60060Jeb) view;
        this.A0U = viewGroup;
        this.A0G = filterGroupModel;
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new C64292LYs(3, viewGroup, this));
        ValueMapFilterModel valueMapFilterModel = (ValueMapFilterModel) filterGroupModel.B5u(13);
        if (valueMapFilterModel != null) {
            TypedParameterMap typedParameterMap = valueMapFilterModel.A01;
            Map map = typedParameterMap.A02;
            Object obj = map.get("tint_shadows_intensity");
            if (obj != null) {
                this.A05 = (int) (AnonymousClass7TE.A04(obj) * 100.0f);
                Object obj2 = map.get("tint_highlights_intensity");
                if (obj2 != null) {
                    this.A00 = (int) (100.0f * AnonymousClass7TE.A04(obj2));
                    Map map2 = typedParameterMap.A01;
                    this.A06 = LSj.A02((float[]) map2.get("tint_shadows_color")).ordinal();
                    this.A01 = LSj.A02((float[]) map2.get("tint_highlights_color")).ordinal();
                    this.A0F = r9;
                    this.A0J = A1b;
                    TextView textView = this.A0B;
                    if (textView != null) {
                        textView.setTextColor(this.A07);
                    }
                    this.A0L = filterGroupModel.CTc(19);
                    A00(this);
                    r9.EEp();
                    return A1b;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final /* synthetic */ boolean CNF(C60060Jeb jeb, PhotoFilter photoFilter) {
        return false;
    }
}
