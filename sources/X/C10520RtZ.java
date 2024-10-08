package X;

import java.util.List;

/* renamed from: X.RtZ  reason: case insensitive filesystem */
public final class C10520RtZ {
    public final List A00;
    public final List A01;
    public final List A02;

    public C10520RtZ(List list) {
        this.A01 = list;
        this.A00 = C51970G9q.A0m(list);
        this.A02 = C51970G9q.A0m(list);
        for (int i = 0; i < list.size(); i++) {
            this.A00.add(new QGL(((C10656Rvq) list.get(i)).A01.A00));
            this.A02.add(new C11388SRb(((C10656Rvq) list.get(i)).A00.A00));
        }
    }
}
