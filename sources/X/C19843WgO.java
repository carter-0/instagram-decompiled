package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.view.TextureView;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.WgO  reason: case insensitive filesystem */
public final class C19843WgO implements C232732uM {
    public Bitmap A00 = null;
    public MediaMapPin A01 = null;
    public boolean A02;
    public AnonymousClass0iw A03 = null;
    public String A04 = null;
    public final AnonymousClass4M3 A05;
    public final List A06 = new CopyOnWriteArrayList();
    public final UserSession A07;
    public final C71662eb A08;
    public final Map A09 = new HashMap();

    public final void onCompletion() {
    }

    public final void onCues(List list) {
    }

    public final void onDrawnToSurface() {
    }

    public final void onLoop(int i) {
    }

    public final void onProgressStateChanged(boolean z) {
    }

    public final void onSeeking(long j) {
    }

    public final void onStopVideo(String str, boolean z) {
    }

    public final void onStopped(C263754Nf r1, int i) {
    }

    public final void onSurfaceTextureDestroyed() {
    }

    public final void onVideoDownloading(C263754Nf r1) {
    }

    public final void onVideoPlayerError(C263754Nf r1, String str) {
    }

    public final void onVideoPrepared(C263754Nf r1, boolean z) {
    }

    public final void onVideoStartedPlaying(C263754Nf r1) {
    }

    public final void onVideoSwitchToWarmupPlayer(C263754Nf r1) {
    }

    public final void onVideoViewPrepared(C263754Nf r1) {
    }

    public final int A00(String str) {
        Map map = this.A09;
        Number A14 = C51966G9m.A14(str, map);
        if (A14 == null) {
            A14 = C51967G9n.A0k();
            map.put(str, A14);
        }
        return A14.intValue();
    }

    public final void A01() {
        C267324bN r2;
        MediaMapPin mediaMapPin = this.A01;
        String str = null;
        if (mediaMapPin != null) {
            C276014sL r0 = mediaMapPin.A03;
            if (r0 != null) {
                r2 = C295325ny.A02(r0);
            } else {
                r2 = null;
            }
        } else {
            r2 = null;
        }
        MediaMapPin mediaMapPin2 = this.A01;
        if (mediaMapPin2 != null) {
            str = C18231Vnv.A01(mediaMapPin2);
        }
        if (this.A05 != null && this.A02 && r2 != null && str != null) {
            this.A02 = false;
            A02(r2, str);
        }
    }

    public final void A02(C267324bN r14, String str) {
        String moduleName;
        UserSession userSession = this.A07;
        if (182.A06(0Tu.A05, userSession, 36326017345861073L)) {
            moduleName = this.A04;
            moduleName.getClass();
        } else {
            AnonymousClass0iw r0 = this.A03;
            r0.getClass();
            moduleName = r0.getModuleName();
        }
        AnonymousClass4M3 r1 = this.A05;
        if (r1.isPlaying()) {
            r1.EyP("", true);
        }
        AnonymousClass4M1 r02 = (AnonymousClass4M1) r1;
        r02.A0Z = true;
        r02.A06 = 1;
        AnonymousClass3WR A092 = r14.A09(userSession, (Integer) null);
        C263754Nf r6 = new C263754Nf((Object) r14, 0);
        0qQ.A0B(moduleName, 6);
        r1.E4H(new C263794Nj((C242423Ua) this.A08.A01(), new C263414Lx(false, false, false, false), A092, r6, r14.A0N, moduleName, 1.0f, 0, A00(str), true));
        r1.EKy(A00(str), true);
        r1.Ech(true);
    }

    public final void onPrepare(C263754Nf r4) {
        MediaMapPin mediaMapPin = this.A01;
        if (mediaMapPin != null) {
            this.A05.EKy(A00(C18231Vnv.A01(mediaMapPin)), true);
        }
    }

    public final void onProgressUpdate(int i, int i2, boolean z) {
        MediaMapPin mediaMapPin = this.A01;
        if (mediaMapPin != null) {
            C66580MXl.A1T(C18231Vnv.A01(mediaMapPin), this.A09, i);
        }
    }

    public final void onSurfaceTextureUpdated(C263754Nf r6) {
        String A012;
        Bitmap bitmap;
        AnonymousClass4M3 r3 = this.A05;
        if (r3.isPlaying()) {
            this.A00 = ((TextureView) C13988Tno.A0G((ViewGroup) this.A08.A01())).getBitmap();
            MediaMapPin mediaMapPin = this.A01;
            if (mediaMapPin != null) {
                C66580MXl.A1T(C18231Vnv.A01(mediaMapPin), this.A09, r3.getCurrentPositionMs());
                for (VN8 vn8 : this.A06) {
                    C16076Uo3 uo3 = vn8.A00;
                    if (uo3 != null) {
                        String str = uo3.A0G;
                        MediaMapPin mediaMapPin2 = this.A01;
                        if (mediaMapPin2 == null) {
                            A012 = null;
                        } else {
                            A012 = C18231Vnv.A01(mediaMapPin2);
                        }
                        if (0qQ.A0K(str, A012) && (bitmap = this.A00) != null) {
                            C16076Uo3 uo32 = vn8.A00;
                            0qQ.A0A(uo32);
                            U0Z u0z = uo32.A05;
                            if (u0z instanceof C16079Uo6) {
                                C16079Uo6 uo6 = (C16079Uo6) u0z;
                                uo6.A08 = bitmap;
                                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                                uo6.A0A = bitmapShader;
                                uo6.A0L.setShader(bitmapShader);
                                uo6.invalidateSelf();
                            }
                        }
                    }
                }
            }
        }
    }

    public C19843WgO(Context context, AnonymousClass0iw r6, UserSession userSession, C71662eb r8) {
        this.A07 = userSession;
        this.A08 = r8;
        if (182.A06(0Tu.A05, userSession, 36326017345861073L)) {
            String moduleName = r6.getModuleName();
            this.A04 = moduleName;
            moduleName.getClass();
            this.A05 = AnonymousClass4M0.A00(context, userSession, (C252323ov) null, this, moduleName);
            return;
        }
        this.A03 = r6;
        this.A05 = AnonymousClass4M0.A00(context, userSession, (C252323ov) null, this, r6.getModuleName());
    }
}
