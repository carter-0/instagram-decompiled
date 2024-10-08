package X;

import android.app.Activity;
import android.content.Intent;
import android.view.ViewGroup;
import com.instagram.archive.intf.ArchivePendingUpload;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.controller.magicmediaremix.MagicMediaRemixEditController;
import com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeStickerClientModel;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.sharetofriendsstory.v2.drawer.ShareToFriendsStoryDrawerController;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8X3  reason: invalid class name */
public final class AnonymousClass8X3 implements C3493580b {
    public final int A00;
    public final int A01;
    public final Activity A02;
    public final ViewGroup A03;
    public final AnonymousClass848 A04;
    public final AnonymousClass4DH A05;
    public final UserSession A06;
    public final TouchInterceptorFrameLayout A07;
    public final C357638Yz A08;
    public final C3510387i A09;
    public final AnonymousClass8QA A0A;
    public final AnonymousClass8QN A0B;
    public final AnonymousClass8K4 A0C;
    public final C355948Rz A0D;
    public final AnonymousClass8BA A0E;
    public final AnonymousClass8L1 A0F;
    public final AnonymousClass8LU A0G;
    public final AnonymousClass8MC A0H;
    public final TargetViewSizeProvider A0I;
    public final C3506485o A0J;
    public final C3499582p A0K;
    public final AnonymousClass80D A0L;
    public final AnonymousClass815 A0M;
    public final MagicMediaRemixEditController A0N;
    public final AnonymousClass8QG A0O;
    public final C356798Vg A0P;
    public final C356848Vl A0Q;
    public final C357068Wi A0R;
    public final AnonymousClass8DD A0S;
    public final AnonymousClass8WX A0T;
    public final C3506685r A0U;
    public final AnonymousClass842 A0V;
    public final C353788Jb A0W;
    public final AnonymousClass88Z A0X;
    public final AnonymousClass80U A0Y;
    public final ClipsTimelineEditorDrawerController A0Z;
    public final ClipsCreationViewModel A0a;
    public final C3510287h A0b;
    public final AnonymousClass846 A0c;
    public final C314676if A0d;
    public final C314676if A0e;
    public final ShareToFriendsStoryDrawerController A0f;
    public final AnonymousClass0eK A0g;
    public final AnonymousClass81T A0h;

    private AnonymousClass34S A00() {
        1A6 r10 = new 1A6(false);
        1A6 r11 = new 1A6(false);
        UserSession userSession = this.A06;
        C3499582p r8 = this.A0K;
        AnonymousClass8QN r3 = this.A0B;
        AnonymousClass8K4 r4 = this.A0C;
        AnonymousClass8MC r6 = this.A0H;
        AnonymousClass8L1 r5 = this.A0F;
        AnonymousClass8BA r1 = this.A0E;
        return C394559yJ.A00(userSession, r3, r4, r5, r6, this.A0L.A0h, r8, r1.A0T(), r10, r11, r1.A0p());
    }

    private ArchivePendingUpload A01() {
        String A062;
        int i;
        int i2;
        int i3;
        boolean z;
        C3499482o r1 = this.A0K.A02;
        int ordinal = r1.A01().ordinal();
        boolean z2 = false;
        if (ordinal != 0) {
            z2 = true;
            if (ordinal == 1) {
                C349307zv A042 = r1.A01.A04();
                A042.getClass();
                A062 = A042.A0k;
                i = A042.A0K;
                i2 = A042.A08;
                i3 = A042.A09;
                z = A042.A1D;
            } else {
                throw new UnsupportedOperationException("Unknown media type");
            }
        } else {
            C352218Cl A032 = r1.A01.A03();
            A032.getClass();
            A062 = A032.A06();
            i = A032.A09;
            i2 = A032.A06;
            i3 = A032.A07;
            z = A032.A13;
        }
        return new ArchivePendingUpload(A062, i, i2, i3, z2, z);
    }

