package X;

import android.content.Context;
import androidx.fragment.app.Fragment;

/* renamed from: X.FoH  reason: case insensitive filesystem */
public final class C51087FoH implements G83 {
    public final int A00;
    public final Object A01;

    public C51087FoH(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DEH(Integer num) {
        Context context;
        String str;
        switch (this.A00) {
            case 0:
                C69904Nu6.A00(((C71153OeR) this.A01).A0Y, false);
                return;
            case 3:
                context = ((C49863FAf) this.A01).A02;
                break;
            case 4:
                context = ((AnonymousClass4DH) this.A01).getRootActivity();
                str = "something_went_wrong";
                break;
            default:
                context = ((Fragment) this.A01).requireContext();
                break;
        }
        str = "unrestricted_user_failed";
        C59689JTv.A0B(context, str);
    }

    public final /* synthetic */ void onFinish() {
    }

    public final /* synthetic */ void onStart() {
    }

    public final void onSuccess() {
        Context context;
        switch (this.A00) {
            case 0:
                C71153OeR oeR = (C71153OeR) this.A01;
                C71153OeR.A0J(oeR);
                AnonymousClass4DH r2 = oeR.A0b;
                DbZ.A0w(r2.getRootActivity(), r2, 2131952113);
                return;
            case 3:
                context = ((C49863FAf) this.A01).A02;
                break;
            case 4:
                E66 e66 = (E66) this.A01;
                if (e66.A06) {
                    C51889G6e g6e = e66.A03;
                    if (g6e != null) {
                        String str = e66.A05;
                        if (str == null) {
                            0qQ.A0F("targetUserId");
                            throw AnonymousClass00P.createAndThrow();
                        } else {
                            g6e.DwT(str);
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    AnonymousClass37D A02 = AnonymousClass37D.A00.A02(e66.getContext());
                    if (A02 != null) {
                        DbU.A1U(new FmJ(8, A02, e66), A02, A02);
                        return;
                    }
                    return;
                }
            default:
                context = ((Fragment) this.A01).requireContext();
                break;
        }
        C59689JTv.A07(context, 2131952113);
    }
}
