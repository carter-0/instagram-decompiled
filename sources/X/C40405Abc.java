package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;

/* renamed from: X.Abc  reason: case insensitive filesystem */
public final class C40405Abc implements C66475MTd {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ 28D A01;
    public final /* synthetic */ AnonymousClass9P8 A02;
    public final /* synthetic */ ClipsCreationDraftViewModel A03;

    public C40405Abc(FragmentActivity fragmentActivity, 28D r2, AnonymousClass9P8 r3, ClipsCreationDraftViewModel clipsCreationDraftViewModel) {
        this.A03 = clipsCreationDraftViewModel;
        this.A00 = fragmentActivity;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void D81() {
        this.A03.A0B();
    }

    public final void DdC(1Xj r8) {
        ClipsCreationDraftViewModel clipsCreationDraftViewModel = this.A03;
        AnonymousClass7TE.A1Z(new MG6(clipsCreationDraftViewModel, (AnonymousClass4D7) null, 8), C318116oQ.A00(clipsCreationDraftViewModel));
        UserSession userSession = clipsCreationDraftViewModel.A0E;
        FragmentActivity fragmentActivity = this.A00;
        Context context = clipsCreationDraftViewModel.A04;
        28D r0 = this.A01;
        AnonymousClass9P8 r3 = this.A02;
        C52345GOp gOp = C52345GOp.A00;
        C56044Hrt A0C = C250563lf.A0C(r0);
        gOp.A0G(fragmentActivity, r3, r8, A0C);
        A0C.A0q = true;
        AnonymousClass6W8.A02(fragmentActivity, A0C.A00(), userSession, TransparentModalActivity.class, "clips_camera").A0C(context);
        if (fragmentActivity instanceof ModalActivity) {
            ((ModalActivity) fragmentActivity).finish();
        }
    }
}
