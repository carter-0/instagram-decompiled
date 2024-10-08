package X;

import android.content.Context;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.business.promote.model.SpecialRequirementCategory;
import com.instagram.common.session.UserSession;

/* renamed from: X.U8l  reason: case insensitive filesystem */
public final class C14775U8l extends 2YL {
    public final PromoteData A00;
    public final PromoteState A01;
    public final UserSession A02;
    public final 05G A03;
    public final AnonymousClass0Ud A04;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r9.A00.A2q != false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r0 == false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C13997Tnz A00(android.content.Context r7, com.instagram.business.promote.model.SpecialRequirementCategory r8, X.C14775U8l r9) {
        /*
            com.instagram.business.promote.model.SpecialRequirementCategory r2 = com.instagram.business.promote.model.SpecialRequirementCategory.A08
            r6 = 0
            if (r8 == r2) goto L_0x000c
            com.instagram.business.promote.model.PromoteData r0 = r9.A00
            boolean r0 = r0.A2q
            r3 = 0
            if (r0 == 0) goto L_0x000d
        L_0x000c:
            r3 = 1
        L_0x000d:
            com.instagram.business.promote.model.PromoteData r1 = r9.A00
            java.util.List r0 = r1.A21
            boolean r5 = r0.contains(r8)
            if (r8 == r2) goto L_0x001e
            boolean r0 = X.W2F.A03(r7, r1)
            r7 = 1
            if (r0 != 0) goto L_0x001f
        L_0x001e:
            r7 = 0
        L_0x001f:
            r4 = 2
            X.Tnz r2 = new X.Tnz
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14775U8l.A00(android.content.Context, com.instagram.business.promote.model.SpecialRequirementCategory, X.U8l):X.Tnz");
    }

    public C14775U8l(Context context, PromoteData promoteData, PromoteState promoteState, UserSession userSession) {
        C51974G9v.A1P(context, userSession, promoteData, promoteState);
        this.A02 = userSession;
        this.A00 = promoteData;
        this.A01 = promoteState;
        02z A012 = 106.A01(new C61074JwC(A00(context, SpecialRequirementCategory.A08, this), A00(context, SpecialRequirementCategory.A06, this), A00(context, SpecialRequirementCategory.A05, this), A00(context, SpecialRequirementCategory.A04, this)));
        this.A03 = A012;
        this.A04 = A012;
    }
}
