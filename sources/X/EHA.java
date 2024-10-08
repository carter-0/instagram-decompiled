package X;

import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;

public final class EHA extends C232232tF {
    public final Fragment A00;
    public final UserSession A01;
    public final C49729F3u A02;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C46905DnL(new IgdsPeopleCell(AnonymousClass7TE.A0S(viewGroup), (AttributeSet) null, 0, false));
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r13, X.C249703kE r14) {
        /*
            r12 = this;
            X.FYI r13 = (X.FYI) r13
            X.DnL r14 = (X.C46905DnL) r14
            X.AnonymousClass7TG.A1N(r13, r14)
            com.instagram.user.model.User r5 = r13.A01
            java.lang.String r11 = r13.A02
            boolean r1 = r13.A04
            boolean r6 = r13.A00
            boolean r4 = r13.A03
            androidx.fragment.app.Fragment r10 = r12.A00
            com.instagram.common.session.UserSession r9 = r12.A01
            X.F3u r3 = r12.A02
            r7 = 0
            X.AnonymousClass7TG.A1S(r10, r9)
            r0 = 7
            X.0qQ.A0B(r3, r0)
            com.instagram.igds.components.peoplecell.IgdsPeopleCell r2 = r14.A00
            r2.A01()
            r8 = 0
            if (r1 == 0) goto L_0x0072
            java.lang.String r0 = r5.getUsername()
            r2.A08(r0, r7)
            java.lang.String r0 = r5.getFullName()
        L_0x0032:
            r2.A07(r0)
        L_0x0035:
            r2.A06(r11)
            X.Exl r1 = new X.Exl
            r1.<init>(r10, r5)
            X.FOi r0 = X.C50093FOi.A00
            r1.A00 = r0
            r2.A03(r9, r1, r5)
            android.content.Context r0 = r10.requireContext()
            X.ELj r1 = new X.ELj
            r1.<init>(r0)
            r0 = 2131100175(0x7f06020f, float:1.7812724E38)
            r1.setButtonDrawable(r0)
            r0 = 2131231306(0x7f08024a, float:1.807869E38)
            r1.setBackgroundResource(r0)
            r1.setClickable(r7)
            r1.setChecked(r6)
            r2.A05(r1, r8)
            r0 = 34
            X.FPE.A01(r2, r0, r3, r5)
            r0 = 1050253722(0x3e99999a, float:0.3)
            if (r4 == 0) goto L_0x006e
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x006e:
            r2.setAlpha(r0)
            return
        L_0x0072:
            java.lang.String r1 = r5.B8Q()
            r2.A08(r1, r7)
            java.lang.String r0 = r5.getUsername()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0035
            java.lang.String r0 = r5.getUsername()
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EHA.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return FYI.class;
    }

    public EHA(Fragment fragment, UserSession userSession, C49729F3u f3u) {
        AnonymousClass7TG.A1Q(userSession, f3u);
        this.A00 = fragment;
        this.A01 = userSession;
        this.A02 = f3u;
    }
}
