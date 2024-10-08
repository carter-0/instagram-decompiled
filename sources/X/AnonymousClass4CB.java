package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.4CB  reason: invalid class name */
public abstract class AnonymousClass4CB {
    public static final View A00(Context context, ViewGroup viewGroup, C231702s8 r13, AnonymousClass0iw r14, UserSession userSession, C228412ld r16, C229332nD r17, C229182my r18) {
        Context context2 = context;
        0qQ.A0B(context, 0);
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r14, 3);
        C229332nD r10 = r17;
        0qQ.A0B(r10, 4);
        C229182my r11 = r18;
        0qQ.A0B(r11, 5);
        C231702s8 r6 = r13;
        0qQ.A0B(r13, 6);
        C228412ld r9 = r16;
        0qQ.A0B(r9, 7);
        View inflate = LayoutInflater.from(context2).inflate(R.layout.clips_netego_view, viewGroup, false);
        0qQ.A0A(inflate);
        C254133rz r2 = new C254133rz(inflate);
        RecyclerView recyclerView = r2.A01;
        recyclerView.setLayoutManager(new LinearLayoutManager(context2, 0, false));
        recyclerView.setAdapter(new AnonymousClass49P(context2, r6, r14, userSession, r9, r10, r11));
        inflate.setTag(r2);
        return inflate;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0139, code lost:
        if (r0 == 3) goto L_0x013b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.content.Context r32, android.os.Handler r33, X.C231702s8 r34, X.AnonymousClass0iw r35, com.instagram.common.session.UserSession r36, X.AnonymousClass3Y6 r37, X.C292795jX r38, X.AnonymousClass2xS r39, X.C229332nD r40, X.C292805jY r41, X.C254133rz r42) {
        /*
            r5 = 0
            r9 = r32
            X.0qQ.A0B(r9, r5)
            r4 = 1
            r10 = 2
            r31 = r36
            r0 = r31
            X.0qQ.A0B(r0, r4)
            r3 = 3
            r20 = r35
            r0 = r20
            X.0qQ.A0B(r0, r10)
            r6 = r42
            X.0qQ.A0B(r6, r3)
            r1 = 5
            r32 = r40
            r0 = r32
            X.0qQ.A0B(r0, r1)
            r0 = 6
            r7 = r38
            X.0qQ.A0B(r7, r0)
            r1 = 7
            r35 = r34
            r0 = r35
            X.0qQ.A0B(r0, r1)
            r2 = 8
            r36 = r33
            r0 = r36
            X.0qQ.A0B(r0, r2)
            r0 = r35
            java.util.HashSet r0 = r0.A05
            r8 = r37
            java.lang.String r12 = r8.A0S
            boolean r0 = r0.add(r12)
            if (r0 == 0) goto L_0x00b9
            r0 = r35
            com.instagram.common.session.UserSession r1 = r0.A02
            X.0iw r13 = r0.A00
            X.0wc r11 = X.AnonymousClass0kN.A01(r13, r1)
            java.lang.String r1 = "instagram_clips_tray_impression"
            X.0kJ r0 = r11.A00
            X.0Aj r11 = r11.A00(r0, r1)
            java.lang.String r1 = r13.getModuleName()
            java.lang.String r0 = "containermodule"
            r11.AAJ(r0, r1)
            java.lang.String r0 = "tray_session_id"
            r11.AAJ(r0, r12)
            int r0 = r7.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "media_index"
            r11.A8k(r0, r1)
            java.lang.String r1 = r8.A0G
            r12 = 0
            if (r1 == 0) goto L_0x0094
            java.util.Locale r0 = java.util.Locale.ROOT     // Catch:{ all -> 0x0087 }
            java.lang.String r0 = r1.toUpperCase(r0)     // Catch:{ all -> 0x0087 }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x0087 }
            X.5OC r1 = X.AnonymousClass5OC.valueOf(r0)     // Catch:{ all -> 0x0087 }
            goto L_0x008d
        L_0x0087:
            r0 = move-exception
            X.0eQ r1 = new X.0eQ
            r1.<init>(r0)
        L_0x008d:
            boolean r0 = r1 instanceof X.0eQ
            if (r0 != 0) goto L_0x0092
            r12 = r1
        L_0x0092:
            X.5OC r12 = (X.AnonymousClass5OC) r12
        L_0x0094:
            java.lang.String r0 = "action_source"
            r11.A8M(r12, r0)
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "nav_chain"
            r11.AAJ(r0, r1)
            java.lang.Integer r0 = r8.A0D
            if (r0 == 0) goto L_0x0237
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x00b1:
            java.lang.String r0 = "cpc_type"
            r11.A9F(r0, r1)
            r11.Cgf()
        L_0x00b9:
            X.0Tu r12 = X.0Tu.A05
            r0 = 36327507699448290(0x810fad000039e2, double:3.037000376038869E-306)
            r11 = r31
            boolean r0 = X.182.A06(r12, r11, r0)
            if (r0 == 0) goto L_0x0114
            java.lang.String r1 = r8.A0G
            java.lang.String r0 = "feed_blending"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0114
            r1 = r20
            X.4DU r1 = (X.AnonymousClass4DU) r1
            X.49R r12 = new X.49R
            r12.<init>(r11, r1)
            androidx.recyclerview.widget.RecyclerView r11 = r6.A01
            int r1 = r7.A00
            X.0qQ.A0B(r11, r5)
            java.lang.String r18 = r8.getId()
            X.49S r13 = r12.A03
            java.lang.String r16 = "feed_engagement_unit"
            X.4DU r0 = r12.A01
            java.lang.String r17 = r0.getModuleName()
            X.GAN r0 = new X.GAN
            r15 = r13
            r13 = r0
            r14 = r11
            r13.<init>(r14, r15, r16, r17, r18)
            android.content.Context r13 = r11.getContext()
            com.instagram.common.session.UserSession r11 = r12.A00
            X.1Ua r11 = X.1UX.A00(r13, r11)
            X.0qQ.A07(r11)
            X.Hiv r14 = new X.Hiv
            r14.<init>(r11)
            X.49W r13 = r12.A02
            X.GP1 r11 = new X.GP1
            r11.<init>(r12, r8, r1, r5)
            r13.A00(r14, r11, r0)
        L_0x0114:
            androidx.recyclerview.widget.RecyclerView r11 = r6.A01
            X.2Rw r1 = r11.A0A
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.mainfeed.clips.ClipsNetegoAdapter"
            X.0qQ.A0C(r1, r0)
            X.49P r1 = (X.AnonymousClass49P) r1
            r12 = r41
            r1.A01 = r12
            boolean r14 = r12.A00()
            if (r14 == 0) goto L_0x017e
            X.3pI r0 = r11.A0D
            boolean r0 = r0 instanceof androidx.recyclerview.widget.GridLayoutManager
            if (r0 != 0) goto L_0x0143
            com.instagram.api.schemas.RIXULayoutFormat r0 = r12.A01
            if (r0 == 0) goto L_0x03b5
            int r0 = r0.ordinal()
            if (r0 == r10) goto L_0x0234
            if (r0 != r3) goto L_0x03b5
        L_0x013b:
            androidx.recyclerview.widget.GridLayoutManager r0 = new androidx.recyclerview.widget.GridLayoutManager
            r0.<init>(r9, r3)
            r11.setLayoutManager(r0)
        L_0x0143:
            com.instagram.api.schemas.RIXULayoutStyle r0 = r12.A02
            if (r0 == 0) goto L_0x017e
            int r0 = r0.ordinal()
            if (r0 == r10) goto L_0x021a
            if (r0 != r4) goto L_0x017e
            android.content.res.Resources r10 = r9.getResources()
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            r3 = 2131165184(0x7f070000, float:1.7944578E38)
            int r12 = r10.getDimensionPixelSize(r0)
            int r10 = r11.getPaddingTop()
            android.content.res.Resources r0 = r9.getResources()
            int r3 = r0.getDimensionPixelSize(r3)
            int r0 = r11.getPaddingBottom()
            r11.setPadding(r12, r10, r3, r0)
            java.util.ArrayList r0 = r11.A12
            int r0 = r0.size()
            if (r0 != 0) goto L_0x017e
            X.MvW r0 = new X.MvW
            r0.<init>(r9, r2)
        L_0x017b:
            r11.A11(r0)
        L_0x017e:
            X.5mh r0 = r1.A02
            r12 = 0
            r27 = r39
            if (r0 == 0) goto L_0x018d
            X.3Y6 r0 = r0.A01
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x01bb
        L_0x018d:
            com.instagram.common.session.UserSession r13 = r1.A05
            X.2nD r10 = r1.A06
            X.2s8 r3 = r1.A04
            X.5mg r0 = new X.5mg
            r23 = r13
            r24 = r12
            r25 = r8
            r26 = r7
            r28 = r10
            r21 = r0
            r22 = r3
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)
            r1.A00 = r0
            X.5jY r3 = r1.A01
            X.5mh r0 = new X.5mh
            r0.<init>(r8, r3)
            r1.A02 = r0
            X.9Il r0 = r8.A00
            if (r0 == 0) goto L_0x01b9
            com.instagram.model.rixu.RIXUChainingBehaviorDefinition r12 = X.C294595mi.A00(r0)
        L_0x01b9:
            r1.A03 = r12
        L_0x01bb:
            r1.notifyDataSetChanged()
            if (r14 != 0) goto L_0x01c9
            X.3pI r3 = r11.A0D
            if (r3 == 0) goto L_0x01c9
            android.os.Parcelable r0 = r7.A01
            r3.A1P(r0)
        L_0x01c9:
            com.instagram.common.ui.base.IgTextView r3 = r6.A04
            java.lang.String r0 = r8.A0J
            r19 = r0
            r3.setText(r0)
            java.lang.String r0 = r8.A0I
            r18 = r0
            if (r0 == 0) goto L_0x02a1
            int r0 = r18.length()
            if (r0 == 0) goto L_0x02a1
            java.util.List r0 = r8.A0L
            if (r0 == 0) goto L_0x023a
            java.util.ArrayList r16 = new java.util.ArrayList
            r16.<init>()
            java.util.Iterator r15 = r0.iterator()
        L_0x01eb:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x023c
            java.lang.Object r0 = r15.next()
            com.instagram.api.schemas.RIXUTextLinkImpl r0 = (com.instagram.api.schemas.RIXUTextLinkImpl) r0
            java.lang.String r14 = r0.A03
            java.lang.String r13 = r0.A02
            java.lang.Integer r10 = r0.A01
            java.lang.Integer r0 = r0.A00
            if (r14 == 0) goto L_0x01eb
            if (r13 == 0) goto L_0x01eb
            if (r10 == 0) goto L_0x01eb
            if (r0 == 0) goto L_0x01eb
            int r10 = r10.intValue()
            int r0 = r0.intValue()
            X.DrX r12 = new X.DrX
            r12.<init>(r14, r13, r10, r0)
            r0 = r16
            r0.add(r12)
            goto L_0x01eb
        L_0x021a:
            int r3 = r11.getPaddingTop()
            int r0 = r11.getPaddingBottom()
            r11.setPadding(r5, r3, r5, r0)
            java.util.ArrayList r0 = r11.A12
            int r0 = r0.size()
            if (r0 != 0) goto L_0x017e
            X.MvW r0 = new X.MvW
            r0.<init>(r9, r4)
            goto L_0x017b
        L_0x0234:
            r3 = 2
            goto L_0x013b
        L_0x0237:
            r1 = 0
            goto L_0x00b1
        L_0x023a:
            X.0sn r16 = X.0sn.A00
        L_0x023c:
            android.text.SpannableStringBuilder r10 = new android.text.SpannableStringBuilder
            r10.<init>()
            r0 = r18
            android.text.SpannableStringBuilder r17 = r10.append(r0)
            java.lang.Class<androidx.fragment.app.FragmentActivity> r0 = androidx.fragment.app.FragmentActivity.class
            java.lang.Object r13 = X.0mE.A00(r9, r0)
            androidx.fragment.app.FragmentActivity r13 = (androidx.fragment.app.FragmentActivity) r13
            if (r13 == 0) goto L_0x02a1
            java.util.Iterator r16 = r16.iterator()
        L_0x0255:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0293
            java.lang.Object r12 = r16.next()
            X.DrX r12 = (X.C47156DrX) r12
            X.0eM r0 = r12.A06
            java.lang.Object r0 = r0.getValue()
            X.EWF r0 = (X.EWF) r0
            int r0 = r0.ordinal()
            if (r0 != r5) goto L_0x0255
            r0 = 2130971404(0x7f040b0c, float:1.7551545E38)
            int r34 = X.2Yu.A0F(r9, r0)
            X.HFt r10 = new X.HFt
            r28 = r10
            r29 = r13
            r30 = r20
            r33 = r12
            r28.<init>(r29, r30, r31, r32, r33, r34)
            int r0 = r12.A01
            r14 = r0
            int r0 = r12.A00
            r12 = r0
            r0 = 33
            r15 = r10
            r10 = r0
            r0 = r17
            r0.setSpan(r15, r14, r12, r10)
            goto L_0x0255
        L_0x0293:
            com.instagram.common.ui.base.IgTextView r10 = r6.A03
            r0 = r17
            r10.setText(r0)
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r10.setMovementMethod(r0)
        L_0x02a1:
            X.3pI r0 = r11.A0D
            if (r0 == 0) goto L_0x02b2
            X.5mj r10 = new X.5mj
            r0 = r36
            r10.<init>(r0, r7)
            r11.A0b()
            r11.A15(r10)
        L_0x02b2:
            boolean r12 = r7.A04
            android.content.res.Resources r10 = r9.getResources()
            r0 = 2131165231(0x7f07002f, float:1.7944673E38)
            if (r12 == 0) goto L_0x02c0
            r0 = 2131165270(0x7f070056, float:1.7944752E38)
        L_0x02c0:
            float r0 = r10.getDimension(r0)
            android.view.ViewGroup r14 = r6.A00
            int r13 = r14.getPaddingLeft()
            int r12 = r14.getPaddingTop()
            int r10 = r14.getPaddingRight()
            int r0 = (int) r0
            r14.setPadding(r13, r12, r10, r0)
            X.3pI r11 = r11.A0D
            java.lang.String r0 = "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"
            X.0qQ.A0C(r11, r0)
            androidx.recyclerview.widget.LinearLayoutManager r11 = (androidx.recyclerview.widget.LinearLayoutManager) r11
            X.0qQ.A0B(r11, r4)
            com.instagram.model.rixu.RIXUChainingBehaviorDefinition r0 = r1.A03
            r12 = 0
            if (r0 == 0) goto L_0x02e9
            com.instagram.api.schemas.RIXUCoverChainingType r12 = r0.A01
        L_0x02e9:
            com.instagram.api.schemas.RIXUCoverChainingType r0 = com.instagram.api.schemas.RIXUCoverChainingType.CONTEXTUAL_CHAINING
            r10 = -1
            if (r12 == r0) goto L_0x0391
            X.2nD r0 = r1.A06
            X.9J0 r0 = r0.A02
            java.lang.Object r13 = r0.A00
            if (r13 == 0) goto L_0x0391
            X.5mh r0 = r1.A02
            java.lang.String r12 = "clipsNetegoItemsToRender"
            if (r0 == 0) goto L_0x03ad
            java.util.List r0 = r0.A00
            int r13 = r0.indexOf(r13)
            if (r13 != r10) goto L_0x0310
            X.5mh r0 = r1.A02
            if (r0 == 0) goto L_0x03ad
            java.util.List r0 = r0.A00
            int r0 = r0.size()
            int r13 = r0 + -1
        L_0x0310:
            int r0 = r1.getItemCount()
            int r12 = r0 + -1
            r0 = r32
            X.9J0 r1 = r0.A02
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0326
            if (r13 == r10) goto L_0x0326
            if (r13 <= r12) goto L_0x0323
            r13 = r12
        L_0x0323:
            r11.A1p(r13, r5)
        L_0x0326:
            r1.A02 = r5
            if (r19 == 0) goto L_0x0388
            int r0 = r19.length()
            if (r0 == 0) goto L_0x0388
            r3.setVisibility(r5)
            com.instagram.api.schemas.RIXUCtaType r10 = r8.A08
            if (r10 != 0) goto L_0x0339
            com.instagram.api.schemas.RIXUCtaType r10 = com.instagram.api.schemas.RIXUCtaType.WATCH_ALL
        L_0x0339:
            int r0 = r10.ordinal()
            if (r0 == r4) goto L_0x038b
            com.instagram.common.ui.base.IgTextView r4 = r6.A02
            r4.setVisibility(r5)
            r0 = 2130970277(0x7f0406a5, float:1.754926E38)
            int r1 = X.2Yu.A0H(r9, r0)
            android.text.SpannableStringBuilder r0 = X.C292995jr.A01(r9, r10, r1)
            r4.setText(r0)
            int r0 = r9.getColor(r1)
            r4.setTextColor(r0)
            X.ICV r9 = new X.ICV
            r10 = r35
            r11 = r31
            r12 = r8
            r13 = r7
            r15 = r32
            r14 = r27
            r9.<init>(r10, r11, r12, r13, r14, r15)
            X.AnonymousClass0fU.A00(r9, r4)
        L_0x036b:
            if (r18 == 0) goto L_0x0394
            int r0 = r18.length()
            if (r0 == 0) goto L_0x0394
            com.instagram.common.ui.base.IgTextView r0 = r6.A03
            r0.setVisibility(r5)
            int r2 = r3.getPaddingLeft()
            int r1 = r3.getPaddingTop()
            int r0 = r3.getPaddingRight()
            r3.setPadding(r2, r1, r0, r5)
            return
        L_0x0388:
            r3.setVisibility(r2)
        L_0x038b:
            com.instagram.common.ui.base.IgTextView r0 = r6.A02
            r0.setVisibility(r2)
            goto L_0x036b
        L_0x0391:
            r13 = -1
            goto L_0x0310
        L_0x0394:
            com.instagram.common.ui.base.IgTextView r0 = r6.A03
            r0.setVisibility(r2)
            int r4 = r3.getPaddingLeft()
            int r2 = r3.getPaddingTop()
            int r1 = r3.getPaddingRight()
            int r0 = r3.getPaddingTop()
            r3.setPadding(r4, r2, r1, r0)
            return
        L_0x03ad:
            X.0qQ.A0F(r12)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x03b5:
            java.lang.String r1 = "Unsupported grid layout format"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4CB.A01(android.content.Context, android.os.Handler, X.2s8, X.0iw, com.instagram.common.session.UserSession, X.3Y6, X.5jX, X.2xS, X.2nD, X.5jY, X.3rz):void");
    }
}
