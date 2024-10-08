package X;

import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;

/* renamed from: X.2pU  reason: invalid class name and case insensitive filesystem */
public final class C230352pU implements C250603lj {
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final UserSession A01;
    public final C230282pK A02;
    public final AnonymousClass2pP A03;

    public final void ATF(AnonymousClass30Y r23, C252093oY r24) {
        0Tu r9;
        long j;
        IntentAwareAdPivotState intentAwareAdPivotState;
        IntentAwareAdPivotState intentAwareAdPivotState2;
        String str;
        AnonymousClass30Y r10 = r23;
        0qQ.A0B(r10, 0);
        C252093oY r7 = r24;
        0qQ.A0B(r7, 1);
        C53288Gla gla = (C53288Gla) r10.A03;
        C54077Gz1 gz1 = gla.A03;
        C254213s7 A002 = this.A03.A00(gz1.getId());
        float CFe = r7.CFe(r10);
        AnonymousClass2pN r8 = gla.A04;
        C230302pO r4 = gla.A05;
        C230292pL r3 = gla.A02;
        int intValue = r7.CEk(r10).intValue();
        if (intValue == 0 || intValue == 1) {
            Integer CEk = r7.CEk(r10);
            Integer num = AnonymousClass05K.A00;
            if (CEk == num) {
                if (r4 != null) {
                    r4.A00 = gla.A01;
                }
                if (r3 != null) {
                    r3.A00(gla.A01.A02);
                }
            }
            UserSession userSession = this.A01;
            0Tu r18 = 0Tu.A05;
            0Tu r11 = r18;
            if (!((!182.A06(r11, userSession, 36312887636788645L) && !182.A06(r11, userSession, 36312887637837232L)) || r8 == null || (intentAwareAdPivotState2 = r8.A00) == null)) {
                if (!intentAwareAdPivotState2.A08) {
                    0Tu r13 = 0Tu.A06;
                    if (((double) CFe) >= 182.A00(r13, userSession, 37157312567050285L)) {
                        intentAwareAdPivotState2.A08 = true;
                        this.A00.postDelayed(new C57735Ifc(r8), 182.A01(r13, userSession, 36594362613696188L));
                    }
                }
                if (intentAwareAdPivotState2.A08 && !intentAwareAdPivotState2.A09 && ((double) CFe) < 182.A00(0Tu.A06, userSession, 37157312567050285L)) {
                    intentAwareAdPivotState2.A09 = true;
                    r8.A01 = null;
                    this.A00.removeCallbacksAndMessages((Object) null);
                }
            }
            int i = gz1.A00;
            AnonymousClass4I5 r82 = AnonymousClass59V.A00;
            Integer valueOf = Integer.valueOf(i);
            if (r82.A02(valueOf)) {
                r9 = 0Tu.A06;
                j = 36312887642555886L;
            } else {
                if (r82.A01(valueOf)) {
                    r9 = 0Tu.A06;
                    j = 36312887642424812L;
                }
                if (r82.A02(Integer.valueOf(gz1.A00)) && 182.A06(r18, userSession, 36312887644915214L) && r3 != null && r3.A01 == num && ((double) CFe) >= 1.0d) {
                    r3.A02(gz1.getId(), "3765512437054769");
                }
                A002.A03(r10, r7);
                return;
            }
            boolean A06 = 182.A06(r9, userSession, j);
            0qQ.A0A(Boolean.valueOf(A06));
            if (A06 && r4 != null && ((double) CFe) >= 0.8d && (intentAwareAdPivotState = r4.A00) != null && !intentAwareAdPivotState.A0B && !r4.A02 && r4.A01 != null) {
                r4.A02 = true;
                r4.A03.postDelayed(new C57737Ife(r4), 182.A01(r9, userSession, 36594362619397826L));
            }
            r3.A02(gz1.getId(), "3765512437054769");
            A002.A03(r10, r7);
            return;
        }
        C254213s7 r0 = A002;
        r0.A04(r7);
        long j2 = r0.A05;
        if (j2 >= 250) {
            C230282pK r92 = this.A02;
            IntentAwareAdPivotState intentAwareAdPivotState3 = gla.A01;
            0qQ.A0B(intentAwareAdPivotState3, 1);
            0wc r102 = r92.A01;
            0Aj A003 = r102.A00(r102.A00, AnonymousClass000.A00(3362));
            if (A003.isSampled()) {
                A003.A9F("chaining_position", Long.valueOf(C230282pK.A00(gz1, r92)));
                A003.AAJ("chaining_session_id", intentAwareAdPivotState3.A0E);
                A003.AAJ("client_session_id", r92.A04.getSessionId());
                A003.A9F("sum_duration_ms", Long.valueOf(j2));
                A003.AAe("ad_ids", C230282pK.A06(gz1, r92));
                UserSession userSession2 = r92.A02;
                String A07 = C231122qu.A07(userSession2, ((C55923Hpk) 00k.A0I(gz1.A0B)).A00());
                if (A07 != null) {
                    A003.A9F("first_hscroll_item_ad_id", 00y.A0n(10, A07));
                    A003.AAJ("container_module", "feed_timeline");
                    A003.A9F("multi_ads_type_number", Long.valueOf((long) gz1.A00));
                    A003.AAJ("multi_ads_unit_id", gz1.getId());
                    A003.AAJ("inventory_source", C241323Ot.A02(gz1.A0A));
                    Integer A022 = gz1.A02();
                    if (A022 != null) {
                        str = C55034Hb5.A00(A022);
                    } else {
                        str = null;
                    }
                    A003.AAJ("insertion_mechanism", str);
                    A003.A9F("hscroll_seed_ad_id", r92.A08(gz1));
                    A003.A9F("hscroll_seed_media_id", C230282pK.A04(gz1));
                    A003.A9F("hscroll_seed_media_author_igid", C230282pK.A03(gz1));
                    A003.A7p("is_seed_ad_multi_ads_eligible", C230282pK.A02(userSession2, gz1.A04));
                    A003.AAJ("hscroll_seed_ad_tracking_token", C230282pK.A05(userSession2, gz1.A04));
                    A003.AAJ("ad_request_id", gz1.A08);
                    A003.Cgf();
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
        if (r8 != null) {
            r8.A01 = null;
        }
        if (r4 != null) {
            r4.A02 = false;
            r4.A03.removeCallbacksAndMessages((Object) null);
        }
        if (r3 != null) {
            if (r3.A01.intValue() == 1) {
                r3.A01 = AnonymousClass05K.A0C;
            }
            Runnable runnable = r3.A03;
            if (runnable != null) {
                r3.A08.removeCallbacks(runnable);
                r3.A07 = false;
            }
        }
        A002.A02();
    }

    public C230352pU(UserSession userSession, C230282pK r4, AnonymousClass2pP r5) {
        this.A01 = userSession;
        this.A03 = r5;
        this.A02 = r4;
    }
}
