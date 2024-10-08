package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import kotlin.enums.EnumEntries;

/* renamed from: X.P3z  reason: case insensitive filesystem */
public final class C72386P3z implements C41831B2m {
    public C74536PwV A00;
    public int A01;
    public final Activity A02;
    public final 1a8 A03 = C66580MXl.A0O();
    public final UserSession A04;
    public final C330437Mt A05;
    public final C70844ONw A06;
    public final C70454O7f A07;
    public final AnonymousClass7ZA A08;
    public final C70770OKq A09;
    public final C70957OTe A0A;
    public final C254783t2 A0B;

    public C72386P3z(Activity activity, FragmentActivity fragmentActivity, AnonymousClass0iw r13, 1aU r14, UserSession userSession, C330437Mt r16, AnonymousClass7SU r17, C332907Wx r18, AnonymousClass7ZA r19, C254783t2 r20) {
        C332907Wx r6 = r18;
        AnonymousClass7ZA r1 = r19;
        DbW.A1N(r1, 2, r6);
        this.A02 = activity;
        this.A08 = r1;
        C254783t2 r9 = r20;
        this.A0B = r9;
        this.A04 = userSession;
        this.A05 = r16;
        C70957OTe oTe = new C70957OTe(r13, userSession);
        this.A0A = oTe;
        C70770OKq oKq = new C70770OKq(activity, r13, userSession);
        this.A09 = oKq;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        this.A06 = new C70844ONw(fragmentActivity2, r13, r14, userSession, r17, r6, oKq, oTe, r9);
        this.A07 = new C70454O7f(userSession);
    }

    public final void reset() {
        this.A01 = 0;
    }

    public final C392289uY CrZ() {
        C69342Njh njh;
        C69342Njh njh2;
        C69324NjP njP;
        C392289uY nWt;
        C69324NjP njP2;
        C330437Mt r1 = this.A05;
        C69323NjO njO = null;
        if (r1 != null) {
            return new C66768McD(r1);
        }
        C74536PwV pwV = this.A00;
        if (pwV == null) {
            return null;
        }
        while (this.A01 < C66580MXl.A04(((PCH) pwV).A00)) {
            int i = this.A01;
            C68321NAi nAi = ((PCH) pwV).A00;
            if (nAi.mResultSet.getInteger(i, 2) == 0) {
                UserSession userSession = this.A04;
                long j = nAi.mResultSet.getLong(this.A01, 0);
                String string = nAi.mResultSet.getString(this.A01, 7);
                String string2 = nAi.mResultSet.getString(this.A01, 11);
                EnumEntries enumEntries = C69355Nju.A02;
                C69355Nju nju = (C69355Nju) 0Yt.A01(Integer.valueOf(nAi.mResultSet.getInteger(this.A01, 1)), C69355Nju.A01);
                Long nullableLong = nAi.mResultSet.getNullableLong(this.A01, 29);
                String string3 = nAi.mResultSet.getString(this.A01, 30);
                String string4 = nAi.mResultSet.getString(this.A01, 31);
                Integer A0o = C66581MXm.A0o(nAi.mResultSet, this.A01, 32);
                if (A0o != null) {
                    njh = (C69342Njh) 0Yt.A01(A0o, C69342Njh.A01);
                } else {
                    njh = null;
                }
                Long nullableLong2 = nAi.mResultSet.getNullableLong(this.A01, 33);
                String string5 = nAi.mResultSet.getString(this.A01, 34);
                String string6 = nAi.mResultSet.getString(this.A01, 35);
                Integer A0o2 = C66581MXm.A0o(nAi.mResultSet, this.A01, 36);
                if (A0o2 != null) {
                    njh2 = (C69342Njh) 0Yt.A01(A0o2, C69342Njh.A01);
                } else {
                    njh2 = null;
                }
                Integer A0o3 = C66581MXm.A0o(nAi.mResultSet, this.A01, 28);
                if (A0o3 != null) {
                    njO = (C69323NjO) 0Yt.A01(A0o3, C69323NjO.A01);
                }
                String string7 = nAi.mResultSet.getString(this.A01, 47);
                if (string7 == null || (njP = (C69324NjP) 0Yt.A01(string7, C69324NjP.A01)) == null) {
                    njP = C69324NjP.UNSUPPORTED;
                }
                nWt = new C68783NWt(this.A03, userSession, this.A06, this.A07, njO, njh, njh2, njP, nju, this.A08, nullableLong, nullableLong2, string, string2, string3, string4, string5, string6, j);
            } else {
                if (nAi.mResultSet.getInteger(this.A01, 2) == 2) {
                    Activity activity = this.A02;
                    UserSession userSession2 = this.A04;
                    long j2 = nAi.mResultSet.getLong(this.A01, 0);
                    String A0v = C66581MXm.A0v(nAi, this.A01);
                    String string8 = nAi.mResultSet.getString(this.A01, 7);
                    String string9 = nAi.mResultSet.getString(this.A01, 11);
                    EnumEntries enumEntries2 = C69355Nju.A02;
                    C69355Nju nju2 = (C69355Nju) 0Yt.A01(Integer.valueOf(nAi.mResultSet.getInteger(this.A01, 1)), C69355Nju.A01);
                    Long nullableLong3 = nAi.mResultSet.getNullableLong(this.A01, 29);
                    String string10 = nAi.mResultSet.getString(this.A01, 30);
                    String string11 = nAi.mResultSet.getString(this.A01, 31);
                    Long nullableLong4 = nAi.mResultSet.getNullableLong(this.A01, 33);
                    String string12 = nAi.mResultSet.getString(this.A01, 34);
                    String string13 = nAi.mResultSet.getString(this.A01, 35);
                    String string14 = nAi.mResultSet.getString(this.A01, 21);
                    String string15 = nAi.mResultSet.getString(this.A01, 19);
                    String string16 = nAi.mResultSet.getString(this.A01, 24);
                    String string17 = nAi.mResultSet.getString(this.A01, 22);
                    String string18 = nAi.mResultSet.getString(this.A01, 27);
                    String string19 = nAi.mResultSet.getString(this.A01, 25);
                    String string20 = nAi.mResultSet.getString(this.A01, 47);
                    if (string20 == null || (njP2 = (C69324NjP) 0Yt.A01(string20, C69324NjP.A01)) == null) {
                        njP2 = C69324NjP.UNSUPPORTED;
                    }
                    nWt = new C68784NWu(activity, this.A03, userSession2, this.A06, njP2, nju2, this.A08, nullableLong3, nullableLong4, A0v, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, string19, j2);
                } else {
                    this.A01++;
                }
            }
            this.A01++;
            return nWt;
        }
        return null;
    }

    public final void E3d() {
        MsysThreadId msysThreadId;
        AnonymousClass9HR A042 = AnonymousClass6W3.A04(this.A0B);
        if (A042 != null && (A042 instanceof MsysThreadId) && (msysThreadId = (MsysThreadId) A042) != null) {
            C70957OTe oTe = this.A0A;
            UserSession userSession = oTe.A03;
            if (182.A06(0Tu.A05, userSession, 36314296380033538L)) {
                C66594MYg A012 = MYc.A01(userSession, "MsysProactiveWarningBannerManager");
                PU7.A00(A012.A01.A01(msysThreadId).A0Q(C318146oT.A00), oTe.A02, oTe, 19);
            }
        }
    }

    public final void destroy() {
        this.A03.A01();
        this.A0A.A02.A01();
    }
}
