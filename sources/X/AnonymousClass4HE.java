package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.4HE  reason: invalid class name */
public final class AnonymousClass4HE extends AnonymousClass4HF {
    public final /* synthetic */ C262774Fy A00;
    public final /* synthetic */ C262754Fw A01;
    public final /* synthetic */ AnonymousClass4G8 A02;
    public final /* synthetic */ AnonymousClass3TC A03;
    public final /* synthetic */ AnonymousClass3TR A04;
    public final /* synthetic */ AnonymousClass4DU A05;
    public final /* synthetic */ AnonymousClass3W1 A06;

    public final void DhS(AnonymousClass3TF r4, AnonymousClass3TF r5) {
        0qQ.A0B(r4, 0);
        AnonymousClass3W1 r2 = this.A06;
        if (r4 != r2.A0i) {
            r2.A0i = r4;
            AnonymousClass3W1.A00(r2, 16);
        }
        AnonymousClass4UR r0 = r2.A0s;
        if (r0 != null) {
            r0.A01();
        }
        boolean z = false;
        if (r4 != AnonymousClass3TF.IDLE) {
            z = true;
        }
        r2.A2U = z;
    }

    public AnonymousClass4HE(C262774Fy r1, C262754Fw r2, AnonymousClass4G8 r3, AnonymousClass3TC r4, AnonymousClass3TR r5, AnonymousClass4DU r6, AnonymousClass3W1 r7) {
        this.A04 = r5;
        this.A06 = r7;
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A05 = r6;
    }

