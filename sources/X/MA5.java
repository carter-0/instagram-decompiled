package X;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

public final class MA5 implements Runnable {
    public final /* synthetic */ C65265LqK A00;
    public final /* synthetic */ AnonymousClass7LQ A01;
    public final /* synthetic */ C254703su A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ WeakReference A04;
    public final /* synthetic */ List A05;

    public MA5(C65265LqK lqK, AnonymousClass7LQ r2, C254703su r3, String str, WeakReference weakReference, List list) {
        this.A05 = list;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = str;
        this.A04 = weakReference;
        this.A00 = lqK;
    }

    public final void run() {
        Integer num;
        String A0C;
        Iterator it = this.A05.iterator();
        while (it.hasNext()) {
            C250663lr A0V = C41845B3m.A0V(it);
            String A0B = A0V.A0B("item_id");
            C254703su r3 = this.A02;
            if (0qQ.A0K(A0B, r3.A0h())) {
                String A0A = A0V.A0A("error_message");
                if (0qQ.A0K(A0A, "RATE_LIMIT_EXCEEDED")) {
                    num = AnonymousClass05K.A00;
                } else if (0qQ.A0K(A0A, "SOURCE_AND_TARGET_LANG_SAME") || A0A == null) {
                    num = AnonymousClass05K.A01;
                } else {
                    num = AnonymousClass05K.A0N;
                }
                if (0qQ.A0K(A0V.A0A("error_message"), "SOURCE_AND_TARGET_LANG_SAME")) {
                    A0C = this.A01.A0e.A1q;
                } else {
                    A0C = A0V.A0C(AnonymousClass000.A00(5346));
                }
                r3.A1H(A0C);
                r3.A1G(this.A03);
                if (num == AnonymousClass05K.A0N) {
                    Context context = (Context) this.A04.get();
                    if (context != null) {
                        C310336ap A0X = DbV.A0X();
                        A0X.A0H = "translate_message_error";
                        DbS.A19(context, A0X, 2131959804);
                        A0X.A0I = context.getString(2131959803);
                        DbY.A1N(A0X);
                    }
                    this.A01.A0b = false;
                } else {
                    this.A01.A0b = true;
                }
                this.A00.A00.BSN().EdR(num, r3.A0h(), true);
            }
        }
    }
}
