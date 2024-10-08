package X;

import android.util.SparseArray;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: X.IIu  reason: case insensitive filesystem */
public final class C56950IIu implements C307426Qb {
    public final C307786Rm A00;
    public final AnonymousClass6S3 A01;
    public final SGl A02;
    public final Map A03;

    public C56950IIu(C307786Rm r2, AnonymousClass6S3 r3, SGl sGl, Map map) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = map;
        this.A02 = sGl;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass6SH EIW(AnonymousClass2TS r18, AnonymousClass6S4 r19, Object obj, List list) {
        S53 s53;
        0eP r5;
        ArrayList A1C;
        SparseArray sparseArray;
        C276694tk r3 = (C276694tk) obj;
        AnonymousClass6S4 r4 = r19;
        0qQ.A0B(r4, 0);
        Map map = this.A03;
        AnonymousClass6S3 r2 = this.A01;
        C307456Qe A06 = r2.A00.A06(map);
        C307786Rm r1 = this.A00;
        C276744tp A05 = C307476Qg.A05(r1);
        C307766Rj r9 = (C307766Rj) r1.A00(R.id.bk_context_key_scoped_client_id_mapper);
        0qQ.A07(r9);
        C229652no AgJ = r1.A02.AgE().AgJ();
        0qQ.A07(AgJ);
        String A07 = C307476Qg.A07(r1);
        S4e s4e = new S4e(this.A02);
        C17981VjJ vjJ = null;
        if (r3 != null) {
            s53 = r3.A01;
        } else {
            s53 = null;
        }
        S53 s532 = new S53(A06, r9, AgJ, s53, s4e, A05, A07);
        if (r3 != null) {
            r5 = r3.A02.A00();
            Collection collection = (Collection) r5.A01;
            if (collection != null) {
                A1C = AnonymousClass7TE.A1D(collection);
            }
            A1C = AnonymousClass7TE.A1C();
        } else {
            r5 = null;
            A1C = AnonymousClass7TE.A1C();
        }
        List list2 = list;
        A1C.addAll(list2);
        if (r5 != null) {
            sparseArray = (SparseArray) r5.A00;
        } else {
            sparseArray = null;
        }
        C10992S4m s4m = new C10992S4m(sparseArray, r4, A1C);
        if (r3 != null) {
            vjJ = r3.A03;
        }
        C17981VjJ vjJ2 = new C17981VjJ();
        C307436Qc r12 = C307436Qc.A00;
        0qQ.A08(r12);
        C276694tk r11 = new C276694tk(r12, s532, s4m, vjJ, vjJ2);
        C276544tV r0 = r2.A01;
        0qQ.A06(r0);
        return new AnonymousClass6SH(new WJt(r0, r11), r11, list2);
    }
}
