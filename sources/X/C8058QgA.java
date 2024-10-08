package X;

import com.facebookpay.form.cell.logging.FormCellLoggingEvents;
import com.facebookpay.form.view.FormLayout;
import com.facebookpay.logging.LoggingContext;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.QgA  reason: case insensitive filesystem */
public abstract class C8058QgA extends RQL {
    public List A00 = 0sn.A00;

    /* JADX WARNING: type inference failed for: r1v6, types: [X.Qg9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v10, types: [X.Qg7, X.QgA] */
    /* JADX WARNING: type inference failed for: r1v13, types: [X.Qg6, X.QgA] */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r1 != null) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(android.view.View r5, java.util.List r6) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof X.C8067QgJ
            if (r0 == 0) goto L_0x0043
            r2 = r5
            X.QgJ r2 = (X.C8067QgJ) r2
            X.5tU r1 = r2.A00
            boolean r0 = r1 instanceof X.C8044Qfo
            if (r0 == 0) goto L_0x002d
            boolean r0 = r4 instanceof X.C8056Qg8
            if (r0 == 0) goto L_0x0041
            X.Qg6 r1 = new X.Qg6
            r1.<init>()
            java.util.Map r0 = X.C8056Qg8.A02
            r1.A00 = r2
            r1.A01 = r0
        L_0x001c:
            r1.A03(r2)
        L_0x001f:
            X.5tU r0 = r2.A00
            if (r1 == 0) goto L_0x00be
        L_0x0023:
            if (r0 == 0) goto L_0x00be
            X.0eP r0 = X.AnonymousClass7TE.A1L(r1, r0)
            r6.add(r0)
        L_0x002c:
            return
        L_0x002d:
            boolean r0 = r1 instanceof X.C8043Qfn
            if (r0 == 0) goto L_0x0043
            boolean r0 = r4 instanceof X.C8056Qg8
            if (r0 == 0) goto L_0x0041
            X.Qg7 r1 = new X.Qg7
            r1.<init>()
            java.util.List r0 = X.C8056Qg8.A01
            r1.A00 = r2
            r1.A01 = r0
            goto L_0x001c
        L_0x0041:
            r1 = 0
            goto L_0x001f
        L_0x0043:
            boolean r0 = r5 instanceof X.C8066QgI
            if (r0 == 0) goto L_0x00be
            r2 = r5
            X.QgI r2 = (X.C8066QgI) r2
            r3 = r4
            boolean r0 = r4 instanceof X.C8056Qg8
            if (r0 == 0) goto L_0x0065
            r0 = 0
            X.0qQ.A0B(r2, r0)
        L_0x0053:
            X.Qg9 r1 = new X.Qg9
            r1.<init>()
            r1.A00 = r2
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A01 = r0
            X.Qfl r0 = r2.getViewModel()
            goto L_0x0023
        L_0x0065:
            boolean r0 = r4 instanceof X.C8055Qg7
            if (r0 == 0) goto L_0x007d
            X.Qg7 r3 = (X.C8055Qg7) r3
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.util.List r1 = r3.A01
            if (r1 != 0) goto L_0x00a0
            java.lang.String r0 = "autoFocusFields"
        L_0x0075:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x007d:
            X.Qg6 r3 = (X.C8054Qg6) r3
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.QgJ r0 = r3.A00
            if (r0 != 0) goto L_0x008b
            java.lang.String r0 = "view"
            goto L_0x0075
        L_0x008b:
            X.5tU r1 = r0.A00
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.form.cell.address.AddressCellViewModel"
            X.0qQ.A0C(r1, r0)
            X.Qfo r1 = (X.C8044Qfo) r1
            com.facebook.common.locale.Country r1 = r1.A0P()
            java.util.Map r0 = r3.A01
            if (r0 != 0) goto L_0x00ab
            java.lang.String r0 = "autoFocusFieldsByCountry"
            goto L_0x0075
        L_0x00a0:
            X.Qfl r0 = r2.getViewModel()
            int r0 = r0.A02
            boolean r0 = X.C66581MXm.A1W(r0, r1)
            goto L_0x0053
        L_0x00ab:
            java.util.List r1 = X.C66580MXl.A13(r1, r0)
            if (r1 == 0) goto L_0x00bc
            X.Qfl r0 = r2.getViewModel()
            int r0 = r0.A02
            boolean r0 = X.C66581MXm.A1W(r0, r1)
            goto L_0x0053
        L_0x00bc:
            r0 = 0
            goto L_0x0053
        L_0x00be:
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x002c
            r2 = 0
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            int r1 = r5.getChildCount()
        L_0x00c9:
            if (r2 >= r1) goto L_0x002c
            android.view.View r0 = r5.getChildAt(r2)
            r4.A00(r0, r6)
            int r2 = r2 + 1
            goto L_0x00c9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8058QgA.A00(android.view.View, java.util.List):void");
    }

    public static final void A01(C8058QgA qgA, FormLayout formLayout) {
        C8066QgI qgI;
        for (0eP r0 : qgA.A00) {
            RQL rql = (RQL) r0.A00;
            if (rql instanceof C8057Qg9) {
                C8057Qg9 qg9 = (C8057Qg9) rql;
                qg9.A02 = null;
                DbX.A1a(qg9.A01);
            } else {
                rql.A00 = null;
            }
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        qgA.A00(formLayout, A1C);
        List A0a = 00k.A0a(A1C);
        qgA.A00 = A0a;
        int size = A0a.size();
        for (int i = 0; i < size; i++) {
            RQL rql2 = (RQL) ((0eP) qgA.A00.get(i)).A00;
            C58735Iwi iwi = new C58735Iwi(i, 5, qgA);
            if (rql2 instanceof C8057Qg9) {
                C8057Qg9 qg92 = (C8057Qg9) rql2;
                qg92.A02 = iwi;
                if (DbX.A1a(qg92.A01) && (qgI = qg92.A00) != null) {
                    qgI.getViewModel().A01 = iwi;
                }
            } else {
                rql2.A00 = iwi;
            }
        }
    }

    public static final void A02(C8058QgA qgA, String str, int i) {
        C11231SGq sGq;
        String str2 = str;
        if (i < qgA.A00.size()) {
            0eP r0 = (0eP) qgA.A00.get(i);
            RQL rql = (RQL) r0.A00;
            if (!((SRc) r0.A01).A0J()) {
                return;
            }
            if (rql instanceof C8057Qg9) {
                C8066QgI qgI = ((C8057Qg9) rql).A00;
                if (qgI != null) {
                    C8041Qfl viewModel = qgI.getViewModel();
                    JTP.A1B(viewModel.A0A, true);
                    FormCellLoggingEvents formCellLoggingEvents = viewModel.A01;
                    if (formCellLoggingEvents != null && (sGq = viewModel.A00) != null) {
                        String str3 = formCellLoggingEvents.A00.A03;
                        C12411Sto A0g = C51965G9l.A0g();
                        LoggingContext loggingContext = sGq.A00;
                        LinkedHashMap A08 = SUU.A08(sGq.A01);
                        0qQ.A0B(loggingContext, 0);
                        C12411Sto.A03(C51965G9l.A0U(C51969G9p.A0d(A0g.A00, "client_focus_autoadvance_atomic"), 41), loggingContext, new C74192PqY((Object) loggingContext, (Object) A08, str2, str3, 5));
                        return;
                    }
                    return;
                }
                return;
            }
            A02((C8058QgA) rql, str, 0);
            return;
        }
        0sP r02 = qgA.A00;
        if (r02 != null) {
            r02.invoke(str);
        }
    }

    public final void A03(FormLayout formLayout) {
        formLayout.setOnRebuild(new C13349TVw(35, formLayout, this));
        A01(this, formLayout);
    }
}
