package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.UZw  reason: case insensitive filesystem */
public abstract class C15291UZw extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "ReelShareCameraFragment";
    public UserSession A00;
    public AnonymousClass80Q A01;
    public AnonymousClass80C A02;
    public final C41837B2s A03 = new WUP(this, 24);

    public final void A01() {
        String str;
        AnonymousClass80Q r2 = this.A01;
        if (r2 != null) {
            if (r2.A00.A01 == 28D.A1S) {
                str = "back";
            } else {
                str = "button";
            }
            r2.A05(str, true);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v128, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v102, resolved type: X.802} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v103, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v51, types: [X.UKc, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v11, types: [X.WaH, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v101 */
    /* JADX WARNING: type inference failed for: r0v106 */
    /* JADX WARNING: type inference failed for: r0v164 */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0c3a, code lost:
        if (r10 == com.instagram.api.schemas.IGAIAgentType.A05) goto L_0x0c3c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass80D A02(android.view.ViewGroup r58) {
        /*
            r57 = this;
            r1 = r57
            boolean r0 = r1 instanceof X.C16442Uuy
            r2 = r58
            if (r0 == 0) goto L_0x00d6
            r7 = r1
            X.Uuy r7 = (X.C16442Uuy) r7
            r4 = 0
            X.0qQ.A0B(r2, r4)
            android.os.Bundle r3 = r7.mArguments
            r1 = 0
            if (r3 == 0) goto L_0x001e
            r0 = 3389(0xd3d, float:4.749E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.io.Serializable r1 = r3.getSerializable(r0)
        L_0x001e:
            boolean r0 = r1 instanceof X.AnonymousClass3BQ
            if (r0 == 0) goto L_0x0d4e
            X.3BQ r1 = (X.AnonymousClass3BQ) r1
            if (r1 == 0) goto L_0x0d4e
            X.28D r6 = X.C14164Tr2.A00(r1)
            android.os.Bundle r1 = r7.mArguments
            if (r1 == 0) goto L_0x0d4b
            r0 = 3386(0xd3a, float:4.745E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r10 = r1.getString(r0)
            if (r10 == 0) goto L_0x0d4b
            android.os.Bundle r1 = r7.mArguments
            if (r1 == 0) goto L_0x0d51
            r0 = 3385(0xd39, float:4.743E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r11 = r1.getString(r0)
            if (r11 == 0) goto L_0x0d51
            android.os.Bundle r1 = r7.mArguments
            if (r1 == 0) goto L_0x0d48
            r0 = 3391(0xd3f, float:4.752E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r3 = r1.getString(r0)
            if (r3 == 0) goto L_0x0d48
            android.os.Bundle r1 = r7.mArguments
            if (r1 == 0) goto L_0x006a
            r0 = 3387(0xd3b, float:4.746E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.util.ArrayList r12 = r1.getParcelableArrayList(r0)
            if (r12 != 0) goto L_0x006f
        L_0x006a:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
        L_0x006f:
            android.os.Bundle r1 = r7.mArguments
            if (r1 == 0) goto L_0x007f
            r0 = 3388(0xd3c, float:4.748E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.util.ArrayList r13 = r1.getParcelableArrayList(r0)
            if (r13 != 0) goto L_0x0084
        L_0x007f:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L_0x0084:
            X.UwR r9 = X.C18241Vo8.A00(r3)
            com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeStickerClientModel r8 = new com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeStickerClientModel
            r8.<init>(r9, r10, r11, r12, r13)
            java.io.File r1 = new java.io.File
            r1.<init>(r10)
            r0 = 3
            com.instagram.common.gallery.Medium r5 = X.C282665Eg.A03(r1, r0, r4)
            X.80D r0 = new X.80D
            r0.<init>()
            X.B2s r1 = r7.A00
            X.AnonymousClass80D.A0D(r0, r1, r7)
            X.80I r3 = X.AnonymousClass80H.A02
            com.instagram.common.session.UserSession r1 = r7.A00
            X.0qQ.A06(r1)
            r12 = 1
            X.AnonymousClass80D.A09(r1, r3, r0, r7)
            r0.A09 = r2
            X.AnonymousClass80D.A07(r6, r7, r0)
            r0.A3H = r12
            r0.A47 = r12
            r10 = -1
            X.80F r9 = new X.80F
            r11 = r10
            r13 = r12
            r14 = r12
            r9.<init>(r10, r11, r12, r13, r14)
            r0.A17 = r9
            r1 = 0
            r0.A0P = r5
            r0.A0w = r1
            r0.A0Q = r5
            r0.A16 = r8
            r0.A3Q = r4
            r0.A3U = r4
            r0.A3y = r12
            X.AnonymousClass80D.A0A(r0)
            X.0qQ.A07(r0)
        L_0x00d5:
            return r0
        L_0x00d6:
            boolean r0 = r1 instanceof X.C16463UvJ
            if (r0 == 0) goto L_0x013e
            r3 = r1
            X.UvJ r3 = (X.C16463UvJ) r3
            r8 = 0
            X.0qQ.A0B(r2, r8)
            long r14 = java.lang.System.currentTimeMillis()
            java.io.File r0 = r3.A03
            X.0qQ.A0A(r0)
            java.lang.String r7 = r0.getAbsolutePath()
            X.0qQ.A07(r7)
            long r12 = X.AnonymousClass7TE.A0P(r14)
            java.io.File r0 = r3.A03
            android.net.Uri r6 = android.net.Uri.fromFile(r0)
            r9 = 1
            com.instagram.common.gallery.Medium r5 = new com.instagram.common.gallery.Medium
            r10 = r8
            r11 = r8
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r14)
            X.80D r0 = new X.80D
            r0.<init>()
            X.B2s r1 = r3.A04
            X.AnonymousClass80D.A0D(r0, r1, r3)
            X.80I r4 = X.AnonymousClass80H.A02
            com.instagram.common.session.UserSession r1 = r3.A00
            X.0qQ.A06(r1)
            X.AnonymousClass80D.A09(r1, r4, r0, r3)
            r0.A09 = r2
            X.28D r1 = X.28D.A5W
            r0.A0B = r1
            r0.A0O = r3
            android.graphics.RectF r2 = r3.A00
            android.graphics.RectF r1 = r3.A01
            X.AnonymousClass80D.A02(r2, r1, r0)
            r0.A3y = r9
            r0.A3g = r9
            r1 = 0
            r0.A0P = r5
            r0.A0w = r1
            r0.A3Q = r9
            r0.A3o = r9
            com.instagram.pendingmedia.model.recipients.PendingRecipient r1 = r3.A02
        L_0x0135:
            if (r1 == 0) goto L_0x0cf8
            r0.A1S = r1
            X.80E r1 = X.AnonymousClass80E.GROUP_PROFILE
        L_0x013b:
            r0.A0y = r1
            return r0
        L_0x013e:
            boolean r0 = r1 instanceof X.C16441Uux
            if (r0 == 0) goto L_0x01df
            r9 = 0
            X.0qQ.A0B(r2, r9)
            int r0 = X.JTT.A06(r1)
            float r4 = (float) r0
            int r0 = X.C13990Tnq.A0A(r1)
            float r3 = (float) r0
            r0 = 0
            android.graphics.RectF r8 = X.AnonymousClass7TF.A0C(r4, r3)
            android.graphics.RectF r7 = new android.graphics.RectF
            r7.<init>(r0, r0, r4, r3)
            r0 = 29
            X.WUP r3 = new X.WUP
            r3.<init>(r1, r0)
            X.80D r0 = new X.80D
            r0.<init>()
            X.AnonymousClass80D.A0C(r0, r3, r1)
            X.80I r6 = X.AnonymousClass80H.A02
            com.instagram.common.session.UserSession r5 = r1.A00
            X.0qQ.A07(r5)
            r4 = 1
            X.9QA r3 = X.AnonymousClass9QA.A00
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            X.AnonymousClass80D.A08(r5, r6, r3, r0)
            X.AnonymousClass80D.A05(r2, r0, r1, r4)
            X.28D r2 = X.28D.A5J
            X.AnonymousClass80D.A07(r2, r1, r0)
            X.AnonymousClass80D.A01(r8, r7, r0)
            X.AnonymousClass80D.A0A(r0)
            r0.A3Q = r4
            r4 = 0
            X.C13989Tnp.A0y()
            com.instagram.reels.chat.model.ChatStickerChannelType r7 = com.instagram.reels.chat.model.ChatStickerChannelType.SUBSCRIBER
            r2 = 86400(0x15180, double:4.26873E-319)
            java.lang.Long r16 = java.lang.Long.valueOf(r2)
            com.instagram.common.session.UserSession r2 = r1.A00
            X.0qQ.A07(r2)
            com.instagram.user.model.User r2 = X.AnonymousClass7TF.A0Q(r2)
            java.lang.String r20 = X.DbU.A0p(r2)
            com.instagram.reels.chat.model.ChatStickerStickerType r8 = com.instagram.reels.chat.model.ChatStickerStickerType.JOIN_CHAT_STICKER
            java.lang.String r24 = ""
            r3 = 2131974610(0x7f1359d2, float:1.9586289E38)
            com.instagram.common.session.UserSession r2 = r1.A00
            X.0qQ.A07(r2)
            com.instagram.user.model.User r2 = X.AnonymousClass7TF.A0Q(r2)
            java.lang.String r2 = r2.getUsername()
            java.lang.String r26 = X.DbV.A0z(r1, r2, r3)
            r5 = r4
            r6 = r4
            r9 = r4
            r10 = r4
            r11 = r4
            r13 = r12
            r14 = r12
            r15 = r12
            r17 = r4
            r18 = r4
            r19 = r4
            r21 = r4
            r22 = r4
            r23 = r4
            r25 = r4
            r27 = r4
            X.UOB r1 = X.C17032VFg.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            X.WaH r1 = X.C18234Vo1.A01(r1)
            r0.A1X = r1
            return r0
        L_0x01df:
            boolean r0 = r1 instanceof X.C16456UvC
            if (r0 == 0) goto L_0x024c
            r5 = r1
            X.UvC r5 = (X.C16456UvC) r5
            r0 = 0
            android.content.Context r1 = X.DbT.A06(r5, r2, r0)
            int r0 = X.0nA.A09(r1)
            float r3 = (float) r0
            int r0 = X.0nA.A08(r1)
            float r1 = (float) r0
            r0 = 0
            android.graphics.RectF r7 = X.AnonymousClass7TF.A0C(r3, r1)
            android.graphics.RectF r6 = new android.graphics.RectF
            r6.<init>(r0, r0, r3, r1)
            X.80D r0 = new X.80D
            r0.<init>()
            X.WUP r1 = r5.A06
            X.AnonymousClass80D.A0C(r0, r1, r5)
            X.80I r4 = X.AnonymousClass80H.A02
            com.instagram.common.session.UserSession r1 = r5.A00
            X.0qQ.A06(r1)
            r3 = 1
            X.AnonymousClass80D.A09(r1, r4, r0, r5)
            r0.A09 = r2
            X.28D r1 = r5.A01
            X.AnonymousClass80D.A07(r1, r5, r0)
            X.AnonymousClass80D.A02(r7, r6, r0)
            X.AnonymousClass80D.A0A(r0)
            X.AnonymousClass80D.A0B(r0)
            r0.A3Q = r3
            com.instagram.common.session.UserSession r1 = r5.A00
            X.0qQ.A07(r1)
            com.instagram.user.model.User r1 = X.AnonymousClass7TF.A0Q(r1)
            com.instagram.common.typedurl.ImageUrl r4 = r1.Bh3()
            r1 = 2131976261(0x7f136045, float:1.9589638E38)
            java.lang.String r6 = X.DbU.A0m(r5, r1)
            java.lang.String r7 = r5.A04
            java.lang.String r8 = r5.A05
            int r10 = r5.A00
            java.lang.String r9 = r5.A03
            java.lang.Long r5 = r5.A02
            X.JzL r3 = new X.JzL
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0.A1o = r3
            return r0
        L_0x024c:
            boolean r0 = r1 instanceof X.C16451Uv7
            if (r0 == 0) goto L_0x029f
            r6 = r1
            X.Uv7 r6 = (X.C16451Uv7) r6
            r5 = 0
            X.0qQ.A0B(r2, r5)
            int r1 = X.JTT.A06(r6)
            int r0 = X.C13990Tnq.A0A(r6)
            float r4 = (float) r1
            float r3 = (float) r0
            r1 = 0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r1, r1, r4, r3)
            r0.offsetTo(r1, r3)
            X.80D r0 = new X.80D
            r0.<init>()
            X.B2s r1 = r6.A03
            X.AnonymousClass80D.A0D(r0, r1, r6)
            X.80I r4 = X.AnonymousClass80H.A02
            com.instagram.common.session.UserSession r1 = r6.A00
            X.0qQ.A06(r1)
            r3 = 1
            X.AnonymousClass80D.A09(r1, r4, r0, r6)
            r0.A09 = r2
            X.28D r1 = r6.A00
            X.AnonymousClass80D.A07(r1, r6, r0)
            r0.A3H = r3
            X.AnonymousClass80D.A0A(r0)
            com.instagram.user.model.UpcomingEvent r1 = r6.A01
            r0.A1u = r1
            java.io.File r1 = r6.A02
            if (r1 == 0) goto L_0x00d5
            com.instagram.common.gallery.Medium r2 = X.C282665Eg.A03(r1, r3, r5)
            r1 = 0
            r0.A0P = r2
            r0.A0w = r1
            r0.A3y = r3
            return r0
        L_0x029f:
            boolean r0 = r1 instanceof X.C16462UvI
            if (r0 == 0) goto L_0x0326
            r3 = r1
            X.UvI r3 = (X.C16462UvI) r3
            r7 = 0
            android.graphics.RectF r5 = X.AnonymousClass7TG.A0M(r3, r2)
            X.80D r0 = new X.80D
            r0.<init>()
            X.B2s r1 = r3.A01
            if (r1 != 0) goto L_0x02be
            java.lang.String r17 = "standaloneFundraiserQuickCaptureEnvironment"
        L_0x02b6:
            X.0qQ.A0F(r17)
        L_0x02b9:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x02be:
            r0.A0l = r1
            com.instagram.common.session.UserSession r1 = r3.A00
            r1.getClass()
            r0.A0S = r1
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            r0.A05 = r1
            r0.A0M = r3
            X.80I r4 = X.AnonymousClass80H.A02
            com.instagram.common.session.UserSession r1 = r3.A00
            X.0qQ.A06(r1)
            r8 = 1
            X.AnonymousClass80D.A09(r1, r4, r0, r3)
            r0.A09 = r2
            X.28D r1 = r3.A00
            if (r1 == 0) goto L_0x0cb5
            X.AnonymousClass80D.A07(r1, r3, r0)
            r2 = 0
            X.AnonymousClass80D.A01(r5, r2, r0)
            r0.A3g = r8
            r0.A3N = r8
            r0.A3M = r8
            r0.A3L = r8
            r0.A3J = r8
            r0.A3f = r8
            r0.A47 = r7
            X.AnonymousClass80D.A0B(r0)
            r0.A3Q = r8
            X.82j r1 = r3.A03
            r0.A1y = r1
            r0.A3y = r8
            java.io.File r1 = r3.A04
            if (r1 == 0) goto L_0x0322
            long r13 = java.lang.System.currentTimeMillis()
            java.lang.String r6 = r1.getAbsolutePath()
            X.0qQ.A07(r6)
            long r11 = X.AnonymousClass7TE.A0P(r13)
            android.net.Uri r5 = android.net.Uri.fromFile(r1)
            com.instagram.common.gallery.Medium r4 = new com.instagram.common.gallery.Medium
            r9 = r7
            r10 = r7
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r13)
            r0.A0P = r4
            r0.A0w = r2
        L_0x0322:
            com.instagram.pendingmedia.model.recipients.PendingRecipient r1 = r3.A02
            goto L_0x0135
        L_0x0326:
            boolean r0 = r1 instanceof X.C16453Uv9
            if (r0 == 0) goto L_0x0385
            r7 = r1
            X.Uv9 r7 = (X.C16453Uv9) r7
            r5 = 0
            X.0qQ.A0B(r2, r5)
            X.80D r0 = new X.80D
            r0.<init>()
            X.B2s r1 = r7.A03
            X.AnonymousClass80D.A0D(r0, r1, r7)
            X.80I r3 = X.AnonymousClass80H.A02
            com.instagram.common.session.UserSession r1 = r7.A00
            X.0qQ.A06(r1)
            r4 = 1
            X.AnonymousClass80D.A09(r1, r3, r0, r7)
            r0.A09 = r2
            X.28D r1 = r7.A00
            if (r1 != 0) goto L_0x0353
            java.lang.String r6 = "entryPoint"
        L_0x034e:
            X.0qQ.A0F(r6)
            goto L_0x02b9
        L_0x0353:
            r0.A0B = r1
            r0.A0O = r7
            r0.A3H = r4
            r0.A3y = r4
            r0.A3g = r4
            X.80E r1 = X.AnonymousClass80E.ALL
            r0.A0y = r1
            r0.A3Q = r4
            java.lang.String r3 = r7.A01
            if (r3 != 0) goto L_0x036a
            java.lang.String r6 = "backgroundFile"
            goto L_0x034e
        L_0x036a:
            java.io.File r1 = new java.io.File
            r1.<init>(r3)
            com.instagram.common.gallery.Medium r3 = X.C282665Eg.A03(r1, r4, r5)
            r1 = 0
            r0.A0P = r3
            r0.A0w = r1
            java.lang.String r5 = r7.A03
            java.lang.String r6 = "shoutoutUsername"
            if (r5 == 0) goto L_0x034e
            java.lang.String r4 = r7.A02
            if (r4 != 0) goto L_0x0d62
            java.lang.String r6 = "shoutoutTitle"
            goto L_0x034e
        L_0x0385:
            boolean r0 = r1 instanceof X.C16449Uv5
            if (r0 == 0) goto L_0x03f3
            r5 = r1
            X.Uv5 r5 = (X.C16449Uv5) r5
            r0 = 0
            X.0qQ.A0B(r2, r0)
            android.graphics.RectF r4 = X.AnonymousClass7TH.A04(r5)
            X.WaN r6 = r5.A01
            boolean r0 = r5.A02
            r10 = 0
            if (r0 == 0) goto L_0x03cf
            java.lang.String r13 = "DEFAULT"
            if (r6 == 0) goto L_0x0d8b
            java.lang.String r16 = "DONOR_DUPLICATE_PROMPT"
            X.8YF r0 = r6.A00
            com.instagram.user.model.User r9 = r0.A02
            r9.getClass()
            java.lang.String r11 = r0.A04
            X.4Hy r8 = r0.A01
            java.lang.String r12 = r0.A05
            java.lang.String r14 = r0.A07
            int r7 = r0.A00
            java.lang.String r15 = r0.A08
            java.lang.String r6 = r0.A0A
            java.lang.String r3 = r0.A0B
            java.lang.String r1 = r0.A0C
            java.lang.String r0 = r0.A0D
            r21 = r7
            r19 = r1
            r20 = r0
            r18 = r3
            r17 = r6
            X.8YF r0 = X.C39574A0q.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.WaN r6 = new X.WaN
            r6.<init>(r0)
        L_0x03cf:
            X.80D r0 = new X.80D
            r0.<init>()
            X.B2s r1 = r5.A03
            X.AnonymousClass80D.A0D(r0, r1, r5)
            X.80I r3 = X.AnonymousClass80H.A02
            com.instagram.common.session.UserSession r1 = r5.A00
            X.0qQ.A06(r1)
            X.AnonymousClass80D.A09(r1, r3, r0, r5)
            r0.A09 = r2
            X.28D r1 = r5.A00
            if (r1 != 0) goto L_0x0d7d
            java.lang.String r0 = "cameraEntryPoint"
        L_0x03eb:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x03f3:
            boolean r0 = r1 instanceof X.C16459UvF
            if (r0 == 0) goto L_0x0474
            r5 = r1
            X.UvF r5 = (X.C16459UvF) r5
            r4 = 0
            X.0qQ.A0B(r2, r4)
            X.80D r0 = new X.80D
            r0.<init>()
            X.B2s r1 = r5.A03
            X.AnonymousClass80D.A0D(r0, r1, r5)
            java.util.Set r6 = X.C338817ia.A01()
            com.instagram.reels.question.model.responsetype.QuestionResponseType r3 = r5.A04
            com.instagram.reels.question.model.responsetype.QuestionResponseType r1 = com.instagram.reels.question.model.responsetype.QuestionResponseType.MUSIC
            if (r3 != r1) goto L_0x041c
            X.80N r1 = X.AnonymousClass80N.A00
            r6.remove(r1)
            X.80L r1 = X.AnonymousClass80L.A00
            r6.remove(r1)
        L_0x041c:
            X.80I r3 = X.AnonymousClass80H.A02
            com.instagram.common.session.UserSession r1 = r5.A00
            X.0qQ.A06(r1)
            X.80H r1 = r3.A02(r6)
            r1.getClass()
            r0.A0W = r1
            r3 = 1
            X.AnonymousClass80D.A05(r2, r0, r5, r3)
            X.28D r1 = r5.A02
            if (r1 == 0) goto L_0x094e
            X.AnonymousClass80D.A07(r1, r5, r0)
            android.graphics.RectF r6 = r5.A01
            r1 = 0
            r0.A06 = r6
            r0.A07 = r6
            r0.A3r = r3
            r0.A3v = r4
            r0.A33 = r4
            r0.A04 = r1
            r0.A3H = r3
            X.AnonymousClass80D.A0A(r0)
            X.AnonymousClass80D.A0B(r0)
            int r2 = r5.A00
            java.lang.String r11 = r5.A07
            java.lang.String r1 = "Required value was null."
            if (r11 == 0) goto L_0x0da2
            java.lang.String r12 = r5.A08
            if (r12 == 0) goto L_0x0d9c
            java.lang.String r13 = r5.A06
            if (r13 == 0) goto L_0x0d96
            com.instagram.reels.question.model.responsetype.QuestionResponseType r7 = r5.A04
            if (r7 == 0) goto L_0x0d90
            java.lang.String r14 = r5.A0A
            com.instagram.reels.question.model.MusicQuestionResponseModel r6 = r5.A03
            com.instagram.reels.questionv2.model.QuestionMediaResponseModel r8 = r5.A05
            java.lang.String r15 = r5.A09
            if (r15 != 0) goto L_0x0f79
            java.lang.String r1 = "responderUserId"
        L_0x046f:
            X.0qQ.A0F(r1)
            goto L_0x02b9
        L_0x0474:
            boolean r0 = r1 instanceof X.C16455UvB
            if (r0 == 0) goto L_0x0502
            r7 = r1
            X.UvB r7 = (X.C16455UvB) r7
            r9 = 0
            X.0qQ.A0B(r2, r9)
            com.instagram.user.model.User r1 = r7.A01
            r0 = 0
            if (r1 == 0) goto L_0x00d5
            com.instagram.common.gallery.Medium r1 = r7.A00
            if (r1 == 0) goto L_0x00d5
            android.content.Context r3 = r7.requireContext()
            int r1 = X.AnonymousClass0nB.A01(r3)
            float r4 = (float) r1
            int r1 = X.AnonymousClass0nB.A00(r3)
            float r3 = (float) r1
            r1 = 0
            android.graphics.RectF r8 = X.AnonymousClass7TF.A0C(r4, r3)
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>(r1, r1, r4, r3)
            X.80D r6 = new X.80D
            r6.<init>()
            X.B2s r1 = r7.A03
            X.AnonymousClass80D.A0D(r6, r1, r7)
            X.80I r4 = X.AnonymousClass80H.A02
            com.instagram.common.session.UserSession r1 = r7.A00
            X.0qQ.A06(r1)
            r3 = 1
            X.AnonymousClass80D.A09(r1, r4, r6, r7)
            r6.A09 = r2
            X.28D r1 = X.28D.A5J
            r6.A0B = r1
            r6.A0O = r7
            r1 = 150(0x96, double:7.4E-322)
            r6.A06 = r8
            r6.A07 = r5
            r6.A3r = r3
            r6.A3v = r9
            r6.A33 = r9
            r6.A04 = r1
            com.instagram.common.gallery.Medium r1 = r7.A00
            r6.A0P = r1
            r6.A0w = r0
            X.80E r1 = X.AnonymousClass80E.ALL
            r6.A0y = r1
            r6.A3s = r3
            r6.A3q = r3
            r6.A3U = r3
            r6.A3f = r9
            r6.A3H = r3
            r6.A3y = r3
            com.instagram.user.model.User r1 = r7.A01
            r6.A1v = r1
            java.lang.String r5 = r7.A05
            java.lang.Integer r4 = r7.A02
            java.lang.String r3 = r7.A03
            java.lang.String r2 = r7.A04
            if (r1 == 0) goto L_0x04f3
            java.lang.String r0 = r1.getId()
        L_0x04f3:
            r13 = 4
            X.QP8 r1 = new X.QP8
            r7 = r1
            r8 = r4
            r9 = r5
            r10 = r3
            r11 = r2
            r12 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r6.A0F = r1
            return r6
        L_0x0502:
            boolean r0 = r1 instanceof X.C16450Uv6
            if (r0 == 0) goto L_0x052b
            X.Uv6 r1 = (X.C16450Uv6) r1
            r16 = 0
            r0 = r16
            X.0qQ.A0B(r2, r0)
            X.OZ9 r8 = X.OZ9.A00
            android.content.Context r9 = r1.requireContext()
            com.instagram.common.session.UserSession r7 = r1.A00
            X.0qQ.A07(r7)
            com.instagram.direct.sharetostory.data.MessageShareStickerData r3 = r1.A02
            java.lang.String r17 = "stickerData"
            r0 = 0
            if (r3 == 0) goto L_0x02b6
            java.lang.String r6 = r3.A0A
            com.instagram.direct.capabilities.Capabilities r5 = r1.A01
            if (r5 != 0) goto L_0x0b1c
            java.lang.String r17 = "threadCapabilities"
            goto L_0x02b6
        L_0x052b:
            boolean r0 = r1 instanceof X.C16448Uv4
            if (r0 == 0) goto L_0x057c
            r7 = r1
            X.Uv4 r7 = (X.C16448Uv4) r7
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r7.getContext()
            int r1 = X.JTT.A06(r7)
            int r0 = X.C13990Tnq.A0A(r7)
            float r3 = (float) r1
            float r1 = (float) r0
            r0 = 0
            android.graphics.RectF r6 = X.AnonymousClass7TF.A0C(r3, r1)
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>(r0, r0, r3, r1)
            X.80D r0 = new X.80D
            r0.<init>()
            X.B2s r1 = r7.A03
            X.AnonymousClass80D.A0C(r0, r1, r7)
            X.80I r4 = X.AnonymousClass80H.A02
            com.instagram.common.session.UserSession r1 = r7.A00
            X.0qQ.A06(r1)
            r3 = 1
            X.AnonymousClass80D.A09(r1, r4, r0, r7)
            r0.A09 = r2
            X.28D r1 = r7.A00
            if (r1 == 0) goto L_0x094e
            X.AnonymousClass80D.A07(r1, r7, r0)
            X.AnonymousClass80D.A01(r6, r5, r0)
            X.AnonymousClass80D.A0A(r0)
            X.AnonymousClass80D.A0B(r0)
            java.lang.String r5 = r7.A02
            if (r5 != 0) goto L_0x0da8
            java.lang.String r1 = "linkShareURL"
            goto L_0x046f
        L_0x057c:
            boolean r0 = r1 instanceof X.C16447Uv3
            if (r0 == 0) goto L_0x0637
            X.Uv3 r1 = (X.C16447Uv3) r1
            r8 = 0
            X.0qQ.A0B(r2, r8)
            r1.getContext()
            int r3 = X.JTT.A06(r1)
            int r0 = X.C13990Tnq.A0A(r1)
            float r5 = (float) r3
            float r4 = (float) r0
            r3 = 0
            android.graphics.RectF r7 = X.AnonymousClass7TF.A0C(r5, r4)
            r14 = 0
            X.C13989Tnp.A0y()
            r6 = 1
            java.lang.Integer r22 = java.lang.Integer.valueOf(r8)
            com.instagram.direct.sharetostory.data.JoinChatStickerData r0 = r1.A01
            java.lang.String r13 = "stickerData"
            r30 = 0
            if (r0 == 0) goto L_0x0632
            int r9 = r0.A00
            java.lang.Integer r23 = java.lang.Integer.valueOf(r9)
            int r9 = r0.A02
            com.instagram.reels.chat.model.ChatStickerChannelType r17 = X.C18234Vo1.A00(r9)
            r9 = -1
            java.lang.Long r26 = java.lang.Long.valueOf(r9)
            java.lang.String r11 = r0.A04
            com.instagram.common.typedurl.ImageUrl r9 = r0.A03
            if (r9 == 0) goto L_0x05c5
            java.lang.String r30 = r9.getUrl()
        L_0x05c5:
            java.lang.Boolean r20 = java.lang.Boolean.valueOf(r6)
            java.lang.Boolean r21 = java.lang.Boolean.valueOf(r8)
            int r9 = r0.A01
            java.lang.Integer r25 = java.lang.Integer.valueOf(r9)
            com.instagram.reels.chat.model.ChatStickerStickerType r18 = com.instagram.reels.chat.model.ChatStickerStickerType.JOIN_CHAT_STICKER
            java.lang.String r10 = r0.A05
            java.lang.String r9 = r0.A07
            java.lang.String r0 = r0.A06
            r15 = r14
            r16 = r14
            r19 = r14
            r24 = r22
            r27 = r14
            r28 = r14
            r29 = r11
            r31 = r14
            r32 = r14
            r33 = r14
            r34 = r10
            r35 = r9
            r36 = r0
            r37 = r14
            X.UOB r12 = X.C17032VFg.A00(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            com.instagram.direct.sharetostory.data.JoinChatStickerData r0 = r1.A01
            if (r0 == 0) goto L_0x0632
            boolean r11 = r0.A08
            boolean r9 = r0.A0A
            boolean r0 = r0.A09
            X.WaH r10 = new X.WaH
            r10.<init>()
            r10.A00 = r12
            r10.A01 = r11
            r10.A03 = r9
            r10.A02 = r0
            android.graphics.RectF r9 = new android.graphics.RectF
            r9.<init>(r3, r3, r5, r4)
            X.80D r0 = new X.80D
            r0.<init>()
            X.B2s r3 = r1.A03
            X.AnonymousClass80D.A0C(r0, r3, r1)
            X.80I r4 = X.AnonymousClass80H.A02
            com.instagram.common.session.UserSession r3 = r1.A00
            X.0qQ.A06(r3)
            X.AnonymousClass80D.A09(r3, r4, r0, r1)
            r0.A09 = r2
            X.28D r2 = r1.A00
            if (r2 != 0) goto L_0x0cfc
            java.lang.String r13 = "cameraEntryPoint"
        L_0x0632:
            X.0qQ.A0F(r13)
            goto L_0x02b9
        L_0x0637:
            boolean r0 = r1 instanceof X.C16466UvM
            if (r0 == 0) goto L_0x0699
            r3 = r1
            X.UvM r3 = (X.C16466UvM) r3
            r8 = 0
            X.0qQ.A0B(r2, r8)
            long r14 = java.lang.System.currentTimeMillis()
            java.io.File r0 = r3.A04
            if (r0 == 0) goto L_0x0df9
            java.lang.String r7 = r0.getAbsolutePath()
            X.0qQ.A07(r7)
            long r12 = X.AnonymousClass7TE.A0P(r14)
            java.io.File r0 = r3.A04
            android.net.Uri r6 = android.net.Uri.fromFile(r0)
            r9 = 1
            com.instagram.common.gallery.Medium r5 = new com.instagram.common.gallery.Medium
            r10 = r8
            r11 = r8
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r14)
            X.80D r0 = new X.80D
            r0.<init>()
            X.B2s r1 = r3.A05
            X.AnonymousClass80D.A0D(r0, r1, r3)
            X.80I r4 = X.AnonymousClass80H.A02
            com.instagram.common.session.UserSession r1 = r3.A00
            X.0qQ.A06(r1)
            X.AnonymousClass80D.A09(r1, r4, r0, r3)
            r0.A09 = r2
            X.28D r1 = X.28D.A3H
            r0.A0B = r1
            r0.A0O = r3
            android.graphics.RectF r2 = r3.A00
            android.graphics.RectF r1 = r3.A01
            X.AnonymousClass80D.A02(r2, r1, r0)
            r0.A3y = r9
            r0.A3g = r9
            r1 = 0
            r0.A0P = r5
            r0.A0w = r1
            r0.A3Q = r9
            com.instagram.infocenter.intf.InfoCenterShareInfoIntf r1 = r3.A02
            r0.A1G = r1
            com.instagram.pendingmedia.model.recipients.PendingRecipient r1 = r3.A03
            goto L_0x0135
        L_0x0699:
            boolean r0 = r1 instanceof X.C16465UvL
            if (r0 == 0) goto L_0x06af
            r6 = r1
            X.UvL r6 = (X.C16465UvL) r6
            java.lang.String r5 = "ReelInfoCenterFactShareFragment"
            java.lang.String r4 = "Required value was null."
            r3 = 0
            X.0qQ.A0B(r2, r3)
            long r17 = java.lang.System.currentTimeMillis()
            r0 = 0
            goto L_0x0d17
        L_0x06af:
            boolean r0 = r1 instanceof X.C16464UvK
            if (r0 == 0) goto L_0x071a
            r4 = r1
            X.UvK r4 = (X.C16464UvK) r4
            r9 = 0
            X.0qQ.A0B(r2, r9)
            X.5u1 r0 = r4.A02
            r3 = 0
            if (r0 == 0) goto L_0x0f2e
            X.BIR r0 = r0.A00
            if (r0 == 0) goto L_0x0f2e
            long r15 = java.lang.System.currentTimeMillis()
            r10 = 1
            java.io.File r0 = r4.A04
            X.0qQ.A0A(r0)
            java.lang.String r8 = r0.getAbsolutePath()
            X.0qQ.A07(r8)
            long r13 = X.AnonymousClass7TE.A0P(r15)
            java.io.File r0 = r4.A04
            android.net.Uri r7 = android.net.Uri.fromFile(r0)
            com.instagram.common.gallery.Medium r6 = new com.instagram.common.gallery.Medium
            r11 = r9
            r12 = r9
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r15)
            X.80D r0 = new X.80D
            r0.<init>()
            X.B2s r1 = r4.A05
            X.AnonymousClass80D.A0D(r0, r1, r4)
            X.80I r5 = X.AnonymousClass80H.A02
            com.instagram.common.session.UserSession r1 = r4.A00
            X.0qQ.A06(r1)
            X.AnonymousClass80D.A09(r1, r5, r0, r4)
            r0.A09 = r2
            X.28D r1 = X.28D.A36
            r0.A0B = r1
            r0.A0O = r4
            android.graphics.RectF r2 = r4.A00
            android.graphics.RectF r1 = r4.A01
            X.AnonymousClass80D.A02(r2, r1, r0)
            r0.A3y = r10
            r0.A3g = r10
            r0.A0P = r6
            r0.A0w = r3
            X.5u1 r1 = r4.A02
            r0.A1E = r1
            r0.A3Q = r10
            com.instagram.pendingmedia.model.recipients.PendingRecipient r1 = r4.A03
            goto L_0x0135
        L_0x071a:
            boolean r0 = r1 instanceof X.C16452Uv8
            if (r0 == 0) goto L_0x0780
            r4 = r1
            X.Uv8 r4 = (X.C16452Uv8) r4
            r0 = 0
            X.0qQ.A0B(r2, r0)
            android.graphics.RectF r5 = X.AnonymousClass7TH.A04(r4)
            X.80D r0 = new X.80D
            r0.<init>()
            X.B2s r1 = r4.A03
            X.AnonymousClass80D.A0D(r0, r1, r4)
            X.80I r3 = X.AnonymousClass80H.A02
            com.instagram.common.session.UserSession r1 = r4.A00
            X.0qQ.A06(r1)
            X.AnonymousClass80D.A09(r1, r3, r0, r4)
            r0.A09 = r2
            X.28D r1 = r4.A03
            r0.A0B = r1
            X.AnonymousClass80D.A03(r5, r4, r0)
            X.AnonymousClass80D.A0A(r0)
            int[] r1 = X.C19475WaN.A03
            com.instagram.user.model.User r5 = r4.A04
            X.0qQ.A0A(r5)
            r5.getClass()
            com.instagram.user.model.User r1 = r4.A04
            X.0qQ.A0A(r1)
            android.content.Context r3 = r4.requireContext()
            r2 = 2131962835(0x7f132bd3, float:1.9562406E38)
            java.lang.String r1 = r1.B8Q()
            java.lang.String r2 = X.DbW.A0h(r3, r1, r2)
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r6 = r2.toUpperCase(r1)
            int r9 = r4.A02
            int r8 = r4.A01
            int r7 = r4.A00
            X.Vja r4 = new X.Vja
            r4.<init>(r5, r6, r7, r8, r9)
            r0.A1a = r4
            X.AnonymousClass80D.A0B(r0)
            return r0
        L_0x0780:
            boolean r0 = r1 instanceof X.C16444Uv0
            if (r0 == 0) goto L_0x07cc
            r4 = r1
            X.Uv0 r4 = (X.C16444Uv0) r4
            r5 = 0
            X.0qQ.A0B(r2, r5)
            X.80D r0 = new X.80D
            r0.<init>()
            X.B2s r1 = r4.A03
            X.AnonymousClass80D.A0D(r0, r1, r4)
            X.80I r3 = X.AnonymousClass80H.A02
            com.instagram.common.session.UserSession r1 = r4.A00
            X.0qQ.A06(r1)
            r6 = 1
            X.AnonymousClass80D.A09(r1, r3, r0, r4)
            r0.A09 = r2
            X.28D r1 = r4.A01
            X.AnonymousClass80D.A07(r1, r4, r0)
            android.graphics.RectF r1 = r4.A00
            X.AnonymousClass80D.A04(r1, r0, r5, r6)
            r0.A3H = r6
            X.AnonymousClass80D.A0A(r0)
            r0.A3N = r6
            r0.A3M = r6
            r0.A3L = r6
            r3 = 2131975153(0x7f135bf1, float:1.958739E38)
            r4 = 2131975154(0x7f135bf2, float:1.9587392E38)
            X.80F r2 = new X.80F
            r7 = r6
            r2.<init>(r3, r4, r5, r6, r7)
            r0.A17 = r2
            r0.A3J = r6
            r0.A3Q = r6
            r0.A3f = r6
            return r0
        L_0x07cc:
            boolean r0 = r1 instanceof X.C16446Uv2
            if (r0 == 0) goto L_0x07dd
            r7 = r1
            X.Uv2 r7 = (X.C16446Uv2) r7
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.WaO r11 = r7.A01
            if (r11 != 0) goto L_0x0e75
            r0 = 0
            return r0
        L_0x07dd:
            boolean r0 = r1 instanceof X.C16461UvH
            if (r0 == 0) goto L_0x08ca
            r5 = r1
            X.UvH r5 = (X.C16461UvH) r5
            r1 = 0
            android.content.Context r0 = X.DbT.A06(r5, r2, r1)
            int r0 = X.AnonymousClass0nB.A01(r0)
            float r3 = (float) r0
            android.content.Context r0 = r5.requireContext()
            int r0 = X.AnonymousClass0nB.A00(r0)
            float r0 = (float) r0
            android.graphics.RectF r7 = X.AnonymousClass7TF.A0C(r3, r0)
            long r25 = java.lang.System.currentTimeMillis()
            java.io.File r0 = r5.A02
            java.lang.String r3 = "storyBackgroundFile"
            if (r0 == 0) goto L_0x0845
            java.lang.String r18 = r0.getCanonicalPath()
            X.0qQ.A07(r18)
            r15 = 0
            long r23 = X.AnonymousClass7TE.A0P(r25)
            java.io.File r0 = r5.A02
            if (r0 == 0) goto L_0x0845
            android.net.Uri r17 = android.net.Uri.fromFile(r0)
            r4 = 1
            com.instagram.common.gallery.Medium r3 = new com.instagram.common.gallery.Medium
            r21 = r1
            r22 = r1
            r19 = r1
            r20 = r4
            r16 = r3
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r25)
            X.80D r0 = new X.80D
            r0.<init>()
            X.B2s r1 = r5.A03
            X.AnonymousClass80D.A0C(r0, r1, r5)
            X.80I r6 = X.AnonymousClass80H.A02
            com.instagram.common.session.UserSession r1 = r5.A00
            X.0qQ.A06(r1)
            X.AnonymousClass80D.A09(r1, r6, r0, r5)
            r0.A09 = r2
            X.28D r1 = r5.A00
            if (r1 != 0) goto L_0x084a
            java.lang.String r3 = "cameraEntryPoint"
        L_0x0845:
            X.0qQ.A0F(r3)
            goto L_0x02b9
        L_0x084a:
            r0.A0B = r1
            r0.A0O = r5
            X.AnonymousClass80D.A02(r7, r15, r0)
            r0.A3y = r4
            X.AnonymousClass80D.A0A(r0)
            android.content.Context r6 = r5.getContext()
            if (r6 != 0) goto L_0x08b5
            r2 = 0
        L_0x085d:
            r0.A0P = r3
            r0.A0w = r2
            r0.A3Q = r4
            com.instagram.direct.sharetostory.data.ChannelChallengeStickerData r1 = r5.A01
            java.lang.String r3 = "stickerData"
            if (r1 == 0) goto L_0x0845
            int r2 = r1.A00
            java.lang.Integer r13 = java.lang.Integer.valueOf(r2)
            java.lang.String r14 = r1.A03
            int r2 = r1.A01
            com.instagram.reels.chat.model.ChatStickerChannelType r11 = X.C18234Vo1.A00(r2)
            com.instagram.reels.chat.model.ChatStickerStickerType r12 = com.instagram.reels.chat.model.ChatStickerStickerType.CHALLENGE_STICKER
            java.lang.String r4 = r1.A04
            java.lang.String r3 = r1.A06
            java.lang.String r2 = r1.A07
            X.UNV r10 = new X.UNV
            r19 = r15
            r18 = r3
            r16 = r4
            r17 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.String r13 = r1.A05
            com.instagram.common.typedurl.ImageUrl r11 = r1.A02
            java.util.List r6 = r1.A0E
            java.util.List r5 = r1.A0F
            java.lang.Integer r12 = r1.A08
            boolean r4 = r1.A0G
            java.lang.String r14 = r1.A0B
            java.lang.String r15 = r1.A0C
            java.lang.String r3 = r1.A09
            java.lang.String r2 = r1.A0A
            java.lang.String r1 = r1.A0D
            X.LwN r9 = new X.LwN
            r18 = r1
            r19 = r6
            r20 = r5
            r21 = r4
            r16 = r3
            r17 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x094b
        L_0x08b5:
            X.ADn r1 = new X.ADn
            r1.<init>(r6)
            X.802 r2 = r1.A01()
            r2.A0E = r4
            java.util.ArrayList r1 = X.AnonymousClass802.A02(r6)
            r2.A0A = r1
            r1 = 2
            r2.A01 = r1
            goto L_0x085d
        L_0x08ca:
            boolean r0 = r1 instanceof X.C16460UvG
            if (r0 == 0) goto L_0x0952
            r6 = r1
            X.UvG r6 = (X.C16460UvG) r6
            r21 = 0
            android.graphics.RectF r5 = X.AnonymousClass7TG.A0M(r6, r2)
            X.80D r0 = new X.80D
            r0.<init>()
            X.B2s r1 = r6.A03
            X.AnonymousClass80D.A0C(r0, r1, r6)
            X.80I r4 = X.AnonymousClass80H.A02
            com.instagram.common.session.UserSession r1 = r6.A00
            X.0qQ.A06(r1)
            r3 = 1
            X.AnonymousClass80D.A09(r1, r4, r0, r6)
            r0.A09 = r2
            X.28D r1 = r6.A00
            if (r1 == 0) goto L_0x094e
            r0.A0B = r1
            r0.A0O = r6
            r8 = 0
            X.AnonymousClass80D.A02(r5, r8, r0)
            X.AnonymousClass80D.A0A(r0)
            X.AnonymousClass80D.A0B(r0)
            r0.A3Q = r3
            com.instagram.direct.sharetostory.data.ChannelChallengeStickerData r9 = r6.A01
            java.lang.String r1 = "stickerData"
            if (r9 == 0) goto L_0x046f
            int r1 = r9.A00
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = r9.A03
            int r1 = r9.A01
            com.instagram.reels.chat.model.ChatStickerChannelType r11 = X.C18234Vo1.A00(r1)
            com.instagram.reels.chat.model.ChatStickerStickerType r12 = com.instagram.reels.chat.model.ChatStickerStickerType.CHALLENGE_STICKER
            java.lang.String r2 = r9.A04
            java.lang.String r1 = r9.A07
            X.UNV r10 = new X.UNV
            r18 = r8
            r19 = r8
            r14 = r3
            r15 = r8
            r16 = r2
            r17 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.String r7 = r9.A05
            com.instagram.common.typedurl.ImageUrl r6 = r9.A02
            java.lang.String r5 = r9.A0B
            java.lang.String r4 = r9.A0C
            java.lang.String r3 = r9.A09
            java.lang.String r2 = r9.A0A
            java.lang.String r1 = r9.A0D
            X.LwN r9 = new X.LwN
            r11 = r6
            r12 = r8
            r13 = r7
            r14 = r5
            r15 = r4
            r16 = r3
            r17 = r2
            r18 = r1
            r20 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
        L_0x094b:
            r0.A1V = r9
            return r0
        L_0x094e:
            java.lang.String r1 = "cameraEntryPoint"
            goto L_0x046f
        L_0x0952:
            boolean r0 = r1 instanceof X.C16457UvD
            if (r0 == 0) goto L_0x09be
            r12 = r1
            X.UvD r12 = (X.C16457UvD) r12
            r11 = 0
            X.0qQ.A0B(r2, r11)
            X.80D r0 = new X.80D
            r0.<init>()
            X.B2s r1 = r12.A03
            X.AnonymousClass80D.A0D(r0, r1, r12)
            X.0sl r4 = X.0sl.A00
            X.9QA r3 = X.AnonymousClass9QA.A00
            com.google.common.collect.SingletonImmutableSet r1 = new com.google.common.collect.SingletonImmutableSet
            r1.<init>(r3)
            X.80H r1 = X.AnonymousClass80I.A00(r4, r1)
            r1.getClass()
            r0.A0W = r1
            r10 = 1
            X.AnonymousClass80D.A05(r2, r0, r12, r10)
            X.28D r1 = X.28D.A2b
            X.AnonymousClass80D.A07(r1, r12, r0)
            r0.A3H = r10
            r0.A3Q = r10
            java.lang.String r9 = r12.A02
            if (r9 != 0) goto L_0x098e
            java.lang.String r1 = "authorProfilePictureUrl"
            goto L_0x046f
        L_0x098e:
            java.lang.String r8 = r12.A03
            if (r8 != 0) goto L_0x0996
            java.lang.String r1 = "authorUsername"
            goto L_0x046f
        L_0x0996:
            java.lang.String r7 = r12.A05
            if (r7 != 0) goto L_0x099e
            java.lang.String r1 = "mediaId"
            goto L_0x046f
        L_0x099e:
            java.lang.String r6 = r12.A06
            if (r6 != 0) goto L_0x09a6
            java.lang.String r1 = "questionId"
            goto L_0x046f
        L_0x09a6:
            java.lang.String r5 = r12.A07
            if (r5 != 0) goto L_0x09ae
            java.lang.String r1 = "reelViewerName"
            goto L_0x046f
        L_0x09ae:
            java.lang.String r4 = r12.A04
            if (r4 != 0) goto L_0x09b6
            java.lang.String r1 = "mediaDeliveryClass"
            goto L_0x046f
        L_0x09b6:
            java.lang.String r3 = r12.A08
            if (r3 != 0) goto L_0x0d23
            java.lang.String r1 = "traySessionId"
            goto L_0x046f
        L_0x09be:
            boolean r0 = r1 instanceof X.C16458UvE
            if (r0 == 0) goto L_0x0a41
            r5 = r1
            X.UvE r5 = (X.C16458UvE) r5
            r10 = 0
            X.0qQ.A0B(r2, r10)
            long r16 = java.lang.System.currentTimeMillis()
            java.io.File r0 = r5.A03
            java.lang.String r1 = "backgroundFile"
            if (r0 == 0) goto L_0x046f
            java.lang.String r9 = r0.getAbsolutePath()
            X.0qQ.A07(r9)
            long r14 = X.AnonymousClass7TE.A0P(r16)
            java.io.File r0 = r5.A03
            if (r0 == 0) goto L_0x046f
            android.net.Uri r8 = android.net.Uri.fromFile(r0)
            r11 = 1
            com.instagram.common.gallery.Medium r7 = new com.instagram.common.gallery.Medium
            r12 = r10
            r13 = r10
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r16)
            X.80D r0 = new X.80D
            r0.<init>()
            X.B2s r1 = r5.A09
            X.AnonymousClass80D.A0D(r0, r1, r5)
            X.80I r3 = X.AnonymousClass80H.A02
            com.instagram.common.session.UserSession r1 = r5.A00
            X.0qQ.A07(r1)
            X.AnonymousClass80D.A09(r1, r3, r0, r5)
            r0.A09 = r2
            X.28D r1 = X.28D.A47
            r0.A0B = r1
            r0.A0O = r5
            r0.A3H = r11
            r0.A3g = r11
            r0.A3y = r11
            r1 = 0
            r0.A0P = r7
            r0.A0w = r1
            r0.A3q = r11
            java.lang.String r9 = r5.A07
            if (r9 != 0) goto L_0x0a1f
            java.lang.String r1 = "collectionUsername"
            goto L_0x046f
        L_0x0a1f:
            com.instagram.common.typedurl.ImageUrl r8 = r5.A02
            if (r8 != 0) goto L_0x0a27
            java.lang.String r1 = "collectionProfilePicUrl"
            goto L_0x046f
        L_0x0a27:
            int r7 = r5.A00
            java.lang.String r6 = r5.A06
            if (r6 != 0) goto L_0x0a31
            java.lang.String r1 = "collectionName"
            goto L_0x046f
        L_0x0a31:
            java.io.File r4 = r5.A04
            if (r4 != 0) goto L_0x0a39
            java.lang.String r1 = "bitmapFile"
            goto L_0x046f
        L_0x0a39:
            java.lang.String r3 = r5.A05
            if (r3 != 0) goto L_0x0ccb
            java.lang.String r1 = "collectionId"
            goto L_0x046f
        L_0x0a41:
            boolean r0 = r1 instanceof X.C16445Uv1
            if (r0 == 0) goto L_0x0a7c
            r9 = r1
            X.Uv1 r9 = (X.C16445Uv1) r9
            r7 = 0
            X.0qQ.A0B(r2, r7)
            android.content.Context r3 = r9.getContext()
            r0 = 0
            if (r3 == 0) goto L_0x00d5
            int r1 = X.AnonymousClass0nB.A01(r3)
            float r4 = (float) r1
            int r1 = X.AnonymousClass0nB.A00(r3)
            float r3 = (float) r1
            r1 = 0
            android.graphics.RectF r8 = X.AnonymousClass7TF.A0C(r4, r3)
            android.graphics.RectF r6 = new android.graphics.RectF
            r6.<init>(r1, r1, r4, r3)
            java.lang.String r4 = r9.A02
            if (r4 == 0) goto L_0x0ef6
            com.instagram.common.session.UserSession r0 = r9.A00
            X.0qQ.A07(r0)
            com.instagram.user.model.User r3 = X.AnonymousClass7TF.A0Q(r0)
            android.graphics.Bitmap r1 = r9.A00
            if (r1 != 0) goto L_0x0ef1
            java.lang.String r0 = "bitmap"
            goto L_0x03eb
        L_0x0a7c:
            boolean r0 = r1 instanceof X.C16454UvA
            if (r0 == 0) goto L_0x0f34
            r3 = r1
            X.UvA r3 = (X.C16454UvA) r3
            r10 = 0
            X.0qQ.A0B(r2, r10)
            long r21 = java.lang.System.currentTimeMillis()
            java.io.File r0 = r3.A02
            java.lang.String r1 = "backgroundFile"
            if (r0 == 0) goto L_0x046f
            java.lang.String r14 = r0.getAbsolutePath()
            X.0qQ.A07(r14)
            r5 = 0
            long r19 = X.AnonymousClass7TE.A0P(r21)
            java.io.File r0 = r3.A02
            if (r0 == 0) goto L_0x046f
            android.net.Uri r13 = android.net.Uri.fromFile(r0)
            r11 = 1
            com.instagram.common.gallery.Medium r12 = new com.instagram.common.gallery.Medium
            r15 = r10
            r16 = r11
            r17 = r10
            r18 = r10
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r21)
            X.80D r0 = new X.80D
            r0.<init>()
            X.B2s r1 = r3.A05
            X.AnonymousClass80D.A0D(r0, r1, r3)
            X.80I r4 = X.AnonymousClass80H.A02
            com.instagram.common.session.UserSession r1 = r3.A00
            X.0qQ.A07(r1)
            X.AnonymousClass80D.A09(r1, r4, r0, r3)
            r0.A09 = r2
            int r2 = r3.A00
            r1 = 4
            if (r2 != r1) goto L_0x0b11
            X.28D r1 = X.28D.A2a
        L_0x0acf:
            r0.A0B = r1
            r0.A0O = r3
            r0.A3H = r11
            r6 = 0
            r0.A0P = r12
            r0.A0w = r5
            r0.A3g = r11
            com.instagram.common.session.UserSession r1 = r3.A00
            X.0qQ.A07(r1)
            com.instagram.user.model.User r1 = X.AnonymousClass7TF.A0Q(r1)
            java.lang.String r7 = r1.getUsername()
            int r1 = r7.length()
            if (r1 == 0) goto L_0x0b09
            android.content.Context r4 = r3.getContext()
            if (r4 == 0) goto L_0x0b09
            r2 = 2131961878(0x7f132816, float:1.9560465E38)
            r1 = 64
            java.lang.String r1 = X.002.A0D(r7, r1)
            java.lang.String r1 = X.DbW.A0h(r4, r1, r2)
            java.lang.String r5 = X.002.A0B(r1)
            X.0qQ.A07(r5)
        L_0x0b09:
            java.util.List r4 = r3.A04
            if (r4 != 0) goto L_0x0b14
            java.lang.String r1 = "mediaIdList"
            goto L_0x046f
        L_0x0b11:
            X.28D r1 = X.28D.A2Z
            goto L_0x0acf
        L_0x0b14:
            java.io.File r2 = r3.A03
            if (r2 != 0) goto L_0x0cb9
            java.lang.String r1 = "exploreGridFile"
            goto L_0x046f
        L_0x0b1c:
            X.0xx r14 = X.AnonymousClass07a.A00(r1)
            r3 = 2
            X.0qQ.A0B(r6, r3)
            X.PgN r4 = X.C73587PgN.A00
            java.lang.Class<X.OyZ> r3 = X.C72209OyZ.class
            java.lang.Object r3 = r7.A01(r3, r4)
            X.OyZ r3 = (X.C72209OyZ) r3
            java.util.HashMap r3 = r3.A00
            java.lang.Object r3 = r3.get(r6)
            X.7LQ r3 = (X.AnonymousClass7LQ) r3
            if (r3 != 0) goto L_0x0b43
            X.0wj r3 = X.0wj.A01
            r2 = 20134884(0x1333be4, float:3.2920077E-38)
            java.lang.String r1 = "messageRowData not in cache"
            X.DbT.A1Q(r3, r1, r2)
            return r0
        L_0x0b43:
            r10 = r1
            r11 = r7
            r12 = r5
            r13 = r3
            android.widget.LinearLayout r42 = r8.A01(r9, r10, r11, r12, r13, r14)
            if (r42 == 0) goto L_0x00d5
            X.C13989Tnp.A0y()
            r3 = 1
            java.lang.Integer r26 = java.lang.Integer.valueOf(r16)
            com.instagram.direct.sharetostory.data.MessageShareStickerData r4 = r1.A02
            if (r4 == 0) goto L_0x02b6
            java.lang.String r7 = r4.A07
            com.instagram.api.schemas.IGAIAgentType r5 = r4.A02
            com.instagram.api.schemas.AiAgentMetadataDictImpl r6 = new com.instagram.api.schemas.AiAgentMetadataDictImpl
            r6.<init>(r5, r0, r7)
            int r5 = r4.A00
            java.lang.Integer r27 = java.lang.Integer.valueOf(r5)
            boolean r5 = r4.A0G
            if (r5 == 0) goto L_0x0cb1
            com.instagram.reels.chat.model.ChatStickerChannelType r21 = com.instagram.reels.chat.model.ChatStickerChannelType.AI_AGENT
        L_0x0b6e:
            r7 = -1
            java.lang.Long r30 = java.lang.Long.valueOf(r7)
            java.lang.Boolean r24 = java.lang.Boolean.valueOf(r3)
            java.lang.Boolean r25 = java.lang.Boolean.valueOf(r16)
            int r5 = r4.A01
            java.lang.Integer r29 = java.lang.Integer.valueOf(r5)
            com.instagram.reels.chat.model.ChatStickerStickerType r22 = com.instagram.reels.chat.model.ChatStickerStickerType.MESSAGE_STICKER
            java.lang.String r7 = r4.A0C
            java.lang.String r5 = r4.A0E
            java.lang.String r4 = r4.A0D
            r20 = r0
            r23 = r0
            r28 = r26
            r31 = r0
            r32 = r0
            r33 = r0
            r34 = r0
            r35 = r0
            r36 = r0
            r37 = r0
            r38 = r7
            r39 = r5
            r40 = r4
            r41 = r0
            r18 = r6
            r19 = r0
            X.UOB r47 = X.C17032VFg.A00(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            com.instagram.direct.sharetostory.data.MessageShareStickerData r4 = r1.A02
            if (r4 == 0) goto L_0x02b6
            java.lang.String r5 = r4.A0A
            r18 = r5
            java.lang.String r15 = r4.A08
            com.instagram.common.typedurl.ImageUrl r14 = r4.A03
            boolean r13 = r4.A0I
            boolean r12 = r4.A0K
            boolean r11 = r4.A0J
            com.instagram.api.schemas.IGAIAgentType r10 = r4.A02
            X.2FW r9 = r4.A05
            java.lang.String r8 = r4.A06
            boolean r7 = r4.A0H
            java.lang.String r6 = r4.A0B
            java.lang.String r5 = r4.A0F
            X.8D7 r4 = new X.8D7
            r45 = r14
            r46 = r9
            r48 = r18
            r49 = r15
            r50 = r8
            r51 = r6
            r52 = r5
            r53 = r13
            r54 = r12
            r55 = r11
            r56 = r7
            r41 = r4
            r43 = r10
            r44 = r0
            r41.<init>(r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56)
            int r5 = X.JTT.A06(r1)
            float r8 = (float) r5
            int r5 = X.C13990Tnq.A0A(r1)
            float r6 = (float) r5
            r5 = 0
            android.graphics.RectF r9 = X.AnonymousClass7TF.A0C(r8, r6)
            android.graphics.RectF r7 = new android.graphics.RectF
            r7.<init>(r5, r5, r8, r6)
            long r27 = java.lang.System.currentTimeMillis()
            java.io.File r5 = r1.A03
            java.lang.String r6 = "storyBackgroundFile"
            if (r5 == 0) goto L_0x034e
            java.lang.String r20 = r5.getCanonicalPath()
            X.0qQ.A07(r20)
            long r25 = X.AnonymousClass7TE.A0P(r27)
            java.io.File r5 = r1.A03
            if (r5 == 0) goto L_0x034e
            android.net.Uri r19 = android.net.Uri.fromFile(r5)
            com.instagram.common.gallery.Medium r5 = new com.instagram.common.gallery.Medium
            r18 = r5
            r21 = r16
            r22 = r3
            r23 = r16
            r24 = r16
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r27)
            com.instagram.direct.sharetostory.data.MessageShareStickerData r6 = r1.A02
            if (r6 == 0) goto L_0x02b6
            com.instagram.api.schemas.IGAIAgentType r10 = r6.A02
            com.instagram.api.schemas.IGAIAgentType r6 = com.instagram.api.schemas.IGAIAgentType.A08
            if (r10 == r6) goto L_0x0c3c
            com.instagram.api.schemas.IGAIAgentType r6 = com.instagram.api.schemas.IGAIAgentType.A05
            r8 = 0
            if (r10 != r6) goto L_0x0c3d
        L_0x0c3c:
            r8 = 1
        L_0x0c3d:
            X.80D r6 = new X.80D
            r6.<init>()
            X.B2s r10 = r1.A03
            X.AnonymousClass80D.A0C(r6, r10, r1)
            X.80I r11 = X.AnonymousClass80H.A02
            com.instagram.common.session.UserSession r10 = r1.A00
            X.0qQ.A06(r10)
            X.AnonymousClass80D.A09(r10, r11, r6, r1)
            r6.A09 = r2
            X.28D r2 = r1.A00
            if (r2 == 0) goto L_0x0cb5
            r6.A0B = r2
            r6.A0O = r1
            X.AnonymousClass80D.A02(r9, r7, r6)
            r6.A3y = r3
            X.AnonymousClass80D.A0A(r6)
            com.instagram.direct.sharetostory.data.MessageShareStickerData r2 = r1.A02
            if (r2 == 0) goto L_0x02b6
            boolean r2 = r2.A0H
            if (r2 != 0) goto L_0x0c77
            if (r8 == 0) goto L_0x0c6f
            java.lang.String r0 = r5.A0X
        L_0x0c6f:
            android.content.Context r9 = r1.getContext()
            if (r9 != 0) goto L_0x0c82
            r2 = 0
        L_0x0c76:
            r0 = r2
        L_0x0c77:
            r6.A0P = r5
            r6.A0w = r0
            r6.A3Q = r3
            r6.A1e = r4
            r6.A31 = r8
            return r6
        L_0x0c82:
            X.ADn r7 = new X.ADn
            r7.<init>(r9)
            r2 = 0
            boolean r1 = X.AnonymousClass7TF.A1V(r0)
            r7.A0B = r1
            if (r0 == 0) goto L_0x0c91
            r2 = 1
        L_0x0c91:
            r7.A0D = r2
            X.802 r2 = r7.A01()
            r2.A0E = r3
            java.util.ArrayList r1 = X.AnonymousClass802.A03(r9)
            r2.A0A = r1
            if (r0 == 0) goto L_0x0c76
            java.util.ArrayList r1 = X.AnonymousClass802.A04(r9, r0)
            java.util.List r0 = r2.A0A
            X.0qQ.A06(r0)
            java.util.ArrayList r0 = X.00k.A0S(r0, r1)
            r2.A0A = r0
            goto L_0x0c76
        L_0x0cb1:
            com.instagram.reels.chat.model.ChatStickerChannelType r21 = com.instagram.reels.chat.model.ChatStickerChannelType.BROADCAST
            goto L_0x0b6e
        L_0x0cb5:
            java.lang.String r17 = "cameraEntryPoint"
            goto L_0x02b6
        L_0x0cb9:
            X.82g r1 = new X.82g
            r1.<init>(r2, r5, r4)
            r0.A10 = r1
            r0.A3y = r11
            r0.A0P = r12
            r0.A0w = r6
            r0.A3q = r11
            android.graphics.RectF r4 = r3.A01
            goto L_0x0ce2
        L_0x0ccb:
            java.lang.String r2 = r5.A08
            X.82m r1 = new X.82m
            r12 = r1
            r13 = r8
            r14 = r4
            r15 = r9
            r16 = r6
            r17 = r3
            r18 = r2
            r19 = r7
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r0.A0z = r1
            android.graphics.RectF r4 = r5.A01
        L_0x0ce2:
            if (r4 == 0) goto L_0x0cf8
            r1 = 0
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>(r1, r1, r1, r1)
            r1 = 0
            r0.A06 = r4
            r0.A07 = r3
            r0.A3r = r11
            r0.A3v = r10
            r0.A33 = r10
            r0.A04 = r1
        L_0x0cf8:
            X.80E r1 = X.AnonymousClass80E.ALL
            goto L_0x013b
        L_0x0cfc:
            r0.A0B = r2
            r0.A0O = r1
            X.AnonymousClass80D.A01(r7, r9, r0)
            X.AnonymousClass80D.A0A(r0)
            X.AnonymousClass80D.A0B(r0)
            r0.A3Q = r6
            r0.A1W = r10
            java.io.File r2 = r1.A02
            if (r2 == 0) goto L_0x00d5
            long r18 = java.lang.System.currentTimeMillis()
            goto L_0x0db5
        L_0x0d17:
            java.io.File r1 = r6.A04     // Catch:{ IOException -> 0x0e6b, SecurityException -> 0x0e68 }
            if (r1 == 0) goto L_0x0e62
            java.lang.String r10 = r1.getCanonicalPath()     // Catch:{ IOException -> 0x0e6b, SecurityException -> 0x0e68 }
            if (r10 == 0) goto L_0x00d5
            goto L_0x0dfe
        L_0x0d23:
            int r2 = r12.A00
            X.UKc r1 = new X.UKc
            r1.<init>()
            r1.A01 = r9
            r1.A02 = r8
            r1.A04 = r7
            r1.A05 = r6
            r1.A06 = r5
            r1.A03 = r4
            r1.A07 = r3
            r1.A00 = r2
            r0.A1k = r1
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r0.A28 = r1
            android.graphics.RectF r1 = r12.A01
            if (r1 == 0) goto L_0x00d5
            X.AnonymousClass80D.A04(r1, r0, r11, r10)
            return r0
        L_0x0d48:
            java.lang.String r2 = "No Template Id specified"
            goto L_0x0d53
        L_0x0d4b:
            java.lang.String r2 = "No media path specified"
            goto L_0x0d53
        L_0x0d4e:
            java.lang.String r2 = "ReelViewerSource is not specified"
            goto L_0x0d53
        L_0x0d51:
            java.lang.String r2 = "No static image specified"
        L_0x0d53:
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "ShareFragment"
            X.C14164Tr2.A01(r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
        L_0x0d62:
            android.content.Context r3 = r2.getContext()
            r2 = 2131975037(0x7f135b7d, float:1.9587155E38)
            r1 = 64
            java.lang.String r1 = X.002.A0D(r5, r1)
            java.lang.String r3 = X.DbY.A0c(r3, r1, r2)
            boolean r2 = r7.A04
            X.82e r1 = new X.82e
            r1.<init>(r5, r4, r3, r2)
            r0.A11 = r1
            return r0
        L_0x0d7d:
            r0.A0B = r1
            X.AnonymousClass80D.A03(r4, r5, r0)
            X.AnonymousClass80D.A0A(r0)
            r0.A1b = r6
            X.AnonymousClass80D.A0B(r0)
            return r0
        L_0x0d8b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0d90:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0d96:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0d9c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0da2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0da8:
            java.lang.String r4 = r7.A01
            r2 = 22
            X.N49 r1 = new X.N49
            r1.<init>(r5, r4, r2)
            r0.A0E = r1
            goto L_0x0f86
        L_0x0db5:
            java.lang.String r11 = r2.getCanonicalPath()     // Catch:{ IOException -> 0x0df0 }
            X.0qQ.A07(r11)     // Catch:{ IOException -> 0x0df0 }
            long r16 = X.AnonymousClass7TE.A0P(r18)     // Catch:{ IOException -> 0x0df0 }
            java.io.File r2 = r1.A02     // Catch:{ IOException -> 0x0df0 }
            android.net.Uri r10 = android.net.Uri.fromFile(r2)     // Catch:{ IOException -> 0x0df0 }
            com.instagram.common.gallery.Medium r4 = new com.instagram.common.gallery.Medium     // Catch:{ IOException -> 0x0df0 }
            r9 = r4
            r12 = r8
            r13 = r6
            r14 = r8
            r15 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r18)     // Catch:{ IOException -> 0x0df0 }
            r0.A3y = r6     // Catch:{ IOException -> 0x0df0 }
            android.content.Context r3 = r1.getContext()     // Catch:{ IOException -> 0x0df0 }
            if (r3 != 0) goto L_0x0dda
            r2 = 0
            goto L_0x0deb
        L_0x0dda:
            X.ADn r1 = new X.ADn     // Catch:{ IOException -> 0x0df0 }
            r1.<init>(r3)     // Catch:{ IOException -> 0x0df0 }
            X.802 r2 = r1.A01()     // Catch:{ IOException -> 0x0df0 }
            r2.A0E = r6     // Catch:{ IOException -> 0x0df0 }
            java.util.ArrayList r1 = X.AnonymousClass802.A01(r3)     // Catch:{ IOException -> 0x0df0 }
            r2.A0A = r1     // Catch:{ IOException -> 0x0df0 }
        L_0x0deb:
            r0.A0P = r4     // Catch:{ IOException -> 0x0df0 }
            r0.A0w = r2     // Catch:{ IOException -> 0x0df0 }
            return r0
        L_0x0df0:
            r3 = move-exception
            java.lang.String r2 = "reels_join_chat_share_fragment"
            java.lang.String r1 = "Unable to open file"
            X.0KC.A0F(r2, r1, r3)
            return r0
        L_0x0df9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0dfe:
            r7 = 1
            long r15 = X.AnonymousClass7TE.A0P(r17)
            java.io.File r1 = r6.A04
            if (r1 == 0) goto L_0x0e5c
            android.net.Uri r9 = android.net.Uri.fromFile(r1)
            com.instagram.common.gallery.Medium r5 = new com.instagram.common.gallery.Medium
            r8 = r5
            r11 = r3
            r12 = r7
            r13 = r3
            r14 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r17)
            X.80D r3 = new X.80D
            r3.<init>()
            X.B2s r1 = r6.A05
            X.AnonymousClass80D.A0D(r3, r1, r6)
            X.80I r8 = X.AnonymousClass80H.A02
            com.instagram.common.session.UserSession r1 = r6.A00
            X.0qQ.A06(r1)
            X.AnonymousClass80D.A09(r1, r8, r3, r6)
            r3.A09 = r2
            X.28D r1 = X.28D.A3G
            r3.A0B = r1
            r3.A0O = r6
            android.graphics.RectF r2 = r6.A00
            android.graphics.RectF r1 = r6.A01
            X.AnonymousClass80D.A02(r2, r1, r3)
            r3.A3y = r7
            r3.A3g = r7
            r3.A0P = r5
            r3.A0w = r0
            r3.A3Q = r7
            com.instagram.infocenter.intf.InfoCenterFactShareInfoIntf r0 = r6.A02
            if (r0 == 0) goto L_0x0e56
            r3.A1F = r0
            com.instagram.pendingmedia.model.recipients.PendingRecipient r0 = r6.A03
            if (r0 == 0) goto L_0x0e53
            r3.A1S = r0
            X.80E r0 = X.AnonymousClass80E.GROUP_PROFILE
        L_0x0e50:
            r3.A0y = r0
            return r3
        L_0x0e53:
            X.80E r0 = X.AnonymousClass80E.ALL
            goto L_0x0e50
        L_0x0e56:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x0e5c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x0e62:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0e6b, SecurityException -> 0x0e68 }
            r1.<init>(r4)     // Catch:{ IOException -> 0x0e6b, SecurityException -> 0x0e68 }
            throw r1     // Catch:{ IOException -> 0x0e6b, SecurityException -> 0x0e68 }
        L_0x0e68:
            r1 = 2257(0x8d1, float:3.163E-42)
            goto L_0x0e6d
        L_0x0e6b:
            r1 = 2256(0x8d0, float:3.161E-42)
        L_0x0e6d:
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.0wb.A03(r5, r1)
            return r0
        L_0x0e75:
            com.instagram.user.model.User r13 = r7.A02
            if (r13 == 0) goto L_0x0ead
            X.BGi r0 = r11.A00
            java.lang.String r12 = r0.A05
            java.lang.String r10 = r0.A06
            java.lang.String r9 = r0.A07
            java.lang.String r8 = r0.A08
            java.lang.String r6 = r0.A09
            java.lang.Long r5 = r0.A04
            java.lang.Boolean r14 = r0.A01
            java.lang.Boolean r15 = r0.A02
            java.lang.String r4 = r0.A0A
            java.lang.String r3 = r0.A0B
            java.lang.String r1 = r0.A0C
            java.lang.Boolean r0 = r0.A03
            r25 = r1
            r24 = r3
            r23 = r4
            r22 = r6
            r21 = r8
            r20 = r9
            r19 = r10
            r18 = r12
            r17 = r5
            r16 = r0
            X.BGi r0 = X.V8D.A00(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r11.A00 = r0
        L_0x0ead:
            android.content.Context r0 = r7.requireContext()
            int r1 = X.0nA.A09(r0)
            int r0 = X.0nA.A08(r0)
            float r3 = (float) r1
            float r1 = (float) r0
            r0 = 0
            android.graphics.RectF r6 = X.AnonymousClass7TF.A0C(r3, r1)
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>(r0, r0, r3, r1)
            X.80D r3 = new X.80D
            r3.<init>()
            X.B2s r0 = r7.A03
            X.AnonymousClass80D.A0D(r3, r0, r7)
            X.80I r4 = X.AnonymousClass80H.A02
            com.instagram.common.session.UserSession r0 = r7.A00
            X.0qQ.A06(r0)
            r1 = 1
            X.AnonymousClass80D.A09(r0, r4, r3, r7)
            r3.A09 = r2
            X.28D r0 = r7.A00
            X.AnonymousClass80D.A07(r0, r7, r3)
            X.AnonymousClass80D.A01(r6, r5, r3)
            X.AnonymousClass80D.A0A(r3)
            X.AnonymousClass80D.A0B(r3)
            X.WaO r0 = r7.A01
            r3.A1Y = r0
            r3.A3Q = r1
            return r3
        L_0x0ef1:
            X.Aem r0 = new X.Aem
            r0.<init>(r1, r3, r4)
        L_0x0ef6:
            X.80D r3 = new X.80D
            r3.<init>()
            X.B2s r1 = r9.A03
            X.AnonymousClass80D.A0D(r3, r1, r9)
            X.80I r5 = X.AnonymousClass80H.A02
            com.instagram.common.session.UserSession r1 = r9.A00
            X.0qQ.A07(r1)
            r4 = 1
            X.AnonymousClass80D.A09(r1, r5, r3, r9)
            r3.A09 = r2
            X.28D r1 = X.28D.A5J
            X.AnonymousClass80D.A07(r1, r9, r3)
            X.AnonymousClass80D.A01(r8, r6, r3)
            X.AnonymousClass80D.A0A(r3)
            r3.A3y = r4
            r3.A1Z = r0
            java.lang.String r1 = r9.A01
            if (r1 == 0) goto L_0x0f2f
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            com.instagram.common.gallery.Medium r1 = X.C282665Eg.A03(r0, r4, r7)
            r0 = 0
            r3.A0P = r1
            r3.A0w = r0
        L_0x0f2e:
            return r3
        L_0x0f2f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0f34:
            r7 = r1
            X.Uuz r7 = (X.C16443Uuz) r7
            r0 = 0
            android.content.Context r1 = X.DbT.A06(r7, r2, r0)
            int r0 = X.0nA.A09(r1)
            float r3 = (float) r0
            int r0 = X.0nA.A08(r1)
            float r1 = (float) r0
            r0 = 0
            android.graphics.RectF r6 = X.AnonymousClass7TF.A0C(r3, r1)
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>(r0, r0, r3, r1)
            X.80D r0 = new X.80D
            r0.<init>()
            X.WUP r1 = r7.A01
            X.AnonymousClass80D.A0C(r0, r1, r7)
            X.80I r4 = X.AnonymousClass80H.A02
            com.instagram.common.session.UserSession r1 = r7.A00
            X.0qQ.A06(r1)
            r3 = 1
            X.AnonymousClass80D.A09(r1, r4, r0, r7)
            r0.A09 = r2
            X.28D r1 = r7.A00
            X.AnonymousClass80D.A07(r1, r7, r0)
            X.AnonymousClass80D.A02(r6, r5, r0)
            X.80E r1 = X.AnonymousClass80E.CLOSE_FRIENDS_ENABLED_ONLY
            r0.A0y = r1
            r0.A3g = r3
            X.AnonymousClass80D.A0B(r0)
            goto L_0x0f86
        L_0x0f79:
            r9 = 0
            com.instagram.reels.question.model.QuestionResponseReshareModel r5 = new com.instagram.reels.question.model.QuestionResponseReshareModel
            r10 = r9
            r17 = r4
            r16 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0.A1i = r5
        L_0x0f86:
            r0.A3Q = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15291UZw.A02(android.view.ViewGroup):X.80D");
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public final boolean onBackPressed() {
        AnonymousClass80Q r0 = this.A01;
        if (r0 == null || !r0.A06()) {
            return false;
        }
        return true;
    }

    public void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1227348933);
        C15291UZw.super.onCreate(bundle);
        this.A00 = DbX.A0U(this);
        AnonymousClass0fD.A09(-1964628446, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1874856727);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.fragment_quick_capture);
        AnonymousClass0fD.A09(-1336188649, A022);
        return A0C;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-487491723);
        super.onDestroyView();
        AnonymousClass80Q r0 = this.A01;
        if (r0 != null) {
            r0.A00();
        }
        this.A01 = null;
        unregisterLifecycleListener(this.A02);
        this.A02.onDestroyView();
        this.A02 = null;
        AnonymousClass0fD.A09(-1138242650, A022);
    }

    public void onResume() {
        int A022 = AnonymousClass0fD.A02(-416629163);
        super.onResume();
        C357628Yy.A00(getRootActivity());
        AnonymousClass0fD.A09(526918836, A022);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AnonymousClass80C r0 = new AnonymousClass80C();
        this.A02 = r0;
        registerLifecycleListener(r0);
        AnonymousClass80D A022 = A02(DbU.A0C(view, R.id.quick_capture_fragment_container));
        if (A022 != null) {
            C360908fL.A00(A022.A0B);
            C20264Wo3 wo3 = new C20264Wo3(A022, this);
            C226112fe.A0B.A05(requireActivity(), wo3);
        }
    }
}
