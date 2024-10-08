package com.instagram.debug.devoptions.zero;

import X.0qQ;
import X.0xa;
import X.1Al;
import X.1An;
import X.2da;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass0fN;
import X.AnonymousClass4DS;
import X.AnonymousClass7TE;
import X.C16692V1v;
import X.C17515VYt;
import X.C17681VcC;
import X.C18080Vl9;
import X.C18475VsR;
import X.C20405Wqp;
import X.C21046XBn;
import X.C227642jf;
import X.C47518E6c;
import X.C50989Fmc;
import X.C66583MXo;
import X.DbT;
import X.DbW;
import X.PR8;
import X.Pxd;
import X.UVS;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.ArrayList;

public final class ZbdDevOptionsFragment extends C47518E6c implements AnonymousClass4DS {
    public final ArrayList items = new ArrayList();
    public final AnonymousClass0eM session$delegate = C227642jf.A02(this);
    public 0xa sharedPreferences;

    public void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1C(r2, "Zbd Developer Options");
    }

    public String getModuleName() {
        return "ZbdDevOptionsFragment";
    }

    public void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        setItems(this.items);
    }

    private final String getZBDString(C18475VsR vsR) {
        StringBuilder sb = new StringBuilder();
        try {
            C18475VsR.A00();
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            e.printStackTrace();
            return DbT.A10(sb);
        }
    }

    /* access modifiers changed from: private */
    public final void onClearZBDStateItemClick() {
        C17515VYt vYt = (C17515VYt) C20405Wqp.A00(AnonymousClass7TE.A0l(this.session$delegate), C17515VYt.class, 12);
        0qQ.A07(vYt);
        try {
            C21046XBn xBn = vYt.A00;
            if (xBn != null) {
                xBn.APd(new Object());
                showAlertDialog("Zbd state has been cleared", (String) null);
                return;
            }
            throw new C16692V1v();
        } catch (C16692V1v unused) {
            showAlertDialog("Store is not available", (String) null);
        }
    }

    /* access modifiers changed from: private */
    public final void onForceZBDRedirectPingClick() {
        C17515VYt vYt = (C17515VYt) C20405Wqp.A00(AnonymousClass7TE.A0l(this.session$delegate), C17515VYt.class, 12);
        0qQ.A07(vYt);
        try {
            C21046XBn xBn = vYt.A00;
            if (xBn != null) {
                xBn.APd(new Object());
                xBn.APd(new UVS(AnonymousClass05K.A0Y));
                showAlertDialog("Zbd redirect ping has been triggered", (String) null);
                return;
            }
            throw new C16692V1v();
        } catch (C16692V1v unused) {
            showAlertDialog("Store is not available", (String) null);
        }
    }

    /* access modifiers changed from: private */
    public final void onZBDStateItemClick() {
        C17515VYt vYt = (C17515VYt) C20405Wqp.A00(AnonymousClass7TE.A0l(this.session$delegate), C17515VYt.class, 12);
        0qQ.A07(vYt);
        try {
            C21046XBn xBn = vYt.A00;
            if (xBn != null) {
                C18475VsR vsR = ((C17681VcC) xBn.getState()).A03;
                if (vsR != null) {
                    showZbdState("ZBD State", getZBDString(vsR));
                } else {
                    showZbdState("ZBD in SDK is not initialized", (String) null);
                }
            } else {
                throw new C16692V1v();
            }
        } catch (C16692V1v unused) {
            showZbdState("Zero SDK is not initialized", (String) null);
        }
    }

    private final void showAlertDialog(String str, String str2) {
        C18080Vl9 vl9 = new C18080Vl9(requireContext());
        vl9.A08(str);
        vl9.A01.A0C = str2;
        vl9.A06(ZbdDevOptionsFragment$showAlertDialog$1.INSTANCE, "OK");
        AnonymousClass0fN.A00(vl9.A00());
    }

    private final void showZbdState(String str, String str2) {
        C18080Vl9 vl9 = new C18080Vl9(requireContext());
        vl9.A08(str);
        vl9.A01.A0C = str2;
        vl9.A06(ZbdDevOptionsFragment$showZbdState$1.INSTANCE, "OK");
        AnonymousClass0fN.A00(vl9.A00());
    }

    public void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-476173092);
        super.onCreate(bundle);
        this.sharedPreferences = 1Al.A01(AnonymousClass7TE.A0l(this.session$delegate)).A03(1An.A3d);
        this.items.add(new C50989Fmc(C66583MXo.A07(this, new C50989Fmc(C66583MXo.A07(this, new C50989Fmc(requireContext(), (View.OnClickListener) new ZbdDevOptionsFragment$onCreate$zeroBalanceDetectionStateItem$1(this), (CharSequence) "ZBD state"), this.items), (View.OnClickListener) new ZbdDevOptionsFragment$onCreate$zeroBalanceDetectionClearStateItem$1(this), (CharSequence) "Clear ZBD state"), this.items), (View.OnClickListener) new ZbdDevOptionsFragment$onCreate$forceZBDRedirectPingItem$1(this), (CharSequence) "Force ZBD Redirect Ping"));
        0xa r2 = this.sharedPreferences;
        if (r2 == null) {
            0qQ.A0F("sharedPreferences");
            throw AnonymousClass00P.createAndThrow();
        }
        this.items.add(new PR8(new ZbdDevOptionsFragment$onCreate$zeroBalanceSimulationToggle$1(this), "Simulate zero balance", r2.getBoolean(Pxd.A00(294), false)));
        AnonymousClass0fD.A09(-1634970859, A02);
    }

    public UserSession getSession() {
        return AnonymousClass7TE.A0l(this.session$delegate);
    }
}
