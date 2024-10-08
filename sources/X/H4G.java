package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.messagethread.collections.model.DirectCollectionArguments;
import com.instagram.save.model.SavedCollection;

public final class H4G extends 1P0 {
    public final /* synthetic */ H1P A00;
    public final /* synthetic */ SavedCollection A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public H4G(H1P h1p, SavedCollection savedCollection, boolean z, boolean z2) {
        this.A00 = h1p;
        this.A01 = savedCollection;
        this.A02 = z;
        this.A03 = z2;
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        ImageUrl A1Q;
        int A032 = AnonymousClass0fD.A03(-2088147153);
        int A033 = AnonymousClass0fD.A03(-349787905);
        H1P h1p = this.A00;
        C55954HqI hqI = h1p.A07;
        if (hqI != null) {
            SavedCollection savedCollection = this.A01;
            1Xj A0v = C51966G9m.A0v(h1p.A0K);
            if (A0v == null || (A1Q = A0v.A1Q()) == null) {
                IllegalStateException A0y = AnonymousClass7TE.A0y();
                AnonymousClass0fD.A0A(-2139577609, A033);
                throw A0y;
            }
            hqI.A00(A1Q, savedCollection);
        }
        AnonymousClass0eM r8 = h1p.A0I;
        C56534I0f i0f = (C56534I0f) r8.getValue();
        boolean z = this.A02;
        if (z && !this.A03) {
            DirectCollectionArguments directCollectionArguments = i0f.A01;
            if (directCollectionArguments.A03 == AnonymousClass05K.A00) {
                0xI A012 = 0xI.A01("instagram_organic_save", directCollectionArguments.A07);
                String str = directCollectionArguments.A04;
                if (str == null) {
                    str = directCollectionArguments.A05;
                }
                A012.A0C("m_pk", str);
                DbU.A1R(A012, i0f.A00);
            }
        }
        ((C56534I0f) r8.getValue()).A01(this.A01, z);
        AnonymousClass0fD.A0A(954856442, A033);
        AnonymousClass0fD.A0A(1796378541, A032);
    }
}
