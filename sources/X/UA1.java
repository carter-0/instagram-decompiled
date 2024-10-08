package X;

import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.leadgen.core.api.LeadForm;
import java.util.List;

public final class UA1 extends 2Rw {
    public int A00;
    public final FragmentActivity A01;
    public final WYX A02;
    public final WGU A03;
    public final PromoteData A04;
    public final Long A05;
    public final List A06;

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r7, int i) {
        C14825UBe uBe = (C14825UBe) r7;
        0qQ.A0B(uBe, 0);
        U5O u5o = uBe.A00;
        List list = this.A06;
        u5o.setPrimaryText((CharSequence) ((LeadForm) list.get(i)).A02);
        FragmentActivity fragmentActivity = this.A01;
        u5o.setSecondaryText(C18376Vqc.A00(fragmentActivity, (LeadForm) list.get(i)));
        u5o.setTag(((LeadForm) list.get(i)).A03);
        u5o.setActionLabel(AnonymousClass7TE.A16(fragmentActivity, 2131970404), this.A04.A0y, new WBH(25, (Object) uBe, (Object) this));
        WB1.A00(u5o, this, i, 0);
        u5o.setChecked(AnonymousClass7TF.A1S(this.A00, i));
        u5o.A03(false);
        u5o.A04(false);
    }

    public UA1(FragmentActivity fragmentActivity, WYX wyx, WGU wgu, PromoteData promoteData, Long l, List list) {
        String str;
        this.A06 = list;
        this.A04 = promoteData;
        this.A03 = wgu;
        this.A02 = wyx;
        this.A05 = l;
        this.A01 = fragmentActivity;
        LeadForm leadForm = promoteData.A16;
        if (leadForm != null) {
            str = leadForm.A03;
        } else {
            str = null;
        }
        this.A00 = !0qQ.A0K(str, ((LeadForm) list.get(0)).A03) ? -1 : 0;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(462626984);
        int size = this.A06.size();
        AnonymousClass0fD.A0A(-2041533499, A032);
        return size;
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C14825UBe(new U5O(Pxj.A0E(viewGroup)));
    }
}