    public static void A02(Intent intent, ShareMediaLoggingInfo shareMediaLoggingInfo, AnonymousClass8X3 r26) {
        String str;
        long j;
        String str2;
        int i;
        PromptStickerModel promptStickerModel;
        AnonymousClass8X3 r9 = r26;
        AnonymousClass80D r5 = r9.A0L;
        SuperlativeStickerClientModel superlativeStickerClientModel = r5.A16;
        ShareMediaLoggingInfo shareMediaLoggingInfo2 = shareMediaLoggingInfo;
        if (superlativeStickerClientModel != null) {
            str = C18241Vo8.A01(superlativeStickerClientModel.A00);
            if (182.A06(0Tu.A05, r9.A06, 36319424571514262L)) {
                shareMediaLoggingInfo2.A04 = 30;
            }
        } else {
            str = null;
        }
        Intent intent2 = intent;
        int intExtra = intent2.getIntExtra(AnonymousClass000.A00(2212), 0);
        long j2 = 0;
        long longExtra = intent2.getLongExtra(AnonymousClass000.A00(730), 0);
        long longExtra2 = intent2.getLongExtra(AnonymousClass000.A00(729), 0);
        long longExtra3 = intent2.getLongExtra(AnonymousClass000.A00(1913), 0);
        long longExtra4 = intent2.getLongExtra(AnonymousClass000.A00(1912), 0);
        int intExtra2 = intent2.getIntExtra(AnonymousClass000.A00(4748), 0) % 180;
        if (intExtra2 == 0) {
            j = longExtra2;
        } else {
            j = longExtra;
        }
        Long valueOf = Long.valueOf(j);
        if (intExtra2 != 0) {
            longExtra = longExtra2;
        }
        List asList = Arrays.asList(new Long[]{valueOf, Long.valueOf(longExtra)});
        List asList2 = Arrays.asList(new Long[]{Long.valueOf(longExtra4), Long.valueOf(longExtra3)});
        ArrayList arrayList = new ArrayList();
        arrayList.add(asList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(asList2);
        List list = r9.A0K.A02.A01.A0m;
        List<C365798nh> unmodifiableList = Collections.unmodifiableList(list);
        0qQ.A07(unmodifiableList);
        long j3 = 0;
        for (C365798nh A022 : unmodifiableList) {
            j3 += new File(A022.A02()).length();
        }
        List<C365798nh> unmodifiableList2 = Collections.unmodifiableList(list);
        0qQ.A07(unmodifiableList2);
        long j4 = 0;
        for (C365798nh r2 : unmodifiableList2) {
            C349307zv r22 = r2.A03;
            if (r22 != null) {
                j4 += (long) r22.A07;
            }
        }
        if (j4 != 0) {
            j2 = (j3 / j4) * 8000;
        }
        List unmodifiableList3 = Collections.unmodifiableList(list);
        0qQ.A07(unmodifiableList3);
        String A023 = ((C365798nh) unmodifiableList3.get(0)).A02();
        C3499382n r23 = r5.A12;
        if (r23 == null || (promptStickerModel = r23.A01) == null) {
            str2 = null;
        } else {
            str2 = promptStickerModel.A03;
        }
        UserSession userSession = r9.A06;
        0qQ.A0B(userSession, 0);
        if (intExtra == 0 || intExtra == 2) {
            i = 1;
        } else if (intExtra == 1) {
            i = 2;
        } else {
            i = -1;
            if (intExtra == 3) {
                i = 8;
            }
        }
        C62668KkU A072 = C59895JbK.A07(i);
        C357638Yz r3 = r9.A08;
        Integer A082 = r3.A08();
        ArrayList arrayList3 = new ArrayList((Collection) r3.A09.A00);
        TargetViewSizeProvider targetViewSizeProvider = r9.A0I;
        String moduleName = r9.A0h.getModuleName();
        C59895JbK.A0E(A072, userSession, (C279284yO) r3.A08.A00, shareMediaLoggingInfo2, targetViewSizeProvider, Boolean.valueOf(r9.A0E.A1D.A03.A0G), A082, Long.valueOf(j2), moduleName, str, A023, str2, arrayList3, arrayList, arrayList2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v1, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v2, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v3, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v4, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v5, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v7, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v8, resolved type: java.lang.Integer} */
    /* JADX WARNING: type inference failed for: r2v247, types: [X.07g, X.4DH] */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x07a3, code lost:
        r9 = X.27p.A01(r6).A02;
        r2 = ((X.B3d) r5).BUu();
        r9.A03(r2.A0S, r2.A0T, r2.A0m);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x08e8, code lost:
        if (r11.equals(r2.getId()) == false) goto L_0x08f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x09b4, code lost:
        if (X.182.A06(X.0Tu.A05, r6, 2342154896117072683L) != false) goto L_0x09b6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x0901  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x095f  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x096d  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x097a  */
    /* JADX WARNING: Removed duplicated region for block: B:385:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void Dmx(java.lang.Object r64, java.lang.Object r65, java.lang.Object r66) {
        /*
            r63 = this;
            r3 = r66
            r5 = r65
            r0 = r64
            X.80V r0 = (X.AnonymousClass80V) r0
            X.80V r5 = (X.AnonymousClass80V) r5
            int r0 = r0.ordinal()
            r1 = 0
            java.lang.Boolean r24 = java.lang.Boolean.valueOf(r1)
            r4 = r63
            switch(r0) {
                case 34: goto L_0x063a;
                case 39: goto L_0x0655;
                case 40: goto L_0x0676;
                case 41: goto L_0x068e;
                case 47: goto L_0x069a;
                case 48: goto L_0x0695;
                case 52: goto L_0x0695;
                case 58: goto L_0x06b4;
                default: goto L_0x0018;
            }
        L_0x0018:
            int r2 = r5.ordinal()
            r0 = 1
            switch(r2) {
                case 0: goto L_0x06bf;
                case 2: goto L_0x06de;
                case 11: goto L_0x0021;
                case 14: goto L_0x074b;
                case 34: goto L_0x021c;
                case 39: goto L_0x0751;
                case 41: goto L_0x022f;
                case 42: goto L_0x022f;
                case 47: goto L_0x0b95;
                case 48: goto L_0x0ba2;
                case 49: goto L_0x0bb1;
                case 50: goto L_0x0b95;
                case 52: goto L_0x0ba2;
                case 58: goto L_0x039d;
                case 81: goto L_0x0bc0;
                case 85: goto L_0x0567;
                case 86: goto L_0x0610;
                default: goto L_0x0020;
            }
        L_0x0020:
            return
        L_0x0021:
            boolean r2 = r3 instanceof X.C356138Ss
            if (r2 != 0) goto L_0x0020
            X.8Vl r2 = r4.A0Q
            X.8Vm r2 = r2.A00()
            r2.A06 = r0
            X.8WX r2 = r4.A0T
            X.8XA r2 = r2.A00()
            X.8hG r2 = r2.A02
            if (r2 == 0) goto L_0x0039
            r2.A0D = r1
        L_0x0039:
            X.82p r2 = r4.A0K
            X.82o r7 = r2.A02
            X.8nd r3 = r7.A01()
            X.8nd r2 = X.C365758nd.A04
            r8 = 1
            if (r3 != r2) goto L_0x0206
            X.82Y r2 = r7.A01
            X.8Cl r2 = r2.A03()
            r2.getClass()
            java.util.Set r2 = r2.A0B()
        L_0x0053:
            boolean r2 = r2.isEmpty()
            r6 = r2 ^ 1
        L_0x0059:
            X.80D r5 = r4.A0L
            java.lang.String r3 = r5.A2q
            java.lang.String r2 = "story_selfie_reply"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0066
            r6 = 0
        L_0x0066:
            X.82Y r2 = r7.A01
            X.8Cl r2 = r2.A03()
            if (r2 == 0) goto L_0x007b
            com.instagram.common.gallery.Medium r2 = r2.A0F
            if (r2 == 0) goto L_0x007b
            com.instagram.common.gallery.GeneratedMediaMetadata r2 = r2.A0E
            if (r2 == 0) goto L_0x007b
            boolean r2 = r2.A01
            if (r2 == 0) goto L_0x007b
            r6 = 1
        L_0x007b:
            X.82i r2 = r5.A18
            if (r2 == 0) goto L_0x00a5
            X.4DH r2 = r4.A05
            X.2YN r3 = new X.2YN
            r3.<init>(r2)
            java.lang.Class<X.88B> r2 = X.AnonymousClass88B.class
            X.2YL r2 = r3.A00(r2)
            X.88B r2 = (X.AnonymousClass88B) r2
            X.05G r3 = r2.A02
            X.19B r2 = X.19B.A00
            androidx.lifecycle.CoroutineLiveData r2 = X.C226292g8.A00(r2, r3)
            java.lang.Object r2 = r2.A02()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L_0x00a5
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x00a5
            r6 = 1
        L_0x00a5:
            X.9Qn r2 = r5.A13
            if (r2 == 0) goto L_0x0203
            boolean r2 = r2.A0G
            if (r2 == 0) goto L_0x0203
        L_0x00ad:
            if (r6 == 0) goto L_0x01ee
            if (r8 != 0) goto L_0x01ee
            X.8BA r2 = r4.A0E
            r2.A0n(r1)
        L_0x00b6:
            X.8Yz r3 = r4.A08
            X.80m r2 = r3.A08
            java.lang.Object r2 = r2.A00
            boolean r2 = r2 instanceof X.AnonymousClass80O
            if (r2 == 0) goto L_0x01bf
            com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController r5 = r4.A0Z
            boolean r2 = r5.A0L()
            if (r2 == 0) goto L_0x01bf
            X.WMw r2 = r5.A0C
            if (r2 == 0) goto L_0x00db
            X.0hq r3 = r2.A0E
            r2 = 2131433135(0x7f0b16af, float:1.8488047E38)
            androidx.fragment.app.Fragment r2 = r3.A0P(r2)
            if (r2 == 0) goto L_0x00db
            boolean r2 = r2 instanceof com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment
            if (r2 != 0) goto L_0x014e
        L_0x00db:
            boolean r6 = r5.A0L()
            boolean r2 = com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController.A0I(r5)
            r3 = r2 ^ 1
            r2 = 0
            com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController.A0F(r5, r2, r6, r3, r1)
            boolean r1 = com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController.A0I(r5)
            if (r1 == 0) goto L_0x014e
            r5.A0K(r0)
            X.8RM r1 = X.AnonymousClass8RM.A0B
            com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController.A0D(r5, r1)
            X.WMw r6 = r5.A0C
            if (r6 == 0) goto L_0x011d
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r3 = r5.A0b
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r1 = 866(0x362, float:1.214E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r2.putParcelable(r1, r3)
            X.K5P r3 = new X.K5P
            r3.<init>()
            r3.setArguments(r2)
            android.view.ViewGroup r2 = r6.A0B
            X.Apj r1 = new X.Apj
            r1.<init>(r3, r6, r0)
            r2.post(r1)
        L_0x011d:
            android.view.ViewGroup r3 = r5.A0X
            r0 = 2131433236(0x7f0b1714, float:1.8488252E38)
            android.view.View r2 = r3.requireViewById(r0)
            X.0qQ.A07(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            android.content.Context r1 = r5.A0W
            r0 = 2131100348(0x7f0602bc, float:1.7813075E38)
            int r1 = r1.getColor(r0)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.setColorFilter(r1, r0)
            r0 = 2131433235(0x7f0b1713, float:1.848825E38)
            android.view.View r1 = r3.requireViewById(r0)
            X.0qQ.A07(r1)
            r1.bringToFront()
            X.AML r0 = new X.AML
            r0.<init>(r5)
            X.AnonymousClass0fU.A00(r0, r1)
        L_0x014e:
            X.6if r0 = r4.A0e
            r0.getClass()
            java.lang.Object r0 = r0.get()
            X.8cb r0 = (X.C359318cb) r0
            android.os.Handler r1 = r0.A0T
            r0 = 0
            r1.removeCallbacksAndMessages(r0)
        L_0x015f:
            X.8nf r0 = X.C365768ne.A0A
            X.8ne r0 = r0.A00()
            X.Jvw r1 = r0.A02
            if (r1 == 0) goto L_0x0186
            X.0eK r0 = r4.A0g
            java.lang.Object r0 = r0.get()
            X.28D r0 = (X.28D) r0
            boolean r0 = X.C348017xk.A02(r0)
            if (r0 == 0) goto L_0x0186
            java.lang.String r1 = r1.A04
            com.instagram.common.session.UserSession r0 = r4.A06
            boolean r0 = X.C379209Sy.A00(r0, r1)
            if (r0 == 0) goto L_0x01b1
            X.88Z r0 = r4.A0X
            r0.DSt()
        L_0x0186:
            X.0eK r0 = r4.A0g
            java.lang.Object r1 = r0.get()
            X.28D r0 = X.28D.A2T
            if (r1 != r0) goto L_0x0020
            X.846 r1 = r4.A0c
            X.7zw r0 = r1.A00()
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x0020
            X.7zw r3 = r1.A00()
            android.view.ViewGroup r2 = r4.A03
            X.842 r0 = r4.A0V
            android.view.ViewGroup r1 = r0.A00
            r0 = 2131427752(0x7f0b01a8, float:1.847713E38)
            android.view.View r1 = r1.requireViewById(r0)
            X.8pz r0 = X.C366978pz.A0p
            r3.A01(r2, r1, r0)
            return
        L_0x01b1:
            java.lang.String r0 = "com.instagram.barcelona"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0186
            X.88Z r0 = r4.A0X
            r0.DrH()
            goto L_0x0186
        L_0x01bf:
            X.8aL r1 = X.C358088aL.A0I
            X.8aL[] r1 = new X.C358088aL[]{r1}
            boolean r1 = r3.A0V(r1)
            if (r1 == 0) goto L_0x015f
            com.instagram.sharetofriendsstory.v2.drawer.ShareToFriendsStoryDrawerController r6 = r4.A0f
            X.0eM r1 = r6.A03
            java.lang.Object r5 = r1.getValue()
            X.0qQ.A07(r5)
            X.WMw r5 = (X.C19140WMw) r5
            X.KXY r3 = new X.KXY
            r3.<init>()
            android.view.ViewGroup r2 = r5.A0B
            X.Apj r1 = new X.Apj
            r1.<init>(r3, r5, r0)
            r2.post(r1)
            X.6iH r0 = r6.A01
            r0.DV9(r6)
            goto L_0x015f
        L_0x01ee:
            X.80U r2 = r4.A0Y
            boolean r2 = r2.CZU()
            if (r2 == 0) goto L_0x00b6
            X.8Jb r2 = r4.A0W
            com.instagram.camera.effect.models.CameraAREffect r3 = r2.A00()
            X.8BA r2 = r4.A0E
            r2.A0h(r3)
            goto L_0x00b6
        L_0x0203:
            r8 = 0
            goto L_0x00ad
        L_0x0206:
            X.8nd r2 = X.C365758nd.A07
            if (r3 != r2) goto L_0x0219
            X.82Y r2 = r7.A01
            X.7zv r2 = r2.A04()
            r2.getClass()
            java.util.HashSet r2 = r2.A08()
            goto L_0x0053
        L_0x0219:
            r6 = 0
            goto L_0x0059
        L_0x021c:
            X.87i r3 = r4.A09
            X.9X8 r0 = r3.A09
            r2 = 0
            if (r0 == 0) goto L_0x0225
            r0.A00 = r2
        L_0x0225:
            X.87n r0 = r3.A0P
            X.4M3 r0 = r0.A01
            if (r0 == 0) goto L_0x0020
            r0.Eqr(r2, r1)
            return
        L_0x022f:
            X.8QG r2 = r4.A0O
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r3 = r2.A0D
            r34 = r3
            X.80D r5 = r2.A0A
            X.50r r23 = r5.A0H()
            X.8Yz r3 = r2.A02
            r30 = r3
            X.88B r3 = r2.A0F
            r28 = r3
            X.AtY r22 = new X.AtY
            r3 = r22
            r3.<init>(r2)
            X.8MC r3 = r2.A07
            X.8pV r33 = r3.A00()
            X.8Hx r4 = r2.A0C
            com.instagram.music.common.model.AudioOverlayTrack r39 = r4.Bru()
            boolean r61 = r4.FMp()
            java.lang.String r21 = r4.Ao9()
            X.Atf r20 = new X.Atf
            r3 = r20
            r3.<init>(r4)
            X.Atg r19 = new X.Atg
            r3 = r19
            r3.<init>(r4)
            java.lang.String r42 = r4.ASp()
            X.AtZ r18 = new X.AtZ
            r3 = r18
            r3.<init>(r2)
            X.8QA r3 = r2.A04
            X.8pU r32 = r3.A04()
            X.Ata r17 = new X.Ata
            r3 = r17
            r3.<init>(r2)
            X.82p r3 = r2.A09
            r29 = r3
            X.Atb r16 = new X.Atb
            r3 = r16
            r3.<init>(r2)
            X.8Ji r15 = r2.A03
            X.8DO r14 = r2.A0B
            X.8LU r13 = r2.A06
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r12 = r2.A08
            java.lang.String r6 = r5.A2D
            com.instagram.common.session.UserSession r4 = r5.A0S
            X.0qQ.A0B(r4, r0)
            X.0sn r3 = X.0sn.A00
            java.lang.String r43 = X.C59737JVv.A02(r4, r6, r3)
            X.Atk r11 = new X.Atk
            r11.<init>(r5)
            X.AuK r10 = new X.AuK
            r10.<init>(r2)
            X.Atc r9 = new X.Atc
            r9.<init>(r2)
            X.AtX r8 = new X.AtX
            r8.<init>(r5)
            X.Atd r7 = new X.Atd
            r7.<init>(r5)
            X.Ate r4 = new X.Ate
            r4.<init>(r5)
            r2 = r29
            X.82o r2 = r2.A02
            X.82Y r2 = r2.A01
            com.instagram.api.schemas.ACRType r2 = r2.A01
            r27 = r2
            com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel r2 = r5.A0k
            r62 = 0
            if (r2 == 0) goto L_0x02d4
            r62 = 1
        L_0x02d4:
            boolean r2 = r5.A3O
            if (r2 != 0) goto L_0x0399
            boolean r2 = r5.A3p
            if (r2 != 0) goto L_0x0399
            com.instagram.pendingmedia.model.recipients.PendingRecipient r2 = r5.A1S
            if (r2 == 0) goto L_0x0395
            boolean r2 = r2.A0Y
            if (r2 == 0) goto L_0x0395
            X.3QO r38 = X.AnonymousClass3QO.OPAL
        L_0x02e6:
            java.lang.String r2 = r5.A2V
            r26 = r2
            java.lang.String r2 = r5.A2T
            r25 = r2
            X.9Qn r2 = r5.A13
            if (r2 == 0) goto L_0x0392
            java.lang.String r3 = r2.A0D
        L_0x02f4:
            boolean r2 = r5.A3p
            r40 = 0
            if (r2 == 0) goto L_0x02fc
            r40 = r24
        L_0x02fc:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.instagram.pendingmedia.model.recipients.PendingRecipient r6 = r5.A1S
            if (r6 != 0) goto L_0x0314
            android.os.Parcelable$Creator r6 = com.instagram.pendingmedia.model.recipients.PendingRecipient.CREATOR
            com.instagram.common.session.UserSession r6 = r5.A0S
            X.0eE r5 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r5 = r5.A01(r6)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r6 = new com.instagram.pendingmedia.model.recipients.PendingRecipient
            r6.<init>((com.instagram.user.model.User) r5)
        L_0x0314:
            r2.add(r6)
            r5 = r23
            X.0qQ.A0B(r5, r1)
            r1 = r30
            X.0qQ.A0B(r1, r0)
            r1 = 7
            r0 = r21
            X.0qQ.A0B(r0, r1)
            r0 = 16
            X.0qQ.A0B(r15, r0)
            r0 = 17
            X.0qQ.A0B(r14, r0)
            r0 = 18
            X.0qQ.A0B(r13, r0)
            r0 = 19
            X.0qQ.A0B(r12, r0)
            r0 = r34
            X.0sa r0 = r0.A0N
            if (r0 == 0) goto L_0x0020
            java.lang.Object r5 = r0.invoke()
            X.8Xy r5 = (X.C357458Xy) r5
            if (r5 == 0) goto L_0x0020
            X.6oS r1 = X.C318116oQ.A00(r34)
            r48 = 0
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel$updateDraftAndNavigateToSharing$1 r0 = new com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel$updateDraftAndNavigateToSharing$1
            r37 = r28
            r41 = r21
            r44 = r26
            r45 = r25
            r46 = r3
            r47 = r2
            r49 = r22
            r50 = r20
            r51 = r19
            r52 = r18
            r53 = r17
            r54 = r16
            r55 = r11
            r56 = r9
            r57 = r8
            r58 = r7
            r59 = r4
            r60 = r10
            r24 = r0
            r25 = r27
            r26 = r30
            r27 = r15
            r28 = r12
            r30 = r14
            r31 = r13
            r35 = r23
            r36 = r5
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62)
            X.19B r3 = X.19B.A00
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            X.1Eo.A03(r2, r3, r0, r1)
            return
        L_0x0392:
            r3 = 0
            goto L_0x02f4
        L_0x0395:
            r38 = 0
            goto L_0x02e6
        L_0x0399:
            X.3QO r38 = X.AnonymousClass3QO.FAN_CLUB
            goto L_0x02e6
        L_0x039d:
            com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController r2 = r4.A0Z     // Catch:{ Exception -> 0x041d }
            boolean r2 = r2.A0L()     // Catch:{ Exception -> 0x041d }
            if (r2 == 0) goto L_0x041d
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r5 = r4.A0a     // Catch:{ Exception -> 0x041d }
            X.831 r2 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel.A00(r5)     // Catch:{ Exception -> 0x041d }
            int r12 = r2.A00     // Catch:{ Exception -> 0x041d }
            X.831 r2 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel.A00(r5)     // Catch:{ Exception -> 0x041d }
            java.util.List r2 = r2.A01     // Catch:{ Exception -> 0x041d }
            int r11 = r2.size()     // Catch:{ Exception -> 0x041d }
            X.80D r2 = r4.A0L     // Catch:{ Exception -> 0x041d }
            X.50r r2 = r2.A0H()     // Catch:{ Exception -> 0x041d }
            java.lang.String r10 = r2.A00     // Catch:{ Exception -> 0x041d }
            com.instagram.common.session.UserSession r2 = r4.A06     // Catch:{ Exception -> 0x041d }
            X.8A2 r7 = X.AnonymousClass8A1.A01(r2)     // Catch:{ Exception -> 0x041d }
            X.0eK r2 = r4.A0g     // Catch:{ Exception -> 0x041d }
            java.lang.Object r9 = r2.get()     // Catch:{ Exception -> 0x041d }
            X.28D r9 = (X.28D) r9     // Catch:{ Exception -> 0x041d }
            r2 = 2
            X.0qQ.A0B(r10, r2)     // Catch:{ Exception -> 0x041d }
            r2 = 3
            X.0qQ.A0B(r9, r2)     // Catch:{ Exception -> 0x041d }
            r2 = 4
            X.0qQ.A0B(r3, r2)     // Catch:{ Exception -> 0x041d }
            X.1QP r6 = r7.A0J     // Catch:{ Exception -> 0x041d }
            java.lang.String r5 = "postcapture"
            r2 = 613296938(0x248e2b2a, float:6.1655806E-17)
            X.AE4 r8 = r6.A01(r5, r2)     // Catch:{ Exception -> 0x041d }
            java.lang.String r2 = "duration_ms"
            r8.A05(r2, r12)     // Catch:{ Exception -> 0x041d }
            java.lang.String r2 = "num_segments"
            r8.A05(r2, r11)     // Catch:{ Exception -> 0x041d }
            java.lang.String r2 = "media_type"
            java.util.Map r6 = r8.A04     // Catch:{ Exception -> 0x041d }
            r6.put(r2, r10)     // Catch:{ Exception -> 0x041d }
            java.lang.String r5 = r9.name()     // Catch:{ Exception -> 0x041d }
            java.lang.String r2 = "entry_point"
            X.0qQ.A0B(r5, r0)     // Catch:{ Exception -> 0x041d }
            r6.put(r2, r5)     // Catch:{ Exception -> 0x041d }
            java.lang.Class r5 = r3.getClass()     // Catch:{ Exception -> 0x041d }
            java.util.Map r2 = X.0Yh.A03     // Catch:{ Exception -> 0x041d }
            X.0qQ.A0B(r5, r0)     // Catch:{ Exception -> 0x041d }
            java.lang.String r5 = X.0q1.A01(r5)     // Catch:{ Exception -> 0x041d }
            if (r5 != 0) goto L_0x0412
            java.lang.String r5 = ""
        L_0x0412:
            java.lang.String r2 = "quick_capture_event"
            r6.put(r2, r5)     // Catch:{ Exception -> 0x041d }
            long r5 = r8.A01()     // Catch:{ Exception -> 0x041d }
            r7.A0A = r5     // Catch:{ Exception -> 0x041d }
        L_0x041d:
            boolean r2 = r3 instanceof X.C356208Sz
            if (r2 == 0) goto L_0x0437
            X.8Sz r3 = (X.C356208Sz) r3
            com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController r4 = r4.A0Z
            X.9rv r5 = r3.A00
            java.lang.Boolean r7 = r3.A03
            r6 = 0
            java.lang.Boolean r8 = r3.A01
            boolean r11 = r3.A06
            boolean r12 = r3.A05
            java.lang.Integer r9 = r3.A04
            r10 = r6
            r4.A0J(r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x0437:
            boolean r2 = r3 instanceof X.AnonymousClass8T0
            if (r2 == 0) goto L_0x04d4
            com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController r2 = r4.A0Z
            X.WMw r3 = r2.A0C
            if (r3 != 0) goto L_0x0452
            X.8A2 r8 = r2.A0h
            java.lang.String r7 = "FragmentDrawerController null"
            X.1QP r6 = r8.A0J
            long r4 = r8.A0A
            java.lang.String r3 = ""
            r6.flowEndFail(r4, r7, r3)
            r3 = 0
            r8.A0A = r3
        L_0x0452:
            X.WMw r7 = r2.A0C
            if (r7 == 0) goto L_0x04ad
            boolean r3 = r2.A0L()
            if (r3 == 0) goto L_0x04c3
            X.80x r4 = r2.A0s
            com.instagram.common.session.UserSession r8 = r2.A0a
            X.80y r3 = X.C3495980z.A00(r8)
            X.0qQ.A0B(r3, r1)
            X.2Fj r1 = r4.A05
            r1.A0B(r3)
            X.8A2 r3 = r2.A0h
            X.1QP r1 = r3.A0J
            long r4 = r3.A0A
            X.AE4 r3 = new X.AE4
            r3.<init>(r1)
            r3.A01 = r4
            java.lang.String r1 = "swipe_entry"
            r3.A04(r1)
            X.9rv r10 = X.C390839rv.POST_CAPTURE
            X.50r r13 = r2.A0q
            com.instagram.creation.capture.quickcapture.sundial.edit.model.ClipsTimelineEditorConfig r12 = com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController.A03(r2)
            r11 = 0
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r9 = r2.A0b
            X.0eM r1 = r2.A0z
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r17 = r1.booleanValue()
            r14 = r11
            r15 = r11
            r16 = r0
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r4 = X.C63162KsV.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.8RN r1 = r2.A0g
            r4.A09 = r1
        L_0x04a1:
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            android.view.ViewGroup r3 = r7.A0B
            X.AoC r1 = new X.AoC
            r1.<init>(r4, r7)
            r3.post(r1)
        L_0x04ad:
            r2.A0K(r0)
            java.util.List r3 = r2.A0u
            r3.clear()
            X.831 r0 = r2.A0A
            if (r0 != 0) goto L_0x0bd2
            java.lang.String r0 = "segmentStore"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x04c3:
            X.9rv r6 = X.C390839rv.POST_CAPTURE
            X.50r r5 = r2.A0q
            com.instagram.creation.capture.quickcapture.sundial.edit.model.ClipsTimelineEditorConfig r4 = com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController.A03(r2)
            com.instagram.common.session.UserSession r3 = r2.A0a
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r1 = r2.A0b
            X.KLz r4 = X.C63163KsW.A00(r3, r1, r6, r4, r5)
            goto L_0x04a1
        L_0x04d4:
            boolean r0 = r3 instanceof X.C356058Sk
            if (r0 == 0) goto L_0x04ee
            com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController r0 = r4.A0Z
            X.9rv r22 = X.C390839rv.POST_CAPTURE
            r26 = 0
            X.9s3 r23 = X.C390919s3.VOICEOVER
        L_0x04e0:
            r21 = r0
            r25 = r24
            r27 = r26
            r28 = r1
            r29 = r1
            r21.A0J(r22, r23, r24, r25, r26, r27, r28, r29)
            return
        L_0x04ee:
            boolean r0 = r3 instanceof X.C356078Sm
            if (r0 == 0) goto L_0x050c
            X.8Sm r3 = (X.C356078Sm) r3
            java.lang.String r2 = r3.A00
            com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController r0 = r4.A0Z
            X.9rv r22 = X.C390839rv.POST_CAPTURE
            r23 = 0
            r21 = r0
            r25 = r24
            r26 = r23
            r27 = r2
            r28 = r1
            r29 = r1
            r21.A0J(r22, r23, r24, r25, r26, r27, r28, r29)
            return
        L_0x050c:
            boolean r0 = r3 instanceof X.C356088Sn
            if (r0 == 0) goto L_0x0519
            com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController r0 = r4.A0Z
            X.9rv r22 = X.C390839rv.POST_CAPTURE
            r26 = 0
            X.9s3 r23 = X.C390919s3.VOLUME
            goto L_0x04e0
        L_0x0519:
            boolean r0 = r3 instanceof X.C356098So
            if (r0 == 0) goto L_0x0526
            com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController r0 = r4.A0Z
            X.9rv r22 = X.C390839rv.POST_CAPTURE
            r26 = 0
            X.9s3 r23 = X.C390919s3.CLIP_LEVEL_EDIT
            goto L_0x04e0
        L_0x0526:
            boolean r0 = r3 instanceof X.C356068Sl
            if (r0 == 0) goto L_0x0533
            com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController r0 = r4.A0Z
            X.9rv r22 = X.C390839rv.POST_CAPTURE
            r26 = 0
            X.9s3 r23 = X.C390919s3.CUTOUT
            goto L_0x04e0
        L_0x0533:
            boolean r0 = r3 instanceof X.C356108Sp
            if (r0 == 0) goto L_0x0540
            com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController r0 = r4.A0Z
            X.9rv r22 = X.C390839rv.POST_CAPTURE
            r26 = 0
            X.9s3 r23 = X.C390919s3.REORDER
            goto L_0x04e0
        L_0x0540:
            boolean r0 = r3 instanceof X.C356118Sq
            if (r0 == 0) goto L_0x054d
            com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController r0 = r4.A0Z
            X.9rv r22 = X.C390839rv.POST_CAPTURE
            r26 = 0
            X.9s3 r23 = X.C390919s3.COLOR_FILTER
            goto L_0x04e0
        L_0x054d:
            boolean r0 = r3 instanceof X.C356128Sr
            if (r0 != 0) goto L_0x0020
            com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController r0 = r4.A0Z
            r23 = 0
            X.9rv r22 = X.C390839rv.POST_CAPTURE
            r21 = r0
            r25 = r24
            r26 = r23
            r27 = r23
            r28 = r1
            r29 = r1
            r21.A0J(r22, r23, r24, r25, r26, r27, r28, r29)
            return
        L_0x0567:
            com.instagram.creation.capture.quickcapture.controller.magicmediaremix.MagicMediaRemixEditController r3 = r4.A0N
            if (r3 == 0) goto L_0x0020
            com.instagram.creation.capture.quickcapture.controller.magicmediaremix.MagicMediaRemixEditController.A03(r3, r0)
            com.instagram.common.session.UserSession r4 = r3.A08
            android.app.Activity r2 = r3.A03
            X.37D r17 = X.AnonymousClass7ON.A00(r2)
            if (r17 == 0) goto L_0x0584
            r2 = r17
            X.37F r2 = (X.AnonymousClass37F) r2
            r2.A0N = r1
            r2.A0R = r0
            r2.A0U = r0
            r2.A0L = r1
        L_0x0584:
            r5 = 0
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 1053609165(0x3ecccccd, float:0.4)
            r6 = r5
            r9 = r7
            r10 = r0
            r11 = r1
            r12 = r1
            r13 = r1
            r14 = r1
            r15 = r1
            r16 = r1
            X.K6K r4 = X.LNF.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.AcK r2 = new X.AcK
            r2.<init>(r3)
            r4.A0F = r5
            r4.A0D = r5
            r4.A0R = r1
            r4.A0Q = r0
            r4.A01 = r0
            r4.A02 = r1
            r4.A0C = r2
            r4.A0L = r5
            r4.A0M = r5
            r4.A0H = r5
            r4.A0K = r5
            r4.A0G = r5
            r4.A0P = r1
            r4.A0S = r0
            r4.A0O = r1
            if (r17 == 0) goto L_0x05ca
            java.lang.Integer r19 = X.AnonymousClass05K.A00
            r20 = 255(0xff, float:3.57E-43)
            r21 = r20
            r22 = r1
            r18 = r4
            r17.A0N(r18, r19, r20, r21, r22)
        L_0x05ca:
            X.8Bb r0 = r3.A0E
            if (r0 == 0) goto L_0x05d1
            r0.Ejs(r1)
        L_0x05d1:
            X.0eM r0 = r3.A0I
            java.lang.Object r2 = r0.getValue()
            android.view.View r2 = (android.view.View) r2
            r0 = 2131435766(0x7f0b20f6, float:1.8493383E38)
            android.view.View r4 = r2.requireViewById(r0)
            X.0qQ.A07(r4)
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            android.content.Context r2 = r4.getContext()
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
            r0.<init>(r2, r1, r1)
            r4.setLayoutManager(r0)
            X.2t9 r0 = r3.A07
            r4.setAdapter(r0)
            X.80D r0 = r3.A0D
            java.lang.String r2 = r0.A2W
            if (r2 == 0) goto L_0x0020
            X.0eM r0 = r3.A0J
            java.lang.Object r1 = r0.getValue()
            X.0qQ.A07(r1)
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            X.An6 r0 = new X.An6
            r0.<init>(r3, r2)
            r1.execute(r0)
            return
        L_0x0610:
            com.instagram.creation.capture.quickcapture.controller.magicmediaremix.MagicMediaRemixEditController r4 = r4.A0N
            if (r4 == 0) goto L_0x0020
            android.app.Activity r2 = r4.A03
            X.37D r3 = X.AnonymousClass7ON.A00(r2)
            if (r3 == 0) goto L_0x062a
            r2 = r3
            X.37F r2 = (X.AnonymousClass37F) r2
            r2.A0N = r0
            r2.A0R = r1
            r2.A0U = r1
            r2.A0L = r0
            r3.A0B()
        L_0x062a:
            com.instagram.creation.capture.quickcapture.controller.magicmediaremix.MagicMediaRemixEditController.A03(r4, r1)
            java.util.List r1 = r4.A0H
            r1.clear()
            X.8Bb r1 = r4.A0E
            if (r1 == 0) goto L_0x0020
            r1.Ejs(r0)
            return
        L_0x063a:
            X.87i r6 = r4.A09
            X.85r r0 = r4.A0U
            X.85t r0 = r0.A02()
            int r2 = r0.BUw()
            int r0 = r0.BV2()
            int r2 = r2 - r0
            X.87n r0 = r6.A0P
            r0.A02(r2)
            r6.A08()
            goto L_0x0018
        L_0x0655:
            X.815 r7 = r4.A0M
            r6 = r3
            boolean r0 = r3 instanceof X.C356438Tw
            if (r0 == 0) goto L_0x0667
            X.8Tw r6 = (X.C356438Tw) r6
            int r2 = r6.A00
            android.content.Intent r0 = r6.A01
        L_0x0662:
            X.AnonymousClass815.A01(r0, r7, r2)
            goto L_0x0018
        L_0x0667:
            boolean r0 = r3 instanceof X.C356458Ty
            if (r0 == 0) goto L_0x0018
            X.8Ty r6 = (X.C356458Ty) r6
            boolean r0 = r6.A01
            r2 = 0
            if (r0 == 0) goto L_0x0673
            r2 = -1
        L_0x0673:
            android.content.Intent r0 = r6.A00
            goto L_0x0662
        L_0x0676:
            com.instagram.sharetofriendsstory.v2.drawer.ShareToFriendsStoryDrawerController r6 = r4.A0f
            X.0eM r0 = r6.A03
            java.lang.Object r2 = r0.getValue()
            X.0qQ.A07(r2)
            X.WMw r2 = (X.C19140WMw) r2
            r0 = 1
            r2.A05(r0)
            X.6iH r0 = r6.A01
            r0.D48(r6)
            goto L_0x0018
        L_0x068e:
            X.815 r0 = r4.A0M
            r0.A02(r3)
            goto L_0x0018
        L_0x0695:
            X.8Rz r0 = r4.A0D
            X.C355948Rz.A05(r0)
        L_0x069a:
            boolean r0 = r3 instanceof X.AnonymousClass8SD
            if (r0 != 0) goto L_0x06a2
            boolean r0 = r3 instanceof X.C356328Tl
            if (r0 == 0) goto L_0x0018
        L_0x06a2:
            X.8Rz r2 = r4.A0D
            X.C355948Rz.A06(r2)
            X.8DD r0 = r2.A0H
            if (r0 == 0) goto L_0x0018
            X.87G r0 = r0.A0D()
            r2.A09(r0)
            goto L_0x0018
        L_0x06b4:
            boolean r0 = r3 instanceof X.C356148St
            if (r0 == 0) goto L_0x0018
            X.8QG r0 = r4.A0O
            r0.A06()
            goto L_0x0018
        L_0x06bf:
            X.AnonymousClass8VQ.A02()
            X.87i r1 = r4.A09
            boolean r0 = r1.A0B()
            if (r0 == 0) goto L_0x06cd
            r1.A06()
        L_0x06cd:
            X.82p r0 = r4.A0K
            X.82o r0 = r0.A02
            r1 = 0
            X.82Y r0 = r0.A01
            r0.A09 = r1
            X.8Yd r1 = X.C357488Yc.A03
            com.instagram.common.session.UserSession r0 = r4.A06
            r1.A02(r0)
            return
        L_0x06de:
            boolean r0 = r3 instanceof X.AnonymousClass8SU
            if (r0 == 0) goto L_0x071e
            X.8BA r0 = r4.A0E
            r0.A0r()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Handler r2 = new android.os.Handler
            r2.<init>(r0)
            X.Ak3 r0 = new X.Ak3
            r0.<init>(r4)
            r2.post(r0)
            X.8SU r3 = (X.AnonymousClass8SU) r3
            java.lang.String r7 = r3.A01
            r9 = 0
            java.lang.String r12 = r3.A02
            int r13 = r3.A00
            java.lang.String r8 = "name_tag"
            X.8DD r0 = r4.A0S
            if (r0 == 0) goto L_0x071e
            X.848 r2 = r4.A04
            boolean r0 = r2.A02(r7)
            if (r0 != 0) goto L_0x071e
            X.84B r6 = X.AnonymousClass84B.OTHER
            X.8YD r5 = new X.8YD
            r10 = r9
            r11 = r9
            r14 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.05G r0 = r2.A00
            r0.Epw(r5)
        L_0x071e:
            X.87h r0 = r4.A0b
            X.8Jc r0 = r0.A00()
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto L_0x073b
            X.8Yz r3 = r4.A08
            X.8aL r2 = X.C358088aL.A0C
            X.8aL[] r0 = new X.C358088aL[]{r2}
            boolean r0 = r3.A0U(r0)
            if (r0 == 0) goto L_0x073b
            r3.A0K(r2)
        L_0x073b:
            X.82p r0 = r4.A0K
            X.82o r0 = r0.A02
            X.82Y r0 = r0.A01
            java.util.List r0 = r0.A0o
            r0.clear()
            X.8Wi r0 = r4.A0R
            r0.A00 = r1
            return
        L_0x074b:
            com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController r1 = r4.A0Z
            r1.A0K(r0)
            return
        L_0x0751:
            X.8QA r2 = r4.A0A
            r2.A0D(r1)
            boolean r2 = r3 instanceof X.AnonymousClass8SL
            if (r2 == 0) goto L_0x0981
            X.8SL r3 = (X.AnonymousClass8SL) r3
            java.lang.Integer r7 = r3.A00
            com.instagram.common.session.UserSession r6 = r4.A06
            X.27r r2 = X.27p.A01(r6)
            X.29K r9 = r2.A04
            X.29E r10 = r9.A03
            r8 = 0
            r5 = 518922243(0x1eee2003, float:2.521247E-20)
            r2 = 5000(0x1388, double:2.4703E-320)
            long r2 = r10.A03(r5, r2)
            r9.A01 = r2
            java.lang.String r9 = "use_case"
            java.lang.String r5 = "open_story_share_sheet"
            r10.A09(r2, r9, r5)
            X.8MC r9 = r4.A0H
            X.8PW r2 = r9.A01()
            java.util.LinkedHashMap r2 = r2.A09
            if (r2 == 0) goto L_0x0b62
            X.8PW r2 = r9.A01()
            java.util.LinkedHashMap r2 = r2.A09
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r3 = r2.iterator()
        L_0x0793:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x0b62
            java.lang.Object r5 = r3.next()
            android.graphics.drawable.Drawable r5 = (android.graphics.drawable.Drawable) r5
            boolean r2 = r5 instanceof X.B3d
            if (r2 == 0) goto L_0x0793
        L_0x07a3:
            X.B3d r5 = (X.B3d) r5
            X.27r r2 = X.27p.A01(r6)
            X.29I r9 = r2.A02
            com.instagram.music.common.model.MusicOverlayStickerModel r2 = r5.BUu()
            java.lang.String r5 = r2.A0S
            java.lang.String r3 = r2.A0T
            java.lang.String r2 = r2.A0m
            r9.A03(r5, r3, r2)
        L_0x07b8:
            X.0eM r2 = X.ADu.A02
            java.lang.Object r2 = r2.getValue()
            X.ADu r2 = (X.ADu) r2
            android.app.Activity r5 = r4.A02
            r2.A01(r5)
            X.80D r10 = r4.A0L
            X.82i r2 = r10.A18
            if (r2 == 0) goto L_0x09bd
            X.0wj r7 = X.0wj.A01
            r3 = 817903358(0x30c036fe, float:1.3985468E-9)
            java.lang.String r2 = "Opening old share sheet.  No Stories remix expected."
            X.0f9 r2 = r7.AEf(r2, r3)
            r2.report()
            boolean r7 = r10.A3g
        L_0x07db:
            X.82p r2 = r4.A0K
            X.82o r2 = r2.A02
            X.82Y r12 = r2.A01
            java.lang.Integer r2 = r12.A0B
            X.0qQ.A07(r2)
            java.lang.Integer r11 = X.AnonymousClass05K.A01
            r13 = 0
            if (r2 != r11) goto L_0x07ec
            r13 = 1
        L_0x07ec:
            X.34S r2 = r4.A00()
            java.lang.Object r3 = r2.A00
            com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim r3 = (com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim) r3
            java.lang.Object r2 = r2.A01
            r2.getClass()
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r2)
            X.0qQ.A0B(r6, r1)
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            java.lang.String r14 = r6.A05
            java.lang.String r2 = "IgSessionManager.SESSION_TOKEN_KEY"
            r8.putString(r2, r14)
            r2 = 917(0x395, float:1.285E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r8.putBoolean(r2, r7)
            r14 = 6
            r2 = 915(0x393, float:1.282E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r8.putBoolean(r2, r0)
            r2 = 435(0x1b3, float:6.1E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r8.putBoolean(r2, r7)
            X.8BA r7 = r4.A0E
            boolean r2 = X.AnonymousClass8BA.A0L(r7)
            r15 = r2 ^ 1
            r2 = 222(0xde, float:3.11E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r8.putBoolean(r2, r15)
            X.8it r2 = r7.A1q
            boolean r15 = r2.A06()
            r2 = 25
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r8.putBoolean(r2, r15)
            r2 = 436(0x1b4, float:6.11E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r8.putBoolean(r2, r13)
            r2 = 59
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r8.putParcelable(r2, r3)
            java.lang.String r3 = r7.A0T()
            r2 = 916(0x394, float:1.284E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r8.putString(r2, r3)
            java.lang.String r3 = r10.A2q
            r2 = 911(0x38f, float:1.277E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r8.putString(r2, r3)
            com.instagram.archive.intf.ArchivePendingUpload r3 = r4.A01()
            r2 = 135(0x87, float:1.89E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r8.putParcelable(r2, r3)
            r2 = 1147(0x47b, float:1.607E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r8.putParcelableArrayList(r2, r9)
            X.8Yz r2 = r4.A08
            X.80m r2 = r2.A08
            java.lang.Object r2 = r2.A00
            X.4yO r2 = (X.C279284yO) r2
            if (r2 != 0) goto L_0x09b9
            r2 = 0
        L_0x0896:
            r3 = 910(0x38e, float:1.275E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            r8.putString(r3, r2)
            java.lang.Integer r13 = r12.A0D
            if (r13 == 0) goto L_0x09a2
            int r3 = r13.intValue()
            if (r3 == r14) goto L_0x0999
            r2 = 3
            if (r3 == r2) goto L_0x0990
            r2 = 8
            if (r3 == r2) goto L_0x0987
            r2 = 7
            if (r3 != r2) goto L_0x09a2
            X.0Tu r14 = X.0Tu.A05
            r2 = 2342154909001974574(0x2081017b0000032e, double:4.058717587821027E-152)
        L_0x08ba:
            boolean r2 = X.182.A06(r14, r6, r2)
            r3 = r2 ^ 1
        L_0x08c0:
            r2 = 912(0x390, float:1.278E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r8.putBoolean(r2, r3)
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            if (r13 == r3) goto L_0x08ea
            if (r13 == r11) goto L_0x08ea
            java.lang.Integer r2 = X.AnonymousClass05K.A0u
            if (r13 != r2) goto L_0x08f3
            X.1Xj r2 = r10.A1C
            if (r2 == 0) goto L_0x08f3
            java.lang.String r11 = r6.A06
            com.instagram.user.model.User r2 = r2.A2A(r6)
            r2.getClass()
            java.lang.String r2 = r2.getId()
            boolean r2 = r11.equals(r2)
            if (r2 == 0) goto L_0x08f3
        L_0x08ea:
            r2 = 914(0x392, float:1.281E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r8.putBoolean(r2, r0)
        L_0x08f3:
            r11 = 1
            r2 = 913(0x391, float:1.28E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r8.putBoolean(r2, r0)
            X.82i r2 = r10.A18
            if (r2 == 0) goto L_0x091c
            r2 = 28
            java.lang.String r2 = X.C66579MXk.A00(r2)
            r8.putBoolean(r2, r0)
            java.lang.String r6 = "clips_reaction_share_sheet"
            r2 = 222(0xde, float:3.11E-43)
            java.lang.String r2 = X.C66579MXk.A00(r2)
            r8.putString(r2, r6)
            X.8Bb r2 = r7.A1k
            if (r2 == 0) goto L_0x091c
            r2.Ejs(r1)
        L_0x091c:
            int r13 = X.0nA.A08(r5)
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r6 = r4.A07
            int r2 = r6.getWidth()
            int r2 = r2 / 2
            float r2 = (float) r2
            r6.setPivotX(r2)
            int r2 = r4.A01
            float r2 = (float) r2
            r6.setPivotY(r2)
            r2 = 28
            java.lang.String r2 = X.C66579MXk.A00(r2)
            r8.putBoolean(r2, r0)
            r2 = 2210(0x8a2, float:3.097E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r8.putInt(r2, r13)
            X.K6L r6 = new X.K6L
            r6.<init>()
            r6.setArguments(r8)
            X.37E r2 = X.AnonymousClass37D.A00
            X.37D r8 = r2.A01(r5)
            r8.getClass()
            java.lang.Integer r14 = r12.A0B
            X.0qQ.A07(r14)
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            r12 = 0
            if (r14 != r2) goto L_0x0960
            r12 = 1
        L_0x0960:
            X.AaU r2 = new X.AaU
            r2.<init>(r4, r9, r13)
            r6.EcH(r2)
            r7.D19(r1)
            if (r12 == 0) goto L_0x0974
            X.8QN r2 = r4.A0B
            X.8QZ r2 = r2.A0c
            r2.A0C(r1, r1)
        L_0x0974:
            X.28D r2 = r10.A0B
            X.28D r1 = X.28D.A03
            if (r2 == r1) goto L_0x097b
            r11 = 0
        L_0x097b:
            X.0qQ.A0B(r5, r0)
            r8.A0H(r5, r6, r3, r11)
        L_0x0981:
            X.87i r0 = r4.A09
            r0.A07()
            return
        L_0x0987:
            X.0Tu r14 = X.0Tu.A05
            r2 = 2342154904707007277(0x2081017a0000032d, double:4.058713946053091E-152)
            goto L_0x08ba
        L_0x0990:
            X.0Tu r14 = X.0Tu.A05
            r2 = 2342154891822105386(0x208101770000032a, double:4.058703020749283E-152)
            goto L_0x08ba
        L_0x0999:
            X.0Tu r14 = X.0Tu.A05
            r2 = 2342154887527138089(0x2081017600000329, double:4.058699378981347E-152)
            goto L_0x08ba
        L_0x09a2:
            X.85o r2 = r4.A0J
            boolean r2 = r2.A03
            if (r2 == 0) goto L_0x09b6
            X.0Tu r14 = X.0Tu.A05
            r2 = 2342154896117072683(0x208101780000032b, double:4.058706662517219E-152)
            boolean r2 = X.182.A06(r14, r6, r2)
            r3 = 1
            if (r2 == 0) goto L_0x08c0
        L_0x09b6:
            r3 = 0
            goto L_0x08c0
        L_0x09b9:
            java.lang.String r2 = r2.A02
            goto L_0x0896
        L_0x09bd:
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            if (r7 == r2) goto L_0x0b5f
            X.28D r3 = r10.A0B
            X.28D r2 = X.28D.A03
            if (r3 == r2) goto L_0x0b5f
            X.28D r2 = X.28D.A04
            if (r3 == r2) goto L_0x0b5f
            X.82p r0 = r4.A0K
            X.82o r0 = r0.A02
            r21 = r0
            X.82Y r0 = r0.A01
            java.lang.Integer r2 = r0.A0B
            X.0qQ.A07(r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r11 = 0
            if (r2 != r0) goto L_0x09de
            r11 = 1
        L_0x09de:
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r3 = r4.A07
            int r0 = r3.getWidth()
            float r2 = (float) r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r0
            r3.setPivotX(r2)
            int r0 = r4.A01
            float r0 = (float) r0
            r3.setPivotY(r0)
            X.8BA r9 = r4.A0E
            r9.A0X()
            boolean r0 = r10.A3X
            if (r0 == 0) goto L_0x0a18
            boolean r0 = X.2cg.A01(r6)
            if (r0 == 0) goto L_0x0a18
            X.4DH r0 = r4.A05
            android.view.View r2 = r0.mView
            r2.getClass()
            r0 = 2131439026(0x7f0b2db2, float:1.8499996E38)
            android.view.View r2 = r2.requireViewById(r0)
            r0 = 2131099778(0x7f060082, float:1.7811919E38)
            int r0 = r5.getColor(r0)
            r2.setBackgroundColor(r0)
        L_0x0a18:
            X.34S r0 = r4.A00()
            java.lang.Object r13 = r0.A00
            com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim r13 = (com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim) r13
            java.lang.Object r0 = r0.A01
            r0.getClass()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            X.AaT r20 = new X.AaT
            r0 = r20
            r0.<init>(r4, r2, r11)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r0 = 59
            java.lang.String r14 = X.AnonymousClass000.A00(r0)
            r2.putParcelable(r14, r13)
            com.instagram.archive.intf.ArchivePendingUpload r3 = r4.A01()
            r0 = 135(0x87, float:1.89E-43)
            java.lang.String r12 = X.AnonymousClass000.A00(r0)
            r2.putParcelable(r12, r3)
            boolean r0 = X.AnonymousClass8BA.A0L(r9)
            r3 = r0 ^ 1
            r0 = 222(0xde, float:3.11E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putBoolean(r0, r3)
            r0 = 2211(0x8a3, float:3.098E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r0)
            r2.putBoolean(r7, r11)
            X.0Tu r0 = X.0Tu.A06
            r15 = 36321675134051968(0x810a5f00032680, double:3.033311838196379E-306)
            r2 = r15
            boolean r15 = X.182.A06(r0, r6, r2)
            com.instagram.archive.intf.ArchivePendingUpload r19 = r4.A01()
            X.8it r2 = r9.A1q
            boolean r18 = r2.A06()
            com.instagram.pendingmedia.model.recipients.PendingRecipient r10 = r10.A1S
            r16 = 36321675134314114(0x810a5f00072682, double:3.033311838362161E-306)
            r2 = r16
            boolean r0 = X.182.A06(r0, r6, r2)
            r3 = 1
            if (r0 == 0) goto L_0x0b59
            java.util.ArrayList r0 = r9.A0V()
            java.util.Iterator r2 = r0.iterator()
        L_0x0a94:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0b56
            java.lang.Object r0 = r2.next()
            X.3ui r0 = (X.C255783ui) r0
            java.lang.String r0 = r0.A1a
            if (r0 == 0) goto L_0x0a94
            r0 = 1
        L_0x0aa5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
        L_0x0aad:
            if (r0 == 0) goto L_0x0ab0
            r3 = 0
        L_0x0ab0:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            boolean r3 = r0.booleanValue()
            X.0qQ.A0B(r6, r1)
            X.K7n r0 = new X.K7n
            r0.<init>()
            r2 = r20
            r0.A01 = r2
            r0.A00 = r9
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            X.C227642jf.A04(r2, r6)
            r2.putParcelable(r14, r13)
            r13 = 223(0xdf, float:3.12E-43)
            java.lang.String r13 = X.AnonymousClass000.A00(r13)
            r2.putParcelable(r13, r8)
            r8 = r19
            r2.putParcelable(r12, r8)
            r8 = 25
            java.lang.String r12 = X.AnonymousClass000.A00(r8)
            r8 = r18
            r2.putBoolean(r12, r8)
            r2.putBoolean(r7, r11)
            r7 = 4087(0xff7, float:5.727E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r7)
            r2.putParcelable(r7, r10)
            r7 = 2214(0x8a6, float:3.102E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r7)
            r2.putBoolean(r7, r3)
            r0.setArguments(r2)
            X.7Pr r7 = new X.7Pr
            r7.<init>(r6)
            if (r15 == 0) goto L_0x0b4e
            r2 = 0
        L_0x0b0a:
            r7.A0d = r2
            r7.A1R = r15
            r7.A0U = r0
            X.9qN r2 = new X.9qN
            r2.<init>(r4)
            r7.A0X = r2
            r7.A1O = r1
            X.0Tu r8 = X.0Tu.A05
            r2 = 36327812642585308(0x810ff400073adc, double:3.0371932233066263E-306)
            boolean r2 = X.182.A06(r8, r6, r2)
            if (r2 == 0) goto L_0x0b37
            boolean r2 = X.C226122ff.A03()
            if (r2 == 0) goto L_0x0b4c
            int r3 = X.C226122ff.A00()
        L_0x0b30:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>(r1, r1, r1, r3)
            r7.A0G = r2
        L_0x0b37:
            X.7Pu r2 = r7.A00()
            r2.A02(r5, r0)
            r9.D19(r1)
            if (r11 == 0) goto L_0x0981
            X.8QN r0 = r4.A0B
            X.8QZ r0 = r0.A0c
            r0.A0C(r1, r1)
            goto L_0x0981
        L_0x0b4c:
            r3 = 0
            goto L_0x0b30
        L_0x0b4e:
            r2 = 2131973441(0x7f135541, float:1.9583918E38)
            java.lang.String r2 = r5.getString(r2)
            goto L_0x0b0a
        L_0x0b56:
            r0 = 0
            goto L_0x0aa5
        L_0x0b59:
            boolean r0 = r21.A0F()
            goto L_0x0aad
        L_0x0b5f:
            r7 = 0
            goto L_0x07db
        L_0x0b62:
            X.8PW r2 = r9.A01()
            java.util.Map r2 = r2.A0K
            if (r2 == 0) goto L_0x0b8a
            X.8PW r2 = r9.A01()
            java.util.Map r2 = r2.A0K
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r3 = r2.iterator()
        L_0x0b78:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x0b8a
            java.lang.Object r5 = r3.next()
            android.graphics.drawable.Drawable r5 = (android.graphics.drawable.Drawable) r5
            boolean r2 = r5 instanceof X.B3d
            if (r2 == 0) goto L_0x0b78
            goto L_0x07a3
        L_0x0b8a:
            X.27r r2 = X.27p.A01(r6)
            X.29I r2 = r2.A02
            r2.A03(r8, r8, r8)
            goto L_0x07b8
        L_0x0b95:
            X.8Rz r2 = r4.A0D
            X.8Fl r1 = r2.A0C
            X.7vP r0 = new X.7vP
            r0.<init>(r2)
            r1.A0U(r0)
            goto L_0x0bad
        L_0x0ba2:
            X.8Rz r2 = r4.A0D
            X.81m r0 = r2.A0K
            X.81t r0 = r0.A00()
            r0.FME()
        L_0x0bad:
            X.C355948Rz.A05(r2)
            return
        L_0x0bb1:
            X.8Rz r1 = r4.A0D
            X.81m r0 = r1.A0K
            X.81t r0 = r0.A00()
            r0.FMG()
            X.C355948Rz.A04(r1)
            return
        L_0x0bc0:
            X.80U r0 = r4.A0Y
            X.80T r0 = (X.AnonymousClass80T) r0
            X.80W r1 = r0.A01
            X.6if r0 = r4.A0d
            java.lang.Object r0 = r0.get()
            X.80b r0 = (X.C3493580b) r0
            r1.A02(r0)
            return
        L_0x0bd2:
            java.util.ArrayList r0 = r0.A05()
            java.util.Iterator r1 = r0.iterator()
        L_0x0bda:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0bf2
            java.lang.Object r0 = r1.next()
            X.51M r0 = (X.AnonymousClass51M) r0
            java.lang.String r0 = r0.A0E()
            X.51M r0 = X.LIO.A00(r0)
            r3.add(r0)
            goto L_0x0bda
        L_0x0bf2:
            X.8RL r1 = r2.A0n
            X.AbT r0 = X.C40396AbT.A00
            r1.A0F(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8X3.Dmx(java.lang.Object, java.lang.Object, java.lang.Object):void");
    }

    public AnonymousClass8X3(ViewGroup viewGroup, AnonymousClass848 r4, TouchInterceptorFrameLayout touchInterceptorFrameLayout, C357638Yz r6, C3510387i r7, AnonymousClass8QA r8, AnonymousClass8QN r9, AnonymousClass8K4 r10, C355948Rz r11, AnonymousClass8BA r12, AnonymousClass8L1 r13, AnonymousClass8LU r14, AnonymousClass8MC r15, TargetViewSizeProvider targetViewSizeProvider, C3506485o r17, C3499582p r18, AnonymousClass80D r19, AnonymousClass815 r20, AnonymousClass81T r21, MagicMediaRemixEditController magicMediaRemixEditController, AnonymousClass8QG r23, C356798Vg r24, C356848Vl r25, C357068Wi r26, AnonymousClass8DD r27, AnonymousClass8WX r28, C3506685r r29, AnonymousClass842 r30, C353788Jb r31, AnonymousClass88Z r32, AnonymousClass80U r33, ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController, ClipsCreationViewModel clipsCreationViewModel, C3510287h r36, AnonymousClass846 r37, C314676if r38, C314676if r39, ShareToFriendsStoryDrawerController shareToFriendsStoryDrawerController, AnonymousClass0eK r41, int i, int i2) {
        AnonymousClass80D r1 = r19;
        this.A0L = r1;
        this.A06 = r1.A0S;
        this.A02 = r1.A05;
        r1.A0M.getClass();
        this.A05 = r1.A0M;
        this.A0K = r18;
        this.A0Y = r33;
        this.A0D = r11;
        this.A0M = r20;
        this.A0O = r23;
        this.A09 = r7;
        this.A0U = r29;
        this.A0f = shareToFriendsStoryDrawerController;
        this.A0e = r38;
        this.A0A = r8;
        this.A0Z = clipsTimelineEditorDrawerController;
        this.A0E = r12;
        this.A0T = r28;
        this.A0b = r36;
        this.A08 = r6;
        this.A0R = r26;
        this.A0a = clipsCreationViewModel;
        this.A0g = r41;
        this.A0Q = r25;
        this.A0H = r15;
        this.A0W = r31;
        this.A0X = r32;
        this.A0B = r9;
        this.A0C = r10;
        this.A0F = r13;
        this.A0S = r27;
        this.A04 = r4;
        this.A0c = r37;
        this.A03 = viewGroup;
        this.A0V = r30;
        this.A07 = touchInterceptorFrameLayout;
        this.A01 = i;
        this.A00 = i2;
        this.A0J = r17;
        this.A0I = targetViewSizeProvider;
        this.A0h = r21;
        this.A0G = r14;
        this.A0P = r24;
        this.A0d = r39;
        this.A0N = magicMediaRemixEditController;
    }
}
