package X;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository;
import com.instagram.common.session.UserSession;

public final class I8U implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ DialogInterface.OnClickListener A01;
    public final /* synthetic */ DialogInterface.OnDismissListener A02;
    public final /* synthetic */ Fragment A03;
    public final /* synthetic */ ClipsDraftPreviewItemRepository A04;
    public final /* synthetic */ 0wc A05;
    public final /* synthetic */ 1P0 A06;
    public final /* synthetic */ UserSession A07;
    public final /* synthetic */ 1Xj A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ C62320sa A0A;

    public I8U(Activity activity, DialogInterface.OnClickListener onClickListener, DialogInterface.OnDismissListener onDismissListener, Fragment fragment, ClipsDraftPreviewItemRepository clipsDraftPreviewItemRepository, 0wc r6, 1P0 r7, UserSession userSession, 1Xj r9, String str, C62320sa r11) {
        this.A07 = userSession;
        this.A04 = clipsDraftPreviewItemRepository;
        this.A08 = r9;
        this.A03 = fragment;
        this.A00 = activity;
        this.A05 = r6;
        this.A06 = r7;
        this.A0A = r11;
        this.A02 = onDismissListener;
        this.A09 = str;
        this.A01 = onClickListener;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        UserSession userSession = this.A07;
        if (182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36325360216126373L)) {
            ClipsDraftPreviewItemRepository clipsDraftPreviewItemRepository = this.A04;
            1Xj r4 = this.A08;
            String id = r4.getId();
            if (id != null) {
                clipsDraftPreviewItemRepository.A03(id, JG3.A00(this.A03, userSession, r4, 39));
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        Fragment fragment = this.A03;
        FragmentActivity activity = fragment.getActivity();
        Activity activity2 = this.A00;
        1Xj r3 = this.A08;
        String A032 = I7G.A03(activity2, userSession, r3, true);
        C358278ae r16 = C358278ae.RED_BOLD;
        0wc r42 = this.A05;
        1P0 r8 = this.A06;
        C62320sa r7 = this.A0A;
        C50019FJe fJe = new C50019FJe(fragment, r42, r8, userSession, r3, r7, 8);
        String str = this.A09;
        C56659I6o.A02(fJe, new FIZ(this.A01, r42, userSession, str, 9), new C50019FJe(fragment, r42, r8, userSession, r3, r7, 9), this.A02, new C50039FJy(r42, userSession, str, 1), activity, r16, r16, 2131957500, A032, 2131957498, 2131957499, 2131954722);
    }
}
