package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.leadgen.core.api.LeadForm;
import java.util.ArrayList;

/* renamed from: X.U9q  reason: case insensitive filesystem */
public final class C14796U9q extends 2Rw {
    public final View.OnClickListener A00;
    public final C14778U8o A01;

    public C14796U9q(View.OnClickListener onClickListener, C14778U8o u8o) {
        0qQ.A0B(u8o, 1);
        this.A01 = u8o;
        this.A00 = onClickListener;
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r7, int i) {
        String str;
        String str2;
        C14845UBz uBz = (C14845UBz) r7;
        0qQ.A0B(uBz, 0);
        U5O u5o = uBz.A00;
        if (u5o != null) {
            C14778U8o u8o = this.A01;
            ArrayList arrayList = u8o.A0D;
            LeadForm leadForm = (LeadForm) 00k.A0O(arrayList, i);
            if (!(leadForm == null || (str2 = leadForm.A02) == null)) {
                u5o.setPrimaryText((CharSequence) str2);
            }
            u5o.setActionLabel(AnonymousClass7TE.A16(DbS.A07(uBz), 2131964712), u8o.A08, this.A00);
            WB1.A00(u5o, this, i, 5);
            LeadForm leadForm2 = u8o.A01;
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
        int A03 = AnonymousClass0fD.A03(846468024);
        int size = this.A01.A0D.size();
        AnonymousClass0fD.A0A(-162454882, A03);
        return size;
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C14845UBz(new U5O(Pxj.A0E(viewGroup)));
    }
}
