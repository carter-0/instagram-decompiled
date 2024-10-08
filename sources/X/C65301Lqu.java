package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.Lqu  reason: case insensitive filesystem */
public final class C65301Lqu implements MV9 {
    public final UserSession A00;
    public final DirectPrivateStoryRecipientController A01;
    public final C61002Juy A02;
    public final MVT A03;
    public final FV6 A04;
    public final MTF A05;
    public final Context A06;
    public final AnonymousClass0iw A07;

    public C65301Lqu(Context context, AnonymousClass0iw r3, UserSession userSession, DirectPrivateStoryRecipientController directPrivateStoryRecipientController, MVT mvt, FV6 fv6, MTF mtf) {
        0qQ.A0B(mvt, 1);
        C51974G9v.A1S(mtf, fv6, directPrivateStoryRecipientController, userSession, context);
        0qQ.A0B(r3, 7);
        this.A03 = mvt;
        this.A05 = mtf;
        this.A04 = fv6;
        this.A01 = directPrivateStoryRecipientController;
        this.A00 = userSession;
        this.A06 = context;
        this.A07 = r3;
        C61002Juy juy = C61002Juy.A02;
        DirectShareTarget directShareTarget = fv6.A09;
        if (directShareTarget != null) {
            this.A02 = C64010LIx.A00(directShareTarget);
            return;
        }
        throw AnonymousClass7TE.A0z("VisualMessageOneTapSendButtonDelegate must have a valid ShareTarget set in the model");
    }

    public final int BPM(TextView textView) {
        0qQ.A0B(textView, 0);
        return this.A03.BY9(textView);
    }

