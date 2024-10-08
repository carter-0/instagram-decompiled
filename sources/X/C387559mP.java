package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;

/* renamed from: X.9mP  reason: invalid class name and case insensitive filesystem */
public final class C387559mP extends AA8 implements 1wn {
    public int A00;
    public List A01 = AnonymousClass7TE.A1C();
    public boolean A02;
    public final Context A03;
    public final View A04;
    public final UserSession A05;
    public final AnonymousClass87H A06;
    public final String A07;

    public static void A00(AnonymousClass57C r6, C387559mP r7, C19476WaO waO) {
        AnonymousClass87H r5 = r7.A06;
        r5.A0A(new C389629pw(r7.A03, r7.A05, waO, r7.A07), r6, C317876nz.A0f);
        if (r7.A02) {
            AnonymousClass8S4 r2 = r5.A00.A01;
            r2.A08.A0u(new AWF(r2, false));
        }
    }

    public C387559mP(Context context, View view, UserSession userSession, AnonymousClass87H r5, String str) {
        this.A06 = r5;
        this.A03 = context;
        this.A05 = userSession;
        this.A04 = view;
        this.A07 = str;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        C3509887d r0;
        int A032 = AnonymousClass0fD.A03(-1049480700);
        int A033 = AnonymousClass0fD.A03(1253385775);
        C3509386y r5 = this.A06.A00;
        AnonymousClass876 r2 = r5.A0H;
        int intValue = Integer.valueOf(r2.A01).intValue();
        List unmodifiableList = Collections.unmodifiableList(r2.A08);
        0qQ.A07(unmodifiableList);
        r5.A00 = (AnonymousClass87G) unmodifiableList.get(intValue);
        r5.A02 = false;
        if (r5 instanceof AnonymousClass872) {
            r0 = ((AnonymousClass872) r5).A01;
        } else {
            r0 = ((C3509286x) r5).A00;
        }
        r0.A04(false);
        r5.A0F.A01(this);
        AnonymousClass0fD.A0A(-1705166964, A033);
        AnonymousClass0fD.A0A(1354290975, A032);
    }
}
