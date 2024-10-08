package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.creation.capture.video.view.IgCaptureVideoPreviewView;
import com.instagram.discovery.ui.FixedAspectRatioVideoLayout;
import com.instagram.igds.components.imagebutton.IgImageButton;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;

/* renamed from: X.K6i  reason: case insensitive filesystem */
public final class C61411K6i extends AnonymousClass4DH implements C20976X7p, C253023q5, MXF {
    public static final String __redex_internal_original_name = "MediaKitHeaderFragment";
    public TextWatcher A00;
    public View A01;
    public View A02;
    public EditText A03;
    public TextView A04;
    public TextView A05;
    public CircularImageView A06;
    public C252063oV A07;
    public IgCaptureVideoPreviewView A08;
    public FixedAspectRatioVideoLayout A09;
    public IgImageButton A0A;
    public IgdsMediaButton A0B;
    public SlideInAndOutIconView A0C;
    public final AnonymousClass0eM A0D = C227642jf.A02(this);
    public final AnonymousClass0eM A0E = DbS.A0I(new MMD(this, 19), new MMD(this, 20), MMW.A00((Object) null, this, 13), DbS.A0z(C60327JjW.class));
    public final AnonymousClass0eM A0F = MMD.A00(this, 21);
    public final AnonymousClass0eM A0G = MMD.A00(this, 18);

