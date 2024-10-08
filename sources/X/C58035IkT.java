package X;

import android.view.View;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.IkT  reason: case insensitive filesystem */
public final class C58035IkT implements 02o {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ IgLinearLayout A02;
    public final /* synthetic */ IgTextView A03;
    public final /* synthetic */ C54134H0d A04;

    public C58035IkT(View view, View view2, IgLinearLayout igLinearLayout, IgTextView igTextView, C54134H0d h0d) {
        this.A03 = igTextView;
        this.A01 = view;
        this.A00 = view2;
        this.A04 = h0d;
        this.A02 = igLinearLayout;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDj, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v10 */
    /* JADX WARNING: type inference failed for: r5v11 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* renamed from: A00 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object emit(com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel.UiState r11, X.AnonymousClass4D7 r12) {
        /*
            r10 = this;
            r3 = 23
            boolean r0 = X.C66131MDj.A01(r3, r12)
            if (r0 == 0) goto L_0x018a
            r5 = r12
            X.MDj r5 = (X.C66131MDj) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x018a
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A03
            X.1Hj r2 = X.1Hj.A02
            int r0 = r5.A00
            r6 = 1
            r4 = 0
            r3 = 8
            if (r0 == 0) goto L_0x00b1
            if (r0 != r6) goto L_0x0191
            java.lang.Object r11 = r5.A02
            com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel$UiState r11 = (com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel.UiState) r11
            java.lang.Object r2 = r5.A01
            X.IkT r2 = (X.C58035IkT) r2
            X.0eS.A00(r1)
        L_0x002f:
            X.H0d r1 = r2.A04
            com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel$UiState$Loaded r11 = (com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel.UiState.Loaded) r11
            com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel$ViewState r0 = r11.viewState
            com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel$FeedbackType r0 = r0.getCurrentFeedback()
            int r7 = r0.ordinal()
            if (r7 == r6) goto L_0x00a9
            r0 = 2
            if (r7 == r0) goto L_0x009a
            r5 = 3
            com.instagram.igds.components.button.IgdsButton r0 = r1.A03
            if (r7 == r5) goto L_0x0086
            if (r0 == 0) goto L_0x004c
            r0.setActive(r4)
        L_0x004c:
            com.instagram.igds.components.button.IgdsButton r0 = r1.A02
            if (r0 == 0) goto L_0x0053
            r0.setActive(r4)
        L_0x0053:
            com.instagram.igds.components.button.IgdsButton r0 = r1.A01
            if (r0 == 0) goto L_0x005a
            r0.setActive(r4)
        L_0x005a:
            com.instagram.common.ui.base.IgTextView r0 = r2.A03
            r0.setVisibility(r3)
            android.view.View r0 = r2.A00
            r0.setVisibility(r3)
            android.view.View r0 = r2.A01
            r0.setVisibility(r4)
            com.instagram.common.ui.base.IgLinearLayout r5 = r2.A02
            X.0eM r0 = r1.A0E
            X.0lg r3 = X.DbT.A0X(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36328598621208011(0x8110ab00013dcb, double:3.0376902793525056E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0080
            r4 = 8
        L_0x0080:
            r5.setVisibility(r4)
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0086:
            if (r0 == 0) goto L_0x008b
            r0.setActive(r4)
        L_0x008b:
            com.instagram.igds.components.button.IgdsButton r0 = r1.A02
            if (r0 == 0) goto L_0x0092
            r0.setActive(r4)
        L_0x0092:
            com.instagram.igds.components.button.IgdsButton r0 = r1.A01
            if (r0 == 0) goto L_0x005a
            r0.setActive(r6)
            goto L_0x005a
        L_0x009a:
            com.instagram.igds.components.button.IgdsButton r0 = r1.A03
            if (r0 == 0) goto L_0x00a1
            r0.setActive(r4)
        L_0x00a1:
            com.instagram.igds.components.button.IgdsButton r0 = r1.A02
            if (r0 == 0) goto L_0x0053
            r0.setActive(r6)
            goto L_0x0053
        L_0x00a9:
            com.instagram.igds.components.button.IgdsButton r0 = r1.A03
            if (r0 == 0) goto L_0x004c
            r0.setActive(r6)
            goto L_0x004c
        L_0x00b1:
            X.0eS.A00(r1)
            boolean r0 = r11 instanceof com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel.UiState.Loading
            if (r0 == 0) goto L_0x00c5
            com.instagram.common.ui.base.IgTextView r0 = r10.A03
            r0.setVisibility(r3)
            android.view.View r0 = r10.A01
            r0.setVisibility(r3)
            android.view.View r5 = r10.A00
            goto L_0x0080
        L_0x00c5:
            boolean r0 = r11 instanceof com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel.UiState.Loaded
            if (r0 == 0) goto L_0x0178
            X.H0d r0 = r10.A04
            X.Hp4 r7 = r0.A05
            if (r7 != 0) goto L_0x00d9
            java.lang.String r0 = "recommendationsRecyclerViewHelper"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00d9:
            r0 = r11
            com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel$UiState$Loaded r0 = (com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel.UiState.Loaded) r0
            com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel$ViewState r0 = r0.viewState
            java.util.List r8 = r0.getRecommendations()
            X.C51966G9m.A1P(r10, r11, r5, r6)
            java.lang.String r1 = r7.A08
            java.lang.String r0 = "CLIPS"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0133
            java.util.ArrayList r9 = X.AnonymousClass7TF.A0p(r8)
            java.util.Iterator r8 = r8.iterator()
        L_0x00f7:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x010a
            java.lang.Object r1 = r8.next()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.model.RecommendationItem.ClipsRecommendation"
            X.0qQ.A0C(r1, r0)
            r9.add(r1)
            goto L_0x00f7
        L_0x010a:
            java.util.ArrayList r8 = X.AnonymousClass7TF.A0p(r9)
            java.util.Iterator r1 = r9.iterator()
        L_0x0112:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0124
            java.lang.Object r0 = r1.next()
            com.instagram.debug.devoptions.signalsplayground.model.RecommendationItem$ClipsRecommendation r0 = (com.instagram.debug.devoptions.signalsplayground.model.RecommendationItem.ClipsRecommendation) r0
            X.4bN r0 = r0.clipsItem
            r8.add(r0)
            goto L_0x0112
        L_0x0124:
            X.Ght r1 = r7.A06
            X.HpK r0 = X.C56521Hzs.A05
            X.Hzs r0 = r0.A00(r8)
            java.lang.Object r0 = r1.A03(r0, r5)
            if (r0 != r2) goto L_0x0175
            return r2
        L_0x0133:
            java.lang.String r0 = "AUDIO"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0175
            java.util.ArrayList r5 = X.AnonymousClass7TF.A0p(r8)
            java.util.Iterator r2 = r8.iterator()
        L_0x0143:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0156
            java.lang.Object r1 = r2.next()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.model.RecommendationItem.AudioRecommendation"
            X.0qQ.A0C(r1, r0)
            r5.add(r1)
            goto L_0x0143
        L_0x0156:
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r5)
            java.util.Iterator r1 = r5.iterator()
        L_0x015e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0170
            java.lang.Object r0 = r1.next()
            com.instagram.debug.devoptions.signalsplayground.model.RecommendationItem$AudioRecommendation r0 = (com.instagram.debug.devoptions.signalsplayground.model.RecommendationItem.AudioRecommendation) r0
            X.Uq6 r0 = r0.audioItem
            r2.add(r0)
            goto L_0x015e
        L_0x0170:
            com.instagram.debug.devoptions.signalsplayground.adapter.CreatorInspirationSignalsPlaygroundAudioRecommendationsAdapter r0 = r7.A05
            r0.setAudioTrackItems(r2)
        L_0x0175:
            r2 = r10
            goto L_0x002f
        L_0x0178:
            boolean r0 = r11 instanceof com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel.UiState.Error
            if (r0 == 0) goto L_0x0196
            android.view.View r0 = r10.A01
            r0.setVisibility(r3)
            android.view.View r0 = r10.A00
            r0.setVisibility(r3)
            com.instagram.common.ui.base.IgTextView r5 = r10.A03
            goto L_0x0080
        L_0x018a:
            X.MDj r5 = new X.MDj
            r5.<init>(r10, r12, r3)
            goto L_0x0016
        L_0x0191:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0196:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58035IkT.emit(com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel$UiState, X.4D7):java.lang.Object");
    }
}
