package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.ListAdapter;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.genericsurvey.fragment.GenericSurveyFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.UdD  reason: case insensitive filesystem */
public final class C15462UdD extends C331047Ph implements C252243on, C231272rL, ListAdapter, C231322rQ, X4L {
    public boolean A00;
    public final AnonymousClass2rV A01 = new AnonymousClass2rV();
    public final VZW A02;
    public final C17927ViI A03 = new C17927ViI();
    public final List A04 = new ArrayList();
    public final Context A05;
    public final UserSession A06;
    public final GTP A07;
    public final AnonymousClass4DU A08;
    public final C15511Ue0 A09;
    public final EAL A0A;
    public final C47589E9b A0B;
    public final C15518Ue7 A0C;
    public final C15547Ueb A0D;
    public final Map A0E = new HashMap();

    public C15462UdD(FragmentActivity fragmentActivity, AnonymousClass2kR r14, GenericSurveyFragment genericSurveyFragment) {
        AnonymousClass4DU r9 = r14.A02;
        this.A08 = r9;
        Context context = r14.A00;
        this.A05 = context;
        UserSession userSession = r14.A01;
        this.A06 = userSession;
        VZW vzw = new VZW(context, userSession, r9);
        this.A02 = vzw;
        GTP gtp = new GTP(fragmentActivity, fragmentActivity, r14, true, true);
        this.A07 = gtp;
        C15518Ue7 ue7 = new C15518Ue7(userSession, genericSurveyFragment);
        this.A0C = ue7;
        C15547Ueb ueb = new C15547Ueb(fragmentActivity, userSession, r9, genericSurveyFragment, vzw);
        this.A0D = ueb;
        EAL eal = new EAL(r9, userSession, genericSurveyFragment);
        this.A0A = eal;
        C47589E9b e9b = new C47589E9b(r9);
        this.A0B = e9b;
        C15511Ue0 ue0 = new C15511Ue0(r9);
        this.A09 = ue0;
        A0B(gtp, ue7, ueb, eal, e9b, ue0);
    }

