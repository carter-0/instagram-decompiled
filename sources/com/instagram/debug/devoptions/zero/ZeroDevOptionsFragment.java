package com.instagram.debug.devoptions.zero;

import X.0qQ;
import X.0xa;
import X.1Al;
import X.1An;
import X.1RA;
import X.2da;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass0fN;
import X.AnonymousClass1Qz;
import X.AnonymousClass1R9;
import X.AnonymousClass4DS;
import X.AnonymousClass507;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C16692V1v;
import X.C17515VYt;
import X.C17823Vgc;
import X.C17978VjG;
import X.C18080Vl9;
import X.C18472VsO;
import X.C20405Wqp;
import X.C21046XBn;
import X.C227642jf;
import X.C271504ix;
import X.C47518E6c;
import X.C50989Fmc;
import X.C66583MXo;
import X.DbW;
import X.PR8;
import X.UVO;
import X.V3N;
import android.os.Bundle;
import android.view.View;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;

public final class ZeroDevOptionsFragment extends C47518E6c implements AnonymousClass4DS {
    public ArrayList items;
    public final String moduleName = "ZeroDevOptionsFragment";
    public final AnonymousClass0eM session$delegate = C227642jf.A02(this);
    public 0xa sharedPreferences;

    public void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1C(r2, "Zero Rating Settings");
    }

    public void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ArrayList arrayList = this.items;
        if (arrayList == null) {
            0qQ.A0F(DialogModule.KEY_ITEMS);
            throw AnonymousClass00P.createAndThrow();
        } else {
            setItems(arrayList);
        }
    }

    /* access modifiers changed from: private */
    public final void onForceCarrierSignalPingClick() {
        boolean A00 = C271504ix.A00(AnonymousClass7TE.A0l(this.session$delegate)).A00();
        UserSession A0l = AnonymousClass7TE.A0l(this.session$delegate);
        if (A00) {
            C17515VYt vYt = (C17515VYt) C20405Wqp.A00(A0l, C17515VYt.class, 12);
            0qQ.A07(vYt);
            try {
                C21046XBn xBn = vYt.A00;
                if (xBn != null) {
                    xBn.APd(new UVO(AnonymousClass05K.A0N));
                    return;
                }
                throw new C16692V1v();
            } catch (C16692V1v unused) {
                C18080Vl9 vl9 = new C18080Vl9(requireContext());
                vl9.A08("Store is not available");
                vl9.A06(ZeroDevOptionsFragment$onForceCarrierSignalPingClick$1.INSTANCE, "OK");
                AnonymousClass0fN.A00(vl9.A00());
            }
        } else {
            AnonymousClass507 AmD = AnonymousClass1Qz.A00(A0l).AmD();
            if (AmD != null) {
                synchronized (AmD) {
                    Iterator A0v = AnonymousClass7TF.A0v(AmD.A05);
                    while (A0v.hasNext()) {
                        C18472VsO vsO = ((C17823Vgc) A0v.next()).A01;
                        if (vsO != null) {
                            C17978VjG vjG = vsO.A01;
                            V3N v3n = AmD.A03;
                            AmD.A02(vjG, v3n.A01.now() + v3n.A00);
                        }
                    }
                }
                return;
            }
            C18080Vl9 vl92 = new C18080Vl9(requireContext());
            vl92.A08("Carrier Signal Not initialized");
            vl92.A06(ZeroDevOptionsFragment$onForceCarrierSignalPingClick$2.INSTANCE, "OK");
            AnonymousClass0fN.A00(vl92.A00());
        }
    }

    public String getModuleName() {
        return this.moduleName;
    }

    /* access modifiers changed from: private */
    public final void showAlertDialog(String str, String str2) {
        C18080Vl9 vl9 = new C18080Vl9(requireContext());
        vl9.A08(str);
        vl9.A01.A0C = str2;
        vl9.A06(ZeroDevOptionsFragment$showAlertDialog$1.INSTANCE, "OK");
        AnonymousClass0fN.A00(vl9.A00());
    }

    public void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-779567658);
        super.onCreate(bundle);
        this.sharedPreferences = 1Al.A01(AnonymousClass7TE.A0l(this.session$delegate)).A03(1An.A3d);
        this.items = new ArrayList();
        C50989Fmc fmc = new C50989Fmc(requireContext(), (View.OnClickListener) new ZeroDevOptionsFragment$onCreate$tokenSummaryItem$1(this), (CharSequence) "Show Zero Token");
        ArrayList arrayList = this.items;
        String str = DialogModule.KEY_ITEMS;
        if (arrayList != null) {
            C50989Fmc fmc2 = new C50989Fmc(C66583MXo.A07(this, fmc, arrayList), (View.OnClickListener) new ZeroDevOptionsFragment$onCreate$forceRefreshItem$1(this), (CharSequence) "Force Refresh Token");
            ArrayList arrayList2 = this.items;
            if (arrayList2 != null) {
                C50989Fmc fmc3 = new C50989Fmc(C66583MXo.A07(this, fmc2, arrayList2), (View.OnClickListener) new ZeroDevOptionsFragment$onCreate$carrierSignalStatusItem$1(this), (CharSequence) "Carrier Signal Status");
                ArrayList arrayList3 = this.items;
                if (arrayList3 != null) {
                    C50989Fmc fmc4 = new C50989Fmc(C66583MXo.A07(this, fmc3, arrayList3), (View.OnClickListener) new ZeroDevOptionsFragment$onCreate$forceCarrierSignalPingItem$1(this), (CharSequence) "Force Carrier Signal Ping");
                    ArrayList arrayList4 = this.items;
                    if (arrayList4 != null) {
                        C50989Fmc fmc5 = new C50989Fmc(C66583MXo.A07(this, fmc4, arrayList4), (View.OnClickListener) new ZeroDevOptionsFragment$onCreate$overrideEnabledFeaturesItem$1(this), (CharSequence) "Override Enabled Features");
                        ArrayList arrayList5 = this.items;
                        if (arrayList5 != null) {
                            C50989Fmc fmc6 = new C50989Fmc(C66583MXo.A07(this, fmc5, arrayList5), (View.OnClickListener) new ZeroDevOptionsFragment$onCreate$zbdDevOptionsItem$1(this), (CharSequence) "Zbd Developer Options");
                            ArrayList arrayList6 = this.items;
                            if (arrayList6 != null) {
                                C50989Fmc fmc7 = new C50989Fmc(C66583MXo.A07(this, fmc6, arrayList6), (View.OnClickListener) new ZeroDevOptionsFragment$onCreate$headersDevOptionsItem$1(this), (CharSequence) "Headers Developer Options");
                                ArrayList arrayList7 = this.items;
                                if (arrayList7 != null) {
                                    arrayList7.add(fmc7);
                                    0xa r2 = this.sharedPreferences;
                                    if (r2 == null) {
                                        str = "sharedPreferences";
                                    } else {
                                        PR8 pr8 = new PR8(new ZeroDevOptionsFragment$onCreate$freeModeSimulationDevOptionsItem$1(this), "Simulate free mode", r2.getBoolean("free_mode_simulation", false));
                                        ArrayList arrayList8 = this.items;
                                        if (arrayList8 != null) {
                                            arrayList8.add(pr8);
                                            PR8 pr82 = new PR8(ZeroDevOptionsFragment$onCreate$easyDogfoodingOptionsItem$1.INSTANCE, "Easy Dogfooding", ((1RA) AnonymousClass1R9.A03.A02.getValue()).A06);
                                            ArrayList arrayList9 = this.items;
                                            if (arrayList9 != null) {
                                                arrayList9.add(pr82);
                                                AnonymousClass0fD.A09(758549587, A02);
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public UserSession getSession() {
        return AnonymousClass7TE.A0l(this.session$delegate);
    }
}
