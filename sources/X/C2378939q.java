package X;

import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.39q  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C2378939q implements AnonymousClass39S {
    public final /* synthetic */ AnonymousClass38C A00;
    public final /* synthetic */ WorkDatabase A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ Executor A03;

    public /* synthetic */ C2378939q(AnonymousClass38C r1, WorkDatabase workDatabase, List list, Executor executor) {
        this.A03 = executor;
        this.A02 = list;
        this.A00 = r1;
        this.A01 = workDatabase;
    }

    public final void DDI(C255373u1 r6, boolean z) {
        this.A03.execute(new AnonymousClass5G3(this.A00, this.A01, r6, this.A02));
    }
}
