package X;

import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: X.KIl  reason: case insensitive filesystem */
public final class C61695KIl extends 0ng {
    public final /* synthetic */ C321016tR A00;
    public final /* synthetic */ String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61695KIl(C321016tR r4, String str) {
        super(135, 2, false, false);
        this.A00 = r4;
        this.A01 = str;
    }

    public final void run() {
        try {
            C321016tR r3 = this.A00;
            FileInputStream fileInputStream = new FileInputStream(r3.A0F);
            String str = this.A01;
            0mb.A09(AnonymousClass7TE.A0t(str), fileInputStream);
            r3.A0D = str;
        } catch (IOException e) {
            0wb.A06("failed to cache gif file", 002.A0u("from: ", this.A00.A0F, " to: ", this.A01), e);
        }
    }
}
