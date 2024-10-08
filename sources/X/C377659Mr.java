package X;

/* renamed from: X.9Mr  reason: invalid class name and case insensitive filesystem */
public final class C377659Mr extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377659Mr(Object obj, String str, int i, boolean z) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
        this.A03 = z;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A00 != 0) {
            AnonymousClass7TN r2 = (AnonymousClass7TN) this.A01;
            r2.A03.add(this.A02);
            r2.A02.markPointWithEditor(r2.A00, "agent_message_received").addPointData("is_welcome_message", this.A03).pointEditingCompleted();
        } else if (this.A03) {
            String str = this.A02;
            0qQ.A0B(str, 0);
            ((08Y) this.A01).A05.A06(str);
        }
        return C60340gF.A00;
    }
}
