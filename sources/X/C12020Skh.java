package X;

import java.util.List;

/* renamed from: X.Skh  reason: case insensitive filesystem */
public final class C12020Skh implements C13547TcJ {
    public final /* synthetic */ C11382SQu A00;

    public C12020Skh(C11382SQu sQu) {
        this.A00 = sQu;
    }

    public final void DW3(C7902QcU qcU, String str) {
        AnonymousClass7TG.A1N(qcU, str);
        List<C13547TcJ> list = this.A00.A0B;
        0qQ.A07(list);
        synchronized (list) {
            for (C13547TcJ DW3 : list) {
                DW3.DW3(qcU, str);
            }
        }
    }
}
