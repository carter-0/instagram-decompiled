package X;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.reshare.model.ClipsCelebrationReshareViewModel;
import com.instagram.modal.TransparentModalActivity;

public final class H0J extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "AchievementDetailsFragment";
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01 = C58683Ivs.A00(this, 12);
    public final AnonymousClass0eM A02 = C58683Ivs.A00(this, 13);
    public final AnonymousClass0eM A03 = C58683Ivs.A00(this, 14);
    public final AnonymousClass0eM A04;

    public static final void A01(H0J h0j, 1Xj r14, String str, String str2, String str3) {
        H0J h0j2 = h0j;
        FragmentActivity requireActivity = h0j.requireActivity();
        if (!requireActivity.isFinishing() && !requireActivity.isDestroyed() && str2 != null) {
            AnonymousClass0eM r3 = h0j.A04;
            0lg A0X = DbT.A0X(r3);
            if (182.A06(DbS.A0J(A0X, 0), A0X, 36323058114374450L)) {
                DbX.A10(requireActivity, AnonymousClass37D.A00);
            }
            1Xj r10 = r14;
            String str4 = str3;
            if (r14.A5T() || r14.A5F()) {
                RectF rectF = new RectF(0.0f, 0.0f, (float) AnonymousClass0nB.A01(h0j2.requireContext()), (float) AnonymousClass0nB.A00(h0j2.requireContext()));
                FFV.A02(requireActivity, rectF, rectF, AnonymousClass7TE.A0l(r3), (ClipsCelebrationReshareViewModel) null, r10, "ig_achievements", str4, 0, false);
            } else if (r14.A67() || str != null) {
                F7J.A01(requireActivity, h0j2, AnonymousClass7TE.A0l(r3), r10, "achievements", str4, false);
            } else if (r14.A5G()) {
                C243473Yx.A02(requireActivity, h0j2, 28D.A0k, AnonymousClass7TE.A0l(r3), (ClipsCelebrationReshareViewModel) null, r10, str4, false);
            }
        }
    }

    public final String getModuleName() {
        return "achievement_details_fragment";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public H0J() {
        C58683Ivs ivs = new C58683Ivs(this, 11);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C58683Ivs(new C58683Ivs(this, 15), 16));
        this.A00 = DbS.A0I(new C58683Ivs(A002, 17), ivs, new MMY(44, A002, (Object) null), DbS.A0z(C53031GhM.class));
        this.A04 = C227642jf.A02(this);
    }

    public static final void A00(H0J h0j, 1Xj r6, String str, String str2) {
        AnonymousClass6W8 A012;
        FragmentActivity requireActivity = h0j.requireActivity();
        if (!requireActivity.isFinishing() && !requireActivity.isDestroyed()) {
            if (r6.A5T() || r6.A5F()) {
                FGD.A02(requireActivity, AnonymousClass7TE.A0l(h0j.A04), str);
                return;
            }
            if (r6.A5G()) {
                UserSession A0l = AnonymousClass7TE.A0l(h0j.A04);
                AnonymousClass7TG.A1O(A0l, str);
                String str3 = A0l.A06;
                0qQ.A0B(str3, 1);
                String A0T = 002.A0T(str, str3, '_');
                C270634h3 A0i = C51965G9l.A0i(ClipsViewerSource.ACHIEVEMENTS_EARNED, A0l);
                A0i.A1C = A0T;
                ClipsViewerConfig A002 = A0i.A00();
                Bundle A0a = AnonymousClass7TE.A0a();
                A0a.putParcelable(C273654mx.A00(105), A002);
                A012 = DbS.A0b(requireActivity, A0a, A0l, TransparentModalActivity.class, C273654mx.A00(2164));
                A012.A0H = C51965G9l.A1a(0Tu.A05, A0l, 36317560555509074L);
            } else if (r6.A67() && str2 != null) {
                UserSession A0l2 = AnonymousClass7TE.A0l(h0j.A04);
                String A2n = r6.A2n();
                if (A2n != null) {
                    0qQ.A0B(A0l2, 1);
                    A012 = AnonymousClass6W8.A01(requireActivity, FGD.A00(requireActivity, A0l2, str2, A2n).A00(), A0l2);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            } else {
                return;
            }
            A012.A07();
            A012.A0C(requireActivity);
        }
    }

    public final void onCreate(Bundle bundle) {
        C318136oS A002;
        0sL mGc;
        int A022 = AnonymousClass0fD.A02(1932482345);
        H0J.super.onCreate(bundle);
        C53031GhM ghM = (C53031GhM) this.A00.getValue();
        String A0t = DbS.A0t(this.A03);
        C318136oS A003 = C318116oQ.A00(ghM);
        C58102ImO imO = new C58102ImO(ghM, (AnonymousClass4D7) null, 5);
        19B r4 = 19B.A00;
        1Eo.A05(r4, imO, A003);
        if (!182.A06(0Tu.A05, ghM.A00, 36323058115291968L)) {
            String str = ghM.A02;
            String str2 = ghM.A03;
            A002 = C51967G9n.A0M(ghM, r4, new MEe(ghM, A0t, str, str2, (AnonymousClass4D7) null, 1), C318116oQ.A00(ghM));
            mGc = new C58102ImO(ghM, (AnonymousClass4D7) null, 6);
        } else {
            A002 = C318116oQ.A00(ghM);
            mGc = new C66165MGc(ghM, (AnonymousClass4D7) null, 42);
        }
        1Eo.A05(r4, mGc, A002);
        AnonymousClass0fD.A09(2039399933, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-410732896);
        ComposeView A0H = DbV.A0H(this, C59342JFu.A00(this, 21), 1077206085);
        AnonymousClass0fD.A09(2072907248, A022);
        return A0H;
    }
}
