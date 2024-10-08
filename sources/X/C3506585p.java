package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.85p  reason: invalid class name and case insensitive filesystem */
public final class C3506585p implements AnonymousClass85q {
    public int A00 = -1;
    public final UserSession A01;

    public final void Edn(int i) {
        String str;
        int i2 = (int) (((long) i) / 1000);
        UserSession userSession = this.A01;
        boolean A06 = 182.A06(0Tu.A05, userSession, 36329556398850229L);
        0xY AR4 = 1Au.A00(userSession).A01.AR4();
        if (A06) {
            str = "music_duration_for_photo_last_selection_for_test";
        } else {
            str = "music_duration_for_photo_last_selection";
        }
        AR4.E5Z(str, i2);
        AR4.apply();
        this.A00 = i;
    }

    public final int BV1() {
        boolean z;
        int i;
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        UserSession userSession = this.A01;
        1Av A002 = 1Au.A00(userSession);
        0xa r6 = A002.A01;
        int i3 = r6.getInt("music_duration_for_photo_last_selection", 15);
        0Tu r4 = 0Tu.A05;
        if (i3 > ((int) 182.A01(r4, userSession, 36611031375681727L))) {
            0s0 r11 = A002.A5Y;
            AnonymousClass0YZ[] r15 = 1Av.A8a;
            if (((Boolean) r11.CDM(A002, r15[249])).booleanValue() || !182.A06(r4, userSession, 36329556398850229L)) {
                z = false;
            } else {
                z = true;
                0xY AR4 = r6.AR4();
                AR4.E5Z("music_duration_for_photo_last_selection_for_test", (int) 182.A01(r4, userSession, 36611031375681727L));
                AR4.apply();
                r11.Epx(A002, true, r15[249]);
            }
            if (182.A06(r4, userSession, 36329556398850229L)) {
                if (z) {
                    i = (int) 182.A01(r4, userSession, 36611031375681727L);
                } else {
                    i = 15;
                }
                i3 = r6.getInt("music_duration_for_photo_last_selection_for_test", i);
            }
        } else if (182.A06(r4, userSession, 36329556398850229L)) {
            0xY AR42 = r6.AR4();
            AR42.E5Z("music_duration_for_photo_last_selection_for_test", i3);
            AR42.apply();
            A002.A5Y.Epx(A002, true, 1Av.A8a[249]);
        }
        int min = (int) (((long) Math.min(i3, 15)) * 1000);
        this.A00 = min;
        return min;
    }

    public C3506585p(UserSession userSession) {
        this.A01 = userSession;
    }
}
