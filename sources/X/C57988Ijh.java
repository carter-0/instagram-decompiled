package X;

import android.content.res.Resources;
import android.net.Uri;
import com.facebook.common.callercontext.ContextChain;
import java.util.List;

/* renamed from: X.Ijh  reason: case insensitive filesystem */
public final class C57988Ijh implements Runnable {
    public int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ContextChain A02;
    public final /* synthetic */ C53220GkU A03;
    public final /* synthetic */ 1U1 A04;
    public final /* synthetic */ 2V1 A05;
    public final /* synthetic */ Object A06;
    public final /* synthetic */ List A07;
    public final /* synthetic */ 0rk A08;

    public C57988Ijh(ContextChain contextChain, C53220GkU gkU, 1U1 r3, 2V1 r4, Object obj, List list, 0rk r7, int i, int i2) {
        this.A08 = r7;
        this.A01 = i2;
        this.A05 = r4;
        this.A03 = gkU;
        this.A07 = list;
        this.A04 = r3;
        this.A06 = obj;
        this.A02 = contextChain;
        this.A00 = i;
    }

    public final void run() {
        int i = (this.A00 + 1) % this.A01;
        2V1 r3 = this.A05;
        Resources A0A = AnonymousClass7TF.A0A(r3.A0C);
        C53220GkU gkU = this.A03;
        List list = this.A07;
        1U1 r9 = this.A04;
        Object obj = this.A06;
        ContextChain contextChain = this.A02;
        C226742hm r1 = (C226742hm) gkU.A02(gkU.A00);
        if (r1 != null) {
            if (!r1.CTa() || r1.CJu()) {
                C226742hm A052 = gkU.A05();
                if (!A052.CTa() || A052.CJu()) {
                    gkU.A06();
                    HSG.A00(A0A, (Uri) list.get(i % list.size()), contextChain, gkU, r9, obj);
                }
            }
            this.A00 = i;
            if (r3.A01 != null) {
                r3.A0A(new C294145lv(AnonymousClass7TF.A1b(i), -2147483647));
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
