package X;

import android.content.res.Resources;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.ERp  reason: case insensitive filesystem */
public final class C48026ERp extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "DailyReminderMenuFragment";
    public long A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final void configureActionBar(2da r1) {
    }

    public final String getModuleName() {
        return "time_spent";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-193679784);
        super.onCreate(bundle);
        AnonymousClass0fD.A09(94070202, A02);
    }

    public final void onResume() {
        long j;
        int A02 = AnonymousClass0fD.A02(327873861);
        super.onResume();
        AnonymousClass0eM r11 = this.A01;
        0lg A0X = DbT.A0X(r11);
        0Tu r8 = 0Tu.A05;
        if (182.A06(r8, A0X, 36313725149448399L)) {
            j = 1;
        } else {
            j = 60;
        }
        2Cd r13 = new 2Cd(AnonymousClass7TE.A0l(r11));
        this.A00 = r13.A00();
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A022 = FG5.A02(AnonymousClass7TE.A0l(r11));
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        Iterator A1G = AnonymousClass7TE.A1G(A022);
        while (A1G.hasNext()) {
            String str = (String) AnonymousClass7TF.A0a(A1G);
            int parseInt = Integer.parseInt(str);
            if (parseInt > 0) {
                Resources A05 = DbV.A05(this);
                0qQ.A07(A05);
                DbV.A1V(str, C49927FFd.A01(A05, parseInt, 182.A06(r8, DbT.A0X(r11), 36313725149448399L), false), A1C2);
            }
        }
        String str2 = "off";
        if (this.A00 > 0) {
            DbV.A1V(str2, DbV.A05(this).getString(2131957348), A1C2);
        }
        long j2 = this.A00;
        if (j2 >= 0) {
            long j3 = j2 / j;
            if (A022.contains(String.valueOf(j3))) {
                if (j3 != 0) {
                    str2 = String.valueOf(j3);
                }
                DbU.A1F(new FQZ(r13, this, A1C2, j), str2, A1C, A1C2);
                FGF.A01(A1C, 2131957362);
                setItems(A1C);
                AnonymousClass0fD.A09(1346007920, A02);
            }
        }
        str2 = " ";
        DbU.A1F(new FQZ(r13, this, A1C2, j), str2, A1C, A1C2);
        FGF.A01(A1C, 2131957362);
        setItems(A1C);
        AnonymousClass0fD.A09(1346007920, A02);
    }
}
