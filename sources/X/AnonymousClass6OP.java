package X;

/* renamed from: X.6OP  reason: invalid class name */
public final class AnonymousClass6OP implements 2IR {
    public final /* synthetic */ AnonymousClass6OI A00;
    public final /* synthetic */ String A01;

    public AnonymousClass6OP(AnonymousClass6OI r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void onFailure(Throwable th) {
        this.A00.A00.remove(this.A01);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        if (obj != null) {
            this.A00.A01.put(this.A01, obj);
        }
        this.A00.A00.remove(this.A01);
    }
}
