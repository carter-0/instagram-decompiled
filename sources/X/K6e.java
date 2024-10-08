package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.music.common.model.AudioOverlayTrack;

public final class K6e extends AnonymousClass4DH implements AnonymousClass8LW {
    public static final String __redex_internal_original_name = "ClipsEditMusicEditorFragment";
    public C3506885u A00;
    public 1Xj A01;
    public AudioOverlayTrack A02;
    public C357918a4 A03;
    public AnonymousClass4M3 A04;
    public String A05;
    public boolean A06;
    public final AnonymousClass0eM A07 = MMH.A00(this, 35);
    public final AnonymousClass0eM A08 = C227642jf.A02(this);
    public final C65825M0r A09 = new C65825M0r(this);

    public final String getModuleName() {
        return "clips_edit_metadata_preview";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        AnonymousClass0eM r1 = this.A08;
        C357918a4 r5 = new C357918a4((ViewStub) AnonymousClass7TE.A0b(view2, R.id.music_editor_stub), new AnonymousClass9I6(0, 0, 7, 1, false), this, AnonymousClass7TE.A0l(r1), (TargetViewSizeProvider) null, (C65500LuO) this.A07.getValue(), C3515689j.UNKNOWN, 0, false, false, false, true, false, false);
        this.A03 = r5;
        r5.A0b = A00();
        String str = this.A05;
        if (str != null) {
            C48898Ely.A00(AnonymousClass7TE.A0l(r1), 1ES.A01(), new C65321LrK(2, view2, this), str);
            return;
        }
        0qQ.A0F("mediaId");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C3506885u A00() {
        C3506885u r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("musicSyncController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final AnonymousClass4M3 A01() {
        AnonymousClass4M3 r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("videoPlayer");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A08);
    }

    public final void Exk() {
        if (A00().AFv(this)) {
            A01().EKy(0, false);
            A01().E2q("autoplay", true);
            A00().DyQ();
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1970406023);
        K6e.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Parcelable parcelable = requireArguments.getParcelable("args_audio_track");
        if (parcelable != null) {
            AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) parcelable;
            0qQ.A0B(audioOverlayTrack, 0);
            this.A02 = audioOverlayTrack;
            String A0m = JTP.A0m(requireArguments, "args_media_id");
            0qQ.A0B(A0m, 0);
            this.A05 = A0m;
            this.A06 = requireArguments.getBoolean("args_has_existing_snippet_selection", false);
            Context requireContext = requireContext();
            C65825M0r m0r = this.A09;
            AnonymousClass0eM r5 = this.A08;
            this.A04 = AnonymousClass4M0.A00(requireContext, AnonymousClass7TE.A0l(r5), (C252323ov) null, m0r, "clips_edit_metadata_preview");
            this.A00 = new C3506885u(requireContext(), AnonymousClass7TE.A0l(r5), JTR.A0p(requireContext(), r5));
            A00().A00 = new C65022Llz(this);
            AnonymousClass0fD.A09(308406064, A022);
            return;
        }
        IllegalArgumentException A0h = DbU.A0h();
        AnonymousClass0fD.A09(2024592625, A022);
        throw A0h;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(655174875);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_clips_edit_music_editor, viewGroup, false);
        AnonymousClass0fD.A09(1515935744, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(845473286);
        super.onDestroy();
        A01().ECP("fragment_paused");
        AnonymousClass0fD.A09(-1373839473, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1864506394);
        K6e.super.onPause();
        A00().DNP();
        AnonymousClass0fD.A09(-8701819, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-968042829);
        super.onResume();
        A00().DNQ();
        Exk();
        AnonymousClass0fD.A09(252207446, A022);
    }
}
