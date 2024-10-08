package X;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.util.Log;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.MediaSession;
import com.instagram.model.creation.MediaCaptureConfig;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.LoQ  reason: case insensitive filesystem */
public final class C65161LoQ implements MV7 {
    public boolean A00;
    public boolean A01 = true;
    public final int A02;
    public final Context A03;
    public final UserSession A04;
    public final C273534mk A05;
    public final MediaSession A06;
    public final JWG A07;
    public final C3499682q A08;
    public final C267884cN A09;
    public final MediaCaptureConfig A0A;
    public final C267834cI A0B;
    public final CountDownLatch A0C;

    public final void Ddi() {
        0KC.A0C("RenderCompleteListener", "onRenderCancelled():");
        0KC.A0C("RenderCompleteListener", Log.getStackTraceString(new Throwable()));
        this.A00 = true;
    }

    public final void Ddl(List list) {
        0KC.A0C("RenderCompleteListener", "onRenderFinished(): registering pending media available callback now.");
        this.A0B.EBv(new M7D(this, list));
    }

    public final void Ddn() {
        0KC.A0C("RenderCompleteListener", "onRenderStarted()");
    }

    public C65161LoQ(Context context, UserSession userSession, C273534mk r4, MediaSession mediaSession, JWG jwg, C3499682q r7, C267884cN r8, MediaCaptureConfig mediaCaptureConfig, C267834cI r10, CountDownLatch countDownLatch, int i) {
        this.A03 = context;
        this.A08 = r7;
        this.A06 = mediaSession;
        this.A04 = userSession;
        this.A07 = jwg;
        this.A05 = r4;
        this.A0A = mediaCaptureConfig;
        this.A02 = i;
        this.A0B = r10;
        this.A09 = r8;
        this.A0C = countDownLatch;
    }

    public final void Dgg(Map map) {
        Location BNg;
        Iterator A16 = DbV.A16(map);
        while (A16.hasNext()) {
            LAM lam = (LAM) A16.next();
            if (lam.A02 == C62461KgB.GALLERY) {
                MediaSession mediaSession = this.A06;
                if (!(mediaSession == null || (BNg = mediaSession.BNg()) == null)) {
                    C379829Vm.A03(BNg, lam.A04);
                }
                if (Build.VERSION.SDK_INT >= 30) {
                    UserSession userSession = this.A04;
                    0qQ.A0B(userSession, 0);
                    if ((2Ht.A00 && 182.A06(0Tu.A05, userSession, 36315473202777330L)) || 2Ht.A04(userSession)) {
                        Context context = this.A03;
                        Object obj = map.get(lam);
                        obj.getClass();
                        C63395KwG.A00(context, ((LEA) obj).A08, "image");
                        CountDownLatch countDownLatch = this.A0C;
                        if (countDownLatch != null) {
                            countDownLatch.countDown();
                        }
                    }
                }
            }
        }
    }
}