    private final void A00() {
        Context context = this.A06;
        Resources resources = context.getResources();
        DirectShareTarget directShareTarget = this.A04.A09;
        if (directShareTarget != null) {
            String str = directShareTarget.A0I;
            if (str == null) {
                str = "";
            }
            Spanned A012 = 0bC.A01(resources, new String[]{str}, 2131964496);
            0qQ.A07(A012);
            C49952FGh.A05(context, A012, context.getString(2131973526));
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void D8z() {
        DirectShareTarget directShareTarget = this.A04.A09;
        if (directShareTarget != null && directShareTarget.A0W()) {
            A00();
        }
    }

    /* JADX WARNING: type inference failed for: r8v4, types: [X.MXS] */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: type inference failed for: r14v6, types: [X.Lqk] */
    /* JADX WARNING: type inference failed for: r9v3, types: [X.Lql] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0082, code lost:
        if (X.DbY.A1Y(X.0Tu.A05, r1.A0B, 2342165852579113488L) == false) goto L_0x0084;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dj4() {
        /*
            r22 = this;
            r0 = r22
            X.FV6 r3 = r0.A04
            com.instagram.model.direct.DirectShareTarget r13 = r3.A09
            r2 = 1
            if (r13 == 0) goto L_0x010a
            boolean r1 = r13.A0W()
            if (r1 != r2) goto L_0x001a
            com.instagram.common.session.UserSession r1 = r0.A00
            boolean r1 = X.C272094k5.A00(r1)
            if (r1 == 0) goto L_0x001a
            r0.A00()
        L_0x001a:
            int r6 = r3.A01
            int r5 = r3.A03
            int r4 = r3.A04
            com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController r1 = r0.A01
            X.OZA r3 = X.OZA.A00
            com.instagram.common.session.UserSession r2 = r0.A00
            boolean r3 = r3.A01(r2, r13)
            X.4DH r10 = r1.A0w
            android.content.Context r2 = r10.getContext()
            r2.getClass()
            androidx.fragment.app.FragmentActivity r7 = r10.requireActivity()
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r2 = r7.findViewById(r2)
            X.0nA.A0N(r2)
            X.Lqd r12 = new X.Lqd
            r14 = r12
            r15 = r1
            r16 = r13
            r17 = r6
            r18 = r4
            r19 = r5
            r14.<init>(r15, r16, r17, r18, r19)
            java.lang.String r2 = r1.A0T
            if (r2 == 0) goto L_0x00a2
            android.content.Context r10 = r10.requireContext()
            com.instagram.common.session.UserSession r11 = r1.A0B
            java.lang.String r7 = r1.A0T
            android.widget.EditText r2 = r1.A05
            if (r2 == 0) goto L_0x00a0
            java.lang.String r2 = X.AnonymousClass7TF.A0f(r2)
            java.lang.String r15 = r2.trim()
        L_0x0068:
            java.lang.String r2 = r1.A0T
            if (r2 == 0) goto L_0x0084
            int r8 = r2.length()
            r2 = 4
            if (r8 < r2) goto L_0x0084
            com.instagram.common.session.UserSession r9 = r1.A0B
            X.0Tu r8 = X.0Tu.A05
            r1 = 2342165852579113488(0x20810b6f00072a10, double:4.067996812917228E-152)
            boolean r1 = X.DbY.A1Y(r8, r9, r1)
            r17 = 1
            if (r1 != 0) goto L_0x0086
        L_0x0084:
            r17 = 0
        L_0x0086:
            X.Lql r8 = new X.Lql
            r9 = r8
            r14 = r7
            r16 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x008f:
            X.MTF r1 = r0.A05
            X.LRm r2 = r1.AXA()
            X.Juy r1 = r0.A02
            r2.A06(r8, r1)
            X.MVT r0 = r0.A03
            r0.DjG(r13, r6, r5, r4)
        L_0x009f:
            return
        L_0x00a0:
            r15 = 0
            goto L_0x0068
        L_0x00a2:
            java.util.ArrayList r2 = r1.A0W
            if (r2 == 0) goto L_0x00ac
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x00b6
        L_0x00ac:
            java.util.ArrayList r2 = r1.A0X
            if (r2 == 0) goto L_0x00dc
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x00dc
        L_0x00b6:
            android.content.Context r9 = r10.requireContext()
            com.instagram.common.session.UserSession r11 = r1.A0B
            java.util.ArrayList r7 = r1.A0W
            java.util.ArrayList r2 = r1.A0X
            android.widget.EditText r8 = r1.A05
            if (r8 == 0) goto L_0x00da
            java.lang.String r8 = X.AnonymousClass7TF.A0f(r8)
            java.lang.String r14 = r8.trim()
        L_0x00cc:
            java.lang.String r15 = r1.A0S
            X.Lqm r8 = new X.Lqm
            r17 = r2
            r18 = r3
            r16 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x008f
        L_0x00da:
            r14 = 0
            goto L_0x00cc
        L_0x00dc:
            com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim r2 = r1.A0E
            if (r2 != 0) goto L_0x00e4
            com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim r2 = r1.A0D
            if (r2 == 0) goto L_0x009f
        L_0x00e4:
            android.content.Context r15 = r10.getContext()
            com.instagram.common.session.UserSession r7 = r1.A0B
            com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim r2 = r1.A0E
            if (r2 != 0) goto L_0x00f3
            com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim r2 = r1.A0D
            r2.getClass()
        L_0x00f3:
            X.9cJ r1 = r1.A0N
            X.9cJ r21 = X.C39562A0e.A00(r1, r3)
            X.Lqk r8 = new X.Lqk
            r14 = r8
            r16 = r10
            r17 = r7
            r18 = r2
            r19 = r12
            r20 = r13
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            goto L_0x008f
        L_0x010a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65301Lqu.Dj4():void");
    }

    public final void DuW() {
        this.A05.AXA().A07(this.A02);
        MVT mvt = this.A03;
        FV6 fv6 = this.A04;
        DirectShareTarget directShareTarget = fv6.A09;
        if (directShareTarget != null) {
            mvt.DuZ(directShareTarget, fv6.A01, fv6.A03);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
