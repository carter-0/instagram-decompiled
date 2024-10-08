package X;

import com.instagram.guides.model.GuideItemAttachment;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.Cwo  reason: case insensitive filesystem */
public final class C45457Cwo {
    public GuideItemAttachment A00;
    public String A01;
    public String A02;
    public String A03;
    public List A04;

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C45457Cwo)) {
            return false;
        }
        C45457Cwo cwo = (C45457Cwo) obj;
        return 2Ob.A00(this.A02, cwo.A02) && 2Ob.A00(this.A03, cwo.A03) && 2Ob.A00(this.A01, cwo.A01) && 2Ob.A00(this.A00, cwo.A00) && 2Ob.A00(this.A04, cwo.A04);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A03, this.A01, this.A04, this.A00});
    }
}
