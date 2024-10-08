package X;

import android.content.Context;
import com.facebook.pushlite.model.PushInfraMetaData;

public final class N31 extends AnonymousClass0T0 {
    public Integer A00;
    public boolean A01;
    public boolean A02;
    public final Context A03;
    public final PushInfraMetaData A04;
    public final C74376Ptr A05;
    public final C74376Ptr A06;
    public final String A07;

    public N31(Context context, PushInfraMetaData pushInfraMetaData, C74376Ptr ptr, C74376Ptr ptr2, Integer num, String str, boolean z, boolean z2) {
        0qQ.A0B(pushInfraMetaData, 4);
        this.A03 = context;
        this.A06 = ptr;
        this.A05 = ptr2;
        this.A04 = pushInfraMetaData;
        this.A07 = str;
        this.A00 = num;
        this.A02 = z;
        this.A01 = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N31) {
                N31 n31 = (N31) obj;
                if (!0qQ.A0K(this.A03, n31.A03) || !0qQ.A0K(this.A06, n31.A06) || !0qQ.A0K(this.A05, n31.A05) || !0qQ.A0K(this.A04, n31.A04) || !0qQ.A0K(this.A07, n31.A07) || !0qQ.A0K(this.A00, n31.A00) || this.A02 != n31.A02 || this.A01 != n31.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A04, (((AnonymousClass7TE.A0K(this.A03) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31);
        return DbS.A06(this.A01, AnonymousClass7TF.A09(this.A02, (AnonymousClass7TF.A08(this.A07, A072) + AnonymousClass7TE.A0L(this.A00)) * 31));
    }
}
