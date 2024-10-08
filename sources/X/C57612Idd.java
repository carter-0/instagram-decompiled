package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.save.api.SaveApiUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Idd  reason: case insensitive filesystem */
public final class C57612Idd implements C59615JQj {
    public final /* synthetic */ H18 A00;

    public final void D3k(C53152GjO gjO, String str) {
        String str2;
        Long l;
        H18 h18 = this.A00;
        ((C52967GgK) h18.A0D.getValue()).A0G(gjO);
        0lg A0X = DbT.A0X(h18.A0M);
        1Xj r0 = gjO.A00;
        if (r0 != null) {
            str2 = r0.A2n();
        } else {
            str2 = null;
        }
        int bindingAdapterPosition = gjO.getBindingAdapterPosition();
        0Aj A0e = AnonymousClass7TE.A0e(DbT.A0Q(h18, A0X, 0), "instagram_organic_creator_inspiration_hub_reels_preview");
        try {
            if (A0e.isSampled()) {
                C51965G9l.A1M(A0e, "creator_inspiration_hub_reels");
                if (str2 != null) {
                    l = AnonymousClass7TE.A10(str2);
                } else {
                    l = null;
                }
                C51965G9l.A1E(A0e, l);
                C51970G9q.A19(A0e, (long) bindingAdapterPosition);
                DbY.A1C(A0e);
                A0e.AAJ("section_type", str);
                A0e.AAJ("tab_type", "clips");
                A0e.Cgf();
            }
        } catch (NumberFormatException unused) {
        }
    }

    public final void D3l(1Xj r11, C55673HlW hlW, List list, int i) {
        String str;
        Long l;
        AnonymousClass7TF.A1B(r11, 0, hlW);
        H18 h18 = this.A00;
        AnonymousClass0eM r4 = h18.A0M;
        C270634h3 A0V = C51975G9x.A0V(ClipsViewerSource.CREATOR_INSPIRATION_HUB, AnonymousClass7TE.A0l(r4), r11);
        A0V.A0n = hlW.A01;
        A0V.A1c = false;
        A0V.A0p = "creator_inspiration_hub_reels";
        if (182.A06(0Tu.A05, DbT.A0X(r4), 36323972941622925L)) {
            str = hlW.A00;
            h18.A03 = str;
            A0V.A1F = str;
        } else {
            ArrayList A0r = AnonymousClass7TG.A0r(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                1Xj A0t = C51966G9m.A0t(it);
                if (A0t != null) {
                    DbX.A0d(r4).A03(A0t);
                    String id = A0t.getId();
                    if (id != null) {
                        A0r.add(id);
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
            DbX.A0d(r4).A03(r11);
            ImmutableList.Builder builder = new ImmutableList.Builder();
            builder.addAll(A0r);
            A0V.A0B = builder.build();
            Map map = h18.A0A;
            str = hlW.A00;
            A0V.A0i = DbT.A11(str, map);
        }
        C243473Yx.A06(h18.requireActivity(), A0V.A00(), AnonymousClass7TE.A0l(r4), 201);
        0lg A0X = DbT.A0X(r4);
        String A2n = r11.A2n();
        0Aj A0e = AnonymousClass7TE.A0e(DbT.A0Q(h18, A0X, 0), "instagram_organic_creator_inspiration_hub_reels_tap");
        try {
            if (A0e.isSampled()) {
                C51965G9l.A1C(C54689HOu.A0L, A0e);
                C51973G9u.A14(A0e, "containermodule", "creator_inspiration_hub_reels");
                if (A2n != null) {
                    l = AnonymousClass7TE.A10(A2n);
                } else {
                    l = null;
                }
                C51965G9l.A1E(A0e, l);
                A0e.AAJ("section_type", str);
                A0e.AAJ("tab_type", "clips");
                C51970G9q.A19(A0e, (long) i);
                A0e.Cgf();
            }
        } catch (NumberFormatException unused) {
        }
    }

    public final void D3m(C267324bN r20, IgSimpleImageView igSimpleImageView, IgImageView igImageView, 1Xj r23) {
        C243373Ym r11;
        int i;
        IgSimpleImageView igSimpleImageView2 = igSimpleImageView;
        0qQ.A0B(igSimpleImageView2, 2);
        H18 h18 = this.A00;
        C53015Gh6 A0q = C51968G9o.A0q(h18);
        Context requireContext = h18.requireContext();
        FragmentActivity requireActivity = h18.requireActivity();
        UserSession A0l = AnonymousClass7TE.A0l(h18.A0M);
        boolean A1Z = DbW.A1Z(A0l);
        A0q.A01 = igSimpleImageView2;
        1Xj r7 = r23;
        if (!SaveApiUtil.A09(A0l, r7)) {
            r11 = C243373Ym.SAVED;
        } else {
            r11 = C243373Ym.NOT_SAVED;
        }
        r7.EjB(r11);
        1E7.A00(A0l).A01(r7, A1Z, false);
        C243373Ym r3 = C243373Ym.SAVED;
        if (r11 == r3) {
            DbU.A13(requireContext, igSimpleImageView2, R.drawable.instagram_save_pano_filled_24);
            i = 2131975054;
        } else {
            DbU.A13(requireContext, igSimpleImageView2, R.drawable.instagram_save_pano_outline_24);
            i = 2131975048;
        }
        DbU.A12(requireContext, igSimpleImageView2, i);
        AnonymousClass7TE.A1Z(new MGO(A0l, r7, h18, requireActivity, requireContext, r11, (AnonymousClass4D7) null, 10), C318116oQ.A00(A0q));
        if (r11 == r3) {
            C55115HcO.A00().A06(requireActivity, A0l, r7, h18, new AnonymousClass3W1(), new HFQ(), 0, A1Z);
        }
    }

    public C57612Idd(H18 h18) {
        this.A00 = h18;
    }

    public final void D3n(C53152GjO gjO) {
        this.A00.A0D.getValue();
        C57462Ib6 ib6 = gjO.A01;
        if (ib6 != null) {
            ib6.A00();
        }
        gjO.A01 = null;
    }
}
