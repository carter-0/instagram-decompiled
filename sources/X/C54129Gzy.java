package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.util.ArrayDeque;

/* renamed from: X.Gzy  reason: case insensitive filesystem */
public final class C54129Gzy extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "SupportiveNudgeFragment";
    public JQO A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final AnonymousClass0eM A03;

    public final String getModuleName() {
        return "supportive_nudge_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        JQO jqo = this.A00;
        if (jqo != null) {
            jqo.BNA().Cys();
        }
        AnonymousClass0eM r1 = this.A03;
        C53003Ggu ggu = (C53003Ggu) r1.getValue();
        0wc r4 = ggu.A00;
        if (r4 != null) {
            boolean z = ggu.A05;
            boolean z2 = true;
            1Yp r0 = ggu.A01;
            if (z) {
                if (r0 != null) {
                    if (ggu.A02 != C335737dS.BOTTOMSHEET_MEDIA_CREATION_STORY) {
                        z2 = false;
                    }
                    1Yp.A03(r4, AnonymousClass05K.A01, z2);
                }
            } else if (r0 != null) {
                1Yp.A04(r4, AnonymousClass05K.A01, true);
            }
        }
        07U r5 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MHK((Object) viewLifecycleOwner, (Object) r5, (Object) this, (AnonymousClass4D7) null, 23), AnonymousClass07a.A00(viewLifecycleOwner));
        IgdsHeadline igdsHeadline = (IgdsHeadline) view.findViewById(R.id.media_creation_headline);
        Resources resources = igdsHeadline.getResources();
        igdsHeadline.setHeadline((CharSequence) resources.getString(2131972294));
        int i = 2131974506;
        if (((C53003Ggu) r1.getValue()).A05) {
            i = 2131965896;
        }
        igdsHeadline.setBody((CharSequence) resources.getString(i));
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) view.findViewById(R.id.media_creation_bottom_button);
        igdsBottomButtonLayout.setPrimaryAction(igdsBottomButtonLayout.getResources().getString(2131972290), ID1.A00(this, 52));
        C58175Inf inf = new C58175Inf(this, 32);
        getResources();
        SpannableStringBuilder A0E = C51965G9l.A0E();
        ArrayDeque arrayDeque = new ArrayDeque();
        A0E.append(getString(2131965898));
        GNT.A00(A0E, getString(2131956462), "[[community_guidelines]]", arrayDeque, new Object[]{new C54490HFw(inf, Dbb.A04(this), 3)}, 33);
        igdsBottomButtonLayout.setFooterText(new SpannableString(A0E));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public C54129Gzy() {
        0eO r3 = 0eO.A02;
        this.A01 = AnonymousClass0eN.A00(r3, new C58175Inf(this, 31));
        C58175Inf inf = new C58175Inf(this, 36);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r3, new C58175Inf(new C58175Inf(this, 33), 34));
        this.A03 = DbS.A0I(new C58175Inf(A002, 35), inf, new MJ6(27, (Object) null, A002), DbS.A0z(C53003Ggu.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1672087378);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_supportive_nudge_bottom_sheet, false);
        AnonymousClass0fD.A09(1679998693, A022);
        return A0D;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-352693768);
        super.onDestroy();
        JQO jqo = this.A00;
        if (jqo != null) {
            jqo.BNA().CyZ();
        }
        AnonymousClass0fD.A09(1549512650, A022);
    }
}
