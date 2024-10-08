package X;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;
import java.util.List;

/* renamed from: X.KSo  reason: case insensitive filesystem */
public final class C61939KSo extends C61416K6n implements AnonymousClass4DR, SeekBar.OnSeekBarChangeListener {
    public static final String __redex_internal_original_name = "PostLiveIGTVVideoCoverPickerFragment";
    public Bitmap A00;
    public LinearLayout A01;
    public List A02 = AnonymousClass7TE.A1C();
    public List A03 = AnonymousClass7TE.A1C();
    public boolean A04;

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        r3.Eom(2131964098);
        DbX.A19(LY6.A00(this, 13), LJA.A00(this, r3), r3);
    }

    public final String getModuleName() {
        return "post_live_igtv_cover_picker";
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        int A06;
        0qQ.A0B(seekBar, 0);
        if (!this.A03.isEmpty() && z) {
            IgImageView igImageView = this.A06;
            if (igImageView != null) {
                List list = this.A03;
                int max = seekBar.getMax();
                if (this.A03.isEmpty()) {
                    A06 = 0;
                } else {
                    A06 = (i * C51966G9m.A06(this.A03)) / max;
                }
                igImageView.setUrl((ImageUrl) list.get(A06), this);
                return;
            }
            0qQ.A0F("uploadedCoverPhoto");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        SeekBar seekBar = this.A05;
        if (seekBar != null) {
            seekBar.setOnSeekBarChangeListener(this);
            C64860LjM ljM = new C64860LjM(this, 3);
            IgImageView igImageView = this.A06;
            if (igImageView != null) {
                igImageView.A0E = ljM;
                this.A01 = (LinearLayout) view.findViewById(R.id.filmstrip_keyframes_holder);
                int i = this.A02;
                int i2 = 0;
                while (i2 < i) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.A01, this.A00);
                    IgImageView igImageView2 = new IgImageView(requireContext());
                    igImageView2.setLayoutParams(layoutParams);
                    igImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    igImageView2.setPadding(0, 0, 0, 0);
                    LinearLayout linearLayout = this.A01;
                    if (linearLayout == null) {
                        str = "thumbnailsContainer";
                    } else {
                        linearLayout.addView(igImageView2);
                        i2++;
                    }
                }
                if (this.A03.isEmpty()) {
                    AnonymousClass0eM r0 = this.A0D;
                    IGTVUploadViewModel A0k = JTO.A0k(r0);
                    LBS lbs = JTO.A0k(r0).A0M.A0D;
                    0qQ.A0A(lbs);
                    DbX.A1W(A0k, lbs.A09, C318116oQ.A00(A0k), 2);
                }
                Dba.A15(getViewLifecycleOwner(), DbT.A0G(JTO.A0k(this.A0D).A0J), MPA.A00(this, 24), 67);
                this.A04 = false;
                return;
            }
            str = "uploadedCoverPhoto";
        } else {
            str = "seekBar";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean onBackPressed() {
        JTO.A0k(this.A0D).A04(this, C61945KSu.A00);
        return false;
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        Dmc();
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        DnT();
    }
}
