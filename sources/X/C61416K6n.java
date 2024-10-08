package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;

/* renamed from: X.K6n  reason: case insensitive filesystem */
public abstract class C61416K6n extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "IGTVVideoCoverPickerInfoFragment";
    public int A00;
    public int A01;
    public int A02 = 1;
    public FrameLayout A03;
    public ImageView A04;
    public SeekBar A05;
    public IgImageView A06;
    public C59986Jcv A07;
    public boolean A08;
    public View A09;
    public View A0A;
    public FrameLayout A0B;
    public final AnonymousClass0eM A0C = C227642jf.A02(this);
    public final AnonymousClass0eM A0D = C66306MMp.A00(this, C66306MMp.A02(this, 34), new C73666Phf(11, (Object) null, this), DbS.A0z(IGTVUploadViewModel.class), 35);

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public void onViewCreated(View view, Bundle bundle) {
        int A092;
        String str;
        boolean z;
        int i;
        int i2;
        long A002;
        Drawable createFromPath;
        Bitmap A003;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        FragmentActivity activity = getActivity();
        0qQ.A0A(activity);
        if (!activity.isFinishing()) {
            Context requireContext = requireContext();
            int A042 = (int) (((float) this.A00) + 0nA.A04(requireContext, 8));
            C59986Jcv jcv = new C59986Jcv(JTR.A0R(this));
            jcv.A08 = true;
            jcv.A05 = AnonymousClass7TF.A03(requireContext, R.attr.glyphColorPrimary);
            jcv.A02 = (float) DbS.A02(requireContext, 1);
            jcv.A01 = (float) DbS.A02(requireContext, 3);
            jcv.A00 = (float) DbS.A02(requireContext, 6);
            jcv.A06 = (int) (((float) A042) * 0.643f);
            jcv.A03 = A042;
            this.A07 = jcv;
            SeekBar seekBar = (SeekBar) view2.findViewById(R.id.scrubber_seekbar);
            seekBar.setProgress(0);
            boolean z2 = this instanceof C61939KSo;
            boolean z3 = z2;
            if (z2) {
                A092 = this.A02 * this.A01;
            } else {
                A092 = JTO.A09(LJ9.A00(this).A1N);
            }
            seekBar.setMax(A092);
            C59986Jcv jcv2 = this.A07;
            if (jcv2 != null) {
                seekBar.setThumb(jcv2);
                this.A05 = seekBar;
                0nA.A0V(seekBar, A042);
                this.A03 = (FrameLayout) view2.findViewById(R.id.frame_container);
                this.A06 = JTO.A0Y(view2, R.id.uploaded_cover_photo);
                this.A09 = view2.findViewById(R.id.left_cover_photo_overlay);
                this.A0A = view2.findViewById(R.id.right_cover_photo_overlay);
                boolean A1R = AnonymousClass7TF.A1R((LJ9.A00(this).A02 > 1.0f ? 1 : (LJ9.A00(this).A02 == 1.0f ? 0 : -1)));
                int A012 = LQM.A01(requireContext);
                int A004 = LQM.A00(requireContext);
                ConstraintLayout constraintLayout = (ConstraintLayout) view2.findViewById(R.id.cover_picker_tab_layout);
                AnonymousClass0eM r22 = this.A0D;
                if (JTO.A0k(r22).A0M.A00 > 0.643f) {
                    z = true;
                    i = AnonymousClass7TE.A06((float) A004, JTO.A0k(r22).A0M.A00);
                } else {
                    z = false;
                    i = A012;
                }
                if (!z) {
                    i2 = JTO.A05((float) i, JTO.A0k(r22).A0M.A00);
                } else {
                    i2 = A004;
                }
                C270354gb r1 = new C270354gb();
                r1.A0I((ConstraintLayout) DbU.A08(LayoutInflater.from(requireContext), R.layout.cover_picker_tab_fragment));
                r1.A0A(R.id.frame_container, i2);
                r1.A0B(R.id.frame_container, i);
                r1.A0A(R.id.uploaded_cover_photo, A004);
                r1.A0B(R.id.uploaded_cover_photo, A012);
                r1.A0B(R.id.video_chrome, A012);
                r1.A0A(R.id.video_chrome, A004);
                int i3 = A012 / 2;
                r1.A0B(R.id.left_cover_photo_overlay, i3);
                r1.A0A(R.id.left_cover_photo_overlay, A004);
                r1.A0B(R.id.right_cover_photo_overlay, i3);
                r1.A0A(R.id.right_cover_photo_overlay, A004);
                float f = (float) A012;
                int A013 = AnonymousClass1GB.A01((f / 0.5625f) - (f / 0.643f));
                r1.A0B(R.id.top_cover_photo_overlay, A012);
                r1.A0B(R.id.bottom_cover_photo_overlay, A012);
                if (z || A1R) {
                    r1.A0A(R.id.top_cover_photo_overlay, 0);
                    r1.A0A(R.id.bottom_cover_photo_overlay, 0);
                } else {
                    int i4 = A013 / 2;
                    r1.A0A(R.id.top_cover_photo_overlay, i4);
                    r1.A0A(R.id.bottom_cover_photo_overlay, i4);
                }
                r1.A0A(R.id.frame_container_overlay, A004);
                r1.A0B(R.id.frame_container_overlay, A012);
                r1.A0G(constraintLayout);
                this.A04 = DbS.A0G(view2, R.id.add_from_gallery_icon);
                this.A0B = (FrameLayout) view2.findViewById(R.id.add_from_gallery_rounded_layout);
                LY6.A01(view2.findViewById(R.id.add_from_gallery), 12, this);
                String str2 = JTO.A0k(r22).A0M.A0J;
                str = "addFromGalleryIcon";
                if (JTO.A0k(r22).A0M.A0Y) {
                    C59986Jcv jcv3 = this.A07;
                    if (jcv3 != null) {
                        jcv3.A09 = true;
                        FrameLayout frameLayout = this.A0B;
                        if (frameLayout == null) {
                            str = "addFromGalleryLayout";
                        } else {
                            frameLayout.setBackground(Drawable.createFromPath(str2));
                            ImageView imageView = this.A04;
                            if (imageView != null) {
                                DbU.A11(requireContext, imageView, R.drawable.add_from_gallery_border);
                                FrameLayout frameLayout2 = this.A03;
                                if (frameLayout2 != null) {
                                    frameLayout2.setAlpha(0.0f);
                                    this.A08 = false;
                                } else {
                                    str = "frameContainer";
                                }
                            }
                        }
                        0qQ.A0F(str);
                        throw AnonymousClass00P.createAndThrow();
                    }
                } else {
                    ImageView imageView2 = this.A04;
                    if (imageView2 != null) {
                        DbX.A11(requireContext, imageView2.getBackground(), 2Yu.A0B(requireContext));
                        this.A08 = true;
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                if (!(str2 == null || (createFromPath = Drawable.createFromPath(str2)) == null || (A003 = C62953Kp5.A00(createFromPath, A012, A004)) == null)) {
                    IgImageView igImageView = this.A06;
                    if (igImageView != null) {
                        igImageView.setImageBitmap(A003);
                    } else {
                        str = "uploadedCoverPhoto";
                        0qQ.A0F(str);
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
                DbU.A1H(AnonymousClass7TE.A0d(view2, R.id.username), DbX.A0l(AnonymousClass0t1.A01, this.A0C));
                TextView A0d = AnonymousClass7TE.A0d(view2, R.id.duration);
                IGTVUploadViewModel A0k = JTO.A0k(r22);
                if (z3) {
                    LBS lbs = A0k.A0M.A0D;
                    0qQ.A0A(lbs);
                    A002 = lbs.A08;
                } else {
                    A002 = A0k.A02().A00();
                }
                A0d.setText(1G0.A02(A002));
                TextView A0d2 = AnonymousClass7TE.A0d(view2, R.id.video_caption);
                String str3 = LJ9.A00(this).A2Z;
                if (str3 == null) {
                    str3 = "";
                }
                A0d2.setText(str3);
                return;
            }
            str = "thumb";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final IGTVUploadViewModel A00() {
        return JTO.A0k(this.A0D);
    }

    public final void DnT() {
        String str;
        View view = this.A09;
        if (view == null) {
            str = "leftCoverPhotoOverlay";
        } else {
            view.animate().alpha(1.0f).setDuration(200);
            View view2 = this.A0A;
            if (view2 == null) {
                str = "rightCoverPhotoOverlay";
            } else {
                view2.animate().alpha(1.0f).setDuration(200);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0C);
    }

    public final void Dmc() {
        Context requireContext = requireContext();
        String str = "addFromGalleryIcon";
        if (!this.A08) {
            FrameLayout frameLayout = this.A03;
            if (frameLayout != null) {
                frameLayout.setAlpha(1.0f);
                this.A08 = true;
                C59986Jcv jcv = this.A07;
                if (jcv != null) {
                    jcv.A09 = false;
                    ImageView imageView = this.A04;
                    if (imageView != null) {
                        imageView.setPressed(false);
                        DbU.A14(requireContext, imageView, 2Yu.A0H(requireContext, R.attr.glyphColorPrimary));
                        DbU.A11(requireContext, imageView, R.drawable.add_from_gallery_selector);
                        FrameLayout frameLayout2 = this.A0B;
                        if (frameLayout2 == null) {
                            str = "addFromGalleryLayout";
                        } else {
                            frameLayout2.setBackground((Drawable) null);
                        }
                    }
                } else {
                    str = "thumb";
                }
            } else {
                str = "frameContainer";
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        ImageView imageView2 = this.A04;
        if (imageView2 != null) {
            DbX.A11(requireContext, imageView2.getBackground(), 2Yu.A0B(requireContext));
            View view = this.A09;
            if (view == null) {
                str = "leftCoverPhotoOverlay";
            } else {
                view.animate().alpha(0.8f).setDuration(200);
                View view2 = this.A0A;
                if (view2 == null) {
                    str = "rightCoverPhotoOverlay";
                } else {
                    view2.animate().alpha(0.8f).setDuration(200);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(368772603);
        C61416K6n.super.onCreate(bundle);
        requireArguments();
        this.A00 = DbV.A05(this).getDimensionPixelOffset(R.dimen.activation_card_icon_container_width);
        this.A01 = DbV.A05(this).getDimensionPixelOffset(R.dimen.audio_page_audio_filter_tooltip_vertical_offset);
        int A062 = 0nA.A06(requireContext()) - (DbV.A05(this).getDimensionPixelOffset(R.dimen.account_discovery_bottom_gap) * 2);
        int A052 = JTO.A05((float) A062, (float) this.A01);
        this.A02 = A052;
        this.A01 = A062 / A052;
        AnonymousClass0fD.A09(1853125744, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(215032928);
        0qQ.A0B(layoutInflater, 0);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.cover_picker_tab_fragment, false);
        AnonymousClass0fD.A09(158756353, A022);
        return A0D2;
    }
}
