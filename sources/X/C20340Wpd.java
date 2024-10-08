package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.react.modules.product.IgReactBoostPostModule;

/* renamed from: X.Wpd  reason: case insensitive filesystem */
public final class C20340Wpd implements Runnable {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ IgReactBoostPostModule A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public C20340Wpd(FragmentActivity fragmentActivity, IgReactBoostPostModule igReactBoostPostModule, String str, String str2, String str3) {
        this.A01 = igReactBoostPostModule;
        this.A00 = fragmentActivity;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = str3;
    }

    public final void run() {
        C309516Yo r5 = new C309516Yo(this.A00, this.A01.mUserSession);
        C13990Tnq.A0h();
        String str = this.A03;
        String str2 = this.A04;
        String str3 = this.A02;
        DbZ.A0t(0, str, str2, str3);
        Bundle A0N = C51971G9r.A0N(str);
        A0N.putString("boosted_id", (String) null);
        DbS.A1B(A0N, str3);
        A0N.putString("page_id", str2);
        DbX.A18(A0N, new UZX(), r5);
    }
}
