package X;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.CoroutineLiveData;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.remix.model.ClipsRemixControllerSavedState;

/* renamed from: X.Ab8  reason: case insensitive filesystem */
public final class C40375Ab8 implements AnonymousClass81E {
    public String A00;
    public boolean A01;
    public AnonymousClass2gO A02;
    public final Context A03;
    public final FragmentActivity A04;
    public final AnonymousClass2gO A05;
    public final AnonymousClass82C A06;
    public final UserSession A07;
    public final 2Cn A08;
    public final AnonymousClass88D A09;
    public final AnonymousClass0eM A0A = AnonymousClass1YB.A00(new MMR(this, 22));

    public C40375Ab8(Context context, FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass88D r9, String str) {
        AnonymousClass7TG.A0w(2, userSession, fragmentActivity, context);
        0qQ.A0B(r9, 5);
        this.A00 = str;
        this.A07 = userSession;
        this.A04 = fragmentActivity;
        this.A03 = context;
        this.A09 = r9;
        C40058APo aPo = new C40058APo(this, 5);
        this.A05 = aPo;
        this.A06 = new AXN(this, 2);
        AnonymousClass88B r3 = r9.A08;
        AnonymousClass2Fj r2 = r3.A06;
        if (r2.A02() == AnonymousClass88C.UNSET) {
            r2.A0B(AnonymousClass88C.DOWNLOADING);
        }
        r3.A00 = r9.A07;
        if (!2CC.A00(AnonymousClass05K.A0K)) {
            r9.A06.A0G.A06(r9.A01, aPo);
        }
        this.A08 = new KH1((Object) this, 9);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass9X8 r4, X.AnonymousClass804 r5) {
        /*
            r3 = this;
            r0 = 1
            X.0qQ.A0B(r5, r0)
            boolean r0 = r5 instanceof X.AnonymousClass803
            if (r0 == 0) goto L_0x0030
            X.88D r0 = r3.A09
            X.88B r0 = r0.A08
            X.82i r0 = r0.A00
            if (r0 == 0) goto L_0x002e
            X.9Tg r1 = r0.A02
        L_0x0012:
            X.9Tg r0 = X.C379289Tg.CLIPS
            if (r1 != r0) goto L_0x005a
            X.803 r5 = (X.AnonymousClass803) r5
            X.7kU r2 = r5.A00
            X.7kU r0 = X.C339977kU.HORIZONTAL
            if (r2 != r0) goto L_0x0025
            if (r4 == 0) goto L_0x0024
            X.9sL r0 = X.C391099sL.HORIZONTAL
        L_0x0022:
            r4.A04 = r0
        L_0x0024:
            return
        L_0x0025:
            X.7kU r0 = X.C339977kU.VERTICAL
            if (r2 != r0) goto L_0x005f
            if (r4 == 0) goto L_0x0024
            X.9sL r0 = X.C391099sL.VERTICAL
            goto L_0x0022
        L_0x002e:
            r1 = 0
            goto L_0x0012
        L_0x0030:
            boolean r0 = r5 instanceof X.C339987kV
            if (r0 == 0) goto L_0x0049
            X.88D r0 = r3.A09
            X.88B r0 = r0.A08
            X.82i r0 = r0.A00
            if (r0 == 0) goto L_0x0047
            X.9Tg r1 = r0.A02
        L_0x003e:
            X.9Tg r0 = X.C379289Tg.CLIPS
            if (r1 != r0) goto L_0x005a
            if (r4 == 0) goto L_0x0024
            X.9sL r0 = X.C391099sL.PICTURE_IN_PICTURE
            goto L_0x0022
        L_0x0047:
            r1 = 0
            goto L_0x003e
        L_0x0049:
            boolean r0 = r5 instanceof X.C340007kX
            if (r0 == 0) goto L_0x005a
            X.7kX r5 = (X.C340007kX) r5
            X.7kW r1 = r5.A00
            X.7kW r0 = X.C339997kW.A04
            if (r1 != r0) goto L_0x0024
            if (r4 == 0) goto L_0x0024
            X.9sL r0 = X.C391099sL.GREEN_SCREEN
            goto L_0x0022
        L_0x005a:
            if (r4 == 0) goto L_0x0024
            X.9sL r0 = X.C391099sL.NOT_CLIPS
            goto L_0x0022
        L_0x005f:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "VisualReplyDisplayMode orientation "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " not supported"
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r1)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40375Ab8.A00(X.9X8, X.804):void");
    }

    public final void A02(boolean z) {
        boolean z2;
        C11631SdZ sdZ = new C11631SdZ(1, this, z);
        this.A02 = sdZ;
        AnonymousClass88D r2 = this.A09;
        AnonymousClass88B r6 = r2.A08;
        05G r0 = r6.A07;
        19B r1 = 19B.A00;
        CoroutineLiveData A002 = C226292g8.A00(r1, r0);
        FragmentActivity fragmentActivity = r2.A01;
        A002.A06(fragmentActivity, sdZ);
        Uri A032 = 0cp.A03(this.A00);
        0qQ.A07(A032);
        if (A032.getScheme() == null || "file".equals(A032.getScheme())) {
            r6.A01 = AnonymousClass7TE.A0t(this.A00);
            r6.A06.A0B(AnonymousClass88C.SUCCESS);
            return;
        }
        String str = this.A00;
        if (z) {
            0qQ.A0B(str, 0);
            C3498982i r02 = r2.A07;
            if (r02 != null) {
                1Xj r03 = r02.A04;
                UserSession userSession = r2.A03;
                String A30 = r03.A30();
                if (A30 != null) {
                    boolean A5p = r03.A5p();
                    1Eo.A05(r1, new C66153MEv(fragmentActivity, userSession, r6, A30, str, (AnonymousClass4D7) null, 0, A5p), C318116oQ.A00(r6));
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
            return;
        }
        FragmentActivity fragmentActivity2 = this.A04;
        UserSession userSession2 = this.A07;
        0qQ.A0B(str, 0);
        C39863ACj.A02.getValue();
        C3498982i r04 = r6.A00;
        if (r04 != null) {
            z2 = r04.A04.CeS();
        } else {
            z2 = false;
        }
        C11211SFl sFl = new C11211SFl(str, "RemixSourceMediaSaver", z2, false, false);
        C39863ACj.A01 = str;
        C290815g0 A033 = C59730JVo.A03(fragmentActivity2, userSession2, sFl);
        C39863ACj.A00 = A033;
        1ES.A03(A033);
        r6.A06.A0B(AnonymousClass88C.DOWNLOADING);
        r2.A01(this.A08, this.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (r0 != null) goto L_0x00de;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.AnonymousClass804 r21) {
        /*
            r20 = this;
            r1 = r21
            boolean r0 = r1 instanceof X.C340007kX
            r4 = r20
            if (r0 == 0) goto L_0x00e1
            X.7kX r1 = (X.C340007kX) r1
            X.7kW r1 = r1.A00
            X.7kW r0 = X.C339997kW.A04
            if (r1 != r0) goto L_0x00e1
            X.88D r5 = r4.A09
            X.88B r7 = r5.A08
            X.82i r0 = r7.A00
            if (r0 == 0) goto L_0x00e1
            java.lang.String r6 = r4.A00
            r2 = 0
            X.0qQ.A0B(r6, r2)
            X.81o r1 = r5.A05
            X.82i r0 = r5.A07
            r3 = 1
            if (r0 == 0) goto L_0x00d6
            X.1Xj r0 = r0.A04
            boolean r0 = r0.A5p()
            if (r0 != r3) goto L_0x00d6
            java.io.File r0 = r7.A01
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = r0.getCanonicalPath()
            if (r0 != 0) goto L_0x00de
        L_0x0037:
            r1.A01(r2, r6, r2)
            r1.A00 = r3
            X.84v r9 = r5.A04
            if (r9 == 0) goto L_0x0074
            X.848 r0 = r9.A05
            X.05G r8 = r0.A00
            java.lang.Object r0 = r8.getValue()
            X.84D r0 = (X.AnonymousClass84D) r0
            r9.A00 = r0
            com.instagram.common.session.UserSession r7 = r9.A0F
            X.0Tu r6 = X.0Tu.A05
            r0 = 36877362297766019(0x8303c400030083, double:3.3847306381017525E-306)
            java.lang.String r12 = X.182.A04(r6, r7, r0)
            X.84B r11 = X.AnonymousClass84B.OTHER
            java.lang.String r13 = "reels_camera"
            r14 = 0
            r18 = -1
            X.8YD r10 = new X.8YD
            r15 = r14
            r16 = r14
            r17 = r14
            r19 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r8.Epw(r10)
            X.05G r0 = r9.A0c
            X.AnonymousClass7TF.A1O(r0, r3)
        L_0x0074:
            X.0xi r0 = X.0tS.A4E
            X.0tS r7 = r0.A00()
            X.0s0 r6 = r7.A0L
            X.0YZ[] r1 = X.0tS.A4G
            r0 = 170(0xaa, float:2.38E-43)
            boolean r0 = X.AnonymousClass7TG.A1a(r7, r6, r1, r0)
            if (r0 == 0) goto L_0x00c3
            X.0eM r6 = r4.A0A
            java.lang.Object r0 = r6.getValue()
            X.2eb r0 = (X.C71662eb) r0
            android.view.View r1 = r0.A01()
            X.0qQ.A07(r1)
            java.lang.Object r0 = r6.getValue()
            X.2eb r0 = (X.C71662eb) r0
            r0.A03(r2)
            r1.setVisibility(r2)
            r0 = 2131430062(0x7f0b0aae, float:1.8481814E38)
            android.widget.TextView r6 = X.AnonymousClass7TG.A0R(r1, r0)
            X.82W r0 = r5.A02
            X.82X r0 = r0.A00()
            com.instagram.camera.effect.models.CameraAREffect r0 = r0.A01()
            if (r0 == 0) goto L_0x00d4
            java.lang.String r1 = r0.A0M
        L_0x00b6:
            java.lang.String r0 = "Instance ID: "
            if (r1 != 0) goto L_0x00bc
            java.lang.String r1 = "null"
        L_0x00bc:
            java.lang.String r0 = X.002.A0R(r0, r1)
            r6.setText(r0)
        L_0x00c3:
            X.82C r1 = r4.A06
            X.0qQ.A0B(r1, r2)
            X.82W r0 = r5.A02
            X.82X r0 = r0.A00()
            r0.A06(r1)
        L_0x00d1:
            r4.A01 = r3
            return
        L_0x00d4:
            r1 = 0
            goto L_0x00b6
        L_0x00d6:
            X.82i r0 = r7.A00
            if (r0 == 0) goto L_0x012f
            X.A5F r0 = r0.A01
            java.lang.String r0 = r0.A01
        L_0x00de:
            r6 = r0
            goto L_0x0037
        L_0x00e1:
            X.88D r6 = r4.A09
            X.81o r0 = r6.A05
            r3 = 0
            r0.A00 = r3
            X.84v r0 = r6.A04
            if (r0 == 0) goto L_0x00f1
            X.05G r0 = r0.A0c
            X.AnonymousClass7TF.A1O(r0, r3)
        L_0x00f1:
            X.0xi r0 = X.0tS.A4E
            X.0tS r5 = r0.A00()
            X.0s0 r2 = r5.A0L
            X.0YZ[] r1 = X.0tS.A4G
            r0 = 170(0xaa, float:2.38E-43)
            boolean r0 = X.AnonymousClass7TG.A1a(r5, r2, r1, r0)
            if (r0 == 0) goto L_0x0120
            X.0eM r1 = r4.A0A
            java.lang.Object r0 = r1.getValue()
            X.2eb r0 = (X.C71662eb) r0
            android.view.View r2 = r0.A01()
            X.0qQ.A07(r2)
            java.lang.Object r1 = r1.getValue()
            X.2eb r1 = (X.C71662eb) r1
            r0 = 8
            r1.A03(r0)
            r2.setVisibility(r0)
        L_0x0120:
            X.82C r1 = r4.A06
            X.0qQ.A0B(r1, r3)
            X.82W r0 = r6.A02
            X.82X r0 = r0.A00()
            r0.A07(r1)
            goto L_0x00d1
        L_0x012f:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40375Ab8.A01(X.804):void");
    }

    public final boolean A03() {
        C3498982i r0 = this.A09.A08.A00;
        if (r0 == null || !r0.A04.A67()) {
            return false;
        }
        if (182.A06(0Tu.A05, this.A07, 36315009344998337L)) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ void A7M(Parcelable parcelable) {
        ClipsRemixControllerSavedState clipsRemixControllerSavedState = (ClipsRemixControllerSavedState) parcelable;
        if (clipsRemixControllerSavedState != null) {
            this.A01 = clipsRemixControllerSavedState.A01;
            this.A00 = clipsRemixControllerSavedState.A00;
        }
        if (this.A01) {
            AnonymousClass88D r2 = this.A09;
            AnonymousClass82C r1 = this.A06;
            0qQ.A0B(r1, 0);
            r2.A02.A00().A06(r1);
        }
        AnonymousClass88D r3 = this.A09;
        r3.A01(this.A08, this.A00);
        AnonymousClass2gO r22 = this.A05;
        0qQ.A0B(r22, 0);
        r3.A06.A0G.A06(r3.A01, r22);
    }

    public final /* bridge */ /* synthetic */ Parcelable ANX() {
        ClipsRemixControllerSavedState clipsRemixControllerSavedState = new ClipsRemixControllerSavedState(this.A01, this.A00);
        AnonymousClass88D r3 = this.A09;
        AnonymousClass2gO r1 = this.A05;
        0qQ.A0B(r1, 0);
        r3.A06.A0G.A08(r1);
        AnonymousClass82C r12 = this.A06;
        0qQ.A0B(r12, 0);
        r3.A02.A00().A07(r12);
        C39863ACj.A02.getValue();
        C290815g0 r13 = C39863ACj.A00;
        if (r13 != null) {
            r13.A00 = null;
        }
        return clipsRemixControllerSavedState;
    }
}
