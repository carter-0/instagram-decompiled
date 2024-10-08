package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.Qcz  reason: case insensitive filesystem */
public final class C7928Qcz extends C7919Qcq {
    public FrameLayout A00;
    public List A01;
    public View A02;
    public C7935QdG A03;
    public boolean A04;

    public final void onViewCreated(View view, Bundle bundle) {
        Drawable drawable;
        0qQ.A0B(view, 0);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A04 = bundle2.getBoolean("is_cancel_confirmation_action_sheet_enabled");
        }
        ImageView A012 = SKW.A01(view, R.id.iv_back_button);
        if (this.A00 != null) {
            drawable = requireContext().getDrawable(R.drawable.instagram_arrow_left_pano_outline_24);
        } else {
            drawable = null;
        }
        A012.setImageDrawable(drawable);
        C11497SbK.A01(A012, 46, this);
        C11497SbK.A01(SKW.A00(view, R.id.btn_submit), 47, this);
        if (this.A04) {
            this.A02 = view;
            this.A00 = (FrameLayout) SKW.A00(view, R.id.sc_action_sheet_container);
            this.A01 = AnonymousClass7TE.A1C();
            View A002 = SKW.A00(view, R.id.iv_cancel_button);
            A002.setVisibility(0);
            C11497SbK.A01(A002, 49, this);
            C11497SbK.A01(A012, 51, this);
        }
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [X.QdG, android.view.View, X.Q9n, android.view.ViewGroup] */
    public static final void A00(View.OnClickListener onClickListener, C7928Qcz qcz) {
        FragmentActivity activity = qcz.getActivity();
        if (activity != null) {
            View view = qcz.A02;
            if (view instanceof ViewGroup) {
                0qQ.A0C(view, AnonymousClass000.A00(5));
                ViewGroup viewGroup = (ViewGroup) view;
                List list = qcz.A01;
                0qQ.A0A(list);
                list.clear();
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt.getVisibility() == 0) {
                        childAt.setVisibility(8);
                        List list2 = qcz.A01;
                        0qQ.A0A(list2);
                        list2.add(childAt);
                    }
                }
                if (qcz.A03 == null) {
                    ? q9n = new C7376Q9n(activity);
                    Context context = q9n.getContext();
                    LayoutInflater.from(context).inflate(R.layout.xmds_cancel_action_sheet_view, q9n, true);
                    0qQ.A07(context);
                    q9n.A00(context);
                    qcz.A03 = q9n;
                    q9n.setTitleText(DbU.A0m(qcz, 2131972657));
                    C7935QdG qdG = qcz.A03;
                    0qQ.A0A(qdG);
                    qdG.setSubtitleText(DbU.A0m(qcz, 2131972656));
                    C7935QdG qdG2 = qcz.A03;
                    0qQ.A0A(qdG2);
                    qdG2.setupDestructiveButton(DbU.A0m(qcz, 2131972655), onClickListener);
                }
                C7935QdG qdG3 = qcz.A03;
                0qQ.A0A(qdG3);
                Q9N q9n2 = new Q9N(activity, qdG3, C11408SSf.A01(activity, R.attr.sc_popover_shadow), false);
                C7935QdG qdG4 = qcz.A03;
                0qQ.A0A(qdG4);
                qdG4.setupCancelButton(DbU.A0m(qcz, 2131972654), new C11497SbK(q9n2, 52));
                FrameLayout frameLayout = qcz.A00;
                0qQ.A0A(frameLayout);
                frameLayout.addView(q9n2);
                q9n2.A00 = new C11497SbK(qcz, 53);
                FrameLayout frameLayout2 = qcz.A00;
                0qQ.A0A(frameLayout2);
                frameLayout2.setVisibility(0);
                q9n2.A01();
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-366565908);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.xmds_selfie_review_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-1073349018, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1138933569);
        this.A00 = null;
        this.A02 = null;
        this.A01 = null;
        this.A03 = null;
        C7928Qcz.super.onDestroyView();
        AnonymousClass0fD.A09(-228358260, A022);
    }
}
