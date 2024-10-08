package X;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository;
import com.instagram.common.session.UserSession;

public final class I8S implements DialogInterface.OnClickListener {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ ClipsDraftPreviewItemRepository A01;
    public final /* synthetic */ 1P0 A02;
    public final /* synthetic */ 1OC A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ 1Xj A05;
    public final /* synthetic */ boolean A06;

    public I8S(Fragment fragment, ClipsDraftPreviewItemRepository clipsDraftPreviewItemRepository, 1P0 r3, 1OC r4, UserSession userSession, 1Xj r6, boolean z) {
        this.A04 = userSession;
        this.A01 = clipsDraftPreviewItemRepository;
        this.A05 = r6;
        this.A00 = fragment;
        this.A06 = z;
        this.A02 = r3;
        this.A03 = r4;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass0iw A012;
        AnonymousClass5OC r1;
        UserSession userSession = this.A04;
        boolean A062 = 182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36325360216126373L);
        if (A062) {
            ClipsDraftPreviewItemRepository clipsDraftPreviewItemRepository = this.A01;
            1Xj r3 = this.A05;
            String id = r3.getId();
            if (id != null) {
                clipsDraftPreviewItemRepository.A03(id, new JGB(userSession, 38));
                FragmentActivity activity = this.A00.getActivity();
                String A2n = r3.A2n();
                boolean z = this.A06;
                0qQ.A0B(userSession, 1);
                if (!(A2n == null || (A012 = AnonymousClass6WL.A01(activity)) == null)) {
                    if (z) {
                        r1 = AnonymousClass5OC.DELETE_AND_MOVE_TO_DRAFTS_DIALOG;
                    } else {
                        r1 = AnonymousClass5OC.MOVE_TO_DRAFTS_DIALOG;
                    }
                    C52086GEg.A08(r1, C52236GKd.A0t, A012, userSession, A2n);
                }
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        ClipsDraftPreviewItemRepository clipsDraftPreviewItemRepository2 = this.A01;
        String id2 = this.A05.getId();
        if (id2 != null) {
            clipsDraftPreviewItemRepository2.A02(id2, new C58736Iwj(43, userSession, A062));
            1P0 r12 = this.A02;
            if (r12 != null) {
                this.A03.A00 = r12;
            }
            Fragment fragment = this.A00;
            1ES.A00(fragment.requireContext(), AnonymousClass07i.A00(fragment), this.A03);
            return;
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
