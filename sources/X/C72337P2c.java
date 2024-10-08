package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.mixed.DirectMsysMixedThreadKey;

/* renamed from: X.P2c  reason: case insensitive filesystem */
public final class C72337P2c implements C74394PuA {
    public final UserSession A00;
    public final N4P A01;
    public final Context A02;
    public final Fragment A03;
    public final boolean A04;

    public C72337P2c(Context context, Fragment fragment, UserSession userSession, N4P n4p, boolean z) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = n4p;
        this.A03 = fragment;
        this.A02 = context;
        this.A04 = z;
    }

    public final boolean isEnabled() {
        N4P n4p = this.A01;
        if ((!(n4p.A08() instanceof DirectThreadKey) && !(n4p.A08() instanceof DirectMsysMixedThreadKey)) || C66640Ma9.A03(n4p) || AnonymousClass48O.A04(n4p.A09)) {
            return false;
        }
        if (DbY.A1Z(0Tu.A05, this.A00, 36329736787476782L)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003c, code lost:
        if (com.instagram.direct.lockedchat.LockedChatKillSwitch.isLockedChatEnabled(r10.A00, false) == false) goto L_0x003e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List getItems() {
        /*
            r10 = this;
            r3 = 2131963815(0x7f132fa7, float:1.9564394E38)
            X.N4P r9 = r10.A01
            int r0 = r9.A03
            r5 = 0
            r8 = 1
            boolean r2 = X.AnonymousClass7TF.A1S(r0, r8)
            r1 = 18
            X.OlD r0 = new X.OlD
            r0.<init>(r10, r1)
            X.PR9 r4 = new X.PR9
            r4.<init>((android.widget.CompoundButton.OnCheckedChangeListener) r0, (int) r3, (boolean) r2)
            r0 = 2131963809(0x7f132fa1, float:1.9564382E38)
            r4.A02 = r0
            androidx.fragment.app.Fragment r7 = r10.A03
            android.content.Context r3 = r7.requireContext()
            X.Q2C r0 = X.Q2C.A03
            if (r0 != 0) goto L_0x002f
            X.Q2C r0 = new X.Q2C
            r0.<init>(r3)
            X.Q2C.A03 = r0
        L_0x002f:
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x003e
            com.instagram.common.session.UserSession r0 = r10.A00
            boolean r0 = com.instagram.direct.lockedchat.LockedChatKillSwitch.isLockedChatEnabled(r0, r5)
            r2 = 1
            if (r0 != 0) goto L_0x003f
        L_0x003e:
            r2 = 0
        L_0x003f:
            boolean r1 = r9.A13
            boolean r0 = r10.A04
            r5 = 0
            if (r1 == 0) goto L_0x00a5
            r0 = 2131963814(0x7f132fa6, float:1.9564392E38)
            if (r2 == 0) goto L_0x004e
            r0 = 2131963813(0x7f132fa5, float:1.956439E38)
        L_0x004e:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
        L_0x0052:
            int r0 = r9.A02
            boolean r2 = X.AnonymousClass7TF.A1S(r0, r8)
            boolean r1 = r9.A0k
            X.4li r0 = r9.A0H
            boolean r0 = r0.A08
            if (r2 != 0) goto L_0x0064
            if (r1 != 0) goto L_0x0064
            if (r0 == 0) goto L_0x0080
        L_0x0064:
            if (r6 == 0) goto L_0x0080
            r4.A0D = r8
            r4.A0F = r8
            int r0 = r6.intValue()
            java.lang.String r0 = X.DbU.A0m(r7, r0)
            android.text.SpannableStringBuilder r0 = X.DbS.A0C(r0)
            X.FGF r5 = new X.FGF
            r5.<init>((android.text.SpannableStringBuilder) r0)
            r0 = 2132017969(0x7f140331, float:1.9674231E38)
            r5.A01 = r0
        L_0x0080:
            com.instagram.common.ui.base.IgView r2 = new com.instagram.common.ui.base.IgView
            r2.<init>(r3)
            r1 = -1
            r0 = 16
            X.C66581MXm.A1B(r2, r1, r0)
            r0 = 2130970294(0x7f0406b6, float:1.7549294E38)
            int r0 = X.2Yu.A0H(r3, r0)
            X.DbT.A16(r3, r2, r0)
            if (r5 == 0) goto L_0x00a0
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r4, r5}
        L_0x009b:
            java.util.List r0 = X.0sr.A1P(r0)
            return r0
        L_0x00a0:
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r4}
            goto L_0x009b
        L_0x00a5:
            if (r0 == 0) goto L_0x00b0
            r0 = 2131963810(0x7f132fa2, float:1.9564384E38)
            if (r2 == 0) goto L_0x004e
            r0 = 2131963812(0x7f132fa4, float:1.9564388E38)
            goto L_0x004e
        L_0x00b0:
            if (r2 == 0) goto L_0x00b6
            r0 = 2131963811(0x7f132fa3, float:1.9564386E38)
            goto L_0x004e
        L_0x00b6:
            r6 = r5
            goto L_0x0052
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72337P2c.getItems():java.util.List");
    }
}
