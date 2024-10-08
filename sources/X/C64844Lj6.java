package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Looper;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.Lj6  reason: case insensitive filesystem */
public final class C64844Lj6 implements AnonymousClass11X {
    public Bitmap A00;
    public MTO A01;
    public 1P0 A02;
    public ImageUrl A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public final C63830L8l A07;
    public final UserSession A08;
    public final WeakReference A09;

    public final String getName() {
        return "UploadCustomCoverTask";
    }

    public final int getRunnableId() {
        return 288;
    }

    public final void onCancel() {
    }

    public final void onFinish() {
        this.A05 = true;
        MTO mto = this.A01;
        if (mto != null) {
            A00(mto, this, this.A02);
            this.A01 = null;
            this.A02 = null;
        }
    }

    public final void onStart() {
    }

    public static void A00(MTO mto, C64844Lj6 lj6, 1P0 r8) {
        if (lj6.A06) {
            lj6.A03.getClass();
            String str = lj6.A04;
            if (str == null) {
                str = "";
            }
            ImageUrl imageUrl = lj6.A03;
            mto.D7V(new Rect(0, 0, imageUrl.getWidth(), imageUrl.getHeight()), imageUrl, str);
            mto.onFinish();
        } else if (r8 != null) {
            r8.onFail(AnonymousClass7BQ.A00());
        }
    }

    public C64844Lj6(Activity activity, C63830L8l l8l, UserSession userSession) {
        this.A08 = userSession;
        this.A07 = l8l;
        this.A09 = C51965G9l.A0v(activity);
    }

    public final void run() {
        int i;
        if (Looper.getMainLooper() != Looper.myLooper()) {
            try {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                1NK A002 = 1NK.A00();
                C63830L8l l8l = this.A07;
                1OO A0J = A002.A0J(l8l.A02, (String) null);
                A0J.A0I = false;
                A0J.A02(new C64617Lf3(0, this, countDownLatch));
                A0J.A01();
                countDownLatch.await();
                this.A00.getClass();
                Rect A062 = JW0.A06(l8l.A01, this.A00.getWidth(), this.A00.getHeight(), 1, 1);
                int min = Math.min(1080, Math.min(A062.width(), A062.height()));
                if (min == 0) {
                    0wj r8 = 0wj.A01;
                    Integer valueOf = Integer.valueOf(this.A00.getWidth());
                    Integer valueOf2 = Integer.valueOf(this.A00.getHeight());
                    Integer valueOf3 = Integer.valueOf(A062.left);
                    Integer valueOf4 = Integer.valueOf(A062.top);
                    Integer valueOf5 = Integer.valueOf(A062.right);
                    Integer valueOf6 = Integer.valueOf(A062.bottom);
                    Rect rect = l8l.A00;
                    r8.AEf(StringFormatUtil.formatStrLocaleSafe("targetWidthAndHeight is 0. mBitmap: (%d, %d). cropRect: (%d, %d, %d, %d). mCurrentCoverMedia.cropRect: (%d, %d, %d, %d).", new Object[]{valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.right), Integer.valueOf(rect.bottom)}), 18945175);
                    min = Math.min(1080, Math.min(this.A00.getWidth(), this.A00.getHeight()));
                    A062 = new Rect(0, 0, this.A00.getWidth(), this.A00.getHeight());
                }
                UserSession userSession = this.A08;
                0Tu A0J2 = DbS.A0J(userSession, 0);
                if (!182.A06(A0J2, userSession, 36329019528527592L) || !182.A06(A0J2, userSession, 36329019528134373L)) {
                    i = min;
                } else {
                    min = this.A00.getWidth();
                    i = this.A00.getHeight();
                    A062 = new Rect(0, 0, min, i);
                }
                Bitmap A0C = 1MF.A0C(this.A00, JW0.A07(A062), min, i);
                this.A00 = null;
                WeakReference weakReference = this.A09;
                Object obj = weakReference.get();
                obj.getClass();
                File A042 = 0mb.A04((Context) obj);
                1MF.A0M(A0C, A042);
                CountDownLatch countDownLatch2 = new CountDownLatch(1);
                Object obj2 = weakReference.get();
                obj2.getClass();
                Activity activity = (Activity) obj2;
                activity.runOnUiThread(new C66053M9m(activity, A0C, this, A042, countDownLatch2));
                countDownLatch2.await();
            } catch (InterruptedException e) {
                throw new RuntimeException("UploadCustomCoverTask was interrupted", e);
            }
        } else {
            throw AnonymousClass7TE.A0z("UploadCustomCoverTask must not be run on UI thread");
        }
    }
}
