package X;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import androidx.fragment.app.Fragment;
import com.facebookpay.common.recyclerview.adapteritems.PuxContactItem;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.PickupInfo;
import java.util.ArrayList;
import java.util.List;

public final class QDQ extends 2YL implements C13844TiK {
    public SparseArray A00 = Pxe.A0L();
    public ECPPaymentRequest A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final AnonymousClass2gB A05 = Pxh.A0M();
    public final AnonymousClass2Fj A06 = SUj.A00((Object) null);
    public final AnonymousClass2gO A07 = C11647Sdp.A00(this, 27);
    public final AnonymousClass2Fj A08 = new 2Fk(REO.EDIT);

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        if (r5 != null) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.0eP A00(com.facebookpay.expresscheckout.models.PickupInfo r5) {
        /*
            r3 = 0
            r0 = 0
            if (r5 == 0) goto L_0x0041
            java.lang.String r2 = r5.A01
            if (r2 == 0) goto L_0x0041
            java.lang.String r1 = "\\s+"
            java.util.List r5 = X.DbW.A0o(r2, r1)
        L_0x000e:
            r4 = 1
            if (r5 == 0) goto L_0x003d
            boolean r1 = X.AnonymousClass7TE.A1b(r5)
            if (r1 == 0) goto L_0x003d
            java.lang.Object r3 = r5.get(r3)
        L_0x001b:
            boolean r1 = X.AnonymousClass7TE.A1b(r5)
            if (r1 == 0) goto L_0x0038
            int r2 = r5.size()
            r1 = 2
            if (r2 < r1) goto L_0x0038
            int r1 = r5.size()
            java.util.List r2 = r5.subList(r4, r1)
            if (r2 == 0) goto L_0x0038
            java.lang.String r1 = " "
            java.lang.String r0 = X.DbT.A0z(r1, r2, r0)
        L_0x0038:
            X.0eP r0 = X.AnonymousClass7TE.A1L(r3, r0)
            return r0
        L_0x003d:
            r3 = r0
            if (r5 == 0) goto L_0x0038
            goto L_0x001b
        L_0x0041:
            r5 = r0
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QDQ.A00(com.facebookpay.expresscheckout.models.PickupInfo):X.0eP");
    }

    public final SUj A01() {
        C10575RuU ruU;
        String str;
        String str2;
        String str3 = null;
        RH6 rh6 = RH6.A0c;
        SUj A082 = SUj.A08(new PuxContactItem(rh6, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, false));
        SUj A0W = Pxe.A0W(this.A06);
        if (A0W == null || (ruU = (C10575RuU) A0W.A01) == null) {
            return A082;
        }
        if (this.A03) {
            str = ((PickupInfo) ruU.A01).A01;
        } else {
            str = null;
        }
        if (this.A02) {
            str2 = ((PickupInfo) ruU.A01).A00;
        } else {
            str2 = null;
        }
        if (this.A04) {
            str3 = ((PickupInfo) ruU.A01).A03;
        }
        List A1P = 0sr.A1P(new String[]{str, str2, str3});
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : A1P) {
            String str4 = (String) next;
            if (str4 != null && !00l.A0W(str4)) {
                A1C.add(next);
            }
        }
        PuxContactItem puxContactItem = new PuxContactItem(rh6, (Integer) null, (String) null, (String) 00k.A0O(A1C, 0), (String) 00k.A0O(A1C, 1), (String) 00k.A0O(A1C, 2), (String) null, false);
        if (A03()) {
            return SUj.A0A(puxContactItem, new C13216TQh(RH2.A1F, 2131961248));
        }
        return SUj.A09(puxContactItem);
    }

    public final void A02(PickupInfo pickupInfo) {
        if (this.A03) {
            0eP A002 = A00(pickupInfo);
            SparseArray sparseArray = this.A00;
            sparseArray.put(41, A002.A00);
            sparseArray.put(42, A002.A01);
        }
        if (this.A04) {
            this.A00.put(0, pickupInfo.A03);
        }
        if (this.A02) {
            this.A00.put(1, pickupInfo.A00);
        }
        SUj.A0J(this.A06, AnonymousClass05K.A00, pickupInfo, (String) null);
    }

    public final void AGm(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, SUj sUj) {
    }

    public final void AR6(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, SUj sUj) {
    }

    public final void D5K(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, SUj sUj) {
    }

    public final void EIE() {
    }

    public final void EzK() {
    }

    public final boolean A03() {
        C10575RuU ruU;
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        SUj A0W = Pxe.A0W(this.A06);
        if (A0W == null || (ruU = (C10575RuU) A0W.A01) == null) {
            return true;
        }
        PickupInfo pickupInfo = (PickupInfo) ruU.A01;
        String str2 = pickupInfo.A01;
        String str3 = pickupInfo.A00;
        String str4 = pickupInfo.A03;
        if (!this.A03 || (str2 != null && !00l.A0W(str2) && (str = (String) this.A00.get(42)) != null && !00l.A0W(str))) {
            z = false;
        } else {
            z = true;
        }
        if (!this.A02 || (str3 != null && !00l.A0W(str3))) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!this.A04 || (str4 != null && !00l.A0W(str4))) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z || z2 || z3) {
            return true;
        }
        return false;
    }

    public final AnonymousClass2Fj AuQ() {
        return this.A08;
    }

    public final 2Fk ELG() {
        return this.A05;
    }

    public final /* synthetic */ boolean Ern() {
        return true;
    }

    public final void FKb(SparseArray sparseArray) {
        if (sparseArray != null) {
            this.A00 = sparseArray;
        }
    }
}
