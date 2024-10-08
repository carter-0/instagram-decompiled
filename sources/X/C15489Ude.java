package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ude  reason: case insensitive filesystem */
public final class C15489Ude extends 2Ru implements C231272rL, C231322rQ {
    public boolean A00;
    public final GTP A01;
    public final C273674n0 A02 = new C273674n0((C324266yu) null, AnonymousClass32Q.A00, AnonymousClass05K.A00);
    public final C15531UeK A03;
    public final Context A04;
    public final UserSession A05;
    public final AnonymousClass4DU A06;
    public final C229122ms A07;
    public final C231762sK A08;
    public final Map A09 = new HashMap();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15489Ude(FragmentActivity fragmentActivity, AnonymousClass2kR r14, XCB xcb, C229122ms r16) {
        super(false);
        C229122ms r1 = r16;
        AnonymousClass7TG.A1Q(r14, r1);
        this.A07 = r1;
        Context context = r14.A00;
        this.A04 = context;
        UserSession userSession = r14.A01;
        this.A05 = userSession;
        AnonymousClass4DU r0 = r14.A02;
        this.A06 = r0;
        GTP gtp = new GTP(fragmentActivity, fragmentActivity, r14, true, true);
        this.A01 = gtp;
        C15531UeK ueK = new C15531UeK(r0, userSession, xcb);
        this.A03 = ueK;
        C231762sK r4 = new C231762sK(context);
        this.A08 = r4;
        init(new C231642s0[]{r4, gtp, ueK});
    }

    public final void A00() {
        this.A00 = true;
        clear();
        C273674n0 r6 = this.A02;
        r6.A06();
        if (!isEmpty()) {
            r6.A01 = false;
            int A022 = r6.A02();
            for (int i = 0; i < A022; i++) {
                1Xj r3 = (1Xj) r6.A01.get(i);
                AnonymousClass3W1 BQr = BQr(r3);
                BQr.A0D(i);
                addModel(r3, BQr, this.A01);
                C46292DTv A032 = C254423sS.A03(r3);
                if (A032 != null) {
                    addModel(new 0eP(r3, A032), C60340gF.A00, this.A03);
                }
            }
        }
        C229122ms r1 = this.A07;
        if (r1.CKB() || r1.CT5() || r1.isLoading()) {
            addModel(r1, this.A08);
        }
        notifyDataSetChanged();
    }

    public final /* synthetic */ void A8l(Object obj, int i) {
    }

    public final AnonymousClass3W1 BQr(1Xj r4) {
        0qQ.A0B(r4, 0);
        Map map = this.A09;
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
        this.A01.A03(r2);
    }

    public final void EWg(AnonymousClass2xS r2) {
        0qQ.A0B(r2, 0);
        this.A01.A03 = r2;
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
        if (this.A02.A02() == 0) {
            return true;
        }
        return false;
    }

    public final void AV9() {
        A00();
    }

    public final void Cs9(1Xj r1) {
        A00();
    }
}
