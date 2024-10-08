package X;

import com.instagram.react.modules.base.IgReactQEModule;
import org.webrtc.EglBase14Impl;

/* renamed from: X.T5a  reason: case insensitive filesystem */
public final class C12740T5a implements C634111x {
    public final int[] AwM(int i) {
        int[] iArr;
        int i2 = 5;
        switch (i) {
            case 0:
                return new int[0];
            case 1:
                return new int[]{0};
            case 2:
                return new int[]{1};
            case 3:
                iArr = new int[1];
                i2 = 2;
                break;
            case 4:
                iArr = new int[1];
                i2 = 107;
                break;
            case 5:
                iArr = new int[1];
                i2 = 4;
                break;
            case 7:
            case 113:
                iArr = new int[1];
                break;
            case 8:
                iArr = new int[1];
                i2 = 7;
                break;
            case 9:
                iArr = new int[1];
                i2 = 8;
                break;
            case 10:
                iArr = new int[1];
                i2 = 9;
                break;
            case 11:
                iArr = new int[1];
                i2 = 10;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                iArr = new int[1];
                i2 = 11;
                break;
            case 15:
                iArr = new int[1];
                i2 = 44;
                break;
            case 16:
                iArr = new int[1];
                i2 = 15;
                break;
            case 17:
                iArr = new int[1];
                i2 = 16;
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
            case 75:
            case 78:
            case 110:
            case 111:
                return new int[]{17};
            case 23:
                iArr = new int[1];
                i2 = 61;
                break;
            case 44:
                iArr = new int[1];
                i2 = 12;
                break;
            case 107:
                iArr = new int[1];
                i2 = 3;
                break;
            case 115:
                iArr = new int[1];
                i2 = 113;
                break;
            default:
                return new int[]{18};
        }
        iArr[0] = i2;
        return iArr;
    }
}
