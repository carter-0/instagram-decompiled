package X;

import java.util.List;

/* renamed from: X.MgE  reason: case insensitive filesystem */
public final class C66980MgE extends AnonymousClass4AA {
    public final AnonymousClass4A9 A00;
    public final AnonymousClass4AS A01;
    public final Integer A02;
    public final List A03;
    public final List A04;
    public final C61063Jw1 A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66980MgE) {
                C66980MgE mgE = (C66980MgE) obj;
                if (!0qQ.A0K(this.A03, mgE.A03) || !0qQ.A0K(this.A01, mgE.A01) || !0qQ.A0K(this.A00, mgE.A00) || !0qQ.A0K(this.A02, mgE.A02) || !0qQ.A0K(this.A05, mgE.A05) || !0qQ.A0K(this.A04, mgE.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((AnonymousClass7TE.A0K(this.A03) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TE.A0L(this.A04);
    }

    public C66980MgE(C61063Jw1 jw1, AnonymousClass4A9 r2, AnonymousClass4AS r3, Integer num, List list, List list2) {
        this.A03 = list;
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = num;
        this.A05 = jw1;
        this.A04 = list2;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CFHubRecyclerViewModel(itemViewModels=");
        A1A.append(this.A03);
        A1A.append(", creationItem=");
        A1A.append(this.A01);
        A1A.append(", friendMapNote=");
        A1A.append(this.A00);
        A1A.append(", chevronItemIndex=");
        A1A.append(this.A02);
        A1A.append(", spotlightModel=");
        A1A.append(this.A05);
        A1A.append(", mediaNoteStacks=");
        return AnonymousClass7TG.A0n(this.A04, A1A);
    }
}
