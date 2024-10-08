package X;

import com.instagram.android.R;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Nvc  reason: case insensitive filesystem */
public abstract class C69998Nvc {
    public static final Integer A00(Integer num) {
        int i;
        switch (C51967G9n.A03(num, 0)) {
            case 4:
            case 8:
                i = R.attr.igds_color_gradient_pink;
                break;
            case 5:
            case 13:
                i = R.attr.igds_color_gradient_orange;
                break;
            case 6:
                i = R.attr.igds_color_success;
                break;
            case 7:
                i = R.attr.igds_color_gradient_blue;
                break;
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 14:
                i = R.attr.igds_color_gradient_purple;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i);
    }
}
