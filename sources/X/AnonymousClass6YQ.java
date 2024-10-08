package X;

import java.io.File;

/* renamed from: X.6YQ  reason: invalid class name */
public final class AnonymousClass6YQ extends 0ng {
    public final /* synthetic */ AnonymousClass3KG A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6YQ(AnonymousClass3KG r4) {
        super(59, 3, false, false);
        this.A00 = r4;
    }

    public final void run() {
        AnonymousClass3KG r5 = this.A00;
        if (r5.A00) {
            int i = 0;
            r5.A00 = false;
            String[] strArr = AnonymousClass3KJ.A04;
            do {
                if (new File(strArr[i]).canRead()) {
                    r5.A06[i].stopWatching();
                }
                i++;
            } while (i < 2);
            AnonymousClass3KG.A01(r5);
        }
    }
}
