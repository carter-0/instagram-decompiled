package X;

import android.content.res.Resources;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.2oB  reason: invalid class name */
public final class AnonymousClass2oB implements C229782oC {
    public final Resources A00;
    public final Fragment A01;
    public final UserSession A02;
    public final AnonymousClass4DU A03;
    public final C229762nz A04;
    public final C229772oA A05;
    public final C229752ny A06;
    public final C228182kv A07;
    public final AnonymousClass4DV A08;
    public final 0sP A09;

    public AnonymousClass2oB(Resources resources, Fragment fragment, UserSession userSession, AnonymousClass4DU r5, C229762nz r6, C229772oA r7, C229752ny r8, C228182kv r9, AnonymousClass4DV r10, 0sP r11) {
        0qQ.A0B(r6, 6);
        0qQ.A0B(r9, 10);
        this.A06 = r8;
        this.A05 = r7;
        this.A01 = fragment;
        this.A09 = r11;
        this.A03 = r5;
        this.A04 = r6;
        this.A00 = resources;
        this.A08 = r10;
        this.A02 = userSession;
        this.A07 = r9;
    }

    public final void E1D(1sU r11, AnonymousClass4ZJ r12, AnonymousClass523 r13, Integer num) {
        String str;
        String str2;
        Long l;
        1UQ r1;
        0qQ.A0B(num, 1);
        ConcurrentMap concurrentMap = C56502HzY.A01.A00(this.A02).A00;
        String str3 = r12.A03;
        concurrentMap.put(str3, r12);
        if (0qQ.A0K(str3, C242603Vd.FAVORITES.A00)) {
            str = "feed_timeline_favorites_older";
            List list = r12.A06;
            1Xg r0 = (1Xg) 00k.A0J(00k.A0a(list));
            if (!(r0 == null || (r1 = r0.A06) == null || r1 == 1UQ.A0j)) {
                String obj = UUID.randomUUID().toString();
                0qQ.A07(obj);
                String string = this.A00.getString(2131962322);
                0qQ.A07(string);
                C53464Gow gow = new C53464Gow(obj, string);
                String str4 = gow.A00;
                C57195ISi iSi = new C57195ISi(gow);
                list.add(0, new 1Xg(iSi, iSi.B5J(), str4));
            }
        } else {
            str = "feed_timeline_older";
        }
        C229752ny r2 = this.A06;
        String str5 = r12.A05;
        if (str5 == null) {
            str5 = "";
        }
        C228182kv r14 = this.A07;
        r2.A00("Older_Feed", str5, str, r14.A01, r12.A01, r12.A00, str3);
        C297555rw A002 = C297545rv.A00(this.A04.A00);
        String str6 = r14.A01;
        String A003 = AnonymousClass52G.A00(num);
        0wc A012 = AnonymousClass0kN.A01(new 0xG(str), A002.A00);
        0Aj A004 = A012.A00(A012.A00, "instagram_feed_older_posts_tap");
        if (A004.isSampled()) {
            A004.AAJ("module", str);
            A004.A9F("ig_media_id", Long.MIN_VALUE);
            if (r11 != null) {
                str2 = r11.A07.toString();
            } else {
                str2 = "";
            }
            A004.AAJ("inventory_source", str2);
            if (r13 != null) {
                l = Long.valueOf((long) r13.getPosition());
            } else {
                l = null;
            }
            A004.A9F("m_ix", l);
            A004.AAJ("ranking_session_id", str6);
            A004.AAJ("event_source", A003);
            A004.Cgf();
        }
    }

    public final void ANZ(1sU r6) {
        int[] iArr;
        try {
            C238133Ar scrollingViewProxy = this.A08.getScrollingViewProxy();
            if (scrollingViewProxy != null && (iArr = (int[]) this.A09.invoke(r6)) != null && iArr.length != 0) {
                scrollingViewProxy.EyK();
                new Handler(this.A01.requireContext().getMainLooper()).postDelayed(new AnonymousClass52Q(scrollingViewProxy, iArr), 10);
            }
        } catch (IllegalStateException unused) {
            0wb.A03("MainFeedEndOfFeedDemarcatorDelegate", "decelerateToEOF called after fragment is destroyed");
        }
    }

    public final void E0z(String str) {
        String A002 = AnonymousClass000.A00(1272);
        UserSession userSession = this.A02;
        C228182kv r3 = this.A07;
        String moduleName = this.A03.getModuleName();
        FragmentActivity activity = this.A01.getActivity();
        if (activity != null) {
            new C2355930l(activity, userSession).A04(moduleName, r3.getSessionId(), A002);
        }
    }

    public final void EzM() {
        this.A05.A00(AnonymousClass05K.A00);
    }
}
