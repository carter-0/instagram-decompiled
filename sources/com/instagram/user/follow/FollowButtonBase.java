package com.instagram.user.follow;

import X.0qQ;
import X.1QG;
import X.2Yu;
import X.C243923aK;
import X.C267034aq;
import X.C267054as;
import X.C267064at;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import com.instagram.android.R;
import com.instagram.ui.widget.textview.UpdatableButton;
import kotlin.Deprecated;

@Deprecated(message = "You should NOT use this directly and should only use [FollowButton] instead.")
public class FollowButtonBase extends UpdatableButton {
    public int A00;
    public int A01;
    public GradientDrawable A02;
    public 1QG A03;
    public C243923aK A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public int A0D;
    public int A0E;
    public C267034aq A0F;
    public C267054as A0G;
    public C243923aK A0H;
    public boolean A0I;
    public final C267064at A0J;
    public final int A0K;
    public final int A0L;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FollowButtonBase(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public final void A02() {
        this.A08 = true;
        Context context = getContext();
        0qQ.A07(context);
        A04(2Yu.A0H(context, R.attr.igds_color_primary_text_on_media), true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0223, code lost:
        if (r15.A2A() == false) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x022d, code lost:
        if (r6 == false) goto L_0x022f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00a0, code lost:
        if (X.C271174i4.A02(r13) == false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (r11 != false) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x00fc, code lost:
        if (r12.A0B != false) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0131, code lost:
        if (r5 == r0) goto L_0x00fe;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(com.instagram.common.session.UserSession r13, com.instagram.user.model.FollowStatus r14, com.instagram.user.model.User r15, boolean r16, boolean r17) {
        /*
            r12 = this;
            r4 = 0
            r3 = 1
            r2 = 2
            X.4as r1 = r12.A0G
            X.4as r0 = X.C267054as.CONDENSED
            if (r1 != r0) goto L_0x0249
            X.3aK r0 = X.C243923aK.SMALL
        L_0x000b:
            r12.A04 = r0
            boolean r11 = r15.CPV()
            r6 = 0
            if (r16 == 0) goto L_0x0017
            r5 = 1
            if (r11 == 0) goto L_0x0018
        L_0x0017:
            r5 = 0
        L_0x0018:
            com.instagram.user.model.FollowStatus r1 = com.instagram.user.model.FollowStatus.A04
            r0 = 0
            if (r14 == r1) goto L_0x001e
            r0 = 1
        L_0x001e:
            r12.setEnabled(r0)
            if (r17 == 0) goto L_0x0033
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A05
            if (r14 == r0) goto L_0x0030
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A07
            if (r14 == r0) goto L_0x0030
            boolean r0 = r12.A09
            if (r0 != 0) goto L_0x0030
            r6 = 1
        L_0x0030:
            r12.setSelected(r6)
        L_0x0033:
            X.3aK r1 = r12.A04
            X.3aK r0 = X.C243923aK.SMALL
            if (r1 == r0) goto L_0x004b
            X.3aK r0 = X.C243923aK.ACTIONABLE_TEXT
            if (r1 == r0) goto L_0x004b
            X.3aK r0 = X.C243923aK.INLINE_ICON
            if (r1 == r0) goto L_0x004b
            X.3aK r0 = X.C243923aK.COLLABORATOR_TEXT
            if (r1 != r0) goto L_0x0244
            boolean r0 = X.C271174i4.A02(r13)
            if (r0 == 0) goto L_0x0244
        L_0x004b:
            if (r5 == 0) goto L_0x0244
            X.3aK r4 = r12.A04
            int r1 = r14.ordinal()
            r0 = 4
            if (r1 == r0) goto L_0x0240
            if (r1 == r2) goto L_0x023c
            r0 = 5
            if (r1 == r0) goto L_0x0238
            r0 = 3
            if (r1 == r0) goto L_0x0234
            r0 = 0
        L_0x005f:
            r12.setImageResource(r0)
            android.content.Context r1 = r12.getContext()
            int r0 = r12.A01
            int r0 = r1.getColor(r0)
            android.graphics.ColorFilter r1 = X.AnonymousClass37O.A00(r0)
            android.graphics.drawable.Drawable r0 = r12.A01
            if (r0 == 0) goto L_0x007b
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r0.setColorFilter(r1)
        L_0x007b:
            boolean r5 = r12.A0A
            boolean r6 = r12.A0I
            boolean r4 = r12.A0B
            X.4at r9 = r12.A0J
            boolean r0 = r9.A0M
            r7 = 1
            if (r0 == 0) goto L_0x0092
            X.3aF r0 = r9.A08
            if (r0 == 0) goto L_0x0093
            boolean r0 = r0.EsG()
            if (r0 != r3) goto L_0x0093
        L_0x0092:
            r7 = 0
        L_0x0093:
            boolean r0 = r9.A0M
            if (r0 == 0) goto L_0x00a2
            boolean r0 = r9.A0P
            if (r0 == 0) goto L_0x00a2
            boolean r1 = X.C271174i4.A02(r13)
            r0 = 1
            if (r1 != 0) goto L_0x00a3
        L_0x00a2:
            r0 = 0
        L_0x00a3:
            if (r11 == 0) goto L_0x01f1
            r4 = 2131962628(0x7f132b04, float:1.9561987E38)
        L_0x00a8:
            if (r4 == 0) goto L_0x00de
            android.content.Context r5 = r12.getContext()
            X.0qQ.A07(r5)
            java.lang.String r10 = r15.B8Q()
            boolean r8 = r12.A0A
            boolean r7 = r12.A0I
            boolean r6 = r12.A0B
            boolean r0 = r9.A0M
            r1 = 1
            if (r0 == 0) goto L_0x00ca
            X.3aF r0 = r9.A08
            if (r0 == 0) goto L_0x00cb
            boolean r0 = r0.EsG()
            if (r0 != r3) goto L_0x00cb
        L_0x00ca:
            r1 = 0
        L_0x00cb:
            if (r11 == 0) goto L_0x019b
            r1 = 2131962629(0x7f132b05, float:1.9561989E38)
        L_0x00d0:
            java.lang.Object[] r0 = new java.lang.Object[]{r10}
            java.lang.String r0 = r5.getString(r1, r0)
        L_0x00d8:
            X.0qQ.A0A(r0)
        L_0x00db:
            r12.setContentDescription(r0)
        L_0x00de:
            boolean r0 = r12.A07()
            if (r0 == 0) goto L_0x0150
            X.4aq r5 = r12.A0F
            int r0 = r5.ordinal()
            if (r0 == r3) goto L_0x0142
            if (r0 == r2) goto L_0x0134
            boolean r0 = r12.A09
            if (r0 != 0) goto L_0x0134
            com.instagram.user.model.FollowStatus r1 = com.instagram.user.model.FollowStatus.A06
            X.4aq r0 = X.C267034aq.SECONDAY_ALWAYS_LIGHT_AVOID_USING
            if (r14 != r1) goto L_0x0131
            if (r5 != r0) goto L_0x0142
            boolean r0 = r12.A0B
            if (r0 == 0) goto L_0x0142
        L_0x00fe:
            android.content.Context r1 = r12.getContext()
            X.0qQ.A07(r1)
            X.1QG r0 = r12.A03
            int r0 = X.1QE.A08(r1, r0)
        L_0x010b:
            int r0 = r1.getColor(r0)
        L_0x010f:
            r12.setTextColor(r0)
        L_0x0112:
            X.3aK r0 = r12.A04
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x012b
            if (r4 == 0) goto L_0x012b
            r12.setText(r4)
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            android.content.Context r1 = r12.getContext()
            r0 = 0
            X.0oh.A07(r1, r0, r12, r2)
        L_0x0127:
            r12.A01()
            return
        L_0x012b:
            java.lang.String r0 = ""
            r12.setText(r0)
            goto L_0x0127
        L_0x0131:
            if (r5 != r0) goto L_0x0134
            goto L_0x00fe
        L_0x0134:
            android.content.Context r1 = r12.getContext()
            X.0qQ.A07(r1)
            X.1QG r0 = r12.A03
            int r0 = X.1QE.A07(r1, r0)
            goto L_0x010b
        L_0x0142:
            android.content.Context r1 = r12.getContext()
            X.0qQ.A07(r1)
            X.1QG r0 = r12.A03
            int r0 = X.1QE.A06(r1, r0)
            goto L_0x010b
        L_0x0150:
            int r1 = r12.A0E
            r0 = -1
            if (r1 == r0) goto L_0x015e
            android.content.Context r0 = r12.getContext()
            int r0 = r0.getColor(r1)
            goto L_0x010f
        L_0x015e:
            X.1QG r0 = r12.A03
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0112
            boolean r0 = r12.A08
            if (r0 != 0) goto L_0x0112
            X.3aK r1 = r12.A04
            X.3aK r0 = X.C243923aK.TEXT_ONLY
            if (r1 != r0) goto L_0x0112
            android.content.Context r1 = r12.getContext()
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A06
            if (r14 != r0) goto L_0x0185
            X.0qQ.A07(r1)
            int r0 = X.1QE.A01(r1)
        L_0x017d:
            android.content.res.ColorStateList r0 = X.02K.A02(r1, r0)
            r12.setTextColor(r0)
            goto L_0x0112
        L_0x0185:
            X.0qQ.A07(r1)
            X.1QG r0 = X.1QE.A0E()
            int r0 = r0.ordinal()
            if (r0 != r3) goto L_0x0196
            r0 = 2131100450(0x7f060322, float:1.7813282E38)
            goto L_0x017d
        L_0x0196:
            int r0 = X.2Yu.A07(r1)
            goto L_0x017d
        L_0x019b:
            if (r1 == 0) goto L_0x01a6
            r0 = 2131962612(0x7f132af4, float:1.9561954E38)
        L_0x01a0:
            java.lang.String r0 = r5.getString(r0)
            goto L_0x00d8
        L_0x01a6:
            int r1 = r14.ordinal()
            if (r1 == r2) goto L_0x01e1
            r0 = 4
            if (r1 == r0) goto L_0x01d7
            r0 = 5
            if (r1 == r0) goto L_0x01d3
            r0 = 3
            if (r1 == r0) goto L_0x01bb
            if (r1 != r3) goto L_0x024d
            java.lang.String r0 = ""
            goto L_0x00db
        L_0x01bb:
            if (r6 == 0) goto L_0x01c2
            r1 = 2131962630(0x7f132b06, float:1.956199E38)
            goto L_0x00d0
        L_0x01c2:
            if (r8 == 0) goto L_0x01ce
            boolean r0 = r15.A2A()
            if (r0 == 0) goto L_0x01ce
            r0 = 2131962614(0x7f132af6, float:1.9561958E38)
            goto L_0x01a0
        L_0x01ce:
            r1 = 2131962615(0x7f132af7, float:1.956196E38)
            goto L_0x00d0
        L_0x01d3:
            r1 = 2131962626(0x7f132b02, float:1.9561982E38)
            goto L_0x01e4
        L_0x01d7:
            r1 = 2131962617(0x7f132af9, float:1.9561964E38)
            if (r7 == 0) goto L_0x00d0
            r1 = 2131962623(0x7f132aff, float:1.9561976E38)
            goto L_0x00d0
        L_0x01e1:
            r1 = 2131962621(0x7f132afd, float:1.9561972E38)
        L_0x01e4:
            java.lang.Object[] r0 = new java.lang.Object[]{r10}
            java.lang.String r0 = r5.getString(r1, r0)
            X.0qQ.A07(r0)
            goto L_0x00db
        L_0x01f1:
            if (r0 != 0) goto L_0x022f
            if (r7 != 0) goto L_0x0225
            int r1 = r14.ordinal()
            if (r1 == r2) goto L_0x0215
            r0 = 4
            if (r1 == r0) goto L_0x022a
            r0 = 5
            if (r1 == r0) goto L_0x0210
            r0 = 3
            if (r1 == r0) goto L_0x0209
            if (r1 != r3) goto L_0x0255
            r4 = 0
            goto L_0x00a8
        L_0x0209:
            if (r4 == 0) goto L_0x021a
            r4 = 2131975851(0x7f135eab, float:1.9588806E38)
            goto L_0x00a8
        L_0x0210:
            r4 = 2131962625(0x7f132b01, float:1.956198E38)
            goto L_0x00a8
        L_0x0215:
            r4 = 2131962620(0x7f132afc, float:1.956197E38)
            goto L_0x00a8
        L_0x021a:
            if (r5 == 0) goto L_0x0225
            boolean r0 = r15.A2A()
            r4 = 2131962613(0x7f132af5, float:1.9561956E38)
            if (r0 != 0) goto L_0x00a8
        L_0x0225:
            r4 = 2131962612(0x7f132af4, float:1.9561954E38)
            goto L_0x00a8
        L_0x022a:
            r4 = 2131962622(0x7f132afe, float:1.9561974E38)
            if (r6 != 0) goto L_0x00a8
        L_0x022f:
            r4 = 2131962616(0x7f132af8, float:1.9561962E38)
            goto L_0x00a8
        L_0x0234:
            int r0 = r4.A00
            goto L_0x005f
        L_0x0238:
            int r0 = r4.A03
            goto L_0x005f
        L_0x023c:
            int r0 = r4.A02
            goto L_0x005f
        L_0x0240:
            int r0 = r4.A01
            goto L_0x005f
        L_0x0244:
            r12.setImageResource(r4)
            goto L_0x007b
        L_0x0249:
            X.3aK r0 = r12.A0H
            goto L_0x000b
        L_0x024d:
            java.lang.String r1 = "Unhandled follow type"
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x0255:
            java.lang.String r1 = "Unhandled follow type"
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.user.follow.FollowButtonBase.A05(com.instagram.common.session.UserSession, com.instagram.user.model.FollowStatus, com.instagram.user.model.User, boolean, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(com.instagram.user.model.FollowStatus r5) {
        /*
            r4 = this;
            r1 = 0
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A06
            r2 = -1
            r3 = 1
            if (r5 != r0) goto L_0x004c
            boolean r0 = r4.A07()
            if (r0 == 0) goto L_0x003d
            boolean r0 = r4.A09
            if (r0 != 0) goto L_0x003a
            X.4aq r1 = r4.A0F
            X.4aq r0 = X.C267034aq.PRIMARY
            if (r1 == r0) goto L_0x0037
            X.4aq r0 = X.C267034aq.SECONDARY
            if (r1 == r0) goto L_0x003a
            X.4aq r0 = X.C267034aq.SECONDAY_ALWAYS_LIGHT_AVOID_USING
            if (r1 != r0) goto L_0x0037
            boolean r0 = r4.A0B
            if (r0 == 0) goto L_0x0037
            java.lang.Integer r0 = X.AnonymousClass05K.A15
        L_0x0025:
            r4.A01 = r0
        L_0x0027:
            int r0 = r4.A0D
            if (r0 != r2) goto L_0x002e
            r0 = 2131100036(0x7f060184, float:1.7812442E38)
        L_0x002e:
            r4.A01 = r0
        L_0x0030:
            r4.refreshDrawableState()
            r4.A01()
            return
        L_0x0037:
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            goto L_0x0025
        L_0x003a:
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            goto L_0x0025
        L_0x003d:
            boolean r0 = r4.A07
            if (r0 == 0) goto L_0x0044
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            goto L_0x0025
        L_0x0044:
            boolean r0 = r4.A0B
            r0 = r0 ^ 1
            r4.setIsFollowButtonBlue(r0)
            goto L_0x0027
        L_0x004c:
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A05
            if (r5 == r0) goto L_0x0054
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A07
            if (r5 != r0) goto L_0x0030
        L_0x0054:
            boolean r0 = r4.A07()
            if (r0 == 0) goto L_0x0076
            X.4aq r0 = r4.A0F
            int r1 = r0.ordinal()
            if (r1 == r3) goto L_0x0073
            r0 = 3
            if (r1 == r0) goto L_0x0070
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
        L_0x0067:
            r4.A01 = r0
        L_0x0069:
            int r0 = r4.A0D
            if (r0 != r2) goto L_0x002e
            int r0 = r4.A0K
            goto L_0x002e
        L_0x0070:
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            goto L_0x0067
        L_0x0073:
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            goto L_0x0067
        L_0x0076:
            boolean r0 = r4.A07
            if (r0 == 0) goto L_0x007d
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            goto L_0x0067
        L_0x007d:
            r4.setIsFollowButtonBlue(r1)
            goto L_0x0069
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.user.follow.FollowButtonBase.A06(com.instagram.user.model.FollowStatus):void");
    }

    public final void setBaseStyle(C243923aK r3) {
        boolean z = false;
        0qQ.A0B(r3, 0);
        this.A04 = r3;
        this.A0H = r3;
        if (r3 == C243923aK.MESSAGE_OPTION) {
            z = true;
        }
        this.A0I = z;
    }

    public final void setFollowButtonSize(C267054as r2) {
        int i;
        0qQ.A0B(r2, 0);
        this.A0G = r2;
        if (r2 == C267054as.FULL) {
            i = this.A0L;
        } else {
            i = 0;
        }
        this.A00 = i;
    }

    public final void setPrismButtonVariant(1QG r2) {
        0qQ.A0B(r2, 0);
        this.A03 = r2;
    }

    public final void setPrismStyle(C267034aq r2) {
        0qQ.A0B(r2, 0);
        this.A0F = r2;
    }

    private final void setIsFollowButtonBlue(boolean z) {
        if (this.A09) {
            z = false;
        }
        setIsBlueButton(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        if (r0 == null) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r4 = this;
            boolean r1 = r4 instanceof com.instagram.user.follow.FollowButton
            boolean r0 = r4.A07()
            if (r1 == 0) goto L_0x001a
            if (r0 != 0) goto L_0x0045
            android.graphics.drawable.GradientDrawable r0 = r4.A02
            if (r0 != 0) goto L_0x003e
        L_0x000e:
            boolean r0 = r4.A06
            if (r0 == 0) goto L_0x0019
            r0 = 0
            r4.A06 = r0
            r0 = 0
        L_0x0016:
            r4.setBackground(r0)
        L_0x0019:
            return
        L_0x001a:
            if (r0 != 0) goto L_0x0045
            android.graphics.drawable.GradientDrawable r0 = r4.A02
            if (r0 == 0) goto L_0x000e
            android.content.Context r1 = r4.getContext()
            int r0 = r4.A00
            int r3 = r1.getColor(r0)
            android.graphics.drawable.GradientDrawable r2 = r4.A02
            if (r2 == 0) goto L_0x003c
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131165223(0x7f070027, float:1.7944657E38)
            int r0 = r1.getDimensionPixelOffset(r0)
            r2.setStroke(r0, r3)
        L_0x003c:
            android.graphics.drawable.GradientDrawable r0 = r4.A02
        L_0x003e:
            r4.setBackground(r0)
            r0 = 1
            r4.A06 = r0
            return
        L_0x0045:
            android.graphics.drawable.GradientDrawable r0 = r4.A02
            if (r0 != 0) goto L_0x0050
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r4.A02 = r0
        L_0x0050:
            java.lang.Integer r2 = r4.A01
            java.lang.Integer r3 = X.AnonymousClass05K.A0u
            if (r2 != r3) goto L_0x00c7
            android.content.Context r2 = r4.getContext()
            X.0qQ.A07(r2)
            android.content.res.ColorStateList r0 = X.1QE.A09(r2)
        L_0x0061:
            android.graphics.drawable.GradientDrawable r1 = r4.A02
            if (r1 == 0) goto L_0x0068
            r1.setColor(r0)
        L_0x0068:
            java.lang.Integer r1 = r4.A01
            if (r1 != r3) goto L_0x00a7
            X.0qQ.A07(r2)
            X.1QG r1 = X.1QE.A0E()
            X.1QG r0 = X.1QG.A04
            if (r1 != r0) goto L_0x00ba
            r0 = 2131100458(0x7f06032a, float:1.7813298E38)
        L_0x007a:
            android.content.res.ColorStateList r3 = X.02K.A02(r2, r0)
        L_0x007e:
            android.graphics.drawable.GradientDrawable r2 = r4.A02
            if (r2 == 0) goto L_0x0090
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131165257(0x7f070049, float:1.7944726E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.setStroke(r0, r3)
        L_0x0090:
            android.graphics.drawable.GradientDrawable r2 = r4.A02
            if (r2 == 0) goto L_0x00a3
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131165196(0x7f07000c, float:1.7944602E38)
            int r0 = r1.getDimensionPixelSize(r0)
            float r0 = (float) r0
            r2.setCornerRadius(r0)
        L_0x00a3:
            android.graphics.drawable.GradientDrawable r0 = r4.A02
            goto L_0x0016
        L_0x00a7:
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            if (r1 != r0) goto L_0x00bc
            X.0qQ.A07(r2)
            X.1QG r1 = X.1QE.A0E()
            X.1QG r0 = X.1QG.A04
            if (r1 != r0) goto L_0x00ba
            r0 = 2131100456(0x7f060328, float:1.7813294E38)
            goto L_0x007a
        L_0x00ba:
            r3 = 0
            goto L_0x007e
        L_0x00bc:
            android.graphics.drawable.GradientDrawable r2 = r4.A02
            if (r2 == 0) goto L_0x0090
            r1 = 0
            int r0 = r4.A00
            r2.setStroke(r1, r0)
            goto L_0x0090
        L_0x00c7:
            java.lang.Integer r1 = X.AnonymousClass05K.A15
            r0 = 0
            if (r2 != r1) goto L_0x00cd
            r0 = 1
        L_0x00cd:
            android.content.Context r2 = r4.getContext()
            if (r0 == 0) goto L_0x00db
            X.0qQ.A07(r2)
            android.content.res.ColorStateList r0 = X.1QE.A0A(r2)
            goto L_0x0061
        L_0x00db:
            X.0qQ.A07(r2)
            r0 = 0
            android.content.res.ColorStateList r0 = X.1QE.A0B(r2, r0)
            goto L_0x0061
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.user.follow.FollowButtonBase.A01():void");
    }

    public final void A03() {
        boolean z = this.A0C;
        Resources resources = getResources();
        int i = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
        if (z) {
            i = R.dimen.abc_button_padding_horizontal_material;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        boolean z2 = this.A08;
        int i2 = R.dimen.abc_edit_text_inset_bottom_material;
        if (z2) {
            i2 = R.dimen.accent_edge_thickness;
        }
        int dimensionPixelSize2 = resources.getDimensionPixelSize(i2);
        setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
    }

    public final void A04(int i, boolean z) {
        GradientDrawable gradientDrawable = this.A02;
        if (!(gradientDrawable != null && this.A00 == i && gradientDrawable.getColor() == null) && !A07()) {
            this.A00 = i;
            this.A02 = new GradientDrawable();
            Resources resources = getResources();
            int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.account_recs_header_image_margin);
            GradientDrawable gradientDrawable2 = this.A02;
            if (gradientDrawable2 != null) {
                gradientDrawable2.setCornerRadius((float) resources.getDimensionPixelOffset(R.dimen.abc_button_padding_horizontal_material));
            }
            GradientDrawable gradientDrawable3 = this.A02;
            if (z) {
                if (gradientDrawable3 != null) {
                    gradientDrawable3.setStroke(dimensionPixelOffset, getContext().getColor(this.A00));
                }
            } else if (gradientDrawable3 != null) {
                Context context = getContext();
                gradientDrawable3.setColor(context.getColor(2Yu.A0H(context, R.attr.igds_color_secondary_button_panavision)));
            }
            if (!this.A05) {
                A03();
            }
        }
    }

    public final boolean A07() {
        if (!this.A03.A00 || this.A08 || this.A04 == C243923aK.TEXT_ONLY) {
            return false;
        }
        return true;
    }

    public final GradientDrawable getBorder() {
        return this.A02;
    }

    public final int getBorderColor() {
        return this.A00;
    }

    public final boolean getDisableBasePaddingSetting() {
        return this.A05;
    }

    public final boolean getHadBorderOnLastDraw() {
        return this.A06;
    }

    public final C267064at getHelper() {
        return this.A0J;
    }

    public final 1QG getPrismButtonVariant() {
        return this.A03;
    }

    public final void setCustomForegroundColor(int i) {
        if (!A07()) {
            this.A0E = i;
            this.A0D = i;
        }
    }

    public final void setIsElevated(boolean z) {
        Context context = getContext();
        int i = R.drawable.button_state_drawable_panavision_soft_update;
        if (z) {
            i = R.drawable.button_elevated_state_drawable_panavision_soft_update;
        }
        setBackground(context.getDrawable(i));
    }

    public final void setBorder(GradientDrawable gradientDrawable) {
        this.A02 = gradientDrawable;
    }

    public final void setBorderColor(int i) {
        this.A00 = i;
    }

    public final void setDisableBasePaddingSetting(boolean z) {
        this.A05 = z;
    }

    public final void setDrawableOnRightSide(boolean z) {
        this.A02 = z;
    }

    public final void setHadBorderOnLastDraw(boolean z) {
        this.A06 = z;
    }

    public final void setIsBlackBackground(boolean z) {
        this.A07 = z;
    }

    public final void setIsMediaOverlayButton(boolean z) {
        this.A08 = z;
    }

    public final void setShouldOverrideToGreyBackground(boolean z) {
        this.A09 = z;
    }

    public final void setShouldShowFollowBack(boolean z) {
        this.A0A = z;
    }

    public final void setUseSmallHorizontalPadding(boolean z) {
        this.A0C = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FollowButtonBase(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            r4 = 1
            X.0qQ.A0B(r8, r4)
            r7.<init>(r8, r9, r10)
            r0 = 2130970279(0x7f0406a7, float:1.7549264E38)
            int r0 = X.2Yu.A0H(r8, r0)
            r7.A00 = r0
            r0 = 2130970277(0x7f0406a5, float:1.754926E38)
            int r6 = X.2Yu.A0H(r8, r0)
            r7.A0K = r6
            X.4aq r0 = X.C267034aq.NO_SET
            r7.A0F = r0
            X.1QG r0 = X.1QE.A0E()
            r7.A03 = r0
            int[] r0 = X.C71382cm.A0p
            r1 = 0
            android.content.res.TypedArray r5 = r8.obtainStyledAttributes(r9, r0, r10, r1)
            X.0qQ.A07(r5)
            r0 = 2
            java.lang.String r3 = r5.getNonResourceString(r0)
            r2 = -1
            int r0 = r5.getResourceId(r1, r2)
            r7.A0D = r0
            int r0 = r5.getResourceId(r4, r2)
            r7.A0E = r0
            r2 = 3
            boolean r0 = r5.hasValue(r2)
            if (r0 == 0) goto L_0x004d
            boolean r0 = r5.getBoolean(r2, r1)
            r7.setIsElevated(r0)
        L_0x004d:
            r5.recycle()
            r7.setIncludeFontPadding(r1)
            r7.A01 = r6
            if (r3 == 0) goto L_0x005e
            int r0 = r3.hashCode()
            switch(r0) {
                case -1675226276: goto L_0x008c;
                case -1078030475: goto L_0x009b;
                case -1003783559: goto L_0x00a6;
                case -609832938: goto L_0x00b1;
                case 102742843: goto L_0x00bc;
                case 777739954: goto L_0x00c7;
                case 1538783709: goto L_0x00d2;
                default: goto L_0x005e;
            }
        L_0x005e:
            X.3aK r0 = X.C243923aK.SMALL
        L_0x0060:
            r7.A04 = r0
        L_0x0062:
            r7.A0H = r0
            int r0 = r7.A00
            r7.A0L = r0
            X.4as r0 = X.C267054as.FULL
            r7.A0G = r0
            X.4at r0 = new X.4at
            r0.<init>(r7)
            r7.A0J = r0
            r7.addOnAttachStateChangeListener(r0)
            r0 = 17
            r7.setGravity(r0)
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            android.view.View$AccessibilityDelegate r0 = X.03v.A00(r7)
            if (r0 != 0) goto L_0x008b
            X.2eT r0 = new X.2eT
            r0.<init>(r2, r1)
            X.03v.A0B(r7, r0)
        L_0x008b:
            return
        L_0x008c:
            java.lang.String r0 = "messageOption"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x005e
            X.3aK r0 = X.C243923aK.MESSAGE_OPTION
            r7.A04 = r0
            r7.A0I = r4
            goto L_0x0062
        L_0x009b:
            java.lang.String r0 = "medium"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x005e
            X.3aK r0 = X.C243923aK.MEDIUM
            goto L_0x0060
        L_0x00a6:
            java.lang.String r0 = "textOnly"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x005e
            X.3aK r0 = X.C243923aK.TEXT_ONLY
            goto L_0x0060
        L_0x00b1:
            java.lang.String r0 = "actionbaricon"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x005e
            X.3aK r0 = X.C243923aK.ACTIONBARICON
            goto L_0x0060
        L_0x00bc:
            java.lang.String r0 = "large"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x005e
            X.3aK r0 = X.C243923aK.LARGE
            goto L_0x0060
        L_0x00c7:
            java.lang.String r0 = "inlineIcon"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x005e
            X.3aK r0 = X.C243923aK.INLINE_ICON
            goto L_0x0060
        L_0x00d2:
            java.lang.String r0 = "actionableText"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x005e
            X.3aK r0 = X.C243923aK.ACTIONABLE_TEXT
            goto L_0x0060
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.user.follow.FollowButtonBase.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FollowButtonBase(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
