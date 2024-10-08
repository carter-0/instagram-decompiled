package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class HK7 extends HK8 {
    public View A00;
    public IgLinearLayout A01;
    public IgLinearLayout A02;
    public IgTextView A03;
    public IgdsMediaButton A04;
    public C227232is A05;
    public final AnonymousClass0iw A06;
    public final UserSession A07;
    public final C55470HiE A08;
    public final GCB A09;
    public final boolean A0A;
    public final GD6 A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        if (X.182.A06(X.0Tu.A05, r4.A07, 36328263614545064L) != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
        X.AnonymousClass7TH.A0R(r4.A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005b, code lost:
        if (X.182.A06(X.0Tu.A05, r4.A07, 36328263614938285L) != false) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A04(boolean r5, boolean r6) {
        /*
            r4 = this;
            if (r6 == 0) goto L_0x0037
            boolean r0 = r4.A0A
            if (r0 == 0) goto L_0x0037
        L_0x0006:
            r2 = 0
            android.view.View r0 = r4.A00
            if (r5 == 0) goto L_0x002b
            if (r0 == 0) goto L_0x002a
            android.content.Context r1 = r0.getContext()
            if (r1 == 0) goto L_0x002a
            r0 = 2131956102(0x7f131186, float:1.954875E38)
        L_0x0016:
            java.lang.String r1 = r1.getString(r0)
            if (r1 == 0) goto L_0x002a
            com.instagram.igds.components.mediabutton.IgdsMediaButton r0 = r4.A04
            if (r0 == 0) goto L_0x0023
            r0.setVisibility(r2)
        L_0x0023:
            com.instagram.igds.components.mediabutton.IgdsMediaButton r0 = r4.A04
            if (r0 == 0) goto L_0x002a
            r0.setLabel(r1)
        L_0x002a:
            return
        L_0x002b:
            if (r0 == 0) goto L_0x002a
            android.content.Context r1 = r0.getContext()
            if (r1 == 0) goto L_0x002a
            r0 = 2131956095(0x7f13117f, float:1.9548736E38)
            goto L_0x0016
        L_0x0037:
            if (r5 != 0) goto L_0x004e
            com.instagram.common.session.UserSession r3 = r4.A07
            X.0Tu r2 = X.0Tu.A05
            r0 = 36328263614545064(0x81105d000d3ca8, double:3.0374784197898944E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x004e
        L_0x0048:
            com.instagram.igds.components.mediabutton.IgdsMediaButton r0 = r4.A04
            X.AnonymousClass7TH.A0R(r0)
            return
        L_0x004e:
            com.instagram.common.session.UserSession r3 = r4.A07
            X.0Tu r2 = X.0Tu.A05
            r0 = 36328263614938285(0x81105d00133cad, double:3.037478420038569E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0006
            goto L_0x0048
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HK7.A04(boolean, boolean):void");
    }

    public HK7(AnonymousClass0iw r1, UserSession userSession, C55470HiE hiE, GD6 gd6, GCB gcb, boolean z) {
        this.A0B = gd6;
        this.A07 = userSession;
        this.A06 = r1;
        this.A08 = hiE;
        this.A09 = gcb;
        this.A0A = z;
    }

    public static final C267324bN A00(HK7 hk7) {
        int intValue;
        Integer A082 = C52050GCw.A08(hk7);
        if (A082 == null || (intValue = A082.intValue()) < 0) {
            return null;
        }
        C52009GBg gBg = hk7.A0B.A0A;
        if (intValue < gBg.A0A()) {
            return gBg.A0E(intValue);
        }
        return null;
    }

    public static final Integer A01(HK7 hk7) {
        String str;
        List A022 = A02(hk7);
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : A022) {
            UserSession userSession = hk7.A07;
            User CCd = ((C2809354u) next).CCd();
            if (CCd != null) {
                str = AnonymousClass3ZA.A00(CCd);
            } else {
                str = null;
            }
            DbV.A1U(next, A1C, 2R8.A05(userSession, str) ? 1 : 0);
        }
        if (A1C.size() > 1) {
            if (182.A06(0Tu.A05, hk7.A07, 36328263614217379L)) {
                return AnonymousClass05K.A0C;
            }
        }
        List<C2809354u> A023 = A02(hk7);
        if (!(A023 instanceof Collection) || !A023.isEmpty()) {
            for (C2809354u CCd2 : A023) {
                if (2R8.A05(hk7.A07, AnonymousClass3ZA.A00(CCd2.CCd()))) {
                    return AnonymousClass05K.A01;
                }
            }
        }
        return AnonymousClass05K.A00;
    }

    public static final List A02(HK7 hk7) {
        1Xj r0;
        List A3b;
        C267324bN A002 = A00(hk7);
        if (A002 == null || (r0 = A002.A02) == null || (A3b = r0.A3b()) == null) {
            return 0sn.A00;
        }
        return A3b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        if (r2 == null) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.HK7 r6) {
        /*
            X.4bN r3 = A00(r6)
            r4 = 0
            if (r3 == 0) goto L_0x0027
            r2 = 0
            X.1Xj r0 = r3.A02
            if (r0 == 0) goto L_0x0010
            java.util.List r2 = r0.A3b()
        L_0x0010:
            X.5o2 r1 = r3.A01
            X.5o2 r0 = X.C295365o2.PREVIEW
            if (r1 == r0) goto L_0x0027
            X.5o2 r0 = X.C295365o2.GHOST
            if (r1 == r0) goto L_0x0027
            boolean r0 = X.AnonymousClass3ZC.A0B(r3)
            if (r0 != 0) goto L_0x0027
            X.5o2 r0 = X.C295365o2.MIDCARD
            if (r1 == r0) goto L_0x0027
            r5 = 1
            if (r2 != 0) goto L_0x0028
        L_0x0027:
            r5 = 0
        L_0x0028:
            java.util.List r0 = A02(r6)
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r0.iterator()
        L_0x0034:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x004a
            java.lang.Object r0 = r1.next()
            X.54u r0 = (X.C2809354u) r0
            com.instagram.user.model.User r0 = r0.CCd()
            if (r0 == 0) goto L_0x0034
            r3.add(r0)
            goto L_0x0034
        L_0x004a:
            boolean r0 = r3.isEmpty()
            r2 = 1
            r0 = r0 ^ 1
            if (r5 == 0) goto L_0x010a
            if (r0 == 0) goto L_0x00eb
            java.lang.Integer r1 = A01(r6)
            android.view.View r0 = r6.A00
            if (r0 == 0) goto L_0x0060
            r0.setVisibility(r4)
        L_0x0060:
            int r1 = r1.intValue()
            if (r1 == r4) goto L_0x0084
            r0 = 2
            if (r1 == r0) goto L_0x00a1
            com.instagram.common.ui.base.IgLinearLayout r0 = r6.A02
            r1 = 8
            if (r0 == 0) goto L_0x0072
            r0.setVisibility(r1)
        L_0x0072:
            com.instagram.common.ui.base.IgTextView r0 = r6.A03
            if (r0 == 0) goto L_0x0079
            r0.setVisibility(r1)
        L_0x0079:
            com.instagram.common.ui.base.IgLinearLayout r0 = r6.A01
            if (r0 == 0) goto L_0x0080
            r0.setVisibility(r1)
        L_0x0080:
            r6.A04(r2, r4)
        L_0x0083:
            return
        L_0x0084:
            java.lang.Object r0 = X.00k.A0I(r3)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r3 = r0.B8Q()
            android.view.View r0 = r6.A00
            r2 = 0
            if (r0 == 0) goto L_0x00b3
            android.content.Context r1 = r0.getContext()
            if (r1 == 0) goto L_0x00b3
            r0 = 2131956104(0x7f131188, float:1.9548754E38)
            java.lang.String r2 = X.DbW.A0h(r1, r3, r0)
            goto L_0x00b3
        L_0x00a1:
            android.view.View r0 = r6.A00
            r2 = 0
            if (r0 == 0) goto L_0x00b3
            android.content.Context r1 = r0.getContext()
            if (r1 == 0) goto L_0x00b3
            r0 = 2131956103(0x7f131187, float:1.9548752E38)
            java.lang.String r2 = r1.getString(r0)
        L_0x00b3:
            com.instagram.common.ui.base.IgTextView r0 = r6.A03
            if (r0 == 0) goto L_0x00ba
            r0.setVisibility(r4)
        L_0x00ba:
            com.instagram.common.ui.base.IgLinearLayout r0 = r6.A02
            if (r0 == 0) goto L_0x00c1
            r0.setVisibility(r4)
        L_0x00c1:
            if (r2 == 0) goto L_0x00d1
            com.instagram.common.ui.base.IgTextView r0 = r6.A03
            if (r0 == 0) goto L_0x00ca
            r0.setVisibility(r4)
        L_0x00ca:
            com.instagram.common.ui.base.IgTextView r0 = r6.A03
            if (r0 == 0) goto L_0x00d1
            r0.setText(r2)
        L_0x00d1:
            r6.A04(r4, r4)
            com.instagram.common.session.UserSession r3 = r6.A07
            X.0Tu r2 = X.0Tu.A05
            r0 = 36328263614872748(0x81105d00123cac, double:3.037478419997123E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0083
            com.instagram.common.ui.base.IgLinearLayout r0 = r6.A01
            if (r0 == 0) goto L_0x0083
            r0.setVisibility(r4)
            return
        L_0x00eb:
            boolean r0 = r6.A0A
            if (r0 == 0) goto L_0x010a
            com.instagram.common.ui.base.IgLinearLayout r0 = r6.A02
            r1 = 8
            if (r0 == 0) goto L_0x00f8
            r0.setVisibility(r1)
        L_0x00f8:
            com.instagram.common.ui.base.IgTextView r0 = r6.A03
            if (r0 == 0) goto L_0x00ff
            r0.setVisibility(r1)
        L_0x00ff:
            com.instagram.common.ui.base.IgLinearLayout r0 = r6.A01
            if (r0 == 0) goto L_0x0106
            r0.setVisibility(r1)
        L_0x0106:
            r6.A04(r4, r2)
            return
        L_0x010a:
            android.view.View r0 = r6.A00
            X.AnonymousClass7TH.A0R(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HK7.A03(X.HK7):void");
    }

    public final void DW8(int i, int i2) {
        A03(this);
    }
}
