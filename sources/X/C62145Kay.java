package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Kay  reason: case insensitive filesystem */
public final class C62145Kay extends C2806552w {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ MSE A02;
    public final /* synthetic */ AnonymousClass5w8 A03;
    public final /* synthetic */ String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62145Kay(Context context, FragmentActivity fragmentActivity, MSE mse, AnonymousClass5w8 r5, String str, int i) {
        super(Integer.valueOf(i));
        this.A03 = r5;
        this.A01 = fragmentActivity;
        this.A00 = context;
        this.A04 = str;
        this.A02 = mse;
    }

    public final void onClick(View view) {
        AnonymousClass5w8 r1 = this.A03;
        FragmentActivity fragmentActivity = this.A01;
        Context context = this.A00;
        String str = this.A04;
        MSE mse = this.A02;
        AnonymousClass5w9 r0 = AnonymousClass5w8.A05;
        r1.A06(context, fragmentActivity, r1.A02, mse, str);
    }
}
