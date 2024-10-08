package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class P7U implements C328347El {
    public final /* bridge */ /* synthetic */ C232262tL AWb(Context context, UserSession userSession, AnonymousClass9HC r34, C331837So r35, AnonymousClass7L2 r36, 17i r37, boolean z) {
        C3259574v r16;
        AnonymousClass9JN r12;
        AnonymousClass7LQ r5 = (AnonymousClass7LQ) r35;
        Context context2 = context;
        0qQ.A0B(context2, 0);
        UserSession userSession2 = userSession;
        AnonymousClass7L2 r30 = r36;
        17i r29 = r37;
        C51974G9v.A1P(userSession2, r29, r30, r5);
        AnonymousClass9HC r6 = r34;
        boolean A1S = C66582MXn.A1S(userSession2, r6, z);
        C254703su r9 = r5.A0e;
        String A0u = C66582MXn.A0u(r9, A1S ? 1 : 0);
        0qQ.A0A(A0u);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0t0 A01 = AnonymousClass0eN.A01(C73777Pjc.A00);
        2FW r0 = r9.A10;
        0qQ.A07(r0);
        AnonymousClass7FE A03 = AnonymousClass7FD.A03(userSession2, r6, r5, r30, r0, A01);
        String str = null;
        C3264276s r13 = new C3264276s((AnonymousClass773) null, (Map) null, (DefaultConstructorMarker) null, 3);
        ImmutableList A0H = r9.A0H();
        if (A0H == null) {
            A0H = ImmutableList.of();
            0qQ.A07(A0H);
        }
        if (A0H.size() == 2) {
            C254873tC r11 = (C254873tC) A0H.get(0);
            C254873tC r10 = (C254873tC) A0H.get(1);
            C328667Fr A012 = r13.A01(context2, userSession2, A03, r6, r5);
            C2606546n r132 = r9.A0N;
            List list = null;
            if (r132 != null) {
                r16 = C70863OPc.A01(context2, userSession2, r5, A03.A03, r132, false, false, AnonymousClass7F3.A01(r9, userSession2.A06), false);
            } else {
                r16 = null;
            }
            Long l = r11.A0n;
            String str2 = r11.A1N;
            ImmutableList A013 = r11.A01();
            if (!(A013 == null || (r12 = (AnonymousClass9JN) A013.get(0)) == null)) {
                str = r12.A04;
            }
            ImmutableList A014 = r11.A01();
            if (A014 != null) {
                A014.get(0);
            }
            String str3 = r11.A0u;
            Integer A015 = AnonymousClass775.A01(r10.A08);
            String str4 = r10.A11;
            String str5 = r10.A1N;
            String str6 = r10.A0t;
            C61078JwG jwG = r10.A0M;
            if (jwG != null) {
                list = (List) jwG.A00;
            }
            return new N6Q(AnonymousClass7FX.A03(context2, userSession2, r6, r5, r30, r29), new NYM(r16, C66580MXl.A0Y(context2, userSession2, r6, r5, r9), A03, A012, A015, l, str2, str, str3, str4, str5, str6, list), A0u);
        }
        throw AnonymousClass7TE.A0w("TwoCardXmaItemDefinitionShimViewHolder requires 2 attachments");
    }
}
