package X;

import android.app.Activity;
import android.graphics.RectF;
import android.view.ViewGroup;
import com.google.common.collect.SingletonImmutableSet;
import com.instagram.common.session.UserSession;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.model.mediasize.ImageInfo;

/* renamed from: X.Anr  reason: case insensitive filesystem */
public final /* synthetic */ class C41069Anr implements Runnable {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ C384899i4 A01;

    public /* synthetic */ C41069Anr(ViewGroup viewGroup, C384899i4 r2) {
        this.A01 = r2;
        this.A00 = viewGroup;
    }

    public final void run() {
        AnonymousClass80H r0;
        Integer num;
        C384899i4 r5 = this.A01;
        ViewGroup viewGroup = this.A00;
        if (r5.mView != null) {
            AnonymousClass80M r1 = AnonymousClass80M.A00;
            CameraConfiguration A002 = C358098aM.A00(r1, new C358088aL[0]);
            A002.A02 = r5.A0K;
            String str = r5.A0C;
            boolean equals = "story_remix_reply".equals(str);
            boolean equals2 = "story_selfie_reply".equals(str);
            AnonymousClass80D A003 = AnonymousClass80D.A00();
            WUP wup = new WUP(r5, 5);
            wup.getClass();
            A003.A0l = wup;
            UserSession userSession = r5.A03;
            userSession.getClass();
            A003.A0S = userSession;
            Activity rootActivity = r5.getRootActivity();
            rootActivity.getClass();
            A003.A05 = rootActivity;
            A003.A0M = r5;
            if (equals || equals2) {
                r0 = new AnonymousClass80H(0sl.A00, new SingletonImmutableSet(AnonymousClass9QA.A00));
            } else {
                r0 = AnonymousClass80H.A02.A01(r5.A03, r1);
            }
            r0.getClass();
            A003.A0W = r0;
            A003.A3h = true;
            A003.A0R = r5.volumeKeyPressController;
            AnonymousClass80C r02 = r5.A06;
            r02.getClass();
            A003.A0t = r02;
            viewGroup.getClass();
            A003.A09 = viewGroup;
            A003.A0B = r5.A02;
            A003.A0O = r5;
            A003.A1I = r5.A08;
            RectF rectF = r5.A00;
            RectF rectF2 = r5.A01;
            A003.A06 = rectF;
            A003.A07 = rectF2;
            A003.A3r = false;
            A003.A3v = true;
            A003.A33 = false;
            A003.A04 = 0;
            String str2 = r5.A0C;
            C39719A6k a6k = r5.A07;
            ImageInfo imageInfo = a6k.A00;
            String str3 = a6k.A01;
            boolean z = r5.A0E;
            boolean z2 = r5.A0G;
            A003.A2q = str2;
            A003.A1K = imageInfo;
            A003.A2l = str3;
            A003.A37 = z;
            A003.A3V = z2;
            int i = 2;
            if (AnonymousClass000.A00(1850).equals(str2)) {
                i = 0;
            }
            A003.A03 = i;
            A003.A3H = true;
            A003.A47 = true;
            boolean z3 = r5.A0I;
            if (z3) {
                num = AnonymousClass05K.A01;
            } else {
                num = AnonymousClass05K.A0N;
            }
            A003.A28 = num;
            A003.A17 = new AnonymousClass80F(2131960439, 2131960439, true, false, false);
            A003.A0V = A002;
            A003.A3Q = true;
            A003.A3n = r5.A0H;
            A003.A3C = r5.A0F;
            A003.A3x = r5.A0J;
            A003.A3G = z3;
            A003.A3D = z3;
            A003.A3t = z3;
            A003.A3s = z3;
            A003.A3l = r5.A0K;
            if (AnonymousClass7TF.A0R(0Tu.A05, r5.A03, 36325098222793318L).booleanValue()) {
                A003.A2P = r5.A0A;
            }
            if (equals) {
                C3498982i A012 = C52345GOp.A01(r5.A03, AnonymousClass8JI.REMIX, r5.A07.A01);
                if (A012 != null) {
                    String str4 = r5.A0C;
                    boolean z4 = r5.A0E;
                    1Xj r03 = A012.A04;
                    ImageInfo A1p = r03.A1p();
                    String A30 = r03.A30();
                    A003.A2q = str4;
                    A003.A1K = A1p;
                    A003.A2l = A30;
                    A003.A37 = z4;
                    A003.A3V = false;
                    A003.A18 = A012;
                    RectF rectF3 = r5.A01;
                    A003.A06 = null;
                    A003.A07 = rectF3;
                    A003.A3r = false;
                    A003.A3v = true;
                    A003.A33 = false;
                    A003.A04 = 0;
                    A003.A03 = 4;
                    A003.A3i = true;
                    A003.A26 = 1;
                }
            } else if (equals2) {
                RectF rectF4 = r5.A01;
                A003.A06 = null;
                A003.A07 = rectF4;
                A003.A3r = false;
                A003.A3v = true;
                A003.A33 = false;
                A003.A04 = 0;
                A003.A44 = false;
                A003.A03 = 5;
                A003.A3i = true;
                A003.A26 = 1;
                A003.A3t = false;
                A003.A3s = false;
                A003.A28 = AnonymousClass05K.A0C;
            }
            AnonymousClass80Q r12 = new AnonymousClass80Q(A003);
            r5.A05 = r12;
            if (r5.isResumed()) {
                r12.A01();
            }
        }
    }
}
