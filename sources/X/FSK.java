package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.Iterator;

public final class FSK implements AnonymousClass2Kv {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ 0sP A06;
    public final /* synthetic */ 0rm A07;
    public final /* synthetic */ boolean A08;

    public FSK(Context context, UserSession userSession, Integer num, String str, String str2, 0sP r6, 0rm r7, int i, boolean z) {
        this.A07 = r7;
        this.A08 = z;
        this.A02 = userSession;
        this.A06 = r6;
        this.A01 = context;
        this.A00 = i;
        this.A03 = num;
        this.A05 = str;
        this.A04 = str2;
    }

    public final void invoke(AnonymousClass3JD r29) {
        ImmutableList immutableList;
        C250663lr A0V;
        String A072;
        ImmutableList requiredCompactedTreeListField;
        String A073;
        String str;
        2EG r21;
        C250663lr A0U;
        C250663lr A032;
        if (r29 == null || (A0U = C41845B3m.A0U(r29)) == null || (A032 = A0U.A03(C42697Bgu.class, AnonymousClass000.A00(1965), 135524158)) == null) {
            immutableList = null;
        } else {
            immutableList = A032.A06(C42696Bgt.class, "nodes", 2112009342);
        }
        boolean z = this.A08;
        UserSession userSession = this.A02;
        0rm r9 = this.A07;
        String A002 = C66579MXk.A00(15);
        Context context = this.A01;
        int i = this.A00;
        Integer num = this.A03;
        String str2 = this.A05;
        String str3 = this.A04;
        if (immutableList != null) {
            Iterator it = immutableList.iterator();
            loop0:
            while (true) {
                if (!it.hasNext() || (A0V = C41845B3m.A0V(it)) == null) {
                    break;
                }
                boolean coercedBooleanField = A0V.getCoercedBooleanField(1, "consented");
                if (Boolean.valueOf(coercedBooleanField) != null && coercedBooleanField && z) {
                    1Au.A00(userSession).A13("ai_agent_character_disclaimer_server_flag", true);
                    C331227Qb.A01(userSession, true);
                    break;
                }
                Class<C42695Bgs> cls = C42695Bgs.class;
                String A003 = AnonymousClass000.A00(3354);
                C250663lr A042 = A0V.A04(cls, A003, -2024709336);
                if (A042 == null || (A072 = A042.A07("text")) == null) {
                    break;
                }
                r9.A00 = DbS.A0C(A072);
                C250663lr A043 = A0V.A04(cls, A003, -2024709336);
                if (!(A043 == null || (requiredCompactedTreeListField = A043.getRequiredCompactedTreeListField(1, "ranges", C42694Bgr.class, -1393094026)) == null)) {
                    Iterator it2 = requiredCompactedTreeListField.iterator();
                    while (it2.hasNext()) {
                        C250663lr A0V2 = C41845B3m.A0V(it2);
                        int coercedIntField = A0V2.getCoercedIntField(0, "offset");
                        String substring = A072.substring(coercedIntField, A0V2.getCoercedIntField(1, "length") + coercedIntField);
                        0qQ.A07(substring);
                        C250663lr A044 = A0V2.A04(C42693Bgq.class, "entity", -1723488533);
                        if (A044 == null || (A073 = A044.A07("url")) == null) {
                            break loop0;
                        }
                        if (A073.equals(A002)) {
                            str = "ai_terms";
                        } else {
                            str = "ai_at_meta";
                        }
                        if (A073.equals(A002)) {
                            r21 = 2EG.A0L;
                        } else {
                            r21 = 2EG.A0I;
                        }
                        Object obj = r9.A00;
                        0qQ.A0C(obj, C66579MXk.A00(991));
                        Context context2 = context;
                        UserSession userSession2 = userSession;
                        AnonymousClass7AV.A04((SpannableStringBuilder) obj, new C48038ESd(context2, userSession2, r21, num, str, str2, str3, A073, AnonymousClass7TF.A03(context, i)), substring);
                    }
                    continue;
                }
            }
        }
        if (r9.A00 != null && z) {
            C48801EkP.A00(userSession);
        }
        this.A06.invoke(r9.A00);
    }
}
