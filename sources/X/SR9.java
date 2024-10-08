package X;

import com.facebookpay.form.cell.toggle.SwitchCellParams;
import com.fbpay.hub.common.link.LinkParams;
import com.google.common.collect.ImmutableList;
import java.util.AbstractCollection;

public final class SR9 {
    public int A00;
    public int A01;
    public int A02;
    public String A03 = "";
    public String A04 = "";
    public boolean A05;

    public static void A00(C8028QfI qfI, SR9 sr9, String str) {
        sr9.A03 = str;
        qfI.A08.add(new LinkParams(sr9));
    }

    public static void A01(C8028QfI qfI, ImmutableList.Builder builder, int i, boolean z) {
        qfI.A03 = i;
        SR9 sr9 = new SR9();
        sr9.A03("https://m.facebook.com/policy");
        sr9.A01 = 2131957398;
        sr9.A03 = "[[data_policy_token]]";
        qfI.A08.add(new LinkParams(sr9));
        builder.add(qfI.A00());
        builder.add(new SwitchCellParams(new C8025QfF(z, z)));
    }

    public static void A02(SR9 sr9, String str, AbstractCollection abstractCollection) {
        sr9.A03 = str;
        abstractCollection.add(new LinkParams(sr9));
    }

    public final void A03(String str) {
        this.A04 = str;
        C11367SPk.A03(str, "url");
    }
}
