package X;

import com.instagram.common.typedurl.ImageUrl;
import java.lang.ref.Reference;
import java.util.Set;

/* renamed from: X.3vu  reason: invalid class name and case insensitive filesystem */
public final class C256523vu implements AnonymousClass1MK {
    public final /* synthetic */ ImageUrl A00;
    public final /* synthetic */ AnonymousClass3PK A01;
    public final /* synthetic */ AnonymousClass3BV A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Set A05;
    public final /* synthetic */ Set A06;
    public final /* synthetic */ Set A07;
    public final /* synthetic */ boolean A08;

    public final void DK4(C226952iF r1, int i) {
    }

    public C256523vu(ImageUrl imageUrl, AnonymousClass3PK r2, AnonymousClass3BV r3, String str, String str2, Set set, Set set2, Set set3, boolean z) {
        this.A02 = r3;
        this.A03 = str;
        this.A00 = imageUrl;
        this.A06 = set;
        this.A01 = r2;
        this.A07 = set2;
        this.A05 = set3;
        this.A08 = z;
        this.A04 = str2;
    }

    public final void CyF(C226952iF r9, AnonymousClass3LX r10) {
        String str = this.A03;
        ImageUrl imageUrl = this.A00;
        Set set = this.A06;
        set.remove(imageUrl);
        AnonymousClass3BV r3 = this.A02;
        AnonymousClass3BV.A04(this.A01, r3, str, this.A07, set, this.A05);
        if (this.A08) {
            Set<Reference> set2 = r3.A04;
            for (Reference reference : set2) {
                C311566ct r1 = (C311566ct) reference.get();
                if (r1 == null) {
                    set2.remove(reference);
                } else {
                    r1.DQr(str, this.A04);
                }
            }
        }
    }

    public final void DJx(C226952iF r9, C254673sr r10) {
        String str = this.A03;
        ImageUrl imageUrl = this.A00;
        Set set = this.A06;
        set.remove(imageUrl);
        AnonymousClass3BV r3 = this.A02;
        AnonymousClass3BV.A04(this.A01, r3, str, this.A07, set, this.A05);
        if (this.A08) {
            Set<Reference> set2 = r3.A04;
            for (Reference reference : set2) {
                C311566ct r1 = (C311566ct) reference.get();
                if (r1 == null) {
                    set2.remove(reference);
                } else {
                    r1.DQ3(str, this.A04);
                }
            }
        }
    }
}
