package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;

public final class QEi extends C249403jg {
    public final int A00;
    public final Object A01;

    public QEi(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A0D;
        int i2;
        C8073QgR qgR;
        C7714QUd qUd;
        String str;
        Integer num;
        String optionalStringField;
        String optionalStringField2;
        RecyclerView recyclerView2 = recyclerView;
        int i3 = i;
        if (this.A00 != 0) {
            A0D = AnonymousClass0fD.A03(1209480050);
            super.onScrollStateChanged(recyclerView2, i3);
            if (!recyclerView2.canScrollVertically(1)) {
                QD7 qd7 = ((QCW) this.A01).A04;
                if (qd7 instanceof C8271QnD) {
                    C8271QnD qnD = (C8271QnD) qd7;
                    if (!qnD.A04 && qnD.A03 != null) {
                        AnonymousClass2gB r6 = qnD.A07;
                        if (!SUj.A0R(r6)) {
                            C10447RsO rsO = qnD.A09;
                            C11651Sdt.A02(C8282QnO.A00(new C11544Sc5(rsO, qnD.A03, false), rsO.A00), r6, qnD, 14);
                        }
                    }
                }
            }
            i2 = 1038483350;
        } else {
            A0D = AnonymousClass7TG.A0D(recyclerView2, -916762870);
            super.onScrollStateChanged(recyclerView2, i3);
            if (!recyclerView2.canScrollVertically(1)) {
                QDP A03 = ((QCQ) this.A01).A03();
                if ((A03 instanceof C8073QgR) && (qUd = qgR.A00) != null && qUd.getCoercedBooleanField(0, "has_next_page") && (qgR = (C8073QgR) A03).A06.A02() != C8882RDz.LOADING) {
                    C7714QUd qUd2 = qgR.A00;
                    if (qUd2 != null) {
                        str = qUd2.getOptionalStringField(1, "end_cursor");
                    } else {
                        str = null;
                    }
                    C7714QUd qUd3 = qgR.A00;
                    if (qUd3 == null || (optionalStringField2 = qUd3.getOptionalStringField(1, "end_cursor")) == null) {
                        num = null;
                    } else {
                        num = Pxf.A0Z(optionalStringField2);
                    }
                    if (num != null) {
                        String valueOf = String.valueOf(num.intValue() + 25);
                        String str2 = str;
                        if (str == null) {
                            str2 = "0";
                        }
                        C8073QgR.A05(qgR, (Boolean) null, "client_fetch_payouthub_init", (String) null, (String) null, (String) null, "BSC_PAYOUT_HUB_PAYOUT_TRANSACTION", str2, valueOf, (String) null, (String) null, (String) null, (Map) null);
                        qgR.A00 = null;
                        String str3 = qgR.A03;
                        String str4 = str;
                        if (str == null) {
                            str4 = "0";
                        }
                        C8073QgR.A07(qgR, (String) null, (String) null, "load_more", str3, str4, valueOf, 667758015, 0);
                        C8073QgR.A08("fetch_init");
                        AnonymousClass2gB r8 = qgR.A04;
                        Object value = qgR.A05.getValue();
                        C250663lr A09 = C8115Qh7.A09(qgR);
                        if (A09 == null || (optionalStringField = A09.getOptionalStringField(0, "financial_id")) == null) {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                        String str5 = qgR.A03;
                        String str6 = qgR.A0E().A00;
                        0qQ.A0B(str5, 2);
                        SQB.A02(C8282QnO.A00(new C11550ScB(value, str6, str, str5, optionalStringField, 2), AnonymousClass2E0.A06()), r8, new C11633Sdb(qgR, str, valueOf));
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                }
            }
            i2 = 798458621;
        }
        AnonymousClass0fD.A0A(i2, A0D);
    }
}
