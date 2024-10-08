package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.NotesRepository;
import java.util.Map;

/* renamed from: X.439  reason: invalid class name */
public final class AnonymousClass439 implements C61110lV, AnonymousClass0lh {
    public static final IntentFilter A0I = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final BroadcastReceiver A06 = new C261864Bf(this);
    public final Context A07;
    public final UserSession A08;
    public final AnonymousClass43G A09;
    public final AnonymousClass43G A0A;
    public final Map A0B;
    public final AnonymousClass0eM A0C;
    public final 1Ng A0D;
    public final 14i A0E;
    public final C261874Bg A0F;
    public final C261884Bh A0G;
    public final 2Dm A0H;

    public static final void A00(AnonymousClass439 r7) {
        AnonymousClass439 r2 = r7;
        r7.A02 = true;
        A02(r2, AnonymousClass05K.A02, false, false, false, false);
        if (r2.A01) {
            r2.A07.unregisterReceiver(r2.A06);
            r2.A01 = false;
        }
        r2.A0H.EK3();
    }

    public final synchronized void A03() {
        if (this.A00 && this.A03 && (this.A04 || this.A05)) {
            this.A09.A05(00k.A0a(C2612048r.A00(this.A08).A00));
        }
    }

    public final synchronized void A04(Integer num) {
        if (this.A00 && this.A03 && (this.A04 || this.A05)) {
            this.A09.A04(num, false, false, false);
        }
    }

    public final synchronized void onSessionWillEnd() {
        if (this.A01) {
            this.A07.unregisterReceiver(this.A06);
            this.A01 = false;
        }
        14i.A06(this);
        1Ng r2 = this.A0D;
        r2.A02(this.A0F, AnonymousClass2KZ.class);
        r2.A02(this.A0G, AnonymousClass43K.class);
        synchronized (this.A09) {
        }
        synchronized (this.A0A) {
        }
        this.A0B.clear();
    }

    public static final void A01(AnonymousClass439 r8) {
        AnonymousClass439 r3 = r8;
        A02(r3, AnonymousClass05K.A0j, true, true, false, false);
        if (!r3.A01) {
            boolean z = false;
            if (0DH.A00(r3.A06, r3.A07, A0I) != null) {
                z = true;
            }
            r3.A01 = z;
        }
    }

    public static final void A02(AnonymousClass439 r13, Integer num, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean A0E2;
        UserSession userSession = r13.A08;
        0Tu r2 = 0Tu.A05;
        boolean A062 = 182.A06(r2, userSession, 36318058774796114L);
        Context context = r13.A07;
        if (A062) {
            A0E2 = C61970qY.A0F(context);
        } else {
            A0E2 = C61970qY.A0E(context);
        }
        1bC r0 = r13.A0H.A0H;
        boolean z5 = r0.A0F;
        boolean z6 = r0.A0I;
        if (z) {
            if (!r13.A03 && A0E2 && 182.A06(r2, userSession, 36326373828081392L)) {
                NotesRepository A002 = AnonymousClass43C.A00(userSession);
                A002.A06.A0K(true);
                C262224Cq r8 = A002.A01;
                C376909Ju r7 = new C376909Ju(A002, (AnonymousClass4D7) null, 11);
                1Eo.A03(AnonymousClass05K.A00, 19B.A00, r7, r8);
            }
            if ((!r13.A03 || ((!r13.A00 && r13.A02) || !r13.A04)) && A0E2 && (z5 || z6)) {
                AnonymousClass43G r72 = r13.A09;
                r72.A04(num, z2, z3, z4);
                synchronized (r13) {
                    long currentTimeMillis = System.currentTimeMillis() - AnonymousClass4k9.A00(userSession).A00.getLong(002.A0O("broadcast_channel_inbox_last_synced_time_millis_", 3), 0);
                    long A012 = 182.A01(r2, userSession, 36597343317592862L);
                    if (182.A06(r2, userSession, 36319407391841569L) && currentTimeMillis >= A012 * 1000) {
                        r72.A02();
                    }
                }
                if (z4 && 182.A06(r2, userSession, 36316074496495521L) && 182.A06(r2, userSession, 36323242796985366L) && 182.A06(r2, userSession, 36323242797050903L)) {
                    AnonymousClass43C.A00(userSession).A0C();
                }
            }
        }
        r13.A03 = A0E2;
        r13.A00 = z;
        r13.A04 = z5;
        r13.A05 = z6;
    }

    public AnonymousClass439(Context context, 1Ng r6, 14i r7, UserSession userSession, AnonymousClass43G r9, AnonymousClass43G r10, 2Dm r11, Map map) {
        this.A07 = context;
        this.A08 = userSession;
        this.A0D = r6;
        this.A09 = r9;
        this.A0A = r10;
        this.A0B = map;
        this.A0E = r7;
        this.A0H = r11;
        C261874Bg r3 = new C261874Bg(this);
        this.A0F = r3;
        C261884Bh r2 = new C261884Bh(this);
        this.A0G = r2;
        this.A03 = true;
        this.A0C = AnonymousClass0eN.A00(0eO.A02, AnonymousClass43J.A00);
        14i.A03(15Y.A03, this);
        if (!14i.A08()) {
            onAppForegrounded();
        }
        r6.A01(r3, AnonymousClass2KZ.class);
        r6.A01(r2, AnonymousClass43K.class);
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0fD.A03(-1985926746);
        if (((Boolean) C62000qj.A02.A02.invoke()).booleanValue()) {
            1Eo.A05(AnonymousClass12T.A00.CO6(1769849310, 3), new C66181MGs(this, (AnonymousClass4D7) null, 12), (C262224Cq) this.A0C.getValue());
        } else {
            A00(this);
        }
        AnonymousClass0fD.A0A(-1834968834, A032);
    }

    public final void onAppForegrounded() {
        int A032 = AnonymousClass0fD.A03(-755579146);
        if (((Boolean) C62000qj.A02.A02.invoke()).booleanValue()) {
            0nV CO6 = AnonymousClass12T.A00.CO6(1769849310, 3);
            C376879Jr r1 = new C376879Jr(this, (AnonymousClass4D7) null, 22);
            1Eo.A03(AnonymousClass05K.A00, CO6, r1, (C262224Cq) this.A0C.getValue());
        } else {
            A01(this);
        }
        AnonymousClass0fD.A0A(-74090785, A032);
    }
}
