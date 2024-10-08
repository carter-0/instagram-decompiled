package com.instagram.debug.devoptions.zero;

import X.002;
import X.0qQ;
import X.1R7;
import X.AnonymousClass0fD;
import X.AnonymousClass1Qz;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C273374mT;
import X.C281955Af;
import X.C66583MXo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;

public final class ZeroTokenSummaryFragment extends C273374mT {
    public static final Companion Companion = new Object();
    public final String moduleName = "zero_token_summary";

    public final class Companion {
        /* access modifiers changed from: private */
        public final String getCarrierSignalConfigText(1R7 r2) {
            try {
                return C281955Af.A00(r2.A04).toString();
            } catch (JSONException unused) {
                return "<error>";
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public String getModuleName() {
        return this.moduleName;
    }

    public void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1870845742);
        ZeroTokenSummaryFragment.super.onCreate(bundle);
        AnonymousClass0fD.A09(566652869, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1934204546);
        LayoutInflater layoutInflater2 = layoutInflater;
        0qQ.A0B(layoutInflater2, 0);
        View inflate = layoutInflater2.inflate(R.layout.fragment_zero_token_summary, viewGroup, false);
        TextView A0R = AnonymousClass7TG.A0R(inflate, R.id.carrier_name);
        TextView A0R2 = AnonymousClass7TG.A0R(inflate, R.id.token_hash);
        TextView A0R3 = AnonymousClass7TG.A0R(inflate, R.id.token_ttl);
        TextView A0R4 = AnonymousClass7TG.A0R(inflate, R.id.token_fetch_at);
        TextView A0R5 = AnonymousClass7TG.A0R(inflate, R.id.token_remain);
        TextView A0R6 = AnonymousClass7TG.A0R(inflate, R.id.token_features);
        TextView A0R7 = AnonymousClass7TG.A0R(inflate, R.id.token_rewrite_rules);
        TextView A0R8 = AnonymousClass7TG.A0R(inflate, R.id.carrier_id);
        TextView A0R9 = AnonymousClass7TG.A0R(inflate, R.id.token_wallet_defs_keys);
        TextView A0R10 = AnonymousClass7TG.A0R(inflate, R.id.carrier_signal_config);
        1R7 C82 = AnonymousClass1Qz.A00(getSession()).C82();
        C66583MXo.A0y(A0R, "Carrier Name: ", C82.A06);
        C66583MXo.A0y(A0R2, "Token Hash: ", C82.A09);
        A0R3.setText(002.A0O("Token TTL: ", C82.A02));
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(C82.A03);
        C66583MXo.A0y(A0R4, "Token fetch at: ", new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(instance.getTime()));
        A0R5.setText(002.A0Q("Token remain msecs: ", C82.A00()));
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("\nToken Features: \n");
        Iterator it = C82.A0C.iterator();
        while (it.hasNext()) {
            A1A.append(AnonymousClass7TE.A18(it));
            A1A.append("\n");
        }
        A0R6.setText(A1A.toString());
        StringBuilder A1A2 = AnonymousClass7TE.A1A();
        A1A2.append("\nRewrite Rules: \n");
        for (Object obj : C82.A0B) {
            A1A2.append(obj.toString());
            A1A2.append("\n\n");
        }
        A0R7.setText(A1A2.toString());
        A0R8.setText(002.A0O("Carrier ID: ", C82.A00));
        StringBuilder A1A3 = AnonymousClass7TE.A1A();
        A1A3.append("\nToken Wallet Defs Keys: \n");
        Iterator it2 = C82.A0D.iterator();
        while (it2.hasNext()) {
            A1A3.append(AnonymousClass7TE.A18(it2));
            A1A3.append("\n");
        }
        A0R9.setText(A1A3.toString());
        C66583MXo.A0y(A0R10, "Carrier Signal Config: \n", Companion.getCarrierSignalConfigText(C82));
        AnonymousClass0fD.A09(2021447197, A02);
        return inflate;
    }
}
