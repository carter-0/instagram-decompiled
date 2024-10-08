package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.ui.widget.videopreviewview.VideoPreviewView;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;

/* renamed from: X.K6r  reason: case insensitive filesystem */
public final class C61420K6r extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "IGTVUploadPreviewFragment";
    public View A00;
    public SeekBar A01;
    public TextView A02;
    public VideoPreviewView A03;
    public boolean A04;
    public ImageView A05;
    public LinearLayout A06;
    public Runnable A07;
    public final AnonymousClass0eM A08 = C227642jf.A02(this);
    public final AnonymousClass0eM A09 = C66299MMi.A00(this, new C66299MMi(this, 9), new C73666Phf(17, (Object) null, this), DbS.A0z(IGTVUploadViewModel.class), 10);

    public final String getModuleName() {
        return "igtv_upload_preview_fragment";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        0qQ.A0A(activity);
        if (!activity.isFinishing()) {
            Context requireContext = requireContext();
            AnonymousClass0eM r2 = this.A09;
            AnonymousClass3Q2 r0 = JTR.A0o(r2).A02;
            this.A04 = C51970G9q.A1W(r0.A0H, r0.A0G);
            VideoPreviewView videoPreviewView = (VideoPreviewView) view.findViewById(R.id.pending_video_preview);
            videoPreviewView.setVideoPath(JTR.A0o(r2).A00.A0X, new KIK(this, 2));
            this.A03 = videoPreviewView;
            int A022 = DbS.A02(requireContext, 11);
            C59984Jct jct = new C59984Jct(A022, A022, JTP.A02(getContext(), requireContext, R.attr.glyphColorPrimary), DbS.A02(requireContext, 1));
            jct.setAlpha(255);
            SeekBar seekBar = (SeekBar) view.findViewById(R.id.scrubber);
            seekBar.setProgressDrawable(seekBar.getResources().getDrawable(2Yu.A0H(requireContext, R.attr.videoScrubberProgressBarDrawable)));
            seekBar.setThumb(jct);
            seekBar.setOnSeekBarChangeListener(new LZO(this, 1));
            this.A01 = seekBar;
            ImageView A0G = DbS.A0G(view, R.id.pause_button);
            DbU.A14(requireContext, A0G, 2Yu.A0B(requireContext));
            LY6.A01(A0G, 30, this);
            this.A05 = A0G;
            TextView A0d = AnonymousClass7TE.A0d(view, R.id.timer);
            DbT.A17(requireContext, A0d, 2Yu.A0B(requireContext));
            this.A02 = A0d;
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.video_controls_container);
            linearLayout.setBackgroundColor(2Yu.A00(linearLayout.getContext()));
            this.A06 = linearLayout;
            A02(this);
            Medium medium = JTR.A0o(r2).A00;
            double d = (double) medium.A0B;
            double d2 = (double) medium.A04;
            if (d >= d2 * 0.95d && d <= d2 * 1.05d) {
                1Av A0h = DbX.A0h(this.A08);
                if (!AnonymousClass7TG.A1a(A0h, A0h.A0n, 1Av.A8a, 248)) {
                    M4V m4v = new M4V(this);
                    this.A07 = m4v;
                    VideoPreviewView videoPreviewView2 = this.A03;
                    if (videoPreviewView2 == null) {
                        0qQ.A0F("videoPreviewView");
                        throw AnonymousClass00P.createAndThrow();
                    } else {
                        videoPreviewView2.postDelayed(m4v, 200);
                    }
                }
            }
        }
    }

    public static final void A00(C61420K6r k6r) {
        String str;
        VideoPreviewView videoPreviewView = k6r.A03;
        if (videoPreviewView == null) {
            str = "videoPreviewView";
        } else {
            videoPreviewView.A04();
            ImageView imageView = k6r.A05;
            if (imageView == null) {
                str = "pauseButton";
            } else {
                imageView.setImageResource(R.drawable.play_icon);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A01(C61420K6r k6r) {
        String str;
        VideoPreviewView videoPreviewView = k6r.A03;
        if (videoPreviewView == null) {
            str = "videoPreviewView";
        } else {
            videoPreviewView.A06();
            ImageView imageView = k6r.A05;
            if (imageView == null) {
                str = "pauseButton";
            } else {
                imageView.setImageResource(R.drawable.pause);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A08);
    }

    public final boolean onBackPressed() {
        C63299Kui.A00(this, this.A09);
        return false;
    }

    public static final void A02(C61420K6r k6r) {
        int A062;
        int A012 = AnonymousClass1GB.A01((((float) 0nA.A08(k6r.requireContext())) - DbV.A05(k6r).getDimension(R.dimen.account_group_management_clickable_width)) - ((float) 2Yu.A0G(k6r.getContext(), R.attr.actionBarHeight)));
        if (k6r.A04) {
            A062 = JTT.A06(k6r);
            int A052 = (A012 - JTO.A05((float) A062, 1.7778f)) / 2;
            VideoPreviewView videoPreviewView = k6r.A03;
            if (videoPreviewView != null) {
                0nA.A0e(videoPreviewView, A052);
                VideoPreviewView videoPreviewView2 = k6r.A03;
                if (videoPreviewView2 != null) {
                    0nA.A0T(videoPreviewView2, A052);
                }
            }
            0qQ.A0F("videoPreviewView");
            throw AnonymousClass00P.createAndThrow();
        }
        float dimension = DbV.A05(k6r).getDimension(R.dimen.abc_edit_text_inset_bottom_material);
        VideoPreviewView videoPreviewView3 = k6r.A03;
        if (videoPreviewView3 != null) {
            0nA.A0e(videoPreviewView3, -((int) dimension));
            VideoPreviewView videoPreviewView4 = k6r.A03;
            if (videoPreviewView4 != null) {
                0nA.A0T(videoPreviewView4, 0);
                A062 = AnonymousClass7TE.A06((float) A012, 0.5625f);
            }
        }
        0qQ.A0F("videoPreviewView");
        throw AnonymousClass00P.createAndThrow();
        VideoPreviewView videoPreviewView5 = k6r.A03;
        if (videoPreviewView5 != null) {
            0nA.A0f(videoPreviewView5, A062);
            return;
        }
        0qQ.A0F("videoPreviewView");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0026, code lost:
        if (r4 > (r1 * 1.05d)) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.2da r12) {
        /*
            r11 = this;
            boolean r3 = X.JTU.A1T(r12)
            X.0eM r8 = r11.A09
            X.KTX r0 = X.JTR.A0o(r8)
            com.instagram.common.gallery.Medium r1 = r0.A00
            int r0 = r1.A0B
            double r4 = (double) r0
            int r0 = r1.A04
            double r1 = (double) r0
            r9 = 4606732058837280358(0x3fee666666666666, double:0.95)
            double r6 = r1 * r9
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0028
            r6 = 4607407598781385933(0x3ff0cccccccccccd, double:1.05)
            double r1 = r1 * r6
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            r5 = 1
            if (r0 <= 0) goto L_0x0029
        L_0x0028:
            r5 = 0
        L_0x0029:
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r0 = X.JTO.A0k(r8)
            X.Lsu r0 = r0.A0M
            X.L4g r0 = r0.A0C
            if (r0 == 0) goto L_0x0081
            if (r5 == 0) goto L_0x0080
            r0 = 2131972502(0x7f135196, float:1.9582013E38)
            java.lang.String r0 = r11.getString(r0)
            X.KTP r4 = X.KTP.A00
        L_0x003e:
            X.3JR r2 = X.DbS.A0K()
            r2.A0K = r0
            r1 = 18
            X.LY7 r0 = new X.LY7
            r0.<init>((int) r1, (java.lang.Object) r4, (java.lang.Object) r11)
            r2.A0G = r0
            android.view.View r0 = X.C51970G9q.A0P(r2, r12)
            int r2 = r0.getPaddingRight()
            if (r5 == 0) goto L_0x0080
            r1 = 2131629784(0x7f0e16d8, float:1.8886899E38)
            X.0eM r0 = r11.A08
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            android.view.View r1 = r12.ETj(r0, r1, r2, r3)
            r11.A00 = r1
            java.lang.String r2 = "toggleAspectRatioButton"
            if (r1 == 0) goto L_0x008b
            r0 = 29
            X.LY6.A01(r1, r0, r11)
            android.content.Context r1 = r11.requireContext()
            r0 = 12
            int r1 = X.DbS.A02(r1, r0)
            android.view.View r0 = r11.A00
            if (r0 == 0) goto L_0x008b
            r0.setPadding(r3, r1, r3, r1)
        L_0x0080:
            return
        L_0x0081:
            r0 = 2131968361(0x7f134169, float:1.9573614E38)
            java.lang.String r0 = r11.getString(r0)
            X.KT8 r4 = X.KT8.A00
            goto L_0x003e
        L_0x008b:
            X.0qQ.A0F(r2)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61420K6r.configureActionBar(X.2da):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1916857496);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.upload_preview_tab_fragment, false);
        AnonymousClass0fD.A09(-1262669986, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-819749800);
        super.onDestroyView();
        VideoPreviewView videoPreviewView = this.A03;
        if (videoPreviewView == null) {
            0qQ.A0F("videoPreviewView");
            throw AnonymousClass00P.createAndThrow();
        }
        videoPreviewView.A05();
        Runnable runnable = this.A07;
        if (runnable != null) {
            videoPreviewView.removeCallbacks(runnable);
        }
        AnonymousClass0fD.A09(-690763180, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(2144125034);
        C61420K6r.super.onPause();
        A00(this);
        AnonymousClass0fD.A09(596378257, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(200429758);
        super.onResume();
        VideoPreviewView videoPreviewView = this.A03;
        if (videoPreviewView == null) {
            0qQ.A0F("videoPreviewView");
            throw AnonymousClass00P.createAndThrow();
        }
        if (videoPreviewView.A09() && videoPreviewView.A04 != JXT.STARTED) {
            A01(this);
        }
        AnonymousClass0fD.A09(-1769245041, A022);
    }
}
