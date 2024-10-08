package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.cameracore.musiceffect.AudioServiceConfigurationAnnouncer;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.camera.effect.mq.IgCameraEffectsController;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.ARAudioEffectData;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicDataSource;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.music.common.ui.LoadingSpinnerView;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: X.8Zk  reason: invalid class name and case insensitive filesystem */
public final class C357738Zk implements AnonymousClass8Zl {
    public int A00;
    public A3h A01;
    public AudioOverlayTrack A02;
    public C349337zz A03;
    public Integer A04;
    public boolean A05;
    public boolean A06;
    public final Handler A07;
    public final Handler A08 = new Handler(Looper.getMainLooper());
    public final View A09;
    public final ViewGroup A0A;
    public final AnonymousClass4DH A0B;
    public final AnonymousClass82W A0C;
    public final UserSession A0D;
    public final AnonymousClass8E0 A0E;
    public final AnonymousClass8E3 A0F;
    public final C357838Zw A0G;
    public final C3499982t A0H;
    public final LoadingSpinnerView A0I;
    public final AnonymousClass85s A0J;
    public final boolean A0K;
    public final int A0L;
    public final Drawable A0M;
    public final C357638Yz A0N;
    public final AnonymousClass8E2 A0O;
    public final C357878a0 A0P;
    public final C357778Zp A0Q = new C357778Zp(this);
    public final AnonymousClass846 A0R;
    public final C357998aC A0S;
    public final C357808Zt A0T;
    public final MusicAttributionConfig A0U;
    public final MusicOverlayStickerModel A0V;
    public final C353638Im A0W;
    public final C357788Zr A0X;
    public final C234462xu A0Y;
    public final C349337zz A0Z;
    public final Runnable A0a;
    public final ExecutorService A0b;
    public C65509LuX musicPrecaptureSearchController;

    public static final C65509LuX A01(C357738Zk r10) {
        C357738Zk r6 = r10;
        C65509LuX luX = r10.musicPrecaptureSearchController;
        if (luX != null) {
            return luX;
        }
        AnonymousClass4DH r1 = r10.A0B;
        if (!r1.isAdded()) {
            return luX;
        }
        View view = r10.A09;
        0hq childFragmentManager = r1.getChildFragmentManager();
        0qQ.A07(childFragmentManager);
        C65509LuX luX2 = new C65509LuX(view, childFragmentManager, r10.A0D, r6, r10.A0H, r10.A0U, r10.A0Y, r10.A0L);
        r6.musicPrecaptureSearchController = luX2;
        return luX2;
    }

    private final void A03() {
        this.A03 = null;
        this.A05 = false;
        this.A02 = null;
        this.A0G.A01 = null;
        this.A07.removeCallbacks(this.A0a);
    }

    public static final void A08(C357738Zk r6, AudioOverlayTrack audioOverlayTrack) {
        r6.A05 = true;
        C40570AeH aeH = new C40570AeH(r6, audioOverlayTrack);
        C40573AeK aeK = new C40573AeK(r6, audioOverlayTrack);
        0qQ.A0B(aeH, 1);
        0qQ.A0B(aeK, 2);
        r6.A0W.A03(audioOverlayTrack, aeH, aeK, audioOverlayTrack.A02, false, false);
    }

    public final void Csu(CameraAREffect cameraAREffect, CameraAREffect cameraAREffect2) {
        this.A06 = false;
        if (cameraAREffect == null || !cameraAREffect.A0I()) {
            if (cameraAREffect2 == null) {
                return;
            }
        } else if (cameraAREffect2 == null || !cameraAREffect2.A0I()) {
            A0C(true);
            return;
        }
        if (cameraAREffect2.A0I() && this.A03 == null) {
            ImageView imageView = this.A0O.A00;
            if (imageView.getVisibility() == 0) {
                this.A0R.A00().A01(this.A09, imageView, C366978pz.A0l);
            } else {
                this.A06 = true;
            }
        }
    }

    public final void DCU() {
        A0C(true);
    }

    public final void DDR() {
        A0C(false);
    }

    public final void DDY() {
        this.A01 = null;
        this.A0J.pause();
    }

    public final void DTG() {
    }

    public final String getName() {
        return "MusicPrecaptureController";
    }

