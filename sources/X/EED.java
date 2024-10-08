package X;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.realtimeclient.RealtimeConstants;

public final class EED extends C252233om {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public EED(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A01 = obj;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C307896Rx r2;
        C277014uI r1;
        Object[] objArr;
        switch (this.A00) {
            case 0:
                if (i == 1) {
                    if (i2 != -1 || intent == null || !RealtimeConstants.SEND_SUCCESS.equals(intent.getStringExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS))) {
                        r2 = (C307896Rx) this.A01;
                        r1 = (C277014uI) this.A02;
                        objArr = new Object[0];
                    } else {
                        String stringExtra = intent.getStringExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
                        String stringExtra2 = intent.getStringExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
                        r2 = (C307896Rx) this.A01;
                        r1 = (C277014uI) this.A03;
                        objArr = new Object[]{stringExtra, stringExtra2};
                    }
                    C308206Td.A0E(r2, r1, objArr);
                    C308206Td.A0L(r2, this);
                    return;
                }
                return;
            case 3:
                if (i == 2884) {
                    C49745F4k.A01(intent, (C307896Rx) this.A03, (C277014uI) this.A02, i2);
                    ((FragmentActivity) this.A01).unregisterOnActivityResultListener(this);
                    return;
                }
                return;
            default:
                super.onActivityResult(i, i2, intent);
                return;
        }
    }

    public final void onDestroy() {
        Object obj;
        switch (this.A00) {
            case 3:
                ((FragmentActivity) this.A01).unregisterOnActivityResultListener(this);
                return;
            case 4:
                ((C270464gm) this.A03).A01 = null;
                obj = this.A02;
                break;
            case 5:
                ((C270044g6) this.A02).A00 = null;
                obj = this.A03;
                break;
            default:
                super.onDestroy();
                return;
        }
        ((C229382nI) obj).A06(this);
    }

    public final void onDestroyView() {
        Object obj;
        switch (this.A00) {
            case 1:
                obj = ((0rm) this.A02).A00;
                break;
            case 2:
                obj = this.A02;
                break;
            case 4:
            case 5:
                ((AnonymousClass6NS) this.A01).A04();
                return;
            default:
                super.onDestroyView();
                return;
        }
        ((C249463jp) obj).Bx5().A09((Dc2) this.A01);
        ((C229382nI) this.A03).A06(this);
    }
}
