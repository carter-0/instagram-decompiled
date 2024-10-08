package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;
import java.util.List;

/* renamed from: X.GiH  reason: case insensitive filesystem */
public final class C53083GiH extends 2Rw implements JON, JOO {
    public IntentAwareAdPivotState A00;
    public C54077Gz1 A01;
    public List A02 = AnonymousClass7TE.A1C();
    public RecyclerView A03;
    public final UserSession A04;
    public final Context A05;
    public final AnonymousClass0iw A06;
    public final C228412ld A07;
    public final AnonymousClass2pM A08;
    public final C227802jw A09;

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        0qQ.A0B(recyclerView, 0);
        this.A03 = recyclerView;
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        Context context = this.A05;
        View A092 = DbU.A09(LayoutInflater.from(context), viewGroup, R.layout.intent_aware_ad_rifu_card_view, false);
        C53154GjQ gjQ = new C53154GjQ(A092, context);
        A092.setTag(gjQ);
        return gjQ;
    }

    public final void ED9(int i) {
        if (i < this.A02.size()) {
            this.A02.remove(i);
            notifyItemRemoved(i);
            notifyItemRangeChanged(i, this.A02.size());
            if (this.A02.isEmpty()) {
                C227802jw r1 = this.A09;
                C54077Gz1 gz1 = this.A01;
                String str = "intentAwareAdPivot";
                if (gz1 != null) {
                    r1.A0Q(gz1.getId());
                    C230282pK r2 = this.A08.A08;
                    C54077Gz1 gz12 = this.A01;
                    if (gz12 != null) {
                        IntentAwareAdPivotState intentAwareAdPivotState = this.A00;
                        if (intentAwareAdPivotState == null) {
                            str = "intentAwareAdPivotState";
                        } else {
                            r2.A0D(intentAwareAdPivotState, gz12);
                            return;
                        }
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0339, code lost:
        if (r6 == null) goto L_0x033b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(X.C249703kE r43, int r44) {
        /*
            r42 = this;
            r5 = r43
            r4 = 0
            X.0qQ.A0B(r5, r4)
            boolean r0 = r5 instanceof X.C53154GjQ
            if (r0 == 0) goto L_0x039a
            r1 = r42
            X.2ld r3 = r1.A07
            java.util.List r2 = r1.A02
            r30 = r44
            r0 = r30
            X.1Xj r0 = X.DbZ.A0T(r2, r0)
            X.3W1 r10 = r3.BQr(r0)
            r22 = 1
            r0 = r22
            r10.A2o = r0
            java.util.List r2 = r1.A02
            r0 = r30
            X.1Xj r0 = X.DbZ.A0T(r2, r0)
            boolean r0 = r0.A5D()
            if (r0 == 0) goto L_0x0033
            r10.A0B(r4)
        L_0x0033:
            com.instagram.common.session.UserSession r3 = r1.A04
            android.content.Context r2 = r1.A05
            X.GjQ r5 = (X.C53154GjQ) r5
            X.0iw r0 = r1.A06
            r21 = r0
            X.Gz1 r14 = r1.A01
            if (r14 != 0) goto L_0x004b
            java.lang.String r0 = "intentAwareAdPivot"
        L_0x0043:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x004b:
            java.util.List r11 = r1.A02
            X.2jw r0 = r1.A09
            r41 = r0
            X.Hiu r20 = new X.Hiu
            r0 = r20
            r0.<init>(r1)
            com.instagram.feed.ui.state.IntentAwareAdPivotState r0 = r1.A00
            r19 = r0
            if (r0 != 0) goto L_0x0061
            java.lang.String r0 = "intentAwareAdPivotState"
            goto L_0x0043
        L_0x0061:
            X.2pM r12 = r1.A08
            r0 = 2
            X.0qQ.A0B(r5, r0)
            r18 = 4
            r0 = 5
            X.0qQ.A0B(r11, r0)
            android.view.View r0 = r5.A02
            r34 = r0
            r24 = r0
            r25 = r19
            r26 = r14
            r27 = r30
            r28 = r4
            r23 = r12
            r23.A00(r24, r25, r26, r27, r28)
            r0 = r30
            java.lang.Object r6 = r11.get(r0)
            X.1Xj r6 = (X.1Xj) r6
            r5.A01 = r10
            r5.A00 = r6
            int r0 = r14.A00
            X.4I5 r7 = X.AnonymousClass59V.A00
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            boolean r0 = r7.A02(r9)
            if (r0 == 0) goto L_0x00a7
            X.0Tu r8 = X.0Tu.A06
            r0 = 36312887638361527(0x810261007405b7, double:3.027754590537339E-306)
            boolean r0 = X.182.A06(r8, r3, r0)
            if (r0 != 0) goto L_0x00ba
        L_0x00a7:
            boolean r0 = r7.A01(r9)
            if (r0 == 0) goto L_0x00f5
            X.0Tu r8 = X.0Tu.A06
            r0 = 36312887642031592(0x81026100ac05e8, double:3.027754592858303E-306)
            boolean r0 = X.182.A06(r8, r3, r0)
            if (r0 == 0) goto L_0x00f5
        L_0x00ba:
            androidx.constraintlayout.widget.ConstraintLayout r8 = r5.A04
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            android.content.res.Resources r9 = r2.getResources()
            r0 = 2131165609(0x7f0701a9, float:1.794544E38)
            r13 = 2131165609(0x7f0701a9, float:1.794544E38)
            int r0 = r9.getDimensionPixelSize(r0)
            r1.width = r0
            android.content.res.Resources r0 = r2.getResources()
            r9 = 2131165608(0x7f0701a8, float:1.7945438E38)
            int r0 = r0.getDimensionPixelSize(r9)
            r1.height = r0
            r8.setLayoutParams(r1)
            com.instagram.common.ui.base.IgFrameLayout r8 = r5.A08
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            int r0 = X.AnonymousClass7TF.A02(r2, r13)
            r1.width = r0
            int r0 = X.AnonymousClass7TF.A02(r2, r9)
            r1.height = r0
            r8.setLayoutParams(r1)
        L_0x00f5:
            androidx.constraintlayout.widget.ConstraintLayout r1 = r5.A04
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            int r13 = r0.width
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            int r8 = r0.height
            float r0 = r6.A0l()
            r17 = 1062165545(0x3f4f5c29, float:0.81)
            int r0 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r0 < 0) goto L_0x013f
            java.lang.String r0 = r6.A2u()
            if (r0 == 0) goto L_0x0134
            java.lang.String r0 = r6.A2t()
            if (r0 == 0) goto L_0x0134
            com.instagram.common.ui.base.IgFrameLayout r1 = r5.A07
            java.lang.String r0 = r6.A2u()
            int r0 = android.graphics.Color.parseColor(r0)
            r1.setBackgroundColor(r0)
            com.instagram.common.ui.base.IgFrameLayout r1 = r5.A06
            java.lang.String r0 = r6.A2t()
            int r0 = android.graphics.Color.parseColor(r0)
            r1.setBackgroundColor(r0)
        L_0x0134:
            double r0 = (double) r13
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            float r8 = r6.A0l()
            double r8 = (double) r8
            double r15 = r15 / r8
            double r0 = r0 * r15
            int r8 = (int) r0
        L_0x013f:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            int r15 = r1.intValue()
            int r0 = r0.intValue()
            com.instagram.common.ui.widget.imageview.IgImageView r9 = r5.A0B
            X.C51972G9s.A0x(r9, r15, r0)
            com.instagram.ui.simplevideolayout.SimpleVideoLayout r8 = r5.A0D
            X.C51972G9s.A0x(r8, r15, r0)
            java.lang.String r13 = X.C231122qu.A07(r3, r6)
            if (r13 == 0) goto L_0x0395
            java.util.Map r1 = r14.A0C
            boolean r16 = r1.containsKey(r13)
            if (r16 != 0) goto L_0x0180
            float r15 = (float) r15
            float r15 = X.0nA.A01(r2, r15)
            java.lang.Float r15 = java.lang.Float.valueOf(r15)
            float r0 = (float) r0
            float r0 = X.0nA.A01(r2, r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            X.0eP r0 = X.AnonymousClass7TE.A1L(r15, r0)
            r1.put(r13, r0)
        L_0x0180:
            X.2pK r0 = r12.A08
            r33 = r0
            com.instagram.common.ui.widget.imageview.CircularImageView r12 = r5.A0A
            X.3Ds r1 = X.C238863Ds.STORY_HEADER
            X.3Dp r0 = X.C238833Dp.A00(r3)
            r0.A05(r12, r1)
            X.3Dp r1 = X.C238833Dp.A00(r3)
            r0 = r21
            X.4DU r0 = (X.AnonymousClass4DU) r0
            r32 = r0
            X.3W1 r13 = new X.3W1
            r13.<init>()
            boolean r0 = r6.A5D()
            if (r0 == 0) goto L_0x01a7
            r13.A0B(r4)
        L_0x01a7:
            r0 = r32
            X.3e7 r0 = X.C51971G9r.A0f(r2, r13, r3, r6, r0)
            r1.A0A(r12, r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A15
            X.2eS.A04(r12, r1)
            r12.setVisibility(r4)
            r0 = 2131964416(0x7f133200, float:1.9565613E38)
            com.instagram.user.model.User r13 = r6.A2A(r3)
            java.lang.String r16 = "Required value was null."
            if (r13 == 0) goto L_0x0390
            java.lang.String r13 = r13.B8Q()
            java.lang.String r13 = X.DbW.A0h(r2, r13, r0)
            r12.setContentDescription(r13)
            com.instagram.user.model.User r15 = r6.A2A(r3)
            if (r15 == 0) goto L_0x038b
            r13 = r21
            X.DbU.A1S(r13, r12, r15)
            r37 = 0
            X.IsF r38 = X.C58458IsF.A00
            X.Ixt r23 = new X.Ixt
            r26 = r41
            r27 = r19
            r28 = r6
            r29 = r14
            r31 = r18
            r24 = r10
            r25 = r33
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31)
            X.3aW r10 = new X.3aW
            r35 = r10
            r36 = r3
            r39 = r23
            r40 = r22
            r35.<init>(r36, r37, r38, r39, r40)
            X.AnonymousClass0fU.A00(r10, r12)
            r10 = r30
            java.lang.Object r13 = r11.get(r10)
            X.1Xj r13 = (X.1Xj) r13
            com.instagram.common.ui.base.IgFrameLayout r10 = r5.A08
            r15 = r10
            int r10 = r10.getWidth()
            com.instagram.model.mediasize.ExtendedImageUrl r12 = r13.A1m(r10)
            if (r12 == 0) goto L_0x0386
            r31 = 3
            X.FOy r10 = new X.FOy
            r23 = r10
            r24 = r13
            r25 = r19
            r26 = r14
            r27 = r33
            r28 = r41
            r29 = r11
            r23.<init>((X.1Xj) r24, (com.instagram.feed.ui.state.IntentAwareAdPivotState) r25, (X.C54077Gz1) r26, (X.C230282pK) r27, (X.C227802jw) r28, (java.util.List) r29, (int) r30, (int) r31)
            X.2eS.A04(r9, r1)
            com.instagram.user.model.User r1 = r13.A2A(r3)
            if (r1 == 0) goto L_0x02e8
            java.lang.String r1 = r1.B8Q()
        L_0x0237:
            java.lang.String r0 = X.DbW.A0h(r2, r1, r0)
            r9.setContentDescription(r0)
            X.3gz r0 = new X.3gz
            r0.<init>()
            r9.A0A = r0
            java.lang.String r0 = r13.BTL()
            r9.A0K = r0
            r0 = r21
            r9.setUrl(r12, r0)
            X.AnonymousClass0fU.A00(r10, r9)
            r9.setVisibility(r4)
            X.AnonymousClass0fU.A00(r10, r15)
            boolean r0 = r6.CeS()
            if (r0 != 0) goto L_0x026d
            X.1Xj r0 = r6.A1c(r4)
            if (r0 == 0) goto L_0x02e2
            boolean r1 = r0.CeS()
            r0 = r22
            if (r1 != r0) goto L_0x02e2
        L_0x026d:
            r8.setVisibility(r4)
        L_0x0270:
            com.instagram.common.ui.widget.imageview.IgImageView r8 = r5.A0C
            X.2eS.A01(r8)
            android.content.Context r1 = r8.getContext()
            r0 = 2131969495(0x7f1345d7, float:1.9575914E38)
            X.DbU.A12(r1, r8, r0)
            X.ICQ r0 = new X.ICQ
            r23 = r0
            r24 = r6
            r25 = r20
            r26 = r19
            r27 = r41
            r28 = r30
            r29 = r22
            r23.<init>(r24, r25, r26, r27, r28, r29)
            X.AnonymousClass0fU.A00(r0, r8)
            int r0 = r14.A00
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            boolean r0 = r7.A02(r9)
            if (r0 == 0) goto L_0x02ae
            X.0Tu r8 = X.0Tu.A06
            r0 = 36312887641114076(0x810261009e05dc, double:3.027754592278062E-306)
            boolean r0 = X.182.A06(r8, r3, r0)
            if (r0 != 0) goto L_0x02c1
        L_0x02ae:
            boolean r0 = r7.A01(r9)
            if (r0 == 0) goto L_0x02eb
            X.0Tu r7 = X.0Tu.A06
            r0 = 36312887641769445(0x81026100a805e5, double:3.02775459269252E-306)
            boolean r0 = X.182.A06(r7, r3, r0)
            if (r0 == 0) goto L_0x02eb
        L_0x02c1:
            com.instagram.common.ui.base.IgTextView r1 = r5.A09
            r0 = r18
            r1.setVisibility(r0)
            java.lang.String r0 = r6.A2t()
            if (r0 != 0) goto L_0x02dd
            float r0 = r6.A0l()
            int r0 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r0 < 0) goto L_0x02dd
            com.instagram.common.ui.base.IgFrameLayout r1 = r5.A05
            r0 = 0
        L_0x02d9:
            r1.setVisibility(r0)
            return
        L_0x02dd:
            com.instagram.common.ui.base.IgFrameLayout r1 = r5.A05
            r0 = 8
            goto L_0x02d9
        L_0x02e2:
            r0 = 8
            r8.setVisibility(r0)
            goto L_0x0270
        L_0x02e8:
            r1 = 0
            goto L_0x0237
        L_0x02eb:
            r0 = r30
            X.1Xj r1 = X.DbZ.A0T(r11, r0)
            X.3Ds r7 = X.C238863Ds.ATTACHMENT
            X.3Dp r6 = X.C238833Dp.A00(r3)
            r0 = r34
            r6.A05(r0, r7)
            X.3Dp r7 = X.C238833Dp.A00(r3)
            X.3W1 r6 = new X.3W1
            r6.<init>()
            boolean r0 = r1.A5D()
            if (r0 == 0) goto L_0x030e
            r6.A0B(r4)
        L_0x030e:
            r0 = r32
            X.3e7 r6 = X.C51971G9r.A0f(r2, r6, r3, r1, r0)
            r0 = r34
            r7.A0A(r0, r6)
            X.1Xy r0 = r1.A0C
            java.lang.String r6 = r0.BMq()
            boolean r0 = r1.A5D()
            if (r0 == 0) goto L_0x0339
            java.util.List r0 = X.C51966G9m.A1I(r1)
            if (r0 == 0) goto L_0x033b
            java.lang.Object r0 = X.00k.A0J(r0)
            X.1Xj r0 = (X.1Xj) r0
            if (r0 == 0) goto L_0x033b
            X.1Xy r0 = r0.A0C
            java.lang.String r6 = r0.BMq()
        L_0x0339:
            if (r6 != 0) goto L_0x0342
        L_0x033b:
            r0 = 2131957519(0x7f13170f, float:1.9551624E38)
            java.lang.String r6 = X.AnonymousClass7TE.A16(r2, r0)
        L_0x0342:
            X.IsE r38 = X.C58457IsE.A00
            X.GA0 r29 = new X.GA0
            r32 = r14
            r34 = r1
            r35 = r19
            r36 = r41
            r29.<init>(r30, r31, r32, r33, r34, r35, r36)
            X.3aW r0 = new X.3aW
            r35 = r0
            r36 = r3
            r39 = r29
            r35.<init>(r36, r37, r38, r39, r40)
            com.instagram.common.ui.base.IgTextView r3 = r5.A09
            X.2eS.A01(r3)
            r3.setText(r6)
            r3.setContentDescription(r6)
            X.AnonymousClass0fU.A00(r0, r3)
            com.instagram.common.ui.base.IgFrameLayout r1 = r5.A05
            r0 = 2131239056(0x7f082090, float:1.8094408E38)
            r1.setBackgroundResource(r0)
            android.widget.Space r0 = r5.A03
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.content.res.Resources r0 = r2.getResources()
            int r0 = X.AnonymousClass7TE.A0C(r0)
            r1.height = r0
            r3.setVisibility(r4)
            return
        L_0x0386:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x038b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x0390:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x0395:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x039a:
            java.lang.String r0 = "Unexpected ViewHolder type"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53083GiH.onBindViewHolder(X.3kE, int):void");
    }

    public C53083GiH(Context context, AnonymousClass0iw r4, UserSession userSession, C228412ld r6, AnonymousClass2pM r7, C227802jw r8) {
        boolean A1Y = DbW.A1Y(context);
        this.A04 = userSession;
        this.A05 = context;
        this.A06 = r4;
        this.A08 = r7;
        this.A09 = r8;
        this.A07 = r6;
        setHasStableIds(A1Y);
    }

    public final void EuM() {
        C53154GjQ gjQ;
        int itemCount = getItemCount();
        if (itemCount >= 0) {
            int i = 0;
            while (true) {
                RecyclerView recyclerView = this.A03;
                C249703kE r1 = null;
                if (recyclerView != null) {
                    r1 = recyclerView.A0W(i);
                }
                if ((r1 instanceof C53154GjQ) && (gjQ = (C53154GjQ) r1) != null) {
                    if (this.A01 == null) {
                        0qQ.A0F("intentAwareAdPivot");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    C55047HbI.A00(gjQ.A09);
                }
                if (i != itemCount) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(667652370);
        int size = this.A02.size();
        AnonymousClass0fD.A0A(1215558779, A032);
        return size;
    }

    public final long getItemId(int i) {
        int A032 = AnonymousClass0fD.A03(1379124617);
        String A2n = DbZ.A0T(this.A02, i).A2n();
        if (A2n != null) {
            long parseLong = Long.parseLong(A2n);
            AnonymousClass0fD.A0A(1666335238, A032);
            return parseLong;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0A(-1342345955, A032);
        throw A0y;
    }
}
