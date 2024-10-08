package X;

/* renamed from: X.4ii  reason: invalid class name and case insensitive filesystem */
public final class C271354ii implements Runnable {
    public final /* synthetic */ AnonymousClass4CL A00;
    public final /* synthetic */ AnonymousClass4CK A01;
    public final /* synthetic */ String A02;

    public C271354ii(AnonymousClass4CL r1, AnonymousClass4CK r2, String str) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = r2;
    }

    public final void run() {
        AnonymousClass4CL r0 = this.A00;
        String str = this.A02;
        long itemSizeBytes = r0.A00.getItemSizeBytes(str);
        if (itemSizeBytes > 0) {
            this.A01.D7U(str, "__key_size", String.valueOf(itemSizeBytes));
        }
    }
}
