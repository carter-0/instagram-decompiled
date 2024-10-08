package X;

import android.view.ViewGroup;
import com.google.common.collect.SingletonImmutableSet;
import com.instagram.common.session.UserSession;

/* renamed from: X.WjY  reason: case insensitive filesystem */
public final class C20013WjY implements Runnable {
    public final /* synthetic */ UYt A00;

    public C20013WjY(UYt uYt) {
        this.A00 = uYt;
    }

    public final void run() {
        UYt uYt = this.A00;
        if (uYt.mView != null) {
            AnonymousClass80D r3 = new AnonymousClass80D();
            C41837B2s b2s = uYt.A02;
            b2s.getClass();
            r3.A0l = b2s;
            UserSession A0l = AnonymousClass7TE.A0l(uYt.A04);
            A0l.getClass();
            r3.A0S = A0l;
            r3.A05 = uYt.requireActivity();
            r3.A0M = uYt;
            0sl r1 = 0sl.A00;
            AnonymousClass80J r5 = AnonymousClass80J.A00;
            AnonymousClass80H A002 = AnonymousClass80I.A00(r1, new SingletonImmutableSet(r5));
            A002.getClass();
            r3.A0W = A002;
            r3.A3h = true;
            r3.A0R = uYt.volumeKeyPressController;
            AnonymousClass80C r0 = uYt.A01;
            r0.getClass();
            r3.A0t = r0;
            ViewGroup viewGroup = (ViewGroup) uYt.A03.getValue();
            viewGroup.getClass();
            r3.A09 = viewGroup;
            r3.A0B = 28D.A0c;
            r3.A0O = uYt;
            r3.A3H = true;
            r3.A3t = false;
            r3.A3s = false;
            r3.A28 = AnonymousClass05K.A1I;
            r3.A44 = false;
            r3.A3L = false;
            r3.A3Q = false;
            r3.A3P = true;
            r3.A3i = false;
            r3.A35 = false;
            r3.A3G = false;
            r3.A3j = true;
            r3.A3Z = true;
            r3.A36 = false;
            r3.A26 = 1;
            r3.A0V = C358098aM.A00(r5, new C358088aL[0]);
            r3.A0g = new WUK();
            uYt.A00 = new AnonymousClass80Q(r3);
        }
    }
}
