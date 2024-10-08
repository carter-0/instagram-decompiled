package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.ICi  reason: case insensitive filesystem */
public final class C56785ICi implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;

    public C56785ICi(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, int i) {
        this.A00 = i;
        this.A07 = obj;
        this.A06 = obj2;
        this.A05 = obj4;
        this.A01 = obj5;
        this.A03 = obj3;
        this.A02 = obj9;
        this.A04 = obj10;
        this.A08 = obj7;
        this.A09 = obj8;
        this.A0A = obj6;
    }

    public final void onClick(View view) {
        int A052;
        int i;
        String AnX;
        switch (this.A00) {
            case 0:
                A052 = AnonymousClass0fD.A05(1277097328);
                FragmentActivity fragmentActivity = (FragmentActivity) this.A01;
                N4P n4p = (N4P) this.A08;
                0wc r6 = (0wc) this.A09;
                OZ2.A00.A01((Context) this.A03, fragmentActivity, (AnonymousClass07i) this.A05, (AnonymousClass0iw) this.A02, r6, (UserSession) this.A0A, (C66965Mfy) this.A04, n4p, (C68303N9q) this.A06, (G87) this.A07);
                i = 930120343;
                break;
            case 1:
                int A053 = AnonymousClass0fD.A05(-372956992);
                C275524qU r7 = (C275524qU) this.A05;
                JR4 jr4 = (JR4) this.A03;
                C230662pz r10 = (C230662pz) this.A02;
                Integer num = (Integer) this.A04;
                1Xj r9 = (1Xj) this.A08;
                C56653I6i.A02((Context) this.A07, (Drawable) this.A06, jr4, r7, (C53278GlQ) this.A01, r9, r10, num);
                AnonymousClass3W1 r2 = (AnonymousClass3W1) this.A09;
                ((AnonymousClass2rI) r10.A02.getAdapter()).A09();
                String AnX2 = r7.AnX();
                if (AnX2 != null) {
                    jr4.Ck7(AnX2);
                    C56653I6i.A04((UserSession) this.A0A, r9, r2, num, r7.AnX());
                    AnonymousClass0fD.A0C(1042227281, A053);
                    return;
                }
                IllegalStateException A0y = AnonymousClass7TE.A0y();
                AnonymousClass0fD.A0C(115820976, A053);
                throw A0y;
            default:
                A052 = AnonymousClass0fD.A05(815268304);
                C275524qU r5 = (C275524qU) this.A05;
                JR4 jr42 = (JR4) this.A03;
                C230662pz r8 = (C230662pz) this.A02;
                Integer num2 = (Integer) this.A04;
                1Xj r72 = (1Xj) this.A08;
                C56653I6i.A02((Context) this.A07, (Drawable) this.A06, jr42, r5, (C53278GlQ) this.A01, r72, r8, num2);
                AnonymousClass3W1 r3 = (AnonymousClass3W1) this.A09;
                ((AnonymousClass2rI) r8.A02.getAdapter()).A09();
                if (r5 != null && (AnX = r5.AnX()) != null) {
                    jr42.Ck7(AnX);
                    C56653I6i.A04((UserSession) this.A0A, r72, r3, num2, r5.AnX());
                    i = -1057409015;
                    break;
                } else {
                    IllegalStateException A0y2 = AnonymousClass7TE.A0y();
                    AnonymousClass0fD.A0C(-1322698587, A052);
                    throw A0y2;
                }
        }
        AnonymousClass0fD.A0C(i, A052);
    }
}
