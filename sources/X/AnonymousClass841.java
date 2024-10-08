package X;

import java.util.List;

/* renamed from: X.841  reason: invalid class name */
public final class AnonymousClass841 implements C358108aN {
    public final /* synthetic */ C3502683z A00;

    public AnonymousClass841(C3502683z r1) {
        this.A00 = r1;
    }

    public final void onFailure(String str, boolean z) {
        C3502683z r5 = this.A00;
        synchronized (r5) {
            r5.A03 = null;
            List<AnonymousClass83x> list = r5.A01;
            for (AnonymousClass83x DEf : list) {
                DEf.DEf(z, new RuntimeException(002.A0R("Module download failed for ", r5.A00.A00)));
            }
            list.clear();
        }
    }

    public final void onSuccess() {
        C3502683z r4 = this.A00;
        synchronized (r4) {
            r4.A03 = null;
            List<AnonymousClass83x> list = r4.A01;
            for (AnonymousClass83x onSuccess : list) {
                onSuccess.onSuccess(new Object());
            }
            list.clear();
        }
    }
}
