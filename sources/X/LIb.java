package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.creation.activity.MediaCaptureActivity;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.PhotoSession;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;

public abstract class LIb {
    /* JADX WARNING: type inference failed for: r21v1, types: [X.4mk] */
    /* JADX WARNING: type inference failed for: r11v8, types: [X.LkF] */
    /* JADX WARNING: type inference failed for: r22v2, types: [X.LkG] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.content.Context r29, com.instagram.common.session.UserSession r30, X.C3499582p r31, X.C273514mi r32, boolean r33) {
        /*
            r3 = 0
            r0 = r31
            X.0qQ.A0B(r0, r3)
            r7 = 1
            r10 = r29
            r9 = r30
            r8 = r32
            X.AnonymousClass7TG.A0w(r7, r8, r10, r9)
            X.F3s r2 = X.C49061Eof.A00(r9)
            X.EWT r1 = X.EWT.EDIT_PROFILE_PIC_FLOW
            java.lang.Integer r0 = X.AnonymousClass05K.A1F
            r2.A00(r1, r0)
            X.82q r6 = r31.A00()
            r30 = r33
            if (r33 == 0) goto L_0x0036
            boolean r0 = r6.COf()
            if (r0 == 0) goto L_0x0036
            X.6SR r1 = X.AnonymousClass6SR.A01()
            java.lang.String r0 = "edit_carousel"
            r1.A07(r9, r0, r3)
            X.C59888JbD.A00(r9)
        L_0x0035:
            return
        L_0x0036:
            X.6SR r1 = X.AnonymousClass6SR.A01()
            java.lang.String r0 = "share_screen"
            r1.A07(r9, r0, r3)
            r0 = r6
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r5 = r0.A01
            com.instagram.model.creation.MediaCaptureConfig r0 = r5.A09
            if (r0 == 0) goto L_0x013c
            boolean r0 = r0.A0C
            if (r0 != r7) goto L_0x013c
            X.KgB r1 = X.C62461KgB.UPLOAD
            X.KgB r0 = X.C62461KgB.GALLERY
            X.KgB[] r4 = new X.C62461KgB[]{r1, r0}
        L_0x0054:
            java.util.List r0 = r5.A05()
            X.0qQ.A07(r0)
            int r0 = r0.size()
            java.util.concurrent.atomic.AtomicInteger r3 = new java.util.concurrent.atomic.AtomicInteger
            r3.<init>(r0)
            java.util.List r0 = r5.A05()
            X.0qQ.A07(r0)
            java.util.Iterator r17 = r0.iterator()
        L_0x006f:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0035
            java.lang.Object r2 = r17.next()
            com.instagram.creation.base.PhotoSession r2 = (com.instagram.creation.base.PhotoSession) r2
            com.instagram.creation.base.PhotoSession r0 = r5.A02()
            if (r0 != 0) goto L_0x012d
            X.0Tu r11 = X.0Tu.A05
            r0 = 36315683656764901(0x8104ec00230de5, double:3.029522803834295E-306)
            boolean r0 = X.182.A06(r11, r9, r0)
            if (r0 == 0) goto L_0x012d
            java.lang.String r1 = r2.A0B
            X.36W r0 = r5.A0A
            r0.getClass()
            java.lang.String r28 = r6.E2M()
            X.LkG r21 = new X.LkG
            r22 = r21
            r23 = r10
            r24 = r9
            r25 = r2
            r26 = r0
            r27 = r1
            r29 = r3
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30)
        L_0x00ac:
            X.82q r24 = r31.A00()
            r12 = r8
            com.instagram.creation.activity.MediaCaptureActivity r12 = (com.instagram.creation.activity.MediaCaptureActivity) r12
            X.JWG r11 = r12.A07
            java.lang.String r16 = "Required value was null."
            if (r11 == 0) goto L_0x0149
            com.instagram.model.creation.MediaCaptureConfig r0 = r5.A09
            r18 = r0
            int r15 = r5.A02
            r14 = r10
            X.4cI r14 = (X.C267834cI) r14
            r13 = r10
            X.4cN r13 = (X.C267884cN) r13
            r1 = 0
            X.LoQ r0 = new X.LoQ
            r25 = r13
            r26 = r18
            r27 = r14
            r28 = r1
            r29 = r15
            r19 = r10
            r20 = r9
            r22 = r2
            r23 = r11
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.StringBuilder r13 = X.AnonymousClass7TE.A1A()
            java.lang.String r11 = "saveAndFinish(): requesting final render now. pendingMediaKey= "
            r13.append(r11)
            java.lang.String r11 = r2.A0A
            r13.append(r11)
            java.lang.String r11 = " filePath= "
            r13.append(r11)
            r13.append(r6)
            java.lang.String r11 = ".photoFilePath()"
            java.lang.String r13 = X.AnonymousClass7TF.A0l(r11, r13)
            java.lang.String r11 = "MediaSaveHelper"
            X.0KC.A0C(r11, r13)
            X.LRo r13 = X.C59953JcJ.A00(r9)
            monitor-enter(r13)
            monitor-exit(r13)
            java.lang.String r13 = r6.E2g()
            X.8m7 r13 = r8.Blh(r13)
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r14 = r2.A07
            int r2 = r4.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r4, r2)
            X.KgB[] r2 = (X.C62461KgB[]) r2
            boolean r0 = r13.Cmo(r0, r14, r2, r7)
            if (r0 == 0) goto L_0x006f
            java.lang.String r0 = "saveAndFinish(): request render was successful. Show the dialog while we wait for the request to finish."
            X.0KC.A0C(r11, r0)
            X.JWG r2 = r12.A07
            if (r2 == 0) goto L_0x0144
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r2.A0A(r1, r0)
            goto L_0x006f
        L_0x012d:
            X.LkF r21 = new X.LkF
            r11 = r21
            r12 = r10
            r13 = r9
            r14 = r6
            r15 = r3
            r16 = r30
            r11.<init>(r12, r13, r14, r15, r16)
            goto L_0x00ac
        L_0x013c:
            X.KgB r0 = X.C62461KgB.UPLOAD
            X.KgB[] r4 = new X.C62461KgB[]{r0}
            goto L_0x0054
        L_0x0144:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x0149:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LIb.A00(android.content.Context, com.instagram.common.session.UserSession, X.82p, X.4mi, boolean):void");
    }

    public static final boolean A01(Context context, UserSession userSession, PhotoSession photoSession, C3499682q r15, C273514mi r16, CountDownLatch countDownLatch, boolean z) {
        C273514mi r3 = r16;
        0qQ.A0B(r3, 1);
        Context context2 = context;
        UserSession userSession2 = userSession;
        PhotoSession photoSession2 = photoSession;
        C51974G9v.A1M(photoSession, context, userSession);
        C62461KgB[] kgBArr = {C62461KgB.GALLERY};
        C64917LkH lkH = C64917LkH.A00;
        MediaCaptureActivity mediaCaptureActivity = (MediaCaptureActivity) r3;
        JWG jwg = mediaCaptureActivity.A07;
        if (jwg != null) {
            C3499682q r12 = r15;
            CreationSession creationSession = ((JWE) r12).A01;
            boolean Cmo = r3.Blh(photoSession2.A0B).Cmo(new C65161LoQ(context2, userSession2, lkH, photoSession2, jwg, r12, (C267884cN) context2, creationSession.A09, (C267834cI) context2, countDownLatch, creationSession.A02), photoSession2.A07, (C62461KgB[]) Arrays.copyOf(kgBArr, 1), true);
            if (Cmo && z) {
                0KC.A0C("MediaSaveHelper", "saveToGallery(): request render was successful. Show the dialog while we wait for the request to finish.");
                JWG jwg2 = mediaCaptureActivity.A07;
                if (jwg2 != null) {
                    jwg2.A0A((DialogInterface.OnClickListener) null, AnonymousClass05K.A01);
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
            return Cmo;
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
