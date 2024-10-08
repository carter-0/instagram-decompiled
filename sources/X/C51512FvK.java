package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.FvK  reason: case insensitive filesystem */
public final class C51512FvK implements Runnable {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AnonymousClass0aP A01;
    public final /* synthetic */ DwI A02;
    public final /* synthetic */ boolean A03;

    public C51512FvK(FragmentActivity fragmentActivity, AnonymousClass0aP r2, DwI dwI, boolean z) {
        this.A02 = dwI;
        this.A03 = z;
        this.A00 = fragmentActivity;
        this.A01 = r2;
    }

    public final void run() {
        ArrayList A1C;
        DbT.A15();
        DwI dwI = this.A02;
        List list = dwI.A09;
        if (list != null) {
            A1C = AnonymousClass7TE.A1D(list);
        } else {
            A1C = AnonymousClass7TE.A1C();
        }
        String str = dwI.A08;
        0qQ.A07(str);
        boolean z = this.A03;
        AnonymousClass4DH r2 = new AnonymousClass4DH();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putParcelableArrayList("UHL_ACCOUNT_SELECTION_ACCOUNTS", A1C);
        A0a.putString("ARG_UHL_ACCOUNT_SELECTION_GET_HELP_LINK", str);
        A0a.putBoolean("ARG_UHL_ACCOUNT_SELECTION_SHOW_AS_MODAL", z);
        r2.setArguments(A0a);
        C309516Yo A0M = DbV.A0M(r2, this.A00, this.A01);
        if (z) {
            A0M.A0E = true;
        }
        A0M.A04();
    }
}
