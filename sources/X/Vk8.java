package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

public final class Vk8 {
    public final float A00;
    public final float A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Vk8)) {
            return false;
        }
        Vk8 vk8 = (Vk8) obj;
        return vk8.A01 == this.A01 && vk8.A00 == this.A00;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A01) ^ Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01);
        sb.append("x");
        sb.append(this.A00);
        return sb.toString();
    }

    public Vk8(float f, float f2) {
        02V.A04(IgReactMediaPickerNativeModule.WIDTH, f);
        this.A01 = f;
        02V.A04(IgReactMediaPickerNativeModule.HEIGHT, f2);
        this.A00 = f2;
    }
}
