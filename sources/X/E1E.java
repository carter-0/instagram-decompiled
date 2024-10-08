package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;

public final class E1E extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "SocialStickersDisclaimerBottomSheetFragment";
    public C62320sa A00 = new MMO(this, 22);
    public C62320sa A01 = new MMO(this, 24);
    public final AnonymousClass0eM A02 = AnonymousClass1YB.A00(new MMO(this, 21));
    public final AnonymousClass0eM A03 = AnonymousClass1YB.A00(new MMO(this, 23));
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final AnonymousClass0eM A05 = AnonymousClass1YB.A00(new MMO(this, 25));

    public final String getModuleName() {
        return "social_stickers_disclaimer";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        C3261575p r3 = ((C3261475o) this.A02.getValue()).A04;
        r3.A00 = C3261575p.A04;
        C3261675q r32 = r3.A02;
        2IS A042 = C41845B3m.A04();
        2IS A043 = C41845B3m.A04();
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41845B3m.A05(), "IGSocialAvatarStickerMarkDisclaimerAsSeenMutation", A042.getParamsCopy(), A043.getParamsCopy(), BqT.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, AnonymousClass000.A00(4268), AnonymousClass7TE.A1C());
        r32.A00.ATL(C50160FRs.A00, FSQ.A00, pandoGraphQLRequest);
        ImageUrl imageUrl = (ImageUrl) this.A05.getValue();
        if (imageUrl != null) {
            view2.findViewById(R.id.disclaimer_image).setUrl(imageUrl, this);
        }
        FPI.A01(view2.findViewById(R.id.disclaimer_settings_button), 30, this);
        DbZ.A1R(((C49326Eth) this.A03.getValue()).A00, "social_avatars_bottom_sheet_disclaimer_impression");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2048843147);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.social_stickers_disclaimer_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-1494933905, A022);
        return inflate;
    }
}
