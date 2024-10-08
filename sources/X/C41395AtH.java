package X;

import android.content.Context;
import com.facebook.onecamera.configurations.AppSpecific;
import com.instagram.common.session.UserSession;
import org.webrtc.EglBase;

/* renamed from: X.AtH  reason: case insensitive filesystem */
public final class C41395AtH implements AnonymousClass0eK {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C41452AuC A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public C41395AtH(C41452AuC auC, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A01 = auC;
        this.A00 = i;
        this.A04 = z;
        this.A03 = z2;
        this.A02 = z3;
        this.A05 = z4;
        this.A06 = z5;
    }

    /* JADX WARNING: type inference failed for: r8v4, types: [X.ARL, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object get() {
        C382479dl r10;
        C41452AuC auC = this.A01;
        Context context = auC.A00;
        UserSession userSession = auC.A02;
        AR0 ar0 = auC.A01;
        int i = this.A00;
        Object obj = EglBase.lock;
        boolean z = this.A04;
        boolean z2 = this.A03;
        boolean z3 = this.A02;
        boolean z4 = this.A05;
        String str = auC.A03;
        if (this.A06) {
            r10 = new C382479dl(userSession);
        } else {
            r10 = null;
        }
        boolean z5 = auC.A04;
        0qQ.A0B(ar0, 2);
        C343647qZ r2 = new C343647qZ("instagram_vc");
        r2.A02(C343677qc.A00, userSession);
        r2.A02(C345757u2.A01, false);
        C343647qZ.A00(r2, C345757u2.A02, z3);
        C343647qZ.A00(r2, C345757u2.A03, !z3);
        C343647qZ.A00(r2, B36.A04, z);
        r2.A02(B36.A01, true);
        r2.A02(C345167t2.A00, true);
        r2.A02(C343737qi.A02, obj);
        r2.A02(C343657qa.A03, str);
        C343647qZ.A00(r2, C343657qa.A01, z5);
        r2.A02(C341297me.A01, false);
        C343657qa r9 = new C343657qa(r2);
        C340267kz.A02 = true;
        ? obj2 = new Object();
        ATC A002 = ADN.A00.A00(context, r9, new C343807qq(AppSpecific.class), new C40160AUa(obj2, r9, r10, ar0, i, z4, z2));
        obj2.A00 = A002;
        C40161AUb aUb = new C40161AUb(A002);
        C40161AUb.A00(aUb).ElS(new C40178AUs());
        return aUb;
    }
}
