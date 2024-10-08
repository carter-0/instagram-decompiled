package X;

import android.os.Bundle;
import com.instagram.business.ui.BusinessInfoSectionView;
import com.instagram.model.business.Address;
import com.instagram.model.business.BusinessInfo;
import java.util.ArrayList;

/* renamed from: X.FQm  reason: case insensitive filesystem */
public final class C50129FQm implements 06c {
    public final int A00;
    public final Object A01;

    public C50129FQm(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DGi(String str, Bundle bundle) {
        EV6 ev6;
        Boolean valueOf;
        E7B e7b;
        C51950G8t g8t;
        switch (this.A00) {
            case 0:
                e7b = (E7B) this.A01;
                if (e7b.A04 != null && "native_calling_page_save".equals(str)) {
                    boolean z = bundle.getBoolean("native_calling_toggle_checked");
                    e7b.A04.A07(z);
                    FEa fEa = new FEa(e7b.A05);
                    fEa.A0P = z;
                    e7b.A05 = new BusinessInfo(fEa);
                    break;
                } else {
                    return;
                }
                break;
            case 1:
                if (str.equals("update_additional_business_addresses_result_key")) {
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList("update_additional_business_addresses_bundle_addresses_key");
                    e7b = (E7B) this.A01;
                    FEa fEa2 = new FEa(e7b.A05);
                    fEa2.A0M = parcelableArrayList;
                    e7b.A05 = new BusinessInfo(fEa2);
                    BusinessInfoSectionView businessInfoSectionView = e7b.A04;
                    if (businessInfoSectionView != null) {
                        businessInfoSectionView.A06(parcelableArrayList, E7B.A02(e7b, false));
                        break;
                    }
                } else if (str.equals("update_primary_address_result_key")) {
                    ((E7B) this.A01).FKj((Address) bundle.getParcelable("update_primary_address_result_bundle_address_key"), (String) null);
                    return;
                } else {
                    return;
                }
                break;
            case 2:
                C47492E4w e4w = (C47492E4w) this.A01;
                if (e4w.A03 != null && "native_calling_page_save".equals(str)) {
                    boolean z2 = bundle.getBoolean("native_calling_toggle_checked");
                    e4w.A03.A07(z2);
                    FEa fEa3 = new FEa(e4w.A06);
                    fEa3.A0P = z2;
                    e4w.A06 = new BusinessInfo(fEa3);
                    return;
                }
                return;
            case 3:
                0qQ.A0B(bundle, 1);
                int i = bundle.getInt(AnonymousClass000.A00(819), 0);
                if (i == -1) {
                    valueOf = false;
                    ev6 = EV6.STATUS_UNKNOWN;
                } else {
                    EV6[] values = EV6.values();
                    if (i < 0 || i >= values.length) {
                        ev6 = EV6.STATUS_UNKNOWN;
                    } else {
                        ev6 = values[i];
                    }
                    valueOf = Boolean.valueOf(bundle.getBoolean(AnonymousClass000.A00(818), false));
                }
                boolean booleanValue = valueOf.booleanValue();
                C51895G6l g6l = (C51895G6l) this.A01;
                if (booleanValue) {
                    g6l.Dp1(ev6);
                    return;
                } else {
                    g6l.onError((Throwable) null);
                    return;
                }
            case 4:
                C329067Hl.A0Y(((C49341Etw) this.A01).A00);
                return;
            case 5:
                ((C46352Dcv) this.A01).A07(true);
                return;
            case 6:
                boolean A1U = AnonymousClass7TF.A1U(0, str, bundle);
                if (str.hashCode() == -1772093948 && str.equals("conf_code_response_request_code") && bundle.getBoolean("contact_point_confirmed", false) && (g8t = ((C47503E5i) this.A01).A01) != null) {
                    g8t.Cm0(A1U ? 1 : 0);
                    return;
                }
                return;
            default:
                AnonymousClass7TG.A1N(str, bundle);
                if (str.equals("BLOCKLIST_FRAGMENT_REQUEST_KEY") && bundle.getBoolean("ARGUMENT_BLOCKLIST_CHANGED_KEY")) {
                    C46758Dkl dkl = (C46758Dkl) ((C47443E2p) this.A01).A02.getValue();
                    05G r2 = dkl.A05;
                    do {
                    } while (!r2.AIY(r2.getValue(), EP0.A00));
                    C51647Fy6.A02(dkl, C318116oQ.A00(dkl), 32);
                    return;
                }
                return;
        }
        e7b.A09 = true;
    }
}
