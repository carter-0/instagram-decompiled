package com.instagram.inappbrowser.extensions.bloks;

import X.1Eo;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass0xx;
import X.AnonymousClass12T;
import X.AnonymousClass4D7;
import X.C229382nI;
import X.C8814RAq;
import X.Pxd;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.util.SparseArray;
import androidx.fragment.app.FragmentActivity;
import com.facebook.browser.lite.ipc.IABExtensionPreExitHandlerBloksCallback;
import com.instagram.common.session.UserSession;

public final class IgBloksIABExtension$fetchPreExitHandlerAction$1 extends Binder implements IABExtensionPreExitHandlerBloksCallback {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AnonymousClass0xx A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C8814RAq A04;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgBloksIABExtension$fetchPreExitHandlerAction$1(FragmentActivity fragmentActivity, AnonymousClass0xx r4, AnonymousClass0iw r5, UserSession userSession, C8814RAq rAq) {
        this();
        this.A04 = rAq;
        this.A03 = userSession;
        this.A00 = fragmentActivity;
        this.A02 = r5;
        this.A01 = r4;
        AnonymousClass0fD.A0A(893298217, AnonymousClass0fD.A03(-717623503));
    }

    public final void Czs(String str, String str2, String str3) {
        int A032 = AnonymousClass0fD.A03(1474555871);
        C8814RAq rAq = this.A04;
        rAq.A01 = C229382nI.A01((SparseArray) null, this.A00, this.A02, this.A03);
        1Eo.A05(AnonymousClass12T.A00.CO6(685945487, 3), new IgBloksIABExtension$fetchPreExitHandlerAction$1$onCallComplete$1(rAq, str, str2, str3, (AnonymousClass4D7) null), this.A01);
        AnonymousClass0fD.A0A(674862715, A032);
    }

    public final IBinder asBinder() {
        AnonymousClass0fD.A0A(-10104519, AnonymousClass0fD.A03(2071459936));
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int A032 = AnonymousClass0fD.A03(-1744412835);
        String A002 = Pxd.A00(197);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface(A002);
                if (i == 1) {
                    Czs(parcel.readString(), parcel.readString(), parcel.readString());
                    i3 = -469442307;
                }
            } else if (i == 1598968902) {
                parcel2.writeString(A002);
                i3 = -1639223378;
            }
            AnonymousClass0fD.A0A(i3, A032);
            return true;
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        AnonymousClass0fD.A0A(1512644758, A032);
        return onTransact;
    }

    public IgBloksIABExtension$fetchPreExitHandlerAction$1() {
        int A032 = AnonymousClass0fD.A03(-217002676);
        attachInterface(this, Pxd.A00(197));
        AnonymousClass0fD.A0A(1916570366, A032);
    }
}
