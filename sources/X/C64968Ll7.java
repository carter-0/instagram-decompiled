package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import java.util.Set;

/* renamed from: X.Ll7  reason: case insensitive filesystem */
public final class C64968Ll7 implements MXG, C66440MRu {
    public static final C71392co A0R = C71392co.A00();
    public static final String __redex_internal_original_name = "CutoutStickerGalleryController";
    public View A00;
    public View A01;
    public RecyclerView A02;
    public IgTextView A03;
    public IgTextView A04;
    public LG7 A05;
    public C64737LhE A06;
    public C339797kB A07;
    public AnonymousClass8XW A08;
    public Integer A09;
    public final int A0A;
    public final int A0B;
    public final Activity A0C;
    public final Context A0D;
    public final ViewStub A0E;
    public final AnonymousClass07i A0F;
    public final GridLayoutManager A0G;
    public final AnonymousClass0iw A0H;
    public final UserSession A0I;
    public final Integer A0J;
    public final Set A0K = DbS.A0y();
    public final AnonymousClass0eM A0L = MMT.A00(this, 0);
    public final AnonymousClass0eM A0M = MMT.A00(this, 1);
    public final boolean A0N;
    public final boolean A0O;
    public final AnonymousClass8ML A0P;
    public final String A0Q;

    public C64968Ll7(Activity activity, Context context, ViewStub viewStub, AnonymousClass07i r7, AnonymousClass0iw r8, UserSession userSession, AnonymousClass8ML r10, Integer num, Integer num2, int i, boolean z, boolean z2) {
        0qQ.A0B(viewStub, 1);
        0qQ.A0B(userSession, 4);
        AnonymousClass7TG.A1S(r8, r7);
        0qQ.A0B(r10, 9);
        this.A0E = viewStub;
        this.A0C = activity;
        this.A0D = context;
        this.A0I = userSession;
        this.A0H = r8;
        this.A0F = r7;
        this.A0A = i;
        this.A0P = r10;
        this.A09 = num;
        this.A0O = z;
        this.A0J = num2;
        this.A0N = z2;
        this.A0G = new GridLayoutManager(context, 3);
        this.A0B = AnonymousClass7TG.A04(context);
        this.A0Q = "cutout-sticker-controller";
    }

    public final /* synthetic */ void Cw3() {
    }

    public final void DMQ(Medium medium) {
        if (this.A0O) {
            this.A0P.DR4(medium);
            return;
        }
        Integer A0j = JTP.A0j(medium.A05() ? 1 : 0);
        Integer num = this.A09;
        0qQ.A0B(A0j, 0);
        C358148aR.A00((C358148aR) this.A0L.getValue(), AnonymousClass05K.A0Y, A0j, num, (Long) null, "gallery_media_selected");
        this.A0P.D7a(medium, this.A09);
    }

    public final /* synthetic */ void Dfq() {
    }

