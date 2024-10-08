package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.H3z  reason: case insensitive filesystem */
public final class C54230H3z extends 2Ru implements C231272rL, C231322rQ {
    public boolean A00;
    public final UserSession A01;
    public final GTP A02;
    public final AnonymousClass4DU A03;
    public final AnonymousClass2tu A04;
    public final Map A05 = AnonymousClass7TE.A1E();
    public final AnonymousClass0eM A06 = AnonymousClass0eN.A01(new C20699WxV(this, 33));
    public final Context A07;
    public final AnonymousClass2s2 A08;
    public final C229122ms A09;
    public final C231762sK A0A;
    public final Map A0B = AnonymousClass7TE.A1E();

    /* JADX WARNING: type inference failed for: r3v0, types: [X.2s0, X.2s2, java.lang.Object] */
    public C54230H3z(FragmentActivity fragmentActivity, AnonymousClass2kR r20, C231032ql r21, C229122ms r22) {
        AnonymousClass2kR r15 = r20;
        C231032ql r9 = r21;
        C229122ms r0 = r22;
        C51974G9v.A1M(r15, r0, r9);
        this.A09 = r0;
        Context context = r15.A00;
        this.A07 = context;
        UserSession userSession = r15.A01;
        this.A01 = userSession;
        AnonymousClass4DU r7 = r15.A02;
        this.A03 = r7;
        ? obj = new Object();
        this.A08 = obj;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        GTP gtp = new GTP(fragmentActivity2, fragmentActivity2, r15, true, true);
        this.A02 = gtp;
        AnonymousClass2tu r5 = new AnonymousClass2tu(context, r7, userSession, r9, AnonymousClass05K.A0B, true);
        this.A04 = r5;
        C231762sK r4 = new C231762sK(context);
        this.A0A = r4;
        init(new C231642s0[]{r4, obj, gtp, r5});
    }

    public final void A00() {
        String str;
        this.A00 = true;
        clear();
        if (!isEmpty()) {
            HashSet A1F = AnonymousClass7TE.A1F();
            int i = 0;
            for (Object next : ((IWI) this.A06.getValue()).A01) {
                int i2 = i + 1;
                if (i < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                if (next instanceof 1Xj) {
                    1Xj r5 = (1Xj) next;
                    AnonymousClass3W1 BQr = BQr(r5);
                    BQr.A0D(i);
                    addModel(r5, BQr, this.A02);
                    if (BQr.A0m == AnonymousClass3WA.A0F) {
                        continue;
                    } else {
                        String id = r5.getId();
                        if (id != null) {
                            A1F.add(id);
                        } else {
                            throw AnonymousClass7TE.A0y();
                        }
                    }
                } else if (next instanceof C268364dG) {
                    C268364dG r52 = (C268364dG) next;
                    Map map = this.A05;
                    String str2 = r52.A05;
                    Object obj = map.get(str2);
                    if (obj == null) {
                        obj = new C17524VZd(r52, i);
                        map.put(str2, obj);
                    }
                    String str3 = r52.A07;
                    String str4 = null;
                    if (!(str3 == null || (str = r52.A06) == null)) {
                        AtomicBoolean atomicBoolean = 1Xj.A0i;
                        str4 = 002.A0T(str3, str, '_');
                    }
                    if (!00k.A0u(A1F, str4)) {
                        addModel(r52, obj, this.A04);
                    }
                }
                i = i2;
            }
        }
        C229122ms r1 = this.A09;
        if (r1.CKB() || r1.CT5() || r1.isLoading()) {
            addModel(r1, this.A0A);
        }
        notifyDataSetChanged();
    }

    public final /* synthetic */ void A8l(Object obj, int i) {
    }

    public final AnonymousClass3W1 BQr(1Xj r4) {
        0qQ.A0B(r4, 0);
        Map map = this.A0B;
        Object obj = map.get(r4);
        AnonymousClass3W1 r1 = obj;
        if (obj == null) {
            AnonymousClass3W1 A18 = G9t.A18(r4);
            A18.A0A(C243233Xy.A00(r4));
            map.put(r4, A18);
            r1 = A18;
        }
        return (AnonymousClass3W1) r1;
    }

    public final void Crn() {
        this.A00 = false;
    }

    public final void EU8(AnonymousClass310 r2) {
        0qQ.A0B(r2, 0);
        this.A02.A03(r2);
    }

    public final void EWg(AnonymousClass2xS r2) {
        0qQ.A0B(r2, 0);
        this.A02.A03 = r2;
    }

    public final void A01(List list) {
        AnonymousClass0eM r2 = this.A06;
        IWI iwi = (IWI) r2.getValue();
        iwi.A04.clear();
        iwi.A05.clear();
        C228382la r0 = iwi.A00;
        if (r0 != null) {
            r0.DMW();
        }
        ((IWI) r2.getValue()).A03(list);
        ((IWI) r2.getValue()).A02();
        A00();
    }

    public final boolean CRD() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    public final boolean isEmpty() {
        return AnonymousClass7TF.A1Q(((IWI) this.A06.getValue()).A01.size());
    }

    public final void AV9() {
        A00();
    }

    public final /* synthetic */ List CBH() {
        return AnonymousClass7TE.A1C();
    }

    public final /* synthetic */ int BJU(String str) {
        return -1;
    }

    public final void Cs9(1Xj r1) {
        A00();
    }

    public final /* synthetic */ Object EDl(int i) {
        return null;
    }
}
