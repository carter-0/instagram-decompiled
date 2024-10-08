package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import com.instagram.creation.video.ui.CamcorderBlinker;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.Jat  reason: case insensitive filesystem */
public final class C59870Jat {
    public AnonymousClass3Q2 A00;
    public Integer A01;
    public String A02 = "";
    public final Handler A03;
    public final UserSession A04;
    public final C59871Jau A05;
    public final C59872Jav A06;
    public final CamcorderBlinker A07;
    public final 1ua A08;
    public final WeakReference A09;
    public final WeakReference A0A;

    public static void A00(C59870Jat jat) {
        if (jat.A00 == null) {
            try {
                AnonymousClass457.A0E();
            } catch (IllegalStateException unused) {
                return;
            }
        }
        AnonymousClass3Q2 A022 = AnonymousClass9T3.A02(JTQ.A0Z());
        jat.A00 = A022;
        A022.A3w = AnonymousClass457.A0C(A022.A3w, 0, true);
        jat.A08.A0F(jat.A00);
        jat.A07.A05();
    }

    public final boolean A01() {
        C59873Jaw jaw = this.A06.A01;
        if (jaw.A01() == null || jaw.A01().A05 != AnonymousClass05K.A0C) {
            return false;
        }
        return true;
    }

    public C59870Jat(Context context, UserSession userSession, C59871Jau jau, MQA mqa, C66523MVb mVb, CamcorderBlinker camcorderBlinker) {
        C59872Jav jav = new C59872Jav();
        this.A06 = jav;
        this.A01 = AnonymousClass05K.A0N;
        this.A03 = new C60012JdL(Looper.getMainLooper(), this, 3);
        this.A09 = C51965G9l.A0v(context);
        this.A04 = userSession;
        this.A0A = C51965G9l.A0v(mqa);
        this.A08 = 1ua.A00(context, userSession);
        List list = jav.A02;
        list.add(mVb);
        this.A07 = camcorderBlinker;
        list.add(camcorderBlinker);
        camcorderBlinker.setClipStackManager(jav);
        this.A05 = jau;
        boolean A062 = 182.A06(0Tu.A05, userSession, 36323092473064275L);
        Lc4 lc4 = new Lc4(this, 3);
        if (A062) {
            0nY.A00().ATE(new C61706KIw(context, lc4, this));
        } else {
            lc4.apply(Boolean.valueOf(context.getExternalFilesDir((String) null) == null ? false : true));
        }
    }
}
