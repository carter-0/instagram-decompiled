package X;

import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;

/* renamed from: X.Aqz  reason: case insensitive filesystem */
public final class C41263Aqz implements Runnable {
    public final /* synthetic */ C53401GnY A00;
    public final /* synthetic */ Medium A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ 1pK A03;
    public final /* synthetic */ AnonymousClass8K7 A04;
    public final /* synthetic */ LD4 A05;
    public final /* synthetic */ C381779cJ A06;
    public final /* synthetic */ A6R A07;
    public final /* synthetic */ AnonymousClass3Q2 A08;

    public C41263Aqz(C53401GnY gnY, Medium medium, UserSession userSession, 1pK r4, AnonymousClass8K7 r5, LD4 ld4, C381779cJ r7, A6R a6r, AnonymousClass3Q2 r9) {
        this.A03 = r4;
        this.A02 = userSession;
        this.A01 = medium;
        this.A08 = r9;
        this.A05 = ld4;
        this.A06 = r7;
        this.A07 = a6r;
        this.A00 = gnY;
        this.A04 = r5;
    }

    public final void run() {
        1pK r3 = this.A03;
        UserSession userSession = this.A02;
        Medium medium = this.A01;
        AnonymousClass3Q2 r8 = this.A08;
        1pK.A00(this.A00, medium, userSession, r3, this.A04, this.A05, this.A06, this.A07, r8, false);
    }
}
