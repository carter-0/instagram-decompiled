package X;

import com.instagram.autoplay.models.AutoplayOnScreenItemWithMetadata;
import java.util.List;

/* renamed from: X.Ttw  reason: case insensitive filesystem */
public final class C14321Ttw implements X8M {
    public final List A00;

    public final boolean BJE(1Xj r2) {
        X8M x8m = (X8M) 00k.A0J(this.A00);
        if (x8m != null) {
            return x8m.BJE(r2);
        }
        return false;
    }

    public final void Ewj(1Xj r3, int i) {
        for (X8M Ewj : this.A00) {
            Ewj.Ewj(r3, i);
        }
    }

    public final void EyG(1Xj r3) {
        for (X8M EyG : this.A00) {
            EyG.EyG(r3);
        }
    }

    public final void FKw(AutoplayOnScreenItemWithMetadata autoplayOnScreenItemWithMetadata) {
        for (X8M FKw : this.A00) {
            FKw.FKw(autoplayOnScreenItemWithMetadata);
        }
    }

    public C14321Ttw(List list) {
        this.A00 = list;
    }
}
