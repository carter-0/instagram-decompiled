package X;

import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;

/* renamed from: X.MnR  reason: case insensitive filesystem */
public final class C67410MnR {
    public String A00 = "";
    public final C299435v9 A01;
    public final C358448av A02;
    public final C20964X6r A03;
    public final C20911X4c A04;
    public final Map A05 = AnonymousClass7TE.A1H();
    public final C20910X4b A06;

    public final void A00(C66967Mg0 mg0, User user, Integer num, String str, String str2, String str3, String str4, String str5) {
        String str6 = str3;
        String str7 = str2;
        C66967Mg0 mg02 = mg0;
        0qQ.A0B(mg02, 3);
        String E4p = this.A06.E4p();
        Map map = this.A05;
        Object obj = map.get(E4p);
        if (obj == null) {
            obj = new C67428Mnj();
            map.put(E4p, obj);
        }
        C67428Mnj mnj = (C67428Mnj) obj;
        List list = mnj.A01;
        String str8 = mg02.A09;
        String str9 = str;
        String str10 = str8;
        String str11 = str9;
        list.add(new C67427Mni(user, str11, str7, str6, str10, mg02.A08, str4, mg02.A00));
        C20964X6r x6r = this.A03;
        mnj.A00 = x6r.E4z();
        if (str != null && str9.equals("HCM_THREADS")) {
            this.A01.Cl5((Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, mg02.A0A, E4p, mg02.A07, mg02.A02);
        }
        C358448av r6 = this.A02;
        if (str2 == null) {
            str7 = "";
        }
        if (str3 == null) {
            str6 = "";
        }
        String str12 = E4p;
        r6.CkO(OVV.A00(num, mg02.A05, str7, str9, str6, str8), this.A04.E51(), str12, x6r.E4z(), str5, mg02.A00);
    }

    public C67410MnR(C299435v9 r2, C358448av r3, C20964X6r x6r, C20910X4b x4b, C20911X4c x4c) {
        this.A02 = r3;
        this.A01 = r2;
        this.A06 = x4b;
        this.A03 = x6r;
        this.A04 = x4c;
    }
}
