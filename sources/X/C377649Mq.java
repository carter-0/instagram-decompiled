package X;

/* renamed from: X.9Mq  reason: invalid class name and case insensitive filesystem */
public final class C377649Mq extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377649Mq(Object obj, String str, int i, boolean z) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
        this.A03 = z;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A00 != 0) {
            String str = (String) obj;
            0qQ.A0B(str, 0);
            AnonymousClass2UU.A00(new C283665Is(str, Boolean.valueOf(this.A03), this.A02));
        } else {
            C251243mn r4 = (C251243mn) obj;
            0qQ.A0B(r4, 0);
            r4.FLf((C294145lv) this.A01, this.A02, this.A03);
        }
        return C60340gF.A00;
    }
}
