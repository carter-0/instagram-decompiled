package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.CharacterStyle;
import android.view.View;
import android.widget.TextView;
import com.instagram.igds.components.button.IgdsButton;

public final class WAI implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C230202p9 A02;
    public final /* synthetic */ UE4 A03;
    public final /* synthetic */ C57251IUm A04;
    public final /* synthetic */ C17997VjZ A05;
    public final /* synthetic */ Object A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    public WAI(Context context, C230202p9 r2, UE4 ue4, C57251IUm iUm, C17997VjZ vjZ, Object obj, int i, boolean z, boolean z2) {
        this.A03 = ue4;
        this.A05 = vjZ;
        this.A00 = i;
        this.A08 = z;
        this.A01 = context;
        this.A06 = obj;
        this.A04 = iUm;
        this.A02 = r2;
        this.A07 = z2;
    }

    public final void onClick(View view) {
        int i;
        C17997VjZ A012;
        String str;
        Boolean CSq;
        int A052 = AnonymousClass0fD.A05(-1440732857);
        if (W2c.A00) {
            UE4 ue4 = this.A03;
            int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            String str2 = ue4.A01;
            if (str2 == "v2" || str2 == "v3") {
                i = -1780153897;
                AnonymousClass0fD.A0C(i, A052);
            }
        }
        C17997VjZ vjZ = this.A05;
        AnonymousClass0eM r4 = vjZ.A04;
        VSD vsd = (VSD) JTO.A15(r4).get(this.A00);
        vsd.A00 = !vsd.A00;
        C21033XAm xAm = vsd.A01;
        if (xAm.getId() != null) {
            Boolean CSq2 = xAm.CSq();
            if (CSq2 == null || !CSq2.booleanValue()) {
                for (VSD vsd2 : JTO.A15(r4)) {
                    String id = xAm.getId();
                    C21033XAm xAm2 = vsd2.A01;
                    if (!id.equals(xAm2.getId()) && vsd2.A00 && (CSq = xAm2.CSq()) != null && CSq.booleanValue()) {
                        vsd2.A00 = false;
                    }
                }
            } else if (vsd.A00) {
                for (VSD vsd3 : JTO.A15(r4)) {
                    if (!xAm.getId().equals(vsd3.A01.getId())) {
                        vsd3.A00 = false;
                    }
                }
            }
        }
        boolean z = this.A08;
        boolean z2 = true;
        UE4 ue42 = this.A03;
        int i3 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        String str3 = ue42.A01;
        boolean equals = str3.equals("v2");
        if (z) {
            if (equals || str3.equals("v3")) {
                IgdsButton igdsButton = ue42.A06;
                if (!vsd.A00 && !vjZ.A01()) {
                    z2 = false;
                }
                igdsButton.setEnabled(z2);
            } else {
                View A013 = ue42.A03.A01();
                if (!vsd.A00 && !vjZ.A01()) {
                    z2 = false;
                }
                A013.setActivated(z2);
            }
            Context context = this.A01;
            Object obj = this.A06;
            W2c.A02(context, this.A02, ue42, this.A04, vjZ, obj, this.A07);
        } else {
            if (equals || str3.equals("v3")) {
                Context context2 = this.A01;
                Object obj2 = this.A06;
                W2c.A02(context2, this.A02, ue42, this.A04, vjZ, obj2, this.A07);
            }
            C230202p9 r15 = this.A02;
            Object obj3 = this.A06;
            C57251IUm iUm = this.A04;
            r15.DFm(obj3, iUm);
            if (!vjZ.A01 && (obj3 instanceof C17983VjL)) {
                C17983VjL vjL = (C17983VjL) obj3;
                if (iUm.A00 < vjL.A00() - 1) {
                    int A002 = W2c.A00(vjL, vsd, iUm.A00 + 1);
                    if (A002 != iUm.A00) {
                        iUm.A00 = A002;
                        for (C14907UEm uEm : iUm.A03) {
                            C17983VjL vjL2 = uEm.A01;
                            if (!(vjL2 == null || (A012 = vjL2.A01(iUm.A00)) == null || (str = A012.A03.A07) == null)) {
                                TextView textView = uEm.A07;
                                SpannableString spannableString = new SpannableString(str);
                                spannableString.setSpan(new CharacterStyle(), 0, spannableString.length(), 0);
                                textView.setText(spannableString);
                            }
                        }
                    }
                    W2c.A02(this.A01, r15, ue42, iUm, vjL.A01(A002), obj3, this.A07);
                    i = -701079563;
                    AnonymousClass0fD.A0C(i, A052);
                }
            }
            W2c.A00 = true;
            r15.DFo(obj3, iUm);
        }
        i = 141063994;
        AnonymousClass0fD.A0C(i, A052);
    }
}
