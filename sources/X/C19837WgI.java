package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Environment;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.WgI  reason: case insensitive filesystem */
public final class C19837WgI implements X85 {
    public static final String A04 = 0q1.A01(C19837WgI.class);
    public final int A00;
    public final Context A01;
    public final UserSession A02;
    public final HashMap A03 = new HashMap();

    public final void A8e(C282745Eo r15) {
        C20997X8u ALs;
        UserSession userSession = this.A02;
        27p.A01(userSession).A04.A01();
        String str = r15.A05;
        0qQ.A07(str);
        boolean exists = new File(str).exists();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        String str2 = A04;
        try {
            String str3 = r15.A06;
            if (!exists && str3 != null) {
                AtomicReference atomicReference = new AtomicReference();
                CountDownLatch A0y = Pxf.A0y();
                WXR wxr = new WXR(A0y, atomicBoolean, atomicReference, 0);
                C331897Sw r0 = C331897Sw.A0A;
                C331917Sy.A00(this.A01).A05(wxr, str3);
                A0y.await(1, TimeUnit.MINUTES);
                str = (String) atomicReference.get();
            }
            if (r15.A03 == C282775Er.A05) {
                ALs = new WXW(str, AnonymousClass05K.A0C).ALs();
            } else {
                AnonymousClass735 A002 = AnonymousClass733.A00.A00((Context) null, str3, str, false, false);
                0qQ.A0C(A002, "null cannot be cast to non-null type com.instagram.giphy.intf.IGDecoderAnimatedImage");
                ALs = ((AnonymousClass734) A002).ALs();
            }
            this.A03.put(r15, new VXK(ALs));
            27p.A01(userSession).A04.A02();
        } catch (Exception e) {
            27p.A01(userSession).A04.A00();
            if ((e instanceof C331907Sx) || (e instanceof InterruptedException)) {
                String A1D = 002.A1D("File exists ? ", exists);
                if (!exists) {
                    StringBuilder A0n = AnonymousClass7TF.A0n(A1D);
                    A0n.append("Failed to Re-download=");
                    A0n.append(atomicBoolean.get());
                    A1D = A0n.toString();
                }
                String A0T = 002.A0T(A1D, Environment.getExternalStorageState(new File(str)), ' ');
                AnonymousClass7TF.A19(0wj.A01.AEf(002.A0R(str2, "failed to render gif"), 817898083), DialogModule.KEY_MESSAGE, 002.A0T(A0T, str, ':'), e);
                throw new RuntimeException(A0T, e);
            }
            AnonymousClass7TG.A1I(0wj.A01, 002.A0R(str2, "failed to render gif"), e, 817898083);
            throw e;
        }
    }

    static {
        Map map = 0Yh.A03;
    }

    public final C365358my C5l(C282745Eo r5, long j, long j2) {
        VXK vxk = (VXK) this.A03.get(r5);
        if (vxk == null) {
            return null;
        }
        C20997X8u x8u = vxk.A02;
        Bitmap bitmap = vxk.A01;
        x8u.EL4((int) (j % ((long) x8u.getDuration())), bitmap);
        C365358my A022 = AnonymousClass9S9.A02(bitmap, this.A00);
        vxk.A00 = A022;
        return A022;
    }

    public final void cleanup() {
        HashMap hashMap = this.A03;
        Iterator A0u = C13989Tnp.A0u(hashMap);
        while (A0u.hasNext()) {
            ((VXK) A0u.next()).A01.recycle();
        }
        hashMap.clear();
    }

    public C19837WgI(Context context, UserSession userSession, int i) {
        AnonymousClass7TG.A1O(context, userSession);
        this.A01 = context;
        this.A02 = userSession;
        this.A00 = i;
    }
}
