package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageButton;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* renamed from: X.9QR  reason: invalid class name */
public final class AnonymousClass9QR {
    public final ViewGroup A00;
    public final ViewGroup A01;
    public final ViewStub A02;
    public final ImageButton A03;
    public final TextView A04;
    public final GIH A05;
    public final TargetViewSizeProvider A06;

    public AnonymousClass9QR(ViewGroup viewGroup, TargetViewSizeProvider targetViewSizeProvider) {
        ViewGroup viewGroup2 = viewGroup;
        this.A00 = viewGroup2;
        TargetViewSizeProvider targetViewSizeProvider2 = targetViewSizeProvider;
        this.A06 = targetViewSizeProvider2;
        this.A04 = AnonymousClass7TG.A0R(viewGroup2, R.id.clips_capture_recording_duration_timer);
        ViewGroup viewGroup3 = (ViewGroup) AnonymousClass7TF.A0F(viewGroup2, R.id.clips_review_container);
        this.A01 = viewGroup3;
        this.A02 = (ViewStub) AnonymousClass7TF.A0F(viewGroup2, R.id.clips_nux_stub);
        this.A03 = (ImageButton) AnonymousClass7TF.A0F(viewGroup2, R.id.discard_clips_button);
        Context context = viewGroup2.getContext();
        int A09 = AnonymousClass7TE.A09(context);
        Resources resources = context.getResources();
        View A0F = AnonymousClass7TF.A0F(viewGroup3, R.id.video_review_trim_mode);
        View A0F2 = AnonymousClass7TF.A0F(viewGroup3, R.id.clips_review_progress_bar);
        View A0G = AnonymousClass7TF.A0G(viewGroup3, R.id.clips_edit_thumbnail_tray);
        View A0G2 = AnonymousClass7TF.A0G(viewGroup3, R.id.clips_count);
        View A0G3 = AnonymousClass7TF.A0G(viewGroup2, R.id.discard_clips_button);
        View A0G4 = AnonymousClass7TF.A0G(A0F, R.id.clips_review_filmstrip_view);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.asset_picker_redesign_sticker_height);
        AnonymousClass7TF.A1C(A0F2, 2, A0G);
        NineSixteenLayoutConfigImpl nineSixteenLayoutConfigImpl = (NineSixteenLayoutConfigImpl) targetViewSizeProvider2;
        if (nineSixteenLayoutConfigImpl.A0N) {
            int i = nineSixteenLayoutConfigImpl.A07;
            0nA.A0e(A0F, i);
            int i2 = nineSixteenLayoutConfigImpl.A0I;
            0nA.A0T(A0F, i2);
            0nA.A0e(A0F2, i);
            0nA.A0T(A0G, i2);
            0nA.A0e(A0G2, i);
            0nA.A0e(A0G3, i);
        } else if (targetViewSizeProvider2.CTv()) {
            0nA.A0T(A0G4, Math.max(0, (nineSixteenLayoutConfigImpl.A0A - dimensionPixelSize) / 2));
        }
        0qQ.A0A(context);
        this.A05 = new GIH(context, (GJO) null, resources.getDimensionPixelSize(R.dimen.asset_picker_section_title_horizontal_padding), resources.getDimensionPixelSize(R.dimen.clips_control_music_button_radius), resources.getDimensionPixelSize(R.dimen.clips_control_music_button_stroke_width), A09, resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material), 0, false);
    }
}
