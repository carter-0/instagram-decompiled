package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.8S5  reason: invalid class name */
public final class AnonymousClass8S5 implements C249463jp, C3493580b {
    public C362868ic A00;
    public C362058hH A01;
    public final Activity A02;
    public final View A03;
    public final ViewGroup A04;
    public final ViewGroup A05;
    public final ViewGroup A06;
    public final AnonymousClass847 A07;
    public final AnonymousClass82W A08;
    public final UserSession A09;
    public final AnonymousClass4D6 A0A;
    public final C357638Yz A0B;
    public final C3510387i A0C;
    public final AnonymousClass8S6 A0D = new AnonymousClass8S6(this);
    public final AnonymousClass8QA A0E;
    public final AnonymousClass8QN A0F;
    public final AnonymousClass8K4 A0G;
    public final C355948Rz A0H;
    public final AnonymousClass8BA A0I;
    public final AnonymousClass8LU A0J;
    public final TargetViewSizeProvider A0K;
    public final C352888Fl A0L;
    public final C3499582p A0M;
    public final C3509286x A0N;
    public final AnonymousClass88A A0O;
    public final AnonymousClass8FK A0P;
    public final C3503684j A0Q;
    public final AnonymousClass8DB A0R;
    public final AnonymousClass8E5 A0S;
    public final AnonymousClass8H9 A0T;
    public final C353788Jb A0U;
    public final C352848Fg A0V;
    public final AnonymousClass8H7 A0W;
    public final AnonymousClass8H5 A0X;
    public final AnonymousClass8E6 A0Y;
    public final AnonymousClass80U A0Z;
    public final C353508Hx A0a;
    public final ClipsCreationViewModel A0b;
    public final C3510287h A0c;
    public final AnonymousClass8D9 A0d;
    public final C314676if A0e;
    public final AnonymousClass88F A0f;
    public final C351818An A0g;
    public final C267874cM A0h;
    public final C352828Fe A0i;
    public final InteractiveDrawableContainer A0j;
    public final Set A0k = new LinkedHashSet();
    public final boolean A0l;
    public final int A0m;
    public final C3506485o A0n;
    public final AnonymousClass8H3 A0o;
    public final AnonymousClass861 A0p;
    public final AnonymousClass0eM A0q;

    private final void A04(C365758nd r6, boolean z) {
        Integer num;
        String str;
        boolean z2 = false;
        if (z) {
            num = AnonymousClass05K.A00;
        } else {
            C357638Yz r1 = this.A0B;
            if (r1.A0R()) {
                num = AnonymousClass05K.A01;
            } else {
                num = null;
            }
            if (r1.A0V(C358088aL.A0B)) {
                num = AnonymousClass05K.A0C;
            }
            if (r1.A0V(C358088aL.A0M)) {
                num = AnonymousClass05K.A0N;
            }
            if (r1.A0V(C358088aL.A0C)) {
                num = AnonymousClass05K.A0j;
            } else if (num == null) {
                num = AnonymousClass05K.A0u;
            }
        }
        UserSession userSession = this.A09;
        if (this.A0O != null) {
            z2 = true;
        }
        1Av A002 = 1Au.A00(userSession);
        switch (num.intValue()) {
            case 1:
                str = "normal";
                break;
            case 2:
                str = "boomerang";
                break;
            case 3:
                str = "hands-free";
                break;
            case 4:
                str = "igtv";
                break;
            case 5:
                str = "text";
                break;
            case 6:
                str = "unknown";
                break;
            default:
                str = "library-import";
                break;
        }
        String str2 = r6.A01;
        0xY AR4 = A002.A01.AR4();
        AR4.E5g("pending_capture_intent_capture_mode", str);
        AR4.E5g("pending_capture_intent_media_type", str2);
        AR4.E5T("pending_capture_intent_is_reply", z2);
        AR4.apply();
    }

