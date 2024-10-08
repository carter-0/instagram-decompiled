package X;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import com.instagram.archive.data.ArchiveStoryRepository;
import com.instagram.direct.prompts.dailyprompts.repository.DirectDailyPromptsResponseListRepository;
import com.instagram.fanclub.settings.repository.FanClubSettingsRepository;
import com.instagram.settings2.core.session.SettingsSession;
import com.instagram.settings2.core.viewmodel.UiStateKt;
import com.instagram.settings2.extension.customstorage.manuallyapprovetags.ManuallyApproveTagsCustomStorageHandler;
import com.instagram.video.live.mvvm.model.repository.IgLiveQuestionSubmissionsRepository;
import com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel;
import com.instagram.wellbeing.upsells.fragment.dismissnudge.DismissNudgeRepository;
import com.instagram.wellbeing.upsells.fragment.remixsettings.RemixSettingsRepository;

public final class JUN extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public boolean A04;
    public final int A05;

    /* JADX WARNING: type inference failed for: r7v0, types: [X.JUN, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        switch (this.A05) {
            case 0:
                this.A03 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return TapGestureDetectorKt.A01((AnonymousClass6GK) null, (GWN) null, this, false);
            case 1:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((ArchiveStoryRepository) this.A03).A00((String) null, this, false, false);
            case 2:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((DirectDailyPromptsResponseListRepository) this.A03).A01((String) null, (String) null, (String) null, this, false, false);
            case 3:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((C64830Liq) this.A03).A01(this, false);
            case 4:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((FanClubSettingsRepository) this.A03).A01(this, false);
            case 5:
                this.A03 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return UiStateKt.A03((C60894JtE) null, (SettingsSession) null, this, false);
            case 6:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((ManuallyApproveTagsCustomStorageHandler) this.A03).A00(this, false);
            case 7:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((IgLiveQuestionSubmissionsRepository) this.A03).A00(this, false);
            case 8:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return IgLiveViewerLikesViewModel.A01((IgLiveViewerLikesViewModel) this.A03, this, false);
            case 9:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((DismissNudgeRepository) this.A03).A00((C16500Uvw) null, this, false);
            default:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((RemixSettingsRepository) this.A03).EK9((C16548Uwv) null, (C16548Uwv) null, this, false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JUN(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A05 = i;
        this.A03 = obj;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof JUN) || ((JUN) obj).A05 != i) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JUN(int i, AnonymousClass4D7 r2) {
        super(r2);
        this.A05 = i;
    }
}
