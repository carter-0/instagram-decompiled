package X;

import android.content.Context;

/* renamed from: X.KIw  reason: case insensitive filesystem */
public final class C61706KIw extends 0ng {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass2hV A01;
    public final /* synthetic */ C59870Jat A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61706KIw(Context context, AnonymousClass2hV r3, C59870Jat jat) {
        super(600);
        this.A02 = jat;
        this.A00 = context;
        this.A01 = r3;
    }

    public final void run() {
        Context context = this.A00;
        AnonymousClass2hV r2 = this.A01;
        boolean z = true;
        if (context.getExternalFilesDir((String) null) == null) {
            z = false;
        }
        r2.apply(Boolean.valueOf(z));
    }
}
