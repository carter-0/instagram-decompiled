package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.List;

/* renamed from: X.8An  reason: invalid class name and case insensitive filesystem */
public final class C351818An extends C361478gI implements AnonymousClass89Y {
    public AnonymousClass8BA A00;
    public AnonymousClass8W6 A01;
    public C3499582p A02;
    public C314446iH A03;
    public AnonymousClass80U A04;
    public C56605I4e A05;
    public PromptStickerModel A06;
    public C352218Cl A07;
    public boolean A08;
    public final UserSession A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;

    public static final void A02(C351818An r7, String str) {
        C61076JwE jwE;
        C351818An r3 = r7;
        I12 A022 = ((C54436HDl) r7.A0B.getValue()).A02();
        if (A022 != null && (jwE = A022.A01) != null) {
            C318136oS A002 = C318116oQ.A00(r7);
            1Eo.A05(19B.A00, new C66174MGl((Object) r3, (Object) jwE, str, (AnonymousClass4D7) null, 27), A002);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C351818An(Application application, UserSession userSession) {
        super(application);
        C351828Ao r5 = new C351828Ao(userSession, application);
        C351838Ap r4 = new C351838Ap(userSession);
        C351848Aq r3 = new C351848Aq(application, userSession);
        0qQ.A0B(application, 1);
        0qQ.A0B(userSession, 2);
        this.A09 = userSession;
        this.A0A = AnonymousClass0eN.A01(new C377429Lu(25, r5, new AnonymousClass8ZA(r5.A00)));
        this.A0B = AnonymousClass0eN.A01(new C377429Lu(26, r4, new AnonymousClass8ZA(r4.A00)));
        this.A0C = AnonymousClass0eN.A01(new C377429Lu(27, r3, new AnonymousClass8ZA(r3.A00)));
    }

    public static final void A00(C351818An r5) {
        C61076JwE jwE;
        I12 A022 = ((C54436HDl) r5.A0B.getValue()).A02();
        if (A022 != null && (jwE = A022.A01) != null) {
            C318136oS A002 = C318116oQ.A00(r5);
            1Eo.A05(19B.A00, new MHN((Object) jwE, (Object) r5, (AnonymousClass4D7) null, 26), A002);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c4, code lost:
        if (r6 != false) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C351818An r18, X.C352218Cl r19) {
        /*
            r2 = r19
            X.8Cl r0 = r2.A0M
            if (r0 != 0) goto L_0x0007
            r0 = r2
        L_0x0007:
            r1 = r18
            r1.A07 = r0
            X.0eM r0 = r1.A0B
            java.lang.Object r5 = r0.getValue()
            X.HDl r5 = (X.C54436HDl) r5
            r5.A01 = r2
            X.8Cl r0 = r2.A0M
            if (r0 == 0) goto L_0x001a
            r2 = r0
        L_0x001a:
            java.lang.String r12 = r2.A0h
            java.util.Map r4 = r5.A03
            java.lang.Object r8 = r4.get(r12)
            if (r8 != 0) goto L_0x0048
            android.graphics.Bitmap r13 = r2.A0C
            java.lang.String r1 = r2.A06()
            int r7 = r2.A07
            boolean r6 = r2.A13
            if (r13 != 0) goto L_0x004e
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            android.graphics.Bitmap r13 = android.graphics.BitmapFactory.decodeFile(r1, r0)
            if (r13 != 0) goto L_0x004e
        L_0x003b:
            r9 = 0
        L_0x003c:
            X.I12 r8 = new X.I12
            r10 = 0
            r14 = 0
            r11 = r10
            r13 = r10
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r4.put(r12, r8)
        L_0x0048:
            X.05G r0 = r5.A05
            r0.Epw(r8)
            return
        L_0x004e:
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            float r0 = (float) r7
            r3.postRotate(r0)
            r0 = 90
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r7 == r0) goto L_0x00c4
            r0 = 270(0x10e, float:3.78E-43)
            if (r7 == r0) goto L_0x00c4
            if (r6 != 0) goto L_0x0067
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x0067:
            r1 = r2
        L_0x0068:
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x006a:
            r3.preScale(r1, r2)
            int r16 = r13.getWidth()
            int r17 = r13.getHeight()
            r14 = 0
            r6 = 1
            X.0fO.A03(r13)
            r15 = r14
            r18 = r3
            r19 = r6
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r13, r14, r15, r16, r17, r18, r19)
            if (r9 == 0) goto L_0x003b
            int r8 = r9.getWidth()
            int r0 = r9.getHeight()
            int r8 = r8 * r0
            com.instagram.common.session.UserSession r3 = r5.A02
            X.0qQ.A0B(r3, r14)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36601393469853853(0x8208c6000e109d, double:3.210206840092823E-306)
            long r0 = X.182.A01(r2, r3, r0)
            long r2 = (long) r8
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 < 0) goto L_0x003c
            double r2 = (double) r0
            double r0 = (double) r8
            double r2 = r2 / r0
            double r7 = java.lang.Math.sqrt(r2)
            int r0 = r9.getWidth()
            double r0 = (double) r0
            double r0 = r0 * r7
            int r2 = X.AnonymousClass1GB.A00(r0)
            int r0 = r9.getHeight()
            double r0 = (double) r0
            double r0 = r0 * r7
            int r0 = X.AnonymousClass1GB.A00(r0)
            android.graphics.Bitmap r9 = X.0fO.A00(r9, r2, r0, r6)
            goto L_0x003c
        L_0x00c4:
            if (r6 == 0) goto L_0x0068
            goto L_0x006a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C351818An.A01(X.8An, X.8Cl):void");
    }

    public static final void A03(C351818An r8, boolean z) {
        Integer num;
        List A0A2;
        String str;
        if (z) {
            num = AnonymousClass05K.A00;
        } else if (((C54436HDl) r8.A0B.getValue()).A06()) {
            num = AnonymousClass05K.A0C;
        } else {
            num = AnonymousClass05K.A01;
        }
        C56605I4e i4e = r8.A05;
        if (i4e == null) {
            str = "magicModLogger";
        } else {
            27r A012 = 27p.A01(i4e.A01);
            C53401GnY gnY = i4e.A00;
            AnonymousClass80P A002 = C394969yz.A00((C362088hK) gnY.A01);
            String str2 = gnY.A03;
            int intValue = num.intValue();
            int i = 3;
            if (intValue == 0) {
                i = 1;
            } else if (intValue != 1) {
                i = 2;
            }
            0wc r2 = A012.A01;
            0Aj A003 = r2.A00(r2.A00, "ig_camera_end_genai_session");
            C279294yP A0J = A012.A0J();
            AnonymousClass283 r1 = A012.A04;
            String str3 = r1.A0L;
            if (!(!A003.isSampled() || A0J == null || str3 == null)) {
                A003.A8M(A0J, "camera_destination");
                A003.A8M(r1.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                A003.A8k("event_type", 2);
                A003.A8M(C59725JVj.POST_CAPTURE, "surface");
                A003.AAJ("camera_session_id", str3);
                A003.AAJ("module", 27x.A08.getModuleName());
                A003.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
                A003.A8k("genai_exit_point", Integer.valueOf(i));
                A003.AAJ(AnonymousClass000.A00(3540), str2);
                A003.A8M(A002, "camera_tool");
                A003.Cgf();
            }
            C314446iH r0 = r8.A03;
            if (r0 != null) {
                r0.D48(r8);
            }
            if (z) {
                AnonymousClass8BA r02 = r8.A00;
                if (r02 == null) {
                    str = "delegate";
                } else {
                    r02.A1J.DX0();
                    return;
                }
            } else {
                C54436HDl hDl = (C54436HDl) r8.A0B.getValue();
                C352218Cl r03 = hDl.A01;
                if ((r03 == null || (A0A2 = r03.A0A()) == null || A0A2.isEmpty()) && hDl.A00 != null) {
                    C56511Hzi A004 = C54436HDl.A00(hDl);
                    A004.A01 = null;
                    A004.A02.Epw(AnonymousClass62M.A01);
                    A004.A00 = null;
                    return;
                }
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A0E(boolean z) {
        if (!z) {
            AnonymousClass80U r1 = this.A04;
            if (r1 == null) {
                0qQ.A0F("quickCaptureState");
                throw AnonymousClass00P.createAndThrow();
            } else {
                r1.E3H(new Object());
            }
        }
    }

    public final /* synthetic */ boolean onBackPressed() {
        return false;
    }
}
