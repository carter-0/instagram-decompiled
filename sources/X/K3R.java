package X;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

public final class K3R extends C61364K4g implements AnonymousClass0iw, C66388MPu {
    public static final String __redex_internal_original_name = "AvatarStickerPickerFragment";
    public C317866ny A00 = C317866ny.STORIES;
    public String A01 = "ig_stories_creation";
    public boolean A02;
    public String A03;
    public boolean A04;
    public final AnonymousClass0eM A05 = DbS.A0I(new MJ0(this, 41), new MJ0(this, 39), new MJ9(6, (Object) null, this), DbS.A0z(C60186Jh5.class));
    public final AnonymousClass0eM A06 = AnonymousClass1YB.A00(new MJ0(this, 40));
    public final AnonymousClass0eM A07 = C227642jf.A02(this);

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        DbT.A16(view.getContext(), view.findViewById(R.id.avatar_sticker_grid_container), R.color.fds_transparent);
        TextView A0d = AnonymousClass7TE.A0d(view, R.id.avatar_sticker_grid_empty_text_view);
        if (A0d != null) {
            DbT.A17(requireContext(), A0d, R.color.design_dark_default_color_on_background);
        }
        TextView A0d2 = AnonymousClass7TE.A0d(view, R.id.avatar_sticker_grid_editor_button);
        if (A0d2 != null) {
            DbT.A17(requireContext(), A0d2, R.color.design_dark_default_color_on_background);
        }
        ImageView A0G = DbS.A0G(view, R.id.avatar_sticker_grid_back_button);
        if (A0G != null) {
            DbU.A14(requireContext(), A0G, R.color.design_dark_default_color_on_background);
        }
        IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) view.findViewById(R.id.avatar_sticker_grid_search_box);
        if (igdsInlineSearchBox != null) {
            igdsInlineSearchBox.setTextColor(requireContext().getColor(R.color.design_dark_default_color_on_background));
            igdsInlineSearchBox.setClearButtonColor(JTQ.A03(this, R.color.design_dark_default_color_on_background));
            igdsInlineSearchBox.setSearchGlyphColor(JTQ.A03(this, R.color.design_dark_default_color_on_background));
            igdsInlineSearchBox.setHintColor(JTQ.A03(this, R.color.design_dark_default_color_on_background));
        }
        if (A0B().A0A) {
            07U r4 = 07U.A05;
            AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
            AnonymousClass7TE.A1Z(new MH4(r4, this, viewLifecycleOwner, (AnonymousClass4D7) null, 42), AnonymousClass07a.A00(viewLifecycleOwner));
            ((IgdsInlineSearchBox) view.findViewById(R.id.avatar_sticker_grid_search_box)).setHints(0sr.A1P(new String[]{requireContext().getString(2131953514), requireContext().getString(2131953460)}));
        }
        boolean z = this.A02;
        C60294Jir A0B = A0B();
        if (z) {
            str = "ig_stories_consumption";
        } else {
            str = "ig_stories_creation";
        }
        A0B.A06 = str;
        JTT.A0L(this).A00 = str;
    }

    public final String getModuleName() {
        String str = this.A03;
        if (str != null) {
            return str;
        }
        0qQ.A0F("previousModuleName");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0075, code lost:
        if (X.182.A06(X.0Tu.A05, X.AnonymousClass7TF.A0L(r7.A07, 0), 36321503335491016L) != false) goto L_0x0077;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            r0 = -423883018(0xffffffffe6bc0ef6, float:-4.4404044E23)
            int r4 = X.AnonymousClass0fD.A02(r0)
            X.K3R.super.onCreate(r8)
            android.os.Bundle r2 = r7.requireArguments()
            java.lang.String r0 = "args_previous_module_name"
            java.lang.String r0 = r2.getString(r0)
            if (r0 == 0) goto L_0x008d
            r7.A03 = r0
            java.lang.String r0 = "args_is_from_mentions_consumption_bottom_sheet"
            boolean r0 = r2.getBoolean(r0)
            r7.A02 = r0
            java.lang.String r0 = "args_is_in_story"
            boolean r0 = r2.getBoolean(r0)
            r7.A04 = r0
            X.Jir r1 = r7.A0B()
            java.lang.String r0 = "args_mentioned_user_ids"
            java.util.ArrayList r0 = r2.getStringArrayList(r0)
            r1.A08 = r0
            X.Jh5 r1 = X.JTT.A0L(r7)
            X.0eM r0 = r7.A06
            java.lang.String r5 = X.DbS.A0t(r0)
            r3 = 0
            X.0qQ.A0B(r5, r3)
            X.0eM r0 = r1.A02
            java.lang.Object r2 = r0.getValue()
            X.LGV r2 = (X.LGV) r2
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r2.A02(r1, r0, r5)
            r6 = 1
            r7.A0L = r6
            r7.A0N = r6
            r7.A0H = r6
            X.Jir r5 = r7.A0B()
            boolean r0 = r7.A04
            if (r0 == 0) goto L_0x008b
            boolean r0 = r7.A02
            if (r0 != 0) goto L_0x008b
            X.0eM r0 = r7.A07
            X.0lg r3 = X.AnonymousClass7TF.A0L(r0, r3)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321503335491016(0x810a37000525c8, double:3.0332031920946556E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x008b
        L_0x0077:
            r5.A0A = r6
            r0 = 4
            r7.A00 = r0
            X.Jir r0 = r7.A0B()
            boolean r0 = r0.A0A
            r7.A0I = r0
            r0 = 684983134(0x28d4035e, float:2.3538188E-14)
            X.AnonymousClass0fD.A09(r0, r4)
            return
        L_0x008b:
            r6 = 0
            goto L_0x0077
        L_0x008d:
            java.lang.String r0 = "previous module required"
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r0)
            r0 = 35793470(0x2222a3e, float:1.1914003E-37)
            X.AnonymousClass0fD.A09(r0, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K3R.onCreate(android.os.Bundle):void");
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(19862782);
        super.onDestroyView();
        C60186Jh5 A0L = JTT.A0L(this);
        String A0t = DbS.A0t(this.A06);
        String str = A0B().A05;
        0qQ.A0B(A0t, 0);
        ((LGV) A0L.A02.getValue()).A03(A0t, str);
        AnonymousClass0fD.A09(-1284983154, A022);
    }
}
