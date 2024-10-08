package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TypedParameterMap;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel;
import com.instagram.common.session.UserSession;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.ui.igeditseekbar.IgEditSeekBar;
import java.util.Map;

/* renamed from: X.Lke  reason: case insensitive filesystem */
public final class C64939Lke implements C66534MVo {
    public int A00;
    public int A01;
    public C353998Kg A02;
    public FilterGroupModel A03;
    public boolean A04;
    public boolean A05;
    public C60060Jeb A06;
    public Integer A07;
    public final UserSession A08;

    public static int A00(FilterGroupModel filterGroupModel, Integer num) {
        Map map;
        String str;
        0qQ.A0B(filterGroupModel, 0);
        ValueMapFilterModel valueMapFilterModel = (ValueMapFilterModel) filterGroupModel.B5u(13);
        if (valueMapFilterModel == null) {
            return 0;
        }
        TypedParameterMap typedParameterMap = valueMapFilterModel.A01;
        switch (num.intValue()) {
            case 0:
                map = typedParameterMap.A02;
                str = "brightness";
                break;
            case 1:
                map = typedParameterMap.A02;
                str = "contrast";
                break;
            case 2:
                map = typedParameterMap.A02;
                str = "saturation";
                break;
            case 3:
                map = typedParameterMap.A02;
                str = "temperature";
                break;
            case 4:
                map = typedParameterMap.A02;
                str = "vignette";
                break;
            case 5:
                map = typedParameterMap.A02;
                str = "fade";
                break;
            case 7:
                map = typedParameterMap.A02;
                str = "sharpen";
                break;
            case 8:
                map = typedParameterMap.A02;
                str = "shadows";
                break;
            case 9:
                map = typedParameterMap.A02;
                str = "highlights";
                break;
            default:
                return 0;
        }
        return (int) (JTS.A02(str, map) * 100.0f);
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002b, code lost:
        if (X.LPU.A00(r3) != false) goto L_0x002d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C64939Lke r5, int r6) {
        /*
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r0 = r5.A03
            r0.getClass()
            r4 = 13
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r3 = r0.B5u(r4)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel r3 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel) r3
            r3.getClass()
            java.lang.Integer r0 = r5.A07
            r0.getClass()
            int r1 = r0.intValue()
            r0 = 1120403456(0x42c80000, float:100.0)
            switch(r1) {
                case 0: goto L_0x0032;
                case 1: goto L_0x0037;
                case 2: goto L_0x0041;
                case 3: goto L_0x003c;
                case 4: goto L_0x0050;
                case 5: goto L_0x0055;
                case 6: goto L_0x001e;
                case 7: goto L_0x005a;
                case 8: goto L_0x0046;
                case 9: goto L_0x004b;
                default: goto L_0x001e;
            }
        L_0x001e:
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r2 = r5.A03
            boolean r0 = X.LPU.A01(r3)
            if (r0 != 0) goto L_0x002d
            boolean r1 = X.LPU.A00(r3)
            r0 = 0
            if (r1 == 0) goto L_0x002e
        L_0x002d:
            r0 = 1
        L_0x002e:
            r2.EWl(r4, r0)
            return
        L_0x0032:
            float r1 = (float) r6
            float r1 = r1 / r0
            java.lang.String r0 = "brightness"
            goto L_0x005e
        L_0x0037:
            float r1 = (float) r6
            float r1 = r1 / r0
            java.lang.String r0 = "contrast"
            goto L_0x005e
        L_0x003c:
            float r1 = (float) r6
            float r1 = r1 / r0
            java.lang.String r0 = "temperature"
            goto L_0x005e
        L_0x0041:
            float r1 = (float) r6
            float r1 = r1 / r0
            java.lang.String r0 = "saturation"
            goto L_0x005e
        L_0x0046:
            float r1 = (float) r6
            float r1 = r1 / r0
            java.lang.String r0 = "shadows"
            goto L_0x005e
        L_0x004b:
            float r1 = (float) r6
            float r1 = r1 / r0
            java.lang.String r0 = "highlights"
            goto L_0x005e
        L_0x0050:
            float r1 = (float) r6
            float r1 = r1 / r0
            java.lang.String r0 = "vignette"
            goto L_0x005e
        L_0x0055:
            float r1 = (float) r6
            float r1 = r1 / r0
            java.lang.String r0 = "fade"
            goto L_0x005e
        L_0x005a:
            float r1 = (float) r6
            float r1 = r1 / r0
            java.lang.String r0 = "sharpen"
        L_0x005e:
            r3.A00(r0, r1)
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64939Lke.A01(X.Lke, int):void");
    }

    public final View AZq(Context context) {
        int i;
        float f;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundResource(2Yu.A0C(context));
        Integer num = this.A07;
        num.getClass();
        switch (num.intValue()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 8:
            case 9:
                i = 200;
                f = 0.5f;
                break;
            case 4:
            case 5:
            case 7:
                i = 100;
                f = 0.0f;
                break;
            default:
                return null;
        }
        IgEditSeekBar igEditSeekBar = new IgEditSeekBar(context);
        igEditSeekBar.A01 = f;
        igEditSeekBar.A02 = i;
        igEditSeekBar.setCurrentValue(this.A01);
        C65761LzF.A01(igEditSeekBar, this, 4);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        int A062 = AnonymousClass7TG.A06(context);
        layoutParams.setMargins(A062, 0, A062, 0);
        linearLayout.addView(igEditSeekBar, layoutParams);
        linearLayout.setImportantForAccessibility(2);
        igEditSeekBar.setContentDescription(AnonymousClass7TF.A0e(linearLayout.getResources(), C66568MWw.A02(this.A06), 2131974011));
        return linearLayout;
    }

    public final boolean CNG(C60060Jeb jeb, FilterGroupModel filterGroupModel) {
        C66568MWw mWw = jeb.A05.A01;
        0qQ.A07(mWw);
        jeb.setChecked(AnonymousClass7TF.A1P(A00(filterGroupModel, ((C61716KJh) mWw).A00)));
        return false;
    }

    public final void CuZ(boolean z) {
        if (z) {
            this.A01 = this.A00;
        }
        C60060Jeb jeb = this.A06;
        jeb.getClass();
        jeb.setChecked(AnonymousClass7TF.A1P(this.A01));
        A01(this, this.A01);
        this.A06 = null;
        this.A07 = null;
        this.A03 = null;
        this.A02 = null;
    }

    public final boolean Dij(View view, ViewGroup viewGroup, C353998Kg r5, FilterGroupModel filterGroupModel) {
        this.A03 = filterGroupModel;
        C60060Jeb jeb = (C60060Jeb) view;
        this.A06 = jeb;
        C66568MWw mWw = jeb.A05.A01;
        0qQ.A07(mWw);
        Integer num = ((C61716KJh) mWw).A00;
        this.A07 = num;
        this.A02 = r5;
        int A002 = A00(this.A03, num);
        this.A00 = A002;
        this.A01 = A002;
        this.A04 = this.A03.CTc(19);
        return true;
    }

    public final String getTitle() {
        return C66568MWw.A02(this.A06);
    }

    public C64939Lke(UserSession userSession) {
        this.A08 = userSession;
    }

    public final boolean CIj(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.A05 = true;
            A01(this, 0);
        } else {
            if (motionEvent.getAction() == 1) {
                this.A05 = false;
                A01(this, this.A00);
            }
            return true;
        }
        C353998Kg r0 = this.A02;
        r0.getClass();
        r0.EEp();
        return true;
    }

    public final /* synthetic */ boolean CNF(C60060Jeb jeb, PhotoFilter photoFilter) {
        return false;
    }
}
