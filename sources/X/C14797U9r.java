package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.leadgen.core.api.LeadForm;
import java.util.ArrayList;

/* renamed from: X.U9r  reason: case insensitive filesystem */
public final class C14797U9r extends 2Rw {
    public final View.OnClickListener A00;
    public final C14779U8p A01;

    public C14797U9r(View.OnClickListener onClickListener, C14779U8p u8p) {
        0qQ.A0B(u8p, 1);
        this.A01 = u8p;
        this.A00 = onClickListener;
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r7, int i) {
        String str;
        String str2;
        UC0 uc0 = (UC0) r7;
        0qQ.A0B(uc0, 0);
        U5O u5o = uc0.A00;
        if (u5o != null) {
            C14779U8p u8p = this.A01;
            ArrayList arrayList = u8p.A0D;
            LeadForm leadForm = (LeadForm) 00k.A0O(arrayList, i);
            if (!(leadForm == null || (str2 = leadForm.A02) == null)) {
                u5o.setPrimaryText((CharSequence) str2);
            }
            u5o.setActionLabel(AnonymousClass7TE.A16(DbS.A07(uc0), 2131964712), u8p.A07, this.A00);
            WB1.A00(u5o, this, i, 7);
            LeadForm leadForm2 = u8p.A01;
            String str3 = null;
            if (leadForm2 != null) {
                str = leadForm2.A03;
            } else {
                str = null;
            }
            LeadForm leadForm3 = (LeadForm) 00k.A0O(arrayList, i);
            if (leadForm3 != null) {
                str3 = leadForm3.A03;
            }
            u5o.setChecked(0qQ.A0K(str, str3));
            u5o.A03(u5o.isChecked());
        }
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(790372058);
        int size = this.A01.A0D.size();
        AnonymousClass0fD.A0A(-2001603770, A03);
        return size;
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new UC0(new U5O(Pxj.A0E(viewGroup)));
    }
}
