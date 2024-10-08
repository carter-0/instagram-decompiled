package X;

import android.util.SizeF;
import java.util.Set;

/* renamed from: X.VkO  reason: case insensitive filesystem */
public final class C18040VkO {
    public final float A00;
    public final C18050VkY A01;
    public final Set A02;

    public C18040VkO(Set set, float f, float f2) {
        0qQ.A0B(set, 4);
        float f3 = 2.0f * f;
        C18050VkY vkY = new C18050VkY(new SizeF(f3, f3), f);
        this.A02 = set;
        this.A00 = f2;
        this.A01 = vkY;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C18040VkO) {
                C18040VkO vkO = (C18040VkO) obj;
                if (!0qQ.A0K(this.A02, vkO.A02) || Float.compare(this.A00, vkO.A00) != 0 || !0qQ.A0K(this.A01, vkO.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A00(AnonymousClass7TF.A07(this.A02, 620), this.A00));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ParticleRing(particleCount=");
        sb.append(20);
        sb.append(", starIndices=");
        sb.append(this.A02);
        sb.append(", particleScaleFactor=");
        sb.append(this.A00);
        sb.append(", roundedRect=");
        return AnonymousClass7TG.A0n(this.A01, sb);
    }
}
