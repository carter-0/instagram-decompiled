package X;

import java.util.List;

/* renamed from: X.Llw  reason: case insensitive filesystem */
public final class C65019Llw implements MTW {
    public final /* synthetic */ C357038Wf A00;
    public final /* synthetic */ List A01;

    public C65019Llw(C357038Wf r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public final void Doh(List list) {
        11Z.A02(new C66019M8e(this.A00, list, this.A01));
    }

    public final void onFailure(Exception exc) {
        11Z.A02(new C65967M6e(this.A00, exc));
    }
}
