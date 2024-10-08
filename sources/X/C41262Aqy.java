package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;

/* renamed from: X.Aqy  reason: case insensitive filesystem */
public final class C41262Aqy implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ C369968vc A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ PendingRecipient A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public C41262Aqy(Activity activity, Fragment fragment, C369968vc r3, UserSession userSession, PendingRecipient pendingRecipient, String str, boolean z, boolean z2) {
        this.A03 = userSession;
        this.A05 = str;
        this.A02 = r3;
        this.A04 = pendingRecipient;
        this.A06 = z;
        this.A01 = fragment;
        this.A00 = activity;
        this.A07 = z2;
    }

    public final void run() {
        Bundle bundle;
        UserSession userSession = this.A03;
        AnonymousClass7TE.A0n(userSession).A08(this.A05);
        Class<ModalActivity> cls = ModalActivity.class;
        C369968vc r6 = this.A02;
        PendingRecipient pendingRecipient = this.A04;
        boolean z = this.A06;
        Fragment fragment = this.A01;
        String str = r6.A09;
        boolean A1Z = AnonymousClass7TG.A1Z(userSession, str);
        Bundle A0P = AnonymousClass7TG.A0P(AnonymousClass000.A00(23), str, AnonymousClass7TE.A1L("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05));
        boolean z2 = true;
        A0P.putBoolean(C273654mx.A00(212), A1Z);
        A0P.putParcelable(AnonymousClass000.A00(57), pendingRecipient);
        if (r6.A04 != C2801950r.CLIPS) {
            z2 = false;
        }
        A0P.putBoolean(AnonymousClass000.A00(100), z2);
        A0P.putBoolean(AnonymousClass000.A00(2152), z);
        C320236s2.A01(A0P, "IgSessionManager.SESSION_TOKEN_KEY");
        if (!(fragment == null || (bundle = fragment.mArguments) == null)) {
            A0P.putString("ARGS_DEFAULT_FOLDER_NAME", bundle.getString("ARGS_DEFAULT_FOLDER_NAME"));
            A0P.putString("ARGS_GALLERY_TITLE", bundle.getString("ARGS_GALLERY_TITLE"));
            A0P.putString("ARGS_GALLERY_SUBTITLE", bundle.getString("ARGS_GALLERY_SUBTITLE"));
            A0P.putString("ARGS_HIGHLIGHTED_CREATION_TOOL", bundle.getString("ARGS_HIGHLIGHTED_CREATION_TOOL"));
        }
        Activity activity = this.A00;
        AnonymousClass6W8 r62 = new AnonymousClass6W8(activity, A0P, userSession, cls, "clips_share_sheet");
        if (!this.A07 || fragment == null || fragment.getContext() == null) {
            r62.A0A(activity, 9583);
        } else {
            r62.A0D(fragment, 9583);
        }
    }
}
