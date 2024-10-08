package X;

import com.instagram.wellbeing.limitedprofile.fragment.LimitedCommentsFragment;

/* renamed from: X.EMi  reason: case insensitive filesystem */
public final class C47914EMi extends C249383je {
    public final int A00;
    public final Object A01;

    public C47914EMi(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onScroll(C238133Ar r10, int i, int i2, int i3, int i4, int i5) {
        int A03;
        int i6;
        C238133Ar r3 = r10;
        int i7 = i;
        int i8 = i2;
        int i9 = i3;
        int i10 = i4;
        int i11 = i5;
        switch (this.A00) {
            case 0:
                A03 = AnonymousClass0fD.A03(1624078042);
                ((E6Z) this.A01).A08.onScroll(r3, i7, i8, i9, i10, i11);
                i6 = -795056980;
                break;
            case 1:
                A03 = AnonymousClass7TG.A0D(r10, -1420035287);
                ((C47521E6h) this.A01).A0A.onScroll(r3, i7, i8, i9, i10, i11);
                i6 = -1971663603;
                break;
            default:
                A03 = AnonymousClass0fD.A03(1791539450);
                r10.Eq3(true);
                LimitedCommentsFragment limitedCommentsFragment = (LimitedCommentsFragment) this.A01;
                limitedCommentsFragment.A02.onScroll(r3, i7, i8, i9, i10, i11);
                limitedCommentsFragment.A0F.onScroll(r3, i7, i8, i9, i10, i11);
                i6 = 917073615;
                break;
        }
        AnonymousClass0fD.A0A(i6, A03);
    }

    public final void onScrollStateChanged(C238133Ar r4, int i) {
        int A03;
        int i2;
        switch (this.A00) {
            case 0:
                A03 = AnonymousClass0fD.A03(1212551624);
                ((E6Z) this.A01).A08.onScrollStateChanged(r4, i);
                i2 = 752169189;
                break;
            case 1:
                A03 = AnonymousClass7TG.A0D(r4, -1956218585);
                ((C47521E6h) this.A01).A0A.onScrollStateChanged(r4, i);
                i2 = 1385278372;
                break;
            default:
                A03 = AnonymousClass0fD.A03(-990221189);
                LimitedCommentsFragment limitedCommentsFragment = (LimitedCommentsFragment) this.A01;
                limitedCommentsFragment.A02.onScrollStateChanged(r4, i);
                limitedCommentsFragment.A0F.onScrollStateChanged(r4, i);
                i2 = 1623453261;
                break;
        }
        AnonymousClass0fD.A0A(i2, A03);
    }
}
