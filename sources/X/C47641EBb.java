package X;

import com.google.gson.Gson;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.EBb  reason: case insensitive filesystem */
public final class C47641EBb extends 1P0 {
    public final /* synthetic */ AnonymousClass2Ck A00;

    public C47641EBb(AnonymousClass2Ck r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1849157858);
        Dw2 dw2 = (Dw2) obj;
        int A032 = AnonymousClass0fD.A03(2081279769);
        C47641EBb.super.onSuccessInBackground(dw2);
        if (dw2 != null) {
            ArrayList A1D = AnonymousClass7TE.A1D(dw2.A02);
            UserSession userSession = this.A00.A00.A05;
            2B1 r10 = 2B0.A01;
            0qQ.A0B(userSession, 0);
            String A0B = new Gson().A0B(A1D);
            0xY A0c = DbV.A0c(userSession, r10);
            A0c.E5g("AGGREGATED_TIME_SPENT_PER_DAY", A0B);
            A0c.apply();
            ArrayList A1D2 = AnonymousClass7TE.A1D(dw2.A00);
            ArrayList A1D3 = AnonymousClass7TE.A1D(dw2.A01);
            int size = A1D2.size();
            for (int i = 0; i < size; i++) {
                String obj2 = A1D2.get(i).toString();
                long A0R = AnonymousClass7TE.A0R(A1D3.get(i));
                0qQ.A0B(obj2, 1);
                0xY A0c2 = DbV.A0c(userSession, r10);
                A0c2.E5c(002.A0R("AGGREGATED_SCREEN_TIME_BY_SCREEN_", obj2), A0R);
                A0c2.apply();
            }
        }
        2Aq r4 = this.A00.A00;
        UserSession userSession2 = r4.A05;
        2Ci.A02(userSession2, (EWJ) null, AnonymousClass05K.A0T, (Long) null, Long.valueOf(AnonymousClass3FV.A00()), Long.valueOf(Dba.A02(r4, userSession2)), (String) null, (Map) null);
        2Aq.A0K(r4, 2Aq.A00(r4));
        AnonymousClass0fD.A0A(-649914251, A032);
        AnonymousClass0fD.A0A(-1511495111, A03);
    }

    public final void onFailInBackground(C268654dm r16) {
        String str;
        int A03 = AnonymousClass0fD.A03(1774690971);
        C268654dm r1 = r16;
        C47641EBb.super.onFailInBackground(r1);
        2Aq r4 = this.A00.A00;
        UserSession userSession = r4.A05;
        long A0P = r4.A0P();
        Object A002 = r1.A00();
        if (A002 != null) {
            str = ((1XP) A002).getErrorMessage();
        } else {
            str = null;
        }
        0qQ.A0B(userSession, 0);
        2Ci.A02(userSession, (EWJ) null, AnonymousClass05K.A0U, (Long) null, Long.valueOf(AnonymousClass3FV.A00()), Long.valueOf(A0P), (String) null, AnonymousClass7TF.A0w("exception_message", str));
        2Aq.A0K(r4, 2Aq.A00(r4));
        AnonymousClass0fD.A0A(-891288089, A03);
    }
}
