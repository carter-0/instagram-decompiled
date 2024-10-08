package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class E16 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "RollCallNuxBottomSheetFragment";
    public View.OnClickListener A00;
    public View.OnClickListener A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);

    public final String getModuleName() {
        return "roll_call_nux";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1025590683);
        E16.super.onCreate(bundle);
        requireArguments();
        AnonymousClass0fD.A09(-919988587, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = AnonymousClass0fD.A02(-1192965833);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_rollcall_nux_bottomsheet, viewGroup, false);
        if (inflate != null) {
            Context context = getContext();
            if (context != null) {
                DbT.A1F(inflate, R.id.rollcall_nux_icon, 0);
                DbT.A18(context, DbU.A0G(inflate, R.id.rollcall_nux_header_text), 2131972438);
                DbT.A18(context, DbU.A0G(inflate, R.id.rollcall_nux_body_text), 2131972437);
                View.OnClickListener onClickListener = this.A00;
                if (onClickListener != null) {
                    AnonymousClass0fU.A00(onClickListener, AnonymousClass7TF.A0G(inflate, R.id.rollcall_nux_try_it_button));
                }
                View.OnClickListener onClickListener2 = this.A01;
                if (onClickListener2 != null) {
                    AnonymousClass0fU.A00(onClickListener2, AnonymousClass7TF.A0G(inflate, R.id.rollcall_nux_learn_more_button));
                }
                AnonymousClass0fD.A09(1666768178, A022);
                return inflate;
            }
            illegalStateException = AnonymousClass7TE.A0z("Cannot find context");
            i = 1279427548;
        } else {
            illegalStateException = AnonymousClass7TE.A0z("Root View Not initialized");
            i = -1329579458;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }
}
