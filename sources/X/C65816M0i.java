package X;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.M0i  reason: case insensitive filesystem */
public final class C65816M0i implements MTC {
    public long A00;
    public long A01;
    public long A02;
    public C61038Jvc A03 = new C61038Jvc();
    public XPM A04;
    public C62635Kj6 A05 = C62635Kj6.CONNECTING;
    public M0Y A06;
    public M0Y A07;
    public M0Y A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public HashMap A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public final C340307l3 A0O;
    public final AnonymousClass0iw A0P;
    public final 1wn A0Q;
    public final UserSession A0R;
    public final LGO A0S;
    public final M0X A0T;
    public final LRP A0U;
    public final C62176KbY A0V;
    public final C313776gz A0W;
    public final C62423KfY A0X;
    public final String A0Y;
    public final List A0Z;
    public final FragmentActivity A0a;
    public final 0tS A0b;
    public final 1Av A0c;
    public final C313886hJ A0d;

    public final void A01(C62635Kj6 kj6) {
        C62635Kj6 kj62 = kj6;
        0qQ.A0B(kj62, 0);
        C62635Kj6 kj63 = this.A05;
        this.A05 = kj62;
        M0Y m0y = this.A07;
        if (m0y != null) {
            boolean z = true;
            switch (kj62.ordinal()) {
                case 2:
                    LGO lgo = m0y.A09;
                    UserSession userSession = lgo.A06;
                    Context context = lgo.A03;
                    if (C362988ir.A01(context.getApplicationContext(), userSession)) {
                        1pd.A00(C362988ir.A00()).A00(context, userSession, C40625Afn.A00, "sup:SupDelegate|SupLiveDelegate_PLAY_TTS_ON_ENTER_LIVE");
                        break;
                    }
                    break;
                case 3:
                case 8:
                    m0y.A0E.A01 = false;
                    break;
                case 5:
                    m0y.A0E.A01 = true;
                    m0y.A0F.A00();
                    m0y.A0C.A0J = true;
                    break;
                case 6:
                    Bundle A0a2 = AnonymousClass7TE.A0a();
                    DbU.A1D(A0a2, m0y.A06);
                    A0a2.putString("live_visibility_mode", m0y.A0A.A01);
                    C65816M0i m0i = m0y.A0C;
                    M0X.A0A(m0i.A0T, AnonymousClass05K.A0d);
                    m0i.A0K = true;
                    break;
                case 7:
                    LEK lek = m0y.A00;
                    if (lek != null) {
                        lek.A09.unregisterLifecycleListener(lek.A02);
                    }
                    m0y.A00 = null;
                    break;
                case 9:
                case 10:
                    LGX lgx = m0y.A0F;
                    lgx.A01();
                    m0y.A0E.A01 = true;
                    lgx.A00();
                    C65816M0i m0i2 = m0y.A0C;
                    if (m0i2.A0H) {
                        boolean equals = "copyrighted_music_matched".equals(m0i2.A0B);
                        LOO loo = m0y.A0D;
                        int i = 2131963940;
                        if (equals) {
                            i = 2131963917;
                        }
                        Context context2 = loo.A0C;
                        String string = context2.getString(i);
                        View inflate = loo.A0E.inflate();
                        TextView A0G2 = DbU.A0G(inflate, R.id.body);
                        View requireViewById = inflate.requireViewById(R.id.finish_button);
                        requireViewById.getLayoutParams().width = 0nA.A09(context2) / 2;
                        LY3.A00(requireViewById.requireViewById(R.id.finish_button), 4, loo);
                        A0G2.setText(string);
                    } else {
                        UserSession userSession2 = m0y.A06;
                        if (!C278264wZ.A03(userSession2)) {
                            if (kj62 != C62635Kj6.STOPPED_BLOCKED) {
                                z = false;
                            }
                            String str = m0i2.A09;
                            if (str != null) {
                                LOO loo2 = m0y.A0D;
                                String str2 = m0i2.A0A;
                                String str3 = m0i2.A0D;
                                boolean z2 = m0i2.A0I;
                                boolean z3 = m0i2.A0F;
                                boolean z4 = m0i2.A0L;
                                long j = m0i2.A00;
                                String str4 = m0i2.A0Y;
                                long j2 = m0i2.A01;
                                List list = m0i2.A0Z;
                                boolean A1a = JTR.A1a(JTP.A0f(LKG.A01(userSession2)).A08);
                                LKG.A01(userSession2).A01.getValue();
                                loo2.A07 = str;
                                LOO loo3 = loo2;
                                String str5 = str;
                                String str6 = str2;
                                loo2.A01.post(new MAL(loo3, str5, str6, str3, str4, list, j, j2, z2, z3, z4, z, A1a));
                            }
                        }
                    }
                    1Ln A022 = M0X.A02(m0i2.A0T, AnonymousClass05K.A0H);
                    A022.A0O("has_share_toggle", false);
                    A022.Cgf();
                    break;
                case 11:
                    m0y.A0F.A01();
                    break;
            }
            m0y.A0E.A04.setOnTouchListener((View.OnTouchListener) null);
        }
        this.A0W.A02().A06.Epw(kj62);
        switch (kj62.ordinal()) {
            case 2:
                C62423KfY kfY = this.A0X;
                LBN lbn = kfY.A0c;
                Location location = null;
                String str7 = lbn.A03;
                NewFundraiserInfo newFundraiserInfo = lbn.A01;
                1Wr r1 = 1Wr.A00;
                if (r1 != null) {
                    location = r1.getLastLocation(kfY.A07, "IgLiveStreamingController");
                }
                UserSession userSession3 = kfY.A07;
                String str8 = kfY.A0D.A0C;
                1NY A0a3 = AnonymousClass7TG.A0a(userSession3);
                A0a3.A0K("live/%s/start/", new Object[]{str8});
                A0a3.A0O((15p) null, K1F.class, LK4.class, true);
                if (location != null) {
                    A0a3.A9m(com.facebook.location.platform.api.Location.LATITUDE, String.valueOf(location.getLatitude()));
                    A0a3.A9m("longitude", String.valueOf(location.getLongitude()));
                }
                if (str7 != null) {
                    A0a3.A9m("fundraiser_id", str7);
                }
                if (newFundraiserInfo != null) {
                    A0a3.A9m("new_fundraiser_info", C64130LPe.A00(newFundraiserInfo));
                }
                1OC A0M2 = A0a3.A0M();
                C61500KAf.A00(A0M2, kfY, 44);
                M0X m0x = kfY.A0a;
                1Ln A032 = M0X.A03(m0x, AnonymousClass05K.A0N);
                A032.A0P("response_time", JTS.A0c(SystemClock.elapsedRealtime() - m0x.A01));
                LRy.A02(m0x.A0K, A032);
                A032.Cgf();
                1ES.A00(kfY.A05, kfY.A0V, A0M2);
                A01(C62635Kj6.STARTED);
                return;
            case 9:
            case 10:
            case 11:
                if (!kj63.A01()) {
                    this.A0X.A0J();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public C65816M0i(FragmentActivity fragmentActivity, C340307l3 r6, AnonymousClass0iw r7, 1Ng r8, UserSession userSession, 0tS r10, 1Av r11, LGO lgo, M0X m0x, LRP lrp, C62176KbY kbY, C313776gz r16, C313886hJ r17, C62423KfY kfY, String str, List list) {
        0qQ.A0B(r10, 9);
        C51972G9s.A1F(r11, r8);
        this.A0a = fragmentActivity;
        this.A0P = r7;
        this.A0R = userSession;
        this.A0T = m0x;
        C62423KfY kfY2 = kfY;
        this.A0X = kfY2;
        this.A0O = r6;
        this.A0S = lgo;
        this.A0U = lrp;
        this.A0b = r10;
        this.A0c = r11;
        this.A0Y = str;
        this.A0Z = list;
        this.A0d = r17;
        this.A0W = r16;
        this.A0V = kbY;
        LgJ lgJ = new LgJ(this, 14);
        this.A0Q = lgJ;
        kfY2.A02 = this;
        kfY2.A0E = this;
        this.A0N = AnonymousClass7TG.A1a(r11, r11.A21, 1Av.A8a, 151);
        r8.A01(lgJ, C64622LfA.class);
    }

    public final void A00() {
        if (!this.A05.A01()) {
            this.A0X.A0J();
        }
        this.A0S.A01();
        M0X.A04(this.A0T, AnonymousClass05K.A1F).Cgf();
    }

    public final void A02(Integer num, String str, boolean z) {
        C62635Kj6 kj6;
        if (!this.A05.A01()) {
            if (num == AnonymousClass05K.A15) {
                kj6 = C62635Kj6.STOPPED_BLOCKED;
            } else if (z) {
                kj6 = C62635Kj6.STOPPED_SUMMARY;
            } else {
                kj6 = C62635Kj6.STOPPED;
            }
            A01(kj6);
            M0X m0x = this.A0T;
            M0X.A09(m0x);
            1Ln A032 = M0X.A03(m0x, AnonymousClass05K.A1I);
            JTT.A1B(A032, LKE.A00(num), str);
            Boolean valueOf = Boolean.valueOf(m0x.A0B);
            A032.A0O("allow_cobroadcast_invite", valueOf);
            A032.A0Q("disconnect_count", JTQ.A0U(m0x.A0Y));
            A032.A0Q("total_questions_answered_count", JTQ.A0U(m0x.A0c));
            A032.Cgf();
            m0x.A0G = false;
            m0x.A0L.removeCallbacks(m0x.A0S);
            M0X.A09(m0x);
            1Ln A033 = M0X.A03(m0x, AnonymousClass05K.A02);
            A033.A0Q("max_viewer_count", JTQ.A0U(m0x.A0b));
            A033.A0Q(AnonymousClass000.A00(5343), JTQ.A0U(m0x.A0k));
            A033.A0Q("total_like_shown_count", JTQ.A0U(m0x.A0i));
            A033.A0Q("total_burst_like_shown_count", JTQ.A0U(m0x.A0e));
            A033.A0Q("total_user_comment_shown_count", JTQ.A0U(m0x.A0l));
            A033.A0Q("total_system_comment_shown_count", JTQ.A0U(m0x.A0j));
            Long A0m = C51971G9r.A0m();
            A033.A0Q(AnonymousClass000.A00(1523), A0m);
            A033.A0Q("total_battery_drain", DbS.A0j(m0x.A00));
            A033.A0O("allow_cobroadcast_invite", valueOf);
            A033.A0P("total_cobroadcast_duration", JTS.A0c(m0x.A0p.get()));
            A033.A0Q("total_unique_guest_count", DbS.A0j(m0x.A0T.size()));
            A033.A0Q("total_guest_invite_attempt", JTQ.A0U(m0x.A0h));
            A033.A0Q("sup_state", Long.valueOf(m0x.A04));
            C63841L8w l8w = m0x.A06;
            if (l8w != null) {
                0bb r3 = new 0bb();
                long j = 0;
                r3.A05("button_tap_count", A0m);
                if (l8w.A04) {
                    j = 1;
                }
                r3.A05("button_was_shown", Long.valueOf(j));
                r3.A05("face_effect_off_tap_count", A0m);
                r3.A05("num_effects_in_tray", A0m);
                0xF r2 = new 0xF();
                Iterator A0t = AnonymousClass7TF.A0t(l8w.A00);
                if (A0t.hasNext()) {
                    A0t.next();
                    throw AnonymousClass7TE.A11("getNumTimesSelected");
                }
                HashMap A034 = 0j8.A03(r2);
                ArrayList A0v = DbS.A0v(A034.size());
                Iterator A0s = AnonymousClass7TF.A0s(A034);
                while (A0s.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                    A0v.add(AnonymousClass7TF.A0w(A1J.getKey(), A1J.getValue()));
                }
                r3.A07("selected_effect_usage_stats", A0v);
                r3.A05("supports_face_filters", A0m);
                r3.A05("tray_dismissed_with_active_effect_count", A0m);
                r3.A07("selected_face_effect_session_ids", Collections.unmodifiableList(l8w.A01));
                A033.A0N(r3, "face_effect_usage_stats");
            }
            A033.Cgf();
        }
    }

    public final void DBF(long j) {
        C313816h4 r1 = this.A0W.A03;
        r1.A01.A00 = j;
        r1.A04.Epw(Long.valueOf(j));
        this.A00 = j;
        long j2 = this.A02;
        if (j2 > 0) {
            if (j2 - j < 0 && !this.A0M) {
                if (!this.A05.A01()) {
                    A02(AnonymousClass05K.A0j, (String) null, true);
                }
                this.A0M = true;
            }
            if (!this.A0N && j > 1000) {
                1Av r3 = this.A0c;
                AnonymousClass7TF.A1J(r3, r3.A21, 1Av.A8a, 151, true);
                this.A0N = true;
            }
        }
    }
}
