package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.magicmediaremix.MagicMediaRemixContentCompositor;
import com.instagram.modal.TransparentBackgroundModalActivity;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.ui.primer.IconConfig;
import com.instagram.ui.primer.InfoItem;
import com.instagram.ui.primer.PrimerBottomSheetConfig;
import com.instagram.ui.primer.TitleIcon;
import java.util.List;
import java.util.concurrent.Executor;

public final class LBR {
    public RecyclerView A00;
    public AnonymousClass2t9 A01;
    public MagicMediaRemixContentCompositor A02;
    public JY0 A03;
    public boolean A04;
    public final Context A05;
    public final View A06;
    public final AnonymousClass4DH A07;
    public final UserSession A08;
    public final C64180LSl A09;
    public final C227422jG A0A;
    public final C70699OGu A0B;
    public final C39757A7x A0C;
    public final DirectThreadKey A0D;
    public final List A0E;
    public final AnonymousClass0eM A0F = AnonymousClass0eN.A01(C66258MKt.A00);
    public final AnonymousClass0eM A0G;

    public LBR(View view, AnonymousClass4DH r33, UserSession userSession, C64180LSl lSl, DirectThreadKey directThreadKey) {
        String str;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        this.A08 = userSession2;
        View view2 = view;
        this.A06 = view2;
        AnonymousClass4DH r2 = r33;
        this.A07 = r2;
        this.A0D = directThreadKey;
        C64180LSl lSl2 = lSl;
        this.A09 = lSl2;
        this.A05 = AnonymousClass7TE.A0S(view2);
        this.A0A = new C227422jG(userSession2);
        this.A0C = C395099zD.A00(userSession2);
        this.A0G = AnonymousClass0eN.A01(new C73918Ply(this, 10));
        this.A0B = new C70699OGu(view2);
        this.A0E = AnonymousClass7TE.A1C();
        if (!lSl2.A00 || !((1Av) this.A0G.getValue()).A1m()) {
            C70699OGu oGu = this.A0B;
            LYE.A00(AnonymousClass7TE.A0c(oGu.A05), 22, new C73918Ply(this, 9));
        } else {
            FragmentActivity requireActivity = r2.requireActivity();
            1Av r22 = lSl2.A03;
            if (!AnonymousClass7TG.A1a(r22, r22.A26, 1Av.A8a, 54)) {
                Context context = lSl2.A01;
                String A16 = AnonymousClass7TE.A16(context, 2131965664);
                IconConfig.SimpleIconConfig simpleIconConfig = new IconConfig.SimpleIconConfig(R.drawable.instagram_collage_pano_outline_24);
                Integer valueOf = Integer.valueOf(R.color.igds_primary_text);
                InfoItem[] infoItemArr = {new InfoItem(simpleIconConfig, valueOf, A16, (String) null), JTR.A0t(valueOf, C64180LSl.A00(lSl2, 2131965666).toString(), R.drawable.instagram_photo_pano_outline_24), JTR.A0t(valueOf, AnonymousClass7TE.A16(context, 2131965665), R.drawable.instagram_info_pano_outline_24)};
                0qQ.A0B(infoItemArr, 0);
                List A0I = 03t.A0I(infoItemArr);
                String A162 = AnonymousClass7TE.A16(context, 2131968772);
                Integer valueOf2 = Integer.valueOf(R.dimen.action_bar_item_spacing_left);
                Integer valueOf3 = Integer.valueOf(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
                Integer valueOf4 = Integer.valueOf(R.style.PrivacyTextStyle);
                String A002 = AnonymousClass000.A00(3537);
                PrimerBottomSheetConfig primerBottomSheetConfig = new PrimerBottomSheetConfig((TitleIcon) null, (Integer) null, (Integer) null, valueOf2, (Integer) null, valueOf3, valueOf3, valueOf4, A002, A162, "", (String) null, A0I, 2131965667, false, false, false);
                Bundle A0a = AnonymousClass7TE.A0a();
                A0a.putString(C66579MXk.A00(4), A002);
                A0a.putBoolean(C66579MXk.A00(14), true);
                A0a.putParcelable(AnonymousClass000.A00(3536), primerBottomSheetConfig);
                DbS.A0b(requireActivity, A0a, lSl2.A02, TransparentBackgroundModalActivity.class, "bottom_sheet").A0C(context);
                r22.A1O(true);
            }
            this.A00 = DbT.A0I(this.A06, R.id.magic_media_remix_recycler_view);
            Context context2 = this.A05;
            AnonymousClass2tC A003 = AnonymousClass2t9.A00(context2);
            UserSession userSession3 = this.A08;
            AnonymousClass4DH r4 = this.A07;
            this.A01 = DbU.A0U(A003, new NQ0(r4.requireActivity(), userSession3, this.A0D, new MIX(this, 8)));
            RecyclerView recyclerView = this.A00;
            if (recyclerView == null) {
                str = "recyclerView";
            } else {
                DbV.A1A(recyclerView.getContext(), recyclerView);
                AnonymousClass2t9 r0 = this.A01;
                if (r0 == null) {
                    str = "magicMediaRemixAdapter";
                } else {
                    recyclerView.setAdapter(r0);
                    Object obj = new Object();
                    AnonymousClass7TG.A1T(context2, userSession3, obj);
                    this.A03 = JTS.A0Q(context2, userSession3, obj);
                    ((Executor) AnonymousClass7TE.A14(this.A0F)).execute(new M7T(r4, this));
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        0tS A0h = DbT.A0h();
        if (AnonymousClass7TG.A1a(A0h, A0h.A2l, 0tS.A4G, 256)) {
            boolean z = this.A09.A00;
            AnonymousClass0eM r42 = this.A0G;
            boolean A1m = ((1Av) r42.getValue()).A1m();
            1Av r23 = (1Av) r42.getValue();
            0s0 r1 = r23.A5O;
            AnonymousClass0YZ[] r3 = 1Av.A8a;
            boolean A1a = AnonymousClass7TG.A1a(r23, r1, r3, 52);
            1Av r24 = (1Av) r42.getValue();
            boolean A1a2 = AnonymousClass7TG.A1a(r24, r24.A2V, r3, 53);
            1Av r25 = (1Av) r42.getValue();
            boolean A1a3 = AnonymousClass7TG.A1a(r25, r25.A26, r3, 54);
            1Av r26 = (1Av) r42.getValue();
            boolean A1a4 = AnonymousClass7TG.A1a(r26, r26.A3R, r3, 55);
            if (!z || !A1m || !A1a || !A1a2 || !A1a3 || !A1a4) {
                Context context3 = this.A05;
                String A163 = AnonymousClass7TE.A16(context3, 2131965680);
                StringBuilder A1A = AnonymousClass7TE.A1A();
                if (!z) {
                    A1A.append(context3.getString(2131965675));
                }
                if (!A1m) {
                    A1A.append(context3.getString(2131965677));
                }
                if (!A1a) {
                    A1A.append(context3.getString(2131965682));
                }
                if (!A1a2) {
                    A1A.append(context3.getString(2131965676));
                }
                if (!A1a3) {
                    A1A.append(context3.getString(2131965679));
                }
                if (!A1a4) {
                    A1A.append(context3.getString(2131965678));
                }
                String A10 = DbT.A10(A1A);
                LV2 A004 = LV2.A00(this, 13);
                C358248ab A0Y = DbS.A0Y(context3);
                A0Y.A05 = A163;
                A0Y.A0q(A10);
                A0Y.A0I(A004, 2131965681);
                A0Y.A0G(C64225LUp.A00, 2131956164);
                DbT.A1V(A0Y);
            }
        }
    }
}