    public static final void A02(C64968Ll7 ll7) {
        String str;
        if (ll7.A00 == null) {
            DbT.A1Q(0wj.A01, "CutoutStickerGalleryController: Gallery container is null", 245701013);
        }
        View view = ll7.A00;
        if (view != null) {
            View view2 = ll7.A01;
            if (view2 == null) {
                str = "overlayContainer";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            C294975nL A0b = JTP.A0b(view2);
            A0b.A03 = 8;
            C294975nL A0E2 = A0b.A0E(A0R);
            A0E2.A0K((float) view.getBottom());
            C65724Lye.A00(A0E2, ll7, 5);
        }
        IgTextView igTextView = ll7.A03;
        if (igTextView == null) {
            str = "folderMenu";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        igTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.instagram_chevron_down_outline_16, 0);
        ll7.A05 = null;
    }

    public static final void A03(C64968Ll7 ll7) {
        KKN kkn;
        LG7 lg7 = ll7.A05;
        if (lg7 != null && (kkn = lg7.A01) != null && kkn.onBackPressed()) {
            return;
        }
        if (ll7.A05 != null) {
            A02(ll7);
        } else if (!ll7.A0O) {
            ll7.A0P.D7Z();
            C358148aR.A00((C358148aR) ll7.A0L.getValue(), AnonymousClass05K.A0Y, (Integer) null, ll7.A09, (Long) null, "gallery_back_button_tapped");
        }
    }

    public static final void A04(C64968Ll7 ll7) {
        String str;
        C339797kB r0 = ll7.A07;
        if (r0 != null) {
            r0.A00();
        }
        ll7.A07 = null;
        View view = ll7.A00;
        if (view != null) {
            str = "folderMenu";
            ll7.A01(view);
            ll7.A00(view);
            IgTextView igTextView = ll7.A03;
            if (igTextView != null) {
                igTextView.setVisibility(0);
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass8XW r02 = ll7.A08;
        if (r02 == null) {
            str = "mediaLoaderController";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        r02.A07();
    }

    public static final void A05(C64968Ll7 ll7, int i) {
        AnonymousClass8XW r0 = ll7.A08;
        String str = "mediaLoaderController";
        if (r0 != null) {
            r0.A0D(i);
            IgTextView igTextView = ll7.A03;
            if (igTextView == null) {
                str = "folderMenu";
            } else {
                AnonymousClass8XW r02 = ll7.A08;
                if (r02 != null) {
                    igTextView.setText(r02.A02.A03);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A06(C64968Ll7 ll7, boolean z, boolean z2) {
        View view = ll7.A00;
        if (view != null && C2604245p.A03(AnonymousClass7TE.A0S(view))) {
            A04(ll7);
        } else if (z) {
            C64737LhE lhE = ll7.A06;
            if (lhE == null) {
                lhE = new C64737LhE(ll7.A0C);
                ll7.A06 = lhE;
            }
            MIW miw = new MIW(ll7, 57);
            MIW miw2 = new MIW(ll7, 58);
            if (!lhE.A03) {
                if (!lhE.A02) {
                    Activity activity = lhE.A04;
                    if (C2604245p.A00(1DL.A02(activity, C2604245p.A05(activity))) == C346927vz.DENIED_DONT_ASK_AGAIN) {
                        lhE.A02 = true;
                    }
                }
                if (!lhE.A02) {
                    lhE.A03 = true;
                    lhE.A01 = miw;
                    lhE.A00 = miw2;
                    C2604245p.A01(lhE.A04, lhE);
                } else if (z2) {
                    W38.A06(lhE.A04, (Integer) null);
                } else {
                    miw2.invoke();
                }
            }
        }
    }

    public final Set Acf() {
        return this.A0K;
    }

    public final boolean CII() {
        if (!this.A0N) {
            return false;
        }
        A03(this);
        return true;
    }

    public final void E0h() {
        AnonymousClass8XO r0;
        String str;
        View view = this.A00;
        if (view == null) {
            view = this.A0E.inflate();
            if (this.A09 == AnonymousClass05K.A15) {
                Context context = view.getContext();
                DbT.A16(context, view, 2Yu.A0H(context, R.attr.igds_color_media_background));
            }
            this.A01 = view.requireViewById(R.id.cutout_sticker_gallery_overlay_container);
            boolean z = this.A0O;
            if (z) {
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
                View view2 = this.A01;
                if (view2 == null) {
                    str = "overlayContainer";
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                DbX.A1C(view2, view2.getPaddingLeft(), 0);
                DbT.A16(view.getContext(), view, R.color.grey_9);
            }
            if (this.A0N) {
                Context context2 = view.getContext();
                DbT.A16(context2, view, 2Yu.A0H(context2, R.attr.igds_color_media_background));
            }
            int i = (this.A0A - (this.A0B * 2)) / 3;
            int A052 = JTO.A05((float) i, 0.5625f);
            UserSession userSession = this.A0I;
            Context context3 = this.A0D;
            C355608Qq r6 = new C355608Qq(context3, userSession, AnonymousClass05K.A00, i, A052, false);
            C60445Jld jld = new C60445Jld(r6, this, this.A0J, A052, false);
            jld.setHasStableIds(true);
            AnonymousClass8XN r5 = new AnonymousClass8XN(this.A0F, r6);
            if (AnonymousClass7TF.A1Z(this.A0M)) {
                r0 = AnonymousClass8XO.PHOTO_AND_VIDEO;
            } else {
                r0 = AnonymousClass8XO.PHOTO_ONLY;
            }
            r5.A03 = r0;
            r5.A09 = true;
            this.A08 = new AnonymousClass8XW(context3, (2Cn) null, jld, new AnonymousClass8XU(r5));
            A01(view);
            A00(view);
            RecyclerView A0I2 = DbT.A0I(view, R.id.cutout_sticker_grid_recycler_view);
            this.A02 = A0I2;
            str = "recyclerView";
            if (A0I2 != null) {
                A0I2.setAdapter(jld);
                RecyclerView recyclerView = this.A02;
                if (recyclerView != null) {
                    recyclerView.setLayoutManager(this.A0G);
                    RecyclerView recyclerView2 = this.A02;
                    if (recyclerView2 != null) {
                        C60467Jlz.A00(recyclerView2, this, 4);
                        RecyclerView recyclerView3 = this.A02;
                        if (recyclerView3 != null) {
                            recyclerView3.setOverScrollMode(2);
                            if (!z) {
                                this.A0K.add(view);
                            }
                            this.A00 = view;
                        }
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        view.setVisibility(0);
        A06(this, true, false);
    }

    public final void close() {
        AnonymousClass7TH.A0R(this.A00);
    }

    public final String getModuleName() {
        return this.A0Q;
    }

    public final boolean isScrolledToBottom() {
        return C2808154f.A02(this.A0G);
    }

    public final boolean isScrolledToTop() {
        return C2808154f.A03(this.A0G);
    }

    private final void A00(View view) {
        String str;
        View A0G2 = AnonymousClass7TF.A0G(view, R.id.cutout_stickery_gallery_back_button);
        if (this.A0O) {
            A0G2.setVisibility(8);
        } else {
            A0G2.setVisibility(0);
            LY0.A00(A0G2, 9, this);
        }
        IgTextView A0a = DbT.A0a(view, R.id.cutout_sticker_gallery_folder_menu);
        this.A03 = A0a;
        if (A0a == null) {
            str = "folderMenu";
        } else {
            AnonymousClass3NG A0m = AnonymousClass7TE.A0m(A0a);
            A0m.A06 = false;
            C61685KHt.A00(A0m, this, 9);
            AnonymousClass8XW r0 = this.A08;
            if (r0 == null) {
                str = "mediaLoaderController";
            } else {
                A05(this, r0.A02.A02);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    private final void A01(View view) {
        IgTextView A0a = DbT.A0a(view, R.id.cutout_sticker_gallery_sub_title_label);
        this.A04 = A0a;
        if (this.A0O) {
            if (A0a != null) {
                A0a.setVisibility(8);
                TextView A0R2 = AnonymousClass7TG.A0R(view, R.id.cutout_sticker_gallery_title_label);
                A0R2.setText(this.A0D.getText(2131955205));
                A0R2.setTypeface((Typeface) null, 1);
                return;
            }
        } else if (A0a != null) {
            A0a.setVisibility(0);
            IgTextView igTextView = this.A04;
            if (igTextView != null) {
                Context context = this.A0D;
                int i = 2131957312;
                if (AnonymousClass7TF.A1Z(this.A0M)) {
                    i = 2131957313;
                }
                igTextView.setText(context.getText(i));
                return;
            }
        }
        0qQ.A0F("subtitleView");
        throw AnonymousClass00P.createAndThrow();
    }
}
