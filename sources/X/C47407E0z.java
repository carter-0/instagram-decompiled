package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.android.maps.StaticMapView;
import com.instagram.android.R;
import com.instagram.login.twofac.model.TrustedDevice;
import com.instagram.maps.ui.IgStaticMapView;

/* renamed from: X.E0z  reason: case insensitive filesystem */
public final class C47407E0z extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "TwoFacTrustedDevicesBottomSheetFragment";
    public TrustedDevice A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final String getModuleName() {
        return "trusted_devices";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.instagram.login.twofac.model.TrustedDevice} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.instagram.login.twofac.model.TrustedDevice} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: com.instagram.login.twofac.model.TrustedDevice} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r4) {
        /*
            r3 = this;
            r0 = -2057698876(0xffffffff855a01c4, float:-1.0250635E-35)
            int r2 = X.AnonymousClass0fD.A02(r0)
            X.C47407E0z.super.onCreate(r4)
            android.os.Bundle r1 = r3.requireArguments()
            java.lang.String r0 = "trusted_device"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            com.instagram.login.twofac.model.TrustedDevice r0 = (com.instagram.login.twofac.model.TrustedDevice) r0
            if (r0 != 0) goto L_0x001d
            com.instagram.login.twofac.model.TrustedDevice r0 = new com.instagram.login.twofac.model.TrustedDevice
            r0.<init>()
        L_0x001d:
            r3.A00 = r0
            r0 = -10659869(0xffffffffff5d57e3, float:-2.9421572E38)
            X.AnonymousClass0fD.A09(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47407E0z.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String A03;
        int A02 = AnonymousClass0fD.A02(1615699175);
        0qQ.A0B(layoutInflater, 0);
        View A0A = DbU.A0A(layoutInflater, viewGroup, R.layout.two_fac_trusted_devices_map_bottom_sheet, false);
        IgStaticMapView igStaticMapView = (IgStaticMapView) A0A.requireViewById(R.id.trusted_device_map_view);
        igStaticMapView.setEnabled(true);
        igStaticMapView.A07 = C69419Nl1.TOP_LEFT;
        StaticMapView.StaticMapOptions staticMapOptions = new StaticMapView.StaticMapOptions("review_suspicious_login_map");
        TrustedDevice trustedDevice = this.A00;
        if (trustedDevice != null) {
            staticMapOptions.A02(trustedDevice.A00, trustedDevice.A01);
            TrustedDevice trustedDevice2 = this.A00;
            if (trustedDevice2 != null) {
                staticMapOptions.A01(trustedDevice2.A00 + 0.0275d, trustedDevice2.A01);
                staticMapOptions.A03(11);
                igStaticMapView.setMapOptions(staticMapOptions);
                TextView A0G = DbU.A0G(A0A, R.id.trusted_device_map_platform);
                TrustedDevice trustedDevice3 = this.A00;
                if (trustedDevice3 != null) {
                    A0G.setText(trustedDevice3.A05);
                    TextView A0R = AnonymousClass7TG.A0R(A0A, R.id.trusted_device_map_time);
                    TrustedDevice trustedDevice4 = this.A00;
                    if (trustedDevice4 != null) {
                        if (trustedDevice4.A09) {
                            DbT.A17(requireContext(), A0R, 2Yu.A0H(A0A.getContext(), R.attr.igds_color_success));
                        }
                        TrustedDevice trustedDevice5 = this.A00;
                        if (trustedDevice5 != null) {
                            if (trustedDevice5.A09) {
                                A03 = AnonymousClass7TF.A0d(DbV.A05(this), 2131975780);
                            } else {
                                Context requireContext = requireContext();
                                TrustedDevice trustedDevice6 = this.A00;
                                if (trustedDevice6 != null) {
                                    A03 = 1G0.A03(requireContext, (double) trustedDevice6.A02);
                                }
                            }
                            A0R.setText(A03);
                            String A0d = AnonymousClass7TF.A0d(DbV.A05(this), 2131961000);
                            TrustedDevice trustedDevice7 = this.A00;
                            if (trustedDevice7 != null) {
                                DbX.A1E(A0A, 002.A0R(A0d, trustedDevice7.A07), R.id.trusted_device_map_location);
                                FP3.A00(A0A.requireViewById(R.id.trusted_device_map_remove_button), 58, this);
                                AnonymousClass0fD.A09(841007472, A02);
                                return A0A;
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F("trustedDevice");
        throw AnonymousClass00P.createAndThrow();
    }
}
