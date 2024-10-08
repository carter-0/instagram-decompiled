package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectSearchResult;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.NeB  reason: case insensitive filesystem */
public final class C69072NeB extends C252733pa implements C337237fw, C66514MUs {
    public DirectSearchResult A00;
    public List A01;
    public List A02;
    public List A03;
    public List A04;
    public AnonymousClass0Ud A05;
    public boolean A06;
    public final UserSession A07;
    public final C290975gJ A08;
    public final 05G A09;
    public final 05G A0A;
    public final 05G A0B;
    public final 05G A0C;
    public final 05G A0D;
    public final AnonymousClass0Ud A0E;
    public final AnonymousClass0Ud A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final C336267eL A0J;
    public final 05G A0K;
    public final 05G A0L;
    public final AnonymousClass0Ud A0M;
    public final AnonymousClass0Ud A0N;

    public final void Dam(C337257fy r4) {
        0qQ.A0B(r4, 0);
        AnonymousClass7TF.A1O(this.A0L, false);
        LinkedHashMap A0n = C66583MXo.A0n(this.A0D);
        A0n.put("ibc_chats_context_lines", r4.Bo1());
        this.A0K.Epw(A0n);
    }

    public final void FLH(String str) {
    }

    public final AnonymousClass0Ud BqH() {
        return this.A0F;
    }

    public final AnonymousClass0Ud CWW() {
        return this.A0M;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69072NeB(UserSession userSession, C336267eL r6, boolean z, boolean z2, boolean z3) {
        super("search_interop", AnonymousClass43D.A00(301436582));
        Boolean A0u = AnonymousClass7TE.A0u();
        this.A0J = r6;
        this.A07 = userSession;
        this.A0H = z;
        this.A0G = z2;
        this.A0I = z3;
        02z A012 = 106.A01((Object) null);
        this.A09 = A012;
        this.A0E = A012;
        02z A10 = DbS.A10(A0u);
        this.A0L = A10;
        this.A05 = A10;
        02z A1J = JTO.A1J();
        this.A0C = A1J;
        this.A0F = A1J;
        02z A0q = JTQ.A0q();
        this.A0K = A0q;
        this.A0D = A0q;
        02z A102 = DbS.A10(A0u);
        this.A0A = A102;
        this.A0M = A102;
        02z A103 = DbS.A10("");
        this.A0B = A103;
        this.A0N = A103;
        this.A08 = C290965gI.A00(userSession);
        C66181MGs.A02(this, this.A01, 7);
    }

    public static final void A00(C69072NeB neB) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        List list = neB.A03;
        if (list != null) {
            A1H.put("ibc_chats", list);
        }
        List list2 = neB.A01;
        if (list2 != null) {
            A1H.put("agents", list2);
        }
        DirectSearchResult directSearchResult = neB.A00;
        if (directSearchResult != null) {
            A1H.put("meta_ai_agent", directSearchResult);
        }
        List list3 = neB.A04;
        if (list3 != null) {
            A1H.put("ai_prompts", list3);
        }
        neB.A0K.Epw(A1H);
    }
}
