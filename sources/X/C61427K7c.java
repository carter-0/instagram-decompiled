package X;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.api.schemas.StoryThenAndNowStickerDict;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.storiestemplates.v1.viewmodel.StoriesTemplateParticipationViewModel;
import com.instagram.feed.media.CreativeConfig;
import com.instagram.modal.ModalActivity;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.K7c  reason: case insensitive filesystem */
public final class C61427K7c extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "PromptStickerViewerFragment";
    public RecyclerView A00;
    public C255773uh A01;
    public C317766nn A02;
    public List A03;
    public final C230222pE A04;
    public final MU7 A05;
    public final L2J A06;
    public final AnonymousClass0eM A07 = C66294MMd.A01(this, 23);
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E = C66294MMd.A01(this, 30);
    public final AnonymousClass0eM A0F;
    public final AnonymousClass0eM A0G = C66294MMd.A01(this, 31);
    public final AnonymousClass0eM A0H;
    public final AnonymousClass0eM A0I;
    public final AnonymousClass0eM A0J;
    public final AnonymousClass0eM A0K;
    public final AnonymousClass0eM A0L;

    public static final void A01(C61229JzN jzN, C61427K7c k7c, boolean z) {
        int i = 3;
        if (z) {
            i = 1;
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(k7c.requireContext(), i);
        gridLayoutManager.A01 = new C60367JkF(k7c, z);
        RecyclerView A0I2 = DbT.A0I(k7c.requireView(), R.id.prompt_sticker_participants);
        AnonymousClass0eM r2 = k7c.A07;
        Dba.A17(A0I2, r2);
        A0I2.setLayoutManager(gridLayoutManager);
        A0I2.setVisibility(0);
        k7c.A00 = A0I2;
        C3251871j r3 = new C3251871j(A0I2.A0D, new C65319LrI(k7c, 10), C3251771i.A06, false, false);
        RecyclerView recyclerView = k7c.A00;
        if (recyclerView == null) {
            0qQ.A0F("recyclerView");
            throw AnonymousClass00P.createAndThrow();
        }
        recyclerView.A15(r3);
        List list = jzN.A06;
        0qQ.A0B(list, 0);
        ((C60425JlI) r2.getValue()).A00.A01(list, (Runnable) null);
    }

    public final void A03(Activity activity, C66509MUn mUn, boolean z) {
        Integer num;
        FragmentActivity fragmentActivity;
        1Xj r0;
        Activity activity2 = activity;
        C66509MUn mUn2 = mUn;
        0qQ.A0B(mUn, 0);
        if (activity == null) {
            activity2 = getActivity();
        }
        if (activity2 != null) {
            AnonymousClass0eM r1 = this.A0E;
            if (JTT.A0g(r1).A0G()) {
                UserSession A0l = AnonymousClass7TE.A0l(this.A0H);
                ArrayList A1C = AnonymousClass7TE.A1C();
                A1C.add(r1.getValue());
                List list = this.A03;
                if (list != null) {
                    A1C.addAll(list);
                }
                C64135LPk.A01(activity2, A0l, A1C);
            } else if (JTT.A0g(r1).A0M()) {
                StoriesTemplateParticipationViewModel storiesTemplateParticipationViewModel = (StoriesTemplateParticipationViewModel) this.A0I.getValue();
                PromptStickerModel A0g = JTT.A0g(r1);
                C310416b1 r2 = (C310416b1) this.A0A.getValue();
                if (r2 != null) {
                    storiesTemplateParticipationViewModel.A01((CreativeConfig) this.A09.getValue(), A0g, r2, true);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            } else if (JTT.A0g(r1).A0B) {
                boolean z2 = z;
                if (z) {
                    num = AnonymousClass05K.A0C;
                } else if (JTT.A0g(r1).A0I()) {
                    num = AnonymousClass05K.A0j;
                } else {
                    num = AnonymousClass05K.A01;
                }
                String str = null;
                if ((activity2 instanceof FragmentActivity) && (fragmentActivity = (FragmentActivity) activity2) != null) {
                    UserSession A0l2 = AnonymousClass7TE.A0l(this.A0H);
                    PromptStickerModel A0g2 = JTT.A0g(r1);
                    C255773uh r02 = this.A01;
                    if (!(r02 == null || (r0 = r02.A0b) == null)) {
                        str = r0.getId();
                    }
                    C64135LPk.A02(fragmentActivity, A0l2, mUn2, A0g2, num, str, MLO.A00, z2);
                }
            } else {
                C64135LPk.A00(activity2, (28D) this.A0B.getValue(), AnonymousClass7TE.A0l(this.A0H), JTT.A0g(r1));
            }
            LN4.A00((LN4) this.A0C.getValue(), "cta_tap", (String) null);
        }
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        07U r2 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass0xx A002 = AnonymousClass07a.A00(viewLifecycleOwner);
        MH5 mh5 = new MH5(r2, this, viewLifecycleOwner, (AnonymousClass4D7) null, 35);
        19B r4 = 19B.A00;
        AnonymousClass07Z A0I2 = JTP.A0I(this, r4, mh5, A002);
        07U r7 = r2;
        AnonymousClass07Z A0I3 = JTP.A0I(this, r4, new MH5(r7, this, A0I2, (AnonymousClass4D7) null, 34), AnonymousClass07a.A00(A0I2));
        1Eo.A05(r4, new MH5(r7, this, A0I3, (AnonymousClass4D7) null, 36), AnonymousClass07a.A00(A0I3));
        2YL A0H2 = DbS.A0H(this.A0L);
        1Eo.A05(r4, new MG3((Object) A0H2, (AnonymousClass4D7) null, 26), C318116oQ.A00(A0H2));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x000b: MOVE  (r1v1 com.instagram.igds.components.bottomsheet.BottomSheetFragment) = 
          (r1v0 com.instagram.igds.components.bottomsheet.BottomSheetFragment)
        
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public static final void A00(X.C61229JzN r10, X.C61427K7c r11) {
        /*
            boolean r0 = r10.A09
            if (r0 == 0) goto L_0x0035
            androidx.fragment.app.Fragment r1 = r11.mParentFragment
            boolean r0 = r1 instanceof com.instagram.igds.components.bottomsheet.BottomSheetFragment
            r5 = 0
            if (r0 == 0) goto L_0x0035
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r1 = (com.instagram.igds.components.bottomsheet.BottomSheetFragment) r1
            if (r1 == 0) goto L_0x0035
            X.7Pu r3 = r1.A02
            if (r3 == 0) goto L_0x0035
            r2 = 1
            r8 = 0
            java.lang.String r7 = ""
            X.7Ps r4 = new X.7Ps
            r6 = r5
            r9 = r8
            r4.<init>(r5, r6, r7, r8, r9)
            r0 = 2131238568(0x7f081ea8, float:1.8093418E38)
            r4.A02 = r0
            r1 = 41
            X.LY7 r0 = new X.LY7
            r0.<init>((int) r1, (java.lang.Object) r10, (java.lang.Object) r11)
            r4.A05 = r0
            r4.A0A = r2
            X.7Pt r0 = r4.A00()
            r3.A0K(r0, r2)
        L_0x0035:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61427K7c.A00(X.JzN, X.K7c):void");
    }

    public static final void A02(C61427K7c k7c, String str) {
        AnonymousClass0eM r0 = k7c.A0H;
        Bundle A012 = C46447Df9.A02().A01(AnonymousClass7TE.A0l(r0), C46474Dfc.A01(AnonymousClass7TE.A0l(r0), str, "reel_context_sheet_prompt", k7c.getModuleName()));
        DbU.A1K(k7c, DbS.A0b(k7c.requireActivity(), A012, DbT.A0X(r0), ModalActivity.class, "profile"));
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

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0H);
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

    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = this.A00;
        if (recyclerView == null || !JTP.A1Y(recyclerView)) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public C61427K7c() {
        0eO r2 = 0eO.A02;
        this.A0J = C66294MMd.A00(this, r2, 39);
        this.A08 = C66294MMd.A01(this, 24);
        this.A0K = C66294MMd.A01(this, 40);
        this.A0D = AnonymousClass1YB.A00(new C66294MMd(this, 29));
        this.A0B = C66294MMd.A00(this, r2, 27);
        this.A0A = C66294MMd.A01(this, 26);
        this.A09 = C66294MMd.A00(this, r2, 25);
        this.A0F = AnonymousClass0eN.A01(MLP.A00);
        this.A05 = new C65598LwY(this);
        this.A04 = new C50896Fkb(this, 12);
        this.A06 = new L2J(this);
        C66294MMd mMd = new C66294MMd(this, 41);
        AnonymousClass0eM A002 = C66294MMd.A00(new C66294MMd(this, 34), r2, 35);
        this.A0L = DbS.A0I(new C66294MMd(A002, 36), mMd, new MJ8(29, (Object) null, A002), DbS.A0z(C60207JhQ.class));
        this.A0I = DbS.A0I(new C66294MMd(this, 33), new C66294MMd(this, 37), new MJ8(28, (Object) null, this), DbS.A0z(StoriesTemplateParticipationViewModel.class));
        this.A0C = AnonymousClass1YB.A00(new C66294MMd(this, 28));
        this.A0H = C227642jf.A02(this);
    }

    public final String getModuleName() {
        return 002.A0R(C320236s2.A01(requireArguments(), "prior_module"), "_context_sheet_prompt");
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [X.Aef, java.lang.Object] */
    public final void onCreate(Bundle bundle) {
        ArrayList arrayList;
        int A022 = AnonymousClass0fD.A02(-1787572856);
        C61427K7c.super.onCreate(bundle);
        ArrayList parcelableArrayList = requireArguments().getParcelableArrayList(AnonymousClass000.A00(522));
        if (parcelableArrayList != null) {
            arrayList = AnonymousClass7TE.A1C();
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                Parcelable parcelable = (Parcelable) it.next();
                0qQ.A0C(parcelable, "null cannot be cast to non-null type com.instagram.api.schemas.StoryThenAndNowStickerDict");
                StoryThenAndNowStickerDict storyThenAndNowStickerDict = (StoryThenAndNowStickerDict) parcelable;
                0qQ.A0B(storyThenAndNowStickerDict, 1);
                ? obj = new Object();
                obj.A00 = storyThenAndNowStickerDict;
                arrayList.add(obj);
            }
        } else {
            arrayList = null;
        }
        this.A03 = arrayList;
        AnonymousClass0fD.A09(650324379, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1243551362);
        0qQ.A0B(layoutInflater, 0);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.prompt_sticker_viewer_fragment, false);
        AnonymousClass0fD.A09(1102677631, A022);
        return A0D2;
    }
}
