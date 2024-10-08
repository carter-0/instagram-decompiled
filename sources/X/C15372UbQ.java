package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.util.List;

/* renamed from: X.UbQ  reason: case insensitive filesystem */
public final class C15372UbQ extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "BlockCommentsFromUpsellFragment";
    public IgdsListCell A00;
    public IgdsListCell A01;
    public boolean A02;
    public boolean A03;
    public View A04;
    public final int A05 = -1;
    public final VQ3 A06;
    public final String A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D = AnonymousClass1YB.A00(new C58175Inf(this, 49));
    public final AnonymousClass0eM A0E;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "block_comments_from_upsell_fragment";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        Integer num;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && (string = bundle2.getString("key_target_user_id")) != null) {
            AnonymousClass0eM r4 = this.A0E;
            r4.getValue();
            UserSession A0l = AnonymousClass7TE.A0l(this.A0A);
            Object value = this.A0C.getValue();
            boolean A1U = AnonymousClass7TF.A1U(0, A0l, value);
            if (value == HMF.COMMENT_DELETE_UPSELL_TYPE_HRT_BLOCK_COMMENTS_FROM) {
                num = AnonymousClass05K.A0j;
            } else {
                num = AnonymousClass05K.A0Y;
            }
            C56529I0a.A00.A00(A0l, num, AnonymousClass05K.A01, (String) null, (List) null, (List) null);
            r4.getValue();
            C56058Hs7 hs7 = (C56058Hs7) this.A0D.getValue();
            String str = this.A07;
            0qQ.A0B(hs7, 0);
            0qQ.A0B(str, A1U ? 1 : 0);
            hs7.A01("upsell_bottom_sheet", str, "comment_block_comments_from");
            IgdsHeadline igdsHeadline = (IgdsHeadline) view.findViewById(R.id.block_comments_from_upsell_headline);
            AnonymousClass0eM r42 = this.A0B;
            igdsHeadline.setCircularImageUrl((ImageUrl) C320236s2.A00(requireArguments(), ImageUrl.class, "key_target_user_profile_pic_url"), DbS.A0t(r42), (AnonymousClass0iw) null, (Integer) null, (View.OnClickListener) null);
            igdsHeadline.setHeadline((CharSequence) AnonymousClass7TF.A0e(DbV.A05(this), r42.getValue(), 2131976109));
            boolean A1Z = AnonymousClass7TF.A1Z(this.A08);
            IgdsListCell igdsListCell = (IgdsListCell) AnonymousClass7TE.A0b(view, R.id.block_comments_from_upsell_row_one);
            String A0t = DbS.A0t(r42);
            if (A1Z) {
                A00(igdsListCell, A0t, A1U);
                this.A00 = igdsListCell;
                IgdsListCell igdsListCell2 = (IgdsListCell) AnonymousClass7TE.A0b(view, R.id.block_comments_from_upsell_row_two);
                A01(igdsListCell2, DbS.A0t(r42), false);
                this.A01 = igdsListCell2;
            } else {
                A01(igdsListCell, A0t, A1U);
                this.A01 = igdsListCell;
                IgdsListCell igdsListCell3 = (IgdsListCell) AnonymousClass7TE.A0b(view, R.id.block_comments_from_upsell_row_two);
                A00(igdsListCell3, DbS.A0t(r42), false);
                this.A00 = igdsListCell3;
            }
            IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) view.findViewById(R.id.block_comments_from_upsell_bottom_bar);
            String A0m = DbU.A0m(this, 2131973150);
            String string2 = getString(2131976106);
            UsT usT = new UsT(this, Dbb.A04(this));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(002.A0B(string2));
            AnonymousClass7AV.A04(spannableStringBuilder, usT, A0m);
            igdsBottomButtonLayout.setFooterText(spannableStringBuilder);
            igdsBottomButtonLayout.setPrimaryActionOnClickListener(new W9h(string, this, 8));
            View findViewById = view.findViewById(R.id.block_comments_from_upsell_scrollview);
            igdsBottomButtonLayout.addOnLayoutChangeListener(new C71414OkD(7, findViewById, igdsBottomButtonLayout));
            this.A04 = findViewById;
        }
    }

    private final void A00(IgdsListCell igdsListCell, String str, boolean z) {
        this.A03 = z;
        igdsListCell.setTextCellType(C69349Njo.TYPE_RADIO);
        igdsListCell.A0I(DbU.A0m(this, 2131976108));
        igdsListCell.A0H(C13991Tnr.A0d(this, str, 2131976107));
        igdsListCell.setChecked(z);
        igdsListCell.A0D(new C18921WCy(this, 5));
    }

    private final void A01(IgdsListCell igdsListCell, String str, boolean z) {
        this.A02 = z;
        igdsListCell.setTextCellType(C69349Njo.TYPE_RADIO);
        igdsListCell.A0I(DbU.A0m(this, 2131976102));
        igdsListCell.A0H(C13991Tnr.A0d(this, str, 2131976101));
        igdsListCell.setChecked(z);
        igdsListCell.A0D(new C18921WCy(this, 6));
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
        return DbS.A0T(this.A0A);
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
        View view = this.A04;
        if (view == null || JTP.A1Y(view)) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public C15372UbQ() {
        C20610Wvr wvr = new C20610Wvr(this, 0);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C58175Inf(new C58175Inf(this, 44), 45));
        this.A0E = new C227862kA(new C58175Inf(A002, 46), wvr, new MJ6(28, (Object) null, A002), new 0Yh(U8Q.class));
        this.A08 = AnonymousClass1YB.A00(new C58175Inf(this, 42));
        this.A0B = AnonymousClass1YB.A00(new C58175Inf(this, 47));
        this.A09 = AnonymousClass1YB.A00(new C58175Inf(this, 43));
        this.A0C = AnonymousClass1YB.A00(new C58175Inf(this, 48));
        this.A07 = AnonymousClass7TG.A0j();
        this.A0A = C227642jf.A02(this);
        this.A06 = new VQ3(this);
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(254448289);
        0qQ.A0B(layoutInflater, 0);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.block_comments_from_upsell_bottom_sheet, false);
        AnonymousClass0fD.A09(-941098469, A022);
        return A0D2;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-2132321312);
        super.onDestroyView();
        this.A04 = null;
        AnonymousClass0fD.A09(1296936715, A022);
    }
}
