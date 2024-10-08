package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.creation.MediaCaptureConfig;
import java.io.IOException;

/* renamed from: X.LrE  reason: case insensitive filesystem */
public final class C65315LrE implements C74569PxI {
    public final Fragment A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final AnonymousClass311 A03;

    public final C247223fy BRK() {
        return this.A03.BRK();
    }

    public final void CuR(DUO duo, String str) {
        try {
            FragmentActivity requireActivity = this.A00.requireActivity();
            AnonymousClass36U A002 = AnonymousClass36R.A00(requireActivity, this.A01, new C50348FZf(requireActivity, 4));
            AnonymousClass36W r3 = AnonymousClass36W.FOLLOWERS_SHARE;
            JWU jwu = new JWU(r3);
            jwu.A0A = false;
            jwu.A0F = true;
            A002.Ewc(EXF.A0A, new MediaCaptureConfig(jwu), r3);
        } catch (IOException unused) {
            0wb.A01.Ew0("FeedAddYoursMediaCTABarDelegateImpl", "Failed to deserialize MediaPromptData from onAddYoursCreationLabelClicked");
        }
    }

    public final void CuS(DUO duo) {
        C360678ey A05 = C359988do.A05(this.A01, "com.instagram.feed.prompt.open_participation_screen", DbY.A0m("prompt_id", duo.Bhp()));
        A05.A00(new K8T(this, 2));
        this.A00.schedule(A05);
    }

    public C65315LrE(Fragment fragment, UserSession userSession, AnonymousClass311 r3, AnonymousClass4DU r4) {
        this.A01 = userSession;
        this.A00 = fragment;
        this.A02 = r4;
        this.A03 = r3;
    }
}
