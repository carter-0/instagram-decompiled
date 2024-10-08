package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.EhG  reason: case insensitive filesystem */
public abstract class C48607EhG {
    public static final Object A00(C307896Rx r6, AnonymousClass6Tm r7) {
        2FW r3;
        C307786Rm A0L = Dbb.A0L(r7);
        Object A03 = r7.A03(1);
        0qQ.A0C(A03, "null cannot be cast to non-null type com.instagram.common.bloks.BloksParseResult");
        C276544tV r0 = ((C3034368u) A03).A02;
        0qQ.A07(r0);
        C276544tV A00 = C9812Rha.A00(A0L, r6, r0);
        String A0D = A00.A0D();
        String A002 = AnonymousClass000.A00(702);
        String str = A002;
        String A0F = A00.A0F();
        if (A0F != null) {
            str = A0F;
        }
        if (str.equals(A002)) {
            r3 = 2FW.A1D;
        } else if (str.equals("clips_share")) {
            r3 = 2FW.A0W;
        } else {
            0wb.A03("invalid_content_type", 002.A0R(str, " is not a valid content type to share"));
            return null;
        }
        UserSession A0B = C308206Td.A0B(r6);
        if (A0B instanceof UserSession) {
            C49731F3w A07 = 1as.A04.A02.A07(C308206Td.A08(r6), A0B, r3);
            if (A0D != null) {
                A07.A06(A0D);
            }
            AnonymousClass37D A02 = AnonymousClass37D.A00.A02(DbU.A0H(r6).getContext());
            if (A02 != null) {
                A02.A0J(A07.A00());
            }
        }
        return null;
    }
}
