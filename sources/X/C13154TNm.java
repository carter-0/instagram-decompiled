package X;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: X.TNm  reason: case insensitive filesystem */
public final class C13154TNm implements Callable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    public C13154TNm(Object obj, Object obj2, Object obj3, Object obj4, String str, int i) {
        this.A00 = i;
        this.A05 = str;
        this.A01 = obj3;
        this.A03 = obj2;
        this.A04 = obj;
        this.A02 = obj4;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C7322Q3y q3y;
        if (this.A00 != 0) {
            C10964S2w s2w = (C10964S2w) this.A01;
            String str = this.A05;
            ArrayList A002 = s2w.A00(str);
            AnonymousClass4MQ r6 = (AnonymousClass4MQ) this.A03;
            ((C10805RyR) this.A04).A00 = r6.A00();
            C66602MYo A003 = C66601MYn.A00();
            String A004 = C9254RVf.A00(s2w.A00);
            synchronized (A003.A03) {
                A003.A02 = A004;
            }
            String A005 = C9253RVe.A00(r6.A00(), A002);
            0qQ.A0B(A005, 1);
            SharedPreferences A0H = Pxe.A0H(((C10209RoQ) this.A02).A00, "act_dns_cache");
            0qQ.A07(A0H);
            Pxf.A13(A0H.edit(), str, A005);
            return A002;
        }
        String str2 = this.A05;
        String A0R = 002.A0R("fetchResponseForKey:", str2);
        R9M r9m = (R9M) this.A03;
        AnonymousClass6R2 r3 = (AnonymousClass6R2) this.A04;
        try {
            1KZ.A01(002.A0T("BloksComponentQueryDiskCache", A0R, ':'));
            C307556Qo r5 = r3.A03;
            r9m.A00("io_read_start", r5.currentMonotonicTimestamp());
            AnonymousClass6R1 r1 = r3.A01;
            0qQ.A0B(str2, 0);
            byte[] readResourceToMemory = r1.A00.readResourceToMemory(str2);
            r9m.A00("io_read_end", r5.currentMonotonicTimestamp());
            if (readResourceToMemory != null) {
                r9m.A00(C273654mx.A00(2240), r5.currentMonotonicTimestamp());
                q3y = C9815Rhd.A00(readResourceToMemory);
                r9m.A00(C273654mx.A00(2239), r5.currentMonotonicTimestamp());
            } else {
                q3y = null;
            }
            ((Executor) this.A01).execute(new TIA(r9m, q3y, (0sP) this.A02));
            return C60340gF.A00;
        } finally {
            1KZ.A00();
        }
    }
}
