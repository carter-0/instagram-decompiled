package X;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Sdb  reason: case insensitive filesystem */
public final class C11633Sdb implements AnonymousClass2gO {
    public final /* synthetic */ C8073QgR A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public C11633Sdb(C8073QgR qgR, String str, String str2) {
        this.A00 = qgR;
        this.A02 = str;
        this.A01 = str2;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        String str;
        String str2;
        C7714QUd qUd;
        ImmutableList immutableList;
        String str3;
        String str4;
        Boolean bool;
        ArrayList arrayList;
        ImmutableList immutableList2;
        ArrayList arrayList2;
        C250663lr reinterpretRequired;
        QVA A0E;
        QXZ A0E2;
        QVA A0E3;
        C250663lr optionalTreeField;
        SUj sUj = (SUj) obj;
        0qQ.A0B(sUj, 0);
        C8073QgR qgR = this.A00;
        qgR.A06.A0B(sUj.A00);
        String str5 = null;
        if (SUj.A0V(sUj)) {
            QDP.A01(qgR, true);
            Object obj2 = sUj.A01;
            C7789QXa qXa = (C7789QXa) obj2;
            if (qXa == null || (A0E2 = qXa.A0E()) == null || (A0E3 = A0E2.A0E()) == null || (optionalTreeField = A0E3.getOptionalTreeField(0, "page_info", QV9.class, 614100428)) == null) {
                qUd = null;
            } else {
                qUd = (C7714QUd) optionalTreeField.reinterpretRequired(0, C7714QUd.class, -481316464);
            }
            qgR.A00 = qUd;
            SUj A04 = SUj.A04(C11581Scg.A00, sUj);
            if (obj2 != null) {
                ImmutableCollection immutableCollection = (ImmutableCollection) qgR.A02.A01;
                if (immutableCollection != null) {
                    arrayList = AnonymousClass7TE.A1D(immutableCollection);
                } else {
                    arrayList = 0sn.A00;
                }
                QXZ A0E4 = qXa.A0E();
                if (A0E4 == null || (A0E = A0E4.A0E()) == null) {
                    immutableList2 = null;
                } else {
                    immutableList2 = A0E.getRequiredCompactedTreeListField(1, "edges", QV8.class, 1191615373);
                }
                ImmutableList.Builder A0Y = Pxe.A0Y();
                A0Y.addAll(arrayList);
                if (immutableList2 != null) {
                    arrayList2 = AnonymousClass7TE.A1C();
                    Iterator it = immutableList2.iterator();
                    while (it.hasNext()) {
                        C250663lr optionalTreeField2 = C41845B3m.A0V(it).getOptionalTreeField(0, "node", QV7.class, 1320777752);
                        if (!(optionalTreeField2 == null || (reinterpretRequired = optionalTreeField2.reinterpretRequired(0, C7793QXe.class, 1278893400)) == null)) {
                            arrayList2.add(reinterpretRequired);
                        }
                    }
                } else {
                    arrayList2 = 0sn.A00;
                }
                A0Y.addAll(arrayList2);
                immutableList = A0Y.build();
            } else {
                immutableList = null;
            }
            qgR.A02 = SUj.A06(sUj, immutableList);
            LinkedHashMap A022 = C8073QgR.A02(A04);
            C7714QUd qUd2 = qgR.A00;
            if (qUd2 == null || (str3 = qUd2.A09("start_cursor")) == null) {
                str3 = "0";
            }
            C7714QUd qUd3 = qgR.A00;
            if (qUd3 != null) {
                str4 = qUd3.getOptionalStringField(1, "end_cursor");
            } else {
                str4 = null;
            }
            C7714QUd qUd4 = qgR.A00;
            if (qUd4 != null) {
                bool = C41846B3n.A0d(qUd4, "has_next_page", 0);
            } else {
                bool = null;
            }
            C8073QgR.A05(qgR, bool, "client_fetch_payouthub_success", (String) null, (String) null, (String) null, "BSC_PAYOUT_HUB_PAYOUT_TRANSACTION", str3, str4, (String) null, (String) null, (String) null, A022);
            C8073QgR.A08("fetch_success");
            C8073QgR.A04(qgR);
        }
        if (SUj.A0S(sUj)) {
            QDP.A01(qgR, false);
            String str6 = this.A02;
            if (str6 == null) {
                str6 = "0";
            }
            String str7 = this.A01;
            Throwable th = sUj.A02;
            if (th != null) {
                str = th.getMessage();
                str2 = 2Og.A00(th);
                Class<?> cls = th.getClass();
                if (cls != null) {
                    str5 = cls.getSimpleName();
                }
            } else {
                str = null;
                str2 = null;
            }
            C8073QgR.A05(qgR, (Boolean) null, "client_fetch_payouthub_fail", (String) null, (String) null, (String) null, "BSC_PAYOUT_HUB_PAYOUT_TRANSACTION", str6, str7, str, str2, str5, (Map) null);
            C8073QgR.A08("fetch_fail");
        }
    }
}
