package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.AnimationSet;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.6N0  reason: invalid class name */
public final class AnonymousClass6N0 {
    public int A00 = -1;
    public View A01;
    public AnimationSet A02;
    public TextView A03;
    public TextView A04;
    public AnonymousClass0iw A05;
    public UserSession A06;
    public AnonymousClass6NJ A07;
    public C255773uh A08;
    public C309426Yf A09;
    public C317286n1 A0A;
    public boolean A0B;
    public boolean A0C;
    public C306866Nv[] A0D;
    public final ViewStub A0E;

    public final void A03(C306866Nv r24, int i) {
        C270074g9 r5;
        int A0H;
        C270074g9 r0;
        C306866Nv r2 = r24;
        0qQ.A0B(r2, 0);
        C255773uh r02 = this.A08;
        if (r02 != null && (r5 = r02.A09) != null && r2.A01) {
            boolean z = false;
            r2.A01 = false;
            FollowButton followButton = r2.A0E;
            followButton.A0B = false;
            C309426Yf r03 = this.A09;
            if (r03 != null && r03.A13) {
                z = true;
            }
            String str = null;
            if (z) {
                if (!1QE.A0E().A00) {
                    followButton.A09 = true;
                }
                Context context = followButton.getContext();
                0qQ.A07(context);
                A0H = 1QE.A08(context, 1QE.A0E());
            } else {
                A0H = 2Yu.A0H(followButton.getContext(), R.attr.igds_color_secondary_text);
            }
            followButton.setCustomForegroundColor(A0H);
            C267064at r6 = followButton.A0J;
            int i2 = i;
            C306886Nx r52 = (C306886Nx) r5.A01().get(i2);
            User A002 = C306906Nz.A00(r52);
            int A003 = C306846Nt.A00(this.A09, A002.getId(), i2);
            0xF r7 = new 0xF();
            0xF.A00(r7, Integer.valueOf(A003), "position");
            UserSession userSession = this.A06;
            if (userSession != null) {
                FollowStatus A0N = AnonymousClass2f1.A00(userSession).A0N(A002);
                AnonymousClass0iw r3 = this.A05;
                if (r3 != null) {
                    r6.A04(r7, userSession, (1Xj) null, (AnonymousClass3W1) null, (SearchContext) null, (C243853aD) null, A002, (C249763kK) null, (Double) null, r3.getModuleName());
                    String id = A002.getId();
                    C306876Nw r53 = (C306876Nw) r52;
                    String str2 = r53.A09;
                    String str3 = r53.A0E;
                    C255773uh r04 = this.A08;
                    if (!(r04 == null || (r0 = r04.A09) == null)) {
                        str = r0.getId();
                    }
                    C306896Ny.A02(r3, userSession, A0N, id, str2, str3, str, A003);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void A00() {
        int i;
        C255773uh r2 = this.A08;
        if (r2 == null) {
            return;
        }
        if (r2.A1U() || (r2.A1B() && r2.A0e == C250963mL.EMPTY_STORIES_STATE_SUGGESTED_USERS)) {
            C309426Yf r0 = this.A09;
            if (r0 != null) {
                int i2 = r0.A0M;
                C270074g9 r02 = r2.A09;
                if (r02 != null) {
                    i = r02.A01().size();
                } else {
                    i = 0;
                }
                int length = A04().length;
                for (int i3 = 0; i3 < length; i3++) {
                    A03(A04()[i3], (i2 + i3) % i);
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r2v7, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0096, code lost:
        if (X.C306846Nt.A03(r10, r1, 579) == false) goto L_0x0098;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(android.view.View r24, X.C250973mM r25, X.C309426Yf r26, boolean r27, boolean r28) {
        /*
            r23 = this;
            r7 = r26
            r4 = r24
            boolean r13 = r7.A10
            r5 = r23
            android.view.View r0 = r5.A01
            if (r0 != 0) goto L_0x01c1
            android.view.ViewStub r0 = r5.A0E
            if (r0 != 0) goto L_0x0012
            if (r24 == 0) goto L_0x01c1
        L_0x0012:
            r2 = 0
            if (r24 != 0) goto L_0x001d
            if (r0 == 0) goto L_0x01c1
            android.view.View r4 = r0.inflate()
            if (r4 == 0) goto L_0x01c1
        L_0x001d:
            r5.A01 = r4
            r0 = 2131436899(0x7f0b2563, float:1.8495681E38)
            android.view.View r0 = r4.requireViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.A04 = r0
            r0 = 2131439521(0x7f0b2fa1, float:1.8501E38)
            android.view.View r0 = r4.requireViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.A03 = r0
            android.content.Context r10 = r4.getContext()
            X.0qQ.A0A(r10)
            boolean r0 = X.C316216lI.A0B(r10)
            if (r0 != 0) goto L_0x0061
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131165219(0x7f070023, float:1.7944649E38)
            int r0 = r1.getDimensionPixelOffset(r0)
            X.0nA.A0X(r4, r0)
            android.widget.TextView r0 = r5.A03
            if (r0 == 0) goto L_0x0058
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
        L_0x0058:
            X.2dQ r2 = (X.C71492dQ) r2
            if (r2 == 0) goto L_0x0061
            r0 = 1036831949(0x3dcccccd, float:0.1)
            r2.A09 = r0
        L_0x0061:
            r0 = 2131436890(0x7f0b255a, float:1.8495663E38)
            android.view.View r2 = r4.requireViewById(r0)
            X.0qQ.A07(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r1 = 2131628848(0x7f0e1330, float:1.8885E38)
            if (r13 == 0) goto L_0x0075
            r1 = 2131628845(0x7f0e132d, float:1.8884994E38)
        L_0x0075:
            android.content.Context r0 = X.2Yn.A02(r10)
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r0.inflate(r1, r2)
            r0 = 549(0x225, float:7.7E-43)
            r1 = r25
            boolean r0 = X.C306846Nt.A03(r10, r1, r0)
            r5.A0B = r0
            r3 = 0
            if (r27 == 0) goto L_0x0098
            if (r13 != 0) goto L_0x0098
            r0 = 579(0x243, float:8.11E-43)
            boolean r1 = X.C306846Nt.A03(r10, r1, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0099
        L_0x0098:
            r0 = 0
        L_0x0099:
            r5.A0C = r0
            int[] r0 = X.C306856Nu.A00(r13)
            int r9 = r0.length
            X.6Nv[] r8 = new X.C306866Nv[r9]
        L_0x00a2:
            if (r3 >= r9) goto L_0x01bf
            int[] r0 = X.C306856Nu.A00(r13)
            r0 = r0[r3]
            android.view.View r0 = r4.requireViewById(r0)
            X.0qQ.A07(r0)
            X.6Nv r6 = new X.6Nv
            r6.<init>(r0, r7)
            boolean r0 = r5.A0B
            if (r0 != 0) goto L_0x018d
            android.view.View r14 = r6.A05
            com.instagram.common.ui.widget.imageview.CircularImageView r2 = r6.A0D
            boolean r1 = r7.A10
            r0 = 2131165273(0x7f070059, float:1.7944758E38)
            r12 = 2131165236(0x7f070034, float:1.7944683E38)
            android.content.res.Resources r11 = r14.getResources()
            if (r1 != 0) goto L_0x00d6
            android.view.ViewGroup$LayoutParams r1 = r14.getLayoutParams()
            int r0 = r11.getDimensionPixelSize(r0)
            r1.height = r0
        L_0x00d6:
            int r1 = r11.getDimensionPixelSize(r12)
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            r0.height = r1
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            r0.width = r1
            com.instagram.user.follow.FollowButton r2 = r6.A0E
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            r0 = 2131165219(0x7f070023, float:1.7944649E38)
            int r0 = r11.getDimensionPixelSize(r0)
            r1.height = r0
            r1 = 0
            r0 = 2131165216(0x7f070020, float:1.7944643E38)
            int r0 = r11.getDimensionPixelSize(r0)
            float r0 = (float) r0
            r2.setTextSize(r1, r0)
        L_0x0101:
            if (r28 == 0) goto L_0x013a
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131165372(0x7f0700bc, float:1.794496E38)
            int r12 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131165219(0x7f070023, float:1.7944649E38)
            int r11 = r1.getDimensionPixelSize(r0)
            int r2 = X.0nA.A09(r10)
            double r0 = (double) r2
            r14 = 4604660403008689930(0x3fe70a3d70a3d70a, double:0.72)
            double r0 = r0 * r14
            double r0 = java.lang.Math.ceil(r0)
            int r14 = (int) r0
            if (r14 <= r12) goto L_0x012c
            r14 = r12
        L_0x012c:
            int r2 = r2 - r14
            int r1 = r2 / 2
            if (r1 >= r11) goto L_0x0132
            r1 = r11
        L_0x0132:
            android.view.View r0 = r6.A05
            X.0nA.A0d(r0, r1)
            X.0nA.A0U(r0, r1)
        L_0x013a:
            r0 = 0
            android.view.animation.AnimationSet r2 = new android.view.animation.AnimationSet
            r2.<init>(r0)
            r5.A02 = r2
            r15 = 1065353216(0x3f800000, float:1.0)
            r16 = 1065437102(0x3f8147ae, float:1.01)
            r19 = 1
            r20 = 1056964608(0x3f000000, float:0.5)
            android.view.animation.ScaleAnimation r14 = new android.view.animation.ScaleAnimation
            r17 = r15
            r18 = r16
            r21 = r19
            r22 = r20
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            r0 = 50
            r14.setDuration(r0)
            android.view.animation.AccelerateInterpolator r11 = new android.view.animation.AccelerateInterpolator
            r11.<init>()
            r14.setInterpolator(r11)
            r2.addAnimation(r14)
            r15 = 1065437102(0x3f8147ae, float:1.01)
            r16 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.ScaleAnimation r14 = new android.view.animation.ScaleAnimation
            r17 = r15
            r18 = r16
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            r14.setStartOffset(r0)
            r14.setDuration(r0)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            r14.setInterpolator(r0)
            r2.addAnimation(r14)
            r8[r3] = r6
            int r3 = r3 + 1
            goto L_0x00a2
        L_0x018d:
            boolean r0 = r5.A0C
            if (r0 == 0) goto L_0x0101
            android.view.View r14 = r6.A05
            com.instagram.common.ui.widget.imageview.CircularImageView r11 = r6.A0D
            boolean r1 = r7.A10
            r0 = 2131165340(0x7f07009c, float:1.7944894E38)
            r12 = 2131165282(0x7f070062, float:1.7944777E38)
            android.content.res.Resources r2 = r14.getResources()
            if (r1 != 0) goto L_0x01ad
            android.view.ViewGroup$LayoutParams r1 = r14.getLayoutParams()
            int r0 = r2.getDimensionPixelSize(r0)
            r1.height = r0
        L_0x01ad:
            int r1 = r2.getDimensionPixelSize(r12)
            android.view.ViewGroup$LayoutParams r0 = r11.getLayoutParams()
            r0.height = r1
            android.view.ViewGroup$LayoutParams r0 = r11.getLayoutParams()
            r0.width = r1
            goto L_0x0101
        L_0x01bf:
            r5.A0D = r8
        L_0x01c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6N0.A01(android.view.View, X.3mM, X.6Yf, boolean, boolean):void");
    }

    public final C306866Nv[] A04() {
        C306866Nv[] r0 = this.A0D;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("cardViewHolders");
        throw AnonymousClass00P.createAndThrow();
    }

    public AnonymousClass6N0(ViewStub viewStub) {
        this.A0E = viewStub;
    }

    public final void A02(C250973mM r6) {
        C270074g9 r3;
        A00();
        C309426Yf r4 = this.A09;
        if (r4 != null) {
            C255773uh r0 = this.A08;
            if (r0 == null || (r3 = r0.A09) == null) {
                throw new IllegalStateException("Required value was null.");
            }
            r4.A0M = (r4.A0M + C306856Nu.A00(r4.A10).length) % r3.A01().size();
            C306846Nt.A01.A04(r6, this, true);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
