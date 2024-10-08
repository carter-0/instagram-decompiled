package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.monetization.repository.MonetizationRepository;

/* renamed from: X.Dky  reason: case insensitive filesystem */
public final class C46771Dky extends 2YL {
    public final 2Fk A00;
    public final AnonymousClass2Fj A01;
    public final 1a8 A02 = 1a8.A00();
    public final MonetizationRepository A03;
    public final C249513ju A04;
    public final AnonymousClass0r6 A05;
    public final Context A06;
    public final UserSession A07;

    public final void onCleared() {
        this.A02.A01();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.DrZ, java.lang.Object] */
    public C46771Dky(Context context, UserSession userSession, MonetizationRepository monetizationRepository) {
        this.A06 = context;
        this.A03 = monetizationRepository;
        this.A07 = userSession;
        1HR r0 = new 1HR(0);
        this.A04 = r0;
        this.A05 = 0u9.A04(r0);
        ? obj = new Object();
        obj.A00 = "not_eligible";
        obj.A05 = false;
        obj.A01 = "$0.00";
        obj.A04 = false;
        obj.A06 = false;
        obj.A03 = false;
        obj.A02 = false;
        2Fk r02 = new 2Fk(obj);
        this.A01 = r02;
        this.A00 = r02;
    }
}
