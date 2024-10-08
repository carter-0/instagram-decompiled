package X;

import android.content.Context;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.FZk  reason: case insensitive filesystem */
public final class C50353FZk implements DQZ {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ ExY A01;
    public final /* synthetic */ EQ5 A02;
    public final /* synthetic */ 1Xj A03;
    public final /* synthetic */ DirectShareTarget A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public C50353FZk(Context context, ExY exY, EQ5 eq5, 1Xj r4, DirectShareTarget directShareTarget, String str, String str2, boolean z) {
        this.A04 = directShareTarget;
        this.A02 = eq5;
        this.A00 = context;
        this.A03 = r4;
        this.A01 = exY;
        this.A05 = str;
        this.A07 = z;
        this.A06 = str2;
    }

    public final void DfV(String str) {
        if (str != null) {
            DirectShareTarget directShareTarget = this.A04;
            directShareTarget.A09 = new C254763t0(str);
            EQ5 eq5 = this.A02;
            Context context = this.A00;
            1Xj r4 = this.A03;
            eq5.A00(context, this.A01, (C381819cP) null, r4, directShareTarget, this.A05, this.A06, (String) null, this.A07);
        }
    }
}
