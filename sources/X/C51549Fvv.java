package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.registration.model.RegFlowExtras;
import java.util.List;

/* renamed from: X.Fvv  reason: case insensitive filesystem */
public final class C51549Fvv implements Runnable {
    public final /* synthetic */ EEM A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public C51549Fvv(EEM eem, String str, String str2, List list, List list2, boolean z, boolean z2) {
        this.A00 = eem;
        this.A03 = list;
        this.A04 = list2;
        this.A02 = str;
        this.A01 = str2;
        this.A06 = z;
        this.A05 = z2;
    }

    public final void run() {
        Bundle A0a;
        Fragment e3a;
        RegFlowExtras regFlowExtras = new RegFlowExtras();
        List list = this.A03;
        regFlowExtras.A0e = list;
        regFlowExtras.A0f = this.A04;
        String str = this.A02;
        regFlowExtras.A0X = str;
        regFlowExtras.A0h = true;
        EEM eem = this.A00;
        CallerContext callerContext = EEM.A0B;
        regFlowExtras.A04 = eem.A02;
        regFlowExtras.A09 = this.A01;
        regFlowExtras.A0r = this.A06;
        regFlowExtras.A0m = this.A05;
        if (str.equals("kr")) {
            DbT.A15();
            A0a = AnonymousClass7TE.A0a();
            A0a.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras);
            DbU.A1C(A0a);
            e3a = new AnonymousClass4DH();
        } else if (list == null || list.isEmpty()) {
            DbT.A15();
            A0a = AnonymousClass7TE.A0a();
            A0a.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras);
            DbU.A1C(A0a);
            e3a = new C47454E3a();
        } else {
            DbT.A15();
            A0a = AnonymousClass7TE.A0a();
            A0a.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras);
            DbU.A1C(A0a);
            e3a = new E3W();
        }
        e3a.setArguments(A0a);
        Dba.A13(e3a, DbS.A0M(eem.A06.getActivity(), eem.A08));
    }
}
