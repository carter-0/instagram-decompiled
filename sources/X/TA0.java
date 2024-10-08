package X;

import com.instagram.react.modules.base.IgReactQEModule;

public final class TA0 implements Cloneable {
    public Integer A00;
    public boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !DbY.A1b(this, obj)) {
                return false;
            }
            TA0 ta0 = (TA0) obj;
            if (!(this.A00 == ta0.A00 && this.A01 == ta0.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int i = (this.A01 ? 1 : 0) * true;
        int intValue = this.A00.intValue();
        switch (intValue) {
            case 1:
                str = "BOX_BLUR";
                break;
            case 2:
                str = "GAUSS_BLUR";
                break;
            case 3:
                str = "FLASH";
                break;
            case 4:
                str = "LEAK";
                break;
            case 5:
                str = "LEAK_COMPOSITE";
                break;
            case 6:
                str = "PS";
                break;
            case 7:
                str = "PS_COMPOSITE";
                break;
            case 8:
                str = "FR";
                break;
            case 9:
                str = "FR_COMPOSITE";
                break;
            case 10:
                str = "FR_BW";
                break;
            case 11:
                str = "FR_BW_COMPOSITE";
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                str = "VHS";
                break;
            case 13:
                str = "VHS_COMPOSITE";
                break;
            default:
                str = "COPY";
                break;
        }
        return i + str.hashCode() + intValue;
    }

    /* renamed from: A00 */
    public final TA0 clone() {
        try {
            Object clone = super.clone();
            0qQ.A0C(clone, "null cannot be cast to non-null type com.instagram.camera.effect.mq.poses.PosesFramesGLRenderer.PosesGLRendererProgramConfig");
            return (TA0) clone;
        } catch (CloneNotSupportedException unused) {
            return this;
        }
    }
}
