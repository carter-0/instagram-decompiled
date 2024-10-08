package X;

import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.IWm  reason: case insensitive filesystem */
public final class C57303IWm implements AnonymousClass6VI {
    public final /* synthetic */ AnonymousClass5VN A00;
    public final /* synthetic */ C54154H0y A01;
    public final /* synthetic */ Reel A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ C62320sa A04;
    public final /* synthetic */ 0rk A05;

    public final void onStart() {
    }

    public C57303IWm(AnonymousClass5VN r1, C54154H0y h0y, Reel reel, List list, C62320sa r5, 0rk r6) {
        this.A04 = r5;
        this.A01 = h0y;
        this.A02 = reel;
        this.A03 = list;
        this.A00 = r1;
        this.A05 = r6;
    }

    public final void DEU(long j) {
        this.A04.invoke();
    }

    public final void Dom(boolean z, long j) {
        this.A04.invoke();
        C54154H0y h0y = this.A01;
        Reel reel = this.A02;
        List list = this.A03;
        AnonymousClass5VN r2 = this.A00;
        0rk r4 = this.A05;
        try {
            AnonymousClass7TE.A1Z(new C59703JUk((Object) r2, (Object) h0y, (Object) r4, (Object) reel, (Object) list, (AnonymousClass4D7) null, 15), DbV.A0J(h0y));
        } catch (Throwable th) {
            new 0eQ(th);
        }
    }

    public final void onCancel() {
        this.A04.invoke();
    }
}
