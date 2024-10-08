package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.2oD  reason: invalid class name */
public final class AnonymousClass2oD implements C252213ok, AnonymousClass2oE {
    public int A00;
    public int A01 = -1;
    public Integer A02;
    public String A03;
    public final Fragment A04;
    public final 1Ng A05;
    public final AnonymousClass4DV A06;
    public final UserSession A07;
    public final AnonymousClass4DU A08;

    public AnonymousClass2oD(Fragment fragment, UserSession userSession, AnonymousClass4DU r4, AnonymousClass4DV r5) {
        0qQ.A0B(r5, 2);
        0qQ.A0B(userSession, 3);
        this.A04 = fragment;
        this.A06 = r5;
        this.A07 = userSession;
        this.A08 = r4;
        this.A05 = AnonymousClass1Nd.A00(userSession);
        A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x010a, code lost:
        if (r0 > 0) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DKl(X.1Xj r19, X.AnonymousClass3W1 r20) {
        /*
            r18 = this;
            r7 = 0
            r1 = r19
            X.0qQ.A0B(r1, r7)
            r2 = 1
            r5 = r20
            X.0qQ.A0B(r5, r2)
            r3 = r18
            androidx.fragment.app.Fragment r4 = r3.A04
            androidx.fragment.app.FragmentActivity r0 = r4.getActivity()
            if (r0 == 0) goto L_0x0103
            java.lang.String r9 = r1.getId()
            if (r9 == 0) goto L_0x0103
            X.37E r1 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r0 = r4.getActivity()
            X.37D r12 = r1.A01(r0)
            if (r12 == 0) goto L_0x0103
            android.view.View r0 = r4.mView
            if (r0 == 0) goto L_0x002f
            X.0nA.A0N(r0)
        L_0x002f:
            r3.A03 = r9
            java.lang.String r6 = ""
            com.instagram.common.session.UserSession r11 = r3.A07
            X.7a2 r0 = X.C333727a1.A00(r11)
            java.util.Map r0 = r0.A00
            java.lang.Object r1 = r0.get(r9)
            X.9JD r1 = (X.AnonymousClass9JD) r1
            if (r1 == 0) goto L_0x0104
            java.lang.String r0 = r1.A02
            if (r0 != 0) goto L_0x0104
            java.lang.Object r1 = r1.A01
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
        L_0x004b:
            r6 = r1
        L_0x004c:
            X.HFR r0 = new X.HFR
            r0.<init>(r3)
            r12.A0Q(r0)
            X.GPw r0 = new X.GPw
            r0.<init>(r2, r2, r7)
            r12.A0O(r0)
            X.1Y4 r0 = X.C3018960m.A00()
            r0.A00()
            X.4DU r10 = r3.A08
            java.lang.String r8 = "main_feed"
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r1 = r11.A05
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            r4.putString(r0, r1)
            java.lang.String r1 = r10.getModuleName()
            r0 = 897(0x381, float:1.257E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.putString(r0, r1)
            boolean r1 = r10.isOrganicEligible()
            r0 = 894(0x37e, float:1.253E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.putBoolean(r0, r1)
            boolean r1 = r10.isSponsoredEligible()
            r0 = 895(0x37f, float:1.254E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.putBoolean(r0, r1)
            r0 = 2174(0x87e, float:3.046E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.putString(r0, r9)
            r0 = 892(0x37c, float:1.25E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.putString(r0, r8)
            X.0qQ.A0B(r6, r7)
            r0 = 2171(0x87b, float:3.042E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.putCharSequence(r0, r6)
            boolean r1 = r5.A2V
            r0 = 2172(0x87c, float:3.044E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.putBoolean(r0, r1)
            int r1 = r5.getPosition()
            r0 = 2175(0x87f, float:3.048E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.putInt(r0, r1)
            int r1 = r5.A03
            r0 = 2173(0x87d, float:3.045E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.putInt(r0, r1)
            int r1 = r5.A0W
            r0 = 2176(0x880, float:3.049E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.putInt(r0, r1)
            X.H1V r13 = new X.H1V
            r13.<init>()
            r13.setArguments(r4)
            java.lang.Integer r14 = X.AnonymousClass05K.A00
            r15 = 255(0xff, float:3.57E-43)
            r16 = r15
            r17 = r2
            r12.A0N(r13, r14, r15, r16, r17)
            X.1Ng r1 = r3.A05
            X.INq r0 = new X.INq
            r0.<init>(r2)
            r1.A05(r0)
        L_0x0103:
            return
        L_0x0104:
            java.lang.String r1 = r5.A1J
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x004c
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2oD.DKl(X.1Xj, X.3W1):void");
    }

    private final void A00() {
        Context context = this.A04.getContext();
        if (context != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            if (theme != null) {
                theme.resolveAttribute(0Pn.A01(this.A07), typedValue, true);
            }
            this.A02 = Integer.valueOf((int) typedValue.getDimension(context.getResources().getDisplayMetrics()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        r4 = r7.A06;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DMr(int r8, boolean r9) {
        /*
            r7 = this;
            r7.A00 = r8
            X.4DU r0 = r7.A08
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "feed_contextual_chain"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001f
            com.instagram.common.session.UserSession r3 = r7.A07
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317869792827001(0x8106e900001679, double:3.0309053250828306E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x00b3
        L_0x001f:
            java.lang.Integer r0 = r7.A02
            if (r0 != 0) goto L_0x0026
            r7.A00()
        L_0x0026:
            java.lang.String r6 = r7.A03
            if (r6 == 0) goto L_0x00b3
            int r0 = r7.A00
            if (r0 <= 0) goto L_0x00b3
            X.4DV r4 = r7.A06
            X.3Ar r5 = r4.getScrollingViewProxy()
            if (r5 == 0) goto L_0x00b3
            r3 = 0
            int r2 = r5.AnH()
        L_0x003b:
            if (r3 >= r2) goto L_0x00b3
            android.view.View r0 = r5.AnC(r3)
            java.lang.Object r0 = r0.getTag()
            X.3s4 r1 = X.C253923rd.A0C(r0)
            X.3s4 r0 = X.C254183s4.MEDIA_INLINE_COMPOSER_BUTTON
            if (r1 != r0) goto L_0x00b8
            android.view.View r0 = r5.AnC(r3)
            java.lang.Object r1 = r0.getTag()
            r1.getClass()
            X.3Oz r1 = (X.C241383Oz) r1
            X.9J0 r0 = r1.A01
            if (r0 == 0) goto L_0x00b8
            X.9J0 r0 = r1.A01
            if (r0 == 0) goto L_0x00b6
            java.lang.String r0 = r0.A01
        L_0x0064:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x00b8
            int r0 = r5.B6L()
            int r3 = r3 + r0
            if (r3 < 0) goto L_0x00b3
            int r0 = r7.A01
            if (r0 >= 0) goto L_0x0095
            androidx.fragment.app.Fragment r0 = r7.A04
            android.content.Context r0 = r0.requireContext()
            android.content.res.Resources r2 = r0.getResources()
            X.0qQ.A07(r2)
            r0 = 2131165250(0x7f070042, float:1.7944712E38)
            int r1 = r2.getDimensionPixelSize(r0)
            r0 = 2131165293(0x7f07006d, float:1.79448E38)
            int r0 = r2.getDimensionPixelSize(r0)
            int r0 = r0 * 2
            int r1 = r1 + r0
            r7.A01 = r1
        L_0x0095:
            X.3Ar r2 = r4.getScrollingViewProxy()
            android.view.ViewGroup r0 = r2.CEd()
            int r1 = r0.getMeasuredHeight()
            int r0 = r7.A00
            int r1 = r1 - r0
            int r0 = r7.A01
            int r1 = r1 - r0
            java.lang.Integer r0 = r7.A02
            if (r0 == 0) goto L_0x00b4
            int r0 = r0.intValue()
        L_0x00af:
            int r1 = r1 + r0
            r2.Evr(r3, r1)
        L_0x00b3:
            return
        L_0x00b4:
            r0 = 0
            goto L_0x00af
        L_0x00b6:
            r0 = 0
            goto L_0x0064
        L_0x00b8:
            int r3 = r3 + 1
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2oD.DMr(int, boolean):void");
    }
}
