package X;

import android.app.Activity;
import android.app.LoaderManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.app.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.instagram.android.R;
import com.instagram.common.gallery.Draft;
import com.instagram.common.gallery.GeneratedMediaMetadata;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.widget.imageview.PunchedOverlayView;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.base.ui.ConstrainedTextureView;
import com.instagram.creation.base.ui.mediatabbar.Tab;
import com.instagram.creation.capture.gallery.GalleryPreviewInfo;
import com.instagram.creation.capture.gallery.ui.CropTypeToggleButton;
import com.instagram.creation.capture.gallery.ui.GalleryPickerCoordinatorLayout;
import com.instagram.creation.capture.gallery.ui.GalleryPickerView$SavedState;
import com.instagram.creation.capture.gallery.ui.preview.GalleryPreviewMultiselectPager;
import com.instagram.creation.capture.video.view.IgCaptureVideoPreviewView;
import com.instagram.creation.photo.crop.CropImageView;
import com.instagram.creation.photo.util.ExifImageData;
import com.instagram.debug.devoptions.section.xme.WearableMediaDownloadManager;
import com.instagram.modal.ModalActivity;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.ui.widget.mediapicker.Folder;
import com.instagram.ui.widget.trianglespinner.TriangleSpinner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.webrtc.MediaStreamTrack;

public final class JW7 extends LinearLayout implements AnonymousClass8QW, C252203oj, C361528gN, GestureDetector.OnGestureListener, C273544ml, MUO, C66502MUg, GestureDetector.OnDoubleTapListener, C66511MUp, AnonymousClass8ZY {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05;
    public int A06;
    public View A07;
    public View A08;
    public C53368Gms A09;
    public AppBarLayout A0A;
    public GalleryItem A0B;
    public ConstrainedTextureView A0C;
    public C59947JcD A0D;
    public GalleryPickerCoordinatorLayout A0E;
    public C41776B0f A0F;
    public L6B A0G;
    public AnonymousClass8ZX A0H;
    public GalleryPreviewMultiselectPager A0I;
    public IgCaptureVideoPreviewView A0J;
    public Integer A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public float A0Z;
    public int A0a;
    public View A0b;
    public HorizontalScrollView A0c;
    public String A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public float[] A0l;
    public final View A0m;
    public final ViewGroup A0n;
    public final FrameLayout A0o;
    public final ImageView A0p;
    public final 28D A0q;
    public final 2cs A0r;
    public final 2cs A0s;
    public final 2cs A0t;
    public final 2cs A0u;
    public final 2cs A0v;
    public final 2cs A0w;
    public final AnonymousClass4DH A0x;
    public final 1Ng A0y;
    public final UserSession A0z;
    public final AnonymousClass8H1 A10;
    public final C59743JWb A11;
    public final JX2 A12;
    public final CropTypeToggleButton A13;
    public final JW8 A14;
    public final L0C A15;
    public final C59745JWe A16;
    public final AnonymousClass8ZW A17;
    public final C3499582p A18;
    public final C3499682q A19;
    public final C361568gR A1A;
    public final JX0 A1B;
    public final C59761JWz A1C;
    public final CropImageView A1D;
    public final C378369Pn A1E;
    public final C378379Po A1F;
    public final C361558gQ A1G;
    public final List A1H;
    public final Map A1I;
    public final Map A1J;
    public final Set A1K = AnonymousClass7TE.A1F();
    public final boolean A1L;
    public final boolean A1M;
    public final boolean A1N;
    public final boolean A1O;
    public final boolean A1P;
    public final Rect A1Q;
    public final GestureDetector A1R;
    public final ShimmerFrameLayout A1S;
    public final IgFrameLayout A1T;
    public final JX1 A1U;
    public final String A1V;

