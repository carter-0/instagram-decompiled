package X;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;
import java.util.List;

/* renamed from: X.GiG  reason: case insensitive filesystem */
public final class C53082GiG extends 2Rw implements JON {
    public RecyclerView A00;
    public IntentAwareAdPivotState A01;
    public C54077Gz1 A02;
    public C53109Gih A03;
    public List A04 = AnonymousClass7TE.A1C();
    public final Context A05;
    public final Handler A06 = AnonymousClass7TF.A0D();
    public final ViewPager2 A07;
    public final UserSession A08;
    public final AnonymousClass2pM A09;
    public final boolean A0A;
    public final AnonymousClass0iw A0B;
    public final C228412ld A0C;
    public final C227802jw A0D;

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        0qQ.A0B(recyclerView, 0);
        this.A00 = recyclerView;
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        UserSession userSession = this.A08;
        Context context = this.A05;
        View A092 = DbU.A09(LayoutInflater.from(context), viewGroup, R.layout.intent_aware_ad_pivot_card_view, false);
        C53155GjR gjR = new C53155GjR(context, A092, userSession);
        A092.setTag(gjR);
        return gjR;
    }

    public final void ED9(int i) {
        int A0A2 = C51970G9q.A0A(this.A04);
        this.A04.remove(i);
        notifyItemRemoved(i);
        notifyItemRangeChanged(i, this.A04.size());
        if (this.A04.isEmpty()) {
            C227802jw r1 = this.A0D;
            C54077Gz1 gz1 = this.A02;
            if (gz1 != null) {
                r1.A0Q(gz1.getId());
                C230282pK r2 = this.A09.A08;
                C54077Gz1 gz12 = this.A02;
                if (gz12 != null) {
                    IntentAwareAdPivotState intentAwareAdPivotState = this.A01;
                    if (intentAwareAdPivotState != null) {
                        r2.A0D(intentAwareAdPivotState, gz12);
                    }
                    0qQ.A0F("intentAwareAdPivotState");
                    throw AnonymousClass00P.createAndThrow();
                }
            }
            0qQ.A0F("intentAwareAdPivot");
            throw AnonymousClass00P.createAndThrow();
        }
        C53109Gih gih = this.A03;
        if (gih != null) {
            if (i == A0A2) {
                IntentAwareAdPivotState intentAwareAdPivotState2 = this.A01;
                if (intentAwareAdPivotState2 != null) {
                    intentAwareAdPivotState2.A01 = C51970G9q.A0A(this.A04);
                }
                0qQ.A0F("intentAwareAdPivotState");
                throw AnonymousClass00P.createAndThrow();
            }
            Context context = this.A05;
            int size = this.A04.size();
            IntentAwareAdPivotState intentAwareAdPivotState3 = this.A01;
            if (intentAwareAdPivotState3 != null) {
                C55046HbH.A00(context, gih, size, intentAwareAdPivotState3.A01);
                return;
            }
            0qQ.A0F("intentAwareAdPivotState");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: com.instagram.common.ui.widget.imageview.IgImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v2, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0408  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(X.C249703kE r46, int r47) {
        /*
            r45 = this;
            r6 = r46
            r3 = 0
            X.0qQ.A0B(r6, r3)
            boolean r0 = r6 instanceof X.C53155GjR
            if (r0 == 0) goto L_0x0417
            r4 = r45
            X.2ld r1 = r4.A0C
            java.util.List r0 = r4.A04
            r8 = r47
            X.1Xj r0 = X.DbZ.A0T(r0, r8)
            X.3W1 r0 = r1.BQr(r0)
            r25 = 1
            r1 = r25
            r0.A2o = r1
            java.util.List r1 = r4.A04
            X.1Xj r1 = X.DbZ.A0T(r1, r8)
            boolean r1 = r1.A5D()
            if (r1 == 0) goto L_0x002f
            r0.A0B(r3)
        L_0x002f:
            com.instagram.common.session.UserSession r2 = r4.A08
            android.content.Context r5 = r4.A05
            X.GjR r6 = (X.C53155GjR) r6
            X.0iw r1 = r4.A0B
            r44 = r1
            X.Gz1 r1 = r4.A02
            r24 = r1
            if (r1 != 0) goto L_0x0049
            java.lang.String r0 = "intentAwareAdPivot"
        L_0x0041:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0049:
            java.util.List r7 = r4.A04
            X.2jw r1 = r4.A0D
            r43 = r1
            X.Hiu r15 = new X.Hiu
            r15.<init>(r4)
            com.instagram.feed.ui.state.IntentAwareAdPivotState r1 = r4.A01
            r23 = r1
            if (r1 != 0) goto L_0x005d
            java.lang.String r0 = "intentAwareAdPivotState"
            goto L_0x0041
        L_0x005d:
            X.2pM r13 = r4.A09
            boolean r1 = r4.A0A
            r16 = r1
            r22 = 2
            r1 = r22
            X.0qQ.A0B(r6, r1)
            r11 = 5
            X.0qQ.A0B(r7, r11)
            android.view.View r10 = r6.A03
            r26 = r13
            r27 = r10
            r28 = r23
            r29 = r24
            r30 = r8
            r31 = r25
            r26.A00(r27, r28, r29, r30, r31)
            X.3W1 r1 = r6.A01
            if (r1 == 0) goto L_0x0091
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0091
            X.3W1 r4 = r6.A01
            if (r4 == 0) goto L_0x0091
            r1 = 0
            r4.A0M(r6, r1, r3)
        L_0x0091:
            java.lang.Object r4 = r7.get(r8)
            X.1Xj r4 = (X.1Xj) r4
            r6.A01 = r0
            r6.A00 = r4
            X.3Ds r28 = X.C238863Ds.ATTACHMENT
            r26 = r5
            r29 = r44
            r30 = r2
            r31 = r4
            X.I5V.A01(r26, r27, r28, r29, r30, r31)
            X.2pK r1 = r13.A08
            r42 = r1
            androidx.constraintlayout.widget.ConstraintLayout r9 = r6.A04
            X.3Ds r35 = X.C238863Ds.STORY_HEADER
            r33 = r5
            r34 = r9
            r36 = r44
            r37 = r2
            r38 = r4
            X.I5V.A01(r33, r34, r35, r36, r37, r38)
            X.IsC r39 = X.C58455IsC.A00
            X.Ixt r26 = new X.Ixt
            r27 = r0
            r28 = r1
            r29 = r43
            r30 = r23
            r32 = r24
            r33 = r8
            r34 = r22
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34)
            r21 = 0
            X.3aW r1 = new X.3aW
            r36 = r1
            r38 = r21
            r40 = r26
            r41 = r25
            r36.<init>(r37, r38, r39, r40, r41)
            X.AnonymousClass0fU.A00(r1, r9)
            com.instagram.common.ui.widget.imageview.CircularImageView r12 = r6.A0D
            r33 = r5
            r34 = r12
            r36 = r44
            r38 = r4
            X.I5V.A01(r33, r34, r35, r36, r37, r38)
            java.lang.Integer r9 = X.AnonymousClass05K.A15
            X.2eS.A04(r12, r9)
            r20 = 2131964416(0x7f133200, float:1.9565613E38)
            com.instagram.user.model.User r1 = r4.A2A(r2)
            java.lang.String r19 = "Required value was null."
            if (r1 == 0) goto L_0x0412
            java.lang.String r14 = r1.B8Q()
            r1 = r20
            java.lang.String r1 = X.DbW.A0h(r5, r14, r1)
            r12.setContentDescription(r1)
            com.instagram.user.model.User r14 = r4.A2A(r2)
            if (r14 == 0) goto L_0x040d
            r1 = r44
            X.DbU.A1S(r1, r12, r14)
            X.IsB r39 = X.C58454IsB.A00
            X.Ixt r26 = new X.Ixt
            r33 = r8
            r34 = r25
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34)
            X.3aW r1 = new X.3aW
            r36 = r1
            r38 = r21
            r40 = r26
            r36.<init>(r37, r38, r39, r40, r41)
            X.AnonymousClass0fU.A00(r1, r12)
            X.3aa r1 = X.C244063aa.PROFILE_IMAGE
            X.C244083ac.A05(r12, r1)
            com.instagram.user.model.User r1 = r4.A2A(r2)
            if (r1 == 0) goto L_0x03f7
            boolean r12 = r1.A2Q()
            r1 = r25
            if (r12 != r1) goto L_0x03f7
            com.instagram.common.ui.base.IgTextView r1 = r6.A0C
            java.lang.String r12 = X.C231122qu.A0G(r2, r4)
        L_0x014b:
            r1.setText(r12)
            X.3aa r12 = X.C244063aa.TITLE
            X.C244083ac.A05(r1, r12)
            r33 = r5
            r34 = r1
            r36 = r44
            r38 = r4
            X.I5V.A01(r33, r34, r35, r36, r37, r38)
            X.IsD r35 = X.C58456IsD.A00
            r34 = 3
            X.Ixt r26 = new X.Ixt
            r33 = r8
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34)
            X.3aW r0 = new X.3aW
            r32 = r0
            r33 = r2
            r34 = r21
            r36 = r26
            r37 = r25
            r32.<init>(r33, r34, r35, r36, r37)
            X.AnonymousClass0fU.A00(r0, r1)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r6.A0F
            X.2eS.A01(r1)
            r0 = 2131969495(0x7f1345d7, float:1.9575914E38)
            X.DbU.A12(r5, r1, r0)
            X.ICY r0 = new X.ICY
            r26 = r0
            r27 = r8
            r28 = r3
            r29 = r23
            r30 = r15
            r31 = r43
            r32 = r4
            r33 = r13
            r26.<init>(r27, r28, r29, r30, r31, r32, r33)
            X.AnonymousClass0fU.A00(r0, r1)
            java.lang.Object r12 = r7.get(r8)
            X.1Xj r12 = (X.1Xj) r12
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131165550(0x7f07016e, float:1.794532E38)
            int r14 = r1.getDimensionPixelSize(r0)
            int r13 = X.AnonymousClass7TF.A02(r5, r0)
            if (r16 != 0) goto L_0x01c2
            X.0Tu r15 = X.0Tu.A05
            r0 = 36312887637968306(0x810261006e05b2, double:3.0277545902886645E-306)
            boolean r0 = X.182.A06(r15, r2, r0)
            if (r0 == 0) goto L_0x03d7
        L_0x01c2:
            r1 = -1
            int r0 = X.I5V.A00
            if (r0 != 0) goto L_0x03cf
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerLinearLayout r0 = r6.A0I
            X.C51968G9o.A1D(r0, r1)
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            X.IDy r0 = new X.IDy
            r0.<init>(r11, r2, r12, r6)
            r1.addOnGlobalLayoutListener(r0)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r14)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
        L_0x01e0:
            X.0eP r0 = X.AnonymousClass7TE.A1L(r11, r0)
            int r11 = X.C51970G9q.A0B(r0)
            int r18 = X.C51969G9p.A0A(r0)
            com.instagram.model.mediasize.ExtendedImageUrl r13 = r12.A1m(r11)
            if (r13 == 0) goto L_0x0408
            com.instagram.common.ui.widget.imageview.IgImageView r14 = r6.A0E
            X.2eS.A04(r14, r9)
            X.0Tu r9 = X.0Tu.A05
            r16 = 36314871905651563(0x81042f00000b6b, double:3.029009449161561E-306)
            r0 = r16
            boolean r0 = X.182.A06(r9, r2, r0)
            if (r0 == 0) goto L_0x020f
            X.3Dp r1 = X.C238833Dp.A00(r2)
            X.3Ds r0 = X.C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON
            r1.A05(r10, r0)
        L_0x020f:
            X.ICg r0 = new X.ICg
            r30 = r24
            r31 = r42
            r32 = r6
            r33 = r43
            r34 = r7
            r35 = r8
            r36 = r25
            r26 = r0
            r27 = r2
            r28 = r12
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            com.instagram.user.model.User r1 = r12.A2A(r2)
            if (r1 == 0) goto L_0x03cc
            java.lang.String r15 = r1.B8Q()
        L_0x0232:
            r1 = r20
            java.lang.String r1 = X.DbW.A0h(r5, r15, r1)
            r14.setContentDescription(r1)
            X.3gz r1 = new X.3gz
            r1.<init>()
            r14.A0A = r1
            java.lang.String r1 = r12.BTL()
            r14.A0K = r1
            r1 = r44
            r14.setUrl(r13, r1)
            X.AnonymousClass0fU.A00(r0, r14)
            r14.setVisibility(r3)
            X.3aa r13 = X.C244063aa.MEDIA
            X.C244083ac.A05(r14, r13)
            com.instagram.ui.simplevideolayout.SimpleVideoLayout r1 = r6.A0H
            X.AnonymousClass0fU.A00(r0, r1)
            java.lang.String r12 = X.C231122qu.A07(r2, r12)
            if (r12 == 0) goto L_0x0403
            r0 = r24
            java.util.Map r14 = r0.A0C
            boolean r0 = r14.containsKey(r12)
            if (r0 != 0) goto L_0x0288
            float r0 = (float) r11
            float r0 = X.0nA.A01(r5, r0)
            java.lang.Float r11 = java.lang.Float.valueOf(r0)
            r0 = r18
            float r0 = (float) r0
            float r0 = X.0nA.A01(r5, r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            X.0eP r0 = X.AnonymousClass7TE.A1L(r11, r0)
            r14.put(r12, r0)
        L_0x0288:
            boolean r0 = r4.CeS()
            if (r0 != 0) goto L_0x029c
            X.1Xj r0 = r4.A1c(r3)
            if (r0 == 0) goto L_0x03c5
            boolean r4 = r0.CeS()
            r0 = r25
            if (r4 != r0) goto L_0x03c5
        L_0x029c:
            r1.setVisibility(r3)
            X.C244083ac.A05(r1, r13)
        L_0x02a2:
            java.lang.Object r12 = r7.get(r8)
            X.1Xj r12 = (X.1Xj) r12
            X.1Xy r0 = r12.A0C
            java.lang.String r11 = r0.BMq()
            boolean r0 = r12.A5D()
            if (r0 == 0) goto L_0x02c8
            java.util.List r0 = X.C51966G9m.A1I(r12)
            if (r0 == 0) goto L_0x03c2
            java.lang.Object r0 = X.00k.A0J(r0)
            X.1Xj r0 = (X.1Xj) r0
            if (r0 == 0) goto L_0x03c2
            X.1Xy r0 = r0.A0C
            java.lang.String r11 = r0.BMq()
        L_0x02c8:
            r0 = r16
            boolean r0 = X.182.A06(r9, r2, r0)
            if (r0 == 0) goto L_0x02d9
            X.3Dp r1 = X.C238833Dp.A00(r2)
            X.3Ds r0 = X.C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON
            r1.A05(r10, r0)
        L_0x02d9:
            if (r11 != 0) goto L_0x02e2
            r0 = 2131957519(0x7f13170f, float:1.9551624E38)
            java.lang.String r11 = X.AnonymousClass7TE.A16(r5, r0)
        L_0x02e2:
            X.ICg r4 = new X.ICg
            r29 = r24
            r30 = r42
            r31 = r6
            r32 = r43
            r33 = r7
            r34 = r8
            r35 = r3
            r25 = r4
            r26 = r2
            r27 = r12
            r28 = r23
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            com.instagram.igds.components.button.IgdsButton r1 = r6.A0G
            X.2eS.A01(r1)
            com.instagram.common.ui.base.IgLinearLayout r0 = r6.A08
            r0.setVisibility(r3)
            r1.setText((java.lang.String) r11)
            r1.setContentDescription(r11)
            X.AnonymousClass0fU.A00(r4, r1)
            android.widget.TextView r1 = r1.A0A
            X.3aa r0 = X.C244063aa.CTA
            X.C244083ac.A05(r1, r0)
            r0 = 36312887633118593(0x81026100240581, double:3.0277545872216865E-306)
            boolean r0 = X.182.A06(r9, r2, r0)
            if (r0 == 0) goto L_0x0352
            java.lang.Object r5 = r7.get(r8)
            X.1Xj r5 = (X.1Xj) r5
            com.instagram.common.ui.base.IgFrameLayout r4 = r6.A06
            r4.setVisibility(r3)
            com.instagram.common.ui.base.IgTextView r1 = r6.A0A
            X.3gp r0 = r5.A1T()
            if (r0 == 0) goto L_0x03bf
            java.lang.String r0 = r0.A0d
        L_0x0337:
            r1.setText(r0)
            X.FOy r0 = new X.FOy
            r11 = r0
            r12 = r5
            r13 = r23
            r14 = r24
            r15 = r42
            r16 = r43
            r17 = r7
            r18 = r8
            r19 = r22
            r11.<init>((X.1Xj) r12, (com.instagram.feed.ui.state.IntentAwareAdPivotState) r13, (X.C54077Gz1) r14, (X.C230282pK) r15, (X.C227802jw) r16, (java.util.List) r17, (int) r18, (int) r19)
            X.AnonymousClass0fU.A00(r0, r4)
        L_0x0352:
            r0 = 36328783304736341(0x8110d600003e55, double:3.0378070739594824E-306)
            boolean r0 = X.182.A06(r9, r2, r0)
            if (r0 == 0) goto L_0x03be
            java.util.WeakHashMap r4 = new java.util.WeakHashMap
            r4.<init>()
            r0 = 36328783304801878(0x8110d600013e56, double:3.037807074000928E-306)
            boolean r17 = X.182.A06(r9, r2, r0)
            r0 = 36328783304867415(0x8110d600023e57, double:3.037807074042374E-306)
            boolean r18 = X.182.A06(r9, r2, r0)
            r16 = 508(0x1fc, float:7.12E-43)
            X.49S r5 = new X.49S
            r11 = r5
            r12 = r21
            r13 = r12
            r14 = r12
            r15 = r12
            r19 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            X.49W r3 = X.AnonymousClass49V.A00(r2, r5)
            boolean r0 = r4.containsKey(r10)
            if (r0 == 0) goto L_0x0398
            java.lang.Object r1 = r4.get(r10)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0398
            r3.A01(r1, r12)
        L_0x0398:
            java.lang.String r0 = r24.getId()
            r4.put(r10, r0)
            java.lang.String r13 = r24.getId()
            r24.C9L()
            java.lang.String r11 = "feed_multi_ads"
            java.lang.String r12 = r44.getModuleName()
            X.GAN r2 = new X.GAN
            r8 = r2
            r9 = r10
            r10 = r5
            r8.<init>(r9, r10, r11, r12, r13)
            X.Ic6 r1 = new X.Ic6
            r0 = r24
            r1.<init>(r0)
            r3.A00(r14, r1, r2)
        L_0x03be:
            return
        L_0x03bf:
            r0 = 0
            goto L_0x0337
        L_0x03c2:
            r11 = 0
            goto L_0x02c8
        L_0x03c5:
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x02a2
        L_0x03cc:
            r15 = 0
            goto L_0x0232
        L_0x03cf:
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerLinearLayout r0 = r6.A0I
            X.C51968G9o.A1D(r0, r1)
            int r14 = X.I5V.A00
            r13 = r14
        L_0x03d7:
            X.0eP r0 = X.I5V.A00(r2, r12, r6, r14, r13)
            int r11 = X.C51970G9q.A0B(r0)
            int r1 = X.C51969G9p.A0A(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r6.A0E
            X.C51972G9s.A0x(r0, r11, r1)
            com.instagram.ui.simplevideolayout.SimpleVideoLayout r0 = r6.A0H
            X.C51972G9s.A0x(r0, r11, r1)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x01e0
        L_0x03f7:
            com.instagram.common.ui.base.IgTextView r1 = r6.A0C
            com.instagram.user.model.User r12 = r4.A2A(r2)
            java.lang.String r12 = X.C51971G9r.A0t(r12)
            goto L_0x014b
        L_0x0403:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x0408:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x040d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x0412:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r19)
            throw r0
        L_0x0417:
            java.lang.String r0 = "Unexpected ViewHolder type"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53082GiG.onBindViewHolder(X.3kE, int):void");
    }

    public C53082GiG(Context context, ViewPager2 viewPager2, AnonymousClass0iw r5, UserSession userSession, C228412ld r7, AnonymousClass2pM r8, C227802jw r9, boolean z) {
        boolean A1Y = DbW.A1Y(context);
        this.A08 = userSession;
        this.A05 = context;
        this.A0B = r5;
        this.A09 = r8;
        this.A0D = r9;
        this.A0C = r7;
        this.A0A = z;
        this.A07 = viewPager2;
        setHasStableIds(A1Y);
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(552940490);
        int size = this.A04.size();
        AnonymousClass0fD.A0A(-1036635730, A032);
        return size;
    }

    public final long getItemId(int i) {
        int A032 = AnonymousClass0fD.A03(1247257804);
        String A2n = DbZ.A0T(this.A04, i).A2n();
        if (A2n != null) {
            long parseLong = Long.parseLong(A2n);
            AnonymousClass0fD.A0A(531378848, A032);
            return parseLong;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0A(557582587, A032);
        throw A0y;
    }
}
