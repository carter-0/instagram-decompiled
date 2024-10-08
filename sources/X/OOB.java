package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class OOB {
    public final OZI A00;
    public final C71133OdW A01;
    public final LightweightQuickPerformanceLogger A02;
    public final AtomicInteger A03 = new AtomicInteger(0);
    public final boolean A04;

    public OOB(C70664OFl oFl, O5P o5p, AnonymousClass68I r10, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, O67 o67, boolean z) {
        0qQ.A0B(lightweightQuickPerformanceLogger, 7);
        OZI ozi = new OZI(o5p, r10);
        C70664OFl oFl2 = oFl;
        C71133OdW odW = new C71133OdW(oFl2, o5p, r10, lightweightQuickPerformanceLogger, o67);
        this.A00 = ozi;
        this.A01 = odW;
        this.A04 = z;
        this.A02 = lightweightQuickPerformanceLogger;
    }

    public final C71087ObS A07(String str) {
        0qQ.A0B(str, 0);
        C71087ObS A002 = C71087ObS.A00();
        ONS ons = new ONS(this.A02, 1021647318, this.A03.getAndIncrement());
        ons.A00();
        OZI ozi = this.A00;
        C71087ObS A003 = C71087ObS.A00();
        if (!C51971G9r.A1b(ozi.A01.A00)) {
            OZI.A01(A003);
        } else {
            NAX nax = ozi.A02;
            C71723Oph oph = new C71723Oph(ozi, A003, 1);
            AnonymousClass68L A0I = C66581MXm.A0I(nax);
            MailboxFutureImpl A0J = C66581MXm.A0J(A0I, oph);
            C66582MXn.A1E(A0I, new C71652OoX(nax, A0J, str, 1), A0J);
        }
        C71087ObS.A02(A003, A002, ons, 2);
        return A002;
    }

    public final C71087ObS A01() {
        int andIncrement;
        C71087ObS A022;
        int i;
        C71087ObS A002 = C71087ObS.A00();
        boolean z = this.A04;
        if (z) {
            andIncrement = 0;
        } else {
            andIncrement = this.A03.getAndIncrement();
        }
        ONS ons = new ONS(this.A02, 1021652813, andIncrement);
        ons.A00();
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = ons.A02;
        int i2 = ons.A01;
        lightweightQuickPerformanceLogger.markerAnnotate(1021652813, i2, "source", "IG");
        if (z) {
            ons.A02("GRAPHQL");
            A022 = this.A01.A06("IG", false, false);
            i = 4;
        } else {
            ons.A02("MSYS");
            A022 = this.A00.A02(Integer.valueOf(i2));
            i = 5;
        }
        C71087ObS.A02(A022, A002, ons, i);
        return A002;
    }

    public final C71087ObS A02() {
        Object n0i;
        if (this.A04) {
            C71133OdW odW = this.A01;
            C71087ObS A002 = C71087ObS.A00();
            if (!C51971G9r.A1b(odW.A01.A00)) {
                n0i = N0J.A00(new Exception());
            } else {
                C70664OFl oFl = odW.A00;
                if (oFl.A03) {
                    List list = oFl.A01;
                    if (list != null) {
                        n0i = new N0I(new O5Q(C71133OdW.A01(list)));
                    } else {
                        0qQ.A0F("virtualDevicesList");
                        throw AnonymousClass00P.createAndThrow();
                    }
                } else {
                    C71087ObS.A02(odW.A06("fetchVirtualDevicesMetadata", false, true), odW, A002, 0);
                    return A002;
                }
            }
            A002.A05(n0i);
            return A002;
        }
        OZI ozi = this.A00;
        C71087ObS A003 = C71087ObS.A00();
        if (!C51971G9r.A1b(ozi.A01.A00)) {
            OZI.A01(A003);
            return A003;
        }
        NAX nax = ozi.A02;
        C71723Oph oph = new C71723Oph(ozi, A003, 6);
        AnonymousClass68L A0I = C66581MXm.A0I(nax);
        MailboxFutureImpl A0J = C66581MXm.A0J(A0I, oph);
        C66582MXn.A1D(A0I, new C71723Oph(nax, A0J, 24), A0J);
        return A003;
    }

    public final C71087ObS A04(C69356Njv njv) {
        OZI ozi = this.A00;
        C71087ObS A002 = C71087ObS.A00();
        if (!C51971G9r.A1b(ozi.A01.A00)) {
            OZI.A01(A002);
            return A002;
        }
        NAX nax = ozi.A02;
        Number number = njv.A00;
        C71722Opg A003 = C71722Opg.A00(A002, 4);
        AnonymousClass68L A0I = C66581MXm.A0I(nax);
        MailboxFutureImpl A0J = C66581MXm.A0J(A0I, A003);
        C66582MXn.A1D(A0I, new C71651OoW(5, number, A0J, nax), A0J);
        return A002;
    }

    public final C71087ObS A05(C69356Njv njv, String str, String str2) {
        String str3 = str;
        String str4 = str2;
        boolean A1Z = AnonymousClass7TG.A1Z(str3, str4);
        ONS ons = new ONS(this.A02, 1021646192, this.A03.getAndIncrement());
        String name = njv.name();
        0qQ.A0B(name, 0);
        ons.A00();
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = ons.A02;
        int i = ons.A01;
        lightweightQuickPerformanceLogger.markerAnnotate(1021646192, i, "vd_type", name);
        C71087ObS A002 = C71087ObS.A00();
        ons.A02("MSYS");
        OZI ozi = this.A00;
        C71087ObS A003 = C71087ObS.A00();
        if (!C51971G9r.A1b(ozi.A01.A00)) {
            OZI.A01(A003);
        } else {
            lightweightQuickPerformanceLogger.markerPoint(1021646192, i, "eb_manager_add_device_begin");
            NAX nax = ozi.A02;
            Number number = njv.A00;
            Integer valueOf = Integer.valueOf(i);
            C71651OoW ooW = new C71651OoW(0, ozi, ons, A003);
            AnonymousClass68L A0I = C66581MXm.A0I(nax);
            MailboxFutureImpl A0J = C66581MXm.A0J(A0I, ooW);
            C66582MXn.A1E(A0I, new C71689Op8(nax, A0J, number, valueOf, str3, str4, 0), A0J);
        }
        C71087ObS.A02(A003, A002, ons, A1Z ? 1 : 0);
        return A002;
    }

    public final C71087ObS A00() {
        C71087ObS A002 = C71087ObS.A00();
        ONS ons = new ONS(this.A02, 1021655799, this.A03.getAndIncrement());
        ons.A00();
        ons.A02("MSYS");
        OZI ozi = this.A00;
        C71087ObS A003 = C71087ObS.A00();
        if (!C51971G9r.A1b(ozi.A01.A00)) {
            OZI.A01(A003);
        } else {
            NAX nax = ozi.A02;
            C71723Oph oph = new C71723Oph(ozi, A003, 2);
            AnonymousClass68L A0F = C66580MXl.A0F(nax, 2);
            MailboxFutureImpl A0J = C66581MXm.A0J(A0F, oph);
            C66582MXn.A1D(A0F, new C71723Oph(nax, A0J, 19), A0J);
        }
        C71087ObS.A02(A003, A002, ons, 3);
        return A002;
    }

    public final C71087ObS A03() {
        C71087ObS A002 = C71087ObS.A00();
        ONS ons = new ONS(this.A02, 1021642512, this.A03.getAndIncrement());
        ons.A00();
        OZI ozi = this.A00;
        C71087ObS A003 = C71087ObS.A00();
        if (!C51971G9r.A1b(ozi.A01.A00)) {
            OZI.A01(A003);
        } else {
            NAX nax = ozi.A02;
            C71723Oph oph = new C71723Oph(ozi, A003, 7);
            AnonymousClass68L A0I = C66581MXm.A0I(nax);
            MailboxFutureImpl A0J = C66581MXm.A0J(A0I, oph);
            C66582MXn.A1D(A0I, new C71723Oph(nax, A0J, 22), A0J);
        }
        C71087ObS.A02(A003, ons, A002, 7);
        return A002;
    }

    public final C71087ObS A06(Integer num) {
        int i;
        C71087ObS A002 = C71087ObS.A00();
        ONS ons = new ONS(this.A02, 1021654781, this.A03.getAndIncrement());
        ons.A00();
        OZI ozi = this.A00;
        C71087ObS A003 = C71087ObS.A00();
        NAX nax = ozi.A02;
        switch (num.intValue()) {
            case 1:
                i = 0;
                break;
            case 2:
                i = 1;
                break;
            default:
                i = 2;
                break;
        }
        Integer valueOf = Integer.valueOf(i);
        C71722Opg A004 = C71722Opg.A00(A003, 7);
        AnonymousClass68L A0I = C66581MXm.A0I(nax);
        MailboxFutureImpl A0J = C66581MXm.A0J(A0I, A004);
        C66582MXn.A1D(A0I, new C71651OoW(8, valueOf, A0J, nax), A0J);
        C71087ObS.A02(A003, ons, A002, 6);
        return A002;
    }
}
