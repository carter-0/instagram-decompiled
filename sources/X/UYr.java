package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;

public final class UYr extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "PromoteCreativeOptimizationBottomSheetFragment";
    public WGU A00;
    public boolean A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);

    public final String getModuleName() {
        return C66579MXk.A00(1050);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        SpannableStringBuilder spannableStringBuilder;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView A0d = AnonymousClass7TE.A0d(view, R.id.title);
        String str9 = null;
        if (A0d != null) {
            A0d.setVisibility(0);
            FragmentActivity activity = getActivity();
            if (activity != null) {
                str8 = activity.getString(2131970657);
            } else {
                str8 = null;
            }
            A0d.setText(str8);
        }
        TextView A0d2 = AnonymousClass7TE.A0d(view, R.id.body);
        if (A0d2 != null) {
            A0d2.setGravity(8388611);
            A0d2.setVisibility(0);
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                str7 = activity2.getString(2131970656);
            } else {
                str7 = null;
            }
            A0d2.setText(str7);
        }
        TextView A0d3 = AnonymousClass7TE.A0d(view, R.id.body_1);
        if (A0d3 != null) {
            A0d3.setVisibility(0);
            FragmentActivity activity3 = getActivity();
            if (activity3 != null) {
                str6 = activity3.getString(2131970650);
            } else {
                str6 = null;
            }
            A0d3.setText(str6);
        }
        TextView A0d4 = AnonymousClass7TE.A0d(view, R.id.body_2);
        if (A0d4 != null) {
            A0d4.setVisibility(0);
            FragmentActivity activity4 = getActivity();
            if (activity4 != null) {
                str5 = activity4.getString(2131970651);
            } else {
                str5 = null;
            }
            A0d4.setText(str5);
        }
        TextView A0d5 = AnonymousClass7TE.A0d(view, R.id.body_3);
        if (A0d5 != null) {
            A0d5.setVisibility(0);
            FragmentActivity activity5 = getActivity();
            if (activity5 != null) {
                str4 = activity5.getString(2131970652);
            } else {
                str4 = null;
            }
            A0d5.setText(str4);
        }
        TextView A0d6 = AnonymousClass7TE.A0d(view, R.id.body_4);
        if (A0d6 != null) {
            A0d6.setVisibility(0);
            FragmentActivity activity6 = getActivity();
            if (activity6 != null) {
                str3 = activity6.getString(2131970653);
            } else {
                str3 = null;
            }
            A0d6.setText(str3);
        }
        TextView A0d7 = AnonymousClass7TE.A0d(view, R.id.body_5);
        if (A0d7 != null) {
            A0d7.setVisibility(0);
            FragmentActivity activity7 = getActivity();
            if (activity7 != null) {
                str2 = activity7.getString(2131970654);
            } else {
                str2 = null;
            }
            A0d7.setText(str2);
        }
        TextView A0d8 = AnonymousClass7TE.A0d(view, R.id.body_6);
        if (A0d8 != null) {
            if (182.A06(0Tu.A05, AnonymousClass7TF.A0L(this.A02, 0), 36329496269308061L)) {
                A0d8.setVisibility(0);
                FragmentActivity activity8 = getActivity();
                if (activity8 != null) {
                    String A16 = AnonymousClass7TE.A16(activity8, 2131972999);
                    spannableStringBuilder = AnonymousClass7AV.A00(DbT.A09(SQU.A01(activity8, C66579MXk.A00(881))), A16, DbY.A0c(activity8, A16, 2131970655));
                } else {
                    spannableStringBuilder = null;
                }
                A0d8.setText(spannableStringBuilder);
                C71403Ok2.A01(A0d8, 18, this);
            } else {
                A0d8.setVisibility(8);
            }
        }
        TextView A0d9 = AnonymousClass7TE.A0d(view, R.id.body_7);
        if (A0d9 != null) {
            A0d9.setVisibility(0);
            FragmentActivity activity9 = getActivity();
            if (activity9 != null) {
                str = activity9.getString(2131970649);
            } else {
                str = null;
            }
            A0d9.setText(str);
        }
        TextView A0d10 = AnonymousClass7TE.A0d(view, R.id.text_link);
        if (A0d10 != null) {
            A0d10.setVisibility(0);
            FragmentActivity activity10 = getActivity();
            if (activity10 != null) {
                str9 = activity10.getString(2131970647);
            }
            A0d10.setText(str9);
            C71403Ok2.A01(A0d10, 17, this);
        }
        WGU wgu = this.A00;
        if (wgu == null) {
            0qQ.A0F("promoteLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        wgu.A0H(C16678UzE.AD_PREVIEW, "automatic_creative_optimization_bottom_sheet");
        if (this.A01) {
            View A0G = AnonymousClass7TF.A0G(view, R.id.back_button);
            A0G.setVisibility(0);
            C71403Ok2.A01(A0G, 19, this);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        int A022 = AnonymousClass0fD.A02(-133802609);
        UYr.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            z = bundle2.getBoolean("enable_back_button");
        } else {
            z = false;
        }
        this.A01 = z;
        this.A00 = JTU.A0D(this.A02);
        AnonymousClass0fD.A09(-89075285, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1080462415);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_title_body_bottom_sheet_view, viewGroup, false);
        AnonymousClass0fD.A09(1443337030, A022);
        return inflate;
    }
}