    private final void A02() {
        C349337zz r0 = this.A03;
        if (r0 != null) {
            MusicOverlayStickerModel BUu = r0.BUu();
            MusicDataSource A002 = C59670JTa.A00(BUu);
            AnonymousClass85s r2 = this.A0J;
            if (!0qQ.A0K(A002, r2.A05.AvO())) {
                int i = 0;
                r2.Edj(C59670JTa.A00(BUu), false);
                Integer num = BUu.A0O;
                if (num != null) {
                    i = num.intValue();
                }
                r2.Edn(i);
            }
            this.A05 = true;
            A0A(this, AnonymousClass05K.A0C);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final void A04() {
        B3d b3d;
        AnonymousClass85s r4 = this.A0J;
        r4.Edn(60000);
        Drawable drawable = this.A0M;
        if ((drawable instanceof B3d) && (b3d = (B3d) drawable) != null) {
            MusicOverlayStickerModel musicOverlayStickerModel = this.A0V;
            if (musicOverlayStickerModel != null) {
                A9I a9i = new A9I(musicOverlayStickerModel);
                a9i.A0O = 60000;
                b3d.DT8(a9i.A00());
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        if (C255613uQ.A00(this.A0D, (Integer) null, false, false)) {
            r4.Eqq(1.0f);
        }
        r4.A01 = true;
    }

    public static final void A05(C357738Zk r4) {
        AnonymousClass8ZH r3;
        Integer num = AnonymousClass05K.A0C;
        AnonymousClass85s r2 = r4.A0J;
        boolean z = false;
        if (num == r2.C9B()) {
            z = true;
        }
        AnonymousClass8E0 r1 = r4.A0E;
        if (!z) {
            r3 = AnonymousClass8ZH.LOADING;
        } else if (r2.A05.isPlaying()) {
            r3 = AnonymousClass8ZH.STOP;
        } else {
            r3 = AnonymousClass8ZH.PLAY;
        }
        r1.A01.A01(r3);
        AnonymousClass6KL r22 = r1.A02;
        boolean z2 = false;
        if (r3 == AnonymousClass8ZH.PLAY) {
            z2 = true;
        }
        r22.A05 = z2;
        r22.invalidateSelf();
    }

    public static final void A06(C357738Zk r1) {
        r1.A0J.release();
        r1.A03();
        r1.A0B(r1.A03);
        r1.A05 = false;
    }

    public static final void A07(C357738Zk r13) {
        int i;
        Integer num;
        if (r13.A0J.C9B() != AnonymousClass05K.A00) {
            C349337zz r0 = r13.A03;
            if (r0 == null || (num = r0.BUu().A0K) == null) {
                i = 0;
            } else {
                i = num.intValue();
            }
            C349337zz r2 = r13.A03;
            if (r2 != null) {
                C357878a0 r1 = r13.A0P;
                MusicOverlayStickerModel BUu = r2.BUu();
                C357918a4 r5 = r1.A00;
                C357918a4.A03(MusicAssetModel.A03(BUu), r5, r2.BV4(), Integer.valueOf(i), Integer.valueOf(r2.BzW()), false, true, true, false);
            }
            A0A(r13, AnonymousClass05K.A0N);
        }
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.9uJ, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v4, types: [X.9uK, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v12, types: [X.9uL, java.lang.Object] */
    public static final void A09(C357738Zk r6, AudioOverlayTrack audioOverlayTrack) {
        if (audioOverlayTrack != null && audioOverlayTrack.A06 != null) {
            C349337zz r0 = r6.A03;
            if (r0 != null) {
                MusicOverlayStickerModel BUu = r0.BUu();
                r6.A0Y.A00();
                DownloadedTrack downloadedTrack = audioOverlayTrack.A06;
                if (downloadedTrack != null) {
                    C357838Zw r4 = r6.A0G;
                    String canonicalPath = new File(downloadedTrack.A02).getCanonicalPath();
                    0qQ.A07(canonicalPath);
                    ? obj = new Object();
                    obj.A01 = canonicalPath;
                    obj.A00 = (long) audioOverlayTrack.A02;
                    String str = BUu.A0m;
                    String str2 = BUu.A0Y;
                    ? obj2 = new Object();
                    obj2.A01 = str;
                    obj2.A00 = str2;
                    ? obj3 = new Object();
                    obj3.A00 = obj;
                    obj3.A01 = obj2;
                    r4.A01(obj3);
                }
                AnonymousClass8E0 r2 = r6.A0E;
                r2.A01.A01(AnonymousClass8ZH.STOP);
                AnonymousClass6KL r1 = r2.A02;
                r1.A05 = false;
                r1.invalidateSelf();
                r6.A07.postDelayed(r6.A0a, 16);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public static final void A0A(C357738Zk r6, Integer num) {
        Integer num2 = r6.A04;
        if (num2 != num) {
            r6.A04 = num;
            if (num2 == AnonymousClass05K.A01 && num == AnonymousClass05K.A0C) {
                r6.A0R.A00().A01(r6.A09, r6.A0E.A00, C366978pz.A0m);
            }
            AnonymousClass8E3 r0 = r6.A0F;
            Integer num3 = r6.A04;
            AnonymousClass80R r3 = r0.A00;
            C355948Rz r2 = r3.A0d;
            Integer num4 = AnonymousClass05K.A0N;
            if (num3 == num4) {
                C355948Rz.A04(r2);
                r2.A0K.A00().CLF(false);
            } else {
                if (num2 == num4) {
                    r2.A0K.A00().Eu6(false);
                }
                C352888Fl.A0A(r2.A0C);
                C355948Rz.A06(r2);
            }
            AnonymousClass85X r02 = r3.A0n;
            r02.A08 = num3;
            AnonymousClass85X.A06(r02);
        }
    }

    private final void A0B(C349337zz r2) {
        Integer num;
        if (r2 != null) {
            this.A03 = r2;
            this.A00 = r2.BzW();
        }
        this.A0P.A00.A0F();
        if (r2 != null) {
            num = AnonymousClass05K.A0C;
        } else {
            num = AnonymousClass05K.A00;
        }
        A0A(this, num);
    }

    private final void A0C(boolean z) {
        JZ0 jz0;
        JZ0 jz02;
        Integer num = this.A04;
        Integer num2 = AnonymousClass05K.A00;
        if (num != num2) {
            this.A0P.A00.A0F();
            if (z) {
                this.A04 = num2;
                A03();
                Object obj = this.A0X.A01.get(0);
                0qQ.A07(obj);
                this.A00 = ((Number) obj).intValue();
                C65509LuX A012 = A01(this);
                if (!(A012 == null || (jz02 = A012.A00) == null)) {
                    jz02.A06();
                    JZ0 jz03 = A012.A00;
                    if (jz03 != null) {
                        jz03.A08(AnonymousClass05K.A01);
                    }
                }
                this.A0Y.A00();
            } else {
                C65509LuX A013 = A01(this);
                if (!(A013 == null || (jz0 = A013.A00) == null)) {
                    jz0.A09(AnonymousClass05K.A0C);
                }
            }
            this.A0J.release();
        }
    }

    private final boolean A0D() {
        CameraAREffect cameraAREffect = this.A0C.A00().A05.A09;
        if (cameraAREffect == null || !cameraAREffect.A0I()) {
            return false;
        }
        return true;
    }

    public static final boolean A0E(C357738Zk r3) {
        CameraAREffect cameraAREffect;
        AnonymousClass82W r1 = r3.A0C;
        if (r1.A00().A05.A09 == null || (cameraAREffect = r1.A00().A05.A09) == null || cameraAREffect.A0Z.get("audioFBA") == null || !r3.A0D() || r3.A0K) {
            return false;
        }
        return true;
    }

    public final Integer AuF() {
        return this.A04;
    }

    public final MusicOverlayStickerModel BUu() {
        C349337zz r0 = this.A03;
        if (r0 != null) {
            return r0.BUu();
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final boolean CKp() {
        if (this.A03 != null) {
            return true;
        }
        return false;
    }

    public final boolean CVH() {
        return this.A0K;
    }

    public final boolean CYI() {
        if (this.A04 == AnonymousClass05K.A00) {
            return true;
        }
        return false;
    }

    public final boolean CYz() {
        return this.A06;
    }

    public final void Cme(C352218Cl r4) {
        MusicOverlayStickerModel musicOverlayStickerModel;
        MusicOverlayStickerModel musicOverlayStickerModel2;
        if (this.A0K) {
            musicOverlayStickerModel = this.A0V;
            if (musicOverlayStickerModel == null) {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            C349337zz r0 = this.A03;
            if (r0 != null) {
                musicOverlayStickerModel2 = r0.BUu();
            } else {
                musicOverlayStickerModel2 = null;
            }
            if (this.A03 != null && musicOverlayStickerModel2 != null) {
                A9I a9i = new A9I(musicOverlayStickerModel2);
                a9i.A0O = 15000;
                musicOverlayStickerModel = a9i.A00();
            } else {
                return;
            }
        }
        r4.A0J = musicOverlayStickerModel;
    }

    public final void Cmf(List list) {
        C349337zz r0;
        int i;
        boolean z = this.A0K;
        if (z) {
            r0 = this.A0Z;
        } else {
            r0 = this.A03;
        }
        if (r0 != null) {
            MusicOverlayStickerModel BUu = r0.BUu();
            Integer num = BUu.A0K;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C349307zv r4 = (C349307zv) it.next();
                int i2 = r4.A0H;
                int i3 = r4.A06 - i2;
                Integer valueOf = Integer.valueOf(i2 + i);
                if (i3 <= 0) {
                    i3 = 15000;
                    if (z) {
                        i3 = 60000;
                    }
                }
                Integer valueOf2 = Integer.valueOf(i3);
                A9I a9i = new A9I(BUu);
                a9i.A0K = valueOf;
                a9i.A0O = valueOf2;
                a9i.A0L = null;
                r4.A0V = a9i.A00();
            }
        }
    }

    public final void Csr(ARAudioEffectData aRAudioEffectData) {
        DownloadedTrack downloadedTrack;
        AudioOverlayTrack audioOverlayTrack = this.A02;
        Integer num = null;
        if (audioOverlayTrack != null) {
            downloadedTrack = audioOverlayTrack.A06;
        } else {
            downloadedTrack = null;
        }
        AnonymousClass82X A002 = this.A0C.A00();
        if (downloadedTrack != null) {
            num = Integer.valueOf(downloadedTrack.A01);
        }
        A002.A00 = aRAudioEffectData;
        AnonymousClass82X.A00(A002, num);
    }

    public final void Cuw() {
        this.A0P.A00.A0F();
        this.A0J.pause();
        C65509LuX A012 = A01(this);
        if (A012 != null) {
            A012.A01(A00(this));
        }
        A0A(this, AnonymousClass05K.A01);
    }

    public final void D9p(AudioOverlayTrack audioOverlayTrack, C349337zz r4) {
        this.A02 = audioOverlayTrack;
        if (audioOverlayTrack != null) {
            this.A0J.pause();
            this.A0I.setLoadingStatus(JY5.LOADING);
            this.A0A.setVisibility(0);
            A08(this, audioOverlayTrack);
            C357998aC r0 = this.A0S;
            if (r0 != null) {
                r0.A01(this, audioOverlayTrack);
            }
        }
        A0B(r4);
    }

    public final void DCN() {
        int i;
        B3d b3d;
        if (!(this.A0N.A08.A00 instanceof AnonymousClass80O)) {
            this.A0C.A00().A06(this.A0Q);
            if (A0D()) {
                int intValue = this.A04.intValue();
                if (intValue == 0) {
                    C65509LuX A012 = A01(this);
                    if (A012 != null) {
                        A012.A00(A00(this));
                    }
                    A0A(this, AnonymousClass05K.A01);
                    return;
                } else if (intValue == 1) {
                    C65509LuX A013 = A01(this);
                    if (A013 != null) {
                        A013.A01(A00(this));
                        return;
                    }
                    return;
                } else if (intValue == 2) {
                    A02();
                    return;
                } else if (intValue != 3) {
                    throw new RuntimeException();
                } else {
                    return;
                }
            } else if (this.A0K) {
                AnonymousClass85s r4 = this.A0J;
                MusicOverlayStickerModel musicOverlayStickerModel = this.A0V;
                if (musicOverlayStickerModel != null) {
                    r4.Edj(C59670JTa.A00(musicOverlayStickerModel), false);
                    Integer num = musicOverlayStickerModel.A0O;
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = 0;
                    }
                    r4.Edn(i);
                    Drawable drawable = this.A0M;
                    if ((drawable instanceof B3d) && (b3d = (B3d) drawable) != null) {
                        b3d.DT8(musicOverlayStickerModel);
                    }
                    r4.Eqq(0.001f);
                    r4.A01 = false;
                    r4.E2p();
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
        this.A0Y.A00();
    }

    public final void DT0() {
        if (this.A03 == null) {
            A0A(this, AnonymousClass05K.A00);
        } else {
            A02();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005e, code lost:
        if (r0 != null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r1 == null) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DTD(int r6, int r7) {
        /*
            r5 = this;
            X.85s r2 = r5.A0J
            X.7zz r0 = r5.A03
            if (r0 == 0) goto L_0x0013
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = r0.BUu()
            com.instagram.music.common.model.MusicDataSource r0 = X.C59670JTa.A00(r0)
            android.net.Uri r1 = r0.A00
            r0 = 1
            if (r1 != 0) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            r4 = 0
            java.lang.String r3 = "Required value was null."
            if (r0 == 0) goto L_0x0058
            com.instagram.music.common.model.AudioOverlayTrack r0 = r5.A02
            if (r0 == 0) goto L_0x007e
            com.instagram.music.common.model.DownloadedTrack r1 = r0.A06
            if (r1 == 0) goto L_0x0078
            X.7zz r0 = r5.A03
            if (r0 == 0) goto L_0x0072
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = r0.BUu()
            java.lang.Integer r0 = r0.A0K
            if (r0 == 0) goto L_0x0031
            int r4 = r0.intValue()
        L_0x0031:
            int r4 = r1.A00(r4)
        L_0x0035:
            r2.Edo(r4)
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            java.lang.Integer r0 = r2.C9B()
            if (r1 != r0) goto L_0x0050
            boolean r0 = r5.A05
            if (r0 == 0) goto L_0x0050
            r0 = 0
            r5.A05 = r0
            boolean r0 = A0E(r5)
            if (r0 != 0) goto L_0x0050
            r2.E2p()
        L_0x0050:
            java.lang.Integer r0 = r5.A04
            if (r1 != r0) goto L_0x0057
            A05(r5)
        L_0x0057:
            return
        L_0x0058:
            boolean r0 = r5.A0K
            if (r0 == 0) goto L_0x0069
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = r5.A0V
            if (r0 == 0) goto L_0x0035
        L_0x0060:
            java.lang.Integer r0 = r0.A0K
            if (r0 == 0) goto L_0x0035
            int r4 = r0.intValue()
            goto L_0x0035
        L_0x0069:
            X.7zz r0 = r5.A03
            if (r0 == 0) goto L_0x0084
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = r0.BUu()
            goto L_0x0060
        L_0x0072:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0078:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x007e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0084:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C357738Zk.DTD(int, int):void");
    }

    public final void DTE() {
        if (this.A01 != null && AnonymousClass05K.A0C == this.A0J.C9B()) {
            A3h a3h = this.A01;
            if (a3h != null) {
                C353118Gi.A01(a3h.A00);
            }
            this.A01 = null;
        }
        this.A0G.A03.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        if (r1 == null) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DTI(int r8) {
        /*
            r7 = this;
            boolean r3 = r7.A0K
            java.lang.String r2 = "Required value was null."
            if (r3 == 0) goto L_0x0010
            com.instagram.music.common.model.MusicOverlayStickerModel r5 = r7.A0V
            if (r5 != 0) goto L_0x0018
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0010:
            X.7zz r0 = r7.A03
            if (r0 == 0) goto L_0x00c2
            com.instagram.music.common.model.MusicOverlayStickerModel r5 = r0.BUu()
        L_0x0018:
            com.instagram.music.common.model.AudioOverlayTrack r0 = r7.A02
            if (r0 == 0) goto L_0x00b3
            com.instagram.music.common.model.DownloadedTrack r6 = r0.A06
        L_0x001e:
            X.7zz r0 = r7.A03
            if (r0 == 0) goto L_0x002f
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = r0.BUu()
            com.instagram.music.common.model.MusicDataSource r0 = X.C59670JTa.A00(r0)
            android.net.Uri r1 = r0.A00
            r0 = 1
            if (r1 != 0) goto L_0x0030
        L_0x002f:
            r0 = 0
        L_0x0030:
            r4 = 0
            if (r0 == 0) goto L_0x00b0
            if (r6 == 0) goto L_0x00bc
            java.lang.Integer r0 = r5.A0K
            if (r0 == 0) goto L_0x00ae
            int r0 = r0.intValue()
        L_0x003d:
            int r0 = r6.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0045:
            X.7zz r1 = r7.A03
            if (r1 == 0) goto L_0x00a6
            com.instagram.music.common.model.MusicOverlayStickerModel r1 = r1.BUu()
            com.instagram.music.common.model.MusicDataSource r1 = X.C59670JTa.A00(r1)
            android.net.Uri r1 = r1.A00
            if (r1 == 0) goto L_0x00a6
            com.instagram.music.common.model.AudioOverlayTrack r1 = r7.A02
            if (r1 == 0) goto L_0x00b6
            int r1 = r1.A02
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x005f:
            if (r0 == 0) goto L_0x00a4
            int r2 = r0.intValue()
        L_0x0065:
            if (r1 == 0) goto L_0x00a2
            int r3 = r1.intValue()
        L_0x006b:
            int r2 = r8 - r2
            float r5 = (float) r2
            float r2 = (float) r3
            float r5 = r5 / r2
            r3 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            float r3 = X.0mi.A00(r5, r3, r2)
            X.8E0 r2 = r7.A0E
            X.8ZI r2 = r2.A01
            r2.A00(r3)
            android.graphics.drawable.Drawable r3 = r7.A0M
            boolean r2 = r3 instanceof X.AnonymousClass5MJ
            if (r2 == 0) goto L_0x009f
            r2 = 3085(0xc0d, float:4.323E-42)
            java.lang.String r2 = X.C273654mx.A00(r2)
            X.0qQ.A0C(r3, r2)
            X.5MJ r3 = (X.AnonymousClass5MJ) r3
            if (r0 == 0) goto L_0x00a0
            int r0 = r0.intValue()
        L_0x0095:
            int r8 = r8 - r0
            if (r1 == 0) goto L_0x009c
            int r4 = r1.intValue()
        L_0x009c:
            r3.EXC(r8, r4)
        L_0x009f:
            return
        L_0x00a0:
            r0 = 0
            goto L_0x0095
        L_0x00a2:
            r3 = 0
            goto L_0x006b
        L_0x00a4:
            r2 = 0
            goto L_0x0065
        L_0x00a6:
            if (r3 == 0) goto L_0x00ab
            java.lang.Integer r1 = r5.A0O
            goto L_0x005f
        L_0x00ab:
            java.lang.Integer r1 = r5.A0K
            goto L_0x005f
        L_0x00ae:
            r0 = 0
            goto L_0x003d
        L_0x00b0:
            java.lang.Integer r0 = r5.A0K
            goto L_0x0045
        L_0x00b3:
            r6 = 0
            goto L_0x001e
        L_0x00b6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x00bc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x00c2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C357738Zk.DTI(int):void");
    }

    public final void Dmh() {
        this.A0J.pause();
        if (this.A0K) {
            A04();
        }
    }

    public final void DvW(int i) {
        C349337zz r0 = this.A03;
        if (r0 != null) {
            MusicOverlayStickerModel BUu = r0.BUu();
            C349337zz r2 = this.A03;
            if (r2 != null) {
                Integer valueOf = Integer.valueOf(i);
                A9I a9i = new A9I(BUu);
                a9i.A0O = valueOf;
                r2.Edm(a9i.A00());
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void DvX(int i) {
        C349337zz r0 = this.A03;
        if (r0 != null) {
            MusicOverlayStickerModel BUu = r0.BUu();
            C349337zz r2 = this.A03;
            if (r2 != null) {
                Integer valueOf = Integer.valueOf(i);
                A9I a9i = new A9I(BUu);
                a9i.A0K = valueOf;
                r2.Edm(a9i.A00());
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void DxE(C349307zv r12) {
        DownloadedTrack downloadedTrack;
        C357808Zt r6;
        AudioOverlayTrack audioOverlayTrack = this.A02;
        if (audioOverlayTrack != null) {
            downloadedTrack = audioOverlayTrack.A06;
        } else {
            downloadedTrack = null;
        }
        if (A0E(this) || this.A0K || (r6 = this.A0T) == null || downloadedTrack == null) {
            this.A0F.A00.A14.A04(r12);
            return;
        }
        File file = new File(r12.A0k);
        File file2 = new File(r6.A00, "audio_burn_in_video.mp4");
        Context context = this.A09.getContext();
        0qQ.A07(context);
        UserSession userSession = this.A0D;
        ExecutorService executorService = this.A0b;
        File file3 = new File(downloadedTrack.A02);
        C40425Abw abw = new C40425Abw(this, r12, file2);
        0qQ.A0B(executorService, 3);
        0nY.A00().ATE(new KJI(context, userSession, abw, r6, file, file3, file2, executorService));
    }

    public final A6C Dy4(A3h a3h) {
        this.A01 = a3h;
        this.A0J.pause();
        if (this.A0K) {
            A04();
        }
        return new A6C("", 60000, true);
    }

    public final boolean onBackPressed() {
        C65509LuX A012;
        JZ0 jz0;
        if (!(this.A04 != AnonymousClass05K.A01 || (A012 = A01(this)) == null || (jz0 = A012.A00) == null)) {
            Boolean valueOf = Boolean.valueOf(jz0.A0A());
            if (valueOf == null) {
                throw new IllegalStateException("Required value was null.");
            } else if (valueOf.booleanValue()) {
                return true;
            }
        }
        if (this.A04 != AnonymousClass05K.A0N || !this.A0P.A00.A0M()) {
            return false;
        }
        return true;
    }

    public final void onPause() {
        this.A0J.onPause();
    }

    public final void onResume() {
        this.A0J.onResume();
        this.A0C.A00().A06(this.A0Q);
    }

    public static final MusicProduct A00(C357738Zk r1) {
        if (r1.A0D()) {
            CameraAREffect cameraAREffect = r1.A0C.A00().A05.A09;
            if (cameraAREffect == null || !cameraAREffect.A0d) {
                return MusicProduct.MUSIC_AR_EFFECT;
            }
            return MusicProduct.MUSIC_AR_EFFECT_DEMO;
        } else if (r1.A0K) {
            return MusicProduct.POST_CAPTURE_STICKER;
        } else {
            return MusicProduct.QUESTION_RESPONSE_RESHARE;
        }
    }

    public final C2802350v AN5() {
        C349337zz r0;
        if (A0D() || (r0 = this.A03) == null) {
            return null;
        }
        return r0;
    }

    public final void D89() {
        A06(this);
    }

    public final void DTC() {
        A05(this);
        C357838Zw r2 = this.A0G;
        CameraAREffect cameraAREffect = r2.A02.A00().A05.A09;
        if (cameraAREffect != null && cameraAREffect.A0I()) {
            boolean z = false;
            if (cameraAREffect.A0Z.get("audioFBA") != null) {
                z = true;
            }
            C357838Zw.A00(r2, z);
        }
    }

    public final void DTH() {
        A05(this);
        C357838Zw r3 = this.A0G;
        r3.A03.clear();
        AnonymousClass82W r2 = r3.A02;
        IgCameraEffectsController igCameraEffectsController = r2.A00().A05;
        igCameraEffectsController.A0C = false;
        C361848gv r0 = igCameraEffectsController.A07;
        if (r0 != null) {
            r0.A0I(false);
        }
        r2.A00().A05((C357848Zx) null);
        AudioServiceConfigurationAnnouncer audioServiceConfigurationAnnouncer = r3.A00;
        if (audioServiceConfigurationAnnouncer != null) {
            audioServiceConfigurationAnnouncer.pause();
        }
        r3.A00 = null;
    }

    public final void DlD() {
        A07(this);
    }

    public final void Dmk(boolean z) {
        if (A0E(this)) {
            C357838Zw r1 = this.A0G;
            C392179uL r0 = r1.A01;
            if (r0 != null) {
                r1.A01(r0);
            }
        } else if (!A0E(this)) {
            this.A0J.E2p();
        }
    }

    public final void Dt3(C66569MWx mWx) {
        JZ0 jz0;
        A03();
        MusicAssetModel A022 = MusicAssetModel.A02(mWx);
        MusicProduct A002 = A00(this);
        int A052 = A022.A05();
        String BUn = this.A0H.BUn();
        Integer valueOf = Integer.valueOf(A052);
        Af0 af0 = new Af0(C59670JTa.A02(A002, A022, 15000, valueOf, valueOf, (Integer) null, BUn, (String) null, (List) null), (C40599Aen) null, AnonymousClass6KJ.MUSIC_OVERLAY_SIMPLE, this.A00);
        af0.A04 = true;
        this.A03 = af0;
        C65509LuX A012 = A01(this);
        if (!(A012 == null || (jz0 = A012.A00) == null)) {
            jz0.A09(AnonymousClass05K.A0C);
        }
        A07(this);
    }

    public final void CxZ(C349337zz r1) {
        A0B(r1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x00d5, code lost:
        if (r23 == null) goto L_0x00d7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C357738Zk(android.graphics.drawable.Drawable r23, android.view.View r24, X.AnonymousClass4DH r25, X.AnonymousClass82W r26, com.instagram.common.session.UserSession r27, X.C357638Yz r28, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r29, X.AnonymousClass8E2 r30, X.AnonymousClass8E0 r31, X.AnonymousClass8E3 r32, X.AnonymousClass846 r33, X.C3499982t r34, com.instagram.music.common.config.MusicAttributionConfig r35, X.C234462xu r36, X.C349337zz r37, int r38) {
        /*
            r22 = this;
            r4 = 3
            r0 = 6
            r5 = r26
            X.0qQ.A0B(r5, r0)
            r0 = 7
            r1 = r34
            X.0qQ.A0B(r1, r0)
            r0 = 8
            r10 = r36
            X.0qQ.A0B(r10, r0)
            r0 = 9
            r3 = r33
            X.0qQ.A0B(r3, r0)
            r0 = 13
            r6 = r32
            X.0qQ.A0B(r6, r0)
            r2 = r22
            r2.<init>()
            r13 = r24
            r2.A09 = r13
            r14 = r25
            r2.A0B = r14
            r8 = r31
            r2.A0E = r8
            r7 = r30
            r2.A0O = r7
            r15 = r27
            r2.A0D = r15
            r2.A0C = r5
            r2.A0H = r1
            r2.A0Y = r10
            r2.A0R = r3
            r0 = r35
            r2.A0U = r0
            r0 = r38
            r2.A0L = r0
            r0 = r28
            r2.A0N = r0
            r2.A0F = r6
            r6 = r37
            r2.A0Z = r6
            r11 = r23
            r2.A0M = r11
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r1)
            r2.A08 = r0
            X.8Zp r0 = new X.8Zp
            r0.<init>(r2)
            r2.A0Q = r0
            android.content.Context r9 = r13.getContext()
            X.0qQ.A07(r9)
            r3 = 0
            X.8Zq r1 = new X.8Zq
            r1.<init>()
            X.8Im r0 = new X.8Im
            r0.<init>(r9, r15, r1, r3)
            r2.A0W = r0
            r0 = 2131435650(0x7f0b2082, float:1.8493148E38)
            android.view.View r1 = r13.requireViewById(r0)
            X.0qQ.A07(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r2.A0A = r1
            r0 = 2131435649(0x7f0b2081, float:1.8493146E38)
            android.view.View r0 = r1.requireViewById(r0)
            X.0qQ.A07(r0)
            com.instagram.music.common.ui.LoadingSpinnerView r0 = (com.instagram.music.common.ui.LoadingSpinnerView) r0
            r2.A0I = r0
            X.8Zr r1 = new X.8Zr
            r1.<init>(r9)
            r2.A0X = r1
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r2.A04 = r0
            java.util.ArrayList r0 = r1.A01
            java.lang.Object r0 = r0.get(r3)
            X.0qQ.A07(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r2.A00 = r0
            android.view.View r0 = r2.A09     // Catch:{ IOException -> 0x00c8 }
            android.content.Context r1 = r0.getContext()     // Catch:{ IOException -> 0x00c8 }
            X.0qQ.A07(r1)     // Catch:{ IOException -> 0x00c8 }
            com.instagram.common.session.UserSession r0 = r2.A0D     // Catch:{ IOException -> 0x00c8 }
            X.8Zt r12 = new X.8Zt     // Catch:{ IOException -> 0x00c8 }
            r12.<init>(r1, r0)     // Catch:{ IOException -> 0x00c8 }
            goto L_0x00d0
        L_0x00c8:
            java.lang.String r1 = "MusicPrecaptureController"
            java.lang.String r0 = "Unable to create edited video directories"
            r12 = 0
            X.0kD.A05(r1, r0, r12)
        L_0x00d0:
            r2.A0T = r12
            if (r37 == 0) goto L_0x00d7
            r0 = 1
            if (r23 != 0) goto L_0x00d8
        L_0x00d7:
            r0 = 0
        L_0x00d8:
            r2.A0K = r0
            if (r37 == 0) goto L_0x0168
            com.instagram.music.common.model.MusicOverlayStickerModel r1 = r6.BUu()
            X.A9I r0 = new X.A9I
            r0.<init>(r1)
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = r0.A00()
        L_0x00e9:
            r2.A0V = r0
            X.8Zv r0 = new X.8Zv
            r0.<init>(r2)
            X.8Zw r6 = new X.8Zw
            r6.<init>(r5, r0)
            r2.A0G = r6
            X.8Zy r5 = new X.8Zy
            r5.<init>(r2)
            X.8Zz r0 = new X.8Zz
            r0.<init>(r2)
            X.85s r1 = new X.85s
            r18 = r15
            r17 = r9
            r19 = r0
            r20 = r10
            r21 = r5
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21)
            r2.A0J = r1
            r1.A9Q(r2)
            X.2xy r0 = r1.A05
            r0.EP6(r6)
            X.8a0 r12 = new X.8a0
            r16 = r29
            r17 = r2
            r18 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r2.A0P = r12
            X.8GF r1 = r8.CrP()
            X.8aA r0 = new X.8aA
            r0.<init>(r2)
            r1.A00 = r0
            r1.A00()
            X.8GF r1 = r7.CrP()
            X.8aB r0 = new X.8aB
            r0.<init>(r2)
            r1.A00 = r0
            r1.A00()
            X.8aC r0 = new X.8aC
            r0.<init>(r14, r15)
            r2.A0S = r0
            r1 = 608(0x260, float:8.52E-43)
            X.0na r0 = new X.0na
            r0.<init>(r1, r4, r3, r3)
            r2.A0b = r0
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r1)
            r2.A07 = r0
            X.8aD r0 = new X.8aD
            r0.<init>(r2)
            r2.A0a = r0
            return
        L_0x0168:
            r0 = 0
            goto L_0x00e9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C357738Zk.<init>(android.graphics.drawable.Drawable, android.view.View, X.4DH, X.82W, com.instagram.common.session.UserSession, X.8Yz, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, X.8E2, X.8E0, X.8E3, X.846, X.82t, com.instagram.music.common.config.MusicAttributionConfig, X.2xu, X.7zz, int):void");
    }
}
