package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.P7c  reason: case insensitive filesystem */
public final class C72467P7c implements C328347El {
    public final AnonymousClass9HO A00;

    public final /* bridge */ /* synthetic */ C232262tL AWb(Context context, UserSession userSession, AnonymousClass9HC r56, C331837So r57, AnonymousClass7L2 r58, 17i r59, boolean z) {
        NYO nyo;
        AnonymousClass7LQ r5 = (AnonymousClass7LQ) r57;
        Context context2 = context;
        UserSession userSession2 = userSession;
        boolean A1U = AnonymousClass7TF.A1U(0, context2, userSession2);
        AnonymousClass7L2 r49 = r58;
        17i r48 = r59;
        C51974G9v.A1M(r48, r49, r5);
        AnonymousClass9HC r50 = r56;
        AnonymousClass9HC r0 = r50;
        0qQ.A0B(r0, 5);
        C328697Fu A01 = OPa.A01(context2, userSession2, r0, r5, r49);
        AnonymousClass9HO r9 = this.A00;
        C254703su r8 = r5.A0e;
        0qQ.A07(r8);
        Object obj = r8.A1T;
        Class<?> cls = null;
        if (!AnonymousClass9JI.A00(2, obj)) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("message.content required to be DirectMediaShare but is");
            if (obj != null) {
                cls = obj.getClass();
            }
            throw C66582MXn.A0j(cls, A1A);
        }
        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.model.DirectMediaShare");
        String str = ((AnonymousClass9JI) obj).A04;
        if (str == null) {
            nyo = new NYO(A01, (AnonymousClass79c) null);
        } else {
            AnonymousClass79S r15 = AnonymousClass79S.A00;
            boolean CU2 = A01.CU2();
            AnonymousClass7FE r7 = A01.A05;
            AnonymousClass7L2 r47 = r7.A03;
            AnonymousClass9HC r02 = r7.A02;
            AnonymousClass9HC r46 = r02;
            CharSequence A07 = r15.A07(context2, userSession2, r9, r02, r5, r47, str, (List) null, CU2, false);
            boolean A012 = AnonymousClass48R.A01(r8.A1F);
            boolean A1Z = r8.A1Z();
            2FW r13 = 2FW.A1g;
            boolean A1O = JTQ.A1O(r8.A2P ? 1 : 0, r5.A0G.A0x ? 1 : 0);
            boolean z2 = r5.A0Y;
            AnonymousClass0eM r152 = r7.A05;
            boolean z3 = r7.A07;
            boolean z4 = r7.A00;
            boolean z5 = r7.A01;
            0qQ.A0B(r13, 0);
            0qQ.A0B(r46, A1U ? 1 : 0);
            0qQ.A0B(r152, 2);
            AnonymousClass7L2 r1 = r47;
            0qQ.A0B(r1, 9);
            AnonymousClass7FE r27 = new AnonymousClass7FE(r46, r1, r13, r152, false, z3, z4, z5, A1O, z2);
            AnonymousClass7FT r92 = A01.A04;
            MessageIdentifier messageIdentifier = r92.A06;
            long j = r92.A00;
            boolean z6 = r92.A0B;
            boolean z7 = r92.A08;
            boolean z8 = r92.A0A;
            AnonymousClass7FR r12 = r92.A02;
            List list = r92.A07;
            boolean z9 = r92.A09;
            boolean z10 = r92.A0C;
            MessageIdentifier messageIdentifier2 = r92.A05;
            C61063Jw1 jw1 = r92.A01;
            C327627Bo r03 = r92.A03;
            0qQ.A0B(messageIdentifier, 0);
            DbW.A1P(r12, 5, r03);
            AnonymousClass7FT r272 = new AnonymousClass7FT(jw1, r12, r03, r13, messageIdentifier, messageIdentifier2, list, j, z6, z7, z8, z9, z10);
            AnonymousClass5FV r17 = AnonymousClass5FV.None;
            User user = r5.A0K;
            if (user != null) {
                cls = user.getId();
            }
            boolean z11 = r8.A2O;
            0qQ.A0B(A07, 2);
            A07.toString();
            2FW r04 = r7.A04;
            boolean z12 = r7.A06;
            boolean z13 = r7.A08;
            boolean z14 = r7.A09;
            0qQ.A0B(r04, 0);
            AnonymousClass7FE r31 = new AnonymousClass7FE(r46, r47, r04, r152, z12, z3, z4, A1U, z13, z14);
            String str2 = A01.A0D;
            float f = A01.A00;
            C376649Iu r24 = A01.A02;
            C69607Nop nop = A01.A07;
            Hashtag hashtag = A01.A0A;
            C69606Noo noo = A01.A06;
            Integer num = A01.A0B;
            C69609Nor nor = A01.A09;
            C328697Fu r273 = new C328697Fu(r24, A01.A03, r92, r31, noo, nop, A01.A08, nor, hashtag, num, A01.A0C, str2, A01.A0E, f, A01.A01);
            2FW r82 = r27.A04;
            AnonymousClass9HC r72 = r27.A02;
            AnonymousClass0eM r05 = r27.A05;
            boolean z15 = r27.A07;
            boolean z16 = r27.A08;
            boolean z17 = r27.A09;
            AnonymousClass7L2 r6 = r27.A03;
            0qQ.A0B(r82, 0);
            0qQ.A0B(r72, A1U);
            0qQ.A0B(r05, 2);
            0qQ.A0B(r6, 9);
            nyo = new NYO(r273, new AnonymousClass79c(r17, (C67065Mhg) null, r272, new AnonymousClass7FE(r72, r6, r82, r05, false, z15, A1U, z5, z16, z17), A07, cls, (String) null, (List) null, A012, A1Z, false, z11, false, false, false, false));
        }
        return new N6J(AnonymousClass7FX.A03(context2, userSession2, r50, r5, r49, r48), nyo, ((MessageIdentifier) A01.A0F.getValue()).A01);
    }

    public C72467P7c(AnonymousClass9HO r1) {
        this.A00 = r1;
    }
}
