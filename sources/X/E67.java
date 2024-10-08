package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.api.schemas.StoryUnlockableStickerData;
import com.instagram.api.schemas.StoryUnlockableStickerTappableObject;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;
import java.util.List;

public final class E67 extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "UnlockableStickersAttributionSheetFragment";
    public StoryUnlockableStickerTappableObject A00;
    public UserSession A01;
    public F2A A02;
    public StoryUnlockableStickerData A03;
    public IgdsButton A04;
    public C46827Dm3 A05;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "unlockable_sticker_attribution_sheet";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        if (r1 != com.instagram.api.schemas.UnlockableStickerStatus.A05) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00(com.instagram.api.schemas.StoryUnlockableStickerData r5) {
        /*
            r4 = this;
            r4.A03 = r5
            java.lang.String r0 = r5.getId()
            if (r0 == 0) goto L_0x0023
            com.instagram.common.session.UserSession r0 = r4.A01
            X.FYo r0 = X.C50333FYo.A00(r0)
            java.lang.String r1 = r5.getId()
            java.util.Map r0 = r0.A00
            java.lang.Object r1 = r0.get(r1)
            if (r1 != 0) goto L_0x001c
            com.instagram.api.schemas.UnlockableStickerStatus r1 = com.instagram.api.schemas.UnlockableStickerStatus.LOCKED
        L_0x001c:
            com.instagram.api.schemas.UnlockableStickerStatus r0 = com.instagram.api.schemas.UnlockableStickerStatus.UNLOCKED
            r3 = 2131975952(0x7f135f10, float:1.958901E38)
            if (r1 == r0) goto L_0x0026
        L_0x0023:
            r3 = 2131975951(0x7f135f0f, float:1.9589009E38)
        L_0x0026:
            com.instagram.igds.components.button.IgdsButton r2 = r4.A04
            android.content.Context r1 = r2.getContext()
            java.lang.String r0 = r5.getName()
            java.lang.String r0 = X.DbW.A0h(r1, r0, r3)
            r2.setText((java.lang.String) r0)
            com.instagram.igds.components.button.IgdsButton r1 = r4.A04
            r0 = 47
            X.FPG.A00(r1, r0, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E67.A00(com.instagram.api.schemas.StoryUnlockableStickerData):void");
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

    public final AnonymousClass0wW getSession() {
        return this.A01;
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

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(946612393);
        E67.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = DbX.A0U(this);
        Parcelable parcelable = requireArguments.getParcelable(C273654mx.A00(3363));
        parcelable.getClass();
        this.A00 = (StoryUnlockableStickerTappableObject) parcelable;
        F2A f2a = this.A02;
        f2a.getClass();
        this.A05 = new C46827Dm3(this, this.A01, f2a, this.A00.Bzq());
        if (this.A00.Bzq() != null) {
            for (StoryUnlockableStickerData storyUnlockableStickerData : this.A00.Bzq()) {
                if (!(storyUnlockableStickerData.getId() == null || storyUnlockableStickerData.CBf() == null)) {
                    C50333FYo A002 = C50333FYo.A00(this.A01);
                    if (A002.A00.get(storyUnlockableStickerData.getId()) == null) {
                        C50333FYo A003 = C50333FYo.A00(this.A01);
                        A003.A00.put(storyUnlockableStickerData.getId(), storyUnlockableStickerData.CBf());
                    }
                }
            }
        }
        AnonymousClass0fD.A09(1026543351, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int size;
        int i;
        StoryUnlockableStickerData storyUnlockableStickerData;
        int A022 = AnonymousClass0fD.A02(-300369566);
        View inflate = layoutInflater.inflate(R.layout.fragment_unlockable_sticker_attribution_sheet, viewGroup, false);
        TextView A052 = Dba.A05(inflate);
        Dba.A06(inflate).setText(this.A00.getTitle());
        A052.setText(this.A00.getSubtitle());
        IgImageView A0B = DbU.A0B(inflate, R.id.sticker_image);
        RecyclerView recyclerView = (RecyclerView) DbU.A0B(inflate, R.id.unlockable_stickers_list);
        View A0B2 = DbU.A0B(inflate, R.id.divider);
        this.A04 = DbU.A0b(inflate, R.id.button);
        List Bzq = this.A00.Bzq();
        if (Bzq == null) {
            size = 0;
        } else {
            size = Bzq.size();
        }
        if (size == 1) {
            i = R.dimen.ai_sticker_creation_suggested_prompt_pill_height;
            if (Bzq == null) {
                storyUnlockableStickerData = null;
            } else {
                storyUnlockableStickerData = (StoryUnlockableStickerData) Bzq.get(0);
            }
            recyclerView.setVisibility(8);
            A0B.setVisibility(0);
            if (!(storyUnlockableStickerData == null || storyUnlockableStickerData.C6x() == null)) {
                DbV.A1P(this, A0B, storyUnlockableStickerData.C6x().getUri());
            }
            A0B2.setVisibility(0);
            this.A04.setVisibility(0);
            if (storyUnlockableStickerData != null) {
                A00(storyUnlockableStickerData);
            }
        } else {
            i = R.dimen.ad4ad_button_bottom_margin;
            DbU.A15(getContext(), recyclerView, 1, false);
            recyclerView.setAdapter(this.A05);
            Dba.A0y(recyclerView, A0B, A0B2, 0, 8);
            this.A04.setVisibility(8);
        }
        0nA.A0X(A052, Dbb.A07(this, i));
        AnonymousClass0fD.A09(1343081649, A022);
        return inflate;
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(68000392);
        super.onResume();
        StoryUnlockableStickerData storyUnlockableStickerData = this.A03;
        if (storyUnlockableStickerData != null) {
            A00(storyUnlockableStickerData);
        } else {
            this.A05.notifyDataSetChanged();
        }
        AnonymousClass0fD.A09(-1741513897, A022);
    }
}
