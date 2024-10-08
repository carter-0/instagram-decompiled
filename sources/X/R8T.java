package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.model.creation.MediaCaptureConfig;
import java.io.File;
import java.io.IOException;

public final class R8T extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass36P, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "IdVerificationPhotoCaptureFragment";
    public Context A00;
    public Uri A01;
    public Uri A02;
    public ImageView A03;
    public ImageView A04;
    public TextView A05;
    public FragmentActivity A06;
    public 0hq A07;
    public UserSession A08;
    public IgdsBottomButtonLayout A09;
    public T6A A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public boolean A0F;
    public boolean A0G;
    public TextView A0H;
    public boolean A0I;

    public final /* synthetic */ void CJ6(Intent intent) {
    }

    public final /* synthetic */ void Ctk(int i, int i2) {
    }

    public final /* synthetic */ void Ctl(int i, int i2) {
    }

    public final /* synthetic */ void Ewk(File file, int i) {
    }

    public final void ExB(Intent intent, int i) {
        0qQ.A0B(intent, 0);
        0kR.A05(this, intent, i);
    }

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        r4.Eu4(true);
        if (this.A0I) {
            AnonymousClass3JR r2 = new AnonymousClass3JR();
            r2.A02(AnonymousClass05K.A09);
            r2.A0G = new C11495SbI(this, 29);
            Context context = this.A00;
            0qQ.A0A(context);
            r2.A02 = context.getColor(2Yu.A0B(this.A00));
            r4.AA3(new AnonymousClass3Jb(r2));
        }
    }

    public final String getModuleName() {
        return "id_verification";
    }

    public final boolean onBackPressed() {
        if (!this.A0G) {
            return false;
        }
        UserSession userSession = this.A08;
        if (userSession != null) {
            STD.A03(this, userSession, this.A0B, "av_idv", "select_alt_ids", this.A0D);
            return false;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (this.A0G) {
            UserSession userSession = this.A08;
            if (userSession != null) {
                STD.A06(this, userSession, this.A0B, "av_idv", "select_alt_ids", this.A0D);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public static final void A00(R8T r8t) {
        if (r8t.A0G) {
            UserSession userSession = r8t.A08;
            if (userSession != null) {
                String str = r8t.A0B;
                String str2 = r8t.A0D;
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r8t, userSession), "av_load_alt_id");
                if (A0e.isSampled()) {
                    if (str == null) {
                        str = "";
                    }
                    STD.A01(A0e, str, "av_idv", "select_alt_ids", str2);
                    Pxi.A1C(A0e, "id_verification");
                }
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        Context requireContext = r8t.requireContext();
        UserSession userSession2 = r8t.A08;
        if (userSession2 != null) {
            AnonymousClass36U A002 = AnonymousClass36R.A00(requireContext, userSession2, r8t);
            AnonymousClass36W r3 = AnonymousClass36W.PROFILE_PHOTO;
            JWU jwu = new JWU(r3);
            jwu.A05 = false;
            jwu.A0C = false;
            jwu.A09 = false;
            jwu.A0A = false;
            jwu.A03 = false;
            jwu.A0B = false;
            A002.Ewc(EXF.A0J, new MediaCaptureConfig(jwu), r3);
            return;
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final AnonymousClass0wW getSession() {
        return this.A08;
    }

    public final void afterOnCreate(Bundle bundle) {
        super.afterOnCreate(bundle);
        T6A t6a = this.A0A;
        0qQ.A0A(t6a);
        t6a.A00(RDG.A04, RDI.A02, this.A0C);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        ImageView imageView;
        super.onActivityResult(i, i2, intent);
        if (i == 10001 && i2 == -1 && intent != null && intent.getAction() != null) {
            Uri A092 = JTQ.A09(intent.getAction());
            UserSession userSession = this.A08;
            if (userSession != null) {
                JZM.A00(userSession).A09(28t.A05, 15);
            }
            if (A092 != null) {
                Context requireContext = requireContext();
                int round = Math.round(TypedValue.applyDimension(1, requireContext.getResources().getDimension(R.dimen.ar_effect_option_icon_size), AnonymousClass7TF.A0E(requireContext)));
                try {
                    Bitmap extractThumbnail = ThumbnailUtils.extractThumbnail(MediaStore.Images.Media.getBitmap(requireContext.getContentResolver(), A092), round, round);
                    if (extractThumbnail != null) {
                        if (this.A0F) {
                            imageView = this.A03;
                        } else {
                            imageView = this.A04;
                        }
                        0qQ.A0A(imageView);
                        imageView.setImageBitmap(extractThumbnail);
                        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        boolean z = false;
                        imageView.setPadding(0, 0, 0, 0);
                        imageView.setColorFilter((ColorFilter) null);
                        if (this.A0F) {
                            this.A01 = A092;
                        } else {
                            this.A02 = A092;
                        }
                        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A09;
                        0qQ.A0A(igdsBottomButtonLayout);
                        if (!(this.A01 == null || this.A02 == null)) {
                            z = true;
                        }
                        igdsBottomButtonLayout.setPrimaryButtonEnabled(z);
                    }
                } catch (IOException unused) {
                    C59689JTv.A03(requireContext, requireContext.getString(2131974093), C66579MXk.A00(74), 0);
                }
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        int A022 = AnonymousClass0fD.A02(-527932800);
        R8T.super.onCreate(bundle);
        this.A00 = requireContext();
        this.A08 = 09i.A0A.A06(requireArguments());
        FragmentActivity requireActivity = requireActivity();
        this.A06 = requireActivity;
        0qQ.A0A(requireActivity);
        this.A07 = requireActivity.getSupportFragmentManager();
        UserSession userSession = this.A08;
        0qQ.A0A(userSession);
        this.A0A = new T6A(userSession);
        String string = requireArguments().getString("challenge_use_case");
        this.A0C = string;
        if (string == null || (!string.equals("idv_reactive") && !string.equals("ig_scraping"))) {
            z = true;
        } else {
            z = false;
        }
        this.A0I = z;
        requireArguments().getString("challenge_id");
        this.A0B = requireArguments().getString("av_session_id");
        this.A0D = requireArguments().getString("flow_id");
        this.A0E = requireArguments().getString("product_surface");
        this.A0G = "ig_age_verification_idv".equals(this.A0C);
        AnonymousClass0fD.A09(777839176, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-712276313);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.id_verification_photo_capture_layout, viewGroup, false);
        this.A0H = DbU.A0G(inflate, R.id.capture_screen_description);
        this.A05 = DbU.A0G(inflate, R.id.capture_screen_description_link);
        this.A03 = DbU.A0F(inflate, R.id.capture_screen_choose_photo_glyph_1);
        this.A04 = DbU.A0F(inflate, R.id.capture_screen_choose_photo_glyph_2);
        this.A09 = (IgdsBottomButtonLayout) inflate.requireViewById(R.id.id_verification_intro_next_button);
        ImageView imageView = this.A03;
        0qQ.A0A(imageView);
        Context context = this.A00;
        0qQ.A0A(context);
        boolean A1U = AnonymousClass7TF.A1U(0, imageView, context);
        DbX.A12(context, imageView, 2Yu.A0B(context));
        ImageView imageView2 = this.A04;
        0qQ.A0A(imageView2);
        Context context2 = this.A00;
        0qQ.A0A(context2);
        0qQ.A0B(imageView2, 0);
        0qQ.A0B(context2, A1U ? 1 : 0);
        DbX.A12(context2, imageView2, 2Yu.A0B(context2));
        TextView textView = this.A05;
        0qQ.A0A(textView);
        String A0m = DbU.A0m(this, 2131969406);
        String string = getString(2131969405);
        FragmentActivity fragmentActivity = this.A06;
        0qQ.A0A(fragmentActivity);
        AnonymousClass7AV.A07(new RBY(this, fragmentActivity.getColor(2Yu.A0D(this.A00))), textView, A0m, string);
        ImageView imageView3 = this.A03;
        0qQ.A0A(imageView3);
        C11495SbI.A00(imageView3, 30, this);
        ImageView imageView4 = this.A04;
        0qQ.A0A(imageView4);
        C11495SbI.A00(imageView4, 31, this);
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A09;
        0qQ.A0A(igdsBottomButtonLayout);
        igdsBottomButtonLayout.setPrimaryButtonEnabled(false);
        IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A09;
        0qQ.A0A(igdsBottomButtonLayout2);
        igdsBottomButtonLayout2.setPrimaryActionOnClickListener(new C11495SbI(this, 32));
        AnonymousClass0fD.A09(-1194275448, A022);
        return inflate;
    }
}
