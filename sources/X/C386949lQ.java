package X;

import java.io.File;
import java.io.IOException;

/* renamed from: X.9lQ  reason: invalid class name and case insensitive filesystem */
public final class C386949lQ extends 0ng {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C378989Rz A01;
    public final /* synthetic */ AnonymousClass8A5 A02;
    public final /* synthetic */ AnonymousClass51M A03;
    public final /* synthetic */ 0rm A04;
    public final /* synthetic */ boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C386949lQ(C378989Rz r4, AnonymousClass8A5 r5, AnonymousClass51M r6, 0rm r7, int i, boolean z) {
        super(94, 3, false, false);
        this.A05 = z;
        this.A02 = r5;
        this.A03 = r6;
        this.A00 = i;
        this.A01 = r4;
        this.A04 = r7;
    }

    public final void run() {
        File file;
        if (this.A05) {
            try {
                file = AnonymousClass8A5.A00(this.A01, this.A02, this.A03, this.A00);
            } catch (IOException unused) {
                return;
            }
        } else {
            Object obj = this.A04.A00;
            if (obj != null) {
                file = (File) obj;
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        if (!file.exists()) {
            AnonymousClass8A5.A02(this.A01, this.A02, this.A03, file, this.A00);
        }
    }
}
