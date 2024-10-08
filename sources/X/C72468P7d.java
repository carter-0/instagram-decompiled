package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.regex.Matcher;

/* renamed from: X.P7d  reason: case insensitive filesystem */
public final class C72468P7d implements C328347El {
    public final AnonymousClass9HO A00;

    public final /* bridge */ /* synthetic */ C232262tL AWb(Context context, UserSession userSession, AnonymousClass9HC r24, C331837So r25, AnonymousClass7L2 r26, 17i r27, boolean z) {
        CharSequence charSequence;
        String str;
        NYY nyy;
        Context context2 = context;
        AnonymousClass7LQ A0Y = C66581MXm.A0Y(r25, context2);
        UserSession userSession2 = userSession;
        AnonymousClass7L2 r5 = r26;
        17i r9 = r27;
        C51974G9v.A1P(userSession2, r9, r5, A0Y);
        AnonymousClass9HC r4 = r24;
        0qQ.A0B(r4, 5);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        AnonymousClass9HO r13 = this.A00;
        boolean A002 = AnonymousClass760.A00(userSession2, z);
        C254703su r3 = A0Y.A0e;
        String A0u = C66582MXn.A0u(r3, A002 ? 1 : 0);
        0qQ.A0A(A0u);
        Object obj = r3.A1T;
        if (obj instanceof C254873tC) {
            0qQ.A0C(obj, C273654mx.A00(3081));
            C254873tC r8 = (C254873tC) obj;
            String str2 = r8.A0t;
            String str3 = r8.A1N;
            if (str2 == null) {
                str2 = "";
            }
            2FW r1 = 2FW.A1M;
            nyy = new NYY(AnonymousClass7FG.A00(context2, userSession2, r4, A0Y, r1), C66582MXn.A0V(userSession2, r4, A0Y, r5, r1), (Boolean) null, str2, str3, (String) null, AnonymousClass7TF.A1W(r3.A10, 2FW.A0n));
        } else if (!(obj instanceof C2609947v) || !182.A06(0Tu.A05, userSession2, 36329981600612754L)) {
            0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.model.Placeholder");
            C2814857z r82 = (C2814857z) obj;
            String str4 = r82.A03;
            if (r82.A04) {
                C329987Kz A04 = AnonymousClass7FB.A04(r5, r3.A1j(AnonymousClass7TF.A0Q(userSession2)));
                charSequence = C3270279b.A00(DbT.A05(context2), r3.A0G(), userSession2, r13, A04, (AnonymousClass5H7) null, r82.A01, true, false);
                Matcher A09 = 0mp.A09(String.valueOf(charSequence));
                if (A09.find()) {
                    String group = A09.group(1);
                    if (group != null) {
                        str = C66580MXl.A0z(group, 1);
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
                str = null;
            } else {
                charSequence = r82.A00(context2.getResources());
                str = null;
            }
            if (charSequence == null) {
                charSequence = "";
            }
            2FW r2 = 2FW.A1M;
            nyy = new NYY(AnonymousClass7FG.A00(context2, userSession2, r4, A0Y, r2), C66582MXn.A0V(userSession2, r4, A0Y, r5, r2), (Boolean) null, charSequence, str4, str, AnonymousClass7TF.A1W(r3.A10, 2FW.A0n));
        } else {
            String A16 = AnonymousClass7TE.A16(context2, 2131976712);
            2FW r12 = 2FW.A1M;
            nyy = new NYY(AnonymousClass7FG.A00(context2, userSession2, r4, A0Y, r12), C66582MXn.A0V(userSession2, r4, A0Y, r5, r12), (Boolean) null, A16, (String) null, (String) null, AnonymousClass7TF.A1W(r3.A10, 2FW.A0n));
        }
        return new Na6(AnonymousClass7FX.A03(context2, userSession2, r4, A0Y, r5, r9), nyy, A0u);
    }

    public C72468P7d(AnonymousClass9HO r1) {
        this.A00 = r1;
    }
}
