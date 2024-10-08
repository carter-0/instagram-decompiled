package X;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.neko.playables.activity.PlayableAdWebView;
import com.instagram.neko.playables.activity.PlayableProgressBar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class R8W extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "PlayableAdFragment";
    public 0wc A00;
    public PlayableAdWebView A01;
    public PlayableProgressBar A02;
    public String A03;
    public String A04;
    public String A05;
    public boolean A06;
    public String A07;
    public final String A08 = "https://play.google.com/store/apps";
    public final AnonymousClass0eM A09 = C227642jf.A02(this);

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        r3.ErN(this.A07);
        r3.Ets(false);
        r3.Etr(true);
        r3.ENd(new ColorDrawable(2Yu.A0F(requireContext(), R.attr.igds_color_elevated_background)));
    }

    public final String getModuleName() {
        return "playable_ad";
    }

    public final boolean isOrganicEligible() {
        return false;
    }

    public final boolean isSponsoredEligible() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Object, X.0bY] */
    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle requireArguments = requireArguments();
        String A012 = C320236s2.A01(requireArguments, "media_id");
        AnonymousClass0eM r6 = this.A09;
        C246153e7 r1 = new C246153e7((AnonymousClass4HI) null, AnonymousClass7TE.A0l(r6), DbV.A0U(AnonymousClass7TE.A0l(r6), A012), this);
        this.A00 = AnonymousClass0kN.A01(this, DbT.A0X(r6));
        this.A04 = AnonymousClass7TF.A0c();
        this.A03 = requireArguments.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        this.A05 = r1.AWo();
        C238833Dp.A00(DbT.A0X(r6)).A0A(view, r1);
        C11495SbI.A00(AnonymousClass7TF.A0G(view, R.id.playable_native_cta_button), 18, this);
        this.A02 = (PlayableProgressBar) view.requireViewById(R.id.playable_progress_bar);
        String A013 = C320236s2.A01(requireArguments, AnonymousClass000.A00(347));
        this.A01 = (PlayableAdWebView) view.requireViewById(R.id.playable_web_view);
        this.A07 = requireArguments.getString("playable_title");
        0qQ.A0B(A013, 0);
        PlayableAdWebView playableAdWebView = this.A01;
        if (playableAdWebView != null) {
            playableAdWebView.setBackgroundColor(0);
            C12273SqS sqS = new C12273SqS(this);
            PlayableAdWebView playableAdWebView2 = this.A01;
            if (playableAdWebView2 != null) {
                ArrayList A1C = AnonymousClass7TE.A1C();
                ArrayList A1C2 = AnonymousClass7TE.A1C();
                ArrayList A0v = DbS.A0v(4);
                List asList = Arrays.asList(new String[]{"http", "https"});
                if (!asList.isEmpty()) {
                    A0v.add(new C7900QcS(asList));
                    A0v.add(new C7901QcT(new String[]{"fbsbx.com"}));
                    AnonymousClass0cm A002 = C9571RdB.A00(A0v);
                    0qQ.A07(A002);
                    A1C2.add(A002);
                    A1C.add(new C13442TaV[]{sqS}[0]);
                    playableAdWebView2.A01 = new S4j(new Object(), new C9569Rd9(), A1C, A1C2);
                    C10318RqG rqG = new C10318RqG(this);
                    C10318RqG rqG2 = new C10318RqG(this);
                    C7891QcJ qcJ = new C7891QcJ(this);
                    PlayableAdWebView playableAdWebView3 = this.A01;
                    if (playableAdWebView3 != null) {
                        playableAdWebView3.A02(qcJ);
                        S7R s7r = new S7R(rqG);
                        PlayableAdWebView playableAdWebView4 = this.A01;
                        if (playableAdWebView4 != null) {
                            playableAdWebView4.addJavascriptInterface(s7r, "FbPlayableAd");
                            S7R s7r2 = new S7R(rqG2);
                            PlayableAdWebView playableAdWebView5 = this.A01;
                            if (playableAdWebView5 != null) {
                                playableAdWebView5.addJavascriptInterface(s7r2, "SecureFbPlayableAd");
                                C7888QcE qcE = new C7888QcE(this);
                                PlayableAdWebView playableAdWebView6 = this.A01;
                                if (playableAdWebView6 != null) {
                                    playableAdWebView6.A01(qcE);
                                    PlayableAdWebView playableAdWebView7 = this.A01;
                                    if (playableAdWebView7 != null) {
                                        C11507SbU.A00(playableAdWebView7, 10, this);
                                        PlayableAdWebView playableAdWebView8 = this.A01;
                                        if (playableAdWebView8 != null) {
                                            playableAdWebView8.getSettings().setLoadWithOverviewMode(true);
                                            PlayableAdWebView playableAdWebView9 = this.A01;
                                            if (playableAdWebView9 != null) {
                                                playableAdWebView9.getSettings().setUseWideViewPort(true);
                                                PlayableAdWebView playableAdWebView10 = this.A01;
                                                if (playableAdWebView10 != null) {
                                                    playableAdWebView10.setVisibility(0);
                                                    PlayableAdWebView playableAdWebView11 = this.A01;
                                                    if (playableAdWebView11 != null) {
                                                        playableAdWebView11.loadUrl(A013);
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    throw AnonymousClass7TE.A0w("Cannot set 0 schemes");
                }
            }
        }
        0qQ.A0F("playableAdWebView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A00() {
        C238833Dp A002 = C238833Dp.A00(DbT.A0X(this.A09));
        View view = this.mView;
        if (view != null) {
            A002.A07(view, C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON, new String[0], 1);
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putString("playable_result_key", "playable_result_open_cta");
            getParentFragmentManager().A0z("playable_request_key", A0a);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A09);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1366201587);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.playable_ad_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-933157717, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1617767161);
        super.onDestroy();
        PlayableAdWebView playableAdWebView = this.A01;
        if (playableAdWebView == null) {
            0qQ.A0F("playableAdWebView");
            throw AnonymousClass00P.createAndThrow();
        }
        playableAdWebView.destroy();
        AnonymousClass0fD.A09(1327148665, A022);
    }
}
