package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.MediaActionSound;
import com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController;
import com.google.common.collect.ImmutableList;
import com.instagram.common.gallery.metadata.ImmersiveMediaFields;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.ui.widget.shutterbutton.ShutterButton;
import java.util.List;

/* renamed from: X.8GJ  reason: invalid class name */
public final class AnonymousClass8GJ {
    public Bitmap A00;
    public MediaActionSound A01;
    public C352948Fr A02;
    public Integer A03;
    public boolean A04;
    public final Activity A05;
    public final AnonymousClass82X A06;
    public final UserSession A07;
    public final AnonymousClass4D6 A08;
    public final C357638Yz A09;
    public final TargetViewSizeProvider A0A;
    public final C352888Fl A0B;
    public final AnonymousClass8GA A0C;
    public final AnonymousClass80U A0D;
    public final AnonymousClass8GK A0E;
    public final ShutterButton A0F;
    public final Runnable A0G = new AnonymousClass8GL(this);

    public AnonymousClass8GJ(Activity activity, AnonymousClass82X r3, UserSession userSession, AnonymousClass4D6 r5, C357638Yz r6, TargetViewSizeProvider targetViewSizeProvider, C352888Fl r8, AnonymousClass8GA r9, AnonymousClass80U r10, AnonymousClass8GK r11, ShutterButton shutterButton) {
        0qQ.A0B(activity, 1);
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r3, 3);
        0qQ.A0B(targetViewSizeProvider, 9);
        this.A05 = activity;
        this.A07 = userSession;
        this.A06 = r3;
        this.A09 = r6;
        this.A0D = r10;
        this.A08 = r5;
        this.A0E = r11;
        this.A0C = r9;
        this.A0A = targetViewSizeProvider;
        this.A0F = shutterButton;
        this.A0B = r8;
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [X.8kQ, X.11X] */
    public static final void A00(Bitmap bitmap, C340347l7 r42, AnonymousClass8GJ r43, Integer num) {
        int A022 = C344017rB.A02(17);
        AnonymousClass8GJ r3 = r43;
        UserSession userSession = r3.A07;
        02m.A0p.markerEnd(A022, 2);
        C352888Fl r2 = r3.A0B;
        C340297l2 r1 = r2.A06;
        if (r1 != null) {
            C340547lR r0 = ((BasicCameraOutputController) C340297l2.A02(r1)).A04;
            if (r0 != null) {
                r0.A0N.A9d(r42);
            }
            r1.EyH((AnonymousClass8GD) null);
        }
        Activity activity = r3.A05;
        TargetViewSizeProvider targetViewSizeProvider = r3.A0A;
        String A002 = C363818kO.A00(num);
        MediaUploadMetadata mediaUploadMetadata = new MediaUploadMetadata((ImmersiveMediaFields) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false);
        AnonymousClass82X r5 = r3.A06;
        String A023 = r5.A02();
        Bitmap bitmap2 = bitmap;
        C352888Fl r19 = r2;
        TargetViewSizeProvider targetViewSizeProvider2 = targetViewSizeProvider;
        UserSession userSession2 = userSession;
        r3.A08.schedule(new C363838kQ(activity, bitmap2, (Bitmap) null, r3.A00, (Rect) null, (C363848kR) null, (C363858kS) null, (C363858kS) null, (ImmutableList) null, r5.A01(), mediaUploadMetadata, userSession2, targetViewSizeProvider2, r19, r3.A0E, (Boolean) null, (Float) null, (Float) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, A002, C363828kP.A00(r3.A09.A08()), A023, (String) null, (List) null, (byte[]) null, (byte[]) null, -1, true, false, false));
    }
}
