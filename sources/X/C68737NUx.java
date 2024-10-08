package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.android.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.NUx  reason: case insensitive filesystem */
public final class C68737NUx extends NJT implements C273494mf {
    public static final String __redex_internal_original_name = "EncryptedBackupsMoreOptionsFragment";
    public C69358Njy A00;
    public IgdsListCell A01;
    public IgdsListCell A02;
    public Integer A03;
    public C62320sa A04 = new C67485Mof(this, 32);
    public ScrollView A05;
    public IgdsBottomButtonLayout A06;
    public IgdsListCell A07;
    public IgdsListCell A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        NJT.A04(view, this);
        IgdsListCell igdsListCell = this.A07;
        if (igdsListCell != null) {
            igdsListCell.A0C(new C71407Ok6(this, 9));
        }
        IgdsListCell igdsListCell2 = this.A08;
        if (igdsListCell2 != null) {
            igdsListCell2.A0C(new C71407Ok6(this, 10));
        }
        IgdsListCell igdsListCell3 = this.A07;
        if (igdsListCell3 != null) {
            igdsListCell3.setCompoundButtonClickListener(new C71407Ok6(this, 11));
        }
        IgdsListCell igdsListCell4 = this.A08;
        if (igdsListCell4 != null) {
            igdsListCell4.setCompoundButtonClickListener(new C71407Ok6(this, 12));
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A06;
        if (igdsBottomButtonLayout != null) {
            C71407Ok6.A00(igdsBottomButtonLayout, 13, this);
        }
    }

