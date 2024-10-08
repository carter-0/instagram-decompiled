package X;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public final class FTH implements AnonymousClass6ON {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C368208sF A01;
    public final /* synthetic */ C49963FGw A02;
    public final /* synthetic */ 2LC A03;
    public final /* synthetic */ C49439Evf A04;

    public FTH(Context context, C368208sF r2, C49963FGw fGw, 2LC r4, C49439Evf evf) {
        this.A04 = evf;
        this.A00 = context;
        this.A01 = r2;
        this.A02 = fGw;
        this.A03 = r4;
    }

    public final ListenableFuture AFB() {
        ArrayList A012;
        String A11;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = this.A04.A00.iterator();
        while (it.hasNext()) {
            FAQ faq = (FAQ) AnonymousClass7TF.A0a(it);
            Map map = faq.A01;
            if (!(map == null || (A11 = DbT.A11("resolver_type", map)) == null)) {
                int hashCode = A11.hashCode();
                if (hashCode != -786997656) {
                    if (hashCode != -782042377 && hashCode == -385236069 && A11.equals("account_manager")) {
                        A012 = C49963FGw.A03(this.A00, faq);
                        A1C.addAll(A012);
                    }
                } else if (A11.equals("lite_content_provider")) {
                    A012 = C49963FGw.A02(this.A00, "fx_android_access_library_internal_settings", faq, C49963FGw.A04(this.A01, this.A03));
                    A1C.addAll(A012);
                }
            }
            A012 = C49963FGw.A01(this.A00, "fx_android_access_library_internal_settings", faq, C49963FGw.A04(this.A01, this.A03));
            A1C.addAll(A012);
        }
        return C255183ti.A03(00k.A0a(A1C));
    }
}
