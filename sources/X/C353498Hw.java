package X;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.facebook.quicklog.reliability.CancelReason;
import com.google.common.collect.ImmutableList;
import com.google.common.io.Files;
import com.instagram.android.R;
import com.instagram.api.schemas.ACRType;
import com.instagram.api.schemas.ClipsCameraCommandAction;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;
import com.instagram.feed.media.CameraToolInfo;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.music.common.model.ARAudioEffectData;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;
import com.instagram.music.common.model.InstagramAudioApplySource;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicBrowseCategory;
import com.instagram.music.search.tabloader.MusicOverlaySearchTab;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import com.instagram.ui.widget.shutterbutton.ShutterButton;
import com.instagram.user.model.User;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

/* renamed from: X.8Hw  reason: invalid class name and case insensitive filesystem */
public final class C353498Hw implements C353508Hx, C3515289f, C353518Hy {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Dialog A04;
    public Dialog A05;
    public Bitmap A06;
    public C59721JVf A07;
    public C59721JVf A08;
    public C39642A3g A09;
    public C359338cd A0A;
    public AnonymousClass8WX A0B;
    public C353278Gz A0C;
    public C353538Ia A0D;
    public AnonymousClass9QR A0E;
    public C59767JXi A0F;
    public AnonymousClass8IY A0G;
    public C293505kq A0H;
    public C3495880y A0I;
    public AnonymousClass831 A0J;
    public AnonymousClass831 A0K;
    public C49945FFy A0L;
    public Dc2 A0M;
    public AudioOverlayTrack A0N;
    public AudioOverlayTrack A0O;
    public C353638Im A0P;
    public File A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public List A0U;
    public List A0V;
    public List A0W;
    public List A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public int A0q;
    public C265674Vs A0r;
    public ClipsCameraCommandAction A0s;
    public C67010Mgi A0t;
    public AnonymousClass9QZ A0u;
    public C349307zv A0v;
    public Integer A0w;
    public boolean A0x;
    public boolean A0y;
    public boolean A0z;
    public boolean A10;
    public final Context A11;
    public final View A12;
    public final ViewGroup A13;
    public final ViewStub A14;
    public final FragmentActivity A15;
    public final 28D A16;
    public final C353768Iz A17;
    public final AnonymousClass4MS A18;
    public final ACRType A19;
    public final AnonymousClass848 A1A;
    public final AnonymousClass4DH A1B;
    public final AnonymousClass82X A1C;
    public final UserSession A1D;
    public final C71662eb A1E;
    public final C357638Yz A1F;
    public final AnonymousClass8H1 A1G;
    public final TargetViewSizeProvider A1H;
    public final ClipsAssetHubViewModel A1I;
    public final C352888Fl A1J;
    public final AnonymousClass85X A1K;
    public final C3499582p A1L;
    public final AnonymousClass823 A1M;
    public final AnonymousClass8HD A1N;
    public final AnonymousClass8E7 A1O;
    public final AnonymousClass80D A1P;
    public final C353468Ht A1Q;
    public final C3503684j A1R;
    public final AnonymousClass85O A1S;
    public final C3502083s A1T;
    public final C3497281m A1U;
    public final C352868Fj A1V;
    public final AnonymousClass80U A1W;
    public final AnonymousClass8JE A1X;
    public final AnonymousClass8I0 A1Y;
    public final C353568Id A1Z;
    public final C353558Ic A1a;
    public final AnonymousClass8II A1b;
    public final AnonymousClass8A5 A1c;
    public final AnonymousClass85M A1d;
    public final AnonymousClass85L A1e;
    public final C3515789k A1f;
    public final C3514789a A1g;
    public final AnonymousClass8A2 A1h;
    public final AnonymousClass88E A1i;
    public final AnonymousClass8I2 A1j;
    public final AnonymousClass8IQ A1k;
    public final AnonymousClass89Z A1l;
    public final AnonymousClass885 A1m;
    public final ClipsCreationViewModel A1n;
    public final AnonymousClass88V A1o;
    public final AnonymousClass8IN A1p;
    public final C353488Hv A1q;
    public final C352328Cx A1r;
    public final ClipsCreationDraftViewModel A1s;
    public final C2801950r A1t;
    public final AnonymousClass825 A1u;
    public final C3495780x A1v;
    public final AnonymousClass88F A1w;
    public final AnonymousClass88B A1x;
    public final C3499982t A1y;
    public final AudioOverlayTrack A1z;
    public final 2Nn A20;
    public final C3516889w A21;
    public final ShutterButton A22;
    public final List A23;
    public final ExecutorService A24 = new 0na(70, 3, false, true);
    public final AnonymousClass0eM A25;
    public final AnonymousClass0eM A26;
    public final AnonymousClass0eM A27;
    public final boolean A28;
    public final boolean A29;
    public final View A2A;
    public final AnonymousClass2Fj A2B;
    public final AnonymousClass8ZN A2C;
    public final C3507686c A2D;
    public final AnonymousClass86W A2E;
    public final C3510387i A2F;
    public final C3506485o A2G;
    public final AnonymousClass8FA A2H;
    public final AnonymousClass8AL A2I;
    public final AnonymousClass86Y A2J;
    public final C3504884v A2K;
    public final AnonymousClass8IU A2L;
    public final C353528Hz A2M;
    public final C353548Ib A2N;
    public final AnonymousClass8ZP A2O;
    public final AnonymousClass836 A2P;
    public final C3507185x A2Q;
    public final AnonymousClass8IT A2R;
    public final C314676if A2S;
    public final AnonymousClass861 A2T;
    public final AnonymousClass88G A2U;
    public final InteractiveDrawableContainer A2V;
    public final AnonymousClass8JB A2W;
    public final List A2X;
    public final boolean A2Y;
    public final boolean A2Z;

    public static final AnonymousClass51M A06(ImmutableList immutableList, AnonymousClass886 r28, C353498Hw r29, C349307zv r30, File file, String str, ArrayList arrayList, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        HashSet A0C2;
        C59767JXi jXi;
        C376429Hy r9;
        int i5 = i2;
        AnonymousClass51R A012 = C39821AAs.A01(r30, str, i, i5, 0, i5, i5);
        float f = r28.A00;
        C353498Hw r1 = r29;
        boolean z3 = r1.A0e;
        ArrayList arrayList2 = null;
        if (i == 0 || A1Z(r1)) {
            A0C2 = r1.A0C();
        } else {
            A0C2 = null;
        }
        if (!arrayList.isEmpty()) {
            arrayList2 = arrayList;
        }
        AnonymousClass51M r8 = new AnonymousClass51M((C53401GnY) null, (0v6) null, new AnonymousClass51S(immutableList, arrayList2, A0C2, f, -1, z3), A012, (String) null, (String) null, (String) null, (String) null, (String) null, f, 0, 0, 0, 0, 0, 0, 1073741816, false, false, false, false);
        r8.A09 = (int) (((float) i3) / f);
        r8.A08 = (int) (((float) i4) / f);
        r8.A0N = z;
        r8.A0T = z2;
        r8.A0R = r1.A0m;
        if (A1U(r1)) {
            r8.A0D = 0oY.A01(C39908AIz.A02(file), 0);
        }
        C353488Hv r3 = r1.A1q;
        if (!(r3.A07 == 0 || r3.A06 == 0 || (jXi = r1.A0F) == null)) {
            if (182.A06(0Tu.A05, jXi.A0Q, 36320433889812907L)) {
                if (r3.A07 == 0 || r3.A06 == 0) {
                    r9 = new C376429Hy(0.0f, 0.0f, 15, 0.0f, 3, 0.0f);
                } else {
                    float[] fArr = new float[9];
                    r3.A0A.getValues(fArr);
                    float f2 = fArr[0];
                    float f3 = r3.A00;
                    if (((((float) r3.A07) * f3) * r3.A04) / ((((float) r3.A06) * r3.A01) * r3.A05) < 0.5625f) {
                        f2 /= f3;
                    }
                    Matrix matrix = new Matrix();
                    r3.A0A.invert(matrix);
                    Matrix matrix2 = new Matrix();
                    matrix2.postTranslate(((float) r3.A07) / 2.0f, ((float) r3.A06) / 2.0f);
                    matrix2.postConcat(matrix);
                    matrix2.postTranslate((-((float) r3.A07)) / 2.0f, (-((float) r3.A06)) / 2.0f);
                    matrix2.getValues(fArr);
                    r9 = new C376429Hy(f2, ((-fArr[2]) / ((float) r3.A07)) * f2, 8, ((-fArr[5]) / ((float) r3.A06)) * f2, 3, 0.0f);
                }
                r8.A0A = r9;
                r3.A00();
            }
        }
        return r8;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0J(com.google.common.collect.ImmutableList r20, com.google.common.collect.ImmutableList r21, X.AnonymousClass886 r22, X.C353498Hw r23, X.C349307zv r24, java.io.File r25, java.lang.Boolean r26, java.lang.Integer r27, java.lang.String r28, int r29, int r30, int r31, int r32, boolean r33, boolean r34) {
        /*
            r4 = 0
            r6 = 1
            r8 = 3
            r7 = 2
            r5 = 1
            r11 = r23
            r3 = r29
            if (r29 > 0) goto L_0x0022
            A0r(r11)
            X.8A2 r1 = r11.A1h
            java.lang.String r0 = "Invalid outputVideoDurationInMs value"
            r1.A0A(r0)
            android.content.Context r2 = r11.A11
            java.lang.String r0 = "Got an invalid outputVideoDurationInMs value: "
            java.lang.String r1 = X.002.A0O(r0, r3)
            r0 = 0
            X.C64169LRs.A01(r2, r0, r1, r4)
        L_0x0021:
            return
        L_0x0022:
            r2 = 0
            A0g(r11)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            X.8Yz r1 = r11.A1F
            X.8aL r0 = X.C358088aL.A0z
            X.8aL[] r0 = new X.C358088aL[]{r0}
            boolean r0 = r1.A0V(r0)
            if (r0 == 0) goto L_0x0040
            java.util.ArrayList r0 = X.AnonymousClass9NO.A01(r1)
            r15.addAll(r0)
        L_0x0040:
            r0 = r21
            if (r21 == 0) goto L_0x0047
            r15.addAll(r0)
        L_0x0047:
            r9 = r20
            r20 = r33
            r21 = r34
            r10 = r22
            r12 = r24
            r13 = r25
            r14 = r28
            r16 = r30
            r18 = r31
            r19 = r32
            r17 = r3
            X.51M r1 = A06(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            A0r(r11)
            int[] r0 = X.C59776JXv.A00
            int r0 = r27.intValue()
            if (r0 == r8) goto L_0x0112
            if (r0 == r6) goto L_0x0112
            if (r0 != r7) goto L_0x00c0
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r11.A1n
            X.83H r0 = r0.A0L
            X.8J0 r0 = r0.A00
            if (r0 == 0) goto L_0x007a
            r0.A01 = r3
        L_0x007a:
            com.instagram.music.common.model.AudioOverlayTrack r7 = r11.A0N
            if (r7 == 0) goto L_0x0089
            X.8JE r3 = r11.A1X
            X.885 r0 = r11.A1m
            X.886 r0 = r0.A00()
            r3.A05(r0, r7)
        L_0x0089:
            A0T(r11)
            int r0 = A00(r11)
            int r0 = r0 / 1000
            A0v(r11, r0)
            X.88E r0 = r11.A1i
            if (r0 == 0) goto L_0x00c0
            X.81C r0 = r0.A00
            X.81E r7 = r0.A00()
            X.Ab8 r7 = (X.C40375Ab8) r7
            if (r7 == 0) goto L_0x00c0
            X.51R r0 = r1.A0F
            java.lang.String r0 = r0.A0F
            boolean r3 = r11.A1N()
            X.0qQ.A0B(r0, r4)
            r7.A00 = r0
            X.88D r0 = r7.A09
            X.88B r0 = r0.A08
            X.05G r1 = r0.A02
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r1.Epw(r0)
            r7.A02(r3)
        L_0x00c0:
            r6 = 0
        L_0x00c1:
            boolean r0 = r11.A1g()
            if (r0 == 0) goto L_0x00e0
            boolean r0 = A1Z(r11)
            if (r0 != 0) goto L_0x00e0
            X.88V r0 = r11.A1o
            java.util.List r0 = r0.A07
            int r0 = r0.size()
            if (r0 > r5) goto L_0x0187
            X.8oq r0 = new X.8oq
            r0.<init>(r4)
        L_0x00dc:
            A0P(r0, r11)
            return
        L_0x00e0:
            X.9cp r0 = A05(r11)
            if (r0 == 0) goto L_0x00fc
            boolean r0 = A1Z(r11)
            if (r0 != 0) goto L_0x00fc
            X.88V r0 = r11.A1o
            java.util.List r0 = r0.A07
            int r0 = r0.size()
            if (r0 > r5) goto L_0x0187
            A05(r11)
            X.9Tf r0 = X.C379279Tf.A00
            goto L_0x00dc
        L_0x00fc:
            boolean r0 = A1X(r11)
            if (r0 == 0) goto L_0x014f
            X.88V r0 = r11.A1o
            java.util.List r0 = r0.A07
            int r0 = r0.size()
            if (r0 > r5) goto L_0x0187
            X.8op r0 = new X.8op
            r0.<init>(r4)
            goto L_0x00dc
        L_0x0112:
            if (r26 == 0) goto L_0x0136
            X.88V r0 = r11.A1o
            java.util.List r3 = r0.A08
            r3.add(r1)
            boolean r0 = r26.booleanValue()
            if (r0 != 0) goto L_0x0021
            X.8A2 r0 = r11.A1h
            r0.A01()
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = r11.A1n
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r3)
            X.0qQ.A07(r0)
            r1.A0i(r0)
            r3.clear()
            goto L_0x00c0
        L_0x0136:
            r11.A1G(r1)
            X.8A2 r0 = r11.A1h
            r0.A01()
            int r1 = A02(r11)
            r0 = 100
            if (r1 > r0) goto L_0x00c0
            X.8Ia r0 = r11.A04()
            A0P(r0, r11)
            goto L_0x00c1
        L_0x014f:
            boolean r0 = r11.A0m
            if (r0 == 0) goto L_0x0187
            r11.A0m = r4
            com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel r0 = r11.A1I
            X.6nz r0 = r0.A01
            if (r0 == 0) goto L_0x0171
            java.lang.Long r0 = r0.A0G
            if (r0 == 0) goto L_0x0168
            long r1 = r0.longValue()
            int r0 = (int) r1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L_0x0168:
            X.9mn r0 = new X.9mn
            r0.<init>(r2)
        L_0x016d:
            A0O(r0, r11)
            return
        L_0x0171:
            X.80D r0 = r11.A1P
            android.app.Activity r0 = r0.A05
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.instagram.basel"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0184
            X.9mw r0 = X.C387889mw.A00
            goto L_0x016d
        L_0x0184:
            X.9mr r0 = X.C387839mr.A00
            goto L_0x016d
        L_0x0187:
            if (r6 != 0) goto L_0x0021
            com.instagram.common.session.UserSession r0 = r11.A1D
            X.27r r0 = X.27p.A01(r0)
            X.29L r1 = r0.A0J
            X.50r r0 = r11.A1t
            r1.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C353498Hw.A0J(com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableList, X.886, X.8Hw, X.7zv, java.io.File, java.lang.Boolean, java.lang.Integer, java.lang.String, int, int, int, int, boolean, boolean):void");
    }

    public static final void A0b(C353498Hw r2) {
        r2.A1I((AudioOverlayTrack) null, false);
        A0X(r2);
        A0T(r2);
        r2.A1d.A00();
    }

    public static final void A0p(C353498Hw r4) {
        r4.A01 = 0;
        Iterator it = r4.A0J.A05().iterator();
        while (it.hasNext()) {
            if (!((AnonymousClass51N) it.next()).A0A()) {
                r4.A01++;
            }
        }
        A1b(r4);
        if (r4.A01 != 0 && !r4.A0m && !r4.CTi() && !r4.A1L.A02.A0A() && !A1Z(r4) && !r4.A0j && r4.A1o.A07.size() <= 1 && r4.Aje() != C391579tJ.ADD_CLIPS_STACKED_TIMELINE) {
            r4.A0m = true;
        }
        if (r4.A0E != null) {
            A1B(r4, true);
            r4.A0D();
            A0W(r4);
            A0a(r4);
            A1E(r4, false);
            ShutterButton shutterButton = r4.A22;
            shutterButton.A0h.setSegments(r4.A0J);
            shutterButton.A08 = (long) A00(r4);
            if (!r4.A0J.A01.isEmpty()) {
                AnonymousClass8JE r1 = r4.A1X;
                if (r1.A03 != null) {
                    AnonymousClass8JE.A03(r1, false);
                }
            }
            A0v(r4, A02(r4) / IgNetworkConsentStorage.MAX_ENTRIES);
        }
        if (r4.A0l) {
            A0m(r4);
        }
    }

    public static final void A17(C353498Hw r9, Runnable runnable) {
        ArrayList A0A2;
        C353498Hw r6 = r9;
        String A0K2 = r9.A1n.A0K();
        if (A0K2 != null) {
            C64169LRs.A03(r9.A11, A0K2);
            27p.A01(r9.A1D).A0e();
            return;
        }
        if (A1T(r9) && (A0A2 = r9.A0A()) != null && !A0A2.isEmpty() && !r9.CVJ()) {
            UserSession userSession = r9.A1D;
            0Tu r4 = 0Tu.A05;
            if (182.A06(r4, userSession, 36321550579803650L)) {
                AnonymousClass4MS r1 = r9.A18;
                if (r1.A02) {
                    r1.A01();
                }
                r1.A02();
                Dialog A002 = C64170LRv.A00(r9.A11, userSession, AnonymousClass05K.A0N, AnonymousClass7TF.A0R(r4, userSession, 36323332991233115L).booleanValue());
                r9.A05 = A002;
                AnonymousClass0fN.A00(A002);
                C3495880y r0 = r9.A0I;
                if (r0 != null) {
                    int i = r0.A01;
                    ArrayList A0A3 = r9.A0A();
                    if (A0A3 != null && !A0A3.isEmpty()) {
                        r6.A0j = true;
                        A0u(r6, i);
                        A0Q((C39653A3t) null, r6, A0A3, i, true, false);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        C64170LRv.A03(r9.A1D, AnonymousClass05K.A0C);
        A18(r9, runnable);
    }

    public static final void A1C(C353498Hw r3, boolean z) {
        r3.A0l = false;
        AnonymousClass9QR r0 = r3.A0E;
        if (r0 != null) {
            C294975nL.A05(new View[]{r0.A00}, true);
        }
        r3.A1X.A04();
        C59767JXi jXi = r3.A0F;
        if (jXi != null) {
            if (jXi.A0H) {
                jXi.A0E();
            }
            if (jXi.A0H) {
                0kD.A07(C59767JXi.__redex_internal_original_name, "can't release the controller while showing", (Throwable) null);
            } else {
                TextureView textureView = jXi.A07;
                if (textureView != null) {
                    jXi.A0N.removeView(textureView);
                    jXi.A07 = null;
                }
            }
        }
        if (z) {
            A0c(r3);
        }
        C67010Mgi mgi = r3.A0t;
        if (mgi != null) {
            mgi.A06 = null;
        }
        if (r3.CYO()) {
            r3.A1U.A00().EuK();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003e, code lost:
        if (CKX() == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0054, code lost:
        if (X.182.A06(X.0Tu.A05, r12.A1D, 36321550579869187L) != false) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1e(java.lang.Integer r13, java.lang.Runnable r14) {
        /*
            r12 = this;
            r2 = 1
            X.0qQ.A0B(r13, r2)
            X.80U r0 = r12.A1W
            boolean r0 = r0.CZU()
            if (r0 == 0) goto L_0x0030
            com.instagram.common.session.UserSession r4 = r12.A1D
            X.0Tu r3 = X.0Tu.A05
            r0 = 36322972213979855(0x810b8d00002acf, double:3.034132116765696E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x0030
            X.8Ht r0 = r12.A1Q
            X.80R r0 = r0.A00
            X.8QG r3 = r0.A15
            if (r3 == 0) goto L_0x0030
            r0 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            X.AuM r0 = new X.AuM
            r0.<init>(r3)
            X.AnonymousClass8QG.A03(r3, r1, r0)
        L_0x0030:
            boolean r0 = r12.CTi()
            r0 = r0 ^ 1
            r6 = 1
            if (r0 == 0) goto L_0x0040
            boolean r0 = r12.CKX()
            r3 = 1
            if (r0 != 0) goto L_0x0041
        L_0x0040:
            r3 = 0
        L_0x0041:
            boolean r0 = r12.CKX()
            if (r0 == 0) goto L_0x0198
            com.instagram.common.session.UserSession r5 = r12.A1D
            X.0Tu r4 = X.0Tu.A05
            r0 = 36321550579869187(0x810a4200012603, double:3.033233069629649E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x0198
        L_0x0056:
            java.lang.Integer r9 = X.AnonymousClass05K.A01
            if (r13 != r9) goto L_0x0090
            android.content.Context r4 = r12.A11
            com.instagram.common.session.UserSession r8 = r12.A1D
            X.AO2 r5 = new X.AO2
            r5.<init>(r12, r14, r3)
            X.AO3 r6 = new X.AO3
            r6.<init>(r12, r14, r3)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323332991233115(0x810be100002c5b, double:3.0343602737533913E-306)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r2, r8, r0)
            boolean r11 = r0.booleanValue()
            X.AMI r7 = new X.AMI
            r7.<init>(r12)
            r10 = 0
        L_0x007d:
            X.FFy r1 = X.C64170LRv.A01(r4, r5, r6, r7, r8, r9, r10, r11)
            A0c(r12)
            r12.A0L = r1
            X.4DH r0 = r12.A1B
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
            r1.A03(r0)
        L_0x008f:
            return
        L_0x0090:
            if (r6 == 0) goto L_0x00ed
            android.content.Context r4 = r12.A11
            com.instagram.common.session.UserSession r8 = r12.A1D
            X.AO0 r5 = new X.AO0
            r5.<init>(r12, r14, r3)
            X.AO1 r6 = new X.AO1
            r6.<init>(r12, r14, r3)
            boolean r3 = r12.A28
            if (r3 != 0) goto L_0x00ea
            X.0Tu r2 = X.0Tu.A05
            r0 = 36891187798606732(0x8310570014038c, double:3.393473940504243E-306)
            java.lang.String r1 = X.182.A04(r2, r8, r0)
            X.9oK r0 = X.C388749oK.A00
            java.lang.String r0 = r0.A00
            boolean r10 = X.0qQ.A0K(r1, r0)
        L_0x00b7:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323332991233115(0x810be100002c5b, double:3.0343602737533913E-306)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r2, r8, r0)
            boolean r11 = r0.booleanValue()
            boolean r0 = r12.A0g
            if (r0 == 0) goto L_0x00df
            if (r3 != 0) goto L_0x00e7
            r0 = 36891187798606732(0x8310570014038c, double:3.393473940504243E-306)
            java.lang.String r1 = X.182.A04(r2, r8, r0)
            X.9oL r0 = X.C388759oL.A00
            java.lang.String r0 = r0.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00e7
        L_0x00df:
            java.lang.Integer r9 = X.AnonymousClass05K.A00
        L_0x00e1:
            X.AMH r7 = new X.AMH
            r7.<init>(r12)
            goto L_0x007d
        L_0x00e7:
            java.lang.Integer r9 = X.AnonymousClass05K.A0C
            goto L_0x00e1
        L_0x00ea:
            boolean r10 = r12.A0g
            goto L_0x00b7
        L_0x00ed:
            X.AKY r6 = new X.AKY
            r6.<init>(r12, r14, r3)
            X.AKZ r4 = new X.AKZ
            r4.<init>(r12, r14, r3)
            boolean r9 = A1a(r12)
            com.instagram.common.session.UserSession r8 = r12.A1D
            X.0Tu r7 = X.0Tu.A05
            r0 = 36323332991233115(0x810be100002c5b, double:3.0343602737533913E-306)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r7, r8, r0)
            boolean r1 = r0.booleanValue()
            android.content.Context r0 = r12.A11
            if (r1 == 0) goto L_0x0114
            android.content.Context r0 = X.2Yn.A01(r0)
        L_0x0114:
            X.8ab r3 = new X.8ab
            r3.<init>((android.content.Context) r0)
            X.AK0 r5 = new X.AK0
            r5.<init>(r12)
            boolean r0 = r12.A0g
            if (r0 == 0) goto L_0x0139
            boolean r0 = r12.A28
            if (r0 != 0) goto L_0x0177
            r0 = 36891187798606732(0x8310570014038c, double:3.393473940504243E-306)
            java.lang.String r1 = X.182.A04(r7, r8, r0)
            X.9oL r0 = X.C388759oL.A00
            java.lang.String r0 = r0.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0177
        L_0x0139:
            r0 = 2131955867(0x7f13109b, float:1.9548274E38)
            r3.A09(r0)
            r0 = 2131955765(0x7f131035, float:1.9548067E38)
            r3.A08(r0)
            r1 = 2131955374(0x7f130eae, float:1.9547274E38)
            X.8ae r0 = X.C358278ae.RED_BOLD
            r3.A0Q(r6, r0, r1)
            r0 = 2131955368(0x7f130ea8, float:1.9547261E38)
            r3.A0G(r5, r0)
            if (r9 != 0) goto L_0x015d
            r1 = 2131955372(0x7f130eac, float:1.954727E38)
            X.8ae r0 = X.C358278ae.DEFAULT
            r3.A0P(r4, r0, r1)
        L_0x015d:
            r3.A0s(r2)
            X.AJb r0 = new X.AJb
            r0.<init>(r12)
            r3.A0B(r0)
            android.app.Dialog r0 = r3.A02()
            A0c(r12)
            r12.A04 = r0
            if (r0 == 0) goto L_0x008f
            X.AnonymousClass0fN.A00(r0)
            return
        L_0x0177:
            r0 = 2131955378(0x7f130eb2, float:1.9547282E38)
            r3.A09(r0)
            r0 = 2131955377(0x7f130eb1, float:1.954728E38)
            r3.A08(r0)
            r1 = 2131955376(0x7f130eb0, float:1.9547278E38)
            X.8ae r0 = X.C358278ae.RED_BOLD
            r3.A0Q(r6, r0, r1)
            r0 = 2131955372(0x7f130eac, float:1.954727E38)
            r3.A0G(r4, r0)
            r0 = 2131955368(0x7f130ea8, float:1.9547261E38)
            r3.A0H(r5, r0)
            goto L_0x015d
        L_0x0198:
            r6 = 0
            goto L_0x0056
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C353498Hw.A1e(java.lang.Integer, java.lang.Runnable):void");
    }

    public final void DCL() {
        AnonymousClass8WX r0;
        C357198Wx r1;
        AnonymousClass8XA A002;
        this.A0Z = true;
        C293505kq r12 = this.A0H;
        if (r12 != null) {
            this.A1L.A02.A01.A0E = r12.A0T;
        }
        if (!this.A2V.A10()) {
            this.A1L.A02.A01.A09 = null;
        }
        AnonymousClass8WX r02 = this.A0B;
        if (!(r02 == null || (A002 = r02.A00()) == null)) {
            A002.A0P(false, false, false);
        }
        AnonymousClass80R r2 = this.A1Q.A00;
        boolean z = r2.A0v.A3i;
        AnonymousClass88I r13 = r2.A1R;
        if (z) {
            if (r13 != null) {
                r1 = (C357198Wx) r13;
                r0 = null;
            }
            this.A1j.A00();
        }
        if (!(r13 == null || (r0 = r2.A1N) == null)) {
            r1 = (C357198Wx) r13;
        }
        this.A1j.A00();
        r1.A01 = r0;
        this.A1j.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e2, code lost:
        if (r7 != false) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f0, code lost:
        if (X.182.A06(X.0Tu.A05, r6, 36321765328430799L) == false) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f2, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f3, code lost:
        r0 = r8.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f5, code lost:
        if (r0 == null) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f7, code lost:
        r0 = r0.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00fb, code lost:
        if (r0 == null) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00fd, code lost:
        r0.A0P(true, r5, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DCM(X.C358998bo r9) {
        /*
            r8 = this;
            r3 = 0
            android.view.ViewGroup r1 = r8.A13
            r0 = 2131438153(0x7f0b2a49, float:1.8498225E38)
            android.view.View r1 = r1.findViewById(r0)
            boolean r0 = r9 instanceof X.C339027iw
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = "replace_segment"
            A1A(r8, r0)
            X.8WX r0 = r8.A0B
            if (r0 == 0) goto L_0x0020
            X.8XA r0 = r0.A00()
            if (r0 == 0) goto L_0x0020
            r0.A0O(r3)
        L_0x0020:
            X.8Ht r0 = r8.A1Q
            X.80R r0 = r0.A00
            X.88I r1 = r0.A1R
            if (r1 == 0) goto L_0x002d
            X.8Wx r1 = (X.C357198Wx) r1
            r0 = 0
            r1.A01 = r0
        L_0x002d:
            r8.DCN()
            r8.A0q = r3
            return
        L_0x0033:
            boolean r7 = r9 instanceof X.C342007nt
            r2 = 1
            if (r7 != 0) goto L_0x009f
            boolean r0 = r9 instanceof X.C381939cp
            if (r0 != 0) goto L_0x009f
            if (r1 == 0) goto L_0x0044
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            goto L_0x002d
        L_0x0044:
            X.Aac r0 = X.C40343Aac.A00
            if (r9 != r0) goto L_0x0078
            com.instagram.common.session.UserSession r1 = r8.A1D
            X.28D r0 = r8.A16
            java.lang.Integer r1 = X.C3505485d.A00(r0, r1)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x002d
            X.0eM r0 = r8.A27
            java.lang.Object r0 = r0.getValue()
            X.87s r0 = (X.C3511387s) r0
            boolean r0 = r0.A0K()
            if (r0 != 0) goto L_0x002d
            A1F(r8, r3, r2, r2)
            java.lang.String r0 = "precap_from_postcap"
            A1A(r8, r0)
            X.8WX r0 = r8.A0B
            if (r0 == 0) goto L_0x002d
            X.8XA r0 = r0.A00()
            if (r0 == 0) goto L_0x002d
            r0.A0O(r3)
            goto L_0x002d
        L_0x0078:
            X.Aad r0 = X.C40344Aad.A00
            if (r9 != r0) goto L_0x002d
            A1F(r8, r3, r2, r2)
            X.8WX r0 = r8.A0B
            if (r0 == 0) goto L_0x002d
            X.8XA r2 = r0.A00()
            if (r2 == 0) goto L_0x002d
            X.0eM r0 = r2.A0k
            java.lang.Object r1 = r0.getValue()
            X.8h5 r1 = (X.C361948h5) r1
            if (r1 == 0) goto L_0x0098
            java.lang.String r0 = "show_gallery_with_asset_hub"
            r1.A00(r0)
        L_0x0098:
            r2.A0O(r3)
            X.AnonymousClass8XA.A03(r2)
            goto L_0x002d
        L_0x009f:
            com.instagram.common.session.UserSession r6 = r8.A1D
            X.80y r0 = X.C3495980z.A00(r6)
            r8.A0I = r0
            A0R(r8)
            boolean r0 = r8.A1g()
            if (r0 != 0) goto L_0x00b6
            X.9cp r0 = A05(r8)
            if (r0 == 0) goto L_0x002d
        L_0x00b6:
            boolean r0 = r8.A1g()
            if (r0 == 0) goto L_0x0127
            if (r7 == 0) goto L_0x00e1
            X.85O r1 = r8.A1S
            X.8Yz r0 = r8.A1F
            X.80m r0 = r0.A08
            java.lang.Object r0 = r0.A00
            X.4yO r0 = (X.C279284yO) r0
            boolean r0 = r1.A02(r0)
            if (r0 != 0) goto L_0x0125
            X.7nt r9 = (X.C342007nt) r9
            boolean r0 = r9.A01
            X.0Tu r4 = X.0Tu.A05
            if (r0 == 0) goto L_0x011a
            r0 = 36321765328234188(0x810a74000126cc, double:3.0333688773603977E-306)
            boolean r0 = X.182.A06(r4, r6, r0)
            if (r0 != 0) goto L_0x0125
        L_0x00e1:
            r5 = 0
            if (r7 == 0) goto L_0x00f2
        L_0x00e4:
            X.0Tu r4 = X.0Tu.A05
            r0 = 36321765328430799(0x810a74000426cf, double:3.033368877484735E-306)
            boolean r0 = X.182.A06(r4, r6, r0)
            r1 = 1
            if (r0 != 0) goto L_0x00f3
        L_0x00f2:
            r1 = 0
        L_0x00f3:
            X.8WX r0 = r8.A0B
            if (r0 == 0) goto L_0x0100
            X.8XA r0 = r0.A00()
            if (r0 == 0) goto L_0x0100
            r0.A0P(r2, r5, r1)
        L_0x0100:
            boolean r0 = r8.A1M()
            if (r0 != 0) goto L_0x002d
            java.lang.String r0 = "stacked_timeline_add_media"
            A1A(r8, r0)
            X.8WX r0 = r8.A0B
            if (r0 == 0) goto L_0x002d
            X.8XA r0 = r0.A00()
            if (r0 == 0) goto L_0x002d
            r0.A0O(r2)
            goto L_0x002d
        L_0x011a:
            r0 = 36321765328168651(0x810a74000026cb, double:3.033368877318952E-306)
            boolean r0 = X.182.A06(r4, r6, r0)
            if (r0 == 0) goto L_0x00e1
        L_0x0125:
            r5 = 1
            goto L_0x00e4
        L_0x0127:
            X.9cp r0 = A05(r8)
            if (r0 == 0) goto L_0x0100
            X.8WX r0 = r8.A0B
            if (r0 == 0) goto L_0x0100
            X.8XA r4 = r0.A00()
            if (r4 == 0) goto L_0x0100
            X.85O r1 = r8.A1S
            X.8Yz r0 = r8.A1F
            X.80m r0 = r0.A08
            java.lang.Object r0 = r0.A00
            X.4yO r0 = (X.C279284yO) r0
            boolean r0 = r1.A02(r0)
            r4.A0P(r2, r0, r3)
            goto L_0x0100
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C353498Hw.DCM(X.8bo):void");
    }

    public final void DCV(boolean z) {
        this.A0Z = false;
        this.A0o = false;
        this.A0c = false;
        if (this.A0E != null) {
            if (z) {
                A1F(this, true, false, false);
            } else {
                A1F(this, false, false, false);
            }
        }
        A0c(this);
        this.A1j.A04.Epw(AnonymousClass8I3.A00);
    }

    public final boolean DHO() {
        return false;
    }

    public final /* synthetic */ void Dsx(AudioOverlayTrack audioOverlayTrack) {
    }

    public final /* synthetic */ void Dt0(AudioOverlayTrack audioOverlayTrack, AudioOverlayTrack audioOverlayTrack2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0096, code lost:
        if (r11.A0y != false) goto L_0x0099;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dt2(com.instagram.music.common.model.AudioOverlayTrack r12) {
        /*
            r11 = this;
            r0 = 0
            X.0qQ.A0B(r12, r0)
            boolean r0 = r12.A01()
            if (r0 != 0) goto L_0x002a
            int r1 = r12.A02
            X.831 r0 = r11.A0J
            int r0 = r0.A00
            if (r1 >= r0) goto L_0x002a
            com.instagram.common.session.UserSession r0 = r11.A1D
            boolean r0 = X.AnonymousClass8IK.A00(r0)
            if (r0 != 0) goto L_0x002a
            android.content.Context r1 = r11.A11
            r0 = 2131955727(0x7f13100f, float:1.954799E38)
            X.C59689JTv.A06(r1, r0)
            X.8A2 r1 = r11.A1h
            java.lang.String r0 = "selected track shorter than current recording"
            r1.A0C(r0)
            return
        L_0x002a:
            com.instagram.music.common.model.AudioOverlayTrack r0 = r11.A0N
            if (r0 == 0) goto L_0x0054
            java.lang.String r1 = r0.A0A
            java.lang.String r0 = r12.A0A
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0054
            com.instagram.music.common.model.AudioOverlayTrack r2 = r11.A0N
            if (r2 == 0) goto L_0x0054
            int r1 = r2.A03
            int r0 = r12.A03
            if (r1 != r0) goto L_0x0054
            int r1 = r2.A02
            int r0 = r12.A02
            if (r1 != r0) goto L_0x0054
            X.8IJ r1 = r2.A05
            X.8IJ r0 = r12.A05
            if (r1 != r0) goto L_0x0054
            X.8A2 r0 = r11.A1h
            r0.A02()
            return
        L_0x0054:
            X.8I2 r5 = r11.A1j
            X.848 r0 = r11.A1A
            X.05G r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            boolean r2 = r0 instanceof X.AnonymousClass8YD
            com.instagram.music.common.model.MusicAssetModel r0 = r12.A08
            if (r0 == 0) goto L_0x009d
            com.instagram.creation.capture.quickcapture.sundial.toast.model.ClipsPreloadedSettingItem r1 = r0.A04
            if (r1 == 0) goto L_0x009d
            java.lang.String r7 = r1.A02
            java.lang.String r8 = r1.A01
            java.lang.Boolean r6 = r1.A00
            if (r7 == 0) goto L_0x009d
            if (r2 != 0) goto L_0x009d
            X.05G r0 = r5.A04
            java.lang.String r9 = r1.A06
            java.lang.String r10 = r1.A05
            com.instagram.common.typedurl.ImageUrl r4 = r1.A04
            X.8JL r3 = X.AnonymousClass8JL.EFFECT
            X.9cv r2 = new X.9cv
            r5 = r4
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r0.Epw(r2)
        L_0x0085:
            com.instagram.music.common.model.AudioOverlayTrack r0 = r11.A0N
            if (r0 == 0) goto L_0x0098
            java.lang.String r1 = r0.A0A
            java.lang.String r0 = r12.A0A
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0098
            boolean r1 = r11.A0y
            r0 = 1
            if (r1 != 0) goto L_0x0099
        L_0x0098:
            r0 = 0
        L_0x0099:
            A11(r11, r12, r0)
            return
        L_0x009d:
            X.8I6 r4 = r5.A03
            com.instagram.common.session.UserSession r3 = r4.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316654317146671(0x8105ce0001122f, double:3.030136653368262E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x00b9
            r0 = 36316654317081134(0x8105ce0000122e, double:3.030136653326816E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0085
        L_0x00b9:
            com.instagram.music.common.model.MusicAssetModel r0 = r12.A08
            if (r0 == 0) goto L_0x0085
            X.05G r1 = r5.A04
            X.8IF r0 = X.AnonymousClass8IF.A00
            r1.Epw(r0)
            com.instagram.music.common.model.MusicAssetModel r1 = r12.A08
            if (r1 == 0) goto L_0x00cd
            r0 = 1
            r4.A00(r1, r0)
            goto L_0x0085
        L_0x00cd:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C353498Hw.Dt2(com.instagram.music.common.model.AudioOverlayTrack):void");
    }

    public final /* synthetic */ void Dt6(AudioOverlayTrack audioOverlayTrack, Integer num) {
        C63171Kse.A00(this, audioOverlayTrack);
    }

    public final void DxE(C349307zv r33) {
        String str;
        int i;
        String str2;
        ImmutableList immutableList;
        C353538Ia r0;
        DownloadedTrack downloadedTrack;
        String str3;
        C353278Gz r2;
        if (this.A0E == null) {
            str3 = "view holder should not be null if on CLIPS format";
        } else {
            C349307zv r1 = r33;
            if (!A1Z(this) || (r2 = this.A0C) == null) {
                int i2 = r1.A07;
                if (i2 <= 0) {
                    A0F();
                    C59689JTv.A01(this.A11, (String) null, 2131976506, 0);
                    return;
                } else if (this.A00 == -1) {
                    str3 = "we should be getting the camera-calculated duration in onExitVideoRecording()";
                } else {
                    UserSession userSession = this.A1D;
                    29L r7 = 27p.A01(userSession).A0J;
                    C2801950r r3 = this.A1t;
                    r7.A06(r3, "precap_recording_finished_auto_transition", -1);
                    C357638Yz r9 = this.A1F;
                    if (r9.A08.A00 instanceof AnonymousClass80O) {
                        this.A1h.A0L(27p.A01(userSession).A04.A0L, 002.A0O("video_recording-", r1.A0F));
                    }
                    CameraAREffect cameraAREffect = r1.A0P;
                    if (cameraAREffect != null) {
                        str = cameraAREffect.A0M;
                    } else {
                        str = null;
                    }
                    AnonymousClass831 r22 = (AnonymousClass831) this.A1n.A0G.A02();
                    if (r22 != null) {
                        i = r22.A01.size();
                    } else {
                        i = 0;
                    }
                    CameraAREffect cameraAREffect2 = r1.A0P;
                    if (cameraAREffect2 != null) {
                        str2 = cameraAREffect2.A0Q;
                    } else {
                        str2 = null;
                    }
                    29f r14 = 27p.A01(userSession).A0A;
                    String A052 = r1.A05();
                    AnonymousClass80D r12 = this.A1P;
                    r14.A0X(Aje(), (C360948fP) null, A052, str, r12.A2J, r12.A2K, str2, i, (long) (A00(this) / IgNetworkConsentStorage.MAX_ENTRIES));
                    this.A1e.A00();
                    SystemClock.elapsedRealtime();
                    if (r9.A0V(C358088aL.A0B)) {
                        this.A00 = i2;
                    }
                    int i3 = this.A00;
                    if (i2 < i3) {
                        0kD.A07("ClipsCaptureControllerImpl", 002.A0X("captured video duration mismatch (actual=", ", calculated=", ')', i2, i3), (Throwable) null);
                    }
                    AnonymousClass51R A002 = C39821AAs.A00(r1, 0, i2, this.A00);
                    this.A00 = -1;
                    2Nn r15 = this.A20;
                    if (r15.A02()) {
                        try {
                            Context context = this.A11;
                            String Ao9 = Ao9();
                            0qQ.A0B(Ao9, 2);
                            File A032 = C39907AIy.A03(r15, Ao9, C39907AIy.A04(new File(r1.A0k)), "move_camera_file");
                            if (A032.getUsableSpace() >= 52428800) {
                                Files.A02(new File(r1.A0k), A032);
                                String path = A032.getPath();
                                0qQ.A0B(path, 0);
                                A002.A0F = path;
                            } else {
                                C59689JTv.A00(context, context.getString(2131955413), "clips_drafts_not_enough_space", 1);
                                throw new IOException("not enough space to persist video");
                            }
                        } catch (IOException e) {
                            0kD.A07("ClipsCaptureControllerImpl", "file system failure", e);
                        }
                    }
                    float f = this.A1m.A00().A00;
                    int i4 = this.A02;
                    boolean z = this.A0e;
                    HashSet A0C2 = A0C();
                    CameraAREffect cameraAREffect3 = r1.A0P;
                    if (cameraAREffect3 != null) {
                        immutableList = ImmutableList.of(cameraAREffect3);
                    } else {
                        immutableList = null;
                    }
                    AnonymousClass51M r92 = new AnonymousClass51M((C53401GnY) null, (0v6) null, new AnonymousClass51S(immutableList, AnonymousClass9NO.A01(r9), A0C2, f, i4, z), A002, (String) null, (String) null, (String) null, (String) null, (String) null, 0.0f, 0, 0, 0, 0, 0, 0, 1073741820, false, false, false, false);
                    r92.A0D = r1.A0U;
                    this.A1V.A00().DxG(r92);
                    AudioOverlayTrack audioOverlayTrack = this.A0N;
                    if (audioOverlayTrack != null && (downloadedTrack = audioOverlayTrack.A06) != null && new File(downloadedTrack.A02).exists() && ((long) i2) > 3000 && !C394329xu.A00(this.A11) && 182.A06(0Tu.A05, userSession, 36316040136757113L)) {
                        this.A24.execute(new MA2(this, r92, r22, audioOverlayTrack, downloadedTrack, i2));
                    }
                    A1G(r92);
                    A1E(this, false);
                    this.A1h.A01();
                    if (A02(this) <= 100) {
                        A0P(A04(), this);
                        return;
                    }
                    if (A1g()) {
                        r0 = new C366388oq(false);
                    } else if (A05(this) != null) {
                        r0 = C379279Tf.A00;
                    } else if (A1X(this)) {
                        r0 = new C366378op(false);
                    } else {
                        27p.A01(userSession).A0J.A00(r3);
                        return;
                    }
                    A0O(r0, this);
                    return;
                }
            } else {
                r2.A00(r1);
                if (this.A0E == null) {
                    str3 = "view holder should not be null";
                } else {
                    this.A1e.A00();
                    this.A00 = -1;
                    C301725zr r23 = this.A22.A0h;
                    ArrayList arrayList = r23.A0B;
                    if (!arrayList.isEmpty()) {
                        018.A15(arrayList);
                        r23.A04 = 00k.A02(arrayList);
                        return;
                    }
                    return;
                }
            }
        }
        0kD.A07("ClipsCaptureControllerImpl", str3, (Throwable) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e8, code lost:
        if (r4.A0V(X.C358088aL.A0y) != false) goto L_0x00ea;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.A6C Dy4(X.A3h r22) {
        /*
            r21 = this;
            r15 = 0
            r2 = r21
            X.9QR r0 = r2.A0E
            java.lang.String r1 = ""
            r5 = -1
            java.lang.String r6 = "ClipsCaptureControllerImpl"
            r11 = 0
            if (r0 != 0) goto L_0x001c
            r0 = 4199(0x1067, float:5.884E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0kD.A07(r6, r0, r11)
            X.A6C r2 = new X.A6C
            r2.<init>(r1, r5, r15)
            return r2
        L_0x001c:
            com.instagram.music.common.model.AudioOverlayTrack r0 = r2.A0N
            if (r0 == 0) goto L_0x008f
            X.8IJ r0 = r0.A05
            if (r0 == 0) goto L_0x008f
            com.instagram.api.schemas.AudioFilterType r3 = r0.A04
            com.instagram.api.schemas.AudioFilterType r0 = com.instagram.api.schemas.AudioFilterType.UNRECOGNIZED
            if (r3 == r0) goto L_0x008f
            X.8JE r0 = r2.A1X
            com.instagram.music.common.model.AudioOverlayTrack r10 = r0.A03
            r0 = 0
            if (r10 == 0) goto L_0x0032
            r0 = 1
        L_0x0032:
            java.lang.String r7 = "No backing audio"
            r8 = 30000(0x7530, double:1.4822E-319)
            if (r0 != 0) goto L_0x0060
            int r0 = A00(r2)
            long r3 = (long) r0
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x005a
            X.85M r2 = r2.A1d
            r2.A00()
            X.9QS r0 = r2.A03
            if (r0 == 0) goto L_0x005a
            java.lang.String r1 = "loadingViewsHolder"
            X.3oV r0 = r0.A02
            r0.setVisibility(r15)
            X.9QS r0 = r2.A03
            if (r0 == 0) goto L_0x00c1
            android.view.ViewGroup r0 = r0.A00
            r0.setVisibility(r15)
        L_0x005a:
            X.A6C r2 = new X.A6C
            r2.<init>(r7, r5, r15)
            return r2
        L_0x0060:
            if (r10 == 0) goto L_0x008f
            com.instagram.music.common.model.DownloadedTrack r3 = r10.A06
            if (r3 == 0) goto L_0x008f
            com.instagram.music.common.model.MusicAssetModel r0 = r10.A08
            if (r0 == 0) goto L_0x008c
            int r4 = r0.A00
        L_0x006c:
            boolean r0 = r2.A0b
            if (r0 == 0) goto L_0x008f
            int r3 = r10.A02
            if (r3 >= r4) goto L_0x007a
            int r0 = A00(r2)
            if (r3 < r0) goto L_0x0083
        L_0x007a:
            int r0 = A00(r2)
            long r3 = (long) r0
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x008f
        L_0x0083:
            X.85M r0 = r2.A1d
            r0.A00()
            r0.A02()
            goto L_0x005a
        L_0x008c:
            int r4 = r3.A00
            goto L_0x006c
        L_0x008f:
            X.885 r0 = r2.A1m
            X.886 r0 = r0.A00()
            float r3 = r0.A00
            int r0 = A01(r2)
            float r0 = (float) r0
            float r3 = r3 * r0
            double r3 = (double) r3
            double r3 = java.lang.Math.floor(r3)
            int r0 = (int) r3
            if (r0 > 0) goto L_0x00a8
            java.lang.String r7 = "No recording time left"
            goto L_0x005a
        L_0x00a8:
            int r3 = r2.A00
            if (r3 == r5) goto L_0x00b5
            java.lang.String r0 = "initiated recording while waiting for last video..."
            X.0kD.A07(r6, r0, r11)
            r5 = -2
            java.lang.String r7 = "Last video recording in progress"
            goto L_0x005a
        L_0x00b5:
            boolean r3 = r2.A1f()
            if (r3 == 0) goto L_0x00c9
            X.8Im r0 = r2.A0P
            if (r0 != 0) goto L_0x019b
            java.lang.String r1 = "trackDownloader"
        L_0x00c1:
            X.0qQ.A0F(r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00c9:
            X.8Yz r4 = r2.A1F
            r14 = 1
            X.8aL r3 = X.C358088aL.A0J
            X.8aL[] r3 = new X.C358088aL[]{r3}
            boolean r3 = r4.A0V(r3)
            if (r3 != 0) goto L_0x0190
            boolean r3 = A1Y(r2)
            if (r3 == 0) goto L_0x01b8
            X.8aL r3 = X.C358088aL.A0y
            X.8aL[] r3 = new X.C358088aL[]{r3}
            boolean r3 = r4.A0V(r3)
            if (r3 == 0) goto L_0x01b8
        L_0x00ea:
            X.Mgi r9 = r2.A0t
            if (r9 == 0) goto L_0x0108
            X.AZt r8 = new X.AZt
            r3 = r22
            r8.<init>(r3)
            android.widget.ImageView r6 = r9.A09
            int r4 = r9.A00
            r3 = 3000(0xbb8, float:4.204E-42)
            if (r4 == r3) goto L_0x018c
            r3 = 10000(0x2710, float:1.4013E-41)
            if (r4 == r3) goto L_0x0188
            r7 = 0
        L_0x0102:
            java.lang.Integer r10 = X.AnonymousClass05K.A00
            long r12 = (long) r4
            X.C67010Mgi.A00(r6, r7, r8, r9, r10, r11, r12, r14, r15)
        L_0x0108:
            X.8JE r8 = r2.A1X
            java.lang.String r9 = "BackingTrackPlayerController"
            com.instagram.music.common.model.AudioOverlayTrack r3 = r8.A03
            if (r3 != 0) goto L_0x0114
            boolean r3 = r8.A04
            if (r3 == 0) goto L_0x0127
        L_0x0114:
            com.instagram.common.session.UserSession r3 = r8.A07
            X.27r r3 = X.27p.A01(r3)
            X.29H r5 = r3.A03
            com.instagram.music.common.model.AudioOverlayTrack r3 = r8.A03
            r4 = 0
            if (r3 == 0) goto L_0x0122
            r4 = 1
        L_0x0122:
            boolean r3 = r8.A04
            r5.A0I(r4, r3)
        L_0x0127:
            com.instagram.music.common.model.AudioOverlayTrack r3 = r8.A03
            if (r3 == 0) goto L_0x0151
            int r3 = r8.A00
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r7) goto L_0x015d
            com.instagram.common.session.UserSession r3 = r8.A07
            X.27r r3 = X.27p.A01(r3)
            X.29H r6 = r3.A03
            java.lang.String r5 = "player not at the expected position"
            X.29E r15 = r6.A0E
            long r3 = r6.A04
            r18 = 17645025(0x10d3de1, float:2.5942006E-38)
            r19 = r3
            r17 = r1
            r16 = r5
            long r3 = r15.A07(r16, r17, r18, r19)
            r6.A04 = r3
            X.0kD.A07(r9, r5, r11)
        L_0x0151:
            A1B(r2, r14)
            A0m(r2)
            X.A6C r2 = new X.A6C
            r2.<init>(r1, r0, r14)
            return r2
        L_0x015d:
            com.instagram.common.session.UserSession r3 = r8.A07
            int r9 = X.C353608Ij.A00(r3)
            int r3 = r8.A00
            if (r3 < 0) goto L_0x0171
            X.7zI r3 = X.AnonymousClass8JE.A01(r8)
            r3.A00(r9)
        L_0x016e:
            r8.A00 = r7
            goto L_0x0151
        L_0x0171:
            int r3 = -r3
            float r4 = (float) r3
            X.886 r3 = r8.A02
            float r3 = r3.A00
            float r4 = r4 * r3
            int r3 = java.lang.Math.round(r4)
            android.os.Handler r6 = r8.A06
            X.ApG r5 = new X.ApG
            r5.<init>(r8, r9, r3)
            long r3 = (long) r3
            r6.postDelayed(r5, r3)
            goto L_0x016e
        L_0x0188:
            X.61R r7 = r9.A0B
            goto L_0x0102
        L_0x018c:
            X.61R r7 = r9.A0C
            goto L_0x0102
        L_0x0190:
            X.8JE r4 = r2.A1X
            com.instagram.music.common.model.AudioOverlayTrack r3 = r4.A03
            if (r3 == 0) goto L_0x00ea
            X.AnonymousClass8JE.A03(r4, r15)
            goto L_0x00ea
        L_0x019b:
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x01a1
            java.lang.String r1 = "Track Downloading"
        L_0x01a1:
            X.88B r0 = r2.A1x
            X.2Fj r0 = r0.A06
            java.lang.Object r3 = r0.A02()
            X.88C r0 = X.AnonymousClass88C.DOWNLOADING
            if (r3 != r0) goto L_0x01b7
            X.8IQ r0 = r2.A1k
            X.87s r0 = r0.A03
            X.4gw r0 = r0.A04
            if (r0 != 0) goto L_0x01b7
            java.lang.String r1 = "Remix Downloading"
        L_0x01b7:
            r0 = -3
        L_0x01b8:
            X.A6C r2 = new X.A6C
            r2.<init>(r1, r0, r15)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C353498Hw.Dy4(X.A3h):X.A6C");
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [X.7kX, java.lang.Object, X.804] */
    public final void FLM() {
        C40375Ab8 ab8;
        DownloadedTrack downloadedTrack;
        A1E(this, false);
        if (!CTi() && this.A0J.A01.size() == 1) {
            this.A1n.A0U(0, false);
            AnonymousClass8JE r2 = this.A1X;
            AudioOverlayTrack audioOverlayTrack = r2.A03;
            if (!(audioOverlayTrack == null || (downloadedTrack = audioOverlayTrack.A06) == null)) {
                AnonymousClass8JE.A02(r2, downloadedTrack.A00(audioOverlayTrack.A03));
            }
            AnonymousClass88E r0 = this.A1i;
            if (r0 != null && (ab8 = (C40375Ab8) r0.A00.A00()) != null) {
                C339997kW r1 = C339997kW.A04;
                ? obj = new Object();
                obj.A00 = r1;
                ab8.A01(obj);
            }
        }
    }

    public final String getName() {
        return "ClipsCaptureControllerImpl";
    }

    public final void onPause() {
        C59767JXi jXi;
        this.A0h = true;
        if (this.A0l && (jXi = this.A0F) != null && jXi.A0H) {
            jXi.A0N.removeCallbacks(jXi.A0g);
            C66567MWv mWv = jXi.A0B;
            if (mWv != null) {
                mWv.pause();
            }
        }
    }

    public final void onResume() {
        C59767JXi jXi;
        this.A0h = false;
        if (this.A0l && (jXi = this.A0F) != null && jXi.A0H) {
            C66567MWv mWv = jXi.A0B;
            if (mWv == null) {
                jXi.A0E();
                return;
            }
            mWv.start();
            jXi.A0N.postOnAnimation(jXi.A0g);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        AnonymousClass80U r2 = this.A1W;
        if (r2.Atr() == AnonymousClass80V.CLIPS_EDITOR) {
            bundle.putSerializable("SAVE_INSTANCE_KEY_LAST_CAMERA_STATE", r2.Atr());
        }
    }

    public static final int A00(C353498Hw r5) {
        Integer num;
        AnonymousClass8J0 r2;
        C40375Ab8 ab8;
        C3498982i r0;
        int i;
        C40375Ab8 ab82;
        C3495880y r02 = r5.A0I;
        if (r02 != null) {
            num = Integer.valueOf(r02.A01);
        } else {
            num = null;
        }
        if (num == null) {
            0kD.A07("ClipsCaptureControllerImpl", "maxTotalRecordingDuration is null", (Throwable) null);
            return 0;
        }
        AnonymousClass88E r3 = r5.A1i;
        if ((r3 == null || (ab82 = (C40375Ab8) r3.A00.A00()) == null || !ab82.A03()) && A1U(r5) && (r2 = r5.A1n.A0L.A00) != null) {
            if (r2.A01 == -1) {
                C3498982i r03 = r5.A1x.A00;
                if (r03 == null || r03.A00 != AnonymousClass8JI.REMIX || (i = r2.A00) <= 0) {
                    i = C3495980z.A00(r5.A1D).A01;
                } else {
                    int i2 = C3495980z.A00(r5.A1D).A01;
                    if (i > i2) {
                        i = i2;
                    }
                }
                r2.A01 = i;
            }
            if (r3 == null || (ab8 = (C40375Ab8) r3.A00.A00()) == null || (r0 = ab8.A09.A08.A00) == null || !r0.A04.A5p()) {
                return r2.A01;
            }
            num = Integer.valueOf(C3495980z.A00(r5.A1D).A01);
        }
        return num.intValue();
    }

    private final Medium A03() {
        List list = this.A0X;
        if (list == null || list.size() != 1) {
            return null;
        }
        return (Medium) 00k.A0O(list, 0);
    }

    public static final C381939cp A05(C353498Hw r1) {
        Object obj = ((AnonymousClass80T) r1.A1W).A02.A00.second;
        0qQ.A07(obj);
        if (!(obj instanceof AnonymousClass8VN)) {
            return null;
        }
        C358998bo r12 = ((AnonymousClass8VN) obj).A01;
        if (r12 instanceof C381939cp) {
            return (C381939cp) r12;
        }
        return null;
    }

    public static final File A07(C353498Hw r5, File file) {
        try {
            return C39907AIy.A03(r5.A20, r5.Ao9(), C39907AIy.A04(file), "video_import");
        } catch (IOException e) {
            C64169LRs.A01(r5.A11, e, "send to @haydenkai unable to create output file for gallery video", false);
            r5.A1o.A01();
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001a, code lost:
        r2 = ((X.C339027iw) r1).A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Integer A08() {
        /*
            r4 = this;
            X.80U r0 = r4.A1W
            X.80T r0 = (X.AnonymousClass80T) r0
            X.80W r0 = r0.A02
            android.util.Pair r0 = r0.A00
            java.lang.Object r1 = r0.second
            X.0qQ.A07(r1)
            boolean r0 = r1 instanceof X.AnonymousClass8VN
            r3 = 0
            if (r0 == 0) goto L_0x0031
            X.8VN r1 = (X.AnonymousClass8VN) r1
            X.8bo r1 = r1.A01
            boolean r0 = r1 instanceof X.C339027iw
            if (r0 == 0) goto L_0x003d
            X.7iw r1 = (X.C339027iw) r1
            int r2 = r1.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            if (r1 == 0) goto L_0x003d
            if (r2 < 0) goto L_0x003d
            X.831 r0 = r4.A0J
            java.util.List r0 = r0.A01
            int r0 = r0.size()
            if (r2 >= r0) goto L_0x003d
            return r1
        L_0x0031:
            com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel r0 = r4.A1I
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x003d
            r0 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            return r3
        L_0x003d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C353498Hw.A08():java.lang.Integer");
    }

    public static final Integer A09(C353498Hw r1) {
        Object obj = ((AnonymousClass80T) r1.A1W).A02.A00.second;
        0qQ.A07(obj);
        if (!(obj instanceof AnonymousClass8VN)) {
            return null;
        }
        C358998bo r12 = ((AnonymousClass8VN) obj).A01;
        if (r12 instanceof C342007nt) {
            return ((C342007nt) r12).A00;
        }
        return null;
    }

    private final ArrayList A0A() {
        AnonymousClass8XA A002;
        C362048hG r0;
        AnonymousClass8WX r02 = this.A0B;
        if (r02 == null || (A002 = r02.A00()) == null || (r0 = A002.A02) == null) {
            return null;
        }
        List<AnonymousClass9SZ> Brk = r0.A0z.Brk();
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass9SZ r03 : Brk) {
            Medium medium = r03.A01.A00;
            if (medium != null) {
                arrayList.add(medium);
            }
        }
        return arrayList;
    }

    public static final ArrayList A0B(C353498Hw r5) {
        AnonymousClass51S A072;
        List<CameraToolInfo> list;
        ArrayList arrayList = new ArrayList();
        int size = r5.A0J.A01.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass51N r0 = (AnonymousClass51N) r5.A0J.A04(i);
            if (!(r0 == null || (A072 = r0.A07()) == null || (list = A072.A03) == null)) {
                for (CameraToolInfo A002 : list) {
                    arrayList.add(C63184Ksr.A00(A002, i));
                }
            }
        }
        return arrayList;
    }

    private final HashSet A0C() {
        HashSet hashSet = new HashSet();
        for (C358088aL name : (Set) this.A1F.A09.A00) {
            hashSet.add(name.name());
        }
        return hashSet;
    }

    private final void A0E() {
        this.A0n = !this.A0z;
        this.A1s.A0F(this.A1t, this.A1L.A02.A01.A0i, this.A1P.A34);
    }

    private final void A0F() {
        if (this.A0E == null) {
            0kD.A07("ClipsCaptureControllerImpl", "view holder should not be null", (Throwable) null);
            return;
        }
        this.A00 = -1;
        C301725zr r2 = this.A22.A0h;
        ArrayList arrayList = r2.A0B;
        if (!arrayList.isEmpty()) {
            018.A15(arrayList);
            r2.A04 = 00k.A02(arrayList);
        }
        A0p(this);
        this.A1e.A00();
    }

    public static final void A0G(Bitmap bitmap, C353498Hw r4) {
        if (!r4.A0e || !r4.CKX()) {
            C71662eb r1 = r4.A1E;
            if (r1.A04()) {
                C294975nL.A03(r1.A01(), new C40632Afu(r4), 8, true);
                return;
            }
            return;
        }
        C71662eb r12 = r4.A1E;
        ((ImageView) r12.A01()).setImageBitmap(bitmap);
        r12.A01().setVisibility(0);
        C294975nL A012 = C294975nL.A01(r12.A01(), 0);
        A012.A0I(0.5f);
        A012.A05 = null;
        A012.A0H();
    }

    public static final void A0H(View view, C353498Hw r5) {
        Integer num = r5.A0w;
        if (num == AnonymousClass05K.A0C) {
            return;
        }
        if (!view.isLaidOut()) {
            0nA.A0p(view, new C41051AnZ(view, r5));
            return;
        }
        int[] iArr = C59776JXv.A00;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                r5.A2J.A00(17);
            }
        } else if (r5.A0s == ClipsCameraCommandAction.USE_AUDIO_TRIMMING) {
            A10(r5, r5.A0N, (MusicOverlaySearchTab) null, true);
        } else {
            A10(r5, (AudioOverlayTrack) null, (MusicOverlaySearchTab) null, false);
        }
    }

    public static final void A0K(ImmutableList immutableList, ImmutableList immutableList2, C353498Hw r27, AnonymousClass51R r28, Integer num, String str, int i, int i2, boolean z) {
        int i3 = i2;
        StringBuilder sb = new StringBuilder();
        AnonymousClass51R r7 = r28;
        sb.append(r7.A0G);
        sb.append('_');
        sb.append(r7.A03);
        sb.append('_');
        sb.append(r7.A02);
        String obj = sb.toString();
        File file = new File(r7.A0F);
        int i4 = r7.A09;
        int i5 = r7.A05;
        int i6 = r7.A07;
        file.getAbsolutePath();
        C353498Hw r10 = r27;
        if (r10.A0E == null) {
            0kD.A07("ClipsCaptureControllerImpl", "view holder should not be null if on CLIPS format", (Throwable) null);
            return;
        }
        Integer num2 = num;
        int i7 = i;
        if (num2 == AnonymousClass05K.A01 && i2 - i > A02(r10)) {
            C3511387s r1 = r10.A1k.A03;
            if (!r1.A0N() || r1.A0A == null) {
                0kD.A07("ClipsCaptureControllerImpl", "Attempting to upload video from gallery with trimmed duration that exceeds maximum remaining duration.", (Throwable) null);
                i3 = i + A02(r10);
            }
        }
        int i8 = r7.A04;
        boolean z2 = r7.A0K;
        String str2 = r7.A0I;
        MediaUploadMetadata mediaUploadMetadata = r7.A0B;
        List list = r7.A0J;
        int i9 = i8;
        List list2 = list;
        String str3 = str2;
        A0I(immutableList, immutableList2, mediaUploadMetadata, r10, file, (Boolean) null, num2, Integer.valueOf(r7.A08), obj, str, str3, list2, i9, i4, i5, i6, i7, i3, z, z2);
    }

    public static final void A0L(Medium medium, C353498Hw r5, Integer num, boolean z) {
        if (!r5.A0f) {
            JZ5 jz5 = new JZ5(r5.A11, medium, r5.A1D, false);
            C385919jk r2 = new C385919jk(medium, r5, num, z);
            C290815g0 r0 = new C290815g0(jz5, 459);
            r0.A00 = r2;
            1ES.A03(r0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c2, code lost:
        if (r3.A00.A00() == null) goto L_0x00c4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0M(com.instagram.common.gallery.Medium r35, X.C353498Hw r36, boolean r37) {
        /*
            r2 = r36
            boolean r0 = r2.A0f
            if (r0 != 0) goto L_0x01e4
            X.80x r0 = r2.A1v
            com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec r31 = r0.A00()
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r3 = r2.A1s
            X.50r r1 = r2.A1t
            X.5kq r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel.A00(r3)
            if (r0 != 0) goto L_0x001a
            r0 = 0
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel.A08(r3, r1, r0)
        L_0x001a:
            java.lang.Integer r5 = r2.A08()
            r0 = 5000(0x1388, double:2.4703E-320)
            if (r5 == 0) goto L_0x006f
            X.831 r4 = r2.A0J
            int r3 = r5.intValue()
            X.51O r3 = r4.A04(r3)
            if (r3 != 0) goto L_0x0069
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r3 = 63
            java.lang.String r3 = X.Pxd.A00(r3)
            r4.append(r3)
            r4.append(r5)
            java.lang.String r3 = " for store size "
            r4.append(r3)
            X.831 r3 = r2.A0J
            java.util.List r3 = r3.A01
            int r3 = r3.size()
            r4.append(r3)
            java.lang.String r5 = r4.toString()
            java.lang.String r4 = "ClipsCaptureControllerImpl"
            r3 = 0
            X.0kD.A07(r4, r5, r3)
        L_0x0059:
            boolean r8 = A1X(r2)
            com.instagram.common.session.UserSession r13 = r2.A1D
            X.27r r4 = X.27p.A01(r13)
            if (r8 == 0) goto L_0x008f
            r4.A0k()
            goto L_0x008f
        L_0x0069:
            int r0 = r3.BrP()
            long r0 = (long) r0
            goto L_0x0059
        L_0x006f:
            X.8IQ r4 = r2.A1k
            X.87s r3 = r4.A03
            X.4gw r3 = r3.A04
            if (r3 == 0) goto L_0x0080
            int r0 = r4.A00()
            long r0 = (long) r0
            r3 = 500(0x1f4, double:2.47E-321)
            long r0 = r0 + r3
            goto L_0x0059
        L_0x0080:
            com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel r3 = r2.A1I
            X.6nz r3 = r3.A01
            if (r3 == 0) goto L_0x0059
            java.lang.Long r3 = r3.A0G
            if (r3 == 0) goto L_0x0059
            long r0 = r3.longValue()
            goto L_0x0059
        L_0x008f:
            X.2Nn r7 = r2.A20     // Catch:{ IOException | IllegalStateException -> 0x01d2 }
            java.lang.String r6 = r2.Ao9()     // Catch:{ IOException | IllegalStateException -> 0x01d2 }
            java.lang.String r5 = ".mp4"
            r3 = 1681(0x691, float:2.356E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)     // Catch:{ IOException | IllegalStateException -> 0x01d2 }
            java.io.File r9 = X.C39907AIy.A03(r7, r6, r5, r3)     // Catch:{ IOException | IllegalStateException -> 0x01d2 }
            r14 = 0
            int r3 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r3 == 0) goto L_0x00af
            long r14 = r9.length()
            long r14 = r14 / r0
            r5 = 8000(0x1f40, double:3.9525E-320)
            long r14 = r14 * r5
        L_0x00af:
            boolean r3 = r2.CVJ()
            r7 = 0
            if (r3 != 0) goto L_0x00c4
            X.88E r3 = r2.A1i
            if (r3 == 0) goto L_0x00c4
            X.81C r3 = r3.A00
            X.81E r3 = r3.A00()
            r33 = 30
            if (r3 != 0) goto L_0x00c6
        L_0x00c4:
            r33 = 2
        L_0x00c6:
            X.29f r12 = r4.A0A
            X.8fP r18 = X.C360948fP.GALLERY
            r5 = r35
            int r11 = r5.A0B
            int r10 = r5.A04
            java.lang.Long r22 = java.lang.Long.valueOf(r14)
            java.lang.String r24 = r9.getAbsolutePath()
            double r3 = (double) r0
            r16 = 1000(0x3e8, double:4.94E-321)
            r14 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r3 = r3 / r14
            java.lang.Double r21 = java.lang.Double.valueOf(r3)
            int r3 = A00(r2)
            long r3 = (long) r3
            long r3 = r3 / r16
            java.lang.Long r23 = java.lang.Long.valueOf(r3)
            X.9tJ r17 = r2.Aje()
            java.lang.Boolean r20 = java.lang.Boolean.valueOf(r37)
            long r3 = r5.A0C
            r14 = 0
            int r6 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r6 > 0) goto L_0x0102
            long r3 = r5.A0D
        L_0x0102:
            r6 = 1
            r25 = r6
            r26 = r11
            r27 = r10
            r28 = r3
            r30 = r8
            r16 = r12
            r19 = r7
            r16.A0W(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30)
            java.lang.String r3 = r9.getAbsolutePath()
            X.0qQ.A07(r3)
            r2.A0T = r3
            A0m(r2)
            A1B(r2, r6)
            boolean r3 = A1U(r2)
            if (r3 == 0) goto L_0x0191
            X.85M r11 = r2.A1d
            android.content.Context r3 = r2.A11
            X.4DH r4 = r2.A1B
            androidx.fragment.app.FragmentActivity r10 = r4.requireActivity()
            X.8IQ r4 = r2.A1k
            X.87s r4 = r4.A03
            X.4gw r4 = r4.A04
            r14 = 0
            if (r4 == 0) goto L_0x013d
            r14 = 1
        L_0x013d:
            r12 = 2131969785(0x7f1346f9, float:1.9576503E38)
            android.widget.FrameLayout r4 = r11.A00
            if (r4 != 0) goto L_0x0191
            android.widget.FrameLayout r4 = new android.widget.FrameLayout
            r4.<init>(r3)
            r11.A00 = r4
            r4.setClickable(r6)
            if (r14 == 0) goto L_0x0162
            android.widget.FrameLayout r4 = r11.A00
            if (r4 == 0) goto L_0x0162
            r6 = 2130970254(0x7f04068e, float:1.7549213E38)
            int r6 = X.2Yu.A0H(r3, r6)
            int r3 = r3.getColor(r6)
            r4.setBackgroundColor(r3)
        L_0x0162:
            android.view.LayoutInflater r6 = r10.getLayoutInflater()
            r4 = 2131627349(0x7f0e0d55, float:1.888196E38)
            android.widget.FrameLayout r3 = r11.A00
            android.view.View r4 = r6.inflate(r4, r3)
            r3 = 2131438255(0x7f0b2aaf, float:1.8498432E38)
            android.view.View r4 = r4.requireViewById(r3)
            android.widget.TextView r4 = (android.widget.TextView) r4
            android.content.res.Resources r3 = r10.getResources()
            java.lang.CharSequence r3 = r3.getText(r12)
            r4.setText(r3)
            android.widget.FrameLayout r6 = r11.A00
            r4 = -1
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r3.<init>(r4, r4)
            r10.addContentView(r6, r3)
            A0m(r2)
        L_0x0191:
            boolean r36 = A1Z(r2)
            boolean r37 = A1U(r2)
            java.lang.String r4 = r5.A0X
            java.io.File r3 = com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel.A0B
            if (r3 == 0) goto L_0x01a3
            java.lang.String r7 = r3.getAbsolutePath()
        L_0x01a3:
            boolean r3 = X.0qQ.A0K(r4, r7)
            if (r3 == 0) goto L_0x01ac
            X.AnonymousClass8IK.A06(r13)
        L_0x01ac:
            java.lang.String r32 = r9.getCanonicalPath()
            X.0qQ.A07(r32)
            X.TNo r4 = new X.TNo
            r29 = r5
            r30 = r13
            r34 = r0
            r28 = r4
            r28.<init>(r29, r30, r31, r32, r33, r34, r36, r37)
            X.9jl r3 = new X.9jl
            r3.<init>(r5, r2, r9, r8)
            r1 = 459(0x1cb, float:6.43E-43)
            X.5g0 r0 = new X.5g0
            r0.<init>(r4, r1)
            r0.A00 = r3
            X.1ES.A03(r0)
            return
        L_0x01d2:
            r4 = move-exception
            A0j(r2)
            android.content.Context r3 = r2.A11
            java.lang.String r1 = "send to @haydenkai unable to create output file for layout video2"
            r0 = 0
            X.C64169LRs.A01(r3, r4, r1, r0)
            X.88V r0 = r2.A1o
            r0.A01()
            return
        L_0x01e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C353498Hw.A0M(com.instagram.common.gallery.Medium, X.8Hw, boolean):void");
    }

    public static final void A0N(C358088aL r3, C353498Hw r4, boolean z) {
        C357638Yz r2 = r4.A1F;
        C279284yO r1 = (C279284yO) r2.A08.A00;
        if (r1 instanceof AnonymousClass80O) {
            r2.A0J(r1, r3, z);
        }
    }

    public static final void A0P(C353538Ia r17, C353498Hw r18) {
        String str;
        String str2;
        Integer num;
        C353498Hw r0 = r18;
        if (r0.A1B.getActivity() == null) {
            27p.A01(r0.A1D).A0J.A07(r0.A1t, "activity is detached", (String) null, (String) null);
            return;
        }
        String str3 = null;
        if (r0.CKX() || r0.A16 == 28D.A3b) {
            C353538Ia r1 = r17;
            if ((r1 instanceof C367128qE) && r0.A2Y) {
                AnonymousClass8A2 r6 = r0.A1h;
                r6.A01 = r6.A0K.A02(42144080, r6.A01);
                27p.A01(r0.A1D).A1q(r0.Ao9());
            }
            UserSession userSession = r0.A1D;
            29I r5 = 27p.A01(userSession).A02;
            AudioOverlayTrack audioOverlayTrack = r0.A0N;
            if (audioOverlayTrack != null) {
                str = audioOverlayTrack.A0A;
                str2 = audioOverlayTrack.A0B;
                MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
                if (musicAssetModel != null) {
                    str3 = musicAssetModel.A0I;
                }
            } else {
                str = null;
                str2 = null;
            }
            AnonymousClass29D r4 = r5.A00;
            String.valueOf(r4.A00.A0J());
            String.valueOf(r4.A00());
            29I.A01(r5, "stitch_video_and_go_to_post_capture", str, str2, str3, (String) null, (String) null, (String) null, (String) null, (String) null);
            AnonymousClass8A2 r11 = r0.A1h;
            28D r12 = r0.A1v.A00;
            int size = r0.A0J.A01.size();
            String str4 = ((C279284yO) r0.A1F.A08.A00).A02;
            C2801950r r13 = r0.A1t;
            r11.A04(r12, r13, str4, 27p.A01(userSession).A04.A0L, size);
            29L r42 = 27p.A01(userSession).A0J;
            String str5 = r1.A00;
            int size2 = r0.A0J.A01.size();
            if (r42.A05.Aji() == C279294yP.CLIPS && r13 == C2801950r.CLIPS) {
                29E r112 = r42.A04;
                long A052 = r112.A05("stitch_and_go_to_post_cap", 585185740, r42.A01, r42.A03);
                r42.A01 = A052;
                29E r132 = r112;
                r132.A0B(A052, "stitch_transition_source", str5, false);
                r132.A0B(r42.A01, "num_segments", String.valueOf(size2), false);
            }
            r0.A0D = r1;
            if (((r1 instanceof C366378op) && !((C366378op) r1).A00) || (r1 instanceof C366388oq)) {
                ClipsCreationViewModel clipsCreationViewModel = r0.A1n;
                C361278fx r43 = (C361278fx) clipsCreationViewModel.A0C.A02();
                if (r43 == null || r43.A00 != 3) {
                    num = null;
                } else {
                    num = ((C349307zv) r43.A00()).A1M;
                }
                int hashCode = clipsCreationViewModel.A0O.A03.getValue().hashCode();
                if (num == null || hashCode != num.intValue()) {
                    1Eo.A05(19B.A00, new MHN((Object) r1, (Object) clipsCreationViewModel, (AnonymousClass4D7) null, 4), C318116oQ.A00(clipsCreationViewModel));
                    return;
                }
            }
            r1.equals(C387889mw.A00);
            r0.A1n.A0X(r1);
            return;
        }
        0kD.A07("ClipsCaptureControllerImpl", "Request for post-capture when segment store is empty", (Throwable) null);
        r0.A1h.A0N("ClipsCaptureControllerImpl.stitchVideoAndGoToPostCapture", "segment store is empty");
        27p.A01(r0.A1D).A0J.A07(r0.A1t, "segment store is empty", (String) null, (String) null);
    }

    public static final void A0Q(C39653A3t a3t, C353498Hw r17, List list, int i, boolean z, boolean z2) {
        C353498Hw r11 = r17;
        boolean A1T2 = A1T(r11);
        if (!A1T2) {
            r11.A1d.A01();
        }
        Context context = r11.A11;
        UserSession userSession = r11.A1D;
        2Nn r7 = r11.A20;
        String Ao9 = r11.Ao9();
        CameraSpec A002 = r11.A1v.A00();
        C385889jh r10 = new C385889jh(r11, i, z, z2, A1T2);
        0qQ.A0B(r7, 3);
        C290815g0 r0 = new C290815g0(new C41362Asj(context, userSession, A002, a3t, r7, Ao9, list), 459);
        r0.A00 = r10;
        1ES.A03(r0);
    }

    public static final void A0S(C353498Hw r5) {
        boolean z;
        Iterator it = r5.A0V.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next() instanceof C59812JZg) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (r5.A1P.A1g != null || (!AnonymousClass3S1.A04(r5.A2V.A0V(C59812JZg.class))) || z || r5.A1g()) {
            A0N(C358088aL.A04, r5, false);
            return;
        }
        A0N(C358088aL.A04, r5, true);
        27p.A01(r5.A1D).A1G(C59725JVj.PRE_CAPTURE);
    }

    public static final void A0T(C353498Hw r4) {
        C301725zr r3 = r4.A22.A0h;
        int A002 = A00(r4);
        r3.A01 = (int) (((float) A002) * r4.A1m.A00().A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r0.A02 >= 15000) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0U(X.C353498Hw r9) {
        /*
            com.instagram.music.common.model.AudioOverlayTrack r0 = r9.A0N
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L_0x000d
            int r2 = r0.A02
            r0 = 15000(0x3a98, float:2.102E-41)
            r1 = 1
            if (r2 < r0) goto L_0x000e
        L_0x000d:
            r1 = 0
        L_0x000e:
            X.8Yz r0 = r9.A1F
            X.80m r8 = r0.A08
            java.lang.Object r0 = r8.A00
            boolean r0 = r0 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x008b
            boolean r0 = r9.CKX()
            if (r0 != 0) goto L_0x008c
            if (r1 != 0) goto L_0x008c
            boolean r0 = A1U(r9)
            if (r0 != 0) goto L_0x008c
            X.8aL r5 = X.C358088aL.A0E
            A0N(r5, r9, r4)
            X.80y r1 = r9.A0I
            if (r1 == 0) goto L_0x008b
            int r0 = r1.A02
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r0 = r1.A00
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            if (r2 == 0) goto L_0x008b
            if (r7 == 0) goto L_0x008b
            android.content.Context r6 = r9.A11
            android.content.res.Resources r1 = r6.getResources()
            int r0 = r2.intValue()
            android.graphics.drawable.Drawable r3 = r1.getDrawable(r0)
            X.0qQ.A07(r3)
            r0 = 255(0xff, float:3.57E-43)
            r3.setAlpha(r0)
            X.8E7 r2 = r9.A1O
            X.8E8 r1 = r2.A00()
            java.lang.Object r0 = r8.A00
            X.4yO r0 = (X.C279284yO) r0
            r1.A09(r3, r0, r5)
            X.8E8 r4 = r2.A00()
            java.lang.Object r3 = r8.A00
            X.4yO r3 = (X.C279284yO) r3
            r0 = 2131961072(0x7f1324f0, float:1.955883E38)
            java.lang.String r2 = r6.getString(r0)
            int r0 = r7.intValue()
            java.lang.String r0 = r6.getString(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            X.0qQ.A07(r0)
            r4.A04(r3, r5, r0)
        L_0x008b:
            return
        L_0x008c:
            X.8aL r0 = X.C358088aL.A0E
            A0N(r0, r9, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C353498Hw.A0U(X.8Hw):void");
    }

    public static final void A0V(C353498Hw r5) {
        boolean z;
        if (r5.A0E == null) {
            0kD.A07("ClipsCaptureControllerImpl", "view holder should not be null", (Throwable) null);
            return;
        }
        if (A1U(r5)) {
            z = false;
        } else {
            z = false;
            if (r5.A0J.A01.size() > 0) {
                AnonymousClass831 r2 = r5.A0J;
                AnonymousClass51N r1 = (AnonymousClass51N) r2.A04(r2.A01.size() - 1);
                if ((r1 instanceof AnonymousClass51M) && ((AnonymousClass51M) r1).A0F.A08 == 0) {
                    z = true;
                }
            }
        }
        C358088aL r4 = C358088aL.A09;
        A0N(r4, r5, z);
        r5.A1O.A00().A05(AnonymousClass80N.A00, r4, r5.A11.getString(2131954573));
        C357638Yz r22 = r5.A1F;
        if (r22.A0V(r4) != r5.A0e) {
            r22.A0L(r4);
        }
    }

    public static final void A0W(C353498Hw r5) {
        if (!r5.A0e || !r5.CKX() || r5.A0i) {
            A0G((Bitmap) null, r5);
        } else if (!r5.A20.A02()) {
            C64169LRs.A02(r5.A11, AnonymousClass05K.A0C, "Directory provider unavailable during ghost overlay", 2131974093);
        } else {
            C71662eb r3 = r5.A1E;
            View A012 = r3.A01();
            0qQ.A07(A012);
            AnonymousClass81W r2 = ((NineSixteenLayoutConfigImpl) r5.A1H).A0K;
            0nA.A0f(A012, r2.getWidth());
            View A013 = r3.A01();
            0qQ.A07(A013);
            0nA.A0V(A013, r2.getHeight());
            AnonymousClass831 r1 = r5.A0J;
            AnonymousClass51N r22 = (AnonymousClass51N) r1.A04(r1.A01.size() - 1);
            if (r22 instanceof AnonymousClass51M) {
                View A014 = r3.A01();
                0qQ.A07(A014);
                0nA.A0p(A014, new C41049AnX(r5, r22));
            }
        }
    }

    public static final void A0X(C353498Hw r11) {
        AnonymousClass9QR r3 = r11.A0E;
        if (r3 == null) {
            0kD.A07("ClipsCaptureControllerImpl", "view holder should not be null", (Throwable) null);
            return;
        }
        AudioOverlayTrack audioOverlayTrack = r11.A0N;
        if (r11.A1x.A02()) {
            A0N(C358088aL.A0g, r11, false);
            return;
        }
        C358088aL r5 = C358088aL.A0g;
        A0N(r5, r11, true);
        UserSession userSession = r11.A1D;
        float f = 0.5f;
        if (AnonymousClass30D.A08(userSession)) {
            f = 1.0f;
        }
        if (audioOverlayTrack != null) {
            MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
            if (musicAssetModel != null) {
                if (musicAssetModel.A01 != OriginalAudioSubtype.A06 || (AnonymousClass30D.A08(userSession) && 182.A06(0Tu.A06, userSession, 36321395961242949L))) {
                    JYP.A01(userSession, musicAssetModel, r3.A05);
                } else {
                    r11.A1I((AudioOverlayTrack) null, false);
                    C59689JTv.A01(r11.A11, "mix_not_available", 2131966554, 0);
                }
                GIH gih = r3.A05;
                gih.setAlpha((int) (f * 255.0f));
                AnonymousClass8E8 A002 = r11.A1O.A00();
                C357638Yz r32 = r11.A1F;
                boolean A092 = A002.A09(gih, (C279284yO) r32.A08.A00, r5);
                AnonymousClass29D r1 = 27p.A01(userSession).A02.A00;
                String.valueOf(r1.A00.A0J());
                String.valueOf(r1.A00());
                r32.A0K(r5);
                r11.A1X.A04 = A092;
                return;
            }
            return;
        }
        Drawable drawable = r11.A11.getResources().getDrawable(R.drawable.instagram_music_outline_44);
        if (drawable != null) {
            drawable.setAlpha((int) (f * 255.0f));
        }
        AnonymousClass8E8 A003 = r11.A1O.A00();
        C357638Yz r12 = r11.A1F;
        A003.A09(drawable, (C279284yO) r12.A08.A00, r5);
        r12.A0M(r5);
        r11.A1X.A04 = false;
    }

    public static final void A0Y(C353498Hw r6) {
        C358088aL r5 = C358088aL.A0t;
        A0N(r5, r6, true);
        String format = String.format(Locale.getDefault(), r6.A11.getString(2131974121), new Object[]{C339947kR.A00(r6.A1m.A00().A00)});
        0qQ.A07(format);
        r6.A1O.A00().A04((C279284yO) r6.A1F.A08.A00, r5, format);
    }

    public static final void A0Z(C353498Hw r6) {
        if (r6.A0E == null) {
            0kD.A07("ClipsCaptureControllerImpl", "view holder should not be null", (Throwable) null);
            return;
        }
        AnonymousClass8E8 A002 = r6.A1O.A00();
        C358088aL r5 = C358088aL.A0y;
        A002.A05(AnonymousClass80N.A00, r5, r6.A11.getString(2131954670));
        C357638Yz r4 = r6.A1F;
        boolean A0V2 = r4.A0V(r5);
        boolean z = false;
        if (r6.A02 != -1) {
            z = true;
        }
        if (A0V2 != z) {
            r4.A0L(r5);
        }
    }

    public static final void A0a(C353498Hw r4) {
        int i;
        if (r4.A0E == null) {
            0kD.A07("ClipsCaptureControllerImpl", "view holder should not be null", (Throwable) null);
            return;
        }
        if (A1Y(r4)) {
            int A012 = C348947zL.A01(r4.A0J);
            if (r4.A1F.A0V(C358088aL.A0J)) {
                i = A02(r4);
            } else {
                i = r4.A02;
                if (i == -1) {
                    i = r4.A03;
                }
            }
            r4.A22.A0h.A03 = A012 + i;
        } else {
            ShutterButton shutterButton = r4.A22;
            shutterButton.A0h.A03 = 0;
            shutterButton.invalidate();
        }
        A0v(r4, A02(r4) / IgNetworkConsentStorage.MAX_ENTRIES);
    }

    public static final void A0c(C353498Hw r1) {
        Dialog dialog = r1.A04;
        if (dialog != null) {
            dialog.dismiss();
        }
        C49945FFy fFy = r1.A0L;
        if (fFy != null) {
            fFy.A02();
        }
    }

    public static final void A0e(C353498Hw r10) {
        C3499382n r0;
        UserSession userSession = r10.A1D;
        boolean z = true;
        if (!AnonymousClass30D.A08(userSession)) {
            29H r02 = 27p.A01(userSession).A03;
            29E r4 = r02.A0E;
            long A032 = r4.A03(17641988, r02.A0B);
            r4.A09(A032, AnonymousClass000.A00(5074), "clips_pre_cap_audio_button");
            r4.A07("music browser unavailable", "", 17641988, A032);
            C59689JTv.A01(r10.A11, "clips_music_unavailable", 2131955517, 0);
        } else if (r10.A1F.A08.A00 != C3493880e.A00 || (r0 = r10.A1P.A12) == null || r0.A00 == null) {
            27p.A01(userSession);
            27p.A01(userSession).A03.A07("clips_pre_cap_audio_button");
            AudioOverlayTrack audioOverlayTrack = r10.A0N;
            if (A1S(r10) && r10.A0y) {
                z = false;
            }
            A10(r10, audioOverlayTrack, (MusicOverlaySearchTab) null, z);
        } else {
            C59689JTv.A0F(r10.A11, "clips_music_pinned", 2131955587);
        }
    }

    public static final void A0g(C353498Hw r2) {
        AnonymousClass8XA A002;
        C59767JXi jXi = r2.A0F;
        if (jXi != null && jXi.A0H) {
            jXi.A0E();
            A0m(r2);
            A1B(r2, false);
            AnonymousClass8WX r0 = r2.A0B;
            if (r0 != null && (A002 = r0.A00()) != null) {
                A002.A0D();
            }
        }
    }

    public static final void A0h(C353498Hw r4) {
        if (182.A06(0Tu.A05, r4.A1D, 36327387440757138L)) {
            A0j(r4);
        } else {
            r4.A12.postDelayed(new C40844AkE(r4), 500);
        }
    }

    public static final void A0i(C353498Hw r9) {
        AnonymousClass9IV r0;
        AnonymousClass88W r02 = (AnonymousClass88W) r9.A1s.A0C.A02();
        if (r02 != null && (r0 = (AnonymousClass9IV) r02.A01) != null) {
            UserSession userSession = r9.A1D;
            27p.A01(userSession).A1D((C371088xY) null, (C59725JVj) null, ((C293505kq) r0.A00).A0T, (String) null, (String) null, (String) null, false);
            C394779yg.A00(userSession).A01(C390939s5.SAVED_DRAFT);
        }
    }

    public static final void A0j(C353498Hw r1) {
        AnonymousClass8WX r0;
        AnonymousClass8XA A002;
        if (r1.A1k.A03.A04 == null && (r0 = r1.A0B) != null && (A002 = r0.A00()) != null) {
            A002.A0M(false);
        }
    }

    public static final void A0k(C353498Hw r12) {
        if (!r12.A29) {
            List list = r12.A0X;
            if (list != null && !list.isEmpty()) {
                r12.A1o.A06.A0B(new AnonymousClass88W(new AnonymousClass88X(r12.A19, r12.A1z, (String) null, list, r12.A2X, 678, false, r12.A2Z, false)));
            } else {
                return;
            }
        }
        r12.A0X = null;
        r12.A0W = null;
    }

    public static final void A0l(C353498Hw r2) {
        C265674Vs r1 = r2.A0r;
        if (r1 != null) {
            C71662eb r22 = r2.A1E;
            if (r22.A04()) {
                View A012 = r22.A01();
                0qQ.A07(A012);
                float A002 = AnonymousClass4WA.A00(A012, r1);
                r22.A01().setScaleX(A002);
                r22.A01().setScaleY(A002);
                r22.A01().setPivotY(0.0f);
                r22.A01().setPivotX((float) (r22.A01().getWidth() / 2));
            }
        }
    }

    public static final void A0n(C353498Hw r3) {
        29R r1 = 27p.A01(r3.A1D).A09;
        1Ln A082 = 1Ln.A08(r1.A01);
        if (r1.A0P() && A082.A00.isSampled()) {
            A082.A0t("IG_CAMERA_ENTITY_TAP");
            A082.A0r("KEEP_EDITING_TAP");
            29R.A00(A082, r1);
            A082.A0a(C279294yP.CLIPS);
            AnonymousClass283 r2 = r1.A04;
            A082.A0b(r2.A09);
            A082.A0W(2);
            A082.A0d(C59725JVj.PRE_CAPTURE);
            A082.A0n(27x.A08.getModuleName());
            A082.A0c(r2.A0A);
            A082.A0R("composition_str_id", r2.A0M);
            A082.A0M(r2.A0A, "composition_media_type");
            A082.A0u(AnonymousClass1QI.A00.A02.A00);
            A082.Cgf();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001d, code lost:
        if (((X.C3511387s) r3.A27.getValue()).A04 != null) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0o(X.C353498Hw r3) {
        /*
            X.8Yz r0 = r3.A1F
            X.80m r0 = r0.A08
            java.lang.Object r0 = r0.A00
            boolean r0 = r0 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x002a
            X.8FA r2 = r3.A2H
            boolean r0 = r3.A1L()
            if (r0 == 0) goto L_0x001f
            X.0eM r0 = r3.A27
            java.lang.Object r0 = r0.getValue()
            X.87s r0 = (X.C3511387s) r0
            X.4gw r1 = r0.A04
            r0 = 1
            if (r1 == 0) goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            X.05G r1 = r2.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.Epw(r0)
        L_0x0029:
            return
        L_0x002a:
            X.86W r0 = r3.A2E
            X.81C r0 = r0.A00
            X.81E r0 = r0.A00()
            X.8Xo r0 = (X.C357358Xo) r0
            boolean r0 = r0.A06()
            if (r0 != 0) goto L_0x0029
            X.8FA r2 = r3.A2H
            r0 = 1
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C353498Hw.A0o(X.8Hw):void");
    }

    public static final void A0q(C353498Hw r3) {
        int A042 = r3.A1F.A04(C358088aL.A0E);
        if (r3.A0I != 00k.A0O(r3.A23, A042)) {
            A0t(r3, A042);
        }
    }

    public static final void A0r(C353498Hw r1) {
        if (r1.A0T != null) {
            r1.A0T = null;
            A0m(r1);
            A1B(r1, true);
            r1.A1d.A00();
        }
    }

    public static final void A0s(C353498Hw r8, int i) {
        AnonymousClass831 r1;
        if (r8.A0E == null) {
            C64169LRs.A02(r8.A11, AnonymousClass05K.A00, "Trying to delete segment when UI isn't available", 2131955551);
            return;
        }
        29R r3 = 27p.A01(r8.A1D).A09;
        1Ln A082 = 1Ln.A08(r3.A01);
        if (A082.A00.isSampled()) {
            A082.A0t(AnonymousClass000.A00(2300));
            A082.A0r(AnonymousClass000.A00(2127));
            29R.A00(A082, r3);
            A082.A0a(r3.A0J());
            A082.A0Q("capture_format_index", 0L);
            A082.A0b(r3.A04.A09);
            A082.A0T();
            A082.A0c(28t.A06);
            A082.A0n(27x.A08.getModuleName());
            A082.A0Q("segment_index", Long.valueOf((long) i));
            A082.A0U();
            A082.A0M(r3.A0I(), "capture_type");
            A082.A0u(AnonymousClass1QI.A00.A02.A00);
            A082.Cgf();
        }
        ClipsCreationViewModel clipsCreationViewModel = r8.A1n;
        clipsCreationViewModel.A0U(i, true);
        Object A022 = clipsCreationViewModel.A0G.A02();
        if ((A022 instanceof AnonymousClass831) && (r1 = (AnonymousClass831) A022) != null) {
            r8.A22.A0h.setSegments(r1);
        }
        C59767JXi jXi = r8.A0F;
        if (jXi != null && jXi.A0H) {
            if (!r8.CKX()) {
                A0g(r8);
                View findViewById = r8.A13.findViewById(R.id.preview_view);
                if (findViewById != null) {
                    findViewById.setAlpha(1.0f);
                }
                AnonymousClass88B r2 = r8.A1x;
                if (r2.A02()) {
                    r2.A06.A0B(AnonymousClass88C.UNSET);
                    r2.A02.Epw(false);
                    r2.A00 = null;
                    r2.A01 = null;
                    A0b(r8);
                }
                ((C359318cb) r8.A2S.get()).A0H = C359418cn.A00;
            } else {
                C59767JXi jXi2 = r8.A0F;
                if (jXi2 != null) {
                    AnonymousClass831 r12 = r8.A0K;
                    int A002 = A00(r8);
                    0qQ.A0B(r12, 0);
                    if (!jXi2.A0H) {
                        0kD.A07(C59767JXi.__redex_internal_original_name, "should be showing during update", (Throwable) null);
                    } else {
                        jXi2.A0D = new AnonymousClass831(r12.A05(), r12.A03);
                        jXi2.A03 = A002;
                        jXi2.A04 = 0;
                        jXi2.A0N.removeCallbacks(jXi2.A0g);
                        C66567MWv mWv = jXi2.A0B;
                        if (mWv != null) {
                            mWv.reset();
                        }
                        C59767JXi.A0C(jXi2, false, true);
                        C59767JXi.A07(jXi2, 0);
                    }
                }
            }
        }
        if (!r8.CKX()) {
            clipsCreationViewModel.A0I.A0B((Object) null);
        }
    }

    public static final void A0t(C353498Hw r5, int i) {
        C3495880y r4 = (C3495880y) 00k.A0O(r5.A23, i);
        r5.A0I = r4;
        if (r4 != null) {
            C301725zr r3 = r5.A22.A0h;
            int i2 = r4.A01;
            r3.A01 = (int) (((float) i2) * r5.A1m.A00().A00);
            r5.A1O();
            r5.A1v.A05.A0B(r4);
            A0T(r5);
            A0v(r5, A02(r5) / IgNetworkConsentStorage.MAX_ENTRIES);
        }
    }

    public static final void A0u(C353498Hw r3, int i) {
        C3495780x r0 = r3.A1v;
        List list = r0.A08;
        Object A022 = r0.A05.A02();
        0qQ.A0B(list, 0);
        int indexOf = list.indexOf(A022) + 1;
        if (indexOf >= list.size()) {
            indexOf = 0;
        } else {
            while (indexOf < list.size() - 1 && ((C3495880y) list.get(indexOf)).A01 < i) {
                indexOf++;
            }
        }
        r3.A0I = (C3495880y) list.get(indexOf);
        A0R(r3);
    }

    public static final void A0v(C353498Hw r4, int i) {
        AnonymousClass8JB r3 = r4.A2W;
        int i2 = (int) (1000.0f * r4.A1m.A00().A00);
        r3.A02.removeCallbacksAndMessages((Object) null);
        r3.A01 = i;
        r3.A00 = i2;
        AnonymousClass8JM.A00(i, new C377149Ks(r4, 45));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: X.9cw} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0w(X.C353498Hw r30, X.AnonymousClass8I4 r31) {
        /*
            r1 = r30
            r7 = r31
            X.823 r3 = r1.A1M
            if (r3 == 0) goto L_0x0028
            X.8IF r0 = X.AnonymousClass8IF.A00
            boolean r0 = X.0qQ.A0K(r7, r0)
            if (r0 != 0) goto L_0x0028
            X.8I3 r0 = X.AnonymousClass8I3.A00
            boolean r0 = X.0qQ.A0K(r7, r0)
            if (r0 != 0) goto L_0x0028
            X.9Qi r0 = X.C378569Qi.A00
            boolean r0 = X.0qQ.A0K(r7, r0)
            r9 = 1
            if (r0 == 0) goto L_0x0029
            X.8Xk r0 = r3.A00()
            r0.A04(r9)
        L_0x0028:
            return
        L_0x0029:
            boolean r0 = r7 instanceof X.B3b
            r14 = 0
            if (r0 == 0) goto L_0x0028
            r4 = r7
            X.B3b r4 = (X.B3b) r4
            if (r4 == 0) goto L_0x0028
            boolean r0 = r7 instanceof X.B3Z
            if (r0 == 0) goto L_0x005e
            r0 = r7
            X.B3Z r0 = (X.B3Z) r0
        L_0x003a:
            boolean r2 = r7 instanceof X.B3a
            if (r2 == 0) goto L_0x005c
            X.B3a r7 = (X.B3a) r7
        L_0x0040:
            X.8JL r6 = r4.C2k()
            com.instagram.common.typedurl.ImageUrl r8 = r4.C73()
            r4 = 0
            X.0qQ.A0B(r6, r4)
            X.0qQ.A0B(r8, r9)
            int r5 = r6.ordinal()
            switch(r5) {
                case 0: goto L_0x0070;
                case 1: goto L_0x0070;
                case 2: goto L_0x0068;
                case 3: goto L_0x006c;
                case 4: goto L_0x0064;
                case 5: goto L_0x0060;
                case 6: goto L_0x0028;
                default: goto L_0x0056;
            }
        L_0x0056:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x005c:
            r7 = r14
            goto L_0x0040
        L_0x005e:
            r0 = r14
            goto L_0x003a
        L_0x0060:
            r2 = 2131955598(0x7f130f8e, float:1.9547728E38)
            goto L_0x0073
        L_0x0064:
            r2 = 2131955599(0x7f130f8f, float:1.954773E38)
            goto L_0x0073
        L_0x0068:
            r2 = 2131955548(0x7f130f5c, float:1.9547627E38)
            goto L_0x0073
        L_0x006c:
            r2 = 2131955597(0x7f130f8d, float:1.9547726E38)
            goto L_0x0073
        L_0x0070:
            r2 = 2131955546(0x7f130f5a, float:1.9547623E38)
        L_0x0073:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            r2 = 4
            if (r5 == r2) goto L_0x0178
            r2 = 5
            r24 = 2131955549(0x7f130f5d, float:1.9547629E38)
            if (r5 == r2) goto L_0x0083
            r24 = 2131955547(0x7f130f5b, float:1.9547625E38)
        L_0x0083:
            if (r10 == 0) goto L_0x0028
            X.8Xl r5 = X.C357328Xl.CLIPS_PRELOADED_SETTINGS_IN_CAMERA_PROMOTION
            int r23 = r10.intValue()
            r27 = 1
            X.8JL r2 = X.AnonymousClass8JL.EFFECT
            if (r6 == r2) goto L_0x0093
            r27 = 0
        L_0x0093:
            r26 = 2131165193(0x7f070009, float:1.7944596E38)
            X.7jM r13 = new X.7jM
            r15 = r14
            r17 = r14
            r19 = r14
            r20 = r14
            r21 = r14
            r22 = r4
            r25 = r4
            r28 = r9
            r29 = r9
            r30 = r4
            r31 = r4
            r18 = r5
            r16 = r8
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            X.8Xk r9 = r3.A00()
            com.instagram.common.session.UserSession r8 = r1.A1D
            if (r7 == 0) goto L_0x0174
            java.lang.String r22 = r7.getEffectId()
        L_0x00c0:
            X.80D r12 = r1.A1P
            java.lang.String r7 = r12.A2m
            if (r0 == 0) goto L_0x00ce
            com.instagram.music.common.config.MusicAttributionConfig r0 = r0.BUm()
            if (r0 == 0) goto L_0x00ce
            com.instagram.music.common.model.MusicAssetModel r14 = r0.A02
        L_0x00ce:
            X.8I2 r0 = r1.A1j
            X.05G r4 = r0.A04
            java.lang.Object r11 = r4.getValue()
            X.8I4 r11 = (X.AnonymousClass8I4) r11
            boolean r0 = r11 instanceof X.B3Z
            r10 = 0
            if (r0 == 0) goto L_0x0171
            r2 = r11
            X.B3Z r2 = (X.B3Z) r2
        L_0x00e0:
            boolean r0 = r11 instanceof X.B3a
            if (r0 == 0) goto L_0x016e
            X.B3a r11 = (X.B3a) r11
        L_0x00e6:
            java.lang.Object r4 = r4.getValue()
            boolean r0 = r4 instanceof X.C382009cw
            if (r0 == 0) goto L_0x00f1
            r10 = r4
            X.9cw r10 = (X.C382009cw) r10
        L_0x00f1:
            X.9Tl r4 = new X.9Tl
            r4.<init>(r1, r2, r11, r10)
            java.lang.String r2 = r12.A2Z
            if (r2 == 0) goto L_0x0100
            r0 = 10
            java.lang.Long r21 = X.00y.A0n(r0, r2)
        L_0x0100:
            X.9Tm r2 = new X.9Tm
            r15 = r2
            r16 = r6
            r17 = r8
            r18 = r3
            r19 = r4
            r20 = r14
            r23 = r7
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            java.util.EnumMap r0 = r9.A05
            r0.put(r5, r2)
            X.8Yz r0 = r1.A1F
            X.80m r0 = r0.A08
            java.lang.Object r0 = r0.A00
            boolean r0 = r0 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x0028
            boolean r0 = r1.CYO()
            if (r0 != 0) goto L_0x0028
            X.80U r0 = r1.A1W
            X.80X r2 = r0.Ats()
            X.80X r0 = X.AnonymousClass80X.PRE_CAPTURE
            if (r2 != r0) goto L_0x0028
            X.8IQ r0 = r1.A1k
            X.87s r0 = r0.A03
            X.4gw r0 = r0.A04
            if (r0 != 0) goto L_0x0028
            boolean r0 = r1.A1g()
            if (r0 != 0) goto L_0x0028
            X.9cp r0 = A05(r1)
            if (r0 != 0) goto L_0x0028
            X.8WX r0 = r1.A0B
            if (r0 == 0) goto L_0x0164
            X.8XA r0 = r0.A00()
            if (r0 == 0) goto L_0x0164
            X.8ic r6 = r0.A01
            if (r6 == 0) goto L_0x0164
            X.2cs r0 = r6.A0E
            double r4 = r0.A01
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0028
            float r1 = r6.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0028
        L_0x0164:
            X.8Xk r2 = r3.A00()
            r0 = 500(0x1f4, double:2.47E-321)
            r2.A02(r13, r0)
            return
        L_0x016e:
            r11 = r15
            goto L_0x00e6
        L_0x0171:
            r2 = r15
            goto L_0x00e0
        L_0x0174:
            r22 = r14
            goto L_0x00c0
        L_0x0178:
            r24 = 2131955550(0x7f130f5e, float:1.954763E38)
            goto L_0x0083
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C353498Hw.A0w(X.8Hw, X.8I4):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e6, code lost:
        if (r11 != X.C3495980z.A00(r2.A1D)) goto L_0x00e8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0x(X.C353498Hw r16, X.C293505kq r17) {
        /*
            r2 = r16
            com.instagram.common.gallery.Medium r0 = r2.A03()
            if (r0 != 0) goto L_0x0039
            X.9QR r0 = r2.A0E
            if (r0 == 0) goto L_0x0039
            r8 = 0
            r7 = 1
            r4 = 0
            r3 = 0
            A1F(r2, r8, r8, r8)
            r2.A0a = r8
            r1 = r17
            java.util.List r0 = r1.A0v
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L_0x003a
            android.content.Context r4 = r2.A11
            r1 = 2131955400(0x7f130ec8, float:1.9547326E38)
            java.lang.String r0 = "clips_draft_restore_failed"
            X.C59689JTv.A01(r4, r0, r1, r8)
            java.lang.String r1 = "ClipsCaptureControllerImpl"
            java.lang.String r0 = "Draft has no video segments"
            X.0kD.A07(r1, r0, r3)
            X.8A2 r2 = r2.A1h
            java.lang.String r1 = "ClipsCaptureControllerImpl.restoreFromDraft"
            java.lang.String r0 = "video segment is empty"
            r2.A0N(r1, r0)
        L_0x0039:
            return
        L_0x003a:
            X.8vh r5 = r1.A0C
            if (r5 == 0) goto L_0x004c
            X.8pV r5 = r5.A01
            if (r5 == 0) goto L_0x004c
            X.8vv r6 = r5.A03
            X.89Z r5 = r2.A1l
            X.0qQ.A0A(r6)
            r5.A03(r6)
        L_0x004c:
            X.8A2 r5 = r2.A1h
            X.1QP r10 = r5.A0J
            long r5 = r5.A02
            X.AE4 r9 = new X.AE4
            r9.<init>(r10)
            r9.A01 = r5
            java.lang.String r5 = "AUDIO_TRACK_DOWNLOAD_START"
            r9.A04(r5)
            java.util.List r11 = r1.A0p
            if (r11 == 0) goto L_0x0191
            int r5 = r11.size()
            if (r5 <= r7) goto L_0x0191
            boolean r5 = r11.isEmpty()
            if (r5 != 0) goto L_0x01df
            boolean r5 = r2.A0g
            if (r5 == 0) goto L_0x0078
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r5 = r2.A1n
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r5 = r5.A0K
            r5.A02 = r7
        L_0x0078:
            android.content.Context r12 = r2.A11
            com.instagram.common.session.UserSession r10 = r2.A1D
            r6 = 90000(0x15f90, float:1.26117E-40)
            X.80y r5 = X.C3495980z.A00(r10)
            int r5 = r5.A01
            int r9 = java.lang.Math.min(r6, r5)
            X.Abb r6 = new X.Abb
            r6.<init>(r2, r1)
            X.LO4 r5 = new X.LO4
            r5.<init>(r12, r10, r6, r9)
            r5.A01(r11)
        L_0x0096:
            X.9P8 r9 = r1.A0E
            if (r9 == 0) goto L_0x00af
            X.804 r11 = r9.A04
            if (r11 == 0) goto L_0x00af
            X.88F r5 = r2.A1w
            if (r5 != 0) goto L_0x0166
            java.lang.String r6 = "VisualReplyThumbnailController null for Remix Draft. Remix Source media: "
            java.lang.String r5 = r9.A09
            java.lang.String r6 = X.002.A0R(r6, r5)
            java.lang.String r5 = "ClipsCaptureControllerImpl"
            X.0kD.A07(r5, r6, r3)
        L_0x00af:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r6 = r2.A1n
            com.instagram.music.common.model.AudioOverlayTrack r5 = r1.A0M
            r6.A04 = r5
            A0T(r2)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r12 = r0.iterator()
        L_0x00c1:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0103
            java.lang.Object r9 = r12.next()
            X.51N r9 = (X.AnonymousClass51N) r9
            int r0 = X.C348947zL.A00(r9)
            int r8 = r8 + r0
            X.80y r11 = r2.A0I
            if (r11 == 0) goto L_0x00f7
            int r10 = r11.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            if (r0 == 0) goto L_0x00f7
            if (r8 <= r10) goto L_0x00f7
            com.instagram.common.session.UserSession r0 = r2.A1D
            X.80y r0 = X.C3495980z.A00(r0)
            if (r11 == r0) goto L_0x00f7
        L_0x00e8:
            com.instagram.common.session.UserSession r0 = r2.A1D
            X.80y r0 = X.C3495980z.A00(r0)
            int r0 = r0.A01
            A0u(r2, r0)
        L_0x00f3:
            r5.add(r9)
            goto L_0x00c1
        L_0x00f7:
            boolean r0 = r2.A1P(r8)
            if (r0 != 0) goto L_0x00e8
            int r0 = A00(r2)
            if (r8 <= r0) goto L_0x00f3
        L_0x0103:
            r6.A0j(r5)
            A1E(r2, r7)
            java.util.List r5 = r1.A0j
            if (r5 == 0) goto L_0x0223
            boolean r0 = r5.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0223
            java.util.Iterator r9 = r5.iterator()
        L_0x0119:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0223
            java.lang.Object r8 = r9.next()
            X.55O r8 = (X.AnonymousClass55O) r8
            java.lang.Integer r5 = r8.A00
            int[] r0 = X.C59776JXv.A00
            int r0 = r5.intValue()
            if (r0 == r4) goto L_0x014f
            if (r0 != r7) goto L_0x0119
            boolean r0 = r8 instanceof X.C388649oA
            if (r0 == 0) goto L_0x014d
            X.9oA r8 = (X.C388649oA) r8
        L_0x0137:
            com.instagram.common.session.UserSession r0 = r2.A1D
            boolean r0 = X.1KU.A08(r0)
            if (r0 == 0) goto L_0x0119
            if (r8 == 0) goto L_0x0119
            X.8Yx r5 = r8.A00
            if (r5 == 0) goto L_0x0119
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r0 = r6.A0K
            X.05G r0 = r0.A0K
            r0.Epw(r5)
            goto L_0x0119
        L_0x014d:
            r8 = r3
            goto L_0x0137
        L_0x014f:
            boolean r0 = r8 instanceof X.C388659oB
            if (r0 == 0) goto L_0x0119
            X.9oB r8 = (X.C388659oB) r8
            if (r8 == 0) goto L_0x0119
            X.8Yu r5 = r8.A00
            if (r5 == 0) goto L_0x0119
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r0 = r6.A0K
            r0.A0A(r5)
            X.05G r0 = r0.A0L
            r0.Epw(r5)
            goto L_0x0119
        L_0x0166:
            X.8un r10 = r9.A07
            r5.A06 = r10
            X.88B r9 = r2.A1x
            X.2Fj r5 = r9.A05
            r5.A0B(r11)
            com.instagram.common.session.UserSession r13 = r2.A1D
            X.0Tu r12 = X.0Tu.A05
            r5 = 36328581441273278(0x8110a700003dbe, double:3.0376794146926024E-306)
            boolean r5 = X.182.A06(r12, r13, r5)
            if (r5 == 0) goto L_0x0188
            X.82p r5 = r2.A1L
            X.82o r5 = r5.A02
            X.82Y r5 = r5.A01
            r5.A06 = r11
        L_0x0188:
            if (r10 == 0) goto L_0x00af
            X.2Fj r5 = r9.A04
            r5.A0B(r10)
            goto L_0x00af
        L_0x0191:
            com.instagram.music.common.model.AudioOverlayTrack r9 = r1.A0N
            if (r9 != 0) goto L_0x019d
            if (r11 == 0) goto L_0x01e4
            java.lang.Object r9 = X.00k.A0J(r11)
            com.instagram.music.common.model.AudioOverlayTrack r9 = (com.instagram.music.common.model.AudioOverlayTrack) r9
        L_0x019d:
            r2.A0N = r9
            if (r9 == 0) goto L_0x01df
            com.instagram.common.session.UserSession r13 = r2.A1D
            X.27r r5 = X.27p.A01(r13)
            X.29I r12 = r5.A02
            java.lang.String r11 = r1.A0T
            java.lang.String r10 = r9.A0A
            java.lang.String r6 = r9.A0B
            com.instagram.music.common.model.MusicAssetModel r5 = r9.A08
            if (r5 == 0) goto L_0x01dd
            java.lang.String r5 = r5.A0I
        L_0x01b5:
            r12.A05(r11, r10, r6, r5)
            com.instagram.music.common.model.DownloadedTrack r5 = r9.A06
            if (r5 == 0) goto L_0x0214
            java.lang.String r6 = r5.A02
            java.io.File r5 = new java.io.File
            r5.<init>(r6)
            boolean r5 = r5.exists()
            if (r5 == 0) goto L_0x0214
            com.instagram.music.common.model.MusicAssetModel r5 = r9.A08
            if (r5 == 0) goto L_0x01e6
            java.lang.String r5 = r9.A0E
            if (r5 != 0) goto L_0x01e6
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r6 = r2.A1n
            X.8Y4 r5 = new X.8Y4
            r5.<init>(r9)
        L_0x01d8:
            r6.A0b(r5, r8)
            goto L_0x0096
        L_0x01dd:
            r5 = r3
            goto L_0x01b5
        L_0x01df:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r6 = r2.A1n
            X.8fw r5 = X.C361268fw.A00
            goto L_0x01d8
        L_0x01e4:
            r9 = r3
            goto L_0x019d
        L_0x01e6:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r6 = r2.A1n
            X.8RJ r5 = new X.8RJ
            r5.<init>(r9)
            r6.A0b(r5, r8)
            X.8Im r11 = r2.A0P
            if (r11 != 0) goto L_0x01fe
            java.lang.String r0 = "trackDownloader"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01fe:
            android.content.Context r12 = r2.A11
            java.lang.String r15 = r9.A0A
            java.lang.String r6 = r9.A0B
            java.lang.String r5 = r9.A0E
            X.AeI r14 = new X.AeI
            r14.<init>(r2, r9)
            r17 = r5
            r16 = r6
            r11.A02(r12, r13, r14, r15, r16, r17)
            goto L_0x0096
        L_0x0214:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r6 = r2.A1n
            X.8RJ r5 = new X.8RJ
            r5.<init>(r9)
            r6.A0b(r5, r8)
            A12(r2, r9, r7)
            goto L_0x0096
        L_0x0223:
            java.util.List r5 = r1.A0l
            if (r5 == 0) goto L_0x027a
            boolean r0 = r5.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x027a
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r0 = r6.A0K
            com.instagram.common.session.UserSession r11 = r6.A0J
            X.83B r6 = r0.A09
            android.content.Context r10 = r0.A03
            X.8Zq r0 = new X.8Zq
            r0.<init>()
            X.8Im r9 = new X.8Im
            r9.<init>(r10, r11, r0, r4)
            X.2Nn r0 = r6.A00
            X.LEm r7 = new X.LEm
            r7.<init>(r0)
            java.util.Iterator r8 = r5.iterator()
        L_0x024c:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x026f
            java.lang.Object r4 = r8.next()
            X.9c8 r4 = (X.C381669c8) r4
            java.lang.String r0 = r4.A03
            boolean r0 = r7.A01(r0)
            if (r0 != 0) goto L_0x024c
            X.9cM r0 = r4.A02
            java.lang.String r13 = r0.A02
            X.AeJ r12 = new X.AeJ
            r12.<init>(r11, r4, r7, r6)
            r14 = r13
            r15 = r3
            r9.A02(r10, r11, r12, r13, r14, r15)
            goto L_0x024c
        L_0x026f:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x027a
            X.05G r0 = r6.A02
            r0.Epw(r5)
        L_0x027a:
            java.util.List r3 = r1.A0r
            if (r3 == 0) goto L_0x0291
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0291
            com.instagram.common.session.UserSession r0 = r2.A1D
            X.9Ua r0 = X.AnonymousClass9T6.A00(r0)
            java.util.Set r0 = r0.A01
            r0.addAll(r3)
        L_0x0291:
            X.82p r0 = r2.A1L
            X.82o r0 = r0.A02
            java.lang.String r1 = r1.A0T
            X.82Y r0 = r0.A01
            r0.A0E = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C353498Hw.A0x(X.8Hw, X.5kq):void");
    }

    public static final void A0y(C353498Hw r4, C3495880y r5) {
        C357638Yz r3 = r4.A1F;
        C358088aL r2 = C358088aL.A0E;
        if (!r3.A0U(r2)) {
            return;
        }
        if (C352618Eb.A01(r2) == 1) {
            int indexOf = r4.A23.indexOf(r5);
            if (indexOf >= 0) {
                r3.A0N(r2, indexOf);
                return;
            }
            return;
        }
        r3.A0O(r2, (long) r5.A01);
    }

    public static final void A0z(C353498Hw r11, AnonymousClass51R r12, int i, int i2) {
        0eE r0 = AnonymousClass0t1.A01;
        UserSession userSession = r11.A1D;
        User A012 = r0.A01(userSession);
        String username = A012.getUsername();
        LEP lep = new LEP();
        lep.A09 = UUID.randomUUID().toString();
        lep.A0D = new ArrayList();
        Context context = r11.A11;
        lep.A0C = context.getString(2131969093);
        lep.A08 = username;
        lep.A02 = A012.Bh3();
        lep.A03 = A012.Bh3();
        lep.A00 = r12.A04;
        lep.A0H = true;
        lep.A06 = "";
        lep.A0F = false;
        lep.A07 = "";
        r11.A1d.A03(context, r11.A1B.requireActivity());
        r11.A2L.A01(userSession, new C40336AaV(r11, lep, i, i2), (Long) null, Long.valueOf((long) r12.A04), r12.A0F);
    }

    public static final void A10(C353498Hw r5, AudioOverlayTrack audioOverlayTrack, MusicOverlaySearchTab musicOverlaySearchTab, boolean z) {
        if (r5.A0b) {
            r5.A1d.A02();
            return;
        }
        File file = r5.A0Q;
        if (file == null || ((file.exists() && file.length() > 0) || audioOverlayTrack == null)) {
            r5.A1f.A0A(audioOverlayTrack, musicOverlaySearchTab, z, r5.A1j.A04.getValue() instanceof C381979ct);
            ClipsCreationViewModel clipsCreationViewModel = r5.A1n;
            clipsCreationViewModel.A0L.A05.Epw(MusicProduct.CLIPS_CAMERA_FORMAT_V2);
            return;
        }
        A12(r5, audioOverlayTrack, false);
    }

    public static final void A12(C353498Hw r7, AudioOverlayTrack audioOverlayTrack, boolean z) {
        if (r7.A0E == null) {
            0kD.A07("ClipsCaptureControllerImpl", "view holder should not be null", (Throwable) null);
            return;
        }
        C353638Im r2 = r7.A0P;
        if (r2 == null) {
            0qQ.A0F("trackDownloader");
            throw AnonymousClass00P.createAndThrow();
        } else if (r2.A00) {
            r7.A1h.A0D("download_in_progress_skipping_new_request");
        } else {
            if (r7.A0l) {
                r7.A1d.A01();
            }
            int min = Math.min(90000, C3495980z.A00(r7.A1D).A01);
            r7.A1h.A0D("download_requested");
            r2.A03(audioOverlayTrack, new C379079Sk(r7, audioOverlayTrack), new C379069Sj(r7, audioOverlayTrack), min, A1U(r7), z);
        }
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [X.07Z, X.4DH] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x018b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A13(X.C353498Hw r30, X.C349307zv r31) {
        /*
            r15 = r31
            int r3 = r15.A07
            r13 = r30
            X.831 r0 = r13.A0J
            r26 = -1
            int r0 = X.C348947zL.A01(r0)
            int r0 = r0 + r3
            boolean r0 = r13.A1P(r0)
            if (r0 == 0) goto L_0x0020
            com.instagram.common.session.UserSession r0 = r13.A1D
            X.80y r0 = X.C3495980z.A00(r0)
            int r0 = r0.A01
            A0u(r13, r0)
        L_0x0020:
            int r1 = r15.A0F
            r0 = 54
            if (r1 == r0) goto L_0x0027
            r0 = 1
        L_0x0027:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x00b6
            int r1 = r0.intValue()
            r0 = 54
            if (r1 != r0) goto L_0x00b6
        L_0x0035:
            r0 = 0
            java.lang.String r16 = r15.A06()
            r17 = r1
            r18 = r3
            r19 = r0
            r20 = r3
            r21 = r3
            X.51R r14 = X.C39821AAs.A01(r15, r16, r17, r18, r19, r20, r21)
            X.8IQ r4 = r13.A1k
            int r1 = r4.A00()
            int r1 = r1 + -100
            if (r3 >= r1) goto L_0x00f6
            X.4DH r3 = r13.A1B
            int r5 = r4.A00()
            X.A3u r2 = new X.A3u
            r2.<init>(r13)
            int r1 = r14.A06
            r20 = 1065353216(0x3f800000, float:1.0)
            X.0sn r22 = X.0sn.A00
            r11 = 0
            X.51S r13 = new X.51S
            r21 = r13
            r23 = r11
            r24 = r11
            r27 = r0
            r25 = r20
            r21.<init>(r22, r23, r24, r25, r26, r27)
            r27 = 1073741816(0x3ffffff8, float:1.999999)
            X.51M r10 = new X.51M
            r12 = r11
            r15 = r11
            r16 = r11
            r17 = r11
            r18 = r11
            r19 = r11
            r21 = r0
            r22 = r0
            r23 = r0
            r24 = r0
            r25 = r0
            r26 = r0
            r28 = r0
            r29 = r0
            r30 = r0
            r31 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r9 = 0
            r10.A09 = r0
            r10.A08 = r1
            r7 = 1
            r10.A0N = r7
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            double r5 = (double) r5
            double r0 = (double) r1
            double r5 = r5 / r0
            double r0 = java.lang.Math.ceil(r5)
            int r5 = (int) r0
        L_0x00ae:
            if (r9 >= r5) goto L_0x00b9
            r8.add(r10)
            int r9 = r9 + 1
            goto L_0x00ae
        L_0x00b6:
            r1 = 1
            goto L_0x0035
        L_0x00b9:
            X.APj r1 = new X.APj
            r1.<init>(r2)
            X.8fw r0 = X.C361268fw.A00
            X.2Fj r6 = new X.2Fj
            r6.<init>(r0)
            r6.A06(r3, r1)
            X.8IR r5 = r4.A04
            com.instagram.common.session.UserSession r3 = r4.A01
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r8)
            X.0qQ.A07(r2)
            X.2Nn r0 = r5.A02
            boolean r0 = r0.A02()
            if (r0 != 0) goto L_0x00e1
            X.9nk r0 = X.C388389nk.A00
            r6.A0B(r0)
            return
        L_0x00e1:
            X.9lR r0 = r5.A00
            if (r0 == 0) goto L_0x00e7
            r0.A04 = r7
        L_0x00e7:
            X.9lR r1 = new X.9lR
            r1.<init>(r6, r2, r3, r5)
            X.0nO r0 = X.0nY.A00()
            r0.ATE(r1)
            r5.A00 = r1
            return
        L_0x00f6:
            com.instagram.common.session.UserSession r6 = r13.A1D
            X.0Tu r5 = X.0Tu.A06
            r1 = 36593314635449439(0x82016d0000045f, double:3.2050977526846166E-306)
            long r9 = X.182.A01(r5, r6, r1)
            r7 = 39
            r2 = 1
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x01aa
            r1 = 5000(0x1388, float:7.006E-42)
            if (r3 <= r1) goto L_0x01aa
            int r1 = r3 / 1000
            float r5 = (float) r1
            r1 = 1059816735(0x3f2b851f, float:0.67)
            float r5 = r5 * r1
            int r1 = (int) r5
            r7 = 20
            if (r7 <= r1) goto L_0x011b
            r7 = r1
        L_0x011b:
            X.8Iz r10 = r13.A17
            java.lang.String r9 = r15.A0k
            X.9rk r1 = X.C390729rk.TIME_STAMPS
            java.util.List r17 = java.util.Collections.singletonList(r1)
            X.0qQ.A07(r17)
            X.AE1 r8 = new X.AE1
            r16 = r8
            r18 = r2
            r19 = r3
            r20 = r7
            r21 = r0
            r16.<init>(r17, r18, r19, r20, r21)
            X.0qQ.A0B(r9, r0)
            X.8Iu r5 = r10.A00
            X.8Ip r1 = r10.A01
            java.util.List r5 = r5.Awo(r8, r1, r9)
            boolean r1 = r5.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x019e
            java.lang.Object r1 = X.00k.A0O(r5, r0)
            X.A9r r1 = (X.C39796A9r) r1
            if (r1 == 0) goto L_0x019c
            int r5 = r1.A01
        L_0x0154:
            r13.A0x = r2
        L_0x0156:
            int r4 = r4.A00()
            int r1 = r5 + r4
            if (r1 <= r3) goto L_0x0160
            int r5 = r3 - r4
        L_0x0160:
            X.27r r16 = X.27p.A01(r6)
            java.lang.String r1 = r15.A0k
            int r1 = r1.hashCode()
            long r8 = (long) r1
            double r6 = (double) r3
            if (r2 != 0) goto L_0x0180
            r19 = 0
            r1 = r3
            if (r3 <= r4) goto L_0x0174
            r1 = r4
        L_0x0174:
            double r1 = (double) r1
            r17 = r6
            r21 = r1
            r23 = r8
            r25 = r0
            r16.A0n(r17, r19, r21, r23, r25)
        L_0x0180:
            com.google.common.collect.ImmutableList r11 = com.google.common.collect.ImmutableList.of()
            X.0qQ.A07(r11)
            r12 = 0
            int r4 = r4 + r5
            if (r3 <= r4) goto L_0x018c
            r3 = r4
        L_0x018c:
            java.lang.String r1 = r14.A0H
            java.lang.Integer r15 = X.AnonymousClass05K.A01
            r16 = r1
            r17 = r5
            r18 = r3
            r19 = r0
            A0K(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        L_0x019c:
            r5 = 0
            goto L_0x0154
        L_0x019e:
            X.0nO r2 = X.0nY.A00()
            X.9lN r1 = new X.9lN
            r1.<init>(r13, r15, r3, r7)
            r2.ATE(r1)
        L_0x01aa:
            r2 = 0
            r5 = 0
            goto L_0x0156
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C353498Hw.A13(X.8Hw, X.7zv):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x015b, code lost:
        if (r7 != X.AnonymousClass05K.A0C) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0173, code lost:
        if (r2.A0J.A01.size() == 1) goto L_0x0175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0187, code lost:
        if (A1X(r2) != false) goto L_0x0189;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A14(X.C353498Hw r18, X.C349307zv r19, java.lang.Integer r20) {
        /*
            r2 = r18
            X.9QR r0 = r2.A0E
            if (r0 != 0) goto L_0x0013
            android.content.Context r3 = r2.A11
            java.lang.Integer r2 = X.AnonymousClass05K.A15
            java.lang.String r1 = "ViewHolder is null"
            r0 = 2131974093(0x7f1357cd, float:1.958524E38)
            X.C64169LRs.A02(r3, r2, r1, r0)
        L_0x0012:
            return
        L_0x0013:
            java.lang.Integer r5 = X.AnonymousClass05K.A0Y
            r15 = 0
            r1 = 0
            r8 = r19
            r7 = r20
            if (r7 != r5) goto L_0x013b
            com.instagram.common.session.UserSession r6 = r2.A1D
            X.0Tu r0 = X.0Tu.A05
            r3 = 36314472473692734(0x8103d200000a3e, double:3.028756846782414E-306)
            boolean r0 = X.182.A06(r0, r6, r3)
            if (r0 == 0) goto L_0x013b
            android.os.Bundle r12 = new android.os.Bundle
            r12.<init>()
            X.C227642jf.A04(r12, r6)
            int r3 = r8.A0K
            r0 = 3334(0xd06, float:4.672E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r12.putInt(r0, r3)
            int r3 = r8.A08
            r0 = 3330(0xd02, float:4.666E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r12.putInt(r0, r3)
            int r3 = r8.A09
            r0 = 3332(0xd04, float:4.669E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r12.putInt(r0, r3)
            com.instagram.common.gallery.Medium r3 = r8.A0R
            r0 = 3331(0xd03, float:4.668E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r12.putParcelable(r0, r3)
            boolean r3 = r8.A1L
            r0 = 3333(0xd05, float:4.67E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r12.putBoolean(r0, r3)
            java.lang.String r3 = r8.A0r
            java.lang.String r0 = "source_photo_file_path"
            r12.putString(r0, r3)
            int r3 = r8.A07
            r0 = 3170(0xc62, float:4.442E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r12.putInt(r0, r3)
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r3 = r2.A1H
            r0 = 4089(0xff9, float:5.73E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r12.putParcelable(r0, r3)
            com.instagram.music.common.model.AudioOverlayTrack r3 = r2.A0N
            r0 = 237(0xed, float:3.32E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r12.putParcelable(r0, r3)
            int r3 = A00(r2)
            r0 = 3547(0xddb, float:4.97E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r12.putInt(r0, r3)
            X.831 r0 = r2.A0J
            java.util.List r0 = r0.A01
            int r3 = r0.size()
            X.88V r0 = r2.A1o
            java.util.List r0 = r0.A07
            int r0 = r0.size()
            int r3 = r3 + r0
            r0 = 3939(0xf63, float:5.52E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r12.putInt(r0, r3)
            int r3 = A02(r2)
            r0 = 3874(0xf22, float:5.429E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r12.putInt(r0, r3)
            X.8IT r0 = r2.A2R
            X.0r6 r4 = r0.A01
            X.MGV r0 = new X.MGV
            r0.<init>(r2, r15, r1)
            X.0pz r3 = new X.0pz
            r3.<init>(r0, r4)
            X.4DH r13 = r2.A1B
            X.07Z r0 = r13.getViewLifecycleOwner()
            X.0xx r0 = X.AnonymousClass07a.A00(r0)
            X.AnonymousClass11O.A03(r0, r3)
            androidx.fragment.app.FragmentActivity r3 = r2.A15
            boolean r0 = r3 instanceof X.AnonymousClass2ZV
            if (r0 == 0) goto L_0x0110
            androidx.fragment.app.FragmentActivity r14 = r13.requireActivity()
            X.AeE r18 = new X.AeE
            r18.<init>()
            java.lang.String r19 = "clips_trim"
            X.OLw r11 = new X.OLw
            r16 = r13
            r20 = r15
            r17 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r0 = 2131436510(0x7f0b23de, float:1.8494892E38)
            r11.A00 = r0
            r0 = 1
            r11.A05 = r0
            r11.A00()
        L_0x0109:
            A0m(r2)
            A1B(r2, r1)
            return
        L_0x0110:
            X.K5W r5 = new X.K5W
            r5.<init>()
            X.C227642jf.A04(r12, r6)
            r5.setArguments(r12)
            X.0hq r0 = r3.getSupportFragmentManager()
            X.0s1 r4 = new X.0s1
            r4.<init>(r0)
            java.lang.Class r0 = r5.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r4.A0I(r0)
            r3 = 2131428954(0x7f0b065a, float:1.8479567E38)
            java.lang.String r0 = "CLIPS_TRIM"
            r4.A0D(r5, r0, r3)
            r4.A00()
            goto L_0x0109
        L_0x013b:
            X.JXi r6 = r2.A0F
            if (r6 == 0) goto L_0x0012
            X.2Nn r0 = r2.A20
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0012
            boolean r0 = r6.A0H
            if (r0 != 0) goto L_0x0012
            r2.A0v = r8
            X.831 r4 = r2.A0K
            if (r7 == r5) goto L_0x0153
            com.instagram.music.common.model.AudioOverlayTrack r15 = r2.A0N
        L_0x0153:
            boolean r0 = r2.A0y
            r5 = 1
            if (r0 == 0) goto L_0x015d
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r13 = 1
            if (r7 == r0) goto L_0x015e
        L_0x015d:
            r13 = 0
        L_0x015e:
            int r12 = A00(r2)
            X.88B r0 = r2.A1x
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0175
            X.831 r0 = r2.A0J
            java.util.List r0 = r0.A01
            int r0 = r0.size()
            r9 = 0
            if (r0 != r5) goto L_0x0176
        L_0x0175:
            r9 = 1
        L_0x0176:
            boolean r0 = r2.A1g()
            if (r0 != 0) goto L_0x0189
            X.9cp r0 = A05(r2)
            if (r0 != 0) goto L_0x0189
            boolean r0 = A1X(r2)
            r3 = 1
            if (r0 == 0) goto L_0x018a
        L_0x0189:
            r3 = 0
        L_0x018a:
            X.0qQ.A0B(r4, r1)
            r0 = 6
            X.0qQ.A0B(r7, r0)
            java.util.List r0 = r4.A01
            boolean r10 = r0.isEmpty()
            r11 = 3
            java.lang.String r14 = "ClipsReviewController"
            r0 = 0
            if (r10 == 0) goto L_0x01a4
            java.lang.String r3 = "segments can 't be empty when showing"
        L_0x019f:
            X.0kD.A07(r14, r3, r0)
            goto L_0x0109
        L_0x01a4:
            boolean r10 = r6.A0H
            if (r10 == 0) goto L_0x01ab
            java.lang.String r3 = "cannot already be showing when calling show()"
            goto L_0x019f
        L_0x01ab:
            r6.A0H = r5
            r6.A0E = r15
            if (r15 == 0) goto L_0x034a
            int r10 = r15.A03
        L_0x01b3:
            r6.A00 = r10
            r6.A0J = r13
            r6.A03 = r12
            int r10 = r7.intValue()
            if (r10 == r5) goto L_0x02fc
            if (r10 == r1) goto L_0x02d1
            r9 = 2
            if (r10 == r9) goto L_0x028b
            if (r10 == r11) goto L_0x028b
            r4 = 4
            if (r10 != r4) goto L_0x01fa
            X.831 r9 = r6.A0D
            X.9QY r4 = r6.A0U
            X.8Hw r4 = r4.A00
            int r4 = A02(r4)
            X.51M r4 = X.C39820AAr.A00(r8, r4, r5)
            X.831 r4 = X.LSY.A00(r4, r9)
            r6.A0D = r4
            java.util.List r4 = r4.A01
            int r4 = r4.size()
            int r4 = r4 - r5
            r6.A05 = r4
            X.8Q2 r4 = r6.A0X
            r6.A0A = r4
            boolean r4 = r8.A1H
            if (r4 == 0) goto L_0x01f7
            java.lang.String r4 = r8.A0h
            if (r4 == 0) goto L_0x01f7
            com.instagram.common.typedurl.SimpleImageUrl r0 = new com.instagram.common.typedurl.SimpleImageUrl
            r0.<init>(r4)
        L_0x01f7:
            X.C59767JXi.A03(r0, r6)
        L_0x01fa:
            X.8Q2 r0 = r6.A0X
            r0.A02 = r7
            r6.A0H()
            android.view.TextureView r10 = r6.A07
            if (r10 == 0) goto L_0x021e
            android.view.ViewGroup r0 = r6.A0N
            android.content.Context r9 = r0.getContext()
            X.0qQ.A07(r9)
            X.8Hv r13 = r6.A0b
            com.instagram.common.session.UserSession r11 = r6.A0Q
            X.JXq r12 = new X.JXq
            r12.<init>(r6)
            X.9Xr r8 = new X.9Xr
            r8.<init>(r9, r10, r11, r12, r13)
            r6.A0C = r8
        L_0x021e:
            android.view.ViewGroup r8 = r6.A0N
            X.9Xr r0 = r6.A0C
            r8.setOnTouchListener(r0)
            X.C59767JXi.A0C(r6, r1, r3)
            r8.setVisibility(r1)
            X.5nL r0 = X.C294975nL.A01(r8, r5)
            r3 = 0
            X.5nL r4 = r0.A0C(r3)
            r3 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            r4.A0M(r3, r0)
            X.Afv r0 = new X.Afv
            r0.<init>(r6)
            r4.A05 = r0
            r4.A0H()
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r7 != r0) goto L_0x0278
            X.8Hv r0 = r6.A0b
            com.instagram.common.session.UserSession r0 = r0.A0F
            X.1Av r9 = X.1Au.A00(r0)
            X.0s0 r7 = r9.A4k
            X.0YZ[] r4 = X.1Av.A8a
            r3 = 26
            r0 = r4[r3]
            java.lang.Object r0 = r7.CDM(r9, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0278
            r3 = r4[r3]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r7.Epx(r9, r0, r3)
            X.M2u r0 = new X.M2u
            r0.<init>(r6)
            r3 = 500(0x1f4, double:2.47E-321)
            r8.postDelayed(r0, r3)
        L_0x0278:
            X.831 r0 = r6.A0D
            java.util.List r0 = r0.A01
            int r0 = r0.size()
            int r0 = r0 - r5
            X.C59767JXi.A07(r6, r0)
            android.widget.TextView r0 = r6.A0O
            r0.setVisibility(r1)
            goto L_0x0109
        L_0x028b:
            X.0sn r9 = X.0sn.A00
            X.831 r0 = new X.831
            r0.<init>(r9, r1)
            r6.A0D = r0
            X.9QY r0 = r6.A0U
            X.8Hw r0 = r0.A00
            int r10 = A02(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r7 != r0) goto L_0x02a6
            int r0 = r6.A03
            int r0 = r0 + -1000
            r6.A03 = r0
        L_0x02a6:
            X.831 r9 = r6.A0D
            r0 = 35
            X.51M r0 = X.C39820AAr.A00(r8, r10, r0)
            X.831 r0 = X.LSY.A00(r0, r9)
            r6.A0D = r0
            java.util.List r0 = r0.A01
            int r0 = r0.size()
            int r0 = r0 - r5
            r6.A05 = r0
            X.8Q2 r9 = r6.A0X
            r6.A0A = r9
            int r0 = r4.A00
            float r4 = (float) r0
            int r0 = r8.A07
            float r0 = (float) r0
            float r4 = r4 / r0
            com.instagram.creation.capture.quickcapture.sundial.widget.filmstrip.ClipsTrimFilmstrip r0 = r9.A0F
            com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView r0 = r0.A07
            r0.setTrimmerMinimumRange(r4)
            goto L_0x01fa
        L_0x02d1:
            java.util.ArrayList r8 = r4.A05()
            boolean r4 = r4.A03
            X.831 r0 = new X.831
            r0.<init>(r8, r4)
            r6.A0D = r0
            X.JXp r8 = r6.A0W
            r6.A0A = r8
            r8.A02 = r9
            java.util.List r0 = r0.A01
            int r4 = r0.size()
            int r4 = r4 - r5
            X.831 r0 = r6.A0D
            java.util.List r0 = r0.A01
            int r0 = r0.size()
            r8.A00 = r4
            r8.A01 = r0
            X.C59772JXp.A00(r8)
            goto L_0x01fa
        L_0x02fc:
            X.831 r9 = r6.A0D
            X.9QY r4 = r6.A0U
            X.8Hw r4 = r4.A00
            int r4 = A02(r4)
            X.51M r4 = X.C39820AAr.A00(r8, r4, r5)
            X.831 r4 = X.LSY.A00(r4, r9)
            r6.A0D = r4
            java.util.List r4 = r4.A01
            int r4 = r4.size()
            int r4 = r4 - r5
            r6.A05 = r4
            X.8Q2 r9 = r6.A0X
            r6.A0A = r9
            com.instagram.music.common.model.AudioOverlayTrack r4 = r6.A0E
            if (r4 == 0) goto L_0x0327
            com.instagram.music.common.model.MusicAssetModel r4 = r4.A08
            if (r4 == 0) goto L_0x0327
            com.instagram.common.typedurl.ImageUrl r0 = r4.A03
        L_0x0327:
            X.C59767JXi.A03(r0, r6)
            int r10 = r8.A07
            com.instagram.common.session.UserSession r4 = r6.A0Q
            X.80y r0 = X.C3495980z.A00(r4)
            int r0 = r0.A01
            if (r10 <= r0) goto L_0x01fa
            X.80y r0 = X.C3495980z.A00(r4)
            int r0 = r0.A01
            float r4 = (float) r0
            int r0 = r8.A07
            float r0 = (float) r0
            float r4 = r4 / r0
            com.instagram.creation.capture.quickcapture.sundial.widget.filmstrip.ClipsTrimFilmstrip r0 = r9.A0F
            com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView r0 = r0.A07
            r0.setTrimmerMaximumRange(r4)
            goto L_0x01fa
        L_0x034a:
            r10 = 0
            goto L_0x01b3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C353498Hw.A14(X.8Hw, X.7zv, java.lang.Integer):void");
    }

    public static final void A15(C353498Hw r27, C349307zv r28, Integer num) {
        C353498Hw r13 = r27;
        C349307zv r9 = r28;
        r13.A0v = r9;
        r13.A1h.A0L(27p.A01(r13.A1D).A04.A0L, "clips_gallery");
        String A072 = r9.A07();
        File file = new File(r9.A0k);
        int i = r9.A07;
        int i2 = r9.A0K;
        int i3 = r9.A08;
        int i4 = r9.A09;
        String A062 = r9.A06();
        ImmutableList of = ImmutableList.of();
        0qQ.A07(of);
        int i5 = r9.A07;
        boolean z = r9.A1L;
        String str = r9.A0r;
        MediaUploadMetadata A022 = r9.A02();
        List list = r9.A0w;
        int i6 = 54;
        if (r9.A0F != 54) {
            i6 = 1;
        }
        A0I(of, (ImmutableList) null, A022, r13, file, (Boolean) null, num, Integer.valueOf(i6), A072, A062, str, list, i, i2, i3, i4, 0, i5, false, z);
        A0m(r13);
        A1B(r13, false);
    }

    public static final void A16(C353498Hw r3, Exception exc, String str, String str2, boolean z, boolean z2) {
        if (0qQ.A0K(str, r3.A0T) || z2) {
            AnonymousClass85M r2 = r3.A1d;
            FrameLayout frameLayout = r2.A00;
            if (frameLayout != null) {
                ViewParent parent = frameLayout.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(r2.A00);
                }
                r2.A00 = null;
                A0m(r3);
            }
            Dialog dialog = r3.A05;
            if (dialog != null) {
                dialog.hide();
            }
            A0r(r3);
            C64169LRs.A01(r3.A11, exc, str2, z);
            r3.A1o.A01();
        }
    }

    public static final void A19(C353498Hw r8, Runnable runnable, boolean z) {
        AnonymousClass8XA A002;
        if (!r8.A1x.A02() || !r8.CKX()) {
            UserSession userSession = r8.A1D;
            29R r6 = 27p.A01(userSession).A09;
            1Ln A082 = 1Ln.A08(r6.A01);
            if (A082.A00.isSampled() && r6.A0Q("logClipsAllSegmentsDeleted()")) {
                A082.A0t("IG_CAMERA_CLIPS_ALL_SEGMENTS_DELETED");
                A082.A0r("CLIPS_ALL_SEGMENTS_DELETED");
                29R.A00(A082, r6);
                AnonymousClass283 r5 = r6.A04;
                int i = 2;
                if (r5.A01 != 2) {
                    i = 1;
                }
                A082.A0V(i);
                A082.A0M(r6.A0I(), "capture_type");
                A082.A0b(r5.A09);
                A082.A0W(2);
                A082.A0c(28t.A06);
                A082.A0n(27x.A08.getModuleName());
                A082.A0u(AnonymousClass1QI.A00.A02.A00);
                A082.Cgf();
            }
            r8.A0z = true;
            r8.A1s.A0A();
            AnonymousClass8ZP r62 = r8.A2O;
            1QP r52 = r62.A02;
            r52.flowMarkPoint(r62.A01, "REELS_PRE_CAPTURE_START_OVER");
            r52.flowEndCancel(r62.A01, CancelReason.USER_CANCELLED);
            r62.A01 = 0;
            AnonymousClass4DH r53 = r8.A1B;
            FragmentActivity requireActivity = r53.requireActivity();
            if (1Wj.A00 != null) {
                HashMap hashMap = new HashMap();
                if ("discard".length() != 0) {
                    hashMap.put("exit_action", "discard");
                }
                hashMap.put("drafts_version", "drafts_V1");
                DcL.A00().A00(requireActivity, userSession, "729892711062224", hashMap);
            }
            AnonymousClass85O r7 = r8.A1S;
            C318136oS A003 = C318116oQ.A00(r7);
            1Eo.A03(AnonymousClass05K.A00, 19B.A00, new C376889Js(r7, (AnonymousClass4D7) null, 30), A003);
            r8.A0o = true;
            r8.A0c = false;
            A1F(r8, false, true, true);
            if (runnable != null) {
                runnable.run();
            }
            if (!(r8.A1F.A08.A00 instanceof AnonymousClass80O)) {
                return;
            }
            if (A1T(r8)) {
                LPT.A01(r53.getActivity(), userSession);
            } else if (r8.A1t == C2801950r.FEED_POST) {
                FragmentActivity fragmentActivity = r8.A15;
                fragmentActivity.setResult(0);
                fragmentActivity.finish();
            } else if (z) {
                A1A(r8, "discard_video_clicked");
                AnonymousClass8WX r0 = r8.A0B;
                if (r0 != null && (A002 = r0.A00()) != null) {
                    A002.A0O(false);
                }
            }
        } else {
            for (int size = r8.A0J.A01.size() - 1; size > 0; size--) {
                A0s(r8, size);
            }
            A0p(r8);
        }
    }

    public static final void A1A(C353498Hw r0, String str) {
        AnonymousClass8XA A002;
        C361948h5 r02;
        AnonymousClass8WX r03 = r0.A0B;
        if (r03 != null && (A002 = r03.A00()) != null && (r02 = (C361948h5) A002.A0k.getValue()) != null) {
            r02.A00(str);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r3v180 */
    /* JADX WARNING: type inference failed for: r3v181 */
    /* JADX WARNING: type inference failed for: r11v18, types: [X.9cv] */
    /* JADX WARNING: type inference failed for: r11v19, types: [X.9cu] */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x04b5, code lost:
        if (r7 != null) goto L_0x04b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x04cf, code lost:
        if (X.AnonymousClass30D.A08(r10.A01) != false) goto L_0x04d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0505, code lost:
        if (X.0qQ.A0K(r12, false) == false) goto L_0x050d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x05cd, code lost:
        if (r9 == null) goto L_0x05cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x05e2, code lost:
        if (r13 == null) goto L_0x05e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x05e8, code lost:
        if (r13 != null) goto L_0x04f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x05ff, code lost:
        if (r5 != null) goto L_0x04af;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x050b  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0522  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0562  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x057a  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x05cd  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x05d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A1D(X.C353498Hw r27, boolean r28) {
        /*
            r0 = r27
            boolean r1 = r0.A0l
            if (r1 != 0) goto L_0x02a3
            X.4DH r2 = r0.A1B
            android.view.View r1 = r2.mView
            if (r1 == 0) goto L_0x02a3
            X.9QR r3 = r0.A0E
            r1 = 1
            if (r3 != 0) goto L_0x028f
            android.view.ViewStub r3 = r0.A14
            android.view.View r4 = r3.inflate()
            boolean r3 = r4 instanceof android.view.ViewGroup
            r6 = 0
            if (r3 == 0) goto L_0x067a
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            if (r4 == 0) goto L_0x067a
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r3 = r0.A1H
            X.9QR r7 = new X.9QR
            r7.<init>(r4, r3)
            X.85M r8 = r0.A1d
            android.view.ViewGroup r3 = r7.A00
            X.9QS r5 = new X.9QS
            r5.<init>(r3)
            X.3oV r4 = r5.A03
            X.9Qe r3 = X.AnonymousClass9Qe.A00
            r4.EeU(r3)
            X.3oV r4 = r5.A02
            X.9QT r3 = new X.9QT
            r3.<init>(r8)
            r4.EeU(r3)
            X.3oV r4 = r5.A01
            X.9QU r3 = new X.9QU
            r3.<init>(r8)
            r4.EeU(r3)
            r8.A03 = r5
            X.85L r4 = r8.A04
            android.view.ViewGroup r3 = r5.A00
            r4.A00 = r3
            boolean r3 = A1U(r0)
            r4 = r3 ^ 1
            X.8aL r3 = X.C358088aL.A0z
            A0N(r3, r0, r4)
            com.instagram.common.session.UserSession r11 = r0.A1D
            X.88B r9 = r0.A1x
            X.82i r3 = r9.A00
            if (r3 == 0) goto L_0x0677
            X.8JI r3 = r3.A00
        L_0x0068:
            X.8JI r8 = X.AnonymousClass8JI.REMIX
            if (r3 == r8) goto L_0x007d
            X.2Fj r5 = r9.A06
            r3 = 42
            X.9Ks r4 = new X.9Ks
            r4.<init>(r0, r3)
            X.8Io r3 = new X.8Io
            r3.<init>(r4)
            r5.A06(r2, r3)
        L_0x007d:
            X.8E7 r12 = r0.A1O
            X.8E8 r5 = r12.A00()
            X.8aL r4 = X.C358088aL.A0g
            X.9QV r3 = new X.9QV
            r3.<init>(r0)
            r5.A03(r3, r4)
            X.8E8 r10 = r12.A00()
            X.8aL r5 = X.C358088aL.A09
            r4 = 36
            X.9Ks r3 = new X.9Ks
            r3.<init>(r0, r4)
            r10.A08(r5, r3)
            X.8E8 r5 = r12.A00()
            X.8aL r10 = X.C358088aL.A0y
            r4 = 37
            X.9Ks r3 = new X.9Ks
            r3.<init>(r0, r4)
            r5.A08(r10, r3)
            X.0Tu r5 = X.0Tu.A06
            r3 = 36317998641845983(0x810707000016df, double:3.030986809721268E-306)
            boolean r3 = X.182.A06(r5, r11, r3)
            if (r3 == 0) goto L_0x00e4
            X.8HD r11 = r0.A1N
            if (r11 == 0) goto L_0x00e4
            r4 = 4
            X.MP5 r3 = new X.MP5
            r3.<init>(r0, r4)
            X.Aum r5 = new X.Aum
            r5.<init>(r3)
            java.util.Map r4 = r11.A02
            boolean r3 = r4.containsKey(r10)
            if (r3 != 0) goto L_0x00d9
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r4.put(r10, r3)
        L_0x00d9:
            java.lang.Object r3 = r4.get(r10)
            java.util.Set r3 = (java.util.Set) r3
            if (r3 == 0) goto L_0x00e4
            r3.add(r5)
        L_0x00e4:
            X.8Yz r5 = r0.A1F
            X.8aL r3 = X.C358088aL.A0E
            X.9QF r4 = new X.9QF
            r4.<init>(r0)
            X.80m r3 = X.C357638Yz.A00(r3, r5)
            r3.A01(r4)
            X.8E8 r10 = r12.A00()
            X.8aL r11 = X.C358088aL.A0t
            r4 = 38
            X.9Ks r3 = new X.9Ks
            r3.<init>(r0, r4)
            r10.A08(r11, r3)
            X.8E8 r13 = r12.A00()
            X.8aL r10 = X.C358088aL.A0J
            r4 = 39
            X.9Ks r3 = new X.9Ks
            r3.<init>(r0, r4)
            r13.A08(r10, r3)
            X.8E8 r13 = r12.A00()
            X.8aL r10 = X.C358088aL.A0F
            r4 = 40
            X.9Ks r3 = new X.9Ks
            r3.<init>(r0, r4)
            r13.A08(r10, r3)
            X.823 r3 = r0.A1M
            if (r3 == 0) goto L_0x0138
            X.8E8 r10 = r12.A00()
            r3 = 22
            X.9LJ r4 = new X.9LJ
            r4.<init>(r0, r3)
            java.util.Set r3 = r10.A0A
            r3.add(r4)
        L_0x0138:
            X.9QG r4 = new X.9QG
            r4.<init>(r0)
            X.80m r3 = X.C357638Yz.A00(r11, r5)
            r3.A01(r4)
            X.82i r3 = r9.A00
            if (r3 == 0) goto L_0x0673
            X.8JI r3 = r3.A00
            if (r3 != r8) goto L_0x0673
            X.8aL r3 = X.C358088aL.A0j
        L_0x014e:
            X.9QH r4 = new X.9QH
            r4.<init>(r0)
            X.80m r3 = X.C357638Yz.A00(r3, r5)
            r3.A01(r4)
            android.widget.ImageButton r5 = r7.A03
            X.81m r4 = r0.A1U
            X.81t r3 = r4.A00()
            int r3 = r3.C8O()
            X.0nA.A0e(r5, r3)
            X.9QW r3 = new X.9QW
            r3.<init>(r0)
            X.AnonymousClass0fU.A00(r3, r5)
            X.81t r3 = r4.A00()
            android.view.View r3 = r3.Ao7()
            if (r3 == 0) goto L_0x018a
            X.3NG r4 = new X.3NG
            r4.<init>(r3)
            X.9QX r3 = new X.9QX
            r3.<init>(r0)
            r4.A04 = r3
            r4.A00()
        L_0x018a:
            android.view.ViewGroup r4 = r0.A13
            r3 = 2131432251(0x7f0b133b, float:1.8486254E38)
            android.view.View r3 = r4.requireViewById(r3)
            X.0qQ.A07(r3)
            A0H(r3, r0)
        L_0x0199:
            r0.A0E = r7
            X.2Fj r4 = r0.A2B
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            r4.A0A(r3)
            android.content.Context r14 = r0.A11
            com.instagram.common.session.UserSession r8 = r0.A1D
            android.view.ViewGroup r3 = r0.A13
            X.Mgi r5 = new X.Mgi
            r5.<init>(r14, r3, r8, r1)
            r0.A0t = r5
            X.8Hz r3 = r0.A2M
            if (r3 == 0) goto L_0x01b7
            r3.A00 = r5
        L_0x01b7:
            X.8JE r4 = r0.A1X
            r4.getClass()
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r4)
            r5.A06 = r3
            X.9QR r3 = r0.A0E
            r13 = 0
            if (r3 == 0) goto L_0x066a
            android.view.ViewGroup r15 = r3.A01
            if (r15 == 0) goto L_0x066a
            X.8A5 r12 = r0.A1c
            X.2Nn r11 = r0.A20
            java.util.concurrent.ExecutorService r10 = r0.A24
            X.8Cx r9 = r0.A1r
            X.9QY r7 = new X.9QY
            r7.<init>(r0)
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r6 = r0.A1H
            X.8Hv r5 = r0.A1q
            X.89k r4 = r0.A1f
            X.85O r3 = r0.A1S
            X.JXi r13 = new X.JXi
            r17 = r2
            r20 = r3
            r21 = r7
            r22 = r12
            r23 = r4
            r24 = r5
            r25 = r9
            r26 = r11
            r27 = r10
            r16 = r2
            r18 = r8
            r19 = r6
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
        L_0x01fe:
            r0.A0F = r13
            X.81m r4 = r0.A1U
            X.81t r3 = r4.A00()
            android.view.View r7 = r3.Anx()
            X.81t r3 = r4.A00()
            android.view.View r6 = r3.Ao7()
            if (r7 == 0) goto L_0x0266
            if (r6 == 0) goto L_0x0266
            android.content.Context r9 = r7.getContext()
            X.0qQ.A0A(r9)
            android.content.res.Resources r4 = r9.getResources()
            r3 = 2131165281(0x7f070061, float:1.7944775E38)
            int r5 = r4.getDimensionPixelSize(r3)
            android.content.res.Resources r4 = r9.getResources()
            r3 = 2131165484(0x7f07012c, float:1.7945186E38)
            int r3 = r4.getDimensionPixelSize(r3)
            int r3 = r3 / 2
            int r5 = r5 - r3
            android.view.ViewGroup$LayoutParams r4 = r7.getLayoutParams()
            boolean r3 = r4 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r3 == 0) goto L_0x024e
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            if (r4 == 0) goto L_0x024e
            int r3 = r4.getMarginEnd()
            if (r3 == r5) goto L_0x024e
            r4.setMarginEnd(r5)
            r7.setLayoutParams(r4)
        L_0x024e:
            android.view.ViewGroup$LayoutParams r4 = r6.getLayoutParams()
            boolean r3 = r4 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r3 == 0) goto L_0x0266
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            if (r4 == 0) goto L_0x0266
            int r3 = r4.getMarginStart()
            if (r3 == r5) goto L_0x0266
            r4.setMarginStart(r5)
            r6.setLayoutParams(r4)
        L_0x0266:
            X.9QR r3 = r0.A0E
            if (r3 == 0) goto L_0x0667
            android.view.ViewStub r4 = r3.A02
        L_0x026c:
            androidx.fragment.app.FragmentActivity r12 = r2.requireActivity()
            androidx.fragment.app.FragmentActivity r3 = r2.requireActivity()
            android.app.Application r3 = r3.getApplication()
            X.0qQ.A07(r3)
            boolean r15 = X.AnonymousClass8FD.A00(r3)
            X.9Qa r3 = new X.9Qa
            r3.<init>(r0)
            X.9QZ r9 = new X.9QZ
            r10 = r14
            r11 = r4
            r13 = r8
            r14 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r0.A0u = r9
        L_0x028f:
            com.instagram.common.gallery.Medium r5 = r0.A03()
            r14 = r28
            if (r5 == 0) goto L_0x02a4
            X.28D r4 = r0.A16
            com.instagram.common.session.UserSession r3 = r0.A1D
            boolean r3 = X.C367268qT.A01(r4, r5, r3)
            if (r3 != 0) goto L_0x02a4
            if (r28 != 0) goto L_0x02a4
        L_0x02a3:
            return
        L_0x02a4:
            boolean r5 = r0.A0g
            r3 = 0
            r4 = 0
            if (r5 == 0) goto L_0x02e5
            if (r28 != 0) goto L_0x02e5
            boolean r5 = r0.CVJ()
            if (r5 != 0) goto L_0x02e5
            X.80D r1 = r0.A1P
            X.9Qn r1 = r1.A13
            if (r1 == 0) goto L_0x02e3
            java.lang.String r1 = r1.A08
        L_0x02ba:
            X.8qE r5 = new X.8qE
            r5.<init>(r1)
            X.80U r1 = r0.A1W
            X.80T r1 = (X.AnonymousClass80T) r1
            X.80W r4 = r1.A02
            X.0sn r2 = X.0sn.A00
            X.8VP r1 = new X.8VP
            r1.<init>(r5, r2, r3)
            r4.A04(r1)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = r0.A1n
            r1.A0X(r5)
            r0.A0E()
            com.instagram.common.session.UserSession r0 = r0.A1D
            X.27r r1 = X.27p.A01(r0)
            X.4yP r0 = X.C279294yP.CLIPS
            r1.A0w(r0)
            return
        L_0x02e3:
            r1 = r3
            goto L_0x02ba
        L_0x02e5:
            boolean r5 = r0.CYO()
            if (r5 == 0) goto L_0x02f4
            X.81m r5 = r0.A1U
            X.81t r5 = r5.A00()
            r5.CLK()
        L_0x02f4:
            r0.A0l = r1
            X.85M r5 = r0.A1d
            r5.A00()
            com.instagram.music.common.model.AudioOverlayTrack r6 = r0.A0N
            if (r6 == 0) goto L_0x035d
            X.8A2 r8 = r0.A1h
            X.28D r5 = r0.A16
            java.lang.String r10 = r5.name()
            com.instagram.common.session.UserSession r7 = r0.A1D
            X.27r r5 = X.27p.A01(r7)
            X.4yP r5 = r5.A0J()
            java.lang.String r11 = java.lang.String.valueOf(r5)
            X.27r r5 = X.27p.A01(r7)
            X.283 r5 = r5.A04
            java.lang.String r7 = r5.A0L
            X.80U r5 = r0.A1W
            X.80X r9 = r5.Ats()
            X.8ZN r5 = r0.A2C
            if (r5 == 0) goto L_0x0329
            java.lang.String r3 = r5.A00
        L_0x0329:
            r12 = r7
            r13 = r3
            r8.A08(r9, r10, r11, r12, r13, r14)
            X.8ZN r3 = X.AnonymousClass8ZN.CLIPS_USE_AUDIO_BUTTON
            if (r5 != r3) goto L_0x034a
            if (r28 != 0) goto L_0x034a
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r3 = r0.A1s
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r3 = r3.A0H
            X.2Fj r7 = r3.A02
            X.9TK r5 = new X.9TK
            r5.<init>(r0, r6)
            X.0qQ.A0B(r7, r4)
            X.9TL r3 = new X.9TL
            r3.<init>(r7, r5)
            r7.A06(r2, r3)
        L_0x034a:
            com.instagram.music.common.model.DownloadedTrack r3 = r6.A06
            if (r3 == 0) goto L_0x0662
            X.8IJ r3 = r6.A05
            if (r3 != 0) goto L_0x0662
            X.8JE r5 = r0.A1X
            X.885 r3 = r0.A1m
            X.886 r3 = r3.A00()
            r5.A05(r3, r6)
        L_0x035d:
            r0.A0D()
            A1B(r0, r4)
            A0T(r0)
            A0m(r0)
            X.9QR r3 = r0.A0E
            if (r3 == 0) goto L_0x0377
            android.view.ViewGroup r3 = r3.A00
            android.view.View[] r5 = new android.view.View[]{r3}
            r3 = 0
            X.C294975nL.A04(r3, r5, r1)
        L_0x0377:
            com.instagram.common.gallery.Medium r9 = r0.A03()
            r0.A0E()
            if (r9 == 0) goto L_0x03a0
            int r6 = A02(r0)
            r5 = 100
            r3 = 0
            if (r6 > r5) goto L_0x038a
            r3 = 1
        L_0x038a:
            java.lang.String r7 = "ClipsCaptureControllerImpl"
            r6 = 0
            if (r3 == 0) goto L_0x060a
            android.content.Context r5 = r0.A11
            r3 = 2131955694(0x7f130fee, float:1.9547923E38)
            X.C59689JTv.A01(r5, r6, r3, r4)
            java.lang.String r3 = "Hit max video duration before preloading medium"
            X.0kD.A07(r7, r3, r6)
        L_0x039c:
            r0.A0X = r6
            r0.A0W = r6
        L_0x03a0:
            X.8I2 r10 = r0.A1j
            X.05G r8 = r10.A04
            java.lang.Object r3 = r8.getValue()
            boolean r3 = r3 instanceof X.B3b
            if (r3 == 0) goto L_0x0494
            java.lang.Object r3 = r8.getValue()
            X.8I4 r3 = (X.AnonymousClass8I4) r3
            A0w(r0, r3)
        L_0x03b5:
            r0.A01 = r4
            boolean r3 = r0.CYO()
            if (r3 != 0) goto L_0x03dc
            X.88B r5 = r0.A1x
            boolean r3 = r5.A02()
            if (r3 == 0) goto L_0x045a
            com.instagram.common.session.UserSession r6 = r0.A1D
            r3 = 24
            X.MMR r5 = new X.MMR
            r5.<init>(r6, r3)
            java.lang.Class<X.KVS> r3 = X.KVS.class
            java.lang.Object r6 = r6.A01(r3, r5)
            X.FYW r6 = (X.FYW) r6
            android.content.Context r5 = r0.A11
            r3 = 0
            r6.A02(r5, r3)
        L_0x03dc:
            com.instagram.common.session.UserSession r6 = r0.A1D
            X.1Av r3 = X.1Au.A00(r6)
            X.0xa r5 = r3.A01
            java.lang.String r3 = "clips_nux_camera_tooltip_green_screen_count"
            int r3 = r5.getInt(r3, r4)
            if (r3 >= r1) goto L_0x0421
            X.0Tu r5 = X.0Tu.A05
            r3 = 36880793976963432(0x8306e300080168, double:3.3869008458444595E-306)
            java.lang.String r3 = X.182.A04(r5, r6, r3)
            java.util.List r4 = X.JZ9.A00(r3)
            X.8I0 r9 = r0.A1Y
            X.8Yz r8 = r0.A1F
            X.8aL r7 = X.C358088aL.A0K
            X.JZ8 r3 = X.JZ8.GIF
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L_0x0457
            java.lang.Integer r4 = X.AnonymousClass05K.A01
        L_0x040b:
            boolean r3 = r9.A00
            if (r3 != 0) goto L_0x0421
            r9.A00 = r1
            X.4DH r1 = r9.A03
            android.view.View r5 = r1.requireView()
            X.9Tn r1 = new X.9Tn
            r1.<init>(r7, r8, r9, r4)
            r3 = 1000(0x3e8, double:4.94E-321)
            r5.postDelayed(r1, r3)
        L_0x0421:
            X.80D r1 = r0.A1P
            java.lang.String r1 = r1.A2j
            if (r1 == 0) goto L_0x0439
            X.8IN r1 = r0.A1p
            X.2Fk r4 = r1.A00
            r1 = 5
            X.MP5 r3 = new X.MP5
            r3.<init>(r0, r1)
            X.8Io r1 = new X.8Io
            r1.<init>(r3)
            r4.A06(r2, r1)
        L_0x0439:
            X.0Tu r1 = X.0Tu.A05
            r3 = 36324539877175436(0x810cfa0002308c, double:3.035123513283055E-306)
            boolean r1 = X.182.A06(r1, r6, r3)
            if (r1 == 0) goto L_0x02a3
            X.8Ib r3 = r0.A2N
            com.instagram.api.schemas.MusicProduct r4 = com.instagram.api.schemas.MusicProduct.CLIPS_CAMERA_FORMAT_V2
            java.lang.String r0 = "clips_browse"
            com.instagram.music.common.model.MusicBrowseCategory r7 = X.C64181LSn.A01(r0)
            r8 = 0
            r9 = r8
            r5 = r2
            r3.A00(r4, r5, r6, r7, r8, r9)
            return
        L_0x0457:
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            goto L_0x040b
        L_0x045a:
            X.82i r6 = r5.A00
            if (r6 == 0) goto L_0x046e
            X.8JI r3 = r6.A00
        L_0x0460:
            X.8JI r5 = X.AnonymousClass8JI.REMIX
            if (r3 != r5) goto L_0x03dc
            com.instagram.common.session.UserSession r8 = r0.A1D
            if (r6 == 0) goto L_0x0470
            X.8JI r3 = r6.A00
            if (r3 != r5) goto L_0x0470
            goto L_0x03dc
        L_0x046e:
            r3 = 0
            goto L_0x0460
        L_0x0470:
            android.content.Context r7 = r0.A11
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r3 = 973(0x3cd, float:1.363E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            r6.putBoolean(r3, r4)
            r3 = 23
            X.MMR r5 = new X.MMR
            r5.<init>(r8, r3)
            java.lang.Class<X.9pK> r3 = X.C389369pK.class
            java.lang.Object r3 = r8.A01(r3, r5)
            X.FYW r3 = (X.FYW) r3
            r3.A02(r7, r6)
            goto L_0x03dc
        L_0x0494:
            java.lang.Object r5 = r8.getValue()
            X.8I3 r3 = X.AnonymousClass8I3.A00
            boolean r3 = X.0qQ.A0K(r5, r3)
            if (r3 == 0) goto L_0x03b5
            X.8IF r3 = X.AnonymousClass8IF.A00
            r8.Epw(r3)
            X.80D r5 = r10.A00
            if (r5 == 0) goto L_0x05fe
            com.instagram.music.common.config.MusicAttributionConfig r3 = r5.A1N
            if (r3 == 0) goto L_0x05fe
            com.instagram.music.common.model.MusicAssetModel r9 = r3.A02
        L_0x04af:
            X.9Qn r3 = r5.A13
            if (r3 == 0) goto L_0x04b7
            X.8JL r7 = r3.A03
            if (r7 != 0) goto L_0x04b9
        L_0x04b7:
            X.8JL r7 = X.AnonymousClass8JL.NONE
        L_0x04b9:
            r16 = 0
            if (r5 == 0) goto L_0x05f8
            com.instagram.music.common.config.MusicAttributionConfig r6 = r5.A1N
            if (r6 == 0) goto L_0x05fa
            com.instagram.music.common.model.MusicAssetModel r3 = r6.A02
            if (r3 == 0) goto L_0x05fa
            com.instagram.common.typedurl.ImageUrl r5 = r3.A03
            if (r5 == 0) goto L_0x04d1
            com.instagram.common.session.UserSession r3 = r10.A01
            boolean r3 = X.AnonymousClass30D.A08(r3)
            if (r3 != 0) goto L_0x04d7
        L_0x04d1:
            X.8JL r3 = X.AnonymousClass8JL.AUDIO
            if (r7 != r3) goto L_0x05f0
            X.8JL r7 = X.AnonymousClass8JL.NONE
        L_0x04d7:
            X.80D r13 = r10.A00
            if (r13 == 0) goto L_0x05db
            java.lang.String r11 = r13.A2G
            java.lang.String r3 = r13.A2F
            r18 = r3
            java.lang.Boolean r12 = r13.A20
            X.9Qn r3 = r13.A13
            if (r3 == 0) goto L_0x05e0
            java.lang.String r3 = r3.A0B
            r19 = r3
        L_0x04eb:
            X.9Qn r3 = r13.A13
            if (r3 == 0) goto L_0x05e6
            java.lang.String r3 = r3.A0A
            r20 = r3
        L_0x04f3:
            X.9Qn r3 = r13.A13
            if (r3 == 0) goto L_0x05ec
            com.instagram.common.typedurl.ImageUrl r13 = r3.A05
            if (r13 == 0) goto L_0x0507
            if (r11 == 0) goto L_0x0507
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)
            boolean r3 = X.0qQ.A0K(r12, r3)
            if (r3 == 0) goto L_0x050d
        L_0x0507:
            X.8JL r3 = X.AnonymousClass8JL.EFFECT
            if (r7 != r3) goto L_0x05d3
            X.8JL r7 = X.AnonymousClass8JL.NONE
        L_0x050d:
            X.8JL r3 = X.AnonymousClass8JL.AUDIO
            if (r7 == r3) goto L_0x0519
            X.8JL r3 = X.AnonymousClass8JL.AUDIO_AND_EFFECT
            if (r7 == r3) goto L_0x0519
            X.8JL r3 = X.AnonymousClass8JL.EFFECT
            if (r7 != r3) goto L_0x0564
        L_0x0519:
            int r15 = r7.ordinal()
            switch(r15) {
                case 2: goto L_0x0562;
                default: goto L_0x0520;
            }
        L_0x0520:
            if (r5 == 0) goto L_0x0564
            java.lang.String r3 = "Required value was null."
            if (r15 == r4) goto L_0x055a
            r14 = 2
            if (r15 == r14) goto L_0x0544
            r14 = 3
            if (r15 != r14) goto L_0x0564
            if (r6 == 0) goto L_0x0689
            if (r11 == 0) goto L_0x0683
            if (r13 == 0) goto L_0x067d
            X.9cu r3 = new X.9cu
            r14 = r5
            r15 = r6
            r16 = r12
            r17 = r11
            r11 = r3
            r12 = r7
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x053f:
            r8.Epw(r3)
            goto L_0x03b5
        L_0x0544:
            if (r11 == 0) goto L_0x0695
            if (r13 == 0) goto L_0x068f
            X.9cv r3 = new X.9cv
            r14 = r5
            r15 = r12
            r16 = r11
            r17 = r18
            r18 = r19
            r19 = r20
            r11 = r3
            r12 = r7
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x053f
        L_0x055a:
            if (r6 == 0) goto L_0x069b
            X.9ct r3 = new X.9ct
            r3.<init>(r7, r5, r6)
            goto L_0x053f
        L_0x0562:
            r5 = r13
            goto L_0x0520
        L_0x0564:
            X.80D r3 = r10.A00
            if (r3 == 0) goto L_0x0570
            X.9Qn r3 = r3.A13
            if (r3 == 0) goto L_0x0570
            X.8JL r5 = r3.A03
            if (r5 != 0) goto L_0x0572
        L_0x0570:
            X.8JL r5 = X.AnonymousClass8JL.NONE
        L_0x0572:
            X.8JL r3 = X.AnonymousClass8JL.TEMPLATE
            if (r5 == r3) goto L_0x05cd
            X.8JL r3 = X.AnonymousClass8JL.TEMPLATE_BROWSER
            if (r5 == r3) goto L_0x05cd
            X.8JL r3 = X.AnonymousClass8JL.NONE
            if (r5 != r3) goto L_0x05cf
            if (r9 != 0) goto L_0x0603
            com.instagram.common.session.UserSession r3 = r10.A01
            X.2cc r3 = X.C71342cb.A00(r3)
            java.lang.String r6 = r3.A05
            java.lang.String r5 = ""
            java.util.regex.Pattern r3 = X.0mp.A00
            if (r6 != 0) goto L_0x058f
            r6 = r5
        L_0x058f:
            X.1QK r3 = X.1QK.A09
            java.lang.String r3 = r3.toString()
            boolean r3 = X.0qQ.A0K(r6, r3)
            if (r3 == 0) goto L_0x05cf
            X.8IA r9 = r10.A02
            com.instagram.common.session.UserSession r7 = r9.A00
            boolean r3 = X.AnonymousClass30D.A08(r7)
            if (r3 == 0) goto L_0x05cf
            X.0Tu r3 = X.0Tu.A05
            r5 = 36319257067396187(0x81082c00021c5b, double:3.03178264310649E-306)
            boolean r3 = X.182.A06(r3, r7, r5)
            if (r3 == 0) goto L_0x05cf
            X.05G r5 = r9.A01
            X.8IB r3 = X.AnonymousClass8IB.A00
            r5.Epw(r3)
            X.6oS r7 = X.C318116oQ.A00(r9)
            r6 = 19
            X.MG0 r5 = new X.MG0
            r3 = r16
            r5.<init>(r9, r3, r6)
            X.19B r3 = X.19B.A00
            X.1Eo.A05(r3, r5, r7)
            goto L_0x03b5
        L_0x05cd:
            if (r9 != 0) goto L_0x0603
        L_0x05cf:
            X.9Qi r3 = X.C378569Qi.A00
            goto L_0x053f
        L_0x05d3:
            X.8JL r3 = X.AnonymousClass8JL.AUDIO_AND_EFFECT
            if (r7 != r3) goto L_0x050d
            X.8JL r7 = X.AnonymousClass8JL.AUDIO
            goto L_0x050d
        L_0x05db:
            r11 = r16
            r18 = r11
            r12 = r11
        L_0x05e0:
            r19 = r16
            if (r13 == 0) goto L_0x05e6
            goto L_0x04eb
        L_0x05e6:
            r20 = r16
            if (r13 == 0) goto L_0x05ec
            goto L_0x04f3
        L_0x05ec:
            r13 = r16
            goto L_0x0507
        L_0x05f0:
            X.8JL r3 = X.AnonymousClass8JL.AUDIO_AND_EFFECT
            if (r7 != r3) goto L_0x04d7
            X.8JL r7 = X.AnonymousClass8JL.EFFECT
            goto L_0x04d7
        L_0x05f8:
            r6 = r16
        L_0x05fa:
            r5 = r16
            goto L_0x04d1
        L_0x05fe:
            r9 = 0
            if (r5 == 0) goto L_0x04b7
            goto L_0x04af
        L_0x0603:
            X.8I6 r3 = r10.A03
            r3.A00(r9, r4)
            goto L_0x03b5
        L_0x060a:
            com.instagram.common.gallery.Medium r8 = r0.A03()
            if (r8 == 0) goto L_0x061c
            X.28D r5 = r0.A16
            com.instagram.common.session.UserSession r3 = r0.A1D
            boolean r3 = X.C367268qT.A01(r5, r8, r3)
            if (r3 != 0) goto L_0x061c
            goto L_0x039c
        L_0x061c:
            r0.A0m = r1
            X.28D r3 = r0.A16
            com.instagram.common.session.UserSession r10 = r0.A1D
            boolean r3 = X.C367268qT.A01(r3, r9, r10)
            if (r3 == 0) goto L_0x0647
            boolean r3 = r9.CeS()
            if (r3 == 0) goto L_0x0635
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            A0L(r9, r0, r3, r4)
            goto L_0x039c
        L_0x0635:
            boolean r3 = r9.A05()
            if (r3 == 0) goto L_0x0640
            A0M(r9, r0, r4)
            goto L_0x039c
        L_0x0640:
            java.lang.String r3 = "Unknown medium type"
            X.0kD.A07(r7, r3, r6)
            goto L_0x039c
        L_0x0647:
            android.content.Context r8 = r0.A11
            X.2Nn r5 = r0.A20
            java.lang.String r14 = r0.Ao9()
            X.80x r3 = r0.A1v
            com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec r12 = r3.A00()
            X.9ja r3 = new X.9ja
            r3.<init>(r9, r0)
            r11 = r3
            r13 = r5
            r15 = r4
            X.C39810AAh.A01(r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x039c
        L_0x0662:
            A12(r0, r6, r4)
            goto L_0x035d
        L_0x0667:
            r4 = 0
            goto L_0x026c
        L_0x066a:
            java.lang.String r4 = "ClipsCaptureControllerImpl"
            java.lang.String r3 = "view holder clips review container is null"
            X.0kD.A07(r4, r3, r6)
            goto L_0x01fe
        L_0x0673:
            X.8aL r3 = X.C358088aL.A0k
            goto L_0x014e
        L_0x0677:
            r3 = 0
            goto L_0x0068
        L_0x067a:
            r7 = r6
            goto L_0x0199
        L_0x067d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0683:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0689:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x068f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0695:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x069b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C353498Hw.A1D(X.8Hw, boolean):void");
    }

    public static final void A1E(C353498Hw r6, boolean z) {
        AnonymousClass8JI r1;
        AnonymousClass51N r0;
        0v6 A052;
        Number number;
        Number number2;
        0v6 A012;
        AnonymousClass88B r5 = r6.A1x;
        C3498982i r02 = r5.A00;
        if (r02 != null) {
            r1 = r02.A00;
        } else {
            r1 = null;
        }
        if (r1 == AnonymousClass8JI.REMIX) {
            View view = r6.A12;
            view.setVisibility(0);
            AnonymousClass8LZ.A00(view);
            if (r6.A0J.A01.size() == 0) {
                File file = r5.A01;
                if (file == null || (A012 = 0oY.A01(C39908AIz.A02(file), 0)) == null) {
                    view.setBackgroundColor(r6.A11.getColor(R.color.clips_remix_camera_outer_container_default_background));
                    return;
                } else {
                    number = (Number) 00k.A0O(A012.A02, 0);
                    number2 = (Number) 00k.A0O(A012.A02, 1);
                }
            } else if ((r6.A0J.A01.size() == 1 || (r6.CKX() && z)) && (r0 = (AnonymousClass51N) r6.A0J.A04(0)) != null && (A052 = r0.A05()) != null) {
                number = (Number) 00k.A0O(A052.A02, 0);
                number2 = (Number) 00k.A0O(A052.A02, 1);
                if (A052.A02.size() <= 1) {
                    return;
                }
            } else {
                return;
            }
            if (number != null && number2 != null) {
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{number.intValue(), number2.intValue()}));
            }
        }
    }

    public static final void A1F(C353498Hw r27, boolean z, boolean z2, boolean z3) {
        C3504884v r0;
        C361278fx r02;
        AudioOverlayTrack audioOverlayTrack;
        DownloadedTrack downloadedTrack;
        C353498Hw r12 = r27;
        if (r12.A0E != null) {
            0qQ.A0B(r12.A0J, 0);
            0sn r2 = 0sn.A00;
            0qQ.A0B(r2, 0);
            r12.A0J = new AnonymousClass831(r2, false);
            ShutterButton shutterButton = r12.A22;
            C301725zr r1 = shutterButton.A0h;
            r1.A0B.clear();
            r1.A04 = 0;
            r1.A03 = 0;
            shutterButton.invalidate();
            ClipsCreationViewModel clipsCreationViewModel = r12.A1n;
            C351888Av r03 = clipsCreationViewModel.A02;
            if (r03 != null) {
                r03.A00.A0H.A05.A00();
            }
            clipsCreationViewModel.A0O();
            clipsCreationViewModel.A0I.A0B((Object) null);
            ArrayList arrayList = new ArrayList();
            for (Object next : r12.A0V) {
                if (!(next instanceof C59812JZg)) {
                    arrayList.add(next);
                }
            }
            r12.A0V = arrayList;
            if (!z2) {
                C3507185x r4 = r12.A2Q;
                ClipsAudioStore clipsAudioStore = r4.A02.A0K;
                clipsAudioStore.A0C.clear();
                clipsAudioStore.A0S.Epw(r2);
                ClipsAudioStore clipsAudioStore2 = r4.A01;
                clipsAudioStore2.A06(1.0f);
                clipsAudioStore2.A0U.Epw(Float.valueOf(C229632nm.A02(1.0f, 0.0f, 1.0f)));
                clipsAudioStore2.A0H.Epw(Float.valueOf(C229632nm.A02(1.0f, 0.0f, 1.0f)));
                clipsAudioStore2.A0Q.Epw(Float.valueOf(C229632nm.A02(1.0f, 0.0f, 1.0f)));
            }
            r12.A0Z = false;
            r12.A0m = false;
            if (!z) {
                ClipsAudioStore clipsAudioStore3 = clipsCreationViewModel.A0K;
                AnonymousClass83A r13 = clipsAudioStore3.A0A;
                Map map = r13.A02;
                map.clear();
                AnonymousClass83A.A00(r13, map);
                clipsAudioStore3.A0T.Epw((Object) null);
                clipsAudioStore3.A0L.Epw((Object) null);
                clipsAudioStore3.A0K.Epw((Object) null);
                clipsAudioStore3.A09.A02.Epw(r2);
                C357638Yz r132 = r12.A1F;
                r132.A0N(C358088aL.A0t, C339947kR.A01().indexOf(AnonymousClass886.A09));
                if (z2) {
                    AnonymousClass8JE r14 = r12.A1X;
                    AudioOverlayTrack audioOverlayTrack2 = r14.A03;
                    if (!(audioOverlayTrack2 == null || (downloadedTrack = audioOverlayTrack2.A06) == null)) {
                        AnonymousClass8JE.A02(r14, downloadedTrack.A00(audioOverlayTrack2.A03));
                    }
                    List list = (List) clipsAudioStore3.A0V.getValue();
                    if (!(list == null || (r02 = (C361278fx) 00k.A0J(list)) == null || (audioOverlayTrack = (AudioOverlayTrack) r02.A01) == null)) {
                        int i = audioOverlayTrack.A03;
                        int i2 = audioOverlayTrack.A02;
                        String str = audioOverlayTrack.A0B;
                        String str2 = audioOverlayTrack.A0A;
                        String str3 = audioOverlayTrack.A0E;
                        MusicBrowseCategory musicBrowseCategory = audioOverlayTrack.A09;
                        MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
                        DownloadedTrack downloadedTrack2 = audioOverlayTrack.A06;
                        AnonymousClass8IJ r42 = audioOverlayTrack.A05;
                        float f = audioOverlayTrack.A00;
                        String str4 = audioOverlayTrack.A0C;
                        int i3 = i2;
                        int i4 = i;
                        InstagramAudioApplySource instagramAudioApplySource = audioOverlayTrack.A07;
                        MusicAssetModel musicAssetModel2 = musicAssetModel;
                        MusicBrowseCategory musicBrowseCategory2 = musicBrowseCategory;
                        AnonymousClass8IJ r16 = r42;
                        DownloadedTrack downloadedTrack3 = downloadedTrack2;
                        AudioOverlayTrack audioOverlayTrack3 = new AudioOverlayTrack(r16, downloadedTrack3, instagramAudioApplySource, musicAssetModel2, musicBrowseCategory2, str, str2, str3, str4, f, i4, i3, 0, 0);
                        if (audioOverlayTrack3.A06 != null) {
                            r12.A1I((AudioOverlayTrack) null, false);
                            r12.A1I(audioOverlayTrack3, false);
                            r14.A05(r12.A1m.A00(), audioOverlayTrack3);
                        }
                    }
                } else if (!r12.A1P.A42) {
                    r12.A1J(false);
                }
                C358088aL r15 = C358088aL.A0G;
                if (false != r132.A0V(r15)) {
                    r132.A0L(r15);
                }
                if (!z3 && (r0 = r12.A2K) != null && r0.A0H.Bu9()) {
                    r12.A1A.A01(AnonymousClass84B.DEFAULT);
                }
            }
            A1b(r12);
            r12.A0e = false;
            A0q(r12);
            A0N(C358088aL.A09, r12, false);
            r12.A1d.A00();
            r12.A0D();
            A1B(r12, true);
            A0W(r12);
            A0a(r12);
            C67010Mgi mgi = r12.A0t;
            if (mgi != null) {
                mgi.A04();
            }
            A0m(r12);
            C379469Ua A002 = AnonymousClass9T6.A00(r12.A1D);
            if (!A002.A00) {
                A002.A01.clear();
            }
            r12.A0j = false;
            if (r12.A0g) {
                return;
            }
            if (r12.CVJ() || r12.A1P.A2A != null) {
                r12.A1s.A0C();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x0157  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A1G(X.AnonymousClass51M r15) {
        /*
            r14 = this;
            X.9QR r0 = r14.A0E
            java.lang.String r3 = "ClipsCaptureControllerImpl"
            r2 = 0
            if (r0 != 0) goto L_0x000d
            java.lang.String r0 = "view holder should not be null"
            X.0kD.A07(r3, r0, r2)
            return
        L_0x000d:
            X.9Hy r7 = r15.A0A
            if (r7 != 0) goto L_0x001d
            r8 = 0
            r10 = 15
            r12 = 3
            X.9Hy r7 = new X.9Hy
            r9 = r8
            r11 = r8
            r13 = r8
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x001d:
            float r0 = r7.A02
            r4 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x007e
            X.51R r0 = r15.A0F
            int r1 = r0.A09
            int r0 = r0.A05
            if (r1 <= 0) goto L_0x007e
            if (r0 <= 0) goto L_0x007e
            r6 = 1058013184(0x3f100000, float:0.5625)
            float r1 = (float) r1
            float r0 = (float) r0
            float r1 = r1 / r0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x007e
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x007e
            com.instagram.common.session.UserSession r5 = r14.A1D
            X.0Tu r4 = X.0Tu.A05
            r0 = 36328035980426115(0x81102800003b83, double:3.037334463056462E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x007e
            r0 = 37172460910608957(0x8410280001023d, double:3.571352189130363E-306)
            double r0 = X.182.A00(r4, r5, r0)
            float r5 = (float) r0
            X.51R r0 = r15.A0F
            int r4 = r0.A09
            int r1 = r0.A05
            if (r4 <= 0) goto L_0x01a0
            if (r1 <= 0) goto L_0x01a0
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x01a0
            float r8 = (float) r4
            float r0 = (float) r1
            float r8 = r8 / r0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x01a0
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x01a0
            float r8 = r8 / r6
        L_0x0070:
            float r9 = r7.A00
            float r10 = r7.A03
            float r11 = r7.A01
            r7 = 3
            X.9Hy r6 = new X.9Hy
            r6.<init>(r7, r8, r9, r10, r11)
            r15.A0A = r6
        L_0x007e:
            X.8IQ r0 = r14.A1k
            X.87s r5 = r0.A03
            boolean r0 = r5.A0N()
            if (r0 == 0) goto L_0x019d
            java.lang.Integer r7 = r5.A0A
        L_0x008a:
            boolean r0 = A1X(r14)
            r6 = 1
            r10 = 2
            r4 = 0
            if (r0 != 0) goto L_0x00ef
            X.831 r0 = r14.A0J
            int r1 = X.C348947zL.A01(r0)
            int r0 = X.C348947zL.A00(r15)
            int r1 = r1 + r0
            if (r7 == 0) goto L_0x00b3
            X.831 r8 = r14.A0J
            int r0 = r7.intValue()
            X.51O r0 = r8.A04(r0)
            X.51N r0 = (X.AnonymousClass51N) r0
            if (r0 == 0) goto L_0x00b3
            int r0 = X.C348947zL.A00(r0)
            int r1 = r1 - r0
        L_0x00b3:
            int r0 = A00(r14)
            if (r1 <= r0) goto L_0x00ef
            int r0 = A00(r14)
            int r1 = r1 - r0
            int r0 = r15.A08
            int r0 = r0 - r1
            if (r0 >= r4) goto L_0x00c4
            r0 = 0
        L_0x00c4:
            r15.A08 = r0
            java.util.Locale r9 = java.util.Locale.US
            X.831 r0 = r14.A0J
            int r0 = X.C348947zL.A01(r0)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            int r1 = r15.A08
            int r0 = r15.A09
            int r1 = r1 - r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r8, r0}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r10)
            java.lang.String r0 = "tried adding a segment that was longer than the remaining time (prev duration:%d, new segment:%d)"
            java.lang.String r0 = java.lang.String.format(r9, r0, r1)
            X.0qQ.A07(r0)
            X.0kD.A07(r3, r0, r2)
        L_0x00ef:
            if (r7 == 0) goto L_0x011e
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r2 = r14.A1n
            int r1 = r7.intValue()
            X.8d5 r0 = X.C359548d5.VIDEO_CLIP_REPLACE
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel.A03(r0, r2, r6)
            X.836 r0 = r2.A0O
            r0.A01(r15, r1)
        L_0x0101:
            X.831 r0 = r14.A0J
            X.C348947zL.A01(r0)
            boolean r0 = A1b(r14)
            if (r0 == 0) goto L_0x0115
            X.8JE r1 = r14.A1X
            com.instagram.music.common.model.AudioOverlayTrack r0 = r1.A03
            if (r0 == 0) goto L_0x0115
            X.AnonymousClass8JE.A03(r1, r4)
        L_0x0115:
            r14.A0e = r4
            A0V(r14)
            A0W(r14)
            return
        L_0x011e:
            java.lang.Integer r0 = A09(r14)
            if (r0 == 0) goto L_0x0167
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r3 = r14.A1n
            int r1 = r0.intValue()
            int r0 = r14.A0q
            int r1 = r1 + r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r3.A0d(r15, r0)
        L_0x0134:
            int r0 = r14.A0q
            int r0 = r0 + 1
            r14.A0q = r0
        L_0x013a:
            boolean r0 = A1X(r14)
            if (r0 != 0) goto L_0x0146
            boolean r0 = r14.CVF()
            if (r0 == 0) goto L_0x015b
        L_0x0146:
            X.81m r0 = r14.A1U
            X.81t r0 = r0.A00()
            r0.APH()
            X.8Ht r0 = r14.A1Q
            X.80R r0 = r0.A00
            X.88I r0 = r0.A1R
            if (r0 == 0) goto L_0x015b
            X.8Wx r0 = (X.C357198Wx) r0
            r0.A01 = r2
        L_0x015b:
            com.instagram.common.session.UserSession r0 = r14.A1D
            X.AYm r1 = X.C394779yg.A00(r0)
            X.9s5 r0 = X.C390939s5.ADDED_CLIP
            r1.A01(r0)
            goto L_0x0101
        L_0x0167:
            boolean r0 = A1X(r14)
            if (r0 == 0) goto L_0x0171
            r14.A1H(r15)
            goto L_0x013a
        L_0x0171:
            com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel r1 = r14.A1I
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x017d
            r14.A1H(r15)
            r1.A02 = r4
            goto L_0x013a
        L_0x017d:
            boolean r0 = r5.A0L()
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = r14.A1n
            if (r0 == 0) goto L_0x0199
            X.0Ud r0 = r1.A0c
            java.lang.Object r0 = r0.getValue()
            X.831 r0 = (X.AnonymousClass831) r0
            int r0 = X.AnonymousClass8YL.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0d(r15, r0)
            goto L_0x0134
        L_0x0199:
            r1.A0d(r15, r2)
            goto L_0x0134
        L_0x019d:
            r7 = 0
            goto L_0x008a
        L_0x01a0:
            r8 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0070
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C353498Hw.A1G(X.51M):void");
    }

    private final void A1I(AudioOverlayTrack audioOverlayTrack, boolean z) {
        this.A0N = audioOverlayTrack;
        this.A0y = z;
        C361278fx r2 = C361268fw.A00;
        if (audioOverlayTrack != null) {
            if (audioOverlayTrack.A06 != null) {
                r2 = new AnonymousClass8Y4(audioOverlayTrack);
            } else {
                r2 = new AnonymousClass8RJ(audioOverlayTrack);
            }
        }
        ClipsCreationViewModel clipsCreationViewModel = this.A1n;
        ClipsCreationViewModel.A01(r2, clipsCreationViewModel);
        clipsCreationViewModel.A0b(r2, false);
        if (audioOverlayTrack != null) {
            new C357998aC(this.A1B, this.A1D).A01(this, audioOverlayTrack);
            return;
        }
        AnonymousClass82X r1 = this.A1C;
        r1.A00 = null;
        AnonymousClass82X.A00(r1, (Integer) null);
    }

    private final void A1J(boolean z) {
        if (this.A0E == null) {
            0kD.A07("ClipsCaptureControllerImpl", "view holder should not be null", (Throwable) null);
            return;
        }
        this.A1l.A05((AudioOverlayTrack) null, "reset", z);
        A1I((AudioOverlayTrack) null, false);
        AnonymousClass8JE r1 = this.A1X;
        r1.A03 = null;
        r1.A02 = AnonymousClass886.A09;
        r1.A00 = AnonymousClass972.MUTABLE_FLAG_MASK;
        this.A1d.A00();
        C353638Im r0 = this.A0P;
        if (r0 == null) {
            0qQ.A0F("trackDownloader");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.A00 = false;
        A0T(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (A1R(r3) == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A1K(boolean r4) {
        /*
            r3 = this;
            boolean r0 = r3.A10
            if (r0 != 0) goto L_0x0011
            boolean r0 = r3.A1L()
            if (r0 == 0) goto L_0x0011
            boolean r0 = A1R(r3)
            r2 = 1
            if (r0 != 0) goto L_0x0012
        L_0x0011:
            r2 = 0
        L_0x0012:
            X.9QR r0 = r3.A0E
            if (r0 != 0) goto L_0x001f
            java.lang.String r2 = "ClipsCaptureControllerImpl"
            java.lang.String r1 = "view holder should not be null"
            r0 = 0
            X.0kD.A07(r2, r1, r0)
            return
        L_0x001f:
            android.widget.ImageButton r0 = r0.A03
            android.view.View[] r1 = new android.view.View[]{r0}
            if (r2 == 0) goto L_0x002c
            r0 = 0
            X.C294975nL.A04(r0, r1, r4)
            return
        L_0x002c:
            X.C294975nL.A05(r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C353498Hw.A1K(boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r0.A02 == null) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A1L() {
        /*
            r6 = this;
            X.Mgi r0 = r6.A0t
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L_0x000b
            android.os.CountDownTimer r0 = r0.A02
            r3 = 1
            if (r0 != 0) goto L_0x000c
        L_0x000b:
            r3 = 0
        L_0x000c:
            X.8IY r0 = r6.A0G
            X.8IX r2 = r0.A01
            X.8IX r0 = X.AnonymousClass8IX.CLIPS_REVIEW
            r1 = 0
            if (r2 != r0) goto L_0x0016
            r1 = 1
        L_0x0016:
            boolean r0 = r6.A0l
            if (r0 == 0) goto L_0x003f
            boolean r0 = r6.A0i
            if (r0 != 0) goto L_0x003f
            if (r3 != 0) goto L_0x003f
            boolean r0 = r6.CYO()
            if (r0 != 0) goto L_0x003f
            if (r1 != 0) goto L_0x003f
            boolean r0 = r6.A0k
            if (r0 != 0) goto L_0x003f
            X.80x r0 = r6.A1v
            X.2Fj r0 = r0.A04
            java.lang.Object r1 = r0.A02()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003f
            r5 = 1
        L_0x003f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C353498Hw.A1L():boolean");
    }

    private final boolean A1M() {
        int size = this.A0J.A01.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            AnonymousClass51N r1 = (AnonymousClass51N) this.A0J.A04(i2);
            if (r1 instanceof AnonymousClass51M) {
                if (((AnonymousClass51M) r1).A0F.A08 == 0) {
                    i++;
                }
                if (i * 2 >= this.A0J.A01.size()) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean A1N() {
        C340007kX r3;
        C40375Ab8 ab8;
        AnonymousClass804 r32 = this.A1L.A02.A01.A06;
        C339997kW r2 = null;
        if (r32 instanceof C340007kX) {
            r3 = (C340007kX) r32;
        } else {
            r3 = null;
        }
        AnonymousClass88E r0 = this.A1i;
        if (!(r0 == null || (ab8 = (C40375Ab8) r0.A00.A00()) == null || !ab8.A03())) {
            if (r3 != null) {
                r2 = r3.A00;
            }
            if (r2 != C339997kW.A04) {
                return false;
            }
            return true;
        }
        return false;
    }

    private final boolean A1O() {
        MusicAssetModel musicAssetModel;
        AudioOverlayTrack audioOverlayTrack = this.A0N;
        if (audioOverlayTrack == null || (musicAssetModel = audioOverlayTrack.A08) == null) {
            return false;
        }
        int i = musicAssetModel.A00 - audioOverlayTrack.A03;
        if (i > 90000) {
            i = 90000;
        }
        if (i <= audioOverlayTrack.A02) {
            return false;
        }
        audioOverlayTrack.A02 = i;
        return true;
    }

    private final boolean A1P(int i) {
        Integer num;
        C3495880y r1 = this.A0I;
        if (r1 != null) {
            num = Integer.valueOf(r1.A01);
        } else {
            num = null;
        }
        if (!(this.A1k.A03.A04 == null || r1 == null)) {
            int i2 = r1.A01;
            if (Integer.valueOf(i2) == null || i <= i2 || num == null || num.intValue() >= C3495980z.A00(this.A1D).A01) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean A1S(C353498Hw r1) {
        C40375Ab8 ab8;
        C3498982i r0;
        AnonymousClass88E r02 = r1.A1i;
        if (r02 == null || (ab8 = (C40375Ab8) r02.A00.A00()) == null || (r0 = ab8.A09.A08.A00) == null || !r0.A04.A5U()) {
            return false;
        }
        return true;
    }

    public static final boolean A1T(C353498Hw r2) {
        AnonymousClass8XA A002;
        C362868ic r0;
        AnonymousClass8WX r02 = r2.A0B;
        if (r02 == null || (A002 = r02.A00()) == null || (r0 = A002.A01) == null || r0.A00 == 0.0f) {
            return false;
        }
        return true;
    }

    public static final boolean A1U(C353498Hw r1) {
        AnonymousClass88E r0 = r1.A1i;
        if (r0 == null || r0.A00.A00() == null) {
            return false;
        }
        return true;
    }

    public static final boolean A1X(C353498Hw r1) {
        Object obj = ((AnonymousClass80T) r1.A1W).A02.A00.second;
        0qQ.A07(obj);
        if (obj instanceof AnonymousClass8VN) {
            return ((AnonymousClass8VN) obj).A01 instanceof C339027iw;
        }
        return false;
    }

    public static final boolean A1Y(C353498Hw r3) {
        if (r3.A02 == -1 && r3.A03 == -1 && !r3.A1F.A0V(C358088aL.A0J)) {
            return false;
        }
        return true;
    }

    public static final boolean A1Z(C353498Hw r1) {
        return r1.A1F.A0V(C358088aL.A0z);
    }

    public static final boolean A1a(C353498Hw r2) {
        if (!r2.A1x.A02() || r2.A0J.A01.size() != 1) {
            return false;
        }
        return true;
    }

    public static final boolean A1c(C353498Hw r4) {
        String str;
        String str2;
        String str3;
        String str4 = r4.A0R;
        if (str4 == null) {
            return false;
        }
        if ((00p.A0k(str4, "highlight:", false) || (((str = r4.A0R) != null && 00p.A0k(str, "smartReel:", false)) || (((str2 = r4.A0R) != null && 00p.A0k(str2, AnonymousClass000.A00(3245), false)) || ((str3 = r4.A0R) != null && 00p.A0k(str3, AnonymousClass000.A00(4015), false))))) && r4.A0U == null && r4.A16 != 28D.A1T) {
            return true;
        }
        return false;
    }

    public final boolean A1f() {
        C353638Im r0 = this.A0P;
        if (r0 == null) {
            0qQ.A0F("trackDownloader");
            throw AnonymousClass00P.createAndThrow();
        } else if (r0.A00) {
            return true;
        } else {
            if (this.A1x.A06.A02() == AnonymousClass88C.DOWNLOADING && this.A1k.A03.A04 == null) {
                return true;
            }
            return false;
        }
    }

    public final boolean A1g() {
        Object obj = ((AnonymousClass80T) this.A1W).A02.A00.second;
        0qQ.A07(obj);
        if (obj instanceof AnonymousClass8VN) {
            return ((AnonymousClass8VN) obj).A01 instanceof C342007nt;
        }
        return false;
    }

    public final boolean A1h() {
        AnonymousClass88W r0;
        Object obj = ((AnonymousClass80T) this.A1W).A02.A00.second;
        0qQ.A07(obj);
        if (!(obj instanceof AnonymousClass8VN) || (r0 = (AnonymousClass88W) this.A1s.A0C.A02()) == null || r0.A01 == null || !this.A0c) {
            return false;
        }
        return ((AnonymousClass8VN) obj).A01 instanceof C358988bn;
    }

    public final List AIB() {
        boolean z;
        List list;
        C59721JVf jVf = this.A08;
        boolean z2 = this.A0o;
        String name = this.A16.name();
        C293505kq A092 = this.A1s.A09(Ao9());
        boolean A062 = 182.A06(0Tu.A05, this.A1D, 36325716698084515L);
        0qQ.A0B(name, 2);
        if (!A062 ? jVf == null || z2 || !"CLIPS_DIRECT_SHARED_ALBUM_CREATE_REEL_BUTTON".equals(name) : z2 || "CLIPS_DIRECT_STACK_TO_CLIPS_CREATE_BUTTON".equals(name)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (A092 != null && (list = A092.A0n) != null && !list.isEmpty()) {
                return list;
            }
            if (jVf != null) {
                return (List) jVf.A00;
            }
        }
        return null;
    }

    public final String ASp() {
        if (this.A08 != null) {
            String name = this.A16.name();
            if (!"CLIPS_DIRECT_SHARED_ALBUM_CREATE_REEL_BUTTON".equals(name)) {
                return null;
            }
            return name;
        }
        return null;
    }

    public final C391579tJ Aje() {
        Object obj = ((AnonymousClass80T) this.A1W).A02.A00.second;
        0qQ.A07(obj);
        if (this.A1k.A03.A04 != null) {
            return C391579tJ.TEMPLATE_BROWSER;
        }
        if (obj instanceof AnonymousClass8VN) {
            C358998bo r1 = ((AnonymousClass8VN) obj).A01;
            if (r1 instanceof C342007nt) {
                return C391579tJ.ADD_CLIPS_STACKED_TIMELINE;
            }
            if ((r1 instanceof C381939cp) || (r1 instanceof C339027iw)) {
                return C391579tJ.ADD_CLIPS_POSTCAP;
            }
            if (r1 != C358988bn.A00) {
                return C391579tJ.UNKNOWN;
            }
            if (this.A0Z) {
                return C391579tJ.BACK_BUTTON_POSTCAP;
            }
        } else if (!(obj instanceof C356948Vv)) {
            return null;
        }
        return C391579tJ.OPEN_CAMERA;
    }

    public final String Ao9() {
        C361278fx r0;
        C293505kq r02;
        ClipsCreationDraftViewModel clipsCreationDraftViewModel = this.A1s;
        C2801950r r3 = this.A1t;
        String str = (String) clipsCreationDraftViewModel.A07.A02();
        if (str == null) {
            AnonymousClass2Fj r2 = clipsCreationDraftViewModel.A0H.A02;
            C361278fx r03 = (C361278fx) r2.A02();
            if (r03 == null || r03.A00 != 3 || (r0 = (C361278fx) r2.A02()) == null || (r02 = (C293505kq) r0.A00()) == null || (str = r02.A0T) == null) {
                return ClipsCreationDraftViewModel.A08(clipsCreationDraftViewModel, r3, (PendingRecipient) null);
            }
        }
        return str;
    }

    public final AnonymousClass8IY AuT() {
        return this.A0G;
    }

    public final String BUn() {
        return this.A1y.BUn();
    }

    public final AudioOverlayTrack Bru() {
        return this.A0N;
    }

    public final boolean CKE() {
        if (this.A1l.A02().A03.size() <= 1) {
            return false;
        }
        return true;
    }

    public final boolean CKX() {
        if (this.A1k.A03.A04 == null) {
            return !this.A0J.A01.isEmpty();
        }
        AnonymousClass831 r4 = (AnonymousClass831) this.A2P.A00.A02();
        if (r4 == null) {
            return false;
        }
        Iterator it = r4.A05().iterator();
        boolean z = true;
        while (it.hasNext()) {
            AnonymousClass51N r1 = (AnonymousClass51N) it.next();
            if (!(r1 instanceof AnonymousClass51M) || !((AnonymousClass51M) r1).A0O) {
                z = false;
            }
        }
        if (r4.A01.isEmpty() || z) {
            return false;
        }
        return true;
    }

    public final boolean CTi() {
        AnonymousClass51M r1;
        AnonymousClass51R r0;
        AnonymousClass51O A042 = this.A0J.A04(0);
        if (A042 instanceof AnonymousClass51M) {
            r1 = (AnonymousClass51M) A042;
        } else {
            r1 = null;
        }
        if (this.A0J.A01.isEmpty() || r1 == null || (r0 = r1.A0F) == null || r0.A08 != 0) {
            return false;
        }
        return true;
    }

    public final int CUu() {
        AnonymousClass8IY r2 = this.A0G;
        if (r2.A01 == AnonymousClass8IX.CAMERA_IDLE && r2.A00 != AnonymousClass8IW.COMPLETE && this.A00 == -1 && this.A0T == null) {
            return 1;
        }
        return 2;
    }

    public final boolean CVJ() {
        if (this.A1k.A03.A04 != null) {
            return true;
        }
        return false;
    }

    public final boolean CYO() {
        AnonymousClass9QZ r0 = this.A0u;
        if (r0 == null || !r0.A00) {
            return false;
        }
        return true;
    }

    public final boolean CYQ() {
        return this.A0h;
    }

    public final boolean Caz() {
        C59767JXi jXi = this.A0F;
        if (jXi == null || !jXi.A0H) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cb, code lost:
        if (r3 != (r0.A02 - r0.A03)) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00fc, code lost:
        if (r1 != false) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0107, code lost:
        if (r0 == false) goto L_0x002f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00e4 A[EDGE_INSN: B:80:0x00e4->B:55:0x00e4 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CnU(java.lang.Runnable r9) {
        /*
            r8 = this;
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r5 = r8.A1n
            X.2Fj r2 = r5.A0I
            java.lang.Object r7 = r2.A02()
            com.instagram.common.session.UserSession r6 = r8.A1D
            r4 = 0
            X.0Tu r3 = X.0Tu.A05
            r0 = 36321550579869187(0x810a4200012603, double:3.033233069629649E-306)
            boolean r0 = X.182.A06(r3, r6, r0)
            if (r0 != 0) goto L_0x0027
            X.0Tu r3 = X.AnonymousClass7TF.A0H(r6)
            r0 = 36321550580327946(0x810a420008260a, double:3.03323306991977E-306)
            boolean r0 = X.182.A06(r3, r6, r0)
            if (r0 == 0) goto L_0x0059
        L_0x0027:
            boolean r0 = r8.A0g
            if (r0 == 0) goto L_0x0059
            boolean r0 = r8.A28
            if (r0 == 0) goto L_0x0059
        L_0x002f:
            boolean r0 = r8.CTi()
            r2 = r0 ^ 1
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r1 = r8.A1s
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x003e
            r1.A0A()
        L_0x003e:
            A1F(r8, r4, r4, r4)
            r9.run()
            if (r2 == 0) goto L_0x0058
            java.lang.String r0 = "maybe_show_discard_clips_dialog"
            A1A(r8, r0)
            X.8WX r0 = r8.A0B
            if (r0 == 0) goto L_0x0058
            X.8XA r0 = r0.A00()
            if (r0 == 0) goto L_0x0058
            r0.A0O(r4)
        L_0x0058:
            return
        L_0x0059:
            X.831 r0 = r8.A0J
            java.util.List r0 = r0.A01
            int r6 = r0.size()
            r3 = 0
        L_0x0062:
            if (r3 >= r6) goto L_0x0081
            X.831 r0 = r8.A0J
            X.51O r1 = r0.A04(r3)
            X.51N r1 = (X.AnonymousClass51N) r1
            boolean r0 = r1 instanceof X.AnonymousClass51M
            if (r0 == 0) goto L_0x007e
            X.51M r1 = (X.AnonymousClass51M) r1
            X.51R r0 = r1.A0F
            int r0 = r0.A08
            if (r0 != 0) goto L_0x007e
        L_0x0078:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r8.A1e(r0, r9)
            return
        L_0x007e:
            int r3 = r3 + 1
            goto L_0x0062
        L_0x0081:
            boolean r0 = r8.CKX()
            if (r0 == 0) goto L_0x002f
            if (r7 != 0) goto L_0x0078
            X.831 r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel.A00(r5)
            java.util.List r0 = r0.A01
            int r1 = r0.size()
            r0 = 1
            if (r1 > r0) goto L_0x00cd
            X.0Ud r0 = r5.A0c
            java.lang.Object r0 = r0.getValue()
            X.831 r0 = (X.AnonymousClass831) r0
            X.51O r6 = r0.A04(r4)
            boolean r0 = r6 instanceof X.AnonymousClass51M
            if (r0 == 0) goto L_0x0121
            X.51M r6 = (X.AnonymousClass51M) r6
            if (r6 == 0) goto L_0x0121
            java.lang.String r0 = r6.A0M
            if (r0 != 0) goto L_0x00cd
            java.lang.String r0 = r6.A0L
            if (r0 != 0) goto L_0x00cd
            X.9Hy r0 = r6.A0A
            if (r0 != 0) goto L_0x00cd
            float r1 = r6.A00
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x00cd
            int r0 = r6.A09
            if (r0 != 0) goto L_0x00cd
            int r3 = r6.A08
            X.51R r0 = r6.A0F
            int r1 = r0.A02
            int r0 = r0.A03
            int r1 = r1 - r0
            if (r3 == r1) goto L_0x0121
        L_0x00cd:
            r6 = 1
        L_0x00ce:
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r5 = r5.A0K
            X.0Ud r0 = r5.A0V
            java.lang.Object r1 = r0.getValue()
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x00e4
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x010b
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x010b
        L_0x00e4:
            r3 = 0
        L_0x00e5:
            java.lang.Object r0 = r2.A02()
            r2 = 0
            if (r0 == 0) goto L_0x00ed
            r2 = 1
        L_0x00ed:
            X.0Ud r0 = r5.A0X
            java.lang.Object r0 = r0.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x00fe
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x00ff
        L_0x00fe:
            r0 = 1
        L_0x00ff:
            r0 = r0 ^ 1
            if (r6 != 0) goto L_0x0078
            if (r3 != 0) goto L_0x0078
            if (r2 != 0) goto L_0x0078
            if (r0 == 0) goto L_0x002f
            goto L_0x0078
        L_0x010b:
            java.util.Iterator r1 = r1.iterator()
        L_0x010f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00e4
            java.lang.Object r0 = r1.next()
            X.8fx r0 = (X.C361278fx) r0
            java.lang.Object r0 = r0.A01
            if (r0 == 0) goto L_0x010f
            r3 = 1
            goto L_0x00e5
        L_0x0121:
            r6 = 0
            goto L_0x00ce
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C353498Hw.CnU(java.lang.Runnable):void");
    }

    public final void Csr(ARAudioEffectData aRAudioEffectData) {
        DownloadedTrack downloadedTrack;
        AudioOverlayTrack audioOverlayTrack = this.A0N;
        Integer num = null;
        if (audioOverlayTrack != null) {
            downloadedTrack = audioOverlayTrack.A06;
        } else {
            downloadedTrack = null;
        }
        AnonymousClass82X r1 = this.A1C;
        if (downloadedTrack != null) {
            num = Integer.valueOf(downloadedTrack.A01);
        }
        r1.A00 = aRAudioEffectData;
        AnonymousClass82X.A00(r1, num);
    }

    public final void D0E() {
        Integer A002;
        AnonymousClass9QZ r1 = this.A0u;
        if (!(r1 == null || (A002 = C59762JXa.A00(r1.A04)) == null)) {
            AnonymousClass9QZ.A01(r1, A002);
        }
        this.A0Y = true;
    }

    public final void DCN() {
        this.A2V.A0y(this.A2U);
    }

    public final void DDR() {
        AnonymousClass85M r2 = this.A1d;
        FrameLayout frameLayout = r2.A00;
        if (frameLayout != null) {
            ViewParent parent = frameLayout.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(r2.A00);
            }
            r2.A00 = null;
            A0m(this);
        }
        A1C(this, true);
        A0m(this);
        this.A2V.A0z(this.A2U);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        if (A1Z(r8) != false) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DDZ(int r9) {
        /*
            r8 = this;
            X.9QR r0 = r8.A0E
            if (r0 != 0) goto L_0x0011
            android.content.Context r3 = r8.A11
            java.lang.Integer r2 = X.AnonymousClass05K.A15
            java.lang.String r1 = "ViewHolder is null"
            r0 = 2131974093(0x7f1357cd, float:1.958524E38)
            X.C64169LRs.A02(r3, r2, r1, r0)
        L_0x0010:
            return
        L_0x0011:
            r0 = -1
            r4 = 1
            r5 = 0
            r7 = 1
            if (r9 == r0) goto L_0x002e
            r7 = 0
            X.84v r0 = r8.A2K
            if (r0 == 0) goto L_0x002e
            X.05G r1 = r0.A0b
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r1.Epw(r0)
            X.8AL r0 = r8.A2I
            r0.A08 = r4
            X.8aL r0 = X.C358088aL.A0E
            A0N(r0, r8, r5)
        L_0x002e:
            r8.A0i = r5
            if (r7 == 0) goto L_0x0033
            r9 = -1
        L_0x0033:
            r8.A00 = r9
            X.8JE r3 = r8.A1X
            if (r7 != 0) goto L_0x0040
            boolean r0 = A1Z(r8)
            r6 = 1
            if (r0 == 0) goto L_0x0041
        L_0x0040:
            r6 = 0
        L_0x0041:
            com.instagram.music.common.model.AudioOverlayTrack r0 = r3.A03
            if (r0 == 0) goto L_0x0085
            X.7zI r1 = X.AnonymousClass8JE.A01(r3)
            boolean r0 = r1.A00
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00ee
            X.4MM r0 = r1.A05
            X.4Ms r0 = r0.A09
            X.4Mt r0 = r0.A0I
            boolean r0 = r0.A0J()
            if (r0 == 0) goto L_0x0080
            X.7zI r1 = X.AnonymousClass8JE.A01(r3)
            boolean r0 = r1.A00
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00e6
            X.4MM r0 = r1.A05
            r0.pause()
            X.9QI r0 = r1.A04
            r0.A00()
            X.9QK r2 = r1.A02
            r2.A01 = r5
            X.82X r1 = r2.A00
            if (r1 == 0) goto L_0x007b
            r0 = 0
            r1.A05(r0)
        L_0x007b:
            java.util.Queue r0 = r2.A03
            r0.clear()
        L_0x0080:
            if (r6 != 0) goto L_0x0085
            X.AnonymousClass8JE.A03(r3, r5)
        L_0x0085:
            X.Mgi r0 = r8.A0t
            if (r0 == 0) goto L_0x008c
            r0.A04()
        L_0x008c:
            A0m(r8)
            if (r7 != 0) goto L_0x00a2
            X.85L r2 = r8.A1e
            android.view.View r1 = r2.A00
            if (r1 == 0) goto L_0x00de
            r1.setVisibility(r5)
            X.ANR r0 = new X.ANR
            r0.<init>(r1, r2)
            X.AnonymousClass0fU.A00(r0, r1)
        L_0x00a2:
            X.8JB r0 = r8.A2W
            android.os.Handler r0 = r0.A02
            r2 = 0
            r0.removeCallbacksAndMessages(r2)
            X.9QR r0 = r8.A0E
            if (r0 == 0) goto L_0x00b7
            android.widget.TextView r0 = r0.A04
            android.view.View[] r0 = new android.view.View[]{r0}
            X.C294975nL.A05(r0, r4)
        L_0x00b7:
            A1B(r8, r4)
            X.88F r1 = r8.A1w
            if (r1 == 0) goto L_0x00db
            boolean r0 = r1.A0W
            if (r0 != r4) goto L_0x00db
            X.87i r0 = r1.A0G
        L_0x00c4:
            X.87n r1 = r0.A0P
            java.lang.String r0 = "user_paused_video"
            r1.A04(r0)
            com.instagram.music.common.model.AudioOverlayTrack r1 = r8.A0O
            if (r1 == 0) goto L_0x0010
            X.885 r0 = r8.A1m
            X.886 r0 = r0.A00()
            r3.A05(r0, r1)
            r8.A0O = r2
            return
        L_0x00db:
            X.87i r0 = r8.A2F
            goto L_0x00c4
        L_0x00de:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00e6:
            java.lang.String r1 = "Check failed."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00ee:
            java.lang.String r1 = "Check failed."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C353498Hw.DDZ(int):void");
    }

    public final void DGF(C265674Vs r2) {
        this.A0r = r2;
        A0l(this);
        C67010Mgi mgi = this.A0t;
        if (mgi != null) {
            mgi.A03 = r2;
            mgi.A03();
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.7kX, java.lang.Object, X.804] */
    public final void DHC() {
        AnonymousClass88E r0 = this.A1i;
        if (r0 != null) {
            AnonymousClass81C r2 = r0.A00;
            if (r2.A00() != null) {
                boolean A1N2 = A1N();
                ((C40375Ab8) r2.A00()).A02(A1N2);
                if (A1N2) {
                    C339997kW r1 = C339997kW.A04;
                    ? obj = new Object();
                    obj.A00 = r1;
                    ((C40375Ab8) r2.A00()).A01(obj);
                }
            }
        }
    }

    public final boolean DHN() {
        C353538Ia r0;
        AnonymousClass0eM r2 = this.A27;
        if (((C3511387s) r2.getValue()).A0L() && ((C3511387s) r2.getValue()).A0K()) {
            r0 = C387819mp.A00;
        } else if (A1g() && !A1M()) {
            r0 = new C366388oq(true);
        } else if (A05(this) != null && !A1M()) {
            r0 = C379279Tf.A00;
        } else if (!A1X(this)) {
            return false;
        } else {
            r0 = new C366378op(true);
        }
        A0P(r0, this);
        return true;
    }

    public final void DHQ() {
        C353538Ia r1;
        AnonymousClass0eM r12 = this.A27;
        if (((C3511387s) r12.getValue()).A0L() && ((C3511387s) r12.getValue()).A0K()) {
            r1 = C387819mp.A00;
        } else if (A1g() && !A1M()) {
            r1 = new C366388oq(false);
        } else if (A05(this) != null && !A1M()) {
            r1 = C379279Tf.A00;
        } else if (A1X(this)) {
            r1 = new C366378op(false);
        } else {
            return;
        }
        A0P(r1, this);
    }

    public final void DHR() {
        Bundle bundle = new Bundle();
        bundle.putBoolean(C273654mx.A00(40), true);
        bundle.putBoolean(AnonymousClass000.A00(889), true);
        bundle.putBoolean(AnonymousClass000.A00(2165), true);
        UserSession userSession = this.A1D;
        if (182.A06(0Tu.A06, userSession, 36328237844872305L)) {
            bundle.putBoolean(AnonymousClass000.A00(1113), true);
            bundle.putBoolean(AnonymousClass000.A00(2163), false);
        }
        bundle.putParcelable(AnonymousClass000.A00(1876), this.A1L.A02.A01.A0i);
        FragmentActivity activity = this.A1B.getActivity();
        if (activity != null && !activity.isFinishing()) {
            AnonymousClass6W8 r2 = new AnonymousClass6W8(activity, bundle, userSession, TransparentModalActivity.class, C273654mx.A00(2163));
            r2.A08();
            r2.A0C(this.A11);
        }
    }

    public final void DHT() {
        Dc2 dc2 = this.A0M;
        if (dc2 != null) {
            1xC.A01.A00(new AnonymousClass3GR(dc2));
            this.A0M = null;
        }
    }

    public final void DHV() {
        Dc2 dc2 = this.A0M;
        if (dc2 != null) {
            1xC.A01.A00(new AnonymousClass3GR(dc2));
            this.A0M = null;
        }
        A0w(this, (AnonymousClass8I4) this.A1j.A04.getValue());
    }

    public final void DT3(boolean z) {
        this.A1V.A00().setEnabled(!z);
        this.A0k = z;
        AnonymousClass9QR r0 = this.A0E;
        if (r0 != null) {
            View[] viewArr = {r0.A00};
            if (z) {
                C294975nL.A05(viewArr, true);
            } else {
                C294975nL.A04((C295005nO) null, viewArr, true);
            }
        }
        if (!this.A1q.A0B) {
            A1B(this, false);
        }
        A0m(this);
    }

    public final void DdE() {
        AnonymousClass88F r2 = this.A1w;
        if (r2 != null) {
            Object value = r2.A0T.getValue();
            0qQ.A07(value);
            if (((Boolean) value).booleanValue()) {
                r2.A08((AnonymousClass88C) this.A1x.A06.A02());
            }
        }
    }

    public final void Dmj() {
        C353278Gz r3;
        if (this.A0E == null) {
            0kD.A07("ClipsCaptureControllerImpl", "view holder should not be null if on CLIPS format", (Throwable) null);
            return;
        }
        if (A1Z(this) && (r3 = this.A0C) != null) {
            C381799cL r1 = C381799cL.A03;
            0qQ.A0B(r1, 0);
            r3.A03.A0A(r1);
            r3.A01(true);
        }
        this.A0i = true;
        this.A00 = -1;
        AudioOverlayTrack audioOverlayTrack = this.A0N;
        if (audioOverlayTrack != null && audioOverlayTrack.A01 == 0) {
            AnonymousClass8JE r5 = this.A1X;
            C353498Hw r12 = r5.A08.A00;
            if (r12.A02 == -1 && !r12.A1F.A0V(C358088aL.A0J)) {
                if (r5.A03 != null || r5.A04) {
                    29H r32 = 27p.A01(r5.A07).A03;
                    boolean z = false;
                    if (r5.A03 != null) {
                        z = true;
                    }
                    r32.A0I(z, r5.A04);
                }
                AudioOverlayTrack audioOverlayTrack2 = r5.A03;
                if (audioOverlayTrack2 != null) {
                    OriginalAudioSubtype originalAudioSubtype = null;
                    if (r5.A00 < 0) {
                        29H r33 = 27p.A01(r5.A07).A03;
                        r33.A04 = r33.A0E.A07("player not at the expected position", "", 17645025, r33.A04);
                        0kD.A07("BackingTrackPlayerController", "player not at the expected position", (Throwable) null);
                    } else {
                        MusicAssetModel musicAssetModel = audioOverlayTrack2.A08;
                        if (musicAssetModel != null) {
                            originalAudioSubtype = musicAssetModel.A01;
                        }
                        if (originalAudioSubtype != OriginalAudioSubtype.A06 && AnonymousClass8IK.A00(r5.A07)) {
                            C348937zI A012 = AnonymousClass8JE.A01(r5);
                            if (!A012.A00) {
                                A012.A05.Ech(true);
                            } else {
                                throw new IllegalStateException("Check failed.");
                            }
                        }
                        C348937zI A013 = AnonymousClass8JE.A01(r5);
                        C234482xw r34 = A013.A03;
                        r34.A06(false);
                        if (!A013.A00) {
                            A013.A04.A00();
                            AnonymousClass9QK r13 = A013.A02;
                            r13.A01 = true;
                            r13.A03.clear();
                            AnonymousClass82X r0 = r13.A00;
                            if (r0 != null) {
                                r0.A05(r13);
                            }
                            A013.A05.start();
                            r34.A01();
                            r5.A00 = AnonymousClass972.MUTABLE_FLAG_MASK;
                        } else {
                            throw new IllegalStateException("Check failed.");
                        }
                    }
                }
            }
        }
        A1B(this, true);
        A0m(this);
        A0W(this);
        this.A2W.A02.sendMessage(Message.obtain());
    }

    public final void DxF() {
        boolean z = false;
        if (this.A00 != -1) {
            z = true;
        }
        if (!z) {
            0kD.A07("ClipsCaptureControllerImpl", "bad onVideoCapturedFromCameraDropped() call", (Throwable) null);
        } else {
            A0F();
        }
    }

    public final void Dy3() {
        String str;
        if (!this.A0l) {
            str = "got onVideoRecordingError() call when not showing";
        } else if (this.A0E == null) {
            str = "view holder should not be null if on CLIPS format";
        } else if (this.A00 != -1) {
            A0F();
            return;
        } else {
            A0a(this);
            return;
        }
        0kD.A07("ClipsCaptureControllerImpl", str, (Throwable) null);
    }

    public final void Dy5(float f) {
        if (this.A0E == null) {
            0kD.A07("ClipsCaptureControllerImpl", "view holder should not be null if on CLIPS format", (Throwable) null);
        }
    }

    public final List E2P() {
        boolean z;
        List list;
        C59721JVf jVf = this.A08;
        boolean z2 = this.A0o;
        String name = this.A16.name();
        C293505kq A092 = this.A1s.A09(Ao9());
        boolean A062 = 182.A06(0Tu.A05, this.A1D, 36325716698084515L);
        0qQ.A0B(name, 2);
        if (!A062 ? jVf == null || z2 || !"CLIPS_DIRECT_SHARED_ALBUM_CREATE_REEL_BUTTON".equals(name) : z2 || "CLIPS_DIRECT_STACK_TO_CLIPS_CREATE_BUTTON".equals(name)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (A092 != null && (list = A092.A0q) != null && !list.isEmpty()) {
                return list;
            }
            if (jVf != null) {
                return (List) jVf.A01;
            }
        }
        return null;
    }

    public final void E4M(AnonymousClass3QO r4) {
        ClipsCreationDraftViewModel clipsCreationDraftViewModel = this.A1s;
        if (ClipsCreationDraftViewModel.A00(clipsCreationDraftViewModel) != null) {
            C59765JXe jXe = new C59765JXe();
            jXe.A00 = new C59764JXc(r4);
            C293505kq A002 = ClipsCreationDraftViewModel.A00(clipsCreationDraftViewModel);
            if (A002 != null) {
                clipsCreationDraftViewModel.A0H.A0N(jXe.A01(A002));
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        clipsCreationDraftViewModel.A01 = r4;
    }

    public final void EIn(Bundle bundle) {
        Serializable serializable;
        UserSession userSession = this.A1D;
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36322306494244923L) && 182.A06(r2, userSession, 36322306494310460L)) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = bundle.getSerializable("SAVE_INSTANCE_KEY_LAST_CAMERA_STATE", AnonymousClass80V.class);
            } else {
                serializable = bundle.getSerializable("SAVE_INSTANCE_KEY_LAST_CAMERA_STATE");
            }
            if (serializable == AnonymousClass80V.CLIPS_EDITOR) {
                Cni(C387889mw.A00);
            }
        }
    }

    public final void EK7(C366678pU r3) {
        boolean isEmpty = this.A0K.A01.isEmpty();
        ClipsCreationViewModel clipsCreationViewModel = this.A1n;
        if (isEmpty) {
            clipsCreationViewModel.A0I.A0B((Object) null);
        } else {
            clipsCreationViewModel.A0I.A0B(r3);
        }
    }

    public final void EgF(List list) {
        this.A0V = list;
        A0S(this);
    }

    public final void EkX(boolean z) {
        this.A10 = z;
        if (this.A0E != null) {
            A1K(false);
        }
    }

    public final boolean FMp() {
        return this.A0x;
    }

    public final boolean onBackPressed() {
        Integer num;
        AnonymousClass8JI r1;
        C353538Ia r0;
        AnonymousClass85M r2 = this.A1d;
        FrameLayout frameLayout = r2.A00;
        if (frameLayout != null) {
            ViewParent parent = frameLayout.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(r2.A00);
            }
            r2.A00 = null;
            A0m(this);
        }
        boolean z = false;
        if (this.A0T != null) {
            z = true;
        }
        if (z) {
            AnonymousClass88V.A00(this.A1o);
            A0r(this);
            C59689JTv.A07(this.A11, 2131955480);
            C59767JXi jXi = this.A0F;
            if (jXi != null) {
                jXi.A0H();
            }
            C59767JXi jXi2 = this.A0F;
            if (jXi2 != null) {
                jXi2.A0F();
            }
            this.A2T.A03();
        } else if ((A1g() || A05(this) != null) && !A1Z(this)) {
            C59767JXi jXi3 = this.A0F;
            if (jXi3 == null || !jXi3.A0H) {
                A0d(this);
                return true;
            }
            jXi3.onBackPressed();
            return true;
        } else {
            if (A1X(this)) {
                r0 = new C366378op(true);
            } else {
                C59767JXi jXi4 = this.A0F;
                if (jXi4 != null && jXi4.onBackPressed()) {
                    return true;
                }
                C353638Im r02 = this.A0P;
                if (r02 == null) {
                    0qQ.A0F("trackDownloader");
                    throw AnonymousClass00P.createAndThrow();
                } else if (!r02.A00) {
                    if (this.A00 != -1) {
                        C59689JTv.A01(this.A11, (String) null, 2131955614, 0);
                        return true;
                    } else if (!this.A0g || this.A01 != 0 || !CKX()) {
                        if (!CKX() || this.A0J.A01.size() != 1 || this.A0E == null) {
                            if (CKX()) {
                                A1d(this.A0J.A01.size() - 1, true);
                                return true;
                            }
                            UserSession userSession = this.A1D;
                            AnonymousClass88B r22 = this.A1x;
                            C3498982i r03 = r22.A00;
                            if (r03 != null) {
                                r1 = r03.A00;
                            } else {
                                r1 = null;
                            }
                            if (r1 == AnonymousClass8JI.REMIX) {
                                File file = r22.A01;
                                if (r22.A06.A02() == AnonymousClass88C.SUCCESS && file != null) {
                                    this.A1F.A0N(C358088aL.A0j, 3);
                                    A0L(C282665Eg.A03(file, 3, 0), this, AnonymousClass05K.A0N, false);
                                    r0 = C365808ni.A00;
                                }
                            } else if (!A1T(this) || !(this.A1F.A08.A00 instanceof AnonymousClass80O) || ((Number) this.A1S.A0F.getValue()).intValue() < 2 || CVJ() || !182.A06(0Tu.A05, userSession, 36321550579803650L)) {
                                return false;
                            } else {
                                num = AnonymousClass05K.A01;
                            }
                        } else if (this.A1x.A02()) {
                            this.A1s.A0A();
                            A1F(this, false, false, false);
                            this.A1B.requireActivity().finish();
                            return true;
                        } else {
                            num = AnonymousClass05K.A00;
                        }
                        A1e(num, (Runnable) null);
                        return true;
                    } else {
                        Cni(C387809mo.A00);
                        return true;
                    }
                }
            }
            A0P(r0, this);
            return true;
        }
        return true;
    }

    public final void onDestroyView() {
        if (this.A1P.A2j != null) {
            14i.A06(this.A1a);
        }
        this.A1X.A04();
        14i.A06(this.A1Z);
    }

    public static final int A01(C353498Hw r2) {
        if (!A1Y(r2) || r2.A1F.A0V(C358088aL.A0J)) {
            return A02(r2);
        }
        int i = r2.A02;
        if (i == -1) {
            return r2.A03;
        }
        return i;
    }

    public static final int A02(C353498Hw r2) {
        return A00(r2) - C348947zL.A01(r2.A0J);
    }

    private final C353538Ia A04() {
        if (A1g()) {
            return new C366388oq(false);
        }
        if (A05(this) != null) {
            return C379279Tf.A00;
        }
        if (A1X(this)) {
            return new C366378op(false);
        }
        return C387859mt.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004d, code lost:
        if (A1W(r3) != false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0060, code lost:
        if (r2.A07 == false) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A0D() {
        /*
            r3 = this;
            A0U(r3)
            A0X(r3)
            A0S(r3)
            A0Y(r3)
            A0Z(r3)
            X.88B r0 = r3.A1x
            X.82i r0 = r0.A00
            if (r0 == 0) goto L_0x007c
            X.8JI r2 = r0.A00
        L_0x0017:
            X.8JI r1 = X.AnonymousClass8JI.REMIX
            r0 = 0
            if (r2 != r1) goto L_0x001d
            r0 = 1
        L_0x001d:
            r2 = 0
            X.8aL r1 = X.C358088aL.A0j
            if (r0 == 0) goto L_0x0072
            boolean r0 = A1W(r3)
            A0N(r1, r3, r0)
            X.8aL r0 = X.C358088aL.A0k
        L_0x002b:
            A0N(r0, r3, r2)
            X.8aL r1 = X.C358088aL.A0F
            boolean r0 = A1S(r3)
            A0N(r1, r3, r0)
            A0V(r3)
            X.8aL r2 = X.C358088aL.A0J
            X.8Fj r0 = r3.A1V
            X.B2u r0 = r0.A00()
            boolean r0 = r0.CaO()
            if (r0 == 0) goto L_0x004f
            boolean r1 = A1W(r3)
            r0 = 1
            if (r1 == 0) goto L_0x0050
        L_0x004f:
            r0 = 0
        L_0x0050:
            A0N(r2, r3, r0)
            X.825 r2 = r3.A1u
            boolean r0 = A1W(r3)
            r2.A02 = r0
            if (r0 != 0) goto L_0x0062
            boolean r0 = r2.A07
            r1 = 1
            if (r0 != 0) goto L_0x0063
        L_0x0062:
            r1 = 0
        L_0x0063:
            r2.A01 = r1
            boolean r0 = r2.A07
            r2.A03 = r0
            if (r1 != 0) goto L_0x0071
            X.8aL r1 = X.C358088aL.A0K
            r0 = 0
            A0N(r1, r3, r0)
        L_0x0071:
            return
        L_0x0072:
            A0N(r1, r3, r2)
            X.8aL r0 = X.C358088aL.A0k
            boolean r2 = A1W(r3)
            goto L_0x002b
        L_0x007c:
            r2 = 0
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C353498Hw.A0D():void");
    }

    public static final void A0O(C353538Ia r4, C353498Hw r5) {
        if (r5.A1f()) {
            new A78(r5.A1B, r5.A1D, new A5B(r4, r5));
            return;
        }
        if (r4 instanceof C367128qE) {
            AnonymousClass8A2 r1 = r5.A1h;
            1QP r0 = r1.A0J;
            long j = r1.A02;
            AE4 ae4 = new AE4(r0);
            ae4.A01 = j;
            ae4.A04("AUDIO_TRACK_DOWNLOAD_FINISH");
        }
        A0P(r4, r5);
    }

    public static final void A0R(C353498Hw r10) {
        AudioOverlayTrack audioOverlayTrack;
        if (r10.A1O() && (audioOverlayTrack = r10.A0N) != null) {
            AnonymousClass8A2 r3 = r10.A1h;
            String A0R2 = 002.A0R(r10.A16.name(), "_new_max_duration");
            UserSession userSession = r10.A1D;
            r3.A08(r10.A1W.Ats(), A0R2, String.valueOf(27p.A01(userSession).A0J()), 27p.A01(userSession).A04.A0L, (String) null, false);
            A12(r10, audioOverlayTrack, false);
        }
        C3495880y r1 = r10.A0I;
        if (r1 != null) {
            r10.A1v.A05.A0B(r1);
            A0T(r10);
            A0U(r10);
            A0v(r10, A02(r10) / IgNetworkConsentStorage.MAX_ENTRIES);
            C301725zr r32 = r10.A22.A0h;
            int i = r1.A01;
            r32.A01 = (int) (((float) i) * r10.A1m.A00().A00);
        }
    }

    public static final void A0d(C353498Hw r4) {
        AnonymousClass8XA A002;
        C353538Ia r1;
        if (r4.A1M()) {
            27p.A01(r4.A1D).A0J.A06(r4.A1t, "postcap_cancel_simplified_add_clip_flow", r4.A0J.A01.size());
            if (A05(r4) != null) {
                r1 = C379279Tf.A00;
            } else {
                r1 = new C366388oq(true);
            }
            A0P(r1, r4);
            return;
        }
        A1A(r4, "handle_cancel_add_clip_flow");
        AnonymousClass8WX r0 = r4.A0B;
        if (r0 != null && (A002 = r0.A00()) != null) {
            A002.A0O(false);
        }
    }

    public static final void A0f(C353498Hw r8) {
        if (!A1Q(r8)) {
            27p.A01(r8.A1D);
            C353528Hz r5 = r8.A2M;
            A1Y(r8);
            int A012 = C348947zL.A01(r8.A0J);
            int A013 = A01(r8);
            AudioOverlayTrack audioOverlayTrack = r8.A0N;
            if (r5.A02.mFragmentManager != null) {
                UserSession userSession = r5.A03;
                Bundle bundle = new Bundle();
                bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05);
                bundle.putInt(AnonymousClass000.A00(3845), A012);
                bundle.putInt(AnonymousClass000.A00(3629), A013);
                bundle.putParcelable(AnonymousClass000.A00(2812), audioOverlayTrack);
                C61430K7f k7f = new C61430K7f();
                k7f.setArguments(bundle);
                k7f.A03 = r5.A04;
                k7f.A02 = r5.A00;
                C331127Pr r2 = new C331127Pr(userSession);
                Context context = r5.A01;
                r2.A0d = context.getString(2131955426);
                r2.A0T = k7f;
                r2.A00().A0D(context, k7f);
            }
        }
    }

    public static final void A0m(C353498Hw r6) {
        AnonymousClass8IW r3;
        AnonymousClass8IX r0;
        if (A02(r6) <= 100) {
            r3 = AnonymousClass8IW.COMPLETE;
        } else if (A1R(r6)) {
            r3 = AnonymousClass8IW.PARTIAL;
        } else {
            r3 = AnonymousClass8IW.EMPTY;
        }
        if (r6.CYO()) {
            r0 = AnonymousClass8IX.NUX_SHOWING;
        } else {
            C67010Mgi mgi = r6.A0t;
            if (mgi != null && mgi.A02 != null) {
                r0 = AnonymousClass8IX.COUNTDOWN_ACTIVE;
            } else if (r6.A0i) {
                r0 = AnonymousClass8IX.RECORDING;
            } else if (r6.A0k) {
                r0 = AnonymousClass8IX.SELECTING_MUSIC;
            } else {
                C59767JXi jXi = r6.A0F;
                if (jXi == null || !jXi.A0H) {
                    2Fk r2 = r6.A1k.A03.A0H;
                    if (!(r2.A02() == AnonymousClass8YK.EMPTY_TIMELINE || r2.A02() == AnonymousClass8YK.LANDING_PAGE)) {
                        if (r6.A1d.A00 != null) {
                            r0 = AnonymousClass8IX.BLOCKED_TOAST;
                        } else {
                            r0 = AnonymousClass8IX.CAMERA_IDLE;
                        }
                    }
                }
                r0 = AnonymousClass8IX.CLIPS_REVIEW;
            }
        }
        AnonymousClass8IY r4 = new AnonymousClass8IY(r3, r0);
        if (!r4.equals(r6.A0G)) {
            r6.A0G = r4;
            AnonymousClass80R r32 = r6.A1Q.A00;
            C355948Rz r62 = r32.A0d;
            if (r62 != null) {
                int ordinal = r4.A01.ordinal();
                if (ordinal == 0) {
                    boolean z = !C357308Xj.A00(r62.A0A, r62.A0H, r62.A0O);
                    AnonymousClass8AL r02 = r62.A0G;
                    if (z) {
                        r02.A0C(true);
                    } else {
                        r02.A0B(true);
                    }
                    r62.A0K.A00().Eu6(false);
                    C355948Rz.A06(r62);
                } else if (ordinal == 3 || ordinal == 4) {
                    C355948Rz.A04(r62);
                    r62.A0K.A00().CLF(false);
                } else if (ordinal == 5) {
                    C355948Rz.A04(r62);
                    r62.A0G.A0B(true);
                }
            }
            AnonymousClass85X r03 = r32.A0n;
            r03.A07 = r4;
            AnonymousClass85X.A06(r03);
            C314676if r5 = r32.A0e.A1g;
            if (r5.A03) {
                AnonymousClass8ME r22 = (AnonymousClass8ME) r5.get();
                if (r22.A05 != C3493880e.A00) {
                    List list = r22.A1r;
                    if (list != null && !list.isEmpty()) {
                        if (182.A06(0Tu.A05, r22.A0r, 36317874088121980L)) {
                            return;
                        }
                    }
                    AnonymousClass8IX r23 = r4.A01;
                    AnonymousClass8IX r1 = AnonymousClass8IX.RECORDING;
                    AnonymousClass8ME r33 = (AnonymousClass8ME) r5.get();
                    Iterator it = r33.A1q.iterator();
                    if (r23 == r1) {
                        while (it.hasNext()) {
                            Drawable drawable = (Drawable) it.next();
                            if ((!AnonymousClass3S1.A04(r33.A1r)) || r33.A1v) {
                                r33.A0y.A1W.A00().EyM();
                                drawable.setVisible(false, false);
                            } else {
                                r33.A1m.A0i(drawable);
                            }
                        }
                        return;
                    }
                    while (it.hasNext()) {
                        Drawable drawable2 = (Drawable) it.next();
                        if ((!AnonymousClass3S1.A04(r33.A1r)) || r33.A1v) {
                            AnonymousClass8BA r12 = r33.A0y;
                            if (((AnonymousClass8ME) r12.A1g.get()).A1R()) {
                                r12.A1W.A00().Exh();
                            }
                            drawable2.setVisible(true, false);
                        } else {
                            r33.A1m.A0l(drawable2);
                        }
                    }
                }
            }
        }
    }

    public static final void A11(C353498Hw r2, AudioOverlayTrack audioOverlayTrack, boolean z) {
        r2.A1I(audioOverlayTrack, z);
        A0X(r2);
        A0T(r2);
        if (audioOverlayTrack.A01()) {
            r2.A1X.A05(r2.A1m.A00(), audioOverlayTrack);
        } else {
            A12(r2, audioOverlayTrack, false);
        }
        A0v(r2, A02(r2) / IgNetworkConsentStorage.MAX_ENTRIES);
        A0U(r2);
    }

    public static final void A18(C353498Hw r12, Runnable runnable) {
        String Ao9 = r12.Ao9();
        UserSession userSession = r12.A1D;
        27p.A01(userSession).A1D(C371088xY.DIALOG, (C59725JVj) null, Ao9, (String) null, (String) null, (String) null, false);
        C394779yg.A00(userSession).A01(C390939s5.SAVED_DRAFT);
        r12.A1h.A0P(true, false);
        AnonymousClass8ZP r5 = r12.A2O;
        1QP r4 = r5.A02;
        r4.flowMarkPoint(r5.A01, AnonymousClass000.A00(2416));
        r4.flowEndSuccess(r5.A01);
        r5.A01 = 0;
        27p.A01(userSession);
        A0B(r12);
        ClipsCreationDraftViewModel clipsCreationDraftViewModel = r12.A1s;
        C66312MMv mMv = new C66312MMv(42, runnable, r12);
        C318136oS A002 = C318116oQ.A00(clipsCreationDraftViewModel);
        1Eo.A05(19B.A00, new C59673JTe(mMv, clipsCreationDraftViewModel, (AnonymousClass4D7) null, 6, true), A002);
        r12.A0c = false;
        0qQ.A0B(r12.A0J, 0);
        0sn r1 = 0sn.A00;
        0qQ.A0B(r1, 0);
        r12.A0J = new AnonymousClass831(r1, false);
        C394779yg.A00(userSession).A00(r12.A1B.requireActivity(), userSession, AnonymousClass05K.A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (A1Z(r5) != false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A1B(X.C353498Hw r5, boolean r6) {
        /*
            A0o(r5)
            boolean r0 = r5.A1L()
            r4 = 0
            if (r0 == 0) goto L_0x0017
            boolean r0 = A1R(r5)
            if (r0 == 0) goto L_0x0017
            boolean r0 = A1Z(r5)
            r3 = 1
            if (r0 == 0) goto L_0x0018
        L_0x0017:
            r3 = 0
        L_0x0018:
            X.81m r1 = r5.A1U
            X.81t r0 = r1.A00()
            android.view.View r2 = r0.Ao7()
            X.81t r0 = r1.A00()
            android.view.View r1 = r0.Anx()
            if (r2 == 0) goto L_0x0042
            if (r1 == 0) goto L_0x0042
            if (r3 == 0) goto L_0x005a
            boolean r0 = r5.A1g()
            if (r0 != 0) goto L_0x005a
            boolean r0 = A1a(r5)
            if (r0 == 0) goto L_0x004a
            X.JXY.A00(r2, r4)
        L_0x003f:
            X.JXY.A00(r1, r6)
        L_0x0042:
            X.9QR r0 = r5.A0E
            if (r0 == 0) goto L_0x0049
            r5.A1K(r6)
        L_0x0049:
            return
        L_0x004a:
            X.5nL r0 = X.C294975nL.A01(r2, r4)
            r0.A0G()
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.setAlpha(r0)
            r2.setVisibility(r4)
            goto L_0x003f
        L_0x005a:
            X.JXY.A00(r2, r6)
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C353498Hw.A1B(X.8Hw, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r3 = r0.intValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A1H(X.AnonymousClass51M r5) {
        /*
            r4 = this;
            java.lang.Integer r0 = r4.A08()
            r1 = 0
            if (r0 == 0) goto L_0x0030
            int r3 = r0.intValue()
            X.831 r0 = r4.A0J
            X.51O r2 = r0.A04(r3)
            if (r2 == 0) goto L_0x0030
            int r1 = r5.A08
            int r0 = r5.A09
            int r1 = r1 - r0
            int r0 = r2.BrP()
            if (r1 <= r0) goto L_0x0020
            r5.A08 = r0
        L_0x0020:
            r2 = 1
            r5.A0S = r2
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = r4.A1n
            X.8d5 r0 = X.C359548d5.VIDEO_CLIP_REPLACE
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel.A03(r0, r1, r2)
            X.836 r0 = r1.A0O
            r0.A01(r5, r3)
            return
        L_0x0030:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r4.A1n
            r0.A0d(r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C353498Hw.A1H(X.51M):void");
    }

    public static final boolean A1Q(C353498Hw r3) {
        boolean z = false;
        if (A02(r3) <= 100) {
            z = true;
        }
        if (z) {
            C59689JTv.A07(r3.A11, 2131955694);
            return true;
        } else if (!r3.A0Y) {
            C59689JTv.A06(r3.A11, 2131955305);
            return true;
        } else {
            r3.D0E();
            return false;
        }
    }

    public static final boolean A1R(C353498Hw r2) {
        if (!r2.CKX() && r2.A00 == -1 && r2.A0T == null) {
            return false;
        }
        return true;
    }

    public static final boolean A1V(C353498Hw r2) {
        if (r2.A1g()) {
            return true;
        }
        A05(r2);
        return false;
    }

    public static final boolean A1W(C353498Hw r2) {
        C3498982i r0;
        if (!A1U(r2) || (r0 = r2.A1x.A00) == null || r0.A00 != AnonymousClass8JI.REMIX || r2.CKX()) {
            return false;
        }
        return true;
    }

    public static final boolean A1b(C353498Hw r5) {
        boolean A1Y2 = A1Y(r5);
        r5.A02 = -1;
        r5.A03 = -1;
        C357638Yz r3 = r5.A1F;
        C358088aL r2 = C358088aL.A0y;
        r3.A0O(r2, C352618Eb.A02(r2));
        return A1Y2;
    }

    public final void A1d(int i, boolean z) {
        if (!CKX()) {
            0kD.A07("ClipsCaptureControllerImpl", "no recorded clips present during deletion", (Throwable) null);
            return;
        }
        27r A012 = 27p.A01(this.A1D);
        C59725JVj jVj = C59725JVj.PRE_CAPTURE;
        long j = (long) i;
        29R r7 = A012.A09;
        1Ln A082 = 1Ln.A08(r7.A01);
        if (A082.A00.isSampled()) {
            A082.A0t(AnonymousClass000.A00(2299));
            A082.A0r(AnonymousClass000.A00(2125));
            29R.A00(A082, r7);
            AnonymousClass283 r6 = r7.A04;
            int i2 = 2;
            if (r6.A01 != 2) {
                i2 = 1;
            }
            A082.A0V(i2);
            A082.A0Q("capture_format_index", -1L);
            A082.A0M(r7.A0I(), "capture_type");
            A082.A0b(r6.A09);
            A082.A0T();
            A082.A0c(28t.A06);
            A082.A0n(27x.A08.getModuleName());
            A082.A0Q("segment_index", Long.valueOf(j));
            A082.A0d(jVj);
            A082.A0a(r7.A0J());
            A082.A0R("discovery_session_id", r6.A0O);
            A082.A0R("search_session_id", r6.A0P);
            A082.A0O("is_timeline", false);
            A082.A0u(AnonymousClass1QI.A00.A02.A00);
            A082.Cgf();
        }
        A0c(this);
        C59767JXi jXi = this.A0F;
        if (jXi != null && jXi.A0H) {
            jXi.A0N.removeCallbacks(jXi.A0g);
            C66567MWv mWv = jXi.A0B;
            if (mWv != null) {
                mWv.pause();
            }
        }
        this.A0p = false;
        C358248ab r2 = new C358248ab(this.A11);
        int i3 = 2131955357;
        if (z) {
            i3 = 2131955363;
        }
        r2.A09(i3);
        int i4 = 2131955356;
        if (z) {
            i4 = 2131955362;
        }
        r2.A08(i4);
        r2.A0K(new AKP(this, i), 2131960790);
        r2.A0G((DialogInterface.OnClickListener) null, 2131964550);
        r2.A0f(new C39957AKx(this));
        Dialog A022 = r2.A02();
        this.A04 = A022;
        if (A022 != null) {
            AnonymousClass0fN.A00(A022);
        }
    }

    public final String AoA() {
        return Ao9();
    }

    public final boolean CVF() {
        if (!A1g()) {
            return false;
        }
        if (this.A0q >= 1 || this.A0G.A01 != AnonymousClass8IX.CAMERA_IDLE) {
            return true;
        }
        return false;
    }

    public final boolean Cc9() {
        boolean z = false;
        if (A02(this) <= 100) {
            z = true;
        }
        return !z;
    }

    public final boolean Ccv() {
        if (A1f() || !this.A0Y) {
            return false;
        }
        return true;
    }

    public final void Cni(C353538Ia r3) {
        if (!CKX()) {
            return;
        }
        if (this.A1x.A06.A02() != AnonymousClass88C.DOWNLOADING || CVJ()) {
            A0P(r3, this);
        }
    }

    public final boolean DHP() {
        boolean z = false;
        if (A02(this) <= 100) {
            z = true;
        }
        if (!z && this.A0Y) {
            return false;
        }
        A1Q(this);
        return true;
    }

    public final void Dkg() {
        A1Q(this);
    }

    public final void Dsz(AudioOverlayTrack audioOverlayTrack, boolean z) {
        A1J(z);
        A0v(this, A02(this) / IgNetworkConsentStorage.MAX_ENTRIES);
        A0X(this);
        A0U(this);
    }

    public final void ETA(AnonymousClass8WX r1) {
        this.A0B = r1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v0, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v0, resolved type: X.4DH} */
    /* JADX WARNING: type inference failed for: r10v4, types: [X.07Z, X.4DH] */
    /* JADX WARNING: type inference failed for: r4v49, types: [X.07Z, X.4DH] */
    /* JADX WARNING: type inference failed for: r2v35, types: [X.07Z, X.4DH] */
    /* JADX WARNING: type inference failed for: r11v27, types: [X.07Z, X.07g, X.4DH] */
    /* JADX WARNING: type inference failed for: r2v48, types: [X.A3g, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v192, types: [X.A3g, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x029c, code lost:
        r3 = r9.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x086b, code lost:
        if (r2 != X.AnonymousClass8JI.REMIX) goto L_0x091d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0896  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x089d  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0937  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0979  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x09ee  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0afa  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0b8a  */
    /* JADX WARNING: Removed duplicated region for block: B:222:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x060a  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0669  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0794  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0867  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C353498Hw(android.view.View r72, android.view.ViewGroup r73, X.AnonymousClass8ZN r74, X.C3507686c r75, X.AnonymousClass86W r76, X.AnonymousClass848 r77, X.AnonymousClass4DH r78, X.AnonymousClass82X r79, com.instagram.common.session.UserSession r80, X.C71662eb r81, X.C357638Yz r82, X.C3510387i r83, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r84, X.C3506485o r85, X.C352888Fl r86, X.AnonymousClass85X r87, X.C3499582p r88, X.AnonymousClass823 r89, X.AnonymousClass8HD r90, X.AnonymousClass8E7 r91, X.AnonymousClass8FA r92, X.AnonymousClass80D r93, X.C353468Ht r94, X.AnonymousClass8AL r95, X.C3503684j r96, X.AnonymousClass86Y r97, X.C3504884v r98, X.C3502083s r99, X.C3497281m r100, X.C352868Fj r101, X.AnonymousClass80U r102, X.AnonymousClass85M r103, X.AnonymousClass85L r104, X.AnonymousClass88E r105, X.C353488Hv r106, X.C352328Cx r107, X.C2801950r r108, X.AnonymousClass825 r109, X.C314676if r110, X.C3495780x r111, X.AnonymousClass88F r112, X.C3499982t r113, com.instagram.ui.widget.interactive.InteractiveDrawableContainer r114) {
        /*
            r71 = this;
            r23 = r102
            r31 = 1
            r2 = r80
            r0 = r31
            X.0qQ.A0B(r2, r0)
            r0 = 2
            r5 = r78
            X.0qQ.A0B(r5, r0)
            r26 = 3
            r1 = 7
            r67 = r82
            r0 = r67
            X.0qQ.A0B(r0, r1)
            r1 = 13
            r47 = r84
            r0 = r47
            X.0qQ.A0B(r0, r1)
            r0 = 14
            r9 = r72
            X.0qQ.A0B(r9, r0)
            r18 = 16
            r15 = r111
            r0 = r18
            X.0qQ.A0B(r15, r0)
            r0 = 19
            r13 = r77
            X.0qQ.A0B(r13, r0)
            r0 = 24
            r12 = r106
            X.0qQ.A0B(r12, r0)
            r19 = 27
            r68 = r79
            r1 = r19
            r0 = r68
            X.0qQ.A0B(r0, r1)
            r17 = 29
            r8 = r108
            r0 = r17
            X.0qQ.A0B(r8, r0)
            r30 = 32
            r3 = r114
            r0 = r30
            X.0qQ.A0B(r3, r0)
            r27 = 33
            r7 = r109
            r0 = r27
            X.0qQ.A0B(r7, r0)
            r0 = 37
            r10 = r107
            X.0qQ.A0B(r10, r0)
            r0 = r71
            r0.<init>()
            r0.A1D = r2
            r0.A1B = r5
            r4 = r73
            r0.A13 = r4
            r1 = r81
            r0.A1E = r1
            r6 = r93
            r0.A1P = r6
            r1 = r23
            r0.A1W = r1
            r1 = r67
            r0.A1F = r1
            r1 = r94
            r0.A1Q = r1
            r11 = r91
            r0.A1O = r11
            r1 = r90
            r0.A1N = r1
            r1 = r100
            r0.A1U = r1
            r1 = r96
            r0.A1R = r1
            r1 = r47
            r0.A1H = r1
            r0.A2A = r9
            r49 = r99
            r1 = r49
            r0.A1T = r1
            r0.A1v = r15
            r1 = r89
            r0.A1M = r1
            r1 = r87
            r0.A1K = r1
            r0.A1A = r13
            r1 = r97
            r0.A2J = r1
            r1 = r98
            r0.A2K = r1
            r1 = r104
            r0.A1e = r1
            r1 = r103
            r0.A1d = r1
            r0.A1q = r12
            r1 = r112
            r0.A1w = r1
            r29 = r105
            r1 = r29
            r0.A1i = r1
            r1 = r68
            r0.A1C = r1
            r1 = r95
            r0.A2I = r1
            r0.A1t = r8
            r1 = r88
            r0.A1L = r1
            r1 = r101
            r0.A1V = r1
            r0.A2V = r3
            r0.A1u = r7
            r69 = r75
            r1 = r69
            r0.A2D = r1
            r48 = r85
            r1 = r48
            r0.A2G = r1
            r70 = r74
            r1 = r70
            r0.A2C = r1
            r0.A1r = r10
            r1 = r110
            r0.A2S = r1
            r66 = r113
            r1 = r66
            r0.A1y = r1
            r1 = r92
            r0.A2H = r1
            r1 = r76
            r0.A2E = r1
            r1 = r83
            r0.A2F = r1
            r1 = r86
            r0.A1J = r1
            r16 = 0
            r8 = 70
            X.0na r7 = new X.0na
            r3 = r26
            r1 = r31
            r10 = r16
            r7.<init>(r8, r3, r10, r1)
            r0.A24 = r7
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            r0.A15 = r1
            android.content.Context r10 = r5.requireContext()
            r0.A11 = r10
            r7 = 23
            X.9LJ r3 = new X.9LJ
            r3.<init>(r0, r7)
            X.0t0 r3 = X.AnonymousClass0eN.A01(r3)
            r0.A26 = r3
            X.8A2 r22 = X.AnonymousClass8A1.A01(r2)
            r3 = r22
            r0.A1h = r3
            X.8ZP r3 = X.AnonymousClass8ZO.A00(r2)
            r0.A2O = r3
            r3 = 2131430179(0x7f0b0b23, float:1.8482052E38)
            android.view.View r3 = r4.requireViewById(r3)
            X.0qQ.A07(r3)
            android.view.ViewStub r3 = (android.view.ViewStub) r3
            r0.A14 = r3
            X.8Hz r3 = new X.8Hz
            r3.<init>(r10, r5, r2, r0)
            r0.A2M = r3
            X.8A5 r3 = X.AnonymousClass8A4.A00(r10, r2)
            r0.A1c = r3
            X.2Nn r3 = X.2Nm.A00(r10, r2)
            r0.A20 = r3
            android.content.res.Resources r7 = r10.getResources()
            X.0qQ.A07(r7)
            X.8I0 r3 = new X.8I0
            r3.<init>(r7, r5, r2, r11)
            r0.A1Y = r3
            X.82v r3 = new X.82v
            r3.<init>(r2, r1)
            X.2YN r7 = new X.2YN
            r7.<init>(r3, r1)
            java.lang.Class<com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel> r3 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel.class
            X.2YL r8 = r7.A00(r3)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r8 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel) r8
            r0.A1n = r8
            X.8I1 r3 = new X.8I1
            r3.<init>(r1, r2)
            X.2YN r7 = new X.2YN
            r7.<init>(r3, r1)
            java.lang.Class<X.8I2> r3 = X.AnonymousClass8I2.class
            X.2YL r11 = r7.A00(r3)
            X.8I2 r11 = (X.AnonymousClass8I2) r11
            r0.A1j = r11
            X.884 r3 = new X.884
            r3.<init>(r2)
            X.2YN r7 = new X.2YN
            r7.<init>(r3, r1)
            java.lang.Class<X.885> r3 = X.AnonymousClass885.class
            X.2YL r3 = r7.A00(r3)
            X.885 r3 = (X.AnonymousClass885) r3
            r0.A1m = r3
            X.85w r3 = new X.85w
            r3.<init>(r2, r1)
            X.2YN r7 = new X.2YN
            r7.<init>(r3, r1)
            java.lang.Class<X.85x> r3 = X.C3507185x.class
            X.2YL r3 = r7.A00(r3)
            X.85x r3 = (X.C3507185x) r3
            r0.A2Q = r3
            android.app.Application r7 = r1.getApplication()
            X.0qQ.A07(r7)
            X.85R r3 = new X.85R
            r3.<init>(r7, r2)
            X.2YN r7 = new X.2YN
            r7.<init>(r3, r1)
            java.lang.Class<com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel> r3 = com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel.class
            X.2YL r3 = r7.A00(r3)
            com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel r3 = (com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel) r3
            r0.A1I = r3
            X.8IG r3 = new X.8IG
            r3.<init>(r2, r1)
            X.2YN r7 = new X.2YN
            r7.<init>(r3, r1)
            java.lang.Class<X.89Z> r3 = X.AnonymousClass89Z.class
            X.2YL r3 = r7.A00(r3)
            X.89Z r3 = (X.AnonymousClass89Z) r3
            r0.A1l = r3
            X.8IH r3 = new X.8IH
            r3.<init>(r2, r1)
            X.2YN r7 = new X.2YN
            r7.<init>(r3, r1)
            java.lang.Class<X.8II> r3 = X.AnonymousClass8II.class
            X.2YL r3 = r7.A00(r3)
            X.8II r3 = (X.AnonymousClass8II) r3
            r0.A1b = r3
            r3 = 2131430292(0x7f0b0b94, float:1.848228E38)
            android.view.View r3 = r9.requireViewById(r3)
            X.0qQ.A07(r3)
            r0.A12 = r3
            X.2YN r7 = new X.2YN
            r7.<init>(r1)
            java.lang.Class<X.88B> r3 = X.AnonymousClass88B.class
            X.2YL r36 = r7.A00(r3)
            r3 = r36
            X.88B r3 = (X.AnonymousClass88B) r3
            r36 = r3
            r0.A1x = r3
            X.2YN r7 = new X.2YN
            r7.<init>(r1)
            java.lang.Class<X.8IN> r3 = X.AnonymousClass8IN.class
            X.2YL r3 = r7.A00(r3)
            X.8IN r3 = (X.AnonymousClass8IN) r3
            r0.A1p = r3
            X.2YN r7 = new X.2YN
            r7.<init>(r1)
            java.lang.Class<X.88V> r3 = X.AnonymousClass88V.class
            X.2YL r20 = r7.A00(r3)
            r3 = r20
            X.88V r3 = (X.AnonymousClass88V) r3
            r20 = r3
            r0.A1o = r3
            X.2YN r3 = new X.2YN
            r3.<init>(r1)
            java.lang.Class<X.860> r7 = X.AnonymousClass860.class
            X.2YL r9 = r3.A00(r7)
            X.860 r9 = (X.AnonymousClass860) r9
            java.lang.String r3 = "trim"
            X.861 r3 = r9.A00(r3)
            r0.A2T = r3
            X.2YN r9 = new X.2YN
            r9.<init>(r1)
            java.lang.Class<X.8H1> r3 = X.AnonymousClass8H1.class
            X.2YL r3 = r9.A00(r3)
            X.8H1 r3 = (X.AnonymousClass8H1) r3
            r0.A1G = r3
            com.instagram.common.session.UserSession r3 = r0.A1D
            r14 = r3
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r13 = r0.A1H
            X.8IP r12 = new X.8IP
            r12.<init>(r0)
            X.82p r9 = r0.A1L
            X.8IQ r3 = new X.8IQ
            r37 = r3
            r38 = r1
            r39 = r5
            r40 = r14
            r41 = r13
            r42 = r9
            r43 = r12
            r37.<init>(r38, r39, r40, r41, r42, r43)
            r0.A1k = r3
            X.9Qn r9 = r6.A13
            if (r9 == 0) goto L_0x02a0
            java.lang.Integer r3 = r9.A07
            if (r3 != 0) goto L_0x02a2
        L_0x02a0:
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
        L_0x02a2:
            r0.A0w = r3
            if (r9 == 0) goto L_0x04c3
            com.instagram.api.schemas.ClipsCameraCommandAction r3 = r9.A02
        L_0x02a8:
            r0.A0s = r3
            r21 = 21
            X.9LJ r9 = new X.9LJ
            r3 = r21
            r9.<init>(r0, r3)
            X.0t0 r3 = X.AnonymousClass0eN.A01(r9)
            r0.A25 = r3
            X.85N r3 = new X.85N
            r3.<init>(r2)
            X.2YN r9 = new X.2YN
            r9.<init>(r3, r5)
            java.lang.Class<X.85O> r3 = X.AnonymousClass85O.class
            X.2YL r3 = r9.A00(r3)
            X.85O r3 = (X.AnonymousClass85O) r3
            r0.A1S = r3
            X.2YN r9 = new X.2YN
            r9.<init>(r1)
            java.lang.Class<X.8IT> r3 = X.AnonymousClass8IT.class
            X.2YL r3 = r9.A00(r3)
            X.8IT r3 = (X.AnonymousClass8IT) r3
            r0.A2R = r3
            X.0nO r12 = X.0nY.A00()
            X.0qQ.A07(r12)
            r9 = 0
            X.8IU r3 = new X.8IU
            r3.<init>(r12)
            r0.A2L = r3
            java.util.ArrayList r3 = X.C3495980z.A01(r2)
            r0.A23 = r3
            X.8IV r3 = new X.8IV
            r3.<init>(r0)
            r0.A2U = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.A0V = r3
            X.2YN r3 = new X.2YN
            r3.<init>(r1)
            X.2YL r7 = r3.A00(r7)
            X.860 r7 = (X.AnonymousClass860) r7
            java.lang.String r3 = "post_capture"
            X.89w r3 = r7.A01(r3)
            r0.A21 = r3
            X.0eO r12 = X.0eO.A02
            r39 = 25
            X.9LJ r7 = new X.9LJ
            r3 = r39
            r7.<init>(r0, r3)
            X.0eM r3 = X.AnonymousClass0eN.A00(r12, r7)
            r0.A27 = r3
            X.8IW r12 = X.AnonymousClass8IW.EMPTY
            X.8IX r7 = X.AnonymousClass8IX.CAMERA_IDLE
            X.8IY r3 = new X.8IY
            r3.<init>(r12, r7)
            r0.A0G = r3
            X.0sn r12 = X.0sn.A00
            X.831 r7 = new X.831
            r3 = r16
            r7.<init>(r12, r3)
            r0.A0K = r7
            X.831 r7 = new X.831
            r7.<init>(r12, r3)
            r0.A0J = r7
            r7 = -1
            r0.A00 = r7
            X.2Fj r3 = r15.A05
            r65 = r3
            java.lang.Object r3 = r65.A02()
            X.80y r3 = (X.C3495880y) r3
            r0.A0I = r3
            r0.A02 = r7
            r0.A03 = r7
            java.lang.String r3 = r6.A2Y
            r0.A0R = r3
            java.util.ArrayList r3 = r6.A2v
            if (r3 == 0) goto L_0x04c0
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
        L_0x035f:
            r0.A0U = r3
            java.lang.String r3 = r6.A2M
            r0.A0S = r3
            com.instagram.music.common.model.AudioOverlayTrack r3 = r6.A1P
            r0.A1z = r3
            com.instagram.api.schemas.ACRType r3 = r6.A0G
            r0.A19 = r3
            java.util.ArrayList r3 = r6.A2t
            if (r3 == 0) goto L_0x04bd
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
        L_0x0375:
            r0.A0X = r3
            java.util.List r3 = r6.A2x
            if (r3 == 0) goto L_0x04ba
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
        L_0x037f:
            r0.A0W = r3
            java.util.List r3 = r6.A2w
            if (r3 == 0) goto L_0x04b7
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
        L_0x0389:
            r0.A2X = r3
            boolean r3 = r6.A3w
            r0.A2Z = r3
            X.8IZ r3 = X.AnonymousClass8IZ.A00
            r0.A0D = r3
            X.9Qn r3 = r6.A13
            if (r3 == 0) goto L_0x04b4
            boolean r3 = r3.A0H
        L_0x0399:
            r0.A2Y = r3
            boolean r3 = r6.A45
            r0.A29 = r3
            boolean r3 = r6.A3z
            r0.A28 = r3
            X.8As r3 = new X.8As
            r3.<init>(r1, r2, r9)
            X.2YN r7 = new X.2YN
            r7.<init>(r3, r5)
            java.lang.Class<com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel> r3 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel.class
            X.2YL r7 = r7.A00(r3)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r7 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel) r7
            r0.A1s = r7
            X.2Fj r38 = new X.2Fj
            r38.<init>()
            r3 = r38
            r0.A2B = r3
            r3 = 2131429471(0x7f0b085f, float:1.8480616E38)
            android.view.View r3 = r4.requireViewById(r3)
            X.0qQ.A07(r3)
            com.instagram.ui.widget.shutterbutton.ShutterButton r3 = (com.instagram.ui.widget.shutterbutton.ShutterButton) r3
            r0.A22 = r3
            X.28D r3 = r15.A00
            r64 = r3
            r0.A16 = r3
            java.lang.String r4 = "android.permission.CAMERA"
            java.lang.String r3 = "android.permission.RECORD_AUDIO"
            java.lang.String[] r4 = new java.lang.String[]{r4, r3}
            r3 = 2
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r4, r3)
            java.lang.String[] r3 = (java.lang.String[]) r3
            boolean r3 = X.1DL.A08(r1, r3)
            r0.A0Y = r3
            X.2YN r4 = new X.2YN
            r4.<init>(r1)
            java.lang.Class<X.89a> r3 = X.C3514789a.class
            X.2YL r3 = r4.A00(r3)
            X.89a r3 = (X.C3514789a) r3
            r0.A1g = r3
            X.2YN r4 = new X.2YN
            r4.<init>(r1)
            java.lang.Class<X.8Ib> r3 = X.C353548Ib.class
            X.2YL r3 = r4.A00(r3)
            X.8Ib r3 = (X.C353548Ib) r3
            r0.A2N = r3
            r3 = r31
            r0.A0n = r3
            X.4MS r3 = new X.4MS
            r3.<init>()
            r0.A18 = r3
            X.8Ic r3 = new X.8Ic
            r3.<init>(r0)
            r0.A1a = r3
            X.8Id r3 = new X.8Id
            r3.<init>(r0)
            r0.A1Z = r3
            X.6tY r3 = X.C353578Ie.A00(r2)
            X.0r6 r12 = r3.A03
            X.83d r3 = r8.A0N
            X.0Ud r4 = r3.A0E
            com.instagram.creation.capture.quickcapture.sundial.ClipsCaptureControllerImpl$1 r3 = new com.instagram.creation.capture.quickcapture.sundial.ClipsCaptureControllerImpl$1
            r3.<init>(r0, r9)
            X.0pm r4 = X.AnonymousClass10H.A03(r3, r12, r4)
            X.07Z r3 = r5.getViewLifecycleOwner()
            X.0xx r3 = X.AnonymousClass07a.A00(r3)
            X.AnonymousClass11O.A03(r3, r4)
            X.07U r61 = X.07U.A05
            X.07Z r60 = r5.getViewLifecycleOwner()
            X.0xx r12 = X.AnonymousClass07a.A00(r60)
            X.9KF r4 = new X.9KF
            r58 = r4
            r59 = r0
            r62 = r9
            r63 = r30
            r58.<init>(r59, r60, r61, r62, r63)
            X.19B r24 = X.19B.A00
            java.lang.Integer r37 = X.AnonymousClass05K.A00
            r13 = r37
            r3 = r24
            X.1Eo.A03(r13, r3, r4, r12)
            X.9Qn r3 = r6.A13
            r25 = r3
            java.util.ArrayList r3 = r6.A2s
            if (r3 == 0) goto L_0x04d3
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            if (r3 == 0) goto L_0x04d3
            java.util.ArrayList r35 = new java.util.ArrayList
            r35.<init>()
            java.util.ArrayList r34 = new java.util.ArrayList
            r34.<init>()
            java.util.Iterator r28 = r3.iterator()
        L_0x047c:
            boolean r3 = r28.hasNext()
            if (r3 == 0) goto L_0x04c6
            java.lang.Object r14 = r28.next()
            com.instagram.user.model.User r14 = (com.instagram.user.model.User) r14
            java.lang.String r4 = r14.getId()
            r3 = r34
            r3.add(r4)
            android.graphics.PointF r3 = new android.graphics.PointF
            r3.<init>()
            com.instagram.model.people.PeopleTag r13 = new com.instagram.model.people.PeopleTag
            r13.<init>(r3, r14)
            X.0Tu r3 = X.0Tu.A05
            r32 = 36314618502580964(0x8103f400000ae4, double:3.028849196039342E-306)
            r12 = r3
            r3 = r32
            boolean r3 = X.182.A06(r12, r2, r3)
            if (r3 == 0) goto L_0x04ae
            r13.A09(r14)
        L_0x04ae:
            r3 = r35
            r3.add(r13)
            goto L_0x047c
        L_0x04b4:
            r3 = 0
            goto L_0x0399
        L_0x04b7:
            r3 = 0
            goto L_0x0389
        L_0x04ba:
            r3 = 0
            goto L_0x037f
        L_0x04bd:
            r3 = 0
            goto L_0x0375
        L_0x04c0:
            r3 = 0
            goto L_0x035f
        L_0x04c3:
            r3 = 0
            goto L_0x02a8
        L_0x04c6:
            r13 = 42
            X.JVf r12 = new X.JVf
            r4 = r35
            r3 = r34
            r12.<init>((java.util.List) r4, (java.util.List) r3, (int) r13)
            r0.A08 = r12
        L_0x04d3:
            X.80X r54 = r23.Ats()
            com.google.common.collect.ImmutableList r43 = com.google.common.collect.ImmutableList.of()
            X.0qQ.A07(r43)
            X.8Ii r50 = new X.8Ii
            r50.<init>()
            com.instagram.music.common.config.MusicAttributionConfig r4 = r6.A1N
            X.89i r42 = X.C3515589i.PRE_CAPTURE
            com.instagram.api.schemas.MusicProduct r44 = com.instagram.api.schemas.MusicProduct.CLIPS_CAMERA_FORMAT_V2
            X.89j r53 = X.C3515689j.UNKNOWN
            X.89k r3 = new X.89k
            r40 = r3
            r41 = r10
            r45 = r5
            r46 = r2
            r51 = r0
            r52 = r4
            r55 = r9
            r56 = r16
            r57 = r16
            r58 = r16
            r59 = r16
            r60 = r16
            r40.<init>(r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60)
            r0.A1f = r3
            com.instagram.common.session.UserSession r3 = r0.A1D
            int r3 = X.C353608Ij.A00(r3)
            float r3 = (float) r3
            r4 = 1050253722(0x3e99999a, float:0.3)
            float r3 = r3 / r4
            int r12 = (int) r3
            X.8Ik r4 = new X.8Ik
            r4.<init>(r0)
            X.8Im r3 = new X.8Im
            r3.<init>(r10, r2, r4, r12)
            r0.A0P = r3
            X.2Fj r12 = r15.A04
            r3 = 34
            X.9Ks r4 = new X.9Ks
            r4.<init>(r0, r3)
            X.8Io r3 = new X.8Io
            r3.<init>(r4)
            r12.A06(r5, r3)
            java.lang.Class<X.8Ip> r12 = X.C353668Ip.class
            r4 = 22
            X.G2c r3 = new X.G2c
            r3.<init>(r2, r4)
            java.lang.Object r12 = r2.A01(r12, r3)
            X.8Ip r12 = (X.C353668Ip) r12
            X.84N r13 = new X.84N
            r13.<init>(r10, r2)
            X.8Iq r4 = new X.8Iq
            r4.<init>()
            X.8Is r3 = new X.8Is
            r3.<init>(r10, r4, r13)
            X.8It r4 = new X.8It
            r4.<init>(r3)
            X.8Iz r3 = new X.8Iz
            r3.<init>(r4, r12)
            r0.A17 = r3
            android.app.Application r3 = r1.getApplication()
            X.0qQ.A07(r3)
            X.82z r4 = X.C3500382y.A00(r3, r2)
            java.lang.String r3 = r8.A0S
            X.835 r3 = r4.A00(r3)
            X.836 r3 = r3.A05
            r0.A2P = r3
            X.07V r3 = r5.getLifecycle()
            X.0xx r13 = X.C71772f0.A00(r3)
            r28 = 31
            X.9KF r12 = new X.9KF
            r40 = r12
            r41 = r0
            r42 = r5
            r43 = r61
            r44 = r9
            r45 = r28
            r40.<init>(r41, r42, r43, r44, r45)
            r4 = r37
            r3 = r24
            X.1Eo.A03(r4, r3, r12, r13)
            r11.A00 = r6
            X.83H r3 = r8.A0L
            r4 = r66
            r3.A01 = r4
            if (r105 == 0) goto L_0x08a9
            r4 = r29
            X.81C r4 = r4.A00
            X.81E r11 = r4.A00()
            if (r11 == 0) goto L_0x08a9
            X.81E r4 = r4.A00()
            X.Ab8 r4 = (X.C40375Ab8) r4
            X.88D r13 = r4.A09
            X.82i r4 = r13.A07
            if (r4 == 0) goto L_0x08a9
            X.88B r11 = r13.A08
            X.82i r11 = r11.A00
            if (r11 == 0) goto L_0x08a6
            X.9Tg r12 = r11.A02
        L_0x05bc:
            X.9Tg r11 = X.C379289Tg.CLIPS
            if (r12 != r11) goto L_0x08a9
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r15 = r13.A06
            X.1Xj r13 = r4.A04
            java.lang.String r43 = r13.A30()
            if (r43 == 0) goto L_0x0c08
            long r34 = r13.A1B()
            r32 = 0
            int r11 = (r34 > r32 ? 1 : (r34 == r32 ? 0 : -1))
            if (r11 <= 0) goto L_0x08a0
            long r11 = r13.A1B()
        L_0x05d8:
            int r14 = (int) r11
            boolean r45 = r13.A62()
            X.1Xy r11 = r13.A0C
            java.lang.Boolean r12 = r11.AcQ()
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r31)
            boolean r11 = X.0qQ.A0K(r12, r11)
            java.lang.Boolean r42 = java.lang.Boolean.valueOf(r11)
            X.8JI r11 = r4.A00
            boolean r46 = r13.A5p()
            X.8J0 r4 = new X.8J0
            r40 = r4
            r41 = r11
            r44 = r14
            r40.<init>(r41, r42, r43, r44, r45, r46)
            X.83H r11 = r15.A0L
            r11.A00 = r4
        L_0x0604:
            com.instagram.common.gallery.Medium r4 = r0.A03()
            if (r4 == 0) goto L_0x089d
            java.lang.String r4 = "feed_fork"
        L_0x060c:
            r3.A02 = r4
            X.2gB r11 = r8.A0G
            r3 = 35
            X.9Ks r4 = new X.9Ks
            r4.<init>(r0, r3)
            X.8Io r3 = new X.8Io
            r3.<init>(r4)
            r11.A06(r5, r3)
            X.2gB r11 = r8.A0F
            X.9Ks r4 = new X.9Ks
            r3 = r39
            r4.<init>(r0, r3)
            X.8Io r3 = new X.8Io
            r3.<init>(r4)
            r11.A06(r5, r3)
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r3 = r8.A0K
            X.0Ud r3 = r3.A0V
            X.0qC r11 = new X.0qC
            r11.<init>(r3)
            X.9Jz r4 = new X.9Jz
            r3 = r27
            r4.<init>(r0, r9, r3)
            X.0pz r3 = new X.0pz
            r3.<init>(r4, r11)
            X.07Z r4 = r5.getViewLifecycleOwner()
            X.0xx r4 = X.AnonymousClass07a.A00(r4)
            X.AnonymousClass11O.A03(r4, r3)
            r3 = r36
            X.2Fk r11 = r3.A03
            r3 = 26
            X.9Ks r4 = new X.9Ks
            r4.<init>(r0, r3)
            X.8Io r3 = new X.8Io
            r3.<init>(r4)
            r11.A06(r5, r3)
            boolean r3 = A1c(r0)
            if (r3 == 0) goto L_0x06a9
            android.app.Application r4 = r1.getApplication()
            X.0qQ.A07(r4)
            X.8cc r3 = new X.8cc
            r3.<init>(r4, r2)
            X.2YN r4 = new X.2YN
            r4.<init>(r3, r5)
            java.lang.Class<X.8cd> r3 = X.C359338cd.class
            X.2YL r12 = r4.A00(r3)
            X.8cd r12 = (X.C359338cd) r12
            r0.A0A = r12
            X.A3g r3 = new X.A3g
            r3.<init>()
            r0.A09 = r3
            X.2Fk r11 = r12.A05
            X.APd r4 = new X.APd
            r4.<init>(r0)
            X.6q2 r3 = new X.6q2
            r3.<init>(r4)
            r11.A06(r5, r3)
            X.2Fk r11 = r12.A03
            X.APe r4 = new X.APe
            r4.<init>(r0)
            X.6q2 r3 = new X.6q2
            r3.<init>(r4)
            r11.A06(r5, r3)
        L_0x06a9:
            X.9Ks r3 = new X.9Ks
            r4 = r19
            r3.<init>(r0, r4)
            X.8Io r4 = new X.8Io
            r4.<init>(r3)
            r3 = r38
            r3.A06(r5, r4)
            X.2gB r11 = r7.A06
            r3 = 28
            X.9Ks r4 = new X.9Ks
            r4.<init>(r0, r3)
            X.8Io r3 = new X.8Io
            r3.<init>(r4)
            r11.A06(r5, r3)
            X.8J1 r4 = new X.8J1
            r4.<init>(r0)
            r3 = r23
            r3.A7w(r4)
            X.2Fj r11 = r7.A0C
            X.8J2 r4 = new X.8J2
            r4.<init>(r0)
            X.6q2 r3 = new X.6q2
            r3.<init>(r4)
            r11.A06(r5, r3)
            X.05G r4 = r7.A0Q
            X.9Jr r3 = new X.9Jr
            r11 = r18
            r3.<init>(r0, r9, r11)
            X.0pz r11 = new X.0pz
            r11.<init>(r3, r4)
            X.07Z r3 = r5.getViewLifecycleOwner()
            X.0xx r3 = X.AnonymousClass07a.A00(r3)
            X.AnonymousClass11O.A03(r3, r11)
            X.05G r11 = r7.A0P
            r3 = 17
            X.9Jr r4 = new X.9Jr
            r4.<init>(r0, r9, r3)
            X.0pz r3 = new X.0pz
            r3.<init>(r4, r11)
            X.07Z r4 = r5.getViewLifecycleOwner()
            X.0xx r4 = X.AnonymousClass07a.A00(r4)
            X.AnonymousClass11O.A03(r4, r3)
            X.2Fj r11 = r7.A09
            X.8J3 r4 = new X.8J3
            r4.<init>(r0)
            X.6q2 r3 = new X.6q2
            r3.<init>(r4)
            r11.A06(r5, r3)
            X.2Fk r4 = r7.A05
            X.9Ks r3 = new X.9Ks
            r11 = r17
            r3.<init>(r0, r11)
            X.8Io r11 = new X.8Io
            r11.<init>(r3)
            r4.A06(r5, r11)
            X.2Fj r11 = r7.A0B
            X.8J4 r4 = new X.8J4
            r4.<init>(r0)
            X.6q2 r3 = new X.6q2
            r3.<init>(r4)
            r11.A06(r1, r3)
            X.2YN r4 = new X.2YN
            r4.<init>(r1)
            java.lang.Class<X.8J5> r3 = X.AnonymousClass8J5.class
            X.2YL r3 = r4.A00(r3)
            X.8J5 r3 = (X.AnonymousClass8J5) r3
            X.2Fj r11 = r3.A00
            X.8J6 r4 = new X.8J6
            r4.<init>(r0)
            X.6q2 r3 = new X.6q2
            r3.<init>(r4)
            r11.A06(r5, r3)
            X.8J7 r13 = new X.8J7
            r13.<init>(r0)
            X.8J9 r12 = new X.8J9
            r12.<init>(r0)
            r4 = 1000(0x3e8, float:1.401E-42)
            X.8JB r11 = new X.8JB
            r3 = r16
            r11.<init>(r12, r13, r3, r4)
            r0.A2W = r11
            r11 = 30
            X.9Ks r3 = new X.9Ks
            r3.<init>(r0, r11)
            X.8Io r11 = new X.8Io
            r11.<init>(r3)
            r3 = r65
            r3.A06(r5, r11)
            X.0Tu r3 = X.0Tu.A05
            r11 = 36327627958729289(0x810fc900033a49, double:3.037076428492418E-306)
            boolean r11 = X.182.A06(r3, r2, r11)
            if (r11 == 0) goto L_0x07b1
            r11 = r69
            X.86a r11 = r11.A02
            X.0r6 r13 = r11.A04
            r11 = 12
            X.MG9 r12 = new X.MG9
            r12.<init>(r0, r9, r11)
            X.0pz r11 = new X.0pz
            r11.<init>(r12, r13)
            X.07Z r12 = r5.getViewLifecycleOwner()
            X.0xx r12 = X.AnonymousClass07a.A00(r12)
            X.AnonymousClass11O.A03(r12, r11)
        L_0x07b1:
            X.8JD r12 = new X.8JD
            r12.<init>(r0)
            X.8JE r11 = new X.8JE
            r11.<init>(r10, r2, r12)
            r0.A1X = r11
            X.2Fk r10 = r8.A0A
            X.8JG r8 = new X.8JG
            r8.<init>(r0)
            X.6q2 r2 = new X.6q2
            r2.<init>(r8)
            r10.A06(r5, r2)
            r2 = r68
            r11.A01 = r2
            X.885 r2 = r0.A1m
            X.2Fj r11 = r2.A00
            X.4DH r10 = r0.A1B
            r2 = 43
            X.9Ks r8 = new X.9Ks
            r8.<init>(r0, r2)
            X.8Io r2 = new X.8Io
            r2.<init>(r8)
            r11.A06(r10, r2)
            r2 = r23
            X.80T r2 = (X.AnonymousClass80T) r2
            X.80W r8 = r2.A02
            X.8JH r2 = new X.8JH
            r2.<init>(r0)
            r8.A02(r2)
            java.util.List r2 = r0.A0U
            if (r2 == 0) goto L_0x084d
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x084d
            java.util.List r12 = r0.A0U
            X.4DH r11 = r0.A1B
            android.app.Application r10 = r1.getApplication()
            X.0qQ.A07(r10)
            com.instagram.common.session.UserSession r8 = r0.A1D
            X.8cc r2 = new X.8cc
            r2.<init>(r10, r8)
            X.2YN r8 = new X.2YN
            r8.<init>(r2, r11)
            java.lang.Class<X.8cd> r2 = X.C359338cd.class
            X.2YL r8 = r8.A00(r2)
            X.8cd r8 = (X.C359338cd) r8
            r0.A0A = r8
            X.A3g r2 = new X.A3g
            r2.<init>()
            r0.A09 = r2
            if (r8 == 0) goto L_0x0838
            X.2Fk r8 = r8.A04
            if (r8 == 0) goto L_0x0838
            X.APq r2 = new X.APq
            r2.<init>(r0, r12)
            X.6q2 r10 = new X.6q2
            r10.<init>(r2)
            r8.A06(r11, r10)
        L_0x0838:
            X.8cd r2 = r0.A0A
            if (r2 == 0) goto L_0x084d
            X.2Fk r8 = r2.A03
            if (r8 == 0) goto L_0x084d
            X.APr r2 = new X.APr
            r2.<init>(r1, r0)
            X.6q2 r1 = new X.6q2
            r1.<init>(r2)
            r8.A06(r11, r1)
        L_0x084d:
            java.util.List r1 = r0.A0X
            if (r1 == 0) goto L_0x0857
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0898
        L_0x0857:
            java.util.List r1 = r0.A0W
            if (r1 == 0) goto L_0x0861
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0898
        L_0x0861:
            X.88B r1 = r0.A1x
            X.82i r1 = r1.A00
            if (r1 == 0) goto L_0x0896
            X.8JI r2 = r1.A00
        L_0x0869:
            X.8JI r1 = X.AnonymousClass8JI.REMIX
            if (r2 != r1) goto L_0x091d
        L_0x086d:
            java.util.List r2 = r0.A0X
            r1 = 10
            if (r2 == 0) goto L_0x08d2
            int r1 = X.0Yv.A1E(r2, r1)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        L_0x0880:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x08fc
            java.lang.Object r1 = r2.next()
            com.instagram.common.gallery.Medium r1 = (com.instagram.common.gallery.Medium) r1
            int r1 = r1.A03
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10.add(r1)
            goto L_0x0880
        L_0x0896:
            r2 = 0
            goto L_0x0869
        L_0x0898:
            boolean r1 = r0.A29
            if (r1 != 0) goto L_0x086d
            goto L_0x0861
        L_0x089d:
            r4 = r9
            goto L_0x060c
        L_0x08a0:
            X.A5F r11 = r4.A01
            long r11 = r11.A00
            goto L_0x05d8
        L_0x08a6:
            r12 = 0
            goto L_0x05bc
        L_0x08a9:
            java.lang.String r11 = r6.A2l
            if (r11 == 0) goto L_0x08ce
            boolean r4 = r0.CVJ()
            if (r4 != 0) goto L_0x08ce
            java.lang.Long r4 = r6.A2A
            if (r4 != 0) goto L_0x08ce
            X.8JI r41 = X.AnonymousClass8JI.REMIX
            X.8J0 r4 = new X.8J0
            r40 = r4
            r42 = r9
            r43 = r11
            r44 = r16
            r45 = r16
            r46 = r16
            r40.<init>(r41, r42, r43, r44, r45, r46)
            r3.A00 = r4
            goto L_0x0604
        L_0x08ce:
            r3.A00 = r9
            goto L_0x0604
        L_0x08d2:
            java.util.List r2 = r0.A0W
            if (r2 == 0) goto L_0x091d
            int r1 = X.0Yv.A1E(r2, r1)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r1)
            java.util.Iterator r11 = r2.iterator()
        L_0x08e3:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x08fc
            java.lang.Object r1 = r11.next()
            X.1Xj r1 = (X.1Xj) r1
            long r1 = r1.A1B()
            int r8 = (int) r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r10.add(r1)
            goto L_0x08e3
        L_0x08fc:
            int r8 = X.00k.A02(r10)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            if (r1 == 0) goto L_0x091d
            com.instagram.common.session.UserSession r2 = r0.A1D
            X.80y r1 = X.C3495980z.A00(r2)
            int r1 = r1.A01
            if (r8 > r1) goto L_0x091d
            X.80y r1 = X.C3495980z.A00(r2)
            r0.A0I = r1
            A0R(r0)
            r0.A0X = r9
            r0.A0W = r9
        L_0x091d:
            X.8JJ r2 = new X.8JJ
            r2.<init>(r0)
            r1 = r67
            r1.A0F(r2)
            X.8JK r2 = new X.8JK
            r2.<init>(r0)
            r1.A0G(r2)
            java.lang.String r13 = r6.A2j
            java.lang.String r14 = r6.A2L
            com.instagram.music.common.model.InstagramAudioApplySource r12 = r6.A1Q
            if (r13 == 0) goto L_0x094b
            com.instagram.common.session.UserSession r11 = r0.A1D
            boolean r1 = X.AnonymousClass30D.A08(r11)
            if (r1 != 0) goto L_0x0bc2
            android.content.Context r10 = r0.A11
            r8 = 2131955517(0x7f130f3d, float:1.9547564E38)
            java.lang.String r2 = "clips_music_unavailable"
            r1 = r31
            X.C59689JTv.A01(r10, r2, r8, r1)
        L_0x094b:
            com.instagram.music.common.config.MusicAttributionConfig r2 = r6.A1N
            X.8I2 r1 = r0.A1j
            X.80D r1 = r1.A00
            if (r1 == 0) goto L_0x095b
            X.9Qn r1 = r1.A13
            if (r1 == 0) goto L_0x095b
            X.8JL r1 = r1.A03
            if (r1 != 0) goto L_0x095d
        L_0x095b:
            X.8JL r1 = X.AnonymousClass8JL.NONE
        L_0x095d:
            int r1 = r1.ordinal()
            r8 = r16
            if (r1 == r8) goto L_0x0993
            r8 = r26
            if (r1 == r8) goto L_0x0993
            r8 = 4
            if (r1 == r8) goto L_0x0993
            r8 = 5
            if (r1 == r8) goto L_0x0993
            if (r2 == 0) goto L_0x0993
            com.instagram.music.common.model.MusicAssetModel r10 = r2.A02
            if (r10 == 0) goto L_0x0993
            X.80y r1 = r0.A0I
            if (r1 == 0) goto L_0x0b8f
            int r1 = r1.A01
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            if (r8 == 0) goto L_0x0b8f
            com.instagram.music.common.model.AudioOverlayTrack r8 = X.AnonymousClass9ST.A00(r2, r1)
            if (r8 == 0) goto L_0x0b8f
            X.88B r1 = r0.A1x
            boolean r1 = r1.A02()
            if (r1 == 0) goto L_0x0b95
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = r0.A1n
            r1.A04 = r8
        L_0x0993:
            com.instagram.music.common.model.AudioOverlayTrack r2 = r6.A1O
            if (r2 == 0) goto L_0x09a1
            com.instagram.music.common.model.MusicAssetModel r1 = r2.A08
            if (r1 == 0) goto L_0x09a1
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = r0.A1n
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r1 = r1.A0K
            r1.A00 = r2
        L_0x09a1:
            int r1 = A00(r0)
            int r1 = r1 / r4
            A0v(r0, r1)
            if (r25 == 0) goto L_0x09c6
            r1 = r25
            java.lang.String r2 = r1.A09
            if (r2 == 0) goto L_0x09c6
            int r1 = r2.length()
            if (r1 == 0) goto L_0x09c6
            X.2Fj r1 = r7.A07
            r1.A0B(r2)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = r7.A0F
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r1 = r1.A0K
            X.83A r1 = r1.A0A
            X.839 r1 = r1.A01
            r1.A00 = r2
        L_0x09c6:
            r1 = r20
            X.2Fk r4 = r1.A05
            X.8JS r2 = new X.8JS
            r2.<init>(r0)
            X.6q2 r1 = new X.6q2
            r1.<init>(r2)
            r4.A06(r5, r1)
            r1 = r20
            X.2Fk r4 = r1.A03
            X.8JT r2 = new X.8JT
            r2.<init>(r0)
            X.6q2 r1 = new X.6q2
            r1.<init>(r2)
            r4.A06(r5, r1)
            boolean r1 = A1U(r0)
            if (r1 != 0) goto L_0x0a52
            X.2YN r2 = new X.2YN
            r2.<init>(r5)
            java.lang.Class<X.8Gz> r1 = X.C353278Gz.class
            X.2YL r4 = r2.A00(r1)
            X.8Gz r4 = (X.C353278Gz) r4
            r0.A0C = r4
            X.05G r1 = r4.A07
            X.0qC r2 = new X.0qC
            r2.<init>(r1)
            r1 = r24
            androidx.lifecycle.CoroutineLiveData r7 = X.C226292g8.A00(r1, r2)
            X.07Z r6 = r5.getViewLifecycleOwner()
            X.9Ks r2 = new X.9Ks
            r1 = r28
            r2.<init>(r0, r1)
            X.8Io r1 = new X.8Io
            r1.<init>(r2)
            r7.A06(r6, r1)
            X.2Fj r7 = r4.A02
            X.07Z r6 = r5.getViewLifecycleOwner()
            X.9Ks r2 = new X.9Ks
            r1 = r30
            r2.<init>(r0, r1)
            X.8Io r1 = new X.8Io
            r1.<init>(r2)
            r7.A06(r6, r1)
            X.05G r1 = r4.A05
            X.0qC r2 = new X.0qC
            r2.<init>(r1)
            r1 = r24
            androidx.lifecycle.CoroutineLiveData r6 = X.C226292g8.A00(r1, r2)
            X.07Z r4 = r5.getViewLifecycleOwner()
            X.9Ks r2 = new X.9Ks
            r1 = r27
            r2.<init>(r0, r1)
            X.8Io r1 = new X.8Io
            r1.<init>(r2)
            r6.A06(r4, r1)
        L_0x0a52:
            X.8H1 r6 = r0.A1G
            X.2Fk r4 = r6.A03
            X.8JU r2 = new X.8JU
            r2.<init>(r0)
            X.6q2 r1 = new X.6q2
            r1.<init>(r2)
            r4.A06(r5, r1)
            X.2Fk r4 = r6.A02
            r1 = 44
            X.9Ks r2 = new X.9Ks
            r2.<init>(r0, r1)
            X.8Io r1 = new X.8Io
            r1.<init>(r2)
            r4.A06(r5, r1)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = r0.A1n
            X.2gB r5 = r1.A0G
            X.4DH r4 = r0.A1B
            r1 = 41
            X.9Ks r2 = new X.9Ks
            r2.<init>(r0, r1)
            X.8Io r1 = new X.8Io
            r1.<init>(r2)
            r5.A06(r4, r1)
            android.app.Dialog r1 = r0.A04
            if (r1 != 0) goto L_0x0ae0
            X.80D r1 = r0.A1P
            java.lang.Boolean r2 = r1.A24
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r31)
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x0ae0
            android.content.Context r4 = r0.A11
            r1 = 2131237555(0x7f081ab3, float:1.8091364E38)
            android.graphics.drawable.Drawable r1 = r4.getDrawable(r1)
            if (r1 == 0) goto L_0x0ae0
            X.F3t r2 = new X.F3t
            r2.<init>(r4)
            r2.A03(r1)
            r1 = 2131956227(0x7f131203, float:1.9549004E38)
            java.lang.String r1 = r4.getString(r1)
            X.0qQ.A07(r1)
            r2.A06 = r1
            r1 = 2131956226(0x7f131202, float:1.9549002E38)
            java.lang.String r1 = r4.getString(r1)
            X.0qQ.A07(r1)
            r2.A04 = r1
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r2.A05 = r1
            r1 = 2131968772(0x7f134304, float:1.9574448E38)
            java.lang.String r1 = r4.getString(r1)
            X.0qQ.A07(r1)
            r2.A02(r9, r1)
            android.app.Dialog r1 = r2.A00()
            r0.A04 = r1
            X.AnonymousClass0fN.A00(r1)
        L_0x0ae0:
            android.app.Dialog r1 = r0.A04
            if (r1 != 0) goto L_0x0af4
            X.82p r1 = r0.A1L
            X.82o r1 = r1.A02
            X.82Y r1 = r1.A01
            com.instagram.pendingmedia.model.recipients.PendingRecipient r1 = r1.A0i
            if (r1 == 0) goto L_0x0b0a
            boolean r2 = r1.A0Y
            r1 = r31
            if (r2 != r1) goto L_0x0b0a
        L_0x0af4:
            X.8ZN r1 = X.AnonymousClass8ZN.CLIPS_USE_AUDIO_BUTTON
            r0 = r70
            if (r0 != r1) goto L_0x0b09
            r0 = r22
            X.29E r2 = r0.A0K
            long r0 = r0.A0D
            java.lang.String r3 = "clips_capture_controller_created_during_use_audio"
            r4 = r0
            r6 = r9
            r7 = r9
            r8 = r9
            r2.A0D(r3, r4, r6, r7, r8, r9)
        L_0x0b09:
            return
        L_0x0b0a:
            com.instagram.common.session.UserSession r4 = r0.A1D
            X.1Av r7 = X.1Au.A00(r4)
            X.0s0 r2 = r7.A0j
            X.0YZ[] r6 = X.1Av.A8a
            r5 = 169(0xa9, float:2.37E-43)
            r1 = r6[r5]
            java.lang.Object r1 = r2.CDM(r7, r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0af4
            X.28D r2 = X.28D.A1e
            r1 = r64
            if (r1 != r2) goto L_0x0af4
            r1 = 36316087382904768(0x81054a00170fc0, double:3.029778121870822E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 == 0) goto L_0x0af4
            r1 = 36316087382511547(0x81054a00110fbb, double:3.029778121622147E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 == 0) goto L_0x0af4
            boolean r1 = X.JU9.A01(r4)
            if (r1 == 0) goto L_0x0af4
            android.content.Context r2 = r0.A11
            X.8ab r3 = new X.8ab
            r3.<init>((android.content.Context) r2)
            r1 = 2131238396(0x7f081dfc, float:1.809307E38)
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r1)
            r3.A0i(r1)
            r1 = 2131965941(0x7f1337f5, float:1.9568706E38)
            r3.A09(r1)
            r1 = 2131965940(0x7f1337f4, float:1.9568704E38)
            r3.A08(r1)
            r3.A06()
            r2 = 2131964884(0x7f1333d4, float:1.9566562E38)
            X.AJz r1 = new X.AJz
            r1.<init>(r0)
            r3.A0G(r1, r2)
            android.app.Dialog r1 = r3.A02()
            r0.A04 = r1
            X.1Av r4 = X.1Au.A00(r4)
            X.0s0 r3 = r4.A0j
            r2 = r6[r5]
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r31)
            r3.Epx(r4, r1, r2)
            android.app.Dialog r0 = r0.A04
            if (r0 == 0) goto L_0x0af4
            X.AnonymousClass0fN.A00(r0)
            goto L_0x0af4
        L_0x0b8f:
            android.content.Context r10 = r0.A11
            r1 = 2131967893(0x7f133f95, float:1.9572665E38)
            goto L_0x0b9e
        L_0x0b95:
            boolean r1 = r2.A04
            if (r1 != 0) goto L_0x0bae
            android.content.Context r10 = r0.A11
            r1 = 2131955557(0x7f130f65, float:1.9547645E38)
        L_0x0b9e:
            java.lang.String r1 = r10.getString(r1)
        L_0x0ba2:
            X.Anh r8 = new X.Anh
            r8.<init>(r10, r1)
            r1 = 1000(0x3e8, double:4.94E-321)
            X.11Z.A04(r8, r1)
            goto L_0x0993
        L_0x0bae:
            boolean r1 = r2.A05
            if (r1 == 0) goto L_0x0bb7
            android.content.Context r10 = r0.A11
            java.lang.String r1 = r2.A03
            goto L_0x0ba2
        L_0x0bb7:
            com.instagram.music.common.model.MusicDataSource r1 = r10.A05
            if (r1 == 0) goto L_0x0b8f
            r1 = r31
            r0.A1I(r8, r1)
            goto L_0x0993
        L_0x0bc2:
            X.8IN r10 = r0.A1p
            X.2Fk r8 = r10.A00
            X.4DH r2 = r0.A1B
            X.PqY r1 = new X.PqY
            r32 = r1
            r33 = r0
            r34 = r12
            r35 = r14
            r36 = r13
            r37 = r21
            r32.<init>((java.lang.Object) r33, (java.lang.Object) r34, (java.lang.String) r35, (java.lang.String) r36, (int) r37)
            X.8Io r12 = new X.8Io
            r12.<init>(r1)
            r8.A06(r2, r12)
            X.8Ic r1 = r0.A1a
            X.14i.A05(r1)
            X.82t r1 = r0.A1y
            java.lang.String r36 = r1.BUn()
            X.6oS r2 = X.C318116oQ.A00(r10)
            r38 = 6
            X.MGN r1 = new X.MGN
            r32 = r1
            r33 = r10
            r34 = r11
            r35 = r13
            r37 = r9
            r32.<init>(r33, r34, r35, r36, r37, r38)
            r8 = r24
            X.1Eo.A05(r8, r1, r2)
            goto L_0x094b
        L_0x0c08:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C353498Hw.<init>(android.view.View, android.view.ViewGroup, X.8ZN, X.86c, X.86W, X.848, X.4DH, X.82X, com.instagram.common.session.UserSession, X.2eb, X.8Yz, X.87i, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, X.85o, X.8Fl, X.85X, X.82p, X.823, X.8HD, X.8E7, X.8FA, X.80D, X.8Ht, X.8AL, X.84j, X.86Y, X.84v, X.83s, X.81m, X.8Fj, X.80U, X.85M, X.85L, X.88E, X.8Hv, X.8Cx, X.50r, X.825, X.6if, X.80x, X.88F, X.82t, com.instagram.ui.widget.interactive.InteractiveDrawableContainer):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0074, code lost:
        if (X.182.A06(X.0Tu.A05, r0.A0Q, 36320433889812907L) == true) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        if (r1 == 270) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0I(com.google.common.collect.ImmutableList r28, com.google.common.collect.ImmutableList r29, com.instagram.common.gallery.metadata.MediaUploadMetadata r30, X.C353498Hw r31, java.io.File r32, java.lang.Boolean r33, java.lang.Integer r34, java.lang.Integer r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.util.List r39, int r40, int r41, int r42, int r43, int r44, int r45, boolean r46, boolean r47) {
        /*
            r6 = r41
            r5 = r31
            X.2Nn r0 = r5.A20
            r41 = r0
            boolean r0 = r41.A02()
            if (r0 != 0) goto L_0x0018
            android.content.Context r3 = r5.A11
            r2 = 0
            java.lang.String r1 = "send to @haydenkai ClipsDirectoryProvider is not valid and we hit this point somehow"
            r0 = 0
            X.C64169LRs.A01(r3, r2, r1, r0)
        L_0x0017:
            return
        L_0x0018:
            X.80x r0 = r5.A1v
            com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec r9 = r0.A00()
            r0 = 90
            r1 = r43
            if (r1 == r0) goto L_0x002a
            r0 = 270(0x10e, float:3.78E-43)
            r4 = r42
            if (r1 != r0) goto L_0x002d
        L_0x002a:
            r4 = r6
            r6 = r42
        L_0x002d:
            X.8Hv r7 = r5.A1q
            float r1 = r7.A02
            float r0 = r7.A00
            r3 = 1
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0045
            float r1 = r7.A03
            float r0 = r7.A01
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0045
            boolean r0 = r7.A0C
            if (r0 != 0) goto L_0x0045
            r3 = 0
        L_0x0045:
            r11 = 1
            r2 = 0
            r10 = r40
            r20 = r39
            r26 = r37
            r21 = r36
            r18 = r28
            r42 = r47
            r25 = r34
            r43 = r46
            r24 = r33
            r14 = r45
            r45 = r32
            r23 = r30
            r34 = r35
            if (r3 == 0) goto L_0x0076
            X.JXi r0 = r5.A0F
            if (r0 == 0) goto L_0x0117
            com.instagram.common.session.UserSession r8 = r0.A0Q
            X.0Tu r3 = X.0Tu.A05
            r0 = 36320433889812907(0x81093e001721ab, double:3.0325268703415074E-306)
            boolean r0 = X.182.A06(r3, r8, r0)
            if (r0 != r11) goto L_0x0117
        L_0x0076:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r3 = r5.A1s
            X.50r r1 = r5.A1t
            X.5kq r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel.A00(r3)
            if (r0 != 0) goto L_0x0084
            r0 = 0
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel.A08(r3, r1, r0)
        L_0x0084:
            r0 = r21
            r5.A0T = r0
            A0m(r5)
            A1B(r5, r11)
            r3 = 3
            r0 = r45
            com.instagram.common.gallery.Medium r8 = X.C282665Eg.A03(r0, r3, r2)
            r8.A0B = r6
            r8.A04 = r4
            com.instagram.common.gallery.metadata.MediaUploadMetadata r1 = r8.A0G
            r0 = r23
            r1.A00(r0)
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r8.A0G
            java.lang.String r0 = r0.A0A
            if (r0 == 0) goto L_0x00ac
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00c2
        L_0x00ac:
            android.net.Uri r0 = r8.A02()
            java.lang.String r0 = X.C59782JYb.A00(r0)
            java.lang.String r1 = X.C59737JVv.A04(r0)
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x00c2
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r8.A0G
            r0.A0A = r1
        L_0x00c2:
            X.7zv r7 = new X.7zv
            r7.<init>(r8, r6, r4, r2)
            r0 = r42
            r7.A1L = r0
            r0 = r38
            r7.A0r = r0
            r7.A07 = r10
            r7.A0H = r2
            r7.A06 = r10
            com.instagram.common.gallery.metadata.MediaUploadMetadata r1 = r7.A02()
            r0 = r23
            r1.A00(r0)
            r0 = r20
            r7.A0w = r0
            r1 = 54
            if (r35 == 0) goto L_0x010b
            int r0 = r34.intValue()
            if (r0 != r1) goto L_0x010b
        L_0x00ec:
            X.886 r20 = X.AnonymousClass886.A09
            r19 = r29
            r21 = r5
            r22 = r7
            r23 = r45
            r27 = r10
            r28 = r1
            r29 = r44
            r30 = r14
            r31 = r43
            r32 = r2
            A0J(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            X.88V r0 = r5.A1o
            r0.A01()
            return
        L_0x010b:
            int[] r0 = X.C59776JXv.A00
            int r0 = r25.intValue()
            r1 = 1
            if (r0 != r3) goto L_0x00ec
            r1 = 35
            goto L_0x00ec
        L_0x0117:
            r0 = r45
            java.io.File r16 = A07(r5, r0)
            if (r16 == 0) goto L_0x0017
            X.85M r13 = r5.A1d
            android.content.Context r8 = r5.A11
            X.4DH r0 = r5.A1B
            androidx.fragment.app.FragmentActivity r12 = r0.requireActivity()
            X.8IQ r0 = r5.A1k
            X.87s r0 = r0.A03
            X.4gw r0 = r0.A04
            r1 = 0
            if (r0 == 0) goto L_0x0133
            r1 = 1
        L_0x0133:
            r3 = 2131969785(0x7f1346f9, float:1.9576503E38)
            android.widget.FrameLayout r0 = r13.A00
            if (r0 != 0) goto L_0x0187
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r0.<init>(r8)
            r13.A00 = r0
            r0.setClickable(r11)
            if (r1 == 0) goto L_0x0158
            android.widget.FrameLayout r1 = r13.A00
            if (r1 == 0) goto L_0x0158
            r0 = 2130970254(0x7f04068e, float:1.7549213E38)
            int r0 = X.2Yu.A0H(r8, r0)
            int r0 = r8.getColor(r0)
            r1.setBackgroundColor(r0)
        L_0x0158:
            android.view.LayoutInflater r2 = r12.getLayoutInflater()
            r1 = 2131627349(0x7f0e0d55, float:1.888196E38)
            android.widget.FrameLayout r0 = r13.A00
            android.view.View r1 = r2.inflate(r1, r0)
            r0 = 2131438255(0x7f0b2aaf, float:1.8498432E38)
            android.view.View r1 = r1.requireViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.content.res.Resources r0 = r12.getResources()
            java.lang.CharSequence r0 = r0.getText(r3)
            r1.setText(r0)
            android.widget.FrameLayout r2 = r13.A00
            r1 = -1
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r1, r1)
            r12.addContentView(r2, r0)
            A0m(r5)
        L_0x0187:
            r0 = r21
            r5.A0T = r0
            A0m(r5)
            A1B(r5, r11)
            X.861 r0 = r5.A2T
            r0.A01()
            int r0 = r9.A03
            r40 = r0
            int r0 = r9.A02
            r39 = r0
            X.JXi r0 = r5.A0F
            if (r0 == 0) goto L_0x01a5
            r0.A0G()
        L_0x01a5:
            com.instagram.common.session.UserSession r0 = r5.A1D
            r38 = r0
            java.util.concurrent.ExecutorService r0 = r5.A24
            r19 = r0
            java.lang.Integer r17 = java.lang.Integer.valueOf(r10)
            java.lang.String r11 = r9.A04
            int r0 = r9.A00
            r22 = r0
            int r15 = r9.A01
            int r0 = r7.A07
            if (r0 == 0) goto L_0x0320
            int r0 = r7.A06
            if (r0 == 0) goto L_0x0320
            float r1 = r7.A02
            float r0 = r7.A00
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x01d5
            float r1 = r7.A03
            float r0 = r7.A01
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x01d5
            boolean r0 = r7.A0C
            if (r0 == 0) goto L_0x01ec
        L_0x01d5:
            com.instagram.common.session.UserSession r0 = r7.A0F
            X.27r r2 = X.27p.A01(r0)
            X.283 r0 = r2.A04
            X.JVj r1 = r0.A0C
            X.4yP r0 = r2.A0J()
            if (r0 == 0) goto L_0x01ec
            if (r1 == 0) goto L_0x01ec
            java.lang.String r0 = "MULTITOUCH_TRANSFORMATION_APPLIED_ON_IMPORTED_SEGMENT"
            r2.A1Q(r1, r0)
        L_0x01ec:
            int r0 = r7.A07
            float r2 = (float) r0
            float r0 = r7.A00
            float r2 = r2 * r0
            float r0 = r7.A04
            float r2 = r2 * r0
            int r0 = r7.A06
            float r1 = (float) r0
            float r0 = r7.A01
            float r1 = r1 * r0
            float r0 = r7.A05
            float r1 = r1 * r0
            r12 = 0
            android.graphics.RectF r10 = new android.graphics.RectF
            r10.<init>(r12, r12, r2, r1)
            android.graphics.Matrix r0 = r7.A0A
            r0.mapRect(r10)
            int r0 = r7.A07
            float r2 = (float) r0
            float r0 = r7.A02
            float r2 = r2 * r0
            float r0 = r7.A04
            float r2 = r2 * r0
            int r0 = r7.A06
            float r9 = (float) r0
            float r0 = r7.A03
            float r9 = r9 * r0
            float r0 = r7.A05
            float r9 = r9 * r0
            float r0 = r10.left
            float r0 = -r0
            float r0 = r0 / r2
            r3 = 1065353216(0x3f800000, float:1.0)
            float r13 = X.C229632nm.A02(r0, r12, r3)
            float r0 = r10.left
            float r1 = -r0
            int r0 = r7.A07
            float r0 = (float) r0
            float r1 = r1 + r0
            float r1 = r1 / r2
            float r2 = X.C229632nm.A02(r1, r12, r3)
            int r0 = r7.A06
            float r1 = (float) r0
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x031d
            float r0 = r10.top
            float r0 = -r0
            float r0 = r0 + r1
            float r0 = r0 / r9
            float r0 = X.C229632nm.A02(r0, r12, r3)
            float r0 = r3 - r0
        L_0x0243:
            int r1 = r7.A06
            float r1 = (float) r1
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0254
            float r1 = r10.top
            float r1 = -r1
            float r1 = r1 / r9
            float r1 = r3 - r1
            float r3 = X.C229632nm.A02(r1, r12, r3)
        L_0x0254:
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>(r13, r0, r2, r3)
        L_0x0259:
            X.Aba r13 = new X.Aba
            r27 = r13
            r29 = r23
            r30 = r5
            r31 = r16
            r32 = r24
            r33 = r25
            r35 = r21
            r36 = r26
            r37 = r20
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r2 = 3
            r0 = r19
            X.0qQ.A0B(r0, r2)
            r0 = 12
            X.0qQ.A0B(r11, r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "sourceWidth= "
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = ", sourceHeight= "
            r2.append(r0)
            r2.append(r4)
            java.lang.String r0 = ", outputFile= "
            r2.append(r0)
            java.lang.String r0 = r16.getPath()
            r2.append(r0)
            java.lang.String r0 = ", targetWidth= "
            r2.append(r0)
            r0 = r40
            r2.append(r0)
            java.lang.String r0 = ", targetHeight= "
            r2.append(r0)
            r0 = r39
            r2.append(r0)
            java.lang.String r0 = ", fillScreen = "
            r2.append(r0)
            r0 = r43
            r2.append(r0)
            java.lang.String r0 = ", targetEncodingProfile= "
            r2.append(r0)
            r2.append(r11)
            java.lang.String r0 = ", targetAudioChannelCount= "
            r2.append(r0)
            r0 = r22
            r2.append(r0)
            java.lang.String r0 = ", targetAudioSampleRate= "
            r2.append(r0)
            r2.append(r15)
            java.lang.String r0 = ", trimStartTimeInMs= "
            r2.append(r0)
            r0 = r44
            r2.append(r0)
            java.lang.String r0 = ", trimEndTimeInMs = "
            r2.append(r0)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "Clips:transcodeVideo"
            X.0KC.A0D(r0, r2)
            r0 = r44
            if (r0 >= r14) goto L_0x0323
            X.0nO r2 = X.0nY.A00()
            X.RAZ r0 = new X.RAZ
            r18 = r11
            r20 = r14
            r21 = r44
            r23 = r15
            r24 = r40
            r25 = r39
            r26 = r6
            r27 = r4
            r28 = r43
            r29 = r42
            r9 = r0
            r10 = r8
            r11 = r1
            r12 = r38
            r14 = r41
            r15 = r45
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r2.ATE(r0)
            return
        L_0x031d:
            r0 = 0
            goto L_0x0243
        L_0x0320:
            r1 = 0
            goto L_0x0259
        L_0x0323:
            java.lang.String r2 = "start time is larger than or equal to end time: start="
            java.lang.String r1 = " end="
            java.lang.String r1 = X.002.A02(r0, r14, r2, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C353498Hw.A0I(com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableList, com.instagram.common.gallery.metadata.MediaUploadMetadata, X.8Hw, java.io.File, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.util.List, int, int, int, int, int, int, boolean, boolean):void");
    }
}
