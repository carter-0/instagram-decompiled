package X;

import android.content.Context;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import java.text.SimpleDateFormat;

/* renamed from: X.WXx  reason: case insensitive filesystem */
public final class C19404WXx implements X4E {
    public final /* synthetic */ LeadGenFormBaseQuestion A00;
    public final /* synthetic */ C14746U6n A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public C19404WXx(LeadGenFormBaseQuestion leadGenFormBaseQuestion, C14746U6n u6n, boolean z, boolean z2) {
        this.A01 = u6n;
        this.A00 = leadGenFormBaseQuestion;
        this.A03 = z;
        this.A02 = z2;
    }

    public final C17355VSi getState(C17355VSi vSi, CharSequence charSequence, boolean z) {
        String str;
        AnonymousClass7TF.A1H(vSi, charSequence);
        C14746U6n u6n = this.A01;
        if (!u6n.A07 && z) {
            String A0D = u6n.A0D(charSequence.toString());
            if (!0qQ.A0K(u6n.A03, A0D) && A0D.length() > 0) {
                LeadGenFormBaseQuestion leadGenFormBaseQuestion = this.A00;
                X4J x4j = u6n.A02;
                if (x4j != null) {
                    x4j.DwH(leadGenFormBaseQuestion);
                }
            }
            u6n.setLastKnownInput(A0D);
        }
        if (u6n.A04 && this.A00.A0I) {
            if (!00l.A0W(charSequence)) {
                if (!z) {
                    str = "removable";
                    vSi.A01 = str;
                }
            }
            return vSi;
        }
        if (this.A03 && !z) {
            return vSi;
        }
        C18532Vtk vtk = C18532Vtk.A00;
        LeadGenFormBaseQuestion leadGenFormBaseQuestion2 = this.A00;
        if (!vtk.A00((Context) null, leadGenFormBaseQuestion2, 0sn.A00, this.A02, false)) {
            vSi.A01 = "error";
            SimpleDateFormat simpleDateFormat = W33.A04;
            vSi.A00 = W33.A03(AnonymousClass7TE.A0S(u6n), leadGenFormBaseQuestion2.A03, leadGenFormBaseQuestion2.A05);
            return vSi;
        }
        if (00l.A0B(charSequence).length() > 0) {
            str = "confirmed";
            vSi.A01 = str;
        }
        return vSi;
    }
}
