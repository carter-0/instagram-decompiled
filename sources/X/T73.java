package X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.base.activity.IgFragmentActivity;

public final class T73 implements C252243on {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public T73(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj3;
        this.A03 = obj2;
        this.A02 = obj;
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    /* JADX WARNING: type inference failed for: r3v13, types: [android.content.Context, com.instagram.base.activity.IgFragmentActivity] */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0135, code lost:
        r1 = (X.C10561RuF) r10.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01d8, code lost:
        X.C299275ur.A00(r0, r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01db, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01de, code lost:
        r1 = (X.C10560RuE) r10.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01f3, code lost:
        X.C299275ur.A00(r0, r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01f6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0212, code lost:
        X.C308206Td.A0L((X.C307896Rx) r0, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r11, int r12, android.content.Intent r13) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x01f7;
                case 1: goto L_0x014c;
                case 2: goto L_0x0087;
                case 3: goto L_0x0058;
                default: goto L_0x0005;
            }
        L_0x0005:
            com.facebook.common.callercontext.CallerContext r0 = X.1KM.A00
            r0 = 64206(0xface, float:8.9972E-41)
            if (r11 != r0) goto L_0x0217
            java.lang.Object r3 = r10.A01
            com.instagram.base.activity.IgFragmentActivity r3 = (com.instagram.base.activity.IgFragmentActivity) r3
            r3.unregisterOnActivityResultListener(r10)
            r0 = -1
            if (r12 != r0) goto L_0x0048
            java.lang.Object r0 = r10.A03
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.1Av r0 = X.1Au.A00(r0)
            java.lang.String r2 = "promote_pro2pro_client_token"
            java.lang.String r1 = ""
            X.0xa r0 = r0.A01
            java.lang.String r2 = r0.getString(r2, r1)
            int r0 = X.C66580MXl.A06(r2)
            if (r0 == 0) goto L_0x0048
            r1 = 0
            org.json.JSONObject r0 = X.C66580MXl.A17(r2)     // Catch:{ JSONException -> 0x0038 }
            com.facebook.AccessToken r1 = X.S88.A00(r0)     // Catch:{ JSONException -> 0x0038 }
        L_0x0038:
            if (r1 == 0) goto L_0x0048
            java.lang.String r1 = r1.A02
            if (r1 == 0) goto L_0x0048
            java.lang.Object r0 = r10.A02
            X.Rpl r0 = (X.C10287Rpl) r0
            X.X6L r0 = r0.A00
            r0.Doe(r1)
            return
        L_0x0048:
            r0 = 2131965607(0x7f1336a7, float:1.9568029E38)
            X.C59689JTv.A07(r3, r0)
            java.lang.Object r0 = r10.A02
            X.Rpl r0 = (X.C10287Rpl) r0
            X.X6L r0 = r0.A00
            r0.DED()
            return
        L_0x0058:
            r0 = 1005(0x3ed, float:1.408E-42)
            if (r11 != r0) goto L_0x0083
            java.lang.Object r3 = r10.A01
            X.6Rx r3 = (X.C307896Rx) r3
            java.lang.Object r2 = r10.A02
            X.4uI r2 = (X.C277014uI) r2
            X.6Tl r1 = X.DbS.A0P()
            java.lang.Object r0 = r10.A03
            com.instagram.model.reels.Reel r0 = (com.instagram.model.reels.Reel) r0
            java.lang.String r0 = r0.getId()
            r1.A01(r0)
            r0 = 484(0x1e4, float:6.78E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r1.A02(r0)
            X.6Tm r0 = r1.A00()
            X.C299275ur.A00(r3, r0, r2)
        L_0x0083:
            java.lang.Object r0 = r10.A01
            goto L_0x0212
        L_0x0087:
            r0 = 41262(0xa12e, float:5.782E-41)
            if (r11 != r0) goto L_0x0217
            java.lang.Object r0 = r10.A01
            com.instagram.base.activity.IgFragmentActivity r0 = (com.instagram.base.activity.IgFragmentActivity) r0
            r0.unregisterOnActivityResultListener(r10)
            if (r13 == 0) goto L_0x00ec
            android.os.Bundle r1 = r13.getExtras()
        L_0x0099:
            r0 = -1
            if (r12 != r0) goto L_0x0133
            if (r1 == 0) goto L_0x0217
            java.lang.Object r5 = r10.A03
            X.RwI r5 = (X.C10679RwI) r5
            r4 = 0
            java.lang.String r0 = "result_video_path"
            java.lang.String r2 = r1.getString(r0)
            java.lang.String r0 = "result_photo_path"
            java.lang.String r0 = r1.getString(r0)
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r6 = X.AnonymousClass7TE.A1E()
            if (r0 == 0) goto L_0x00c6
            java.lang.String r1 = "selfie_photo"
            r3.put(r1, r0)
            java.lang.String r0 = "SELFIE_PHOTO_NATIVE"
            r6.put(r1, r0)
        L_0x00c6:
            if (r2 == 0) goto L_0x00d3
            java.lang.String r1 = "selfie_video"
            r3.put(r1, r2)
            java.lang.String r0 = "SELFIE_VIDEO_NATIVE"
            r6.put(r1, r0)
        L_0x00d3:
            java.util.Iterator r2 = X.AnonymousClass7TF.A0t(r3)
        L_0x00d7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00ee
            java.lang.Object r1 = r2.next()
            X.SE0 r0 = r5.A00
            X.0qQ.A0B(r1, r4)
            java.util.Set r0 = r0.A00
            r0.add(r1)
            goto L_0x00d7
        L_0x00ec:
            r1 = 0
            goto L_0x0099
        L_0x00ee:
            int r0 = r3.size()
            int r0 = X.0se.A0L(r0)
            java.util.LinkedHashMap r4 = X.DbS.A0x(r0)
            java.util.Iterator r3 = X.AnonymousClass7TF.A0s(r3)
        L_0x00fe:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x011e
            java.util.Map$Entry r2 = X.AnonymousClass7TE.A1J(r3)
            java.lang.Object r1 = r2.getKey()
            X.6QE r0 = X.AnonymousClass6QE.A02
            java.lang.String r0 = X.DbS.A0s(r2)
            android.net.Uri r0 = X.DbT.A09(r0)
            java.lang.String r0 = X.Pxi.A0c(r0)
            r4.put(r1, r0)
            goto L_0x00fe
        L_0x011e:
            X.6Rm r0 = r5.A01
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r4, r6}
            java.util.List r0 = X.0sr.A1P(r0)
            X.6Tm r3 = new X.6Tm
            r3.<init>(r0)
            X.4uI r2 = r5.A03
            X.6Rx r0 = r5.A02
            goto L_0x01d8
        L_0x0133:
            if (r12 != 0) goto L_0x0217
            java.lang.Object r1 = r10.A02
            X.RuF r1 = (X.C10561RuF) r1
            X.4uI r3 = r1.A02
            if (r3 == 0) goto L_0x0217
            X.6Rm r0 = r1.A00
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            X.6Tm r2 = new X.6Tm
            r2.<init>(r0)
            X.6Rx r0 = r1.A01
            goto L_0x01f3
        L_0x014c:
            r0 = 41261(0xa12d, float:5.7819E-41)
            if (r11 != r0) goto L_0x0217
            java.lang.Object r0 = r10.A01
            com.instagram.base.activity.IgFragmentActivity r0 = (com.instagram.base.activity.IgFragmentActivity) r0
            r0.unregisterOnActivityResultListener(r10)
            if (r13 == 0) goto L_0x019b
            android.os.Bundle r4 = r13.getExtras()
        L_0x015e:
            r0 = -1
            if (r12 != r0) goto L_0x01dc
            if (r4 == 0) goto L_0x0217
            java.lang.Object r1 = r10.A03
            X.SF7 r1 = (X.SF7) r1
            r3 = 0
            java.util.LinkedHashMap r8 = X.AnonymousClass7TE.A1H()
            java.util.LinkedHashMap r9 = X.AnonymousClass7TE.A1H()
            java.lang.String r5 = "id_front"
            java.lang.String r6 = "front_file_path"
            java.lang.String r7 = "front_authenticity_upload_medium"
            X.SF7.A00(r4, r5, r6, r7, r8, r9)
            java.lang.String r5 = "id_back"
            java.lang.String r6 = "back_file_path"
            java.lang.String r7 = "back_authenticity_upload_medium"
            X.SF7.A00(r4, r5, r6, r7, r8, r9)
            java.util.Iterator r4 = X.AnonymousClass7TF.A0t(r8)
        L_0x0186:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x019d
            java.lang.Object r2 = r4.next()
            X.SE0 r0 = r1.A00
            X.0qQ.A0B(r2, r3)
            java.util.Set r0 = r0.A00
            r0.add(r2)
            goto L_0x0186
        L_0x019b:
            r4 = 0
            goto L_0x015e
        L_0x019d:
            java.util.LinkedHashMap r5 = X.C51975G9x.A0o(r8)
            java.util.Iterator r4 = X.AnonymousClass7TF.A0s(r8)
        L_0x01a5:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x01c5
            java.util.Map$Entry r3 = X.AnonymousClass7TE.A1J(r4)
            java.lang.Object r2 = r3.getKey()
            X.6QE r0 = X.AnonymousClass6QE.A02
            java.lang.String r0 = X.DbS.A0s(r3)
            android.net.Uri r0 = X.DbT.A09(r0)
            java.lang.String r0 = X.Pxi.A0c(r0)
            r5.put(r2, r0)
            goto L_0x01a5
        L_0x01c5:
            X.6Rm r0 = r1.A01
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r5, r9}
            java.util.List r0 = X.0sr.A1P(r0)
            X.6Tm r3 = new X.6Tm
            r3.<init>(r0)
            X.4uI r2 = r1.A03
            X.6Rx r0 = r1.A02
        L_0x01d8:
            X.C299275ur.A00(r0, r3, r2)
            return
        L_0x01dc:
            if (r12 != 0) goto L_0x0217
            java.lang.Object r1 = r10.A02
            X.RuE r1 = (X.C10560RuE) r1
            X.4uI r3 = r1.A02
            if (r3 == 0) goto L_0x0217
            X.6Rm r0 = r1.A00
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            X.6Tm r2 = new X.6Tm
            r2.<init>(r0)
            X.6Rx r0 = r1.A01
        L_0x01f3:
            X.C299275ur.A00(r0, r2, r3)
            return
        L_0x01f7:
            r0 = 1
            if (r11 != r0) goto L_0x0225
            r0 = -1
            if (r12 != r0) goto L_0x0218
            java.lang.Object r0 = r10.A03
            java.io.File r0 = (java.io.File) r0
            android.net.Uri r2 = android.net.Uri.fromFile(r0)
            java.lang.Object r1 = r10.A02
            X.6Rx r1 = (X.C307896Rx) r1
            java.lang.Object r0 = r10.A01
            X.6Tm r0 = (X.AnonymousClass6Tm) r0
            X.SS4.A02(r2, r1, r0)
        L_0x0210:
            java.lang.Object r0 = r10.A02
        L_0x0212:
            X.6Rx r0 = (X.C307896Rx) r0
            X.C308206Td.A0L(r0, r10)
        L_0x0217:
            return
        L_0x0218:
            if (r12 != 0) goto L_0x0225
            java.lang.Object r1 = r10.A02
            X.6Rx r1 = (X.C307896Rx) r1
            java.lang.Object r0 = r10.A01
            X.6Tm r0 = (X.AnonymousClass6Tm) r0
            X.SS4.A03(r1, r0)
        L_0x0225:
            java.lang.Object r0 = r10.A03
            java.io.File r0 = (java.io.File) r0
            r0.delete()
            goto L_0x0210
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T73.onActivityResult(int, int, android.content.Intent):void");
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
        if (4 - this.A00 == 0) {
            ((IgFragmentActivity) this.A01).unregisterOnActivityResultListener(this);
        }
    }

    public final void onDestroyView() {
        Object obj;
        switch (this.A00) {
            case 0:
                obj = this.A02;
                break;
            case 3:
                obj = this.A01;
                break;
            default:
                return;
        }
        C308206Td.A0L((C307896Rx) obj, this);
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }
}
