package X;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.stickerstore.DirectStoreSticker;

public final class P4A implements C74511Pw6 {
    public final C329067Hl A00;
    public final C329797Kg A01;
    public final Context A02;
    public final Handler A03;
    public final UserSession A04;
    public final C329207Hz A05;
    public final C331697Sa A06;
    public final C69319NjK A07;
    public final 2Er A08;
    public final AnonymousClass7IV A09;
    public final AnonymousClass7I2 A0A;
    public final OZO A0B;
    public final AnonymousClass37D A0C;
    public final C62320sa A0D;
    public final 0sL A0E;

    public final void CxN(C317966o8 r5, N34 n34, String str) {
        C254933tI r2;
        C70726OHv oHv;
        0qQ.A0B(r5, 0);
        this.A0E.invoke(str, n34);
        this.A0D.invoke();
        C329797Kg r0 = this.A01;
        if (r0 == null || (oHv = r0.A09) == null) {
            r2 = null;
        } else {
            r2 = oHv.A02.A01;
        }
        OZO ozo = this.A0B;
        if (ozo != null && ozo.A02()) {
            O02.A00(ozo.A01, false, false);
        }
        this.A06.A05(r5, this.A07, r2);
        this.A0C.A0B();
        C329067Hl r1 = this.A00;
        r1.A1F(0.0f);
        C329067Hl.A0j(r1, true);
    }

    public final void D7d(C317966o8 r9) {
        C317966o8 r5 = r9;
        0qQ.A0B(r9, 0);
        AnonymousClass9H7 r1 = this.A06.A00;
        AnonymousClass7L9 A0K = AnonymousClass9H7.A01(r1).A0K();
        Context context = r1.A02;
        if (context == null) {
            0qQ.A0F("context");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass7L9.A00(A0K, "sendCutoutSticker", new C58790Ixb(14, r1.A10, (Object) null, r5, context, A0K));
        this.A0C.A0B();
    }

    public final void DI3(N34 n34, C68137N2b n2b, String str) {
        0qQ.A0B(n2b, 0);
        this.A0E.invoke(str, n34);
        this.A0D.invoke();
        C69319NjK njK = this.A07;
        if (njK == C69319NjK.DIRECT_COMPOSER_STICKER_SHORTCUT) {
            this.A00.A0b.A06((String) null);
        }
        this.A05.DMN(njK, n2b);
    }

    public final void DT2(C66569MWx mWx) {
        C66569MWx mWx2 = mWx;
        0qQ.A0B(mWx, 0);
        AnonymousClass9H7 r1 = this.A06.A00;
        AnonymousClass7L9 A0K = AnonymousClass9H7.A01(r1).A0K();
        Context context = r1.A02;
        if (context == null) {
            0qQ.A0F("context");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass7L9.A00(A0K, "sendMusicticker", new C58769IxG(39, mWx2, A0K, r1.A10, context));
        this.A0C.A0B();
    }

    public final void Dnb(N34 n34, DirectStoreSticker directStoreSticker, String str) {
        C254933tI r0;
        C70726OHv oHv;
        0qQ.A0B(directStoreSticker, 0);
        this.A0E.invoke(str, n34);
        C331697Sa r1 = this.A06;
        C329797Kg r02 = this.A01;
        if (r02 == null || (oHv = r02.A09) == null) {
            r0 = null;
        } else {
            r0 = oHv.A02.A01;
        }
        r1.A07(r0, directStoreSticker);
        this.A0C.A0B();
        C329067Hl r12 = this.A00;
        r12.A1F(0.0f);
        C329067Hl.A0j(r12, true);
    }

    public final void Duk(String str) {
        0qQ.A0B(str, 0);
        this.A09.A01(this.A08, str);
    }

    public final DirectShareTarget BtL() {
        return this.A06.A00();
    }

    public final void CuT() {
        this.A0A.A00 = AnonymousClass05K.A0C;
        this.A0C.A0B();
    }

    public final void DNZ(N34 n34, String str) {
        this.A0E.invoke(str, n34);
        AnonymousClass7L9 A0K = AnonymousClass9H7.A01(this.A06.A00).A0K();
        C73934PmE pmE = new C73934PmE(A0K, 16);
        AnonymousClass7UF r2 = A0K.A01;
        DirectThreadKey A042 = C66647MaG.A04(((C333517Zg) C66580MXl.A0s(r2.A01)).C6l().AfV());
        if (A042 == null) {
            A0K.A08.invoke("sendLike");
        } else {
            r2.A00();
            pmE.invoke(A042);
            r2.A01((C254933tI) null, (Integer) null, 100);
        }
        this.A0C.A0B();
        this.A00.A1F(0.0f);
    }

    public final void DOo() {
        this.A0A.A00 = AnonymousClass05K.A01;
        this.A0C.A0B();
    }

    public final void Du2() {
        this.A03.post(new PWI(this));
        this.A06.A01();
    }

    public final void Dul(String str) {
        Activity activity;
        Context context = this.A02;
        if ((context instanceof Activity) && (activity = (Activity) context) != null) {
            UserSession userSession = this.A04;
            if (C327357Al.A00(userSession)) {
                2Er r0 = this.A08;
                if (r0 != null) {
                    OVN.A00(new OVN(activity, userSession, r0.BJz(), r0.BRZ(), r0.CVE()), C69416Nky.A0R, (C56139HtR) null, (AnonymousClass7K7) null, (Integer) null, str, 252);
                } else {
                    return;
                }
            } else {
                AnonymousClass7IV r2 = this.A09;
                2Er r1 = this.A08;
                if (r2.A02(activity, r1)) {
                    r2.A00(context, r1);
                }
            }
        }
        this.A0C.A0B();
    }

    public final void EuP() {
        this.A0A.A00 = AnonymousClass05K.A00;
        this.A0C.A0B();
        this.A00.A1F(0.0f);
    }

    public P4A(Context context, Handler handler, UserSession userSession, C329207Hz r7, C331697Sa r8, C69319NjK njK, 2Er r10, C329067Hl r11, C329797Kg r12, AnonymousClass7IV r13, AnonymousClass7I2 r14, OZO ozo, AnonymousClass37D r16, C62320sa r17, 0sL r18) {
        C51972G9s.A1D(handler, njK);
        0sL r1 = r18;
        0qQ.A0B(r1, 14);
        C62320sa r2 = r17;
        0qQ.A0B(r2, 15);
        this.A04 = userSession;
        this.A02 = context;
        this.A03 = handler;
        this.A07 = njK;
        this.A08 = r10;
        this.A0C = r16;
        this.A0A = r14;
        this.A05 = r7;
        this.A09 = r13;
        this.A0B = ozo;
        this.A06 = r8;
        this.A01 = r12;
        this.A00 = r11;
        this.A0E = r1;
        this.A0D = r2;
    }

    public final void Csp(C317966o8 r6, C69319NjK njK, int i) {
        DbY.A1S(r6, njK);
        UserSession userSession = this.A04;
        1Av A002 = 1Au.A00(userSession);
        int A042 = DbS.A04(0Tu.A05, userSession, 36599207330975180L);
        0xY A0p = AnonymousClass7TE.A0p(A002);
        A0p.E5Z("ai_sticker_nux_seen_count", A042);
        A0p.apply();
        this.A06.A04(r6, njK);
        this.A0C.A0B();
        this.A00.A1F(0.0f);
    }
}
