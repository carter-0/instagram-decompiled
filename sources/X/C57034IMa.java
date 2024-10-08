package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.IMa  reason: case insensitive filesystem */
public abstract class C57034IMa implements C270744hE {
    public static final long A03 = TimeUnit.MINUTES.toSeconds(60);
    public final long A00 = TimeUnit.SECONDS.toMillis(A03);
    public final GF2 A01;
    public final C270654h5 A02;

    public static String A01(C57034IMa iMa, Object obj) {
        0qQ.A0B(obj, 0);
        GF2 gf2 = iMa.A01;
        if (gf2 != null) {
            return gf2.A01();
        }
        return null;
    }

    public final void AHo(UserSession userSession) {
    }

    public final Integer AJJ(UserSession userSession, C324596za r9, C324356z9 r10) {
        0qQ.A0B(r10, 1);
        return r10.A01(r9, Beh(), A03, A03());
    }

    public final void AQ0(Context context, UserSession userSession, String str, String str2, boolean z, boolean z2) {
        1OC A002;
        String A012;
        String A022;
        String str3;
        String str4;
        ILD ild = new ILD(this, 2);
        UserSession userSession2 = userSession;
        1P2 A003 = 1P1.A00(userSession2);
        String Beh = Beh();
        0qQ.A0B(Beh, 0);
        if (this instanceof HKL) {
            HKL hkl = (HKL) this;
            A012 = A01(hkl, userSession2);
            A022 = hkl.A02();
            str3 = hkl.A00;
            str4 = "clips/star_search_only/";
        } else if (this instanceof HKK) {
            HKK hkk = (HKK) this;
            A012 = A01(hkk, userSession2);
            A022 = hkk.A02();
            str3 = hkk.A00;
            str4 = "clips/mixed_media_only/";
        } else {
            if (this instanceof HKO) {
                HKO hko = (HKO) this;
                String A013 = A01(hko, userSession2);
                String A023 = hko.A02();
                String str5 = hko.A04;
                String str6 = hko.A03;
                String str7 = hko.A02;
                A002 = I5M.A00(userSession2, hko.A00, hko.A01, "clips/media_notes/", (String) null, A013, A023, str5, str7, str6);
            } else if (this instanceof HKN) {
                HKN hkn = (HKN) this;
                String A014 = A01(hkn, userSession2);
                String A024 = hkn.A02();
                String str8 = hkn.A03;
                String str9 = hkn.A02;
                A002 = I5M.A00(userSession2, (Integer) null, hkn.A00, "clips/media_notes/", (String) null, A014, A024, str8, hkn.A01, str9);
            } else if (this instanceof HKJ) {
                HKJ hkj = (HKJ) this;
                A012 = A01(hkj, userSession2);
                A022 = hkj.A02();
                str3 = hkj.A00;
                str4 = "clips/discover/location/";
            } else if (this instanceof HKI) {
                HKI hki = (HKI) this;
                A012 = A01(hki, userSession2);
                A022 = hki.A02();
                str3 = hki.A00;
                str4 = "clips/discover/social/";
            } else if (this instanceof HKM) {
                HKM hkm = (HKM) this;
                A012 = A01(hkm, userSession2);
                A022 = hkm.A02();
                str3 = hkm.A00;
                str4 = "clips/connected/";
            } else {
                A002 = HKP.A00((HKP) this, (String) null);
            }
            0qQ.A0B(A002, 0);
            1P2.A00(A003, ild, (1P0) null, (1P0) null, A002, (1OC) null, Beh, A03, A03(), false);
        }
        A002 = I5M.A01(userSession2, str4, (String) null, A012, A022, str3);
        0qQ.A0B(A002, 0);
        1P2.A00(A003, ild, (1P0) null, (1P0) null, A002, (1OC) null, Beh, A03, A03(), false);
    }

    public final boolean ARQ(UserSession userSession) {
        return false;
    }

    public final 1Xj B65(UserSession userSession) {
        return null;
    }

    public final Integer Bec(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return 1P1.A00(userSession).A06(Beh(), A03, A03());
    }

    public final /* synthetic */ void Cn2(UserSession userSession, String str) {
    }

    public final /* synthetic */ void ES0(GEP gep) {
    }

    public final /* synthetic */ void ESn(Context context) {
    }

    public final /* synthetic */ void EiB(String str) {
    }

    public final /* synthetic */ void Elk(C290515fR r1) {
    }

    public final String A02() {
        C270654h5 r0 = this.A02;
        if (r0 != null) {
            return r0.A00();
        }
        return null;
    }

    public final boolean A03() {
        if ((this instanceof HKN) || (this instanceof HKO) || (this instanceof HKL) || (this instanceof HKK) || !(this instanceof HKJ)) {
            return false;
        }
        return true;
    }

    public C57034IMa(C270654h5 r4, GF2 gf2) {
        this.A01 = gf2;
        this.A02 = r4;
    }

    public final /* synthetic */ boolean CTp(boolean z) {
        return false;
    }
}
