package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.ui.base.IgTextView;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public final class NME extends 1P0 {
    public final /* synthetic */ C71084Ob7 A00;

    public NME(C71084Ob7 ob7) {
        this.A00 = ob7;
    }

    public final void onFail(C268654dm r6) {
        Object A002;
        int A03 = AnonymousClass0fD.A03(-931152586);
        Throwable A01 = r6.A01();
        if (A01 != null) {
            A01.getMessage();
        } else if ((r6 instanceof C268674do) && (A002 = r6.A00()) != null) {
            ((AnonymousClass1XT) A002).getErrorMessage();
        }
        C71084Ob7 ob7 = this.A00;
        ob7.A00.A02(303965077);
        ob7.A0D.DE1();
        NKU nku = ob7.A08;
        C14068TpH tpH = ob7.A0B;
        if (tpH == null || C14068TpH.STORY_COMMENTS != tpH) {
            C66580MXl.A1G(nku);
        }
        AnonymousClass0fD.A0A(-1911217962, A03);
    }

    public final void onFinish() {
        AnonymousClass0fD.A0A(1242288525, AnonymousClass0fD.A03(834743181));
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(-1220533332);
        C71038Oa2 oa2 = this.A00.A00;
        synchronized (oa2) {
            if (oa2.A00) {
                02m.A0p.markerPoint(303965077, "network_request_start");
            }
        }
        AnonymousClass0fD.A0A(1701133533, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        IgTextView igTextView;
        int A03 = AnonymousClass0fD.A03(-1985509767);
        NHE nhe = (NHE) obj;
        int A032 = AnonymousClass0fD.A03(1772396484);
        C70710OHf oHf = nhe.A00;
        if (oHf.A03.booleanValue()) {
            C71084Ob7 ob7 = this.A00;
            C71038Oa2 oa2 = ob7.A00;
            synchronized (oa2) {
                String A002 = AnonymousClass000.A00(712);
                if (oa2.A00) {
                    02m.A0p.markerPoint(303965077, A002);
                }
            }
            String str = oHf.A04;
            ob7.A03 = str;
            ob7.A02 = nhe.A01;
            NKU nku = ob7.A08;
            CharSequence A003 = C71084Ob7.A00(ob7, str);
            C331157Pu r1 = nku.A05;
            r1.getClass();
            r1.A0M(oHf.A02.A00);
            if (!(oHf.A00 == null || (igTextView = nku.A04) == null)) {
                igTextView.setVisibility(0);
                nku.A04.setText(oHf.A00.A00());
                DbT.A1H(nku.A04);
            }
            NL4 nl4 = nku.A08;
            String str2 = oHf.A01.A00;
            ImmutableList copyOf = ImmutableList.copyOf((Collection) oHf.A06);
            nl4.A03 = str2;
            nl4.A02 = A003;
            List list = nl4.A04;
            list.clear();
            if (copyOf != null && !copyOf.isEmpty()) {
                list.addAll(copyOf);
            }
            nl4.A01 = null;
            nl4.A00 = null;
            NL4.A00(nl4);
            if (nku.A0X() != null) {
                nku.A0X().post(new C73153PXo(nku));
            }
            HashMap hashMap = oHf.A05;
            if (hashMap != null) {
                ob7.A0D.FLN(hashMap);
            }
        } else {
            C71084Ob7 ob72 = this.A00;
            C71038Oa2 oa22 = ob72.A00;
            oa22.A02(303965077);
            oa22.A05(97);
            ob72.A0D.DE1();
            NKU nku2 = ob72.A08;
            C14068TpH tpH = ob72.A0B;
            if (tpH == null || C14068TpH.STORY_COMMENTS != tpH) {
                C66580MXl.A1G(nku2);
            }
        }
        AnonymousClass0fD.A0A(-1226981264, A032);
        AnonymousClass0fD.A0A(420279273, A03);
    }
}
