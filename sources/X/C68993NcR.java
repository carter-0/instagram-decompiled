package X;

import android.os.Bundle;
import com.google.common.collect.ImmutableCollection;
import com.instagram.direct.inbox.fragment.DirectSearchInboxFragment;
import java.util.ArrayList;

/* renamed from: X.NcR  reason: case insensitive filesystem */
public final class C68993NcR extends C16744V4b {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;

    public C68993NcR(Object obj, Object obj2, String str, String str2, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj2;
        this.A05 = str;
        this.A04 = str2;
        this.A01 = i;
        this.A03 = obj;
    }

    public final void A02() {
        if (this.A00 != 0) {
            super.A02();
        } else {
            C72918PPc.A01((C72918PPc) this.A02);
        }
    }

    public final void A03() {
        Integer num;
        Bundle A032;
        int i = this.A00;
        C72918PPc pPc = (C72918PPc) this.A02;
        DirectSearchInboxFragment directSearchInboxFragment = pPc.A0S;
        switch (i) {
            case 0:
                num = AnonymousClass05K.A0u;
                A032 = 1as.A04.A01.A03(pPc.A0M.getResources().getString(2131964273), this.A05, this.A04, (ArrayList) null, (ArrayList) null, (ArrayList) null, (ArrayList) null, AnonymousClass7TE.A1D((ImmutableCollection) this.A03), (ArrayList) null, 37, this.A01);
                break;
            case 1:
                num = AnonymousClass05K.A0j;
                A032 = 1as.A04.A01.A03(pPc.A0M.getResources().getString(2131964279), this.A05, this.A04, ((ON1) this.A03).A03, (ArrayList) null, (ArrayList) null, (ArrayList) null, (ArrayList) null, (ArrayList) null, 15, this.A01);
                break;
            default:
                num = AnonymousClass05K.A03;
                A032 = 1as.A04.A01.A03(pPc.A0M.getResources().getString(2131964281), this.A05, this.A04, (ArrayList) null, ((ON1) this.A03).A04, (ArrayList) null, (ArrayList) null, (ArrayList) null, (ArrayList) null, 17, this.A01);
                break;
        }
        directSearchInboxFragment.A04(A032, num);
    }
}
