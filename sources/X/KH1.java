package X;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.os.Bundle;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.gallery.GalleryView;
import instagram.features.clips.edit.ClipsEditMetadataController;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.EglBase14Impl;

public final class KH1 extends 2Cn {
    public final int A00;
    public final Object A01;

    public static Object A00(KH1 kh1, Object obj) {
        0qQ.A0B(obj, 0);
        return kh1.A01;
    }

    public KH1(int i, AnonymousClass4D7 r2) {
        this.A00 = i;
        this.A01 = r2;
    }

    public static void A01(C290815g0 r1, Object obj, int i) {
        r1.A00 = new KH1(obj, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x015f, code lost:
        r1.resumeWith(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0162, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x017c, code lost:
        r0 = "SAVE_QR_CODE_error";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x017e, code lost:
        X.C59689JTv.A0A(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0181, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFail(java.lang.Exception r15) {
        /*
            r14 = this;
            int r0 = r14.A00
            r7 = r15
            switch(r0) {
                case 1: goto L_0x0009;
                case 2: goto L_0x0163;
                case 3: goto L_0x0155;
                case 4: goto L_0x0009;
                case 5: goto L_0x0140;
                case 6: goto L_0x0136;
                case 7: goto L_0x0068;
                case 8: goto L_0x012b;
                case 9: goto L_0x0119;
                case 10: goto L_0x0110;
                case 11: goto L_0x0006;
                case 12: goto L_0x0018;
                case 13: goto L_0x00e5;
                case 14: goto L_0x00cd;
                case 15: goto L_0x00c3;
                case 16: goto L_0x00b6;
                case 17: goto L_0x00a4;
                case 18: goto L_0x000a;
                case 19: goto L_0x0097;
                case 20: goto L_0x008f;
                case 21: goto L_0x0074;
                case 22: goto L_0x0155;
                default: goto L_0x0006;
            }
        L_0x0006:
            X.KH1.super.onFail(r15)
        L_0x0009:
            return
        L_0x000a:
            java.lang.Object r0 = A00(r14, r15)
            com.instagram.ui.widget.gallery.GalleryView r0 = (com.instagram.ui.widget.gallery.GalleryView) r0
            X.2Cn r0 = r0.A08
            if (r0 == 0) goto L_0x0009
            r0.onFail(r15)
            return
        L_0x0018:
            r1 = 0
            X.0qQ.A0B(r15, r1)
            java.lang.Object r0 = r14.A01
            X.K6G r0 = (X.K6G) r0
            boolean r2 = r0.A06
            if (r2 == 0) goto L_0x0009
            X.0eM r5 = r0.A0O
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r5)
            X.2Nl r4 = X.2Nk.A00(r2)
            java.lang.String r9 = r15.getMessage()
            if (r9 != 0) goto L_0x0036
            java.lang.String r9 = ""
        L_0x0036:
            X.29E r8 = r4.A04
            long r12 = r4.A00
            r11 = 17642674(0x10d34b2, float:2.5935417E-38)
            java.lang.String r10 = ""
            long r2 = r8.A07(r9, r10, r11, r12)
            r4.A00 = r2
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r5)
            X.JVm r4 = X.AnonymousClass9PJ.A00(r2)
            java.lang.String r9 = r15.getMessage()
            X.0JA.A01()
            X.29E r8 = r4.A04
            long r12 = r4.A00
            if (r9 != 0) goto L_0x005c
            java.lang.String r9 = "gallery_items_load_failed"
        L_0x005c:
            r11 = 585177486(0x22e1198e, float:6.101343E-18)
            long r2 = r8.A07(r9, r10, r11, r12)
            r4.A00 = r2
            r0.A06 = r1
            return
        L_0x0068:
            java.lang.Object r0 = A00(r14, r15)
            X.MV5 r0 = (X.MV5) r0
            if (r0 == 0) goto L_0x0009
            r0.DEG(r15)
            return
        L_0x0074:
            java.lang.Object r3 = r14.A01
            instagram.features.clips.edit.ClipsEditMetadataController r3 = (instagram.features.clips.edit.ClipsEditMetadataController) r3
            boolean r0 = r3.A0c
            if (r0 == 0) goto L_0x008a
            X.4DH r0 = r3.A0q
            androidx.fragment.app.FragmentActivity r2 = r0.getActivity()
            java.lang.String r1 = "upload_new_cover_photo_image_failed"
            r0 = 2131961521(0x7f1326b1, float:1.9559741E38)
            X.C59689JTv.A0F(r2, r1, r0)
        L_0x008a:
            r0 = 0
            instagram.features.clips.edit.ClipsEditMetadataController.A0G(r3, r0)
            return
        L_0x008f:
            java.lang.Object r0 = r14.A01
            X.LT3 r0 = (X.LT3) r0
            android.content.Context r1 = r0.A04
            goto L_0x017c
        L_0x0097:
            java.lang.Object r2 = r14.A01
            android.content.Context r2 = (android.content.Context) r2
            r1 = 2131971025(0x7f134bd1, float:1.9579018E38)
            java.lang.String r0 = "qr_unable_to_save_nametag_general_toast"
            X.C59689JTv.A0F(r2, r0, r1)
            return
        L_0x00a4:
            java.lang.Object r2 = r14.A01
            X.E26 r2 = (X.E26) r2
            X.E26.A02(r2)
            r1 = 8
            X.DhF r0 = new X.DhF
            r0.<init>(r2, r1)
            X.E26.A05(r2, r0)
            return
        L_0x00b6:
            java.lang.Object r0 = r14.A01
            X.WPg r0 = (X.C19200WPg) r0
            X.C19200WPg.A02(r0)
            android.content.Context r1 = r0.A02
            java.lang.String r0 = "save_error"
            goto L_0x017e
        L_0x00c3:
            java.lang.Object r0 = r14.A01
            X.LDv r0 = (X.C63935LDv) r0
            android.content.Context r1 = r0.A01
            java.lang.String r0 = "save_profile_card_error"
            goto L_0x017e
        L_0x00cd:
            java.lang.Object r0 = A00(r14, r15)
            X.L6x r0 = (X.C63791L6x) r0
            X.L5t r0 = r0.A01
            X.6Rx r2 = r0.A00
            X.4uI r1 = r0.A01
            java.lang.String r0 = r15.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            X.C308206Td.A0E(r2, r1, r0)
            return
        L_0x00e5:
            java.lang.Object r1 = A00(r14, r15)
            X.IHg r1 = (X.C56911IHg) r1
            X.IfU r0 = new X.IfU
            r0.<init>(r1)
            X.11Z.A03(r0)
            com.instagram.common.session.UserSession r3 = r1.A0A
            X.4DU r2 = r1.A0F
            X.1Xj r0 = r1.A0E
            java.lang.String r4 = r0.getId()
            if (r4 == 0) goto L_0x010b
            java.lang.String r6 = "nametag"
            r0 = 1350(0x546, float:1.892E-42)
            java.lang.String r5 = X.AnonymousClass000.A00(r0)
            X.C22031Xty.A0H(r2, r3, r4, r5, r6, r7)
            return
        L_0x010b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0110:
            java.lang.Object r1 = A00(r14, r15)
            X.4D7 r1 = (X.AnonymousClass4D7) r1
            X.9nk r0 = X.C388389nk.A00
            goto L_0x015f
        L_0x0119:
            java.lang.Object r0 = A00(r14, r15)
            X.Ab8 r0 = (X.C40375Ab8) r0
            X.88D r0 = r0.A09
            X.88B r0 = r0.A08
            X.88C r1 = X.AnonymousClass88C.FAILURE
            X.2Fj r0 = r0.A06
            r0.A0B(r1)
            return
        L_0x012b:
            java.lang.Object r1 = A00(r14, r15)
            X.4D7 r1 = (X.AnonymousClass4D7) r1
            X.0eQ r0 = X.JTO.A1B(r15)
            goto L_0x015f
        L_0x0136:
            java.lang.Object r0 = A00(r14, r15)
            X.MTV r0 = (X.MTV) r0
            r0.onFailure(r15)
            return
        L_0x0140:
            java.lang.Object r2 = r14.A01
            X.Jcz r2 = (X.C59990Jcz) r2
            r1 = 0
            X.4D6 r0 = X.C59990Jcz.A0A
            r2.A03 = r1
            r0 = 1
            r2.A02 = r0
            java.lang.String r0 = "StaticAnimationDrawableTextureGenerationFailed"
            X.0wb.A07(r0, r15)
            r2.invalidateSelf()
            return
        L_0x0155:
            java.lang.Object r1 = A00(r14, r15)
            X.4D7 r1 = (X.AnonymousClass4D7) r1
            X.5sO r0 = X.C41845B3m.A0c(r15)
        L_0x015f:
            r1.resumeWith(r0)
            return
        L_0x0163:
            java.lang.Object r1 = A00(r14, r15)
            X.LEL r1 = (X.LEL) r1
            com.instagram.common.session.UserSession r3 = r1.A09
            X.0iw r2 = r1.A07
            java.lang.String r4 = r3.A06
            r0 = 951(0x3b7, float:1.333E-42)
            java.lang.String r5 = X.C273654mx.A00(r0)
            java.lang.String r6 = "download_qr_code"
            X.C22031Xty.A0H(r2, r3, r4, r5, r6, r7)
            android.content.Context r1 = r1.A03
        L_0x017c:
            java.lang.String r0 = "SAVE_QR_CODE_error"
        L_0x017e:
            X.C59689JTv.A0A(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KH1.onFail(java.lang.Exception):void");
    }

    public final void onFinish() {
        switch (this.A00) {
            case 7:
                MV5 mv5 = (MV5) this.A01;
                if (mv5 != null) {
                    mv5.onFinish();
                    return;
                }
                return;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                2Cn r0 = ((GalleryView) this.A01).A08;
                if (r0 != null) {
                    r0.onFinish();
                    return;
                }
                return;
            default:
                KH1.super.onFinish();
                return;
        }
    }

    public final void onStart() {
        switch (this.A00) {
            case 2:
            case 15:
            case 20:
                return;
            case 7:
                MV5 mv5 = (MV5) this.A01;
                if (mv5 != null) {
                    mv5.onStart();
                    return;
                }
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                K6G k6g = (K6G) this.A01;
                if (!k6g.A06) {
                    2Nl A002 = 2Nk.A00(AnonymousClass7TE.A0l(k6g.A0O));
                    String str = k6g.A05;
                    if (str == null) {
                        str = "";
                    }
                    long A05 = JTS.A05(0Tu.A06, A002.A05, 36601934634881402L);
                    29E r3 = A002.A04;
                    long A03 = r3.A03(17642674, A05);
                    A002.A00 = A03;
                    r3.A09(A03, AnonymousClass000.A00(5347), str);
                    k6g.A06 = true;
                    return;
                }
                return;
            case 17:
                E26.A03((E26) this.A01);
                return;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                2Cn r0 = ((GalleryView) this.A01).A08;
                if (r0 != null) {
                    r0.onStart();
                    return;
                }
                return;
            case 21:
                ClipsEditMetadataController.A0G((ClipsEditMetadataController) this.A01, true);
                return;
            default:
                KH1.super.onStart();
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r1v25, types: [java.lang.Object, X.0bY] */
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        int i;
        CreativeConfigIntf AsO;
        String A30;
        int i2;
        String str2;
        AnonymousClass4D7 r2;
        Object A0d;
        LR6 lr6;
        int i3;
        String str3;
        Long l;
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                File file = (File) obj2;
                0qQ.A0B(file, 0);
                try {
                    C63794L7a l7a = (C63794L7a) this.A01;
                    C3507486a r22 = l7a.A01;
                    r22.A02.A01(0, JTP.A0u(file), false);
                    JTS.A12(r22.A00);
                    JSONObject jSONObject = (JSONObject) l7a.A03.getValue();
                    0qQ.A0B(jSONObject, 0);
                    r22.A01.A00().A09(jSONObject);
                    return;
                } catch (IOException unused) {
                    DbT.A1Q(0wj.A01, "GreenscreenGifPicker: Error getting downloaded GIF", 245701013);
                    return;
                }
            case 1:
                C349307zv r0 = (C349307zv) obj2;
                0qQ.A0B(r0, 0);
                C3507486a r3 = (C3507486a) this.A01;
                r3.A02.A01(r0.A09, r0.A0k, false);
                JTS.A12(r3.A00);
                return;
            case 2:
                boolean A1a = AnonymousClass7TE.A1a(obj2);
                LEL lel = (LEL) this.A01;
                Context context = lel.A03;
                if (A1a) {
                    i2 = 2131972593;
                    str2 = null;
                } else {
                    i2 = 2131961740;
                    str2 = "SAVE_QR_CODE result is null";
                }
                C59689JTv.A0F(context, str2, i2);
                0Aj A0e = AnonymousClass7TE.A0e(lel.A08, "ig_qr_code_download");
                if (A0e.isSampled()) {
                    A0e.AAJ("color", "na");
                    A0e.A9F("entity_id", C51971G9r.A0m());
                    A0e.AAJ("source", lel.A07.getModuleName());
                    A0e.Cgf();
                    return;
                }
                return;
            case 3:
                r2 = (AnonymousClass4D7) this.A01;
                if (obj == null) {
                    A0d = C51967G9n.A0d();
                    break;
                } else {
                    A0d = C41845B3m.A0c(obj2);
                    break;
                }
            case 4:
                File file2 = (File) obj2;
                C59730JVo.A08((Context) A00(this, file2), file2);
                return;
            case 5:
                Bitmap bitmap = (Bitmap) obj2;
                C59990Jcz jcz = (C59990Jcz) this.A01;
                AnonymousClass4D6 r1 = C59990Jcz.A0A;
                jcz.A00 = bitmap;
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                jcz.A01 = bitmapShader;
                jcz.A06.setShader(bitmapShader);
                jcz.A03 = false;
                jcz.A02 = false;
                jcz.invalidateSelf();
                return;
            case 6:
                List list = (List) obj2;
                ((MTV) A00(this, list)).Doh(list);
                return;
            case 7:
                String A1E = C41847B3o.A1E(obj2);
                MV5 mv5 = (MV5) this.A01;
                if (mv5 != null) {
                    mv5.Doe(A1E);
                    return;
                }
                return;
            case 8:
                C349307zv r02 = (C349307zv) obj2;
                0qQ.A0B(r02, 0);
                try {
                    int i4 = r02.A07;
                    ((AnonymousClass4D7) this.A01).resumeWith(new AnonymousClass51M((C53401GnY) null, (0v6) null, AnonymousClass9NO.A00(), C39821AAs.A00(r02, 4, i4, i4), (String) null, (String) null, (String) null, (String) null, (String) null, 0.0f, 0, 0, 0, 0, 0, 0, 1073741820, false, false, false, false));
                    return;
                } catch (IllegalArgumentException e) {
                    ((AnonymousClass4D7) this.A01).resumeWith(JTO.A1B(e));
                    return;
                }
            case 9:
                File file3 = (File) obj2;
                C40375Ab8 ab8 = (C40375Ab8) A00(this, file3);
                AnonymousClass88B r32 = ab8.A09.A08;
                C3498982i r12 = r32.A00;
                if (r12 == null || !r12.A04.A5p()) {
                    r32.A01 = file3;
                    r32.A06.A0B(AnonymousClass88C.SUCCESS);
                    return;
                }
                r32.A01(ab8.A03, ab8.A07, file3);
                return;
            case 10:
                r2 = (AnonymousClass4D7) A00(this, obj2);
                A0d = new AnonymousClass8Y4(obj2);
                break;
            case 11:
                File file4 = (File) obj2;
                0qQ.A0B(file4, 0);
                C51965G9l.A1W(this.A01, C282665Eg.A03(file4, 3, 0));
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                K6G k6g = (K6G) this.A01;
                if (k6g.A06) {
                    AnonymousClass0eM r5 = k6g.A0O;
                    2Nl A002 = 2Nk.A00(AnonymousClass7TE.A0l(r5));
                    A002.A00 = A002.A04.A02(17642674, A002.A00);
                    C71012OYk.A00(KQi.A00, C63234Ktf.A00(AnonymousClass7TE.A0l(r5)));
                    AnonymousClass9PJ.A00(AnonymousClass7TE.A0l(r5)).A02();
                    k6g.A06 = false;
                    return;
                }
                return;
            case 13:
                C55777HnC hnC = (C55777HnC) obj2;
                11Z.A03(new C57829Ih8((C56911IHg) A00(this, hnC), hnC));
                return;
            case 14:
                String A1E2 = C41847B3o.A1E(obj2);
                C63761L5t l5t = ((C63791L6x) this.A01).A01;
                try {
                    C308206Td.A0E(l5t.A00, l5t.A02, new JSONObject(A1E2).getString("h"));
                    return;
                } catch (JSONException unused2) {
                    C308206Td.A0E(l5t.A00, l5t.A01, "Failed to parse the response");
                    return;
                }
            case 15:
                File file5 = (File) obj2;
                if (file5 != null) {
                    i = 2131972593;
                    str = null;
                    C63935LDv lDv = (C63935LDv) this.A01;
                    UserSession userSession = lDv.A03;
                    C22031Xty.A0J(lDv.A02, userSession, userSession.A06, AnonymousClass000.A00(1713), lDv.A05, "");
                    if (182.A06(0Tu.A05, userSession, 36327426095790511L)) {
                        Bundle A0a = AnonymousClass7TE.A0a();
                        String str4 = lDv.A04;
                        A0a.putString("android.intent.extra.TEXT", str4);
                        Context context2 = lDv.A01;
                        HashMap hashMap = MY3.A06;
                        C46395DeI.A0N(context2, MY3.A01(context2, (ProviderInfo) null, new Object()).A04(file5), A0a, new C64571LeD(), userSession, (String) null, C66579MXk.A00(73), new HashMap(0Yt.A07(new 0eP[]{AnonymousClass7TE.A1L("android.intent.extra.TEXT", str4)})), true, false);
                        return;
                    }
                } else {
                    i = 2131961740;
                    str = "save_profile_card_error result is null";
                }
                C59689JTv.A0F(((C63935LDv) this.A01).A01, str, i);
                return;
            case 16:
                File file6 = (File) obj2;
                0qQ.A0B(file6, 0);
                C19200WPg wPg = (C19200WPg) this.A01;
                C19200WPg.A02(wPg);
                1Xj r23 = wPg.A08;
                if (r23 != null) {
                    String A0t = JTP.A0t(file6);
                    UserSession userSession2 = wPg.A07;
                    if (!(r23.A0C.AsO() == null || (AsO = r23.A0C.AsO()) == null)) {
                        AnonymousClass9U5 r24 = new AnonymousClass9U5(A0t);
                        r24.A0A = 0sr.A1N(AsO.B3W());
                        r24.A07 = AsO.Bbn();
                        r24.A0B = true;
                        AnonymousClass8VQ.A04(userSession2, r24);
                    }
                }
                Context context3 = wPg.A02;
                C59730JVo.A08(context3, file6);
                C59689JTv.A01(context3, "save_error", 2131972636, 0);
                return;
            case 17:
                String A1E3 = C41847B3o.A1E(obj2);
                E26 e26 = (E26) this.A01;
                E26.A02(e26);
                E26.A01(e26);
                EWN ewn = (EWN) ((C46749Dkc) e26.A0O.getValue()).A01.A02();
                if (ewn != null) {
                    E26.A04(e26, A1E3, ewn.A00);
                    return;
                }
                return;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                C347987xh r03 = (C347987xh) obj2;
                GalleryView galleryView = (GalleryView) A00(this, r03);
                List list2 = r03.A01;
                ArrayList A1C = AnonymousClass7TE.A1C();
                LR6 lr62 = new LR6(AnonymousClass7TE.A16(galleryView.getContext(), 2131958623));
                HashMap A1E4 = AnonymousClass7TE.A1E();
                Iterator it = list2.iterator();
                while (true) {
                    LR6 lr63 = null;
                    if (it.hasNext()) {
                        Medium A0W = JTO.A0W(it);
                        lr62.A02.add(JTR.A0f(A0W));
                        String str5 = A0W.A0O;
                        if (A1E4.containsKey(str5)) {
                            lr6 = (LR6) A1E4.get(str5);
                            if (lr6 == null) {
                            }
                        } else if (str5 != null) {
                            lr6 = new LR6(str5);
                            A1E4.put(str5, lr6);
                        }
                        lr6.A02.add(JTR.A0f(A0W));
                    } else {
                        A1C.add(lr62);
                        A1C.addAll(A1E4.values());
                        C60054JeM jeM = galleryView.A0C;
                        if (jeM != null) {
                            jeM.A03(A1C);
                        }
                        MT3 mt3 = galleryView.A0E;
                        if (mt3 != null) {
                            C60054JeM jeM2 = galleryView.A0C;
                            if (jeM2 != null) {
                                lr63 = jeM2.A00;
                            }
                            mt3.DHS(lr63, A1C);
                        }
                        GalleryView.A07(galleryView);
                        2Cn r13 = galleryView.A08;
                        if (r13 != null) {
                            r13.onSuccess(r03);
                            return;
                        }
                        return;
                    }
                }
            case 19:
                if (AnonymousClass7TE.A1a(obj2)) {
                    C59689JTv.A07((Context) this.A01, 2131967990);
                    return;
                }
                return;
            case 20:
                boolean A1a2 = AnonymousClass7TE.A1a(obj2);
                LT3 lt3 = (LT3) this.A01;
                Context context4 = lt3.A04;
                if (A1a2) {
                    i3 = 2131972593;
                    str3 = null;
                } else {
                    i3 = 2131961740;
                    str3 = "SAVE_QR_CODE result is null";
                }
                C59689JTv.A01(context4, str3, i3, 0);
                0Aj A0e2 = AnonymousClass7TE.A0e(lt3.A07, "ig_qr_code_download");
                if (A0e2.isSampled() && (l = lt3.A0E) != null) {
                    A0e2.AAJ("color", StringFormatUtil.formatStrLocaleSafe("#%06X", Integer.valueOf(16777215 & lt3.A03.A02[0])));
                    long longValue = l.longValue();
                    if (lt3.A0I) {
                        longValue = 0;
                    }
                    A0e2.A9F("entity_id", Long.valueOf(longValue));
                    A0e2.AAJ("source", lt3.A06.getModuleName());
                    A0e2.Cgf();
                }
                MT4 mt4 = lt3.A0A;
                if (mt4 != null) {
                    mt4.DgT();
                    return;
                }
                return;
            case 21:
                String A1E5 = C41847B3o.A1E(obj2);
                ClipsEditMetadataController clipsEditMetadataController = (ClipsEditMetadataController) this.A01;
                AnonymousClass4D6 r33 = clipsEditMetadataController.A0t;
                1Xj r04 = clipsEditMetadataController.A0D;
                if (r04 == null || (A30 = r04.A30()) == null) {
                    throw AnonymousClass7TE.A0y();
                }
                1NY A0a2 = AnonymousClass7TG.A0a(clipsEditMetadataController.A0s);
                A0a2.A0A("media/configure_to_clips_cover_image/");
                A0a2.A9m("upload_id", A1E5);
                A0a2.A0G(AnonymousClass000.A00(547), A30);
                1OC A0S = DbU.A0S(A0a2, K10.class, C64023LJk.class);
                A0S.A00 = new KAF(clipsEditMetadataController);
                r33.schedule(A0S);
                return;
            default:
                r2 = (AnonymousClass4D7) A00(this, obj2);
                A0d = C41845B3m.A0d(obj2);
                break;
        }
        r2.resumeWith(A0d);
    }

    public KH1(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
