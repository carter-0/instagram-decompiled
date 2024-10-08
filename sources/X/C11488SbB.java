package X;

import android.view.View;
import com.facebookpay.common.recyclerview.adapteritems.SelectionFulfillmentOptionItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem;

/* renamed from: X.SbB  reason: case insensitive filesystem */
public final class C11488SbB implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C11488SbB(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
        this.A02 = obj4;
    }

    public final void onClick(View view) {
        int A05;
        int i;
        switch (this.A00) {
            case 0:
                A05 = AnonymousClass0fD.A05(-1130256822);
                if (((SelectionFulfillmentOptionItem) this.A01).Bs1() != AnonymousClass05K.A01) {
                    ((QFS) this.A03).A02.A00();
                }
                ((C7988Qeb) this.A04).A00.invoke(this.A02);
                i = -1946918042;
                break;
            case 1:
                A05 = AnonymousClass0fD.A05(-2001526600);
                if (((SelectionPaymentMethodItem) this.A01).A03 != AnonymousClass05K.A01) {
                    ((QFV) this.A03).A03.A00();
                }
                ((C7989Qec) this.A04).A00.invoke(this.A02);
                i = 1958365787;
                break;
            default:
                A05 = AnonymousClass0fD.A05(-129427015);
                if (((SelectionShippingAddressItem) this.A01).A01 != AnonymousClass05K.A01) {
                    ((QFU) this.A03).A02.A00();
                }
                ((C7994Qeh) this.A04).A00.invoke(this.A02);
                i = 1211144129;
                break;
        }
        AnonymousClass0fD.A0C(i, A05);
    }
}
