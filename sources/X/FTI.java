package X;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public final class FTI implements AnonymousClass6ON {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C368208sF A01;
    public final /* synthetic */ C49963FGw A02;
    public final /* synthetic */ 2LC A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ C49439Evf A05;

    public FTI(Context context, C368208sF r2, C49963FGw fGw, 2LC r4, String str, C49439Evf evf) {
        this.A05 = evf;
        this.A00 = context;
        this.A01 = r2;
        this.A02 = fGw;
        this.A03 = r4;
        this.A04 = str;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.9Gp, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v13, types: [X.9Gq, java.lang.Object] */
    public final ListenableFuture AFB() {
        ArrayList A012;
        String A11;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = this.A05.A00.iterator();
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
                    A012 = C49963FGw.A02(this.A00, this.A04, faq, C49963FGw.A04(this.A01, this.A03));
                    A1C.addAll(A012);
                }
            }
            A012 = C49963FGw.A01(this.A00, this.A04, faq, C49963FGw.A04(this.A01, this.A03));
            A1C.addAll(A012);
        }
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        Iterator it2 = A1C.iterator();
        while (it2.hasNext()) {
            F3S f3s = (F3S) it2.next();
            C368098s4 A013 = C368228sH.A01(f3s.A04);
            if (A013 != null) {
                Map map2 = f3s.A03;
                C376109Go r1 = new C376109Go(f3s.A02, DbT.A11("user_name", map2), DbT.A11("profile_pic_url", map2));
                map2.get(AnonymousClass000.A00(4162));
                String str = f3s.A01;
                ? obj = new Object();
                obj.A01 = r1;
                obj.A00 = str;
                ? obj2 = new Object();
                obj2.A01 = "2";
                obj2.A00 = "2";
                obj.A02 = obj2;
                A1C2.add(new C376139Gr(new C368148s9(A013), obj));
            }
        }
        return C255183ti.A03(00k.A0a(A1C2));
    }
}
