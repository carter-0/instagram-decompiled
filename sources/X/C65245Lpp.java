package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lpp  reason: case insensitive filesystem */
public final class C65245Lpp implements C363658k8 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    public C65245Lpp(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.A00 = i;
        this.A07 = obj3;
        this.A03 = obj4;
        this.A05 = obj6;
        this.A06 = obj5;
        this.A01 = obj;
        this.A04 = obj2;
        this.A02 = obj7;
    }

    public final /* synthetic */ void Dcq() {
    }

    public final void Dcr() {
        if (this.A00 != 0) {
            C63882LAl lAl = (C63882LAl) this.A05;
            L2V l2v = (L2V) this.A06;
            L56 l56 = new L56(l2v.A00, false);
            Context context = (Context) this.A01;
            AnonymousClass4DH r1 = (AnonymousClass4DH) this.A04;
            UserSession userSession = (UserSession) this.A07;
            C47522E6i e6i = (C47522E6i) this.A02;
            LTD.A01(context, r1, userSession, l56, lAl, e6i);
            LTD.A00(context, r1, userSession, (C61149Jy0) this.A03, l2v, lAl, e6i);
            return;
        }
        AnonymousClass5w9 r0 = AnonymousClass5w8.A05;
        UserSession userSession2 = (UserSession) this.A07;
        if (AnonymousClass5w9.A01(userSession2)) {
            AnonymousClass5w8 A002 = AnonymousClass5w9.A00(userSession2);
            L75 l75 = (L75) this.A06;
            A002.A08(new C65250Lpu((Context) this.A01, (AnonymousClass4DH) this.A04, userSession2, (C61149Jy0) this.A03, l75, (LB7) this.A05, (C47522E6i) this.A02));
            return;
        }
        L75 l752 = (L75) this.A06;
        C64374Laq.A02((Context) this.A01, (AnonymousClass4DH) this.A04, userSession2, (C61149Jy0) this.A03, l752, (LB7) this.A05, (C47522E6i) this.A02);
    }
}
