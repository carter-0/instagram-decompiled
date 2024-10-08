package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.debug.devoptions.direct.burner.BurnerSendThreadDetailsFragment;
import com.instagram.model.direct.DirectThreadKey;
import java.io.Serializable;

public abstract class NKF extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "DirectPromptsFragment";
    public int A00;
    public int A01;
    public Context A02;
    public IgEditText A03;
    public IgTextView A04;
    public C69309NjA A05;
    public AnonymousClass7IQ A06;
    public C67750Mu3 A07;
    public C69365Nk5 A08;
    public C333537Zi A09;
    public DirectThreadKey A0A;
    public String A0B;
    public boolean A0C;
    public C313756gx A0D;
    public C67739Mts A0E;
    public final AnonymousClass0eM A0F = C227642jf.A02(this);

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public String getModuleName() {
        return "prompts_fragment";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: X.NVV} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r15, android.os.Bundle r16) {
        /*
            r14 = this;
            r13 = 0
            X.0qQ.A0B(r15, r13)
            r0 = r16
            super.onViewCreated(r15, r0)
            android.content.Context r0 = r15.getContext()
            X.0qQ.A0B(r0, r13)
            r14.A02 = r0
            r0 = 2131438723(0x7f0b2c83, float:1.849938E38)
            android.view.View r0 = r15.requireViewById(r0)
            com.instagram.common.ui.base.IgEditText r0 = (com.instagram.common.ui.base.IgEditText) r0
            X.0qQ.A0B(r0, r13)
            r14.A03 = r0
            com.instagram.common.ui.base.IgEditText r3 = r14.A03()
            X.Nk5 r0 = r14.A05()
            int r2 = r0.ordinal()
            r0 = 2
            if (r2 == r0) goto L_0x03b1
            r1 = 3
            r0 = 2131958875(0x7f131c5b, float:1.9554375E38)
            if (r2 == r1) goto L_0x0038
            r0 = 2131970887(0x7f134b47, float:1.9578738E38)
        L_0x0038:
            java.lang.String r0 = r14.getString(r0)
            r3.setHint(r0)
            com.instagram.common.ui.base.IgEditText r1 = r14.A03()
            r0 = 11
            X.C71273OhE.A00(r1, r14, r0)
            com.instagram.common.ui.base.IgEditText r0 = r14.A03()
            r0.requestFocus()
            com.instagram.common.ui.base.IgEditText r0 = r14.A03()
            r0.setPadding(r13, r13, r13, r13)
            com.instagram.common.ui.base.IgEditText r0 = r14.A03()
            X.0nA.A0R(r0)
            r6 = r14
            boolean r2 = r14 instanceof X.NVV
            if (r2 == 0) goto L_0x0310
            r0 = 2131438724(0x7f0b2c84, float:1.8499383E38)
            android.widget.ImageView r3 = X.DbU.A0F(r15, r0)
            android.content.Context r0 = r14.A01()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165248(0x7f070040, float:1.7944708E38)
            int r7 = r1.getDimensionPixelSize(r0)
            android.content.Context r0 = r14.A01()
            int r8 = X.AnonymousClass7TG.A04(r0)
            android.content.Context r1 = r14.A01()
            android.content.Context r4 = r3.getContext()
            int r0 = X.2Yu.A0E(r4)
            int r9 = r1.getColor(r0)
            android.content.Context r1 = r14.A01()
            int r0 = X.2Yu.A09(r4)
            int r10 = r1.getColor(r0)
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = r14.getSession()
            com.instagram.user.model.User r0 = r1.A01(r0)
            com.instagram.common.typedurl.ImageUrl r5 = r0.Bh3()
            java.lang.String r6 = r14.getModuleName()
            X.3ay r4 = new X.3ay
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r3.setImageDrawable(r4)
            r3.setVisibility(r13)
        L_0x00b9:
            androidx.fragment.app.FragmentActivity r0 = r14.requireActivity()
            X.Nk5 r3 = r14.A05()
            X.Nk5 r1 = X.C69365Nk5.DAILY_PROMPT
            if (r3 != r1) goto L_0x0308
            com.instagram.common.session.UserSession r1 = r14.getSession()
            boolean r1 = X.AnonymousClass7K4.A02(r1)
            if (r1 == 0) goto L_0x0308
            r1 = 2131958786(0x7f131c02, float:1.9554194E38)
        L_0x00d2:
            r3 = 2131438730(0x7f0b2c8a, float:1.8499395E38)
            android.widget.TextView r4 = X.DbU.A0G(r15, r3)
            android.content.Context r3 = r14.A01()
            X.DbT.A18(r3, r4, r1)
            r1 = 2131429534(0x7f0b089e, float:1.8480743E38)
            android.view.View r1 = r15.requireViewById(r1)
            r4 = 16
            X.C71401Ok0.A01(r1, r4, r14)
            r10 = r14
            if (r2 == 0) goto L_0x0183
            X.NVV r10 = (X.NVV) r10
            r1 = 2131431889(0x7f0b11d1, float:1.848552E38)
            android.widget.TextView r5 = X.DbU.A0G(r15, r1)
            X.0qQ.A0A(r5)
            r5.setVisibility(r13)
            r1 = 2131970918(0x7f134b66, float:1.95788E38)
            java.lang.String r4 = X.DbU.A0m(r10, r1)
            r1 = 2131970917(0x7f134b65, float:1.9578799E38)
            java.lang.String r3 = r10.getString(r1)
            android.content.Context r2 = r10.requireContext()
            android.content.Context r1 = r5.getContext()
            int r1 = X.2Yu.A06(r1)
            int r2 = r2.getColor(r1)
            X.Ngx r1 = new X.Ngx
            r1.<init>((X.NVV) r10, (int) r2)
            X.AnonymousClass7AV.A07(r1, r5, r4, r3)
        L_0x0124:
            r1 = 2131441113(0x7f0b35d9, float:1.8504228E38)
            com.instagram.common.ui.base.IgTextView r2 = X.DbT.A0a(r15, r1)
            r14.A04 = r2
            java.lang.String r1 = "sendButton"
            if (r2 == 0) goto L_0x03b6
            r2.setEnabled(r13)
            com.instagram.common.ui.base.IgTextView r2 = r14.A04
            if (r2 == 0) goto L_0x03b6
            r1 = 39
            X.C71405Ok4.A01(r2, r1, r0, r14)
            X.Mts r3 = r14.A0E
            java.lang.String r2 = "promptNamingSuggestionsViewModel"
            if (r3 == 0) goto L_0x03be
            android.content.Context r4 = r14.requireContext()
            com.instagram.common.session.UserSession r5 = r14.getSession()
            X.Nk5 r8 = r14.A05()
            android.view.View r1 = r14.requireView()
            r0 = 2131438769(0x7f0b2cb1, float:1.8499474E38)
            android.view.View r6 = X.AnonymousClass7TF.A0G(r1, r0)
            com.instagram.common.ui.base.IgSimpleImageView r6 = (com.instagram.common.ui.base.IgSimpleImageView) r6
            com.instagram.model.direct.DirectThreadKey r0 = r14.A06()
            java.lang.String r9 = r0.A00
            com.instagram.model.direct.DirectThreadKey r0 = r14.A06()
            java.lang.String r10 = r0.A01
            int r11 = r14.A01
            int r12 = r14.A00
            r7 = 0
            r3.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.Mts r0 = r14.A0E
            if (r0 == 0) goto L_0x03be
            X.2Fk r2 = r0.A03
            r0 = 37
            X.PqQ r1 = new X.PqQ
            r1.<init>(r14, r0)
            r0 = 45
            X.Dba.A15(r14, r2, r1, r0)
            return
        L_0x0183:
            boolean r1 = r14 instanceof X.NVX
            if (r1 == 0) goto L_0x0244
            X.NVX r10 = (X.NVX) r10
            r1 = 2131431889(0x7f0b11d1, float:1.848552E38)
            android.widget.TextView r2 = X.DbU.A0G(r15, r1)
            X.0qQ.A0A(r2)
            r2.setVisibility(r13)
            r1 = 2131958860(0x7f131c4c, float:1.9554344E38)
            X.DbU.A1G(r2, r10, r1)
            com.instagram.model.direct.DirectThreadKey r1 = r10.A06()
            java.lang.String r3 = r1.A00
            if (r3 == 0) goto L_0x0230
            com.instagram.common.session.UserSession r1 = r10.getSession()
            X.0xa r2 = X.AnonymousClass7TE.A0q(r1)
            java.lang.String r1 = "broadcast_channel_daily_prompt_nux"
            boolean r1 = X.C66581MXm.A1Y(r2, r1, r3)
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0230
            android.view.Window r3 = X.DbV.A0G(r10)
            if (r3 == 0) goto L_0x01c8
            android.os.Handler r2 = X.AnonymousClass7TF.A0D()
            X.PYU r1 = new X.PYU
            r1.<init>(r3, r10)
            r2.post(r1)
        L_0x01c8:
            com.instagram.model.direct.DirectThreadKey r1 = r10.A06()
            java.lang.String r4 = r1.A00
            X.O6Q r2 = new X.O6Q
            r2.<init>(r10)
            X.NIM r3 = new X.NIM
            r3.<init>()
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            r3.setArguments(r1)
            r3.A01 = r4
            r3.A00 = r2
            android.os.Handler r2 = X.AnonymousClass7TF.A0D()
            X.PYW r1 = new X.PYW
            r1.<init>(r10, r3)
            r2.post(r1)
            X.MfP r3 = r10.A02
            if (r3 == 0) goto L_0x0124
            X.NjA r1 = r10.A05
            if (r1 == 0) goto L_0x0124
            int r2 = r1.ordinal()
            if (r2 == r13) goto L_0x021b
            r1 = 2
            if (r2 != r1) goto L_0x0124
            com.instagram.model.direct.DirectThreadKey r1 = r10.A06()
            java.lang.String r4 = r1.A00
            com.instagram.model.direct.DirectThreadKey r1 = r10.A06()
            java.lang.String r5 = r1.A01
            int r10 = r10.A00
            java.lang.String r6 = "daily_prompt_creator_nux_sheet_rendered"
            java.lang.String r7 = "impression"
            java.lang.String r8 = "daily_prompt_creation_pill"
        L_0x0214:
            java.lang.String r9 = "thread_view"
            X.C66930MfP.A01(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0124
        L_0x021b:
            com.instagram.model.direct.DirectThreadKey r1 = r10.A06()
            java.lang.String r4 = r1.A00
            com.instagram.model.direct.DirectThreadKey r1 = r10.A06()
            java.lang.String r5 = r1.A01
            int r10 = r10.A00
            java.lang.String r6 = "daily_prompt_creator_nux_sheet_rendered"
            java.lang.String r7 = "impression"
            java.lang.String r8 = "daily_prompt_button"
            goto L_0x0214
        L_0x0230:
            android.view.Window r3 = X.DbV.A0G(r10)
            if (r3 == 0) goto L_0x0124
            android.os.Handler r2 = X.AnonymousClass7TF.A0D()
            X.PYV r1 = new X.PYV
            r1.<init>(r3, r10)
            r2.post(r1)
            goto L_0x0124
        L_0x0244:
            X.NVW r10 = (X.NVW) r10
            X.O6O r7 = new X.O6O
            r7.<init>(r10)
            X.O6P r3 = new X.O6P
            r3.<init>(r10)
            r1 = 2131438252(0x7f0b2aac, float:1.8498426E38)
            android.view.View r5 = r15.requireViewById(r1)
            r6 = r5
            com.instagram.igds.components.textcell.IgdsListCell r6 = (com.instagram.igds.components.textcell.IgdsListCell) r6
            r1 = 2131954912(0x7f130ce0, float:1.9546337E38)
            r6.A06(r1)
            r1 = 1
            r6.setTitleMaxLines(r1)
            r1 = 2131238928(0x7f082010, float:1.8094149E38)
            r6.A05(r1)
            r1 = 2131954942(0x7f130cfe, float:1.9546397E38)
            java.lang.String r1 = X.DbU.A0m(r10, r1)
            r6.A0K(r1, r13)
            r2 = 35
            X.Ok4 r1 = new X.Ok4
            r1.<init>(r2, r3, r10)
            r6.A0C(r1)
            X.0qQ.A07(r5)
            r1 = 2131432112(0x7f0b12b0, float:1.8485972E38)
            android.view.View r3 = r15.requireViewById(r1)
            r5 = r3
            com.instagram.igds.components.textcell.IgdsListCell r5 = (com.instagram.igds.components.textcell.IgdsListCell) r5
            r1 = 2131954908(0x7f130cdc, float:1.9546329E38)
            r5.A06(r1)
            r1 = 2131238918(0x7f082006, float:1.8094128E38)
            r5.A05(r1)
            r1 = 2131954922(0x7f130cea, float:1.9546357E38)
            java.lang.String r1 = X.DbU.A0m(r10, r1)
            r5.A0K(r1, r13)
            r2 = 34
            X.Ok4 r1 = new X.Ok4
            r1.<init>(r2, r7, r10)
            r5.A0C(r1)
            X.0qQ.A07(r3)
            r1 = 2131431889(0x7f0b11d1, float:1.848552E38)
            android.widget.TextView r3 = X.DbU.A0G(r15, r1)
            X.0qQ.A0A(r3)
            r3.setVisibility(r13)
            r1 = 2131954907(0x7f130cdb, float:1.9546326E38)
            java.lang.String r11 = X.DbU.A0m(r10, r1)
            r1 = 2131954906(0x7f130cda, float:1.9546324E38)
            java.lang.String r2 = X.DbV.A0z(r10, r11, r1)
            X.0qQ.A07(r2)
            android.content.Context r7 = r10.requireContext()
            android.content.Context r1 = r3.getContext()
            int r1 = X.2Yu.A06(r1)
            int r12 = r7.getColor(r1)
            java.lang.Integer r9 = X.AnonymousClass05K.A01
            X.04x r8 = new X.04x
            r8.<init>(r4, r11)
            X.NKw r7 = new X.NKw
            r7.<init>(r8, r9, r10, r11, r12, r13)
            X.AnonymousClass7AV.A07(r7, r3, r11, r2)
            X.Mu3 r1 = r10.A04()
            X.0Ud r2 = r1.A01
            X.19B r1 = X.19B.A00
            androidx.lifecycle.CoroutineLiveData r4 = X.C226292g8.A00(r1, r2)
            X.07Z r3 = r10.getViewLifecycleOwner()
            r1 = 4
            X.PqU r2 = new X.PqU
            r2.<init>((int) r1, (java.lang.Object) r6, (java.lang.Object) r5, (java.lang.Object) r10)
            r1 = 44
            X.Dba.A15(r3, r4, r2, r1)
            goto L_0x0124
        L_0x0308:
            X.Nk5 r1 = r14.A05()
            int r1 = r1.A02
            goto L_0x00d2
        L_0x0310:
            boolean r0 = r14 instanceof X.NVX
            if (r0 == 0) goto L_0x0398
            X.NVX r6 = (X.NVX) r6
            android.view.LayoutInflater r0 = r6.getLayoutInflater()
            X.2tC r3 = new X.2tC
            r3.<init>(r0)
            X.O6R r1 = new X.O6R
            r1.<init>(r6)
            X.NPj r0 = new X.NPj
            r0.<init>(r1)
            X.2t9 r0 = X.DbU.A0U(r3, r0)
            r6.A00 = r0
            r0 = 2131438816(0x7f0b2ce0, float:1.849957E38)
            android.view.View r0 = r15.requireViewById(r0)
            X.3oV r0 = X.2b1.A01(r0, r13, r13)
            r6.A01 = r0
            java.lang.String r4 = "suggestionRecyclerView"
            if (r0 == 0) goto L_0x03ba
            android.view.View r1 = r0.getView()
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            X.2t9 r0 = r6.A00
            r1.setAdapter(r0)
            X.3oV r0 = r6.A01
            if (r0 == 0) goto L_0x03ba
            android.view.View r3 = r0.getView()
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            android.content.Context r1 = r6.requireContext()
            com.instagram.direct.fragment.prompts.DirectDailyPromptsCreationFragment$CustomAutoscrollLinearLayoutManger r0 = new com.instagram.direct.fragment.prompts.DirectDailyPromptsCreationFragment$CustomAutoscrollLinearLayoutManger
            r0.<init>(r1, r13, r13)
            r3.setLayoutManager(r0)
            X.3oV r0 = r6.A01
            if (r0 == 0) goto L_0x03ba
            android.view.View r5 = r0.getView()
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            android.content.res.Resources r1 = r15.getResources()
            int r4 = X.AnonymousClass7TE.A0C(r1)
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            int r3 = r1.getDimensionPixelSize(r0)
            int r1 = r1.getDimensionPixelSize(r0)
            X.MvZ r0 = new X.MvZ
            r0.<init>(r4, r3, r1)
            r5.A11(r0)
            X.0xx r1 = X.DbW.A0E(r6)
            r0 = 2
            X.C73565Pfm.A02(r6, r1, r0)
            com.instagram.common.ui.base.IgEditText r1 = r6.A03()
            r0 = 10
            X.C71273OhE.A00(r1, r6, r0)
            goto L_0x00b9
        L_0x0398:
            r0 = 2131438722(0x7f0b2c82, float:1.8499379E38)
            com.instagram.igds.components.button.IgdsButton r3 = X.DbU.A0b(r15, r0)
            r3.setVisibility(r13)
            r1 = 2131238038(0x7f081c96, float:1.8092343E38)
            X.4lx r0 = X.C273084lx.START
            r3.A02(r0, r1)
            r0 = 8
            r3.setIconPadding(r0)
            goto L_0x00b9
        L_0x03b1:
            r0 = 2131954913(0x7f130ce1, float:1.9546339E38)
            goto L_0x0038
        L_0x03b6:
            X.0qQ.A0F(r1)
            goto L_0x03c1
        L_0x03ba:
            X.0qQ.A0F(r4)
            goto L_0x03c1
        L_0x03be:
            X.0qQ.A0F(r2)
        L_0x03c1:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NKF.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final Context A01() {
        Context context = this.A02;
        if (context != null) {
            return context;
        }
        0qQ.A0F("viewContext");
        throw AnonymousClass00P.createAndThrow();
    }

    /* renamed from: A02 */
    public final UserSession getSession() {
        if (this instanceof NVX) {
            return AnonymousClass7TE.A0l(((NVX) this).A05);
        }
        return AnonymousClass7TE.A0l(this.A0F);
    }

    public final IgEditText A03() {
        IgEditText igEditText = this.A03;
        if (igEditText != null) {
            return igEditText;
        }
        0qQ.A0F("textField");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C67750Mu3 A04() {
        C67750Mu3 mu3 = this.A07;
        if (mu3 != null) {
            return mu3;
        }
        0qQ.A0F("challengeCreationViewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C69365Nk5 A05() {
        C69365Nk5 nk5 = this.A08;
        if (nk5 != null) {
            return nk5;
        }
        0qQ.A0F("currentPromptsTab");
        throw AnonymousClass00P.createAndThrow();
    }

    public final DirectThreadKey A06() {
        DirectThreadKey directThreadKey = this.A0A;
        if (directThreadKey != null) {
            return directThreadKey;
        }
        0qQ.A0F("threadKey");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
    }

    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public static final void A00(NKF nkf) {
        FragmentActivity requireActivity = nkf.requireActivity();
        0nA.A0J(requireActivity);
        AnonymousClass37E r2 = AnonymousClass37D.A00;
        AnonymousClass37D A012 = r2.A01(requireActivity);
        if (A012 == null || !((AnonymousClass37F) A012).A0g) {
            requireActivity.onBackPressed();
        } else {
            DbX.A10(requireActivity, r2);
        }
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public void onCreate(Bundle bundle) {
        Parcelable parcelable;
        IllegalStateException illegalStateException;
        int i;
        Serializable serializable;
        Integer A0o;
        Integer A0o2;
        Serializable serializable2;
        C69309NjA njA;
        String str;
        int A022 = AnonymousClass0fD.A02(761011302);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            parcelable = bundle2.getParcelable(BurnerSendThreadDetailsFragment.ARGUMENT_DIRECT_THREAD_KEY);
        } else {
            parcelable = null;
        }
        if (parcelable != null) {
            DirectThreadKey directThreadKey = (DirectThreadKey) parcelable;
            0qQ.A0B(directThreadKey, 0);
            this.A0A = directThreadKey;
            Bundle bundle3 = this.mArguments;
            if (bundle3 != null) {
                serializable = bundle3.getSerializable("prompts_tab");
            } else {
                serializable = null;
            }
            0qQ.A0C(serializable, "null cannot be cast to non-null type com.instagram.direct.fragment.prompts.PromptsTab");
            C69365Nk5 nk5 = (C69365Nk5) serializable;
            0qQ.A0B(nk5, 0);
            this.A08 = nk5;
            this.A06 = AnonymousClass7IP.A00(this, getSession());
            this.A0D = C313746gw.A00(getSession());
            this.A0B = AnonymousClass7TF.A0j(A05().toString());
            Bundle bundle4 = this.mArguments;
            if (bundle4 == null || (A0o = DbV.A0o(bundle4, "direct_thread_sub_type")) == null) {
                illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                i = -1327187054;
            } else {
                this.A01 = A0o.intValue();
                Bundle bundle5 = this.mArguments;
                if (bundle5 == null || (A0o2 = DbV.A0o(bundle5, "direct_thread_audience_type")) == null) {
                    illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                    i = 365835512;
                } else {
                    this.A00 = A0o2.intValue();
                    Bundle bundle6 = this.mArguments;
                    if (bundle6 != null) {
                        serializable2 = bundle6.getSerializable("prompts_entry_point");
                    } else {
                        serializable2 = null;
                    }
                    if (serializable2 instanceof C69309NjA) {
                        njA = (C69309NjA) serializable2;
                    } else {
                        njA = null;
                    }
                    this.A05 = njA;
                    AnonymousClass7IQ r6 = this.A06;
                    if (r6 == null) {
                        str = "logger";
                    } else {
                        String str2 = A06().A00;
                        String str3 = A06().A01;
                        int i2 = this.A01;
                        int i3 = this.A00;
                        String str4 = this.A0B;
                        if (str4 == null) {
                            str = "currentTabAsString";
                        } else {
                            r6.A01(AnonymousClass79B.A01(str4), str2, str3, i2, i3);
                            C333537Zi A002 = C333527Zh.A00(getSession());
                            0qQ.A0B(A002, 0);
                            this.A09 = A002;
                            NKF.super.onCreate(bundle);
                            this.A0E = new C67739Mts(requireContext(), getSession(), A05(), false);
                            requireContext();
                            getSession();
                            A05();
                            this.A07 = new C67750Mu3();
                            AnonymousClass0fD.A09(890023542, A022);
                            return;
                        }
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
            }
        } else {
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = 608589333;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1464611745);
        NKF.super.onPause();
        0nA.A0N(A03());
        AnonymousClass0fD.A09(35258242, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-269497315);
        super.onResume();
        A03().requestFocus();
        AnonymousClass0fD.A09(-851361446, A022);
    }
}
