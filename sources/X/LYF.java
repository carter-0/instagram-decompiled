package X;

import android.view.View;

public final class LYF implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public LYF(K5H k5h, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                this.A01 = k5h;
                return;
            default:
                this.A01 = k5h;
                return;
        }
    }

    public static C59963JcW A00(LYF lyf) {
        return C59962JcV.A01((C59962JcV) lyf.A01);
    }

    public static void A01(View view, int i, Object obj) {
        AnonymousClass0fU.A00(new LYF(obj, i), view);
    }

    /* JADX WARNING: type inference failed for: r1v125, types: [X.1qK, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x03e7, code lost:
        X.0qQ.A0F("radioButtonsView");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03f0, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0529, code lost:
        X.0qQ.A0F("viewHolder");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0532, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0064, code lost:
        X.DbT.A1J(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0790, code lost:
        X.AnonymousClass0fD.A0C(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0793, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0aa3, code lost:
        X.0qQ.A0F(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0aaa, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0baa, code lost:
        X.0qQ.A0F("audioTrack");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0bb3, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0bcb, code lost:
        X.AnonymousClass0fD.A0C(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0bce, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0bf2, code lost:
        X.AnonymousClass0fD.A0C(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0bf5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x0c22, code lost:
        X.AnonymousClass0fD.A0C(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x0c25, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0875  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x08ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r12) {
        /*
            r11 = this;
            int r0 = r11.A00
            switch(r0) {
                case 0: goto L_0x00a1;
                case 1: goto L_0x0083;
                case 2: goto L_0x0c2d;
                case 3: goto L_0x0005;
                case 4: goto L_0x0005;
                case 5: goto L_0x0bf6;
                case 6: goto L_0x0bcf;
                case 7: goto L_0x0bbc;
                case 8: goto L_0x0b6d;
                case 9: goto L_0x0b52;
                case 10: goto L_0x0b42;
                case 11: goto L_0x0b17;
                case 12: goto L_0x0afc;
                case 13: goto L_0x0aeb;
                case 14: goto L_0x0a8a;
                case 15: goto L_0x0a79;
                case 16: goto L_0x0a68;
                case 17: goto L_0x0a53;
                case 18: goto L_0x0a3a;
                case 19: goto L_0x0a27;
                case 20: goto L_0x09e5;
                case 21: goto L_0x0078;
                case 22: goto L_0x09d6;
                case 23: goto L_0x0974;
                case 24: goto L_0x0912;
                case 25: goto L_0x08b3;
                case 26: goto L_0x083a;
                case 27: goto L_0x0826;
                case 28: goto L_0x07f6;
                case 29: goto L_0x07e3;
                case 30: goto L_0x07bf;
                case 31: goto L_0x0794;
                case 32: goto L_0x0756;
                case 33: goto L_0x0743;
                case 34: goto L_0x0731;
                case 35: goto L_0x06de;
                case 36: goto L_0x06ba;
                case 37: goto L_0x069f;
                case 38: goto L_0x0684;
                case 39: goto L_0x0670;
                case 40: goto L_0x065c;
                case 41: goto L_0x062b;
                case 42: goto L_0x0617;
                case 43: goto L_0x0603;
                case 44: goto L_0x05d6;
                case 45: goto L_0x05b0;
                case 46: goto L_0x059f;
                case 47: goto L_0x0582;
                case 48: goto L_0x0550;
                case 49: goto L_0x0533;
                case 50: goto L_0x0510;
                case 51: goto L_0x04f7;
                case 52: goto L_0x04cf;
                case 53: goto L_0x04b8;
                case 54: goto L_0x04a1;
                case 55: goto L_0x048e;
                case 56: goto L_0x047b;
                case 57: goto L_0x0467;
                case 58: goto L_0x0413;
                case 59: goto L_0x0402;
                case 60: goto L_0x03f1;
                case 61: goto L_0x03ce;
                case 62: goto L_0x039a;
                case 63: goto L_0x0381;
                case 64: goto L_0x035b;
                case 65: goto L_0x02ba;
                case 66: goto L_0x024a;
                case 67: goto L_0x0212;
                case 68: goto L_0x01db;
                case 69: goto L_0x013d;
                case 70: goto L_0x00b0;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r11.A01
            X.K5H r2 = (X.K5H) r2
            java.lang.Integer r1 = r2.A0K
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r1 != r0) goto L_0x0068
            com.instagram.common.session.UserSession r0 = r2.A0B
            X.L4H r0 = X.C63209KtG.A00(r0)
            X.1QP r1 = r0.A01
            long r3 = r0.A00
            java.lang.String r0 = "ADD_LOCATION_CANCELLED"
            r1.flowMarkPoint(r3, r0)
        L_0x001e:
            X.LET r4 = r2.A0D
            X.KNN r4 = (X.KNN) r4
            X.0wc r1 = r4.A07
            java.lang.String r0 = "place_picker_cancelled"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x0064
            X.LET.A00(r3, r4)
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x0061
            java.lang.String r1 = r4.A01
            int r0 = r1.length()
            if (r0 != 0) goto L_0x0041
            java.lang.String r1 = ""
        L_0x0041:
            java.lang.String r0 = "query"
            r3.AAJ(r0, r1)
            java.lang.String r1 = "TRADITIONAL"
            java.lang.String r0 = "list_type"
            r3.AAJ(r0, r1)
            java.util.List r1 = r4.A03
            java.lang.String r0 = "results_fetched"
            r3.AAe(r0, r1)
            java.lang.String r1 = r4.A02
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0061
            java.lang.String r0 = "results_list_id"
            r3.AAJ(r0, r1)
        L_0x0061:
            r3.Cgf()
        L_0x0064:
            X.DbT.A1J(r2)
        L_0x0067:
            return
        L_0x0068:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x001e
            com.instagram.common.session.UserSession r0 = r2.A0B
            X.AE4 r1 = X.C59847JaN.A00(r0)
            java.lang.String r0 = "LOCATION_CANCELED"
            r1.A04(r0)
            goto L_0x001e
        L_0x0078:
            java.lang.Object r3 = r11.A01
            X.Lkh r3 = (X.C64942Lkh) r3
            com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter r2 = r3.A08
            if (r2 == 0) goto L_0x0067
            monitor-enter(r2)
            goto L_0x0c50
        L_0x0083:
            java.lang.Object r2 = r11.A01
            X.K5H r2 = (X.K5H) r2
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r2.A0J
            if (r0 == 0) goto L_0x0067
            r0.getSearchString()
            X.LfI r1 = new X.LfI
            r1.<init>()
            com.instagram.common.session.UserSession r0 = r2.A0B
            X.1Ng r0 = X.AnonymousClass1Nd.A00(r0)
            r0.A00(r1)
            boolean r0 = r2.A0P
            if (r0 == 0) goto L_0x0067
            goto L_0x0064
        L_0x00a1:
            java.lang.Object r1 = r11.A01
            X.K5H r1 = (X.K5H) r1
            X.K5H.A06(r1)
            android.location.Location r0 = r1.A02
            if (r0 == 0) goto L_0x0067
            X.K5H.A04(r1)
            return
        L_0x00b0:
            r0 = -115085856(0xfffffffff923ede0, float:-5.3198067E34)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r8 = r11.A01
            X.K5u r8 = (X.C61400K5u) r8
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r1 = r8.A02
            if (r1 == 0) goto L_0x0135
            X.0eM r3 = r8.A04
            java.lang.Object r0 = r3.getValue()
            X.Jg4 r0 = (X.C60123Jg4) r0
            X.0Ud r0 = r0.A01
            java.lang.Object r2 = r0.getValue()
            X.JwM r2 = (X.C61084JwM) r2
            java.util.List r1 = r1.getInteractiveDrawables()
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r2.A02 = r1
            com.instagram.common.ui.base.IgSimpleImageView r0 = r8.A00
            if (r0 == 0) goto L_0x0135
            int r2 = r0.getWidth()
            int r1 = r0.getHeight()
            boolean r0 = X.1MF.A02
            android.graphics.Bitmap r2 = X.AnonymousClass7TF.A0B(r2, r1)
            android.graphics.Canvas r1 = X.JTO.A0B(r2)
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r0 = r8.A02
            if (r0 == 0) goto L_0x00f6
            r0.draw(r1)
        L_0x00f6:
            java.lang.Object r0 = r3.getValue()
            X.Jg4 r0 = (X.C60123Jg4) r0
            X.0Ud r0 = r0.A01
            java.lang.Object r0 = r0.getValue()
            X.JwM r0 = (X.C61084JwM) r0
            r0.A00 = r2
            java.lang.Object r0 = r3.getValue()
            X.Jg4 r0 = (X.C60123Jg4) r0
            X.05G r7 = r0.A00
        L_0x010e:
            java.lang.Object r6 = r7.getValue()
            r5 = r6
            X.JwM r5 = (X.C61084JwM) r5
            java.lang.Object r1 = r5.A01
            java.util.Collection r1 = (java.util.Collection) r1
            X.LLP r0 = X.LLP.A00
            java.util.ArrayList r3 = X.00k.A0T(r0, r1)
            java.lang.Object r2 = r5.A02
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r1 = r5.A00
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            X.DbY.A1S(r2, r3)
            X.JwM r0 = new X.JwM
            r0.<init>((android.graphics.Bitmap) r1, (java.util.List) r2, (java.util.List) r3)
            boolean r0 = r7.AIY(r6, r0)
            if (r0 == 0) goto L_0x010e
        L_0x0135:
            X.DbT.A1J(r8)
            r0 = 522413190(0x1f236486, float:3.4599744E-20)
            goto L_0x0bf2
        L_0x013d:
            r0 = -2016118313(0xffffffff87d479d7, float:-3.1969826E-34)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r11.A01
            X.KTS r5 = (X.KTS) r5
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x01c4
            android.os.Bundle r2 = r5.requireArguments()
            java.lang.String r0 = "ClipsConstants.ARG_CLIPS_SHARE_MEDIA_LOGGING_INFO"
            android.os.Parcelable r7 = r2.getParcelable(r0)
            com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo r7 = (com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo) r7
            if (r7 == 0) goto L_0x01d3
            X.0eM r4 = r5.A00
            X.27r r2 = X.C51971G9r.A0g(r4)
            int r0 = r7.A05
            X.28t r6 = X.C59895JbK.A05(r0)
            X.29Z r9 = r2.A0F
            r8 = 2
            com.instagram.common.session.UserSession r0 = r9.A03
            X.0wc r2 = X.AnonymousClass0kN.A01(r5, r0)
            java.lang.String r0 = "ig_camera_ui_tool_click"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r2, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x01b3
            X.80P r0 = X.AnonymousClass80P.PROFILE_COVER_PHOTO_CROP
            X.JTO.A1O(r0, r3)
            java.lang.String r0 = "IG_CAMERA_PROFILE_COVER_PHOTO_CROP"
            java.lang.String r0 = X.JTS.A0j(r3, r9, r0)
            X.JTO.A1S(r3, r0)
            X.JTP.A1H(r3)
            X.28D r0 = X.28D.A0h
            X.JTS.A15(r0, r3, r8)
            X.JVj r0 = X.C59725JVj.SHARE_SHEET
            X.C51965G9l.A1A(r0, r3)
            X.JTO.A1P(r6, r3)
            int r0 = r7.A04
            X.JYm r2 = X.2AL.A03(r0)
            java.lang.String r0 = "media_source"
            r3.A8M(r2, r0)
            X.8fP r2 = X.C360948fP.CLIPS
            java.lang.String r0 = "capture_type"
            r3.A8M(r2, r0)
            java.lang.String r0 = "clips_share_sheet_profile_crop"
            X.DbS.A1K(r3, r0)
            X.AnonymousClass7TH.A0V(r3)
        L_0x01b3:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            X.L4H r0 = X.C63209KtG.A00(r0)
            X.1QP r4 = r0.A01
            long r2 = r0.A00
            java.lang.String r0 = "PROFILE_IMAGE_CROPPED"
            r4.flowMarkPoint(r2, r0)
        L_0x01c4:
            X.0eM r0 = r5.A01
            java.lang.Object r2 = r0.getValue()
            X.Jhl r2 = (X.C60228Jhl) r2
            com.instagram.api.schemas.MediaCroppingCoordinates r0 = r5.A00()
            r2.A00(r0)
        L_0x01d3:
            X.DbT.A1J(r5)
            r0 = -1033649540(0xffffffffc263c27c, float:-56.939926)
            goto L_0x0bcb
        L_0x01db:
            r0 = -1187653993(0xffffffffb935d697, float:-1.7341446E-4)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r11.A01
            X.KNd r1 = (X.C61814KNd) r1
            com.instagram.creation.sharesheet.coverphoto.ClipsCoverPhotoPickerController r0 = r1.A01()
            X.Ji7 r0 = r0.A0D
            X.2Fk r0 = r0.A09
            java.lang.Object r0 = r0.A02()
            X.JwK r0 = (X.C61082JwK) r0
            if (r0 == 0) goto L_0x0210
            java.lang.Object r0 = r0.A00
        L_0x01f8:
            boolean r0 = r0 instanceof X.C62122KaY
            if (r0 == 0) goto L_0x0204
            X.C61814KNd.A00(r1)
        L_0x01ff:
            r0 = 1593681191(0x5efda527, float:9.1385288E18)
            goto L_0x0c22
        L_0x0204:
            r0 = 1
            r1.A08 = r0
            com.instagram.creation.sharesheet.coverphoto.ClipsCoverPhotoPickerController r1 = r1.A01()
            r0 = 0
            r1.A02(r0)
            goto L_0x01ff
        L_0x0210:
            r0 = 0
            goto L_0x01f8
        L_0x0212:
            r0 = 1803376860(0x6b7d58dc, float:3.0627786E26)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r11.A01
            com.instagram.creation.sharesheet.coverphoto.ClipsCoverPhotoPickerController r1 = (com.instagram.creation.sharesheet.coverphoto.ClipsCoverPhotoPickerController) r1
            X.K5b r0 = r1.A0A
            java.lang.String r5 = r1.A0E
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            X.0eM r0 = r0.A01
            X.6Yo r3 = X.DbX.A0N(r1, r0)
            r3.A08()
            com.instagram.common.session.UserSession r0 = X.JTS.A0J(r0)
            X.K4p r2 = new X.K4p
            r2.<init>()
            android.os.Bundle r1 = X.DbY.A09(r0)
            if (r5 == 0) goto L_0x0242
            java.lang.String r0 = "ClipsConstants.ARG_CLIPS_SHARE_SHEET_CLIPS_SESSION_ID"
            r1.putString(r0, r5)
        L_0x0242:
            X.DbW.A0x(r1, r2, r3)
            r0 = 1512994226(0x5a2e75b2, float:1.22765133E16)
            goto L_0x0bf2
        L_0x024a:
            r0 = 1504796919(0x59b160f7, float:6.2409606E15)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r11.A01
            com.instagram.creation.sharesheet.coverphoto.ClipsCoverPhotoPickerController r0 = (com.instagram.creation.sharesheet.coverphoto.ClipsCoverPhotoPickerController) r0
            X.K5b r3 = r0.A0A
            X.3Q2 r2 = r0.A0C
            boolean r0 = r3 instanceof X.C61813KNc
            if (r0 == 0) goto L_0x02a6
            r0 = r3
            X.KNc r0 = (X.C61813KNc) r0
            java.lang.String r8 = r0.A04
        L_0x0262:
            if (r8 == 0) goto L_0x029f
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            X.0eM r0 = r3.A01
            X.6Yo r7 = X.DbX.A0N(r1, r0)
            r7.A08()
            X.0lg r6 = X.DbT.A0X(r0)
            r5 = 0
            if (r2 == 0) goto L_0x02a4
            X.28D r3 = r2.A0i
        L_0x027a:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            X.K5u r2 = new X.K5u
            r2.<init>()
            java.lang.String r0 = "ClipsConstants.ARG_CLIPS_COVER_IMAGE_FILE_PATH"
            X.0eP r1 = X.AnonymousClass7TE.A1L(r0, r8)
            r0 = 96
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.os.Bundle r0 = X.AnonymousClass7TG.A0P(r0, r3, r1)
            X.AnonymousClass0Dg.A00(r0, r6)
            r2.setArguments(r0)
            r7.A0B(r5, r2)
            r7.A04()
        L_0x029f:
            r0 = -449998563(0xffffffffe52d911d, float:-5.122789E22)
            goto L_0x0bf2
        L_0x02a4:
            r3 = r5
            goto L_0x027a
        L_0x02a6:
            r0 = r3
            X.KNd r0 = (X.C61814KNd) r0
            X.3Q2 r0 = r0.A03
            if (r0 != 0) goto L_0x02b7
            java.lang.String r0 = "pendingMedia"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x02b7:
            java.lang.String r8 = r0.A33
            goto L_0x0262
        L_0x02ba:
            r0 = 1884683488(0x7055fce0, float:2.6490406E29)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r11.A01
            X.K5b r5 = (X.C61383K5b) r5
            X.0eM r0 = r5.A01
            X.27r r0 = X.C51971G9r.A0g(r0)
            X.29R r6 = r0.A09
            X.1Ln r3 = X.JTO.A0N(r6)
            boolean r0 = X.DbT.A1Y(r3)
            if (r0 == 0) goto L_0x030c
            X.283 r2 = r6.A04
            X.JVj r1 = r2.A0C
            X.4yP r0 = r6.A0J()
            if (r0 == 0) goto L_0x030c
            if (r1 == 0) goto L_0x030c
            java.lang.String r0 = "IG_CAMERA_VIDEO_COVER_PHOTO_EDIT_DONE"
            r3.A0t(r0)
            java.lang.String r0 = "VIDEO_COVER_PHOTO_EDIT_DONE"
            X.JTS.A1F(r3, r6, r0)
            X.JTQ.A1B(r3, r2)
            r3.A0d(r1)
            X.28t r0 = r2.A0A
            r3.A0c(r0)
            int r0 = r2.A00
            X.JYm r1 = X.2AL.A03(r0)
            java.lang.String r0 = "media_source"
            r3.A0M(r1, r0)
            X.JTQ.A1A(r3)
            X.JTQ.A18(r3, r6)
            X.JTS.A1E(r3)
        L_0x030c:
            com.instagram.creation.sharesheet.coverphoto.ClipsCoverPhotoPickerController r1 = r5.A01()
            r0 = 1
            r1.A02(r0)
            boolean r0 = r5 instanceof X.C61813KNc
            if (r0 == 0) goto L_0x0356
            X.KNc r5 = (X.C61813KNc) r5
            X.Ji7 r0 = r5.A02
            java.lang.String r3 = "videoScrubbingViewModel"
            r1 = 0
            if (r0 == 0) goto L_0x0aa3
            X.2Fk r0 = r0.A09
            java.lang.Object r0 = r0.A02()
            X.JwK r0 = (X.C61082JwK) r0
            if (r0 == 0) goto L_0x032d
            java.lang.Object r1 = r0.A00
        L_0x032d:
            boolean r0 = r1 instanceof X.C62122KaY
            if (r0 != 0) goto L_0x0335
            boolean r0 = r1 instanceof X.C62124Kaa
            if (r0 == 0) goto L_0x0356
        L_0x0335:
            X.Jg9 r2 = r5.A03
            if (r2 != 0) goto L_0x033d
            java.lang.String r3 = "reselectCoverPhotoViewModel"
            goto L_0x0aa3
        L_0x033d:
            X.Ji7 r0 = r5.A02
            if (r0 == 0) goto L_0x0aa3
            X.2Fk r0 = r0.A07
            java.lang.Object r1 = r0.A02()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0356
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0356
            X.2Fj r0 = r2.A01
            r0.A0B(r1)
        L_0x0356:
            r0 = -1455118441(0xffffffffa944a797, float:-4.3666104E-14)
            goto L_0x0bf2
        L_0x035b:
            r0 = 1377804664(0x521fa178, float:1.71402199E11)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r11.A01
            X.K5b r4 = (X.C61383K5b) r4
            X.0eM r0 = r4.A01
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.L4H r0 = X.C63209KtG.A00(r0)
            X.1QP r3 = r0.A01
            long r1 = r0.A00
            java.lang.String r0 = "COVER_PHOTO_CANCELLED"
            r3.flowMarkPoint(r1, r0)
            X.DbT.A1J(r4)
            r0 = -1438807840(0xffffffffaa3d88e0, float:-1.683406E-13)
            goto L_0x0790
        L_0x0381:
            r0 = 295287409(0x1199ba71, float:2.4254047E-28)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r11.A01
            X.K7V r0 = (X.K7V) r0
            X.KHW r0 = r0.A01
            if (r0 == 0) goto L_0x03e7
            X.7Pu r0 = r0.A01
            X.DbW.A1K(r0)
            r0 = -111173209(0xfffffffff95fa1a7, float:-7.2572556E34)
            goto L_0x0790
        L_0x039a:
            r0 = -645552017(0xffffffffd985a86f, float:-4.7026708E15)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r11.A01
            X.K7V r2 = (X.K7V) r2
            X.0eM r0 = r2.A05
            X.JiG r0 = X.JTT.A0P(r0)
            X.05G r1 = r0.A06
            X.KgY r0 = X.C62483KgY.CLOSE_FRIENDS_LIST
            r1.Epw(r0)
            X.0eM r0 = r2.A04
            X.27r r2 = X.C51971G9r.A0g(r0)
            X.283 r0 = r2.A04
            X.JVj r1 = r0.A0C
            X.4yP r0 = r2.A0J()
            if (r0 == 0) goto L_0x03c9
            if (r1 == 0) goto L_0x03c9
            java.lang.String r0 = "CLOSE_FRIENDS_LIST_ADD_PEOPLE_BUTTON"
            r2.A1Q(r1, r0)
        L_0x03c9:
            r0 = 378501646(0x168f7a0e, float:2.3179923E-25)
            goto L_0x0bf2
        L_0x03ce:
            r0 = -1821535385(0xffffffff936d9367, float:-2.998628E-27)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r11.A01
            X.K7V r0 = (X.K7V) r0
            X.KHW r0 = r0.A01
            if (r0 == 0) goto L_0x03e7
            X.7Pu r0 = r0.A01
            X.DbW.A1K(r0)
            r0 = -1756120211(0xffffffff9753bb6d, float:-6.841434E-25)
            goto L_0x0790
        L_0x03e7:
            java.lang.String r0 = "radioButtonsView"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x03f1:
            r0 = 1239859277(0x49e6c04d, float:1890313.6)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r11.A01
            X.Dba.A1Q(r0)
            r0 = -61423983(0xfffffffffc56be91, float:-4.4600667E36)
            goto L_0x0790
        L_0x0402:
            r0 = 1937528141(0x737c554d, float:1.9991896E31)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r11.A01
            X.Dba.A1Q(r0)
            r0 = 1926254009(0x72d04db9, float:8.251756E30)
            goto L_0x0790
        L_0x0413:
            r0 = -239511910(0xfffffffff1b9569a, float:-1.8355015E30)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r11.A01
            X.K66 r7 = (X.K66) r7
            X.0eM r3 = r7.A0T
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r3)
            boolean r0 = X.K66.A0R(r7)
            java.lang.Integer r6 = X.C59762JXa.A01(r2, r0)
            if (r6 == 0) goto L_0x0463
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r3)
            android.content.Context r4 = r7.requireContext()
            r0 = 39
            X.MMm r2 = X.C66303MMm.A01(r7, r0)
            r3 = 0
            X.0qQ.A0B(r5, r3)
            r0 = 28
            X.MMf r0 = X.C66296MMf.A00(r2, r0)
            X.E6F r2 = new X.E6F
            r2.<init>(r5, r6, r0)
            X.7Pr r0 = X.DbS.A0W(r5)
            r0.A0T = r2
            X.DbS.A1S(r0, r3)
            X.7Pu r0 = r0.A00()
            r0.A03(r4, r2)
            X.27p.A01(r5)
        L_0x045e:
            r0 = -1729541097(0xffffffff98e94c17, float:-6.030592E-24)
            goto L_0x0bcb
        L_0x0463:
            X.K66.A0F(r7)
            goto L_0x045e
        L_0x0467:
            r0 = 720237879(0x2aedf537, float:4.226981E-13)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r11.A01
            X.K66 r1 = (X.K66) r1
            r0 = 1
            X.K66.A0P(r1, r0)
            r0 = 1616608186(0x605b7bba, float:6.3261756E19)
            goto L_0x0790
        L_0x047b:
            r0 = 1630605639(0x61311147, float:2.0414492E20)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r11.A01
            X.K66 r0 = (X.K66) r0
            r0.D4t()
            r0 = -2028700486(0xffffffff87147cba, float:-1.1170936E-34)
            goto L_0x0790
        L_0x048e:
            r0 = -1322597670(0xffffffffb12ac2da, float:-2.4849016E-9)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r11.A01
            X.K66 r0 = (X.K66) r0
            r0.D4q()
            r0 = -68995102(0xfffffffffbe337e2, float:-2.3595696E36)
            goto L_0x0790
        L_0x04a1:
            r0 = -1009295716(0xffffffffc3d75e9c, float:-430.73914)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r11.A01
            X.K66 r1 = (X.K66) r1
            java.lang.String r0 = r1.getModuleName()
            X.K66.A0M(r1, r0)
            r0 = -701815352(0xffffffffd62b25c8, float:-4.7044689E13)
            goto L_0x0790
        L_0x04b8:
            r0 = 1371813823(0x51c437bf, float:1.05343607E11)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r11.A01
            X.K66 r1 = (X.K66) r1
            java.lang.String r0 = r1.getModuleName()
            X.K66.A0M(r1, r0)
            r0 = -750958771(0xffffffffd33d474d, float:-8.1294505E11)
            goto L_0x0790
        L_0x04cf:
            r0 = 52504320(0x3212700, float:4.7358417E-37)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r11.A01
            X.K66 r3 = (X.K66) r3
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel r2 = X.K66.A01(r3)
            boolean r0 = r2.A07()
            if (r0 == 0) goto L_0x04ed
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r1 = r2.A07
            X.5kq r0 = r2.A03()
            r1.A0M(r0)
        L_0x04ed:
            r1 = 0
            r0 = 0
            X.K66.A0A(r0, r3, r1)
            r0 = 350004572(0x14dca55c, float:2.2279546E-26)
            goto L_0x0bf2
        L_0x04f7:
            r0 = -1113872031(0xffffffffbd9ba961, float:-0.07600666)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r11.A01
            X.K66 r0 = (X.K66) r0
            X.LBG r0 = r0.A06
            if (r0 == 0) goto L_0x0529
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r0 = r0.A0A
            X.0nA.A0N(r0)
            r0 = 47350289(0x2d28211, float:3.0931381E-37)
            goto L_0x0790
        L_0x0510:
            r0 = 1923370223(0x72a44cef, float:6.508614E30)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r11.A01
            X.K66 r0 = (X.K66) r0
            X.LBG r0 = r0.A06
            if (r0 == 0) goto L_0x0529
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r0 = r0.A0A
            X.0nA.A0N(r0)
            r0 = 234549664(0xdfaf1a0, float:1.5465609E-30)
            goto L_0x0790
        L_0x0529:
            java.lang.String r0 = "viewHolder"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0533:
            r0 = -1052598732(0xffffffffc1429e34, float:-12.163624)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r11.A01
            com.instagram.creation.publishscreen.fragment.clips.ClipsProfileVisibilityFragment r0 = (com.instagram.creation.publishscreen.fragment.clips.ClipsProfileVisibilityFragment) r0
            X.0eM r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            X.Jg5 r0 = (X.C60124Jg5) r0
            X.05G r0 = r0.A01
            X.JTR.A1W(r0)
            r0 = 291233135(0x115bdd6f, float:1.7344288E-28)
            goto L_0x0790
        L_0x0550:
            r0 = -240520724(0xfffffffff1a9f1ec, float:-1.6830538E30)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r11.A01
            X.K69 r1 = (X.K69) r1
            X.L0r r0 = r1.A00
            if (r0 == 0) goto L_0x0579
            java.lang.String r6 = r1.A03
            X.K66 r5 = r0.A00
            X.0eM r0 = r5.A0T
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324746035933523(0x810d2a00073153, double:3.0352538889118037E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x057e
            X.K66.A0F(r5)
        L_0x0579:
            r0 = -1298423233(0xffffffffb29ba23f, float:-1.8118156E-8)
            goto L_0x0bf2
        L_0x057e:
            r5.A0T(r6)
            goto L_0x0579
        L_0x0582:
            r0 = -398087894(0xffffffffe845a92a, float:-3.733707E24)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r11.A01
            X.K69 r0 = (X.K69) r0
            X.L0r r0 = r0.A00
            if (r0 == 0) goto L_0x059a
            X.K66 r1 = r0.A00
            java.lang.String r0 = r1.getModuleName()
            X.K66.A0M(r1, r0)
        L_0x059a:
            r0 = 2016625806(0x7833448e, float:1.4543931E34)
            goto L_0x0bf2
        L_0x059f:
            r0 = -908201064(0xffffffffc9ddf398, float:-1818227.0)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r11.A01
            X.Dba.A1Q(r0)
            r0 = -499819784(0xffffffffe2355af8, float:-8.363539E20)
            goto L_0x0790
        L_0x05b0:
            r0 = 2034237425(0x793ffff1, float:6.230749E34)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r11.A01
            X.K53 r4 = (X.K53) r4
            X.0eM r0 = r4.A04
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.L4H r0 = X.C63209KtG.A00(r0)
            X.1QP r3 = r0.A01
            long r1 = r0.A00
            java.lang.String r0 = "ADVANCED_SETTINGS_EXITED"
            r3.flowMarkPoint(r1, r0)
            X.DbT.A1J(r4)
            r0 = 1577246036(0x5e02dd54, float:2.35744639E18)
            goto L_0x0790
        L_0x05d6:
            r0 = 1956670959(0x74a06def, float:1.0168423E32)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r11.A01
            com.instagram.creation.photo.edit.ui.util.IgMultiListenerSimpleImageView r1 = (com.instagram.creation.photo.edit.ui.util.IgMultiListenerSimpleImageView) r1
            android.view.View$OnClickListener r0 = r1.A00
            if (r0 == 0) goto L_0x05e8
            r0.onClick(r12)
        L_0x05e8:
            java.util.List r0 = r1.A01
            java.util.Iterator r1 = r0.iterator()
        L_0x05ee:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x05fe
            java.lang.Object r0 = r1.next()
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r0.onClick(r12)
            goto L_0x05ee
        L_0x05fe:
            r0 = -1265430342(0xffffffffb49310ba, float:-2.7393054E-7)
            goto L_0x0c22
        L_0x0603:
            r0 = -536985248(0xffffffffdffe4160, float:-3.664206E19)
            int r6 = X.AnonymousClass0fD.A05(r0)
            X.JcW r1 = A00(r11)
            r0 = 0
            r1.A0A(r0)
            r0 = -1081874974(0xffffffffbf83e5e2, float:-1.030453)
            goto L_0x0790
        L_0x0617:
            r0 = 1260452813(0x4b20fbcd, float:1.0550221E7)
            int r6 = X.AnonymousClass0fD.A05(r0)
            X.JcW r1 = A00(r11)
            r0 = 1
            r1.A0A(r0)
            r0 = -2072568452(0xffffffff84771d7c, float:-2.9048249E-36)
            goto L_0x0790
        L_0x062b:
            r0 = -1329057756(0xffffffffb0c83024, float:-1.4565598E-9)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r11.A01
            X.JcV r4 = (X.C59962JcV) r4
            java.lang.Object r1 = X.C61080JwI.A01(r4)
            X.MVo r1 = (X.C66534MVo) r1
            boolean r0 = r1 instanceof X.C65499LuN
            if (r0 == 0) goto L_0x065a
            X.LuN r1 = (X.C65499LuN) r1
            X.Kk4 r3 = r1.A00
        L_0x0644:
            X.JcW r1 = X.C59962JcV.A01(r4)
            r0 = 0
            r1.A0A(r0)
            X.LG9 r1 = r4.A0L
            if (r1 == 0) goto L_0x0655
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r1.A02(r3, r0)
        L_0x0655:
            r0 = -653742201(0xffffffffd908af87, float:-2.40459945E15)
            goto L_0x0c22
        L_0x065a:
            r3 = 0
            goto L_0x0644
        L_0x065c:
            r0 = -1692453355(0xffffffff9b1f3615, float:-1.3169647E-22)
            int r6 = X.AnonymousClass0fD.A05(r0)
            X.JcW r1 = A00(r11)
            r0 = 0
            r1.A0A(r0)
            r0 = -1164745201(0xffffffffba93660f, float:-0.0011245626)
            goto L_0x0790
        L_0x0670:
            r0 = 825291090(0x3130f152, float:2.5748546E-9)
            int r6 = X.AnonymousClass0fD.A05(r0)
            X.JcW r1 = A00(r11)
            r0 = 1
            r1.A0A(r0)
            r0 = 785221043(0x2ecd85b3, float:9.3460704E-11)
            goto L_0x0790
        L_0x0684:
            r0 = 1045674808(0x3e53bb38, float:0.20676887)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r11.A01
            X.JcV r1 = (X.C59962JcV) r1
            X.80Q r0 = r1.A0I
            if (r0 == 0) goto L_0x069a
            X.JcW r0 = X.C59962JcV.A01(r1)
            r0.A06()
        L_0x069a:
            r0 = -20815692(0xfffffffffec260b4, float:-1.2918617E38)
            goto L_0x0bf2
        L_0x069f:
            r0 = 1208877216(0x480e00a0, float:145410.5)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r11.A01
            X.JcV r1 = (X.C59962JcV) r1
            X.80Q r0 = r1.A0I
            if (r0 == 0) goto L_0x06b5
            X.JcW r0 = X.C59962JcV.A01(r1)
            r0.A07()
        L_0x06b5:
            r0 = 1776247335(0x69df6227, float:3.3756746E25)
            goto L_0x0bf2
        L_0x06ba:
            r0 = 1356880460(0x50e05a4c, float:3.01121126E10)
            int r6 = X.AnonymousClass0fD.A05(r0)
            X.JcW r5 = A00(r11)
            X.05G r4 = r5.A0M
        L_0x06c7:
            java.lang.Object r3 = r4.getValue()
            r2 = r3
            X.JcX r2 = (X.C59964JcX) r2
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r1 = 0
            boolean r0 = X.C59964JcX.A01(r2, r0, r3, r4)
            if (r0 == 0) goto L_0x06c7
            r5.A04 = r1
            r0 = 1458225244(0x56eac05c, float:1.29055949E14)
            goto L_0x0790
        L_0x06de:
            r0 = -2021432685(0xffffffff87836293, float:-1.9768626E-34)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r11.A01
            X.JcV r0 = (X.C59962JcV) r0
            X.JcW r3 = X.C59962JcV.A01(r0)
            android.content.Context r4 = r0.requireContext()
            X.82p r6 = r0.A0F
            if (r6 != 0) goto L_0x06ff
            java.lang.String r0 = "cameraSession"
        L_0x06f7:
            X.0qQ.A0F(r0)
            X.00P r2 = X.AnonymousClass00P.createAndThrow()
            throw r2
        L_0x06ff:
            X.4mi r5 = r0.A0P
            if (r5 != 0) goto L_0x0706
            java.lang.String r0 = "provider"
            goto L_0x06f7
        L_0x0706:
            X.82q r0 = r0.A0G
            if (r0 != 0) goto L_0x070d
            java.lang.String r0 = "creationCameraSession"
            goto L_0x06f7
        L_0x070d:
            com.instagram.creation.base.PhotoSession r7 = X.JWE.A02(r0)
            if (r7 == 0) goto L_0x0726
            r9 = 3
            X.6oS r0 = X.C318116oQ.A00(r3)
            r8 = 0
            X.MGM r2 = new X.MGM
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            X.AnonymousClass7TE.A1Z(r2, r0)
            r0 = 1616524546(0x605a3502, float:6.2893903E19)
            goto L_0x0bcb
        L_0x0726:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
            r0 = -1359825735(0xffffffffaef2b4b9, float:-1.1036989E-10)
            X.AnonymousClass0fD.A0C(r0, r1)
            throw r2
        L_0x0731:
            r0 = 1780513611(0x6a207b4b, float:4.850259E25)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r11.A01
            X.JcV r0 = (X.C59962JcV) r0
            X.C59962JcV.A06(r0)
            r0 = -1937139060(0xffffffff8c899a8c, float:-2.1201207E-31)
            goto L_0x0790
        L_0x0743:
            r0 = 1658727072(0x62de2aa0, float:2.0491243E21)
            int r6 = X.AnonymousClass0fD.A05(r0)
            X.JcW r1 = A00(r11)
            r0 = 0
            X.C59963JcW.A02(r1, r0, r0)
            r0 = 1248484142(0x4a6a5b2e, float:3839691.5)
            goto L_0x0790
        L_0x0756:
            r0 = -1207578482(0xffffffffb805d08e, float:-3.1903903E-5)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r11.A01
            X.JcV r1 = (X.C59962JcV) r1
            X.82q r0 = r1.A0G
            java.lang.String r3 = "creationCameraSession"
            if (r0 == 0) goto L_0x0aa3
            r5 = 1
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r0 = r0.A01
            r0.A0J = r5
            com.instagram.creation.base.PhotoSession r0 = r0.A02()
            r0.getClass()
            X.MRp r0 = r0.A0E
            r0.EK1()
            X.0eM r0 = r1.A0i
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r3 = "album_add"
            r2 = 0
            X.Kgp r1 = X.C62499Kgp.A04
            X.KPZ r0 = new X.KPZ
            r0.<init>(r1, r3, r5, r2)
            X.C59888JbD.A01(r4, r0)
            r0 = -137179571(0xfffffffff7d2ce4d, float:-8.551302E33)
        L_0x0790:
            X.AnonymousClass0fD.A0C(r0, r6)
            return
        L_0x0794:
            r0 = -774938373(0xffffffffd1cf60fb, float:-1.11335662E11)
            int r4 = X.AnonymousClass0fD.A05(r0)
            X.JcW r5 = A00(r11)
            X.05G r3 = r5.A0M
        L_0x07a1:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            X.JcX r1 = (X.C59964JcX) r1
            X.0Ud r0 = r5.A0R
            java.lang.Object r0 = r0.getValue()
            X.JcX r0 = (X.C59964JcX) r0
            java.lang.Object r0 = r0.A02
            java.lang.Integer r0 = (java.lang.Integer) r0
            boolean r0 = X.C59964JcX.A01(r1, r0, r2, r3)
            if (r0 == 0) goto L_0x07a1
            r0 = 1215941732(0x4879cc64, float:255793.56)
            goto L_0x0bf2
        L_0x07bf:
            r0 = -1208574724(0xffffffffb7f69cfc, float:-2.9398587E-5)
            int r4 = X.AnonymousClass0fD.A05(r0)
            X.JcW r6 = A00(r11)
            X.05G r5 = r6.A0M
        L_0x07cc:
            java.lang.Object r3 = r5.getValue()
            r2 = r3
            X.JcX r2 = (X.C59964JcX) r2
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r1 = 0
            boolean r0 = X.C59964JcX.A01(r2, r0, r3, r5)
            if (r0 == 0) goto L_0x07cc
            r6.A04 = r1
            r0 = 1715647962(0x6642b5da, float:2.2987342E23)
            goto L_0x0bf2
        L_0x07e3:
            r0 = -1468702691(0xffffffffa875601d, float:-1.3621073E-14)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r11.A01
            X.JcV r0 = (X.C59962JcV) r0
            X.C59962JcV.A06(r0)
            r0 = -1517495491(0xffffffffa58cdb3d, float:-2.443469E-16)
            goto L_0x0bf2
        L_0x07f6:
            r0 = -1587796500(0xffffffffa15c25ec, float:-7.458909E-19)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r11.A01
            X.JcV r2 = (X.C59962JcV) r2
            X.JcW r1 = X.C59962JcV.A01(r2)
            r0 = 0
            r1.A0A(r0)
            X.JcW r0 = X.C59962JcV.A01(r2)
            X.MWw r1 = r0.A01
            if (r1 == 0) goto L_0x0821
            X.Jq4 r2 = r2.A0A
            if (r2 == 0) goto L_0x0821
            java.util.List r0 = r2.A03
            int r1 = r0.indexOf(r1)
            r0 = -1
            if (r1 <= r0) goto L_0x0821
            r2.A1I(r1)
        L_0x0821:
            r0 = 1832957987(0x6d40b823, float:3.727733E27)
            goto L_0x0bf2
        L_0x0826:
            r0 = -2100835508(0xffffffff82c7cb4c, float:-2.9357109E-37)
            int r4 = X.AnonymousClass0fD.A05(r0)
            X.JcW r1 = A00(r11)
            r0 = 1
            r1.A0A(r0)
            r0 = -1018887652(0xffffffffc345021c, float:-197.00824)
            goto L_0x0bf2
        L_0x083a:
            r0 = 2052669907(0x7a5941d3, float:2.8201587E35)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r11.A01
            X.Lkf r3 = (X.C64940Lkf) r3
            boolean r0 = r3.A0J
            java.lang.String r2 = "Required value was null."
            if (r0 == 0) goto L_0x085e
            int r1 = r3.A03
            r3.A05 = r1
            com.instagram.ui.igeditseekbar.IgEditSeekBar r0 = r3.A0H
            if (r0 != 0) goto L_0x086e
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r2)
            r0 = -918226878(0xffffffffc944f842, float:-806788.1)
        L_0x085a:
            X.AnonymousClass0fD.A0C(r0, r4)
            throw r1
        L_0x085e:
            int r1 = r3.A02
            r3.A00 = r1
            com.instagram.ui.igeditseekbar.IgEditSeekBar r0 = r3.A0H
            if (r0 != 0) goto L_0x086e
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r2)
            r0 = -409612183(0xffffffffe795d069, float:-1.4149542E24)
            goto L_0x085a
        L_0x086e:
            r0.setCurrentValue(r1)
            X.2cs r0 = r3.A0D
            if (r0 == 0) goto L_0x08ab
            r0.A03()
            android.view.View r0 = r3.A09
            if (r0 == 0) goto L_0x08a3
            r0.bringToFront()
            android.view.View r0 = r3.A08
            if (r0 == 0) goto L_0x089b
            r1 = 0
            r0.setVisibility(r1)
            android.view.View r0 = r3.A09
            if (r0 == 0) goto L_0x0893
            r0.setVisibility(r1)
            r0 = 1298763886(0x4d69906e, float:2.44909792E8)
            goto L_0x0bf2
        L_0x0893:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r2)
            r0 = 1826886800(0x6ce41490, float:2.2058575E27)
            goto L_0x085a
        L_0x089b:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r2)
            r0 = 2144528232(0x7fd2e768, float:NaN)
            goto L_0x085a
        L_0x08a3:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r2)
            r0 = 1869247596(0x6f6a746c, float:7.256024E28)
            goto L_0x085a
        L_0x08ab:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r2)
            r0 = -810015848(0xffffffffcfb82398, float:-6.1786808E9)
            goto L_0x085a
        L_0x08b3:
            r0 = 24435864(0x174dc98, float:4.497399E-38)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r11.A01
            X.Lkf r4 = (X.C64940Lkf) r4
            boolean r0 = r4.A0J
            if (r0 == 0) goto L_0x08ea
            int r0 = r4.A05
            r4.A03 = r0
        L_0x08c6:
            X.2cs r0 = r4.A0D
            java.lang.String r3 = "Required value was null."
            if (r0 == 0) goto L_0x08ff
            r0.A03()
            android.view.View r0 = r4.A09
            if (r0 == 0) goto L_0x08f7
            r0.bringToFront()
            android.view.View r0 = r4.A08
            if (r0 == 0) goto L_0x0907
            r1 = 0
            r0.setVisibility(r1)
            android.view.View r0 = r4.A09
            if (r0 == 0) goto L_0x08ef
            r0.setVisibility(r1)
            r0 = 1721428453(0x669ae9e5, float:3.657795E23)
            goto L_0x0c22
        L_0x08ea:
            int r0 = r4.A00
            r4.A02 = r0
            goto L_0x08c6
        L_0x08ef:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r3)
            r0 = 1817310337(0x6c51f481, float:1.0152805E27)
            goto L_0x090e
        L_0x08f7:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r3)
            r0 = 1818022646(0x6c5cd2f6, float:1.06783966E27)
            goto L_0x090e
        L_0x08ff:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r3)
            r0 = 557867139(0x21406083, float:6.517986E-19)
            goto L_0x090e
        L_0x0907:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r3)
            r0 = -936114012(0xffffffffc83408a4, float:-184354.56)
        L_0x090e:
            X.AnonymousClass0fD.A0C(r0, r2)
            throw r1
        L_0x0912:
            r0 = -957291239(0xffffffffc6f0e519, float:-30834.549)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r11.A01
            X.Lkf r5 = (X.C64940Lkf) r5
            boolean r0 = r5.A0J
            java.lang.String r3 = "Required value was null."
            if (r0 == 0) goto L_0x0956
            android.widget.TextView r1 = r5.A0B
            if (r1 == 0) goto L_0x096f
            int r0 = r5.A04
            r1.setTextColor(r0)
            android.widget.TextView r1 = r5.A0C
            if (r1 == 0) goto L_0x096a
            int r0 = r5.A07
            r1.setTextColor(r0)
            r2 = 0
            r5.A0J = r2
            com.instagram.ui.igeditseekbar.IgEditSeekBar r1 = r5.A0H
            if (r1 == 0) goto L_0x0965
            int r0 = r5.A00
            r1.setCurrentValue(r0)
            int r0 = r5.A01
            X.C64940Lkf.A01(r5, r0)
            com.instagram.creation.photo.edit.tint.IgTintColorPicker r1 = r5.A0E
            if (r1 == 0) goto L_0x0960
            int r0 = r5.A01
            r1.setCurrentColor(r0)
            com.instagram.creation.photo.edit.tint.IgTintColorPicker r0 = r5.A0E
            if (r0 == 0) goto L_0x095b
            r0.setAdjustingShadows(r2)
        L_0x0956:
            r0 = -716198210(0xffffffffd54faebe, float:-1.42718387E13)
            goto L_0x0bf2
        L_0x095b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x0960:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x0965:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x096a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x096f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x0974:
            r0 = 1886509149(0x7071d85d, float:2.9938982E29)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r11.A01
            X.Lkf r5 = (X.C64940Lkf) r5
            boolean r0 = r5.A0J
            java.lang.String r3 = "Required value was null."
            if (r0 != 0) goto L_0x09b8
            android.widget.TextView r1 = r5.A0C
            if (r1 == 0) goto L_0x09d1
            int r0 = r5.A04
            r1.setTextColor(r0)
            android.widget.TextView r1 = r5.A0B
            if (r1 == 0) goto L_0x09cc
            int r0 = r5.A07
            r1.setTextColor(r0)
            r2 = 1
            r5.A0J = r2
            com.instagram.ui.igeditseekbar.IgEditSeekBar r1 = r5.A0H
            if (r1 == 0) goto L_0x09c7
            int r0 = r5.A05
            r1.setCurrentValue(r0)
            int r0 = r5.A06
            X.C64940Lkf.A01(r5, r0)
            com.instagram.creation.photo.edit.tint.IgTintColorPicker r1 = r5.A0E
            if (r1 == 0) goto L_0x09c2
            int r0 = r5.A06
            r1.setCurrentColor(r0)
            com.instagram.creation.photo.edit.tint.IgTintColorPicker r0 = r5.A0E
            if (r0 == 0) goto L_0x09bd
            r0.setAdjustingShadows(r2)
        L_0x09b8:
            r0 = -257197890(0xfffffffff0ab78be, float:-4.2454324E29)
            goto L_0x0bf2
        L_0x09bd:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x09c2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x09c7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x09cc:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x09d1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x09d6:
            java.lang.Object r0 = r11.A01
            X.Lkh r0 = (X.C64942Lkh) r0
            com.instagram.creation.base.ui.sliderview.SliderView r2 = r0.A06
            r2.getClass()
            r1 = 0
            r0 = 0
            r2.A02(r0, r1)
            return
        L_0x09e5:
            r0 = -336229540(0xffffffffebf58b5c, float:-5.9368986E26)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r11.A01
            X.K6Y r5 = (X.K6Y) r5
            X.0vF r0 = X.K6Y.A0O
            java.lang.Class<X.4cJ> r0 = X.C267844cJ.class
            java.lang.Object r0 = r5.requireContextAs(r0)
            X.82q r4 = X.JTR.A0k(r0)
            X.514 r0 = r4.ANP()
            int r3 = r0.A01
            X.514 r1 = X.AnonymousClass514.SQUARE
            int r0 = r1.A01
            if (r3 != r0) goto L_0x0a0a
            X.514 r1 = X.AnonymousClass514.FOUR_BY_FIVE
        L_0x0a0a:
            r0 = r4
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r0 = r0.A01
            r0.A05 = r1
            com.instagram.creation.photo.crop.CropImageView r3 = r5.A06
            if (r3 == 0) goto L_0x0a22
            X.514 r1 = r4.ANP()
            X.514 r0 = X.AnonymousClass514.FOUR_BY_FIVE
            boolean r0 = X.AnonymousClass7TF.A1W(r1, r0)
            r3.A0M(r0)
        L_0x0a22:
            r0 = 2021095609(0x787778b9, float:2.0077279E34)
            goto L_0x0c22
        L_0x0a27:
            r0 = 1858475355(0x6ec6155b, float:3.0651925E28)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r11.A01
            X.K6Y r0 = (X.K6Y) r0
            X.K6Y.A01(r0)
            r0 = -1569549267(0xffffffffa272942d, float:-3.287556E-18)
            goto L_0x0bf2
        L_0x0a3a:
            r0 = 45317593(0x2b37dd9, float:2.637392E-37)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r11.A01
            X.K6Y r1 = (X.K6Y) r1
            X.0vF r0 = X.K6Y.A0O
            X.4mn r0 = r1.A05
            if (r0 == 0) goto L_0x0a4e
            r0.D0W()
        L_0x0a4e:
            r0 = -626706681(0xffffffffdaa53707, float:-2.32519372E16)
            goto L_0x0bf2
        L_0x0a53:
            r0 = 1990537876(0x76a53294, float:1.6753024E33)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r11.A01
            X.JlX r0 = (X.C60439JlX) r0
            X.MV6 r0 = r0.A04
            r0.E0l()
            r0 = -1136103909(0xffffffffbc486e1b, float:-0.012233282)
            goto L_0x0bf2
        L_0x0a68:
            r0 = 1019859975(0x3cc9d407, float:0.024637235)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r11.A01
            X.Dbb.A1S(r0)
            r0 = 1604158053(0x5f9d8265, float:2.269949E19)
            goto L_0x0bf2
        L_0x0a79:
            r0 = 1230032528(0x4950ce90, float:855273.0)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r11.A01
            X.Dbb.A1S(r0)
            r0 = 849398825(0x32a0cc29, float:1.8719293E-8)
            goto L_0x0bf2
        L_0x0a8a:
            r0 = 1235643676(0x49a66d1c, float:1363363.5)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r11.A01
            X.K6k r3 = (X.C61413K6k) r3
            X.0eM r0 = r3.A06
            X.27r r5 = X.C51971G9r.A0g(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = X.1Xj.A0i
            java.lang.String r0 = r3.A02
            if (r0 != 0) goto L_0x0aab
            java.lang.String r3 = "mediaId"
        L_0x0aa3:
            X.0qQ.A0F(r3)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0aab:
            java.lang.String r2 = X.1Xv.A06(r0)
            com.instagram.music.common.model.AudioOverlayTrack r0 = r3.A00
            if (r0 == 0) goto L_0x0baa
            java.lang.String r1 = r0.A0A
            java.lang.String r0 = "AUDIO_EDITOR_PAGE_DONE_BUTTON"
            r5.A1w(r0, r2, r1)
            X.8a4 r0 = r3.A01
            if (r0 != 0) goto L_0x0ac1
            java.lang.String r3 = "musicOverlayEditController"
            goto L_0x0aa3
        L_0x0ac1:
            com.instagram.music.common.model.TrackSnippet r1 = r0.A0D()
            com.instagram.music.common.model.AudioOverlayTrack r0 = r3.A00
            if (r0 == 0) goto L_0x0baa
            android.content.Intent r2 = X.JTV.A00(r0, r1)
            java.lang.String r1 = r3.A03
            if (r1 != 0) goto L_0x0ad4
            java.lang.String r3 = "musicBrowseSessionFullId"
            goto L_0x0aa3
        L_0x0ad4:
            java.lang.String r0 = "args_music_browse_session_full_id"
            r2.putExtra(r0, r1)
            androidx.fragment.app.FragmentActivity r0 = r3.requireActivity()
            X.Dba.A0k(r0, r2)
            X.DbX.A1J(r3)
            X.DbZ.A17(r3)
            r0 = 890600451(0x35157c03, float:5.5687286E-7)
            goto L_0x0bf2
        L_0x0aeb:
            r0 = 1270420012(0x4bb9122c, float:2.4257624E7)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r11.A01
            X.Dbb.A1S(r0)
            r0 = -1853199707(0xffffffff918a6aa5, float:-2.1838286E-28)
            goto L_0x0bcb
        L_0x0afc:
            r0 = -1085050269(0xffffffffbf537263, float:-0.82596415)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r11.A01
            com.instagram.creation.fragment.EditMediaInfoFragment r1 = (com.instagram.creation.fragment.EditMediaInfoFragment) r1
            r0 = 0
            r1.A0M = r0
            r1.A0S = r0
            com.instagram.creation.fragment.EditMediaInfoFragment.A0E(r1)
            com.instagram.creation.fragment.EditMediaInfoFragment.A07(r1)
            r0 = -1200555812(0xffffffffb870f8dc, float:-5.7452227E-5)
            goto L_0x0bf2
        L_0x0b17:
            r0 = 2055245676(0x7a808f6c, float:3.3376147E35)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r11.A01
            X.LG9 r4 = (X.LG9) r4
            X.LuN r3 = r4.A01
            X.3Q2 r0 = r3.A08
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = r0.A1J
            if (r0 == 0) goto L_0x0b3b
            X.MVP r1 = r4.A00
            r0 = 0
            r1.EuQ(r3, r0)
            r3.A02()
            r3.onResume()
        L_0x0b36:
            r0 = -319415520(0xffffffffecf61b20, float:-2.3801908E27)
            goto L_0x0c22
        L_0x0b3b:
            java.lang.Integer r1 = X.AnonymousClass05K.A02
            r0 = 0
            r4.A02(r0, r1)
            goto L_0x0b36
        L_0x0b42:
            r0 = 377613606(0x1681ed26, float:2.0990736E-25)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r11.A01
            X.Dbb.A1S(r0)
            r0 = -909831158(0xffffffffc9c5140a, float:-1614465.2)
            goto L_0x0bcb
        L_0x0b52:
            r0 = -1796256446(0xffffffff94ef4d42, float:-2.4163306E-26)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r11.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.content.Intent r1 = X.DbS.A09()
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
            X.Dba.A0k(r0, r1)
            r0 = -1249680059(0xffffffffb5836545, float:-9.789734E-7)
            goto L_0x0bf2
        L_0x0b6d:
            r0 = 1724699352(0x66ccd2d8, float:4.8362607E23)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r11.A01
            X.K6j r3 = (X.C61412K6j) r3
            X.0eM r2 = r3.A06
            X.27r r5 = X.C51971G9r.A0g(r2)
            X.JVj r6 = X.C59725JVj.SHARE_SHEET
            java.lang.String r8 = "AUDIO_EDITOR_PAGE_DONE_BUTTON"
            r10 = 0
            r7 = 0
            r9 = r7
            r5.A1K(r6, r7, r8, r9, r10)
            X.8a4 r0 = r3.A02
            if (r0 == 0) goto L_0x0bb4
            com.instagram.music.common.model.TrackSnippet r1 = r0.A0D()
            com.instagram.music.common.model.AudioOverlayTrack r0 = r3.A01
            if (r0 == 0) goto L_0x0baa
            android.content.Intent r1 = X.JTV.A00(r0, r1)
            androidx.fragment.app.FragmentActivity r0 = r3.requireActivity()
            X.Dba.A0k(r0, r1)
            X.29H r0 = X.JTS.A0K(r2)
            r0.A01()
            r0 = 1421264587(0x54b6c6cb, float:6.2801539E12)
            goto L_0x0bf2
        L_0x0baa:
            java.lang.String r0 = "audioTrack"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0bb4:
            X.JTT.A0x()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0bbc:
            r0 = -1054494008(0xffffffffc125b2c8, float:-10.356148)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r11.A01
            X.Dbb.A1S(r0)
            r0 = -344951321(0xffffffffeb7075e7, float:-2.9069897E26)
        L_0x0bcb:
            X.AnonymousClass0fD.A0C(r0, r1)
            return
        L_0x0bcf:
            r0 = 774576950(0x2e2b1b36, float:3.8905067E-11)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r11.A01
            X.L0m r0 = (X.C63624L0m) r0
            X.LFL r3 = r0.A00
            com.instagram.common.session.UserSession r0 = r3.A02
            X.27r r2 = X.27p.A01(r0)
            X.JVj r0 = X.C59725JVj.SHARE_SHEET
            r1 = 0
            r2.A0t(r1, r1, r0)
            r3.A00 = r1
            X.MSA r0 = r3.A03
            r0.DtB(r1)
            r0 = 680885060(0x28957b44, float:1.6595781E-14)
        L_0x0bf2:
            X.AnonymousClass0fD.A0C(r0, r4)
            return
        L_0x0bf6:
            r0 = 483955092(0x1cd89194, float:1.4331312E-21)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r11.A01
            X.K5H r1 = (X.K5H) r1
            android.location.Location r0 = r1.A02
            if (r0 == 0) goto L_0x0c26
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r1.A0J
            if (r0 == 0) goto L_0x0c26
            java.lang.String r0 = r0.getSearchString()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0c26
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r1.A0J
            X.DbS.A1C(r0)
        L_0x0c18:
            X.3Ar r0 = r1.A0G
            if (r0 == 0) goto L_0x0c1f
            r0.EKm(r1)
        L_0x0c1f:
            r0 = 190191186(0xb561652, float:4.1231693E-32)
        L_0x0c22:
            X.AnonymousClass0fD.A0C(r0, r2)
            return
        L_0x0c26:
            r0 = 0
            r1.A0W = r0
            X.K5H.A03(r1)
            goto L_0x0c18
        L_0x0c2d:
            java.lang.Object r1 = r11.A01
            X.K5H r1 = (X.K5H) r1
            r0 = 0
            X.K5H.A0B(r1, r0)
            com.instagram.common.session.UserSession r0 = r1.A0B
            X.1Av r4 = X.1Au.A00(r0)
            long r2 = X.AnonymousClass7TG.A0I()
            r0 = 1209600(0x127500, double:5.97622E-318)
            long r2 = r2 + r0
            X.0xY r1 = X.AnonymousClass7TE.A0p(r4)
            java.lang.String r0 = "ls_upell_return_time_in_sec"
            r1.E5c(r0, r2)
            r1.apply()
            return
        L_0x0c50:
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel r0 = r2.A00     // Catch:{ all -> 0x0c70 }
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FullTransform r0 = r0.A06     // Catch:{ all -> 0x0c70 }
            int r0 = r0.A07     // Catch:{ all -> 0x0c70 }
            int r0 = r0 + 90
            int r0 = r0 % 360
            r2.A0I(r0)     // Catch:{ all -> 0x0c70 }
            monitor-exit(r2)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FullTransform r1 = r3.A0U
            com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter r2 = r3.A08
            monitor-enter(r2)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel r0 = r2.A00     // Catch:{ all -> 0x0c70 }
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FullTransform r0 = r0.A06     // Catch:{ all -> 0x0c70 }
            int r0 = r0.A07     // Catch:{ all -> 0x0c70 }
            monitor-exit(r2)
            r1.A07 = r0
            X.C64942Lkh.A03(r3)
            return
        L_0x0c70:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LYF.onClick(android.view.View):void");
    }

    public LYF(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
