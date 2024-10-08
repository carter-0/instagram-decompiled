package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.quicklog.reliability.CancelReason;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.ui.widget.gallery.GalleryView;
import java.util.List;

public final class K6G extends AnonymousClass4DH implements AnonymousClass4DR, C74332Pt8, MVI, MUL {
    public static final String __redex_internal_original_name = "DirectMediaPickerPhotosFragment";
    public C66524MVc A00;
    public L1G A01;
    public LPF A02;
    public MVV A03;
    public MT1 A04;
    public String A05;
    public boolean A06;
    public float A07;
    public int A08;
    public int A09;
    public TextView A0A;
    public TextView A0B;
    public TextView A0C;
    public IgSimpleImageView A0D;
    public IgSimpleImageView A0E;
    public LBR A0F;
    public AnonymousClass7L0 A0G;
    public GalleryView A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public final AnonymousClass0eM A0O = C227642jf.A02(this);
    public final String A0P = "direct_media_picker_photos_fragment";

    public final void A01(JOZ joz, List list) {
        LPF lpf = this.A02;
        if (lpf == null) {
            0qQ.A0F("mediaPickerPhotosController");
            throw AnonymousClass00P.createAndThrow();
        }
        Resources A0R = JTR.A0R(this);
        Context context = lpf.A04;
        UserSession userSession = lpf.A05;
        C361568gR r1 = lpf.A06;
        0qQ.A0B(r1, 2);
        r1.A04(C64151LQo.A00(list), new C58223IoR(8, this, list, context, A0R, joz, userSession));
    }

