package X;

import com.instagram.common.session.UserSession;
import java.util.List;

public final class MCJ implements 02o {
    public final int A00;
    public final Object A01;

    public MCJ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ Object emit(Object obj, AnonymousClass4D7 r10) {
        Object value;
        C376369Hs r0;
        switch (this.A00) {
            case 0:
                C250663lr r9 = (C250663lr) obj;
                05G r4 = ((JVR) this.A01).A03;
                do {
                    value = r4.getValue();
                    if (r9 != null) {
                        r0 = new C376369Hs((long) r9.getCoercedIntField(0, Pxd.A00(87)));
                    } else {
                        r0 = C376369Hs.A01;
                    }
                } while (!r4.AIY(value, r0));
                break;
            case 3:
                C60161Jgg jgg = (C60161Jgg) this.A01;
                for (C60976JuY juY : (List) obj) {
                    if (!juY.A02) {
                        UserSession userSession = jgg.A02;
                        String str = juY.A01;
                        String str2 = juY.A00;
                        MP2 mp2 = MP2.A00;
                        AnonymousClass7TG.A1O(str, str2);
                        OXH.A02(new C73950PmU(mp2, str, str2, 7), userSession);
                    }
                }
                break;
            case 4:
                2YL r2 = (2YL) this.A01;
                DbX.A1W(r2, (String) obj, C318116oQ.A00(r2), 46);
                break;
            case 5:
                C66393MPz mPz = (C66393MPz) obj;
                if (mPz instanceof C61148Jxy) {
                    List list = ((C61148Jxy) mPz).A00;
                    if (AnonymousClass7TE.A1b(list)) {
                        K57.A03((K57) this.A01, list);
                        break;
                    }
                }
                break;
            case 6:
                C66392MPy mPy = (C66392MPy) obj;
                if (mPy instanceof C61147Jxx) {
                    C53081GiF giF = ((K57) this.A01).A02;
                    if (giF != null) {
                        giF.A00 = ((C61147Jxx) mPy).A00;
                        break;
                    } else {
                        0qQ.A0F("clipsDraftsAdapter");
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
                break;
            case 7:
                C239803Ii r92 = (C239803Ii) obj;
                if (r92 instanceof C239793Ih) {
                    C52034GCg.A06((C52034GCg) this.A01, (Boolean) ((C239793Ih) r92).A00, (Boolean) null);
                    break;
                } else if (r92 instanceof C297815sO) {
                    C59689JTv.A0E(((C52034GCg) this.A01).A04, "enable_gift_setting_failed");
                    break;
                } else {
                    throw AnonymousClass7TE.A1K();
                }
            default:
                ((C60161Jgg) this.A01).A01.A0A(new C61054Jvs((AnonymousClass5GP) new AnonymousClass5GQ(AnonymousClass7TE.A1I(obj))));
                break;
        }
        return C60340gF.A00;
    }
}
