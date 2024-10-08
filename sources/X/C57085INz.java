package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.INz  reason: case insensitive filesystem */
public final class C57085INz implements 1wn {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C57085INz(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03;
        int i;
        List AZX;
        switch (this.A00) {
            case 0:
                A03 = AnonymousClass0fD.A03(1013212167);
                1qJ r10 = (1qJ) obj;
                int A0D = AnonymousClass7TG.A0D(r10, 1618721592);
                1Xj r8 = r10.A00;
                C2801750l BDc = r8.A0C.BDc();
                if (!(BDc == null || (AZX = BDc.AZX()) == null)) {
                    C307896Rx r7 = (C307896Rx) this.A01;
                    C277014uI r6 = (C277014uI) this.A02;
                    if (!(AZX instanceof Collection) || !AZX.isEmpty()) {
                        Iterator it = AZX.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (0qQ.A0K(((C2801550j) it.next()).getTitle(), "Welcome")) {
                                    if (r8.A00 == 1) {
                                        C308206Td.A0E(r7, r6, "");
                                    }
                                }
                            }
                        }
                    }
                }
                AnonymousClass0fD.A0A(654218915, A0D);
                i = -994902200;
                break;
            case 1:
                A03 = AnonymousClass0fD.A03(2085239787);
                C57062INc iNc = (C57062INc) obj;
                int A0D2 = AnonymousClass7TG.A0D(iNc, 1862436055);
                String str = iNc.A00;
                GMH gmh = (GMH) this.A02;
                if (0qQ.A0K(str, gmh.A05.A06) && gmh.A0I) {
                    DbS.A1U(this.A01);
                }
                AnonymousClass0fD.A0A(-837697427, A0D2);
                i = -64241698;
                break;
            case 2:
                A03 = AnonymousClass0fD.A03(-183230543);
                C64666Lfs lfs = (C64666Lfs) obj;
                int A0D3 = AnonymousClass7TG.A0D(lfs, -199662698);
                GUD gud = ((GTP) this.A02).A01;
                if (gud != null) {
                    gud.A01((C53122Giu) this.A01, lfs.A00);
                    AnonymousClass0fD.A0A(773482603, A0D3);
                    i = -1105370305;
                    break;
                } else {
                    0qQ.A0F("scheduledContentPublishTimeViewBinder");
                    throw AnonymousClass00P.createAndThrow();
                }
            default:
                A03 = AnonymousClass0fD.A03(923198875);
                GP0 gp0 = (GP0) obj;
                int A0D4 = AnonymousClass7TG.A0D(gp0, 1930982659);
                if (0qQ.A0K(gp0.A01, ((GFJ) this.A02).A06)) {
                    C51967G9n.A1I((2Wa) this.A01, gp0.A02);
                }
                AnonymousClass0fD.A0A(438460815, A0D4);
                i = 378342858;
                break;
        }
        AnonymousClass0fD.A0A(i, A03);
    }
}
