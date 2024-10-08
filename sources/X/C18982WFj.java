package X;

import com.facebook.locationsharing.core.models.Location;
import com.google.common.collect.ImmutableList;

/* renamed from: X.WFj  reason: case insensitive filesystem */
public final class C18982WFj implements C13550TcM, C13920TlM {
    public final int A00;
    public final Object A01;

    public C18982WFj(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onError(Throwable th) {
        UHS uhs;
        Object[] objArr;
        String str;
        switch (this.A00) {
            case 0:
                uhs = ((C19935Wi8) this.A01).A00;
                objArr = new Object[0];
                str = "address error";
                break;
            case 3:
                uhs = (UHS) this.A01;
                UHS.A04(uhs, th, "ERROR");
                objArr = new Object[0];
                str = "screen error";
                break;
            default:
                throw AnonymousClass00P.createAndThrow();
        }
        UHS.A05(uhs, str, objArr);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        switch (this.A00) {
            case 0:
                UHS.A04(((C19935Wi8) this.A01).A00, obj, "PIN_ADDRESS_UPDATED");
                return;
            case 1:
                ImmutableList immutableList = (ImmutableList) obj;
                UHR uhr = (UHR) this.A01;
                if (uhr.A00) {
                    UHS.A04(uhr, immutableList, "SHARERS_UPDATED");
                    UHR.A00(uhr);
                    C249803kO it = immutableList.iterator();
                    while (it.hasNext()) {
                        it.next();
                        System.currentTimeMillis();
                    }
                    return;
                }
                return;
            case 2:
                Location location = (Location) obj;
                UHR uhr2 = (UHR) this.A01;
                UHS.A04(uhr2, location, C66579MXk.A00(210));
                C10547Ru1 ru1 = new C10547Ru1(uhr2.A01, location, uhr2.A04);
                ru1.A00.AYj(new C12040Sl1(2, new Object(), ru1));
                return;
            default:
                UHR uhr3 = (UHR) this.A01;
                C17908Vhz vhz = uhr3.A02;
                VN2 vn2 = vhz.A04;
                vn2.A00.submit(new C13068TJy(vhz.A02, vhz.A03, vn2, AnonymousClass05K.A00));
                vhz.A00 = true;
                UHS.A04(uhr3, obj, "LIVE_LOCATION_STARTED");
                UHR.A02(uhr3);
                UHR.A01(uhr3);
                return;
        }
    }
}
