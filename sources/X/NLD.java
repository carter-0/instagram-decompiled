package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class NLD extends 2Ru implements AnonymousClass7Q7 {
    public final Context A00;
    public final NLc A01;
    public final C69656Npe A02;
    public final FAT A03;
    public final C39695A5l A04;
    public final C336947fR A05;
    public final NLN A06;
    public final NLO A07;
    public final NLP A08;
    public final NLR A09;
    public final C66971Mg4 A0A;
    public final C229122ms A0B;
    public final C231762sK A0C;
    public final C46457DfL A0D;
    public final C46457DfL A0E;
    public final C47617EAd A0F;
    public final ArrayList A0G;
    public final HashSet A0H;
    public final AnonymousClass0eM A0I = C73899Pla.A00(this, 7);
    public final boolean A0J;
    public final boolean A0K;
    public final AnonymousClass0iw A0L;
    public final UserSession A0M;
    public final C74492Pvm A0N;
    public final G6T A0O;
    public final G6U A0P;
    public final G82 A0Q;

    public final boolean AJe(String str) {
        0qQ.A0B(str, 0);
        return this.A0H.contains(str);
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.Npe, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, X.A5l] */
    public NLD(Context context, AnonymousClass0iw r27, UserSession userSession, C74492Pvm pvm, G6T g6t, G6U g6u, C229122ms r32, G82 g82, boolean z, boolean z2) {
        UserSession userSession2 = userSession;
        boolean A1Y = DbW.A1Y(userSession2);
        Context context2 = context;
        this.A00 = context2;
        this.A0M = userSession2;
        G82 g822 = g82;
        this.A0Q = g822;
        C74492Pvm pvm2 = pvm;
        this.A0N = pvm2;
        G6T g6t2 = g6t;
        this.A0O = g6t2;
        G6U g6u2 = g6u;
        this.A0P = g6u2;
        this.A0B = r32;
        AnonymousClass0iw r4 = r27;
        this.A0L = r4;
        this.A0J = z;
        this.A0K = z2;
        C336947fR r14 = new C336947fR(context2);
        this.A05 = r14;
        C46457DfL dfL = new C46457DfL(context2, (G6T) null);
        this.A0D = dfL;
        C46457DfL dfL2 = new C46457DfL(context2, g6t2, g6u2);
        this.A0E = dfL2;
        C47617EAd eAd = new C47617EAd(r4, g822, A1Y, false);
        this.A0F = eAd;
        NLO nlo = new NLO(context2);
        this.A07 = nlo;
        NLP nlp = new NLP(context2);
        this.A08 = nlp;
        NLc nLc = new NLc(context2, r4, userSession2, pvm2);
        this.A01 = nLc;
        NLR nlr = new NLR(context2);
        this.A09 = nlr;
        NLN nln = new NLN(context2);
        this.A06 = nln;
        C66971Mg4 mg4 = new C66971Mg4(context2);
        this.A0A = mg4;
        C231762sK r2 = new C231762sK(context2);
        this.A0C = r2;
        ? obj = new Object();
        obj.A00 = false;
        obj.A02 = false;
        obj.A01 = false;
        this.A02 = obj;
        this.A03 = new FAT(false, false, false, false, false);
        ? obj2 = new Object();
        this.A04 = obj2;
        this.A0G = AnonymousClass7TE.A1C();
        this.A0H = AnonymousClass7TE.A1F();
        C46457DfL dfL3 = dfL2;
        C231642s0 r16 = (C231642s0) this.A0I.getValue();
        init(new C231642s0[]{nln, r14, dfL, r16, dfL3, eAd, nlo, nlp, nLc, nlr, mg4, r2});
        obj2.A00 = A1Y;
    }

    public final void A00(List list) {
        Object obj;
        C231642s0 r0;
        C231642s0 r02;
        C46448DfA dfA;
        ArrayList arrayList = this.A0G;
        arrayList.clear();
        arrayList.addAll(list);
        clear();
        HashSet hashSet = this.A0H;
        hashSet.clear();
        Iterator A1G = AnonymousClass7TE.A1G(arrayList);
        while (A1G.hasNext()) {
            Object A0a = AnonymousClass7TF.A0a(A1G);
            if (A0a instanceof OIM) {
                r02 = this.A06;
                dfA = A0a;
            } else {
                if (A0a instanceof C46448DfA) {
                    if (((C46448DfA) A0a).A0G != null) {
                        r02 = this.A0D;
                        dfA = A0a;
                    } else {
                        obj = this.A04;
                        r0 = this.A05;
                    }
                } else if (C61057Jvv.A00(4, A0a)) {
                    r02 = (C231632rz) this.A0I.getValue();
                    dfA = A0a;
                } else if (A0a instanceof F06) {
                    r02 = this.A0F;
                    dfA = A0a;
                } else if (A0a instanceof C70661OFi) {
                    obj = this.A02;
                    r0 = this.A07;
                } else if (A0a instanceof C68303N9q) {
                    if (this.A0J) {
                        this.A01.A00 = true;
                    }
                    NLc nLc = this.A01;
                    nLc.A01 = this.A0K;
                    addModel(A0a, C60340gF.A00, nLc);
                    hashSet.add(((C68303N9q) A0a).A00.getId());
                } else if (A0a instanceof C49862FAc) {
                    obj = this.A03;
                    r0 = this.A08;
                } else if (A0a instanceof PR9) {
                    r02 = this.A09;
                    dfA = A0a;
                } else if (A0a instanceof FGF) {
                    r02 = this.A0A;
                    dfA = A0a;
                } else if (A0a instanceof C70478O8d) {
                    C46448DfA dfA2 = ((C70478O8d) A0a).A00;
                    r02 = this.A0E;
                    dfA = dfA2;
                }
                addModel(A0a, obj, r0);
            }
            addModel(dfA, r02);
        }
        addModel(this.A0B, this.A0C);
        notifyDataSetChanged();
    }

    public final void FK4() {
        notifyDataSetChanged();
    }
}
