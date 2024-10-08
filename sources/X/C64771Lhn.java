package X;

/* renamed from: X.Lhn  reason: case insensitive filesystem */
public final class C64771Lhn implements C232262tL {
    public final C69349Njo A00;
    public final Integer A01;

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C64771Lhn lhn = (C64771Lhn) obj;
        0qQ.A0B(lhn, 0);
        if (!0qQ.A0K(this.A01, lhn.A01) || this.A00 != lhn.A00) {
            return false;
        }
        return true;
    }

    public C64771Lhn(C69349Njo njo, Integer num) {
        this.A01 = num;
        this.A00 = njo;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return String.valueOf(2131953010);
    }
}
