package X;

import android.view.ViewGroup;
import com.instagram.android.R;
import instagram.features.stories.fragment.ReelMoreOptionsFragment;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Jku  reason: case insensitive filesystem */
public final class C60401Jku extends 2Rw {
    public int A00;
    public List A01 = Collections.emptyList();
    public final L2K A02;
    public final ReelMoreOptionsFragment A03;

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r5, int i) {
        C60645Jos jos = (C60645Jos) r5;
        L3R l3r = (L3R) this.A01.get(i);
        boolean A1S = AnonymousClass7TF.A1S(i, this.A00);
        jos.A00 = l3r;
        jos.A02.A02(l3r.A00.A00, (String) null);
        jos.A01.setSelected(A1S);
    }

    public C60401Jku(ReelMoreOptionsFragment reelMoreOptionsFragment, String str) {
        this.A00 = 0;
        this.A02 = new L2K(this);
        this.A03 = reelMoreOptionsFragment;
        if (str != null) {
            for (int i = 0; i < this.A01.size(); i++) {
                if (((L3R) this.A01.get(i)).A01.equals(str)) {
                    this.A00 = i;
                    return;
                }
            }
        }
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-1160683475);
        int size = this.A01.size();
        AnonymousClass0fD.A0A(368397771, A032);
        return size;
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C60645Jos(DbT.A0C(JTP.A0G(viewGroup), viewGroup, R.layout.ar_effect_option_layout), this.A02);
    }
}
