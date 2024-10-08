package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.33M  reason: invalid class name */
public final class AnonymousClass33M extends 0Yg implements C62320sa {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C231672s5 A03;
    public final /* synthetic */ AnonymousClass310 A04;
    public final /* synthetic */ AnonymousClass334 A05;
    public final /* synthetic */ C249763kK A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass33M(Context context, FragmentActivity fragmentActivity, UserSession userSession, C231672s5 r5, AnonymousClass310 r6, AnonymousClass334 r7, C249763kK r8, String str, boolean z, boolean z2) {
        super(0);
        this.A05 = r7;
        this.A04 = r6;
        this.A01 = fragmentActivity;
        this.A00 = context;
        this.A02 = userSession;
        this.A09 = z;
        this.A03 = r5;
        this.A08 = z2;
        this.A06 = r8;
        this.A07 = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass334 r1 = this.A05;
        AnonymousClass4DU r7 = r1.A04;
        AnonymousClass310 r0 = this.A04;
        C252593pM B5F = r0.B5F();
        AnonymousClass4DV BqC = r0.BqC();
        FragmentActivity fragmentActivity = this.A01;
        Context context = this.A00;
        UserSession userSession = this.A02;
        boolean z = this.A09;
        return new C252603pN(context, fragmentActivity, userSession, this.A03, B5F, (C252613pO) r1.A0U.getValue(), r7, BqC, this.A06, this.A07, z, this.A08);
    }
}
