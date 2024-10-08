package X;

import java.util.ArrayList;

public final class DGO implements AnonymousClass2hV {
    public static final DGO A00 = new DGO();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C250663lr r4;
        C250663lr r0;
        ArrayList arrayList;
        C250663lr A03;
        C250663lr A04;
        RG2 rg2;
        C250663lr A032;
        C250663lr r9 = (C250663lr) obj;
        if (r9 != null) {
            r4 = r9.A01(C42169BTq.class, -2101882502);
            if (!(r4 == null || (A032 = r4.A03(C42168BTp.class, "fbpay_account_extended", 632162016)) == null)) {
                r0 = A032.A03(C42167BTo.class, "fbpay_account", 412108980);
            }
            r0 = null;
        } else {
            r4 = null;
            r0 = null;
        }
        String str = "DELETED";
        if (r0 != null) {
            arrayList = AnonymousClass7TE.A1C();
            C250663lr A033 = r4.A03(C42168BTp.class, "fbpay_account_extended", 632162016);
            if (!(A033 == null || (A03 = A033.A03(C42167BTo.class, "fbpay_account", 412108980)) == null || (A04 = A03.A04(C42166BTn.class, "fbpay_auth", -1680962178)) == null)) {
                C250663lr optionalTreeField = A04.getOptionalTreeField(0, "fbpay_pin", C42165BTm.class, -255150933);
                if (!(optionalTreeField == null || (rg2 = (RG2) optionalTreeField.getOptionalEnumField(1, "fbpay_pin_status", RG2.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)) == null)) {
                    str = rg2.name();
                }
                C249803kO it = A04.getRequiredCompactedTreeListField(1, "authentication_tickets(fbids:$fbids)", C42164BTl.class, 1642143301).iterator();
                0qQ.A07(it);
                while (it.hasNext()) {
                    QSW qsw = (QSW) C41845B3m.A0V(it).reinterpretRequired(0, QSW.class, -1563793709);
                    0qQ.A07(qsw);
                    arrayList.add(C9655ReZ.A00(qsw));
                }
            }
        } else {
            arrayList = 0sn.A00;
        }
        return new C10579RuZ(str, arrayList);
    }
}
