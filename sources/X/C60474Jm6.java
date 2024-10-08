package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.video.live.mvvm.view.comments.adapter.IgLiveCommentsLinearLayoutManager;

/* renamed from: X.Jm6  reason: case insensitive filesystem */
public final class C60474Jm6 extends C249403jg {
    public boolean A00;
    public final int A01;
    public final Object A02;

    public C60474Jm6(C65809M0b m0b) {
        this.A01 = 1;
        this.A02 = m0b;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A0D;
        int i2;
        switch (this.A01) {
            case 0:
                A0D = AnonymousClass7TG.A0D(recyclerView, 147715722);
                if (i == 0) {
                    AnonymousClass7TF.A0D().postDelayed(new C66044M9d(this, recyclerView, (K6H) this.A02, this.A00), 100);
                }
                i2 = -2134152033;
                break;
            case 1:
                A0D = AnonymousClass7TG.A0D(recyclerView, -983070195);
                super.onScrollStateChanged(recyclerView, i);
                boolean z = true;
                if (i != 1) {
                    z = false;
                }
                this.A00 = z;
                C65809M0b m0b = (C65809M0b) this.A02;
                C59671JTb jTb = (C59671JTb) m0b.A09.A02.A02();
                if (jTb != null) {
                    C65809M0b.A01(jTb, m0b);
                }
                i2 = -1067236969;
                break;
            default:
                A0D = AnonymousClass7TG.A0D(recyclerView, -719092823);
                super.onScrollStateChanged(recyclerView, i);
                if (i == 1) {
                    C53917GwN gwN = (C53917GwN) this.A02;
                    C284945Oz r0 = C53917GwN.A0E;
                    gwN.A06.A2X = true;
                    HK1 hk1 = gwN.A08;
                    hk1.A04.A00(true);
                    hk1.A0H();
                }
                i2 = -1104334676;
                break;
        }
        AnonymousClass0fD.A0A(i2, A0D);
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int i3;
        int i4;
        switch (this.A01) {
            case 1:
                i3 = AnonymousClass7TG.A0D(recyclerView, -618206484);
                super.onScrolled(recyclerView, i, i2);
                C65809M0b m0b = (C65809M0b) this.A02;
                IgLiveCommentsLinearLayoutManager igLiveCommentsLinearLayoutManager = m0b.A08;
                boolean A1Q = AnonymousClass7TF.A1Q(igLiveCommentsLinearLayoutManager.A1c());
                m0b.A09.A02(C65809M0b.A00(m0b), igLiveCommentsLinearLayoutManager.A1a(), A1Q, C51970G9q.A1W(igLiveCommentsLinearLayoutManager.A1d(), 3), this.A00);
                i4 = 535014473;
                break;
            case 2:
                i3 = AnonymousClass7TG.A0D(recyclerView, -642989227);
                super.onScrolled(recyclerView, i, i2);
                if (!this.A00) {
                    C252553pI r1 = recyclerView.A0D;
                    0qQ.A0C(r1, C66579MXk.A00(21));
                    int A1c = ((LinearLayoutManager) r1).A1c();
                    if (A1c != -1) {
                        if (i > 0 || i < 0) {
                            C53917GwN gwN = (C53917GwN) this.A02;
                            C284945Oz r0 = C53917GwN.A0E;
                            if (gwN.A06.A2X) {
                                HK1 hk1 = gwN.A08;
                                int i5 = 2;
                                if (182.A06(0Tu.A05, hk1.A0H, 36321761033987782L)) {
                                    i5 = 3;
                                }
                                int i6 = A1c / i5;
                                2V5 r12 = hk1.A02;
                                if (i6 != AnonymousClass7TE.A0M(r12.A00) && i6 >= 0 && i6 < hk1.A03()) {
                                    r12.A00(Integer.valueOf(i6));
                                }
                            }
                        }
                        i4 = 91261717;
                        break;
                    } else {
                        i4 = 1226685013;
                        break;
                    }
                } else {
                    i4 = -617006773;
                    break;
                }
            default:
                super.onScrolled(recyclerView, i, i2);
                return;
        }
        AnonymousClass0fD.A0A(i4, i3);
    }

    public C60474Jm6(int i, Object obj, boolean z) {
        this.A01 = i;
        this.A02 = obj;
        this.A00 = z;
    }
}
