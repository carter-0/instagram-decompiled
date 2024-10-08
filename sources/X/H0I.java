package X;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.api.schemas.ChallengeName;
import com.instagram.api.schemas.ChallengeState;

public final class H0I extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "ChallengeDetailsFragment";
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final String getModuleName() {
        return "challenge_details_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C66171MGi(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 13), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public static final ChallengeName A00(H0I h0i) {
        Object parcelable;
        int i = Build.VERSION.SDK_INT;
        Bundle bundle = h0i.mArguments;
        if (i >= 33) {
            if (bundle != null) {
                parcelable = bundle.getParcelable("CHALLENGE_NAME_KEY", ChallengeName.class);
            }
            throw AnonymousClass7TE.A0y();
        }
        if (bundle != null) {
            parcelable = bundle.getParcelable("CHALLENGE_NAME_KEY");
        }
        throw AnonymousClass7TE.A0y();
        ChallengeName challengeName = (ChallengeName) parcelable;
        if (challengeName != null) {
            return challengeName;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final ChallengeState A01(H0I h0i) {
        Object parcelable;
        int i = Build.VERSION.SDK_INT;
        Bundle bundle = h0i.mArguments;
        if (i >= 33) {
            if (bundle != null) {
                parcelable = bundle.getParcelable("CHALLENGE_STATE_KEY", ChallengeState.class);
            }
            throw AnonymousClass7TE.A0y();
        }
        if (bundle != null) {
            parcelable = bundle.getParcelable("CHALLENGE_STATE_KEY");
        }
        throw AnonymousClass7TE.A0y();
        ChallengeState challengeState = (ChallengeState) parcelable;
        if (challengeState != null) {
            return challengeState;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public H0I() {
        C58683Ivs ivs = new C58683Ivs(this, 29);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C58683Ivs(new C58683Ivs(this, 30), 31));
        this.A00 = DbS.A0I(new C58683Ivs(A002, 32), ivs, new MMY(49, A002, (Object) null), DbS.A0z(C53034GhQ.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1329528379);
        ComposeView A0H = DbV.A0H(this, C59342JFu.A00(this, 24), 1025748293);
        AnonymousClass0fD.A09(76686223, A02);
        return A0H;
    }
}
