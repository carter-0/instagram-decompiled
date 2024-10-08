package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.8b5  reason: invalid class name and case insensitive filesystem */
public final class C358548b5 extends C358558b6 implements C337237fw {
    public C358538b4 A00;
    public boolean A01;
    public boolean A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final C337257fy A05;
    public final List A06 = new ArrayList();

    public C358548b5(AnonymousClass0iw r2, UserSession userSession, C358538b4 r4, C337257fy r5) {
        0qQ.A0B(userSession, 1);
        this.A04 = userSession;
        this.A03 = r2;
        this.A05 = r5;
        this.A00 = r4;
        if (r5 != null) {
            r5.EcJ(this);
        }
    }

    public final void A02(CharSequence charSequence) {
        0qQ.A0B(charSequence, 0);
        super.A02(charSequence);
        this.A02 = true;
        notifyDataSetChanged();
    }

    public final void Dam(C337257fy r2) {
        0qQ.A0B(r2, 0);
        if (!this.A01) {
            this.A00 = 00k.A0U((Collection) r2.Bo1());
            notifyDataSetChanged();
        }
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        if (i == 0) {
            C41555AwN awN = new C41555AwN(this);
            int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_reel_tagging, viewGroup, false);
            0qQ.A07(inflate);
            return new C387779ml(inflate, awN);
        } else if (i == 1) {
            C41550AwI awI = new C41550AwI(this.A00);
            int i3 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_create_group_mention, viewGroup, false);
            0qQ.A07(inflate2);
            return new C387759mj(inflate2, awI);
        } else if (i == 2) {
            C41556AwO awO = new C41556AwO(this.A00);
            int i4 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_group_mention_suggestion, viewGroup, false);
            0qQ.A07(inflate3);
            return new C387769mk(inflate3, awO);
        } else if (i == 3) {
            C41554AwM awM = new C41554AwM(this);
            UserSession userSession = this.A04;
            int i5 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            View inflate4 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_create_mention_invite_upsell, viewGroup, false);
            0qQ.A07(inflate4);
            return new C387789mm(inflate4, userSession, awM);
        } else {
            throw new IllegalStateException(002.A0O(AnonymousClass000.A00(1052), i));
        }
    }

    private final boolean A00() {
        if (this.A02) {
            if (!182.A06(0Tu.A05, this.A04, 36325270021485359L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r4v5, types: [java.util.List] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(X.C249703kE r28, int r29) {
        /*
            r27 = this;
            r6 = r29
            r5 = r28
            X.9YS r5 = (X.AnonymousClass9YS) r5
            r1 = 0
            X.0qQ.A0B(r5, r1)
            r4 = r27
            int r2 = r4.getItemViewType(r6)
            r0 = 1
            if (r2 == 0) goto L_0x01d4
            if (r2 == r0) goto L_0x0042
            r8 = 2
            if (r2 == r8) goto L_0x00f1
            X.9mm r5 = (X.C387789mm) r5
            com.instagram.common.session.UserSession r4 = r4.A04
            X.0qQ.A0B(r5, r1)
            com.instagram.common.ui.base.IgSimpleImageView r3 = r5.A01
            android.content.Context r2 = r3.getContext()
            android.view.View r1 = r5.A02
            X.ALz r0 = new X.ALz
            r0.<init>(r4, r5)
            r1.addOnAttachStateChangeListener(r0)
            android.widget.TextView r1 = r5.A00
            r0 = 2131966122(0x7f1338aa, float:1.9569073E38)
            r1.setText(r0)
            r0 = 2131100036(0x7f060184, float:1.7812442E38)
            int r0 = r2.getColor(r0)
            r3.setColorFilter(r0)
        L_0x0041:
            return
        L_0x0042:
            X.9mj r5 = (X.C387759mj) r5
            X.0iw r8 = r4.A03
            X.0eE r2 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r4 = r4.A04
            com.instagram.user.model.User r7 = r2.A01(r4)
            X.0qQ.A0B(r5, r1)
            com.instagram.common.ui.base.IgTextView r6 = r5.A02
            android.content.Context r3 = r6.getContext()
            r2 = 2131963192(0x7f132d38, float:1.956313E38)
            java.lang.String r2 = r3.getString(r2)
            r6.setText(r2)
            X.3NM r2 = r5.A00
            r2.A02()
            com.instagram.common.ui.base.IgSimpleImageView r2 = r5.A01
            android.content.Context r9 = r2.getContext()
            X.0qQ.A07(r9)
            java.lang.String r19 = r8.getModuleName()
            java.util.List r20 = java.util.Collections.singletonList(r7)
            X.0qQ.A07(r20)
            android.content.res.Resources r8 = r9.getResources()
            r7 = 2131165236(0x7f070034, float:1.7944683E38)
            int r21 = r8.getDimensionPixelSize(r7)
            java.lang.Integer r12 = X.AnonymousClass05K.A00
            r7 = 1056964608(0x3f000000, float:0.5)
            java.lang.Float r11 = java.lang.Float.valueOf(r7)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r1)
            r7 = 2131237847(0x7f081bd7, float:1.8091956E38)
            android.graphics.drawable.Drawable r10 = r3.getDrawable(r7)
            int r7 = X.2Yu.A07(r3)
            int r7 = r3.getColor(r7)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r7)
            r13 = 0
            r15 = r13
            r16 = r13
            r18 = r13
            r22 = r1
            r23 = r1
            r24 = r1
            r25 = r0
            r26 = r1
            X.3b0 r1 = X.C244283aw.A04(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r2.setImageDrawable(r1)
            X.1Av r8 = X.1Au.A00(r4)
            X.0s0 r7 = r8.A3U
            X.0YZ[] r10 = X.1Av.A8a
            r9 = 398(0x18e, float:5.58E-43)
            r1 = r10[r9]
            java.lang.Object r1 = r7.CDM(r8, r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0041
            android.view.View r1 = r6.getRootView()
            android.view.ViewGroup r6 = X.C394509yE.A00(r1)
            if (r6 == 0) goto L_0x0041
            X.AqA r1 = new X.AqA
            r1.<init>(r3, r6, r4, r5)
            r3 = 1500(0x5dc, double:7.41E-321)
            r2.postDelayed(r1, r3)
            r1 = r10[r9]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.Epx(r8, r0, r1)
            return
        L_0x00f1:
            X.9mk r5 = (X.C387769mk) r5
            java.util.List r2 = r4.A06
            int r6 = r29 - r0
            java.lang.Object r7 = r2.get(r6)
            X.9m3 r7 = (X.C387339m3) r7
            X.0iw r6 = r4.A03
            X.0qQ.A0B(r5, r1)
            X.0qQ.A0B(r7, r0)
            r5.A01 = r7
            java.util.List r3 = r7.A05
            java.util.List r2 = r7.A06
            java.util.ArrayList r4 = X.00k.A0S(r2, r3)
            com.instagram.common.ui.base.IgTextView r9 = r5.A03
            com.instagram.api.schemas.StoryGroupMentionTappableData r2 = r7.A00
            java.lang.String r3 = r2.A03
            if (r3 == 0) goto L_0x011d
            int r2 = r3.length()
            if (r2 != 0) goto L_0x0136
        L_0x011d:
            android.view.View r2 = r5.itemView
            android.content.Context r7 = r2.getContext()
            r3 = 2131963201(0x7f132d41, float:1.9563149E38)
            int r2 = r4.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = r7.getString(r3, r2)
        L_0x0136:
            r9.setText(r3)
            X.3NM r2 = r5.A00
            r2.A02()
            com.instagram.common.ui.base.IgSimpleImageView r5 = r5.A02
            android.content.Context r9 = r5.getContext()
            int r3 = r4.size()
            r2 = 3
            r13 = 0
            if (r3 <= r2) goto L_0x01d2
            int r7 = r4.size()
            int r7 = r7 - r8
            java.util.List r4 = r4.subList(r1, r8)
            android.text.Spannable r2 = X.C306386Ly.A0d
            android.content.res.Resources r3 = r9.getResources()
            r2 = 2131165236(0x7f070034, float:1.7944683E38)
            int r2 = r3.getDimensionPixelSize(r2)
            X.6Ly r10 = new X.6Ly
            r10.<init>(r9, r2)
            java.lang.String r2 = ""
            r10.A0G(r0, r2)
            r2 = 43
            java.lang.String r2 = X.002.A00(r2, r7)
            r10.A0M(r2)
            android.content.res.Resources r3 = r9.getResources()
            r2 = 2131165220(0x7f070024, float:1.794465E38)
            int r2 = r3.getDimensionPixelSize(r2)
            float r2 = (float) r2
            r10.A0A(r2)
            int r2 = X.2Yu.A07(r9)
            int r2 = r9.getColor(r2)
            r10.A0F(r2)
            r10.A0J(r13, r0)
        L_0x0192:
            X.0qQ.A0A(r9)
            java.lang.String r17 = r6.getModuleName()
            android.content.res.Resources r3 = r9.getResources()
            r2 = 2131165236(0x7f070034, float:1.7944683E38)
            int r19 = r3.getDimensionPixelSize(r2)
            java.lang.Integer r12 = X.AnonymousClass05K.A00
            r2 = 1056964608(0x3f000000, float:0.5)
            java.lang.Float r11 = java.lang.Float.valueOf(r2)
            android.content.res.Resources r3 = r9.getResources()
            r2 = 2131165200(0x7f070010, float:1.794461E38)
            int r2 = r3.getDimensionPixelSize(r2)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r2)
            r15 = r13
            r16 = r13
            r18 = r4
            r20 = r1
            r21 = r1
            r22 = r1
            r23 = r0
            r24 = r1
            android.graphics.drawable.Drawable r0 = X.C244283aw.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r5.setImageDrawable(r0)
            return
        L_0x01d2:
            r10 = r13
            goto L_0x0192
        L_0x01d4:
            java.util.List r3 = r4.A00
            boolean r2 = r4.A01
            if (r2 == 0) goto L_0x0247
            java.util.List r2 = r4.A06
            int r2 = r2.size()
            int r2 = r2 + 1
            int r6 = r29 - r2
        L_0x01e4:
            java.lang.Object r6 = r3.get(r6)
            com.instagram.user.model.User r6 = (com.instagram.user.model.User) r6
            X.9ml r5 = (X.C387779ml) r5
            boolean r2 = r6.A2G()
            if (r2 == 0) goto L_0x01fd
            java.util.List r2 = r4.A03
            int r3 = r2.size()
            r2 = 20
            if (r3 >= r2) goto L_0x01fd
            r0 = 0
        L_0x01fd:
            X.0iw r2 = r4.A03
            X.0qQ.A0B(r5, r1)
            com.instagram.common.ui.widget.imageview.IgImageView r4 = r5.A01
            android.content.Context r3 = r4.getContext()
            r1 = 2131100246(0x7f060256, float:1.7812868E38)
            int r1 = r3.getColor(r1)
            r4.setPlaceHolderColor(r1)
            com.instagram.common.typedurl.ImageUrl r1 = r6.Bh3()
            r4.setUrl(r1, r2)
            android.widget.TextView r2 = r5.A00
            java.lang.String r1 = r6.getUsername()
            r2.setText(r1)
            r5.A02 = r6
            X.3NM r1 = r5.A03
            r1.A02()
            if (r0 == 0) goto L_0x0240
            r0 = 2131099788(0x7f06008c, float:1.781194E38)
            int r0 = r3.getColor(r0)
            r4.setColorFilter(r0)
            r0 = 2131099826(0x7f0600b2, float:1.7812016E38)
        L_0x0238:
            int r0 = r3.getColor(r0)
            r2.setTextColor(r0)
            return
        L_0x0240:
            r4.clearColorFilter()
            r0 = 2131100036(0x7f060184, float:1.7812442E38)
            goto L_0x0238
        L_0x0247:
            boolean r2 = r4.A00()
            if (r2 == 0) goto L_0x01e4
            int r6 = r29 + -1
            goto L_0x01e4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C358548b5.onBindViewHolder(X.3kE, int):void");
    }

    public final /* bridge */ /* synthetic */ void onViewDetachedFromWindow(C249703kE r2) {
        AnonymousClass3NM r0;
        AnonymousClass9YS r22 = (AnonymousClass9YS) r2;
        0qQ.A0B(r22, 0);
        if (r22 instanceof C387779ml) {
            r0 = ((C387779ml) r22).A03;
        } else if (r22 instanceof C387789mm) {
            r0 = ((C387789mm) r22).A04;
        } else if (r22 instanceof C387769mk) {
            r0 = ((C387769mk) r22).A00;
        } else {
            r0 = ((C387759mj) r22).A00;
        }
        r0.A02();
    }

    public final void A01() {
        super.A01();
        this.A06.clear();
        this.A02 = false;
        notifyDataSetChanged();
    }

    public final void A03(List list) {
        super.A03(list);
        notifyDataSetChanged();
    }

    public final int getItemCount() {
        int i;
        int A032 = AnonymousClass0fD.A03(349821768);
        int size = this.A00.size();
        if (this.A01) {
            i = this.A06.size() + 1;
        } else {
            i = 0;
        }
        int i2 = size + i + (A00() ? 1 : 0);
        AnonymousClass0fD.A0A(288144014, A032);
        return i2;
    }

    public final long getItemId(int i) {
        long A002;
        int A032 = AnonymousClass0fD.A03(-1779471878);
        int itemViewType = getItemViewType(i);
        if (itemViewType == 0) {
            C355638Qt r2 = this.A02;
            List list = this.A00;
            if (this.A01) {
                i -= this.A06.size() + 1;
            } else if (A00()) {
                i--;
            }
            A002 = r2.A00(((User) list.get(i)).getId());
        } else if (itemViewType == 1 || itemViewType != 2) {
            A002 = 0;
        } else {
            A002 = (long) this.A06.get(i - 1).hashCode();
        }
        AnonymousClass0fD.A0A(1467238564, A032);
        return A002;
    }

    public final int getItemViewType(int i) {
        int i2;
        int A032 = AnonymousClass0fD.A03(632641533);
        int i3 = 0;
        if (this.A01) {
            if (i == 0) {
                i3 = 1;
            } else if (1 <= i && i <= this.A06.size()) {
                i3 = 2;
            }
            i2 = -1755507586;
        } else if (A00()) {
            if (i == 0) {
                i3 = 3;
            }
            i2 = -1826740918;
        } else {
            i2 = -240674866;
        }
        AnonymousClass0fD.A0A(i2, A032);
        return i3;
    }
}
