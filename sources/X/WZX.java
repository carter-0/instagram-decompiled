package X;

import com.instagram.archive.fragment.ArchiveReelFragment;
import com.instagram.shopping.fragment.pdp.AdsProductPageFragment;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

public final class WZX implements C230902qW {
    public final int A00;
    public final Object A01;

    public WZX(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DR0(AnonymousClass4UE r6) {
        AnonymousClass4UC r62;
        String str;
        2bv r0;
        switch (this.A00) {
            case 0:
                C15469UdK udK = ((ArchiveReelFragment) this.A01).A00;
                AnonymousClass4UC r63 = (AnonymousClass4UC) r6;
                C15533UeM ueM = udK.A07;
                if (ueM != null && r63 != null && (r0 = udK.A01) != null) {
                    ueM.A00 = r0;
                    ueM.A01 = r63;
                    udK.A0C();
                    return;
                }
                return;
            case 1:
                K68 k68 = (K68) this.A01;
                if (r6 instanceof AnonymousClass4UC) {
                    r62 = (AnonymousClass4UC) r6;
                } else {
                    r62 = null;
                }
                k68.A04 = r62;
                C231922sd r3 = new C231922sd(k68, AnonymousClass7TE.A0l(k68.A0C));
                int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                C252063oV r02 = k68.A03;
                if (r02 == null) {
                    str = "qpView";
                } else {
                    C254123ry r2 = new C254123ry(r02.getView());
                    C231002qi r1 = k68.A05;
                    if (r1 == null) {
                        str = "quickPromotionPresenter";
                    } else {
                        AnonymousClass4UC r03 = k68.A04;
                        if (r03 != null) {
                            r3.ADo(r1, r03, r2);
                            return;
                        }
                        throw AnonymousClass7TE.A0y();
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            case 2:
                AdsProductPageFragment adsProductPageFragment = (AdsProductPageFragment) this.A01;
                W2j w2j = new W2j(adsProductPageFragment.A0O);
                w2j.A01 = r6;
                adsProductPageFragment.Elq(new C18588Vuf(w2j));
                C17922ViD viD = adsProductPageFragment.A05;
                viD.A00(viD.A00, viD.A01);
                viD.A04.notifyDataSetChanged();
                return;
            default:
                ReelDashboardFragment reelDashboardFragment = (ReelDashboardFragment) this.A01;
                C14625TzX tzX = reelDashboardFragment.mListAdapter;
                tzX.A02 = reelDashboardFragment.A09;
                tzX.A03 = (C16138UpP) r6;
                0fE.A00(tzX, 1917771652);
                return;
        }
    }
}
