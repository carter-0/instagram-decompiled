package X;

import com.facebook.common.locale.Country;
import com.google.common.collect.ImmutableList;

/* renamed from: X.QfG  reason: case insensitive filesystem */
public final class C8026QfG extends C10782Ry3 {
    public int A00;
    public String A01;
    public boolean A02;
    public final Country A03;
    public final ImmutableList A04;

    public C8026QfG(Country country, ImmutableList immutableList) {
        super(10);
        if (DbT.A1b(immutableList)) {
            this.A03 = country;
            this.A04 = immutableList;
            return;
        }
        throw AnonymousClass7TE.A0z("Must enter at least one option");
    }
}
