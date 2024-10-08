package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.6Mt  reason: invalid class name and case insensitive filesystem */
public final class C306596Mt implements C316076l4 {
    public C250973mM A00;
    public C309426Yf A01;
    public boolean A02;
    public C74500Pvu A03;
    public final View A04;
    public final View A05;
    public final C316146lB A06;
    public final C316246lL A07;

    public C306596Mt(ViewGroup viewGroup, UserSession userSession) {
        0qQ.A0B(viewGroup, 1);
        this.A05 = viewGroup;
        View requireViewById = viewGroup.requireViewById(R.id.netego_toolbar_buttons_container);
        0qQ.A07(requireViewById);
        this.A04 = requireViewById;
        View requireViewById2 = viewGroup.requireViewById(R.id.cta_button_container);
        0qQ.A07(requireViewById2);
        this.A06 = new C316146lB(requireViewById2, userSession);
        View requireViewById3 = viewGroup.requireViewById(R.id.cta_shuffle_button_container);
        0qQ.A07(requireViewById3);
        View requireViewById4 = viewGroup.requireViewById(R.id.cta_shuffle_button_dwell_container);
        0qQ.A07(requireViewById4);
        this.A07 = new C316246lL((ViewStub) requireViewById3, (ViewStub) requireViewById4, userSession);
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C74500Pvu AjF() {
        /*
            r2 = this;
            boolean r0 = r2.A02
            X.Pvu r1 = r2.A03
            if (r0 == 0) goto L_0x001d
            boolean r0 = r1 instanceof X.AnonymousClass6KV
            if (r0 != 0) goto L_0x0015
            X.6lL r0 = r2.A07
            X.6KV r1 = new X.6KV
            r1.<init>(r0)
        L_0x0011:
            X.Pvu r1 = (X.C74500Pvu) r1
            r2.A03 = r1
        L_0x0015:
            if (r1 == 0) goto L_0x001c
            X.6Yf r0 = r2.A01
            r1.Ehz(r0)
        L_0x001c:
            return r1
        L_0x001d:
            boolean r0 = r1 instanceof X.C66952Mfl
            if (r0 != 0) goto L_0x0015
            X.6lB r0 = r2.A06
            X.Mfl r1 = new X.Mfl
            r1.<init>(r0)
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C306596Mt.AjF():X.Pvu");
    }
}
