package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.Ls9  reason: case insensitive filesystem */
public final class C65368Ls9 implements C66536MVq, AnonymousClass2sT {
    public final Context A00;
    public final Fragment A01;
    public final UserSession A02;
    public final AnonymousClass4DU A03;
    public final AnonymousClass3Q2 A04;
    public final Set A05 = AnonymousClass7TE.A1F();

    public final void ECA(AnonymousClass3M8 r2) {
        0qQ.A0B(r2, 0);
        this.A05.add(r2);
    }

    public final void FJ6(AnonymousClass3M8 r2) {
        0qQ.A0B(r2, 0);
        this.A05.remove(r2);
    }

    public final 1iA BR7() {
        return this.A04.A1G;
    }

    public final int BhS() {
        return this.A04.A03();
    }

    public final Integer BzN() {
        AnonymousClass3Q2 r2 = this.A04;
        AnonymousClass3QD r0 = r2.A6J;
        AnonymousClass3QD r1 = AnonymousClass3QD.CONFIGURED;
        if (r0 == r1 && r2.A0n()) {
            return AnonymousClass05K.A00;
        }
        if (r2.A1f == r1) {
            return AnonymousClass05K.A01;
        }
        return AnonymousClass05K.A0N;
    }

    public final LSB BzP() {
        Integer num;
        String string;
        AnonymousClass3Q2 r4 = this.A04;
        C61100JxB jxB = r4.A0v;
        if (jxB != null) {
            num = jxB.A00;
        } else {
            num = null;
        }
        boolean z = false;
        if (num != null) {
            String format = new SimpleDateFormat(AnonymousClass000.A00(2345), Locale.US).format(new Date(((long) num.intValue()) * 1000));
            Context context = this.A00;
            return new LSB(AnonymousClass7TE.A16(context, 2131956688), DbY.A0c(context, format, 2131956686));
        } else if (r4.A0l != null) {
            return new LSB(2131955763, 2131955763);
        } else {
            C61066Jw4 jw4 = r4.A0m;
            if (jw4 != null && jw4.A01) {
                z = true;
            }
            if (z) {
                Context context2 = this.A00;
                return new LSB((View.OnClickListener) null, 8, 10000L, AnonymousClass7TE.A16(context2, 2131973683), context2.getString(2131955964), (String) null);
            }
            if (this.A03 != null) {
                UserSession userSession = this.A02;
                0Tu r2 = 0Tu.A05;
                if (182.A06(r2, userSession, 36326438252656391L)) {
                    Context context3 = this.A00;
                    String A16 = AnonymousClass7TE.A16(context3, 2131973683);
                    if (AnonymousClass0BO.A00(userSession).CKD()) {
                        string = DbY.A0b(context3, DbT.A0j(userSession), 2131969301);
                    } else {
                        string = context3.getString(2131969302);
                    }
                    0qQ.A07(string);
                    return new LSB(new LY1(this, 37), 8, AnonymousClass7TF.A0Y(r2, userSession, 36607913229489803L), A16, string, context3.getString(2131969300));
                }
            }
            return new LSB(2131973683, 2131973643);
        }
    }

    public final /* synthetic */ Drawable C6t() {
        return null;
    }

    public final String C6v() {
        AnonymousClass3Q2 r2 = this.A04;
        if (!AnonymousClass7TF.A1W(r2.A1G, 1iA.A0A)) {
            return r2.A33;
        }
        try {
            return AnonymousClass8YL.A02(r2).A33;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final void DaJ(AnonymousClass3Q2 r3) {
        for (AnonymousClass3M8 A0B : this.A05) {
            A0B.A0B(this);
        }
    }

    public final void Dfh() {
        1ud r1 = 1ua.A0G;
        Context context = this.A00;
        r1.A01(context, this.A02).A05(AnonymousClass6WL.A02(context), this.A04);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C65368Ls9)) {
            return false;
        }
        return 0qQ.A0K(this.A04.A35, ((C65368Ls9) obj).A04.A35);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04.A35});
    }

    public C65368Ls9(Context context, Fragment fragment, UserSession userSession, AnonymousClass4DU r5, AnonymousClass3Q2 r6) {
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = fragment;
        this.A03 = r5;
        this.A04 = r6;
    }
}
