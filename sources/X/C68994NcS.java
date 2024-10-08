package X;

import android.content.res.Resources;
import android.os.Bundle;
import com.instagram.direct.inbox.fragment.DirectSearchInboxFragment;
import java.util.ArrayList;

/* renamed from: X.NcS  reason: case insensitive filesystem */
public final class C68994NcS extends C16744V4b {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;

    public C68994NcS(C72918PPc pPc, ON1 on1, Integer num, String str, String str2, int i, int i2) {
        this.A00 = i2;
        this.A02 = pPc;
        this.A03 = num;
        this.A06 = str;
        this.A05 = str2;
        this.A01 = i;
        this.A04 = on1;
    }

    public final void A02() {
        if (1 - this.A00 != 0) {
            super.A02();
        } else {
            C72918PPc.A01((C72918PPc) this.A02);
        }
    }

    public final void A03() {
        Bundle A032;
        int i = this.A00;
        C72918PPc pPc = (C72918PPc) this.A02;
        DirectSearchInboxFragment directSearchInboxFragment = pPc.A0S;
        Integer num = (Integer) this.A03;
        1aq r6 = 1as.A04.A01;
        Resources resources = pPc.A0M.getResources();
        if (i != 0) {
            A032 = r6.A03(resources.getString(2131964273), this.A06, this.A05, (ArrayList) null, (ArrayList) null, (ArrayList) null, (ArrayList) null, ((ON1) this.A04).A02, (ArrayList) null, 37, this.A01);
        } else {
            A032 = r6.A03(resources.getString(2131964274), this.A06, this.A05, (ArrayList) null, (ArrayList) null, (ArrayList) null, ((ON1) this.A04).A05, (ArrayList) null, (ArrayList) null, 22, this.A01);
        }
        directSearchInboxFragment.A04(A032, num);
    }
}
