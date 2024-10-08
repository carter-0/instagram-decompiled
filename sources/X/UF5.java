package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public class UF5 extends C14284TtI {
    public int A00 = 0;
    public int A01;
    public ArrayList A02 = new ArrayList();
    public boolean A03 = true;
    public boolean A04 = false;

    public final /* bridge */ /* synthetic */ C14284TtI A08(View view) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A02;
            if (i < arrayList.size()) {
                ((C14284TtI) arrayList.get(i)).A08(view);
                i++;
            } else {
                super.A08(view);
                return this;
            }
        }
    }

    public final /* bridge */ /* synthetic */ C14284TtI A09(View view) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A02;
            if (i < arrayList.size()) {
                ((C14284TtI) arrayList.get(i)).A09(view);
                i++;
            } else {
                super.A09(view);
                return this;
            }
        }
    }

    public final void A0d(long j) {
        ArrayList arrayList;
        this.A01 = j;
        if (j >= 0 && (arrayList = this.A02) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C14284TtI) this.A02.get(i)).A0L(j);
            }
        }
    }

    public final void A0e(C14284TtI ttI) {
        this.A02.add(ttI);
        ttI.A0A = this;
        long j = this.A01;
        if (j >= 0) {
            ttI.A0L(j);
        }
        if ((this.A00 & 1) != 0) {
            ttI.A0N(this.A05);
        }
        if ((this.A00 & 2) != 0) {
            ttI.A0I();
        }
        if ((this.A00 & 4) != 0) {
            ttI.A0U(this.A06);
        }
        if ((this.A00 & 8) != 0) {
            ttI.A0V(this.A07);
        }
    }

    public final C14284TtI A06() {
        UF5 uf5 = (UF5) super.clone();
        uf5.A02 = new ArrayList();
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            C14284TtI A06 = ((C14284TtI) this.A02.get(i)).clone();
            uf5.A02.add(A06);
            A06.A0A = uf5;
        }
        return uf5;
    }

    public final String A0E(String str) {
        String A0E = super.A0E(str);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A02;
            if (i >= arrayList.size()) {
                return A0E;
            }
            A0E = 002.A0g(A0E, "\n", ((C14284TtI) arrayList.get(i)).A0E(002.A0R(str, "  ")));
            i++;
        }
    }

    public final void A0F() {
        super.A0F();
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            ((C14284TtI) this.A02.get(i)).A0F();
        }
    }

    public final void A0O(View view) {
        super.A0O(view);
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            ((C14284TtI) this.A02.get(i)).A0O(view);
        }
    }

    public final void A0P(View view) {
        super.A0P(view);
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            ((C14284TtI) this.A02.get(i)).A0P(view);
        }
    }

    public final void A0Q(ViewGroup viewGroup) {
        super.A0Q(viewGroup);
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            ((C14284TtI) this.A02.get(i)).A0Q(viewGroup);
        }
    }

    public final void A0U(C16763V4w v4w) {
        super.A0U(v4w);
        this.A00 |= 4;
        if (this.A02 != null) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.A02;
                if (i < arrayList.size()) {
                    ((C14284TtI) arrayList.get(i)).A0U(v4w);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ C14284TtI A0A(C20991X8n x8n) {
        super.A0A(x8n);
        return this;
    }

    public final /* bridge */ /* synthetic */ C14284TtI A0B(C20991X8n x8n) {
        super.A0B(x8n);
        return this;
    }
}
