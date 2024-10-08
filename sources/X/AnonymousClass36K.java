package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.36K  reason: invalid class name */
public final class AnonymousClass36K implements C252243on {
    public boolean A00;
    public final 2Ru A01;
    public final AnonymousClass2rI A02;
    public final List A03 = new ArrayList();
    public final List A04 = new ArrayList();
    public final C227812jx A05;

    public final /* synthetic */ void D6z(View view) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onDestroyView() {
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public final void ADC(View view) {
        if (view != null) {
            this.A00 = true;
            RecyclerView recyclerView = this.A05.getRecyclerView();
            List list = this.A04;
            list.clear();
            View childAt = recyclerView.getChildAt(0);
            if (childAt != null) {
                View childAt2 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                int A032 = RecyclerView.A03(childAt);
                int A033 = RecyclerView.A03(childAt2);
                if ((A032 == -1 || A033 == -1) && 0KC.A01.isLoggable(6)) {
                    0KC.A0C("RVChildPrefetcher", 002.A02(A032, A033, "invisible view position: ", "-"));
                }
                2Ru r2 = this.A01;
                int min = Math.min(r2.getItemCount() - 1, A033 + 5);
                for (int max = Math.max(0, A032 - 5); max <= min; max++) {
                    list.add(Integer.valueOf(r2.getItemViewType(max)));
                }
                0I2 r0 = 0KC.A01;
            }
            List list2 = this.A03;
            list2.clear();
            AnonymousClass3BD recycledViewPool = recyclerView.getRecycledViewPool();
            for (int i = 0; i < this.A01.getViewTypeCount(); i++) {
                int size = AnonymousClass3BD.A00(recycledViewPool, i).A03.size();
                for (int i2 = 0; i2 < size; i2++) {
                    list2.add(Integer.valueOf(i));
                }
            }
            0I2 r02 = 0KC.A01;
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.3DF, android.os.MessageQueue$IdleHandler] */
    /* JADX WARNING: type inference failed for: r1v7, types: [X.3DF, android.os.MessageQueue$IdleHandler] */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00ef, code lost:
        if (r11 == r0) goto L_0x00f1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0215 A[LOOP:3: B:48:0x0211->B:50:0x0215, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0284  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r32, android.os.Bundle r33) {
        /*
            r31 = this;
            if (r32 == 0) goto L_0x02bb
            r5 = 0
            r6 = r31
            r6.A00 = r5
            X.2jx r0 = r6.A05
            androidx.recyclerview.widget.RecyclerView r4 = r0.getRecyclerView()
            X.2Ru r7 = r6.A01
            X.2Rw r0 = r4.A0A
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x022d
            java.util.List r0 = r6.A04
            r30 = r0
            X.3BD r3 = r4.getRecycledViewPool()
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r30)
            X.3kO r2 = r0.iterator()
        L_0x0027:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0045
            java.lang.Object r0 = r2.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            X.3kE r1 = r7.prefetchViewHolder(r4, r0)
            boolean r0 = r1.isRecyclable()
            if (r0 == 0) goto L_0x0027
            r3.A03(r1)
            goto L_0x0027
        L_0x0045:
            r9 = 3
            X.0I2 r0 = X.0KC.A01
            java.util.List r0 = r6.A03
            r29 = r0
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r4)
            java.util.Iterator r2 = r29.iterator()
            X.3BD r0 = r4.getRecycledViewPool()
            X.3DF r1 = new X.3DF
            r1.<init>(r0, r6, r3, r2)
            android.os.MessageQueue r0 = android.os.Looper.myQueue()
            r0.addIdleHandler(r1)
            X.2rI r3 = r6.A02
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r10 = 8
            X.2rv r0 = X.C231592rv.GAP
            int r21 = r0.ordinal()
            r20 = 0
            r19 = 1
            r18 = 2
            X.2rv r0 = X.C231592rv.CAROUSEL_CONTENT
            int r24 = r0.ordinal()
            r17 = 4
            r16 = 6
            X.2rv r0 = X.C231592rv.COLLECTION_TOP_WITH_BOTTOM_THREE_CONTENT
            int r28 = r0.ordinal()
            r22 = r21
            r23 = r21
            r25 = r24
            r26 = r24
            r27 = r24
            int[] r7 = new int[]{r21, r22, r23, r24, r25, r26, r27, r28}
            r1 = 0
        L_0x0099:
            X.2s3 r8 = r3.A0E
            r0 = r7[r1]
            int r0 = r3.getAdapterViewType(r8, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.add(r0)
            int r1 = r1 + 1
            if (r1 < r10) goto L_0x0099
            X.2sK r0 = r3.A0b
            int r0 = r3.getAdapterViewType(r0, r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.add(r0)
            X.4DU r0 = r3.A0K
            java.lang.String r14 = r0.getModuleName()
            X.2rm r12 = r3.A0O
            X.2rq r0 = X.C231542rq.MEDIA_HEADER
            java.lang.Integer r11 = r12.A02(r0, r14)
            X.2rq r0 = X.C231542rq.COALESCED_HEADER
            java.lang.Integer r10 = r12.A02(r0, r14)
            X.2rq r0 = X.C231542rq.COALESCED_MEDIA
            java.lang.Integer r7 = r12.A02(r0, r14)
            X.0qQ.A0B(r11, r5)
            r0 = r19
            X.0qQ.A0B(r7, r0)
            r0 = r18
            X.0qQ.A0B(r10, r0)
            java.lang.Integer r15 = X.AnonymousClass05K.A00
            if (r10 == r15) goto L_0x0109
            if (r7 == r15) goto L_0x0109
            if (r11 == r15) goto L_0x0109
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r10 == r0) goto L_0x00f1
            if (r7 == r0) goto L_0x00f1
            r13 = 3
            if (r11 != r0) goto L_0x00f2
        L_0x00f1:
            r13 = 1
        L_0x00f2:
            r1 = 0
        L_0x00f3:
            X.2rv r0 = X.C231592rv.MEDIA_HEADER
            int r0 = r0.ordinal()
            int r0 = r3.getAdapterViewType(r8, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.add(r0)
            int r1 = r1 + 1
            if (r1 >= r13) goto L_0x0109
            goto L_0x00f3
        L_0x0109:
            X.2rq r0 = X.C231542rq.MEDIA_CONTENT
            java.lang.Integer r13 = r12.A02(r0, r14)
            if (r13 == r15) goto L_0x011b
            r0 = 21
            X.9L7 r1 = new X.9L7
            r1.<init>(r3, r0)
            X.AnonymousClass3DH.A00(r13, r2, r1, r9)
        L_0x011b:
            X.2rq r0 = X.C231542rq.COALESCED_FOOTER
            java.lang.Integer r1 = r12.A02(r0, r14)
            X.2rq r0 = X.C231542rq.AD_CTA
            java.lang.Integer r0 = r12.A02(r0, r14)
            java.lang.Integer r13 = X.AnonymousClass05K.A0C
            if (r0 != r13) goto L_0x0229
            X.2rv r0 = X.C231592rv.AD_CTA
        L_0x012d:
            int r0 = r0.ordinal()
            int r0 = r3.getAdapterViewType(r8, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.add(r0)
            if (r1 == r15) goto L_0x01b3
            r0 = 22
            X.9L7 r14 = new X.9L7
            r14.<init>(r3, r0)
            r0 = r17
            X.AnonymousClass3DH.A00(r1, r2, r14, r0)
            r0 = 23
            X.9L7 r14 = new X.9L7
            r14.<init>(r3, r0)
            r0 = r16
            X.AnonymousClass3DH.A00(r1, r2, r14, r0)
            r14 = 24
            X.9L7 r0 = new X.9L7
            r0.<init>(r3, r14)
            X.AnonymousClass3DH.A00(r1, r2, r0, r9)
            r0 = 25
            X.9L7 r14 = new X.9L7
            r14.<init>(r3, r0)
            r0 = r18
            X.AnonymousClass3DH.A00(r1, r2, r14, r0)
            r14 = 26
            X.9L7 r0 = new X.9L7
            r0.<init>(r3, r14)
            X.AnonymousClass3DH.A00(r1, r2, r0, r9)
            X.3DI r14 = X.AnonymousClass3DI.A00
            com.instagram.common.session.UserSession r0 = r3.A0C
            boolean r0 = r14.A04(r0)
            if (r0 == 0) goto L_0x0191
            X.2rv r0 = X.C231592rv.LITHO_SOCIAL_CONTEXT_BUBBLES
            int r0 = r0.ordinal()
            int r0 = r3.getAdapterViewType(r8, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.add(r0)
        L_0x0191:
            r0 = 27
            X.9L7 r14 = new X.9L7
            r14.<init>(r3, r0)
            r0 = r19
            X.AnonymousClass3DH.A00(r1, r2, r14, r0)
            r0 = 28
            X.9L7 r14 = new X.9L7
            r14.<init>(r3, r0)
            r0 = r18
            X.AnonymousClass3DH.A00(r1, r2, r14, r0)
            r14 = 20
            X.9L7 r0 = new X.9L7
            r0.<init>(r3, r14)
            X.AnonymousClass3DH.A00(r1, r2, r0, r9)
        L_0x01b3:
            boolean r0 = r12.A0J
            if (r0 == 0) goto L_0x0203
            if (r10 == r13) goto L_0x01ca
            X.2rv r0 = X.C231592rv.LITHO_COALESCED_HEADER
            int r0 = r0.ordinal()
            int r0 = r3.getAdapterViewType(r8, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.add(r0)
        L_0x01ca:
            if (r11 == r13) goto L_0x01dd
            X.2rv r0 = X.C231592rv.LITHO_MEDIA_HEADER
            int r0 = r0.ordinal()
            int r0 = r3.getAdapterViewType(r8, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.add(r0)
        L_0x01dd:
            if (r7 == r13) goto L_0x01f0
            X.2rv r0 = X.C231592rv.LITHO_COALESCED_MEDIA
            int r0 = r0.ordinal()
            int r0 = r3.getAdapterViewType(r8, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.add(r0)
        L_0x01f0:
            if (r1 == r13) goto L_0x0203
            X.2rv r0 = X.C231592rv.LITHO_COALESCED_FOOTER
            int r0 = r0.ordinal()
            int r0 = r3.getAdapterViewType(r8, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.add(r0)
        L_0x0203:
            com.instagram.common.session.UserSession r9 = r3.A0C
            X.0Tu r7 = X.0Tu.A05
            r0 = 36608626194126564(0x820f5a000416e4, double:3.2147808440467285E-306)
            long r0 = X.182.A01(r7, r9, r0)
            int r7 = (int) r0
        L_0x0211:
            r0 = r20
            if (r0 >= r7) goto L_0x0235
            X.2rv r0 = X.C231592rv.COMPOSE_MEDIA_UFI
            int r0 = r0.ordinal()
            int r0 = r3.getAdapterViewType(r8, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.add(r0)
            int r20 = r20 + 1
            goto L_0x0211
        L_0x0229:
            X.2rv r0 = X.C231592rv.LITHO_AD_CTA
            goto L_0x012d
        L_0x022d:
            java.lang.String r1 = "adapter doesn't match"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0235:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            X.2sD r0 = r3.A0Z
            int r0 = r3.getAdapterViewType(r0, r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.add(r0)
            X.2s9 r0 = r3.A0L
            int r0 = r3.getAdapterViewType(r0, r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.add(r0)
            X.2s7 r0 = r3.A0U
            int r0 = r3.getAdapterViewType(r0, r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.add(r0)
            X.2sL r0 = r3.A0T
            int r0 = r3.getAdapterViewType(r0, r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.add(r0)
            X.2sM r0 = r3.A0H
            int r0 = r3.getAdapterViewType(r0, r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.add(r0)
            X.2ry r1 = r3.A0F
            if (r1 == 0) goto L_0x0295
            X.2rv r0 = X.C231592rv.FULL_HEIGHT_SINGLE_MEDIA
            int r0 = r0.ordinal()
            int r0 = r3.getAdapterViewType(r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.add(r0)
        L_0x0295:
            r7.addAll(r2)
            r0 = r30
            r7.removeAll(r0)
            r0 = r29
            r7.removeAll(r0)
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r4)
            java.util.Iterator r2 = r7.iterator()
            X.3BD r0 = r4.getRecycledViewPool()
            X.3DF r1 = new X.3DF
            r1.<init>(r0, r6, r3, r2)
            android.os.MessageQueue r0 = android.os.Looper.myQueue()
            r0.addIdleHandler(r1)
        L_0x02bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36K.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public AnonymousClass36K(C227812jx r2, 2Ru r3, AnonymousClass2rI r4) {
        this.A01 = r3;
        this.A05 = r2;
        this.A02 = r4;
    }
}
