package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.ICj  reason: case insensitive filesystem */
public final class C56786ICj implements View.OnClickListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ Fragment A02;
    public final /* synthetic */ C267324bN A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ C271794jb A05;
    public final /* synthetic */ AnonymousClass4DU A06;
    public final /* synthetic */ AnonymousClass3W1 A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    public C56786ICj(Fragment fragment, C267324bN r2, UserSession userSession, C271794jb r4, AnonymousClass4DU r5, AnonymousClass3W1 r6, String str, float f, float f2, boolean z, boolean z2) {
        this.A04 = userSession;
        this.A02 = fragment;
        this.A06 = r5;
        this.A05 = r4;
        this.A03 = r2;
        this.A07 = r6;
        this.A08 = str;
        this.A00 = f;
        this.A01 = f2;
        this.A09 = z;
        this.A0A = z2;
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0fD.A05(277385413);
        UserSession userSession = this.A04;
        Fragment fragment = this.A02;
        2EG r9 = 2EG.A27;
        Q03 q03 = new Q03(fragment, userSession, this.A05, this.A06, r9);
        C267324bN r3 = this.A03;
        q03.A0O = r3.A06();
        AnonymousClass3W1 r2 = this.A07;
        q03.A0B = r2.getPosition();
        q03.A0K = r2;
        q03.A0h = this.A08;
        q03.A06 = this.A00;
        q03.A07 = this.A01;
        q03.A0n = this.A09;
        q03.A0o = this.A0A;
        1Xj r0 = r3.A02;
        if (r0 != null) {
            q03.A0J = r0;
        }
        C51969G9p.A1L(q03);
        AnonymousClass0fD.A0C(-1672440331, A052);
    }
}
