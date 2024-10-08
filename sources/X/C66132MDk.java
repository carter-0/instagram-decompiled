package X;

import com.instagram.api.schemas.MediaTrialGraduationStrategy;
import com.instagram.creation.capture.quickcapture.sundial.remix.repository.ClipsRemixOriginalMediaRepository;
import com.instagram.creation.sharesheet.update.trial.TrialUseCase;
import com.instagram.direct.emojipong.data.EmojiPongRepository;
import com.instagram.mainfeed.data.datasource.local.MainFeedLocalDataSource;
import com.instagram.pendingmedia.service.impl.ShareClipsTemplateHelper;
import com.instagram.user.model.User;
import com.instagram.video.live.mvvm.viewmodel.optionsdialog.IgLiveOptionsDialogViewModel;
import com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository;

/* renamed from: X.MDk  reason: case insensitive filesystem */
public final class C66132MDk extends C64101El {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;
    public final Object A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66132MDk(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A05 = i;
        this.A06 = obj;
    }

    public static void A00(Object obj, C66132MDk mDk) {
        mDk.A04 = obj;
        mDk.A01 |= AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public static boolean A01(int i, Object obj) {
        if (!(obj instanceof C66132MDk) || ((C66132MDk) obj).A05 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.MDk, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        int i = this.A05;
        A00(obj, this);
        switch (i) {
            case 0:
                return ((ClipsRemixOriginalMediaRepository.Companion) this.A06).A00((AnonymousClass2NS) null, this, 0);
            case 1:
                return TrialUseCase.A00((MediaTrialGraduationStrategy) null, (TrialUseCase) this.A06, this);
            case 2:
                return ((EmojiPongRepository) this.A06).A00((String) null, (String) null, this, 0);
            case 3:
                return ((MainFeedLocalDataSource) this.A06).A04(this);
            case 4:
                return ((ShareClipsTemplateHelper) this.A06).A00((LP8) null, this, (C249523jv) null);
            case 5:
                return ((IgLiveOptionsDialogViewModel) this.A06).A02((User) null, (MVW) null, (String) null, this, false);
            default:
                return ((LimitsPlusRepository) this.A06).A05(this, (0sP) null);
        }
    }
}
