package X;

import android.content.Context;
import android.os.Bundle;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class EDQ extends 1P0 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    public EDQ(Context context, UserSession userSession, int i, boolean z) {
        this.A00 = i;
        if (1 - i != 0) {
            this.A02 = userSession;
            this.A03 = z;
            this.A01 = context;
        } else {
            this.A01 = context;
            this.A02 = userSession;
            this.A03 = z;
        }
    }

    public final void onFail(C268654dm r6) {
        int i;
        int i2;
        switch (this.A00) {
            case 1:
                i = AnonymousClass0fD.A03(1200853865);
                02m.A0p.markerEnd(190461770, 3);
                C59689JTv.A0D((Context) this.A01, "request_error");
                i2 = 814535819;
                break;
            case 2:
                i = AnonymousClass0fD.A03(2038220269);
                Object obj = this.A02;
                Context context = (Context) this.A01;
                C310336ap A0a = DbS.A0a();
                DbS.A19(context, A0a, 2131957383);
                A0a.A05();
                A0a.A0H = "daisy_snackbar_error";
                A0a.A06();
                A0a.A0L = true;
                DbW.A0q(context, A0a, 2131957382);
                FdJ.A00(A0a, context, obj, 8);
                DbY.A1N(A0a);
                i2 = 867947872;
                break;
            case 3:
                i = AnonymousClass7TG.A0D(r6, -2118909328);
                EDQ.super.onFail(r6);
                PR9 pr9 = ((ESI) this.A02).A06;
                if (pr9 != null) {
                    pr9.A0D = !this.A03;
                }
                ((User) this.A01).A03.EhF(Boolean.valueOf(!this.A03));
                i2 = 1609518422;
                break;
            case 4:
                i = AnonymousClass0fD.A03(279581482);
                Fragment fragment = ((EyG) ((FQO) this.A01).A01).A00;
                if (fragment.isAdded()) {
                    C59689JTv.A0E(fragment.getContext(), "allow_resharing_to_stories_settings_failed");
                    ((CompoundButton) this.A02).setChecked(!this.A03);
                }
                i2 = -1808808698;
                break;
            default:
                EDQ.super.onFail(r6);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    /* JADX WARNING: type inference failed for: r0v29, types: [X.1qK, java.lang.Object] */
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(666553452);
                int A032 = AnonymousClass0fD.A03(269234018);
                if (((C47129Dr6) ((AnonymousClass371) obj).FH3()).A00) {
                    UserSession userSession = ((F2W) this.A01).A04;
                    boolean z = this.A03;
                    Bundle A09 = DbY.A09(userSession);
                    A09.putBoolean("is_parent_account", z);
                    AnonymousClass4DH r1 = new AnonymousClass4DH();
                    r1.setArguments(A09);
                    C309516Yo A0N = DbV.A0N(r1, (FragmentActivity) this.A02, userSession);
                    A0N.A0E = true;
                    A0N.A04();
                }
                AnonymousClass0fD.A0A(226124419, A032);
                i2 = -572705085;
                break;
            case 1:
                i = AnonymousClass0fD.A03(429321911);
                int A033 = AnonymousClass0fD.A03(-993557327);
                UserSession userSession2 = (UserSession) this.A02;
                C49761F5n.A00((Context) this.A01, userSession2);
                User A0j = DbT.A0j(userSession2);
                A0j.A03.Edr(AnonymousClass7TE.A0v());
                if (this.A03) {
                    F5l.A00(userSession2);
                }
                A0j.A0d(userSession2);
                02m.A0p.markerEnd(190461770, 2);
                AnonymousClass0fD.A0A(595493390, A033);
                i2 = -683483325;
                break;
            case 2:
                i = AnonymousClass0fD.A03(-1243299161);
                int A034 = AnonymousClass0fD.A03(861570859);
                UserSession userSession3 = (UserSession) this.A02;
                AnonymousClass3VS.A00(userSession3).A00(this.A03);
                0Pk r0 = 0Pl.A0n;
                Context context = (Context) this.A01;
                r0.A00(context, userSession3).A0J(context);
                AnonymousClass1Nd.A00(userSession3).A00(new Object());
                AnonymousClass0fD.A0A(732484660, A034);
                i2 = -1849015064;
                break;
            case 4:
                i = AnonymousClass0fD.A03(-150648725);
                int A035 = AnonymousClass0fD.A03(-1080496248);
                DbT.A0j(((EyG) ((FQO) this.A01).A01).A01).A03.EWc(Boolean.valueOf(!this.A03));
                AnonymousClass0fD.A0A(-1923315830, A035);
                i2 = 605637532;
                break;
            default:
                EDQ.super.onSuccess(obj);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public EDQ(int i, Object obj, Object obj2, boolean z) {
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = z;
        this.A02 = obj;
    }
}
