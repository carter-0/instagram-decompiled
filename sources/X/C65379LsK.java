package X;

import com.instagram.common.session.UserSession;
import com.instagram.igsignals.core.IgSignalsExampleData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LsK  reason: case insensitive filesystem */
public final class C65379LsK implements B2C {
    public List A00;
    public boolean A01;
    public IgSignalsExampleData A02;
    public boolean A03 = true;
    public final UserSession A04;
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A01(new MMJ(this, 36));

    public C65379LsK(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A04 = userSession;
    }

    public final void A01(LDV ldv) {
        A00(this);
        List list = this.A00;
        if (list != null) {
            this.A01 = true;
            LDV ldv2 = (LDV) 00k.A0L(list);
            if (ldv2 == null || ldv2.A02 != ldv.A02) {
                list.add(ldv);
                if (list.size() > 200) {
                    list.remove(0);
                    return;
                }
                return;
            }
            this.A01 = true;
        }
    }

    public static final void A00(C65379LsK lsK) {
        C65379LsK lsK2 = lsK;
        if (lsK2.A00 == null) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            String string = ((0xa) lsK2.A05.getValue()).getString("open_tab_model_sessions", (String) null);
            if (string == null) {
                string = "";
            }
            Iterator it = DbX.A0x(string).iterator();
            while (it.hasNext()) {
                String A18 = AnonymousClass7TE.A18(it);
                0qQ.A0B(A18, 0);
                List A182 = DbV.A18(A18, ";");
                if (A182.size() == 4) {
                    int parseInt = Integer.parseInt(AnonymousClass7TE.A19(A182, 0));
                    long parseLong = Long.parseLong(AnonymousClass7TE.A19(A182, 1));
                    long parseLong2 = Long.parseLong(AnonymousClass7TE.A19(A182, 2));
                    int parseInt2 = Integer.parseInt(AnonymousClass7TE.A19(A182, 3));
                    Integer[] A002 = AnonymousClass05K.A00(3);
                    int length = A002.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        Integer num = A002[i];
                        if (C63290KuZ.A00(num) != parseInt2) {
                            i++;
                        } else if (num != null) {
                            A1C.add(new LDV(num, parseInt, parseLong, parseLong2));
                        }
                    }
                }
            }
            lsK2.A00 = A1C;
            A1C.size();
        }
    }

    public final IgSignalsExampleData EIq(String str) {
        IgSignalsExampleData igSignalsExampleData = this.A02;
        this.A02 = null;
        if (igSignalsExampleData == null && this.A03) {
            String string = ((0xa) this.A05.getValue()).getString("open_tab_model_example", (String) null);
            if (string == null) {
                string = "";
            }
            if (string.length() != 0) {
                C255463uA[] r0 = IgSignalsExampleData.A06;
                igSignalsExampleData = IgSignalsExampleData.Companion.A00(string);
            }
        }
        if (this.A03) {
            0xY A0s = JTR.A0s(this.A05);
            A0s.ED3("open_tab_model_example");
            A0s.apply();
            this.A03 = false;
        }
        return igSignalsExampleData;
    }

    public final void EyY(IgSignalsExampleData igSignalsExampleData) {
        String A022 = AnonymousClass9FA.A00(MOJ.A00, C250863mB.A03).A02(igSignalsExampleData, C20507Wsn.A00);
        this.A02 = igSignalsExampleData;
        this.A03 = true;
        0xY A0s = JTR.A0s(this.A05);
        A0s.E5g("open_tab_model_example", A022);
        A0s.apply();
    }
}
