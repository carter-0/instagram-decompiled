package X;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.K7m  reason: case insensitive filesystem */
public final class C61437K7m extends AnonymousClass4DH implements C273414mX {
    public static final String __redex_internal_original_name = "AvatarExitNuxBottomSheetFragment";
    public int A00;
    public Activity A01;
    public Resources A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public ConstraintLayout A06;
    public ConstraintLayout A07;
    public IgImageView A08;
    public IgImageView A09;
    public IgImageView A0A;
    public IgImageView A0B;
    public IgImageView A0C;
    public IgImageView A0D;
    public C331157Pu A0E;
    public SpinnerImageView A0F;
    public List A0G;
    public boolean A0H;
    public String A0I;
    public final C64860LjM A0J = new C64860LjM(this, 1);
    public final AnonymousClass0eM A0K = C227642jf.A02(this);
    public final AnonymousClass0eM A0L;

    public final void Cyf() {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A02 = DbV.A05(this);
        C60147JgS jgS = (C60147JgS) this.A0L.getValue();
        1Ln A0U = C51965G9l.A0U(AnonymousClass7TE.A0e(jgS.A00, "ig_exit_nux_impression_event"), 217);
        A0U.A0R(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, jgS.A02);
        A0U.Cgf();
        this.A05 = DbU.A0G(view, R.id.avatar_exit_nux_title);
        this.A04 = DbU.A0G(view, R.id.avatar_exit_nux_subtitle);
        this.A03 = DbU.A0G(view, R.id.avatar_exit_nux_cta_button);
        this.A06 = (ConstraintLayout) view.requireViewById(R.id.exit_nux_sticker_layout);
        this.A07 = (ConstraintLayout) view.requireViewById(R.id.avatar_stickers);
        this.A0F = (SpinnerImageView) view.requireViewById(R.id.avatar_exit_nux_loading_spinner);
        this.A0B = DbT.A0b(view, R.id.avatar_sticker_top_left);
        this.A08 = DbT.A0b(view, R.id.avatar_sticker_bottom_left);
        this.A0A = DbT.A0b(view, R.id.avatar_sticker_center);
        this.A0C = DbT.A0b(view, R.id.avatar_sticker_top_right);
        this.A09 = DbT.A0b(view, R.id.avatar_sticker_bottom_right);
        IgImageView A0b = DbT.A0b(view, R.id.exit_nux_sticker);
        this.A0D = A0b;
        if (A0b != null) {
            DbU.A13(requireContext(), A0b, R.drawable.exit_nux_sticker_asset);
            IgImageView igImageView = this.A0B;
            if (igImageView == null) {
                str = "avatarStickerTopLeft";
            } else {
                IgImageView igImageView2 = this.A08;
                if (igImageView2 == null) {
                    str = "avatarStickerBottomLeft";
                } else {
                    IgImageView igImageView3 = this.A0A;
                    if (igImageView3 == null) {
                        str = "avatarStickerCenter";
                    } else {
                        IgImageView igImageView4 = this.A0C;
                        if (igImageView4 == null) {
                            str = "avatarStickerTopRight";
                        } else {
                            IgImageView igImageView5 = this.A09;
                            if (igImageView5 == null) {
                                str = "avatarStickerBottomRight";
                            } else {
                                List A1P = 0sr.A1P(new IgImageView[]{igImageView, igImageView2, igImageView3, igImageView4, igImageView5});
                                this.A0G = A1P;
                                Iterator it = A1P.iterator();
                                while (it.hasNext()) {
                                    JTQ.A0v(JTO.A0H(it), 0.0f);
                                }
                                IgImageView igImageView6 = this.A0D;
                                if (igImageView6 != null) {
                                    igImageView6.setScaleX(0.0f);
                                    igImageView6.setScaleY(0.0f);
                                    TextView textView = this.A03;
                                    if (textView != null) {
                                        LYC.A00(textView, 59, this);
                                        TextView textView2 = this.A05;
                                        if (textView2 == null) {
                                            str = "titleView";
                                        } else {
                                            Resources resources = this.A02;
                                            if (resources != null) {
                                                DbU.A1A(resources, textView2, 2131953451);
                                                TextView textView3 = this.A04;
                                                if (textView3 == null) {
                                                    str = "subtitleView";
                                                } else {
                                                    Resources resources2 = this.A02;
                                                    if (resources2 != null) {
                                                        DbU.A1A(resources2, textView3, 2131953450);
                                                        TextView textView4 = this.A03;
                                                        if (textView4 != null) {
                                                            Resources resources3 = this.A02;
                                                            if (resources3 != null) {
                                                                DbU.A1A(resources3, textView4, 2131953449);
                                                                07U r4 = 07U.A05;
                                                                AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
                                                                AnonymousClass7TE.A1Z(new MHH(r4, this, viewLifecycleOwner, (AnonymousClass4D7) null, 35), AnonymousClass07a.A00(viewLifecycleOwner));
                                                                return;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            0qQ.A0F("contextResources");
                                            throw AnonymousClass00P.createAndThrow();
                                        }
                                    }
                                    str = "primaryCtaButton";
                                }
                            }
                        }
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        str = "exitNuxSticker";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Cyc() {
        if (this.A0H) {
            0lg A0X = DbT.A0X(this.A0K);
            Class<ModalActivity> cls = ModalActivity.class;
            String str = this.A0I;
            if (str == null) {
                0qQ.A0F("previousModuleName");
                throw AnonymousClass00P.createAndThrow();
            } else {
                Dba.A0K(this.A01, DbY.A0B(C273654mx.A00(889), str), A0X, cls, C273654mx.A00(1507)).A0C(this.A01);
            }
        }
        this.A01 = null;
    }

    public final String getModuleName() {
        String str = this.A0I;
        if (str != null) {
            return 002.A0R(str, "_context_sheet_post_avatar_creation");
        }
        0qQ.A0F("previousModuleName");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0K);
    }

    public C61437K7m() {
        MMP mmp = new MMP(this, 6);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new MMP(new MMP(this, 3), 4));
        this.A0L = DbS.A0I(new MMP(A002, 5), mmp, new MMX(29, (Object) null, (Object) A002), DbS.A0z(C60147JgS.class));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2066355404);
        C61437K7m.super.onCreate(bundle);
        String string = requireArguments().getString("args_previous_module_name");
        if (string != null) {
            this.A0I = string;
            AnonymousClass0fD.A09(-331002420, A022);
            return;
        }
        IllegalStateException A0z = AnonymousClass7TE.A0z("previous module required");
        AnonymousClass0fD.A09(1408791664, A022);
        throw A0z;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2059478318);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.avatar_sticker_exit_nux_bottom_sheet_fragment, viewGroup, false);
        AnonymousClass0fD.A09(614250744, A022);
        return inflate;
    }
}
