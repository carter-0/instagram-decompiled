package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.api.schemas.MediaCroppingCoordinates;
import com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo;
import com.instagram.creation.sharesheet.coverphoto.ClipsCoverPhotoPickerController;

/* renamed from: X.KNd  reason: case insensitive filesystem */
public final class C61814KNd extends C61383K5b {
    public static final String __redex_internal_original_name = "ClipsCoverPhotoPickerFragment";
    public MediaCroppingCoordinates A00;
    public ClipsCoverPhotoPickerController A01;
    public C60123Jg4 A02;
    public AnonymousClass3Q2 A03;
    public C60250Ji7 A04;
    public String A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public ShareMediaLoggingInfo A09;
    public C60134JgF A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C = C227642jf.A02(this);

    public final String getModuleName() {
        return "clips_cover_photo_picker";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.crop_profile_image_button);
        A0R.setVisibility(0);
        Context A0S = AnonymousClass7TE.A0S(A0R);
        DbT.A17(A0S, A0R, 1QE.A01(A0S));
        LYF.A01(A0R, 68, this);
        View A0G = AnonymousClass7TF.A0G(view, R.id.cover_photo_text_image);
        07U r4 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MHF(viewLifecycleOwner, A0G, r4, this, (AnonymousClass4D7) null, 9), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public static final void A00(C61814KNd kNd) {
        AnonymousClass0eM r4 = kNd.A0C;
        L4H A002 = C63209KtG.A00(AnonymousClass7TE.A0l(r4));
        A002.A01.flowMarkPoint(A002.A00, "CROP_PROFILE_IMAGE_CLICKED");
        27r A0g = C51971G9r.A0g(r4);
        C59725JVj jVj = A0g.A04.A0C;
        if (!(A0g.A0J() == null || jVj == null)) {
            A0g.A1Q(jVj, "SHARE_SHEET_COVER_PHOTO_PROFILE_GRID_TAP");
        }
        C309516Yo A0P = DbZ.A0P(kNd, r4);
        A0P.A08();
        0lg A0X = DbT.A0X(r4);
        AnonymousClass3Q2 r0 = kNd.A03;
        if (r0 == null) {
            0qQ.A0F("pendingMedia");
            throw AnonymousClass00P.createAndThrow();
        }
        String str = r0.A33;
        if (str != null) {
            ShareMediaLoggingInfo shareMediaLoggingInfo = kNd.A09;
            0qQ.A0B(A0X, 0);
            KTS kts = new KTS();
            Bundle A0P2 = AnonymousClass7TG.A0P("ClipsConstants.ARG_CLIPS_SHARE_MEDIA_LOGGING_INFO", shareMediaLoggingInfo, AnonymousClass7TE.A1L("ClipsConstants.ARG_CLIPS_COVER_IMAGE_FILE_PATH", str));
            AnonymousClass0Dg.A00(A0P2, A0X);
            DbW.A0x(A0P2, kts, A0P);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0C);
    }

