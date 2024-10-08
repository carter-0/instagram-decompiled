package X;

import com.facebook.msys.cql.dataclasses.ReadOnlyMessageMetadataDataclassAdapter;
import com.facebook.msys.cql.dataclasses.XmaDataclassAdapter;
import com.facebook.msys.mci.AuthData;
import java.util.List;
import java.util.Map;

public final class PCK implements C74552Pwl {
    public final NBH A00;
    public final AuthData A01;
    public final Map A02;

    public PCK(NBH nbh, AuthData authData, Map map) {
        0qQ.A0B(authData, 3);
        this.A00 = nbh;
        this.A02 = map;
        this.A01 = authData;
    }

    public final OG9 Acq(int i) {
        return null;
    }

    public final boolean CYc(int i) {
        return false;
    }

    public final String Acp(int i) {
        return this.A00.mResultSet.getString(i, 30);
    }

    public final String Acr(int i) {
        return this.A00.mResultSet.getString(i, 31);
    }

    public final Long Acs(int i) {
        return this.A00.mResultSet.getNullableLong(i, 29);
    }

    public final String Act(int i) {
        return this.A00.mResultSet.getString(i, 37);
    }

    public final Integer Acu(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 28);
    }

    public final int Azt(int i) {
        return this.A00.mResultSet.getInteger(i, 109);
    }

    public final String BCe(int i) {
        return this.A00.mResultSet.getString(i, 40);
    }

    public final int BIa(int i) {
        return AnonymousClass7TG.A0A(this.A00.mResultSet.getNullableInteger(i, 35));
    }

    public final Long BNc(int i) {
        return this.A00.mResultSet.getNullableLong(i, 13);
    }

    public final int BS2(int i) {
        return this.A00.mResultSet.getInteger(i, 9);
    }

    public final int BS3(int i) {
        return this.A00.mResultSet.getInteger(i, 8);
    }

    public final Integer BS8(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 10);
    }

    public final Long BS9(int i) {
        return this.A00.mResultSet.getNullableLong(i, 112);
    }

    public final String BSF(int i) {
        String A0t = C66581MXm.A0t(this.A00, i);
        0qQ.A07(A0t);
        return A0t;
    }

    public final List BWn(int i) {
        NBH nbh = this.A00;
        return 0sr.A1L(new String[]{nbh.mResultSet.getString(i, 44), nbh.mResultSet.getString(i, 45), nbh.mResultSet.getString(i, 46), nbh.mResultSet.getString(i, 47), nbh.mResultSet.getString(i, 48)});
    }

    public final String BXo(int i) {
        String A0u = C66581MXm.A0u(this.A00, i);
        if (A0u == null) {
            return "0";
        }
        return A0u;
    }

    public final Long Bd2(int i) {
        return this.A00.mResultSet.getNullableLong(i, 34);
    }

    public final Long BdW(int i) {
        return this.A00.mResultSet.getNullableLong(i, 146);
    }

    public final String BdZ(int i) {
        return this.A00.mResultSet.getString(i, 147);
    }

    public final String BeV(int i) {
        return this.A00.mResultSet.getString(i, 141);
    }

    public final Integer Bf0(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 39);
    }

    public final Integer BfB(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 38);
    }

    public final C70464O7p Bjo(int i) {
        return (C70464O7p) this.A02.get(BSF(i));
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [com.facebook.msys.cql.dataclasses.ReadOnlyMessageMetadataDataclassAdapter, X.ONq] */
    public final C74554Pwu Bjx(int i) {
        NBH nbh = this.A00;
        ReadOnlyMessageMetadataDataclassAdapter readOnlyMessageMetadataDataclassAdapter = nbh.A00;
        ReadOnlyMessageMetadataDataclassAdapter readOnlyMessageMetadataDataclassAdapter2 = readOnlyMessageMetadataDataclassAdapter;
        if (readOnlyMessageMetadataDataclassAdapter == null) {
            ? oNq = new C70839ONq();
            nbh.A00 = oNq;
            readOnlyMessageMetadataDataclassAdapter2 = oNq;
        }
        return (C74554Pwu) readOnlyMessageMetadataDataclassAdapter2.getNullableAdaptedObject(i, new C73465Pd7(nbh, i, 0));
    }

    public final Long Bm9(int i) {
        return this.A00.mResultSet.getNullableLong(i, 65);
    }

    public final Integer BmA(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 105);
    }

    public final Integer BmB(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 104);
    }

    public final Integer BmC(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 64);
    }

    public final String BmE(int i) {
        return this.A00.mResultSet.getString(i, 66);
    }

    public final String BmK(int i) {
        return this.A00.mResultSet.getString(i, 73);
    }

    public final Integer BmN(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 57);
    }

    public final Integer BmO(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 108);
    }

    public final Long BmP(int i) {
        return this.A00.mResultSet.getNullableLong(i, 52);
    }

    public final String BmQ(int i) {
        return this.A00.mResultSet.getString(i, 55);
    }

    public final Long BmS(int i) {
        return this.A00.mResultSet.getNullableLong(i, 70);
    }

    public final String BmT(int i) {
        return this.A00.mResultSet.getString(i, 103);
    }

    public final Long BmV(int i) {
        return this.A00.mResultSet.getNullableLong(i, 61);
    }

    public final String BmW(int i) {
        return this.A00.mResultSet.getString(i, 59);
    }

    public final Integer Bma(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 84);
    }

    public final String Bmb(int i) {
        return this.A00.mResultSet.getString(i, 101);
    }

    public final Integer Bmc(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 97);
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [com.facebook.msys.cql.dataclasses.XmaDataclassAdapter, X.ONq] */
    public final C74555Pww Bmd(int i) {
        NBH nbh = this.A00;
        XmaDataclassAdapter xmaDataclassAdapter = nbh.A01;
        XmaDataclassAdapter xmaDataclassAdapter2 = xmaDataclassAdapter;
        if (xmaDataclassAdapter == null) {
            ? oNq = new C70839ONq();
            nbh.A01 = oNq;
            xmaDataclassAdapter2 = oNq;
        }
        return (C74555Pww) xmaDataclassAdapter2.getNullableAdaptedObject(i, new C73465Pd7(nbh, i, 1));
    }

    public final String Bme(int i) {
        return this.A00.mResultSet.getString(i, 83);
    }

    public final String Bmf(int i) {
        return this.A00.mResultSet.getString(i, 93);
    }

    public final String Bmg(int i) {
        return this.A00.mResultSet.getString(i, 92);
    }

    public final Integer Bmh(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 91);
    }

    public final String Bmi(int i) {
        return this.A00.mResultSet.getString(i, 85);
    }

    public final boolean Bmj(int i) {
        return this.A00.mResultSet.getBoolean(i, 94);
    }

    public final Integer Bmk(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 79);
    }

    public final Integer Bml(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 90);
    }

    public final Integer Bmm(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 89);
    }

    public final String Bmn(int i) {
        return this.A00.mResultSet.getString(i, 88);
    }

    public final String Bmo(int i) {
        return this.A00.mResultSet.getString(i, 82);
    }

    public final String Bmp(int i) {
        return this.A00.mResultSet.getString(i, 87);
    }

    public final String Bmq(int i) {
        return this.A00.mResultSet.getString(i, 95);
    }

    public final int BsF(int i) {
        return this.A00.mResultSet.getInteger(i, 11);
    }

    public final long BsH(int i) {
        return this.A00.mResultSet.getLong(i, 16);
    }

    public final String BsK(int i) {
        String string = this.A00.mResultSet.getString(i, 26);
        if (string == null) {
            return "";
        }
        return string;
    }

    public final String BsM(int i) {
        String string = this.A00.mResultSet.getString(i, 17);
        if (string == null) {
            return "";
        }
        return string;
    }

    public final String BsO(int i) {
        Long l;
        AuthData authData = this.A01;
        NBH nbh = this.A00;
        String string = nbh.mResultSet.getString(i, 19);
        String string2 = nbh.mResultSet.getString(i, 20);
        Long nullableLong = nbh.mResultSet.getNullableLong(i, 21);
        if (nullableLong != null) {
            l = C66582MXn.A0n(nullableLong);
        } else {
            l = null;
        }
        String A002 = C70117NxX.A00(authData, l, string, string2);
        if (A002 == null) {
            return "";
        }
        return A002;
    }

    public final String C4n(int i) {
        return this.A00.mResultSet.getString(i, 7);
    }

    public final long C6J(int i) {
        return this.A00.mResultSet.getLong(i, 0);
    }

    public final long C7b(int i) {
        return this.A00.mResultSet.getLong(i, 3);
    }

    public final boolean CFj(int i) {
        return this.A00.mResultSet.getBoolean(i, 49);
    }

    public final Integer CFk(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 50);
    }

    public final Integer CFl(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 51);
    }

    public final Integer CH2(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 123);
    }

    public final String CH3(int i) {
        return this.A00.mResultSet.getString(i, 139);
    }

    public final Integer CH5(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 115);
    }

    public final String CH6(int i) {
        return this.A00.mResultSet.getString(i, 121);
    }

    public final String CH7(int i) {
        return this.A00.mResultSet.getString(i, 122);
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [com.facebook.msys.cql.dataclasses.XmaDataclassAdapter, X.ONq] */
    public final C74555Pww CH8(int i) {
        NBH nbh = this.A00;
        XmaDataclassAdapter xmaDataclassAdapter = nbh.A02;
        XmaDataclassAdapter xmaDataclassAdapter2 = xmaDataclassAdapter;
        if (xmaDataclassAdapter == null) {
            ? oNq = new C70839ONq();
            nbh.A02 = oNq;
            xmaDataclassAdapter2 = oNq;
        }
        return (C74555Pww) xmaDataclassAdapter2.getNullableAdaptedObject(i, new C73465Pd7(nbh, i, 2));
    }

    public final String CH9(int i) {
        return this.A00.mResultSet.getString(i, 120);
    }

    public final String CHA(int i) {
        return this.A00.mResultSet.getString(i, 132);
    }

    public final String CHB(int i) {
        return this.A00.mResultSet.getString(i, 131);
    }

    public final Integer CHC(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 130);
    }

    public final String CHD(int i) {
        return this.A00.mResultSet.getString(i, 124);
    }

    public final boolean CHE(int i) {
        return this.A00.mResultSet.getBoolean(i, 133);
    }

    public final Integer CHF(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 116);
    }

    public final Integer CHG(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 129);
    }

    public final Integer CHH(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 128);
    }

    public final String CHI(int i) {
        return this.A00.mResultSet.getString(i, 127);
    }

    public final String CHJ(int i) {
        return this.A00.mResultSet.getString(i, 119);
    }

    public final String CHK(int i) {
        return this.A00.mResultSet.getString(i, 126);
    }

    public final String CHL(int i) {
        return this.A00.mResultSet.getString(i, 135);
    }

    public final String CHM(int i) {
        return this.A00.mResultSet.getString(i, 134);
    }

    public final boolean CTx(int i) {
        return this.A00.mResultSet.getBoolean(i, 12);
    }

    public final boolean Cbf(int i) {
        String string = this.A00.mResultSet.getString(i, 145);
        if (string != null) {
            return 00l.A0d(string, "2", false);
        }
        return false;
    }

    public final boolean Cf0(int i) {
        return this.A00.mResultSet.getBoolean(i, 136);
    }

    public final boolean Cf1(int i) {
        return this.A00.mResultSet.getBoolean(i, 137);
    }

    public final int getCount() {
        return C66580MXl.A04(this.A00);
    }

    public final int BSR(int i) {
        return "typing_indicator".equals(BSF(i)) ? 1 : 0;
    }
}