    public final void A06(C365798nh r7) {
        String str;
        ArrayList A1L = 0sr.A1L(new C365798nh[]{r7});
        C3499482o r3 = this.A0M.A02;
        r3.A09(A1L);
        int ordinal = r3.A01().ordinal();
        if (ordinal == 0) {
            str = "Photo post capture update not supported";
        } else if (ordinal != 1) {
            str = "Unknown media type";
        } else {
            AnonymousClass8LU r1 = this.A0J;
            C349307zv A042 = r3.A01.A04();
            if (A042 != null) {
                r1.A0Q(A042, 0, true);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        0kD.A07("CaptureStateCoordinator", str, (Throwable) null);
    }

    private final void A00() {
        AnonymousClass0iw r3;
        UserSession userSession;
        C3499482o r2 = this.A0M.A02;
        Integer num = r2.A01.A0B;
        0qQ.A07(num);
        if (num == AnonymousClass05K.A0C) {
            userSession = this.A09;
            2cc A002 = C71342cb.A00(userSession);
            AnonymousClass8QN r32 = this.A0F;
            A002.A0D(r32, "back", this.A0m + 2);
            C71342cb.A00(userSession).A08(this.A02, r32);
        } else {
            if (r2.A01() == C365758nd.A04) {
                r3 = this.A0G;
            } else {
                r3 = this.A0J;
            }
            userSession = this.A09;
            C71342cb.A00(userSession).A0D(r3, "back", this.A0m + 2);
            C71342cb.A00(userSession).A08(this.A02, r3);
        }
        C71342cb.A00(userSession).A0E("unknown", this.A0L);
    }

    public static final void A01(AnonymousClass8S5 r3, C349307zv r4) {
        if (r4 != null && AnonymousClass9TC.A00(r3.A09, (C279284yO) r3.A0B.A08.A00)) {
            C266824aP r32 = new C266824aP();
            C266764aJ r2 = new C266764aJ(C266714aE.VIDEO);
            r2.A02(new C266744aH(new File(r4.A0k)).A00());
            r32.A04(new C266794aM(r2));
            r4.A0O = new MediaComposition(r32);
        }
    }

    /* JADX WARNING: type inference failed for: r0v53, types: [X.9jp, X.11X] */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01a1, code lost:
        if (r9.A0I.A18.A32 != false) goto L_0x01a3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.AnonymousClass8S5 r9, java.util.List r10, java.util.List r11, boolean r12) {
        /*
            X.80U r0 = r9.A0Z
            boolean r0 = r0.CZU()
            r2 = 0
            if (r0 != 0) goto L_0x0010
            java.lang.String r1 = "show media while not in post capture"
            java.lang.String r0 = "Media can only be shown while in post capture"
            X.0kD.A07(r1, r0, r2)
        L_0x0010:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r10.iterator()
        L_0x0019:
            boolean r0 = r4.hasNext()
            r1 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0032
            java.lang.Object r3 = r4.next()
            r0 = r3
            X.8nh r0 = (X.C365798nh) r0
            X.8nd r1 = r0.A05
            X.8nd r0 = X.C365758nd.A07
            if (r1 != r0) goto L_0x0019
            r5.add(r3)
            goto L_0x0019
        L_0x0032:
            java.util.Iterator r8 = r5.iterator()
        L_0x0036:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0097
            java.lang.Object r0 = r8.next()
            X.8nh r0 = (X.C365798nh) r0
            X.7zv r6 = r0.A03
            if (r6 == 0) goto L_0x0036
            com.instagram.common.session.UserSession r4 = r9.A09
            X.8Yz r0 = r9.A0B
            X.80m r0 = r0.A08
            java.lang.Object r0 = r0.A00
            X.4yO r0 = (X.C279284yO) r0
            boolean r0 = X.AnonymousClass9TC.A00(r4, r0)
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = r6.A0k
            java.io.File r4 = new java.io.File
            r4.<init>(r0)
            X.4aH r0 = new X.4aH
            r0.<init>(r4)
            X.4aI r7 = r0.A00()
            X.4aP r5 = new X.4aP
            r5.<init>()
            X.4aE r0 = X.C266714aE.VIDEO
            X.4aJ r4 = new X.4aJ
            r4.<init>(r0)
            r4.A02(r7)
            X.4aM r0 = new X.4aM
            r0.<init>(r4)
            r5.A04(r0)
            X.4aE r0 = X.C266714aE.AUDIO
            X.4aJ r4 = new X.4aJ
            r4.<init>(r0)
            r4.A02(r7)
            X.4aM r0 = new X.4aM
            r0.<init>(r4)
            r5.A04(r0)
            com.facebook.videolite.transcoder.base.composition.MediaComposition r0 = new com.facebook.videolite.transcoder.base.composition.MediaComposition
            r0.<init>(r5)
            r6.A0O = r0
            goto L_0x0036
        L_0x0097:
            X.82p r7 = r9.A0M
            X.82o r6 = r7.A02
            X.82Y r4 = r6.A01
            java.util.List r0 = r4.A0o
            r0.clear()
            if (r11 == 0) goto L_0x00a7
            r0.addAll(r11)
        L_0x00a7:
            r6.A09(r10)
            java.util.List r0 = r4.A0m
            int r0 = r0.size()
            if (r0 > r1) goto L_0x016f
            X.802 r0 = r4.A02()
            if (r0 == 0) goto L_0x0102
            X.87I r5 = r0.A06
        L_0x00ba:
            X.87I r0 = X.AnonymousClass87I.BIRTHDAY_HIGHLIGHTS
            if (r5 == r0) goto L_0x016f
            X.8BA r0 = r9.A0I
            X.80D r0 = r0.A18
            boolean r0 = r0.A32
            if (r0 != 0) goto L_0x016f
            X.8nd r0 = r6.A01()
            int r0 = r0.ordinal()
            if (r0 == r3) goto L_0x0108
            if (r0 == r1) goto L_0x0104
            java.lang.String r0 = "CaptureStateCoordinator"
            java.lang.String r4 = "Unknown media type"
            X.0kD.A07(r0, r4, r2)
            X.8Yz r0 = r9.A0B
            X.80m r0 = r0.A08
            java.lang.Object r3 = r0.A00
            X.9QA r0 = X.AnonymousClass9QA.A00
            if (r3 == r0) goto L_0x00e7
            X.80M r0 = X.AnonymousClass80M.A00
            if (r3 != r0) goto L_0x0101
        L_0x00e7:
            com.instagram.common.session.UserSession r0 = r9.A09
            X.8nu r2 = X.C365918nt.A00(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "camera_destination "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            r2.A04(r4, r0)
        L_0x0101:
            return
        L_0x0102:
            r5 = r2
            goto L_0x00ba
        L_0x0104:
            A03(r9, r12)
            return
        L_0x0108:
            com.instagram.common.session.UserSession r8 = r9.A09
            X.2cc r0 = X.C71342cb.A00(r8)
            X.8K4 r5 = r9.A0G
            r0.A0C(r5)
            X.2cc r1 = X.C71342cb.A00(r8)
            java.lang.String r0 = "unknown"
            r1.A0E(r0, r5)
            X.8Cl r4 = r4.A03()
            if (r4 == 0) goto L_0x0167
            X.27r r0 = X.27p.A01(r8)
            X.283 r0 = r0.A04
            java.lang.String r1 = r0.A0L
            X.8Yz r0 = r9.A0B
            X.80m r0 = r0.A08
            java.lang.Object r0 = r0.A00
            X.4yO r0 = (X.C279284yO) r0
            r3 = 17634072(0x10d1318, float:2.591131E-38)
            X.C360908fL.A02(r8, r0, r1, r2, r3)
            X.02m r2 = X.02m.A0p
            int r1 = r4.A08
            java.lang.String r0 = "capture_source"
            r2.markerAnnotate(r3, r0, r1)
            android.graphics.Bitmap r0 = r4.A0C
            if (r0 != 0) goto L_0x0155
            boolean r1 = r4.A12
            X.8nd r0 = X.C365758nd.A04
            r9.A04(r0, r1)
            X.C255193tj.A01(r8, r6, r4)
        L_0x014f:
            X.8QA r0 = r9.A0E
            r5.A0I(r0)
            return
        L_0x0155:
            X.4D6 r1 = r9.A0A
            X.9jp r0 = new X.9jp
            r0.<init>(r8, r7)
            r1.schedule(r0)
            boolean r1 = r4.A12
            X.8nd r0 = X.C365758nd.A04
            r9.A04(r0, r1)
            goto L_0x014f
        L_0x0167:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x016f:
            com.instagram.common.session.UserSession r2 = r9.A09
            X.2cc r0 = X.C71342cb.A00(r2)
            X.8QN r5 = r9.A0F
            r0.A0C(r5)
            X.2cc r2 = X.C71342cb.A00(r2)
            java.lang.String r0 = "unknown"
            r2.A0E(r0, r5)
            r5.A0A(r10)
            X.802 r0 = r4.A02()
            if (r0 == 0) goto L_0x020e
            X.87I r2 = r0.A06
        L_0x018e:
            X.87I r0 = X.AnonymousClass87I.SHOUTOUT
            if (r2 == r0) goto L_0x01a3
            X.87I r0 = X.AnonymousClass87I.END_OF_YEAR
            if (r2 == r0) goto L_0x01a3
            X.87I r0 = X.AnonymousClass87I.BIRTHDAY_HIGHLIGHTS
            if (r2 == r0) goto L_0x01a3
            X.8BA r0 = r9.A0I
            X.80D r0 = r0.A18
            boolean r0 = r0.A32
            r2 = 0
            if (r0 == 0) goto L_0x01a4
        L_0x01a3:
            r2 = 1
        L_0x01a4:
            X.8QZ r6 = r5.A0c
            X.8Qe r0 = r6.A06
            r0.CLA()
            r6.A0D = r2
            r0 = r2 ^ 1
            if (r0 == 0) goto L_0x0205
            X.0eM r0 = r6.A0W
            java.lang.Object r0 = r0.getValue()
            X.8Qd r0 = (X.C355478Qd) r0
        L_0x01b9:
            X.8Qe r0 = (X.C355488Qe) r0
            r6.A06 = r0
            r5.A09 = r1
            androidx.recyclerview.widget.RecyclerView r4 = r6.A0L
            r4.setEnabled(r1)
            android.view.View r2 = r6.A0J
            boolean r1 = r6.A0C
            r0 = 0
            if (r1 == 0) goto L_0x01cc
            r0 = 1
        L_0x01cc:
            r2.setEnabled(r0)
            X.3AR r0 = r6.A0M
            r4.setItemAnimator(r0)
            X.8QA r1 = r5.A0K
            java.util.Set r0 = r1.A0N
            r0.add(r5)
            int r0 = r5.A01
            r6.A09(r0)
            X.AnonymousClass8QN.A02(r5)
            r1.A0A()
            r1.A09()
            X.2eb r2 = r5.A0J
            boolean r0 = r2.A04()
            if (r0 != 0) goto L_0x01fa
            android.view.View r1 = r2.A01()
            X.8R4 r0 = r5.A0e
            r1.setBackground(r0)
        L_0x01fa:
            r2.A03(r3)
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r1 = r5.A0H
            android.view.View$OnTouchListener r0 = r5.A0B
            r1.CNi(r0)
            return
        L_0x0205:
            X.0eM r0 = r6.A0X
            java.lang.Object r0 = r0.getValue()
            X.WUs r0 = (X.C19336WUs) r0
            goto L_0x01b9
        L_0x020e:
            r2 = 0
            goto L_0x018e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8S5.A02(X.8S5, java.util.List, java.util.List, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.AnonymousClass8S5 r8, boolean r9) {
        /*
            X.82p r0 = r8.A0M
            X.82o r5 = r0.A02
            X.82Y r1 = r5.A01
            X.7zv r6 = r1.A04()
            com.instagram.common.session.UserSession r4 = r8.A09
            X.27r r0 = X.27p.A01(r4)
            X.283 r0 = r0.A04
            java.lang.String r7 = r0.A0L
            X.8Yz r0 = r8.A0B
            X.80m r0 = r0.A08
            java.lang.Object r3 = r0.A00
            X.4yO r3 = (X.C279284yO) r3
            r2 = 0
            r0 = 17639126(0x10d26d6, float:2.5925473E-38)
            X.C360908fL.A02(r4, r3, r7, r2, r0)
            X.2cc r0 = X.C71342cb.A00(r4)
            X.8LU r3 = r8.A0J
            r0.A0C(r3)
            X.2cc r2 = X.C71342cb.A00(r4)
            java.lang.String r0 = "unknown"
            r2.A0E(r0, r3)
            if (r6 == 0) goto L_0x00cd
            boolean r2 = r6.A18
            X.8nd r0 = X.C365758nd.A07
            r8.A04(r0, r2)
            boolean r0 = r5.A0G()
            if (r0 != 0) goto L_0x007b
            X.802 r0 = r1.A02()
            if (r0 != 0) goto L_0x007b
            boolean r0 = r6.A18
            if (r0 != 0) goto L_0x007b
            X.8Yz r0 = r1.A0X
            r0.getClass()
            X.80m r0 = r0.A08
            java.lang.Object r2 = r0.A00
            boolean r0 = r2 instanceof X.AnonymousClass80O
            if (r0 != 0) goto L_0x007b
            boolean r0 = r1.A0T
            if (r0 != 0) goto L_0x007b
            boolean r0 = r2 instanceof X.AnonymousClass80M
            if (r0 != 0) goto L_0x007b
            X.8ka r0 = X.C255193tj.A00(r4)
            if (r0 == 0) goto L_0x0073
            X.7zv r0 = r0.A04
            if (r0 == 0) goto L_0x0073
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x007b
        L_0x0073:
            X.8ka r0 = new X.8ka
            r0.<init>((X.C349307zv) r6)
            X.C255193tj.A02(r4, r0)
        L_0x007b:
            X.8QA r0 = r8.A0E
            r3.A0N(r0, r9)
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r0 = r8.A0j
            X.8jJ r5 = r0.A0o
            X.8jM r3 = r5.A0d
            r4 = 0
            r3.A00(r4, r4)
            r5.A0L = r4
            X.50r r1 = r1.A0g
            X.50r r0 = X.C2801950r.FEED_POST
            if (r1 != r0) goto L_0x00bb
            int r2 = r6.A08
            int r0 = r6.A0K
            r3.A00(r4, r4)
            r5.A0L = r4
            if (r2 == 0) goto L_0x00bb
            if (r0 == 0) goto L_0x00bb
            if (r0 != r2) goto L_0x00bc
            int r0 = r5.A0O
            r5.A09 = r0
        L_0x00a5:
            r5.A08 = r0
        L_0x00a7:
            boolean r0 = r5.A0I
            if (r0 == 0) goto L_0x00bb
            int r1 = r5.A08
            android.graphics.Rect r0 = r5.A0P
            int r2 = r0.centerY()
            int r1 = r1 / 2
            int r0 = r2 - r1
            int r2 = r2 + r1
            r3.A00(r0, r2)
        L_0x00bb:
            return
        L_0x00bc:
            float r1 = (float) r0
            float r0 = (float) r2
            float r1 = r1 / r0
            r0 = 1058013184(0x3f100000, float:0.5625)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x00a7
            int r0 = r5.A0O
            r5.A09 = r0
            float r0 = (float) r0
            float r0 = r0 / r1
            int r0 = (int) r0
            goto L_0x00a5
        L_0x00cd:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8S5.A03(X.8S5, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r5v132, types: [X.07Z, X.4DH] */
    /* JADX WARNING: type inference failed for: r5v174, types: [X.07Z, X.4DH] */
    /* JADX WARNING: type inference failed for: r21v6, types: [X.07Z] */
    /* JADX WARNING: type inference failed for: r22v8, types: [X.07Z] */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x036e, code lost:
        if (X.182.A06(X.0Tu.A06, r11, 36316800345969292L) == false) goto L_0x0370;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0b40, code lost:
        if (r9 == false) goto L_0x0b14;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x09f8  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x0a22  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0a9b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A05(X.C353538Ia r35, java.util.List r36, java.util.List r37) {
        /*
            r34 = this;
            r4 = r34
            r2 = r35
            X.8Yz r0 = r4.A0B
            r32 = r0
            X.80m r0 = r0.A08
            r31 = r0
            java.lang.Object r5 = r0.A00
            X.9QA r17 = X.AnonymousClass9QA.A00
            r1 = 1
            r0 = 0
            r33 = r36
            r3 = r17
            if (r5 == r3) goto L_0x001c
            X.80M r3 = X.AnonymousClass80M.A00
            if (r5 != r3) goto L_0x00b2
        L_0x001c:
            com.instagram.common.session.UserSession r9 = r4.A09
            X.8nu r3 = X.C365918nt.A00(r9)
            X.27r r5 = X.27p.A01(r9)
            X.283 r5 = r5.A04
            X.28D r10 = r5.A09
            X.0qQ.A07(r10)
            X.8Fl r5 = r4.A0L
            java.lang.String r8 = r5.A0O()
            r5 = r31
            java.lang.Object r5 = r5.A00
            X.4yO r5 = (X.C279284yO) r5
            int r12 = r33.size()
            r6 = r33
            boolean r6 = r6 instanceof java.util.Collection
            if (r6 == 0) goto L_0x0165
            boolean r6 = r33.isEmpty()
            if (r6 == 0) goto L_0x0165
        L_0x0049:
            java.lang.Integer r11 = X.AnonymousClass05K.A00
        L_0x004b:
            X.27r r6 = X.27p.A01(r9)
            java.lang.String r15 = r6.A0R()
            r6 = 2
            X.0qQ.A0B(r5, r6)
            X.29E r9 = r3.A04
            r19 = 0
            r21 = 518917368(0x1eee0cf8, float:2.5204594E-20)
            r22 = 12000(0x2ee0, double:5.929E-320)
            r20 = r19
            r18 = r9
            long r6 = r18.A04(r19, r20, r21, r22)
            r3.A03 = r6
            java.lang.String r22 = r10.name()
            java.lang.String r21 = "entry_point"
            r19 = r6
            r23 = r0
            r18.A0B(r19, r21, r22, r23)
            long r6 = r3.A03
            java.lang.String r22 = java.lang.String.valueOf(r12)
            java.lang.String r21 = "num_captured_media"
            r19 = r6
            r18.A0B(r19, r21, r22, r23)
            long r6 = r3.A03
            java.lang.String r13 = X.C365948nw.A00(r11)
            java.lang.String r12 = "media_type"
            r10 = r6
            r14 = r0
            r9.A0B(r10, r12, r13, r14)
            long r6 = r3.A03
            java.lang.String r5 = r5.A02
            java.lang.String r12 = "camera_destination"
            r10 = r6
            r13 = r5
            r9.A0B(r10, r12, r13, r14)
            if (r15 == 0) goto L_0x00a9
            long r5 = r3.A03
            java.lang.String r14 = "transport_type"
            r11 = r9
            r12 = r5
            r16 = r0
            r11.A0B(r12, r14, r15, r16)
        L_0x00a9:
            if (r8 == 0) goto L_0x00b2
            long r5 = r3.A03
            java.lang.String r3 = "camera_tool_cf"
            r9.A0A(r5, r3, r8)
        L_0x00b2:
            boolean r3 = r33.isEmpty()
            r3 = r3 ^ 1
            r18 = r37
            if (r3 == 0) goto L_0x00d3
            X.82p r3 = r4.A0M
            X.82o r6 = r3.A02
            X.82Y r3 = r6.A01
            java.util.List r5 = r3.A0o
            r5.clear()
            if (r37 == 0) goto L_0x00ce
            r3 = r18
            r5.addAll(r3)
        L_0x00ce:
            r3 = r33
            r6.A09(r3)
        L_0x00d3:
            X.82p r3 = r4.A0M
            X.82o r5 = r3.A02
            X.82Y r9 = r5.A01
            java.util.List r3 = r9.A0m
            int r3 = r3.size()
            if (r3 != r1) goto L_0x00f9
            X.8nd r5 = r5.A01()
            X.8nd r3 = X.C365758nd.A04
            if (r5 != r3) goto L_0x00f9
            X.8K4 r3 = r4.A0G
            X.8KR r6 = r3.A0N
            X.0nO r5 = X.0nY.A00()
            X.8lq r3 = new X.8lq
            r3.<init>(r6)
            r5.ATE(r3)
        L_0x00f9:
            X.8Jb r10 = r4.A0U
            com.instagram.common.session.UserSession r3 = r10.A0E
            r26 = r3
            boolean r3 = X.C305756Jk.A01(r26)
            if (r3 == 0) goto L_0x02b1
            X.8Yz r6 = r10.A0F
            X.80m r7 = r6.A08
            java.lang.Object r5 = r7.A00
            boolean r3 = r5 instanceof X.AnonymousClass80O
            if (r3 != 0) goto L_0x0196
            X.80h r3 = X.C3494180h.A00
            boolean r3 = X.0qQ.A0K(r5, r3)
            if (r3 != 0) goto L_0x0196
            r3 = r17
            boolean r3 = X.0qQ.A0K(r5, r3)
            if (r3 != 0) goto L_0x0196
            X.80M r3 = X.AnonymousClass80M.A00
            boolean r3 = X.0qQ.A0K(r5, r3)
            if (r3 != 0) goto L_0x0196
            X.80f r3 = X.C3493980f.A00
            boolean r3 = X.0qQ.A0K(r5, r3)
            if (r3 != 0) goto L_0x02b1
            X.8jC r3 = X.C363138jC.A00
            boolean r3 = X.0qQ.A0K(r5, r3)
            if (r3 != 0) goto L_0x02b1
            X.80L r3 = X.AnonymousClass80L.A00
            boolean r3 = X.0qQ.A0K(r5, r3)
            if (r3 != 0) goto L_0x02b1
            X.80i r3 = X.C3494280i.A00
            boolean r3 = X.0qQ.A0K(r5, r3)
            if (r3 != 0) goto L_0x02b1
            X.80J r3 = X.AnonymousClass80J.A00
            boolean r3 = X.0qQ.A0K(r5, r3)
            if (r3 != 0) goto L_0x02b1
            X.80K r3 = X.AnonymousClass80K.A00
            boolean r3 = X.0qQ.A0K(r5, r3)
            if (r3 != 0) goto L_0x02b1
            X.80g r3 = X.C3494080g.A00
            boolean r3 = X.0qQ.A0K(r5, r3)
            if (r3 != 0) goto L_0x02b1
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0165:
            java.util.Iterator r11 = r33.iterator()
            r7 = 0
        L_0x016a:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto L_0x0186
            java.lang.Object r6 = r11.next()
            X.8nh r6 = (X.C365798nh) r6
            X.7zv r6 = r6.A03
            if (r6 == 0) goto L_0x016a
            int r7 = r7 + 1
            if (r7 >= 0) goto L_0x016a
            X.0sr.A1S()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0186:
            if (r7 == 0) goto L_0x0049
            int r6 = r33.size()
            if (r7 != r6) goto L_0x0192
            java.lang.Integer r11 = X.AnonymousClass05K.A01
            goto L_0x004b
        L_0x0192:
            java.lang.Integer r11 = X.AnonymousClass05K.A0C
            goto L_0x004b
        L_0x0196:
            X.0qQ.A0B(r5, r0)
            boolean r3 = r5 instanceof X.AnonymousClass80O
            if (r3 == 0) goto L_0x05bb
            X.07f r8 = r10.A07
            android.app.Activity r3 = r10.A05
            r30 = r3
            android.content.Context r20 = r30.getApplicationContext()
            X.0qQ.A07(r20)
            X.8Ja r11 = r10.A0B
            X.81r r7 = r10.A09
            X.28D r5 = r10.A00
            r3 = 2
            X.0qQ.A0B(r11, r3)
            r3 = 4
            X.0qQ.A0B(r7, r3)
            X.9jR r3 = new X.9jR
            r19 = r3
            r21 = r5
            r22 = r7
            r23 = r11
            r24 = r26
            r25 = r6
            r19.<init>(r20, r21, r22, r23, r24, r25)
            X.2YP r7 = X.AnonymousClass2YP.A00
            X.2YN r5 = new X.2YN
            r5.<init>(r3, r8, r7)
            java.lang.Class<X.9YG> r3 = X.AnonymousClass9YG.class
            X.2YL r13 = r5.A00(r3)
            X.9YG r13 = (X.AnonymousClass9YG) r13
            r10.A03 = r13
            X.6iH r3 = r10.A0J
            r13.A03 = r3
            X.AIl r6 = r10.A01
            if (r6 != 0) goto L_0x0231
            android.view.View r3 = r10.A06
            r19 = r3
            X.80U r3 = r10.A0K
            r16 = r3
            X.84q r15 = r10.A0H
            X.4DH r14 = r10.A0A
            X.0eM r3 = r10.A0L
            java.lang.Object r3 = r3.getValue()
            X.7oF r3 = (X.C342227oF) r3
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r3 = r3.A00
            boolean r3 = r3 instanceof com.instagram.creation.capture.quickcapture.aspectratioutil.FullHeightLayoutConfigImpl
            if (r3 == 0) goto L_0x05b7
            android.content.Context r12 = r14.requireContext()
            X.0Tu r11 = X.0Tu.A05
            r5 = 36325025208349236(0x810d6b00003234, double:3.0354304386716376E-306)
            r3 = r26
            boolean r3 = X.182.A06(r11, r3, r5)
            com.instagram.creation.capture.quickcapture.aspectratioutil.FullHeightLayoutConfigImpl r5 = new com.instagram.creation.capture.quickcapture.aspectratioutil.FullHeightLayoutConfigImpl
            r5.<init>(r12, r3)
        L_0x0212:
            X.86W r3 = r10.A08
            X.AIl r6 = new X.AIl
            r21 = r19
            r22 = r14
            r23 = r8
            r24 = r3
            r25 = r26
            r26 = r5
            r27 = r15
            r28 = r13
            r29 = r16
            r19 = r6
            r20 = r30
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r10.A01 = r6
        L_0x0231:
            r6.A00 = r13
            X.3ju r3 = r13.A0A
            X.05Y r11 = X.0u9.A04(r3)
            r8 = 0
            r5 = 20
            X.MGa r3 = new X.MGa
            r3.<init>(r6, r8, r5)
            X.0pz r5 = new X.0pz
            r5.<init>(r3, r11)
            X.07Z r3 = r6.A04
            X.0xx r3 = X.AnonymousClass07a.A00(r3)
            X.AnonymousClass11O.A03(r3, r5)
            X.AIl r8 = r10.A01
            if (r8 == 0) goto L_0x02b1
            X.8Xo r6 = X.C39903AIl.A00(r8)
            X.07f r10 = r8.A06
            X.80U r3 = r8.A09
            X.80T r3 = (X.AnonymousClass80T) r3
            X.80W r5 = r3.A01
            X.0qQ.A0B(r10, r0)
            X.0qQ.A0B(r5, r1)
            X.86D r6 = r6.A02
            java.util.concurrent.atomic.AtomicBoolean r3 = r6.A0L
            r3.set(r0)
            r6.A05 = r5
            X.9jD r3 = new X.9jD
            r3.<init>()
            X.2YN r5 = new X.2YN
            r5.<init>(r3, r10, r7)
            java.lang.Class<X.848> r3 = X.AnonymousClass848.class
            X.2YL r3 = r5.A00(r3)
            X.848 r3 = (X.AnonymousClass848) r3
            r6.A04 = r3
            X.8Xo r3 = X.C39903AIl.A00(r8)
            X.86D r6 = r3.A02
            X.848 r3 = r6.A04
            X.05G r5 = r3.A00
            X.Auu r3 = new X.Auu
            r3.<init>(r6, r5)
            X.0r6 r3 = X.AnonymousClass11E.A01(r3)
            X.Auv r5 = new X.Auv
            r5.<init>(r6, r3)
            X.19B r3 = X.19B.A00
            androidx.lifecycle.CoroutineLiveData r7 = X.C226292g8.A00(r3, r5)
            X.07Z r6 = r8.A04
            r3 = 11
            X.MMs r5 = new X.MMs
            r5.<init>(r8, r3)
            X.Aug r3 = new X.Aug
            r3.<init>(r5)
            r7.A06(r6, r3)
        L_0x02b1:
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r13 = r4.A0j
            r13.A0O = r0
            android.view.ViewGroup r3 = r4.A05
            r3.removeAllViews()
            android.view.ViewGroup r6 = r4.A04
            int r5 = r6.indexOfChild(r13)
            r3 = -1
            if (r5 != r3) goto L_0x02cb
            android.view.ViewGroup r3 = r4.A06
            r6.addView(r3)
            r6.addView(r13)
        L_0x02cb:
            java.lang.String r3 = r9.A0E
            if (r3 != 0) goto L_0x02d9
            java.util.UUID r3 = java.util.UUID.randomUUID()
            java.lang.String r3 = r3.toString()
            r9.A0E = r3
        L_0x02d9:
            com.instagram.common.session.UserSession r3 = r4.A09
            X.2cc r7 = X.C71342cb.A00(r3)
            X.8Fl r6 = r4.A0L
            int r3 = r4.A0m
            int r5 = r3 + 1
            r3 = 0
            r7.A0D(r6, r3, r5)
            X.8QA r5 = r4.A0E
            r5.A04 = r1
            r5.A03 = r0
            X.88F r5 = r4.A0f
            if (r5 == 0) goto L_0x02fa
            X.8va r5 = r5.A03
            if (r5 == 0) goto L_0x02fa
            r5.CLg()
        L_0x02fa:
            boolean r5 = r33.isEmpty()
            r5 = r5 ^ 1
            if (r5 == 0) goto L_0x031b
            boolean r5 = r2 instanceof X.C366378op
            if (r5 != 0) goto L_0x0313
            boolean r5 = r2 instanceof X.C366388oq
            if (r5 == 0) goto L_0x05b4
            r5 = r2
            X.8oq r5 = (X.C366388oq) r5
            if (r5 == 0) goto L_0x05b4
            boolean r5 = r5.A00
            if (r5 != r1) goto L_0x05b4
        L_0x0313:
            r7 = 0
        L_0x0314:
            r6 = r33
            r5 = r18
            A02(r4, r6, r5, r7)
        L_0x031b:
            X.8BA r7 = r4.A0I
            X.8it r8 = r7.A1q
            r8.A02()
            r7.A0d = r1
            X.8Bb r5 = r7.A1k
            if (r5 == 0) goto L_0x032e
            r5.EQQ(r0)
            r5.Ejs(r1)
        L_0x032e:
            X.8CT r10 = r7.A1A
            if (r10 == 0) goto L_0x0374
            X.82o r5 = r7.A14
            X.82Y r5 = r5.A01
            X.8Yz r6 = r5.A0X
            if (r6 == 0) goto L_0x05b1
            X.8aL r5 = X.C358088aL.A0o
            X.8aL[] r5 = new X.C358088aL[]{r5}
            boolean r5 = r6.A0V(r5)
        L_0x0344:
            r10.A01(r5)
            com.instagram.common.session.UserSession r11 = r7.A0v
            X.0qQ.A0B(r11, r0)
            X.0t1 r5 = X.0eE.A00(r11)
            com.instagram.user.model.User r5 = r5.A00()
            X.4Cl r5 = r5.A03
            java.lang.Boolean r5 = r5.COn()
            if (r5 == 0) goto L_0x0362
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x0370
        L_0x0362:
            X.0Tu r9 = X.0Tu.A06
            r5 = 36316800345969292(0x8105f00000128c, double:3.0302290025836986E-306)
            boolean r6 = X.182.A06(r9, r11, r5)
            r5 = 1
            if (r6 != 0) goto L_0x0371
        L_0x0370:
            r5 = 0
        L_0x0371:
            r10.A00(r5)
        L_0x0374:
            X.AnonymousClass8BA.A0E(r7, r0)
            com.instagram.common.session.UserSession r9 = r7.A0v
            java.lang.Integer r16 = X.AnonymousClass05K.A01
            X.8Yz r5 = r7.A0w
            r30 = r5
            X.80m r5 = r5.A08
            java.lang.Object r6 = r5.A00
            X.4yO r6 = (X.C279284yO) r6
            X.1Wr r10 = X.1Wr.A00
            r10.getClass()
            java.lang.String r5 = "QuickCaptureEditController"
            android.location.Location r18 = r10.getLastLocation(r9, r5)
            X.81e r5 = r7.A19
            X.80R r5 = r5.A00
            X.28D r5 = r5.A01
            java.lang.Boolean r27 = java.lang.Boolean.valueOf(r0)
            r24 = 0
            r19 = r5
            r20 = r9
            r21 = r6
            r22 = r27
            r23 = r16
            X.1OC r6 = X.C366758pc.A00(r18, r19, r20, r21, r22, r23, r24)
            X.8pf r5 = new X.8pf
            r5.<init>(r7)
            r6.A00 = r5
            X.1ES.A03(r6)
            X.6if r5 = r7.A1f
            r29 = r5
            java.lang.Object r6 = r29.get()
            X.8Oi r6 = (X.C355038Oi) r6
            boolean r5 = r8.A06()
            r6.En3(r5)
            X.8Bl r12 = r7.A1U
            X.82o r5 = r7.A14
            X.82Y r5 = r5.A01
            X.802 r6 = r5.A02()
            if (r6 == 0) goto L_0x05ae
            java.util.List r11 = r6.A0A
            int r10 = r6.A01
            int r5 = r6.A02
            int[] r8 = new int[]{r5}
            int r6 = r6.A03
            X.8Bm r5 = new X.8Bm
            r5.<init>(r11, r8, r10, r6)
            r5.A00()
        L_0x03e5:
            r12.A00 = r5
            X.AnonymousClass8BA.A07(r7)
            X.6if r5 = r7.A1g
            r28 = r5
            java.lang.Object r6 = r28.get()
            X.8ME r6 = (X.AnonymousClass8ME) r6
            X.8BE r5 = r7.A1K
            X.0qQ.A0B(r5, r0)
            r6.A07 = r5
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r6 = r6.A1m
            boolean r5 = r5.CRa()
            r6.A0T = r5
            X.AnonymousClass8BA.A0G(r7, r1, r0)
            X.8AA r5 = r7.A1V
            X.8Zh r5 = r5.A00()
            r5.Exh()
            X.7vZ r12 = X.C346667vY.A00(r9)
            android.app.Activity r11 = r7.A0n
            X.07i r10 = r7.A0p
            X.8q8 r8 = new X.8q8
            r8.<init>(r7)
            X.0qQ.A0B(r11, r0)
            X.0qQ.A0B(r10, r1)
            boolean r5 = r12.A03
            if (r5 == 0) goto L_0x043a
            long r18 = java.lang.System.currentTimeMillis()
            long r5 = r12.A01
            long r18 = r18 - r5
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.DAYS
            r5 = 3
            long r14 = r14.toMillis(r5)
            int r5 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r5 < 0) goto L_0x046c
        L_0x043a:
            com.instagram.common.session.UserSession r14 = r12.A04
            X.0Tu r15 = X.0Tu.A05
            r5 = 36319901312425678(0x8108c200011ece, double:3.032190066257307E-306)
            boolean r5 = X.182.A06(r15, r14, r5)
            if (r5 == 0) goto L_0x046c
            r5 = -2
            X.1NY r6 = new X.1NY
            r6.<init>(r14, r5)
            r6.A05()
            java.lang.String r5 = "stories/private_stories/share_info/"
            r6.A0A(r5)
            java.lang.Class<X.CFC> r14 = X.CFC.class
            java.lang.Class<X.D0k> r5 = X.C45660D0k.class
            r6.A0O(r3, r14, r5, r0)
            X.1OC r6 = r6.A0M()
            X.9ig r5 = new X.9ig
            r5.<init>(r12, r8)
            r6.A00 = r5
            X.1ES.A00(r11, r10, r6)
        L_0x046c:
            boolean r5 = X.AnonymousClass2o2.A00(r9)
            if (r5 == 0) goto L_0x049e
            X.1vn r10 = X.1vm.A01(r9)
            X.0qQ.A0B(r9, r1)
            java.lang.String r5 = r9.A06
            r18 = r5
            r19 = r0
            r20 = r0
            r21 = r0
            r22 = r0
            r23 = r0
            r24 = r0
            r25 = r0
            r26 = r0
            com.facebook.pando.PandoGraphQLRequest r8 = com.instagram.fanclub.api.FanClubApi.A00(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            X.ASp r6 = new X.ASp
            r6.<init>()
            X.ASX r5 = new X.ASX
            r5.<init>()
            r10.ATL(r5, r6, r8)
        L_0x049e:
            com.instagram.common.gallery.Medium r8 = r7.A04
            if (r8 == 0) goto L_0x0510
            java.lang.String r5 = r8.A0N
            if (r5 == 0) goto L_0x0510
            com.instagram.common.gallery.metadata.MediaUploadMetadata r5 = r8.A0G
            java.lang.String r6 = r5.A03
            if (r6 == 0) goto L_0x0510
            boolean r5 = r8.A0g
            if (r5 == 0) goto L_0x0510
            boolean r5 = X.C379209Sy.A01(r9, r6)
            if (r5 == 0) goto L_0x0510
            X.85o r6 = r7.A11
            boolean r5 = r6.A02
            if (r5 == r1) goto L_0x04c1
            r6.A02 = r1
            X.C3506485o.A00(r6, r0)
        L_0x04c1:
            com.instagram.common.gallery.Medium r5 = r7.A04
            java.lang.String r10 = r5.A0N
            X.0qQ.A0B(r9, r0)
            X.0qQ.A0B(r10, r1)
            r5 = -2
            X.1NY r8 = new X.1NY
            r8.<init>(r9, r5)
            java.lang.String r12 = "api/"
            java.lang.String r11 = "v1/"
            java.lang.String r9 = "media/"
            java.lang.String r6 = "fetch_spotify_preview_url/"
            r5 = r16
            r8.A08(r5)
            r8.A02()
            java.lang.String r5 = X.002.A11(r12, r11, r9, r9, r6)
            X.0qQ.A07(r5)
            r8.A0E = r5
            java.lang.Class<X.CDp> r6 = X.C43797CDp.class
            java.lang.Class<X.CyX> r5 = X.C45559CyX.class
            r8.A0O(r3, r6, r5, r0)
            java.lang.String r6 = "can_play_audio"
            java.lang.String r5 = "true"
            r8.A9m(r6, r5)
            java.lang.String r5 = "attribution_content_url"
            r8.A9m(r5, r10)
            X.1OC r6 = r8.A0M()
            java.lang.String r5 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FetchSpotifyPreviewUrlResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FetchSpotifyPreviewUrlResponse>>"
            X.0qQ.A0C(r6, r5)
            X.9id r5 = new X.9id
            r5.<init>(r7)
            r6.A00 = r5
            X.1ES.A03(r6)
        L_0x0510:
            java.lang.Object r8 = r28.get()
            X.8ME r8 = (X.AnonymousClass8ME) r8
            r5 = r16
            X.AnonymousClass8ME.A0a(r8, r5)
            X.0eK r5 = r8.A1t
            java.lang.Object r5 = r5.get()
            X.8cb r5 = (X.C359318cb) r5
            if (r5 == 0) goto L_0x0527
            r5.A0C = r8
        L_0x0527:
            com.instagram.common.session.UserSession r10 = r8.A0r
            X.0Tu r9 = X.0Tu.A05
            r5 = 36327460454808011(0x810fa2000039cb, double:3.0369704983381174E-306)
            boolean r6 = X.182.A06(r9, r10, r5)
            com.instagram.stickersearch.AvatarStickerPreRenderInteractor r5 = r8.A1j
            X.8q9 r14 = new X.8q9
            r14.<init>(r5)
            X.8Yz r5 = r8.A0t
            X.80m r5 = r5.A08
            java.lang.Object r5 = r5.A00
            boolean r5 = r5 instanceof X.AnonymousClass80O
            if (r5 == 0) goto L_0x05ab
            X.6ny r12 = X.C317866ny.CLIPS
        L_0x0547:
            X.6nw r11 = X.C348197y2.A00(r10)
            if (r6 == 0) goto L_0x05a7
            X.0qQ.A0B(r11, r1)
            X.1tE r6 = X.C67391tE.A00
            X.9KJ r5 = new X.9KJ
            r18 = r5
            r19 = r14
            r20 = r12
            r21 = r11
            r22 = r3
            r23 = r1
            r24 = r0
            r25 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            X.19B r12 = X.19B.A00
            java.lang.Integer r11 = X.AnonymousClass05K.A00
            X.1Eo.A03(r11, r12, r5, r6)
        L_0x056e:
            boolean r5 = X.AnonymousClass8ME.A0v(r8)
            if (r5 == 0) goto L_0x0718
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            X.82p r5 = r8.A13
            X.82o r5 = r5.A02
            java.util.List r5 = r5.A05()
            java.util.Iterator r14 = r5.iterator()
        L_0x058a:
            boolean r5 = r14.hasNext()
            if (r5 == 0) goto L_0x06f3
            java.lang.Object r12 = r14.next()
            X.8nh r12 = (X.C365798nh) r12
            X.8Cl r5 = r12.A02
            if (r5 == 0) goto L_0x058a
            java.lang.String r5 = r5.A06()
            r6.add(r5)
            java.lang.String r5 = r12.A06
            r11.add(r5)
            goto L_0x058a
        L_0x05a7:
            r14.A00(r11, r12)
            goto L_0x056e
        L_0x05ab:
            X.6ny r12 = X.C317866ny.STORIES
            goto L_0x0547
        L_0x05ae:
            r5 = 0
            goto L_0x03e5
        L_0x05b1:
            r5 = 0
            goto L_0x0344
        L_0x05b4:
            r7 = 1
            goto L_0x0314
        L_0x05b7:
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r5 = r10.A0G
            goto L_0x0212
        L_0x05bb:
            X.07f r13 = r10.A07
            java.lang.Object r12 = r7.A00
            X.4yO r12 = (X.C279284yO) r12
            X.8JZ r15 = r10.A0I
            X.82W r11 = r10.A0C
            X.8Ja r8 = r10.A0B
            X.84f r7 = r10.A0D
            X.28D r6 = r10.A00
            android.app.Activity r3 = r10.A05
            android.content.Context r20 = r3.getApplicationContext()
            X.0qQ.A07(r20)
            X.81r r5 = r10.A09
            boolean r14 = r10.A0M
            X.0qQ.A0B(r12, r1)
            r3 = 3
            X.0qQ.A0B(r11, r3)
            r3 = 4
            X.0qQ.A0B(r8, r3)
            r3 = 6
            X.0qQ.A0B(r7, r3)
            r3 = 9
            X.0qQ.A0B(r5, r3)
            r3 = r26
            X.8o0 r28 = X.C365958nx.A00(r3, r12, r14)
            X.8o5 r3 = new X.8o5
            r21 = r6
            r22 = r5
            r23 = r8
            r24 = r11
            r25 = r7
            r27 = r12
            r29 = r15
            r19 = r3
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            X.2YP r6 = X.AnonymousClass2YP.A00
            X.2YN r5 = new X.2YN
            r5.<init>(r3, r13, r6)
            java.lang.Class<X.8o8> r3 = X.C366068o8.class
            X.2YL r12 = r5.A00(r3)
            X.8o8 r12 = (X.C366068o8) r12
            r10.A04 = r12
            X.80U r11 = r10.A0K
            X.0qQ.A0B(r11, r0)
            r14 = r11
            X.80T r14 = (X.AnonymousClass80T) r14
            X.80W r15 = r14.A01
            X.80V r16 = X.AnonymousClass80V.POST_CAPTURE_AR_EFFECT_TRAY
            X.0qQ.A0B(r15, r0)
            java.util.List r6 = java.util.Collections.singletonList(r16)
            X.0qQ.A07(r6)
            X.0r6 r5 = X.AnonymousClass8DX.A00(r15)
            X.8oE r3 = new X.8oE
            r3.<init>(r6, r5)
            X.8oG r7 = new X.8oG
            r7.<init>(r3)
            r13 = 0
            r5 = 12
            X.9Jr r3 = new X.9Jr
            r3.<init>(r12, r13, r5)
            X.0pz r6 = new X.0pz
            r6.<init>(r3, r7)
            r5 = 5
            X.9KD r3 = new X.9KD
            r3.<init>((java.lang.Object) r12, (X.AnonymousClass4D7) r13, (int) r5)
            X.02x r8 = X.10q.A02(r3, r6)
            java.util.List r6 = java.util.Collections.singletonList(r16)
            X.0qQ.A07(r6)
            r7 = 33
            r5 = 42
            X.9K1 r3 = new X.9K1
            r3.<init>((java.lang.Object) r15, (X.AnonymousClass4D7) r13, (int) r7, (int) r5)
            X.032 r5 = X.AnonymousClass0Zq.A00(r3)
            X.8oH r3 = new X.8oH
            r3.<init>(r5)
            X.0r6 r3 = X.AnonymousClass11E.A01(r3)
            X.8oI r5 = new X.8oI
            r5.<init>(r6, r3)
            X.8oJ r3 = new X.8oJ
            r3.<init>(r5)
            X.8oK r6 = new X.8oK
            r6.<init>(r3)
            r5 = 13
            X.9Jr r3 = new X.9Jr
            r3.<init>(r12, r13, r5)
            X.0pz r7 = new X.0pz
            r7.<init>(r3, r6)
            X.80W r3 = r14.A02
            X.0r6 r5 = X.AnonymousClass8DX.A00(r3)
            X.8oL r3 = new X.8oL
            r3.<init>(r5)
            X.0r6 r3 = X.AnonymousClass11E.A01(r3)
            X.8oM r6 = new X.8oM
            r6.<init>(r3)
            r3 = 23
            X.9Jz r5 = new X.9Jz
            r5.<init>(r12, r13, r3)
            X.0pz r3 = new X.0pz
            r3.<init>(r5, r6)
            X.0r6[] r3 = new X.AnonymousClass0r6[]{r8, r7, r3}
            X.055 r7 = X.10q.A04(r3)
            X.6oS r6 = X.C318116oQ.A00(r12)
            X.109 r5 = X.AnonymousClass10A.A00
            X.8oN r3 = X.C366218oN.A00
            X.05F r3 = X.10b.A02(r3, r6, r7, r5)
            r12.A04 = r3
            X.8oY r5 = X.C366068o8.A00(r12)
            X.6oS r3 = X.C318116oQ.A00(r12)
            X.AnonymousClass11O.A03(r3, r5)
            X.6iH r3 = r10.A0J
            r12.A03 = r3
            android.view.View r8 = r10.A06
            X.84q r7 = r10.A0H
            X.4DH r6 = r10.A0A
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r5 = r10.A0G
            X.8oa r3 = new X.8oa
            r21 = r6
            r22 = r6
            r23 = r26
            r24 = r5
            r25 = r7
            r26 = r12
            r27 = r11
            r19 = r3
            r20 = r8
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)
            r10.A02 = r3
            goto L_0x02b1
        L_0x06f3:
            java.util.ArrayList r6 = X.LTZ.A05(r6)
            r5 = 52
            java.lang.String r5 = X.AnonymousClass000.A00(r5)
            X.0qQ.A0C(r6, r5)
            java.lang.String r12 = r8.A1p
            X.0iw r5 = r8.A0o
            java.lang.String r23 = "stories"
            X.LRC r18 = new X.LRC
            r19 = r10
            r20 = r11
            r21 = r12
            r22 = r6
            r24 = r5
            r18.<init>((com.instagram.common.session.UserSession) r19, (java.util.ArrayList) r20, (java.lang.String) r21, (java.util.ArrayList) r22, (java.lang.String) r23, (X.AnonymousClass0iw) r24)
            r18.A01()
        L_0x0718:
            X.85x r5 = r8.A1G
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r5 = r5.A01
            X.0Ud r5 = r5.A0Y
            java.lang.Object r11 = r5.getValue()
            X.8fx r11 = (X.C361278fx) r11
            int r6 = r11.A00
            if (r6 == 0) goto L_0x0758
            r5 = 3
            if (r6 == r5) goto L_0x072e
            r5 = 2
            if (r6 != r5) goto L_0x0758
        L_0x072e:
            java.lang.Object r5 = r11.A00()
            java.util.List r5 = java.util.Collections.singletonList(r5)
            X.0qQ.A07(r5)
        L_0x0739:
            X.AnonymousClass8ME.A0d(r8, r5)
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r5 = r8.A1m
            java.util.List r5 = r5.getAllDrawables()
            java.util.Iterator r11 = r5.iterator()
        L_0x0746:
            boolean r5 = r11.hasNext()
            if (r5 == 0) goto L_0x075e
            java.lang.Object r6 = r11.next()
            android.graphics.drawable.Drawable r6 = (android.graphics.drawable.Drawable) r6
            X.88Z r5 = r8.A1A
            r5.Dn6(r6)
            goto L_0x0746
        L_0x0758:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            goto L_0x0739
        L_0x075e:
            r8.A1P(r1)
            com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel r11 = r8.A11
            X.6nz r6 = r11.A01
            if (r6 == 0) goto L_0x0784
            android.graphics.drawable.Drawable r5 = r11.A00
            if (r5 != 0) goto L_0x077f
            android.content.Context r5 = r8.A0f
            X.6tY r23 = X.C353578Ie.A00(r10)
            r18 = r5
            r19 = r3
            r20 = r3
            r21 = r10
            r22 = r6
            X.7w8 r5 = X.C347017w8.A00(r18, r19, r20, r21, r22, r23)
        L_0x077f:
            r8.Dn1(r5, r6, r3)
            r11.A01 = r3
        L_0x0784:
            X.4yO r6 = r8.A05
            r5 = r17
            if (r6 != r5) goto L_0x07af
            r5 = 36319355851840683(0x81084300051cab, double:3.0318451147869624E-306)
            boolean r5 = X.182.A06(r9, r10, r5)
            if (r5 == 0) goto L_0x07af
            X.4DH r5 = r8.A0l
            X.0xx r11 = X.AnonymousClass07a.A00(r5)
            X.12T r10 = X.AnonymousClass12T.A00
            r6 = 1632833315(0x61530f23, float:2.433346E20)
            r5 = 3
            X.0nV r10 = r10.AOJ(r6, r5)
            r6 = 29
            X.MGu r5 = new X.MGu
            r5.<init>(r8, r3, r6)
            X.1Eo.A05(r10, r5, r11)
        L_0x07af:
            long r5 = java.lang.System.currentTimeMillis()
            r7.A01 = r5
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r5 = r7.A1s
            r5.A0y(r7)
            r7.A0Y()
            r7.A0h(r3)
            X.8CV r10 = r7.A1I
            X.8Yz r6 = r10.A05
            X.8aL r5 = X.C358088aL.A0p
            X.8aL[] r5 = new X.C358088aL[]{r5}
            boolean r5 = r6.A0V(r5)
            if (r5 == 0) goto L_0x07fb
            X.0eM r5 = r10.A07
            java.lang.Object r5 = r5.getValue()
            X.Jc3 r5 = (X.C59939Jc3) r5
            r5.A00()
            X.3oV r8 = r10.A04
            android.view.View r6 = r8.getView()
            android.widget.TextView r6 = (android.widget.TextView) r6
            r5 = 2131972414(0x7f13513e, float:1.9581835E38)
            r6.setText(r5)
            android.view.View r5 = r8.getView()
            r5.setVisibility(r0)
            X.0eM r5 = r10.A06
            java.lang.Object r5 = r5.getValue()
            android.animation.Animator r5 = (android.animation.Animator) r5
            r5.start()
        L_0x07fb:
            X.80D r5 = r7.A18
            X.82n r5 = r5.A12
            if (r5 == 0) goto L_0x0818
            boolean r5 = r5.A04
            if (r5 != 0) goto L_0x0818
            java.lang.Object r5 = r28.get()
            X.8ME r5 = (X.AnonymousClass8ME) r5
            r5.A0b = r1
            X.6if r5 = r5.A1L
            java.lang.Object r5 = r5.get()
            X.JY9 r5 = (X.JY9) r5
            r5.A0O(r0)
        L_0x0818:
            X.88Z r5 = r7.A1J
            r5.DCL()
            java.lang.Object r5 = r29.get()
            X.8Oi r5 = (X.C355038Oi) r5
            r5.EI2()
            java.lang.Object r5 = r29.get()
            X.8Oi r5 = (X.C355038Oi) r5
            r5.EIG()
            X.8aL r5 = X.C358088aL.A0I
            X.8aL[] r6 = new X.C358088aL[]{r5}
            r5 = r30
            boolean r5 = r5.A0V(r6)
            if (r5 == 0) goto L_0x0847
            X.80U r6 = r7.A1M
            X.8VK r5 = new X.8VK
            r5.<init>()
            r6.E3H(r5)
        L_0x0847:
            X.8Cj r5 = r7.A1C
            X.05G r5 = r5.A06
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r1)
            r5.Epw(r10)
            r13.A0S = r1
            android.view.View[] r6 = new android.view.View[]{r13}
            X.2co r5 = X.C315596kB.A02
            r8 = 0
            X.C294975nL.A04(r3, r6, r0)
            X.88A r7 = r4.A0O
            if (r7 == 0) goto L_0x08a9
            X.8aL r5 = X.C358088aL.A0o
            X.8aL[] r6 = new X.C358088aL[]{r5}
            r5 = r32
            boolean r5 = r5.A0V(r6)
            if (r5 == 0) goto L_0x0896
            r5 = r33
            java.lang.Object r5 = r5.get(r0)
            X.8nh r5 = (X.C365798nh) r5
            X.8Cl r6 = r5.A02
            r5 = r33
            java.lang.Object r5 = r5.get(r0)
            X.8nh r5 = (X.C365798nh) r5
            X.7zv r5 = r5.A03
            if (r6 == 0) goto L_0x09cd
            java.lang.String r6 = r6.A06()
            java.io.File r5 = new java.io.File
            r5.<init>(r6)
            X.0qQ.A0B(r5, r0)
            com.instagram.common.gallery.Medium r8 = X.C282665Eg.A03(r5, r1, r0)
        L_0x0896:
            X.9Pb r5 = r7.A05
            X.3oV r6 = r5.A0H
            boolean r5 = r6.CVM()
            if (r5 == 0) goto L_0x08a7
            android.view.View r5 = r6.getView()
            r5.setEnabled(r1)
        L_0x08a7:
            r7.A00 = r8
        L_0x08a9:
            X.86x r6 = r4.A0N
            boolean r5 = r6.A05
            if (r5 == 0) goto L_0x08b2
            r6.A09(r0)
        L_0x08b2:
            r6.A08(r1)
            X.84j r5 = r4.A0Q
            r5.A05(r1)
            r5 = r31
            java.lang.Object r5 = r5.A00
            boolean r5 = r5 instanceof X.AnonymousClass80O
            if (r5 == 0) goto L_0x0a33
            if (r7 != 0) goto L_0x0a33
            X.6if r7 = r4.A0e
            java.lang.Object r6 = r7.get()
            X.8cb r6 = (X.C359318cb) r6
            if (r6 == 0) goto L_0x08d2
            X.8cn r5 = X.C359418cn.A00
            r6.A0H = r5
        L_0x08d2:
            java.lang.Object r8 = r7.get()
            X.8cb r8 = (X.C359318cb) r8
            if (r8 == 0) goto L_0x0a33
            com.instagram.music.common.config.MusicAttributionConfig r7 = r8.A11
            if (r7 == 0) goto L_0x09ca
            com.instagram.pendingmedia.model.ClipInfo r5 = r8.A0G
            if (r5 == 0) goto L_0x09ca
            int r6 = r5.A05
            int r5 = r5.A07
            int r6 = r6 - r5
            com.instagram.music.common.model.AudioOverlayTrack r11 = X.AnonymousClass9ST.A00(r7, r6)
        L_0x08eb:
            com.instagram.common.session.UserSession r7 = r8.A0b
            r12 = 0
            r5 = 36324539877044362(0x810cfa0000308a, double:3.035123513200163E-306)
            boolean r5 = X.182.A06(r9, r7, r5)
            if (r5 == 0) goto L_0x0963
            if (r11 != 0) goto L_0x0963
            androidx.fragment.app.FragmentActivity r5 = r8.A0X
            android.app.Application r5 = r5.getApplication()
            X.0qQ.A07(r5)
            X.82z r6 = X.C3500382y.A00(r5, r7)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r5 = r8.A0s
            java.lang.String r5 = r5.A0S
            X.835 r5 = r6.A00(r5)
            X.0qQ.A0B(r5, r0)
            X.836 r5 = r5.A05
            X.0Ud r5 = r5.A03
            java.lang.Object r5 = r5.getValue()
            X.831 r5 = (X.AnonymousClass831) r5
            java.util.ArrayList r5 = r5.A05()
            java.lang.Object r5 = X.00k.A0J(r5)
            X.51N r5 = (X.AnonymousClass51N) r5
            if (r5 == 0) goto L_0x0963
            com.instagram.common.clips.model.ClipSegment r6 = X.AnonymousClass51Q.A03(r5)
            boolean r5 = r6 instanceof com.instagram.common.clips.model.ClipSegment.VideoSegment
            if (r5 == 0) goto L_0x0936
            r5 = r6
            com.instagram.common.clips.model.ClipSegment$VideoSegment r5 = (com.instagram.common.clips.model.ClipSegment.VideoSegment) r5
            int r12 = r5.A04
        L_0x0936:
            boolean r5 = r6 instanceof com.instagram.common.clips.model.ClipSegment.PhotoSegment
            if (r5 == 0) goto L_0x09c4
            com.instagram.common.clips.model.ClipSegment$PhotoSegment r6 = (com.instagram.common.clips.model.ClipSegment.PhotoSegment) r6
            java.lang.String r6 = r6.A05
        L_0x093e:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)
            X.0eP r14 = new X.0eP
            r14.<init>(r6, r5)
            X.4DH r5 = r8.A0Z
            X.0xx r13 = X.AnonymousClass07a.A00(r5)
            X.12T r12 = X.AnonymousClass12T.A00
            r6 = 1632833315(0x61530f23, float:2.433346E20)
            r5 = 3
            X.0nV r12 = r12.AOJ(r6, r5)
            r5 = 34
            X.9Jz r6 = new X.9Jz
            r6.<init>((java.lang.Object) r8, (java.lang.Object) r14, (X.AnonymousClass4D7) r3, (int) r5)
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            X.1Eo.A03(r5, r12, r6, r13)
        L_0x0963:
            boolean r5 = X.AnonymousClass30D.A08(r7)
            if (r5 == 0) goto L_0x09c0
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r5 = r8.A0s
            boolean r5 = r5.A0n()
            if (r5 != 0) goto L_0x09c0
            X.87s r5 = r8.A0u
            X.4gw r5 = r5.A04
            if (r5 != 0) goto L_0x09c0
            X.2cc r5 = X.C71342cb.A00(r7)
            java.lang.String r12 = r5.A05
            java.lang.String r6 = ""
            java.util.regex.Pattern r5 = X.0mp.A00
            if (r12 != 0) goto L_0x0984
            r12 = r6
        L_0x0984:
            X.1QK r5 = X.1QK.A09
            java.lang.String r5 = r5.toString()
            boolean r5 = X.0qQ.A0K(r12, r5)
            if (r5 == 0) goto L_0x09c0
            r5 = 36319257067527260(0x81082c00041c5c, double:3.031782643189381E-306)
            boolean r5 = X.182.A06(r9, r7, r5)
            if (r5 == 0) goto L_0x09c0
            X.8IA r12 = r8.A0o
            X.05G r6 = r12.A01
            X.8IB r5 = X.AnonymousClass8IB.A00
            r6.Epw(r5)
            X.6oS r11 = X.C318116oQ.A00(r12)
            r5 = 19
            X.MG0 r6 = new X.MG0
            r6.<init>(r12, r3, r5)
            X.19B r5 = X.19B.A00
            X.1Eo.A05(r5, r6, r11)
        L_0x09b4:
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r6 = r8.A13
            X.88G r5 = r8.A12
            r6.A0y(r5)
            r12 = 1
            X.C394749yd.A00(r6, r1)
            goto L_0x09dd
        L_0x09c0:
            X.C359318cb.A0C(r8, r11)
            goto L_0x09b4
        L_0x09c4:
            com.instagram.common.clips.model.ClipSegment$VideoSegment r6 = (com.instagram.common.clips.model.ClipSegment.VideoSegment) r6
            java.lang.String r6 = r6.A0E
            goto L_0x093e
        L_0x09ca:
            r11 = r3
            goto L_0x08eb
        L_0x09cd:
            if (r5 == 0) goto L_0x0896
            java.lang.String r5 = r5.A0k
            java.io.File r6 = new java.io.File
            r6.<init>(r5)
            r5 = 3
            com.instagram.common.gallery.Medium r8 = X.C282665Eg.A03(r6, r5, r0)
            goto L_0x0896
        L_0x09dd:
            android.view.View r5 = r8.A0U     // Catch:{ Exception -> 0x09e7 }
            android.view.View[] r5 = new android.view.View[]{r5}     // Catch:{ Exception -> 0x09e7 }
            X.C294975nL.A04(r3, r5, r0)     // Catch:{ Exception -> 0x09e7 }
            goto L_0x09f4
        L_0x09e7:
            r11 = move-exception
            java.lang.String r6 = "ClipsPostCaptureController"
            java.lang.String r5 = "major issue showing reels post capture controls"
            X.0kD.A07(r6, r5, r3)
            java.lang.String r5 = "failed to show reels post capture"
            X.0KC.A0F(r6, r5, r11)
        L_0x09f4:
            com.instagram.common.ui.widget.imageview.IgImageView r5 = r8.A07
            if (r5 != 0) goto L_0x0a05
            android.view.View r6 = r8.A0U
            r5 = 2131430177(0x7f0b0b21, float:1.8482048E38)
            android.view.View r5 = r6.requireViewById(r5)
            com.instagram.common.ui.widget.imageview.IgImageView r5 = (com.instagram.common.ui.widget.imageview.IgImageView) r5
            r8.A07 = r5
        L_0x0a05:
            android.view.View r6 = r8.A0U
            r5 = 2131437975(0x7f0b2997, float:1.8497864E38)
            android.view.View r6 = r6.requireViewById(r5)
            X.0qQ.A07(r6)
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r5 = r8.A0f
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r5 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r5
            X.81W r5 = r5.A0K
            int r5 = r5.getHeight()
            X.0nA.A0V(r6, r5)
            X.9mp r5 = X.C387819mp.A00
            if (r2 != r5) goto L_0x0a9b
            X.9rv r1 = X.C390839rv.MID_CAPTURE
            r8.A0N(r1)
        L_0x0a27:
            X.8qK r6 = new X.8qK
            r6.<init>(r7)
            android.content.Context r5 = r8.A0S
            X.8qM r1 = X.C367208qM.A05
            r6.A00(r5, r7, r1)
        L_0x0a33:
            X.87i r5 = r4.A0C
            X.8Yz r1 = r5.A0O
            X.80m r1 = r1.A08
            java.lang.Object r1 = r1.A00
            boolean r1 = r1 instanceof X.AnonymousClass80O
            if (r1 == 0) goto L_0x0a95
            X.87s r1 = r5.A0S
            X.4gw r1 = r1.A04
            if (r1 == 0) goto L_0x0a8f
            r5.A06()
        L_0x0a48:
            X.87q r0 = r5.A0V
            r0.A00()
        L_0x0a4d:
            X.8Hx r0 = r4.A0a
            r0.DCL()
            boolean r0 = r2 instanceof X.C367128qE
            if (r0 == 0) goto L_0x0a7a
            r0 = r2
            X.8qE r0 = (X.C367128qE) r0
            if (r0 == 0) goto L_0x0a7a
            java.lang.String r7 = r0.A00
            if (r7 == 0) goto L_0x0a7a
            X.12T r5 = X.AnonymousClass12T.A00
            r1 = 1566600651(0x5d606dcb, float:1.01073781E18)
            r0 = 3
            X.0nV r0 = r5.AOJ(r1, r0)
            X.19S r6 = X.19E.A02(r0)
            r0 = 2
            X.9KW r5 = new X.9KW
            r5.<init>(r4, r7, r3, r0)
            X.19B r1 = X.19B.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.1Eo.A03(r0, r1, r5, r6)
        L_0x0a7a:
            boolean r0 = r2 instanceof X.C367138qF
            if (r0 == 0) goto L_0x0a8e
            X.8qF r2 = (X.C367138qF) r2
            if (r2 == 0) goto L_0x0a8e
            android.graphics.Bitmap r1 = r2.A00
            if (r1 == 0) goto L_0x0a8e
            X.Amc r0 = new X.Amc
            r0.<init>(r1, r4)
            X.11Z.A02(r0)
        L_0x0a8e:
            return
        L_0x0a8f:
            X.87n r1 = r5.A0P
            r1.A02(r0)
            goto L_0x0a48
        L_0x0a95:
            X.87n r0 = r5.A0P
            r0.A01()
            goto L_0x0a4d
        L_0x0a9b:
            boolean r5 = r2 instanceof X.C366388oq
            if (r5 == 0) goto L_0x0ab9
            X.9rv r25 = X.C390839rv.POST_CAPTURE
            X.80U r6 = r8.A0l
            X.8Sz r5 = new X.8Sz
            r26 = r10
            r28 = r27
            r29 = r3
            r30 = r0
            r31 = r1
            r24 = r5
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
            r6.E3H(r5)
            goto L_0x0a27
        L_0x0ab9:
            X.9Tf r1 = X.C379279Tf.A00
            if (r2 == r1) goto L_0x0a27
            boolean r1 = r2 instanceof X.C366378op
            if (r1 == 0) goto L_0x0ae8
            X.9rv r25 = X.C390839rv.POST_CAPTURE
            r1 = r2
            X.8op r1 = (X.C366378op) r1
            if (r1 == 0) goto L_0x0ae6
            boolean r1 = r1.A00
            if (r1 != 0) goto L_0x0ae6
        L_0x0acc:
            java.lang.Boolean r26 = java.lang.Boolean.valueOf(r12)
            X.80U r5 = r8.A0l
            X.8Sz r1 = new X.8Sz
            r28 = r27
            r29 = r3
            r30 = r0
            r31 = r0
            r24 = r1
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
            r5.E3H(r1)
            goto L_0x0a27
        L_0x0ae6:
            r12 = 0
            goto L_0x0acc
        L_0x0ae8:
            X.9mw r1 = X.C387889mw.A00
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0b1f
            boolean r1 = r2 instanceof X.C387799mn
            if (r1 != 0) goto L_0x0b1f
            boolean r1 = r2 instanceof X.C367138qF
            if (r1 != 0) goto L_0x0b1f
            X.9mq r1 = X.C387829mq.A00
            if (r2 == r1) goto L_0x0a27
            X.9mu r11 = X.C387869mu.A00
            if (r2 == r11) goto L_0x0b04
            X.9mv r1 = X.C387879mv.A00
            if (r2 != r1) goto L_0x0b45
        L_0x0b04:
            r5 = 36320043046412175(0x8108e300021f8f, double:3.0322796994010844E-306)
            boolean r1 = X.182.A06(r9, r7, r5)
            if (r1 == 0) goto L_0x0b45
            X.9rv r1 = X.C390839rv.POST_CAPTURE
            r8.A0N(r1)
        L_0x0b14:
            X.27r r5 = X.27p.A01(r7)
            X.4yP r1 = X.C279294yP.CLIPS
            r5.A0w(r1)
            goto L_0x0a27
        L_0x0b1f:
            X.9rv r11 = X.C390839rv.POST_CAPTURE
            boolean r9 = r2 instanceof X.C387799mn
            if (r9 == 0) goto L_0x0b43
            r1 = r2
            X.9mn r1 = (X.C387799mn) r1
            if (r1 == 0) goto L_0x0b43
            java.lang.Integer r6 = r1.A00
        L_0x0b2c:
            X.80U r5 = r8.A0l
            X.8Sz r1 = new X.8Sz
            r10 = r1
            r12 = r27
            r13 = r12
            r14 = r12
            r15 = r6
            r16 = r9
            r17 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r5.E3H(r1)
            if (r9 != 0) goto L_0x0a27
            goto L_0x0b14
        L_0x0b43:
            r6 = r3
            goto L_0x0b2c
        L_0x0b45:
            if (r2 != r11) goto L_0x0b52
            r5 = 36316959260087005(0x810615000512dd, double:3.030329500511636E-306)
            boolean r1 = X.182.A06(r9, r7, r5)
            if (r1 != 0) goto L_0x0b61
        L_0x0b52:
            X.9mv r1 = X.C387879mv.A00
            if (r2 != r1) goto L_0x0b66
            r5 = 36316959260152542(0x810615000612de, double:3.030329500553082E-306)
            boolean r1 = X.182.A06(r9, r7, r5)
            if (r1 == 0) goto L_0x0b66
        L_0x0b61:
            X.C359318cb.A0A(r8)
            goto L_0x0a27
        L_0x0b66:
            X.9ms r1 = X.C387849ms.A00
            if (r2 != r1) goto L_0x0b83
            X.9rv r12 = X.C390839rv.POST_CAPTURE
            X.80U r5 = r8.A0l
            X.8Sz r1 = new X.8Sz
            r11 = r1
            r13 = r27
            r14 = r13
            r15 = r10
            r16 = r3
            r17 = r0
            r18 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r5.E3H(r1)
            goto L_0x0a27
        L_0x0b83:
            X.C359318cb.A08(r8)
            goto L_0x0a27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8S5.A05(X.8Ia, java.util.List, java.util.List):void");
    }

    public final AnonymousClass3M8 Bx5() {
        return (AnonymousClass3M8) this.A0q.getValue();
    }

    /* JADX WARNING: type inference failed for: r0v171, types: [java.lang.Object, X.2jA] */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x09b0, code lost:
        if (r9 == X.AnonymousClass80X.SUB_FRAGMENT) goto L_0x09b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0a59, code lost:
        if (r12.CKM() != false) goto L_0x0a5b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void Dmx(java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
        /*
            r19 = this;
            r11 = r22
            r7 = r21
            r9 = r20
            X.80X r9 = (X.AnonymousClass80X) r9
            X.80X r7 = (X.AnonymousClass80X) r7
            r6 = 0
            X.0qQ.A0B(r9, r6)
            r5 = 1
            X.0qQ.A0B(r7, r5)
            r10 = 2
            X.0qQ.A0B(r11, r10)
            int r0 = r9.ordinal()
            r18 = 1
            r8 = r19
            if (r0 == r5) goto L_0x0449
            if (r0 != r10) goto L_0x0723
            com.instagram.common.session.UserSession r2 = r8.A09
            X.1Av r0 = X.1Au.A00(r2)
            X.0xa r0 = r0.A01
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "pending_capture_intent_capture_mode"
            r1.ED3(r0)
            java.lang.String r0 = "pending_capture_intent_media_type"
            r1.ED3(r0)
            java.lang.String r0 = "pending_capture_intent_is_reply"
            r1.ED3(r0)
            r1.apply()
            X.1Av r0 = X.1Au.A00(r2)
            java.lang.String r3 = ""
            X.0xa r0 = r0.A01
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "captured_media_recovery_info"
            r1.E5g(r0, r3)
            r1.apply()
            X.82p r0 = r8.A0M
            X.82o r0 = r0.A02
            r17 = r0
            X.82Y r0 = r0.A01
            r0.A0L = r6
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r0 = r8.A0j
            r0.A0S = r6
            X.88A r0 = r8.A0O
            if (r0 == 0) goto L_0x0077
            X.9Pb r0 = r0.A05
            X.3oV r1 = r0.A0H
            boolean r0 = r1.CVM()
            if (r0 == 0) goto L_0x0077
            android.view.View r0 = r1.getView()
            r0.setEnabled(r6)
        L_0x0077:
            X.847 r0 = r8.A07
            r0.A00 = r6
            java.lang.Class<X.9UB> r1 = X.AnonymousClass9UB.class
            X.9UC r0 = new X.9UC
            r0.<init>(r2)
            java.lang.Object r0 = r2.A01(r1, r0)
            X.9UB r0 = (X.AnonymousClass9UB) r0
            X.AnonymousClass9UB.A00(r0)
            X.8BA r2 = r8.A0I
            X.8AA r0 = r2.A1V
            X.8Zh r0 = r0.A00()
            r0.EyM()
            X.6if r3 = r2.A1g
            boolean r0 = r3.A03
            if (r0 == 0) goto L_0x00be
            java.lang.Object r4 = r3.get()
            X.8ME r4 = (X.AnonymousClass8ME) r4
            X.8N2 r1 = r4.A0u
            if (r1 == 0) goto L_0x00b9
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r4.A1H
            boolean r0 = r0.A0o()
            if (r0 == 0) goto L_0x00b9
            X.0eM r0 = r1.A0F
            java.lang.Object r0 = r0.getValue()
            com.instagram.creation.capture.assetpicker.cutout.data.CutoutStickerRepository r0 = (com.instagram.creation.capture.assetpicker.cutout.data.CutoutStickerRepository) r0
            r0.A01()
        L_0x00b9:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r4.A1H
            r0.A0P()
        L_0x00be:
            long r14 = java.lang.System.currentTimeMillis()
            long r0 = r2.A01
            long r14 = r14 - r0
            X.80U r0 = r2.A1M
            boolean r0 = r0.CZe()
            if (r0 == 0) goto L_0x00ff
            r12 = 3000(0xbb8, double:1.482E-320)
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x00ff
            X.1Wj r0 = X.1Wj.A00
            if (r0 == 0) goto L_0x00ff
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            com.instagram.common.session.UserSession r12 = r2.A0v
            java.lang.String r1 = r12.A06
            java.lang.String r0 = "user_id"
            r13.put(r0, r1)
            X.82o r0 = r2.A14
            X.82Y r0 = r0.A01
            java.lang.String r1 = r0.A0F
            X.0qQ.A07(r1)
            java.lang.String r0 = "camera_session_id"
            r13.put(r0, r1)
            X.1Wj r4 = X.1Wj.A00
            r4.getClass()
            android.app.Activity r1 = r2.A0n
            java.lang.String r0 = "483099319748724"
            r4.A00(r1, r12, r0, r13)
        L_0x00ff:
            boolean r0 = r3.A03
            if (r0 == 0) goto L_0x010d
            android.app.Activity r1 = r2.A0n
            X.9UL r0 = new X.9UL
            r0.<init>(r2)
            r1.runOnUiThread(r0)
        L_0x010d:
            boolean r0 = r3.A03
            if (r0 == 0) goto L_0x011b
            android.app.Activity r1 = r2.A0n
            X.9UK r0 = new X.9UK
            r0.<init>(r2)
            r1.runOnUiThread(r0)
        L_0x011b:
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r0 = r2.A1s
            r0.A0z(r2)
            X.8CV r4 = r2.A1I
            X.8Yz r1 = r4.A05
            X.8aL r0 = X.C358088aL.A0p
            X.8aL[] r0 = new X.C358088aL[]{r0}
            boolean r0 = r1.A0V(r0)
            if (r0 == 0) goto L_0x0175
            X.0eM r0 = r4.A07
            java.lang.Object r3 = r0.getValue()
            X.Jc3 r3 = (X.C59939Jc3) r3
            X.4Co r1 = r3.A00
            if (r1 == 0) goto L_0x0140
            r0 = 0
            r1.AG7(r0)
        L_0x0140:
            com.instagram.common.ui.base.IgTextView r1 = r3.A05
            r0 = 8
            r1.setVisibility(r0)
            X.0eM r3 = r4.A06
            java.lang.Object r0 = r3.getValue()
            android.animation.Animator r0 = (android.animation.Animator) r0
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x0175
            java.lang.Object r0 = r3.getValue()
            android.animation.Animator r0 = (android.animation.Animator) r0
            r0.removeAllListeners()
            java.lang.Object r1 = r3.getValue()
            android.animation.Animator r1 = (android.animation.Animator) r1
            X.AJD r0 = new X.AJD
            r0.<init>(r4)
            r1.addListener(r0)
            java.lang.Object r0 = r3.getValue()
            android.animation.Animator r0 = (android.animation.Animator) r0
            r0.cancel()
        L_0x0175:
            X.88Z r0 = r2.A1J
            r0.DDQ()
            X.8Ce r3 = r2.A1N
            X.05G r0 = r3.A03
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            r0.Epw(r1)
            X.05G r0 = r3.A05
            r0.Epw(r1)
            X.05G r0 = r3.A04
            r0.Epw(r1)
            X.05G r0 = r3.A06
            X.0sn r3 = X.0sn.A00
            r0.Epw(r3)
            X.8Cj r0 = r2.A1C
            X.05G r0 = r0.A06
            r0.Epw(r1)
            X.8FK r0 = r8.A0P
            X.81C r0 = r0.A00
            X.81E r4 = r0.A00()
            X.8FL r4 = (X.AnonymousClass8FL) r4
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r1 = r4.A0L
            android.graphics.drawable.Drawable r0 = r4.A05
            r1.A0S(r0)
            r2 = 0
            r4.A05 = r2
            r4.A02()
            X.87i r0 = r4.A0I
            r0.A08()
            X.8Yz r4 = r4.A0H
            X.80m r0 = r4.A08
            java.lang.Object r1 = r0.A00
            X.9QA r0 = X.AnonymousClass9QA.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01cc
            X.8aL r0 = X.C358088aL.A0D
            r4.A0M(r0)
        L_0x01cc:
            X.8H5 r4 = r8.A0X
            X.87i r1 = r4.A07
            boolean r0 = r1.A0B()
            if (r0 == 0) goto L_0x01d9
            r1.A06()
        L_0x01d9:
            android.graphics.drawable.Drawable r1 = r4.A00
            if (r1 == 0) goto L_0x01e4
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r0 = r4.A0A
            r0.A0S(r1)
            r4.A00 = r2
        L_0x01e4:
            X.8H7 r13 = r8.A0W
            X.80U r0 = r8.A0Z
            r16 = r0
            X.80X r0 = r16.Ats()
            X.0qQ.A0B(r0, r6)
            X.80X r15 = X.AnonymousClass80X.UNINITIALIZED
            if (r0 != r15) goto L_0x0214
            android.app.Activity r0 = r13.A04
            X.0qQ.A06(r0)
            android.app.Activity r14 = X.C61270mF.A00(r0)
            r12 = -1
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.io.File r1 = r13.A02
            r0 = 0
            if (r1 == 0) goto L_0x020d
            android.net.Uri r0 = android.net.Uri.fromFile(r1)
        L_0x020d:
            android.content.Intent r0 = r4.setData(r0)
            r14.setResult(r12, r0)
        L_0x0214:
            android.graphics.drawable.Drawable r1 = r13.A00
            if (r1 == 0) goto L_0x021f
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r0 = r13.A08
            r0.A0S(r1)
            r13.A00 = r2
        L_0x021f:
            X.8H9 r14 = r8.A0T
            X.80X r0 = r16.Ats()
            X.0qQ.A0B(r0, r6)
            if (r0 != r15) goto L_0x0249
            android.app.Activity r0 = r14.A04
            X.0qQ.A06(r0)
            android.app.Activity r13 = X.C61270mF.A00(r0)
            r12 = -1
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.io.File r1 = r14.A02
            r0 = 0
            if (r1 == 0) goto L_0x0242
            android.net.Uri r0 = android.net.Uri.fromFile(r1)
        L_0x0242:
            android.content.Intent r0 = r4.setData(r0)
            r13.setResult(r12, r0)
        L_0x0249:
            android.graphics.drawable.Drawable r1 = r14.A00
            if (r1 == 0) goto L_0x0254
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r0 = r14.A08
            r0.A0S(r1)
            r14.A00 = r2
        L_0x0254:
            X.8Fg r4 = r8.A0V
            X.80X r12 = r16.Ats()
            X.0qQ.A0B(r12, r6)
            X.8Yz r0 = r4.A06
            X.80m r0 = r0.A08
            java.lang.Object r1 = r0.A00
            X.80J r0 = X.AnonymousClass80J.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0297
            if (r12 != r15) goto L_0x028c
            android.app.Activity r0 = r4.A04
            X.0qQ.A06(r0)
            android.app.Activity r13 = X.C61270mF.A00(r0)
            r12 = -1
            android.content.Intent r14 = new android.content.Intent
            r14.<init>()
            java.io.File r1 = r4.A02
            r0 = 0
            if (r1 == 0) goto L_0x0285
            android.net.Uri r0 = android.net.Uri.fromFile(r1)
        L_0x0285:
            android.content.Intent r0 = r14.setData(r0)
            r13.setResult(r12, r0)
        L_0x028c:
            android.graphics.drawable.Drawable r1 = r4.A00
            if (r1 == 0) goto L_0x0297
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r0 = r4.A09
            r0.A0S(r1)
            r4.A00 = r2
        L_0x0297:
            X.8nd r0 = r17.A01()
            int r0 = r0.ordinal()
            if (r0 == r6) goto L_0x0347
            if (r0 != r5) goto L_0x02e4
            X.8LU r1 = r8.A0J
            r1.A0I()
            X.0eM r0 = r1.A14
            java.lang.Object r0 = r0.getValue()
            X.2nK r0 = (X.C229402nK) r0
            r0.onPause()
            r1.A0O = r6
            X.AnonymousClass8LU.A09(r1)
            r1.A07 = r2
            X.8Lz r12 = r1.A0n
            X.80G r4 = r1.A04
            android.view.ViewGroup r1 = r1.A0X
            X.0qQ.A0B(r4, r6)
            X.0qQ.A0B(r1, r5)
            android.view.View r0 = r4.A05()
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x02d7
            android.view.View r0 = r4.A05()
            r0.setVisibility(r6)
        L_0x02d7:
            X.9Xt r0 = r12.A02
            if (r0 == 0) goto L_0x02e4
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 == 0) goto L_0x02e4
            X.C354428Lz.A00(r1, r4, r12)
        L_0x02e4:
            X.8QN r4 = r8.A0F
            r4.A09 = r6
            android.view.View r1 = r4.A0C
            java.lang.Runnable r0 = r4.A0h
            r1.removeCallbacks(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r4.A03
            if (r0 == 0) goto L_0x02fd
            r0.A09()
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r4.A03
            r0 = 8
            r1.setVisibility(r0)
        L_0x02fd:
            X.8LU r0 = r4.A0O
            X.8M8 r0 = r0.A0x
            r0.A00()
            X.8QZ r0 = r4.A0c
            r0.A0A(r6)
            X.8QP r0 = r4.A0Y
            r0.clear()
            X.8QA r0 = r4.A0K
            java.util.Set r0 = r0.A0N
            r0.remove(r4)
            X.2eb r1 = r4.A0J
            r0 = 8
            r1.A03(r0)
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r0 = r4.A0H
            r0.CNi(r2)
            X.8QA r12 = r8.A0E
            r12.A04 = r6
            r12.A03 = r6
            r12.A05 = r6
            r12.A02 = r6
            r12.A01 = r6
            r12.A00 = r2
            java.util.Queue r4 = r12.A0M
            java.util.Iterator r1 = r4.iterator()
        L_0x0335:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x035b
            java.lang.Object r0 = r1.next()
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto L_0x0335
            r0.recycle()
            goto L_0x0335
        L_0x0347:
            X.8K4 r1 = r8.A0G
            X.AnonymousClass8K4.A06(r1)
            X.0eM r0 = r1.A0k
            java.lang.Object r0 = r0.getValue()
            X.2nK r0 = (X.C229402nK) r0
            r0.onPause()
            X.AnonymousClass8K4.A07(r1)
            goto L_0x02e4
        L_0x035b:
            r4.clear()
            X.8QE r0 = r12.A0H
            java.util.HashMap r0 = r0.A00
            r0.clear()
            java.util.Map r0 = r12.A0L
            r0.clear()
            java.util.Map r0 = r12.A0K
            r0.clear()
            X.8K4 r0 = r12.A0A
            r0.A0H()
            X.8LU r4 = r12.A0C
            boolean r1 = r12.A0O
            X.AnonymousClass8LU.A09(r4)
            X.8Jb r0 = r4.A0q
            X.8o8 r0 = r0.A04
            if (r0 == 0) goto L_0x0384
            r0.A02()
        L_0x0384:
            X.85o r0 = r4.A0j
            r0.A03(r1)
            r4.A0A = r2
            X.8QF r0 = r12.A09
            java.util.Map r0 = r0.A00
            r0.clear()
            X.87i r0 = r8.A0C
            r0.A07()
            X.6if r0 = r8.A0e
            java.lang.Object r1 = r0.get()
            X.8cb r1 = (X.C359318cb) r1
            if (r1 == 0) goto L_0x0400
            android.view.View r0 = r1.A0U
            android.view.View[] r0 = new android.view.View[]{r0}
            X.C294975nL.A05(r0, r6)
            android.os.Handler r0 = r1.A0T
            r0.removeCallbacksAndMessages(r2)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r12 = r1.A0s
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r0 = r12.A0K
            X.83A r4 = r0.A0A
            java.util.Map r0 = r4.A02
            r0.clear()
            X.AnonymousClass83A.A00(r4, r0)
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r4 = r1.A13
            X.88G r0 = r1.A12
            r4.A0z(r0)
            X.8Xk r0 = r1.A0B
            if (r0 == 0) goto L_0x03cb
            r0.A04(r6)
        L_0x03cb:
            X.0Ud r0 = r12.A0c
            java.lang.Object r0 = r0.getValue()
            X.831 r0 = (X.AnonymousClass831) r0
            java.util.List r0 = r0.A01
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0400
            X.0eM r4 = r1.A1B
            boolean r0 = r4.CVQ()
            if (r0 == 0) goto L_0x0400
            java.lang.Object r0 = r4.getValue()
            X.Hrl r0 = (X.C56038Hrl) r0
            if (r0 == 0) goto L_0x0447
            X.9rn r1 = r0.A00()
        L_0x03ef:
            X.9rn r0 = X.C390759rn.AssetHubCutoutTextSticker
            if (r1 != r0) goto L_0x0400
            java.lang.Object r1 = r4.getValue()
            X.Hrl r1 = (X.C56038Hrl) r1
            if (r1 == 0) goto L_0x0400
            X.9rn r0 = X.C390759rn.None
            r1.A01(r0)
        L_0x0400:
            X.8An r13 = r8.A0g
            r13.A07 = r2
            X.0eM r0 = r13.A0A
            java.lang.Object r0 = r0.getValue()
            com.instagram.creation.genai.magicmod.data.MagicModImageGenerationDataSource r0 = (com.instagram.creation.genai.magicmod.data.MagicModImageGenerationDataSource) r0
            com.instagram.genai.imageservice.service.SingleFlightWithCache r1 = r0.A02
            X.4HW r0 = r1.A00
            r0.A01()
            java.util.concurrent.ConcurrentHashMap r0 = r1.A01
            r0.clear()
            X.0eM r0 = r13.A0B
            java.lang.Object r12 = r0.getValue()
            X.HDl r12 = (X.C54436HDl) r12
            java.util.Map r0 = r12.A03
            r0.clear()
            java.util.Map r14 = r12.A04
            java.util.Collection r0 = r14.values()
            java.util.Iterator r15 = r0.iterator()
        L_0x042f:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0693
            java.lang.Object r4 = r15.next()
            X.Hzi r4 = (X.C56511Hzi) r4
            r4.A01 = r2
            X.05G r1 = r4.A02
            X.62M r0 = X.AnonymousClass62M.A01
            r1.Epw(r0)
            r4.A00 = r2
            goto L_0x042f
        L_0x0447:
            r1 = 0
            goto L_0x03ef
        L_0x0449:
            boolean r0 = r11 instanceof X.AnonymousClass8VP
            r2 = 0
            if (r0 == 0) goto L_0x0455
            r0 = r11
            X.8VP r0 = (X.AnonymousClass8VP) r0
            if (r0 == 0) goto L_0x0455
            X.8Ia r2 = r0.A00
        L_0x0455:
            boolean r0 = r11 instanceof X.AnonymousClass8VO
            r17 = r0
            X.8E5 r0 = r8.A0S
            X.8Zl r0 = r0.A00()
            r0.DDR()
            X.8E6 r0 = r8.A0Y
            if (r0 == 0) goto L_0x046f
            X.B3Y r0 = r0.A00()
            if (r0 == 0) goto L_0x046f
            r0.DDR()
        L_0x046f:
            X.8BA r0 = r8.A0I
            X.8AE r0 = r0.A1W
            X.8Zh r0 = r0.A00()
            r0.EyM()
            X.8Hx r0 = r8.A0a
            r0.DDR()
            X.8hH r0 = r8.A01
            if (r0 == 0) goto L_0x0486
            r0.DDR()
        L_0x0486:
            X.8Fe r3 = r8.A0i
            X.872 r0 = r3.A08
            r0.A0C()
            r1 = 8
            X.9LV r0 = new X.9LV
            r0.<init>(r3, r1)
            X.C352828Fe.A00(r3, r0)
            X.8ic r13 = r8.A00
            if (r13 == 0) goto L_0x055c
            float r1 = r13.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x055c
            X.9Tf r0 = X.C379279Tf.A00
            if (r2 != r0) goto L_0x068e
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r1 < r0) goto L_0x068e
            X.Aiz r16 = new X.Aiz
            r0 = r16
            r0.<init>(r8)
            android.view.ViewGroup r15 = r13.A0B
            android.content.Context r2 = r15.getContext()
            r0 = 17170444(0x106000c, float:2.4611947E-38)
            int r0 = r2.getColor(r0)
            r15.setBackgroundColor(r0)
            r1 = 2131955479(0x7f130f17, float:1.9547487E38)
            X.85O r14 = r13.A0F
            java.lang.Integer r0 = r14.A00
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r12 = r2.getString(r1, r0)
            X.0qQ.A07(r12)
            android.transition.TransitionInflater r1 = android.transition.TransitionInflater.from(r2)
            r0 = 17760257(0x10f0001, float:2.6264955E-38)
            android.transition.Transition r0 = r1.inflateTransition(r0)
            if (r0 == 0) goto L_0x068e
            android.transition.TransitionSet r4 = new android.transition.TransitionSet
            r4.<init>()
            android.transition.Fade r1 = new android.transition.Fade
            r1.<init>()
            r1.excludeTarget(r12, r5)
            r0.addTarget(r12)
            android.transition.TransitionSet r0 = r4.addTransition(r0)
            r0.addTransition(r1)
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r2)
            r0 = 2131625876(0x7f0e0794, float:1.8878972E38)
            android.view.View r3 = r1.inflate(r0, r15, r6)
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.ImageView"
            X.0qQ.A0C(r3, r0)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            java.lang.ref.WeakReference r0 = r14.A01
            java.lang.Object r2 = r0.get()
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 == 0) goto L_0x052e
            int r0 = r2.getWidth()
            float r1 = (float) r0
            int r0 = r2.getHeight()
            float r0 = (float) r0
            float r1 = r1 / r0
            r0 = 1058013184(0x3f100000, float:0.5625)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x052b
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            r3.setScaleType(r0)
        L_0x052b:
            r3.setImageBitmap(r2)
        L_0x052e:
            r3.setTransitionName(r12)
            android.transition.Scene r1 = new android.transition.Scene
            r1.<init>(r15, r3)
            X.APp r2 = new X.APp
            r0 = r16
            r2.<init>(r13, r0)
            r13.A02 = r2
            X.05G r2 = r14.A0B
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r2.Epw(r0)
            X.2Fk r2 = r14.A02
            X.2gO r0 = r13.A02
            if (r0 == 0) goto L_0x0b9e
            r2.A09(r0)
            X.ALj r0 = new X.ALj
            r0.<init>(r4, r13)
            r4.addListener(r0)
            android.transition.TransitionManager.go(r1, r4)
        L_0x055c:
            X.88F r3 = r8.A0f
            if (r3 == 0) goto L_0x0599
            X.9oE r12 = r3.A0K
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r4 = r3.A0N
            boolean r0 = r12 instanceof X.C388679oD
            if (r0 == 0) goto L_0x0587
            X.9oD r12 = (X.C388679oD) r12
            X.8va r0 = r12.A02
            if (r0 == 0) goto L_0x0585
            int r2 = r12.A00
            X.804 r0 = r12.A03
            boolean r0 = r0 instanceof X.AnonymousClass803
            r1 = r0 ^ 1
            X.B3f r0 = com.instagram.ui.widget.interactive.InteractiveDrawableContainer.A02(r4, r2)
            if (r0 == 0) goto L_0x0580
            X.9Qs r0 = (X.C378669Qs) r0
            r0.A0O = r1
        L_0x0580:
            int r0 = r12.A00
            r4.A0g(r0, r5)
        L_0x0585:
            r12.A04 = r6
        L_0x0587:
            r4.A0z(r3)
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r1 = r3.A0E
            r0 = 0
            r1.CNi(r0)
            r3.A09 = r6
            X.87i r0 = r3.A0G
            r0.A0E = r6
            X.C3510387i.A02(r0)
        L_0x0599:
            X.8D9 r0 = r8.A0d
            r0.A02 = r6
            X.86x r2 = r8.A0N
            boolean r0 = r2.A05
            if (r0 == 0) goto L_0x05b9
            X.876 r0 = r2.A0H
            X.87G r1 = r0.A01()
            r1.getClass()
            boolean r0 = X.C3509386y.A01(r1)
            if (r0 != 0) goto L_0x05b9
            X.AA8 r0 = r2.A02(r1)
            r0.A0E(r6)
        L_0x05b9:
            X.8Fl r2 = r8.A0L
            if (r17 == 0) goto L_0x068a
            java.lang.String r0 = "on_exit_camera_flow"
        L_0x05bf:
            X.C352888Fl.A0D(r2, r0)
            com.instagram.camera.mpfacade.touch.TouchEventForwardingView r0 = r2.A0a
            r1 = 0
            r0.A00 = r1
            r0.A01 = r1
            com.instagram.camera.mpfacade.touch.TouchEventForwardingView r0 = r2.A0b
            r0.A00 = r1
            r0.A01 = r1
            X.846 r0 = r2.A1F
            X.7zw r0 = r0.A00()
            r0.A00()
            android.os.Handler r1 = r2.A0Q
            java.lang.Runnable r0 = r2.A1J
            r1.removeCallbacks(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.A1L
            r0.set(r6)
            X.7l2 r0 = r2.A06
            if (r0 == 0) goto L_0x05ef
            X.B2x r0 = r0.A04
            if (r0 == 0) goto L_0x05ef
            r0.Dcz()
        L_0x05ef:
            X.8DB r0 = r8.A0R
            X.81C r0 = r0.A00
            X.81E r0 = r0.A00()
            X.8Hd r0 = (X.C353318Hd) r0
            r0.DDR()
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r0 = r8.A0j
            r0.A0S = r6
            X.1Wr r2 = X.1Wr.A00
            if (r2 == 0) goto L_0x0b96
            com.instagram.common.session.UserSession r1 = r8.A09
            X.4cM r0 = r8.A0h
            r2.removeLocationUpdates(r1, r0)
            X.8Rz r2 = r8.A0H
            X.80U r0 = r8.A0Z
            X.80X r1 = r0.Ats()
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r0 = r2.A0Q
            r0.A0z(r2)
            X.8Yz r0 = r2.A0A
            X.80m r0 = r0.A08
            java.lang.Object r0 = r0.A00
            boolean r0 = r0 instanceof X.AnonymousClass9QA
            if (r0 == 0) goto L_0x0723
            X.80X r0 = X.AnonymousClass80X.SUB_FRAGMENT
            if (r1 != r0) goto L_0x0723
            X.81m r3 = r2.A0K
            X.81t r0 = r3.A00()
            boolean r0 = r0.Cb1()
            if (r0 == 0) goto L_0x0640
            X.81t r0 = r3.A00()
            r0.CLK()
            java.util.List r1 = r2.A0R
            X.9ru r0 = X.C390829ru.ROOT_CONTAINER
            r1.add(r0)
        L_0x0640:
            X.81t r0 = r3.A00()
            boolean r0 = r0.CPb()
            if (r0 == 0) goto L_0x0658
            X.81t r0 = r3.A00()
            r0.CLF(r5)
            java.util.List r1 = r2.A0R
            X.9ru r0 = X.C390829ru.BOTTOM_CONTAINER
            r1.add(r0)
        L_0x0658:
            X.81t r0 = r3.A00()
            boolean r0 = r0.CQ1()
            if (r0 == 0) goto L_0x0670
            X.81t r0 = r3.A00()
            r0.CLH()
            java.util.List r1 = r2.A0R
            X.9ru r0 = X.C390829ru.CAMERA_TOOL_MENU
            r1.add(r0)
        L_0x0670:
            X.81t r0 = r3.A00()
            boolean r0 = r0.CZd()
            if (r0 == 0) goto L_0x0723
            X.81t r0 = r3.A00()
            r0.CLJ()
            java.util.List r1 = r2.A0R
            X.9ru r0 = X.C390829ru.PRE_CAPTURE_CONTAINER_STUB
            r1.add(r0)
            goto L_0x0723
        L_0x068a:
            java.lang.String r0 = "on_exit_pre_capture"
            goto L_0x05bf
        L_0x068e:
            r13.A01(r6)
            goto L_0x055c
        L_0x0693:
            r14.clear()
            X.05G r0 = r12.A05
            r0.Epw(r2)
            r12.A01 = r2
            r12.A00 = r2
            X.0eM r0 = r13.A0C
            java.lang.Object r1 = r0.getValue()
            X.HDk r1 = (X.C54435HDk) r1
            X.4Cq r0 = r1.A03
            X.4Cc r0 = r0.ArX()
            X.AnonymousClass5H8.A02(r0)
            X.05G r0 = r1.A06
            r0.Epw(r3)
            X.05G r0 = r1.A04
            r0.Epw(r2)
            X.8Jb r4 = r8.A0U
            X.8o8 r0 = r4.A04
            if (r0 == 0) goto L_0x06c3
            r0.A02()
        L_0x06c3:
            X.8oa r0 = r4.A02
            if (r0 == 0) goto L_0x06cc
            android.view.ViewGroup r0 = r0.A01
            r0.removeAllViews()
        L_0x06cc:
            X.9YG r1 = r4.A03
            if (r1 == 0) goto L_0x06df
            X.8KC r0 = r1.A02
            if (r0 == 0) goto L_0x06d7
            r0.Dqt()
        L_0x06d7:
            r1.A02 = r2
            r0 = -1
            r1.A00 = r0
            r1.A00()
        L_0x06df:
            X.AIl r1 = r4.A01
            if (r1 == 0) goto L_0x0713
            X.8Xo r0 = X.C39903AIl.A00(r1)
            X.7Pu r0 = r0.A00
            if (r0 == 0) goto L_0x06ee
            r0.A07()
        L_0x06ee:
            X.8Xo r0 = X.C39903AIl.A00(r1)
            android.app.Activity r12 = r1.A01
            X.86D r3 = r0.A02
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.A0L
            r0.set(r5)
            r3.A05 = r2
            X.07g r12 = (X.AnonymousClass07g) r12
            X.9jD r0 = new X.9jD
            r0.<init>()
            X.2YN r1 = new X.2YN
            r1.<init>(r0, r12)
            java.lang.Class<X.848> r0 = X.AnonymousClass848.class
            X.2YL r0 = r1.A00(r0)
            X.848 r0 = (X.AnonymousClass848) r0
            r3.A04 = r0
        L_0x0713:
            X.07f r0 = r4.A07
            r0.A00()
            r4.A04 = r2
            r4.A02 = r2
            r4.A03 = r2
            android.view.ViewGroup r0 = r8.A06
            r0.setBackground(r2)
        L_0x0723:
            int r0 = r7.ordinal()
            if (r0 == r5) goto L_0x07f4
            if (r0 == r10) goto L_0x0794
            if (r0 != r6) goto L_0x0779
            X.8Hx r0 = r8.A0a
            r0.DCV(r6)
            X.6if r1 = r8.A0e
            boolean r0 = r1.A03
            if (r0 != r5) goto L_0x073b
            r1.get()
        L_0x073b:
            X.8E5 r0 = r8.A0S
            X.8Zl r0 = r0.A00()
            r0.DCU()
            X.82p r0 = r8.A0M
            X.82o r0 = r0.A02
            r0.A06()
            X.82W r0 = r8.A08
            X.82X r0 = r0.A00()
            X.81b r0 = r0.A04
            X.7lC r0 = r0.A04
            if (r0 == 0) goto L_0x075a
            r0.D0A()
        L_0x075a:
            android.app.Activity r2 = r8.A02
            com.instagram.common.session.UserSession r1 = r8.A09
            X.2jA r0 = new X.2jA
            r0.<init>()
            X.JY0 r0 = X.JYB.A00(r2, r1, r0)
            if (r0 == 0) goto L_0x0770
            X.JY3 r0 = r0.A01
            java.util.Map r0 = r0.A05
            r0.clear()
        L_0x0770:
            X.7zp r1 = X.C349227zn.A00(r1)
            r0 = 0
            r1.A00 = r0
            X.GVF.A04 = r0
        L_0x0779:
            X.80X r0 = X.AnonymousClass80X.UNINITIALIZED
            r3 = 0
            if (r9 != r0) goto L_0x0b69
            java.util.Set r0 = r8.A0k
            java.util.Iterator r1 = r0.iterator()
        L_0x0784:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0b8b
            java.lang.Object r0 = r1.next()
            X.B1P r0 = (X.B1P) r0
            r0.D19(r6)
            goto L_0x0784
        L_0x0794:
            boolean r0 = r11 instanceof X.AnonymousClass8VP
            if (r0 == 0) goto L_0x07a4
            X.8VP r11 = (X.AnonymousClass8VP) r11
            java.util.List r2 = r11.A01
            java.util.List r1 = r11.A02
            X.8Ia r0 = r11.A00
            r8.A05(r0, r2, r1)
            goto L_0x0779
        L_0x07a4:
            boolean r0 = r11 instanceof X.C356968Vx
            if (r0 == 0) goto L_0x0779
            X.82p r0 = r8.A0M
            X.82o r1 = r0.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r1.A08(r0)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r3 = r8.A0b
            X.2Fk r0 = r3.A0C
            java.lang.Object r4 = r0.A02()
            X.8fx r4 = (X.C361278fx) r4
            if (r4 == 0) goto L_0x0779
            int r1 = r4.A00
            r0 = 3
            if (r1 != r0) goto L_0x0779
            boolean r0 = r3.A08
            if (r0 == 0) goto L_0x07f1
            X.9mv r2 = X.C387879mv.A00
        L_0x07c8:
            X.8Hx r0 = r8.A0a
            r0.Cni(r2)
            java.lang.Object r1 = r4.A00()
            X.7zv r1 = (X.C349307zv) r1
            X.8nh r0 = new X.8nh
            r0.<init>((X.C349307zv) r1)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r1)
            r0 = 0
            r8.A05(r2, r1, r0)
            X.8Yz r0 = r8.A0B
            X.80m r0 = r0.A08
            java.lang.Object r1 = r0.A00
            X.9QA r0 = X.AnonymousClass9QA.A00
            if (r1 != r0) goto L_0x0779
            r3.A0O()
            goto L_0x0779
        L_0x07f1:
            X.9mu r2 = X.C387869mu.A00
            goto L_0x07c8
        L_0x07f4:
            X.80X r14 = X.AnonymousClass80X.POST_CAPTURE
            if (r9 != r14) goto L_0x0803
            X.8Hx r1 = r8.A0a
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r0 = r8.A0j
            java.util.List r0 = r0.getAllDrawables()
            r1.EgF(r0)
        L_0x0803:
            android.view.ViewGroup r0 = r8.A04
            r0.removeAllViews()
            android.view.ViewGroup r2 = r8.A05
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r13 = r8.A0j
            int r1 = r2.indexOfChild(r13)
            r0 = -1
            if (r1 != r0) goto L_0x081b
            android.view.ViewGroup r0 = r8.A06
            r2.addView(r0)
            r2.addView(r13)
        L_0x081b:
            boolean r3 = r11 instanceof X.AnonymousClass8VN
            if (r3 == 0) goto L_0x0829
            r0 = r11
            X.8VN r0 = (X.AnonymousClass8VN) r0
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0829
            r8.A00()
        L_0x0829:
            boolean r0 = r11 instanceof X.C356958Vw
            if (r0 == 0) goto L_0x0848
            r8.A00()
            X.8Yz r0 = r8.A0B
            X.80m r0 = r0.A08
            java.lang.Object r1 = r0.A00
            X.9QA r0 = X.AnonymousClass9QA.A00
            if (r1 != r0) goto L_0x0848
            X.80U r0 = r8.A0Z
            X.8SD r1 = new X.8SD
            r1.<init>()
            X.80T r0 = (X.AnonymousClass80T) r0
            X.80W r0 = r0.A02
            r0.A04(r1)
        L_0x0848:
            X.8BA r12 = r8.A0I
            r15 = 0
            r12.A0d = r6
            r12.A0h = r6
            r10 = 0
            r12.A09 = r10
            r12.A0O = r10
            X.85o r2 = r12.A11
            X.87k r1 = r12.A12
            X.0qQ.A0B(r1, r6)
            java.util.Set r0 = r2.A0C
            r0.remove(r1)
            X.80D r0 = r12.A18
            X.82i r1 = r0.A18
            r0 = 0
            if (r1 == 0) goto L_0x0868
            r0 = 1
        L_0x0868:
            r2.A03(r0)
            com.instagram.common.session.UserSession r0 = r12.A0v
            X.1Av r0 = X.1Au.A00(r0)
            X.0xa r0 = r0.A01
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "allow_story_mention_group_thread_creation"
            r1.E5T(r0, r6)
            r1.apply()
            X.6if r1 = r12.A1c
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0890
            java.lang.Object r1 = r1.get()
            X.8O4 r1 = (X.AnonymousClass8O4) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r1.A0E(r0)
        L_0x0890:
            X.6if r1 = r12.A1b
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x08a2
            java.lang.Object r1 = r1.get()
            X.AaC r1 = (X.C40317AaC) r1
            r1.A01 = r5
            com.instagram.ui.text.TextColorScheme r0 = r1.A05
            r1.A00 = r0
        L_0x08a2:
            X.6if r4 = r12.A1g
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x08b3
            java.lang.Object r1 = r4.get()
            X.8ME r1 = (X.AnonymousClass8ME) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r1.A1N(r0)
        L_0x08b3:
            X.8Bb r0 = r12.A1k
            if (r0 == 0) goto L_0x08bd
            r0.EQQ(r5)
            r0.Ejs(r6)
        L_0x08bd:
            X.8C9 r1 = r12.A1D
            android.widget.ImageView r0 = r1.A00
            if (r0 == 0) goto L_0x08cf
            X.8CB r0 = new X.8CB
            r0.<init>()
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r0 = r0.A01()
            r1.A02(r0)
        L_0x08cf:
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x0909
            java.lang.Object r2 = r4.get()
            X.8ME r2 = (X.AnonymousClass8ME) r2
            java.util.List r1 = r2.A1r
            boolean r0 = r2.A0S
            if (r0 != 0) goto L_0x08ec
            if (r1 == 0) goto L_0x08ec
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x08ec
            X.AnonymousClass8ME.A0c(r2, r1)
            r2.A0S = r5
        L_0x08ec:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.AnonymousClass8ME.A0a(r2, r0)
            r2.A1P(r5)
            java.lang.Object r0 = r4.get()
            X.8ME r0 = (X.AnonymousClass8ME) r0
            boolean r0 = r0.A1R()
            if (r0 == 0) goto L_0x0909
            X.8AE r0 = r12.A1W
            X.8Zh r0 = r0.A00()
            r0.Exh()
        L_0x0909:
            X.8B2 r1 = r12.A1l
            if (r1 == 0) goto L_0x0927
            X.82p r0 = r12.A13
            X.82o r2 = r0.A02
            boolean r0 = r2.A0F()
            if (r0 != 0) goto L_0x0924
            boolean r0 = r2.A0B()
            if (r0 != 0) goto L_0x0924
            X.82Y r0 = r2.A01
            boolean r0 = r0.A0O
            if (r0 != 0) goto L_0x0924
            r15 = 1
        L_0x0924:
            r1.A00(r15)
        L_0x0927:
            X.8K4 r0 = r8.A0G
            r0.A09 = r6
            X.AnonymousClass8K4.A05(r0)
            X.8LU r1 = r8.A0J
            X.8L1 r0 = r1.A0g
            r0.A00 = r6
            X.AnonymousClass8LU.A08(r1)
            X.8Fe r2 = r8.A0i
            r1 = 7
            X.9LV r0 = new X.9LV
            r0.<init>(r2, r1)
            X.C352828Fe.A00(r2, r0)
            X.8Yz r2 = r8.A0B
            X.8aL r0 = X.C358088aL.A0C
            X.8aL[] r0 = new X.C358088aL[]{r0}
            boolean r1 = r2.A0V(r0)
            X.87h r0 = r8.A0c
            r17 = r0
            X.8Jc r4 = r17.A00()
            if (r1 == 0) goto L_0x0b64
            java.lang.Integer r1 = r4.A0J
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 == r0) goto L_0x0973
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r1 = r4.A0c
            X.6Ly r0 = r4.A0F
            r1.A0S(r0)
            r4.A0F = r10
            X.C353798Jc.A09(r4)
            android.view.View r0 = r4.A04
            android.view.View[] r0 = new android.view.View[]{r0}
            X.C294975nL.A04(r10, r0, r6)
        L_0x0973:
            X.8Jc r0 = r17.A00()
            r0.A0N(r5)
        L_0x097a:
            X.86x r4 = r8.A0N
            boolean r0 = r4.A05
            if (r0 == 0) goto L_0x0991
            X.876 r0 = r4.A0H
            X.87G r1 = r0.A01()
            java.lang.String r0 = "If create mode was showing, the selected dial element should not be null."
            X.17k.A07(r1, r0)
            r4.A07(r1, r10)
            r4.A09(r5)
        L_0x0991:
            X.8E5 r0 = r8.A0S
            X.8Zl r0 = r0.A00()
            r0.DCN()
            X.8E6 r0 = r8.A0Y
            if (r0 == 0) goto L_0x09a7
            X.B3Y r0 = r0.A00()
            if (r0 == 0) goto L_0x09a7
            r0.DCN()
        L_0x09a7:
            X.8hH r4 = r8.A01
            if (r4 == 0) goto L_0x09b6
            if (r9 == r14) goto L_0x09b2
            X.80X r1 = X.AnonymousClass80X.SUB_FRAGMENT
            r0 = 0
            if (r9 != r1) goto L_0x09b3
        L_0x09b2:
            r0 = 1
        L_0x09b3:
            r4.DCO(r0)
        L_0x09b6:
            X.82p r0 = r8.A0M
            X.82o r0 = r0.A02
            X.82Y r4 = r0.A01
            r4.A0U = r6
            r4.A03 = r10
            X.8ic r0 = r8.A00
            if (r0 == 0) goto L_0x09c7
            r0.A01(r6)
        L_0x09c7:
            X.8Hx r1 = r8.A0a
            if (r9 != r14) goto L_0x0b5f
            if (r3 == 0) goto L_0x0b5b
            X.8VN r11 = (X.AnonymousClass8VN) r11
            if (r11 == 0) goto L_0x0b5b
            X.8bo r0 = r11.A01
        L_0x09d3:
            r1.DCM(r0)
        L_0x09d6:
            X.8Fl r3 = r8.A0L
            r15 = 0
            if (r9 != r14) goto L_0x09dc
            r15 = 1
        L_0x09dc:
            com.instagram.common.session.UserSession r0 = r3.A0f
            X.1Ng r11 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Class<X.8c4> r1 = X.C359138c4.class
            X.1wn r0 = r3.A0d
            r11.A01(r0, r1)
            if (r15 == 0) goto L_0x09f6
            boolean r0 = r3.A1P
            if (r0 == 0) goto L_0x09f6
            X.2cs r11 = r3.A0Y
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r11.A08(r0, r5)
        L_0x09f6:
            X.7l2 r0 = r3.A06
            if (r0 == 0) goto L_0x0b57
            boolean r0 = r3.A0J
            if (r0 == 0) goto L_0x0a01
        L_0x09fe:
            X.C352888Fl.A0E(r3, r6)
        L_0x0a01:
            X.C352888Fl.A0A(r3)
            X.8Yz r0 = r3.A0g
            com.instagram.creation.cameraconfiguration.CameraConfiguration r0 = r0.A06()
            X.C352888Fl.A04(r0, r3)
            X.8DB r0 = r8.A0R
            X.81C r0 = r0.A00
            X.81E r0 = r0.A00()
            X.8Hd r0 = (X.C353318Hd) r0
            r0.DCN()
            X.8Rz r0 = r8.A0H
            r0.A0A(r9)
            X.88F r11 = r8.A0f
            if (r11 == 0) goto L_0x0b53
            X.8va r0 = r11.A03
            if (r0 != 0) goto L_0x0a2b
            boolean r0 = r11.A0f
            if (r0 != 0) goto L_0x0b53
        L_0x0a2b:
            r16 = 1
        L_0x0a2d:
            X.8D9 r3 = r8.A0d
            int r1 = r3.A00
            r0 = -1
            r15 = 0
            if (r1 == r0) goto L_0x0a36
            r15 = 1
        L_0x0a36:
            X.8Jc r0 = r17.A00()
            boolean r1 = r0.isVisible()
            if (r16 != 0) goto L_0x0a5b
            boolean r0 = r8.A0l
            if (r0 != 0) goto L_0x0a5b
            if (r15 != 0) goto L_0x0a5b
            if (r1 != 0) goto L_0x0a5b
            X.8aL r0 = X.C358088aL.A0D
            X.8aL[] r0 = new X.C358088aL[]{r0}
            boolean r0 = r2.A0V(r0)
            if (r0 != 0) goto L_0x0a5b
            boolean r1 = r12.CKM()
            r0 = 0
            if (r1 == 0) goto L_0x0a5c
        L_0x0a5b:
            r0 = 1
        L_0x0a5c:
            r13.A0S = r0
            android.view.View[] r1 = new android.view.View[]{r13}
            X.2co r0 = X.C315596kB.A02
            X.C294975nL.A04(r10, r1, r6)
            if (r11 == 0) goto L_0x0b1f
            r16 = 0
            if (r9 != r14) goto L_0x0a6f
            r16 = 1
        L_0x0a6f:
            X.9oE r15 = r11.A0K
            X.8Yz r1 = r11.A0F
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r14 = r11.A0N
            boolean r13 = r15 instanceof X.C388679oD
            if (r13 == 0) goto L_0x0b4e
            X.9oD r15 = (X.C388679oD) r15
            X.8va r0 = r15.A02
            if (r0 == 0) goto L_0x0ad9
            X.804 r12 = r15.A03
            X.80m r0 = r1.A08
            java.lang.Object r0 = r0.A00
            boolean r2 = r0 instanceof X.AnonymousClass80O
            int r0 = r15.A00
            X.B3f r0 = com.instagram.ui.widget.interactive.InteractiveDrawableContainer.A02(r14, r0)
            if (r0 == 0) goto L_0x0a93
            X.9Qs r0 = (X.C378669Qs) r0
            r0.A0O = r5
        L_0x0a93:
            int r0 = r15.A00
            if (r2 == 0) goto L_0x0b49
            boolean r1 = r12 instanceof X.C339987kV
            X.B3f r0 = com.instagram.ui.widget.interactive.InteractiveDrawableContainer.A02(r14, r0)
            if (r0 == 0) goto L_0x0aa3
            X.9Qs r0 = (X.C378669Qs) r0
            r0.A0U = r1
        L_0x0aa3:
            int r0 = r15.A00
            r14.A0g(r0, r1)
        L_0x0aa8:
            boolean r0 = r12 instanceof X.C339987kV
            if (r0 == 0) goto L_0x0ad9
            if (r16 == 0) goto L_0x0ad9
            if (r2 != 0) goto L_0x0ad9
            X.7kV r12 = (X.C339987kV) r12
            float r2 = r12.A00
            int r0 = r15.A00
            r1 = 0
            X.B3f r0 = com.instagram.ui.widget.interactive.InteractiveDrawableContainer.A02(r14, r0)
            if (r0 == 0) goto L_0x0ac3
            r0.EeI(r1)
            r0.EeJ(r1)
        L_0x0ac3:
            int r0 = r15.A00
            X.B3f r0 = com.instagram.ui.widget.interactive.InteractiveDrawableContainer.A02(r14, r0)
            if (r0 == 0) goto L_0x0ace
            r0.EjE(r2)
        L_0x0ace:
            int r0 = r15.A00
            X.B3f r0 = com.instagram.ui.widget.interactive.InteractiveDrawableContainer.A02(r14, r0)
            if (r0 == 0) goto L_0x0ad9
            r0.Ej2(r1)
        L_0x0ad9:
            r15.A04 = r5
            X.804 r0 = r15.A03
            boolean r0 = r0 instanceof X.C365058mS
            if (r0 == 0) goto L_0x0b47
            X.804 r1 = r15.A02()
        L_0x0ae5:
            r14.A0y(r11)
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r0 = r11.A0E
            r0.CNi(r11)
            r11.A09 = r5
            X.8va r2 = r11.A03
            if (r2 == 0) goto L_0x0b04
            if (r13 == 0) goto L_0x0b04
            int r0 = r11.A00
            X.B3f r0 = com.instagram.ui.widget.interactive.InteractiveDrawableContainer.A02(r14, r0)
            if (r0 != 0) goto L_0x0b04
            if (r1 != 0) goto L_0x0b45
            X.804 r0 = r11.A04
        L_0x0b01:
            X.AnonymousClass88F.A02(r11, r2, r0)
        L_0x0b04:
            if (r1 == 0) goto L_0x0b3d
            X.804 r0 = r11.A04
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 != 0) goto L_0x0b3d
            r11.A07(r1)
        L_0x0b11:
            X.8va r0 = r11.A03
            if (r0 == 0) goto L_0x0b18
            r0.APn()
        L_0x0b18:
            X.87i r0 = r11.A0G
            r0.A0E = r5
            X.C3510387i.A02(r0)
        L_0x0b1f:
            r3.A02 = r5
            X.8hH r0 = r8.A01
            if (r0 == 0) goto L_0x0b28
            r0.CLL(r6)
        L_0x0b28:
            X.87i r0 = r8.A0C
            r0.A07()
            r4.A0E = r10
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r4.A0E = r0
            r4.A0G = r10
            goto L_0x0779
        L_0x0b3d:
            if (r16 == 0) goto L_0x0b11
            X.804 r0 = r11.A04
            X.AnonymousClass88F.A03(r11, r0)
            goto L_0x0b11
        L_0x0b45:
            r0 = r1
            goto L_0x0b01
        L_0x0b47:
            r1 = 0
            goto L_0x0ae5
        L_0x0b49:
            r14.A0g(r0, r6)
            goto L_0x0aa8
        L_0x0b4e:
            X.804 r1 = r15.A02()
            goto L_0x0ae5
        L_0x0b53:
            r16 = 0
            goto L_0x0a2d
        L_0x0b57:
            if (r15 == 0) goto L_0x0a01
            goto L_0x09fe
        L_0x0b5b:
            X.8bn r0 = X.C358988bn.A00
            goto L_0x09d3
        L_0x0b5f:
            r1.DCN()
            goto L_0x09d6
        L_0x0b64:
            r4.A0N(r6)
            goto L_0x097a
        L_0x0b69:
            X.80X r0 = X.AnonymousClass80X.SUB_FRAGMENT
            if (r7 == r0) goto L_0x0b8b
            X.80X r0 = X.AnonymousClass80X.POST_CAPTURE
            if (r7 == r0) goto L_0x0b73
            r18 = 0
        L_0x0b73:
            java.util.Set r0 = r8.A0k
            java.util.Iterator r2 = r0.iterator()
        L_0x0b79:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0b8b
            java.lang.Object r1 = r2.next()
            X.B1P r1 = (X.B1P) r1
            r0 = r18
            r1.D19(r0)
            goto L_0x0b79
        L_0x0b8b:
            android.view.View r1 = r8.A03
            X.80X r0 = X.AnonymousClass80X.SUB_FRAGMENT
            if (r7 != r0) goto L_0x0b92
            r3 = 4
        L_0x0b92:
            r1.setImportantForAccessibility(r3)
            return
        L_0x0b96:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0b9e:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8S5.Dmx(java.lang.Object, java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.07Z, androidx.fragment.app.Fragment, java.lang.Object, X.4DH] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass8S5(android.app.Activity r5, android.view.View r6, android.view.ViewGroup r7, android.view.ViewGroup r8, android.view.ViewGroup r9, X.AnonymousClass4DH r10, X.AnonymousClass847 r11, X.AnonymousClass82W r12, com.instagram.common.session.UserSession r13, X.AnonymousClass4D6 r14, X.C357638Yz r15, X.C3510387i r16, X.AnonymousClass8QA r17, X.AnonymousClass8QN r18, X.AnonymousClass8K4 r19, X.C355948Rz r20, X.AnonymousClass8BA r21, X.AnonymousClass8LU r22, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r23, X.C3506485o r24, X.C352888Fl r25, X.C3499582p r26, X.C3509286x r27, X.AnonymousClass88A r28, X.AnonymousClass8FK r29, X.C3503684j r30, X.AnonymousClass8DB r31, X.AnonymousClass8E5 r32, X.AnonymousClass8H9 r33, X.C353788Jb r34, X.C352848Fg r35, X.AnonymousClass8H3 r36, X.AnonymousClass8H7 r37, X.AnonymousClass8H5 r38, X.AnonymousClass8E6 r39, X.AnonymousClass80U r40, X.C353508Hx r41, X.C3510287h r42, X.AnonymousClass8D9 r43, X.C314676if r44, X.AnonymousClass88F r45, X.C351818An r46, X.C352828Fe r47, com.instagram.ui.widget.interactive.InteractiveDrawableContainer r48, int r49, boolean r50) {
        /*
            r4 = this;
            r0 = 1
            X.0qQ.A0B(r10, r0)
            r0 = 2
            X.0qQ.A0B(r15, r0)
            r0 = 5
            X.0qQ.A0B(r13, r0)
            r0 = 7
            X.0qQ.A0B(r5, r0)
            r0 = 25
            X.0qQ.A0B(r7, r0)
            r0 = 26
            r1 = r48
            X.0qQ.A0B(r1, r0)
            r0 = 27
            X.0qQ.A0B(r8, r0)
            r0 = 28
            X.0qQ.A0B(r9, r0)
            r0 = 43
            r2 = r46
            X.0qQ.A0B(r2, r0)
            r0 = 44
            r3 = r23
            X.0qQ.A0B(r3, r0)
            r4.<init>()
            r4.A0B = r15
            r0 = r26
            r4.A0M = r0
            r0 = r40
            r4.A0Z = r0
            r4.A09 = r13
            r4.A03 = r6
            r4.A02 = r5
            r0 = r21
            r4.A0I = r0
            r0 = r17
            r4.A0E = r0
            r0 = r18
            r4.A0F = r0
            r0 = r19
            r4.A0G = r0
            r0 = r22
            r4.A0J = r0
            r0 = r42
            r4.A0c = r0
            r0 = r32
            r4.A0S = r0
            r0 = r39
            r4.A0Y = r0
            r0 = r41
            r4.A0a = r0
            r0 = r44
            r4.A0e = r0
            r0 = r25
            r4.A0L = r0
            r0 = r31
            r4.A0R = r0
            r4.A07 = r11
            r0 = r45
            r4.A0f = r0
            r0 = r28
            r4.A0O = r0
            r0 = r50
            r4.A0l = r0
            r0 = r43
            r4.A0d = r0
            r4.A06 = r7
            r4.A0j = r1
            r4.A05 = r8
            r4.A04 = r9
            r0 = r49
            r4.A0m = r0
            r0 = r30
            r4.A0Q = r0
            r0 = r20
            r4.A0H = r0
            r0 = r27
            r4.A0N = r0
            r4.A0A = r14
            r4.A08 = r12
            r0 = r29
            r4.A0P = r0
            r0 = r36
            r4.A0o = r0
            r0 = r16
            r4.A0C = r0
            r0 = r24
            r4.A0n = r0
            r0 = r38
            r4.A0X = r0
            r0 = r37
            r4.A0W = r0
            r0 = r35
            r4.A0V = r0
            r0 = r34
            r4.A0U = r0
            r4.A0g = r2
            r4.A0K = r3
            r0 = r33
            r4.A0T = r0
            r0 = r47
            r4.A0i = r0
            X.8S6 r0 = new X.8S6
            r0.<init>(r4)
            r4.A0D = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r4.A0k = r0
            androidx.fragment.app.FragmentActivity r0 = r10.requireActivity()
            X.2YN r1 = new X.2YN
            r1.<init>(r0)
            java.lang.Class<X.860> r0 = X.AnonymousClass860.class
            X.2YL r1 = r1.A00(r0)
            X.860 r1 = (X.AnonymousClass860) r1
            java.lang.String r0 = "post_capture"
            X.861 r3 = r1.A00(r0)
            r4.A0p = r3
            androidx.fragment.app.FragmentActivity r2 = r10.requireActivity()
            androidx.fragment.app.FragmentActivity r1 = r10.requireActivity()
            X.82v r0 = new X.82v
            r0.<init>(r13, r1)
            X.2YN r1 = new X.2YN
            r1.<init>(r0, r2)
            java.lang.Class<com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel> r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel.class
            X.2YL r0 = r1.A00(r0)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel) r0
            r4.A0b = r0
            X.8S7 r0 = new X.8S7
            r0.<init>(r4)
            r4.A0h = r0
            X.2Fj r2 = r3.A0A
            r0 = 24
            X.9LG r1 = new X.9LG
            r1.<init>(r4, r0)
            X.8S8 r0 = new X.8S8
            r0.<init>(r1)
            r2.A06(r10, r0)
            X.0eO r2 = X.0eO.A02
            r1 = 45
            X.9LM r0 = new X.9LM
            r0.<init>(r4, r1)
            X.0eM r0 = X.AnonymousClass0eN.A00(r2, r0)
            r4.A0q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8S5.<init>(android.app.Activity, android.view.View, android.view.ViewGroup, android.view.ViewGroup, android.view.ViewGroup, X.4DH, X.847, X.82W, com.instagram.common.session.UserSession, X.4D6, X.8Yz, X.87i, X.8QA, X.8QN, X.8K4, X.8Rz, X.8BA, X.8LU, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, X.85o, X.8Fl, X.82p, X.86x, X.88A, X.8FK, X.84j, X.8DB, X.8E5, X.8H9, X.8Jb, X.8Fg, X.8H3, X.8H7, X.8H5, X.8E6, X.80U, X.8Hx, X.87h, X.8D9, X.6if, X.88F, X.8An, X.8Fe, com.instagram.ui.widget.interactive.InteractiveDrawableContainer, int, boolean):void");
    }
}
