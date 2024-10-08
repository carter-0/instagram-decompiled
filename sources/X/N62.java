package X;

import java.util.List;

public final class N62 extends AnonymousClass0T0 implements C232262tL {
    public final C61062Jw0 A00;
    public final QP5 A01;
    public final Integer A02;
    public final List A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N62) {
                N62 n62 = (N62) obj;
                if (this.A02 != n62.A02 || !0qQ.A0K(this.A03, n62.A03) || !0qQ.A0K(this.A01, n62.A01) || !0qQ.A0K(this.A00, n62.A00) || this.A04 != n62.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        String str;
        QP5 qp5 = this.A01;
        if (qp5 == null || (str = qp5.A01) == null) {
            return "";
        }
        return str;
    }

    public final int hashCode() {
        Integer num = this.A02;
        int A0D = C51971G9r.A0D(num, C70274O0e.A00(num)) * 31;
        return DbS.A06(this.A04, (((AnonymousClass7TF.A07(this.A03, A0D) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A00)) * 31);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        N62 n62 = (N62) obj;
        0qQ.A0B(n62, 0);
        return 0qQ.A0K(this.A03, n62.A03);
    }

    public N62(C61062Jw0 jw0, QP5 qp5, Integer num, List list, boolean z) {
        this.A02 = num;
        this.A03 = list;
        this.A01 = qp5;
        this.A00 = jw0;
        this.A04 = z;
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("SuggestedPromptPillsModel(entityType=");
        Integer num = this.A02;
        if (num != null) {
            str = C70274O0e.A00(num);
        } else {
            str = "null";
        }
        A1A.append(str);
        A1A.append(", prompts=");
        A1A.append(this.A03);
        A1A.append(", responseToPersistExtras=");
        A1A.append(this.A01);
        A1A.append(", searchPluginResponse=");
        A1A.append(this.A00);
        A1A.append(", shouldRemoveRedundantBottomPadding=");
        return G9t.A1C(A1A, this.A04);
    }
}
