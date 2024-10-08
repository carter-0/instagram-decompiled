package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.8i6  reason: invalid class name and case insensitive filesystem */
public final class C362558i6 extends C232232tF {
    public final AnonymousClass0iw A00;
    public final C361698ge A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View inflate = layoutInflater.inflate(R.layout.gallery_memory_item, viewGroup, false);
        0qQ.A07(inflate);
        return new C380639Yy(inflate);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r7, C249703kE r8) {
        C362608iB r72 = (C362608iB) r7;
        C380639Yy r82 = (C380639Yy) r8;
        0qQ.A0B(r72, 0);
        0qQ.A0B(r82, 1);
        AnonymousClass0iw r4 = this.A00;
        C361698ge r3 = this.A01;
        0qQ.A0B(r4, 2);
        0qQ.A0B(r3, 3);
        AnonymousClass5H8.A02(r82.A02);
        View view = r82.A00;
        view.setEnabled(true);
        view.setVisibility(0);
        r82.A01.post(new C41144Ap4(r4, r82, r72));
        view.setClickable(true);
        AnonymousClass3NG r1 = new AnonymousClass3NG(view);
        r1.A0C = true;
        r1.A07 = true;
        r1.A02 = 0.92f;
        r1.A04 = new AZE(r82, r72, r3);
        r1.A00();
    }

    public final Class modelClass() {
        return C362608iB.class;
    }

    public C362558i6(AnonymousClass0iw r1, C361698ge r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
