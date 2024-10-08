package X;

import android.content.Context;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.F2c  reason: case insensitive filesystem */
public final class C49692F2c {
    public final Context A00;
    public final 0lg A01;
    public final C51931G7z A02;
    public final C62320sa A03;
    public final 0sP A04;

    public final void A00() {
        String str = (String) this.A03.invoke();
        if (DbV.A12(str).length() != 0) {
            1OC A002 = C318486p2.A00(this.A00, this.A01, str);
            A002.A00 = new ECS(this, str);
            this.A04.invoke(A002);
        }
    }

    public C49692F2c(Context context, AnonymousClass07i r5, 0lg r6, C51931G7z g7z, SearchEditText searchEditText) {
        AnonymousClass7TG.A1U(searchEditText, r6, context);
        C41562AwU awU = new C41562AwU(searchEditText, 21);
        MPB mpb = new MPB(38, (Object) context, (Object) r5);
        this.A03 = awU;
        this.A01 = r6;
        this.A00 = context;
        this.A04 = mpb;
        this.A02 = g7z;
    }
}
