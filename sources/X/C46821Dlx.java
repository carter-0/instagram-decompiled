package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.Dlx  reason: case insensitive filesystem */
public final class C46821Dlx extends 2Rw {
    public List A00 = 0sn.A00;
    public final AnonymousClass0iw A01;
    public final String A02;

    public final void onBindViewHolder(C249703kE r5, int i) {
        String str;
        0qQ.A0B(r5, 0);
        Object obj = this.A00.get(i);
        if (GSY.A00(6, obj)) {
            obj = (N49) ((GSY) obj).A01;
        }
        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.creatortools.api.schemas.ThemedImageURL");
        N49 n49 = (N49) obj;
        AnonymousClass0iw r3 = this.A01;
        0qQ.A0B(n49, 0);
        if (AnonymousClass3HA.A00(DbS.A07(r5))) {
            str = n49.A00;
        } else {
            str = n49.A01;
        }
        DbV.A1P(r3, DbX.A0b(r5.itemView, R.id.image), str);
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        boolean A0K = 0qQ.A0K(this.A02, "insights");
        int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        LayoutInflater A0D = DbV.A0D(viewGroup);
        int i3 = R.layout.value_props_monetization_h_scroll_card;
        if (A0K) {
            i3 = R.layout.value_props_insights_h_scroll_card;
        }
        return new C249703kE(DbT.A0D(A0D, viewGroup, i3, false));
    }

    public C46821Dlx(String str, AnonymousClass0iw r3) {
        this.A02 = str;
        this.A01 = r3;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(312805426);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(1979494799, A03);
        return size;
    }
}
