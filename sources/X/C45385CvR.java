package X;

import com.google.common.collect.ImmutableList;
import java.util.Collection;

/* renamed from: X.CvR  reason: case insensitive filesystem */
public final class C45385CvR {
    public final ImmutableList A00;
    public final CsW A01;
    public final C16643Uyf A02;
    public final String A03;

    public C45385CvR(C45379CvL cvL) {
        CsW csW;
        this.A03 = cvL.A02;
        ImmutableList copyOf = ImmutableList.copyOf((Collection) cvL.A03);
        0qQ.A07(copyOf);
        this.A00 = copyOf;
        this.A02 = cvL.A01;
        CsX csX = cvL.A00;
        if (csX != null) {
            csW = csX.A00;
        } else {
            csW = null;
        }
        this.A01 = csW;
    }
}
