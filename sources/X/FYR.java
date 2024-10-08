package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class FYR implements C232262tL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final DirectShareTarget A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public FYR(DirectShareTarget directShareTarget, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3) {
        StringBuilder A1A;
        0qQ.A0B(directShareTarget, 1);
        this.A05 = directShareTarget;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A04 = i4;
        this.A03 = i5;
        this.A08 = z;
        this.A07 = z2;
        this.A09 = z3;
        StringBuilder A1A2 = AnonymousClass7TE.A1A();
        A1A2.append("-DELETION-");
        A1A2.append(z2);
        A1A2.append("-SECTION-");
        A1A2.append(i);
        String obj = A1A2.toString();
        String A082 = directShareTarget.A08();
        if (A082 != null) {
            A1A = AnonymousClass7TE.A1A();
            A1A.append("THREAD-");
        } else {
            ArrayList A1D = AnonymousClass7TE.A1D(directShareTarget.A0B());
            Collections.sort(A1D);
            A1A = AnonymousClass7TE.A1A();
            A1A.append("RECIPIENTS_ID-");
            A082 = 0mp.A05(":", A1D);
        }
        A1A.append(A082);
        this.A06 = AnonymousClass7TF.A0l(obj, A1A);
    }

    public static final ArrayList A00(List list, int i, int i2, int i3, int i4, boolean z) {
        0qQ.A0B(list, 0);
        return C48843El5.A00((UserSession) null, (C251033mS) null, list, i, i2, i3, i4, false, false, z);
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A06;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        FYR fyr = (FYR) obj;
        0qQ.A0B(fyr, 0);
        DirectShareTarget directShareTarget = this.A05;
        DirectShareTarget directShareTarget2 = fyr.A05;
        if (0qQ.A0K(directShareTarget, directShareTarget2)) {
            ImageUrl imageUrl = directShareTarget.A02;
            ImageUrl imageUrl2 = directShareTarget2.A02;
            if (imageUrl != null ? imageUrl.equals(imageUrl2) : imageUrl2 == null) {
                if (this.A02 == fyr.A02 && this.A00 == fyr.A00 && this.A01 == fyr.A01 && this.A04 == fyr.A04 && this.A03 == fyr.A03 && this.A07 == fyr.A07 && this.A08 == fyr.A08 && this.A09 == fyr.A09) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }
}
