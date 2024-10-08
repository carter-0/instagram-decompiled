package X;

import android.os.Bundle;
import com.facebook.dsp.core.ColorData;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.meta.foa.cds.CdsBottomSheetDimmingBehaviour;
import com.meta.foa.cds.CdsBottomSheetTopSpan;
import com.meta.foa.cds.CdsOpenScreenConfig$BottomSheetMargins;
import com.meta.foa.cds.CdsOpenScreenDismissCallback;
import java.util.Map;

/* renamed from: X.DfZ  reason: case insensitive filesystem */
public final class C46471DfZ implements C13690Tf8 {
    public static final EX7 A0O = EX7.STATIC;
    public static final C49668F1a A0P = new Object();
    public static final EX5 A0Q = EX5.SAME_SIZE;
    public static final EX6 A0R = EX6.AUTO;
    public static final C46627Di7 A0S = C46627Di7.AUTO;
    public static final C46626Di6 A0T = C46626Di6.FULL_SHEET;
    public static final String A0U;
    public CdsOpenScreenDismissCallback A00;
    public Integer A01;
    public Integer A02;
    public final int A03;
    public final VQZ A04;
    public final ColorData A05;
    public final ColorData A06;
    public final CdsBottomSheetDimmingBehaviour A07;
    public final CdsBottomSheetTopSpan A08;
    public final EX7 A09;
    public final CdsOpenScreenConfig$BottomSheetMargins A0A;
    public final EX5 A0B;
    public final EX6 A0C;
    public final C46627Di7 A0D;
    public final C46626Di6 A0E;
    public final Integer A0F;
    public final Integer A0G;
    public final String A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.F1a] */
    static {
        Map map = 0Yh.A03;
        String A012 = 0q1.A01(C46471DfZ.class);
        DbS.A1Y(A012);
        A0U = A012;
    }

    public final Integer BeT() {
        return null;
    }

    public final int Bpr() {
        return this.A03;
    }

    public C46471DfZ(VQZ vqz, ColorData colorData, ColorData colorData2, CdsBottomSheetDimmingBehaviour cdsBottomSheetDimmingBehaviour, CdsBottomSheetTopSpan cdsBottomSheetTopSpan, EX7 ex7, CdsOpenScreenConfig$BottomSheetMargins cdsOpenScreenConfig$BottomSheetMargins, EX5 ex5, EX6 ex6, C46627Di7 di7, C46626Di6 di6, CdsOpenScreenDismissCallback cdsOpenScreenDismissCallback, Integer num, Integer num2, Integer num3, Integer num4, String str, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A03 = i;
        this.A0F = num;
        this.A0D = di7;
        this.A0E = di6;
        this.A09 = ex7;
        this.A0C = ex6;
        this.A0G = num2;
        this.A01 = num3;
        this.A02 = num4;
        this.A0M = z;
        this.A06 = colorData;
        this.A05 = colorData2;
        this.A0A = cdsOpenScreenConfig$BottomSheetMargins;
        this.A0B = ex5;
        this.A00 = cdsOpenScreenDismissCallback;
        this.A04 = vqz;
        this.A0L = z2;
        this.A0J = z3;
        this.A0H = str;
        this.A0I = z4;
        this.A08 = cdsBottomSheetTopSpan;
        this.A0N = z5;
        this.A0K = z6;
        this.A07 = cdsBottomSheetDimmingBehaviour;
    }

    public final Bundle A00() {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putInt("container_id", this.A03);
        A0a.putString("drag_to_dismiss", this.A0D.A00);
        A0a.putString(DatePickerDialogModule.ARG_MODE, this.A0E.A00);
        A0a.putString("background_mode", this.A09.A00);
        A0a.putString("dimmed_background_tap_to_dismiss", this.A0C.A00);
        Integer num = this.A0G;
        if (num != null) {
            A0a.putInt("keyboard_soft_input_mode", num.intValue());
        }
        Integer num2 = this.A01;
        if (num2 != null) {
            A0a.putString("animation_type", C46621Di1.A01(num2));
        }
        Integer num3 = this.A02;
        if (num3 != null) {
            A0a.putString("dismiss_animation_type", C46621Di1.A01(num3));
        }
        VQZ vqz = this.A04;
        if (vqz != null) {
            A0a.putInt("custom_loading_view_resolver", C14615TzM.A00(vqz));
        }
        CdsOpenScreenDismissCallback cdsOpenScreenDismissCallback = this.A00;
        if (cdsOpenScreenDismissCallback != null) {
            A0a.putInt("on_dismiss_callback", C14615TzM.A00(cdsOpenScreenDismissCallback));
        }
        A0a.putBoolean("native_use_slide_animation_for_full_screen", this.A0L);
        A0a.putBoolean("native_disable_cancel_button_on_loading_screen", this.A0J);
        A0a.putBoolean("clear_top_activity", this.A0M);
        A0a.putParcelable("dimmed_background_color", this.A06);
        A0a.putParcelable("background_overlay_color", this.A05);
        A0a.putParcelable("bottom_sheet_margins", this.A0A);
        A0a.putString("corner_style", this.A0B.A00);
        A0a.setClassLoader(C46471DfZ.class.getClassLoader());
        String str = this.A0H;
        if (str != null) {
            A0a.putString("bloks_screen_id", str);
        }
        A0a.putString("dark_mode_config", C46642DiN.A01(this.A0F));
        A0a.putBoolean("apply_bottom_padding_fix", this.A0I);
        A0a.putParcelable("bottom_sheet_top_span", this.A08);
        A0a.putBoolean("slide_to_anchor_immediately", this.A0N);
        A0a.putBoolean("force_gradient_background", this.A0K);
        A0a.putParcelable("key_dimming_behaviour", this.A07);
        return A0a;
    }
}
