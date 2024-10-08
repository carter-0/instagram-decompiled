package X;

import android.view.ViewStub;

/* renamed from: X.O7g  reason: case insensitive filesystem */
public final class C70455O7g {
    public final C71662eb A00;

    public C70455O7g(ViewStub viewStub, C69323NjO njO, C69342Njh njh, C69342Njh njh2, AnonymousClass91K r9, String str, String str2, String str3, String str4) {
        C69017Nct nct = new C69017Nct();
        if (str != null) {
            nct.A07 = str;
        }
        if (str2 != null) {
            nct.A04 = str2;
        }
        if (str3 != null) {
            nct.A05 = str3;
        }
        if (njh != null) {
            C70032NwA nwA = C70032NwA.$redex_init_class;
            int ordinal = njh.ordinal();
            int i = 1;
            if (ordinal != 0) {
                if (ordinal == 1) {
                    i = 0;
                } else if (!(ordinal == 2 || ordinal == 3 || ordinal == 4)) {
                    throw AnonymousClass7TE.A1K();
                }
            }
            nct.A01 = i;
        }
        if (str4 != null) {
            nct.A06 = str4;
        }
        if (njh2 != null) {
            C70032NwA nwA2 = C70032NwA.$redex_init_class;
            int ordinal2 = njh2.ordinal();
            int i2 = 1;
            if (ordinal2 != 0) {
                if (ordinal2 == 1) {
                    i2 = 0;
                } else if (!(ordinal2 == 2 || ordinal2 == 3 || ordinal2 == 4)) {
                    throw AnonymousClass7TE.A1K();
                }
            }
            nct.A02 = i2;
        }
        if (njO != null) {
            C70031Nw9 nw9 = C70031Nw9.$redex_init_class;
            int ordinal3 = njO.ordinal();
            int i3 = 1;
            if (ordinal3 != 0) {
                if (ordinal3 == 1) {
                    i3 = 0;
                } else {
                    throw AnonymousClass7TE.A1K();
                }
            }
            nct.A00 = i3;
        }
        this.A00 = new C71662eb(viewStub);
        OSO.A00(viewStub, r9, nct);
    }
}
