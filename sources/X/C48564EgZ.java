package X;

import android.os.Bundle;
import com.instagram.bloks.hosting.IgBloksScreenConfig;

/* renamed from: X.EgZ  reason: case insensitive filesystem */
public abstract class C48564EgZ {
    public static Object A00(C307896Rx r6, AnonymousClass6Tm r7) {
        int A0M = AnonymousClass7TE.A0M(r7.A00());
        C229382nI A06 = C308206Td.A06(r6);
        0lg A0B = C308206Td.A0B(r6);
        IgBloksScreenConfig A0N = DbS.A0N(A0B);
        A0N.A07 = (C3034368u) r7.A03(0);
        A0N.A0c = A06.A00;
        Bundle A0a = AnonymousClass7TE.A0a();
        IgBloksScreenConfig.A04(A0a, A0N, false);
        DbW.A0w(A0a, A0B);
        E0P e0p = new E0P();
        e0p.A00 = A0M;
        e0p.setArguments(A0a);
        e0p.A0D(false);
        0qQ.A0B(A0B, 0);
        ((C50341FYy) A0B.A01(C50341FYy.class, G2W.A00)).igBloksIdfaDialogList.add(e0p);
        e0p.A0B(C308206Td.A05(r6), (String) null);
        return null;
    }
}
