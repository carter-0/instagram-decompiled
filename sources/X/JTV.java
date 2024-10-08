package X;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicBrowseCategory;
import com.instagram.music.common.model.TrackSnippet;

public abstract class JTV {
    public static Intent A00(AudioOverlayTrack audioOverlayTrack, TrackSnippet trackSnippet) {
        TrackSnippet trackSnippet2 = trackSnippet;
        int i = trackSnippet2.A01;
        int i2 = trackSnippet2.A00;
        AudioOverlayTrack audioOverlayTrack2 = audioOverlayTrack;
        int i3 = audioOverlayTrack.A04;
        int i4 = audioOverlayTrack2.A01;
        String str = audioOverlayTrack2.A0B;
        String str2 = audioOverlayTrack2.A0A;
        String str3 = audioOverlayTrack2.A0E;
        MusicBrowseCategory musicBrowseCategory = audioOverlayTrack2.A09;
        MusicAssetModel musicAssetModel = audioOverlayTrack2.A08;
        DownloadedTrack downloadedTrack = audioOverlayTrack2.A06;
        AnonymousClass8IJ r3 = audioOverlayTrack2.A05;
        float f = audioOverlayTrack2.A00;
        AudioOverlayTrack audioOverlayTrack3 = new AudioOverlayTrack(r3, downloadedTrack, audioOverlayTrack2.A07, musicAssetModel, musicBrowseCategory, str, str2, str3, audioOverlayTrack2.A0C, f, i, i2, i3, i4);
        Intent intent = new Intent();
        intent.putExtra("extra_audio_track", audioOverlayTrack3);
        return intent;
    }

    public static String A01(Fragment fragment, FGX fgx) {
        fgx.A05(fragment.requireContext().getString(2131957632), fragment.requireContext().getString(2131957631), R.drawable.instagram_eye_off_pano_outline_24);
        fgx.A05(fragment.requireContext().getString(2131957636), fragment.requireContext().getString(2131957635), R.drawable.instagram_photo_pano_outline_24);
        return fragment.requireContext().getString(2131957634);
    }

    public static void A02(Fragment fragment) {
        2db.A02(fragment.getActivity(), fragment.requireActivity().getColor(2Yu.A0C(fragment.getContext())));
        AnonymousClass2uJ.A04(fragment.requireActivity(), fragment.requireActivity().getColor(2Yu.A0C(fragment.getContext())));
    }
}
