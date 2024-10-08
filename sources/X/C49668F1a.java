package X;

import android.os.Bundle;
import com.facebook.dsp.core.ColorData;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.meta.foa.cds.CdsBottomSheetDimmingBehaviour;
import com.meta.foa.cds.CdsBottomSheetTopSpan;
import com.meta.foa.cds.CdsOpenScreenConfig$BottomSheetMargins;
import com.meta.foa.cds.CdsOpenScreenDismissCallback;

/* renamed from: X.F1a  reason: case insensitive filesystem */
public final class C49668F1a {
    public final C46471DfZ A00(Bundle bundle) {
        Integer num;
        EX7 ex7;
        EX5 ex5;
        EX6 ex6;
        Integer num2;
        Object A02;
        Object A022;
        Bundle bundle2 = bundle;
        bundle2.setClassLoader(C46471DfZ.class.getClassLoader());
        int i = bundle2.getInt("container_id");
        String string = bundle2.getString("dark_mode_config");
        if (string != null) {
            num = C46642DiN.A00(string);
        } else {
            num = AnonymousClass05K.A0C;
        }
        C46627Di7 A00 = C46625Di5.A00(DbT.A0w(bundle2, "drag_to_dismiss", C46627Di7.AUTO.toString()));
        C46626Di6 A002 = C46624Di4.A00(DbT.A0w(bundle2, DatePickerDialogModule.ARG_MODE, C46626Di6.FULL_SHEET.toString()));
        EX7 ex72 = EX7.STATIC;
        String A0w = DbT.A0w(bundle2, "background_mode", ex72.toString());
        EX7[] ex7Arr = EX7.A01;
        int length = ex7Arr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                2SK.A02(C46471DfZ.A0U, 002.A0R("Error finding BackgroundMode enum value for: ", A0w));
                ex7 = ex72;
                break;
            }
            ex7 = ex7Arr[i2];
            if (0qQ.A0K(ex7.toString(), A0w)) {
                break;
            }
            i2++;
        }
        EX5 ex52 = EX5.SAME_SIZE;
        String A0w2 = DbT.A0w(bundle2, "corner_style", ex52.toString());
        EX5[] ex5Arr = EX5.A01;
        int length2 = ex5Arr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length2) {
                2SK.A02(C46471DfZ.A0U, 002.A0R("Error finding Mode enum value for ", A0w2));
                ex5 = ex52;
                break;
            }
            ex5 = ex5Arr[i3];
            if (0qQ.A0K(ex5.toString(), A0w2)) {
                break;
            }
            i3++;
        }
        EX6 ex62 = EX6.AUTO;
        String A0w3 = DbT.A0w(bundle2, "dimmed_background_tap_to_dismiss", ex62.toString());
        EX6[] ex6Arr = EX6.A01;
        int length3 = ex6Arr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length3) {
                2SK.A02(C46471DfZ.A0U, 002.A0R("Error finding DimmedBackgroundTapToDismiss enum value for: ", A0w3));
                ex6 = ex62;
                break;
            }
            ex6 = ex6Arr[i4];
            if (0qQ.A0K(ex6.toString(), A0w3)) {
                break;
            }
            i4++;
        }
        if (bundle2.containsKey("keyboard_soft_input_mode")) {
            num2 = DbV.A0o(bundle2, "keyboard_soft_input_mode");
        } else {
            num2 = null;
        }
        Integer A003 = C46621Di1.A00(bundle2.getString("animation_type", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT));
        0qQ.A07(A003);
        Integer A004 = C46621Di1.A00(bundle2.getString("dismiss_animation_type", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT));
        0qQ.A07(A004);
        Class<CdsOpenScreenDismissCallback> cls = CdsOpenScreenDismissCallback.class;
        int i5 = bundle2.getInt("on_dismiss_callback", -1);
        if (i5 == -1) {
            A02 = null;
        } else {
            A02 = C14615TzM.A02(cls, Integer.valueOf(i5));
        }
        CdsOpenScreenDismissCallback cdsOpenScreenDismissCallback = (CdsOpenScreenDismissCallback) A02;
        Class<VQZ> cls2 = VQZ.class;
        int i6 = bundle2.getInt("custom_loading_view_resolver", -1);
        if (i6 == -1) {
            A022 = null;
        } else {
            A022 = C14615TzM.A02(cls2, Integer.valueOf(i6));
        }
        VQZ vqz = (VQZ) A022;
        boolean z = bundle2.getBoolean("custom_loading_view_resolver", false);
        boolean z2 = bundle2.getBoolean("native_disable_cancel_button_on_loading_screen", false);
        boolean z3 = bundle2.getBoolean("clear_top_activity", false);
        ColorData colorData = (ColorData) bundle2.getParcelable("dimmed_background_color");
        ColorData colorData2 = (ColorData) bundle2.getParcelable("background_overlay_color");
        CdsOpenScreenConfig$BottomSheetMargins cdsOpenScreenConfig$BottomSheetMargins = (CdsOpenScreenConfig$BottomSheetMargins) bundle2.getParcelable("bottom_sheet_margins");
        String string2 = bundle2.getString("bloks_screen_id", (String) null);
        boolean z4 = bundle2.getBoolean("apply_bottom_padding_fix");
        CdsBottomSheetTopSpan cdsBottomSheetTopSpan = (CdsBottomSheetTopSpan) bundle2.getParcelable("bottom_sheet_top_span");
        boolean z5 = bundle2.getBoolean("slide_to_anchor_immediately");
        boolean z6 = bundle2.getBoolean("force_gradient_background");
        CdsBottomSheetDimmingBehaviour cdsBottomSheetDimmingBehaviour = (CdsBottomSheetDimmingBehaviour) bundle2.getParcelable("key_dimming_behaviour");
        if (cdsBottomSheetDimmingBehaviour == null) {
            cdsBottomSheetDimmingBehaviour = CdsBottomSheetDimmingBehaviour.Default.A00;
        }
        if (cdsOpenScreenConfig$BottomSheetMargins == null && VJ0.A00()) {
            ex5 = EX5.TOP_ROUNDED;
        }
        return new C46471DfZ(vqz, colorData, colorData2, cdsBottomSheetDimmingBehaviour, cdsBottomSheetTopSpan, ex7, cdsOpenScreenConfig$BottomSheetMargins, ex5, ex6, A00, A002, cdsOpenScreenDismissCallback, num, num2, A003, A004, string2, i, z3, z, z2, z4, z5, z6);
    }
}
