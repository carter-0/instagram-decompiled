package com.facebook.browser.lite.extensions.shopifycheckout.instagram;

import X.AnonymousClass0fD;
import X.AnonymousClass7TG;
import X.C7571QKc;
import X.Pxj;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.facebook.browser.lite.ipc.OnShopsLiteCallback;

public final class IGShopifyCheckoutSDKIAWController$openShopifyMetaCheckout$callback$1 extends Binder implements OnShopsLiteCallback {
    public final /* synthetic */ C7571QKc A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IGShopifyCheckoutSDKIAWController$openShopifyMetaCheckout$callback$1(C7571QKc qKc) {
        this();
        this.A00 = qKc;
        AnonymousClass0fD.A0A(332813676, AnonymousClass0fD.A03(-352445504));
    }

    public final void DS1(Bundle bundle) {
        int A0D = AnonymousClass7TG.A0D(bundle, -1927957737);
        this.A00.A00(bundle);
        AnonymousClass0fD.A0A(56071934, A0D);
    }

    public final IBinder asBinder() {
        AnonymousClass0fD.A0A(843513430, AnonymousClass0fD.A03(1248177477));
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int A03 = AnonymousClass0fD.A03(-324329794);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.facebook.browser.lite.ipc.OnShopsLiteCallback");
                if (i == 1) {
                    parcel.readInt();
                    AnonymousClass0fD.A0A(1598565589, AnonymousClass0fD.A03(3765467));
                } else if (i == 2) {
                    DS1((Bundle) Pxj.A0i(parcel, Bundle.CREATOR));
                }
                i3 = 298094374;
            } else if (i == 1598968902) {
                parcel2.writeString("com.facebook.browser.lite.ipc.OnShopsLiteCallback");
                i3 = -940265504;
            }
            AnonymousClass0fD.A0A(i3, A03);
            return true;
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        AnonymousClass0fD.A0A(-1179578537, A03);
        return onTransact;
    }

    public IGShopifyCheckoutSDKIAWController$openShopifyMetaCheckout$callback$1() {
        int A03 = AnonymousClass0fD.A03(-181620933);
        attachInterface(this, "com.facebook.browser.lite.ipc.OnShopsLiteCallback");
        AnonymousClass0fD.A0A(-242922876, A03);
    }
}