    /* JADX WARNING: type inference failed for: r0v10, types: [X.L0C, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v54, types: [X.07Z] */
    /* JADX WARNING: type inference failed for: r2v6, types: [com.instagram.creation.photo.crop.CropImageView, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x009b, code lost:
        if (r0.A03 != true) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x02cf, code lost:
        if (X.182.A06(r9, r8, 36325059568218705L) != false) goto L_0x02d1;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public JW7(android.content.Context r48, X.28D r49, X.AnonymousClass4DH r50, com.instagram.common.session.UserSession r51, X.AnonymousClass8ZW r52, X.C3499582p r53, java.lang.String r54, int r55, boolean r56) {
        /*
            r47 = this;
            r6 = 1
            r10 = r48
            r8 = r51
            X.AnonymousClass7TF.A1E(r10, r6, r8)
            r22 = 8
            r44 = r53
            r1 = r44
            r0 = r22
            X.0qQ.A0B(r1, r0)
            r2 = 9
            r1 = 10
            r46 = r49
            r0 = r46
            X.0qQ.A0B(r0, r1)
            r5 = 0
            r4 = 0
            r7 = r47
            r7.<init>(r10, r5, r4)
            r45 = r50
            r0 = r45
            r7.A0x = r0
            r0 = r54
            r7.A1V = r0
            r7.A0z = r8
            r0 = r44
            r7.A18 = r0
            r33 = r52
            r0 = r33
            r7.A17 = r0
            r0 = r46
            r7.A0q = r0
            X.JWb r25 = new X.JWb
            r1 = r25
            r0 = r45
            r1.<init>(r0, r8)
            r7.A11 = r1
            java.util.HashSet r0 = X.AnonymousClass7TE.A1F()
            r7.A1K = r0
            X.8gQ r24 = X.C361538gO.A00(r8)
            r0 = r24
            r7.A1G = r0
            X.L0C r0 = new X.L0C
            r0.<init>()
            r7.A15 = r0
            android.graphics.Rect r0 = X.AnonymousClass7TE.A0W()
            r7.A1Q = r0
            r26 = r56
            r0 = r26
            r7.A1P = r0
            X.82q r23 = r44.A00()
            r0 = r23
            r7.A19 = r0
            X.1Ng r0 = X.AnonymousClass1Nd.A00(r8)
            r7.A0y = r0
            X.8gR r0 = new X.8gR
            r0.<init>(r8, r6)
            r7.A1A = r0
            android.os.Handler r1 = X.AnonymousClass7TF.A0D()
            X.JWe r0 = new X.JWe
            r0.<init>(r1, r8)
            r7.A16 = r0
            r0 = r23
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r0 = r0.A01
            r43 = r0
            com.instagram.model.creation.MediaCaptureConfig r0 = r0.A09
            if (r0 == 0) goto L_0x009d
            boolean r0 = r0.A03
            r21 = 1
            if (r0 == r6) goto L_0x009f
        L_0x009d:
            r21 = 0
        L_0x009f:
            r0 = r21
            r7.A1L = r0
            X.28D r1 = X.28D.A2m
            r0 = r46
            boolean r0 = X.AnonymousClass7TF.A1W(r1, r0)
            r7.A1O = r0
            X.0Tu r9 = X.0Tu.A05
            r0 = 36322435343067324(0x810b10000028bc, double:3.033792597438806E-306)
            boolean r11 = X.182.A06(r9, r8, r0)
            r7.A1N = r11
            r7.A0P = r6
            X.Gms r0 = new X.Gms
            r0.<init>(r4, r4, r2)
            r7.A09 = r0
            r7.setOrientation(r6)
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r10)
            r0 = 2131625873(0x7f0e0791, float:1.8878966E38)
            if (r11 == 0) goto L_0x00d2
            r0 = 2131625874(0x7f0e0792, float:1.8878968E38)
        L_0x00d2:
            r1.inflate(r0, r7)
            r0 = 2131432032(0x7f0b1260, float:1.848581E38)
            android.widget.ImageView r0 = X.DbU.A0F(r7, r0)
            r7.A0p = r0
            r0 = 2131432046(0x7f0b126e, float:1.8485838E38)
            android.view.View r0 = r7.requireViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r7.A0o = r0
            r0 = 2131438108(0x7f0b2a1c, float:1.8498134E38)
            android.view.ViewGroup r0 = X.DbU.A0C(r7, r0)
            r7.A0n = r0
            if (r11 == 0) goto L_0x010a
            r0 = 2131433358(0x7f0b178e, float:1.84885E38)
            android.view.View r0 = r7.requireViewById(r0)
            com.instagram.creation.capture.gallery.ui.GalleryPickerCoordinatorLayout r0 = (com.instagram.creation.capture.gallery.ui.GalleryPickerCoordinatorLayout) r0
            r7.A0E = r0
            r0 = 2131432760(0x7f0b1538, float:1.8487287E38)
            android.view.View r0 = r7.requireViewById(r0)
            com.google.android.material.appbar.AppBarLayout r0 = (com.google.android.material.appbar.AppBarLayout) r0
            r7.A0A = r0
        L_0x010a:
            r7.setSaveEnabled(r6)
            X.2cp r2 = X.C61340me.A00()
            X.2cs r0 = r2.A02()
            r0.A06 = r6
            r7.A0t = r0
            X.2cs r0 = r2.A02()
            r0.A06 = r6
            r7.A0w = r0
            X.2cs r0 = r2.A02()
            r0.A06 = r6
            r7.A0r = r0
            X.2cs r0 = r2.A02()
            r0.A06 = r6
            r7.A0s = r0
            X.2cs r0 = r2.A02()
            X.2co r1 = X.JXH.A00
            r0.A09(r1)
            r7.A0v = r0
            X.2cs r0 = r2.A02()
            r0.A09(r1)
            r0.A06 = r6
            r7.A0u = r0
            android.view.GestureDetector r0 = new android.view.GestureDetector
            r0.<init>(r10, r7)
            r7.A1R = r0
            r0.setIsLongpressEnabled(r4)
            android.content.Context r3 = r7.getContext()
            java.lang.Class<androidx.fragment.app.FragmentActivity> r20 = androidx.fragment.app.FragmentActivity.class
            r0 = r20
            java.lang.Object r2 = X.0mE.A01(r3, r0)
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            X.02m r1 = X.02m.A0p
            r0 = 18284545(0x1170001, float:2.7734323E-38)
            r1.markerStart(r0)
            X.02m r1 = X.02m.A0p
            r0 = 18284546(0x1170002, float:2.7734325E-38)
            r1.markerStart(r0)
            X.6SR r0 = X.AnonymousClass6SR.A01()
            r0.A0M = r6
            r0 = 36328177714347061(0x81104900003c35, double:3.037424096158785E-306)
            boolean r19 = X.182.A06(r9, r8, r0)
            r0 = r19
            r7.A1M = r0
            boolean r0 = A0R(r7)
            if (r0 == 0) goto L_0x048a
            r0 = 36328834844343923(0x8110e200003e73, double:3.0378396678148506E-306)
            boolean r0 = X.182.A06(r9, r8, r0)
            if (r0 == 0) goto L_0x048a
            java.lang.Integer r38 = X.AnonymousClass05K.A00
        L_0x0195:
            boolean r16 = A0R(r7)
            r0 = 2131433450(0x7f0b17ea, float:1.8488686E38)
            android.view.ViewStub r12 = X.JTR.A0X(r7, r0)
            r0 = 36321060954383406(0x8109d0000d242e, double:3.032923428500877E-306)
            boolean r0 = X.182.A06(r9, r8, r0)
            if (r0 == 0) goto L_0x047c
            r1 = 2131624612(0x7f0e02a4, float:1.8876409E38)
        L_0x01ae:
            android.view.View r14 = X.JTP.A0H(r12, r1)
            java.lang.String r0 = "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView"
            X.0qQ.A0C(r14, r0)
            androidx.recyclerview.widget.RecyclerView r14 = (androidx.recyclerview.widget.RecyclerView) r14
            r0 = 2131432651(0x7f0b14cb, float:1.8487065E38)
            android.view.View r13 = X.AnonymousClass7TE.A0b(r7, r0)
            com.instagram.common.ui.base.IgFrameLayout r13 = (com.instagram.common.ui.base.IgFrameLayout) r13
            if (r16 != 0) goto L_0x0460
            X.JWl r12 = new X.JWl
            r12.<init>(r5, r5)
        L_0x01c9:
            r0 = 2131432049(0x7f0b1271, float:1.8485844E38)
            android.view.View r18 = X.AnonymousClass7TE.A0b(r7, r0)
            r0 = r18
            com.instagram.common.ui.base.IgTextView r0 = (com.instagram.common.ui.base.IgTextView) r0
            r18 = r0
            r0 = 2131440709(0x7f0b3445, float:1.850341E38)
            android.view.View r15 = X.AnonymousClass7TE.A0b(r7, r0)
            com.instagram.common.ui.base.IgTextView r15 = (com.instagram.common.ui.base.IgTextView) r15
            r0 = 2131436603(0x7f0b243b, float:1.8495081E38)
            if (r16 == 0) goto L_0x01e7
            r0 = 2131436604(0x7f0b243c, float:1.8495083E38)
        L_0x01e7:
            android.view.View r1 = X.AnonymousClass7TE.A0b(r7, r0)
            com.instagram.ui.widget.slideouticon.SlideInAndOutIconView r1 = (com.instagram.ui.widget.slideouticon.SlideInAndOutIconView) r1
            r17 = 2131443381(0x7f0b3eb5, float:1.8508828E38)
            r0 = r17
            android.view.View r0 = X.AnonymousClass7TE.A0b(r7, r0)
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r0 = (com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView) r0
            X.JWj r16 = new X.JWj
            r27 = r16
            r28 = r18
            r29 = r15
            r30 = r0
            r31 = r12
            r32 = r1
            r27.<init>(r28, r29, r30, r31, r32)
            X.JWk r1 = new X.JWk
            r0 = r16
            r1.<init>(r14, r13, r0)
            X.JWm r12 = new X.JWm
            r12.<init>(r7)
            boolean r41 = r33.Erj()
            X.JW8 r0 = new X.JW8
            r39 = r55
            r32 = r25
            r33 = r12
            r34 = r1
            r35 = r23
            r36 = r7
            r37 = r24
            r40 = r26
            r42 = r19
            r27 = r0
            r28 = r10
            r29 = r2
            r30 = r45
            r31 = r8
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            r7.A14 = r0
            if (r11 == 0) goto L_0x024b
            com.google.android.material.appbar.AppBarLayout r12 = r7.A0A
            if (r12 == 0) goto L_0x024b
            r11 = 3
            X.Jcc r1 = new X.Jcc
            r1.<init>(r7, r11)
            r12.A02(r1)
        L_0x024b:
            r1 = 2131435964(0x7f0b21bc, float:1.8493785E38)
            android.view.View r1 = r7.requireViewById(r1)
            r7.A0m = r1
            X.0qQ.A07(r3)
            X.JWz r1 = new X.JWz
            r1.<init>(r3, r8)
            r7.A1C = r1
            r1 = 2131431031(0x7f0b0e77, float:1.848378E38)
            android.view.View r13 = r7.requireViewById(r1)
            com.instagram.creation.photo.crop.CropImageView r13 = (com.instagram.creation.photo.crop.CropImageView) r13
            r7.A1D = r13
            r1 = r21
            r13.A05 = r1
            r13.setSameProportionalGrid(r6)
            r1 = 2131431034(0x7f0b0e7a, float:1.8483786E38)
            android.view.View r14 = r7.requireViewById(r1)
            com.instagram.creation.capture.gallery.ui.CropTypeToggleButton r14 = (com.instagram.creation.capture.gallery.ui.CropTypeToggleButton) r14
            boolean r11 = A0T(r7)
            r1 = 24
            X.MMT r12 = new X.MMT
            r12.<init>(r7, r1)
            if (r11 == 0) goto L_0x0454
            X.3NG r11 = X.AnonymousClass7TE.A0m(r14)
            r11.A06 = r4
            r1 = 13
            X.C61685KHt.A00(r11, r12, r1)
        L_0x0291:
            r7.A13 = r14
            boolean r1 = A0R(r7)
            if (r1 == 0) goto L_0x044e
            r1 = 2131443383(0x7f0b3eb7, float:1.8508833E38)
            android.view.View r1 = r7.requireViewById(r1)
            android.widget.HorizontalScrollView r1 = (android.widget.HorizontalScrollView) r1
            r7.A0c = r1
            r1 = 2131443382(0x7f0b3eb6, float:1.850883E38)
            X.DbT.A1F(r7, r1, r4)
            r1 = 2131432346(0x7f0b139a, float:1.8486447E38)
            android.view.View r1 = r7.requireViewById(r1)
            r7.A0b = r1
            r1 = r17
            android.view.View r14 = X.AnonymousClass7TF.A0G(r7, r1)
            if (r56 != 0) goto L_0x02d1
            com.instagram.creation.base.CreationSession r1 = X.JWE.A00(r7)
            boolean r1 = r1.A0L
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x02d1
            r11 = 36325059568218705(0x810d7300023251, double:3.035452167991446E-306)
            boolean r9 = X.182.A06(r9, r8, r11)
            r1 = 0
            if (r9 == 0) goto L_0x02d3
        L_0x02d1:
            r1 = 8
        L_0x02d3:
            r14.setVisibility(r1)
            r9 = 23
            X.LY0 r1 = new X.LY0
            r1.<init>(r7, r9)
            r14.setOnClickListener(r1)
            X.JWk r1 = r0.A0I
            X.JWj r9 = r1.A02
            X.JWl r1 = r9.A03
            com.instagram.common.ui.base.IgTextView r12 = r1.A01
            android.view.View r14 = r1.A00
            if (r12 == 0) goto L_0x0313
            if (r14 == 0) goto L_0x0313
            r12.setVisibility(r4)
            X.3NG r11 = X.AnonymousClass7TE.A0m(r12)
            r11.A06 = r4
            X.KHr r1 = new X.KHr
            r1.<init>(r6, r10, r14, r7)
            r11.A04 = r1
            r11.A00()
            r1 = 2131962915(0x7f132c23, float:1.9562569E38)
            java.lang.String r1 = r10.getString(r1)
            X.2eQ.A08(r12, r1)
            r11 = 2131433388(0x7f0b17ac, float:1.848856E38)
            r1 = r22
            X.DbT.A1F(r7, r11, r1)
        L_0x0313:
            boolean r1 = r7.A1P
            if (r1 != 0) goto L_0x0354
            X.82q r1 = r7.A19
            boolean r1 = r1.CKG()
            if (r1 != 0) goto L_0x0354
            X.JW8 r1 = r7.A14
            com.instagram.common.session.UserSession r1 = r1.A0E
            java.util.ArrayList r1 = X.JX7.A00(r1)
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x0354
            com.instagram.common.ui.base.IgTextView r11 = r9.A00
            r1 = 25
            X.MMT r12 = new X.MMT
            r12.<init>(r11, r1)
            r1 = 2130970278(0x7f0406a6, float:1.7549262E38)
            int r9 = X.AnonymousClass7TF.A03(r10, r1)
            X.Jbc r1 = new X.Jbc
            r1.<init>(r12, r9)
            r11.setOnTouchListener(r1)
            r11.setVisibility(r4)
            r11.setSelected(r4)
            r1 = 11
            X.LYA r1 = X.LYA.A00(r11, r10, r7, r1)
            r11.setOnClickListener(r1)
        L_0x0354:
            r1 = 2131435640(0x7f0b2078, float:1.8493128E38)
            android.view.View r1 = r7.requireViewById(r1)
            com.facebook.shimmer.ShimmerFrameLayout r1 = (com.facebook.shimmer.ShimmerFrameLayout) r1
            r7.A1S = r1
            r1 = 2131441287(0x7f0b3687, float:1.8504581E38)
            android.view.View r9 = r7.requireViewById(r1)
            com.instagram.common.ui.base.IgFrameLayout r9 = (com.instagram.common.ui.base.IgFrameLayout) r9
            r7.A1T = r9
            int r1 = com.instagram.ui.widget.mediapicker.MediaPickerItemView.A0X
            r9.setBackgroundColor(r1)
            X.JX0 r1 = new X.JX0
            r1.<init>()
            r7.A1B = r1
            r1.A03 = r2
            r1.A04 = r7
            r1.A05 = r13
            X.JX9 r1 = X.JWX.A00(r8)
            java.util.Map r1 = r1.A04
            r7.A1J = r1
            boolean r1 = r7.A0d()
            if (r1 != 0) goto L_0x03b8
            r1 = 2131443744(0x7f0b4020, float:1.8509565E38)
            android.view.View r1 = r7.requireViewById(r1)
            r7.A08 = r1
            r1 = 2131443745(0x7f0b4021, float:1.8509567E38)
            android.view.View r10 = r7.requireViewById(r1)
            com.instagram.creation.capture.video.view.IgCaptureVideoPreviewView r10 = (com.instagram.creation.capture.video.view.IgCaptureVideoPreviewView) r10
            r7.A0J = r10
            if (r10 == 0) goto L_0x03b0
            X.82q r1 = r44.A00()
            r10.A01 = r1
            r9 = 24
            X.LY0 r1 = new X.LY0
            r1.<init>(r7, r9)
            r10.setOnClickListener(r1)
        L_0x03b0:
            com.instagram.creation.capture.video.view.IgCaptureVideoPreviewView r9 = r7.A0J
            if (r9 == 0) goto L_0x03b8
            r1 = 1058013184(0x3f100000, float:0.5625)
            r9.A00 = r1
        L_0x03b8:
            java.lang.String r10 = "gallery"
            X.9Po r9 = new X.9Po
            r9.<init>(r3, r8, r10)
            r7.A1F = r9
            X.9Pn r1 = new X.9Pn
            r11 = r1
            r12 = r3
            r13 = r8
            r14 = r5
            r15 = r10
            r16 = r4
            r17 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r7.A1E = r1
            X.0qQ.A0B(r1, r4)
            r9.A06 = r1
            r1 = 2131431024(0x7f0b0e70, float:1.8483766E38)
            android.view.ViewStub r1 = X.JTR.A0X(r7, r1)
            X.JX2 r11 = new X.JX2
            r11.<init>(r1)
            r7.A12 = r11
            X.JX9 r1 = X.JWX.A00(r8)
            float r1 = r1.A00
            r7.A04 = r1
            java.util.HashMap r1 = X.AnonymousClass7TE.A1E()
            r7.A1I = r1
            boolean r1 = r7.A1P
            if (r1 == 0) goto L_0x0493
            X.82q r9 = r7.A19
            r1 = r9
            X.JWE r1 = (X.JWE) r1
            com.instagram.creation.base.CreationSession r10 = r1.A01
            java.lang.String r1 = r10.A0C
            if (r1 == 0) goto L_0x0493
            java.lang.Class<X.4cI> r1 = X.C267834cI.class
            java.lang.Object r14 = X.0mE.A01(r3, r1)
            X.4cI r14 = (X.C267834cI) r14
            java.lang.String r1 = r10.A0C
            X.3Q2 r13 = r14.BbQ(r1)
            if (r13 == 0) goto L_0x0493
            boolean r1 = r13.A5U
            if (r1 == 0) goto L_0x0493
            java.util.Iterator r15 = X.JTP.A0w(r9)
        L_0x0419:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x0493
            java.lang.Object r1 = r15.next()
            com.instagram.creation.base.MediaSession r1 = (com.instagram.creation.base.MediaSession) r1
            java.lang.String r9 = r1.BbR()
            if (r9 == 0) goto L_0x0419
            java.util.List r1 = r13.A0M()
            boolean r1 = r1.contains(r9)
            if (r1 == 0) goto L_0x0419
            X.3Q2 r12 = r14.BbQ(r9)
            if (r12 == 0) goto L_0x048e
            java.lang.String r10 = r12.A30
            if (r10 == 0) goto L_0x0419
            java.util.Map r1 = r7.A1I
            r1.put(r10, r12)
            X.1iA r9 = r12.A1G
            X.1iA r1 = X.1iA.A0Q
            if (r9 != r1) goto L_0x0419
            r7.A0M(r12, r10)
            goto L_0x0419
        L_0x044e:
            r7.A0c = r5
            r7.A0b = r5
            goto L_0x0354
        L_0x0454:
            r11 = 21
            X.LY0 r1 = new X.LY0
            r1.<init>(r12, r11)
            r14.setOnClickListener(r1)
            goto L_0x0291
        L_0x0460:
            r0 = 2131443844(0x7f0b4084, float:1.8509768E38)
            android.view.View r1 = X.JTR.A0V(r7, r0)
            r0 = 2131433392(0x7f0b17b0, float:1.8488568E38)
            com.instagram.common.ui.base.IgTextView r1 = X.JTO.A0X(r1, r0)
            r0 = 2131433390(0x7f0b17ae, float:1.8488564E38)
            android.view.View r0 = r7.findViewById(r0)
            X.JWl r12 = new X.JWl
            r12.<init>(r0, r1)
            goto L_0x01c9
        L_0x047c:
            int r0 = r38.intValue()
            r1 = 2131625859(0x7f0e0783, float:1.8878938E38)
            if (r0 == r4) goto L_0x01ae
            r1 = 2131625860(0x7f0e0784, float:1.887894E38)
            goto L_0x01ae
        L_0x048a:
            java.lang.Integer r38 = X.AnonymousClass05K.A01
            goto L_0x0195
        L_0x048e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0493:
            X.0xa r1 = X.AnonymousClass8VQ.A00
            if (r1 != 0) goto L_0x049f
            java.lang.String r1 = "GalleryMetadataPreferences"
            X.0tX r1 = X.0xn.A01(r1)
            X.AnonymousClass8VQ.A00 = r1
        L_0x049f:
            r1 = r20
            java.lang.Object r1 = X.0mE.A01(r3, r1)
            androidx.core.app.ComponentActivity r1 = (androidx.core.app.ComponentActivity) r1
            X.0gy r25 = X.AnonymousClass07i.A00(r1)
            java.lang.Class<X.4cI> r1 = X.C267834cI.class
            java.lang.Object r12 = X.0mE.A00(r3, r1)
            X.4cI r12 = (X.C267834cI) r12
            java.lang.Class<X.4mi> r1 = X.C273514mi.class
            java.lang.Object r10 = X.0mE.A00(r3, r1)
            X.4mi r10 = (X.C273514mi) r10
            java.lang.Class<X.4mq> r1 = X.C273594mq.class
            java.lang.Object r9 = X.0mE.A00(r3, r1)
            X.4mq r9 = (X.C273594mq) r9
            r33 = 10001(0x2711, float:1.4014E-41)
            X.JX1 r1 = new X.JX1
            r23 = r1
            r24 = r3
            r26 = r46
            r27 = r8
            r28 = r9
            r29 = r11
            r30 = r44
            r31 = r10
            r32 = r12
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r7.A1U = r1
            X.2YN r8 = new X.2YN
            r8.<init>(r2)
            java.lang.Class<X.8H1> r1 = X.AnonymousClass8H1.class
            X.2YL r1 = r8.A00(r1)
            X.8H1 r1 = (X.AnonymousClass8H1) r1
            r7.A10 = r1
            X.2Fk r8 = r1.A01
            X.LZp r1 = new X.LZp
            r1.<init>(r4, r2, r7)
            X.6q2 r2 = new X.6q2
            r2.<init>(r1)
            r1 = r45
            r8.A06(r1, r2)
            r1 = r43
            boolean r1 = r1.A0L
            if (r1 == 0) goto L_0x050a
            r1 = 2131439170(0x7f0b2e42, float:1.8500288E38)
            X.DbT.A1F(r7, r1, r4)
        L_0x050a:
            boolean r1 = r7.A0c()
            if (r1 == 0) goto L_0x0561
            r1 = 2131433452(0x7f0b17ec, float:1.848869E38)
            android.view.View r8 = X.DbY.A0F(r7, r1)
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.common.ui.base.IgFrameLayout"
            X.0qQ.A0C(r8, r1)
            r7.A07 = r8
            if (r8 == 0) goto L_0x0536
            r8.setVisibility(r4)
            com.instagram.common.session.UserSession r2 = r7.A0z
            X.JcC r1 = new X.JcC
            r1.<init>(r7)
            X.JcD r9 = new X.JcD
            r10 = r3
            r11 = r8
            r12 = r7
            r13 = r2
            r14 = r1
            r9.<init>(r10, r11, r12, r13, r14)
            r7.A0D = r9
        L_0x0536:
            boolean r1 = r7.A0d()
            if (r1 == 0) goto L_0x055a
            android.view.ViewGroup r2 = r7.A0n
            r1 = r22
            r2.setVisibility(r1)
            com.instagram.creation.photo.crop.CropImageView r2 = r7.A1D
            r2.setVisibility(r1)
            com.instagram.creation.capture.gallery.ui.CropTypeToggleButton r2 = r7.A13
            r2.setVisibility(r1)
            r2.setEnabled(r4)
            r7.A0J = r5
            r7.A08 = r5
            r7.A0I = r5
            X.JX0 r1 = r7.A1B
            r1.A09 = r6
        L_0x055a:
            X.JWM r0 = r0.A0F
            java.util.List r0 = r0.A0W
            r7.A1H = r0
            return
        L_0x0561:
            r7.A0D = r5
            r7.A07 = r5
            goto L_0x0536
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JW7.<init>(android.content.Context, X.28D, X.4DH, com.instagram.common.session.UserSession, X.8ZW, X.82p, java.lang.String, int, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        if (r5 != null) goto L_0x003b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A09(com.instagram.common.gallery.model.GalleryItem r14, X.JW7 r15, boolean r16, boolean r17) {
        /*
            r6 = r14
            java.lang.Integer r0 = r14.A09
            int r1 = r0.intValue()
            r0 = 2
            r7 = r15
            r9 = r16
            r10 = r17
            if (r1 == r0) goto L_0x00d6
            r4 = 0
            if (r1 == r4) goto L_0x00d2
            r2 = 1
            if (r1 != r2) goto L_0x0091
            r15.A0Y = r9
            com.instagram.common.session.UserSession r0 = r15.A0z
            com.instagram.pendingmedia.store.PendingMediaStore r5 = X.28K.A00(r0)
            boolean r3 = r14.A01()
            java.lang.String r1 = "Required value was null."
            java.lang.String r0 = r14.A0A
            if (r3 == 0) goto L_0x009f
            X.3Q2 r0 = r5.A03(r0)
            if (r0 == 0) goto L_0x012a
            java.util.List r0 = r0.A0M()
            java.lang.String r0 = X.AnonymousClass7TE.A19(r0, r4)
            X.3Q2 r5 = r5.A03(r0)
            if (r5 == 0) goto L_0x00af
        L_0x003b:
            boolean r0 = r14.A06()
            if (r0 == 0) goto L_0x00af
            com.instagram.creation.base.ui.ConstrainedTextureView r1 = r15.A0C
            if (r1 == 0) goto L_0x004a
            android.widget.FrameLayout r0 = r15.A0o
            r0.removeView(r1)
        L_0x004a:
            X.9Po r3 = r15.A1F
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r15)
            com.instagram.creation.base.ui.ConstrainedTextureView r0 = new com.instagram.creation.base.ui.ConstrainedTextureView
            r0.<init>(r1)
            r3.A03 = r0
            r15.A0C = r0
            X.0qQ.A0A(r0)
            r0.setSurfaceTextureListener(r3)
            com.instagram.creation.base.ui.ConstrainedTextureView r1 = r15.A0C
            X.0qQ.A0A(r1)
            float r0 = r5.A02
            r1.setAspectRatio(r0)
            r15.A03()
            X.9Pn r3 = r15.A1E
            X.Lpc r0 = new X.Lpc
            r0.<init>(r15)
            r3.A06(r0)
            android.widget.FrameLayout$LayoutParams r1 = X.JTR.A0Y()
            com.instagram.creation.base.ui.ConstrainedTextureView r0 = r15.A0C
            X.0qQ.A0A(r0)
            r0.setLayoutParams(r1)
            android.widget.FrameLayout r1 = r15.A0o
            com.instagram.creation.base.ui.ConstrainedTextureView r0 = r15.A0C
            r1.addView(r0, r4)
            r3.A08(r5, r4)
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            r15.A0a(r0, r2)
        L_0x0091:
            boolean r0 = r7.A0d()
            if (r0 == 0) goto L_0x009e
            X.8ZX r0 = r7.A0H
            if (r0 == 0) goto L_0x009e
            r0.DHZ(r7)
        L_0x009e:
            return
        L_0x009f:
            X.3Q2 r5 = r5.A03(r0)
            if (r5 == 0) goto L_0x00af
            com.instagram.common.gallery.Medium r0 = r14.A00
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r0.A0X
            X.AnonymousClass8VQ.A05(r5, r0)
            goto L_0x003b
        L_0x00af:
            java.lang.String r0 = r14.A00()
            if (r0 == 0) goto L_0x0091
            java.lang.String r0 = r14.A00()
            if (r0 == 0) goto L_0x012f
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeFile(r0)
            android.widget.ImageView r0 = r15.A0p
            r0.setImageBitmap(r1)
            r15.A02()
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            r15.A0a(r0, r2)
            java.lang.String r0 = "photo"
            X.C59862Jae.A00(r2, r0)
            goto L_0x0091
        L_0x00d2:
            A0A(r14, r15, r9, r4, r10)
            goto L_0x0091
        L_0x00d6:
            com.instagram.common.gallery.RemoteMedia r5 = r14.A04
            if (r5 == 0) goto L_0x0134
            X.8gQ r4 = r15.A1G
            X.JW8 r3 = r15.A14
            r3.A0B()
            r2 = 1
            java.util.Map r1 = r4.A00
            X.KxV r0 = new X.KxV
            r0.<init>()
            r1.put(r5, r0)
            r15.A0C(r14, r9)
            com.instagram.common.gallery.Medium r0 = r4.A01(r5)
            if (r0 == 0) goto L_0x00fd
            com.instagram.common.gallery.model.GalleryItem$LocalGalleryMedium r0 = X.JTR.A0f(r0)
            A0A(r0, r15, r9, r2, r10)
            goto L_0x0091
        L_0x00fd:
            X.8Xf r0 = r3.A0B()
            java.lang.String r8 = r0.getName()
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            r15.A0a(r0, r2)
            X.8gR r11 = r15.A1A
            android.content.Context r12 = X.AnonymousClass7TE.A0S(r15)
            com.instagram.common.session.UserSession r14 = r15.A0z
            X.MMy r4 = new X.MMy
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r1 = 24
            X.MMv r0 = new X.MMv
            r0.<init>(r1, r6, r15)
            java.lang.String r15 = "posts"
            r13 = r5
            r16 = r4
            r17 = r0
            r11.A03(r12, r13, r14, r15, r16, r17)
            goto L_0x0091
        L_0x012a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x012f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x0134:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JW7.A09(com.instagram.common.gallery.model.GalleryItem, X.JW7, boolean, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, X.2jE] */
    public static final void A0K(JW7 jw7, List list, List list2) {
        JW7 jw72 = jw7;
        int size = jw7.A14.A0O.A06().size();
        02m r2 = 02m.A0p;
        r2.markerAnnotate(18284545, "gallery_size", size);
        r2.markerEnd(18284545, 2);
        if (A0S(jw7) && !jw7.A1P) {
            Iterator it = jw7.getFolders().iterator();
            while (it.hasNext() && ((r1 = ((Folder) it.next()).A03) == null || (!r1.equals(WearableMediaDownloadManager.MODEL_FIELD_STELLA_PHOTO) && !r1.equals("Meta View")))) {
            }
        }
        View folderMenuTooltipAnchor = jw7.getFolderMenuTooltipAnchor();
        if (A0S(jw7)) {
            List folders = jw7.getFolders();
            if (!(folders instanceof Collection) || !folders.isEmpty()) {
                Iterator it2 = folders.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (((Folder) it2.next()).A07) {
                        if (new Object().A01(jw7.A0z, true)) {
                            ComponentActivity componentActivity = (ComponentActivity) 0mE.A01(jw7.getContext(), FragmentActivity.class);
                            1Eo.A05(JTP.A0U(AnonymousClass12T.A00, 281480192), new C59819JZr(folderMenuTooltipAnchor, componentActivity, jw72, (AnonymousClass4D7) null, 30), AnonymousClass07a.A00(componentActivity));
                        }
                    }
                }
            }
        }
        AnonymousClass8ZX r0 = jw72.A0H;
        if (r0 != null) {
            r0.DQZ(jw72, list, list2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        if (X.JW8.A08(r2) != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0V() {
        /*
            r3 = this;
            r0 = 1
            r3.A0f = r0
            r3.A05()
            X.JW8 r2 = r3.A14
            com.instagram.common.session.UserSession r0 = r2.A0E
            boolean r0 = X.C361378g8.A01(r0)
            if (r0 == 0) goto L_0x003a
            android.content.Context r0 = r2.A09
            boolean r0 = X.C2604245p.A03(r0)
            if (r0 == 0) goto L_0x003a
        L_0x0018:
            r0 = 0
            X.JW8.A0X = r0
        L_0x001b:
            r2.A0D()
        L_0x001e:
            X.JWk r0 = r2.A0I
            androidx.recyclerview.widget.RecyclerView r1 = r0.A00
            X.2nK r0 = r2.A0L
            r1.A15(r0)
            X.8XW r0 = r2.A0O
            r0.A09()
            A0G(r3)
            X.JX5 r2 = new X.JX5
            r2.<init>(r3)
            r0 = 1000(0x3e8, double:4.94E-321)
            X.11Z.A04(r2, r0)
            return
        L_0x003a:
            boolean r0 = r2.A0S
            if (r0 != 0) goto L_0x001b
            android.content.Context r0 = r2.A09
            boolean r0 = X.C2604245p.A03(r0)
            if (r0 == 0) goto L_0x001e
            boolean r0 = X.JW8.A08(r2)
            if (r0 == 0) goto L_0x001e
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JW7.A0V():void");
    }

    public final void A0X(L0A l0a, ArrayList arrayList, boolean z) {
        Medium medium;
        int i;
        UserSession userSession = this.A0z;
        JWX.A00(userSession).A02 = true;
        28D r4 = this.A0q;
        ArrayList arrayList2 = arrayList;
        if (r4 != 28D.A37 && (arrayList2.size() != 1 || (((GalleryItem) arrayList2.get(0)).A09 != AnonymousClass05K.A01 && !((GalleryItem) arrayList2.get(0)).A06()))) {
            JW1.A00(userSession).A06(r4, arrayList2.size(), false);
        }
        JWM jwm = this.A14.A0F;
        boolean z2 = z;
        if (jwm.A07) {
            C64154LQt.A00.A01(C279294yP.FEED, userSession, arrayList2, this.A1J, z2);
        } else if (DbT.A1b(arrayList2)) {
            C64154LQt.A00(C279294yP.FEED, (GalleryItem) 00k.A0I(arrayList2), userSession, getGalleryPreviewInfoFromCropController(), z2, false);
        }
        if (arrayList2.size() > 1) {
            27p.A01(userSession).A04.A0A = 28t.A02;
        }
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            A1C2.add(((GalleryItem) it.next()).A0A);
        }
        Map map = this.A1I;
        Iterator A162 = DbV.A16(map);
        while (A162.hasNext()) {
            Object next = A162.next();
            if (!this.A1K.contains(next) && !00k.A0u(A1C2, next)) {
                Object obj = map.get(next);
                if (obj != null) {
                    AnonymousClass3Q2 r8 = (AnonymousClass3Q2) obj;
                    String str = r8.A35;
                    boolean A122 = r8.A12();
                    if (A122) {
                        i = JTO.A09(r8.A1N);
                    } else {
                        i = 0;
                    }
                    Draft draft = new Draft((Long) null, str, r8.A33, (String) null, i, A122, false, false, !AnonymousClass7TF.A1W(r8.A0E(), ShareType.CLIPS_PANAVIDEO));
                    0qQ.A0B(draft, 1);
                    GalleryItem galleryItem = new GalleryItem(draft, (GeneratedMediaMetadata) null, (Medium) null, (RemoteMedia) null, (AnonymousClass8y3) null, (ImageUrl) null, (C352218Cl) null, (C349307zv) null, AnonymousClass05K.A01, draft.A04, -1);
                    AnonymousClass3Q2 BbQ = ((C267834cI) 0mE.A01(getContext(), C267834cI.class)).BbQ(r8.A3O);
                    if (BbQ != null) {
                        try {
                            arrayList2.add(BbQ.A0M().indexOf(r8.A35), galleryItem);
                        } catch (IndexOutOfBoundsException unused) {
                            arrayList2.add(galleryItem);
                        }
                        A0M(r8, r8.A35);
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
        }
        if (arrayList2.size() > 1) {
            JX1 jx1 = this.A1U;
            float albumAspectRatio = getAlbumAspectRatio();
            boolean z3 = this.A1P;
            L0A l0a2 = l0a;
            JX1 jx12 = jx1;
            jx12.A05(C279294yP.FEED, l0a2, getCurrentFolderIdForSave(), arrayList2, this.A1J, map, albumAspectRatio, z3, this.A0R, z2);
            return;
        }
        A0I(this);
        GalleryItem galleryItem2 = this.A0B;
        if (galleryItem2 == null) {
            JW1.A00(userSession).A0B(false, "No preview item set");
            return;
        }
        int intValue = galleryItem2.A09.intValue();
        if (intValue == 2) {
            RemoteMedia remoteMedia = galleryItem2.A04;
            if (remoteMedia != null) {
                medium = this.A1G.A01(remoteMedia);
                if (medium == null) {
                    UserSession userSession2 = userSession;
                    AnonymousClass9PQ.A04(this.A0x, remoteMedia, userSession2, "posts", getResources().getString(2131962946), C51966G9m.A1J(jwm.A0W));
                    C59689JTv.A01(AnonymousClass7TE.A0S(this), AnonymousClass000.A00(1381), 2131962946, 0);
                    return;
                } else if (this.A0K == AnonymousClass05K.A00 && !A0d()) {
                    this.A0G = new L6B(medium, remoteMedia, this);
                    return;
                }
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else if (intValue == 0) {
            medium = galleryItem2.A00;
            if (medium == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else if (intValue == 1) {
            AnonymousClass3Q2 A032 = 28K.A00(userSession).A03(galleryItem2.A0A);
            if (A032 != null) {
                if (galleryItem2.A01()) {
                    C63997LHx.A01(userSession, A032);
                }
                C3499582p r5 = this.A18;
                C63997LHx.A00(this.A0x, userSession, r5, A032, "gallery");
                boolean A1W = AnonymousClass7TF.A1W(A032.A0E(), ShareType.CLIPS_PANAVIDEO);
                if (JWE.A00(this).A0M && !A1W) {
                    LI1.A01((Activity) 0mE.A01(getContext(), Activity.class), r4, userSession, r5, 10001);
                    return;
                }
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        } else {
            return;
        }
        A08(medium, this);
    }

    public final void A0Z(Integer num, List list, int i) {
        0qQ.A0B(list, 1);
        AnonymousClass8XW r2 = this.A14.A0O;
        C59932Jbw jbw = new C59932Jbw(this, num, list, i);
        if (r2.A05) {
            jbw.run();
        } else {
            r2.A03 = jbw;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        r0 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        r4 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0033, code lost:
        r2 = r9.A0t;
        r0 = (double) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        if (r11 == false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        r2.A06(r0);
        r9.A0w.A06((double) r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        if (r8 == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0043, code lost:
        r9.A0r.A08(0.0d, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004a, code lost:
        r9.A0r.A06((double) r5);
        r9.A0s.A06((double) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        A05();
        r3 = r9.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005b, code lost:
        if (r7 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005d, code lost:
        if (r3 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005f, code lost:
        r2 = r3.A02;
        r2.A0G = null;
        r0 = r2.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0066, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006c, code lost:
        if (r0.A04 != r3.A01) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006e, code lost:
        A08(r3.A00, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0074, code lost:
        r2.A08(r0, true);
        r9.A0w.A08((double) r6, true);
        r9.A0r.A08((double) r5, true);
        r9.A0s.A08((double) r4, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r10 != X.AnonymousClass05K.A0Y) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r10 == X.AnonymousClass05K.A0C) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0a(java.lang.Integer r10, boolean r11) {
        /*
            r9 = this;
            r1 = 0
            java.lang.Integer r0 = r9.A0K
            r3 = 1
            if (r0 != r10) goto L_0x000b
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            r8 = 1
            if (r10 == r0) goto L_0x000c
        L_0x000b:
            r8 = 0
        L_0x000c:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r10 == r0) goto L_0x0015
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r7 = 0
            if (r10 != r0) goto L_0x0016
        L_0x0015:
            r7 = 1
        L_0x0016:
            r9.A0K = r10
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            if (r10 != r0) goto L_0x0099
            com.facebook.shimmer.ShimmerFrameLayout r0 = r9.A1S
            r0.A06(r3)
            com.instagram.common.ui.base.IgFrameLayout r0 = r9.A1T
            r0.setVisibility(r1)
        L_0x0026:
            int r1 = r10.intValue()
            r0 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            switch(r1) {
                case 2: goto L_0x008c;
                case 3: goto L_0x008a;
                case 4: goto L_0x0091;
                case 5: goto L_0x0094;
                default: goto L_0x0030;
            }
        L_0x0030:
            r5 = 0
        L_0x0031:
            r0 = 0
        L_0x0032:
            r4 = 0
        L_0x0033:
            X.2cs r2 = r9.A0t
            double r0 = (double) r0
            if (r11 == 0) goto L_0x0074
            r2.A06(r0)
            X.2cs r2 = r9.A0w
            double r0 = (double) r6
            r2.A06(r0)
            if (r8 == 0) goto L_0x004a
            X.2cs r2 = r9.A0r
            r0 = 0
            r2.A08(r0, r3)
        L_0x004a:
            X.2cs r2 = r9.A0r
            double r0 = (double) r5
            r2.A06(r0)
            X.2cs r2 = r9.A0s
            double r0 = (double) r4
            r2.A06(r0)
        L_0x0056:
            r9.A05()
            X.L6B r3 = r9.A0G
            if (r7 == 0) goto L_0x0073
            if (r3 == 0) goto L_0x0073
            X.JW7 r2 = r3.A02
            r0 = 0
            r2.A0G = r0
            com.instagram.common.gallery.model.GalleryItem r0 = r2.A0B
            if (r0 == 0) goto L_0x0073
            com.instagram.common.gallery.RemoteMedia r1 = r0.A04
            com.instagram.common.gallery.RemoteMedia r0 = r3.A01
            if (r1 != r0) goto L_0x0073
            com.instagram.common.gallery.Medium r0 = r3.A00
            A08(r0, r2)
        L_0x0073:
            return
        L_0x0074:
            r2.A08(r0, r3)
            X.2cs r2 = r9.A0w
            double r0 = (double) r6
            r2.A08(r0, r3)
            X.2cs r2 = r9.A0r
            double r0 = (double) r5
            r2.A08(r0, r3)
            X.2cs r2 = r9.A0s
            double r0 = (double) r4
            r2.A08(r0, r3)
            goto L_0x0056
        L_0x008a:
            r5 = 0
            goto L_0x0032
        L_0x008c:
            r5 = 0
            r0 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0032
        L_0x0091:
            r5 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0031
        L_0x0094:
            r5 = 0
            r0 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0033
        L_0x0099:
            com.facebook.shimmer.ShimmerFrameLayout r0 = r9.A1S
            r0.A05()
            com.instagram.common.ui.base.IgFrameLayout r1 = r9.A1T
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JW7.A0a(java.lang.Integer, boolean):void");
    }

    public final /* synthetic */ void D3h(Integer num) {
    }

    public final /* synthetic */ void DAm(boolean z) {
    }

    public final /* synthetic */ void DBA(int i) {
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.creation.photo.crop.CropImageView, android.view.View] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DHn(com.instagram.creation.photo.crop.CropImageView r3) {
        /*
            r2 = this;
            r1 = 0
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L_0x000a
            r0.requestDisallowInterceptTouchEvent(r1)
        L_0x000a:
            com.instagram.common.session.UserSession r0 = r2.A0z
            X.JbO r1 = X.JZM.A00(r0)
            java.lang.String r0 = "touch"
            X.C59899JbO.A04(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JW7.DHn(com.instagram.creation.photo.crop.CropImageView):void");
    }

    public final void DQg(GalleryItem galleryItem, boolean z) {
        0qQ.A0B(galleryItem, 0);
        A0B(galleryItem, this, z, true, true);
    }

    public final void DQh(GalleryItem galleryItem, boolean z) {
        this.A0B = null;
        this.A1J.remove(galleryItem.A0A);
        A0a(AnonymousClass05K.A00, true);
        JWM jwm = this.A14.A0F;
        if (jwm.A07) {
            List list = jwm.A0W;
            if (!C51966G9m.A1J(list).isEmpty()) {
                A0B((GalleryItem) C51966G9m.A1J(list).get(DbT.A02(C51966G9m.A1J(list), 1)), this, false, false, true);
            }
        }
    }

    public final void DSA(C357268Xf r5) {
        0qQ.A0B(r5, 0);
        JW8 jw8 = this.A14;
        C357268Xf A0B2 = jw8.A0B();
        Integer CAp = A0B2.CAp();
        Integer CAp2 = r5.CAp();
        if (CAp != CAp2 || A0B2.BEU() != r5.BEU()) {
            if (CAp2 == AnonymousClass05K.A00) {
                this.A17.DX6((Folder) r5);
                jw8.A0J(r5);
            } else if (CAp2 == AnonymousClass05K.A01) {
                this.A17.DX7((C65796Lzo) r5);
            }
        }
    }

    public final /* synthetic */ void Dik() {
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [com.instagram.creation.photo.crop.CropImageView] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DmB(X.2cs r7) {
        /*
            r6 = this;
            r3 = 0
            X.0qQ.A0B(r7, r3)
            X.2cs r0 = r6.A0v
            if (r7 != r0) goto L_0x0011
            X.2ct r0 = r7.A09
            double r1 = r0.A00
            int r0 = (int) r1
            r6.setChildViewTranslationY(r0)
        L_0x0010:
            return
        L_0x0011:
            X.2cs r0 = r6.A0t
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r7 != r0) goto L_0x0023
            double r1 = r7.A01
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0010
            com.instagram.creation.photo.crop.CropImageView r0 = r6.A1D
        L_0x001f:
            r0.setVisibility(r3)
            return
        L_0x0023:
            X.2cs r0 = r6.A0w
            if (r7 != r0) goto L_0x0039
            double r1 = r7.A01
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0010
            com.instagram.creation.capture.video.view.IgCaptureVideoPreviewView r0 = r6.A0J
            if (r0 == 0) goto L_0x0034
            r0.setVisibility(r3)
        L_0x0034:
            android.view.View r0 = r6.A08
            if (r0 == 0) goto L_0x0010
            goto L_0x001f
        L_0x0039:
            X.2cs r0 = r6.A0r
            if (r7 != r0) goto L_0x0046
            double r1 = r7.A01
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0010
            android.widget.ImageView r0 = r6.A0p
            goto L_0x001f
        L_0x0046:
            X.2cs r0 = r6.A0s
            if (r7 != r0) goto L_0x0010
            double r1 = r7.A01
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0010
            android.widget.FrameLayout r0 = r6.A0o
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JW7.DmB(X.2cs):void");
    }

    /* JADX WARNING: type inference failed for: r0v19, types: [com.instagram.creation.photo.crop.CropImageView] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DmC(X.2cs r10) {
        /*
            r9 = this;
            r6 = 0
            X.0qQ.A0B(r10, r6)
            X.2cs r7 = r9.A0v
            if (r10 != r7) goto L_0x0011
            X.2ct r0 = r10.A09
            double r1 = r0.A00
            int r0 = (int) r1
            r9.setChildViewTranslationY(r0)
        L_0x0010:
            return
        L_0x0011:
            X.2cs r0 = r9.A0t
            r2 = 0
            r8 = 8
            if (r10 != r0) goto L_0x0025
            double r0 = r10.A01
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0065
            com.instagram.creation.photo.crop.CropImageView r0 = r9.A1D
        L_0x0021:
            r0.setVisibility(r8)
            return
        L_0x0025:
            X.2cs r0 = r9.A0w
            if (r10 != r0) goto L_0x003b
            double r0 = r10.A01
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0065
            com.instagram.creation.capture.video.view.IgCaptureVideoPreviewView r0 = r9.A0J
            if (r0 == 0) goto L_0x0036
            r0.setVisibility(r8)
        L_0x0036:
            android.view.View r0 = r9.A08
            if (r0 == 0) goto L_0x0010
            goto L_0x0021
        L_0x003b:
            X.2cs r0 = r9.A0r
            if (r10 != r0) goto L_0x0048
            double r4 = r10.A01
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0065
            android.widget.ImageView r0 = r9.A0p
            goto L_0x0021
        L_0x0048:
            X.2cs r0 = r9.A0s
            if (r10 != r0) goto L_0x0010
            double r4 = r10.A01
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0065
            android.widget.FrameLayout r1 = r9.A0o
            r1.setVisibility(r8)
            X.9Pn r0 = r9.A1E
            r0.A00()
            com.instagram.creation.base.ui.ConstrainedTextureView r0 = r9.A0C
            r1.removeView(r0)
            r0 = 0
            r9.A0C = r0
            return
        L_0x0065:
            X.8ZX r0 = r9.A0H
            if (r0 == 0) goto L_0x006c
            r0.DHZ(r9)
        L_0x006c:
            boolean r0 = r9.A0Y
            if (r0 == 0) goto L_0x0010
            r4 = 1
            boolean r0 = r9.A1N
            if (r0 == 0) goto L_0x0088
            com.google.android.material.appbar.AppBarLayout r1 = r9.A0A
            if (r1 == 0) goto L_0x0088
            r0 = 13
            r1.A03 = r0
            r1.requestLayout()
            r9.A0Q = r4
        L_0x0082:
            r9.A05()
            r9.A0Y = r6
            return
        L_0x0088:
            r9.A0U = r4
            r9.A06()
            r7.A06(r2)
            goto L_0x0082
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JW7.DmC(X.2cs):void");
    }

    public final void DmD(2cs r1) {
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [com.instagram.creation.photo.crop.CropImageView] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DmE(X.2cs r4) {
        /*
            r3 = this;
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.2cs r0 = r3.A0u
            if (r4 != r0) goto L_0x000c
            r3.A07(r4)
        L_0x000b:
            return
        L_0x000c:
            X.2cs r0 = r3.A0v
            if (r4 != r0) goto L_0x001f
            X.2ct r0 = r4.A09
            double r1 = r0.A00
            int r0 = (int) r1
            r3.setChildViewTranslationY(r0)
            r3.A07(r4)
            A0E(r3)
            return
        L_0x001f:
            X.2cs r0 = r3.A0t
            if (r4 != r0) goto L_0x002d
            com.instagram.creation.photo.crop.CropImageView r1 = r3.A1D
        L_0x0025:
            float r0 = X.JTO.A03(r4)
            r1.setAlpha(r0)
            return
        L_0x002d:
            X.2cs r0 = r3.A0w
            if (r4 != r0) goto L_0x0036
            com.instagram.creation.capture.video.view.IgCaptureVideoPreviewView r1 = r3.A0J
            if (r1 == 0) goto L_0x000b
            goto L_0x0025
        L_0x0036:
            X.2cs r0 = r3.A0r
            if (r4 != r0) goto L_0x003d
            android.widget.ImageView r1 = r3.A0p
            goto L_0x0025
        L_0x003d:
            X.2cs r0 = r3.A0s
            if (r4 != r0) goto L_0x000b
            android.widget.FrameLayout r1 = r3.A0o
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JW7.DmE(X.2cs):void");
    }

    public final /* synthetic */ void Dq9(float f, float f2) {
    }

    public final /* synthetic */ void DqB(Tab tab) {
    }

    public final /* synthetic */ void Du1(C53401GnY gnY) {
    }

    public final /* synthetic */ void Du4() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0060, code lost:
        if (r1 != 5) goto L_0x0062;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            r5 = 0
            X.0qQ.A0B(r10, r5)
            android.view.View r0 = r9.A0m
            android.graphics.Rect r8 = r9.A1Q
            r0.getHitRect(r8)
            float r0 = r10.getX()
            int r1 = (int) r0
            float r0 = r10.getY()
            int r0 = (int) r0
            boolean r2 = r8.contains(r1, r0)
            android.view.ViewGroup r0 = r9.A0n
            r0.getHitRect(r8)
            float r0 = r10.getX()
            int r1 = (int) r0
            float r0 = r10.getY()
            int r0 = (int) r0
            boolean r6 = r8.contains(r1, r0)
            android.view.View r7 = r9.A0b
            if (r7 == 0) goto L_0x0117
            com.instagram.common.session.UserSession r4 = r9.A0z
            X.0Tu r3 = X.0Tu.A05
            r0 = 36321060954383406(0x8109d0000d242e, double:3.032923428500877E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x0117
            r7.getHitRect(r8)
            float r0 = r10.getX()
            int r1 = (int) r0
            float r0 = r10.getY()
            int r0 = (int) r0
            boolean r0 = r8.contains(r1, r0)
        L_0x0050:
            int r1 = r10.getActionMasked()
            r4 = 1
            if (r1 == 0) goto L_0x00e9
            if (r1 == r4) goto L_0x00b3
            r0 = 2
            if (r1 == r0) goto L_0x00aa
            r0 = 3
            if (r1 == r0) goto L_0x00b3
            r0 = 5
            if (r1 == r0) goto L_0x00f3
        L_0x0062:
            boolean r0 = r9.A1N
            if (r0 == 0) goto L_0x00a5
            com.instagram.creation.capture.gallery.ui.GalleryPickerCoordinatorLayout r5 = r9.A0E
            if (r5 == 0) goto L_0x00a5
            boolean r1 = r9.A0S
            if (r1 != 0) goto L_0x008c
            boolean r0 = r9.A0b()
            if (r0 == 0) goto L_0x008c
            boolean r0 = r9.A0X
            if (r0 == 0) goto L_0x008c
            boolean r0 = r9.A0V
            if (r0 != 0) goto L_0x008c
            r0 = 4
            r9.setScrollFlag(r0)
            X.JW8 r0 = r9.A14
            X.JWk r0 = r0.A0I
            androidx.recyclerview.widget.RecyclerView r0 = r0.A00
            r0.A0l()
            r9.A0S = r4
            r1 = 1
        L_0x008c:
            boolean r0 = r9.A0i
            if (r0 != 0) goto L_0x00a5
            if (r1 == 0) goto L_0x00a5
            android.view.View r3 = r5.A02
            android.view.View r2 = r5.A03
            if (r3 == 0) goto L_0x00a3
            if (r2 == 0) goto L_0x00a3
            int r1 = r5.A00
            int r0 = r5.A01
            r5.DmW(r3, r2, r1, r0)
            r5.A04 = r4
        L_0x00a3:
            r9.A0i = r4
        L_0x00a5:
            boolean r0 = super.dispatchTouchEvent(r10)
            return r0
        L_0x00aa:
            boolean r0 = r9.A0k
            if (r0 != 0) goto L_0x0062
            r0 = r2 ^ 1
            r9.A0k = r0
            goto L_0x0062
        L_0x00b3:
            r9.A0X = r5
            r9.A0V = r5
            r9.A0k = r5
            r9.A0W = r5
            r9.A0j = r5
            boolean r0 = r9.A1N
            if (r0 == 0) goto L_0x0062
            r0 = 2
            r9.setScrollFlag(r0)
            r9.A0S = r5
            com.instagram.creation.capture.gallery.ui.GalleryPickerCoordinatorLayout r1 = r9.A0E
            if (r1 == 0) goto L_0x00d6
            boolean r0 = r9.A0P
            if (r0 != 0) goto L_0x00d3
            boolean r0 = r9.A0O
            if (r0 == 0) goto L_0x00d6
        L_0x00d3:
            r9.A05()
        L_0x00d6:
            if (r1 == 0) goto L_0x00e5
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x00e5
            android.view.View r0 = r1.A03
            if (r0 == 0) goto L_0x00e3
            r1.onStopNestedScroll(r0)
        L_0x00e3:
            r1.A04 = r5
        L_0x00e5:
            r9.A0i = r5
            goto L_0x0062
        L_0x00e9:
            r9.A0X = r4
            r9.A0U = r5
            r9.A0V = r2
            r9.A0W = r6
            r9.A0j = r0
        L_0x00f3:
            boolean r0 = A0Q(r9)
            if (r0 == 0) goto L_0x0062
            boolean r0 = r9.A0W
            if (r0 == 0) goto L_0x0062
            int r0 = r10.getPointerCount()
            if (r0 <= r4) goto L_0x0062
            com.instagram.common.session.UserSession r3 = r9.A0z
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318625707137354(0x8107990001194a, double:3.0313833683365204E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0062
            A0L(r9, r5)
            goto L_0x0062
        L_0x0117:
            r0 = 0
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JW7.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        this.A03 = 0.0f;
        this.A0L = false;
        this.A0M = false;
        this.A01 = motionEvent.getRawY();
        this.A0Z = 0.0f;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        if (r5.A0j != false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
        if (r5.A0W == false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        if (r5.A14.A0A() != 0) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            r1 = 0
            X.0qQ.A0B(r6, r1)
            android.view.GestureDetector r0 = r5.A1R
            r0.onTouchEvent(r6)
            boolean r0 = r5.A1N
            r4 = 0
            if (r0 == 0) goto L_0x000f
            return r1
        L_0x000f:
            A0E(r5)
            boolean r0 = r5.A0b()
            if (r0 == 0) goto L_0x002b
            float r1 = r6.getRawY()
            float r0 = r5.A01
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x002b
            X.JW8 r0 = r5.A14
            int r0 = r0.A0A()
            r3 = 1
            if (r0 == 0) goto L_0x002c
        L_0x002b:
            r3 = 0
        L_0x002c:
            boolean r0 = r5.A0V
            if (r0 == 0) goto L_0x0034
            boolean r0 = r5.A0k
            if (r0 != 0) goto L_0x0039
        L_0x0034:
            boolean r0 = r5.A0j
            r2 = 0
            if (r0 == 0) goto L_0x003a
        L_0x0039:
            r2 = 1
        L_0x003a:
            boolean r0 = r5.A0b()
            if (r0 == 0) goto L_0x0045
            boolean r0 = r5.A0W
            r1 = 1
            if (r0 != 0) goto L_0x0046
        L_0x0045:
            r1 = 0
        L_0x0046:
            boolean r0 = r5.A0M
            if (r0 == 0) goto L_0x004e
            if (r3 != 0) goto L_0x0050
            if (r2 != 0) goto L_0x0050
        L_0x004e:
            if (r1 == 0) goto L_0x0051
        L_0x0050:
            r4 = 1
        L_0x0051:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JW7.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        0qQ.A0B(motionEvent2, 1);
        float scaledTouchSlop = (float) ViewConfiguration.get(getContext()).getScaledTouchSlop();
        0qQ.A0A(motionEvent);
        float A002 = AnonymousClass7TE.A00(motionEvent.getRawX(), motionEvent2.getRawX());
        float A003 = AnonymousClass7TE.A00(motionEvent.getRawY(), motionEvent2.getRawY());
        float A004 = (float) JTR.A00(A002, A003);
        float degrees = (float) Math.toDegrees(Math.asin((double) (A003 / A004)));
        if (A004 > scaledTouchSlop && !this.A0L && !this.A0M) {
            if (degrees > 45.0f) {
                this.A0M = true;
            } else {
                this.A0L = true;
            }
        }
        this.A0Z = f2;
        return false;
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        AppBarLayout appBarLayout;
        0qQ.A0B(motionEvent, 0);
        ViewGroup viewGroup = this.A0n;
        Rect rect = this.A1Q;
        viewGroup.getHitRect(rect);
        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        if (!this.A1N || (appBarLayout = this.A0A) == null) {
            this.A0U = false;
            A06();
            this.A0v.A04();
            return true;
        }
        appBarLayout.A03 = 13;
        appBarLayout.requestLayout();
        this.A0Q = true;
        return true;
    }

    private final AnonymousClass3Q2 A01(GalleryItem galleryItem) {
        if (galleryItem == null) {
            return null;
        }
        Map map = this.A1I;
        String str = galleryItem.A0A;
        if (map.containsKey(str)) {
            return (AnonymousClass3Q2) map.get(str);
        }
        if (galleryItem.A09 == AnonymousClass05K.A01) {
            return JTQ.A0M(this.A0z, str);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003b, code lost:
        if (r3.A00() == r0.A01()) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003d, code lost:
        r0 = android.widget.ImageView.ScaleType.FIT_CENTER;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r4.A14.A0F.A07 != false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A02() {
        /*
            r4 = this;
            X.JX2 r3 = r4.A12
            java.lang.Integer r1 = r3.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x0018
            android.widget.ImageView r2 = r4.A0p
            X.JW8 r0 = r4.A14
            X.JWM r0 = r0.A0F
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x003d
        L_0x0012:
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
        L_0x0014:
            r2.setScaleType(r0)
        L_0x0017:
            return
        L_0x0018:
            com.instagram.common.gallery.model.GalleryItem r0 = r4.A0B
            if (r0 == 0) goto L_0x0017
            com.instagram.common.session.UserSession r0 = r4.A0z
            com.instagram.pendingmedia.store.PendingMediaStore r1 = X.28K.A00(r0)
            com.instagram.common.gallery.model.GalleryItem r0 = r4.A0B
            X.0qQ.A0A(r0)
            java.lang.String r0 = r0.A0A
            X.3Q2 r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x0040
            android.widget.ImageView r2 = r4.A0p
            float r1 = r3.A00()
            float r0 = r0.A01()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0012
        L_0x003d:
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            goto L_0x0014
        L_0x0040:
            java.lang.String r2 = "draft_media_not_found"
            java.lang.String r1 = "GalleryPickerView.maybeCropDraftPhoto() draftMedia is null"
            r0 = 0
            X.0kD.A0A(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JW7.A02():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A03() {
        /*
            r5 = this;
            com.instagram.common.gallery.model.GalleryItem r0 = r5.A0B
            if (r0 == 0) goto L_0x005f
            com.instagram.creation.base.ui.ConstrainedTextureView r0 = r5.A0C
            if (r0 == 0) goto L_0x005f
            com.instagram.common.session.UserSession r3 = r5.A0z
            com.instagram.pendingmedia.store.PendingMediaStore r1 = X.28K.A00(r3)
            com.instagram.common.gallery.model.GalleryItem r0 = r5.A0B
            X.0qQ.A0A(r0)
            java.lang.String r0 = r0.A0A
            X.3Q2 r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x006b
            float r4 = r0.A02
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0030
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318419549165689(0x81076900081879, double:3.031252993205108E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r3 = 1
            if (r0 != 0) goto L_0x0031
        L_0x0030:
            r3 = 0
        L_0x0031:
            X.JX2 r2 = r5.A12
            java.lang.Integer r1 = r2.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            boolean r0 = X.AnonymousClass7TF.A1W(r1, r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0060
            X.JW8 r0 = r5.A14
            X.JWM r0 = r0.A0F
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x0068
        L_0x0047:
            if (r3 != 0) goto L_0x0068
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x004f
            float r4 = r1 / r4
        L_0x004f:
            com.instagram.creation.base.ui.ConstrainedTextureView r0 = r5.A0C
            X.0qQ.A0A(r0)
            r0.setScaleX(r4)
            com.instagram.creation.base.ui.ConstrainedTextureView r0 = r5.A0C
            X.0qQ.A0A(r0)
            r0.setScaleY(r4)
        L_0x005f:
            return
        L_0x0060:
            float r0 = r2.A00()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0047
        L_0x0068:
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L_0x004f
        L_0x006b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JW7.A03():void");
    }

    private final void A04() {
        View inflate;
        if (JWE.A04(this.A19) == AnonymousClass36W.PROFILE_PHOTO && C322606w6.A06(this.A0z)) {
            ViewGroup viewGroup = this.A0n;
            ViewStub A0F2 = DbS.A0F(viewGroup, R.id.punched_overlay_stub);
            if (A0F2 == null) {
                inflate = AnonymousClass7TF.A0F(viewGroup, R.id.punched_overlay_view);
            } else {
                inflate = A0F2.inflate();
                0qQ.A0C(inflate, "null cannot be cast to non-null type com.instagram.common.ui.widget.imageview.PunchedOverlayView");
            }
            PunchedOverlayView punchedOverlayView = (PunchedOverlayView) inflate;
            punchedOverlayView.A01 = AnonymousClass7TF.A03(getContext(), R.attr.profileHighlightThumbnailEditBackground);
            punchedOverlayView.post(new M2N(punchedOverlayView));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        if (r1 != X.AnonymousClass05K.A0j) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003a, code lost:
        if (r0 == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r0.A06() == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x006c, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (A0b() == false) goto L_0x001a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0042 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A05() {
        /*
            r9 = this;
            com.instagram.common.gallery.model.GalleryItem r0 = r9.A0B
            r8 = 1
            if (r0 == 0) goto L_0x000c
            boolean r0 = r0.A06()
            r7 = 1
            if (r0 != 0) goto L_0x000d
        L_0x000c:
            r7 = 0
        L_0x000d:
            java.lang.Integer r1 = r9.A0K
            java.lang.Integer r5 = X.AnonymousClass05K.A01
            if (r1 != r5) goto L_0x001a
            boolean r0 = r9.A0b()
            r6 = 1
            if (r0 != 0) goto L_0x0025
        L_0x001a:
            r6 = 0
            if (r1 == r5) goto L_0x0025
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x0025
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            if (r1 != r0) goto L_0x006c
        L_0x0025:
            boolean r0 = r9.A1N
            if (r0 == 0) goto L_0x0063
            boolean r0 = r9.A0P
            if (r0 != 0) goto L_0x0061
            boolean r0 = r9.A0Q
            if (r0 != 0) goto L_0x0061
            boolean r4 = r9.A0b()
        L_0x0035:
            if (r4 == 0) goto L_0x0061
            r0 = 0
        L_0x0038:
            if (r6 != 0) goto L_0x003c
            if (r0 == 0) goto L_0x006c
        L_0x003c:
            boolean r0 = A0S(r9)
            if (r0 == 0) goto L_0x0076
            if (r7 == 0) goto L_0x0076
            if (r8 == 0) goto L_0x0076
            boolean r0 = r9.A0d()
            if (r0 != 0) goto L_0x0076
            com.instagram.common.gallery.model.GalleryItem r0 = r9.A0B
            if (r0 == 0) goto L_0x006e
            java.lang.Integer r0 = r0.A09
            if (r0 != r5) goto L_0x006e
            X.9Pn r0 = r9.A1E
            r0.A03()
            com.instagram.creation.capture.video.view.IgCaptureVideoPreviewView r0 = r9.A0J
            if (r0 == 0) goto L_0x0060
            r0.A04()
        L_0x0060:
            return
        L_0x0061:
            r0 = 1
            goto L_0x0038
        L_0x0063:
            X.2cs r0 = r9.A0v
            double r2 = r0.A01
            r0 = 0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            goto L_0x0035
        L_0x006c:
            r8 = 0
            goto L_0x003c
        L_0x006e:
            com.instagram.creation.capture.video.view.IgCaptureVideoPreviewView r0 = r9.A0J
            if (r0 == 0) goto L_0x007d
            r0.A06()
            goto L_0x007d
        L_0x0076:
            com.instagram.creation.capture.video.view.IgCaptureVideoPreviewView r0 = r9.A0J
            if (r0 == 0) goto L_0x007d
            r0.A04()
        L_0x007d:
            X.9Pn r0 = r9.A1E
            r0.A01()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JW7.A05():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        if (r3.A04() != false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A06() {
        /*
            r9 = this;
            com.instagram.common.gallery.model.GalleryItem r3 = r9.A0B
            if (r3 == 0) goto L_0x0052
            X.JW8 r8 = r9.A14
            X.JWM r2 = r8.A0F
            int r7 = r2.A04(r3)
            r0 = 0
            if (r7 < 0) goto L_0x0044
            androidx.recyclerview.widget.GridLayoutManager r1 = r8.A0A
            int r6 = r1.A00
            java.util.List r0 = r2.A0S
            boolean r5 = X.AnonymousClass7TE.A1b(r0)
            boolean r0 = r3.A02()
            if (r0 != 0) goto L_0x0026
            boolean r0 = r3.A04()
            r4 = 0
            if (r0 == 0) goto L_0x0027
        L_0x0026:
            r4 = 1
        L_0x0027:
            X.6sz r0 = r1.A01
            X.0qQ.A07(r0)
            int r3 = r8.A07
            int r2 = r8.A06
            int r1 = r8.A08
            int r0 = r0.A02(r7, r6)
            if (r5 == 0) goto L_0x0050
            int r3 = r3 + r2
            int r0 = r0 + -1
            if (r4 == 0) goto L_0x0040
            int r3 = r3 + r3
            int r0 = r0 + -1
        L_0x0040:
            int r1 = r1 + r2
            int r0 = r0 * r1
            int r0 = r0 + r3
            int r0 = r0 + r2
        L_0x0044:
            r9.A05 = r0
            X.JW8 r0 = r9.A14
            int r0 = r0.A0A()
            float r0 = (float) r0
            r9.A02 = r0
            return
        L_0x0050:
            r3 = 0
            goto L_0x0040
        L_0x0052:
            r0 = 0
            goto L_0x0044
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JW7.A06():void");
    }

    private final void A07(2cs r15) {
        if (!this.A0X) {
            double d = r15.A03;
            double d2 = r15.A01;
            if (d != d2) {
                if (this.A1N) {
                    if (!this.A0P) {
                        return;
                    }
                } else if (this.A0v.A01 != 0.0d) {
                    return;
                }
                if (!this.A0M && this.A0U) {
                    JW8 jw8 = this.A14;
                    jw8.A0I.A00.scrollBy(0, ((int) Math.floor(AnonymousClass37Q.A04(r15.A09.A00, d, d2, (double) this.A02, (double) this.A05))) - jw8.A0A());
                }
            }
        }
    }

    public static final void A0A(GalleryItem galleryItem, JW7 jw7, boolean z, boolean z2, boolean z3) {
        String str;
        MediaUploadMetadata mediaUploadMetadata;
        MediaUploadMetadata mediaUploadMetadata2;
        Uri A032;
        GalleryItem galleryItem2 = galleryItem;
        Medium medium = galleryItem2.A00;
        if (medium != null) {
            JW7 jw72 = jw7;
            boolean z4 = z;
            jw72.A0Y = z4;
            jw72.A0a(AnonymousClass05K.A00, true);
            IgCaptureVideoPreviewView igCaptureVideoPreviewView = jw72.A0J;
            if (igCaptureVideoPreviewView != null) {
                igCaptureVideoPreviewView.A04();
            }
            if (!z2 && z3) {
                jw72.A0C(galleryItem2, z4);
            }
            MediaUploadMetadata mediaUploadMetadata3 = medium.A0G;
            JW8 jw8 = jw72.A14;
            mediaUploadMetadata3.A01 = jw8.A0B().getName();
            UserSession userSession = jw72.A0z;
            C59847JaN A002 = JW1.A00(userSession);
            JWM jwm = jw8.A0F;
            boolean z5 = jwm.A07;
            boolean A062 = galleryItem2.A06();
            28D r9 = jw72.A0q;
            29E r8 = A002.A0B;
            float[] fArr = null;
            long A033 = r8.A03(288429634, 15000);
            A002.A04 = A033;
            if (z5) {
                str = "multi-media";
            } else if (A062) {
                str = MediaStreamTrack.VIDEO_TRACK_KIND;
            } else {
                str = "image";
            }
            r8.A0A(A033, "media_type", str);
            r8.A0A(A002.A04, "camera_destination", "feed");
            if (r9 != null) {
                JTQ.A1E(r8, r9, A002.A04);
            }
            int i = medium.A08;
            if (i == 1) {
                if (182.A06(0Tu.A05, userSession, 36326167669651011L)) {
                    0nY.A00().ATE(new C59856JaX(medium, jw72));
                } else {
                    mediaUploadMetadata = medium.A0G;
                    mediaUploadMetadata2 = C59778JXx.A03(userSession, medium.A0X);
                    mediaUploadMetadata.A00(mediaUploadMetadata2);
                }
            } else if (i == 3) {
                mediaUploadMetadata = medium.A0G;
                mediaUploadMetadata2 = C59778JXx.A00(AnonymousClass7TE.A0S(jw72), medium.A02(), userSession, medium.A0X);
                mediaUploadMetadata.A00(mediaUploadMetadata2);
            }
            MediaUploadMetadata mediaUploadMetadata4 = medium.A0G;
            if (mediaUploadMetadata4.A0B) {
                C63518KyT.A00.put(medium.A0X, mediaUploadMetadata4);
            }
            if (medium.A08 == 1) {
                JX0 jx0 = jw72.A1B;
                Uri uri = jx0.A01;
                if (!(uri == null || uri == medium.A02())) {
                    jx0.A0A = null;
                }
                jx0.A01 = medium.A02();
                jx0.A08 = medium.A0X;
                Map map = jw72.A1J;
                String str2 = galleryItem2.A0A;
                GalleryPreviewInfo galleryPreviewInfo = (GalleryPreviewInfo) map.get(str2);
                if (galleryPreviewInfo == null) {
                    A032 = Uri.fromFile(0mb.A04(jw72.getContext()));
                } else {
                    String str3 = galleryPreviewInfo.A02;
                    if (str3 != null) {
                        A032 = 0cp.A03(str3);
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                }
                jx0.A02 = A032;
                if (jw72.A0l == null || !0qQ.A0K(str2, jw72.A0d)) {
                    if (jwm.A07 && map.containsKey(str2)) {
                        Object obj = map.get(str2);
                        if (obj != null) {
                            fArr = ((GalleryPreviewInfo) obj).A03;
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    }
                    jx0.A0A = fArr;
                } else {
                    jx0.A0A = jw72.A0l;
                    jw72.A0l = null;
                    jw72.A0d = null;
                }
                int i2 = 0;
                if (z2) {
                    i2 = 54;
                }
                jx0.A00 = i2;
                C59761JWz jWz = jw72.A1C;
                jWz.A03 = jx0;
                jWz.A01();
                C364808m2 r0 = jWz.A05;
                boolean z6 = false;
                if (r0 != null && r0.getWidth() == r0.getHeight()) {
                    z6 = true;
                }
                jw72.A0T = z6;
            } else if (!A0Q(jw72) && igCaptureVideoPreviewView != null) {
                igCaptureVideoPreviewView.setVideoMedium(medium, new C59915Jbe(jw72));
            }
        } else {
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }

    public static final void A0B(GalleryItem galleryItem, JW7 jw7, boolean z, boolean z2, boolean z3) {
        if (galleryItem != null) {
            GalleryItem galleryItem2 = jw7.A0B;
            if (galleryItem2 == null || !galleryItem2.equals(galleryItem)) {
                JWM jwm = jw7.A14.A0F;
                if (jwm.A07) {
                    jw7.A0N(z3);
                }
                jw7.A0B = galleryItem;
                jwm.A02 = galleryItem;
                JX0 jx0 = jw7.A1B;
                jx0.A01 = null;
                jx0.A02 = null;
                jx0.A08 = null;
                jx0.A00 = -1;
                A09(galleryItem, jw7, z, z2);
                jw7.A13.setVisibility(DbW.A01(A0P(jw7) ? 1 : 0));
            }
        }
    }

    private final void A0C(GalleryItem galleryItem, boolean z) {
        boolean z2 = this.A1N;
        if (z2 || this.A0v.A01 == 0.0d) {
            JW8 jw8 = this.A14;
            if (jw8.A04) {
                return;
            }
            if (z) {
                int i = 1;
                this.A0U = true;
                A06();
                2cs r5 = this.A0u;
                if (r5.A01 != 0.0d) {
                    i = 0;
                }
                r5.A06((double) ((float) i));
            } else if (z2) {
                A06();
                jw8.A0I.A00.scrollBy(0, (int) (((float) this.A05) - this.A02));
            } else {
                jw8.A0I.A00.A0o(jw8.A0F.A04(galleryItem));
            }
        }
    }

    public static final void A0E(JW7 jw7) {
        if (!jw7.A0X && jw7.A0b()) {
            2cs r5 = jw7.A0v;
            if (r5.A01 != ((double) jw7.getTopDockPosition())) {
                jw7.A06();
                r5.A06((double) jw7.getTopDockPosition());
                jw7.A05();
            }
        }
    }

    public static final void A0F(JW7 jw7) {
        String str = jw7.A1V;
        if (str != null && jw7.A0N && !jw7.A0g) {
            C361588gT A002 = C361578gS.A00(jw7.A0z);
            0qQ.A0B(A002, 0);
            for (C65796Lzo lzo : AnonymousClass9Q0.A01(JTO.A17(A002.A06))) {
                if (0qQ.A0K(lzo.A01, str)) {
                    jw7.A0g = true;
                    jw7.DSA(lzo);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
        if (X.182.A06(X.0Tu.A05, r6.A0z, 36328834844606071L) == false) goto L_0x0028;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0G(X.JW7 r6) {
        /*
            X.JcD r5 = r6.A0D
            if (r5 == 0) goto L_0x0075
            X.JW8 r0 = r6.A14
            X.JWM r1 = r0.A0F
            boolean r0 = r1.A07
            if (r0 == 0) goto L_0x006d
            java.util.List r4 = r1.A0W
            java.util.List r0 = X.C51966G9m.A1J(r4)
            int r1 = r0.size()
            r0 = 1
            if (r1 > r0) goto L_0x0028
            com.instagram.common.session.UserSession r3 = r6.A0z
            X.0Tu r2 = X.0Tu.A05
            r0 = 36328834844606071(0x8110e200043e77, double:3.037839667980634E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x006d
        L_0x0028:
            java.util.List r1 = X.C51966G9m.A1J(r4)
        L_0x002c:
            X.JTQ.A1K(r1)
            X.8QZ r0 = r5.A01
            X.7Gf r6 = r0.A0R
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r4 = r1.iterator()
        L_0x003b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0072
            java.lang.Object r1 = r4.next()
            com.instagram.common.gallery.model.GalleryItem r1 = (com.instagram.common.gallery.model.GalleryItem) r1
            boolean r0 = r1.A02()
            r3 = 0
            if (r0 == 0) goto L_0x0066
            com.instagram.common.gallery.Medium r2 = r1.A00
            if (r2 == 0) goto L_0x003b
            int r0 = r2.A05
            java.lang.String r0 = java.lang.String.valueOf(r0)
            com.instagram.common.gallery.model.GalleryItem$LocalGalleryMedium r1 = new com.instagram.common.gallery.model.GalleryItem$LocalGalleryMedium
            r1.<init>(r2, r0)
        L_0x005d:
            X.9SZ r0 = new X.9SZ
            r0.<init>(r1, r3)
            r5.add(r0)
            goto L_0x003b
        L_0x0066:
            boolean r0 = r1.A04()
            if (r0 == 0) goto L_0x003b
            goto L_0x005d
        L_0x006d:
            java.util.List r1 = java.util.Collections.emptyList()
            goto L_0x002c
        L_0x0072:
            r6.EaZ(r5)
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JW7.A0G(X.JW7):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.creation.photo.crop.CropImageView, android.view.View] */
    public static final void A0H(JW7 jw7) {
        float f;
        float A002;
        Bitmap createBitmap;
        GalleryItem galleryItem = jw7.A0B;
        GalleryPreviewMultiselectPager galleryPreviewMultiselectPager = jw7.A0I;
        if (galleryPreviewMultiselectPager != null && galleryItem != null) {
            ? r2 = jw7.A1D;
            int width = r2.getWidth();
            int height = r2.getHeight();
            if (width > 0 && height > 0) {
                r2.A0O(false, false);
                Bitmap A0B2 = AnonymousClass7TF.A0B(width, height);
                r2.draw(JTO.A0B(A0B2));
                JX2 jx2 = jw7.A12;
                if (jx2.A00() != 1.0f) {
                    int width2 = A0B2.getWidth();
                    int height2 = A0B2.getHeight();
                    Integer num = jx2.A03;
                    Integer num2 = AnonymousClass05K.A00;
                    if (num == num2) {
                        f = (float) width2;
                        A002 = ((float) height2) * jx2.A00();
                    } else {
                        f = (float) height2;
                        A002 = ((float) width2) / jx2.A00();
                    }
                    int i = ((int) (f - A002)) / 2;
                    if (num == AnonymousClass05K.A01) {
                        int height3 = A0B2.getHeight() - (i * 2);
                        int width3 = A0B2.getWidth();
                        0fO.A03(A0B2);
                        createBitmap = Bitmap.createBitmap(A0B2, 0, i, width3, height3);
                    } else if (num == num2) {
                        int width4 = A0B2.getWidth() - (i * 2);
                        int height4 = A0B2.getHeight();
                        0fO.A03(A0B2);
                        createBitmap = Bitmap.createBitmap(A0B2, i, 0, width4, height4);
                    }
                    A0B2.recycle();
                    if (createBitmap != null) {
                        A0B2 = createBitmap;
                    }
                }
                galleryPreviewMultiselectPager.setPrerenderedImageData(galleryItem, A0B2);
            }
        }
    }

    public static final void A0I(JW7 jw7) {
        ArrayList A1D2 = AnonymousClass7TE.A1D(C51966G9m.A1J(jw7.A14.A0F.A0W));
        JX9 A002 = JWX.A00(jw7.A0z);
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        Iterator it = A1D2.iterator();
        while (it.hasNext()) {
            A1C2.add(((GalleryItem) it.next()).A0A);
        }
        A002.A01 = jw7.getCurrentFolderIdForSave();
        List list = A002.A03;
        list.clear();
        list.addAll(A1C2);
    }

    public static final void A0J(JW7 jw7) {
        Float f;
        JX2 jx2;
        JWM jwm = jw7.A14.A0F;
        GalleryItem galleryItem = (GalleryItem) 00k.A0J(jwm.A0W);
        if (galleryItem != null) {
            C3499682q r4 = jw7.A19;
            AnonymousClass514 ANP = r4.ANP();
            AnonymousClass514 r3 = AnonymousClass514.ORIGINAL;
            if (AnonymousClass7TF.A1W(ANP, r3) || !jwm.A07) {
                JX2 jx22 = jw7.A12;
                AnonymousClass7TH.A0R(jx22.A01);
                jx22.A03 = AnonymousClass05K.A0C;
                jw7.setCropImageAspectRatio(1.0f);
                jw7.setVideoAspectRatio(jx22.A00());
                A0D(r4.ANP(), jw7, true);
            } else {
                if (jw7.A0O(galleryItem)) {
                    jx2 = jw7.A12;
                    AnonymousClass7TH.A0R(jx2.A01);
                    jx2.A03 = AnonymousClass05K.A0C;
                    jw7.setCropImageAspectRatio(1.0f);
                    A0D(r4.ANP(), jw7, true);
                } else {
                    float A002 = A00(galleryItem, jw7);
                    if (A002 < 0.8f) {
                        A002 = 0.8f;
                    }
                    jx2 = jw7.A12;
                    ViewGroup viewGroup = jw7.A0n;
                    jx2.A01(viewGroup.getWidth(), viewGroup.getHeight(), A002);
                    jw7.setCropImageAspectRatio(A002);
                }
                jw7.setVideoAspectRatio(jx2.A00());
                jw7.A04 = jx2.A00();
            }
            if (r4.ANP() == r3 || !jwm.A07) {
                f = null;
            } else {
                float f2 = 1.0f;
                if (!jw7.A0O(galleryItem)) {
                    if (jw7.A1C.A06) {
                        f2 = jw7.A1D.getCurrentScale();
                    } else {
                        f2 = A00(galleryItem, jw7);
                        if (f2 >= 1.0f) {
                            f2 = 1.0f / f2;
                        }
                    }
                }
                jw7.A00 = f2;
                f = Float.valueOf(f2);
            }
            jw7.setForcedMinZoom(f);
            if (galleryItem.A09 != AnonymousClass05K.A01) {
                return;
            }
            if (galleryItem.A06()) {
                jw7.A03();
            } else {
                jw7.A02();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [com.instagram.creation.photo.crop.CropImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v6, types: [com.instagram.creation.photo.crop.CropImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v9, types: [com.instagram.creation.photo.crop.CropImageView, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0058, code lost:
        if (r2 != false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r5.A0d() != false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0L(X.JW7 r5, boolean r6) {
        /*
            com.instagram.creation.capture.gallery.ui.preview.GalleryPreviewMultiselectPager r3 = r5.A0I
            r4 = 0
            if (r6 == 0) goto L_0x0012
            int r0 = r5.getSelectedMediaCount()
            if (r0 <= 0) goto L_0x0012
            boolean r0 = r5.A0d()
            r2 = 1
            if (r0 == 0) goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            if (r3 == 0) goto L_0x003a
            r1 = 8
            if (r2 != 0) goto L_0x004c
            boolean r0 = r5.A0d()
            if (r0 != 0) goto L_0x004c
            com.instagram.common.gallery.model.GalleryItem r0 = r5.A0B
            if (r0 == 0) goto L_0x003b
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x003b
            com.instagram.creation.capture.video.view.IgCaptureVideoPreviewView r0 = r5.A0J
            if (r0 == 0) goto L_0x0030
            r0.setVisibility(r4)
        L_0x0030:
            com.instagram.creation.photo.crop.CropImageView r0 = r5.A1D
            r0.setVisibility(r1)
        L_0x0035:
            r4 = 8
        L_0x0037:
            r3.setVisibility(r4)
        L_0x003a:
            return
        L_0x003b:
            com.instagram.common.gallery.model.GalleryItem r0 = r5.A0B
            if (r0 == 0) goto L_0x0035
            com.instagram.creation.capture.video.view.IgCaptureVideoPreviewView r0 = r5.A0J
            if (r0 == 0) goto L_0x0046
            r0.setVisibility(r1)
        L_0x0046:
            com.instagram.creation.photo.crop.CropImageView r0 = r5.A1D
            r0.setVisibility(r4)
            goto L_0x0035
        L_0x004c:
            com.instagram.creation.capture.video.view.IgCaptureVideoPreviewView r0 = r5.A0J
            if (r0 == 0) goto L_0x0053
            r0.setVisibility(r1)
        L_0x0053:
            com.instagram.creation.photo.crop.CropImageView r0 = r5.A1D
            r0.setVisibility(r1)
            if (r2 == 0) goto L_0x0035
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JW7.A0L(X.JW7, boolean):void");
    }

    private final void A0N(boolean z) {
        AnonymousClass3Q2 r0;
        RemoteMedia remoteMedia;
        Medium A012;
        GalleryItem galleryItem = this.A0B;
        if (galleryItem != null && !galleryItem.A06()) {
            Map map = this.A1I;
            String str = galleryItem.A0A;
            if (AnonymousClass7TF.A1P(map.containsKey(str) ? 1 : 0)) {
                r0 = A01(galleryItem);
                if (r0 == null) {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            } else {
                Integer num = galleryItem.A09;
                if (num == AnonymousClass05K.A00) {
                    GalleryPreviewInfo galleryPreviewInfoFromCropController = getGalleryPreviewInfoFromCropController();
                    if (galleryPreviewInfoFromCropController != null) {
                        this.A1J.put(str, galleryPreviewInfoFromCropController);
                        if (this.A19.ANP() != AnonymousClass514.ORIGINAL && z) {
                            A0H(this);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (num == AnonymousClass05K.A0C) {
                    GalleryPreviewInfo galleryPreviewInfoFromCropController2 = getGalleryPreviewInfoFromCropController();
                    if (galleryPreviewInfoFromCropController2 != null && (remoteMedia = galleryItem.A04) != null && (A012 = this.A1G.A01(remoteMedia)) != null) {
                        this.A1J.put(String.valueOf(A012.A05), galleryPreviewInfoFromCropController2);
                        return;
                    }
                    return;
                } else if (num == AnonymousClass05K.A01) {
                    r0 = JTQ.A0M(this.A0z, str);
                    if (r0 == null) {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else {
                    return;
                }
            }
            A0M(r0, str);
        }
    }

    public static final boolean A0Q(JW7 jw7) {
        if (!jw7.A14.A0F.A07 || jw7.A0I == null) {
            return false;
        }
        return true;
    }

    public static final boolean A0R(JW7 jw7) {
        if (((JWE) jw7.A19).A01.A0M || jw7.A1P) {
            return true;
        }
        return false;
    }

    public static final boolean A0S(JW7 jw7) {
        if (!jw7.A0f || !jw7.isAttachedToWindow()) {
            return false;
        }
        if (jw7.A1P || 0qQ.A0K(jw7.A14.A02, JXL.A00)) {
            return true;
        }
        return false;
    }

    public static final boolean A0T(JW7 jw7) {
        if (JWE.A04(jw7.A19) == AnonymousClass36W.FOLLOWERS_SHARE) {
            if (!182.A06(0Tu.A05, jw7.A0z, 36325222776976106L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    private final float getAlbumAspectRatio() {
        Medium medium;
        C3499682q r3 = this.A19;
        AnonymousClass514 ANP = r3.ANP();
        GalleryItem galleryItem = (GalleryItem) 00k.A0J(this.A14.A0F.A0W);
        if (galleryItem != null) {
            medium = galleryItem.A00;
        } else {
            medium = null;
        }
        if (ANP == AnonymousClass514.ORIGINAL) {
            if (medium == null || this.A1P) {
                return r3.AAx();
            }
            return medium.A00();
        } else if (A0T(this)) {
            return ANP.A00;
        } else {
            return this.A12.A00();
        }
    }

    private final int getCameraOptionsHolderBottomPadding() {
        HorizontalScrollView horizontalScrollView = this.A0c;
        if (horizontalScrollView != null) {
            return horizontalScrollView.getHeight();
        }
        return 0;
    }

    private final View getFolderMenuTooltipAnchor() {
        TriangleSpinner triangleSpinner = this.A14.A0I.A02.A03.A01;
        if (triangleSpinner == null) {
            triangleSpinner = this.A11.A01;
        }
        return triangleSpinner;
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [com.instagram.creation.capture.gallery.GalleryPreviewInfo, java.lang.Object] */
    private final GalleryPreviewInfo getGalleryPreviewInfoFromCropController() {
        String str;
        String str2;
        JX0 jx0 = this.A1B;
        Uri uri = jx0.A02;
        if (uri == null || uri.getPath() == null) {
            return null;
        }
        Uri uri2 = jx0.A02;
        0qQ.A0A(uri2);
        String path = uri2.getPath();
        C59761JWz jWz = this.A1C;
        C364808m2 r0 = jWz.A05;
        if (r0 != null) {
            str = r0.AvM();
        } else {
            str = null;
        }
        if (!0qQ.A0K(path, str)) {
            return null;
        }
        ? obj = new Object();
        obj.A03 = null;
        obj.A02 = null;
        obj.A00 = null;
        obj.A01 = null;
        obj.A03 = this.A1D.getCropMatrixValues();
        obj.A00 = jWz.A00();
        C364808m2 r02 = jWz.A05;
        if (r02 != null) {
            str2 = r02.AvM();
        } else {
            str2 = null;
        }
        obj.A02 = str2;
        obj.A01 = jWz.A04;
        return obj;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.creation.photo.crop.CropImageView, android.view.View] */
    private final float getTargetPosition() {
        float A032 = AnonymousClass7TE.A03(this.A1D);
        float f = this.A03;
        if (f == 0.0f) {
            if (this.A0v.A09.A00 <= ((double) (A032 / 2.0f))) {
                return 0.0f;
            }
        } else if (f >= 0.0f) {
            return 0.0f;
        }
        return getTopDockPosition();
    }

    private final float getTopDockPosition() {
        float A032;
        int height = this.A0n.getHeight();
        if (182.A06(0Tu.A05, this.A0z, 36321060954383406L)) {
            float f = (float) height;
            if (!this.A1P) {
                return f + ((float) this.A06);
            }
            return f;
        }
        RecyclerView recyclerView = this.A14.A0I.A00;
        if (recyclerView.getChildCount() == 0) {
            A032 = 0.0f;
        } else {
            View childAt = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
            float top = (float) (childAt.getTop() + childAt.getHeight());
            A032 = AnonymousClass7TE.A03(recyclerView);
            if (A032 > top) {
                A032 = top;
            }
        }
        float f2 = (float) height;
        float f3 = A032 + f2;
        if (!this.A1P) {
            f3 += (float) this.A06;
        }
        return Math.min(Math.max(f3 - ((float) (getHeight() - this.A0a)), 0.0f), f2);
    }

    private final void setChildViewTranslationY(int i) {
        if (!this.A1N && !A0d()) {
            AnonymousClass8ZX r1 = this.A0H;
            if (r1 != null) {
                r1.DHY(this, -((float) i));
            }
            int i2 = -i;
            float f = (float) i2;
            this.A0n.setTranslationY(f);
            setUnifiedCameraOptionsHolderTranslationY(i2);
            this.A09 = new C53368Gms(i2, this.A09.A00, 9);
            if (182.A06(0Tu.A05, this.A0z, 36321060954383406L)) {
                View view = this.A0m;
                view.setTranslationY((float) this.A09.A01);
                C53368Gms gms = this.A09;
                0nA.A0X(view, Math.max(gms.A00 + gms.A01, 0));
                return;
            }
            this.A0m.setTranslationY(f);
        }
    }

    private final void setCropImageAspectRatio(float f) {
        this.A1D.A00 = f;
        GalleryPreviewMultiselectPager galleryPreviewMultiselectPager = this.A0I;
        if (A0Q(this) && galleryPreviewMultiselectPager != null) {
            galleryPreviewMultiselectPager.setCropImageAspectRatio(f);
        }
    }

    public static /* synthetic */ void setCropType$default(JW7 jw7, AnonymousClass514 r2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        A0D(r2, jw7, z);
    }

    public static /* synthetic */ void setCurrentFolderAndSelectedItems$default(JW7 jw7, int i, List list, Integer num, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            num = null;
        }
        jw7.A0Z(num, list, i);
    }

    private final void setForcedMinZoom(Float f) {
        CropImageView cropImageView = this.A1D;
        if (f == null) {
            cropImageView.A04 = false;
            cropImageView.A02 = cropImageView.A01;
            return;
        }
        cropImageView.setForcedMinZoom(f.floatValue());
    }

    private final void setScrollFlag(int i) {
        ViewGroup.LayoutParams layoutParams = this.A0n.getLayoutParams();
        0qQ.A0C(layoutParams, C66579MXk.A00(994));
        ((C298055sn) layoutParams).A00 = i | 1 | 16;
    }

    private final void setUnifiedCameraOptionsHolderTranslationY(int i) {
        HorizontalScrollView horizontalScrollView = this.A0c;
        if (horizontalScrollView != null) {
            horizontalScrollView.setTranslationY((float) i);
        }
    }

    private final void setVideoAspectRatio(float f) {
        IgCaptureVideoPreviewView igCaptureVideoPreviewView = this.A0J;
        if (igCaptureVideoPreviewView != null) {
            igCaptureVideoPreviewView.setAspectRatio(f);
        }
        GalleryPreviewMultiselectPager galleryPreviewMultiselectPager = this.A0I;
        if (A0Q(this) && galleryPreviewMultiselectPager != null) {
            galleryPreviewMultiselectPager.setVideoPreviewAspectRatio(f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0068, code lost:
        if (X.182.A06(r2, r3, 36331205666358224L) == false) goto L_0x006a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0U() {
        /*
            r5 = this;
            com.instagram.common.session.UserSession r3 = r5.A0z
            X.JX9 r0 = X.JWX.A00(r3)
            boolean r0 = r0.A02
            r4 = 0
            if (r0 != 0) goto L_0x0076
            boolean r0 = r5.A0h
            if (r0 == 0) goto L_0x004c
            r5.A0h = r4
        L_0x0011:
            r5.A0f = r4
            r5.A05()
            X.JWe r2 = r5.A16
            java.lang.Runnable r1 = r2.A01
            if (r1 == 0) goto L_0x0021
            android.os.Handler r0 = r2.A03
            r0.removeCallbacks(r1)
        L_0x0021:
            X.5Gv r0 = r2.A00
            if (r0 == 0) goto L_0x0028
            r0.A08(r4)
        L_0x0028:
            X.JW8 r2 = r5.A14
            X.JWk r0 = r2.A0I
            androidx.recyclerview.widget.RecyclerView r1 = r0.A00
            X.2nK r0 = r2.A0L
            r1.A16(r0)
            X.8XW r0 = r2.A0O
            r0.A08()
            X.JX9 r1 = X.JWX.A00(r3)
            X.JX2 r0 = r5.A12
            float r0 = r0.A00()
            r1.A00 = r0
            X.27r r0 = X.27p.A01(r3)
            r0.A0X()
            return
        L_0x004c:
            boolean r0 = r5.A1P
            if (r0 == 0) goto L_0x006a
            X.0Tu r2 = X.DbS.A0J(r3, r4)
            r0 = 36320425299091879(0x81093c000b21a7, double:3.032521437534937E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0011
            r0 = 36331205666358224(0x81130a000143d0, double:3.0393389852032285E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0011
        L_0x006a:
            X.JX9 r1 = X.JWX.A00(r3)
            java.util.List r0 = r1.A03
            r0.clear()
            r0 = 0
            r1.A01 = r0
        L_0x0076:
            X.JX9 r0 = X.JWX.A00(r3)
            r0.A02 = r4
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JW7.A0U():void");
    }

    public final void A0W(L0A l0a) {
        String str;
        JW8 jw8 = this.A14;
        Integer num = jw8.A03;
        Integer num2 = AnonymousClass05K.A01;
        if (num == num2) {
            List A1J2 = C51966G9m.A1J(jw8.A0F.A0W);
            if (!A1J2.isEmpty() && !((GalleryItem) A1J2.get(0)).A06()) {
                JW1.A00(this.A0z).A04(this.A0q);
            }
            AnonymousClass72U.A00((Activity) 0mE.A01(getContext(), FragmentActivity.class), this.A0z).A0L();
        }
        if (this.A0B != null && (this.A0K != AnonymousClass05K.A00 || A0d())) {
            JWM jwm = jw8.A0F;
            if (jwm.A07) {
                A0N(true);
            }
            ArrayList A1D2 = AnonymousClass7TE.A1D(C51966G9m.A1J(jwm.A0W));
            List A002 = C64151LQo.A00(A1D2);
            if (!A002.isEmpty()) {
                C394949yx.A00(AnonymousClass7TE.A0S(this), this.A1A, A002, new MJ9(11, A1D2, this));
            } else {
                A0X(l0a, A1D2, false);
            }
        } else if (jw8.A03 == num2) {
            C59847JaN A003 = JW1.A00(this.A0z);
            if (this.A0B == null) {
                str = "Preview item does not exist";
            } else {
                str = "PreviewState not set";
            }
            A003.A07(str);
        }
    }

    public final boolean A0b() {
        if (this.A1N) {
            return this.A0O;
        }
        if (this.A0v.A01 == 0.0d) {
            return false;
        }
        return true;
    }

    public final boolean A0e() {
        if (this.A1P) {
            AnonymousClass6SR A012 = AnonymousClass6SR.A01();
            A012.A0M = false;
            A012.A0R = false;
            A012.A0J = false;
            A012.A0I = false;
            A012.A0P = false;
            A012.A0K = false;
            A012.A06 = 0;
            A012.A05 = 0;
        }
        AnonymousClass4DR A0R2 = ((FragmentActivity) 0mE.A01(getContext(), FragmentActivity.class)).getSupportFragmentManager().A0R(K6F.__redex_internal_original_name);
        if (A0R2 == null || !A0R2.onBackPressed()) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ boolean Cdb() {
        return false;
    }

    public final void D0W() {
        C59862Jae.A00(false, "photo");
        JW1.A00(this.A0z).A09("CropImageController failed to load image");
    }

    public final void DFf(Location location, Uri uri, MediaUploadMetadata mediaUploadMetadata, CropInfo cropInfo, String str, String str2, HashMap hashMap, int i, int i2) {
        Context context = getContext();
        C273544ml r0 = (C273544ml) 0mE.A00(context, C273544ml.class);
        Location location2 = location;
        Uri uri2 = uri;
        MediaUploadMetadata mediaUploadMetadata2 = mediaUploadMetadata;
        CropInfo cropInfo2 = cropInfo;
        String str3 = str;
        String str4 = str2;
        int i3 = i;
        int i4 = i2;
        if (r0 != null) {
            r0.DFf(location2, uri2, mediaUploadMetadata2, cropInfo2, str3, str4, hashMap, i3, i4);
            return;
        }
        CreationSession A002 = JWE.A00(this);
        if (A002.A0M) {
            this.A1C.A07 = false;
            LI1.A00((Activity) 0mE.A01(context, Activity.class), location2, uri2, this.A0q, mediaUploadMetadata2, this.A0z, cropInfo2, this.A18, A002.A09, A002.A0B, str3, str4, i3, i4, false, A002.A0L);
        }
    }

    public final void DqA(Tab tab, Tab tab2) {
        if (0qQ.A0K(tab2, JXL.A00)) {
            C59847JaN A002 = JW1.A00(this.A0z);
            29E r4 = A002.A0B;
            long A032 = r4.A03(288439403, 10000);
            A002.A03 = A032;
            r4.A0A(A032, "camera_destination", "feed");
        }
        JW8 jw8 = this.A14;
        jw8.A02 = tab2;
        A05();
        jw8.A0D();
    }

    public final /* synthetic */ boolean EtH() {
        return false;
    }

    public /* synthetic */ boolean getCanHaveEmptySegments() {
        return false;
    }

    public final List getCombinedFolders() {
        JW8 jw8 = this.A14;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(JW8.A00(jw8));
        arrayList.addAll(AnonymousClass9Q0.A01((List) jw8.A0J.A06.getValue()));
        arrayList.addAll(JW8.A00(jw8));
        return arrayList;
    }

    public Folder getCurrentFolder() {
        return this.A14.A0O.A02;
    }

    public final C357268Xf getCurrentMixedFolder() {
        return this.A14.A0B();
    }

    public final C59743JWb getFolderPickerHelper() {
        return this.A11;
    }

    public List getFolders() {
        JW8 jw8 = this.A14;
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        A1C2.addAll(JW8.A00(jw8));
        A1C2.addAll(JW8.A00(jw8));
        List A0a2 = 00k.A0a(jw8.A0O.A04.values());
        ArrayList A1C3 = AnonymousClass7TE.A1C();
        for (Object next : A0a2) {
            if (((Folder) next).A07) {
                A1C3.add(next);
            }
        }
        A1C2.addAll(A1C3);
        return A1C2;
    }

    public int getSelectedMediaCount() {
        List<GalleryItem> list = this.A14.A0F.A0W;
        ArrayList A0r2 = AnonymousClass7TG.A0r(list);
        for (GalleryItem galleryItem : list) {
            A0r2.add(galleryItem.A0A);
        }
        return A0r2.size();
    }

    public final List getSelectedMediaItems() {
        return this.A1H;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.A03 = f2;
        return false;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        String[] strArr;
        GalleryPickerView$SavedState galleryPickerView$SavedState = (GalleryPickerView$SavedState) parcelable;
        if (galleryPickerView$SavedState != null) {
            super.onRestoreInstanceState(galleryPickerView$SavedState.getSuperState());
            List list = JWX.A00(this.A0z).A03;
            if (list.isEmpty() && (strArr = galleryPickerView$SavedState.A07) != null) {
                if (strArr.length != 0 || !galleryPickerView$SavedState.A05) {
                    list = 03t.A0J(strArr);
                } else {
                    String str = galleryPickerView$SavedState.A02;
                    if (str != null) {
                        list = Collections.singletonList(str);
                    } else {
                        list = Collections.emptyList();
                    }
                    0qQ.A07(list);
                }
            }
            A0Z((Integer) null, list, galleryPickerView$SavedState.A00);
            this.A0d = galleryPickerView$SavedState.A02;
            this.A0l = galleryPickerView$SavedState.A06;
            Map map = this.A1J;
            if (map.isEmpty()) {
                Iterator A0u2 = AnonymousClass7TF.A0u(galleryPickerView$SavedState.A03);
                while (A0u2.hasNext()) {
                    Map.Entry A1J2 = AnonymousClass7TE.A1J(A0u2);
                    Object key = A1J2.getKey();
                    Object value = A1J2.getValue();
                    if (!(key == null || value == null)) {
                        map.put(key, value);
                    }
                }
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (this.A0V) {
            return;
        }
        if (!A0b() || !this.A0W) {
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setCurrentFolderById(int i) {
        if (this.A1M && i != -1) {
            JW8 jw8 = this.A14;
            jw8.A00 = (int) AnonymousClass7TG.A0I();
            jw8.A0G(i);
        }
        AnonymousClass8XW r2 = this.A14.A0O;
        M6I m6i = new M6I(this, i);
        if (r2.A05) {
            m6i.run();
        } else {
            r2.A03 = m6i;
        }
    }

    public void setCurrentFolderByIdAndSelectFirstItem(int i) {
        AnonymousClass8XW r2 = this.A14.A0O;
        boolean z = r2.A05;
        JX6 jx6 = new JX6(this, i, z);
        if (z) {
            jx6.run();
        } else {
            r2.A03 = jx6;
        }
    }

    public final void setCurrentRemoteFolder(C65796Lzo lzo) {
        JW8 jw8 = this.A14;
        0qQ.A0A(lzo);
        if (JW8.A07(jw8)) {
            jw8.A0F.A09("", AnonymousClass7TE.A1C(), JXO.A00);
        }
        jw8.A0F.A08(lzo);
    }

    public final void setFastScrollControllerListener(C41781B0k b0k) {
        JW8 jw8 = this.A14;
        if (b0k != null) {
            jw8.A0N.A03 = b0k;
        }
    }

    public void setTopOffset(int i) {
        if (this.A0a != i) {
            this.A0a = i;
            ViewGroup viewGroup = this.A0n;
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            0qQ.A0C(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Context A0S2 = AnonymousClass7TE.A0S(this);
            if (JWN.A02(A0S2) == AnonymousClass05K.A0N) {
                marginLayoutParams.height = (0nA.A08(A0S2) - this.A0a) - getResources().getDimensionPixelSize(R.dimen.canvas_colour_wheel_offset_y);
                setBackground(new ColorDrawable(2Yu.A0F(A0S2, R.attr.creationTertiaryBackground)));
            }
            viewGroup.setLayoutParams(marginLayoutParams);
            marginLayoutParams.setMargins(0, this.A0a, 0, 0);
            requestLayout();
        }
    }

    public static final float A00(GalleryItem galleryItem, JW7 jw7) {
        int i;
        int i2;
        int i3;
        CropInfo cropInfo;
        ExifImageData exifImageData;
        AnonymousClass3Q2 A012 = jw7.A01(galleryItem);
        boolean A062 = galleryItem.A06();
        if (A012 != null) {
            if (A062) {
                return A012.A02;
            }
            i = A012.A06().width();
            i3 = A012.A06().height();
            i2 = A012.A08;
        } else if (A062) {
            return jw7.A04;
        } else {
            C59761JWz jWz = jw7.A1C;
            if (jWz.A06) {
                CropInfo A002 = jWz.A00();
                if (A002 != null) {
                    Rect rect = A002.A02;
                    ExifImageData exifImageData2 = jWz.A04;
                    if (exifImageData2 != null) {
                        i2 = exifImageData2.A00;
                        i = rect.width();
                        i3 = rect.height();
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            } else {
                GalleryPreviewInfo galleryPreviewInfo = (GalleryPreviewInfo) jw7.A1J.get(galleryItem.A0A);
                if (galleryPreviewInfo == null || (cropInfo = galleryPreviewInfo.A00) == null || (exifImageData = galleryPreviewInfo.A01) == null) {
                    return 1.0f;
                }
                Rect rect2 = cropInfo.A02;
                i2 = exifImageData.A00;
                i = rect2.width();
                i3 = rect2.height();
            }
        }
        float f = (float) i3;
        float f2 = f;
        float f3 = (float) i;
        if (i2 % 180 == 0) {
            f = f3;
            f3 = f2;
        }
        return f / f3;
    }

    public static final void A08(Medium medium, JW7 jw7) {
        String str;
        AnonymousClass6SR A012 = AnonymousClass6SR.A01();
        UserSession userSession = jw7.A0z;
        0qQ.A0A(medium);
        if (medium.CeS()) {
            str = "edit_video";
        } else {
            str = "edit_photo";
        }
        A012.A05(userSession, str);
        if (!TextUtils.isEmpty(medium.A0O)) {
            ((JWE) jw7.A19).A01.A0D = medium.A0O;
        }
        medium.A0G.A01 = jw7.A14.A0B().getName();
        if (medium.A08 == 1) {
            jw7.A1C.A02(AnonymousClass7TE.A0S(jw7), medium.A0G);
            return;
        }
        MediaCaptureConfig mediaCaptureConfig = JWE.A00(jw7).A09;
        if (mediaCaptureConfig == null || !mediaCaptureConfig.A0F) {
            AnonymousClass8H1 r0 = jw7.A10;
            r0.A00 = medium;
            JTQ.A0x(r0.A04, C62544Kha.CLIPS);
            return;
        }
        C358248ab A0Y2 = DbS.A0Y(jw7.getContext());
        A0Y2.A0s(true);
        A0Y2.A09(2131952451);
        A0Y2.A08(2131952448);
        A0Y2.A0I(LV0.A00(medium, jw7, 16), 2131952450);
        A0Y2.A0H((DialogInterface.OnClickListener) null, 2131952449);
        DbT.A1V(A0Y2);
    }

    public static final void A0D(AnonymousClass514 r3, JW7 jw7, boolean z) {
        CreationSession A002 = JWE.A00(jw7);
        A002.A05 = r3;
        GalleryPreviewMultiselectPager galleryPreviewMultiselectPager = jw7.A0I;
        if (galleryPreviewMultiselectPager != null) {
            galleryPreviewMultiselectPager.setVideoCropType(r3);
        }
        if (z) {
            if (jw7.A0K != AnonymousClass05K.A0C || jw7.A0d()) {
                Integer num = jw7.A0K;
                if (num == AnonymousClass05K.A0j) {
                    jw7.A03();
                } else if (num == AnonymousClass05K.A0Y) {
                    jw7.A02();
                } else {
                    CropImageView cropImageView = jw7.A1D;
                    cropImageView.A04 = false;
                    cropImageView.A02 = cropImageView.A01;
                    cropImageView.A0M(C51969G9p.A1a(r3, AnonymousClass514.SQUARE));
                }
            } else {
                IgCaptureVideoPreviewView igCaptureVideoPreviewView = jw7.A0J;
                if (igCaptureVideoPreviewView != null && igCaptureVideoPreviewView.getVisibility() == 0) {
                    igCaptureVideoPreviewView.requestLayout();
                }
            }
            A002.A06 = r3;
        }
        if (A0P(jw7) && A0T(jw7)) {
            jw7.A13.setCropType(r3);
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.creation.capture.gallery.GalleryPreviewInfo, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x007f, code lost:
        if ((r6 % 180) == 0) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0082, code lost:
        r1 = (r2.height() - ((int) (((float) r2.width()) * r1))) / 2;
        r2.top += r1;
        r2.bottom -= r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0048, code lost:
        if ((r6 % 180) != 0) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A0M(X.AnonymousClass3Q2 r8, java.lang.String r9) {
        /*
            r7 = this;
            boolean r0 = r8.A12()
            if (r0 != 0) goto L_0x0078
            com.instagram.creation.photo.util.ExifImageData r4 = new com.instagram.creation.photo.util.ExifImageData
            r4.<init>()
            double r0 = r8.A01
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r4.A02 = r0
            double r0 = r8.A00
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r4.A01 = r0
            int r6 = r8.A08
            r4.A00 = r6
            r0 = 0
            com.instagram.creation.capture.gallery.GalleryPreviewInfo r3 = new com.instagram.creation.capture.gallery.GalleryPreviewInfo
            r3.<init>()
            r3.A03 = r0
            r3.A02 = r0
            r3.A00 = r0
            r3.A01 = r0
            android.graphics.Rect r2 = r8.A06()
            X.JX2 r5 = r7.A12
            java.lang.Integer r0 = r5.A03
            int r1 = r0.intValue()
            r0 = 2
            if (r1 == r0) goto L_0x009b
            r0 = 0
            if (r1 == r0) goto L_0x0079
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r5.A00()
            float r1 = r1 / r0
            int r0 = r6 % 180
            if (r0 == 0) goto L_0x0082
        L_0x004a:
            int r0 = r2.height()
            float r0 = (float) r0
            float r0 = r0 * r1
            int r1 = (int) r0
            int r0 = r2.width()
            int r0 = r0 - r1
            int r1 = r0 / 2
            int r0 = r2.left
            int r0 = r0 + r1
            r2.left = r0
            int r0 = r2.right
            int r0 = r0 - r1
            r2.right = r0
        L_0x0062:
            int r5 = r8.A0H
            int r1 = r8.A0G
            com.instagram.creation.base.CropInfo r0 = new com.instagram.creation.base.CropInfo
            r0.<init>(r2, r5, r1)
            r3.A00 = r0
            java.lang.String r0 = r8.A3Z
            r3.A02 = r0
            r3.A01 = r4
            java.util.Map r0 = r7.A1J
            r0.put(r9, r3)
        L_0x0078:
            return
        L_0x0079:
            float r1 = r5.A00()
            int r0 = r6 % 180
            if (r0 != 0) goto L_0x0082
            goto L_0x004a
        L_0x0082:
            int r0 = r2.width()
            float r0 = (float) r0
            float r0 = r0 * r1
            int r1 = (int) r0
            int r0 = r2.height()
            int r0 = r0 - r1
            int r1 = r0 / 2
            int r0 = r2.top
            int r0 = r0 + r1
            r2.top = r0
            int r0 = r2.bottom
            int r0 = r0 - r1
            r2.bottom = r0
            goto L_0x0062
        L_0x009b:
            boolean r0 = r8.A5U
            if (r0 == 0) goto L_0x0062
            X.JW8 r0 = r7.A14
            X.JWM r0 = r0.A0F
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x0062
            android.graphics.Rect r2 = X.JW0.A02(r2)
            goto L_0x0062
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JW7.A0M(X.3Q2, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0016 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A0O(com.instagram.common.gallery.model.GalleryItem r6) {
        /*
            r5 = this;
            X.3Q2 r4 = r5.A01(r6)
            r1 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            r2 = 1
            boolean r0 = r6.A06()
            if (r4 == 0) goto L_0x0018
            if (r0 == 0) goto L_0x0048
            float r0 = r4.A02
        L_0x0012:
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0017
        L_0x0016:
            r3 = 1
        L_0x0017:
            return r3
        L_0x0018:
            if (r0 == 0) goto L_0x001d
            float r0 = r5.A04
            goto L_0x0012
        L_0x001d:
            X.JWz r1 = r5.A1C
            boolean r0 = r1.A06
            if (r0 == 0) goto L_0x0037
            com.instagram.creation.base.CropInfo r0 = r1.A00()
            if (r0 == 0) goto L_0x0037
            com.instagram.creation.base.CropInfo r0 = r1.A00()
            X.0qQ.A0A(r0)
        L_0x0030:
            android.graphics.Rect r0 = r0.A02
            int r1 = r0.width()
            goto L_0x0054
        L_0x0037:
            java.util.Map r1 = r5.A1J
            java.lang.String r0 = r6.A0A
            java.lang.Object r0 = r1.get(r0)
            com.instagram.creation.capture.gallery.GalleryPreviewInfo r0 = (com.instagram.creation.capture.gallery.GalleryPreviewInfo) r0
            if (r0 == 0) goto L_0x0047
            com.instagram.creation.base.CropInfo r0 = r0.A00
            if (r0 != 0) goto L_0x0030
        L_0x0047:
            return r2
        L_0x0048:
            android.graphics.Rect r0 = r4.A06()
            int r1 = r0.width()
            android.graphics.Rect r0 = r4.A06()
        L_0x0054:
            int r0 = r0.height()
            if (r1 != r0) goto L_0x0017
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JW7.A0O(com.instagram.common.gallery.model.GalleryItem):boolean");
    }

    public static final boolean A0P(JW7 jw7) {
        Integer num;
        GalleryItem galleryItem;
        CreationSession A002 = JWE.A00(jw7);
        AnonymousClass36W r1 = A002.A0A;
        r1.getClass();
        boolean A1W = AnonymousClass7TF.A1W(r1, AnonymousClass36W.PROFILE_PHOTO);
        AnonymousClass36W r12 = A002.A0A;
        r12.getClass();
        boolean A1W2 = AnonymousClass7TF.A1W(r12, AnonymousClass36W.GROUP_PHOTO);
        boolean z = jw7.A14.A0F.A07;
        if (A1W || z || (num = jw7.A0K) == AnonymousClass05K.A0Y || num == AnonymousClass05K.A0j || ((galleryItem = jw7.A0B) != null && galleryItem.A06())) {
            return false;
        }
        if (!jw7.A0T || A1W2) {
            return true;
        }
        return false;
    }

    private final Integer getCurrentFolderIdForSave() {
        if (!A0R(this)) {
            return null;
        }
        UserSession userSession = this.A0z;
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36331205666292687L) || 182.A06(r2, userSession, 36328834844737145L)) {
            return Integer.valueOf(this.A14.A0O.A02.A02);
        }
        return null;
    }

    public final void A0Y(Integer num) {
        JWM jwm;
        Integer num2;
        AnonymousClass6SR.A01().A0P = true;
        int intValue = num.intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                jwm = this.A14.A0F;
                num2 = AnonymousClass05K.A0N;
            } else if (intValue == 3) {
                jwm = this.A14.A0F;
                num2 = AnonymousClass05K.A0C;
            } else {
                throw AnonymousClass7TE.A0z("Invalid ManageButtonState");
            }
            jwm.A0P.A00(num2);
            jwm.A07();
        } else if (JWE.A00(this).A0M) {
            Bundle A0a2 = AnonymousClass7TE.A0a();
            C3499582p r0 = this.A18;
            0qQ.A0B(r0, 1);
            A0a2.putParcelable("previousCreationSession", JWE.A01(r0));
            Context context = getContext();
            DbS.A0b((Activity) 0mE.A01(context, Activity.class), A0a2, this.A0z, ModalActivity.class, C273654mx.A00(808)).A0C(context);
        } else {
            C59888JbD.A01(this.A0z, new KPJ());
        }
    }

    public final boolean A0c() {
        if (A0R(this)) {
            if (!182.A06(0Tu.A05, this.A0z, 36328834844474997L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A0d() {
        if (A0R(this)) {
            if (!182.A06(0Tu.A05, this.A0z, 36328834844409460L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ae, code lost:
        r3 = X.JWE.A00(r15);
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x013a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D7H(int r16, int r17) {
        /*
            r15 = this;
            android.content.Context r9 = r15.getContext()
            java.lang.Class<X.4ml> r0 = X.C273544ml.class
            java.lang.Object r0 = X.0mE.A00(r9, r0)
            X.4ml r0 = (X.C273544ml) r0
            r3 = r16
            r5 = r17
            if (r0 == 0) goto L_0x0015
            r0.D7H(r3, r5)
        L_0x0015:
            X.JW8 r10 = r15.A14
            r10.A0F()
            r4 = 1
            r1 = 0
            boolean r0 = X.AnonymousClass7TF.A1S(r3, r5)
            r15.A0T = r0
            com.instagram.creation.capture.gallery.ui.CropTypeToggleButton r2 = r15.A13
            boolean r0 = A0P(r15)
            int r0 = X.DbW.A01(r0)
            r2.setVisibility(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r15.A0a(r0, r4)
            X.JWz r0 = r15.A1C
            com.instagram.creation.photo.util.ExifImageData r0 = r0.A04
            if (r0 == 0) goto L_0x01d9
            int r0 = r0.A00
            int r2 = r0 % 180
            float r7 = (float) r5
            r5 = r7
            float r0 = (float) r3
            if (r2 != 0) goto L_0x0045
            r7 = r0
            r0 = r5
        L_0x0045:
            float r7 = r7 / r0
            r8 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            boolean r14 = X.AnonymousClass7TF.A1R(r0)
            int r0 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            boolean r13 = X.AnonymousClass7TF.A1Q(r0)
            boolean r0 = A0T(r15)
            if (r0 == 0) goto L_0x01ce
            com.instagram.common.session.UserSession r5 = r15.A0z
            X.0Tu r0 = X.0Tu.A05
            r2 = 36325222777107180(0x810d99000432ec, double:3.035555381949707E-306)
            boolean r0 = X.182.A06(r0, r5, r2)
            if (r0 == 0) goto L_0x01ce
            X.JWM r0 = r10.A0F
            boolean r0 = r0.A07
            if (r0 != 0) goto L_0x01ce
            X.514 r6 = X.AnonymousClass514.ORIGINAL
        L_0x0071:
            X.JWM r11 = r10.A0F
            java.util.List r0 = r11.A0W
            java.lang.Object r2 = X.00k.A0J(r0)
            com.instagram.common.gallery.model.GalleryItem r0 = r15.A0B
            boolean r2 = X.AnonymousClass7TF.A1W(r2, r0)
            boolean r0 = A0T(r15)
            if (r0 == 0) goto L_0x0091
            if (r2 == 0) goto L_0x0091
            X.82q r0 = r15.A19
            float r2 = r6.A00
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r0 = r0.A01
            r0.A00 = r2
        L_0x0091:
            com.instagram.common.session.UserSession r5 = r15.A0z
            X.0Tu r12 = X.DbS.A0J(r5, r1)
            r2 = 36329019528527592(0x81110d00093ee8, double:3.0379564628362664E-306)
            boolean r0 = X.182.A06(r12, r5, r2)
            r10 = 0
            if (r0 == 0) goto L_0x013a
            r2 = 36329019528134373(0x81110d00033ee5, double:3.037956462587593E-306)
            boolean r0 = X.182.A06(r12, r5, r2)
            if (r0 == 0) goto L_0x013a
            com.instagram.creation.base.CreationSession r3 = X.JWE.A00(r15)
            com.instagram.model.creation.MediaCaptureConfig r0 = r3.A09
            if (r0 == 0) goto L_0x013a
            boolean r0 = r0.A08
            if (r0 != r4) goto L_0x013a
            android.view.ViewGroup r1 = r15.A0n
            r0 = 2131438868(0x7f0b2d14, float:1.8499675E38)
            android.view.ViewStub r0 = X.DbS.A0F(r1, r0)
            if (r0 != 0) goto L_0x0130
            r0 = 2131438869(0x7f0b2d15, float:1.8499677E38)
            android.view.View r6 = X.AnonymousClass7TF.A0F(r1, r0)
        L_0x00cc:
            com.instagram.common.ui.widget.imageview.PunchedOverlayView r6 = (com.instagram.common.ui.widget.imageview.PunchedOverlayView) r6
            r0 = 2130970861(0x7f0408ed, float:1.7550444E38)
            int r0 = X.AnonymousClass7TF.A03(r9, r0)
            r6.A01 = r0
            int r2 = r1.getWidth()
            float r1 = (float) r2
            r0 = 1061158912(0x3f400000, float:0.75)
            float r0 = r0 * r1
            float r1 = X.C51967G9n.A00(r1, r0)
            X.M9O r0 = new X.M9O
            r0.<init>(r6, r15, r1, r2)
            r6.post(r0)
            X.514 r0 = X.AnonymousClass514.FOUR_BY_FIVE
            A0D(r0, r15, r4)
            r3.A06 = r0
            float r1 = r0.A00
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00f9
            r8 = r1
        L_0x00f9:
            java.lang.Float r0 = java.lang.Float.valueOf(r8)
            r15.setForcedMinZoom(r0)
            X.JX0 r0 = r15.A1B
            float[] r0 = r0.A0A
            if (r0 != 0) goto L_0x0116
            com.instagram.creation.photo.crop.CropImageView r2 = r15.A1D
            X.514 r1 = r3.A06
            r1.getClass()
            X.514 r0 = X.AnonymousClass514.SQUARE
            boolean r0 = X.C51969G9p.A1a(r1, r0)
            r2.A0M(r0)
        L_0x0116:
            A0H(r15)
            java.lang.String r0 = "photo"
            X.C59862Jae.A00(r4, r0)
            X.JaN r4 = X.JW1.A00(r5)
            X.29E r3 = r4.A0B
            long r1 = r4.A04
            r0 = 288429634(0x11311642, float:1.3969697E-28)
            long r0 = r3.A02(r0, r1)
            r4.A04 = r0
            return
        L_0x0130:
            android.view.View r6 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.ui.widget.imageview.PunchedOverlayView"
            X.0qQ.A0C(r6, r0)
            goto L_0x00cc
        L_0x013a:
            boolean r0 = r15.A0T
            if (r0 == 0) goto L_0x0171
            r15.A04()
            X.514 r0 = X.AnonymousClass514.ORIGINAL
            if (r6 == r0) goto L_0x0153
            X.82q r0 = r15.A19
            X.36W r1 = X.JWE.A04(r0)
            X.36W r0 = X.AnonymousClass36W.PROFILE_PHOTO
            if (r1 == r0) goto L_0x016e
            if (r13 != 0) goto L_0x016e
            X.514 r6 = X.AnonymousClass514.FOUR_BY_FIVE
        L_0x0153:
            boolean r0 = r11.A07
            if (r0 != 0) goto L_0x0116
            com.instagram.creation.base.CreationSession r2 = X.JWE.A00(r15)
            X.36W r1 = r2.A0A
            r1.getClass()
            X.36W r0 = X.AnonymousClass36W.PROFILE_PHOTO
            if (r1 != r0) goto L_0x016c
            X.514 r0 = X.AnonymousClass514.SQUARE
        L_0x0166:
            A0D(r0, r15, r4)
            r2.A06 = r6
            goto L_0x0116
        L_0x016c:
            r0 = r6
            goto L_0x0166
        L_0x016e:
            X.514 r6 = X.AnonymousClass514.SQUARE
            goto L_0x0153
        L_0x0171:
            r15.A04()
            com.instagram.creation.base.CreationSession r9 = X.JWE.A00(r15)
            X.36W r2 = r9.A0A
            r2.getClass()
            X.36W r0 = X.AnonymousClass36W.PROFILE_PHOTO
            if (r2 != r0) goto L_0x0183
            X.514 r6 = X.AnonymousClass514.SQUARE
        L_0x0183:
            boolean r0 = A0T(r15)
            A0D(r6, r15, r0)
            if (r14 == 0) goto L_0x01cb
            java.lang.Integer r7 = X.AnonymousClass05K.A01
        L_0x018e:
            com.instagram.creation.photo.crop.CropImageView r3 = r15.A1D
            r3.A02 = r10
            X.JX2 r6 = r15.A12
            java.lang.Integer r2 = r6.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r2 != r0) goto L_0x01b0
            X.JX0 r0 = r15.A1B
            float[] r0 = r0.A0A
            if (r0 != 0) goto L_0x0116
            X.514 r1 = r9.A06
            r1.getClass()
            X.514 r0 = X.AnonymousClass514.SQUARE
            boolean r1 = X.C51969G9p.A1a(r1, r0)
        L_0x01ab:
            r3.A0M(r1)
            goto L_0x0116
        L_0x01b0:
            boolean r0 = r15.A0T
            if (r0 != 0) goto L_0x01b8
            if (r2 != r7) goto L_0x01b8
            float r8 = r15.A00
        L_0x01b8:
            java.lang.Float r0 = java.lang.Float.valueOf(r8)
            r15.setForcedMinZoom(r0)
            X.JX0 r0 = r15.A1B
            float[] r0 = r0.A0A
            if (r0 != 0) goto L_0x0116
            java.lang.Integer r0 = r6.A03
            if (r7 != r0) goto L_0x01ab
            r1 = 1
            goto L_0x01ab
        L_0x01cb:
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            goto L_0x018e
        L_0x01ce:
            com.instagram.creation.base.CreationSession r0 = X.JWE.A00(r15)
            X.514 r6 = r0.A06
            r6.getClass()
            goto L_0x0071
        L_0x01d9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JW7.D7H(int, int):void");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.creation.photo.crop.CropImageView, android.view.View] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DHr(com.instagram.creation.photo.crop.CropImageView r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L_0x0010
            r1 = 1
            r0.requestDisallowInterceptTouchEvent(r1)
            boolean r0 = r2.A0e
            if (r0 != 0) goto L_0x0010
            r2.A0e = r1
        L_0x0010:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JW7.DHr(com.instagram.creation.photo.crop.CropImageView):void");
    }

    public final 28t getMediaType() {
        if (getSelectedMediaCount() > 1) {
            return 28t.A02;
        }
        GalleryItem galleryItem = (GalleryItem) 00k.A0J(this.A14.A0F.A0W);
        if (galleryItem == null) {
            return 28t.A03;
        }
        if (galleryItem.A06()) {
            return 28t.A06;
        }
        return 28t.A05;
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(1955087710);
        super.onAttachedToWindow();
        JW8 jw8 = this.A14;
        RecyclerView recyclerView = jw8.A0I.A00;
        recyclerView.A15(jw8.A0B);
        if (jw8.A0R) {
            recyclerView.A15(jw8.A0C);
        }
        this.A1D.A03 = this;
        this.A0t.A0A(this);
        this.A0w.A0A(this);
        this.A0r.A0A(this);
        this.A0s.A0A(this);
        if (!this.A1N) {
            if (!A0d()) {
                this.A0v.A0A(this);
            }
            this.A0u.A0A(this);
        }
        A05();
        AnonymousClass0fD.A0D(-1010026313, A062);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        A0I(this);
        this.A0h = true;
    }

    public final void onDetachedFromWindow() {
        FragmentActivity fragmentActivity;
        LoaderManager loaderManager;
        int A062 = AnonymousClass0fD.A06(-497321273);
        super.onDetachedFromWindow();
        JX0 jx0 = this.A1C.A03;
        if (!(jx0 == null || (fragmentActivity = jx0.A03) == null || (loaderManager = fragmentActivity.getLoaderManager()) == null)) {
            loaderManager.destroyLoader(C59761JWz.A0D);
        }
        A05();
        JX0 jx02 = this.A1B;
        jx02.A05 = null;
        jx02.A04 = null;
        this.A1D.A03 = null;
        JW8 jw8 = this.A14;
        RecyclerView recyclerView = jw8.A0I.A00;
        recyclerView.A16(jw8.A0B);
        if (jw8.A0R) {
            recyclerView.A16(jw8.A0C);
        }
        this.A0t.A0B(this);
        this.A0w.A0B(this);
        this.A0r.A0B(this);
        this.A0s.A0B(this);
        if (!this.A1N) {
            if (!A0d()) {
                this.A0v.A0B(this);
            }
            this.A0u.A0B(this);
        }
        this.A07 = null;
        AnonymousClass0fD.A0D(-2094514347, A062);
    }

    public final void onMeasure(int i, int i2) {
        View view;
        super.onMeasure(i, i2);
        if (!this.A1N) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() - this.A0a, SN3.MAX_SIGNED_POWER_OF_TWO);
            View view2 = this.A0m;
            view2.measure(i, makeMeasureSpec);
            int height = this.A0n.getHeight() + getCameraOptionsHolderBottomPadding();
            boolean z = this.A1P;
            if (!z) {
                height += this.A06;
            }
            this.A09 = new C53368Gms(this.A09.A01, height, 9);
            if (182.A06(0Tu.A05, this.A0z, 36321060954383406L)) {
                view2.setTranslationY((float) this.A09.A01);
                C53368Gms gms = this.A09;
                0nA.A0X(view2, Math.max(gms.A00 + gms.A01, 0));
                return;
            }
            JW8 jw8 = this.A14;
            int i3 = this.A09.A00;
            jw8.A0F.A00 = i3;
            0nA.A0X(jw8.A0N.A0A, i3);
            if (!z && A0c() && (view = this.A07) != null) {
                view.setPadding(0, 0, 0, height);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, com.instagram.creation.capture.gallery.ui.GalleryPickerView$SavedState] */
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState != null) {
            ? baseSavedState = new View.BaseSavedState(onSaveInstanceState);
            baseSavedState.A06 = new float[9];
            baseSavedState.A03 = AnonymousClass7TE.A1E();
            JW8 jw8 = this.A14;
            Folder folder = jw8.A0O.A02;
            if (folder != null) {
                baseSavedState.A00 = folder.A02;
                baseSavedState.A01 = folder.A03;
            }
            JWM jwm = jw8.A0F;
            List<GalleryItem> list = jwm.A0W;
            ArrayList A0r2 = AnonymousClass7TG.A0r(list);
            for (GalleryItem galleryItem : list) {
                A0r2.add(galleryItem.A0A);
            }
            baseSavedState.A07 = DbU.A1b(A0r2, 0);
            baseSavedState.A05 = jwm.A07;
            GalleryItem galleryItem2 = this.A0B;
            if (galleryItem2 != null) {
                baseSavedState.A02 = galleryItem2.A0A;
                boolean z = false;
                if (galleryItem2.A09 == AnonymousClass05K.A01) {
                    z = true;
                }
                baseSavedState.A04 = z;
            }
            baseSavedState.A06 = this.A1D.getCropMatrixValues();
            Map map = baseSavedState.A03;
            map.clear();
            map.putAll(this.A1J);
            return baseSavedState;
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r1 != 3) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            r0 = -1617841267(0xffffffff9f91b38d, float:-6.170693E-20)
            int r6 = X.DbX.A03(r9, r0)
            android.view.GestureDetector r0 = r8.A1R
            r0.onTouchEvent(r9)
            int r1 = r9.getAction()
            r7 = 1
            if (r1 == r7) goto L_0x0032
            r0 = 2
            if (r1 == r0) goto L_0x0020
            r0 = 3
            if (r1 == r0) goto L_0x0032
        L_0x0019:
            r0 = -227618370(0xfffffffff26ed1be, float:-4.7303037E30)
            X.AnonymousClass0fD.A0C(r0, r6)
            return r7
        L_0x0020:
            boolean r0 = r8.A0M
            if (r0 == 0) goto L_0x0019
            float r1 = r8.A0Z
            X.2cs r4 = r8.A0v
            X.2ct r0 = r4.A09
            double r2 = r0.A00
            double r0 = (double) r1
            double r2 = r2 + r0
            r4.A08(r2, r7)
            goto L_0x0019
        L_0x0032:
            boolean r0 = r8.A0M
            if (r0 == 0) goto L_0x0019
            float r1 = r8.A0Z
            float r5 = r8.getTargetPosition()
            X.2cs r4 = r8.A0v
            X.2ct r0 = r4.A09
            double r2 = r0.A00
            double r0 = (double) r1
            double r2 = r2 + r0
            r4.A08(r2, r7)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r0 = r8.A03
            float r1 = r1 * r0
            double r0 = (double) r1
            r4.A07(r0)
            double r0 = (double) r5
            r4.A06(r0)
            r8.A05()
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JW7.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setListener(AnonymousClass8ZX r1) {
        this.A0H = r1;
    }

    public final void setOnMultiSelectModeChangedCallback(C41776B0f b0f) {
        this.A0F = b0f;
    }

    public void setTabBarHeight(int i) {
        this.A06 = i;
    }
}
