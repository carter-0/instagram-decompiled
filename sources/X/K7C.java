package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;

public final class K7C extends AnonymousClass4DH implements G9c {
    public static final String __redex_internal_original_name = "CameraFormatAttributionSheetFragment";
    public UserSession A00;
    public C306106Ku A01;
    public String A02;

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        CameraConfiguration A002;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context != null) {
            Resources resources = context.getResources();
            ImageView A0J = DbX.A0J(view, R.id.action_sheet_header_picture);
            TextView A0R = AnonymousClass7TG.A0R(view, R.id.action_sheet_header_text_view);
            TextView A0R2 = AnonymousClass7TG.A0R(view, R.id.action_sheet_subheader_text_view);
            View A0G = AnonymousClass7TF.A0G(view, R.id.action_sheet_row_text_view);
            C306106Ku r0 = this.A01;
            if (!(r0 == null || (A002 = r0.A00()) == null)) {
                if (this.A00 == null) {
                    DbS.A17();
                    throw AnonymousClass00P.createAndThrow();
                }
                int A003 = C347047wB.A00(A002);
                if (A003 >= 0) {
                    DbU.A13(context, A0J, A003);
                }
            }
            C306106Ku r02 = this.A01;
            if (r02 != null) {
                A0R.setText(new SpannableString(r02.A01(context)));
                A0R.setTypeface((Typeface) null, 1);
                A0R2.setText(0mp.A06(AnonymousClass7TF.A0d(resources, 2131953212), new Object[]{resources.getString(R.string.f0nameremoved)}));
                2eS.A01(A0G);
                C64273LXz.A00(A0G, 28, this);
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final Integer BkZ() {
        return AnonymousClass05K.A0N;
    }

    public final String getModuleName() {
        return C273654mx.A00(190);
    }

    public final AnonymousClass0wW getSession() {
        UserSession userSession = this.A00;
        if (userSession != null) {
            return userSession;
        }
        DbS.A17();
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1589620893);
        K7C.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = C306106Ku.A01.A00(requireArguments.getString("reel_capture_type"));
        this.A02 = requireArguments.getString("source_media_id");
        this.A00 = DbX.A0U(this);
        AnonymousClass0fD.A09(-1756885307, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1491928449);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.capture_format_attribution_sheet_fragment, viewGroup, false);
        AnonymousClass0fD.A09(2039865162, A022);
        return inflate;
    }
}
