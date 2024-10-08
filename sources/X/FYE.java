package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectShareTarget;

public final class FYE implements C232262tL {
    public String A00;
    public final int A01;
    public final DirectShareTarget A02;

    public FYE(DirectShareTarget directShareTarget, int i) {
        0qQ.A0B(directShareTarget, 1);
        this.A02 = directShareTarget;
        this.A01 = i;
        String A08 = directShareTarget.A08();
        if (A08 == null) {
            A08 = directShareTarget.A09();
            0qQ.A07(A08);
        }
        this.A00 = A08;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        FYE fye = (FYE) obj;
        0qQ.A0B(fye, 0);
        DirectShareTarget directShareTarget = this.A02;
        DirectShareTarget directShareTarget2 = fye.A02;
        if (0qQ.A0K(directShareTarget, directShareTarget2)) {
            ImageUrl imageUrl = directShareTarget.A02;
            ImageUrl imageUrl2 = directShareTarget2.A02;
            if (imageUrl != null ? imageUrl.equals(imageUrl2) : imageUrl2 == null) {
                if (this.A01 != fye.A01) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