    public final void DVx(int i, int i2) {
        AnonymousClass3VD r0;
        0sP r1;
        AnonymousClass3TR r3 = this.A04;
        View A002 = r3.A00();
        if (A002 != null) {
            2eQ.A07(A002, (CharSequence) null);
            this.A06.A0A(i);
            AnonymousClass3TC r2 = this.A03;
            if (C262574Fa.A00(r2.A02, this.A01.A0D) || AnonymousClass3TC.A00(r3)) {
                0kx r22 = new 0kx(r3.A09);
                while (r22.hasNext()) {
                    Object tag = ((View) r22.next()).getTag();
                    if (!(!(tag instanceof C262804Gb) || (r0 = ((C262804Gb) tag).A0I.A04) == null || (r1 = r0.A04) == null)) {
                        r1.invoke(Integer.valueOf(i));
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005d, code lost:
        if (r14 < r6) goto L_0x005f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0142  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DW9(int r24, int r25, boolean r26) {
        /*
            r23 = this;
            r3 = r23
            X.4Fy r9 = r3.A00
            X.4Fw r11 = r3.A01
            X.3TC r2 = r3.A03
            android.content.Context r10 = r2.A01
            r14 = r24
            r9.A01(r10, r11, r14)
            boolean r0 = X.C274244nw.A00()
            r6 = r25
            if (r0 == 0) goto L_0x0042
            if (r25 != 0) goto L_0x0042
            X.0wX r0 = X.C61170le.A00
            X.0xm r0 = X.AnonymousClass0xl.A00(r0)
            X.0xa r1 = r0.A00
            java.lang.String r4 = "number_of_carousels_swiped"
            r0 = 0
            int r0 = r1.getInt(r4, r0)
            X.0xY r1 = r1.AR4()
            int r0 = r0 + 1
            r1.E5Z(r4, r0)
            r1.apply()
            boolean r0 = X.C274244nw.A00()
            if (r0 != 0) goto L_0x0042
            X.4G8 r1 = r3.A02
            r0 = 1241925641(0x4a064809, float:2200066.2)
            X.0fE.A00(r1, r0)
        L_0x0042:
            X.3TA r0 = r2.A04
            r9.A03(r11, r0, r14, r6)
            X.3W1 r7 = r3.A06
            r0 = 0
            r7.A0k = r0
            X.3TR r5 = r3.A04
            android.view.ViewGroup r15 = r5.A06
            X.2eQ.A02(r15)
            if (r24 == 0) goto L_0x015e
            int r0 = r11.A02
            int r0 = r0 + -1
            if (r14 == r0) goto L_0x005f
            if (r14 > r6) goto L_0x015e
            if (r14 >= r6) goto L_0x0063
        L_0x005f:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
        L_0x0061:
            r2.A00 = r0
        L_0x0063:
            boolean r0 = X.C54979HaC.A00(r11, r14)
            if (r0 == 0) goto L_0x00f8
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r1 = r5.A09
            android.view.View r0 = r1.A0F
            if (r0 == 0) goto L_0x00f5
            java.lang.Object r0 = r0.getTag()
        L_0x0073:
            boolean r0 = r0 instanceof X.C279064y1
            if (r0 == 0) goto L_0x00f8
            android.view.View r0 = r1.A0F
            if (r0 == 0) goto L_0x00f3
            java.lang.Object r7 = r0.getTag()
        L_0x007f:
            java.lang.String r4 = "Required value was null."
            if (r7 == 0) goto L_0x0168
            X.4y1 r7 = (X.C279064y1) r7
            com.instagram.common.session.UserSession r6 = r2.A02
            X.3OF r0 = X.AnonymousClass3OE.A00(r6)
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x00ba
            X.2xS r0 = r2.A05
            r9.A05(r11, r7, r0)
        L_0x0096:
            X.4DU r12 = r3.A05
            java.lang.Integer r13 = r2.A00
            r9.A02(r10, r11, r12, r13, r14)
            r0 = 0
            X.0qQ.A0B(r15, r0)
            android.content.Context r14 = r15.getContext()
            X.0qQ.A07(r14)
            com.instagram.common.session.UserSession r2 = r9.A01
            X.1Xj r1 = r11.A0D
            X.3W1 r0 = r11.A0G
            r18 = r12
            r17 = r1
            r19 = r0
            r16 = r2
            X.AnonymousClass4HG.A00(r14, r15, r16, r17, r18, r19)
            return
        L_0x00ba:
            X.3V4 r5 = r7.A0C
            X.4DU r1 = r3.A05
            X.IUO r16 = new X.IUO
            r17 = r9
            r18 = r11
            r20 = r7
            r21 = r14
            r19 = r2
            r16.<init>(r17, r18, r19, r20, r21)
            r22 = 0
            X.2xS r8 = r2.A05
            X.1Xj r0 = r11.A0D
            X.1Xj r0 = r0.A1c(r14)
            if (r0 == 0) goto L_0x00f0
            X.3da r21 = r8.A01(r0)
        L_0x00dd:
            r17 = r1
            r18 = r6
            r19 = r16
            r20 = r5
            X.AnonymousClass4Jq.A01(r17, r18, r19, r20, r21, r22)
            X.3W1 r0 = r7.A01
            if (r0 == 0) goto L_0x0162
            r9.A06(r0)
            goto L_0x0096
        L_0x00f0:
            X.3da r21 = X.C245853da.HIDDEN
            goto L_0x00dd
        L_0x00f3:
            r7 = 0
            goto L_0x007f
        L_0x00f5:
            r0 = 0
            goto L_0x0073
        L_0x00f8:
            boolean r0 = r11.A0L
            r4 = 0
            if (r0 == 0) goto L_0x0142
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r5.A09
            android.view.View r0 = r0.A0F
            if (r0 == 0) goto L_0x016e
            java.lang.Object r7 = r0.getTag()
            if (r7 == 0) goto L_0x016e
            boolean r0 = r7 instanceof X.C279064y1
            if (r0 == 0) goto L_0x012b
            X.2xS r0 = r2.A05
            X.3V3 r7 = (X.AnonymousClass3V3) r7
            X.0qQ.A0B(r7, r4)
            X.2uK r0 = r0.A0G
            X.4Ne r1 = r0.A02
            if (r1 == 0) goto L_0x0122
            r1.A08 = r7
            X.3W1 r0 = r7.BQq()
            r1.A09 = r0
        L_0x0122:
            X.3TS r0 = r5.A08
            com.instagram.ui.widget.slideouticon.SlideInAndOutIconView r0 = r0.A01()
            r0.setVisibility(r4)
        L_0x012b:
            boolean r0 = X.C54979HaC.A00(r11, r6)
            if (r0 == 0) goto L_0x0096
            X.1Xj r1 = r11.A0D
            com.instagram.common.session.UserSession r0 = r2.A02
            boolean r0 = X.C262574Fa.A00(r0, r1)
            if (r0 == 0) goto L_0x0096
            X.2xS r0 = r2.A05
            r0.A05(r1)
            goto L_0x0096
        L_0x0142:
            boolean r0 = X.C54979HaC.A00(r11, r6)
            if (r0 == 0) goto L_0x014f
            X.2xS r1 = r2.A05
            X.1Xj r0 = r11.A0D
            r1.A05(r0)
        L_0x014f:
            r7.A30 = r4
            X.3TS r0 = r5.A08
            com.instagram.ui.widget.slideouticon.SlideInAndOutIconView r1 = r0.A01()
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0096
        L_0x015e:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x0061
        L_0x0162:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x0168:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x016e:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4HE.DW9(int, int, boolean):void");
    }

    public final void DhK(AnonymousClass3TF r10, float f, float f2) {
        C262754Fw r4 = this.A01;
        if (r4.A0N) {
            ReboundViewPager reboundViewPager = this.A04.A09;
            int i = reboundViewPager.A09;
            int i2 = reboundViewPager.A0A;
            float abs = Math.abs(((float) i) - f);
            AnonymousClass3W1 r1 = this.A06;
            r1.A0S = i;
            r1.A0B = i2;
            r1.A01 = abs;
            AnonymousClass3W1.A00(r1, 14);
        }
        AnonymousClass3TC r0 = this.A03;
        AnonymousClass3TR r12 = this.A04;
        1Xj r5 = r4.A0D;
        UserSession userSession = r0.A02;
        if (C262574Fa.A00(userSession, r5) || AnonymousClass3TC.A00(r12)) {
            ReboundViewPager reboundViewPager2 = r12.A09;
            int width = reboundViewPager2.getWidth();
            0Tu r3 = 0Tu.A05;
            float A002 = (float) 182.A00(r3, userSession, 37175209690333808L);
            float A003 = (float) 182.A00(r3, userSession, 37175209689940591L);
            0kx r13 = new 0kx(reboundViewPager2);
            while (r13.hasNext()) {
                Object tag = ((View) r13.next()).getTag();
                if (tag instanceof C262814Gc) {
                    ((C262814Gc) tag).D63(userSession, r5, A002, A003, width);
                }
            }
        }
    }
}