    public static final void A0B(C68737NUx nUx) {
        C69358Njy njy;
        IgdsListCell igdsListCell = nUx.A07;
        boolean z = false;
        if (igdsListCell != null) {
            Integer num = nUx.A03;
            if (num != null) {
                igdsListCell.setChecked(AnonymousClass7TF.A1W(num, AnonymousClass05K.A00));
            }
            0qQ.A0F("selectStatus");
            throw AnonymousClass00P.createAndThrow();
        }
        IgdsListCell igdsListCell2 = nUx.A08;
        if (igdsListCell2 != null) {
            Integer num2 = nUx.A03;
            if (num2 != null) {
                if (num2 == AnonymousClass05K.A01) {
                    z = true;
                }
                igdsListCell2.setChecked(z);
            }
            0qQ.A0F("selectStatus");
            throw AnonymousClass00P.createAndThrow();
        }
        Integer num3 = nUx.A03;
        if (num3 != null) {
            int intValue = num3.intValue();
            if (intValue != 0) {
                if (intValue == 1) {
                    njy = C69358Njy.CREATE_PIN;
                } else {
                    throw AnonymousClass7TE.A1K();
                }
            } else if (C71145Oe2.A08(nUx)) {
                njy = C69358Njy.GDRIVE_OPTIN_SOFT_BLOCK;
            } else {
                njy = C69358Njy.GDRIVE_OPTIN_HARD_BLOCK;
            }
            nUx.A00 = njy;
            return;
        }
        0qQ.A0F("selectStatus");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void afterOnViewCreated() {
        C67724Mtd mtd = (C67724Mtd) this.A0B.getValue();
        if (mtd.A02 == AnonymousClass05K.A0C) {
            NUN nun = mtd.A00;
            nun.A0D("ENTRY_POINT", "SETTINGS");
            nun.A0D("SETUP_TYPE", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);
        }
        mtd.A00.A0B("MORE_OPTIONS_IMPRESSION");
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

    public final boolean isScrolledToTop() {
        ScrollView scrollView = this.A05;
        if (scrollView == null || JTP.A1Y(scrollView)) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public C68737NUx() {
        C67485Mof mof = new C67485Mof(this, 31);
        AnonymousClass0eM A002 = C67485Mof.A00(new C67485Mof(this, 27), 0eO.A02, 28);
        this.A0B = DbS.A0I(new C67485Mof(A002, 29), mof, new C73664Phd(44, A002, (Object) null), DbS.A0z(C67724Mtd.class));
        this.A0A = AnonymousClass1YB.A00(new C67485Mof(this, 30));
        this.A09 = AnonymousClass1YB.A00(new C67485Mof(this, 24));
        this.A00 = C69358Njy.CREATE_PIN;
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IgdsListCell igdsListCell;
        IgdsListCell igdsListCell2;
        int A022 = AnonymousClass0fD.A02(-95791749);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.more_options_layout, viewGroup, false);
        this.A05 = (ScrollView) inflate.requireViewById(R.id.cell_container);
        this.A01 = (IgdsListCell) inflate.requireViewById(R.id.recommended_cell);
        this.A02 = (IgdsListCell) inflate.requireViewById(R.id.second_cell);
        IgdsHeadline A0O = C66584MXp.A0O(inflate);
        A0D();
        Integer A023 = C71145Oe2.A02(this);
        0qQ.A0B(A023, 1);
        C72203OyT oyT = ((C67724Mtd) this.A0B.getValue()).A01;
        C72203OyT.A03(oyT, A023);
        if (oyT.A0P.getValue() == C69302Nj3.DeviceOnboarded) {
            C67485Mof mof = new C67485Mof(this, 25);
            String A16 = AnonymousClass7TE.A16(requireContext(), 2131961641);
            SpannableStringBuilder append = DbS.A0C(AnonymousClass7TE.A16(requireContext(), 2131961639)).append(" ").append(DbS.A0C(DbY.A0c(requireContext(), A16, 2131961640)));
            0qQ.A07(append);
            AnonymousClass7AV.A03(append, new C46679Dj8(mof, 5), A16);
            A0O.setBody((CharSequence) append);
        }
        IgdsListCell igdsListCell3 = this.A01;
        if (igdsListCell3 != null) {
            igdsListCell3.A0G(C69349Njo.TYPE_RADIO, true);
        }
        IgdsListCell igdsListCell4 = this.A02;
        if (igdsListCell4 != null) {
            igdsListCell4.A0G(C69349Njo.TYPE_RADIO, true);
        }
        AnonymousClass0eM A002 = AnonymousClass1YB.A00(new C67485Mof(this, 26));
        this.A03 = JTP.A0j(AnonymousClass7TF.A1Z(A002) ? 1 : 0);
        if (AnonymousClass7TF.A1Z(A002)) {
            igdsListCell = this.A01;
        } else {
            boolean A024 = AnonymousClass65A.A02(C66581MXm.A0S(this.A09), 36315949942640339L);
            igdsListCell = this.A02;
            if (!A024) {
                AnonymousClass7TH.A0R(igdsListCell);
                igdsListCell = null;
            }
        }
        this.A07 = igdsListCell;
        if (AnonymousClass7TF.A1Z(A002)) {
            igdsListCell2 = this.A02;
        } else {
            igdsListCell2 = this.A01;
        }
        this.A08 = igdsListCell2;
        IgdsListCell igdsListCell5 = this.A07;
        if (igdsListCell5 != null) {
            igdsListCell5.A06(2131961643);
            igdsListCell5.A0H(DbU.A0m(this, 2131961642));
            igdsListCell5.A05(R.drawable.instagram_id_card_pano_outline_24);
        }
        IgdsListCell igdsListCell6 = this.A08;
        if (igdsListCell6 != null) {
            igdsListCell6.A06(2131961644);
            igdsListCell6.A0H(DbU.A0m(this, 2131961638));
            igdsListCell6.A05(R.drawable.instagram_asterisk_pano_outline_24);
        }
        A0B(this);
        this.A06 = (IgdsBottomButtonLayout) inflate.requireViewById(R.id.bottom_buttons);
        AnonymousClass0fD.A09(-899676016, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1244388467);
        super.onDestroyView();
        this.A07 = null;
        this.A08 = null;
        this.A06 = null;
        this.A01 = null;
        this.A02 = null;
        this.A05 = null;
        AnonymousClass0fD.A09(-607636312, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-488856351);
        super.onResume();
        A0B(this);
        AnonymousClass0fD.A09(-1246267069, A022);
    }
}
