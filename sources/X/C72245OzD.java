package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.direct.ui.countdowntimer.CountdownTimerPill;

/* renamed from: X.OzD  reason: case insensitive filesystem */
public final class C72245OzD implements C2365734g {
    public final int A00;
    public final Object A01;

    public C72245OzD(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DKS(View view) {
        AnonymousClass3AS r1;
        C361648gZ A002;
        C60061Jec jec;
        View view2 = view;
        switch (this.A00) {
            case 0:
                0qQ.A0B(view2, 0);
                C70964OTl oTl = (C70964OTl) this.A01;
                oTl.A00 = view2;
                oTl.A01 = (IgSimpleImageView) view2.findViewById(R.id.prompts_cancel_fab);
                IgTextView A0X = JTO.A0X(view2, R.id.prompt_creation_text);
                oTl.A02 = A0X;
                if (A0X != null) {
                    int i = 2131957360;
                    if (AnonymousClass7K4.A02(oTl.A05)) {
                        i = 2131957359;
                    }
                    A0X.setText(i);
                    return;
                }
                return;
            case 1:
                0qQ.A0B(view2, 0);
                C71083Ob6 ob6 = (C71083Ob6) this.A01;
                RecyclerView A0I = DbT.A0I(view2, R.id.ai_sticker_results_list);
                A0I.setAdapter(((C70692OGn) ob6.A0G.getValue()).A00);
                A0I.setLayoutManager((C252553pI) ob6.A0F.getValue());
                boolean booleanValue = C69923NuP.A00(ob6.A09).booleanValue();
                Context A0S = AnonymousClass7TE.A0S(A0I);
                if (booleanValue) {
                    Context context = ob6.A06;
                    int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.ai_sticker_tray_item_side_padding) / ((int) (((double) AnonymousClass0nB.A00(context)) * 0.01d));
                    if (dimensionPixelOffset > context.getResources().getDimensionPixelOffset(R.dimen.action_bar_plus_shadow_height)) {
                        dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.action_bar_plus_shadow_height);
                    }
                    r1 = null;
                    A002 = C69922NuO.A00(A0S, Integer.valueOf(dimensionPixelOffset), 0, true, false);
                } else {
                    r1 = null;
                    A002 = C69922NuO.A00(A0S, (Integer) null, 0, true, false);
                }
                A0I.A11(A002);
                A0I.setItemAnimator(r1);
                ob6.A00 = A0I;
                A0I.setOnTouchListener(ob6.A07);
                return;
            case 2:
                if (view != null) {
                    C71020OYv oYv = (C71020OYv) this.A01;
                    RecyclerView A0I2 = DbT.A0I(view2, R.id.gifs_tray_grid);
                    oYv.A01 = A0I2;
                    if (A0I2 != null) {
                        A0I2.setAdapter(oYv.A0A);
                    }
                    RecyclerView recyclerView = oYv.A01;
                    if (recyclerView != null) {
                        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(DbX.A07(oYv.A0G), 1));
                    }
                    RecyclerView recyclerView2 = oYv.A01;
                    if (recyclerView2 != null) {
                        recyclerView2.A0S = true;
                        recyclerView2.A11(new C361648gZ(JTR.A05(view2.getContext()), true));
                    }
                    RecyclerView recyclerView3 = oYv.A01;
                    if (recyclerView3 != null) {
                        recyclerView3.setItemAnimator((AnonymousClass3AS) null);
                    }
                    oYv.A02 = JTO.A0X(view2, R.id.gifs_tray_empty_view);
                    oYv.A00 = view2.findViewById(R.id.gifs_tray_loading_spinner);
                    ViewStub A0X2 = JTR.A0X(view2, R.id.gifs_tray_emoji_tab_layout);
                    if (182.A06(0Tu.A05, oYv.A06, 36330960853156707L)) {
                        A0X2.setLayoutResource(R.layout.gifs_tray_emoji_tab_layout_1);
                    }
                    View inflate = A0X2.inflate();
                    if ((inflate instanceof C60061Jec) && (jec = (C60061Jec) inflate) != null) {
                        if (!AnonymousClass7TF.A1Z(oYv.A0F)) {
                            jec.setVisibility(8);
                            return;
                        }
                        oYv.A03 = new C70677OFy(oYv.A05, jec, new C59110J6s(oYv, 29));
                        jec.setVisibility(0);
                        jec.setBackgroundColor(0);
                        C70677OFy oFy = oYv.A03;
                        if (oFy == null) {
                            0qQ.A0F("directGifCategoriesTabsManager");
                        } else {
                            C60061Jec jec2 = oFy.A02;
                            jec2.A00(oFy.A00, true);
                            int i2 = 0;
                            for (Object next : oFy.A03) {
                                int i3 = i2 + 1;
                                if (i2 < 0) {
                                    0sr.A1T();
                                } else {
                                    N4H n4h = (N4H) next;
                                    Context context2 = oFy.A01;
                                    jec2.A02(new C71404Ok3(oFy, i2, 0), new C49627Ezk(context2.getDrawable(n4h.A02), (CharSequence) null, context2.getString(n4h.A01), -1, true));
                                    i2 = i3;
                                }
                            }
                            jec2.A01(oFy.A00, true);
                            return;
                        }
                        throw AnonymousClass00P.createAndThrow();
                    }
                    return;
                }
                return;
            case 3:
                0qQ.A0B(view2, 0);
                C70824OMw oMw = (C70824OMw) this.A01;
                oMw.A00 = view2;
                oMw.A03 = AnonymousClass7TE.A0d(view2, R.id.prompt_title);
                oMw.A02 = AnonymousClass7TE.A0d(view2, R.id.prompt_cta);
                oMw.A01 = DbS.A0G(view2, R.id.prompt_cta_chevron);
                oMw.A04 = (CountdownTimerPill) view2.findViewById(R.id.prompt_countdown_timer);
                return;
            case 4:
                PBO pbo = (PBO) this.A01;
                pbo.A00 = view2.getContext();
                pbo.A03 = DbU.A0C(view2, R.id.message_add_custom_reactions_pill_container);
                pbo.A04 = JTP.A0T(view2, R.id.add_reaction);
                ViewGroup viewGroup = pbo.A03;
                if (viewGroup == null) {
                    0qQ.A0F("pillContainer");
                    throw AnonymousClass00P.createAndThrow();
                }
                Drawable background = viewGroup.getBackground();
                if (background != null) {
                    LayerDrawable layerDrawable = (LayerDrawable) background;
                    Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.message_reactions_pill_background_layer);
                    if (findDrawableByLayerId != null) {
                        pbo.A01 = findDrawableByLayerId;
                        Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(R.id.message_reactions_pill_shadow_layer);
                        if (findDrawableByLayerId2 != null) {
                            pbo.A02 = findDrawableByLayerId2;
                            return;
                        }
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            case 5:
                OH7 oh7 = (OH7) this.A01;
                0qQ.A0A(view2);
                oh7.A03 = DbU.A0G(view2, R.id.story_interstitial_reel_item_title);
                oh7.A02 = DbU.A0G(view2, R.id.story_interstitial_reel_item_subtitle);
                oh7.A04 = DbT.A0b(view2, R.id.story_interstitial_reel_item_facepile);
                oh7.A01 = DbU.A0G(view2, R.id.story_interstitial_reel_item_button);
                return;
            case 6:
                if (view != null) {
                    OGP ogp = (OGP) this.A01;
                    ogp.A02 = DbU.A0G(view2, R.id.pog_garden_chaining_title);
                    ogp.A01 = DbU.A0G(view2, R.id.pog_garden_chaining_subtitle);
                    Object[] objArr = ogp.A03;
                    objArr[0] = view2.requireViewById(R.id.pog_garden_item_1);
                    objArr[1] = view2.requireViewById(R.id.pog_garden_item_2);
                    objArr[2] = view2.requireViewById(R.id.pog_garden_item_3);
                    objArr[3] = view2.requireViewById(R.id.pog_garden_item_4);
                    objArr[4] = view2.requireViewById(R.id.pog_garden_item_5);
                    objArr[5] = view2.requireViewById(R.id.pog_garden_item_6);
                    objArr[6] = view2.requireViewById(R.id.pog_garden_item_7);
                    objArr[7] = view2.requireViewById(R.id.pog_garden_item_8);
                    objArr[8] = view2.requireViewById(R.id.pog_garden_item_9);
                    return;
                }
                return;
            default:
                0qQ.A0B(view2, 0);
                C55877Hoy hoy = (C55877Hoy) this.A01;
                hoy.A01 = DbT.A0b(view2, R.id.saved_collection_context_image);
                hoy.A00 = DbT.A0a(view2, R.id.saved_collection_context_text);
                return;
        }
    }
}
