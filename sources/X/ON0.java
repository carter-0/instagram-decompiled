package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import java.util.ArrayList;

public final class ON0 {
    public C46539Dgg A00;
    public AnonymousClass7L2 A01;
    public C70703OGy A02;
    public OFH A03;
    public final Context A04;
    public final UserSession A05;
    public final Capabilities A06;
    public final AnonymousClass7TO A07;
    public final AnonymousClass9HO A08;
    public final AnonymousClass7X9 A09;
    public final AnonymousClass9HC A0A;
    public final AnonymousClass9HC A0B;
    public final C62320sa A0C;
    public final C62320sa A0D;

    /* JADX WARNING: type inference failed for: r1v1, types: [X.OSC, java.lang.Object] */
    public final OFH A00() {
        OFH ofh = this.A03;
        if (ofh != null) {
            return ofh;
        }
        AnonymousClass0t1 r12 = (AnonymousClass0t1) this.A0D.invoke();
        Context context = this.A04;
        UserSession userSession = this.A05;
        AnonymousClass7L2 r9 = this.A01;
        String str = "directMessageThreadTheme";
        if (r9 != null) {
            Capabilities capabilities = this.A06;
            AnonymousClass9HC r8 = this.A0B;
            C46539Dgg dgg = this.A00;
            if (dgg == null) {
                str = "msysUpdateThreadStateData";
            } else {
                AnonymousClass9HO r7 = this.A08;
                ArrayList A1C = AnonymousClass7TE.A1C();
                A1C.add(new PCD(context, dgg, userSession, r7, r8, r9));
                A1C.add(new PCG(dgg, r8, r9));
                A1C.add(new PCF(r8, r9));
                if (capabilities.A00(C376179Gx.SEEN_INDICATOR)) {
                    A1C.add(new PCE(r8, r9));
                }
                A1C.add(new Object());
                C70468O7t o7t = new C70468O7t(A1C);
                AnonymousClass7L2 r0 = this.A01;
                if (r0 != null) {
                    OFH ofh2 = new OFH(new OFI(capabilities, r0.A04, r12, C73920Pm0.A01(this, 46), C73920Pm0.A01(this, 47)), new Object(), new C70466O7r(r12), o7t);
                    this.A03 = ofh2;
                    return ofh2;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A01(C46539Dgg dgg, AnonymousClass7L2 r3) {
        this.A01 = r3;
        this.A00 = dgg;
        this.A03 = null;
        this.A02 = null;
    }

    public ON0(Context context, UserSession userSession, Capabilities capabilities, AnonymousClass7TO r4, AnonymousClass9HO r5, AnonymousClass7X9 r6, AnonymousClass9HC r7, AnonymousClass9HC r8, C62320sa r9, C62320sa r10) {
        this.A04 = context;
        this.A05 = userSession;
        this.A0C = r9;
        this.A0D = r10;
        this.A06 = capabilities;
        this.A0B = r7;
        this.A0A = r8;
        this.A07 = r4;
        this.A09 = r6;
        this.A08 = r5;
    }
}
