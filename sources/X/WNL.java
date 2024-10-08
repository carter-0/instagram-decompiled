package X;

import android.os.Bundle;
import com.facebook.react.bridge.ReadableMap;
import java.util.Iterator;

public final class WNL implements C267664bz {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public WNL(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void A8T(0xI r6) {
        String str;
        String str2;
        C66967Mg0 mg0;
        String str3;
        switch (this.A00) {
            case 0:
                Bundle bundle = (Bundle) ((Bundle) this.A01).getParcelable(Pxd.A00(724));
                SAW.A01(bundle, (ReadableMap) this.A02);
                Iterator<String> it = bundle.keySet().iterator();
                while (it.hasNext()) {
                    C13988Tno.A0y(bundle, r6, AnonymousClass7TE.A18(it));
                }
                return;
            case 1:
                0qQ.A0B(r6, 0);
                C15363UbF ubF = (C15363UbF) this.A02;
                C14200Trf trf = ubF.A03;
                if (trf != null) {
                    String A03 = trf.A03(ubF.A07);
                    String E4p = ubF.A0K.E4p();
                    String str4 = ubF.A09;
                    if (str4 != null) {
                        C13989Tnp.A1O(r6, A03, E4p, str4);
                        str = "BLENDED";
                        str2 = "USER";
                        mg0 = (C66967Mg0) this.A01;
                        break;
                    } else {
                        str3 = "searchSessionId";
                    }
                } else {
                    str3 = "dataSource";
                }
                0qQ.A0F(str3);
                throw AnonymousClass00P.createAndThrow();
            default:
                0qQ.A0B(r6, 0);
                mg0 = (C66967Mg0) this.A01;
                String str5 = mg0.A06;
                C14140Tqa tqa = (C14140Tqa) this.A02;
                C13989Tnp.A1O(r6, str5, tqa.A05.E4p(), tqa.A07);
                str = C67419Mna.A00(tqa.A06.E51());
                str2 = "USER";
                break;
        }
        int i = mg0.A00;
        r6.A0C("search_tab", str);
        r6.A0C("selected_type", str2);
        r6.A08(Integer.valueOf(i), "position");
    }
}
