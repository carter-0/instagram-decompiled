package X;

import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;

/* renamed from: X.NLo  reason: case insensitive filesystem */
public final class C68517NLo extends 1P0 {
    public final /* synthetic */ AnonymousClass2Ep A00;
    public final /* synthetic */ 2Dm A01;

    public C68517NLo(AnonymousClass2Ep r1, 2Dm r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [X.4ou, java.lang.Object] */
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(1031079623);
        NGq nGq = (NGq) obj;
        int A0D = AnonymousClass7TG.A0D(nGq, 1139666772);
        C68517NLo.super.onSuccess(nGq);
        2Dr r9 = this.A01;
        AnonymousClass2Ep r11 = this.A00;
        ArrayList A1C = AnonymousClass7TE.A1C();
        N2O n2o = nGq.A00;
        if (n2o == null) {
            C41845B3m.A0v();
            throw AnonymousClass00P.createAndThrow();
        }
        for (C74531PwQ pwQ : n2o.A00) {
            N5J n5j = (N5J) pwQ;
            String str = n5j.A03;
            if (str == null) {
                str = "";
            }
            String str2 = n5j.A02;
            Boolean bool = n5j.A00;
            String str3 = n5j.A01;
            ? obj2 = new Object();
            obj2.A05 = str;
            obj2.A03 = str2;
            obj2.A00 = bool;
            obj2.A06 = null;
            obj2.A04 = null;
            obj2.A02 = str3;
            obj2.A01 = null;
            A1C.add(obj2);
        }
        DirectThreadKey BJy = r11.BJy();
        2Dr r92 = r9;
        AnonymousClass48S A0P = r92.A0P(BJy);
        if (A0P != null) {
            AnonymousClass3U9 r0 = A0P.A0I;
            0qQ.A07(r0);
            r0.A0G(A1C);
            r92.FLo(BJy);
        }
        AnonymousClass0fD.A0A(2038954933, A0D);
        AnonymousClass0fD.A0A(1480901615, A03);
    }
}