    public final boolean Dkq(Medium medium, String str) {
        0qQ.A0B(str, 0);
        C66524MVc mVc = this.A00;
        if (mVc != null) {
            return mVc.Dkq(medium, str);
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v0, resolved type: X.MVI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: X.4DH} */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x006f, code lost:
        if (r0.A0M == false) goto L_0x0071;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r42, android.os.Bundle r43) {
        /*
            r41 = this;
            r2 = 0
            r1 = r42
            X.0qQ.A0B(r1, r2)
            r0 = r41
            r3 = r43
            super.onViewCreated(r1, r3)
            X.MVc r3 = r0.A00
            if (r3 == 0) goto L_0x01a0
            X.8XO r30 = r3.B8p()
        L_0x0015:
            X.0eM r11 = r0.A0O
            com.instagram.common.session.UserSession r31 = X.AnonymousClass7TE.A0l(r11)
            r17 = 0
            android.content.Context r5 = r1.getContext()
            r3 = 2131965943(0x7f1337f7, float:1.956871E38)
            java.lang.String r18 = X.AnonymousClass7TE.A16(r5, r3)
            int r3 = r0.A08
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
            int r10 = r0.A09
            boolean r9 = r0.A0N
            X.MVc r3 = r0.A00
            if (r3 == 0) goto L_0x019c
            boolean r27 = r3.Et9()
        L_0x003a:
            float r8 = r0.A07
            android.os.Bundle r4 = r0.requireArguments()
            java.lang.String r3 = "BUNDLE_FOLDER_NAME"
            java.lang.String r14 = r4.getString(r3)
            android.os.Bundle r4 = r0.requireArguments()
            java.lang.String r3 = "BUNDLE_SELECTED_ITEMS"
            java.util.ArrayList r19 = r4.getParcelableArrayList(r3)
            android.os.Bundle r4 = r0.requireArguments()
            java.lang.String r3 = "BUNDLE_SUBHEADER_TITLE"
            java.lang.String r16 = r4.getString(r3)
            android.os.Bundle r4 = r0.requireArguments()
            java.lang.String r3 = "BUNDLE_SUBHEADER_SUBTITLE"
            java.lang.String r15 = r4.getString(r3)
            r6 = 1
            boolean r7 = r0.A0L
            boolean r3 = r0.A0K
            if (r3 == 0) goto L_0x0071
            boolean r4 = r0.A0M
            r23 = 1
            if (r4 != 0) goto L_0x0073
        L_0x0071:
            r23 = 0
        L_0x0073:
            X.LFd r12 = new X.LFd
            r24 = r6
            r25 = r7
            r26 = r3
            r28 = r6
            r29 = r9
            r20 = r8
            r21 = r10
            r22 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            boolean r7 = r0.A0I
            boolean r3 = r0.A0J
            if (r3 == 0) goto L_0x0198
            int r37 = X.JTR.A09(r5)
        L_0x0092:
            X.0gy r29 = X.AnonymousClass07i.A00(r0)
            r4 = 12
            X.KH1 r3 = new X.KH1
            r3.<init>((java.lang.Object) r0, (int) r4)
            r36 = 3
            X.LPF r4 = new X.LPF
            r27 = r4
            r28 = r1
            r32 = r3
            r33 = r0
            r34 = r12
            r35 = r17
            r38 = r2
            r39 = r7
            r40 = r6
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r0.A02 = r4
            X.MVV r5 = r0.A03
            r4.A01 = r5
            X.LOJ r3 = r4.A09
            r3.A00 = r5
            r5 = 0
            X.MT1 r3 = r0.A04
            r4.A02 = r3
            X.L1G r3 = r0.A01
            r4.A00 = r3
            r3 = 2131435978(0x7f0b21ca, float:1.8493813E38)
            android.widget.TextView r3 = X.DbU.A0G(r1, r3)
            r0.A0C = r3
            r3 = 2131435993(0x7f0b21d9, float:1.8493844E38)
            android.widget.TextView r3 = X.DbU.A0G(r1, r3)
            r0.A0B = r3
            r3 = 2131435975(0x7f0b21c7, float:1.8493807E38)
            com.instagram.common.ui.base.IgSimpleImageView r3 = X.JTP.A0T(r1, r3)
            r0.A0E = r3
            r3 = 2131427512(0x7f0b00b8, float:1.8476642E38)
            com.instagram.common.ui.base.IgSimpleImageView r3 = X.JTP.A0T(r1, r3)
            r0.A0D = r3
            r3 = 2131433347(0x7f0b1783, float:1.8488477E38)
            android.view.View r3 = r1.requireViewById(r3)
            com.instagram.ui.widget.gallery.GalleryView r3 = (com.instagram.ui.widget.gallery.GalleryView) r3
            r0.A0H = r3
            boolean r3 = r0.A0K
            if (r3 == 0) goto L_0x0141
            boolean r3 = r0.A0M
            if (r3 == 0) goto L_0x0141
            android.os.Bundle r4 = r0.mArguments
            if (r4 == 0) goto L_0x010a
            java.lang.String r3 = "DIRECT_THREAD_KEY"
            android.os.Parcelable r5 = r4.getParcelable(r3)
        L_0x010a:
            java.lang.Class<com.instagram.model.direct.DirectThreadKey> r4 = com.instagram.model.direct.DirectThreadKey.class
            android.os.Parcelable$Creator r3 = com.instagram.model.direct.DirectThreadKey.CREATOR
            X.0qQ.A08(r3)
            java.lang.Object r7 = X.0B0.A01(r3, r5, r4)
            com.instagram.model.direct.DirectThreadKey r7 = (com.instagram.model.direct.DirectThreadKey) r7
            androidx.fragment.app.FragmentActivity r4 = r0.requireActivity()
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r11)
            X.LSl r5 = new X.LSl
            r5.<init>(r3, r4)
            com.instagram.common.session.UserSession r15 = X.AnonymousClass7TE.A0l(r11)
            X.LBR r12 = new X.LBR
            r13 = r1
            r14 = r0
            r16 = r5
            r17 = r7
            r12.<init>(r13, r14, r15, r16, r17)
            r0.A0F = r12
            com.instagram.ui.widget.gallery.GalleryView r4 = r0.A0H
            if (r4 == 0) goto L_0x0141
            X.Mq4 r3 = new X.Mq4
            r3.<init>(r5, r6)
            r4.setPermissionRequestSuccessCallback(r3)
        L_0x0141:
            android.os.Bundle r4 = r0.requireArguments()
            java.lang.String r3 = "BUNDLE_SHOW_DONE_BUTTON"
            boolean r3 = r4.getBoolean(r3)
            if (r3 == 0) goto L_0x015b
            r3 = 2131435966(0x7f0b21be, float:1.849379E38)
            android.widget.TextView r3 = X.DbU.A0G(r1, r3)
            r0.A0A = r3
            if (r3 == 0) goto L_0x015b
            r3.setVisibility(r2)
        L_0x015b:
            X.7L0 r3 = r0.A0G
            if (r3 == 0) goto L_0x0162
            r0.ADi(r3)
        L_0x0162:
            r0 = 2131435994(0x7f0b21da, float:1.8493846E38)
            android.view.View r3 = X.AnonymousClass7TF.A0G(r1, r0)
            r0 = 500(0x1f4, double:2.47E-321)
            X.2eQ.A06(r3, r0)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r11)
            X.JVm r6 = X.AnonymousClass9PJ.A00(r0)
            X.0JA.A01()
            X.29E r5 = r6.A04
            long r3 = r6.A00
            r0 = 585177486(0x22e1198e, float:6.101343E-18)
            boolean r0 = r5.A0E(r0, r3)
            if (r0 == 0) goto L_0x0192
            long r3 = r6.A00
            java.lang.String r1 = "direct_gallery_visible"
            r5.A0C(r1, r3)
            X.04u r0 = r6.A03
            r0.add(r1)
        L_0x0192:
            r6.A02 = r2
            X.C59728JVm.A00(r6)
            return
        L_0x0198:
            r37 = 0
            goto L_0x0092
        L_0x019c:
            r27 = 0
            goto L_0x003a
        L_0x01a0:
            X.8XO r30 = X.AnonymousClass8XO.PHOTO_AND_VIDEO
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K6G.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final List A00() {
        LPF lpf = this.A02;
        if (lpf != null) {
            return lpf.A01();
        }
        0qQ.A0F("mediaPickerPhotosController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean A02() {
        String str;
        LPF lpf = this.A02;
        if (lpf == null) {
            str = "mediaPickerPhotosController";
        } else {
            GalleryView galleryView = lpf.A03;
            if (galleryView != null) {
                return AnonymousClass7TF.A1R(galleryView.A02);
            }
            str = "galleryView";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void ADi(AnonymousClass7L0 r4) {
        View view;
        this.A0G = r4;
        if (this.mView != null && r4 != null) {
            TextView textView = this.A0C;
            if (textView != null) {
                textView.setTextColor(r4.A0C);
            }
            TextView textView2 = this.A0B;
            if (textView2 != null) {
                textView2.setTextColor(r4.A0D);
            }
            IgSimpleImageView igSimpleImageView = this.A0E;
            if (igSimpleImageView != null) {
                igSimpleImageView.setColorFilter(r4.A0C);
            }
            IgSimpleImageView igSimpleImageView2 = this.A0D;
            if (igSimpleImageView2 != null) {
                igSimpleImageView2.setColorFilter(r4.A0C);
            }
            GalleryView galleryView = this.A0H;
            if (galleryView != null && (view = galleryView.A0W.getView()) != null) {
                view.setBackgroundColor(r4.A09);
                TextView A0G2 = DbU.A0G(view, R.id.inline_gallery_empty_title);
                int i = r4.A0C;
                A0G2.setTextColor(i);
                DbU.A0G(view, R.id.inline_gallery_empty_message).setTextColor(i);
            }
        }
    }

    public final boolean CPd() {
        boolean z;
        String str;
        LPF lpf = this.A02;
        if (lpf == null) {
            str = "mediaPickerPhotosController";
        } else {
            GalleryView galleryView = lpf.A03;
            if (galleryView == null) {
                str = "galleryView";
            } else {
                C361778gm r0 = galleryView.A0B;
                if (r0 != null) {
                    z = r0.A04;
                } else {
                    z = false;
                }
                return !z;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void D0u() {
        C66524MVc mVc = this.A00;
        if (mVc != null) {
            mVc.D0u();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final boolean DHW(View view, GalleryItem galleryItem) {
        C66524MVc mVc = this.A00;
        if (mVc != null) {
            return mVc.DHW(view, galleryItem);
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void DIn(boolean z) {
        C66524MVc mVc = this.A00;
        if (mVc != null) {
            mVc.DIn(z);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final String getModuleName() {
        return this.A0P;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0O);
    }

    public final boolean isScrolledToTop() {
        LPF lpf = this.A02;
        if (lpf != null) {
            return lpf.A05();
        }
        0qQ.A0F("mediaPickerPhotosController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean onBackPressed() {
        LPF lpf = this.A02;
        if (lpf != null) {
            return lpf.A06();
        }
        0qQ.A0F("mediaPickerPhotosController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1350265760);
        K6G.super.onCreate(bundle);
        this.A0J = requireArguments().getBoolean("BUNDLE_IS_EMBEDDED");
        this.A08 = requireArguments().getInt("MAX_MULTI_SELECT_COUNT");
        this.A09 = requireArguments().getInt("MAX_MULTI_VIDEO_COUNT");
        this.A0I = requireArguments().getBoolean("BUNDLE_IS_CAPTURE_BUTTON_ENABLED");
        this.A05 = requireArguments().getString("BUNDLE_THREAD_TRANSPORT_TYPE");
        this.A0N = requireArguments().getBoolean("BUNDLE_SHOW_SELECT_BUTTON");
        this.A07 = requireArguments().getFloat("BUNDLE_ASPECT_RATIO", 1.0f);
        this.A0L = requireArguments().getBoolean("BUNDLE_KEEP_FOLDER_SELECTION");
        this.A0M = requireArguments().getBoolean("BUNDLE_SHOW_MAGIC_MEDIA_REMIX");
        this.A0K = new C227422jG(AnonymousClass7TE.A0l(this.A0O)).A00();
        AnonymousClass0fD.A09(-901229840, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(800567958);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_media_picker_photos, viewGroup, false);
        AnonymousClass0fD.A09(-192451121, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(2065386865);
        super.onDestroy();
        AnonymousClass0eM r4 = this.A0O;
        C71012OYk A002 = C63234Ktf.A00(AnonymousClass7TE.A0l(r4));
        C71012OYk.A01(A002, new C67570Mq4(A002, 8));
        if (this.A06) {
            2Nl A003 = 2Nk.A00(AnonymousClass7TE.A0l(r4));
            A003.A00 = A003.A04.A06(CancelReason.USER_CANCELLED, "User exited the flow before the gallery was fully loaded", 17642674, A003.A00);
            this.A06 = false;
        }
        AnonymousClass0fD.A09(1856027878, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1300573875);
        super.onDestroyView();
        this.A0C = null;
        this.A0B = null;
        this.A0E = null;
        this.A0D = null;
        this.A0H = null;
        AnonymousClass0fD.A09(1099232435, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(314056808);
        K6G.super.onPause();
        LPF lpf = this.A02;
        if (lpf == null) {
            0qQ.A0F("mediaPickerPhotosController");
            throw AnonymousClass00P.createAndThrow();
        }
        lpf.A02();
        AnonymousClass0fD.A09(805478493, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(913303640);
        super.onResume();
        LPF lpf = this.A02;
        if (lpf == null) {
            0qQ.A0F("mediaPickerPhotosController");
            throw AnonymousClass00P.createAndThrow();
        }
        lpf.A03();
        AnonymousClass0fD.A09(421014125, A022);
    }
}
