package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Wan  reason: case insensitive filesystem */
public final class C19501Wan implements XAT {
    public int A00;
    public int A01;
    public int A02;
    public boolean A03;
    public boolean A04;
    public C14809UAf A05;
    public List A06 = new ArrayList();
    public boolean A07;
    public final int A08;
    public final int A09;
    public final Context A0A;
    public final View.OnTouchListener A0B = new WC3(this, 10);
    public final View A0C;
    public final LinearLayoutManager A0D;
    public final RecyclerView A0E;
    public final C357928a5 A0F;
    public final int A0G;
    public final int A0H;
    public final C249403jg A0I = new UB1(this, 12);
    public final AnonymousClass2hV A0J = C71809OrB.A00;
    public final C67805Mv9 A0K;
    public final C14665U0l A0L;
    public final C14678U0z A0M;

    public C19501Wan(View view, C357948a7 r7, boolean z) {
        0qQ.A0B(r7, 2);
        Context context = view.getContext();
        this.A0A = context;
        Resources resources = context.getResources();
        View A0G2 = AnonymousClass7TF.A0G(view, R.id.scrubber);
        if (z) {
            ViewGroup.LayoutParams layoutParams = A0G2.getLayoutParams();
            0qQ.A0C(layoutParams, C273654mx.A00(3));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = resources.getDimensionPixelSize(R.dimen.action_bar_immersive_gradient_height);
            A0G2.setLayoutParams(marginLayoutParams);
        }
        this.A08 = resources.getDimensionPixelSize(R.dimen.messaging_ads_multi_suggestions_thumbnail_height);
        this.A0H = resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        this.A0G = resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        this.A09 = 0nA.A09(context);
        r7.A02.add(this);
        this.A0F = new C19502Wao(r7);
        View requireViewById = A0G2.requireViewById(R.id.scrubber_focus_box_background_view);
        this.A0C = requireViewById;
        C14665U0l u0l = new C14665U0l(context);
        this.A0L = u0l;
        requireViewById.setBackground(u0l);
        DbU.A12(context, requireViewById, 2131967805);
        View A0G3 = AnonymousClass7TF.A0G(A0G2, R.id.scrbber_focus_box_ring_view);
        C14678U0z u0z = new C14678U0z(context);
        this.A0M = u0z;
        A0G3.setBackground(u0z);
        RecyclerView A0I2 = DbT.A0I(A0G2, R.id.scrubber_recycler_view);
        this.A0E = A0I2;
        A0I2.setNestedScrollingEnabled(false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        this.A0D = linearLayoutManager;
        A0I2.setLayoutManager(linearLayoutManager);
        C67805Mv9 mv9 = new C67805Mv9();
        this.A0K = mv9;
        A0I2.setAdapter(mv9);
    }

    private final void A00() {
        LinearLayoutManager linearLayoutManager = this.A0D;
        int i = this.A01;
        int i2 = this.A00;
        int i3 = i2 / 15;
        int i4 = IgNetworkConsentStorage.MAX_ENTRIES;
        if (1000 < i3) {
            i4 = i3;
        }
        int i5 = i / i4;
        int i6 = this.A09;
        int i7 = this.A08;
        int i8 = IgNetworkConsentStorage.MAX_ENTRIES;
        if (1000 < i3) {
            i8 = i3;
        }
        int A012 = JTP.A01((double) (i6 - i7), 2.0d);
        float f = ((float) (i % i8)) / ((float) i8);
        int i9 = IgNetworkConsentStorage.MAX_ENTRIES;
        if (1000 < i3) {
            i9 = i3;
        }
        linearLayoutManager.A1p(i5, A012 - ((int) (f * ((float) ((int) ((((float) i9) / ((float) i2)) * ((float) i7)))))));
    }

    private final void A01() {
        C14809UAf uAf = this.A05;
        if (uAf != null) {
            this.A0E.A12(uAf);
        }
        RecyclerView recyclerView = this.A0E;
        Context context = recyclerView.getContext();
        int i = this.A09;
        int i2 = this.A08;
        int A012 = JTP.A01((double) (i - i2), 2.0d);
        int i3 = this.A00;
        int i4 = this.A0G;
        int i5 = i3 / 15;
        int i6 = IgNetworkConsentStorage.MAX_ENTRIES;
        if (1000 < i5) {
            i6 = i5;
        }
        float f = (float) i3;
        float f2 = (float) i2;
        int i7 = ((int) ((((float) i6) / f) * f2)) - i4;
        int i8 = this.A02;
        int i9 = IgNetworkConsentStorage.MAX_ENTRIES;
        if (1000 < i5) {
            i9 = i5;
        }
        double d = ((double) (i8 % i9)) / ((double) i9);
        int i10 = IgNetworkConsentStorage.MAX_ENTRIES;
        if (1000 < i5) {
            i10 = i5;
        }
        C14809UAf uAf2 = new C14809UAf(context, A012, i7, ((int) (d * ((double) ((int) ((((float) i10) / f) * f2))))) - i4);
        recyclerView.A11(uAf2);
        this.A05 = uAf2;
        this.A0K.notifyDataSetChanged();
    }

    private final void A02(int i) {
        float A002 = 0mi.A00(((float) (i - this.A01)) / ((float) this.A00), 0.0f, 1.0f);
        C14665U0l u0l = this.A0L;
        u0l.A00.mutate().setLevel((int) (A002 * 10000.0f));
        u0l.invalidateSelf();
    }

    public static final void A03(C19501Wan wan, boolean z) {
        AnonymousClass2hV r3 = wan.A0J;
        LinearLayoutManager linearLayoutManager = wan.A0D;
        int A1a = linearLayoutManager.A1a();
        int A1b = linearLayoutManager.A1b();
        if (A1a <= A1b) {
            while (true) {
                C249703kE A0W = wan.A0E.A0W(A1a);
                if (A0W != null) {
                    r3.apply(A0W);
                }
                if (A1a == A1b) {
                    break;
                }
                A1a++;
            }
        }
        C14678U0z u0z = wan.A0M;
        u0z.A00 = z;
        C14678U0z.A00(u0z);
        if (z && !wan.A07) {
            AnonymousClass2S0.A01.A03();
        }
        wan.A07 = z;
    }

    public final boolean A04() {
        LinearLayoutManager linearLayoutManager = this.A0D;
        int A1a = linearLayoutManager.A1a();
        int A1b = linearLayoutManager.A1b();
        if (A1a > A1b) {
            return false;
        }
        while (true) {
            C249703kE A0W = this.A0E.A0W(A1a);
            if (A0W != null && Pxf.A1U(this.A0K.A02, A1a)) {
                int i = this.A09;
                int i2 = this.A08;
                int i3 = this.A0H;
                View view = A0W.itemView;
                0qQ.A06(view);
                int A012 = JTP.A01((double) (i - i2), 2.0d);
                if (view.getLeft() < i3 + A012 && view.getRight() > A012) {
                    return true;
                }
            }
            if (A1a == A1b) {
                return false;
            }
            A1a++;
        }
    }

    public final void CMv(List list, int i, int i2, int i3) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A06 = list;
        RecyclerView recyclerView = this.A0E;
        0nA.A0q(recyclerView, new C20047Wk7(this));
        0nA.A0m(recyclerView, recyclerView);
        recyclerView.A15(this.A0I);
        recyclerView.setOnTouchListener(this.A0B);
        this.A0K.A00(this.A06, this.A02, this.A00);
        A01();
        A00();
        A02(this.A01);
    }

    public final void Dld(int i) {
        this.A00 = i;
        this.A0K.A00(this.A06, this.A02, i);
        A01();
    }

    public final void Dle(int i) {
        this.A01 = i;
        A00();
    }

    public final void DTI(int i) {
        A02(i);
    }
}
