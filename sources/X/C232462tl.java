package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.2tl  reason: invalid class name and case insensitive filesystem */
public final class C232462tl extends C231632rz implements CallerContextable {
    public static final String __redex_internal_original_name = "FeedEmptyStateBinderGroup";
    public final Context A00;
    public final UserSession A01;
    public final C230772qF A02;

    public C232462tl(Context context, UserSession userSession, C230772qF r4) {
        0qQ.A0B(context, 1);
        0qQ.A0B(r4, 3);
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = r4;
    }

    public final String getBinderGroupName() {
        return "FeedEmptyState";
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        if (r2 != null) {
            r2.A7U(0);
        }
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        C3253572b r4;
        C322776wO ia8;
        int A03 = AnonymousClass0fD.A03(1620831938);
        0qQ.A0B(view, 1);
        0qQ.A0B(obj2, 3);
        Object tag = view.getTag();
        0qQ.A0C(tag, C66579MXk.A00(1004));
        AnonymousClass730 r3 = (AnonymousClass730) tag;
        int ordinal = ((C54620HLd) obj2).ordinal();
        if (ordinal != 2) {
            Resources resources = this.A00.getResources();
            if (ordinal != 1) {
                r4.A02 = R.drawable.nux_main_feed_empty_icon;
                r4.A0D = resources.getString(2131968722);
                r4.A07 = resources.getString(2131968720);
                int i2 = 2131962456;
                if (2Lv.A00(this.A01).A00(CallerContext.A00(C232462tl.class), "ig_feed_empty_state_binder_group")) {
                    i2 = 2131962467;
                }
                r4.A0C = resources.getString(i2);
                r4.A0Q = true;
                ia8 = new C57403Ia9(this);
            } else {
                r4 = new C3253572b();
                r4.A02 = R.drawable.instagram_star_outline_96;
                r4.A0D = resources.getString(2131968717);
                r4.A07 = resources.getString(2131968716);
                r4.A0C = resources.getString(2131968715);
                r4.A0Q = true;
                ia8 = new C57402Ia8(this);
            }
            r4.A06 = ia8;
        } else {
            r4 = new C3253572b();
            r4.A02 = R.drawable.instagram_crown_outline_96;
            Context context = this.A00;
            r4.A0D = context.getString(2131968714);
            r4.A07 = context.getString(2131968713);
            r4.A0Q = false;
        }
        C3254972u.A02(r4, r3, C320156rr.EMPTY);
        AnonymousClass0fD.A0A(-1889829630, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(1413549166);
        0qQ.A0B(viewGroup, 1);
        View A002 = C3254972u.A00(this.A00, viewGroup);
        AnonymousClass0fD.A0A(2005656408, A03);
        return A002;
    }
}
