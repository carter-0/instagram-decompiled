package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.GcK  reason: case insensitive filesystem */
public final class C52767GcK extends GAR implements AnonymousClass4DU {
    public static final String __redex_internal_original_name = "OlderContextualFeedController";
    public long A00;
    public C324356z9 A01;
    public Long A02;
    public String A03;
    public String A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public String A08;
    public final Fragment A09;
    public final 1wn A0A = new IO4((Object) this, 27);
    public final 1wn A0B = new IO4((Object) this, 28);
    public final UserSession A0C;
    public final JRI A0D;
    public final 0tp A0E;
    public final C228622ly A0F;
    public final AnonymousClass1L1 A0G;
    public final String A0H;
    public final C228232l0 A0I;

    public C52767GcK(Bundle bundle, Fragment fragment, UserSession userSession, JRI jri, C228232l0 r13, AnonymousClass1L1 r14, String str) {
        this.A09 = fragment;
        UserSession userSession2 = userSession;
        this.A0C = userSession;
        this.A0H = str;
        this.A0D = jri;
        this.A0G = r14;
        this.A0E = 0tq.A00(userSession);
        this.A05 = bundle.getString(C273654mx.A00(34));
        this.A08 = bundle.getString(AnonymousClass000.A00(216));
        this.A03 = bundle.getString(AnonymousClass000.A00(213));
        this.A06 = bundle.getBoolean(AnonymousClass000.A00(215));
        Context context = fragment.getContext();
        if (context != null) {
            this.A0F = new C228622ly(context, AnonymousClass07i.A00(fragment), userSession2, this, (C228322lL) null, (C228312lJ) null, false);
            this.A0I = r13;
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return true;
    }

    public static final void A02(1FI r20, C52767GcK gcK, boolean z) {
        C324356z9 r0;
        String str;
        HashMap hashMap;
        String str2;
        C324356z9 r4;
        Long l;
        C52767GcK gcK2 = gcK;
        if (!z || (l = gcK2.A02) == null || System.currentTimeMillis() - l.longValue() >= gcK2.A00) {
            if (("feed_timeline_older".equals(gcK2.A0H) || !z) && (r0 = gcK2.A01) != null) {
                str = r0.A03.A07;
            } else {
                str = null;
            }
            C62500to r8 = new C62500to(gcK2.A0E);
            String str3 = gcK2.A08;
            if (str3 != null) {
                hashMap = AnonymousClass7TE.A1E();
                hashMap.put("pagination_source", str3);
            } else {
                hashMap = null;
            }
            if (z) {
                gcK2.A0G.A00 = AnonymousClass7TF.A0b();
            } else if (!(hashMap == null || (str2 = gcK2.A04) == null)) {
                hashMap.put("last_taken_at", str2);
            }
            UserSession userSession = gcK2.A0C;
            1Cm r1 = new 1Cm(userSession);
            String str4 = gcK2.A0G.A00;
            1FI r9 = r20;
            1FQ A002 = 1FP.A00(userSession, r9, str, str3, false);
            if (hashMap == null) {
                hashMap = 0Yt.A0E();
            }
            AnonymousClass1GT A003 = r1.A00(new 1FS((1FR) null, r8, r9, A002, (Long) null, str4, str, (String) null, (String) null, AnonymousClass7TG.A0j(), (String) null, gcK2.A0I.AUH("feed/timeline/"), hashMap, 1FS.A0G.incrementAndGet(), false, false), -20);
            if (A003 instanceof AnonymousClass1GS) {
                C324356z9 r42 = gcK2.A01;
                if (r42 != null) {
                    r42.A04(((AnonymousClass1GS) A003).A00, new C54379HAu(5, A003, gcK2));
                }
            } else if ((A003 instanceof C228842mQ) && (r4 = gcK2.A01) != null) {
                r4.A03(((C228842mQ) A003).A00, new C54379HAu(5, A003, gcK2));
            }
        } else {
            gcK2.A0D.DeS();
        }
    }

    public final String getModuleName() {
        return this.A0H;
    }
}
