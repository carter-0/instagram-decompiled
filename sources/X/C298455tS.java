package X;

import com.facebook.common.locale.Country;
import com.facebook.common.locale.LocaleMember;
import com.facebookpay.form.cell.logging.FormCellLoggingEvents;
import com.google.common.collect.ImmutableList;

/* renamed from: X.5tS  reason: invalid class name and case insensitive filesystem */
public final class C298455tS extends SRc {
    public boolean A00;
    public final int A01;
    public final ImmutableList A02;
    public final String A03;
    public final boolean A04;
    public final Country A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C298455tS(Country country, FormCellLoggingEvents formCellLoggingEvents, ImmutableList immutableList, String str, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        super(formCellLoggingEvents, i, i2, z, z2);
        0qQ.A0B(immutableList, 9);
        this.A03 = str;
        this.A01 = i3;
        this.A05 = country;
        this.A02 = immutableList;
        if (country != null) {
            this.A05.A0B(country);
        }
        this.A04 = z3;
        this.A04.put(i2, country);
    }

    public final boolean A0I() {
        String str;
        LocaleMember localeMember;
        LocaleMember localeMember2;
        Object obj = this.A04.get(this.A02);
        String str2 = null;
        if (!(obj instanceof Country) || (localeMember2 = (LocaleMember) obj) == null) {
            str = null;
        } else {
            str = localeMember2.A00.getISO3Country();
        }
        Object A022 = this.A05.A02();
        if ((A022 instanceof Country) && (localeMember = (LocaleMember) A022) != null) {
            str2 = localeMember.A00.getISO3Country();
        }
        return !0qQ.A0K(str, str2);
    }

    public final void A0L(boolean z) {
        FormCellLoggingEvents formCellLoggingEvents;
        if (z != this.A00) {
            this.A00 = z;
            C11231SGq sGq = this.A00;
            if (sGq != null && (formCellLoggingEvents = this.A01) != null) {
                sGq.A00(formCellLoggingEvents.A00, true, z);
            }
        }
    }
}
