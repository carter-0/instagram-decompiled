package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.facebook.video.heroplayer.ipc.HeroScrollSetting;
import com.instagram.common.session.UserSession;
import com.instagram.ui.listview.StickyHeaderListView;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2xS  reason: invalid class name */
public final class AnonymousClass2xS extends C249383je implements C252243on, C232702uH, AnonymousClass2xT, AnonymousClass2xU, C234252xV, View.OnKeyListener {
    public View A00;
    public C52761GcE A01;
    public C2364833x A02;
    public C238133Ar A03;
    public boolean A04;
    public C56036Hrj A05;
    public 1wn A06;
    public StickyHeaderListView A07;
    public boolean A08;
    public final AnonymousClass4DM A09;
    public final UserSession A0A;
    public final 2el A0B;
    public final AnonymousClass4DU A0C;
    public final C231332rR A0D;
    public final AnonymousClass2xQ A0E;
    public final AnonymousClass2xX A0F;
    public final C232722uK A0G;
    public final C234262xW A0H;
    public final C234332xg A0I;
    public final Map A0J;
    public final Map A0K;
    public final Map A0L;
    public final boolean A0M;
    public final Context A0N;
    public final Fragment A0O;
    public final HeroScrollSetting A0P;
    public final 1Ng A0Q;
    public final C234312xe A0R;
    public final AnonymousClass2lU A0S;
    public final Integer A0T;
    public final Map A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass2xS(android.content.Context r14, com.instagram.common.session.UserSession r15, X.AnonymousClass4DU r16, X.C231332rR r17) {
        /*
            r13 = this;
            r2 = 0
            r0 = 2
            r3 = r15
            X.0qQ.A0B(r15, r0)
            r0 = 3
            r5 = r16
            X.0qQ.A0B(r5, r0)
            r0 = 4
            r7 = r17
            X.0qQ.A0B(r7, r0)
            X.2xQ r9 = X.AnonymousClass2xQ.A08
            r0 = 6
            X.0qQ.A0B(r9, r0)
            java.lang.Integer r10 = X.AnonymousClass05K.A0u
            r12 = 0
            r0 = r13
            r1 = r14
            r4 = r2
            r6 = r2
            r8 = r2
            r11 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2xS.<init>(android.content.Context, com.instagram.common.session.UserSession, X.4DU, X.2rR):void");
    }

    public final C245853da A01(1Xj r3) {
        0qQ.A0B(r3, 0);
        if (r3.BR7() != 1iA.A0a || r3.equals(this.A0G.A0G())) {
            return C245853da.HIDDEN;
        }
        return C245853da.SHOW;
    }

    public final AnonymousClass3TO A02(1Xj r2) {
        0qQ.A0B(r2, 0);
        if (this.A0D.BQr(r2).A0l.A00() || this.A0G.A0Z(r2)) {
            return this.A0G.A0I(r2);
        }
        return AnonymousClass3TO.TIMER;
    }

    public final void A03(View view, 1Xj r15, Object obj, float f, int i, int i2) {
        0qQ.A0B(r15, 0);
        Object obj2 = obj;
        0qQ.A0B(obj2, 1);
        AnonymousClass2xX r2 = this.A0F;
        Map map = r2.A0O;
        AnonymousClass4HX r1 = (AnonymousClass4HX) map.get(r15);
        float f2 = f;
        int i3 = i;
        int i4 = i2;
        if (r1 == null) {
            map.put(r15, new AnonymousClass4HX(view, obj2, f2, i3, i4, false, false, false));
        } else {
            if (!(f == r1.A00 && i3 == r1.A02 && i4 == r1.A01)) {
                r1.A02 = i3;
                r1.A01 = i4;
                r1.A00 = f2;
            }
            r2.A0H.BQr(r15);
        }
        r2.A08 = true;
        r2.A0H.BQr(r15);
    }

    public final void A04(View view, 1Xj r16, Object obj, float f, int i, int i2, boolean z, boolean z2, boolean z3) {
        1Xj r1 = r16;
        0qQ.A0B(r1, 0);
        Object obj2 = obj;
        0qQ.A0B(obj2, 1);
        AnonymousClass2xX r2 = this.A0F;
        r2.A0O.put(r1, new AnonymousClass4HX(view, obj2, f, i, i2, z, z2, z3));
        AnonymousClass3W1 BQr = r2.A0H.BQr(r1);
        if (false != BQr.A26) {
            BQr.A26 = false;
        }
        r2.A08 = true;
        r2.A07 = true;
    }

    public final void A05(1Xj r4) {
        0qQ.A0B(r4, 0);
        C232722uK r1 = this.A0G;
        if (!AnonymousClass4K8.A00(r1.A0J())) {
            return;
        }
        if (C262574Fa.A00(this.A0A, r4)) {
            r1.A0T("scroll");
        } else {
            r1.A0U("scroll", false, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0030, code lost:
        if (X.182.A06(X.0Tu.A05, X.C231512rn.A00(r5.A0F).A00, 36329333061337145L) != false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(X.1Xj r8) {
        /*
            r7 = this;
            r0 = 0
            X.0qQ.A0B(r8, r0)
            X.2xX r5 = r7.A0F
            X.2xb r1 = r5.A0K
            boolean r0 = r1.A03(r8)
            if (r0 == 0) goto L_0x0011
            r0 = 0
            r1.A00 = r0
        L_0x0011:
            X.2rR r0 = r5.A0H
            X.3W1 r6 = r0.BQr(r8)
            boolean r0 = r6.A26
            r4 = 1
            if (r0 == 0) goto L_0x0032
            com.instagram.common.session.UserSession r0 = r5.A0F
            X.0rQ r0 = X.C231512rn.A00(r0)
            com.instagram.common.session.UserSession r3 = r0.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36329333061337145(0x811156000c4039, double:3.038154742247523E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r1 = 1
            if (r0 == 0) goto L_0x0033
        L_0x0032:
            r1 = 0
        L_0x0033:
            com.instagram.common.session.UserSession r0 = r5.A0F
            boolean r0 = X.C231122qu.A0T(r0, r8)
            if (r0 == 0) goto L_0x0042
            if (r1 != 0) goto L_0x0042
            X.3WB r0 = X.AnonymousClass3WB.OFFSCREEN
            r6.A0K(r0)
        L_0x0042:
            java.util.Map r0 = r5.A0O
            r0.remove(r8)
            r5.A08 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2xS.A06(X.1Xj):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        if (r0 == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r0 != false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0068, code lost:
        if (r3 == X.AnonymousClass3OB.PAUSED) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(X.1Xj r11, X.AnonymousClass3V3 r12, X.AnonymousClass3W1 r13) {
        /*
            r10 = this;
            r0 = 0
            X.0qQ.A0B(r12, r0)
            r0 = 1
            X.0qQ.A0B(r11, r0)
            r0 = 2
            X.0qQ.A0B(r13, r0)
            X.2uK r4 = r10.A0G
            X.4Ne r0 = r4.A02
            if (r0 == 0) goto L_0x00fa
            X.3V3 r0 = r0.A08
        L_0x0014:
            boolean r1 = r12.equals(r0)
            X.1Xj r6 = r4.A0G()
            boolean r0 = r11.equals(r6)
            r9 = 0
            if (r0 != 0) goto L_0x0037
            boolean r0 = r11.A5D()
            if (r0 == 0) goto L_0x00f7
            if (r6 == 0) goto L_0x00f7
            int r0 = r13.A02
            X.1Xj r0 = r11.A1c(r0)
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x00f7
        L_0x0037:
            r0 = 1
        L_0x0038:
            if (r1 != 0) goto L_0x003d
            r8 = 1
            if (r0 != 0) goto L_0x0043
        L_0x003d:
            r8 = 0
            if (r1 == 0) goto L_0x0043
            r7 = 1
            if (r0 == 0) goto L_0x0044
        L_0x0043:
            r7 = 0
        L_0x0044:
            X.3W1 r0 = r4.A0H()
            if (r0 == 0) goto L_0x0051
            X.3WB r1 = r0.A0l
            X.3WB r0 = X.AnonymousClass3WB.ONSCREEN
            if (r1 != r0) goto L_0x0051
            r9 = 1
        L_0x0051:
            X.3OB r0 = r4.A0J()
            boolean r5 = X.AnonymousClass4K8.A00(r0)
            X.3OB r3 = r4.A0J()
            r2 = 0
            X.0qQ.A0B(r3, r2)
            X.3OB r0 = X.AnonymousClass3OB.IDLE
            if (r3 == r0) goto L_0x006a
            X.3OB r1 = X.AnonymousClass3OB.PAUSED
            r0 = 0
            if (r3 != r1) goto L_0x006b
        L_0x006a:
            r0 = 1
        L_0x006b:
            if (r7 == 0) goto L_0x009e
            if (r5 == 0) goto L_0x009e
            com.instagram.common.session.UserSession r5 = r10.A0A
            X.1Xj r1 = r11.A1e(r5)
            if (r6 == 0) goto L_0x009c
            X.1Xj r0 = r6.A1e(r5)
        L_0x007b:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00fd
            X.1Xj r0 = r11.A1e(r5)
            boolean r0 = X.C243223Xx.A00(r5, r0)
            if (r0 == 0) goto L_0x00fd
            X.0qQ.A0B(r5, r2)
            X.0Tu r3 = X.0Tu.A05
            r0 = 36326592871413610(0x810ed80000376a, double:3.03642183510602E-306)
            boolean r0 = X.182.A06(r3, r5, r0)
            if (r0 == 0) goto L_0x00fd
        L_0x009b:
            return
        L_0x009c:
            r0 = 0
            goto L_0x007b
        L_0x009e:
            if (r8 == 0) goto L_0x00c6
            if (r5 != 0) goto L_0x00a6
            if (r0 == 0) goto L_0x00c6
            if (r9 == 0) goto L_0x00c6
        L_0x00a6:
            X.4Ne r3 = r4.A02
            if (r3 == 0) goto L_0x009b
            X.4M3 r1 = r4.A05
            if (r1 == 0) goto L_0x009b
            X.3V3 r0 = r3.A08
            if (r0 == r12) goto L_0x009b
            r3.A08 = r12
            X.3W1 r0 = r12.BQq()
            r3.A09 = r0
            X.3Ua r0 = r12.C5r()
            if (r0 == 0) goto L_0x009b
            X.4M1 r1 = (X.AnonymousClass4M1) r1
            X.AnonymousClass4M1.A09(r0, r1, r2, r2)
            return
        L_0x00c6:
            X.2xX r3 = r10.A0F
            X.2uK r1 = r3.A0M
            X.1Xj r0 = r1.A0G()
            if (r0 != 0) goto L_0x009b
            X.3OB r5 = r1.A0J()
            X.GcE r4 = r3.A02
            X.2xW r0 = r3.A0N
            long r6 = r0.A04
            boolean r8 = r3.A09
            boolean r9 = r3.A0P
            boolean r1 = X.AnonymousClass3OG.A05(r4, r5, r6, r8, r9)
            boolean r0 = r3.A0A
            if (r0 == 0) goto L_0x009b
            boolean r0 = r3.A09
            if (r0 == 0) goto L_0x00ef
            boolean r0 = r3.A06
            if (r0 == 0) goto L_0x00ef
            return
        L_0x00ef:
            if (r1 == 0) goto L_0x009b
            android.os.Handler r0 = r3.A0D
            r0.sendEmptyMessage(r2)
            return
        L_0x00f7:
            r0 = 0
            goto L_0x0038
        L_0x00fa:
            r0 = 0
            goto L_0x0014
        L_0x00fd:
            java.lang.String r0 = "media_mismatch"
            r4.A0U(r0, r2, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2xS.A07(X.1Xj, X.3V3, X.3W1):void");
    }

    public final void A09(1Xj r8, AnonymousClass3V3 r9, AnonymousClass3W1 r10, C263414Lx r11, boolean z) {
        0qQ.A0B(r8, 0);
        0qQ.A0B(r9, 2);
        A0A(r8, r9, r10, r11, z, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0115, code lost:
        if (X.C243223Xx.A00(r1, r8) != false) goto L_0x0117;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(X.1Xj r18, X.AnonymousClass3V3 r19, X.AnonymousClass3W1 r20, X.C263414Lx r21, boolean r22, boolean r23) {
        /*
            r17 = this;
            r4 = 0
            r0 = 1
            r6 = r20
            X.0qQ.A0B(r6, r0)
            r0 = 4
            r11 = r21
            X.0qQ.A0B(r11, r0)
            r3 = r17
            java.util.Map r0 = r3.A0L
            r5 = r19
            java.lang.Object r0 = r0.get(r5)
            X.4Ly r0 = (X.C263424Ly) r0
            r14 = r22
            if (r23 != 0) goto L_0x00e8
            if (r0 == 0) goto L_0x00e8
            X.5qj r8 = r0.A03
            X.3Nw r10 = r0.A05
            int r13 = r0.A00
            X.3BT r7 = r0.A02
            boolean r3 = r0.A06
            X.0iw r4 = r0.A01
            X.Vcn r9 = r0.A04
            boolean r0 = r5 instanceof X.C254043rq
            if (r0 == 0) goto L_0x00da
            X.3rq r0 = r8.A01
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x00da
            r0 = 299(0x12b, float:4.19E-43)
            java.lang.String r1 = X.C273654mx.A00(r0)
            X.4Cq r2 = r8.A0C
            X.4Cc r0 = r2.ArX()
            r12 = 0
            X.AnonymousClass5H8.A02(r0)
            X.6g4 r0 = r8.A08
            r0.A00()
            r0.A02()
            X.2xS r0 = r8.A04
            r0.A0C(r1)
            r1 = r5
            X.3rq r1 = (X.C254043rq) r1
            r8.A01 = r1
            if (r3 == 0) goto L_0x00dd
            com.instagram.reels.ui.StoryItemWithPreviewPlayer$start$1 r3 = new com.instagram.reels.ui.StoryItemWithPreviewPlayer$start$1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x0062:
            X.19B r0 = X.19B.A00
            X.1Eo.A05(r0, r3, r2)
            com.instagram.common.session.UserSession r0 = r8.A02
            X.3uh r5 = r7.A00(r0)
            if (r5 == 0) goto L_0x00da
            X.Vgq r0 = r8.A05
            android.view.View r8 = r1.A00
            X.2pD r4 = r0.A00
            X.5GH r0 = r0.A02
            X.4qK r6 = r0.A00
            java.lang.Integer r7 = r0.A08
            X.1UQ r1 = r6.A01
            X.1UQ r0 = X.1UQ.A0Q
            if (r1 != r0) goto L_0x00da
            com.instagram.common.session.UserSession r3 = r4.A04
            r0 = 1
            X.0qQ.A0B(r3, r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325330151158649(0x810db200023379, double:3.0356232857322166E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00da
            X.4DU r1 = r4.A06
            X.2lj r0 = r4.A0A
            java.lang.String r0 = r0.A0I
            X.Hzx r4 = new X.Hzx
            r4.<init>(r3, r1, r0)
            if (r7 == 0) goto L_0x00db
            int r3 = r7.intValue()
        L_0x00a5:
            X.1Xj r0 = r5.A0b
            if (r0 == 0) goto L_0x00da
            java.lang.String r12 = r0.A2n()
            if (r12 == 0) goto L_0x00da
            X.49S r9 = r4.A03
            java.lang.String r10 = "feed_engagement_unit_item"
            X.4DU r0 = r4.A01
            java.lang.String r11 = r0.getModuleName()
            X.GAN r7 = new X.GAN
            r7.<init>(r8, r9, r10, r11, r12)
            android.content.Context r1 = r8.getContext()
            com.instagram.common.session.UserSession r0 = r4.A00
            X.1Ua r0 = X.1UX.A00(r1, r0)
            X.0qQ.A07(r0)
            X.Hiv r2 = new X.Hiv
            r2.<init>(r0)
            X.49W r1 = r4.A02
            X.IcA r0 = new X.IcA
            r0.<init>(r6, r5, r4, r3)
            r1.A00(r2, r0, r7)
        L_0x00da:
            return
        L_0x00db:
            r3 = -1
            goto L_0x00a5
        L_0x00dd:
            com.instagram.reels.ui.StoryItemWithPreviewPlayer$start$2 r3 = new com.instagram.reels.ui.StoryItemWithPreviewPlayer$start$2
            r9 = r11
            r10 = r12
            r11 = r13
            r12 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0062
        L_0x00e8:
            java.util.Map r0 = r3.A0U
            r8 = r18
            java.lang.Object r0 = r0.get(r8)
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L_0x0108
            java.util.Iterator r1 = r0.iterator()
        L_0x00f8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0108
            java.lang.Object r0 = r1.next()
            X.4WT r0 = (X.AnonymousClass4WT) r0
            r0.DyB(r8)
            goto L_0x00f8
        L_0x0108:
            com.instagram.common.session.UserSession r1 = r3.A0A
            boolean r0 = X.C243223Xx.A01(r1, r8)
            if (r0 != 0) goto L_0x0117
            boolean r0 = X.C243223Xx.A00(r1, r8)
            r2 = 0
            if (r0 == 0) goto L_0x0118
        L_0x0117:
            r2 = 1
        L_0x0118:
            X.2uK r7 = r3.A0G
            r7.A0A = r2
            X.4M3 r0 = r7.A05
            if (r0 == 0) goto L_0x0123
            r0.ERk(r2)
        L_0x0123:
            r0 = 0
            r6.A0L(r3, r0, r4)
            r7.A08 = r14
            int r14 = r6.A01()
            boolean r0 = r6.A0p()
            if (r0 == 0) goto L_0x01b0
            int r12 = r6.getPosition()
        L_0x0137:
            int r4 = r6.A03
            boolean r2 = r6.A22
            boolean r0 = r6.A2H
            X.4DU r9 = r3.A0C
            r10 = r5
            r13 = r4
            r15 = r2
            r16 = r0
            r7.A0R(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.2xQ r0 = r3.A0E
            com.instagram.music.common.model.AudioOverlayTrack r4 = r0.A02
            if (r4 == 0) goto L_0x016e
            com.instagram.music.common.model.MusicAssetModel r0 = r4.A08
            if (r0 == 0) goto L_0x016e
            com.instagram.music.common.model.MusicDataSource r5 = r0.A05
            if (r5 == 0) goto L_0x016e
            X.Hrj r0 = r3.A05
            if (r0 != 0) goto L_0x016e
            android.content.Context r2 = r3.A0N
            int r0 = r4.A03
            X.Hrj r4 = new X.Hrj
            r4.<init>(r2, r1, r5, r0)
            X.2xy r2 = r4.A00
            if (r2 == 0) goto L_0x016c
            int r0 = r4.A01
            int r0 = r0 + r14
            r2.seekTo(r0)
        L_0x016c:
            r3.A05 = r4
        L_0x016e:
            X.3eu r2 = r8.A1S()
            if (r2 == 0) goto L_0x01da
            boolean r0 = r8.A5Y()
            if (r0 == 0) goto L_0x01b2
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x01eb
            X.1Xy r0 = r8.A0C
            X.1qt r0 = r0.BPu()
            if (r0 == 0) goto L_0x01da
            com.instagram.api.schemas.MediaCroppingCoordinatesIntf r2 = r0.B5Q()
            if (r2 == 0) goto L_0x01da
            X.4M7 r1 = X.AnonymousClass4M7.CUSTOM_CROP_TOP_COORDINATE
            X.4M3 r0 = r7.A05
            if (r0 == 0) goto L_0x0195
            r0.EjF(r1)
        L_0x0195:
            float r2 = r2.Asv()
            X.4M3 r0 = r7.A05
            if (r0 == 0) goto L_0x00da
            X.4M1 r0 = (X.AnonymousClass4M1) r0
            r0.A01 = r2
            X.4X8 r1 = r0.A0P
            if (r1 == 0) goto L_0x00da
            boolean r0 = r1 instanceof X.AnonymousClass4X7
            if (r0 == 0) goto L_0x00da
            X.4X7 r1 = (X.AnonymousClass4X7) r1
            com.instagram.ui.widget.textureview.ScalingTextureView r0 = r1.A02
            r0.A00 = r2
            return
        L_0x01b0:
            r12 = -1
            goto L_0x0137
        L_0x01b2:
            boolean r0 = r8.A5G()
            if (r0 == 0) goto L_0x00da
            android.content.Context r0 = r3.A0N
            boolean r0 = X.C255983v2.A00(r0)
            if (r0 != 0) goto L_0x01eb
            X.0rQ r0 = X.C231512rn.A00(r1)
            r9.getModuleName()
            boolean r0 = r0.A05(r8)
            if (r0 == 0) goto L_0x01e4
            int r0 = r2.A01
            float r1 = (float) r0
            int r0 = r2.A00
            float r0 = (float) r0
            float r1 = r1 / r0
            r0 = 1061158912(0x3f400000, float:0.75)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x01eb
        L_0x01da:
            X.4M7 r1 = X.AnonymousClass4M7.FILL
        L_0x01dc:
            X.4M3 r0 = r7.A05
            if (r0 == 0) goto L_0x00da
            r0.EjF(r1)
            return
        L_0x01e4:
            boolean r0 = X.AnonymousClass4U5.A00(r2)
            if (r0 == 0) goto L_0x01eb
            goto L_0x01da
        L_0x01eb:
            X.4M7 r1 = X.AnonymousClass4M7.FIT
            goto L_0x01dc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2xS.A0A(X.1Xj, X.3V3, X.3W1, X.4Lx, boolean, boolean):void");
    }

    public final /* synthetic */ void ADC(View view) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001e, code lost:
        r1 = X.AnonymousClass2xO.A00(r6, r5.A0A, r5.A0T);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0038, code lost:
        if ((r2 instanceof android.view.ViewGroup) != false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D6z(android.view.View r6) {
        /*
            r5 = this;
            r0 = 0
            X.0qQ.A0B(r6, r0)
            r5.A00 = r6
            r0 = 2131441822(0x7f0b389e, float:1.8505666E38)
            android.view.View r0 = r6.findViewById(r0)
            com.instagram.ui.listview.StickyHeaderListView r0 = (com.instagram.ui.listview.StickyHeaderListView) r0
            r5.A07 = r0
            X.2xX r4 = r5.A0F
            r4.A05 = r0
            r3 = 16908298(0x102000a, float:2.3877257E-38)
            android.view.View r2 = r6.findViewById(r3)
            if (r2 != 0) goto L_0x003a
            com.instagram.common.session.UserSession r1 = r5.A0A
            java.lang.Integer r0 = r5.A0T
            android.view.View r1 = X.AnonymousClass2xO.A00(r6, r1, r0)
            android.view.View r2 = r1.findViewById(r3)
            if (r2 != 0) goto L_0x003a
            r0 = 2131439344(0x7f0b2ef0, float:1.850064E38)
            android.view.View r2 = r1.findViewById(r0)
            X.0qQ.A07(r2)
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0042
        L_0x003a:
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            X.3Ar r0 = X.C238103Ao.A00(r2)
            r5.A03 = r0
        L_0x0042:
            X.3Ar r0 = r5.A03
            r4.A04 = r0
            X.2el r0 = r5.A0B
            if (r0 == 0) goto L_0x004c
            r0.A00 = r4
        L_0x004c:
            com.instagram.common.session.UserSession r1 = r5.A0A
            java.lang.String r0 = "ig_video_setting"
            boolean r0 = X.C238173Av.A02(r1, r0)
            if (r0 == 0) goto L_0x0064
            X.INx r2 = new X.INx
            r2.<init>(r5)
            X.1Ng r1 = r5.A0Q
            java.lang.Class<X.Osr> r0 = X.C71909Osr.class
            r1.A01(r2, r0)
            r5.A06 = r2
        L_0x0064:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2xS.D6z(android.view.View):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (r2 == X.AnonymousClass3W9.A05) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c9, code lost:
        if (r6 != null) goto L_0x00e1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DQp(X.AnonymousClass3W1 r26, int r27) {
        /*
            r25 = this;
            r15 = 0
            r2 = r26
            X.0qQ.A0B(r2, r15)
            r0 = 2
            r3 = r25
            r1 = r27
            if (r1 == r0) goto L_0x0118
            r0 = 3
            if (r1 == r0) goto L_0x0110
            r0 = 81
            if (r1 != r0) goto L_0x011f
            X.2uK r0 = r3.A0G
            X.3W8 r1 = r2.A3b
            java.lang.Object r2 = r1.A00
            X.3W9 r2 = (X.AnonymousClass3W9) r2
            X.0qQ.A0B(r2, r15)
            X.1Xj r1 = r0.A0G()
            if (r1 == 0) goto L_0x011f
            X.3W9 r4 = X.AnonymousClass3W9.Loading
            r3 = 1
            if (r2 == r4) goto L_0x006a
            com.instagram.common.session.UserSession r6 = r0.A0K
            boolean r4 = X.AnonymousClass3WP.A08(r6, r1)
            if (r4 == 0) goto L_0x006a
            X.3W9 r4 = X.AnonymousClass3W9.Translated
            if (r2 == r4) goto L_0x003c
            X.3W9 r4 = X.AnonymousClass3W9.PartiallyTranslated
            r22 = 0
            if (r2 != r4) goto L_0x003e
        L_0x003c:
            r22 = 1
        L_0x003e:
            X.2uT r4 = r0.A0L
            X.4DU r5 = r4.A00
            if (r22 == 0) goto L_0x00c4
            X.GKd r16 = X.C52236GKd.A0P
        L_0x0046:
            X.1Xy r4 = r1.A0C
            java.lang.String r4 = r4.CER()
            java.lang.String r20 = X.AnonymousClass3WP.A01(r4)
            if (r22 == 0) goto L_0x00c1
            java.lang.String r21 = X.AnonymousClass3WP.A00(r6, r1)
        L_0x0056:
            X.0qQ.A0B(r6, r15)
            boolean r23 = X.AnonymousClass3WS.A06(r6)
            boolean r24 = X.AnonymousClass3WP.A07(r6)
            r17 = r5
            r18 = r6
            r19 = r1
            X.C52086GEg.A0B(r16, r17, r18, r19, r20, r21, r22, r23, r24)
        L_0x006a:
            com.instagram.common.session.UserSession r9 = r0.A0K
            X.4Ne r5 = r0.A02
            r4 = 0
            if (r5 == 0) goto L_0x00bf
            boolean r5 = r5.A00
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r5)
        L_0x0077:
            boolean r16 = r1.CcK()
            boolean r17 = r1.CeS()
            boolean r18 = r1.A51()
            boolean r19 = r1.A4L()
            X.1Xy r5 = r1.A0C
            java.util.List r14 = r5.C9Z()
            X.3WR r10 = r1.CEL()
            X.1Xy r5 = r1.A0C
            com.instagram.user.model.User r5 = r5.CCd()
            if (r5 == 0) goto L_0x00bd
            java.lang.String r12 = r5.getId()
        L_0x009d:
            X.1Xy r5 = r1.A0C
            java.lang.String r13 = r5.CER()
            boolean r5 = X.AnonymousClass3WP.A09(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r8 = 2
            r7 = 3
            if (r5 == 0) goto L_0x00e4
            int r5 = r2.ordinal()
            if (r5 == r15) goto L_0x00c7
            if (r5 == r7) goto L_0x00cc
            if (r5 == r3) goto L_0x00cc
            if (r5 == r8) goto L_0x00e4
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00bd:
            r12 = r4
            goto L_0x009d
        L_0x00bf:
            r11 = r4
            goto L_0x0077
        L_0x00c1:
            java.lang.String r21 = ""
            goto L_0x0056
        L_0x00c4:
            X.GKd r16 = X.C52236GKd.A0Q
            goto L_0x0046
        L_0x00c7:
            X.4M3 r6 = r0.A05
            if (r6 == 0) goto L_0x00e4
            goto L_0x00e1
        L_0x00cc:
            X.4M3 r6 = r0.A05
            if (r6 == 0) goto L_0x00e4
            X.0qQ.A0B(r9, r15)
            boolean r5 = X.AnonymousClass3WS.A06(r9)
            if (r5 == 0) goto L_0x00e1
            java.util.Locale r4 = X.AnonymousClass1Q2.A02()
            java.lang.String r4 = r4.getLanguage()
        L_0x00e1:
            r6.EnT(r3, r4)
        L_0x00e4:
            X.3WR r1 = r1.CEL()
            boolean r1 = X.AnonymousClass3WS.A0B(r9, r1)
            if (r1 == 0) goto L_0x011f
            int r1 = r2.ordinal()
            if (r1 == r15) goto L_0x0108
            if (r1 == r7) goto L_0x0100
            if (r1 == r3) goto L_0x0100
            if (r1 == r8) goto L_0x011f
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0100:
            X.4M3 r0 = r0.A05
            if (r0 == 0) goto L_0x011f
            r0.EPC(r3)
            return
        L_0x0108:
            X.4M3 r0 = r0.A05
            if (r0 == 0) goto L_0x011f
            r0.EPC(r15)
            return
        L_0x0110:
            X.2uK r1 = r3.A0G
            boolean r0 = r2.A2H
            r1.A0V(r0)
            return
        L_0x0118:
            X.2uK r1 = r3.A0G
            boolean r0 = r2.A22
            r1.A0W(r0)
        L_0x011f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2xS.DQp(X.3W1, int):void");
    }

    public final void Dql(1Xj r7, AnonymousClass3V3 r8, AnonymousClass3W1 r9) {
        C238133Ar r4;
        int BLx;
        0qQ.A0B(r8, 2);
        View BQB = r8.BQB();
        if (BQB != null && (r4 = this.A03) != null && (BLx = r4.BLx(BQB)) != -1) {
            r4.Evr(BLx, Math.max((r4.CEd().getHeight() - BQB.getHeight()) / 2, AnonymousClass3D4.A00(this.A0N)));
        }
    }

    public final void Dxf(1Xj r5, String str) {
        Set<AnonymousClass4WT> set;
        0qQ.A0B(r5, 0);
        if (182.A06(0Tu.A05, this.A0A, 36327610778729010L) && (set = (Set) this.A0U.remove(r5)) != null) {
            for (AnonymousClass4WT Dxf : set) {
                Dxf.Dxf(r5, str);
            }
        }
    }

    public final void DyO(C257183wz r3, 1Xj r4) {
        C234502xy r0;
        0qQ.A0B(r4, 0);
        0qQ.A0B(r3, 1);
        AnonymousClass2lU r02 = this.A0S;
        if (r02 != null) {
            r02.A05(r4);
        }
        C56036Hrj hrj = this.A05;
        if (!(hrj == null || (r0 = hrj.A00) == null)) {
            r0.E2p();
        }
        Set<AnonymousClass4WT> set = (Set) this.A0U.remove(r4);
        if (set != null) {
            for (AnonymousClass4WT DyW : set) {
                DyW.DyW(r3, r4);
            }
        }
    }

    public final void EyF() {
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onCreate() {
    }

    public final void onDestroy() {
    }

    public final void onDestroyView() {
        this.A00 = null;
        this.A0G.A0L();
        1wn r2 = this.A06;
        if (r2 != null) {
            this.A0Q.A02(r2, C71909Osr.class);
        }
        AnonymousClass2xX r1 = this.A0F;
        r1.A0D.removeCallbacksAndMessages((Object) null);
        this.A07 = null;
        r1.A05 = null;
        this.A03 = null;
        r1.A04 = null;
        2el r0 = this.A0B;
        if (r0 != null) {
            r0.A00 = null;
        }
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        0qQ.A0B(view, 0);
        0qQ.A0B(keyEvent, 2);
        return this.A0G.onKey(view, i, keyEvent);
    }

    public final void onResume() {
        this.A08 = true;
        AnonymousClass2xX r1 = this.A0F;
        r1.A0A = true;
        if (!this.A0D.CRD() || this.A0M) {
            r1.A0D.sendEmptyMessage(0);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
    }

    public final void onStart() {
    }

    public final void onStop() {
    }

    public final void onViewCreated(View view, Bundle bundle) {
    }

    public final void onViewStateRestored(Bundle bundle) {
    }

    public final 1Xj A00() {
        int B6L;
        int BLQ;
        View BQB;
        1Xj A002;
        AnonymousClass2xX r7 = this.A0F;
        C238133Ar r6 = r7.A04;
        if (r6 == null || (B6L = r6.B6L()) > (BLQ = r6.BLQ())) {
            return null;
        }
        while (true) {
            C231332rR r8 = r7.A0H;
            AnonymousClass3V3 A012 = AnonymousClass3OG.A01(r7.A0F, r8, r6, B6L);
            if (!(A012 == null || (BQB = A012.BQB()) == null)) {
                int height = (int) (((float) BQB.getHeight()) * r7.A0B);
                StickyHeaderListView stickyHeaderListView = r7.A05;
                ViewGroup CEd = r6.CEd();
                0qQ.A07(CEd);
                if (C253923rd.A01(CEd, BQB, stickyHeaderListView) >= height && (A002 = AnonymousClass3OG.A00(r8, r6, B6L)) != null) {
                    return A002;
                }
            }
            if (B6L == BLQ) {
                return null;
            }
            B6L++;
        }
    }

    public final void A08(1Xj r9, AnonymousClass3V3 r10, AnonymousClass3W1 r11, C262864Gh r12, int i) {
        UserSession userSession = this.A0A;
        0qQ.A0B(userSession, 1);
        1Xj r2 = r9;
        if (!r9.A5D() || !r9.A4a() || ((!r9.A4q() && (r9.A1J() == null || !AnonymousClass30D.A0G(userSession))) || !AnonymousClass30D.A07(userSession))) {
            this.A0G.A0Q(r2, this.A0C, r10, r11, r12, i);
        }
    }

    public final void A0C(String str) {
        this.A0F.A0M.A0U(str, true, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b2, code lost:
        if (r0 != null) goto L_0x00b4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DYx(X.1Xj r9, int r10) {
        /*
            r8 = this;
            X.2lU r0 = r8.A0S
            if (r0 == 0) goto L_0x0007
            r0.A04(r9)
        L_0x0007:
            X.33x r2 = r8.A02
            if (r2 == 0) goto L_0x0032
            if (r9 == 0) goto L_0x0032
            X.4Fr r1 = X.AnonymousClass4Fr.A00
            com.instagram.common.session.UserSession r0 = r2.A06
            boolean r0 = r1.A01(r0, r9)
            if (r0 != 0) goto L_0x0030
            r0 = 1
            r2.A05 = r0
            java.util.List r0 = r2.A07
            java.util.Iterator r1 = r0.iterator()
        L_0x0020:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0030
            java.lang.Object r0 = r1.next()
            X.2xV r0 = (X.C234252xV) r0
            r0.EyF()
            goto L_0x0020
        L_0x0030:
            r2.A01 = r9
        L_0x0032:
            boolean r0 = r8.A0X
            if (r0 != 0) goto L_0x00c6
            android.content.Context r0 = r8.A0N
            com.instagram.common.session.UserSession r7 = r8.A0A
            r6 = 1
            boolean r0 = X.AnonymousClass46O.A00(r0, r7, r6)
            if (r0 == 0) goto L_0x00c6
        L_0x0041:
            X.2rR r5 = r8.A0D
            int r0 = r5.getCount()
            if (r10 >= r0) goto L_0x0052
            java.lang.Object r0 = r5.getItem(r10)
            if (r0 == r9) goto L_0x0052
            int r10 = r10 + 1
            goto L_0x0041
        L_0x0052:
            r3 = 0
        L_0x0053:
            int r10 = r10 + 1
            int r0 = r5.getCount()
            if (r10 >= r0) goto L_0x00c6
            r0 = 20
            if (r3 >= r0) goto L_0x00c6
            java.lang.Object r4 = r5.getItem(r10)
            if (r4 == 0) goto L_0x0053
            X.0qQ.A0B(r7, r6)
            boolean r0 = r4 instanceof X.1Xj
            if (r0 == 0) goto L_0x0053
            X.1Xj r4 = (X.1Xj) r4
            boolean r0 = X.C231122qu.A0S(r7, r4)
            if (r0 != 0) goto L_0x0053
            boolean r0 = r4.A5D()
            if (r0 != 0) goto L_0x0053
            if (r10 < 0) goto L_0x00dd
            int r0 = r5.getCount()
            if (r10 >= r0) goto L_0x00dd
            java.lang.Object r2 = r5.getItem(r10)
        L_0x0086:
            int r1 = r10 - r6
            if (r1 < 0) goto L_0x00db
            int r0 = r5.getCount()
            if (r1 >= r0) goto L_0x00db
            java.lang.Object r0 = r5.getItem(r1)
        L_0x0094:
            if (r2 == r0) goto L_0x0053
            if (r4 == r9) goto L_0x00d7
            boolean r0 = X.AnonymousClass3OG.A04(r7, r5, r4)
            if (r0 == 0) goto L_0x00d7
            X.3uP r3 = X.C255593uO.A00(r7)
            boolean r0 = r4.A5D()
            if (r0 == 0) goto L_0x00c7
            X.3W1 r0 = r5.BQr(r4)
            int r0 = r0.A03
            X.1Xj r0 = r4.A1c(r0)
            if (r0 == 0) goto L_0x00d2
        L_0x00b4:
            X.3WR r2 = r0.CEL()
        L_0x00b8:
            X.4DU r0 = r8.A0C
            java.lang.String r1 = r0.getModuleName()
            X.3vO r0 = new X.3vO
            r0.<init>(r2, r1)
            r3.A01(r0)
        L_0x00c6:
            return
        L_0x00c7:
            boolean r0 = r4.A5H()
            if (r0 == 0) goto L_0x00d2
            X.1Xj r0 = r4.A1b()
            goto L_0x00b4
        L_0x00d2:
            X.3WR r2 = r4.CEL()
            goto L_0x00b8
        L_0x00d7:
            int r3 = r3 + 1
            goto L_0x0053
        L_0x00db:
            r0 = 0
            goto L_0x0094
        L_0x00dd:
            r2 = 0
            goto L_0x0086
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2xS.DYx(X.1Xj, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0061, code lost:
        if (r4 != null) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DnU(X.1Xj r4, int r5, int r6, int r7) {
        /*
            r3 = this;
            X.33x r2 = r3.A02
            if (r2 == 0) goto L_0x0061
            if (r4 == 0) goto L_0x0047
            X.4Fr r1 = X.AnonymousClass4Fr.A00
            com.instagram.common.session.UserSession r0 = r2.A06
            boolean r0 = r1.A01(r0, r4)
            if (r0 != 0) goto L_0x0013
            r0 = 0
            r2.A05 = r0
        L_0x0013:
            r0 = 0
            r2.A01 = r0
        L_0x0016:
            X.2rR r0 = r3.A0D
            X.3W1 r2 = r0.BQr(r4)
            boolean r0 = r2.A2p
            r1 = 0
            if (r0 != 0) goto L_0x0025
            boolean r0 = r2.A2o
            if (r0 == 0) goto L_0x0026
        L_0x0025:
            r5 = 0
        L_0x0026:
            boolean r0 = r4.CcK()
            if (r0 == 0) goto L_0x0036
            boolean r0 = r3.A0W
            if (r0 == 0) goto L_0x0053
            boolean r0 = X.Ri8.A00()
            if (r0 == 0) goto L_0x0053
        L_0x0036:
            X.2uK r0 = r3.A0G
            X.4Ne r0 = r0.A02
            if (r0 == 0) goto L_0x0051
            int r0 = r0.A0D
        L_0x003e:
            r2.A0E(r1, r0)
        L_0x0041:
            r0 = 0
            r2.A0M(r3, r0, r1)
            r2.A0Q = r1
        L_0x0047:
            X.2xX r1 = r3.A0F
            r0 = -1
            r1.A01 = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.A00 = r0
            return
        L_0x0051:
            r0 = 0
            goto L_0x003e
        L_0x0053:
            X.2uK r0 = r3.A0G
            X.4Ne r0 = r0.A02
            if (r0 == 0) goto L_0x005f
            int r0 = r0.A0D
        L_0x005b:
            r2.A0E(r5, r0)
            goto L_0x0041
        L_0x005f:
            r0 = 0
            goto L_0x005b
        L_0x0061:
            if (r4 == 0) goto L_0x0047
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2xS.DnU(X.1Xj, int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003c, code lost:
        r4 = r5.A0F;
        r3 = r4.A0M;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DxJ() {
        /*
            r5 = this;
            X.2uK r0 = r5.A0G
            X.1Xj r0 = r0.A0G()
            if (r0 == 0) goto L_0x006d
            java.util.Map r1 = r5.A0J
            java.lang.String r0 = r0.getId()
            java.lang.Object r3 = r1.get(r0)
            X.VWK r3 = (X.VWK) r3
            if (r3 == 0) goto L_0x002d
            X.5qj r0 = r3.A00
            X.2xS r2 = r0.A04
            java.lang.String r1 = r3.A01
            java.util.Map r0 = r2.A0K
            r0.remove(r1)
            java.util.Map r0 = r2.A0J
            r0.remove(r1)
            X.1IX r1 = r3.A02
            X.0gF r0 = X.C60340gF.A00
            r1.resumeWith(r0)
        L_0x002d:
            com.instagram.common.session.UserSession r3 = r5.A0A
            X.0Tu r2 = X.0Tu.A05
            r0 = 36312586985931968(0x81021b002c04c0, double:3.027564456730256E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x006d
            X.2xX r4 = r5.A0F
            X.2uK r3 = r4.A0M
            X.1Xj r2 = r3.A0G()
            if (r2 == 0) goto L_0x006d
            X.4Ne r0 = r3.A02
            if (r0 == 0) goto L_0x006e
            X.3V3 r0 = r0.A08
            if (r0 == 0) goto L_0x006e
            X.3W1 r1 = r0.BQq()
        L_0x0052:
            boolean r0 = r2.A5G()
            if (r0 == 0) goto L_0x006d
            X.A0D.A00(r1)
            java.lang.String r0 = "preview_end"
            r3.A0T(r0)
            if (r1 == 0) goto L_0x0068
            X.AnonymousClass2xX.A05(r2, r1, r4)
            r0 = 0
            r1.A0Y = r0
        L_0x0068:
            X.2rR r0 = r4.A0H
            r0.Cs9(r2)
        L_0x006d:
            return
        L_0x006e:
            r1 = 0
            goto L_0x0052
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2xS.DxJ():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (r7.A0Q >= 1) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b2, code lost:
        if (r6 >= r0) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00bd, code lost:
        if (r7 == null) goto L_0x0080;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DxY() {
        /*
            r11 = this;
            X.2xX r10 = r11.A0F
            X.2uK r9 = r10.A0M
            X.1Xj r8 = r9.A0G()
            if (r8 == 0) goto L_0x0080
            X.4Ne r0 = r9.A02
            if (r0 == 0) goto L_0x00b5
            X.3V3 r0 = r0.A08
            if (r0 == 0) goto L_0x00b5
            X.3W1 r7 = r0.BQq()
            if (r7 == 0) goto L_0x00b6
            int r0 = r7.A0Q
            int r0 = r0 + 1
            r7.A0Q = r0
            r0 = 43
            X.AnonymousClass3W1.A00(r7, r0)
            X.3WB r1 = r7.A0l
            X.3WB r0 = X.AnonymousClass3WB.DISMISSED
            if (r1 == r0) goto L_0x00b6
            X.2xQ r0 = r10.A0L
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x00b6
            com.instagram.common.session.UserSession r2 = r10.A0F
            boolean r0 = X.C231122qu.A0T(r2, r8)
            r1 = 1
            if (r0 == 0) goto L_0x0088
            int r0 = r7.A0Q
            if (r0 < r1) goto L_0x00b6
        L_0x003c:
            java.lang.String r2 = "preview_end"
            X.A0D.A00(r7)
            X.0rQ r1 = r10.A0I
            X.4DU r0 = r10.A0G
            java.lang.String r0 = r0.getModuleName()
            X.4K5 r1 = r1.A03(r8, r0)
            X.4K5 r0 = X.AnonymousClass4K5.ENDCARD_AUTOPLAY
            if (r1 == r0) goto L_0x0054
            r9.A0T(r2)
        L_0x0054:
            boolean r0 = r8.A5G()
            if (r0 == 0) goto L_0x005d
            X.AnonymousClass2xX.A05(r8, r7, r10)
        L_0x005d:
            r0 = 0
            r7.A0Y = r0
            X.2rR r0 = r10.A0H
            r0.Cs9(r8)
        L_0x0065:
            X.2xb r1 = r10.A0K
            boolean r0 = r1.A04(r8)
            if (r0 == 0) goto L_0x0080
            X.0eM r0 = r1.A08
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0080
            X.3Ar r0 = r10.A04
            r1.A02(r8, r7, r0)
        L_0x0080:
            X.Hrj r0 = r11.A05
            if (r0 == 0) goto L_0x0087
            r0.A01()
        L_0x0087:
            return
        L_0x0088:
            boolean r0 = r8.A5G()
            if (r0 == 0) goto L_0x00b6
            boolean r0 = r7.A2p
            if (r0 != 0) goto L_0x00b6
            X.3Xs r1 = X.C243173Xr.A04
            X.4DU r0 = r10.A0G
            java.lang.String r0 = r0.getModuleName()
            boolean r0 = r1.A02(r2, r8, r0)
            if (r0 == 0) goto L_0x00b6
            boolean r0 = r7.A2e
            if (r0 != 0) goto L_0x00b6
            int r6 = r7.A0Q
            long r4 = r8.A1B()
            r2 = 10000(0x2710, double:4.9407E-320)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 2
            if (r1 <= 0) goto L_0x00b2
            r0 = 1
        L_0x00b2:
            if (r6 < r0) goto L_0x00b6
            goto L_0x003c
        L_0x00b5:
            r7 = 0
        L_0x00b6:
            X.GcE r0 = r10.A02
            if (r0 == 0) goto L_0x00bd
            r0.A06(r8, r7)
        L_0x00bd:
            if (r7 == 0) goto L_0x0080
            goto L_0x0065
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2xS.DxY():void");
    }

    public final void Dxw(1Xj r2, boolean z) {
        AnonymousClass2lU r0 = this.A0S;
        if (r0 != null) {
            r0.A07(r2, z);
        }
    }

    public final void EyU() {
        A0C("user_played_carousel_with_music");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        if (X.182.A06(X.0Tu.A05, X.C231512rn.A00(r3).A00, 36329333061337145L) != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        r5 = r2.BQr(r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPause() {
        /*
            r7 = this;
            X.Hrj r0 = r7.A05
            if (r0 == 0) goto L_0x000b
            X.2xy r0 = r0.A00
            if (r0 == 0) goto L_0x000b
            r0.pause()
        L_0x000b:
            X.2uK r4 = r7.A0G
            X.1Xj r6 = r4.A0G()
            if (r6 == 0) goto L_0x0053
            X.3Xs r5 = X.C243173Xr.A04
            com.instagram.common.session.UserSession r3 = r7.A0A
            X.2rR r2 = r7.A0D
            X.3W1 r1 = r2.BQr(r6)
            X.4DU r0 = r7.A0C
            java.lang.String r0 = r0.getModuleName()
            boolean r0 = r5.A01(r3, r6, r1, r0)
            if (r0 == 0) goto L_0x0053
            X.3W1 r5 = r2.BQr(r6)
            X.3WB r1 = r5.A0l
            X.3WB r0 = X.AnonymousClass3WB.ONSCREEN
            if (r1 == r0) goto L_0x0037
            X.3WB r0 = X.AnonymousClass3WB.DISMISSED
            if (r1 != r0) goto L_0x0053
        L_0x0037:
            boolean r0 = r5.A26
            if (r0 == 0) goto L_0x004e
            X.0rQ r0 = X.C231512rn.A00(r3)
            com.instagram.common.session.UserSession r3 = r0.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36329333061337145(0x811156000c4039, double:3.038154742247523E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0053
        L_0x004e:
            X.3WB r0 = X.AnonymousClass3WB.OFFSCREEN
            r5.A0K(r0)
        L_0x0053:
            X.2xX r2 = r7.A0F
            android.os.Handler r1 = r2.A0D
            r0 = 0
            r1.removeCallbacksAndMessages(r0)
            java.lang.String r0 = "fragment_paused"
            r4.A0T(r0)
            r0 = 0
            r7.A08 = r0
            r2.A0A = r0
            r7.A04 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2xS.onPause():void");
    }

    public final void A0B(1Xj r5, AnonymousClass4WT r6) {
        if (r5.A50()) {
            if (r5.equals(this.A0G.A0G())) {
                if (!182.A06(0Tu.A05, this.A0A, 36327610778663473L)) {
                    r6.DyW(C257183wz.CACHED, r5);
                    return;
                }
            }
            Map map = this.A0U;
            Set set = (Set) map.get(r5);
            if (set == null) {
                set = new HashSet();
                map.put(r5, set);
            }
            set.add(r6);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        if (r8 < ((long) r14)) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e1, code lost:
        if (r1 == false) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00fa, code lost:
        if (r0.booleanValue() == false) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0139, code lost:
        if (r5 != null) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x014f, code lost:
        if (r0 > r2) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dy1(X.1Xj r12, X.AnonymousClass3V3 r13, int r14, int r15) {
        /*
            r11 = this;
            X.3W1 r5 = r13.BQq()
            if (r5 == 0) goto L_0x000b
            r5.A0C = r15
            r5.A0C(r14)
        L_0x000b:
            X.2xX r4 = r11.A0F
            if (r5 == 0) goto L_0x0050
            X.2xb r7 = r4.A0K
            boolean r0 = r7.A0A
            if (r0 != 0) goto L_0x0050
            boolean r0 = r7.A04(r12)
            if (r0 == 0) goto L_0x013d
            X.0eM r0 = r7.A08
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0050
            X.0eM r0 = r7.A09
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r8 = r0.longValue()
            r1 = 1
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x0050
            long r0 = (long) r14
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x0050
        L_0x0040:
            int r0 = r5.A0Q
            int r0 = r0 + 1
            r5.A0Q = r0
            r0 = 43
            X.AnonymousClass3W1.A00(r5, r0)
            X.3Ar r0 = r4.A04
            r7.A02(r12, r5, r0)
        L_0x0050:
            boolean r6 = r12.A5I()
            if (r5 == 0) goto L_0x00ae
            X.3WB r1 = r5.A0l
            X.3WB r0 = X.AnonymousClass3WB.DISMISSED
            if (r1 != r0) goto L_0x00ae
        L_0x005c:
            com.instagram.common.session.UserSession r10 = r4.A0F
            X.4DU r9 = r4.A0G
            java.lang.String r0 = r9.getModuleName()
            boolean r0 = X.C243183Xs.A00(r10, r12, r0)
            if (r0 == 0) goto L_0x008f
            int r8 = r5.A0Q
            long r6 = r12.A1B()
            r2 = 10000(0x2710, double:4.9407E-320)
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            r0 = 2
            if (r1 <= 0) goto L_0x0078
            r0 = 1
        L_0x0078:
            if (r8 < r0) goto L_0x008f
            X.1Xj r0 = X.C250563lf.A08(r9, r10)
            if (r0 == 0) goto L_0x008f
            boolean r0 = r5.A1q
            if (r0 != 0) goto L_0x008f
            boolean r0 = X.A0D.A00(r5)
            if (r0 == 0) goto L_0x008f
            X.2rR r0 = r4.A0H
            r0.Cs9(r12)
        L_0x008f:
            java.util.Map r1 = r11.A0K
            java.lang.String r0 = r12.getId()
            java.lang.Object r2 = r1.get(r0)
            X.5MN r2 = (X.AnonymousClass5MN) r2
            if (r2 == 0) goto L_0x00ad
            float r1 = (float) r14
            float r0 = (float) r15
            float r1 = r1 / r0
            X.3rq r0 = r2.A00
            com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar r0 = r0.A02
            if (r0 == 0) goto L_0x00a9
            r0.setProgress(r1)
        L_0x00a9:
            X.5qj r0 = r2.A01
            r0.A00 = r1
        L_0x00ad:
            return
        L_0x00ae:
            boolean r0 = r12.CcK()
            if (r0 != 0) goto L_0x0139
            if (r5 == 0) goto L_0x00bd
            X.1sy r1 = r5.A0o
            X.1sy r0 = X.1sy.A0O
            if (r1 != r0) goto L_0x00bd
            goto L_0x005c
        L_0x00bd:
            com.instagram.common.session.UserSession r3 = r4.A0F
            X.4DU r2 = r4.A0G
            java.lang.String r0 = r2.getModuleName()
            boolean r0 = X.C243183Xs.A00(r3, r12, r0)
            if (r0 != 0) goto L_0x0139
            if (r6 != 0) goto L_0x00d3
            boolean r0 = r12.A5Y()
            if (r0 == 0) goto L_0x0139
        L_0x00d3:
            X.1Xy r0 = r12.A0C
            java.lang.Boolean r0 = r0.BuV()
            if (r0 == 0) goto L_0x00e3
            boolean r1 = r0.booleanValue()
            r0 = 15000(0x3a98, float:2.102E-41)
            if (r1 != 0) goto L_0x00e6
        L_0x00e3:
            r0 = 60000(0xea60, float:8.4078E-41)
        L_0x00e6:
            if (r14 < r0) goto L_0x0139
            if (r6 == 0) goto L_0x0134
            if (r5 == 0) goto L_0x0107
            X.1Xy r0 = r12.A0C
            java.lang.Boolean r0 = r0.BuV()
            if (r0 == 0) goto L_0x00fc
            boolean r0 = r0.booleanValue()
            r7 = 15000(0x3a98, float:2.102E-41)
            if (r0 != 0) goto L_0x00ff
        L_0x00fc:
            r7 = 60000(0xea60, float:8.4078E-41)
        L_0x00ff:
            long r0 = r12.A1B()
            int r6 = (int) r0
            int r6 = r6 - r7
            r5.A0Y = r6
        L_0x0107:
            java.lang.String r7 = "preview_end"
            boolean r6 = X.A0D.A00(r5)
            X.0rQ r1 = r4.A0I
            java.lang.String r0 = r2.getModuleName()
            X.4K5 r1 = r1.A03(r12, r0)
            X.4K5 r0 = X.AnonymousClass4K5.ENDCARD_AUTOPLAY
            if (r1 == r0) goto L_0x0120
            X.2uK r0 = r4.A0M
            r0.A0T(r7)
        L_0x0120:
            if (r6 == 0) goto L_0x0134
            java.lang.String r0 = "igtv_preview_end"
            X.3sc r1 = new X.3sc
            r1.<init>(r2, r0)
            java.lang.String r0 = r12.getId()
            r1.A5u = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.C233822wX.A0I(r3, r1, r2, r0)
        L_0x0134:
            X.2rR r0 = r4.A0H
            r0.Cs9(r12)
        L_0x0139:
            if (r5 == 0) goto L_0x008f
            goto L_0x005c
        L_0x013d:
            boolean r0 = r5.A2o
            if (r0 == 0) goto L_0x0050
            long r2 = r7.A01
            long r0 = (long) r15
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 <= 0) goto L_0x0153
            int r0 = r5.A0Q
            int r0 = r0 * r15
            int r0 = r0 + r14
            long r0 = (long) r0
        L_0x014d:
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x0050
            goto L_0x0040
        L_0x0153:
            long r0 = (long) r14
            goto L_0x014d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2xS.Dy1(X.1Xj, X.3V3, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0125, code lost:
        if (r14 != 0) goto L_0x0127;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onScroll(X.C238133Ar r21, int r22, int r23, int r24, int r25, int r26) {
        /*
            r20 = this;
            r0 = 1336815029(0x4fae2db5, float:5.8444621E9)
            int r11 = X.AnonymousClass0fD.A03(r0)
            r7 = 0
            r10 = r21
            X.0qQ.A0B(r10, r7)
            boolean r2 = r10.CWN()
            r9 = r20
            X.2xe r1 = r9.A0R
            r8 = r22
            r3 = r26
            if (r2 == 0) goto L_0x016e
            int r0 = r1.A00
            if (r0 <= r8) goto L_0x0168
            java.lang.Integer r0 = X.AnonymousClass05K.A00
        L_0x0021:
            r1.A01 = r0
        L_0x0023:
            r1.A00 = r8
        L_0x0025:
            X.2xW r6 = r9.A0H
            if (r2 == 0) goto L_0x0163
            android.view.ViewGroup r0 = r10.CEd()
            android.view.View r0 = r0.getChildAt(r7)
            if (r0 != 0) goto L_0x0112
            r6.A01 = r7
            r6.A00 = r7
            r6.A02 = r7
            r0 = 0
            r6.A03 = r0
            r6.A04 = r0
        L_0x003f:
            X.GcE r0 = r9.A01
            r14 = 0
            if (r0 == 0) goto L_0x0045
            r14 = 1
        L_0x0045:
            X.2uK r5 = r9.A0G
            X.3OB r15 = r5.A0J()
            X.0qQ.A0B(r15, r7)
            X.3OB r0 = X.AnonymousClass3OB.PLAYING
            if (r15 == r0) goto L_0x0056
            X.3OB r0 = X.AnonymousClass3OB.PREPARING
            if (r15 != r0) goto L_0x006a
        L_0x0056:
            X.1Xj r0 = r5.A0G()
            if (r0 == 0) goto L_0x006a
            X.2xQ r0 = r9.A0E
            boolean r0 = r0.A06
            if (r0 != 0) goto L_0x006a
            X.GV3 r0 = new X.GV3
            r0.<init>(r9)
            X.11Z.A02(r0)
        L_0x006a:
            boolean r0 = r9.A04
            r2 = 1
            if (r0 != 0) goto L_0x00ef
            r9.A04 = r2
        L_0x0071:
            X.2xX r4 = r9.A0F
            r4.A06 = r7
            X.33x r0 = r9.A02
            if (r0 == 0) goto L_0x007b
            r0.A04 = r7
        L_0x007b:
            X.2xg r0 = r9.A0I
            r1 = r23
            r0.A02(r8, r1)
            boolean r0 = r9.A08
            if (r0 != 0) goto L_0x008d
            r0 = -465271635(0xffffffffe44484ad, float:-1.4500489E22)
        L_0x0089:
            X.AnonymousClass0fD.A0A(r0, r11)
            return
        L_0x008d:
            boolean r0 = r5.A0Y()
            if (r0 == 0) goto L_0x00c2
            X.2xQ r0 = r9.A0E
            boolean r0 = r0.A07
            if (r0 != 0) goto L_0x00c2
            int r13 = r10.B6L()
            int r12 = r10.BLQ()
            if (r13 > r12) goto L_0x00c2
        L_0x00a3:
            X.2rR r0 = r9.A0D
            com.instagram.common.session.UserSession r14 = r9.A0A
            X.3V3 r3 = X.AnonymousClass3OG.A01(r14, r0, r10, r13)
            if (r3 == 0) goto L_0x00bd
            X.3OB r0 = X.AnonymousClass3OB.IDLE
            if (r15 == r0) goto L_0x00b5
            X.3OB r0 = X.AnonymousClass3OB.PAUSED
            if (r15 != r0) goto L_0x00bd
        L_0x00b5:
            X.AnonymousClass3OG.A02(r14, r3, r5)
            X.3da r0 = X.C245853da.SHOW
            X.AnonymousClass3OG.A03(r3, r0)
        L_0x00bd:
            if (r13 == r12) goto L_0x00c2
            int r13 = r13 + 1
            goto L_0x00a3
        L_0x00c2:
            X.2xQ r5 = r9.A0E
            boolean r0 = r5.A05
            if (r0 != 0) goto L_0x00d0
            X.GTx r0 = new X.GTx
            r0.<init>(r9, r10, r8, r1)
            X.11Z.A02(r0)
        L_0x00d0:
            X.GcE r14 = r9.A01
            long r0 = r6.A04
            boolean r3 = r9.A0V
            r18 = r2
            r19 = r3
            r16 = r0
            boolean r0 = X.AnonymousClass3OG.A05(r14, r15, r16, r18, r19)
            if (r0 == 0) goto L_0x00eb
            boolean r0 = r5.A04
            if (r0 != 0) goto L_0x00eb
            android.os.Handler r0 = r4.A0D
            r0.sendEmptyMessage(r7)
        L_0x00eb:
            r0 = 1695174944(0x650a5120, float:4.082394E22)
            goto L_0x0089
        L_0x00ef:
            long r0 = r6.A04
            long r12 = java.lang.Math.abs(r0)
            r3 = 0
            int r0 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0101
            r3 = 10000(0x2710, double:4.9407E-320)
            int r0 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0071
        L_0x0101:
            if (r14 != 0) goto L_0x0071
            X.2xX r0 = r9.A0F
            r0.A06 = r2
            X.33x r0 = r9.A02
            if (r0 == 0) goto L_0x010d
            r0.A04 = r2
        L_0x010d:
            r0 = -764553875(0xffffffffd26dd56d, float:-2.55371985E11)
            goto L_0x0089
        L_0x0112:
            int r13 = r0.getHeight()
            int r12 = r0.getTop()
            long r4 = android.os.SystemClock.elapsedRealtime()
            int r1 = r6.A01
            if (r8 != r1) goto L_0x0146
            int r14 = r6.A02
        L_0x0124:
            int r14 = r14 - r12
            if (r14 == 0) goto L_0x013e
        L_0x0127:
            long r2 = r6.A03
            r0 = 0
            int r15 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r15 == 0) goto L_0x013a
            long r15 = r4 - r2
            int r2 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x013a
            long r0 = (long) r14
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            long r0 = r0 / r15
        L_0x013a:
            r6.A04 = r0
            r6.A03 = r4
        L_0x013e:
            r6.A01 = r8
            r6.A00 = r13
            r6.A02 = r12
            goto L_0x003f
        L_0x0146:
            int r0 = r1 + 1
            if (r8 != r0) goto L_0x0150
            int r14 = r6.A00
            int r0 = r6.A02
            int r14 = r14 + r0
            goto L_0x0124
        L_0x0150:
            if (r8 <= r0) goto L_0x0156
            r14 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0127
        L_0x0156:
            int r0 = r1 + -1
            if (r8 != r0) goto L_0x015e
            int r14 = r6.A02
            int r14 = r14 - r13
            goto L_0x0124
        L_0x015e:
            if (r8 >= r0) goto L_0x013e
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0127
        L_0x0163:
            r6.A00(r3)
            goto L_0x003f
        L_0x0168:
            if (r0 >= r8) goto L_0x0023
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x0021
        L_0x016e:
            r1.A01(r3)
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2xS.onScroll(X.3Ar, int, int, int, int, int):void");
    }

    public final void onScrollStateChanged(C238133Ar r8, int i) {
        int A032 = AnonymousClass0fD.A03(-1315447831);
        boolean z = false;
        if (i != 0) {
            z = true;
        }
        AnonymousClass2xX r6 = this.A0F;
        r6.A09 = z;
        C2364833x r0 = this.A02;
        if (r0 != null) {
            r0.A03 = z;
        }
        1wS.A01(this.A0A).A0D(this.A0P, z);
        if (i == 0) {
            C234262xW r2 = this.A0H;
            r2.A01 = 0;
            r2.A00 = 0;
            r2.A02 = 0;
            r2.A03 = 0;
            r2.A04 = 0;
            r6.A0D.sendEmptyMessageDelayed(0, 200);
        } else if (!this.A0V) {
            r6.A0D.removeMessages(0);
        }
        if (z) {
            C232722uK r1 = this.A0G;
            Toast toast = r1.A00;
            if (toast != null) {
                toast.cancel();
            }
            r1.A00 = null;
        }
        AnonymousClass0fD.A0A(-1084034890, A032);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0107, code lost:
        if (r0.isLowRamDevice() == false) goto L_0x0109;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass2xS(android.content.Context r27, androidx.fragment.app.Fragment r28, com.instagram.common.session.UserSession r29, X.2el r30, X.AnonymousClass4DU r31, X.AnonymousClass2lU r32, X.C231332rR r33, X.C228412ld r34, X.AnonymousClass2xQ r35, java.lang.Integer r36, java.lang.String r37, boolean r38) {
        /*
            r26 = this;
            r16 = r37
            r4 = 1
            r0 = 4
            r7 = r33
            X.0qQ.A0B(r7, r0)
            r0 = 6
            r5 = r35
            X.0qQ.A0B(r5, r0)
            r6 = r26
            r6.<init>()
            r12 = r27
            r6.A0N = r12
            r13 = r29
            r6.A0A = r13
            r14 = r31
            r6.A0C = r14
            r6.A0D = r7
            r0 = r30
            r6.A0B = r0
            r0 = r36
            r6.A0T = r0
            r0 = r32
            r6.A0S = r0
            r10 = r28
            r6.A0O = r10
            r6.A0E = r5
            X.1Ng r0 = X.AnonymousClass1Nd.A00(r13)
            r6.A0Q = r0
            X.2xW r3 = new X.2xW
            r3.<init>()
            r6.A0H = r3
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r6.A0U = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r6.A0K = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r6.A0J = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r6.A0L = r0
            r2 = 0
            r21 = 0
            com.instagram.music.common.model.AudioOverlayTrack r0 = r5.A02
            if (r0 == 0) goto L_0x0066
            r21 = 1
        L_0x0066:
            if (r37 != 0) goto L_0x006a
            java.lang.String r16 = ""
        L_0x006a:
            X.2uK r11 = new X.2uK
            r15 = r34
            r19 = r4
            r20 = r4
            r18 = r4
            r17 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r6.A0G = r11
            X.0qg r0 = X.0qg.A01()
            int r0 = r0.A06()
            r9 = 0
            if (r0 <= r4) goto L_0x0087
            r9 = 1
        L_0x0087:
            r6.A0V = r9
            java.util.List r0 = r11.A0P
            r0.add(r6)
            java.util.List r0 = r11.A0R
            r0.add(r6)
            X.0Tu r8 = X.0Tu.A05
            r0 = 36315138193689622(0x81046d00010c16, double:3.029177850789085E-306)
            boolean r0 = X.182.A06(r8, r13, r0)
            r6.A0M = r0
            r0 = 36324277884497849(0x810cbd00072fb9, double:3.034957828058789E-306)
            boolean r0 = X.182.A06(r8, r13, r0)
            r6.A0W = r0
            X.2xX r0 = new X.2xX
            r16 = r12
            r18 = r13
            r19 = r14
            r20 = r7
            r21 = r5
            r22 = r6
            r23 = r11
            r24 = r3
            r25 = r9
            r15 = r0
            r17 = r10
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r6.A0F = r0
            X.2xd r0 = new X.2xd
            r0.<init>(r6)
            r6.A09 = r0
            r0 = r38
            r6.A0X = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.2xe r5 = new X.2xe
            r5.<init>(r0)
            r6.A0R = r5
            java.lang.String r16 = r14.getModuleName()
            X.2xf r3 = new X.2xf
            r3.<init>(r6)
            r0 = 29
            X.9L2 r1 = new X.9L2
            r1.<init>(r6, r0)
            X.2xg r0 = new X.2xg
            r14 = r5
            r15 = r3
            r17 = r1
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r6.A0I = r0
            java.lang.String r0 = "activity"
            java.lang.Object r0 = r12.getSystemService(r0)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            if (r0 == 0) goto L_0x0109
            boolean r0 = r0.isLowRamDevice()
            r1 = 19
            if (r0 != 0) goto L_0x010b
        L_0x0109:
            r1 = 10
        L_0x010b:
            com.facebook.video.heroplayer.ipc.HeroScrollSetting r0 = new com.facebook.video.heroplayer.ipc.HeroScrollSetting
            r0.<init>(r1, r4, r4, r2)
            r6.A0P = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2xS.<init>(android.content.Context, androidx.fragment.app.Fragment, com.instagram.common.session.UserSession, X.2el, X.4DU, X.2lU, X.2rR, X.2ld, X.2xQ, java.lang.Integer, java.lang.String, boolean):void");
    }
}
