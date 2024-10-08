package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.Html;
import android.text.Spanned;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.blur.BlurUtil;

public final class KHA extends 2Cl {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public KHA(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj3;
        this.A03 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x028b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x028c, code lost:
        X.0wb.A06("ConfidenceFrameworkHelper", "confidence_framework_challenge_response_failed", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0293, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0261, code lost:
        if (r1.A02 == false) goto L_0x0263;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x028b A[ExcHandler: 6GV | RemoteException | IllegalStateException | SecurityException (r2v2 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:20:0x0063] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0228  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r31 = this;
            r6 = r31
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x001d;
                case 1: goto L_0x009f;
                case 2: goto L_0x00df;
                case 3: goto L_0x0062;
                case 4: goto L_0x0252;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r3 = r6.A02
            X.0lg r3 = (X.0lg) r3
            java.lang.Object r1 = r6.A03
            android.accounts.AccountManager r1 = (android.accounts.AccountManager) r1
            java.lang.Object r0 = r6.A01
            android.accounts.Account r0 = (android.accounts.Account) r0
            java.lang.String r4 = "email"
            r2 = 0
            r5 = 0
            r6 = r5
            java.lang.String r5 = X.FH1.A00(r0, r1, r2, r3, r4, r5, r6)
        L_0x001c:
            return r5
        L_0x001d:
            java.lang.Object r3 = r6.A03
            X.LOx r3 = (X.C64126LOx) r3
            java.lang.String r2 = X.C64126LOx.A00(r3)
            java.lang.Object r1 = r6.A01
            X.16l r1 = (X.AnonymousClass16l) r1
            if (r1 != 0) goto L_0x0037
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = r3.A05
            X.4Cl r0 = X.DbS.A0h(r0, r1)
            X.16l r1 = r0.BVO()
        L_0x0037:
            if (r2 == 0) goto L_0x004a
            int r0 = r2.length()
            if (r0 == 0) goto L_0x004a
            android.content.Context r0 = r3.A03
            int r0 = X.AnonymousClass0nB.A01(r0)
            android.graphics.Bitmap r5 = X.1MF.A0E(r2, r0, r0)
            return r5
        L_0x004a:
            r5 = 0
            if (r1 == 0) goto L_0x001c
            com.instagram.common.typedurl.ImageUrl r1 = r1.Aen()
            if (r1 == 0) goto L_0x001c
            boolean r0 = X.C253833rU.A02(r1)
            if (r0 != 0) goto L_0x001c
            X.1NK r0 = X.1NK.A00()
            android.graphics.Bitmap r5 = r0.A0H(r1, r5)
            return r5
        L_0x0062:
            r5 = 0
            java.lang.Object r1 = r6.A01     // Catch:{ 6GV | RemoteException | IllegalStateException | SecurityException -> 0x028b }
            X.LAY r1 = (X.LAY) r1     // Catch:{ 6GV | RemoteException | IllegalStateException | SecurityException -> 0x028b }
            X.S6k r0 = X.LAY.A07     // Catch:{ 6GV | RemoteException | IllegalStateException | SecurityException -> 0x028b }
            X.LQW r4 = r1.A06     // Catch:{ 6GV | RemoteException | IllegalStateException | SecurityException -> 0x028b }
            java.lang.Object r3 = r6.A02     // Catch:{ 6GV | RemoteException | IllegalStateException | SecurityException -> 0x028b }
            X.KzR r3 = (X.C63578KzR) r3     // Catch:{ 6GV | RemoteException | IllegalStateException | SecurityException -> 0x028b }
            android.os.Bundle r2 = r3.A00     // Catch:{ 6GV | RemoteException | IllegalStateException | SecurityException -> 0x028b }
            java.lang.Class r1 = X.LSS.A00(r2)     // Catch:{ 6GV | RemoteException | IllegalStateException | SecurityException -> 0x028b }
            java.lang.String r0 = "useDebugKey"
            X.LSS.A02(r2, r1, r0)     // Catch:{ 6GV | RemoteException | IllegalStateException | SecurityException -> 0x028b }
            java.lang.String r0 = "allowMultiSession"
            X.LSS.A02(r2, r1, r0)     // Catch:{ 6GV | RemoteException | IllegalStateException | SecurityException -> 0x028b }
            android.os.Bundle r0 = X.AnonymousClass7TE.A0a()     // Catch:{ 6GV | RemoteException | IllegalStateException | SecurityException -> 0x028b }
            r3.A00 = r0     // Catch:{ 6GV | RemoteException | IllegalStateException | SecurityException -> 0x028b }
            android.os.Bundle r0 = X.LQW.A00(r2, r4)     // Catch:{ Exception -> 0x0283, 6GV | RemoteException | IllegalStateException | SecurityException -> 0x028b, 6GV | RemoteException | IllegalStateException | SecurityException -> 0x028b, 6GV | RemoteException | IllegalStateException | SecurityException -> 0x028b }
            if (r0 != 0) goto L_0x008c
            goto L_0x0099
        L_0x008c:
            android.os.Bundle r3 = r0.deepCopy()     // Catch:{ Exception -> 0x0283, 6GV | RemoteException | IllegalStateException | SecurityException -> 0x028b, 6GV | RemoteException | IllegalStateException | SecurityException -> 0x028b, 6GV | RemoteException | IllegalStateException | SecurityException -> 0x028b }
            if (r3 == 0) goto L_0x027c
            java.lang.String r0 = "response"
            X.LSS.A04(r0, r3)     // Catch:{ Exception -> 0x0283, 6GV | RemoteException | IllegalStateException | SecurityException -> 0x028b, 6GV | RemoteException | IllegalStateException | SecurityException -> 0x028b, 6GV | RemoteException | IllegalStateException | SecurityException -> 0x028b }
            r0 = 1
            goto L_0x009b
        L_0x0099:
            r3 = 0
            r0 = 0
        L_0x009b:
            if (r0 == 0) goto L_0x001c
            goto L_0x0269
        L_0x009f:
            java.lang.Object r3 = r6.A01
            X.LOV r3 = (X.LOV) r3
            java.lang.String r2 = X.LOV.A00(r3)
            java.lang.Object r1 = r6.A02
            X.16l r1 = (X.AnonymousClass16l) r1
            if (r1 != 0) goto L_0x00b7
            com.instagram.common.session.UserSession r0 = r3.A03
            X.4Cl r0 = X.DbV.A0k(r0)
            X.16l r1 = r0.BVO()
        L_0x00b7:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x00c8
            android.content.Context r0 = r3.A01
            int r0 = X.0nA.A09(r0)
            android.graphics.Bitmap r5 = X.1MF.A0E(r2, r0, r0)
            return r5
        L_0x00c8:
            if (r1 == 0) goto L_0x00dd
            com.instagram.common.typedurl.ImageUrl r1 = r1.Bs6()
            boolean r0 = X.C253833rU.A02(r1)
            if (r0 != 0) goto L_0x00dd
            X.1NK r0 = X.1NK.A00()
            android.graphics.Bitmap r5 = r0.A0G(r1)
            return r5
        L_0x00dd:
            r5 = 0
            return r5
        L_0x00df:
            java.lang.Object r0 = r6.A03
            X.LO6 r0 = (X.LO6) r0
            android.content.Context r2 = r0.A02
            com.instagram.common.session.UserSession r1 = r0.A03
            java.lang.Object r0 = r6.A02
            X.5kq r0 = (X.C293505kq) r0
            java.util.List r9 = r0.A0v
            com.google.common.collect.ImmutableList r10 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r9)
            X.0qQ.A0A(r10)
            r7 = 0
            X.831 r4 = new X.831
            r4.<init>(r9, r7)
            X.2Nn r3 = X.AnonymousClass830.A00(r2, r1)
            X.7zv r4 = X.C39812AAj.A01(r4, r3)
            com.instagram.music.common.model.AudioOverlayTrack r8 = r0.A0N
            java.util.List r5 = r0.A0p
            java.lang.String r3 = r0.A0c
            r6 = 0
            r11 = r6
            r12 = r6
            r13 = r1
            r14 = r8
            r15 = r4
            r16 = r6
            r17 = r6
            r18 = r3
            r19 = r5
            r20 = r10
            r21 = r7
            X.AEK.A02(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            int r11 = r4.A0K
            int r8 = r4.A08
            X.50r r5 = r0.A0H
            X.50r r3 = X.C2801950r.FEED_POST
            if (r5 != r3) goto L_0x013b
            X.8vh r3 = r0.A0C
            if (r3 == 0) goto L_0x0233
            X.8pV r3 = r3.A01
            if (r3 == 0) goto L_0x0233
            X.8PW r3 = r3.A05
        L_0x0131:
            android.graphics.Point r3 = X.AEJ.A00(r1, r6, r3, r4)
            if (r3 == 0) goto L_0x013b
            int r11 = r3.x
            int r8 = r3.y
        L_0x013b:
            com.instagram.pendingmedia.model.ClipInfo r15 = X.AnonymousClass9T4.A00(r1, r4, r6, r11, r8)
            java.lang.String r8 = r0.A0W
            if (r8 == 0) goto L_0x022f
            X.28D r5 = X.28D.valueOf(r8)
            boolean r3 = X.C367268qT.A00(r5)
            if (r3 != 0) goto L_0x0151
            X.28D r3 = X.28D.A2d
            if (r5 != r3) goto L_0x022f
        L_0x0151:
            X.28D r11 = X.28D.valueOf(r8)
        L_0x0155:
            r14 = r6
            r16 = r4
            r18 = r6
            r19 = r7
            X.3Q2 r5 = X.C59797JYq.A01(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.0qQ.A07(r5)
            X.8vh r8 = r0.A0C
            if (r8 == 0) goto L_0x01ae
            X.8pV r12 = r8.A01
            if (r12 == 0) goto L_0x01ae
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r3 = r12.A06
            r20 = r3
            boolean r29 = X.AnonymousClass7TF.A1V(r20)
            X.8PW r11 = r12.A05
            if (r11 == 0) goto L_0x0228
            X.3QG r3 = r12.A08
            if (r3 == 0) goto L_0x0228
            boolean r13 = r12.A0C
            r17 = r13
            boolean r13 = r12.A0B
            r16 = r13
            com.instagram.camera.effect.models.CameraAREffect r15 = r12.A00
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r13 = r12.A01
            X.3QS r12 = r12.A07
            boolean r14 = r4.A18
            java.lang.Integer r25 = X.C51967G9n.A0l(r14)
            java.lang.Integer r26 = X.AnonymousClass05K.A1I
            java.lang.String r4 = r4.A0k
            android.location.Location r14 = X.LI4.A00(r2, r4)
            r22 = r6
            r23 = r5
            r24 = r3
            r27 = r17
            r28 = r16
            r30 = r7
            r19 = r11
            r21 = r12
            r16 = r1
            r17 = r13
            X.C59797JYq.A08(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
        L_0x01ae:
            com.instagram.pendingmedia.model.constants.ShareType r3 = com.instagram.pendingmedia.model.constants.ShareType.CLIPS
            r5.A0e(r3)
            r11 = 1
            r5.A5S = r11
            X.9P8 r13 = r0.A0E
            if (r13 == 0) goto L_0x01df
            java.lang.String r3 = r13.A09
            java.lang.String r18 = X.AnonymousClass3VO.A02(r3)
            long r3 = r13.A02
            int r12 = (int) r3
            java.lang.Boolean r14 = r13.A00
            X.8JI r4 = r13.A06
            X.8J0 r3 = new X.8J0
            r15 = r3
            r16 = r4
            r17 = r14
            r19 = r12
            r20 = r7
            r21 = r7
            r15.<init>(r16, r17, r18, r19, r20, r21)
            r5.A12 = r3
            java.util.List r3 = r13.A01
            if (r3 == 0) goto L_0x0220
            r5.A4a = r3
        L_0x01df:
            java.lang.String r3 = r0.A0h
            r5.A3I = r3
            long r3 = X.AnonymousClass7TG.A0I()
            r5.A0e = r3
            X.51W r4 = r5.A1P
            if (r4 != 0) goto L_0x01fb
            if (r8 == 0) goto L_0x021e
            X.8pV r3 = r8.A01
            if (r3 == 0) goto L_0x021e
            X.3QS r4 = r3.A07
        L_0x01f5:
            java.util.List r3 = r0.A0j
            X.51W r4 = X.C39563A0f.A00(r4, r9, r3, r6)
        L_0x01fb:
            X.0qQ.A0B(r4, r7)
            X.0qQ.A0B(r10, r11)
            java.util.ArrayList r8 = X.AnonymousClass7TG.A0r(r10)
            java.util.Iterator r7 = r10.iterator()
        L_0x0209:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x0236
            java.lang.Object r6 = r7.next()
            X.51N r6 = (X.AnonymousClass51N) r6
            X.9IE r3 = new X.9IE
            r3.<init>((X.AnonymousClass51N) r6)
            r8.add(r3)
            goto L_0x0209
        L_0x021e:
            r4 = r6
            goto L_0x01f5
        L_0x0220:
            java.lang.String r4 = "ClipsDraftPendingMediaHelper"
            java.lang.String r3 = "Remix image regions are empty for recovered draft."
            X.0wb.A03(r4, r3)
            goto L_0x01df
        L_0x0228:
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r3 = r12.A01
            if (r3 == 0) goto L_0x01ae
            r5.A16 = r3
            goto L_0x01ae
        L_0x022f:
            X.28D r11 = X.28D.A0z
            goto L_0x0155
        L_0x0233:
            r3 = r6
            goto L_0x0131
        L_0x0236:
            com.google.common.collect.ImmutableList r10 = X.DbU.A0K(r8)
            X.51I r8 = r4.A01
            X.3QS r9 = r4.A02
            X.9IV r7 = r4.A00
            java.util.List r3 = r4.A03
            X.51W r6 = new X.51W
            r11 = r3
            r6.<init>(r7, r8, r9, r10, r11)
            r5.A1P = r6
            X.2Nn r3 = X.AnonymousClass830.A00(r2, r1)
            X.C63174Ksh.A00(r2, r1, r0, r5, r3)
            return r5
        L_0x0252:
            java.lang.Object r0 = r6.A01
            android.content.Context r0 = (android.content.Context) r0
            X.S1k r1 = X.C9272RVx.A00(r0)
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x0263
            boolean r1 = r1.A02
            r0 = 1
            if (r1 != 0) goto L_0x0264
        L_0x0263:
            r0 = 0
        L_0x0264:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L_0x0269:
            X.S6k r2 = X.LAY.A07     // Catch:{ 6GV | RemoteException | IllegalStateException | SecurityException -> 0x028b }
            java.lang.String r1 = "response"
            boolean r0 = r3.containsKey(r1)     // Catch:{ 6GV | RemoteException | IllegalStateException | SecurityException -> 0x028b }
            if (r0 == 0) goto L_0x0285
            byte[] r0 = r3.getByteArray(r1)     // Catch:{ 6GV | RemoteException | IllegalStateException | SecurityException -> 0x028b }
            java.lang.String r5 = r2.A02(r0)     // Catch:{ 6GV | RemoteException | IllegalStateException | SecurityException -> 0x028b }
            return r5
        L_0x027c:
            java.lang.String r0 = "Bundle is null"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ Exception -> 0x0283, 6GV | RemoteException | IllegalStateException | SecurityException -> 0x028b, 6GV | RemoteException | IllegalStateException | SecurityException -> 0x028b, 6GV | RemoteException | IllegalStateException | SecurityException -> 0x028b }
            throw r0     // Catch:{ Exception -> 0x0283, 6GV | RemoteException | IllegalStateException | SecurityException -> 0x028b, 6GV | RemoteException | IllegalStateException | SecurityException -> 0x028b, 6GV | RemoteException | IllegalStateException | SecurityException -> 0x028b }
        L_0x0283:
            r0 = move-exception
            goto L_0x028a
        L_0x0285:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ 6GV | RemoteException | IllegalStateException | SecurityException -> 0x028b }
            r0.<init>()     // Catch:{ 6GV | RemoteException | IllegalStateException | SecurityException -> 0x028b }
        L_0x028a:
            throw r0     // Catch:{ 6GV | RemoteException | IllegalStateException | SecurityException -> 0x028b }
        L_0x028b:
            r2 = move-exception
            java.lang.String r1 = "ConfidenceFrameworkHelper"
            java.lang.String r0 = "confidence_framework_challenge_response_failed"
            X.0wb.A06(r1, r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KHA.call():java.lang.Object");
    }

    public final int getRunnableId() {
        switch (this.A00) {
            case 2:
                return 662;
            case 3:
                return 178336291;
            case 4:
                return 439;
            case 5:
                return 252;
            default:
                return 508;
        }
    }

    public final void onFail(Exception exc) {
        switch (this.A00) {
            case 2:
                0qQ.A0B(exc, 0);
                String A002 = AnonymousClass000.A00(147);
                0wb.A06("ClipsDraftPendingMediaHelper", A002, exc);
                ((C66483MTm) this.A01).D6p(A002);
                return;
            case 4:
                0wb.A07("Could not determine TOS display status", exc);
                return;
            default:
                KHA.super.onFail(exc);
                return;
        }
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        boolean z;
        1NY A0a;
        switch (this.A00) {
            case 0:
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    C64126LOx lOx = (C64126LOx) this.A03;
                    lOx.A00 = bitmap;
                    lOx.A01 = BlurUtil.blur(bitmap, 0.3f, 25);
                    KB6 kb6 = (KB6) this.A02;
                    lOx.A02(kb6);
                    if (kb6.A0N.isResumed() && kb6.A03 == C62590KiN.A09) {
                        KB6.A07(kb6);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                Bitmap bitmap2 = (Bitmap) obj;
                if (bitmap2 != null) {
                    ((LOV) this.A01).A00 = bitmap2;
                    KB6 kb62 = (KB6) this.A03;
                    if (kb62.A0N.isResumed() && kb62.A03 == C62590KiN.A0A) {
                        KB6.A03(kb62);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                AnonymousClass3Q2 r10 = (AnonymousClass3Q2) obj;
                0qQ.A0B(r10, 0);
                ((C66483MTm) this.A01).D6q(r10);
                return;
            case 3:
                String str = (String) obj;
                if (str != null) {
                    C11032S6k s6k = LAY.A07;
                    Context context = ((LAY) this.A01).A01;
                    UserSession userSession = (UserSession) this.A03;
                    z = true;
                    0qQ.A0B(userSession, 1);
                    A0a = AnonymousClass7TG.A0a(userSession);
                    A0a.A0A("accounts/try_verify_challenge_response_and_log_result/");
                    boolean A1Y = JTT.A1Y(context, A0a, userSession, "auth_response", str);
                    A0a.A0O(0aS.A00, K0n.class, LHA.class, A1Y);
                    break;
                } else {
                    return;
                }
            case 4:
                if (AnonymousClass7TE.A1a(obj)) {
                    Activity activity = (Activity) this.A01;
                    Object obj2 = this.A03;
                    Object obj3 = this.A02;
                    String string = activity.getString(2131967949, new Object[]{DbW.A0h(activity, activity.getString(2131964588), 2131967948), DbW.A0h(activity, activity.getString(2131969754), 2131967947), DbW.A0h(activity, activity.getString(2131967951), 2131967946)});
                    C358248ab A0X = DbS.A0X(activity);
                    A0X.A09(2131975497);
                    if (string == null) {
                        string = "";
                    }
                    Spanned fromHtml = Html.fromHtml(string);
                    0qQ.A07(fromHtml);
                    A0X.A0q(fromHtml);
                    A0X.A0r(false);
                    A0X.A0I(new C50026FJl(29, (Object) activity, obj3, obj2), 2131967950);
                    Dialog A022 = A0X.A02();
                    A022.setOnKeyListener(new SVJ(activity, 2));
                    AnonymousClass0fN.A00(A022);
                    return;
                }
                return;
            default:
                String str2 = (String) obj;
                if (str2 == null || str2.length() == 0) {
                    FH1.A04((AnonymousClass0iw) null, (0lg) this.A02, "email", AnonymousClass000.A00(1300), 0.0d, 0.0d);
                    return;
                }
                1xC.A01.A00(new C50257FVo(str2));
                0lg r3 = (0lg) this.A02;
                if (AnonymousClass0BO.A00(r3).BNv() > 0) {
                    0xI A04 = 1Q0.A0T.A02(r3).A04();
                    A04.A0C("flow", "email");
                    DbU.A1R(A04, r3);
                    A0a = AnonymousClass7TG.A0a(r3);
                    A0a.A0A("accounts/confirm_email_with_open_id_token/");
                    DbX.A1M(A0a, AnonymousClass000.A00(3277), str2);
                    z = true;
                    break;
                } else {
                    return;
                }
                break;
        }
        1ES.A03(DbT.A0U(A0a, z));
    }
}