    public C61814KNd() {
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, C66296MMf.A00(C66296MMf.A00(this, 3), 4));
        0Yh A0z = DbS.A0z(C60228Jhl.class);
        this.A0B = DbS.A0I(C66296MMf.A00(A002, 5), MMY.A00(this, A002, 24), MMY.A00(A002, (Object) null, 23), A0z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: X.K5b} */
    /* JADX WARNING: type inference failed for: r0v50, types: [java.lang.Object, X.2YM] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r23) {
        /*
            r22 = this;
            r0 = -91539768(0xfffffffffa8b36c8, float:-3.6142018E35)
            int r1 = X.AnonymousClass0fD.A02(r0)
            r12 = r22
            r0 = r23
            X.C61814KNd.super.onCreate(r0)
            android.os.Bundle r5 = r12.mArguments
            java.lang.String r4 = "Required value was null."
            if (r5 == 0) goto L_0x01c3
            java.lang.String r0 = "clips_cover_photo_picker"
            r12.setModuleNameV2(r0)
            X.0eM r3 = r12.A0C
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r3)
            com.instagram.pendingmedia.store.PendingMediaStore r2 = X.28K.A00(r0)
            java.lang.String r0 = "ClipsConstants.ARG_CLIPS_SHARE_SHEET_PENDING_MEDIA_KEY"
            java.lang.String r0 = r5.getString(r0)
            X.3Q2 r0 = r2.A03(r0)
            if (r0 == 0) goto L_0x01cb
            r12.A03 = r0
            java.lang.String r0 = "ClipsConstants.ARG_CLIPS_SHARE_SHEET_CLIPS_SESSION_ID"
            java.lang.String r0 = r5.getString(r0)
            r12.A05 = r0
            java.lang.String r0 = "ClipsConstants.ARG_CLIPS_SHARE_MEDIA_LOGGING_INFO"
            android.os.Parcelable r0 = r5.getParcelable(r0)
            com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo r0 = (com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo) r0
            r12.A09 = r0
            X.3Q2 r2 = r12.A03
            java.lang.String r10 = "pendingMedia"
            if (r2 == 0) goto L_0x01bf
            com.instagram.pendingmedia.model.ClipInfo r8 = r2.A1N
            java.lang.String r0 = r2.A33
            r12.A06 = r0
            boolean r0 = r2.A5M
            r12.A07 = r0
            X.0eM r0 = r12.A0B
            java.lang.Object r0 = r0.getValue()
            X.Jhl r0 = (X.C60228Jhl) r0
            X.6rJ r2 = r0.A01
            java.lang.String r0 = "PROFILE_CROP_COORDINATES_KEY"
            java.lang.Object r0 = r2.A00(r0)
            com.instagram.api.schemas.MediaCroppingCoordinates r0 = (com.instagram.api.schemas.MediaCroppingCoordinates) r0
            r12.A00 = r0
            androidx.fragment.app.FragmentActivity r5 = r12.requireActivity()
            X.3Q2 r9 = r12.A03
            if (r9 == 0) goto L_0x01bf
            android.content.Context r7 = r12.requireContext()
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r3)
            android.content.res.Resources r0 = X.DbV.A05(r12)
            android.util.DisplayMetrics r4 = r0.getDisplayMetrics()
            X.0qQ.A07(r4)
            android.graphics.RectF r0 = X.0nA.A01
            int r0 = r4.widthPixels
            float r2 = (float) r0
            int r0 = r4.heightPixels
            float r0 = (float) r0
            float r2 = r2 / r0
            X.M0u r15 = new X.M0u
            r15.<init>(r7, r6, r9, r2)
            int r4 = r8.A07
            int r2 = r8.A05
            X.3Q2 r0 = r12.A03
            if (r0 == 0) goto L_0x01bf
            com.instagram.pendingmedia.model.ClipInfo r0 = r0.A1N
            X.LA8 r16 = X.LKM.A00(r0)
            com.instagram.common.session.UserSession r14 = X.AnonymousClass7TE.A0l(r3)
            r17 = 1058013184(0x3f100000, float:0.5625)
            r0 = 5
            X.0qQ.A0B(r14, r0)
            X.La1 r13 = new X.La1
            r18 = r4
            r19 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19)
            X.2YN r2 = X.JTO.A0L(r13, r5)
            java.lang.Class<X.Ji7> r0 = X.C60250Ji7.class
            X.2YL r4 = r2.A00(r0)
            X.Ji7 r4 = (X.C60250Ji7) r4
            r12.A04 = r4
            X.3Q2 r0 = r12.A03
            if (r0 == 0) goto L_0x01bf
            java.lang.String r2 = r0.A33
            java.lang.String r7 = "videoScrubbingViewModel"
            if (r2 == 0) goto L_0x00d3
            if (r4 == 0) goto L_0x01bb
            X.M81 r0 = new X.M81
            r0.<init>(r4, r2)
            X.11Z.A02(r0)
        L_0x00d3:
            X.Ji7 r4 = r12.A04
            if (r4 == 0) goto L_0x01bb
            X.3Q2 r0 = r12.A03
            if (r0 == 0) goto L_0x01bf
            boolean r2 = r0.A5M
            X.2Fj r0 = r4.A0C
            X.JTP.A1B(r0, r2)
            X.Ji7 r4 = r12.A04
            if (r4 == 0) goto L_0x01bb
            X.3Q2 r0 = r12.A03
            if (r0 == 0) goto L_0x01bf
            int r2 = r0.A06
            r0 = 1
            r4.A00(r2, r0)
            X.Ji7 r0 = r12.A04
            if (r0 == 0) goto L_0x01bb
            X.2Fk r4 = r0.A07
            r2 = 6
            X.MP9 r0 = new X.MP9
            r0.<init>(r12, r2)
            r5 = 14
            X.Dba.A15(r12, r4, r0, r5)
            X.Ji7 r0 = r12.A04
            if (r0 == 0) goto L_0x01bb
            X.0r6 r4 = r0.A0G
            r6 = 0
            r2 = 23
            X.MGX r0 = new X.MGX
            r0.<init>(r12, r6, r2)
            X.JTS.A10(r12, r0, r4)
            X.Ji7 r0 = r12.A04
            if (r0 == 0) goto L_0x01bb
            X.2Fk r4 = r0.A04
            r2 = 7
            X.MP9 r0 = new X.MP9
            r0.<init>(r12, r2)
            X.Dba.A15(r12, r4, r0, r5)
            X.Ji7 r0 = r12.A04
            if (r0 == 0) goto L_0x01bb
            X.2Fk r4 = r0.A08
            r2 = 8
            X.MP9 r0 = new X.MP9
            r0.<init>(r12, r2)
            X.Dba.A15(r12, r4, r0, r5)
            X.2YN r2 = X.DbW.A0F(r12)
            java.lang.Class<X.JgF> r0 = X.C60134JgF.class
            X.2YL r5 = r2.A00(r0)
            X.JgF r5 = (X.C60134JgF) r5
            r12.A0A = r5
            java.lang.String r4 = "galleryCoverPhotoPickerViewModel"
            if (r5 == 0) goto L_0x018a
            X.Ji7 r0 = r12.A04
            if (r0 == 0) goto L_0x01bb
            X.Lpe r2 = new X.Lpe
            r2.<init>(r0)
            X.2Fj r0 = r5.A00
            r0.A0B(r2)
            X.JgF r0 = r12.A0A
            if (r0 == 0) goto L_0x018a
            X.0r6 r4 = r0.A02
            r2 = 24
            X.MGX r0 = new X.MGX
            r0.<init>(r12, r6, r2)
            X.JTS.A10(r12, r0, r4)
            androidx.fragment.app.FragmentActivity r2 = r12.requireActivity()
            X.KBG r0 = new X.KBG
            r0.<init>()
            X.2YN r2 = X.JTO.A0L(r0, r2)
            java.lang.Class<X.Jg4> r0 = X.C60123Jg4.class
            X.2YL r0 = r2.A00(r0)
            X.Jg4 r0 = (X.C60123Jg4) r0
            r12.A02 = r0
            android.content.Context r11 = r12.requireContext()
            com.instagram.common.session.UserSession r14 = X.AnonymousClass7TE.A0l(r3)
            X.Ji7 r4 = r12.A04
            if (r4 == 0) goto L_0x01bb
            X.Jg4 r3 = r12.A02
            if (r3 != 0) goto L_0x0192
            java.lang.String r4 = "textEditingViewModel"
        L_0x018a:
            X.0qQ.A0F(r4)
        L_0x018d:
            X.00P r2 = X.AnonymousClass00P.createAndThrow()
            throw r2
        L_0x0192:
            X.3Q2 r2 = r12.A03
            if (r2 == 0) goto L_0x01bf
            com.instagram.camera.effect.models.CameraAREffect r0 = r2.A10
            boolean r20 = X.AnonymousClass7TF.A1V(r0)
            java.lang.String r0 = r12.A05
            r21 = 0
            com.instagram.creation.sharesheet.coverphoto.ClipsCoverPhotoPickerController r10 = new com.instagram.creation.sharesheet.coverphoto.ClipsCoverPhotoPickerController
            r13 = r12
            r15 = r12
            r16 = r3
            r17 = r2
            r18 = r4
            r19 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r12.A01 = r10
            r12.registerLifecycleListener(r10)
            r0 = -1441426361(0xffffffffaa159447, float:-1.3285302E-13)
            X.AnonymousClass0fD.A09(r0, r1)
            return
        L_0x01bb:
            X.0qQ.A0F(r7)
            goto L_0x018d
        L_0x01bf:
            X.0qQ.A0F(r10)
            goto L_0x018d
        L_0x01c3:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r4)
            r0 = -219385765(0xfffffffff2ec705b, float:-9.3663093E30)
            goto L_0x01d2
        L_0x01cb:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r4)
            r0 = 82987454(0x4f249be, float:5.6961648E-36)
        L_0x01d2:
            X.AnonymousClass0fD.A09(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61814KNd.onCreate(android.os.Bundle):void");
    }
}
