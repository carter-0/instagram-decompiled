package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;

/* renamed from: X.7vg  reason: invalid class name and case insensitive filesystem */
public final class C346747vg {
    public final AnonymousClass4DH A00;
    public final C346767vi A01;
    public final AnonymousClass0eM A02 = AnonymousClass1YB.A00(new AnonymousClass9LJ(this, 7));
    public final AnonymousClass0eM A03 = AnonymousClass1YB.A00(new AnonymousClass9LJ(this, 8));
    public final AnonymousClass0eM A04 = AnonymousClass1YB.A00(new AnonymousClass9LJ(this, 9));
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;

    public C346747vg(Context context, View view, AnonymousClass4DH r10, UserSession userSession, C357638Yz r12, C346597vR r13) {
        0qQ.A0B(view, 5);
        this.A00 = r10;
        C346757vh r5 = C346757vh.A00;
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new AnonymousClass9LJ(new AnonymousClass9LJ(r10, 4), 5));
        this.A05 = new C227862kA(new AnonymousClass9LJ(A002, 6), r5, new C377429Lu(15, (Object) null, A002), new 0Yh(AnonymousClass8Ce.class));
        this.A06 = AnonymousClass1YB.A00(new AnonymousClass9LJ(view, 10));
        C346767vi r2 = new C346767vi(context, userSession, r12, r13);
        this.A01 = r2;
        Object value = this.A02.getValue();
        0qQ.A07(value);
        ((RecyclerView) value).setLayoutManager(new LinearLayoutManager(context));
        Object value2 = this.A02.getValue();
        0qQ.A07(value2);
        ((RecyclerView) value2).setAdapter(r2);
        Object value3 = this.A03.getValue();
        0qQ.A07(value3);
        ((View) value3).setOnClickListener((View.OnClickListener) null);
        Fragment fragment = this.A00;
        if (!fragment.mDetached && fragment.isAdded()) {
            C71772f0.A00(fragment.getLifecycle()).A00(new C376959Jz(this, (AnonymousClass4D7) null, 31));
            C71772f0.A00(fragment.getLifecycle()).A00(new C376889Js(this, (AnonymousClass4D7) null, 40));
        }
    }

    public final void A00() {
        AnonymousClass4DH r1 = this.A00;
        if (!r1.mDetached && r1.isAdded()) {
            ((AnonymousClass8Ce) this.A05.getValue()).A03.Epw(false);
        }
    }
}
