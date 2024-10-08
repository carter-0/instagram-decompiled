package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* renamed from: X.835  reason: invalid class name */
public final class AnonymousClass835 {
    public C3500883e A00;
    public final ClipsAudioStore A01;
    public final AnonymousClass83H A02;
    public final AnonymousClass83I A03;
    public final C3500783d A04;
    public final AnonymousClass836 A05;
    public final AnonymousClass83R A06;
    public final 0nV A07;
    public final C262224Cq A08;

    public AnonymousClass835(Context context, AnonymousClass12V r22, UserSession userSession, 2Nn r24) {
        AnonymousClass12V r2 = r22;
        0qQ.A0B(r2, 4);
        AnonymousClass19S A022 = 19E.A02(((AnonymousClass12U) r2).A04);
        this.A08 = A022;
        C262094Cc AOJ = r2.AOJ(1335631354, 2);
        this.A07 = AOJ;
        AnonymousClass836 r10 = new AnonymousClass836();
        this.A05 = r10;
        Context context2 = context;
        UserSession userSession2 = userSession;
        2Nn r11 = r24;
        Context context3 = context2;
        UserSession userSession3 = userSession2;
        AnonymousClass19S r19 = A022;
        ClipsAudioStore clipsAudioStore = new ClipsAudioStore(context3, userSession3, r10, r11, AOJ, r19);
        this.A01 = clipsAudioStore;
        AnonymousClass83H r8 = new AnonymousClass83H();
        this.A02 = r8;
        AnonymousClass83I r13 = new AnonymousClass83I(context3, userSession3, clipsAudioStore, r10, r11, r19);
        this.A03 = r13;
        this.A06 = new AnonymousClass83R(context2, userSession2, clipsAudioStore, r8, r13, r10, r11, A022);
        this.A04 = new C3500783d(userSession2);
        this.A00 = new C3500883e(r2, userSession2, r10, A022);
    }

    public final void A00() {
        ClipsAudioStore clipsAudioStore = this.A01;
        clipsAudioStore.A05();
        AnonymousClass83A r1 = clipsAudioStore.A0A;
        Map map = r1.A02;
        map.clear();
        AnonymousClass83A.A00(r1, map);
        05G r0 = clipsAudioStore.A0S;
        0sn r4 = 0sn.A00;
        r0.Epw(r4);
        clipsAudioStore.A0I.Epw(new AnonymousClass83F(new LinkedHashMap(), new LinkedHashMap()));
        clipsAudioStore.A0T.Epw((Object) null);
        clipsAudioStore.A0L.Epw((Object) null);
        clipsAudioStore.A0K.Epw((Object) null);
        05G r2 = this.A05.A02;
        0qQ.A0B(r2.getValue(), 0);
        0qQ.A0B(r4, 0);
        r2.Epw(new AnonymousClass831(r4, false));
        this.A00.A04.clear();
        19E.A05((CancellationException) null, this.A08);
    }
}
