package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import java.util.List;

public final class PB4 implements AnonymousClass7D2 {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final AnonymousClass7Ws A02;
    public final AnonymousClass7ZJ A03;
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A00(0eO.A02, new C73909Plk(this, 26));

    public PB4(AnonymousClass0iw r4, UserSession userSession, AnonymousClass7Ws r6) {
        0qQ.A0B(r4, 3);
        this.A02 = r6;
        this.A01 = userSession;
        this.A00 = r4;
        this.A03 = (AnonymousClass7ZJ) userSession.A01(AnonymousClass7ZJ.class, AnonymousClass7ZI.A00);
    }

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.generic_xma_vstack, viewGroup, false);
        0qQ.A0C(inflate, "null cannot be cast to non-null type com.instagram.common.ui.base.IgLinearLayout");
        return new PBN(layoutInflater, (IgLinearLayout) inflate);
    }

    public static final String A00(N8J n8j) {
        Long l = n8j.A01.A0Q;
        if (l == null) {
            return null;
        }
        long longValue = l.longValue();
        if (longValue == 1000) {
            return "GENAI_SUBSCRIPTION";
        }
        if (longValue == 1100) {
            return "GENAI_REMINDER";
        }
        return null;
    }

    public static final void A01(PB4 pb4, N8J n8j, boolean z) {
        C328667Fr r2 = n8j.A01;
        String str = r2.A0V;
        String valueOf = String.valueOf(r2.A0L.A02);
        if (str != null) {
            String str2 = r2.A08.A00;
            AnonymousClass7Ws r1 = pb4.A02;
            AnonymousClass7XD r3 = (AnonymousClass7XD) r1;
            C254793t3 r4 = r2.A0M;
            List list = n8j.A03;
            if (!z) {
                list = 00k.A0d(list, 3);
            }
            r3.Ch6(r4, str2, valueOf, str, ((AnonymousClass7XJ) r1).B20(), (String) null, list);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x00a0 A[EDGE_INSN: B:102:0x00a0->B:36:0x00a0 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0123 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void ADp(X.C328007Db r25, X.AnonymousClass7FW r26) {
        /*
            r24 = this;
            r6 = r26
            r7 = r25
            X.PBN r7 = (X.PBN) r7
            X.N8J r6 = (X.N8J) r6
            r5 = 0
            boolean r4 = X.AnonymousClass7TF.A1U(r5, r7, r6)
            X.7Fr r11 = r6.A01
            java.lang.Long r9 = r11.A0Q
            r12 = 8
            r8 = r24
            if (r9 == 0) goto L_0x0021
            long r13 = r9.longValue()
            r1 = 0
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
        L_0x0021:
            X.7ZJ r1 = r8.A03
            com.instagram.model.direct.messageid.DirectMessageIdentifier r0 = r11.A0L
            java.lang.String r0 = r0.A02
            boolean r0 = r1.A02(r0)
            if (r0 != 0) goto L_0x0033
        L_0x002d:
            com.instagram.common.ui.base.IgLinearLayout r0 = r7.A05
            r0.setVisibility(r12)
        L_0x0032:
            return
        L_0x0033:
            java.util.List r3 = r6.A03
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x002d
            r1 = 1000(0x3e8, double:4.94E-321)
            if (r9 == 0) goto L_0x011f
            long r9 = r9.longValue()
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x004d
            r1 = 1100(0x44c, double:5.435E-321)
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x011f
        L_0x004d:
            r23 = 1
        L_0x004f:
            com.instagram.common.ui.base.IgLinearLayout r2 = r7.A05
            r2.setVisibility(r5)
            X.7FE r1 = r6.A00
            android.graphics.drawable.Drawable r0 = r7.A00
            X.C3265577g.A06(r0, r2, r1, r4)
            java.lang.String r1 = r11.A0a
            if (r1 != 0) goto L_0x0061
            java.lang.String r1 = ""
        L_0x0061:
            boolean r0 = X.00l.A0W(r1)
            com.instagram.common.ui.base.IgTextView r10 = r7.A07
            if (r0 == 0) goto L_0x0117
            r10.setVisibility(r12)
        L_0x006c:
            java.lang.String r9 = r11.A0Z
            if (r9 == 0) goto L_0x0110
            boolean r0 = X.00l.A0W(r9)
            if (r0 != 0) goto L_0x0110
            com.instagram.common.ui.base.IgTextView r1 = r7.A06
            r1.setVisibility(r5)
            r1.setText(r9)
        L_0x007e:
            int r0 = r10.getVisibility()
            if (r0 != r12) goto L_0x010a
            int r0 = r1.getVisibility()
            if (r0 != r12) goto L_0x010a
            android.view.View r0 = r7.A02
            r0.setVisibility(r12)
        L_0x008f:
            android.view.ViewGroup r14 = r7.A03
            r14.removeAllViews()
            boolean r0 = r3 instanceof java.util.Collection
            r22 = 0
            if (r0 == 0) goto L_0x00ee
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x00ee
        L_0x00a0:
            r10 = 0
        L_0x00a1:
            com.instagram.common.session.UserSession r12 = r8.A01
            X.0Tu r9 = X.0Tu.A06
            r0 = 36609025625822996(0x820fb700001714, double:3.2150334462599344E-306)
            int r0 = X.DbS.A04(r9, r12, r0)
            java.util.Iterator r16 = X.C66581MXm.A10(r3, r0)
        L_0x00b2:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0123
            java.lang.Object r13 = r16.next()
            int r15 = r22 + 1
            if (r22 < 0) goto L_0x0228
            X.7Fr r13 = (X.C328667Fr) r13
            android.view.LayoutInflater r1 = r7.A01
            r0 = 2131625908(0x7f0e07b4, float:1.8879037E38)
            android.view.View r12 = X.DbT.A0D(r1, r2, r0, r5)
            X.0iw r0 = r8.A00
            X.C70019Nvx.A00(r12, r0, r13, r10)
            X.30J r0 = X.AnonymousClass30J.SECONDS
            long r0 = X.AnonymousClass30K.A03(r0, r4)
            X.Pmd r9 = new X.Pmd
            r21 = r7
            r20 = r6
            r19 = r8
            r18 = r13
            r17 = r9
            r17.<init>(r18, r19, r20, r21, r22, r23)
            X.AnonymousClass0mH.A00(r12, r9, r0)
            r14.addView(r12)
            r22 = r15
            goto L_0x00b2
        L_0x00ee:
            java.util.Iterator r1 = r3.iterator()
        L_0x00f2:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00a0
            java.lang.Object r0 = r1.next()
            X.7Fr r0 = (X.C328667Fr) r0
            java.util.List r0 = r0.A0c
            if (r0 == 0) goto L_0x00f2
            java.lang.Object r0 = X.00k.A0J(r0)
            if (r0 == 0) goto L_0x00f2
            r10 = 1
            goto L_0x00a1
        L_0x010a:
            android.view.View r0 = r7.A02
            r0.setVisibility(r5)
            goto L_0x008f
        L_0x0110:
            com.instagram.common.ui.base.IgTextView r1 = r7.A06
            r1.setVisibility(r12)
            goto L_0x007e
        L_0x0117:
            r10.setVisibility(r5)
            r10.setText(r1)
            goto L_0x006c
        L_0x011f:
            r23 = 0
            goto L_0x004f
        L_0x0123:
            com.instagram.common.ui.base.IgLinearLayout r12 = r7.A04
            r12.removeAllViews()
            java.util.List r0 = r11.A0b
            if (r0 == 0) goto L_0x0175
            java.util.Iterator r14 = r0.iterator()
            r19 = 0
        L_0x0132:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0175
            java.lang.Object r11 = r14.next()
            int r13 = r19 + 1
            if (r19 < 0) goto L_0x0228
            X.9JN r11 = (X.AnonymousClass9JN) r11
            android.view.LayoutInflater r1 = r7.A01
            r0 = 2131625907(0x7f0e07b3, float:1.8879035E38)
            android.view.View r10 = r1.inflate(r0, r2, r5)
            boolean r0 = r10 instanceof com.instagram.igds.components.button.IgdsButton
            if (r0 == 0) goto L_0x0175
            com.instagram.igds.components.button.IgdsButton r10 = (com.instagram.igds.components.button.IgdsButton) r10
            if (r10 == 0) goto L_0x0175
            java.lang.String r0 = r11.A04
            r10.setText((java.lang.String) r0)
            X.30J r0 = X.AnonymousClass30J.SECONDS
            long r0 = X.AnonymousClass30K.A03(r0, r4)
            X.PmX r9 = new X.PmX
            r15 = r9
            r16 = r11
            r17 = r8
            r18 = r6
            r20 = r23
            r15.<init>(r16, r17, r18, r19, r20)
            X.AnonymousClass0mH.A00(r10, r9, r0)
            r12.addView(r10)
            r19 = r13
            goto L_0x0132
        L_0x0175:
            A01(r8, r6, r5)
            if (r23 == 0) goto L_0x0032
            X.7LQ r0 = r6.A02
            X.3su r4 = r0.A0e
            X.0qQ.A07(r4)
            r5 = 10
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r3)
            java.util.Iterator r3 = r3.iterator()
        L_0x018b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01a9
            java.lang.Object r0 = r3.next()
            X.7Fr r0 = (X.C328667Fr) r0
            X.9J6 r0 = r0.A08
            java.lang.String r0 = r0.A01
            android.net.Uri r1 = android.net.Uri.parse(r0)
            java.lang.String r0 = "subscription_id"
            java.lang.String r0 = r1.getQueryParameter(r0)
            r2.add(r0)
            goto L_0x018b
        L_0x01a9:
            X.0eM r0 = r8.A04
            java.lang.Object r1 = r0.getValue()
            X.7I3 r1 = (X.AnonymousClass7I3) r1
            java.lang.String r9 = r4.A0g()
            java.lang.String r0 = r4.A1u
            X.0qQ.A07(r0)
            java.lang.Long r7 = X.00y.A0n(r5, r0)
            X.7AG r0 = r4.A0Q
            if (r0 == 0) goto L_0x0226
            java.lang.String r5 = r0.A05
        L_0x01c4:
            X.7Ws r0 = r8.A02
            X.7Wu r0 = (X.C332877Wu) r0
            java.lang.String r8 = r0.C6X()
            java.lang.String r3 = A00(r6)
            X.0wc r1 = r1.A01
            java.lang.String r0 = "direct_thread_link_impression"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x0032
            java.lang.String r0 = "GENAI_SUBSCRIPTION"
            boolean r0 = X.0qQ.A0K(r3, r0)
            r6 = 0
            if (r0 == 0) goto L_0x0217
            X.NmQ r12 = X.C69482NmQ.META_AI_SUBSCRIPTION
            java.lang.String r6 = "ai_bot_subscriptions"
        L_0x01eb:
            java.util.ArrayList r10 = X.AnonymousClass7TF.A0p(r2)
            r1 = 0
            java.util.Iterator r11 = r2.iterator()
        L_0x01f4:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0230
            java.lang.Object r3 = r11.next()
            int r2 = r1 + 1
            if (r1 < 0) goto L_0x0228
            java.lang.String r3 = (java.lang.String) r3
            X.N1G r1 = X.N1G.A00(r1)
            java.lang.String r0 = "id"
            r1.A06(r0, r3)
            java.lang.String r0 = "type"
            r1.A01(r12, r0)
            r10.add(r1)
            r1 = r2
            goto L_0x01f4
        L_0x0217:
            java.lang.String r0 = "GENAI_REMINDER"
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 == 0) goto L_0x0224
            X.NmQ r12 = X.C69482NmQ.META_AI_REMINDER
            java.lang.String r6 = "ai_bot_reminders"
            goto L_0x01eb
        L_0x0224:
            r12 = r6
            goto L_0x01eb
        L_0x0226:
            r5 = 0
            goto L_0x01c4
        L_0x0228:
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0230:
            java.util.LinkedHashMap r1 = X.AnonymousClass7TE.A1H()
            if (r6 == 0) goto L_0x023b
            java.lang.String r0 = "content_type"
            r1.put(r0, r6)
        L_0x023b:
            X.C66584MXp.A0t(r4, r7, r9, r5, r8)
            java.lang.String r0 = "content_list"
            r4.AAe(r0, r10)
            X.C66583MXo.A18(r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PB4.ADp(X.7Db, X.7FW):void");
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r1) {
    }
}
