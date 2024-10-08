package X;

import android.app.Dialog;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions;
import com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel;
import com.instagram.user.model.User;
import com.instagram.wellbeing.supervisionupsells.constants.IGSupervisionUpsellEligibilityStatus;
import java.util.HashMap;

/* renamed from: X.EbW  reason: case insensitive filesystem */
public abstract class C48251EbW {
    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, X.O2l] */
    public final void A00(DwB dwB) {
        if (this instanceof C47933ENk) {
            C47933ENk eNk = (C47933ENk) this;
            1P0 r1 = eNk.A00;
            if (r1 != null) {
                r1.onSuccess(eNk.A01);
                return;
            }
            return;
        }
        C47934ENl eNl = (C47934ENl) this;
        if (dwB.A00.A0N() == AnonymousClass05K.A0C) {
            if (eNl.A02) {
                ESI esi = eNl.A00;
                if (esi.A01 == null) {
                    User user = eNl.A01;
                    C358248ab A0U = DbW.A0U(esi);
                    A0U.A09(2131954997);
                    A0U.A08(2131954995);
                    A0U.A07(R.drawable.instagram_users_outline_96);
                    C50025FJk.A01(A0U, user, esi, 51, 2131954996);
                    A0U.A0C(C50021FJg.A00(esi, 32));
                    C49968FHb.A00(A0U, esi, 7);
                    esi.A01 = A0U.A02();
                }
                Dba.A1I(esi.A03, "remove_self_followers_dialog_impression");
                Dialog dialog = esi.A01;
                if (dialog != null) {
                    AnonymousClass0fN.A00(dialog);
                }
            }
            ESI esi2 = eNl.A00;
            if (esi2.A0B) {
                AnonymousClass0eM r6 = esi2.A0E;
                if (182.A06(0Tu.A05, AnonymousClass7TF.A0L(r6, 0), 36318956419619596L)) {
                    C72197OyI A00 = C70332O2k.A00(AnonymousClass7TE.A0l(r6), DbX.A0h(r6), new Object());
                    DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions = DirectMessageInteropReachabilityOptions.A0A;
                    A00.A02(new DirectMessagesInteropOptionsViewModel(directMessageInteropReachabilityOptions, directMessageInteropReachabilityOptions, directMessageInteropReachabilityOptions, directMessageInteropReachabilityOptions, directMessageInteropReachabilityOptions, directMessageInteropReachabilityOptions, directMessageInteropReachabilityOptions, directMessageInteropReachabilityOptions, DirectMessageInteropReachabilityOptions.A0E, directMessageInteropReachabilityOptions), C66579MXk.A00(132));
                    try {
                        C46649DiU A04 = C46649DiU.A04(AnonymousClass000.A00(2884), AnonymousClass7TE.A1E());
                        FragmentActivity requireActivity = esi2.requireActivity();
                        IgBloksScreenConfig A0N = DbS.A0N(AnonymousClass7TE.A0l(r6));
                        DbZ.A19(esi2, A0N, 2131961772);
                        C46649DiU.A07(requireActivity, A0N, A04);
                    } catch (Exception unused) {
                        0wb.A03("account_privacy_options", "navigation failed to review settings screen:private");
                    }
                }
            }
        }
        ESI esi3 = eNl.A00;
        AnonymousClass0eM r4 = esi3.A0E;
        if (182.A06(0Tu.A06, DbT.A0X(r4), 36318436728707197L)) {
            HashMap A0F = DbX.A0h(r4).A0F();
            A0F.put("UPDATE_ACCOUNT_PRIVACY_SETTING", new IGSupervisionUpsellEligibilityStatus(true));
            DbX.A0h(r4).A17(A0F);
        }
        esi3.setItems(ESI.A06(esi3));
    }
}
