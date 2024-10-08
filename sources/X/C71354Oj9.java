package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.direct.fragment.stickertray.hscroll.tabs.IgdExpressionTrayHscrollLayout;
import com.instagram.modal.ModalActivity;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Oj9  reason: case insensitive filesystem */
public final class C71354Oj9 implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C71354Oj9(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.A00 = i2;
        this.A04 = obj2;
        this.A02 = obj3;
        this.A01 = i;
        this.A03 = obj;
    }

    public final void onClick(View view) {
        int A05;
        int i;
        AnonymousClass37D A0i;
        switch (this.A00) {
            case 0:
                A05 = AnonymousClass0fD.A05(21714261);
                Bundle A0a = AnonymousClass7TE.A0a();
                A0a.putParcelable("BrowserLiteIntent.EXTRA_AUTOFILL_REQUEST_AUTOFILL_JS_BRIDGE_CALL", (BrowserLiteJSBridgeCall) this.A04);
                A0a.putString(Pxd.A00(374), Pxd.A00(649));
                ArrayList A1C = AnonymousClass7TE.A1C();
                Iterator A1H = C51966G9m.A1H(this.A02);
                while (A1H.hasNext()) {
                    DbU.A1X(((AutofillData) A1H.next()).A01(), A1C);
                }
                A0a.putStringArrayList(Pxd.A00(376), A1C);
                A0a.putInt(Pxd.A00(428), this.A01);
                0SM r3 = (0SM) this.A03;
                AnonymousClass6W8.A05(r3.requireActivity(), A0a, ModalActivity.class, C273654mx.A00(676), IgNetworkConsentStorage.MAX_ENTRIES);
                r3.A07();
                i = -1683748295;
                break;
            case 1:
                A05 = AnonymousClass0fD.A05(751659810);
                ((IgdExpressionTrayHscrollLayout) this.A02).setSelectedIndex(this.A01);
                K3S k3s = (K3S) this.A04;
                FragmentActivity activity = k3s.getActivity();
                if (!(activity == null || (A0i = DbT.A0i(activity)) == null)) {
                    A0i.A0F(1.0f);
                }
                AnonymousClass0eM r2 = k3s.A0L;
                ((AnonymousClass52T) r2.getValue()).A00 = ((C61072JwA) this.A03).A01;
                GridLayoutManager gridLayoutManager = k3s.A02;
                if (gridLayoutManager != null) {
                    gridLayoutManager.A0t((AnonymousClass52T) r2.getValue());
                    i = -536006953;
                    break;
                } else {
                    0qQ.A0F("gridLayoutManager");
                    throw AnonymousClass00P.createAndThrow();
                }
            case 2:
                int i2 = this.A01;
                C3257073v r5 = (C3257073v) this.A03;
                C332847Wp r32 = ((C67814MvI) this.A02).A08;
                int layoutPosition = r5.getLayoutPosition();
                0qQ.A0B(r32, 1);
                new AnonymousClass74P(r32, i2, layoutPosition, false).A00((C328667Fr) this.A04, r5);
                return;
            case 3:
                C67814MvI mvI = (C67814MvI) this.A02;
                new AnonymousClass78F(mvI.A07, (AnonymousClass7X8) mvI.A08, this.A01).A00((AnonymousClass752) this.A03, (C3263876o) this.A04);
                return;
            default:
                A05 = AnonymousClass0fD.A05(1063273449);
                OZV ozv = (OZV) this.A04;
                Number A14 = C51966G9m.A14(((C70594OCr) this.A02).A00, ozv.A0C.A04);
                if (A14 != null) {
                    int intValue = A14.intValue();
                    AnonymousClass0eM r22 = ozv.A0J;
                    ((AnonymousClass52T) r22.getValue()).A00 = intValue;
                    ozv.A09.A0t((AnonymousClass52T) r22.getValue());
                }
                ((C60061Jec) this.A03).A01(this.A01, true);
                i = -54765381;
                break;
        }
        AnonymousClass0fD.A0C(i, A05);
    }
}
