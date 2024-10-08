package X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.TyF  reason: case insensitive filesystem */
public final class C14550TyF extends 02Z {
    public static final Map A05;
    public static final Map A06;
    public static final Map A07;
    public static final Map A08;
    public int A00 = 1056964608;
    public final C276544tV A01;
    public final C307786Rm A02;
    public final C276544tV A03;
    public final Map A04;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("button", "android.widget.Button");
        hashMap.put("checkbox", "android.widget.CompoundButton");
        hashMap.put("checked_text_view", "android.widget.CheckedTextView");
        hashMap.put("drop_down_list", "android.widget.Spinner");
        hashMap.put("edit_text", "android.widget.EditText");
        hashMap.put("grid", "android.widget.GridView");
        hashMap.put("image", "android.widget.ImageView");
        hashMap.put("list", "android.widget.AbsListView");
        hashMap.put("pager", "androidx.viewpager.widget.ViewPager");
        hashMap.put("radio_button", "android.widget.RadioButton");
        hashMap.put("seek_control", "android.widget.SeekBar");
        hashMap.put("switch", "android.widget.Switch");
        hashMap.put("tab_bar", "android.widget.TabWidget");
        hashMap.put("toggle_button", "android.widget.ToggleButton");
        hashMap.put("view_group", "android.view.ViewGroup");
        hashMap.put("web_view", "android.webkit.WebView");
        hashMap.put("progress_bar", "android.widget.ProgressBar");
        hashMap.put("action_bar_tab", "android.app.ActionBar$Tab");
        hashMap.put("drawer_layout", "androidx.drawerlayout.widget.DrawerLayout");
        hashMap.put("sliding_drawer", "android.widget.SlidingDrawer");
        hashMap.put("icon_menu", "com.android.internal.view.menu.IconMenuView");
        hashMap.put("toast", "android.widget.Toast$TN");
        hashMap.put("alert_dialog", "android.app.AlertDialog");
        hashMap.put("date_picker_dialog", "android.app.DatePickerDialog");
        hashMap.put("time_picker_dialog", "android.app.TimePickerDialog");
        hashMap.put("date_picker", "android.widget.DatePicker");
        hashMap.put("time_picker", "android.widget.TimePicker");
        hashMap.put("number_picker", "android.widget.NumberPicker");
        hashMap.put("scroll_view", "android.widget.ScrollView");
        hashMap.put("horizontal_scroll_view", "android.widget.HorizontalScrollView");
        hashMap.put("keyboard_key", "android.inputmethodservice.Keyboard$Key");
        hashMap.put(NetInfoModule.CONNECTION_TYPE_NONE, "");
        A08 = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("click", A00(04x.A08));
        hashMap2.put("long_click", A00(04x.A0L));
        hashMap2.put("scroll_forward", A00(04x.A0Z));
        hashMap2.put("scroll_backward", A00(04x.A0X));
        hashMap2.put("expand", A00(04x.A0H));
        hashMap2.put("collapse", A00(04x.A09));
        hashMap2.put("dismiss", A00(04x.A0D));
        hashMap2.put("scroll_up", A00(04x.A0e));
        hashMap2.put("scroll_left", A00(04x.A0b));
        hashMap2.put("scroll_down", A00(04x.A0Y));
        hashMap2.put("scroll_right", A00(04x.A0c));
        hashMap2.put("custom", C51967G9n.A0j());
        A05 = Collections.unmodifiableMap(hashMap2);
        HashMap hashMap3 = new HashMap();
        Integer A0q = C66580MXl.A0q();
        hashMap3.put("percent", A0q);
        Integer A0R = C13988Tno.A0R();
        hashMap3.put("float", A0R);
        Integer A0k = C51967G9n.A0k();
        hashMap3.put("int", A0k);
        A07 = Collections.unmodifiableMap(hashMap3);
        HashMap A0f = Dba.A0f(NetInfoModule.CONNECTION_TYPE_NONE, A0k);
        A0f.put("single", A0R);
        A0f.put("multiple", A0q);
        A06 = Collections.unmodifiableMap(A0f);
    }

    public final boolean A0V(View view, int i, Bundle bundle) {
        C277014uI r5;
        StringBuilder sb;
        String str;
        C16717V3a v3a = (C16717V3a) C51968G9o.A10(this.A04, i);
        if (v3a == null || (r5 = v3a.A01) == null) {
            return C14550TyF.super.A0V(view, i, bundle);
        }
        C276544tV r3 = this.A03;
        C308276Tl r0 = new C308276Tl();
        r0.A03(r3, 0);
        Object A002 = C299275ur.A00(C307896Rx.A01(this.A02, r5, r3.A09), r0.A00(), r5);
        if ((A002 instanceof Number) || (A002 instanceof Boolean)) {
            return Q0A.A01(A002);
        }
        if (A002 != null) {
            str = "Got a non-boolean result while evaluating action ";
        } else {
            sb = new StringBuilder();
            str = "Got a null result while evaluating action ";
        }
        1Kn.A02("bk.components.AndroidNativeAccessibilityExtension", Pxg.A0t(str, sb, i));
        return false;
    }

    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        Number A14;
        Number A142;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = accessibilityNodeInfoCompat;
        C14550TyF.super.A0Y(view, accessibilityNodeInfoCompat2);
        C276544tV r3 = this.A01;
        boolean A0R = r3.A0R(41, false);
        boolean A0R2 = r3.A0R(49, false);
        boolean A0R3 = r3.A0R(51, false);
        boolean A0R4 = r3.A0R(36, false);
        String A0K = r3.A0K(50);
        String A0K2 = r3.A0K(45);
        String A0K3 = r3.A0K(46);
        String A0K4 = r3.A0K(58);
        String A0K5 = r3.A0K(57);
        C276544tV A072 = r3.A07(52);
        C276544tV A073 = r3.A07(53);
        C276544tV A074 = r3.A07(54);
        if (A072 != null) {
            String A0K6 = A072.A0K(40);
            float A022 = A072.A02(38, -1.0f);
            float A023 = A072.A02(36, -1.0f);
            float A024 = A072.A02(35, -1.0f);
            if (A022 >= 0.0f && A024 >= 0.0f && A023 >= 0.0f && (A142 = C51966G9m.A14(A0K6, A07)) != null) {
                accessibilityNodeInfoCompat2.mInfo.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(A142.intValue(), A022, A023, A024));
            }
        }
        if (A073 != null) {
            int A032 = A073.A03(35, -1);
            int A033 = A073.A03(38, -1);
            boolean A0R5 = A073.A0R(36, false);
            String str = NetInfoModule.CONNECTION_TYPE_NONE;
            String A0K7 = A073.A0K(40);
            if (A0K7 != null) {
                str = A0K7;
            }
            if (A032 >= -1 && A033 >= -1 && (A14 = C51966G9m.A14(str, A06)) != null) {
                accessibilityNodeInfoCompat2.mInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(A033, A032, A0R5, A14.intValue()));
            }
        }
        if (A074 != null) {
            int A034 = A074.A03(35, -1);
            int A035 = A074.A03(38, -1);
            int A036 = A074.A03(36, -1);
            int A037 = A074.A03(40, -1);
            if (A034 >= 0 && A035 >= 0 && A036 >= 0 && A037 >= 0) {
                accessibilityNodeInfoCompat2.mInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(A035, A037, A034, A036, A0R, A0R2));
            }
        }
        Iterator A0v = AnonymousClass7TF.A0v(this.A04);
        while (A0v.hasNext()) {
            C16717V3a v3a = (C16717V3a) A0v.next();
            int i = v3a.A00;
            Map map = A05;
            if (map.containsKey("click") && i == Pxg.A06("click", map)) {
                accessibilityNodeInfoCompat2.setClickable(true);
            } else if (map.containsKey("long_click") && i == Pxg.A06("long_click", map)) {
                accessibilityNodeInfoCompat2.mInfo.setLongClickable(true);
            }
            String str2 = v3a.A02;
            if (str2 != null) {
                accessibilityNodeInfoCompat2.addAction(new 04x(i, str2));
            } else {
                accessibilityNodeInfoCompat2.addAction(i);
            }
        }
        if (A0R3) {
            accessibilityNodeInfoCompat2.mInfo.setCheckable(true);
            accessibilityNodeInfoCompat2.mInfo.setChecked(A0R4);
        }
        if (A0K != null) {
            accessibilityNodeInfoCompat2.mInfo.setTooltipText(A0K);
        }
        if (A0K2 != null && !A0K2.equals(NetInfoModule.CONNECTION_TYPE_NONE)) {
            Map map2 = A08;
            if (map2.containsKey(A0K2)) {
                accessibilityNodeInfoCompat2.setClassName((CharSequence) map2.get(A0K2));
            }
        }
        if (A0K3 != null) {
            accessibilityNodeInfoCompat2.setRoleDescription(A0K3);
        }
        if (A0K4 != null) {
            accessibilityNodeInfoCompat2.setStateDescription(A0K4);
        }
        if (A0K5 != null && !A0K5.isEmpty()) {
            accessibilityNodeInfoCompat2.mInfo.setContentInvalid(true);
            accessibilityNodeInfoCompat2.mInfo.setError(A0K5);
        }
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [X.V3a, java.lang.Object] */
    public C14550TyF(C307786Rm r9, C276544tV r10, C276544tV r11) {
        this.A01 = r10;
        this.A03 = r11;
        this.A02 = r9;
        HashMap hashMap = new HashMap();
        List<C276544tV> A0M = r10.A0M(55);
        if (A0M != null && !A0M.isEmpty()) {
            for (C276544tV r2 : A0M) {
                String A0K = r2.A0K(35);
                String A0K2 = r2.A0K(36);
                C277014uI A0A = r2.A0A(38);
                if (A0K != null) {
                    Map map = A05;
                    if (map.containsKey(A0K)) {
                        int intValue = ((Number) map.get(A0K)).intValue();
                        if (map.containsKey("custom") && intValue == ((Number) map.get("custom")).intValue()) {
                            intValue = this.A00;
                            this.A00 = intValue + 1;
                        }
                        Integer valueOf = Integer.valueOf(intValue);
                        ? obj = new Object();
                        obj.A02 = A0K2;
                        obj.A00 = intValue;
                        obj.A01 = A0A;
                        hashMap.put(valueOf, obj);
                    }
                }
            }
        }
        this.A04 = hashMap;
    }

    public static Integer A00(04x r0) {
        0Sd.A00(r0);
        return Integer.valueOf(r0.A00());
    }
}
