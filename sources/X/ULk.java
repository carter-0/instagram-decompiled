package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.react.modules.base.IgReactQEModule;
import org.webrtc.EglBase14Impl;

public final class ULk extends AnonymousClass0T0 {
    public static final F1H A07 = new Object();
    public final int A00;
    public final C277014uI A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ULk) {
                ULk uLk = (ULk) obj;
                if (this.A02 != uLk.A02 || !0qQ.A0K(this.A05, uLk.A05) || this.A06 != uLk.A06 || !0qQ.A0K(this.A04, uLk.A04) || !0qQ.A0K(this.A03, uLk.A03) || !0qQ.A0K(this.A01, uLk.A01) || this.A00 != uLk.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int hashCode;
        Integer num = this.A02;
        if (num == null) {
            hashCode = 0;
        } else {
            int intValue = num.intValue();
            switch (intValue) {
                case 1:
                    str = "MORE_HORIZONTAL_PANO";
                    break;
                case 2:
                    str = "NEXT";
                    break;
                case 3:
                    str = "SHARE";
                    break;
                case 4:
                    str = "INFO";
                    break;
                case 5:
                    str = "INSIGHTS";
                    break;
                case 6:
                    str = "DELETE";
                    break;
                case 7:
                    str = "CONVERT_TO_BUSINESS";
                    break;
                case 8:
                    str = "DONE";
                    break;
                case 9:
                    str = "ADD";
                    break;
                case 10:
                    str = "COMPOSE";
                    break;
                case 11:
                    str = "CAMERA";
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    str = "CREATE_PROMOTION";
                    break;
                case 13:
                    str = "SAVE";
                    break;
                case 14:
                    str = "UNSAVE";
                    break;
                case 15:
                    str = "VIDEO_CALL";
                    break;
                case 16:
                    str = "AUDIO_CALL";
                    break;
                case 17:
                    str = "CANCEL";
                    break;
                case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                    str = "MULTI_SELECT_ICON";
                    break;
                case 19:
                    str = "BACK";
                    break;
                case 20:
                    str = Pxd.A00(165);
                    break;
                case 21:
                    str = "REPORT";
                    break;
                case 22:
                    str = "OVERFLOW_HORIZONTAL";
                    break;
                case 23:
                    str = "CART";
                    break;
                case 24:
                    str = "SETTINGS";
                    break;
                case 25:
                    str = "MAIL";
                    break;
                case 26:
                    str = "SLIDERS";
                    break;
                case 27:
                    str = "PAYMENTS";
                    break;
                case 28:
                    str = "QUESTIONS";
                    break;
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                    str = "EDIT_LIST";
                    break;
                case 30:
                    str = "EDIT";
                    break;
                case 31:
                    str = "SEARCH";
                    break;
                case 32:
                    str = "CHANNEL_INBOX_DIRECTORY";
                    break;
                default:
                    str = "OVERFLOW";
                    break;
            }
            hashCode = str.hashCode() + intValue;
        }
        return ((((((AnonymousClass7TF.A09(this.A06, ((hashCode * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A01)) * 31) + this.A00;
    }

    public ULk(C277014uI r1, Integer num, String str, String str2, String str3, int i, boolean z) {
        this.A02 = num;
        this.A05 = str;
        this.A06 = z;
        this.A04 = str2;
        this.A03 = str3;
        this.A01 = r1;
        this.A00 = i;
    }

    public ULk() {
        this((C277014uI) null, (Integer) null, (String) null, "regular", (String) null, 0, true);
    }
}
