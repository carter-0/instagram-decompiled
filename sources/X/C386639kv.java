package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.9kv  reason: invalid class name and case insensitive filesystem */
public final class C386639kv extends 0ng {
    public final /* synthetic */ AnonymousClass13W A00;
    public final /* synthetic */ String[] A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C386639kv(AnonymousClass13W r4, String[] strArr) {
        super(561, 3, false, false);
        this.A01 = strArr;
        this.A00 = r4;
    }

    public final void run() {
        1NK A002 = 1NK.A00();
        if (A002 != null) {
            A002.A0F.A00().close();
        }
        String[] strArr = this.A01;
        int i = 0;
        do {
            String str = strArr[i];
            Context context = this.A00.A00;
            File A003 = 1M1.A00(context, str, false);
            if (A003 != null) {
                1B8.A02.A00(context).A00(A003);
            }
            i++;
        } while (i < 2);
    }
}
