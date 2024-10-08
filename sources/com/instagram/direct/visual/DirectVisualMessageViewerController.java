package com.instagram.direct.visual;

import X.00k;
import X.0Tu;
import X.0nA;
import X.0qQ;
import X.0sc;
import X.0wc;
import X.182;
import X.1Nv;
import X.1P0;
import X.1Xj;
import X.1a8;
import X.1iA;
import X.1wY;
import X.1wn;
import X.1y1;
import X.1y3;
import X.1yX;
import X.2Dm;
import X.2FW;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass0iw;
import X.AnonymousClass0kN;
import X.AnonymousClass2Ep;
import X.AnonymousClass3BQ;
import X.AnonymousClass3E6;
import X.AnonymousClass3KG;
import X.AnonymousClass3KQ;
import X.AnonymousClass3WR;
import X.AnonymousClass4DH;
import X.AnonymousClass4DR;
import X.AnonymousClass4DU;
import X.AnonymousClass4EQ;
import X.AnonymousClass53G;
import X.AnonymousClass55L;
import X.AnonymousClass6Z2;
import X.AnonymousClass6g5;
import X.AnonymousClass75B;
import X.AnonymousClass77X;
import X.AnonymousClass79I;
import X.AnonymousClass7FJ;
import X.AnonymousClass7FN;
import X.AnonymousClass7GR;
import X.AnonymousClass7GS;
import X.AnonymousClass7H9;
import X.AnonymousClass7HA;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.AnonymousClass9IN;
import X.AnonymousClass9JI;
import X.C14044Tol;
import X.C19700We2;
import X.C226952iF;
import X.C230562pp;
import X.C242693Vo;
import X.C252063oV;
import X.C252213ok;
import X.C253833rU;
import X.C254703su;
import X.C254743sy;
import X.C254873tC;
import X.C254933tI;
import X.C2606746p;
import X.C2609947v;
import X.C271374ik;
import X.C271404in;
import X.C271434iq;
import X.C273404mW;
import X.C273434mZ;
import X.C282485Dg;
import X.C284745Nt;
import X.C294975nL;
import X.C312266e6;
import X.C313206g3;
import X.C314616iZ;
import X.C314626ia;
import X.C315436jt;
import X.C315596kB;
import X.C3263376i;
import X.C3263676m;
import X.C3265077a;
import X.C330367Mm;
import X.C332277Ui;
import X.C333527Zh;
import X.C333547Zj;
import X.C376649Iu;
import X.C46447Df9;
import X.C46548Dgp;
import X.C51966G9m;
import X.C51968G9o;
import X.C59681JTn;
import X.C59689JTv;
import X.C66580MXl;
import X.C66647MaG;
import X.C66819MdB;
import X.C67087Mi3;
import X.C67497Mor;
import X.C68167N3h;
import X.C70480O8f;
import X.C70485O8k;
import X.C70766OKm;
import X.C71392co;
import X.C71662eb;
import X.C71872OsF;
import X.C71932OtG;
import X.C72980PRn;
import X.DbS;
import X.DbU;
import X.DbX;
import X.Dba;
import X.Dbc;
import X.JTP;
import X.OCA;
import X.OCJ;
import X.OCM;
import X.OEL;
import X.OGO;
import X.OIE;
import X.OIU;
import X.OW6;
import X.Ot0;
import X.PCP;
import X.PF1;
import X.PFE;
import X.PJJ;
import X.PJO;
import X.PJP;
import X.PQI;
import X.Pxd;
import X.UVA;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import com.google.common.collect.ImmutableMap;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.stickerstore.DirectStoreStickerResponseItem;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar;
import com.instagram.ui.widget.volume.VolumeIndicator;
import com.instagram.user.model.User;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class DirectVisualMessageViewerController implements AnonymousClass4DR, C273404mW, C332277Ui, C313206g3, C312266e6, C252213ok, View.OnKeyListener {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public 1P0 A06;
    public AnonymousClass3KG A07;
    public AnonymousClass3KQ A08;
    public AnonymousClass3KQ A09;
    public CircularImageView A0A;
    public OIE A0B;
    public C67087Mi3 A0C;
    public C66819MdB A0D;
    public C71872OsF A0E;
    public C68167N3h A0F;
    public OW6 A0G;
    public C19700We2 A0H;
    public OCJ A0I;
    public OCM A0J;
    public C230562pp A0K;
    public 1Nv A0L;
    public C314626ia A0M;
    public OGO A0N;
    public C315436jt A0O;
    public C273404mW A0P;
    public String A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public final int A0c;
    public final RectF A0d;
    public final FragmentActivity A0e;
    public final AnonymousClass4DH A0f;
    public final AnonymousClass0iw A0g;
    public final 0wc A0h;
    public final 1wn A0i;
    public final 1wn A0j;
    public final 1wn A0k = C71932OtG.A00(this, 39);
    public final 1a8 A0l;
    public final UserSession A0m;
    public final AnonymousClass2Ep A0n;
    public final PCP A0o;
    public final 2Dm A0p;
    public final DirectThreadAnalyticsParams A0q;
    public final C330367Mm A0r;
    public final AnonymousClass7GR A0s;
    public final C70480O8f A0t;
    public final C70485O8k A0u;
    public final AnonymousClass4DU A0v;
    public final C273434mZ A0w;
    public final C254743sy A0x;
    public final ReelViewerConfig A0y;
    public final C314616iZ A0z;
    public final AnonymousClass6Z2 A10;
    public final String A11;
    public final String A12;
    public final String A13;
    public final String A14;
    public final String A15;
    public final String A16;
    public final HashSet A17;
    public final HashSet A18 = AnonymousClass7TE.A1F();
    public final List A19;
    public final List A1A;
    public final boolean A1B;
    public final boolean A1C;
    public final boolean A1D;
    public final boolean A1E;
    public final boolean A1F;
    public final boolean A1G;
    public final PJO A1H;
    public View backgroundDimmer;
    public C71662eb blurImageViewContainerStubHolder;
    public EditText composerEditText;
    public TextWatcher composerTextWatcher;
    public OIU contentHolder;
    public View contentView;
    public View itemView;
    public AnonymousClass3E6 keyboardHeightChangeDetector;
    public AnonymousClass6g5 photoTimerController;
    public C252063oV privacyOverlayStubHolder;
    public SegmentedProgressBar progressBar;
    public OEL reelViewerShadowAnimator;
    public View replyComposer;
    public View replyComposerContainer;
    public View rootView;
    public View selfViewFooterContainer;
    public C71662eb sparklerAnimationStubHolder;
    public View textSendButton;
    public C72980PRn videoPlayer;
    public TouchInterceptorFrameLayout viewerContainer;
    public View viewerInfoContainer;
    public VolumeIndicator volumeIndicator;

    public static final void A0G(DirectVisualMessageViewerController directVisualMessageViewerController) {
        C68167N3h n3h;
        OIU oiu;
        A0N(directVisualMessageViewerController, false);
        directVisualMessageViewerController.A0R = true;
        directVisualMessageViewerController.A0X("start");
        C68167N3h A022 = A02(directVisualMessageViewerController);
        int i = 0;
        if (!(A022 == null || !AnonymousClass7TF.A1W(A022.A0B, 1iA.A0a) || (oiu = directVisualMessageViewerController.contentHolder) == null)) {
            oiu.A04.setVisibility(0);
        }
        if (directVisualMessageViewerController.A0Y) {
            OW6 ow6 = directVisualMessageViewerController.A0G;
            if (ow6 != null) {
                i = ow6.A00;
                n3h = ow6.A00();
            } else {
                n3h = null;
            }
            A07(n3h, ow6, directVisualMessageViewerController, i);
        }
    }

    public static final void A0M(DirectVisualMessageViewerController directVisualMessageViewerController, String str, String str2) {
        directVisualMessageViewerController.A0U = true;
        UserSession userSession = directVisualMessageViewerController.A0m;
        Bundle A012 = C46447Df9.A03().A01.A01(userSession, C46548Dgp.A01(userSession, str, str2, directVisualMessageViewerController.A0v.getModuleName()).A04());
        DbU.A0w(directVisualMessageViewerController.A0e, A012, userSession, ModalActivity.class, "profile");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0076, code lost:
        if (r1 == -1) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0078, code lost:
        A0I(r8);
        A0H(r8);
        A0E(r8);
        r0 = r8.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0083, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0085, code lost:
        r1 = r0.A00;
        r0 = r0.A01(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008b, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008f, code lost:
        if (r0.A0Y == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0091, code lost:
        r0 = r8.progressBar;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0093, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0095, code lost:
        r0.A05(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0O(com.instagram.direct.visual.DirectVisualMessageViewerController r8, boolean r9) {
        /*
            r4 = 1
            r3 = 5
            if (r9 == 0) goto L_0x0005
            r3 = 1
        L_0x0005:
            X.2eb r2 = r8.sparklerAnimationStubHolder
            r7 = 0
            if (r2 == 0) goto L_0x002d
            boolean r0 = r2.A04()
            if (r0 != r4) goto L_0x002d
            r1 = 0
            android.view.View r2 = r2.A01()
            if (r2 == 0) goto L_0x001b
            android.graphics.drawable.Drawable r1 = r2.getBackground()
        L_0x001b:
            boolean r0 = r1 instanceof android.graphics.drawable.AnimationDrawable
            if (r0 == 0) goto L_0x0026
            android.graphics.drawable.AnimationDrawable r1 = (android.graphics.drawable.AnimationDrawable) r1
            if (r1 == 0) goto L_0x0026
            r1.stop()
        L_0x0026:
            android.view.View[] r0 = new android.view.View[]{r2}
            X.C315596kB.A08(r0, r4)
        L_0x002d:
            X.OW6 r2 = r8.A0G
            if (r2 == 0) goto L_0x00b0
            int r0 = r2.A00
            int r1 = r0 + 1
            java.util.List r0 = r2.A03
            int r0 = r0.size()
            if (r1 >= r0) goto L_0x00b0
            X.OW6 r0 = r8.A0G
            if (r0 == 0) goto L_0x00b0
            int r1 = r0.A00
            int r0 = r0.A01
            int r0 = r0 - r4
            if (r1 >= r0) goto L_0x00b0
        L_0x0048:
            A0F(r8)
            A0K(r8, r3)
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = r8.A0m
            com.instagram.user.model.User r6 = r1.A01(r0)
            X.OW6 r5 = r8.A0G
            if (r5 == 0) goto L_0x00cc
            int r2 = r5.A00
            int r1 = r2 + 1
        L_0x005e:
            java.util.List r0 = r5.A03
            int r0 = r0.size()
            int r1 = r1 % r0
            if (r1 == r2) goto L_0x009c
            X.N3h r0 = r5.A01(r1)
            if (r0 == 0) goto L_0x00c7
            boolean r0 = A0S(r0, r8, r6)
            if (r0 == 0) goto L_0x0099
            r5.A00 = r1
        L_0x0075:
            r0 = -1
            if (r1 == r0) goto L_0x00cc
            A0I(r8)
            A0H(r8)
            A0E(r8)
            X.OW6 r0 = r8.A0G
            if (r0 == 0) goto L_0x0098
            int r1 = r0.A00
            X.N3h r0 = r0.A01(r1)
            if (r0 == 0) goto L_0x0098
            boolean r0 = r0.A0Y
            if (r0 == 0) goto L_0x0098
            com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar r0 = r8.progressBar
            if (r0 == 0) goto L_0x0098
            r0.A05(r1)
        L_0x0098:
            return
        L_0x0099:
            int r1 = r1 + 1
            goto L_0x005e
        L_0x009c:
            X.N3h r1 = r5.A00()
            X.0qQ.A0B(r1, r7)
            com.instagram.direct.visual.model.DirectVisualMessageItemModel$MediaFields$RemixMedia r0 = r1.A08
            if (r0 != 0) goto L_0x00cc
            boolean r0 = A0S(r1, r8, r6)
            if (r0 == 0) goto L_0x00cc
            int r1 = r5.A00
            goto L_0x0075
        L_0x00b0:
            boolean r0 = r8.A0T
            if (r0 != 0) goto L_0x00bb
            if (r9 != 0) goto L_0x00cc
            boolean r0 = r8.A0Z
            if (r0 == 0) goto L_0x0098
            goto L_0x0048
        L_0x00bb:
            X.OCJ r0 = r8.A0I
            if (r0 != 0) goto L_0x0098
            X.OCJ r0 = new X.OCJ
            r0.<init>(r8, r9)
            r8.A0I = r0
            return
        L_0x00c7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x00cc:
            int r1 = r8.A0c
            r0 = 1
            if (r1 != r4) goto L_0x00d2
            r0 = 0
        L_0x00d2:
            A0L(r8, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.visual.DirectVisualMessageViewerController.A0O(com.instagram.direct.visual.DirectVisualMessageViewerController, boolean):void");
    }

    private final boolean A0R(C68167N3h n3h) {
        String str;
        PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel;
        Set A072 = 0sc.A07(new String[]{"once", "replayable"});
        if (n3h != null) {
            str = n3h.A0N;
        } else {
            str = null;
        }
        if (!00k.A0u(A072, str)) {
            if (n3h == null || (privacyMediaOverlayViewModel = n3h.A00) == null || privacyMediaOverlayViewModel.A00 != 2) {
                return false;
            }
            if (!182.A06(0Tu.A05, this.A0m, 36327464749906381L)) {
                return false;
            }
        }
        if (182.A06(0Tu.A05, this.A0m, 36327464749840844L)) {
            return true;
        }
        return false;
    }

    public final void A0W(String str) {
        C14044Tol tol;
        this.A0S = true;
        C72980PRn pRn = this.videoPlayer;
        if (!(pRn == null || pRn.A07 || (tol = pRn.A05) == null || pRn.A04 == null)) {
            pRn.A07 = true;
            pRn.A03 = System.currentTimeMillis();
            tol.A0A(str);
        }
        AnonymousClass6g5 r0 = this.photoTimerController;
        if (r0 != null) {
            r0.A00();
        }
    }

    public final void A0X(String str) {
        C72980PRn pRn;
        C14044Tol tol;
        this.A0S = false;
        C68167N3h A022 = A02(this);
        if (A022 == null || A022.A0B != 1iA.A0Q) {
            C68167N3h A023 = A02(this);
            if (A023 != null && AnonymousClass7TF.A1W(A023.A0B, 1iA.A0a) && (pRn = this.videoPlayer) != null && pRn.A06 && pRn.A07 && (tol = pRn.A05) != null) {
                pRn.A07 = false;
                pRn.A02 += System.currentTimeMillis() - pRn.A03;
                tol.A0C(str, false);
            }
        } else {
            AnonymousClass6g5 r0 = this.photoTimerController;
            if (r0 != null) {
                r0.A01();
            }
        }
        A0C(this);
    }

    public final void D9a() {
    }

    public final /* bridge */ /* synthetic */ void DaM(Object obj) {
        0qQ.A0B(obj, 0);
        A0O(this, false);
        C273404mW r0 = this.A0P;
        if (r0 != null) {
            r0.DaM(obj);
        }
    }

    public final /* bridge */ /* synthetic */ void DaT(Object obj, float f) {
        0qQ.A0B(obj, 0);
        SegmentedProgressBar segmentedProgressBar = this.progressBar;
        if (segmentedProgressBar != null) {
            segmentedProgressBar.setProgress(f);
        }
        this.A00 = f;
        C273404mW r0 = this.A0P;
        if (r0 != null) {
            r0.DaT(obj, f);
        }
    }

    public final void De5(String str) {
    }

    public final void De6() {
    }

    public final void Dj6() {
    }

    public final void EDY(String str) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r9 == 24) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onKey(android.view.View r8, int r9, android.view.KeyEvent r10) {
        /*
            r7 = this;
            r0 = 2
            X.0qQ.A0B(r10, r0)
            r3 = 0
            r2 = 25
            if (r9 == r2) goto L_0x000e
            r0 = 24
            r1 = 0
            if (r9 != r0) goto L_0x000f
        L_0x000e:
            r1 = 1
        L_0x000f:
            int r0 = r10.getAction()
            if (r0 != 0) goto L_0x0018
            if (r1 == 0) goto L_0x0018
            r3 = 1
        L_0x0018:
            r0 = 0
            if (r3 == 0) goto L_0x004a
            X.N3h r1 = A02(r7)
            if (r1 == 0) goto L_0x004a
            java.util.List r1 = r1.A0P
            X.0qQ.A0B(r1, r0)
            com.instagram.music.common.model.MusicOverlayStickerModel r1 = X.C271404in.A05(r1)
            if (r1 == 0) goto L_0x004a
            boolean r1 = r1.A0t
            if (r1 == 0) goto L_0x004a
            X.N3h r1 = A02(r7)
            if (r1 == 0) goto L_0x0049
            java.util.List r1 = r1.A0P
            if (r1 == 0) goto L_0x0049
            com.instagram.music.common.model.MusicOverlayStickerModel r1 = X.C271404in.A05(r1)
            if (r1 == 0) goto L_0x0049
            java.lang.String r2 = r1.A0j
            if (r2 == 0) goto L_0x0049
            androidx.fragment.app.FragmentActivity r1 = r7.A0e
            X.C59689JTv.A09(r1, r2)
        L_0x0049:
            return r0
        L_0x004a:
            X.PRn r1 = r7.videoPlayer
            if (r1 == 0) goto L_0x0049
            X.Tol r1 = r1.A05
            if (r1 == 0) goto L_0x0081
            java.lang.String r0 = "This operation must be run on UI thread."
            X.11Z.A06(r0)
            boolean r0 = r1.A02
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00b6
            X.TuR r3 = r1.A07
            r1 = 1
            java.lang.ref.WeakReference r0 = r3.A01
            if (r0 == 0) goto L_0x0083
            java.lang.Object r4 = r0.get()
            X.4Nf r4 = (X.C263754Nf) r4
        L_0x006a:
            android.media.AudioManager r6 = r3.A03
            r5 = 0
            if (r6 == 0) goto L_0x0081
            X.Tol r0 = r3.A00
            if (r0 == 0) goto L_0x0081
            if (r4 == 0) goto L_0x0081
            int r0 = r10.getAction()
            if (r0 != 0) goto L_0x0081
            r0 = 24
            if (r9 == r2) goto L_0x0085
            if (r9 == r0) goto L_0x0085
        L_0x0081:
            r0 = 0
            return r0
        L_0x0083:
            r4 = 0
            goto L_0x006a
        L_0x0085:
            r3.A02 = r1
            r2 = -1
            if (r9 != r0) goto L_0x008b
            r2 = 1
        L_0x008b:
            r1 = 3
            r0 = 8
            r6.adjustStreamVolume(r1, r2, r0)
            int r2 = r6.getStreamVolume(r1)
            X.Tum r0 = r3.A06
            int r1 = r6.getStreamMaxVolume(r1)
            X.Tol r0 = r0.A00
            X.7Pq r0 = r0.A00
            r0.Dyj(r2, r1)
            if (r2 <= 0) goto L_0x00a5
            r5 = 1
        L_0x00a5:
            boolean r0 = r4.A00
            if (r0 == 0) goto L_0x00b0
            if (r5 != 0) goto L_0x00ae
            r3.A01(r9)
        L_0x00ae:
            r0 = 1
            return r0
        L_0x00b0:
            if (r5 == 0) goto L_0x00ae
            r3.A02(r9)
            goto L_0x00ae
        L_0x00b6:
            java.lang.IllegalStateException r0 = X.DbT.A0m()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.visual.DirectVisualMessageViewerController.onKey(android.view.View, int, android.view.KeyEvent):boolean");
    }

    public static final int A00(DirectVisualMessageViewerController directVisualMessageViewerController, User user, String str) {
        OW6 ow6 = directVisualMessageViewerController.A0G;
        if (ow6 == null) {
            return -1;
        }
        int i = ow6.A00;
        List list = ow6.A03;
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                if (0qQ.A0K(((C68167N3h) list.get(i2)).A01(), str)) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        while (i2 != i && i2 != -1) {
            C68167N3h A012 = ow6.A01(i2);
            if (A012 == null) {
                throw AnonymousClass7TE.A0y();
            } else if (A0S(A012, directVisualMessageViewerController, user)) {
                ow6.A00 = i2;
                return i2;
            } else {
                i2 = (i2 + 1) % ow6.A03.size();
            }
        }
        if (A0S(ow6.A00(), directVisualMessageViewerController, user)) {
            return ow6.A00;
        }
        return -1;
    }

    public static final C254933tI A01(DirectVisualMessageViewerController directVisualMessageViewerController) {
        String str;
        String str2;
        C254703su r5;
        2FW r18;
        C282485Dg r7;
        DirectVisualMessageViewerController directVisualMessageViewerController2 = directVisualMessageViewerController;
        OW6 ow6 = directVisualMessageViewerController2.A0G;
        ImmutableMap immutableMap = null;
        if (ow6 != null) {
            C68167N3h A002 = ow6.A00();
            if (!(A002.A0X || (str = A002.A0K) == null || (str2 = A002.A0G) == null)) {
                boolean A1V = AnonymousClass7TF.A1V(A002.A08);
                C254743sy r52 = directVisualMessageViewerController2.A0x;
                if (r52 instanceof DirectThreadKey) {
                    r5 = directVisualMessageViewerController2.A0p.BRz(C66647MaG.A03(r52), str);
                } else {
                    r5 = null;
                }
                if (A1V) {
                    r18 = 2FW.A0y;
                } else {
                    r18 = 2FW.A0q;
                }
                String str3 = A002.A0M;
                C271374ik r12 = null;
                Boolean valueOf = Boolean.valueOf(A002.A0T);
                if (r5 != null) {
                    immutableMap = r5.A0K();
                }
                1Xj r9 = A002.A0A;
                if (!(r9 == null || (r7 = A002.A06) == null)) {
                    C271434iq r8 = A002.A07;
                    String str4 = A002.A0O;
                    int i = A002.A02;
                    r12 = C2606746p.A00(r7, r8, r9, Integer.valueOf(i), str4, A002.A0N, i);
                }
                return new C254933tI((C376649Iu) null, (AnonymousClass9JI) null, (AnonymousClass77X) null, (AnonymousClass7FN) null, (AnonymousClass7FJ) null, (AnonymousClass55L) null, r12, (C2609947v) null, (C254873tC) null, (UVA) null, (1Xj) null, (2FW) null, r18, (AnonymousClass53G) null, (DirectStoreStickerResponseItem) null, (ExtendedImageUrl) null, valueOf, str2, (String) null, str, "visual_media_viewer", str3, (String) null, (List) null, immutableMap, 0);
            }
        }
        return null;
    }

    public static final C68167N3h A02(DirectVisualMessageViewerController directVisualMessageViewerController) {
        OW6 ow6 = directVisualMessageViewerController.A0G;
        if (ow6 != null) {
            return ow6.A00();
        }
        return null;
    }

    private final C294975nL A03() {
        View view = this.contentView;
        if (view != null) {
            C71392co r0 = C315596kB.A02;
            C294975nL A0A2 = JTP.A0c(view, 0).A0A();
            A0A2.A04 = 0;
            A0A2.A03 = 4;
            C294975nL A0E2 = A0A2.A0E(C59681JTn.A00);
            A0E2.A05 = new PQI(this, 4);
            return A0E2;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final C294975nL A04(DirectVisualMessageViewerController directVisualMessageViewerController) {
        View view = directVisualMessageViewerController.contentView;
        if (view != null) {
            C71392co r0 = C315596kB.A02;
            C294975nL A0A2 = JTP.A0c(view, 0).A0A();
            A0A2.A04 = 0;
            C294975nL A0E2 = A0A2.A0E(C59681JTn.A00);
            A0E2.A05 = new PQI(directVisualMessageViewerController, 5);
            return A0E2;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final String A05(DirectVisualMessageViewerController directVisualMessageViewerController) {
        Editable text;
        String obj;
        EditText editText = directVisualMessageViewerController.composerEditText;
        if (!(editText == null || (text = editText.getText()) == null || (obj = text.toString()) == null)) {
            int length = obj.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                int i2 = length;
                if (!z) {
                    i2 = i;
                }
                boolean A132 = Dbc.A13(obj, i2);
                if (z) {
                    if (!A132) {
                        break;
                    }
                    length--;
                } else if (!A132) {
                    z = true;
                } else {
                    i++;
                }
            }
            String A0c2 = Dba.A0c(obj, length, i);
            if (A0c2 == null) {
                return "";
            }
            return A0c2;
        }
        return "";
    }

    public static final String A06(DirectVisualMessageViewerController directVisualMessageViewerController) {
        String str;
        DirectThreadKey A042 = C66647MaG.A04(directVisualMessageViewerController.A0x);
        if (A042 != null && (str = A042.A00) != null) {
            return str;
        }
        throw AnonymousClass7TE.A0y();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0008: MOVE  (r12v0 int) = (r23v0 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public static final void A07(X.C68167N3h r20, X.OW6 r21, com.instagram.direct.visual.DirectVisualMessageViewerController r22, int r23) {
        /*
            r4 = r22
            X.OW6 r0 = r4.A0G
            if (r0 == 0) goto L_0x0017
            int r0 = r0.A00
            r12 = r23
            if (r12 != r0) goto L_0x0017
            int r0 = r4.A03
            r14 = 1
            if (r0 != r14) goto L_0x0017
            boolean r0 = r4.A0R
            if (r0 != 0) goto L_0x0018
            r4.A0Y = r14
        L_0x0017:
            return
        L_0x0018:
            X.MdB r0 = r4.A0D
            if (r0 == 0) goto L_0x001f
            r0.Ddt()
        L_0x001f:
            r10 = 0
            r1 = r20
            if (r20 == 0) goto L_0x0237
            java.lang.String r5 = r1.A0K
        L_0x0026:
            X.OIE r6 = r4.A0B
            if (r6 != 0) goto L_0x0034
            java.lang.String r8 = "directVisualViewerSummaryLogger"
        L_0x002c:
            X.0qQ.A0F(r8)
        L_0x002f:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0034:
            if (r20 == 0) goto L_0x005b
            java.lang.String r3 = r1.A0I
            if (r3 == 0) goto L_0x005b
            java.util.List r2 = r6.A0B
            boolean r0 = r2.contains(r3)
            if (r0 != 0) goto L_0x005b
            X.1iA r7 = r1.A0B
            X.1iA r0 = X.1iA.A0Q
            if (r7 != r0) goto L_0x022a
            int r0 = r6.A02
            int r0 = r0 + 1
            r6.A02 = r0
        L_0x004e:
            boolean r0 = r1.A0Y
            if (r0 == 0) goto L_0x0216
            int r0 = r6.A05
            int r0 = r0 + 1
            r6.A05 = r0
        L_0x0058:
            r2.add(r3)
        L_0x005b:
            if (r5 == 0) goto L_0x009d
            java.util.HashSet r6 = r4.A18
            boolean r0 = r6.contains(r5)
            if (r0 != 0) goto L_0x009d
            com.instagram.common.session.UserSession r15 = r4.A0m
            java.lang.String r2 = r15.A06
            java.lang.String r0 = r1.A0M
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 != 0) goto L_0x009d
            X.3sy r8 = r4.A0x
            boolean r0 = r8 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            if (r0 == 0) goto L_0x017f
            X.PCP r9 = r4.A0o
            X.6Ea r0 = X.PCP.A00(r9)
            long r2 = java.lang.Long.parseLong(r5)
            X.1aU r8 = r0.A02
            r7 = 4
            X.Our r0 = new X.Our
            r0.<init>(r2, r7)
            X.1aU r2 = r8.A0M(r0)
            java.lang.String r0 = "tam_mark_visual_message_seen"
            X.1aU r3 = X.C66582MXn.A0N(r2, r0)
            X.1a8 r2 = r9.A00
            X.PTy r0 = X.C73041PTy.A00
            r2.A02(r3, r0)
            r6.add(r5)
        L_0x009d:
            java.lang.String r7 = "Required value was null."
            r6 = r21
            if (r21 == 0) goto L_0x0109
            if (r1 == 0) goto L_0x0109
            java.lang.String r5 = r1.A0I
            X.PFy r11 = new X.PFy
            r11.<init>(r5)
            com.instagram.user.model.User r3 = r1.A0C
            X.3sy r0 = r4.A0x
            com.instagram.model.direct.DirectThreadKey r0 = X.C66647MaG.A04(r0)
            if (r0 == 0) goto L_0x017c
            java.lang.String r2 = r0.A00
        L_0x00b8:
            r11.A05 = r5
            X.1iA r0 = r1.A0B
            r11.A00 = r0
            java.lang.String r0 = r4.A16
            r11.A07 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r11.A03 = r0
            java.util.List r0 = r6.A03
            java.lang.Integer r0 = X.C51968G9o.A0t(r0)
            r11.A04 = r0
            boolean r0 = r4.A1C
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r11.A02 = r0
            if (r3 == 0) goto L_0x0178
            com.instagram.user.model.FollowStatus r0 = r3.B6o()
        L_0x00de:
            r11.A01 = r0
            java.lang.String r0 = r1.A0O
            if (r0 != 0) goto L_0x00e6
            java.lang.String r0 = ""
        L_0x00e6:
            r11.A08 = r0
            if (r2 == 0) goto L_0x00f0
            java.lang.String r0 = A06(r4)
            r11.A06 = r0
        L_0x00f0:
            r4.A0L = r11
            X.2pp r9 = r4.A0K
            java.lang.String r0 = "impressionTracker"
            if (r9 == 0) goto L_0x0232
            r13 = -1
            r9.A00(r10, r11, r12, r13, r14)
            X.2pp r3 = r4.A0K
            if (r3 == 0) goto L_0x0232
            X.1Nv r2 = r4.A0L
            if (r2 == 0) goto L_0x023f
            X.3s5 r0 = X.C254193s5.A02
            r3.A01(r0, r2, r12)
        L_0x0109:
            r6 = 0
            r4.A0Y = r6
            r5 = 2
            r4.A03 = r5
            if (r1 == 0) goto L_0x0113
            java.util.List r10 = r1.A0P
        L_0x0113:
            X.3WT r0 = X.AnonymousClass3WT.POLLING
            X.3ui r2 = X.C289745e8.A00(r0, r10)
            if (r2 == 0) goto L_0x0017
            X.OIU r0 = r4.contentHolder
            if (r0 == 0) goto L_0x0017
            if (r1 == 0) goto L_0x0017
            X.OGO r3 = r4.A0N
            java.lang.String r8 = "pollTooltipHelper"
            if (r3 == 0) goto L_0x002c
            X.4jy r2 = r2.A0E()
            if (r2 == 0) goto L_0x0017
            java.lang.Boolean r0 = r2.CEx()
            if (r0 == 0) goto L_0x0017
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0017
            java.lang.Integer r0 = r2.A0A
            if (r0 != 0) goto L_0x0017
            com.instagram.common.session.UserSession r3 = r3.A04
            X.0xa r2 = X.AnonymousClass7TE.A0q(r3)
            java.lang.String r0 = "has_ever_voted_on_direct_poll"
            boolean r0 = r2.getBoolean(r0, r6)
            if (r0 != 0) goto L_0x0017
            X.0xa r2 = X.AnonymousClass7TE.A0q(r3)
            java.lang.String r0 = "direct_poll_tooltip_impression_count"
            int r0 = r2.getInt(r0, r6)
            if (r0 >= r5) goto L_0x0017
            X.OGO r3 = r4.A0N
            if (r3 == 0) goto L_0x002c
            X.OIU r0 = r4.contentHolder
            if (r0 == 0) goto L_0x023a
            X.4Wn r0 = r0.A0M
            com.instagram.user.model.User r2 = r1.A0C
            android.view.ViewGroup r1 = r0.A02
            java.lang.Runnable r0 = r3.A02
            if (r0 != 0) goto L_0x0017
            if (r2 == 0) goto L_0x0017
            if (r1 == 0) goto L_0x0017
            X.Paq r0 = new X.Paq
            r0.<init>(r1, r3, r2)
            r3.A02 = r0
            r1.post(r0)
            return
        L_0x0178:
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A08
            goto L_0x00de
        L_0x017c:
            r2 = 0
            goto L_0x00b8
        L_0x017f:
            X.2Dm r7 = r4.A0p
            com.instagram.model.direct.DirectThreadKey r0 = X.C66647MaG.A03(r8)
            X.3su r3 = r7.BRz(r0, r5)
            if (r3 == 0) goto L_0x009d
            boolean r0 = r1.A0W
            if (r0 == 0) goto L_0x0199
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r15)
            boolean r0 = r3.A1l(r0)
            if (r0 == 0) goto L_0x009d
        L_0x0199:
            r6.add(r5)
            com.instagram.model.direct.DirectThreadKey r6 = X.C66647MaG.A03(r8)
            java.lang.String r2 = r4.A14
            boolean r0 = r4.A1C
            r7.FMS(r6, r5, r2, r0)
            com.instagram.model.direct.DirectThreadKey r7 = X.C66647MaG.A03(r8)
            if (r0 != 0) goto L_0x01b2
            X.C66671Mae.A09(r15, r3, r7)
            goto L_0x009d
        L_0x01b2:
            X.0qQ.A0B(r7, r14)
            boolean r6 = r3.A1S()
            X.N4L r0 = r3.A0D
            if (r0 == 0) goto L_0x01c2
            boolean r0 = r0.A06
            r2 = 1
            if (r0 == r14) goto L_0x01c3
        L_0x01c2:
            r2 = 0
        L_0x01c3:
            java.lang.Class<X.1mR> r17 = X.AnonymousClass1mR.class
            boolean r0 = r3.A2P
            if (r6 == 0) goto L_0x0211
            r19 = 0
        L_0x01cb:
            r16 = r10
            r18 = r10
            r20 = r0
            X.MaY r0 = X.C66669Mac.A04(r15, r16, r17, r18, r19, r20)
            X.1mR r5 = new X.1mR
            r5.<init>(r0)
            r5.A00 = r7
            java.lang.String r0 = r3.A0g()
            if (r0 == 0) goto L_0x0244
            r5.A01 = r0
            java.lang.String r0 = r3.A0f()
            r5.A04 = r0
            r5.A05 = r6
            r5.A06 = r2
            X.4ik r3 = r3.A0e
            java.lang.String r2 = ""
            if (r3 == 0) goto L_0x01fc
            X.OBp r0 = r3.A02
            if (r0 == 0) goto L_0x01fc
            java.lang.String r0 = r0.A01
            if (r0 != 0) goto L_0x01fd
        L_0x01fc:
            r0 = r2
        L_0x01fd:
            r5.A03 = r0
            if (r3 == 0) goto L_0x020a
            X.OBp r0 = r3.A02
            if (r0 == 0) goto L_0x020a
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x020a
            r2 = r0
        L_0x020a:
            r5.A02 = r2
            X.C66580MXl.A1P(r15, r5)
            goto L_0x009d
        L_0x0211:
            java.lang.String r19 = r3.A0f()
            goto L_0x01cb
        L_0x0216:
            boolean r0 = r1.A0W
            if (r0 == 0) goto L_0x0222
            int r0 = r6.A01
            int r0 = r0 + 1
            r6.A01 = r0
            goto L_0x0058
        L_0x0222:
            int r0 = r6.A03
            int r0 = r0 + 1
            r6.A03 = r0
            goto L_0x0058
        L_0x022a:
            int r0 = r6.A04
            int r0 = r0 + 1
            r6.A04 = r0
            goto L_0x004e
        L_0x0232:
            X.0qQ.A0F(r0)
            goto L_0x002f
        L_0x0237:
            r5 = r10
            goto L_0x0026
        L_0x023a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r7)
            throw r0
        L_0x023f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r7)
            throw r0
        L_0x0244:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.visual.DirectVisualMessageViewerController.A07(X.N3h, X.OW6, com.instagram.direct.visual.DirectVisualMessageViewerController, int):void");
    }

    public static final void A08(C68167N3h n3h, DirectVisualMessageViewerController directVisualMessageViewerController) {
        C14044Tol tol;
        C14044Tol tol2;
        MusicOverlayStickerModel A052;
        String str;
        if (directVisualMessageViewerController.videoPlayer != null && n3h != null) {
            List list = n3h.A0P;
            0qQ.A0B(list, 0);
            MusicOverlayStickerModel A053 = C271404in.A05(list);
            if (A053 != null && A053.A0t) {
                C72980PRn pRn = directVisualMessageViewerController.videoPlayer;
                if (!(pRn == null || (tol2 = pRn.A05) == null || !tol2.A0E() || (A052 = C271404in.A05(list)) == null || (str = A052.A0j) == null)) {
                    C59689JTv.A09(directVisualMessageViewerController.A0e, str);
                }
                C72980PRn pRn2 = directVisualMessageViewerController.videoPlayer;
                if (pRn2 != null && (tol = pRn2.A05) != null) {
                    tol.A07.A01(0);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0076, code lost:
        if (r4 == false) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A09(X.C68167N3h r23, com.instagram.direct.visual.DirectVisualMessageViewerController r24, int r25, boolean r26) {
        /*
            r2 = r24
            X.PRn r9 = r2.videoPlayer
            if (r9 == 0) goto L_0x00a8
            X.OIU r0 = r2.contentHolder
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L_0x00b0
            X.3sy r4 = r2.A0x
            r12 = 0
            boolean r1 = r9.A06
            if (r1 != 0) goto L_0x00a9
            java.lang.ref.WeakReference r1 = r9.A0B
            java.lang.Object r6 = r1.get()
            android.content.Context r6 = (android.content.Context) r6
            if (r6 == 0) goto L_0x00a8
            r1 = 1
            r9.A06 = r1
            r14 = r26
            r1 = r26 ^ 1
            r9.A07 = r1
            X.Tol r1 = r9.A05
            if (r1 != 0) goto L_0x003a
            com.instagram.common.session.UserSession r7 = r9.A08
            X.Nha r8 = r9.A09
            java.lang.String r10 = r9.A0A
            X.Tol r5 = new X.Tol
            r5.<init>(r6, r7, r8, r9, r10)
            r9.A05 = r5
            r5.A02()
        L_0x003a:
            com.instagram.ui.widget.textureview.ScalingTextureView r3 = r0.A0V
            android.view.ViewParent r2 = r3.getParent()
            android.view.View r2 = (android.view.View) r2
            boolean r1 = r2 instanceof X.C242423Ua
            if (r1 == 0) goto L_0x00a8
            X.3tH r17 = X.C66647MaG.A01(r4)
            java.lang.String r22 = X.C67003Mgb.A01(r4)
            r5 = r23
            boolean r1 = r5.A0T
            java.lang.Boolean r20 = java.lang.Boolean.valueOf(r1)
            java.lang.Long r7 = r5.A0E
            boolean r6 = r5.A0X
            X.1Xj r4 = r5.A0A
            X.1iA r1 = r5.A0B
            X.P0N r15 = new X.P0N
            r16 = r5
            r18 = r4
            r19 = r1
            r21 = r7
            r23 = r6
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            X.Tol r1 = r9.A05
            if (r1 == 0) goto L_0x0078
            boolean r4 = r1.A0E()
            r1 = 1
            if (r4 != 0) goto L_0x0079
        L_0x0078:
            r1 = 0
        L_0x0079:
            X.Nhe r4 = new X.Nhe
            r6 = r25
            r4.<init>(r15, r0, r6, r1)
            r9.A04 = r4
            com.instagram.feed.widget.IgProgressImageView r0 = r0.A0J
            r0.setVisibility(r12)
            r3.setVisibility(r12)
            X.Tol r4 = r9.A05
            java.lang.String r8 = r5.A0H
            X.3WR r6 = r5.A00()
            r5 = r2
            X.3Ua r5 = (X.C242423Ua) r5
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            int r11 = r2.indexOfChild(r3)
            X.Nhe r7 = r9.A04
            r10 = 0
            if (r1 == 0) goto L_0x00a2
            r10 = 1065353216(0x3f800000, float:1.0)
        L_0x00a2:
            java.lang.String r9 = r9.A0A
            r13 = r12
            r4.A09(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x00a8:
            return
        L_0x00a9:
            java.lang.String r0 = "already bound"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x00b0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.visual.DirectVisualMessageViewerController.A09(X.N3h, com.instagram.direct.visual.DirectVisualMessageViewerController, int, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r0v20, types: [X.PRT, X.3Vq, java.lang.Object] */
    public static final void A0A(DirectVisualMessageViewerController directVisualMessageViewerController) {
        Integer num;
        C68167N3h A012;
        AnonymousClass3WR r1;
        UserSession userSession = directVisualMessageViewerController.A0m;
        1wY A002 = 1wY.A00(userSession);
        0qQ.A07(A002);
        OW6 ow6 = directVisualMessageViewerController.A0G;
        if (ow6 != null) {
            int i = ow6.A00 + 1;
            int i2 = i + 2;
            int size = ow6.A03.size();
            if (i2 > size) {
                i2 = size;
            }
            while (i < i2) {
                OW6 ow62 = directVisualMessageViewerController.A0G;
                if (ow62 == null || (A012 = ow62.A01(i)) == null) {
                    StringBuilder A1A2 = AnonymousClass7TE.A1A();
                    A1A2.append(Pxd.A00(63));
                    A1A2.append(i);
                    A1A2.append(Pxd.A00(118));
                    OW6 ow63 = directVisualMessageViewerController.A0G;
                    if (ow63 != null) {
                        num = C51968G9o.A0t(ow63.A03);
                    } else {
                        num = null;
                    }
                    throw new IndexOutOfBoundsException(AnonymousClass7TF.A0i(num, A1A2));
                }
                if (!A012.A0Z) {
                    1y3 A003 = 1y1.A00(userSession);
                    String moduleName = directVisualMessageViewerController.A0f.getModuleName();
                    String A013 = A012.A01();
                    if (AnonymousClass7TF.A1W(A012.A0B, 1iA.A0a)) {
                        r1 = A012.A00();
                    } else {
                        r1 = null;
                    }
                    C242693Vo r2 = new C242693Vo((C226952iF) null, r1, A013);
                    ? obj = new Object();
                    obj.A01 = A012;
                    obj.A00 = i;
                    A003.A03(new AnonymousClass9IN(new 1yX(r2, obj), i, 0), moduleName);
                } else if (!(directVisualMessageViewerController.A0x instanceof MsysThreadId)) {
                    String A062 = A06(directVisualMessageViewerController);
                    String str = A012.A0K;
                    if (str != null) {
                        String str2 = A012.A0G;
                        if (str2 != null) {
                            C3265077a.A00(userSession, new PF1(A012, directVisualMessageViewerController, i), A062, str, str2);
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else {
                    continue;
                }
                i++;
            }
        }
        A002.A0B.ExO(AnonymousClass05K.A00);
    }

    public static final void A0B(DirectVisualMessageViewerController directVisualMessageViewerController) {
        View A012;
        ImageUrl imageUrl;
        C68167N3h A002;
        C271434iq r0;
        C68167N3h A003;
        C71662eb r02 = directVisualMessageViewerController.blurImageViewContainerStubHolder;
        if (r02 != null && (A012 = r02.A01()) != null) {
            IgImageView A0b2 = DbX.A0b(A012, R.id.direct_visual_message_blur_image_view);
            0qQ.A0B(A0b2, 0);
            AnonymousClass75B.A00(A0b2, 2);
            OW6 ow6 = directVisualMessageViewerController.A0G;
            if (ow6 == null || (A003 = ow6.A00()) == null) {
                imageUrl = null;
            } else {
                imageUrl = A003.A04;
            }
            if (!C253833rU.A02(imageUrl)) {
                OW6 ow62 = directVisualMessageViewerController.A0G;
                if (!(ow62 == null || (A002 = ow62.A00()) == null || (r0 = A002.A07) == null)) {
                    A0b2.A05 = r0.A02;
                }
                if (imageUrl != null) {
                    A0b2.setUrl(imageUrl, directVisualMessageViewerController.A0v);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            } else {
                A0b2.A09();
            }
            A012.setForeground(new ColorDrawable(directVisualMessageViewerController.A0e.getColor(R.color.black_50_transparent)));
            C71392co r03 = C315596kB.A02;
            C294975nL A013 = C294975nL.A01(A012, 0);
            A013.A0I(1.0f);
            C294975nL A0A2 = A013.A0A();
            A0A2.A04 = 0;
            A0A2.A0H();
        }
    }

    public static final void A0C(DirectVisualMessageViewerController directVisualMessageViewerController) {
        C71662eb r1 = directVisualMessageViewerController.blurImageViewContainerStubHolder;
        if (r1 != null && r1.A04()) {
            View A012 = r1.A01();
            if (A012 != null) {
                C71392co r0 = C315596kB.A02;
                C294975nL A002 = C294975nL.A00(A012);
                A002.A0I(0.0f);
                C294975nL A0F2 = A002.A0F(true);
                A0F2.A03 = 8;
                A0F2.A0H();
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public static final void A0D(DirectVisualMessageViewerController directVisualMessageViewerController) {
        Integer num;
        AnonymousClass2Ep r0;
        OW6 ow6 = directVisualMessageViewerController.A0G;
        if (ow6 != null && ow6.A03.size() != 0) {
            1iA r6 = ow6.A00().A0B;
            1iA r2 = 1iA.A0a;
            if (r6 == r2 || r6 == 1iA.A0Q) {
                C254743sy r5 = directVisualMessageViewerController.A0x;
                boolean z = false;
                if ((r5 instanceof MsysThreadId) || ((r0 = directVisualMessageViewerController.A0n) != null && r0.CVE())) {
                    z = true;
                }
                UserSession userSession = directVisualMessageViewerController.A0m;
                AnonymousClass7HA r3 = new AnonymousClass7HA(userSession, new AnonymousClass7H9(userSession));
                if (r6 == r2) {
                    num = AnonymousClass05K.A0N;
                } else {
                    num = AnonymousClass05K.A0C;
                }
                C66819MdB A002 = r3.A00(directVisualMessageViewerController.A0g, num, AnonymousClass05K.A01, z);
                directVisualMessageViewerController.A0D = A002;
                if (A002 != null) {
                    A002.Ddv(C66647MaG.A08(r5));
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r21v6, types: [X.Pua, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r22v6, types: [X.Pua, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r23v5, types: [X.Pua, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r24v6, types: [X.Pua, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r25v5, types: [X.Pua, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r26v4, types: [X.Pua, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x070e, code lost:
        if ((r7 + 3) >= r8.A03.size()) goto L_0x0710;
     */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02fe  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0E(com.instagram.direct.visual.DirectVisualMessageViewerController r36) {
        /*
            r0 = r36
            X.OW6 r1 = r0.A0G
            r16 = 0
            if (r1 == 0) goto L_0x00eb
            X.N3h r1 = r1.A00()
        L_0x000c:
            int r2 = r0.A03
            r3 = 1
            if (r2 == r3) goto L_0x00c5
            X.N3h r2 = A02(r0)
            com.instagram.common.session.UserSession r6 = r0.A0m
            X.0Tu r7 = X.0Tu.A05
            r4 = 36327464749840844(0x810fa3000139cc, double:3.0369732145341757E-306)
            boolean r4 = X.182.A06(r7, r6, r4)
            java.lang.String r9 = "screenshotDetector"
            if (r4 == 0) goto L_0x0083
            boolean r14 = r0.A0R(r2)
            java.lang.String r5 = "once"
            java.lang.String r4 = "replayable"
            java.lang.String[] r4 = new java.lang.String[]{r5, r4}
            java.util.Set r5 = X.0sc.A07(r4)
            if (r2 == 0) goto L_0x00e8
            java.lang.String r4 = r2.A0N
        L_0x003a:
            boolean r15 = X.00k.A0u(r5, r4)
            X.2Dm r7 = r0.A0p
            X.3sy r4 = r0.A0x
            com.instagram.model.direct.DirectThreadKey r5 = X.C66647MaG.A03(r4)
            if (r2 == 0) goto L_0x00e4
            java.lang.String r4 = r2.A0K
        L_0x004a:
            X.3su r11 = r7.BRz(r5, r4)
            if (r14 == 0) goto L_0x0063
            X.79J r4 = X.AnonymousClass79I.A02
            X.79I r7 = r4.A00()
            androidx.fragment.app.FragmentActivity r4 = r0.A0e
            android.view.Window r5 = r4.getWindow()
            if (r5 == 0) goto L_0x0764
            java.lang.String r4 = "DirectVisualMessageViewerController"
            r7.A01(r5, r4)
        L_0x0063:
            X.3KQ r4 = r0.A08
            if (r4 != 0) goto L_0x0083
            X.2Ep r4 = r0.A0n
            if (r4 == 0) goto L_0x0083
            if (r11 == 0) goto L_0x0083
            if (r2 == 0) goto L_0x0083
            X.3KG r5 = r0.A07
            if (r5 == 0) goto L_0x075c
            X.Oxm r10 = new X.Oxm
            r12 = r2
            r13 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            X.3KQ r4 = X.AnonymousClass3KG.A00(r10)
            r0.A08 = r4
            r5.A05(r4)
        L_0x0083:
            X.3KQ r4 = r0.A09
            if (r4 != 0) goto L_0x00c3
            if (r2 == 0) goto L_0x00c3
            java.lang.String r5 = r2.A0N
            java.lang.String r4 = "permanent"
            boolean r4 = X.0qQ.A0K(r5, r4)
            if (r4 != 0) goto L_0x00c3
            X.3KG r4 = r0.A07
            if (r4 == 0) goto L_0x075c
            X.3sy r8 = r0.A0x
            java.lang.String r21 = r2.A01()
            java.lang.String r7 = r2.A0G
            boolean r5 = r2.A0X
            java.lang.String r4 = r2.A0M
            X.PCP r2 = r0.A0o
            X.Oxn r17 = new X.Oxn
            r18 = r6
            r19 = r2
            r20 = r8
            r22 = r7
            r23 = r4
            r24 = r5
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            X.3KQ r4 = X.AnonymousClass3KG.A00(r17)
            r0.A09 = r4
            X.3KG r2 = r0.A07
            if (r2 == 0) goto L_0x075c
            r2.A05(r4)
        L_0x00c3:
            r0.A03 = r3
        L_0x00c5:
            X.OW6 r4 = r0.A0G
            if (r4 == 0) goto L_0x0100
            boolean r2 = r0.A1C
            if (r2 == 0) goto L_0x00e1
            java.util.List r2 = r4.A03
            int r5 = r2.size()
        L_0x00d3:
            X.OIE r2 = r0.A0B
            if (r2 != 0) goto L_0x00ef
            java.lang.String r0 = "directVisualViewerSummaryLogger"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00e1:
            int r5 = r4.A01
            goto L_0x00d3
        L_0x00e4:
            r4 = r16
            goto L_0x004a
        L_0x00e8:
            r4 = 0
            goto L_0x003a
        L_0x00eb:
            r1 = r16
            goto L_0x000c
        L_0x00ef:
            r2.A06 = r5
            com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar r4 = r0.progressBar
            if (r4 == 0) goto L_0x00f9
            r2 = 0
            r4.setVisibility(r2)
        L_0x00f9:
            com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar r2 = r0.progressBar
            if (r2 == 0) goto L_0x0100
            r2.setSegments(r5)
        L_0x0100:
            X.OW6 r2 = r0.A0G
            java.lang.String r17 = "Required value was null."
            if (r2 == 0) goto L_0x0113
            com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar r5 = r0.progressBar
            if (r5 == 0) goto L_0x0113
            int r4 = r2.A00
            boolean r2 = A0U(r0)
            r5.A06(r4, r2)
        L_0x0113:
            boolean r2 = r0.A0R
            if (r2 == 0) goto L_0x0121
            A0D(r0)
            X.MdB r2 = r0.A0D
            if (r2 == 0) goto L_0x0121
            r2.Dyu()
        L_0x0121:
            X.OW6 r2 = r0.A0G
            if (r2 == 0) goto L_0x0134
            X.N3h r2 = r2.A00()
            com.instagram.common.typedurl.ImageUrl r4 = r2.A04
            if (r4 == 0) goto L_0x0134
            X.MdB r2 = r0.A0D
            if (r2 == 0) goto L_0x0134
            X.C66819MdB.A00(r4, r2)
        L_0x0134:
            androidx.fragment.app.FragmentActivity r2 = r0.A0e
            r36 = r2
            com.instagram.common.session.UserSession r2 = r0.A0m
            X.OIU r8 = r0.contentHolder
            if (r8 == 0) goto L_0x0757
            X.OW6 r9 = r0.A0G
            X.4DH r12 = r0.A0f
            X.PJO r4 = r0.A1H
            r35 = r4
            r7 = 0
            r5 = 7
            X.0qQ.A0B(r4, r5)
            com.instagram.feed.widget.IgProgressImageView r6 = r8.A0J
            r6.A04()
            r20 = 2131435562(0x7f0b202a, float:1.849297E38)
            r4 = r20
            r6.A06(r4)
            X.OL9 r4 = r8.A0H
            android.view.ViewGroup r5 = r4.A00
            r4 = 8
            if (r5 == 0) goto L_0x0163
            r5.setVisibility(r4)
        L_0x0163:
            X.52z r5 = r8.A0K
            android.view.ViewGroup r5 = r5.A01
            if (r5 == 0) goto L_0x016c
            r5.setVisibility(r4)
        L_0x016c:
            X.4Wn r5 = r8.A0M
            r24 = r5
            r24.A01()
            X.4Wp r5 = r8.A0L
            r22 = r5
            r22.A01()
            X.6mL r10 = r8.A0P
            android.widget.FrameLayout r5 = r10.A00
            if (r5 == 0) goto L_0x0183
            r5.setVisibility(r4)
        L_0x0183:
            if (r1 == 0) goto L_0x033b
            if (r9 == 0) goto L_0x033b
            boolean r5 = r1.A0S
            if (r5 == 0) goto L_0x06ab
            int r5 = r9.A00
            r34 = r5
            android.widget.TextView r5 = r8.A06
            r19 = 8
            r5.setVisibility(r4)
            X.1iA r11 = r1.A0B
            X.1iA r5 = X.1iA.A0a
            boolean r18 = X.AnonymousClass7TF.A1W(r11, r5)
            com.instagram.common.ui.widget.imageview.IgImageView r11 = r6.getIgImageView()
            r5 = r18
            X.AnonymousClass75B.A00(r11, r5)
            X.4iq r5 = r1.A07
            if (r5 == 0) goto L_0x01dd
            java.lang.String r14 = r5.A0H
            if (r14 == 0) goto L_0x01dd
            java.util.List r11 = r1.A0P
            java.util.ArrayList r13 = X.AnonymousClass7TE.A1D(r11)
            float r11 = r1.A01
            X.AnonymousClass6WT.A01(r2, r10, r13, r11)
            java.lang.String r10 = r5.A0G
            r21 = r10
            boolean r15 = r5.A0U
            java.lang.String r10 = r1.A0M
            r23 = r22
            r25 = r35
            r26 = r16
            r27 = r14
            r28 = r21
            r29 = r10
            r30 = r13
            r31 = r11
            r32 = r15
            r33 = r7
            r21 = r2
            r22 = r16
            X.C265884Wr.A01(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
        L_0x01dd:
            X.O8g r10 = new X.O8g
            r10.<init>(r8)
            X.0Tu r11 = X.0Tu.A05
            r13 = 36327400325265820(0x810f940000399c, double:3.0369324721735135E-306)
            boolean r11 = X.182.A06(r11, r2, r13)
            if (r11 == 0) goto L_0x05e4
            X.OIU r11 = r10.A00
            com.instagram.reels.viewer.attribution.CyclingFrameLayout r11 = r11.A0Q
            r11.A04()
            X.PFN r21 = new X.PFN
            r21.<init>()
            X.PFO r22 = new X.PFO
            r22.<init>()
            X.PFL r23 = new X.PFL
            r23.<init>()
            X.PFM r24 = new X.PFM
            r24.<init>()
            X.PFQ r25 = new X.PFQ
            r25.<init>()
            X.PFP r26 = new X.PFP
            r26.<init>()
            X.Pua[] r11 = new X.C74420Pua[]{r21, r22, r23, r24, r25, r26}
            java.util.List r11 = X.0sr.A1P(r11)
            java.util.Iterator r15 = r11.iterator()
        L_0x0220:
            boolean r11 = r15.hasNext()
            if (r11 == 0) goto L_0x05e1
            java.lang.Object r14 = r15.next()
            r13 = r14
            X.Pua r13 = (X.C74420Pua) r13
            r11 = r36
            boolean r11 = r13.AFK(r11, r2, r1)
            if (r11 == 0) goto L_0x0220
        L_0x0235:
            X.Pua r14 = (X.C74420Pua) r14
            if (r14 == 0) goto L_0x024a
            r21 = r14
            r22 = r36
            r23 = r12
            r24 = r2
            r25 = r1
            r26 = r35
            r27 = r10
            r21.ADQ(r22, r23, r24, r25, r26, r27)
        L_0x024a:
            X.PGO r11 = new X.PGO
            r21 = r11
            r22 = r1
            r23 = r9
            r24 = r35
            r25 = r34
            r26 = r18
            r21.<init>(r22, r23, r24, r25, r26)
            r10 = r20
            r6.A0A(r11, r10)
            r10 = r18 ^ 1
            r6.setEnableProgressBar(r10)
            com.instagram.common.typedurl.ImageUrl r13 = r1.A04
            if (r13 == 0) goto L_0x05d5
            if (r5 == 0) goto L_0x0270
            long r10 = r5.A02
            r6.setExpiration(r10)
        L_0x0270:
            r6.setUrl(r2, r13, r12)
        L_0x0273:
            r6.setVisibility(r7)
            X.3kW r5 = X.AnonymousClass1Qz.A00(r2)
            X.1R7 r5 = r5.C82()
            X.2eb r10 = r8.A0G
            java.lang.String r6 = "ig_zero_rating_data_banner"
            java.util.Set r5 = r5.A0C
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L_0x028c
            r19 = 0
        L_0x028c:
            r5 = r19
            r10.A03(r5)
        L_0x0291:
            com.instagram.user.model.User r10 = X.DbT.A0j(r2)
            com.instagram.user.model.User r6 = r1.A0C
            if (r6 != 0) goto L_0x058e
            com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView r5 = r8.A0N
            r5.setVisibility(r4)
            android.widget.TextView r5 = r8.A08
            r5.setVisibility(r4)
            android.widget.TextView r5 = r8.A07
            r5.setVisibility(r4)
        L_0x02a8:
            android.view.View r6 = r8.A02
            r5 = 4
            r6.setVisibility(r5)
            X.OGw r6 = r1.A05
            if (r6 == 0) goto L_0x02ba
            java.lang.String r5 = r6.A03
            if (r5 == 0) goto L_0x02ba
            java.lang.String r5 = r6.A04
            if (r5 != 0) goto L_0x0587
        L_0x02ba:
            java.lang.Long r5 = r1.A0D
            if (r5 == 0) goto L_0x0587
            long r5 = r5.longValue()
            r10 = 0
            int r9 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x0587
            double r11 = (double) r5
            long r9 = X.AnonymousClass7TG.A0I()
            double r5 = (double) r9
            java.lang.String r9 = "MMMM d"
            java.lang.String r10 = X.1G0.A0F(r9, r11, r5)
            android.widget.TextView r9 = r8.A09
            android.content.res.Resources r6 = r36.getResources()
            r5 = 2131960393(0x7f132249, float:1.9557453E38)
            X.DbY.A0y(r6, r9, r10, r5)
            r9.setVisibility(r7)
        L_0x02e3:
            long r5 = r1.A03
            r9 = 1000000(0xf4240, double:4.940656E-318)
            long r5 = r5 / r9
            android.widget.TextView r11 = r8.A0A
            double r9 = (double) r5
            r5 = r36
            java.lang.String r5 = X.1G0.A04(r5, r9)
            r11.setText(r5)
            android.view.View r5 = r8.A03
            r5.setVisibility(r7)
            android.view.View r9 = r8.A01
            if (r9 == 0) goto L_0x033b
            com.instagram.direct.visual.model.DirectVisualMessageItemModel$MediaFields$RemixMedia r10 = r1.A08
            if (r10 == 0) goto L_0x0582
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            X.0qQ.A0B(r5, r7)
            java.lang.String r6 = "allow_reshare"
            java.lang.String r5 = r10.A03
            boolean r5 = r6.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0582
            r9.setVisibility(r7)
            boolean r5 = X.0mk.A02(r36)
            r6 = 2131231325(0x7f08025d, float:1.8078728E38)
            if (r5 == 0) goto L_0x0320
            r6 = 2131231324(0x7f08025c, float:1.8078726E38)
        L_0x0320:
            r5 = r36
            android.graphics.drawable.Drawable r11 = r5.getDrawable(r6)
            android.widget.TextView r10 = r8.A05
            android.graphics.RectF r5 = X.0nA.A01
            X.0qQ.A0B(r10, r7)
            r8 = r16
            r10.setCompoundDrawablesRelativeWithIntrinsicBounds(r8, r8, r11, r8)
            r5 = r35
            com.instagram.direct.visual.DirectVisualMessageViewerController r6 = r5.A00
            r5 = 66
            X.C71408Ok7.A00(r9, r5, r6, r1)
        L_0x033b:
            android.view.View r6 = r0.replyComposerContainer
            boolean r5 = A0V(r0)
            if (r5 == 0) goto L_0x0344
            r7 = 4
        L_0x0344:
            android.graphics.RectF r5 = X.0nA.A01
            if (r6 == 0) goto L_0x034b
            r6.setVisibility(r7)
        L_0x034b:
            X.3oV r6 = r0.privacyOverlayStubHolder
            if (r6 == 0) goto L_0x03de
            X.OIU r5 = r0.contentHolder
            if (r5 == 0) goto L_0x074d
            com.instagram.feed.widget.IgProgressImageView r5 = r5.A0J
            com.instagram.common.ui.widget.imageview.IgImageView r22 = r5.getIgImageView()
            X.OIU r5 = r0.contentHolder
            if (r5 == 0) goto L_0x0748
            com.instagram.feed.widget.IgProgressImageView r5 = r5.A0J
            r26 = 224(0xe0, float:3.14E-43)
            X.759 r9 = new X.759
            r18 = r9
            r19 = r36
            r20 = r5
            r21 = r2
            r23 = r16
            r24 = r6
            r25 = r16
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            X.OW6 r8 = r0.A0G
            if (r8 == 0) goto L_0x057d
            int r5 = r8.A00
            if (r5 != 0) goto L_0x0397
            X.N3h r5 = r8.A00()
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r5 = r5.A00
            if (r5 == 0) goto L_0x0397
            int r6 = r5.A00
            r5 = 2
            if (r6 != r5) goto L_0x0397
            X.N3h r5 = r8.A00()
            boolean r5 = r5.A0W
            if (r5 == 0) goto L_0x0397
            X.N3h r5 = r8.A00()
            r0.A0F = r5
        L_0x0397:
            X.N3h r5 = r8.A00()
            if (r5 == 0) goto L_0x057d
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r5 = r5.A00
            if (r5 == 0) goto L_0x057d
            boolean r5 = A0V(r0)
            if (r5 == 0) goto L_0x057d
            X.N3h r5 = r8.A00()
            boolean r15 = r5.A02(r2)
            X.N3h r5 = r8.A00()
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r7 = r5.A00
            if (r7 == 0) goto L_0x03c6
            int r6 = r0.A02
            r11 = 2
            X.IoA r5 = new X.IoA
            r10 = r5
            r12 = r7
            r13 = r8
            r14 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            r9.A04(r7, r5, r6)
        L_0x03c6:
            X.3oV r5 = r0.privacyOverlayStubHolder
            if (r5 == 0) goto L_0x03de
            android.view.View r6 = r5.getView()
            if (r6 == 0) goto L_0x03de
            r5 = 2131438226(0x7f0b2a92, float:1.8498373E38)
            android.view.View r6 = r6.findViewById(r5)
            if (r6 == 0) goto L_0x03de
            r5 = 67
            X.C71408Ok7.A00(r6, r5, r0, r8)
        L_0x03de:
            X.OW6 r5 = r0.A0G
            if (r5 == 0) goto L_0x0405
            X.N3h r6 = r5.A00()
            if (r6 == 0) goto L_0x0405
            com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams r7 = r0.A0q
            boolean r5 = r6.A0V
            if (r5 == 0) goto L_0x0405
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r5 = r6.A00
            if (r5 == 0) goto L_0x0405
            int r5 = r0.A02
            if (r5 != r3) goto L_0x0405
            boolean r5 = r6.A0W
            if (r5 == 0) goto L_0x0405
            if (r7 == 0) goto L_0x0405
            boolean r6 = r6.A02(r2)
            X.NmR r5 = X.C69483NmR.IN_THREAD
            X.C71137Odf.A05(r5, r2, r7, r6)
        L_0x0405:
            X.6g5 r5 = r0.photoTimerController
            if (r5 == 0) goto L_0x040c
            r5.A02()
        L_0x040c:
            X.OW6 r8 = r0.A0G
            if (r8 == 0) goto L_0x0747
            if (r1 == 0) goto L_0x0747
            int r7 = r8.A00
            X.PRn r9 = r0.videoPlayer
            if (r9 == 0) goto L_0x0430
            X.OIU r10 = r0.contentHolder
            if (r10 == 0) goto L_0x0742
            boolean r5 = r9.A06
            if (r5 == 0) goto L_0x0542
            X.Nhe r6 = r9.A04
            if (r6 == 0) goto L_0x0542
            X.OIU r5 = r6.A01
            if (r10 != r5) goto L_0x0542
            java.lang.Object r5 = r6.A03
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0542
        L_0x0430:
            boolean r5 = r1.A0S
            if (r5 != 0) goto L_0x0476
            X.OIU r1 = r0.contentHolder
            r5 = 4
            if (r1 == 0) goto L_0x043e
            android.view.View r1 = r1.A04
            r1.setVisibility(r5)
        L_0x043e:
            android.view.View r1 = r0.replyComposerContainer
            if (r1 == 0) goto L_0x0445
            r1.setVisibility(r4)
        L_0x0445:
            r0.A03 = r5
        L_0x0447:
            A0A(r0)
            X.3sy r1 = r0.A0x
            boolean r1 = r1 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            if (r1 != 0) goto L_0x0747
            boolean r1 = r8.A05
            if (r1 == 0) goto L_0x0747
            boolean r1 = r0.A0T
            if (r1 != 0) goto L_0x0747
            boolean r1 = r0.A1C
            if (r1 != 0) goto L_0x0747
            X.2Ep r6 = r0.A0n
            if (r6 == 0) goto L_0x06de
            r4 = r6
            X.3U9 r4 = (X.AnonymousClass3U9) r4
            X.0eM r1 = r4.A05
            boolean r1 = X.AnonymousClass7TF.A1Z(r1)
            if (r1 == 0) goto L_0x06d5
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r4.A03
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r1.readLock()
            r5.lock()
            goto L_0x06c8
        L_0x0476:
            X.1iA r5 = r1.A0B
            X.1iA r4 = X.1iA.A0Q
            if (r5 != r4) goto L_0x04a3
            boolean r4 = A0V(r0)
            if (r4 != 0) goto L_0x04a3
            X.6g5 r9 = r0.photoTimerController
            if (r9 == 0) goto L_0x0447
            X.OIU r4 = r0.contentHolder
            if (r4 == 0) goto L_0x0729
            com.instagram.feed.widget.IgProgressImageView r6 = r4.A0J
            java.lang.Long r4 = r1.A0F
            if (r4 == 0) goto L_0x04a0
            long r12 = r4.longValue()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 * r4
        L_0x0497:
            boolean r4 = r0.A0R
            r10 = r6
            r11 = r1
            r14 = r4
            r9.A03(r10, r11, r12, r14)
            goto L_0x0447
        L_0x04a0:
            r12 = 0
            goto L_0x0497
        L_0x04a3:
            X.1iA r4 = X.1iA.A0a
            boolean r4 = X.AnonymousClass7TF.A1W(r5, r4)
            if (r4 == 0) goto L_0x0447
            X.PRn r10 = r0.videoPlayer
            if (r10 == 0) goto L_0x073d
            X.OIU r6 = r0.contentHolder
            if (r6 == 0) goto L_0x0738
            boolean r4 = r10.A06
            if (r4 == 0) goto L_0x04ef
            X.Nhe r5 = r10.A04
            if (r5 == 0) goto L_0x04ef
            X.OIU r4 = r5.A01
            if (r6 != r4) goto L_0x04ef
            java.lang.Object r4 = r5.A03
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x04ef
            A07(r1, r8, r0, r7)
            int r4 = r10.A01
            int r9 = -r4
            if (r4 <= 0) goto L_0x04e6
            X.Tol r6 = r10.A05
            if (r6 == 0) goto L_0x04e6
            X.Nhe r4 = r10.A04
            if (r4 == 0) goto L_0x04e6
            r5 = 0
            X.4M3 r4 = r6.A06
            int r4 = r4.getCurrentPositionMs()
            int r4 = r4 + r9
            int r4 = java.lang.Math.max(r5, r4)
            r6.A05(r4, r3)
        L_0x04e6:
            X.4mW r4 = r0.A0P
            if (r4 == 0) goto L_0x0447
            r4.DaO(r1)
            goto L_0x0447
        L_0x04ef:
            X.OIU r6 = r0.contentHolder
            if (r6 == 0) goto L_0x0733
            boolean r4 = r0.A0R
            r5 = 4
            if (r4 == 0) goto L_0x04f9
            r5 = 0
        L_0x04f9:
            android.view.View r4 = r6.A04
            r4.setVisibility(r5)
            X.3sy r4 = r0.A0x
            boolean r4 = r4 instanceof com.instagram.model.direct.DirectThreadKey
            if (r4 == 0) goto L_0x053e
            java.lang.String r11 = r1.A0K
            if (r11 == 0) goto L_0x053e
            java.lang.String r10 = r1.A0G
            if (r10 == 0) goto L_0x053e
            X.Mi3 r9 = r0.A0C
            if (r9 == 0) goto L_0x052e
            X.P3I r6 = new X.P3I
            r6.<init>(r8, r0, r7)
            X.4DU r5 = r0.A0v
            X.2Ep r4 = r0.A0n
            if (r4 == 0) goto L_0x072e
            r18 = r9
            r19 = r36
            r20 = r5
            r21 = r6
            r22 = r1
            r23 = r4
            r24 = r11
            r25 = r10
            r18.A01(r19, r20, r21, r22, r23, r24, r25)
        L_0x052e:
            boolean r1 = r0.A0R
            if (r1 != 0) goto L_0x0447
            X.OIU r1 = r0.contentHolder
            if (r1 == 0) goto L_0x0447
            r4 = 4
            android.view.View r1 = r1.A04
            r1.setVisibility(r4)
            goto L_0x0447
        L_0x053e:
            A09(r1, r0, r7, r3)
            goto L_0x052e
        L_0x0542:
            java.lang.String r11 = "scroll"
            boolean r5 = r9.A06
            if (r5 == 0) goto L_0x0430
            X.Tol r5 = r9.A05
            if (r5 == 0) goto L_0x0430
            r12 = 0
            r9.A06 = r12
            X.Nhe r6 = r9.A04
            if (r6 == 0) goto L_0x0567
            X.OIU r5 = r6.A01
            android.view.View r5 = r5.A04
            r5.setVisibility(r4)
            X.OIU r10 = r6.A01
            com.instagram.feed.widget.IgProgressImageView r5 = r10.A0J
            r5.setVisibility(r12)
            r6 = 0
            com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar r5 = r10.A0U
            r5.setProgress(r6)
        L_0x0567:
            X.Tol r5 = r9.A05
            r5.A0D(r11, r3)
            r5 = r16
            r9.A04 = r5
            r5 = -1
            r9.A01 = r5
            r5 = 0
            r9.A02 = r5
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r9.A00 = r5
            goto L_0x0430
        L_0x057d:
            r9.A02()
            goto L_0x03de
        L_0x0582:
            r9.setVisibility(r4)
            goto L_0x033b
        L_0x0587:
            android.widget.TextView r5 = r8.A09
            r5.setVisibility(r4)
            goto L_0x02e3
        L_0x058e:
            com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView r11 = r8.A0N
            r11.setVisibility(r7)
            com.instagram.common.typedurl.ImageUrl r5 = r6.Bh3()
            r11.setSingleAvatarUrlAndVisibility(r5, r12)
            android.widget.TextView r5 = r8.A08
            r5.setVisibility(r7)
            X.DbU.A1H(r5, r6)
            android.widget.TextView r11 = r8.A07
            r11.setVisibility(r7)
            java.util.List r5 = r9.A04
            int r5 = r5.size()
            if (r5 != r3) goto L_0x05c5
            boolean r5 = X.C66582MXn.A1T(r6, r10)
            if (r5 != 0) goto L_0x02a8
            android.content.res.Resources r6 = r36.getResources()
            r5 = 2131959248(0x7f131dd0, float:1.9555131E38)
            java.lang.String r5 = r6.getString(r5)
        L_0x05c0:
            r11.setText(r5)
            goto L_0x02a8
        L_0x05c5:
            if (r5 <= r3) goto L_0x02a8
            android.content.res.Resources r10 = r36.getResources()
            r6 = 2131959247(0x7f131dcf, float:1.955513E38)
            java.lang.String r5 = r9.A02
            java.lang.String r5 = X.AnonymousClass7TF.A0e(r10, r5, r6)
            goto L_0x05c0
        L_0x05d5:
            r6.A04()
            java.lang.String r10 = "DirectVisualMessageViewerItemBinder"
            java.lang.String r5 = "DirectVisualMessageViewerItem.getSizedImageUrl() is null."
            X.0wb.A03(r10, r5)
            goto L_0x0273
        L_0x05e1:
            r14 = 0
            goto L_0x0235
        L_0x05e4:
            X.1Xj r11 = r1.A0A
            if (r11 == 0) goto L_0x024a
            X.OIU r14 = r10.A00
            com.instagram.reels.viewer.attribution.CyclingFrameLayout r13 = r14.A0Q
            r13.A04()
            X.6lS r15 = r14.A0S
            X.52z r11 = r14.A0K
            if (r5 == 0) goto L_0x060e
            com.instagram.feed.media.CreativeConfigIntf r10 = r5.A00
        L_0x05f7:
            boolean r10 = X.C309126Xa.A01(r10)
            if (r10 != 0) goto L_0x068e
            X.497 r13 = X.C59923Jbm.A00
            java.util.List r10 = r1.A0P
            r21 = r10
            com.instagram.music.common.model.MusicOverlayStickerModel r10 = r13.A02(r10)
            if (r10 == 0) goto L_0x0610
            X.C263314Kg.A03(r2, r10, r11)
            goto L_0x024a
        L_0x060e:
            r10 = 0
            goto L_0x05f7
        L_0x0610:
            X.OL9 r13 = r14.A0H
            X.0qQ.A0B(r13, r7)
            android.view.ViewGroup r10 = r13.A00
            if (r10 == 0) goto L_0x0645
            android.content.Context r11 = r10.getContext()
            if (r11 == 0) goto L_0x0645
            X.OGw r15 = r1.A05
            if (r15 == 0) goto L_0x0632
            java.lang.String r10 = r15.A03
            if (r10 == 0) goto L_0x0632
            java.lang.String r10 = r15.A04
            if (r10 == 0) goto L_0x0632
            X.OVp r10 = X.C70994OVp.A00
            r10.A00(r11, r12, r1, r13)
            goto L_0x024a
        L_0x0632:
            boolean r10 = X.AnonymousClass7TE.A1b(r21)
            if (r10 == 0) goto L_0x0645
            X.3ui r10 = X.O0P.A00(r1)
            if (r10 == 0) goto L_0x0645
            X.OVp r10 = X.C70994OVp.A00
            r10.A01(r11, r13)
            goto L_0x024a
        L_0x0645:
            if (r5 == 0) goto L_0x0679
            com.instagram.feed.media.CreativeConfigIntf r11 = r5.A00
            r10 = r36
            boolean r10 = X.C309136Xb.A01(r10, r2, r11)
            if (r10 == 0) goto L_0x0679
            com.instagram.feed.media.CreativeConfigIntf r15 = r5.A00
            X.13i r10 = r5.A03
            java.lang.Object r13 = r10.get()
            java.lang.String r13 = (java.lang.String) r13
            X.6lS r11 = r14.A0R
            android.view.ViewGroup r10 = r11.A00
            if (r10 == 0) goto L_0x0752
            X.6XB r21 = new X.6XB
            r22 = r36
            r23 = r10
            r24 = r12
            r25 = r2
            r26 = r15
            r27 = r35
            r28 = r11
            r29 = r13
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29)
            r21.A04()
        L_0x0679:
            X.OEF r11 = r14.A0I
            com.instagram.direct.visual.model.DirectVisualMessageItemModel$MediaFields$RemixMedia r10 = r1.A08
            if (r10 == 0) goto L_0x024a
            java.lang.String r10 = r10.A02
            if (r10 == 0) goto L_0x024a
            int r10 = r10.length()
            if (r10 == 0) goto L_0x024a
            X.O0O.A00(r2, r11)
            goto L_0x024a
        L_0x068e:
            java.util.List r10 = r1.A0P
            r21 = r36
            r22 = r2
            r23 = r11
            r24 = r15
            r25 = r10
            r26 = r7
            java.util.ArrayList r11 = X.C309126Xa.A00(r21, r22, r23, r24, r25, r26)
            int r10 = r11.size()
            if (r10 <= r3) goto L_0x024a
            r13.A05(r2, r11)
            goto L_0x024a
        L_0x06ab:
            r6.setVisibility(r4)
            android.widget.TextView r10 = r8.A06
            X.1iA r6 = r1.A0B
            X.1iA r5 = X.1iA.A0a
            boolean r6 = X.AnonymousClass7TF.A1W(r6, r5)
            r5 = 2131960005(0x7f1320c5, float:1.9556666E38)
            if (r6 == 0) goto L_0x06c0
            r5 = 2131960698(0x7f13237a, float:1.9558072E38)
        L_0x06c0:
            r10.setText(r5)
            r10.setVisibility(r7)
            goto L_0x0291
        L_0x06c8:
            X.3S9 r1 = r4.A01     // Catch:{ all -> 0x06d0 }
            boolean r4 = r1.A2L     // Catch:{ all -> 0x06d0 }
            r5.unlock()
            goto L_0x0704
        L_0x06d0:
            r0 = move-exception
            r5.unlock()
            throw r0
        L_0x06d5:
            X.3S9 r1 = r4.A01
            monitor-enter(r1)
            boolean r4 = r1.A2L     // Catch:{ all -> 0x06db }
            goto L_0x0703
        L_0x06db:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x06de:
            int r4 = r8.A01
            int r1 = r4 - r3
            if (r7 != r1) goto L_0x06f0
            X.MhE r1 = X.C67040MhD.A00(r2)
            if (r6 == 0) goto L_0x0724
            r0 = r16
        L_0x06ec:
            r1.A02(r0, r6)
            return
        L_0x06f0:
            java.util.List r5 = r8.A03
            int r1 = r5.size()
            if (r1 >= r4) goto L_0x0747
            int r4 = r7 + 3
            int r1 = r5.size()
            if (r4 < r1) goto L_0x0747
            if (r6 == 0) goto L_0x0747
            goto L_0x0710
        L_0x0703:
            monitor-exit(r1)
        L_0x0704:
            if (r4 != r3) goto L_0x06de
            int r4 = r7 + 3
            java.util.List r1 = r8.A03
            int r1 = r1.size()
            if (r4 < r1) goto L_0x06de
        L_0x0710:
            r0.A0T = r3
            X.MhE r1 = X.C67040MhD.A00(r2)
            X.1P0 r0 = r0.A06
            if (r0 != 0) goto L_0x06ec
            java.lang.String r0 = "directVisualMessageFetchNextPageResponseCallback"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0724:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x0729:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x072e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x0733:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x0738:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x073d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x0742:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x0747:
            return
        L_0x0748:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x074d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x0752:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x0757:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x075c:
            X.0qQ.A0F(r9)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0764:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.visual.DirectVisualMessageViewerController.A0E(com.instagram.direct.visual.DirectVisualMessageViewerController):void");
    }

    public static final void A0F(DirectVisualMessageViewerController directVisualMessageViewerController) {
        C68167N3h n3h;
        C68167N3h n3h2;
        OW6 ow6 = directVisualMessageViewerController.A0G;
        if (ow6 != null) {
            n3h = ow6.A00();
        } else {
            n3h = null;
        }
        if (directVisualMessageViewerController.A03 != 3 && n3h != null && n3h.A0S) {
            String str = "screenshotDetector";
            if (182.A06(0Tu.A05, directVisualMessageViewerController.A0m, 36327464749840844L)) {
                OW6 ow62 = directVisualMessageViewerController.A0G;
                if (ow62 != null) {
                    n3h2 = ow62.A00();
                } else {
                    n3h2 = null;
                }
                if (directVisualMessageViewerController.A0R(n3h2)) {
                    AnonymousClass79I A002 = AnonymousClass79I.A02.A00();
                    Window window = directVisualMessageViewerController.A0e.getWindow();
                    if (window != null) {
                        A002.A02(window, "DirectVisualMessageViewerController");
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
                AnonymousClass3KQ r1 = directVisualMessageViewerController.A08;
                if (r1 != null) {
                    AnonymousClass3KG r0 = directVisualMessageViewerController.A07;
                    if (r0 != null) {
                        r0.A06(r1);
                        directVisualMessageViewerController.A08 = null;
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
            }
            AnonymousClass3KQ r12 = directVisualMessageViewerController.A09;
            if (r12 != null) {
                AnonymousClass3KG r02 = directVisualMessageViewerController.A07;
                if (r02 != null) {
                    r02.A06(r12);
                    directVisualMessageViewerController.A09 = null;
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            1Nv r2 = directVisualMessageViewerController.A0L;
            if (r2 != null) {
                C230562pp r03 = directVisualMessageViewerController.A0K;
                str = "impressionTracker";
                if (r03 != null) {
                    r03.A03(r2, -1);
                    C230562pp r04 = directVisualMessageViewerController.A0K;
                    if (r04 != null) {
                        r04.A02(r2, -1);
                        directVisualMessageViewerController.A0L = null;
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            C66819MdB mdB = directVisualMessageViewerController.A0D;
            if (mdB != null) {
                mdB.Dyt();
                mdB.Dds();
                directVisualMessageViewerController.A0D = null;
            }
            directVisualMessageViewerController.A03 = 3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r1 == null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0H(com.instagram.direct.visual.DirectVisualMessageViewerController r2) {
        /*
            X.OW6 r1 = r2.A0G
            if (r1 == 0) goto L_0x0011
            int r0 = r1.A00
            X.N3h r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x0011
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r1 = r0.A00
            r0 = 1
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r0 = 2
        L_0x0012:
            r2.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.visual.DirectVisualMessageViewerController.A0H(com.instagram.direct.visual.DirectVisualMessageViewerController):void");
    }

    public static final void A0I(DirectVisualMessageViewerController directVisualMessageViewerController) {
        C68167N3h A012;
        C254703su BRz;
        OW6 ow6 = directVisualMessageViewerController.A0G;
        if (ow6 != null) {
            C254743sy r1 = directVisualMessageViewerController.A0x;
            if ((r1 instanceof DirectThreadKey) && (A012 = ow6.A01(ow6.A00)) != null && directVisualMessageViewerController.A0J != null && (BRz = directVisualMessageViewerController.A0p.BRz(C66647MaG.A03(r1), A012.A0K)) != null && directVisualMessageViewerController.A0J != null) {
                UserSession userSession = directVisualMessageViewerController.A0m;
                FragmentActivity fragmentActivity = directVisualMessageViewerController.A0e;
                C3263676m r3 = new C3263676m(userSession, BRz, A012.A0I);
                PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel = A012.A00;
                PrivacyMediaOverlayViewModel A042 = r3.A04(AnonymousClass7TF.A0A(fragmentActivity), false);
                if (C51966G9m.A1a(privacyMediaOverlayViewModel, A042)) {
                    A012.A00 = A042;
                }
            }
        }
    }

    public static final void A0J(DirectVisualMessageViewerController directVisualMessageViewerController, float f) {
        View view = directVisualMessageViewerController.viewerInfoContainer;
        if (view != null) {
            view.setAlpha(f);
        }
        OIU oiu = directVisualMessageViewerController.contentHolder;
        if (oiu != null) {
            oiu.A02.setAlpha(f);
        }
        View view2 = directVisualMessageViewerController.replyComposerContainer;
        if (view2 != null || (view2 = directVisualMessageViewerController.selfViewFooterContainer) != null) {
            view2.setAlpha(f);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x016a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0K(com.instagram.direct.visual.DirectVisualMessageViewerController r26, int r27) {
        /*
            r1 = r26
            X.N3h r14 = A02(r1)
            if (r14 == 0) goto L_0x016f
            java.lang.String r13 = r14.A0M
            com.instagram.user.model.User r0 = r14.A0C
            r15 = r0
            boolean r0 = A0T(r1)
            r4 = 0
            if (r0 == 0) goto L_0x0047
            X.1iA r2 = r14.A0B
            X.1iA r0 = X.1iA.A0Q
            if (r2 != r0) goto L_0x003a
            X.6g5 r0 = r1.photoTimerController
            if (r0 == 0) goto L_0x0047
            long r2 = r0.A03
        L_0x0021:
            double r6 = (double) r2
            r2 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r6 = r6 / r2
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0049
            X.OIE r0 = r1.A0B
            if (r0 != 0) goto L_0x0041
            java.lang.String r0 = "directVisualViewerSummaryLogger"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x003a:
            X.PRn r0 = r1.videoPlayer
            if (r0 == 0) goto L_0x0047
            long r2 = r0.A02
            goto L_0x0021
        L_0x0041:
            double r2 = r0.A00
            double r2 = r2 + r6
            r0.A00 = r2
            goto L_0x0049
        L_0x0047:
            r6 = 0
        L_0x0049:
            com.instagram.common.session.UserSession r0 = r1.A0m
            r26 = r0
            X.4DU r0 = r1.A0v
            r25 = r0
            java.lang.String r0 = r1.A16
            r24 = r0
            X.1iA r11 = r14.A0B
            X.3sy r0 = r1.A0x
            com.instagram.model.direct.DirectThreadKey r0 = X.C66647MaG.A04(r0)
            if (r0 == 0) goto L_0x0167
            java.lang.String r12 = r0.A00
        L_0x0061:
            java.lang.String r10 = r14.A01()
            X.OW6 r2 = r1.A0G
            java.lang.String r0 = "Required value was null."
            if (r2 == 0) goto L_0x016a
            int r0 = r2.A00
            r23 = r0
            java.util.List r0 = r2.A03
            int r21 = r0.size()
            X.1iA r0 = X.1iA.A0Q
            if (r11 != r0) goto L_0x0157
            X.6g5 r0 = r1.photoTimerController
            if (r0 == 0) goto L_0x0163
            float r0 = r0.A01
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x0083:
            if (r0 == 0) goto L_0x0163
            java.lang.Number r0 = (java.lang.Number) r0
            double r2 = r0.doubleValue()
        L_0x008b:
            float r0 = r1.A00
            double r8 = (double) r0
            java.lang.String r14 = r14.A0O
            boolean r0 = r1.A1C
            r22 = r0
            if (r15 == 0) goto L_0x0153
            com.instagram.user.model.FollowStatus r20 = r15.B6o()
        L_0x009a:
            r19 = 1
            r0 = 4
            X.0qQ.A0B(r11, r0)
            X.C51972G9s.A1E(r10, r13)
            double r0 = r2 * r8
            double r0 = java.lang.Math.min(r2, r0)
            double r17 = java.lang.Math.max(r0, r4)
            double r0 = r2 - r17
            double r0 = java.lang.Math.min(r2, r0)
            double r15 = java.lang.Math.max(r0, r4)
            java.lang.String r1 = "direct_story_playback_navigation"
            r0 = r25
            X.0xI r2 = X.0xI.A00(r0, r1)
            r0 = 95
            java.lang.String r1 = X.002.A0T(r10, r13, r0)
            java.lang.String r0 = "m_pk"
            r2.A0C(r0, r1)
            java.lang.String r1 = "viewer_session_id"
            r0 = r24
            r2.A0C(r1, r0)
            int r0 = r11.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "m_t"
            r2.A08(r1, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r27)
            java.lang.String r0 = "action"
            r2.A08(r1, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            java.lang.String r0 = "source"
            r2.A08(r1, r0)
            java.lang.String r0 = "thread_id"
            r2.A0C(r0, r12)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r21)
            java.lang.String r0 = "reel_size"
            r2.A08(r1, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r23)
            r0 = 379(0x17b, float:5.31E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r2.A08(r1, r0)
            r8 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r17 = r17 / r8
            java.lang.Double r1 = java.lang.Double.valueOf(r17)
            java.lang.String r0 = "time_elapsed"
            r2.A0A(r0, r1)
            double r15 = r15 / r8
            java.lang.Double r1 = java.lang.Double.valueOf(r15)
            java.lang.String r0 = "time_remaining"
            r2.A0A(r0, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            java.lang.String r0 = "is_replay"
            r2.A08(r1, r0)
            java.lang.String r0 = "reply_type"
            r2.A0C(r0, r14)
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR
            java.lang.String r1 = X.1aC.A06(r20)
            r0 = 608(0x260, float:8.52E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A0C(r0, r1)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x014d
            java.lang.Double r1 = java.lang.Double.valueOf(r6)
            java.lang.String r0 = "pause_duration"
            r2.A0A(r0, r1)
        L_0x014d:
            r0 = r26
            X.DbU.A1R(r2, r0)
            return
        L_0x0153:
            r20 = 0
            goto L_0x009a
        L_0x0157:
            X.PRn r0 = r1.videoPlayer
            if (r0 == 0) goto L_0x0163
            int r0 = r0.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0083
        L_0x0163:
            r2 = 0
            goto L_0x008b
        L_0x0167:
            r12 = 0
            goto L_0x0061
        L_0x016a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x016f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.visual.DirectVisualMessageViewerController.A0K(com.instagram.direct.visual.DirectVisualMessageViewerController, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b9, code lost:
        if (X.0qQ.A0K(r4, r1) != false) goto L_0x00bb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0L(com.instagram.direct.visual.DirectVisualMessageViewerController r13, int r14, boolean r15) {
        /*
            boolean r0 = r13.A0b
            if (r0 != 0) goto L_0x01e2
            r2 = 1
            r13.A0b = r2
            X.N3h r5 = r13.A0F
            r4 = 0
            if (r5 == 0) goto L_0x0040
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r0 = r5.A00
            if (r0 == 0) goto L_0x0040
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r0 = r13.viewerContainer
            if (r0 == 0) goto L_0x0040
            android.content.Context r3 = r0.getContext()
            if (r3 == 0) goto L_0x0040
            com.instagram.common.session.UserSession r1 = r13.A0m
            X.0iw r0 = r13.A0g
            X.OKq r6 = new X.OKq
            r6.<init>(r3, r0, r1)
            java.lang.String r8 = A06(r13)
            java.lang.String r9 = r5.A01()
            boolean r10 = r5.A02(r1)
            X.3sy r0 = r13.A0x
            boolean r11 = r0 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r0 = r5.A00
            if (r0 == 0) goto L_0x004e
            int r0 = r0.A00
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
        L_0x003d:
            r6.A00(r7, r8, r9, r10, r11)
        L_0x0040:
            X.6jt r1 = r13.A0O
            java.lang.String r0 = "appAttributionTooltipHelper"
            if (r1 != 0) goto L_0x0050
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x004e:
            r7 = r4
            goto L_0x003d
        L_0x0050:
            X.5Gv r1 = r1.A00
            if (r1 == 0) goto L_0x005e
            boolean r0 = r1.A09()
            if (r0 == 0) goto L_0x005e
            r0 = 0
            r1.A08(r0)
        L_0x005e:
            A0F(r13)
            A0K(r13, r14)
            X.OIU r0 = r13.contentHolder
            if (r0 == 0) goto L_0x01dd
            X.4DH r0 = r13.A0f
            boolean r0 = r0.isResumed()
            if (r0 == 0) goto L_0x01dd
            android.graphics.RectF r3 = r13.A0d
            if (r3 != 0) goto L_0x0090
            A0N(r13, r2)
            androidx.fragment.app.FragmentActivity r0 = r13.A0e
            android.view.View r0 = X.C66581MXm.A0A(r0)
            int r0 = r0.getHeight()
            X.5nL r1 = r13.A03()
            if (r15 == 0) goto L_0x0088
            int r0 = -r0
        L_0x0088:
            float r0 = (float) r0
            r1.A0K(r0)
            r1.A0H()
            return
        L_0x0090:
            java.lang.String r12 = "Required value was null."
            A0N(r13, r2)
            java.lang.String r1 = r13.A12
            java.lang.String r0 = "inbox"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00bb
            java.lang.String r1 = r13.A13
            if (r1 == 0) goto L_0x00bb
            X.N3h r0 = A02(r13)
            if (r0 == 0) goto L_0x01b2
            java.lang.String r0 = r0.A0K
            if (r0 == 0) goto L_0x01b2
            X.N3h r0 = A02(r13)
            if (r0 == 0) goto L_0x00b5
            java.lang.String r4 = r0.A0K
        L_0x00b5:
            boolean r0 = X.0qQ.A0K(r4, r1)
            if (r0 == 0) goto L_0x01b2
        L_0x00bb:
            r11 = 1
        L_0x00bc:
            boolean r9 = r13.A1F
            r5 = 0
            if (r9 == 0) goto L_0x0193
            if (r11 == 0) goto L_0x01a7
            float r10 = r3.width()
            X.OIU r0 = r13.contentHolder
            if (r0 == 0) goto L_0x01d8
            com.instagram.feed.widget.IgProgressImageView r0 = r0.A0J
            float r0 = X.AnonymousClass7TE.A02(r0)
            float r10 = r10 / r0
            float r8 = r3.height()
            X.OIU r0 = r13.contentHolder
            if (r0 == 0) goto L_0x01d3
            com.instagram.feed.widget.IgProgressImageView r0 = r0.A0J
            int r0 = r0.getHeight()
            float r0 = (float) r0
            float r8 = r8 / r0
            r4 = 0
            r1 = 0
        L_0x00e4:
            X.5nL r7 = r13.A03()
            r6 = 1065353216(0x3f800000, float:1.0)
            r7.A0U(r6, r10, r4)
            r7.A0V(r6, r8, r1)
            r7.A0H()
            if (r9 == 0) goto L_0x018c
            if (r11 == 0) goto L_0x018c
            android.view.View r1 = r13.itemView
            if (r1 == 0) goto L_0x01ce
            r0 = 2131443860(0x7f0b4094, float:1.85098E38)
            android.view.View r4 = X.AnonymousClass7TF.A0F(r1, r0)
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout r4 = (com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout) r4
            float r1 = r3.left
            X.OIU r0 = r13.contentHolder
            if (r0 == 0) goto L_0x01c9
            com.instagram.ui.widget.framelayout.MediaFrameLayout r0 = r0.A0T
            int r0 = r0.getPaddingLeft()
            float r0 = (float) r0
            float r0 = r0 * r10
            float r1 = r1 - r0
            r7.A0S(r5, r1)
            float r1 = r3.top
            int r0 = X.C61290mR.A01()
            float r0 = (float) r0
            float r1 = r1 - r0
            X.OIU r0 = r13.contentHolder
            if (r0 == 0) goto L_0x01c4
            com.instagram.ui.widget.framelayout.MediaFrameLayout r0 = r0.A0T
            int r0 = r0.getPaddingTop()
            float r0 = (float) r0
            float r0 = r0 * r8
            float r1 = r1 - r0
            r7.A0T(r5, r1)
            r0 = 0
            X.PQY r1 = new X.PQY
            r1.<init>(r13, r4, r0)
        L_0x0134:
            r7.A06 = r1
            r7.A0H()
            android.view.View r1 = r13.rootView
            if (r1 == 0) goto L_0x01bf
            X.2co r0 = X.C315596kB.A02
            X.5nL r3 = X.JTP.A0b(r1)
            android.view.View r0 = r13.rootView
            if (r0 == 0) goto L_0x01ba
            float r0 = r0.getScaleX()
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.A0U(r0, r6, r1)
            android.view.View r0 = r13.rootView
            if (r0 == 0) goto L_0x01b5
            float r0 = r0.getScaleY()
            r3.A0V(r0, r6, r1)
            r3.A0K(r5)
            X.5nL r1 = r3.A0F(r2)
            X.2co r0 = X.C59681JTn.A00
            X.5nL r0 = r1.A0E(r0)
            r0.A0H()
            X.OEL r4 = r13.reelViewerShadowAnimator
            if (r4 == 0) goto L_0x01e2
            X.2cp r0 = X.C61340me.A00()
            X.2cs r3 = r0.A02()
            r3.A06 = r2
            float r0 = r4.A00
            double r0 = (double) r0
            r3.A08(r0, r2)
            r1 = 3
            X.NC9 r0 = new X.NC9
            r0.<init>(r4, r1)
            r3.A0A(r0)
            r3.A04()
            return
        L_0x018c:
            r0 = 2
            X.PQS r1 = new X.PQS
            r1.<init>(r13, r0)
            goto L_0x0134
        L_0x0193:
            if (r11 == 0) goto L_0x01a7
            float r4 = r3.centerX()
            float r1 = r3.centerY()
            int r0 = X.C61290mR.A00()
            float r0 = (float) r0
            float r1 = r1 - r0
        L_0x01a3:
            r8 = 0
            r10 = 0
            goto L_0x00e4
        L_0x01a7:
            int r0 = r13.A05
            int r0 = r0 / 2
            float r4 = (float) r0
            int r0 = r13.A04
            int r0 = r0 / 2
            float r1 = (float) r0
            goto L_0x01a3
        L_0x01b2:
            r11 = 0
            goto L_0x00bc
        L_0x01b5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r12)
            throw r0
        L_0x01ba:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r12)
            throw r0
        L_0x01bf:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r12)
            throw r0
        L_0x01c4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r12)
            throw r0
        L_0x01c9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r12)
            throw r0
        L_0x01ce:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r12)
            throw r0
        L_0x01d3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r12)
            throw r0
        L_0x01d8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r12)
            throw r0
        L_0x01dd:
            androidx.fragment.app.FragmentActivity r0 = r13.A0e
            r0.finish()
        L_0x01e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.visual.DirectVisualMessageViewerController.A0L(com.instagram.direct.visual.DirectVisualMessageViewerController, int, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public static final void A0N(DirectVisualMessageViewerController directVisualMessageViewerController, boolean z) {
        ? r3 = directVisualMessageViewerController.A0A;
        if (r3 != 0 && directVisualMessageViewerController.contentView != null) {
            if (z) {
                r3.setLayerType(2, (Paint) null);
                View view = directVisualMessageViewerController.contentView;
                if (view != null) {
                    view.setLayerType(2, (Paint) null);
                    return;
                }
                return;
            }
            r3.setLayerType(0, (Paint) null);
            View view2 = directVisualMessageViewerController.contentView;
            if (view2 != null) {
                view2.setLayerType(0, (Paint) null);
            }
        }
    }

    public static final void A0P(DirectVisualMessageViewerController directVisualMessageViewerController, boolean z) {
        if (directVisualMessageViewerController.A0a != z) {
            directVisualMessageViewerController.A0a = z;
            OIU oiu = directVisualMessageViewerController.contentHolder;
            if (oiu != null) {
                AnonymousClass4EQ.A09(oiu.A02, z);
            }
        }
    }

    public static final boolean A0Q(Context context, DirectVisualMessageViewerController directVisualMessageViewerController) {
        C333547Zj A002;
        DirectVisualMessageViewerController directVisualMessageViewerController2 = directVisualMessageViewerController;
        String A052 = A05(directVisualMessageViewerController2);
        if (A052.length() == 0) {
            return false;
        }
        C254933tI A012 = A01(directVisualMessageViewerController2);
        C254743sy r8 = directVisualMessageViewerController2.A0x;
        if (r8 instanceof MsysThreadId) {
            A002 = C67497Mor.A00(directVisualMessageViewerController2.A0m);
        } else {
            A002 = C333527Zh.A00(directVisualMessageViewerController2.A0m);
        }
        Context context2 = context;
        A002.EMq(context2, (C70766OKm) null, A012, (OCA) null, r8, (Integer) null, A052, "toast", (String) null, (String) null, directVisualMessageViewerController2.A15, directVisualMessageViewerController2.A0W);
        EditText editText = directVisualMessageViewerController2.composerEditText;
        if (editText != null) {
            DbS.A1C(editText);
        }
        EditText editText2 = directVisualMessageViewerController2.composerEditText;
        if (editText2 != null) {
            editText2.clearFocus();
        }
        0nA.A0N(directVisualMessageViewerController2.composerEditText);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A0S(X.C68167N3h r6, com.instagram.direct.visual.DirectVisualMessageViewerController r7, com.instagram.user.model.User r8) {
        /*
            X.3sy r5 = r7.A0x
            boolean r0 = r5 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            r4 = 0
            if (r0 == 0) goto L_0x0017
            boolean r0 = r6.A0Y
            if (r0 == 0) goto L_0x0015
            java.util.HashSet r1 = r7.A18
            java.lang.String r0 = r6.A0K
            boolean r0 = X.00k.A0u(r1, r0)
            if (r0 != 0) goto L_0x0016
        L_0x0015:
            r4 = 1
        L_0x0016:
            return r4
        L_0x0017:
            java.lang.String r2 = r6.A0K
            if (r2 != 0) goto L_0x0043
            java.lang.String r3 = r6.A0G
            if (r3 == 0) goto L_0x0016
            X.2Dm r2 = r7.A0p
            com.instagram.model.direct.DirectThreadKey r1 = X.C66647MaG.A03(r5)
            X.2FW r0 = X.2FW.A0q
            X.3su r2 = r2.BRx(r1, r0, r3)
        L_0x002b:
            if (r2 == 0) goto L_0x0016
            r2.A0g()
            java.lang.String r1 = r2.A0j()
            java.lang.String r0 = "once"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0015
            boolean r0 = r2.A1l(r8)
            if (r0 == 0) goto L_0x0016
            goto L_0x0015
        L_0x0043:
            X.2Dm r1 = r7.A0p
            com.instagram.model.direct.DirectThreadKey r0 = X.C66647MaG.A03(r5)
            X.3su r2 = r1.BRz(r0, r2)
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.visual.DirectVisualMessageViewerController.A0S(X.N3h, com.instagram.direct.visual.DirectVisualMessageViewerController, com.instagram.user.model.User):boolean");
    }

    public static final boolean A0V(DirectVisualMessageViewerController directVisualMessageViewerController) {
        C68167N3h A012;
        OW6 ow6 = directVisualMessageViewerController.A0G;
        if (ow6 == null || (A012 = ow6.A01(ow6.A00)) == null || A012.A00 == null || directVisualMessageViewerController.A17.contains(ow6.A00().A0I) || directVisualMessageViewerController.A02 != 1) {
            return false;
        }
        if ("inbox".equals(directVisualMessageViewerController.A12) || ow6.A00 != 0 || !ow6.A00().A0W) {
            return true;
        }
        return false;
    }

    public final void D9V() {
        A0X("resume");
    }

    public final void DMr(int i, boolean z) {
        EditText editText;
        View view = this.replyComposerContainer;
        if (view != null) {
            boolean A1R = AnonymousClass7TF.A1R(i);
            this.A0X = A1R;
            C19700We2 we2 = this.A0H;
            if (we2 == null) {
                0qQ.A0F("directMediaViewerGestureController");
                throw AnonymousClass00P.createAndThrow();
            }
            we2.A00.A00 = !A1R;
            if (i == 0 && (editText = this.composerEditText) != null) {
                editText.clearFocus();
            }
            C71392co r0 = C315596kB.A02;
            C294975nL A0A2 = JTP.A0c(view, 0).A0A();
            View view2 = this.itemView;
            if (view2 != null) {
                int paddingBottom = view2.getPaddingBottom() - i;
                if (paddingBottom > 0) {
                    paddingBottom = 0;
                }
                A0A2.A0K((float) paddingBottom);
                A0A2.A0H();
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final /* bridge */ /* synthetic */ void DaO(Object obj) {
        SegmentedProgressBar segmentedProgressBar = this.progressBar;
        if (segmentedProgressBar != null) {
            segmentedProgressBar.setProgress(0.0f);
        }
        C273404mW r0 = this.A0P;
        if (r0 != null) {
            r0.DaO(obj);
        }
    }

    public final boolean onBackPressed() {
        boolean z = true;
        if (this.A0c == 1) {
            z = false;
        }
        A0L(this, 8, z);
        return true;
    }

    public static final boolean A0T(DirectVisualMessageViewerController directVisualMessageViewerController) {
        View view;
        C68167N3h A022 = A02(directVisualMessageViewerController);
        if (A022 == null || !(!A022.A0Y) || ((view = directVisualMessageViewerController.backgroundDimmer) != null && view.getVisibility() == 0)) {
            return false;
        }
        return true;
    }

    public static final boolean A0U(DirectVisualMessageViewerController directVisualMessageViewerController) {
        C68167N3h A022 = A02(directVisualMessageViewerController);
        if (A022 == null || !A022.A0Y) {
            return false;
        }
        return true;
    }

    public final void DBd(boolean z, String str) {
        C271434iq r1;
        CreativeConfigIntf creativeConfigIntf;
        C68167N3h A022 = A02(this);
        if (A022 != null && (r1 = A022.A07) != null && (creativeConfigIntf = r1.A00) != null) {
            r1.A00 = C284745Nt.A02(creativeConfigIntf, z);
        }
    }

    public final /* bridge */ /* synthetic */ void DKB(Object obj) {
    }

    public final /* bridge */ /* synthetic */ void DK9(Object obj, float f) {
    }

    public final /* bridge */ /* synthetic */ void DKA(Object obj, double d) {
    }

    public DirectVisualMessageViewerController(RectF rectF, FragmentActivity fragmentActivity, AnonymousClass4DH r10, AnonymousClass0iw r11, UserSession userSession, AnonymousClass2Ep r13, 2Dm r14, AnonymousClass4DU r15, C273434mZ r16, C254743sy r17, ReelViewerConfig reelViewerConfig, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        ReelViewerConfig reelViewerConfig2 = reelViewerConfig;
        AnonymousClass7TG.A1S(reelViewerConfig2, r14);
        List list3 = list2;
        0qQ.A0B(list3, 11);
        this.A0m = userSession;
        this.A0f = r10;
        this.A0e = fragmentActivity;
        this.A0w = r16;
        this.A0y = reelViewerConfig2;
        this.A0p = r14;
        C254743sy r6 = r17;
        this.A0x = r6;
        this.A0n = r13;
        this.A19 = list;
        this.A15 = str;
        this.A1A = list3;
        this.A11 = str2;
        this.A14 = str3;
        this.A13 = str4;
        this.A16 = str5;
        this.A12 = str6;
        this.A0v = r15;
        this.A0d = rectF;
        this.A0c = i;
        this.A1C = z;
        this.A1F = z2;
        this.A1G = z3;
        this.A1B = z4;
        this.A1D = z5;
        this.A1E = z6;
        this.A0g = r11;
        this.A0u = new C70485O8k(userSession);
        this.A0z = new PJJ(this);
        this.A0t = new C70480O8f(this);
        this.A1H = new PJO(this);
        this.A10 = new PJP(this);
        this.A0h = AnonymousClass0kN.A01(r15, userSession);
        this.A0o = new PCP(userSession);
        this.A0r = new C330367Mm(fragmentActivity, userSession, new PFE(this), AnonymousClass3BQ.DIRECT_REPLY_REMIX_REACTION);
        DirectThreadAnalyticsParams directThreadAnalyticsParams = null;
        this.A0s = new AnonymousClass7GR(userSession, (AnonymousClass7GS) null, (DefaultConstructorMarker) null, 2);
        this.A0q = r13 != null ? C3263376i.A01(r13, r6 instanceof MsysThreadId) : directThreadAnalyticsParams;
        this.A03 = 3;
        this.A0Z = true;
        this.A0l = C66580MXl.A0O();
        this.A17 = AnonymousClass7TE.A1F();
        this.A0j = new Ot0(this, 8);
        this.A0i = C71932OtG.A00(this, 38);
    }
}
