package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.P2i  reason: case insensitive filesystem */
public final class C72343P2i implements C74394PuA {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final N4P A02;
    public final Context A03;
    public final Capabilities A04;
    public final 1Av A05;

    public C72343P2i(Context context, FragmentActivity fragmentActivity, UserSession userSession, Capabilities capabilities, N4P n4p, 1Av r7) {
        DbW.A1O(userSession, 3, r7);
        this.A00 = fragmentActivity;
        this.A03 = context;
        this.A01 = userSession;
        this.A02 = n4p;
        this.A04 = capabilities;
        this.A05 = r7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        if (r4.A21() == false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List getItems() {
        /*
            r7 = this;
            X.N4P r2 = r7.A02
            X.3sy r1 = r2.A08()
            com.instagram.model.direct.DirectThreadKey r0 = X.C66647MaG.A04(r1)
            if (r0 == 0) goto L_0x0078
            java.lang.String r6 = X.C66647MaG.A09(r1)
        L_0x0010:
            if (r6 == 0) goto L_0x0085
            boolean r5 = r2.A0g
            X.1Av r4 = r7.A05
            X.0s0 r2 = r4.A62
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 200(0xc8, float:2.8E-43)
            boolean r0 = X.AnonymousClass7TG.A1a(r4, r2, r1, r0)
            r3 = 0
            if (r0 == 0) goto L_0x002a
            boolean r0 = r4.A21()
            r2 = 1
            if (r0 != 0) goto L_0x002b
        L_0x002a:
            r2 = 0
        L_0x002b:
            r1 = 2131959043(0x7f131d03, float:1.9554715E38)
            if (r2 == 0) goto L_0x0033
            if (r5 == 0) goto L_0x0033
            r3 = 1
        L_0x0033:
            X.Ol3 r0 = new X.Ol3
            r0.<init>(r7, r6, r2)
            X.PR9 r6 = new X.PR9
            r6.<init>((android.widget.CompoundButton.OnCheckedChangeListener) r0, (int) r1, (boolean) r3)
            android.content.Context r1 = r7.A03
            r0 = 2131959042(0x7f131d02, float:1.9554713E38)
            android.text.SpannableStringBuilder r5 = X.DbW.A08(r1, r0)
            r0 = 1
            r6.A0C = r0
            r0 = 2131964884(0x7f1333d4, float:1.9566562E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r1, r0)
            java.lang.String r0 = " "
            r5.append(r0)
            int r4 = r5.length()
            android.text.SpannableStringBuilder r3 = r5.append(r1)
            androidx.fragment.app.FragmentActivity r0 = r7.A00
            int r0 = X.2Yu.A06(r0)
            X.Ngx r2 = new X.Ngx
            r2.<init>((X.C72343P2i) r7, (int) r0)
            int r1 = r5.length()
            r0 = 33
            r3.setSpan(r2, r4, r1, r0)
            r6.A0A = r5
            java.util.List r0 = X.AnonymousClass7TE.A1I(r6)
            return r0
        L_0x0078:
            boolean r0 = r1 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            if (r0 == 0) goto L_0x0085
            com.instagram.model.direct.threadkey.impl.MsysThreadId r1 = (com.instagram.model.direct.threadkey.impl.MsysThreadId) r1
            long r0 = r1.A00
            java.lang.String r6 = java.lang.String.valueOf(r0)
            goto L_0x0010
        L_0x0085:
            java.lang.String r0 = "Expected threadId"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72343P2i.getItems():java.util.List");
    }

    public final boolean isEnabled() {
        String valueOf;
        C70733OIq oIq = P2L.A00;
        UserSession userSession = this.A01;
        N4P n4p = this.A02;
        Capabilities capabilities = this.A04;
        if (oIq.A00(userSession, capabilities, n4p) && C69953Nut.A00(userSession, capabilities, n4p)) {
            C254743sy A08 = n4p.A08();
            if (C66647MaG.A04(A08) != null) {
                valueOf = C66647MaG.A09(A08);
            } else if (A08 instanceof MsysThreadId) {
                valueOf = String.valueOf(((MsysThreadId) A08).A00);
            }
            if (valueOf == null) {
                return false;
            }
            return true;
        }
        return false;
    }
}
