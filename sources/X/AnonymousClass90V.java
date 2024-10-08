package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.io.File;

/* renamed from: X.90V  reason: invalid class name */
public final class AnonymousClass90V {
    public static final AnonymousClass90V A00 = new Object();

    public static final void A02(AnonymousClass72O r5, UserSession userSession) {
        0qQ.A0B(r5, 1);
        AnonymousClass19S A02 = 19E.A02(AnonymousClass12T.A00.AOJ(1566600651, 3));
        AnonymousClass9K1 r2 = new AnonymousClass9K1((Object) r5, (Object) userSession, (AnonymousClass4D7) null, 37);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, A02);
    }

    public static final void A03(AnonymousClass72O r9, UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        AnonymousClass19S A02 = 19E.A02(AnonymousClass12T.A00.AOJ(1566600651, 3));
        AnonymousClass9KZ r3 = new AnonymousClass9KZ(userSession, r9, str, (AnonymousClass4D7) null, 9);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r3, A02);
    }

    public static final void A04(1P0 r5, UserSession userSession, String str, String str2, String str3, long j) {
        1NY r3 = new 1NY(userSession, -2);
        r3.A08(AnonymousClass05K.A01);
        r3.A0A("clips/draft_reminder/");
        r3.A9m("draft_id", str);
        Uri fromFile = Uri.fromFile(new File(str2));
        0qQ.A07(fromFile);
        r3.A9m("thumbnail_uri", C253833rU.A00(fromFile, -1, -1).getUrl());
        r3.A0D("modification_timestamp", j);
        r3.A0G("draft_type", str3);
        r3.A0O((15p) null, 1XP.class, 1XY.class, false);
        1OC A0M = r3.A0M();
        A0M.A00 = r5;
        1ES.A03(A0M);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: X.8aU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: X.8aU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: X.8ZN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: com.instagram.reels.prompt.model.PromptStickerModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v1, resolved type: com.instagram.pendingmedia.model.recipients.PendingRecipient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: X.8aU} */
    /* JADX WARNING: type inference failed for: r13v0, types: [X.3sy] */
    /* JADX WARNING: type inference failed for: r21v0, types: [java.util.List] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.app.Activity r26, androidx.fragment.app.Fragment r27, X.28D r28, com.instagram.common.session.UserSession r29, java.lang.String r30, java.lang.String r31) {
        /*
            r3 = r29
            r0 = r26
            X.27r r6 = X.27p.A01(r3)
            r24 = r27
            if (r27 == 0) goto L_0x00a1
            androidx.fragment.app.FragmentActivity r5 = r24.requireActivity()
            androidx.fragment.app.FragmentActivity r4 = r24.requireActivity()
            r2 = 0
            r8 = 0
            X.80c r1 = new X.80c
            r1.<init>(r4, r3, r2, r2)
        L_0x001b:
            X.2YN r4 = new X.2YN
            r4.<init>(r1, r5)
            java.lang.Class<X.8Yz> r1 = X.C357638Yz.class
            X.2YL r11 = r4.A00(r1)
            X.8Yz r11 = (X.C357638Yz) r11
            r7 = r28
            if (r11 == 0) goto L_0x0031
            X.80N r1 = X.AnonymousClass80N.A00
            r11.A0D(r7, r1)
        L_0x0031:
            if (r27 == 0) goto L_0x009a
            android.content.Context r1 = r24.requireContext()
        L_0x0037:
            X.0qQ.A07(r1)
            int r22 = X.AnonymousClass4x3.A00(r1)
            X.JVj r9 = X.C59725JVj.PRE_CAPTURE
            r23 = -1
            X.50r r12 = X.C2801950r.FEED_POST
            r10 = r8
            r13 = r8
            r14 = r8
            r15 = r8
            r16 = r8
            r17 = r8
            r18 = r8
            r19 = r8
            r20 = r8
            r21 = r8
            r6.A16(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            X.27r r1 = X.27p.A01(r3)
            r5 = r30
            r1.A1p(r5)
            r6.A0S()
            X.AYm r4 = X.C394779yg.A00(r3)
            X.9s5 r1 = X.C390939s5.EDITED_SAVED_DRAFT
            r4.A01(r1)
            X.8A2 r4 = X.AnonymousClass8A1.A01(r3)
            X.27r r1 = X.27p.A01(r3)
            X.283 r1 = r1.A04
            java.lang.String r1 = r1.A0L
            if (r1 != 0) goto L_0x007c
            java.lang.String r1 = ""
        L_0x007c:
            r4.A0G(r1)
            if (r27 == 0) goto L_0x0097
            androidx.fragment.app.FragmentActivity r0 = r24.requireActivity()
        L_0x0085:
            r30 = 1
            r28 = r31
            r26 = r8
            r29 = r2
            r23 = r0
            r25 = r3
            r27 = r5
            X.C243473Yx.A04(r23, r24, r25, r26, r27, r28, r29, r30)
        L_0x0096:
            return
        L_0x0097:
            if (r26 != 0) goto L_0x0085
            return
        L_0x009a:
            if (r26 == 0) goto L_0x0096
            android.content.Context r1 = r0.getBaseContext()
            goto L_0x0037
        L_0x00a1:
            if (r26 == 0) goto L_0x0096
            r5 = r0
            X.07g r5 = (X.AnonymousClass07g) r5
            r2 = 0
            r8 = 0
            X.80c r1 = new X.80c
            r1.<init>(r0, r3, r2, r2)
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass90V.A00(android.app.Activity, androidx.fragment.app.Fragment, X.28D, com.instagram.common.session.UserSession, java.lang.String, java.lang.String):void");
    }

    public static final void A01(Fragment fragment) {
        if (fragment != null && fragment.getActivity() != null) {
            C358248ab r2 = new C358248ab((Activity) fragment.requireActivity());
            r2.A08(2131961033);
            r2.A09(2131954752);
            r2.A0H((DialogInterface.OnClickListener) null, 2131961029);
            AnonymousClass0fN.A00(r2.A02());
        }
    }

    public static final boolean A05(Fragment fragment) {
        if (fragment.getActivity() == null || fragment.getContext() == null || fragment.requireActivity().isFinishing() || fragment.requireActivity().isDestroyed() || fragment.mView == null || !fragment.isAdded() || fragment.mDetached || fragment.mRemoving || fragment.mViewLifecycleOwnerLiveData.A02() == null) {
            return false;
        }
        return true;
    }
}
