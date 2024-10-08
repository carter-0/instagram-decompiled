package X;

import java.util.List;

/* renamed from: X.Skl  reason: case insensitive filesystem */
public final class C12024Skl implements C13549TcL {
    public final /* synthetic */ C11382SQu A00;

    public C12024Skl(C11382SQu sQu) {
        this.A00 = sQu;
    }

    public final void Dvu(String str) {
        0qQ.A0B(str, 0);
        List<C13549TcL> list = this.A00.A0C;
        0qQ.A07(list);
        synchronized (list) {
            for (C13549TcL Dvu : list) {
                Dvu.Dvu(str);
            }
        }
    }
}
