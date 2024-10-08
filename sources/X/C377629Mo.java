package X;

/* renamed from: X.9Mo  reason: invalid class name and case insensitive filesystem */
public final class C377629Mo extends 0Yg implements 0sP {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final String A03;

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass37I r0;
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                String str = (String) obj2;
                0qQ.A0B(str, 0);
                ((C299635va) this.A02).CqF(2EG.A2q, str, this.A03, (String) null, this.A01);
                break;
            case 1:
                String str2 = (String) obj2;
                0qQ.A0B(str2, 0);
                r0 = new C283665Is(str2, Long.valueOf(this.A01), this.A03);
                break;
            default:
                String str3 = (String) obj2;
                0qQ.A0B(str3, 0);
                r0 = new AnonymousClass37H(str3, this.A03, this.A01);
                break;
        }
        AnonymousClass2UU.A00(r0);
        return C60340gF.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377629Mo(Object obj, String str, int i, long j) {
        super(1);
        this.A00 = i;
        this.A02 = obj;
        this.A03 = str;
        this.A01 = j;
    }
}
