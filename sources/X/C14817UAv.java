package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.UAv  reason: case insensitive filesystem */
public final class C14817UAv extends C249403jg {
    public final /* synthetic */ AnonymousClass3UH A00;
    public final /* synthetic */ AnonymousClass2sG A01;

    public C14817UAv(AnonymousClass3UH r1, AnonymousClass2sG r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        List A04;
        int A03 = AnonymousClass0fD.A03(213693050);
        C252553pI r0 = recyclerView.A0D;
        r0.getClass();
        int A1c = ((LinearLayoutManager) r0).A1c();
        if (!(A1c == -1 || (A04 = this.A00.A04()) == null)) {
            AnonymousClass2sG r6 = this.A01;
            if (A1c >= 0) {
                int i2 = A1c + 1;
                int min = Math.min(i2 + 2, A04.size());
                while (i2 < min) {
                    C17674Vc5 vc5 = (C17674Vc5) A04.get(i2);
                    if (r6.A02.add(vc5.A04)) {
                        Iterator it = vc5.A07.iterator();
                        while (it.hasNext()) {
                            1Xj A0t = C51966G9m.A0t(it);
                            1NK A002 = 1NK.A00();
                            ExtendedImageUrl A1n = A0t.A1n(r6.A00);
                            17k.A07(A1n, "Will crash when calling `queue()`");
                            1OO A0J = A002.A0J(A1n, r6.A01.getModuleName());
                            A0J.A0I = true;
                            A0J.A09 = A0t.BTL();
                            A0J.A01();
                        }
                    }
                    i2++;
                }
            }
        }
        AnonymousClass0fD.A0A(-1579179315, A03);
    }
}
