package X;

import androidx.fragment.app.FragmentActivity;

public final class P1F implements AnonymousClass7HL {
    public final /* synthetic */ C68442NIf A00;

    public final void D00() {
    }

    public final void DMs(int i) {
    }

    public final boolean Dj1(String str) {
        00N onBackPressedDispatcher;
        0qQ.A0B(str, 0);
        C68442NIf nIf = this.A00;
        C67731Mtk mtk = (C67731Mtk) nIf.A0B.getValue();
        ((C333537Zi) mtk.A03.getValue()).EMO((C254933tI) null, mtk.A01, "daily_prompt", (String) null, mtk.A02, str, (String) null);
        AnonymousClass2Ep r3 = nIf.A04;
        if (r3 != null) {
            C66930MfP mfP = (C66930MfP) nIf.A09.getValue();
            String C6C = r3.C6C();
            String C6k = r3.C6k();
            String str2 = nIf.A06;
            if (str2 == null) {
                0qQ.A0F("itemId");
                throw AnonymousClass00P.createAndThrow();
            }
            C66930MfP.A02(mfP, C6C, C6k, "daily_prompt_response_replied", "tap", "send_button", "daily_prompt_response_reply_sheet", AnonymousClass7TF.A0w("daily_prompt_submission_id", str2), r3.AdN());
        }
        FragmentActivity activity = nIf.getActivity();
        if (activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null) {
            return true;
        }
        onBackPressedDispatcher.A04();
        return true;
    }

    public P1F(C68442NIf nIf) {
        this.A00 = nIf;
    }
}
