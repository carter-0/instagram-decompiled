package X;

import android.view.View;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.android.R;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import org.webrtc.EglBase14Impl;

/* renamed from: X.Uze  reason: case insensitive filesystem */
public enum C16684Uze {
    A0K,
    BUTTON,
    DROPDOWNLIST,
    TOGGLEBUTTON,
    LINK,
    SEARCH,
    IMAGE,
    IMAGEBUTTON,
    KEYBOARDKEY,
    TEXT,
    ADJUSTABLE,
    SUMMARY,
    HEADER,
    ALERT,
    CHECKBOX,
    COMBOBOX,
    MENU,
    MENUBAR,
    MENUITEM,
    PROGRESSBAR,
    RADIO,
    RADIOGROUP,
    SCROLLBAR,
    SPINBUTTON,
    SWITCH,
    TAB,
    TABLIST,
    TIMER,
    LIST,
    GRID,
    PAGER,
    SCROLLVIEW,
    HORIZONTALSCROLLVIEW,
    VIEWGROUP,
    WEBVIEW,
    DRAWERLAYOUT,
    SLIDINGDRAWER,
    ICONMENU,
    TOOLBAR;

    public static C16684Uze A01(String str) {
        if (str == null) {
            return A0K;
        }
        for (C16684Uze uze : values()) {
            if (uze.name().equalsIgnoreCase(str)) {
                return uze;
            }
        }
        throw AnonymousClass7TF.A0W("Invalid accessibility role value: ", str);
    }

    public static C16684Uze A00(View view) {
        C16531Uwb uwb = (C16531Uwb) view.getTag(R.id.role);
        if (uwb == null) {
            return (C16684Uze) view.getTag(R.id.accessibility_role);
        }
        switch (uwb.ordinal()) {
            case 0:
                return ALERT;
            case 5:
                return BUTTON;
            case 7:
                return CHECKBOX;
            case 9:
                return COMBOBOX;
            case 19:
                return GRID;
            case 21:
                return HEADER;
            case 22:
                return IMAGE;
            case 23:
                return LINK;
            case 24:
                return LIST;
            case 30:
                return MENU;
            case 31:
                return MENUBAR;
            case 32:
                return MENUITEM;
            case 35:
                return A0K;
            case 39:
                return PROGRESSBAR;
            case 40:
                return RADIO;
            case Seq.NULL_REFNUM /*41*/:
                return RADIOGROUP;
            case 46:
                return SCROLLBAR;
            case 47:
                return SEARCH;
            case 49:
                return ADJUSTABLE;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                return SPINBUTTON;
            case 52:
                return SUMMARY;
            case 53:
                return SWITCH;
            case 54:
                return TAB;
            case 56:
                return TABLIST;
            case 59:
                return TIMER;
            case 60:
                return TOOLBAR;
            default:
                return null;
        }
    }

    public static String A02(C16684Uze uze) {
        switch (uze.ordinal()) {
            case 0:
            case 4:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 13:
            case 15:
            case 16:
            case 17:
            case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
            case 19:
            case 21:
            case 22:
            case 25:
            case 26:
            case 27:
            case 38:
                return "android.view.View";
            case 1:
                return "android.widget.Button";
            case 2:
                return "android.widget.Spinner";
            case 3:
                return "android.widget.ToggleButton";
            case 5:
                return "android.widget.EditText";
            case 6:
                return "android.widget.ImageView";
            case 7:
                return "android.widget.ImageButton";
            case 8:
                return "android.inputmethodservice.Keyboard$Key";
            case 9:
                return C273654mx.A00(1459);
            case 10:
                return "android.widget.SeekBar";
            case 14:
                return C273654mx.A00(1451);
            case 20:
                return "android.widget.RadioButton";
            case 23:
                return "android.widget.SpinButton";
            case 24:
                return "android.widget.Switch";
            case 28:
                return "android.widget.AbsListView";
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return "android.widget.GridView";
            case 30:
                return "androidx.viewpager.widget.ViewPager";
            case 31:
                return "android.widget.ScrollView";
            case 32:
                return "android.widget.HorizontalScrollView";
            case 33:
                return "android.view.ViewGroup";
            case 34:
                return "android.webkit.WebView";
            case 35:
                return "androidx.drawerlayout.widget.DrawerLayout";
            case 36:
                return "android.widget.SlidingDrawer";
            case 37:
                return "com.android.internal.view.menu.IconMenuView";
            default:
                throw C51973G9u.A0g(uze, "Invalid accessibility role value: ", new StringBuilder());
        }
    }
}
