package X;

import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.reels.storiestemplate.discovery.view.StoryTemplateDiscoverySurfaceFragment;

public final class Pr3 extends 0Yb {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Pr3(Object obj, int i) {
        super((Object) null);
        this.A00 = i;
        this.A01 = obj;
    }

    public final void A02(Object obj, Object obj2, AnonymousClass0YZ r15) {
        float f;
        String str;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        PromptStickerModel promptStickerModel;
        String str2;
        String str3;
        switch (this.A00) {
            case 0:
                String str4 = (String) obj2;
                if (!0qQ.A0K(obj, str4)) {
                    KXg kXg = (KXg) this.A01;
                    if (str4 == null || 00l.A0W(str4)) {
                        str = null;
                    } else {
                        str = DbV.A12(str4);
                    }
                    DbS.A1a(kXg, str, kXg.A0B, KXg.A0D, 0);
                    return;
                }
                return;
            case 1:
                boolean A1a = AnonymousClass7TE.A1a(obj2);
                K6S k6s = (K6S) this.A01;
                K9H A09 = k6s.A09();
                boolean z = !A1a;
                A09.A04 = z;
                int itemCount = A09.getItemCount();
                for (int i2 = 0; i2 < itemCount; i2++) {
                    C61036Jva jva = (C61036Jva) A09.getModelForPosition(C61036Jva.class, i2);
                    if (jva != null) {
                        jva.A00 = z;
                        A09.notifyItemChanged(i2);
                    }
                }
                k6s.requireView().findViewById(R.id.done_button).setEnabled(z);
                TextView A0d = AnonymousClass7TE.A0d(k6s.requireView(), R.id.list_name_edit_text);
                A0d.setEnabled(z);
                if (A1a) {
                    A0d.setInputType(0);
                    f = 0.5f;
                } else {
                    A0d.setInputType(1);
                    f = 1.0f;
                }
                A0d.setAlpha(f);
                return;
            case 2:
                double doubleValue = ((Number) obj2).doubleValue();
                ((Number) obj).doubleValue();
                C64091LMj lMj = (C64091LMj) this.A01;
                IgSimpleImageView igSimpleImageView = lMj.A00;
                ViewGroup.LayoutParams layoutParams = igSimpleImageView.getLayoutParams();
                if (layoutParams instanceof C71492dQ) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                    IgTextView igTextView = lMj.A01;
                    int measuredHeight = igTextView.getMeasuredHeight();
                    ViewGroup.LayoutParams layoutParams2 = igTextView.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    } else {
                        marginLayoutParams = null;
                    }
                    if (marginLayoutParams != null) {
                        i = marginLayoutParams.topMargin;
                    } else {
                        i = 0;
                    }
                    marginLayoutParams2.setMargins(0, 0, 0, (int) (doubleValue * ((double) (-(measuredHeight + i)))));
                    igSimpleImageView.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 3:
                C68177N3s n3s = (C68177N3s) obj2;
                if (!0qQ.A0K(obj, n3s) && n3s != null && (promptStickerModel = n3s.A04) != null && (str2 = promptStickerModel.A03) != null && str2.length() > 0) {
                    Long l = null;
                    String str5 = n3s.A07;
                    if (str5 == null) {
                        str5 = "";
                    }
                    long j = (long) n3s.A00;
                    C3Q c3q = n3s.A05;
                    if (c3q != null) {
                        l = C51972G9s.A0i(c3q.A07("strong_id__"));
                    }
                    String str6 = n3s.A08;
                    if (str6 == null) {
                        str6 = "";
                    }
                    StoryTemplateDiscoverySurfaceFragment storyTemplateDiscoverySurfaceFragment = (StoryTemplateDiscoverySurfaceFragment) this.A01;
                    String str7 = storyTemplateDiscoverySurfaceFragment.viewerSessionId;
                    UserSession A0l = AnonymousClass7TE.A0l(storyTemplateDiscoverySurfaceFragment.session$delegate);
                    0xG A0O = DbS.A0O("StoryTemplateDiscoverySurfaceFragment");
                    C48117EWj eWj = n3s.A02;
                    AnonymousClass7TG.A1S(str7, A0l);
                    0Aj A0e = AnonymousClass7TE.A0e(C51967G9n.A0Z(A0O, A0l, eWj, 8), "ig_story_template_impression");
                    if (A0e.isSampled()) {
                        A0e.AAJ("m_pk", str5);
                        A0e.A9F("m_t", Long.valueOf(j));
                        Double valueOf = Double.valueOf(0.0d);
                        A0e.A8D("time_elapsed", valueOf);
                        A0e.A8D("time_remaining", valueOf);
                        A0e.AAJ("tray_session_id", "");
                        A0e.AAJ("viewer_session_id", str7);
                        A0e.AAJ("reel_id", str6);
                        DbS.A1J(A0e, "impression");
                        A0e.AAJ("template_id", str2);
                        int ordinal = eWj.ordinal();
                        if (ordinal == 2) {
                            str3 = "add_yours_templates_discovery_surface_find_it_first";
                        } else if (ordinal == 3) {
                            str3 = "add_yours_templates_discovery_surface_hot_right_now";
                        } else if (ordinal != 4) {
                            str3 = null;
                        } else {
                            str3 = "add_yours_templates_discovery_surface_international_hits";
                        }
                        A0e.AAJ("template_section", str3);
                        A0e.A9F("a_pk", l);
                        A0e.Cgf();
                        return;
                    }
                    return;
                }
                return;
            default:
                Pr3.super.A02(obj, obj2, r15);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Pr3(int i, Object obj, Object obj2) {
        super(obj2);
        this.A00 = i;
        this.A01 = obj;
    }
}
