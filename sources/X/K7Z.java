package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.model.reels.Reel;
import java.util.List;

public final class K7Z extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "HighlightsShareSheetFragment";
    public RecyclerView A00;
    public AnonymousClass2t9 A01;
    public C61438K7n A02;
    public IgdsButton A03;
    public Reel A04;
    public List A05;
    public final AnonymousClass0eM A06 = C227642jf.A02(this);
    public final AnonymousClass0eM A07;
    public final L0N A08;
    public final String A09;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView A0K = DbX.A0K(view);
        this.A00 = A0K;
        String str = "recyclerView";
        if (A0K != null) {
            A0K.setBackgroundColor(0);
            RecyclerView recyclerView = this.A00;
            if (recyclerView != null) {
                AnonymousClass2t9 r0 = this.A01;
                if (r0 == null) {
                    str = "adapter";
                } else {
                    recyclerView.setAdapter(r0);
                    RecyclerView recyclerView2 = this.A00;
                    if (recyclerView2 != null) {
                        DbY.A16(this, recyclerView2);
                        RecyclerView recyclerView3 = this.A00;
                        if (recyclerView3 != null) {
                            recyclerView3.setItemAnimator((AnonymousClass3AS) null);
                            IgdsButton A0b = DbU.A0b(view, R.id.share_story_button);
                            A0b.setEnabled(true);
                            LY0.A00(A0b, 67, this);
                            this.A03 = A0b;
                            C60130JgB jgB = (C60130JgB) this.A07.getValue();
                            if (jgB != null) {
                                Dba.A16(getViewLifecycleOwner(), jgB.A00, new C66309MMs(this, 46), 65);
                            }
                            A00(this);
                            return;
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A00(K7Z k7z) {
        C60130JgB jgB = (C60130JgB) k7z.A07.getValue();
        if (jgB != null) {
            jgB.A02.A00(k7z.requireContext(), jgB.A01, C318466oz.A00, (Boolean) null, (Boolean) null, (Boolean) null, (Integer) null, DbU.A0u(k7z.A06), false);
        }
        ViewModelListUpdate A0R = DbS.A0R();
        Context requireContext = k7z.requireContext();
        C3253572b r2 = new C3253572b();
        r2.A00 = AnonymousClass7TF.A03(requireContext, R.attr.elevatedBackgroundColor);
        A0R.A00(new NPA(r2, C320156rr.LOADING));
        AnonymousClass2t9 r0 = k7z.A01;
        if (r0 == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.A05(A0R);
        }
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

    public final String getModuleName() {
        return this.A09;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
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
        if (recyclerView != null) {
            return !JTP.A1Y(recyclerView);
        }
        0qQ.A0F("recyclerView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public K7Z() {
        C66295MMe mMe = new C66295MMe(this, 27);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C66295MMe(new C66295MMe(this, 24), 25));
        this.A07 = DbS.A0I(new C66295MMe(A002, 26), mMe, new MJ9(40, (Object) null, A002), DbS.A0z(C60130JgB.class));
        this.A08 = new L0N(this);
        this.A09 = "highlights_share_sheet";
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.K7Z r7, boolean r8) {
        /*
            com.instagram.common.recyclerview.ViewModelListUpdate r5 = X.DbS.A0R()
            r6 = 0
            if (r8 == 0) goto L_0x006b
            android.content.Context r1 = r7.requireContext()
            X.72b r2 = new X.72b
            r2.<init>()
            r0 = 2130969336(0x7f0402f8, float:1.754735E38)
            int r0 = X.AnonymousClass7TF.A03(r1, r0)
            r2.A00 = r0
            r0 = 2131239153(0x7f0820f1, float:1.8094605E38)
            r2.A02 = r0
            r1 = 68
            X.LY0 r0 = new X.LY0
            r0.<init>(r7, r1)
            r2.A05 = r0
            X.6rr r1 = X.C320156rr.ERROR
        L_0x0029:
            X.NPA r0 = new X.NPA
            r0.<init>(r2, r1)
            r5.A00(r0)
        L_0x0031:
            androidx.recyclerview.widget.RecyclerView r0 = r7.A00
            java.lang.String r3 = "recyclerView"
            if (r0 == 0) goto L_0x004b
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView r0 = r7.A00
            if (r0 == 0) goto L_0x004b
            int r0 = r0.getHeight()
            r1.height = r0
            X.2t9 r0 = r7.A01
            if (r0 != 0) goto L_0x0053
            java.lang.String r3 = "adapter"
        L_0x004b:
            X.0qQ.A0F(r3)
        L_0x004e:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0053:
            r0.A05(r5)
            androidx.recyclerview.widget.RecyclerView r0 = r7.A00
            if (r0 == 0) goto L_0x004b
            int r2 = r0.getHeight()
            androidx.recyclerview.widget.RecyclerView r1 = r7.A00
            if (r1 == 0) goto L_0x004b
            X.M6h r0 = new X.M6h
            r0.<init>(r7, r2)
            r1.post(r0)
            return
        L_0x006b:
            java.util.List r0 = r7.A05
            java.lang.String r1 = "highlightReels"
            if (r0 == 0) goto L_0x00f0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x009e
            android.content.Context r1 = r7.requireContext()
            X.72b r2 = new X.72b
            r2.<init>()
            r0 = 2130969336(0x7f0402f8, float:1.754735E38)
            int r0 = X.AnonymousClass7TF.A03(r1, r0)
            r2.A00 = r0
            r0 = 2131968397(0x7f13418d, float:1.9573687E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0B = r0
            r0 = 2131968396(0x7f13418c, float:1.9573685E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0A = r0
            X.6rr r1 = X.C320156rr.EMPTY
            goto L_0x0029
        L_0x009e:
            com.instagram.model.reels.Reel r0 = r7.A04
            if (r0 != 0) goto L_0x00b8
            java.util.List r0 = r7.A05
            if (r0 == 0) goto L_0x00f0
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x00b8
            java.util.List r0 = r7.A05
            if (r0 == 0) goto L_0x00f0
            java.lang.Object r0 = X.AnonymousClass7TE.A13(r0)
            com.instagram.model.reels.Reel r0 = (com.instagram.model.reels.Reel) r0
            r7.A04 = r0
        L_0x00b8:
            java.util.List r0 = r7.A05
            if (r0 == 0) goto L_0x00f0
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x00c4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00eb
            java.lang.Object r2 = r3.next()
            com.instagram.model.reels.Reel r2 = (com.instagram.model.reels.Reel) r2
            java.lang.String r1 = r2.getId()
            com.instagram.model.reels.Reel r0 = r7.A04
            if (r0 == 0) goto L_0x00e9
            java.lang.String r0 = r0.getId()
        L_0x00dc:
            boolean r1 = X.0qQ.A0K(r1, r0)
            X.Lhs r0 = new X.Lhs
            r0.<init>(r2, r1)
            r4.add(r0)
            goto L_0x00c4
        L_0x00e9:
            r0 = r6
            goto L_0x00dc
        L_0x00eb:
            r5.A01(r4)
            goto L_0x0031
        L_0x00f0:
            X.0qQ.A0F(r1)
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K7Z.A01(X.K7Z, boolean):void");
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.2tF, java.lang.Object] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-769277472);
        K7Z.super.onCreate(bundle);
        AnonymousClass2tC A0S = DbV.A0S(this);
        A0S.A01(new C61653KGd(this, this.A08));
        this.A01 = DbU.A0U(A0S, new Object());
        AnonymousClass0fD.A09(-1353039234, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1324742524);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_private_story_share_sheet, viewGroup, false);
        AnonymousClass0fD.A09(444274187, A022);
        return inflate;
    }
}
