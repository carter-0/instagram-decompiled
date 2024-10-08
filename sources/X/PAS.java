package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public final class PAS implements AnonymousClass7ZY {
    public AnonymousClass2t9 A00;
    public N8U A01;
    public Integer A02 = null;
    public Long A03;
    public String A04 = null;
    public List A05 = AnonymousClass7TE.A1C();
    public boolean A06;
    public final UserSession A07;
    public final AnonymousClass7US A08;
    public final AnonymousClass7US A09;
    public final AnonymousClass7US A0A;
    public final AnonymousClass7UC A0B;
    public final AnonymousClass7UL A0C;
    public final HashMap A0D = AnonymousClass7TE.A1E();

    private boolean A00(int i) {
        if (i >= 0 && i < this.A05.size()) {
            return true;
        }
        0KC.A0O("MsysMessageStoreImpl", "Unable to fetch view model at index %d", new Object[]{Integer.valueOf(i)});
        return false;
    }

    public final void ABw(C62320sa r1) {
    }

    public final void AGk(String str, int i) {
    }

    public final void AHm(AnonymousClass7LQ r1) {
    }

    public final String AaJ(MessageIdentifier messageIdentifier) {
        return "";
    }

    public final int AiV() {
        return 0;
    }

    public final boolean AiX() {
        return false;
    }

    public final Map BOG(MessageIdentifier messageIdentifier) {
        return null;
    }

    public final 2FW BS5(String str) {
        return null;
    }

    public final C70621ODs BS7(String str) {
        return null;
    }

    public final P0O BSI(DirectMessageIdentifier directMessageIdentifier, int i) {
        return null;
    }

    public final AnonymousClass7LQ BSO(String str) {
        return null;
    }

    public final AnonymousClass3SZ BrH() {
        return null;
    }

    public final String BsP(MessageIdentifier messageIdentifier) {
        C331547Rk r0;
        if (messageIdentifier == null) {
            return null;
        }
        C232262tL A012 = A01(messageIdentifier);
        if (A012 instanceof C328627Fn) {
            r0 = ((C328627Fn) A012).ApX().A0G;
        } else {
            if (A012 instanceof AnonymousClass79P) {
                C328617Fm Ar3 = ((AnonymousClass79P) A012).Ar3();
                if (Ar3 instanceof C3266877t) {
                    r0 = ((C3266877t) Ar3).A0C;
                }
            }
            0KC.A0C("MsysMessageStoreImpl", "Unexpected view model type");
            return null;
        }
        if (r0 != null) {
            return r0.A04;
        }
        return null;
    }

    public final boolean CLm(C66709MbG mbG) {
        return false;
    }

    public final int CME(String str) {
        return -1;
    }

    public final boolean CRR(int i, int i2) {
        return false;
    }

    public final boolean CVk(int i) {
        return false;
    }

    public final boolean CVl(int i) {
        return false;
    }

    public final boolean CVm(int i) {
        return false;
    }

    public final boolean CVn(int i) {
        return false;
    }

    public final boolean CXG(int i) {
        return false;
    }

    public final boolean CXJ(int i) {
        return false;
    }

    public final boolean CXL(MessageIdentifier messageIdentifier) {
        return false;
    }

    public final boolean CXN(DirectMessageIdentifier directMessageIdentifier, int i, int i2) {
        while (i <= i2 && A00(i)) {
            if (((C232262tL) this.A05.get(i)).getKey().equals(directMessageIdentifier.A02)) {
                return true;
            }
            i++;
        }
        return false;
    }

    public final boolean Cbq(String str) {
        return false;
    }

    public final boolean Cbr(int i, int i2) {
        return false;
    }

    public final boolean CdD() {
        return false;
    }

    public final void Ctg(List list) {
    }

    public final void CxS() {
    }

    public final void CzI(MessageIdentifier messageIdentifier) {
    }

    public final void DCQ(AnonymousClass7US r1, C328317Ei r2) {
    }

    public final void DI4(DirectMessageIdentifier directMessageIdentifier) {
    }

    public final void DKx(Activity activity, AnonymousClass7L5 r2, AnonymousClass2Ep r3, String str, boolean z) {
    }

    public final void DNJ(AnonymousClass7US r1, C328317Ei r2, AnonymousClass3SZ r3, AnonymousClass3SZ r4, C254793t3 r5) {
    }

    public final void DNe() {
    }

    public final void DQa(String str) {
    }

    public final void DRh() {
    }

    public final void DbV() {
    }

    public final void DiW(C331007Pc r1) {
    }

    public final void Dj0(String str) {
    }

    public final void Dr3(String str) {
    }

    public final void Drm(String str) {
    }

    public final void Drx(MessageIdentifier messageIdentifier) {
    }

    public final void EEb() {
    }

    public final void EQ9(0sP r1, boolean z) {
    }

    public final void EQA(MessageIdentifier messageIdentifier, boolean z) {
    }

    public final void EcA(boolean z) {
    }

    public final void EdR(Integer num, String str, boolean z) {
    }

    public final void EdY(boolean z) {
    }

    public final void Ehm(boolean z) {
    }

    public final void EjZ(AnonymousClass3SZ r1) {
    }

    public final void Eja(AnonymousClass3SZ r1, AnonymousClass3SZ r2, C254793t3 r3) {
    }

    public final boolean Et8(DirectMessageIdentifier directMessageIdentifier, boolean z) {
        return false;
    }

    public final void EtD(String str, boolean z) {
    }

    public final boolean EvC(C66709MbG mbG, boolean z) {
        return false;
    }

    public final void FK6(N4D n4d, DirectMessageIdentifier directMessageIdentifier) {
    }

    public final void FLJ() {
    }

    public final void FLj(AnonymousClass7US r1, C328317Ei r2, AnonymousClass3SZ r3, boolean z) {
    }

    public final C232262tL A01(MessageIdentifier messageIdentifier) {
        HashMap hashMap = this.A0D;
        String str = messageIdentifier.A01;
        String str2 = str;
        if (hashMap.containsKey(str) || ((str2 = messageIdentifier.A00()) != null && hashMap.containsKey(str2))) {
            return (C232262tL) hashMap.get(str2);
        }
        throw AnonymousClass7TE.A0z(002.A0u("ViewModelMap does not contain messageIdentifier ", str, " ", str2));
    }

    public final C232232tF BJO(int i) {
        AnonymousClass2t9 r0 = this.A00;
        if (r0 == null) {
            return null;
        }
        return r0.A03.A01(r0.getItemViewType(i));
    }

    public final C254703su BLR() {
        C53394GnR gnR;
        C74552Pwl pwl;
        N8U n8u = this.A01;
        if (!(n8u == null || (gnR = n8u.A07) == null || (pwl = (C74552Pwl) gnR.A01) == null)) {
            UserSession userSession = this.A07;
            String id = DbT.A0j(userSession).getId();
            C70763OKj oKj = (C70763OKj) userSession.A01(C70763OKj.class, new C73897PlY(userSession, 41));
            for (int i = 0; i < pwl.getCount(); i++) {
                if (pwl.BS3(i) == 0 && !id.equals(pwl.BsK(i))) {
                    C68899Nab A002 = oKj.A00(pwl, i);
                    if (A002.A10 == 2FW.A1g) {
                        return A002;
                    }
                }
            }
        }
        return null;
    }

    public final String BOv() {
        return this.A04;
    }

    public final int CMC(String str) {
        return this.A05.indexOf(this.A0D.get(str));
    }

    public final boolean Cat(String str) {
        C331547Rk r0;
        C232262tL r2 = (C232262tL) this.A0D.get(str);
        if (!(r2 instanceof C328627Fn) || (r0 = ((C328627Fn) r2).ApX().A0G) == null) {
            return false;
        }
        return r0.A08;
    }

    public final int getItemCount() {
        AnonymousClass2t9 r0 = this.A00;
        if (r0 == null) {
            return 0;
        }
        return r0.getItemCount();
    }

    public PAS(UserSession userSession, AnonymousClass7US r4, AnonymousClass7US r5, AnonymousClass7US r6, AnonymousClass7UC r7, AnonymousClass7UL r8) {
        this.A07 = userSession;
        this.A09 = r4;
        this.A0B = r7;
        this.A08 = r5;
        this.A0C = r8;
        this.A0A = r6;
    }

    public final void A02(1a8 r3, PCQ pcq) {
        PU8.A00(C72120Owf.A00(pcq.A03(), this, 39), r3, this, 52);
    }

    public final boolean A03(MessageIdentifier messageIdentifier) {
        C61063Jw1 jw1;
        C232262tL A012 = A01(messageIdentifier);
        if (!(A012 instanceof C328627Fn)) {
            return false;
        }
        AnonymousClass7FW Aqp = ((C328627Fn) A012).Aqp();
        if (!(Aqp instanceof AnonymousClass79c) || (jw1 = ((AnonymousClass79c) Aqp).A02.A01) == null || ((C74552Pwl) jw1.A03).Azt(jw1.A01) <= 0) {
            return false;
        }
        return true;
    }

    public final HashSet AiW() {
        return AnonymousClass7TE.A1F();
    }

    public final String ArO(MessageIdentifier messageIdentifier) {
        Object obj;
        C232262tL A012 = A01(messageIdentifier);
        if (A012 instanceof C328627Fn) {
            obj = ((C328627Fn) A012).Aqp();
        } else if (A012 instanceof AnonymousClass74E) {
            obj = ((AnonymousClass74E) A012).A02;
        } else if (A012 instanceof N7S) {
            obj = ((N7S) A012).A01;
        } else if (A012 instanceof N7N) {
            obj = ((N7N) A012).A02;
        } else if (A012 instanceof N7Q) {
            obj = ((N7Q) A012).A01;
        } else if (A012 instanceof N7R) {
            obj = ((N7R) A012).A01;
        } else if (A012 instanceof C68875NaC) {
            obj = ((C68875NaC) A012).A02;
        } else if (A012 instanceof C68222N6l) {
            obj = ((C68222N6l) A012).A02;
        } else if (A012 instanceof C66898Meg) {
            obj = ((C66898Meg) A012).A02;
        } else if (A012 instanceof C66782McT) {
            obj = ((C66782McT) A012).A02;
        } else if (A012 instanceof AnonymousClass79N) {
            obj = ((AnonymousClass79N) A012).A02;
        } else if (A012 instanceof N7I) {
            obj = ((N7I) A012).A02;
        } else {
            obj = null;
        }
        if (obj instanceof C3270379d) {
            return ((C3270379d) obj).ArN();
        }
        return null;
    }

    public final ArrayList BSC(String str) {
        return AnonymousClass7TE.A1C();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        r3 = (X.AnonymousClass752) r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.instagram.model.direct.messageid.DirectMessageIdentifier BSQ(X.02X r6, int r7, boolean r8) {
        /*
            r5 = this;
            boolean r0 = r5.A00(r7)
            r4 = 0
            if (r0 == 0) goto L_0x0048
            java.util.List r0 = r5.A05
            java.lang.Object r1 = r0.get(r7)
            X.2tL r1 = (X.C232262tL) r1
            boolean r0 = r1 instanceof X.C328627Fn
            if (r0 == 0) goto L_0x0048
            X.7Fn r1 = (X.C328627Fn) r1
            X.7FW r3 = r1.Aqp()
            boolean r0 = r3 instanceof X.AnonymousClass752
            if (r0 == 0) goto L_0x0048
            X.752 r3 = (X.AnonymousClass752) r3
            X.1Xj r1 = r3.A08
            if (r1 == 0) goto L_0x0048
            boolean r0 = r1.CeS()
            if (r0 == 0) goto L_0x0048
            boolean r0 = r1.A5f()
            if (r0 != 0) goto L_0x0048
            X.2FW r2 = r3.Aqm()
            boolean r0 = r6.test(r2)
            if (r0 == 0) goto L_0x0048
            com.instagram.model.direct.messageid.MessageIdentifier r0 = r3.BSG()
            java.lang.String r1 = r0.A01
            java.lang.String r0 = r0.A00()
            com.instagram.model.direct.messageid.DirectMessageIdentifier r4 = new com.instagram.model.direct.messageid.DirectMessageIdentifier
            r4.<init>(r2, r1, r0)
        L_0x0048:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PAS.BSQ(X.02X, int, boolean):com.instagram.model.direct.messageid.DirectMessageIdentifier");
    }

    public final ArrayList Bk1(int i) {
        return AnonymousClass7TE.A1C();
    }

    public final void CNE(Context context, C274644oo r3, AnonymousClass7L2 r4) {
        02V.A05(r3.AZJ() instanceof AnonymousClass2t9);
        this.A00 = r3.AZJ();
    }

    public final boolean CUS(int i) {
        if (!A00(i)) {
            return false;
        }
        C232262tL r3 = (C232262tL) this.A05.get(i);
        int i2 = i + 1;
        if (A00(i2) && (this.A05.get(i2) instanceof AnonymousClass7F4)) {
            return true;
        }
        if (!(r3 instanceof C328627Fn)) {
            return false;
        }
        AnonymousClass7FW Aqp = ((C328627Fn) r3).Aqp();
        if (!(Aqp instanceof AnonymousClass7FF)) {
            return false;
        }
        AnonymousClass7FF r2 = (AnonymousClass7FF) Aqp;
        C328637Fo A012 = C328037De.A01(r2.CUQ(), r2.CUR());
        if (A012 == C328637Fo.GROUP_WITH_ABOVE || A012 == C328637Fo.GROUP_WITH_BOTH) {
            return true;
        }
        return false;
    }

    public final boolean CUT(int i) {
        AnonymousClass7FW BmF;
        if (A00(i)) {
            int i2 = i - 1;
            if (!A00(i2) || !(this.A05.get(i2) instanceof C331007Pc)) {
                C232262tL r1 = (C232262tL) this.A05.get(i);
                if (r1 instanceof C328627Fn) {
                    BmF = ((C328627Fn) r1).Aqp();
                } else if (r1 instanceof AnonymousClass79P) {
                    BmF = ((AnonymousClass79P) r1).BmF();
                }
                if (BmF != null && (BmF instanceof AnonymousClass7FF)) {
                    AnonymousClass7FF r2 = (AnonymousClass7FF) BmF;
                    C328637Fo A012 = C328037De.A01(r2.CUQ(), r2.CUR());
                    if (A012 == C328637Fo.GROUP_WITH_BELOW || A012 == C328637Fo.GROUP_WITH_BOTH) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
