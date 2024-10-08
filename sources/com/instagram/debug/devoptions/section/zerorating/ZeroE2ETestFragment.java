package com.instagram.debug.devoptions.section.zerorating;

import X.002;
import X.0qQ;
import X.1R0;
import X.1R7;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.AnonymousClass1Qz;
import X.AnonymousClass4DH;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C249883kW;
import X.C271484iv;
import X.C51967G9n;
import X.C51968G9o;
import X.C66583MXo;
import X.C9867Rig;
import X.DbU;
import X.DbX;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.Random;

public final class ZeroE2ETestFragment extends AnonymousClass4DH {
    public final Handler autoUpdate = new Handler();
    public Runnable autoUpdateTask;
    public boolean paused;
    public UserSession session;

    public String getModuleName() {
        return "zero_token_summary";
    }

    public void setSession(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        this.session = userSession;
    }

    private final String getTokenStatsText(C249883kW r9) {
        int i;
        int i2;
        int i3;
        int i4;
        long A00;
        if (!(r9 instanceof 1R0)) {
            return "N/A";
        }
        1R0 r92 = (1R0) r9;
        synchronized (r92) {
            C271484iv r0 = r92.A01;
            i = r0.A02;
            i2 = r0.A03;
            i3 = r0.A00;
            i4 = r0.A01;
            A00 = r92.A08.A00();
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append('[');
        A1A.append(i);
        A1A.append(',');
        A1A.append(i2);
        A1A.append(',');
        A1A.append(i3);
        A1A.append(',');
        A1A.append(i4);
        A1A.append(',');
        A1A.append(A00);
        return C51967G9n.A0r(A1A, ']');
    }

    public UserSession getSession() {
        UserSession userSession = this.session;
        if (userSession != null) {
            return userSession;
        }
        0qQ.A0F("session");
        throw AnonymousClass00P.createAndThrow();
    }

    /* access modifiers changed from: private */
    public final void updateView(View view) {
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.nonce);
        TextView A0R2 = AnonymousClass7TG.A0R(view, R.id.token_manager_class);
        TextView A0R3 = AnonymousClass7TG.A0R(view, R.id.token_fetch_at);
        TextView A0R4 = AnonymousClass7TG.A0R(view, R.id.token_fetch_reason);
        TextView A0R5 = AnonymousClass7TG.A0R(view, R.id.carrier_id);
        TextView A0R6 = AnonymousClass7TG.A0R(view, R.id.connection_type_string);
        TextView A0R7 = AnonymousClass7TG.A0R(view, R.id.token_stats);
        C249883kW A00 = AnonymousClass1Qz.A00(getSession());
        1R7 C82 = A00.C82();
        A0R.setText(002.A0Q("Nonce: ", new Random().nextLong()));
        C66583MXo.A0y(A0R2, "TokenManagerClass: ", C51968G9o.A16(A00));
        A0R3.setText(002.A0Q("TokenFetchAt: ", C82.A03));
        C66583MXo.A0y(A0R4, "TokenFetchReason: ", A00.BUG());
        C66583MXo.A0y(A0R5, "E2EDogfoodCarrierId: ", C9867Rig.A00());
        C66583MXo.A0y(A0R6, "ConnectionTypeString: ", (String) null);
        C66583MXo.A0y(A0R7, "TokenStats: ", getTokenStatsText(A00));
    }

    public void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1347444036);
        ZeroE2ETestFragment.super.onCreate(bundle);
        setSession(DbX.A0V(this));
        AnonymousClass0fD.A09(798408916, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1455428785);
        0qQ.A0B(layoutInflater, 0);
        View A0A = DbU.A0A(layoutInflater, viewGroup, R.layout.fragment_zero_e2e_test, false);
        updateView(A0A);
        ZeroE2ETestFragment$onCreateView$task$1 zeroE2ETestFragment$onCreateView$task$1 = new ZeroE2ETestFragment$onCreateView$task$1(this, A0A);
        this.autoUpdateTask = zeroE2ETestFragment$onCreateView$task$1;
        this.autoUpdate.postDelayed(zeroE2ETestFragment$onCreateView$task$1, 2000);
        AnonymousClass0fD.A09(-1322816348, A02);
        return A0A;
    }

    public void onDestroy() {
        int A02 = AnonymousClass0fD.A02(673281480);
        Runnable runnable = this.autoUpdateTask;
        if (runnable != null) {
            this.autoUpdate.removeCallbacks(runnable);
        }
        super.onDestroy();
        AnonymousClass0fD.A09(791167589, A02);
    }

    public void onPause() {
        int A02 = AnonymousClass0fD.A02(584840411);
        this.paused = true;
        ZeroE2ETestFragment.super.onPause();
        AnonymousClass0fD.A09(-1740283976, A02);
    }

    public void onResume() {
        int A02 = AnonymousClass0fD.A02(-856704126);
        super.onResume();
        this.paused = false;
        AnonymousClass0fD.A09(701792103, A02);
    }
}
