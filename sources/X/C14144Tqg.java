package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.ui.widget.nestablescrollingview.NestableHorizontalRecyclerPager;
import com.instagram.ui.widget.nestablescrollingview.NestableRecyclerView;
import com.instagram.ui.widget.triangleshape.TriangleShape;
import com.instagram.util.recyclerview.LinearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1;

/* renamed from: X.Tqg  reason: case insensitive filesystem */
public final class C14144Tqg extends C249703kE {
    public UB0 A00;
    public final View A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final NestableHorizontalRecyclerPager A05;
    public final NestableRecyclerView A06;
    public 1wn onContactImportCardRemovalListener;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14144Tqg(Context context, View view, View view2, boolean z, boolean z2, boolean z3) {
        super(view);
        int id;
        0qQ.A0B(view, 2);
        ConstraintLayout constraintLayout = (ConstraintLayout) AnonymousClass7TF.A0F(view, R.id.similar_accounts_carousel_header);
        TriangleShape triangleShape = (TriangleShape) AnonymousClass7TF.A0F(view, R.id.similar_accounts_notch);
        if (view2 != null) {
            triangleShape.A00 = view2;
        } else {
            triangleShape.setVisibility(8);
        }
        TextView A0G = DbU.A0G(view, R.id.similar_accounts_carousel_title);
        this.A04 = A0G;
        ViewStub A0X = JTR.A0X(view, R.id.similar_accounts_carousel_cta);
        TextView A0G2 = DbU.A0G(view, R.id.similar_accounts_carousel_title_separator);
        this.A03 = A0G2;
        View A0H = JTP.A0H(A0X, R.layout.netego_carousel_text_cta);
        0qQ.A0C(A0H, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) A0H;
        this.A02 = textView;
        if (z) {
            if (z3) {
                id = A0G2.getId();
                A0G2.setVisibility(0);
            } else {
                id = A0G.getId();
            }
            C270354gb A0C = JTQ.A0C(constraintLayout);
            0nA.A0f(A0G, -2);
            A0C.A0C(textView.getId(), 6, id, 7);
            A0C.A08(textView.getId(), 0.0f);
            C270354gb.A02(A0C, id).A03.A0Y = 2;
            A0C.A0G(constraintLayout);
            this.A01 = JTP.A0H(JTR.A0X(view, R.id.similar_accounts_button_stub), R.layout.netego_carousel_dismiss_button);
        }
        NestableHorizontalRecyclerPager nestableHorizontalRecyclerPager = (NestableHorizontalRecyclerPager) view.requireViewById(R.id.similar_accounts_carousel_view);
        this.A05 = nestableHorizontalRecyclerPager;
        NestableRecyclerView nestableRecyclerView = (NestableRecyclerView) view.requireViewById(R.id.similar_accounts_carousel_recycler_view);
        this.A06 = nestableRecyclerView;
        int A032 = AnonymousClass7TG.A03(context);
        AnonymousClass3V7 r0 = new AnonymousClass3V7(A032, A032);
        if (z2) {
            nestableRecyclerView.setVisibility(0);
            nestableHorizontalRecyclerPager.setVisibility(8);
            nestableRecyclerView.setPassThroughToParentOverride(true);
            nestableRecyclerView.A11(r0);
            DbV.A1A(context, nestableRecyclerView);
            nestableRecyclerView.A00 = 0.7d;
            return;
        }
        nestableRecyclerView.setVisibility(8);
        nestableHorizontalRecyclerPager.setVisibility(0);
        nestableHorizontalRecyclerPager.A11(r0);
        nestableHorizontalRecyclerPager.A01 = C51972G9s.A08(context);
        LinearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1 linearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1 = new LinearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1(context, (Boolean) null);
        linearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1.A0v(true);
        nestableHorizontalRecyclerPager.setLayoutManager(linearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1);
    }
}
