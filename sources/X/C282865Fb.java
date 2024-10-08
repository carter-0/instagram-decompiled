package X;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: X.5Fb  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C282865Fb implements Callable {
    public final /* synthetic */ AnonymousClass39K A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ ArrayList A02;

    public /* synthetic */ C282865Fb(AnonymousClass39K r1, String str, ArrayList arrayList) {
        this.A00 = r1;
        this.A02 = arrayList;
        this.A01 = str;
    }

    public final Object call() {
        AnonymousClass39K r0 = this.A00;
        ArrayList arrayList = this.A02;
        String str = this.A01;
        WorkDatabase workDatabase = r0.A02;
        arrayList.addAll(workDatabase.A06().C40(str));
        return workDatabase.A05().CGi(str);
    }
}
