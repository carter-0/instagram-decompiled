package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7EB  reason: invalid class name */
public abstract class AnonymousClass7EB implements C328007Db {
    public Drawable A00;
    public LayerDrawable A01;
    public LinearLayout A02;
    public LinearLayout A03;
    public LinearLayout A04;
    public LinearLayout A05;
    public TextView A06;
    public AnonymousClass7D5 A07;
    public AnonymousClass79H A08;
    public C2607246u A09;
    public final C71662eb A0A;
    public final List A0B = new ArrayList();

    public void A01() {
        AnonymousClass7EA r1 = (AnonymousClass7EA) this;
        C332937Xa r2 = r1.A01;
        if (!((C333107Xr) r2).CPk()) {
            ((AnonymousClass7XW) r2).DBq(r1.A00, true);
        }
    }

    public boolean A06(AnonymousClass79H r5) {
        AnonymousClass7EA r3 = (AnonymousClass7EA) this;
        0qQ.A0B(r5, 0);
        MessageIdentifier messageIdentifier = r3.A00;
        boolean z = true;
        if (messageIdentifier == null || !messageIdentifier.equals(r5.A0A)) {
            z = false;
        }
        r3.A00 = r5.A0A;
        return z;
    }

    public final LinearLayout A00() {
        LinearLayout linearLayout = this.A04;
        if (linearLayout != null) {
            return linearLayout;
        }
        0qQ.A0F("reactionsMessagePill");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A02() {
        List<View> list = this.A0B;
        for (View view : list) {
            0qQ.A0B(view, 0);
            C294975nL A012 = C294975nL.A01(view, 1);
            0qQ.A07(A012);
            if (A012.A0W()) {
                A012.A0G();
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                view.setTranslationY(0.0f);
            }
        }
        if (this.A0A.A00 != null) {
            A00().setOnClickListener((View.OnClickListener) null);
        }
        list.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0090, code lost:
        if (r8 != false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0096, code lost:
        if (r2.A0A.A00 != null) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0098, code lost:
        r0 = r2.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009a, code lost:
        if (r0 == null) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009c, code lost:
        r3 = r0.getChildCount();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if (r8 == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a0, code lost:
        if (r14 >= r3) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a2, code lost:
        r0 = r2.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a4, code lost:
        if (r0 == null) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a6, code lost:
        r0.getChildAt(r14).setVisibility(8);
        r14 = r14 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.AnonymousClass0iw r18, X.AnonymousClass79H r19) {
        /*
            r17 = this;
            r2 = r17
            r1 = r19
            boolean r15 = r2.A06(r1)
            X.46u r0 = r1.A07
            r2.A09 = r0
            X.9HC r4 = r1.A06
            if (r4 == 0) goto L_0x00c9
            X.0eM r0 = r4.A1H
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
            if (r8 != 0) goto L_0x0023
        L_0x001e:
            X.2eb r0 = r2.A0A
            r0.A01()
        L_0x0023:
            X.79H r0 = r2.A08
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 != 0) goto L_0x014e
            boolean r0 = r1.A0I
            if (r0 != 0) goto L_0x014e
            int r3 = r1.A00
            X.79H r5 = r2.A08
            r14 = 0
            if (r5 == 0) goto L_0x00c6
            int r0 = r5.A00
        L_0x0038:
            if (r3 <= r0) goto L_0x00c2
            java.lang.Integer r3 = X.AnonymousClass05K.A00
        L_0x003c:
            java.lang.String r12 = r1.A0E
            if (r5 == 0) goto L_0x00c0
            java.lang.String r0 = r5.A0E
        L_0x0042:
            boolean r0 = X.0qQ.A0K(r12, r0)
            r16 = r0 ^ 1
            r2.A08 = r1
            boolean r6 = r1.A0M
            if (r6 == 0) goto L_0x0061
            if (r8 == 0) goto L_0x0055
            X.2eb r0 = r2.A0A
            r0.A01()
        L_0x0055:
            android.widget.LinearLayout r5 = r2.A00()
            X.76W r0 = new X.76W
            r0.<init>(r1, r2)
            X.AnonymousClass0fU.A00(r0, r5)
        L_0x0061:
            com.google.common.collect.ImmutableList r13 = r1.A02
            boolean r0 = r13.isEmpty()
            r7 = 8
            if (r0 == 0) goto L_0x00d0
            if (r6 == 0) goto L_0x00b0
            if (r8 == 0) goto L_0x0074
            X.2eb r0 = r2.A0A
            r0.A01()
        L_0x0074:
            android.widget.LinearLayout r0 = r2.A02
            if (r0 == 0) goto L_0x01ff
            r0.setVisibility(r14)
            android.widget.TextView r0 = r2.A06
            if (r0 == 0) goto L_0x00cc
            r0.setVisibility(r7)
            android.widget.LinearLayout r0 = r2.A05
            if (r0 == 0) goto L_0x0202
            r0.setVisibility(r7)
            android.widget.LinearLayout r0 = r2.A00()
            r0.setVisibility(r14)
        L_0x0090:
            if (r8 == 0) goto L_0x0098
        L_0x0092:
            X.2eb r0 = r2.A0A
            android.view.View r0 = r0.A00
            if (r0 == 0) goto L_0x014e
        L_0x0098:
            android.widget.LinearLayout r0 = r2.A03
            if (r0 == 0) goto L_0x01fc
            int r3 = r0.getChildCount()
        L_0x00a0:
            if (r14 >= r3) goto L_0x014e
            android.widget.LinearLayout r0 = r2.A03
            if (r0 == 0) goto L_0x01fc
            android.view.View r0 = r0.getChildAt(r14)
            r0.setVisibility(r7)
            int r14 = r14 + 1
            goto L_0x00a0
        L_0x00b0:
            if (r8 == 0) goto L_0x00b8
            X.2eb r0 = r2.A0A
            android.view.View r0 = r0.A00
            if (r0 == 0) goto L_0x0092
        L_0x00b8:
            android.widget.LinearLayout r0 = r2.A00()
            r0.setVisibility(r7)
            goto L_0x0090
        L_0x00c0:
            r0 = 0
            goto L_0x0042
        L_0x00c2:
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            goto L_0x003c
        L_0x00c6:
            r0 = 0
            goto L_0x0038
        L_0x00c9:
            r8 = 0
            goto L_0x001e
        L_0x00cc:
            java.lang.String r0 = "countLabelContainer"
            goto L_0x0204
        L_0x00d0:
            X.2eb r9 = r2.A0A
            android.view.View r8 = r9.A01()
            android.graphics.PointF r6 = r1.A01
            r5 = 0
            if (r6 == 0) goto L_0x01f1
            float r0 = r6.x
        L_0x00dd:
            r8.setTranslationX(r0)
            android.view.View r0 = r9.A01()
            if (r6 == 0) goto L_0x00e8
            float r5 = r6.y
        L_0x00e8:
            r0.setTranslationY(r5)
            android.widget.LinearLayout r0 = r2.A00()
            r0.setVisibility(r14)
            android.widget.LinearLayout r0 = r2.A02
            if (r0 == 0) goto L_0x01ff
            r0.setVisibility(r7)
            android.widget.LinearLayout r5 = r2.A00()
            X.MbJ r0 = new X.MbJ
            r0.<init>(r2)
            X.AnonymousClass0fU.A00(r0, r5)
            android.widget.LinearLayout r0 = r2.A00()
            android.content.Context r0 = r0.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r0)
            com.instagram.common.session.UserSession r10 = r1.A04
            android.widget.LinearLayout r7 = r2.A00()
            android.widget.LinearLayout r8 = r2.A03
            if (r8 == 0) goto L_0x01fc
            X.0qQ.A0A(r6)
            com.instagram.common.typedurl.ImageUrl r11 = r1.A05
            r9 = r18
            java.util.List r5 = X.AnonymousClass7CZ.A02(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            if (r5 == 0) goto L_0x012d
            java.util.List r0 = r2.A0B
            r0.addAll(r5)
        L_0x012d:
            android.widget.LinearLayout r7 = r2.A00()
            android.widget.LinearLayout r5 = r2.A05
            if (r5 == 0) goto L_0x0202
            com.google.common.collect.ImmutableList r0 = r1.A03
            r8 = r5
            r10 = r0
            r11 = r15
            X.AnonymousClass7CZ.A03(r6, r7, r8, r9, r10, r11)
            android.widget.TextView r5 = r2.A06
            if (r5 == 0) goto L_0x014e
            java.lang.String r0 = r1.A0C
            android.widget.TextView r3 = X.AnonymousClass7CZ.A00(r5, r3, r0, r15)
            if (r3 == 0) goto L_0x014e
            java.util.List r0 = r2.A0B
            r0.add(r3)
        L_0x014e:
            boolean r0 = r1.A0J
            r3 = 0
            X.7Kx r5 = r1.A08
            if (r0 == 0) goto L_0x01ed
            int r0 = r5.A0K
        L_0x0157:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r8 = r5.A0K
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            if (r0 == 0) goto L_0x0170
            android.graphics.drawable.Drawable r6 = r2.A00
            if (r6 == 0) goto L_0x0170
            int r5 = r0.intValue()
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC
            r6.setColorFilter(r5, r0)
        L_0x0170:
            if (r7 == 0) goto L_0x0186
            android.graphics.drawable.LayerDrawable r5 = r2.A01
            if (r5 == 0) goto L_0x0186
            r0 = 2131436225(0x7f0b22c1, float:1.8494314E38)
            android.graphics.drawable.Drawable r5 = r5.findDrawableByLayerId(r0)
            if (r5 == 0) goto L_0x0186
            android.graphics.ColorFilter r0 = X.AnonymousClass37O.A00(r8)
            r5.setColorFilter(r0)
        L_0x0186:
            if (r4 == 0) goto L_0x01c7
            X.46u r0 = r2.A09
            if (r0 == 0) goto L_0x018e
            java.lang.String r3 = r0.A04
        L_0x018e:
            java.lang.String r0 = "default"
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 == 0) goto L_0x01c7
            X.46u r11 = r2.A09
            if (r11 == 0) goto L_0x01c7
            r3 = r2
            boolean r0 = r2 instanceof X.AnonymousClass7EA
            if (r0 == 0) goto L_0x01eb
            X.7EA r3 = (X.AnonymousClass7EA) r3
            X.7Xa r0 = r3.A01
            X.4kA r9 = r0.AxJ()
        L_0x01a7:
            java.lang.String r8 = r1.A0G
            java.lang.Long r7 = r11.A01
            if (r8 == 0) goto L_0x01e9
            if (r9 == 0) goto L_0x01f4
            X.0xa r5 = r9.A00
            java.lang.String r0 = "direct_super_react_last_seen_timestamp_"
            java.lang.String r0 = X.002.A0R(r0, r8)
            r3 = 0
            long r3 = r5.getLong(r0, r3)
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
        L_0x01c1:
            if (r7 != 0) goto L_0x01c8
            boolean r0 = r11.A05
            if (r0 == 0) goto L_0x01d6
        L_0x01c7:
            return
        L_0x01c8:
            if (r0 == 0) goto L_0x01c7
            long r5 = r0.longValue()
            long r3 = r7.longValue()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x01c7
        L_0x01d6:
            android.view.View r0 = r2.BJd()
            X.Pc1 r10 = new X.Pc1
            r12 = r1
            r13 = r2
            r14 = r9
            r15 = r7
            r16 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r0.post(r10)
            return
        L_0x01e9:
            r0 = 0
            goto L_0x01c1
        L_0x01eb:
            r9 = 0
            goto L_0x01a7
        L_0x01ed:
            int r0 = r5.A07
            goto L_0x0157
        L_0x01f1:
            r0 = 0
            goto L_0x00dd
        L_0x01f4:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x01fc:
            java.lang.String r0 = "reactionsContainer"
            goto L_0x0204
        L_0x01ff:
            java.lang.String r0 = "addReactionContainer"
            goto L_0x0204
        L_0x0202:
            java.lang.String r0 = "reactorsContainer"
        L_0x0204:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7EB.A03(X.0iw, X.79H):void");
    }

    public final void A04(C2607246u r5, AnonymousClass79H r6) {
        if (this instanceof AnonymousClass7EA) {
            ((C332307Ul) ((AnonymousClass7EA) this).A01).Ewv((AnonymousClass7EF) null, r6.A0A, r5.A02);
        }
    }

    public void A05(2FW r8, MessageIdentifier messageIdentifier, String str, long j, boolean z) {
        ((C332947Xb) ((AnonymousClass7EA) this).A01).Etu(r8, messageIdentifier, "quick_emoji_tray", j, true);
    }

    public final View BJd() {
        C71662eb r1 = this.A0A;
        if (r1.A00 != null) {
            View A012 = r1.A01();
            0qQ.A07(A012);
            return A012;
        }
        ViewStub viewStub = r1.A01;
        if (viewStub != null) {
            return viewStub;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public AnonymousClass7EB(C71662eb r2) {
        this.A0A = r2;
        r2.A02 = new AnonymousClass7EC(this);
    }
}
