package X;

import android.content.Context;
import android.widget.LinearLayout;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.LRi  reason: case insensitive filesystem */
public final class C64166LRi {
    public final int A00;
    public final Context A01;
    public final UserSession A02;
    public final IgLinearLayout A03;
    public final IgLinearLayout A04;
    public final C3511387s A05;
    public final AnonymousClass8RF A06;
    public final C61805KMt A07;
    public final C61805KMt A08;
    public final C60108Jfo A09;
    public final ArrayList A0A;
    public final ArrayList A0B = AnonymousClass7TE.A1C();
    public final boolean A0C;

    /* JADX WARNING: type inference failed for: r8v0, types: [android.widget.LinearLayout, android.view.View, com.instagram.common.ui.base.IgLinearLayout] */
    /* JADX WARNING: type inference failed for: r3v0, types: [android.widget.LinearLayout, android.view.View, com.instagram.common.ui.base.IgLinearLayout] */
    public C64166LRi(Context context, LinearLayout linearLayout, UserSession userSession, C3511387s r23, AnonymousClass8RF r24, C61805KMt kMt, C61805KMt kMt2, C60108Jfo jfo, int i, boolean z) {
        LinearLayout linearLayout2 = linearLayout;
        UserSession userSession2 = userSession;
        C51969G9p.A1N(userSession2, 1, linearLayout2);
        this.A02 = userSession2;
        Context context2 = context;
        this.A01 = context2;
        C60108Jfo jfo2 = jfo;
        this.A09 = jfo2;
        C61805KMt kMt3 = kMt;
        this.A07 = kMt3;
        this.A08 = kMt2;
        AnonymousClass8RF r11 = r24;
        this.A06 = r11;
        C3511387s r10 = r23;
        this.A05 = r10;
        int i2 = i;
        this.A00 = i2;
        ? linearLayout3 = new LinearLayout(context2);
        linearLayout3.setOrientation(1);
        this.A03 = linearLayout3;
        ? linearLayout4 = new LinearLayout(context2);
        linearLayout4.setOrientation(1);
        this.A04 = linearLayout4;
        boolean A062 = 182.A06(0Tu.A05, userSession2, 36320043046870933L);
        this.A0C = A062;
        linearLayout2.addView(linearLayout3, new LinearLayout.LayoutParams(-1, -2));
        linearLayout2.addView(linearLayout4, new LinearLayout.LayoutParams(-1, -2));
        this.A0A = 0sr.A1L(new KMU[]{new KMU(context2, linearLayout3, userSession2, r10, r11, kMt3, jfo2, i2, 0, false, A062, z)});
    }

    public final void A05(C62517Kh8 kh8, int i, int i2, boolean z) {
        int i3;
        0qQ.A0B(kh8, 3);
        Iterator A012 = A01(this);
        while (true) {
            int i4 = 0;
            if (!A012.hasNext()) {
                break;
            }
            KMU A0d = JTO.A0d(A012);
            if (kh8 != C62517Kh8.AUDIO_TRACK || A0d.A05 != i2) {
                if (z) {
                    i4 = A0d.A00;
                }
                A0d.A0I(i - i4);
            }
        }
        Iterator A002 = A00(this);
        while (A002.hasNext()) {
            KMU A0d2 = JTO.A0d(A002);
            if (kh8 != C62517Kh8.VOICEOVER_TRACK || A0d2.A05 != i2) {
                if (z) {
                    i3 = A0d2.A00;
                } else {
                    i3 = 0;
                }
                A0d2.A0I(i - i3);
            }
        }
    }

    public static Iterator A00(C64166LRi lRi) {
        return lRi.A0B.iterator();
    }

    public static Iterator A01(C64166LRi lRi) {
        return lRi.A0A.iterator();
    }

    public final void A03(int i) {
        C61805KMt kMt = this.A07;
        kMt.A00 = i;
        kMt.A0G();
        C61805KMt kMt2 = this.A08;
        kMt2.A00 = i;
        kMt2.A0G();
    }

    public final void A04(int i) {
        C61805KMt kMt = this.A07;
        kMt.A01 = i;
        kMt.A0G();
        C61805KMt kMt2 = this.A08;
        kMt2.A01 = i;
        kMt2.A0G();
    }

    public final void A02(int i) {
        int i2;
        Iterator A012 = A01(this);
        int i3 = 0;
        while (A012.hasNext()) {
            Object next = A012.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            KMU kmu = (KMU) next;
            if (i3 == i) {
                KMU.A00(kmu);
                LEG leg = kmu.A0E;
                synchronized (leg) {
                    i2 = leg.A01;
                }
                kmu.A0H.A0O(i2);
                synchronized (leg) {
                    leg.A08.post(new C65982M6t(leg, leg.A01));
                    leg.A06.A00.A0H.A0D.Epw((Object) null);
                }
            } else {
                JTT.A13(kmu.A0A);
            }
            i3 = i4;
        }
        Iterator A002 = A00(this);
        while (A002.hasNext()) {
            JTT.A13(JTO.A0d(A002).A0A);
        }
    }

    public final void A06(0eP r3) {
        Iterator A012 = A01(this);
        while (A012.hasNext()) {
            JTO.A0e(A012).A01 = r3;
        }
        Iterator A002 = A00(this);
        while (A002.hasNext()) {
            JTO.A0e(A002).A01 = r3;
        }
    }

    public final void A07(boolean z) {
        Iterator A012 = A01(this);
        while (A012.hasNext()) {
            JTO.A0e(A012).A0L(z);
        }
        Iterator A002 = A00(this);
        while (A002.hasNext()) {
            JTO.A0e(A002).A0L(z);
        }
    }
}
