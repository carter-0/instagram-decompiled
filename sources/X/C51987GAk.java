package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.IntentAwareAdsInfo;
import com.instagram.clips.model.metadata.PlaylistContext;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import java.util.List;

/* renamed from: X.GAk  reason: case insensitive filesystem */
public final class C51987GAk {
    public C52011GBi A00;
    public final Context A01;
    public final C57019ILl A02 = new Object();
    public final UserSession A03;
    public final 2el A04;
    public final GBA A05;
    public final AnonymousClass4DU A06;
    public final AnonymousClass93U A07;
    public final C51997GAu A08;
    public final C51984GAh A09;
    public final GB6 A0A;
    public final C51996GAt A0B;
    public final GB8 A0C;
    public final GB1 A0D;
    public final C52001GAy A0E;
    public final GB3 A0F;
    public final C51991GAo A0G;
    public final GB4 A0H;
    public final C51994GAr A0I;
    public final String A0J;
    public final List A0K;
    public final C230292pL A0L;
    public final C51982GAf A0M;
    public final C51988GAl A0N;
    public final String A0O;

    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, X.ILl] */
    public C51987GAk(Context context, FragmentActivity fragmentActivity, AnonymousClass07V r27, AnonymousClass07V r28, IntentAwareAdsInfo intentAwareAdsInfo, PlaylistContext playlistContext, UserSession userSession, 2el r32, AnonymousClass4DU r33, C230292pL r34, AnonymousClass57M r35, SearchContext searchContext, AnonymousClass93U r37, C51982GAf gAf, C51984GAh gAh, String str, String str2, String str3, List list) {
        AnonymousClass07V r12 = r28;
        0qQ.A0B(r12, 3);
        AnonymousClass4DU r5 = r33;
        2el r2 = r32;
        UserSession userSession2 = userSession;
        C51973G9u.A0s(6, r2, userSession2, r5);
        SearchContext searchContext2 = searchContext;
        AnonymousClass93U r1 = r37;
        DbW.A1P(r1, 9, searchContext2);
        PlaylistContext playlistContext2 = playlistContext;
        C51984GAh gAh2 = gAh;
        C51969G9p.A1Q(playlistContext2, 13, gAh2);
        Context context2 = context;
        this.A01 = context2;
        String str4 = str;
        this.A0J = str4;
        this.A04 = r2;
        this.A03 = userSession2;
        this.A06 = r5;
        this.A07 = r1;
        this.A0O = str3;
        this.A0K = list;
        this.A09 = gAh2;
        C230292pL r9 = r34;
        this.A0L = r9;
        C51982GAf gAf2 = gAf;
        this.A0M = gAf2;
        AnonymousClass93U r21 = r1;
        C51988GAl gAl = new C51988GAl(context2, playlistContext2, userSession2, r5, searchContext2, r21);
        this.A0N = gAl;
        this.A0G = new C51991GAo(userSession2, r5, gAf2, gAl, str4);
        this.A0I = new C51994GAr(userSession2, r5);
        AnonymousClass07V r10 = r27;
        AnonymousClass07V r17 = r12;
        AnonymousClass07V r16 = r10;
        this.A0B = new C51996GAt(r16, r17, userSession2, r5, r35, r21);
        C51988GAl gAl2 = gAl;
        C51982GAf gAf3 = gAf2;
        AnonymousClass93U r19 = r1;
        AnonymousClass4DU r18 = r5;
        UserSession userSession3 = userSession2;
        this.A08 = new C51997GAu(context2, fragmentActivity, intentAwareAdsInfo, userSession3, r18, r19, gAf3, gAl2, str4, str2);
        this.A0E = new C52001GAy(userSession2, r5, r9, gAf2, gAh2);
        this.A0D = new GB1(r10, userSession2, r5);
        this.A0F = new GB3(r10, userSession2, r5, r1, gAf2);
        this.A0H = new GB4(userSession2, r5);
        Context context3 = context2;
        UserSession userSession4 = userSession2;
        2el r92 = r2;
        AnonymousClass4DU r102 = r5;
        AnonymousClass93U r11 = r1;
        this.A0A = new GB6(context3, userSession4, r92, r102, r11);
        this.A0C = new GB8(context3, userSession4, r92, r102, r11);
        this.A05 = new GBA(userSession2, r2, r5.getModuleName());
    }

    public final void A01(C250603lj r2) {
        0qQ.A0B(r2, 0);
        this.A0G.A00.add(r2);
    }

    public final void A02(C250603lj r2) {
        0qQ.A0B(r2, 0);
        this.A08.A00.add(r2);
    }

    public final C57021ILn A00() {
        return new C57021ILn(this.A03, this.A04, this.A06, this.A0O);
    }
}
