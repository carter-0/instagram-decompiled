package X;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import java.io.Serializable;
import java.util.Locale;

public final class K3Q extends C61364K4g implements C66388MPu {
    public static final String __redex_internal_original_name = "AvatarMentionableFriendStickerGridFragment";
    public String A00;
    public boolean A01;
    public String A02;
    public String A03;
    public final AnonymousClass0eM A04 = DbS.A0I(new MMP(this, 2), new MMP(this, 1), new MMX(28, (Object) null, (Object) this), DbS.A0z(C60186Jh5.class));
    public final AnonymousClass0eM A05 = C227642jf.A02(this);

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        DbT.A16(view.getContext(), view.requireViewById(R.id.avatar_sticker_grid_container), R.color.fds_transparent);
        ImageView A0F = DbU.A0F(view, R.id.avatar_sticker_grid_back_button);
        if (A0F != null) {
            DbU.A14(requireContext(), A0F, R.color.design_dark_default_color_on_background);
        }
    }

    public final String getModuleName() {
        String str = this.A02;
        if (str != null) {
            return str;
        }
        0qQ.A0F("previousModuleName");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        C317866ny r1;
        int A022 = AnonymousClass0fD.A02(1407312940);
        K3Q.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("args_previous_module_name");
        if (string != null) {
            this.A02 = string;
            String string2 = requireArguments.getString("args_avatar_owner_id");
            if (string2 != null) {
                this.A00 = string2;
                String string3 = requireArguments.getString("args_username");
                if (string3 != null) {
                    this.A03 = string3;
                    Serializable serializable = requireArguments.getSerializable("args_surface");
                    if (!(serializable instanceof C317866ny) || (r1 = (C317866ny) serializable) == null) {
                        illegalStateException = AnonymousClass7TE.A0z("surface required");
                        i = 1226063889;
                    } else {
                        this.A04 = r1;
                        this.A01 = requireArguments.getBoolean("args_is_from_mentions_consumption_bottom_sheet");
                        this.A0L = true;
                        this.A0N = false;
                        this.A0O = true;
                        String string4 = getString(2131953461);
                        String str = this.A03;
                        if (str == null) {
                            0qQ.A0F(Dbg.A01());
                            throw AnonymousClass00P.createAndThrow();
                        }
                        this.A0D = String.format(Locale.getDefault(), string4, new Object[]{str});
                        this.A00 = 4;
                        this.A0I = true;
                        AnonymousClass0fD.A09(1906282094, A022);
                        return;
                    }
                } else {
                    illegalStateException = AnonymousClass7TE.A0z("username required");
                    i = -284931250;
                }
            } else {
                illegalStateException = AnonymousClass7TE.A0z("avatar owner id required");
                i = 1826635871;
            }
        } else {
            illegalStateException = AnonymousClass7TE.A0z("previous module required");
            i = -975273047;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }
}
