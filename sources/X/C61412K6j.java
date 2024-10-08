package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ListView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.sundial.reshare.model.ClipsCelebrationReshareViewModel;
import com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeStickerClientModel;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;

/* renamed from: X.K6j  reason: case insensitive filesystem */
public final class C61412K6j extends AnonymousClass4DH implements AnonymousClass4DU {
    public static final String __redex_internal_original_name = "ComposerMusicEditorFragment";
    public ListView A00;
    public AudioOverlayTrack A01;
    public C357918a4 A02;
    public AnonymousClass85s A03;
    public C3499582p A04;
    public boolean A05;
    public final AnonymousClass0eM A06 = C227642jf.A02(this);
    public final C65500LuO A07 = new C65500LuO(this, 1);
    public final AnonymousClass4DS A08 = new C64464LcR(this, 0);

    public final String getModuleName() {
        return "composer_music_editor_fragment";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        AnonymousClass0eM r1 = this.A06;
        C357918a4 r5 = new C357918a4((ViewStub) AnonymousClass7TE.A0b(view2, R.id.composer_music_editor_stub), new AnonymousClass9I6(0, 0, 7, 1, false), this, AnonymousClass7TE.A0l(r1), (TargetViewSizeProvider) null, this.A07, C3515689j.UNKNOWN, 0, false, false, false, true, false, false);
        this.A02 = r5;
        AnonymousClass85s r2 = this.A03;
        if (r2 != null) {
            r5.A0b = r2;
            AudioOverlayTrack audioOverlayTrack = this.A01;
            if (audioOverlayTrack != null) {
                MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
                if (musicAssetModel != null) {
                    if (this.A05) {
                        r5.A0K(musicAssetModel, audioOverlayTrack.A03, false);
                    } else {
                        r5.A0L(musicAssetModel, false);
                    }
                }
                ListView listView = (ListView) view2.findViewById(R.id.preview_list_view);
                0qQ.A0B(listView, 0);
                this.A00 = listView;
                C65524Lun lun = new C65524Lun(this);
                C3499582p r10 = this.A04;
                if (r10 != null) {
                    K9C k9c = new K9C(requireContext(), this, AnonymousClass7TE.A0l(r1), r10, lun, AnonymousClass32Q.A00, 0.0f);
                    ListView listView2 = this.A00;
                    if (listView2 != null) {
                        listView2.setAdapter(k9c);
                        k9c.A0C();
                    } else {
                        str = "previewListView";
                    }
                }
                if (this.A05) {
                    LYF.A01(JTR.A0V(view2, R.id.composer_music_remove_song_stub), 9, this);
                }
                2dY.A01(new LYF((Object) this, 10), (ViewGroup) AnonymousClass7TE.A0b(view2, R.id.action_bar_container)).A0X(this.A08);
                return;
            }
            str = "audioTrack";
        } else {
            str = "musicSyncController";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1599272119);
        C61412K6j.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) C320236s2.A00(requireArguments, AudioOverlayTrack.class, "args_audio_track");
        0qQ.A0B(audioOverlayTrack, 0);
        this.A01 = audioOverlayTrack;
        28D r4 = 28D.values()[requireArguments.getInt("args_creation_entry_point")];
        AnonymousClass0eM r1 = this.A06;
        this.A04 = JWD.A00(r4, AnonymousClass7TE.A0l(r1), (CreationSession) C320236s2.A00(requireArguments, CreationSession.class, "args_creation_session"), new AnonymousClass82Y((C3499182k) null, (UserSession) null, (C357638Yz) null, (C3498682d) null, (C3498482b) null, (C3498382a) null, (C3499282m) null, (C3498882g) null, (C3498782e) null, (C3499382n) null, (ClipsCelebrationReshareViewModel) null, (AnonymousClass82f) null, (C2801950r) null, (SuperlativeStickerClientModel) null, (C3498982i) null, (C3498582c) null, (MusicAttributionConfig) null, (PendingRecipient) null, (C3499082j) null, (String) null, false, false, false, true, false, false, false, false));
        this.A05 = requireArguments.getBoolean("args_has_existing_snippet_selection", false);
        this.A03 = new AnonymousClass85s(requireContext(), AnonymousClass7TE.A0l(r1), this, JTR.A0p(requireContext(), r1), new C65506LuU(this, 2));
        AnonymousClass0fD.A09(1712696265, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-41149451);
        0qQ.A0B(layoutInflater, 0);
        if (!AnonymousClass1GD.A03()) {
            layoutInflater = JTS.A09(requireContext(), layoutInflater);
        }
        View A0A = DbU.A0A(layoutInflater, viewGroup, R.layout.fragment_composer_music_editor, false);
        AnonymousClass0fD.A09(-944060188, A022);
        return A0A;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1872970449);
        C61412K6j.super.onPause();
        AnonymousClass85s r0 = this.A03;
        if (r0 != null) {
            r0.onPause();
            AnonymousClass0fD.A09(-241560291, A022);
            return;
        }
        0qQ.A0F("musicSyncController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1057052321);
        super.onResume();
        AnonymousClass85s r0 = this.A03;
        if (r0 != null) {
            r0.onResume();
            AnonymousClass0fD.A09(502166825, A022);
            return;
        }
        0qQ.A0F("musicSyncController");
        throw AnonymousClass00P.createAndThrow();
    }
}
