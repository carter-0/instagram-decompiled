package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;

public final class FYM implements C232262tL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final UserSession A04;
    public final DirectShareTarget A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    public FYM(UserSession userSession, DirectShareTarget directShareTarget, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        StringBuilder A1A;
        0qQ.A0B(directShareTarget, 2);
        this.A04 = userSession;
        this.A05 = directShareTarget;
        this.A03 = i;
        this.A00 = i2;
        this.A02 = i3;
        this.A0B = z;
        this.A0D = z2;
        this.A0E = z3;
        this.A01 = i4;
        this.A0F = z4;
        this.A0C = z5;
        this.A08 = z6;
        this.A07 = z7;
        this.A0A = z8;
        this.A09 = z9;
        String A022 = 002.A02(i3, i, "-RELATIVE-", "-SECTION-");
        C254743sy A062 = AnonymousClass6W3.A06(DbS.A0c(directShareTarget));
        if (A062 != null) {
            A1A = AnonymousClass7TE.A1A();
            A1A.append("THREAD-");
            A1A.append(A062);
        } else {
            ArrayList A1D = AnonymousClass7TE.A1D(directShareTarget.A0B());
            01V.A1C(A1D);
            A1A = AnonymousClass7TE.A1A();
            A1A.append("RECIPIENTS_ID-");
            A1A.append(DbT.A0z(":", A1D, (0sP) null));
        }
        this.A06 = AnonymousClass7TF.A0l(A022, A1A);
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A06;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        FYM fym = (FYM) obj;
        0qQ.A0B(fym, 0);
        if (0qQ.A0K(this.A04, fym.A04) && 0qQ.A0K(this.A05, fym.A05) && this.A03 == fym.A03 && this.A00 == fym.A00 && this.A02 == fym.A02 && this.A0B == fym.A0B && this.A0D == fym.A0D && this.A0E == fym.A0E && this.A01 == fym.A01 && this.A0F == fym.A0F && this.A0C == fym.A0C && this.A08 == fym.A08 && this.A07 == fym.A07 && this.A09 == fym.A09 && this.A0A == fym.A0A) {
            return true;
        }
        return false;
    }
}
