package X;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

public final class WWD implements X9P {
    public float A00;
    public float A01;
    public RecyclerView A02;
    public C61078JwG A03;
    public Parcelable A04;
    public ViewGroup A05;
    public final FragmentActivity A06;
    public final AnonymousClass4DJ A07;
    public final X44 A08;
    public final UA6 A09;
    public final C17267VOu A0A;
    public final Context A0B;
    public final 2el A0C;

    public final void onDestroyView() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void AJ9(C227762js r3, C231302rO r4, C238133Ar r5) {
        this.A01 = (float) C14396TvP.A00(this.A05, r3, r4, r5, 0);
    }

    public final void AJA(C227762js r4, X46 x46) {
        x46.DIt(this.A00);
        float A002 = (float) AnonymousClass3D4.A00(this.A0B);
        r4.A04(DbT.A0K(this.A06).A0P, new C19153WNl(this, x46), A002);
    }

    public final void EKZ() {
        RecyclerView recyclerView = this.A02;
        0qQ.A0B(recyclerView, 0);
        recyclerView.A0p(0);
    }

    public final void configureActionBar(2da r5) {
        r5.setTitle("");
        UA6 ua6 = this.A09;
        int itemCount = ua6.getItemCount();
        RecyclerView recyclerView = this.A02;
        if (itemCount > 0) {
            recyclerView.setVisibility(0);
            this.A02.setAdapter(ua6);
            if (this.A05.getParent() == null) {
                r5.A7r(this.A05);
                return;
            }
            return;
        }
        recyclerView.setVisibility(8);
    }

    public final void onPause() {
        C252553pI r0 = this.A02.A0D;
        r0.getClass();
        this.A04 = r0.A1M();
    }

    public final void onResume() {
        Parcelable parcelable = this.A04;
        if (parcelable != null) {
            C252553pI r0 = this.A02.A0D;
            r0.getClass();
            r0.A1P(parcelable);
        }
    }

    public WWD(Context context, FragmentActivity fragmentActivity, AnonymousClass4DJ r6, X44 x44, C17267VOu vOu) {
        this.A0B = context;
        this.A06 = fragmentActivity;
        this.A07 = r6;
        this.A0A = vOu;
        this.A08 = x44;
        2el A0U = DbY.A0U();
        this.A0C = A0U;
        this.A09 = new UA6(new WWB(this), new VS7(A0U, x44));
    }

    public final String ArD() {
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.4DQ, X.4DJ] */
    public final void D6y(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) DbT.A0C(layoutInflater, viewGroup, R.layout.refinement_ribbon);
        this.A05 = viewGroup2;
        RecyclerView A0I = DbT.A0I(viewGroup2, R.id.destination_hscroll);
        this.A02 = A0I;
        C14396TvP.A01(A0I);
        this.A0C.A06(this.A02, AnonymousClass3DZ.A00(this.A07));
    }
}
