package com.instagram.debug.devoptions.zero;

import X.002;
import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass1Qz;
import X.AnonymousClass507;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C17823Vgc;
import X.C17978VjG;
import X.C18472VsO;
import X.C239023El;
import X.C273374mT;
import X.DbT;
import X.DbU;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public final class CarrierSignalStatusFragment extends C273374mT {
    public final String moduleName = "carrier_signal_status";

    public String getModuleName() {
        return this.moduleName;
    }

    public void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(2120152397);
        CarrierSignalStatusFragment.super.onCreate(bundle);
        AnonymousClass0fD.A09(1816446743, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        ArrayList arrayList;
        String str2;
        int A02 = AnonymousClass0fD.A02(161526065);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_carrier_signal_status, viewGroup, false);
        AnonymousClass507 AmD = AnonymousClass1Qz.A00(getSession()).AmD();
        TextView A0R = AnonymousClass7TG.A0R(inflate, R.id.pings);
        if (AmD != null) {
            synchronized (AmD) {
                arrayList = new ArrayList();
                Iterator A0u = AnonymousClass7TF.A0u(AmD.A05);
                while (A0u.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                    C18472VsO vsO = ((C17823Vgc) A1J.getValue()).A01;
                    StringBuilder sb = new StringBuilder();
                    sb.append(DbT.A13(A1J));
                    if (vsO != null) {
                        long j = ((C17823Vgc) A1J.getValue()).A00;
                        C17978VjG vjG = vsO.A01;
                        sb.append(", cooldown = ");
                        sb.append(AnonymousClass7TE.A0P((j + ((long) (vjG.A00 * IgNetworkConsentStorage.MAX_ENTRIES))) - AmD.A03.A01.now()));
                        sb.append(" sec");
                        sb.append(", url = ");
                        str2 = vjG.A02;
                    } else {
                        str2 = ", idle";
                    }
                    sb.append(str2);
                    DbU.A1X(sb, arrayList);
                }
            }
            str = 002.A04(arrayList.size(), " pings: \n", C239023El.A00(10).A02(arrayList));
        } else {
            str = "Carrier Signal Controller is not initialized";
        }
        A0R.setText(str);
        AnonymousClass0fD.A09(1715187915, A02);
        return inflate;
    }
}
