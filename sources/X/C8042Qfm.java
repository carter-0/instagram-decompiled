package X;

import android.util.SparseArray;
import com.facebook.common.locale.Country;
import com.facebook.common.locale.LocaleMember;
import com.facebookpay.form.cell.selector.CountrySelectorCellParams;
import com.facebookpay.form.model.AddressFormFieldsConfig;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;

/* renamed from: X.Qfm  reason: case insensitive filesystem */
public final class C8042Qfm extends C298475tU {
    public final AddressFormFieldsConfig A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8042Qfm(Country country, AddressFormFieldsConfig addressFormFieldsConfig, String str, int i, boolean z, boolean z2) {
        super(i, z, z2);
        0qQ.A0B(addressFormFieldsConfig, 6);
        SparseArray sparseArray = this.A04;
        sparseArray.put(9, str == null ? "" : str);
        sparseArray.put(10, country == null ? Country.A00((Country) null, addressFormFieldsConfig.A00.A00.getCountry()) : country);
        this.A05.A0B(sparseArray.clone());
        this.A00 = addressFormFieldsConfig;
        A0N();
    }

    public final void A0O(SRc sRc, Object obj, Object obj2) {
        if ((sRc instanceof C298455tS) && !0qQ.A0K(obj, obj2)) {
            A0N();
        }
    }

    public final boolean A0I() {
        Object A0A = SRc.A0A(this);
        if (A0A != null) {
            SparseArray sparseArray = (SparseArray) A0A;
            SparseArray sparseArray2 = this.A04;
            Object obj = sparseArray2.get(10);
            if (obj != null) {
                String iSO3Country = ((LocaleMember) obj).A00.getISO3Country();
                0qQ.A07(iSO3Country);
                Object obj2 = sparseArray.get(10);
                0qQ.A0C(obj2, "null cannot be cast to non-null type com.facebook.common.locale.Country");
                String iSO3Country2 = ((LocaleMember) obj2).A00.getISO3Country();
                0qQ.A07(iSO3Country2);
                if (iSO3Country.equals(iSO3Country2)) {
                    Object obj3 = sparseArray2.get(9);
                    Object obj4 = null;
                    if (!(obj3 instanceof String)) {
                        obj3 = null;
                    }
                    Object obj5 = sparseArray.get(9);
                    if (obj5 instanceof String) {
                        obj4 = obj5;
                    }
                    if (!0qQ.A0K(obj3, obj4)) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final ImmutableList A0M() {
        Object A0A = SRc.A0A(this);
        if (A0A != null) {
            SparseArray sparseArray = (SparseArray) A0A;
            Object obj = sparseArray.get(10);
            0qQ.A0C(obj, "null cannot be cast to non-null type com.facebook.common.locale.Country");
            Country country = (Country) obj;
            ImmutableList.Builder A0Y = Pxe.A0Y();
            if (0qQ.A0K(country.A00.getCountry(), "US")) {
                C8029QfJ qfJ = new C8029QfJ(9);
                qfJ.A01 = R.id.zip_code_field;
                qfJ.A03 = 2131954830;
                Object obj2 = sparseArray.get(9);
                DbS.A1Y(obj2);
                qfJ.A0B = (String) obj2;
                C8029QfJ.A00(qfJ, A0Y);
            }
            C8026QfG qfG = new C8026QfG(country, DbU.A0K(this.A00.A01));
            qfG.A01 = R.id.country_field;
            qfG.A00 = 2131954821;
            A0Y.add(new CountrySelectorCellParams(qfG));
            return DbZ.A0K(A0Y);
        }
        throw AnonymousClass7TE.A0y();
    }
}
