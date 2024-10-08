package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.react.modules.base.IgReactQEModule;
import org.webrtc.EglBase14Impl;

/* renamed from: X.2gX  reason: invalid class name and case insensitive filesystem */
public abstract class C226302gX {
    public static Integer A00(String str) {
        for (Integer num : AnonymousClass05K.A00(33)) {
            if (A01(num).equals(str)) {
                return num;
            }
        }
        return AnonymousClass05K.A00;
    }

    public static String A01(Integer num) {
        int i;
        switch (num.intValue()) {
            case 1:
                return "android.widget.Button";
            case 2:
                i = 4461;
                break;
            case 3:
                return C273654mx.A00(1458);
            case 4:
                return C273654mx.A00(1452);
            case 5:
                i = 4462;
                break;
            case 6:
            case 7:
                return C273654mx.A00(118);
            case 8:
                i = 4460;
                break;
            case 9:
                i = 4470;
                break;
            case 10:
                return C273654mx.A00(1455);
            case 11:
                return C273654mx.A00(1457);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                i = 4464;
                break;
            case 13:
                i = 4465;
                break;
            case 14:
                i = 4466;
                break;
            case 15:
                i = 4458;
                break;
            case 16:
                i = 4459;
                break;
            case 17:
                return "android.widget.CheckedTextView";
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return C273654mx.A00(1454);
            case 19:
                return "android.app.ActionBar$Tab";
            case 20:
                i = 4469;
                break;
            case 21:
                i = 4463;
                break;
            case 22:
                i = 4615;
                break;
            case 23:
                return "android.widget.Toast$TN";
            case 24:
                return "android.app.AlertDialog";
            case 25:
                return "android.app.DatePickerDialog";
            case 26:
                return "android.app.TimePickerDialog";
            case 27:
                return "android.widget.DatePicker";
            case 28:
                return "android.widget.TimePicker";
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return "android.widget.NumberPicker";
            case 30:
                return C273654mx.A00(1456);
            case 31:
                return C273654mx.A00(1453);
            case 32:
                i = 4452;
                break;
            default:
                return "android.view.View";
        }
        return AnonymousClass000.A00(i);
    }

    public static String A02(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "BUTTON";
            case 2:
                return "CHECK_BOX";
            case 3:
                return "DROP_DOWN_LIST";
            case 4:
                return "EDIT_TEXT";
            case 5:
                return "GRID";
            case 6:
                return "IMAGE";
            case 7:
                return "IMAGE_BUTTON";
            case 8:
                return "LIST";
            case 9:
                return "PAGER";
            case 10:
                return "RADIO_BUTTON";
            case 11:
                return "SEEK_CONTROL";
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return "SWITCH";
            case 13:
                return "TAB_BAR";
            case 14:
                return "TOGGLE_BUTTON";
            case 15:
                return "VIEW_GROUP";
            case 16:
                return "WEB_VIEW";
            case 17:
                return "CHECKED_TEXT_VIEW";
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return "PROGRESS_BAR";
            case 19:
                return "ACTION_BAR_TAB";
            case 20:
                return "DRAWER_LAYOUT";
            case 21:
                return "SLIDING_DRAWER";
            case 22:
                return "ICON_MENU";
            case 23:
                return "TOAST";
            case 24:
                return "ALERT_DIALOG";
            case 25:
                return "DATE_PICKER_DIALOG";
            case 26:
                return "TIME_PICKER_DIALOG";
            case 27:
                return "DATE_PICKER";
            case 28:
                return "TIME_PICKER";
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return "NUMBER_PICKER";
            case 30:
                return "SCROLL_VIEW";
            case 31:
                return "HORIZONTAL_SCROLL_VIEW";
            case 32:
                return "KEYBOARD_KEY";
            default:
                return NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
        }
    }
}
