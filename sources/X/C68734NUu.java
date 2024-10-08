package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.android.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.NUu  reason: case insensitive filesystem */
public final class C68734NUu extends NJT implements C273494mf {
    public static final /* synthetic */ AnonymousClass0YZ[] A04 = NJT.A0A(C68734NUu.class);
    public static final String __redex_internal_original_name = "EncryptedBackupsPinHardblockV2Fragment";
    public final C319956rV A00 = NJT.A02(this, 17);
    public final AnonymousClass0eM A01 = AnonymousClass1YB.A00(new C73663Phc(this, 15));
    public final AnonymousClass0eM A02 = AnonymousClass1YB.A00(new C73663Phc(this, 16));
    public final AnonymousClass0eM A03;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "encrypted_backups_pin_hardblock_v2";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void afterOnViewCreated() {
        Integer A032 = C71145Oe2.A03(this);
        Integer A012 = C71145Oe2.A01(this);
        0qQ.A0B(A032, 0);
        NUN nun = ((C67734Mtn) this.A03.getValue()).A03;
        nun.A0D("ENTRY_POINT", "HARD_BLOCK_PIN_LEADING");
        nun.A0D("SETUP_TYPE", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);
        nun.A0B("HARD_BLOCK_PIN_LEADING_SCREEN_IMPRESSION");
        C66913Mex.A02(nun, A012, "PERIOD", C69893Ntv.A00(A032));
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
        return NJT.A09(this.A00, this, A04, 0);
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.07Z, X.NUu, java.lang.Object] */
    public C68734NUu() {
        C73663Phc phc = new C73663Phc(this, 21);
        AnonymousClass0eM A032 = NJT.A03(new C73663Phc(this, 18), 0eO.A02, 19);
        this.A03 = DbS.A0I(new C73663Phc(A032, 20), phc, C73915Plq.A00(A032, (Object) null, 2), DbS.A0z(C67734Mtn.class));
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1766321481);
        C68734NUu.super.onCreate(bundle);
        C67734Mtn mtn = (C67734Mtn) this.A03.getValue();
        if (AnonymousClass65A.A02(C66581MXm.A0S(mtn.A04), 36315949951881021L)) {
            ((AnonymousClass0wV) AnonymousClass7TE.A14(mtn.A05)).A01((C61180ln) mtn.A06.getValue());
        }
        AnonymousClass0fD.A09(96770074, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FGX fgx;
        int A022 = AnonymousClass0fD.A02(-1769249382);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.encrypted_backups_pin_hardblock_v2, viewGroup, false);
        IgdsHeadline A0O = C66584MXp.A0O(inflate);
        if (AnonymousClass7TF.A1Z(this.A02)) {
            AnonymousClass0eM r3 = this.A01;
            boolean A1Z = AnonymousClass7TF.A1Z(r3);
            NUN nun = ((C67734Mtn) this.A03.getValue()).A03;
            nun.A0E("IS_HARD_BLOCK_RELEASE", true);
            nun.A0E("HAS_IMPLICIT_BACKUP", A1Z);
            boolean A1Z2 = AnonymousClass7TF.A1Z(r3);
            Boolean A0v = AnonymousClass7TE.A0v();
            Context requireContext = requireContext();
            if (A1Z2) {
                NJT.A05(this, fgx, 2131961147);
                fgx.A05((CharSequence) null, getString(2131961148), R.drawable.instagram_asterisk_pano_outline_24);
            } else {
                fgx = new FGX(requireContext, A0v, 4);
                NJT.A05(this, fgx, 2131961149);
                fgx.A05((CharSequence) null, getString(2131961150), R.drawable.instagram_asterisk_pano_outline_24);
                fgx.A05((CharSequence) null, getString(2131961151), R.drawable.instagram_circle_block_off_pano_outline_24);
            }
            A0O.setBulletList(fgx.A04());
            int i = 2131961146;
            if (AnonymousClass7TF.A1Z(r3)) {
                i = 2131961145;
            }
            A0O.setHeadline(i);
            A0O.setImageResource(R.drawable.ig_illustrations_illo_device_warning_refresh);
        } else {
            FGX A012 = FGX.A01(requireContext(), AnonymousClass7TE.A0v());
            NJT.A05(this, A012, 2131961143);
            FGX.A03(A012, A0O, (CharSequence) null, getString(2131961144), R.drawable.instagram_key_pano_outline_24);
        }
        NJT.A04(inflate, this);
        C3021461u r1 = (C3021461u) AnonymousClass7TF.A0F(inflate, R.id.bottom_buttons);
        C71407Ok6.A02(r1, this, 28);
        NJT.A07(r1, this, 29);
        AnonymousClass0fD.A09(-1000601380, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(359837998);
        super.onDestroy();
        C67734Mtn mtn = (C67734Mtn) this.A03.getValue();
        if (AnonymousClass65A.A02(C66581MXm.A0S(mtn.A04), 36315949951881021L)) {
            ((AnonymousClass0wV) AnonymousClass7TE.A14(mtn.A05)).A02((C61180ln) mtn.A06.getValue());
        }
        AnonymousClass0fD.A09(249421532, A022);
    }
}
