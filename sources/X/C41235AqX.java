package X;

import android.graphics.drawable.Drawable;
import java.util.List;

/* renamed from: X.AqX  reason: case insensitive filesystem */
public final class C41235AqX implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C317876nz A02;
    public final /* synthetic */ AnonymousClass8ME A03;
    public final /* synthetic */ C39890ADo A04;

    public C41235AqX(C317876nz r1, AnonymousClass8ME r2, C39890ADo aDo, int i, int i2) {
        this.A03 = r2;
        this.A02 = r1;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = aDo;
    }

    public final void run() {
        AnonymousClass8ME r4 = this.A03;
        C317876nz r3 = this.A02;
        List list = r4.A0K;
        list.getClass();
        r4.A1H((Drawable) list.get(this.A01 - this.A00), r3, this.A04);
    }
}
