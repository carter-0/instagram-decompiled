package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.6cs  reason: invalid class name and case insensitive filesystem */
public final class C311556cs implements C311566ct {
    public final UserSession A00;
    public final C270424gi A01;
    public final int A02;
    public final int A03;
    public final AnonymousClass0iw A04;

    public C311556cs(AnonymousClass0iw r5, UserSession userSession, C270424gi r7) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r7, 2);
        this.A00 = userSession;
        this.A01 = r7;
        this.A04 = r5;
        0Tu r3 = 0Tu.A05;
        this.A02 = (int) 182.A01(r3, userSession, 36598992583986504L);
        this.A03 = (int) 182.A01(r3, userSession, 36598992584052041L);
        AnonymousClass3BV.A00(userSession).A09(this);
    }

    public final void DMh(String str) {
    }

    public final void DMi(String str) {
    }

    public final void DPq(String str, String str2) {
    }

    public final void DQ3(String str, String str2) {
    }

    public final void DQo(String str, String str2) {
    }

    public final void DQr(String str, String str2) {
    }

    public final void A00(C250973mM r15, String str) {
        C250973mM Bky;
        HashMap hashMap = new HashMap();
        UserSession userSession = this.A00;
        1Av A002 = 1Au.A00(userSession);
        int i = this.A02;
        UserSession userSession2 = 1NM.A00(userSession).A00;
        0Tu r4 = 0Tu.A05;
        if (182.A06(r4, userSession2, 36325867022791993L)) {
            0xa r7 = A002.A01;
            if (r7.getInt("reel_tray_viewer_swipe_preload_count", -1) != -1) {
                i = r7.getInt("reel_tray_viewer_swipe_preload_count", -1);
            }
        }
        if (i >= 0) {
            int i2 = 0;
            while (i2 != i) {
                i2++;
                if (i2 != 0) {
                    C270424gi r1 = this.A01;
                    int CMI = r1.CMI(r15) + i2;
                    if (CMI >= 0 && (Bky = r1.Bky(CMI)) != null) {
                        String id = Bky.A0H.getId();
                        0qQ.A07(id);
                        if (!hashMap.containsKey(id)) {
                            String id2 = Bky.A0H.getId();
                            0qQ.A07(id2);
                            hashMap.put(id2, new AnonymousClass3PJ(AnonymousClass3BU.BUFFER_ON_SWIPE, id2, 1, -1, CMI));
                        }
                    }
                }
            }
        }
        int i3 = this.A03;
        if (182.A06(r4, 1NM.A00(userSession).A00, 36325867022857530L)) {
            0xa r42 = A002.A01;
            if (r42.getInt("reel_tray_viewer_swipe_preload_count", -1) != -1) {
                i3 = r42.getInt("reel_tray_viewer_swipe_preload_count", -1);
            }
        }
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = r15.A01;
        C270424gi r5 = this.A01;
        int CMI2 = r5.CMI(r15);
        String str2 = null;
        boolean z = false;
        for (int i8 = 0; i8 < i3; i8++) {
            i7++;
            if (i7 >= r15.A02(userSession)) {
                CMI2++;
                r15 = r5.Bky(CMI2);
                if (r15 == null) {
                    break;
                } else if (r15.A0L) {
                    i7 = 0;
                } else {
                    i7 = r15.A00;
                }
            }
            if (i7 < r15.A02(userSession)) {
                Reel reel = r15.A0H;
                String id3 = reel.getId();
                0qQ.A07(id3);
                if (!id3.equals(str2)) {
                    if (z) {
                        hashMap.put(str2, new AnonymousClass3PJ(AnonymousClass3BU.BUFFER_ON_TAP, str2, i5, i6, i4));
                    }
                    str2 = reel.getId();
                    0qQ.A07(str2);
                    i5 = 0;
                    z = true;
                    i6 = i7;
                    i4 = CMI2;
                } else if (!z) {
                    NullPointerException nullPointerException = new NullPointerException();
                    0qQ.A0G(nullPointerException);
                    throw nullPointerException;
                }
                i5++;
            }
        }
        if (z) {
            hashMap.put(str2, new AnonymousClass3PJ(AnonymousClass3BU.BUFFER_ON_TAP, str2, i5, i6, i4));
        }
        if (!hashMap.isEmpty()) {
            AnonymousClass3BV.A00(userSession).A0C(this.A04.getModuleName(), str, new ArrayList(hashMap.values()));
        }
    }

    public final void DMj(String str, boolean z) {
        C250973mM Bl0 = this.A01.Bl0(str);
        if (Bl0 != null && !z) {
            Bl0.A0B(this.A00);
        }
    }
}