    public static final void A00(C15462UdD udD) {
        1Xj r2;
        C231642s0 r0;
        C231642s0 r02;
        Object obj;
        C42107BHk bHk;
        C15462UdD udD2 = udD;
        udD2.A00 = true;
        AnonymousClass2rV r6 = udD2.A01;
        UserSession userSession = udD2.A06;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator A1G = AnonymousClass7TE.A1G(r6.A02);
        while (A1G.hasNext()) {
            Object next = A1G.next();
            if (AnonymousClass3VN.A00(userSession, (1Xg) next)) {
                arrayList2.add(next);
            } else {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r6.A0C(it.next());
        }
        r6.A01 = Collections.unmodifiableList(arrayList2);
        AnonymousClass2rW.A00(r6);
        udD2.A06();
        List list = udD2.A04;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C17926ViH viH = (C17926ViH) list.get(i);
            int intValue = viH.A08.intValue();
            if (intValue != 0) {
                if (intValue != 2) {
                    if (intValue == 3) {
                        1Xj A002 = viH.A00();
                        if (A002 != null) {
                            udD2.BQr(A002).A0D(i);
                            C17927ViI viI = udD2.A03;
                            viI.A03 = viH.A08;
                            udD2.A09(udD2.A0B, viH.A00(), viI);
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else if (intValue == 4) {
                        r2 = viH.A04;
                        udD2.A03.A03 = AnonymousClass05K.A0Y;
                        r0 = udD2.A09;
                        udD2.A08(r0, r2);
                    } else if (intValue == 1) {
                        r2 = viH.A05;
                        if (r2 == null && (bHk = viH.A01) != null) {
                            r2 = new C17983VjL(bHk);
                            viH.A05 = r2;
                        }
                        Object obj2 = udD2.A03;
                        r02 = udD2.A0C;
                        obj = obj2;
                    }
                } else {
                    AnonymousClass3HX r1 = viH.A07;
                    if (r1 != null) {
                        r2 = 1OP.A05(userSession).A0I(r1, false);
                        C17927ViI viI2 = udD2.A03;
                        viI2.A03 = viH.A08;
                        1Xj r13 = r2.A0A(userSession, 0).A0b;
                        r13.getClass();
                        if (r13.CeS() && !viI2.A07 && udD2.A0D.A01) {
                            VZW vzw = udD2.A02;
                            C263754Nf r03 = new C263754Nf((Object) r13, 0);
                            C14044Tol tol = vzw.A01;
                            r03.A00 = tol.A0E();
                            float A003 = C51971G9r.A00(tol.A0E() ? 1 : 0);
                            String str = r13.A0M;
                            tol.A09(vzw.A00, r13.A2D(), r03, str, "genericsurvey", A003, -1, 0, true, true);
                            viI2.A07 = true;
                        }
                        r02 = udD2.A0D;
                        obj = viI2;
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            } else if (!AnonymousClass7TE.A1b(r6.A01)) {
                continue;
            } else {
                1Xg r12 = viH.A02;
                if (r12 != null) {
                    1Xj A022 = 1Xi.A02(r12.A05);
                    if (A022 != null) {
                        AnonymousClass3W1 BQr = udD2.BQr(A022);
                        BQr.A0D(i);
                        udD2.A03.A03 = viH.A08;
                        boolean A1Y = AnonymousClass7TF.A1Y(r12.A02, true);
                        r2 = 1Xi.A02(r12.A05);
                        if (A1Y) {
                            r0 = udD2.A0A;
                            udD2.A08(r0, r2);
                        } else {
                            r02 = udD2.A07;
                            obj = BQr;
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            udD2.A09(r02, r2, obj);
        }
        udD2.A07();
    }

    public final /* synthetic */ void A8l(Object obj, int i) {
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final AnonymousClass3W1 BQr(1Xj r6) {
        0qQ.A0B(r6, 0);
        Map map = this.A0E;
        String id = r6.getId();
        if (id != null) {
            Object obj = map.get(id);
            AnonymousClass3W1 r2 = obj;
            if (obj == null) {
                AnonymousClass3W1 A18 = G9t.A18(r6);
                int i = -1;
                if (r6.A5D()) {
                    i = 0;
                }
                A18.A0B(i);
                A18.A0O(1sy.A05);
                map.put(id, A18);
                r2 = A18;
            }
            return (AnonymousClass3W1) r2;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void Crn() {
        this.A00 = false;
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final void DbF(C17927ViI viI, int i) {
        if (1 == i) {
            A00(this);
        }
    }

    public final void EU8(AnonymousClass310 r2) {
        0qQ.A0B(r2, 0);
        this.A07.A03(r2);
    }

    public final void EWg(AnonymousClass2xS r2) {
        0qQ.A0B(r2, 0);
        this.A07.A03 = r2;
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onDestroyView() {
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public final /* synthetic */ int BJU(String str) {
        return -1;
    }

    public final /* synthetic */ List CBH() {
        return new ArrayList();
    }

    public final boolean CRD() {
        return this.A00;
    }

    public final /* synthetic */ Object EDl(int i) {
        return null;
    }

    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    public final boolean isEmpty() {
        return this.A04.isEmpty();
    }

    public final void onStop() {
        C14044Tol tol = this.A02.A01;
        if (tol.A0E()) {
            tol.A04(-2);
            A00(this);
        }
    }

    public final void A0C(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            1Xg r3 = ((C17926ViH) it.next()).A02;
            if (r3 != null) {
                AnonymousClass2rV r2 = this.A01;
                AnonymousClass2rW.A01(r2, r3, r2.A02.size(), true);
            }
        }
        this.A03.A08.add(this);
        this.A04.addAll(list);
        A00(this);
    }

    public final void AV9() {
        A00(this);
    }

    public final void Cs9(1Xj r2) {
        0fE.A00(this, -2093862331);
    }

    public final void notifyDataSetChanged() {
        A00(this);
    }
}
