package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebookpay.addresstypeahead.repositoryimpl.AddressTypeaheadRepositoryImpl;
import com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl;
import com.facebookpay.offsite.repositoriesimpl.OffsitePaymentRepositoryImpl;
import com.instagram.android.R;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.SOm  reason: case insensitive filesystem */
public final class C11353SOm {
    public final AddressTypeaheadRepositoryImpl A00;
    public final C12404Std A01;
    public final C10252RpC A02;
    public final C12411Sto A03;
    public final C12411Sto A04;
    public final S1J A05;
    public final C10883Rzj A06;
    public final SNY A07;
    public final ECPRepositoryImpl A08 = new ECPRepositoryImpl();
    public final C10884Rzk A09;
    public final C10254RpE A0A;
    public final 2FO A0B;
    public final OffsitePaymentRepositoryImpl A0C;
    public final Stc A0D;
    public final SIP A0E = new SIP();
    public final Stb A0F;
    public final S4L A0G;
    public final String A0H;
    public final AnonymousClass0eK A0I;
    public final Context A0J;
    public final S1J A0K;
    public final AnonymousClass0eK A0L;
    public final AnonymousClass0eK A0M;

    public final Fragment A03(Bundle bundle, String str) {
        0qQ.A0B(str, 0);
        Fragment A012 = ((C10987S3z) this.A0L.get()).A01(bundle, str);
        0qQ.A07(A012);
        return A012;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.Rzk, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v7, types: [com.facebookpay.offsite.repositoriesimpl.OffsitePaymentRepositoryImpl, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v9, types: [X.Rzj, java.lang.Object] */
    public C11353SOm(Context context, C12411Sto sto, S1J s1j, 2FO r5, String str, AnonymousClass0eK r7, AnonymousClass0eK r8, AnonymousClass0eK r9) {
        this.A0J = context;
        this.A0L = r7;
        this.A0M = r8;
        this.A03 = sto;
        this.A0K = s1j;
        this.A0B = r5;
        this.A0H = str;
        this.A0I = r9;
        this.A01 = new C12404Std(context);
        this.A0F = new Stb();
        this.A0G = new S4L();
        this.A0D = new Stc(context);
        this.A09 = new Object();
        this.A0C = new Object();
        this.A07 = new SNY(context);
        this.A06 = new Object();
        this.A00 = new AddressTypeaheadRepositoryImpl();
        this.A0A = new C10254RpE();
        this.A02 = new C10252RpC();
        this.A04 = sto;
        this.A05 = s1j;
    }

    public static C12411Sto A00() {
        return AnonymousClass2E0.A01().A03;
    }

    public static ECPRepositoryImpl A01() {
        return AnonymousClass2E0.A01().A08;
    }

    public final View A02(Context context, ViewGroup viewGroup, RH6 rh6) {
        int i;
        AnonymousClass7TG.A1N(context, rh6);
        this.A0M.get();
        LayoutInflater from = LayoutInflater.from(context);
        0qQ.A07(from);
        switch (rh6.ordinal()) {
            case 0:
                i = R.layout.ecp_pux_banner;
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 10:
            case 11:
            case 27:
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case Seq.RefTracker.REF_OFFSET /*42*/:
            case 49:
                i = R.layout.ecp_pux_list_cell;
                break;
            case 6:
                i = R.layout.ecp_pux_list_cell_entity;
                break;
            case 8:
                i = R.layout.ecp_pux_price_table;
                break;
            case 9:
                i = R.layout.ecp_disclaimer;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 23:
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                i = R.layout.ecp_accordion_view;
                break;
            case 24:
                i = R.layout.fbpay_button;
                break;
            case 25:
                i = R.layout.ecp_progress_icon_button;
                break;
            case 26:
                i = R.layout.ecp_auto_advance_button;
                break;
            case 37:
                i = R.layout.ecp_confirmation_payment_section_view;
                break;
            case 38:
                i = R.layout.ecp_confirmation_product_upsell_section_header_view;
                break;
            case 39:
                i = R.layout.ecp_confirmation_product_upsell_view;
                break;
            case 40:
                i = R.layout.ecp_anon_checkout_pux_link;
                break;
            case Seq.NULL_REFNUM /*41*/:
                i = R.layout.ecp_anon_checkout_toggle_shimmer;
                break;
            case 43:
                i = R.layout.ecp_inline_action_menu;
                break;
            case 45:
                i = R.layout.ecp_inline_back_button;
                break;
            case 46:
                i = R.layout.ecp_apm_view;
                break;
            case 47:
                i = R.layout.ecp_email_optin;
                break;
            case 48:
                i = R.layout.ecp_invisible_header;
                break;
            case 51:
                i = R.layout.ecp_incentive_inline_view;
                break;
            case 52:
                i = R.layout.ecp_checkout_optionality;
                break;
            default:
                throw C51973G9u.A0g(rh6, "{ECPWidgetFactory} Widget is not found for identifier => ", AnonymousClass7TE.A1A());
        }
        return DbT.A0D(from, viewGroup, i, false);
    }
}
