package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class FG7 {
    public static final FG7 A00 = new Object();

    public static final void A01(Context context, UserSession userSession) {
        1pV r1;
        0qQ.A0B(userSession, 1);
        if ((context instanceof FragmentActivity) && (r1 = 1pV.A00) != null) {
            r1.A00((Bundle) null, (FragmentActivity) context, userSession);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r12v11 */
    /* JADX WARNING: type inference failed for: r12v12, types: [java.lang.Number] */
    /* JADX WARNING: type inference failed for: r12v15 */
    /* JADX WARNING: type inference failed for: r12v21 */
    /* JADX WARNING: type inference failed for: r12v22 */
    /* JADX WARNING: type inference failed for: r12v23 */
    /* JADX WARNING: type inference failed for: r12v24 */
    /* JADX WARNING: type inference failed for: r12v25 */
    /* JADX WARNING: type inference failed for: r12v26 */
    /* JADX WARNING: type inference failed for: r12v27 */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x010a, code lost:
        if (r5.length() == 0) goto L_0x010c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0133  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.os.Bundle A00(com.instagram.common.session.UserSession r17, java.lang.String r18, java.lang.String r19, boolean r20) {
        /*
            X.0bY r1 = X.C49273EsG.A00
            r0 = 1
            r2 = r18
            android.net.Uri r9 = X.0cp.A01(r1, r2)
            if (r9 == 0) goto L_0x03a3
            java.lang.String r2 = r9.getScheme()
            java.lang.String r1 = "https"
            boolean r1 = r1.equalsIgnoreCase(r2)
            r11 = r19
            if (r1 != 0) goto L_0x01f0
            java.lang.String r1 = "http"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 != 0) goto L_0x01f0
            java.lang.String r1 = "instagram"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L_0x01a6
            java.lang.String r2 = r9.getHost()
            java.lang.String r1 = "reels_home"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L_0x018e
            X.E8X r12 = X.E8X.A00
        L_0x0037:
            boolean r1 = r12 instanceof X.E8T
            if (r1 == 0) goto L_0x0050
            X.E8T r12 = (X.E8T) r12
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = r12.A00
            java.lang.String r0 = "audio_id"
            r2.putString(r0, r1)
            java.lang.String r1 = r12.A01
            java.lang.String r0 = "reason"
        L_0x004c:
            r2.putString(r0, r1)
            return r2
        L_0x0050:
            boolean r1 = r12 instanceof X.E8U
            if (r1 == 0) goto L_0x0077
            X.E8U r12 = (X.E8U) r12
            java.lang.String r1 = r12.A02
            java.lang.String r0 = "id"
            X.0eP r3 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r1 = r12.A00
            java.lang.String r0 = "blend_id"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r1 = r12.A01
            java.lang.String r0 = "target_media_igid"
            X.0eP r0 = X.AnonymousClass7TE.A1L(r0, r1)
            X.0eP[] r0 = new X.0eP[]{r3, r2, r0}
        L_0x0072:
            android.os.Bundle r2 = X.Q21.A00(r0)
            return r2
        L_0x0077:
            boolean r1 = r12 instanceof X.E8W
            if (r1 == 0) goto L_0x00b4
            X.E8W r12 = (X.E8W) r12
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_content_notes"
            X.0eP r5 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r1 = r12.A01
            java.lang.String r0 = "media_ids"
            X.0eP r4 = X.AnonymousClass7TE.A1L(r0, r1)
            int r0 = r12.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "media_limit"
            X.0eP r3 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r1 = r12.A02
            java.lang.String r0 = "module_name"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r0, r1)
            boolean r0 = r12.A03
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "open_in_direct"
            X.0eP r0 = X.AnonymousClass7TE.A1L(r0, r1)
            X.0eP[] r0 = new X.0eP[]{r5, r4, r3, r2, r0}
            goto L_0x0072
        L_0x00b4:
            boolean r1 = r12 instanceof X.E8X
            if (r1 == 0) goto L_0x00c4
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = "ARG_CLIPS_DESTINATION"
            java.lang.String r0 = "reels_home"
        L_0x00c0:
            r2.putString(r1, r0)
            return r2
        L_0x00c4:
            boolean r1 = r12 instanceof X.E8R
            if (r1 == 0) goto L_0x00da
            X.E8R r12 = (X.E8R) r12
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = r12.A00
            java.lang.String r0 = "InstagramUrlLaunchConstants.EXTRA_USER_NAME"
            r2.putString(r0, r1)
            java.lang.String r1 = "InstagramUrlLaunchConstants.EXTRA_STARTING_TAB"
            java.lang.String r0 = "profile_clips"
            goto L_0x00c0
        L_0x00da:
            boolean r1 = r12 instanceof X.E8S
            if (r1 == 0) goto L_0x00ea
            X.E8S r12 = (X.E8S) r12
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = r12.A00
            java.lang.String r0 = "effect_id"
            goto L_0x004c
        L_0x00ea:
            boolean r1 = r12 instanceof X.E8V
            if (r1 == 0) goto L_0x03a6
            X.E8V r12 = (X.E8V) r12
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            com.instagram.clips.intf.ClipsViewerSource r1 = com.instagram.clips.intf.ClipsViewerSource.THIRD_PARTY_URL
            X.4h3 r7 = new X.4h3
            r8 = r17
            r7.<init>(r1, r8)
            java.lang.String r3 = r12.A04
            r7.A16 = r3
            java.lang.String r5 = r12.A01
            if (r5 == 0) goto L_0x010c
            int r4 = r5.length()
            r1 = 0
            if (r4 != 0) goto L_0x010d
        L_0x010c:
            r1 = 1
        L_0x010d:
            java.lang.String r6 = ""
            if (r1 != 0) goto L_0x0187
            r7.A1H = r5
        L_0x0113:
            X.5OB r1 = X.AnonymousClass5OB.DEEP_LINK
            r7.A09 = r1
        L_0x0117:
            if (r20 == 0) goto L_0x012b
            X.0Tu r1 = X.0Tu.A05
            r4 = 36324728855605544(0x810d2600003128, double:3.03524302400321E-306)
            boolean r1 = X.182.A06(r1, r8, r4)
            if (r1 == 0) goto L_0x012b
            r1 = 0
            r7.A1c = r1
            r7.A1T = r0
        L_0x012b:
            boolean r1 = r12.A07
            r7.A1j = r1
            java.lang.String r1 = r12.A02
            if (r1 == 0) goto L_0x013a
            r7.A0p = r1
            java.lang.String r1 = "ClipsConstants.ARG_CLIPS_INTERNAL_LINK"
            r2.putBoolean(r1, r0)
        L_0x013a:
            java.lang.String r1 = r12.A05
            if (r1 == 0) goto L_0x0146
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0146
            r7.A1G = r1
        L_0x0146:
            com.instagram.clips.intf.ClipsViewerConfig r1 = r7.A00()
            r0 = 105(0x69, float:1.47E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r2.putParcelable(r0, r1)
            java.lang.String r0 = "short_url"
            r2.putString(r0, r3)
            android.net.Uri r0 = r12.A00
            android.net.Uri$Builder r0 = r0.buildUpon()
            android.net.Uri$Builder r1 = r0.path(r6)
            java.lang.String r0 = "p"
            android.net.Uri$Builder r0 = r1.appendPath(r0)
            android.net.Uri$Builder r0 = r0.appendPath(r3)
            android.net.Uri r0 = r0.build()
            java.lang.String r1 = r0.toString()
            r0 = 41
            java.lang.String r0 = X.C273654mx.A00(r0)
            r2.putString(r0, r1)
            java.lang.String r1 = r12.A03
            r0 = 4320(0x10e0, float:6.054E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x004c
        L_0x0187:
            boolean r1 = r12.A06
            if (r1 == 0) goto L_0x0117
            r7.A1H = r6
            goto L_0x0113
        L_0x018e:
            java.lang.String r1 = "reels_effect_page"
            boolean r1 = r1.equalsIgnoreCase(r2)
            r12 = 0
            if (r1 == 0) goto L_0x030d
            java.lang.String r1 = "effect_id"
            java.lang.String r1 = r9.getQueryParameter(r1)
            if (r1 == 0) goto L_0x0037
            X.E8S r12 = new X.E8S
            r12.<init>(r1)
            goto L_0x0037
        L_0x01a6:
            java.lang.String r1 = "ig"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L_0x03a3
            java.lang.String r2 = r9.getHost()
            java.lang.String r1 = "media_note_chain"
            boolean r1 = r1.equalsIgnoreCase(r2)
            r12 = 0
            if (r1 == 0) goto L_0x0037
            java.lang.String r1 = "media_list"
            java.lang.String r5 = r9.getQueryParameter(r1)
            java.lang.String r4 = "module"
            java.lang.String r3 = r9.getQueryParameter(r4)
            r1 = 1182(0x49e, float:1.656E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            java.lang.String r1 = r9.getQueryParameter(r1)
            if (r1 == 0) goto L_0x01d7
            java.lang.Integer r12 = X.00y.A0l(r1)
        L_0x01d7:
            r2 = 0
            java.lang.String r1 = "open_in_direct"
            boolean r2 = r9.getBooleanQueryParameter(r1, r2)
            if (r3 == 0) goto L_0x01e1
            r4 = r3
        L_0x01e1:
            if (r12 == 0) goto L_0x01ee
            int r1 = r12.intValue()
        L_0x01e7:
            X.E8W r12 = new X.E8W
            r12.<init>(r5, r4, r1, r2)
            goto L_0x0037
        L_0x01ee:
            r1 = 5
            goto L_0x01e7
        L_0x01f0:
            java.lang.String r2 = r9.getHost()
            java.lang.String r1 = "instagram.com"
            boolean r1 = r1.equalsIgnoreCase(r2)
            r12 = 0
            if (r1 != 0) goto L_0x020f
            java.lang.String r1 = "www.instagram.com"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 != 0) goto L_0x020f
            java.lang.String r1 = "applink.instagram.com"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 != 0) goto L_0x020f
            goto L_0x0037
        L_0x020f:
            java.util.List r6 = r9.getPathSegments()
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L_0x0037
            java.lang.Object r7 = X.AnonymousClass7TE.A13(r6)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = "reel"
            boolean r1 = r8.equalsIgnoreCase(r7)
            java.lang.String r3 = "open_like_count"
            java.lang.String r5 = "open_comments"
            r4 = 2
            if (r1 != 0) goto L_0x023a
            int r1 = r6.size()
            java.lang.String r2 = "reels"
            if (r1 != r4) goto L_0x0268
            boolean r1 = r2.equalsIgnoreCase(r7)
            if (r1 == 0) goto L_0x0268
        L_0x023a:
            int r1 = r6.size()
            if (r1 != r4) goto L_0x0037
            java.lang.String r10 = X.DbU.A0t(r6, r0)
            boolean r15 = X.DbV.A1X(r9, r5)
            boolean r16 = X.DbV.A1X(r9, r3)
            java.lang.String r1 = "igsh"
            java.lang.String r12 = r9.getQueryParameter(r1)
            java.lang.String r1 = "comment_id"
            java.lang.String r13 = r9.getQueryParameter(r1)
            java.lang.String r1 = "spin_id"
            java.lang.String r14 = r9.getQueryParameter(r1)
            X.0qQ.A0A(r10)
            X.E8V r8 = new X.E8V
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0348
        L_0x0268:
            java.lang.String r1 = "reels_home"
            boolean r1 = r1.equalsIgnoreCase(r7)
            if (r1 == 0) goto L_0x0274
            X.E8X r8 = X.E8X.A00
            goto L_0x0348
        L_0x0274:
            boolean r2 = r2.equalsIgnoreCase(r7)
            r7 = 3
            int r1 = r6.size()
            if (r2 == 0) goto L_0x02c4
            if (r1 < r7) goto L_0x0037
            java.lang.String r2 = X.AnonymousClass7TE.A19(r6, r0)
            java.lang.String r10 = X.DbU.A0t(r6, r4)
            java.lang.String r1 = "effect_page"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L_0x029b
            X.0qQ.A0A(r10)
            X.E8S r8 = new X.E8S
            r8.<init>(r10)
            goto L_0x0348
        L_0x029b:
            java.lang.String r1 = "audio"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L_0x02ad
            X.0qQ.A0A(r10)
            X.E8T r8 = new X.E8T
            r8.<init>(r10, r12)
            goto L_0x0348
        L_0x02ad:
            java.lang.String r1 = "videos"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L_0x0037
            X.0qQ.A0A(r10)
            r15 = 0
            X.E8V r8 = new X.E8V
            r13 = r12
            r14 = r12
            r16 = r15
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0348
        L_0x02c4:
            if (r1 != r4) goto L_0x02e6
            java.lang.String r2 = X.AnonymousClass7TE.A19(r6, r0)
            java.lang.String r1 = "reels_audio_page"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L_0x02e6
            java.lang.String r1 = "audio_id"
            java.lang.String r2 = r9.getQueryParameter(r1)
            if (r2 == 0) goto L_0x0037
            java.lang.String r1 = "reason"
            java.lang.String r1 = r9.getQueryParameter(r1)
            X.E8T r8 = new X.E8T
            r8.<init>(r2, r1)
            goto L_0x0348
        L_0x02e6:
            int r1 = r6.size()
            if (r1 != r7) goto L_0x0037
            java.lang.String r1 = X.AnonymousClass7TE.A19(r6, r0)
            boolean r1 = r8.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x0037
            java.lang.String r10 = X.DbU.A0t(r6, r4)
            boolean r15 = X.DbV.A1X(r9, r5)
            boolean r16 = X.DbV.A1X(r9, r3)
            X.0qQ.A0A(r10)
            X.E8V r8 = new X.E8V
            r13 = r12
            r14 = r12
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0348
        L_0x030d:
            java.lang.String r1 = "audio"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 != 0) goto L_0x038e
            java.lang.String r1 = "audio_page"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 != 0) goto L_0x038e
            java.lang.String r1 = "reels_audio_page"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x038e
            java.lang.String r1 = "reels_share"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L_0x034b
            java.lang.String r1 = "shortcode"
            java.lang.String r10 = r9.getQueryParameter(r1)
            if (r10 == 0) goto L_0x0037
            java.lang.String r1 = "open_comments"
            boolean r15 = X.DbV.A1X(r9, r1)
            java.lang.String r1 = "open_like_count"
            boolean r16 = X.DbV.A1X(r9, r1)
            X.E8V r8 = new X.E8V
            r13 = r12
            r14 = r12
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x0348:
            r12 = r8
            goto L_0x0037
        L_0x034b:
            java.lang.String r1 = "reels"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L_0x0364
            java.lang.String r1 = X.C46476Dff.A01()
            java.lang.String r1 = r9.getQueryParameter(r1)
            if (r1 == 0) goto L_0x0037
            X.E8R r12 = new X.E8R
            r12.<init>(r1)
            goto L_0x0037
        L_0x0364:
            java.lang.String r1 = "blend"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L_0x0037
            java.lang.String r3 = X.DbT.A0v(r9)
            if (r3 == 0) goto L_0x0037
            java.lang.String r1 = "blend_id"
            java.lang.String r2 = r9.getQueryParameter(r1)
            r1 = 2704(0xa90, float:3.789E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r9.getQueryParameter(r1)
            java.lang.String r1 = "target_media_igid"
            java.lang.String r1 = r9.getQueryParameter(r1)
            X.E8U r12 = new X.E8U
            r12.<init>(r3, r2, r1)
            goto L_0x0037
        L_0x038e:
            java.lang.String r1 = "audio_id"
            java.lang.String r2 = r9.getQueryParameter(r1)
            if (r2 == 0) goto L_0x0037
            java.lang.String r1 = "reason"
            java.lang.String r1 = r9.getQueryParameter(r1)
            X.E8T r12 = new X.E8T
            r12.<init>(r2, r1)
            goto L_0x0037
        L_0x03a3:
            r12 = 0
            goto L_0x0037
        L_0x03a6:
            if (r12 != 0) goto L_0x03aa
            r2 = 0
            return r2
        L_0x03aa:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FG7.A00(com.instagram.common.session.UserSession, java.lang.String, java.lang.String, boolean):android.os.Bundle");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x015b, code lost:
        if (r3 != false) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x015d, code lost:
        r2.A0D = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x015f, code lost:
        r2.A04();
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0054 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A02(android.os.Bundle r32, androidx.fragment.app.FragmentActivity r33, com.instagram.common.session.UserSession r34, X.AnonymousClass4DU r35, boolean r36) {
        /*
            r10 = r35
            if (r35 != 0) goto L_0x0009
            X.Fbp r10 = new X.Fbp
            r10.<init>()
        L_0x0009:
            r1 = 0
            r3 = r32
            if (r32 == 0) goto L_0x0055
            java.lang.String r4 = "InstagramUrlLaunchConstants.EXTRA_SHOULD_INCLUDE_BACK_STACK"
            r0 = r36
            r3.putBoolean(r4, r0)
            java.lang.String r0 = "blend_id"
            boolean r0 = r3.containsKey(r0)
            if (r0 == 0) goto L_0x0164
            java.lang.Integer r0 = X.AnonymousClass05K.A15
        L_0x001f:
            int r0 = r0.intValue()
            r2 = r33
            r11 = r34
            switch(r0) {
                case 0: goto L_0x00c3;
                case 1: goto L_0x0096;
                case 2: goto L_0x008e;
                case 3: goto L_0x0086;
                case 4: goto L_0x007d;
                case 5: goto L_0x0075;
                case 6: goto L_0x0034;
                case 7: goto L_0x00af;
                default: goto L_0x002a;
            }
        L_0x002a:
            X.1pV r4 = X.1pV.A00
            if (r4 == 0) goto L_0x0034
            r2.finish()
            X.C69828Nsp.A00(r3, r2, r11)
        L_0x0034:
            r6 = 0
        L_0x0035:
            X.Dc1 r5 = X.GAH.A00(r11)
            switch(r0) {
                case 0: goto L_0x0072;
                case 1: goto L_0x005d;
                case 2: goto L_0x0060;
                case 3: goto L_0x0063;
                case 4: goto L_0x0066;
                case 5: goto L_0x0069;
                case 6: goto L_0x006c;
                case 7: goto L_0x006f;
                default: goto L_0x003c;
            }
        L_0x003c:
            r2 = 2129(0x851, float:2.983E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r2)
        L_0x0042:
            java.lang.String r3 = "destination"
            X.Dc0 r2 = r5.A00
            r2.A0J(r3, r4)
            if (r0 == r1) goto L_0x0059
            switch(r0) {
                case 1: goto L_0x0059;
                case 2: goto L_0x0059;
                case 3: goto L_0x0059;
                case 4: goto L_0x0059;
                case 5: goto L_0x0059;
                case 6: goto L_0x01c8;
                default: goto L_0x004e;
            }
        L_0x004e:
            r2 = 4
            if (r0 == r2) goto L_0x0056
            r2 = 6
            if (r0 == r2) goto L_0x0055
        L_0x0054:
            r1 = 1
        L_0x0055:
            return r1
        L_0x0056:
            if (r6 != 0) goto L_0x0055
            goto L_0x0054
        L_0x0059:
            r5.A01()
            goto L_0x004e
        L_0x005d:
            java.lang.String r4 = "EFFECT"
            goto L_0x0042
        L_0x0060:
            java.lang.String r4 = "MEDIA"
            goto L_0x0042
        L_0x0063:
            java.lang.String r4 = "VIEWER"
            goto L_0x0042
        L_0x0066:
            java.lang.String r4 = "TAB"
            goto L_0x0042
        L_0x0069:
            java.lang.String r4 = "USER"
            goto L_0x0042
        L_0x006c:
            java.lang.String r4 = "INVALID"
            goto L_0x0042
        L_0x006f:
            java.lang.String r4 = "BLEND"
            goto L_0x0042
        L_0x0072:
            java.lang.String r4 = "AUDIO"
            goto L_0x0042
        L_0x0075:
            X.1pV r4 = X.1pV.A00
            if (r4 == 0) goto L_0x0034
            X.FHB.A0A(r3, r2, r11)
            goto L_0x0034
        L_0x007d:
            X.1pV r4 = X.1pV.A00
            if (r4 == 0) goto L_0x0034
            boolean r6 = r4.A00(r3, r2, r11)
            goto L_0x0035
        L_0x0086:
            X.1pV r4 = X.1pV.A00
            if (r4 == 0) goto L_0x0034
            X.FHB.A06(r3, r2, r11)
            goto L_0x0034
        L_0x008e:
            X.1pV r4 = X.1pV.A00
            if (r4 == 0) goto L_0x0034
            X.FHB.A08(r3, r2, r11)
            goto L_0x0034
        L_0x0096:
            X.1pV r5 = X.1pV.A00
            if (r5 == 0) goto L_0x0034
            X.DbU.A1D(r3, r11)
            instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment r5 = new instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment
            r5.<init>()
            r5.setArguments(r3)
            boolean r3 = r3.getBoolean(r4)
            X.6Yo r2 = X.DbV.A0M(r5, r2, r11)
            goto L_0x015b
        L_0x00af:
            X.1pV r4 = X.1pV.A00
            if (r4 == 0) goto L_0x0034
            r2.finish()
            java.lang.Class<com.instagram.modal.ModalActivity> r5 = com.instagram.modal.ModalActivity.class
            r4 = 468(0x1d4, float:6.56E-43)
            java.lang.String r4 = X.C273654mx.A00(r4)
            X.DbU.A0w(r2, r3, r11, r5, r4)
            goto L_0x0034
        L_0x00c3:
            X.1pV r5 = X.1pV.A00
            if (r5 == 0) goto L_0x0034
            java.lang.String r5 = "reason"
            java.lang.String r7 = r3.getString(r5)
            java.lang.String r5 = X.AnonymousClass7TG.A0j()
            java.lang.String r8 = "deep_link"
            r12 = 0
            if (r7 == 0) goto L_0x00f0
            X.8ZN r9 = X.AnonymousClass8ZN.valueOf(r7)     // Catch:{ IllegalArgumentException -> 0x00db }
            goto L_0x00e5
        L_0x00db:
            java.lang.String r6 = "Failed to parse reason: "
            java.lang.String r6 = X.002.A0R(r6, r7)
            X.0wb.A03(r8, r6)
            r9 = r12
        L_0x00e5:
            java.lang.String r6 = "music_drop"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00f1
            X.8ZN r9 = X.AnonymousClass8ZN.MUSIC_DROP_NOTIF
            goto L_0x00f1
        L_0x00f0:
            r9 = r12
        L_0x00f1:
            java.lang.String r6 = "audio_id"
            java.lang.String r7 = r3.getString(r6)
            if (r7 == 0) goto L_0x013b
            r26 = -1
            long r24 = java.lang.Long.parseLong(r7)     // Catch:{ NumberFormatException -> 0x0137 }
            int r6 = (r24 > r26 ? 1 : (r24 == r26 ? 0 : -1))
            if (r6 == 0) goto L_0x013b
            java.lang.String r18 = X.AnonymousClass7TG.A0j()
            X.HOu r8 = X.C54689HOu.A0M
            com.instagram.search.common.analytics.SearchContext r13 = new com.instagram.search.common.analytics.SearchContext
            r28 = r13
            r29 = r12
            r30 = r12
            r31 = r12
            r32 = r12
            r33 = r12
            r34 = r12
            r35 = r12
            r36 = r12
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r1)
            r15 = r14
            r16 = r14
            r17 = r12
            r19 = r12
            r20 = r12
            r21 = r5
            r22 = r12
            r23 = r12
            X.C52086GEg.A0K(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26)
            goto L_0x013b
        L_0x0137:
            r6 = move-exception
            X.0wb.A07(r8, r6)
        L_0x013b:
            X.0qQ.A0A(r7)
            com.instagram.clips.model.metadata.AudioPageMetadata r7 = X.LT9.A06(r7)
            X.HOu r6 = X.C54689HOu.A0a
            android.os.Bundle r6 = X.C250563lf.A02(r6, r9, r7, r5)
            X.DbU.A1D(r6, r11)
            X.GVT r5 = new X.GVT
            r5.<init>()
            r5.setArguments(r6)
            boolean r3 = r3.getBoolean(r4)
            X.6Yo r2 = X.DbU.A0P(r12, r5, r2, r11)
        L_0x015b:
            if (r3 != 0) goto L_0x015f
            r2.A0D = r1
        L_0x015f:
            r2.A04()
            goto L_0x0034
        L_0x0164:
            java.lang.String r0 = "effect_id"
            boolean r0 = r3.containsKey(r0)
            if (r0 == 0) goto L_0x0170
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x001f
        L_0x0170:
            java.lang.String r0 = "audio_id"
            boolean r0 = r3.containsKey(r0)
            if (r0 == 0) goto L_0x017c
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x001f
        L_0x017c:
            r0 = 105(0x69, float:1.47E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = r3.containsKey(r0)
            if (r0 == 0) goto L_0x0194
            java.lang.String r0 = "ClipsConstants.ARG_CLIPS_INTERNAL_LINK"
            boolean r0 = r3.containsKey(r0)
            if (r0 == 0) goto L_0x01a8
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            goto L_0x001f
        L_0x0194:
            java.lang.String r2 = "ARG_CLIPS_DESTINATION"
            boolean r0 = r3.containsKey(r2)
            if (r0 == 0) goto L_0x01ac
            java.lang.String r2 = r3.getString(r2)
            java.lang.String r0 = "reels_home"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x01ac
        L_0x01a8:
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            goto L_0x001f
        L_0x01ac:
            java.lang.String r0 = "InstagramUrlLaunchConstants.EXTRA_USER_NAME"
            boolean r0 = r3.containsKey(r0)
            if (r0 == 0) goto L_0x01b8
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            goto L_0x001f
        L_0x01b8:
            java.lang.String r0 = "is_content_notes"
            boolean r0 = r3.getBoolean(r0)
            if (r0 == 0) goto L_0x01c4
            java.lang.Integer r0 = X.AnonymousClass05K.A1F
            goto L_0x001f
        L_0x01c4:
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            goto L_0x001f
        L_0x01c8:
            java.lang.String r0 = "Invalid clips deeplink destination"
            r5.A02(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FG7.A02(android.os.Bundle, androidx.fragment.app.FragmentActivity, com.instagram.common.session.UserSession, X.4DU, boolean):boolean");
    }
}
