package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.ClipsTemplateBrowserV2Type;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ide  reason: case insensitive filesystem */
public final class C57613Ide implements C59615JQj {
    public final /* synthetic */ H1I A00;

    public final void D3l(1Xj r21, C55673HlW hlW, List list, int i) {
        long parseLong;
        293 r3;
        293 r8;
        int i2;
        28D r14;
        293 r15;
        List BrX;
        C279484yi Ad4;
        String templateMediaId;
        Long A10;
        1Xj r2 = r21;
        0qQ.A0B(r2, 0);
        H1I h1i = this.A00;
        String A002 = h1i.A00(r2);
        AnonymousClass0eM r5 = h1i.A0I;
        27r A0g = C51971G9r.A0g(r5);
        r5.getValue();
        C270564gw A1P = r2.A1P();
        if (A1P == null || (Ad4 = A1P.Ad4()) == null || (templateMediaId = Ad4.getTemplateMediaId()) == null || (A10 = AnonymousClass7TE.A10(templateMediaId)) == null) {
            String A30 = r2.A30();
            if (A30 != null) {
                parseLong = Long.parseLong(A30);
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else {
            parseLong = A10.longValue();
        }
        A0g.A04.A0H = Long.valueOf(parseLong);
        27r A0g2 = C51971G9r.A0g(r5);
        293 serializable = h1i.requireArguments().getSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        if (serializable == null) {
            r3 = 293.A06;
        } else {
            r3 = serializable;
        }
        A0g2.A04.A0D = r3;
        C51971G9r.A0g(r5).A04.A0V = A002;
        27r A0g3 = C51971G9r.A0g(r5);
        String A302 = r2.A30();
        if (A302 != null) {
            293 serializable2 = h1i.requireArguments().getSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            if (serializable2 == null) {
                r8 = 293.A06;
            } else {
                r8 = serializable2;
            }
            29R r11 = A0g3.A09;
            0qQ.A0B(r8, 1);
            1Ln A08 = 1Ln.A08(r11.A01);
            AnonymousClass283 r9 = r11.A04;
            C59725JVj jVj = r9.A0C;
            if (!(!DbT.A1Y(A08) || r11.A0J() == null || jVj == null)) {
                A08.A0t("IG_CAMERA_ENTITY_TAP");
                A08.A0r("TEMPLATE_MEDIA_TAP");
                29R.A00(A08, r11);
                A08.A0a(C279294yP.CLIPS);
                A08.A0b(r9.A09);
                A08.A0T();
                A08.A0d(jVj);
                A08.A0n(27x.A08.getModuleName());
                A08.A0Q(AnonymousClass000.A00(1179), AnonymousClass7TE.A10(A302));
                A08.A0M(r8, AnonymousClass000.A00(1878));
                A08.A0R("template_browser_view", "UNKNOWN");
                A08.A0R(AnonymousClass000.A00(4092), A002);
                A08.Cgf();
            }
            h1i.A02 = new 2YN(C351878Au.A00(h1i.requireActivity(), AnonymousClass7TE.A0l(r5)), h1i.requireActivity()).A00(C3511387s.class);
            r5.getValue();
            C270564gw A1P2 = r2.A1P();
            if (A1P2 == null || (BrX = A1P2.BrX()) == null) {
                i2 = 0;
            } else {
                i2 = BrX.size();
            }
            if (C51971G9r.A0g(r5).A04.A09 != 28D.A5J) {
                C3511387s r32 = h1i.A02;
                if (r32 != null) {
                    r32.A02 = C51971G9r.A0g(r5).A04.A09;
                }
                0qQ.A0F("clipsTemplateViewModel");
                throw AnonymousClass00P.createAndThrow();
            }
            h1i.A03 = r2;
            ArrayList parcelableArrayList = h1i.requireArguments().getParcelableArrayList(C273654mx.A00(32));
            h1i.A05 = parcelableArrayList;
            if (parcelableArrayList == null || parcelableArrayList.size() <= 0 || i2 >= parcelableArrayList.size()) {
                Object obj = h1i.requireArguments().get(AnonymousClass000.A00(96));
                if (!(obj instanceof 28D) || (r14 = (28D) obj) == null) {
                    C3511387s r0 = h1i.A02;
                    if (r0 != null) {
                        r14 = r0.A02;
                        if (r14 == null) {
                            r14 = C51971G9r.A0g(r5).A04.A09;
                            0qQ.A07(r14);
                        }
                    }
                    0qQ.A0F("clipsTemplateViewModel");
                    throw AnonymousClass00P.createAndThrow();
                }
                UserSession A0l = AnonymousClass7TE.A0l(r5);
                FragmentActivity requireActivity = h1i.requireActivity();
                293 serializable3 = h1i.requireArguments().getSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                if (serializable3 == null) {
                    r15 = 293.A06;
                } else {
                    r15 = serializable3;
                }
                C55274Hf3.A00(requireActivity, h1i, r14, r15, A0l, r2, h1i.A05, false);
                return;
            }
            C59689JTv.A07(h1i.getContext(), 2131969723);
            return;
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public C57613Ide(H1I h1i) {
        this.A00 = h1i;
    }

    public final void D3k(C53152GjO gjO, String str) {
        ((C52967GgK) this.A00.A0K.getValue()).A0G(gjO);
    }

    public final void D3m(C267324bN r26, IgSimpleImageView igSimpleImageView, IgImageView igImageView, 1Xj r29) {
        C243373Ym r2;
        C53013Gh4 gh4;
        C243373Ym r12;
        IgSimpleImageView igSimpleImageView2 = igSimpleImageView;
        IgImageView igImageView2 = igImageView;
        AnonymousClass7TG.A1Q(igSimpleImageView2, igImageView2);
        1Xj r10 = r29;
        if (!r10.CbC()) {
            r2 = C243373Ym.SAVED;
        } else {
            r2 = C243373Ym.NOT_SAVED;
        }
        H1I h1i = this.A00;
        AnonymousClass0eM r4 = h1i.A0F;
        C267324bN r7 = r26;
        if (r4.getValue() == ClipsTemplateBrowserV2Type.MAIN) {
            C53013Gh4 gh42 = (C53013Gh4) h1i.A0J.getValue();
            if (gh42 != null) {
                gh42.A00(r7, r2);
            }
        } else if (r4.getValue() == ClipsTemplateBrowserV2Type.SAVED && (gh4 = (C53013Gh4) h1i.A0J.getValue()) != null) {
            C58105ImR.A01(gh4, r10, C318116oQ.A00(gh4), 26);
        }
        C53023GhE A0o = C51969G9p.A0o(h1i);
        Context requireContext = h1i.requireContext();
        UserSession A0l = AnonymousClass7TE.A0l(h1i.A0I);
        Map map = h1i.A0A;
        C52967GgK ggK = (C52967GgK) h1i.A0K.getValue();
        C53013Gh4 gh43 = (C53013Gh4) h1i.A0J.getValue();
        ClipsTemplateBrowserV2Type clipsTemplateBrowserV2Type = (ClipsTemplateBrowserV2Type) r4.getValue();
        C51973G9u.A0s(5, A0l, map, ggK);
        if (!r10.CbC()) {
            r12 = C243373Ym.SAVED;
        } else {
            r12 = C243373Ym.NOT_SAVED;
        }
        C53023GhE.A00(requireContext, r7, A0l, r10, h1i, r12, ggK, A0o, map);
        Dc2 dc2 = A0o.A00;
        if (dc2 != null) {
            DbX.A1R(dc2);
        }
        C310336ap A0a = DbS.A0a();
        int i = 2131975056;
        if (r12 == C243373Ym.SAVED) {
            i = 2131975049;
        }
        DbS.A19(requireContext, A0a, i);
        Drawable drawable = igImageView2.getDrawable();
        if (drawable == null) {
            drawable = C51965G9l.A0D(0);
        }
        A0a.A04 = drawable;
        A0a.A03();
        DbW.A0q(requireContext, A0a, 2131975055);
        A0a.A0A(new C57275IVk(requireContext, clipsTemplateBrowserV2Type, r7, A0l, igSimpleImageView2, r10, h1i, r12, gh43, ggK, A0o, map));
        A0a.A0L = true;
        Dc2 A002 = A0a.A00();
        A0o.A00 = A002;
        DbX.A1S(A002);
    }

    public final void D3n(C53152GjO gjO) {
        this.A00.A0K.getValue();
        C57462Ib6 ib6 = gjO.A01;
        if (ib6 != null) {
            ib6.A00();
        }
        gjO.A01 = null;
    }
}
