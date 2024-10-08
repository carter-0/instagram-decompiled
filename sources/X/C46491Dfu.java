package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;

/* renamed from: X.Dfu  reason: case insensitive filesystem */
public final class C46491Dfu extends C232222tE {
    public String A00 = "inbox_recent";
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C294875nB A03;

    public C46491Dfu(AnonymousClass0iw r3, UserSession userSession, C294875nB r5) {
        AnonymousClass7TG.A1O(userSession, r5);
        0qQ.A0B(r3, 4);
        this.A02 = userSession;
        this.A03 = r5;
        this.A01 = r3;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r26, C249703kE r27) {
        String str;
        FYE fye = (FYE) r26;
        C46987Dof dof = (C46987Dof) r27;
        if (fye != null) {
            DirectShareTarget directShareTarget = fye.A02;
            int i = fye.A01;
            Integer valueOf = Integer.valueOf(i);
            String A08 = directShareTarget.A08();
            if ((A08 != null || (A08 = directShareTarget.A09()) != null) && valueOf != null && dof != null) {
                ArrayList A0B = directShareTarget.A0B();
                dof.getBindingAdapterPosition();
                C67058MhZ mhZ = new C67058MhZ(i, A08, (String) null, A0B);
                if (directShareTarget.A0Q()) {
                    str = AnonymousClass000.A00(1445);
                } else {
                    str = this.A00;
                }
                this.A00 = str;
                UserSession userSession = this.A02;
                AnonymousClass0iw r7 = this.A01;
                C294875nB r15 = this.A03;
                0qQ.A0B(userSession, 7);
                AnonymousClass7TF.A1G(r7, 8, r15);
                0qQ.A0B(str, 10);
                ViewGroup viewGroup = dof.A00;
                Context context = viewGroup.getContext();
                String A032 = AnonymousClass50n.A03(directShareTarget, AnonymousClass7TF.A0Q(userSession));
                0qQ.A07(A032);
                IgTextView igTextView = dof.A02;
                C46334Dcc.A00(igTextView, (C61066Jw4) null, A032, directShareTarget.A0V());
                if (directShareTarget.A0F()) {
                    IgTextView igTextView2 = dof.A01;
                    igTextView2.setVisibility(0);
                    Resources resources = context.getResources();
                    AnonymousClass9B9.A00();
                    igTextView2.setText(DbS.A0C(AnonymousClass7TF.A0d(resources, 2131960272)));
                } else {
                    boolean A04 = AnonymousClass48O.A04(directShareTarget.A01);
                    IgTextView igTextView3 = dof.A01;
                    if (A04) {
                        igTextView3.setVisibility(0);
                        igTextView3.setText(DbS.A0C(AnonymousClass7TF.A0d(context.getResources(), 2131959561)));
                    } else {
                        igTextView3.setVisibility(8);
                    }
                }
                0qQ.A0A(context);
                C69994NvY.A00(context, r7, userSession, (C294875nB) null, dof.A03, directShareTarget, false, false);
                C67058MhZ mhZ2 = mhZ;
                int i2 = i;
                int i3 = i;
                AnonymousClass0fU.A00(new FOG(mhZ2, r15, directShareTarget, str, i2, i3), viewGroup);
                viewGroup.setAlpha(1.0f);
                viewGroup.setBackgroundResource(R.drawable.bg_simple_row);
                igTextView.getViewTreeObserver().addOnGlobalLayoutListener(new WCB(4, directShareTarget, dof));
                View view = dof.itemView;
                0qQ.A06(view);
                View view2 = view;
                r15.DpB(view2, mhZ2, directShareTarget, str, 7, i2, i3, 0, false);
            }
        }
    }

    public final Class modelClass() {
        return FYE.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.direct_inbox_search_horizontal_row_layout);
        if (A0C != null) {
            return new C46987Dof(A0C);
        }
        return null;
    }
}
