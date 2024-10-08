package X;

import java.io.File;

/* renamed from: X.9jV  reason: invalid class name and case insensitive filesystem */
public final class C385769jV extends 2Cn {
    public final /* synthetic */ AnonymousClass8QN A00;
    public final /* synthetic */ AnonymousClass8QZ A01;
    public final /* synthetic */ 1Xj A02;

    public C385769jV(AnonymousClass8QN r1, AnonymousClass8QZ r2, 1Xj r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        File file = (File) obj;
        1Xj r3 = this.A02;
        int A09 = AnonymousClass7TG.A09(r3);
        0qQ.A0B(file, 0);
        AnonymousClass8QN.A01(C282665Eg.A03(file, A09, 0), this.A00, this.A01, r3);
    }
}