    public final void ABK(C232822uV r6, int i) {
        0qQ.A0B(r6, 1);
        Resources A0R = JTR.A0R(this);
        SlideInAndOutIconView slideInAndOutIconView = this.A0C;
        if (slideInAndOutIconView == null) {
            0qQ.A0F("audioIcon");
            throw AnonymousClass00P.createAndThrow();
        }
        int lineHeight = slideInAndOutIconView.A0C.getLineHeight() + (A0R.getDimensionPixelSize(R.dimen.media_tag_indicator_padding) * 2);
        int lineHeight2 = (slideInAndOutIconView.A0C.getLineHeight() - A0R.getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size)) / 2;
        slideInAndOutIconView.A03(requireContext().getDrawable(i), lineHeight, lineHeight);
        slideInAndOutIconView.A0B.setPadding(lineHeight2, lineHeight2, lineHeight2, lineHeight2);
        JTU.A1G(r6, slideInAndOutIconView, AnonymousClass7TE.A09(requireContext()));
    }

    public final void D2o(ClickableSpan clickableSpan, View view, UserSession userSession, String str) {
        0qQ.A0B(str, 1);
        C64127LPb.A01(this, AnonymousClass05K.A0d);
        UserSession A0l = AnonymousClass7TE.A0l(this.A0D);
        0qQ.A0B(A0l, 1);
        C46474Dfc.A03(DbW.A0H(this, A0l), A0l, C46447Df9.A02(), C46548Dgp.A02(A0l, str, "media_kit", getModuleName()));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = view.requireViewById(R.id.mk_header_content);
        this.A02 = view.requireViewById(R.id.mk_header_shimmer);
        FixedAspectRatioVideoLayout fixedAspectRatioVideoLayout = (FixedAspectRatioVideoLayout) view.requireViewById(R.id.mk_header_media_frame);
        fixedAspectRatioVideoLayout.A00 = 0.75f;
        this.A09 = fixedAspectRatioVideoLayout;
        IgImageButton igImageButton = (IgImageButton) view.requireViewById(R.id.mk_header_media_preview);
        igImageButton.setEnableTouchOverlay(false);
        igImageButton.A0A = new C247833gz();
        igImageButton.A00 = 0.75f;
        this.A0A = igImageButton;
        IgdsMediaButton igdsMediaButton = (IgdsMediaButton) view.requireViewById(R.id.mk_edit_header_cover_button);
        LY6.A01(igdsMediaButton, 55, this);
        this.A0B = igdsMediaButton;
        this.A06 = (CircularImageView) view.requireViewById(R.id.mk_owner_profile_image);
        this.A04 = DbU.A0G(view, R.id.mk_owner_profile_name);
        EditText editText = (EditText) view.requireViewById(R.id.mk_header_title_edit_text);
        editText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(DbS.A04(0Tu.A05, AnonymousClass7TF.A0L(this.A0D, 0), 36597764222094294L))});
        LYN.A00(editText, 8, new MMD(this, 17));
        this.A03 = editText;
        this.A05 = DbU.A0G(view, R.id.mk_header_title_text_view);
        C252063oV A0Y = DbU.A0Y(view, R.id.mk_header_audio_icon_view_stub);
        this.A07 = A0Y;
        if (A0Y == null) {
            0qQ.A0F("audioStubHolder");
            throw AnonymousClass00P.createAndThrow();
        }
        this.A0C = (SlideInAndOutIconView) A0Y.getView().requireViewById(R.id.indicator);
        IgCaptureVideoPreviewView igCaptureVideoPreviewView = (IgCaptureVideoPreviewView) view.requireViewById(R.id.mk_local_video_preview);
        AnonymousClass0fU.A00(LY6.A00(igCaptureVideoPreviewView, 56), igCaptureVideoPreviewView);
        igCaptureVideoPreviewView.A00 = 0.75f;
        igCaptureVideoPreviewView.setAspectRatio(0.75f);
        this.A08 = igCaptureVideoPreviewView;
        Object value = this.A0E.getValue();
        07U r5 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MHL(viewLifecycleOwner, value, r5, this, (AnonymousClass4D7) null, 5), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public static final void A00(C61411K6i k6i) {
        IgdsMediaButton igdsMediaButton = k6i.A0B;
        if (igdsMediaButton == null) {
            0qQ.A0F("editButton");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass0eM r2 = k6i.A0E;
        C62466KgG kgG = (C62466KgG) JTT.A0a(r2).A0H.getValue();
        0qQ.A0B(kgG, 0);
        boolean A1W = AnonymousClass7TF.A1W(kgG, C62466KgG.EDIT);
        int i = 0;
        if (!A1W || !JTT.A0a(r2).A05.A01) {
            i = 8;
        }
        igdsMediaButton.setVisibility(i);
    }

    /* JADX WARNING: type inference failed for: r0v34, types: [android.widget.ImageView, com.instagram.igds.components.imagebutton.IgImageButton] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
        if (r1 == false) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C61411K6i r11) {
        /*
            X.0eM r0 = r11.A0E
            X.JjW r0 = X.JTT.A0a(r0)
            X.0Ud r0 = r0.A0K
            java.util.List r0 = X.JTO.A17(r0)
            java.lang.Object r6 = X.00k.A0J(r0)
            X.Jzx r6 = (X.C61264Jzx) r6
            if (r6 == 0) goto L_0x0119
            java.lang.Integer r5 = r6.A03
            int r1 = r5.intValue()
            java.lang.String r2 = "imagePreview"
            java.lang.String r4 = "null cannot be cast to non-null type com.instagram.common.gallery.Medium"
            java.lang.String r10 = "videoPreview"
            r7 = 0
            if (r1 == r7) goto L_0x0077
            r0 = 1
            if (r1 != r0) goto L_0x011f
            com.instagram.common.gallery.Medium r3 = r6.A01
            X.0qQ.A0C(r3, r4)
            boolean r0 = r3.CeS()
            if (r0 == 0) goto L_0x0069
            com.instagram.creation.capture.video.view.IgCaptureVideoPreviewView r2 = r11.A08
            if (r2 == 0) goto L_0x011a
            r1 = 3
            X.KIK r0 = new X.KIK
            r0.<init>(r11, r1)
            r2.setVideoMedium(r3, r0)
        L_0x003e:
            r11.A03()
            com.instagram.creation.capture.video.view.IgCaptureVideoPreviewView r3 = r11.A08
            if (r3 == 0) goto L_0x011a
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r2 = 0
            if (r5 != r0) goto L_0x0056
            com.instagram.common.gallery.Medium r0 = r6.A01
            X.0qQ.A0C(r0, r4)
            boolean r1 = r0.CeS()
            r0 = 0
            if (r1 != 0) goto L_0x0058
        L_0x0056:
            r0 = 8
        L_0x0058:
            r3.setVisibility(r0)
            com.instagram.discovery.ui.FixedAspectRatioVideoLayout r1 = r11.A09
            if (r1 != 0) goto L_0x010a
            java.lang.String r2 = "videoLayout"
        L_0x0061:
            X.0qQ.A0F(r2)
        L_0x0064:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0069:
            com.instagram.igds.components.imagebutton.IgImageButton r0 = r11.A0A
            if (r0 == 0) goto L_0x0061
            java.lang.String r1 = r3.A0X
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeFile(r1)
            r0.setImageBitmap(r1)
            goto L_0x003e
        L_0x0077:
            com.instagram.creation.capture.video.view.IgCaptureVideoPreviewView r0 = r11.A08
            if (r0 == 0) goto L_0x011a
            r0.A05()
            X.1Xj r3 = r6.A02
            r0 = 38
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r3, r0)
            android.net.Uri r1 = r3.A05
            if (r1 == 0) goto L_0x00ef
            r0 = -1
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.C253833rU.A00(r1, r0, r0)
        L_0x0092:
            if (r1 == 0) goto L_0x009b
            com.instagram.igds.components.imagebutton.IgImageButton r0 = r11.A0A
            if (r0 == 0) goto L_0x0061
            r0.setUrl(r1, r11)
        L_0x009b:
            X.0eM r0 = r11.A0F
            java.lang.Object r9 = r0.getValue()
            X.LDE r9 = (X.LDE) r9
            android.view.View r8 = r11.requireView()
            java.lang.String r1 = "header_media_"
            java.lang.String r0 = r3.A30()
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.String r0 = "header_media_section"
            X.KUT r2 = new X.KUT
            r2.<init>(r3, r0, r1)
            java.lang.String r1 = r2.A03
            r0 = 0
            X.30a r1 = X.AnonymousClass30Y.A00(r2, r0, r1)
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x00d2
            java.util.HashSet r0 = r9.A02
            r0.add(r8)
            X.Lju r0 = r9.A01
            r1.A00(r0)
            X.2el r0 = r9.A00
            X.C51967G9n.A0z(r8, r1, r0)
        L_0x00d2:
            boolean r0 = r3.CeS()
            java.lang.String r2 = "audioStubHolder"
            if (r0 == 0) goto L_0x00ff
            boolean r0 = r3.A4Y()
            if (r0 == 0) goto L_0x00ff
            X.3oV r0 = r11.A07
            if (r0 == 0) goto L_0x0061
            r0.setVisibility(r7)
            com.instagram.ui.widget.slideouticon.SlideInAndOutIconView r1 = r11.A0C
            if (r1 != 0) goto L_0x00f8
            java.lang.String r2 = "audioIcon"
            goto L_0x0061
        L_0x00ef:
            android.content.Context r0 = r11.requireContext()
            com.instagram.model.mediasize.ExtendedImageUrl r1 = r3.A1n(r0)
            goto L_0x0092
        L_0x00f8:
            r0 = 25
            X.LY7.A00(r1, r0, r3, r11)
            goto L_0x003e
        L_0x00ff:
            X.3oV r1 = r11.A07
            if (r1 == 0) goto L_0x0061
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x003e
        L_0x010a:
            com.instagram.creation.capture.video.view.IgCaptureVideoPreviewView r0 = r11.A08
            if (r0 == 0) goto L_0x011a
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0116
            r2 = 8
        L_0x0116:
            r1.setVisibility(r2)
        L_0x0119:
            return
        L_0x011a:
            X.0qQ.A0F(r10)
            goto L_0x0064
        L_0x011f:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61411K6i.A01(X.K6i):void");
    }

    public static final void A02(C61411K6i k6i, C66406MQm mQm) {
        String str;
        View view = k6i.A01;
        if (view == null) {
            str = "content";
        } else {
            int i = 0;
            view.setVisibility(DbW.A01(mQm instanceof C65450LtY ? 1 : 0));
            View view2 = k6i.A02;
            if (view2 == null) {
                str = "shimmer";
            } else {
                if (!(mQm instanceof C65449LtX)) {
                    i = 8;
                }
                view2.setVisibility(i);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.igds.components.imagebutton.IgImageButton, android.view.View] */
    public final void A03() {
        String str;
        ? r3 = this.A0A;
        if (r3 == 0) {
            str = "imagePreview";
        } else {
            FixedAspectRatioVideoLayout fixedAspectRatioVideoLayout = this.A09;
            if (fixedAspectRatioVideoLayout == null) {
                str = "videoLayout";
            } else {
                int childCount = fixedAspectRatioVideoLayout.getChildCount();
                int i = 0;
                if (childCount != 2) {
                    i = 8;
                }
                r3.setVisibility(i);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final IgImageButton BGE() {
        IgImageButton igImageButton = this.A0A;
        if (igImageButton != null) {
            return igImageButton;
        }
        0qQ.A0F("imagePreview");
        throw AnonymousClass00P.createAndThrow();
    }

    public final FixedAspectRatioVideoLayout BLn() {
        FixedAspectRatioVideoLayout fixedAspectRatioVideoLayout = this.A09;
        if (fixedAspectRatioVideoLayout != null) {
            return fixedAspectRatioVideoLayout;
        }
        0qQ.A0F("videoLayout");
        throw AnonymousClass00P.createAndThrow();
    }

    public final LDW BO3() {
        return (LDW) this.A0G.getValue();
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0D);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(813471369);
        0qQ.A0B(layoutInflater, 0);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.media_kit_header_fragment, false);
        AnonymousClass0fD.A09(-722078010, A022);
        return A0D2;
    }
}
